package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class client extends class133 {

    @ObfuscatedName("client.e")
    public static boolean field502 = true;

    @ObfuscatedName("client.h")
    public static int field238 = 1;

    @ObfuscatedName("client.p")
    public static int field239 = 0;

    @ObfuscatedName("client.i")
    public static int field241 = 0;

    @ObfuscatedName("client.k")
    public static boolean field243 = false;

    @ObfuscatedName("client.q")
    public static boolean field244 = false;

    @ObfuscatedName("client.b")
    public static int field245 = 0;

    @ObfuscatedName("client.w")
    public static class209[] field441 = new class209[4];

    @ObfuscatedName("client.s")
    public static int field411 = 0;

    @ObfuscatedName("client.c")
    public static boolean field247 = true;

    @ObfuscatedName("client.r")
    public static int field348 = 0;

    @ObfuscatedName("client.f")
    public static long field275 = 1L;

    @ObfuscatedName("client.o")
    public static int field250 = -1;

    @ObfuscatedName("client.z")
    public static int field251 = -1;

    @ObfuscatedName("client.d")
    public static int field252 = -1;

    @ObfuscatedName("client.a")
    public static boolean field253 = true;

    @ObfuscatedName("client.n")
    public static boolean field254 = false;

    @ObfuscatedName("client.ae")
    public static int field255 = 0;

    @ObfuscatedName("client.ay")
    public static int field405 = 0;

    @ObfuscatedName("client.ac")
    public static int field458 = 0;

    @ObfuscatedName("client.ag")
    public static int field258 = 0;

    @ObfuscatedName("client.am")
    public static int field259 = 0;

    @ObfuscatedName("client.au")
    public static int field260 = 0;

    @ObfuscatedName("client.ai")
    public static int field261 = 0;

    @ObfuscatedName("client.ab")
    public static int field393 = 0;

    @ObfuscatedName("client.az")
    public static int field263 = 0;

    @ObfuscatedName("client.as")
    public static class108 field264 = new class108(new byte[5000]);

    @ObfuscatedName("client.ar")
    public static class18 field265 = class18.field514;

    @ObfuscatedName("client.ap")
    public static int field266 = 0;

    @ObfuscatedName("client.av")
    public static int field267 = 0;

    @ObfuscatedName("client.al")
    public static int field268 = 0;

    @ObfuscatedName("client.bx")
    public static int field438 = 0;

    @ObfuscatedName("client.ba")
    public static int field431 = 0;

    @ObfuscatedName("client.bl")
    public static int field262 = 0;

    @ObfuscatedName("client.bd")
    public static int field273 = 0;

    @ObfuscatedName("client.bz")
    public static int field274 = 0;

    @ObfuscatedName("client.bm")
    public static class31[] field276 = new class31[32768];

    @ObfuscatedName("client.bi")
    public static int field277 = 0;

    @ObfuscatedName("client.bc")
    public static int[] field298 = new int[32768];

    @ObfuscatedName("client.cm")
    public static class111 field279 = new class111(5000);

    @ObfuscatedName("client.ct")
    public static class111 field440 = new class111(5000);

    @ObfuscatedName("client.ch")
    public static class111 field281 = new class111(5000);

    @ObfuscatedName("client.cf")
    public static int field446 = 0;

    @ObfuscatedName("client.ci")
    public static int field283 = 0;

    @ObfuscatedName("client.cw")
    public static int field284 = 0;

    @ObfuscatedName("client.cp")
    public static int field246 = 0;

    @ObfuscatedName("client.cl")
    public static int field286 = 0;

    @ObfuscatedName("client.cc")
    public static int field363 = 0;

    @ObfuscatedName("client.cg")
    public static int field307 = 0;

    @ObfuscatedName("client.ce")
    public static int field289 = 0;

    @ObfuscatedName("client.cv")
    public static boolean field421 = false;

    @ObfuscatedName("client.cy")
    public static int field291 = 0;

    @ObfuscatedName("client.co")
    public static int field292 = 0;

    @ObfuscatedName("client.db")
    public static int field293 = 1;

    @ObfuscatedName("client.da")
    public static int field468 = 0;

    @ObfuscatedName("client.dq")
    public static int field386 = 1;

    @ObfuscatedName("client.dm")
    public static int field336 = 0;

    @ObfuscatedName("client.dj")
    public static boolean field256 = false;

    @ObfuscatedName("client.dx")
    public static int[][][] field391 = new int[4][13][13];

    @ObfuscatedName("client.de")
    public static final int[] field471 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dw")
    public static int field301 = 0;

    @ObfuscatedName("client.dt")
    public static int field296 = 2;

    @ObfuscatedName("client.ds")
    public static int field303 = 0;

    @ObfuscatedName("client.dd")
    public static int field304 = 2;

    @ObfuscatedName("client.dg")
    public static int field410 = 0;

    @ObfuscatedName("client.dc")
    public static int field306 = 1;

    @ObfuscatedName("client.di")
    public static int field369 = 0;

    @ObfuscatedName("client.dy")
    public static int field321 = 0;

    @ObfuscatedName("client.dl")
    public static int field309 = 2;

    @ObfuscatedName("client.dn")
    public static int field310 = 0;

    @ObfuscatedName("client.ew")
    public static int field311 = 1;

    @ObfuscatedName("client.el")
    public static int field322 = 0;

    @ObfuscatedName("client.eb")
    public static int field313 = 0;

    @ObfuscatedName("client.eh")
    public static int field372 = 2301979;

    @ObfuscatedName("client.ek")
    public static int field427 = 5063219;

    @ObfuscatedName("client.eq")
    public static int field364 = 3353893;

    @ObfuscatedName("client.et")
    public static int field318 = 7759444;

    @ObfuscatedName("client.ev")
    public static boolean field319 = false;

    @ObfuscatedName("client.fx")
    public static int field317 = 0;

    @ObfuscatedName("client.fg")
    public static int field271 = 128;

    @ObfuscatedName("client.fe")
    public static int field404 = 0;

    @ObfuscatedName("client.fj")
    public static int field323 = 0;

    @ObfuscatedName("client.fn")
    public static int field324 = 0;

    @ObfuscatedName("client.ff")
    public static int field325 = 0;

    @ObfuscatedName("client.fl")
    public static int field326 = 0;

    @ObfuscatedName("client.fu")
    public static int field327 = 0;

    @ObfuscatedName("client.fi")
    public static boolean field290 = false;

    @ObfuscatedName("client.fs")
    public static int field500 = 0;

    @ObfuscatedName("client.fo")
    public static int field330 = 0;

    @ObfuscatedName("client.fw")
    public static int field331 = 50;

    @ObfuscatedName("client.fh")
    public static int[] field332 = new int[field331];

    @ObfuscatedName("client.fd")
    public static int[] field333 = new int[field331];

    @ObfuscatedName("client.fv")
    public static int[] field344 = new int[field331];

    @ObfuscatedName("client.fb")
    public static int[] field335 = new int[field331];

    @ObfuscatedName("client.fr")
    public static int[] field434 = new int[field331];

    @ObfuscatedName("client.fp")
    public static int[] field337 = new int[field331];

    @ObfuscatedName("client.fm")
    public static int[] field338 = new int[field331];

    @ObfuscatedName("client.gh")
    public static String[] field342 = new String[field331];

    @ObfuscatedName("client.gp")
    public static int[][] field340 = new int[104][104];

    @ObfuscatedName("client.ga")
    public static int field341 = 0;

    @ObfuscatedName("client.go")
    public static int field329 = -1;

    @ObfuscatedName("client.gx")
    public static int field343 = -1;

    @ObfuscatedName("client.gm")
    public static int field352 = 0;

    @ObfuscatedName("client.gs")
    public static int field345 = 0;

    @ObfuscatedName("client.gc")
    public static int field346 = 0;

    @ObfuscatedName("client.gd")
    public static int field455 = 0;

    @ObfuscatedName("client.gk")
    public static int field349 = 0;

    @ObfuscatedName("client.gy")
    public static int field350 = 0;

    @ObfuscatedName("client.gq")
    public static int field351 = 0;

    @ObfuscatedName("client.gg")
    public static int field297 = 0;

    @ObfuscatedName("client.gi")
    public static int field353 = 0;

    @ObfuscatedName("client.gw")
    public static int field354 = 0;

    @ObfuscatedName("client.gz")
    public static boolean field355 = false;

    @ObfuscatedName("client.gj")
    public static int field356 = 0;

    @ObfuscatedName("client.gt")
    public static int field357 = 0;

    @ObfuscatedName("client.ge")
    public static class3[] field358 = new class3[2048];

    @ObfuscatedName("client.gl")
    public static int field359 = 0;

    @ObfuscatedName("client.gb")
    public static int[] field360 = new int[2048];

    @ObfuscatedName("client.hq")
    public static int field361 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field362 = new int[2048];

    @ObfuscatedName("client.hv")
    public static class108[] field400 = new class108[2048];

    @ObfuscatedName("client.hm")
    public static int field280 = -1;

    @ObfuscatedName("client.ho")
    public static int field365 = 0;

    @ObfuscatedName("client.hn")
    public static int field236 = 0;

    @ObfuscatedName("client.hl")
    public static int[] field367 = new int[1000];

    @ObfuscatedName("client.hg")
    public static final int[] field288 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ha")
    public static String[] field497 = new String[8];

    @ObfuscatedName("client.hj")
    public static boolean[] field249 = new boolean[8];

    @ObfuscatedName("client.hk")
    public static int[] field371 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hh")
    public static int field300 = -1;

    @ObfuscatedName("client.hs")
    public static class180[][][] field373 = new class180[4][104][104];

    @ObfuscatedName("client.hb")
    public static class180 field374 = new class180();

    @ObfuscatedName("client.hy")
    public static class180 field375 = new class180();

    @ObfuscatedName("client.hd")
    public static class180 field376 = new class180();

    @ObfuscatedName("client.hz")
    public static int[] field377 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field378 = new int[25];

    @ObfuscatedName("client.ht")
    public static int[] field379 = new int[25];

    @ObfuscatedName("client.he")
    public static int field395 = 0;

    @ObfuscatedName("client.hc")
    public static boolean field381 = false;

    @ObfuscatedName("client.in")
    public static int field478 = 0;

    @ObfuscatedName("client.ii")
    public static int[] field383 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field384 = new int[500];

    @ObfuscatedName("client.ic")
    public static int[] field385 = new int[500];

    @ObfuscatedName("client.ig")
    public static int[] field312 = new int[500];

    @ObfuscatedName("client.ij")
    public static String[] field387 = new String[500];

    @ObfuscatedName("client.ia")
    public static String[] field388 = new String[500];

    @ObfuscatedName("client.ib")
    public static int field389 = -1;

    @ObfuscatedName("client.ih")
    public static int field390 = -1;

    @ObfuscatedName("client.ie")
    public static int field467 = 0;

    @ObfuscatedName("client.iy")
    public static int field392 = 50;

    @ObfuscatedName("client.is")
    public static int field482 = 0;

    @ObfuscatedName("client.it")
    public static String field394 = null;

    @ObfuscatedName("client.ip")
    public static boolean field412 = false;

    @ObfuscatedName("client.if")
    public static int field413 = -1;

    @ObfuscatedName("client.io")
    public static int field397 = -1;

    @ObfuscatedName("client.jz")
    public static String field398 = null;

    @ObfuscatedName("client.jb")
    public static String field399 = null;

    @ObfuscatedName("client.jf")
    public static int field302 = -1;

    @ObfuscatedName("client.jy")
    public static class177 field396 = new class177(8);

    @ObfuscatedName("client.jq")
    public static int field402 = 0;

    @ObfuscatedName("client.jp")
    public static int field403 = 0;

    @ObfuscatedName("client.jt")
    public static class155 field424 = null;

    @ObfuscatedName("client.jw")
    public static int field425 = 0;

    @ObfuscatedName("client.jm")
    public static int field406 = 0;

    @ObfuscatedName("client.jc")
    public static int field407 = 0;

    @ObfuscatedName("client.jd")
    public static int field437 = -1;

    @ObfuscatedName("client.ju")
    public static boolean field409 = false;

    @ObfuscatedName("client.ja")
    public static boolean field493 = false;

    @ObfuscatedName("client.js")
    public static boolean field429 = false;

    @ObfuscatedName("client.jo")
    public static class155 field305 = null;

    @ObfuscatedName("client.jx")
    public static class155 field433 = null;

    @ObfuscatedName("client.jv")
    public static int field414 = 0;

    @ObfuscatedName("client.jg")
    public static int field415 = 0;

    @ObfuscatedName("client.ji")
    public static class155 field416 = null;

    @ObfuscatedName("client.jk")
    public static boolean field417 = false;

    @ObfuscatedName("client.jh")
    public static int field287 = -1;

    @ObfuscatedName("client.jl")
    public static int field366 = -1;

    @ObfuscatedName("client.jr")
    public static boolean field420 = false;

    @ObfuscatedName("client.je")
    public static int field401 = -1;

    @ObfuscatedName("client.jn")
    public static int field422 = -1;

    @ObfuscatedName("client.kz")
    public static boolean field423 = false;

    @ObfuscatedName("client.kf")
    public static int field272 = 1;

    @ObfuscatedName("client.kt")
    public static int[] field282 = new int[32];

    @ObfuscatedName("client.kg")
    public static int field426 = 0;

    @ObfuscatedName("client.kw")
    public static int[] field314 = new int[32];

    @ObfuscatedName("client.kp")
    public static int field428 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field315 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field430 = 0;

    @ObfuscatedName("client.kv")
    public static int field235 = 0;

    @ObfuscatedName("client.ka")
    public static int field432 = 0;

    @ObfuscatedName("client.kr")
    public static int field328 = 0;

    @ObfuscatedName("client.kn")
    public static int field453 = 0;

    @ObfuscatedName("client.kq")
    public static int field308 = 0;

    @ObfuscatedName("client.kb")
    public static int field436 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field454 = new int[2000];

    @ObfuscatedName("client.kk")
    public static String[] field480 = new String[1000];

    @ObfuscatedName("client.kd")
    public static int field269 = 0;

    @ObfuscatedName("client.ko")
    public static class180 field419 = new class180();

    @ObfuscatedName("client.kh")
    public static class180 field299 = new class180();

    @ObfuscatedName("client.ln")
    public static class180 field442 = new class180();

    @ObfuscatedName("client.lw")
    public static class177 field443 = new class177(512);

    @ObfuscatedName("client.lt")
    public static int field444 = 0;

    @ObfuscatedName("client.lk")
    public static int field445 = -2;

    @ObfuscatedName("client.lp")
    public static boolean[] field248 = new boolean[100];

    @ObfuscatedName("client.la")
    public static boolean[] field447 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static boolean[] field448 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static int[] field466 = new int[100];

    @ObfuscatedName("client.ly")
    public static int[] field450 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field451 = new int[100];

    @ObfuscatedName("client.lx")
    public static int[] field452 = new int[100];

    @ObfuscatedName("client.lj")
    public static int field316 = 0;

    @ObfuscatedName("client.lf")
    public static int[] field270 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lu")
    public static int field418 = 0;

    @ObfuscatedName("client.lz")
    public static int field456 = 0;

    @ObfuscatedName("client.le")
    public static String field457 = "";

    @ObfuscatedName("client.lm")
    public static long[] field439 = new long[100];

    @ObfuscatedName("client.lc")
    public static int field459 = 0;

    @ObfuscatedName("client.lq")
    public static int field460 = 0;

    @ObfuscatedName("client.ll")
    public static int[] field461 = new int[128];

    @ObfuscatedName("client.lr")
    public static int[] field462 = new int[128];

    @ObfuscatedName("client.lh")
    public static long field435 = -1L;

    @ObfuscatedName("client.mv")
    public static String field464 = null;

    @ObfuscatedName("client.mq")
    public static String field465 = null;

    @ObfuscatedName("client.mu")
    public static int field278 = -1;

    @ObfuscatedName("client.mt")
    public static int field257 = 0;

    @ObfuscatedName("client.mf")
    public static int[] field334 = new int[1000];

    @ObfuscatedName("client.ms")
    public static int[] field469 = new int[1000];

    @ObfuscatedName("client.mm")
    public static class73[] field470 = new class73[1000];

    @ObfuscatedName("client.mj")
    public static int field370 = 0;

    @ObfuscatedName("client.me")
    public static int field472 = 0;

    @ObfuscatedName("client.mb")
    public static int field237 = 0;

    @ObfuscatedName("client.mc")
    public static int field294 = 255;

    @ObfuscatedName("client.mn")
    public static int field476 = -1;

    @ObfuscatedName("client.mx")
    public static boolean field477 = false;

    @ObfuscatedName("client.mi")
    public static int field475 = 127;

    @ObfuscatedName("client.mo")
    public static int field479 = 127;

    @ObfuscatedName("client.na")
    public static int field320 = 0;

    @ObfuscatedName("client.nn")
    public static int[] field481 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field295 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field483 = new int[50];

    @ObfuscatedName("client.nk")
    public static int[] field484 = new int[50];

    @ObfuscatedName("client.ne")
    public static class53[] field485 = new class53[50];

    @ObfuscatedName("client.nr")
    public static boolean field486 = false;

    @ObfuscatedName("client.nh")
    public static boolean[] field487 = new boolean[5];

    @ObfuscatedName("client.nd")
    public static int[] field488 = new int[5];

    @ObfuscatedName("client.nv")
    public static int[] field489 = new int[5];

    @ObfuscatedName("client.ok")
    public static int[] field490 = new int[5];

    @ObfuscatedName("client.om")
    public static int[] field491 = new int[5];

    @ObfuscatedName("client.os")
    public static int field492 = 0;

    @ObfuscatedName("client.oo")
    public static int field474 = 0;

    @ObfuscatedName("client.oe")
    public static class16[] field494 = new class16[400];

    @ObfuscatedName("client.ow")
    public static class176 field495 = new class176();

    @ObfuscatedName("client.oi")
    public static int field496 = 0;

    @ObfuscatedName("client.od")
    public static class8[] field463 = new class8[400];

    @ObfuscatedName("client.oq")
    public static class160 field498 = new class160();

    @ObfuscatedName("client.oa")
    public static int field499 = -1;

    @ObfuscatedName("client.oc")
    public static int field408 = -1;

    @ObfuscatedName("client.ou")
    public static class201[] field501 = new class201[6];

    @ObfuscatedName("client.h(B)V")
    public final void method157() {
    }

    public final void init() {
        if (!this.method2620()) {
            return;
        }
        class171[] var1 = new class171[] { class171.field2832, class171.field2825, class171.field2831, class171.field2824, class171.field2829, class171.field2833, class171.field2827, class171.field2830, class171.field2828, class171.field2826 };
        class171[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class171 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2823);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2823)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class2.field20)) {
                        }
                        break;
                    case 2:
                        field238 = Integer.parseInt(var5);
                        break;
                    case 3:
                        if (var5.equalsIgnoreCase(class2.field20)) {
                            field243 = true;
                        } else {
                            field243 = false;
                        }
                        break;
                    case 4:
                        int var7 = Integer.parseInt(var5);
                        class141[] var8 = class141.method1889();
                        int var9 = 0;
                        class141 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class141 var10 = var8[var9];
                            if (var10.field2124 == var7) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field240 = var11;
                        break;
                    case 5:
                        Statics.field11 = var5;
                        break;
                    case 6:
                        field239 = Integer.parseInt(var5);
                        break;
                    case 7:
                        field245 = Integer.parseInt(var5);
                    case 8:
                    default:
                        break;
                    case 9:
                        field241 = Integer.parseInt(var5);
                        break;
                    case 10:
                        class142[] var6 = new class142[] { class142.field2137, class142.field2133, class142.field2132, class142.field2138, class142.field2129, class142.field2130 };
                        Statics.field242 = (class142) class100.method1790(var6, Integer.parseInt(var5));
                        if (Statics.field242 == class142.field2129) {
                            Statics.field1901 = class193.field2904;
                        } else {
                            Statics.field1901 = class193.field2897;
                        }
                }
            }
        }
        method3398();
        Statics.field185 = this.getCodeBase().getHost();
        String var12 = Statics.field240.field2120;
        byte var13 = 0;
        try {
            Statics.field803 = 16;
            Statics.field1908 = var13;
            try {
                Statics.field636 = System.getProperty("os.name");
            } catch (Exception var58) {
                Statics.field636 = "Unknown";
            }
            Statics.field620 = Statics.field636.toLowerCase();
            try {
                Statics.field2413 = System.getProperty("user.home");
                if (Statics.field2413 != null) {
                    Statics.field2413 = Statics.field2413 + "/";
                }
            } catch (Exception var57) {
            }
            try {
                if (Statics.field620.startsWith("win")) {
                    if (Statics.field2413 == null) {
                        Statics.field2413 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2413 == null) {
                    Statics.field2413 = System.getenv("HOME");
                }
                if (Statics.field2413 != null) {
                    Statics.field2413 = Statics.field2413 + "/";
                }
            } catch (Exception var56) {
            }
            if (Statics.field2413 == null) {
                Statics.field2413 = "~/";
            }
            Statics.field1856 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2413, "/tmp/", "" };
            Statics.field2153 = new String[] { ".jagex_cache_" + Statics.field1908, ".file_store_" + Statics.field1908 };
            int var17 = 0;
            label257: while (var17 < 4) {
                String var18 = var17 == 0 ? "" : "" + var17;
                Statics.field2084 = new File(Statics.field2413, "jagex_cl_oldschool_" + var12 + var18 + ".dat");
                String var19 = null;
                String var20 = null;
                boolean var21 = false;
                if (Statics.field2084.exists()) {
                    try {
                        class207 var22 = new class207(Statics.field2084, "rw", 10000L);
                        class108 var23 = new class108((int) var22.method3561());
                        while (var23.field1841 < var23.field1839.length) {
                            int var24 = var22.method3562(var23.field1839, var23.field1841, var23.field1839.length - var23.field1841);
                            if (var24 == -1) {
                                throw new IOException();
                            }
                            var23.field1841 += var24;
                        }
                        var23.field1841 = 0;
                        int var25 = var23.method2299();
                        if (var25 < 1 || var25 > 3) {
                            throw new IOException("" + var25);
                        }
                        int var26 = 0;
                        if (var25 > 1) {
                            var26 = var23.method2299();
                        }
                        if (var25 <= 2) {
                            var19 = var23.method2136();
                            if (var26 == 1) {
                                var20 = var23.method2136();
                            }
                        } else {
                            var19 = var23.method2278();
                            if (var26 == 1) {
                                var20 = var23.method2278();
                            }
                        }
                        var22.method3560();
                    } catch (IOException var60) {
                        var60.printStackTrace();
                    }
                    if (var19 != null) {
                        File var28 = new File(var19);
                        if (!var28.exists()) {
                            var19 = null;
                        }
                    }
                    if (var19 != null) {
                        File var29 = new File(var19, "test.dat");
                        if (!class138.method2691(var29, true)) {
                            var19 = null;
                        }
                    }
                }
                if (var19 == null && var17 == 0) {
                    label232: for (int var30 = 0; var30 < Statics.field2153.length; var30++) {
                        for (int var31 = 0; var31 < Statics.field1856.length; var31++) {
                            File var32 = new File(Statics.field1856[var31] + Statics.field2153[var30] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var32.exists() && class138.method2691(new File(var32, "test.dat"), true)) {
                                var19 = var32.toString();
                                var21 = true;
                                break label232;
                            }
                        }
                    }
                }
                if (var19 == null) {
                    var19 = Statics.field2413 + File.separatorChar + "jagexcache" + var18 + File.separatorChar + "oldschool" + File.separatorChar + var12 + File.separatorChar;
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
                    } catch (Exception var59) {
                        var59.printStackTrace();
                    }
                    var21 = true;
                }
                if (var21) {
                    File var42 = new File(var19);
                    Object var43 = null;
                    try {
                        class207 var44 = new class207(Statics.field2084, "rw", 10000L);
                        class108 var45 = new class108(500);
                        var45.method2113(3);
                        var45.method2113(var43 == null ? 0 : 1);
                        var45.method2120(var42.getPath());
                        if (var43 != null) {
                            var45.method2120(((File) var43).getPath());
                        }
                        var44.method3559(var45.field1839, 0, var45.field1841);
                        var44.method3560();
                    } catch (IOException var55) {
                        var55.printStackTrace();
                    }
                }
                File var47 = new File(var19);
                Statics.field2086 = var47;
                if (!Statics.field2086.exists()) {
                    Statics.field2086.mkdirs();
                }
                File[] var48 = Statics.field2086.listFiles();
                if (var48 == null) {
                    break;
                }
                File[] var49 = var48;
                int var50 = 0;
                while (true) {
                    if (var50 >= var49.length) {
                        break label257;
                    }
                    File var51 = var49[var50];
                    if (!class138.method2691(var51, false)) {
                        var17++;
                        break;
                    }
                    var50++;
                }
            }
            File var52 = Statics.field2086;
            Statics.field1939 = var52;
            if (!Statics.field1939.exists()) {
                throw new RuntimeException("");
            }
            class124.field1938 = true;
            Statics.method2438();
            class138.field2090 = new class208(new class207(class124.method2399("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class138.field2091 = new class208(new class207(class124.method2399("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2025 = new class208[Statics.field803];
            for (int var53 = 0; var53 < Statics.field803; var53++) {
                Statics.field2025[var53] = new class208(new class207(class124.method2399("main_file_cache.idx" + var53), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var61) {
            class137.method483((String) null, var61);
        }
        Statics.field347 = this;
        this.method2619(765, 503, 70);
    }

    @ObfuscatedName("gn.j(I)V")
    public static final void method3398() {
        class80.field1369 = false;
        field244 = false;
    }

    @ObfuscatedName("client.i(B)V")
    public final void method160() {
        Statics.field1919 = field241 == 0 ? 43594 : field238 + 40000;
        Statics.field2706 = field241 == 0 ? 443 : field238 + 50000;
        Statics.field2476 = Statics.field1919;
        Statics.field2688 = class156.field2665;
        Statics.field1902 = class156.field2664;
        Statics.field506 = class156.field2669;
        Statics.field2691 = class156.field2666;
        class126.method122();
        Canvas var1 = Statics.field1929;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class126.field1972);
        var1.addFocusListener(class126.field1972);
        class129.method2063(Statics.field1929);
        Statics.field2140 = class120.method2077();
        if (Statics.field2140 != null) {
            Statics.field2140.method2459(Statics.field1929);
        }
        Statics.field66 = new class123(255, class138.field2090, class138.field2091, 500000);
        class207 var2 = null;
        class9 var3 = new class9();
        try {
            var2 = class138.method603("", Statics.field242.field2134, false);
            byte[] var4 = new byte[(int) var2.method3561()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method3562(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class9(new class108(var4));
        } catch (Exception var11) {
        }
        try {
            if (var2 != null) {
                var2.method3560();
            }
        } catch (Exception var10) {
        }
        Statics.field140 = var3;
        Statics.field172 = this.getToolkit().getSystemClipboard();
        class127.method784(this, Statics.field702);
        if (field241 != 0) {
            field254 = true;
        }
    }

    @ObfuscatedName("client.u(I)V")
    public final void method161() {
        field348++;
        this.method164();
        class152.method1395();
        class164.method2407();
        method518();
        class126 var1 = class126.field1972;
        synchronized (class126.field1972) {
            class126.field1977++;
            class126.field1974 = class126.field1976;
            class126.field1973 = 0;
            if (class126.field1970 >= 0) {
                while (class126.field1970 != class126.field1968) {
                    int var3 = class126.field1982[class126.field1968];
                    class126.field1968 = class126.field1968 + 1 & 0x7F;
                    if (var3 < 0) {
                        class126.field1966[~var3] = false;
                    } else {
                        if (!class126.field1966[var3] && class126.field1973 < class126.field1971.length - 1) {
                            class126.field1971[++class126.field1973 - 1] = var3;
                        }
                        class126.field1966[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class126.field1966[var2] = false;
                }
                class126.field1970 = class126.field1968;
            }
            class126.field1976 = class126.field1980;
        }
        class129 var5 = class129.field2003;
        synchronized (class129.field2003) {
            class129.field2000 = class129.field1997;
            class129.field2001 = class129.field1998;
            class129.field2002 = class129.field2010;
            class129.field2007 = class129.field1995;
            class129.field2008 = class129.field2012;
            class129.field1999 = class129.field2005;
            class129.field1996 = class129.field2009;
            class129.field1995 = 0;
        }
        if (Statics.field2140 != null) {
            int var7 = Statics.field2140.method2458();
            field269 = var7;
        }
        if (field411 == 0) {
            method920();
            Statics.field2110.method2468();
            for (int var8 = 0; var8 < 32; var8++) {
                field2047[var8] = 0L;
            }
            for (int var9 = 0; var9 < 32; var9++) {
                field2056[var9] = 0L;
            }
            Statics.field1461 = 0;
        } else if (field411 == 5) {
            class29.method1627(this);
            method920();
            Statics.field2110.method2468();
            for (int var10 = 0; var10 < 32; var10++) {
                field2047[var10] = 0L;
            }
            for (int var11 = 0; var11 < 32; var11++) {
                field2056[var11] = 0L;
            }
            Statics.field1461 = 0;
        } else if (field411 == 10 || field411 == 11) {
            class29.method1627(this);
        } else if (field411 == 20) {
            class29.method1627(this);
            method2075();
        } else if (field411 == 25) {
            method1348();
        }
        if (field411 == 30) {
            method137();
        } else if (field411 == 40 || field411 == 45) {
            method2075();
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method326() {
        boolean var1 = class164.method1();
        if (var1 && field477 && Statics.field2914 != null) {
            Statics.field2914.method1030();
        }
        if (field2050) {
            Canvas var2 = Statics.field1929;
            var2.removeKeyListener(class126.field1972);
            var2.removeFocusListener(class126.field1972);
            class126.field1970 = -1;
            Canvas var3 = Statics.field1929;
            var3.removeMouseListener(class129.field2003);
            var3.removeMouseMotionListener(class129.field2003);
            var3.removeFocusListener(class129.field2003);
            class129.field1997 = 0;
            if (Statics.field2140 != null) {
                Statics.field2140.method2448(Statics.field1929);
            }
            this.method2625();
            Canvas var4 = Statics.field1929;
            var4.setFocusTraversalKeysEnabled(false);
            var4.addKeyListener(class126.field1972);
            var4.addFocusListener(class126.field1972);
            class129.method2063(Statics.field1929);
            if (Statics.field2140 != null) {
                Statics.field2140.method2459(Statics.field1929);
            }
        }
        if (field411 == 0) {
            class133.method539(class29.field683, class29.field671, (Color) null);
        } else if (field411 == 5) {
            class29.method2907(Statics.field2774, Statics.field64);
        } else if (field411 == 10 || field411 == 11) {
            class29.method2907(Statics.field2774, Statics.field64);
        } else if (field411 == 20) {
            class29.method2907(Statics.field2774, Statics.field64);
        } else if (field411 == 25) {
            if (field336 == 1) {
                if (field292 > field293) {
                    field293 = field292;
                }
                int var5 = (field293 * 50 - field292 * 50) / field293;
                method2444(class145.field2169 + class2.field18 + class2.field19 + var5 + "%" + class2.field17, false);
            } else if (field336 == 2) {
                if (field468 > field386) {
                    field386 = field468;
                }
                int var6 = (field386 * 50 - field468 * 50) / field386 + 50;
                method2444(class145.field2169 + class2.field18 + class2.field19 + var6 + "%" + class2.field17, false);
            } else {
                method2444(class145.field2169, false);
            }
        } else if (field411 == 30) {
            method493();
        } else if (field411 == 40) {
            method2444(class145.field2170 + class2.field18 + class145.field2171, false);
        } else if (field411 == 45) {
            method2444(class145.field2318, false);
        }
        if (field411 == 30 && field316 == 0 && !field2058) {
            try {
                Graphics var7 = Statics.field1929.getGraphics();
                for (int var8 = 0; var8 < field444; var8++) {
                    if (field447[var8]) {
                        Statics.field60.method1367(var7, field466[var8], field450[var8], field451[var8], field452[var8]);
                        field447[var8] = false;
                    }
                }
            } catch (Exception var14) {
                Statics.field1929.repaint();
            }
        } else if (field411 > 0) {
            try {
                Graphics var10 = Statics.field1929.getGraphics();
                Statics.field60.method1366(var10, 0, 0);
                field2058 = false;
                for (int var11 = 0; var11 < field444; var11++) {
                    field447[var11] = false;
                }
            } catch (Exception var13) {
                Statics.field1929.repaint();
            }
        }
    }

    @ObfuscatedName("client.k(I)V")
    public final void method163() {
        if (Statics.field160 != null) {
            Statics.field160.field177 = false;
        }
        Statics.field160 = null;
        if (Statics.field516 != null) {
            Statics.field516.method2593();
            Statics.field516 = null;
        }
        if (class126.field1972 != null) {
            class126 var1 = class126.field1972;
            synchronized (class126.field1972) {
                class126.field1972 = null;
            }
        }
        if (class129.field2003 != null) {
            class129 var3 = class129.field2003;
            synchronized (class129.field2003) {
                class129.field2003 = null;
            }
        }
        Statics.field2140 = null;
        if (Statics.field2914 != null) {
            Statics.field2914.method1031();
        }
        if (Statics.field1006 != null) {
            Statics.field1006.method1031();
        }
        class153.method686();
        Object var5 = class152.field2499;
        synchronized (class152.field2499) {
            if (class152.field2500 != 0) {
                class152.field2500 = 1;
                try {
                    class152.field2499.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        class138.method154();
    }

    @ObfuscatedName("r.q(II)V")
    public static void method469(int arg0) {
        if (field411 == arg0) {
            return;
        }
        if (field411 == 0) {
            Statics.field801 = null;
            Statics.field2104 = null;
            Statics.field2057 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field431 = 0;
            field262 = 0;
            field273 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1122 != null) {
            Statics.field1122.method2593();
            Statics.field1122 = null;
        }
        if (field411 == 25) {
            field336 = 0;
            field292 = 0;
            field293 = 1;
            field468 = 0;
            field386 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class29.method2436(Statics.field1929, Statics.field2493, Statics.field974, true, 0);
        } else if (arg0 == 20) {
            class29.method2436(Statics.field1929, Statics.field2493, Statics.field974, true, field411 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class29.method2436(Statics.field1929, Statics.field2493, Statics.field974, false, 4);
        } else if (Statics.field1886) {
            Statics.field675 = null;
            Statics.field2031 = null;
            Statics.field657 = null;
            Statics.field2808 = null;
            Statics.field659 = null;
            Statics.field2490 = null;
            Statics.field673 = null;
            Statics.field985 = null;
            Statics.field504 = null;
            Statics.field1925 = null;
            Statics.field1011 = null;
            Statics.field1129 = null;
            Statics.field231 = null;
            Statics.field573 = null;
            Statics.field656 = null;
            Statics.field799 = null;
            Statics.field2835 = null;
            Statics.field662 = null;
            Statics.field1883 = null;
            Statics.field119 = null;
            Statics.field2042 = null;
            Statics.field159 = null;
            class164.method1787(2);
            class153.method123(true);
            Statics.field1886 = false;
        }
        field411 = arg0;
    }

    @ObfuscatedName("client.b(I)V")
    public void method164() {
        if (field411 != 1000) {
            boolean var1 = class153.method516();
            if (!var1) {
                this.method165();
            }
        }
    }

    @ObfuscatedName("client.w(S)V")
    public void method165() {
        if (class153.field2523 >= 4) {
            this.method2630("js5crc");
            field411 = 1000;
            return;
        }
        if (class153.field2520 >= 4) {
            if (field411 <= 5) {
                this.method2630("js5io");
                field411 = 1000;
                return;
            }
            field268 = 3000;
            class153.field2520 = 3;
        }
        if (--field268 + 1 > 0) {
            return;
        }
        try {
            if (field267 == 0) {
                Statics.field139 = Statics.field1891.method2498(Statics.field185, Statics.field2476);
                field267++;
            }
            if (field267 == 1) {
                if (Statics.field139.field2070 == 2) {
                    this.method459(-1);
                    return;
                }
                if (Statics.field139.field2070 == 1) {
                    field267++;
                }
            }
            if (field267 == 2) {
                Statics.field964 = new class132((Socket) Statics.field139.field2067, Statics.field1891);
                class108 var1 = new class108(5);
                var1.method2113(15);
                var1.method2233(70);
                Statics.field964.method2601(var1.field1839, 0, 5);
                field267++;
                Statics.field368 = class104.method27();
            }
            if (field267 == 3) {
                if (field411 <= 5 || Statics.field964.method2595() > 0) {
                    int var2 = Statics.field964.method2594();
                    if (var2 != 0) {
                        this.method459(var2);
                        return;
                    }
                    field267++;
                } else if (class104.method27() - Statics.field368 > 30000L) {
                    this.method459(-2);
                    return;
                }
            }
            if (field267 == 4) {
                Statics.method1886(Statics.field964, field411 > 20);
                Statics.field139 = null;
                Statics.field964 = null;
                field267 = 0;
                field438 = 0;
            }
        } catch (IOException var4) {
            this.method459(-3);
        }
    }

    @ObfuscatedName("client.g(IB)V")
    public void method459(int arg0) {
        Statics.field139 = null;
        Statics.field964 = null;
        field267 = 0;
        if (Statics.field2476 == Statics.field1919) {
            Statics.field2476 = Statics.field2706;
        } else {
            Statics.field2476 = Statics.field1919;
        }
        field438++;
        if (field438 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field411 <= 5) {
                this.method2630("js5connect_full");
                field411 = 1000;
            } else {
                field268 = 3000;
            }
        } else if (field438 >= 2 && arg0 == 6) {
            this.method2630("js5connect_outofdate");
            field411 = 1000;
        } else if (field438 >= 4) {
            if (field411 <= 5) {
                this.method2630("js5connect");
                field411 = 1000;
            } else {
                field268 = 3000;
            }
        }
    }

    @ObfuscatedName("aj.s(I)V")
    public static void method920() {
        if (field266 == 0) {
            Statics.field965 = new class80(4, 104, 104, class6.field87);
            for (int var0 = 0; var0 < 4; var0++) {
                field441[var0] = new class209(104, 104);
            }
            Statics.field635 = new class73(512, 512);
            class29.field671 = class145.field2206;
            class29.field683 = 5;
            field266 = 20;
        } else if (field266 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1482[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class80.method1665(var1, 500, 800, 512, 334);
            class29.field671 = class145.field2349;
            class29.field683 = 10;
            field266 = 30;
        } else if (field266 == 30) {
            Statics.field2421 = method2419(0, false, true, true);
            Statics.field990 = method2419(1, false, true, true);
            Statics.field2821 = method2419(2, true, false, true);
            Statics.field2903 = method2419(3, false, true, true);
            Statics.field1499 = method2419(4, false, true, true);
            Statics.field2472 = method2419(5, true, true, true);
            Statics.field2800 = method2419(6, true, true, false);
            Statics.field1451 = method2419(7, false, true, true);
            Statics.field974 = method2419(8, false, true, true);
            Statics.field2131 = method2419(9, false, true, true);
            Statics.field2493 = method2419(10, false, true, true);
            Statics.field1988 = method2419(11, false, true, true);
            Statics.field1991 = method2419(12, false, true, true);
            Statics.field585 = method2419(13, true, false, true);
            Statics.field164 = method2419(14, false, true, false);
            Statics.field1917 = method2419(15, false, true, true);
            class29.field671 = class145.field2374;
            class29.field683 = 20;
            field266 = 40;
        } else if (field266 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2421.method2830() * 4 / 100;
            int var8 = var7 + Statics.field990.method2830() * 4 / 100;
            int var9 = var8 + Statics.field2821.method2830() * 2 / 100;
            int var10 = var9 + Statics.field2903.method2830() * 2 / 100;
            int var11 = var10 + Statics.field1499.method2830() * 6 / 100;
            int var12 = var11 + Statics.field2472.method2830() * 4 / 100;
            int var13 = var12 + Statics.field2800.method2830() * 2 / 100;
            int var14 = var13 + Statics.field1451.method2830() * 60 / 100;
            int var15 = var14 + Statics.field974.method2830() * 2 / 100;
            int var16 = var15 + Statics.field2131.method2830() * 2 / 100;
            int var17 = var16 + Statics.field2493.method2830() * 2 / 100;
            int var18 = var17 + Statics.field1988.method2830() * 2 / 100;
            int var19 = var18 + Statics.field1991.method2830() * 2 / 100;
            int var20 = var19 + Statics.field585.method2830() * 2 / 100;
            int var21 = var20 + Statics.field164.method2830() * 2 / 100;
            int var22 = var21 + Statics.field1917.method2830() * 2 / 100;
            if (var22 == 100) {
                class29.field671 = class145.field2398;
                class29.field683 = 30;
                field266 = 45;
            } else {
                if (var22 != 0) {
                    class29.field671 = class145.field2175 + var22 + "%";
                }
                class29.field683 = 30;
            }
        } else if (field266 == 45) {
            boolean var23 = !field244;
            Statics.field1096 = 22050;
            Statics.field1092 = var23;
            Statics.field2929 = 2;
            class165 var24 = new class165();
            var24.method3059(9, 128);
            Statics.field2914 = class51.method144(Statics.field1891, Statics.field1929, 0, 22050);
            Statics.field2914.method1027(var24);
            class150 var25 = Statics.field1917;
            class150 var26 = Statics.field164;
            class150 var27 = Statics.field1499;
            Statics.field2732 = var25;
            Statics.field2722 = var26;
            Statics.field2723 = var27;
            Statics.field2725 = var24;
            Statics.field1006 = class51.method144(Statics.field1891, Statics.field1929, 1, 2048);
            Statics.field1942 = new class50();
            Statics.field1006.method1027(Statics.field1942);
            Statics.field804 = new class69(22050, Statics.field1096);
            class29.field671 = class145.field2177;
            class29.field683 = 35;
            field266 = 50;
        } else if (field266 == 50) {
            int var28 = 0;
            if (Statics.field64 == null) {
                Statics.field64 = class71.method84(Statics.field974, Statics.field585, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field1578 == null) {
                Statics.field1578 = class71.method84(Statics.field974, Statics.field585, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field2774 == null) {
                Statics.field2774 = class71.method84(Statics.field974, Statics.field585, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class29.field671 = class145.field2178 + var28 * 100 / 3 + "%";
                class29.field683 = 40;
            } else {
                Statics.field2156 = new class148(true);
                class29.field671 = class145.field2179;
                class29.field683 = 40;
                field266 = 60;
            }
        } else if (field266 == 60) {
            int var29 = class29.method664(Statics.field2493, Statics.field974);
            byte var30 = 8;
            if (var29 < var30) {
                class29.field671 = class145.field2180 + var29 * 100 / var30 + "%";
                class29.field683 = 50;
            } else {
                class29.field671 = class145.field2248;
                class29.field683 = 50;
                method469(5);
                field266 = 70;
            }
        } else if (field266 == 70) {
            if (Statics.field2821.method2735()) {
                class42.method1971(Statics.field2821);
                class38.method637(Statics.field2821);
                class150 var32 = Statics.field2821;
                class150 var33 = Statics.field1451;
                Statics.field963 = var32;
                Statics.field2819 = var33;
                Statics.field954 = Statics.field963.method2741(3);
                class150 var34 = Statics.field2821;
                class150 var35 = Statics.field1451;
                boolean var36 = field244;
                Statics.field875 = var34;
                Statics.field851 = var35;
                class37.field854 = var36;
                class150 var37 = Statics.field2821;
                class150 var38 = Statics.field1451;
                Statics.field823 = var37;
                Statics.field806 = var38;
                class150 var39 = Statics.field2821;
                class150 var40 = Statics.field1451;
                boolean var41 = field243;
                class205 var42 = Statics.field64;
                Statics.field1023 = var39;
                Statics.field1034 = var40;
                Statics.field1025 = var41;
                Statics.field798 = Statics.field1023.method2741(10);
                Statics.field988 = var42;
                class150 var43 = Statics.field2821;
                class150 var44 = Statics.field2421;
                class150 var45 = Statics.field990;
                Statics.field2927 = var43;
                Statics.field918 = var44;
                Statics.field914 = var45;
                class40.method1887(Statics.field2821, Statics.field1451);
                class150 var46 = Statics.field2821;
                Statics.field989 = var46;
                class47.method535(Statics.field2821);
                class150 var47 = Statics.field2903;
                class150 var48 = Statics.field1451;
                class150 var49 = Statics.field974;
                class150 var50 = Statics.field585;
                Statics.field2601 = var47;
                Statics.field2626 = var48;
                Statics.field2581 = var49;
                Statics.field2566 = var50;
                Statics.field2533 = new class155[Statics.field2601.method2800()][];
                Statics.field2636 = new boolean[Statics.field2601.method2800()];
                class45.method737(Statics.field2821);
                class44.method785(Statics.field2821);
                class29.field671 = class145.field2163;
                class29.field683 = 60;
                field266 = 80;
            } else {
                class29.field671 = class145.field2182 + Statics.field2821.method2813() + "%";
                class29.field683 = 60;
            }
        } else if (field266 == 80) {
            int var51 = 0;
            if (Statics.field339 == null) {
                Statics.field339 = class71.method32(Statics.field974, "compass", "");
            } else {
                var51++;
            }
            if (Statics.field2409 == null) {
                Statics.field2409 = class71.method32(Statics.field974, "mapedge", "");
            } else {
                var51++;
            }
            if (Statics.field1958 == null) {
                Statics.field1958 = class71.method1353(Statics.field974, "mapscene", "");
            } else {
                var51++;
            }
            if (Statics.field1024 == null) {
                Statics.field1024 = class71.method74(Statics.field974, "mapfunction", "");
            } else {
                var51++;
            }
            if (Statics.field991 == null) {
                Statics.field991 = class71.method74(Statics.field974, "hitmarks", "");
            } else {
                var51++;
            }
            if (Statics.field2930 == null) {
                Statics.field2930 = class71.method74(Statics.field974, "headicons_pk", "");
            } else {
                var51++;
            }
            if (Statics.field2082 == null) {
                Statics.field2082 = class71.method74(Statics.field974, "headicons_prayer", "");
            } else {
                var51++;
            }
            if (Statics.field2027 == null) {
                Statics.field2027 = class71.method74(Statics.field974, "headicons_hint", "");
            } else {
                var51++;
            }
            if (Statics.field131 == null) {
                Statics.field131 = class71.method74(Statics.field974, "mapmarker", "");
            } else {
                var51++;
            }
            if (Statics.field2126 == null) {
                Statics.field2126 = class71.method74(Statics.field974, "cross", "");
            } else {
                var51++;
            }
            if (Statics.field51 == null) {
                Statics.field51 = class71.method74(Statics.field974, "mapdots", "");
            } else {
                var51++;
            }
            if (Statics.field570 == null) {
                Statics.field570 = class71.method1353(Statics.field974, "scrollbar", "");
            } else {
                var51++;
            }
            if (Statics.field1537 == null) {
                Statics.field1537 = class71.method1353(Statics.field974, "mod_icons", "");
            } else {
                var51++;
            }
            if (Statics.field1660 == null) {
                Statics.field1660 = class71.method550(Statics.field974, "mapback", "");
            } else {
                var51++;
            }
            if (var51 < 14) {
                class29.field671 = class145.field2184 + var51 * 100 / 14 + "%";
                class29.field683 = 70;
            } else {
                Statics.field2957 = Statics.field1537;
                Statics.field2409.method1455();
                int var52 = (int) (Math.random() * 21.0D) - 10;
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 41.0D) - 20;
                for (int var56 = 0; var56 < Statics.field1024.length; var56++) {
                    Statics.field1024[var56].method1489(var52 + var55, var53 + var55, var54 + var55);
                }
                Statics.field1958[0].method1597(var52 + var55, var53 + var55, var54 + var55);
                Statics.field1811 = new int[33];
                Statics.field145 = new int[33];
                Statics.field800 = new int[151];
                Statics.field1673 = new int[151];
                for (int var57 = 0; var57 < 33; var57++) {
                    int var58 = 999;
                    int var59 = 0;
                    for (int var60 = 0; var60 < 34; var60++) {
                        if (Statics.field1660.field1326[Statics.field1660.field1323 * var57 + var60] == 0) {
                            if (var58 == 999) {
                                var58 = var60;
                            }
                        } else if (var58 != 999) {
                            var59 = var60;
                            break;
                        }
                    }
                    Statics.field1811[var57] = var58;
                    Statics.field145[var57] = var59 - var58;
                }
                for (int var61 = 5; var61 < 156; var61++) {
                    int var62 = 999;
                    int var63 = 0;
                    for (int var64 = 25; var64 < 172; var64++) {
                        if (Statics.field1660.field1326[Statics.field1660.field1323 * var61 + var64] == 0 && var64 > 34 || var61 > 34) {
                            if (var62 == 999) {
                                var62 = var64;
                            }
                        } else if (var62 != 999) {
                            var63 = var64;
                            break;
                        }
                    }
                    Statics.field800[var61 - 5] = var62 - 25;
                    Statics.field1673[var61 - 5] = var63 - var62;
                }
                class29.field671 = class145.field2262;
                class29.field683 = 70;
                field266 = 90;
            }
        } else if (field266 == 90) {
            if (Statics.field2131.method2735()) {
                class89 var65 = new class89(Statics.field2131, Statics.field974, 20, 0.8D, field244 ? 64 : 128);
                class85.method1800(var65);
                class85.method1840(0.8D);
                class29.field671 = class145.field2311;
                class29.field683 = 90;
                field266 = 110;
            } else {
                class29.field671 = class145.field2305 + Statics.field2131.method2813() + "%";
                class29.field683 = 90;
            }
        } else if (field266 == 110) {
            Statics.field160 = new class12();
            Statics.field1891.method2500(Statics.field160, 10);
            class29.field671 = class145.field2218;
            class29.field683 = 94;
            field266 = 120;
        } else if (field266 == 120) {
            if (Statics.field2493.method2749("huffman", "")) {
                class103 var66 = new class103(Statics.field2493.method2748("huffman", ""));
                class203.method2420(var66);
                class29.field671 = class145.field2185;
                class29.field683 = 96;
                field266 = 130;
            } else {
                class29.field671 = class145.field2187 + "%";
                class29.field683 = 96;
            }
        } else if (field266 == 130) {
            if (!Statics.field2903.method2735()) {
                class29.field671 = class145.field2209 + Statics.field2903.method2813() * 4 / 5 + "%";
                class29.field683 = 100;
            } else if (!Statics.field1991.method2735()) {
                class29.field671 = class145.field2209 + (80 + Statics.field1991.method2813() / 6) + "%";
                class29.field683 = 100;
            } else if (Statics.field585.method2735()) {
                class29.field671 = class145.field2192;
                class29.field683 = 100;
                field266 = 140;
            } else {
                class29.field671 = class145.field2209 + (96 + Statics.field585.method2813() / 20) + "%";
                class29.field683 = 100;
            }
        } else if (field266 == 140) {
            method469(10);
        }
    }

    @ObfuscatedName("dz.c(IZZZB)Lec;")
    public static class150 method2419(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class123 var4 = null;
        if (class138.field2090 != null) {
            var4 = new class123(arg0, class138.field2090, Statics.field2025[arg0], 1000000);
        }
        return new class150(var4, Statics.field66, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("co.r(B)V")
    public static final void method2075() {
        try {
            if (field431 == 0) {
                if (Statics.field516 != null) {
                    Statics.field516.method2593();
                    Statics.field516 = null;
                }
                Statics.field1124 = null;
                field421 = false;
                field262 = 0;
                field431 = 1;
            }
            if (field431 == 1) {
                if (Statics.field1124 == null) {
                    Statics.field1124 = Statics.field1891.method2498(Statics.field185, Statics.field2476);
                }
                if (Statics.field1124.field2070 == 2) {
                    throw new IOException();
                }
                if (Statics.field1124.field2070 == 1) {
                    Statics.field516 = new class132((Socket) Statics.field1124.field2067, Statics.field1891);
                    Statics.field1124 = null;
                    field431 = 2;
                }
            }
            if (field431 == 2) {
                field279.field1841 = 0;
                field279.method2113(14);
                Statics.field516.method2601(field279.field1839, 0, 1);
                field281.field1841 = 0;
                field431 = 3;
            }
            if (field431 == 3) {
                if (Statics.field2914 != null) {
                    Statics.field2914.method1029();
                }
                if (Statics.field1006 != null) {
                    Statics.field1006.method1029();
                }
                int var0 = Statics.field516.method2594();
                if (Statics.field2914 != null) {
                    Statics.field2914.method1029();
                }
                if (Statics.field1006 != null) {
                    Statics.field1006.method1029();
                }
                if (var0 != 0) {
                    method471(var0);
                    return;
                }
                field281.field1841 = 0;
                field431 = 5;
            }
            if (field431 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field279.field1841 = 0;
                field279.method2113(1);
                field279.method2113(class29.field664.method466());
                field279.method2233(var1[0]);
                field279.method2233(var1[1]);
                field279.method2233(var1[2]);
                field279.method2233(var1[3]);
                switch(class29.field664.field2415) {
                    case 0:
                        class111 var2 = field279;
                        LinkedHashMap var3 = Statics.field140.field130;
                        String var4 = class29.field676;
                        int var5 = var4.length();
                        int var6 = 0;
                        for (int var7 = 0; var7 < var5; var7++) {
                            var6 = (var6 << 5) - var6 + var4.charAt(var7);
                        }
                        var2.method2233((Integer) var3.get(var6));
                        field279.field1841 += 4;
                        break;
                    case 1:
                        field279.field1841 += 8;
                        break;
                    case 2:
                    case 3:
                        field279.method2147(Statics.field1463);
                        field279.field1841 += 5;
                }
                field279.method2212(class29.field677);
                field279.method2145(class5.field63, class5.field67);
                field440.field1841 = 0;
                if (field411 == 40) {
                    field440.method2113(18);
                } else {
                    field440.method2113(16);
                }
                field440.method2114(0);
                int var9 = field440.field1841;
                field440.method2233(70);
                field440.method2312(field279.field1839, 0, field279.field1841);
                int var10 = field440.field1841;
                field440.method2212(class29.field676);
                field440.method2113(field244 ? 1 : 0);
                class138.method1881(field440);
                class108 var11 = new class108(Statics.field2156.method2725());
                Statics.field2156.method2722(var11);
                field440.method2312(var11.field1839, 0, var11.field1839.length);
                field440.method2233(Statics.field2421.field2473);
                field440.method2233(Statics.field990.field2473);
                field440.method2233(Statics.field2821.field2473);
                field440.method2233(Statics.field2903.field2473);
                field440.method2233(Statics.field1499.field2473);
                field440.method2233(Statics.field2472.field2473);
                field440.method2233(Statics.field2800.field2473);
                field440.method2233(Statics.field1451.field2473);
                field440.method2233(Statics.field974.field2473);
                field440.method2233(Statics.field2131.field2473);
                field440.method2233(Statics.field2493.field2473);
                field440.method2233(Statics.field1988.field2473);
                field440.method2233(Statics.field1991.field2473);
                field440.method2233(Statics.field585.field2473);
                field440.method2233(Statics.field164.field2473);
                field440.method2233(Statics.field1917.field2473);
                field440.method2143(var1, var10, field440.field1841);
                field440.method2123(field440.field1841 - var9);
                Statics.field516.method2601(field440.field1839, 0, field440.field1841);
                field279.method2374(var1);
                for (int var12 = 0; var12 < 4; var12++) {
                    var1[var12] += 50;
                }
                field281.method2374(var1);
                field431 = 6;
            }
            if (field431 == 6 && Statics.field516.method2595() > 0) {
                int var13 = Statics.field516.method2594();
                if (var13 == 21 && field411 == 20) {
                    field431 = 7;
                } else if (var13 == 2) {
                    field431 = 9;
                } else if (var13 == 15 && field411 == 40) {
                    field279.field1841 = 0;
                    field281.field1841 = 0;
                    field283 = -1;
                    field363 = -1;
                    field307 = -1;
                    field289 = -1;
                    field446 = 0;
                    field284 = 0;
                    field255 = 0;
                    field478 = 0;
                    field381 = false;
                    field237 = 0;
                    field370 = 0;
                    for (int var14 = 0; var14 < field358.length; var14++) {
                        if (field358[var14] != null) {
                            field358[var14].field758 = -1;
                        }
                    }
                    for (int var15 = 0; var15 < field276.length; var15++) {
                        if (field276[var15] != null) {
                            field276[var15].field758 = -1;
                        }
                    }
                    class14.field190 = new class177(32);
                    method469(30);
                    for (int var16 = 0; var16 < 100; var16++) {
                        field248[var16] = true;
                    }
                    return;
                } else if (var13 == 23 && field273 < 1) {
                    field273++;
                    field431 = 0;
                } else {
                    method471(var13);
                    return;
                }
            }
            if (field431 == 7 && Statics.field516.method2595() > 0) {
                field274 = (Statics.field516.method2594() + 3) * 60;
                field431 = 8;
            }
            if (field431 == 8) {
                field262 = 0;
                class29.method1449(class145.field2196, class145.field2197, field274 / 60 + class145.field2198);
                if (--field274 <= 0) {
                    field431 = 0;
                }
            } else {
                if (field431 == 9 && Statics.field516.method2595() >= 13) {
                    boolean var17 = Statics.field516.method2594() == 1;
                    Statics.field516.method2596(field281.field1839, 0, 4);
                    field281.field1841 = 0;
                    boolean var18 = false;
                    if (var17) {
                        int var19 = field281.method2365() << 24;
                        int var20 = var19 | field281.method2365() << 16;
                        int var21 = var20 | field281.method2365() << 8;
                        int var22 = var21 | field281.method2365();
                        String var23 = class29.field676;
                        int var24 = var23.length();
                        int var25 = 0;
                        for (int var26 = 0; var26 < var24; var26++) {
                            var25 = (var25 << 5) - var25 + var23.charAt(var26);
                        }
                        if (Statics.field140.field130.size() >= 10 && !Statics.field140.field130.containsKey(var25)) {
                            Iterator var29 = Statics.field140.field130.entrySet().iterator();
                            var29.next();
                            var29.remove();
                        }
                        Statics.field140.field130.put(var25, var22);
                        class9.method62();
                    }
                    field407 = Statics.field516.method2594();
                    field409 = Statics.field516.method2594() == 1;
                    field280 = Statics.field516.method2594();
                    field280 <<= 0x8;
                    field280 += Statics.field516.method2594();
                    field365 = Statics.field516.method2594();
                    Statics.field516.method2596(field281.field1839, 0, 1);
                    field281.field1841 = 0;
                    field283 = field281.method2365();
                    Statics.field516.method2596(field281.field1839, 0, 2);
                    field281.field1841 = 0;
                    field446 = field281.method2129();
                    if (field365 == 1) {
                        try {
                            class121.method2463(Statics.field347, "zap");
                        } catch (Throwable var50) {
                        }
                    } else {
                        try {
                            class121.method2463(Statics.field347, "unzap");
                        } catch (Throwable var49) {
                        }
                    }
                    field431 = 10;
                }
                if (field431 != 10) {
                    field262++;
                    if (field262 > 2000) {
                        if (field273 < 1) {
                            if (Statics.field2476 == Statics.field1919) {
                                Statics.field2476 = Statics.field2706;
                            } else {
                                Statics.field2476 = Statics.field1919;
                            }
                            field273++;
                            field431 = 0;
                        } else {
                            method471(-3);
                        }
                    }
                } else if (Statics.field516.method2595() >= field446) {
                    field281.field1841 = 0;
                    Statics.field516.method2596(field281.field1839, 0, field446);
                    field275 = 1L;
                    field252 = -1;
                    Statics.field160.field168 = 0;
                    Statics.field967 = true;
                    field253 = true;
                    field435 = -1L;
                    class192.field2896 = new class183();
                    field279.field1841 = 0;
                    field281.field1841 = 0;
                    field283 = -1;
                    field363 = -1;
                    field307 = -1;
                    field289 = -1;
                    field284 = 0;
                    field255 = 0;
                    field286 = 0;
                    field405 = 0;
                    field478 = 0;
                    field381 = false;
                    class129.method2327(0);
                    class10.method2443();
                    field482 = 0;
                    field412 = false;
                    field320 = 0;
                    field301 = (int) (Math.random() * 100.0D) - 50;
                    field303 = (int) (Math.random() * 110.0D) - 55;
                    field410 = (int) (Math.random() * 80.0D) - 40;
                    field321 = (int) (Math.random() * 120.0D) - 60;
                    field310 = (int) (Math.random() * 30.0D) - 20;
                    field404 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field237 = 0;
                    field278 = -1;
                    field370 = 0;
                    field472 = 0;
                    field265 = class18.field514;
                    field359 = 0;
                    field277 = 0;
                    for (int var32 = 0; var32 < 2048; var32++) {
                        field358[var32] = null;
                        field400[var32] = null;
                    }
                    for (int var33 = 0; var33 < 32768; var33++) {
                        field276[var33] = null;
                    }
                    Statics.field163 = field358[2047] = new class3();
                    field300 = -1;
                    field375.method3250();
                    field376.method3250();
                    for (int var34 = 0; var34 < 4; var34++) {
                        for (int var35 = 0; var35 < 104; var35++) {
                            for (int var36 = 0; var36 < 104; var36++) {
                                field373[var34][var35][var36] = null;
                            }
                        }
                    }
                    field374 = new class180();
                    field474 = 0;
                    field492 = 0;
                    field496 = 0;
                    for (int var37 = 0; var37 < Statics.field699; var37++) {
                        class47 var38 = (class47) class47.field1074.method3186((long) var37);
                        class47 var39;
                        if (var38 == null) {
                            byte[] var40 = Statics.field1073.method2751(16, var37);
                            class47 var41 = new class47();
                            if (var40 != null) {
                                var41.method914(new class108(var40));
                            }
                            class47.field1074.method3183(var41, (long) var37);
                            var39 = var41;
                        } else {
                            var39 = var38;
                        }
                        if (var39 != null) {
                            class157.field2671[var37] = 0;
                            class157.field2672[var37] = 0;
                        }
                    }
                    for (int var43 = 0; var43 < field454.length; var43++) {
                        field454[var43] = -1;
                    }
                    field437 = -1;
                    if (field302 != -1) {
                        class155.method1880(field302);
                    }
                    for (class4 var44 = (class4) field396.method3217(); var44 != null; var44 = (class4) field396.method3218()) {
                        method1793(var44, true);
                    }
                    field302 = -1;
                    field396 = new class177(8);
                    field424 = null;
                    field381 = false;
                    field478 = 0;
                    field498.method2934((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var45 = 0; var45 < 8; var45++) {
                        field497[var45] = null;
                        field249[var45] = false;
                    }
                    class14.field190 = new class177(32);
                    field247 = true;
                    for (int var46 = 0; var46 < 100; var46++) {
                        field248[var46] = true;
                    }
                    field464 = null;
                    Statics.field1076 = 0;
                    Statics.field57 = null;
                    for (int var47 = 0; var47 < 6; var47++) {
                        field501[var47] = new class201();
                    }
                    Statics.field1810 = null;
                    Statics.field1920 = -1;
                    method4(false);
                    field283 = -1;
                }
            }
        } catch (IOException var51) {
            if (field273 < 1) {
                if (Statics.field2476 == Statics.field1919) {
                    Statics.field2476 = Statics.field2706;
                } else {
                    Statics.field2476 = Statics.field1919;
                }
                field273++;
                field431 = 0;
            } else {
                method471(-2);
            }
        }
    }

    @ObfuscatedName("r.f(IS)V")
    public static void method471(int arg0) {
        if (arg0 == -3) {
            class29.method1449(class145.field2199, class145.field2200, class145.field2201);
        } else if (arg0 == -2) {
            class29.method1449(class145.field2168, class145.field2203, class145.field2204);
        } else if (arg0 == -1) {
            class29.method1449(class145.field2205, class145.field2189, class145.field2351);
        } else if (arg0 == 3) {
            class29.method1449(class145.field2208, class145.field2332, class145.field2210);
        } else if (arg0 == 4) {
            class29.method1449(class145.field2211, class145.field2212, class145.field2213);
        } else if (arg0 == 5) {
            class29.method1449(class145.field2236, class145.field2215, class145.field2216);
        } else if (arg0 == 6) {
            class29.method1449(class145.field2217, class145.field2166, class145.field2259);
        } else if (arg0 == 7) {
            class29.method1449(class145.field2220, class145.field2251, class145.field2222);
        } else if (arg0 == 8) {
            class29.method1449(class145.field2273, class145.field2224, class145.field2225);
        } else if (arg0 == 9) {
            class29.method1449(class145.field2226, class145.field2186, class145.field2228);
        } else if (arg0 == 10) {
            class29.method1449(class145.field2306, class145.field2230, class145.field2263);
        } else if (arg0 == 11) {
            class29.method1449(class145.field2232, class145.field2405, class145.field2234);
        } else if (arg0 == 12) {
            class29.method1449(class145.field2202, class145.field2258, class145.field2237);
        } else if (arg0 == 13) {
            class29.method1449(class145.field2219, class145.field2255, class145.field2304);
        } else if (arg0 == 14) {
            class29.method1449(class145.field2241, class145.field2242, class145.field2243);
        } else if (arg0 == 16) {
            class29.method1449(class145.field2250, class145.field2245, class145.field2246);
        } else if (arg0 == 17) {
            class29.method1449(class145.field2247, class145.field2298, class145.field2165);
        } else if (arg0 == 18) {
            class29.method1449(class145.field2160, class145.field2172, class145.field2252);
        } else if (arg0 == 19) {
            class29.method1449(class145.field2253, class145.field2254, class145.field2375);
        } else if (arg0 == 20) {
            class29.method1449(class145.field2277, class145.field2257, class145.field2402);
        } else if (arg0 == 22) {
            class29.method1449(class145.field2176, class145.field2260, class145.field2261);
        } else if (arg0 == 23) {
            class29.method1449(class145.field2240, class145.field2227, class145.field2264);
        } else if (arg0 == 24) {
            class29.method1449(class145.field2265, class145.field2266, class145.field2267);
        } else if (arg0 == 25) {
            class29.method1449(class145.field2268, class145.field2297, class145.field2270);
        } else if (arg0 == 26) {
            class29.method1449(class145.field2271, class145.field2272, class145.field2407);
        } else if (arg0 == 27) {
            class29.method1449(class145.field2274, class145.field2275, class145.field2276);
        } else if (arg0 == 31) {
            class29.method1449(class145.field2283, class145.field2174, class145.field2285);
        } else if (arg0 == 32) {
            class29.method1449(class145.field2286, class145.field2287, class145.field2363);
        } else if (arg0 == 37) {
            class29.method1449(class145.field2289, class145.field2316, class145.field2188);
        } else if (arg0 == 38) {
            class29.method1449(class145.field2292, class145.field2239, class145.field2294);
        } else if (arg0 == 55) {
            class29.method1449(class145.field2295, class145.field2296, class145.field2256);
        } else if (arg0 == 56) {
            class29.method1449(class145.field2325, class145.field2299, class145.field2300);
            method469(11);
            return;
        } else if (arg0 == 57) {
            class29.method1449(class145.field2301, class145.field2302, class145.field2303);
            method469(11);
            return;
        } else {
            class29.method1449(class145.field2333, class145.field2376, class145.field2269);
        }
        method469(10);
    }

    @ObfuscatedName("eo.t(I)V")
    public static final void method2715() {
        if (Statics.field516 != null) {
            Statics.field516.method2593();
            Statics.field516 = null;
        }
        method66();
        Statics.field965.method1630();
        for (int var0 = 0; var0 < 4; var0++) {
            field441[var0].method3613();
        }
        System.gc();
        class164.method1787(2);
        field476 = -1;
        field477 = false;
        class21.method515();
        method469(10);
    }

    @ObfuscatedName("j.o(I)V")
    public static final void method66() {
        class42.field969.method3181();
        class38.field904.method3181();
        class41.method544();
        class37.method2854();
        class36.method831();
        class46.field1026.method3181();
        class46.field1027.method3181();
        class46.field1036.method3181();
        class39.field915.method3181();
        class39.field916.method3181();
        class40.method3();
        class43.method3361();
        class47.field1074.method3181();
        class160.field2693.method3181();
        class155.field2632.method3181();
        class155.field2537.method3181();
        class155.field2538.method3181();
        ((class89) Statics.field1484).method1873();
        class20.field537.method3181();
        Statics.field2421.method2744();
        Statics.field990.method2744();
        Statics.field2903.method2744();
        Statics.field1499.method2744();
        Statics.field2472.method2744();
        Statics.field2800.method2744();
        Statics.field1451.method2744();
        Statics.field974.method2744();
        Statics.field2131.method2744();
        Statics.field2493.method2744();
        Statics.field1988.method2744();
        Statics.field1991.method2744();
    }

    @ObfuscatedName("w.z(I)V")
    public static final void method137() {
        if (field255 > 1) {
            field255--;
        }
        if (field286 > 0) {
            field286--;
        }
        if (field421) {
            field421 = false;
            if (field286 > 0) {
                method2715();
            } else {
                method469(40);
                Statics.field1122 = Statics.field516;
                Statics.field516 = null;
            }
            return;
        }
        if (!field381) {
            field387[0] = class145.field2396;
            field388[0] = "";
            field385[0] = 1006;
            field478 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field516 == null) {
                var1 = false;
            } else {
                label2703: {
                    try {
                        int var2 = Statics.field516.method2595();
                        if (var2 == 0) {
                            var1 = false;
                            break label2703;
                        }
                        if (field283 == -1) {
                            Statics.field516.method2596(field281.field1839, 0, 1);
                            field281.field1841 = 0;
                            field283 = field281.method2365();
                            field446 = class169.field2816[field283];
                            var2--;
                        }
                        if (field446 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2703;
                            }
                            Statics.field516.method2596(field281.field1839, 0, 1);
                            field446 = field281.field1839[0] & 0xFF;
                            var2--;
                        }
                        if (field446 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2703;
                            }
                            Statics.field516.method2596(field281.field1839, 0, 2);
                            field281.field1841 = 0;
                            field446 = field281.method2129();
                            var2 -= 2;
                        }
                        if (var2 < field446) {
                            var1 = false;
                            break label2703;
                        }
                        field281.field1841 = 0;
                        Statics.field516.method2596(field281.field1839, 0, field446);
                        field284 = 0;
                        field289 = field307;
                        field307 = field363;
                        field363 = field283;
                        if (field283 == 245) {
                            int var3 = field281.method2169();
                            int var4 = field281.method2164();
                            class155 var5 = class155.method2386(var3);
                            if (var5.field2577 != var4 || var4 == -1) {
                                var5.field2577 = var4;
                                var5.field2650 = 0;
                                var5.field2651 = 0;
                                method2391(var5);
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 172) {
                            int var6 = field281.method2132();
                            int var7 = field281.method2162();
                            if (var7 == 65535) {
                                var7 = -1;
                            }
                            int var8 = field281.method2170();
                            int var9 = field281.method2256();
                            if (var9 == 65535) {
                                var9 = -1;
                            }
                            for (int var10 = var9; var10 <= var7; var10++) {
                                long var11 = ((long) var6 << 32) + (long) var10;
                                class189 var13 = field443.method3214(var11);
                                if (var13 != null) {
                                    var13.method3352();
                                }
                                field443.method3215(new class182(var8), var11);
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 144) {
                            while (field281.field1841 < field446) {
                                boolean var14 = field281.method2299() == 1;
                                String var15 = field281.method2270();
                                String var16 = field281.method2270();
                                int var17 = field281.method2129();
                                int var18 = field281.method2299();
                                int var19 = field281.method2299();
                                boolean var20 = (var19 & 0x2) != 0;
                                boolean var21 = (var19 & 0x1) != 0;
                                if (var17 > 0) {
                                    field281.method2270();
                                    field281.method2299();
                                    field281.method2132();
                                }
                                field281.method2270();
                                for (int var22 = 0; var22 < field492; var22++) {
                                    class16 var23 = field494[var22];
                                    if (var14) {
                                        if (var16.equals(var23.field220)) {
                                            var23.field220 = var15;
                                            var23.field217 = var16;
                                            var15 = null;
                                            break;
                                        }
                                    } else if (var15.equals(var23.field220)) {
                                        if (var23.field216 != var17) {
                                            boolean var24 = true;
                                            for (class35 var25 = (class35) field495.method3208(); var25 != null; var25 = (class35) field495.method3212()) {
                                                if (var25.field802.equals(var15)) {
                                                    if (var17 != 0 && var25.field797 == 0) {
                                                        var25.method3350();
                                                        var24 = false;
                                                    } else if (var17 == 0 && var25.field797 != 0) {
                                                        var25.method3350();
                                                        var24 = false;
                                                    }
                                                }
                                            }
                                            if (var24) {
                                                field495.method3210(new class35(var15, var17));
                                            }
                                            var23.field216 = var17;
                                        }
                                        var23.field217 = var16;
                                        var23.field214 = var18;
                                        var23.field218 = var20;
                                        var23.field219 = var21;
                                        var15 = null;
                                        break;
                                    }
                                }
                                if (var15 != null && field492 < 400) {
                                    class16 var26 = new class16();
                                    field494[field492] = var26;
                                    var26.field220 = var15;
                                    var26.field217 = var16;
                                    var26.field216 = var17;
                                    var26.field214 = var18;
                                    var26.field218 = var20;
                                    var26.field219 = var21;
                                    field492++;
                                }
                            }
                            field474 = 2;
                            field432 = field272;
                            boolean var27 = false;
                            int var28 = field492;
                            while (var28 > 0) {
                                boolean var29 = true;
                                var28--;
                                for (int var30 = 0; var30 < var28; var30++) {
                                    boolean var31 = false;
                                    class16 var32 = field494[var30];
                                    class16 var33 = field494[var30 + 1];
                                    if (field238 != var32.field216 && field238 == var33.field216) {
                                        var31 = true;
                                    }
                                    if (!var31 && var32.field216 == 0 && var33.field216 != 0) {
                                        var31 = true;
                                    }
                                    if (!var31 && !var32.field218 && var33.field218) {
                                        var31 = true;
                                    }
                                    if (!var31 && !var32.field219 && var33.field219) {
                                        var31 = true;
                                    }
                                    if (var31) {
                                        class16 var34 = field494[var30];
                                        field494[var30] = field494[var30 + 1];
                                        field494[var30 + 1] = var34;
                                        var29 = false;
                                    }
                                }
                                if (var29) {
                                    break;
                                }
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 183) {
                            int var35 = field446 + field281.field1841;
                            int var36 = field281.method2129();
                            int var37 = field281.method2129();
                            if (field302 != var36) {
                                field302 = var36;
                                method3358(field302);
                                class33.method2559(field302);
                                for (int var38 = 0; var38 < 100; var38++) {
                                    field248[var38] = true;
                                }
                            }
                            while (var37-- > 0) {
                                int var39 = field281.method2132();
                                int var40 = field281.method2129();
                                int var41 = field281.method2299();
                                class4 var42 = (class4) field396.method3214((long) var39);
                                if (var42 != null && var42.field50 != var40) {
                                    method1793(var42, true);
                                    var42 = null;
                                }
                                if (var42 == null) {
                                    var42 = method2590(var39, var40, var41);
                                }
                                var42.field52 = true;
                            }
                            for (class4 var43 = (class4) field396.method3217(); var43 != null; var43 = (class4) field396.method3218()) {
                                if (var43.field52) {
                                    var43.field52 = false;
                                } else {
                                    method1793(var43, true);
                                }
                            }
                            field443 = new class177(512);
                            while (field281.field1841 < var35) {
                                int var44 = field281.method2132();
                                int var45 = field281.method2129();
                                int var46 = field281.method2129();
                                int var47 = field281.method2132();
                                for (int var48 = var45; var48 <= var46; var48++) {
                                    long var49 = ((long) var44 << 32) + (long) var48;
                                    field443.method3215(new class182(var47), var49);
                                }
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 140) {
                            field281.field1841 += 28;
                            if (field281.method2297()) {
                                class111 var51 = field281;
                                int var52 = field281.field1841 - 28;
                                if (class138.field2089 != null) {
                                    try {
                                        class138.field2089.method3576(0L);
                                        class138.field2089.method3581(var51.field1839, var52, 24);
                                    } catch (Exception var406) {
                                    }
                                }
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 221) {
                            int var54 = field281.method2299();
                            class119[] var55 = class119.method28();
                            int var56 = 0;
                            class119 var58;
                            while (true) {
                                if (var56 >= var55.length) {
                                    var58 = null;
                                    break;
                                }
                                class119 var57 = var55[var56];
                                if (var57.field1915 == var54) {
                                    var58 = var57;
                                    break;
                                }
                                var56++;
                            }
                            Statics.field146 = var58;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 153) {
                            int var59 = field281.method2132();
                            Statics.field522 = Statics.field1891.method2501(var59);
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 213) {
                            Statics.field3009 = field281.method2112();
                            Statics.field1574 = field281.method2151();
                            for (int var60 = Statics.field3009; var60 < Statics.field3009 + 8; var60++) {
                                for (int var61 = Statics.field1574; var61 < Statics.field1574 + 8; var61++) {
                                    if (field373[Statics.field1880][var60][var61] != null) {
                                        field373[Statics.field1880][var60][var61] = null;
                                        method153(var60, var61);
                                    }
                                }
                            }
                            for (class15 var62 = (class15) field374.method3251(); var62 != null; var62 = (class15) field374.method3272()) {
                                if (var62.field207 >= Statics.field3009 && var62.field207 < Statics.field3009 + 8 && var62.field198 >= Statics.field1574 && var62.field198 < Statics.field1574 + 8 && Statics.field1880 == var62.field199) {
                                    var62.field208 = 0;
                                }
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 79) {
                            int var63 = field281.method2129();
                            int var64 = field281.method2160();
                            int var65 = field281.method2132();
                            int var66 = field281.method2129();
                            class155 var67 = class155.method2386(var65);
                            if (var67.field2612 != var63 || var67.field2582 != var66 || var67.field2594 != var64) {
                                var67.field2612 = var63;
                                var67.field2582 = var66;
                                var67.field2594 = var64;
                                method2391(var67);
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 139) {
                            field370 = field281.method2299();
                            if (field370 == 255) {
                                field370 = 0;
                            }
                            field472 = field281.method2299();
                            if (field472 == 255) {
                                field472 = 0;
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 253) {
                            method139();
                            field406 = field281.method2130();
                            field436 = field272;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 29) {
                            method472(false);
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 184) {
                            class23 var68 = new class23();
                            var68.field571 = field281.method2270();
                            var68.field584 = field281.method2129();
                            int var69 = field281.method2132();
                            var68.field583 = var69;
                            method469(45);
                            Statics.field516.method2593();
                            Statics.field516 = null;
                            class29.method3362(var68);
                            field283 = -1;
                            var1 = false;
                            break label2703;
                        }
                        if (field283 == 89) {
                            method4(true);
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 241) {
                            while (field281.field1841 < field446) {
                                int var70 = field281.method2299();
                                boolean var71 = (var70 & 0x1) == 1;
                                String var72 = field281.method2270();
                                String var73 = field281.method2270();
                                field281.method2270();
                                for (int var74 = 0; var74 < field496; var74++) {
                                    class8 var75 = field463[var74];
                                    if (var71) {
                                        if (var73.equals(var75.field120)) {
                                            var75.field120 = var72;
                                            var75.field121 = var73;
                                            var72 = null;
                                            break;
                                        }
                                    } else if (var72.equals(var75.field120)) {
                                        var75.field120 = var72;
                                        var75.field121 = var73;
                                        var72 = null;
                                        break;
                                    }
                                }
                                if (var72 != null && field496 < 400) {
                                    class8 var76 = new class8();
                                    field463[field496] = var76;
                                    var76.field120 = var72;
                                    var76.field121 = var73;
                                    field496++;
                                }
                            }
                            field432 = field272;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 9) {
                            int var77 = field281.method2132();
                            int var78 = field281.method2129();
                            if (var77 < -70000) {
                                var78 += 32768;
                            }
                            class155 var79;
                            if (var77 >= 0) {
                                var79 = class155.method2386(var77);
                            } else {
                                var79 = null;
                            }
                            while (field281.field1841 < field446) {
                                int var80 = field281.method2125();
                                int var81 = field281.method2129();
                                int var82 = 0;
                                if (var81 != 0) {
                                    var82 = field281.method2299();
                                    if (var82 == 255) {
                                        var82 = field281.method2132();
                                    }
                                }
                                if (var79 != null && var80 >= 0 && var80 < var79.field2615.length) {
                                    var79.field2615[var80] = var81;
                                    var79.field2647[var80] = var82;
                                }
                                class14.method507(var78, var80, var81 - 1, var82);
                            }
                            if (var79 != null) {
                                method2391(var79);
                            }
                            method139();
                            field314[++field428 - 1 & 0x1F] = var78 & 0x7FFF;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 226) {
                            int var83 = field281.method2237();
                            int var84 = field281.method2256();
                            class155 var85 = class155.method2386(var83);
                            if (var85.field2573 != 2 || var85.field2597 != var84) {
                                var85.field2573 = 2;
                                var85.field2597 = var84;
                                method2391(var85);
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 190) {
                            int var86 = field281.method2125();
                            boolean var87 = field281.method2299() == 1;
                            String var88 = "";
                            boolean var89 = false;
                            if (var87) {
                                var88 = field281.method2270();
                                if (method21(var88)) {
                                    var89 = true;
                                }
                            }
                            String var90 = field281.method2270();
                            if (!var89) {
                                class10.method2806(var86, var88, var90);
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 80) {
                            field474 = 1;
                            field432 = field272;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 22) {
                            int var91 = field281.method2129();
                            int var92 = field281.method2299();
                            int var93 = field281.method2129();
                            if (field475 != 0 && var92 != 0 && field320 < 50) {
                                field481[field320] = var91;
                                field295[field320] = var92;
                                field483[field320] = var93;
                                field485[field320] = null;
                                field484[field320] = 0;
                                field320++;
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 53) {
                            field255 = field281.method2256() * 30;
                            field436 = field272;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 31) {
                            String var97 = field281.method2270();
                            long var98 = field281.method2133();
                            long var100 = (long) field281.method2129();
                            long var102 = (long) field281.method2131();
                            class140[] var104 = new class140[] { class140.field2113, class140.field2116, class140.field2109, class140.field2111, class140.field2117 };
                            class140 var105 = (class140) class100.method1790(var104, field281.method2299());
                            long var106 = (var100 << 32) + var102;
                            boolean var108 = false;
                            for (int var109 = 0; var109 < 100; var109++) {
                                if (field439[var109] == var106) {
                                    var108 = true;
                                    break;
                                }
                            }
                            if (var105.field2107 && method21(var97)) {
                                var108 = true;
                            }
                            if (!var108 && field357 == 0) {
                                field439[field459] = var106;
                                field459 = (field459 + 1) % 100;
                                class111 var110 = field281;
                                String var111 = class203.method2717(var110, 32767);
                                String var112 = class204.method3502(class211.method2718(var111));
                                if (var105.field2115 == -1) {
                                    class10.method133(9, var97, var112, class210.method731(var98));
                                } else {
                                    int var113 = var105.field2115;
                                    String var114 = "<img=" + var113 + ">";
                                    class10.method133(9, var114 + var97, var112, class210.method731(var98));
                                }
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 223) {
                            int var115 = field281.method2169();
                            int var116 = field281.method2129();
                            int var117 = field281.method2112();
                            class4 var118 = (class4) field396.method3214((long) var115);
                            if (var118 != null) {
                                method1793(var118, var118.field50 != var116);
                            }
                            method2590(var115, var116, var117);
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 77) {
                            field418 = field281.method2299();
                            field456 = field281.method2299();
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 62) {
                            Statics.field3009 = field281.method2151();
                            Statics.field1574 = field281.method2151();
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 206) {
                            int var119 = field281.method2160();
                            if (var119 == 65535) {
                                var119 = -1;
                            }
                            if (var119 == -1 && !field477) {
                                class164.method2904();
                            } else if (var119 != -1 && field476 != var119 && field294 != 0 && !field477) {
                                class164.method141(2, Statics.field2800, var119, 0, field294, false);
                            }
                            field476 = var119;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 27) {
                            int var120 = field281.method2131();
                            int var121 = field281.method2256();
                            if (var121 == 65535) {
                                var121 = -1;
                            }
                            if (field294 != 0 && var121 != -1) {
                                class164.method2618(Statics.field1988, var121, 0, field294, false);
                                field477 = true;
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 106) {
                            String var122 = field281.method2270();
                            class111 var123 = field281;
                            String var124 = class203.method2717(var123, 32767);
                            String var125 = class204.method3502(class211.method2718(var124));
                            class10.method2806(6, var122, var125);
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 133) {
                            int var126 = field281.method2299();
                            if (field281.method2299() == 0) {
                                field501[var126] = new class201();
                                field281.field1841 += 18;
                            } else {
                                field281.field1841--;
                                field501[var126] = new class201(field281, false);
                            }
                            field453 = field272;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 218) {
                            int var127 = field281.method2162();
                            int var128 = field281.method2169();
                            class155 var129 = class155.method2386(var128);
                            if (var129 != null && var129.field2559 == 0) {
                                if (var127 > var129.field2557 - var129.field2551) {
                                    var127 = var129.field2557 - var129.field2551;
                                }
                                if (var127 < 0) {
                                    var127 = 0;
                                }
                                if (var129.field2555 != var127) {
                                    var129.field2555 = var127;
                                    method2391(var129);
                                }
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 71) {
                            boolean var130 = field281.method2299() == 1;
                            if (var130) {
                                Statics.field2144 = class104.method27() - field281.method2133();
                                Statics.field1810 = new class202(field281, true);
                            } else {
                                Statics.field1810 = null;
                            }
                            field308 = field272;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 192) {
                            if (field302 != -1) {
                                int var131 = field302;
                                if (class155.method512(var131)) {
                                    method501(Statics.field2533[var131], 0);
                                }
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 201) {
                            int var132 = field281.method2132();
                            int var133 = field281.method2162();
                            class157.field2671[var133] = var132;
                            if (class157.field2672[var133] != var132) {
                                class157.field2672[var133] = var132;
                                method151(var133);
                            }
                            field282[++field426 - 1 & 0x1F] = var133;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 17) {
                            int var134 = field281.method2237();
                            int var135 = field281.method2140();
                            int var136 = field281.method2130();
                            class155 var137 = class155.method2386(var134);
                            int var138 = var137.field2548 + var136;
                            int var139 = var137.field2568 + var135;
                            if (var137.field2638 != var138 || var137.field2547 != var139) {
                                var137.field2638 = var138;
                                var137.field2547 = var139;
                                method2391(var137);
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 146) {
                            for (int var140 = 0; var140 < field358.length; var140++) {
                                if (field358[var140] != null) {
                                    field358[var140].field764 = -1;
                                }
                            }
                            for (int var141 = 0; var141 < field276.length; var141++) {
                                if (field276[var141] != null) {
                                    field276[var141].field764 = -1;
                                }
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 124) {
                            field486 = false;
                            for (int var142 = 0; var142 < 5; var142++) {
                                field487[var142] = false;
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 25) {
                            int var143 = field281.method2256();
                            class14 var144 = (class14) class14.field190.method3214((long) var143);
                            if (var144 != null) {
                                var144.method3352();
                            }
                            field314[++field428 - 1 & 0x1F] = var143 & 0x7FFF;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 43) {
                            field486 = true;
                            Statics.field2771 = field281.method2299();
                            Statics.field86 = field281.method2299();
                            Statics.field48 = field281.method2129();
                            Statics.field2412 = field281.method2299();
                            Statics.field716 = field281.method2299();
                            if (Statics.field716 >= 100) {
                                Statics.field2064 = Statics.field2771 * 128 + 64;
                                Statics.field1662 = Statics.field86 * 128 + 64;
                                Statics.field901 = method1974(Statics.field2064, Statics.field1662, Statics.field1880) - Statics.field48;
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 177) {
                            int var145 = field281.method2132();
                            int var146 = field281.method2129();
                            if (var145 < -70000) {
                                var146 += 32768;
                            }
                            class155 var147;
                            if (var145 >= 0) {
                                var147 = class155.method2386(var145);
                            } else {
                                var147 = null;
                            }
                            if (var147 != null) {
                                for (int var148 = 0; var148 < var147.field2615.length; var148++) {
                                    var147.field2615[var148] = 0;
                                    var147.field2647[var148] = 0;
                                }
                            }
                            Statics.method2853(var146);
                            int var149 = field281.method2129();
                            for (int var150 = 0; var150 < var149; var150++) {
                                int var151 = field281.method2256();
                                int var152 = field281.method2151();
                                if (var152 == 255) {
                                    var152 = field281.method2237();
                                }
                                if (var147 != null && var150 < var147.field2615.length) {
                                    var147.field2615[var150] = var151;
                                    var147.field2647[var150] = var152;
                                }
                                class14.method507(var146, var150, var151 - 1, var152);
                            }
                            if (var147 != null) {
                                method2391(var147);
                            }
                            method139();
                            field314[++field428 - 1 & 0x1F] = var146 & 0x7FFF;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 65) {
                            int var153 = field281.method2256();
                            int var154 = field281.method2132();
                            int var155 = field281.method2162();
                            class155 var156 = class155.method2386(var154);
                            var156.field2585 = (var155 << 16) + var153;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 242) {
                            field486 = true;
                            Statics.field144 = field281.method2299();
                            Statics.field2799 = field281.method2299();
                            Statics.field69 = field281.method2129();
                            Statics.field1898 = field281.method2299();
                            Statics.field1669 = field281.method2299();
                            if (Statics.field1669 >= 100) {
                                int var157 = Statics.field144 * 128 + 64;
                                int var158 = Statics.field2799 * 128 + 64;
                                int var159 = method1974(var157, var158, Statics.field1880) - Statics.field69;
                                int var160 = var157 - Statics.field2064;
                                int var161 = var159 - Statics.field901;
                                int var162 = var158 - Statics.field1662;
                                int var163 = (int) Math.sqrt((double) (var160 * var160 + var162 * var162));
                                Statics.field132 = (int) (Math.atan2((double) var161, (double) var163) * 325.949D) & 0x7FF;
                                Statics.field2565 = (int) (Math.atan2((double) var160, (double) var162) * -325.949D) & 0x7FF;
                                if (Statics.field132 < 128) {
                                    Statics.field132 = 128;
                                }
                                if (Statics.field132 > 383) {
                                    Statics.field132 = 383;
                                }
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 16) {
                            int var164 = field281.method2170();
                            class155 var165 = class155.method2386(var164);
                            for (int var166 = 0; var166 < var165.field2615.length; var166++) {
                                var165.field2615[var166] = -1;
                                var165.field2615[var166] = 0;
                            }
                            method2391(var165);
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 95) {
                            byte var167 = field281.method2128();
                            int var168 = field281.method2160();
                            class157.field2671[var168] = var167;
                            if (class157.field2672[var168] != var167) {
                                class157.field2672[var168] = var167;
                                method151(var168);
                            }
                            field282[++field426 - 1 & 0x1F] = var168;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 123) {
                            for (int var169 = 0; var169 < class157.field2672.length; var169++) {
                                if (class157.field2672[var169] != class157.field2671[var169]) {
                                    class157.field2672[var169] = class157.field2671[var169];
                                    method151(var169);
                                    field282[++field426 - 1 & 0x1F] = var169;
                                }
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 198) {
                            String var170 = field281.method2270();
                            int var171 = field281.method2129();
                            byte var172 = field281.method2128();
                            boolean var173 = false;
                            if (var172 == -128) {
                                var173 = true;
                            }
                            if (var173) {
                                if (Statics.field1076 == 0) {
                                    field283 = -1;
                                    var1 = true;
                                    break label2703;
                                }
                                boolean var174 = false;
                                int var175;
                                for (var175 = 0; var175 < Statics.field1076 && (!Statics.field57[var175].field565.equals(var170) || Statics.field57[var175].field562 != var171); var175++) {
                                }
                                if (var175 < Statics.field1076) {
                                    while (var175 < Statics.field1076 - 1) {
                                        Statics.field57[var175] = Statics.field57[var175 + 1];
                                        var175++;
                                    }
                                    Statics.field1076--;
                                    Statics.field57[Statics.field1076] = null;
                                }
                            } else {
                                field281.method2270();
                                class22 var176 = new class22();
                                var176.field565 = var170;
                                var176.field569 = class212.method546(var176.field565, Statics.field1901);
                                var176.field562 = var171;
                                var176.field563 = var172;
                                int var177;
                                for (var177 = Statics.field1076 - 1; var177 >= 0; var177--) {
                                    int var178 = Statics.field57[var177].field569.compareTo(var176.field569);
                                    if (var178 == 0) {
                                        Statics.field57[var177].field562 = var171;
                                        Statics.field57[var177].field563 = var172;
                                        if (var170.equals(Statics.field163.field39)) {
                                            Statics.field2044 = var172;
                                        }
                                        field328 = field272;
                                        field283 = -1;
                                        var1 = true;
                                        break label2703;
                                    }
                                    if (var178 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field1076 >= Statics.field57.length) {
                                    field283 = -1;
                                    var1 = true;
                                    break label2703;
                                }
                                for (int var179 = Statics.field1076 - 1; var179 > var177; var179--) {
                                    Statics.field57[var179 + 1] = Statics.field57[var179];
                                }
                                if (Statics.field1076 == 0) {
                                    Statics.field57 = new class22[100];
                                }
                                Statics.field57[var177 + 1] = var176;
                                Statics.field1076++;
                                if (var170.equals(Statics.field163.field39)) {
                                    Statics.field2044 = var172;
                                }
                            }
                            field328 = field272;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 28) {
                            int var180 = field281.method2112();
                            int var181 = field281.method2112();
                            String var182 = field281.method2270();
                            if (var180 >= 1 && var180 <= 8) {
                                if (var182.equalsIgnoreCase("null")) {
                                    var182 = null;
                                }
                                field497[var180 - 1] = var182;
                                field249[var180 - 1] = var181 == 0;
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 83) {
                            String var183 = field281.method2270();
                            long var184 = (long) field281.method2129();
                            long var186 = (long) field281.method2131();
                            class140[] var188 = new class140[] { class140.field2113, class140.field2116, class140.field2109, class140.field2111, class140.field2117 };
                            class140 var189 = (class140) class100.method1790(var188, field281.method2299());
                            long var190 = (var184 << 32) + var186;
                            boolean var192 = false;
                            for (int var193 = 0; var193 < 100; var193++) {
                                if (field439[var193] == var190) {
                                    var192 = true;
                                    break;
                                }
                            }
                            if (method21(var183)) {
                                var192 = true;
                            }
                            if (!var192 && field357 == 0) {
                                field439[field459] = var190;
                                field459 = (field459 + 1) % 100;
                                class111 var194 = field281;
                                String var195 = class203.method2717(var194, 32767);
                                String var196 = class204.method3502(class211.method2718(var195));
                                byte var197;
                                if (var189.field2108) {
                                    var197 = 7;
                                } else {
                                    var197 = 3;
                                }
                                if (var189.field2115 == -1) {
                                    class10.method2806(var197, var183, var196);
                                } else {
                                    int var199 = var189.field2115;
                                    String var200 = "<img=" + var199 + ">";
                                    class10.method2806(var197, var200 + var183, var196);
                                }
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 250) {
                            method472(true);
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 26) {
                            for (int var201 = 0; var201 < Statics.field699; var201++) {
                                class47 var202 = (class47) class47.field1074.method3186((long) var201);
                                class47 var203;
                                if (var202 == null) {
                                    byte[] var204 = Statics.field1073.method2751(16, var201);
                                    class47 var205 = new class47();
                                    if (var204 != null) {
                                        var205.method914(new class108(var204));
                                    }
                                    class47.field1074.method3183(var205, (long) var201);
                                    var203 = var205;
                                } else {
                                    var203 = var202;
                                }
                                if (var203 != null) {
                                    class157.field2671[var201] = 0;
                                    class157.field2672[var201] = 0;
                                }
                            }
                            method139();
                            field426 += 32;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 86) {
                            method4(false);
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 85) {
                            field237 = field281.method2299();
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 21) {
                            field328 = field272;
                            if (field446 == 0) {
                                field464 = null;
                                field465 = null;
                                Statics.field1076 = 0;
                                Statics.field57 = null;
                                field283 = -1;
                                var1 = true;
                            } else {
                                field465 = field281.method2270();
                                long var207 = field281.method2133();
                                field464 = class210.method1883(var207);
                                Statics.field1 = field281.method2128();
                                int var209 = field281.method2299();
                                if (var209 == 255) {
                                    field283 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field1076 = var209;
                                    class22[] var210 = new class22[100];
                                    for (int var211 = 0; var211 < Statics.field1076; var211++) {
                                        var210[var211] = new class22();
                                        var210[var211].field565 = field281.method2270();
                                        var210[var211].field569 = class212.method546(var210[var211].field565, Statics.field1901);
                                        var210[var211].field562 = field281.method2129();
                                        var210[var211].field563 = field281.method2128();
                                        field281.method2270();
                                        if (var210[var211].field565.equals(Statics.field163.field39)) {
                                            Statics.field2044 = var210[var211].field563;
                                        }
                                    }
                                    boolean var212 = false;
                                    int var213 = Statics.field1076;
                                    while (var213 > 0) {
                                        boolean var214 = true;
                                        var213--;
                                        for (int var215 = 0; var215 < var213; var215++) {
                                            if (var210[var215].field569.compareTo(var210[var215 + 1].field569) > 0) {
                                                class22 var216 = var210[var215];
                                                var210[var215] = var210[var215 + 1];
                                                var210[var215 + 1] = var216;
                                                var214 = false;
                                            }
                                        }
                                        if (var214) {
                                            break;
                                        }
                                    }
                                    Statics.field57 = var210;
                                    field283 = -1;
                                    var1 = true;
                                }
                            }
                            break label2703;
                        }
                        if (field283 == 39 || field283 == 63 || field283 == 189 || field283 == 12 || field283 == 66 || field283 == 126 || field283 == 163 || field283 == 195 || field283 == 211 || field283 == 41) {
                            method545();
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 130) {
                            int var217 = field281.method2237();
                            String var218 = field281.method2270();
                            class155 var219 = class155.method2386(var217);
                            if (!var218.equals(var219.field2589)) {
                                var219.field2589 = var218;
                                method2391(var219);
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 2) {
                            field405 = field281.method2299();
                            if (field405 == 1) {
                                field458 = field281.method2129();
                            }
                            if (field405 >= 2 && field405 <= 6) {
                                if (field405 == 2) {
                                    field393 = 64;
                                    field263 = 64;
                                }
                                if (field405 == 3) {
                                    field393 = 0;
                                    field263 = 64;
                                }
                                if (field405 == 4) {
                                    field393 = 128;
                                    field263 = 64;
                                }
                                if (field405 == 5) {
                                    field393 = 64;
                                    field263 = 0;
                                }
                                if (field405 == 6) {
                                    field393 = 64;
                                    field263 = 128;
                                }
                                field405 = 2;
                                field259 = field281.method2129();
                                field260 = field281.method2129();
                                field261 = field281.method2299();
                            }
                            if (field405 == 10) {
                                field258 = field281.method2129();
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 46) {
                            int var220 = field281.method2129();
                            if (var220 == 65535) {
                                var220 = -1;
                            }
                            int var221 = field281.method2237();
                            int var222 = field281.method2170();
                            class155 var223 = class155.method2386(var222);
                            if (var223.field2541) {
                                var223.field2648 = var220;
                                var223.field2649 = var221;
                                class46 var225 = class46.method1975(var220);
                                var223.field2612 = var225.field1037;
                                var223.field2582 = var225.field1048;
                                var223.field2583 = var225.field1028;
                                var223.field2579 = var225.field1040;
                                var223.field2580 = var225.field1052;
                                var223.field2594 = var225.field1021;
                                if (var225.field1042 == 1) {
                                    var223.field2532 = 1;
                                } else {
                                    var223.field2532 = 2;
                                }
                                if (var223.field2550 > 0) {
                                    var223.field2594 = var223.field2594 * 32 / var223.field2550;
                                }
                                method2391(var223);
                            } else {
                                if (var220 == -1) {
                                    var223.field2573 = 0;
                                    field283 = -1;
                                    var1 = true;
                                    break label2703;
                                }
                                class46 var224 = class46.method1975(var220);
                                var223.field2573 = 4;
                                var223.field2597 = var220;
                                var223.field2612 = var224.field1037;
                                var223.field2582 = var224.field1048;
                                var223.field2594 = var224.field1021 * 100 / var221;
                                method2391(var223);
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 93) {
                            int var226 = field281.method2129();
                            field302 = var226;
                            method3358(var226);
                            class33.method2559(field302);
                            for (int var227 = 0; var227 < 100; var227++) {
                                field248[var227] = true;
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 117) {
                            int var228 = field281.method2132();
                            class4 var229 = (class4) field396.method3214((long) var228);
                            if (var229 != null) {
                                method1793(var229, true);
                            }
                            if (field424 != null) {
                                method2391(field424);
                                field424 = null;
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 157) {
                            String var230 = field281.method2270();
                            Object[] var231 = new Object[var230.length() + 1];
                            for (int var232 = var230.length() - 1; var232 >= 0; var232--) {
                                if (var230.charAt(var232) == 's') {
                                    var231[var232 + 1] = field281.method2270();
                                } else {
                                    var231[var232 + 1] = Integer.valueOf(field281.method2132());
                                }
                            }
                            var231[0] = Integer.valueOf(field281.method2132());
                            class1 var233 = new class1();
                            var233.field15 = var231;
                            class33.method2543(var233, 200000);
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 236) {
                            method2715();
                            field283 = -1;
                            var1 = false;
                            break label2703;
                        }
                        if (field283 == 3) {
                            int var234 = field281.method2152();
                            int var235 = field281.method2151();
                            int var236 = field281.method2299();
                            Statics.field1880 = var234 >> 1;
                            Statics.field163.method619(var236, var235, (var234 & 0x1) == 1);
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 67) {
                            method139();
                            int var237 = field281.method2112();
                            int var238 = field281.method2170();
                            int var239 = field281.method2112();
                            field379[var239] = var238;
                            field377[var239] = var237;
                            field378[var239] = 1;
                            for (int var240 = 0; var240 < 98; var240++) {
                                if (var238 >= class143.field2142[var240]) {
                                    field378[var239] = var240 + 2;
                                }
                            }
                            field315[++field430 - 1 & 0x1F] = var239;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 168) {
                            int var241 = field281.method2162();
                            int var242 = field281.method2132();
                            class155 var243 = class155.method2386(var242);
                            if (var243.field2573 != 1 || var243.field2597 != var241) {
                                var243.field2573 = 1;
                                var243.field2597 = var241;
                                method2391(var243);
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 110) {
                            field236 = 0;
                            field361 = 0;
                            field281.method2381();
                            int var244 = field281.method2366(1);
                            if (var244 != 0) {
                                int var245 = field281.method2366(2);
                                if (var245 == 0) {
                                    field362[++field361 - 1] = 2047;
                                } else if (var245 == 1) {
                                    int var246 = field281.method2366(3);
                                    Statics.field163.method635(var246, false);
                                    int var247 = field281.method2366(1);
                                    if (var247 == 1) {
                                        field362[++field361 - 1] = 2047;
                                    }
                                } else if (var245 == 2) {
                                    int var248 = field281.method2366(3);
                                    Statics.field163.method635(var248, true);
                                    int var249 = field281.method2366(3);
                                    Statics.field163.method635(var249, true);
                                    int var250 = field281.method2366(1);
                                    if (var250 == 1) {
                                        field362[++field361 - 1] = 2047;
                                    }
                                } else if (var245 == 3) {
                                    int var251 = field281.method2366(1);
                                    if (var251 == 1) {
                                        field362[++field361 - 1] = 2047;
                                    }
                                    int var252 = field281.method2366(7);
                                    int var253 = field281.method2366(1);
                                    int var254 = field281.method2366(7);
                                    Statics.field1880 = field281.method2366(2);
                                    Statics.field163.method619(var252, var254, var253 == 1);
                                }
                            }
                            int var255 = field281.method2366(8);
                            if (var255 < field359) {
                                for (int var256 = var255; var256 < field359; var256++) {
                                    field367[++field236 - 1] = field360[var256];
                                }
                            }
                            if (var255 > field359) {
                                throw new RuntimeException("");
                            }
                            field359 = 0;
                            for (int var257 = 0; var257 < var255; var257++) {
                                int var258 = field360[var257];
                                class3 var259 = field358[var258];
                                int var260 = field281.method2366(1);
                                if (var260 == 0) {
                                    field360[++field359 - 1] = var258;
                                    var259.field793 = field348;
                                } else {
                                    int var261 = field281.method2366(2);
                                    if (var261 == 0) {
                                        field360[++field359 - 1] = var258;
                                        var259.field793 = field348;
                                        field362[++field361 - 1] = var258;
                                    } else if (var261 == 1) {
                                        field360[++field359 - 1] = var258;
                                        var259.field793 = field348;
                                        int var262 = field281.method2366(3);
                                        var259.method635(var262, false);
                                        int var263 = field281.method2366(1);
                                        if (var263 == 1) {
                                            field362[++field361 - 1] = var258;
                                        }
                                    } else if (var261 == 2) {
                                        field360[++field359 - 1] = var258;
                                        var259.field793 = field348;
                                        int var264 = field281.method2366(3);
                                        var259.method635(var264, true);
                                        int var265 = field281.method2366(3);
                                        var259.method635(var265, true);
                                        int var266 = field281.method2366(1);
                                        if (var266 == 1) {
                                            field362[++field361 - 1] = var258;
                                        }
                                    } else if (var261 == 3) {
                                        field367[++field236 - 1] = var258;
                                    }
                                }
                            }
                            while (field281.method2368(field446) >= 11) {
                                int var267 = field281.method2366(11);
                                if (var267 == 2047) {
                                    break;
                                }
                                boolean var268 = false;
                                if (field358[var267] == null) {
                                    field358[var267] = new class3();
                                    if (field400[var267] != null) {
                                        field358[var267].method7(field400[var267]);
                                    }
                                    var268 = true;
                                }
                                field360[++field359 - 1] = var267;
                                class3 var269 = field358[var267];
                                var269.field793 = field348;
                                int var270 = field281.method2366(1);
                                int var271 = field281.method2366(5);
                                if (var271 > 15) {
                                    var271 -= 32;
                                }
                                int var272 = field371[field281.method2366(3)];
                                if (var268) {
                                    var269.field783 = var269.field769 = var272;
                                }
                                int var273 = field281.method2366(5);
                                if (var273 > 15) {
                                    var273 -= 32;
                                }
                                int var274 = field281.method2366(1);
                                if (var274 == 1) {
                                    field362[++field361 - 1] = var267;
                                }
                                var269.method619(Statics.field163.field787[0] + var271, Statics.field163.field788[0] + var273, var270 == 1);
                            }
                            field281.method2367();
                            method2274();
                            for (int var275 = 0; var275 < field236; var275++) {
                                int var276 = field367[var275];
                                if (field348 != field358[var276].field793) {
                                    field358[var276] = null;
                                }
                            }
                            if (field446 != field281.field1841) {
                                throw new RuntimeException(field281.field1841 + class2.field25 + field446);
                            }
                            for (int var277 = 0; var277 < field359; var277++) {
                                if (field358[field360[var277]] == null) {
                                    throw new RuntimeException(var277 + class2.field25 + field359);
                                }
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 49) {
                            class192.method2845(field281, field446);
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 74) {
                            int var278 = field281.method2170();
                            boolean var279 = field281.method2151() == 1;
                            class155 var280 = class155.method2386(var278);
                            if (var280.field2553 != var279) {
                                var280.field2553 = var279;
                                method2391(var280);
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 44) {
                            int var281 = field281.method2299();
                            int var282 = field281.method2299();
                            int var283 = field281.method2299();
                            int var284 = field281.method2299();
                            field487[var281] = true;
                            field488[var281] = var282;
                            field489[var281] = var283;
                            field490[var281] = var284;
                            field491[var281] = 0;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 116) {
                            int var285 = field281.method2132();
                            int var286 = field281.method2160();
                            int var287 = var286 >> 10 & 0x1F;
                            int var288 = var286 >> 5 & 0x1F;
                            int var289 = var286 & 0x1F;
                            int var290 = (var289 << 3) + (var287 << 19) + (var288 << 11);
                            class155 var291 = class155.method2386(var285);
                            if (var291.field2558 != var290) {
                                var291.field2558 = var290;
                                method2391(var291);
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 251) {
                            method139();
                            field425 = field281.method2299();
                            field436 = field272;
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 47) {
                            int var292 = field281.method2169();
                            class155 var293 = class155.method2386(var292);
                            var293.field2573 = 3;
                            var293.field2597 = Statics.field163.field29.method2937();
                            method2391(var293);
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field283 == 164) {
                            Statics.field1574 = field281.method2299();
                            Statics.field3009 = field281.method2151();
                            while (field281.field1841 < field446) {
                                field283 = field281.method2299();
                                method545();
                            }
                            field283 = -1;
                            var1 = true;
                            break label2703;
                        }
                        class137.method483("" + field283 + class2.field25 + field307 + class2.field25 + field289 + class2.field25 + field446, (Throwable) null);
                        method2715();
                    } catch (IOException var409) {
                        if (field286 > 0) {
                            method2715();
                        } else {
                            method469(40);
                            Statics.field1122 = Statics.field516;
                            Statics.field516 = null;
                        }
                    } catch (Exception var410) {
                        String var296 = "" + field283 + class2.field25 + field307 + class2.field25 + field289 + class2.field25 + field446 + class2.field25 + (Statics.field521 + Statics.field163.field787[0]) + class2.field25 + (Statics.field1071 + Statics.field163.field788[0]) + class2.field25;
                        for (int var297 = 0; var297 < field446 && var297 < 50; var297++) {
                            var296 = var296 + field281.field1839[var297] + class2.field25;
                        }
                        class137.method483(var296, var410);
                        method2715();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field411 != 30) {
            return;
        }
        while (class192.method2527()) {
            field279.method2364(97);
            field279.method2113(0);
            int var298 = field279.field1841;
            class192.method609(field279);
            field279.method2124(field279.field1841 - var298);
        }
        Object var299 = Statics.field160.field178;
        synchronized (Statics.field160.field178) {
            if (!field502) {
                Statics.field160.field168 = 0;
            } else if (class129.field2007 != 0 || Statics.field160.field168 >= 40) {
                field279.method2364(178);
                field279.method2113(0);
                int var300 = field279.field1841;
                int var301 = 0;
                for (int var302 = 0; var302 < Statics.field160.field168 && field279.field1841 - var300 < 240; var302++) {
                    var301++;
                    int var303 = Statics.field160.field167[var302];
                    if (var303 < 0) {
                        var303 = 0;
                    } else if (var303 > 502) {
                        var303 = 502;
                    }
                    int var304 = Statics.field160.field171[var302];
                    if (var304 < 0) {
                        var304 = 0;
                    } else if (var304 > 764) {
                        var304 = 764;
                    }
                    int var305 = var303 * 765 + var304;
                    if (Statics.field160.field167[var302] == -1 && Statics.field160.field171[var302] == -1) {
                        var304 = -1;
                        var303 = -1;
                        var305 = 524287;
                    }
                    if (field250 != var304 || field251 != var303) {
                        int var306 = var304 - field250;
                        field250 = var304;
                        int var307 = var303 - field251;
                        field251 = var303;
                        if (field252 < 8 && var306 >= -32 && var306 <= 31 && var307 >= -32 && var307 <= 31) {
                            var306 += 32;
                            var307 += 32;
                            field279.method2114((field252 << 12) + (var306 << 6) + var307);
                            field252 = 0;
                        } else if (field252 < 8) {
                            field279.method2147((field252 << 19) + 8388608 + var305);
                            field252 = 0;
                        } else {
                            field279.method2233((field252 << 19) + -1073741824 + var305);
                            field252 = 0;
                        }
                    } else if (field252 < 2047) {
                        field252++;
                    }
                }
                field279.method2124(field279.field1841 - var300);
                if (var301 >= Statics.field160.field168) {
                    Statics.field160.field168 = 0;
                } else {
                    Statics.field160.field168 -= var301;
                    for (int var308 = 0; var308 < Statics.field160.field168; var308++) {
                        Statics.field160.field171[var308] = Statics.field160.field171[var301 + var308];
                        Statics.field160.field167[var308] = Statics.field160.field167[var301 + var308];
                    }
                }
            }
        }
        if (class129.field2007 == 1 || !Statics.field1896 && class129.field2007 == 4 || class129.field2007 == 2) {
            long var310 = (class129.field1996 - field275 * -1L) / 50L;
            if (var310 > 4095L) {
                var310 = 4095L;
            }
            field275 = class129.field1996 * -1L;
            int var312 = class129.field1999;
            if (var312 < 0) {
                var312 = 0;
            } else if (var312 > 502) {
                var312 = 502;
            }
            int var313 = class129.field2008;
            if (var313 < 0) {
                var313 = 0;
            } else if (var313 > 764) {
                var313 = 764;
            }
            int var314 = var312 * 765 + var313;
            byte var315 = 0;
            if (class129.field2007 == 2) {
                var315 = 1;
            }
            int var316 = (int) var310;
            field279.method2364(29);
            field279.method2233((var315 << 19) + (var316 << 20) + var314);
        }
        if (class126.field1973 > 0) {
            field279.method2364(64);
            field279.method2114(0);
            int var317 = field279.field1841;
            long var318 = class104.method27();
            for (int var320 = 0; var320 < class126.field1973; var320++) {
                long var321 = var318 - field435;
                if (var321 > 16777215L) {
                    var321 = 16777215L;
                }
                field435 = var318;
                field279.method2150(class126.field1971[var320]);
                field279.method2257((int) var321);
            }
            field279.method2123(field279.field1841 - var317);
        }
        if (field327 > 0) {
            field327--;
        }
        if (class126.field1966[96] || class126.field1966[97] || class126.field1966[98] || class126.field1966[99]) {
            field290 = true;
        }
        if (field290 && field327 <= 0) {
            field327 = 20;
            field290 = false;
            field279.method2364(197);
            field279.method2157(field404);
            field279.method2158(field271);
        }
        if (Statics.field967 && !field253) {
            field253 = true;
            field279.method2364(179);
            field279.method2113(1);
        }
        if (!Statics.field967 && field253) {
            field253 = false;
            field279.method2364(179);
            field279.method2113(0);
        }
        method3388();
        if (field411 != 30) {
            return;
        }
        method2491();
        int var10002;
        for (int var323 = 0; var323 < field320; var323++) {
            var10002 = field483[var323]--;
            if (field483[var323] >= -10) {
                class53 var325 = field485[var323];
                if (var325 == null) {
                    class53 var411 = (class53) null;
                    var325 = class53.method1075(Statics.field1499, field481[var323], 0);
                    if (var325 == null) {
                        continue;
                    }
                    field483[var323] += var325.method1069();
                    field485[var323] = var325;
                }
                if (field483[var323] < 0) {
                    int var332;
                    if (field484[var323] == 0) {
                        var332 = field475;
                    } else {
                        int var326 = (field484[var323] & 0xFF) * 128;
                        int var327 = field484[var323] >> 16 & 0xFF;
                        int var328 = var327 * 128 + 64 - Statics.field163.field747;
                        if (var328 < 0) {
                            var328 = -var328;
                        }
                        int var329 = field484[var323] >> 8 & 0xFF;
                        int var330 = var329 * 128 + 64 - Statics.field163.field749;
                        if (var330 < 0) {
                            var330 = -var330;
                        }
                        int var331 = var328 + var330 - 128;
                        if (var331 > var326) {
                            field483[var323] = -100;
                            continue;
                        }
                        if (var331 < 0) {
                            var331 = 0;
                        }
                        var332 = field479 * (var326 - var331) / var326;
                    }
                    if (var332 > 0) {
                        class57 var333 = var325.method1068().method1110(Statics.field804);
                        class59 var334 = class59.method1171(var333, 100, var332);
                        var334.method1136(field295[var323] - 1);
                        Statics.field1942.method972(var334);
                    }
                    field483[var323] = -100;
                }
            } else {
                field320--;
                for (int var324 = var323; var324 < field320; var324++) {
                    field481[var324] = field481[var324 + 1];
                    field485[var324] = field485[var324 + 1];
                    field295[var324] = field295[var324 + 1];
                    field483[var324] = field483[var324 + 1];
                    field484[var324] = field484[var324 + 1];
                }
                var323--;
            }
        }
        if (field477 && !class164.method548()) {
            if (field294 != 0 && field476 != -1) {
                class164.method2618(Statics.field2800, field476, 0, field294, false);
            }
            field477 = false;
        }
        field284++;
        if (field284 <= 750) {
            method1399();
            method1619();
            method82();
            field313++;
            if (field455 != 0) {
                field346 += 20;
                if (field346 >= 400) {
                    field455 = 0;
                }
            }
            if (Statics.field285 != null) {
                field349++;
                if (field349 >= 15) {
                    method2391(Statics.field285);
                    Statics.field285 = null;
                }
            }
            class155 var335 = Statics.field1458;
            class155 var336 = Statics.field646;
            Statics.field1458 = null;
            Statics.field646 = null;
            field416 = null;
            field420 = false;
            field417 = false;
            field460 = 0;
            while (class126.method3399() && field460 < 128) {
                if (field407 >= 2 && class126.field1966[82] && Statics.field2838 == 66) {
                    String var337 = class10.method2058();
                    Statics.field172.setContents(new StringSelection(var337), (ClipboardOwner) null);
                } else {
                    field462[field460] = Statics.field2838;
                    field461[field460] = Statics.field2006;
                    field460++;
                }
            }
            Statics.method10(field302, 0, 0, 765, 503, 0, 0);
            field272++;
            while (true) {
                class1 var338;
                class155 var339;
                class155 var340;
                do {
                    var338 = (class1) field299.method3249();
                    if (var338 == null) {
                        while (true) {
                            class1 var341;
                            class155 var342;
                            class155 var343;
                            do {
                                var341 = (class1) field442.method3249();
                                if (var341 == null) {
                                    while (true) {
                                        class1 var344;
                                        class155 var345;
                                        class155 var346;
                                        do {
                                            var344 = (class1) field419.method3249();
                                            if (var344 == null) {
                                                method52();
                                                if (Statics.field792 == null && field305 == null) {
                                                    int var347 = class129.field2007;
                                                    if (field381) {
                                                        if (var347 != 1 && (Statics.field1896 || var347 != 4)) {
                                                            int var348 = class129.field2001;
                                                            int var349 = class129.field2002;
                                                            if (var348 < Statics.field1577 - 10 || var348 > Statics.field2817 + Statics.field1577 + 10 || var349 < Statics.field1015 - 10 || var349 > Statics.field1131 + Statics.field1015 + 10) {
                                                                field381 = false;
                                                                method2(Statics.field1577, Statics.field1015, Statics.field2817, Statics.field1131);
                                                            }
                                                        }
                                                        if (var347 == 1 || !Statics.field1896 && var347 == 4) {
                                                            int var350 = Statics.field1577;
                                                            int var351 = Statics.field1015;
                                                            int var352 = Statics.field2817;
                                                            int var353 = class129.field2008;
                                                            int var354 = class129.field1999;
                                                            int var355 = -1;
                                                            for (int var356 = 0; var356 < field478; var356++) {
                                                                int var357 = (field478 - 1 - var356) * 15 + var351 + 31;
                                                                if (var353 > var350 && var353 < var350 + var352 && var354 > var357 - 13 && var354 < var357 + 3) {
                                                                    var355 = var356;
                                                                }
                                                            }
                                                            if (var355 != -1) {
                                                                method549(var355);
                                                            }
                                                            field381 = false;
                                                            method2(Statics.field1577, Statics.field1015, Statics.field2817, Statics.field1131);
                                                        }
                                                    } else {
                                                        label2908: {
                                                            if ((var347 == 1 || !Statics.field1896 && var347 == 4) && field478 > 0) {
                                                                int var358 = field385[field478 - 1];
                                                                if (var358 == 39 || var358 == 40 || var358 == 41 || var358 == 42 || var358 == 43 || var358 == 33 || var358 == 34 || var358 == 35 || var358 == 36 || var358 == 37 || var358 == 38 || var358 == 1005) {
                                                                    int var359 = field383[field478 - 1];
                                                                    int var360 = field384[field478 - 1];
                                                                    class155 var361 = class155.method2386(var360);
                                                                    if (class159.method78(method25(var361)) || class159.method1383(method25(var361))) {
                                                                        if (Statics.field792 != null && !field355 && field395 != 1) {
                                                                            int var362 = field478 - 1;
                                                                            boolean var363;
                                                                            if (var362 < 0) {
                                                                                var363 = false;
                                                                            } else {
                                                                                int var364 = field385[var362];
                                                                                if (var364 >= 2000) {
                                                                                    var364 -= 2000;
                                                                                }
                                                                                if (var364 == 1007) {
                                                                                    var363 = true;
                                                                                } else {
                                                                                    var363 = false;
                                                                                }
                                                                            }
                                                                            if (!var363 && field478 > 0) {
                                                                                method1981(field297, field353);
                                                                            }
                                                                        }
                                                                        field355 = false;
                                                                        field356 = 0;
                                                                        if (Statics.field792 != null) {
                                                                            method2391(Statics.field792);
                                                                        }
                                                                        Statics.field792 = class155.method2386(var360);
                                                                        field351 = var359;
                                                                        field297 = class129.field2008;
                                                                        field353 = class129.field1999;
                                                                        if (field478 > 0) {
                                                                            method3376(field478 - 1);
                                                                        }
                                                                        method2391(Statics.field792);
                                                                        break label2908;
                                                                    }
                                                                }
                                                            }
                                                            if (var347 == 1 || !Statics.field1896 && var347 == 4) {
                                                                label2906: {
                                                                    if (field395 != 1 || field478 <= 2) {
                                                                        int var365 = field478 - 1;
                                                                        boolean var366;
                                                                        if (var365 < 0) {
                                                                            var366 = false;
                                                                        } else {
                                                                            int var367 = field385[var365];
                                                                            if (var367 >= 2000) {
                                                                                var367 -= 2000;
                                                                            }
                                                                            if (var367 == 1007) {
                                                                                var366 = true;
                                                                            } else {
                                                                                var366 = false;
                                                                            }
                                                                        }
                                                                        if (!var366) {
                                                                            break label2906;
                                                                        }
                                                                    }
                                                                    var347 = 2;
                                                                }
                                                            }
                                                            if ((var347 == 1 || !Statics.field1896 && var347 == 4) && field478 > 0) {
                                                                method549(field478 - 1);
                                                            }
                                                            if (var347 == 2 && field478 > 0) {
                                                                method2387(class129.field2008, class129.field1999);
                                                            }
                                                        }
                                                    }
                                                }
                                                if (field305 != null) {
                                                    method2391(field305);
                                                    Statics.field165++;
                                                    if (field420 && field417) {
                                                        int var368 = class129.field2001;
                                                        int var369 = class129.field2002;
                                                        int var370 = var368 - field414;
                                                        int var371 = var369 - field415;
                                                        if (var370 < field287) {
                                                            var370 = field287;
                                                        }
                                                        if (field305.field2550 + var370 > field287 + field433.field2550) {
                                                            var370 = field287 + field433.field2550 - field305.field2550;
                                                        }
                                                        if (var371 < field366) {
                                                            var371 = field366;
                                                        }
                                                        if (field305.field2551 + var371 > field366 + field433.field2551) {
                                                            var371 = field366 + field433.field2551 - field305.field2551;
                                                        }
                                                        int var372 = var370 - field401;
                                                        int var373 = var371 - field422;
                                                        int var374 = field305.field2578;
                                                        if (Statics.field165 > field305.field2606 && (var372 > var374 || var372 < -var374 || var373 > var374 || var373 < -var374)) {
                                                            field423 = true;
                                                        }
                                                        int var375 = field433.field2554 + (var370 - field287);
                                                        int var376 = field433.field2555 + (var371 - field366);
                                                        if (field305.field2618 != null && field423) {
                                                            class1 var377 = new class1();
                                                            var377.field3 = field305;
                                                            var377.field4 = var375;
                                                            var377.field5 = var376;
                                                            var377.field15 = field305.field2618;
                                                            class33.method2543(var377, 200000);
                                                        }
                                                        if (class129.field2000 == 0) {
                                                            if (field423) {
                                                                if (field305.field2536 != null) {
                                                                    class1 var378 = new class1();
                                                                    var378.field3 = field305;
                                                                    var378.field4 = var375;
                                                                    var378.field5 = var376;
                                                                    var378.field7 = field416;
                                                                    var378.field15 = field305.field2536;
                                                                    class33.method2543(var378, 200000);
                                                                }
                                                                if (field416 != null) {
                                                                    class155 var379 = field305;
                                                                    int var380 = method25(var379);
                                                                    int var381 = var380 >> 17 & 0x7;
                                                                    int var382 = var381;
                                                                    class155 var383;
                                                                    if (var381 == 0) {
                                                                        var383 = null;
                                                                    } else {
                                                                        int var384 = 0;
                                                                        while (true) {
                                                                            if (var384 >= var382) {
                                                                                var383 = var379;
                                                                                break;
                                                                            }
                                                                            var379 = class155.method2386(var379.field2531);
                                                                            if (var379 == null) {
                                                                                var383 = null;
                                                                                break;
                                                                            }
                                                                            var384++;
                                                                        }
                                                                    }
                                                                    if (var383 != null) {
                                                                        field279.method2364(98);
                                                                        field279.method2168(field416.field2662);
                                                                        field279.method2210(field305.field2662);
                                                                        field279.method2157(field416.field2543);
                                                                        field279.method2159(field416.field2648);
                                                                        field279.method2159(field305.field2543);
                                                                        field279.method2159(field305.field2648);
                                                                    }
                                                                }
                                                            } else {
                                                                label2861: {
                                                                    label1912: {
                                                                        if (field395 != 1) {
                                                                            int var385 = field478 - 1;
                                                                            boolean var386;
                                                                            if (var385 < 0) {
                                                                                var386 = false;
                                                                            } else {
                                                                                int var387 = field385[var385];
                                                                                if (var387 >= 2000) {
                                                                                    var387 -= 2000;
                                                                                }
                                                                                if (var387 == 1007) {
                                                                                    var386 = true;
                                                                                } else {
                                                                                    var386 = false;
                                                                                }
                                                                            }
                                                                            if (!var386) {
                                                                                break label1912;
                                                                            }
                                                                        }
                                                                        if (field478 > 2) {
                                                                            method2387(field414 + field401, field422 + field415);
                                                                            break label2861;
                                                                        }
                                                                    }
                                                                    if (field478 > 0) {
                                                                        method1981(field414 + field401, field422 + field415);
                                                                    }
                                                                }
                                                            }
                                                            field305 = null;
                                                        }
                                                    } else if (Statics.field165 > 1) {
                                                        field305 = null;
                                                    }
                                                }
                                                if (Statics.field792 != null) {
                                                    method2391(Statics.field792);
                                                    field356++;
                                                    if (class129.field2000 == 0) {
                                                        if (!field355) {
                                                            label2863: {
                                                                label1886: {
                                                                    if (field395 != 1) {
                                                                        int var394 = field478 - 1;
                                                                        boolean var395;
                                                                        if (var394 < 0) {
                                                                            var395 = false;
                                                                        } else {
                                                                            int var396 = field385[var394];
                                                                            if (var396 >= 2000) {
                                                                                var396 -= 2000;
                                                                            }
                                                                            if (var396 == 1007) {
                                                                                var395 = true;
                                                                            } else {
                                                                                var395 = false;
                                                                            }
                                                                        }
                                                                        if (!var395) {
                                                                            break label1886;
                                                                        }
                                                                    }
                                                                    if (field478 > 2) {
                                                                        method2387(field297, field353);
                                                                        break label2863;
                                                                    }
                                                                }
                                                                if (field478 > 0) {
                                                                    method1981(field297, field353);
                                                                }
                                                            }
                                                        } else if (Statics.field792 == Statics.field1353 && field354 != field351) {
                                                            class155 var388 = Statics.field792;
                                                            byte var389 = 0;
                                                            if (field403 == 1 && var388.field2545 == 206) {
                                                                var389 = 1;
                                                            }
                                                            if (var388.field2615[field354] <= 0) {
                                                                var389 = 0;
                                                            }
                                                            if (class159.method1383(method25(var388))) {
                                                                int var390 = field351;
                                                                int var391 = field354;
                                                                var388.field2615[var391] = var388.field2615[var390];
                                                                var388.field2647[var391] = var388.field2647[var390];
                                                                var388.field2615[var390] = -1;
                                                                var388.field2647[var390] = 0;
                                                            } else if (var389 == 1) {
                                                                int var392 = field351;
                                                                int var393 = field354;
                                                                while (var392 != var393) {
                                                                    if (var392 > var393) {
                                                                        var388.method2860(var392 - 1, var392);
                                                                        var392--;
                                                                    } else if (var392 < var393) {
                                                                        var388.method2860(var392 + 1, var392);
                                                                        var392++;
                                                                    }
                                                                }
                                                            } else {
                                                                var388.method2860(field354, field351);
                                                            }
                                                            field279.method2364(230);
                                                            field279.method2159(field354);
                                                            field279.method2113(var389);
                                                            field279.method2233(Statics.field792.field2662);
                                                            field279.method2157(field351);
                                                        }
                                                        field349 = 10;
                                                        class129.field2007 = 0;
                                                        Statics.field792 = null;
                                                    } else if (field356 >= 5 && (class129.field2001 > field297 + 5 || class129.field2001 < field297 - 5 || class129.field2002 > field353 + 5 || class129.field2002 < field353 - 5)) {
                                                        field355 = true;
                                                    }
                                                }
                                                if (class80.field1391 != -1) {
                                                    int var397 = class80.field1391;
                                                    int var398 = class80.field1387;
                                                    field279.method2364(70);
                                                    field279.method2113(5);
                                                    field279.method2239(class126.field1966[82] ? (class126.field1966[81] ? 2 : 1) : 0);
                                                    field279.method2114(Statics.field521 + var397);
                                                    field279.method2158(Statics.field1071 + var398);
                                                    class80.field1391 = -1;
                                                    field352 = class129.field2008;
                                                    field345 = class129.field1999;
                                                    field455 = 1;
                                                    field346 = 0;
                                                    field370 = var397;
                                                    field472 = var398;
                                                }
                                                if (Statics.field1458 != var335) {
                                                    if (var335 != null) {
                                                        method2391(var335);
                                                    }
                                                    if (Statics.field1458 != null) {
                                                        method2391(Statics.field1458);
                                                    }
                                                }
                                                if (Statics.field646 != var336 && field467 == field392) {
                                                    if (var336 != null) {
                                                        method2391(var336);
                                                    }
                                                    if (Statics.field646 != null) {
                                                        method2391(Statics.field646);
                                                    }
                                                }
                                                if (Statics.field646 == null) {
                                                    if (field467 > 0) {
                                                        field467--;
                                                    }
                                                } else if (field467 < field392) {
                                                    field467++;
                                                    if (field467 == field392) {
                                                        method2391(Statics.field646);
                                                    }
                                                }
                                                method131();
                                                if (field486) {
                                                    method1792();
                                                }
                                                for (int var399 = 0; var399 < 5; var399++) {
                                                    var10002 = field491[var399]++;
                                                }
                                                int var400 = class129.method482();
                                                int var401 = class126.method514();
                                                if (var400 > 15000 && var401 > 15000) {
                                                    field286 = 250;
                                                    class129.method2327(14500);
                                                    field279.method2364(136);
                                                }
                                                field369++;
                                                if (field369 > 500) {
                                                    field369 = 0;
                                                    int var402 = (int) (Math.random() * 8.0D);
                                                    if ((var402 & 0x1) == 1) {
                                                        field301 += field296;
                                                    }
                                                    if ((var402 & 0x2) == 2) {
                                                        field303 += field304;
                                                    }
                                                    if ((var402 & 0x4) == 4) {
                                                        field410 += field306;
                                                    }
                                                }
                                                if (field301 < -50) {
                                                    field296 = 2;
                                                }
                                                if (field301 > 50) {
                                                    field296 = -2;
                                                }
                                                if (field303 < -55) {
                                                    field304 = 2;
                                                }
                                                if (field303 > 55) {
                                                    field304 = -2;
                                                }
                                                if (field410 < -40) {
                                                    field306 = 1;
                                                }
                                                if (field410 > 40) {
                                                    field306 = -1;
                                                }
                                                field322++;
                                                if (field322 > 500) {
                                                    field322 = 0;
                                                    int var403 = (int) (Math.random() * 8.0D);
                                                    if ((var403 & 0x1) == 1) {
                                                        field321 += field309;
                                                    }
                                                    if ((var403 & 0x2) == 2) {
                                                        field310 += field311;
                                                    }
                                                }
                                                if (field321 < -60) {
                                                    field309 = 2;
                                                }
                                                if (field321 > 60) {
                                                    field309 = -2;
                                                }
                                                if (field310 < -20) {
                                                    field311 = 1;
                                                }
                                                if (field310 > 10) {
                                                    field311 = -1;
                                                }
                                                for (class35 var404 = (class35) field495.method3208(); var404 != null; var404 = (class35) field495.method3212()) {
                                                    if ((long) var404.field796 < class104.method27() / 1000L - 5L) {
                                                        if (var404.field797 > 0) {
                                                            class10.method2806(5, "", var404.field802 + class145.field2307);
                                                        }
                                                        if (var404.field797 == 0) {
                                                            class10.method2806(5, "", var404.field802 + class145.field2308);
                                                        }
                                                        var404.method3350();
                                                    }
                                                }
                                                field246++;
                                                if (field246 > 50) {
                                                    field279.method2364(120);
                                                }
                                                try {
                                                    if (Statics.field516 != null && field279.field1841 > 0) {
                                                        Statics.field516.method2601(field279.field1839, 0, field279.field1841);
                                                        field279.field1841 = 0;
                                                        field246 = 0;
                                                    }
                                                } catch (IOException var407) {
                                                    if (field286 > 0) {
                                                        method2715();
                                                    } else {
                                                        method469(40);
                                                        Statics.field1122 = Statics.field516;
                                                        Statics.field516 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var345 = var344.field3;
                                            if (var345.field2543 < 0) {
                                                break;
                                            }
                                            var346 = class155.method2386(var345.field2531);
                                        } while (var346 == null || var346.field2652 == null || var345.field2543 >= var346.field2652.length || var346.field2652[var345.field2543] != var345);
                                        class33.method2543(var344, 200000);
                                    }
                                }
                                var342 = var341.field3;
                                if (var342.field2543 < 0) {
                                    break;
                                }
                                var343 = class155.method2386(var342.field2531);
                            } while (var343 == null || var343.field2652 == null || var342.field2543 >= var343.field2652.length || var343.field2652[var342.field2543] != var342);
                            class33.method2543(var341, 200000);
                        }
                    }
                    var339 = var338.field3;
                    if (var339.field2543 < 0) {
                        break;
                    }
                    var340 = class155.method2386(var339.field2531);
                } while (var340 == null || var340.field2652 == null || var339.field2543 >= var340.field2652.length || var340.field2652[var339.field2543] != var339);
                class33.method2543(var338, 200000);
            }
        } else if (field286 > 0) {
            method2715();
        } else {
            method469(40);
            Statics.field1122 = Statics.field516;
            Statics.field516 = null;
        }
    }

    @ObfuscatedName("y.d(B)V")
    public static final void method518() {
        if (Statics.field1006 != null) {
            Statics.field1006.method1028();
        }
        if (Statics.field2914 != null) {
            Statics.field2914.method1028();
        }
    }

    @ObfuscatedName("client.y(Lar;IIII)V")
    public static void method465(class39 arg0, int arg1, int arg2, int arg3) {
        if (field320 >= 50 || field479 == 0 || arg0.field920 == null || arg1 >= arg0.field920.length) {
            return;
        }
        int var4 = arg0.field920[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field481[field320] = var5;
        field295[field320] = var6;
        field483[field320] = 0;
        field485[field320] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field484[field320] = (var8 << 16) + (var9 << 8) + var7;
        field320++;
    }

    @ObfuscatedName("gy.a(I)V")
    public static final void method3388() {
        if (field244 && Statics.field1880 != field291) {
            method2580(Statics.field1920, Statics.field535, Statics.field1880, Statics.field163.field787[0], Statics.field163.field788[0]);
        } else if (Statics.field1880 != field278) {
            field278 = Statics.field1880;
            method2562(Statics.field1880);
        }
    }

    @ObfuscatedName("i.n(I)V")
    public static final void method82() {
        for (int var0 = -1; var0 < field359; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field360[var0];
            }
            class3 var2 = field358[var1];
            if (var2 != null && var2.field735 > 0) {
                var2.field735--;
                if (var2.field735 == 0) {
                    var2.field738 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field277; var3++) {
            int var4 = field298[var3];
            class31 var5 = field276[var4];
            if (var5 != null && var5.field735 > 0) {
                var5.field735--;
                if (var5.field735 == 0) {
                    var5.field738 = null;
                }
            }
        }
    }

    @ObfuscatedName("c.ae(Ljava/lang/String;I)V")
    public static final void method150(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field140.field128 = !Statics.field140.field128;
            class9.method62();
            if (Statics.field140.field128) {
                class10.method2806(99, "", "Roofs are now all hidden");
            } else {
                class10.method2806(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field407 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field254 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field254 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field286 > 0) {
                    method2715();
                } else {
                    method469(40);
                    Statics.field1122 = Statics.field516;
                    Statics.field516 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field241 == 2) {
                throw new RuntimeException();
            }
        }
        field279.method2364(241);
        field279.method2113(arg0.length() + 1);
        field279.method2212(arg0);
    }

    @ObfuscatedName("ct.ay(B)V")
    public static final void method1792() {
        int var0 = Statics.field2771 * 128 + 64;
        int var1 = Statics.field86 * 128 + 64;
        int var2 = method1974(var0, var1, Statics.field1880) - Statics.field48;
        if (Statics.field2064 < var0) {
            Statics.field2064 += Statics.field716 * (var0 - Statics.field2064) / 1000 + Statics.field2412;
            if (Statics.field2064 > var0) {
                Statics.field2064 = var0;
            }
        }
        if (Statics.field2064 > var0) {
            Statics.field2064 -= Statics.field716 * (Statics.field2064 - var0) / 1000 + Statics.field2412;
            if (Statics.field2064 < var0) {
                Statics.field2064 = var0;
            }
        }
        if (Statics.field901 < var2) {
            Statics.field901 += Statics.field716 * (var2 - Statics.field901) / 1000 + Statics.field2412;
            if (Statics.field901 > var2) {
                Statics.field901 = var2;
            }
        }
        if (Statics.field901 > var2) {
            Statics.field901 -= Statics.field716 * (Statics.field901 - var2) / 1000 + Statics.field2412;
            if (Statics.field901 < var2) {
                Statics.field901 = var2;
            }
        }
        if (Statics.field1662 < var1) {
            Statics.field1662 += Statics.field716 * (var1 - Statics.field1662) / 1000 + Statics.field2412;
            if (Statics.field1662 > var1) {
                Statics.field1662 = var1;
            }
        }
        if (Statics.field1662 > var1) {
            Statics.field1662 -= Statics.field716 * (Statics.field1662 - var1) / 1000 + Statics.field2412;
            if (Statics.field1662 < var1) {
                Statics.field1662 = var1;
            }
        }
        int var3 = Statics.field144 * 128 + 64;
        int var4 = Statics.field2799 * 128 + 64;
        int var5 = method1974(var3, var4, Statics.field1880) - Statics.field69;
        int var6 = var3 - Statics.field2064;
        int var7 = var5 - Statics.field901;
        int var8 = var4 - Statics.field1662;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field132 < var10) {
            Statics.field132 += Statics.field1669 * (var10 - Statics.field132) / 1000 + Statics.field1898;
            if (Statics.field132 > var10) {
                Statics.field132 = var10;
            }
        }
        if (Statics.field132 > var10) {
            Statics.field132 -= Statics.field1669 * (Statics.field132 - var10) / 1000 + Statics.field1898;
            if (Statics.field132 < var10) {
                Statics.field132 = var10;
            }
        }
        int var12 = var11 - Statics.field2565;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field2565 += Statics.field1669 * var12 / 1000 + Statics.field1898;
            Statics.field2565 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field2565 -= Statics.field1669 * -var12 / 1000 + Statics.field1898;
            Statics.field2565 &= 0x7FF;
        }
        int var13 = var11 - Statics.field2565;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field2565 = var11;
        }
    }

    @ObfuscatedName("q.ac(I)V")
    public static final void method131() {
        int var0 = field301 + Statics.field163.field747;
        int var1 = field303 + Statics.field163.field749;
        if (Statics.field2981 - var0 < -500 || Statics.field2981 - var0 > 500 || Statics.field1844 - var1 < -500 || Statics.field1844 - var1 > 500) {
            Statics.field2981 = var0;
            Statics.field1844 = var1;
        }
        if (Statics.field2981 != var0) {
            Statics.field2981 += (var0 - Statics.field2981) / 16;
        }
        if (Statics.field1844 != var1) {
            Statics.field1844 += (var1 - Statics.field1844) / 16;
        }
        if (class129.field2000 == 4 && Statics.field1896) {
            int var2 = class129.field2002 - field326;
            field324 = var2 * 2;
            field326 = var2 == -1 || var2 == 1 ? class129.field2002 : (field326 + class129.field2002) / 2;
            int var3 = field325 - class129.field2001;
            field323 = var3 * 2;
            field325 = var3 == -1 || var3 == 1 ? class129.field2001 : (field325 + class129.field2001) / 2;
        } else {
            if (class126.field1966[96]) {
                field323 += (-24 - field323) / 2;
            } else if (class126.field1966[97]) {
                field323 += (24 - field323) / 2;
            } else {
                field323 /= 2;
            }
            if (class126.field1966[98]) {
                field324 += (12 - field324) / 2;
            } else if (class126.field1966[99]) {
                field324 += (-12 - field324) / 2;
            } else {
                field324 /= 2;
            }
            field326 = class129.field2002;
            field325 = class129.field2001;
        }
        field404 = field323 / 2 + field404 & 0x7FF;
        field271 += field324 / 2;
        if (field271 < 128) {
            field271 = 128;
        }
        if (field271 > 383) {
            field271 = 383;
        }
        int var4 = Statics.field2981 >> 7;
        int var5 = Statics.field1844 >> 7;
        int var6 = method1974(Statics.field2981, Statics.field1844, Statics.field1880);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1880;
                    if (var10 < 3 && (class6.field71[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field87[var10][var8][var9];
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
        if (var12 > field500) {
            field500 += (var12 - field500) / 24;
        } else if (var12 < field500) {
            field500 += (var12 - field500) / 80;
        }
    }

    @ObfuscatedName("bo.ag(I)V")
    public static final void method1399() {
        for (int var0 = -1; var0 < field359; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field360[var0];
            }
            class3 var2 = field358[var1];
            if (var2 != null) {
                method138(var2, 1);
            }
        }
    }

    @ObfuscatedName("bc.am(I)V")
    public static final void method1619() {
        for (int var0 = 0; var0 < field277; var0++) {
            int var1 = field298[var0];
            class31 var2 = field276[var1];
            if (var2 != null) {
                method138(var2, var2.field703.field844);
            }
        }
    }

    @ObfuscatedName("w.au(Lab;II)V")
    public static final void method138(class34 arg0, int arg1) {
        if (arg0.field778 > field348) {
            int var2 = arg0.field778 - field348;
            int var3 = arg0.field774 * 128 + arg0.field737 * 64;
            int var4 = arg0.field777 * 128 + arg0.field737 * 64;
            arg0.field747 += (var3 - arg0.field747) / var2;
            arg0.field749 += (var4 - arg0.field749) / var2;
            arg0.field759 = 0;
            if (arg0.field780 == 0) {
                arg0.field783 = 1024;
            }
            if (arg0.field780 == 1) {
                arg0.field783 = 1536;
            }
            if (arg0.field780 == 2) {
                arg0.field783 = 0;
            }
            if (arg0.field780 == 3) {
                arg0.field783 = 512;
            }
        } else if (arg0.field779 >= field348) {
            method1980(arg0);
        } else {
            arg0.field761 = arg0.field766;
            if (arg0.field755 == 0) {
                arg0.field759 = 0;
            } else {
                label221: {
                    if (arg0.field764 != -1 && arg0.field767 == 0) {
                        class39 var5 = class39.method633(arg0.field764);
                        if (arg0.field791 > 0 && var5.field917 == 0) {
                            arg0.field759++;
                            break label221;
                        }
                        if (arg0.field791 <= 0 && var5.field929 == 0) {
                            arg0.field759++;
                            break label221;
                        }
                    }
                    int var6 = arg0.field747;
                    int var7 = arg0.field749;
                    int var8 = arg0.field787[arg0.field755 - 1] * 128 + arg0.field737 * 64;
                    int var9 = arg0.field788[arg0.field755 - 1] * 128 + arg0.field737 * 64;
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        if (var6 < var8) {
                            if (var7 < var9) {
                                arg0.field783 = 1280;
                            } else if (var7 > var9) {
                                arg0.field783 = 1792;
                            } else {
                                arg0.field783 = 1536;
                            }
                        } else if (var6 > var8) {
                            if (var7 < var9) {
                                arg0.field783 = 768;
                            } else if (var7 > var9) {
                                arg0.field783 = 256;
                            } else {
                                arg0.field783 = 512;
                            }
                        } else if (var7 < var9) {
                            arg0.field783 = 1024;
                        } else if (var7 > var9) {
                            arg0.field783 = 0;
                        }
                        int var10 = arg0.field783 - arg0.field769 & 0x7FF;
                        if (var10 > 1024) {
                            var10 -= 2048;
                        }
                        int var11 = arg0.field742;
                        if (var10 >= -256 && var10 <= 256) {
                            var11 = arg0.field740;
                        } else if (var10 >= 256 && var10 < 768) {
                            var11 = arg0.field744;
                        } else if (var10 >= -768 && var10 <= -256) {
                            var11 = arg0.field760;
                        }
                        if (var11 == -1) {
                            var11 = arg0.field740;
                        }
                        arg0.field761 = var11;
                        int var12 = 4;
                        boolean var13 = true;
                        if (arg0 instanceof class31) {
                            var13 = ((class31) arg0).field703.field839;
                        }
                        if (var13) {
                            if (arg0.field783 != arg0.field769 && arg0.field758 == -1 && arg0.field785 != 0) {
                                var12 = 2;
                            }
                            if (arg0.field755 > 2) {
                                var12 = 6;
                            }
                            if (arg0.field755 > 3) {
                                var12 = 8;
                            }
                            if (arg0.field759 > 0 && arg0.field755 > 1) {
                                var12 = 8;
                                arg0.field759--;
                            }
                        } else {
                            if (arg0.field755 > 1) {
                                var12 = 6;
                            }
                            if (arg0.field755 > 2) {
                                var12 = 8;
                            }
                            if (arg0.field759 > 0 && arg0.field755 > 1) {
                                var12 = 8;
                                arg0.field759--;
                            }
                        }
                        if (arg0.field781[arg0.field755 - 1]) {
                            var12 <<= 0x1;
                        }
                        if (var12 >= 8 && arg0.field761 == arg0.field740 && arg0.field741 != -1) {
                            arg0.field761 = arg0.field741;
                        }
                        if (var6 < var8) {
                            arg0.field747 += var12;
                            if (arg0.field747 > var8) {
                                arg0.field747 = var8;
                            }
                        } else if (var6 > var8) {
                            arg0.field747 -= var12;
                            if (arg0.field747 < var8) {
                                arg0.field747 = var8;
                            }
                        }
                        if (var7 < var9) {
                            arg0.field749 += var12;
                            if (arg0.field749 > var9) {
                                arg0.field749 = var9;
                            }
                        } else if (var7 > var9) {
                            arg0.field749 -= var12;
                            if (arg0.field749 < var9) {
                                arg0.field749 = var9;
                            }
                        }
                        if (arg0.field747 == var8 && arg0.field749 == var9) {
                            arg0.field755--;
                            if (arg0.field791 > 0) {
                                arg0.field791--;
                            }
                        }
                    } else {
                        arg0.field747 = var8;
                        arg0.field749 = var9;
                    }
                }
            }
        }
        if (arg0.field747 < 128 || arg0.field749 < 128 || arg0.field747 >= 13184 || arg0.field749 >= 13184) {
            arg0.field764 = -1;
            arg0.field786 = -1;
            arg0.field778 = 0;
            arg0.field779 = 0;
            arg0.field747 = arg0.field787[0] * 128 + arg0.field737 * 64;
            arg0.field749 = arg0.field788[0] * 128 + arg0.field737 * 64;
            arg0.method623();
        }
        if (Statics.field163 == arg0 && (arg0.field747 < 1536 || arg0.field749 < 1536 || arg0.field747 >= 11776 || arg0.field749 >= 11776)) {
            arg0.field764 = -1;
            arg0.field786 = -1;
            arg0.field778 = 0;
            arg0.field779 = 0;
            arg0.field747 = arg0.field787[0] * 128 + arg0.field737 * 64;
            arg0.field749 = arg0.field788[0] * 128 + arg0.field737 * 64;
            arg0.method623();
        }
        method2470(arg0);
        method858(arg0);
    }

    @ObfuscatedName("cz.ai(Lab;I)V")
    public static final void method1980(class34 arg0) {
        if (field348 == arg0.field779 || arg0.field764 == -1 || arg0.field767 != 0 || arg0.field782 + 1 > class39.method633(arg0.field764).field919[arg0.field765]) {
            int var1 = arg0.field779 - arg0.field778;
            int var2 = field348 - arg0.field778;
            int var3 = arg0.field774 * 128 + arg0.field737 * 64;
            int var4 = arg0.field777 * 128 + arg0.field737 * 64;
            int var5 = arg0.field775 * 128 + arg0.field737 * 64;
            int var6 = arg0.field739 * 128 + arg0.field737 * 64;
            arg0.field747 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field749 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field759 = 0;
        if (arg0.field780 == 0) {
            arg0.field783 = 1024;
        }
        if (arg0.field780 == 1) {
            arg0.field783 = 1536;
        }
        if (arg0.field780 == 2) {
            arg0.field783 = 0;
        }
        if (arg0.field780 == 3) {
            arg0.field783 = 512;
        }
        arg0.field769 = arg0.field783;
    }

    @ObfuscatedName("dt.ab(Lab;I)V")
    public static final void method2470(class34 arg0) {
        if (arg0.field785 == 0) {
            return;
        }
        if (arg0.field758 != -1 && arg0.field758 < 32768) {
            class31 var1 = field276[arg0.field758];
            if (var1 != null) {
                int var2 = arg0.field747 - var1.field747;
                int var3 = arg0.field749 - var1.field749;
                if (var2 != 0 || var3 != 0) {
                    arg0.field783 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field758 >= 32768) {
            int var4 = arg0.field758 - 32768;
            if (field280 == var4) {
                var4 = 2047;
            }
            class3 var5 = field358[var4];
            if (var5 != null) {
                int var6 = arg0.field747 - var5.field747;
                int var7 = arg0.field749 - var5.field749;
                if (var6 != 0 || var7 != 0) {
                    arg0.field783 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field746 != 0 || arg0.field776 != 0) && (arg0.field755 == 0 || arg0.field759 > 0)) {
            int var8 = arg0.field747 - (arg0.field746 * 64 - Statics.field521 * 64 - Statics.field521 * 64);
            int var9 = arg0.field749 - (arg0.field776 * 64 - Statics.field1071 * 64 - Statics.field1071 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field783 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field746 = 0;
            arg0.field776 = 0;
        }
        int var10 = arg0.field783 - arg0.field769 & 0x7FF;
        if (var10 == 0) {
            arg0.field784 = 0;
            return;
        }
        arg0.field784++;
        if (var10 > 1024) {
            arg0.field769 -= arg0.field785;
            boolean var11 = true;
            if (var10 < arg0.field785 || var10 > 2048 - arg0.field785) {
                arg0.field769 = arg0.field783;
                var11 = false;
            }
            if (arg0.field766 == arg0.field761 && (arg0.field784 > 25 || var11)) {
                if (arg0.field790 == -1) {
                    arg0.field761 = arg0.field740;
                } else {
                    arg0.field761 = arg0.field790;
                }
            }
        } else {
            arg0.field769 += arg0.field785;
            boolean var12 = true;
            if (var10 < arg0.field785 || var10 > 2048 - arg0.field785) {
                arg0.field769 = arg0.field783;
                var12 = false;
            }
            if (arg0.field766 == arg0.field761 && (arg0.field784 > 25 || var12)) {
                if (arg0.field733 == -1) {
                    arg0.field761 = arg0.field740;
                } else {
                    arg0.field761 = arg0.field733;
                }
            }
        }
        arg0.field769 &= 0x7FF;
    }

    @ObfuscatedName("al.az(Lab;I)V")
    public static final void method858(class34 arg0) {
        arg0.field736 = false;
        if (arg0.field761 != -1) {
            class39 var1 = class39.method633(arg0.field761);
            if (var1 == null || var1.field913 == null) {
                arg0.field761 = -1;
            } else {
                arg0.field763++;
                if (arg0.field762 < var1.field913.length && arg0.field763 > var1.field919[arg0.field762]) {
                    arg0.field763 = 1;
                    arg0.field762++;
                    method465(var1, arg0.field762, arg0.field747, arg0.field749);
                }
                if (arg0.field762 >= var1.field913.length) {
                    arg0.field763 = 0;
                    arg0.field762 = 0;
                    method465(var1, arg0.field762, arg0.field747, arg0.field749);
                }
            }
        }
        if (arg0.field786 != -1 && field348 >= arg0.field772) {
            if (arg0.field770 < 0) {
                arg0.field770 = 0;
            }
            int var2 = class40.method517(arg0.field786).field940;
            if (var2 == -1) {
                arg0.field786 = -1;
            } else {
                class39 var3 = class39.method633(var2);
                if (var3 == null || var3.field913 == null) {
                    arg0.field786 = -1;
                } else {
                    arg0.field771++;
                    if (arg0.field770 < var3.field913.length && arg0.field771 > var3.field919[arg0.field770]) {
                        arg0.field771 = 1;
                        arg0.field770++;
                        method465(var3, arg0.field770, arg0.field747, arg0.field749);
                    }
                    if (arg0.field770 >= var3.field913.length && (arg0.field770 < 0 || arg0.field770 >= var3.field913.length)) {
                        arg0.field786 = -1;
                    }
                }
            }
        }
        if (arg0.field764 != -1 && arg0.field767 <= 1) {
            class39 var4 = class39.method633(arg0.field764);
            if (var4.field917 == 1 && arg0.field791 > 0 && arg0.field778 <= field348 && arg0.field779 < field348) {
                arg0.field767 = 1;
                return;
            }
        }
        if (arg0.field764 != -1 && arg0.field767 == 0) {
            class39 var5 = class39.method633(arg0.field764);
            if (var5 == null || var5.field913 == null) {
                arg0.field764 = -1;
            } else {
                arg0.field782++;
                if (arg0.field765 < var5.field913.length && arg0.field782 > var5.field919[arg0.field765]) {
                    arg0.field782 = 1;
                    arg0.field765++;
                    method465(var5, arg0.field765, arg0.field747, arg0.field749);
                }
                if (arg0.field765 >= var5.field913.length) {
                    arg0.field765 -= var5.field921;
                    arg0.field768++;
                    if (arg0.field768 >= var5.field927) {
                        arg0.field764 = -1;
                    } else if (arg0.field765 >= 0 && arg0.field765 < var5.field913.length) {
                        method465(var5, arg0.field765, arg0.field747, arg0.field749);
                    } else {
                        arg0.field764 = -1;
                    }
                }
                arg0.field736 = var5.field926;
            }
        }
        if (arg0.field767 > 0) {
            arg0.field767--;
        }
    }

    @ObfuscatedName("by.as(Lm;IIB)V")
    public static void method1099(class3 arg0, int arg1, int arg2) {
        if (arg0.field764 == arg1 && arg1 != -1) {
            int var3 = class39.method633(arg1).field928;
            if (var3 == 1) {
                arg0.field765 = 0;
                arg0.field782 = 0;
                arg0.field767 = arg2;
                arg0.field768 = 0;
            }
            if (var3 == 2) {
                arg0.field768 = 0;
            }
        } else if (arg1 == -1 || arg0.field764 == -1 || class39.method633(arg1).field924 >= class39.method633(arg0.field764).field924) {
            arg0.field764 = arg1;
            arg0.field765 = 0;
            arg0.field782 = 0;
            arg0.field767 = arg2;
            arg0.field768 = 0;
            arg0.field791 = arg0.field755;
        }
    }

    @ObfuscatedName("o.ah(I)V")
    public static final void method493() {
        if (field302 != -1) {
            method2062(field302);
        }
        for (int var0 = 0; var0 < field444; var0++) {
            if (field248[var0]) {
                field447[var0] = true;
            }
            field448[var0] = field248[var0];
            field248[var0] = false;
        }
        field445 = field348;
        field389 = -1;
        field390 = -1;
        Statics.field1353 = null;
        if (field302 != -1) {
            field444 = 0;
            method98(field302, 0, 0, 765, 503, 0, 0, -1);
        }
        class74.method1568();
        if (field381) {
            int var6 = Statics.field1577;
            int var7 = Statics.field1015;
            int var8 = Statics.field2817;
            int var9 = Statics.field1131;
            int var10 = 6116423;
            class74.method1544(var6, var7, var8, var9, var10);
            class74.method1544(var6 + 1, var7 + 1, var8 - 2, 16, 0);
            class74.method1546(var6 + 1, var7 + 18, var8 - 2, var9 - 19, 0);
            Statics.field2774.method3477(class145.field2313, var6 + 3, var7 + 14, var10, -1);
            int var11 = class129.field2001;
            int var12 = class129.field2002;
            for (int var13 = 0; var13 < field478; var13++) {
                int var14 = (field478 - 1 - var13) * 15 + var7 + 31;
                int var15 = 16777215;
                if (var11 > var6 && var11 < var6 + var8 && var12 > var14 - 13 && var12 < var14 + 3) {
                    var15 = 16776960;
                }
                class205 var16 = Statics.field2774;
                String var17;
                if (field388[var13].length() > 0) {
                    var17 = field387[var13] + class145.field2320 + field388[var13];
                } else {
                    var17 = field387[var13];
                }
                var16.method3477(var17, var6 + 3, var14, var15, 0);
            }
            int var18 = Statics.field1577;
            int var19 = Statics.field1015;
            int var20 = Statics.field2817;
            int var21 = Statics.field1131;
            for (int var22 = 0; var22 < field444; var22++) {
                if (field466[var22] + field451[var22] > var18 && field466[var22] < var18 + var20 && field452[var22] + field450[var22] > var19 && field450[var22] < var19 + var21) {
                    field447[var22] = true;
                }
            }
        } else if (field389 != -1) {
            int var1 = field389;
            int var2 = field390;
            if (field478 >= 2 || field482 != 0 || field412) {
                String var3;
                if (field482 == 1 && field478 < 2) {
                    var3 = class145.field2310 + class145.field2320 + field394 + " " + class2.field21;
                } else if (field412 && field478 < 2) {
                    var3 = field398 + class145.field2320 + field399 + " " + class2.field21;
                } else {
                    int var4 = field478 - 1;
                    String var5;
                    if (field388[var4].length() > 0) {
                        var5 = field387[var4] + class145.field2320 + field388[var4];
                    } else {
                        var5 = field387[var4];
                    }
                    var3 = var5;
                }
                if (field478 > 2) {
                    var3 = var3 + Statics.method121(16777215) + " " + '/' + " " + (field478 - 2) + class145.field2314;
                }
                Statics.field2774.method3484(var3, var1 + 4, var2 + 15, 16777215, 0, field348 / 1000);
            }
        }
        if (field316 == 3) {
            for (int var23 = 0; var23 < field444; var23++) {
                if (field448[var23]) {
                    class74.method1593(field466[var23], field450[var23], field451[var23], field452[var23], 16711935, 128);
                } else if (field447[var23]) {
                    class74.method1593(field466[var23], field450[var23], field451[var23], field452[var23], 16711680, 128);
                }
            }
        }
        int var24 = Statics.field1880;
        int var25 = Statics.field163.field747;
        int var26 = Statics.field163.field749;
        int var27 = field313;
        for (class21 var28 = (class21) class21.field557.method3251(); var28 != null; var28 = (class21) class21.field557.method3272()) {
            if (var28.field546 != -1 || var28.field550 != null) {
                int var29 = 0;
                if (var25 > var28.field551) {
                    var29 += var25 - var28.field551;
                } else if (var25 < var28.field541) {
                    var29 += var28.field541 - var25;
                }
                if (var26 > var28.field544) {
                    var29 += var26 - var28.field544;
                } else if (var26 < var28.field542) {
                    var29 += var28.field542 - var26;
                }
                if (var29 - 64 > var28.field545 || field479 == 0 || var28.field540 != var24) {
                    if (var28.field547 != null) {
                        Statics.field1942.method973(var28.field547);
                        var28.field547 = null;
                    }
                    if (var28.field552 != null) {
                        Statics.field1942.method973(var28.field552);
                        var28.field552 = null;
                    }
                } else {
                    var29 -= 64;
                    if (var29 < 0) {
                        var29 = 0;
                    }
                    int var30 = field479 * (var28.field545 - var29) / var28.field545;
                    class53 var10000;
                    if (var28.field547 != null) {
                        var28.field547.method1137(var30);
                    } else if (var28.field546 >= 0) {
                        var10000 = (class53) null;
                        class53 var31 = class53.method1075(Statics.field1499, var28.field546, 0);
                        if (var31 != null) {
                            class57 var32 = var31.method1068().method1110(Statics.field804);
                            class59 var33 = class59.method1171(var32, 100, var30);
                            var33.method1136(-1);
                            Statics.field1942.method972(var33);
                            var28.field547 = var33;
                        }
                    }
                    if (var28.field552 != null) {
                        var28.field552.method1137(var30);
                        if (!var28.field552.method3355()) {
                            var28.field552 = null;
                        }
                    } else if (var28.field550 != null && (var28.field543 -= var27) <= 0) {
                        int var34 = (int) (Math.random() * (double) var28.field550.length);
                        var10000 = (class53) null;
                        class53 var35 = class53.method1075(Statics.field1499, var28.field550[var34], 0);
                        if (var35 != null) {
                            class57 var36 = var35.method1068().method1110(Statics.field804);
                            class59 var37 = class59.method1171(var36, 100, var30);
                            var37.method1136(0);
                            Statics.field1942.method972(var37);
                            var28.field552 = var37;
                            var28.field543 = var28.field556 + (int) (Math.random() * (double) (var28.field549 - var28.field556));
                        }
                    }
                }
            }
        }
        field313 = 0;
    }

    @ObfuscatedName("df.aw(Ljava/lang/String;ZB)V")
    public static final void method2444(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1578.method3468(arg0, 250);
        int var6 = Statics.field1578.method3507(arg0, 250) * 13;
        class74.method1544(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class74.method1546(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1578.method3525(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1929.getGraphics();
                Statics.field60.method1366(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1929.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field444; var13++) {
            if (field466[var13] + field451[var13] > var9 && field466[var13] < var9 + var11 && field452[var13] + field450[var13] > var10 && field450[var13] < var10 + var12) {
                field447[var13] = true;
            }
        }
    }

    @ObfuscatedName("cy.ar(Lag;I)V")
    public static final void method2064(class30 arg0) {
        if (Statics.field163.field747 >> 7 == field370 && Statics.field163.field749 >> 7 == field472) {
            field370 = 0;
        }
        int var1 = field359;
        if (class30.field692 == arg0 || class30.field696 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class30.field692 == arg0) {
                var3 = Statics.field163;
                var4 = 33538048;
            } else if (class30.field696 == arg0) {
                var3 = field358[field300];
                var4 = field300 << 14;
            } else {
                var3 = field358[field360[var2]];
                var4 = field360[var2] << 14;
                if (class30.field694 == arg0 && field300 == field360[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method9() && !var3.field47) {
                var3.field45 = false;
                if ((field244 && field359 > 50 || field359 > 200) && class30.field692 != arg0 && var3.field766 == var3.field761) {
                    var3.field45 = true;
                }
                int var5 = var3.field747 >> 7;
                int var6 = var3.field749 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field33 == null || field348 < var3.field35 || field348 >= var3.field36) {
                        if ((var3.field747 & 0x7F) == 64 && (var3.field749 & 0x7F) == 64) {
                            if (field341 == field340[var5][var6]) {
                                continue;
                            }
                            field340[var5][var6] = field341;
                        }
                        var3.field44 = method1974(var3.field747, var3.field749, Statics.field1880);
                        Statics.field965.method1641(Statics.field1880, var3.field747, var3.field749, var3.field44, 60, var3, var3.field769, var4, var3.field736);
                    } else {
                        var3.field45 = false;
                        var3.field44 = method1974(var3.field747, var3.field749, Statics.field1880);
                        Statics.field965.method1638(Statics.field1880, var3.field747, var3.field749, var3.field44, 60, var3, var3.field769, var4, var3.field41, var3.field37, var3.field43, var3.field42);
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.at(ZI)V")
    public static final void method115(boolean arg0) {
        for (int var1 = 0; var1 < field277; var1++) {
            class31 var2 = field276[field298[var1]];
            int var3 = (field298[var1] << 14) + 536870912;
            if (var2 != null && var2.method9() && var2.field703.field830 == arg0 && var2.field703.method640()) {
                int var4 = var2.field747 >> 7;
                int var5 = var2.field749 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field737 == 1 && (var2.field747 & 0x7F) == 64 && (var2.field749 & 0x7F) == 64) {
                        if (field341 == field340[var4][var5]) {
                            continue;
                        }
                        field340[var4][var5] = field341;
                    }
                    if (!var2.field703.field805) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field965.method1641(Statics.field1880, var2.field747, var2.field749, method1974(var2.field747 + (var2.field737 * 64 - 64), var2.field749 + (var2.field737 * 64 - 64), Statics.field1880), var2.field737 * 64 - 64 + 60, var2, var2.field769, var3, var2.field736);
                }
            }
        }
    }

    @ObfuscatedName("ab.ap(I)V")
    public static final void method634() {
        for (class7 var0 = (class7) field375.method3251(); var0 != null; var0 = (class7) field375.method3272()) {
            if (Statics.field1880 != var0.field92 || field348 > var0.field98) {
                var0.method3352();
            } else if (field348 >= var0.field97) {
                if (var0.field94 > 0) {
                    class31 var1 = field276[var0.field94 - 1];
                    if (var1 != null && var1.field747 >= 0 && var1.field747 < 13312 && var1.field749 >= 0 && var1.field749 < 13312) {
                        var0.method70(var1.field747, var1.field749, method1974(var1.field747, var1.field749, var0.field92) - var0.field96, field348);
                    }
                }
                if (var0.field94 < 0) {
                    int var2 = -var0.field94 - 1;
                    class3 var3;
                    if (field280 == var2) {
                        var3 = Statics.field163;
                    } else {
                        var3 = field358[var2];
                    }
                    if (var3 != null && var3.field747 >= 0 && var3.field747 < 13312 && var3.field749 >= 0 && var3.field749 < 13312) {
                        var0.method70(var3.field747, var3.field749, method1974(var3.field747, var3.field749, var0.field92) - var0.field96, field348);
                    }
                }
                var0.method67(field313);
                Statics.field965.method1641(Statics.field1880, (int) var0.field103, (int) var0.field95, (int) var0.field105, 60, var0, var0.field111, -1, false);
            }
        }
    }

    @ObfuscatedName("ac.ak(I)V")
    public static final void method554() {
        for (class27 var0 = (class27) field376.method3251(); var0 != null; var0 = (class27) field376.method3272()) {
            if (Statics.field1880 != var0.field626 || var0.field633) {
                var0.method3352();
            } else if (field348 >= var0.field624) {
                var0.method543(field313);
                if (var0.field633) {
                    var0.method3352();
                } else {
                    Statics.field965.method1641(var0.field626, var0.field627, var0.field628, var0.field629, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("c.aa(Lab;IIIIII)V")
    public static final void method155(class34 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method9()) {
            return;
        }
        if (arg0 instanceof class31) {
            class36 var6 = ((class31) arg0).field703;
            if (var6.field835 != null) {
                var6 = var6.method649();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field359) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field47) {
                return;
            }
            if (var8.field30 != -1 || var8.field38 != -1) {
                method3156(arg0, arg0.field734 + 15);
                if (field329 > -1) {
                    if (var8.field30 != -1) {
                        Statics.field2930[var8.field30].method1467(field329 + arg2 - 12, field343 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field38 != -1) {
                        Statics.field2082[var8.field38].method1467(field329 + arg2 - 12, field343 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field405 == 10 && field258 == field360[arg1]) {
                method3156(arg0, arg0.field734 + 15);
                if (field329 > -1) {
                    Statics.field2027[1].method1467(field329 + arg2 - 12, field343 + arg3 - var7);
                }
            }
        } else {
            class36 var9 = ((class31) arg0).field703;
            if (var9.field835 != null) {
                var9 = var9.method649();
            }
            if (var9.field827 >= 0 && var9.field827 < Statics.field2082.length) {
                method3156(arg0, arg0.field734 + 15);
                if (field329 > -1) {
                    Statics.field2082[var9.field827].method1467(field329 + arg2 - 12, field343 + arg3 - 30);
                }
            }
            if (field405 == 1 && field458 == field298[arg1 - field359] && field348 % 20 < 10) {
                method3156(arg0, arg0.field734 + 15);
                if (field329 > -1) {
                    Statics.field2027[0].method1467(field329 + arg2 - 12, field343 + arg3 - 28);
                }
            }
        }
        if (arg0.field738 != null && (arg1 >= field359 || !arg0.field748 && (field418 == 4 || !arg0.field745 && (field418 == 0 || field418 == 3 || field418 == 1 && method26(((class3) arg0).field39, false))))) {
            method3156(arg0, arg0.field734);
            if (field329 > -1 && field330 < field331) {
                field335[field330] = Statics.field2774.method3472(arg0.field738) / 2;
                field344[field330] = Statics.field2774.field2948;
                field332[field330] = field329;
                field333[field330] = field343;
                field434[field330] = arg0.field750;
                field337[field330] = arg0.field751;
                field338[field330] = arg0.field735;
                field342[field330] = arg0.field738;
                field330++;
            }
        }
        if (arg0.field743 > field348) {
            method3156(arg0, arg0.field734 + 15);
            if (field329 > -1) {
                int var10;
                if (arg1 < field359) {
                    var10 = 30;
                } else {
                    class36 var11 = ((class31) arg0).field703;
                    var10 = var11.field820;
                }
                int var12 = arg0.field756 * var10 / arg0.field757;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field756 > 0) {
                    var12 = 1;
                }
                class74.method1544(field329 + arg2 - var10 / 2, field343 + arg3 - 3, var12, 5, 65280);
                class74.method1544(field329 + arg2 - var10 / 2 + var12, field343 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field754[var13] > field348) {
                method3156(arg0, arg0.field734 / 2);
                if (field329 > -1) {
                    if (var13 == 1) {
                        field343 -= 20;
                    }
                    if (var13 == 2) {
                        field329 -= 15;
                        field343 -= 10;
                    }
                    if (var13 == 3) {
                        field329 += 15;
                        field343 -= 10;
                    }
                    Statics.field991[arg0.field753[var13]].method1467(field329 + arg2 - 12, field343 + arg3 - 12);
                    Statics.field64.method3475(Integer.toString(arg0.field752[var13]), field329 + arg2 - 1, field343 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("i.av(IIIII)V")
    public static final void method83(int arg0, int arg1, int arg2, int arg3) {
        field330 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field359 + field277; var6++) {
            class34 var7;
            if (var6 == -1) {
                var7 = Statics.field163;
            } else if (var6 < field359) {
                var7 = field358[field360[var6]];
                if (field300 == field360[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field276[field298[var6 - field359]];
            }
            method155(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method155(field358[field300], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field330; var8++) {
            int var9 = field332[var8];
            int var10 = field333[var8];
            int var11 = field335[var8];
            int var12 = field344[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field333[var14] - field344[var14] && var10 - var12 < field333[var14] + 2 && var9 - var11 < field335[var14] + field332[var14] && var9 + var11 > field332[var14] - field335[var14] && field333[var14] - field344[var14] < var10) {
                        var10 = field333[var14] - field344[var14];
                        var13 = true;
                    }
                }
            }
            field329 = field332[var8];
            field343 = field333[var8] = var10;
            String var15 = field342[var8];
            if (field402 == 0) {
                int var16 = 16776960;
                if (field434[var8] < 6) {
                    var16 = field270[field434[var8]];
                }
                if (field434[var8] == 6) {
                    var16 = field341 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field434[var8] == 7) {
                    var16 = field341 % 20 < 10 ? 255 : 65535;
                }
                if (field434[var8] == 8) {
                    var16 = field341 % 20 < 10 ? 45056 : 8454016;
                }
                if (field434[var8] == 9) {
                    int var17 = 150 - field338[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field434[var8] == 10) {
                    int var18 = 150 - field338[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field434[var8] == 11) {
                    int var19 = 150 - field338[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field337[var8] == 0) {
                    Statics.field2774.method3475(var15, field329 + arg0, field343 + arg1, var16, 0);
                }
                if (field337[var8] == 1) {
                    Statics.field2774.method3509(var15, field329 + arg0, field343 + arg1, var16, 0, field341);
                }
                if (field337[var8] == 2) {
                    Statics.field2774.method3482(var15, field329 + arg0, field343 + arg1, var16, 0, field341);
                }
                if (field337[var8] == 3) {
                    Statics.field2774.method3483(var15, field329 + arg0, field343 + arg1, var16, 0, field341, 150 - field338[var8]);
                }
                if (field337[var8] == 4) {
                    int var20 = (150 - field338[var8]) * (Statics.field2774.method3472(var15) + 100) / 150;
                    class74.method1539(field329 + arg0 - 50, arg1, field329 + arg0 + 50, arg1 + arg3);
                    Statics.field2774.method3477(var15, field329 + arg0 + 50 - var20, field343 + arg1, var16, 0);
                    class74.method1538(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field337[var8] == 5) {
                    int var21 = 150 - field338[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class74.method1539(arg0, field343 + arg1 - Statics.field2774.field2948 - 1, arg0 + arg2, field343 + arg1 + 5);
                    Statics.field2774.method3475(var15, field329 + arg0, field343 + arg1 + var22, var16, 0);
                    class74.method1538(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2774.method3475(var15, field329 + arg0, field343 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("aq.al(IIIIB)V")
    public static final void method1055(int arg0, int arg1, int arg2, int arg3) {
        if (field455 == 1) {
            Statics.field2126[field346 / 100].method1467(field352 - 8, field345 - 8);
        }
        if (field455 == 2) {
            Statics.field2126[field346 / 100 + 4].method1467(field352 - 8, field345 - 8);
        }
        field357 = 0;
        int var4 = (Statics.field163.field747 >> 7) + Statics.field521;
        int var5 = (Statics.field163.field749 >> 7) + Statics.field1071;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field357 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field357 = 1;
        }
        if (field357 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field357 = 0;
        }
        if (!field254) {
            return;
        }
        int var6 = arg0 + 512 - 5;
        int var7 = arg1 + 20;
        Statics.field1578.method3478("Fps:" + field2054, var6, var7, 16776960, -1);
        int var11 = var7 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        int var10 = 16776960;
        if (var9 > 32768 && field244) {
            var10 = 16711680;
        }
        if (var9 > 65536 && !field244) {
            var10 = 16711680;
        }
        Statics.field1578.method3478("Mem:" + var9 + "k", var6, var11, var10, -1);
        var7 = var11 + 15;
    }

    @ObfuscatedName("fn.af(Lab;IB)V")
    public static final void method3156(class34 arg0, int arg1) {
        method3169(arg0.field747, arg0.field749, arg1);
    }

    @ObfuscatedName("fa.aj(IIII)V")
    public static final void method3169(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field329 = -1;
            field343 = -1;
            return;
        }
        int var3 = method1974(arg0, arg1, Statics.field1880) - arg2;
        int var4 = arg0 - Statics.field2064;
        int var5 = var3 - Statics.field901;
        int var6 = arg1 - Statics.field1662;
        int var7 = class85.field1482[Statics.field132];
        int var8 = class85.field1474[Statics.field132];
        int var9 = class85.field1482[Statics.field2565];
        int var10 = class85.field1474[Statics.field2565];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field329 = (var11 << 9) / var15 + 256;
            field343 = (var14 << 9) / var15 + 167;
        } else {
            field329 = -1;
            field343 = -1;
        }
    }

    @ObfuscatedName("cu.ao(IIIB)I")
    public static final int method1974(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field71[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field87[var5][var3][var4] + class6.field87[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field87[var5][var3][var4 + 1] + class6.field87[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("v.an(ZI)V")
    public static final void method4(boolean arg0) {
        field256 = arg0;
        if (!field256) {
            int var1 = field281.method2256();
            int var2 = (field446 - field281.field1841) / 16;
            Statics.field842 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    Statics.field842[var3][var4] = field281.method2170();
                }
            }
            int var5 = field281.method2299();
            int var6 = field281.method2129();
            int var7 = field281.method2160();
            int var8 = field281.method2129();
            Statics.field1490 = new int[var2];
            Statics.field2474 = new int[var2];
            Statics.field1526 = new int[var2];
            Statics.field49 = new byte[var2][];
            Statics.field1812 = new byte[var2][];
            boolean var9 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var1 / 8 == 48) {
                var9 = true;
            }
            if (var8 / 8 == 48 && var1 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var8 - 6) / 8; var11 <= (var8 + 6) / 8; var11++) {
                for (int var12 = (var1 - 6) / 8; var12 <= (var1 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1490[var10] = var13;
                        Statics.field2474[var10] = Statics.field2472.method2746("m" + var11 + "_" + var12);
                        Statics.field1526[var10] = Statics.field2472.method2746("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method2580(var8, var1, var5, var6, var7);
            return;
        }
        int var14 = field281.method2162();
        int var15 = field281.method2129();
        int var16 = field281.method2151();
        int var17 = field281.method2160();
        int var18 = field281.method2129();
        field281.method2381();
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = field281.method2366(1);
                    if (var22 == 1) {
                        field391[var19][var20][var21] = field281.method2366(26);
                    } else {
                        field391[var19][var20][var21] = -1;
                    }
                }
            }
        }
        field281.method2367();
        int var23 = (field446 - field281.field1841) / 16;
        Statics.field842 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                Statics.field842[var24][var25] = field281.method2237();
            }
        }
        Statics.field1490 = new int[var23];
        Statics.field2474 = new int[var23];
        Statics.field1526 = new int[var23];
        Statics.field49 = new byte[var23][];
        Statics.field1812 = new byte[var23][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field391[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1490[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1490[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field2474[var26] = Statics.field2472.method2746("m" + var35 + "_" + var36);
                            Statics.field1526[var26] = Statics.field2472.method2746("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method2580(var14, var17, var16, var18, var15);
    }

    @ObfuscatedName("dl.ad(IIIIIB)V")
    public static final void method2580(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1920 == arg0 && Statics.field535 == arg1 && field291 == arg2 || !field244) {
            return;
        }
        Statics.field1920 = arg0;
        Statics.field535 = arg1;
        field291 = arg2;
        if (!field244) {
            field291 = 0;
        }
        method469(25);
        method2444(class145.field2169, true);
        int var5 = Statics.field521;
        int var6 = Statics.field1071;
        Statics.field521 = (arg0 - 6) * 8;
        Statics.field1071 = (arg1 - 6) * 8;
        int var7 = Statics.field521 - var5;
        int var8 = Statics.field1071 - var6;
        int var9 = Statics.field521;
        int var10 = Statics.field1071;
        for (int var11 = 0; var11 < 32768; var11++) {
            class31 var12 = field276[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field787[var13] -= var7;
                    var12.field788[var13] -= var8;
                }
                var12.field747 -= var7 * 128;
                var12.field749 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field358[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field787[var16] -= var7;
                    var15.field788[var16] -= var8;
                }
                var15.field747 -= var7 * 128;
                var15.field749 -= var8 * 128;
            }
        }
        Statics.field1880 = arg2;
        Statics.field163.method619(arg3, arg4, false);
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
                        field373[var27][var23][var24] = field373[var27][var25][var26];
                    } else {
                        field373[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field374.method3251(); var28 != null; var28 = (class15) field374.method3272()) {
            var28.field207 -= var7;
            var28.field198 -= var8;
            if (var28.field207 < 0 || var28.field198 < 0 || var28.field207 >= 104 || var28.field198 >= 104) {
                var28.method3352();
            }
        }
        if (field370 != 0) {
            field370 -= var7;
            field472 -= var8;
        }
        field320 = 0;
        field486 = false;
        field278 = -1;
        field376.method3250();
        field375.method3250();
    }

    @ObfuscatedName("aw.aq(ZI)V")
    public static final void method730(boolean arg0) {
        method518();
        field246++;
        if (field246 < 50 && !arg0) {
            return;
        }
        field246 = 0;
        if (field421 || Statics.field516 == null) {
            return;
        }
        field279.method2364(120);
        try {
            Statics.field516.method2601(field279.field1839, 0, field279.field1841);
            field279.field1841 = 0;
        } catch (IOException var2) {
            field421 = true;
        }
    }

    @ObfuscatedName("br.ax(I)V")
    public static final void method1348() {
        method730(false);
        field292 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field49.length; var1++) {
            if (Statics.field2474[var1] != -1 && Statics.field49[var1] == null) {
                Statics.field49[var1] = Statics.field2472.method2751(Statics.field2474[var1], 0);
                if (Statics.field49[var1] == null) {
                    var0 = false;
                    field292++;
                }
            }
            if (Statics.field1526[var1] != -1 && Statics.field1812[var1] == null) {
                Statics.field1812[var1] = Statics.field2472.method2755(Statics.field1526[var1], 0, Statics.field842[var1]);
                if (Statics.field1812[var1] == null) {
                    var0 = false;
                    field292++;
                }
            }
        }
        if (!var0) {
            field336 = 1;
            return;
        }
        field468 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field49.length; var3++) {
            byte[] var4 = Statics.field1812[var3];
            if (var4 != null) {
                int var5 = (Statics.field1490[var3] >> 8) * 64 - Statics.field521;
                int var6 = (Statics.field1490[var3] & 0xFF) * 64 - Statics.field1071;
                if (field256) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method3170(var4, var5, var6);
            }
        }
        if (!var2) {
            field336 = 2;
            return;
        }
        if (field336 != 0) {
            method2444(class145.field2169 + class2.field18 + class2.field19 + 100 + "%" + class2.field17, true);
        }
        method518();
        method66();
        method518();
        Statics.field965.method1630();
        method518();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field441[var7].method3613();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field71[var8][var9][var10] = 0;
                }
            }
        }
        method518();
        class6.field72 = 99;
        Statics.field73 = new byte[4][104][104];
        Statics.field2932 = new byte[4][104][104];
        Statics.field74 = new byte[4][104][104];
        Statics.field3012 = new byte[4][104][104];
        Statics.field77 = new int[4][105][105];
        Statics.field1280 = new byte[4][105][105];
        Statics.field1531 = new int[105][105];
        Statics.field1765 = new int[104];
        Statics.field75 = new int[104];
        Statics.field1927 = new int[104];
        Statics.field76 = new int[104];
        Statics.field2076 = new int[104];
        int var11 = Statics.field49.length;
        class21.method515();
        method730(true);
        if (!field256) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field1490[var12] >> 8) * 64 - Statics.field521;
                int var14 = (Statics.field1490[var12] & 0xFF) * 64 - Statics.field1071;
                byte[] var15 = Statics.field49[var12];
                if (var15 != null) {
                    method518();
                    class6.method2900(var15, var13, var14, Statics.field1920 * 8 - 48, Statics.field535 * 8 - 48, field441);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field1490[var16] >> 8) * 64 - Statics.field521;
                int var18 = (Statics.field1490[var16] & 0xFF) * 64 - Statics.field1071;
                byte[] var19 = Statics.field49[var16];
                if (var19 == null && Statics.field535 < 800) {
                    method518();
                    class6.method509(var17, var18, 64, 64);
                }
            }
            method730(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field1812[var20];
                if (var21 != null) {
                    int var22 = (Statics.field1490[var20] >> 8) * 64 - Statics.field521;
                    int var23 = (Statics.field1490[var20] & 0xFF) * 64 - Statics.field1071;
                    method518();
                    class6.method597(var21, var22, var23, Statics.field965, field441);
                }
            }
        }
        if (field256) {
            for (int var24 = 0; var24 < 4; var24++) {
                method518();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field391[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field1490.length; var34++) {
                                if (Statics.field1490[var34] == var33 && Statics.field49[var34] != null) {
                                    byte[] var35 = Statics.field49[var34];
                                    int var36 = var25 * 8;
                                    int var37 = var26 * 8;
                                    int var38 = (var31 & 0x7) * 8;
                                    int var39 = (var32 & 0x7) * 8;
                                    class209[] var40 = field441;
                                    for (int var41 = 0; var41 < 8; var41++) {
                                        for (int var42 = 0; var42 < 8; var42++) {
                                            if (var36 + var41 > 0 && var36 + var41 < 103 && var37 + var42 > 0 && var37 + var42 < 103) {
                                                var40[var24].field3005[var36 + var41][var37 + var42] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class108 var43 = new class108(var35);
                                    for (int var44 = 0; var44 < 4; var44++) {
                                        for (int var45 = 0; var45 < 64; var45++) {
                                            for (int var46 = 0; var46 < 64; var46++) {
                                                if (var29 == var44 && var45 >= var38 && var45 < var38 + 8 && var46 >= var39 && var46 < var39 + 8) {
                                                    int var49 = var36 + class158.method2838(var45 & 0x7, var46 & 0x7, var30);
                                                    int var51 = var45 & 0x7;
                                                    int var52 = var46 & 0x7;
                                                    int var54 = var30 & 0x3;
                                                    int var55;
                                                    if (var54 == 0) {
                                                        var55 = var52;
                                                    } else if (var54 == 1) {
                                                        var55 = 7 - var51;
                                                    } else if (var54 == 2) {
                                                        var55 = 7 - var52;
                                                    } else {
                                                        var55 = var51;
                                                    }
                                                    class6.method2076(var43, var24, var49, var37 + var55, 0, 0, var30);
                                                } else {
                                                    class6.method2076(var43, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            int var56 = var24;
                            int var57 = var25 * 8;
                            int var58 = var26 * 8;
                            for (int var59 = 0; var59 < 8; var59++) {
                                for (int var60 = 0; var60 < 8; var60++) {
                                    class6.field87[var56][var57 + var59][var58 + var60] = 0;
                                }
                            }
                            if (var57 > 0) {
                                for (int var61 = 1; var61 < 8; var61++) {
                                    class6.field87[var56][var57][var58 + var61] = class6.field87[var56][var57 - 1][var58 + var61];
                                }
                            }
                            if (var58 > 0) {
                                for (int var62 = 1; var62 < 8; var62++) {
                                    class6.field87[var56][var57 + var62][var58] = class6.field87[var56][var57 + var62][var58 - 1];
                                }
                            }
                            if (var57 > 0 && class6.field87[var56][var57 - 1][var58] != 0) {
                                class6.field87[var56][var57][var58] = class6.field87[var56][var57 - 1][var58];
                            } else if (var58 > 0 && class6.field87[var56][var57][var58 - 1] != 0) {
                                class6.field87[var56][var57][var58] = class6.field87[var56][var57][var58 - 1];
                            } else if (var57 > 0 && var58 > 0 && class6.field87[var56][var57 - 1][var58 - 1] != 0) {
                                class6.field87[var56][var57][var58] = class6.field87[var56][var57 - 1][var58 - 1];
                            }
                        }
                    }
                }
            }
            for (int var63 = 0; var63 < 13; var63++) {
                for (int var64 = 0; var64 < 13; var64++) {
                    int var65 = field391[0][var63][var64];
                    if (var65 == -1) {
                        class6.method509(var63 * 8, var64 * 8, 8, 8);
                    }
                }
            }
            method730(true);
            for (int var66 = 0; var66 < 4; var66++) {
                method518();
                for (int var67 = 0; var67 < 13; var67++) {
                    label963: for (int var68 = 0; var68 < 13; var68++) {
                        int var69 = field391[var66][var67][var68];
                        if (var69 != -1) {
                            int var70 = var69 >> 24 & 0x3;
                            int var71 = var69 >> 1 & 0x3;
                            int var72 = var69 >> 14 & 0x3FF;
                            int var73 = var69 >> 3 & 0x7FF;
                            int var74 = (var72 / 8 << 8) + var73 / 8;
                            for (int var75 = 0; var75 < Statics.field1490.length; var75++) {
                                if (Statics.field1490[var75] == var74 && Statics.field1812[var75] != null) {
                                    byte[] var76 = Statics.field1812[var75];
                                    int var77 = var67 * 8;
                                    int var78 = var68 * 8;
                                    int var79 = (var72 & 0x7) * 8;
                                    int var80 = (var73 & 0x7) * 8;
                                    class80 var81 = Statics.field965;
                                    class209[] var82 = field441;
                                    class108 var83 = new class108(var76);
                                    int var84 = -1;
                                    while (true) {
                                        int var85 = var83.method2125();
                                        if (var85 == 0) {
                                            continue label963;
                                        }
                                        var84 += var85;
                                        int var86 = 0;
                                        while (true) {
                                            int var87 = var83.method2125();
                                            if (var87 == 0) {
                                                break;
                                            }
                                            var86 += var87 - 1;
                                            int var88 = var86 & 0x3F;
                                            int var89 = var86 >> 6 & 0x3F;
                                            int var90 = var86 >> 12;
                                            int var91 = var83.method2299();
                                            int var92 = var91 >> 2;
                                            int var93 = var91 & 0x3;
                                            if (var70 == var90 && var89 >= var79 && var89 < var79 + 8 && var88 >= var80 && var88 < var80 + 8) {
                                                class37 var94 = class37.method96(var84);
                                                int var96 = var89 & 0x7;
                                                int var97 = var88 & 0x7;
                                                int var99 = var94.field860;
                                                int var100 = var94.field866;
                                                if ((var93 & 0x1) == 1) {
                                                    int var101 = var99;
                                                    var99 = var100;
                                                    var100 = var101;
                                                }
                                                int var102 = var71 & 0x3;
                                                int var103;
                                                if (var102 == 0) {
                                                    var103 = var96;
                                                } else if (var102 == 1) {
                                                    var103 = var97;
                                                } else if (var102 == 2) {
                                                    var103 = 7 - var96 - (var99 - 1);
                                                } else {
                                                    var103 = 7 - var97 - (var100 - 1);
                                                }
                                                int var104 = var77 + var103;
                                                int var106 = var89 & 0x7;
                                                int var107 = var88 & 0x7;
                                                int var109 = var94.field860;
                                                int var110 = var94.field866;
                                                if ((var93 & 0x1) == 1) {
                                                    int var111 = var109;
                                                    var109 = var110;
                                                    var110 = var111;
                                                }
                                                int var112 = var71 & 0x3;
                                                int var113;
                                                if (var112 == 0) {
                                                    var113 = var107;
                                                } else if (var112 == 1) {
                                                    var113 = 7 - var106 - (var109 - 1);
                                                } else if (var112 == 2) {
                                                    var113 = 7 - var107 - (var110 - 1);
                                                } else {
                                                    var113 = var106;
                                                }
                                                int var114 = var78 + var113;
                                                if (var104 > 0 && var114 > 0 && var104 < 103 && var114 < 103) {
                                                    int var115 = var66;
                                                    if ((class6.field71[1][var104][var114] & 0x2) == 2) {
                                                        var115 = var66 - 1;
                                                    }
                                                    class209 var116 = null;
                                                    if (var115 >= 0) {
                                                        var116 = var82[var115];
                                                    }
                                                    Statics.method849(var66, var104, var114, var84, var71 + var93 & 0x3, var92, var81, var116);
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
        method730(true);
        method66();
        method518();
        class80 var117 = Statics.field965;
        class209[] var118 = field441;
        for (int var119 = 0; var119 < 4; var119++) {
            for (int var120 = 0; var120 < 104; var120++) {
                for (int var121 = 0; var121 < 104; var121++) {
                    if ((class6.field71[var119][var120][var121] & 0x1) == 1) {
                        int var122 = var119;
                        if ((class6.field71[1][var120][var121] & 0x2) == 2) {
                            var122 = var119 - 1;
                        }
                        if (var122 >= 0) {
                            var118[var122].method3607(var120, var121);
                        }
                    }
                }
            }
        }
        class6.field84 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field84 < -8) {
            class6.field84 = -8;
        }
        if (class6.field84 > 8) {
            class6.field84 = 8;
        }
        class6.field85 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field85 < -16) {
            class6.field85 = -16;
        }
        if (class6.field85 > 16) {
            class6.field85 = 16;
        }
        for (int var123 = 0; var123 < 4; var123++) {
            byte[][] var124 = Statics.field1280[var123];
            int var125 = (int) Math.sqrt(5100.0D);
            int var126 = var125 * 768 >> 8;
            for (int var127 = 1; var127 < 103; var127++) {
                for (int var128 = 1; var128 < 103; var128++) {
                    int var129 = class6.field87[var123][var128 + 1][var127] - class6.field87[var123][var128 - 1][var127];
                    int var130 = class6.field87[var123][var128][var127 + 1] - class6.field87[var123][var128][var127 - 1];
                    int var131 = (int) Math.sqrt((double) (var130 * var130 + var129 * var129 + 65536));
                    int var132 = (var129 << 8) / var131;
                    int var133 = 65536 / var131;
                    int var134 = (var130 << 8) / var131;
                    int var135 = (var134 * -50 + var132 * -50 + var133 * -10) / var126 + 96;
                    int var136 = (var124[var128][var127] >> 1) + (var124[var128][var127 + 1] >> 3) + (var124[var128][var127 - 1] >> 2) + (var124[var128 - 1][var127] >> 2) + (var124[var128 + 1][var127] >> 3);
                    Statics.field1531[var128][var127] = var135 - var136;
                }
            }
            for (int var137 = 0; var137 < 104; var137++) {
                Statics.field1765[var137] = 0;
                Statics.field75[var137] = 0;
                Statics.field1927[var137] = 0;
                Statics.field76[var137] = 0;
                Statics.field2076[var137] = 0;
            }
            for (int var138 = -5; var138 < 109; var138++) {
                for (int var139 = 0; var139 < 104; var139++) {
                    int var140 = var138 + 5;
                    int var10002;
                    if (var140 >= 0 && var140 < 104) {
                        int var141 = Statics.field73[var123][var140][var139] & 0xFF;
                        if (var141 > 0) {
                            int var142 = var141 - 1;
                            class38 var143 = (class38) class38.field904.method3186((long) var142);
                            class38 var144;
                            if (var143 == null) {
                                byte[] var145 = Statics.field907.method2751(1, var142);
                                class38 var146 = new class38();
                                if (var145 != null) {
                                    var146.method717(new class108(var145), var142);
                                }
                                var146.method716();
                                class38.field904.method3183(var146, (long) var142);
                                var144 = var146;
                            } else {
                                var144 = var143;
                            }
                            Statics.field1765[var139] += var144.field906;
                            Statics.field75[var139] += var144.field903;
                            Statics.field1927[var139] += var144.field905;
                            Statics.field76[var139] += var144.field909;
                            var10002 = Statics.field2076[var139]++;
                        }
                    }
                    int var148 = var138 - 5;
                    if (var148 >= 0 && var148 < 104) {
                        int var149 = Statics.field73[var123][var148][var139] & 0xFF;
                        if (var149 > 0) {
                            int var150 = var149 - 1;
                            class38 var151 = (class38) class38.field904.method3186((long) var150);
                            class38 var152;
                            if (var151 == null) {
                                byte[] var153 = Statics.field907.method2751(1, var150);
                                class38 var154 = new class38();
                                if (var153 != null) {
                                    var154.method717(new class108(var153), var150);
                                }
                                var154.method716();
                                class38.field904.method3183(var154, (long) var150);
                                var152 = var154;
                            } else {
                                var152 = var151;
                            }
                            Statics.field1765[var139] -= var152.field906;
                            Statics.field75[var139] -= var152.field903;
                            Statics.field1927[var139] -= var152.field905;
                            Statics.field76[var139] -= var152.field909;
                            var10002 = Statics.field2076[var139]--;
                        }
                    }
                }
                if (var138 >= 1 && var138 < 103) {
                    int var156 = 0;
                    int var157 = 0;
                    int var158 = 0;
                    int var159 = 0;
                    int var160 = 0;
                    for (int var161 = -5; var161 < 109; var161++) {
                        int var162 = var161 + 5;
                        if (var162 >= 0 && var162 < 104) {
                            var156 += Statics.field1765[var162];
                            var157 += Statics.field75[var162];
                            var158 += Statics.field1927[var162];
                            var159 += Statics.field76[var162];
                            var160 += Statics.field2076[var162];
                        }
                        int var163 = var161 - 5;
                        if (var163 >= 0 && var163 < 104) {
                            var156 -= Statics.field1765[var163];
                            var157 -= Statics.field75[var163];
                            var158 -= Statics.field1927[var163];
                            var159 -= Statics.field76[var163];
                            var160 -= Statics.field2076[var163];
                        }
                        if (var161 >= 1 && var161 < 103 && (!field244 || (class6.field71[0][var138][var161] & 0x2) != 0 || (class6.field71[var123][var138][var161] & 0x10) == 0 && Statics.method2829(var123, var138, var161) == field291)) {
                            if (var123 < class6.field72) {
                                class6.field72 = var123;
                            }
                            int var164 = Statics.field73[var123][var138][var161] & 0xFF;
                            int var165 = Statics.field2932[var123][var138][var161] & 0xFF;
                            if (var164 > 0 || var165 > 0) {
                                int var166 = class6.field87[var123][var138][var161];
                                int var167 = class6.field87[var123][var138 + 1][var161];
                                int var168 = class6.field87[var123][var138 + 1][var161 + 1];
                                int var169 = class6.field87[var123][var138][var161 + 1];
                                int var170 = Statics.field1531[var138][var161];
                                int var171 = Statics.field1531[var138 + 1][var161];
                                int var172 = Statics.field1531[var138 + 1][var161 + 1];
                                int var173 = Statics.field1531[var138][var161 + 1];
                                int var174 = -1;
                                int var175 = -1;
                                if (var164 > 0) {
                                    int var176 = var156 * 256 / var159;
                                    int var177 = var157 / var160;
                                    int var178 = var158 / var160;
                                    var174 = class6.method2080(var176, var177, var178);
                                    int var179 = class6.field84 + var176 & 0xFF;
                                    int var180 = class6.field85 + var178;
                                    if (var180 < 0) {
                                        var180 = 0;
                                    } else if (var180 > 255) {
                                        var180 = 255;
                                    }
                                    var175 = class6.method2080(var179, var177, var180);
                                }
                                if (var123 > 0) {
                                    boolean var181 = true;
                                    if (var164 == 0 && Statics.field74[var123][var138][var161] != 0) {
                                        var181 = false;
                                    }
                                    if (var165 > 0 && !class42.method520(var165 - 1).field972) {
                                        var181 = false;
                                    }
                                    if (var181 && var166 == var167 && var166 == var168 && var166 == var169) {
                                        Statics.field77[var123][var138][var161] |= 0x924;
                                    }
                                }
                                int var182 = 0;
                                if (var175 != -1) {
                                    var182 = class85.field1468[class6.method537(var175, 96)];
                                }
                                if (var165 == 0) {
                                    var117.method1635(var123, var138, var161, 0, 0, -1, var166, var167, var168, var169, class6.method537(var174, var170), class6.method537(var174, var171), class6.method537(var174, var172), class6.method537(var174, var173), 0, 0, 0, 0, var182, 0);
                                } else {
                                    int var183 = Statics.field74[var123][var138][var161] + 1;
                                    byte var184 = Statics.field3012[var123][var138][var161];
                                    class42 var185 = class42.method520(var165 - 1);
                                    int var186 = var185.field971;
                                    int var187;
                                    int var188;
                                    if (var186 >= 0) {
                                        var187 = Statics.field1484.method1857(var186);
                                        var188 = -1;
                                    } else if (var185.field970 == 16711935) {
                                        var188 = -2;
                                        var186 = -1;
                                        var187 = -2;
                                    } else {
                                        var188 = class6.method2080(var185.field973, var185.field975, var185.field980);
                                        int var189 = class6.field84 + var185.field973 & 0xFF;
                                        int var190 = class6.field85 + var185.field980;
                                        if (var190 < 0) {
                                            var190 = 0;
                                        } else if (var190 > 255) {
                                            var190 = 255;
                                        }
                                        var187 = class6.method2080(var189, var185.field975, var190);
                                    }
                                    int var191 = 0;
                                    if (var187 != -2) {
                                        var191 = class85.field1468[class6.method2702(var187, 96)];
                                    }
                                    if (var185.field976 != -1) {
                                        int var192 = class6.field84 + var185.field977 & 0xFF;
                                        int var193 = class6.field85 + var185.field968;
                                        if (var193 < 0) {
                                            var193 = 0;
                                        } else if (var193 > 255) {
                                            var193 = 255;
                                        }
                                        int var194 = class6.method2080(var192, var185.field978, var193);
                                        var191 = class85.field1468[class6.method2702(var194, 96)];
                                    }
                                    var117.method1635(var123, var138, var161, var183, var184, var186, var166, var167, var168, var169, class6.method537(var174, var170), class6.method537(var174, var171), class6.method537(var174, var172), class6.method537(var174, var173), class6.method2702(var188, var170), class6.method2702(var188, var171), class6.method2702(var188, var172), class6.method2702(var188, var173), var182, var191);
                                }
                            }
                        }
                    }
                }
            }
            for (int var195 = 1; var195 < 103; var195++) {
                for (int var196 = 1; var196 < 103; var196++) {
                    var117.method1644(var123, var196, var195, Statics.method2829(var123, var196, var195));
                }
            }
            Statics.field73[var123] = (byte[][]) null;
            Statics.field2932[var123] = (byte[][]) null;
            Statics.field74[var123] = (byte[][]) null;
            Statics.field3012[var123] = (byte[][]) null;
            Statics.field1280[var123] = (byte[][]) null;
        }
        var117.method1645(-50, -10, -50);
        for (int var197 = 0; var197 < 104; var197++) {
            for (int var198 = 0; var198 < 104; var198++) {
                if ((class6.field71[1][var197][var198] & 0x2) == 2) {
                    var117.method1632(var197, var198);
                }
            }
        }
        int var199 = 1;
        int var200 = 2;
        int var201 = 4;
        for (int var202 = 0; var202 < 4; var202++) {
            if (var202 > 0) {
                var199 <<= 0x3;
                var200 <<= 0x3;
                var201 <<= 0x3;
            }
            for (int var203 = 0; var203 <= var202; var203++) {
                for (int var204 = 0; var204 <= 104; var204++) {
                    for (int var205 = 0; var205 <= 104; var205++) {
                        if ((Statics.field77[var203][var205][var204] & var199) != 0) {
                            int var206 = var204;
                            int var207 = var204;
                            int var208 = var203;
                            int var209 = var203;
                            while (var206 > 0 && (Statics.field77[var203][var205][var206 - 1] & var199) != 0) {
                                var206--;
                            }
                            while (var207 < 104 && (Statics.field77[var203][var205][var207 + 1] & var199) != 0) {
                                var207++;
                            }
                            label696: while (var208 > 0) {
                                for (int var210 = var206; var210 <= var207; var210++) {
                                    if ((Statics.field77[var208 - 1][var205][var210] & var199) == 0) {
                                        break label696;
                                    }
                                }
                                var208--;
                            }
                            label685: while (var209 < var202) {
                                for (int var211 = var206; var211 <= var207; var211++) {
                                    if ((Statics.field77[var209 + 1][var205][var211] & var199) == 0) {
                                        break label685;
                                    }
                                }
                                var209++;
                            }
                            int var212 = (var209 + 1 - var208) * (var207 - var206 + 1);
                            if (var212 >= 8) {
                                short var213 = 240;
                                int var214 = class6.field87[var209][var205][var206] - var213;
                                int var215 = class6.field87[var208][var205][var206];
                                class80.method1633(var202, 1, var205 * 128, var205 * 128, var206 * 128, var207 * 128 + 128, var214, var215);
                                for (int var216 = var208; var216 <= var209; var216++) {
                                    for (int var217 = var206; var217 <= var207; var217++) {
                                        Statics.field77[var216][var205][var217] &= ~var199;
                                    }
                                }
                            }
                        }
                        if ((Statics.field77[var203][var205][var204] & var200) != 0) {
                            int var218 = var205;
                            int var219 = var205;
                            int var220 = var203;
                            int var221 = var203;
                            while (var218 > 0 && (Statics.field77[var203][var218 - 1][var204] & var200) != 0) {
                                var218--;
                            }
                            while (var219 < 104 && (Statics.field77[var203][var219 + 1][var204] & var200) != 0) {
                                var219++;
                            }
                            label749: while (var220 > 0) {
                                for (int var222 = var218; var222 <= var219; var222++) {
                                    if ((Statics.field77[var220 - 1][var222][var204] & var200) == 0) {
                                        break label749;
                                    }
                                }
                                var220--;
                            }
                            label738: while (var221 < var202) {
                                for (int var223 = var218; var223 <= var219; var223++) {
                                    if ((Statics.field77[var221 + 1][var223][var204] & var200) == 0) {
                                        break label738;
                                    }
                                }
                                var221++;
                            }
                            int var224 = (var221 + 1 - var220) * (var219 - var218 + 1);
                            if (var224 >= 8) {
                                short var225 = 240;
                                int var226 = class6.field87[var221][var218][var204] - var225;
                                int var227 = class6.field87[var220][var218][var204];
                                class80.method1633(var202, 2, var218 * 128, var219 * 128 + 128, var204 * 128, var204 * 128, var226, var227);
                                for (int var228 = var220; var228 <= var221; var228++) {
                                    for (int var229 = var218; var229 <= var219; var229++) {
                                        Statics.field77[var228][var229][var204] &= ~var200;
                                    }
                                }
                            }
                        }
                        if ((Statics.field77[var203][var205][var204] & var201) != 0) {
                            int var230 = var205;
                            int var231 = var205;
                            int var232 = var204;
                            int var233 = var204;
                            while (var232 > 0 && (Statics.field77[var203][var205][var232 - 1] & var201) != 0) {
                                var232--;
                            }
                            while (var233 < 104 && (Statics.field77[var203][var205][var233 + 1] & var201) != 0) {
                                var233++;
                            }
                            label802: while (var230 > 0) {
                                for (int var234 = var232; var234 <= var233; var234++) {
                                    if ((Statics.field77[var203][var230 - 1][var234] & var201) == 0) {
                                        break label802;
                                    }
                                }
                                var230--;
                            }
                            label791: while (var231 < 104) {
                                for (int var235 = var232; var235 <= var233; var235++) {
                                    if ((Statics.field77[var203][var231 + 1][var235] & var201) == 0) {
                                        break label791;
                                    }
                                }
                                var231++;
                            }
                            if ((var231 - var230 + 1) * (var233 - var232 + 1) >= 4) {
                                int var236 = class6.field87[var203][var230][var232];
                                class80.method1633(var202, 4, var230 * 128, var231 * 128 + 128, var232 * 128, var233 * 128 + 128, var236, var236);
                                for (int var237 = var230; var237 <= var231; var237++) {
                                    for (int var238 = var232; var238 <= var233; var238++) {
                                        Statics.field77[var203][var237][var238] &= ~var201;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method730(true);
        int var239 = class6.field72;
        if (var239 > Statics.field1880) {
            var239 = Statics.field1880;
        }
        if (var239 < Statics.field1880 - 1) {
            int var240 = Statics.field1880 - 1;
        }
        if (field244) {
            Statics.field965.method1631(class6.field72);
        } else {
            Statics.field965.method1631(0);
        }
        for (int var241 = 0; var241 < 104; var241++) {
            for (int var242 = 0; var242 < 104; var242++) {
                method153(var241, var242);
            }
        }
        method518();
        method35();
        class37.field856.method3181();
        if (Statics.field982 != null) {
            field279.method2364(84);
            field279.method2233(1057001181);
        }
        if (!field256) {
            int var243 = (Statics.field1920 - 6) / 8;
            int var244 = (Statics.field1920 + 6) / 8;
            int var245 = (Statics.field535 - 6) / 8;
            int var246 = (Statics.field535 + 6) / 8;
            for (int var247 = var243 - 1; var247 <= var244 + 1; var247++) {
                for (int var248 = var245 - 1; var248 <= var246 + 1; var248++) {
                    if (var247 < var243 || var247 > var244 || var248 < var245 || var248 > var246) {
                        Statics.field2472.method2803("m" + var247 + "_" + var248);
                        Statics.field2472.method2803("l" + var247 + "_" + var248);
                    }
                }
            }
        }
        method469(30);
        method518();
        class6.method499();
        field279.method2364(246);
        Statics.field2110.method2468();
        for (int var249 = 0; var249 < 32; var249++) {
            field2047[var249] = 0L;
        }
        for (int var250 = 0; var250 < 32; var250++) {
            field2056[var250] = 0L;
        }
        Statics.field1461 = 0;
    }

    @ObfuscatedName("dy.bk(IB)V")
    public static final void method2562(int arg0) {
        int[] var1 = Statics.field635.field1307;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field71[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field965.method1657(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field71[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field965.method1657(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field635.method1453();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field71[arg0][var10][var9] & 0x18) == 0) {
                    method31(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field71[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method31(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field257 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field965.method1659(Statics.field1880, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class37.method96(var14).field878;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field441[Statics.field1880].field3005;
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
                        field470[field257] = Statics.field1024[var15];
                        field334[field257] = var16;
                        field469[field257] = var17;
                        field257++;
                    }
                }
            }
        }
        Statics.field60.method1443();
    }

    @ObfuscatedName("h.by(IIIIIB)V")
    public static final void method31(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field965.method1656(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field965.method1755(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field635.field1307;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class37 var13 = class37.method96(var12);
            if (var13.field879 == -1) {
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
                class75 var14 = Statics.field1958[var13.field879];
                if (var14 != null) {
                    int var15 = (var13.field860 * 4 - var14.field1323) / 2;
                    int var16 = (var13.field866 * 4 - var14.field1324) / 2;
                    var14.method1598(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field866) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field965.method1658(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field965.method1755(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class37 var22 = class37.method96(var21);
            if (var22.field879 != -1) {
                class75 var23 = Statics.field1958[var22.field879];
                if (var23 != null) {
                    int var24 = (var22.field860 * 4 - var23.field1323) / 2;
                    int var25 = (var22.field866 * 4 - var23.field1324) / 2;
                    var23.method1598(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field866) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field635.field1307;
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
        int var29 = Statics.field965.method1659(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class37 var31 = class37.method96(var30);
        if (var31.field879 == -1) {
            return;
        }
        class75 var32 = Statics.field1958[var31.field879];
        if (var32 != null) {
            int var33 = (var31.field860 * 4 - var32.field1323) / 2;
            int var34 = (var31.field866 * 4 - var32.field1324) / 2;
            var32.method1598(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field866) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ae.bp(B)V")
    public static final void method545() {
        if (field283 == 126) {
            int var0 = field281.method2151();
            int var1 = (var0 >> 4 & 0x7) + Statics.field3009;
            int var2 = (var0 & 0x7) + Statics.field1574;
            int var3 = field281.method2129();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class180 var4 = field373[Statics.field1880][var1][var2];
                if (var4 != null) {
                    for (class26 var5 = (class26) var4.method3251(); var5 != null; var5 = (class26) var4.method3272()) {
                        if ((var3 & 0x7FFF) == var5.field623) {
                            var5.method3352();
                            break;
                        }
                    }
                    if (var4.method3251() == null) {
                        field373[Statics.field1880][var1][var2] = null;
                    }
                    method153(var1, var2);
                }
            }
        } else if (field283 == 66) {
            int var6 = field281.method2299();
            int var7 = (var6 >> 4 & 0x7) + Statics.field3009;
            int var8 = (var6 & 0x7) + Statics.field1574;
            int var9 = var7 + field281.method2128();
            int var10 = var8 + field281.method2128();
            int var11 = field281.method2130();
            int var12 = field281.method2129();
            int var13 = field281.method2299() * 4;
            int var14 = field281.method2299() * 4;
            int var15 = field281.method2129();
            int var16 = field281.method2129();
            int var17 = field281.method2299();
            int var18 = field281.method2299();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var12 != 65535) {
                int var19 = var7 * 128 + 64;
                int var20 = var8 * 128 + 64;
                int var21 = var9 * 128 + 64;
                int var22 = var10 * 128 + 64;
                class7 var23 = new class7(var12, Statics.field1880, var19, var20, method1974(var19, var20, Statics.field1880) - var13, field348 + var15, field348 + var16, var17, var18, var11, var14);
                var23.method70(var21, var22, method1974(var21, var22, Statics.field1880) - var14, field348 + var15);
                field375.method3246(var23);
            }
        } else if (field283 == 12) {
            int var24 = field281.method2299();
            int var25 = (var24 >> 4 & 0x7) + Statics.field3009;
            int var26 = (var24 & 0x7) + Statics.field1574;
            int var27 = field281.method2129();
            int var28 = field281.method2299();
            int var29 = field281.method2129();
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                int var30 = var25 * 128 + 64;
                int var31 = var26 * 128 + 64;
                class27 var32 = new class27(var27, Statics.field1880, var30, var31, method1974(var30, var31, Statics.field1880) - var28, var29, field348);
                field376.method3246(var32);
            }
        } else {
            if (field283 == 189) {
                byte var33 = field281.method2154();
                int var34 = field281.method2129();
                int var35 = field281.method2129();
                byte var36 = field281.method2156();
                byte var37 = field281.method2128();
                int var38 = field281.method2256();
                byte var39 = field281.method2155();
                int var40 = field281.method2152();
                int var41 = var40 >> 2;
                int var42 = var40 & 0x3;
                int var43 = field471[var41];
                int var44 = field281.method2129();
                int var45 = field281.method2152();
                int var46 = (var45 >> 4 & 0x7) + Statics.field3009;
                int var47 = (var45 & 0x7) + Statics.field1574;
                class3 var48;
                if (field280 == var38) {
                    var48 = Statics.field163;
                } else {
                    var48 = field358[var38];
                }
                if (var48 != null) {
                    class37 var49 = class37.method96(var34);
                    int var50;
                    int var51;
                    if (var42 == 1 || var42 == 3) {
                        var50 = var49.field866;
                        var51 = var49.field860;
                    } else {
                        var50 = var49.field860;
                        var51 = var49.field866;
                    }
                    int var52 = (var50 >> 1) + var46;
                    int var53 = (var50 + 1 >> 1) + var46;
                    int var54 = (var51 >> 1) + var47;
                    int var55 = (var51 + 1 >> 1) + var47;
                    int[][] var56 = class6.field87[Statics.field1880];
                    int var57 = var56[var52][var54] + var56[var53][var54] + var56[var52][var55] + var56[var53][var55] >> 2;
                    int var58 = (var46 << 7) + (var50 << 6);
                    int var59 = (var47 << 7) + (var51 << 6);
                    class99 var60 = var49.method715(var41, var42, var56, var58, var57, var59);
                    if (var60 != null) {
                        method850(Statics.field1880, var46, var47, var43, -1, 0, 0, var44 + 1, var35 + 1);
                        var48.field35 = field348 + var44;
                        var48.field36 = field348 + var35;
                        var48.field33 = var60;
                        var48.field40 = var46 * 128 + var50 * 64;
                        var48.field31 = var47 * 128 + var51 * 64;
                        var48.field28 = var57;
                        if (var39 > var33) {
                            byte var61 = var39;
                            var39 = var33;
                            var33 = var61;
                        }
                        if (var37 > var36) {
                            byte var62 = var37;
                            var37 = var36;
                            var36 = var62;
                        }
                        var48.field41 = var39 + var46;
                        var48.field43 = var33 + var46;
                        var48.field37 = var37 + var47;
                        var48.field42 = var36 + var47;
                    }
                }
            }
            if (field283 == 39) {
                int var63 = field281.method2299();
                int var64 = (var63 >> 4 & 0x7) + Statics.field3009;
                int var65 = (var63 & 0x7) + Statics.field1574;
                int var66 = field281.method2129();
                int var67 = field281.method2299();
                int var68 = var67 >> 4 & 0xF;
                int var69 = var67 & 0x7;
                int var70 = field281.method2299();
                if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                    int var71 = var68 + 1;
                    if (Statics.field163.field787[0] >= var64 - var71 && Statics.field163.field787[0] <= var64 + var71 && Statics.field163.field788[0] >= var65 - var71 && Statics.field163.field788[0] <= var65 + var71 && field479 != 0 && var69 > 0 && field320 < 50) {
                        field481[field320] = var66;
                        field295[field320] = var69;
                        field483[field320] = var70;
                        field485[field320] = null;
                        field484[field320] = (var64 << 16) + (var65 << 8) + var68;
                        field320++;
                    }
                }
            }
            if (field283 == 63) {
                int var72 = field281.method2299();
                int var73 = (var72 >> 4 & 0x7) + Statics.field3009;
                int var74 = (var72 & 0x7) + Statics.field1574;
                int var75 = field281.method2129();
                int var76 = field281.method2129();
                int var77 = field281.method2129();
                if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                    class180 var78 = field373[Statics.field1880][var73][var74];
                    if (var78 != null) {
                        for (class26 var79 = (class26) var78.method3251(); var79 != null; var79 = (class26) var78.method3272()) {
                            if ((var75 & 0x7FFF) == var79.field623 && var79.field617 == var76) {
                                var79.field617 = var77;
                                break;
                            }
                        }
                        method153(var73, var74);
                    }
                }
            } else if (field283 == 163) {
                int var80 = field281.method2160();
                int var81 = field281.method2162();
                int var82 = field281.method2299();
                int var83 = (var82 >> 4 & 0x7) + Statics.field3009;
                int var84 = (var82 & 0x7) + Statics.field1574;
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    class26 var85 = new class26();
                    var85.field623 = var81;
                    var85.field617 = var80;
                    if (field373[Statics.field1880][var83][var84] == null) {
                        field373[Statics.field1880][var83][var84] = new class180();
                    }
                    field373[Statics.field1880][var83][var84].method3246(var85);
                    method153(var83, var84);
                }
            } else if (field283 == 41) {
                int var86 = field281.method2152();
                int var87 = var86 >> 2;
                int var88 = var86 & 0x3;
                int var89 = field471[var87];
                int var90 = field281.method2162();
                int var91 = field281.method2151();
                int var92 = (var91 >> 4 & 0x7) + Statics.field3009;
                int var93 = (var91 & 0x7) + Statics.field1574;
                if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                    method850(Statics.field1880, var92, var93, var89, var90, var87, var88, 0, -1);
                }
            } else if (field283 == 195) {
                int var94 = field281.method2112();
                int var95 = var94 >> 2;
                int var96 = var94 & 0x3;
                int var97 = field471[var95];
                int var98 = field281.method2256();
                int var99 = field281.method2112();
                int var100 = (var99 >> 4 & 0x7) + Statics.field3009;
                int var101 = (var99 & 0x7) + Statics.field1574;
                if (var100 >= 0 && var101 >= 0 && var100 < 103 && var101 < 103) {
                    if (var97 == 0) {
                        class81 var102 = Statics.field965.method1754(Statics.field1880, var100, var101);
                        if (var102 != null) {
                            int var103 = var102.field1425 >> 14 & 0x7FFF;
                            if (var95 == 2) {
                                var102.field1423 = new class11(var103, 2, var96 + 4, Statics.field1880, var100, var101, var98, false, var102.field1423);
                                var102.field1424 = new class11(var103, 2, var96 + 1 & 0x3, Statics.field1880, var100, var101, var98, false, var102.field1424);
                            } else {
                                var102.field1423 = new class11(var103, var95, var96, Statics.field1880, var100, var101, var98, false, var102.field1423);
                            }
                        }
                    }
                    if (var97 == 1) {
                        class88 var104 = Statics.field965.method1653(Statics.field1880, var100, var101);
                        if (var104 != null) {
                            int var105 = var104.field1510 >> 14 & 0x7FFF;
                            if (var95 == 4 || var95 == 5) {
                                var104.field1506 = new class11(var105, 4, var96, Statics.field1880, var100, var101, var98, false, var104.field1506);
                            } else if (var95 == 6) {
                                var104.field1506 = new class11(var105, 4, var96 + 4, Statics.field1880, var100, var101, var98, false, var104.field1506);
                            } else if (var95 == 7) {
                                var104.field1506 = new class11(var105, 4, (var96 + 2 & 0x3) + 4, Statics.field1880, var100, var101, var98, false, var104.field1506);
                            } else if (var95 == 8) {
                                var104.field1506 = new class11(var105, 4, var96 + 4, Statics.field1880, var100, var101, var98, false, var104.field1506);
                                var104.field1509 = new class11(var105, 4, (var96 + 2 & 0x3) + 4, Statics.field1880, var100, var101, var98, false, var104.field1509);
                            }
                        }
                    }
                    if (var97 == 2) {
                        class92 var106 = Statics.field965.method1720(Statics.field1880, var100, var101);
                        if (var95 == 11) {
                            var95 = 10;
                        }
                        if (var106 != null) {
                            var106.field1572 = new class11(var106.field1560 >> 14 & 0x7FFF, var95, var96, Statics.field1880, var100, var101, var98, false, var106.field1572);
                        }
                    }
                    if (var97 == 3) {
                        class87 var107 = Statics.field965.method1664(Statics.field1880, var100, var101);
                        if (var107 != null) {
                            var107.field1492 = new class11(var107.field1493 >> 14 & 0x7FFF, 22, var96, Statics.field1880, var100, var101, var98, false, var107.field1492);
                        }
                    }
                }
            } else if (field283 == 211) {
                int var108 = field281.method2112();
                int var109 = var108 >> 2;
                int var110 = var108 & 0x3;
                int var111 = field471[var109];
                int var112 = field281.method2151();
                int var113 = (var112 >> 4 & 0x7) + Statics.field3009;
                int var114 = (var112 & 0x7) + Statics.field1574;
                if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                    method850(Statics.field1880, var113, var114, var111, -1, var109, var110, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("av.bs(IIIIIIIIII)V")
    public static final void method850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field374.method3251(); var10 != null; var10 = (class15) field374.method3272()) {
            if (var10.field199 == arg0 && var10.field207 == arg1 && var10.field198 == arg2 && var10.field212 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field199 = arg0;
            var9.field212 = arg3;
            var9.field207 = arg1;
            var9.field198 = arg2;
            method2445(var9);
            field374.method3246(var9);
        }
        var9.field204 = arg4;
        var9.field206 = arg5;
        var9.field205 = arg6;
        var9.field200 = arg7;
        var9.field208 = arg8;
    }

    @ObfuscatedName("p.bn(B)V")
    public static final void method35() {
        for (class15 var0 = (class15) field374.method3251(); var0 != null; var0 = (class15) field374.method3272()) {
            if (var0.field208 == -1) {
                var0.field200 = 0;
                method2445(var0);
            } else {
                var0.method3352();
            }
        }
    }

    @ObfuscatedName("df.bb(Lg;I)V")
    public static final void method2445(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field212 == 0) {
            var1 = Statics.field965.method1656(arg0.field199, arg0.field207, arg0.field198);
        }
        if (arg0.field212 == 1) {
            var1 = Statics.field965.method1742(arg0.field199, arg0.field207, arg0.field198);
        }
        if (arg0.field212 == 2) {
            var1 = Statics.field965.method1658(arg0.field199, arg0.field207, arg0.field198);
        }
        if (arg0.field212 == 3) {
            var1 = Statics.field965.method1659(arg0.field199, arg0.field207, arg0.field198);
        }
        if (var1 != 0) {
            int var5 = Statics.field965.method1755(arg0.field199, arg0.field207, arg0.field198, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field197 = var2;
        arg0.field203 = var3;
        arg0.field202 = var4;
    }

    @ObfuscatedName("ds.bt(I)V")
    public static final void method2491() {
        for (class15 var0 = (class15) field374.method3251(); var0 != null; var0 = (class15) field374.method3272()) {
            if (var0.field208 > 0) {
                var0.field208--;
            }
            if (var0.field208 != 0) {
                if (var0.field200 > 0) {
                    var0.field200--;
                }
                if (var0.field200 == 0 && var0.field207 >= 1 && var0.field198 >= 1 && var0.field207 <= 102 && var0.field198 <= 102 && (var0.field204 < 0 || class6.method2394(var0.field204, var0.field206))) {
                    method2899(var0.field199, var0.field212, var0.field207, var0.field198, var0.field204, var0.field205, var0.field206);
                    var0.field200 = -1;
                    if (var0.field204 == var0.field197 && var0.field197 == -1) {
                        var0.method3352();
                    } else if (var0.field204 == var0.field197 && var0.field205 == var0.field202 && var0.field206 == var0.field203) {
                        var0.method3352();
                    }
                }
            } else if (var0.field197 < 0 || class6.method2394(var0.field197, var0.field203)) {
                method2899(var0.field199, var0.field212, var0.field207, var0.field198, var0.field197, var0.field202, var0.field203);
                var0.method3352();
            }
        }
    }

    @ObfuscatedName("ev.bj(IIIIIIII)V")
    public static final void method2899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field244 && Statics.field1880 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field965.method1656(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field965.method1742(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field965.method1658(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field965.method1659(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field965.method1755(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field965.method1647(arg0, arg2, arg3);
                class37 var15 = class37.method96(var12);
                if (var15.field867 != 0) {
                    field441[arg0].method3610(arg2, arg3, var13, var14, var15.field868);
                }
            }
            if (arg1 == 1) {
                Statics.field965.method1648(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field965.method1649(arg0, arg2, arg3);
                class37 var16 = class37.method96(var12);
                if (var16.field860 + arg2 > 103 || var16.field860 + arg3 > 103 || var16.field866 + arg2 > 103 || var16.field866 + arg3 > 103) {
                    return;
                }
                if (var16.field867 != 0) {
                    field441[arg0].method3621(arg2, arg3, var16.field860, var16.field866, var14, var16.field868);
                }
            }
            if (arg1 == 3) {
                Statics.field965.method1760(arg0, arg2, arg3);
                class37 var17 = class37.method96(var12);
                if (var17.field867 == 1) {
                    field441[arg0].method3604(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field71[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class80 var19 = Statics.field965;
        class209 var20 = field441[arg0];
        class37 var21 = class37.method96(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field866;
            var23 = var21.field860;
        } else {
            var22 = var21.field860;
            var23 = var21.field866;
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
        int[][] var28 = class6.field87[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field894 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field883 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class79 var34;
            if (var21.field887 == -1 && var21.field891 == null) {
                var34 = var21.method715(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field887, true, (class79) null);
            }
            var19.method1636(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field867 == 1) {
                var20.method3620(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class79 var57;
            if (var21.field887 == -1 && var21.field891 == null) {
                var57 = var21.method715(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field887, true, (class79) null);
            }
            if (var57 != null) {
                var19.method1640(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field867 != 0) {
                var20.method3606(arg2, arg3, var22, var23, var21.field868);
            }
        } else if (arg6 >= 12) {
            class79 var35;
            if (var21.field887 == -1 && var21.field891 == null) {
                var35 = var21.method715(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field887, true, (class79) null);
            }
            var19.method1640(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field867 != 0) {
                var20.method3606(arg2, arg3, var22, var23, var21.field868);
            }
        } else if (arg6 == 0) {
            class79 var36;
            if (var21.field887 == -1 && var21.field891 == null) {
                var36 = var21.method715(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field887, true, (class79) null);
            }
            var19.method1768(arg0, arg2, arg3, var29, var36, (class79) null, class6.field78[arg5], 0, var32, var33);
            if (var21.field867 != 0) {
                var20.method3605(arg2, arg3, arg6, arg5, var21.field868);
            }
        } else if (arg6 == 1) {
            class79 var37;
            if (var21.field887 == -1 && var21.field891 == null) {
                var37 = var21.method715(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field887, true, (class79) null);
            }
            var19.method1768(arg0, arg2, arg3, var29, var37, (class79) null, class6.field79[arg5], 0, var32, var33);
            if (var21.field867 != 0) {
                var20.method3605(arg2, arg3, arg6, arg5, var21.field868);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class79 var39;
            class79 var40;
            if (var21.field887 == -1 && var21.field891 == null) {
                var39 = var21.method715(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method715(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field887, true, (class79) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field887, true, (class79) null);
            }
            var19.method1768(arg0, arg2, arg3, var29, var39, var40, class6.field78[arg5], class6.field78[var38], var32, var33);
            if (var21.field867 != 0) {
                var20.method3605(arg2, arg3, arg6, arg5, var21.field868);
            }
        } else if (arg6 == 3) {
            class79 var41;
            if (var21.field887 == -1 && var21.field891 == null) {
                var41 = var21.method715(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field887, true, (class79) null);
            }
            var19.method1768(arg0, arg2, arg3, var29, var41, (class79) null, class6.field79[arg5], 0, var32, var33);
            if (var21.field867 != 0) {
                var20.method3605(arg2, arg3, arg6, arg5, var21.field868);
            }
        } else if (arg6 == 9) {
            class79 var42;
            if (var21.field887 == -1 && var21.field891 == null) {
                var42 = var21.method715(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field887, true, (class79) null);
            }
            var19.method1640(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field867 != 0) {
                var20.method3606(arg2, arg3, var22, var23, var21.field868);
            }
        } else if (arg6 == 4) {
            class79 var43;
            if (var21.field887 == -1 && var21.field891 == null) {
                var43 = var21.method715(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field887, true, (class79) null);
            }
            var19.method1769(arg0, arg2, arg3, var29, var43, (class79) null, class6.field78[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1656(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class37.method96(var45 >> 14 & 0x7FFF).field898;
            }
            class79 var46;
            if (var21.field887 == -1 && var21.field891 == null) {
                var46 = var21.method715(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field887, true, (class79) null);
            }
            var19.method1769(arg0, arg2, arg3, var29, var46, (class79) null, class6.field78[arg5], 0, class6.field80[arg5] * var44, class6.field89[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1656(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class37.method96(var48 >> 14 & 0x7FFF).field898 / 2;
            }
            class79 var49;
            if (var21.field887 == -1 && var21.field891 == null) {
                var49 = var21.method715(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field887, true, (class79) null);
            }
            var19.method1769(arg0, arg2, arg3, var29, var49, (class79) null, 256, arg5, class6.field90[arg5] * var47, class6.field83[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class79 var51;
            if (var21.field887 == -1 && var21.field891 == null) {
                var51 = var21.method715(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field887, true, (class79) null);
            }
            var19.method1769(arg0, arg2, arg3, var29, var51, (class79) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1656(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class37.method96(var53 >> 14 & 0x7FFF).field898 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class79 var55;
            class79 var56;
            if (var21.field887 == -1 && var21.field891 == null) {
                var55 = var21.method715(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method715(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field887, true, (class79) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field887, true, (class79) null);
            }
            var19.method1769(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field90[arg5] * var52, class6.field83[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("c.bh(III)V")
    public static final void method153(int arg0, int arg1) {
        class180 var2 = field373[Statics.field1880][arg0][arg1];
        if (var2 == null) {
            Statics.field965.method1765(Statics.field1880, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class26 var5 = null;
        for (class26 var6 = (class26) var2.method3251(); var6 != null; var6 = (class26) var2.method3272()) {
            class46 var7 = class46.method1975(var6.field623);
            long var8 = (long) var7.field1043;
            if (var7.field1042 == 1) {
                var8 = (long) (var6.field617 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field965.method1765(Statics.field1880, arg0, arg1);
            return;
        }
        var2.method3247(var5);
        class26 var10 = null;
        class26 var11 = null;
        for (class26 var12 = (class26) var2.method3251(); var12 != null; var12 = (class26) var2.method3272()) {
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
        Statics.field965.method1744(Statics.field1880, arg0, arg1, method1974(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1880), var5, var13, var10, var11);
    }

    @ObfuscatedName("dm.bw(I)V")
    public static final void method2274() {
        for (int var0 = 0; var0 < field361; var0++) {
            int var1 = field362[var0];
            class3 var2 = field358[var1];
            int var3 = field281.method2299();
            if ((var3 & 0x4) != 0) {
                var3 += field281.method2299() << 8;
            }
            method2714(var1, var2, var3);
        }
    }

    @ObfuscatedName("eo.bx(ILm;II)V")
    public static final void method2714(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x1) != 0) {
            int var3 = field281.method2151();
            byte[] var4 = new byte[var3];
            class108 var5 = new class108(var4);
            field281.method2292(var4, 0, var3);
            field400[arg0] = var5;
            arg1.method7(var5);
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field758 = field281.method2129();
            if (arg1.field758 == 65535) {
                arg1.field758 = -1;
            }
        }
        if ((arg2 & 0x40) != 0) {
            int var6 = field281.method2162();
            int var7 = field281.method2152();
            arg1.method621(var6, var7, field348);
            arg1.field743 = field348 + 300;
            arg1.field756 = field281.method2112();
            arg1.field757 = field281.method2112();
        }
        if ((arg2 & 0x80) != 0) {
            int var8 = field281.method2162();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = field281.method2112();
            method1099(arg1, var8, var9);
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field774 = field281.method2112();
            arg1.field777 = field281.method2151();
            arg1.field775 = field281.method2151();
            arg1.field739 = field281.method2112();
            arg1.field778 = field281.method2129() + field348;
            arg1.field779 = field281.method2162() + field348;
            arg1.field780 = field281.method2112();
            arg1.field755 = 1;
            arg1.field791 = 0;
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field738 = field281.method2270();
            if (arg1.field738.charAt(0) == '~') {
                arg1.field738 = arg1.field738.substring(1);
                class10.method2806(2, arg1.field39, arg1.field738);
            } else if (Statics.field163 == arg1) {
                class10.method2806(2, arg1.field39, arg1.field738);
            }
            arg1.field745 = false;
            arg1.field750 = 0;
            arg1.field751 = 0;
            arg1.field735 = 150;
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field746 = field281.method2160();
            arg1.field776 = field281.method2256();
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field786 = field281.method2160();
            int var10 = field281.method2170();
            arg1.field773 = var10 >> 16;
            arg1.field772 = (var10 & 0xFFFF) + field348;
            arg1.field770 = 0;
            arg1.field771 = 0;
            if (arg1.field772 > field348) {
                arg1.field770 = -1;
            }
            if (arg1.field786 == 65535) {
                arg1.field786 = -1;
            }
        }
        if ((arg2 & 0x200) != 0) {
            int var11 = field281.method2256();
            int var12 = field281.method2151();
            arg1.method621(var11, var12, field348);
            arg1.field743 = field348 + 300;
            arg1.field756 = field281.method2152();
            arg1.field757 = field281.method2299();
        }
        if ((arg2 & 0x20) == 0) {
            return;
        }
        int var13 = field281.method2162();
        class140[] var14 = new class140[] { class140.field2113, class140.field2116, class140.field2109, class140.field2111, class140.field2117 };
        class140 var15 = (class140) class100.method1790(var14, field281.method2152());
        boolean var16 = field281.method2151() == 1;
        int var17 = field281.method2152();
        int var18 = field281.field1841;
        if (arg1.field39 != null && arg1.field29 != null) {
            boolean var19 = false;
            if (var15.field2107 && method21(arg1.field39)) {
                var19 = true;
            }
            if (!var19 && field357 == 0 && !arg1.field47) {
                field264.field1841 = 0;
                field281.method2172(field264.field1839, 0, var17);
                field264.field1841 = 0;
                class108 var20 = field264;
                String var21 = class203.method2717(var20, 32767);
                String var22 = class204.method3502(class211.method2718(var21));
                arg1.field738 = var22.trim();
                arg1.field750 = var13 >> 8;
                arg1.field751 = var13 & 0xFF;
                arg1.field735 = 150;
                arg1.field745 = var16;
                arg1.field748 = Statics.field163 != arg1 && var15.field2107 && field457 != "" && var22.toLowerCase().indexOf(field457) == -1;
                int var23;
                if (var15.field2108) {
                    var23 = var16 ? 91 : 1;
                } else {
                    var23 = var16 ? 90 : 2;
                }
                if (var15.field2115 == -1) {
                    class10.method2806(var23, arg1.field39, var22);
                } else {
                    int var25 = var15.field2115;
                    String var26 = "<img=" + var25 + ">";
                    class10.method2806(var23, var26 + arg1.field39, var22);
                }
            }
        }
        field281.field1841 = var17 + var18;
    }

    @ObfuscatedName("r.bf(ZI)V")
    public static final void method472(boolean arg0) {
        field236 = 0;
        field361 = 0;
        method2716();
        while (field281.method2368(field446) >= 27) {
            int var1 = field281.method2366(15);
            if (var1 == 32767) {
                break;
            }
            boolean var17 = false;
            if (field276[var1] == null) {
                field276[var1] = new class31();
                var17 = true;
            }
            class31 var18 = field276[var1];
            field298[++field277 - 1] = var1;
            var18.field793 = field348;
            int var19;
            if (arg0) {
                var19 = field281.method2366(8);
                if (var19 > 127) {
                    var19 -= 256;
                }
            } else {
                var19 = field281.method2366(5);
                if (var19 > 15) {
                    var19 -= 32;
                }
            }
            int var20 = field281.method2366(1);
            var18.field703 = class36.method119(field281.method2366(14));
            int var21 = field371[field281.method2366(3)];
            if (var17) {
                var18.field783 = var18.field769 = var21;
            }
            int var22 = field281.method2366(1);
            if (var22 == 1) {
                field362[++field361 - 1] = var1;
            }
            int var23;
            if (arg0) {
                var23 = field281.method2366(8);
                if (var23 > 127) {
                    var23 -= 256;
                }
            } else {
                var23 = field281.method2366(5);
                if (var23 > 15) {
                    var23 -= 32;
                }
            }
            var18.field737 = var18.field703.field844;
            var18.field785 = var18.field703.field834;
            if (var18.field785 == 0) {
                var18.field769 = 0;
            }
            var18.field740 = var18.field703.field817;
            var18.field742 = var18.field703.field818;
            var18.field760 = var18.field703.field819;
            var18.field744 = var18.field703.field838;
            var18.field766 = var18.field703.field846;
            var18.field790 = var18.field703.field833;
            var18.field733 = var18.field703.field816;
            var18.method619(Statics.field163.field787[0] + var19, Statics.field163.field788[0] + var23, var20 == 1);
        }
        field281.method2367();
        for (int var2 = 0; var2 < field361; var2++) {
            int var3 = field362[var2];
            class31 var4 = field276[var3];
            int var5 = field281.method2299();
            if ((var5 & 0x80) != 0) {
                int var6 = field281.method2152();
                int var7 = field281.method2151();
                var4.method621(var6, var7, field348);
                var4.field743 = field348 + 300;
                var4.field756 = field281.method2129();
                var4.field757 = field281.method2129();
            }
            if ((var5 & 0x1) != 0) {
                var4.field746 = field281.method2162();
                var4.field776 = field281.method2256();
            }
            if ((var5 & 0x10) != 0) {
                var4.field703 = class36.method119(field281.method2162());
                var4.field737 = var4.field703.field844;
                var4.field785 = var4.field703.field834;
                var4.field740 = var4.field703.field817;
                var4.field742 = var4.field703.field818;
                var4.field760 = var4.field703.field819;
                var4.field744 = var4.field703.field838;
                var4.field766 = var4.field703.field846;
                var4.field790 = var4.field703.field833;
                var4.field733 = var4.field703.field816;
            }
            if ((var5 & 0x4) != 0) {
                int var8 = field281.method2112();
                int var9 = field281.method2299();
                var4.method621(var8, var9, field348);
                var4.field743 = field348 + 300;
                var4.field756 = field281.method2256();
                var4.field757 = field281.method2256();
            }
            if ((var5 & 0x8) != 0) {
                var4.field786 = field281.method2256();
                int var10 = field281.method2170();
                var4.field773 = var10 >> 16;
                var4.field772 = (var10 & 0xFFFF) + field348;
                var4.field770 = 0;
                var4.field771 = 0;
                if (var4.field772 > field348) {
                    var4.field770 = -1;
                }
                if (var4.field786 == 65535) {
                    var4.field786 = -1;
                }
            }
            if ((var5 & 0x20) != 0) {
                var4.field738 = field281.method2270();
                var4.field735 = 100;
            }
            if ((var5 & 0x2) != 0) {
                var4.field758 = field281.method2162();
                if (var4.field758 == 65535) {
                    var4.field758 = -1;
                }
            }
            if ((var5 & 0x40) != 0) {
                int var11 = field281.method2162();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = field281.method2152();
                if (var4.field764 == var11 && var11 != -1) {
                    int var13 = class39.method633(var11).field928;
                    if (var13 == 1) {
                        var4.field765 = 0;
                        var4.field782 = 0;
                        var4.field767 = var12;
                        var4.field768 = 0;
                    }
                    if (var13 == 2) {
                        var4.field768 = 0;
                    }
                } else if (var11 == -1 || var4.field764 == -1 || class39.method633(var11).field924 >= class39.method633(var4.field764).field924) {
                    var4.field764 = var11;
                    var4.field765 = 0;
                    var4.field782 = 0;
                    var4.field767 = var12;
                    var4.field768 = 0;
                    var4.field791 = var4.field755;
                }
            }
        }
        for (int var14 = 0; var14 < field236; var14++) {
            int var15 = field367[var14];
            if (field348 != field276[var15].field793) {
                field276[var15].field703 = null;
                field276[var15] = null;
            }
        }
        if (field446 != field281.field1841) {
            throw new RuntimeException(field281.field1841 + class2.field25 + field446);
        }
        for (int var16 = 0; var16 < field277; var16++) {
            if (field276[field298[var16]] == null) {
                throw new RuntimeException(var16 + class2.field25 + field277);
            }
        }
    }

    @ObfuscatedName("ee.ba(I)V")
    public static final void method2716() {
        field281.method2381();
        int var0 = field281.method2366(8);
        if (var0 < field277) {
            for (int var1 = var0; var1 < field277; var1++) {
                field367[++field236 - 1] = field298[var1];
            }
        }
        if (var0 > field277) {
            throw new RuntimeException("");
        }
        field277 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field298[var2];
            class31 var4 = field276[var3];
            int var5 = field281.method2366(1);
            if (var5 == 0) {
                field298[++field277 - 1] = var3;
                var4.field793 = field348;
            } else {
                int var6 = field281.method2366(2);
                if (var6 == 0) {
                    field298[++field277 - 1] = var3;
                    var4.field793 = field348;
                    field362[++field361 - 1] = var3;
                } else if (var6 == 1) {
                    field298[++field277 - 1] = var3;
                    var4.field793 = field348;
                    int var7 = field281.method2366(3);
                    var4.method635(var7, false);
                    int var8 = field281.method2366(1);
                    if (var8 == 1) {
                        field362[++field361 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field298[++field277 - 1] = var3;
                    var4.field793 = field348;
                    int var9 = field281.method2366(3);
                    var4.method635(var9, true);
                    int var10 = field281.method2366(3);
                    var4.method635(var10, true);
                    int var11 = field281.method2366(1);
                    if (var11 == 1) {
                        field362[++field361 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field367[++field236 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("x.bl(IIIII)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field444; var4++) {
            if (field466[var4] + field451[var4] > arg0 && field466[var4] < arg0 + arg2 && field452[var4] + field450[var4] > arg1 && field450[var4] < arg1 + arg3) {
                field248[var4] = true;
            }
        }
    }

    @ObfuscatedName("dk.bd(III)V")
    public static final void method2387(int arg0, int arg1) {
        int var2 = Statics.field2774.method3472(class145.field2313);
        for (int var3 = 0; var3 < field478; var3++) {
            class205 var4 = Statics.field2774;
            String var5;
            if (field388[var3].length() > 0) {
                var5 = field387[var3] + class145.field2320 + field388[var3];
            } else {
                var5 = field387[var3];
            }
            int var6 = var4.method3472(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field478 * 15 + 21;
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
        field381 = true;
        Statics.field1577 = var8;
        Statics.field1015 = var9;
        Statics.field2817 = var2;
        Statics.field1131 = field478 * 15 + 22;
    }

    @ObfuscatedName("ay.bz(IB)V")
    public static final void method549(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field383[arg0];
        int var2 = field384[arg0];
        int var3 = field385[arg0];
        int var4 = field312[arg0];
        String var5 = field387[arg0];
        String var6 = field388[arg0];
        method598(var1, var2, var3, var4, var5, var6, class129.field2008, class129.field1999);
    }

    @ObfuscatedName("ag.br(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method598(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 23) {
            Statics.field965.method1667(Statics.field1880, arg0, arg1);
        }
        if (arg2 == 28) {
            field279.method2364(91);
            field279.method2233(arg1);
            class155 var8 = class155.method2386(arg1);
            if (var8.field2640 != null && var8.field2640[0][0] == 5) {
                int var9 = var8.field2640[0][1];
                class157.field2672[var9] = 1 - class157.field2672[var9];
                method151(var9);
            }
        }
        if (arg2 == 10) {
            class31 var10 = field276[arg3];
            if (var10 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(42);
                field279.method2159(arg3);
                field279.method2149(class126.field1966[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class155 var11 = class155.method599(arg1, arg0);
            if (var11 != null) {
                method605();
                int var14 = method25(var11);
                int var15 = var14 >> 11 & 0x3F;
                method2690(arg1, arg0, var15, var11.field2648);
                field482 = 0;
                int var16 = method25(var11);
                int var17 = var16 >> 11 & 0x3F;
                String var18;
                if (var17 == 0) {
                    var18 = null;
                } else if (var11.field2608 == null || var11.field2608.trim().length() == 0) {
                    var18 = null;
                } else {
                    var18 = var11.field2608;
                }
                field398 = var18;
                if (field398 == null) {
                    field398 = "Null";
                }
                if (var11.field2541) {
                    field399 = var11.field2602 + Statics.method121(16777215);
                } else {
                    field399 = Statics.method121(65280) + var11.field2644 + Statics.method121(16777215);
                }
            }
            return;
        }
        if (arg2 == 1003) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            class31 var19 = field276[arg3];
            if (var19 != null) {
                class36 var20 = var19.field703;
                if (var20.field835 != null) {
                    var20 = var20.method649();
                }
                if (var20 != null) {
                    field279.method2364(235);
                    field279.method2157(var20.field809);
                }
            }
        }
        if (arg2 == 7) {
            class31 var21 = field276[arg3];
            if (var21 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(162);
                field279.method2168(Statics.field604);
                field279.method2149(class126.field1966[82] ? 1 : 0);
                field279.method2159(Statics.field1289);
                field279.method2157(Statics.field191);
                field279.method2157(arg3);
            }
        }
        if (arg2 == 19) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field370 = arg0;
            field472 = arg1;
            field279.method2364(43);
            field279.method2114(Statics.field1071 + arg1);
            field279.method2114(arg3);
            field279.method2158(Statics.field521 + arg0);
            field279.method2149(class126.field1966[82] ? 1 : 0);
        }
        if (arg2 == 21) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field370 = arg0;
            field472 = arg1;
            field279.method2364(118);
            field279.method2113(class126.field1966[82] ? 1 : 0);
            field279.method2158(arg3);
            field279.method2157(Statics.field1071 + arg1);
            field279.method2158(Statics.field521 + arg0);
        }
        if (arg2 == 37) {
            field279.method2364(94);
            field279.method2163(arg1);
            field279.method2114(arg0);
            field279.method2159(arg3);
            field349 = 0;
            Statics.field285 = class155.method2386(arg1);
            field350 = arg0;
        }
        if (arg2 == 38) {
            method605();
            class155 var22 = class155.method2386(arg1);
            field482 = 1;
            Statics.field1289 = arg0;
            Statics.field604 = arg1;
            Statics.field191 = arg3;
            method2391(var22);
            field394 = Statics.method121(16748608) + class46.method1975(arg3).field1031 + Statics.method121(16777215);
            if (field394 == null) {
                field394 = "null";
            }
            return;
        }
        if (arg2 == 16) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field370 = arg0;
            field472 = arg1;
            field279.method2364(244);
            field279.method2114(Statics.field1071 + arg1);
            field279.method2159(Statics.field521 + arg0);
            field279.method2114(Statics.field191);
            field279.method2114(arg3);
            field279.method2233(Statics.field604);
            field279.method2158(Statics.field1289);
            field279.method2239(class126.field1966[82] ? 1 : 0);
        }
        if (arg2 == 50) {
            class3 var23 = field358[arg3];
            if (var23 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(220);
                field279.method2149(class126.field1966[82] ? 1 : 0);
                field279.method2157(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var24 = field358[arg3];
            if (var24 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(141);
                field279.method2150(class126.field1966[82] ? 1 : 0);
                field279.method2159(arg3);
            }
        }
        if (arg2 == 1) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field370 = arg0;
            field472 = arg1;
            field279.method2364(104);
            field279.method2158(Statics.field1071 + arg1);
            field279.method2163(Statics.field604);
            field279.method2159(Statics.field191);
            field279.method2159(Statics.field521 + arg0);
            field279.method2157(Statics.field1289);
            field279.method2239(class126.field1966[82] ? 1 : 0);
            field279.method2159(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 13) {
            class31 var25 = field276[arg3];
            if (var25 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(198);
                field279.method2113(class126.field1966[82] ? 1 : 0);
                field279.method2157(arg3);
            }
        }
        if (arg2 == 35) {
            field279.method2364(79);
            field279.method2159(arg0);
            field279.method2114(arg3);
            field279.method2163(arg1);
            field349 = 0;
            Statics.field285 = class155.method2386(arg1);
            field350 = arg0;
        }
        if (arg2 == 24) {
            class155 var26 = class155.method2386(arg1);
            boolean var27 = true;
            if (var26.field2545 > 0) {
                var27 = method2358(var26);
            }
            if (var27) {
                field279.method2364(91);
                field279.method2233(arg1);
            }
        }
        if (arg2 == 12) {
            class31 var28 = field276[arg3];
            if (var28 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(186);
                field279.method2150(class126.field1966[82] ? 1 : 0);
                field279.method2114(arg3);
            }
        }
        if (arg2 == 20) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field370 = arg0;
            field472 = arg1;
            field279.method2364(33);
            field279.method2158(Statics.field521 + arg0);
            field279.method2157(Statics.field1071 + arg1);
            field279.method2159(arg3);
            field279.method2149(class126.field1966[82] ? 1 : 0);
        }
        if (arg2 == 46) {
            class3 var29 = field358[arg3];
            if (var29 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(100);
                field279.method2113(class126.field1966[82] ? 1 : 0);
                field279.method2159(arg3);
            }
        }
        if (arg2 == 15) {
            class3 var30 = field358[arg3];
            if (var30 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(50);
                field279.method2159(arg3);
                field279.method2233(Statics.field689);
                field279.method2239(class126.field1966[82] ? 1 : 0);
                field279.method2114(field413);
            }
        }
        if (arg2 == 44) {
            class3 var31 = field358[arg3];
            if (var31 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(44);
                field279.method2158(arg3);
                field279.method2149(class126.field1966[82] ? 1 : 0);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class155 var32 = class155.method599(arg1, arg0);
            if (var32 != null) {
                method611(arg3, arg1, arg0, var32.field2648, arg5);
            }
        }
        if (arg2 == 4) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field370 = arg0;
            field472 = arg1;
            field279.method2364(194);
            field279.method2157(arg3 >> 14 & 0x7FFF);
            field279.method2150(class126.field1966[82] ? 1 : 0);
            field279.method2114(Statics.field521 + arg0);
            field279.method2157(Statics.field1071 + arg1);
        }
        if (arg2 == 3) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field370 = arg0;
            field472 = arg1;
            field279.method2364(173);
            field279.method2159(Statics.field1071 + arg1);
            field279.method2114(Statics.field521 + arg0);
            field279.method2114(arg3 >> 14 & 0x7FFF);
            field279.method2149(class126.field1966[82] ? 1 : 0);
        }
        if (arg2 == 32) {
            field279.method2364(208);
            field279.method2159(field413);
            field279.method2159(arg3);
            field279.method2233(arg1);
            field279.method2157(arg0);
            field279.method2233(Statics.field689);
            field349 = 0;
            Statics.field285 = class155.method2386(arg1);
            field350 = arg0;
        }
        if (arg2 == 49) {
            class3 var33 = field358[arg3];
            if (var33 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(65);
                field279.method2149(class126.field1966[82] ? 1 : 0);
                field279.method2158(arg3);
            }
        }
        if (arg2 == 39) {
            field279.method2364(225);
            field279.method2158(arg0);
            field279.method2158(arg3);
            field279.method2168(arg1);
            field349 = 0;
            Statics.field285 = class155.method2386(arg1);
            field350 = arg0;
        }
        if (arg2 == 18) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field370 = arg0;
            field472 = arg1;
            field279.method2364(188);
            field279.method2159(arg3);
            field279.method2158(Statics.field1071 + arg1);
            field279.method2159(Statics.field521 + arg0);
            field279.method2149(class126.field1966[82] ? 1 : 0);
        }
        if (arg2 == 40) {
            field279.method2364(4);
            field279.method2233(arg1);
            field279.method2158(arg0);
            field279.method2114(arg3);
            field349 = 0;
            Statics.field285 = class155.method2386(arg1);
            field350 = arg0;
        }
        if (arg2 == 1002) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field279.method2364(180);
            field279.method2114(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 2) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field370 = arg0;
            field472 = arg1;
            field279.method2364(28);
            field279.method2150(class126.field1966[82] ? 1 : 0);
            field279.method2114(Statics.field521 + arg0);
            field279.method2159(Statics.field1071 + arg1);
            field279.method2159(arg3 >> 14 & 0x7FFF);
            field279.method2210(Statics.field689);
            field279.method2114(field413);
        }
        if (arg2 == 47) {
            class3 var34 = field358[arg3];
            if (var34 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(181);
                field279.method2150(class126.field1966[82] ? 1 : 0);
                field279.method2157(arg3);
            }
        }
        if (arg2 == 1004) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field279.method2364(0);
            field279.method2159(arg3);
        }
        if (arg2 == 5) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field370 = arg0;
            field472 = arg1;
            field279.method2364(201);
            field279.method2158(Statics.field1071 + arg1);
            field279.method2114(arg3 >> 14 & 0x7FFF);
            field279.method2114(Statics.field521 + arg0);
            field279.method2150(class126.field1966[82] ? 1 : 0);
        }
        if (arg2 == 43) {
            field279.method2364(243);
            field279.method2159(arg0);
            field279.method2114(arg3);
            field279.method2233(arg1);
            field349 = 0;
            Statics.field285 = class155.method2386(arg1);
            field350 = arg0;
        }
        if (arg2 == 14) {
            class3 var35 = field358[arg3];
            if (var35 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(30);
                field279.method2158(arg3);
                field279.method2158(Statics.field191);
                field279.method2158(Statics.field1289);
                field279.method2233(Statics.field604);
                field279.method2113(class126.field1966[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field279.method2364(218);
            field279.method2210(arg1);
            field279.method2159(arg3);
            field279.method2158(arg0);
            field349 = 0;
            Statics.field285 = class155.method2386(arg1);
            field350 = arg0;
        }
        if (arg2 == 26) {
            method923();
        }
        if (arg2 == 1001) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field370 = arg0;
            field472 = arg1;
            field279.method2364(63);
            field279.method2157(Statics.field1071 + arg1);
            field279.method2149(class126.field1966[82] ? 1 : 0);
            field279.method2158(arg3 >> 14 & 0x7FFF);
            field279.method2159(Statics.field521 + arg0);
        }
        if (arg2 == 30 && field424 == null) {
            field279.method2364(228);
            field279.method2157(arg0);
            field279.method2168(arg1);
            field424 = class155.method599(arg1, arg0);
            method2391(field424);
        }
        if (arg2 == 11) {
            class31 var36 = field276[arg3];
            if (var36 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(151);
                field279.method2157(arg3);
                field279.method2149(class126.field1966[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class31 var37 = field276[arg3];
            if (var37 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(32);
                field279.method2150(class126.field1966[82] ? 1 : 0);
                field279.method2114(arg3);
            }
        }
        if (arg2 == 17) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field370 = arg0;
            field472 = arg1;
            field279.method2364(237);
            field279.method2114(Statics.field521 + arg0);
            field279.method2158(Statics.field1071 + arg1);
            field279.method2157(field413);
            field279.method2158(arg3);
            field279.method2149(class126.field1966[82] ? 1 : 0);
            field279.method2210(Statics.field689);
        }
        if (arg2 == 8) {
            class31 var38 = field276[arg3];
            if (var38 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(133);
                field279.method2233(Statics.field689);
                field279.method2157(field413);
                field279.method2114(arg3);
                field279.method2239(class126.field1966[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field279.method2364(78);
            field279.method2233(arg1);
            field279.method2158(arg3);
            field279.method2114(arg0);
            field349 = 0;
            Statics.field285 = class155.method2386(arg1);
            field350 = arg0;
        }
        if (arg2 == 33) {
            field279.method2364(5);
            field279.method2158(arg0);
            field279.method2210(arg1);
            field279.method2158(arg3);
            field349 = 0;
            Statics.field285 = class155.method2386(arg1);
            field350 = arg0;
        }
        if (arg2 == 31) {
            field279.method2364(126);
            field279.method2158(arg0);
            field279.method2159(Statics.field1289);
            field279.method2159(Statics.field191);
            field279.method2163(Statics.field604);
            field279.method2157(arg3);
            field279.method2163(arg1);
            field349 = 0;
            Statics.field285 = class155.method2386(arg1);
            field350 = arg0;
        }
        if (arg2 == 42) {
            field279.method2364(81);
            field279.method2163(arg1);
            field279.method2158(arg3);
            field279.method2114(arg0);
            field349 = 0;
            Statics.field285 = class155.method2386(arg1);
            field350 = arg0;
        }
        if (arg2 == 58) {
            class155 var39 = class155.method599(arg1, arg0);
            if (var39 != null) {
                field279.method2364(157);
                field279.method2157(arg0);
                field279.method2168(arg1);
                field279.method2158(field397);
                field279.method2158(field413);
                field279.method2163(Statics.field689);
                field279.method2114(var39.field2648);
            }
        }
        if (arg2 == 6) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field370 = arg0;
            field472 = arg1;
            field279.method2364(67);
            field279.method2159(Statics.field1071 + arg1);
            field279.method2149(class126.field1966[82] ? 1 : 0);
            field279.method2158(arg3 >> 14 & 0x7FFF);
            field279.method2157(Statics.field521 + arg0);
        }
        if (arg2 == 29) {
            field279.method2364(91);
            field279.method2233(arg1);
            class155 var40 = class155.method2386(arg1);
            if (var40.field2640 != null && var40.field2640[0][0] == 5) {
                int var41 = var40.field2640[0][1];
                if (class157.field2672[var41] != var40.field2642[0]) {
                    class157.field2672[var41] = var40.field2642[0];
                    method151(var41);
                }
            }
        }
        if (arg2 == 48) {
            class3 var42 = field358[arg3];
            if (var42 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(111);
                field279.method2239(class126.field1966[82] ? 1 : 0);
                field279.method2158(arg3);
            }
        }
        if (arg2 == 22) {
            field352 = arg6;
            field345 = arg7;
            field455 = 2;
            field346 = 0;
            field370 = arg0;
            field472 = arg1;
            field279.method2364(54);
            field279.method2157(Statics.field1071 + arg1);
            field279.method2150(class126.field1966[82] ? 1 : 0);
            field279.method2159(arg3);
            field279.method2114(Statics.field521 + arg0);
        }
        if (arg2 == 41) {
            field279.method2364(156);
            field279.method2168(arg1);
            field279.method2158(arg0);
            field279.method2158(arg3);
            field349 = 0;
            Statics.field285 = class155.method2386(arg1);
            field350 = arg0;
        }
        if (arg2 == 1005) {
            class155 var43 = class155.method2386(arg1);
            if (var43 == null || var43.field2647[arg0] < 100000) {
                field279.method2364(0);
                field279.method2159(arg3);
            } else {
                class10.method2806(27, "", var43.field2647[arg0] + " x " + class46.method1975(arg3).field1031);
            }
            field349 = 0;
            Statics.field285 = class155.method2386(arg1);
            field350 = arg0;
        }
        if (arg2 == 51) {
            class3 var44 = field358[arg3];
            if (var44 != null) {
                field352 = arg6;
                field345 = arg7;
                field455 = 2;
                field346 = 0;
                field370 = arg0;
                field472 = arg1;
                field279.method2364(72);
                field279.method2114(arg3);
                field279.method2113(class126.field1966[82] ? 1 : 0);
            }
        }
        if (field482 != 0) {
            field482 = 0;
            method2391(class155.method2386(Statics.field604));
        }
        if (field412) {
            method605();
        }
        if (Statics.field285 != null && field349 == 0) {
            method2391(Statics.field285);
        }
    }

    @ObfuscatedName("ef.be(IIIIB)V")
    public static void method2690(int arg0, int arg1, int arg2, int arg3) {
        class155 var4 = class155.method599(arg0, arg1);
        if (var4 != null && var4.field2620 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field15 = var4.field2620;
            class33.method2543(var5, 200000);
        }
        field397 = arg3;
        field412 = true;
        Statics.field689 = arg0;
        field413 = arg1;
        Statics.field1502 = arg2;
        method2391(var4);
    }

    @ObfuscatedName("au.bo(I)V")
    public static void method605() {
        if (!field412) {
            return;
        }
        class155 var0 = class155.method599(Statics.field689, field413);
        if (var0 != null && var0.field2658 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field15 = var0.field2658;
            class33.method2543(var1, 200000);
        }
        field412 = false;
        method2391(var0);
    }

    @ObfuscatedName("ai.bv(IIIILjava/lang/String;I)V")
    public static void method611(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class155 var5 = class155.method599(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2629 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field6 = arg0;
            var6.field9 = arg4;
            var6.field15 = var5.field2629;
            class33.method2543(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field2545 > 0) {
            var7 = method2358(var5);
        }
        if (!var7 || !class159.method24(method25(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field279.method2364(169);
            field279.method2233(arg1);
            field279.method2114(arg2);
            field279.method2114(arg3);
        }
        if (arg0 == 2) {
            field279.method2364(75);
            field279.method2233(arg1);
            field279.method2114(arg2);
            field279.method2114(arg3);
        }
        if (arg0 == 3) {
            field279.method2364(254);
            field279.method2233(arg1);
            field279.method2114(arg2);
            field279.method2114(arg3);
        }
        if (arg0 == 4) {
            field279.method2364(213);
            field279.method2233(arg1);
            field279.method2114(arg2);
            field279.method2114(arg3);
        }
        if (arg0 == 5) {
            field279.method2364(210);
            field279.method2233(arg1);
            field279.method2114(arg2);
            field279.method2114(arg3);
        }
        if (arg0 == 6) {
            field279.method2364(227);
            field279.method2233(arg1);
            field279.method2114(arg2);
            field279.method2114(arg3);
        }
        if (arg0 == 7) {
            field279.method2364(108);
            field279.method2233(arg1);
            field279.method2114(arg2);
            field279.method2114(arg3);
        }
        if (arg0 == 8) {
            field279.method2364(161);
            field279.method2233(arg1);
            field279.method2114(arg2);
            field279.method2114(arg3);
        }
        if (arg0 == 9) {
            field279.method2364(217);
            field279.method2233(arg1);
            field279.method2114(arg2);
            field279.method2114(arg3);
        }
        if (arg0 == 10) {
            field279.method2364(124);
            field279.method2233(arg1);
            field279.method2114(arg2);
            field279.method2114(arg3);
        }
    }

    @ObfuscatedName("p.bu(I)V")
    public static final void method52() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field478 - 1; var1++) {
                if (field385[var1] < 1000 && field385[var1 + 1] > 1000) {
                    String var2 = field388[var1];
                    field388[var1] = field388[var1 + 1];
                    field388[var1 + 1] = var2;
                    String var3 = field387[var1];
                    field387[var1] = field387[var1 + 1];
                    field387[var1 + 1] = var3;
                    int var4 = field385[var1];
                    field385[var1] = field385[var1 + 1];
                    field385[var1 + 1] = var4;
                    int var5 = field383[var1];
                    field383[var1] = field383[var1 + 1];
                    field383[var1 + 1] = var5;
                    int var6 = field384[var1];
                    field384[var1] = field384[var1 + 1];
                    field384[var1 + 1] = var6;
                    int var7 = field312[var1];
                    field312[var1] = field312[var1 + 1];
                    field312[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ei.bq(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2701(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field381 || field478 >= 500) {
            return;
        }
        field387[field478] = arg0;
        field388[field478] = arg1;
        field385[field478] = arg2;
        field312[field478] = arg3;
        field383[field478] = arg4;
        field384[field478] = arg5;
        field478++;
    }

    @ObfuscatedName("o.bg(B)V")
    public static void method496() {
        for (int var0 = 0; var0 < field478; var0++) {
            if (method1973(field385[var0])) {
                if (var0 < field478 - 1) {
                    for (int var1 = var0; var1 < field478 - 1; var1++) {
                        field387[var1] = field387[var1 + 1];
                        field388[var1] = field388[var1 + 1];
                        field385[var1] = field385[var1 + 1];
                        field312[var1] = field312[var1 + 1];
                        field383[var1] = field383[var1 + 1];
                        field384[var1] = field384[var1 + 1];
                    }
                }
                field478--;
            }
        }
    }

    @ObfuscatedName("cu.bm(II)Z")
    public static boolean method1973(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("h.bi(IIIIB)V")
    public static final void method30(int arg0, int arg1, int arg2, int arg3) {
        if (field482 == 0 && !field412) {
            method2701(class145.field2315, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class99.field1756; var6++) {
            int var7 = class99.field1757[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field965.method1755(Statics.field1880, var8, var9, var7) >= 0) {
                    class37 var12 = class37.method96(var11);
                    if (var12.field891 != null) {
                        var12 = var12.method675();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field482 == 1) {
                        method2701(class145.field2310, field394 + " " + class2.field21 + " " + Statics.method121(65535) + var12.field900, 1, var7, var8, var9);
                    } else if (!field412) {
                        String[] var13 = var12.field877;
                        if (field429) {
                            var13 = method2384(var13);
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
                                    method2701(var13[var14], Statics.method121(65535) + var12.field900, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2701(class145.field2207, Statics.method121(65535) + var12.field900, 1002, var12.field857 << 14, var8, var9);
                    } else if ((Statics.field1502 & 0x4) == 4) {
                        method2701(field398, field399 + " " + class2.field21 + " " + Statics.method121(65535) + var12.field900, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class31 var16 = field276[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field703.field844 == 1 && (var16.field747 & 0x7F) == 64 && (var16.field749 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field277; var17++) {
                            class31 var18 = field276[field298[var17]];
                            if (var18 != null && var16 != var18 && var18.field703.field844 == 1 && var16.field747 == var18.field747 && var16.field749 == var18.field749) {
                                method2380(var18.field703, field298[var17], var8, var9);
                            }
                        }
                        for (int var19 = 0; var19 < field359; var19++) {
                            class3 var20 = field358[field360[var19]];
                            if (var20 != null && var16.field747 == var20.field747 && var16.field749 == var20.field749) {
                                method630(var20, field360[var19], var8, var9);
                            }
                        }
                    }
                    method2380(var16.field703, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var21 = field358[var11];
                    if (var21 == null) {
                        continue;
                    }
                    if ((var21.field747 & 0x7F) == 64 && (var21.field749 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < field277; var22++) {
                            class31 var23 = field276[field298[var22]];
                            if (var23 != null && var23.field703.field844 == 1 && var21.field747 == var23.field747 && var21.field749 == var23.field749) {
                                method2380(var23.field703, field298[var22], var8, var9);
                            }
                        }
                        for (int var24 = 0; var24 < field359; var24++) {
                            class3 var25 = field358[field360[var24]];
                            if (var25 != null && var21 != var25 && var21.field747 == var25.field747 && var21.field749 == var25.field749) {
                                method630(var25, field360[var24], var8, var9);
                            }
                        }
                    }
                    if (field300 == var11) {
                        var4 = var7;
                    } else {
                        method630(var21, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class180 var26 = field373[Statics.field1880][var8][var9];
                    if (var26 != null) {
                        for (class26 var27 = (class26) var26.method3253(); var27 != null; var27 = (class26) var26.method3255()) {
                            class46 var28 = class46.method1975(var27.field623);
                            if (field482 == 1) {
                                method2701(class145.field2310, field394 + " " + class2.field21 + " " + Statics.method121(16748608) + var28.field1031, 16, var27.field623, var8, var9);
                            } else if (!field412) {
                                String[] var29 = var28.field1045;
                                if (field429) {
                                    var29 = method2384(var29);
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
                                        method2701(var29[var30], Statics.method121(16748608) + var28.field1031, var31, var27.field623, var8, var9);
                                    } else if (var30 == 2) {
                                        method2701(class145.field2161, Statics.method121(16748608) + var28.field1031, 20, var27.field623, var8, var9);
                                    }
                                }
                                method2701(class145.field2207, Statics.method121(16748608) + var28.field1031, 1004, var27.field623, var8, var9);
                            } else if ((Statics.field1502 & 0x1) == 1) {
                                method2701(field398, field399 + " " + class2.field21 + " " + Statics.method121(16748608) + var28.field1031, 17, var27.field623, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var32 = var4 & 0x7F;
            int var33 = var4 >> 7 & 0x7F;
            class3 var34 = field358[field300];
            method630(var34, field300, var32, var33);
        }
    }

    @ObfuscatedName("dk.bc(Las;IIII)V")
    public static final void method2380(class36 arg0, int arg1, int arg2, int arg3) {
        if (field478 >= 400) {
            return;
        }
        if (arg0.field835 != null) {
            arg0 = arg0.method649();
        }
        if (arg0 == null || !arg0.field805 || arg0.field807 && field437 != arg1) {
            return;
        }
        String var4 = arg0.field810;
        if (arg0.field826 != 0) {
            var4 = var4 + method500(arg0.field826, Statics.field163.field32) + " " + class2.field19 + class145.field2284 + arg0.field826 + class2.field17;
        }
        if (field482 == 1) {
            method2701(class145.field2310, field394 + " " + class2.field21 + " " + Statics.method121(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field412) {
            String[] var5 = arg0.field825;
            if (field429) {
                var5 = method2384(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class145.field2312)) {
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
                        method2701(var5[var6], Statics.method121(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class145.field2312)) {
                        short var9 = 0;
                        if (field265 == class18.field507 || field265 == class18.field514 && arg0.field826 > Statics.field163.field32) {
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
                        method2701(var5[var8], Statics.method121(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method2701(class145.field2207, Statics.method121(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1502 & 0x2) == 2) {
            method2701(field398, field399 + " " + class2.field21 + " " + Statics.method121(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ab.cj(Lm;IIII)V")
    public static final void method630(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field163 == arg0 || field478 >= 400) {
            return;
        }
        String var4;
        if (arg0.field34 == 0) {
            var4 = arg0.field39 + method500(arg0.field32, Statics.field163.field32) + " " + class2.field19 + class145.field2284 + arg0.field32 + class2.field17;
        } else {
            var4 = arg0.field39 + " " + class2.field19 + class145.field2317 + arg0.field34 + class2.field17;
        }
        if (field482 == 1) {
            method2701(class145.field2310, field394 + " " + class2.field21 + " " + Statics.method121(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field412) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field497[var5] != null) {
                    short var6 = 0;
                    if (field497[var5].equalsIgnoreCase(class145.field2312)) {
                        if (field265 == class18.field507 || field265 == class18.field514 && arg0.field32 > Statics.field163.field32) {
                            var6 = 2000;
                        }
                        if (Statics.field163.field46 != 0 && arg0.field46 != 0) {
                            if (Statics.field163.field46 == arg0.field46) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field249[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field288[var5] + var6;
                    method2701(field497[var5], Statics.method121(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1502 & 0x8) == 8) {
            method2701(field398, field399 + " " + class2.field21 + " " + Statics.method121(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field478; var9++) {
            if (field385[var9] == 23) {
                field388[var9] = Statics.method121(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("z.cq(III)Ljava/lang/String;")
    public static final String method500(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return Statics.method121(16711680);
        } else if (var2 < -6) {
            return Statics.method121(16723968);
        } else if (var2 < -3) {
            return Statics.method121(16740352);
        } else if (var2 < 0) {
            return Statics.method121(16756736);
        } else if (var2 > 9) {
            return Statics.method121(65280);
        } else if (var2 > 6) {
            return Statics.method121(4259584);
        } else if (var2 > 3) {
            return Statics.method121(8453888);
        } else if (var2 > 0) {
            return Statics.method121(12648192);
        } else {
            return Statics.method121(16776960);
        }
    }

    @ObfuscatedName("u.cn(IIIIIIIII)V")
    public static final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class155.method512(arg0)) {
            Statics.field2118 = null;
            method3400(Statics.field2533[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2118 != null) {
                method3400(Statics.field2118, -1412584499, arg1, arg2, arg3, arg4, Statics.field1897, Statics.field1524, arg7);
                Statics.field2118 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field248[var8] = true;
            }
        } else {
            field248[arg7] = true;
        }
    }

    @ObfuscatedName("gq.cm([Let;IIIIIIIIB)V")
    public static final void method3400(class155[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class74.method1538(arg2, arg3, arg4, arg5);
        class85.method1796();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class155 var10 = arg0[var9];
            if (var10 != null && (var10.field2531 == arg1 || arg1 == -1412584499 && field305 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field466[field444] = var10.field2638 + arg6;
                    field450[field444] = var10.field2547 + arg7;
                    field451[field444] = var10.field2550;
                    field452[field444] = var10.field2551;
                    var11 = ++field444 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2659 = var11;
                var10.field2660 = field348;
                if (!var10.field2541 || !method117(var10)) {
                    if (var10.field2545 > 0) {
                        method77(var10);
                    }
                    int var12 = var10.field2638 + arg6;
                    int var13 = var10.field2547 + arg7;
                    int var14 = var10.field2563;
                    if (field305 == var10) {
                        if (arg1 != -1412584499 && !var10.field2596) {
                            Statics.field2118 = arg0;
                            Statics.field1897 = arg6;
                            Statics.field1524 = arg7;
                            continue;
                        }
                        if (field423 && field417) {
                            int var15 = class129.field2001;
                            int var16 = class129.field2002;
                            int var17 = var15 - field414;
                            int var18 = var16 - field415;
                            if (var17 < field287) {
                                var17 = field287;
                            }
                            if (var10.field2550 + var17 > field287 + field433.field2550) {
                                var17 = field287 + field433.field2550 - var10.field2550;
                            }
                            if (var18 < field366) {
                                var18 = field366;
                            }
                            if (var10.field2551 + var18 > field366 + field433.field2551) {
                                var18 = field366 + field433.field2551 - var10.field2551;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2596) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2559 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2559 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2550 + var12;
                        int var26 = var10.field2551 + var13;
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
                        int var29 = var10.field2550 + var12;
                        int var30 = var10.field2551 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2541 || var19 < var21 && var20 < var22) {
                        if (var10.field2545 != 0) {
                            if (var10.field2545 == 1337) {
                                field389 = var12;
                                field390 = var13;
                                int var31 = var10.field2550;
                                int var32 = var10.field2551;
                                class74.method1538(var12, var13, var12 + var31, var13 + var32);
                                class85.method1796();
                                field341++;
                                method2064(class30.field692);
                                boolean var33 = false;
                                if (field300 >= 0) {
                                    for (int var34 = 0; var34 < field359; var34++) {
                                        if (field300 == field360[var34]) {
                                            var33 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var33) {
                                    method2064(class30.field696);
                                }
                                method115(true);
                                method2064(var33 ? class30.field694 : class30.field693);
                                method115(false);
                                method634();
                                method554();
                                if (!field486) {
                                    int var35 = field271;
                                    if (field500 / 256 > var35) {
                                        var35 = field500 / 256;
                                    }
                                    if (field487[4] && field489[4] + 128 > var35) {
                                        var35 = field489[4] + 128;
                                    }
                                    int var36 = field410 + field404 & 0x7FF;
                                    int var37 = Statics.field2981;
                                    int var38 = method1974(Statics.field163.field747, Statics.field163.field749, Statics.field1880) - 50;
                                    int var39 = Statics.field1844;
                                    int var40 = var35 * 3 + 600;
                                    int var41 = 2048 - var35 & 0x7FF;
                                    int var42 = 2048 - var36 & 0x7FF;
                                    int var43 = 0;
                                    int var44 = 0;
                                    int var45 = var40;
                                    if (var41 != 0) {
                                        int var46 = class85.field1482[var41];
                                        int var47 = class85.field1474[var41];
                                        int var48 = var44 * var47 - var40 * var46 >> 16;
                                        var45 = var44 * var46 + var40 * var47 >> 16;
                                        var44 = var48;
                                    }
                                    if (var42 != 0) {
                                        int var49 = class85.field1482[var42];
                                        int var50 = class85.field1474[var42];
                                        int var51 = var43 * var50 + var45 * var49 >> 16;
                                        var45 = var45 * var50 - var43 * var49 >> 16;
                                        var43 = var51;
                                    }
                                    Statics.field2064 = var37 - var43;
                                    Statics.field901 = var38 - var44;
                                    Statics.field1662 = var39 - var45;
                                    Statics.field132 = var35;
                                    Statics.field2565 = var36;
                                }
                                int var64;
                                if (field486) {
                                    int var65;
                                    if (Statics.field140.field128) {
                                        var65 = Statics.field1880;
                                    } else {
                                        int var66 = method1974(Statics.field2064, Statics.field1662, Statics.field1880);
                                        if (var66 - Statics.field901 >= 800 || (class6.field71[Statics.field1880][Statics.field2064 >> 7][Statics.field1662 >> 7] & 0x4) == 0) {
                                            var65 = 3;
                                        } else {
                                            var65 = Statics.field1880;
                                        }
                                    }
                                    var64 = var65;
                                } else {
                                    int var52;
                                    if (Statics.field140.field128) {
                                        var52 = Statics.field1880;
                                    } else {
                                        int var53 = 3;
                                        if (Statics.field132 < 310) {
                                            int var54 = Statics.field2064 >> 7;
                                            int var55 = Statics.field1662 >> 7;
                                            int var56 = Statics.field163.field747 >> 7;
                                            int var57 = Statics.field163.field749 >> 7;
                                            if ((class6.field71[Statics.field1880][var54][var55] & 0x4) != 0) {
                                                var53 = Statics.field1880;
                                            }
                                            int var58;
                                            if (var56 > var54) {
                                                var58 = var56 - var54;
                                            } else {
                                                var58 = var54 - var56;
                                            }
                                            int var59;
                                            if (var57 > var55) {
                                                var59 = var57 - var55;
                                            } else {
                                                var59 = var55 - var57;
                                            }
                                            if (var58 > var59) {
                                                int var60 = var59 * 65536 / var58;
                                                int var61 = 32768;
                                                while (var54 != var56) {
                                                    if (var54 < var56) {
                                                        var54++;
                                                    } else if (var54 > var56) {
                                                        var54--;
                                                    }
                                                    if ((class6.field71[Statics.field1880][var54][var55] & 0x4) != 0) {
                                                        var53 = Statics.field1880;
                                                    }
                                                    var61 += var60;
                                                    if (var61 >= 65536) {
                                                        var61 -= 65536;
                                                        if (var55 < var57) {
                                                            var55++;
                                                        } else if (var55 > var57) {
                                                            var55--;
                                                        }
                                                        if ((class6.field71[Statics.field1880][var54][var55] & 0x4) != 0) {
                                                            var53 = Statics.field1880;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var62 = var58 * 65536 / var59;
                                                int var63 = 32768;
                                                while (var55 != var57) {
                                                    if (var55 < var57) {
                                                        var55++;
                                                    } else if (var55 > var57) {
                                                        var55--;
                                                    }
                                                    if ((class6.field71[Statics.field1880][var54][var55] & 0x4) != 0) {
                                                        var53 = Statics.field1880;
                                                    }
                                                    var63 += var62;
                                                    if (var63 >= 65536) {
                                                        var63 -= 65536;
                                                        if (var54 < var56) {
                                                            var54++;
                                                        } else if (var54 > var56) {
                                                            var54--;
                                                        }
                                                        if ((class6.field71[Statics.field1880][var54][var55] & 0x4) != 0) {
                                                            var53 = Statics.field1880;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class6.field71[Statics.field1880][Statics.field163.field747 >> 7][Statics.field163.field749 >> 7] & 0x4) != 0) {
                                            var53 = Statics.field1880;
                                        }
                                        var52 = var53;
                                    }
                                    var64 = var52;
                                }
                                int var67 = Statics.field2064;
                                int var68 = Statics.field901;
                                int var69 = Statics.field1662;
                                int var70 = Statics.field132;
                                int var71 = Statics.field2565;
                                for (int var72 = 0; var72 < 5; var72++) {
                                    if (field487[var72]) {
                                        int var73 = (int) (Math.random() * (double) (field488[var72] * 2 + 1) - (double) field488[var72] + Math.sin((double) field490[var72] / 100.0D * (double) field491[var72]) * (double) field489[var72]);
                                        if (var72 == 0) {
                                            Statics.field2064 += var73;
                                        }
                                        if (var72 == 1) {
                                            Statics.field901 += var73;
                                        }
                                        if (var72 == 2) {
                                            Statics.field1662 += var73;
                                        }
                                        if (var72 == 3) {
                                            Statics.field2565 = Statics.field2565 + var73 & 0x7FF;
                                        }
                                        if (var72 == 4) {
                                            Statics.field132 += var73;
                                            if (Statics.field132 < 128) {
                                                Statics.field132 = 128;
                                            }
                                            if (Statics.field132 > 383) {
                                                Statics.field132 = 383;
                                            }
                                        }
                                    }
                                }
                                int var74 = class129.field2001;
                                int var75 = class129.field2002;
                                if (class129.field2007 != 0) {
                                    var74 = class129.field2008;
                                    var75 = class129.field1999;
                                }
                                if (var74 >= var12 && var74 < var12 + var31 && var75 >= var13 && var75 < var13 + var32) {
                                    class99.field1729 = true;
                                    class99.field1756 = 0;
                                    class99.field1754 = var74 - var12;
                                    class99.field1755 = var75 - var13;
                                } else {
                                    class99.field1729 = false;
                                    class99.field1756 = 0;
                                }
                                method518();
                                class74.method1544(var12, var13, var31, var32, 0);
                                method518();
                                Statics.field965.method1731(Statics.field2064, Statics.field901, Statics.field1662, Statics.field132, Statics.field2565, var64);
                                method518();
                                Statics.field965.method1637();
                                method83(var12, var13, var31, var32);
                                if (field405 == 2) {
                                    method3169((field259 - Statics.field521 << 7) + field393, (field260 - Statics.field1071 << 7) + field263, field261 * 2);
                                    if (field329 > -1 && field348 % 20 < 10) {
                                        Statics.field2027[0].method1467(field329 + var12 - 12, field343 + var13 - 28);
                                    }
                                }
                                ((class89) Statics.field1484).method1871(field313);
                                method1055(var12, var13, var31, var32);
                                Statics.field2064 = var67;
                                Statics.field901 = var68;
                                Statics.field1662 = var69;
                                Statics.field132 = var70;
                                Statics.field2565 = var71;
                                if (field247) {
                                    byte var76 = 0;
                                    int var77 = class153.field2507 + class153.field2505 + var76;
                                    if (var77 == 0) {
                                        field247 = false;
                                    }
                                }
                                if (field247) {
                                    class74.method1544(var12, var13, var31, var32, 0);
                                    method2444(class145.field2169, false);
                                }
                                class74.method1538(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2545 == 1338) {
                                method518();
                                class74.method1538(var12, var13, Statics.field1660.field1323 + var12, Statics.field1660.field1324 + var13);
                                if (field237 == 2 || field237 == 5) {
                                    class74.method1548(var12 + 25, var13 + 5, 0, Statics.field800, Statics.field1673);
                                } else {
                                    int var79 = field404 + field321 & 0x7FF;
                                    int var80 = Statics.field163.field747 / 32 + 48;
                                    int var81 = 464 - Statics.field163.field749 / 32;
                                    Statics.field635.method1473(var12 + 25, var13 + 5, 146, 151, var80, var81, var79, field310 + 256, Statics.field800, Statics.field1673);
                                    for (int var82 = 0; var82 < field257; var82++) {
                                        int var83 = field334[var82] * 4 + 2 - Statics.field163.field747 / 32;
                                        int var84 = field469[var82] * 4 + 2 - Statics.field163.field749 / 32;
                                        method143(var12, var13, var83, var84, field470[var82]);
                                    }
                                    for (int var85 = 0; var85 < 104; var85++) {
                                        for (int var86 = 0; var86 < 104; var86++) {
                                            class180 var87 = field373[Statics.field1880][var85][var86];
                                            if (var87 != null) {
                                                int var88 = var85 * 4 + 2 - Statics.field163.field747 / 32;
                                                int var89 = var86 * 4 + 2 - Statics.field163.field749 / 32;
                                                method143(var12, var13, var88, var89, Statics.field51[0]);
                                            }
                                        }
                                    }
                                    for (int var90 = 0; var90 < field277; var90++) {
                                        class31 var91 = field276[field298[var90]];
                                        if (var91 != null && var91.method9()) {
                                            class36 var92 = var91.field703;
                                            if (var92 != null && var92.field835 != null) {
                                                var92 = var92.method649();
                                            }
                                            if (var92 != null && var92.field815 && var92.field805) {
                                                int var93 = var91.field747 / 32 - Statics.field163.field747 / 32;
                                                int var94 = var91.field749 / 32 - Statics.field163.field749 / 32;
                                                method143(var12, var13, var93, var94, Statics.field51[1]);
                                            }
                                        }
                                    }
                                    for (int var95 = 0; var95 < field359; var95++) {
                                        class3 var96 = field358[field360[var95]];
                                        if (var96 != null && var96.method9() && !var96.field47) {
                                            int var97 = var96.field747 / 32 - Statics.field163.field747 / 32;
                                            int var98 = var96.field749 / 32 - Statics.field163.field749 / 32;
                                            boolean var99 = false;
                                            if (method26(var96.field39, true)) {
                                                var99 = true;
                                            }
                                            boolean var100 = false;
                                            for (int var101 = 0; var101 < Statics.field1076; var101++) {
                                                if (var96.field39.equals(Statics.field57[var101].field565)) {
                                                    var100 = true;
                                                    break;
                                                }
                                            }
                                            boolean var102 = false;
                                            if (Statics.field163.field46 != 0 && var96.field46 != 0 && Statics.field163.field46 == var96.field46) {
                                                var102 = true;
                                            }
                                            if (var99) {
                                                method143(var12, var13, var97, var98, Statics.field51[3]);
                                            } else if (var102) {
                                                method143(var12, var13, var97, var98, Statics.field51[4]);
                                            } else if (var100) {
                                                method143(var12, var13, var97, var98, Statics.field51[5]);
                                            } else {
                                                method143(var12, var13, var97, var98, Statics.field51[2]);
                                            }
                                        }
                                    }
                                    if (field405 != 0 && field348 % 20 < 10) {
                                        if (field405 == 1 && field458 >= 0 && field458 < field276.length) {
                                            class31 var103 = field276[field458];
                                            if (var103 != null) {
                                                int var104 = var103.field747 / 32 - Statics.field163.field747 / 32;
                                                int var105 = var103.field749 / 32 - Statics.field163.field749 / 32;
                                                Statics.method547(var12, var13, var104, var105, Statics.field131[1]);
                                            }
                                        }
                                        if (field405 == 2) {
                                            int var106 = field259 * 4 - Statics.field521 * 4 + 2 - Statics.field163.field747 / 32;
                                            int var107 = field260 * 4 - Statics.field1071 * 4 + 2 - Statics.field163.field749 / 32;
                                            Statics.method547(var12, var13, var106, var107, Statics.field131[1]);
                                        }
                                        if (field405 == 10 && field258 >= 0 && field258 < field358.length) {
                                            class3 var108 = field358[field258];
                                            if (var108 != null) {
                                                int var109 = var108.field747 / 32 - Statics.field163.field747 / 32;
                                                int var110 = var108.field749 / 32 - Statics.field163.field749 / 32;
                                                Statics.method547(var12, var13, var109, var110, Statics.field131[1]);
                                            }
                                        }
                                    }
                                    if (field370 != 0) {
                                        int var111 = field370 * 4 + 2 - Statics.field163.field747 / 32;
                                        int var112 = field472 * 4 + 2 - Statics.field163.field749 / 32;
                                        method143(var12, var13, var111, var112, Statics.field131[0]);
                                    }
                                    if (!Statics.field163.field47) {
                                        class74.method1544(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                    }
                                }
                                if (field237 < 3) {
                                    Statics.field339.method1473(var12, var13, 33, 33, 25, 25, field404, 256, Statics.field1811, Statics.field145);
                                } else {
                                    class74.method1548(var12, var13, 0, Statics.field1811, Statics.field145);
                                }
                                if (field448[var11]) {
                                    Statics.field1660.method1598(var12, var13);
                                }
                                field447[var11] = true;
                                class74.method1538(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2559 == 0) {
                            if (!var10.field2541 && method117(var10) && Statics.field1458 != var10) {
                                continue;
                            }
                            if (!var10.field2541) {
                                if (var10.field2555 > var10.field2557 - var10.field2551) {
                                    var10.field2555 = var10.field2557 - var10.field2551;
                                }
                                if (var10.field2555 < 0) {
                                    var10.field2555 = 0;
                                }
                            }
                            method3400(arg0, var10.field2662, var19, var20, var21, var22, var12 - var10.field2554, var13 - var10.field2555, var11);
                            if (var10.field2652 != null) {
                                method3400(var10.field2652, var10.field2662, var19, var20, var21, var22, var12 - var10.field2554, var13 - var10.field2555, var11);
                            }
                            class4 var113 = (class4) field396.method3214((long) var10.field2662);
                            if (var113 != null) {
                                method98(var113.field50, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class74.method1538(arg2, arg3, arg4, arg5);
                            class85.method1796();
                        }
                        if (field448[var11] || field316 > 1) {
                            if (var10.field2559 == 0 && !var10.field2541 && var10.field2557 > var10.field2551) {
                                method116(var10.field2550 + var12, var13, var10.field2555, var10.field2551, var10.field2557);
                            }
                            if (var10.field2559 != 1) {
                                if (var10.field2559 == 2) {
                                    int var114 = 0;
                                    for (int var115 = 0; var115 < var10.field2551; var115++) {
                                        for (int var116 = 0; var116 < var10.field2550; var116++) {
                                            int var117 = (var10.field2598 + 32) * var116 + var12;
                                            int var118 = (var10.field2534 + 32) * var115 + var13;
                                            if (var114 < 20) {
                                                var117 += var10.field2535[var114];
                                                var118 += var10.field2619[var114];
                                            }
                                            if (var10.field2615[var114] > 0) {
                                                boolean var119 = false;
                                                boolean var120 = false;
                                                int var121 = var10.field2615[var114] - 1;
                                                if (var117 + 32 > arg2 && var117 < arg4 && var118 + 32 > arg3 && var118 < arg5 || Statics.field792 == var10 && field351 == var114) {
                                                    class73 var122;
                                                    if (field482 == 1 && Statics.field1289 == var114 && Statics.field604 == var10.field2662) {
                                                        var122 = class46.method534(var121, var10.field2647[var114], 2, 0, 2, false);
                                                    } else {
                                                        var122 = class46.method534(var121, var10.field2647[var114], 1, 3153952, 2, false);
                                                    }
                                                    if (var122 == null) {
                                                        method2391(var10);
                                                    } else if (Statics.field792 == var10 && field351 == var114) {
                                                        int var123 = class129.field2001 - field297;
                                                        int var124 = class129.field2002 - field353;
                                                        if (var123 < 5 && var123 > -5) {
                                                            var123 = 0;
                                                        }
                                                        if (var124 < 5 && var124 > -5) {
                                                            var124 = 0;
                                                        }
                                                        if (field356 < 5) {
                                                            var123 = 0;
                                                            var124 = 0;
                                                        }
                                                        var122.method1469(var117 + var123, var118 + var124, 128);
                                                        if (arg1 != -1) {
                                                            class155 var125 = arg0[arg1 & 0xFFFF];
                                                            if (var118 + var124 < class74.field1317 && var125.field2555 > 0) {
                                                                int var126 = field313 * (class74.field1317 - var118 - var124) / 3;
                                                                if (var126 > field313 * 10) {
                                                                    var126 = field313 * 10;
                                                                }
                                                                if (var126 > var125.field2555) {
                                                                    var126 = var125.field2555;
                                                                }
                                                                var125.field2555 -= var126;
                                                                field353 += var126;
                                                                method2391(var125);
                                                            }
                                                            if (var118 + var124 + 32 > class74.field1316 && var125.field2555 < var125.field2557 - var125.field2551) {
                                                                int var127 = field313 * (var118 + var124 + 32 - class74.field1316) / 3;
                                                                if (var127 > field313 * 10) {
                                                                    var127 = field313 * 10;
                                                                }
                                                                if (var127 > var125.field2557 - var125.field2551 - var125.field2555) {
                                                                    var127 = var125.field2557 - var125.field2551 - var125.field2555;
                                                                }
                                                                var125.field2555 += var127;
                                                                field353 -= var127;
                                                                method2391(var125);
                                                            }
                                                        }
                                                    } else if (Statics.field285 == var10 && field350 == var114) {
                                                        var122.method1469(var117, var118, 128);
                                                    } else {
                                                        var122.method1467(var117, var118);
                                                    }
                                                }
                                            } else if (var10.field2599 != null && var114 < 20) {
                                                class73 var128 = var10.method2863(var114);
                                                if (var128 != null) {
                                                    var128.method1467(var117, var118);
                                                } else if (class155.field2587) {
                                                    method2391(var10);
                                                }
                                            }
                                            var114++;
                                        }
                                    }
                                } else if (var10.field2559 == 3) {
                                    int var129;
                                    if (method2713(var10)) {
                                        var129 = var10.field2639;
                                        if (Statics.field1458 == var10 && var10.field2561 != 0) {
                                            var129 = var10.field2561;
                                        }
                                    } else {
                                        var129 = var10.field2558;
                                        if (Statics.field1458 == var10 && var10.field2560 != 0) {
                                            var129 = var10.field2560;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2562) {
                                            class74.method1544(var12, var13, var10.field2550, var10.field2551, var129);
                                        } else {
                                            class74.method1546(var12, var13, var10.field2550, var10.field2551, var129);
                                        }
                                    } else if (var10.field2562) {
                                        class74.method1593(var12, var13, var10.field2550, var10.field2551, var129, 256 - (var14 & 0xFF));
                                    } else {
                                        class74.method1541(var12, var13, var10.field2550, var10.field2551, var129, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2559 == 4) {
                                    class205 var130 = var10.method2893();
                                    if (var130 != null) {
                                        String var131 = var10.field2589;
                                        int var132;
                                        if (method2713(var10)) {
                                            var132 = var10.field2639;
                                            if (Statics.field1458 == var10 && var10.field2561 != 0) {
                                                var132 = var10.field2561;
                                            }
                                            if (var10.field2590.length() > 0) {
                                                var131 = var10.field2590;
                                            }
                                        } else {
                                            var132 = var10.field2558;
                                            if (Statics.field1458 == var10 && var10.field2560 != 0) {
                                                var132 = var10.field2560;
                                            }
                                        }
                                        if (var10.field2541 && var10.field2648 != -1) {
                                            class46 var133 = class46.method1975(var10.field2648);
                                            var131 = var133.field1031;
                                            if (var131 == null) {
                                                var131 = "null";
                                            }
                                            if ((var133.field1042 == 1 || var10.field2649 != 1) && var10.field2649 != -1) {
                                                String var134 = Statics.method121(16748608) + var131 + class2.field23 + " " + 'x';
                                                int var135 = var10.field2649;
                                                String var136 = Integer.toString(var135);
                                                for (int var137 = var136.length() - 3; var137 > 0; var137 -= 3) {
                                                    var136 = var136.substring(0, var137) + class2.field25 + var136.substring(var137);
                                                }
                                                String var138;
                                                StringBuilder var10000;
                                                class145 var10001;
                                                if (var136.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(Statics.method121(65408)).append(var136.substring(0, var136.length() - 8));
                                                    var10001 = (class145) null;
                                                    var138 = var10000.append(class145.field2321).append(" ").append(class2.field19).append(var136).append(class2.field17).append(class2.field23).toString();
                                                } else if (var136.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(Statics.method121(16777215)).append(var136.substring(0, var136.length() - 4));
                                                    var10001 = (class145) null;
                                                    var138 = var10000.append(class145.field2323).append(" ").append(class2.field19).append(var136).append(class2.field17).append(class2.field23).toString();
                                                } else {
                                                    var138 = " " + Statics.method121(16776960) + var136 + class2.field23;
                                                }
                                                var131 = var134 + var138;
                                            }
                                        }
                                        if (field424 == var10) {
                                            class145 var202 = (class145) null;
                                            var131 = class145.field2318;
                                            var132 = var10.field2558;
                                        }
                                        if (!var10.field2541) {
                                            var131 = method20(var131, var10);
                                        }
                                        var130.method3525(var131, var12, var13, var10.field2550, var10.field2551, var132, var10.field2635 ? 0 : -1, var10.field2592, var10.field2552, var10.field2611);
                                    } else if (class155.field2587) {
                                        method2391(var10);
                                    }
                                } else if (var10.field2559 == 5) {
                                    if (var10.field2541) {
                                        class73 var140;
                                        if (var10.field2648 == -1) {
                                            var140 = var10.method2892(false);
                                        } else {
                                            var140 = class46.method534(var10.field2648, var10.field2649, var10.field2569, var10.field2570, var10.field2532, false);
                                        }
                                        if (var140 != null) {
                                            int var141 = var140.field1308;
                                            int var142 = var140.field1312;
                                            if (var10.field2574) {
                                                class74.method1539(var12, var13, var10.field2550 + var12, var10.field2551 + var13);
                                                int var143 = (var10.field2550 + (var141 - 1)) / var141;
                                                int var144 = (var10.field2551 + (var142 - 1)) / var142;
                                                for (int var145 = 0; var145 < var143; var145++) {
                                                    for (int var146 = 0; var146 < var144; var146++) {
                                                        if (var10.field2567 != 0) {
                                                            var140.method1500(var141 / 2 + var141 * var145 + var12, var142 / 2 + var142 * var146 + var13, var10.field2567, 4096);
                                                        } else if (var14 == 0) {
                                                            var140.method1467(var141 * var145 + var12, var142 * var146 + var13);
                                                        } else {
                                                            var140.method1469(var141 * var145 + var12, var142 * var146 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class74.method1538(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var147 = var10.field2550 * 4096 / var141;
                                                if (var10.field2567 != 0) {
                                                    var140.method1500(var10.field2550 / 2 + var12, var10.field2551 / 2 + var13, var10.field2567, var147);
                                                } else if (var14 != 0) {
                                                    var140.method1471(var12, var13, var10.field2550, var10.field2551, 256 - (var14 & 0xFF));
                                                } else if (var10.field2550 == var141 && var10.field2551 == var142) {
                                                    var140.method1467(var12, var13);
                                                } else {
                                                    var140.method1465(var12, var13, var10.field2550, var10.field2551);
                                                }
                                            }
                                        } else if (class155.field2587) {
                                            method2391(var10);
                                        }
                                    } else {
                                        class73 var139 = var10.method2892(method2713(var10));
                                        if (var139 != null) {
                                            var139.method1467(var12, var13);
                                        } else if (class155.field2587) {
                                            method2391(var10);
                                        }
                                    }
                                } else if (var10.field2559 == 6) {
                                    boolean var148 = method2713(var10);
                                    int var149;
                                    if (var148) {
                                        var149 = var10.field2584;
                                    } else {
                                        var149 = var10.field2577;
                                    }
                                    class99 var150 = null;
                                    int var151 = 0;
                                    if (var10.field2648 != -1) {
                                        class46 var152 = class46.method1975(var10.field2648);
                                        if (var152 != null) {
                                            class46 var153 = var152.method876(var10.field2649);
                                            var150 = var153.method899(1);
                                            if (var150 == null) {
                                                method2391(var10);
                                            } else {
                                                var150.method1982();
                                                var151 = var150.field1354 / 2;
                                            }
                                        }
                                    } else if (var10.field2573 == 5) {
                                        if (var10.field2597 == 0) {
                                            var150 = field498.method2935((class39) null, -1, (class39) null, -1);
                                        } else {
                                            var150 = Statics.field163.method18();
                                        }
                                    } else if (var149 == -1) {
                                        var150 = var10.method2862((class39) null, -1, var148, Statics.field163.field29);
                                        if (var150 == null && class155.field2587) {
                                            method2391(var10);
                                        }
                                    } else {
                                        class39 var154 = class39.method633(var149);
                                        var150 = var10.method2862(var154, var10.field2650, var148, Statics.field163.field29);
                                        if (var150 == null && class155.field2587) {
                                            method2391(var10);
                                        }
                                    }
                                    class85.method1799(var10.field2550 / 2 + var12, var10.field2551 / 2 + var13);
                                    int var155 = var10.field2594 * class85.field1482[var10.field2612] >> 16;
                                    int var156 = var10.field2594 * class85.field1474[var10.field2612] >> 16;
                                    if (var150 != null) {
                                        if (var10.field2541) {
                                            var150.method1982();
                                            if (var10.field2586) {
                                                var150.method2056(0, var10.field2582, var10.field2583, var10.field2612, var10.field2579, var10.field2580 + var151 + var155, var10.field2580 + var156, var10.field2594);
                                            } else {
                                                var150.method1992(0, var10.field2582, var10.field2583, var10.field2612, var10.field2579, var10.field2580 + var151 + var155, var10.field2580 + var156);
                                            }
                                        } else {
                                            var150.method1992(0, var10.field2582, 0, var10.field2612, 0, var155, var156);
                                        }
                                    }
                                    class85.method1798();
                                } else {
                                    if (var10.field2559 == 7) {
                                        class205 var157 = var10.method2893();
                                        if (var157 == null) {
                                            if (class155.field2587) {
                                                method2391(var10);
                                            }
                                            continue;
                                        }
                                        int var158 = 0;
                                        for (int var159 = 0; var159 < var10.field2551; var159++) {
                                            for (int var160 = 0; var160 < var10.field2550; var160++) {
                                                if (var10.field2615[var158] > 0) {
                                                    class46 var161 = class46.method1975(var10.field2615[var158] - 1);
                                                    String var162;
                                                    if (var161.field1042 != 1 && var10.field2647[var158] == 1) {
                                                        var162 = Statics.method121(16748608) + var161.field1031 + class2.field23;
                                                    } else {
                                                        String var163 = Statics.method121(16748608) + var161.field1031 + class2.field23 + " " + 'x';
                                                        int var164 = var10.field2647[var158];
                                                        String var165 = Integer.toString(var164);
                                                        for (int var166 = var165.length() - 3; var166 > 0; var166 -= 3) {
                                                            var165 = var165.substring(0, var166) + class2.field25 + var165.substring(var166);
                                                        }
                                                        String var167;
                                                        if (var165.length() > 9) {
                                                            var167 = " " + Statics.method121(65408) + var165.substring(0, var165.length() - 8) + class145.field2321 + " " + class2.field19 + var165 + class2.field17 + class2.field23;
                                                        } else if (var165.length() > 6) {
                                                            var167 = " " + Statics.method121(16777215) + var165.substring(0, var165.length() - 4) + class145.field2323 + " " + class2.field19 + var165 + class2.field17 + class2.field23;
                                                        } else {
                                                            var167 = " " + Statics.method121(16776960) + var165 + class2.field23;
                                                        }
                                                        var162 = var163 + var167;
                                                    }
                                                    int var168 = (var10.field2598 + 115) * var160 + var12;
                                                    int var169 = (var10.field2534 + 12) * var159 + var13;
                                                    if (var10.field2592 == 0) {
                                                        var157.method3477(var162, var168, var169, var10.field2558, var10.field2635 ? 0 : -1);
                                                    } else if (var10.field2592 == 1) {
                                                        var157.method3475(var162, var10.field2550 / 2 + var168, var169, var10.field2558, var10.field2635 ? 0 : -1);
                                                    } else {
                                                        var157.method3478(var162, var10.field2550 + var168 - 1, var169, var10.field2558, var10.field2635 ? 0 : -1);
                                                    }
                                                }
                                                var158++;
                                            }
                                        }
                                    }
                                    if (var10.field2559 == 8 && Statics.field646 == var10 && field467 == field392) {
                                        int var170 = 0;
                                        int var171 = 0;
                                        class205 var172 = Statics.field1578;
                                        String var173 = var10.field2589;
                                        String var174 = method20(var173, var10);
                                        while (var174.length() > 0) {
                                            int var175 = var174.indexOf(class2.field18);
                                            String var176;
                                            if (var175 == -1) {
                                                var176 = var174;
                                                var174 = "";
                                            } else {
                                                var176 = var174.substring(0, var175);
                                                var174 = var174.substring(var175 + 4);
                                            }
                                            int var177 = var172.method3472(var176);
                                            if (var177 > var170) {
                                                var170 = var177;
                                            }
                                            var171 += var172.field2948 + 1;
                                        }
                                        var170 += 6;
                                        var171 += 7;
                                        int var178 = var10.field2550 + var12 - 5 - var170;
                                        int var179 = var10.field2551 + var13 + 5;
                                        if (var178 < var12 + 5) {
                                            var178 = var12 + 5;
                                        }
                                        if (var170 + var178 > arg4) {
                                            var178 = arg4 - var170;
                                        }
                                        if (var171 + var179 > arg5) {
                                            var179 = arg5 - var171;
                                        }
                                        class74.method1544(var178, var179, var170, var171, 16777120);
                                        class74.method1546(var178, var179, var170, var171, 0);
                                        String var180 = var10.field2589;
                                        int var181 = var172.field2948 + var179 + 2;
                                        String var182 = method20(var180, var10);
                                        while (var182.length() > 0) {
                                            int var183 = var182.indexOf(class2.field18);
                                            String var184;
                                            if (var183 == -1) {
                                                var184 = var182;
                                                var182 = "";
                                            } else {
                                                var184 = var182.substring(0, var183);
                                                var182 = var182.substring(var183 + 4);
                                            }
                                            var172.method3477(var184, var178 + 3, var181, 0, -1);
                                            var181 += var172.field2948 + 1;
                                        }
                                    }
                                    if (var10.field2559 == 9) {
                                        if (var10.field2564 == 1) {
                                            class74.method1547(var12, var13, var10.field2550 + var12, var10.field2551 + var13, var10.field2558);
                                        } else {
                                            int var185 = var10.field2550 >= 0 ? var10.field2550 : -var10.field2550;
                                            int var186 = var10.field2551 >= 0 ? var10.field2551 : -var10.field2551;
                                            int var187 = var185;
                                            if (var185 < var186) {
                                                var187 = var186;
                                            }
                                            if (var187 != 0) {
                                                int var188 = (var10.field2550 << 16) / var187;
                                                int var189 = (var10.field2551 << 16) / var187;
                                                if (var189 <= var188) {
                                                    var188 = -var188;
                                                } else {
                                                    var189 = -var189;
                                                }
                                                int var190 = var10.field2564 * var189 >> 17;
                                                int var191 = var10.field2564 * var189 + 1 >> 17;
                                                int var192 = var10.field2564 * var188 >> 17;
                                                int var193 = var10.field2564 * var188 + 1 >> 17;
                                                int var194 = var12 + var190;
                                                int var195 = var12 - var191;
                                                int var196 = var10.field2550 + var12 - var191;
                                                int var197 = var10.field2550 + var12 + var190;
                                                int var198 = var13 + var192;
                                                int var199 = var13 - var193;
                                                int var200 = var10.field2551 + var13 - var193;
                                                int var201 = var10.field2551 + var13 + var192;
                                                class85.method1804(var194, var195, var196);
                                                class85.method1823(var198, var199, var200, var194, var195, var196, var10.field2558);
                                                class85.method1804(var194, var196, var197);
                                                class85.method1823(var198, var200, var201, var194, var196, var197, var10.field2558);
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

    @ObfuscatedName("m.ct(Ljava/lang/String;Let;I)Ljava/lang/String;")
    public static String method20(String arg0, class155 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2805(arg1, var2 - 1);
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
                if (Statics.field522 != null) {
                    int var9 = Statics.field522.field2068;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field522.field2067 != null) {
                        var8 = (String) Statics.field522.field2067;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("al.ch(Let;IIIIIIB)V")
    public static final void method862(class155 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field319) {
            field317 = 32;
        } else {
            field317 = 0;
        }
        field319 = false;
        if (class129.field2000 == 1 || !Statics.field1896 && class129.field2000 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2555 -= 4;
                method2391(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2555 += 4;
                method2391(arg0);
            } else if (arg5 >= arg1 - field317 && arg5 < field317 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2555 = (arg4 - arg3) * var8 / var9;
                method2391(arg0);
                field319 = true;
            }
        }
        if (field269 == 0) {
            return;
        }
        int var10 = arg0.field2550;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2555 += field269 * 45;
            method2391(arg0);
        }
    }

    @ObfuscatedName("l.cf(IIIIIB)V")
    public static final void method116(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field570[0].method1598(arg0, arg1);
        Statics.field570[1].method1598(arg0, arg1 + arg3 - 16);
        class74.method1544(arg0, arg1 + 16, 16, arg3 - 32, field372);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class74.method1544(arg0, arg1 + 16 + var6, 16, var5, field427);
        class74.method1550(arg0, arg1 + 16 + var6, var5, field318);
        class74.method1550(arg0 + 1, arg1 + 16 + var6, var5, field318);
        class74.method1571(arg0, arg1 + 16 + var6, 16, field318);
        class74.method1571(arg0, arg1 + 17 + var6, 16, field318);
        class74.method1550(arg0 + 15, arg1 + 16 + var6, var5, field364);
        class74.method1550(arg0 + 14, arg1 + 17 + var6, var5 - 1, field364);
        class74.method1571(arg0, arg1 + 15 + var6 + var5, 16, field364);
        class74.method1571(arg0 + 1, arg1 + 14 + var6 + var5, 15, field364);
    }

    @ObfuscatedName("eo.ci(Let;B)Z")
    public static final boolean method2713(class155 arg0) {
        if (arg0.field2641 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2641.length; var1++) {
            int var2 = method2805(arg0, var1);
            int var3 = arg0.field2642[var1];
            if (arg0.field2641[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2641[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2641[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ey.cw(Let;II)I")
    public static final int method2805(class155 arg0, int arg1) {
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
                    var7 = field377[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field378[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field379[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class155 var11 = class155.method2386(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class46.method1975(var12).field1044 || field243)) {
                        for (int var13 = 0; var13 < var11.field2615.length; var13++) {
                            if (var12 + 1 == var11.field2615[var13]) {
                                var7 += var11.field2647[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class157.field2672[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class143.field2142[field378[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class157.field2672[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field163.field32;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class143.field2141[var14]) {
                            var7 += field378[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class155 var17 = class155.method2386(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class46.method1975(var18).field1044 || field243)) {
                        for (int var19 = 0; var19 < var17.field2615.length; var19++) {
                            if (var18 + 1 == var17.field2615[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field425;
                }
                if (var6 == 12) {
                    var7 = field406;
                }
                if (var6 == 13) {
                    int var20 = class157.field2672[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class157.method2401(var22);
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
                    var7 = (Statics.field163.field747 >> 7) + Statics.field521;
                }
                if (var6 == 19) {
                    var7 = (Statics.field163.field749 >> 7) + Statics.field1071;
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

    @ObfuscatedName("ct.cl([Let;IIIIIIII)V")
    public static final void method1791(class155[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class155 var9 = arg0[var8];
            if (var9 != null && (!var9.field2541 || var9.field2559 == 0 || var9.field2609 || method25(var9) != 0 || field433 == var9) && var9.field2531 == arg1 && (!var9.field2541 || !method117(var9))) {
                int var10 = var9.field2638 + arg6;
                int var11 = var9.field2547 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2559 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2559 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2550 + var10;
                    int var19 = var9.field2551 + var11;
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
                    int var22 = var9.field2550 + var10;
                    int var23 = var9.field2551 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field305 == var9) {
                    field420 = true;
                    field401 = var10;
                    field422 = var11;
                }
                if (!var9.field2541 || var12 < var14 && var13 < var15) {
                    int var24 = class129.field2001;
                    int var25 = class129.field2002;
                    if (class129.field2007 != 0) {
                        var24 = class129.field2008;
                        var25 = class129.field1999;
                    }
                    if (var9.field2545 == 1337) {
                        method2391(var9);
                        if (!field247 && !field381 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method30(var24, var25, var12, var13);
                        }
                    } else if (var9.field2545 != 1338) {
                        if (!field381 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var37 = var24 - var10;
                            int var38 = var25 - var11;
                            if (var9.field2544 == 1) {
                                method2701(var9.field2645, "", 24, 0, 0, var9.field2662);
                            }
                            if (var9.field2544 == 2 && !field412) {
                                int var39 = method25(var9);
                                int var40 = var39 >> 11 & 0x3F;
                                String var41;
                                if (var40 == 0) {
                                    var41 = null;
                                } else if (var9.field2608 == null || var9.field2608.trim().length() == 0) {
                                    var41 = null;
                                } else {
                                    var41 = var9.field2608;
                                }
                                if (var41 != null) {
                                    method2701(var41, Statics.method121(65280) + var9.field2644, 25, 0, -1, var9.field2662);
                                }
                            }
                            if (var9.field2544 == 3) {
                                method2701(class145.field2319, "", 26, 0, 0, var9.field2662);
                            }
                            if (var9.field2544 == 4) {
                                method2701(var9.field2645, "", 28, 0, 0, var9.field2662);
                            }
                            if (var9.field2544 == 5) {
                                method2701(var9.field2645, "", 29, 0, 0, var9.field2662);
                            }
                            if (var9.field2544 == 6 && field424 == null) {
                                method2701(var9.field2645, "", 30, 0, -1, var9.field2662);
                            }
                            if (var9.field2559 == 2) {
                                int var43 = 0;
                                for (int var44 = 0; var44 < var9.field2551; var44++) {
                                    for (int var45 = 0; var45 < var9.field2550; var45++) {
                                        int var46 = (var9.field2598 + 32) * var45;
                                        int var47 = (var9.field2534 + 32) * var44;
                                        if (var43 < 20) {
                                            var46 += var9.field2535[var43];
                                            var47 += var9.field2619[var43];
                                        }
                                        if (var37 >= var46 && var38 >= var47 && var37 < var46 + 32 && var38 < var47 + 32) {
                                            field354 = var43;
                                            Statics.field1353 = var9;
                                            if (var9.field2615[var43] > 0) {
                                                class46 var48 = class46.method1975(var9.field2615[var43] - 1);
                                                if (field482 == 1 && class159.method2705(method25(var9))) {
                                                    if (Statics.field604 != var9.field2662 || Statics.field1289 != var43) {
                                                        method2701(class145.field2310, field394 + " " + class2.field21 + " " + Statics.method121(16748608) + var48.field1031, 31, var48.field1029, var43, var9.field2662);
                                                    }
                                                } else if (!field412 || !class159.method2705(method25(var9))) {
                                                    String[] var49 = var48.field1046;
                                                    if (field429) {
                                                        var49 = method2384(var49);
                                                    }
                                                    if (class159.method2705(method25(var9))) {
                                                        for (int var50 = 4; var50 >= 3; var50--) {
                                                            if (var49 != null && var49[var50] != null) {
                                                                byte var51;
                                                                if (var50 == 3) {
                                                                    var51 = 36;
                                                                } else {
                                                                    var51 = 37;
                                                                }
                                                                method2701(var49[var50], Statics.method121(16748608) + var48.field1031, var51, var48.field1029, var43, var9.field2662);
                                                            } else if (var50 == 4) {
                                                                method2701(class145.field2162, Statics.method121(16748608) + var48.field1031, 37, var48.field1029, var43, var9.field2662);
                                                            }
                                                        }
                                                    }
                                                    if (class159.method34(method25(var9))) {
                                                        method2701(class145.field2310, Statics.method121(16748608) + var48.field1031, 38, var48.field1029, var43, var9.field2662);
                                                    }
                                                    if (class159.method2705(method25(var9)) && var49 != null) {
                                                        for (int var52 = 2; var52 >= 0; var52--) {
                                                            if (var49[var52] != null) {
                                                                byte var53 = 0;
                                                                if (var52 == 0) {
                                                                    var53 = 33;
                                                                }
                                                                if (var52 == 1) {
                                                                    var53 = 34;
                                                                }
                                                                if (var52 == 2) {
                                                                    var53 = 35;
                                                                }
                                                                method2701(var49[var52], Statics.method121(16748608) + var48.field1031, var53, var48.field1029, var43, var9.field2662);
                                                            }
                                                        }
                                                    }
                                                    String[] var54 = var9.field2630;
                                                    if (field429) {
                                                        var54 = method2384(var54);
                                                    }
                                                    if (var54 != null) {
                                                        for (int var55 = 4; var55 >= 0; var55--) {
                                                            if (var54[var55] != null) {
                                                                byte var56 = 0;
                                                                if (var55 == 0) {
                                                                    var56 = 39;
                                                                }
                                                                if (var55 == 1) {
                                                                    var56 = 40;
                                                                }
                                                                if (var55 == 2) {
                                                                    var56 = 41;
                                                                }
                                                                if (var55 == 3) {
                                                                    var56 = 42;
                                                                }
                                                                if (var55 == 4) {
                                                                    var56 = 43;
                                                                }
                                                                method2701(var54[var55], Statics.method121(16748608) + var48.field1031, var56, var48.field1029, var43, var9.field2662);
                                                            }
                                                        }
                                                    }
                                                    method2701(class145.field2207, Statics.method121(16748608) + var48.field1031, 1005, var48.field1029, var43, var9.field2662);
                                                } else if ((Statics.field1502 & 0x10) == 16) {
                                                    method2701(field398, field399 + " " + class2.field21 + " " + Statics.method121(16748608) + var48.field1031, 32, var48.field1029, var43, var9.field2662);
                                                }
                                            }
                                        }
                                        var43++;
                                    }
                                }
                            }
                            if (var9.field2541) {
                                if (field412) {
                                    int var57 = method25(var9);
                                    boolean var58 = (var57 >> 21 & 0x1) != 0;
                                    if (var58 && (Statics.field1502 & 0x20) == 32) {
                                        method2701(field398, field399 + " " + class2.field21 + " " + var9.field2602, 58, 0, var9.field2543, var9.field2662);
                                    }
                                } else {
                                    for (int var59 = 9; var59 >= 5; var59--) {
                                        String var60;
                                        if (!class159.method24(method25(var9), var59) && var9.field2629 == null) {
                                            var60 = null;
                                        } else if (var9.field2603 == null || var9.field2603.length <= var59 || var9.field2603[var59] == null || var9.field2603[var59].trim().length() == 0) {
                                            var60 = null;
                                        } else {
                                            var60 = var9.field2603[var59];
                                        }
                                        if (var60 != null) {
                                            method2701(var60, var9.field2602, 1007, var59 + 1, var9.field2543, var9.field2662);
                                        }
                                    }
                                    int var62 = method25(var9);
                                    int var63 = var62 >> 11 & 0x3F;
                                    String var64;
                                    if (var63 == 0) {
                                        var64 = null;
                                    } else if (var9.field2608 == null || var9.field2608.trim().length() == 0) {
                                        var64 = null;
                                    } else {
                                        var64 = var9.field2608;
                                    }
                                    if (var64 != null) {
                                        method2701(var64, var9.field2602, 25, 0, var9.field2543, var9.field2662);
                                    }
                                    for (int var66 = 4; var66 >= 0; var66--) {
                                        String var67;
                                        if (!class159.method24(method25(var9), var66) && var9.field2629 == null) {
                                            var67 = null;
                                        } else if (var9.field2603 == null || var9.field2603.length <= var66 || var9.field2603[var66] == null || var9.field2603[var66].trim().length() == 0) {
                                            var67 = null;
                                        } else {
                                            var67 = var9.field2603[var66];
                                        }
                                        if (var67 != null) {
                                            method2701(var67, var9.field2602, 57, var66 + 1, var9.field2543, var9.field2662);
                                        }
                                    }
                                    if (class159.method636(method25(var9))) {
                                        method2701(class145.field2191, "", 30, 0, var9.field2543, var9.field2662);
                                    }
                                }
                            }
                        }
                        if (var9.field2559 == 0) {
                            if (!var9.field2541 && method117(var9) && Statics.field1458 != var9) {
                                continue;
                            }
                            method1791(arg0, var9.field2662, var12, var13, var14, var15, var10 - var9.field2554, var11 - var9.field2555);
                            if (var9.field2652 != null) {
                                method1791(var9.field2652, var9.field2662, var12, var13, var14, var15, var10 - var9.field2554, var11 - var9.field2555);
                            }
                            class4 var69 = (class4) field396.method3214((long) var9.field2662);
                            if (var69 != null) {
                                if (var69.field56 == 0 && class129.field2001 >= var12 && class129.field2002 >= var13 && class129.field2001 < var14 && class129.field2002 < var15 && !field381 && !field493) {
                                    field387[0] = class145.field2396;
                                    field388[0] = "";
                                    field385[0] = 1006;
                                    field478 = 1;
                                }
                                Statics.method10(var69.field50, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2541) {
                            if (var9.field2661 && class129.field2001 >= var12 && class129.field2002 >= var13 && class129.field2001 < var14 && class129.field2002 < var15) {
                                for (class1 var70 = (class1) field419.method3251(); var70 != null; var70 = (class1) field419.method3272()) {
                                    if (var70.field14) {
                                        var70.method3352();
                                        var70.field3.field2621 = false;
                                    }
                                }
                                if (Statics.field165 == 0) {
                                    field305 = null;
                                    field433 = null;
                                }
                                if (!field381) {
                                    field387[0] = class145.field2396;
                                    field388[0] = "";
                                    field385[0] = 1006;
                                    field478 = 1;
                                }
                            }
                            boolean var71;
                            if (class129.field2001 >= var12 && class129.field2002 >= var13 && class129.field2001 < var14 && class129.field2002 < var15) {
                                var71 = true;
                            } else {
                                var71 = false;
                            }
                            boolean var72 = false;
                            if ((class129.field2000 == 1 || !Statics.field1896 && class129.field2000 == 4) && var71) {
                                var72 = true;
                            }
                            boolean var73 = false;
                            if ((class129.field2007 == 1 || !Statics.field1896 && class129.field2007 == 4) && class129.field2008 >= var12 && class129.field1999 >= var13 && class129.field2008 < var14 && class129.field1999 < var15) {
                                var73 = true;
                            }
                            if (var73) {
                                method120(var9, class129.field2008 - var10, class129.field1999 - var11);
                            }
                            if (field305 != null && field305 != var9 && var71 && class159.method132(method25(var9))) {
                                field416 = var9;
                            }
                            if (field433 == var9) {
                                field417 = true;
                                field287 = var10;
                                field366 = var11;
                            }
                            if (var9.field2609) {
                                if (var71 && field269 != 0 && var9.field2595 != null) {
                                    class1 var74 = new class1();
                                    var74.field14 = true;
                                    var74.field3 = var9;
                                    var74.field5 = field269;
                                    var74.field15 = var9.field2595;
                                    field419.method3246(var74);
                                }
                                if (field305 != null || Statics.field792 != null || field381) {
                                    var73 = false;
                                    var72 = false;
                                    var71 = false;
                                }
                                if (!var9.field2654 && var73) {
                                    var9.field2654 = true;
                                    if (var9.field2646 != null) {
                                        class1 var75 = new class1();
                                        var75.field14 = true;
                                        var75.field3 = var9;
                                        var75.field4 = class129.field2008 - var10;
                                        var75.field5 = class129.field1999 - var11;
                                        var75.field15 = var9.field2646;
                                        field419.method3246(var75);
                                    }
                                }
                                if (var9.field2654 && var72 && var9.field2655 != null) {
                                    class1 var76 = new class1();
                                    var76.field14 = true;
                                    var76.field3 = var9;
                                    var76.field4 = class129.field2001 - var10;
                                    var76.field5 = class129.field2002 - var11;
                                    var76.field15 = var9.field2655;
                                    field419.method3246(var76);
                                }
                                if (var9.field2654 && !var72) {
                                    var9.field2654 = false;
                                    if (var9.field2613 != null) {
                                        class1 var77 = new class1();
                                        var77.field14 = true;
                                        var77.field3 = var9;
                                        var77.field4 = class129.field2001 - var10;
                                        var77.field5 = class129.field2002 - var11;
                                        var77.field15 = var9.field2613;
                                        field442.method3246(var77);
                                    }
                                }
                                if (var72 && var9.field2614 != null) {
                                    class1 var78 = new class1();
                                    var78.field14 = true;
                                    var78.field3 = var9;
                                    var78.field4 = class129.field2001 - var10;
                                    var78.field5 = class129.field2002 - var11;
                                    var78.field15 = var9.field2614;
                                    field419.method3246(var78);
                                }
                                if (!var9.field2621 && var71) {
                                    var9.field2621 = true;
                                    if (var9.field2605 != null) {
                                        class1 var79 = new class1();
                                        var79.field14 = true;
                                        var79.field3 = var9;
                                        var79.field4 = class129.field2001 - var10;
                                        var79.field5 = class129.field2002 - var11;
                                        var79.field15 = var9.field2605;
                                        field419.method3246(var79);
                                    }
                                }
                                if (var9.field2621 && var71 && var9.field2616 != null) {
                                    class1 var80 = new class1();
                                    var80.field14 = true;
                                    var80.field3 = var9;
                                    var80.field4 = class129.field2001 - var10;
                                    var80.field5 = class129.field2002 - var11;
                                    var80.field15 = var9.field2616;
                                    field419.method3246(var80);
                                }
                                if (var9.field2621 && !var71) {
                                    var9.field2621 = false;
                                    if (var9.field2617 != null) {
                                        class1 var81 = new class1();
                                        var81.field14 = true;
                                        var81.field3 = var9;
                                        var81.field4 = class129.field2001 - var10;
                                        var81.field5 = class129.field2002 - var11;
                                        var81.field15 = var9.field2617;
                                        field442.method3246(var81);
                                    }
                                }
                                if (var9.field2628 != null) {
                                    class1 var82 = new class1();
                                    var82.field3 = var9;
                                    var82.field15 = var9.field2628;
                                    field299.method3246(var82);
                                }
                                if (var9.field2622 != null && field426 > var9.field2656) {
                                    if (var9.field2623 == null || field426 - var9.field2656 > 32) {
                                        class1 var87 = new class1();
                                        var87.field3 = var9;
                                        var87.field15 = var9.field2622;
                                        field419.method3246(var87);
                                    } else {
                                        label704: for (int var83 = var9.field2656; var83 < field426; var83++) {
                                            int var84 = field282[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var9.field2623.length; var85++) {
                                                if (var9.field2623[var85] == var84) {
                                                    class1 var86 = new class1();
                                                    var86.field3 = var9;
                                                    var86.field15 = var9.field2622;
                                                    field419.method3246(var86);
                                                    break label704;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2656 = field426;
                                }
                                if (var9.field2624 != null && field428 > var9.field2657) {
                                    if (var9.field2625 == null || field428 - var9.field2657 > 32) {
                                        class1 var92 = new class1();
                                        var92.field3 = var9;
                                        var92.field15 = var9.field2624;
                                        field419.method3246(var92);
                                    } else {
                                        label680: for (int var88 = var9.field2657; var88 < field428; var88++) {
                                            int var89 = field314[var88 & 0x1F];
                                            for (int var90 = 0; var90 < var9.field2625.length; var90++) {
                                                if (var9.field2625[var90] == var89) {
                                                    class1 var91 = new class1();
                                                    var91.field3 = var9;
                                                    var91.field15 = var9.field2624;
                                                    field419.method3246(var91);
                                                    break label680;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2657 = field428;
                                }
                                if (var9.field2540 != null && field430 > var9.field2539) {
                                    if (var9.field2627 == null || field430 - var9.field2539 > 32) {
                                        class1 var97 = new class1();
                                        var97.field3 = var9;
                                        var97.field15 = var9.field2540;
                                        field419.method3246(var97);
                                    } else {
                                        label656: for (int var93 = var9.field2539; var93 < field430; var93++) {
                                            int var94 = field315[var93 & 0x1F];
                                            for (int var95 = 0; var95 < var9.field2627.length; var95++) {
                                                if (var9.field2627[var95] == var94) {
                                                    class1 var96 = new class1();
                                                    var96.field3 = var9;
                                                    var96.field15 = var9.field2540;
                                                    field419.method3246(var96);
                                                    break label656;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2539 = field430;
                                }
                                if (field235 > var9.field2530 && var9.field2631 != null) {
                                    class1 var98 = new class1();
                                    var98.field3 = var9;
                                    var98.field15 = var9.field2631;
                                    field419.method3246(var98);
                                }
                                if (field432 > var9.field2530 && var9.field2633 != null) {
                                    class1 var99 = new class1();
                                    var99.field3 = var9;
                                    var99.field15 = var9.field2633;
                                    field419.method3246(var99);
                                }
                                if (field328 > var9.field2530 && var9.field2634 != null) {
                                    class1 var100 = new class1();
                                    var100.field3 = var9;
                                    var100.field15 = var9.field2634;
                                    field419.method3246(var100);
                                }
                                if (field453 > var9.field2530 && var9.field2575 != null) {
                                    class1 var101 = new class1();
                                    var101.field3 = var9;
                                    var101.field15 = var9.field2575;
                                    field419.method3246(var101);
                                }
                                if (field308 > var9.field2530 && var9.field2643 != null) {
                                    class1 var102 = new class1();
                                    var102.field3 = var9;
                                    var102.field15 = var9.field2643;
                                    field419.method3246(var102);
                                }
                                if (field436 > var9.field2530 && var9.field2593 != null) {
                                    class1 var103 = new class1();
                                    var103.field3 = var9;
                                    var103.field15 = var9.field2593;
                                    field419.method3246(var103);
                                }
                                var9.field2530 = field272;
                                if (var9.field2591 != null) {
                                    for (int var104 = 0; var104 < field460; var104++) {
                                        class1 var105 = new class1();
                                        var105.field3 = var9;
                                        var105.field10 = field462[var104];
                                        var105.field8 = field461[var104];
                                        var105.field15 = var9.field2591;
                                        field419.method3246(var105);
                                    }
                                }
                            }
                        }
                        if (!var9.field2541 && field305 == null && Statics.field792 == null && !field381) {
                            if ((var9.field2549 >= 0 || var9.field2560 != 0) && class129.field2001 >= var12 && class129.field2002 >= var13 && class129.field2001 < var14 && class129.field2002 < var15) {
                                if (var9.field2549 >= 0) {
                                    Statics.field1458 = arg0[var9.field2549];
                                } else {
                                    Statics.field1458 = var9;
                                }
                            }
                            if (var9.field2559 == 8 && class129.field2001 >= var12 && class129.field2002 >= var13 && class129.field2001 < var14 && class129.field2002 < var15) {
                                Statics.field646 = var9;
                            }
                            if (var9.field2557 > var9.field2551) {
                                method862(var9, var9.field2550 + var10, var11, var9.field2551, var9.field2557, class129.field2001, class129.field2002);
                            }
                        }
                    } else if ((field237 == 0 || field237 == 3) && (class129.field2007 == 1 || !Statics.field1896 && class129.field2007 == 4)) {
                        int var26 = class129.field2008 - 25 - var10;
                        int var27 = class129.field1999 - 5 - var11;
                        if (var26 >= 0 && var27 >= 0 && var26 < 146 && var27 < 151 && (var26 < 0 || var26 > 23 || var27 < 117 || var27 > 142)) {
                            var26 -= 73;
                            var27 -= 75;
                            int var28 = field404 + field321 & 0x7FF;
                            int var29 = class85.field1482[var28];
                            int var30 = class85.field1474[var28];
                            int var31 = (field310 + 256) * var29 >> 8;
                            int var32 = (field310 + 256) * var30 >> 8;
                            int var33 = var26 * var32 + var27 * var31 >> 11;
                            int var34 = var27 * var32 - var26 * var31 >> 11;
                            int var35 = Statics.field163.field747 + var33 >> 7;
                            int var36 = Statics.field163.field749 - var34 >> 7;
                            field279.method2364(89);
                            field279.method2113(18);
                            field279.method2239(class126.field1966[82] ? (class126.field1966[81] ? 2 : 1) : 0);
                            field279.method2114(Statics.field521 + var35);
                            field279.method2158(Statics.field1071 + var36);
                            field279.method2113(var26);
                            field279.method2113(var27);
                            field279.method2114(field404);
                            field279.method2113(57);
                            field279.method2113(field321);
                            field279.method2113(field310);
                            field279.method2113(89);
                            field279.method2114(Statics.field163.field747);
                            field279.method2114(Statics.field163.field749);
                            field279.method2113(63);
                            field370 = var35;
                            field472 = var36;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.cc([Let;II)V")
    public static final void method501(class155[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class155 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2559 == 0) {
                    if (var3.field2652 != null) {
                        method501(var3.field2652, arg1);
                    }
                    class4 var4 = (class4) field396.method3214((long) var3.field2662);
                    if (var4 != null) {
                        int var5 = var4.field50;
                        if (class155.method512(var5)) {
                            method501(Statics.field2533[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2653 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field15 = var3.field2653;
                    class33.method2543(var6, 200000);
                }
                if (arg1 == 1 && var3.field2637 != null) {
                    if (var3.field2543 >= 0) {
                        class155 var7 = class155.method2386(var3.field2662);
                        if (var7 == null || var7.field2652 == null || var3.field2543 >= var7.field2652.length || var7.field2652[var3.field2543] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field15 = var3.field2637;
                    class33.method2543(var8, 200000);
                }
            }
        }
    }

    @ObfuscatedName("k.cg(Let;III)V")
    public static final void method120(class155 arg0, int arg1, int arg2) {
        if (field305 != null || field381 || arg0 == null || method81(arg0) == null) {
            return;
        }
        field305 = arg0;
        field433 = method81(arg0);
        field414 = arg1;
        field415 = arg2;
        Statics.field165 = 0;
        field423 = false;
        if (field478 > 0) {
            method3376(field478 - 1);
        }
    }

    @ObfuscatedName("gk.ce(II)V")
    public static void method3376(int arg0) {
        Statics.field932 = new class28();
        Statics.field932.field654 = field383[arg0];
        Statics.field932.field644 = field384[arg0];
        Statics.field932.field645 = field385[arg0];
        Statics.field932.field643 = field312[arg0];
        Statics.field932.field647 = field387[arg0];
    }

    @ObfuscatedName("ca.cv(III)V")
    public static void method1981(int arg0, int arg1) {
        class28 var2 = Statics.field932;
        method598(var2.field654, var2.field644, var2.field645, var2.field643, var2.field647, var2.field647, arg0, arg1);
        Statics.field932 = null;
    }

    @ObfuscatedName("dp.cs(Let;B)V")
    public static void method2391(class155 arg0) {
        if (field445 == arg0.field2660) {
            field248[arg0.field2659] = true;
        }
    }

    @ObfuscatedName("g.cb(I)V")
    public static void method139() {
        for (class4 var0 = (class4) field396.method3217(); var0 != null; var0 = (class4) field396.method3218()) {
            int var1 = var0.field50;
            if (class155.method512(var1)) {
                boolean var2 = true;
                class155[] var3 = Statics.field2533[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2541;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2882;
                    class155 var6 = class155.method2386(var5);
                    if (var6 != null) {
                        method2391(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.cu(Let;B)Let;")
    public static class155 method81(class155 arg0) {
        class155 var1 = arg0;
        int var2 = method25(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class155 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class155.method2386(var1.field2531);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class155 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2604;
        }
        return var7;
    }

    @ObfuscatedName("dk.cz([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2384(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("gc.ca(II)V")
    public static final void method3358(int arg0) {
        if (!class155.method512(arg0)) {
            return;
        }
        class155[] var1 = Statics.field2533[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class155 var3 = var1[var2];
            if (var3 != null) {
                var3.field2650 = 0;
                var3.field2651 = 0;
            }
        }
    }

    @ObfuscatedName("cx.ck(II)V")
    public static final void method2062(int arg0) {
        if (class155.method512(arg0)) {
            Statics.method1789(Statics.field2533[arg0], -1);
        }
    }

    @ObfuscatedName("c.cy(II)V")
    public static final void method151(int arg0) {
        method139();
        class21.method5();
        class47 var1 = (class47) class47.field1074.method3186((long) arg0);
        class47 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1073.method2751(16, arg0);
            class47 var4 = new class47();
            if (var3 != null) {
                var4.method914(new class108(var3));
            }
            class47.field1074.method3183(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field1078;
        if (var5 == 0) {
            return;
        }
        int var6 = class157.field2672[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class85.method1840(0.9D);
                ((class89) Statics.field1484).method1869(0.9D);
            }
            if (var6 == 2) {
                class85.method1840(0.8D);
                ((class89) Statics.field1484).method1869(0.8D);
            }
            if (var6 == 3) {
                class85.method1840(0.7D);
                ((class89) Statics.field1484).method1869(0.7D);
            }
            if (var6 == 4) {
                class85.method1840(0.6D);
                ((class89) Statics.field1484).method1869(0.6D);
            }
            class46.field1036.method3181();
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
            if (field294 != var7) {
                if (field294 == 0 && field476 != -1) {
                    class164.method2618(Statics.field2800, field476, 0, var7, false);
                    field477 = false;
                } else if (var7 == 0) {
                    class164.method2904();
                    field477 = false;
                } else {
                    class164.method2476(var7);
                }
                field294 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field475 = 127;
            }
            if (var6 == 1) {
                field475 = 96;
            }
            if (var6 == 2) {
                field475 = 64;
            }
            if (var6 == 3) {
                field475 = 32;
            }
            if (var6 == 4) {
                field475 = 0;
            }
        }
        if (var5 == 5) {
            field395 = var6;
        }
        if (var5 == 6) {
            field402 = var6;
        }
        if (var5 == 9) {
            field403 = var6;
        }
        if (var5 == 10) {
            if (var6 == 0) {
                field479 = 127;
            }
            if (var6 == 1) {
                field479 = 96;
            }
            if (var6 == 2) {
                field479 = 64;
            }
            if (var6 == 3) {
                field479 = 32;
            }
            if (var6 == 4) {
                field479 = 0;
            }
        }
        if (var5 == 17) {
            field437 = var6 & 0xFFFF;
        }
        if (var5 == 18) {
            class18[] var8 = new class18[] { class18.field507, class18.field510, class18.field514 };
            field265 = (class18) class100.method1790(var8, var6);
            if (field265 == null) {
                field265 = class18.field514;
            }
        }
        if (var5 != 19) {
            return;
        }
        if (var6 == -1) {
            field300 = -1;
        } else {
            field300 = var6 & 0x7FF;
        }
    }

    @ObfuscatedName("j.cr(Let;I)V")
    public static final void method77(class155 arg0) {
        int var1 = arg0.field2545;
        if (var1 == 324) {
            if (field499 == -1) {
                field499 = arg0.field2600;
                field408 = arg0.field2607;
            }
            if (field498.field2686) {
                arg0.field2600 = field499;
            } else {
                arg0.field2600 = field408;
            }
        } else if (var1 == 325) {
            if (field499 == -1) {
                field499 = arg0.field2600;
                field408 = arg0.field2607;
            }
            if (field498.field2686) {
                arg0.field2600 = field408;
            } else {
                arg0.field2600 = field499;
            }
        } else if (var1 == 327) {
            arg0.field2612 = 150;
            arg0.field2582 = (int) (Math.sin((double) field348 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2573 = 5;
            arg0.field2597 = 0;
        } else if (var1 == 328) {
            arg0.field2612 = 150;
            arg0.field2582 = (int) (Math.sin((double) field348 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2573 = 5;
            arg0.field2597 = 1;
        }
    }

    @ObfuscatedName("aj.cd(B)V")
    public static final void method923() {
        field279.method2364(24);
        for (class4 var0 = (class4) field396.method3217(); var0 != null; var0 = (class4) field396.method3218()) {
            if (var0.field56 == 0 || var0.field56 == 3) {
                method1793(var0, true);
            }
        }
        if (field424 != null) {
            method2391(field424);
            field424 = null;
        }
    }

    @ObfuscatedName("dn.co(IIII)Le;")
    public static final class4 method2590(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field50 = arg1;
        var3.field56 = arg2;
        field396.method3215(var3, (long) arg0);
        method3358(arg1);
        class33.method2559(arg1);
        class155 var4 = class155.method2386(arg0);
        if (var4 != null) {
            method2391(var4);
        }
        if (field424 != null) {
            method2391(field424);
            field424 = null;
        }
        method496();
        if (field302 != -1) {
            int var5 = field302;
            if (class155.method512(var5)) {
                method501(Statics.field2533[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("ct.db(Le;ZI)V")
    public static final void method1793(class4 arg0, boolean arg1) {
        int var2 = arg0.field50;
        int var3 = (int) arg0.field2882;
        arg0.method3352();
        if (arg1) {
            class155.method1880(var2);
        }
        method2712(var2);
        class155 var4 = class155.method2386(var3);
        if (var4 != null) {
            method2391(var4);
        }
        method496();
        if (field302 != -1) {
            int var5 = field302;
            if (class155.method512(var5)) {
                method501(Statics.field2533[var5], 1);
            }
        }
    }

    @ObfuscatedName("dv.da(Let;S)Z")
    public static final boolean method2358(class155 arg0) {
        int var1 = arg0.field2545;
        if (var1 == 205) {
            field286 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field498.method2949(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field498.method2932(var4, var5 == 1);
        }
        if (var1 == 324) {
            field498.method2933(false);
        }
        if (var1 == 325) {
            field498.method2933(true);
        }
        if (var1 == 326) {
            field279.method2364(234);
            field498.method2946(field279);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("s.dm(IIIILbu;B)V")
    public static final void method143(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field404 + field321 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class85.field1482[var5];
        int var8 = class85.field1474[var5];
        int var9 = var7 * 256 / (field310 + 256);
        int var10 = var8 * 256 / (field310 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1528(Statics.field1660, arg0 + 94 + var11 - arg4.field1308 / 2 + 4, arg1 + 83 - var12 - arg4.field1312 / 2 - 4);
        } else {
            arg4.method1467(arg0 + 94 + var11 - arg4.field1308 / 2 + 4, arg1 + 83 - var12 - arg4.field1312 / 2 - 4);
        }
    }

    @ObfuscatedName("h.dh(Ljava/lang/String;ZI)Z")
    public static boolean method26(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class212.method546(arg0, Statics.field1901);
        for (int var3 = 0; var3 < field492; var3++) {
            if (var2.equalsIgnoreCase(class212.method546(field494[var3].field220, Statics.field1901)) && (!arg1 || field494[var3].field216 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class212.method546(Statics.field163.field39, Statics.field1901))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("m.dv(Ljava/lang/String;I)Z")
    public static boolean method21(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class212.method546(arg0, Statics.field1901);
        for (int var2 = 0; var2 < field496; var2++) {
            class8 var3 = field463[var2];
            if (var1.equalsIgnoreCase(class212.method546(var3.field120, Statics.field1901))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class212.method546(var3.field121, Statics.field1901))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("dm.dk(Ljava/lang/String;S)V")
    public static final void method2328(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class212.method546(arg0, Statics.field1901);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field492; var2++) {
            class16 var3 = field494[var2];
            String var4 = var3.field220;
            String var5 = class212.method546(var4, Statics.field1901);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field492--;
                for (int var7 = var2; var7 < field492; var7++) {
                    field494[var7] = field494[var7 + 1];
                }
                field432 = field272;
                field279.method2364(117);
                class111 var8 = field279;
                int var9 = arg0.length() + 1;
                var8.method2113(var9);
                field279.method2212(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ah.dp(Ljava/lang/String;B)V")
    public static final void method714(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class212.method546(arg0, Statics.field1901);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field496; var2++) {
            class8 var3 = field463[var2];
            String var4 = var3.field120;
            String var5 = class212.method546(var4, Statics.field1901);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field496--;
                for (int var7 = var2; var7 < field496; var7++) {
                    field463[var7] = field463[var7 + 1];
                }
                field432 = field272;
                field279.method2364(171);
                class111 var8 = field279;
                int var9 = arg0.length() + 1;
                var8.method2113(var9);
                field279.method2212(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("bv.do(Ljava/lang/String;II)V")
    public static final void method1444(String arg0, int arg1) {
        field279.method2364(214);
        class111 var2 = field279;
        int var3 = arg0.length() + 1;
        var2.method2113(var3 + 1);
        field279.method2239(arg1);
        field279.method2212(arg0);
    }

    @ObfuscatedName("dj.dz(Ljava/lang/String;I)V")
    public static final void method2434(String arg0) {
        if (Statics.field57 == null) {
            return;
        }
        field279.method2364(20);
        class111 var1 = field279;
        int var2 = arg0.length() + 1;
        var1.method2113(var2);
        field279.method2212(arg0);
    }

    @ObfuscatedName("n.du(I)V")
    public static final void method536() {
        field279.method2364(132);
        field279.method2113(0);
    }

    @ObfuscatedName("eo.dj(II)V")
    public static void method2712(int arg0) {
        for (class182 var1 = (class182) field443.method3217(); var1 != null; var1 = (class182) field443.method3218()) {
            if ((long) arg0 == (var1.field2882 >> 48 & 0xFFFFL)) {
                var1.method3352();
            }
        }
    }

    @ObfuscatedName("e.dx(Let;I)I")
    public static int method25(class155 arg0) {
        class182 var1 = (class182) field443.method3214(((long) arg0.field2662 << 32) + (long) arg0.field2543);
        return var1 == null ? arg0.field2546 : var1.field2867;
    }

    @ObfuscatedName("l.de(Let;S)Z")
    public static boolean method117(class155 arg0) {
        if (field493) {
            if (method25(arg0) != 0) {
                return false;
            }
            if (arg0.field2559 == 0) {
                return false;
            }
        }
        return arg0.field2553;
    }

    @ObfuscatedName("eu.df(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method2711(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field241 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field241 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field241 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field241 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field241 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field245 + "/";
    }

    @ObfuscatedName("dt.dr(Ljava/lang/String;ZB)V")
    public static void method2474(String arg0, boolean arg1) {
        Statics.field2821.field2470 = false;
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field798; var5++) {
            class46 var6 = class46.method1975(var5);
            if ((!arg1 || var6.field1069) && var6.field1062 == -1 && var6.field1031.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field223 = -1;
                    Statics.field1912 = null;
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
        Statics.field1912 = var3;
        Statics.field515 = 0;
        Statics.field223 = var4;
        String[] var9 = new String[Statics.field223];
        for (int var10 = 0; var10 < Statics.field223; var10++) {
            var9[var10] = class46.method1975(var3[var10]).field1031;
        }
        class113.method1882(var9, Statics.field1912);
        Statics.field2821.method2744();
        Statics.field2821.field2470 = true;
    }
}

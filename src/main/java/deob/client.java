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
import netscape.javascript.JSObject;

public final class client extends class136 {

    @ObfuscatedName("client.l")
    public static boolean field393 = true;

    @ObfuscatedName("client.c")
    public static int field244 = 1;

    @ObfuscatedName("client.u")
    public static int field245 = 0;

    @ObfuscatedName("client.w")
    public static class219[] field304 = new class219[4];

    @ObfuscatedName("client.r")
    public static int field247 = 0;

    @ObfuscatedName("client.o")
    public static boolean field249 = false;

    @ObfuscatedName("client.h")
    public static boolean field241 = false;

    @ObfuscatedName("client.s")
    public static int field251 = 0;

    @ObfuscatedName("client.q")
    public static int field254 = 0;

    @ObfuscatedName("client.d")
    public static boolean field255 = true;

    @ObfuscatedName("client.b")
    public static int field256 = 0;

    @ObfuscatedName("client.n")
    public static long field342 = -1L;

    @ObfuscatedName("client.p")
    public static int field453 = -1;

    @ObfuscatedName("client.k")
    public static int field259 = -1;

    @ObfuscatedName("client.ax")
    public static int field260 = -1;

    @ObfuscatedName("client.ap")
    public static boolean field261 = true;

    @ObfuscatedName("client.ao")
    public static boolean field262 = false;

    @ObfuscatedName("client.ai")
    public static int field263 = 0;

    @ObfuscatedName("client.aw")
    public static int field264 = 0;

    @ObfuscatedName("client.am")
    public static int field275 = 0;

    @ObfuscatedName("client.au")
    public static int field266 = 0;

    @ObfuscatedName("client.ae")
    public static int field461 = 0;

    @ObfuscatedName("client.ab")
    public static int field268 = 0;

    @ObfuscatedName("client.av")
    public static int field269 = 0;

    @ObfuscatedName("client.ay")
    public static int field270 = 0;

    @ObfuscatedName("client.ag")
    public static int field271 = 0;

    @ObfuscatedName("client.aj")
    public static class111 field473 = new class111(new byte[5000]);

    @ObfuscatedName("client.al")
    public static class19 field257 = class19.field508;

    @ObfuscatedName("client.ar")
    public static int field274 = 0;

    @ObfuscatedName("client.ad")
    public static int field338 = 0;

    @ObfuscatedName("client.an")
    public static int field276 = 0;

    @ObfuscatedName("client.bb")
    public static int field277 = 0;

    @ObfuscatedName("client.bj")
    public static int field278 = 0;

    @ObfuscatedName("client.bq")
    public static int field324 = 0;

    @ObfuscatedName("client.bn")
    public static int field379 = 0;

    @ObfuscatedName("client.bi")
    public static int field448 = 0;

    @ObfuscatedName("client.cf")
    public static class32[] field397 = new class32[32768];

    @ObfuscatedName("client.ch")
    public static int field283 = 0;

    @ObfuscatedName("client.cb")
    public static int[] field284 = new int[32768];

    @ObfuscatedName("client.cd")
    public static class114 field475 = new class114(5000);

    @ObfuscatedName("client.cp")
    public static class114 field248 = new class114(5000);

    @ObfuscatedName("client.ce")
    public static class114 field258 = new class114(5000);

    @ObfuscatedName("client.cm")
    public static int field289 = 0;

    @ObfuscatedName("client.cj")
    public static int field290 = 0;

    @ObfuscatedName("client.cq")
    public static int field359 = 0;

    @ObfuscatedName("client.ct")
    public static int field465 = 0;

    @ObfuscatedName("client.cx")
    public static int field293 = 0;

    @ObfuscatedName("client.cu")
    public static int field294 = 0;

    @ObfuscatedName("client.ck")
    public static int field485 = 0;

    @ObfuscatedName("client.cr")
    public static int field296 = 0;

    @ObfuscatedName("client.cw")
    public static boolean field295 = false;

    @ObfuscatedName("client.ca")
    public static int field298 = 0;

    @ObfuscatedName("client.df")
    public static int field299 = 0;

    @ObfuscatedName("client.dp")
    public static int field300 = 1;

    @ObfuscatedName("client.dc")
    public static int field389 = 0;

    @ObfuscatedName("client.dw")
    public static int field302 = 1;

    @ObfuscatedName("client.dh")
    public static int field482 = 0;

    @ObfuscatedName("client.db")
    public static boolean field305 = false;

    @ObfuscatedName("client.de")
    public static int[][][] field505 = new int[4][13][13];

    @ObfuscatedName("client.dn")
    public static final int[] field307 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dy")
    public static int field308 = 0;

    @ObfuscatedName("client.da")
    public static int field309 = 2;

    @ObfuscatedName("client.dg")
    public static int field310 = 0;

    @ObfuscatedName("client.di")
    public static int field311 = 2;

    @ObfuscatedName("client.dz")
    public static int field495 = 0;

    @ObfuscatedName("client.dr")
    public static int field334 = 1;

    @ObfuscatedName("client.dq")
    public static int field314 = 0;

    @ObfuscatedName("client.el")
    public static int field315 = 0;

    @ObfuscatedName("client.ep")
    public static int field470 = 2;

    @ObfuscatedName("client.ec")
    public static int field279 = 0;

    @ObfuscatedName("client.ej")
    public static int field318 = 1;

    @ObfuscatedName("client.eo")
    public static int field319 = 0;

    @ObfuscatedName("client.ew")
    public static int field398 = 0;

    @ObfuscatedName("client.eg")
    public static int field317 = 2301979;

    @ObfuscatedName("client.en")
    public static int field322 = 5063219;

    @ObfuscatedName("client.fp")
    public static int field480 = 3353893;

    @ObfuscatedName("client.fv")
    public static int field502 = 7759444;

    @ObfuscatedName("client.fo")
    public static boolean field325 = false;

    @ObfuscatedName("client.fu")
    public static int field329 = 0;

    @ObfuscatedName("client.fl")
    public static int field327 = 128;

    @ObfuscatedName("client.fy")
    public static int field328 = 0;

    @ObfuscatedName("client.fc")
    public static int field313 = 0;

    @ObfuscatedName("client.fq")
    public static int field493 = 0;

    @ObfuscatedName("client.fw")
    public static int field331 = 0;

    @ObfuscatedName("client.fh")
    public static int field332 = 0;

    @ObfuscatedName("client.ff")
    public static int field459 = 0;

    @ObfuscatedName("client.fd")
    public static boolean field445 = false;

    @ObfuscatedName("client.fr")
    public static int field316 = 0;

    @ObfuscatedName("client.fm")
    public static int field336 = 0;

    @ObfuscatedName("client.fi")
    public static int field273 = 50;

    @ObfuscatedName("client.ft")
    public static int[] field301 = new int[field273];

    @ObfuscatedName("client.fa")
    public static int[] field399 = new int[field273];

    @ObfuscatedName("client.fn")
    public static int[] field340 = new int[field273];

    @ObfuscatedName("client.fs")
    public static int[] field333 = new int[field273];

    @ObfuscatedName("client.gr")
    public static int[] field303 = new int[field273];

    @ObfuscatedName("client.gq")
    public static int[] field343 = new int[field273];

    @ObfuscatedName("client.gg")
    public static int[] field344 = new int[field273];

    @ObfuscatedName("client.gf")
    public static String[] field345 = new String[field273];

    @ObfuscatedName("client.go")
    public static int[][] field346 = new int[104][104];

    @ObfuscatedName("client.gn")
    public static int field347 = 0;

    @ObfuscatedName("client.gh")
    public static int field286 = -1;

    @ObfuscatedName("client.gi")
    public static int field374 = -1;

    @ObfuscatedName("client.gs")
    public static int field267 = 0;

    @ObfuscatedName("client.gk")
    public static int field351 = 0;

    @ObfuscatedName("client.gj")
    public static int field352 = 0;

    @ObfuscatedName("client.gd")
    public static int field353 = 0;

    @ObfuscatedName("client.gz")
    public static int field354 = 0;

    @ObfuscatedName("client.gw")
    public static int field350 = 0;

    @ObfuscatedName("client.gu")
    public static int field356 = 0;

    @ObfuscatedName("client.ga")
    public static int field357 = 0;

    @ObfuscatedName("client.ge")
    public static int field373 = 0;

    @ObfuscatedName("client.gb")
    public static int field281 = 0;

    @ObfuscatedName("client.gv")
    public static boolean field360 = false;

    @ObfuscatedName("client.gp")
    public static int field361 = 0;

    @ObfuscatedName("client.gc")
    public static int field362 = 0;

    @ObfuscatedName("client.hg")
    public static class3[] field363 = new class3[2048];

    @ObfuscatedName("client.hr")
    public static int field364 = 0;

    @ObfuscatedName("client.hw")
    public static int[] field365 = new int[2048];

    @ObfuscatedName("client.hf")
    public static int field366 = 0;

    @ObfuscatedName("client.ha")
    public static int[] field348 = new int[2048];

    @ObfuscatedName("client.hh")
    public static class111[] field368 = new class111[2048];

    @ObfuscatedName("client.ht")
    public static int field369 = -1;

    @ObfuscatedName("client.hq")
    public static int field370 = 0;

    @ObfuscatedName("client.hk")
    public static int field371 = 0;

    @ObfuscatedName("client.hm")
    public static int[] field432 = new int[1000];

    @ObfuscatedName("client.hn")
    public static final int[] field460 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hy")
    public static String[] field358 = new String[8];

    @ObfuscatedName("client.hb")
    public static boolean[] field375 = new boolean[8];

    @ObfuscatedName("client.hc")
    public static int[] field376 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hd")
    public static int field377 = -1;

    @ObfuscatedName("client.hx")
    public static class189[][][] field378 = new class189[4][104][104];

    @ObfuscatedName("client.hl")
    public static class189 field265 = new class189();

    @ObfuscatedName("client.ho")
    public static class189 field355 = new class189();

    @ObfuscatedName("client.hi")
    public static class189 field430 = new class189();

    @ObfuscatedName("client.hs")
    public static int[] field382 = new int[25];

    @ObfuscatedName("client.hu")
    public static int[] field383 = new int[25];

    @ObfuscatedName("client.hj")
    public static int[] field282 = new int[25];

    @ObfuscatedName("client.hp")
    public static int field486 = 0;

    @ObfuscatedName("client.ih")
    public static boolean field386 = false;

    @ObfuscatedName("client.ii")
    public static int field387 = 0;

    @ObfuscatedName("client.ik")
    public static int[] field388 = new int[500];

    @ObfuscatedName("client.ig")
    public static int[] field426 = new int[500];

    @ObfuscatedName("client.ia")
    public static int[] field390 = new int[500];

    @ObfuscatedName("client.ip")
    public static int[] field391 = new int[500];

    @ObfuscatedName("client.iy")
    public static String[] field384 = new String[500];

    @ObfuscatedName("client.iu")
    public static String[] field411 = new String[500];

    @ObfuscatedName("client.im")
    public static int field431 = -1;

    @ObfuscatedName("client.ir")
    public static int field395 = -1;

    @ObfuscatedName("client.io")
    public static int field396 = 0;

    @ObfuscatedName("client.if")
    public static int field440 = 50;

    @ObfuscatedName("client.in")
    public static int field392 = 0;

    @ObfuscatedName("client.it")
    public static String field507 = null;

    @ObfuscatedName("client.is")
    public static boolean field400 = false;

    @ObfuscatedName("client.ja")
    public static int field401 = -1;

    @ObfuscatedName("client.jw")
    public static int field402 = -1;

    @ObfuscatedName("client.jf")
    public static String field403 = null;

    @ObfuscatedName("client.jk")
    public static String field243 = null;

    @ObfuscatedName("client.jn")
    public static int field405 = -1;

    @ObfuscatedName("client.jv")
    public static class186 field406 = new class186(8);

    @ObfuscatedName("client.jt")
    public static int field407 = 0;

    @ObfuscatedName("client.jd")
    public static int field408 = 0;

    @ObfuscatedName("client.jz")
    public static class164 field409 = null;

    @ObfuscatedName("client.ji")
    public static int field410 = 0;

    @ObfuscatedName("client.je")
    public static int field291 = 0;

    @ObfuscatedName("client.jp")
    public static int field412 = 0;

    @ObfuscatedName("client.jo")
    public static int field413 = -1;

    @ObfuscatedName("client.js")
    public static boolean field414 = false;

    @ObfuscatedName("client.jy")
    public static boolean field415 = false;

    @ObfuscatedName("client.ju")
    public static boolean field416 = false;

    @ObfuscatedName("client.jc")
    public static class164 field417 = null;

    @ObfuscatedName("client.jm")
    public static class164 field306 = null;

    @ObfuscatedName("client.jx")
    public static int field419 = 0;

    @ObfuscatedName("client.jb")
    public static int field420 = 0;

    @ObfuscatedName("client.jh")
    public static class164 field421 = null;

    @ObfuscatedName("client.jl")
    public static boolean field422 = false;

    @ObfuscatedName("client.jr")
    public static int field423 = -1;

    @ObfuscatedName("client.jq")
    public static int field335 = -1;

    @ObfuscatedName("client.kf")
    public static boolean field280 = false;

    @ObfuscatedName("client.ke")
    public static int field312 = -1;

    @ObfuscatedName("client.kw")
    public static int field427 = -1;

    @ObfuscatedName("client.kg")
    public static boolean field428 = false;

    @ObfuscatedName("client.ki")
    public static int field429 = 1;

    @ObfuscatedName("client.kl")
    public static int[] field349 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field341 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field297 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field433 = 0;

    @ObfuscatedName("client.kj")
    public static int[] field434 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field435 = 0;

    @ObfuscatedName("client.kc")
    public static int field436 = 0;

    @ObfuscatedName("client.kt")
    public static int field447 = 0;

    @ObfuscatedName("client.kr")
    public static int field438 = 0;

    @ObfuscatedName("client.ku")
    public static int field439 = 0;

    @ObfuscatedName("client.kv")
    public static int field437 = 0;

    @ObfuscatedName("client.ka")
    public static int field441 = 0;

    @ObfuscatedName("client.kp")
    public static int[] field442 = new int[2000];

    @ObfuscatedName("client.kd")
    public static String[] field443 = new String[1000];

    @ObfuscatedName("client.ld")
    public static int field444 = 0;

    @ObfuscatedName("client.ls")
    public static class189 field320 = new class189();

    @ObfuscatedName("client.li")
    public static class189 field446 = new class189();

    @ObfuscatedName("client.lm")
    public static class189 field292 = new class189();

    @ObfuscatedName("client.lh")
    public static class186 field394 = new class186(512);

    @ObfuscatedName("client.lp")
    public static int field449 = 0;

    @ObfuscatedName("client.lf")
    public static int field450 = -2;

    @ObfuscatedName("client.lx")
    public static boolean[] field451 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static boolean[] field452 = new boolean[100];

    @ObfuscatedName("client.la")
    public static boolean[] field425 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static int[] field454 = new int[100];

    @ObfuscatedName("client.lu")
    public static int[] field455 = new int[100];

    @ObfuscatedName("client.ll")
    public static int[] field456 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field457 = new int[100];

    @ObfuscatedName("client.le")
    public static int field458 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field478 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lo")
    public static int field272 = 0;

    @ObfuscatedName("client.ly")
    public static int field466 = 0;

    @ObfuscatedName("client.lc")
    public static String field462 = "";

    @ObfuscatedName("client.lq")
    public static long[] field463 = new long[100];

    @ObfuscatedName("client.lj")
    public static int field464 = 0;

    @ObfuscatedName("client.lk")
    public static int field424 = 0;

    @ObfuscatedName("client.mr")
    public static int[] field339 = new int[128];

    @ObfuscatedName("client.ml")
    public static int[] field467 = new int[128];

    @ObfuscatedName("client.mo")
    public static long field468 = -1L;

    @ObfuscatedName("client.mn")
    public static String field469 = null;

    @ObfuscatedName("client.ms")
    public static String field381 = null;

    @ObfuscatedName("client.mc")
    public static int field471 = -1;

    @ObfuscatedName("client.mw")
    public static int field472 = 0;

    @ObfuscatedName("client.mb")
    public static int[] field477 = new int[1000];

    @ObfuscatedName("client.me")
    public static int[] field474 = new int[1000];

    @ObfuscatedName("client.mg")
    public static class74[] field330 = new class74[1000];

    @ObfuscatedName("client.mm")
    public static int field476 = 0;

    @ObfuscatedName("client.mz")
    public static int field496 = 0;

    @ObfuscatedName("client.mx")
    public static int field503 = 0;

    @ObfuscatedName("client.mv")
    public static int field479 = 255;

    @ObfuscatedName("client.mt")
    public static int field250 = -1;

    @ObfuscatedName("client.mk")
    public static boolean field481 = false;

    @ObfuscatedName("client.ne")
    public static int field326 = 127;

    @ObfuscatedName("client.np")
    public static int field288 = 127;

    @ObfuscatedName("client.nb")
    public static int field484 = 0;

    @ObfuscatedName("client.nv")
    public static int[] field380 = new int[50];

    @ObfuscatedName("client.nx")
    public static int[] field287 = new int[50];

    @ObfuscatedName("client.ny")
    public static int[] field487 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field488 = new int[50];

    @ObfuscatedName("client.nl")
    public static class54[] field489 = new class54[50];

    @ObfuscatedName("client.nz")
    public static boolean field490 = false;

    @ObfuscatedName("client.om")
    public static boolean[] field491 = new boolean[5];

    @ObfuscatedName("client.of")
    public static int[] field492 = new int[5];

    @ObfuscatedName("client.ok")
    public static int[] field321 = new int[5];

    @ObfuscatedName("client.oz")
    public static int[] field494 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field483 = new int[5];

    @ObfuscatedName("client.oi")
    public static int field385 = 0;

    @ObfuscatedName("client.os")
    public static int field497 = 0;

    @ObfuscatedName("client.or")
    public static class17[] field498 = new class17[400];

    @ObfuscatedName("client.on")
    public static class185 field499 = new class185();

    @ObfuscatedName("client.oo")
    public static int field500 = 0;

    @ObfuscatedName("client.oh")
    public static class8[] field501 = new class8[400];

    @ObfuscatedName("client.oy")
    public static class169 field404 = new class169();

    @ObfuscatedName("client.ow")
    public static int field323 = -1;

    @ObfuscatedName("client.ov")
    public static int field504 = -1;

    @ObfuscatedName("client.oc")
    public static class210[] field372 = new class210[6];

    @ObfuscatedName("client.c(B)V")
    public final void method213() {
    }

    public final void init() {
        if (!this.method2691()) {
            return;
        }
        class180[] var1 = class180.method2618();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class180 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2898);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2898)) {
                    case 1:
                        field251 = Integer.parseInt(var4);
                        break;
                    case 2:
                        Statics.field1434 = var4;
                        break;
                    case 3:
                        field244 = Integer.parseInt(var4);
                        break;
                    case 4:
                        field245 = Integer.parseInt(var4);
                        break;
                    case 5:
                        Statics.field246 = class144.method1934(Integer.parseInt(var4));
                        break;
                    case 6:
                        if (var4.equalsIgnoreCase(class2.field28)) {
                        }
                        break;
                    case 7:
                        Statics.field27 = Integer.parseInt(var4);
                        break;
                    case 8:
                        field247 = Integer.parseInt(var4);
                    case 9:
                    case 10:
                    default:
                        break;
                    case 11:
                        Statics.field253 = Integer.parseInt(var4);
                        break;
                    case 12:
                        if (var4.equalsIgnoreCase(class2.field28)) {
                            field249 = true;
                        } else {
                            field249 = false;
                        }
                        break;
                    case 13:
                        Statics.field252 = var4;
                        break;
                    case 14:
                        class145[] var5 = new class145[] { class145.field2137, class145.field2138, class145.field2136, class145.field2135, class145.field2134, class145.field2139 };
                        Statics.field418 = (class145) class101.method510(var5, Integer.parseInt(var4));
                        if (Statics.field418 == class145.field2139) {
                            Statics.field1854 = class202.field2989;
                        } else {
                            Statics.field1854 = class202.field2987;
                        }
                }
            }
        }
        class81.field1334 = false;
        field241 = false;
        Statics.field606 = this.getCodeBase().getHost();
        String var6 = Statics.field246.field2127;
        byte var7 = 0;
        try {
            Statics.field2504 = 16;
            Statics.field2089 = var7;
            try {
                Statics.field1744 = System.getProperty("os.name");
            } catch (Exception var20) {
                Statics.field1744 = "Unknown";
            }
            Statics.field2566 = Statics.field1744.toLowerCase();
            try {
                Statics.field1254 = System.getProperty("user.home");
                if (Statics.field1254 != null) {
                    Statics.field1254 = Statics.field1254 + "/";
                }
            } catch (Exception var19) {
            }
            try {
                if (Statics.field2566.startsWith("win")) {
                    if (Statics.field1254 == null) {
                        Statics.field1254 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1254 == null) {
                    Statics.field1254 = System.getenv("HOME");
                }
                if (Statics.field1254 != null) {
                    Statics.field1254 = Statics.field1254 + "/";
                }
            } catch (Exception var18) {
            }
            if (Statics.field1254 == null) {
                Statics.field1254 = "~/";
            }
            Statics.field67 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1254, "/tmp/", "" };
            Statics.field2076 = new String[] { ".jagex_cache_" + Statics.field2089, ".file_store_" + Statics.field2089 };
            label118: for (int var11 = 0; var11 < 4; var11++) {
                Statics.field197 = class141.method791("oldschool", var6, var11);
                if (!Statics.field197.exists()) {
                    Statics.field197.mkdirs();
                }
                File[] var12 = Statics.field197.listFiles();
                if (var12 == null) {
                    break;
                }
                File[] var13 = var12;
                int var14 = 0;
                while (true) {
                    if (var14 >= var13.length) {
                        break label118;
                    }
                    File var15 = var13[var14];
                    if (!Statics.method566(var15, false)) {
                        break;
                    }
                    var14++;
                }
            }
            class127.method2541(Statics.field197);
            class141.method901();
            class141.field2093 = new class218(new class217(class127.method3036("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class141.field2094 = new class218(new class217(class127.method3036("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2043 = new class218[Statics.field2504];
            for (int var16 = 0; var16 < Statics.field2504; var16++) {
                Statics.field2043[var16] = new class218(new class217(class127.method3036("main_file_cache.idx" + var16), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var21) {
            class140.method2555((String) null, var21);
        }
        Statics.field242 = this;
        this.method2689(765, 503, 78);
    }

    @ObfuscatedName("client.w(I)V")
    public final void method216() {
        Statics.field152 = field247 == 0 ? 43594 : field244 + 40000;
        Statics.field705 = field247 == 0 ? 443 : field244 + 50000;
        Statics.field1558 = Statics.field152;
        Statics.field1884 = class165.field2749;
        Statics.field1269 = class165.field2741;
        Statics.field30 = class165.field2742;
        Statics.field1248 = class165.field2740;
        class129.method2430();
        Canvas var1 = Statics.field2498;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class129.field1970);
        var1.addFocusListener(class129.field1970);
        class132.method195(Statics.field2498);
        class137 var2;
        try {
            var2 = new class137();
        } catch (Throwable var15) {
            var2 = null;
        }
        Statics.field183 = var2;
        if (Statics.field183 != null) {
            Statics.field183.method2520(Statics.field2498);
        }
        Statics.field558 = new class126(255, class141.field2093, class141.field2094, 500000);
        class217 var4 = null;
        class9 var5 = new class9();
        try {
            var4 = class141.method1114("", Statics.field418.field2140, false);
            byte[] var6 = new byte[(int) var4.method3653()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method3656(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class9(new class111(var6));
        } catch (Exception var16) {
        }
        try {
            if (var4 != null) {
                var4.method3643();
            }
        } catch (Exception var14) {
        }
        Statics.field1806 = var5;
        Statics.field2030 = this.getToolkit().getSystemClipboard();
        String var13 = Statics.field2123;
        class130.field1995 = this;
        class130.field1985 = var13;
        if (field247 != 0) {
            field262 = true;
        }
    }

    @ObfuscatedName("client.i(I)V")
    public final void method217() {
        field256++;
        this.method220();
        while (true) {
            class189 var1 = class161.field2574;
            class160 var2;
            synchronized (class161.field2574) {
                var2 = (class160) class161.field2575.method3393();
            }
            if (var2 == null) {
                class173.method127();
                method2007();
                class129 var4 = class129.field1970;
                synchronized (class129.field1970) {
                    class129.field1980++;
                    class129.field1983 = class129.field1979;
                    class129.field1952 = 0;
                    if (class129.field1972 >= 0) {
                        while (class129.field1972 != class129.field1971) {
                            int var6 = class129.field1954[class129.field1971];
                            class129.field1971 = class129.field1971 + 1 & 0x7F;
                            if (var6 < 0) {
                                class129.field1969[~var6] = false;
                            } else {
                                if (!class129.field1969[var6] && class129.field1952 < class129.field1977.length - 1) {
                                    class129.field1977[++class129.field1952 - 1] = var6;
                                }
                                class129.field1969[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class129.field1969[var5] = false;
                        }
                        class129.field1972 = class129.field1971;
                    }
                    class129.field1979 = class129.field1978;
                }
                class132.method1933();
                if (Statics.field183 != null) {
                    int var8 = Statics.field183.method2514();
                    field444 = var8;
                }
                if (field254 == 0) {
                    method662();
                    Statics.field878.method2532();
                    for (int var9 = 0; var9 < 32; var9++) {
                        field2058[var9] = 0L;
                    }
                    for (int var10 = 0; var10 < 32; var10++) {
                        field2050[var10] = 0L;
                    }
                    Statics.field1261 = 0;
                } else if (field254 == 5) {
                    class30.method572(this);
                    method662();
                    Statics.field878.method2532();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field2058[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field2050[var12] = 0L;
                    }
                    Statics.field1261 = 0;
                } else if (field254 == 10 || field254 == 11) {
                    class30.method572(this);
                } else if (field254 == 20) {
                    class30.method572(this);
                    method3179();
                } else if (field254 == 25) {
                    method115();
                }
                if (field254 == 30) {
                    if (field263 > 1) {
                        field263--;
                    }
                    if (field293 > 0) {
                        field293--;
                    }
                    if (field295) {
                        field295 = false;
                        method644();
                    } else {
                        if (!field386) {
                            field384[0] = class148.field2396;
                            field411[0] = "";
                            field390[0] = 1006;
                            field387 = 1;
                        }
                        for (int var13 = 0; var13 < 100 && method19(); var13++) {
                        }
                        if (field254 == 30) {
                            while (true) {
                                class200 var14 = (class200) class201.field2982.method3412();
                                boolean var15;
                                if (var14 == null) {
                                    var15 = false;
                                } else {
                                    var15 = true;
                                }
                                if (!var15) {
                                    Object var17 = Statics.field228.field169;
                                    synchronized (Statics.field228.field169) {
                                        if (!field393) {
                                            Statics.field228.field170 = 0;
                                        } else if (class132.field2013 != 0 || Statics.field228.field170 >= 40) {
                                            field475.method2438(204);
                                            field475.method2366(0);
                                            int var18 = field475.field1834;
                                            int var19 = 0;
                                            for (int var20 = 0; var20 < Statics.field228.field170 && field475.field1834 - var18 < 240; var20++) {
                                                var19++;
                                                int var21 = Statics.field228.field173[var20];
                                                if (var21 < 0) {
                                                    var21 = 0;
                                                } else if (var21 > 502) {
                                                    var21 = 502;
                                                }
                                                int var22 = Statics.field228.field175[var20];
                                                if (var22 < 0) {
                                                    var22 = 0;
                                                } else if (var22 > 764) {
                                                    var22 = 764;
                                                }
                                                int var23 = var21 * 765 + var22;
                                                if (Statics.field228.field173[var20] == -1 && Statics.field228.field175[var20] == -1) {
                                                    var22 = -1;
                                                    var21 = -1;
                                                    var23 = 524287;
                                                }
                                                if (field453 != var22 || field259 != var21) {
                                                    int var24 = var22 - field453;
                                                    field453 = var22;
                                                    int var25 = var21 - field259;
                                                    field259 = var21;
                                                    if (field260 < 8 && var24 >= -32 && var24 <= 31 && var25 >= -32 && var25 <= 31) {
                                                        var24 += 32;
                                                        var25 += 32;
                                                        field475.method2190((field260 << 12) + (var24 << 6) + var25);
                                                        field260 = 0;
                                                    } else if (field260 < 8) {
                                                        field475.method2163((field260 << 19) + 8388608 + var23);
                                                        field260 = 0;
                                                    } else {
                                                        field475.method2229((field260 << 19) + -1073741824 + var23);
                                                        field260 = 0;
                                                    }
                                                } else if (field260 < 2047) {
                                                    field260++;
                                                }
                                            }
                                            field475.method2211(field475.field1834 - var18);
                                            if (var19 >= Statics.field228.field170) {
                                                Statics.field228.field170 = 0;
                                            } else {
                                                Statics.field228.field170 -= var19;
                                                for (int var26 = 0; var26 < Statics.field228.field170; var26++) {
                                                    Statics.field228.field175[var26] = Statics.field228.field175[var19 + var26];
                                                    Statics.field228.field173[var26] = Statics.field228.field173[var19 + var26];
                                                }
                                            }
                                        }
                                    }
                                    if (class132.field2013 == 1 || !Statics.field517 && class132.field2013 == 4 || class132.field2013 == 2) {
                                        long var28 = (class132.field2010 - field342) / 50L;
                                        if (var28 > 4095L) {
                                            var28 = 4095L;
                                        }
                                        field342 = class132.field2010;
                                        int var30 = class132.field2006;
                                        if (var30 < 0) {
                                            var30 = 0;
                                        } else if (var30 > 502) {
                                            var30 = 502;
                                        }
                                        int var31 = class132.field2014;
                                        if (var31 < 0) {
                                            var31 = 0;
                                        } else if (var31 > 764) {
                                            var31 = 764;
                                        }
                                        int var32 = var30 * 765 + var31;
                                        byte var33 = 0;
                                        if (class132.field2013 == 2) {
                                            var33 = 1;
                                        }
                                        int var34 = (int) var28;
                                        field475.method2438(20);
                                        field475.method2229((var33 << 19) + (var34 << 20) + var32);
                                    }
                                    if (class129.field1952 > 0) {
                                        field475.method2438(28);
                                        field475.method2190(0);
                                        int var35 = field475.field1834;
                                        long var36 = class107.method635();
                                        for (int var38 = 0; var38 < class129.field1952; var38++) {
                                            long var39 = var36 - field468;
                                            if (var39 > 16777215L) {
                                                var39 = 16777215L;
                                            }
                                            field468 = var36;
                                            field475.method2200(class129.field1977[var38]);
                                            field475.method2213((int) var39);
                                        }
                                        field475.method2172(field475.field1834 - var35);
                                    }
                                    if (field459 > 0) {
                                        field459--;
                                    }
                                    if (class129.field1969[96] || class129.field1969[97] || class129.field1969[98] || class129.field1969[99]) {
                                        field445 = true;
                                    }
                                    if (field445 && field459 <= 0) {
                                        field459 = 20;
                                        field445 = false;
                                        field475.method2438(3);
                                        field475.method2342(field328);
                                        field475.method2190(field327);
                                    }
                                    if (Statics.field1403 && !field261) {
                                        field261 = true;
                                        field475.method2438(78);
                                        field475.method2366(1);
                                    }
                                    if (!Statics.field1403 && field261) {
                                        field261 = false;
                                        field475.method2438(78);
                                        field475.method2366(0);
                                    }
                                    if (field241 && Statics.field2842 != field298) {
                                        method38(Statics.field1268, Statics.field2913, Statics.field2842, Statics.field3024.field776[0], Statics.field3024.field723[0]);
                                    } else if (Statics.field2842 != field471) {
                                        field471 = Statics.field2842;
                                        method1460(Statics.field2842);
                                    }
                                    if (field254 == 30) {
                                        method198();
                                        method590();
                                        field359++;
                                        if (field359 > 750) {
                                            method644();
                                        } else {
                                            method616();
                                            for (int var41 = 0; var41 < field283; var41++) {
                                                int var42 = field284[var41];
                                                class32 var43 = field397[var42];
                                                if (var43 != null) {
                                                    Statics.method547(var43, var43.field691.field796);
                                                }
                                            }
                                            for (int var44 = -1; var44 < field364; var44++) {
                                                int var45;
                                                if (var44 == -1) {
                                                    var45 = 2047;
                                                } else {
                                                    var45 = field365[var44];
                                                }
                                                class3 var46 = field363[var45];
                                                if (var46 != null && var46.field737 > 0) {
                                                    var46.field737--;
                                                    if (var46.field737 == 0) {
                                                        var46.field736 = null;
                                                    }
                                                }
                                            }
                                            for (int var47 = 0; var47 < field283; var47++) {
                                                int var48 = field284[var47];
                                                class32 var49 = field397[var48];
                                                if (var49 != null && var49.field737 > 0) {
                                                    var49.field737--;
                                                    if (var49.field737 == 0) {
                                                        var49.field736 = null;
                                                    }
                                                }
                                            }
                                            field398++;
                                            if (field353 != 0) {
                                                field352 += 20;
                                                if (field352 >= 400) {
                                                    field353 = 0;
                                                }
                                            }
                                            if (Statics.field1819 != null) {
                                                field354++;
                                                if (field354 >= 15) {
                                                    method2384(Statics.field1819);
                                                    Statics.field1819 = null;
                                                }
                                            }
                                            class164 var50 = Statics.field2762;
                                            class164 var51 = Statics.field933;
                                            Statics.field2762 = null;
                                            Statics.field933 = null;
                                            field421 = null;
                                            field280 = false;
                                            field422 = false;
                                            field424 = 0;
                                            while (true) {
                                                while (class129.method1906() && field424 < 128) {
                                                    if (field412 >= 2 && class129.field1969[82] && Statics.field222 == 66) {
                                                        String var52 = class11.method2014();
                                                        Statics.field2030.setContents(new StringSelection(var52), (ClipboardOwner) null);
                                                    } else {
                                                        field467[field424] = Statics.field222;
                                                        field339[field424] = Statics.field553;
                                                        field424++;
                                                    }
                                                }
                                                int var53 = field405;
                                                if (class164.method2116(var53)) {
                                                    method538(Statics.field2711[var53], -1, 0, 0, 765, 503, 0, 0);
                                                }
                                                field429++;
                                                while (true) {
                                                    class1 var54;
                                                    class164 var55;
                                                    class164 var56;
                                                    do {
                                                        var54 = (class1) field446.method3393();
                                                        if (var54 == null) {
                                                            while (true) {
                                                                class1 var57;
                                                                class164 var58;
                                                                class164 var59;
                                                                do {
                                                                    var57 = (class1) field292.method3393();
                                                                    if (var57 == null) {
                                                                        while (true) {
                                                                            class1 var60;
                                                                            class164 var61;
                                                                            class164 var62;
                                                                            do {
                                                                                var60 = (class1) field320.method3393();
                                                                                if (var60 == null) {
                                                                                    Statics.method2780();
                                                                                    if (Statics.field55 == null && field417 == null) {
                                                                                        int var63 = class132.field2013;
                                                                                        if (field386) {
                                                                                            if (var63 != 1 && (Statics.field517 || var63 != 4)) {
                                                                                                int var64 = class132.field2007;
                                                                                                int var65 = class132.field2008;
                                                                                                if (var64 < Statics.field556 - 10 || var64 > Statics.field556 + Statics.field1907 + 10 || var65 < Statics.field12 - 10 || var65 > Statics.field608 + Statics.field12 + 10) {
                                                                                                    field386 = false;
                                                                                                    method500(Statics.field556, Statics.field12, Statics.field1907, Statics.field608);
                                                                                                }
                                                                                            }
                                                                                            if (var63 == 1 || !Statics.field517 && var63 == 4) {
                                                                                                int var66 = Statics.field556;
                                                                                                int var67 = Statics.field12;
                                                                                                int var68 = Statics.field1907;
                                                                                                int var69 = class132.field2014;
                                                                                                int var70 = class132.field2006;
                                                                                                int var71 = -1;
                                                                                                for (int var72 = 0; var72 < field387; var72++) {
                                                                                                    int var73 = (field387 - 1 - var72) * 15 + var67 + 31;
                                                                                                    if (var69 > var66 && var69 < var66 + var68 && var70 > var73 - 13 && var70 < var73 + 3) {
                                                                                                        var71 = var72;
                                                                                                    }
                                                                                                }
                                                                                                if (var71 != -1 && var71 >= 0) {
                                                                                                    int var74 = field388[var71];
                                                                                                    int var75 = field426[var71];
                                                                                                    int var76 = field390[var71];
                                                                                                    int var77 = field391[var71];
                                                                                                    String var78 = field384[var71];
                                                                                                    String var79 = field411[var71];
                                                                                                    method1363(var74, var75, var76, var77, var78, var79, class132.field2014, class132.field2006);
                                                                                                }
                                                                                                field386 = false;
                                                                                                method500(Statics.field556, Statics.field12, Statics.field1907, Statics.field608);
                                                                                            }
                                                                                        } else {
                                                                                            label1252: {
                                                                                                int var81;
                                                                                                int var82;
                                                                                                label1296: {
                                                                                                    if ((var63 == 1 || !Statics.field517 && var63 == 4) && field387 > 0) {
                                                                                                        int var80 = field390[field387 - 1];
                                                                                                        if (var80 == 39 || var80 == 40 || var80 == 41 || var80 == 42 || var80 == 43 || var80 == 33 || var80 == 34 || var80 == 35 || var80 == 36 || var80 == 37 || var80 == 38 || var80 == 1005) {
                                                                                                            var81 = field388[field387 - 1];
                                                                                                            var82 = field426[field387 - 1];
                                                                                                            class164 var83 = class164.method128(var82);
                                                                                                            int var84 = method191(var83);
                                                                                                            boolean var85 = (var84 >> 28 & 0x1) != 0;
                                                                                                            if (var85) {
                                                                                                                break label1296;
                                                                                                            }
                                                                                                            class168 var10000 = (class168) null;
                                                                                                            if (class168.method3022(method191(var83))) {
                                                                                                                break label1296;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if ((var63 == 1 || !Statics.field517 && var63 == 4) && (field486 == 1 && field387 > 2 || method125(field387 - 1))) {
                                                                                                        var63 = 2;
                                                                                                    }
                                                                                                    if ((var63 == 1 || !Statics.field517 && var63 == 4) && field387 > 0) {
                                                                                                        int var89 = field387 - 1;
                                                                                                        if (var89 >= 0) {
                                                                                                            int var90 = field388[var89];
                                                                                                            int var91 = field426[var89];
                                                                                                            int var92 = field390[var89];
                                                                                                            int var93 = field391[var89];
                                                                                                            String var94 = field384[var89];
                                                                                                            String var95 = field411[var89];
                                                                                                            method1363(var90, var91, var92, var93, var94, var95, class132.field2014, class132.field2006);
                                                                                                        }
                                                                                                    }
                                                                                                    if (var63 == 2 && field387 > 0) {
                                                                                                        method2010(class132.field2014, class132.field2006);
                                                                                                    }
                                                                                                    break label1252;
                                                                                                }
                                                                                                if (Statics.field55 != null && !field360 && field486 != 1 && !method125(field387 - 1) && field387 > 0) {
                                                                                                    int var86 = field357;
                                                                                                    int var87 = field373;
                                                                                                    Statics.method573(Statics.field906, var86, var87);
                                                                                                    Statics.field906 = null;
                                                                                                }
                                                                                                field360 = false;
                                                                                                field361 = 0;
                                                                                                if (Statics.field55 != null) {
                                                                                                    method2384(Statics.field55);
                                                                                                }
                                                                                                Statics.field55 = class164.method128(var82);
                                                                                                field356 = var81;
                                                                                                field357 = class132.field2014;
                                                                                                field373 = class132.field2006;
                                                                                                if (field387 > 0) {
                                                                                                    int var88 = field387 - 1;
                                                                                                    Statics.field906 = new class29();
                                                                                                    Statics.field906.field642 = field388[var88];
                                                                                                    Statics.field906.field634 = field426[var88];
                                                                                                    Statics.field906.field636 = field390[var88];
                                                                                                    Statics.field906.field638 = field391[var88];
                                                                                                    Statics.field906.field635 = field384[var88];
                                                                                                }
                                                                                                method2384(Statics.field55);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (field417 != null) {
                                                                                        method1450();
                                                                                    }
                                                                                    if (Statics.field55 != null) {
                                                                                        method2384(Statics.field55);
                                                                                        field361++;
                                                                                        if (class132.field2016 == 0) {
                                                                                            if (field360) {
                                                                                                if (Statics.field55 == Statics.field213 && field356 != field281) {
                                                                                                    class164 var96 = Statics.field55;
                                                                                                    byte var97 = 0;
                                                                                                    if (field408 == 1 && var96.field2612 == 206) {
                                                                                                        var97 = 1;
                                                                                                    }
                                                                                                    if (var96.field2723[field281] <= 0) {
                                                                                                        var97 = 0;
                                                                                                    }
                                                                                                    if (class168.method3022(method191(var96))) {
                                                                                                        int var98 = field356;
                                                                                                        int var99 = field281;
                                                                                                        var96.field2723[var99] = var96.field2723[var98];
                                                                                                        var96.field2724[var99] = var96.field2724[var98];
                                                                                                        var96.field2723[var98] = -1;
                                                                                                        var96.field2724[var98] = 0;
                                                                                                    } else if (var97 == 1) {
                                                                                                        int var100 = field356;
                                                                                                        int var101 = field281;
                                                                                                        while (var100 != var101) {
                                                                                                            if (var100 > var101) {
                                                                                                                var96.method2975(var100 - 1, var100);
                                                                                                                var100--;
                                                                                                            } else if (var100 < var101) {
                                                                                                                var96.method2975(var100 + 1, var100);
                                                                                                                var100++;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        var96.method2975(field281, field356);
                                                                                                    }
                                                                                                    field475.method2438(54);
                                                                                                    field475.method2342(field356);
                                                                                                    field475.method2366(var97);
                                                                                                    field475.method2342(field281);
                                                                                                    field475.method2161(Statics.field55.field2618);
                                                                                                }
                                                                                            } else if ((field486 == 1 || method125(field387 - 1)) && field387 > 2) {
                                                                                                method2010(field357, field373);
                                                                                            } else if (field387 > 0) {
                                                                                                int var102 = field357;
                                                                                                int var103 = field373;
                                                                                                Statics.method573(Statics.field906, var102, var103);
                                                                                                Statics.field906 = null;
                                                                                            }
                                                                                            field354 = 10;
                                                                                            class132.field2013 = 0;
                                                                                            Statics.field55 = null;
                                                                                        } else if (field361 >= 5 && (class132.field2007 > field357 + 5 || class132.field2007 < field357 - 5 || class132.field2008 > field373 + 5 || class132.field2008 < field373 - 5)) {
                                                                                            field360 = true;
                                                                                        }
                                                                                    }
                                                                                    if (class81.field1364 != -1) {
                                                                                        int var104 = class81.field1364;
                                                                                        int var105 = class81.field1365;
                                                                                        field475.method2438(84);
                                                                                        field475.method2366(5);
                                                                                        field475.method2208(Statics.field1653 + var105);
                                                                                        field475.method2200(class129.field1969[82] ? (class129.field1969[81] ? 2 : 1) : 0);
                                                                                        field475.method2190(Statics.field545 + var104);
                                                                                        class81.field1364 = -1;
                                                                                        field267 = class132.field2014;
                                                                                        field351 = class132.field2006;
                                                                                        field353 = 1;
                                                                                        field352 = 0;
                                                                                        field476 = var104;
                                                                                        field496 = var105;
                                                                                    }
                                                                                    if (Statics.field2762 != var50) {
                                                                                        if (var50 != null) {
                                                                                            method2384(var50);
                                                                                        }
                                                                                        if (Statics.field2762 != null) {
                                                                                            method2384(Statics.field2762);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field933 != var51 && field440 == field396) {
                                                                                        if (var51 != null) {
                                                                                            method2384(var51);
                                                                                        }
                                                                                        if (Statics.field933 != null) {
                                                                                            method2384(Statics.field933);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field933 == null) {
                                                                                        if (field396 > 0) {
                                                                                            field396--;
                                                                                        }
                                                                                    } else if (field396 < field440) {
                                                                                        field396++;
                                                                                        if (field440 == field396) {
                                                                                            method2384(Statics.field933);
                                                                                        }
                                                                                    }
                                                                                    int var106 = field308 + Statics.field3024.field767;
                                                                                    int var107 = field310 + Statics.field3024.field722;
                                                                                    if (Statics.field1833 - var106 < -500 || Statics.field1833 - var106 > 500 || Statics.field631 - var107 < -500 || Statics.field631 - var107 > 500) {
                                                                                        Statics.field1833 = var106;
                                                                                        Statics.field631 = var107;
                                                                                    }
                                                                                    if (Statics.field1833 != var106) {
                                                                                        Statics.field1833 += (var106 - Statics.field1833) / 16;
                                                                                    }
                                                                                    if (Statics.field631 != var107) {
                                                                                        Statics.field631 += (var107 - Statics.field631) / 16;
                                                                                    }
                                                                                    if (class132.field2016 == 4 && Statics.field517) {
                                                                                        int var108 = class132.field2008 - field332;
                                                                                        field493 = var108 * 2;
                                                                                        field332 = var108 == -1 || var108 == 1 ? class132.field2008 : (field332 + class132.field2008) / 2;
                                                                                        int var109 = field331 - class132.field2007;
                                                                                        field313 = var109 * 2;
                                                                                        field331 = var109 == -1 || var109 == 1 ? class132.field2007 : (field331 + class132.field2007) / 2;
                                                                                    } else {
                                                                                        if (class129.field1969[96]) {
                                                                                            field313 += (-24 - field313) / 2;
                                                                                        } else if (class129.field1969[97]) {
                                                                                            field313 += (24 - field313) / 2;
                                                                                        } else {
                                                                                            field313 /= 2;
                                                                                        }
                                                                                        if (class129.field1969[98]) {
                                                                                            field493 += (12 - field493) / 2;
                                                                                        } else if (class129.field1969[99]) {
                                                                                            field493 += (-12 - field493) / 2;
                                                                                        } else {
                                                                                            field493 /= 2;
                                                                                        }
                                                                                        field332 = class132.field2008;
                                                                                        field331 = class132.field2007;
                                                                                    }
                                                                                    field328 = field313 / 2 + field328 & 0x7FF;
                                                                                    field327 += field493 / 2;
                                                                                    if (field327 < 128) {
                                                                                        field327 = 128;
                                                                                    }
                                                                                    if (field327 > 383) {
                                                                                        field327 = 383;
                                                                                    }
                                                                                    int var110 = Statics.field1833 >> 7;
                                                                                    int var111 = Statics.field631 >> 7;
                                                                                    int var112 = method2008(Statics.field1833, Statics.field631, Statics.field2842);
                                                                                    int var113 = 0;
                                                                                    if (var110 > 3 && var111 > 3 && var110 < 100 && var111 < 100) {
                                                                                        for (int var114 = var110 - 4; var114 <= var110 + 4; var114++) {
                                                                                            for (int var115 = var111 - 4; var115 <= var111 + 4; var115++) {
                                                                                                int var116 = Statics.field2842;
                                                                                                if (var116 < 3 && (class6.field70[1][var114][var115] & 0x2) == 2) {
                                                                                                    var116++;
                                                                                                }
                                                                                                int var117 = var112 - class6.field78[var116][var114][var115];
                                                                                                if (var117 > var113) {
                                                                                                    var113 = var117;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    int var118 = var113 * 192;
                                                                                    if (var118 > 98048) {
                                                                                        var118 = 98048;
                                                                                    }
                                                                                    if (var118 < 32768) {
                                                                                        var118 = 32768;
                                                                                    }
                                                                                    if (var118 > field316) {
                                                                                        field316 += (var118 - field316) / 24;
                                                                                    } else if (var118 < field316) {
                                                                                        field316 += (var118 - field316) / 80;
                                                                                    }
                                                                                    if (field490) {
                                                                                        int var119 = Statics.field519 * 128 + 64;
                                                                                        int var120 = Statics.field1807 * 128 + 64;
                                                                                        int var121 = method2008(var119, var120, Statics.field2842) - Statics.field577;
                                                                                        if (Statics.field2496 < var119) {
                                                                                            Statics.field2496 += Statics.field1474 * (var119 - Statics.field2496) / 1000 + Statics.field239;
                                                                                            if (Statics.field2496 > var119) {
                                                                                                Statics.field2496 = var119;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field2496 > var119) {
                                                                                            Statics.field2496 -= Statics.field1474 * (Statics.field2496 - var119) / 1000 + Statics.field239;
                                                                                            if (Statics.field2496 < var119) {
                                                                                                Statics.field2496 = var119;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field2493 < var121) {
                                                                                            Statics.field2493 += Statics.field1474 * (var121 - Statics.field2493) / 1000 + Statics.field239;
                                                                                            if (Statics.field2493 > var121) {
                                                                                                Statics.field2493 = var121;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field2493 > var121) {
                                                                                            Statics.field2493 -= Statics.field1474 * (Statics.field2493 - var121) / 1000 + Statics.field239;
                                                                                            if (Statics.field2493 < var121) {
                                                                                                Statics.field2493 = var121;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field11 < var120) {
                                                                                            Statics.field11 += Statics.field1474 * (var120 - Statics.field11) / 1000 + Statics.field239;
                                                                                            if (Statics.field11 > var120) {
                                                                                                Statics.field11 = var120;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field11 > var120) {
                                                                                            Statics.field11 -= Statics.field1474 * (Statics.field11 - var120) / 1000 + Statics.field239;
                                                                                            if (Statics.field11 < var120) {
                                                                                                Statics.field11 = var120;
                                                                                            }
                                                                                        }
                                                                                        int var122 = Statics.field2046 * 128 + 64;
                                                                                        int var123 = Statics.field1647 * 128 + 64;
                                                                                        int var124 = method2008(var122, var123, Statics.field2842) - Statics.field1993;
                                                                                        int var125 = var122 - Statics.field2496;
                                                                                        int var126 = var124 - Statics.field2493;
                                                                                        int var127 = var123 - Statics.field11;
                                                                                        int var128 = (int) Math.sqrt((double) (var125 * var125 + var127 * var127));
                                                                                        int var129 = (int) (Math.atan2((double) var126, (double) var128) * 325.949D) & 0x7FF;
                                                                                        int var130 = (int) (Math.atan2((double) var125, (double) var127) * -325.949D) & 0x7FF;
                                                                                        if (var129 < 128) {
                                                                                            var129 = 128;
                                                                                        }
                                                                                        if (var129 > 383) {
                                                                                            var129 = 383;
                                                                                        }
                                                                                        if (Statics.field177 < var129) {
                                                                                            Statics.field177 += Statics.field1559 * (var129 - Statics.field177) / 1000 + Statics.field2569;
                                                                                            if (Statics.field177 > var129) {
                                                                                                Statics.field177 = var129;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field177 > var129) {
                                                                                            Statics.field177 -= Statics.field1559 * (Statics.field177 - var129) / 1000 + Statics.field2569;
                                                                                            if (Statics.field177 < var129) {
                                                                                                Statics.field177 = var129;
                                                                                            }
                                                                                        }
                                                                                        int var131 = var130 - Statics.field2449;
                                                                                        if (var131 > 1024) {
                                                                                            var131 -= 2048;
                                                                                        }
                                                                                        if (var131 < -1024) {
                                                                                            var131 += 2048;
                                                                                        }
                                                                                        if (var131 > 0) {
                                                                                            Statics.field2449 += Statics.field1559 * var131 / 1000 + Statics.field2569;
                                                                                            Statics.field2449 &= 0x7FF;
                                                                                        }
                                                                                        if (var131 < 0) {
                                                                                            Statics.field2449 -= Statics.field1559 * -var131 / 1000 + Statics.field2569;
                                                                                            Statics.field2449 &= 0x7FF;
                                                                                        }
                                                                                        int var132 = var130 - Statics.field2449;
                                                                                        if (var132 > 1024) {
                                                                                            var132 -= 2048;
                                                                                        }
                                                                                        if (var132 < -1024) {
                                                                                            var132 += 2048;
                                                                                        }
                                                                                        if (var132 < 0 && var131 > 0 || var132 > 0 && var131 < 0) {
                                                                                            Statics.field2449 = var130;
                                                                                        }
                                                                                    }
                                                                                    for (int var133 = 0; var133 < 5; var133++) {
                                                                                        int var10002 = field483[var133]++;
                                                                                    }
                                                                                    int var134 = class132.method3();
                                                                                    int var135 = class129.field1980;
                                                                                    if (var134 > 15000 && var135 > 15000) {
                                                                                        field293 = 250;
                                                                                        class132.method2088(14500);
                                                                                        field475.method2438(237);
                                                                                    }
                                                                                    field314++;
                                                                                    if (field314 > 500) {
                                                                                        field314 = 0;
                                                                                        int var137 = (int) (Math.random() * 8.0D);
                                                                                        if ((var137 & 0x1) == 1) {
                                                                                            field308 += field309;
                                                                                        }
                                                                                        if ((var137 & 0x2) == 2) {
                                                                                            field310 += field311;
                                                                                        }
                                                                                        if ((var137 & 0x4) == 4) {
                                                                                            field495 += field334;
                                                                                        }
                                                                                    }
                                                                                    if (field308 < -50) {
                                                                                        field309 = 2;
                                                                                    }
                                                                                    if (field308 > 50) {
                                                                                        field309 = -2;
                                                                                    }
                                                                                    if (field310 < -55) {
                                                                                        field311 = 2;
                                                                                    }
                                                                                    if (field310 > 55) {
                                                                                        field311 = -2;
                                                                                    }
                                                                                    if (field495 < -40) {
                                                                                        field334 = 1;
                                                                                    }
                                                                                    if (field495 > 40) {
                                                                                        field334 = -1;
                                                                                    }
                                                                                    field319++;
                                                                                    if (field319 > 500) {
                                                                                        field319 = 0;
                                                                                        int var138 = (int) (Math.random() * 8.0D);
                                                                                        if ((var138 & 0x1) == 1) {
                                                                                            field315 += field470;
                                                                                        }
                                                                                        if ((var138 & 0x2) == 2) {
                                                                                            field279 += field318;
                                                                                        }
                                                                                    }
                                                                                    if (field315 < -60) {
                                                                                        field470 = 2;
                                                                                    }
                                                                                    if (field315 > 60) {
                                                                                        field470 = -2;
                                                                                    }
                                                                                    if (field279 < -20) {
                                                                                        field318 = 1;
                                                                                    }
                                                                                    if (field279 > 10) {
                                                                                        field318 = -1;
                                                                                    }
                                                                                    for (class36 var139 = (class36) field499.method3329(); var139 != null; var139 = (class36) field499.method3327()) {
                                                                                        if ((long) var139.field788 < class107.method635() / 1000L - 5L) {
                                                                                            if (var139.field789 > 0) {
                                                                                                class11.method35(5, "", var139.field785 + class148.field2373);
                                                                                            }
                                                                                            if (var139.field789 == 0) {
                                                                                                class11.method35(5, "", var139.field785 + class148.field2308);
                                                                                            }
                                                                                            var139.method3458();
                                                                                        }
                                                                                    }
                                                                                    field465++;
                                                                                    if (field465 > 50) {
                                                                                        field475.method2438(94);
                                                                                    }
                                                                                    try {
                                                                                        if (Statics.field285 != null && field475.field1834 > 0) {
                                                                                            Statics.field285.method2663(field475.field1835, 0, field475.field1834);
                                                                                            field475.field1834 = 0;
                                                                                            field465 = 0;
                                                                                            return;
                                                                                        }
                                                                                    } catch (IOException var141) {
                                                                                        method644();
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                var61 = var60.field3;
                                                                                if (var61.field2619 < 0) {
                                                                                    break;
                                                                                }
                                                                                var62 = class164.method128(var61.field2629);
                                                                            } while (var62 == null || var62.field2729 == null || var61.field2619 >= var62.field2729.length || var62.field2729[var61.field2619] != var61);
                                                                            Statics.method562(var60);
                                                                        }
                                                                    }
                                                                    var58 = var57.field3;
                                                                    if (var58.field2619 < 0) {
                                                                        break;
                                                                    }
                                                                    var59 = class164.method128(var58.field2629);
                                                                } while (var59 == null || var59.field2729 == null || var58.field2619 >= var59.field2729.length || var59.field2729[var58.field2619] != var58);
                                                                Statics.method562(var57);
                                                            }
                                                        }
                                                        var55 = var54.field3;
                                                        if (var55.field2619 < 0) {
                                                            break;
                                                        }
                                                        var56 = class164.method128(var55.field2629);
                                                    } while (var56 == null || var56.field2729 == null || var55.field2619 >= var56.field2729.length || var56.field2729[var55.field2619] != var55);
                                                    Statics.method562(var54);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                field475.method2438(82);
                                field475.method2366(0);
                                int var16 = field475.field1834;
                                class201.method564(field475);
                                field475.method2211(field475.field1834 - var16);
                            }
                        }
                    }
                } else if (field254 == 40 || field254 == 45) {
                    method3179();
                }
                return;
            }
            var2.field2567.method2922(var2.field2564, (int) var2.field2963, var2.field2565, false);
        }
    }

    @ObfuscatedName("client.r(I)V")
    public final void method393() {
        boolean var1;
        label275: {
            try {
                if (class173.field2799 == 2) {
                    if (Statics.field1926 == null) {
                        Statics.field1926 = class170.method3079(Statics.field2800, Statics.field2896, Statics.field2801);
                        if (Statics.field1926 == null) {
                            var1 = false;
                            break label275;
                        }
                    }
                    if (Statics.field2448 == null) {
                        Statics.field2448 = new class55(Statics.field2798, Statics.field1960);
                    }
                    if (Statics.field2797.method3170(Statics.field1926, Statics.field2796, Statics.field2448, 22050)) {
                        Statics.field2797.method3172();
                        Statics.field2797.method3169(Statics.field2572);
                        Statics.field2797.method3173(Statics.field1926, Statics.field2440);
                        class173.field2799 = 0;
                        Statics.field1926 = null;
                        Statics.field2448 = null;
                        Statics.field2800 = null;
                        var1 = true;
                        break label275;
                    }
                }
            } catch (Exception var44) {
                var44.printStackTrace();
                Statics.field2797.method3174();
                class173.field2799 = 0;
                Statics.field1926 = null;
                Statics.field2448 = null;
                Statics.field2800 = null;
            }
            var1 = false;
        }
        if (var1 && field481 && Statics.field2847 != null) {
            Statics.field2847.method1037();
        }
        if (field2062) {
            class129.method856(Statics.field2498);
            Canvas var4 = Statics.field2498;
            var4.removeMouseListener(class132.field2015);
            var4.removeMouseMotionListener(class132.field2015);
            var4.removeFocusListener(class132.field2015);
            class132.field2003 = 0;
            if (Statics.field183 != null) {
                Statics.field183.method2513(Statics.field2498);
            }
            this.method2723();
            Canvas var5 = Statics.field2498;
            var5.setFocusTraversalKeysEnabled(false);
            var5.addKeyListener(class129.field1970);
            var5.addFocusListener(class129.field1970);
            class132.method195(Statics.field2498);
            if (Statics.field183 != null) {
                Statics.field183.method2520(Statics.field2498);
            }
        }
        if (field254 == 0) {
            class136.method643(class30.field658, class30.field659, (Color) null);
        } else if (field254 == 5) {
            class30.method109(Statics.field3025, Statics.field560, Statics.field3016);
        } else if (field254 == 10 || field254 == 11) {
            class30.method109(Statics.field3025, Statics.field560, Statics.field3016);
        } else if (field254 == 20) {
            class30.method109(Statics.field3025, Statics.field560, Statics.field3016);
        } else if (field254 == 25) {
            if (field482 == 1) {
                if (field299 > field300) {
                    field300 = field299;
                }
                int var6 = (field300 * 50 - field299 * 50) / field300;
                method2434(class148.field2169 + class2.field23 + class2.field20 + var6 + "%" + class2.field19, false);
            } else if (field482 == 2) {
                if (field389 > field302) {
                    field302 = field389;
                }
                int var7 = (field302 * 50 - field389 * 50) / field302 + 50;
                method2434(class148.field2169 + class2.field23 + class2.field20 + var7 + "%" + class2.field19, false);
            } else {
                method2434(class148.field2169, false);
            }
        } else if (field254 == 30) {
            if (field405 != -1) {
                method161(field405);
            }
            for (int var8 = 0; var8 < field449; var8++) {
                if (field451[var8]) {
                    field452[var8] = true;
                }
                field425[var8] = field451[var8];
                field451[var8] = false;
            }
            field450 = field256;
            field431 = -1;
            field395 = -1;
            Statics.field213 = null;
            if (field405 != -1) {
                field449 = 0;
                method2690(field405, 0, 0, 765, 503, 0, 0, -1);
            }
            class75.method1598();
            if (field386) {
                int var9 = Statics.field556;
                int var10 = Statics.field12;
                int var11 = Statics.field1907;
                int var12 = Statics.field608;
                int var13 = 6116423;
                class75.method1575(var9, var10, var11, var12, var13);
                class75.method1575(var9 + 1, var10 + 1, var11 - 2, 16, 0);
                class75.method1580(var9 + 1, var10 + 18, var11 - 2, var12 - 19, 0);
                Statics.field3025.method3622(class148.field2213, var9 + 3, var10 + 14, var13, -1);
                int var14 = class132.field2007;
                int var15 = class132.field2008;
                for (int var16 = 0; var16 < field387; var16++) {
                    int var17 = (field387 - 1 - var16) * 15 + var10 + 31;
                    int var18 = 16777215;
                    if (var14 > var9 && var14 < var9 + var11 && var15 > var17 - 13 && var15 < var17 + 3) {
                        var18 = 16776960;
                    }
                    class214 var19 = Statics.field3025;
                    String var20;
                    if (field411[var16].length() > 0) {
                        var20 = field384[var16] + class148.field2160 + field411[var16];
                    } else {
                        var20 = field384[var16];
                    }
                    var19.method3622(var20, var9 + 3, var17, var18, 0);
                }
                method1905(Statics.field556, Statics.field12, Statics.field1907, Statics.field608);
            } else if (field431 != -1) {
                Statics.method170(field431, field395);
            }
            if (field458 == 3) {
                for (int var21 = 0; var21 < field449; var21++) {
                    if (field425[var21]) {
                        class75.method1577(field454[var21], field455[var21], field456[var21], field457[var21], 16711935, 128);
                    } else if (field452[var21]) {
                        class75.method1577(field454[var21], field455[var21], field456[var21], field457[var21], 16711680, 128);
                    }
                }
            }
            int var22 = Statics.field2842;
            int var23 = Statics.field3024.field767;
            int var24 = Statics.field3024.field722;
            int var25 = field398;
            for (class22 var26 = (class22) class22.field547.method3378(); var26 != null; var26 = (class22) class22.field547.method3394()) {
                if (var26.field542 != -1 || var26.field546 != null) {
                    int var27 = 0;
                    if (var23 > var26.field539) {
                        var27 += var23 - var26.field539;
                    } else if (var23 < var26.field537) {
                        var27 += var26.field537 - var23;
                    }
                    if (var24 > var26.field540) {
                        var27 += var24 - var26.field540;
                    } else if (var24 < var26.field555) {
                        var27 += var26.field555 - var24;
                    }
                    if (var27 - 64 > var26.field541 || field288 == 0 || var26.field538 != var22) {
                        if (var26.field543 != null) {
                            Statics.field191.method1000(var26.field543);
                            var26.field543 = null;
                        }
                        if (var26.field548 != null) {
                            Statics.field191.method1000(var26.field548);
                            var26.field548 = null;
                        }
                    } else {
                        var27 -= 64;
                        if (var27 < 0) {
                            var27 = 0;
                        }
                        int var28 = field288 * (var26.field541 - var27) / var26.field541;
                        class54 var10000;
                        if (var26.field543 != null) {
                            var26.field543.method1160(var28);
                        } else if (var26.field542 >= 0) {
                            var10000 = (class54) null;
                            class54 var29 = class54.method1087(Statics.field2083, var26.field542, 0);
                            if (var29 != null) {
                                class58 var30 = var29.method1086().method1128(Statics.field2516);
                                class60 var31 = class60.method1156(var30, 100, var28);
                                var31.method1262(-1);
                                Statics.field191.method999(var31);
                                var26.field543 = var31;
                            }
                        }
                        if (var26.field548 != null) {
                            var26.field548.method1160(var28);
                            if (!var26.field548.method3460()) {
                                var26.field548 = null;
                            }
                        } else if (var26.field546 != null && (var26.field535 -= var25) <= 0) {
                            int var32 = (int) (Math.random() * (double) var26.field546.length);
                            var10000 = (class54) null;
                            class54 var33 = class54.method1087(Statics.field2083, var26.field546[var32], 0);
                            if (var33 != null) {
                                class58 var34 = var33.method1086().method1128(Statics.field2516);
                                class60 var35 = class60.method1156(var34, 100, var28);
                                var35.method1262(0);
                                Statics.field191.method999(var35);
                                var26.field548 = var35;
                                var26.field535 = var26.field544 + (int) (Math.random() * (double) (var26.field551 - var26.field544));
                            }
                        }
                    }
                }
            }
            field398 = 0;
        } else if (field254 == 40) {
            method2434(class148.field2402 + class2.field23 + class148.field2171, false);
        } else if (field254 == 45) {
            method2434(class148.field2318, false);
        }
        if (field254 == 30 && field458 == 0 && !field2061) {
            try {
                Graphics var36 = Statics.field2498.getGraphics();
                for (int var37 = 0; var37 < field449; var37++) {
                    if (field452[var37]) {
                        Statics.field580.method1396(var36, field454[var37], field455[var37], field456[var37], field457[var37]);
                        field452[var37] = false;
                    }
                }
            } catch (Exception var43) {
                Statics.field2498.repaint();
            }
        } else if (field254 > 0) {
            try {
                Graphics var39 = Statics.field2498.getGraphics();
                Statics.field580.method1395(var39, 0, 0);
                field2061 = false;
                for (int var40 = 0; var40 < field449; var40++) {
                    field452[var40] = false;
                }
            } catch (Exception var42) {
                Statics.field2498.repaint();
            }
        }
    }

    @ObfuscatedName("client.f(I)V")
    public final void method219() {
        if (Statics.field228 != null) {
            Statics.field228.field172 = false;
        }
        Statics.field228 = null;
        if (Statics.field285 != null) {
            Statics.field285.method2659();
            Statics.field285 = null;
        }
        class129.method37();
        if (class132.field2015 != null) {
            class132 var1 = class132.field2015;
            synchronized (class132.field2015) {
                class132.field2015 = null;
            }
        }
        Statics.field183 = null;
        if (Statics.field2847 != null) {
            Statics.field2847.method1038();
        }
        if (Statics.field2527 != null) {
            Statics.field2527.method1038();
        }
        if (Statics.field2581 != null) {
            Statics.field2581.method2659();
        }
        Object var3 = class161.field2577;
        synchronized (class161.field2577) {
            if (class161.field2576 != 0) {
                class161.field2576 = 1;
                try {
                    class161.field2577.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class141.method1907();
    }

    @ObfuscatedName("dh.g(IB)V")
    public static void method2387(int arg0) {
        if (field254 == arg0) {
            return;
        }
        if (field254 == 0) {
            Statics.field972 = null;
            Statics.field514 = null;
            Statics.field1322 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field278 = 0;
            field324 = 0;
            field379 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2533 != null) {
            Statics.field2533.method2659();
            Statics.field2533 = null;
        }
        if (field254 == 25) {
            field482 = 0;
            field299 = 0;
            field300 = 1;
            field389 = 0;
            field302 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class30.method498(Statics.field2498, Statics.field956, Statics.field205, true, 0);
        } else if (arg0 == 20) {
            class30.method498(Statics.field2498, Statics.field956, Statics.field205, true, field254 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class30.method498(Statics.field2498, Statics.field956, Statics.field205, false, 4);
        } else if (Statics.field678) {
            Statics.field670 = null;
            Statics.field645 = null;
            Statics.field650 = null;
            Statics.field2745 = null;
            Statics.field647 = null;
            Statics.field2491 = null;
            Statics.field2499 = null;
            Statics.field237 = null;
            Statics.field506 = null;
            Statics.field2804 = null;
            Statics.field620 = null;
            Statics.field784 = null;
            Statics.field672 = null;
            Statics.field147 = null;
            Statics.field888 = null;
            Statics.field1791 = null;
            Statics.field619 = null;
            Statics.field1546 = null;
            Statics.field1992 = null;
            Statics.field1928 = null;
            Statics.field1251 = null;
            Statics.field2103 = null;
            class173.field2799 = 1;
            Statics.field2800 = null;
            Statics.field2896 = -1;
            Statics.field2801 = -1;
            Statics.field2572 = 0;
            Statics.field2440 = false;
            Statics.field2802 = 2;
            class162.method203(true);
            Statics.field678 = false;
        }
        field254 = arg0;
    }

    @ObfuscatedName("client.o(I)V")
    public void method220() {
        if (field254 == 1000) {
            return;
        }
        long var1 = class107.method635();
        int var3 = (int) (var1 - Statics.field2582);
        Statics.field2582 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class162.field2583 += var3;
        boolean var4;
        if (class162.field2591 == 0 && class162.field2592 == 0 && class162.field2586 == 0 && class162.field2584 == 0) {
            var4 = true;
        } else if (Statics.field2581 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class162.field2583 > 30000) {
                        throw new IOException();
                    }
                    while (class162.field2592 < 20 && class162.field2584 > 0) {
                        class163 var5 = (class163) class162.field2590.method3341();
                        class111 var6 = new class111(4);
                        var6.method2366(1);
                        var6.method2163((int) var5.field2963);
                        Statics.field2581.method2663(var6.field1835, 0, 4);
                        class162.field2585.method3338(var5, var5.field2963);
                        class162.field2584--;
                        class162.field2592++;
                    }
                    while (class162.field2591 < 20 && class162.field2586 > 0) {
                        class163 var7 = (class163) class162.field2587.method3425();
                        class111 var8 = new class111(4);
                        var8.method2366(0);
                        var8.method2163((int) var7.field2963);
                        Statics.field2581.method2663(var8.field1835, 0, 4);
                        var7.method3440();
                        class162.field2594.method3338(var7, var7.field2963);
                        class162.field2586--;
                        class162.field2591++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2581.method2661();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class162.field2583 = 0;
                        byte var11 = 0;
                        if (Statics.field1466 == null) {
                            var11 = 8;
                        } else if (class162.field2589 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class162.field2593.field1834;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2581.method2662(class162.field2593.field1835, class162.field2593.field1834, var12);
                            if (class162.field2598 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class162.field2593.field1835[class162.field2593.field1834 + var13] ^= class162.field2598;
                                }
                            }
                            class162.field2593.field1834 += var12;
                            if (class162.field2593.field1834 < var11) {
                                break;
                            }
                            if (Statics.field1466 == null) {
                                class162.field2593.field1834 = 0;
                                int var14 = class162.field2593.method2176();
                                int var15 = class162.field2593.method2178();
                                int var16 = class162.field2593.method2176();
                                int var17 = class162.field2593.method2378();
                                long var18 = (long) ((var14 << 16) + var15);
                                class163 var20 = (class163) class162.field2585.method3339(var18);
                                Statics.field2595 = true;
                                if (var20 == null) {
                                    var20 = (class163) class162.field2594.method3339(var18);
                                    Statics.field2595 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1466 = var20;
                                Statics.field616 = new class111(var17 + var21 + Statics.field1466.field2603);
                                Statics.field616.method2366(var16);
                                Statics.field616.method2229(var17);
                                class162.field2589 = 8;
                                class162.field2593.field1834 = 0;
                            } else if (class162.field2589 == 0) {
                                if (class162.field2593.field1835[0] == -1) {
                                    class162.field2589 = 1;
                                    class162.field2593.field1834 = 0;
                                } else {
                                    Statics.field1466 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field616.field1835.length - Statics.field1466.field2603;
                            int var23 = 512 - class162.field2589;
                            if (var23 > var22 - Statics.field616.field1834) {
                                var23 = var22 - Statics.field616.field1834;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2581.method2662(Statics.field616.field1835, Statics.field616.field1834, var23);
                            if (class162.field2598 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field616.field1835[Statics.field616.field1834 + var24] ^= class162.field2598;
                                }
                            }
                            Statics.field616.field1834 += var23;
                            class162.field2589 += var23;
                            if (Statics.field616.field1834 == var22) {
                                if (Statics.field1466.field2963 == 16711935L) {
                                    Statics.field2580 = Statics.field616;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class159 var26 = class162.field2597[var25];
                                        if (var26 != null) {
                                            Statics.field2580.field1834 = var25 * 8 + 5;
                                            int var27 = Statics.field2580.method2378();
                                            int var28 = Statics.field2580.method2378();
                                            var26.method2929(var27, var28);
                                        }
                                    }
                                } else {
                                    class162.field2596.reset();
                                    class162.field2596.update(Statics.field616.field1835, 0, var22);
                                    int var29 = (int) class162.field2596.getValue();
                                    if (Statics.field1466.field2607 != var29) {
                                        try {
                                            Statics.field2581.method2659();
                                        } catch (Exception var35) {
                                        }
                                        class162.field2599++;
                                        Statics.field2581 = null;
                                        class162.field2598 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class162.field2599 = 0;
                                    class162.field2600 = 0;
                                    Statics.field1466.field2604.method2921((int) (Statics.field1466.field2963 & 0xFFFFL), Statics.field616.field1835, (Statics.field1466.field2963 & 0xFF0000L) == 16711680L, Statics.field2595);
                                }
                                Statics.field1466.method3463();
                                if (Statics.field2595) {
                                    class162.field2592--;
                                } else {
                                    class162.field2591--;
                                }
                                class162.field2589 = 0;
                                Statics.field1466 = null;
                                Statics.field616 = null;
                            } else {
                                if (class162.field2589 != 512) {
                                    break;
                                }
                                class162.field2589 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2581.method2659();
                } catch (Exception var34) {
                }
                class162.field2600++;
                Statics.field2581 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method221();
        }
    }

    @ObfuscatedName("client.h(B)V")
    public void method221() {
        if (class162.field2599 >= 4) {
            this.method2711("js5crc");
            field254 = 1000;
            return;
        }
        if (class162.field2600 >= 4) {
            if (field254 <= 5) {
                this.method2711("js5io");
                field254 = 1000;
                return;
            }
            field276 = 3000;
            class162.field2600 = 3;
        }
        if (--field276 + 1 > 0) {
            return;
        }
        try {
            if (field338 == 0) {
                Statics.field2022 = Statics.field879.method2581(Statics.field606, Statics.field1558);
                field338++;
            }
            if (field338 == 1) {
                if (Statics.field2022.field2070 == 2) {
                    this.method329(-1);
                    return;
                }
                if (Statics.field2022.field2070 == 1) {
                    field338++;
                }
            }
            if (field338 == 2) {
                Statics.field2018 = new class135((Socket) Statics.field2022.field2074, Statics.field879);
                class111 var1 = new class111(5);
                var1.method2366(15);
                var1.method2229(78);
                Statics.field2018.method2663(var1.field1835, 0, 5);
                field338++;
                Statics.field975 = class107.method635();
            }
            if (field338 == 3) {
                if (field254 <= 5 || Statics.field2018.method2661() > 0) {
                    int var2 = Statics.field2018.method2667();
                    if (var2 != 0) {
                        this.method329(var2);
                        return;
                    }
                    field338++;
                } else if (class107.method635() - Statics.field975 > 30000L) {
                    this.method329(-2);
                    return;
                }
            }
            if (field338 == 4) {
                class162.method2009(Statics.field2018, field254 > 20);
                Statics.field2022 = null;
                Statics.field2018 = null;
                field338 = 0;
                field277 = 0;
            }
        } catch (IOException var4) {
            this.method329(-3);
        }
    }

    @ObfuscatedName("client.s(II)V")
    public void method329(int arg0) {
        Statics.field2022 = null;
        Statics.field2018 = null;
        field338 = 0;
        if (Statics.field1558 == Statics.field152) {
            Statics.field1558 = Statics.field705;
        } else {
            Statics.field1558 = Statics.field152;
        }
        field277++;
        if (field277 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field254 <= 5) {
                this.method2711("js5connect_full");
                field254 = 1000;
            } else {
                field276 = 3000;
            }
        } else if (field277 >= 2 && arg0 == 6) {
            this.method2711("js5connect_outofdate");
            field254 = 1000;
        } else if (field277 >= 4) {
            if (field254 <= 5) {
                this.method2711("js5connect");
                field254 = 1000;
            } else {
                field276 = 3000;
            }
        }
    }

    @ObfuscatedName("ay.j(I)V")
    public static void method662() {
        if (field274 == 0) {
            Statics.field563 = new class81(4, 104, 104, class6.field78);
            for (int var0 = 0; var0 < 4; var0++) {
                field304[var0] = new class219(104, 104);
            }
            Statics.field949 = new class74(512, 512);
            class30.field659 = class148.field2172;
            class30.field658 = 5;
            field274 = 20;
        } else if (field274 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class86.field1449[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class81.method1695(var1, 500, 800, 512, 334);
            class30.field659 = class148.field2209;
            class30.field658 = 10;
            field274 = 30;
        } else if (field274 == 30) {
            Statics.field1851 = method42(0, false, true, true);
            Statics.field599 = method42(1, false, true, true);
            Statics.field1243 = method42(2, true, false, true);
            Statics.field583 = method42(3, false, true, true);
            Statics.field2083 = method42(4, false, true, true);
            Statics.field2081 = method42(5, true, true, true);
            Statics.field2042 = method42(6, true, true, false);
            Statics.field1899 = method42(7, false, true, true);
            Statics.field205 = method42(8, false, true, true);
            Statics.field1875 = method42(9, false, true, true);
            Statics.field956 = method42(10, false, true, true);
            Statics.field195 = method42(11, false, true, true);
            Statics.field26 = method42(12, false, true, true);
            Statics.field1255 = method42(13, true, false, true);
            Statics.field1991 = method42(14, false, true, false);
            Statics.field200 = method42(15, false, true, true);
            class30.field659 = class148.field2174;
            class30.field658 = 20;
            field274 = 40;
        } else if (field274 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1851.method2918() * 4 / 100;
            int var8 = var7 + Statics.field599.method2918() * 4 / 100;
            int var9 = var8 + Statics.field1243.method2918() * 2 / 100;
            int var10 = var9 + Statics.field583.method2918() * 2 / 100;
            int var11 = var10 + Statics.field2083.method2918() * 6 / 100;
            int var12 = var11 + Statics.field2081.method2918() * 4 / 100;
            int var13 = var12 + Statics.field2042.method2918() * 2 / 100;
            int var14 = var13 + Statics.field1899.method2918() * 60 / 100;
            int var15 = var14 + Statics.field205.method2918() * 2 / 100;
            int var16 = var15 + Statics.field1875.method2918() * 2 / 100;
            int var17 = var16 + Statics.field956.method2918() * 2 / 100;
            int var18 = var17 + Statics.field195.method2918() * 2 / 100;
            int var19 = var18 + Statics.field26.method2918() * 2 / 100;
            int var20 = var19 + Statics.field1255.method2918() * 2 / 100;
            int var21 = var20 + Statics.field1991.method2918() * 2 / 100;
            int var22 = var21 + Statics.field200.method2918() * 2 / 100;
            if (var22 == 100) {
                class30.field659 = class148.field2393;
                class30.field658 = 30;
                field274 = 45;
            } else {
                if (var22 != 0) {
                    class30.field659 = class148.field2175 + var22 + "%";
                }
                class30.field658 = 30;
            }
        } else if (field274 == 45) {
            boolean var23 = !field241;
            Statics.field1064 = 22050;
            Statics.field1057 = var23;
            Statics.field1876 = 2;
            class174 var24 = new class174();
            var24.method3182(9, 128);
            Statics.field2847 = class52.method2507(Statics.field879, Statics.field2498, 0, 22050);
            Statics.field2847.method1034(var24);
            class159 var25 = Statics.field200;
            class159 var26 = Statics.field1991;
            class159 var27 = Statics.field2083;
            Statics.field2796 = var25;
            Statics.field1960 = var26;
            Statics.field2798 = var27;
            Statics.field2797 = var24;
            Statics.field2527 = class52.method2507(Statics.field879, Statics.field2498, 1, 2048);
            Statics.field191 = new class51();
            Statics.field2527.method1034(Statics.field191);
            Statics.field2516 = new class70(22050, Statics.field1064);
            class30.field659 = class148.field2387;
            class30.field658 = 35;
            field274 = 50;
        } else if (field274 == 50) {
            int var28 = 0;
            if (Statics.field560 == null) {
                Statics.field560 = class72.method162(Statics.field205, Statics.field1255, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field3016 == null) {
                Statics.field3016 = class72.method162(Statics.field205, Statics.field1255, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field3025 == null) {
                Statics.field3025 = class72.method162(Statics.field205, Statics.field1255, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class30.field659 = class148.field2178 + var28 * 100 / 3 + "%";
                class30.field658 = 40;
            } else {
                Statics.field2754 = new class151(true);
                class30.field659 = class148.field2321;
                class30.field658 = 40;
                field274 = 60;
            }
        } else if (field274 == 60) {
            int var29 = class30.method615(Statics.field956, Statics.field205);
            byte var30 = 8;
            if (var29 < var30) {
                class30.field659 = class148.field2337 + var29 * 100 / var30 + "%";
                class30.field658 = 50;
            } else {
                class30.field659 = class148.field2295;
                class30.field658 = 50;
                method2387(5);
                field274 = 70;
            }
        } else if (field274 == 70) {
            if (Statics.field1243.method2908()) {
                class43.method1931(Statics.field1243);
                class159 var32 = Statics.field1243;
                Statics.field881 = var32;
                class42.method614(Statics.field1243, Statics.field1899);
                class159 var33 = Statics.field1243;
                class159 var34 = Statics.field1899;
                boolean var35 = field241;
                Statics.field829 = var33;
                Statics.field830 = var34;
                class38.field850 = var35;
                class159 var36 = Statics.field1243;
                class159 var37 = Statics.field1899;
                Statics.field798 = var36;
                Statics.field791 = var37;
                class159 var38 = Statics.field1243;
                class159 var39 = Statics.field1899;
                boolean var40 = field249;
                class214 var41 = Statics.field560;
                Statics.field1013 = var38;
                Statics.field58 = var39;
                Statics.field1904 = var40;
                Statics.field993 = Statics.field1013.method2864(10);
                Statics.field3021 = var41;
                class159 var42 = Statics.field1243;
                class159 var43 = Statics.field1851;
                class159 var44 = Statics.field599;
                Statics.field903 = var42;
                Statics.field911 = var43;
                Statics.field895 = var44;
                class41.method4(Statics.field1243, Statics.field1899);
                class159 var45 = Statics.field1243;
                Statics.field966 = var45;
                class159 var46 = Statics.field1243;
                Statics.field1046 = var46;
                Statics.field1045 = Statics.field1046.method2864(16);
                class164.method2109(Statics.field583, Statics.field1899, Statics.field205, Statics.field1255);
                class159 var47 = Statics.field1243;
                Statics.field987 = var47;
                class45.method522(Statics.field1243);
                class30.field659 = class148.field2183;
                class30.field658 = 60;
                field274 = 80;
            } else {
                class30.field659 = class148.field2259 + Statics.field1243.method2925() + "%";
                class30.field658 = 60;
            }
        } else if (field274 == 80) {
            int var48 = 0;
            if (Statics.field1885 == null) {
                class159 var49 = Statics.field205;
                int var50 = var49.method2912("compass");
                int var51 = var49.method2853(var50, "");
                class74 var52 = class72.method126(var49, var50, var51);
                Statics.field1885 = var52;
            } else {
                var48++;
            }
            if (Statics.field1325 == null) {
                class159 var53 = Statics.field205;
                int var54 = var53.method2912("mapedge");
                int var55 = var53.method2853(var54, "");
                class74 var56 = class72.method126(var53, var54, var55);
                Statics.field1325 = var56;
            } else {
                var48++;
            }
            if (Statics.field2843 == null) {
                Statics.field2843 = class72.method172(Statics.field205, "mapscene", "");
            } else {
                var48++;
            }
            if (Statics.field3015 == null) {
                Statics.field3015 = class72.method1112(Statics.field205, "mapfunction", "");
            } else {
                var48++;
            }
            if (Statics.field605 == null) {
                Statics.field605 = class72.method1112(Statics.field205, "hitmarks", "");
            } else {
                var48++;
            }
            if (Statics.field196 == null) {
                Statics.field196 = class72.method1112(Statics.field205, "headicons_pk", "");
            } else {
                var48++;
            }
            if (Statics.field1438 == null) {
                Statics.field1438 = class72.method1112(Statics.field205, "headicons_prayer", "");
            } else {
                var48++;
            }
            if (Statics.field68 == null) {
                Statics.field68 = class72.method1112(Statics.field205, "headicons_hint", "");
            } else {
                var48++;
            }
            if (Statics.field640 == null) {
                Statics.field640 = class72.method1112(Statics.field205, "mapmarker", "");
            } else {
                var48++;
            }
            if (Statics.field14 == null) {
                Statics.field14 = class72.method1112(Statics.field205, "cross", "");
            } else {
                var48++;
            }
            if (Statics.field149 == null) {
                Statics.field149 = class72.method1112(Statics.field205, "mapdots", "");
            } else {
                var48++;
            }
            if (Statics.field1925 == null) {
                Statics.field1925 = class72.method172(Statics.field205, "scrollbar", "");
            } else {
                var48++;
            }
            if (Statics.field166 == null) {
                Statics.field166 = class72.method172(Statics.field205, "mod_icons", "");
            } else {
                var48++;
            }
            if (Statics.field513 == null) {
                Statics.field513 = class72.method951(Statics.field205, "mapback", "");
            } else {
                var48++;
            }
            if (var48 < 14) {
                class30.field659 = class148.field2184 + var48 * 100 / 14 + "%";
                class30.field658 = 70;
            } else {
                Statics.field3053 = Statics.field166;
                Statics.field1325.method1482();
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 41.0D) - 20;
                for (int var61 = 0; var61 < Statics.field3015.length; var61++) {
                    Statics.field3015[var61].method1481(var57 + var60, var58 + var60, var59 + var60);
                }
                Statics.field2843[0].method1633(var57 + var60, var58 + var60, var59 + var60);
                method28();
                class30.field659 = class148.field2249;
                class30.field658 = 70;
                field274 = 90;
            }
        } else if (field274 == 90) {
            if (Statics.field1875.method2908()) {
                class90 var62 = new class90(Statics.field1875, Statics.field205, 20, 0.8D, field241 ? 64 : 128);
                class86.method1833(var62);
                class86.method1882(0.8D);
                class30.field659 = class148.field2187;
                class30.field658 = 90;
                field274 = 110;
            } else {
                class30.field659 = class148.field2186 + Statics.field1875.method2925() + "%";
                class30.field658 = 90;
            }
        } else if (field274 == 110) {
            Statics.field228 = new class13();
            Statics.field879.method2566(Statics.field228, 10);
            class30.field659 = class148.field2188;
            class30.field658 = 94;
            field274 = 120;
        } else if (field274 == 120) {
            if (Statics.field956.method2860("huffman", "")) {
                class105 var63 = new class105(Statics.field956.method2859("huffman", ""));
                Statics.field3038 = var63;
                class30.field659 = class148.field2190;
                class30.field658 = 96;
                field274 = 130;
            } else {
                class30.field659 = class148.field2189 + "%";
                class30.field658 = 96;
            }
        } else if (field274 == 130) {
            if (!Statics.field583.method2908()) {
                class30.field659 = class148.field2191 + Statics.field583.method2925() * 4 / 5 + "%";
                class30.field658 = 100;
            } else if (!Statics.field26.method2908()) {
                class30.field659 = class148.field2191 + (80 + Statics.field26.method2925() / 6) + "%";
                class30.field658 = 100;
            } else if (Statics.field1255.method2908()) {
                class30.field659 = class148.field2364;
                class30.field658 = 100;
                field274 = 140;
            } else {
                class30.field659 = class148.field2191 + (96 + Statics.field1255.method2925() / 20) + "%";
                class30.field658 = 100;
            }
        } else if (field274 == 140) {
            method2387(10);
        }
    }

    @ObfuscatedName("u.m(IZZZB)Lfo;")
    public static class159 method42(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class126 var4 = null;
        if (class141.field2093 != null) {
            var4 = new class126(arg0, class141.field2093, Statics.field2043[arg0], 1000000);
        }
        return new class159(var4, Statics.field558, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("l.t(I)V")
    public static void method28() {
        Statics.field3003 = new int[33];
        Statics.field1774 = new int[33];
        Statics.field184 = new int[151];
        Statics.field1424 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field513.field1290[Statics.field513.field1297 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field3003[var0] = var1;
            Statics.field1774[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field513.field1290[Statics.field513.field1297 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field184[var4 - 5] = var5 - 25;
            Statics.field1424[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("ff.z(I)V")
    public static final void method3179() {
        try {
            if (field278 == 0) {
                if (Statics.field285 != null) {
                    Statics.field285.method2659();
                    Statics.field285 = null;
                }
                Statics.field2846 = null;
                field295 = false;
                field324 = 0;
                field278 = 1;
            }
            if (field278 == 1) {
                if (Statics.field2846 == null) {
                    Statics.field2846 = Statics.field879.method2581(Statics.field606, Statics.field1558);
                }
                if (Statics.field2846.field2070 == 2) {
                    throw new IOException();
                }
                if (Statics.field2846.field2070 == 1) {
                    Statics.field285 = new class135((Socket) Statics.field2846.field2074, Statics.field879);
                    Statics.field2846 = null;
                    field278 = 2;
                }
            }
            if (field278 == 2) {
                field475.field1834 = 0;
                field475.method2366(14);
                Statics.field285.method2663(field475.field1835, 0, 1);
                field258.field1834 = 0;
                field278 = 3;
            }
            if (field278 == 3) {
                if (Statics.field2847 != null) {
                    Statics.field2847.method1036();
                }
                if (Statics.field2527 != null) {
                    Statics.field2527.method1036();
                }
                int var0 = Statics.field285.method2667();
                if (Statics.field2847 != null) {
                    Statics.field2847.method1036();
                }
                if (Statics.field2527 != null) {
                    Statics.field2527.method1036();
                }
                if (var0 != 0) {
                    method140(var0);
                    return;
                }
                field258.field1834 = 0;
                field278 = 5;
            }
            if (field278 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field475.field1834 = 0;
                field475.method2366(1);
                field475.method2366(class30.field666.method502());
                field475.method2229(var1[0]);
                field475.method2229(var1[1]);
                field475.method2229(var1[2]);
                field475.method2229(var1[3]);
                switch(class30.field666.field2446) {
                    case 0:
                    case 1:
                        field475.method2163(Statics.field983);
                        field475.field1834 += 5;
                        break;
                    case 2:
                        field475.method2229((Integer) Statics.field1806.field132.get(class154.method613(class30.field652)));
                        field475.field1834 += 4;
                        break;
                    case 3:
                        field475.field1834 += 8;
                }
                field475.method2177(class30.field665);
                field475.method2383(class5.field66, class5.field62);
                field248.field1834 = 0;
                if (field254 == 40) {
                    field248.method2366(18);
                } else {
                    field248.method2366(16);
                }
                field248.method2190(0);
                int var2 = field248.field1834;
                field248.method2229(78);
                field248.method2170(field475.field1835, 0, field475.field1834);
                int var3 = field248.field1834;
                field248.method2177(class30.field652);
                field248.method2366(field241 ? 1 : 0);
                class114 var4 = field248;
                byte[] var5 = new byte[24];
                try {
                    class141.field2096.method3674(0L);
                    class141.field2096.method3661(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var28) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2170(var5, 0, 24);
                field248.method2177(Statics.field252);
                field248.method2229(Statics.field253);
                class111 var9 = new class111(Statics.field2754.method2788());
                Statics.field2754.method2787(var9);
                field248.method2170(var9.field1835, 0, var9.field1835.length);
                field248.method2366(Statics.field27);
                field248.method2229(Statics.field1851.field2548);
                field248.method2229(Statics.field599.field2548);
                field248.method2229(Statics.field1243.field2548);
                field248.method2229(Statics.field583.field2548);
                field248.method2229(Statics.field2083.field2548);
                field248.method2229(Statics.field2081.field2548);
                field248.method2229(Statics.field2042.field2548);
                field248.method2229(Statics.field1899.field2548);
                field248.method2229(Statics.field205.field2548);
                field248.method2229(Statics.field1875.field2548);
                field248.method2229(Statics.field956.field2548);
                field248.method2229(Statics.field195.field2548);
                field248.method2229(Statics.field26.field2548);
                field248.method2229(Statics.field1255.field2548);
                field248.method2229(Statics.field1991.field2548);
                field248.method2229(Statics.field200.field2548);
                field248.method2193(var1, var3, field248.field1834);
                field248.method2172(field248.field1834 - var2);
                Statics.field285.method2663(field248.field1835, 0, field248.field1834);
                field475.method2437(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field258.method2437(var1);
                field278 = 6;
            }
            if (field278 == 6 && Statics.field285.method2661() > 0) {
                int var11 = Statics.field285.method2667();
                if (var11 == 21 && field254 == 20) {
                    field278 = 7;
                } else if (var11 == 2) {
                    field278 = 9;
                } else if (var11 == 15 && field254 == 40) {
                    field475.field1834 = 0;
                    field258.field1834 = 0;
                    field290 = -1;
                    field294 = -1;
                    field485 = -1;
                    field296 = -1;
                    field289 = 0;
                    field359 = 0;
                    field263 = 0;
                    field387 = 0;
                    field386 = false;
                    field503 = 0;
                    field476 = 0;
                    for (int var12 = 0; var12 < field363.length; var12++) {
                        if (field363[var12] != null) {
                            field363[var12].field731 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field397.length; var13++) {
                        if (field397[var13] != null) {
                            field397[var13].field731 = -1;
                        }
                    }
                    class15.method1655();
                    method2387(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field451[var14] = true;
                    }
                    return;
                } else if (var11 == 23 && field379 < 1) {
                    field379++;
                    field278 = 0;
                } else {
                    method140(var11);
                    return;
                }
            }
            if (field278 == 7 && Statics.field285.method2661() > 0) {
                field448 = (Statics.field285.method2667() + 3) * 60;
                field278 = 8;
            }
            if (field278 == 8) {
                field324 = 0;
                class30.method2110(class148.field2196, class148.field2197, field448 / 60 + class148.field2208);
                if (--field448 <= 0) {
                    field278 = 0;
                }
            } else {
                if (field278 == 9 && Statics.field285.method2661() >= 13) {
                    boolean var15 = Statics.field285.method2667() == 1;
                    Statics.field285.method2662(field258.field1835, 0, 4);
                    field258.field1834 = 0;
                    boolean var16 = false;
                    if (var15) {
                        int var17 = field258.method2457() << 24;
                        int var18 = var17 | field258.method2457() << 16;
                        int var19 = var18 | field258.method2457() << 8;
                        int var20 = var19 | field258.method2457();
                        int var21 = class154.method613(class30.field652);
                        if (Statics.field1806.field132.size() >= 10 && !Statics.field1806.field132.containsKey(var21)) {
                            Iterator var22 = Statics.field1806.field132.entrySet().iterator();
                            var22.next();
                            var22.remove();
                        }
                        Statics.field1806.field132.put(var21, var20);
                        class9.method1068();
                    }
                    field412 = Statics.field285.method2667();
                    field414 = Statics.field285.method2667() == 1;
                    field369 = Statics.field285.method2667();
                    field369 <<= 0x8;
                    field369 += Statics.field285.method2667();
                    field370 = Statics.field285.method2667();
                    Statics.field285.method2662(field258.field1835, 0, 1);
                    field258.field1834 = 0;
                    field290 = field258.method2457();
                    Statics.field285.method2662(field258.field1835, 0, 2);
                    field258.field1834 = 0;
                    field289 = field258.method2178();
                    if (field370 == 1) {
                        try {
                            class124.method2526(Statics.field242, "zap");
                        } catch (Throwable var27) {
                        }
                    } else {
                        try {
                            class124.method2526(Statics.field242, "unzap");
                        } catch (Throwable var26) {
                        }
                    }
                    field278 = 10;
                }
                if (field278 != 10) {
                    field324++;
                    if (field324 > 2000) {
                        if (field379 < 1) {
                            if (Statics.field1558 == Statics.field152) {
                                Statics.field1558 = Statics.field705;
                            } else {
                                Statics.field1558 = Statics.field152;
                            }
                            field379++;
                            field278 = 0;
                        } else {
                            method140(-3);
                        }
                    }
                } else if (Statics.field285.method2661() >= field289) {
                    field258.field1834 = 0;
                    Statics.field285.method2662(field258.field1835, 0, field289);
                    method2();
                    Statics.field1268 = -1;
                    method210(false);
                    field290 = -1;
                }
            }
        } catch (IOException var29) {
            if (field379 < 1) {
                if (Statics.field1558 == Statics.field152) {
                    Statics.field1558 = Statics.field705;
                } else {
                    Statics.field1558 = Statics.field152;
                }
                field379++;
                field278 = 0;
            } else {
                method140(-2);
            }
        }
    }

    @ObfuscatedName("e.y(I)V")
    public static void method2() {
        field342 = -1L;
        field260 = -1;
        Statics.field228.field170 = 0;
        Statics.field1403 = true;
        field261 = true;
        field468 = -1L;
        class201.method165();
        field475.field1834 = 0;
        field258.field1834 = 0;
        field290 = -1;
        field294 = -1;
        field485 = -1;
        field296 = -1;
        field359 = 0;
        field263 = 0;
        field293 = 0;
        field264 = 0;
        field387 = 0;
        field386 = false;
        class132.method2088(0);
        class11.field151.clear();
        class11.field148.method3368();
        class11.field150.method3405();
        class11.field154 = 0;
        field392 = 0;
        field400 = false;
        field484 = 0;
        field308 = (int) (Math.random() * 100.0D) - 50;
        field310 = (int) (Math.random() * 110.0D) - 55;
        field495 = (int) (Math.random() * 80.0D) - 40;
        field315 = (int) (Math.random() * 120.0D) - 60;
        field279 = (int) (Math.random() * 30.0D) - 20;
        field328 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field503 = 0;
        field471 = -1;
        field476 = 0;
        field496 = 0;
        field257 = class19.field508;
        field364 = 0;
        field283 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field363[var0] = null;
            field368[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field397[var1] = null;
        }
        Statics.field3024 = field363[2047] = new class3();
        field377 = -1;
        field355.method3373();
        field430.method3373();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field378[var2][var3][var4] = null;
                }
            }
        }
        field265 = new class189();
        field497 = 0;
        field385 = 0;
        field500 = 0;
        for (int var5 = 0; var5 < Statics.field1045; var5++) {
            class48 var6 = class48.method2540(var5);
            if (var6 != null) {
                class166.field2752[var5] = 0;
                class166.field2753[var5] = 0;
            }
        }
        for (int var7 = 0; var7 < field442.length; var7++) {
            field442[var7] = -1;
        }
        field413 = -1;
        if (field405 != -1) {
            int var8 = field405;
            if (var8 != -1 && Statics.field2633[var8]) {
                Statics.field2717.method2896(var8);
                if (Statics.field2711[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field2711[var8].length; var10++) {
                        if (Statics.field2711[var8][var10] != null) {
                            if (Statics.field2711[var8][var10].field2620 == 2) {
                                var9 = false;
                            } else {
                                Statics.field2711[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field2711[var8] = null;
                    }
                    Statics.field2633[var8] = false;
                }
            }
        }
        for (class4 var11 = (class4) field406.method3341(); var11 != null; var11 = (class4) field406.method3346()) {
            method340(var11, true);
        }
        field405 = -1;
        field406 = new class186(8);
        field409 = null;
        field386 = false;
        field387 = 0;
        field404.method3052((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field358[var12] = null;
            field375[var12] = false;
        }
        class15.method1655();
        field255 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field451[var13] = true;
        }
        field469 = null;
        Statics.field1439 = 0;
        Statics.field126 = null;
        for (int var14 = 0; var14 < 6; var14++) {
            field372[var14] = new class210();
        }
        Statics.field2035 = null;
    }

    @ObfuscatedName("g.q(IB)V")
    public static void method140(int arg0) {
        if (arg0 == -3) {
            class30.method2110(class148.field2382, class148.field2397, class148.field2219);
        } else if (arg0 == -2) {
            class30.method2110(class148.field2294, class148.field2203, class148.field2194);
        } else if (arg0 == -1) {
            class30.method2110(class148.field2205, class148.field2264, class148.field2177);
        } else if (arg0 == 3) {
            class30.method2110(class148.field2312, class148.field2380, class148.field2210);
        } else if (arg0 == 4) {
            class30.method2110(class148.field2411, class148.field2212, class148.field2202);
        } else if (arg0 == 5) {
            class30.method2110(class148.field2214, class148.field2215, class148.field2216);
        } else if (arg0 == 6) {
            class30.method2110(class148.field2291, class148.field2363, class148.field2297);
        } else if (arg0 == 7) {
            class30.method2110(class148.field2220, class148.field2353, class148.field2176);
        } else if (arg0 == 8) {
            class30.method2110(class148.field2223, class148.field2224, class148.field2225);
        } else if (arg0 == 9) {
            class30.method2110(class148.field2200, class148.field2227, class148.field2287);
        } else if (arg0 == 10) {
            class30.method2110(class148.field2229, class148.field2230, class148.field2231);
        } else if (arg0 == 11) {
            class30.method2110(class148.field2232, class148.field2233, class148.field2198);
        } else if (arg0 == 12) {
            class30.method2110(class148.field2235, class148.field2201, class148.field2237);
        } else if (arg0 == 13) {
            class30.method2110(class148.field2238, class148.field2370, class148.field2299);
        } else if (arg0 == 14) {
            class30.method2110(class148.field2241, class148.field2242, class148.field2243);
        } else if (arg0 == 16) {
            class30.method2110(class148.field2244, class148.field2245, class148.field2246);
        } else if (arg0 == 17) {
            class30.method2110(class148.field2341, class148.field2248, class148.field2340);
        } else if (arg0 == 18) {
            class30.method2110(class148.field2414, class148.field2251, class148.field2252);
        } else if (arg0 == 19) {
            class30.method2110(class148.field2253, class148.field2365, class148.field2255);
        } else if (arg0 == 20) {
            class30.method2110(class148.field2256, class148.field2257, class148.field2258);
        } else if (arg0 == 22) {
            class30.method2110(class148.field2310, class148.field2260, class148.field2261);
        } else if (arg0 == 23) {
            class30.method2110(class148.field2262, class148.field2263, class148.field2218);
        } else if (arg0 == 24) {
            class30.method2110(class148.field2265, class148.field2266, class148.field2267);
        } else if (arg0 == 25) {
            class30.method2110(class148.field2288, class148.field2269, class148.field2270);
        } else if (arg0 == 26) {
            class30.method2110(class148.field2271, class148.field2272, class148.field2273);
        } else if (arg0 == 27) {
            class30.method2110(class148.field2274, class148.field2391, class148.field2276);
        } else if (arg0 == 31) {
            class30.method2110(class148.field2199, class148.field2284, class148.field2285);
        } else if (arg0 == 32) {
            class30.method2110(class148.field2406, class148.field2182, class148.field2226);
        } else if (arg0 == 37) {
            class30.method2110(class148.field2416, class148.field2290, class148.field2307);
        } else if (arg0 == 38) {
            class30.method2110(class148.field2292, class148.field2293, class148.field2317);
        } else if (arg0 == 55) {
            class30.method2110(class148.field2228, class148.field2296, class148.field2170);
        } else if (arg0 == 56) {
            class30.method2110(class148.field2192, class148.field2207, class148.field2300);
            method2387(11);
            return;
        } else if (arg0 == 57) {
            class30.method2110(class148.field2301, class148.field2302, class148.field2303);
            method2387(11);
            return;
        } else {
            class30.method2110(class148.field2304, class148.field2381, class148.field2306);
        }
        method2387(10);
    }

    @ObfuscatedName("n.d(I)V")
    public static final void method539() {
        if (Statics.field285 != null) {
            Statics.field285.method2659();
            Statics.field285 = null;
        }
        method3291();
        Statics.field563.method1660();
        for (int var0 = 0; var0 < 4; var0++) {
            field304[var0].method3686();
        }
        System.gc();
        class173.field2799 = 1;
        Statics.field2800 = null;
        Statics.field2896 = -1;
        Statics.field2801 = -1;
        Statics.field2572 = 0;
        Statics.field2440 = false;
        Statics.field2802 = 2;
        field250 = -1;
        field481 = false;
        for (class22 var1 = (class22) class22.field547.method3378(); var1 != null; var1 = (class22) class22.field547.method3394()) {
            if (var1.field543 != null) {
                Statics.field191.method1000(var1.field543);
                var1.field543 = null;
            }
            if (var1.field548 != null) {
                Statics.field191.method1000(var1.field548);
                var1.field548 = null;
            }
        }
        class22.field547.method3373();
        method2387(10);
    }

    @ObfuscatedName("fm.b(I)V")
    public static final void method3291() {
        class43.field961.method3303();
        class39.field882.method3303();
        class42.field940.method3303();
        class38.field831.method3303();
        class38.field832.method3303();
        class38.field833.method3303();
        class38.field834.method3303();
        class37.method1439();
        class47.field995.method3303();
        class47.field1023.method3303();
        class47.field997.method3303();
        class40.field896.method3303();
        class40.field897.method3303();
        class41.method3097();
        class44.method167();
        Statics.method97();
        class169.method645();
        class164.field2640.method3303();
        class164.field2614.method3303();
        class164.field2615.method3303();
        ((class90) Statics.field1460).method1920();
        class20.field524.method3303();
        Statics.field1851.method2848();
        Statics.field599.method2848();
        Statics.field583.method2848();
        Statics.field2083.method2848();
        Statics.field2081.method2848();
        Statics.field2042.method2848();
        Statics.field1899.method2848();
        Statics.field205.method2848();
        Statics.field1875.method2848();
        Statics.field956.method2848();
        Statics.field195.method2848();
        Statics.field26.method2848();
    }

    @ObfuscatedName("ab.x(I)V")
    public static final void method644() {
        if (field293 > 0) {
            method539();
        } else {
            method2387(40);
            Statics.field2533 = Statics.field285;
            Statics.field285 = null;
        }
    }

    @ObfuscatedName("cw.n(I)V")
    public static final void method2007() {
        if (Statics.field2527 != null) {
            Statics.field2527.method1042();
        }
        if (Statics.field2847 != null) {
            Statics.field2847.method1042();
        }
    }

    @ObfuscatedName("ai.v(I)V")
    public static final void method590() {
        for (int var0 = 0; var0 < field484; var0++) {
            int var10002 = field487[var0]--;
            if (field487[var0] >= -10) {
                class54 var2 = field489[var0];
                if (var2 == null) {
                    class54 var10000 = (class54) null;
                    var2 = class54.method1087(Statics.field2083, field380[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field487[var0] += var2.method1094();
                    field489[var0] = var2;
                }
                if (field487[var0] < 0) {
                    int var9;
                    if (field488[var0] == 0) {
                        var9 = field326;
                    } else {
                        int var3 = (field488[var0] & 0xFF) * 128;
                        int var4 = field488[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field3024.field767;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field488[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field3024.field722;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field487[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field288 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class58 var10 = var2.method1086().method1128(Statics.field2516);
                        class60 var11 = class60.method1156(var10, 100, var9);
                        var11.method1262(field287[var0] - 1);
                        Statics.field191.method999(var11);
                    }
                    field487[var0] = -100;
                }
            } else {
                field484--;
                for (int var1 = var0; var1 < field484; var1++) {
                    field380[var1] = field380[var1 + 1];
                    field489[var1] = field489[var1 + 1];
                    field287[var1] = field287[var1 + 1];
                    field487[var1] = field487[var1 + 1];
                    field488[var1] = field488[var1 + 1];
                }
                var0--;
            }
        }
        if (!field481) {
            return;
        }
        boolean var12;
        if (class173.field2799 == 0) {
            var12 = Statics.field2797.method3195();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field479 != 0 && field250 != -1) {
                class173.method631(Statics.field2042, field250, 0, field479, false);
            }
            field481 = false;
        }
    }

    @ObfuscatedName("gt.p(Lah;IIII)V")
    public static void method3472(class40 arg0, int arg1, int arg2, int arg3) {
        if (field484 >= 50 || field288 == 0 || arg0.field901 == null || arg1 >= arg0.field901.length) {
            return;
        }
        int var4 = arg0.field901[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field380[field484] = var5;
        field287[field484] = var6;
        field487[field484] = 0;
        field489[field484] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field488[field484] = (var8 << 16) + (var9 << 8) + var7;
        field484++;
    }

    @ObfuscatedName("z.k(IIII)V")
    public static void method197(int arg0, int arg1, int arg2) {
        if (field326 == 0 || arg1 == 0 || field484 >= 50) {
            return;
        }
        field380[field484] = arg0;
        field287[field484] = arg1;
        field487[field484] = arg2;
        field489[field484] = null;
        field488[field484] = 0;
        field484++;
    }

    @ObfuscatedName("at.ax(II)V")
    public static void method773(int arg0) {
        if (arg0 == -1 && !field481) {
            class173.method32();
        } else if (arg0 != -1 && field250 != arg0 && field479 != 0 && !field481) {
            class159 var1 = Statics.field2042;
            int var2 = field479;
            class173.field2799 = 1;
            Statics.field2800 = var1;
            Statics.field2896 = arg0;
            Statics.field2801 = 0;
            Statics.field2572 = var2;
            Statics.field2440 = false;
            Statics.field2802 = 2;
        }
        field250 = arg0;
    }

    @ObfuscatedName("r.ap(III)V")
    public static final void method113(int arg0, int arg1) {
        if (field503 != 0 && field503 != 3 || class132.field2013 != 1 && Statics.field517 || class132.field2013 != 4) {
            return;
        }
        int var2 = class132.field2014 - 25 - arg0;
        int var3 = class132.field2006 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field328 + field315 & 0x7FF;
        int var5 = class86.field1449[var4];
        int var6 = class86.field1440[var4];
        int var7 = (field279 + 256) * var5 >> 8;
        int var8 = (field279 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field3024.field767 + var9 >> 7;
        int var12 = Statics.field3024.field722 - var10 >> 7;
        field475.method2438(119);
        field475.method2366(18);
        field475.method2208(Statics.field1653 + var12);
        field475.method2200(class129.field1969[82] ? (class129.field1969[81] ? 2 : 1) : 0);
        field475.method2190(Statics.field545 + var11);
        field475.method2366(var2);
        field475.method2366(var3);
        field475.method2190(field328);
        field475.method2366(57);
        field475.method2366(field315);
        field475.method2366(field279);
        field475.method2366(89);
        field475.method2190(Statics.field3024.field767);
        field475.method2190(Statics.field3024.field722);
        field475.method2366(63);
        field476 = var11;
        field496 = var12;
    }

    @ObfuscatedName("cz.ao(Ljava/lang/String;I)V")
    public static final void method2092(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1806.field128 = !Statics.field1806.field128;
            class9.method1068();
            if (Statics.field1806.field128) {
                class11.method35(99, "", "Roofs are now all hidden");
            } else {
                class11.method35(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field412 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field262 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field262 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method644();
            }
            if (arg0.equalsIgnoreCase("errortest") && field247 == 2) {
                throw new RuntimeException();
            }
        }
        field475.method2438(0);
        field475.method2366(arg0.length() + 1);
        field475.method2177(arg0);
    }

    @ObfuscatedName("aw.ai(I)V")
    public static final void method616() {
        for (int var0 = -1; var0 < field364; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field365[var0];
            }
            class3 var2 = field363[var1];
            if (var2 != null) {
                Statics.method547(var2, 1);
            }
        }
    }

    @ObfuscatedName("df.am(Lab;B)V")
    public static final void method2117(class35 arg0) {
        int var1 = arg0.field726 - field256;
        int var2 = arg0.field775 * 64 + arg0.field763 * 128;
        int var3 = arg0.field775 * 64 + arg0.field765 * 128;
        arg0.field767 += (var2 - arg0.field767) / var1;
        arg0.field722 += (var3 - arg0.field722) / var1;
        arg0.field779 = 0;
        if (arg0.field769 == 0) {
            arg0.field772 = 1024;
        }
        if (arg0.field769 == 1) {
            arg0.field772 = 1536;
        }
        if (arg0.field769 == 2) {
            arg0.field772 = 0;
        }
        if (arg0.field769 == 3) {
            arg0.field772 = 512;
        }
    }

    @ObfuscatedName("cq.au(Lab;B)V")
    public static final void method1925(class35 arg0) {
        if (field256 == arg0.field746 || arg0.field782 == -1 || arg0.field756 != 0 || arg0.field755 + 1 > class40.method1826(arg0.field782).field894[arg0.field754]) {
            int var1 = arg0.field746 - arg0.field726;
            int var2 = field256 - arg0.field726;
            int var3 = arg0.field775 * 64 + arg0.field763 * 128;
            int var4 = arg0.field775 * 64 + arg0.field765 * 128;
            int var5 = arg0.field775 * 64 + arg0.field762 * 128;
            int var6 = arg0.field775 * 64 + arg0.field766 * 128;
            arg0.field767 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field722 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field779 = 0;
        if (arg0.field769 == 0) {
            arg0.field772 = 1024;
        }
        if (arg0.field769 == 1) {
            arg0.field772 = 1536;
        }
        if (arg0.field769 == 2) {
            arg0.field772 = 0;
        }
        if (arg0.field769 == 3) {
            arg0.field772 = 512;
        }
        arg0.field725 = arg0.field772;
    }

    @ObfuscatedName("v.ae(Lab;I)V")
    public static final void method544(class35 arg0) {
        if (arg0.field753 == 0) {
            return;
        }
        if (arg0.field731 != -1 && arg0.field731 < 32768) {
            class32 var1 = field397[arg0.field731];
            if (var1 != null) {
                int var2 = arg0.field767 - var1.field767;
                int var3 = arg0.field722 - var1.field722;
                if (var2 != 0 || var3 != 0) {
                    arg0.field772 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field731 >= 32768) {
            int var4 = arg0.field731 - 32768;
            if (field369 == var4) {
                var4 = 2047;
            }
            class3 var5 = field363[var4];
            if (var5 != null) {
                int var6 = arg0.field767 - var5.field767;
                int var7 = arg0.field722 - var5.field722;
                if (var6 != 0 || var7 != 0) {
                    arg0.field772 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field748 != 0 || arg0.field734 != 0) && (arg0.field764 == 0 || arg0.field779 > 0)) {
            int var8 = arg0.field767 - (arg0.field748 * 64 - Statics.field545 * 64 - Statics.field545 * 64);
            int var9 = arg0.field722 - (arg0.field734 * 64 - Statics.field1653 * 64 - Statics.field1653 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field772 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field748 = 0;
            arg0.field734 = 0;
        }
        int var10 = arg0.field772 - arg0.field725 & 0x7FF;
        if (var10 == 0) {
            arg0.field773 = 0;
            return;
        }
        arg0.field773++;
        if (var10 > 1024) {
            arg0.field725 -= arg0.field753;
            boolean var11 = true;
            if (var10 < arg0.field753 || var10 > 2048 - arg0.field753) {
                arg0.field725 = arg0.field772;
                var11 = false;
            }
            if (arg0.field761 == arg0.field750 && (arg0.field773 > 25 || var11)) {
                if (arg0.field727 == -1) {
                    arg0.field750 = arg0.field729;
                } else {
                    arg0.field750 = arg0.field727;
                }
            }
        } else {
            arg0.field725 += arg0.field753;
            boolean var12 = true;
            if (var10 < arg0.field753 || var10 > 2048 - arg0.field753) {
                arg0.field725 = arg0.field772;
                var12 = false;
            }
            if (arg0.field761 == arg0.field750 && (arg0.field773 > 25 || var12)) {
                if (arg0.field728 == -1) {
                    arg0.field750 = arg0.field729;
                } else {
                    arg0.field750 = arg0.field728;
                }
            }
        }
        arg0.field725 &= 0x7FF;
    }

    @ObfuscatedName("j.ab(Ll;III)V")
    public static void method175(class3 arg0, int arg1, int arg2) {
        if (arg0.field782 == arg1 && arg1 != -1) {
            int var3 = class40.method1826(arg1).field905;
            if (var3 == 1) {
                arg0.field754 = 0;
                arg0.field755 = 0;
                arg0.field756 = arg2;
                arg0.field757 = 0;
            }
            if (var3 == 2) {
                arg0.field757 = 0;
            }
        } else if (arg1 == -1 || arg0.field782 == -1 || class40.method1826(arg1).field900 >= class40.method1826(arg0.field782).field900) {
            arg0.field782 = arg1;
            arg0.field754 = 0;
            arg0.field755 = 0;
            arg0.field756 = arg2;
            arg0.field757 = 0;
            arg0.field780 = arg0.field764;
        }
    }

    @ObfuscatedName("dm.av(Ljava/lang/String;ZI)V")
    public static final void method2434(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3016.method3563(arg0, 250);
        int var6 = Statics.field3016.method3578(arg0, 250) * 13;
        class75.method1575(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class75.method1580(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3016.method3569(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method500(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method1905(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field2498.getGraphics();
            Statics.field580.method1395(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field2498.repaint();
        }
    }

    @ObfuscatedName("y.ay(IIIII)V")
    public static final void method206(int arg0, int arg1, int arg2, int arg3) {
        class75.method1612(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class86.method1829();
        field347++;
        method2653(class31.field684);
        boolean var4 = false;
        if (field377 >= 0) {
            for (int var5 = 0; var5 < field364; var5++) {
                if (field377 == field365[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method2653(class31.field681);
        }
        method43(true);
        method2653(var4 ? class31.field683 : class31.field680);
        method43(false);
        for (class7 var6 = (class7) field355.method3378(); var6 != null; var6 = (class7) field355.method3394()) {
            if (Statics.field2842 != var6.field90 || field256 > var6.field96) {
                var6.method3463();
            } else if (field256 >= var6.field116) {
                if (var6.field108 > 0) {
                    class32 var7 = field397[var6.field108 - 1];
                    if (var7 != null && var7.field767 >= 0 && var7.field767 < 13312 && var7.field722 >= 0 && var7.field722 < 13312) {
                        var6.method99(var7.field767, var7.field722, method2008(var7.field767, var7.field722, var6.field90) - var6.field94, field256);
                    }
                }
                if (var6.field108 < 0) {
                    int var8 = -var6.field108 - 1;
                    class3 var9;
                    if (field369 == var8) {
                        var9 = Statics.field3024;
                    } else {
                        var9 = field363[var8];
                    }
                    if (var9 != null && var9.field767 >= 0 && var9.field767 < 13312 && var9.field722 >= 0 && var9.field722 < 13312) {
                        var6.method99(var9.field767, var9.field722, method2008(var9.field767, var9.field722, var6.field90) - var6.field94, field256);
                    }
                }
                var6.method102(field398);
                Statics.field563.method1671(Statics.field2842, (int) var6.field101, (int) var6.field102, (int) var6.field103, 60, var6, var6.field109, -1, false);
            }
        }
        for (class28 var10 = (class28) field430.method3378(); var10 != null; var10 = (class28) field430.method3394()) {
            if (Statics.field2842 != var10.field630 || var10.field624) {
                var10.method3463();
            } else if (field256 >= var10.field622) {
                var10.method569(field398);
                if (var10.field624) {
                    var10.method3463();
                } else {
                    Statics.field563.method1671(var10.field630, var10.field623, var10.field625, var10.field626, 60, var10, 0, -1, false);
                }
            }
        }
        if (!field490) {
            int var11 = field327;
            if (field316 / 256 > var11) {
                var11 = field316 / 256;
            }
            if (field491[4] && field321[4] + 128 > var11) {
                var11 = field321[4] + 128;
            }
            int var12 = field495 + field328 & 0x7FF;
            method1911(Statics.field1833, method2008(Statics.field3024.field767, Statics.field3024.field722, Statics.field2842) - 50, Statics.field631, var11, var12, var11 * 3 + 600);
        }
        int var13;
        if (field490) {
            int var14;
            if (Statics.field1806.field128) {
                var14 = Statics.field2842;
            } else {
                int var15 = method2008(Statics.field2496, Statics.field11, Statics.field2842);
                if (var15 - Statics.field2493 >= 800 || (class6.field70[Statics.field2842][Statics.field2496 >> 7][Statics.field11 >> 7] & 0x4) == 0) {
                    var14 = 3;
                } else {
                    var14 = Statics.field2842;
                }
            }
            var13 = var14;
        } else {
            var13 = method112();
        }
        int var16 = Statics.field2496;
        int var17 = Statics.field2493;
        int var18 = Statics.field11;
        int var19 = Statics.field177;
        int var20 = Statics.field2449;
        for (int var21 = 0; var21 < 5; var21++) {
            if (field491[var21]) {
                int var22 = (int) (Math.random() * (double) (field492[var21] * 2 + 1) - (double) field492[var21] + Math.sin((double) field494[var21] / 100.0D * (double) field483[var21]) * (double) field321[var21]);
                if (var21 == 0) {
                    Statics.field2496 += var22;
                }
                if (var21 == 1) {
                    Statics.field2493 += var22;
                }
                if (var21 == 2) {
                    Statics.field11 += var22;
                }
                if (var21 == 3) {
                    Statics.field2449 = Statics.field2449 + var22 & 0x7FF;
                }
                if (var21 == 4) {
                    Statics.field177 += var22;
                    if (Statics.field177 < 128) {
                        Statics.field177 = 128;
                    }
                    if (Statics.field177 > 383) {
                        Statics.field177 = 383;
                    }
                }
            }
        }
        int var23 = class132.field2007;
        int var24 = class132.field2008;
        if (class132.field2013 != 0) {
            var23 = class132.field2014;
            var24 = class132.field2006;
        }
        if (var23 >= arg0 && var23 < arg0 + arg2 && var24 >= arg1 && var24 < arg1 + arg3) {
            class100.field1717 = true;
            class100.field1733 = 0;
            class100.field1731 = var23 - arg0;
            class100.field1732 = var24 - arg1;
        } else {
            class100.field1717 = false;
            class100.field1733 = 0;
        }
        method2007();
        class75.method1575(arg0, arg1, arg2, arg3, 0);
        method2007();
        Statics.field563.method1675(Statics.field2496, Statics.field2493, Statics.field11, Statics.field177, Statics.field2449, var13);
        method2007();
        Statics.field563.method1674();
        field336 = 0;
        boolean var25 = false;
        int var26 = -1;
        for (int var27 = -1; var27 < field364 + field283; var27++) {
            class35 var28;
            if (var27 == -1) {
                var28 = Statics.field3024;
            } else if (var27 < field364) {
                var28 = field363[field365[var27]];
                if (field377 == field365[var27]) {
                    var25 = true;
                    var26 = var27;
                    continue;
                }
            } else {
                var28 = field397[field284[var27 - field364]];
            }
            method609(var28, var27, arg0, arg1, arg2, arg3);
        }
        if (var25) {
            method609(field363[field377], var26, arg0, arg1, arg2, arg3);
        }
        for (int var29 = 0; var29 < field336; var29++) {
            int var30 = field301[var29];
            int var31 = field399[var29];
            int var32 = field333[var29];
            int var33 = field340[var29];
            boolean var34 = true;
            while (var34) {
                var34 = false;
                for (int var35 = 0; var35 < var29; var35++) {
                    if (var31 + 2 > field399[var35] - field340[var35] && var31 - var33 < field399[var35] + 2 && var30 - var32 < field333[var35] + field301[var35] && var30 + var32 > field301[var35] - field333[var35] && field399[var35] - field340[var35] < var31) {
                        var31 = field399[var35] - field340[var35];
                        var34 = true;
                    }
                }
            }
            field286 = field301[var29];
            field374 = field399[var29] = var31;
            String var36 = field345[var29];
            if (field407 == 0) {
                int var37 = 16776960;
                if (field303[var29] < 6) {
                    var37 = field478[field303[var29]];
                }
                if (field303[var29] == 6) {
                    var37 = field347 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field303[var29] == 7) {
                    var37 = field347 % 20 < 10 ? 255 : 65535;
                }
                if (field303[var29] == 8) {
                    var37 = field347 % 20 < 10 ? 45056 : 8454016;
                }
                if (field303[var29] == 9) {
                    int var38 = 150 - field344[var29];
                    if (var38 < 50) {
                        var37 = var38 * 1280 + 16711680;
                    } else if (var38 < 100) {
                        var37 = 16776960 - (var38 - 50) * 327680;
                    } else if (var38 < 150) {
                        var37 = (var38 - 100) * 5 + 65280;
                    }
                }
                if (field303[var29] == 10) {
                    int var39 = 150 - field344[var29];
                    if (var39 < 50) {
                        var37 = var39 * 5 + 16711680;
                    } else if (var39 < 100) {
                        var37 = 16711935 - (var39 - 50) * 327680;
                    } else if (var39 < 150) {
                        var37 = (var39 - 100) * 327680 + 255 - (var39 - 100) * 5;
                    }
                }
                if (field303[var29] == 11) {
                    int var40 = 150 - field344[var29];
                    if (var40 < 50) {
                        var37 = 16777215 - var40 * 327685;
                    } else if (var40 < 100) {
                        var37 = (var40 - 50) * 327685 + 65280;
                    } else if (var40 < 150) {
                        var37 = 16777215 - (var40 - 100) * 327680;
                    }
                }
                if (field343[var29] == 0) {
                    Statics.field3025.method3566(var36, field286 + arg0, field374 + arg1, var37, 0);
                }
                if (field343[var29] == 1) {
                    Statics.field3025.method3570(var36, field286 + arg0, field374 + arg1, var37, 0, field347);
                }
                if (field343[var29] == 2) {
                    Statics.field3025.method3571(var36, field286 + arg0, field374 + arg1, var37, 0, field347);
                }
                if (field343[var29] == 3) {
                    Statics.field3025.method3572(var36, field286 + arg0, field374 + arg1, var37, 0, field347, 150 - field344[var29]);
                }
                if (field343[var29] == 4) {
                    int var41 = (150 - field344[var29]) * (Statics.field3025.method3592(var36) + 100) / 150;
                    class75.method1573(field286 + arg0 - 50, arg1, field286 + arg0 + 50, arg1 + arg3);
                    Statics.field3025.method3622(var36, field286 + arg0 + 50 - var41, field374 + arg1, var37, 0);
                    class75.method1612(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field343[var29] == 5) {
                    int var42 = 150 - field344[var29];
                    int var43 = 0;
                    if (var42 < 25) {
                        var43 = var42 - 25;
                    } else if (var42 > 125) {
                        var43 = var42 - 125;
                    }
                    class75.method1573(arg0, field374 + arg1 - Statics.field3025.field3050 - 1, arg0 + arg2, field374 + arg1 + 5);
                    Statics.field3025.method3566(var36, field286 + arg0, field374 + arg1 + var43, var37, 0);
                    class75.method1612(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field3025.method3566(var36, field286 + arg0, field374 + arg1, 16776960, 0);
            }
        }
        if (field264 == 2) {
            method1904((field461 - Statics.field545 << 7) + field270, (field268 - Statics.field1653 << 7) + field271, field269 * 2);
            if (field286 > -1 && field256 % 20 < 10) {
                Statics.field68[0].method1494(field286 + arg0 - 12, field374 + arg1 - 28);
            }
        }
        ((class90) Statics.field1460).method1915(field398);
        if (field353 == 1) {
            Statics.field14[field352 / 100].method1494(field267 - 8, field351 - 8);
        }
        if (field353 == 2) {
            Statics.field14[field352 / 100 + 4].method1494(field267 - 8, field351 - 8);
        }
        field362 = 0;
        int var44 = (Statics.field3024.field767 >> 7) + Statics.field545;
        int var45 = (Statics.field3024.field722 >> 7) + Statics.field1653;
        if (var44 >= 3053 && var44 <= 3156 && var45 >= 3056 && var45 <= 3136) {
            field362 = 1;
        }
        if (var44 >= 3072 && var44 <= 3118 && var45 >= 9492 && var45 <= 9535) {
            field362 = 1;
        }
        if (field362 == 1 && var44 >= 3139 && var44 <= 3199 && var45 >= 3008 && var45 <= 3062) {
            field362 = 0;
        }
        if (field262) {
            int var46 = arg0 + 512 - 5;
            int var47 = arg1 + 20;
            Statics.field3016.method3597("Fps:" + field2057, var46, var47, 16776960, -1);
            int var51 = var47 + 15;
            Runtime var48 = Runtime.getRuntime();
            int var49 = (int) ((var48.totalMemory() - var48.freeMemory()) / 1024L);
            int var50 = 16776960;
            if (var49 > 32768 && field241) {
                var50 = 16711680;
            }
            if (var49 > 65536 && !field241) {
                var50 = 16711680;
            }
            Statics.field3016.method3597("Mem:" + var49 + "k", var46, var51, var50, -1);
            var47 = var51 + 15;
        }
        Statics.field2496 = var16;
        Statics.field2493 = var17;
        Statics.field11 = var18;
        Statics.field177 = var19;
        Statics.field2449 = var20;
        if (field255 && class162.method2771(true, false) == 0) {
            field255 = false;
        }
        if (field255) {
            class75.method1575(arg0, arg1, arg2, arg3, 0);
            method2434(class148.field2169, false);
        }
    }

    @ObfuscatedName("ep.ag(Law;S)V")
    public static final void method2653(class31 arg0) {
        if (Statics.field3024.field767 >> 7 == field476 && Statics.field3024.field722 >> 7 == field496) {
            field476 = 0;
        }
        int var1 = field364;
        if (class31.field684 == arg0 || class31.field681 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class31.field684 == arg0) {
                var3 = Statics.field3024;
                var4 = 33538048;
            } else if (class31.field681 == arg0) {
                var3 = field363[field377];
                var4 = field377 << 14;
            } else {
                var3 = field363[field365[var2]];
                var4 = field365[var2] << 14;
                if (class31.field683 == arg0 && field377 == field365[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method25() && !var3.field33) {
                var3.field42 = false;
                if ((field241 && field364 > 50 || field364 > 200) && class31.field684 != arg0 && var3.field761 == var3.field750) {
                    var3.field42 = true;
                }
                int var5 = var3.field767 >> 7;
                int var6 = var3.field722 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field45 == null || field256 < var3.field40 || field256 >= var3.field53) {
                        if ((var3.field767 & 0x7F) == 64 && (var3.field722 & 0x7F) == 64) {
                            if (field347 == field346[var5][var6]) {
                                continue;
                            }
                            field346[var5][var6] = field347;
                        }
                        var3.field39 = method2008(var3.field767, var3.field722, Statics.field2842);
                        Statics.field563.method1671(Statics.field2842, var3.field767, var3.field722, var3.field39, 60, var3, var3.field725, var4, var3.field724);
                    } else {
                        var3.field42 = false;
                        var3.field39 = method2008(var3.field767, var3.field722, Statics.field2842);
                        Statics.field563.method1672(Statics.field2842, var3.field767, var3.field722, var3.field39, 60, var3, var3.field725, var4, var3.field46, var3.field47, var3.field48, var3.field49);
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.aj(ZI)V")
    public static final void method43(boolean arg0) {
        for (int var1 = 0; var1 < field283; var1++) {
            class32 var2 = field397[field284[var1]];
            int var3 = (field284[var1] << 14) + 536870912;
            if (var2 != null && var2.method25() && var2.field691.field815 == arg0 && var2.field691.method655()) {
                int var4 = var2.field767 >> 7;
                int var5 = var2.field722 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field775 == 1 && (var2.field767 & 0x7F) == 64 && (var2.field722 & 0x7F) == 64) {
                        if (field347 == field346[var4][var5]) {
                            continue;
                        }
                        field346[var4][var5] = field347;
                    }
                    if (!var2.field691.field823) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field563.method1671(Statics.field2842, var2.field767, var2.field722, method2008(var2.field767 + (var2.field775 * 64 - 64), var2.field722 + (var2.field775 * 64 - 64), Statics.field2842), var2.field775 * 64 - 64 + 60, var2, var2.field725, var3, var2.field724);
                }
            }
        }
    }

    @ObfuscatedName("r.ah(B)I")
    public static final int method112() {
        if (Statics.field1806.field128) {
            return Statics.field2842;
        }
        int var0 = 3;
        if (Statics.field177 < 310) {
            int var1 = Statics.field2496 >> 7;
            int var2 = Statics.field11 >> 7;
            int var3 = Statics.field3024.field767 >> 7;
            int var4 = Statics.field3024.field722 >> 7;
            if ((class6.field70[Statics.field2842][var1][var2] & 0x4) != 0) {
                var0 = Statics.field2842;
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
                    if ((class6.field70[Statics.field2842][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2842;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field70[Statics.field2842][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2842;
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
                    if ((class6.field70[Statics.field2842][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2842;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field70[Statics.field2842][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2842;
                        }
                    }
                }
            }
        }
        if ((class6.field70[Statics.field2842][Statics.field3024.field767 >> 7][Statics.field3024.field722 >> 7] & 0x4) != 0) {
            var0 = Statics.field2842;
        }
        return var0;
    }

    @ObfuscatedName("ai.at(Lab;IIIIIB)V")
    public static final void method609(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method25()) {
            return;
        }
        if (arg0 instanceof class32) {
            class37 var6 = ((class32) arg0).field691;
            if (var6.field807 != null) {
                var6 = var6.method654();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field364) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field33) {
                return;
            }
            if (var8.field35 != -1 || var8.field36 != -1) {
                method2969(arg0, arg0.field771 + 15);
                if (field286 > -1) {
                    if (var8.field35 != -1) {
                        Statics.field196[var8.field35].method1494(field286 + arg2 - 12, field374 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field36 != -1) {
                        Statics.field1438[var8.field36].method1494(field286 + arg2 - 12, field374 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field264 == 10 && field266 == field365[arg1]) {
                method2969(arg0, arg0.field771 + 15);
                if (field286 > -1) {
                    Statics.field68[1].method1494(field286 + arg2 - 12, field374 + arg3 - var7);
                }
            }
        } else {
            class37 var9 = ((class32) arg0).field691;
            if (var9.field807 != null) {
                var9 = var9.method654();
            }
            if (var9.field827 >= 0 && var9.field827 < Statics.field1438.length) {
                method2969(arg0, arg0.field771 + 15);
                if (field286 > -1) {
                    Statics.field1438[var9.field827].method1494(field286 + arg2 - 12, field374 + arg3 - 30);
                }
            }
            if (field264 == 1 && field275 == field284[arg1 - field364] && field256 % 20 < 10) {
                method2969(arg0, arg0.field771 + 15);
                if (field286 > -1) {
                    Statics.field68[0].method1494(field286 + arg2 - 12, field374 + arg3 - 28);
                }
            }
        }
        if (arg0.field736 != null && (arg1 >= field364 || !arg0.field777 && (field272 == 4 || !arg0.field741 && (field272 == 0 || field272 == 3 || field272 == 1 && method98(((class3) arg0).field43, false))))) {
            method2969(arg0, arg0.field771);
            if (field286 > -1 && field336 < field273) {
                field333[field336] = Statics.field3025.method3592(arg0.field736) / 2;
                field340[field336] = Statics.field3025.field3050;
                field301[field336] = field286;
                field399[field336] = field374;
                field303[field336] = arg0.field738;
                field343[field336] = arg0.field739;
                field344[field336] = arg0.field737;
                field345[field336] = arg0.field736;
                field336++;
            }
        }
        if (arg0.field730 > field256) {
            method2969(arg0, arg0.field771 + 15);
            if (field286 > -1) {
                int var10;
                if (arg1 < field364) {
                    var10 = 30;
                } else {
                    class37 var11 = ((class32) arg0).field691;
                    var10 = var11.field824;
                }
                int var12 = arg0.field745 * var10 / arg0.field781;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field745 > 0) {
                    var12 = 1;
                }
                class75.method1575(field286 + arg2 - var10 / 2, field374 + arg3 - 3, var12, 5, 65280);
                class75.method1575(field286 + arg2 - var10 / 2 + var12, field374 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field743[var13] > field256) {
                method2969(arg0, arg0.field771 / 2);
                if (field286 > -1) {
                    if (var13 == 1) {
                        field374 -= 20;
                    }
                    if (var13 == 2) {
                        field286 -= 15;
                        field374 -= 10;
                    }
                    if (var13 == 3) {
                        field286 += 15;
                        field374 -= 10;
                    }
                    Statics.field605[arg0.field744[var13]].method1494(field286 + arg2 - 12, field374 + arg3 - 12);
                    Statics.field560.method3566(Integer.toString(arg0.field721[var13]), field286 + arg2 - 1, field374 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("fe.al(Lab;IB)V")
    public static final void method2969(class35 arg0, int arg1) {
        method1904(arg0.field767, arg0.field722, arg1);
    }

    @ObfuscatedName("cm.ak(IIIB)V")
    public static final void method1904(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field286 = -1;
            field374 = -1;
            return;
        }
        int var3 = method2008(arg0, arg1, Statics.field2842) - arg2;
        int var4 = arg0 - Statics.field2496;
        int var5 = var3 - Statics.field2493;
        int var6 = arg1 - Statics.field11;
        int var7 = class86.field1449[Statics.field177];
        int var8 = class86.field1440[Statics.field177];
        int var9 = class86.field1449[Statics.field2449];
        int var10 = class86.field1440[Statics.field2449];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field286 = (var11 << 9) / var15 + 256;
            field374 = (var14 << 9) / var15 + 167;
        } else {
            field286 = -1;
            field374 = -1;
        }
    }

    @ObfuscatedName("cl.ar(IIII)I")
    public static final int method2008(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field70[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field78[var5][var3][var4] + class6.field78[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field78[var5][var3][var4 + 1] + class6.field78[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("cj.aq(IIIIIIB)V")
    public static final void method1911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class86.field1449[var6];
            int var12 = class86.field1440[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class86.field1449[var7];
            int var15 = class86.field1440[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field2496 = arg0 - var8;
        Statics.field2493 = arg1 - var9;
        Statics.field11 = arg2 - var10;
        Statics.field177 = arg3;
        Statics.field2449 = arg4;
    }

    @ObfuscatedName("y.ac(ZB)V")
    public static final void method210(boolean arg0) {
        field305 = arg0;
        if (!field305) {
            int var1 = field258.method2278();
            int var2 = field258.method2209();
            int var3 = (field289 - field258.field1834) / 16;
            Statics.field1 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1[var4][var5] = field258.method2220();
                }
            }
            int var6 = field258.method2209();
            int var7 = field258.method2209();
            int var8 = field258.method2202();
            Statics.field720 = new int[var3];
            Statics.field637 = new int[var3];
            Statics.field1639 = new int[var3];
            Statics.field1918 = new byte[var3][];
            Statics.field768 = new byte[var3][];
            boolean var9 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var6 / 8 == 48) {
                var9 = true;
            }
            if (var2 / 8 == 48 && var6 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var2 - 6) / 8; var11 <= (var2 + 6) / 8; var11++) {
                for (int var12 = (var6 - 6) / 8; var12 <= (var6 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field720[var10] = var13;
                        Statics.field637[var10] = Statics.field2081.method2912("m" + var11 + "_" + var12);
                        Statics.field1639[var10] = Statics.field2081.method2912("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method38(var2, var6, var8, var1, var7);
            return;
        }
        int var14 = field258.method2336();
        field258.method2456();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field258.method2443(1);
                    if (var18 == 1) {
                        field505[var15][var16][var17] = field258.method2443(26);
                    } else {
                        field505[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field258.method2442();
        int var19 = (field289 - field258.field1834) / 16;
        Statics.field1 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field1[var20][var21] = field258.method2378();
            }
        }
        int var22 = field258.method2278();
        int var23 = field258.method2209();
        int var24 = field258.method2209();
        int var25 = field258.method2210();
        Statics.field720 = new int[var19];
        Statics.field637 = new int[var19];
        Statics.field1639 = new int[var19];
        Statics.field1918 = new byte[var19][];
        Statics.field768 = new byte[var19][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field505[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field720[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field720[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field637[var26] = Statics.field2081.method2912("m" + var35 + "_" + var36);
                            Statics.field1639[var26] = Statics.field2081.method2912("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method38(var25, var22, var14, var23, var24);
    }

    @ObfuscatedName("c.ad(IIIIIB)V")
    public static final void method38(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1268 == arg0 && Statics.field2913 == arg1 && field298 == arg2 || !field241) {
            return;
        }
        Statics.field1268 = arg0;
        Statics.field2913 = arg1;
        field298 = arg2;
        if (!field241) {
            field298 = 0;
        }
        method2387(25);
        method2434(class148.field2169, true);
        int var5 = Statics.field545;
        int var6 = Statics.field1653;
        Statics.field545 = (arg0 - 6) * 8;
        Statics.field1653 = (arg1 - 6) * 8;
        int var7 = Statics.field545 - var5;
        int var8 = Statics.field1653 - var6;
        int var9 = Statics.field545;
        int var10 = Statics.field1653;
        for (int var11 = 0; var11 < 32768; var11++) {
            class32 var12 = field397[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field776[var13] -= var7;
                    var12.field723[var13] -= var8;
                }
                var12.field767 -= var7 * 128;
                var12.field722 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field363[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field776[var16] -= var7;
                    var15.field723[var16] -= var8;
                }
                var15.field767 -= var7 * 128;
                var15.field722 -= var8 * 128;
            }
        }
        Statics.field2842 = arg2;
        Statics.field3024.method633(arg3, arg4, false);
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
                        field378[var27][var23][var24] = field378[var27][var25][var26];
                    } else {
                        field378[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class16 var28 = (class16) field265.method3378(); var28 != null; var28 = (class16) field265.method3394()) {
            var28.field220 -= var7;
            var28.field208 -= var8;
            if (var28.field220 < 0 || var28.field208 < 0 || var28.field220 >= 104 || var28.field208 >= 104) {
                var28.method3463();
            }
        }
        if (field476 != 0) {
            field476 -= var7;
            field496 -= var8;
        }
        field484 = 0;
        field490 = false;
        field471 = -1;
        field430.method3373();
        field355.method3373();
    }

    @ObfuscatedName("fj.an(ZI)V")
    public static final void method2955(boolean arg0) {
        method2007();
        field465++;
        if (field465 < 50 && !arg0) {
            return;
        }
        field465 = 0;
        if (field295 || Statics.field285 == null) {
            return;
        }
        field475.method2438(94);
        try {
            Statics.field285.method2663(field475.field1835, 0, field475.field1834);
            field475.field1834 = 0;
        } catch (IOException var2) {
            field295 = true;
        }
    }

    @ObfuscatedName("r.az(I)V")
    public static final void method115() {
        method2955(false);
        field299 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1918.length; var1++) {
            if (Statics.field637[var1] != -1 && Statics.field1918[var1] == null) {
                Statics.field1918[var1] = Statics.field2081.method2843(Statics.field637[var1], 0);
                if (Statics.field1918[var1] == null) {
                    var0 = false;
                    field299++;
                }
            }
            if (Statics.field1639[var1] != -1 && Statics.field768[var1] == null) {
                Statics.field768[var1] = Statics.field2081.method2857(Statics.field1639[var1], 0, Statics.field1[var1]);
                if (Statics.field768[var1] == null) {
                    var0 = false;
                    field299++;
                }
            }
        }
        if (!var0) {
            field482 = 1;
            return;
        }
        field389 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1918.length; var3++) {
            byte[] var4 = Statics.field768[var3];
            if (var4 != null) {
                int var5 = (Statics.field720[var3] >> 8) * 64 - Statics.field545;
                int var6 = (Statics.field720[var3] & 0xFF) * 64 - Statics.field1653;
                if (field305) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class111 var9 = new class111(var4);
                int var10 = -1;
                label1076: while (true) {
                    int var11 = var9.method2188();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2188();
                            if (var16 == 0) {
                                continue label1076;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2176() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class38 var22 = class38.method189(var10);
                                if (var19 != 22 || !field241 || var22.field876 != 0 || var22.field844 == 1 || var22.field843) {
                                    if (!var22.method702()) {
                                        field389++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2188();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2176();
                    }
                }
            }
        }
        if (!var2) {
            field482 = 2;
            return;
        }
        if (field482 != 0) {
            method2434(class148.field2169 + class2.field23 + class2.field20 + 100 + "%" + class2.field19, true);
        }
        method2007();
        method3291();
        method2007();
        Statics.field563.method1660();
        method2007();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field304[var23].method3686();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field70[var24][var25][var26] = 0;
                }
            }
        }
        method2007();
        class6.method617();
        int var27 = Statics.field1918.length;
        for (class22 var28 = (class22) class22.field547.method3378(); var28 != null; var28 = (class22) class22.field547.method3394()) {
            if (var28.field543 != null) {
                Statics.field191.method1000(var28.field543);
                var28.field543 = null;
            }
            if (var28.field548 != null) {
                Statics.field191.method1000(var28.field548);
                var28.field548 = null;
            }
        }
        class22.field547.method3373();
        method2955(true);
        if (!field305) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field720[var29] >> 8) * 64 - Statics.field545;
                int var31 = (Statics.field720[var29] & 0xFF) * 64 - Statics.field1653;
                byte[] var32 = Statics.field1918[var29];
                if (var32 != null) {
                    method2007();
                    int var33 = Statics.field1268 * 8 - 48;
                    int var34 = Statics.field2913 * 8 - 48;
                    class219[] var35 = field304;
                    for (int var36 = 0; var36 < 4; var36++) {
                        for (int var37 = 0; var37 < 64; var37++) {
                            for (int var38 = 0; var38 < 64; var38++) {
                                if (var30 + var37 > 0 && var30 + var37 < 103 && var31 + var38 > 0 && var31 + var38 < 103) {
                                    var35[var36].field3078[var30 + var37][var31 + var38] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class111 var39 = new class111(var32);
                    for (int var40 = 0; var40 < 4; var40++) {
                        for (int var41 = 0; var41 < 64; var41++) {
                            for (int var42 = 0; var42 < 64; var42++) {
                                class6.method1475(var39, var40, var30 + var41, var31 + var42, var33, var34, 0);
                            }
                        }
                    }
                }
            }
            for (int var43 = 0; var43 < var27; var43++) {
                int var44 = (Statics.field720[var43] >> 8) * 64 - Statics.field545;
                int var45 = (Statics.field720[var43] & 0xFF) * 64 - Statics.field1653;
                byte[] var46 = Statics.field1918[var43];
                if (var46 == null && Statics.field2913 < 800) {
                    method2007();
                    class6.method545(var44, var45, 64, 64);
                }
            }
            method2955(true);
            for (int var47 = 0; var47 < var27; var47++) {
                byte[] var48 = Statics.field768[var47];
                if (var48 != null) {
                    int var49 = (Statics.field720[var47] >> 8) * 64 - Statics.field545;
                    int var50 = (Statics.field720[var47] & 0xFF) * 64 - Statics.field1653;
                    method2007();
                    class6.method34(var48, var49, var50, Statics.field563, field304);
                }
            }
        }
        if (field305) {
            for (int var51 = 0; var51 < 4; var51++) {
                method2007();
                for (int var52 = 0; var52 < 13; var52++) {
                    for (int var53 = 0; var53 < 13; var53++) {
                        boolean var54 = false;
                        int var55 = field505[var51][var52][var53];
                        if (var55 != -1) {
                            int var56 = var55 >> 24 & 0x3;
                            int var57 = var55 >> 1 & 0x3;
                            int var58 = var55 >> 14 & 0x3FF;
                            int var59 = var55 >> 3 & 0x7FF;
                            int var60 = (var58 / 8 << 8) + var59 / 8;
                            for (int var61 = 0; var61 < Statics.field720.length; var61++) {
                                if (Statics.field720[var61] == var60 && Statics.field1918[var61] != null) {
                                    class6.method678(Statics.field1918[var61], var51, var52 * 8, var53 * 8, var56, (var58 & 0x7) * 8, (var59 & 0x7) * 8, var57, field304);
                                    var54 = true;
                                    break;
                                }
                            }
                        }
                        if (!var54) {
                            class6.method36(var51, var52 * 8, var53 * 8);
                        }
                    }
                }
            }
            for (int var62 = 0; var62 < 13; var62++) {
                for (int var63 = 0; var63 < 13; var63++) {
                    int var64 = field505[0][var62][var63];
                    if (var64 == -1) {
                        class6.method545(var62 * 8, var63 * 8, 8, 8);
                    }
                }
            }
            method2955(true);
            for (int var65 = 0; var65 < 4; var65++) {
                method2007();
                for (int var66 = 0; var66 < 13; var66++) {
                    for (int var67 = 0; var67 < 13; var67++) {
                        int var68 = field505[var65][var66][var67];
                        if (var68 != -1) {
                            int var69 = var68 >> 24 & 0x3;
                            int var70 = var68 >> 1 & 0x3;
                            int var71 = var68 >> 14 & 0x3FF;
                            int var72 = var68 >> 3 & 0x7FF;
                            int var73 = (var71 / 8 << 8) + var72 / 8;
                            for (int var74 = 0; var74 < Statics.field720.length; var74++) {
                                if (Statics.field720[var74] == var73 && Statics.field768[var74] != null) {
                                    class6.method2460(Statics.field768[var74], var65, var66 * 8, var67 * 8, var69, (var71 & 0x7) * 8, (var72 & 0x7) * 8, var70, Statics.field563, field304);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2955(true);
        method3291();
        method2007();
        class81 var75 = Statics.field563;
        class219[] var76 = field304;
        for (int var77 = 0; var77 < 4; var77++) {
            for (int var78 = 0; var78 < 104; var78++) {
                for (int var79 = 0; var79 < 104; var79++) {
                    if ((class6.field70[var77][var78][var79] & 0x1) == 1) {
                        int var80 = var77;
                        if ((class6.field70[1][var78][var79] & 0x2) == 2) {
                            var80 = var77 - 1;
                        }
                        if (var80 >= 0) {
                            var76[var80].method3713(var78, var79);
                        }
                    }
                }
            }
        }
        class6.field83 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field83 < -8) {
            class6.field83 = -8;
        }
        if (class6.field83 > 8) {
            class6.field83 = 8;
        }
        class6.field84 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field84 < -16) {
            class6.field84 = -16;
        }
        if (class6.field84 > 16) {
            class6.field84 = 16;
        }
        for (int var81 = 0; var81 < 4; var81++) {
            byte[][] var82 = Statics.field74[var81];
            int var83 = (int) Math.sqrt(5100.0D);
            int var84 = var83 * 768 >> 8;
            for (int var85 = 1; var85 < 103; var85++) {
                for (int var86 = 1; var86 < 103; var86++) {
                    int var87 = class6.field78[var81][var86 + 1][var85] - class6.field78[var81][var86 - 1][var85];
                    int var88 = class6.field78[var81][var86][var85 + 1] - class6.field78[var81][var86][var85 - 1];
                    int var89 = (int) Math.sqrt((double) (var88 * var88 + var87 * var87 + 65536));
                    int var90 = (var87 << 8) / var89;
                    int var91 = 65536 / var89;
                    int var92 = (var88 << 8) / var89;
                    int var93 = (var92 * -50 + var90 * -50 + var91 * -10) / var84 + 96;
                    int var94 = (var82[var86][var85] >> 1) + (var82[var86][var85 + 1] >> 3) + (var82[var86][var85 - 1] >> 2) + (var82[var86 - 1][var85] >> 2) + (var82[var86 + 1][var85] >> 3);
                    Statics.field199[var86][var85] = var93 - var94;
                }
            }
            for (int var95 = 0; var95 < 104; var95++) {
                Statics.field2743[var95] = 0;
                Statics.field2980[var95] = 0;
                Statics.field77[var95] = 0;
                Statics.field2997[var95] = 0;
                Statics.field1649[var95] = 0;
            }
            for (int var96 = -5; var96 < 109; var96++) {
                for (int var97 = 0; var97 < 104; var97++) {
                    int var98 = var96 + 5;
                    int var10002;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = Statics.field72[var81][var98][var97] & 0xFF;
                        if (var99 > 0) {
                            class39 var100 = class39.method549(var99 - 1);
                            Statics.field2743[var97] += var100.field884;
                            Statics.field2980[var97] += var100.field885;
                            Statics.field77[var97] += var100.field886;
                            Statics.field2997[var97] += var100.field887;
                            var10002 = Statics.field1649[var97]++;
                        }
                    }
                    int var101 = var96 - 5;
                    if (var101 >= 0 && var101 < 104) {
                        int var102 = Statics.field72[var81][var101][var97] & 0xFF;
                        if (var102 > 0) {
                            class39 var103 = class39.method549(var102 - 1);
                            Statics.field2743[var97] -= var103.field884;
                            Statics.field2980[var97] -= var103.field885;
                            Statics.field77[var97] -= var103.field886;
                            Statics.field2997[var97] -= var103.field887;
                            var10002 = Statics.field1649[var97]--;
                        }
                    }
                }
                if (var96 >= 1 && var96 < 103) {
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = 0;
                    int var108 = 0;
                    for (int var109 = -5; var109 < 109; var109++) {
                        int var110 = var109 + 5;
                        if (var110 >= 0 && var110 < 104) {
                            var104 += Statics.field2743[var110];
                            var105 += Statics.field2980[var110];
                            var106 += Statics.field77[var110];
                            var107 += Statics.field2997[var110];
                            var108 += Statics.field1649[var110];
                        }
                        int var111 = var109 - 5;
                        if (var111 >= 0 && var111 < 104) {
                            var104 -= Statics.field2743[var111];
                            var105 -= Statics.field2980[var111];
                            var106 -= Statics.field77[var111];
                            var107 -= Statics.field2997[var111];
                            var108 -= Statics.field1649[var111];
                        }
                        if (var109 >= 1 && var109 < 103) {
                            if (field241 && (class6.field70[0][var96][var109] & 0x2) == 0) {
                                if ((class6.field70[var81][var96][var109] & 0x10) != 0) {
                                    continue;
                                }
                                int var112;
                                if ((class6.field70[var81][var96][var109] & 0x8) != 0) {
                                    var112 = 0;
                                } else if (var81 <= 0 || (class6.field70[1][var96][var109] & 0x2) == 0) {
                                    var112 = var81;
                                } else {
                                    var112 = var81 - 1;
                                }
                                if (field298 != var112) {
                                    continue;
                                }
                            }
                            if (var81 < class6.field71) {
                                class6.field71 = var81;
                            }
                            int var113 = Statics.field72[var81][var96][var109] & 0xFF;
                            int var114 = Statics.field3020[var81][var96][var109] & 0xFF;
                            if (var113 > 0 || var114 > 0) {
                                int var115 = class6.field78[var81][var96][var109];
                                int var116 = class6.field78[var81][var96 + 1][var109];
                                int var117 = class6.field78[var81][var96 + 1][var109 + 1];
                                int var118 = class6.field78[var81][var96][var109 + 1];
                                int var119 = Statics.field199[var96][var109];
                                int var120 = Statics.field199[var96 + 1][var109];
                                int var121 = Statics.field199[var96 + 1][var109 + 1];
                                int var122 = Statics.field199[var96][var109 + 1];
                                int var123 = -1;
                                int var124 = -1;
                                if (var113 > 0) {
                                    int var125 = var104 * 256 / var107;
                                    int var126 = var105 / var108;
                                    int var127 = var106 / var108;
                                    var123 = class6.method3538(var125, var126, var127);
                                    int var128 = class6.field83 + var125 & 0xFF;
                                    int var129 = class6.field84 + var127;
                                    if (var129 < 0) {
                                        var129 = 0;
                                    } else if (var129 > 255) {
                                        var129 = 255;
                                    }
                                    var124 = class6.method3538(var128, var126, var129);
                                }
                                if (var81 > 0) {
                                    boolean var130 = true;
                                    if (var113 == 0 && Statics.field73[var81][var96][var109] != 0) {
                                        var130 = false;
                                    }
                                    if (var114 > 0) {
                                        int var131 = var114 - 1;
                                        class43 var132 = (class43) class43.field961.method3302((long) var131);
                                        class43 var133;
                                        if (var132 == null) {
                                            byte[] var134 = Statics.field1892.method2843(4, var131);
                                            class43 var135 = new class43();
                                            if (var134 != null) {
                                                var135.method819(new class111(var134), var131);
                                            }
                                            var135.method827();
                                            class43.field961.method3304(var135, (long) var131);
                                            var133 = var135;
                                        } else {
                                            var133 = var132;
                                        }
                                        if (!var133.field951) {
                                            var130 = false;
                                        }
                                    }
                                    if (var130 && var115 == var116 && var115 == var117 && var115 == var118) {
                                        Statics.field3006[var81][var96][var109] |= 0x924;
                                    }
                                }
                                int var136 = 0;
                                if (var124 != -1) {
                                    var136 = class86.field1459[class6.method39(var124, 96)];
                                }
                                if (var114 == 0) {
                                    var75.method1803(var81, var96, var109, 0, 0, -1, var115, var116, var117, var118, class6.method39(var123, var119), class6.method39(var123, var120), class6.method39(var123, var121), class6.method39(var123, var122), 0, 0, 0, 0, var136, 0);
                                } else {
                                    int var137 = Statics.field73[var81][var96][var109] + 1;
                                    byte var138 = Statics.field1265[var81][var96][var109];
                                    int var139 = var114 - 1;
                                    class43 var140 = (class43) class43.field961.method3302((long) var139);
                                    class43 var141;
                                    if (var140 == null) {
                                        byte[] var142 = Statics.field1892.method2843(4, var139);
                                        class43 var143 = new class43();
                                        if (var142 != null) {
                                            var143.method819(new class111(var142), var139);
                                        }
                                        var143.method827();
                                        class43.field961.method3304(var143, (long) var139);
                                        var141 = var143;
                                    } else {
                                        var141 = var140;
                                    }
                                    int var145 = var141.field953;
                                    int var146;
                                    int var147;
                                    if (var145 >= 0) {
                                        var146 = Statics.field1460.method1888(var145);
                                        var147 = -1;
                                    } else if (var141.field952 == 16711935) {
                                        var147 = -2;
                                        var145 = -1;
                                        var146 = -2;
                                    } else {
                                        var147 = class6.method3538(var141.field963, var141.field957, var141.field958);
                                        int var148 = class6.field83 + var141.field963 & 0xFF;
                                        int var149 = class6.field84 + var141.field958;
                                        if (var149 < 0) {
                                            var149 = 0;
                                        } else if (var149 > 255) {
                                            var149 = 255;
                                        }
                                        var146 = class6.method3538(var148, var141.field957, var149);
                                    }
                                    int var150 = 0;
                                    if (var146 != -2) {
                                        var150 = class86.field1459[class6.method2098(var146, 96)];
                                    }
                                    if (var141.field955 != -1) {
                                        int var151 = class6.field83 + var141.field954 & 0xFF;
                                        int var152 = class6.field84 + var141.field959;
                                        if (var152 < 0) {
                                            var152 = 0;
                                        } else if (var152 > 255) {
                                            var152 = 255;
                                        }
                                        int var153 = class6.method3538(var151, var141.field960, var152);
                                        var150 = class86.field1459[class6.method2098(var153, 96)];
                                    }
                                    var75.method1803(var81, var96, var109, var137, var138, var145, var115, var116, var117, var118, class6.method39(var123, var119), class6.method39(var123, var120), class6.method39(var123, var121), class6.method39(var123, var122), class6.method2098(var147, var119), class6.method2098(var147, var120), class6.method2098(var147, var121), class6.method2098(var147, var122), var136, var150);
                                }
                            }
                        }
                    }
                }
            }
            for (int var154 = 1; var154 < 103; var154++) {
                for (int var155 = 1; var155 < 103; var155++) {
                    int var160;
                    if ((class6.field70[var81][var155][var154] & 0x8) != 0) {
                        var160 = 0;
                    } else if (var81 <= 0 || (class6.field70[1][var155][var154] & 0x2) == 0) {
                        var160 = var81;
                    } else {
                        var160 = var81 - 1;
                    }
                    var75.method1708(var81, var155, var154, var160);
                }
            }
            Statics.field72[var81] = (byte[][]) null;
            Statics.field3020[var81] = (byte[][]) null;
            Statics.field73[var81] = (byte[][]) null;
            Statics.field1265[var81] = (byte[][]) null;
            Statics.field74[var81] = (byte[][]) null;
        }
        var75.method1691(-50, -10, -50);
        for (int var161 = 0; var161 < 104; var161++) {
            for (int var162 = 0; var162 < 104; var162++) {
                if ((class6.field70[1][var161][var162] & 0x2) == 2) {
                    var75.method1662(var161, var162);
                }
            }
        }
        int var163 = 1;
        int var164 = 2;
        int var165 = 4;
        for (int var166 = 0; var166 < 4; var166++) {
            if (var166 > 0) {
                var163 <<= 0x3;
                var164 <<= 0x3;
                var165 <<= 0x3;
            }
            for (int var167 = 0; var167 <= var166; var167++) {
                for (int var168 = 0; var168 <= 104; var168++) {
                    for (int var169 = 0; var169 <= 104; var169++) {
                        if ((Statics.field3006[var167][var169][var168] & var163) != 0) {
                            int var170 = var168;
                            int var171 = var168;
                            int var172 = var167;
                            int var173 = var167;
                            while (var170 > 0 && (Statics.field3006[var167][var169][var170 - 1] & var163) != 0) {
                                var170--;
                            }
                            while (var171 < 104 && (Statics.field3006[var167][var169][var171 + 1] & var163) != 0) {
                                var171++;
                            }
                            label637: while (var172 > 0) {
                                for (int var174 = var170; var174 <= var171; var174++) {
                                    if ((Statics.field3006[var172 - 1][var169][var174] & var163) == 0) {
                                        break label637;
                                    }
                                }
                                var172--;
                            }
                            label626: while (var173 < var166) {
                                for (int var175 = var170; var175 <= var171; var175++) {
                                    if ((Statics.field3006[var173 + 1][var169][var175] & var163) == 0) {
                                        break label626;
                                    }
                                }
                                var173++;
                            }
                            int var176 = (var173 + 1 - var172) * (var171 - var170 + 1);
                            if (var176 >= 8) {
                                short var177 = 240;
                                int var178 = class6.field78[var173][var169][var170] - var177;
                                int var179 = class6.field78[var172][var169][var170];
                                class81.method1663(var166, 1, var169 * 128, var169 * 128, var170 * 128, var171 * 128 + 128, var178, var179);
                                for (int var180 = var172; var180 <= var173; var180++) {
                                    for (int var181 = var170; var181 <= var171; var181++) {
                                        Statics.field3006[var180][var169][var181] &= ~var163;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3006[var167][var169][var168] & var164) != 0) {
                            int var182 = var169;
                            int var183 = var169;
                            int var184 = var167;
                            int var185 = var167;
                            while (var182 > 0 && (Statics.field3006[var167][var182 - 1][var168] & var164) != 0) {
                                var182--;
                            }
                            while (var183 < 104 && (Statics.field3006[var167][var183 + 1][var168] & var164) != 0) {
                                var183++;
                            }
                            label690: while (var184 > 0) {
                                for (int var186 = var182; var186 <= var183; var186++) {
                                    if ((Statics.field3006[var184 - 1][var186][var168] & var164) == 0) {
                                        break label690;
                                    }
                                }
                                var184--;
                            }
                            label679: while (var185 < var166) {
                                for (int var187 = var182; var187 <= var183; var187++) {
                                    if ((Statics.field3006[var185 + 1][var187][var168] & var164) == 0) {
                                        break label679;
                                    }
                                }
                                var185++;
                            }
                            int var188 = (var185 + 1 - var184) * (var183 - var182 + 1);
                            if (var188 >= 8) {
                                short var189 = 240;
                                int var190 = class6.field78[var185][var182][var168] - var189;
                                int var191 = class6.field78[var184][var182][var168];
                                class81.method1663(var166, 2, var182 * 128, var183 * 128 + 128, var168 * 128, var168 * 128, var190, var191);
                                for (int var192 = var184; var192 <= var185; var192++) {
                                    for (int var193 = var182; var193 <= var183; var193++) {
                                        Statics.field3006[var192][var193][var168] &= ~var164;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3006[var167][var169][var168] & var165) != 0) {
                            int var194 = var169;
                            int var195 = var169;
                            int var196 = var168;
                            int var197 = var168;
                            while (var196 > 0 && (Statics.field3006[var167][var169][var196 - 1] & var165) != 0) {
                                var196--;
                            }
                            while (var197 < 104 && (Statics.field3006[var167][var169][var197 + 1] & var165) != 0) {
                                var197++;
                            }
                            label743: while (var194 > 0) {
                                for (int var198 = var196; var198 <= var197; var198++) {
                                    if ((Statics.field3006[var167][var194 - 1][var198] & var165) == 0) {
                                        break label743;
                                    }
                                }
                                var194--;
                            }
                            label732: while (var195 < 104) {
                                for (int var199 = var196; var199 <= var197; var199++) {
                                    if ((Statics.field3006[var167][var195 + 1][var199] & var165) == 0) {
                                        break label732;
                                    }
                                }
                                var195++;
                            }
                            if ((var195 - var194 + 1) * (var197 - var196 + 1) >= 4) {
                                int var200 = class6.field78[var167][var194][var196];
                                class81.method1663(var166, 4, var194 * 128, var195 * 128 + 128, var196 * 128, var197 * 128 + 128, var200, var200);
                                for (int var201 = var194; var201 <= var195; var201++) {
                                    for (int var202 = var196; var202 <= var197; var202++) {
                                        Statics.field3006[var167][var201][var202] &= ~var165;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method2955(true);
        int var203 = class6.field71;
        if (var203 > Statics.field2842) {
            var203 = Statics.field2842;
        }
        if (var203 < Statics.field2842 - 1) {
            int var204 = Statics.field2842 - 1;
        }
        if (field241) {
            Statics.field563.method1661(class6.field71);
        } else {
            Statics.field563.method1661(0);
        }
        for (int var205 = 0; var205 < 104; var205++) {
            for (int var206 = 0; var206 < 104; var206++) {
                method870(var205, var206);
            }
        }
        method2007();
        method156();
        class38.field832.method3303();
        if (Statics.field1545 != null) {
            field475.method2438(193);
            field475.method2229(1057001181);
        }
        if (!field305) {
            int var207 = (Statics.field1268 - 6) / 8;
            int var208 = (Statics.field1268 + 6) / 8;
            int var209 = (Statics.field2913 - 6) / 8;
            int var210 = (Statics.field2913 + 6) / 8;
            for (int var211 = var207 - 1; var211 <= var208 + 1; var211++) {
                for (int var212 = var209 - 1; var212 <= var210 + 1; var212++) {
                    if (var211 < var207 || var211 > var208 || var212 < var209 || var212 > var210) {
                        Statics.field2081.method2862("m" + var211 + "_" + var212);
                        Statics.field2081.method2862("l" + var211 + "_" + var212);
                    }
                }
            }
        }
        method2387(30);
        method2007();
        Statics.field72 = (byte[][][]) null;
        Statics.field3020 = (byte[][][]) null;
        Statics.field73 = (byte[][][]) null;
        Statics.field1265 = (byte[][][]) null;
        Statics.field3006 = (int[][][]) null;
        Statics.field74 = (byte[][][]) null;
        Statics.field199 = (int[][]) null;
        Statics.field2743 = null;
        Statics.field2980 = null;
        Statics.field77 = null;
        Statics.field2997 = null;
        Statics.field1649 = null;
        field475.method2438(244);
        Statics.field878.method2532();
        for (int var213 = 0; var213 < 32; var213++) {
            field2058[var213] = 0L;
        }
        for (int var214 = 0; var214 < 32; var214++) {
            field2050[var214] = 0L;
        }
        Statics.field1261 = 0;
    }

    @ObfuscatedName("by.af(II)V")
    public static final void method1460(int arg0) {
        int[] var1 = Statics.field949.field1271;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field70[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field563.method1710(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field70[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field563.method1710(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field949.method1556();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field70[arg0][var10][var9] & 0x18) == 0) {
                    method622(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field70[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method622(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field472 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field563.method1689(Statics.field2842, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class38.method189(var14).field857;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field304[Statics.field2842].field3078;
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
                        field330[field472] = Statics.field3015[var15];
                        field477[field472] = var16;
                        field474[field472] = var17;
                        field472++;
                    }
                }
            }
        }
        Statics.field580.method1465();
    }

    @ObfuscatedName("au.as(IIIIII)V")
    public static final void method622(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field563.method1686(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field563.method1690(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field949.field1271;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class38 var13 = class38.method189(var12);
            if (var13.field839 == -1) {
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
                class76 var14 = Statics.field2843[var13.field839];
                if (var14 != null) {
                    int var15 = (var13.field867 * 4 - var14.field1297) / 2;
                    int var16 = (var13.field845 * 4 - var14.field1293) / 2;
                    var14.method1637(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field845) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field563.method1688(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field563.method1690(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class38 var22 = class38.method189(var21);
            if (var22.field839 != -1) {
                class76 var23 = Statics.field2843[var22.field839];
                if (var23 != null) {
                    int var24 = (var22.field867 * 4 - var23.field1297) / 2;
                    int var25 = (var22.field845 * 4 - var23.field1293) / 2;
                    var23.method1637(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field845) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field949.field1271;
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
        int var29 = Statics.field563.method1689(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class38 var31 = class38.method189(var30);
        if (var31.field839 == -1) {
            return;
        }
        class76 var32 = Statics.field2843[var31.field839];
        if (var32 != null) {
            int var33 = (var31.field867 * 4 - var32.field1297) / 2;
            int var34 = (var31.field845 * 4 - var32.field1293) / 2;
            var32.method1637(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field845) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("l.aa(I)Z")
    public static final boolean method19() {
        if (Statics.field285 == null) {
            return false;
        }
        try {
            int var0 = Statics.field285.method2661();
            if (var0 == 0) {
                return false;
            }
            if (field290 == -1) {
                Statics.field285.method2662(field258.field1835, 0, 1);
                field258.field1834 = 0;
                field290 = field258.method2457();
                field289 = class178.field2894[field290];
                var0--;
            }
            if (field289 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field285.method2662(field258.field1835, 0, 1);
                field289 = field258.field1835[0] & 0xFF;
                var0--;
            }
            if (field289 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field285.method2662(field258.field1835, 0, 2);
                field258.field1834 = 0;
                field289 = field258.method2178();
                var0 -= 2;
            }
            if (var0 < field289) {
                return false;
            }
            field258.field1834 = 0;
            Statics.field285.method2662(field258.field1835, 0, field289);
            field359 = 0;
            field296 = field485;
            field485 = field294;
            field294 = field290;
            if (field290 == 175) {
                for (int var1 = 0; var1 < Statics.field1045; var1++) {
                    class48 var2 = class48.method2540(var1);
                    if (var2 != null) {
                        class166.field2752[var1] = 0;
                        class166.field2753[var1] = 0;
                    }
                }
                method108();
                field341 += 32;
                field290 = -1;
                return true;
            }
            if (field290 == 234) {
                int var3 = field289 + field258.field1834;
                int var4 = field258.method2178();
                int var5 = field258.method2178();
                if (field405 != var4) {
                    field405 = var4;
                    method647(field405);
                    class34.method567(field405);
                    for (int var6 = 0; var6 < 100; var6++) {
                        field451[var6] = true;
                    }
                }
                while (var5-- > 0) {
                    int var7 = field258.method2378();
                    int var8 = field258.method2178();
                    int var9 = field258.method2176();
                    class4 var10 = (class4) field406.method3339((long) var7);
                    if (var10 != null && var10.field60 != var8) {
                        method340(var10, true);
                        var10 = null;
                    }
                    if (var10 == null) {
                        var10 = method173(var7, var8, var9);
                    }
                    var10.field56 = true;
                }
                for (class4 var11 = (class4) field406.method3341(); var11 != null; var11 = (class4) field406.method3346()) {
                    if (var11.field56) {
                        var11.field56 = false;
                    } else {
                        method340(var11, true);
                    }
                }
                field394 = new class186(512);
                while (field258.field1834 < var3) {
                    int var12 = field258.method2378();
                    int var13 = field258.method2178();
                    int var14 = field258.method2178();
                    int var15 = field258.method2378();
                    for (int var16 = var13; var16 <= var14; var16++) {
                        long var17 = ((long) var12 << 32) + (long) var16;
                        field394.method3338(new class191(var15), var17);
                    }
                }
                field290 = -1;
                return true;
            }
            if (field290 == 137) {
                String var19 = field258.method2167();
                int var20 = field258.method2178();
                byte var21 = field258.method2162();
                boolean var22 = false;
                if (var21 == -128) {
                    var22 = true;
                }
                if (var22) {
                    if (Statics.field1439 == 0) {
                        field290 = -1;
                        return true;
                    }
                    boolean var23 = false;
                    int var24;
                    for (var24 = 0; var24 < Statics.field1439 && (!Statics.field126[var24].field569.equals(var19) || Statics.field126[var24].field564 != var20); var24++) {
                    }
                    if (var24 < Statics.field1439) {
                        while (var24 < Statics.field1439 - 1) {
                            Statics.field126[var24] = Statics.field126[var24 + 1];
                            var24++;
                        }
                        Statics.field1439--;
                        Statics.field126[Statics.field1439] = null;
                    }
                } else {
                    field258.method2167();
                    class23 var25 = new class23();
                    var25.field569 = var19;
                    var25.field557 = class155.method2125(var25.field569, Statics.field1854);
                    var25.field564 = var20;
                    var25.field570 = var21;
                    int var26;
                    for (var26 = Statics.field1439 - 1; var26 >= 0; var26--) {
                        int var27 = Statics.field126[var26].field557.compareTo(var25.field557);
                        if (var27 == 0) {
                            Statics.field126[var26].field564 = var20;
                            Statics.field126[var26].field570 = var21;
                            if (var19.equals(Statics.field3024.field43)) {
                                Statics.field516 = var21;
                            }
                            field438 = field429;
                            field290 = -1;
                            return true;
                        }
                        if (var27 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1439 >= Statics.field126.length) {
                        field290 = -1;
                        return true;
                    }
                    for (int var28 = Statics.field1439 - 1; var28 > var26; var28--) {
                        Statics.field126[var28 + 1] = Statics.field126[var28];
                    }
                    if (Statics.field1439 == 0) {
                        Statics.field126 = new class23[100];
                    }
                    Statics.field126[var26 + 1] = var25;
                    Statics.field1439++;
                    if (var19.equals(Statics.field3024.field43)) {
                        Statics.field516 = var21;
                    }
                }
                field438 = field429;
                field290 = -1;
                return true;
            }
            if (field290 == 112) {
                field490 = true;
                Statics.field2046 = field258.method2176();
                Statics.field1647 = field258.method2176();
                Statics.field1993 = field258.method2178();
                Statics.field2569 = field258.method2176();
                Statics.field1559 = field258.method2176();
                if (Statics.field1559 >= 100) {
                    int var29 = Statics.field2046 * 128 + 64;
                    int var30 = Statics.field1647 * 128 + 64;
                    int var31 = method2008(var29, var30, Statics.field2842) - Statics.field1993;
                    int var32 = var29 - Statics.field2496;
                    int var33 = var31 - Statics.field2493;
                    int var34 = var30 - Statics.field11;
                    int var35 = (int) Math.sqrt((double) (var32 * var32 + var34 * var34));
                    Statics.field177 = (int) (Math.atan2((double) var33, (double) var35) * 325.949D) & 0x7FF;
                    Statics.field2449 = (int) (Math.atan2((double) var32, (double) var34) * -325.949D) & 0x7FF;
                    if (Statics.field177 < 128) {
                        Statics.field177 = 128;
                    }
                    if (Statics.field177 > 383) {
                        Statics.field177 = 383;
                    }
                }
                field290 = -1;
                return true;
            }
            if (field290 == 115) {
                field264 = field258.method2176();
                if (field264 == 1) {
                    field275 = field258.method2178();
                }
                if (field264 >= 2 && field264 <= 6) {
                    if (field264 == 2) {
                        field270 = 64;
                        field271 = 64;
                    }
                    if (field264 == 3) {
                        field270 = 0;
                        field271 = 64;
                    }
                    if (field264 == 4) {
                        field270 = 128;
                        field271 = 64;
                    }
                    if (field264 == 5) {
                        field270 = 64;
                        field271 = 0;
                    }
                    if (field264 == 6) {
                        field270 = 64;
                        field271 = 128;
                    }
                    field264 = 2;
                    field461 = field258.method2178();
                    field268 = field258.method2178();
                    field269 = field258.method2176();
                }
                if (field264 == 10) {
                    field266 = field258.method2178();
                }
                field290 = -1;
                return true;
            }
            if (field290 == 26) {
                int var36 = field258.method2220();
                int var37 = field258.method2236();
                class164 var38 = class164.method128(var36);
                if (var38.field2610 != var37 || var37 == -1) {
                    var38.field2610 = var37;
                    var38.field2688 = 0;
                    var38.field2728 = 0;
                    method2384(var38);
                }
                field290 = -1;
                return true;
            }
            if (field290 == 114) {
                for (int var39 = 0; var39 < class166.field2753.length; var39++) {
                    if (class166.field2753[var39] != class166.field2752[var39]) {
                        class166.field2753[var39] = class166.field2752[var39];
                        method2505(var39);
                        field349[++field341 - 1 & 0x1F] = var39;
                    }
                }
                field290 = -1;
                return true;
            }
            if (field290 == 76) {
                int var40 = field258.method2378();
                int var41 = field258.method2210();
                int var42 = field258.method2278();
                class164 var43 = class164.method128(var40);
                var43.field2722 = (var42 << 16) + var41;
                field290 = -1;
                return true;
            }
            if (field290 == 241) {
                Statics.field1241 = field258.method2176();
                Statics.field217 = field258.method2202();
                for (int var44 = Statics.field1241; var44 < Statics.field1241 + 8; var44++) {
                    for (int var45 = Statics.field217; var45 < Statics.field217 + 8; var45++) {
                        if (field378[Statics.field2842][var44][var45] != null) {
                            field378[Statics.field2842][var44][var45] = null;
                            method870(var44, var45);
                        }
                    }
                }
                for (class16 var46 = (class16) field265.method3378(); var46 != null; var46 = (class16) field265.method3394()) {
                    if (var46.field220 >= Statics.field1241 && var46.field220 < Statics.field1241 + 8 && var46.field208 >= Statics.field217 && var46.field208 < Statics.field217 + 8 && Statics.field2842 == var46.field207) {
                        var46.field219 = 0;
                    }
                }
                field290 = -1;
                return true;
            }
            if (field290 == 51) {
                String var47 = field258.method2167();
                Statics.field252 = var47;
                try {
                    String var48 = Statics.field242.getParameter(class180.field2910.field2898);
                    String var49 = Statics.field242.getParameter(class180.field2911.field2898);
                    String var50 = var48 + "settings=" + var47 + "; version=1; path=/; domain=" + var49;
                    String var51;
                    if (var47.length() == 0) {
                        var51 = var50 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var51 = var50 + "; Expires=" + class103.method166(class107.method635() + 94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    client var52 = Statics.field242;
                    String var53 = "document.cookie=\"" + var51 + "\"";
                    JSObject.getWindow(var52).eval(var53);
                } catch (Throwable var286) {
                }
                field290 = -1;
                return true;
            }
            if (field290 == 211) {
                class201.method1908(field258, field289);
                field290 = -1;
                return true;
            }
            if (field290 == 141) {
                int var55 = field258.method2218();
                int var56 = field258.method2210();
                class164 var57 = class164.method128(var55);
                if (var57 != null && var57.field2620 == 0) {
                    if (var56 > var57.field2727 - var57.field2628) {
                        var56 = var57.field2727 - var57.field2628;
                    }
                    if (var56 < 0) {
                        var56 = 0;
                    }
                    if (var57.field2632 != var56) {
                        var57.field2632 = var56;
                        method2384(var57);
                    }
                }
                field290 = -1;
                return true;
            }
            if (field290 == 149) {
                byte var58 = field258.method2204();
                int var59 = field258.method2209();
                class166.field2752[var59] = var58;
                if (class166.field2753[var59] != var58) {
                    class166.field2753[var59] = var58;
                    method2505(var59);
                }
                field349[++field341 - 1 & 0x1F] = var59;
                field290 = -1;
                return true;
            }
            if (field290 == 187) {
                int var60 = field258.method2220();
                Statics.field2521 = Statics.field879.method2567(var60);
                field290 = -1;
                return true;
            }
            if (field290 == 67 || field290 == 23 || field290 == 68 || field290 == 255 || field290 == 27 || field290 == 21 || field290 == 53 || field290 == 140 || field290 == 15 || field290 == 238) {
                method548();
                field290 = -1;
                return true;
            }
            if (field290 == 118) {
                int var61 = field258.method2209();
                if (var61 == 65535) {
                    var61 = -1;
                }
                method773(var61);
                field290 = -1;
                return true;
            }
            if (field290 == 203) {
                int var62 = field258.method2308();
                int var63 = field258.method2210();
                if (var63 == 65535) {
                    var63 = -1;
                }
                if (field479 != 0 && var63 != -1) {
                    class173.method631(Statics.field195, var63, 0, field479, false);
                    field481 = true;
                }
                field290 = -1;
                return true;
            }
            if (field290 == 78) {
                while (field258.field1834 < field289) {
                    boolean var64 = field258.method2176() == 1;
                    String var65 = field258.method2167();
                    String var66 = field258.method2167();
                    int var67 = field258.method2178();
                    int var68 = field258.method2176();
                    int var69 = field258.method2176();
                    boolean var70 = (var69 & 0x2) != 0;
                    boolean var71 = (var69 & 0x1) != 0;
                    if (var67 > 0) {
                        field258.method2167();
                        field258.method2176();
                        field258.method2378();
                    }
                    field258.method2167();
                    for (int var72 = 0; var72 < field385; var72++) {
                        class17 var73 = field498[var72];
                        if (var64) {
                            if (var66.equals(var73.field223)) {
                                var73.field223 = var65;
                                var73.field224 = var66;
                                var65 = null;
                                break;
                            }
                        } else if (var65.equals(var73.field223)) {
                            if (var73.field225 != var67) {
                                boolean var74 = true;
                                for (class36 var75 = (class36) field499.method3329(); var75 != null; var75 = (class36) field499.method3327()) {
                                    if (var75.field785.equals(var65)) {
                                        if (var67 != 0 && var75.field789 == 0) {
                                            var75.method3458();
                                            var74 = false;
                                        } else if (var67 == 0 && var75.field789 != 0) {
                                            var75.method3458();
                                            var74 = false;
                                        }
                                    }
                                }
                                if (var74) {
                                    field499.method3337(new class36(var65, var67));
                                }
                                var73.field225 = var67;
                            }
                            var73.field224 = var66;
                            var73.field229 = var68;
                            var73.field227 = var70;
                            var73.field226 = var71;
                            var65 = null;
                            break;
                        }
                    }
                    if (var65 != null && field385 < 400) {
                        class17 var76 = new class17();
                        field498[field385] = var76;
                        var76.field223 = var65;
                        var76.field224 = var66;
                        var76.field225 = var67;
                        var76.field229 = var68;
                        var76.field227 = var70;
                        var76.field226 = var71;
                        field385++;
                    }
                }
                field497 = 2;
                field447 = field429;
                boolean var77 = false;
                int var78 = field385;
                while (var78 > 0) {
                    boolean var79 = true;
                    var78--;
                    for (int var80 = 0; var80 < var78; var80++) {
                        boolean var81 = false;
                        class17 var82 = field498[var80];
                        class17 var83 = field498[var80 + 1];
                        if (field244 != var82.field225 && field244 == var83.field225) {
                            var81 = true;
                        }
                        if (!var81 && var82.field225 == 0 && var83.field225 != 0) {
                            var81 = true;
                        }
                        if (!var81 && !var82.field227 && var83.field227) {
                            var81 = true;
                        }
                        if (!var81 && !var82.field226 && var83.field226) {
                            var81 = true;
                        }
                        if (var81) {
                            class17 var84 = field498[var80];
                            field498[var80] = field498[var80 + 1];
                            field498[var80 + 1] = var84;
                            var79 = false;
                        }
                    }
                    if (var79) {
                        break;
                    }
                }
                field290 = -1;
                return true;
            }
            if (field290 == 89) {
                field272 = field258.method2176();
                field466 = field258.method2176();
                field290 = -1;
                return true;
            }
            if (field290 == 166) {
                int var85 = field258.method2212();
                int var86 = field258.method2212();
                int var87 = field258.method2218();
                class164 var88 = class164.method128(var87);
                int var89 = var88.field2625 + var86;
                int var90 = var88.field2626 + var85;
                if (var88.field2623 != var89 || var88.field2624 != var90) {
                    var88.field2623 = var89;
                    var88.field2624 = var90;
                    method2384(var88);
                }
                field290 = -1;
                return true;
            }
            if (field290 == 7) {
                String var91 = field258.method2167();
                int var92 = field258.method2220();
                class164 var93 = class164.method128(var92);
                if (!var91.equals(var93.field2617)) {
                    var93.field2617 = var91;
                    method2384(var93);
                }
                field290 = -1;
                return true;
            }
            if (field290 == 240) {
                int var94 = field258.method2201();
                int var95 = field258.method2336();
                int var96 = field258.method2202();
                Statics.field2842 = var95 >> 1;
                Statics.field3024.method633(var96, var94, (var95 & 0x1) == 1);
                field290 = -1;
                return true;
            }
            if (field290 == 214) {
                int var97 = field258.method2188();
                boolean var98 = field258.method2176() == 1;
                String var99 = "";
                boolean var100 = false;
                if (var98) {
                    var99 = field258.method2167();
                    if (method138(var99)) {
                        var100 = true;
                    }
                }
                String var101 = field258.method2167();
                if (!var100) {
                    class11.method35(var97, var99, var101);
                }
                field290 = -1;
                return true;
            }
            if (field290 == 210) {
                method108();
                field410 = field258.method2176();
                field441 = field429;
                field290 = -1;
                return true;
            }
            if (field290 == 193) {
                field476 = field258.method2176();
                if (field476 == 255) {
                    field476 = 0;
                }
                field496 = field258.method2176();
                if (field496 == 255) {
                    field496 = 0;
                }
                field290 = -1;
                return true;
            }
            if (field290 == 28) {
                int var102 = field258.method2209();
                field405 = var102;
                method647(var102);
                class34.method567(field405);
                for (int var103 = 0; var103 < 100; var103++) {
                    field451[var103] = true;
                }
                field290 = -1;
                return true;
            }
            if (field290 == 224) {
                class24 var104 = new class24();
                var104.field578 = field258.method2167();
                var104.field574 = field258.method2178();
                int var105 = field258.method2378();
                var104.field571 = var105;
                method2387(45);
                Statics.field285.method2659();
                Statics.field285 = null;
                class30.method839(var104);
                field290 = -1;
                return false;
            }
            if (field290 == 126) {
                int var106 = field258.method2378();
                int var107 = field258.method2178();
                if (var106 < -70000) {
                    var107 += 32768;
                }
                class164 var108;
                if (var106 >= 0) {
                    var108 = class164.method128(var106);
                } else {
                    var108 = null;
                }
                while (field258.field1834 < field289) {
                    int var109 = field258.method2188();
                    int var110 = field258.method2178();
                    int var111 = 0;
                    if (var110 != 0) {
                        var111 = field258.method2176();
                        if (var111 == 255) {
                            var111 = field258.method2378();
                        }
                    }
                    if (var108 != null && var109 >= 0 && var109 < var108.field2723.length) {
                        var108.field2723[var109] = var110;
                        var108.field2724[var109] = var111;
                    }
                    class15.method5(var107, var109, var110 - 1, var111);
                }
                if (var108 != null) {
                    method2384(var108);
                }
                method108();
                field297[++field433 - 1 & 0x1F] = var107 & 0x7FFF;
                field290 = -1;
                return true;
            }
            if (field290 == 184) {
                String var112 = field258.method2167();
                Object[] var113 = new Object[var112.length() + 1];
                for (int var114 = var112.length() - 1; var114 >= 0; var114--) {
                    if (var112.charAt(var114) == 's') {
                        var113[var114 + 1] = field258.method2167();
                    } else {
                        var113[var114 + 1] = Integer.valueOf(field258.method2378());
                    }
                }
                var113[0] = Integer.valueOf(field258.method2378());
                class1 var115 = new class1();
                var115.field9 = var113;
                Statics.method562(var115);
                field290 = -1;
                return true;
            }
            if (field290 == 41) {
                Statics.field217 = field258.method2202();
                Statics.field1241 = field258.method2336();
                while (field258.field1834 < field289) {
                    field290 = field258.method2176();
                    method548();
                }
                field290 = -1;
                return true;
            }
            if (field290 == 117) {
                while (field258.field1834 < field289) {
                    int var116 = field258.method2176();
                    boolean var117 = (var116 & 0x1) == 1;
                    String var118 = field258.method2167();
                    String var119 = field258.method2167();
                    field258.method2167();
                    for (int var120 = 0; var120 < field500; var120++) {
                        class8 var121 = field501[var120];
                        if (var117) {
                            if (var119.equals(var121.field124)) {
                                var121.field124 = var118;
                                var121.field121 = var119;
                                var118 = null;
                                break;
                            }
                        } else if (var118.equals(var121.field124)) {
                            var121.field124 = var118;
                            var121.field121 = var119;
                            var118 = null;
                            break;
                        }
                    }
                    if (var118 != null && field500 < 400) {
                        class8 var122 = new class8();
                        field501[field500] = var122;
                        var122.field124 = var118;
                        var122.field121 = var119;
                        field500++;
                    }
                }
                field447 = field429;
                field290 = -1;
                return true;
            }
            if (field290 == 99) {
                String var123 = field258.method2167();
                class114 var124 = field258;
                String var128;
                try {
                    int var125 = var124.method2188();
                    if (var125 > 32767) {
                        var125 = 32767;
                    }
                    byte[] var126 = new byte[var125];
                    var124.field1834 += Statics.field3038.method2101(var124.field1835, var124.field1834, var126, 0, var125);
                    String var127 = class156.method2563(var126, 0, var125);
                    var128 = var127;
                } catch (Exception var285) {
                    var128 = "Cabbage";
                }
                String var131 = class213.method3565(class154.method880(var128));
                class11.method35(6, var123, var131);
                field290 = -1;
                return true;
            }
            if (field290 == 108) {
                int var132 = field258.method2220();
                int var133 = field258.method2278();
                int var134 = var133 >> 10 & 0x1F;
                int var135 = var133 >> 5 & 0x1F;
                int var136 = var133 & 0x1F;
                int var137 = (var136 << 3) + (var134 << 19) + (var135 << 11);
                class164 var138 = class164.method128(var132);
                if (var138.field2635 != var137) {
                    var138.field2635 = var137;
                    method2384(var138);
                }
                field290 = -1;
                return true;
            }
            if (field290 == 58) {
                int var139 = field258.method2219();
                class164 var140 = class164.method128(var139);
                for (int var141 = 0; var141 < var140.field2723.length; var141++) {
                    var140.field2723[var141] = -1;
                    var140.field2723[var141] = 0;
                }
                method2384(var140);
                field290 = -1;
                return true;
            }
            if (field290 == 169) {
                method2481();
                field290 = -1;
                return true;
            }
            if (field290 == 246) {
                method2090(true);
                field290 = -1;
                return true;
            }
            if (field290 == 135) {
                field490 = true;
                Statics.field519 = field258.method2176();
                Statics.field1807 = field258.method2176();
                Statics.field577 = field258.method2178();
                Statics.field239 = field258.method2176();
                Statics.field1474 = field258.method2176();
                if (Statics.field1474 >= 100) {
                    Statics.field2496 = Statics.field519 * 128 + 64;
                    Statics.field11 = Statics.field1807 * 128 + 64;
                    Statics.field2493 = method2008(Statics.field2496, Statics.field11, Statics.field2842) - Statics.field577;
                }
                field290 = -1;
                return true;
            }
            if (field290 == 138) {
                int var142 = field258.method2178();
                int var143 = field258.method2176();
                int var144 = field258.method2178();
                method197(var142, var143, var144);
                field290 = -1;
                return true;
            }
            if (field290 == 133) {
                method108();
                field291 = field258.method2236();
                field441 = field429;
                field290 = -1;
                return true;
            }
            if (field290 == 215) {
                if (field405 != -1) {
                    int var145 = field405;
                    if (class164.method2116(var145)) {
                        method571(Statics.field2711[var145], 0);
                    }
                }
                field290 = -1;
                return true;
            }
            if (field290 == 29) {
                method539();
                field290 = -1;
                return false;
            }
            if (field290 == 87) {
                field497 = 1;
                field447 = field429;
                field290 = -1;
                return true;
            }
            if (field290 == 142) {
                String var146 = field258.method2167();
                long var147 = (long) field258.method2178();
                long var149 = (long) field258.method2179();
                class143[] var151 = new class143[] { class143.field2111, class143.field2112, class143.field2119, class143.field2113, class143.field2114 };
                class143 var152 = (class143) class101.method510(var151, field258.method2176());
                long var153 = (var147 << 32) + var149;
                boolean var155 = false;
                for (int var156 = 0; var156 < 100; var156++) {
                    if (field463[var156] == var153) {
                        var155 = true;
                        break;
                    }
                }
                if (method138(var146)) {
                    var155 = true;
                }
                if (!var155 && field362 == 0) {
                    field463[field464] = var153;
                    field464 = (field464 + 1) % 100;
                    class114 var157 = field258;
                    String var161;
                    try {
                        int var158 = var157.method2188();
                        if (var158 > 32767) {
                            var158 = 32767;
                        }
                        byte[] var159 = new byte[var158];
                        var157.field1834 += Statics.field3038.method2101(var157.field1835, var157.field1834, var159, 0, var158);
                        String var160 = class156.method2563(var159, 0, var158);
                        var161 = var160;
                    } catch (Exception var284) {
                        var161 = "Cabbage";
                    }
                    String var164 = class213.method3565(class154.method880(var161));
                    byte var165;
                    if (var152.field2117) {
                        var165 = 7;
                    } else {
                        var165 = 3;
                    }
                    if (var152.field2116 == -1) {
                        class11.method35(var165, var146, var164);
                    } else {
                        int var167 = var152.field2116;
                        String var168 = "<img=" + var167 + ">";
                        class11.method35(var165, var168 + var146, var164);
                    }
                }
                field290 = -1;
                return true;
            }
            if (field290 == 66) {
                int var169 = field258.method2378();
                class4 var170 = (class4) field406.method3339((long) var169);
                if (var170 != null) {
                    method340(var170, true);
                }
                if (field409 != null) {
                    method2384(field409);
                    field409 = null;
                }
                field290 = -1;
                return true;
            }
            if (field290 == 35) {
                int var171 = field258.method2201();
                String var172 = field258.method2167();
                int var173 = field258.method2336();
                if (var171 >= 1 && var171 <= 8) {
                    if (var172.equalsIgnoreCase("null")) {
                        var172 = null;
                    }
                    field358[var171 - 1] = var172;
                    field375[var171 - 1] = var173 == 0;
                }
                field290 = -1;
                return true;
            }
            if (field290 == 221) {
                String var174 = field258.method2167();
                long var175 = field258.method2265();
                long var177 = (long) field258.method2178();
                long var179 = (long) field258.method2179();
                class143[] var181 = new class143[] { class143.field2111, class143.field2112, class143.field2119, class143.field2113, class143.field2114 };
                class143 var182 = (class143) class101.method510(var181, field258.method2176());
                long var183 = (var177 << 32) + var179;
                boolean var185 = false;
                for (int var186 = 0; var186 < 100; var186++) {
                    if (field463[var186] == var183) {
                        var185 = true;
                        break;
                    }
                }
                if (var182.field2122 && method138(var174)) {
                    var185 = true;
                }
                if (!var185 && field362 == 0) {
                    field463[field464] = var183;
                    field464 = (field464 + 1) % 100;
                    class114 var187 = field258;
                    String var191;
                    try {
                        int var188 = var187.method2188();
                        if (var188 > 32767) {
                            var188 = 32767;
                        }
                        byte[] var189 = new byte[var188];
                        var187.field1834 += Statics.field3038.method2101(var187.field1835, var187.field1834, var189, 0, var188);
                        String var190 = class156.method2563(var189, 0, var188);
                        var191 = var190;
                    } catch (Exception var283) {
                        var191 = "Cabbage";
                    }
                    String var194 = class213.method3565(class154.method880(var191));
                    if (var182.field2116 == -1) {
                        class11.method2776(9, var174, var194, class153.method6(var175));
                    } else {
                        int var195 = var182.field2116;
                        String var196 = "<img=" + var195 + ">";
                        class11.method2776(9, var196 + var174, var194, class153.method6(var175));
                    }
                }
                field290 = -1;
                return true;
            }
            if (field290 == 30) {
                method108();
                int var197 = field258.method2202();
                int var198 = field258.method2336();
                int var199 = field258.method2218();
                field282[var197] = var199;
                field382[var197] = var198;
                field383[var197] = 1;
                for (int var200 = 0; var200 < 98; var200++) {
                    if (var199 >= class146.field2144[var200]) {
                        field383[var197] = var200 + 2;
                    }
                }
                field434[++field435 - 1 & 0x1F] = var197;
                field290 = -1;
                return true;
            }
            if (field290 == 81) {
                for (int var201 = 0; var201 < field363.length; var201++) {
                    if (field363[var201] != null) {
                        field363[var201].field782 = -1;
                    }
                }
                for (int var202 = 0; var202 < field397.length; var202++) {
                    if (field397[var202] != null) {
                        field397[var202].field782 = -1;
                    }
                }
                field290 = -1;
                return true;
            }
            if (field290 == 8) {
                int var203 = field258.method2176();
                int var204 = field258.method2176();
                int var205 = field258.method2176();
                int var206 = field258.method2176();
                field491[var203] = true;
                field492[var203] = var204;
                field321[var203] = var205;
                field494[var203] = var206;
                field483[var203] = 0;
                field290 = -1;
                return true;
            }
            if (field290 == 217) {
                int var207 = field258.method2209();
                if (var207 == 65535) {
                    var207 = -1;
                }
                int var208 = field258.method2178();
                if (var208 == 65535) {
                    var208 = -1;
                }
                int var209 = field258.method2219();
                int var210 = field258.method2219();
                for (int var211 = var208; var211 <= var207; var211++) {
                    long var212 = ((long) var210 << 32) + (long) var211;
                    class198 var214 = field394.method3339(var212);
                    if (var214 != null) {
                        var214.method3463();
                    }
                    field394.method3338(new class191(var209), var212);
                }
                field290 = -1;
                return true;
            }
            if (field290 == 200) {
                int var215 = field258.method2378();
                int var216 = field258.method2178();
                if (var215 < -70000) {
                    var216 += 32768;
                }
                class164 var217;
                if (var215 >= 0) {
                    var217 = class164.method128(var215);
                } else {
                    var217 = null;
                }
                if (var217 != null) {
                    for (int var218 = 0; var218 < var217.field2723.length; var218++) {
                        var217.field2723[var218] = 0;
                        var217.field2724[var218] = 0;
                    }
                }
                class15.method536(var216);
                int var219 = field258.method2178();
                for (int var220 = 0; var220 < var219; var220++) {
                    int var221 = field258.method2178();
                    int var222 = field258.method2336();
                    if (var222 == 255) {
                        var222 = field258.method2220();
                    }
                    if (var217 != null && var220 < var217.field2723.length) {
                        var217.field2723[var220] = var221;
                        var217.field2724[var220] = var222;
                    }
                    class15.method5(var216, var220, var221 - 1, var222);
                }
                if (var217 != null) {
                    method2384(var217);
                }
                method108();
                field297[++field433 - 1 & 0x1F] = var216 & 0x7FFF;
                field290 = -1;
                return true;
            }
            if (field290 == 162) {
                int var223 = field258.method2209();
                int var224 = field258.method2220();
                int var225 = field258.method2278();
                int var226 = field258.method2209();
                class164 var227 = class164.method128(var224);
                if (var227.field2658 != var225 || var227.field2659 != var223 || var227.field2664 != var226) {
                    var227.field2658 = var225;
                    var227.field2659 = var223;
                    var227.field2664 = var226;
                    method2384(var227);
                }
                field290 = -1;
                return true;
            }
            if (field290 == 147) {
                int var228 = field258.method2210();
                int var229 = field258.method2220();
                class164 var230 = class164.method128(var229);
                if (var230.field2650 != 1 || var230.field2651 != var228) {
                    var230.field2650 = 1;
                    var230.field2651 = var228;
                    method2384(var230);
                }
                field290 = -1;
                return true;
            }
            if (field290 == 173) {
                int var231 = field258.method2209();
                int var232 = field258.method2378();
                class166.field2752[var231] = var232;
                if (class166.field2753[var231] != var232) {
                    class166.field2753[var231] = var232;
                    method2505(var231);
                }
                field349[++field341 - 1 & 0x1F] = var231;
                field290 = -1;
                return true;
            }
            if (field290 == 96) {
                Statics.field93 = class122.method1100(field258.method2176());
                field290 = -1;
                return true;
            }
            if (field290 == 33) {
                boolean var233 = field258.method2176() == 1;
                if (var233) {
                    Statics.field554 = class107.method635() - field258.method2265();
                    Statics.field2035 = new class211(field258, true);
                } else {
                    Statics.field2035 = null;
                }
                field437 = field429;
                field290 = -1;
                return true;
            }
            if (field290 == 227) {
                field258.field1834 += 28;
                if (field258.method2159()) {
                    class114 var234 = field258;
                    int var235 = field258.field1834 - 28;
                    if (class141.field2096 != null) {
                        try {
                            class141.field2096.method3674(0L);
                            class141.field2096.method3681(var234.field1835, var235, 24);
                        } catch (Exception var282) {
                        }
                    }
                }
                field290 = -1;
                return true;
            }
            if (field290 == 178) {
                field263 = field258.method2178() * 30;
                field441 = field429;
                field290 = -1;
                return true;
            }
            if (field290 == 136) {
                int var237 = field258.method2176();
                if (field258.method2176() == 0) {
                    field372[var237] = new class210();
                    field258.field1834 += 18;
                } else {
                    field258.field1834--;
                    field372[var237] = new class210(field258, false);
                }
                field439 = field429;
                field290 = -1;
                return true;
            }
            if (field290 == 239) {
                field503 = field258.method2176();
                field290 = -1;
                return true;
            }
            if (field290 == 11) {
                field490 = false;
                for (int var238 = 0; var238 < 5; var238++) {
                    field491[var238] = false;
                }
                field290 = -1;
                return true;
            }
            if (field290 == 226) {
                method210(true);
                field290 = -1;
                return true;
            }
            if (field290 == 161) {
                int var239 = field258.method2219();
                int var240 = field258.method2178();
                class164 var241 = class164.method128(var239);
                if (var241.field2650 != 2 || var241.field2651 != var240) {
                    var241.field2650 = 2;
                    var241.field2651 = var240;
                    method2384(var241);
                }
                field290 = -1;
                return true;
            }
            if (field290 == 40) {
                int var242 = field258.method2218();
                int var243 = field258.method2220();
                int var244 = field258.method2209();
                if (var244 == 65535) {
                    var244 = -1;
                }
                class164 var245 = class164.method128(var243);
                if (var245.field2709) {
                    var245.field2613 = var244;
                    var245.field2726 = var242;
                    class47 var247 = class47.method2467(var244);
                    var245.field2658 = var247.field1006;
                    var245.field2659 = var247.field1007;
                    var245.field2643 = var247.field1008;
                    var245.field2656 = var247.field1009;
                    var245.field2736 = var247.field1028;
                    var245.field2664 = var247.field1005;
                    if (var247.field1032 == 1) {
                        var245.field2702 = 1;
                    } else {
                        var245.field2702 = 2;
                    }
                    if (var245.field2627 > 0) {
                        var245.field2664 = var245.field2664 * 32 / var245.field2627;
                    }
                    method2384(var245);
                } else if (var244 == -1) {
                    var245.field2650 = 0;
                    field290 = -1;
                    return true;
                } else {
                    class47 var246 = class47.method2467(var244);
                    var245.field2650 = 4;
                    var245.field2651 = var244;
                    var245.field2658 = var246.field1006;
                    var245.field2659 = var246.field1007;
                    var245.field2664 = var246.field1005 * 100 / var242;
                    method2384(var245);
                }
                field290 = -1;
                return true;
            }
            if (field290 == 220) {
                method210(false);
                field290 = -1;
                return true;
            }
            if (field290 == 4) {
                method2090(false);
                field290 = -1;
                return true;
            }
            if (field290 == 157) {
                int var248 = field258.method2336();
                int var249 = field258.method2220();
                int var250 = field258.method2210();
                class4 var251 = (class4) field406.method3339((long) var249);
                if (var251 != null) {
                    method340(var251, var251.field60 != var250);
                }
                method173(var249, var250, var248);
                field290 = -1;
                return true;
            }
            if (field290 == 132) {
                int var252 = field258.method2178();
                class15 var253 = (class15) class15.field194.method3339((long) var252);
                if (var253 != null) {
                    var253.method3463();
                }
                field297[++field433 - 1 & 0x1F] = var252 & 0x7FFF;
                field290 = -1;
                return true;
            }
            if (field290 == 129) {
                boolean var254 = field258.method2176() == 1;
                int var255 = field258.method2220();
                class164 var256 = class164.method128(var255);
                if (var256.field2681 != var254) {
                    var256.field2681 = var254;
                    method2384(var256);
                }
                field290 = -1;
                return true;
            }
            if (field290 == 18) {
                field438 = field429;
                if (field289 == 0) {
                    field469 = null;
                    field381 = null;
                    Statics.field1439 = 0;
                    Statics.field126 = null;
                    field290 = -1;
                    return true;
                }
                field381 = field258.method2167();
                long var257 = field258.method2265();
                long var259 = var257;
                String var261;
                if (var257 <= 0L || var257 >= 6582952005840035281L) {
                    var261 = null;
                } else if (var257 % 37L == 0L) {
                    var261 = null;
                } else {
                    int var262 = 0;
                    for (long var263 = var257; var263 != 0L; var263 /= 37L) {
                        var262++;
                    }
                    StringBuilder var265 = new StringBuilder(var262);
                    while (var259 != 0L) {
                        long var266 = var259;
                        var259 /= 37L;
                        var265.append(class153.field2503[(int) (var266 - var259 * 37L)]);
                    }
                    var261 = var265.reverse().toString();
                }
                field469 = var261;
                Statics.field2524 = field258.method2162();
                int var268 = field258.method2176();
                if (var268 == 255) {
                    field290 = -1;
                    return true;
                }
                Statics.field1439 = var268;
                class23[] var269 = new class23[100];
                for (int var270 = 0; var270 < Statics.field1439; var270++) {
                    var269[var270] = new class23();
                    var269[var270].field569 = field258.method2167();
                    var269[var270].field557 = class155.method2125(var269[var270].field569, Statics.field1854);
                    var269[var270].field564 = field258.method2178();
                    var269[var270].field570 = field258.method2162();
                    field258.method2167();
                    if (var269[var270].field569.equals(Statics.field3024.field43)) {
                        Statics.field516 = var269[var270].field570;
                    }
                }
                boolean var271 = false;
                int var272 = Statics.field1439;
                while (var272 > 0) {
                    boolean var273 = true;
                    var272--;
                    for (int var274 = 0; var274 < var272; var274++) {
                        if (var269[var274].field557.compareTo(var269[var274 + 1].field557) > 0) {
                            class23 var275 = var269[var274];
                            var269[var274] = var269[var274 + 1];
                            var269[var274 + 1] = var275;
                            var273 = false;
                        }
                    }
                    if (var273) {
                        break;
                    }
                }
                Statics.field126 = var269;
                field290 = -1;
                return true;
            }
            if (field290 == 44) {
                Statics.field217 = field258.method2202();
                Statics.field1241 = field258.method2336();
                field290 = -1;
                return true;
            }
            if (field290 == 20) {
                int var276 = field258.method2378();
                class164 var277 = class164.method128(var276);
                var277.field2650 = 3;
                var277.field2651 = Statics.field3024.field34.method3050();
                method2384(var277);
                field290 = -1;
                return true;
            }
            class140.method2555("" + field290 + class2.field18 + field485 + class2.field18 + field296 + class2.field18 + field289, (Throwable) null);
            method539();
        } catch (IOException var287) {
            method644();
        } catch (Exception var288) {
            String var280 = "" + field290 + class2.field18 + field485 + class2.field18 + field296 + class2.field18 + field289 + class2.field18 + (Statics.field545 + Statics.field3024.field776[0]) + class2.field18 + (Statics.field1653 + Statics.field3024.field723[0]) + class2.field18;
            for (int var281 = 0; var281 < field289 && var281 < 50; var281++) {
                var280 = var280 + field258.field1835[var281] + class2.field18;
            }
            class140.method2555(var280, var288);
            method539();
        }
        return true;
    }

    @ObfuscatedName("p.bl(B)V")
    public static final void method548() {
        if (field290 == 27) {
            int var0 = field258.method2176();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1241;
            int var2 = (var0 & 0x7) + Statics.field217;
            int var3 = var1 + field258.method2162();
            int var4 = var2 + field258.method2162();
            int var5 = field258.method2236();
            int var6 = field258.method2178();
            int var7 = field258.method2176() * 4;
            int var8 = field258.method2176() * 4;
            int var9 = field258.method2178();
            int var10 = field258.method2178();
            int var11 = field258.method2176();
            int var12 = field258.method2176();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != 65535) {
                int var13 = var1 * 128 + 64;
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var4 * 128 + 64;
                class7 var17 = new class7(var6, Statics.field2842, var13, var14, method2008(var13, var14, Statics.field2842) - var7, field256 + var9, field256 + var10, var11, var12, var5, var8);
                var17.method99(var15, var16, method2008(var15, var16, Statics.field2842) - var8, field256 + var9);
                field355.method3374(var17);
            }
        } else if (field290 == 53) {
            int var18 = field258.method2278();
            int var19 = field258.method2202();
            int var20 = (var19 >> 4 & 0x7) + Statics.field1241;
            int var21 = (var19 & 0x7) + Statics.field217;
            int var22 = field258.method2210();
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                class27 var23 = new class27();
                var23.field613 = var22;
                var23.field609 = var18;
                if (field378[Statics.field2842][var20][var21] == null) {
                    field378[Statics.field2842][var20][var21] = new class189();
                }
                field378[Statics.field2842][var20][var21].method3374(var23);
                method870(var20, var21);
            }
        } else {
            if (field290 == 68) {
                int var24 = field258.method2278();
                byte var25 = field258.method2331();
                int var26 = field258.method2278();
                byte var27 = field258.method2204();
                int var28 = field258.method2210();
                int var29 = field258.method2209();
                int var30 = field258.method2202();
                int var31 = var30 >> 2;
                int var32 = var30 & 0x3;
                int var33 = field307[var31];
                byte var34 = field258.method2204();
                byte var35 = field258.method2162();
                int var36 = field258.method2176();
                int var37 = (var36 >> 4 & 0x7) + Statics.field1241;
                int var38 = (var36 & 0x7) + Statics.field217;
                class3 var39;
                if (field369 == var24) {
                    var39 = Statics.field3024;
                } else {
                    var39 = field363[var24];
                }
                if (var39 != null) {
                    class38 var40 = class38.method189(var29);
                    int var41;
                    int var42;
                    if (var32 == 1 || var32 == 3) {
                        var41 = var40.field845;
                        var42 = var40.field867;
                    } else {
                        var41 = var40.field867;
                        var42 = var40.field845;
                    }
                    int var43 = (var41 >> 1) + var37;
                    int var44 = (var41 + 1 >> 1) + var37;
                    int var45 = (var42 >> 1) + var38;
                    int var46 = (var42 + 1 >> 1) + var38;
                    int[][] var47 = class6.field78[Statics.field2842];
                    int var48 = var47[var43][var45] + var47[var44][var45] + var47[var43][var46] + var47[var44][var46] >> 2;
                    int var49 = (var37 << 7) + (var41 << 6);
                    int var50 = (var38 << 7) + (var42 << 6);
                    class100 var51 = var40.method686(var31, var32, var47, var49, var48, var50);
                    if (var51 != null) {
                        method2111(Statics.field2842, var37, var38, var33, -1, 0, 0, var28 + 1, var26 + 1);
                        var39.field40 = field256 + var28;
                        var39.field53 = field256 + var26;
                        var39.field45 = var51;
                        var39.field37 = var37 * 128 + var41 * 64;
                        var39.field52 = var38 * 128 + var42 * 64;
                        var39.field44 = var48;
                        if (var25 > var35) {
                            byte var52 = var25;
                            var25 = var35;
                            var35 = var52;
                        }
                        if (var27 > var34) {
                            byte var53 = var27;
                            var27 = var34;
                            var34 = var53;
                        }
                        var39.field46 = var25 + var37;
                        var39.field48 = var35 + var37;
                        var39.field47 = var27 + var38;
                        var39.field49 = var34 + var38;
                    }
                }
            }
            if (field290 == 140) {
                int var54 = field258.method2209();
                int var55 = field258.method2202();
                int var56 = var55 >> 2;
                int var57 = var55 & 0x3;
                int var58 = field307[var56];
                int var59 = field258.method2336();
                int var60 = (var59 >> 4 & 0x7) + Statics.field1241;
                int var61 = (var59 & 0x7) + Statics.field217;
                if (var60 >= 0 && var61 >= 0 && var60 < 103 && var61 < 103) {
                    if (var58 == 0) {
                        class82 var62 = Statics.field563.method1761(Statics.field2842, var60, var61);
                        if (var62 != null) {
                            int var63 = var62.field1391 >> 14 & 0x7FFF;
                            if (var56 == 2) {
                                var62.field1396 = new class12(var63, 2, var57 + 4, Statics.field2842, var60, var61, var54, false, var62.field1396);
                                var62.field1401 = new class12(var63, 2, var57 + 1 & 0x3, Statics.field2842, var60, var61, var54, false, var62.field1401);
                            } else {
                                var62.field1396 = new class12(var63, var56, var57, Statics.field2842, var60, var61, var54, false, var62.field1396);
                            }
                        }
                    }
                    if (var58 == 1) {
                        class89 var64 = Statics.field563.method1683(Statics.field2842, var60, var61);
                        if (var64 != null) {
                            int var65 = var64.field1484 >> 14 & 0x7FFF;
                            if (var56 == 4 || var56 == 5) {
                                var64.field1476 = new class12(var65, 4, var57, Statics.field2842, var60, var61, var54, false, var64.field1476);
                            } else if (var56 == 6) {
                                var64.field1476 = new class12(var65, 4, var57 + 4, Statics.field2842, var60, var61, var54, false, var64.field1476);
                            } else if (var56 == 7) {
                                var64.field1476 = new class12(var65, 4, (var57 + 2 & 0x3) + 4, Statics.field2842, var60, var61, var54, false, var64.field1476);
                            } else if (var56 == 8) {
                                var64.field1476 = new class12(var65, 4, var57 + 4, Statics.field2842, var60, var61, var54, false, var64.field1476);
                                var64.field1483 = new class12(var65, 4, (var57 + 2 & 0x3) + 4, Statics.field2842, var60, var61, var54, false, var64.field1483);
                            }
                        }
                    }
                    if (var58 == 2) {
                        class93 var66 = Statics.field563.method1684(Statics.field2842, var60, var61);
                        if (var56 == 11) {
                            var56 = 10;
                        }
                        if (var66 != null) {
                            var66.field1539 = new class12(var66.field1543 >> 14 & 0x7FFF, var56, var57, Statics.field2842, var60, var61, var54, false, var66.field1539);
                        }
                    }
                    if (var58 == 3) {
                        class88 var67 = Statics.field563.method1685(Statics.field2842, var60, var61);
                        if (var67 != null) {
                            var67.field1468 = new class12(var67.field1469 >> 14 & 0x7FFF, 22, var57, Statics.field2842, var60, var61, var54, false, var67.field1468);
                        }
                    }
                }
            } else {
                if (field290 == 67) {
                    int var68 = field258.method2176();
                    int var69 = (var68 >> 4 & 0x7) + Statics.field1241;
                    int var70 = (var68 & 0x7) + Statics.field217;
                    int var71 = field258.method2178();
                    int var72 = field258.method2176();
                    int var73 = var72 >> 4 & 0xF;
                    int var74 = var72 & 0x7;
                    int var75 = field258.method2176();
                    if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                        int var76 = var73 + 1;
                        if (Statics.field3024.field776[0] >= var69 - var76 && Statics.field3024.field776[0] <= var69 + var76 && Statics.field3024.field723[0] >= var70 - var76 && Statics.field3024.field723[0] <= var70 + var76 && field288 != 0 && var74 > 0 && field484 < 50) {
                            field380[field484] = var71;
                            field287[field484] = var74;
                            field487[field484] = var75;
                            field489[field484] = null;
                            field488[field484] = (var69 << 16) + (var70 << 8) + var73;
                            field484++;
                        }
                    }
                }
                if (field290 == 238) {
                    int var77 = field258.method2209();
                    int var78 = field258.method2336();
                    int var79 = (var78 >> 4 & 0x7) + Statics.field1241;
                    int var80 = (var78 & 0x7) + Statics.field217;
                    int var81 = field258.method2336();
                    int var82 = var81 >> 2;
                    int var83 = var81 & 0x3;
                    int var84 = field307[var82];
                    if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                        method2111(Statics.field2842, var79, var80, var84, var77, var82, var83, 0, -1);
                    }
                } else if (field290 == 15) {
                    int var85 = field258.method2202();
                    int var86 = (var85 >> 4 & 0x7) + Statics.field1241;
                    int var87 = (var85 & 0x7) + Statics.field217;
                    int var88 = field258.method2202();
                    int var89 = var88 >> 2;
                    int var90 = var88 & 0x3;
                    int var91 = field307[var89];
                    if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104) {
                        method2111(Statics.field2842, var86, var87, var91, -1, var89, var90, 0, -1);
                    }
                } else if (field290 == 21) {
                    int var92 = field258.method2210();
                    int var93 = field258.method2202();
                    int var94 = (var93 >> 4 & 0x7) + Statics.field1241;
                    int var95 = (var93 & 0x7) + Statics.field217;
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        class189 var96 = field378[Statics.field2842][var94][var95];
                        if (var96 != null) {
                            for (class27 var97 = (class27) var96.method3378(); var97 != null; var97 = (class27) var96.method3394()) {
                                if ((var92 & 0x7FFF) == var97.field613) {
                                    var97.method3463();
                                    break;
                                }
                            }
                            if (var96.method3378() == null) {
                                field378[Statics.field2842][var94][var95] = null;
                            }
                            method870(var94, var95);
                        }
                    }
                } else if (field290 == 255) {
                    int var98 = field258.method2176();
                    int var99 = (var98 >> 4 & 0x7) + Statics.field1241;
                    int var100 = (var98 & 0x7) + Statics.field217;
                    int var101 = field258.method2178();
                    int var102 = field258.method2176();
                    int var103 = field258.method2178();
                    if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                        int var104 = var99 * 128 + 64;
                        int var105 = var100 * 128 + 64;
                        class28 var106 = new class28(var101, Statics.field2842, var104, var105, method2008(var104, var105, Statics.field2842) - var102, var103, field256);
                        field430.method3374(var106);
                    }
                } else if (field290 == 23) {
                    int var107 = field258.method2176();
                    int var108 = (var107 >> 4 & 0x7) + Statics.field1241;
                    int var109 = (var107 & 0x7) + Statics.field217;
                    int var110 = field258.method2178();
                    int var111 = field258.method2178();
                    int var112 = field258.method2178();
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        class189 var113 = field378[Statics.field2842][var108][var109];
                        if (var113 != null) {
                            for (class27 var114 = (class27) var113.method3378(); var114 != null; var114 = (class27) var113.method3394()) {
                                if ((var110 & 0x7FFF) == var114.field613 && var114.field609 == var111) {
                                    var114.field609 = var112;
                                    break;
                                }
                            }
                            method870(var108, var109);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dk.bk(IIIIIIIIIB)V")
    public static final void method2111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class16 var9 = null;
        for (class16 var10 = (class16) field265.method3378(); var10 != null; var10 = (class16) field265.method3394()) {
            if (var10.field207 == arg0 && var10.field220 == arg1 && var10.field208 == arg2 && var10.field206 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class16();
            var9.field207 = arg0;
            var9.field206 = arg3;
            var9.field220 = arg1;
            var9.field208 = arg2;
            method193(var9);
            field265.method3374(var9);
        }
        var9.field212 = arg4;
        var9.field214 = arg5;
        var9.field216 = arg6;
        var9.field221 = arg7;
        var9.field219 = arg8;
    }

    @ObfuscatedName("o.bm(I)V")
    public static final void method156() {
        for (class16 var0 = (class16) field265.method3378(); var0 != null; var0 = (class16) field265.method3394()) {
            if (var0.field219 == -1) {
                var0.field221 = 0;
                method193(var0);
            } else {
                var0.method3463();
            }
        }
    }

    @ObfuscatedName("t.bw(Lt;B)V")
    public static final void method193(class16 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field206 == 0) {
            var1 = Statics.field563.method1686(arg0.field207, arg0.field220, arg0.field208);
        }
        if (arg0.field206 == 1) {
            var1 = Statics.field563.method1755(arg0.field207, arg0.field220, arg0.field208);
        }
        if (arg0.field206 == 2) {
            var1 = Statics.field563.method1688(arg0.field207, arg0.field220, arg0.field208);
        }
        if (arg0.field206 == 3) {
            var1 = Statics.field563.method1689(arg0.field207, arg0.field220, arg0.field208);
        }
        if (var1 != 0) {
            int var5 = Statics.field563.method1690(arg0.field207, arg0.field220, arg0.field208, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field209 = var2;
        arg0.field211 = var3;
        arg0.field215 = var4;
    }

    @ObfuscatedName("z.bp(B)V")
    public static final void method198() {
        for (class16 var0 = (class16) field265.method3378(); var0 != null; var0 = (class16) field265.method3394()) {
            if (var0.field219 > 0) {
                var0.field219--;
            }
            if (var0.field219 == 0) {
                if (var0.field209 >= 0) {
                    int var1 = var0.field209;
                    int var2 = var0.field211;
                    class38 var3 = class38.method189(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method683(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method208(var0.field207, var0.field206, var0.field220, var0.field208, var0.field209, var0.field215, var0.field211);
                var0.method3463();
            } else {
                if (var0.field221 > 0) {
                    var0.field221--;
                }
                if (var0.field221 == 0 && var0.field220 >= 1 && var0.field208 >= 1 && var0.field220 <= 102 && var0.field208 <= 102) {
                    if (var0.field212 >= 0) {
                        int var5 = var0.field212;
                        int var6 = var0.field214;
                        class38 var7 = class38.method189(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method683(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method208(var0.field207, var0.field206, var0.field220, var0.field208, var0.field212, var0.field216, var0.field214);
                    var0.field221 = -1;
                    if (var0.field212 == var0.field209 && var0.field209 == -1) {
                        var0.method3463();
                    } else if (var0.field212 == var0.field209 && var0.field216 == var0.field215 && var0.field214 == var0.field211) {
                        var0.method3463();
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.be(IIIIIIII)V")
    public static final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field241 && Statics.field2842 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field563.method1686(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field563.method1755(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field563.method1688(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field563.method1689(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field563.method1690(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field563.method1677(arg0, arg2, arg3);
                class38 var15 = class38.method189(var12);
                if (var15.field844 != 0) {
                    field304[arg0].method3692(arg2, arg3, var13, var14, var15.field847);
                }
            }
            if (arg1 == 1) {
                Statics.field563.method1678(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field563.method1679(arg0, arg2, arg3);
                class38 var16 = class38.method189(var12);
                if (var16.field867 + arg2 > 103 || var16.field867 + arg3 > 103 || var16.field845 + arg2 > 103 || var16.field845 + arg3 > 103) {
                    return;
                }
                if (var16.field844 != 0) {
                    field304[arg0].method3719(arg2, arg3, var16.field867, var16.field845, var14, var16.field847);
                }
            }
            if (arg1 == 3) {
                Statics.field563.method1680(arg0, arg2, arg3);
                class38 var17 = class38.method189(var12);
                if (var17.field844 == 1) {
                    field304[arg0].method3695(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field70[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method524(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field563, field304[arg0]);
    }

    @ObfuscatedName("aq.bv(III)V")
    public static final void method870(int arg0, int arg1) {
        class189 var2 = field378[Statics.field2842][arg0][arg1];
        if (var2 == null) {
            Statics.field563.method1730(Statics.field2842, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class27 var5 = null;
        for (class27 var6 = (class27) var2.method3378(); var6 != null; var6 = (class27) var2.method3394()) {
            class47 var7 = class47.method2467(var6.field613);
            long var8 = (long) var7.field1012;
            if (var7.field1032 == 1) {
                var8 = (long) (var6.field609 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field563.method1730(Statics.field2842, arg0, arg1);
            return;
        }
        var2.method3388(var5);
        class27 var10 = null;
        class27 var11 = null;
        for (class27 var12 = (class27) var2.method3378(); var12 != null; var12 = (class27) var2.method3394()) {
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
        Statics.field563.method1667(Statics.field2842, arg0, arg1, method2008(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2842), var5, var13, var10, var11);
    }

    @ObfuscatedName("dl.bc(I)V")
    public static final void method2481() {
        field371 = 0;
        field366 = 0;
        method134();
        Statics.method16();
        while (field258.method2464(field289) >= 11) {
            int var0 = field258.method2443(11);
            if (var0 == 2047) {
                break;
            }
            boolean var4 = false;
            if (field363[var0] == null) {
                field363[var0] = new class3();
                if (field368[var0] != null) {
                    field363[var0].method12(field368[var0]);
                }
                var4 = true;
            }
            field365[++field364 - 1] = var0;
            class3 var5 = field363[var0];
            var5.field770 = field256;
            int var6 = field258.method2443(5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = field258.method2443(1);
            int var8 = field258.method2443(5);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = field258.method2443(1);
            if (var9 == 1) {
                field348[++field366 - 1] = var0;
            }
            int var10 = field376[field258.method2443(3)];
            if (var4) {
                var5.field772 = var5.field725 = var10;
            }
            var5.method633(Statics.field3024.field776[0] + var8, Statics.field3024.field723[0] + var6, var7 == 1);
        }
        field258.method2442();
        method739();
        for (int var1 = 0; var1 < field371; var1++) {
            int var2 = field432[var1];
            if (field256 != field363[var2].field770) {
                field363[var2] = null;
            }
        }
        if (field289 != field258.field1834) {
            throw new RuntimeException(field258.field1834 + class2.field18 + field289);
        }
        for (int var3 = 0; var3 < field364; var3++) {
            if (field363[field365[var3]] == null) {
                throw new RuntimeException(var3 + class2.field18 + field364);
            }
        }
    }

    @ObfuscatedName("g.br(B)V")
    public static final void method134() {
        field258.method2456();
        int var0 = field258.method2443(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field258.method2443(2);
        if (var1 == 0) {
            field348[++field366 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field258.method2443(3);
            Statics.field3024.method634(var2, false);
            int var3 = field258.method2443(1);
            if (var3 == 1) {
                field348[++field366 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field258.method2443(3);
            Statics.field3024.method634(var4, true);
            int var5 = field258.method2443(3);
            Statics.field3024.method634(var5, true);
            int var6 = field258.method2443(1);
            if (var6 == 1) {
                field348[++field366 - 1] = 2047;
            }
        } else if (var1 == 3) {
            Statics.field2842 = field258.method2443(2);
            int var7 = field258.method2443(1);
            if (var7 == 1) {
                field348[++field366 - 1] = 2047;
            }
            int var8 = field258.method2443(1);
            int var9 = field258.method2443(7);
            int var10 = field258.method2443(7);
            Statics.field3024.method633(var10, var9, var8 == 1);
        }
    }

    @ObfuscatedName("aj.ba(I)V")
    public static final void method739() {
        for (int var0 = 0; var0 < field366; var0++) {
            int var1 = field348[var0];
            class3 var2 = field363[var1];
            int var3 = field258.method2176();
            if ((var3 & 0x80) != 0) {
                var3 += field258.method2176() << 8;
            }
            if ((var3 & 0x8) != 0) {
                var2.field736 = field258.method2167();
                if (var2.field736.charAt(0) == '~') {
                    var2.field736 = var2.field736.substring(1);
                    class11.method35(2, var2.field43, var2.field736);
                } else if (Statics.field3024 == var2) {
                    class11.method35(2, var2.field43, var2.field736);
                }
                var2.field741 = false;
                var2.field738 = 0;
                var2.field739 = 0;
                var2.field737 = 150;
            }
            if ((var3 & 0x100) != 0) {
                var2.field774 = field258.method2210();
                int var4 = field258.method2378();
                var2.field747 = var4 >> 16;
                var2.field742 = (var4 & 0xFFFF) + field256;
                var2.field759 = 0;
                var2.field735 = 0;
                if (var2.field742 > field256) {
                    var2.field759 = -1;
                }
                if (var2.field774 == 65535) {
                    var2.field774 = -1;
                }
            }
            if ((var3 & 0x400) != 0) {
                var2.field763 = field258.method2176();
                var2.field765 = field258.method2336();
                var2.field762 = field258.method2336();
                var2.field766 = field258.method2201();
                var2.field726 = field258.method2178() + field256;
                var2.field746 = field258.method2209() + field256;
                var2.field769 = field258.method2176();
                var2.field764 = 1;
                var2.field780 = 0;
            }
            if ((var3 & 0x40) != 0) {
                var2.field731 = field258.method2209();
                if (var2.field731 == 65535) {
                    var2.field731 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var5 = field258.method2278();
                int var6 = field258.method2336();
                var2.method638(var5, var6, field256);
                var2.field730 = field256 + 300;
                var2.field745 = field258.method2176();
                var2.field781 = field258.method2176();
            }
            if ((var3 & 0x1) != 0) {
                var2.field748 = field258.method2209();
                var2.field734 = field258.method2209();
            }
            if ((var3 & 0x4) != 0) {
                int var7 = field258.method2278();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field258.method2176();
                method175(var2, var7, var8);
            }
            if ((var3 & 0x200) != 0) {
                int var9 = field258.method2210();
                int var10 = field258.method2176();
                var2.method638(var9, var10, field256);
                var2.field730 = field256 + 300;
                var2.field745 = field258.method2336();
                var2.field781 = field258.method2202();
            }
            if ((var3 & 0x2) != 0) {
                int var11 = field258.method2176();
                byte[] var12 = new byte[var11];
                class111 var13 = new class111(var12);
                field258.method2221(var12, 0, var11);
                field368[var1] = var13;
                var2.method12(var13);
            }
            if ((var3 & 0x10) != 0) {
                int var14 = field258.method2210();
                class143[] var15 = new class143[] { class143.field2111, class143.field2112, class143.field2119, class143.field2113, class143.field2114 };
                class143 var16 = (class143) class101.method510(var15, field258.method2201());
                boolean var17 = field258.method2201() == 1;
                int var18 = field258.method2202();
                int var19 = field258.field1834;
                if (var2.field43 != null && var2.field34 != null) {
                    boolean var20 = false;
                    if (var16.field2122 && method138(var2.field43)) {
                        var20 = true;
                    }
                    if (!var20 && field362 == 0 && !var2.field33) {
                        field473.field1834 = 0;
                        field258.method2171(field473.field1835, 0, var18);
                        field473.field1834 = 0;
                        class111 var21 = field473;
                        String var25;
                        try {
                            int var22 = var21.method2188();
                            if (var22 > 32767) {
                                var22 = 32767;
                            }
                            byte[] var23 = new byte[var22];
                            var21.field1834 += Statics.field3038.method2101(var21.field1835, var21.field1834, var23, 0, var22);
                            String var24 = class156.method2563(var23, 0, var22);
                            var25 = var24;
                        } catch (Exception var33) {
                            var25 = "Cabbage";
                        }
                        String var28 = class213.method3565(class154.method880(var25));
                        var2.field736 = var28.trim();
                        var2.field738 = var14 >> 8;
                        var2.field739 = var14 & 0xFF;
                        var2.field737 = 150;
                        var2.field741 = var17;
                        var2.field777 = Statics.field3024 != var2 && var16.field2122 && field462 != "" && var28.toLowerCase().indexOf(field462) == -1;
                        int var29;
                        if (var16.field2117) {
                            var29 = var17 ? 91 : 1;
                        } else {
                            var29 = var17 ? 90 : 2;
                        }
                        if (var16.field2116 == -1) {
                            class11.method35(var29, var2.field43, var28);
                        } else {
                            int var31 = var16.field2116;
                            String var32 = "<img=" + var31 + ">";
                            class11.method35(var29, var32 + var2.field43, var28);
                        }
                    }
                }
                field258.field1834 = var18 + var19;
            }
        }
    }

    @ObfuscatedName("cc.bf(ZB)V")
    public static final void method2090(boolean arg0) {
        field371 = 0;
        field366 = 0;
        field258.method2456();
        int var1 = field258.method2443(8);
        if (var1 < field283) {
            for (int var2 = var1; var2 < field283; var2++) {
                field432[++field371 - 1] = field284[var2];
            }
        }
        if (var1 > field283) {
            throw new RuntimeException("");
        }
        field283 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field284[var3];
            class32 var5 = field397[var4];
            int var6 = field258.method2443(1);
            if (var6 == 0) {
                field284[++field283 - 1] = var4;
                var5.field770 = field256;
            } else {
                int var7 = field258.method2443(2);
                if (var7 == 0) {
                    field284[++field283 - 1] = var4;
                    var5.field770 = field256;
                    field348[++field366 - 1] = var4;
                } else if (var7 == 1) {
                    field284[++field283 - 1] = var4;
                    var5.field770 = field256;
                    int var8 = field258.method2443(3);
                    var5.method634(var8, false);
                    int var9 = field258.method2443(1);
                    if (var9 == 1) {
                        field348[++field366 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field284[++field283 - 1] = var4;
                    var5.field770 = field256;
                    int var10 = field258.method2443(3);
                    var5.method634(var10, true);
                    int var11 = field258.method2443(3);
                    var5.method634(var11, true);
                    int var12 = field258.method2443(1);
                    if (var12 == 1) {
                        field348[++field366 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field432[++field371 - 1] = var4;
                }
            }
        }
        while (field258.method2464(field289) >= 27) {
            int var13 = field258.method2443(15);
            if (var13 == 32767) {
                break;
            }
            boolean var29 = false;
            if (field397[var13] == null) {
                field397[var13] = new class32();
                var29 = true;
            }
            class32 var30 = field397[var13];
            field284[++field283 - 1] = var13;
            var30.field770 = field256;
            int var31 = field376[field258.method2443(3)];
            if (var29) {
                var30.field772 = var30.field725 = var31;
            }
            int var32 = field258.method2443(1);
            if (var32 == 1) {
                field348[++field366 - 1] = var13;
            }
            int var33 = field258.method2443(1);
            int var34;
            if (arg0) {
                var34 = field258.method2443(8);
                if (var34 > 127) {
                    var34 -= 256;
                }
            } else {
                var34 = field258.method2443(5);
                if (var34 > 15) {
                    var34 -= 32;
                }
            }
            var30.field691 = class37.method843(field258.method2443(14));
            int var35;
            if (arg0) {
                var35 = field258.method2443(8);
                if (var35 > 127) {
                    var35 -= 256;
                }
            } else {
                var35 = field258.method2443(5);
                if (var35 > 15) {
                    var35 -= 32;
                }
            }
            var30.field775 = var30.field691.field796;
            var30.field753 = var30.field691.field819;
            if (var30.field753 == 0) {
                var30.field725 = 0;
            }
            var30.field729 = var30.field691.field802;
            var30.field749 = var30.field691.field803;
            var30.field758 = var30.field691.field804;
            var30.field732 = var30.field691.field826;
            var30.field761 = var30.field691.field799;
            var30.field727 = var30.field691.field800;
            var30.field728 = var30.field691.field801;
            var30.method633(Statics.field3024.field776[0] + var35, Statics.field3024.field723[0] + var34, var33 == 1);
        }
        field258.method2442();
        for (int var14 = 0; var14 < field366; var14++) {
            int var15 = field348[var14];
            class32 var16 = field397[var15];
            int var17 = field258.method2176();
            if ((var17 & 0x1) != 0) {
                int var18 = field258.method2176();
                int var19 = field258.method2201();
                var16.method638(var18, var19, field256);
                var16.field730 = field256 + 300;
                var16.field745 = field258.method2178();
                var16.field781 = field258.method2210();
            }
            if ((var17 & 0x10) != 0) {
                var16.field736 = field258.method2167();
                var16.field737 = 100;
            }
            if ((var17 & 0x4) != 0) {
                var16.field691 = class37.method843(field258.method2278());
                var16.field775 = var16.field691.field796;
                var16.field753 = var16.field691.field819;
                var16.field729 = var16.field691.field802;
                var16.field749 = var16.field691.field803;
                var16.field758 = var16.field691.field804;
                var16.field732 = var16.field691.field826;
                var16.field761 = var16.field691.field799;
                var16.field727 = var16.field691.field800;
                var16.field728 = var16.field691.field801;
            }
            if ((var17 & 0x2) != 0) {
                int var20 = field258.method2210();
                if (var20 == 65535) {
                    var20 = -1;
                }
                int var21 = field258.method2176();
                if (var16.field782 == var20 && var20 != -1) {
                    int var22 = class40.method1826(var20).field905;
                    if (var22 == 1) {
                        var16.field754 = 0;
                        var16.field755 = 0;
                        var16.field756 = var21;
                        var16.field757 = 0;
                    }
                    if (var22 == 2) {
                        var16.field757 = 0;
                    }
                } else if (var20 == -1 || var16.field782 == -1 || class40.method1826(var20).field900 >= class40.method1826(var16.field782).field900) {
                    var16.field782 = var20;
                    var16.field754 = 0;
                    var16.field755 = 0;
                    var16.field756 = var21;
                    var16.field757 = 0;
                    var16.field780 = var16.field764;
                }
            }
            if ((var17 & 0x8) != 0) {
                var16.field731 = field258.method2209();
                if (var16.field731 == 65535) {
                    var16.field731 = -1;
                }
            }
            if ((var17 & 0x20) != 0) {
                int var23 = field258.method2336();
                int var24 = field258.method2202();
                var16.method638(var23, var24, field256);
                var16.field730 = field256 + 300;
                var16.field745 = field258.method2210();
                var16.field781 = field258.method2278();
            }
            if ((var17 & 0x40) != 0) {
                var16.field748 = field258.method2210();
                var16.field734 = field258.method2278();
            }
            if ((var17 & 0x80) != 0) {
                var16.field774 = field258.method2278();
                int var25 = field258.method2218();
                var16.field747 = var25 >> 16;
                var16.field742 = (var25 & 0xFFFF) + field256;
                var16.field759 = 0;
                var16.field735 = 0;
                if (var16.field742 > field256) {
                    var16.field759 = -1;
                }
                if (var16.field774 == 65535) {
                    var16.field774 = -1;
                }
            }
        }
        for (int var26 = 0; var26 < field371; var26++) {
            int var27 = field432[var26];
            if (field256 != field397[var27].field770) {
                field397[var27].field691 = null;
                field397[var27] = null;
            }
        }
        if (field289 != field258.field1834) {
            throw new RuntimeException(field258.field1834 + class2.field18 + field289);
        }
        for (int var28 = 0; var28 < field283; var28++) {
            if (field397[field284[var28]] == null) {
                throw new RuntimeException(var28 + class2.field18 + field283);
            }
        }
    }

    @ObfuscatedName("client.bd(IIIII)V")
    public static final void method500(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field449; var4++) {
            if (field456[var4] + field454[var4] > arg0 && field454[var4] < arg0 + arg2 && field457[var4] + field455[var4] > arg1 && field455[var4] < arg1 + arg3) {
                field451[var4] = true;
            }
        }
    }

    @ObfuscatedName("cm.bb(IIIII)V")
    public static final void method1905(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field449; var4++) {
            if (field456[var4] + field454[var4] > arg0 && field454[var4] < arg0 + arg2 && field457[var4] + field455[var4] > arg1 && field455[var4] < arg1 + arg3) {
                field452[var4] = true;
            }
        }
    }

    @ObfuscatedName("cl.bj(III)V")
    public static final void method2010(int arg0, int arg1) {
        int var2 = Statics.field3025.method3592(class148.field2213);
        for (int var3 = 0; var3 < field387; var3++) {
            class214 var4 = Statics.field3025;
            String var5;
            if (field411[var3].length() > 0) {
                var5 = field384[var3] + class148.field2160 + field411[var3];
            } else {
                var5 = field384[var3];
            }
            int var6 = var4.method3592(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field387 * 15 + 21;
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
        field386 = true;
        Statics.field556 = var8;
        Statics.field12 = var9;
        Statics.field1907 = var2;
        Statics.field608 = field387 * 15 + 22;
    }

    @ObfuscatedName("f.bq(II)Z")
    public static final boolean method125(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field390[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bj.bi(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1363(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 18) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field476 = arg0;
            field496 = arg1;
            field475.method2438(118);
            field475.method2342(arg3);
            field475.method2190(Statics.field545 + arg0);
            field475.method2354(class129.field1969[82] ? 1 : 0);
            field475.method2206(Statics.field1653 + arg1);
        }
        if (arg2 == 1) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field476 = arg0;
            field496 = arg1;
            field475.method2438(169);
            field475.method2342(Statics.field545 + arg0);
            field475.method2342(Statics.field2529);
            field475.method2217(Statics.field889);
            field475.method2342(Statics.field1838);
            field475.method2366(class129.field1969[82] ? 1 : 0);
            field475.method2342(Statics.field1653 + arg1);
            field475.method2190(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 5) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field476 = arg0;
            field496 = arg1;
            field475.method2438(55);
            field475.method2190(Statics.field1653 + arg1);
            field475.method2206(Statics.field545 + arg0);
            field475.method2190(arg3 >> 14 & 0x7FFF);
            field475.method2366(class129.field1969[82] ? 1 : 0);
        }
        if (arg2 == 11) {
            class32 var8 = field397[arg3];
            if (var8 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(93);
                field475.method2198(class129.field1969[82] ? 1 : 0);
                field475.method2208(arg3);
            }
        }
        if (arg2 == 31) {
            field475.method2438(175);
            field475.method2342(arg0);
            field475.method2208(Statics.field1838);
            field475.method2208(arg3);
            field475.method2215(arg1);
            field475.method2217(Statics.field889);
            field475.method2208(Statics.field2529);
            field354 = 0;
            Statics.field1819 = class164.method128(arg1);
            field350 = arg0;
        }
        if (arg2 == 19) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field476 = arg0;
            field496 = arg1;
            field475.method2438(230);
            field475.method2206(Statics.field1653 + arg1);
            field475.method2206(arg3);
            field475.method2198(class129.field1969[82] ? 1 : 0);
            field475.method2190(Statics.field545 + arg0);
        }
        if (arg2 == 21) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field476 = arg0;
            field496 = arg1;
            field475.method2438(227);
            field475.method2342(Statics.field1653 + arg1);
            field475.method2342(Statics.field545 + arg0);
            field475.method2200(class129.field1969[82] ? 1 : 0);
            field475.method2208(arg3);
        }
        if (arg2 == 9) {
            class32 var9 = field397[arg3];
            if (var9 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(165);
                field475.method2200(class129.field1969[82] ? 1 : 0);
                field475.method2206(arg3);
            }
        }
        if (arg2 == 37) {
            field475.method2438(45);
            field475.method2342(arg3);
            field475.method2229(arg1);
            field475.method2342(arg0);
            field354 = 0;
            Statics.field1819 = class164.method128(arg1);
            field350 = arg0;
        }
        if (arg2 == 35) {
            field475.method2438(105);
            field475.method2161(arg1);
            field475.method2206(arg0);
            field475.method2206(arg3);
            field354 = 0;
            Statics.field1819 = class164.method128(arg1);
            field350 = arg0;
        }
        if (arg2 == 48) {
            class3 var10 = field363[arg3];
            if (var10 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(41);
                field475.method2206(arg3);
                field475.method2366(class129.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 42) {
            field475.method2438(194);
            field475.method2208(arg0);
            field475.method2342(arg3);
            field475.method2217(arg1);
            field354 = 0;
            Statics.field1819 = class164.method128(arg1);
            field350 = arg0;
        }
        if (arg2 == 7) {
            class32 var11 = field397[arg3];
            if (var11 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(214);
                field475.method2190(Statics.field1838);
                field475.method2366(class129.field1969[82] ? 1 : 0);
                field475.method2208(arg3);
                field475.method2190(Statics.field2529);
                field475.method2217(Statics.field889);
            }
        }
        if (arg2 == 1001) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field476 = arg0;
            field496 = arg1;
            field475.method2438(32);
            field475.method2354(class129.field1969[82] ? 1 : 0);
            field475.method2208(arg3 >> 14 & 0x7FFF);
            field475.method2342(Statics.field545 + arg0);
            field475.method2206(Statics.field1653 + arg1);
        }
        if (arg2 == 58) {
            class164 var12 = class164.method2779(arg1, arg0);
            if (var12 != null) {
                field475.method2438(104);
                field475.method2206(arg0);
                field475.method2215(arg1);
                field475.method2208(field402);
                field475.method2190(var12.field2613);
                field475.method2161(Statics.field133);
                field475.method2206(field401);
            }
        }
        if (arg2 == 1004) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field475.method2438(224);
            field475.method2206(arg3);
        }
        if (arg2 == 30 && field409 == null) {
            method111(arg1, arg0);
            field409 = class164.method2779(arg1, arg0);
            method2384(field409);
        }
        if (arg2 == 2) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field476 = arg0;
            field496 = arg1;
            field475.method2438(21);
            field475.method2208(field401);
            field475.method2229(Statics.field133);
            field475.method2208(Statics.field545 + arg0);
            field475.method2208(Statics.field1653 + arg1);
            field475.method2342(arg3 >> 14 & 0x7FFF);
            field475.method2200(class129.field1969[82] ? 1 : 0);
        }
        if (arg2 == 47) {
            class3 var13 = field363[arg3];
            if (var13 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(29);
                field475.method2366(class129.field1969[82] ? 1 : 0);
                field475.method2206(arg3);
            }
        }
        if (arg2 == 38) {
            method581();
            class164 var14 = class164.method128(arg1);
            field392 = 1;
            Statics.field2529 = arg0;
            Statics.field889 = arg1;
            Statics.field1838 = arg3;
            method2384(var14);
            field507 = class2.method550(16748608) + class47.method2467(arg3).field1000 + class2.method550(16777215);
            if (field507 == null) {
                field507 = "null";
            }
            return;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class164 var15 = class164.method2779(arg1, arg0);
            if (var15 != null) {
                int var16 = var15.field2613;
                class164 var17 = class164.method2779(arg1, arg0);
                if (var17 != null) {
                    if (var17.field2691 != null) {
                        class1 var18 = new class1();
                        var18.field3 = var17;
                        var18.field6 = arg3;
                        var18.field4 = arg5;
                        var18.field9 = var17.field2691;
                        Statics.method562(var18);
                    }
                    boolean var19 = true;
                    if (var17.field2612 > 0) {
                        var19 = method950(var17);
                    }
                    if (var19) {
                        int var20 = method191(var17);
                        int var21 = arg3 - 1;
                        boolean var22 = (var20 >> var21 + 1 & 0x1) != 0;
                        if (var22) {
                            if (arg3 == 1) {
                                field475.method2438(189);
                                field475.method2229(arg1);
                                field475.method2190(arg0);
                                field475.method2190(var16);
                            }
                            if (arg3 == 2) {
                                field475.method2438(83);
                                field475.method2229(arg1);
                                field475.method2190(arg0);
                                field475.method2190(var16);
                            }
                            if (arg3 == 3) {
                                field475.method2438(209);
                                field475.method2229(arg1);
                                field475.method2190(arg0);
                                field475.method2190(var16);
                            }
                            if (arg3 == 4) {
                                field475.method2438(87);
                                field475.method2229(arg1);
                                field475.method2190(arg0);
                                field475.method2190(var16);
                            }
                            if (arg3 == 5) {
                                field475.method2438(132);
                                field475.method2229(arg1);
                                field475.method2190(arg0);
                                field475.method2190(var16);
                            }
                            if (arg3 == 6) {
                                field475.method2438(75);
                                field475.method2229(arg1);
                                field475.method2190(arg0);
                                field475.method2190(var16);
                            }
                            if (arg3 == 7) {
                                field475.method2438(180);
                                field475.method2229(arg1);
                                field475.method2190(arg0);
                                field475.method2190(var16);
                            }
                            if (arg3 == 8) {
                                field475.method2438(106);
                                field475.method2229(arg1);
                                field475.method2190(arg0);
                                field475.method2190(var16);
                            }
                            if (arg3 == 9) {
                                field475.method2438(156);
                                field475.method2229(arg1);
                                field475.method2190(arg0);
                                field475.method2190(var16);
                            }
                            if (arg3 == 10) {
                                field475.method2438(107);
                                field475.method2229(arg1);
                                field475.method2190(arg0);
                                field475.method2190(var16);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 40) {
            field475.method2438(195);
            field475.method2217(arg1);
            field475.method2342(arg3);
            field475.method2208(arg0);
            field354 = 0;
            Statics.field1819 = class164.method128(arg1);
            field350 = arg0;
        }
        if (arg2 == 20) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field476 = arg0;
            field496 = arg1;
            field475.method2438(150);
            field475.method2206(Statics.field1653 + arg1);
            field475.method2206(Statics.field545 + arg0);
            field475.method2354(class129.field1969[82] ? 1 : 0);
            field475.method2206(arg3);
        }
        if (arg2 == 34) {
            field475.method2438(182);
            field475.method2342(arg3);
            field475.method2161(arg1);
            field475.method2190(arg0);
            field354 = 0;
            Statics.field1819 = class164.method128(arg1);
            field350 = arg0;
        }
        if (arg2 == 29) {
            field475.method2438(164);
            field475.method2229(arg1);
            class164 var23 = class164.method128(arg1);
            if (var23.field2676 != null && var23.field2676[0][0] == 5) {
                int var24 = var23.field2676[0][1];
                if (class166.field2753[var24] != var23.field2660[0]) {
                    class166.field2753[var24] = var23.field2660[0];
                    method2505(var24);
                }
            }
        }
        if (arg2 == 33) {
            field475.method2438(42);
            field475.method2206(arg0);
            field475.method2217(arg1);
            field475.method2208(arg3);
            field354 = 0;
            Statics.field1819 = class164.method128(arg1);
            field350 = arg0;
        }
        if (arg2 == 1003) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            class32 var25 = field397[arg3];
            if (var25 != null) {
                class37 var26 = var25.field691;
                if (var26.field807 != null) {
                    var26 = var26.method654();
                }
                if (var26 != null) {
                    field475.method2438(68);
                    field475.method2208(var26.field794);
                }
            }
        }
        if (arg2 == 17) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field476 = arg0;
            field496 = arg1;
            field475.method2438(210);
            field475.method2208(arg3);
            field475.method2366(class129.field1969[82] ? 1 : 0);
            field475.method2342(field401);
            field475.method2190(Statics.field545 + arg0);
            field475.method2190(Statics.field1653 + arg1);
            field475.method2229(Statics.field133);
        }
        if (arg2 == 46) {
            class3 var27 = field363[arg3];
            if (var27 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(113);
                field475.method2208(arg3);
                field475.method2366(class129.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 15) {
            class3 var28 = field363[arg3];
            if (var28 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(31);
                field475.method2342(field401);
                field475.method2217(Statics.field133);
                field475.method2206(arg3);
                field475.method2200(class129.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class32 var29 = field397[arg3];
            if (var29 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(128);
                field475.method2366(class129.field1969[82] ? 1 : 0);
                field475.method2206(arg3);
                field475.method2208(field401);
                field475.method2215(Statics.field133);
            }
        }
        if (arg2 == 26) {
            method7();
        }
        if (arg2 == 10) {
            class32 var30 = field397[arg3];
            if (var30 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(129);
                field475.method2198(class129.field1969[82] ? 1 : 0);
                field475.method2342(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var31 = field363[arg3];
            if (var31 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(98);
                field475.method2342(arg3);
                field475.method2354(class129.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field475.method2438(23);
            field475.method2161(arg1);
            field475.method2342(arg0);
            field475.method2206(arg3);
            field354 = 0;
            Statics.field1819 = class164.method128(arg1);
            field350 = arg0;
        }
        if (arg2 == 43) {
            field475.method2438(61);
            field475.method2208(arg3);
            field475.method2206(arg0);
            field475.method2229(arg1);
            field354 = 0;
            Statics.field1819 = class164.method128(arg1);
            field350 = arg0;
        }
        if (arg2 == 50) {
            class3 var32 = field363[arg3];
            if (var32 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(80);
                field475.method2208(arg3);
                field475.method2198(class129.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            Statics.field563.method1697(Statics.field2842, arg0, arg1);
        }
        if (arg2 == 51) {
            class3 var33 = field363[arg3];
            if (var33 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(231);
                field475.method2354(class129.field1969[82] ? 1 : 0);
                field475.method2342(arg3);
            }
        }
        if (arg2 == 1002) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field475.method2438(92);
            field475.method2206(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 3) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field476 = arg0;
            field496 = arg1;
            field475.method2438(191);
            field475.method2208(arg3 >> 14 & 0x7FFF);
            field475.method2206(Statics.field1653 + arg1);
            field475.method2208(Statics.field545 + arg0);
            field475.method2366(class129.field1969[82] ? 1 : 0);
        }
        if (arg2 == 12) {
            class32 var34 = field397[arg3];
            if (var34 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(60);
                field475.method2190(arg3);
                field475.method2366(class129.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 22) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field476 = arg0;
            field496 = arg1;
            field475.method2438(140);
            field475.method2198(class129.field1969[82] ? 1 : 0);
            field475.method2190(Statics.field545 + arg0);
            field475.method2342(arg3);
            field475.method2190(Statics.field1653 + arg1);
        }
        if (arg2 == 28) {
            field475.method2438(164);
            field475.method2229(arg1);
            class164 var35 = class164.method128(arg1);
            if (var35.field2676 != null && var35.field2676[0][0] == 5) {
                int var36 = var35.field2676[0][1];
                class166.field2753[var36] = 1 - class166.field2753[var36];
                method2505(var36);
            }
        }
        if (arg2 == 14) {
            class3 var37 = field363[arg3];
            if (var37 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(228);
                field475.method2206(Statics.field1838);
                field475.method2208(arg3);
                field475.method2217(Statics.field889);
                field475.method2190(Statics.field2529);
                field475.method2354(class129.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field475.method2438(24);
            field475.method2208(arg0);
            field475.method2342(field401);
            field475.method2215(Statics.field133);
            field475.method2190(arg3);
            field475.method2161(arg1);
            field354 = 0;
            Statics.field1819 = class164.method128(arg1);
            field350 = arg0;
        }
        if (arg2 == 44) {
            class3 var38 = field363[arg3];
            if (var38 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(219);
                field475.method2190(arg3);
                field475.method2200(class129.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class164 var39 = class164.method2779(arg1, arg0);
            if (var39 != null) {
                method581();
                int var42 = method191(var39);
                int var43 = var42 >> 11 & 0x3F;
                method159(arg1, arg0, var43, var39.field2613);
                field392 = 0;
                field403 = method512(var39);
                if (field403 == null) {
                    field403 = "Null";
                }
                if (var39.field2709) {
                    field243 = var39.field2675 + class2.method550(16777215);
                } else {
                    field243 = class2.method550(65280) + var39.field2721 + class2.method550(16777215);
                }
            }
            return;
        }
        if (arg2 == 4) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field476 = arg0;
            field496 = arg1;
            field475.method2438(100);
            field475.method2342(Statics.field545 + arg0);
            field475.method2200(class129.field1969[82] ? 1 : 0);
            field475.method2342(arg3 >> 14 & 0x7FFF);
            field475.method2190(Statics.field1653 + arg1);
        }
        if (arg2 == 24) {
            class164 var44 = class164.method128(arg1);
            boolean var45 = true;
            if (var44.field2612 > 0) {
                var45 = method950(var44);
            }
            if (var45) {
                field475.method2438(164);
                field475.method2229(arg1);
            }
        }
        if (arg2 == 36) {
            field475.method2438(64);
            field475.method2190(arg3);
            field475.method2217(arg1);
            field475.method2208(arg0);
            field354 = 0;
            Statics.field1819 = class164.method128(arg1);
            field350 = arg0;
        }
        if (arg2 == 13) {
            class32 var46 = field397[arg3];
            if (var46 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(1);
                field475.method2190(arg3);
                field475.method2366(class129.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 1005) {
            class164 var47 = class164.method128(arg1);
            if (var47 == null || var47.field2724[arg0] < 100000) {
                field475.method2438(224);
                field475.method2206(arg3);
            } else {
                class11.method35(27, "", var47.field2724[arg0] + " x " + class47.method2467(arg3).field1000);
            }
            field354 = 0;
            Statics.field1819 = class164.method128(arg1);
            field350 = arg0;
        }
        if (arg2 == 49) {
            class3 var48 = field363[arg3];
            if (var48 != null) {
                field267 = arg6;
                field351 = arg7;
                field353 = 2;
                field352 = 0;
                field476 = arg0;
                field496 = arg1;
                field475.method2438(248);
                field475.method2208(arg3);
                field475.method2200(class129.field1969[82] ? 1 : 0);
            }
        }
        if (arg2 == 16) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field476 = arg0;
            field496 = arg1;
            field475.method2438(71);
            field475.method2206(arg3);
            field475.method2206(Statics.field545 + arg0);
            field475.method2229(Statics.field889);
            field475.method2342(Statics.field2529);
            field475.method2342(Statics.field1838);
            field475.method2354(class129.field1969[82] ? 1 : 0);
            field475.method2206(Statics.field1653 + arg1);
        }
        if (arg2 == 6) {
            field267 = arg6;
            field351 = arg7;
            field353 = 2;
            field352 = 0;
            field476 = arg0;
            field496 = arg1;
            field475.method2438(7);
            field475.method2206(Statics.field1653 + arg1);
            field475.method2366(class129.field1969[82] ? 1 : 0);
            field475.method2190(Statics.field545 + arg0);
            field475.method2342(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 41) {
            field475.method2438(90);
            field475.method2229(arg1);
            field475.method2206(arg0);
            field475.method2342(arg3);
            field354 = 0;
            Statics.field1819 = class164.method128(arg1);
            field350 = arg0;
        }
        if (field392 != 0) {
            field392 = 0;
            method2384(class164.method128(Statics.field889));
        }
        if (field400) {
            method581();
        }
        if (Statics.field1819 != null && field354 == 0) {
            method2384(Statics.field1819);
        }
    }

    @ObfuscatedName("al.by(ILjava/lang/String;B)V")
    public static void method794(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field364; var3++) {
            class3 var4 = field363[field365[var3]];
            if (var4 != null && var4.field43 != null && var4.field43.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field475.method2438(219);
                    field475.method2190(field365[var3]);
                    field475.method2200(0);
                } else if (arg0 == 4) {
                    field475.method2438(29);
                    field475.method2366(0);
                    field475.method2206(field365[var3]);
                } else if (arg0 == 6) {
                    field475.method2438(248);
                    field475.method2208(field365[var3]);
                    field475.method2200(0);
                } else if (arg0 == 7) {
                    field475.method2438(80);
                    field475.method2208(field365[var3]);
                    field475.method2198(0);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class11.method35(4, "", class148.field2309 + arg1);
        }
    }

    @ObfuscatedName("h.bz(IIIII)V")
    public static void method159(int arg0, int arg1, int arg2, int arg3) {
        class164 var4 = class164.method2779(arg0, arg1);
        if (var4 != null && var4.field2707 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field9 = var4.field2707;
            Statics.method562(var5);
        }
        field402 = arg3;
        field400 = true;
        Statics.field133 = arg0;
        field401 = arg1;
        Statics.field1916 = arg2;
        method2384(var4);
    }

    @ObfuscatedName("ai.bh(S)V")
    public static void method581() {
        if (!field400) {
            return;
        }
        class164 var0 = class164.method2779(Statics.field133, field401);
        if (var0 != null && var0.field2698 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field9 = var0.field2698;
            Statics.method562(var1);
        }
        field400 = false;
        method2384(var0);
    }

    @ObfuscatedName("i.bt(IIB)V")
    public static void method111(int arg0, int arg1) {
        field475.method2438(166);
        field475.method2215(arg0);
        field475.method2206(arg1);
    }

    @ObfuscatedName("fk.bo(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3017(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field386 || field387 >= 500) {
            return;
        }
        field384[field387] = arg0;
        field411[field387] = arg1;
        field390[field387] = arg2;
        field391[field387] = arg3;
        field388[field387] = arg4;
        field426[field387] = arg5;
        field387++;
    }

    @ObfuscatedName("j.bg(I)V")
    public static void method174() {
        for (int var0 = 0; var0 < field387; var0++) {
            if (method600(field390[var0])) {
                if (var0 < field387 - 1) {
                    for (int var1 = var0; var1 < field387 - 1; var1++) {
                        field384[var1] = field384[var1 + 1];
                        field411[var1] = field411[var1 + 1];
                        field390[var1] = field390[var1 + 1];
                        field391[var1] = field391[var1 + 1];
                        field388[var1] = field388[var1 + 1];
                        field426[var1] = field426[var1 + 1];
                    }
                }
                field387--;
            }
        }
    }

    @ObfuscatedName("ai.cf(II)Z")
    public static boolean method600(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("x.ch(Lay;IIII)V")
    public static final void method528(class37 arg0, int arg1, int arg2, int arg3) {
        if (field387 >= 400) {
            return;
        }
        if (arg0.field807 != null) {
            arg0 = arg0.method654();
        }
        if (arg0 == null || !arg0.field823 || arg0.field825 && field413 != arg1) {
            return;
        }
        String var4 = arg0.field795;
        if (arg0.field812 != 0) {
            var4 = var4 + method10(arg0.field812, Statics.field3024.field41) + " " + class2.field20 + class148.field2316 + arg0.field812 + class2.field19;
        }
        if (field392 == 1) {
            method3017(class148.field2313, field507 + " " + class2.field22 + " " + class2.method550(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field400) {
            String[] var5 = arg0.field814;
            if (field416) {
                var5 = method2468(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class148.field2204)) {
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
                        method3017(var5[var6], class2.method550(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class148.field2204)) {
                        short var9 = 0;
                        if (field257 == class19.field509 || field257 == class19.field508 && arg0.field812 > Statics.field3024.field41) {
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
                        method3017(var5[var8], class2.method550(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method3017(class148.field2311, class2.method550(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1916 & 0x2) == 2) {
            method3017(field403, field243 + " " + class2.field22 + " " + class2.method550(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("di.cb(Ll;IIII)V")
    public static final void method2561(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field3024 == arg0 || field387 >= 400) {
            return;
        }
        String var4;
        if (arg0.field38 == 0) {
            var4 = arg0.field43 + method10(arg0.field41, Statics.field3024.field41) + " " + class2.field20 + class148.field2316 + arg0.field41 + class2.field19;
        } else {
            var4 = arg0.field43 + " " + class2.field20 + class148.field2275 + arg0.field38 + class2.field19;
        }
        if (field392 == 1) {
            method3017(class148.field2313, field507 + " " + class2.field22 + " " + class2.method550(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field400) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field358[var5] != null) {
                    short var6 = 0;
                    if (field358[var5].equalsIgnoreCase(class148.field2204)) {
                        if (field257 == class19.field509 || field257 == class19.field508 && arg0.field41 > Statics.field3024.field41) {
                            var6 = 2000;
                        }
                        if (Statics.field3024.field51 != 0 && arg0.field51 != 0) {
                            if (Statics.field3024.field51 == arg0.field51) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field375[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field460[var5] + var6;
                    method3017(field358[var5], class2.method550(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1916 & 0x8) == 8) {
            method3017(field403, field243 + " " + class2.field22 + " " + class2.method550(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field387; var9++) {
            if (field390[var9] == 23) {
                field411[var9] = class2.method550(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("a.cv(III)Ljava/lang/String;")
    public static final String method10(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method550(16711680);
        } else if (var2 < -6) {
            return class2.method550(16723968);
        } else if (var2 < -3) {
            return class2.method550(16740352);
        } else if (var2 < 0) {
            return class2.method550(16756736);
        } else if (var2 > 9) {
            return class2.method550(65280);
        } else if (var2 > 6) {
            return class2.method550(4259584);
        } else if (var2 > 3) {
            return class2.method550(8453888);
        } else if (var2 > 0) {
            return class2.method550(12648192);
        } else {
            return class2.method550(16776960);
        }
    }

    @ObfuscatedName("ew.ci(IIIIIIIII)V")
    public static final void method2690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class164.method2116(arg0)) {
            Statics.field2739 = null;
            method2820(Statics.field2711[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2739 != null) {
                method2820(Statics.field2739, -1412584499, arg1, arg2, arg3, arg4, Statics.field719, Statics.field1948, arg7);
                Statics.field2739 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field451[var8] = true;
            }
        } else {
            field451[arg7] = true;
        }
    }

    @ObfuscatedName("eg.cg([Lfb;IIIIIIIII)V")
    public static final void method2820(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75.method1612(arg2, arg3, arg4, arg5);
        class86.method1829();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class164 var10 = arg0[var9];
            if (var10 != null && (var10.field2629 == arg1 || arg1 == -1412584499 && field417 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field454[field449] = var10.field2623 + arg6;
                    field455[field449] = var10.field2624 + arg7;
                    field456[field449] = var10.field2627;
                    field457[field449] = var10.field2628;
                    var11 = ++field449 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2646 = var11;
                var10.field2737 = field256;
                if (!var10.field2709 || !method846(var10)) {
                    if (var10.field2612 > 0) {
                        int var12 = var10.field2612;
                        if (var12 == 324) {
                            if (field323 == -1) {
                                field323 = var10.field2642;
                                field504 = var10.field2661;
                            }
                            if (field404.field2764) {
                                var10.field2642 = field323;
                            } else {
                                var10.field2642 = field504;
                            }
                        } else if (var12 == 325) {
                            if (field323 == -1) {
                                field323 = var10.field2642;
                                field504 = var10.field2661;
                            }
                            if (field404.field2764) {
                                var10.field2642 = field504;
                            } else {
                                var10.field2642 = field323;
                            }
                        } else if (var12 == 327) {
                            var10.field2658 = 150;
                            var10.field2659 = (int) (Math.sin((double) field256 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2650 = 5;
                            var10.field2651 = 0;
                        } else if (var12 == 328) {
                            var10.field2658 = 150;
                            var10.field2659 = (int) (Math.sin((double) field256 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2650 = 5;
                            var10.field2651 = 1;
                        }
                    }
                    int var13 = var10.field2623 + arg6;
                    int var14 = var10.field2624 + arg7;
                    int var15 = var10.field2734;
                    if (field417 == var10) {
                        if (arg1 != -1412584499 && !var10.field2684) {
                            Statics.field2739 = arg0;
                            Statics.field719 = arg6;
                            Statics.field1948 = arg7;
                            continue;
                        }
                        if (field428 && field422) {
                            int var16 = class132.field2007;
                            int var17 = class132.field2008;
                            int var18 = var16 - field419;
                            int var19 = var17 - field420;
                            if (var18 < field423) {
                                var18 = field423;
                            }
                            if (var10.field2627 + var18 > field423 + field306.field2627) {
                                var18 = field423 + field306.field2627 - var10.field2627;
                            }
                            if (var19 < field335) {
                                var19 = field335;
                            }
                            if (var10.field2628 + var19 > field335 + field306.field2628) {
                                var19 = field335 + field306.field2628 - var10.field2628;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2684) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2620 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2620 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2627 + var13;
                        int var27 = var10.field2628 + var14;
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
                        int var30 = var10.field2627 + var13;
                        int var31 = var10.field2628 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2709 || var20 < var22 && var21 < var23) {
                        if (var10.field2612 != 0) {
                            if (var10.field2612 == 1337) {
                                field431 = var13;
                                field395 = var14;
                                method206(var13, var14, var10.field2627, var10.field2628);
                                class75.method1612(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2612 == 1338) {
                                method121(var13, var14, var11);
                                class75.method1612(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2620 == 0) {
                            if (!var10.field2709 && method846(var10) && Statics.field2762 != var10) {
                                continue;
                            }
                            if (!var10.field2709) {
                                if (var10.field2632 > var10.field2727 - var10.field2628) {
                                    var10.field2632 = var10.field2727 - var10.field2628;
                                }
                                if (var10.field2632 < 0) {
                                    var10.field2632 = 0;
                                }
                            }
                            method2820(arg0, var10.field2618, var20, var21, var22, var23, var13 - var10.field2631, var14 - var10.field2632, var11);
                            if (var10.field2729 != null) {
                                method2820(var10.field2729, var10.field2618, var20, var21, var22, var23, var13 - var10.field2631, var14 - var10.field2632, var11);
                            }
                            class4 var32 = (class4) field406.method3339((long) var10.field2618);
                            if (var32 != null) {
                                method2690(var32.field60, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class75.method1612(arg2, arg3, arg4, arg5);
                            class86.method1829();
                        }
                        if (field425[var11] || field458 > 1) {
                            if (var10.field2620 == 0 && !var10.field2709 && var10.field2727 > var10.field2628) {
                                method1(var10.field2627 + var13, var14, var10.field2632, var10.field2628, var10.field2727);
                            }
                            if (var10.field2620 != 1) {
                                if (var10.field2620 == 2) {
                                    int var33 = 0;
                                    for (int var34 = 0; var34 < var10.field2628; var34++) {
                                        for (int var35 = 0; var35 < var10.field2627; var35++) {
                                            int var36 = (var10.field2672 + 32) * var35 + var13;
                                            int var37 = (var10.field2686 + 32) * var34 + var14;
                                            if (var33 < 20) {
                                                var36 += var10.field2674[var33];
                                                var37 += var10.field2693[var33];
                                            }
                                            if (var10.field2723[var33] > 0) {
                                                boolean var38 = false;
                                                boolean var39 = false;
                                                int var40 = var10.field2723[var33] - 1;
                                                if (var36 + 32 > arg2 && var36 < arg4 && var37 + 32 > arg3 && var37 < arg5 || Statics.field55 == var10 && field356 == var33) {
                                                    class74 var41;
                                                    if (field392 == 1 && Statics.field2529 == var33 && Statics.field889 == var10.field2618) {
                                                        var41 = class47.method2510(var40, var10.field2724[var33], 2, 0, 2, false);
                                                    } else {
                                                        var41 = class47.method2510(var40, var10.field2724[var33], 1, 3153952, 2, false);
                                                    }
                                                    if (var41 == null) {
                                                        method2384(var10);
                                                    } else if (Statics.field55 == var10 && field356 == var33) {
                                                        int var42 = class132.field2007 - field357;
                                                        int var43 = class132.field2008 - field373;
                                                        if (var42 < 5 && var42 > -5) {
                                                            var42 = 0;
                                                        }
                                                        if (var43 < 5 && var43 > -5) {
                                                            var43 = 0;
                                                        }
                                                        if (field361 < 5) {
                                                            var42 = 0;
                                                            var43 = 0;
                                                        }
                                                        var41.method1493(var36 + var42, var37 + var43, 128);
                                                        if (arg1 != -1) {
                                                            class164 var44 = arg0[arg1 & 0xFFFF];
                                                            if (var37 + var43 < class75.field1286 && var44.field2632 > 0) {
                                                                int var45 = field398 * (class75.field1286 - var37 - var43) / 3;
                                                                if (var45 > field398 * 10) {
                                                                    var45 = field398 * 10;
                                                                }
                                                                if (var45 > var44.field2632) {
                                                                    var45 = var44.field2632;
                                                                }
                                                                var44.field2632 -= var45;
                                                                field373 += var45;
                                                                method2384(var44);
                                                            }
                                                            if (var37 + var43 + 32 > class75.field1287 && var44.field2632 < var44.field2727 - var44.field2628) {
                                                                int var46 = field398 * (var37 + var43 + 32 - class75.field1287) / 3;
                                                                if (var46 > field398 * 10) {
                                                                    var46 = field398 * 10;
                                                                }
                                                                if (var46 > var44.field2727 - var44.field2628 - var44.field2632) {
                                                                    var46 = var44.field2727 - var44.field2628 - var44.field2632;
                                                                }
                                                                var44.field2632 += var46;
                                                                field373 -= var46;
                                                                method2384(var44);
                                                            }
                                                        }
                                                    } else if (Statics.field1819 == var10 && field350 == var33) {
                                                        var41.method1493(var36, var37, 128);
                                                    } else {
                                                        var41.method1494(var36, var37);
                                                    }
                                                }
                                            } else if (var10.field2679 != null && var33 < 20) {
                                                class74 var47 = var10.method2970(var33);
                                                if (var47 != null) {
                                                    var47.method1494(var36, var37);
                                                } else if (class164.field2725) {
                                                    method2384(var10);
                                                }
                                            }
                                            var33++;
                                        }
                                    }
                                } else if (var10.field2620 == 3) {
                                    int var48;
                                    if (method1461(var10)) {
                                        var48 = var10.field2636;
                                        if (Statics.field2762 == var10 && var10.field2638 != 0) {
                                            var48 = var10.field2638;
                                        }
                                    } else {
                                        var48 = var10.field2635;
                                        if (Statics.field2762 == var10 && var10.field2637 != 0) {
                                            var48 = var10.field2637;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2639) {
                                            class75.method1575(var13, var14, var10.field2627, var10.field2628, var48);
                                        } else {
                                            class75.method1580(var13, var14, var10.field2627, var10.field2628, var48);
                                        }
                                    } else if (var10.field2639) {
                                        class75.method1577(var13, var14, var10.field2627, var10.field2628, var48, 256 - (var15 & 0xFF));
                                    } else {
                                        class75.method1581(var13, var14, var10.field2627, var10.field2628, var48, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2620 == 4) {
                                    class214 var49 = var10.method2977();
                                    if (var49 != null) {
                                        String var50 = var10.field2617;
                                        int var51;
                                        if (method1461(var10)) {
                                            var51 = var10.field2636;
                                            if (Statics.field2762 == var10 && var10.field2638 != 0) {
                                                var51 = var10.field2638;
                                            }
                                            if (var10.field2667.length() > 0) {
                                                var50 = var10.field2667;
                                            }
                                        } else {
                                            var51 = var10.field2635;
                                            if (Statics.field2762 == var10 && var10.field2637 != 0) {
                                                var51 = var10.field2637;
                                            }
                                        }
                                        if (var10.field2709 && var10.field2613 != -1) {
                                            class47 var52 = class47.method2467(var10.field2613);
                                            var50 = var52.field1000;
                                            if (var50 == null) {
                                                var50 = "null";
                                            }
                                            if ((var52.field1032 == 1 || var10.field2726 != 1) && var10.field2726 != -1) {
                                                var50 = class2.method550(16748608) + var50 + class2.field24 + " " + 'x' + method2524(var10.field2726);
                                            }
                                        }
                                        if (field409 == var10) {
                                            class148 var10000 = (class148) null;
                                            var50 = class148.field2318;
                                            var51 = var10.field2635;
                                        }
                                        if (!var10.field2709) {
                                            var50 = method1909(var50, var10);
                                        }
                                        var49.method3569(var50, var13, var14, var10.field2627, var10.field2628, var51, var10.field2671 ? 0 : -1, var10.field2669, var10.field2670, var10.field2732);
                                    } else if (class164.field2725) {
                                        method2384(var10);
                                    }
                                } else if (var10.field2620 == 5) {
                                    if (var10.field2709) {
                                        class74 var54;
                                        if (var10.field2613 == -1) {
                                            var54 = var10.method2976(false);
                                        } else {
                                            var54 = class47.method2510(var10.field2613, var10.field2726, var10.field2733, var10.field2647, var10.field2702, false);
                                        }
                                        if (var54 != null) {
                                            int var55 = var54.field1276;
                                            int var56 = var54.field1277;
                                            if (var10.field2654) {
                                                class75.method1573(var13, var14, var10.field2627 + var13, var10.field2628 + var14);
                                                int var57 = (var10.field2627 + (var55 - 1)) / var55;
                                                int var58 = (var10.field2628 + (var56 - 1)) / var56;
                                                for (int var59 = 0; var59 < var57; var59++) {
                                                    for (int var60 = 0; var60 < var58; var60++) {
                                                        if (var10.field2644 != 0) {
                                                            var54.method1501(var55 / 2 + var55 * var59 + var13, var56 / 2 + var56 * var60 + var14, var10.field2644, 4096);
                                                        } else if (var15 == 0) {
                                                            var54.method1494(var55 * var59 + var13, var56 * var60 + var14);
                                                        } else {
                                                            var54.method1493(var55 * var59 + var13, var56 * var60 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class75.method1612(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var61 = var10.field2627 * 4096 / var55;
                                                if (var10.field2644 != 0) {
                                                    var54.method1501(var10.field2627 / 2 + var13, var10.field2628 / 2 + var14, var10.field2644, var61);
                                                } else if (var15 != 0) {
                                                    var54.method1498(var13, var14, var10.field2627, var10.field2628, 256 - (var15 & 0xFF));
                                                } else if (var10.field2627 == var55 && var10.field2628 == var56) {
                                                    var54.method1494(var13, var14);
                                                } else {
                                                    var54.method1492(var13, var14, var10.field2627, var10.field2628);
                                                }
                                            }
                                        } else if (class164.field2725) {
                                            method2384(var10);
                                        }
                                    } else {
                                        class74 var53 = var10.method2976(method1461(var10));
                                        if (var53 != null) {
                                            var53.method1494(var13, var14);
                                        } else if (class164.field2725) {
                                            method2384(var10);
                                        }
                                    }
                                } else if (var10.field2620 == 6) {
                                    boolean var62 = method1461(var10);
                                    int var63;
                                    if (var62) {
                                        var63 = var10.field2655;
                                    } else {
                                        var63 = var10.field2610;
                                    }
                                    class100 var64 = null;
                                    int var65 = 0;
                                    if (var10.field2613 != -1) {
                                        class47 var66 = class47.method2467(var10.field2613);
                                        if (var66 != null) {
                                            class47 var67 = var66.method902(var10.field2726);
                                            var64 = var67.method889(1);
                                            if (var64 == null) {
                                                method2384(var10);
                                            } else {
                                                var64.method2051();
                                                var65 = var64.field1324 / 2;
                                            }
                                        }
                                    } else if (var10.field2650 == 5) {
                                        if (var10.field2651 == 0) {
                                            var64 = field404.method3053((class40) null, -1, (class40) null, -1);
                                        } else {
                                            var64 = Statics.field3024.method30();
                                        }
                                    } else if (var63 == -1) {
                                        var64 = var10.method2979((class40) null, -1, var62, Statics.field3024.field34);
                                        if (var64 == null && class164.field2725) {
                                            method2384(var10);
                                        }
                                    } else {
                                        class40 var68 = class40.method1826(var63);
                                        var64 = var10.method2979(var68, var10.field2688, var62, Statics.field3024.field34);
                                        if (var64 == null && class164.field2725) {
                                            method2384(var10);
                                        }
                                    }
                                    class86.method1837(var10.field2627 / 2 + var13, var10.field2628 / 2 + var14);
                                    int var69 = var10.field2664 * class86.field1449[var10.field2658] >> 16;
                                    int var70 = var10.field2664 * class86.field1440[var10.field2658] >> 16;
                                    if (var64 != null) {
                                        if (var10.field2709) {
                                            var64.method2051();
                                            if (var10.field2663) {
                                                var64.method2033(0, var10.field2659, var10.field2643, var10.field2658, var10.field2656, var10.field2736 + var65 + var69, var10.field2736 + var70, var10.field2664);
                                            } else {
                                                var64.method2032(0, var10.field2659, var10.field2643, var10.field2658, var10.field2656, var10.field2736 + var65 + var69, var10.field2736 + var70);
                                            }
                                        } else {
                                            var64.method2032(0, var10.field2659, 0, var10.field2658, 0, var69, var70);
                                        }
                                    }
                                    class86.method1831();
                                } else {
                                    if (var10.field2620 == 7) {
                                        class214 var71 = var10.method2977();
                                        if (var71 == null) {
                                            if (class164.field2725) {
                                                method2384(var10);
                                            }
                                            continue;
                                        }
                                        int var72 = 0;
                                        for (int var73 = 0; var73 < var10.field2628; var73++) {
                                            for (int var74 = 0; var74 < var10.field2627; var74++) {
                                                if (var10.field2723[var72] > 0) {
                                                    class47 var75 = class47.method2467(var10.field2723[var72] - 1);
                                                    String var76;
                                                    if (var75.field1032 != 1 && var10.field2724[var72] == 1) {
                                                        var76 = class2.method550(16748608) + var75.field1000 + class2.field24;
                                                    } else {
                                                        var76 = class2.method550(16748608) + var75.field1000 + class2.field24 + " " + 'x' + method2524(var10.field2724[var72]);
                                                    }
                                                    int var77 = (var10.field2672 + 115) * var74 + var13;
                                                    int var78 = (var10.field2686 + 12) * var73 + var14;
                                                    if (var10.field2669 == 0) {
                                                        var71.method3622(var76, var77, var78, var10.field2635, var10.field2671 ? 0 : -1);
                                                    } else if (var10.field2669 == 1) {
                                                        var71.method3566(var76, var10.field2627 / 2 + var77, var78, var10.field2635, var10.field2671 ? 0 : -1);
                                                    } else {
                                                        var71.method3597(var76, var10.field2627 + var77 - 1, var78, var10.field2635, var10.field2671 ? 0 : -1);
                                                    }
                                                }
                                                var72++;
                                            }
                                        }
                                    }
                                    if (var10.field2620 == 8 && Statics.field933 == var10 && field440 == field396) {
                                        int var79 = 0;
                                        int var80 = 0;
                                        class214 var81 = Statics.field3016;
                                        String var82 = var10.field2617;
                                        String var83 = method1909(var82, var10);
                                        while (var83.length() > 0) {
                                            int var84 = var83.indexOf(class2.field23);
                                            String var85;
                                            if (var84 == -1) {
                                                var85 = var83;
                                                var83 = "";
                                            } else {
                                                var85 = var83.substring(0, var84);
                                                var83 = var83.substring(var84 + 4);
                                            }
                                            int var86 = var81.method3592(var85);
                                            if (var86 > var79) {
                                                var79 = var86;
                                            }
                                            var80 += var81.field3050 + 1;
                                        }
                                        var79 += 6;
                                        var80 += 7;
                                        int var87 = var10.field2627 + var13 - 5 - var79;
                                        int var88 = var10.field2628 + var14 + 5;
                                        if (var87 < var13 + 5) {
                                            var87 = var13 + 5;
                                        }
                                        if (var79 + var87 > arg4) {
                                            var87 = arg4 - var79;
                                        }
                                        if (var80 + var88 > arg5) {
                                            var88 = arg5 - var80;
                                        }
                                        class75.method1575(var87, var88, var79, var80, 16777120);
                                        class75.method1580(var87, var88, var79, var80, 0);
                                        String var89 = var10.field2617;
                                        int var90 = var81.field3050 + var88 + 2;
                                        String var91 = method1909(var89, var10);
                                        while (var91.length() > 0) {
                                            int var92 = var91.indexOf(class2.field23);
                                            String var93;
                                            if (var92 == -1) {
                                                var93 = var91;
                                                var91 = "";
                                            } else {
                                                var93 = var91.substring(0, var92);
                                                var91 = var91.substring(var92 + 4);
                                            }
                                            var81.method3622(var93, var87 + 3, var90, 0, -1);
                                            var90 += var81.field3050 + 1;
                                        }
                                    }
                                    if (var10.field2620 == 9) {
                                        if (var10.field2705 == 1) {
                                            class75.method1571(var13, var14, var10.field2627 + var13, var10.field2628 + var14, var10.field2635);
                                        } else {
                                            int var94 = var10.field2627 >= 0 ? var10.field2627 : -var10.field2627;
                                            int var95 = var10.field2628 >= 0 ? var10.field2628 : -var10.field2628;
                                            int var96 = var94;
                                            if (var94 < var95) {
                                                var96 = var95;
                                            }
                                            if (var96 != 0) {
                                                int var97 = (var10.field2627 << 16) / var96;
                                                int var98 = (var10.field2628 << 16) / var96;
                                                if (var98 <= var97) {
                                                    var97 = -var97;
                                                } else {
                                                    var98 = -var98;
                                                }
                                                int var99 = var10.field2705 * var98 >> 17;
                                                int var100 = var10.field2705 * var98 + 1 >> 17;
                                                int var101 = var10.field2705 * var97 >> 17;
                                                int var102 = var10.field2705 * var97 + 1 >> 17;
                                                int var103 = var13 + var99;
                                                int var104 = var13 - var100;
                                                int var105 = var10.field2627 + var13 - var100;
                                                int var106 = var10.field2627 + var13 + var99;
                                                int var107 = var14 + var101;
                                                int var108 = var14 - var102;
                                                int var109 = var10.field2628 + var14 - var102;
                                                int var110 = var10.field2628 + var14 + var101;
                                                class86.method1838(var103, var104, var105);
                                                class86.method1840(var107, var108, var109, var103, var104, var105, var10.field2635);
                                                class86.method1838(var103, var105, var106);
                                                class86.method1840(var107, var109, var110, var103, var105, var106, var10.field2635);
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

    @ObfuscatedName("cm.cd(Ljava/lang/String;Lfb;B)Ljava/lang/String;")
    public static String method1909(String arg0, class164 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method116(arg1, var2 - 1);
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
                if (Statics.field2521 != null) {
                    var8 = class154.method2781(Statics.field2521.field2072);
                    if (Statics.field2521.field2074 != null) {
                        var8 = (String) Statics.field2521.field2074;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("do.cp(IB)Ljava/lang/String;")
    public static final String method2524(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field18 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method550(65408) + var1.substring(0, var1.length() - 8) + class148.field2362 + " " + class2.field20 + var1 + class2.field19 + class2.field24;
        } else if (var1.length() > 6) {
            return " " + class2.method550(16777215) + var1.substring(0, var1.length() - 4) + class148.field2323 + " " + class2.field20 + var1 + class2.field19 + class2.field24;
        } else {
            return " " + class2.method550(16776960) + var1 + class2.field24;
        }
    }

    @ObfuscatedName("e.ce(IIIIII)V")
    public static final void method1(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1925[0].method1637(arg0, arg1);
        Statics.field1925[1].method1637(arg0, arg1 + arg3 - 16);
        class75.method1575(arg0, arg1 + 16, 16, arg3 - 32, field317);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class75.method1575(arg0, arg1 + 16 + var6, 16, var5, field322);
        class75.method1584(arg0, arg1 + 16 + var6, var5, field502);
        class75.method1584(arg0 + 1, arg1 + 16 + var6, var5, field502);
        class75.method1582(arg0, arg1 + 16 + var6, 16, field502);
        class75.method1582(arg0, arg1 + 17 + var6, 16, field502);
        class75.method1584(arg0 + 15, arg1 + 16 + var6, var5, field480);
        class75.method1584(arg0 + 14, arg1 + 17 + var6, var5 - 1, field480);
        class75.method1582(arg0, arg1 + 15 + var6 + var5, 16, field480);
        class75.method1582(arg0 + 1, arg1 + 14 + var6 + var5, 15, field480);
    }

    @ObfuscatedName("by.cm(Lfb;I)Z")
    public static final boolean method1461(class164 arg0) {
        if (arg0.field2718 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2718.length; var1++) {
            int var2 = method116(arg0, var1);
            int var3 = arg0.field2660[var1];
            if (arg0.field2718[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2718[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2718[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("r.cj(Lfb;II)I")
    public static final int method116(class164 arg0, int arg1) {
        if (arg0.field2676 == null || arg1 >= arg0.field2676.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2676[arg1];
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
                    var7 = field382[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field383[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field282[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class164 var11 = class164.method128(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class47.method2467(var12).field1004 || field249)) {
                        for (int var13 = 0; var13 < var11.field2723.length; var13++) {
                            if (var12 + 1 == var11.field2723[var13]) {
                                var7 += var11.field2724[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class166.field2753[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class146.field2144[field383[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class166.field2753[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field3024.field41;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class146.field2143[var14]) {
                            var7 += field383[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class164 var17 = class164.method128(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class47.method2467(var18).field1004 || field249)) {
                        for (int var19 = 0; var19 < var17.field2723.length; var19++) {
                            if (var18 + 1 == var17.field2723[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field410;
                }
                if (var6 == 12) {
                    var7 = field291;
                }
                if (var6 == 13) {
                    int var20 = class166.field2753[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class166.method40(var22);
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
                    var7 = (Statics.field3024.field767 >> 7) + Statics.field545;
                }
                if (var6 == 19) {
                    var7 = (Statics.field3024.field722 >> 7) + Statics.field1653;
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

    @ObfuscatedName("n.cq([Lfb;IIIIIIIB)V")
    public static final void method538(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class164 var9 = arg0[var8];
            if (var9 != null && (!var9.field2709 || var9.field2620 == 0 || var9.field2641 || method191(var9) != 0 || field306 == var9) && var9.field2629 == arg1 && (!var9.field2709 || !method846(var9))) {
                int var10 = var9.field2623 + arg6;
                int var11 = var9.field2624 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2620 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2620 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2627 + var10;
                    int var19 = var9.field2628 + var11;
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
                    int var22 = var9.field2627 + var10;
                    int var23 = var9.field2628 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field417 == var9) {
                    field280 = true;
                    field312 = var10;
                    field427 = var11;
                }
                if (!var9.field2709 || var12 < var14 && var13 < var15) {
                    int var24 = class132.field2007;
                    int var25 = class132.field2008;
                    if (class132.field2013 != 0) {
                        var24 = class132.field2014;
                        var25 = class132.field2006;
                    }
                    if (var9.field2612 == 1337) {
                        method2384(var9);
                        if (!field255 && !field386 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field392 == 0 && !field400) {
                                method3017(class148.field2315, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class100.field1733; var28++) {
                                int var29 = class100.field1702[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field563.method1690(Statics.field2842, var30, var31, var29) >= 0) {
                                        class38 var34 = class38.method189(var33);
                                        if (var34.field870 != null) {
                                            var34 = var34.method689();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field392 == 1) {
                                            method3017(class148.field2313, field507 + " " + class2.field22 + " " + class2.method550(65535) + var34.field858, 1, var29, var30, var31);
                                        } else if (!field400) {
                                            String[] var35 = var34.field856;
                                            if (field416) {
                                                var35 = method2468(var35);
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
                                                        method3017(var35[var36], class2.method550(65535) + var34.field858, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method3017(class148.field2311, class2.method550(65535) + var34.field858, 1002, var34.field836 << 14, var30, var31);
                                        } else if ((Statics.field1916 & 0x4) == 4) {
                                            method3017(field403, field243 + " " + class2.field22 + " " + class2.method550(65535) + var34.field858, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class32 var38 = field397[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field691.field796 == 1 && (var38.field767 & 0x7F) == 64 && (var38.field722 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field283; var39++) {
                                                class32 var40 = field397[field284[var39]];
                                                if (var40 != null && var38 != var40 && var40.field691.field796 == 1 && var38.field767 == var40.field767 && var38.field722 == var40.field722) {
                                                    method528(var40.field691, field284[var39], var30, var31);
                                                }
                                            }
                                            for (int var41 = 0; var41 < field364; var41++) {
                                                class3 var42 = field363[field365[var41]];
                                                if (var42 != null && var38.field767 == var42.field767 && var38.field722 == var42.field722) {
                                                    method2561(var42, field365[var41], var30, var31);
                                                }
                                            }
                                        }
                                        method528(var38.field691, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var43 = field363[var33];
                                        if (var43 == null) {
                                            continue;
                                        }
                                        if ((var43.field767 & 0x7F) == 64 && (var43.field722 & 0x7F) == 64) {
                                            for (int var44 = 0; var44 < field283; var44++) {
                                                class32 var45 = field397[field284[var44]];
                                                if (var45 != null && var45.field691.field796 == 1 && var43.field767 == var45.field767 && var43.field722 == var45.field722) {
                                                    method528(var45.field691, field284[var44], var30, var31);
                                                }
                                            }
                                            for (int var46 = 0; var46 < field364; var46++) {
                                                class3 var47 = field363[field365[var46]];
                                                if (var47 != null && var43 != var47 && var43.field767 == var47.field767 && var43.field722 == var47.field722) {
                                                    method2561(var47, field365[var46], var30, var31);
                                                }
                                            }
                                        }
                                        if (field377 == var33) {
                                            var26 = var29;
                                        } else {
                                            method2561(var43, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class189 var48 = field378[Statics.field2842][var30][var31];
                                        if (var48 != null) {
                                            for (class27 var49 = (class27) var48.method3379(); var49 != null; var49 = (class27) var48.method3395()) {
                                                class47 var50 = class47.method2467(var49.field613);
                                                if (field392 == 1) {
                                                    method3017(class148.field2313, field507 + " " + class2.field22 + " " + class2.method550(16748608) + var50.field1000, 16, var49.field613, var30, var31);
                                                } else if (!field400) {
                                                    String[] var51 = var50.field1018;
                                                    if (field416) {
                                                        var51 = method2468(var51);
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
                                                            method3017(var51[var52], class2.method550(16748608) + var50.field1000, var53, var49.field613, var30, var31);
                                                        } else if (var52 == 2) {
                                                            method3017(class148.field2283, class2.method550(16748608) + var50.field1000, 20, var49.field613, var30, var31);
                                                        }
                                                    }
                                                    method3017(class148.field2311, class2.method550(16748608) + var50.field1000, 1004, var49.field613, var30, var31);
                                                } else if ((Statics.field1916 & 0x1) == 1) {
                                                    method3017(field403, field243 + " " + class2.field22 + " " + class2.method550(16748608) + var50.field1000, 17, var49.field613, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var54 = var26 & 0x7F;
                                int var55 = var26 >> 7 & 0x7F;
                                class3 var56 = field363[field377];
                                method2561(var56, field377, var54, var55);
                            }
                        }
                    } else if (var9.field2612 == 1338) {
                        method113(var10, var11);
                    } else {
                        if (!field386 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var57 = var24 - var10;
                            int var58 = var25 - var11;
                            if (var9.field2621 == 1) {
                                method3017(var9.field2677, "", 24, 0, 0, var9.field2618);
                            }
                            if (var9.field2621 == 2 && !field400) {
                                String var59 = method512(var9);
                                if (var59 != null) {
                                    method3017(var59, class2.method550(65280) + var9.field2721, 25, 0, -1, var9.field2618);
                                }
                            }
                            if (var9.field2621 == 3) {
                                method3017(class148.field2319, "", 26, 0, 0, var9.field2618);
                            }
                            if (var9.field2621 == 4) {
                                method3017(var9.field2677, "", 28, 0, 0, var9.field2618);
                            }
                            if (var9.field2621 == 5) {
                                method3017(var9.field2677, "", 29, 0, 0, var9.field2618);
                            }
                            if (var9.field2621 == 6 && field409 == null) {
                                method3017(var9.field2677, "", 30, 0, -1, var9.field2618);
                            }
                            if (var9.field2620 == 2) {
                                int var60 = 0;
                                for (int var61 = 0; var61 < var9.field2628; var61++) {
                                    for (int var62 = 0; var62 < var9.field2627; var62++) {
                                        int var63 = (var9.field2672 + 32) * var62;
                                        int var64 = (var9.field2686 + 32) * var61;
                                        if (var60 < 20) {
                                            var63 += var9.field2674[var60];
                                            var64 += var9.field2693[var60];
                                        }
                                        if (var57 >= var63 && var58 >= var64 && var57 < var63 + 32 && var58 < var64 + 32) {
                                            field281 = var60;
                                            Statics.field213 = var9;
                                            if (var9.field2723[var60] > 0) {
                                                class47 var65 = class47.method2467(var9.field2723[var60] - 1);
                                                if (field392 == 1 && class168.method1932(method191(var9))) {
                                                    if (Statics.field889 != var9.field2618 || Statics.field2529 != var60) {
                                                        method3017(class148.field2313, field507 + " " + class2.field22 + " " + class2.method550(16748608) + var65.field1000, 31, var65.field998, var60, var9.field2618);
                                                    }
                                                } else if (!field400 || !class168.method1932(method191(var9))) {
                                                    String[] var66 = var65.field1015;
                                                    if (field416) {
                                                        var66 = method2468(var66);
                                                    }
                                                    if (class168.method1932(method191(var9))) {
                                                        for (int var67 = 4; var67 >= 3; var67--) {
                                                            if (var66 != null && var66[var67] != null) {
                                                                byte var68;
                                                                if (var67 == 3) {
                                                                    var68 = 36;
                                                                } else {
                                                                    var68 = 37;
                                                                }
                                                                method3017(var66[var67], class2.method550(16748608) + var65.field1000, var68, var65.field998, var60, var9.field2618);
                                                            } else if (var67 == 4) {
                                                                method3017(class148.field2161, class2.method550(16748608) + var65.field1000, 37, var65.field998, var60, var9.field2618);
                                                            }
                                                        }
                                                    }
                                                    int var69 = method191(var9);
                                                    boolean var70 = (var69 >> 31 & 0x1) != 0;
                                                    if (var70) {
                                                        method3017(class148.field2313, class2.method550(16748608) + var65.field1000, 38, var65.field998, var60, var9.field2618);
                                                    }
                                                    class168 var10000 = (class168) null;
                                                    if (class168.method1932(method191(var9)) && var66 != null) {
                                                        for (int var71 = 2; var71 >= 0; var71--) {
                                                            if (var66[var71] != null) {
                                                                byte var72 = 0;
                                                                if (var71 == 0) {
                                                                    var72 = 33;
                                                                }
                                                                if (var71 == 1) {
                                                                    var72 = 34;
                                                                }
                                                                if (var71 == 2) {
                                                                    var72 = 35;
                                                                }
                                                                method3017(var66[var71], class2.method550(16748608) + var65.field1000, var72, var65.field998, var60, var9.field2618);
                                                            }
                                                        }
                                                    }
                                                    String[] var73 = var9.field2645;
                                                    if (field416) {
                                                        var73 = method2468(var73);
                                                    }
                                                    if (var73 != null) {
                                                        for (int var74 = 4; var74 >= 0; var74--) {
                                                            if (var73[var74] != null) {
                                                                byte var75 = 0;
                                                                if (var74 == 0) {
                                                                    var75 = 39;
                                                                }
                                                                if (var74 == 1) {
                                                                    var75 = 40;
                                                                }
                                                                if (var74 == 2) {
                                                                    var75 = 41;
                                                                }
                                                                if (var74 == 3) {
                                                                    var75 = 42;
                                                                }
                                                                if (var74 == 4) {
                                                                    var75 = 43;
                                                                }
                                                                method3017(var73[var74], class2.method550(16748608) + var65.field1000, var75, var65.field998, var60, var9.field2618);
                                                            }
                                                        }
                                                    }
                                                    method3017(class148.field2311, class2.method550(16748608) + var65.field1000, 1005, var65.field998, var60, var9.field2618);
                                                } else if ((Statics.field1916 & 0x10) == 16) {
                                                    method3017(field403, field243 + " " + class2.field22 + " " + class2.method550(16748608) + var65.field1000, 32, var65.field998, var60, var9.field2618);
                                                }
                                            }
                                        }
                                        var60++;
                                    }
                                }
                            }
                            if (var9.field2709) {
                                if (!field400) {
                                    for (int var76 = 9; var76 >= 5; var76--) {
                                        int var77 = method191(var9);
                                        boolean var78 = (var77 >> var76 + 1 & 0x1) != 0;
                                        String var79;
                                        if (!var78 && var9.field2691 == null) {
                                            var79 = null;
                                        } else if (var9.field2680 == null || var9.field2680.length <= var76 || var9.field2680[var76] == null || var9.field2680[var76].trim().length() == 0) {
                                            var79 = null;
                                        } else {
                                            var79 = var9.field2680[var76];
                                        }
                                        if (var79 != null) {
                                            method3017(var79, var9.field2675, 1007, var76 + 1, var9.field2619, var9.field2618);
                                        }
                                    }
                                    String var81 = method512(var9);
                                    if (var81 != null) {
                                        method3017(var81, var9.field2675, 25, 0, var9.field2619, var9.field2618);
                                    }
                                    for (int var82 = 4; var82 >= 0; var82--) {
                                        int var83 = method191(var9);
                                        boolean var84 = (var83 >> var82 + 1 & 0x1) != 0;
                                        String var85;
                                        if (!var84 && var9.field2691 == null) {
                                            var85 = null;
                                        } else if (var9.field2680 == null || var9.field2680.length <= var82 || var9.field2680[var82] == null || var9.field2680[var82].trim().length() == 0) {
                                            var85 = null;
                                        } else {
                                            var85 = var9.field2680[var82];
                                        }
                                        if (var85 != null) {
                                            method3017(var85, var9.field2675, 57, var82 + 1, var9.field2619, var9.field2618);
                                        }
                                    }
                                    if (class168.method1935(method191(var9))) {
                                        method3017(class148.field2420, "", 30, 0, var9.field2619, var9.field2618);
                                    }
                                } else if (class168.method2012(method191(var9)) && (Statics.field1916 & 0x20) == 32) {
                                    method3017(field403, field243 + " " + class2.field22 + " " + var9.field2675, 58, 0, var9.field2619, var9.field2618);
                                }
                            }
                        }
                        if (var9.field2620 == 0) {
                            if (!var9.field2709 && method846(var9) && Statics.field2762 != var9) {
                                continue;
                            }
                            method538(arg0, var9.field2618, var12, var13, var14, var15, var10 - var9.field2631, var11 - var9.field2632);
                            if (var9.field2729 != null) {
                                method538(var9.field2729, var9.field2618, var12, var13, var14, var15, var10 - var9.field2631, var11 - var9.field2632);
                            }
                            class4 var87 = (class4) field406.method3339((long) var9.field2618);
                            if (var87 != null) {
                                if (var87.field59 == 0 && class132.field2007 >= var12 && class132.field2008 >= var13 && class132.field2007 < var14 && class132.field2008 < var15 && !field386 && !field415) {
                                    field384[0] = class148.field2396;
                                    field411[0] = "";
                                    field390[0] = 1006;
                                    field387 = 1;
                                }
                                int var88 = var87.field60;
                                if (class164.method2116(var88)) {
                                    method538(Statics.field2711[var88], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2709) {
                            if (var9.field2673 && class132.field2007 >= var12 && class132.field2008 >= var13 && class132.field2007 < var14 && class132.field2008 < var15) {
                                for (class1 var89 = (class1) field320.method3378(); var89 != null; var89 = (class1) field320.method3394()) {
                                    if (var89.field2) {
                                        var89.method3463();
                                        var89.field3.field2730 = false;
                                    }
                                }
                                if (Statics.field5 == 0) {
                                    field417 = null;
                                    field306 = null;
                                }
                                if (!field386) {
                                    field384[0] = class148.field2396;
                                    field411[0] = "";
                                    field390[0] = 1006;
                                    field387 = 1;
                                }
                            }
                            boolean var90;
                            if (class132.field2007 >= var12 && class132.field2008 >= var13 && class132.field2007 < var14 && class132.field2008 < var15) {
                                var90 = true;
                            } else {
                                var90 = false;
                            }
                            boolean var91 = false;
                            if ((class132.field2016 == 1 || !Statics.field517 && class132.field2016 == 4) && var90) {
                                var91 = true;
                            }
                            boolean var92 = false;
                            if ((class132.field2013 == 1 || !Statics.field517 && class132.field2013 == 4) && class132.field2014 >= var12 && class132.field2006 >= var13 && class132.field2014 < var14 && class132.field2006 < var15) {
                                var92 = true;
                            }
                            if (var92) {
                                method3292(var9, class132.field2014 - var10, class132.field2006 - var11);
                            }
                            if (field417 != null && field417 != var9 && var90 && class168.method2658(method191(var9))) {
                                field421 = var9;
                            }
                            if (field306 == var9) {
                                field422 = true;
                                field423 = var10;
                                field335 = var11;
                            }
                            if (var9.field2641) {
                                if (var90 && field444 != 0 && var9.field2608 != null) {
                                    class1 var93 = new class1();
                                    var93.field2 = true;
                                    var93.field3 = var9;
                                    var93.field13 = field444;
                                    var93.field9 = var9.field2608;
                                    field320.method3374(var93);
                                }
                                if (field417 != null || Statics.field55 != null || field386) {
                                    var92 = false;
                                    var91 = false;
                                    var90 = false;
                                }
                                if (!var9.field2731 && var92) {
                                    var9.field2731 = true;
                                    if (var9.field2668 != null) {
                                        class1 var94 = new class1();
                                        var94.field2 = true;
                                        var94.field3 = var9;
                                        var94.field16 = class132.field2014 - var10;
                                        var94.field13 = class132.field2006 - var11;
                                        var94.field9 = var9.field2668;
                                        field320.method3374(var94);
                                    }
                                }
                                if (var9.field2731 && var91 && var9.field2689 != null) {
                                    class1 var95 = new class1();
                                    var95.field2 = true;
                                    var95.field3 = var9;
                                    var95.field16 = class132.field2007 - var10;
                                    var95.field13 = class132.field2008 - var11;
                                    var95.field9 = var9.field2689;
                                    field320.method3374(var95);
                                }
                                if (var9.field2731 && !var91) {
                                    var9.field2731 = false;
                                    if (var9.field2690 != null) {
                                        class1 var96 = new class1();
                                        var96.field2 = true;
                                        var96.field3 = var9;
                                        var96.field16 = class132.field2007 - var10;
                                        var96.field13 = class132.field2008 - var11;
                                        var96.field9 = var9.field2690;
                                        field292.method3374(var96);
                                    }
                                }
                                if (var91 && var9.field2719 != null) {
                                    class1 var97 = new class1();
                                    var97.field2 = true;
                                    var97.field3 = var9;
                                    var97.field16 = class132.field2007 - var10;
                                    var97.field13 = class132.field2008 - var11;
                                    var97.field9 = var9.field2719;
                                    field320.method3374(var97);
                                }
                                if (!var9.field2730 && var90) {
                                    var9.field2730 = true;
                                    if (var9.field2692 != null) {
                                        class1 var98 = new class1();
                                        var98.field2 = true;
                                        var98.field3 = var9;
                                        var98.field16 = class132.field2007 - var10;
                                        var98.field13 = class132.field2008 - var11;
                                        var98.field9 = var9.field2692;
                                        field320.method3374(var98);
                                    }
                                }
                                if (var9.field2730 && var90 && var9.field2682 != null) {
                                    class1 var99 = new class1();
                                    var99.field2 = true;
                                    var99.field3 = var9;
                                    var99.field16 = class132.field2007 - var10;
                                    var99.field13 = class132.field2008 - var11;
                                    var99.field9 = var9.field2682;
                                    field320.method3374(var99);
                                }
                                if (var9.field2730 && !var90) {
                                    var9.field2730 = false;
                                    if (var9.field2694 != null) {
                                        class1 var100 = new class1();
                                        var100.field2 = true;
                                        var100.field3 = var9;
                                        var100.field16 = class132.field2007 - var10;
                                        var100.field13 = class132.field2008 - var11;
                                        var100.field9 = var9.field2694;
                                        field292.method3374(var100);
                                    }
                                }
                                if (var9.field2622 != null) {
                                    class1 var101 = new class1();
                                    var101.field3 = var9;
                                    var101.field9 = var9.field2622;
                                    field446.method3374(var101);
                                }
                                if (var9.field2699 != null && field341 > var9.field2697) {
                                    if (var9.field2700 == null || field341 - var9.field2697 > 32) {
                                        class1 var106 = new class1();
                                        var106.field3 = var9;
                                        var106.field9 = var9.field2699;
                                        field320.method3374(var106);
                                    } else {
                                        label985: for (int var102 = var9.field2697; var102 < field341; var102++) {
                                            int var103 = field349[var102 & 0x1F];
                                            for (int var104 = 0; var104 < var9.field2700.length; var104++) {
                                                if (var9.field2700[var104] == var103) {
                                                    class1 var105 = new class1();
                                                    var105.field3 = var9;
                                                    var105.field9 = var9.field2699;
                                                    field320.method3374(var105);
                                                    break label985;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2697 = field341;
                                }
                                if (var9.field2701 != null && field433 > var9.field2609) {
                                    if (var9.field2738 == null || field433 - var9.field2609 > 32) {
                                        class1 var111 = new class1();
                                        var111.field3 = var9;
                                        var111.field9 = var9.field2701;
                                        field320.method3374(var111);
                                    } else {
                                        label961: for (int var107 = var9.field2609; var107 < field433; var107++) {
                                            int var108 = field297[var107 & 0x1F];
                                            for (int var109 = 0; var109 < var9.field2738.length; var109++) {
                                                if (var9.field2738[var109] == var108) {
                                                    class1 var110 = new class1();
                                                    var110.field3 = var9;
                                                    var110.field9 = var9.field2701;
                                                    field320.method3374(var110);
                                                    break label961;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2609 = field433;
                                }
                                if (var9.field2703 != null && field435 > var9.field2735) {
                                    if (var9.field2704 == null || field435 - var9.field2735 > 32) {
                                        class1 var116 = new class1();
                                        var116.field3 = var9;
                                        var116.field9 = var9.field2703;
                                        field320.method3374(var116);
                                    } else {
                                        label937: for (int var112 = var9.field2735; var112 < field435; var112++) {
                                            int var113 = field434[var112 & 0x1F];
                                            for (int var114 = 0; var114 < var9.field2704.length; var114++) {
                                                if (var9.field2704[var114] == var113) {
                                                    class1 var115 = new class1();
                                                    var115.field3 = var9;
                                                    var115.field9 = var9.field2703;
                                                    field320.method3374(var115);
                                                    break label937;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2735 = field435;
                                }
                                if (field436 > var9.field2666 && var9.field2708 != null) {
                                    class1 var117 = new class1();
                                    var117.field3 = var9;
                                    var117.field9 = var9.field2708;
                                    field320.method3374(var117);
                                }
                                if (field447 > var9.field2666 && var9.field2710 != null) {
                                    class1 var118 = new class1();
                                    var118.field3 = var9;
                                    var118.field9 = var9.field2710;
                                    field320.method3374(var118);
                                }
                                if (field438 > var9.field2666 && var9.field2616 != null) {
                                    class1 var119 = new class1();
                                    var119.field3 = var9;
                                    var119.field9 = var9.field2616;
                                    field320.method3374(var119);
                                }
                                if (field439 > var9.field2666 && var9.field2715 != null) {
                                    class1 var120 = new class1();
                                    var120.field3 = var9;
                                    var120.field9 = var9.field2715;
                                    field320.method3374(var120);
                                }
                                if (field437 > var9.field2666 && var9.field2716 != null) {
                                    class1 var121 = new class1();
                                    var121.field3 = var9;
                                    var121.field9 = var9.field2716;
                                    field320.method3374(var121);
                                }
                                if (field441 > var9.field2666 && var9.field2687 != null) {
                                    class1 var122 = new class1();
                                    var122.field3 = var9;
                                    var122.field9 = var9.field2687;
                                    field320.method3374(var122);
                                }
                                var9.field2666 = field429;
                                if (var9.field2634 != null) {
                                    for (int var123 = 0; var123 < field424; var123++) {
                                        class1 var124 = new class1();
                                        var124.field3 = var9;
                                        var124.field8 = field467[var123];
                                        var124.field10 = field339[var123];
                                        var124.field9 = var9.field2634;
                                        field320.method3374(var124);
                                    }
                                }
                            }
                        }
                        if (!var9.field2709 && field417 == null && Statics.field55 == null && !field386) {
                            if ((var9.field2720 >= 0 || var9.field2637 != 0) && class132.field2007 >= var12 && class132.field2008 >= var13 && class132.field2007 < var14 && class132.field2008 < var15) {
                                if (var9.field2720 >= 0) {
                                    Statics.field2762 = arg0[var9.field2720];
                                } else {
                                    Statics.field2762 = var9;
                                }
                            }
                            if (var9.field2620 == 8 && class132.field2007 >= var12 && class132.field2008 >= var13 && class132.field2007 < var14 && class132.field2008 < var15) {
                                Statics.field933 = var9;
                            }
                            if (var9.field2727 > var9.field2628) {
                                int var125 = var9.field2627 + var10;
                                int var126 = var9.field2628;
                                int var127 = var9.field2727;
                                int var128 = class132.field2007;
                                int var129 = class132.field2008;
                                if (field325) {
                                    field329 = 32;
                                } else {
                                    field329 = 0;
                                }
                                field325 = false;
                                if (class132.field2016 == 1 || !Statics.field517 && class132.field2016 == 4) {
                                    if (var128 >= var125 && var128 < var125 + 16 && var129 >= var11 && var129 < var11 + 16) {
                                        var9.field2632 -= 4;
                                        method2384(var9);
                                    } else if (var128 >= var125 && var128 < var125 + 16 && var129 >= var11 + var126 - 16 && var129 < var11 + var126) {
                                        var9.field2632 += 4;
                                        method2384(var9);
                                    } else if (var128 >= var125 - field329 && var128 < field329 + var125 + 16 && var129 >= var11 + 16 && var129 < var11 + var126 - 16) {
                                        int var130 = (var126 - 32) * var126 / var127;
                                        if (var130 < 8) {
                                            var130 = 8;
                                        }
                                        int var131 = var129 - var11 - 16 - var130 / 2;
                                        int var132 = var126 - 32 - var130;
                                        var9.field2632 = (var127 - var126) * var131 / var132;
                                        method2384(var9);
                                        field325 = true;
                                    }
                                }
                                if (field444 != 0) {
                                    int var133 = var9.field2627;
                                    if (var128 >= var125 - var133 && var129 >= var11 && var128 < var125 + 16 && var129 <= var11 + var126) {
                                        var9.field2632 += field444 * 45;
                                        method2384(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.ct([Lfb;II)V")
    public static final void method571(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2620 == 0) {
                    if (var3.field2729 != null) {
                        method571(var3.field2729, arg1);
                    }
                    class4 var4 = (class4) field406.method3339((long) var3.field2618);
                    if (var4 != null) {
                        int var5 = var4.field60;
                        if (class164.method2116(var5)) {
                            method571(Statics.field2711[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2713 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field9 = var3.field2713;
                    Statics.method562(var6);
                }
                if (arg1 == 1 && var3.field2714 != null) {
                    if (var3.field2619 >= 0) {
                        class164 var7 = class164.method128(var3.field2618);
                        if (var7 == null || var7.field2729 == null || var3.field2619 >= var7.field2729.length || var7.field2729[var3.field2619] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field9 = var3.field2714;
                    Statics.method562(var8);
                }
            }
        }
    }

    @ObfuscatedName("ft.cx(Lfb;III)V")
    public static final void method3292(class164 arg0, int arg1, int arg2) {
        if (field417 != null || field386 || arg0 == null) {
            return;
        }
        class164 var3 = arg0;
        int var4 = class168.method1910(method191(arg0));
        class164 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class164.method128(var3.field2629);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class164 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2657;
        }
        if (var7 == null) {
            return;
        }
        field417 = arg0;
        class164 var9 = arg0;
        int var10 = class168.method1910(method191(arg0));
        class164 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class164.method128(var9.field2629);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class164 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2657;
        }
        field306 = var13;
        field419 = arg1;
        field420 = arg2;
        Statics.field5 = 0;
        field428 = false;
        if (field387 > 0) {
            method2508(field387 - 1);
        }
        return;
    }

    @ObfuscatedName("by.cu(I)V")
    public static final void method1450() {
        method2384(field417);
        Statics.field5++;
        if (field280 && field422) {
            int var0 = class132.field2007;
            int var1 = class132.field2008;
            int var2 = var0 - field419;
            int var3 = var1 - field420;
            if (var2 < field423) {
                var2 = field423;
            }
            if (field417.field2627 + var2 > field423 + field306.field2627) {
                var2 = field423 + field306.field2627 - field417.field2627;
            }
            if (var3 < field335) {
                var3 = field335;
            }
            if (field417.field2628 + var3 > field335 + field306.field2628) {
                var3 = field335 + field306.field2628 - field417.field2628;
            }
            int var4 = var2 - field312;
            int var5 = var3 - field427;
            int var6 = field417.field2712;
            if (Statics.field5 > field417.field2630 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field428 = true;
            }
            int var7 = field306.field2631 + (var2 - field423);
            int var8 = field306.field2632 + (var3 - field335);
            if (field417.field2695 != null && field428) {
                class1 var9 = new class1();
                var9.field3 = field417;
                var9.field16 = var7;
                var9.field13 = var8;
                var9.field9 = field417.field2695;
                Statics.method562(var9);
            }
            if (class132.field2016 == 0) {
                if (field428) {
                    if (field417.field2696 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field417;
                        var10.field16 = var7;
                        var10.field13 = var8;
                        var10.field7 = field421;
                        var10.field9 = field417.field2696;
                        Statics.method562(var10);
                    }
                    if (field421 != null) {
                        class164 var11 = field417;
                        int var12 = class168.method1910(method191(var11));
                        class164 var13;
                        if (var12 == 0) {
                            var13 = null;
                        } else {
                            int var14 = 0;
                            while (true) {
                                if (var14 >= var12) {
                                    var13 = var11;
                                    break;
                                }
                                var11 = class164.method128(var11.field2629);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field475.method2438(89);
                            field475.method2206(field421.field2619);
                            field475.method2229(field421.field2618);
                            field475.method2208(field417.field2619);
                            field475.method2229(field417.field2618);
                            field475.method2342(field421.field2613);
                            field475.method2208(field417.field2613);
                        }
                    }
                } else if ((field486 == 1 || method125(field387 - 1)) && field387 > 2) {
                    method2010(field419 + field312, field427 + field420);
                } else if (field387 > 0) {
                    int var15 = field419 + field312;
                    int var16 = field427 + field420;
                    Statics.method573(Statics.field906, var15, var16);
                    Statics.field906 = null;
                }
                field417 = null;
            }
        } else if (Statics.field5 > 1) {
            field417 = null;
        }
    }

    @ObfuscatedName("dx.ck(II)V")
    public static void method2508(int arg0) {
        Statics.field906 = new class29();
        Statics.field906.field642 = field388[arg0];
        Statics.field906.field634 = field426[arg0];
        Statics.field906.field636 = field390[arg0];
        Statics.field906.field638 = field391[arg0];
        Statics.field906.field635 = field384[arg0];
    }

    @ObfuscatedName("dh.cr(Lfb;I)V")
    public static void method2384(class164 arg0) {
        if (field450 == arg0.field2737) {
            field451[arg0.field2646] = true;
        }
    }

    @ObfuscatedName("i.cw(B)V")
    public static void method108() {
        for (class4 var0 = (class4) field406.method3341(); var0 != null; var0 = (class4) field406.method3346()) {
            int var1 = var0.field60;
            if (class164.method2116(var1)) {
                boolean var2 = true;
                class164[] var3 = Statics.field2711[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2709;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2963;
                    class164 var6 = class164.method128(var5);
                    if (var6 != null) {
                        method2384(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dj.cl([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2468(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("av.co(IS)V")
    public static final void method647(int arg0) {
        if (!class164.method2116(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2711[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3 != null) {
                var3.field2688 = 0;
                var3.field2728 = 0;
            }
        }
    }

    @ObfuscatedName("h.cn(IS)V")
    public static final void method161(int arg0) {
        if (class164.method2116(arg0)) {
            method2106(Statics.field2711[arg0], -1);
        }
    }

    @ObfuscatedName("dd.cy([Lfb;II)V")
    public static final void method2106(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null && var3.field2629 == arg1 && (!var3.field2709 || !method846(var3))) {
                if (var3.field2620 == 0) {
                    if (!var3.field2709 && method846(var3) && Statics.field2762 != var3) {
                        continue;
                    }
                    method2106(arg0, var3.field2618);
                    if (var3.field2729 != null) {
                        method2106(var3.field2729, var3.field2618);
                    }
                    class4 var4 = (class4) field406.method3339((long) var3.field2618);
                    if (var4 != null) {
                        method161(var4.field60);
                    }
                }
                if (var3.field2620 == 6) {
                    if (var3.field2610 != -1 || var3.field2655 != -1) {
                        boolean var5 = method1461(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2655;
                        } else {
                            var6 = var3.field2610;
                        }
                        if (var6 != -1) {
                            class40 var7 = class40.method1826(var6);
                            var3.field2728 += field398;
                            while (var3.field2728 > var7.field894[var3.field2688]) {
                                var3.field2728 -= var7.field894[var3.field2688];
                                var3.field2688++;
                                if (var3.field2688 >= var7.field898.length) {
                                    var3.field2688 -= var7.field902;
                                    if (var3.field2688 < 0 || var3.field2688 >= var7.field898.length) {
                                        var3.field2688 = 0;
                                    }
                                }
                                method2384(var3);
                            }
                        }
                    }
                    if (var3.field2722 != 0 && !var3.field2709) {
                        int var8 = var3.field2722 >> 16;
                        int var9 = var3.field2722 << 16 >> 16;
                        int var10 = field398 * var8;
                        int var11 = field398 * var9;
                        var3.field2658 = var3.field2658 + var10 & 0x7FF;
                        var3.field2659 = var3.field2659 + var11 & 0x7FF;
                        method2384(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.cc(IB)V")
    public static final void method2505(int arg0) {
        method108();
        class22.method525();
        int var1 = class48.method2540(arg0).field1047;
        if (var1 == 0) {
            return;
        }
        int var2 = class166.field2753[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class86.method1882(0.9D);
                ((class90) Statics.field1460).method1914(0.9D);
            }
            if (var2 == 2) {
                class86.method1882(0.8D);
                ((class90) Statics.field1460).method1914(0.8D);
            }
            if (var2 == 3) {
                class86.method1882(0.7D);
                ((class90) Statics.field1460).method1914(0.7D);
            }
            if (var2 == 4) {
                class86.method1882(0.6D);
                ((class90) Statics.field1460).method1914(0.6D);
            }
            class47.method626();
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
                if (field479 == 0 && field250 != -1) {
                    class173.method631(Statics.field2042, field250, 0, var3, false);
                    field481 = false;
                } else if (var3 == 0) {
                    class173.method32();
                    field481 = false;
                } else {
                    class173.method1827(var3);
                }
                field479 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field326 = 127;
            }
            if (var2 == 1) {
                field326 = 96;
            }
            if (var2 == 2) {
                field326 = 64;
            }
            if (var2 == 3) {
                field326 = 32;
            }
            if (var2 == 4) {
                field326 = 0;
            }
        }
        if (var1 == 5) {
            field486 = var2;
        }
        if (var1 == 6) {
            field407 = var2;
        }
        if (var1 == 9) {
            field408 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field288 = 127;
            }
            if (var2 == 1) {
                field288 = 96;
            }
            if (var2 == 2) {
                field288 = 64;
            }
            if (var2 == 3) {
                field288 = 32;
            }
            if (var2 == 4) {
                field288 = 0;
            }
        }
        if (var1 == 17) {
            field413 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field257 = (class19) class101.method510(class19.method157(), var2);
            if (field257 == null) {
                field257 = class19.field508;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field377 = -1;
        } else {
            field377 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("a.cs(B)V")
    public static final void method7() {
        field475.method2438(116);
        for (class4 var0 = (class4) field406.method3341(); var0 != null; var0 = (class4) field406.method3346()) {
            if (var0.field59 == 0 || var0.field59 == 3) {
                method340(var0, true);
            }
        }
        if (field409 != null) {
            method2384(field409);
            field409 = null;
        }
    }

    @ObfuscatedName("j.cz(IIIB)Lc;")
    public static final class4 method173(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field60 = arg1;
        var3.field59 = arg2;
        field406.method3338(var3, (long) arg0);
        method647(arg1);
        class34.method567(arg1);
        class164 var4 = class164.method128(arg0);
        if (var4 != null) {
            method2384(var4);
        }
        if (field409 != null) {
            method2384(field409);
            field409 = null;
        }
        method174();
        if (field405 != -1) {
            int var5 = field405;
            if (class164.method2116(var5)) {
                method571(Statics.field2711[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("client.ca(Lc;ZI)V")
    public static final void method340(class4 arg0, boolean arg1) {
        int var2 = arg0.field60;
        int var3 = (int) arg0.field2963;
        arg0.method3463();
        if (arg1 && var2 != -1 && Statics.field2633[var2]) {
            Statics.field2717.method2896(var2);
            if (Statics.field2711[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2711[var2].length; var5++) {
                    if (Statics.field2711[var2][var5] != null) {
                        if (Statics.field2711[var2][var5].field2620 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2711[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2711[var2] = null;
                }
                Statics.field2633[var2] = false;
            }
        }
        for (class191 var6 = (class191) field394.method3341(); var6 != null; var6 = (class191) field394.method3346()) {
            if ((var6.field2963 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3463();
            }
        }
        class164 var7 = class164.method128(var3);
        if (var7 != null) {
            method2384(var7);
        }
        method174();
        if (field405 != -1) {
            int var8 = field405;
            if (class164.method2116(var8)) {
                method571(Statics.field2711[var8], 1);
            }
        }
    }

    @ObfuscatedName("an.dd(Lfb;I)Z")
    public static final boolean method950(class164 arg0) {
        int var1 = arg0.field2612;
        if (var1 == 205) {
            field293 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field404.method3048(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field404.method3049(var4, var5 == 1);
        }
        if (var1 == 324) {
            field404.method3054(false);
        }
        if (var1 == 325) {
            field404.method3054(true);
        }
        if (var1 == 326) {
            field475.method2438(86);
            field404.method3051(field475);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("f.dk(IIII)V")
    public static final void method121(int arg0, int arg1, int arg2) {
        method2007();
        class75.method1612(arg0, arg1, Statics.field513.field1297 + arg0, Statics.field513.field1293 + arg1);
        if (field503 == 2 || field503 == 5) {
            class75.method1587(arg0 + 25, arg1 + 5, 0, Statics.field184, Statics.field1424);
        } else {
            int var3 = field328 + field315 & 0x7FF;
            int var4 = Statics.field3024.field767 / 32 + 48;
            int var5 = 464 - Statics.field3024.field722 / 32;
            Statics.field949.method1557(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field279 + 256, Statics.field184, Statics.field1424);
            for (int var6 = 0; var6 < field472; var6++) {
                int var7 = field477[var6] * 4 + 2 - Statics.field3024.field767 / 32;
                int var8 = field474[var6] * 4 + 2 - Statics.field3024.field722 / 32;
                method2947(arg0, arg1, var7, var8, field330[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class189 var11 = field378[Statics.field2842][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field3024.field767 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field3024.field722 / 32;
                        method2947(arg0, arg1, var12, var13, Statics.field149[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field283; var14++) {
                class32 var15 = field397[field284[var14]];
                if (var15 != null && var15.method25()) {
                    class37 var16 = var15.field691;
                    if (var16 != null && var16.field807 != null) {
                        var16 = var16.method654();
                    }
                    if (var16 != null && var16.field811 && var16.field823) {
                        int var17 = var15.field767 / 32 - Statics.field3024.field767 / 32;
                        int var18 = var15.field722 / 32 - Statics.field3024.field722 / 32;
                        method2947(arg0, arg1, var17, var18, Statics.field149[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field364; var19++) {
                class3 var20 = field363[field365[var19]];
                if (var20 != null && var20.method25() && !var20.field33) {
                    int var21 = var20.field767 / 32 - Statics.field3024.field767 / 32;
                    int var22 = var20.field722 / 32 - Statics.field3024.field722 / 32;
                    boolean var23 = false;
                    if (method98(var20.field43, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field1439; var25++) {
                        if (var20.field43.equals(Statics.field126[var25].field569)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field3024.field51 != 0 && var20.field51 != 0 && Statics.field3024.field51 == var20.field51) {
                        var26 = true;
                    }
                    if (var23) {
                        method2947(arg0, arg1, var21, var22, Statics.field149[3]);
                    } else if (var26) {
                        method2947(arg0, arg1, var21, var22, Statics.field149[4]);
                    } else if (var24) {
                        method2947(arg0, arg1, var21, var22, Statics.field149[5]);
                    } else {
                        method2947(arg0, arg1, var21, var22, Statics.field149[2]);
                    }
                }
            }
            if (field264 != 0 && field256 % 20 < 10) {
                if (field264 == 1 && field275 >= 0 && field275 < field397.length) {
                    class32 var27 = field397[field275];
                    if (var27 != null) {
                        int var28 = var27.field767 / 32 - Statics.field3024.field767 / 32;
                        int var29 = var27.field722 / 32 - Statics.field3024.field722 / 32;
                        method2485(arg0, arg1, var28, var29, Statics.field640[1]);
                    }
                }
                if (field264 == 2) {
                    int var30 = field461 * 4 - Statics.field545 * 4 + 2 - Statics.field3024.field767 / 32;
                    int var31 = field268 * 4 - Statics.field1653 * 4 + 2 - Statics.field3024.field722 / 32;
                    method2485(arg0, arg1, var30, var31, Statics.field640[1]);
                }
                if (field264 == 10 && field266 >= 0 && field266 < field363.length) {
                    class3 var32 = field363[field266];
                    if (var32 != null) {
                        int var33 = var32.field767 / 32 - Statics.field3024.field767 / 32;
                        int var34 = var32.field722 / 32 - Statics.field3024.field722 / 32;
                        method2485(arg0, arg1, var33, var34, Statics.field640[1]);
                    }
                }
            }
            if (field476 != 0) {
                int var35 = field476 * 4 + 2 - Statics.field3024.field767 / 32;
                int var36 = field496 * 4 + 2 - Statics.field3024.field722 / 32;
                method2947(arg0, arg1, var35, var36, Statics.field640[0]);
            }
            if (!Statics.field3024.field33) {
                class75.method1575(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
            }
        }
        if (field503 < 3) {
            Statics.field1885.method1557(arg0, arg1, 33, 33, 25, 25, field328, 256, Statics.field3003, Statics.field1774);
        } else {
            class75.method1587(arg0, arg1, 0, Statics.field3003, Statics.field1774);
        }
        if (field425[arg2]) {
            Statics.field513.method1637(arg0, arg1);
        }
        field452[arg2] = true;
    }

    @ObfuscatedName("dl.df(IIIILbh;I)V")
    public static final void method2485(int arg0, int arg1, int arg2, int arg3, class74 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method2947(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field328 + field315 & 0x7FF;
        int var7 = class86.field1449[var6];
        int var8 = class86.field1440[var6];
        int var9 = var7 * 256 / (field279 + 256);
        int var10 = var8 * 256 / (field279 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1325.method1560(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("fj.dp(IIIILbh;I)V")
    public static final void method2947(int arg0, int arg1, int arg2, int arg3, class74 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field328 + field315 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class86.field1449[var5];
        int var8 = class86.field1440[var5];
        int var9 = var7 * 256 / (field279 + 256);
        int var10 = var8 * 256 / (field279 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1477(Statics.field513, arg0 + 94 + var11 - arg4.field1276 / 2 + 4, arg1 + 83 - var12 - arg4.field1277 / 2 - 4);
        } else {
            arg4.method1494(arg0 + 94 + var11 - arg4.field1276 / 2 + 4, arg1 + 83 - var12 - arg4.field1277 / 2 - 4);
        }
    }

    @ObfuscatedName("w.dc(Ljava/lang/String;ZI)Z")
    public static boolean method98(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class155.method2125(arg0, Statics.field1854);
        for (int var3 = 0; var3 < field385; var3++) {
            if (var2.equalsIgnoreCase(class155.method2125(field498[var3].field223, Statics.field1854)) && (!arg1 || field498[var3].field225 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class155.method2125(Statics.field3024.field43, Statics.field1854))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("g.dw(Ljava/lang/String;I)Z")
    public static boolean method138(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class155.method2125(arg0, Statics.field1854);
        for (int var2 = 0; var2 < field500; var2++) {
            class8 var3 = field501[var2];
            if (var1.equalsIgnoreCase(class155.method2125(var3.field124, Statics.field1854))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class155.method2125(var3.field121, Statics.field1854))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("y.dh(Ljava/lang/String;ZI)V")
    public static final void method209(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field500 < 100 || field370 == 1) || field500 >= 400) {
            class11.method35(31, "", class148.field2268);
            return;
        }
        String var2 = class155.method2125(arg0, Statics.field1854);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field500; var3++) {
            class8 var4 = field501[var3];
            String var5 = class155.method2125(var4.field124, Statics.field1854);
            if (var5 != null && var5.equals(var2)) {
                class11.method35(31, "", arg0 + class148.field2329);
                return;
            }
            if (var4.field121 != null) {
                String var6 = class155.method2125(var4.field121, Statics.field1854);
                if (var6 != null && var6.equals(var2)) {
                    class11.method35(31, "", arg0 + class148.field2329);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field385; var7++) {
            class17 var8 = field498[var7];
            String var9 = class155.method2125(var8.field223, Statics.field1854);
            if (var9 != null && var9.equals(var2)) {
                class11.method35(31, "", class148.field2179 + arg0 + class148.field2412);
                return;
            }
            if (var8.field224 != null) {
                String var10 = class155.method2125(var8.field224, Statics.field1854);
                if (var10 != null && var10.equals(var2)) {
                    class11.method35(31, "", class148.field2179 + arg0 + class148.field2412);
                    return;
                }
            }
        }
        if (class155.method2125(Statics.field3024.field43, Statics.field1854).equals(var2)) {
            class11.method35(31, "", class148.field2331);
            return;
        }
        field475.method2438(76);
        class114 var11 = field475;
        int var12 = arg0.length() + 1;
        var11.method2366(var12);
        field475.method2177(arg0);
    }

    @ObfuscatedName("bi.du(Ljava/lang/String;I)V")
    public static final void method1428(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class155.method2125(arg0, Statics.field1854);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field385; var2++) {
            class17 var3 = field498[var2];
            String var4 = var3.field223;
            String var5 = class155.method2125(var4, Statics.field1854);
            if (class121.method546(arg0, var1, var4, var5)) {
                field385--;
                for (int var6 = var2; var6 < field385; var6++) {
                    field498[var6] = field498[var6 + 1];
                }
                field447 = field429;
                field475.method2438(108);
                class114 var7 = field475;
                int var8 = arg0.length() + 1;
                var7.method2366(var8);
                field475.method2177(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("fd.dm(Ljava/lang/String;I)V")
    public static final void method3279(String arg0) {
        if (arg0.equals("")) {
            return;
        }
        field475.method2438(168);
        class114 var1 = field475;
        int var2 = arg0.length() + 1;
        var1.method2366(var2);
        field475.method2177(arg0);
    }

    @ObfuscatedName("t.dj(Lfb;B)I")
    public static int method191(class164 arg0) {
        class191 var1 = (class191) field394.method3339(((long) arg0.field2618 << 32) + (long) arg0.field2619);
        return var1 == null ? arg0.field2678 : var1.field2949;
    }

    @ObfuscatedName("ar.dt(Lfb;I)Z")
    public static boolean method846(class164 arg0) {
        if (field415) {
            if (method191(arg0) != 0) {
                return false;
            }
            if (arg0.field2620 == 0) {
                return false;
            }
        }
        return arg0.field2681;
    }

    @ObfuscatedName("d.dl(Lfb;I)Ljava/lang/String;")
    public static String method512(class164 arg0) {
        int var1 = method191(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2685 == null || arg0.field2685.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2685;
        }
    }

    @ObfuscatedName("ac.dv(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method881(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field247 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field247 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field247 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field247 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field247 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field252 != null) {
            var3 = "/p=" + Statics.field252;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field251 + "/a=" + Statics.field253 + var3 + "/";
    }
}

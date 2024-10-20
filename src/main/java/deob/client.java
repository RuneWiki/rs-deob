package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class133 {

    @ObfuscatedName("client.r")
    public static boolean field324 = true;

    @ObfuscatedName("client.f")
    public static int field248 = 1;

    @ObfuscatedName("client.l")
    public static int field249 = 0;

    @ObfuscatedName("client.k")
    public static int field251 = 0;

    @ObfuscatedName("client.i")
    public static boolean field250 = false;

    @ObfuscatedName("client.h")
    public static boolean field255 = false;

    @ObfuscatedName("client.w")
    public static class209[] field312 = new class209[4];

    @ObfuscatedName("client.s")
    public static int field256 = 0;

    @ObfuscatedName("client.z")
    public static int field257 = 0;

    @ObfuscatedName("client.n")
    public static boolean field258 = true;

    @ObfuscatedName("client.u")
    public static int field493 = 0;

    @ObfuscatedName("client.a")
    public static long field328 = -1L;

    @ObfuscatedName("client.m")
    public static int field262 = -1;

    @ObfuscatedName("client.q")
    public static int field263 = -1;

    @ObfuscatedName("client.e")
    public static int field264 = -1;

    @ObfuscatedName("client.t")
    public static boolean field265 = true;

    @ObfuscatedName("client.o")
    public static boolean field266 = false;

    @ObfuscatedName("client.at")
    public static int field365 = 0;

    @ObfuscatedName("client.ag")
    public static int field390 = 0;

    @ObfuscatedName("client.ae")
    public static int field331 = 0;

    @ObfuscatedName("client.ak")
    public static int field270 = 0;

    @ObfuscatedName("client.ap")
    public static int field271 = 0;

    @ObfuscatedName("client.ao")
    public static int field385 = 0;

    @ObfuscatedName("client.ac")
    public static int field273 = 0;

    @ObfuscatedName("client.as")
    public static int field274 = 0;

    @ObfuscatedName("client.ai")
    public static int field460 = 0;

    @ObfuscatedName("client.ab")
    public static class108 field276 = new class108(new byte[5000]);

    @ObfuscatedName("client.ad")
    public static class18 field277 = class18.field519;

    @ObfuscatedName("client.aj")
    public static int field278 = 0;

    @ObfuscatedName("client.au")
    public static int field281 = 0;

    @ObfuscatedName("client.aa")
    public static int field282 = 0;

    @ObfuscatedName("client.bo")
    public static int field283 = 0;

    @ObfuscatedName("client.bv")
    public static int field368 = 0;

    @ObfuscatedName("client.bz")
    public static int field437 = 0;

    @ObfuscatedName("client.bu")
    public static int field332 = 0;

    @ObfuscatedName("client.bp")
    public static int field287 = 0;

    @ObfuscatedName("client.bx")
    public static class31[] field289 = new class31[32768];

    @ObfuscatedName("client.bl")
    public static int field290 = 0;

    @ObfuscatedName("client.bd")
    public static int[] field291 = new int[32768];

    @ObfuscatedName("client.cd")
    public static class111 field486 = new class111(5000);

    @ObfuscatedName("client.ci")
    public static class111 field294 = new class111(5000);

    @ObfuscatedName("client.cj")
    public static class111 field313 = new class111(5000);

    @ObfuscatedName("client.cm")
    public static int field448 = 0;

    @ObfuscatedName("client.cx")
    public static int field297 = 0;

    @ObfuscatedName("client.cs")
    public static int field498 = 0;

    @ObfuscatedName("client.ct")
    public static int field299 = 0;

    @ObfuscatedName("client.ca")
    public static int field300 = 0;

    @ObfuscatedName("client.cq")
    public static int field301 = 0;

    @ObfuscatedName("client.co")
    public static int field302 = 0;

    @ObfuscatedName("client.cw")
    public static int field303 = 0;

    @ObfuscatedName("client.cf")
    public static boolean field304 = false;

    @ObfuscatedName("client.cn")
    public static int field306 = 0;

    @ObfuscatedName("client.cz")
    public static int field307 = 0;

    @ObfuscatedName("client.dh")
    public static int field308 = 1;

    @ObfuscatedName("client.de")
    public static int field309 = 0;

    @ObfuscatedName("client.di")
    public static int field338 = 1;

    @ObfuscatedName("client.dx")
    public static int field311 = 0;

    @ObfuscatedName("client.dz")
    public static boolean field480 = false;

    @ObfuscatedName("client.db")
    public static int[][][] field461 = new int[4][13][13];

    @ObfuscatedName("client.dp")
    public static final int[] field315 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dq")
    public static int field316 = 0;

    @ObfuscatedName("client.dr")
    public static int field317 = 2;

    @ObfuscatedName("client.dt")
    public static int field318 = 0;

    @ObfuscatedName("client.dg")
    public static int field259 = 2;

    @ObfuscatedName("client.dw")
    public static int field320 = 0;

    @ObfuscatedName("client.dj")
    public static int field357 = 1;

    @ObfuscatedName("client.df")
    public static int field322 = 0;

    @ObfuscatedName("client.dk")
    public static int field323 = 0;

    @ObfuscatedName("client.do")
    public static int field254 = 2;

    @ObfuscatedName("client.dc")
    public static int field325 = 0;

    @ObfuscatedName("client.ec")
    public static int field326 = 1;

    @ObfuscatedName("client.ea")
    public static int field327 = 0;

    @ObfuscatedName("client.en")
    public static int field375 = 0;

    @ObfuscatedName("client.ev")
    public static int field383 = 2301979;

    @ObfuscatedName("client.ee")
    public static int field434 = 5063219;

    @ObfuscatedName("client.eq")
    public static int field369 = 3353893;

    @ObfuscatedName("client.ed")
    public static int field333 = 7759444;

    @ObfuscatedName("client.eu")
    public static boolean field418 = false;

    @ObfuscatedName("client.fa")
    public static int field335 = 0;

    @ObfuscatedName("client.fk")
    public static int field336 = 128;

    @ObfuscatedName("client.fo")
    public static int field363 = 0;

    @ObfuscatedName("client.fq")
    public static int field354 = 0;

    @ObfuscatedName("client.fp")
    public static int field339 = 0;

    @ObfuscatedName("client.fs")
    public static int field426 = 0;

    @ObfuscatedName("client.fj")
    public static int field341 = 0;

    @ObfuscatedName("client.fz")
    public static int field342 = 0;

    @ObfuscatedName("client.fv")
    public static boolean field500 = false;

    @ObfuscatedName("client.fl")
    public static int field425 = 0;

    @ObfuscatedName("client.fm")
    public static int field345 = 0;

    @ObfuscatedName("client.fx")
    public static int field346 = 50;

    @ObfuscatedName("client.fb")
    public static int[] field347 = new int[field346];

    @ObfuscatedName("client.fh")
    public static int[] field348 = new int[field346];

    @ObfuscatedName("client.fy")
    public static int[] field349 = new int[field346];

    @ObfuscatedName("client.fu")
    public static int[] field350 = new int[field346];

    @ObfuscatedName("client.fn")
    public static int[] field351 = new int[field346];

    @ObfuscatedName("client.fi")
    public static int[] field352 = new int[field346];

    @ObfuscatedName("client.fr")
    public static int[] field353 = new int[field346];

    @ObfuscatedName("client.gr")
    public static String[] field379 = new String[field346];

    @ObfuscatedName("client.gd")
    public static int[][] field334 = new int[104][104];

    @ObfuscatedName("client.gp")
    public static int field356 = 0;

    @ObfuscatedName("client.gh")
    public static int field459 = -1;

    @ObfuscatedName("client.gj")
    public static int field359 = -1;

    @ObfuscatedName("client.gk")
    public static int field495 = 0;

    @ObfuscatedName("client.gy")
    public static int field360 = 0;

    @ObfuscatedName("client.gn")
    public static int field361 = 0;

    @ObfuscatedName("client.gw")
    public static int field362 = 0;

    @ObfuscatedName("client.gv")
    public static int field344 = 0;

    @ObfuscatedName("client.gl")
    public static int field364 = 0;

    @ObfuscatedName("client.gz")
    public static int field246 = 0;

    @ObfuscatedName("client.go")
    public static int field279 = 0;

    @ObfuscatedName("client.ge")
    public static int field319 = 0;

    @ObfuscatedName("client.gi")
    public static int field337 = 0;

    @ObfuscatedName("client.gf")
    public static boolean field388 = false;

    @ObfuscatedName("client.gs")
    public static int field405 = 0;

    @ObfuscatedName("client.gm")
    public static int field371 = 0;

    @ObfuscatedName("client.gg")
    public static class3[] field372 = new class3[2048];

    @ObfuscatedName("client.gq")
    public static int field373 = 0;

    @ObfuscatedName("client.gx")
    public static int[] field296 = new int[2048];

    @ObfuscatedName("client.hg")
    public static int field392 = 0;

    @ObfuscatedName("client.hs")
    public static int[] field376 = new int[2048];

    @ObfuscatedName("client.hd")
    public static class108[] field511 = new class108[2048];

    @ObfuscatedName("client.hr")
    public static int field378 = -1;

    @ObfuscatedName("client.hp")
    public static int field499 = 0;

    @ObfuscatedName("client.hf")
    public static int field380 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field381 = new int[1000];

    @ObfuscatedName("client.ha")
    public static final int[] field245 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hb")
    public static String[] field298 = new String[8];

    @ObfuscatedName("client.ht")
    public static boolean[] field314 = new boolean[8];

    @ObfuscatedName("client.hw")
    public static int[] field393 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.he")
    public static int field386 = -1;

    @ObfuscatedName("client.ho")
    public static class180[][][] field387 = new class180[4][104][104];

    @ObfuscatedName("client.hc")
    public static class180 field485 = new class180();

    @ObfuscatedName("client.hl")
    public static class180 field389 = new class180();

    @ObfuscatedName("client.hh")
    public static class180 field428 = new class180();

    @ObfuscatedName("client.hu")
    public static int[] field391 = new int[25];

    @ObfuscatedName("client.hj")
    public static int[] field285 = new int[25];

    @ObfuscatedName("client.hz")
    public static int[] field269 = new int[25];

    @ObfuscatedName("client.hk")
    public static int field394 = 0;

    @ObfuscatedName("client.hm")
    public static boolean field403 = false;

    @ObfuscatedName("client.il")
    public static int field396 = 0;

    @ObfuscatedName("client.ic")
    public static int[] field397 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field398 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field340 = new int[500];

    @ObfuscatedName("client.io")
    public static int[] field400 = new int[500];

    @ObfuscatedName("client.ig")
    public static String[] field401 = new String[500];

    @ObfuscatedName("client.if")
    public static String[] field402 = new String[500];

    @ObfuscatedName("client.in")
    public static int field382 = -1;

    @ObfuscatedName("client.ii")
    public static int field404 = -1;

    @ObfuscatedName("client.ia")
    public static int field503 = 0;

    @ObfuscatedName("client.ij")
    public static int field293 = 50;

    @ObfuscatedName("client.im")
    public static int field407 = 0;

    @ObfuscatedName("client.id")
    public static String field455 = null;

    @ObfuscatedName("client.ir")
    public static boolean field409 = false;

    @ObfuscatedName("client.it")
    public static int field410 = -1;

    @ObfuscatedName("client.iq")
    public static int field411 = -1;

    @ObfuscatedName("client.jd")
    public static String field412 = null;

    @ObfuscatedName("client.jt")
    public static String field413 = null;

    @ObfuscatedName("client.jz")
    public static int field482 = -1;

    @ObfuscatedName("client.ja")
    public static class177 field462 = new class177(8);

    @ObfuscatedName("client.jw")
    public static int field416 = 0;

    @ObfuscatedName("client.ji")
    public static int field417 = 0;

    @ObfuscatedName("client.jr")
    public static class155 field477 = null;

    @ObfuscatedName("client.jj")
    public static int field419 = 0;

    @ObfuscatedName("client.je")
    public static int field420 = 0;

    @ObfuscatedName("client.jx")
    public static int field374 = 0;

    @ObfuscatedName("client.jq")
    public static int field422 = -1;

    @ObfuscatedName("client.jo")
    public static boolean field423 = false;

    @ObfuscatedName("client.jg")
    public static boolean field424 = false;

    @ObfuscatedName("client.jh")
    public static boolean field449 = false;

    @ObfuscatedName("client.jc")
    public static class155 field464 = null;

    @ObfuscatedName("client.jf")
    public static class155 field427 = null;

    @ObfuscatedName("client.jp")
    public static int field512 = 0;

    @ObfuscatedName("client.ju")
    public static int field284 = 0;

    @ObfuscatedName("client.jl")
    public static class155 field430 = null;

    @ObfuscatedName("client.jk")
    public static boolean field431 = false;

    @ObfuscatedName("client.jv")
    public static int field247 = -1;

    @ObfuscatedName("client.jb")
    public static int field433 = -1;

    @ObfuscatedName("client.jm")
    public static boolean field395 = false;

    @ObfuscatedName("client.js")
    public static int field435 = -1;

    @ObfuscatedName("client.jn")
    public static int field436 = -1;

    @ObfuscatedName("client.kj")
    public static boolean field453 = false;

    @ObfuscatedName("client.kn")
    public static int field438 = 1;

    @ObfuscatedName("client.kw")
    public static int[] field439 = new int[32];

    @ObfuscatedName("client.km")
    public static int field440 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field441 = new int[32];

    @ObfuscatedName("client.ke")
    public static int field442 = 0;

    @ObfuscatedName("client.kg")
    public static int[] field443 = new int[32];

    @ObfuscatedName("client.kc")
    public static int field444 = 0;

    @ObfuscatedName("client.ks")
    public static int field445 = 0;

    @ObfuscatedName("client.kq")
    public static int field446 = 0;

    @ObfuscatedName("client.kf")
    public static int field355 = 0;

    @ObfuscatedName("client.kb")
    public static int field421 = 0;

    @ObfuscatedName("client.kx")
    public static int field288 = 0;

    @ObfuscatedName("client.kl")
    public static int field450 = 0;

    @ObfuscatedName("client.ki")
    public static int[] field451 = new int[2000];

    @ObfuscatedName("client.ky")
    public static String[] field452 = new String[1000];

    @ObfuscatedName("client.kr")
    public static int field429 = 0;

    @ObfuscatedName("client.kd")
    public static class180 field454 = new class180();

    @ObfuscatedName("client.kz")
    public static class180 field310 = new class180();

    @ObfuscatedName("client.lq")
    public static class180 field456 = new class180();

    @ObfuscatedName("client.lg")
    public static class177 field472 = new class177(512);

    @ObfuscatedName("client.lv")
    public static int field275 = 0;

    @ObfuscatedName("client.lp")
    public static int field252 = -2;

    @ObfuscatedName("client.lb")
    public static boolean[] field384 = new boolean[100];

    @ObfuscatedName("client.lu")
    public static boolean[] field272 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static boolean[] field408 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static int[] field463 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field321 = new int[100];

    @ObfuscatedName("client.lt")
    public static int[] field268 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field466 = new int[100];

    @ObfuscatedName("client.lz")
    public static int field467 = 0;

    @ObfuscatedName("client.lh")
    public static int[] field468 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lo")
    public static int field469 = 0;

    @ObfuscatedName("client.la")
    public static int field470 = 0;

    @ObfuscatedName("client.ls")
    public static String field471 = "";

    @ObfuscatedName("client.ld")
    public static long[] field295 = new long[100];

    @ObfuscatedName("client.lw")
    public static int field473 = 0;

    @ObfuscatedName("client.ly")
    public static int field286 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field475 = new int[128];

    @ObfuscatedName("client.lr")
    public static int[] field476 = new int[128];

    @ObfuscatedName("client.ll")
    public static long field458 = -1L;

    @ObfuscatedName("client.mj")
    public static String field478 = null;

    @ObfuscatedName("client.mq")
    public static String field479 = null;

    @ObfuscatedName("client.ma")
    public static int field358 = -1;

    @ObfuscatedName("client.mn")
    public static int field481 = 0;

    @ObfuscatedName("client.md")
    public static int[] field366 = new int[1000];

    @ObfuscatedName("client.mp")
    public static int[] field483 = new int[1000];

    @ObfuscatedName("client.mv")
    public static class73[] field484 = new class73[1000];

    @ObfuscatedName("client.mm")
    public static int field370 = 0;

    @ObfuscatedName("client.mb")
    public static int field457 = 0;

    @ObfuscatedName("client.me")
    public static int field487 = 0;

    @ObfuscatedName("client.mx")
    public static int field488 = 255;

    @ObfuscatedName("client.my")
    public static int field489 = -1;

    @ObfuscatedName("client.mg")
    public static boolean field490 = false;

    @ObfuscatedName("client.mr")
    public static int field491 = 127;

    @ObfuscatedName("client.mh")
    public static int field492 = 127;

    @ObfuscatedName("client.nj")
    public static int field432 = 0;

    @ObfuscatedName("client.nn")
    public static int[] field494 = new int[50];

    @ObfuscatedName("client.ne")
    public static int[] field367 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field496 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field497 = new int[50];

    @ObfuscatedName("client.nf")
    public static class53[] field406 = new class53[50];

    @ObfuscatedName("client.nd")
    public static boolean field510 = false;

    @ObfuscatedName("client.nk")
    public static boolean[] field261 = new boolean[5];

    @ObfuscatedName("client.nz")
    public static int[] field501 = new int[5];

    @ObfuscatedName("client.np")
    public static int[] field502 = new int[5];

    @ObfuscatedName("client.oo")
    public static int[] field343 = new int[5];

    @ObfuscatedName("client.oa")
    public static int[] field504 = new int[5];

    @ObfuscatedName("client.oi")
    public static int field505 = 0;

    @ObfuscatedName("client.of")
    public static int field506 = 0;

    @ObfuscatedName("client.oy")
    public static class16[] field507 = new class16[400];

    @ObfuscatedName("client.ot")
    public static class176 field508 = new class176();

    @ObfuscatedName("client.ow")
    public static int field509 = 0;

    @ObfuscatedName("client.ou")
    public static class8[] field260 = new class8[400];

    @ObfuscatedName("client.ob")
    public static class160 field414 = new class160();

    @ObfuscatedName("client.on")
    public static int field447 = -1;

    @ObfuscatedName("client.ox")
    public static int field513 = -1;

    @ObfuscatedName("client.os")
    public static class201[] field514 = new class201[6];

    @ObfuscatedName("client.r(I)V")
    public final void method155() {
    }

    public final void init() {
        if (!this.method2624()) {
            return;
        }
        class171[] var1 = new class171[] { class171.field2832, class171.field2830, class171.field2829, class171.field2831, class171.field2835, class171.field2828, class171.field2833, class171.field2834, class171.field2836, class171.field2837 };
        class171[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class171 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2838);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2838)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class2.field27)) {
                            field250 = true;
                        } else {
                            field250 = false;
                        }
                        break;
                    case 2:
                        Statics.field1867 = var5;
                        break;
                    case 3:
                        field251 = Integer.parseInt(var5);
                        break;
                    case 4:
                        int var6 = Integer.parseInt(var5);
                        class141[] var7 = new class141[] { class141.field2109, class141.field2111, class141.field2114, class141.field2107 };
                        class141[] var8 = var7;
                        int var9 = 0;
                        class141 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class141 var10 = var8[var9];
                            if (var10.field2118 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field330 = var11;
                        break;
                    case 5:
                        class142[] var12 = new class142[] { class142.field2123, class142.field2124, class142.field2131, class142.field2120, class142.field2126, class142.field2119 };
                        Statics.field415 = (class142) class100.method70(var12, Integer.parseInt(var5));
                        if (Statics.field415 == class142.field2124) {
                            Statics.field253 = class193.field2904;
                        } else {
                            Statics.field253 = class193.field2905;
                        }
                        break;
                    case 6:
                        field256 = Integer.parseInt(var5);
                        break;
                    case 7:
                        field248 = Integer.parseInt(var5);
                        break;
                    case 8:
                        field249 = Integer.parseInt(var5);
                    case 9:
                    default:
                        break;
                    case 10:
                        if (var5.equalsIgnoreCase(class2.field27)) {
                        }
                }
            }
        }
        method796();
        Statics.field174 = this.getCodeBase().getHost();
        String var13 = Statics.field330.field2110;
        byte var14 = 0;
        try {
            class138.method1413("oldschool", var13, var14, 16);
        } catch (Exception var16) {
            class137.method880((String) null, var16);
        }
        Statics.field305 = this;
        this.method2622(765, 503, 71);
    }

    @ObfuscatedName("ay.l(B)V")
    public static final void method796() {
        class80.field1369 = false;
        field255 = false;
    }

    @ObfuscatedName("client.b(I)V")
    public final void method147() {
        Statics.field835 = field251 == 0 ? 43594 : field248 + 40000;
        Statics.field1891 = field251 == 0 ? 443 : field248 + 50000;
        Statics.field2765 = Statics.field835;
        Statics.field2080 = class156.field2661;
        Statics.field2406 = class156.field2658;
        Statics.field702 = class156.field2660;
        Statics.field2686 = class156.field2665;
        if (Statics.field1943.toLowerCase().indexOf("microsoft") == -1) {
            class126.field1954[44] = 71;
            class126.field1954[45] = 26;
            class126.field1954[46] = 72;
            class126.field1954[47] = 73;
            class126.field1954[59] = 57;
            class126.field1954[61] = 27;
            class126.field1954[91] = 42;
            class126.field1954[92] = 74;
            class126.field1954[93] = 43;
            class126.field1954[192] = 28;
            class126.field1954[222] = 58;
            class126.field1954[520] = 59;
        } else {
            class126.field1954[186] = 57;
            class126.field1954[187] = 27;
            class126.field1954[188] = 71;
            class126.field1954[189] = 26;
            class126.field1954[190] = 72;
            class126.field1954[191] = 73;
            class126.field1954[192] = 58;
            class126.field1954[219] = 42;
            class126.field1954[220] = 74;
            class126.field1954[221] = 43;
            class126.field1954[222] = 59;
            class126.field1954[223] = 28;
        }
        Canvas var1 = Statics.field1007;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class126.field1967);
        var1.addFocusListener(class126.field1967);
        class129.method27(Statics.field1007);
        Statics.field701 = class120.method67();
        if (Statics.field701 != null) {
            Statics.field701.method2452(Statics.field1007);
        }
        Statics.field1791 = new class123(255, class138.field2074, class138.field2070, 500000);
        Statics.field2103 = Statics.method2426();
        Statics.field204 = this.getToolkit().getSystemClipboard();
        class127.method120(this, Statics.field70);
        if (field251 != 0) {
            field266 = true;
        }
    }

    @ObfuscatedName("client.k(B)V")
    public final void method184() {
        field493++;
        this.method151();
        class152.method2686();
        try {
            if (class164.field2727 == 1) {
                int var1 = Statics.field2675.method3057();
                if (var1 > 0 && Statics.field2675.method3063()) {
                    int var2 = var1 - Statics.field1920;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2675.method3056(var2);
                } else {
                    Statics.field2675.method3107();
                    Statics.field2675.method3060();
                    if (Statics.field2734 == null) {
                        class164.field2727 = 0;
                    } else {
                        class164.field2727 = 2;
                    }
                    Statics.field635 = null;
                    Statics.field2496 = null;
                }
            }
        } catch (Exception var8) {
            var8.printStackTrace();
            Statics.field2675.method3107();
            class164.field2727 = 0;
            Statics.field635 = null;
            Statics.field2496 = null;
            Statics.field2734 = null;
        }
        method561();
        class126.method2450();
        class129 var4 = class129.field1993;
        synchronized (class129.field1993) {
            class129.field1991 = class129.field2002;
            class129.field1987 = class129.field1989;
            class129.field1988 = class129.field1998;
            class129.field1986 = class129.field1994;
            class129.field1999 = class129.field1995;
            class129.field2000 = class129.field1996;
            class129.field2001 = class129.field1997;
            class129.field1994 = 0;
        }
        if (Statics.field701 != null) {
            int var6 = Statics.field701.method2453();
            field429 = var6;
        }
        if (field257 == 0) {
            method3160();
            class133.method529();
        } else if (field257 == 5) {
            class29.method530(this);
            method3160();
            class133.method529();
        } else if (field257 == 10 || field257 == 11) {
            class29.method530(this);
        } else if (field257 == 20) {
            class29.method530(this);
            method560();
        } else if (field257 == 25) {
            Statics.method1979();
        }
        if (field257 == 30) {
            method2488();
        } else if (field257 == 40 || field257 == 45) {
            method560();
        }
    }

    @ObfuscatedName("client.g(B)V")
    public final void method402() {
        boolean var1 = class164.method818();
        if (var1 && field490 && Statics.field794 != null) {
            Statics.field794.method1006();
        }
        if (field2048) {
            class126.method698(Statics.field1007);
            Canvas var2 = Statics.field1007;
            var2.removeMouseListener(class129.field1993);
            var2.removeMouseMotionListener(class129.field1993);
            var2.removeFocusListener(class129.field1993);
            class129.field2002 = 0;
            if (Statics.field701 != null) {
                Statics.field701.method2463(Statics.field1007);
            }
            this.method2637();
            Canvas var3 = Statics.field1007;
            var3.setFocusTraversalKeysEnabled(false);
            var3.addKeyListener(class126.field1967);
            var3.addFocusListener(class126.field1967);
            class129.method27(Statics.field1007);
            if (Statics.field701 != null) {
                Statics.field701.method2452(Statics.field1007);
            }
        }
        if (field257 == 0) {
            int var4 = class29.field654;
            String var5 = class29.field669;
            Color var6 = null;
            try {
                Graphics var7 = Statics.field1007.getGraphics();
                if (Statics.field2502 == null) {
                    Statics.field2502 = new Font("Helvetica", 1, 13);
                    Statics.field636 = Statics.field1007.getFontMetrics(Statics.field2502);
                }
                if (field2045) {
                    field2045 = false;
                    var7.setColor(Color.black);
                    var7.fillRect(0, 0, Statics.field130, Statics.field624);
                }
                if (var6 == null) {
                    var6 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field74 == null) {
                        Statics.field74 = Statics.field1007.createImage(304, 34);
                    }
                    Graphics var8 = Statics.field74.getGraphics();
                    var8.setColor(var6);
                    var8.drawRect(0, 0, 303, 33);
                    var8.fillRect(2, 2, var4 * 3, 30);
                    var8.setColor(Color.black);
                    var8.drawRect(1, 1, 301, 31);
                    var8.fillRect(var4 * 3 + 2, 2, 300 - var4 * 3, 30);
                    var8.setFont(Statics.field2502);
                    var8.setColor(Color.white);
                    var8.drawString(var5, (304 - Statics.field636.stringWidth(var5)) / 2, 22);
                    var7.drawImage(Statics.field74, Statics.field130 / 2 - 152, Statics.field624 / 2 - 18, (ImageObserver) null);
                } catch (Exception var55) {
                    int var10 = Statics.field130 / 2 - 152;
                    int var11 = Statics.field624 / 2 - 18;
                    var7.setColor(var6);
                    var7.drawRect(var10, var11, 303, 33);
                    var7.fillRect(var10 + 2, var11 + 2, var4 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(var10 + 1, var11 + 1, 301, 31);
                    var7.fillRect(var4 * 3 + var10 + 2, var11 + 2, 300 - var4 * 3, 30);
                    var7.setFont(Statics.field2502);
                    var7.setColor(Color.white);
                    var7.drawString(var5, var10 + (304 - Statics.field636.stringWidth(var5)) / 2, var11 + 22);
                }
            } catch (Exception var56) {
                Statics.field1007.repaint();
            }
        } else if (field257 == 5) {
            class29.method1899(Statics.field474, Statics.field197);
        } else if (field257 == 10 || field257 == 11) {
            class29.method1899(Statics.field474, Statics.field197);
        } else if (field257 == 20) {
            class29.method1899(Statics.field474, Statics.field197);
        } else if (field257 == 25) {
            if (field311 == 1) {
                if (field307 > field308) {
                    field308 = field307;
                }
                int var13 = (field308 * 50 - field307 * 50) / field308;
                method2693(class145.field2159 + class2.field23 + class2.field21 + var13 + "%" + class2.field26, false);
            } else if (field311 == 2) {
                if (field309 > field338) {
                    field338 = field309;
                }
                int var14 = (field338 * 50 - field309 * 50) / field338 + 50;
                method2693(class145.field2159 + class2.field23 + class2.field21 + var14 + "%" + class2.field26, false);
            } else {
                method2693(class145.field2159, false);
            }
        } else if (field257 == 30) {
            if (field482 != -1) {
                method2561(field482);
            }
            for (int var15 = 0; var15 < field275; var15++) {
                if (field384[var15]) {
                    field272[var15] = true;
                }
                field408[var15] = field384[var15];
                field384[var15] = false;
            }
            field252 = field493;
            field382 = -1;
            field404 = -1;
            Statics.field95 = null;
            if (field482 != -1) {
                field275 = 0;
                method534(field482, 0, 0, 765, 503, 0, 0, -1);
            }
            class74.method1566();
            if (field403) {
                int var19 = Statics.field1836;
                int var20 = Statics.field525;
                int var21 = Statics.field198;
                int var22 = Statics.field1045;
                int var23 = 6116423;
                class74.method1530(var19, var20, var21, var22, var23);
                class74.method1530(var19 + 1, var20 + 1, var21 - 2, 16, 0);
                class74.method1538(var19 + 1, var20 + 18, var21 - 2, var22 - 19, 0);
                Statics.field474.method3497(class145.field2303, var19 + 3, var20 + 14, var23, -1);
                int var24 = class129.field1987;
                int var25 = class129.field1988;
                for (int var26 = 0; var26 < field396; var26++) {
                    int var27 = (field396 - 1 - var26) * 15 + var20 + 31;
                    int var28 = 16777215;
                    if (var24 > var19 && var24 < var19 + var21 && var25 > var27 - 13 && var25 < var27 + 3) {
                        var28 = 16776960;
                    }
                    Statics.field474.method3497(method862(var26), var19 + 3, var27, var28, 0);
                }
                int var29 = Statics.field1836;
                int var30 = Statics.field525;
                int var31 = Statics.field198;
                int var32 = Statics.field1045;
                for (int var33 = 0; var33 < field275; var33++) {
                    if (field463[var33] + field268[var33] > var29 && field463[var33] < var29 + var31 && field466[var33] + field321[var33] > var30 && field321[var33] < var30 + var32) {
                        field272[var33] = true;
                    }
                }
            } else if (field382 != -1) {
                int var16 = field382;
                int var17 = field404;
                if (field396 >= 2 || field407 != 0 || field409) {
                    String var18;
                    if (field407 == 1 && field396 < 2) {
                        var18 = class145.field2300 + class145.field2310 + field455 + " " + class2.field22;
                    } else if (field409 && field396 < 2) {
                        var18 = field412 + class145.field2310 + field413 + " " + class2.field22;
                    } else {
                        var18 = method862(field396 - 1);
                    }
                    if (field396 > 2) {
                        var18 = var18 + class2.method2597(16777215) + " " + '/' + " " + (field396 - 2) + class145.field2304;
                    }
                    Statics.field474.method3467(var18, var16 + 4, var17 + 15, 16777215, 0, field493 / 1000);
                }
            }
            if (field467 == 3) {
                for (int var34 = 0; var34 < field275; var34++) {
                    if (field408[var34]) {
                        class74.method1529(field463[var34], field321[var34], field268[var34], field466[var34], 16711935, 128);
                    } else if (field272[var34]) {
                        class74.method1529(field463[var34], field321[var34], field268[var34], field466[var34], 16711680, 128);
                    }
                }
            }
            int var35 = Statics.field168;
            int var36 = Statics.field524.field780;
            int var37 = Statics.field524.field727;
            int var38 = field375;
            for (class21 var39 = (class21) class21.field549.method3249(); var39 != null; var39 = (class21) class21.field549.method3248()) {
                if (var39.field556 != -1 || var39.field560 != null) {
                    int var40 = 0;
                    if (var36 > var39.field553) {
                        var40 += var36 - var39.field553;
                    } else if (var36 < var39.field567) {
                        var40 += var39.field567 - var36;
                    }
                    if (var37 > var39.field554) {
                        var40 += var37 - var39.field554;
                    } else if (var37 < var39.field552) {
                        var40 += var39.field552 - var37;
                    }
                    if (var40 - 64 > var39.field555 || field492 == 0 || var39.field550 != var35) {
                        if (var39.field563 != null) {
                            Statics.field1750.method996(var39.field563);
                            var39.field563 = null;
                        }
                        if (var39.field562 != null) {
                            Statics.field1750.method996(var39.field562);
                            var39.field562 = null;
                        }
                    } else {
                        var40 -= 64;
                        if (var40 < 0) {
                            var40 = 0;
                        }
                        int var41 = field492 * (var39.field555 - var40) / var39.field555;
                        class53 var10000;
                        if (var39.field563 != null) {
                            var39.field563.method1114(var41);
                        } else if (var39.field556 >= 0) {
                            var10000 = (class53) null;
                            class53 var42 = class53.method1058(Statics.field1284, var39.field556, 0);
                            if (var42 != null) {
                                class57 var43 = var42.method1057().method1087(Statics.field982);
                                class59 var44 = class59.method1110(var43, 100, var41);
                                var44.method1152(-1);
                                Statics.field1750.method956(var44);
                                var39.field563 = var44;
                            }
                        }
                        if (var39.field562 != null) {
                            var39.field562.method1114(var41);
                            if (!var39.field562.method3333()) {
                                var39.field562 = null;
                            }
                        } else if (var39.field560 != null && (var39.field564 -= var38) <= 0) {
                            int var45 = (int) (Math.random() * (double) var39.field560.length);
                            var10000 = (class53) null;
                            class53 var46 = class53.method1058(Statics.field1284, var39.field560[var45], 0);
                            if (var46 != null) {
                                class57 var47 = var46.method1057().method1087(Statics.field982);
                                class59 var48 = class59.method1110(var47, 100, var41);
                                var48.method1152(0);
                                Statics.field1750.method956(var48);
                                var39.field562 = var48;
                                var39.field564 = var39.field558 + (int) (Math.random() * (double) (var39.field559 - var39.field558));
                            }
                        }
                    }
                }
            }
            field375 = 0;
        } else if (field257 == 40) {
            method2693(class145.field2281 + class2.field23 + class145.field2161, false);
        } else if (field257 == 45) {
            method2693(class145.field2308, false);
        }
        if (field257 == 30 && field467 == 0 && !field2045) {
            try {
                Graphics var49 = Statics.field1007.getGraphics();
                for (int var50 = 0; var50 < field275; var50++) {
                    if (field272[var50]) {
                        Statics.field1120.method1346(var49, field463[var50], field321[var50], field268[var50], field466[var50]);
                        field272[var50] = false;
                    }
                }
            } catch (Exception var58) {
                Statics.field1007.repaint();
            }
        } else if (field257 > 0) {
            try {
                Graphics var52 = Statics.field1007.getGraphics();
                Statics.field1120.method1367(var52, 0, 0);
                field2045 = false;
                for (int var53 = 0; var53 < field275; var53++) {
                    field272[var53] = false;
                }
            } catch (Exception var57) {
                Statics.field1007.repaint();
            }
        }
    }

    @ObfuscatedName("client.v(B)V")
    public final void method150() {
        if (Statics.field267 != null) {
            Statics.field267.field183 = false;
        }
        Statics.field267 = null;
        if (Statics.field605 != null) {
            Statics.field605.method2601();
            Statics.field605 = null;
        }
        if (class126.field1967 != null) {
            class126 var1 = class126.field1967;
            synchronized (class126.field1967) {
                class126.field1967 = null;
            }
        }
        Statics.method2719();
        Statics.field701 = null;
        if (Statics.field794 != null) {
            Statics.field794.method1007();
        }
        if (Statics.field1246 != null) {
            Statics.field1246.method1007();
        }
        class153.method1978();
        class152.method118();
        class138.method531();
    }

    @ObfuscatedName("w.i(IB)V")
    public static void method127(int arg0) {
        if (field257 == arg0) {
            return;
        }
        if (field257 == 0) {
            class133.method491();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field368 = 0;
            field437 = 0;
            field332 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field292 != null) {
            Statics.field292.method2601();
            Statics.field292 = null;
        }
        if (field257 == 25) {
            field311 = 0;
            field307 = 0;
            field308 = 1;
            field309 = 0;
            field338 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class29.method470(Statics.field1007, Statics.field1504, Statics.field1004, true, 0);
        } else if (arg0 == 20) {
            class29.method470(Statics.field1007, Statics.field1504, Statics.field1004, true, field257 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class29.method470(Statics.field1007, Statics.field1504, Statics.field1004, false, 4);
        } else {
            class29.method1618();
        }
        field257 = arg0;
    }

    @ObfuscatedName("client.x(I)V")
    public void method151() {
        if (field257 == 1000) {
            return;
        }
        long var1 = class104.method1388();
        int var3 = (int) (var1 - Statics.field2079);
        Statics.field2079 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class153.field2506 += var3;
        boolean var4;
        if (class153.field2510 == 0 && class153.field2501 == 0 && class153.field2508 == 0 && class153.field2518 == 0) {
            var4 = true;
        } else if (Statics.field2509 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class153.field2506 > 30000) {
                        throw new IOException();
                    }
                    while (class153.field2501 < 20 && class153.field2518 > 0) {
                        class154 var5 = (class154) class153.field2503.method3220();
                        class108 var6 = new class108(4);
                        var6.method2120(1);
                        var6.method2152((int) var5.field2886);
                        Statics.field2509.method2618(var6.field1830, 0, 4);
                        class153.field2504.method3207(var5, var5.field2886);
                        class153.field2518--;
                        class153.field2501++;
                    }
                    while (class153.field2510 < 20 && class153.field2508 > 0) {
                        class154 var7 = (class154) class153.field2515.method3308();
                        class108 var8 = new class108(4);
                        var8.method2120(0);
                        var8.method2152((int) var7.field2886);
                        Statics.field2509.method2618(var8.field1830, 0, 4);
                        var7.method3310();
                        class153.field2521.method3207(var7, var7.field2886);
                        class153.field2508--;
                        class153.field2510++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2509.method2604();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class153.field2506 = 0;
                        byte var11 = 0;
                        if (Statics.field696 == null) {
                            var11 = 8;
                        } else if (class153.field2500 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class153.field2512.field1826;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2509.method2605(class153.field2512.field1830, class153.field2512.field1826, var12);
                            if (class153.field2517 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class153.field2512.field1830[class153.field2512.field1826 + var13] ^= class153.field2517;
                                }
                            }
                            class153.field2512.field1826 += var12;
                            if (class153.field2512.field1826 < var11) {
                                break;
                            }
                            if (Statics.field696 == null) {
                                class153.field2512.field1826 = 0;
                                int var14 = class153.field2512.method2134();
                                int var15 = class153.field2512.method2136();
                                int var16 = class153.field2512.method2134();
                                int var17 = class153.field2512.method2144();
                                long var18 = (long) ((var14 << 16) + var15);
                                class154 var20 = (class154) class153.field2504.method3206(var18);
                                Statics.field2511 = true;
                                if (var20 == null) {
                                    var20 = (class154) class153.field2521.method3206(var18);
                                    Statics.field2511 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field696 = var20;
                                Statics.field2513 = new class108(var17 + var21 + Statics.field696.field2522);
                                Statics.field2513.method2120(var16);
                                Statics.field2513.method2123(var17);
                                class153.field2500 = 8;
                                class153.field2512.field1826 = 0;
                            } else if (class153.field2500 == 0) {
                                if (class153.field2512.field1830[0] == -1) {
                                    class153.field2500 = 1;
                                    class153.field2512.field1826 = 0;
                                } else {
                                    Statics.field696 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2513.field1830.length - Statics.field696.field2522;
                            int var23 = 512 - class153.field2500;
                            if (var23 > var22 - Statics.field2513.field1826) {
                                var23 = var22 - Statics.field2513.field1826;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2509.method2605(Statics.field2513.field1830, Statics.field2513.field1826, var23);
                            if (class153.field2517 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2513.field1830[Statics.field2513.field1826 + var24] ^= class153.field2517;
                                }
                            }
                            Statics.field2513.field1826 += var23;
                            class153.field2500 += var23;
                            if (Statics.field2513.field1826 == var22) {
                                if (Statics.field696.field2886 == 16711935L) {
                                    Statics.field616 = Statics.field2513;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class150 var26 = class153.field2514[var25];
                                        if (var26 != null) {
                                            Statics.field616.field1826 = var25 * 8 + 5;
                                            int var27 = Statics.field616.method2144();
                                            int var28 = Statics.field616.method2144();
                                            var26.method2821(var27, var28);
                                        }
                                    }
                                } else {
                                    class153.field2520.reset();
                                    class153.field2520.update(Statics.field2513.field1830, 0, var22);
                                    int var29 = (int) class153.field2520.getValue();
                                    if (Statics.field696.field2523 != var29) {
                                        try {
                                            Statics.field2509.method2601();
                                        } catch (Exception var35) {
                                        }
                                        class153.field2505++;
                                        Statics.field2509 = null;
                                        class153.field2517 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class153.field2505 = 0;
                                    class153.field2519 = 0;
                                    Statics.field696.field2524.method2819((int) (Statics.field696.field2886 & 0xFFFFL), Statics.field2513.field1830, (Statics.field696.field2886 & 0xFF0000L) == 16711680L, Statics.field2511);
                                }
                                Statics.field696.method3334();
                                if (Statics.field2511) {
                                    class153.field2501--;
                                } else {
                                    class153.field2510--;
                                }
                                class153.field2500 = 0;
                                Statics.field696 = null;
                                Statics.field2513 = null;
                            } else {
                                if (class153.field2500 != 512) {
                                    break;
                                }
                                class153.field2500 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2509.method2601();
                } catch (Exception var34) {
                }
                class153.field2519++;
                Statics.field2509 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method152();
        }
    }

    @ObfuscatedName("client.h(I)V")
    public void method152() {
        if (class153.field2505 >= 4) {
            this.method2621("js5crc");
            field257 = 1000;
            return;
        }
        if (class153.field2519 >= 4) {
            if (field257 <= 5) {
                this.method2621("js5io");
                field257 = 1000;
                return;
            }
            field282 = 3000;
            class153.field2519 = 3;
        }
        if (--field282 + 1 > 0) {
            return;
        }
        try {
            if (field281 == 0) {
                Statics.field399 = Statics.field122.method2499(Statics.field174, Statics.field2765);
                field281++;
            }
            if (field281 == 1) {
                if (Statics.field399.field2059 == 2) {
                    this.method389(-1);
                    return;
                }
                if (Statics.field399.field2059 == 1) {
                    field281++;
                }
            }
            if (field281 == 2) {
                Statics.field280 = new class132((Socket) Statics.field399.field2062, Statics.field122);
                class108 var1 = new class108(5);
                var1.method2120(15);
                var1.method2123(71);
                Statics.field280.method2618(var1.field1830, 0, 5);
                field281++;
                Statics.field159 = class104.method1388();
            }
            if (field281 == 3) {
                if (field257 <= 5 || Statics.field280.method2604() > 0) {
                    int var2 = Statics.field280.method2603();
                    if (var2 != 0) {
                        this.method389(var2);
                        return;
                    }
                    field281++;
                } else if (class104.method1388() - Statics.field159 > 30000L) {
                    this.method389(-2);
                    return;
                }
            }
            if (field281 == 4) {
                class132 var3 = Statics.field280;
                boolean var4 = field257 > 20;
                if (Statics.field2509 != null) {
                    try {
                        Statics.field2509.method2601();
                    } catch (Exception var14) {
                    }
                    Statics.field2509 = null;
                }
                Statics.field2509 = var3;
                class153.method1802(var4);
                class153.field2512.field1826 = 0;
                Statics.field696 = null;
                Statics.field2513 = null;
                class153.field2500 = 0;
                while (true) {
                    class154 var6 = (class154) class153.field2504.method3220();
                    if (var6 == null) {
                        while (true) {
                            class154 var7 = (class154) class153.field2521.method3220();
                            if (var7 == null) {
                                if (class153.field2517 != 0) {
                                    try {
                                        class108 var8 = new class108(4);
                                        var8.method2120(4);
                                        var8.method2120(class153.field2517);
                                        var8.method2121(0);
                                        Statics.field2509.method2618(var8.field1830, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2509.method2601();
                                        } catch (Exception var12) {
                                        }
                                        class153.field2519++;
                                        Statics.field2509 = null;
                                    }
                                }
                                class153.field2506 = 0;
                                Statics.field2079 = class104.method1388();
                                Statics.field399 = null;
                                Statics.field280 = null;
                                field281 = 0;
                                field283 = 0;
                                return;
                            }
                            class153.field2515.method3297(var7);
                            class153.field2507.method3207(var7, var7.field2886);
                            class153.field2508++;
                            class153.field2510--;
                        }
                    }
                    class153.field2503.method3207(var6, var6.field2886);
                    class153.field2518++;
                    class153.field2501--;
                }
            }
        } catch (IOException var15) {
            this.method389(-3);
        }
    }

    @ObfuscatedName("client.w(IB)V")
    public void method389(int arg0) {
        Statics.field399 = null;
        Statics.field280 = null;
        field281 = 0;
        if (Statics.field835 == Statics.field2765) {
            Statics.field2765 = Statics.field1891;
        } else {
            Statics.field2765 = Statics.field835;
        }
        field283++;
        if (field283 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field257 <= 5) {
                this.method2621("js5connect_full");
                field257 = 1000;
            } else {
                field282 = 3000;
            }
        } else if (field283 >= 2 && arg0 == 6) {
            this.method2621("js5connect_outofdate");
            field257 = 1000;
        } else if (field283 >= 4) {
            if (field257 <= 5) {
                this.method2621("js5connect");
                field257 = 1000;
            } else {
                field282 = 3000;
            }
        }
    }

    @ObfuscatedName("ft.s(I)V")
    public static void method3160() {
        if (field278 == 0) {
            Statics.field2127 = new class80(4, 104, 104, class6.field84);
            for (int var0 = 0; var0 < 4; var0++) {
                field312[var0] = new class209(104, 104);
            }
            Statics.field889 = new class73(512, 512);
            class29.field669 = class145.field2162;
            class29.field654 = 5;
            field278 = 20;
        } else if (field278 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1472[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class80.method1656(var1, 500, 800, 512, 334);
            class29.field669 = class145.field2163;
            class29.field654 = 10;
            field278 = 30;
        } else if (field278 == 30) {
            Statics.field697 = method506(0, false, true, true);
            Statics.field2474 = method506(1, false, true, true);
            Statics.field144 = method506(2, true, false, true);
            Statics.field2106 = method506(3, false, true, true);
            Statics.field1284 = method506(4, false, true, true);
            Statics.field1434 = method506(5, true, true, true);
            Statics.field1503 = method506(6, true, true, false);
            Statics.field232 = method506(7, false, true, true);
            Statics.field1004 = method506(8, false, true, true);
            Statics.field1886 = method506(9, false, true, true);
            Statics.field1504 = method506(10, false, true, true);
            Statics.field11 = method506(11, false, true, true);
            Statics.field1268 = method506(12, false, true, true);
            Statics.field2052 = method506(13, true, false, true);
            Statics.field1648 = method506(14, false, true, false);
            Statics.field1870 = method506(15, false, true, true);
            class29.field669 = class145.field2164;
            class29.field654 = 20;
            field278 = 40;
        } else if (field278 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field697.method2827() * 4 / 100;
            int var8 = var7 + Statics.field2474.method2827() * 4 / 100;
            int var9 = var8 + Statics.field144.method2827() * 2 / 100;
            int var10 = var9 + Statics.field2106.method2827() * 2 / 100;
            int var11 = var10 + Statics.field1284.method2827() * 6 / 100;
            int var12 = var11 + Statics.field1434.method2827() * 4 / 100;
            int var13 = var12 + Statics.field1503.method2827() * 2 / 100;
            int var14 = var13 + Statics.field232.method2827() * 60 / 100;
            int var15 = var14 + Statics.field1004.method2827() * 2 / 100;
            int var16 = var15 + Statics.field1886.method2827() * 2 / 100;
            int var17 = var16 + Statics.field1504.method2827() * 2 / 100;
            int var18 = var17 + Statics.field11.method2827() * 2 / 100;
            int var19 = var18 + Statics.field1268.method2827() * 2 / 100;
            int var20 = var19 + Statics.field2052.method2827() * 2 / 100;
            int var21 = var20 + Statics.field1648.method2827() * 2 / 100;
            int var22 = var21 + Statics.field1870.method2827() * 2 / 100;
            if (var22 == 100) {
                class29.field669 = class145.field2166;
                class29.field654 = 30;
                field278 = 45;
            } else {
                if (var22 != 0) {
                    class29.field669 = class145.field2165 + var22 + "%";
                }
                class29.field654 = 30;
            }
        } else if (field278 == 45) {
            boolean var23 = !field255;
            Statics.field1814 = 22050;
            Statics.field1099 = var23;
            Statics.field1079 = 2;
            class165 var24 = new class165();
            var24.method3092(9, 128);
            Statics.field794 = class51.method2493(Statics.field122, Statics.field1007, 0, 22050);
            Statics.field794.method1033(var24);
            class150 var25 = Statics.field1870;
            class150 var26 = Statics.field1648;
            class150 var27 = Statics.field1284;
            Statics.field2725 = var25;
            Statics.field2724 = var26;
            Statics.field2733 = var27;
            Statics.field2675 = var24;
            Statics.field1246 = class51.method2493(Statics.field122, Statics.field1007, 1, 2048);
            Statics.field1750 = new class50();
            Statics.field1246.method1033(Statics.field1750);
            Statics.field982 = new class69(22050, Statics.field1814);
            class29.field669 = class145.field2167;
            class29.field654 = 35;
            field278 = 50;
        } else if (field278 == 50) {
            int var28 = 0;
            if (Statics.field197 == null) {
                Statics.field197 = class71.method518(Statics.field1004, Statics.field2052, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field2146 == null) {
                Statics.field2146 = class71.method518(Statics.field1004, Statics.field2052, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field474 == null) {
                class150 var29 = Statics.field1004;
                class150 var30 = Statics.field2052;
                int var31 = var29.method2761("b12_full");
                int var32 = var29.method2762(var31, "");
                class205 var33;
                if (class71.method2722(var29, var31, var32)) {
                    byte[] var34 = var30.method2746(var31, var32);
                    class205 var35;
                    if (var34 == null) {
                        var35 = null;
                    } else {
                        class205 var36 = new class205(var34, Statics.field1279, Statics.field1281, Statics.field1887, Statics.field1276, Statics.field711, Statics.field2707);
                        class71.method2343();
                        var35 = var36;
                    }
                    var33 = var35;
                } else {
                    var33 = null;
                }
                Statics.field474 = var33;
            } else {
                var28++;
            }
            if (var28 < 3) {
                class29.field669 = class145.field2205 + var28 * 100 / 3 + "%";
                class29.field654 = 40;
            } else {
                Statics.field182 = new class148(true);
                class29.field669 = class145.field2169;
                class29.field654 = 40;
                field278 = 60;
            }
        } else if (field278 == 60) {
            class150 var38 = Statics.field1504;
            class150 var39 = Statics.field1004;
            int var40 = 0;
            if (var38.method2764("title.jpg", "")) {
                var40++;
            }
            if (var39.method2764("logo", "")) {
                var40++;
            }
            if (var39.method2764("titlebox", "")) {
                var40++;
            }
            if (var39.method2764("titlebutton", "")) {
                var40++;
            }
            if (var39.method2764("runes", "")) {
                var40++;
            }
            if (var39.method2764("title_mute", "")) {
                var40++;
            }
            if (var39.method2765("options_radio_buttons,0")) {
                var40++;
            }
            if (var39.method2765("options_radio_buttons,2")) {
                var40++;
            }
            var39.method2764("sl_back", "");
            var39.method2764("sl_flags", "");
            var39.method2764("sl_arrows", "");
            var39.method2764("sl_stars", "");
            var39.method2764("sl_button", "");
            int var43 = class29.method489();
            if (var40 < var43) {
                class29.field669 = class145.field2170 + var40 * 100 / var43 + "%";
                class29.field654 = 50;
            } else {
                class29.field669 = class145.field2171;
                class29.field654 = 50;
                method127(5);
                field278 = 70;
            }
        } else if (field278 == 70) {
            if (Statics.field144.method2750()) {
                class150 var44 = Statics.field144;
                Statics.field964 = var44;
                class150 var45 = Statics.field144;
                Statics.field891 = var45;
                class41.method2867(Statics.field144, Statics.field232);
                class37.method597(Statics.field144, Statics.field232, field255);
                class36.method641(Statics.field144, Statics.field232);
                class46.method2484(Statics.field144, Statics.field232, field250, Statics.field197);
                class39.method66(Statics.field144, Statics.field697, Statics.field2474);
                class40.method1312(Statics.field144, Statics.field232);
                class43.method21(Statics.field144);
                class47.method2486(Statics.field144);
                class155.method23(Statics.field2106, Statics.field232, Statics.field1004, Statics.field2052);
                class45.method559(Statics.field144);
                class44.method2066(Statics.field144);
                class29.field669 = class145.field2173;
                class29.field654 = 60;
                field278 = 80;
            } else {
                class29.field669 = class145.field2371 + Statics.field144.method2825() + "%";
                class29.field654 = 60;
            }
        } else if (field278 == 80) {
            int var46 = 0;
            if (Statics.field329 == null) {
                class150 var47 = Statics.field1004;
                int var48 = var47.method2761("compass");
                int var49 = var47.method2762(var48, "");
                class73 var50;
                if (class71.method2722(var47, var48, var49)) {
                    var50 = class71.method773();
                } else {
                    var50 = null;
                }
                Statics.field329 = var50;
            } else {
                var46++;
            }
            if (Statics.field1894 == null) {
                class150 var52 = Statics.field1004;
                int var53 = var52.method2761("mapedge");
                int var54 = var52.method2762(var53, "");
                class73 var55;
                if (class71.method2722(var52, var53, var54)) {
                    var55 = class71.method773();
                } else {
                    var55 = null;
                }
                Statics.field1894 = var55;
            } else {
                var46++;
            }
            if (Statics.field961 == null) {
                Statics.field961 = class71.method2728(Statics.field1004, "mapscene", "");
            } else {
                var46++;
            }
            if (Statics.field1286 == null) {
                Statics.field1286 = class71.method488(Statics.field1004, "mapfunction", "");
            } else {
                var46++;
            }
            if (Statics.field2418 == null) {
                Statics.field2418 = class71.method488(Statics.field1004, "hitmarks", "");
            } else {
                var46++;
            }
            if (Statics.field753 == null) {
                Statics.field753 = class71.method488(Statics.field1004, "headicons_pk", "");
            } else {
                var46++;
            }
            if (Statics.field520 == null) {
                Statics.field520 = class71.method488(Statics.field1004, "headicons_prayer", "");
            } else {
                var46++;
            }
            if (Statics.field540 == null) {
                Statics.field540 = class71.method488(Statics.field1004, "headicons_hint", "");
            } else {
                var46++;
            }
            if (Statics.field2692 == null) {
                Statics.field2692 = class71.method488(Statics.field1004, "mapmarker", "");
            } else {
                var46++;
            }
            if (Statics.field1865 == null) {
                Statics.field1865 = class71.method488(Statics.field1004, "cross", "");
            } else {
                var46++;
            }
            if (Statics.field648 == null) {
                Statics.field648 = class71.method488(Statics.field1004, "mapdots", "");
            } else {
                var46++;
            }
            if (Statics.field2014 == null) {
                Statics.field2014 = class71.method2728(Statics.field1004, "scrollbar", "");
            } else {
                var46++;
            }
            if (Statics.field58 == null) {
                Statics.field58 = class71.method2728(Statics.field1004, "mod_icons", "");
            } else {
                var46++;
            }
            if (Statics.field55 == null) {
                Statics.field55 = class71.method107(Statics.field1004, "mapback", "");
            } else {
                var46++;
            }
            if (var46 < 14) {
                class29.field669 = class145.field2395 + var46 * 100 / 14 + "%";
                class29.field654 = 70;
            } else {
                Statics.field2964 = Statics.field58;
                Statics.field1894.method1429();
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 41.0D) - 20;
                for (int var61 = 0; var61 < Statics.field1286.length; var61++) {
                    Statics.field1286[var61].method1428(var57 + var60, var58 + var60, var59 + var60);
                }
                Statics.field961[0].method1584(var57 + var60, var58 + var60, var59 + var60);
                Statics.field1 = new int[33];
                Statics.field242 = new int[33];
                Statics.field1970 = new int[151];
                Statics.field2086 = new int[151];
                for (int var62 = 0; var62 < 33; var62++) {
                    int var63 = 999;
                    int var64 = 0;
                    for (int var65 = 0; var65 < 34; var65++) {
                        if (Statics.field55.field1313[Statics.field55.field1315 * var62 + var65] == 0) {
                            if (var63 == 999) {
                                var63 = var65;
                            }
                        } else if (var63 != 999) {
                            var64 = var65;
                            break;
                        }
                    }
                    Statics.field1[var62] = var63;
                    Statics.field242[var62] = var64 - var63;
                }
                for (int var66 = 5; var66 < 156; var66++) {
                    int var67 = 999;
                    int var68 = 0;
                    for (int var69 = 25; var69 < 172; var69++) {
                        if (Statics.field55.field1313[Statics.field55.field1315 * var66 + var69] == 0 && var69 > 34 || var66 > 34) {
                            if (var67 == 999) {
                                var67 = var69;
                            }
                        } else if (var67 != 999) {
                            var68 = var69;
                            break;
                        }
                    }
                    Statics.field1970[var66 - 5] = var67 - 25;
                    Statics.field2086[var66 - 5] = var68 - var67;
                }
                class29.field669 = class145.field2392;
                class29.field654 = 70;
                field278 = 90;
            }
        } else if (field278 == 90) {
            if (Statics.field1886.method2750()) {
                class89 var70 = new class89(Statics.field1886, Statics.field1004, 20, 0.8D, field255 ? 64 : 128);
                class85.method1808(var70);
                class85.method1838(0.8D);
                class29.field669 = class145.field2177;
                class29.field654 = 90;
                field278 = 110;
            } else {
                class29.field669 = class145.field2176 + Statics.field1886.method2825() + "%";
                class29.field654 = 90;
            }
        } else if (field278 == 110) {
            Statics.field267 = new class12();
            Statics.field122.method2500(Statics.field267, 10);
            class29.field669 = class145.field2302;
            class29.field654 = 94;
            field278 = 120;
        } else if (field278 == 120) {
            if (Statics.field1504.method2764("huffman", "")) {
                class103 var71 = new class103(Statics.field1504.method2763("huffman", ""));
                Statics.field2952 = var71;
                class29.field669 = class145.field2212;
                class29.field654 = 96;
                field278 = 130;
            } else {
                class29.field669 = class145.field2179 + "%";
                class29.field654 = 96;
            }
        } else if (field278 == 130) {
            if (!Statics.field2106.method2750()) {
                class29.field669 = class145.field2322 + Statics.field2106.method2825() * 4 / 5 + "%";
                class29.field654 = 100;
            } else if (!Statics.field1268.method2750()) {
                class29.field669 = class145.field2322 + (80 + Statics.field1268.method2825() / 6) + "%";
                class29.field654 = 100;
            } else if (Statics.field2052.method2750()) {
                class29.field669 = class145.field2182;
                class29.field654 = 100;
                field278 = 140;
            } else {
                class29.field669 = class145.field2322 + (96 + Statics.field2052.method2825() / 20) + "%";
                class29.field654 = 100;
            }
        } else if (field278 == 140) {
            method127(10);
        }
    }

    @ObfuscatedName("e.p(IZZZB)Leo;")
    public static class150 method506(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class123 var4 = null;
        if (class138.field2074 != null) {
            var4 = new class123(arg0, class138.field2074, Statics.field2076[arg0], 1000000);
        }
        return new class150(var4, Statics.field1791, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ae.z(I)V")
    public static final void method560() {
        try {
            if (field368 == 0) {
                if (Statics.field605 != null) {
                    Statics.field605.method2601();
                    Statics.field605 = null;
                }
                Statics.field1888 = null;
                field304 = false;
                field437 = 0;
                field368 = 1;
            }
            if (field368 == 1) {
                if (Statics.field1888 == null) {
                    Statics.field1888 = Statics.field122.method2499(Statics.field174, Statics.field2765);
                }
                if (Statics.field1888.field2059 == 2) {
                    throw new IOException();
                }
                if (Statics.field1888.field2059 == 1) {
                    Statics.field605 = new class132((Socket) Statics.field1888.field2062, Statics.field122);
                    Statics.field1888 = null;
                    field368 = 2;
                }
            }
            if (field368 == 2) {
                field486.field1826 = 0;
                field486.method2120(14);
                Statics.field605.method2618(field486.field1830, 0, 1);
                field313.field1826 = 0;
                field368 = 3;
            }
            if (field368 == 3) {
                if (Statics.field794 != null) {
                    Statics.field794.method1003();
                }
                if (Statics.field1246 != null) {
                    Statics.field1246.method1003();
                }
                int var0 = Statics.field605.method2603();
                if (Statics.field794 != null) {
                    Statics.field794.method1003();
                }
                if (Statics.field1246 != null) {
                    Statics.field1246.method1003();
                }
                if (var0 != 0) {
                    method487(var0);
                    return;
                }
                field313.field1826 = 0;
                field368 = 5;
            }
            if (field368 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field486.field1826 = 0;
                field486.method2120(1);
                field486.method2120(class29.field673.method462());
                field486.method2123(var1[0]);
                field486.method2123(var1[1]);
                field486.method2123(var1[2]);
                field486.method2123(var1[3]);
                switch(class29.field673.field2409) {
                    case 0:
                    case 3:
                        field486.method2152(Statics.field543);
                        field486.field1826 += 5;
                        break;
                    case 1:
                        field486.method2123((Integer) Statics.field2103.field145.get(class211.method1008(class29.field682)));
                        field486.field1826 += 4;
                        break;
                    case 2:
                        field486.field1826 += 8;
                }
                field486.method2125(class29.field675);
                field486.method2301(class5.field69, class5.field72);
                field294.field1826 = 0;
                if (field257 == 40) {
                    field294.method2120(18);
                } else {
                    field294.method2120(16);
                }
                field294.method2121(0);
                int var2 = field294.field1826;
                field294.method2123(71);
                field294.method2128(field486.field1830, 0, field486.field1826);
                int var3 = field294.field1826;
                field294.method2125(class29.field682);
                field294.method2120(field255 ? 1 : 0);
                class138.method1383(field294);
                class108 var4 = new class108(Statics.field182.method2735());
                Statics.field182.method2731(var4);
                field294.method2128(var4.field1830, 0, var4.field1830.length);
                field294.method2123(Statics.field697.field2463);
                field294.method2123(Statics.field2474.field2463);
                field294.method2123(Statics.field144.field2463);
                field294.method2123(Statics.field2106.field2463);
                field294.method2123(Statics.field1284.field2463);
                field294.method2123(Statics.field1434.field2463);
                field294.method2123(Statics.field1503.field2463);
                field294.method2123(Statics.field232.field2463);
                field294.method2123(Statics.field1004.field2463);
                field294.method2123(Statics.field1886.field2463);
                field294.method2123(Statics.field1504.field2463);
                field294.method2123(Statics.field11.field2463);
                field294.method2123(Statics.field1268.field2463);
                field294.method2123(Statics.field2052.field2463);
                field294.method2123(Statics.field1648.field2463);
                field294.method2123(Statics.field1870.field2463);
                field294.method2327(var1, var3, field294.field1826);
                field294.method2129(field294.field1826 - var2);
                Statics.field605.method2618(field294.field1830, 0, field294.field1826);
                field486.method2374(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field313.method2374(var1);
                field368 = 6;
            }
            if (field368 == 6 && Statics.field605.method2604() > 0) {
                int var6 = Statics.field605.method2603();
                if (var6 == 21 && field257 == 20) {
                    field368 = 7;
                } else if (var6 == 2) {
                    field368 = 9;
                } else if (var6 == 15 && field257 == 40) {
                    method520();
                    return;
                } else if (var6 == 23 && field332 < 1) {
                    field332++;
                    field368 = 0;
                } else {
                    method487(var6);
                    return;
                }
            }
            if (field368 == 7 && Statics.field605.method2604() > 0) {
                field287 = (Statics.field605.method2603() + 3) * 60;
                field368 = 8;
            }
            if (field368 == 8) {
                field437 = 0;
                class29.method25(class145.field2186, class145.field2187, field287 / 60 + class145.field2188);
                if (--field287 <= 0) {
                    field368 = 0;
                }
            } else {
                if (field368 == 9 && Statics.field605.method2604() >= 13) {
                    boolean var7 = Statics.field605.method2603() == 1;
                    Statics.field605.method2605(field313.field1830, 0, 4);
                    field313.field1826 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field313.method2378() << 24;
                        int var10 = var9 | field313.method2378() << 16;
                        int var11 = var10 | field313.method2378() << 8;
                        int var12 = var11 | field313.method2378();
                        int var13 = class211.method1008(class29.field682);
                        if (Statics.field2103.field145.size() >= 10 && !Statics.field2103.field145.containsKey(var13)) {
                            Iterator var14 = Statics.field2103.field145.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field2103.field145.put(var13, var12);
                        class9.method669();
                    }
                    field374 = Statics.field605.method2603();
                    field423 = Statics.field605.method2603() == 1;
                    field378 = Statics.field605.method2603();
                    field378 <<= 0x8;
                    field378 += Statics.field605.method2603();
                    field499 = Statics.field605.method2603();
                    Statics.field605.method2605(field313.field1830, 0, 1);
                    field313.field1826 = 0;
                    field297 = field313.method2378();
                    Statics.field605.method2605(field313.field1830, 0, 2);
                    field313.field1826 = 0;
                    field448 = field313.method2136();
                    if (field499 == 1) {
                        try {
                            client var15 = Statics.field305;
                            JSObject.getWindow(var15).call("zap", (Object[]) null);
                        } catch (Throwable var21) {
                        }
                    } else {
                        try {
                            client var17 = Statics.field305;
                            JSObject.getWindow(var17).call("unzap", (Object[]) null);
                        } catch (Throwable var20) {
                        }
                    }
                    field368 = 10;
                }
                if (field368 != 10) {
                    field437++;
                    if (field437 > 2000) {
                        if (field332 < 1) {
                            if (Statics.field835 == Statics.field2765) {
                                Statics.field2765 = Statics.field1891;
                            } else {
                                Statics.field2765 = Statics.field835;
                            }
                            field332++;
                            field368 = 0;
                        } else {
                            method487(-3);
                        }
                    }
                } else if (Statics.field605.method2604() >= field448) {
                    field313.field1826 = 0;
                    Statics.field605.method2605(field313.field1830, 0, field448);
                    method1900();
                    Statics.field2687 = -1;
                    method519(false);
                    field297 = -1;
                }
            }
        } catch (IOException var22) {
            if (field332 < 1) {
                if (Statics.field835 == Statics.field2765) {
                    Statics.field2765 = Statics.field1891;
                } else {
                    Statics.field2765 = Statics.field835;
                }
                field332++;
                field368 = 0;
            } else {
                method487(-2);
            }
        }
    }

    @ObfuscatedName("cf.n(B)V")
    public static void method1900() {
        field328 = -1L;
        field264 = -1;
        Statics.field267.field179 = 0;
        Statics.field578 = true;
        field265 = true;
        field458 = -1L;
        class192.method3149();
        field486.field1826 = 0;
        field313.field1826 = 0;
        field297 = -1;
        field301 = -1;
        field302 = -1;
        field303 = -1;
        field498 = 0;
        field365 = 0;
        field300 = 0;
        field390 = 0;
        field396 = 0;
        field403 = false;
        class129.method1310(0);
        Statics.method1800();
        field407 = 0;
        field409 = false;
        field432 = 0;
        field316 = (int) (Math.random() * 100.0D) - 50;
        field318 = (int) (Math.random() * 110.0D) - 55;
        field320 = (int) (Math.random() * 80.0D) - 40;
        field323 = (int) (Math.random() * 120.0D) - 60;
        field325 = (int) (Math.random() * 30.0D) - 20;
        field363 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field487 = 0;
        field358 = -1;
        field370 = 0;
        field457 = 0;
        field277 = class18.field519;
        field373 = 0;
        field290 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field372[var0] = null;
            field511[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field289[var1] = null;
        }
        Statics.field524 = field372[2047] = new class3();
        field386 = -1;
        field389.method3240();
        field428.method3240();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field387[var2][var3][var4] = null;
                }
            }
        }
        field485 = new class180();
        field506 = 0;
        field505 = 0;
        field509 = 0;
        for (int var5 = 0; var5 < Statics.field2889; var5++) {
            class47 var6 = class47.method2717(var5);
            if (var6 != null) {
                class157.field2668[var5] = 0;
                class157.field2671[var5] = 0;
            }
        }
        for (int var7 = 0; var7 < field451.length; var7++) {
            field451[var7] = -1;
        }
        field422 = -1;
        if (field482 != -1) {
            class155.method2590(field482);
        }
        for (class4 var8 = (class4) field462.method3220(); var8 != null; var8 = (class4) field462.method3210()) {
            method80(var8, true);
        }
        field482 = -1;
        field462 = new class177(8);
        field477 = null;
        field403 = false;
        field396 = 0;
        field414.method2946((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field298[var9] = null;
            field314[var9] = false;
        }
        class14.field194 = new class177(32);
        field258 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field384[var10] = true;
        }
        field478 = null;
        Statics.field2064 = 0;
        Statics.field588 = null;
        for (int var11 = 0; var11 < 6; var11++) {
            field514[var11] = new class201();
        }
        Statics.field1558 = null;
    }

    @ObfuscatedName("o.u(I)V")
    public static void method520() {
        field486.field1826 = 0;
        field313.field1826 = 0;
        field297 = -1;
        field301 = -1;
        field302 = -1;
        field303 = -1;
        field448 = 0;
        field498 = 0;
        field365 = 0;
        field396 = 0;
        field403 = false;
        field487 = 0;
        field370 = 0;
        for (int var0 = 0; var0 < field372.length; var0++) {
            if (field372[var0] != null) {
                field372[var0].field784 = -1;
            }
        }
        for (int var1 = 0; var1 < field289.length; var1++) {
            if (field289[var1] != null) {
                field289[var1].field784 = -1;
            }
        }
        class14.field194 = new class177(32);
        method127(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field384[var2] = true;
        }
    }

    @ObfuscatedName("d.a(IS)V")
    public static void method487(int arg0) {
        if (arg0 == -3) {
            class29.method25(class145.field2189, class145.field2359, class145.field2337);
        } else if (arg0 == -2) {
            class29.method25(class145.field2201, class145.field2193, class145.field2194);
        } else if (arg0 == -1) {
            class29.method25(class145.field2195, class145.field2196, class145.field2197);
        } else if (arg0 == 3) {
            class29.method25(class145.field2198, class145.field2199, class145.field2200);
        } else if (arg0 == 4) {
            class29.method25(class145.field2384, class145.field2202, class145.field2203);
        } else if (arg0 == 5) {
            class29.method25(class145.field2204, class145.field2381, class145.field2206);
        } else if (arg0 == 6) {
            class29.method25(class145.field2207, class145.field2231, class145.field2209);
        } else if (arg0 == 7) {
            class29.method25(class145.field2210, class145.field2211, class145.field2235);
        } else if (arg0 == 8) {
            class29.method25(class145.field2286, class145.field2214, class145.field2215);
        } else if (arg0 == 9) {
            class29.method25(class145.field2216, class145.field2217, class145.field2266);
        } else if (arg0 == 10) {
            class29.method25(class145.field2172, class145.field2328, class145.field2307);
        } else if (arg0 == 11) {
            class29.method25(class145.field2343, class145.field2174, class145.field2274);
        } else if (arg0 == 12) {
            class29.method25(class145.field2225, class145.field2226, class145.field2227);
        } else if (arg0 == 13) {
            class29.method25(class145.field2228, class145.field2218, class145.field2311);
        } else if (arg0 == 14) {
            class29.method25(class145.field2355, class145.field2360, class145.field2233);
        } else if (arg0 == 16) {
            class29.method25(class145.field2252, class145.field2183, class145.field2236);
        } else if (arg0 == 17) {
            class29.method25(class145.field2237, class145.field2238, class145.field2239);
        } else if (arg0 == 18) {
            class29.method25(class145.field2243, class145.field2273, class145.field2242);
        } else if (arg0 == 19) {
            class29.method25(class145.field2160, class145.field2168, class145.field2245);
        } else if (arg0 == 20) {
            class29.method25(class145.field2246, class145.field2247, class145.field2248);
        } else if (arg0 == 22) {
            class29.method25(class145.field2191, class145.field2213, class145.field2251);
        } else if (arg0 == 23) {
            class29.method25(class145.field2388, class145.field2253, class145.field2254);
        } else if (arg0 == 24) {
            class29.method25(class145.field2255, class145.field2256, class145.field2257);
        } else if (arg0 == 25) {
            class29.method25(class145.field2258, class145.field2349, class145.field2155);
        } else if (arg0 == 26) {
            class29.method25(class145.field2261, class145.field2262, class145.field2263);
        } else if (arg0 == 27) {
            class29.method25(class145.field2264, class145.field2350, class145.field2331);
        } else if (arg0 == 31) {
            class29.method25(class145.field2278, class145.field2230, class145.field2275);
        } else if (arg0 == 32) {
            class29.method25(class145.field2276, class145.field2277, class145.field2222);
        } else if (arg0 == 37) {
            class29.method25(class145.field2178, class145.field2362, class145.field2223);
        } else if (arg0 == 38) {
            class29.method25(class145.field2282, class145.field2181, class145.field2284);
        } else if (arg0 == 55) {
            class29.method25(class145.field2285, class145.field2324, class145.field2287);
        } else if (arg0 == 56) {
            class29.method25(class145.field2288, class145.field2289, class145.field2290);
            method127(11);
            return;
        } else if (arg0 == 57) {
            class29.method25(class145.field2345, class145.field2292, class145.field2180);
            method127(11);
            return;
        } else {
            class29.method25(class145.field2294, class145.field2295, class145.field2296);
        }
        method127(10);
    }

    @ObfuscatedName("g.d(B)V")
    public static final void method88() {
        if (Statics.field605 != null) {
            Statics.field605.method2601();
            Statics.field605 = null;
        }
        method2074();
        Statics.field2127.method1725();
        for (int var0 = 0; var0 < 4; var0++) {
            field312[var0].method3584();
        }
        System.gc();
        Statics.method2551(2);
        field489 = -1;
        field490 = false;
        for (class21 var1 = (class21) class21.field549.method3249(); var1 != null; var1 = (class21) class21.field549.method3248()) {
            if (var1.field563 != null) {
                Statics.field1750.method996(var1.field563);
                var1.field563 = null;
            }
            if (var1.field562 != null) {
                Statics.field1750.method996(var1.field562);
                var1.field562 = null;
            }
        }
        class21.field549.method3240();
        method127(10);
    }

    @ObfuscatedName("cz.m(I)V")
    public static final void method2074() {
        class42.field963.method3168();
        class38.method2445();
        class41.method122();
        class37.field842.method3168();
        class37.field843.method3168();
        class37.field844.method3168();
        class37.field840.method3168();
        class36.method2060();
        class46.field1018.method3168();
        class46.field1019.method3168();
        class46.field1020.method3168();
        class39.field900.method3168();
        class39.field903.method3168();
        class40.method594();
        class43.field978.method3168();
        class47.field1065.method3168();
        class160.field2685.method3168();
        class155.field2652.method3168();
        class155.field2533.method3168();
        class155.field2534.method3168();
        ((class89) Statics.field1469).method1883();
        class19.field532.method3168();
        Statics.field697.method2759();
        Statics.field2474.method2759();
        Statics.field2106.method2759();
        Statics.field1284.method2759();
        Statics.field1434.method2759();
        Statics.field1503.method2759();
        Statics.field232.method2759();
        Statics.field1004.method2759();
        Statics.field1886.method2759();
        Statics.field1504.method2759();
        Statics.field11.method2759();
        Statics.field1268.method2759();
    }

    @ObfuscatedName("dg.q(B)V")
    public static final void method2494() {
        if (field300 > 0) {
            method88();
        } else {
            method127(40);
            Statics.field292 = Statics.field605;
            Statics.field605 = null;
        }
    }

    @ObfuscatedName("dt.e(I)V")
    public static final void method2488() {
        if (field365 > 1) {
            field365--;
        }
        if (field300 > 0) {
            field300--;
        }
        if (field304) {
            field304 = false;
            method2494();
            return;
        }
        if (!field403) {
            field401[0] = class145.field2394;
            field402[0] = "";
            field340[0] = 1006;
            field396 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field605 == null) {
                var1 = false;
            } else {
                label2713: {
                    try {
                        int var2 = Statics.field605.method2604();
                        if (var2 == 0) {
                            var1 = false;
                            break label2713;
                        }
                        if (field297 == -1) {
                            Statics.field605.method2605(field313.field1830, 0, 1);
                            field313.field1826 = 0;
                            field297 = field313.method2378();
                            field448 = class169.field2825[field297];
                            var2--;
                        }
                        if (field448 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2713;
                            }
                            Statics.field605.method2605(field313.field1830, 0, 1);
                            field448 = field313.field1830[0] & 0xFF;
                            var2--;
                        }
                        if (field448 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2713;
                            }
                            Statics.field605.method2605(field313.field1830, 0, 2);
                            field313.field1826 = 0;
                            field448 = field313.method2136();
                            var2 -= 2;
                        }
                        if (var2 < field448) {
                            var1 = false;
                            break label2713;
                        }
                        field313.field1826 = 0;
                        Statics.field605.method2605(field313.field1830, 0, field448);
                        field498 = 0;
                        field303 = field302;
                        field302 = field301;
                        field301 = field297;
                        if (field297 == 98) {
                            int var3 = field448 + field313.field1826;
                            int var4 = field313.method2136();
                            int var5 = field313.method2136();
                            if (field482 != var4) {
                                field482 = var4;
                                method668(field482);
                                class33.method2726(field482);
                                for (int var6 = 0; var6 < 100; var6++) {
                                    field384[var6] = true;
                                }
                            }
                            while (var5-- > 0) {
                                int var7 = field313.method2144();
                                int var8 = field313.method2136();
                                int var9 = field313.method2134();
                                class4 var10 = (class4) field462.method3206((long) var7);
                                if (var10 != null && var10.field64 != var8) {
                                    method80(var10, true);
                                    var10 = null;
                                }
                                if (var10 == null) {
                                    var10 = method170(var7, var8, var9);
                                }
                                var10.field63 = true;
                            }
                            for (class4 var11 = (class4) field462.method3220(); var11 != null; var11 = (class4) field462.method3210()) {
                                if (var11.field63) {
                                    var11.field63 = false;
                                } else {
                                    method80(var11, true);
                                }
                            }
                            field472 = new class177(512);
                            while (field313.field1826 < var3) {
                                int var12 = field313.method2144();
                                int var13 = field313.method2136();
                                int var14 = field313.method2136();
                                int var15 = field313.method2144();
                                for (int var16 = var13; var16 <= var14; var16++) {
                                    long var17 = ((long) var12 << 32) + (long) var16;
                                    field472.method3207(new class182(var15), var17);
                                }
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 205) {
                            byte var19 = field313.method2221();
                            int var20 = field313.method2168();
                            class157.field2668[var20] = var19;
                            if (class157.field2671[var20] != var19) {
                                class157.field2671[var20] = var19;
                                method3396(var20);
                            }
                            field439[++field440 - 1 & 0x1F] = var20;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 204) {
                            method88();
                            field297 = -1;
                            var1 = false;
                            break label2713;
                        }
                        if (field297 == 139) {
                            int var21 = field313.method2136();
                            int var22 = field313.method2193();
                            int var23 = field313.method2280();
                            class155 var24 = class155.method1876(var22);
                            var24.field2579 = (var23 << 16) + var21;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 53) {
                            field510 = false;
                            for (int var25 = 0; var25 < 5; var25++) {
                                field261[var25] = false;
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 246) {
                            int var26 = field313.method2168();
                            int var27 = field313.method2238();
                            int var28 = var26 >> 10 & 0x1F;
                            int var29 = var26 >> 5 & 0x1F;
                            int var30 = var26 & 0x1F;
                            int var31 = (var30 << 3) + (var28 << 19) + (var29 << 11);
                            class155 var32 = class155.method1876(var27);
                            if (var32.field2571 != var31) {
                                var32.field2571 = var31;
                                method2073(var32);
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 28) {
                            method519(false);
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 114) {
                            int var33 = field313.method2280();
                            field482 = var33;
                            method668(var33);
                            class33.method2726(field482);
                            for (int var34 = 0; var34 < 100; var34++) {
                                field384[var34] = true;
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 74) {
                            String var35 = field313.method2216();
                            long var36 = field313.method2140();
                            long var38 = (long) field313.method2136();
                            long var40 = (long) field313.method2138();
                            class140[] var42 = new class140[] { class140.field2105, class140.field2098, class140.field2102, class140.field2095, class140.field2094 };
                            class140 var43 = (class140) class100.method70(var42, field313.method2134());
                            long var44 = (var38 << 32) + var40;
                            boolean var46 = false;
                            for (int var47 = 0; var47 < 100; var47++) {
                                if (field295[var47] == var44) {
                                    var46 = true;
                                    break;
                                }
                            }
                            if (var43.field2096 && method2714(var35)) {
                                var46 = true;
                            }
                            if (!var46 && field371 == 0) {
                                field295[field473] = var44;
                                field473 = (field473 + 1) % 100;
                                String var48 = class204.method3443(class211.method3573(class203.method2413(field313)));
                                if (var43.field2100 == -1) {
                                    class10.method1(9, var35, var48, class210.method482(var36));
                                } else {
                                    class10.method1(9, class2.method1882(var43.field2100) + var35, var48, class210.method482(var36));
                                }
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 77) {
                            for (int var49 = 0; var49 < Statics.field2889; var49++) {
                                class47 var50 = class47.method2717(var49);
                                if (var50 != null) {
                                    class157.field2668[var49] = 0;
                                    class157.field2671[var49] = 0;
                                }
                            }
                            method2079();
                            field440 += 32;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 7) {
                            int var51 = field313.method2144();
                            class155 var52 = class155.method1876(var51);
                            for (int var53 = 0; var53 < var52.field2540.length; var53++) {
                                var52.field2540[var53] = -1;
                                var52.field2540[var53] = 0;
                            }
                            method2073(var52);
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 12) {
                            String var54 = field313.method2216();
                            int var55 = field313.method2136();
                            byte var56 = field313.method2229();
                            boolean var57 = false;
                            if (var56 == -128) {
                                var57 = true;
                            }
                            if (var57) {
                                if (Statics.field2064 == 0) {
                                    field297 = -1;
                                    var1 = true;
                                    break label2713;
                                }
                                boolean var58 = false;
                                int var59;
                                for (var59 = 0; var59 < Statics.field2064 && (!Statics.field588[var59].field575.equals(var54) || Statics.field588[var59].field570 != var55); var59++) {
                                }
                                if (var59 < Statics.field2064) {
                                    while (var59 < Statics.field2064 - 1) {
                                        Statics.field588[var59] = Statics.field588[var59 + 1];
                                        var59++;
                                    }
                                    Statics.field2064--;
                                    Statics.field588[Statics.field2064] = null;
                                }
                            } else {
                                field313.method2216();
                                class22 var60 = new class22();
                                var60.field575 = var54;
                                var60.field568 = class212.method2080(var60.field575, Statics.field253);
                                var60.field570 = var55;
                                var60.field571 = var56;
                                int var61;
                                for (var61 = Statics.field2064 - 1; var61 >= 0; var61--) {
                                    int var62 = Statics.field588[var61].field568.compareTo(var60.field568);
                                    if (var62 == 0) {
                                        Statics.field588[var61].field570 = var55;
                                        Statics.field588[var61].field571 = var56;
                                        if (var54.equals(Statics.field524.field51)) {
                                            Statics.field2525 = var56;
                                        }
                                        field355 = field438;
                                        field297 = -1;
                                        var1 = true;
                                        break label2713;
                                    }
                                    if (var62 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field2064 >= Statics.field588.length) {
                                    field297 = -1;
                                    var1 = true;
                                    break label2713;
                                }
                                for (int var63 = Statics.field2064 - 1; var63 > var61; var63--) {
                                    Statics.field588[var63 + 1] = Statics.field588[var63];
                                }
                                if (Statics.field2064 == 0) {
                                    Statics.field588 = new class22[100];
                                }
                                Statics.field588[var61 + 1] = var60;
                                Statics.field2064++;
                                if (var54.equals(Statics.field524.field51)) {
                                    Statics.field2525 = var56;
                                }
                            }
                            field355 = field438;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 144) {
                            int var64 = field313.method2238();
                            int var65 = field313.method2168();
                            class155 var66 = class155.method1876(var64);
                            if (var66.field2569 != 1 || var66.field2650 != var65) {
                                var66.field2569 = 1;
                                var66.field2650 = var65;
                                method2073(var66);
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 63) {
                            String var67 = field313.method2216();
                            long var68 = (long) field313.method2136();
                            long var70 = (long) field313.method2138();
                            class140[] var72 = new class140[] { class140.field2105, class140.field2098, class140.field2102, class140.field2095, class140.field2094 };
                            class140 var73 = (class140) class100.method70(var72, field313.method2134());
                            long var74 = (var68 << 32) + var70;
                            boolean var76 = false;
                            for (int var77 = 0; var77 < 100; var77++) {
                                if (field295[var77] == var74) {
                                    var76 = true;
                                    break;
                                }
                            }
                            if (method2714(var67)) {
                                var76 = true;
                            }
                            if (!var76 && field371 == 0) {
                                field295[field473] = var74;
                                field473 = (field473 + 1) % 100;
                                String var78 = class204.method3443(class211.method3573(class203.method2413(field313)));
                                byte var79;
                                if (var73.field2101) {
                                    var79 = 7;
                                } else {
                                    var79 = 3;
                                }
                                if (var73.field2100 == -1) {
                                    class10.method100(var79, var67, var78);
                                } else {
                                    class10.method100(var79, class2.method1882(var73.field2100) + var67, var78);
                                }
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 79) {
                            boolean var80 = field313.method2134() == 1;
                            if (var80) {
                                Statics.field789 = class104.method1388() - field313.method2140();
                                Statics.field1558 = new class202(field313, true);
                            } else {
                                Statics.field1558 = null;
                            }
                            field288 = field438;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 119) {
                            int var81 = field313.method2331();
                            int var82 = field313.method2136();
                            class155 var83 = class155.method1876(var81);
                            if (var83.field2569 != 2 || var83.field2650 != var82) {
                                var83.field2569 = 2;
                                var83.field2650 = var82;
                                method2073(var83);
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 87) {
                            int var84 = field313.method2227();
                            boolean var85 = field313.method2134() == 1;
                            String var86 = "";
                            boolean var87 = false;
                            if (var85) {
                                var86 = field313.method2216();
                                if (method2714(var86)) {
                                    var87 = true;
                                }
                            }
                            String var88 = field313.method2216();
                            if (!var87) {
                                class10.method100(var84, var86, var88);
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 214) {
                            String var89 = field313.method2216();
                            int var90 = field313.method2160();
                            int var91 = field313.method2160();
                            if (var90 >= 1 && var90 <= 8) {
                                if (var89.equalsIgnoreCase("null")) {
                                    var89 = null;
                                }
                                field298[var90 - 1] = var89;
                                field314[var90 - 1] = var91 == 0;
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 99) {
                            int var92 = field313.method2193();
                            class155 var93 = class155.method1876(var92);
                            var93.field2569 = 3;
                            var93.field2650 = Statics.field524.field36.method2954();
                            method2073(var93);
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 151) {
                            int var94 = field313.method2144();
                            Statics.field2405 = Statics.field122.method2505(var94);
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 145) {
                            int var95 = field313.method2144();
                            int var96 = field313.method2136();
                            if (var95 < -70000) {
                                var96 += 32768;
                            }
                            class155 var97;
                            if (var95 >= 0) {
                                var97 = class155.method1876(var95);
                            } else {
                                var97 = null;
                            }
                            while (field313.field1826 < field448) {
                                int var98 = field313.method2227();
                                int var99 = field313.method2136();
                                int var100 = 0;
                                if (var99 != 0) {
                                    var100 = field313.method2134();
                                    if (var100 == 255) {
                                        var100 = field313.method2144();
                                    }
                                }
                                if (var97 != null && var98 >= 0 && var98 < var97.field2540.length) {
                                    var97.field2540[var98] = var99;
                                    var97.field2643[var98] = var100;
                                }
                                class14.method22(var96, var98, var99 - 1, var100);
                            }
                            if (var97 != null) {
                                method2073(var97);
                            }
                            method2079();
                            field441[++field442 - 1 & 0x1F] = var96 & 0x7FFF;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 54) {
                            if (field482 != -1) {
                                int var101 = field482;
                                if (class155.method128(var101)) {
                                    method2720(Statics.field2621[var101], 0);
                                }
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 46) {
                            field510 = true;
                            Statics.field2918 = field313.method2134();
                            Statics.field127 = field313.method2134();
                            Statics.field2693 = field313.method2136();
                            Statics.field244 = field313.method2134();
                            Statics.field1291 = field313.method2134();
                            if (Statics.field1291 >= 100) {
                                Statics.field666 = Statics.field2918 * 128 + 64;
                                Statics.field557 = Statics.field127 * 128 + 64;
                                Statics.field590 = method77(Statics.field666, Statics.field557, Statics.field168) - Statics.field2693;
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 179) {
                            int var102 = field313.method2134();
                            int var103 = field313.method2134();
                            int var104 = field313.method2134();
                            int var105 = field313.method2134();
                            field261[var102] = true;
                            field501[var102] = var103;
                            field502[var102] = var104;
                            field343[var102] = var105;
                            field504[var102] = 0;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 101) {
                            int var106 = field313.method2168();
                            if (var106 == 65535) {
                                var106 = -1;
                            }
                            method106(var106);
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 129) {
                            int var107 = field313.method2280();
                            if (var107 == 65535) {
                                var107 = -1;
                            }
                            int var108 = field313.method2171();
                            method2862(var107, var108);
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 100) {
                            class111 var109 = field313;
                            int var110 = field448;
                            class191 var111 = new class191();
                            var111.field2891 = var109.method2134();
                            var111.field2893 = var109.method2144();
                            var111.field2892 = new int[var111.field2891];
                            var111.field2898 = new int[var111.field2891];
                            var111.field2890 = new Field[var111.field2891];
                            var111.field2895 = new int[var111.field2891];
                            var111.field2896 = new Method[var111.field2891];
                            var111.field2897 = new byte[var111.field2891][][];
                            for (int var112 = 0; var112 < var111.field2891; var112++) {
                                try {
                                    int var113 = var109.method2134();
                                    if (var113 == 0 || var113 == 1 || var113 == 2) {
                                        String var114 = var109.method2216();
                                        String var115 = var109.method2216();
                                        int var116 = 0;
                                        if (var113 == 1) {
                                            var116 = var109.method2144();
                                        }
                                        var111.field2892[var112] = var113;
                                        var111.field2895[var112] = var116;
                                        if (class192.method2721(var114).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        var111.field2890[var112] = class192.method2721(var114).getDeclaredField(var115);
                                    } else if (var113 == 3 || var113 == 4) {
                                        String var117 = var109.method2216();
                                        String var118 = var109.method2216();
                                        int var119 = var109.method2134();
                                        String[] var120 = new String[var119];
                                        for (int var121 = 0; var121 < var119; var121++) {
                                            var120[var121] = var109.method2216();
                                        }
                                        String var122 = var109.method2216();
                                        byte[][] var123 = new byte[var119][];
                                        if (var113 == 3) {
                                            for (int var124 = 0; var124 < var119; var124++) {
                                                int var125 = var109.method2144();
                                                var123[var124] = new byte[var125];
                                                var109.method2145(var123[var124], 0, var125);
                                            }
                                        }
                                        var111.field2892[var112] = var113;
                                        Class[] var126 = new Class[var119];
                                        for (int var127 = 0; var127 < var119; var127++) {
                                            var126[var127] = class192.method2721(var120[var127]);
                                        }
                                        Class var128 = class192.method2721(var122);
                                        if (class192.method2721(var117).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        Method[] var129 = class192.method2721(var117).getDeclaredMethods();
                                        Method[] var130 = var129;
                                        for (int var131 = 0; var131 < var130.length; var131++) {
                                            Method var132 = var130[var131];
                                            if (var132.getName().equals(var118)) {
                                                Class[] var133 = var132.getParameterTypes();
                                                if (var126.length == var133.length) {
                                                    boolean var134 = true;
                                                    for (int var135 = 0; var135 < var126.length; var135++) {
                                                        if (var126[var135] != var133[var135]) {
                                                            var134 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (var134 && var128 == var132.getReturnType()) {
                                                        var111.field2896[var112] = var132;
                                                    }
                                                }
                                            }
                                        }
                                        var111.field2897[var112] = var123;
                                    }
                                } catch (ClassNotFoundException var415) {
                                    var111.field2898[var112] = -1;
                                } catch (SecurityException var416) {
                                    var111.field2898[var112] = -2;
                                } catch (NullPointerException var417) {
                                    var111.field2898[var112] = -3;
                                } catch (Exception var418) {
                                    var111.field2898[var112] = -4;
                                } catch (Throwable var419) {
                                    var111.field2898[var112] = -5;
                                }
                            }
                            class192.field2900.method3284(var111);
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 141) {
                            String var141 = field313.method2216();
                            String var142 = class204.method3443(class211.method3573(class203.method2413(field313)));
                            class10.method100(6, var141, var142);
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 82) {
                            field365 = field313.method2166() * 30;
                            field450 = field438;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 39) {
                            method140();
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 228) {
                            field370 = field313.method2134();
                            if (field370 == 255) {
                                field370 = 0;
                            }
                            field457 = field313.method2134();
                            if (field457 == 255) {
                                field457 = 0;
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 83) {
                            String var143 = field313.method2216();
                            Object[] var144 = new Object[var143.length() + 1];
                            for (int var145 = var143.length() - 1; var145 >= 0; var145--) {
                                if (var143.charAt(var145) == 's') {
                                    var144[var145 + 1] = field313.method2216();
                                } else {
                                    var144[var145 + 1] = Integer.valueOf(field313.method2144());
                                }
                            }
                            var144[0] = Integer.valueOf(field313.method2144());
                            class1 var146 = new class1();
                            var146.field8 = var144;
                            class33.method1613(var146);
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 93) {
                            String var147 = field313.method2216();
                            int var148 = field313.method2331();
                            class155 var149 = class155.method1876(var148);
                            if (!var147.equals(var149.field2596)) {
                                var149.field2596 = var147;
                                method2073(var149);
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 161) {
                            int var150 = field313.method2166();
                            if (var150 == 65535) {
                                var150 = -1;
                            }
                            int var151 = field313.method2238();
                            int var152 = field313.method2193();
                            class155 var153 = class155.method1876(var152);
                            if (var153.field2536) {
                                var153.field2644 = var150;
                                var153.field2645 = var151;
                                class46 var155 = class46.method114(var150);
                                var153.field2529 = var155.field1041;
                                var153.field2578 = var155.field1015;
                                var153.field2632 = var155.field1031;
                                var153.field2575 = var155.field1032;
                                var153.field2583 = var155.field1027;
                                var153.field2580 = var155.field1016;
                                if (var155.field1034 == 1) {
                                    var153.field2614 = 1;
                                } else {
                                    var153.field2614 = 2;
                                }
                                if (var153.field2546 > 0) {
                                    var153.field2580 = var153.field2580 * 32 / var153.field2546;
                                }
                                method2073(var153);
                            } else {
                                if (var150 == -1) {
                                    var153.field2569 = 0;
                                    field297 = -1;
                                    var1 = true;
                                    break label2713;
                                }
                                class46 var154 = class46.method114(var150);
                                var153.field2569 = 4;
                                var153.field2650 = var150;
                                var153.field2529 = var154.field1041;
                                var153.field2578 = var154.field1015;
                                var153.field2580 = var154.field1016 * 100 / var151;
                                method2073(var153);
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 86) {
                            field390 = field313.method2134();
                            if (field390 == 1) {
                                field331 = field313.method2136();
                            }
                            if (field390 >= 2 && field390 <= 6) {
                                if (field390 == 2) {
                                    field274 = 64;
                                    field460 = 64;
                                }
                                if (field390 == 3) {
                                    field274 = 0;
                                    field460 = 64;
                                }
                                if (field390 == 4) {
                                    field274 = 128;
                                    field460 = 64;
                                }
                                if (field390 == 5) {
                                    field274 = 64;
                                    field460 = 0;
                                }
                                if (field390 == 6) {
                                    field274 = 64;
                                    field460 = 128;
                                }
                                field390 = 2;
                                field271 = field313.method2136();
                                field385 = field313.method2136();
                                field273 = field313.method2134();
                            }
                            if (field390 == 10) {
                                field270 = field313.method2136();
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 203) {
                            method26(true);
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 178) {
                            while (field313.field1826 < field448) {
                                boolean var156 = field313.method2134() == 1;
                                String var157 = field313.method2216();
                                String var158 = field313.method2216();
                                int var159 = field313.method2136();
                                int var160 = field313.method2134();
                                int var161 = field313.method2134();
                                boolean var162 = (var161 & 0x2) != 0;
                                boolean var163 = (var161 & 0x1) != 0;
                                if (var159 > 0) {
                                    field313.method2216();
                                    field313.method2134();
                                    field313.method2144();
                                }
                                field313.method2216();
                                for (int var164 = 0; var164 < field505; var164++) {
                                    class16 var165 = field507[var164];
                                    if (var156) {
                                        if (var158.equals(var165.field228)) {
                                            var165.field228 = var157;
                                            var165.field222 = var158;
                                            var157 = null;
                                            break;
                                        }
                                    } else if (var157.equals(var165.field228)) {
                                        if (var165.field223 != var159) {
                                            boolean var166 = true;
                                            for (class35 var167 = (class35) field508.method3196(); var167 != null; var167 = (class35) field508.method3197()) {
                                                if (var167.field790.equals(var157)) {
                                                    if (var159 != 0 && var167.field791 == 0) {
                                                        var167.method3331();
                                                        var166 = false;
                                                    } else if (var159 == 0 && var167.field791 != 0) {
                                                        var167.method3331();
                                                        var166 = false;
                                                    }
                                                }
                                            }
                                            if (var166) {
                                                field508.method3195(new class35(var157, var159));
                                            }
                                            var165.field223 = var159;
                                        }
                                        var165.field222 = var158;
                                        var165.field224 = var160;
                                        var165.field227 = var162;
                                        var165.field226 = var163;
                                        var157 = null;
                                        break;
                                    }
                                }
                                if (var157 != null && field505 < 400) {
                                    class16 var168 = new class16();
                                    field507[field505] = var168;
                                    var168.field228 = var157;
                                    var168.field222 = var158;
                                    var168.field223 = var159;
                                    var168.field224 = var160;
                                    var168.field227 = var162;
                                    var168.field226 = var163;
                                    field505++;
                                }
                            }
                            field506 = 2;
                            field446 = field438;
                            boolean var169 = false;
                            int var170 = field505;
                            while (var170 > 0) {
                                boolean var171 = true;
                                var170--;
                                for (int var172 = 0; var172 < var170; var172++) {
                                    boolean var173 = false;
                                    class16 var174 = field507[var172];
                                    class16 var175 = field507[var172 + 1];
                                    if (field248 != var174.field223 && field248 == var175.field223) {
                                        var173 = true;
                                    }
                                    if (!var173 && var174.field223 == 0 && var175.field223 != 0) {
                                        var173 = true;
                                    }
                                    if (!var173 && !var174.field227 && var175.field227) {
                                        var173 = true;
                                    }
                                    if (!var173 && !var174.field226 && var175.field226) {
                                        var173 = true;
                                    }
                                    if (var173) {
                                        class16 var176 = field507[var172];
                                        field507[var172] = field507[var172 + 1];
                                        field507[var172 + 1] = var176;
                                        var171 = false;
                                    }
                                }
                                if (var171) {
                                    break;
                                }
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 90) {
                            class23 var177 = new class23();
                            var177.field581 = field313.method2216();
                            var177.field584 = field313.method2136();
                            int var178 = field313.method2144();
                            var177.field589 = var178;
                            method127(45);
                            Statics.field605.method2601();
                            Statics.field605 = null;
                            class29.method503(var177);
                            field297 = -1;
                            var1 = false;
                            break label2713;
                        }
                        if (field297 == 121) {
                            field510 = true;
                            Statics.field703 = field313.method2134();
                            Statics.field919 = field313.method2134();
                            Statics.field1815 = field313.method2136();
                            Statics.field2093 = field313.method2134();
                            Statics.field1441 = field313.method2134();
                            if (Statics.field1441 >= 100) {
                                int var179 = Statics.field703 * 128 + 64;
                                int var180 = Statics.field919 * 128 + 64;
                                int var181 = method77(var179, var180, Statics.field168) - Statics.field1815;
                                int var182 = var179 - Statics.field666;
                                int var183 = var181 - Statics.field590;
                                int var184 = var180 - Statics.field557;
                                int var185 = (int) Math.sqrt((double) (var182 * var182 + var184 * var184));
                                Statics.field54 = (int) (Math.atan2((double) var183, (double) var185) * 325.949D) & 0x7FF;
                                Statics.field220 = (int) (Math.atan2((double) var182, (double) var184) * -325.949D) & 0x7FF;
                                if (Statics.field54 < 128) {
                                    Statics.field54 = 128;
                                }
                                if (Statics.field54 > 383) {
                                    Statics.field54 = 383;
                                }
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 120) {
                            int var186 = field313.method2280();
                            int var187 = field313.method2136();
                            int var188 = field313.method2168();
                            int var189 = field313.method2193();
                            class155 var190 = class155.method1876(var189);
                            if (var190.field2529 != var188 || var190.field2578 != var187 || var190.field2580 != var186) {
                                var190.field2529 = var188;
                                var190.field2578 = var187;
                                var190.field2580 = var186;
                                method2073(var190);
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 33) {
                            int var191 = field313.method2288();
                            int var192 = field313.method2193();
                            class155 var193 = class155.method1876(var192);
                            if (var193.field2573 != var191 || var191 == -1) {
                                var193.field2573 = var191;
                                var193.field2564 = 0;
                                var193.field2611 = 0;
                                method2073(var193);
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 187) {
                            int var194 = field313.method2168();
                            int var195 = field313.method2238();
                            class157.field2668[var194] = var195;
                            if (class157.field2671[var194] != var195) {
                                class157.field2671[var194] = var195;
                                method3396(var194);
                            }
                            field439[++field440 - 1 & 0x1F] = var194;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 132) {
                            Statics.field187 = field313.method2134();
                            Statics.field621 = field313.method2134();
                            for (int var196 = Statics.field621; var196 < Statics.field621 + 8; var196++) {
                                for (int var197 = Statics.field187; var197 < Statics.field187 + 8; var197++) {
                                    if (field387[Statics.field168][var196][var197] != null) {
                                        field387[Statics.field168][var196][var197] = null;
                                        method533(var196, var197);
                                    }
                                }
                            }
                            for (class15 var198 = (class15) field485.method3249(); var198 != null; var198 = (class15) field485.method3248()) {
                                if (var198.field209 >= Statics.field621 && var198.field209 < Statics.field621 + 8 && var198.field210 >= Statics.field187 && var198.field210 < Statics.field187 + 8 && Statics.field168 == var198.field217) {
                                    var198.field216 = 0;
                                }
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 233) {
                            for (int var199 = 0; var199 < class157.field2671.length; var199++) {
                                if (class157.field2671[var199] != class157.field2668[var199]) {
                                    class157.field2671[var199] = class157.field2668[var199];
                                    method3396(var199);
                                    field439[++field440 - 1 & 0x1F] = var199;
                                }
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 69) {
                            field487 = field313.method2134();
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 243) {
                            field355 = field438;
                            if (field448 == 0) {
                                field478 = null;
                                field479 = null;
                                Statics.field2064 = 0;
                                Statics.field588 = null;
                                field297 = -1;
                                var1 = true;
                            } else {
                                field479 = field313.method2216();
                                long var200 = field313.method2140();
                                long var202 = var200;
                                String var204;
                                if (var200 <= 0L || var200 >= 6582952005840035281L) {
                                    var204 = null;
                                } else if (var200 % 37L == 0L) {
                                    var204 = null;
                                } else {
                                    int var205 = 0;
                                    for (long var206 = var200; var206 != 0L; var206 /= 37L) {
                                        var205++;
                                    }
                                    StringBuilder var208 = new StringBuilder(var205);
                                    while (var202 != 0L) {
                                        long var209 = var202;
                                        var202 /= 37L;
                                        var208.append(class210.field3008[(int) (var209 - var202 * 37L)]);
                                    }
                                    var204 = var208.reverse().toString();
                                }
                                field478 = var204;
                                Statics.field1272 = field313.method2229();
                                int var211 = field313.method2134();
                                if (var211 == 255) {
                                    field297 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field2064 = var211;
                                    class22[] var212 = new class22[100];
                                    for (int var213 = 0; var213 < Statics.field2064; var213++) {
                                        var212[var213] = new class22();
                                        var212[var213].field575 = field313.method2216();
                                        var212[var213].field568 = class212.method2080(var212[var213].field575, Statics.field253);
                                        var212[var213].field570 = field313.method2136();
                                        var212[var213].field571 = field313.method2229();
                                        field313.method2216();
                                        if (var212[var213].field575.equals(Statics.field524.field51)) {
                                            Statics.field2525 = var212[var213].field571;
                                        }
                                    }
                                    boolean var214 = false;
                                    int var215 = Statics.field2064;
                                    while (var215 > 0) {
                                        boolean var216 = true;
                                        var215--;
                                        for (int var217 = 0; var217 < var215; var217++) {
                                            if (var212[var217].field568.compareTo(var212[var217 + 1].field568) > 0) {
                                                class22 var218 = var212[var217];
                                                var212[var217] = var212[var217 + 1];
                                                var212[var217 + 1] = var218;
                                                var216 = false;
                                            }
                                        }
                                        if (var216) {
                                            break;
                                        }
                                    }
                                    Statics.field588 = var212;
                                    field297 = -1;
                                    var1 = true;
                                }
                            }
                            break label2713;
                        }
                        if (field297 == 104) {
                            method2079();
                            field420 = field313.method2137();
                            field450 = field438;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 206) {
                            int var219 = field313.method2144();
                            int var220 = field313.method2136();
                            if (var219 < -70000) {
                                var220 += 32768;
                            }
                            class155 var221;
                            if (var219 >= 0) {
                                var221 = class155.method1876(var219);
                            } else {
                                var221 = null;
                            }
                            if (var221 != null) {
                                for (int var222 = 0; var222 < var221.field2540.length; var222++) {
                                    var221.field2540[var222] = 0;
                                    var221.field2643[var222] = 0;
                                }
                            }
                            class14 var223 = (class14) class14.field194.method3206((long) var220);
                            if (var223 != null) {
                                for (int var224 = 0; var224 < var223.field203.length; var224++) {
                                    var223.field203[var224] = -1;
                                    var223.field196[var224] = 0;
                                }
                            }
                            int var225 = field313.method2136();
                            for (int var226 = 0; var226 < var225; var226++) {
                                int var227 = field313.method2168();
                                int var228 = field313.method2158();
                                if (var228 == 255) {
                                    var228 = field313.method2144();
                                }
                                if (var221 != null && var226 < var221.field2540.length) {
                                    var221.field2540[var226] = var227;
                                    var221.field2643[var226] = var228;
                                }
                                class14.method22(var220, var226, var227 - 1, var228);
                            }
                            if (var221 != null) {
                                method2073(var221);
                            }
                            method2079();
                            field441[++field442 - 1 & 0x1F] = var220 & 0x7FFF;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 180) {
                            method2079();
                            field419 = field313.method2134();
                            field450 = field438;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 106) {
                            int var229 = field313.method2134();
                            class119[] var230 = new class119[] { class119.field1900, class119.field1905, class119.field1911 };
                            class119[] var231 = var230;
                            int var232 = 0;
                            class119 var234;
                            while (true) {
                                if (var232 >= var231.length) {
                                    var234 = null;
                                    break;
                                }
                                class119 var233 = var231[var232];
                                if (var233.field1902 == var229) {
                                    var234 = var233;
                                    break;
                                }
                                var232++;
                            }
                            Statics.field2478 = var234;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 71) {
                            int var235 = field313.method2280();
                            int var236 = field313.method2193();
                            class155 var237 = class155.method1876(var236);
                            if (var237 != null && var237.field2539 == 0) {
                                if (var235 > var237.field2553 - var237.field2555) {
                                    var235 = var237.field2553 - var237.field2555;
                                }
                                if (var235 < 0) {
                                    var235 = 0;
                                }
                                if (var237.field2558 != var235) {
                                    var237.field2558 = var235;
                                    method2073(var237);
                                }
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 9) {
                            int var238 = field313.method2169();
                            int var239 = field313.method2331();
                            int var240 = field313.method2137();
                            class155 var241 = class155.method1876(var239);
                            int var242 = var241.field2622 + var240;
                            int var243 = var241.field2545 + var238;
                            if (var241.field2542 != var242 || var241.field2607 != var243) {
                                var241.field2542 = var242;
                                var241.field2607 = var243;
                                method2073(var241);
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 211) {
                            method2079();
                            int var244 = field313.method2331();
                            int var245 = field313.method2159();
                            int var246 = field313.method2134();
                            field269[var245] = var244;
                            field391[var245] = var246;
                            field285[var245] = 1;
                            for (int var247 = 0; var247 < 98; var247++) {
                                if (var244 >= class143.field2134[var247]) {
                                    field285[var245] = var247 + 2;
                                }
                            }
                            field443[++field444 - 1 & 0x1F] = var245;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 216) {
                            field469 = field313.method2134();
                            field470 = field313.method2134();
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 24) {
                            int var248 = field313.method2238();
                            int var249 = field313.method2238();
                            int var250 = field313.method2136();
                            if (var250 == 65535) {
                                var250 = -1;
                            }
                            int var251 = field313.method2136();
                            if (var251 == 65535) {
                                var251 = -1;
                            }
                            for (int var252 = var250; var252 <= var251; var252++) {
                                long var253 = ((long) var248 << 32) + (long) var252;
                                class189 var255 = field472.method3206(var253);
                                if (var255 != null) {
                                    var255.method3334();
                                }
                                field472.method3207(new class182(var249), var253);
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 245) {
                            int var256 = field313.method2158();
                            int var257 = field313.method2193();
                            int var258 = field313.method2168();
                            class4 var259 = (class4) field462.method3206((long) var257);
                            if (var259 != null) {
                                method80(var259, var259.field64 != var258);
                            }
                            method170(var257, var258, var256);
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 20) {
                            for (int var260 = 0; var260 < field372.length; var260++) {
                                if (field372[var260] != null) {
                                    field372[var260].field758 = -1;
                                }
                            }
                            for (int var261 = 0; var261 < field289.length; var261++) {
                                if (field289[var261] != null) {
                                    field289[var261].field758 = -1;
                                }
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 152) {
                            Statics.field187 = field313.method2159();
                            Statics.field621 = field313.method2158();
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 235) {
                            method26(false);
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 94) {
                            int var262 = field313.method2280();
                            class14 var263 = (class14) class14.field194.method3206((long) var262);
                            if (var263 != null) {
                                var263.method3334();
                            }
                            field441[++field442 - 1 & 0x1F] = var262 & 0x7FFF;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 21) {
                            field313.field1826 += 28;
                            if (field313.method2186()) {
                                class111 var264 = field313;
                                int var265 = field313.field1826 - 28;
                                if (class138.field2073 != null) {
                                    try {
                                        class138.field2073.method3549(0L);
                                        class138.field2073.method3554(var264.field1830, var265, 24);
                                    } catch (Exception var413) {
                                    }
                                }
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 236 || field297 == 133 || field297 == 242 || field297 == 196 || field297 == 241 || field297 == 188 || field297 == 89 || field297 == 248 || field297 == 15 || field297 == 136) {
                            method123();
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 176) {
                            Statics.field621 = field313.method2159();
                            Statics.field187 = field313.method2134();
                            while (field313.field1826 < field448) {
                                field297 = field313.method2134();
                                method123();
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 42) {
                            int var267 = field313.method2193();
                            boolean var268 = field313.method2160() == 1;
                            class155 var269 = class155.method1876(var267);
                            if (var269.field2549 != var268) {
                                var269.field2549 = var268;
                                method2073(var269);
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 140) {
                            while (field313.field1826 < field448) {
                                int var270 = field313.method2134();
                                boolean var271 = (var270 & 0x1) == 1;
                                String var272 = field313.method2216();
                                String var273 = field313.method2216();
                                field313.method2216();
                                for (int var274 = 0; var274 < field509; var274++) {
                                    class8 var275 = field260[var274];
                                    if (var271) {
                                        if (var273.equals(var275.field131)) {
                                            var275.field131 = var272;
                                            var275.field128 = var273;
                                            var272 = null;
                                            break;
                                        }
                                    } else if (var272.equals(var275.field131)) {
                                        var275.field131 = var272;
                                        var275.field128 = var273;
                                        var272 = null;
                                        break;
                                    }
                                }
                                if (var272 != null && field509 < 400) {
                                    class8 var276 = new class8();
                                    field260[field509] = var276;
                                    var276.field131 = var272;
                                    var276.field128 = var273;
                                    field509++;
                                }
                            }
                            field446 = field438;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 250) {
                            int var277 = field313.method2134();
                            if (field313.method2134() == 0) {
                                field514[var277] = new class201();
                                field313.field1826 += 18;
                            } else {
                                field313.field1826--;
                                field514[var277] = new class201(field313, false);
                            }
                            field421 = field438;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 57) {
                            field506 = 1;
                            field446 = field438;
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 16) {
                            int var278 = field313.method2134();
                            int var279 = field313.method2159();
                            int var280 = field313.method2159();
                            Statics.field168 = var279 >> 1;
                            Statics.field524.method578(var280, var278, (var279 & 0x1) == 1);
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 47) {
                            method519(true);
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 190) {
                            int var281 = field313.method2144();
                            class4 var282 = (class4) field462.method3206((long) var281);
                            if (var282 != null) {
                                method80(var282, true);
                            }
                            if (field477 != null) {
                                method2073(field477);
                                field477 = null;
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        if (field297 == 96) {
                            int var283 = field313.method2136();
                            int var284 = field313.method2134();
                            int var285 = field313.method2136();
                            if (field491 != 0 && var284 != 0 && field432 < 50) {
                                field494[field432] = var283;
                                field367[field432] = var284;
                                field496[field432] = var285;
                                field406[field432] = null;
                                field497[field432] = 0;
                                field432++;
                            }
                            field297 = -1;
                            var1 = true;
                            break label2713;
                        }
                        class137.method880("" + field297 + class2.field19 + field302 + class2.field19 + field303 + class2.field19 + field448, (Throwable) null);
                        method88();
                    } catch (IOException var420) {
                        method2494();
                    } catch (Exception var421) {
                        String var291 = "" + field297 + class2.field19 + field302 + class2.field19 + field303 + class2.field19 + field448 + class2.field19 + (Statics.field1789 + Statics.field524.field760[0]) + class2.field19 + (Statics.field1571 + Statics.field524.field776[0]) + class2.field19;
                        for (int var292 = 0; var292 < field448 && var292 < 50; var292++) {
                            var291 = var291 + field313.field1830[var292] + class2.field19;
                        }
                        class137.method880(var291, var421);
                        method88();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field257 != 30) {
            return;
        }
        while (true) {
            class191 var293 = (class191) class192.field2900.method3285();
            boolean var294;
            if (var293 == null) {
                var294 = false;
            } else {
                var294 = true;
            }
            if (!var294) {
                Object var296 = Statics.field267.field177;
                synchronized (Statics.field267.field177) {
                    if (!field324) {
                        Statics.field267.field179 = 0;
                    } else if (class129.field1986 != 0 || Statics.field267.field179 >= 40) {
                        field486.method2376(224);
                        field486.method2120(0);
                        int var297 = field486.field1826;
                        int var298 = 0;
                        for (int var299 = 0; var299 < Statics.field267.field179 && field486.field1826 - var297 < 240; var299++) {
                            var298++;
                            int var300 = Statics.field267.field181[var299];
                            if (var300 < 0) {
                                var300 = 0;
                            } else if (var300 > 502) {
                                var300 = 502;
                            }
                            int var301 = Statics.field267.field180[var299];
                            if (var301 < 0) {
                                var301 = 0;
                            } else if (var301 > 764) {
                                var301 = 764;
                            }
                            int var302 = var300 * 765 + var301;
                            if (Statics.field267.field181[var299] == -1 && Statics.field267.field180[var299] == -1) {
                                var301 = -1;
                                var300 = -1;
                                var302 = 524287;
                            }
                            if (field262 != var301 || field263 != var300) {
                                int var303 = var301 - field262;
                                field262 = var301;
                                int var304 = var300 - field263;
                                field263 = var300;
                                if (field264 < 8 && var303 >= -32 && var303 <= 31 && var304 >= -32 && var304 <= 31) {
                                    var303 += 32;
                                    var304 += 32;
                                    field486.method2121((field264 << 12) + (var303 << 6) + var304);
                                    field264 = 0;
                                } else if (field264 < 8) {
                                    field486.method2152((field264 << 19) + 8388608 + var302);
                                    field264 = 0;
                                } else {
                                    field486.method2123((field264 << 19) + -1073741824 + var302);
                                    field264 = 0;
                                }
                            } else if (field264 < 2047) {
                                field264++;
                            }
                        }
                        field486.method2255(field486.field1826 - var297);
                        if (var298 >= Statics.field267.field179) {
                            Statics.field267.field179 = 0;
                        } else {
                            Statics.field267.field179 -= var298;
                            for (int var305 = 0; var305 < Statics.field267.field179; var305++) {
                                Statics.field267.field180[var305] = Statics.field267.field180[var298 + var305];
                                Statics.field267.field181[var305] = Statics.field267.field181[var298 + var305];
                            }
                        }
                    }
                }
                if (class129.field1986 == 1 || !Statics.field2089 && class129.field1986 == 4 || class129.field1986 == 2) {
                    long var307 = (class129.field2001 - field328) / 50L;
                    if (var307 > 4095L) {
                        var307 = 4095L;
                    }
                    field328 = class129.field2001;
                    int var309 = class129.field2000;
                    if (var309 < 0) {
                        var309 = 0;
                    } else if (var309 > 502) {
                        var309 = 502;
                    }
                    int var310 = class129.field1999;
                    if (var310 < 0) {
                        var310 = 0;
                    } else if (var310 > 764) {
                        var310 = 764;
                    }
                    int var311 = var309 * 765 + var310;
                    byte var312 = 0;
                    if (class129.field1986 == 2) {
                        var312 = 1;
                    }
                    int var313 = (int) var307;
                    field486.method2376(183);
                    field486.method2123((var312 << 19) + (var313 << 20) + var311);
                }
                if (class126.field1964 > 0) {
                    field486.method2376(115);
                    field486.method2121(0);
                    int var314 = field486.field1826;
                    long var315 = class104.method1388();
                    for (int var317 = 0; var317 < class126.field1964; var317++) {
                        long var318 = var315 - field458;
                        if (var318 > 16777215L) {
                            var318 = 16777215L;
                        }
                        field458 = var315;
                        field486.method2152((int) var318);
                        field486.method2156(class126.field1950[var317]);
                    }
                    field486.method2129(field486.field1826 - var314);
                }
                if (field342 > 0) {
                    field342--;
                }
                if (class126.field1957[96] || class126.field1957[97] || class126.field1957[98] || class126.field1957[99]) {
                    field500 = true;
                }
                if (field500 && field342 <= 0) {
                    field342 = 20;
                    field500 = false;
                    field486.method2376(215);
                    field486.method2311(field336);
                    field486.method2311(field363);
                }
                if (Statics.field578 && !field265) {
                    field265 = true;
                    field486.method2376(45);
                    field486.method2120(1);
                }
                if (!Statics.field578 && field265) {
                    field265 = false;
                    field486.method2376(45);
                    field486.method2120(0);
                }
                if (field255 && Statics.field168 != field306) {
                    method119(Statics.field2687, Statics.field1921, Statics.field168, Statics.field524.field760[0], Statics.field524.field776[0]);
                } else if (Statics.field168 != field358) {
                    field358 = Statics.field168;
                    int var320 = Statics.field168;
                    int[] var321 = Statics.field889.field1298;
                    int var322 = var321.length;
                    for (int var323 = 0; var323 < var322; var323++) {
                        var321[var323] = 0;
                    }
                    for (int var324 = 1; var324 < 103; var324++) {
                        int var325 = (103 - var324) * 2048 + 24628;
                        for (int var326 = 1; var326 < 103; var326++) {
                            if ((class6.field77[var320][var326][var324] & 0x18) == 0) {
                                Statics.field2127.method1655(var321, var325, 512, var320, var326, var324);
                            }
                            if (var320 < 3 && (class6.field77[var320 + 1][var326][var324] & 0x8) != 0) {
                                Statics.field2127.method1655(var321, var325, 512, var320 + 1, var326, var324);
                            }
                            var325 += 4;
                        }
                    }
                    int var327 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var328 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field889.method1503();
                    for (int var329 = 1; var329 < 103; var329++) {
                        for (int var330 = 1; var330 < 103; var330++) {
                            if ((class6.field77[var320][var330][var329] & 0x18) == 0) {
                                method466(var320, var330, var329, var327, var328);
                            }
                            if (var320 < 3 && (class6.field77[var320 + 1][var330][var329] & 0x8) != 0) {
                                method466(var320 + 1, var330, var329, var327, var328);
                            }
                        }
                    }
                    field481 = 0;
                    for (int var331 = 0; var331 < 104; var331++) {
                        for (int var332 = 0; var332 < 104; var332++) {
                            int var333 = Statics.field2127.method1638(Statics.field168, var331, var332);
                            if (var333 != 0) {
                                int var334 = var333 >> 14 & 0x7FFF;
                                int var335 = class37.method1041(var334).field860;
                                if (var335 >= 0) {
                                    int var336 = var331;
                                    int var337 = var332;
                                    if (var335 != 22 && var335 != 29 && var335 != 34 && var335 != 36 && var335 != 46 && var335 != 47 && var335 != 48) {
                                        int[][] var338 = field312[Statics.field168].field3007;
                                        for (int var339 = 0; var339 < 10; var339++) {
                                            int var340 = (int) (Math.random() * 4.0D);
                                            if (var340 == 0 && var336 > 0 && var336 > var331 - 3 && (var338[var336 - 1][var337] & 0x1240108) == 0) {
                                                var336--;
                                            }
                                            if (var340 == 1 && var336 < 103 && var336 < var331 + 3 && (var338[var336 + 1][var337] & 0x1240180) == 0) {
                                                var336++;
                                            }
                                            if (var340 == 2 && var337 > 0 && var337 > var332 - 3 && (var338[var336][var337 - 1] & 0x1240102) == 0) {
                                                var337--;
                                            }
                                            if (var340 == 3 && var337 < 103 && var337 < var332 + 3 && (var338[var336][var337 + 1] & 0x1240120) == 0) {
                                                var337++;
                                            }
                                        }
                                    }
                                    field484[field481] = Statics.field1286[var335];
                                    field366[field481] = var336;
                                    field483[field481] = var337;
                                    field481++;
                                }
                            }
                        }
                    }
                    Statics.field1120.method1417();
                }
                if (field257 != 30) {
                    return;
                }
                method3391();
                int var10002;
                for (int var341 = 0; var341 < field432; var341++) {
                    var10002 = field496[var341]--;
                    if (field496[var341] >= -10) {
                        class53 var343 = field406[var341];
                        if (var343 == null) {
                            class53 var422 = (class53) null;
                            var343 = class53.method1058(Statics.field1284, field494[var341], 0);
                            if (var343 == null) {
                                continue;
                            }
                            field496[var341] += var343.method1056();
                            field406[var341] = var343;
                        }
                        if (field496[var341] < 0) {
                            int var350;
                            if (field497[var341] == 0) {
                                var350 = field491;
                            } else {
                                int var344 = (field497[var341] & 0xFF) * 128;
                                int var345 = field497[var341] >> 16 & 0xFF;
                                int var346 = var345 * 128 + 64 - Statics.field524.field780;
                                if (var346 < 0) {
                                    var346 = -var346;
                                }
                                int var347 = field497[var341] >> 8 & 0xFF;
                                int var348 = var347 * 128 + 64 - Statics.field524.field727;
                                if (var348 < 0) {
                                    var348 = -var348;
                                }
                                int var349 = var346 + var348 - 128;
                                if (var349 > var344) {
                                    field496[var341] = -100;
                                    continue;
                                }
                                if (var349 < 0) {
                                    var349 = 0;
                                }
                                var350 = field492 * (var344 - var349) / var344;
                            }
                            if (var350 > 0) {
                                class57 var351 = var343.method1057().method1087(Statics.field982);
                                class59 var352 = class59.method1110(var351, 100, var350);
                                var352.method1152(field367[var341] - 1);
                                Statics.field1750.method956(var352);
                            }
                            field496[var341] = -100;
                        }
                    } else {
                        field432--;
                        for (int var342 = var341; var342 < field432; var342++) {
                            field494[var342] = field494[var342 + 1];
                            field406[var342] = field406[var342 + 1];
                            field367[var342] = field367[var342 + 1];
                            field496[var342] = field496[var342 + 1];
                            field497[var342] = field497[var342 + 1];
                        }
                        var341--;
                    }
                }
                if (field490) {
                    boolean var353;
                    if (class164.field2727 == 0) {
                        var353 = Statics.field2675.method3063();
                    } else {
                        var353 = true;
                    }
                    if (!var353) {
                        if (field488 != 0 && field489 != -1) {
                            class164.method1981(Statics.field1503, field489, 0, field488, false);
                        }
                        field490 = false;
                    }
                }
                field498++;
                if (field498 > 750) {
                    method2494();
                    return;
                }
                method136();
                for (int var354 = 0; var354 < field290; var354++) {
                    int var355 = field291[var354];
                    class31 var356 = field289[var355];
                    if (var356 != null) {
                        method131(var356, var356.field699.field804);
                    }
                }
                for (int var357 = -1; var357 < field373; var357++) {
                    int var358;
                    if (var357 == -1) {
                        var358 = 2047;
                    } else {
                        var358 = field296[var357];
                    }
                    class3 var359 = field372[var358];
                    if (var359 != null && var359.field743 > 0) {
                        var359.field743--;
                        if (var359.field743 == 0) {
                            var359.field740 = null;
                        }
                    }
                }
                for (int var360 = 0; var360 < field290; var360++) {
                    int var361 = field291[var360];
                    class31 var362 = field289[var361];
                    if (var362 != null && var362.field743 > 0) {
                        var362.field743--;
                        if (var362.field743 == 0) {
                            var362.field740 = null;
                        }
                    }
                }
                field375++;
                if (field362 != 0) {
                    field361 += 20;
                    if (field361 >= 400) {
                        field362 = 0;
                    }
                }
                if (Statics.field2779 != null) {
                    field344++;
                    if (field344 >= 15) {
                        method2073(Statics.field2779);
                        Statics.field2779 = null;
                    }
                }
                class155 var363 = Statics.field1971;
                class155 var364 = Statics.field954;
                Statics.field1971 = null;
                Statics.field954 = null;
                field430 = null;
                field395 = false;
                field431 = false;
                field286 = 0;
                while (class126.method2412() && field286 < 128) {
                    if (field374 >= 2 && class126.field1957[82] && Statics.field1266 == 66) {
                        String var365 = "";
                        Iterator var366 = class10.field148.iterator();
                        while (var366.hasNext()) {
                            class32 var367 = (class32) var366.next();
                            var365 = var365 + var367.field707 + ':' + var367.field709 + '\n';
                        }
                        Statics.field204.setContents(new StringSelection(var365), (ClipboardOwner) null);
                    } else {
                        field476[field286] = Statics.field1266;
                        field475[field286] = Statics.field75;
                        field286++;
                    }
                }
                int var370 = field482;
                if (class155.method128(var370)) {
                    method99(Statics.field2621[var370], -1, 0, 0, 765, 503, 0, 0);
                }
                field438++;
                while (true) {
                    class1 var371;
                    class155 var372;
                    class155 var373;
                    do {
                        var371 = (class1) field310.method3244();
                        if (var371 == null) {
                            while (true) {
                                class1 var374;
                                class155 var375;
                                class155 var376;
                                do {
                                    var374 = (class1) field456.method3244();
                                    if (var374 == null) {
                                        while (true) {
                                            class1 var377;
                                            class155 var378;
                                            class155 var379;
                                            do {
                                                var377 = (class1) field454.method3244();
                                                if (var377 == null) {
                                                    method1612();
                                                    if (field464 != null) {
                                                        method521();
                                                    }
                                                    if (Statics.field923 != null) {
                                                        method2073(Statics.field923);
                                                        field405++;
                                                        if (class129.field1991 == 0) {
                                                            if (field388) {
                                                                if (Statics.field95 == Statics.field923 && field337 != field246) {
                                                                    class155 var380 = Statics.field923;
                                                                    byte var381 = 0;
                                                                    if (field417 == 1 && var380.field2541 == 206) {
                                                                        var381 = 1;
                                                                    }
                                                                    if (var380.field2540[field337] <= 0) {
                                                                        var381 = 0;
                                                                    }
                                                                    int var382 = method137(var380);
                                                                    boolean var383 = (var382 >> 29 & 0x1) != 0;
                                                                    if (var383) {
                                                                        int var384 = field246;
                                                                        int var385 = field337;
                                                                        var380.field2540[var385] = var380.field2540[var384];
                                                                        var380.field2643[var385] = var380.field2643[var384];
                                                                        var380.field2540[var384] = -1;
                                                                        var380.field2643[var384] = 0;
                                                                    } else if (var381 == 1) {
                                                                        int var386 = field246;
                                                                        int var387 = field337;
                                                                        while (var386 != var387) {
                                                                            if (var386 > var387) {
                                                                                var380.method2879(var386 - 1, var386);
                                                                                var386--;
                                                                            } else if (var386 < var387) {
                                                                                var380.method2879(var386 + 1, var386);
                                                                                var386++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var380.method2879(field337, field246);
                                                                    }
                                                                    field486.method2376(71);
                                                                    field486.method2306(var381);
                                                                    field486.method2165(field246);
                                                                    field486.method2287(Statics.field923.field2537);
                                                                    field486.method2165(field337);
                                                                }
                                                            } else if ((field394 == 1 || method2550(field396 - 1)) && field396 > 2) {
                                                                method2743(field279, field319);
                                                            } else if (field396 > 0) {
                                                                int var388 = field279;
                                                                int var389 = field319;
                                                                method2873(Statics.field652, var388, var389);
                                                                Statics.field652 = null;
                                                            }
                                                            field344 = 10;
                                                            class129.field1986 = 0;
                                                            Statics.field923 = null;
                                                        } else if (field405 >= 5 && (class129.field1987 > field279 + 5 || class129.field1987 < field279 - 5 || class129.field1988 > field319 + 5 || class129.field1988 < field319 - 5)) {
                                                            field388 = true;
                                                        }
                                                    }
                                                    if (class80.field1371 != -1) {
                                                        int var390 = class80.field1371;
                                                        int var391 = class80.field1385;
                                                        field486.method2376(140);
                                                        field486.method2120(5);
                                                        field486.method2172(Statics.field1571 + var391);
                                                        field486.method2156(class126.field1957[82] ? (class126.field1957[81] ? 2 : 1) : 0);
                                                        field486.method2165(Statics.field1789 + var390);
                                                        class80.field1371 = -1;
                                                        field495 = class129.field1999;
                                                        field360 = class129.field2000;
                                                        field362 = 1;
                                                        field361 = 0;
                                                        field370 = var390;
                                                        field457 = var391;
                                                    }
                                                    if (Statics.field1971 != var363) {
                                                        if (var363 != null) {
                                                            method2073(var363);
                                                        }
                                                        if (Statics.field1971 != null) {
                                                            method2073(Statics.field1971);
                                                        }
                                                    }
                                                    if (Statics.field954 != var364 && field503 == field293) {
                                                        if (var364 != null) {
                                                            method2073(var364);
                                                        }
                                                        if (Statics.field954 != null) {
                                                            method2073(Statics.field954);
                                                        }
                                                    }
                                                    if (Statics.field954 == null) {
                                                        if (field503 > 0) {
                                                            field503--;
                                                        }
                                                    } else if (field503 < field293) {
                                                        field503++;
                                                        if (field503 == field293) {
                                                            method2073(Statics.field954);
                                                        }
                                                    }
                                                    int var392 = field316 + Statics.field524.field780;
                                                    int var393 = field318 + Statics.field524.field727;
                                                    if (Statics.field2078 - var392 < -500 || Statics.field2078 - var392 > 500 || Statics.field2113 - var393 < -500 || Statics.field2113 - var393 > 500) {
                                                        Statics.field2078 = var392;
                                                        Statics.field2113 = var393;
                                                    }
                                                    if (Statics.field2078 != var392) {
                                                        Statics.field2078 += (var392 - Statics.field2078) / 16;
                                                    }
                                                    if (Statics.field2113 != var393) {
                                                        Statics.field2113 += (var393 - Statics.field2113) / 16;
                                                    }
                                                    if (class129.field1991 == 4 && Statics.field2089) {
                                                        int var394 = class129.field1988 - field341;
                                                        field339 = var394 * 2;
                                                        field341 = var394 == -1 || var394 == 1 ? class129.field1988 : (field341 + class129.field1988) / 2;
                                                        int var395 = field426 - class129.field1987;
                                                        field354 = var395 * 2;
                                                        field426 = var395 == -1 || var395 == 1 ? class129.field1987 : (field426 + class129.field1987) / 2;
                                                    } else {
                                                        if (class126.field1957[96]) {
                                                            field354 += (-24 - field354) / 2;
                                                        } else if (class126.field1957[97]) {
                                                            field354 += (24 - field354) / 2;
                                                        } else {
                                                            field354 /= 2;
                                                        }
                                                        if (class126.field1957[98]) {
                                                            field339 += (12 - field339) / 2;
                                                        } else if (class126.field1957[99]) {
                                                            field339 += (-12 - field339) / 2;
                                                        } else {
                                                            field339 /= 2;
                                                        }
                                                        field341 = class129.field1988;
                                                        field426 = class129.field1987;
                                                    }
                                                    field363 = field354 / 2 + field363 & 0x7FF;
                                                    field336 += field339 / 2;
                                                    if (field336 < 128) {
                                                        field336 = 128;
                                                    }
                                                    if (field336 > 383) {
                                                        field336 = 383;
                                                    }
                                                    int var396 = Statics.field2078 >> 7;
                                                    int var397 = Statics.field2113 >> 7;
                                                    int var398 = method77(Statics.field2078, Statics.field2113, Statics.field168);
                                                    int var399 = 0;
                                                    if (var396 > 3 && var397 > 3 && var396 < 100 && var397 < 100) {
                                                        for (int var400 = var396 - 4; var400 <= var396 + 4; var400++) {
                                                            for (int var401 = var397 - 4; var401 <= var397 + 4; var401++) {
                                                                int var402 = Statics.field168;
                                                                if (var402 < 3 && (class6.field77[1][var400][var401] & 0x2) == 2) {
                                                                    var402++;
                                                                }
                                                                int var403 = var398 - class6.field84[var402][var400][var401];
                                                                if (var403 > var399) {
                                                                    var399 = var403;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var404 = var399 * 192;
                                                    if (var404 > 98048) {
                                                        var404 = 98048;
                                                    }
                                                    if (var404 < 32768) {
                                                        var404 = 32768;
                                                    }
                                                    if (var404 > field425) {
                                                        field425 += (var404 - field425) / 24;
                                                    } else if (var404 < field425) {
                                                        field425 += (var404 - field425) / 80;
                                                    }
                                                    if (field510) {
                                                        method132();
                                                    }
                                                    for (int var405 = 0; var405 < 5; var405++) {
                                                        var10002 = field504[var405]++;
                                                    }
                                                    int var406 = class129.method791();
                                                    int var407 = class126.method82();
                                                    if (var406 > 15000 && var407 > 15000) {
                                                        field300 = 250;
                                                        class129.method1310(14500);
                                                        field486.method2376(218);
                                                    }
                                                    field322++;
                                                    if (field322 > 500) {
                                                        field322 = 0;
                                                        int var408 = (int) (Math.random() * 8.0D);
                                                        if ((var408 & 0x1) == 1) {
                                                            field316 += field317;
                                                        }
                                                        if ((var408 & 0x2) == 2) {
                                                            field318 += field259;
                                                        }
                                                        if ((var408 & 0x4) == 4) {
                                                            field320 += field357;
                                                        }
                                                    }
                                                    if (field316 < -50) {
                                                        field317 = 2;
                                                    }
                                                    if (field316 > 50) {
                                                        field317 = -2;
                                                    }
                                                    if (field318 < -55) {
                                                        field259 = 2;
                                                    }
                                                    if (field318 > 55) {
                                                        field259 = -2;
                                                    }
                                                    if (field320 < -40) {
                                                        field357 = 1;
                                                    }
                                                    if (field320 > 40) {
                                                        field357 = -1;
                                                    }
                                                    field327++;
                                                    if (field327 > 500) {
                                                        field327 = 0;
                                                        int var409 = (int) (Math.random() * 8.0D);
                                                        if ((var409 & 0x1) == 1) {
                                                            field323 += field254;
                                                        }
                                                        if ((var409 & 0x2) == 2) {
                                                            field325 += field326;
                                                        }
                                                    }
                                                    if (field323 < -60) {
                                                        field254 = 2;
                                                    }
                                                    if (field323 > 60) {
                                                        field254 = -2;
                                                    }
                                                    if (field325 < -20) {
                                                        field326 = 1;
                                                    }
                                                    if (field325 > 10) {
                                                        field326 = -1;
                                                    }
                                                    for (class35 var410 = (class35) field508.method3196(); var410 != null; var410 = (class35) field508.method3197()) {
                                                        if ((long) var410.field796 < class104.method1388() / 1000L - 5L) {
                                                            if (var410.field791 > 0) {
                                                                class10.method100(5, "", var410.field790 + class145.field2386);
                                                            }
                                                            if (var410.field791 == 0) {
                                                                class10.method100(5, "", var410.field790 + class145.field2298);
                                                            }
                                                            var410.method3331();
                                                        }
                                                    }
                                                    field299++;
                                                    if (field299 > 50) {
                                                        field486.method2376(3);
                                                    }
                                                    try {
                                                        if (Statics.field605 != null && field486.field1826 > 0) {
                                                            Statics.field605.method2618(field486.field1830, 0, field486.field1826);
                                                            field486.field1826 = 0;
                                                            field299 = 0;
                                                        }
                                                    } catch (IOException var412) {
                                                        method2494();
                                                    }
                                                    return;
                                                }
                                                var378 = var377.field3;
                                                if (var378.field2538 < 0) {
                                                    break;
                                                }
                                                var379 = class155.method1876(var378.field2548);
                                            } while (var379 == null || var379.field2648 == null || var378.field2538 >= var379.field2648.length || var379.field2648[var378.field2538] != var378);
                                            class33.method1613(var377);
                                        }
                                    }
                                    var375 = var374.field3;
                                    if (var375.field2538 < 0) {
                                        break;
                                    }
                                    var376 = class155.method1876(var375.field2548);
                                } while (var376 == null || var376.field2648 == null || var375.field2538 >= var376.field2648.length || var376.field2648[var375.field2538] != var375);
                                class33.method1613(var374);
                            }
                        }
                        var372 = var371.field3;
                        if (var372.field2538 < 0) {
                            break;
                        }
                        var373 = class155.method1876(var372.field2548);
                    } while (var373 == null || var373.field2648 == null || var372.field2538 >= var373.field2648.length || var373.field2648[var372.field2538] != var372);
                    class33.method1613(var371);
                }
            }
            field486.method2376(219);
            field486.method2120(0);
            int var295 = field486.field1826;
            class192.method2441(field486);
            field486.method2255(field486.field1826 - var295);
        }
    }

    @ObfuscatedName("ae.t(I)V")
    public static final void method561() {
        if (Statics.field1246 != null) {
            Statics.field1246.method1005();
        }
        if (Statics.field794 != null) {
            Statics.field794.method1005();
        }
    }

    @ObfuscatedName("f.o(Lad;IIII)V")
    public static void method24(class39 arg0, int arg1, int arg2, int arg3) {
        if (field432 >= 50 || field492 == 0 || arg0.field907 == null || arg1 >= arg0.field907.length) {
            return;
        }
        int var4 = arg0.field907[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field494[field432] = var5;
        field367[field432] = var6;
        field496[field432] = 0;
        field406[field432] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field497[field432] = (var8 << 16) + (var9 << 8) + var7;
        field432++;
    }

    @ObfuscatedName("v.at(II)V")
    public static void method106(int arg0) {
        if (arg0 == -1 && !field490) {
            Statics.field2675.method3107();
            class164.field2727 = 1;
            Statics.field2734 = null;
        } else if (arg0 != -1 && field489 != arg0 && field488 != 0 && !field490) {
            class150 var1 = Statics.field1503;
            int var2 = field488;
            class164.field2727 = 1;
            Statics.field2734 = var1;
            Statics.field2729 = arg0;
            Statics.field1881 = 0;
            Statics.field2730 = var2;
            Statics.field1446 = false;
            Statics.field1920 = 2;
        }
        field489 = arg0;
    }

    @ObfuscatedName("ev.ag(IIB)V")
    public static void method2862(int arg0, int arg1) {
        if (field488 != 0 && arg0 != -1) {
            class164.method1981(Statics.field11, arg0, 0, field488, false);
            field490 = true;
        }
    }

    @ObfuscatedName("s.ae(B)V")
    public static final void method132() {
        int var0 = Statics.field2918 * 128 + 64;
        int var1 = Statics.field127 * 128 + 64;
        int var2 = method77(var0, var1, Statics.field168) - Statics.field2693;
        if (Statics.field666 < var0) {
            Statics.field666 += Statics.field1291 * (var0 - Statics.field666) / 1000 + Statics.field244;
            if (Statics.field666 > var0) {
                Statics.field666 = var0;
            }
        }
        if (Statics.field666 > var0) {
            Statics.field666 -= Statics.field1291 * (Statics.field666 - var0) / 1000 + Statics.field244;
            if (Statics.field666 < var0) {
                Statics.field666 = var0;
            }
        }
        if (Statics.field590 < var2) {
            Statics.field590 += Statics.field1291 * (var2 - Statics.field590) / 1000 + Statics.field244;
            if (Statics.field590 > var2) {
                Statics.field590 = var2;
            }
        }
        if (Statics.field590 > var2) {
            Statics.field590 -= Statics.field1291 * (Statics.field590 - var2) / 1000 + Statics.field244;
            if (Statics.field590 < var2) {
                Statics.field590 = var2;
            }
        }
        if (Statics.field557 < var1) {
            Statics.field557 += Statics.field1291 * (var1 - Statics.field557) / 1000 + Statics.field244;
            if (Statics.field557 > var1) {
                Statics.field557 = var1;
            }
        }
        if (Statics.field557 > var1) {
            Statics.field557 -= Statics.field1291 * (Statics.field557 - var1) / 1000 + Statics.field244;
            if (Statics.field557 < var1) {
                Statics.field557 = var1;
            }
        }
        int var3 = Statics.field703 * 128 + 64;
        int var4 = Statics.field919 * 128 + 64;
        int var5 = method77(var3, var4, Statics.field168) - Statics.field1815;
        int var6 = var3 - Statics.field666;
        int var7 = var5 - Statics.field590;
        int var8 = var4 - Statics.field557;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field54 < var10) {
            Statics.field54 += Statics.field1441 * (var10 - Statics.field54) / 1000 + Statics.field2093;
            if (Statics.field54 > var10) {
                Statics.field54 = var10;
            }
        }
        if (Statics.field54 > var10) {
            Statics.field54 -= Statics.field1441 * (Statics.field54 - var10) / 1000 + Statics.field2093;
            if (Statics.field54 < var10) {
                Statics.field54 = var10;
            }
        }
        int var12 = var11 - Statics.field220;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field220 += Statics.field1441 * var12 / 1000 + Statics.field2093;
            Statics.field220 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field220 -= Statics.field1441 * -var12 / 1000 + Statics.field2093;
            Statics.field220 &= 0x7FF;
        }
        int var13 = var11 - Statics.field220;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field220 = var11;
        }
    }

    @ObfuscatedName("p.ak(I)V")
    public static final void method136() {
        for (int var0 = -1; var0 < field373; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field296[var0];
            }
            class3 var2 = field372[var1];
            if (var2 != null) {
                method131(var2, 1);
            }
        }
    }

    @ObfuscatedName("s.ap(Las;II)V")
    public static final void method131(class34 arg0, int arg1) {
        if (arg0.field772 > field493) {
            method133(arg0);
        } else if (arg0.field787 >= field493) {
            method2871(arg0);
        } else {
            arg0.field747 = arg0.field732;
            if (arg0.field754 == 0) {
                arg0.field751 = 0;
            } else {
                label424: {
                    if (arg0.field758 != -1 && arg0.field761 == 0) {
                        class39 var2 = class39.method109(arg0.field758);
                        if (arg0.field785 > 0 && var2.field920 == 0) {
                            arg0.field751++;
                            break label424;
                        }
                        if (arg0.field785 <= 0 && var2.field911 == 0) {
                            arg0.field751++;
                            break label424;
                        }
                    }
                    int var3 = arg0.field780;
                    int var4 = arg0.field727;
                    int var5 = arg0.field760[arg0.field754 - 1] * 128 + arg0.field731 * 64;
                    int var6 = arg0.field776[arg0.field754 - 1] * 128 + arg0.field731 * 64;
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        if (var3 < var5) {
                            if (var4 < var6) {
                                arg0.field777 = 1280;
                            } else if (var4 > var6) {
                                arg0.field777 = 1792;
                            } else {
                                arg0.field777 = 1536;
                            }
                        } else if (var3 > var5) {
                            if (var4 < var6) {
                                arg0.field777 = 768;
                            } else if (var4 > var6) {
                                arg0.field777 = 256;
                            } else {
                                arg0.field777 = 512;
                            }
                        } else if (var4 < var6) {
                            arg0.field777 = 1024;
                        } else if (var4 > var6) {
                            arg0.field777 = 0;
                        }
                        int var7 = arg0.field777 - arg0.field729 & 0x7FF;
                        if (var7 > 1024) {
                            var7 -= 2048;
                        }
                        int var8 = arg0.field736;
                        if (var7 >= -256 && var7 <= 256) {
                            var8 = arg0.field735;
                        } else if (var7 >= 256 && var7 < 768) {
                            var8 = arg0.field768;
                        } else if (var7 >= -768 && var7 <= -256) {
                            var8 = arg0.field737;
                        }
                        if (var8 == -1) {
                            var8 = arg0.field735;
                        }
                        arg0.field747 = var8;
                        int var9 = 4;
                        boolean var10 = true;
                        if (arg0 instanceof class31) {
                            var10 = ((class31) arg0).field699.field832;
                        }
                        if (var10) {
                            if (arg0.field777 != arg0.field729 && arg0.field784 == -1 && arg0.field779 != 0) {
                                var9 = 2;
                            }
                            if (arg0.field754 > 2) {
                                var9 = 6;
                            }
                            if (arg0.field754 > 3) {
                                var9 = 8;
                            }
                            if (arg0.field751 > 0 && arg0.field754 > 1) {
                                var9 = 8;
                                arg0.field751--;
                            }
                        } else {
                            if (arg0.field754 > 1) {
                                var9 = 6;
                            }
                            if (arg0.field754 > 2) {
                                var9 = 8;
                            }
                            if (arg0.field751 > 0 && arg0.field754 > 1) {
                                var9 = 8;
                                arg0.field751--;
                            }
                        }
                        if (arg0.field783[arg0.field754 - 1]) {
                            var9 <<= 0x1;
                        }
                        if (var9 >= 8 && arg0.field747 == arg0.field735 && arg0.field752 != -1) {
                            arg0.field747 = arg0.field752;
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
                            arg0.field727 += var9;
                            if (arg0.field727 > var6) {
                                arg0.field727 = var6;
                            }
                        } else if (var4 > var6) {
                            arg0.field727 -= var9;
                            if (arg0.field727 < var6) {
                                arg0.field727 = var6;
                            }
                        }
                        if (arg0.field780 == var5 && arg0.field727 == var6) {
                            arg0.field754--;
                            if (arg0.field785 > 0) {
                                arg0.field785--;
                            }
                        }
                    } else {
                        arg0.field780 = var5;
                        arg0.field727 = var6;
                    }
                }
            }
        }
        if (arg0.field780 < 128 || arg0.field727 < 128 || arg0.field780 >= 13184 || arg0.field727 >= 13184) {
            arg0.field758 = -1;
            arg0.field763 = -1;
            arg0.field772 = 0;
            arg0.field787 = 0;
            arg0.field780 = arg0.field760[0] * 128 + arg0.field731 * 64;
            arg0.field727 = arg0.field776[0] * 128 + arg0.field731 * 64;
            arg0.method582();
        }
        if (Statics.field524 == arg0 && (arg0.field780 < 1536 || arg0.field727 < 1536 || arg0.field780 >= 11776 || arg0.field727 >= 11776)) {
            arg0.field758 = -1;
            arg0.field763 = -1;
            arg0.field772 = 0;
            arg0.field787 = 0;
            arg0.field780 = arg0.field760[0] * 128 + arg0.field731 * 64;
            arg0.field727 = arg0.field776[0] * 128 + arg0.field731 * 64;
            arg0.method582();
        }
        if (arg0.field779 != 0) {
            if (arg0.field784 != -1 && arg0.field784 < 32768) {
                class31 var11 = field289[arg0.field784];
                if (var11 != null) {
                    int var12 = arg0.field780 - var11.field780;
                    int var13 = arg0.field727 - var11.field727;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field777 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field784 >= 32768) {
                int var14 = arg0.field784 - 32768;
                if (field378 == var14) {
                    var14 = 2047;
                }
                class3 var15 = field372[var14];
                if (var15 != null) {
                    int var16 = arg0.field780 - var15.field780;
                    int var17 = arg0.field727 - var15.field727;
                    if (var16 != 0 || var17 != 0) {
                        arg0.field777 = (int) (Math.atan2((double) var16, (double) var17) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field739 != 0 || arg0.field770 != 0) && (arg0.field754 == 0 || arg0.field751 > 0)) {
                int var18 = arg0.field780 - (arg0.field739 * 64 - Statics.field1789 * 64 - Statics.field1789 * 64);
                int var19 = arg0.field727 - (arg0.field770 * 64 - Statics.field1571 * 64 - Statics.field1571 * 64);
                if (var18 != 0 || var19 != 0) {
                    arg0.field777 = (int) (Math.atan2((double) var18, (double) var19) * 325.949D) & 0x7FF;
                }
                arg0.field739 = 0;
                arg0.field770 = 0;
            }
            int var20 = arg0.field777 - arg0.field729 & 0x7FF;
            if (var20 == 0) {
                arg0.field778 = 0;
            } else {
                arg0.field778++;
                if (var20 > 1024) {
                    arg0.field729 -= arg0.field779;
                    boolean var21 = true;
                    if (var20 < arg0.field779 || var20 > 2048 - arg0.field779) {
                        arg0.field729 = arg0.field777;
                        var21 = false;
                    }
                    if (arg0.field747 == arg0.field732 && (arg0.field778 > 25 || var21)) {
                        if (arg0.field733 == -1) {
                            arg0.field747 = arg0.field735;
                        } else {
                            arg0.field747 = arg0.field733;
                        }
                    }
                } else {
                    arg0.field729 += arg0.field779;
                    boolean var22 = true;
                    if (var20 < arg0.field779 || var20 > 2048 - arg0.field779) {
                        arg0.field729 = arg0.field777;
                        var22 = false;
                    }
                    if (arg0.field747 == arg0.field732 && (arg0.field778 > 25 || var22)) {
                        if (arg0.field734 == -1) {
                            arg0.field747 = arg0.field735;
                        } else {
                            arg0.field747 = arg0.field734;
                        }
                    }
                }
                arg0.field729 &= 0x7FF;
            }
        }
        arg0.field730 = false;
        if (arg0.field747 != -1) {
            class39 var24 = class39.method109(arg0.field747);
            if (var24 == null || var24.field913 == null) {
                arg0.field747 = -1;
            } else {
                arg0.field757++;
                if (arg0.field756 < var24.field913.length && arg0.field757 > var24.field906[arg0.field756]) {
                    arg0.field757 = 1;
                    arg0.field756++;
                    method24(var24, arg0.field756, arg0.field780, arg0.field727);
                }
                if (arg0.field756 >= var24.field913.length) {
                    arg0.field757 = 0;
                    arg0.field756 = 0;
                    method24(var24, arg0.field756, arg0.field780, arg0.field727);
                }
            }
        }
        if (arg0.field763 != -1 && field493 >= arg0.field766) {
            if (arg0.field764 < 0) {
                arg0.field764 = 0;
            }
            int var25 = class40.method903(arg0.field763).field930;
            if (var25 == -1) {
                arg0.field763 = -1;
            } else {
                class39 var26 = class39.method109(var25);
                if (var26 == null || var26.field913 == null) {
                    arg0.field763 = -1;
                } else {
                    arg0.field782++;
                    if (arg0.field764 < var26.field913.length && arg0.field782 > var26.field906[arg0.field764]) {
                        arg0.field782 = 1;
                        arg0.field764++;
                        method24(var26, arg0.field764, arg0.field780, arg0.field727);
                    }
                    if (arg0.field764 >= var26.field913.length && (arg0.field764 < 0 || arg0.field764 >= var26.field913.length)) {
                        arg0.field763 = -1;
                    }
                }
            }
        }
        if (arg0.field758 != -1 && arg0.field761 <= 1) {
            class39 var27 = class39.method109(arg0.field758);
            if (var27.field920 == 1 && arg0.field785 > 0 && arg0.field772 <= field493 && arg0.field787 < field493) {
                arg0.field761 = 1;
                return;
            }
        }
        if (arg0.field758 != -1 && arg0.field761 == 0) {
            class39 var28 = class39.method109(arg0.field758);
            if (var28 == null || var28.field913 == null) {
                arg0.field758 = -1;
            } else {
                arg0.field755++;
                if (arg0.field738 < var28.field913.length && arg0.field755 > var28.field906[arg0.field738]) {
                    arg0.field755 = 1;
                    arg0.field738++;
                    method24(var28, arg0.field738, arg0.field780, arg0.field727);
                }
                if (arg0.field738 >= var28.field913.length) {
                    arg0.field738 -= var28.field905;
                    arg0.field762++;
                    if (arg0.field762 >= var28.field914) {
                        arg0.field758 = -1;
                    } else if (arg0.field738 >= 0 && arg0.field738 < var28.field913.length) {
                        method24(var28, arg0.field738, arg0.field780, arg0.field727);
                    } else {
                        arg0.field758 = -1;
                    }
                }
                arg0.field730 = var28.field910;
            }
        }
        if (arg0.field761 > 0) {
            arg0.field761--;
        }
    }

    @ObfuscatedName("s.ao(Las;I)V")
    public static final void method133(class34 arg0) {
        int var1 = arg0.field772 - field493;
        int var2 = arg0.field775 * 128 + arg0.field731 * 64;
        int var3 = arg0.field765 * 128 + arg0.field731 * 64;
        arg0.field780 += (var2 - arg0.field780) / var1;
        arg0.field727 += (var3 - arg0.field727) / var1;
        arg0.field751 = 0;
        if (arg0.field774 == 0) {
            arg0.field777 = 1024;
        }
        if (arg0.field774 == 1) {
            arg0.field777 = 1536;
        }
        if (arg0.field774 == 2) {
            arg0.field777 = 0;
        }
        if (arg0.field774 == 3) {
            arg0.field777 = 512;
        }
    }

    @ObfuscatedName("ee.ac(Las;I)V")
    public static final void method2871(class34 arg0) {
        if (field493 == arg0.field787 || arg0.field758 == -1 || arg0.field761 != 0 || arg0.field755 + 1 > class39.method109(arg0.field758).field906[arg0.field738]) {
            int var1 = arg0.field787 - arg0.field772;
            int var2 = field493 - arg0.field772;
            int var3 = arg0.field775 * 128 + arg0.field731 * 64;
            int var4 = arg0.field765 * 128 + arg0.field731 * 64;
            int var5 = arg0.field769 * 128 + arg0.field731 * 64;
            int var6 = arg0.field771 * 128 + arg0.field731 * 64;
            arg0.field780 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field727 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field751 = 0;
        if (arg0.field774 == 0) {
            arg0.field777 = 1024;
        }
        if (arg0.field774 == 1) {
            arg0.field777 = 1536;
        }
        if (arg0.field774 == 2) {
            arg0.field777 = 0;
        }
        if (arg0.field774 == 3) {
            arg0.field777 = 512;
        }
        arg0.field729 = arg0.field777;
    }

    @ObfuscatedName("bc.as(Ly;IIS)V")
    public static void method1416(class3 arg0, int arg1, int arg2) {
        if (arg0.field758 == arg1 && arg1 != -1) {
            int var3 = class39.method109(arg1).field917;
            if (var3 == 1) {
                arg0.field738 = 0;
                arg0.field755 = 0;
                arg0.field761 = arg2;
                arg0.field762 = 0;
            }
            if (var3 == 2) {
                arg0.field762 = 0;
            }
        } else if (arg1 == -1 || arg0.field758 == -1 || class39.method109(arg1).field902 >= class39.method109(arg0.field758).field902) {
            arg0.field758 = arg1;
            arg0.field738 = 0;
            arg0.field755 = 0;
            arg0.field761 = arg2;
            arg0.field762 = 0;
            arg0.field785 = arg0.field754;
        }
    }

    @ObfuscatedName("ex.ai(Ljava/lang/String;ZI)V")
    public static final void method2693(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2146.method3441(arg0, 250);
        int var6 = Statics.field2146.method3442(arg0, 250) * 13;
        class74.method1530(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class74.method1538(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2146.method3447(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method774(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1007.getGraphics();
                Statics.field1120.method1367(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1007.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field275; var13++) {
            if (field463[var13] + field268[var13] > var9 && field463[var13] < var9 + var11 && field466[var13] + field321[var13] > var10 && field321[var13] < var10 + var12) {
                field272[var13] = true;
            }
        }
    }

    @ObfuscatedName("e.ab(Lak;B)V")
    public static final void method507(class30 arg0) {
        if (Statics.field524.field780 >> 7 == field370 && Statics.field524.field727 >> 7 == field457) {
            field370 = 0;
        }
        int var1 = field373;
        if (class30.field694 == arg0 || class30.field691 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class30.field694 == arg0) {
                var3 = Statics.field524;
                var4 = 33538048;
            } else if (class30.field691 == arg0) {
                var3 = field372[field386];
                var4 = field386 << 14;
            } else {
                var3 = field372[field296[var2]];
                var4 = field296[var2] << 14;
                if (class30.field693 == arg0 && field386 == field296[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method10() && !var3.field52) {
                var3.field50 = false;
                if ((field255 && field373 > 50 || field373 > 200) && class30.field694 != arg0 && var3.field747 == var3.field732) {
                    var3.field50 = true;
                }
                int var5 = var3.field780 >> 7;
                int var6 = var3.field727 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field45 == null || field493 < var3.field57 || field493 >= var3.field53) {
                        if ((var3.field780 & 0x7F) == 64 && (var3.field727 & 0x7F) == 64) {
                            if (field356 == field334[var5][var6]) {
                                continue;
                            }
                            field334[var5][var6] = field356;
                        }
                        var3.field39 = method77(var3.field780, var3.field727, Statics.field168);
                        Statics.field2127.method1717(Statics.field168, var3.field780, var3.field727, var3.field39, 60, var3, var3.field729, var4, var3.field730);
                    } else {
                        var3.field50 = false;
                        var3.field39 = method77(var3.field780, var3.field727, Statics.field168);
                        Statics.field2127.method1652(Statics.field168, var3.field780, var3.field727, var3.field39, 60, var3, var3.field729, var4, var3.field46, var3.field47, var3.field48, var3.field49);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.an(ZI)V")
    public static final void method595(boolean arg0) {
        for (int var1 = 0; var1 < field290; var1++) {
            class31 var2 = field289[field291[var1]];
            int var3 = (field291[var1] << 14) + 536870912;
            if (var2 != null && var2.method10() && var2.field699.field838 == arg0 && var2.field699.method605()) {
                int var4 = var2.field780 >> 7;
                int var5 = var2.field727 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field731 == 1 && (var2.field780 & 0x7F) == 64 && (var2.field727 & 0x7F) == 64) {
                        if (field356 == field334[var4][var5]) {
                            continue;
                        }
                        field334[var4][var5] = field356;
                    }
                    if (!var2.field699.field831) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2127.method1717(Statics.field168, var2.field780, var2.field727, method77(var2.field780 + (var2.field731 * 64 - 64), var2.field727 + (var2.field731 * 64 - 64), Statics.field168), var2.field731 * 64 - 64 + 60, var2, var2.field729, var3, var2.field730);
                }
            }
        }
    }

    @ObfuscatedName("u.ah(B)I")
    public static final int method471() {
        if (Statics.field2103.field138) {
            return Statics.field168;
        } else {
            int var0 = method77(Statics.field666, Statics.field557, Statics.field168);
            return var0 - Statics.field590 >= 800 || (class6.field77[Statics.field168][Statics.field666 >> 7][Statics.field557 >> 7] & 0x4) == 0 ? 3 : Statics.field168;
        }
    }

    @ObfuscatedName("av.ad(Las;IIIIII)V")
    public static final void method890(class34 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method10()) {
            return;
        }
        if (arg0 instanceof class31) {
            class36 var6 = ((class31) arg0).field699;
            if (var6.field828 != null) {
                var6 = var6.method599();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field373) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field52) {
                return;
            }
            if (var8.field35 != -1 || var8.field40 != -1) {
                method483(arg0, arg0.field748 + 15);
                if (field459 > -1) {
                    if (var8.field35 != -1) {
                        Statics.field753[var8.field35].method1507(field459 + arg2 - 12, field359 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field40 != -1) {
                        Statics.field520[var8.field40].method1507(field459 + arg2 - 12, field359 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field390 == 10 && field270 == field296[arg1]) {
                method483(arg0, arg0.field748 + 15);
                if (field459 > -1) {
                    Statics.field540[1].method1507(field459 + arg2 - 12, field359 + arg3 - var7);
                }
            }
        } else {
            class36 var9 = ((class31) arg0).field699;
            if (var9.field828 != null) {
                var9 = var9.method599();
            }
            if (var9.field826 >= 0 && var9.field826 < Statics.field520.length) {
                method483(arg0, arg0.field748 + 15);
                if (field459 > -1) {
                    Statics.field520[var9.field826].method1507(field459 + arg2 - 12, field359 + arg3 - 30);
                }
            }
            if (field390 == 1 && field331 == field291[arg1 - field373] && field493 % 20 < 10) {
                method483(arg0, arg0.field748 + 15);
                if (field459 > -1) {
                    Statics.field540[0].method1507(field459 + arg2 - 12, field359 + arg3 - 28);
                }
            }
        }
        if (arg0.field740 != null && (arg1 >= field373 || !arg0.field742 && (field469 == 4 || !arg0.field741 && (field469 == 0 || field469 == 3 || field469 == 1 && method1878(((class3) arg0).field51, false))))) {
            method483(arg0, arg0.field748);
            if (field459 > -1 && field345 < field346) {
                field350[field345] = Statics.field474.method3439(arg0.field740) / 2;
                field349[field345] = Statics.field474.field2961;
                field347[field345] = field459;
                field348[field345] = field359;
                field351[field345] = arg0.field744;
                field352[field345] = arg0.field749;
                field353[field345] = arg0.field743;
                field379[field345] = arg0.field740;
                field345++;
            }
        }
        if (arg0.field781 > field493) {
            method483(arg0, arg0.field748 + 15);
            if (field459 > -1) {
                int var10;
                if (arg1 < field373) {
                    var10 = 30;
                } else {
                    class36 var11 = ((class31) arg0).field699;
                    var10 = var11.field803;
                }
                int var12 = arg0.field750 * var10 / arg0.field773;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field750 > 0) {
                    var12 = 1;
                }
                class74.method1530(field459 + arg2 - var10 / 2, field359 + arg3 - 3, var12, 5, 65280);
                class74.method1530(field459 + arg2 - var10 / 2 + var12, field359 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field759[var13] > field493) {
                method483(arg0, arg0.field748 / 2);
                if (field459 > -1) {
                    if (var13 == 1) {
                        field359 -= 20;
                    }
                    if (var13 == 2) {
                        field459 -= 15;
                        field359 -= 10;
                    }
                    if (var13 == 3) {
                        field459 += 15;
                        field359 -= 10;
                    }
                    Statics.field2418[arg0.field728[var13]].method1507(field459 + arg2 - 12, field359 + arg3 - 12);
                    Statics.field197.method3513(Integer.toString(arg0.field746[var13]), field459 + arg2 - 1, field359 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("a.af(Las;IB)V")
    public static final void method483(class34 arg0, int arg1) {
        method2(arg0.field780, arg0.field727, arg1);
    }

    @ObfuscatedName("c.aj(IIII)V")
    public static final void method2(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field459 = -1;
            field359 = -1;
            return;
        }
        int var3 = method77(arg0, arg1, Statics.field168) - arg2;
        int var4 = arg0 - Statics.field666;
        int var5 = var3 - Statics.field590;
        int var6 = arg1 - Statics.field557;
        int var7 = class85.field1472[Statics.field54];
        int var8 = class85.field1473[Statics.field54];
        int var9 = class85.field1472[Statics.field220];
        int var10 = class85.field1473[Statics.field220];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field459 = (var11 << 9) / var15 + 256;
            field359 = (var14 << 9) / var15 + 167;
        } else {
            field459 = -1;
            field359 = -1;
        }
    }

    @ObfuscatedName("b.am(IIIB)I")
    public static final int method77(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field77[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field84[var5][var3][var4] + class6.field84[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field84[var5][var3][var4 + 1] + class6.field84[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("o.ay(ZS)V")
    public static final void method519(boolean arg0) {
        field480 = arg0;
        if (!field480) {
            int var1 = field313.method2166();
            int var2 = field313.method2160();
            int var3 = (field448 - field313.field1826) / 16;
            Statics.field2104 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field2104[var4][var5] = field313.method2144();
                }
            }
            int var6 = field313.method2136();
            int var7 = field313.method2168();
            int var8 = field313.method2136();
            Statics.field1910 = new int[var3];
            Statics.field947 = new int[var3];
            Statics.field1802 = new int[var3];
            Statics.field2894 = new byte[var3][];
            Statics.field1474 = new byte[var3][];
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
                        Statics.field1910[var10] = var13;
                        Statics.field947[var10] = Statics.field1434.method2761("m" + var11 + "_" + var12);
                        Statics.field1802[var10] = Statics.field1434.method2761("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method119(var7, var6, var2, var1, var8);
            return;
        }
        field313.method2377();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field313.method2394(1);
                    if (var17 == 1) {
                        field461[var14][var15][var16] = field313.method2394(26);
                    } else {
                        field461[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field313.method2379();
        int var18 = (field448 - field313.field1826) / 16;
        Statics.field2104 = new int[var18][4];
        for (int var19 = 0; var19 < var18; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field2104[var19][var20] = field313.method2331();
            }
        }
        int var21 = field313.method2158();
        int var22 = field313.method2136();
        int var23 = field313.method2136();
        int var24 = field313.method2166();
        int var25 = field313.method2168();
        Statics.field1910 = new int[var18];
        Statics.field947 = new int[var18];
        Statics.field1802 = new int[var18];
        Statics.field2894 = new byte[var18][];
        Statics.field1474 = new byte[var18][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field461[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1910[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1910[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field947[var26] = Statics.field1434.method2761("m" + var35 + "_" + var36);
                            Statics.field1802[var26] = Statics.field1434.method2761("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method119(var23, var24, var21, var22, var25);
    }

    @ObfuscatedName("x.au(IIIIII)V")
    public static final void method119(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field2687 == arg0 && Statics.field1921 == arg1 && field306 == arg2 || !field255) {
            return;
        }
        Statics.field2687 = arg0;
        Statics.field1921 = arg1;
        field306 = arg2;
        if (!field255) {
            field306 = 0;
        }
        method127(25);
        method2693(class145.field2159, true);
        int var5 = Statics.field1789;
        int var6 = Statics.field1571;
        Statics.field1789 = (arg0 - 6) * 8;
        Statics.field1571 = (arg1 - 6) * 8;
        int var7 = Statics.field1789 - var5;
        int var8 = Statics.field1571 - var6;
        int var9 = Statics.field1789;
        int var10 = Statics.field1571;
        for (int var11 = 0; var11 < 32768; var11++) {
            class31 var12 = field289[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field760[var13] -= var7;
                    var12.field776[var13] -= var8;
                }
                var12.field780 -= var7 * 128;
                var12.field727 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field372[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field760[var16] -= var7;
                    var15.field776[var16] -= var8;
                }
                var15.field780 -= var7 * 128;
                var15.field727 -= var8 * 128;
            }
        }
        Statics.field168 = arg2;
        Statics.field524.method578(arg3, arg4, false);
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
        for (class15 var28 = (class15) field485.method3249(); var28 != null; var28 = (class15) field485.method3248()) {
            var28.field209 -= var7;
            var28.field210 -= var8;
            if (var28.field209 < 0 || var28.field210 < 0 || var28.field209 >= 104 || var28.field210 >= 104) {
                var28.method3334();
            }
        }
        if (field370 != 0) {
            field370 -= var7;
            field457 -= var8;
        }
        field432 = 0;
        field510 = false;
        field358 = -1;
        field428.method3240();
        field389.method3240();
    }

    @ObfuscatedName("cg.aa(ZS)V")
    public static final void method1619(boolean arg0) {
        method561();
        field299++;
        if (field299 < 50 && !arg0) {
            return;
        }
        field299 = 0;
        if (field304 || Statics.field605 == null) {
            return;
        }
        field486.method2376(3);
        try {
            Statics.field605.method2618(field486.field1830, 0, field486.field1826);
            field486.field1826 = 0;
        } catch (IOException var2) {
            field304 = true;
        }
    }

    @ObfuscatedName("n.av(IIIIII)V")
    public static final void method466(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2127.method1647(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2127.method1651(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field889.field1298;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class37 var13 = class37.method1041(var12);
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
                class75 var14 = Statics.field961[var13.field869];
                if (var14 != null) {
                    int var15 = (var13.field855 * 4 - var14.field1315) / 2;
                    int var16 = (var13.field885 * 4 - var14.field1316) / 2;
                    var14.method1587(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field885) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2127.method1749(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2127.method1651(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class37 var22 = class37.method1041(var21);
            if (var22.field869 != -1) {
                class75 var23 = Statics.field961[var22.field869];
                if (var23 != null) {
                    int var24 = (var22.field855 * 4 - var23.field1315) / 2;
                    int var25 = (var22.field885 * 4 - var23.field1316) / 2;
                    var23.method1587(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field885) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field889.field1298;
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
        int var29 = Statics.field2127.method1638(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class37 var31 = class37.method1041(var30);
        if (var31.field869 == -1) {
            return;
        }
        class75 var32 = Statics.field961[var31.field869];
        if (var32 != null) {
            int var33 = (var31.field855 * 4 - var32.field1315) / 2;
            int var34 = (var31.field885 * 4 - var32.field1316) / 2;
            var32.method1587(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field885) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("h.aw(B)V")
    public static final void method123() {
        if (field297 == 15) {
            int var0 = field313.method2158();
            int var1 = (var0 >> 4 & 0x7) + Statics.field621;
            int var2 = (var0 & 0x7) + Statics.field187;
            int var3 = field313.method2134();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field315[var4];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method135(Statics.field168, var1, var2, var6, -1, var4, var5, 0, -1);
            }
        } else if (field297 == 136) {
            int var7 = field313.method2159();
            int var8 = (var7 >> 4 & 0x7) + Statics.field621;
            int var9 = (var7 & 0x7) + Statics.field187;
            int var10 = field313.method2158();
            int var11 = var10 >> 2;
            int var12 = var10 & 0x3;
            int var13 = field315[var11];
            int var14 = field313.method2168();
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                method135(Statics.field168, var8, var9, var13, var14, var11, var12, 0, -1);
            }
        } else if (field297 == 241) {
            int var15 = field313.method2134();
            int var16 = (var15 >> 4 & 0x7) + Statics.field621;
            int var17 = (var15 & 0x7) + Statics.field187;
            int var18 = var16 + field313.method2229();
            int var19 = var17 + field313.method2229();
            int var20 = field313.method2137();
            int var21 = field313.method2136();
            int var22 = field313.method2134() * 4;
            int var23 = field313.method2134() * 4;
            int var24 = field313.method2136();
            int var25 = field313.method2136();
            int var26 = field313.method2134();
            int var27 = field313.method2134();
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104 && var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104 && var21 != 65535) {
                int var28 = var16 * 128 + 64;
                int var29 = var17 * 128 + 64;
                int var30 = var18 * 128 + 64;
                int var31 = var19 * 128 + 64;
                class7 var32 = new class7(var21, Statics.field168, var28, var29, method77(var28, var29, Statics.field168) - var22, field493 + var24, field493 + var25, var26, var27, var20, var23);
                var32.method68(var30, var31, method77(var30, var31, Statics.field168) - var23, field493 + var24);
                field389.method3241(var32);
            }
        } else if (field297 == 89) {
            int var33 = field313.method2280();
            int var34 = field313.method2158();
            int var35 = (var34 >> 4 & 0x7) + Statics.field621;
            int var36 = (var34 & 0x7) + Statics.field187;
            int var37 = field313.method2166();
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                class26 var38 = new class26();
                var38.field622 = var33;
                var38.field620 = var37;
                if (field387[Statics.field168][var35][var36] == null) {
                    field387[Statics.field168][var35][var36] = new class180();
                }
                field387[Statics.field168][var35][var36].method3241(var38);
                method533(var35, var36);
            }
        } else {
            if (field297 == 242) {
                int var39 = field313.method2136();
                byte var40 = field313.method2229();
                byte var41 = field313.method2221();
                int var42 = field313.method2160();
                int var43 = var42 >> 2;
                int var44 = var42 & 0x3;
                int var45 = field315[var43];
                byte var46 = field313.method2229();
                int var47 = field313.method2168();
                int var48 = field313.method2280();
                int var49 = field313.method2280();
                byte var50 = field313.method2162();
                int var51 = field313.method2160();
                int var52 = (var51 >> 4 & 0x7) + Statics.field621;
                int var53 = (var51 & 0x7) + Statics.field187;
                class3 var54;
                if (field378 == var47) {
                    var54 = Statics.field524;
                } else {
                    var54 = field372[var47];
                }
                if (var54 != null) {
                    class37 var55 = class37.method1041(var39);
                    int var56;
                    int var57;
                    if (var44 == 1 || var44 == 3) {
                        var56 = var55.field885;
                        var57 = var55.field855;
                    } else {
                        var56 = var55.field855;
                        var57 = var55.field885;
                    }
                    int var58 = (var56 >> 1) + var52;
                    int var59 = (var56 + 1 >> 1) + var52;
                    int var60 = (var57 >> 1) + var53;
                    int var61 = (var57 + 1 >> 1) + var53;
                    int[][] var62 = class6.field84[Statics.field168];
                    int var63 = var62[var58][var60] + var62[var59][var60] + var62[var58][var61] + var62[var59][var61] >> 2;
                    int var64 = (var52 << 7) + (var56 << 6);
                    int var65 = (var53 << 7) + (var57 << 6);
                    class99 var66 = var55.method638(var43, var44, var62, var64, var63, var65);
                    if (var66 != null) {
                        method135(Statics.field168, var52, var53, var45, -1, 0, 0, var48 + 1, var49 + 1);
                        var54.field57 = field493 + var48;
                        var54.field53 = field493 + var49;
                        var54.field45 = var66;
                        var54.field42 = var52 * 128 + var56 * 64;
                        var54.field44 = var53 * 128 + var57 * 64;
                        var54.field43 = var63;
                        if (var50 > var46) {
                            byte var67 = var50;
                            var50 = var46;
                            var46 = var67;
                        }
                        if (var41 > var40) {
                            byte var68 = var41;
                            var41 = var40;
                            var40 = var68;
                        }
                        var54.field46 = var50 + var52;
                        var54.field48 = var46 + var52;
                        var54.field47 = var41 + var53;
                        var54.field49 = var40 + var53;
                    }
                }
            }
            if (field297 == 236) {
                int var69 = field313.method2134();
                int var70 = (var69 >> 4 & 0x7) + Statics.field621;
                int var71 = (var69 & 0x7) + Statics.field187;
                int var72 = field313.method2136();
                int var73 = field313.method2134();
                int var74 = var73 >> 4 & 0xF;
                int var75 = var73 & 0x7;
                int var76 = field313.method2134();
                if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                    int var77 = var74 + 1;
                    if (Statics.field524.field760[0] >= var70 - var77 && Statics.field524.field760[0] <= var70 + var77 && Statics.field524.field776[0] >= var71 - var77 && Statics.field524.field776[0] <= var71 + var77 && field492 != 0 && var75 > 0 && field432 < 50) {
                        field494[field432] = var72;
                        field367[field432] = var75;
                        field496[field432] = var76;
                        field406[field432] = null;
                        field497[field432] = (var70 << 16) + (var71 << 8) + var74;
                        field432++;
                    }
                }
            }
            if (field297 == 196) {
                int var78 = field313.method2134();
                int var79 = (var78 >> 4 & 0x7) + Statics.field621;
                int var80 = (var78 & 0x7) + Statics.field187;
                int var81 = field313.method2136();
                int var82 = field313.method2134();
                int var83 = field313.method2136();
                if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                    int var84 = var79 * 128 + 64;
                    int var85 = var80 * 128 + 64;
                    class27 var86 = new class27(var81, Statics.field168, var84, var85, method77(var84, var85, Statics.field168) - var82, var83, field493);
                    field428.method3241(var86);
                }
            } else if (field297 == 133) {
                int var87 = field313.method2134();
                int var88 = (var87 >> 4 & 0x7) + Statics.field621;
                int var89 = (var87 & 0x7) + Statics.field187;
                int var90 = field313.method2136();
                int var91 = field313.method2136();
                int var92 = field313.method2136();
                if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                    class180 var93 = field387[Statics.field168][var88][var89];
                    if (var93 != null) {
                        for (class26 var94 = (class26) var93.method3249(); var94 != null; var94 = (class26) var93.method3248()) {
                            if ((var90 & 0x7FFF) == var94.field622 && var94.field620 == var91) {
                                var94.field620 = var92;
                                break;
                            }
                        }
                        method533(var88, var89);
                    }
                }
            } else if (field297 == 248) {
                int var95 = field313.method2160();
                int var96 = (var95 >> 4 & 0x7) + Statics.field621;
                int var97 = (var95 & 0x7) + Statics.field187;
                int var98 = field313.method2159();
                int var99 = var98 >> 2;
                int var100 = var98 & 0x3;
                int var101 = field315[var99];
                int var102 = field313.method2280();
                if (var96 >= 0 && var97 >= 0 && var96 < 103 && var97 < 103) {
                    if (var101 == 0) {
                        class81 var103 = Statics.field2127.method1775(Statics.field168, var96, var97);
                        if (var103 != null) {
                            int var104 = var103.field1413 >> 14 & 0x7FFF;
                            if (var99 == 2) {
                                var103.field1416 = new class11(var104, 2, var100 + 4, Statics.field168, var96, var97, var102, false, var103.field1416);
                                var103.field1417 = new class11(var104, 2, var100 + 1 & 0x3, Statics.field168, var96, var97, var102, false, var103.field1417);
                            } else {
                                var103.field1416 = new class11(var104, var99, var100, Statics.field168, var96, var97, var102, false, var103.field1416);
                            }
                        }
                    }
                    if (var101 == 1) {
                        class88 var105 = Statics.field2127.method1648(Statics.field168, var96, var97);
                        if (var105 != null) {
                            int var106 = var105.field1494 >> 14 & 0x7FFF;
                            if (var99 == 4 || var99 == 5) {
                                var105.field1492 = new class11(var106, 4, var100, Statics.field168, var96, var97, var102, false, var105.field1492);
                            } else if (var99 == 6) {
                                var105.field1492 = new class11(var106, 4, var100 + 4, Statics.field168, var96, var97, var102, false, var105.field1492);
                            } else if (var99 == 7) {
                                var105.field1492 = new class11(var106, 4, (var100 + 2 & 0x3) + 4, Statics.field168, var96, var97, var102, false, var105.field1492);
                            } else if (var99 == 8) {
                                var105.field1492 = new class11(var106, 4, var100 + 4, Statics.field168, var96, var97, var102, false, var105.field1492);
                                var105.field1493 = new class11(var106, 4, (var100 + 2 & 0x3) + 4, Statics.field168, var96, var97, var102, false, var105.field1493);
                            }
                        }
                    }
                    if (var101 == 2) {
                        class92 var107 = Statics.field2127.method1645(Statics.field168, var96, var97);
                        if (var99 == 11) {
                            var99 = 10;
                        }
                        if (var107 != null) {
                            var107.field1551 = new class11(var107.field1557 >> 14 & 0x7FFF, var99, var100, Statics.field168, var96, var97, var102, false, var107.field1551);
                        }
                    }
                    if (var101 == 3) {
                        class87 var108 = Statics.field2127.method1646(Statics.field168, var96, var97);
                        if (var108 != null) {
                            var108.field1477 = new class11(var108.field1482 >> 14 & 0x7FFF, 22, var100, Statics.field168, var96, var97, var102, false, var108.field1477);
                        }
                    }
                }
            } else if (field297 == 188) {
                int var109 = field313.method2160();
                int var110 = (var109 >> 4 & 0x7) + Statics.field621;
                int var111 = (var109 & 0x7) + Statics.field187;
                int var112 = field313.method2136();
                if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                    class180 var113 = field387[Statics.field168][var110][var111];
                    if (var113 != null) {
                        for (class26 var114 = (class26) var113.method3249(); var114 != null; var114 = (class26) var113.method3248()) {
                            if ((var112 & 0x7FFF) == var114.field622) {
                                var114.method3334();
                                break;
                            }
                        }
                        if (var113.method3249() == null) {
                            field387[Statics.field168][var110][var111] = null;
                        }
                        method533(var110, var111);
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.az(IIIIIIIIIB)V")
    public static final void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field485.method3249(); var10 != null; var10 = (class15) field485.method3248()) {
            if (var10.field217 == arg0 && var10.field209 == arg1 && var10.field210 == arg2 && var10.field208 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field217 = arg0;
            var9.field208 = arg3;
            var9.field209 = arg1;
            var9.field210 = arg2;
            method2850(var9);
            field485.method3241(var9);
        }
        var9.field214 = arg4;
        var9.field218 = arg5;
        var9.field215 = arg6;
        var9.field213 = arg7;
        var9.field216 = arg8;
    }

    @ObfuscatedName("ga.al(I)V")
    public static final void method3352() {
        for (class15 var0 = (class15) field485.method3249(); var0 != null; var0 = (class15) field485.method3248()) {
            if (var0.field216 == -1) {
                var0.field213 = 0;
                method2850(var0);
            } else {
                var0.method3334();
            }
        }
    }

    @ObfuscatedName("ev.ar(Ls;I)V")
    public static final void method2850(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field208 == 0) {
            var1 = Statics.field2127.method1647(arg0.field217, arg0.field209, arg0.field210);
        }
        if (arg0.field208 == 1) {
            var1 = Statics.field2127.method1704(arg0.field217, arg0.field209, arg0.field210);
        }
        if (arg0.field208 == 2) {
            var1 = Statics.field2127.method1749(arg0.field217, arg0.field209, arg0.field210);
        }
        if (arg0.field208 == 3) {
            var1 = Statics.field2127.method1638(arg0.field217, arg0.field209, arg0.field210);
        }
        if (var1 != 0) {
            int var5 = Statics.field2127.method1651(arg0.field217, arg0.field209, arg0.field210, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field211 = var2;
        arg0.field207 = var3;
        arg0.field212 = var4;
    }

    @ObfuscatedName("go.ax(I)V")
    public static final void method3391() {
        for (class15 var0 = (class15) field485.method3249(); var0 != null; var0 = (class15) field485.method3248()) {
            if (var0.field216 > 0) {
                var0.field216--;
            }
            if (var0.field216 != 0) {
                if (var0.field213 > 0) {
                    var0.field213--;
                }
                if (var0.field213 == 0 && var0.field209 >= 1 && var0.field210 >= 1 && var0.field209 <= 102 && var0.field210 <= 102 && (var0.field214 < 0 || class6.method2926(var0.field214, var0.field218))) {
                    method2437(var0.field217, var0.field208, var0.field209, var0.field210, var0.field214, var0.field215, var0.field218);
                    var0.field213 = -1;
                    if (var0.field214 == var0.field211 && var0.field211 == -1) {
                        var0.method3334();
                    } else if (var0.field214 == var0.field211 && var0.field215 == var0.field212 && var0.field218 == var0.field207) {
                        var0.method3334();
                    }
                }
            } else if (var0.field211 < 0 || class6.method2926(var0.field211, var0.field207)) {
                method2437(var0.field217, var0.field208, var0.field209, var0.field210, var0.field211, var0.field212, var0.field207);
                var0.method3334();
            }
        }
    }

    @ObfuscatedName("da.be(IIIIIIII)V")
    public static final void method2437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field255 && Statics.field168 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2127.method1647(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2127.method1704(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2127.method1749(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2127.method1638(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2127.method1651(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2127.method1713(arg0, arg2, arg3);
                class37 var15 = class37.method1041(var12);
                if (var15.field857 != 0) {
                    field312[arg0].method3583(arg2, arg3, var13, var14, var15.field858);
                }
            }
            if (arg1 == 1) {
                Statics.field2127.method1740(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2127.method1640(arg0, arg2, arg3);
                class37 var16 = class37.method1041(var12);
                if (var16.field855 + arg2 > 103 || var16.field855 + arg3 > 103 || var16.field885 + arg2 > 103 || var16.field885 + arg3 > 103) {
                    return;
                }
                if (var16.field857 != 0) {
                    field312[arg0].method3605(arg2, arg3, var16.field855, var16.field885, var14, var16.field858);
                }
            }
            if (arg1 == 3) {
                Statics.field2127.method1641(arg0, arg2, arg3);
                class37 var17 = class37.method1041(var12);
                if (var17.field857 == 1) {
                    field312[arg0].method3586(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field77[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method731(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field2127, field312[arg0]);
    }

    @ObfuscatedName("ag.bh(IIB)V")
    public static final void method533(int arg0, int arg1) {
        class180 var2 = field387[Statics.field168][arg0][arg1];
        if (var2 == null) {
            Statics.field2127.method1642(Statics.field168, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class26 var5 = null;
        for (class26 var6 = (class26) var2.method3249(); var6 != null; var6 = (class26) var2.method3248()) {
            class46 var7 = class46.method114(var6.field622);
            long var8 = (long) var7.field1035;
            if (var7.field1034 == 1) {
                var8 = (long) (var6.field620 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2127.method1642(Statics.field168, arg0, arg1);
            return;
        }
        var2.method3242(var5);
        class26 var10 = null;
        class26 var11 = null;
        for (class26 var12 = (class26) var2.method3249(); var12 != null; var12 = (class26) var2.method3248()) {
            if (var5.field622 != var12.field622) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field622 != var12.field622 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2127.method1628(Statics.field168, arg0, arg1, method77(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field168), var5, var13, var10, var11);
    }

    @ObfuscatedName("z.bn(I)V")
    public static final void method140() {
        field380 = 0;
        field392 = 0;
        method574();
        int var0 = field313.method2394(8);
        if (var0 < field373) {
            for (int var1 = var0; var1 < field373; var1++) {
                field381[++field380 - 1] = field296[var1];
            }
        }
        if (var0 > field373) {
            throw new RuntimeException("");
        }
        field373 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field296[var2];
            class3 var4 = field372[var3];
            int var5 = field313.method2394(1);
            if (var5 == 0) {
                field296[++field373 - 1] = var3;
                var4.field745 = field493;
            } else {
                int var6 = field313.method2394(2);
                if (var6 == 0) {
                    field296[++field373 - 1] = var3;
                    var4.field745 = field493;
                    field376[++field392 - 1] = var3;
                } else if (var6 == 1) {
                    field296[++field373 - 1] = var3;
                    var4.field745 = field493;
                    int var7 = field313.method2394(3);
                    var4.method585(var7, false);
                    int var8 = field313.method2394(1);
                    if (var8 == 1) {
                        field376[++field392 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field296[++field373 - 1] = var3;
                    var4.field745 = field493;
                    int var9 = field313.method2394(3);
                    var4.method585(var9, true);
                    int var10 = field313.method2394(3);
                    var4.method585(var10, true);
                    int var11 = field313.method2394(1);
                    if (var11 == 1) {
                        field376[++field392 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field381[++field380 - 1] = var3;
                }
            }
        }
        method2915();
        method110();
        for (int var12 = 0; var12 < field380; var12++) {
            int var13 = field381[var12];
            if (field493 != field372[var13].field745) {
                field372[var13] = null;
            }
        }
        if (field448 != field313.field1826) {
            throw new RuntimeException(field313.field1826 + class2.field19 + field448);
        }
        for (int var14 = 0; var14 < field373; var14++) {
            if (field372[field296[var14]] == null) {
                throw new RuntimeException(var14 + class2.field19 + field373);
            }
        }
    }

    @ObfuscatedName("ac.by(B)V")
    public static final void method574() {
        field313.method2377();
        int var0 = field313.method2394(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field313.method2394(2);
        if (var1 == 0) {
            field376[++field392 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field313.method2394(3);
            Statics.field524.method585(var2, false);
            int var3 = field313.method2394(1);
            if (var3 == 1) {
                field376[++field392 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field313.method2394(3);
            Statics.field524.method585(var4, true);
            int var5 = field313.method2394(3);
            Statics.field524.method585(var5, true);
            int var6 = field313.method2394(1);
            if (var6 == 1) {
                field376[++field392 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field313.method2394(1);
            int var8 = field313.method2394(7);
            int var9 = field313.method2394(1);
            if (var9 == 1) {
                field376[++field392 - 1] = 2047;
            }
            int var10 = field313.method2394(7);
            Statics.field168 = field313.method2394(2);
            Statics.field524.method578(var8, var10, var7 == 1);
        }
    }

    @ObfuscatedName("ed.bg(B)V")
    public static final void method2915() {
        while (true) {
            if (field313.method2380(field448) >= 11) {
                int var0 = field313.method2394(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field372[var0] == null) {
                        field372[var0] = new class3();
                        if (field511[var0] != null) {
                            field372[var0].method9(field511[var0]);
                        }
                        var1 = true;
                    }
                    field296[++field373 - 1] = var0;
                    class3 var2 = field372[var0];
                    var2.field745 = field493;
                    int var3 = field313.method2394(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field313.method2394(1);
                    int var5 = field313.method2394(1);
                    if (var5 == 1) {
                        field376[++field392 - 1] = var0;
                    }
                    int var6 = field313.method2394(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field393[field313.method2394(3)];
                    if (var1) {
                        var2.field777 = var2.field729 = var7;
                    }
                    var2.method578(Statics.field524.field760[0] + var6, Statics.field524.field776[0] + var3, var4 == 1);
                    continue;
                }
            }
            field313.method2379();
            return;
        }
    }

    @ObfuscatedName("i.bb(B)V")
    public static final void method110() {
        for (int var0 = 0; var0 < field392; var0++) {
            int var1 = field376[var0];
            class3 var2 = field372[var1];
            int var3 = field313.method2134();
            if ((var3 & 0x4) != 0) {
                var3 += field313.method2134() << 8;
            }
            method3339(var1, var2, var3);
        }
    }

    @ObfuscatedName("gn.bm(ILy;II)V")
    public static final void method3339(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x1) != 0) {
            arg1.field740 = field313.method2216();
            if (arg1.field740.charAt(0) == '~') {
                arg1.field740 = arg1.field740.substring(1);
                class10.method100(2, arg1.field51, arg1.field740);
            } else if (Statics.field524 == arg1) {
                class10.method100(2, arg1.field51, arg1.field740);
            }
            arg1.field741 = false;
            arg1.field744 = 0;
            arg1.field749 = 0;
            arg1.field743 = 150;
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field784 = field313.method2280();
            if (arg1.field784 == 65535) {
                arg1.field784 = -1;
            }
        }
        if ((arg2 & 0x100) != 0) {
            int var3 = field313.method2136();
            int var4 = field313.method2160();
            arg1.method579(var3, var4, field493);
            arg1.field781 = field493 + 300;
            arg1.field750 = field313.method2158();
            arg1.field773 = field313.method2160();
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field739 = field313.method2280();
            arg1.field770 = field313.method2168();
        }
        if ((arg2 & 0x40) != 0) {
            int var5 = field313.method2136();
            int var6 = field313.method2160();
            arg1.method579(var5, var6, field493);
            arg1.field781 = field493 + 300;
            arg1.field750 = field313.method2134();
            arg1.field773 = field313.method2134();
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field775 = field313.method2158();
            arg1.field765 = field313.method2160();
            arg1.field769 = field313.method2159();
            arg1.field771 = field313.method2159();
            arg1.field772 = field313.method2166() + field493;
            arg1.field787 = field313.method2166() + field493;
            arg1.field774 = field313.method2134();
            arg1.field754 = 1;
            arg1.field785 = 0;
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field763 = field313.method2166();
            int var7 = field313.method2238();
            arg1.field767 = var7 >> 16;
            arg1.field766 = (var7 & 0xFFFF) + field493;
            arg1.field764 = 0;
            arg1.field782 = 0;
            if (arg1.field766 > field493) {
                arg1.field764 = -1;
            }
            if (arg1.field763 == 65535) {
                arg1.field763 = -1;
            }
        }
        if ((arg2 & 0x20) != 0) {
            int var8 = field313.method2134();
            byte[] var9 = new byte[var8];
            class108 var10 = new class108(var9);
            field313.method2179(var9, 0, var8);
            field511[arg0] = var10;
            arg1.method9(var10);
        }
        if ((arg2 & 0x2) != 0) {
            int var11 = field313.method2136();
            if (var11 == 65535) {
                var11 = -1;
            }
            int var12 = field313.method2134();
            method1416(arg1, var11, var12);
        }
        if ((arg2 & 0x80) == 0) {
            return;
        }
        int var13 = field313.method2166();
        class140[] var14 = new class140[] { class140.field2105, class140.field2098, class140.field2102, class140.field2095, class140.field2094 };
        class140 var15 = (class140) class100.method70(var14, field313.method2158());
        boolean var16 = field313.method2134() == 1;
        int var17 = field313.method2134();
        int var18 = field313.field1826;
        if (arg1.field51 != null && arg1.field36 != null) {
            boolean var19 = false;
            if (var15.field2096 && method2714(arg1.field51)) {
                var19 = true;
            }
            if (!var19 && field371 == 0 && !arg1.field52) {
                field276.field1826 = 0;
                field313.method2178(field276.field1830, 0, var17);
                field276.field1826 = 0;
                String var20 = class204.method3443(class211.method3573(class203.method2413(field276)));
                arg1.field740 = var20.trim();
                arg1.field744 = var13 >> 8;
                arg1.field749 = var13 & 0xFF;
                arg1.field743 = 150;
                arg1.field741 = var16;
                arg1.field742 = Statics.field524 != arg1 && var15.field2096 && field471 != "" && var20.toLowerCase().indexOf(field471) == -1;
                int var21;
                if (var15.field2101) {
                    var21 = var16 ? 91 : 1;
                } else {
                    var21 = var16 ? 90 : 2;
                }
                if (var15.field2100 == -1) {
                    class10.method100(var21, arg1.field51, var20);
                } else {
                    class10.method100(var21, class2.method1882(var15.field2100) + arg1.field51, var20);
                }
            }
        }
        field313.field1826 = var17 + var18;
    }

    @ObfuscatedName("f.bq(ZI)V")
    public static final void method26(boolean arg0) {
        field380 = 0;
        field392 = 0;
        field313.method2377();
        int var1 = field313.method2394(8);
        if (var1 < field290) {
            for (int var2 = var1; var2 < field290; var2++) {
                field381[++field380 - 1] = field291[var2];
            }
        }
        if (var1 > field290) {
            throw new RuntimeException("");
        }
        field290 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field291[var3];
            class31 var5 = field289[var4];
            int var6 = field313.method2394(1);
            if (var6 == 0) {
                field291[++field290 - 1] = var4;
                var5.field745 = field493;
            } else {
                int var7 = field313.method2394(2);
                if (var7 == 0) {
                    field291[++field290 - 1] = var4;
                    var5.field745 = field493;
                    field376[++field392 - 1] = var4;
                } else if (var7 == 1) {
                    field291[++field290 - 1] = var4;
                    var5.field745 = field493;
                    int var8 = field313.method2394(3);
                    var5.method585(var8, false);
                    int var9 = field313.method2394(1);
                    if (var9 == 1) {
                        field376[++field392 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field291[++field290 - 1] = var4;
                    var5.field745 = field493;
                    int var10 = field313.method2394(3);
                    var5.method585(var10, true);
                    int var11 = field313.method2394(3);
                    var5.method585(var11, true);
                    int var12 = field313.method2394(1);
                    if (var12 == 1) {
                        field376[++field392 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field381[++field380 - 1] = var4;
                }
            }
        }
        while (field313.method2380(field448) >= 27) {
            int var13 = field313.method2394(15);
            if (var13 == 32767) {
                break;
            }
            boolean var17 = false;
            if (field289[var13] == null) {
                field289[var13] = new class31();
                var17 = true;
            }
            class31 var18 = field289[var13];
            field291[++field290 - 1] = var13;
            var18.field745 = field493;
            int var19 = field313.method2394(1);
            if (var19 == 1) {
                field376[++field392 - 1] = var13;
            }
            int var20;
            if (arg0) {
                var20 = field313.method2394(8);
                if (var20 > 127) {
                    var20 -= 256;
                }
            } else {
                var20 = field313.method2394(5);
                if (var20 > 15) {
                    var20 -= 32;
                }
            }
            int var21;
            if (arg0) {
                var21 = field313.method2394(8);
                if (var21 > 127) {
                    var21 -= 256;
                }
            } else {
                var21 = field313.method2394(5);
                if (var21 > 15) {
                    var21 -= 32;
                }
            }
            int var22 = field393[field313.method2394(3)];
            if (var17) {
                var18.field777 = var18.field729 = var22;
            }
            var18.field699 = class36.method2072(field313.method2394(14));
            int var23 = field313.method2394(1);
            var18.field731 = var18.field699.field804;
            var18.field779 = var18.field699.field827;
            if (var18.field779 == 0) {
                var18.field729 = 0;
            }
            var18.field735 = var18.field699.field816;
            var18.field736 = var18.field699.field811;
            var18.field737 = var18.field699.field812;
            var18.field768 = var18.field699.field813;
            var18.field732 = var18.field699.field802;
            var18.field733 = var18.field699.field830;
            var18.field734 = var18.field699.field809;
            var18.method578(Statics.field524.field760[0] + var20, Statics.field524.field776[0] + var21, var23 == 1);
        }
        field313.method2379();
        method469();
        for (int var14 = 0; var14 < field380; var14++) {
            int var15 = field381[var14];
            if (field493 != field289[var15].field745) {
                field289[var15].field699 = null;
                field289[var15] = null;
            }
        }
        if (field448 != field313.field1826) {
            throw new RuntimeException(field313.field1826 + class2.field19 + field448);
        }
        for (int var16 = 0; var16 < field290; var16++) {
            if (field289[field291[var16]] == null) {
                throw new RuntimeException(var16 + class2.field19 + field290);
            }
        }
    }

    @ObfuscatedName("u.br(I)V")
    public static final void method469() {
        for (int var0 = 0; var0 < field392; var0++) {
            int var1 = field376[var0];
            class31 var2 = field289[var1];
            int var3 = field313.method2134();
            if ((var3 & 0x40) != 0) {
                var2.field763 = field313.method2168();
                int var4 = field313.method2238();
                var2.field767 = var4 >> 16;
                var2.field766 = (var4 & 0xFFFF) + field493;
                var2.field764 = 0;
                var2.field782 = 0;
                if (var2.field766 > field493) {
                    var2.field764 = -1;
                }
                if (var2.field763 == 65535) {
                    var2.field763 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                var2.field699 = class36.method2072(field313.method2136());
                var2.field731 = var2.field699.field804;
                var2.field779 = var2.field699.field827;
                var2.field735 = var2.field699.field816;
                var2.field736 = var2.field699.field811;
                var2.field737 = var2.field699.field812;
                var2.field768 = var2.field699.field813;
                var2.field732 = var2.field699.field802;
                var2.field733 = var2.field699.field830;
                var2.field734 = var2.field699.field809;
            }
            if ((var3 & 0x20) != 0) {
                int var5 = field313.method2158();
                int var6 = field313.method2158();
                var2.method579(var5, var6, field493);
                var2.field781 = field493 + 300;
                var2.field750 = field313.method2136();
                var2.field773 = field313.method2136();
            }
            if ((var3 & 0x8) != 0) {
                int var7 = field313.method2166();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field313.method2158();
                if (var2.field758 == var7 && var7 != -1) {
                    int var9 = class39.method109(var7).field917;
                    if (var9 == 1) {
                        var2.field738 = 0;
                        var2.field755 = 0;
                        var2.field761 = var8;
                        var2.field762 = 0;
                    }
                    if (var9 == 2) {
                        var2.field762 = 0;
                    }
                } else if (var7 == -1 || var2.field758 == -1 || class39.method109(var7).field902 >= class39.method109(var2.field758).field902) {
                    var2.field758 = var7;
                    var2.field738 = 0;
                    var2.field755 = 0;
                    var2.field761 = var8;
                    var2.field762 = 0;
                    var2.field785 = var2.field754;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field739 = field313.method2136();
                var2.field770 = field313.method2166();
            }
            if ((var3 & 0x4) != 0) {
                var2.field784 = field313.method2136();
                if (var2.field784 == 65535) {
                    var2.field784 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                int var10 = field313.method2158();
                int var11 = field313.method2160();
                var2.method579(var10, var11, field493);
                var2.field781 = field493 + 300;
                var2.field750 = field313.method2166();
                var2.field773 = field313.method2166();
            }
            if ((var3 & 0x10) != 0) {
                var2.field740 = field313.method2216();
                var2.field743 = 100;
            }
        }
    }

    @ObfuscatedName("aj.bw(IIIII)V")
    public static final void method774(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field275; var4++) {
            if (field463[var4] + field268[var4] > arg0 && field463[var4] < arg0 + arg2 && field466[var4] + field321[var4] > arg1 && field321[var4] < arg1 + arg3) {
                field384[var4] = true;
            }
        }
    }

    @ObfuscatedName("bd.bf(I)V")
    public static final void method1612() {
        method1405();
        if (Statics.field923 != null || field464 != null) {
            return;
        }
        int var12;
        int var13;
        label196: {
            int var0 = class129.field1986;
            if (field403) {
                if (var0 != 1 && (Statics.field2089 || var0 != 4)) {
                    int var1 = class129.field1987;
                    int var2 = class129.field1988;
                    if (var1 < Statics.field1836 - 10 || var1 > Statics.field198 + Statics.field1836 + 10 || var2 < Statics.field525 - 10 || var2 > Statics.field525 + Statics.field1045 + 10) {
                        field403 = false;
                        method774(Statics.field1836, Statics.field525, Statics.field198, Statics.field1045);
                    }
                }
                if (var0 == 1 || !Statics.field2089 && var0 == 4) {
                    int var3 = Statics.field1836;
                    int var4 = Statics.field525;
                    int var5 = Statics.field198;
                    int var6 = class129.field1999;
                    int var7 = class129.field2000;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field396; var9++) {
                        int var10 = (field396 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method675(var8);
                    }
                    field403 = false;
                    method774(Statics.field1836, Statics.field525, Statics.field198, Statics.field1045);
                }
            } else {
                if ((var0 == 1 || !Statics.field2089 && var0 == 4) && field396 > 0) {
                    int var11 = field340[field396 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field397[field396 - 1];
                        var13 = field398[field396 - 1];
                        class155 var14 = class155.method1876(var13);
                        if (class159.method1337(method137(var14))) {
                            break label196;
                        }
                        int var15 = method137(var14);
                        boolean var16 = (var15 >> 29 & 0x1) != 0;
                        if (var16) {
                            break label196;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field2089 && var0 == 4) && (field394 == 1 && field396 > 2 || method2550(field396 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field2089 && var0 == 4) && field396 > 0) {
                    method675(field396 - 1);
                }
                if (var0 == 2 && field396 > 0) {
                    method2743(class129.field1999, class129.field2000);
                }
            }
            return;
        }
        if (Statics.field923 != null && !field388 && field394 != 1 && !method2550(field396 - 1) && field396 > 0) {
            int var17 = field279;
            int var18 = field319;
            method2873(Statics.field652, var17, var18);
            Statics.field652 = null;
        }
        field388 = false;
        field405 = 0;
        if (Statics.field923 != null) {
            method2073(Statics.field923);
        }
        Statics.field923 = class155.method1876(var13);
        field246 = var12;
        field279 = class129.field1999;
        field319 = class129.field2000;
        if (field396 > 0) {
            int var19 = field396 - 1;
            Statics.field652 = new class28();
            Statics.field652.field640 = field397[var19];
            Statics.field652.field643 = field398[var19];
            Statics.field652.field641 = field340[var19];
            Statics.field652.field642 = field400[var19];
            Statics.field652.field639 = field401[var19];
        }
        method2073(Statics.field923);
    }

    @ObfuscatedName("ef.bo(IIB)V")
    public static final void method2743(int arg0, int arg1) {
        int var2 = Statics.field474.method3439(class145.field2303);
        for (int var3 = 0; var3 < field396; var3++) {
            int var4 = Statics.field474.method3439(method862(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field396 * 15 + 21;
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
        Statics.field1836 = var6;
        Statics.field525 = var7;
        Statics.field198 = var2;
        Statics.field1045 = field396 * 15 + 22;
    }

    @ObfuscatedName("df.bv(IB)Z")
    public static final boolean method2550(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field340[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ah.bz(IB)V")
    public static final void method675(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field397[arg0];
        int var2 = field398[arg0];
        int var3 = field340[arg0];
        int var4 = field400[arg0];
        String var5 = field401[arg0];
        String var6 = field402[arg0];
        method2464(var1, var2, var3, var4, var5, var6, class129.field1999, class129.field2000);
    }

    @ObfuscatedName("eq.bu(Lag;III)V")
    public static final void method2873(class28 arg0, int arg1, int arg2) {
        method2464(arg0.field640, arg0.field643, arg0.field641, arg0.field642, arg0.field639, arg0.field639, arg1, arg2);
    }

    @ObfuscatedName("dv.bp(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method2464(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 50) {
            class3 var8 = field372[arg3];
            if (var8 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(77);
                field486.method2157(class126.field1957[82] ? 1 : 0);
                field486.method2121(arg3);
            }
        }
        if (arg2 == 12) {
            class31 var9 = field289[arg3];
            if (var9 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(229);
                field486.method2311(arg3);
                field486.method2306(class126.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class3 var10 = field372[arg3];
            if (var10 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(238);
                field486.method2306(class126.field1957[82] ? 1 : 0);
                field486.method2165(arg3);
            }
        }
        if (arg2 == 17) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field370 = arg0;
            field457 = arg1;
            field486.method2376(197);
            field486.method2156(class126.field1957[82] ? 1 : 0);
            field486.method2311(field410);
            field486.method2172(Statics.field1789 + arg0);
            field486.method2287(Statics.field2133);
            field486.method2172(Statics.field1571 + arg1);
            field486.method2165(arg3);
        }
        if (arg2 == 7) {
            class31 var11 = field289[arg3];
            if (var11 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(61);
                field486.method2165(Statics.field836);
                field486.method2174(Statics.field941);
                field486.method2306(class126.field1957[82] ? 1 : 0);
                field486.method2172(Statics.field206);
                field486.method2165(arg3);
            }
        }
        if (arg2 == 37) {
            field486.method2376(110);
            field486.method2121(arg3);
            field486.method2121(arg0);
            field486.method2287(arg1);
            field344 = 0;
            Statics.field2779 = class155.method1876(arg1);
            field364 = arg0;
        }
        if (arg2 == 48) {
            class3 var12 = field372[arg3];
            if (var12 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(209);
                field486.method2172(arg3);
                field486.method2157(class126.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field370 = arg0;
            field457 = arg1;
            field486.method2376(64);
            field486.method2165(Statics.field1571 + arg1);
            field486.method2157(class126.field1957[82] ? 1 : 0);
            field486.method2165(Statics.field1789 + arg0);
            field486.method2165(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 45) {
            class3 var13 = field372[arg3];
            if (var13 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(214);
                field486.method2311(arg3);
                field486.method2157(class126.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class31 var14 = field289[arg3];
            if (var14 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(0);
                field486.method2311(arg3);
                field486.method2157(class126.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class3 var15 = field372[arg3];
            if (var15 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(124);
                field486.method2306(class126.field1957[82] ? 1 : 0);
                field486.method2311(Statics.field206);
                field486.method2194(Statics.field941);
                field486.method2165(Statics.field836);
                field486.method2172(arg3);
            }
        }
        if (arg2 == 21) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field370 = arg0;
            field457 = arg1;
            field486.method2376(188);
            field486.method2311(Statics.field1571 + arg1);
            field486.method2121(arg3);
            field486.method2311(Statics.field1789 + arg0);
            field486.method2306(class126.field1957[82] ? 1 : 0);
        }
        if (arg2 == 35) {
            field486.method2376(149);
            field486.method2165(arg0);
            field486.method2165(arg3);
            field486.method2174(arg1);
            field344 = 0;
            Statics.field2779 = class155.method1876(arg1);
            field364 = arg0;
        }
        if (arg2 == 5) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field370 = arg0;
            field457 = arg1;
            field486.method2376(141);
            field486.method2311(Statics.field1571 + arg1);
            field486.method2165(Statics.field1789 + arg0);
            field486.method2157(class126.field1957[82] ? 1 : 0);
            field486.method2172(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1005) {
            class155 var16 = class155.method1876(arg1);
            if (var16 == null || var16.field2643[arg0] < 100000) {
                field486.method2376(103);
                field486.method2165(arg3);
            } else {
                class10.method100(27, "", var16.field2643[arg0] + " x " + class46.method114(arg3).field1026);
            }
            field344 = 0;
            Statics.field2779 = class155.method1876(arg1);
            field364 = arg0;
        }
        if (arg2 == 40) {
            field486.method2376(222);
            field486.method2172(arg3);
            field486.method2165(arg0);
            field486.method2194(arg1);
            field344 = 0;
            Statics.field2779 = class155.method1876(arg1);
            field364 = arg0;
        }
        if (arg2 == 34) {
            field486.method2376(46);
            field486.method2174(arg1);
            field486.method2172(arg3);
            field486.method2311(arg0);
            field344 = 0;
            Statics.field2779 = class155.method1876(arg1);
            field364 = arg0;
        }
        if (arg2 == 11) {
            class31 var17 = field289[arg3];
            if (var17 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(73);
                field486.method2121(arg3);
                field486.method2120(class126.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field486.method2376(5);
            field486.method2311(arg3);
            field486.method2194(Statics.field941);
            field486.method2174(arg1);
            field486.method2121(Statics.field206);
            field486.method2121(arg0);
            field486.method2121(Statics.field836);
            field344 = 0;
            Statics.field2779 = class155.method1876(arg1);
            field364 = arg0;
        }
        if (arg2 == 39) {
            field486.method2376(11);
            field486.method2287(arg1);
            field486.method2121(arg3);
            field486.method2311(arg0);
            field344 = 0;
            Statics.field2779 = class155.method1876(arg1);
            field364 = arg0;
        }
        if (arg2 == 47) {
            class3 var18 = field372[arg3];
            if (var18 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(132);
                field486.method2156(class126.field1957[82] ? 1 : 0);
                field486.method2172(arg3);
            }
        }
        if (arg2 == 15) {
            class3 var19 = field372[arg3];
            if (var19 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(37);
                field486.method2165(arg3);
                field486.method2174(Statics.field2133);
                field486.method2157(class126.field1957[82] ? 1 : 0);
                field486.method2311(field410);
            }
        }
        if (arg2 == 19) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field370 = arg0;
            field457 = arg1;
            field486.method2376(208);
            field486.method2121(arg3);
            field486.method2172(Statics.field1571 + arg1);
            field486.method2157(class126.field1957[82] ? 1 : 0);
            field486.method2165(Statics.field1789 + arg0);
        }
        if (arg2 == 10) {
            class31 var20 = field289[arg3];
            if (var20 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(100);
                field486.method2172(arg3);
                field486.method2157(class126.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field486.method2376(235);
            field486.method2123(arg1);
            class155 var21 = class155.method1876(arg1);
            if (var21.field2636 != null && var21.field2636[0][0] == 5) {
                int var22 = var21.field2636[0][1];
                if (class157.field2671[var22] != var21.field2638[0]) {
                    class157.field2671[var22] = var21.field2638[0];
                    method3396(var22);
                }
            }
        }
        if (arg2 == 1003) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            class31 var23 = field289[arg3];
            if (var23 != null) {
                class36 var24 = var23.field699;
                if (var24.field828 != null) {
                    var24 = var24.method599();
                }
                if (var24 != null) {
                    field486.method2376(80);
                    field486.method2311(var24.field819);
                }
            }
        }
        if (arg2 == 22) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field370 = arg0;
            field457 = arg1;
            field486.method2376(177);
            field486.method2311(arg3);
            field486.method2120(class126.field1957[82] ? 1 : 0);
            field486.method2172(Statics.field1571 + arg1);
            field486.method2121(Statics.field1789 + arg0);
        }
        if (arg2 == 1002) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field486.method2376(116);
            field486.method2172(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 16) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field370 = arg0;
            field457 = arg1;
            field486.method2376(190);
            field486.method2121(arg3);
            field486.method2311(Statics.field206);
            field486.method2194(Statics.field941);
            field486.method2121(Statics.field1571 + arg1);
            field486.method2311(Statics.field1789 + arg0);
            field486.method2172(Statics.field836);
            field486.method2157(class126.field1957[82] ? 1 : 0);
        }
        if (arg2 == 32) {
            field486.method2376(81);
            field486.method2194(Statics.field2133);
            field486.method2174(arg1);
            field486.method2165(arg0);
            field486.method2172(field410);
            field486.method2311(arg3);
            field344 = 0;
            Statics.field2779 = class155.method1876(arg1);
            field364 = arg0;
        }
        if (arg2 == 42) {
            field486.method2376(21);
            field486.method2121(arg0);
            field486.method2121(arg3);
            field486.method2287(arg1);
            field344 = 0;
            Statics.field2779 = class155.method1876(arg1);
            field364 = arg0;
        }
        if (arg2 == 6) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field370 = arg0;
            field457 = arg1;
            field486.method2376(50);
            field486.method2311(arg3 >> 14 & 0x7FFF);
            field486.method2120(class126.field1957[82] ? 1 : 0);
            field486.method2172(Statics.field1789 + arg0);
            field486.method2165(Statics.field1571 + arg1);
        }
        if (arg2 == 23) {
            Statics.field2127.method1658(Statics.field168, arg0, arg1);
        }
        if (arg2 == 1) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field370 = arg0;
            field457 = arg1;
            field486.method2376(165);
            field486.method2165(Statics.field1789 + arg0);
            field486.method2120(class126.field1957[82] ? 1 : 0);
            field486.method2194(Statics.field941);
            field486.method2172(Statics.field1571 + arg1);
            field486.method2121(Statics.field836);
            field486.method2172(arg3 >> 14 & 0x7FFF);
            field486.method2311(Statics.field206);
        }
        if (arg2 == 4) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field370 = arg0;
            field457 = arg1;
            field486.method2376(246);
            field486.method2165(Statics.field1571 + arg1);
            field486.method2120(class126.field1957[82] ? 1 : 0);
            field486.method2311(arg3 >> 14 & 0x7FFF);
            field486.method2311(Statics.field1789 + arg0);
        }
        if (arg2 == 58) {
            class155 var25 = class155.method805(arg1, arg0);
            if (var25 != null) {
                field486.method2376(252);
                field486.method2165(field410);
                field486.method2194(arg1);
                field486.method2172(var25.field2644);
                field486.method2194(Statics.field2133);
                field486.method2172(arg0);
                field486.method2121(field411);
            }
        }
        if (arg2 == 30 && field477 == null) {
            field486.method2376(159);
            field486.method2121(arg0);
            field486.method2174(arg1);
            field477 = class155.method805(arg1, arg0);
            method2073(field477);
        }
        if (arg2 == 44) {
            class3 var26 = field372[arg3];
            if (var26 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(154);
                field486.method2157(class126.field1957[82] ? 1 : 0);
                field486.method2311(arg3);
            }
        }
        if (arg2 == 8) {
            class31 var27 = field289[arg3];
            if (var27 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(70);
                field486.method2165(field410);
                field486.method2121(arg3);
                field486.method2194(Statics.field2133);
                field486.method2306(class126.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 1004) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field486.method2376(103);
            field486.method2165(arg3);
        }
        if (arg2 == 46) {
            class3 var28 = field372[arg3];
            if (var28 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(92);
                field486.method2172(arg3);
                field486.method2306(class126.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 43) {
            field486.method2376(128);
            field486.method2165(arg3);
            field486.method2194(arg1);
            field486.method2172(arg0);
            field344 = 0;
            Statics.field2779 = class155.method1876(arg1);
            field364 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class155 var29 = class155.method805(arg1, arg0);
            if (var29 != null) {
                int var30 = var29.field2644;
                class155 var31 = class155.method805(arg1, arg0);
                if (var31 != null) {
                    if (var31.field2625 != null) {
                        class1 var32 = new class1();
                        var32.field3 = var31;
                        var32.field6 = arg3;
                        var32.field10 = arg5;
                        var32.field8 = var31.field2625;
                        class33.method1613(var32);
                    }
                    boolean var33 = true;
                    if (var31.field2541 > 0) {
                        var33 = method2410(var31);
                    }
                    if (var33) {
                        int var34 = method137(var31);
                        int var35 = arg3 - 1;
                        boolean var36 = (var34 >> var35 + 1 & 0x1) != 0;
                        if (var36) {
                            if (arg3 == 1) {
                                field486.method2376(42);
                                field486.method2123(arg1);
                                field486.method2121(arg0);
                                field486.method2121(var30);
                            }
                            if (arg3 == 2) {
                                field486.method2376(86);
                                field486.method2123(arg1);
                                field486.method2121(arg0);
                                field486.method2121(var30);
                            }
                            if (arg3 == 3) {
                                field486.method2376(123);
                                field486.method2123(arg1);
                                field486.method2121(arg0);
                                field486.method2121(var30);
                            }
                            if (arg3 == 4) {
                                field486.method2376(173);
                                field486.method2123(arg1);
                                field486.method2121(arg0);
                                field486.method2121(var30);
                            }
                            if (arg3 == 5) {
                                field486.method2376(151);
                                field486.method2123(arg1);
                                field486.method2121(arg0);
                                field486.method2121(var30);
                            }
                            if (arg3 == 6) {
                                field486.method2376(210);
                                field486.method2123(arg1);
                                field486.method2121(arg0);
                                field486.method2121(var30);
                            }
                            if (arg3 == 7) {
                                field486.method2376(112);
                                field486.method2123(arg1);
                                field486.method2121(arg0);
                                field486.method2121(var30);
                            }
                            if (arg3 == 8) {
                                field486.method2376(157);
                                field486.method2123(arg1);
                                field486.method2121(arg0);
                                field486.method2121(var30);
                            }
                            if (arg3 == 9) {
                                field486.method2376(137);
                                field486.method2123(arg1);
                                field486.method2121(arg0);
                                field486.method2121(var30);
                            }
                            if (arg3 == 10) {
                                field486.method2376(97);
                                field486.method2123(arg1);
                                field486.method2121(arg0);
                                field486.method2121(var30);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 20) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field370 = arg0;
            field457 = arg1;
            field486.method2376(52);
            field486.method2311(Statics.field1571 + arg1);
            field486.method2311(arg3);
            field486.method2311(Statics.field1789 + arg0);
            field486.method2306(class126.field1957[82] ? 1 : 0);
        }
        if (arg2 == 26) {
            field486.method2376(24);
            for (class4 var37 = (class4) field462.method3220(); var37 != null; var37 = (class4) field462.method3210()) {
                if (var37.field60 == 0 || var37.field60 == 3) {
                    method80(var37, true);
                }
            }
            if (field477 != null) {
                method2073(field477);
                field477 = null;
            }
        }
        if (arg2 == 25) {
            class155 var38 = class155.method805(arg1, arg0);
            if (var38 != null) {
                method2491();
                method85(arg1, arg0, class159.method116(method137(var38)), var38.field2644);
                field407 = 0;
                field412 = method732(var38);
                if (field412 == null) {
                    field412 = "Null";
                }
                if (var38.field2536) {
                    field413 = var38.field2598 + class2.method2597(16777215);
                } else {
                    field413 = class2.method2597(65280) + var38.field2640 + class2.method2597(16777215);
                }
            }
            return;
        }
        if (arg2 == 41) {
            field486.method2376(239);
            field486.method2121(arg3);
            field486.method2311(arg0);
            field486.method2174(arg1);
            field344 = 0;
            Statics.field2779 = class155.method1876(arg1);
            field364 = arg0;
        }
        if (arg2 == 49) {
            class3 var39 = field372[arg3];
            if (var39 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(29);
                field486.method2156(class126.field1957[82] ? 1 : 0);
                field486.method2121(arg3);
            }
        }
        if (arg2 == 38) {
            method2491();
            class155 var40 = class155.method1876(arg1);
            field407 = 1;
            Statics.field206 = arg0;
            Statics.field941 = arg1;
            Statics.field836 = arg3;
            method2073(var40);
            field455 = class2.method2597(16748608) + class46.method114(arg3).field1026 + class2.method2597(16777215);
            if (field455 == null) {
                field455 = "null";
            }
            return;
        }
        if (arg2 == 2) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field370 = arg0;
            field457 = arg1;
            field486.method2376(119);
            field486.method2121(Statics.field1571 + arg1);
            field486.method2123(Statics.field2133);
            field486.method2156(class126.field1957[82] ? 1 : 0);
            field486.method2165(arg3 >> 14 & 0x7FFF);
            field486.method2121(Statics.field1789 + arg0);
            field486.method2121(field410);
        }
        if (arg2 == 36) {
            field486.method2376(58);
            field486.method2121(arg3);
            field486.method2174(arg1);
            field486.method2165(arg0);
            field344 = 0;
            Statics.field2779 = class155.method1876(arg1);
            field364 = arg0;
        }
        if (arg2 == 33) {
            field486.method2376(40);
            field486.method2172(arg3);
            field486.method2174(arg1);
            field486.method2165(arg0);
            field344 = 0;
            Statics.field2779 = class155.method1876(arg1);
            field364 = arg0;
        }
        if (arg2 == 28) {
            field486.method2376(235);
            field486.method2123(arg1);
            class155 var41 = class155.method1876(arg1);
            if (var41.field2636 != null && var41.field2636[0][0] == 5) {
                int var42 = var41.field2636[0][1];
                class157.field2671[var42] = 1 - class157.field2671[var42];
                method3396(var42);
            }
        }
        if (arg2 == 18) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field370 = arg0;
            field457 = arg1;
            field486.method2376(88);
            field486.method2165(Statics.field1571 + arg1);
            field486.method2121(Statics.field1789 + arg0);
            field486.method2165(arg3);
            field486.method2156(class126.field1957[82] ? 1 : 0);
        }
        if (arg2 == 13) {
            class31 var43 = field289[arg3];
            if (var43 != null) {
                field495 = arg6;
                field360 = arg7;
                field362 = 2;
                field361 = 0;
                field370 = arg0;
                field457 = arg1;
                field486.method2376(169);
                field486.method2165(arg3);
                field486.method2157(class126.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 3) {
            field495 = arg6;
            field360 = arg7;
            field362 = 2;
            field361 = 0;
            field370 = arg0;
            field457 = arg1;
            field486.method2376(170);
            field486.method2165(Statics.field1789 + arg0);
            field486.method2121(arg3 >> 14 & 0x7FFF);
            field486.method2306(class126.field1957[82] ? 1 : 0);
            field486.method2121(Statics.field1571 + arg1);
        }
        if (arg2 == 24) {
            class155 var44 = class155.method1876(arg1);
            boolean var45 = true;
            if (var44.field2541 > 0) {
                var45 = method2410(var44);
            }
            if (var45) {
                field486.method2376(235);
                field486.method2123(arg1);
            }
        }
        if (field407 != 0) {
            field407 = 0;
            method2073(class155.method1876(Statics.field941));
        }
        if (field409) {
            method2491();
        }
        if (Statics.field2779 != null && field344 == 0) {
            method2073(Statics.field2779);
        }
    }

    @ObfuscatedName("bt.ba(ILjava/lang/String;I)V")
    public static void method1382(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field373; var3++) {
            class3 var4 = field372[field296[var3]];
            if (var4 != null && var4.field51 != null && var4.field51.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field486.method2376(154);
                    field486.method2157(0);
                    field486.method2311(field296[var3]);
                } else if (arg0 == 4) {
                    field486.method2376(132);
                    field486.method2156(0);
                    field486.method2172(field296[var3]);
                } else if (arg0 == 6) {
                    field486.method2376(29);
                    field486.method2156(0);
                    field486.method2121(field296[var3]);
                } else if (arg0 == 7) {
                    field486.method2376(77);
                    field486.method2157(0);
                    field486.method2121(field296[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class10.method100(4, "", class145.field2299 + arg1);
        }
    }

    @ObfuscatedName("g.bt(IIIII)V")
    public static void method85(int arg0, int arg1, int arg2, int arg3) {
        class155 var4 = class155.method805(arg0, arg1);
        if (var4 != null && var4.field2574 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field8 = var4.field2574;
            class33.method1613(var5);
        }
        field411 = arg3;
        field409 = true;
        Statics.field2133 = arg0;
        field410 = arg1;
        Statics.field542 = arg2;
        method2073(var4);
    }

    @ObfuscatedName("dg.bk(I)V")
    public static void method2491() {
        if (!field409) {
            return;
        }
        class155 var0 = class155.method805(Statics.field2133, field410);
        if (var0 != null && var0.field2617 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field8 = var0.field2617;
            class33.method1613(var1);
        }
        field409 = false;
        method2073(var0);
    }

    @ObfuscatedName("bk.bc(I)V")
    public static final void method1405() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field396 - 1; var1++) {
                if (field340[var1] < 1000 && field340[var1 + 1] > 1000) {
                    String var2 = field402[var1];
                    field402[var1] = field402[var1 + 1];
                    field402[var1 + 1] = var2;
                    String var3 = field401[var1];
                    field401[var1] = field401[var1 + 1];
                    field401[var1 + 1] = var3;
                    int var4 = field340[var1];
                    field340[var1] = field340[var1 + 1];
                    field340[var1 + 1] = var4;
                    int var5 = field397[var1];
                    field397[var1] = field397[var1 + 1];
                    field397[var1 + 1] = var5;
                    int var6 = field398[var1];
                    field398[var1] = field398[var1 + 1];
                    field398[var1 + 1] = var6;
                    int var7 = field400[var1];
                    field400[var1] = field400[var1 + 1];
                    field400[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ew.bj(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2727(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field403 || field396 >= 500) {
            return;
        }
        field401[field396] = arg0;
        field402[field396] = arg1;
        field340[field396] = arg2;
        field400[field396] = arg3;
        field397[field396] = arg4;
        field398[field396] = arg5;
        field396++;
    }

    @ObfuscatedName("g.bi(B)V")
    public static void method86() {
        for (int var0 = 0; var0 < field396; var0++) {
            int var1 = field340[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field396 - 1) {
                    for (int var3 = var0; var3 < field396 - 1; var3++) {
                        field401[var3] = field401[var3 + 1];
                        field402[var3] = field402[var3 + 1];
                        field340[var3] = field340[var3 + 1];
                        field400[var3] = field400[var3 + 1];
                        field397[var3] = field397[var3 + 1];
                        field398[var3] = field398[var3 + 1];
                    }
                }
                field396--;
            }
        }
    }

    @ObfuscatedName("aq.bs(II)Ljava/lang/String;")
    public static String method862(int arg0) {
        return field402[arg0].length() > 0 ? field401[arg0] + class145.field2310 + field402[arg0] : field401[arg0];
    }

    @ObfuscatedName("g.bx(IIIII)V")
    public static final void method98(int arg0, int arg1, int arg2, int arg3) {
        if (field407 == 0 && !field409) {
            method2727(class145.field2305, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class99.field1734; var6++) {
            int var7 = class99.field1735[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field2127.method1651(Statics.field168, var8, var9, var7) >= 0) {
                    class37 var12 = class37.method1041(var11);
                    if (var12.field868 != null) {
                        var12 = var12.method673();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field407 == 1) {
                        method2727(class145.field2300, field455 + " " + class2.field22 + " " + class2.method2597(65535) + var12.field850, 1, var7, var8, var9);
                    } else if (!field409) {
                        String[] var13 = var12.field867;
                        if (field449) {
                            var13 = method124(var13);
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
                                    method2727(var13[var14], class2.method2597(65535) + var12.field850, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2727(class145.field2301, class2.method2597(65535) + var12.field850, 1002, var12.field871 << 14, var8, var9);
                    } else if ((Statics.field542 & 0x4) == 4) {
                        method2727(field412, field413 + " " + class2.field22 + " " + class2.method2597(65535) + var12.field850, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class31 var16 = field289[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field699.field804 == 1 && (var16.field780 & 0x7F) == 64 && (var16.field727 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field290; var17++) {
                            class31 var18 = field289[field291[var17]];
                            if (var18 != null && var16 != var18 && var18.field699.field804 == 1 && var16.field780 == var18.field780 && var16.field727 == var18.field727) {
                                method81(var18.field699, field291[var17], var8, var9);
                            }
                        }
                        for (int var19 = 0; var19 < field373; var19++) {
                            class3 var20 = field372[field296[var19]];
                            if (var20 != null && var16.field780 == var20.field780 && var16.field727 == var20.field727) {
                                method540(var20, field296[var19], var8, var9);
                            }
                        }
                    }
                    method81(var16.field699, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var21 = field372[var11];
                    if (var21 == null) {
                        continue;
                    }
                    if ((var21.field780 & 0x7F) == 64 && (var21.field727 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < field290; var22++) {
                            class31 var23 = field289[field291[var22]];
                            if (var23 != null && var23.field699.field804 == 1 && var21.field780 == var23.field780 && var21.field727 == var23.field727) {
                                method81(var23.field699, field291[var22], var8, var9);
                            }
                        }
                        for (int var24 = 0; var24 < field373; var24++) {
                            class3 var25 = field372[field296[var24]];
                            if (var25 != null && var21 != var25 && var21.field780 == var25.field780 && var21.field727 == var25.field727) {
                                method540(var25, field296[var24], var8, var9);
                            }
                        }
                    }
                    if (field386 == var11) {
                        var4 = var7;
                    } else {
                        method540(var21, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class180 var26 = field387[Statics.field168][var8][var9];
                    if (var26 != null) {
                        for (class26 var27 = (class26) var26.method3247(); var27 != null; var27 = (class26) var26.method3246()) {
                            class46 var28 = class46.method114(var27.field622);
                            if (field407 == 1) {
                                method2727(class145.field2300, field455 + " " + class2.field22 + " " + class2.method2597(16748608) + var28.field1026, 16, var27.field622, var8, var9);
                            } else if (!field409) {
                                String[] var29 = var28.field1033;
                                if (field449) {
                                    var29 = method124(var29);
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
                                        method2727(var29[var30], class2.method2597(16748608) + var28.field1026, var31, var27.field622, var8, var9);
                                    } else if (var30 == 2) {
                                        method2727(class145.field2151, class2.method2597(16748608) + var28.field1026, 20, var27.field622, var8, var9);
                                    }
                                }
                                method2727(class145.field2301, class2.method2597(16748608) + var28.field1026, 1004, var27.field622, var8, var9);
                            } else if ((Statics.field542 & 0x1) == 1) {
                                method2727(field412, field413 + " " + class2.field22 + " " + class2.method2597(16748608) + var28.field1026, 17, var27.field622, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var32 = var4 & 0x7F;
            int var33 = var4 >> 7 & 0x7F;
            class3 var34 = field372[field386];
            method540(var34, field386, var32, var33);
        }
    }

    @ObfuscatedName("k.bl(Lab;IIIB)V")
    public static final void method81(class36 arg0, int arg1, int arg2, int arg3) {
        if (field396 >= 400) {
            return;
        }
        if (arg0.field828 != null) {
            arg0 = arg0.method599();
        }
        if (arg0 == null || !arg0.field831 || arg0.field833 && field422 != arg1) {
            return;
        }
        String var4 = arg0.field825;
        if (arg0.field798 != 0) {
            var4 = var4 + method1880(arg0.field798, Statics.field524.field37) + " " + class2.field21 + class145.field2306 + arg0.field798 + class2.field26;
        }
        if (field407 == 1) {
            method2727(class145.field2300, field455 + " " + class2.field22 + " " + class2.method2597(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field409) {
            String[] var5 = arg0.field820;
            if (field449) {
                var5 = method124(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class145.field2234)) {
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
                        method2727(var5[var6], class2.method2597(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class145.field2234)) {
                        short var9 = 0;
                        if (field277 == class18.field517 || field277 == class18.field519 && arg0.field798 > Statics.field524.field37) {
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
                        method2727(var5[var8], class2.method2597(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method2727(class145.field2301, class2.method2597(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field542 & 0x2) == 2) {
            method2727(field412, field413 + " " + class2.field22 + " " + class2.method2597(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ae.bd(Ly;IIIB)V")
    public static final void method540(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field524 == arg0 || field396 >= 400) {
            return;
        }
        String var4;
        if (arg0.field38 == 0) {
            var4 = arg0.field51 + method1880(arg0.field37, Statics.field524.field37) + " " + class2.field21 + class145.field2306 + arg0.field37 + class2.field26;
        } else {
            var4 = arg0.field51 + " " + class2.field21 + class145.field2293 + arg0.field38 + class2.field26;
        }
        if (field407 == 1) {
            method2727(class145.field2300, field455 + " " + class2.field22 + " " + class2.method2597(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field409) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field298[var5] != null) {
                    short var6 = 0;
                    if (field298[var5].equalsIgnoreCase(class145.field2234)) {
                        if (field277 == class18.field517 || field277 == class18.field519 && arg0.field37 > Statics.field524.field37) {
                            var6 = 2000;
                        }
                        if (Statics.field524.field41 != 0 && arg0.field41 != 0) {
                            if (Statics.field524.field41 == arg0.field41) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field314[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field245[var5] + var6;
                    method2727(field298[var5], class2.method2597(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field542 & 0x8) == 8) {
            method2727(field412, field413 + " " + class2.field22 + " " + class2.method2597(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field396; var9++) {
            if (field340[var9] == 23) {
                field402[var9] = class2.method2597(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ct.cg(IIB)Ljava/lang/String;")
    public static final String method1880(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2597(16711680);
        } else if (var2 < -6) {
            return class2.method2597(16723968);
        } else if (var2 < -3) {
            return class2.method2597(16740352);
        } else if (var2 < 0) {
            return class2.method2597(16756736);
        } else if (var2 > 9) {
            return class2.method2597(65280);
        } else if (var2 > 6) {
            return class2.method2597(4259584);
        } else if (var2 > 3) {
            return class2.method2597(8453888);
        } else if (var2 > 0) {
            return class2.method2597(12648192);
        } else {
            return class2.method2597(16776960);
        }
    }

    @ObfuscatedName("ag.ck(IIIIIIIIB)V")
    public static final void method534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class155.method128(arg0)) {
            Statics.field1067 = null;
            method1895(Statics.field2621[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1067 != null) {
                method1895(Statics.field1067, -1412584499, arg1, arg2, arg3, arg4, Statics.field690, Statics.field141, arg7);
                Statics.field1067 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field384[var8] = true;
            }
        } else {
            field384[arg7] = true;
        }
    }

    @ObfuscatedName("ca.cu([Led;IIIIIIIIB)V")
    public static final void method1895(class155[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class74.method1524(arg2, arg3, arg4, arg5);
        class85.method1843();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class155 var10 = arg0[var9];
            if (var10 != null && (var10.field2548 == arg1 || arg1 == -1412584499 && field464 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field463[field275] = var10.field2542 + arg6;
                    field321[field275] = var10.field2607 + arg7;
                    field268[field275] = var10.field2546;
                    field466[field275] = var10.field2555;
                    var11 = ++field275 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2655 = var11;
                var10.field2656 = field493;
                if (!var10.field2536 || !method2715(var10)) {
                    if (var10.field2541 > 0) {
                        int var12 = var10.field2541;
                        if (var12 == 324) {
                            if (field447 == -1) {
                                field447 = var10.field2561;
                                field513 = var10.field2616;
                            }
                            if (field414.field2683) {
                                var10.field2561 = field447;
                            } else {
                                var10.field2561 = field513;
                            }
                        } else if (var12 == 325) {
                            if (field447 == -1) {
                                field447 = var10.field2561;
                                field513 = var10.field2616;
                            }
                            if (field414.field2683) {
                                var10.field2561 = field513;
                            } else {
                                var10.field2561 = field447;
                            }
                        } else if (var12 == 327) {
                            var10.field2529 = 150;
                            var10.field2578 = (int) (Math.sin((double) field493 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2569 = 5;
                            var10.field2650 = 0;
                        } else if (var12 == 328) {
                            var10.field2529 = 150;
                            var10.field2578 = (int) (Math.sin((double) field493 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2569 = 5;
                            var10.field2650 = 1;
                        }
                    }
                    int var13 = var10.field2542 + arg6;
                    int var14 = var10.field2607 + arg7;
                    int var15 = var10.field2577;
                    if (field464 == var10) {
                        if (arg1 != -1412584499 && !var10.field2603) {
                            Statics.field1067 = arg0;
                            Statics.field690 = arg6;
                            Statics.field141 = arg7;
                            continue;
                        }
                        if (field453 && field431) {
                            int var16 = class129.field1987;
                            int var17 = class129.field1988;
                            int var18 = var16 - field512;
                            int var19 = var17 - field284;
                            if (var18 < field247) {
                                var18 = field247;
                            }
                            if (var10.field2546 + var18 > field247 + field427.field2546) {
                                var18 = field247 + field427.field2546 - var10.field2546;
                            }
                            if (var19 < field433) {
                                var19 = field433;
                            }
                            if (var10.field2555 + var19 > field433 + field427.field2555) {
                                var19 = field433 + field427.field2555 - var10.field2555;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2603) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2539 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2539 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2546 + var13;
                        int var27 = var10.field2555 + var14;
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
                        int var30 = var10.field2546 + var13;
                        int var31 = var10.field2555 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2536 || var20 < var22 && var21 < var23) {
                        if (var10.field2541 != 0) {
                            if (var10.field2541 == 1337) {
                                field382 = var13;
                                field404 = var14;
                                int var32 = var10.field2546;
                                int var33 = var10.field2555;
                                class74.method1524(var13, var14, var13 + var32, var14 + var33);
                                class85.method1843();
                                field356++;
                                method507(class30.field694);
                                boolean var34 = false;
                                if (field386 >= 0) {
                                    for (int var35 = 0; var35 < field373; var35++) {
                                        if (field386 == field296[var35]) {
                                            var34 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var34) {
                                    method507(class30.field691);
                                }
                                method595(true);
                                method507(var34 ? class30.field693 : class30.field692);
                                method595(false);
                                for (class7 var36 = (class7) field389.method3249(); var36 != null; var36 = (class7) field389.method3248()) {
                                    if (Statics.field168 != var36.field97 || field493 > var36.field103) {
                                        var36.method3334();
                                    } else if (field493 >= var36.field102) {
                                        if (var36.field106 > 0) {
                                            class31 var37 = field289[var36.field106 - 1];
                                            if (var37 != null && var37.field780 >= 0 && var37.field780 < 13312 && var37.field727 >= 0 && var37.field727 < 13312) {
                                                var36.method68(var37.field780, var37.field727, method77(var37.field780, var37.field727, var36.field97) - var36.field99, field493);
                                            }
                                        }
                                        if (var36.field106 < 0) {
                                            int var38 = -var36.field106 - 1;
                                            class3 var39;
                                            if (field378 == var38) {
                                                var39 = Statics.field524;
                                            } else {
                                                var39 = field372[var38];
                                            }
                                            if (var39 != null && var39.field780 >= 0 && var39.field780 < 13312 && var39.field727 >= 0 && var39.field727 < 13312) {
                                                var36.method68(var39.field780, var39.field727, method77(var39.field780, var39.field727, var36.field97) - var36.field99, field493);
                                            }
                                        }
                                        var36.method73(field375);
                                        Statics.field2127.method1717(Statics.field168, (int) var36.field96, (int) var36.field109, (int) var36.field108, 60, var36, var36.field100, -1, false);
                                    }
                                }
                                for (class27 var40 = (class27) field428.method3249(); var40 != null; var40 = (class27) field428.method3248()) {
                                    if (Statics.field168 != var40.field628 || var40.field632) {
                                        var40.method3334();
                                    } else if (field493 >= var40.field627) {
                                        var40.method523(field375);
                                        if (var40.field632) {
                                            var40.method3334();
                                        } else {
                                            Statics.field2127.method1717(var40.field628, var40.field629, var40.field630, var40.field631, 60, var40, 0, -1, false);
                                        }
                                    }
                                }
                                if (!field510) {
                                    int var41 = field336;
                                    if (field425 / 256 > var41) {
                                        var41 = field425 / 256;
                                    }
                                    if (field261[4] && field502[4] + 128 > var41) {
                                        var41 = field502[4] + 128;
                                    }
                                    int var42 = field363 + field320 & 0x7FF;
                                    int var43 = Statics.field2078;
                                    int var44 = method77(Statics.field524.field780, Statics.field524.field727, Statics.field168) - 50;
                                    int var45 = Statics.field2113;
                                    int var46 = var41 * 3 + 600;
                                    int var47 = 2048 - var41 & 0x7FF;
                                    int var48 = 2048 - var42 & 0x7FF;
                                    int var49 = 0;
                                    int var50 = 0;
                                    int var51 = var46;
                                    if (var47 != 0) {
                                        int var52 = class85.field1472[var47];
                                        int var53 = class85.field1473[var47];
                                        int var54 = var50 * var53 - var46 * var52 >> 16;
                                        var51 = var50 * var52 + var46 * var53 >> 16;
                                        var50 = var54;
                                    }
                                    if (var48 != 0) {
                                        int var55 = class85.field1472[var48];
                                        int var56 = class85.field1473[var48];
                                        int var57 = var49 * var56 + var51 * var55 >> 16;
                                        var51 = var51 * var56 - var49 * var55 >> 16;
                                        var49 = var57;
                                    }
                                    Statics.field666 = var43 - var49;
                                    Statics.field590 = var44 - var50;
                                    Statics.field557 = var45 - var51;
                                    Statics.field54 = var41;
                                    Statics.field220 = var42;
                                }
                                int var70;
                                if (field510) {
                                    var70 = method471();
                                } else {
                                    int var58;
                                    if (Statics.field2103.field138) {
                                        var58 = Statics.field168;
                                    } else {
                                        int var59 = 3;
                                        if (Statics.field54 < 310) {
                                            int var60 = Statics.field666 >> 7;
                                            int var61 = Statics.field557 >> 7;
                                            int var62 = Statics.field524.field780 >> 7;
                                            int var63 = Statics.field524.field727 >> 7;
                                            if ((class6.field77[Statics.field168][var60][var61] & 0x4) != 0) {
                                                var59 = Statics.field168;
                                            }
                                            int var64;
                                            if (var62 > var60) {
                                                var64 = var62 - var60;
                                            } else {
                                                var64 = var60 - var62;
                                            }
                                            int var65;
                                            if (var63 > var61) {
                                                var65 = var63 - var61;
                                            } else {
                                                var65 = var61 - var63;
                                            }
                                            if (var64 > var65) {
                                                int var66 = var65 * 65536 / var64;
                                                int var67 = 32768;
                                                while (var60 != var62) {
                                                    if (var60 < var62) {
                                                        var60++;
                                                    } else if (var60 > var62) {
                                                        var60--;
                                                    }
                                                    if ((class6.field77[Statics.field168][var60][var61] & 0x4) != 0) {
                                                        var59 = Statics.field168;
                                                    }
                                                    var67 += var66;
                                                    if (var67 >= 65536) {
                                                        var67 -= 65536;
                                                        if (var61 < var63) {
                                                            var61++;
                                                        } else if (var61 > var63) {
                                                            var61--;
                                                        }
                                                        if ((class6.field77[Statics.field168][var60][var61] & 0x4) != 0) {
                                                            var59 = Statics.field168;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var68 = var64 * 65536 / var65;
                                                int var69 = 32768;
                                                while (var61 != var63) {
                                                    if (var61 < var63) {
                                                        var61++;
                                                    } else if (var61 > var63) {
                                                        var61--;
                                                    }
                                                    if ((class6.field77[Statics.field168][var60][var61] & 0x4) != 0) {
                                                        var59 = Statics.field168;
                                                    }
                                                    var69 += var68;
                                                    if (var69 >= 65536) {
                                                        var69 -= 65536;
                                                        if (var60 < var62) {
                                                            var60++;
                                                        } else if (var60 > var62) {
                                                            var60--;
                                                        }
                                                        if ((class6.field77[Statics.field168][var60][var61] & 0x4) != 0) {
                                                            var59 = Statics.field168;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class6.field77[Statics.field168][Statics.field524.field780 >> 7][Statics.field524.field727 >> 7] & 0x4) != 0) {
                                            var59 = Statics.field168;
                                        }
                                        var58 = var59;
                                    }
                                    var70 = var58;
                                }
                                int var71 = Statics.field666;
                                int var72 = Statics.field590;
                                int var73 = Statics.field557;
                                int var74 = Statics.field54;
                                int var75 = Statics.field220;
                                for (int var76 = 0; var76 < 5; var76++) {
                                    if (field261[var76]) {
                                        int var77 = (int) (Math.random() * (double) (field501[var76] * 2 + 1) - (double) field501[var76] + Math.sin((double) field343[var76] / 100.0D * (double) field504[var76]) * (double) field502[var76]);
                                        if (var76 == 0) {
                                            Statics.field666 += var77;
                                        }
                                        if (var76 == 1) {
                                            Statics.field590 += var77;
                                        }
                                        if (var76 == 2) {
                                            Statics.field557 += var77;
                                        }
                                        if (var76 == 3) {
                                            Statics.field220 = Statics.field220 + var77 & 0x7FF;
                                        }
                                        if (var76 == 4) {
                                            Statics.field54 += var77;
                                            if (Statics.field54 < 128) {
                                                Statics.field54 = 128;
                                            }
                                            if (Statics.field54 > 383) {
                                                Statics.field54 = 383;
                                            }
                                        }
                                    }
                                }
                                int var78 = class129.field1987;
                                int var79 = class129.field1988;
                                if (class129.field1986 != 0) {
                                    var78 = class129.field1999;
                                    var79 = class129.field2000;
                                }
                                if (var78 >= var13 && var78 < var13 + var32 && var79 >= var14 && var79 < var14 + var33) {
                                    class99.field1731 = true;
                                    class99.field1734 = 0;
                                    class99.field1701 = var78 - var13;
                                    class99.field1733 = var79 - var14;
                                } else {
                                    class99.field1731 = false;
                                    class99.field1734 = 0;
                                }
                                method561();
                                class74.method1530(var13, var14, var32, var33, 0);
                                method561();
                                Statics.field2127.method1783(Statics.field666, Statics.field590, Statics.field557, Statics.field54, Statics.field220, var70);
                                method561();
                                Statics.field2127.method1635();
                                field345 = 0;
                                boolean var80 = false;
                                int var81 = -1;
                                for (int var82 = -1; var82 < field373 + field290; var82++) {
                                    class34 var83;
                                    if (var82 == -1) {
                                        var83 = Statics.field524;
                                    } else if (var82 < field373) {
                                        var83 = field372[field296[var82]];
                                        if (field386 == field296[var82]) {
                                            var80 = true;
                                            var81 = var82;
                                            continue;
                                        }
                                    } else {
                                        var83 = field289[field291[var82 - field373]];
                                    }
                                    method890(var83, var82, var13, var14, var32, var33);
                                }
                                if (var80) {
                                    method890(field372[field386], var81, var13, var14, var32, var33);
                                }
                                for (int var84 = 0; var84 < field345; var84++) {
                                    int var85 = field347[var84];
                                    int var86 = field348[var84];
                                    int var87 = field350[var84];
                                    int var88 = field349[var84];
                                    boolean var89 = true;
                                    while (var89) {
                                        var89 = false;
                                        for (int var90 = 0; var90 < var84; var90++) {
                                            if (var86 + 2 > field348[var90] - field349[var90] && var86 - var88 < field348[var90] + 2 && var85 - var87 < field350[var90] + field347[var90] && var85 + var87 > field347[var90] - field350[var90] && field348[var90] - field349[var90] < var86) {
                                                var86 = field348[var90] - field349[var90];
                                                var89 = true;
                                            }
                                        }
                                    }
                                    field459 = field347[var84];
                                    field359 = field348[var84] = var86;
                                    String var91 = field379[var84];
                                    if (field416 == 0) {
                                        int var92 = 16776960;
                                        if (field351[var84] < 6) {
                                            var92 = field468[field351[var84]];
                                        }
                                        if (field351[var84] == 6) {
                                            var92 = field356 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field351[var84] == 7) {
                                            var92 = field356 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field351[var84] == 8) {
                                            var92 = field356 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field351[var84] == 9) {
                                            int var93 = 150 - field353[var84];
                                            if (var93 < 50) {
                                                var92 = var93 * 1280 + 16711680;
                                            } else if (var93 < 100) {
                                                var92 = 16776960 - (var93 - 50) * 327680;
                                            } else if (var93 < 150) {
                                                var92 = (var93 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field351[var84] == 10) {
                                            int var94 = 150 - field353[var84];
                                            if (var94 < 50) {
                                                var92 = var94 * 5 + 16711680;
                                            } else if (var94 < 100) {
                                                var92 = 16711935 - (var94 - 50) * 327680;
                                            } else if (var94 < 150) {
                                                var92 = (var94 - 100) * 327680 + 255 - (var94 - 100) * 5;
                                            }
                                        }
                                        if (field351[var84] == 11) {
                                            int var95 = 150 - field353[var84];
                                            if (var95 < 50) {
                                                var92 = 16777215 - var95 * 327685;
                                            } else if (var95 < 100) {
                                                var92 = (var95 - 50) * 327685 + 65280;
                                            } else if (var95 < 150) {
                                                var92 = 16777215 - (var95 - 100) * 327680;
                                            }
                                        }
                                        if (field352[var84] == 0) {
                                            Statics.field474.method3513(var91, field459 + var13, field359 + var14, var92, 0);
                                        }
                                        if (field352[var84] == 1) {
                                            Statics.field474.method3448(var91, field459 + var13, field359 + var14, var92, 0, field356);
                                        }
                                        if (field352[var84] == 2) {
                                            Statics.field474.method3449(var91, field459 + var13, field359 + var14, var92, 0, field356);
                                        }
                                        if (field352[var84] == 3) {
                                            Statics.field474.method3450(var91, field459 + var13, field359 + var14, var92, 0, field356, 150 - field353[var84]);
                                        }
                                        if (field352[var84] == 4) {
                                            int var96 = (150 - field353[var84]) * (Statics.field474.method3439(var91) + 100) / 150;
                                            class74.method1525(field459 + var13 - 50, var14, field459 + var13 + 50, var14 + var33);
                                            Statics.field474.method3497(var91, field459 + var13 + 50 - var96, field359 + var14, var92, 0);
                                            class74.method1524(var13, var14, var13 + var32, var14 + var33);
                                        }
                                        if (field352[var84] == 5) {
                                            int var97 = 150 - field353[var84];
                                            int var98 = 0;
                                            if (var97 < 25) {
                                                var98 = var97 - 25;
                                            } else if (var97 > 125) {
                                                var98 = var97 - 125;
                                            }
                                            class74.method1525(var13, field359 + var14 - Statics.field474.field2961 - 1, var13 + var32, field359 + var14 + 5);
                                            Statics.field474.method3513(var91, field459 + var13, field359 + var14 + var98, var92, 0);
                                            class74.method1524(var13, var14, var13 + var32, var14 + var33);
                                        }
                                    } else {
                                        Statics.field474.method3513(var91, field459 + var13, field359 + var14, 16776960, 0);
                                    }
                                }
                                if (field390 == 2) {
                                    method2((field271 - Statics.field1789 << 7) + field274, (field385 - Statics.field1571 << 7) + field460, field273 * 2);
                                    if (field459 > -1 && field493 % 20 < 10) {
                                        Statics.field540[0].method1507(field459 + var13 - 12, field359 + var14 - 28);
                                    }
                                }
                                ((class89) Statics.field1469).method1884(field375);
                                if (field362 == 1) {
                                    Statics.field1865[field361 / 100].method1507(field495 - 8, field360 - 8);
                                }
                                if (field362 == 2) {
                                    Statics.field1865[field361 / 100 + 4].method1507(field495 - 8, field360 - 8);
                                }
                                field371 = 0;
                                int var99 = (Statics.field524.field780 >> 7) + Statics.field1789;
                                int var100 = (Statics.field524.field727 >> 7) + Statics.field1571;
                                if (var99 >= 3053 && var99 <= 3156 && var100 >= 3056 && var100 <= 3136) {
                                    field371 = 1;
                                }
                                if (var99 >= 3072 && var99 <= 3118 && var100 >= 9492 && var100 <= 9535) {
                                    field371 = 1;
                                }
                                if (field371 == 1 && var99 >= 3139 && var99 <= 3199 && var100 >= 3008 && var100 <= 3062) {
                                    field371 = 0;
                                }
                                if (field266) {
                                    int var101 = var13 + 512 - 5;
                                    int var102 = var14 + 20;
                                    Statics.field2146.method3445("Fps:" + field2036, var101, var102, 16776960, -1);
                                    int var194 = var102 + 15;
                                    Runtime var103 = Runtime.getRuntime();
                                    int var104 = (int) ((var103.totalMemory() - var103.freeMemory()) / 1024L);
                                    int var105 = 16776960;
                                    if (var104 > 32768 && field255) {
                                        var105 = 16711680;
                                    }
                                    if (var104 > 65536 && !field255) {
                                        var105 = 16711680;
                                    }
                                    Statics.field2146.method3445("Mem:" + var104 + "k", var101, var194, var105, -1);
                                    var102 = var194 + 15;
                                }
                                Statics.field666 = var71;
                                Statics.field590 = var72;
                                Statics.field557 = var73;
                                Statics.field54 = var74;
                                Statics.field220 = var75;
                                if (field258) {
                                    byte var106 = 0;
                                    int var107 = class153.field2518 + class153.field2501 + var106;
                                    if (var107 == 0) {
                                        field258 = false;
                                    }
                                }
                                if (field258) {
                                    class74.method1530(var13, var14, var32, var33, 0);
                                    method2693(class145.field2159, false);
                                }
                                class74.method1524(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2541 == 1338) {
                                method492(var13, var14, var11);
                                class74.method1524(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2539 == 0) {
                            if (!var10.field2536 && method2715(var10) && Statics.field1971 != var10) {
                                continue;
                            }
                            if (!var10.field2536) {
                                if (var10.field2558 > var10.field2553 - var10.field2555) {
                                    var10.field2558 = var10.field2553 - var10.field2555;
                                }
                                if (var10.field2558 < 0) {
                                    var10.field2558 = 0;
                                }
                            }
                            method1895(arg0, var10.field2537, var20, var21, var22, var23, var13 - var10.field2594, var14 - var10.field2558, var11);
                            if (var10.field2648 != null) {
                                method1895(var10.field2648, var10.field2537, var20, var21, var22, var23, var13 - var10.field2594, var14 - var10.field2558, var11);
                            }
                            class4 var109 = (class4) field462.method3206((long) var10.field2537);
                            if (var109 != null) {
                                method534(var109.field64, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class74.method1524(arg2, arg3, arg4, arg5);
                            class85.method1843();
                        }
                        if (field408[var11] || field467 > 1) {
                            if (var10.field2539 == 0 && !var10.field2536 && var10.field2553 > var10.field2555) {
                                int var110 = var10.field2546 + var13;
                                int var111 = var10.field2558;
                                int var112 = var10.field2555;
                                int var113 = var10.field2553;
                                Statics.field2014[0].method1587(var110, var14);
                                Statics.field2014[1].method1587(var110, var14 + var112 - 16);
                                class74.method1530(var110, var14 + 16, 16, var112 - 32, field383);
                                int var114 = (var112 - 32) * var112 / var113;
                                if (var114 < 8) {
                                    var114 = 8;
                                }
                                int var115 = (var112 - 32 - var114) * var111 / (var113 - var112);
                                class74.method1530(var110, var14 + 16 + var115, 16, var114, field434);
                                class74.method1581(var110, var14 + 16 + var115, var114, field333);
                                class74.method1581(var110 + 1, var14 + 16 + var115, var114, field333);
                                class74.method1534(var110, var14 + 16 + var115, 16, field333);
                                class74.method1534(var110, var14 + 17 + var115, 16, field333);
                                class74.method1581(var110 + 15, var14 + 16 + var115, var114, field369);
                                class74.method1581(var110 + 14, var14 + 17 + var115, var114 - 1, field369);
                                class74.method1534(var110, var14 + 15 + var115 + var114, 16, field369);
                                class74.method1534(var110 + 1, var14 + 14 + var115 + var114, 15, field369);
                            }
                            if (var10.field2539 != 1) {
                                if (var10.field2539 == 2) {
                                    int var116 = 0;
                                    for (int var117 = 0; var117 < var10.field2555; var117++) {
                                        for (int var118 = 0; var118 < var10.field2546; var118++) {
                                            int var119 = (var10.field2591 + 32) * var118 + var13;
                                            int var120 = (var10.field2592 + 32) * var117 + var14;
                                            if (var116 < 20) {
                                                var119 += var10.field2593[var116];
                                                var120 += var10.field2547[var116];
                                            }
                                            if (var10.field2540[var116] > 0) {
                                                boolean var121 = false;
                                                boolean var122 = false;
                                                int var123 = var10.field2540[var116] - 1;
                                                if (var119 + 32 > arg2 && var119 < arg4 && var120 + 32 > arg3 && var120 < arg5 || Statics.field923 == var10 && field246 == var116) {
                                                    class73 var124;
                                                    if (field407 == 1 && Statics.field206 == var116 && Statics.field941 == var10.field2537) {
                                                        var124 = class46.method790(var123, var10.field2643[var116], 2, 0, 2, false);
                                                    } else {
                                                        var124 = class46.method790(var123, var10.field2643[var116], 1, 3153952, 2, false);
                                                    }
                                                    if (var124 == null) {
                                                        method2073(var10);
                                                    } else if (Statics.field923 == var10 && field246 == var116) {
                                                        int var125 = class129.field1987 - field279;
                                                        int var126 = class129.field1988 - field319;
                                                        if (var125 < 5 && var125 > -5) {
                                                            var125 = 0;
                                                        }
                                                        if (var126 < 5 && var126 > -5) {
                                                            var126 = 0;
                                                        }
                                                        if (field405 < 5) {
                                                            var125 = 0;
                                                            var126 = 0;
                                                        }
                                                        var124.method1476(var119 + var125, var120 + var126, 128);
                                                        if (arg1 != -1) {
                                                            class155 var127 = arg0[arg1 & 0xFFFF];
                                                            if (var120 + var126 < class74.field1309 && var127.field2558 > 0) {
                                                                int var128 = field375 * (class74.field1309 - var120 - var126) / 3;
                                                                if (var128 > field375 * 10) {
                                                                    var128 = field375 * 10;
                                                                }
                                                                if (var128 > var127.field2558) {
                                                                    var128 = var127.field2558;
                                                                }
                                                                var127.field2558 -= var128;
                                                                field319 += var128;
                                                                method2073(var127);
                                                            }
                                                            if (var120 + var126 + 32 > class74.field1310 && var127.field2558 < var127.field2553 - var127.field2555) {
                                                                int var129 = field375 * (var120 + var126 + 32 - class74.field1310) / 3;
                                                                if (var129 > field375 * 10) {
                                                                    var129 = field375 * 10;
                                                                }
                                                                if (var129 > var127.field2553 - var127.field2555 - var127.field2558) {
                                                                    var129 = var127.field2553 - var127.field2555 - var127.field2558;
                                                                }
                                                                var127.field2558 += var129;
                                                                field319 -= var129;
                                                                method2073(var127);
                                                            }
                                                        }
                                                    } else if (Statics.field2779 == var10 && field364 == var116) {
                                                        var124.method1476(var119, var120, 128);
                                                    } else {
                                                        var124.method1507(var119, var120);
                                                    }
                                                }
                                            } else if (var10.field2595 != null && var116 < 20) {
                                                class73 var130 = var10.method2882(var116);
                                                if (var130 != null) {
                                                    var130.method1507(var119, var120);
                                                } else if (class155.field2528) {
                                                    method2073(var10);
                                                }
                                            }
                                            var116++;
                                        }
                                    }
                                } else if (var10.field2539 == 3) {
                                    int var131;
                                    if (method2872(var10)) {
                                        var131 = var10.field2559;
                                        if (Statics.field1971 == var10 && var10.field2557 != 0) {
                                            var131 = var10.field2557;
                                        }
                                    } else {
                                        var131 = var10.field2571;
                                        if (Statics.field1971 == var10 && var10.field2642 != 0) {
                                            var131 = var10.field2642;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2585) {
                                            class74.method1530(var13, var14, var10.field2546, var10.field2555, var131);
                                        } else {
                                            class74.method1538(var13, var14, var10.field2546, var10.field2555, var131);
                                        }
                                    } else if (var10.field2585) {
                                        class74.method1529(var13, var14, var10.field2546, var10.field2555, var131, 256 - (var15 & 0xFF));
                                    } else {
                                        class74.method1533(var13, var14, var10.field2546, var10.field2555, var131, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2539 == 4) {
                                    class205 var132 = var10.method2876();
                                    if (var132 != null) {
                                        String var133 = var10.field2596;
                                        int var134;
                                        if (method2872(var10)) {
                                            var134 = var10.field2559;
                                            if (Statics.field1971 == var10 && var10.field2557 != 0) {
                                                var134 = var10.field2557;
                                            }
                                            if (var10.field2631.length() > 0) {
                                                var133 = var10.field2631;
                                            }
                                        } else {
                                            var134 = var10.field2571;
                                            if (Statics.field1971 == var10 && var10.field2642 != 0) {
                                                var134 = var10.field2642;
                                            }
                                        }
                                        if (var10.field2536 && var10.field2644 != -1) {
                                            class46 var135 = class46.method114(var10.field2644);
                                            var133 = var135.field1026;
                                            if (var133 == null) {
                                                var133 = "null";
                                            }
                                            if ((var135.field1034 == 1 || var10.field2645 != 1) && var10.field2645 != -1) {
                                                var133 = class2.method2597(16748608) + var133 + class2.field25 + " " + 'x' + method121(var10.field2645);
                                            }
                                        }
                                        if (field477 == var10) {
                                            class145 var10000 = (class145) null;
                                            var133 = class145.field2308;
                                            var134 = var10.field2571;
                                        }
                                        if (!var10.field2536) {
                                            var133 = method704(var133, var10);
                                        }
                                        var132.method3447(var133, var13, var14, var10.field2546, var10.field2555, var134, var10.field2590 ? 0 : -1, var10.field2588, var10.field2550, var10.field2587);
                                    } else if (class155.field2528) {
                                        method2073(var10);
                                    }
                                } else if (var10.field2539 == 5) {
                                    if (var10.field2536) {
                                        class73 var137;
                                        if (var10.field2644 == -1) {
                                            var137 = var10.method2880(false);
                                        } else {
                                            var137 = class46.method790(var10.field2644, var10.field2645, var10.field2565, var10.field2566, var10.field2614, false);
                                        }
                                        if (var137 != null) {
                                            int var138 = var137.field1299;
                                            int var139 = var137.field1300;
                                            if (var10.field2532) {
                                                class74.method1525(var13, var14, var10.field2546 + var13, var10.field2555 + var14);
                                                int var140 = (var10.field2546 + (var138 - 1)) / var138;
                                                int var141 = (var10.field2555 + (var139 - 1)) / var139;
                                                for (int var142 = 0; var142 < var140; var142++) {
                                                    for (int var143 = 0; var143 < var141; var143++) {
                                                        if (var10.field2563 != 0) {
                                                            var137.method1499(var138 / 2 + var138 * var142 + var13, var139 / 2 + var139 * var143 + var14, var10.field2563, 4096);
                                                        } else if (var15 == 0) {
                                                            var137.method1507(var138 * var142 + var13, var139 * var143 + var14);
                                                        } else {
                                                            var137.method1476(var138 * var142 + var13, var139 * var143 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class74.method1524(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var144 = var10.field2546 * 4096 / var138;
                                                if (var10.field2563 != 0) {
                                                    var137.method1499(var10.field2546 / 2 + var13, var10.field2555 / 2 + var14, var10.field2563, var144);
                                                } else if (var15 != 0) {
                                                    var137.method1445(var13, var14, var10.field2546, var10.field2555, 256 - (var15 & 0xFF));
                                                } else if (var10.field2546 == var138 && var10.field2555 == var139) {
                                                    var137.method1507(var13, var14);
                                                } else {
                                                    var137.method1448(var13, var14, var10.field2546, var10.field2555);
                                                }
                                            }
                                        } else if (class155.field2528) {
                                            method2073(var10);
                                        }
                                    } else {
                                        class73 var136 = var10.method2880(method2872(var10));
                                        if (var136 != null) {
                                            var136.method1507(var13, var14);
                                        } else if (class155.field2528) {
                                            method2073(var10);
                                        }
                                    }
                                } else if (var10.field2539 == 6) {
                                    boolean var145 = method2872(var10);
                                    int var146;
                                    if (var145) {
                                        var146 = var10.field2576;
                                    } else {
                                        var146 = var10.field2573;
                                    }
                                    class99 var147 = null;
                                    int var148 = 0;
                                    if (var10.field2644 != -1) {
                                        class46 var149 = class46.method114(var10.field2644);
                                        if (var149 != null) {
                                            class46 var150 = var149.method839(var10.field2645);
                                            var147 = var150.method884(1);
                                            if (var147 == null) {
                                                method2073(var10);
                                            } else {
                                                var147.method2022();
                                                var148 = var147.field1347 / 2;
                                            }
                                        }
                                    } else if (var10.field2569 == 5) {
                                        if (var10.field2650 == 0) {
                                            var147 = field414.method2952((class39) null, -1, (class39) null, -1);
                                        } else {
                                            var147 = Statics.field524.method20();
                                        }
                                    } else if (var146 == -1) {
                                        var147 = var10.method2883((class39) null, -1, var145, Statics.field524.field36);
                                        if (var147 == null && class155.field2528) {
                                            method2073(var10);
                                        }
                                    } else {
                                        class39 var151 = class39.method109(var146);
                                        var147 = var10.method2883(var151, var10.field2564, var145, Statics.field524.field36);
                                        if (var147 == null && class155.field2528) {
                                            method2073(var10);
                                        }
                                    }
                                    class85.method1809(var10.field2546 / 2 + var13, var10.field2555 / 2 + var14);
                                    int var152 = var10.field2580 * class85.field1472[var10.field2529] >> 16;
                                    int var153 = var10.field2580 * class85.field1473[var10.field2529] >> 16;
                                    if (var147 != null) {
                                        if (var10.field2536) {
                                            var147.method2022();
                                            if (var10.field2582) {
                                                var147.method2000(0, var10.field2578, var10.field2632, var10.field2529, var10.field2575, var10.field2583 + var148 + var152, var10.field2583 + var153, var10.field2580);
                                            } else {
                                                var147.method1999(0, var10.field2578, var10.field2632, var10.field2529, var10.field2575, var10.field2583 + var148 + var152, var10.field2583 + var153);
                                            }
                                        } else {
                                            var147.method1999(0, var10.field2578, 0, var10.field2529, 0, var152, var153);
                                        }
                                    }
                                    class85.method1806();
                                } else {
                                    if (var10.field2539 == 7) {
                                        class205 var154 = var10.method2876();
                                        if (var154 == null) {
                                            if (class155.field2528) {
                                                method2073(var10);
                                            }
                                            continue;
                                        }
                                        int var155 = 0;
                                        for (int var156 = 0; var156 < var10.field2555; var156++) {
                                            for (int var157 = 0; var157 < var10.field2546; var157++) {
                                                if (var10.field2540[var155] > 0) {
                                                    class46 var158 = class46.method114(var10.field2540[var155] - 1);
                                                    String var159;
                                                    if (var158.field1034 != 1 && var10.field2643[var155] == 1) {
                                                        var159 = class2.method2597(16748608) + var158.field1026 + class2.field25;
                                                    } else {
                                                        var159 = class2.method2597(16748608) + var158.field1026 + class2.field25 + " " + 'x' + method121(var10.field2643[var155]);
                                                    }
                                                    int var160 = (var10.field2591 + 115) * var157 + var13;
                                                    int var161 = (var10.field2592 + 12) * var156 + var14;
                                                    if (var10.field2588 == 0) {
                                                        var154.method3497(var159, var160, var161, var10.field2571, var10.field2590 ? 0 : -1);
                                                    } else if (var10.field2588 == 1) {
                                                        var154.method3513(var159, var10.field2546 / 2 + var160, var161, var10.field2571, var10.field2590 ? 0 : -1);
                                                    } else {
                                                        var154.method3445(var159, var10.field2546 + var160 - 1, var161, var10.field2571, var10.field2590 ? 0 : -1);
                                                    }
                                                }
                                                var155++;
                                            }
                                        }
                                    }
                                    if (var10.field2539 == 8 && Statics.field954 == var10 && field503 == field293) {
                                        int var162 = 0;
                                        int var163 = 0;
                                        class205 var164 = Statics.field2146;
                                        String var165 = var10.field2596;
                                        String var166 = method704(var165, var10);
                                        while (var166.length() > 0) {
                                            int var167 = var166.indexOf(class2.field23);
                                            String var168;
                                            if (var167 == -1) {
                                                var168 = var166;
                                                var166 = "";
                                            } else {
                                                var168 = var166.substring(0, var167);
                                                var166 = var166.substring(var167 + 4);
                                            }
                                            int var169 = var164.method3439(var168);
                                            if (var169 > var162) {
                                                var162 = var169;
                                            }
                                            var163 += var164.field2961 + 1;
                                        }
                                        var162 += 6;
                                        var163 += 7;
                                        int var170 = var10.field2546 + var13 - 5 - var162;
                                        int var171 = var10.field2555 + var14 + 5;
                                        if (var170 < var13 + 5) {
                                            var170 = var13 + 5;
                                        }
                                        if (var162 + var170 > arg4) {
                                            var170 = arg4 - var162;
                                        }
                                        if (var163 + var171 > arg5) {
                                            var171 = arg5 - var163;
                                        }
                                        class74.method1530(var170, var171, var162, var163, 16777120);
                                        class74.method1538(var170, var171, var162, var163, 0);
                                        String var172 = var10.field2596;
                                        int var173 = var164.field2961 + var171 + 2;
                                        String var174 = method704(var172, var10);
                                        while (var174.length() > 0) {
                                            int var175 = var174.indexOf(class2.field23);
                                            String var176;
                                            if (var175 == -1) {
                                                var176 = var174;
                                                var174 = "";
                                            } else {
                                                var176 = var174.substring(0, var175);
                                                var174 = var174.substring(var175 + 4);
                                            }
                                            var164.method3497(var176, var170 + 3, var173, 0, -1);
                                            var173 += var164.field2961 + 1;
                                        }
                                    }
                                    if (var10.field2539 == 9) {
                                        if (var10.field2629 == 1) {
                                            class74.method1536(var13, var14, var10.field2546 + var13, var10.field2555 + var14, var10.field2571);
                                        } else {
                                            int var177 = var10.field2546 >= 0 ? var10.field2546 : -var10.field2546;
                                            int var178 = var10.field2555 >= 0 ? var10.field2555 : -var10.field2555;
                                            int var179 = var177;
                                            if (var177 < var178) {
                                                var179 = var178;
                                            }
                                            if (var179 != 0) {
                                                int var180 = (var10.field2546 << 16) / var179;
                                                int var181 = (var10.field2555 << 16) / var179;
                                                if (var181 <= var180) {
                                                    var180 = -var180;
                                                } else {
                                                    var181 = -var181;
                                                }
                                                int var182 = var10.field2629 * var181 >> 17;
                                                int var183 = var10.field2629 * var181 + 1 >> 17;
                                                int var184 = var10.field2629 * var180 >> 17;
                                                int var185 = var10.field2629 * var180 + 1 >> 17;
                                                int var186 = var13 + var182;
                                                int var187 = var13 - var183;
                                                int var188 = var10.field2546 + var13 - var183;
                                                int var189 = var10.field2546 + var13 + var182;
                                                int var190 = var14 + var184;
                                                int var191 = var14 - var185;
                                                int var192 = var10.field2555 + var14 - var185;
                                                int var193 = var10.field2555 + var14 + var184;
                                                class85.method1805(var186, var187, var188);
                                                class85.method1807(var190, var191, var192, var186, var187, var188, var10.field2571);
                                                class85.method1805(var186, var188, var189);
                                                class85.method1807(var190, var192, var193, var186, var188, var189, var10.field2571);
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

    @ObfuscatedName("ad.cd(Ljava/lang/String;Led;B)Ljava/lang/String;")
    public static String method704(String arg0, class155 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1340(arg1, var2 - 1);
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
                if (Statics.field2405 != null) {
                    var8 = class211.method3524(Statics.field2405.field2060);
                    if (Statics.field2405.field2062 != null) {
                        var8 = (String) Statics.field2405.field2062;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("h.ci(II)Ljava/lang/String;")
    public static final String method121(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field19 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2597(65408) + var1.substring(0, var1.length() - 8) + class145.field2280 + " " + class2.field21 + var1 + class2.field26 + class2.field25;
        } else if (var1.length() > 6) {
            return " " + class2.method2597(16777215) + var1.substring(0, var1.length() - 4) + class145.field2313 + " " + class2.field21 + var1 + class2.field26 + class2.field25;
        } else {
            return " " + class2.method2597(16776960) + var1 + class2.field25;
        }
    }

    @ObfuscatedName("at.cj(Led;IIIIIII)V")
    public static final void method527(class155 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field418) {
            field335 = 32;
        } else {
            field335 = 0;
        }
        field418 = false;
        if (class129.field1991 == 1 || !Statics.field2089 && class129.field1991 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2558 -= 4;
                method2073(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2558 += 4;
                method2073(arg0);
            } else if (arg5 >= arg1 - field335 && arg5 < field335 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2558 = (arg4 - arg3) * var8 / var9;
                method2073(arg0);
                field418 = true;
            }
        }
        if (field429 == 0) {
            return;
        }
        int var10 = arg0.field2546;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2558 += field429 * 45;
            method2073(arg0);
        }
    }

    @ObfuscatedName("ee.cm(Led;I)Z")
    public static final boolean method2872(class155 arg0) {
        if (arg0.field2637 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2637.length; var1++) {
            int var2 = method1340(arg0, var1);
            int var3 = arg0.field2638[var1];
            if (arg0.field2637[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2637[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2637[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ba.cx(Led;IB)I")
    public static final int method1340(class155 arg0, int arg1) {
        if (arg0.field2636 == null || arg1 >= arg0.field2636.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2636[arg1];
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
                    var7 = field391[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field285[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field269[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class155 var11 = class155.method1876(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class46.method114(var12).field1036 || field250)) {
                        for (int var13 = 0; var13 < var11.field2540.length; var13++) {
                            if (var12 + 1 == var11.field2540[var13]) {
                                var7 += var11.field2643[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class157.field2671[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class143.field2134[field285[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class157.field2671[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field524.field37;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class143.field2136[var14]) {
                            var7 += field285[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class155 var17 = class155.method1876(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class46.method114(var18).field1036 || field250)) {
                        for (int var19 = 0; var19 < var17.field2540.length; var19++) {
                            if (var18 + 1 == var17.field2540[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field419;
                }
                if (var6 == 12) {
                    var7 = field420;
                }
                if (var6 == 13) {
                    int var20 = class157.field2671[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class157.method461(var22);
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
                    var7 = (Statics.field524.field780 >> 7) + Statics.field1789;
                }
                if (var6 == 19) {
                    var7 = (Statics.field524.field727 >> 7) + Statics.field1571;
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

    @ObfuscatedName("g.cs([Led;IIIIIIIB)V")
    public static final void method99(class155[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class155 var9 = arg0[var8];
            if (var9 != null && (!var9.field2536 || var9.field2539 == 0 || var9.field2544 || method137(var9) != 0 || field427 == var9) && var9.field2548 == arg1 && (!var9.field2536 || !method2715(var9))) {
                int var10 = var9.field2542 + arg6;
                int var11 = var9.field2607 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2539 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2539 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2546 + var10;
                    int var19 = var9.field2555 + var11;
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
                    int var22 = var9.field2546 + var10;
                    int var23 = var9.field2555 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field464 == var9) {
                    field395 = true;
                    field435 = var10;
                    field436 = var11;
                }
                if (!var9.field2536 || var12 < var14 && var13 < var15) {
                    int var24 = class129.field1987;
                    int var25 = class129.field1988;
                    if (class129.field1986 != 0) {
                        var24 = class129.field1999;
                        var25 = class129.field2000;
                    }
                    if (var9.field2541 == 1337) {
                        method2073(var9);
                        if (!field258 && !field403 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method98(var24, var25, var12, var13);
                        }
                    } else if (var9.field2541 != 1338) {
                        if (!field403 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var37 = var24 - var10;
                            int var38 = var25 - var11;
                            if (var9.field2651 == 1) {
                                method2727(var9.field2641, "", 24, 0, 0, var9.field2537);
                            }
                            if (var9.field2651 == 2 && !field409) {
                                String var39 = method732(var9);
                                if (var39 != null) {
                                    method2727(var39, class2.method2597(65280) + var9.field2640, 25, 0, -1, var9.field2537);
                                }
                            }
                            if (var9.field2651 == 3) {
                                method2727(class145.field2279, "", 26, 0, 0, var9.field2537);
                            }
                            if (var9.field2651 == 4) {
                                method2727(var9.field2641, "", 28, 0, 0, var9.field2537);
                            }
                            if (var9.field2651 == 5) {
                                method2727(var9.field2641, "", 29, 0, 0, var9.field2537);
                            }
                            if (var9.field2651 == 6 && field477 == null) {
                                method2727(var9.field2641, "", 30, 0, -1, var9.field2537);
                            }
                            if (var9.field2539 == 2) {
                                int var40 = 0;
                                for (int var41 = 0; var41 < var9.field2555; var41++) {
                                    for (int var42 = 0; var42 < var9.field2546; var42++) {
                                        int var43 = (var9.field2591 + 32) * var42;
                                        int var44 = (var9.field2592 + 32) * var41;
                                        if (var40 < 20) {
                                            var43 += var9.field2593[var40];
                                            var44 += var9.field2547[var40];
                                        }
                                        if (var37 >= var43 && var38 >= var44 && var37 < var43 + 32 && var38 < var44 + 32) {
                                            field337 = var40;
                                            Statics.field95 = var9;
                                            if (var9.field2540[var40] > 0) {
                                                class46 var45 = class46.method114(var9.field2540[var40] - 1);
                                                if (field407 == 1 && class159.method2919(method137(var9))) {
                                                    if (Statics.field941 != var9.field2537 || Statics.field206 != var40) {
                                                        method2727(class145.field2300, field455 + " " + class2.field22 + " " + class2.method2597(16748608) + var45.field1026, 31, var45.field1021, var40, var9.field2537);
                                                    }
                                                } else if (!field409 || !class159.method2919(method137(var9))) {
                                                    String[] var46 = var45.field1038;
                                                    if (field449) {
                                                        var46 = method124(var46);
                                                    }
                                                    if (class159.method2919(method137(var9))) {
                                                        for (int var47 = 4; var47 >= 3; var47--) {
                                                            if (var46 != null && var46[var47] != null) {
                                                                byte var48;
                                                                if (var47 == 3) {
                                                                    var48 = 36;
                                                                } else {
                                                                    var48 = 37;
                                                                }
                                                                method2727(var46[var47], class2.method2597(16748608) + var45.field1026, var48, var45.field1021, var40, var9.field2537);
                                                            } else if (var47 == 4) {
                                                                method2727(class145.field2152, class2.method2597(16748608) + var45.field1026, 37, var45.field1021, var40, var9.field2537);
                                                            }
                                                        }
                                                    }
                                                    int var49 = method137(var9);
                                                    boolean var50 = (var49 >> 31 & 0x1) != 0;
                                                    if (var50) {
                                                        method2727(class145.field2300, class2.method2597(16748608) + var45.field1026, 38, var45.field1021, var40, var9.field2537);
                                                    }
                                                    class159 var10000 = (class159) null;
                                                    if (class159.method2919(method137(var9)) && var46 != null) {
                                                        for (int var51 = 2; var51 >= 0; var51--) {
                                                            if (var46[var51] != null) {
                                                                byte var52 = 0;
                                                                if (var51 == 0) {
                                                                    var52 = 33;
                                                                }
                                                                if (var51 == 1) {
                                                                    var52 = 34;
                                                                }
                                                                if (var51 == 2) {
                                                                    var52 = 35;
                                                                }
                                                                method2727(var46[var51], class2.method2597(16748608) + var45.field1026, var52, var45.field1021, var40, var9.field2537);
                                                            }
                                                        }
                                                    }
                                                    String[] var53 = var9.field2647;
                                                    if (field449) {
                                                        var53 = method124(var53);
                                                    }
                                                    if (var53 != null) {
                                                        for (int var54 = 4; var54 >= 0; var54--) {
                                                            if (var53[var54] != null) {
                                                                byte var55 = 0;
                                                                if (var54 == 0) {
                                                                    var55 = 39;
                                                                }
                                                                if (var54 == 1) {
                                                                    var55 = 40;
                                                                }
                                                                if (var54 == 2) {
                                                                    var55 = 41;
                                                                }
                                                                if (var54 == 3) {
                                                                    var55 = 42;
                                                                }
                                                                if (var54 == 4) {
                                                                    var55 = 43;
                                                                }
                                                                method2727(var53[var54], class2.method2597(16748608) + var45.field1026, var55, var45.field1021, var40, var9.field2537);
                                                            }
                                                        }
                                                    }
                                                    method2727(class145.field2301, class2.method2597(16748608) + var45.field1026, 1005, var45.field1021, var40, var9.field2537);
                                                } else if ((Statics.field542 & 0x10) == 16) {
                                                    method2727(field412, field413 + " " + class2.field22 + " " + class2.method2597(16748608) + var45.field1026, 32, var45.field1021, var40, var9.field2537);
                                                }
                                            }
                                        }
                                        var40++;
                                    }
                                }
                            }
                            if (var9.field2536) {
                                if (field409) {
                                    int var56 = method137(var9);
                                    boolean var57 = (var56 >> 21 & 0x1) != 0;
                                    if (var57 && (Statics.field542 & 0x20) == 32) {
                                        method2727(field412, field413 + " " + class2.field22 + " " + var9.field2598, 58, 0, var9.field2538, var9.field2537);
                                    }
                                } else {
                                    for (int var58 = 9; var58 >= 5; var58--) {
                                        String var59 = method3356(var9, var58);
                                        if (var59 != null) {
                                            method2727(var59, var9.field2598, 1007, var58 + 1, var9.field2538, var9.field2537);
                                        }
                                    }
                                    String var60 = method732(var9);
                                    if (var60 != null) {
                                        method2727(var60, var9.field2598, 25, 0, var9.field2538, var9.field2537);
                                    }
                                    for (int var61 = 4; var61 >= 0; var61--) {
                                        String var62 = method3356(var9, var61);
                                        if (var62 != null) {
                                            method2727(var62, var9.field2598, 57, var61 + 1, var9.field2538, var9.field2537);
                                        }
                                    }
                                    if (class159.method1980(method137(var9))) {
                                        method2727(class145.field2156, "", 30, 0, var9.field2538, var9.field2537);
                                    }
                                }
                            }
                        }
                        if (var9.field2539 == 0) {
                            if (!var9.field2536 && method2715(var9) && Statics.field1971 != var9) {
                                continue;
                            }
                            method99(arg0, var9.field2537, var12, var13, var14, var15, var10 - var9.field2594, var11 - var9.field2558);
                            if (var9.field2648 != null) {
                                method99(var9.field2648, var9.field2537, var12, var13, var14, var15, var10 - var9.field2594, var11 - var9.field2558);
                            }
                            class4 var63 = (class4) field462.method3206((long) var9.field2537);
                            if (var63 != null) {
                                if (var63.field60 == 0 && class129.field1987 >= var12 && class129.field1988 >= var13 && class129.field1987 < var14 && class129.field1988 < var15 && !field403 && !field424) {
                                    field401[0] = class145.field2394;
                                    field402[0] = "";
                                    field340[0] = 1006;
                                    field396 = 1;
                                }
                                int var64 = var63.field64;
                                if (class155.method128(var64)) {
                                    method99(Statics.field2621[var64], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2536) {
                            if (var9.field2646 && class129.field1987 >= var12 && class129.field1988 >= var13 && class129.field1987 < var14 && class129.field1988 < var15) {
                                for (class1 var65 = (class1) field454.method3249(); var65 != null; var65 = (class1) field454.method3248()) {
                                    if (var65.field2) {
                                        var65.method3334();
                                        var65.field3.field2649 = false;
                                    }
                                }
                                if (Statics.field175 == 0) {
                                    field464 = null;
                                    field427 = null;
                                }
                                if (!field403) {
                                    field401[0] = class145.field2394;
                                    field402[0] = "";
                                    field340[0] = 1006;
                                    field396 = 1;
                                }
                            }
                            boolean var66;
                            if (class129.field1987 >= var12 && class129.field1988 >= var13 && class129.field1987 < var14 && class129.field1988 < var15) {
                                var66 = true;
                            } else {
                                var66 = false;
                            }
                            boolean var67 = false;
                            if ((class129.field1991 == 1 || !Statics.field2089 && class129.field1991 == 4) && var66) {
                                var67 = true;
                            }
                            boolean var68 = false;
                            if ((class129.field1986 == 1 || !Statics.field2089 && class129.field1986 == 4) && class129.field1999 >= var12 && class129.field2000 >= var13 && class129.field1999 < var14 && class129.field2000 < var15) {
                                var68 = true;
                            }
                            if (var68) {
                                method111(var9, class129.field1999 - var10, class129.field2000 - var11);
                            }
                            if (field464 != null && field464 != var9 && var66 && class159.method2059(method137(var9))) {
                                field430 = var9;
                            }
                            if (field427 == var9) {
                                field431 = true;
                                field247 = var10;
                                field433 = var11;
                            }
                            if (var9.field2544) {
                                if (var66 && field429 != 0 && var9.field2626 != null) {
                                    class1 var69 = new class1();
                                    var69.field2 = true;
                                    var69.field3 = var9;
                                    var69.field5 = field429;
                                    var69.field8 = var9.field2626;
                                    field454.method3241(var69);
                                }
                                if (field464 != null || Statics.field923 != null || field403) {
                                    var68 = false;
                                    var67 = false;
                                    var66 = false;
                                }
                                if (!var9.field2562 && var68) {
                                    var9.field2562 = true;
                                    if (var9.field2657 != null) {
                                        class1 var70 = new class1();
                                        var70.field2 = true;
                                        var70.field3 = var9;
                                        var70.field4 = class129.field1999 - var10;
                                        var70.field5 = class129.field2000 - var11;
                                        var70.field8 = var9.field2657;
                                        field454.method3241(var70);
                                    }
                                }
                                if (var9.field2562 && var67 && var9.field2608 != null) {
                                    class1 var71 = new class1();
                                    var71.field2 = true;
                                    var71.field3 = var9;
                                    var71.field4 = class129.field1987 - var10;
                                    var71.field5 = class129.field1988 - var11;
                                    var71.field8 = var9.field2608;
                                    field454.method3241(var71);
                                }
                                if (var9.field2562 && !var67) {
                                    var9.field2562 = false;
                                    if (var9.field2609 != null) {
                                        class1 var72 = new class1();
                                        var72.field2 = true;
                                        var72.field3 = var9;
                                        var72.field4 = class129.field1987 - var10;
                                        var72.field5 = class129.field1988 - var11;
                                        var72.field8 = var9.field2609;
                                        field456.method3241(var72);
                                    }
                                }
                                if (var67 && var9.field2589 != null) {
                                    class1 var73 = new class1();
                                    var73.field2 = true;
                                    var73.field3 = var9;
                                    var73.field4 = class129.field1987 - var10;
                                    var73.field5 = class129.field1988 - var11;
                                    var73.field8 = var9.field2589;
                                    field454.method3241(var73);
                                }
                                if (!var9.field2649 && var66) {
                                    var9.field2649 = true;
                                    if (var9.field2615 != null) {
                                        class1 var74 = new class1();
                                        var74.field2 = true;
                                        var74.field3 = var9;
                                        var74.field4 = class129.field1987 - var10;
                                        var74.field5 = class129.field1988 - var11;
                                        var74.field8 = var9.field2615;
                                        field454.method3241(var74);
                                    }
                                }
                                if (var9.field2649 && var66 && var9.field2612 != null) {
                                    class1 var75 = new class1();
                                    var75.field2 = true;
                                    var75.field3 = var9;
                                    var75.field4 = class129.field1987 - var10;
                                    var75.field5 = class129.field1988 - var11;
                                    var75.field8 = var9.field2612;
                                    field454.method3241(var75);
                                }
                                if (var9.field2649 && !var66) {
                                    var9.field2649 = false;
                                    if (var9.field2613 != null) {
                                        class1 var76 = new class1();
                                        var76.field2 = true;
                                        var76.field3 = var9;
                                        var76.field4 = class129.field1987 - var10;
                                        var76.field5 = class129.field1988 - var11;
                                        var76.field8 = var9.field2613;
                                        field456.method3241(var76);
                                    }
                                }
                                if (var9.field2624 != null) {
                                    class1 var77 = new class1();
                                    var77.field3 = var9;
                                    var77.field8 = var9.field2624;
                                    field310.method3241(var77);
                                }
                                if (var9.field2618 != null && field440 > var9.field2554) {
                                    if (var9.field2619 == null || field440 - var9.field2554 > 32) {
                                        class1 var82 = new class1();
                                        var82.field3 = var9;
                                        var82.field8 = var9.field2618;
                                        field454.method3241(var82);
                                    } else {
                                        label679: for (int var78 = var9.field2554; var78 < field440; var78++) {
                                            int var79 = field439[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var9.field2619.length; var80++) {
                                                if (var9.field2619[var80] == var79) {
                                                    class1 var81 = new class1();
                                                    var81.field3 = var9;
                                                    var81.field8 = var9.field2618;
                                                    field454.method3241(var81);
                                                    break label679;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2554 = field440;
                                }
                                if (var9.field2620 != null && field442 > var9.field2653) {
                                    if (var9.field2628 == null || field442 - var9.field2653 > 32) {
                                        class1 var87 = new class1();
                                        var87.field3 = var9;
                                        var87.field8 = var9.field2620;
                                        field454.method3241(var87);
                                    } else {
                                        label655: for (int var83 = var9.field2653; var83 < field442; var83++) {
                                            int var84 = field441[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var9.field2628.length; var85++) {
                                                if (var9.field2628[var85] == var84) {
                                                    class1 var86 = new class1();
                                                    var86.field3 = var9;
                                                    var86.field8 = var9.field2620;
                                                    field454.method3241(var86);
                                                    break label655;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2653 = field442;
                                }
                                if (var9.field2551 != null && field444 > var9.field2654) {
                                    if (var9.field2623 == null || field444 - var9.field2654 > 32) {
                                        class1 var92 = new class1();
                                        var92.field3 = var9;
                                        var92.field8 = var9.field2551;
                                        field454.method3241(var92);
                                    } else {
                                        label631: for (int var88 = var9.field2654; var88 < field444; var88++) {
                                            int var89 = field443[var88 & 0x1F];
                                            for (int var90 = 0; var90 < var9.field2623.length; var90++) {
                                                if (var9.field2623[var90] == var89) {
                                                    class1 var91 = new class1();
                                                    var91.field3 = var9;
                                                    var91.field8 = var9.field2551;
                                                    field454.method3241(var91);
                                                    break label631;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2654 = field444;
                                }
                                if (field445 > var9.field2606 && var9.field2627 != null) {
                                    class1 var93 = new class1();
                                    var93.field3 = var9;
                                    var93.field8 = var9.field2627;
                                    field454.method3241(var93);
                                }
                                if (field446 > var9.field2606 && var9.field2543 != null) {
                                    class1 var94 = new class1();
                                    var94.field3 = var9;
                                    var94.field8 = var9.field2543;
                                    field454.method3241(var94);
                                }
                                if (field355 > var9.field2606 && var9.field2630 != null) {
                                    class1 var95 = new class1();
                                    var95.field3 = var9;
                                    var95.field8 = var9.field2630;
                                    field454.method3241(var95);
                                }
                                if (field421 > var9.field2606 && var9.field2634 != null) {
                                    class1 var96 = new class1();
                                    var96.field3 = var9;
                                    var96.field8 = var9.field2634;
                                    field454.method3241(var96);
                                }
                                if (field288 > var9.field2606 && var9.field2635 != null) {
                                    class1 var97 = new class1();
                                    var97.field3 = var9;
                                    var97.field8 = var9.field2635;
                                    field454.method3241(var97);
                                }
                                if (field450 > var9.field2606 && var9.field2570 != null) {
                                    class1 var98 = new class1();
                                    var98.field3 = var9;
                                    var98.field8 = var9.field2570;
                                    field454.method3241(var98);
                                }
                                var9.field2606 = field438;
                                if (var9.field2605 != null) {
                                    for (int var99 = 0; var99 < field286; var99++) {
                                        class1 var100 = new class1();
                                        var100.field3 = var9;
                                        var100.field9 = field476[var99];
                                        var100.field12 = field475[var99];
                                        var100.field8 = var9.field2605;
                                        field454.method3241(var100);
                                    }
                                }
                            }
                        }
                        if (!var9.field2536 && field464 == null && Statics.field923 == null && !field403) {
                            if ((var9.field2639 >= 0 || var9.field2642 != 0) && class129.field1987 >= var12 && class129.field1988 >= var13 && class129.field1987 < var14 && class129.field1988 < var15) {
                                if (var9.field2639 >= 0) {
                                    Statics.field1971 = arg0[var9.field2639];
                                } else {
                                    Statics.field1971 = var9;
                                }
                            }
                            if (var9.field2539 == 8 && class129.field1987 >= var12 && class129.field1988 >= var13 && class129.field1987 < var14 && class129.field1988 < var15) {
                                Statics.field954 = var9;
                            }
                            if (var9.field2553 > var9.field2555) {
                                method527(var9, var9.field2546 + var10, var11, var9.field2555, var9.field2553, class129.field1987, class129.field1988);
                            }
                        }
                    } else if ((field487 == 0 || field487 == 3) && (class129.field1986 == 1 || !Statics.field2089 && class129.field1986 == 4)) {
                        int var26 = class129.field1999 - 25 - var10;
                        int var27 = class129.field2000 - 5 - var11;
                        if (var26 >= 0 && var27 >= 0 && var26 < 146 && var27 < 151 && (var26 < 0 || var26 > 23 || var27 < 117 || var27 > 142)) {
                            var26 -= 73;
                            var27 -= 75;
                            int var28 = field363 + field323 & 0x7FF;
                            int var29 = class85.field1472[var28];
                            int var30 = class85.field1473[var28];
                            int var31 = (field325 + 256) * var29 >> 8;
                            int var32 = (field325 + 256) * var30 >> 8;
                            int var33 = var26 * var32 + var27 * var31 >> 11;
                            int var34 = var27 * var32 - var26 * var31 >> 11;
                            int var35 = Statics.field524.field780 + var33 >> 7;
                            int var36 = Statics.field524.field727 - var34 >> 7;
                            field486.method2376(44);
                            field486.method2120(18);
                            field486.method2172(Statics.field1571 + var36);
                            field486.method2156(class126.field1957[82] ? (class126.field1957[81] ? 2 : 1) : 0);
                            field486.method2165(Statics.field1789 + var35);
                            field486.method2120(var26);
                            field486.method2120(var27);
                            field486.method2121(field363);
                            field486.method2120(57);
                            field486.method2120(field323);
                            field486.method2120(field325);
                            field486.method2120(89);
                            field486.method2121(Statics.field524.field780);
                            field486.method2121(Statics.field524.field727);
                            field486.method2120(63);
                            field370 = var35;
                            field457 = var36;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ek.ct([Led;IB)V")
    public static final void method2720(class155[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class155 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2539 == 0) {
                    if (var3.field2648 != null) {
                        method2720(var3.field2648, arg1);
                    }
                    class4 var4 = (class4) field462.method3206((long) var3.field2537);
                    if (var4 != null) {
                        int var5 = var4.field64;
                        if (class155.method128(var5)) {
                            method2720(Statics.field2621[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2560 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field8 = var3.field2560;
                    class33.method1613(var6);
                }
                if (arg1 == 1 && var3.field2633 != null) {
                    if (var3.field2538 >= 0) {
                        class155 var7 = class155.method1876(var3.field2537);
                        if (var7 == null || var7.field2648 == null || var3.field2538 >= var7.field2648.length || var7.field2648[var3.field2538] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field8 = var3.field2633;
                    class33.method1613(var8);
                }
            }
        }
    }

    @ObfuscatedName("i.ca(Led;IIB)V")
    public static final void method111(class155 arg0, int arg1, int arg2) {
        if (field464 != null || field403 || arg0 == null || method105(arg0) == null) {
            return;
        }
        field464 = arg0;
        field427 = method105(arg0);
        field512 = arg1;
        field284 = arg2;
        Statics.field175 = 0;
        field453 = false;
        if (field396 <= 0) {
            return;
        }
        int var3 = field396 - 1;
        Statics.field652 = new class28();
        Statics.field652.field640 = field397[var3];
        Statics.field652.field643 = field398[var3];
        Statics.field652.field641 = field340[var3];
        Statics.field652.field642 = field400[var3];
        Statics.field652.field639 = field401[var3];
    }

    @ObfuscatedName("o.cq(I)V")
    public static final void method521() {
        method2073(field464);
        Statics.field175++;
        if (field395 && field431) {
            int var0 = class129.field1987;
            int var1 = class129.field1988;
            int var2 = var0 - field512;
            int var3 = var1 - field284;
            if (var2 < field247) {
                var2 = field247;
            }
            if (field464.field2546 + var2 > field247 + field427.field2546) {
                var2 = field247 + field427.field2546 - field464.field2546;
            }
            if (var3 < field433) {
                var3 = field433;
            }
            if (field464.field2555 + var3 > field433 + field427.field2555) {
                var3 = field433 + field427.field2555 - field464.field2555;
            }
            int var4 = var2 - field435;
            int var5 = var3 - field436;
            int var6 = field464.field2601;
            if (Statics.field175 > field464.field2602 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field453 = true;
            }
            int var7 = field427.field2594 + (var2 - field247);
            int var8 = field427.field2558 + (var3 - field433);
            if (field464.field2610 != null && field453) {
                class1 var9 = new class1();
                var9.field3 = field464;
                var9.field4 = var7;
                var9.field5 = var8;
                var9.field8 = field464.field2610;
                class33.method1613(var9);
            }
            if (class129.field1991 == 0) {
                if (field453) {
                    if (field464.field2586 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field464;
                        var10.field4 = var7;
                        var10.field5 = var8;
                        var10.field7 = field430;
                        var10.field8 = field464.field2586;
                        class33.method1613(var10);
                    }
                    if (field430 != null) {
                        class155 var11 = field464;
                        int var12 = class159.method2718(method137(var11));
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
                                var11 = class155.method1876(var11.field2548);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field486.method2376(129);
                            field486.method2174(field430.field2537);
                            field486.method2121(field430.field2538);
                            field486.method2311(field464.field2644);
                            field486.method2194(field464.field2537);
                            field486.method2121(field464.field2538);
                            field486.method2165(field430.field2644);
                        }
                    }
                } else if ((field394 == 1 || method2550(field396 - 1)) && field396 > 2) {
                    method2743(field512 + field435, field436 + field284);
                } else if (field396 > 0) {
                    int var15 = field512 + field435;
                    int var16 = field436 + field284;
                    method2873(Statics.field652, var15, var16);
                    Statics.field652 = null;
                }
                field464 = null;
            }
        } else if (Statics.field175 > 1) {
            field464 = null;
        }
    }

    @ObfuscatedName("cz.co(Led;I)V")
    public static void method2073(class155 arg0) {
        if (field252 == arg0.field2656) {
            field384[arg0.field2655] = true;
        }
    }

    @ObfuscatedName("dh.cw(B)V")
    public static void method2079() {
        for (class4 var0 = (class4) field462.method3220(); var0 != null; var0 = (class4) field462.method3210()) {
            int var1 = var0.field64;
            if (class155.method128(var1)) {
                boolean var2 = true;
                class155[] var3 = Statics.field2621[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2536;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2886;
                    class155 var6 = class155.method1876(var5);
                    if (var6 != null) {
                        method2073(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.cf(Led;B)Led;")
    public static class155 method105(class155 arg0) {
        class155 var1 = arg0;
        int var2 = class159.method2718(method137(arg0));
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
                var1 = class155.method1876(var1.field2548);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class155 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2600;
        }
        return var5;
    }

    @ObfuscatedName("h.ce([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method124(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("an.ch(II)V")
    public static final void method668(int arg0) {
        if (!class155.method128(arg0)) {
            return;
        }
        class155[] var1 = Statics.field2621[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class155 var3 = var1[var2];
            if (var3 != null) {
                var3.field2564 = 0;
                var3.field2611 = 0;
            }
        }
    }

    @ObfuscatedName("dk.cy(IB)V")
    public static final void method2561(int arg0) {
        if (class155.method128(arg0)) {
            method1371(Statics.field2621[arg0], -1);
        }
    }

    @ObfuscatedName("bt.cr([Led;II)V")
    public static final void method1371(class155[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class155 var3 = arg0[var2];
            if (var3 != null && var3.field2548 == arg1 && (!var3.field2536 || !method2715(var3))) {
                if (var3.field2539 == 0) {
                    if (!var3.field2536 && method2715(var3) && Statics.field1971 != var3) {
                        continue;
                    }
                    method1371(arg0, var3.field2537);
                    if (var3.field2648 != null) {
                        method1371(var3.field2648, var3.field2537);
                    }
                    class4 var4 = (class4) field462.method3206((long) var3.field2537);
                    if (var4 != null) {
                        method2561(var4.field64);
                    }
                }
                if (var3.field2539 == 6) {
                    if (var3.field2573 != -1 || var3.field2576 != -1) {
                        boolean var5 = method2872(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2576;
                        } else {
                            var6 = var3.field2573;
                        }
                        if (var6 != -1) {
                            class39 var7 = class39.method109(var6);
                            var3.field2611 += field375;
                            while (var3.field2611 > var7.field906[var3.field2564]) {
                                var3.field2611 -= var7.field906[var3.field2564];
                                var3.field2564++;
                                if (var3.field2564 >= var7.field913.length) {
                                    var3.field2564 -= var7.field905;
                                    if (var3.field2564 < 0 || var3.field2564 >= var7.field913.length) {
                                        var3.field2564 = 0;
                                    }
                                }
                                method2073(var3);
                            }
                        }
                    }
                    if (var3.field2579 != 0 && !var3.field2536) {
                        int var8 = var3.field2579 >> 16;
                        int var9 = var3.field2579 << 16 >> 16;
                        int var10 = field375 * var8;
                        int var11 = field375 * var9;
                        var3.field2529 = var3.field2529 + var10 & 0x7FF;
                        var3.field2578 = var3.field2578 + var11 & 0x7FF;
                        method2073(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ge.cc(IB)V")
    public static final void method3396(int arg0) {
        method2079();
        for (class21 var1 = (class21) class21.field549.method3249(); var1 != null; var1 = (class21) class21.field549.method3248()) {
            if (var1.field561 != null) {
                var1.method485();
            }
        }
        int var2 = class47.method2717(arg0).field1066;
        if (var2 == 0) {
            return;
        }
        int var3 = class157.field2671[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class85.method1838(0.9D);
                ((class89) Statics.field1469).method1891(0.9D);
            }
            if (var3 == 2) {
                class85.method1838(0.8D);
                ((class89) Statics.field1469).method1891(0.8D);
            }
            if (var3 == 3) {
                class85.method1838(0.7D);
                ((class89) Statics.field1469).method1891(0.7D);
            }
            if (var3 == 4) {
                class85.method1838(0.6D);
                ((class89) Statics.field1469).method1891(0.6D);
            }
            class46.field1020.method3168();
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
            if (field488 != var4) {
                if (field488 == 0 && field489 != -1) {
                    class164.method1981(Statics.field1503, field489, 0, var4, false);
                    field490 = false;
                } else if (var4 == 0) {
                    Statics.field2675.method3107();
                    class164.field2727 = 1;
                    Statics.field2734 = null;
                    field490 = false;
                } else if (class164.field2727 == 0) {
                    Statics.field2675.method3056(var4);
                } else {
                    Statics.field2730 = var4;
                }
                field488 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field491 = 127;
            }
            if (var3 == 1) {
                field491 = 96;
            }
            if (var3 == 2) {
                field491 = 64;
            }
            if (var3 == 3) {
                field491 = 32;
            }
            if (var3 == 4) {
                field491 = 0;
            }
        }
        if (var2 == 5) {
            field394 = var3;
        }
        if (var2 == 6) {
            field416 = var3;
        }
        if (var2 == 9) {
            field417 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field492 = 127;
            }
            if (var3 == 1) {
                field492 = 96;
            }
            if (var3 == 2) {
                field492 = 64;
            }
            if (var3 == 3) {
                field492 = 32;
            }
            if (var3 == 4) {
                field492 = 0;
            }
        }
        if (var2 == 17) {
            field422 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class18[] var5 = new class18[] { class18.field517, class18.field519, class18.field518 };
            field277 = (class18) class100.method70(var5, var3);
            if (field277 == null) {
                field277 = class18.field519;
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

    @ObfuscatedName("client.cl(IIII)Lr;")
    public static final class4 method170(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field64 = arg1;
        var3.field60 = arg2;
        field462.method3207(var3, (long) arg0);
        method668(arg1);
        class33.method2726(arg1);
        class155 var4 = class155.method1876(arg0);
        if (var4 != null) {
            method2073(var4);
        }
        if (field477 != null) {
            method2073(field477);
            field477 = null;
        }
        method86();
        if (field482 != -1) {
            int var5 = field482;
            if (class155.method128(var5)) {
                method2720(Statics.field2621[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("k.cp(Lr;ZB)V")
    public static final void method80(class4 arg0, boolean arg1) {
        int var2 = arg0.field64;
        int var3 = (int) arg0.field2886;
        arg0.method3334();
        if (arg1) {
            class155.method2590(var2);
        }
        for (class182 var4 = (class182) field472.method3220(); var4 != null; var4 = (class182) field472.method3210()) {
            if ((var4.field2886 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3334();
            }
        }
        class155 var5 = class155.method1876(var3);
        if (var5 != null) {
            method2073(var5);
        }
        method86();
        if (field482 != -1) {
            int var6 = field482;
            if (class155.method128(var6)) {
                method2720(Statics.field2621[var6], 1);
            }
        }
    }

    @ObfuscatedName("dm.cn(Led;I)Z")
    public static final boolean method2410(class155 arg0) {
        int var1 = arg0.field2541;
        if (var1 == 205) {
            field300 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field414.method2945(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field414.method2948(var4, var5 == 1);
        }
        if (var1 == 324) {
            field414.method2949(false);
        }
        if (var1 == 325) {
            field414.method2949(true);
        }
        if (var1 == 326) {
            field486.method2376(196);
            field414.method2950(field486);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("m.cv(IIII)V")
    public static final void method492(int arg0, int arg1, int arg2) {
        method561();
        class74.method1524(arg0, arg1, Statics.field55.field1315 + arg0, Statics.field55.field1316 + arg1);
        if (field487 == 2 || field487 == 5) {
            class74.method1539(arg0 + 25, arg1 + 5, 0, Statics.field1970, Statics.field2086);
        } else {
            int var3 = field363 + field323 & 0x7FF;
            int var4 = Statics.field524.field780 / 32 + 48;
            int var5 = 464 - Statics.field524.field727 / 32;
            Statics.field889.method1447(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field325 + 256, Statics.field1970, Statics.field2086);
            for (int var6 = 0; var6 < field481; var6++) {
                int var7 = field366[var6] * 4 + 2 - Statics.field524.field780 / 32;
                int var8 = field483[var6] * 4 + 2 - Statics.field524.field727 / 32;
                method830(arg0, arg1, var7, var8, field484[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class180 var11 = field387[Statics.field168][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field524.field780 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field524.field727 / 32;
                        method830(arg0, arg1, var12, var13, Statics.field648[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field290; var14++) {
                class31 var15 = field289[field291[var14]];
                if (var15 != null && var15.method10()) {
                    class36 var16 = var15.field699;
                    if (var16 != null && var16.field828 != null) {
                        var16 = var16.method599();
                    }
                    if (var16 != null && var16.field805 && var16.field831) {
                        int var17 = var15.field780 / 32 - Statics.field524.field780 / 32;
                        int var18 = var15.field727 / 32 - Statics.field524.field727 / 32;
                        method830(arg0, arg1, var17, var18, Statics.field648[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field373; var19++) {
                class3 var20 = field372[field296[var19]];
                if (var20 != null && var20.method10() && !var20.field52) {
                    int var21 = var20.field780 / 32 - Statics.field524.field780 / 32;
                    int var22 = var20.field727 / 32 - Statics.field524.field727 / 32;
                    boolean var23 = false;
                    if (method1878(var20.field51, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field2064; var25++) {
                        if (var20.field51.equals(Statics.field588[var25].field575)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field524.field41 != 0 && var20.field41 != 0 && Statics.field524.field41 == var20.field41) {
                        var26 = true;
                    }
                    if (var23) {
                        method830(arg0, arg1, var21, var22, Statics.field648[3]);
                    } else if (var26) {
                        method830(arg0, arg1, var21, var22, Statics.field648[4]);
                    } else if (var24) {
                        method830(arg0, arg1, var21, var22, Statics.field648[5]);
                    } else {
                        method830(arg0, arg1, var21, var22, Statics.field648[2]);
                    }
                }
            }
            if (field390 != 0 && field493 % 20 < 10) {
                if (field390 == 1 && field331 >= 0 && field331 < field289.length) {
                    class31 var27 = field289[field331];
                    if (var27 != null) {
                        int var28 = var27.field780 / 32 - Statics.field524.field780 / 32;
                        int var29 = var27.field727 / 32 - Statics.field524.field727 / 32;
                        method1342(arg0, arg1, var28, var29, Statics.field2692[1]);
                    }
                }
                if (field390 == 2) {
                    int var30 = field271 * 4 - Statics.field1789 * 4 + 2 - Statics.field524.field780 / 32;
                    int var31 = field385 * 4 - Statics.field1571 * 4 + 2 - Statics.field524.field727 / 32;
                    method1342(arg0, arg1, var30, var31, Statics.field2692[1]);
                }
                if (field390 == 10 && field270 >= 0 && field270 < field372.length) {
                    class3 var32 = field372[field270];
                    if (var32 != null) {
                        int var33 = var32.field780 / 32 - Statics.field524.field780 / 32;
                        int var34 = var32.field727 / 32 - Statics.field524.field727 / 32;
                        method1342(arg0, arg1, var33, var34, Statics.field2692[1]);
                    }
                }
            }
            if (field370 != 0) {
                int var35 = field370 * 4 + 2 - Statics.field524.field780 / 32;
                int var36 = field457 * 4 + 2 - Statics.field524.field727 / 32;
                method830(arg0, arg1, var35, var36, Statics.field2692[0]);
            }
            if (!Statics.field524.field52) {
                class74.method1530(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
            }
        }
        if (field487 < 3) {
            Statics.field329.method1447(arg0, arg1, 33, 33, 25, 25, field363, 256, Statics.field1, Statics.field242);
        } else {
            class74.method1539(arg0, arg1, 0, Statics.field1, Statics.field242);
        }
        if (field408[arg2]) {
            Statics.field55.method1587(arg0, arg1);
        }
        field272[arg2] = true;
    }

    @ObfuscatedName("ba.cb(IIIILbj;B)V")
    public static final void method1342(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method830(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field363 + field323 & 0x7FF;
        int var7 = class85.field1472[var6];
        int var8 = class85.field1473[var6];
        int var9 = var7 * 256 / (field325 + 256);
        int var10 = var8 * 256 / (field325 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1894.method1449(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("aa.cz(IIIILbj;I)V")
    public static final void method830(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field363 + field323 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class85.field1472[var5];
        int var8 = class85.field1473[var5];
        int var9 = var7 * 256 / (field325 + 256);
        int var10 = var8 * 256 / (field325 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1451(Statics.field55, arg0 + 94 + var11 - arg4.field1299 / 2 + 4, arg1 + 83 - var12 - arg4.field1300 / 2 - 4);
        } else {
            arg4.method1507(arg0 + 94 + var11 - arg4.field1299 / 2 + 4, arg1 + 83 - var12 - arg4.field1300 / 2 - 4);
        }
    }

    @ObfuscatedName("ct.dh(Ljava/lang/String;ZI)Z")
    public static boolean method1878(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class212.method2080(arg0, Statics.field253);
        for (int var3 = 0; var3 < field505; var3++) {
            if (var2.equalsIgnoreCase(class212.method2080(field507[var3].field228, Statics.field253)) && (!arg1 || field507[var3].field223 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class212.method2080(Statics.field524.field51, Statics.field253))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("es.de(Ljava/lang/String;B)Z")
    public static boolean method2714(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class212.method2080(arg0, Statics.field253);
        for (int var2 = 0; var2 < field509; var2++) {
            class8 var3 = field260[var2];
            if (var1.equalsIgnoreCase(class212.method2080(var3.field131, Statics.field253))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class212.method2080(var3.field128, Statics.field253))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cy.di(Ljava/lang/String;S)V")
    public static final void method1973(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field505 < 200 || field499 == 1) || field505 >= 400) {
            class10.method100(30, "", class145.field2316);
            return;
        }
        String var1 = class212.method2080(arg0, Statics.field253);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field505; var2++) {
            class16 var3 = field507[var2];
            String var4 = class212.method2080(var3.field228, Statics.field253);
            if (var4 != null && var4.equals(var1)) {
                class10.method100(30, "", arg0 + class145.field2317);
                return;
            }
            if (var3.field222 != null) {
                String var5 = class212.method2080(var3.field222, Statics.field253);
                if (var5 != null && var5.equals(var1)) {
                    class10.method100(30, "", arg0 + class145.field2317);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field509; var6++) {
            class8 var7 = field260[var6];
            String var8 = class212.method2080(var7.field131, Statics.field253);
            if (var8 != null && var8.equals(var1)) {
                class10.method100(30, "", class145.field2396 + arg0 + class145.field2323);
                return;
            }
            if (var7.field128 != null) {
                String var9 = class212.method2080(var7.field128, Statics.field253);
                if (var9 != null && var9.equals(var1)) {
                    class10.method100(30, "", class145.field2396 + arg0 + class145.field2323);
                    return;
                }
            }
        }
        if (class212.method2080(Statics.field524.field51, Statics.field253).equals(var1)) {
            class10.method100(30, "", class145.field2320);
        } else {
            field486.method2376(244);
            field486.method2120(class108.method97(arg0));
            field486.method2125(arg0);
        }
    }

    @ObfuscatedName("do.dx(Ljava/lang/String;ZB)V")
    public static final void method2596(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field509 < 100 || field499 == 1) || field509 >= 400) {
            class10.method100(31, "", class145.field2309);
            return;
        }
        String var2 = class212.method2080(arg0, Statics.field253);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field509; var3++) {
            class8 var4 = field260[var3];
            String var5 = class212.method2080(var4.field131, Statics.field253);
            if (var5 != null && var5.equals(var2)) {
                class10.method100(31, "", arg0 + class145.field2319);
                return;
            }
            if (var4.field128 != null) {
                String var6 = class212.method2080(var4.field128, Statics.field253);
                if (var6 != null && var6.equals(var2)) {
                    class10.method100(31, "", arg0 + class145.field2319);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field505; var7++) {
            class16 var8 = field507[var7];
            String var9 = class212.method2080(var8.field228, Statics.field253);
            if (var9 != null && var9.equals(var2)) {
                class10.method100(31, "", class145.field2219 + arg0 + class145.field2208);
                return;
            }
            if (var8.field222 != null) {
                String var10 = class212.method2080(var8.field222, Statics.field253);
                if (var10 != null && var10.equals(var2)) {
                    class10.method100(31, "", class145.field2219 + arg0 + class145.field2208);
                    return;
                }
            }
        }
        if (class212.method2080(Statics.field524.field51, Statics.field253).equals(var2)) {
            class10.method100(31, "", class145.field2321);
        } else {
            field486.method2376(114);
            field486.method2120(class108.method97(arg0));
            field486.method2125(arg0);
        }
    }

    @ObfuscatedName("dk.du(Ljava/lang/String;I)V")
    public static final void method2554(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class212.method2080(arg0, Statics.field253);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field509; var2++) {
            class8 var3 = field260[var2];
            String var4 = var3.field131;
            String var5 = class212.method2080(var4, Statics.field253);
            if (class118.method831(arg0, var1, var4, var5)) {
                field509--;
                for (int var6 = var2; var6 < field509; var6++) {
                    field260[var6] = field260[var6 + 1];
                }
                field446 = field438;
                field486.method2376(27);
                field486.method2120(class108.method97(arg0));
                field486.method2125(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("q.ds(Ljava/lang/String;II)V")
    public static final void method505(String arg0, int arg1) {
        field486.method2376(217);
        field486.method2120(class108.method97(arg0) + 1);
        field486.method2120(arg1);
        field486.method2125(arg0);
    }

    @ObfuscatedName("ch.dd(Ljava/lang/String;S)V")
    public static final void method1972(String arg0) {
        if (Statics.field588 != null) {
            field486.method2376(34);
            field486.method2120(class108.method97(arg0));
            field486.method2125(arg0);
        }
    }

    @ObfuscatedName("da.dl(B)V")
    public static final void method2436() {
        field486.method2376(95);
        field486.method2120(0);
    }

    @ObfuscatedName("p.dm(Led;I)I")
    public static int method137(class155 arg0) {
        class182 var1 = (class182) field472.method3206(((long) arg0.field2537 << 32) + (long) arg0.field2538);
        return var1 == null ? arg0.field2597 : var1.field2872;
    }

    @ObfuscatedName("es.dy(Led;B)Z")
    public static boolean method2715(class155 arg0) {
        if (field424) {
            if (method137(arg0) != 0) {
                return false;
            }
            if (arg0.field2539 == 0) {
                return false;
            }
        }
        return arg0.field2549;
    }

    @ObfuscatedName("gv.da(Led;II)Ljava/lang/String;")
    public static String method3356(class155 arg0, int arg1) {
        int var2 = method137(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2625 == null) {
            return null;
        } else if (arg0.field2599 == null || arg0.field2599.length <= arg1 || arg0.field2599[arg1] == null || arg0.field2599[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2599[arg1];
        }
    }

    @ObfuscatedName("af.dz(Led;I)Ljava/lang/String;")
    public static String method732(class155 arg0) {
        int var1 = method137(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2604 == null || arg0.field2604.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2604;
        }
    }

    @ObfuscatedName("ay.db(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method806(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field251 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field251 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field251 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field251 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field251 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field256 + "/";
    }
}

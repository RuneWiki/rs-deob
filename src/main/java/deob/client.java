package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

public final class client extends class135 {

    @ObfuscatedName("client.i")
    public static boolean field255 = true;

    @ObfuscatedName("client.b")
    public static int field256 = 1;

    @ObfuscatedName("client.l")
    public static int field358 = 0;

    @ObfuscatedName("client.w")
    public static class211[] field319 = new class211[4];

    @ObfuscatedName("client.e")
    public static int field315 = 0;

    @ObfuscatedName("client.k")
    public static boolean field261 = false;

    @ObfuscatedName("client.f")
    public static boolean field262 = false;

    @ObfuscatedName("client.d")
    public static int field263 = 0;

    @ObfuscatedName("client.u")
    public static int field384 = 0;

    @ObfuscatedName("client.j")
    public static boolean field265 = true;

    @ObfuscatedName("client.g")
    public static int field266 = 0;

    @ObfuscatedName("client.p")
    public static long field267 = 1L;

    @ObfuscatedName("client.z")
    public static int field269 = -1;

    @ObfuscatedName("client.c")
    public static int field331 = -1;

    @ObfuscatedName("client.an")
    public static int field271 = -1;

    @ObfuscatedName("client.as")
    public static boolean field272 = true;

    @ObfuscatedName("client.ah")
    public static boolean field273 = false;

    @ObfuscatedName("client.ar")
    public static int field258 = 0;

    @ObfuscatedName("client.ae")
    public static int field470 = 0;

    @ObfuscatedName("client.av")
    public static int field276 = 0;

    @ObfuscatedName("client.al")
    public static int field326 = 0;

    @ObfuscatedName("client.aq")
    public static int field278 = 0;

    @ObfuscatedName("client.am")
    public static int field279 = 0;

    @ObfuscatedName("client.ax")
    public static int field280 = 0;

    @ObfuscatedName("client.az")
    public static int field375 = 0;

    @ObfuscatedName("client.ai")
    public static int field350 = 0;

    @ObfuscatedName("client.aa")
    public static class110 field302 = new class110(new byte[5000]);

    @ObfuscatedName("client.ao")
    public static class18 field284 = class18.field532;

    @ObfuscatedName("client.ad")
    public static int field391 = 0;

    @ObfuscatedName("client.aj")
    public static int field286 = 0;

    @ObfuscatedName("client.af")
    public static int field281 = 0;

    @ObfuscatedName("client.bk")
    public static int field292 = 0;

    @ObfuscatedName("client.bg")
    public static int field293 = 0;

    @ObfuscatedName("client.bt")
    public static int field415 = 0;

    @ObfuscatedName("client.bx")
    public static int field512 = 0;

    @ObfuscatedName("client.bn")
    public static int field296 = 0;

    @ObfuscatedName("client.cr")
    public static class31[] field464 = new class31[32768];

    @ObfuscatedName("client.ct")
    public static int field298 = 0;

    @ObfuscatedName("client.cw")
    public static int[] field299 = new int[32768];

    @ObfuscatedName("client.co")
    public static class113 field301 = new class113(5000);

    @ObfuscatedName("client.cj")
    public static class113 field450 = new class113(5000);

    @ObfuscatedName("client.cd")
    public static class113 field488 = new class113(5000);

    @ObfuscatedName("client.cb")
    public static int field484 = 0;

    @ObfuscatedName("client.ch")
    public static int field305 = 0;

    @ObfuscatedName("client.cn")
    public static int field306 = 0;

    @ObfuscatedName("client.cp")
    public static int field307 = 0;

    @ObfuscatedName("client.ck")
    public static int field308 = 0;

    @ObfuscatedName("client.cg")
    public static int field309 = 0;

    @ObfuscatedName("client.cy")
    public static int field310 = 0;

    @ObfuscatedName("client.cv")
    public static int field311 = 0;

    @ObfuscatedName("client.cc")
    public static boolean field312 = false;

    @ObfuscatedName("client.cs")
    public static int field313 = 0;

    @ObfuscatedName("client.dp")
    public static int field314 = 0;

    @ObfuscatedName("client.du")
    public static int field295 = 1;

    @ObfuscatedName("client.dj")
    public static int field316 = 0;

    @ObfuscatedName("client.di")
    public static int field317 = 1;

    @ObfuscatedName("client.do")
    public static int field318 = 0;

    @ObfuscatedName("client.dt")
    public static boolean field453 = false;

    @ObfuscatedName("client.dl")
    public static int[][][] field428 = new int[4][13][13];

    @ObfuscatedName("client.ds")
    public static final int[] field322 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.da")
    public static int field323 = 0;

    @ObfuscatedName("client.dz")
    public static int field381 = 2;

    @ObfuscatedName("client.dy")
    public static int field493 = 0;

    @ObfuscatedName("client.db")
    public static int field321 = 2;

    @ObfuscatedName("client.dx")
    public static int field300 = 0;

    @ObfuscatedName("client.de")
    public static int field328 = 1;

    @ObfuscatedName("client.dm")
    public static int field475 = 0;

    @ObfuscatedName("client.et")
    public static int field330 = 0;

    @ObfuscatedName("client.ep")
    public static int field446 = 2;

    @ObfuscatedName("client.ej")
    public static int field332 = 0;

    @ObfuscatedName("client.ee")
    public static int field347 = 1;

    @ObfuscatedName("client.eq")
    public static int field334 = 0;

    @ObfuscatedName("client.eo")
    public static int field431 = 0;

    @ObfuscatedName("client.ew")
    public static int field355 = 2301979;

    @ObfuscatedName("client.er")
    public static int field264 = 5063219;

    @ObfuscatedName("client.ft")
    public static int field382 = 3353893;

    @ObfuscatedName("client.fv")
    public static int field339 = 7759444;

    @ObfuscatedName("client.fu")
    public static boolean field340 = false;

    @ObfuscatedName("client.fk")
    public static int field372 = 0;

    @ObfuscatedName("client.fe")
    public static int field335 = 128;

    @ObfuscatedName("client.fm")
    public static int field443 = 0;

    @ObfuscatedName("client.fa")
    public static int field344 = 0;

    @ObfuscatedName("client.fr")
    public static int field456 = 0;

    @ObfuscatedName("client.fy")
    public static int field260 = 0;

    @ObfuscatedName("client.fw")
    public static int field324 = 0;

    @ObfuscatedName("client.fx")
    public static int field348 = 0;

    @ObfuscatedName("client.fp")
    public static boolean field304 = false;

    @ObfuscatedName("client.fb")
    public static int field390 = 0;

    @ObfuscatedName("client.fn")
    public static int field351 = 0;

    @ObfuscatedName("client.fq")
    public static int field352 = 50;

    @ObfuscatedName("client.fh")
    public static int[] field353 = new int[field352];

    @ObfuscatedName("client.fi")
    public static int[] field354 = new int[field352];

    @ObfuscatedName("client.fs")
    public static int[] field514 = new int[field352];

    @ObfuscatedName("client.fg")
    public static int[] field356 = new int[field352];

    @ObfuscatedName("client.gd")
    public static int[] field357 = new int[field352];

    @ObfuscatedName("client.ga")
    public static int[] field404 = new int[field352];

    @ObfuscatedName("client.gp")
    public static int[] field359 = new int[field352];

    @ObfuscatedName("client.go")
    public static String[] field360 = new String[field352];

    @ObfuscatedName("client.ge")
    public static int[][] field361 = new int[104][104];

    @ObfuscatedName("client.gf")
    public static int field362 = 0;

    @ObfuscatedName("client.gk")
    public static int field363 = -1;

    @ObfuscatedName("client.gj")
    public static int field253 = -1;

    @ObfuscatedName("client.gq")
    public static int field365 = 0;

    @ObfuscatedName("client.gh")
    public static int field517 = 0;

    @ObfuscatedName("client.gy")
    public static int field367 = 0;

    @ObfuscatedName("client.gt")
    public static int field368 = 0;

    @ObfuscatedName("client.gw")
    public static int field369 = 0;

    @ObfuscatedName("client.gr")
    public static int field370 = 0;

    @ObfuscatedName("client.gv")
    public static int field371 = 0;

    @ObfuscatedName("client.gl")
    public static int field342 = 0;

    @ObfuscatedName("client.gz")
    public static int field275 = 0;

    @ObfuscatedName("client.gg")
    public static int field374 = 0;

    @ObfuscatedName("client.gb")
    public static boolean field287 = false;

    @ObfuscatedName("client.gi")
    public static int field343 = 0;

    @ObfuscatedName("client.gs")
    public static int field377 = 0;

    @ObfuscatedName("client.hd")
    public static class3[] field378 = new class3[2048];

    @ObfuscatedName("client.hf")
    public static int field379 = 0;

    @ObfuscatedName("client.hb")
    public static int[] field380 = new int[2048];

    @ObfuscatedName("client.ht")
    public static int field320 = 0;

    @ObfuscatedName("client.hm")
    public static int[] field333 = new int[2048];

    @ObfuscatedName("client.hk")
    public static class110[] field383 = new class110[2048];

    @ObfuscatedName("client.hv")
    public static int field426 = -1;

    @ObfuscatedName("client.hq")
    public static int field417 = 0;

    @ObfuscatedName("client.hr")
    public static int field386 = 0;

    @ObfuscatedName("client.hx")
    public static int[] field387 = new int[1000];

    @ObfuscatedName("client.hh")
    public static final int[] field388 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hp")
    public static String[] field389 = new String[8];

    @ObfuscatedName("client.hs")
    public static boolean[] field277 = new boolean[8];

    @ObfuscatedName("client.hg")
    public static int[] field483 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hy")
    public static int field469 = -1;

    @ObfuscatedName("client.hj")
    public static class182[][][] field393 = new class182[4][104][104];

    @ObfuscatedName("client.hu")
    public static class182 field270 = new class182();

    @ObfuscatedName("client.hn")
    public static class182 field395 = new class182();

    @ObfuscatedName("client.ha")
    public static class182 field396 = new class182();

    @ObfuscatedName("client.ho")
    public static int[] field394 = new int[25];

    @ObfuscatedName("client.hl")
    public static int[] field398 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field399 = new int[25];

    @ObfuscatedName("client.hc")
    public static int field520 = 0;

    @ObfuscatedName("client.il")
    public static boolean field401 = false;

    @ObfuscatedName("client.ik")
    public static int field402 = 0;

    @ObfuscatedName("client.ic")
    public static int[] field430 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field366 = new int[500];

    @ObfuscatedName("client.iy")
    public static int[] field405 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field406 = new int[500];

    @ObfuscatedName("client.in")
    public static String[] field407 = new String[500];

    @ObfuscatedName("client.ie")
    public static String[] field345 = new String[500];

    @ObfuscatedName("client.io")
    public static int field409 = -1;

    @ObfuscatedName("client.iq")
    public static int field410 = -1;

    @ObfuscatedName("client.ib")
    public static int field412 = 0;

    @ObfuscatedName("client.im")
    public static int field507 = 50;

    @ObfuscatedName("client.ir")
    public static int field297 = 0;

    @ObfuscatedName("client.it")
    public static String field432 = null;

    @ObfuscatedName("client.ip")
    public static boolean field497 = false;

    @ObfuscatedName("client.jq")
    public static int field451 = -1;

    @ObfuscatedName("client.je")
    public static int field418 = -1;

    @ObfuscatedName("client.jn")
    public static String field349 = null;

    @ObfuscatedName("client.jc")
    public static String field420 = null;

    @ObfuscatedName("client.jh")
    public static int field421 = -1;

    @ObfuscatedName("client.jr")
    public static class179 field422 = new class179(8);

    @ObfuscatedName("client.jg")
    public static int field423 = 0;

    @ObfuscatedName("client.jt")
    public static int field424 = 0;

    @ObfuscatedName("client.jy")
    public static class157 field425 = null;

    @ObfuscatedName("client.ju")
    public static int field437 = 0;

    @ObfuscatedName("client.jp")
    public static int field427 = 0;

    @ObfuscatedName("client.jz")
    public static int field337 = 0;

    @ObfuscatedName("client.jx")
    public static int field429 = -1;

    @ObfuscatedName("client.jj")
    public static boolean field329 = false;

    @ObfuscatedName("client.jv")
    public static boolean field419 = false;

    @ObfuscatedName("client.jo")
    public static boolean field385 = false;

    @ObfuscatedName("client.jb")
    public static class157 field433 = null;

    @ObfuscatedName("client.jl")
    public static class157 field458 = null;

    @ObfuscatedName("client.jd")
    public static int field435 = 0;

    @ObfuscatedName("client.jf")
    public static int field436 = 0;

    @ObfuscatedName("client.jk")
    public static class157 field516 = null;

    @ObfuscatedName("client.jw")
    public static boolean field282 = false;

    @ObfuscatedName("client.js")
    public static int field439 = -1;

    @ObfuscatedName("client.jm")
    public static int field440 = -1;

    @ObfuscatedName("client.kb")
    public static boolean field441 = false;

    @ObfuscatedName("client.kr")
    public static int field442 = -1;

    @ObfuscatedName("client.kn")
    public static int field338 = -1;

    @ObfuscatedName("client.kz")
    public static boolean field444 = false;

    @ObfuscatedName("client.ke")
    public static int field414 = 1;

    @ObfuscatedName("client.kp")
    public static int[] field373 = new int[32];

    @ObfuscatedName("client.kc")
    public static int field447 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field448 = new int[32];

    @ObfuscatedName("client.ku")
    public static int field449 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field487 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field274 = 0;

    @ObfuscatedName("client.kd")
    public static int field452 = 0;

    @ObfuscatedName("client.kt")
    public static int field486 = 0;

    @ObfuscatedName("client.ky")
    public static int field259 = 0;

    @ObfuscatedName("client.kx")
    public static int field501 = 0;

    @ObfuscatedName("client.kg")
    public static int field455 = 0;

    @ObfuscatedName("client.ko")
    public static int field457 = 0;

    @ObfuscatedName("client.kw")
    public static int[] field294 = new int[2000];

    @ObfuscatedName("client.ka")
    public static String[] field459 = new String[1000];

    @ObfuscatedName("client.lg")
    public static int field460 = 0;

    @ObfuscatedName("client.ls")
    public static class182 field461 = new class182();

    @ObfuscatedName("client.lw")
    public static class182 field462 = new class182();

    @ObfuscatedName("client.lo")
    public static class182 field463 = new class182();

    @ObfuscatedName("client.lr")
    public static class179 field346 = new class179(512);

    @ObfuscatedName("client.lj")
    public static int field465 = 0;

    @ObfuscatedName("client.lx")
    public static int field336 = -2;

    @ObfuscatedName("client.lp")
    public static boolean[] field467 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static boolean[] field468 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static boolean[] field454 = new boolean[100];

    @ObfuscatedName("client.lu")
    public static int[] field257 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field471 = new int[100];

    @ObfuscatedName("client.lq")
    public static int[] field472 = new int[100];

    @ObfuscatedName("client.lf")
    public static int[] field473 = new int[100];

    @ObfuscatedName("client.lb")
    public static int field474 = 0;

    @ObfuscatedName("client.le")
    public static int[] field502 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ld")
    public static int field476 = 0;

    @ObfuscatedName("client.lh")
    public static int field477 = 0;

    @ObfuscatedName("client.ln")
    public static String field478 = "";

    @ObfuscatedName("client.ly")
    public static long[] field479 = new long[100];

    @ObfuscatedName("client.lv")
    public static int field480 = 0;

    @ObfuscatedName("client.ll")
    public static int field481 = 0;

    @ObfuscatedName("client.mj")
    public static int[] field482 = new int[128];

    @ObfuscatedName("client.md")
    public static int[] field413 = new int[128];

    @ObfuscatedName("client.ml")
    public static long field504 = -1L;

    @ObfuscatedName("client.mz")
    public static String field485 = null;

    @ObfuscatedName("client.mf")
    public static String field341 = null;

    @ObfuscatedName("client.mc")
    public static int field400 = -1;

    @ObfuscatedName("client.me")
    public static int field416 = 0;

    @ObfuscatedName("client.mk")
    public static int[] field489 = new int[1000];

    @ObfuscatedName("client.ms")
    public static int[] field490 = new int[1000];

    @ObfuscatedName("client.mq")
    public static class73[] field491 = new class73[1000];

    @ObfuscatedName("client.mo")
    public static int field492 = 0;

    @ObfuscatedName("client.mt")
    public static int field325 = 0;

    @ObfuscatedName("client.mp")
    public static int field494 = 0;

    @ObfuscatedName("client.mh")
    public static int field495 = 255;

    @ObfuscatedName("client.mx")
    public static int field496 = -1;

    @ObfuscatedName("client.mv")
    public static boolean field408 = false;

    @ObfuscatedName("client.ne")
    public static int field498 = 127;

    @ObfuscatedName("client.nm")
    public static int field499 = 127;

    @ObfuscatedName("client.nx")
    public static int field397 = 0;

    @ObfuscatedName("client.np")
    public static int[] field285 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field503 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field268 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field505 = new int[50];

    @ObfuscatedName("client.nq")
    public static class53[] field506 = new class53[50];

    @ObfuscatedName("client.nd")
    public static boolean field500 = false;

    @ObfuscatedName("client.of")
    public static boolean[] field508 = new boolean[5];

    @ObfuscatedName("client.ob")
    public static int[] field509 = new int[5];

    @ObfuscatedName("client.on")
    public static int[] field510 = new int[5];

    @ObfuscatedName("client.ox")
    public static int[] field511 = new int[5];

    @ObfuscatedName("client.oq")
    public static int[] field445 = new int[5];

    @ObfuscatedName("client.oy")
    public static int field513 = 0;

    @ObfuscatedName("client.om")
    public static int field327 = 0;

    @ObfuscatedName("client.ov")
    public static class16[] field515 = new class16[400];

    @ObfuscatedName("client.os")
    public static class178 field364 = new class178();

    @ObfuscatedName("client.oi")
    public static int field434 = 0;

    @ObfuscatedName("client.oz")
    public static class8[] field518 = new class8[400];

    @ObfuscatedName("client.ow")
    public static class162 field519 = new class162();

    @ObfuscatedName("client.oc")
    public static int field466 = -1;

    @ObfuscatedName("client.ok")
    public static int field521 = -1;

    @ObfuscatedName("client.oh")
    public static class203[] field522 = new class203[6];

    @ObfuscatedName("client.v(I)V")
    public final void method186() {
    }

    public final void init() {
        if (!this.method2632()) {
            return;
        }
        class173[] var1 = new class173[] { class173.field2859, class173.field2857, class173.field2854, class173.field2851, class173.field2852, class173.field2855, class173.field2856, class173.field2860, class173.field2858, class173.field2861, class173.field2853, class173.field2863, class173.field2850, class173.field2862, class173.field2849 };
        class173[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class173 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2864);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2864)) {
                    case 1:
                        Statics.field283 = (class144) class100.method111(class144.method708(), Integer.parseInt(var5));
                        if (Statics.field283 == class144.field2160) {
                            Statics.field67 = class195.field2929;
                        } else {
                            Statics.field67 = class195.field2933;
                        }
                        break;
                    case 2:
                        if (var5.equalsIgnoreCase(class2.field25)) {
                        }
                    case 3:
                    case 7:
                    default:
                        break;
                    case 4:
                        Statics.field1453 = var5;
                        break;
                    case 5:
                        Statics.field1070 = var5;
                        break;
                    case 6:
                        Statics.field2556 = Integer.parseInt(var5);
                        break;
                    case 8:
                        field358 = Integer.parseInt(var5);
                        break;
                    case 9:
                        field256 = Integer.parseInt(var5);
                        break;
                    case 10:
                        int var6 = Integer.parseInt(var5);
                        class143[] var7 = new class143[] { class143.field2147, class143.field2148, class143.field2151, class143.field2146 };
                        class143[] var8 = var7;
                        int var9 = 0;
                        class143 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class143 var10 = var8[var9];
                            if (var10.field2150 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field438 = var11;
                        break;
                    case 11:
                        field315 = Integer.parseInt(var5);
                        break;
                    case 12:
                        Statics.field1919 = Integer.parseInt(var5);
                        break;
                    case 13:
                        if (var5.equalsIgnoreCase(class2.field25)) {
                            field261 = true;
                        } else {
                            field261 = false;
                        }
                        break;
                    case 14:
                        field263 = Integer.parseInt(var5);
                }
            }
        }
        class80.field1394 = false;
        field262 = false;
        Statics.field2111 = this.getCodeBase().getHost();
        String var12 = Statics.field438.field2149;
        byte var13 = 0;
        try {
            class140.method551("oldschool", var12, var13, 16);
        } catch (Exception var15) {
            class139.method2550((String) null, var15);
        }
        Statics.field254 = this;
        this.method2614(765, 503, 74);
    }

    @ObfuscatedName("client.b(S)V")
    public final void method376() {
        Statics.field1863 = field315 == 0 ? 43594 : field256 + 40000;
        Statics.field695 = field315 == 0 ? 443 : field256 + 50000;
        Statics.field175 = Statics.field1863;
        Statics.field1071 = class158.field2693;
        Statics.field2697 = class158.field2694;
        Statics.field1010 = class158.field2695;
        Statics.field616 = class158.field2696;
        if (Statics.field1969.toLowerCase().indexOf("microsoft") == -1) {
            class128.field1999[44] = 71;
            class128.field1999[45] = 26;
            class128.field1999[46] = 72;
            class128.field1999[47] = 73;
            class128.field1999[59] = 57;
            class128.field1999[61] = 27;
            class128.field1999[91] = 42;
            class128.field1999[92] = 74;
            class128.field1999[93] = 43;
            class128.field1999[192] = 28;
            class128.field1999[222] = 58;
            class128.field1999[520] = 59;
        } else {
            class128.field1999[186] = 57;
            class128.field1999[187] = 27;
            class128.field1999[188] = 71;
            class128.field1999[189] = 26;
            class128.field1999[190] = 72;
            class128.field1999[191] = 73;
            class128.field1999[192] = 58;
            class128.field1999[219] = 42;
            class128.field1999[220] = 74;
            class128.field1999[221] = 43;
            class128.field1999[222] = 59;
            class128.field1999[223] = 28;
        }
        class128.method2899(Statics.field2706);
        class131.method813(Statics.field2706);
        Statics.field1902 = class122.method2055();
        if (Statics.field1902 != null) {
            Statics.field1902.method2431(Statics.field2706);
        }
        Statics.field1674 = new class125(255, class140.field2119, class140.field2120, 500000);
        class209 var1 = null;
        class9 var2 = new class9();
        try {
            var1 = class140.method906("", Statics.field283.field2165, false);
            byte[] var3 = new byte[(int) var1.method3533()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method3534(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class9(new class110(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method3530();
            }
        } catch (Exception var9) {
        }
        Statics.field101 = var2;
        Statics.field924 = this.getToolkit().getSystemClipboard();
        class129.method5(this, Statics.field1653);
        if (field315 != 0) {
            field273 = true;
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method299() {
        field266++;
        this.method439();
        while (true) {
            class182 var1 = class154.field2529;
            class153 var2;
            synchronized (class154.field2529) {
                var2 = (class153) class154.field2530.method3249();
            }
            if (var2 == null) {
                class166.method2424();
                method537();
                class128.method730();
                class131.method1964();
                if (Statics.field1902 != null) {
                    int var4 = Statics.field1902.method2436();
                    field460 = var4;
                }
                if (field384 == 0) {
                    method1373();
                    Statics.field2014.method2459();
                    for (int var5 = 0; var5 < 32; var5++) {
                        field2085[var5] = 0L;
                    }
                    for (int var6 = 0; var6 < 32; var6++) {
                        field2086[var6] = 0L;
                    }
                    Statics.field1955 = 0;
                } else if (field384 == 5) {
                    class29.method2460(this);
                    method1373();
                    Statics.field2014.method2459();
                    for (int var7 = 0; var7 < 32; var7++) {
                        field2085[var7] = 0L;
                    }
                    for (int var8 = 0; var8 < 32; var8++) {
                        field2086[var8] = 0L;
                    }
                    Statics.field1955 = 0;
                } else if (field384 == 10 || field384 == 11) {
                    class29.method2460(this);
                } else if (field384 == 20) {
                    class29.method2460(this);
                    method2856();
                } else if (field384 == 25) {
                    method3367(false);
                    field314 = 0;
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field174.length; var10++) {
                        if (Statics.field68[var10] != -1 && Statics.field174[var10] == null) {
                            Statics.field174[var10] = Statics.field529.method2731(Statics.field68[var10], 0);
                            if (Statics.field174[var10] == null) {
                                var9 = false;
                                field314++;
                            }
                        }
                        if (Statics.field2046[var10] != -1 && Statics.field207[var10] == null) {
                            Statics.field207[var10] = Statics.field529.method2732(Statics.field2046[var10], 0, Statics.field956[var10]);
                            if (Statics.field207[var10] == null) {
                                var9 = false;
                                field314++;
                            }
                        }
                    }
                    if (var9) {
                        field316 = 0;
                        boolean var11 = true;
                        for (int var12 = 0; var12 < Statics.field174.length; var12++) {
                            byte[] var13 = Statics.field207[var12];
                            if (var13 != null) {
                                int var14 = (Statics.field54[var12] >> 8) * 64 - Statics.field1935;
                                int var15 = (Statics.field54[var12] & 0xFF) * 64 - Statics.field1820;
                                if (field453) {
                                    var14 = 10;
                                    var15 = 10;
                                }
                                boolean var17 = true;
                                class110 var18 = new class110(var13);
                                int var19 = -1;
                                label1136: while (true) {
                                    int var20 = var18.method2144();
                                    if (var20 == 0) {
                                        var11 &= var17;
                                        break;
                                    }
                                    var19 += var20;
                                    int var21 = 0;
                                    boolean var22 = false;
                                    while (true) {
                                        while (!var22) {
                                            int var24 = var18.method2144();
                                            if (var24 == 0) {
                                                continue label1136;
                                            }
                                            var21 += var24 - 1;
                                            int var25 = var21 & 0x3F;
                                            int var26 = var21 >> 6 & 0x3F;
                                            int var27 = var18.method2199() >> 2;
                                            int var28 = var14 + var26;
                                            int var29 = var15 + var25;
                                            if (var28 > 0 && var29 > 0 && var28 < 103 && var29 < 103) {
                                                class37 var30 = class37.method2964(var19);
                                                if (var27 != 22 || !field262 || var30.field862 != 0 || var30.field842 == 1 || var30.field881) {
                                                    if (!var30.method670()) {
                                                        field316++;
                                                        var17 = false;
                                                    }
                                                    var22 = true;
                                                }
                                            }
                                        }
                                        int var23 = var18.method2144();
                                        if (var23 == 0) {
                                            break;
                                        }
                                        var18.method2199();
                                    }
                                }
                            }
                        }
                        if (var11) {
                            if (field318 != 0) {
                                method1874(class147.field2285 + class2.field20 + class2.field17 + 100 + "%" + class2.field18, true);
                            }
                            method537();
                            method738();
                            method537();
                            Statics.field2947.method1592();
                            method537();
                            System.gc();
                            for (int var32 = 0; var32 < 4; var32++) {
                                field319[var32].method3597();
                            }
                            for (int var33 = 0; var33 < 4; var33++) {
                                for (int var34 = 0; var34 < 104; var34++) {
                                    for (int var35 = 0; var35 < 104; var35++) {
                                        class6.field76[var33][var34][var35] = 0;
                                    }
                                }
                            }
                            method537();
                            class6.method1015();
                            int var36 = Statics.field174.length;
                            class21.method2506();
                            method3367(true);
                            if (!field453) {
                                int var37 = 0;
                                label1074: while (true) {
                                    if (var37 >= var36) {
                                        for (int var51 = 0; var51 < var36; var51++) {
                                            int var52 = (Statics.field54[var51] >> 8) * 64 - Statics.field1935;
                                            int var53 = (Statics.field54[var51] & 0xFF) * 64 - Statics.field1820;
                                            byte[] var54 = Statics.field174[var51];
                                            if (var54 == null && Statics.field630 < 800) {
                                                method537();
                                                class6.method1852(var52, var53, 64, 64);
                                            }
                                        }
                                        method3367(true);
                                        int var55 = 0;
                                        while (true) {
                                            if (var55 >= var36) {
                                                break label1074;
                                            }
                                            byte[] var56 = Statics.field207[var55];
                                            if (var56 != null) {
                                                int var57 = (Statics.field54[var55] >> 8) * 64 - Statics.field1935;
                                                int var58 = (Statics.field54[var55] & 0xFF) * 64 - Statics.field1820;
                                                method537();
                                                class6.method140(var56, var57, var58, Statics.field2947, field319);
                                            }
                                            var55++;
                                        }
                                    }
                                    int var38 = (Statics.field54[var37] >> 8) * 64 - Statics.field1935;
                                    int var39 = (Statics.field54[var37] & 0xFF) * 64 - Statics.field1820;
                                    byte[] var40 = Statics.field174[var37];
                                    if (var40 != null) {
                                        method537();
                                        int var41 = Statics.field2023 * 8 - 48;
                                        int var42 = Statics.field630 * 8 - 48;
                                        class211[] var43 = field319;
                                        int var44 = 0;
                                        label1071: while (true) {
                                            if (var44 >= 4) {
                                                class110 var47 = new class110(var40);
                                                int var48 = 0;
                                                while (true) {
                                                    if (var48 >= 4) {
                                                        break label1071;
                                                    }
                                                    for (int var49 = 0; var49 < 64; var49++) {
                                                        for (int var50 = 0; var50 < 64; var50++) {
                                                            class6.method1328(var47, var48, var38 + var49, var39 + var50, var41, var42, 0);
                                                        }
                                                    }
                                                    var48++;
                                                }
                                            }
                                            for (int var45 = 0; var45 < 64; var45++) {
                                                for (int var46 = 0; var46 < 64; var46++) {
                                                    if (var38 + var45 > 0 && var38 + var45 < 103 && var39 + var46 > 0 && var39 + var46 < 103) {
                                                        var43[var44].field3032[var38 + var45][var39 + var46] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var44++;
                                        }
                                    }
                                    var37++;
                                }
                            }
                            if (field453) {
                                int var59 = 0;
                                label1020: while (true) {
                                    if (var59 >= 4) {
                                        for (int var70 = 0; var70 < 13; var70++) {
                                            for (int var71 = 0; var71 < 13; var71++) {
                                                int var72 = field428[0][var70][var71];
                                                if (var72 == -1) {
                                                    class6.method1852(var70 * 8, var71 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method3367(true);
                                        int var73 = 0;
                                        while (true) {
                                            if (var73 >= 4) {
                                                break label1020;
                                            }
                                            method537();
                                            for (int var74 = 0; var74 < 13; var74++) {
                                                for (int var75 = 0; var75 < 13; var75++) {
                                                    int var76 = field428[var73][var74][var75];
                                                    if (var76 != -1) {
                                                        int var77 = var76 >> 24 & 0x3;
                                                        int var78 = var76 >> 1 & 0x3;
                                                        int var79 = var76 >> 14 & 0x3FF;
                                                        int var80 = var76 >> 3 & 0x7FF;
                                                        int var81 = (var79 / 8 << 8) + var80 / 8;
                                                        for (int var82 = 0; var82 < Statics.field54.length; var82++) {
                                                            if (Statics.field54[var82] == var81 && Statics.field207[var82] != null) {
                                                                class6.method1863(Statics.field207[var82], var73, var74 * 8, var75 * 8, var77, (var79 & 0x7) * 8, (var80 & 0x7) * 8, var78, Statics.field2947, field319);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var73++;
                                        }
                                    }
                                    method537();
                                    for (int var60 = 0; var60 < 13; var60++) {
                                        for (int var61 = 0; var61 < 13; var61++) {
                                            boolean var62 = false;
                                            int var63 = field428[var59][var60][var61];
                                            if (var63 != -1) {
                                                int var64 = var63 >> 24 & 0x3;
                                                int var65 = var63 >> 1 & 0x3;
                                                int var66 = var63 >> 14 & 0x3FF;
                                                int var67 = var63 >> 3 & 0x7FF;
                                                int var68 = (var66 / 8 << 8) + var67 / 8;
                                                for (int var69 = 0; var69 < Statics.field54.length; var69++) {
                                                    if (Statics.field54[var69] == var68 && Statics.field174[var69] != null) {
                                                        class6.method2979(Statics.field174[var69], var59, var60 * 8, var61 * 8, var64, (var66 & 0x7) * 8, (var67 & 0x7) * 8, var65, field319);
                                                        var62 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var62) {
                                                class6.method2461(var59, var60 * 8, var61 * 8);
                                            }
                                        }
                                    }
                                    var59++;
                                }
                            }
                            method3367(true);
                            method738();
                            method537();
                            class80 var83 = Statics.field2947;
                            class211[] var84 = field319;
                            for (int var85 = 0; var85 < 4; var85++) {
                                for (int var86 = 0; var86 < 104; var86++) {
                                    for (int var87 = 0; var87 < 104; var87++) {
                                        if ((class6.field76[var85][var86][var87] & 0x1) == 1) {
                                            int var88 = var85;
                                            if ((class6.field76[1][var86][var87] & 0x2) == 2) {
                                                var88 = var85 - 1;
                                            }
                                            if (var88 >= 0) {
                                                var84[var88].method3578(var86, var87);
                                            }
                                        }
                                    }
                                }
                            }
                            class6.field75 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field75 < -8) {
                                class6.field75 = -8;
                            }
                            if (class6.field75 > 8) {
                                class6.field75 = 8;
                            }
                            class6.field78 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field78 < -16) {
                                class6.field78 = -16;
                            }
                            if (class6.field78 > 16) {
                                class6.field78 = 16;
                            }
                            for (int var89 = 0; var89 < 4; var89++) {
                                byte[][] var90 = Statics.field1523[var89];
                                int var91 = (int) Math.sqrt(5100.0D);
                                int var92 = var91 * 768 >> 8;
                                for (int var93 = 1; var93 < 103; var93++) {
                                    for (int var94 = 1; var94 < 103; var94++) {
                                        int var95 = class6.field94[var89][var94 + 1][var93] - class6.field94[var89][var94 - 1][var93];
                                        int var96 = class6.field94[var89][var94][var93 + 1] - class6.field94[var89][var94][var93 - 1];
                                        int var97 = (int) Math.sqrt((double) (var96 * var96 + var95 * var95 + 65536));
                                        int var98 = (var95 << 8) / var97;
                                        int var99 = 65536 / var97;
                                        int var100 = (var96 << 8) / var97;
                                        int var101 = (var100 * -50 + var98 * -50 + var99 * -10) / var92 + 96;
                                        int var102 = (var90[var94][var93] >> 1) + (var90[var94][var93 + 1] >> 3) + (var90[var94][var93 - 1] >> 2) + (var90[var94 - 1][var93] >> 2) + (var90[var94 + 1][var93] >> 3);
                                        Statics.field592[var94][var93] = var101 - var102;
                                    }
                                }
                                for (int var103 = 0; var103 < 104; var103++) {
                                    Statics.field81[var103] = 0;
                                    Statics.field82[var103] = 0;
                                    Statics.field96[var103] = 0;
                                    Statics.field84[var103] = 0;
                                    Statics.field204[var103] = 0;
                                }
                                for (int var104 = -5; var104 < 109; var104++) {
                                    for (int var105 = 0; var105 < 104; var105++) {
                                        int var106 = var104 + 5;
                                        int var10002;
                                        if (var106 >= 0 && var106 < 104) {
                                            int var107 = Statics.field93[var89][var106][var105] & 0xFF;
                                            if (var107 > 0) {
                                                int var108 = var107 - 1;
                                                class38 var109 = (class38) class38.field894.method3181((long) var108);
                                                class38 var110;
                                                if (var109 == null) {
                                                    byte[] var111 = Statics.field897.method2731(1, var108);
                                                    class38 var112 = new class38();
                                                    if (var111 != null) {
                                                        var112.method712(new class110(var111), var108);
                                                    }
                                                    var112.method711();
                                                    class38.field894.method3183(var112, (long) var108);
                                                    var110 = var112;
                                                } else {
                                                    var110 = var109;
                                                }
                                                Statics.field81[var105] += var110.field895;
                                                Statics.field82[var105] += var110.field896;
                                                Statics.field96[var105] += var110.field899;
                                                Statics.field84[var105] += var110.field900;
                                                var10002 = Statics.field204[var105]++;
                                            }
                                        }
                                        int var114 = var104 - 5;
                                        if (var114 >= 0 && var114 < 104) {
                                            int var115 = Statics.field93[var89][var114][var105] & 0xFF;
                                            if (var115 > 0) {
                                                int var116 = var115 - 1;
                                                class38 var117 = (class38) class38.field894.method3181((long) var116);
                                                class38 var118;
                                                if (var117 == null) {
                                                    byte[] var119 = Statics.field897.method2731(1, var116);
                                                    class38 var120 = new class38();
                                                    if (var119 != null) {
                                                        var120.method712(new class110(var119), var116);
                                                    }
                                                    var120.method711();
                                                    class38.field894.method3183(var120, (long) var116);
                                                    var118 = var120;
                                                } else {
                                                    var118 = var117;
                                                }
                                                Statics.field81[var105] -= var118.field895;
                                                Statics.field82[var105] -= var118.field896;
                                                Statics.field96[var105] -= var118.field899;
                                                Statics.field84[var105] -= var118.field900;
                                                var10002 = Statics.field204[var105]--;
                                            }
                                        }
                                    }
                                    if (var104 >= 1 && var104 < 103) {
                                        int var122 = 0;
                                        int var123 = 0;
                                        int var124 = 0;
                                        int var125 = 0;
                                        int var126 = 0;
                                        for (int var127 = -5; var127 < 109; var127++) {
                                            int var128 = var127 + 5;
                                            if (var128 >= 0 && var128 < 104) {
                                                var122 += Statics.field81[var128];
                                                var123 += Statics.field82[var128];
                                                var124 += Statics.field96[var128];
                                                var125 += Statics.field84[var128];
                                                var126 += Statics.field204[var128];
                                            }
                                            int var129 = var127 - 5;
                                            if (var129 >= 0 && var129 < 104) {
                                                var122 -= Statics.field81[var129];
                                                var123 -= Statics.field82[var129];
                                                var124 -= Statics.field96[var129];
                                                var125 -= Statics.field84[var129];
                                                var126 -= Statics.field204[var129];
                                            }
                                            if (var127 >= 1 && var127 < 103) {
                                                if (field262 && (class6.field76[0][var104][var127] & 0x2) == 0) {
                                                    if ((class6.field76[var89][var104][var127] & 0x10) != 0) {
                                                        continue;
                                                    }
                                                    int var130;
                                                    if ((class6.field76[var89][var104][var127] & 0x8) != 0) {
                                                        var130 = 0;
                                                    } else if (var89 <= 0 || (class6.field76[1][var104][var127] & 0x2) == 0) {
                                                        var130 = var89;
                                                    } else {
                                                        var130 = var89 - 1;
                                                    }
                                                    if (field313 != var130) {
                                                        continue;
                                                    }
                                                }
                                                if (var89 < class6.field92) {
                                                    class6.field92 = var89;
                                                }
                                                int var131 = Statics.field93[var89][var104][var127] & 0xFF;
                                                int var132 = Statics.field1352[var89][var104][var127] & 0xFF;
                                                if (var131 > 0 || var132 > 0) {
                                                    int var133 = class6.field94[var89][var104][var127];
                                                    int var134 = class6.field94[var89][var104 + 1][var127];
                                                    int var135 = class6.field94[var89][var104 + 1][var127 + 1];
                                                    int var136 = class6.field94[var89][var104][var127 + 1];
                                                    int var137 = Statics.field592[var104][var127];
                                                    int var138 = Statics.field592[var104 + 1][var127];
                                                    int var139 = Statics.field592[var104 + 1][var127 + 1];
                                                    int var140 = Statics.field592[var104][var127 + 1];
                                                    int var141 = -1;
                                                    int var142 = -1;
                                                    if (var131 > 0) {
                                                        int var143 = var122 * 256 / var125;
                                                        int var144 = var123 / var126;
                                                        int var145 = var124 / var126;
                                                        var141 = class6.method3357(var143, var144, var145);
                                                        int var146 = class6.field75 + var143 & 0xFF;
                                                        int var147 = class6.field78 + var145;
                                                        if (var147 < 0) {
                                                            var147 = 0;
                                                        } else if (var147 > 255) {
                                                            var147 = 255;
                                                        }
                                                        var142 = class6.method3357(var146, var144, var147);
                                                    }
                                                    if (var89 > 0) {
                                                        boolean var148 = true;
                                                        if (var131 == 0 && Statics.field79[var89][var104][var127] != 0) {
                                                            var148 = false;
                                                        }
                                                        if (var132 > 0) {
                                                            int var149 = var132 - 1;
                                                            class42 var150 = (class42) class42.field972.method3181((long) var149);
                                                            class42 var151;
                                                            if (var150 == null) {
                                                                byte[] var152 = Statics.field971.method2731(4, var149);
                                                                class42 var153 = new class42();
                                                                if (var152 != null) {
                                                                    var153.method815(new class110(var152), var149);
                                                                }
                                                                var153.method812();
                                                                class42.field972.method3183(var153, (long) var149);
                                                                var151 = var153;
                                                            } else {
                                                                var151 = var150;
                                                            }
                                                            if (!var151.field966) {
                                                                var148 = false;
                                                            }
                                                        }
                                                        if (var148 && var133 == var134 && var133 == var135 && var133 == var136) {
                                                            Statics.field1864[var89][var104][var127] |= 0x924;
                                                        }
                                                    }
                                                    int var154 = 0;
                                                    if (var142 != -1) {
                                                        var154 = class85.field1478[class6.method733(var142, 96)];
                                                    }
                                                    if (var132 == 0) {
                                                        var83.method1700(var89, var104, var127, 0, 0, -1, var133, var134, var135, var136, class6.method733(var141, var137), class6.method733(var141, var138), class6.method733(var141, var139), class6.method733(var141, var140), 0, 0, 0, 0, var154, 0);
                                                    } else {
                                                        int var155 = Statics.field79[var89][var104][var127] + 1;
                                                        byte var156 = Statics.field80[var89][var104][var127];
                                                        int var157 = var132 - 1;
                                                        class42 var158 = (class42) class42.field972.method3181((long) var157);
                                                        class42 var159;
                                                        if (var158 == null) {
                                                            byte[] var160 = Statics.field971.method2731(4, var157);
                                                            class42 var161 = new class42();
                                                            if (var160 != null) {
                                                                var161.method815(new class110(var160), var157);
                                                            }
                                                            var161.method812();
                                                            class42.field972.method3183(var161, (long) var157);
                                                            var159 = var161;
                                                        } else {
                                                            var159 = var158;
                                                        }
                                                        int var163 = var159.field965;
                                                        int var164;
                                                        int var165;
                                                        if (var163 >= 0) {
                                                            var164 = Statics.field1479.method1841(var163);
                                                            var165 = -1;
                                                        } else if (var159.field964 == 16711935) {
                                                            var165 = -2;
                                                            var163 = -1;
                                                            var164 = -2;
                                                        } else {
                                                            var165 = class6.method3357(var159.field963, var159.field969, var159.field970);
                                                            int var166 = class6.field75 + var159.field963 & 0xFF;
                                                            int var167 = class6.field78 + var159.field970;
                                                            if (var167 < 0) {
                                                                var167 = 0;
                                                            } else if (var167 > 255) {
                                                                var167 = 255;
                                                            }
                                                            var164 = class6.method3357(var166, var159.field969, var167);
                                                        }
                                                        int var168 = 0;
                                                        if (var164 != -2) {
                                                            var168 = class85.field1478[class6.method86(var164, 96)];
                                                        }
                                                        if (var159.field962 != -1) {
                                                            int var169 = class6.field75 + var159.field974 & 0xFF;
                                                            int var170 = class6.field78 + var159.field973;
                                                            if (var170 < 0) {
                                                                var170 = 0;
                                                            } else if (var170 > 255) {
                                                                var170 = 255;
                                                            }
                                                            int var171 = class6.method3357(var169, var159.field967, var170);
                                                            var168 = class85.field1478[class6.method86(var171, 96)];
                                                        }
                                                        var83.method1700(var89, var104, var127, var155, var156, var163, var133, var134, var135, var136, class6.method733(var141, var137), class6.method733(var141, var138), class6.method733(var141, var139), class6.method733(var141, var140), class6.method86(var165, var137), class6.method86(var165, var138), class6.method86(var165, var139), class6.method86(var165, var140), var154, var168);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var172 = 1; var172 < 103; var172++) {
                                    for (int var173 = 1; var173 < 103; var173++) {
                                        int var178;
                                        if ((class6.field76[var89][var173][var172] & 0x8) != 0) {
                                            var178 = 0;
                                        } else if (var89 <= 0 || (class6.field76[1][var173][var172] & 0x2) == 0) {
                                            var178 = var89;
                                        } else {
                                            var178 = var89 - 1;
                                        }
                                        var83.method1596(var89, var173, var172, var178);
                                    }
                                }
                                Statics.field93[var89] = (byte[][]) null;
                                Statics.field1352[var89] = (byte[][]) null;
                                Statics.field79[var89] = (byte[][]) null;
                                Statics.field80[var89] = (byte[][]) null;
                                Statics.field1523[var89] = (byte[][]) null;
                            }
                            var83.method1735(-50, -10, -50);
                            for (int var179 = 0; var179 < 104; var179++) {
                                for (int var180 = 0; var180 < 104; var180++) {
                                    if ((class6.field76[1][var179][var180] & 0x2) == 2) {
                                        var83.method1594(var179, var180);
                                    }
                                }
                            }
                            int var181 = 1;
                            int var182 = 2;
                            int var183 = 4;
                            for (int var184 = 0; var184 < 4; var184++) {
                                if (var184 > 0) {
                                    var181 <<= 0x3;
                                    var182 <<= 0x3;
                                    var183 <<= 0x3;
                                }
                                for (int var185 = 0; var185 <= var184; var185++) {
                                    for (int var186 = 0; var186 <= 104; var186++) {
                                        for (int var187 = 0; var187 <= 104; var187++) {
                                            if ((Statics.field1864[var185][var187][var186] & var181) != 0) {
                                                int var188 = var186;
                                                int var189 = var186;
                                                int var190 = var185;
                                                int var191 = var185;
                                                while (var188 > 0 && (Statics.field1864[var185][var187][var188 - 1] & var181) != 0) {
                                                    var188--;
                                                }
                                                while (var189 < 104 && (Statics.field1864[var185][var187][var189 + 1] & var181) != 0) {
                                                    var189++;
                                                }
                                                label696: while (var190 > 0) {
                                                    for (int var192 = var188; var192 <= var189; var192++) {
                                                        if ((Statics.field1864[var190 - 1][var187][var192] & var181) == 0) {
                                                            break label696;
                                                        }
                                                    }
                                                    var190--;
                                                }
                                                label685: while (var191 < var184) {
                                                    for (int var193 = var188; var193 <= var189; var193++) {
                                                        if ((Statics.field1864[var191 + 1][var187][var193] & var181) == 0) {
                                                            break label685;
                                                        }
                                                    }
                                                    var191++;
                                                }
                                                int var194 = (var191 + 1 - var190) * (var189 - var188 + 1);
                                                if (var194 >= 8) {
                                                    short var195 = 240;
                                                    int var196 = class6.field94[var191][var187][var188] - var195;
                                                    int var197 = class6.field94[var190][var187][var188];
                                                    class80.method1595(var184, 1, var187 * 128, var187 * 128, var188 * 128, var189 * 128 + 128, var196, var197);
                                                    for (int var198 = var190; var198 <= var191; var198++) {
                                                        for (int var199 = var188; var199 <= var189; var199++) {
                                                            Statics.field1864[var198][var187][var199] &= ~var181;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field1864[var185][var187][var186] & var182) != 0) {
                                                int var200 = var187;
                                                int var201 = var187;
                                                int var202 = var185;
                                                int var203 = var185;
                                                while (var200 > 0 && (Statics.field1864[var185][var200 - 1][var186] & var182) != 0) {
                                                    var200--;
                                                }
                                                while (var201 < 104 && (Statics.field1864[var185][var201 + 1][var186] & var182) != 0) {
                                                    var201++;
                                                }
                                                label749: while (var202 > 0) {
                                                    for (int var204 = var200; var204 <= var201; var204++) {
                                                        if ((Statics.field1864[var202 - 1][var204][var186] & var182) == 0) {
                                                            break label749;
                                                        }
                                                    }
                                                    var202--;
                                                }
                                                label738: while (var203 < var184) {
                                                    for (int var205 = var200; var205 <= var201; var205++) {
                                                        if ((Statics.field1864[var203 + 1][var205][var186] & var182) == 0) {
                                                            break label738;
                                                        }
                                                    }
                                                    var203++;
                                                }
                                                int var206 = (var203 + 1 - var202) * (var201 - var200 + 1);
                                                if (var206 >= 8) {
                                                    short var207 = 240;
                                                    int var208 = class6.field94[var203][var200][var186] - var207;
                                                    int var209 = class6.field94[var202][var200][var186];
                                                    class80.method1595(var184, 2, var200 * 128, var201 * 128 + 128, var186 * 128, var186 * 128, var208, var209);
                                                    for (int var210 = var202; var210 <= var203; var210++) {
                                                        for (int var211 = var200; var211 <= var201; var211++) {
                                                            Statics.field1864[var210][var211][var186] &= ~var182;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field1864[var185][var187][var186] & var183) != 0) {
                                                int var212 = var187;
                                                int var213 = var187;
                                                int var214 = var186;
                                                int var215 = var186;
                                                while (var214 > 0 && (Statics.field1864[var185][var187][var214 - 1] & var183) != 0) {
                                                    var214--;
                                                }
                                                while (var215 < 104 && (Statics.field1864[var185][var187][var215 + 1] & var183) != 0) {
                                                    var215++;
                                                }
                                                label802: while (var212 > 0) {
                                                    for (int var216 = var214; var216 <= var215; var216++) {
                                                        if ((Statics.field1864[var185][var212 - 1][var216] & var183) == 0) {
                                                            break label802;
                                                        }
                                                    }
                                                    var212--;
                                                }
                                                label791: while (var213 < 104) {
                                                    for (int var217 = var214; var217 <= var215; var217++) {
                                                        if ((Statics.field1864[var185][var213 + 1][var217] & var183) == 0) {
                                                            break label791;
                                                        }
                                                    }
                                                    var213++;
                                                }
                                                if ((var213 - var212 + 1) * (var215 - var214 + 1) >= 4) {
                                                    int var218 = class6.field94[var185][var212][var214];
                                                    class80.method1595(var184, 4, var212 * 128, var213 * 128 + 128, var214 * 128, var215 * 128 + 128, var218, var218);
                                                    for (int var219 = var212; var219 <= var213; var219++) {
                                                        for (int var220 = var214; var220 <= var215; var220++) {
                                                            Statics.field1864[var185][var219][var220] &= ~var183;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method3367(true);
                            int var221 = class6.field92;
                            if (var221 > Statics.field572) {
                                var221 = Statics.field572;
                            }
                            if (var221 < Statics.field572 - 1) {
                                int var222 = Statics.field572 - 1;
                            }
                            if (field262) {
                                Statics.field2947.method1593(class6.field92);
                            } else {
                                Statics.field2947.method1593(0);
                            }
                            for (int var223 = 0; var223 < 104; var223++) {
                                for (int var224 = 0; var224 < 104; var224++) {
                                    method32(var223, var224);
                                }
                            }
                            method537();
                            method553();
                            class37.field877.method3184();
                            if (Statics.field2041 != null) {
                                field301.method2376(183);
                                field301.method2120(1057001181);
                            }
                            if (!field453) {
                                int var225 = (Statics.field2023 - 6) / 8;
                                int var226 = (Statics.field2023 + 6) / 8;
                                int var227 = (Statics.field630 - 6) / 8;
                                int var228 = (Statics.field630 + 6) / 8;
                                for (int var229 = var225 - 1; var229 <= var226 + 1; var229++) {
                                    for (int var230 = var227 - 1; var230 <= var228 + 1; var230++) {
                                        if (var229 < var225 || var229 > var226 || var230 < var227 || var230 > var228) {
                                            Statics.field529.method2750("m" + var229 + "_" + var230);
                                            Statics.field529.method2750("l" + var229 + "_" + var230);
                                        }
                                    }
                                }
                            }
                            method590(30);
                            method537();
                            Statics.field93 = (byte[][][]) null;
                            Statics.field1352 = (byte[][][]) null;
                            Statics.field79 = (byte[][][]) null;
                            Statics.field80 = (byte[][][]) null;
                            Statics.field1864 = (int[][][]) null;
                            Statics.field1523 = (byte[][][]) null;
                            Statics.field592 = (int[][]) null;
                            Statics.field81 = null;
                            Statics.field82 = null;
                            Statics.field96 = null;
                            Statics.field84 = null;
                            Statics.field204 = null;
                            field301.method2376(195);
                            Statics.field2014.method2459();
                            for (int var231 = 0; var231 < 32; var231++) {
                                field2085[var231] = 0L;
                            }
                            for (int var232 = 0; var232 < 32; var232++) {
                                field2086[var232] = 0L;
                            }
                            Statics.field1955 = 0;
                        } else {
                            field318 = 2;
                        }
                    } else {
                        field318 = 1;
                    }
                }
                if (field384 == 30) {
                    method586();
                } else if (field384 == 40 || field384 == 45) {
                    method2856();
                }
                return;
            }
            var2.field2524.method2829(var2.field2521, (int) var2.field2908, var2.field2520, false);
        }
    }

    @ObfuscatedName("client.m(B)V")
    public final void method434() {
        boolean var1;
        label249: {
            try {
                if (class166.field2748 == 2) {
                    if (Statics.field2754 == null) {
                        Statics.field2754 = class163.method2975(Statics.field2749, Statics.field3036, Statics.field1950);
                        if (Statics.field2754 == null) {
                            var1 = false;
                            break label249;
                        }
                    }
                    if (Statics.field228 == null) {
                        Statics.field228 = new class54(Statics.field2747, Statics.field2746);
                    }
                    if (Statics.field3043.method3122(Statics.field2754, Statics.field2752, Statics.field228, 22050)) {
                        Statics.field3043.method3077();
                        Statics.field3043.method3059(Statics.field210);
                        Statics.field3043.method3064(Statics.field2754, Statics.field2751);
                        class166.field2748 = 0;
                        Statics.field2754 = null;
                        Statics.field228 = null;
                        Statics.field2749 = null;
                        var1 = true;
                        break label249;
                    }
                }
            } catch (Exception var31) {
                var31.printStackTrace();
                Statics.field3043.method3065();
                class166.field2748 = 0;
                Statics.field2754 = null;
                Statics.field228 = null;
                Statics.field2749 = null;
            }
            var1 = false;
        }
        if (var1 && field408 && Statics.field2018 != null) {
            Statics.field2018.method1006();
        }
        if (field2089) {
            class128.method2073(Statics.field2706);
            Canvas var4 = Statics.field2706;
            var4.removeMouseListener(class131.field2042);
            var4.removeMouseMotionListener(class131.field2042);
            var4.removeFocusListener(class131.field2042);
            class131.field2043 = 0;
            if (Statics.field1902 != null) {
                Statics.field1902.method2441(Statics.field2706);
            }
            this.method2615();
            class128.method2899(Statics.field2706);
            class131.method813(Statics.field2706);
            if (Statics.field1902 != null) {
                Statics.field1902.method2431(Statics.field2706);
            }
        }
        if (field384 == 0) {
            class135.method87(class29.field666, class29.field667, (Color) null);
        } else if (field384 == 5) {
            class29.method716(Statics.field652, Statics.field871);
        } else if (field384 == 10 || field384 == 11) {
            class29.method716(Statics.field652, Statics.field871);
        } else if (field384 == 20) {
            class29.method716(Statics.field652, Statics.field871);
        } else if (field384 == 25) {
            if (field318 == 1) {
                if (field314 > field295) {
                    field295 = field314;
                }
                int var5 = (field295 * 50 - field314 * 50) / field295;
                method1874(class147.field2285 + class2.field20 + class2.field17 + var5 + "%" + class2.field18, false);
            } else if (field318 == 2) {
                if (field316 > field317) {
                    field317 = field316;
                }
                int var6 = (field317 * 50 - field316 * 50) / field317 + 50;
                method1874(class147.field2285 + class2.field20 + class2.field17 + var6 + "%" + class2.field18, false);
            } else {
                method1874(class147.field2285, false);
            }
        } else if (field384 == 30) {
            if (field421 != -1) {
                method25(field421);
            }
            for (int var7 = 0; var7 < field465; var7++) {
                if (field467[var7]) {
                    field468[var7] = true;
                }
                field454[var7] = field467[var7];
                field467[var7] = false;
            }
            field336 = field266;
            field409 = -1;
            field410 = -1;
            Statics.field1354 = null;
            if (field421 != -1) {
                field465 = 0;
                method33(field421, 0, 0, 765, 503, 0, 0, -1);
            }
            class74.method1513();
            if (field401) {
                method2727();
            } else if (field409 != -1) {
                method2396(field409, field410);
            }
            if (field474 == 3) {
                for (int var8 = 0; var8 < field465; var8++) {
                    if (field454[var8]) {
                        class74.method1519(field257[var8], field471[var8], field472[var8], field473[var8], 16711935, 128);
                    } else if (field468[var8]) {
                        class74.method1519(field257[var8], field471[var8], field472[var8], field473[var8], 16711680, 128);
                    }
                }
            }
            int var9 = Statics.field572;
            int var10 = Statics.field1358.field793;
            int var11 = Statics.field1358.field736;
            int var12 = field431;
            for (class21 var13 = (class21) class21.field559.method3251(); var13 != null; var13 = (class21) class21.field559.method3261()) {
                if (var13.field560 != -1 || var13.field561 != null) {
                    int var14 = 0;
                    if (var10 > var13.field556) {
                        var14 += var10 - var13.field556;
                    } else if (var10 < var13.field555) {
                        var14 += var13.field555 - var10;
                    }
                    if (var11 > var13.field558) {
                        var14 += var11 - var13.field558;
                    } else if (var11 < var13.field554) {
                        var14 += var13.field554 - var11;
                    }
                    if (var14 - 64 > var13.field557 || field499 == 0 || var13.field565 != var9) {
                        if (var13.field553 != null) {
                            Statics.field376.method969(var13.field553);
                            var13.field553 = null;
                        }
                        if (var13.field562 != null) {
                            Statics.field376.method969(var13.field562);
                            var13.field562 = null;
                        }
                    } else {
                        var14 -= 64;
                        if (var14 < 0) {
                            var14 = 0;
                        }
                        int var15 = field499 * (var13.field557 - var14) / var13.field557;
                        class53 var10000;
                        if (var13.field553 != null) {
                            var13.field553.method1194(var15);
                        } else if (var13.field560 >= 0) {
                            var10000 = (class53) null;
                            class53 var16 = class53.method1054(Statics.field606, var13.field560, 0);
                            if (var16 != null) {
                                class57 var17 = var16.method1055().method1086(Statics.field1519);
                                class59 var18 = class59.method1109(var17, 100, var15);
                                var18.method1112(-1);
                                Statics.field376.method968(var18);
                                var13.field553 = var18;
                            }
                        }
                        if (var13.field562 != null) {
                            var13.field562.method1194(var15);
                            if (!var13.field562.method3344()) {
                                var13.field562 = null;
                            }
                        } else if (var13.field561 != null && (var13.field566 -= var12) <= 0) {
                            int var19 = (int) (Math.random() * (double) var13.field561.length);
                            var10000 = (class53) null;
                            class53 var20 = class53.method1054(Statics.field606, var13.field561[var19], 0);
                            if (var20 != null) {
                                class57 var21 = var20.method1055().method1086(Statics.field1519);
                                class59 var22 = class59.method1109(var21, 100, var15);
                                var22.method1112(0);
                                Statics.field376.method968(var22);
                                var13.field562 = var22;
                                var13.field566 = var13.field564 + (int) (Math.random() * (double) (var13.field563 - var13.field564));
                            }
                        }
                    }
                }
            }
            field431 = 0;
        } else if (field384 == 40) {
            method1874(class147.field2191 + class2.field20 + class147.field2192, false);
        } else if (field384 == 45) {
            method1874(class147.field2357, false);
        }
        if (field384 == 30 && field474 == 0 && !field2087) {
            try {
                Graphics var23 = Statics.field2706.getGraphics();
                for (int var24 = 0; var24 < field465; var24++) {
                    if (field468[var24]) {
                        Statics.field127.method1341(var23, field257[var24], field471[var24], field472[var24], field473[var24]);
                        field468[var24] = false;
                    }
                }
            } catch (Exception var30) {
                Statics.field2706.repaint();
            }
        } else if (field384 > 0) {
            try {
                Graphics var26 = Statics.field2706.getGraphics();
                Statics.field127.method1366(var26, 0, 0);
                field2087 = false;
                for (int var27 = 0; var27 < field465; var27++) {
                    field468[var27] = false;
                }
            } catch (Exception var29) {
                Statics.field2706.repaint();
            }
        }
    }

    @ObfuscatedName("client.w(I)V")
    public final void method236() {
        if (Statics.field392 != null) {
            Statics.field392.field181 = false;
        }
        Statics.field392 = null;
        if (Statics.field303 != null) {
            Statics.field303.method2593();
            Statics.field303 = null;
        }
        class128.method628();
        if (class131.field2042 != null) {
            class131 var1 = class131.field2042;
            synchronized (class131.field2042) {
                class131.field2042 = null;
            }
        }
        Statics.field1902 = null;
        if (Statics.field2018 != null) {
            Statics.field2018.method1007();
        }
        if (Statics.field708 != null) {
            Statics.field708.method1007();
        }
        class155.method772();
        Object var3 = class154.field2528;
        synchronized (class154.field2528) {
            if (class154.field2527 != 0) {
                class154.field2527 = 1;
                try {
                    class154.field2528.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        try {
            class140.field2119.method3568();
            for (int var6 = 0; var6 < Statics.field2124; var6++) {
                Statics.field1910[var6].method3568();
            }
            class140.field2120.method3568();
            class140.field2118.method3568();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ar.e(IB)V")
    public static void method590(int arg0) {
        if (field384 == arg0) {
            return;
        }
        if (field384 == 0) {
            class135.method2083();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field293 = 0;
            field415 = 0;
            field512 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1065 != null) {
            Statics.field1065.method2593();
            Statics.field1065 = null;
        }
        if (field384 == 25) {
            field318 = 0;
            field314 = 0;
            field295 = 1;
            field316 = 0;
            field317 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class29.method180(Statics.field2706, Statics.field2072, Statics.field2012, true, 0);
        } else if (arg0 == 20) {
            class29.method180(Statics.field2706, Statics.field2072, Statics.field2012, true, field384 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class29.method180(Statics.field2706, Statics.field2072, Statics.field2012, false, 4);
        } else if (Statics.field550) {
            Statics.field2973 = null;
            Statics.field658 = null;
            Statics.field208 = null;
            Statics.field1918 = null;
            Statics.field654 = null;
            Statics.field655 = null;
            Statics.field2974 = null;
            Statics.field2010 = null;
            Statics.field656 = null;
            Statics.field684 = null;
            Statics.field665 = null;
            Statics.field168 = null;
            Statics.field538 = null;
            Statics.field2122 = null;
            Statics.field1508 = null;
            Statics.field1844 = null;
            Statics.field1353 = null;
            Statics.field14 = null;
            Statics.field136 = null;
            Statics.field3037 = null;
            Statics.field547 = null;
            Statics.field661 = null;
            class166.field2748 = 1;
            Statics.field2749 = null;
            Statics.field3036 = -1;
            Statics.field1950 = -1;
            Statics.field210 = 0;
            Statics.field2751 = false;
            Statics.field2745 = 2;
            class155.method1865(true);
            Statics.field550 = false;
        }
        field384 = arg0;
    }

    @ObfuscatedName("client.n(B)V")
    public void method439() {
        if (field384 == 1000) {
            return;
        }
        long var1 = class106.method2471();
        int var3 = (int) (var1 - Statics.field2535);
        Statics.field2535 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class155.field2534 += var3;
        boolean var4;
        if (class155.field2533 == 0 && class155.field2539 == 0 && class155.field2542 == 0 && class155.field2537 == 0) {
            var4 = true;
        } else if (Statics.field2544 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class155.field2534 > 30000) {
                        throw new IOException();
                    }
                    while (class155.field2539 < 20 && class155.field2537 > 0) {
                        class156 var5 = (class156) class155.field2554.method3210();
                        class110 var6 = new class110(4);
                        var6.method2117(1);
                        var6.method2276((int) var5.field2908);
                        Statics.field2544.method2597(var6.field1865, 0, 4);
                        class155.field2538.method3211(var5, var5.field2908);
                        class155.field2537--;
                        class155.field2539++;
                    }
                    while (class155.field2533 < 20 && class155.field2542 > 0) {
                        class156 var7 = (class156) class155.field2540.method3310();
                        class110 var8 = new class110(4);
                        var8.method2117(0);
                        var8.method2276((int) var7.field2908);
                        Statics.field2544.method2597(var8.field1865, 0, 4);
                        var7.method3320();
                        class155.field2543.method3211(var7, var7.field2908);
                        class155.field2542--;
                        class155.field2533++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2544.method2595();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class155.field2534 = 0;
                        byte var11 = 0;
                        if (Statics.field65 == null) {
                            var11 = 8;
                        } else if (class155.field2536 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class155.field2546.field1861;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2544.method2596(class155.field2546.field1865, class155.field2546.field1861, var12);
                            if (class155.field2550 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class155.field2546.field1865[class155.field2546.field1861 + var13] ^= class155.field2550;
                                }
                            }
                            class155.field2546.field1861 += var12;
                            if (class155.field2546.field1861 < var11) {
                                break;
                            }
                            if (Statics.field65 == null) {
                                class155.field2546.field1861 = 0;
                                int var14 = class155.field2546.method2199();
                                int var15 = class155.field2546.method2282();
                                int var16 = class155.field2546.method2199();
                                int var17 = class155.field2546.method2136();
                                long var18 = (long) ((var14 << 16) + var15);
                                class156 var20 = (class156) class155.field2538.method3231(var18);
                                Statics.field1274 = true;
                                if (var20 == null) {
                                    var20 = (class156) class155.field2543.method3231(var18);
                                    Statics.field1274 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field65 = var20;
                                Statics.field2545 = new class110(var17 + var21 + Statics.field65.field2562);
                                Statics.field2545.method2117(var16);
                                Statics.field2545.method2120(var17);
                                class155.field2536 = 8;
                                class155.field2546.field1861 = 0;
                            } else if (class155.field2536 == 0) {
                                if (class155.field2546.field1865[0] == -1) {
                                    class155.field2536 = 1;
                                    class155.field2546.field1861 = 0;
                                } else {
                                    Statics.field65 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2545.field1865.length - Statics.field65.field2562;
                            int var23 = 512 - class155.field2536;
                            if (var23 > var22 - Statics.field2545.field1861) {
                                var23 = var22 - Statics.field2545.field1861;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2544.method2596(Statics.field2545.field1865, Statics.field2545.field1861, var23);
                            if (class155.field2550 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2545.field1865[Statics.field2545.field1861 + var24] ^= class155.field2550;
                                }
                            }
                            Statics.field2545.field1861 += var23;
                            class155.field2536 += var23;
                            if (Statics.field2545.field1861 == var22) {
                                if (Statics.field65.field2908 == 16711935L) {
                                    Statics.field1263 = Statics.field2545;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class152 var26 = class155.field2549[var25];
                                        if (var26 != null) {
                                            Statics.field1263.field1861 = var25 * 8 + 5;
                                            int var27 = Statics.field1263.method2136();
                                            int var28 = Statics.field1263.method2136();
                                            var26.method2818(var27, var28);
                                        }
                                    }
                                } else {
                                    class155.field2548.reset();
                                    class155.field2548.update(Statics.field2545.field1865, 0, var22);
                                    int var29 = (int) class155.field2548.getValue();
                                    if (Statics.field65.field2557 != var29) {
                                        try {
                                            Statics.field2544.method2593();
                                        } catch (Exception var35) {
                                        }
                                        class155.field2551++;
                                        Statics.field2544 = null;
                                        class155.field2550 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class155.field2551 = 0;
                                    class155.field2552 = 0;
                                    Statics.field65.field2558.method2817((int) (Statics.field65.field2908 & 0xFFFFL), Statics.field2545.field1865, (Statics.field65.field2908 & 0xFF0000L) == 16711680L, Statics.field1274);
                                }
                                Statics.field65.method3343();
                                if (Statics.field1274) {
                                    class155.field2539--;
                                } else {
                                    class155.field2533--;
                                }
                                class155.field2536 = 0;
                                Statics.field65 = null;
                                Statics.field2545 = null;
                            } else {
                                if (class155.field2536 != 512) {
                                    break;
                                }
                                class155.field2536 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2544.method2593();
                } catch (Exception var34) {
                }
                class155.field2552++;
                Statics.field2544 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method192();
        }
    }

    @ObfuscatedName("client.s(I)V")
    public void method192() {
        if (class155.field2551 >= 4) {
            this.method2626("js5crc");
            field384 = 1000;
            return;
        }
        if (class155.field2552 >= 4) {
            if (field384 <= 5) {
                this.method2626("js5io");
                field384 = 1000;
                return;
            }
            field281 = 3000;
            class155.field2552 = 3;
        }
        if (--field281 + 1 > 0) {
            return;
        }
        try {
            if (field286 == 0) {
                Statics.field1260 = Statics.field1300.method2502(Statics.field2111, Statics.field175);
                field286++;
            }
            if (field286 == 1) {
                if (Statics.field1260.field2101 == 2) {
                    this.method193(-1);
                    return;
                }
                if (Statics.field1260.field2101 == 1) {
                    field286++;
                }
            }
            if (field286 == 2) {
                Statics.field83 = new class134((Socket) Statics.field1260.field2097, Statics.field1300);
                class110 var1 = new class110(5);
                var1.method2117(15);
                var1.method2120(74);
                Statics.field83.method2597(var1.field1865, 0, 5);
                field286++;
                Statics.field1822 = class106.method2471();
            }
            if (field286 == 3) {
                if (field384 <= 5 || Statics.field83.method2595() > 0) {
                    int var2 = Statics.field83.method2594();
                    if (var2 != 0) {
                        this.method193(var2);
                        return;
                    }
                    field286++;
                } else if (class106.method2471() - Statics.field1822 > 30000L) {
                    this.method193(-2);
                    return;
                }
            }
            if (field286 == 4) {
                class134 var3 = Statics.field83;
                boolean var4 = field384 > 20;
                if (Statics.field2544 != null) {
                    try {
                        Statics.field2544.method2593();
                    } catch (Exception var14) {
                    }
                    Statics.field2544 = null;
                }
                Statics.field2544 = var3;
                class155.method1865(var4);
                class155.field2546.field1861 = 0;
                Statics.field65 = null;
                Statics.field2545 = null;
                class155.field2536 = 0;
                while (true) {
                    class156 var6 = (class156) class155.field2538.method3210();
                    if (var6 == null) {
                        while (true) {
                            class156 var7 = (class156) class155.field2543.method3210();
                            if (var7 == null) {
                                if (class155.field2550 != 0) {
                                    try {
                                        class110 var8 = new class110(4);
                                        var8.method2117(4);
                                        var8.method2117(class155.field2550);
                                        var8.method2188(0);
                                        Statics.field2544.method2597(var8.field1865, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2544.method2593();
                                        } catch (Exception var12) {
                                        }
                                        class155.field2552++;
                                        Statics.field2544 = null;
                                    }
                                }
                                class155.field2534 = 0;
                                Statics.field2535 = class106.method2471();
                                Statics.field1260 = null;
                                Statics.field83 = null;
                                field286 = 0;
                                field292 = 0;
                                return;
                            }
                            class155.field2540.method3309(var7);
                            class155.field2541.method3211(var7, var7.field2908);
                            class155.field2542++;
                            class155.field2533--;
                        }
                    }
                    class155.field2554.method3211(var6, var6.field2908);
                    class155.field2537++;
                    class155.field2539--;
                }
            }
        } catch (IOException var15) {
            this.method193(-3);
        }
    }

    @ObfuscatedName("client.k(II)V")
    public void method193(int arg0) {
        Statics.field1260 = null;
        Statics.field83 = null;
        field286 = 0;
        if (Statics.field1863 == Statics.field175) {
            Statics.field175 = Statics.field695;
        } else {
            Statics.field175 = Statics.field1863;
        }
        field292++;
        if (field292 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field384 <= 5) {
                this.method2626("js5connect_full");
                field384 = 1000;
            } else {
                field281 = 3000;
            }
        } else if (field292 >= 2 && arg0 == 6) {
            this.method2626("js5connect_outofdate");
            field384 = 1000;
        } else if (field292 >= 4) {
            if (field384 <= 5) {
                this.method2626("js5connect");
                field384 = 1000;
            } else {
                field281 = 3000;
            }
        }
    }

    @ObfuscatedName("bx.f(I)V")
    public static void method1373() {
        if (field391 == 0) {
            Statics.field2947 = new class80(4, 104, 104, class6.field94);
            for (int var0 = 0; var0 < 4; var0++) {
                field319[var0] = new class211(104, 104);
            }
            Statics.field1764 = new class73(512, 512);
            class29.field667 = class147.field2193;
            class29.field666 = 5;
            field391 = 20;
        } else if (field391 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1482[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class80.method1599(var1, 500, 800, 512, 334);
            class29.field667 = class147.field2336;
            class29.field666 = 10;
            field391 = 30;
        } else if (field391 == 30) {
            Statics.field288 = method1851(0, false, true, true);
            Statics.field1128 = method1851(1, false, true, true);
            Statics.field1276 = method1851(2, true, false, true);
            Statics.field289 = method1851(3, false, true, true);
            Statics.field606 = method1851(4, false, true, true);
            Statics.field529 = method1851(5, true, true, true);
            Statics.field250 = method1851(6, true, true, false);
            Statics.field148 = method1851(7, false, true, true);
            Statics.field2012 = method1851(8, false, true, true);
            Statics.field690 = method1851(9, false, true, true);
            Statics.field2072 = method1851(10, false, true, true);
            Statics.field290 = method1851(11, false, true, true);
            Statics.field291 = method1851(12, false, true, true);
            Statics.field95 = method1851(13, true, false, true);
            Statics.field1842 = method1851(14, false, true, false);
            Statics.field2783 = method1851(15, false, true, true);
            class29.field667 = class147.field2337;
            class29.field666 = 20;
            field391 = 40;
        } else if (field391 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field288.method2816() * 4 / 100;
            int var8 = var7 + Statics.field1128.method2816() * 4 / 100;
            int var9 = var8 + Statics.field1276.method2816() * 2 / 100;
            int var10 = var9 + Statics.field289.method2816() * 2 / 100;
            int var11 = var10 + Statics.field606.method2816() * 6 / 100;
            int var12 = var11 + Statics.field529.method2816() * 4 / 100;
            int var13 = var12 + Statics.field250.method2816() * 2 / 100;
            int var14 = var13 + Statics.field148.method2816() * 60 / 100;
            int var15 = var14 + Statics.field2012.method2816() * 2 / 100;
            int var16 = var15 + Statics.field690.method2816() * 2 / 100;
            int var17 = var16 + Statics.field2072.method2816() * 2 / 100;
            int var18 = var17 + Statics.field290.method2816() * 2 / 100;
            int var19 = var18 + Statics.field291.method2816() * 2 / 100;
            int var20 = var19 + Statics.field95.method2816() * 2 / 100;
            int var21 = var20 + Statics.field1842.method2816() * 2 / 100;
            int var22 = var21 + Statics.field2783.method2816() * 2 / 100;
            if (var22 == 100) {
                class29.field667 = class147.field2197;
                class29.field666 = 30;
                field391 = 45;
            } else {
                if (var22 != 0) {
                    class29.field667 = class147.field2196 + var22 + "%";
                }
                class29.field666 = 30;
            }
        } else if (field391 == 45) {
            class51.method3356(22050, !field262, 2);
            class167 var23 = new class167();
            var23.method3116(9, 128);
            Statics.field2018 = class51.method171(Statics.field1300, Statics.field2706, 0, 22050);
            Statics.field2018.method1004(var23);
            class152 var24 = Statics.field2783;
            class152 var25 = Statics.field1842;
            class152 var26 = Statics.field606;
            Statics.field2752 = var24;
            Statics.field2746 = var25;
            Statics.field2747 = var26;
            Statics.field3043 = var23;
            Statics.field708 = class51.method171(Statics.field1300, Statics.field2706, 1, 2048);
            Statics.field376 = new class50();
            Statics.field708.method1004(Statics.field376);
            Statics.field1519 = new class69(22050, Statics.field1084);
            class29.field667 = class147.field2383;
            class29.field666 = 35;
            field391 = 50;
        } else if (field391 == 50) {
            int var27 = 0;
            if (Statics.field871 == null) {
                Statics.field871 = class71.method170(Statics.field2012, Statics.field95, "p11_full", "");
            } else {
                var27++;
            }
            if (Statics.field11 == null) {
                Statics.field11 = class71.method170(Statics.field2012, Statics.field95, "p12_full", "");
            } else {
                var27++;
            }
            if (Statics.field652 == null) {
                Statics.field652 = class71.method170(Statics.field2012, Statics.field95, "b12_full", "");
            } else {
                var27++;
            }
            if (var27 < 3) {
                class29.field667 = class147.field2199 + var27 * 100 / 3 + "%";
                class29.field666 = 40;
            } else {
                Statics.field64 = new class150(true);
                class29.field667 = class147.field2200;
                class29.field666 = 40;
                field391 = 60;
            }
        } else if (field391 == 60) {
            class152 var28 = Statics.field2072;
            class152 var29 = Statics.field2012;
            int var30 = 0;
            if (var28.method2748("title.jpg", "")) {
                var30++;
            }
            if (var29.method2748("logo", "")) {
                var30++;
            }
            if (var29.method2748("titlebox", "")) {
                var30++;
            }
            if (var29.method2748("titlebutton", "")) {
                var30++;
            }
            if (var29.method2748("runes", "")) {
                var30++;
            }
            if (var29.method2748("title_mute", "")) {
                var30++;
            }
            if (var29.method2749("options_radio_buttons,0")) {
                var30++;
            }
            if (var29.method2749("options_radio_buttons,2")) {
                var30++;
            }
            var29.method2748("sl_back", "");
            var29.method2748("sl_flags", "");
            var29.method2748("sl_arrows", "");
            var29.method2748("sl_stars", "");
            var29.method2748("sl_button", "");
            byte var33 = 8;
            if (var30 < var33) {
                class29.field667 = class147.field2201 + var30 * 100 / var33 + "%";
                class29.field666 = 50;
            } else {
                class29.field667 = class147.field2345;
                class29.field666 = 50;
                method590(5);
                field391 = 70;
            }
        } else if (field391 == 70) {
            if (Statics.field1276.method2735()) {
                class152 var35 = Statics.field1276;
                Statics.field971 = var35;
                class38.method2673(Statics.field1276);
                class41.method559(Statics.field1276, Statics.field148);
                class37.method661(Statics.field1276, Statics.field148, field262);
                class36.method2397(Statics.field1276, Statics.field148);
                class46.method35(Statics.field1276, Statics.field148, field261, Statics.field871);
                class152 var36 = Statics.field1276;
                class152 var37 = Statics.field288;
                class152 var38 = Statics.field1128;
                Statics.field908 = var36;
                Statics.field913 = var37;
                Statics.field907 = var38;
                class40.method110(Statics.field1276, Statics.field148);
                class43.method2701(Statics.field1276);
                class152 var39 = Statics.field1276;
                Statics.field1074 = var39;
                Statics.field1064 = Statics.field1074.method2806(16);
                class157.method173(Statics.field289, Statics.field148, Statics.field2012, Statics.field95);
                class45.method2703(Statics.field1276);
                class152 var40 = Statics.field1276;
                Statics.field995 = var40;
                class29.field667 = class147.field2344;
                class29.field666 = 60;
                field391 = 80;
            } else {
                class29.field667 = class147.field2203 + Statics.field1276.method2823() + "%";
                class29.field666 = 60;
            }
        } else if (field391 == 80) {
            int var41 = 0;
            if (Statics.field121 == null) {
                Statics.field121 = class71.method89(Statics.field2012, "compass", "");
            } else {
                var41++;
            }
            if (Statics.field1973 == null) {
                Statics.field1973 = class71.method89(Statics.field2012, "mapedge", "");
            } else {
                var41++;
            }
            if (Statics.field1869 == null) {
                Statics.field1869 = class71.method2427(Statics.field2012, "mapscene", "");
            } else {
                var41++;
            }
            if (Statics.field1553 == null) {
                Statics.field1553 = class71.method2902(Statics.field2012, "mapfunction", "");
            } else {
                var41++;
            }
            if (Statics.field706 == null) {
                Statics.field706 = class71.method2902(Statics.field2012, "hitmarks", "");
            } else {
                var41++;
            }
            if (Statics.field2703 == null) {
                Statics.field2703 = class71.method2902(Statics.field2012, "headicons_pk", "");
            } else {
                var41++;
            }
            if (Statics.field227 == null) {
                Statics.field227 = class71.method2902(Statics.field2012, "headicons_prayer", "");
            } else {
                var41++;
            }
            if (Statics.field1655 == null) {
                Statics.field1655 = class71.method2902(Statics.field2012, "headicons_hint", "");
            } else {
                var41++;
            }
            if (Statics.field2016 == null) {
                Statics.field2016 = class71.method2902(Statics.field2012, "mapmarker", "");
            } else {
                var41++;
            }
            if (Statics.field961 == null) {
                Statics.field961 = class71.method2902(Statics.field2012, "cross", "");
            } else {
                var41++;
            }
            if (Statics.field2844 == null) {
                Statics.field2844 = class71.method2902(Statics.field2012, "mapdots", "");
            } else {
                var41++;
            }
            if (Statics.field1962 == null) {
                Statics.field1962 = class71.method2427(Statics.field2012, "scrollbar", "");
            } else {
                var41++;
            }
            if (Statics.field206 == null) {
                Statics.field206 = class71.method2427(Statics.field2012, "mod_icons", "");
            } else {
                var41++;
            }
            if (Statics.field578 == null) {
                Statics.field578 = class71.method132(Statics.field2012, "mapback", "");
            } else {
                var41++;
            }
            if (var41 < 14) {
                class29.field667 = class147.field2412 + var41 * 100 / 14 + "%";
                class29.field666 = 70;
            } else {
                Statics.field2986 = Statics.field206;
                Statics.field1973.method1421();
                int var42 = (int) (Math.random() * 21.0D) - 10;
                int var43 = (int) (Math.random() * 21.0D) - 10;
                int var44 = (int) (Math.random() * 21.0D) - 10;
                int var45 = (int) (Math.random() * 41.0D) - 20;
                for (int var46 = 0; var46 < Statics.field1553.length; var46++) {
                    Statics.field1553[var46].method1420(var42 + var45, var43 + var45, var44 + var45);
                }
                Statics.field1869[0].method1566(var42 + var45, var43 + var45, var44 + var45);
                method2059();
                class29.field667 = class147.field2206;
                class29.field666 = 70;
                field391 = 90;
            }
        } else if (field391 == 90) {
            if (Statics.field690.method2735()) {
                class89 var47 = new class89(Statics.field690, Statics.field2012, 20, 0.8D, field262 ? 64 : 128);
                class85.method1773(var47);
                class85.method1768(0.8D);
                class29.field667 = class147.field2208;
                class29.field666 = 90;
                field391 = 110;
            } else {
                class29.field667 = class147.field2207 + Statics.field690.method2823() + "%";
                class29.field666 = 90;
            }
        } else if (field391 == 110) {
            Statics.field392 = new class12();
            Statics.field1300.method2481(Statics.field392, 10);
            class29.field667 = class147.field2209;
            class29.field666 = 94;
            field391 = 120;
        } else if (field391 == 120) {
            if (Statics.field2072.method2748("huffman", "")) {
                class104 var48 = new class104(Statics.field2072.method2747("huffman", ""));
                Statics.field2975 = var48;
                class29.field667 = class147.field2211;
                class29.field666 = 96;
                field391 = 130;
            } else {
                class29.field667 = class147.field2380 + "%";
                class29.field666 = 96;
            }
        } else if (field391 == 130) {
            if (!Statics.field289.method2735()) {
                class29.field667 = class147.field2212 + Statics.field289.method2823() * 4 / 5 + "%";
                class29.field666 = 100;
            } else if (!Statics.field291.method2735()) {
                class29.field667 = class147.field2212 + (80 + Statics.field291.method2823() / 6) + "%";
                class29.field666 = 100;
            } else if (Statics.field95.method2735()) {
                class29.field667 = class147.field2213;
                class29.field666 = 100;
                field391 = 140;
            } else {
                class29.field667 = class147.field2212 + (96 + Statics.field95.method2823() / 20) + "%";
                class29.field666 = 100;
            }
        } else if (field391 == 140) {
            method590(10);
        }
    }

    @ObfuscatedName("cb.d(IZZZI)Lez;")
    public static class152 method1851(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class125 var4 = null;
        if (class140.field2119 != null) {
            var4 = new class125(arg0, class140.field2119, Statics.field1910[arg0], 1000000);
        }
        return new class152(var4, Statics.field1674, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cu.x(I)V")
    public static void method2059() {
        Statics.field27 = new int[33];
        Statics.field580 = new int[33];
        Statics.field1880 = new int[151];
        Statics.field1124 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field578.field1332[Statics.field578.field1328 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field27[var0] = var1;
            Statics.field580[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field578.field1332[Statics.field578.field1328 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field1880[var4 - 5] = var5 - 25;
            Statics.field1124[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("er.o(I)V")
    public static final void method2856() {
        try {
            if (field293 == 0) {
                if (Statics.field303 != null) {
                    Statics.field303.method2593();
                    Statics.field303 = null;
                }
                Statics.field2922 = null;
                field312 = false;
                field415 = 0;
                field293 = 1;
            }
            if (field293 == 1) {
                if (Statics.field2922 == null) {
                    Statics.field2922 = Statics.field1300.method2502(Statics.field2111, Statics.field175);
                }
                if (Statics.field2922.field2101 == 2) {
                    throw new IOException();
                }
                if (Statics.field2922.field2101 == 1) {
                    Statics.field303 = new class134((Socket) Statics.field2922.field2097, Statics.field1300);
                    Statics.field2922 = null;
                    field293 = 2;
                }
            }
            if (field293 == 2) {
                field301.field1861 = 0;
                field301.method2117(14);
                Statics.field303.method2597(field301.field1865, 0, 1);
                field488.field1861 = 0;
                field293 = 3;
            }
            if (field293 == 3) {
                if (Statics.field2018 != null) {
                    Statics.field2018.method1014();
                }
                if (Statics.field708 != null) {
                    Statics.field708.method1014();
                }
                int var0 = Statics.field303.method2594();
                if (Statics.field2018 != null) {
                    Statics.field2018.method1014();
                }
                if (Statics.field708 != null) {
                    Statics.field708.method1014();
                }
                if (var0 != 0) {
                    method168(var0);
                    return;
                }
                field488.field1861 = 0;
                field293 = 5;
            }
            if (field293 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field301.field1861 = 0;
                field301.method2117(1);
                field301.method2117(class29.field674.method487());
                field301.method2120(var1[0]);
                field301.method2120(var1[1]);
                field301.method2120(var1[2]);
                field301.method2120(var1[3]);
                switch(class29.field674.field2444) {
                    case 0:
                    case 1:
                        field301.method2276(Statics.field1659);
                        field301.field1861 += 5;
                        break;
                    case 2:
                        field301.field1861 += 8;
                        break;
                    case 3:
                        field301.method2120((Integer) Statics.field101.field144.get(class213.method534(class29.field671)));
                        field301.field1861 += 4;
                }
                field301.method2122(class29.field673);
                field301.method2149(class5.field66, class5.field70);
                field450.field1861 = 0;
                if (field384 == 40) {
                    field450.method2117(18);
                } else {
                    field450.method2117(16);
                }
                field450.method2188(0);
                int var2 = field450.field1861;
                field450.method2120(74);
                field450.method2133(field301.field1865, 0, field301.field1861);
                int var3 = field450.field1861;
                field450.method2122(class29.field671);
                field450.method2117(field262 ? 1 : 0);
                class113 var4 = field450;
                byte[] var5 = new byte[24];
                try {
                    class140.field2118.method3551(0L);
                    class140.field2118.method3552(var5);
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
                var4.method2133(var5, 0, 24);
                field450.method2122(Statics.field1453);
                field450.method2120(Statics.field1919);
                class110 var9 = new class110(Statics.field64.method2725());
                Statics.field64.method2718(var9);
                field450.method2133(var9.field1865, 0, var9.field1865.length);
                field450.method2117(Statics.field2556);
                field450.method2120(Statics.field288.field2500);
                field450.method2120(Statics.field1128.field2500);
                field450.method2120(Statics.field1276.field2500);
                field450.method2120(Statics.field289.field2500);
                field450.method2120(Statics.field606.field2500);
                field450.method2120(Statics.field529.field2500);
                field450.method2120(Statics.field250.field2500);
                field450.method2120(Statics.field148.field2500);
                field450.method2120(Statics.field2012.field2500);
                field450.method2120(Statics.field690.field2500);
                field450.method2120(Statics.field2072.field2500);
                field450.method2120(Statics.field290.field2500);
                field450.method2120(Statics.field291.field2500);
                field450.method2120(Statics.field95.field2500);
                field450.method2120(Statics.field1842.field2500);
                field450.method2120(Statics.field2783.field2500);
                field450.method2147(var1, var3, field450.field1861);
                field450.method2127(field450.field1861 - var2);
                Statics.field303.method2597(field450.field1865, 0, field450.field1861);
                field301.method2371(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field488.method2371(var1);
                field293 = 6;
            }
            if (field293 == 6 && Statics.field303.method2595() > 0) {
                int var11 = Statics.field303.method2594();
                if (var11 == 21 && field384 == 20) {
                    field293 = 7;
                } else if (var11 == 2) {
                    field293 = 9;
                } else if (var11 == 15 && field384 == 40) {
                    field301.field1861 = 0;
                    field488.field1861 = 0;
                    field305 = -1;
                    field309 = -1;
                    field310 = -1;
                    field311 = -1;
                    field484 = 0;
                    field306 = 0;
                    field258 = 0;
                    field402 = 0;
                    field401 = false;
                    field494 = 0;
                    field492 = 0;
                    for (int var12 = 0; var12 < field378.length; var12++) {
                        if (field378[var12] != null) {
                            field378[var12].field764 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field464.length; var13++) {
                        if (field464[var13] != null) {
                            field464[var13].field764 = -1;
                        }
                    }
                    class14.method3403();
                    method590(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field467[var14] = true;
                    }
                    return;
                } else if (var11 == 23 && field512 < 1) {
                    field512++;
                    field293 = 0;
                } else {
                    method168(var11);
                    return;
                }
            }
            if (field293 == 7 && Statics.field303.method2595() > 0) {
                field296 = (Statics.field303.method2594() + 3) * 60;
                field293 = 8;
            }
            if (field293 == 8) {
                field415 = 0;
                class29.method161(class147.field2217, class147.field2218, field296 / 60 + class147.field2249);
                if (--field296 <= 0) {
                    field293 = 0;
                }
            } else {
                if (field293 == 9 && Statics.field303.method2595() >= 13) {
                    boolean var15 = Statics.field303.method2594() == 1;
                    Statics.field303.method2596(field488.field1865, 0, 4);
                    field488.field1861 = 0;
                    boolean var16 = false;
                    if (var15) {
                        int var17 = field488.method2363() << 24;
                        int var18 = var17 | field488.method2363() << 16;
                        int var19 = var18 | field488.method2363() << 8;
                        int var20 = var19 | field488.method2363();
                        int var21 = class213.method534(class29.field671);
                        if (Statics.field101.field144.size() >= 10 && !Statics.field101.field144.containsKey(var21)) {
                            Iterator var22 = Statics.field101.field144.entrySet().iterator();
                            var22.next();
                            var22.remove();
                        }
                        Statics.field101.field144.put(var21, var20);
                        class9.method531();
                    }
                    field337 = Statics.field303.method2594();
                    field329 = Statics.field303.method2594() == 1;
                    field426 = Statics.field303.method2594();
                    field426 <<= 0x8;
                    field426 += Statics.field303.method2594();
                    field417 = Statics.field303.method2594();
                    Statics.field303.method2596(field488.field1865, 0, 1);
                    field488.field1861 = 0;
                    field305 = field488.method2363();
                    Statics.field303.method2596(field488.field1865, 0, 2);
                    field488.field1861 = 0;
                    field484 = field488.method2282();
                    if (field417 == 1) {
                        try {
                            class123.method2447(Statics.field254, "zap");
                        } catch (Throwable var27) {
                        }
                    } else {
                        try {
                            class123.method2447(Statics.field254, "unzap");
                        } catch (Throwable var26) {
                        }
                    }
                    field293 = 10;
                }
                if (field293 != 10) {
                    field415++;
                    if (field415 > 2000) {
                        if (field512 < 1) {
                            if (Statics.field1863 == Statics.field175) {
                                Statics.field175 = Statics.field695;
                            } else {
                                Statics.field175 = Statics.field1863;
                            }
                            field512++;
                            field293 = 0;
                        } else {
                            method168(-3);
                        }
                    }
                } else if (Statics.field303.method2595() >= field484) {
                    field488.field1861 = 0;
                    Statics.field303.method2596(field488.field1865, 0, field484);
                    method484();
                    Statics.field2023 = -1;
                    method664(false);
                    field305 = -1;
                }
            }
        } catch (IOException var29) {
            if (field512 < 1) {
                if (Statics.field1863 == Statics.field175) {
                    Statics.field175 = Statics.field695;
                } else {
                    Statics.field175 = Statics.field1863;
                }
                field512++;
                field293 = 0;
            } else {
                method168(-2);
            }
        }
    }

    @ObfuscatedName("client.q(B)V")
    public static void method484() {
        field267 = 1L;
        field271 = -1;
        Statics.field392.field180 = 0;
        Statics.field195 = true;
        field272 = true;
        field504 = -1L;
        class194.field2925 = new class185();
        field301.field1861 = 0;
        field488.field1861 = 0;
        field305 = -1;
        field309 = -1;
        field310 = -1;
        field311 = -1;
        field306 = 0;
        field258 = 0;
        field308 = 0;
        field470 = 0;
        field402 = 0;
        field401 = false;
        class131.field2025 = 0;
        class10.method592();
        field297 = 0;
        field497 = false;
        field397 = 0;
        field323 = (int) (Math.random() * 100.0D) - 50;
        field493 = (int) (Math.random() * 110.0D) - 55;
        field300 = (int) (Math.random() * 80.0D) - 40;
        field330 = (int) (Math.random() * 120.0D) - 60;
        field332 = (int) (Math.random() * 30.0D) - 20;
        field443 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field494 = 0;
        field400 = -1;
        field492 = 0;
        field325 = 0;
        field284 = class18.field532;
        field379 = 0;
        field298 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field378[var0] = null;
            field383[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field464[var1] = null;
        }
        Statics.field1358 = field378[2047] = new class3();
        field469 = -1;
        field395.method3284();
        field396.method3284();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field393[var2][var3][var4] = null;
                }
            }
        }
        field270 = new class182();
        field327 = 0;
        field513 = 0;
        field434 = 0;
        for (int var5 = 0; var5 < Statics.field1064; var5++) {
            class47 var6 = class47.method2357(var5);
            if (var6 != null) {
                class159.field2699[var5] = 0;
                class159.field2701[var5] = 0;
            }
        }
        for (int var7 = 0; var7 < field294.length; var7++) {
            field294[var7] = -1;
        }
        field429 = -1;
        if (field421 != -1) {
            int var8 = field421;
            if (var8 != -1 && Statics.field2564[var8]) {
                Statics.field2565.method2742(var8);
                if (Statics.field2599[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field2599[var8].length; var10++) {
                        if (Statics.field2599[var8][var10] != null) {
                            if (Statics.field2599[var8][var10].field2573 == 2) {
                                var9 = false;
                            } else {
                                Statics.field2599[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field2599[var8] = null;
                    }
                    Statics.field2564[var8] = false;
                }
            }
        }
        for (class4 var11 = (class4) field422.method3210(); var11 != null; var11 = (class4) field422.method3214()) {
            method2712(var11, true);
        }
        field421 = -1;
        field422 = new class179(8);
        field425 = null;
        field401 = false;
        field402 = 0;
        field519.method2953((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field389[var12] = null;
            field277[var12] = false;
        }
        class14.method3403();
        field265 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field467[var13] = true;
        }
        field485 = null;
        Statics.field1672 = 0;
        Statics.field225 = null;
        for (int var14 = 0; var14 < 6; var14++) {
            field522[var14] = new class203();
        }
        Statics.field1494 = null;
    }

    @ObfuscatedName("o.t(IS)V")
    public static void method168(int arg0) {
        if (arg0 == -3) {
            class29.method161(class147.field2220, class147.field2221, class147.field2222);
        } else if (arg0 == -2) {
            class29.method161(class147.field2223, class147.field2268, class147.field2225);
        } else if (arg0 == -1) {
            class29.method161(class147.field2226, class147.field2227, class147.field2228);
        } else if (arg0 == 3) {
            class29.method161(class147.field2304, class147.field2230, class147.field2334);
        } else if (arg0 == 4) {
            class29.method161(class147.field2232, class147.field2233, class147.field2234);
        } else if (arg0 == 5) {
            class29.method161(class147.field2276, class147.field2236, class147.field2237);
        } else if (arg0 == 6) {
            class29.method161(class147.field2238, class147.field2391, class147.field2240);
        } else if (arg0 == 7) {
            class29.method161(class147.field2241, class147.field2242, class147.field2243);
        } else if (arg0 == 8) {
            class29.method161(class147.field2244, class147.field2245, class147.field2246);
        } else if (arg0 == 9) {
            class29.method161(class147.field2224, class147.field2255, class147.field2331);
        } else if (arg0 == 10) {
            class29.method161(class147.field2407, class147.field2239, class147.field2389);
        } else if (arg0 == 11) {
            class29.method161(class147.field2358, class147.field2254, class147.field2330);
        } else if (arg0 == 12) {
            class29.method161(class147.field2296, class147.field2398, class147.field2258);
        } else if (arg0 == 13) {
            class29.method161(class147.field2259, class147.field2260, class147.field2333);
        } else if (arg0 == 14) {
            class29.method161(class147.field2252, class147.field2210, class147.field2264);
        } else if (arg0 == 16) {
            class29.method161(class147.field2265, class147.field2266, class147.field2267);
        } else if (arg0 == 17) {
            class29.method161(class147.field2286, class147.field2269, class147.field2270);
        } else if (arg0 == 18) {
            class29.method161(class147.field2361, class147.field2367, class147.field2273);
        } else if (arg0 == 19) {
            class29.method161(class147.field2274, class147.field2235, class147.field2250);
        } else if (arg0 == 20) {
            class29.method161(class147.field2275, class147.field2278, class147.field2279);
        } else if (arg0 == 22) {
            class29.method161(class147.field2280, class147.field2231, class147.field2282);
        } else if (arg0 == 23) {
            class29.method161(class147.field2283, class147.field2284, class147.field2343);
        } else if (arg0 == 24) {
            class29.method161(class147.field2397, class147.field2287, class147.field2288);
        } else if (arg0 == 25) {
            class29.method161(class147.field2400, class147.field2219, class147.field2291);
        } else if (arg0 == 26) {
            class29.method161(class147.field2292, class147.field2293, class147.field2339);
        } else if (arg0 == 27) {
            class29.method161(class147.field2295, class147.field2271, class147.field2297);
        } else if (arg0 == 31) {
            class29.method161(class147.field2294, class147.field2305, class147.field2306);
        } else if (arg0 == 32) {
            class29.method161(class147.field2307, class147.field2365, class147.field2251);
        } else if (arg0 == 37) {
            class29.method161(class147.field2328, class147.field2411, class147.field2312);
        } else if (arg0 == 38) {
            class29.method161(class147.field2313, class147.field2355, class147.field2315);
        } else if (arg0 == 55) {
            class29.method161(class147.field2359, class147.field2317, class147.field2318);
        } else if (arg0 == 56) {
            class29.method161(class147.field2256, class147.field2319, class147.field2321);
            method590(11);
            return;
        } else if (arg0 == 57) {
            class29.method161(class147.field2419, class147.field2195, class147.field2324);
            method590(11);
            return;
        } else {
            class29.method161(class147.field2325, class147.field2326, class147.field2348);
        }
        method590(10);
    }

    @ObfuscatedName("ep.h(B)V")
    public static final void method2588() {
        if (Statics.field303 != null) {
            Statics.field303.method2593();
            Statics.field303 = null;
        }
        method738();
        Statics.field2947.method1592();
        for (int var0 = 0; var0 < 4; var0++) {
            field319[var0].method3597();
        }
        System.gc();
        class166.field2748 = 1;
        Statics.field2749 = null;
        Statics.field3036 = -1;
        Statics.field1950 = -1;
        Statics.field210 = 0;
        Statics.field2751 = false;
        Statics.field2745 = 2;
        field496 = -1;
        field408 = false;
        class21.method2506();
        method590(10);
    }

    @ObfuscatedName("aa.u(I)V")
    public static final void method738() {
        class42.method608();
        class38.field894.method3184();
        class41.field944.method3184();
        class37.method2075();
        class36.method676();
        class46.field1016.method3184();
        class46.field1040.method3184();
        class46.field1018.method3184();
        class39.field921.method3184();
        class39.field923.method3184();
        class40.field928.method3184();
        class40.field930.method3184();
        class43.method2711();
        class47.method11();
        class162.field2716.method3184();
        class157.method1973();
        ((class89) Statics.field1479).method1857();
        class19.field536.method3184();
        Statics.field288.method2743();
        Statics.field1128.method2743();
        Statics.field289.method2743();
        Statics.field606.method2743();
        Statics.field529.method2743();
        Statics.field250.method2743();
        Statics.field148.method2743();
        Statics.field2012.method2743();
        Statics.field690.method2743();
        Statics.field2072.method2743();
        Statics.field290.method2743();
        Statics.field291.method2743();
    }

    @ObfuscatedName("ax.j(S)V")
    public static final void method632() {
        if (field308 > 0) {
            method2588();
        } else {
            method590(40);
            Statics.field1065 = Statics.field303;
            Statics.field303 = null;
        }
    }

    @ObfuscatedName("ah.g(I)V")
    public static final void method586() {
        if (field258 > 1) {
            field258--;
        }
        if (field308 > 0) {
            field308--;
        }
        if (field312) {
            field312 = false;
            method632();
            return;
        }
        if (!field401) {
            field407[0] = class147.field2374;
            field345[0] = "";
            field405[0] = 1006;
            field402 = 1;
        }
        for (int var0 = 0; var0 < 100 && Statics.method1854(); var0++) {
        }
        if (field384 != 30) {
            return;
        }
        while (true) {
            class193 var1 = (class193) class194.field2925.method3296();
            boolean var2;
            if (var1 == null) {
                var2 = false;
            } else {
                var2 = true;
            }
            if (!var2) {
                Object var4 = Statics.field392.field184;
                synchronized (Statics.field392.field184) {
                    if (!field255) {
                        Statics.field392.field180 = 0;
                    } else if (class131.field2036 != 0 || Statics.field392.field180 >= 40) {
                        field301.method2376(143);
                        field301.method2117(0);
                        int var5 = field301.field1861;
                        int var6 = 0;
                        for (int var7 = 0; var7 < Statics.field392.field180 && field301.field1861 - var5 < 240; var7++) {
                            var6++;
                            int var8 = Statics.field392.field183[var7];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 502) {
                                var8 = 502;
                            }
                            int var9 = Statics.field392.field182[var7];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 764) {
                                var9 = 764;
                            }
                            int var10 = var8 * 765 + var9;
                            if (Statics.field392.field183[var7] == -1 && Statics.field392.field182[var7] == -1) {
                                var9 = -1;
                                var8 = -1;
                                var10 = 524287;
                            }
                            if (field269 != var9 || field331 != var8) {
                                int var11 = var9 - field269;
                                field269 = var9;
                                int var12 = var8 - field331;
                                field331 = var8;
                                if (field271 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    field301.method2188((field271 << 12) + (var11 << 6) + var12);
                                    field271 = 0;
                                } else if (field271 < 8) {
                                    field301.method2276((field271 << 19) + 8388608 + var10);
                                    field271 = 0;
                                } else {
                                    field301.method2120((field271 << 19) + -1073741824 + var10);
                                    field271 = 0;
                                }
                            } else if (field271 < 2047) {
                                field271++;
                            }
                        }
                        field301.method2206(field301.field1861 - var5);
                        if (var6 >= Statics.field392.field180) {
                            Statics.field392.field180 = 0;
                        } else {
                            Statics.field392.field180 -= var6;
                            for (int var13 = 0; var13 < Statics.field392.field180; var13++) {
                                Statics.field392.field182[var13] = Statics.field392.field182[var6 + var13];
                                Statics.field392.field183[var13] = Statics.field392.field183[var6 + var13];
                            }
                        }
                    }
                }
                if (class131.field2036 == 1 || !Statics.field1816 && class131.field2036 == 4 || class131.field2036 == 2) {
                    long var15 = (class131.field2039 - field267 * -1L) / 50L;
                    if (var15 > 4095L) {
                        var15 = 4095L;
                    }
                    field267 = class131.field2039 * -1L;
                    int var17 = class131.field2026;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > 502) {
                        var17 = 502;
                    }
                    int var18 = class131.field2024;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > 764) {
                        var18 = 764;
                    }
                    int var19 = var17 * 765 + var18;
                    byte var20 = 0;
                    if (class131.field2036 == 2) {
                        var20 = 1;
                    }
                    int var21 = (int) var15;
                    field301.method2376(194);
                    field301.method2120((var20 << 19) + (var21 << 20) + var19);
                }
                if (class128.field1998 > 0) {
                    field301.method2376(209);
                    field301.method2188(0);
                    int var22 = field301.field1861;
                    long var23 = class106.method2471();
                    for (int var25 = 0; var25 < class128.field1998; var25++) {
                        long var26 = var23 - field504;
                        if (var26 > 16777215L) {
                            var26 = 16777215L;
                        }
                        field504 = var23;
                        field301.method2117(class128.field1981[var25]);
                        field301.method2167((int) var26);
                    }
                    field301.method2127(field301.field1861 - var22);
                }
                if (field348 > 0) {
                    field348--;
                }
                if (class128.field1991[96] || class128.field1991[97] || class128.field1991[98] || class128.field1991[99]) {
                    field304 = true;
                }
                if (field304 && field348 <= 0) {
                    field348 = 20;
                    field304 = false;
                    field301.method2376(4);
                    field301.method2218(field443);
                    field301.method2188(field335);
                }
                if (Statics.field195 && !field272) {
                    field272 = true;
                    field301.method2376(1);
                    field301.method2117(1);
                }
                if (!Statics.field195 && field272) {
                    field272 = false;
                    field301.method2376(1);
                    field301.method2117(0);
                }
                Statics.method833();
                if (field384 != 30) {
                    return;
                }
                method23();
                method3417();
                field306++;
                if (field306 > 750) {
                    method632();
                    return;
                }
                for (int var28 = -1; var28 < field379; var28++) {
                    int var29;
                    if (var28 == -1) {
                        var29 = 2047;
                    } else {
                        var29 = field380[var28];
                    }
                    class3 var30 = field378[var29];
                    if (var30 != null) {
                        method485(var30, 1);
                    }
                }
                method2589();
                method10();
                field431++;
                if (field368 != 0) {
                    field367 += 20;
                    if (field367 >= 400) {
                        field368 = 0;
                    }
                }
                if (Statics.field582 != null) {
                    field369++;
                    if (field369 >= 15) {
                        method1372(Statics.field582);
                        Statics.field582 = null;
                    }
                }
                class157 var31 = Statics.field411;
                class157 var32 = Statics.field892;
                Statics.field411 = null;
                Statics.field892 = null;
                field516 = null;
                field441 = false;
                field282 = false;
                field481 = 0;
                while (Statics.method2444() && field481 < 128) {
                    if (field337 >= 2 && class128.field1991[82] && Statics.field626 == 66) {
                        String var33 = "";
                        Iterator var34 = class10.field152.iterator();
                        while (var34.hasNext()) {
                            class32 var35 = (class32) var34.next();
                            var33 = var33 + var35.field712 + ':' + var35.field714 + '\n';
                        }
                        Statics.field924.setContents(new StringSelection(var33), (ClipboardOwner) null);
                    } else {
                        field413[field481] = Statics.field626;
                        field482[field481] = Statics.field579;
                        field481++;
                    }
                }
                method7(field421, 0, 0, 765, 503, 0, 0);
                field414++;
                while (true) {
                    class1 var38;
                    class157 var39;
                    class157 var40;
                    do {
                        var38 = (class1) field462.method3249();
                        if (var38 == null) {
                            while (true) {
                                class1 var41;
                                class157 var42;
                                class157 var43;
                                do {
                                    var41 = (class1) field463.method3249();
                                    if (var41 == null) {
                                        while (true) {
                                            class1 var44;
                                            class157 var45;
                                            class157 var46;
                                            do {
                                                var44 = (class1) field461.method3249();
                                                if (var44 == null) {
                                                    method591();
                                                    if (field433 != null) {
                                                        method1847();
                                                    }
                                                    if (Statics.field185 != null) {
                                                        method1372(Statics.field185);
                                                        field343++;
                                                        if (class131.field2029 == 0) {
                                                            if (field287) {
                                                                if (Statics.field185 == Statics.field1354 && field374 != field371) {
                                                                    class157 var47 = Statics.field185;
                                                                    byte var48 = 0;
                                                                    if (field424 == 1 && var47.field2575 == 206) {
                                                                        var48 = 1;
                                                                    }
                                                                    if (var47.field2676[field374] <= 0) {
                                                                        var48 = 0;
                                                                    }
                                                                    if (class161.method1411(method34(var47))) {
                                                                        int var49 = field371;
                                                                        int var50 = field374;
                                                                        var47.field2676[var50] = var47.field2676[var49];
                                                                        var47.field2612[var50] = var47.field2612[var49];
                                                                        var47.field2676[var49] = -1;
                                                                        var47.field2612[var49] = 0;
                                                                    } else if (var48 == 1) {
                                                                        int var51 = field371;
                                                                        int var52 = field374;
                                                                        while (var51 != var52) {
                                                                            if (var51 > var52) {
                                                                                var47.method2862(var51 - 1, var51);
                                                                                var51--;
                                                                            } else if (var51 < var52) {
                                                                                var47.method2862(var51 + 1, var51);
                                                                                var51++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var47.method2862(field374, field371);
                                                                    }
                                                                    field301.method2376(226);
                                                                    field301.method2170(Statics.field185.field2649);
                                                                    field301.method2153(var48);
                                                                    field301.method2287(field374);
                                                                    field301.method2287(field371);
                                                                }
                                                            } else if ((field520 == 1 || method135(field402 - 1)) && field402 > 2) {
                                                                method2398(field342, field275);
                                                            } else if (field402 > 0) {
                                                                int var53 = field342;
                                                                int var54 = field275;
                                                                method519(Statics.field114, var53, var54);
                                                                Statics.field114 = null;
                                                            }
                                                            field369 = 10;
                                                            class131.field2036 = 0;
                                                            Statics.field185 = null;
                                                        } else if (field343 >= 5 && (class131.field2030 > field342 + 5 || class131.field2030 < field342 - 5 || class131.field2031 * -778357537 > field275 + 5 || class131.field2031 * -778357537 < field275 - 5)) {
                                                            field287 = true;
                                                        }
                                                    }
                                                    if (class80.field1395 != -1) {
                                                        int var55 = class80.field1395;
                                                        int var56 = class80.field1396;
                                                        field301.method2376(0);
                                                        field301.method2117(5);
                                                        field301.method2161(Statics.field1820 + var56);
                                                        field301.method2154(class128.field1991[82] ? (class128.field1991[81] ? 2 : 1) : 0);
                                                        field301.method2218(Statics.field1935 + var55);
                                                        class80.field1395 = -1;
                                                        field365 = class131.field2024;
                                                        field517 = class131.field2026;
                                                        field368 = 1;
                                                        field367 = 0;
                                                        field492 = var55;
                                                        field325 = var56;
                                                    }
                                                    if (Statics.field411 != var31) {
                                                        if (var31 != null) {
                                                            method1372(var31);
                                                        }
                                                        if (Statics.field411 != null) {
                                                            method1372(Statics.field411);
                                                        }
                                                    }
                                                    if (Statics.field892 != var32 && field507 == field412) {
                                                        if (var32 != null) {
                                                            method1372(var32);
                                                        }
                                                        if (Statics.field892 != null) {
                                                            method1372(Statics.field892);
                                                        }
                                                    }
                                                    if (Statics.field892 == null) {
                                                        if (field412 > 0) {
                                                            field412--;
                                                        }
                                                    } else if (field412 < field507) {
                                                        field412++;
                                                        if (field507 == field412) {
                                                            method1372(Statics.field892);
                                                        }
                                                    }
                                                    int var57 = field323 + Statics.field1358.field793;
                                                    int var58 = field493 + Statics.field1358.field736;
                                                    if (Statics.field230 - var57 < -500 || Statics.field230 - var57 > 500 || Statics.field162 - var58 < -500 || Statics.field162 - var58 > 500) {
                                                        Statics.field230 = var57;
                                                        Statics.field162 = var58;
                                                    }
                                                    if (Statics.field230 != var57) {
                                                        Statics.field230 += (var57 - Statics.field230) / 16;
                                                    }
                                                    if (Statics.field162 != var58) {
                                                        Statics.field162 += (var58 - Statics.field162) / 16;
                                                    }
                                                    if (class131.field2029 == 4 && Statics.field1816) {
                                                        int var59 = class131.field2031 * -778357537 - field324 * -778357537;
                                                        field456 = var59 * 2;
                                                        field324 = (var59 == -1 || var59 == 1 ? class131.field2031 * -778357537 : (field324 * -778357537 + class131.field2031 * -778357537) / 2) * -1441954017;
                                                        int var60 = field260 - class131.field2030;
                                                        field344 = var60 * 2;
                                                        field260 = var60 == -1 || var60 == 1 ? class131.field2030 : (field260 + class131.field2030) / 2;
                                                    } else {
                                                        if (class128.field1991[96]) {
                                                            field344 += (-24 - field344) / 2;
                                                        } else if (class128.field1991[97]) {
                                                            field344 += (24 - field344) / 2;
                                                        } else {
                                                            field344 /= 2;
                                                        }
                                                        if (class128.field1991[98]) {
                                                            field456 += (12 - field456) / 2;
                                                        } else if (class128.field1991[99]) {
                                                            field456 += (-12 - field456) / 2;
                                                        } else {
                                                            field456 /= 2;
                                                        }
                                                        field324 = class131.field2031;
                                                        field260 = class131.field2030;
                                                    }
                                                    field443 = field344 / 2 + field443 & 0x7FF;
                                                    field335 += field456 / 2;
                                                    if (field335 < 128) {
                                                        field335 = 128;
                                                    }
                                                    if (field335 > 383) {
                                                        field335 = 383;
                                                    }
                                                    int var61 = Statics.field230 >> 7;
                                                    int var62 = Statics.field162 >> 7;
                                                    int var63 = method1875(Statics.field230, Statics.field162, Statics.field572);
                                                    int var64 = 0;
                                                    if (var61 > 3 && var62 > 3 && var61 < 100 && var62 < 100) {
                                                        for (int var65 = var61 - 4; var65 <= var61 + 4; var65++) {
                                                            for (int var66 = var62 - 4; var66 <= var62 + 4; var66++) {
                                                                int var67 = Statics.field572;
                                                                if (var67 < 3 && (class6.field76[1][var65][var66] & 0x2) == 2) {
                                                                    var67++;
                                                                }
                                                                int var68 = var63 - class6.field94[var67][var65][var66];
                                                                if (var68 > var64) {
                                                                    var64 = var68;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var69 = var64 * 192;
                                                    if (var69 > 98048) {
                                                        var69 = 98048;
                                                    }
                                                    if (var69 < 32768) {
                                                        var69 = 32768;
                                                    }
                                                    if (var69 > field390) {
                                                        field390 += (var69 - field390) / 24;
                                                    } else if (var69 < field390) {
                                                        field390 += (var69 - field390) / 80;
                                                    }
                                                    if (field500) {
                                                        method3644();
                                                    }
                                                    for (int var70 = 0; var70 < 5; var70++) {
                                                        int var10002 = field445[var70]++;
                                                    }
                                                    int var71 = class131.method2058();
                                                    int var72 = class128.method496();
                                                    if (var71 > 15000 && var72 > 15000) {
                                                        field308 = 250;
                                                        class131.field2025 = 14500;
                                                        field301.method2376(108);
                                                    }
                                                    field475++;
                                                    if (field475 > 500) {
                                                        field475 = 0;
                                                        int var73 = (int) (Math.random() * 8.0D);
                                                        if ((var73 & 0x1) == 1) {
                                                            field323 += field381;
                                                        }
                                                        if ((var73 & 0x2) == 2) {
                                                            field493 += field321;
                                                        }
                                                        if ((var73 & 0x4) == 4) {
                                                            field300 += field328;
                                                        }
                                                    }
                                                    if (field323 < -50) {
                                                        field381 = 2;
                                                    }
                                                    if (field323 > 50) {
                                                        field381 = -2;
                                                    }
                                                    if (field493 < -55) {
                                                        field321 = 2;
                                                    }
                                                    if (field493 > 55) {
                                                        field321 = -2;
                                                    }
                                                    if (field300 < -40) {
                                                        field328 = 1;
                                                    }
                                                    if (field300 > 40) {
                                                        field328 = -1;
                                                    }
                                                    field334++;
                                                    if (field334 > 500) {
                                                        field334 = 0;
                                                        int var74 = (int) (Math.random() * 8.0D);
                                                        if ((var74 & 0x1) == 1) {
                                                            field330 += field446;
                                                        }
                                                        if ((var74 & 0x2) == 2) {
                                                            field332 += field347;
                                                        }
                                                    }
                                                    if (field330 < -60) {
                                                        field446 = 2;
                                                    }
                                                    if (field330 > 60) {
                                                        field446 = -2;
                                                    }
                                                    if (field332 < -20) {
                                                        field347 = 1;
                                                    }
                                                    if (field332 > 10) {
                                                        field347 = -1;
                                                    }
                                                    for (class35 var75 = (class35) field364.method3200(); var75 != null; var75 = (class35) field364.method3203()) {
                                                        if ((long) var75.field803 < class106.method2471() / 1000L - 5L) {
                                                            if (var75.field799 > 0) {
                                                                class10.method2599(5, "", var75.field797 + class147.field2308);
                                                            }
                                                            if (var75.field799 == 0) {
                                                                class10.method2599(5, "", var75.field797 + class147.field2329);
                                                            }
                                                            var75.method3340();
                                                        }
                                                    }
                                                    field307++;
                                                    if (field307 > 50) {
                                                        field301.method2376(170);
                                                    }
                                                    try {
                                                        if (Statics.field303 != null && field301.field1861 > 0) {
                                                            Statics.field303.method2597(field301.field1865, 0, field301.field1861);
                                                            field301.field1861 = 0;
                                                            field307 = 0;
                                                        }
                                                    } catch (IOException var77) {
                                                        method632();
                                                    }
                                                    return;
                                                }
                                                var45 = var44.field10;
                                                if (var45.field2665 < 0) {
                                                    break;
                                                }
                                                var46 = class157.method1871(var45.field2587);
                                            } while (var46 == null || var46.field2682 == null || var45.field2665 >= var46.field2682.length || var46.field2682[var45.field2665] != var45);
                                            class33.method182(var44);
                                        }
                                    }
                                    var42 = var41.field10;
                                    if (var42.field2665 < 0) {
                                        break;
                                    }
                                    var43 = class157.method1871(var42.field2587);
                                } while (var43 == null || var43.field2682 == null || var42.field2665 >= var43.field2682.length || var43.field2682[var42.field2665] != var42);
                                class33.method182(var41);
                            }
                        }
                        var39 = var38.field10;
                        if (var39.field2665 < 0) {
                            break;
                        }
                        var40 = class157.method1871(var39.field2587);
                    } while (var40 == null || var40.field2682 == null || var39.field2665 >= var40.field2682.length || var40.field2682[var39.field2665] != var39);
                    class33.method182(var38);
                }
            }
            field301.method2376(185);
            field301.method2117(0);
            int var3 = field301.field1861;
            class194.method2700(field301);
            field301.method2206(field301.field1861 - var3);
        }
    }

    @ObfuscatedName("r.y(I)V")
    public static final void method537() {
        if (Statics.field708 != null) {
            Statics.field708.method1005();
        }
        if (Statics.field2018 != null) {
            Statics.field2018.method1005();
        }
    }

    @ObfuscatedName("gz.p(I)V")
    public static final void method3417() {
        for (int var0 = 0; var0 < field397; var0++) {
            int var10002 = field268[var0]--;
            if (field268[var0] >= -10) {
                class53 var2 = field506[var0];
                if (var2 == null) {
                    class53 var10000 = (class53) null;
                    var2 = class53.method1054(Statics.field606, field285[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field268[var0] += var2.method1053();
                    field506[var0] = var2;
                }
                if (field268[var0] < 0) {
                    int var9;
                    if (field505[var0] == 0) {
                        var9 = field498;
                    } else {
                        int var3 = (field505[var0] & 0xFF) * 128;
                        int var4 = field505[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1358.field793;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field505[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1358.field736;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field268[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field499 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class57 var10 = var2.method1055().method1086(Statics.field1519);
                        class59 var11 = class59.method1109(var10, 100, var9);
                        var11.method1112(field503[var0] - 1);
                        Statics.field376.method968(var11);
                    }
                    field268[var0] = -100;
                }
            } else {
                field397--;
                for (int var1 = var0; var1 < field397; var1++) {
                    field285[var1] = field285[var1 + 1];
                    field506[var1] = field506[var1 + 1];
                    field503[var1] = field503[var1 + 1];
                    field268[var1] = field268[var1 + 1];
                    field505[var1] = field505[var1 + 1];
                }
                var0--;
            }
        }
        if (field408 && !class166.method141()) {
            if (field495 != 0 && field496 != -1) {
                class166.method130(Statics.field250, field496, 0, field495, false);
            }
            field408 = false;
        }
    }

    @ObfuscatedName("ax.r(Laa;IIIB)V")
    public static void method660(class39 arg0, int arg1, int arg2, int arg3) {
        if (field397 >= 50 || field499 == 0 || arg0.field925 == null || arg1 >= arg0.field925.length) {
            return;
        }
        int var4 = arg0.field925[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field285[field397] = var5;
        field503[field397] = var6;
        field268[field397] = 0;
        field506[field397] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field505[field397] = (var8 << 16) + (var9 << 8) + var7;
        field397++;
    }

    @ObfuscatedName("av.z(IS)V")
    public static void method599(int arg0) {
        if (arg0 == -1 && !field408) {
            class166.method3();
        } else if (arg0 != -1 && field496 != arg0 && field495 != 0 && !field408) {
            class166.method1867(2, Statics.field250, arg0, 0, field495, false);
        }
        field496 = arg0;
    }

    @ObfuscatedName("v.an(I)V")
    public static final void method10() {
        for (int var0 = -1; var0 < field379; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field380[var0];
            }
            class3 var2 = field378[var1];
            if (var2 != null && var2.field751 > 0) {
                var2.field751--;
                if (var2.field751 == 0) {
                    var2.field748 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field298; var3++) {
            int var4 = field299[var3];
            class31 var5 = field464[var4];
            if (var5 != null && var5.field751 > 0) {
                var5.field751--;
                if (var5.field751 == 0) {
                    var5.field748 = null;
                }
            }
        }
    }

    @ObfuscatedName("v.as(Ljava/lang/String;I)V")
    public static final void method6(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field101.field142 = !Statics.field101.field142;
            class9.method531();
            if (Statics.field101.field142) {
                class10.method2599(99, "", "Roofs are now all hidden");
            } else {
                class10.method2599(99, "", "Roofs will only be removed selectively");
            }
        }
        if (field337 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field273 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field273 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field308 > 0) {
                    method2588();
                } else {
                    method590(40);
                    Statics.field1065 = Statics.field303;
                    Statics.field303 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field315 == 2) {
                throw new RuntimeException();
            }
        }
        field301.method2376(107);
        field301.method2117(arg0.length() + 1);
        field301.method2122(arg0);
    }

    @ObfuscatedName("hk.ah(I)V")
    public static final void method3644() {
        int var0 = Statics.field202 * 128 + 64;
        int var1 = Statics.field2429 * 128 + 64;
        int var2 = method1875(var0, var1, Statics.field572) - Statics.field709;
        if (Statics.field635 < var0) {
            Statics.field635 += Statics.field1290 * (var0 - Statics.field635) / 1000 + Statics.field2058;
            if (Statics.field635 > var0) {
                Statics.field635 = var0;
            }
        }
        if (Statics.field635 > var0) {
            Statics.field635 -= Statics.field1290 * (Statics.field635 - var0) / 1000 + Statics.field2058;
            if (Statics.field635 < var0) {
                Statics.field635 = var0;
            }
        }
        if (Statics.field145 < var2) {
            Statics.field145 += Statics.field1290 * (var2 - Statics.field145) / 1000 + Statics.field2058;
            if (Statics.field145 > var2) {
                Statics.field145 = var2;
            }
        }
        if (Statics.field145 > var2) {
            Statics.field145 -= Statics.field1290 * (Statics.field145 - var2) / 1000 + Statics.field2058;
            if (Statics.field145 < var2) {
                Statics.field145 = var2;
            }
        }
        if (Statics.field2561 < var1) {
            Statics.field2561 += Statics.field1290 * (var1 - Statics.field2561) / 1000 + Statics.field2058;
            if (Statics.field2561 > var1) {
                Statics.field2561 = var1;
            }
        }
        if (Statics.field2561 > var1) {
            Statics.field2561 -= Statics.field1290 * (Statics.field2561 - var1) / 1000 + Statics.field2058;
            if (Statics.field2561 < var1) {
                Statics.field2561 = var1;
            }
        }
        int var3 = Statics.field2485 * 128 + 64;
        int var4 = Statics.field2913 * 128 + 64;
        int var5 = method1875(var3, var4, Statics.field572) - Statics.field2007;
        int var6 = var3 - Statics.field635;
        int var7 = var5 - Statics.field145;
        int var8 = var4 - Statics.field2561;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field968 < var10) {
            Statics.field968 += Statics.field146 * (var10 - Statics.field968) / 1000 + Statics.field620;
            if (Statics.field968 > var10) {
                Statics.field968 = var10;
            }
        }
        if (Statics.field968 > var10) {
            Statics.field968 -= Statics.field146 * (Statics.field968 - var10) / 1000 + Statics.field620;
            if (Statics.field968 < var10) {
                Statics.field968 = var10;
            }
        }
        int var12 = var11 - Statics.field1909;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1909 += Statics.field146 * var12 / 1000 + Statics.field620;
            Statics.field1909 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1909 -= Statics.field146 * -var12 / 1000 + Statics.field620;
            Statics.field1909 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1909;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1909 = var11;
        }
    }

    @ObfuscatedName("ep.ar(I)V")
    public static final void method2589() {
        for (int var0 = 0; var0 < field298; var0++) {
            int var1 = field299[var0];
            class31 var2 = field464[var1];
            if (var2 != null) {
                method485(var2, var2.field707.field820);
            }
        }
    }

    @ObfuscatedName("client.ae(Laq;IB)V")
    public static final void method485(class34 arg0, int arg1) {
        if (arg0.field735 > field266) {
            int var2 = arg0.field735 - field266;
            int var3 = arg0.field756 * 128 + arg0.field739 * 64;
            int var4 = arg0.field778 * 128 + arg0.field739 * 64;
            arg0.field793 += (var3 - arg0.field793) / var2;
            arg0.field736 += (var4 - arg0.field736) / var2;
            arg0.field792 = 0;
            if (arg0.field782 == 0) {
                arg0.field785 = 1024;
            }
            if (arg0.field782 == 1) {
                arg0.field785 = 1536;
            }
            if (arg0.field782 == 2) {
                arg0.field785 = 0;
            }
            if (arg0.field782 == 3) {
                arg0.field785 = 512;
            }
        } else if (arg0.field781 >= field266) {
            method2904(arg0);
        } else {
            arg0.field763 = arg0.field740;
            if (arg0.field788 == 0) {
                arg0.field792 = 0;
            } else {
                label440: {
                    if (arg0.field766 != -1 && arg0.field769 == 0) {
                        class39 var5 = Statics.method97(arg0.field766);
                        if (arg0.field749 > 0 && var5.field906 == 0) {
                            arg0.field792++;
                            break label440;
                        }
                        if (arg0.field749 <= 0 && var5.field922 == 0) {
                            arg0.field792++;
                            break label440;
                        }
                    }
                    int var6 = arg0.field793;
                    int var7 = arg0.field736;
                    int var8 = arg0.field795[arg0.field788 - 1] * 128 + arg0.field739 * 64;
                    int var9 = arg0.field743[arg0.field788 - 1] * 128 + arg0.field739 * 64;
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        if (var6 < var8) {
                            if (var7 < var9) {
                                arg0.field785 = 1280;
                            } else if (var7 > var9) {
                                arg0.field785 = 1792;
                            } else {
                                arg0.field785 = 1536;
                            }
                        } else if (var6 > var8) {
                            if (var7 < var9) {
                                arg0.field785 = 768;
                            } else if (var7 > var9) {
                                arg0.field785 = 256;
                            } else {
                                arg0.field785 = 512;
                            }
                        } else if (var7 < var9) {
                            arg0.field785 = 1024;
                        } else if (var7 > var9) {
                            arg0.field785 = 0;
                        }
                        int var10 = arg0.field785 - arg0.field777 & 0x7FF;
                        if (var10 > 1024) {
                            var10 -= 2048;
                        }
                        int var11 = arg0.field744;
                        if (var10 >= -256 && var10 <= 256) {
                            var11 = arg0.field753;
                        } else if (var10 >= 256 && var10 < 768) {
                            var11 = arg0.field789;
                        } else if (var10 >= -768 && var10 <= -256) {
                            var11 = arg0.field745;
                        }
                        if (var11 == -1) {
                            var11 = arg0.field753;
                        }
                        arg0.field763 = var11;
                        int var12 = 4;
                        boolean var13 = true;
                        if (arg0 instanceof class31) {
                            var13 = ((class31) arg0).field707.field837;
                        }
                        if (var13) {
                            if (arg0.field785 != arg0.field777 && arg0.field764 == -1 && arg0.field787 != 0) {
                                var12 = 2;
                            }
                            if (arg0.field788 > 2) {
                                var12 = 6;
                            }
                            if (arg0.field788 > 3) {
                                var12 = 8;
                            }
                            if (arg0.field792 > 0 && arg0.field788 > 1) {
                                var12 = 8;
                                arg0.field792--;
                            }
                        } else {
                            if (arg0.field788 > 1) {
                                var12 = 6;
                            }
                            if (arg0.field788 > 2) {
                                var12 = 8;
                            }
                            if (arg0.field792 > 0 && arg0.field788 > 1) {
                                var12 = 8;
                                arg0.field792--;
                            }
                        }
                        if (arg0.field790[arg0.field788 - 1]) {
                            var12 <<= 0x1;
                        }
                        if (var12 >= 8 && arg0.field763 == arg0.field753 && arg0.field747 != -1) {
                            arg0.field763 = arg0.field747;
                        }
                        if (var6 < var8) {
                            arg0.field793 += var12;
                            if (arg0.field793 > var8) {
                                arg0.field793 = var8;
                            }
                        } else if (var6 > var8) {
                            arg0.field793 -= var12;
                            if (arg0.field793 < var8) {
                                arg0.field793 = var8;
                            }
                        }
                        if (var7 < var9) {
                            arg0.field736 += var12;
                            if (arg0.field736 > var9) {
                                arg0.field736 = var9;
                            }
                        } else if (var7 > var9) {
                            arg0.field736 -= var12;
                            if (arg0.field736 < var9) {
                                arg0.field736 = var9;
                            }
                        }
                        if (arg0.field793 == var8 && arg0.field736 == var9) {
                            arg0.field788--;
                            if (arg0.field749 > 0) {
                                arg0.field749--;
                            }
                        }
                    } else {
                        arg0.field793 = var8;
                        arg0.field736 = var9;
                    }
                }
            }
        }
        if (arg0.field793 < 128 || arg0.field736 < 128 || arg0.field793 >= 13184 || arg0.field736 >= 13184) {
            arg0.field766 = -1;
            arg0.field794 = -1;
            arg0.field735 = 0;
            arg0.field781 = 0;
            arg0.field793 = arg0.field795[0] * 128 + arg0.field739 * 64;
            arg0.field736 = arg0.field743[0] * 128 + arg0.field739 * 64;
            arg0.method614();
        }
        if (Statics.field1358 == arg0 && (arg0.field793 < 1536 || arg0.field736 < 1536 || arg0.field793 >= 11776 || arg0.field736 >= 11776)) {
            arg0.field766 = -1;
            arg0.field794 = -1;
            arg0.field735 = 0;
            arg0.field781 = 0;
            arg0.field793 = arg0.field795[0] * 128 + arg0.field739 * 64;
            arg0.field736 = arg0.field743[0] * 128 + arg0.field739 * 64;
            arg0.method614();
        }
        if (arg0.field787 != 0) {
            if (arg0.field764 != -1 && arg0.field764 < 32768) {
                class31 var14 = field464[arg0.field764];
                if (var14 != null) {
                    int var15 = arg0.field793 - var14.field793;
                    int var16 = arg0.field736 - var14.field736;
                    if (var15 != 0 || var16 != 0) {
                        arg0.field785 = (int) (Math.atan2((double) var15, (double) var16) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field764 >= 32768) {
                int var17 = arg0.field764 - 32768;
                if (field426 == var17) {
                    var17 = 2047;
                }
                class3 var18 = field378[var17];
                if (var18 != null) {
                    int var19 = arg0.field793 - var18.field793;
                    int var20 = arg0.field736 - var18.field736;
                    if (var19 != 0 || var20 != 0) {
                        arg0.field785 = (int) (Math.atan2((double) var19, (double) var20) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field761 != 0 || arg0.field762 != 0) && (arg0.field788 == 0 || arg0.field792 > 0)) {
                int var21 = arg0.field793 - (arg0.field761 * 64 - Statics.field1935 * 64 - Statics.field1935 * 64);
                int var22 = arg0.field736 - (arg0.field762 * 64 - Statics.field1820 * 64 - Statics.field1820 * 64);
                if (var21 != 0 || var22 != 0) {
                    arg0.field785 = (int) (Math.atan2((double) var21, (double) var22) * 325.949D) & 0x7FF;
                }
                arg0.field761 = 0;
                arg0.field762 = 0;
            }
            int var23 = arg0.field785 - arg0.field777 & 0x7FF;
            if (var23 == 0) {
                arg0.field786 = 0;
            } else {
                arg0.field786++;
                if (var23 > 1024) {
                    arg0.field777 -= arg0.field787;
                    boolean var24 = true;
                    if (var23 < arg0.field787 || var23 > 2048 - arg0.field787) {
                        arg0.field777 = arg0.field785;
                        var24 = false;
                    }
                    if (arg0.field763 == arg0.field740 && (arg0.field786 > 25 || var24)) {
                        if (arg0.field741 == -1) {
                            arg0.field763 = arg0.field753;
                        } else {
                            arg0.field763 = arg0.field741;
                        }
                    }
                } else {
                    arg0.field777 += arg0.field787;
                    boolean var25 = true;
                    if (var23 < arg0.field787 || var23 > 2048 - arg0.field787) {
                        arg0.field777 = arg0.field785;
                        var25 = false;
                    }
                    if (arg0.field763 == arg0.field740 && (arg0.field786 > 25 || var25)) {
                        if (arg0.field742 == -1) {
                            arg0.field763 = arg0.field753;
                        } else {
                            arg0.field763 = arg0.field742;
                        }
                    }
                }
                arg0.field777 &= 0x7FF;
            }
        }
        arg0.field750 = false;
        if (arg0.field763 != -1) {
            class39 var27 = Statics.method97(arg0.field763);
            if (var27 == null || var27.field911 == null) {
                arg0.field763 = -1;
            } else {
                arg0.field765++;
                if (arg0.field737 < var27.field911.length && arg0.field765 > var27.field912[arg0.field737]) {
                    arg0.field765 = 1;
                    arg0.field737++;
                    method660(var27, arg0.field737, arg0.field793, arg0.field736);
                }
                if (arg0.field737 >= var27.field911.length) {
                    arg0.field765 = 0;
                    arg0.field737 = 0;
                    method660(var27, arg0.field737, arg0.field793, arg0.field736);
                }
            }
        }
        if (arg0.field794 != -1 && field266 >= arg0.field774) {
            if (arg0.field772 < 0) {
                arg0.field772 = 0;
            }
            int var28 = class40.method1765(arg0.field794).field935;
            if (var28 == -1) {
                arg0.field794 = -1;
            } else {
                class39 var29 = Statics.method97(var28);
                if (var29 == null || var29.field911 == null) {
                    arg0.field794 = -1;
                } else {
                    arg0.field773++;
                    if (arg0.field772 < var29.field911.length && arg0.field773 > var29.field912[arg0.field772]) {
                        arg0.field773 = 1;
                        arg0.field772++;
                        method660(var29, arg0.field772, arg0.field793, arg0.field736);
                    }
                    if (arg0.field772 >= var29.field911.length && (arg0.field772 < 0 || arg0.field772 >= var29.field911.length)) {
                        arg0.field794 = -1;
                    }
                }
            }
        }
        if (arg0.field766 != -1 && arg0.field769 <= 1) {
            class39 var30 = Statics.method97(arg0.field766);
            if (var30.field906 == 1 && arg0.field749 > 0 && arg0.field735 <= field266 && arg0.field781 < field266) {
                arg0.field769 = 1;
                return;
            }
        }
        if (arg0.field766 != -1 && arg0.field769 == 0) {
            class39 var31 = Statics.method97(arg0.field766);
            if (var31 == null || var31.field911 == null) {
                arg0.field766 = -1;
            } else {
                arg0.field757++;
                if (arg0.field767 < var31.field911.length && arg0.field757 > var31.field912[arg0.field767]) {
                    arg0.field757 = 1;
                    arg0.field767++;
                    method660(var31, arg0.field767, arg0.field793, arg0.field736);
                }
                if (arg0.field767 >= var31.field911.length) {
                    arg0.field767 -= var31.field914;
                    arg0.field770++;
                    if (arg0.field770 >= var31.field920) {
                        arg0.field766 = -1;
                    } else if (arg0.field767 >= 0 && arg0.field767 < var31.field911.length) {
                        method660(var31, arg0.field767, arg0.field793, arg0.field736);
                    } else {
                        arg0.field766 = -1;
                    }
                }
                arg0.field750 = var31.field916;
            }
        }
        if (arg0.field769 > 0) {
            arg0.field769--;
        }
    }

    @ObfuscatedName("fu.av(Laq;I)V")
    public static final void method2904(class34 arg0) {
        if (field266 == arg0.field781 || arg0.field766 == -1 || arg0.field769 != 0 || arg0.field757 + 1 > Statics.method97(arg0.field766).field912[arg0.field767]) {
            int var1 = arg0.field781 - arg0.field735;
            int var2 = field266 - arg0.field735;
            int var3 = arg0.field756 * 128 + arg0.field739 * 64;
            int var4 = arg0.field778 * 128 + arg0.field739 * 64;
            int var5 = arg0.field746 * 128 + arg0.field739 * 64;
            int var6 = arg0.field779 * 128 + arg0.field739 * 64;
            arg0.field793 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field736 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field792 = 0;
        if (arg0.field782 == 0) {
            arg0.field785 = 1024;
        }
        if (arg0.field782 == 1) {
            arg0.field785 = 1536;
        }
        if (arg0.field782 == 2) {
            arg0.field785 = 0;
        }
        if (arg0.field782 == 3) {
            arg0.field785 = 512;
        }
        arg0.field777 = arg0.field785;
    }

    @ObfuscatedName("x.al(Li;III)V")
    public static void method165(class3 arg0, int arg1, int arg2) {
        if (arg0.field766 == arg1 && arg1 != -1) {
            int var3 = Statics.method97(arg1).field910;
            if (var3 == 1) {
                arg0.field767 = 0;
                arg0.field757 = 0;
                arg0.field769 = arg2;
                arg0.field770 = 0;
            }
            if (var3 == 2) {
                arg0.field770 = 0;
            }
        } else if (arg1 == -1 || arg0.field766 == -1 || Statics.method97(arg1).field917 >= Statics.method97(arg0.field766).field917) {
            arg0.field766 = arg1;
            arg0.field767 = 0;
            arg0.field757 = 0;
            arg0.field769 = arg2;
            arg0.field770 = 0;
            arg0.field749 = arg0.field788;
        }
    }

    @ObfuscatedName("cg.aq(Ljava/lang/String;ZI)V")
    public static final void method1874(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field11.method3479(arg0, 250);
        int var6 = Statics.field11.method3446(arg0, 250) * 13;
        class74.method1520(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class74.method1522(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field11.method3451(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1968(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2069(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field2706.getGraphics();
            Statics.field127.method1366(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field2706.repaint();
        }
    }

    @ObfuscatedName("cd.am(Lar;I)V")
    public static final void method1848(class30 arg0) {
        if (Statics.field1358.field793 >> 7 == field492 && Statics.field1358.field736 >> 7 == field325) {
            field492 = 0;
        }
        int var1 = field379;
        if (class30.field692 == arg0 || class30.field700 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class30.field692 == arg0) {
                var3 = Statics.field1358;
                var4 = 33538048;
            } else if (class30.field700 == arg0) {
                var3 = field378[field469];
                var4 = field469 << 14;
            } else {
                var3 = field378[field380[var2]];
                var4 = field380[var2] << 14;
                if (class30.field694 == arg0 && field469 == field380[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method15() && !var3.field31) {
                var3.field30 = false;
                if ((field262 && field379 > 50 || field379 > 200) && class30.field692 != arg0 && var3.field763 == var3.field740) {
                    var3.field30 = true;
                }
                int var5 = var3.field793 >> 7;
                int var6 = var3.field736 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field49 == null || field266 < var3.field52 || field266 >= var3.field38) {
                        if ((var3.field793 & 0x7F) == 64 && (var3.field736 & 0x7F) == 64) {
                            if (field362 == field361[var5][var6]) {
                                continue;
                            }
                            field361[var5][var6] = field362;
                        }
                        var3.field36 = method1875(var3.field793, var3.field736, Statics.field572);
                        Statics.field2947.method1603(Statics.field572, var3.field793, var3.field736, var3.field36, 60, var3, var3.field777, var4, var3.field750);
                    } else {
                        var3.field30 = false;
                        var3.field36 = method1875(var3.field793, var3.field736, Statics.field572);
                        Statics.field2947.method1623(Statics.field572, var3.field793, var3.field736, var3.field36, 60, var3, var3.field777, var4, var3.field43, var3.field51, var3.field45, var3.field46);
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.ax(ZB)V")
    public static final void method561(boolean arg0) {
        for (int var1 = 0; var1 < field298; var1++) {
            class31 var2 = field464[field299[var1]];
            int var3 = (field299[var1] << 14) + 536870912;
            if (var2 != null && var2.method15() && var2.field707.field828 == arg0 && var2.field707.method636()) {
                int var4 = var2.field793 >> 7;
                int var5 = var2.field736 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field739 == 1 && (var2.field793 & 0x7F) == 64 && (var2.field736 & 0x7F) == 64) {
                        if (field362 == field361[var4][var5]) {
                            continue;
                        }
                        field361[var4][var5] = field362;
                    }
                    if (!var2.field707.field836) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2947.method1603(Statics.field572, var2.field793, var2.field736, method1875(var2.field793 + (var2.field739 * 64 - 64), var2.field736 + (var2.field739 * 64 - 64), Statics.field572), var2.field739 * 64 - 64 + 60, var2, var2.field777, var3, var2.field750);
                }
            }
        }
    }

    @ObfuscatedName("i.az(I)V")
    public static final void method22() {
        for (class7 var0 = (class7) field395.method3251(); var0 != null; var0 = (class7) field395.method3261()) {
            if (Statics.field572 != var0.field123 || field266 > var0.field105) {
                var0.method3343();
            } else if (field266 >= var0.field104) {
                if (var0.field117 > 0) {
                    class31 var1 = field464[var0.field117 - 1];
                    if (var1 != null && var1.field793 >= 0 && var1.field793 < 13312 && var1.field736 >= 0 && var1.field736 < 13312) {
                        var0.method91(var1.field793, var1.field736, method1875(var1.field793, var1.field736, var0.field123) - var0.field129, field266);
                    }
                }
                if (var0.field117 < 0) {
                    int var2 = -var0.field117 - 1;
                    class3 var3;
                    if (field426 == var2) {
                        var3 = Statics.field1358;
                    } else {
                        var3 = field378[var2];
                    }
                    if (var3 != null && var3.field793 >= 0 && var3.field793 < 13312 && var3.field736 >= 0 && var3.field736 < 13312) {
                        var0.method91(var3.field793, var3.field736, method1875(var3.field793, var3.field736, var0.field123) - var0.field129, field266);
                    }
                }
                var0.method92(field431);
                Statics.field2947.method1603(Statics.field572, (int) var0.field110, (int) var0.field120, (int) var0.field112, 60, var0, var0.field118, -1, false);
            }
        }
    }

    @ObfuscatedName("cc.ai(Laq;IIIIII)V")
    public static final void method1966(class34 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method15()) {
            return;
        }
        if (arg0 instanceof class31) {
            class36 var6 = ((class31) arg0).field707;
            if (var6.field833 != null) {
                var6 = var6.method635();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field379) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field31) {
                return;
            }
            if (var8.field32 != -1 || var8.field33 != -1) {
                method174(arg0, arg0.field784 + 15);
                if (field363 > -1) {
                    if (var8.field32 != -1) {
                        Statics.field2703[var8.field32].method1503(field363 + arg2 - 12, field253 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field33 != -1) {
                        Statics.field227[var8.field33].method1503(field363 + arg2 - 12, field253 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field470 == 10 && field326 == field380[arg1]) {
                method174(arg0, arg0.field784 + 15);
                if (field363 > -1) {
                    Statics.field1655[1].method1503(field363 + arg2 - 12, field253 + arg3 - var7);
                }
            }
        } else {
            class36 var9 = ((class31) arg0).field707;
            if (var9.field833 != null) {
                var9 = var9.method635();
            }
            if (var9.field814 >= 0 && var9.field814 < Statics.field227.length) {
                method174(arg0, arg0.field784 + 15);
                if (field363 > -1) {
                    Statics.field227[var9.field814].method1503(field363 + arg2 - 12, field253 + arg3 - 30);
                }
            }
            if (field470 == 1 && field276 == field299[arg1 - field379] && field266 % 20 < 10) {
                method174(arg0, arg0.field784 + 15);
                if (field363 > -1) {
                    Statics.field1655[0].method1503(field363 + arg2 - 12, field253 + arg3 - 28);
                }
            }
        }
        if (arg0.field748 != null && (arg1 >= field379 || !arg0.field738 && (field476 == 4 || !arg0.field755 && (field476 == 0 || field476 == 3 || field476 == 1 && method38(((class3) arg0).field37, false))))) {
            method174(arg0, arg0.field784);
            if (field363 > -1 && field351 < field352) {
                field356[field351] = Statics.field652.method3443(arg0.field748) / 2;
                field514[field351] = Statics.field652.field2983;
                field353[field351] = field363;
                field354[field351] = field253;
                field357[field351] = arg0.field752;
                field404[field351] = arg0.field780;
                field359[field351] = arg0.field751;
                field360[field351] = arg0.field748;
                field351++;
            }
        }
        if (arg0.field776 > field266) {
            method174(arg0, arg0.field784 + 15);
            if (field363 > -1) {
                int var10;
                if (arg1 < field379) {
                    var10 = 30;
                } else {
                    class36 var11 = ((class31) arg0).field707;
                    var10 = var11.field839;
                }
                int var12 = arg0.field758 * var10 / arg0.field759;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field758 > 0) {
                    var12 = 1;
                }
                class74.method1520(field363 + arg2 - var10 / 2, field253 + arg3 - 3, var12, 5, 65280);
                class74.method1520(field363 + arg2 - var10 / 2 + var12, field253 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field768[var13] > field266) {
                method174(arg0, arg0.field784 / 2);
                if (field363 > -1) {
                    if (var13 == 1) {
                        field253 -= 20;
                    }
                    if (var13 == 2) {
                        field363 -= 15;
                        field253 -= 10;
                    }
                    if (var13 == 3) {
                        field363 += 15;
                        field253 -= 10;
                    }
                    Statics.field706[arg0.field791[var13]].method1503(field363 + arg2 - 12, field253 + arg3 - 12);
                    Statics.field871.method3450(Integer.toString(arg0.field754[var13]), field363 + arg2 - 1, field253 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ad.aa(IIIII)V")
    public static final void method852(int arg0, int arg1, int arg2, int arg3) {
        field351 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field379 + field298; var6++) {
            class34 var7;
            if (var6 == -1) {
                var7 = Statics.field1358;
            } else if (var6 < field379) {
                var7 = field378[field380[var6]];
                if (field469 == field380[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field464[field299[var6 - field379]];
            }
            method1966(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method1966(field378[field469], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field351; var8++) {
            int var9 = field353[var8];
            int var10 = field354[var8];
            int var11 = field356[var8];
            int var12 = field514[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field354[var14] - field514[var14] && var10 - var12 < field354[var14] + 2 && var9 - var11 < field356[var14] + field353[var14] && var9 + var11 > field353[var14] - field356[var14] && field354[var14] - field514[var14] < var10) {
                        var10 = field354[var14] - field514[var14];
                        var13 = true;
                    }
                }
            }
            field363 = field353[var8];
            field253 = field354[var8] = var10;
            String var15 = field360[var8];
            if (field423 == 0) {
                int var16 = 16776960;
                if (field357[var8] < 6) {
                    var16 = field502[field357[var8]];
                }
                if (field357[var8] == 6) {
                    var16 = field362 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field357[var8] == 7) {
                    var16 = field362 % 20 < 10 ? 255 : 65535;
                }
                if (field357[var8] == 8) {
                    var16 = field362 % 20 < 10 ? 45056 : 8454016;
                }
                if (field357[var8] == 9) {
                    int var17 = 150 - field359[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field357[var8] == 10) {
                    int var18 = 150 - field359[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field357[var8] == 11) {
                    int var19 = 150 - field359[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field404[var8] == 0) {
                    Statics.field652.method3450(var15, field363 + arg0, field253 + arg1, var16, 0);
                }
                if (field404[var8] == 1) {
                    Statics.field652.method3452(var15, field363 + arg0, field253 + arg1, var16, 0, field362);
                }
                if (field404[var8] == 2) {
                    Statics.field652.method3453(var15, field363 + arg0, field253 + arg1, var16, 0, field362);
                }
                if (field404[var8] == 3) {
                    Statics.field652.method3465(var15, field363 + arg0, field253 + arg1, var16, 0, field362, 150 - field359[var8]);
                }
                if (field404[var8] == 4) {
                    int var20 = (150 - field359[var8]) * (Statics.field652.method3443(var15) + 100) / 150;
                    class74.method1515(field363 + arg0 - 50, arg1, field363 + arg0 + 50, arg1 + arg3);
                    Statics.field652.method3522(var15, field363 + arg0 + 50 - var20, field253 + arg1, var16, 0);
                    class74.method1514(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field404[var8] == 5) {
                    int var21 = 150 - field359[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class74.method1515(arg0, field253 + arg1 - Statics.field652.field2983 - 1, arg0 + arg2, field253 + arg1 + 5);
                    Statics.field652.method3450(var15, field363 + arg0, field253 + arg1 + var22, var16, 0);
                    class74.method1514(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field652.method3450(var15, field363 + arg0, field253 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("by.at(B)V")
    public static final void method1585() {
        field377 = 0;
        int var0 = (Statics.field1358.field793 >> 7) + Statics.field1935;
        int var1 = (Statics.field1358.field736 >> 7) + Statics.field1820;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field377 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field377 = 1;
        }
        if (field377 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field377 = 0;
        }
    }

    @ObfuscatedName("q.aw(IIIII)V")
    public static final void method177(int arg0, int arg1, int arg2, int arg3) {
        if (field368 == 1) {
            Statics.field961[field367 / 100].method1503(field365 - 8, field517 - 8);
        }
        if (field368 == 2) {
            Statics.field961[field367 / 100 + 4].method1503(field365 - 8, field517 - 8);
        }
        method1585();
        if (!field273) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field11.method3459("Fps:" + field2088, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field262) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field262) {
            var8 = 16711680;
        }
        Statics.field11.method3459("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("o.ao(Laq;II)V")
    public static final void method174(class34 arg0, int arg1) {
        method2847(arg0.field793, arg0.field736, arg1);
    }

    @ObfuscatedName("es.ag(IIII)V")
    public static final void method2847(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field363 = -1;
            field253 = -1;
            return;
        }
        int var3 = method1875(arg0, arg1, Statics.field572) - arg2;
        int var4 = arg0 - Statics.field635;
        int var5 = var3 - Statics.field145;
        int var6 = arg1 - Statics.field2561;
        int var7 = class85.field1482[Statics.field968];
        int var8 = class85.field1483[Statics.field968];
        int var9 = class85.field1482[Statics.field1909];
        int var10 = class85.field1483[Statics.field1909];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field363 = (var11 << 9) / var15 + 256;
            field253 = (var14 << 9) / var15 + 167;
        } else {
            field363 = -1;
            field253 = -1;
        }
    }

    @ObfuscatedName("cg.ad(IIII)I")
    public static final int method1875(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field94[var5][var3][var4] + class6.field94[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field94[var5][var3][var4 + 1] + class6.field94[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ax.au(ZI)V")
    public static final void method664(boolean arg0) {
        field453 = arg0;
        if (!field453) {
            int var1 = field488.method2261();
            int var2 = field488.method2298();
            int var3 = (field484 - field488.field1861) / 16;
            Statics.field956 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field956[var4][var5] = field488.method2171();
                }
            }
            int var6 = field488.method2163();
            int var7 = field488.method2164();
            int var8 = field488.method2163();
            Statics.field54 = new int[var3];
            Statics.field68 = new int[var3];
            Statics.field2046 = new int[var3];
            Statics.field174 = new byte[var3][];
            Statics.field207 = new byte[var3][];
            boolean var9 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var7 / 8 == 48) {
                var9 = true;
            }
            if (var2 / 8 == 48 && var7 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var2 - 6) / 8; var11 <= (var2 + 6) / 8; var11++) {
                for (int var12 = (var7 - 6) / 8; var12 <= (var7 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field54[var10] = var13;
                        Statics.field68[var10] = Statics.field529.method2745("m" + var11 + "_" + var12);
                        Statics.field2046[var10] = Statics.field529.method2745("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method1415(var2, var7, var1, var6, var8);
            return;
        }
        int var14 = field488.method2282();
        field488.method2362();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field488.method2365(1);
                    if (var18 == 1) {
                        field428[var15][var16][var17] = field488.method2365(26);
                    } else {
                        field428[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field488.method2380();
        int var19 = (field484 - field488.field1861) / 16;
        Statics.field956 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field956[var20][var21] = field488.method2136();
            }
        }
        int var22 = field488.method2163();
        int var23 = field488.method2164();
        int var24 = field488.method2163();
        int var25 = field488.method2156();
        Statics.field54 = new int[var19];
        Statics.field68 = new int[var19];
        Statics.field2046 = new int[var19];
        Statics.field174 = new byte[var19][];
        Statics.field207 = new byte[var19][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field428[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field54[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field54[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field68[var26] = Statics.field529.method2745("m" + var35 + "_" + var36);
                            Statics.field2046[var26] = Statics.field529.method2745("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method1415(var14, var24, var25, var22, var23);
    }

    @ObfuscatedName("bq.ak(IIIIII)V")
    public static final void method1415(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field2023 == arg0 && Statics.field630 == arg1 && field313 == arg2 || !field262) {
            return;
        }
        Statics.field2023 = arg0;
        Statics.field630 = arg1;
        field313 = arg2;
        if (!field262) {
            field313 = 0;
        }
        method590(25);
        method1874(class147.field2285, true);
        int var5 = Statics.field1935;
        int var6 = Statics.field1820;
        Statics.field1935 = (arg0 - 6) * 8;
        Statics.field1820 = (arg1 - 6) * 8;
        int var7 = Statics.field1935 - var5;
        int var8 = Statics.field1820 - var6;
        int var9 = Statics.field1935;
        int var10 = Statics.field1820;
        for (int var11 = 0; var11 < 32768; var11++) {
            class31 var12 = field464[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field795[var13] -= var7;
                    var12.field743[var13] -= var8;
                }
                var12.field793 -= var7 * 128;
                var12.field736 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field378[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field795[var16] -= var7;
                    var15.field743[var16] -= var8;
                }
                var15.field793 -= var7 * 128;
                var15.field736 -= var8 * 128;
            }
        }
        Statics.field572 = arg2;
        Statics.field1358.method613(arg3, arg4, false);
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
        for (class15 var28 = (class15) field270.method3251(); var28 != null; var28 = (class15) field270.method3261()) {
            var28.field216 -= var7;
            var28.field217 -= var8;
            if (var28.field216 < 0 || var28.field217 < 0 || var28.field216 >= 104 || var28.field217 >= 104) {
                var28.method3343();
            }
        }
        if (field492 != 0) {
            field492 -= var7;
            field325 -= var8;
        }
        field397 = 0;
        field500 = false;
        field400 = -1;
        field396.method3284();
        field395.method3284();
    }

    @ObfuscatedName("gn.aj(ZI)V")
    public static final void method3367(boolean arg0) {
        method537();
        field307++;
        if (field307 < 50 && !arg0) {
            return;
        }
        field307 = 0;
        if (field312 || Statics.field303 == null) {
            return;
        }
        field301.method2376(170);
        try {
            Statics.field303.method2597(field301.field1865, 0, field301.field1861);
            field301.field1861 = 0;
        } catch (IOException var2) {
            field312 = true;
        }
    }

    @ObfuscatedName("c.af(IIIIII)V")
    public static final void method554(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2947.method1618(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2947.method1622(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1764.field1314;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class37 var13 = class37.method2964(var12);
            if (var13.field891 == -1) {
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
                class75 var14 = Statics.field1869[var13.field891];
                if (var14 != null) {
                    int var15 = (var13.field858 * 4 - var14.field1328) / 2;
                    int var16 = (var13.field859 * 4 - var14.field1327) / 2;
                    var14.method1573(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field859) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2947.method1620(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2947.method1622(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class37 var22 = class37.method2964(var21);
            if (var22.field891 != -1) {
                class75 var23 = Statics.field1869[var22.field891];
                if (var23 != null) {
                    int var24 = (var22.field858 * 4 - var23.field1328) / 2;
                    int var25 = (var22.field859 * 4 - var23.field1327) / 2;
                    var23.method1573(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field859) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1764.field1314;
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
        int var29 = Statics.field2947.method1621(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class37 var31 = class37.method2964(var30);
        if (var31.field891 == -1) {
            return;
        }
        class75 var32 = Statics.field1869[var31.field891];
        if (var32 != null) {
            int var33 = (var31.field858 * 4 - var32.field1328) / 2;
            int var34 = (var31.field859 * 4 - var32.field1327) / 2;
            var32.method1573(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field859) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("o.ac(I)V")
    public static final void method169() {
        if (field305 == 17) {
            int var0 = field488.method2199();
            int var1 = (var0 >> 4 & 0x7) + Statics.field546;
            int var2 = (var0 & 0x7) + Statics.field1895;
            int var3 = field488.method2298();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class182 var4 = field393[Statics.field572][var1][var2];
                if (var4 != null) {
                    for (class26 var5 = (class26) var4.method3251(); var5 != null; var5 = (class26) var4.method3261()) {
                        if ((var3 & 0x7FFF) == var5.field625) {
                            var5.method3343();
                            break;
                        }
                    }
                    if (var4.method3251() == null) {
                        field393[Statics.field572][var1][var2] = null;
                    }
                    method32(var1, var2);
                }
            }
        } else if (field305 == 150) {
            int var6 = field488.method2199();
            int var7 = (var6 >> 4 & 0x7) + Statics.field546;
            int var8 = (var6 & 0x7) + Statics.field1895;
            int var9 = field488.method2282();
            int var10 = field488.method2282();
            int var11 = field488.method2282();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                class182 var12 = field393[Statics.field572][var7][var8];
                if (var12 != null) {
                    for (class26 var13 = (class26) var12.method3251(); var13 != null; var13 = (class26) var12.method3261()) {
                        if ((var9 & 0x7FFF) == var13.field625 && var13.field622 == var10) {
                            var13.field622 = var11;
                            break;
                        }
                    }
                    method32(var7, var8);
                }
            }
        } else {
            if (field305 == 134) {
                int var14 = field488.method2199();
                int var15 = (var14 >> 4 & 0x7) + Statics.field546;
                int var16 = (var14 & 0x7) + Statics.field1895;
                int var17 = field488.method2282();
                int var18 = field488.method2199();
                int var19 = var18 >> 4 & 0xF;
                int var20 = var18 & 0x7;
                int var21 = field488.method2199();
                if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                    int var22 = var19 + 1;
                    if (Statics.field1358.field795[0] >= var15 - var22 && Statics.field1358.field795[0] <= var15 + var22 && Statics.field1358.field743[0] >= var16 - var22 && Statics.field1358.field743[0] <= var16 + var22 && field499 != 0 && var20 > 0 && field397 < 50) {
                        field285[field397] = var17;
                        field503[field397] = var20;
                        field268[field397] = var21;
                        field506[field397] = null;
                        field505[field397] = (var15 << 16) + (var16 << 8) + var19;
                        field397++;
                    }
                }
            }
            if (field305 == 148) {
                int var23 = field488.method2282();
                int var24 = field488.method2157();
                int var25 = (var24 >> 4 & 0x7) + Statics.field546;
                int var26 = (var24 & 0x7) + Statics.field1895;
                int var27 = field488.method2199();
                int var28 = var27 >> 2;
                int var29 = var27 & 0x3;
                int var30 = field322[var28];
                if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                    Statics.method96(Statics.field572, var25, var26, var30, var23, var28, var29, 0, -1);
                }
            } else if (field305 == 32) {
                int var31 = field488.method2199();
                int var32 = (var31 >> 4 & 0x7) + Statics.field546;
                int var33 = (var31 & 0x7) + Statics.field1895;
                int var34 = field488.method2282();
                int var35 = field488.method2199();
                int var36 = field488.method2282();
                if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                    int var37 = var32 * 128 + 64;
                    int var38 = var33 * 128 + 64;
                    class27 var39 = new class27(var34, Statics.field572, var37, var38, method1875(var37, var38, Statics.field572) - var35, var36, field266);
                    field396.method3274(var39);
                }
            } else if (field305 == 206) {
                int var40 = field488.method2157();
                int var41 = var40 >> 2;
                int var42 = var40 & 0x3;
                int var43 = field322[var41];
                int var44 = field488.method2261();
                int var45 = (var44 >> 4 & 0x7) + Statics.field546;
                int var46 = (var44 & 0x7) + Statics.field1895;
                if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                    Statics.method96(Statics.field572, var45, var46, var43, -1, var41, var42, 0, -1);
                }
            } else if (field305 == 186) {
                int var47 = field488.method2157();
                int var48 = (var47 >> 4 & 0x7) + Statics.field546;
                int var49 = (var47 & 0x7) + Statics.field1895;
                int var50 = field488.method2156();
                int var51 = var50 >> 2;
                int var52 = var50 & 0x3;
                int var53 = field322[var51];
                int var54 = field488.method2164();
                if (var48 >= 0 && var49 >= 0 && var48 < 103 && var49 < 103) {
                    if (var53 == 0) {
                        class81 var55 = Statics.field2947.method1614(Statics.field572, var48, var49);
                        if (var55 != null) {
                            int var56 = var55.field1423 >> 14 & 0x7FFF;
                            if (var51 == 2) {
                                var55.field1427 = new class11(var56, 2, var52 + 4, Statics.field572, var48, var49, var54, false, var55.field1427);
                                var55.field1428 = new class11(var56, 2, var52 + 1 & 0x3, Statics.field572, var48, var49, var54, false, var55.field1428);
                            } else {
                                var55.field1427 = new class11(var56, var51, var52, Statics.field572, var48, var49, var54, false, var55.field1427);
                            }
                        }
                    }
                    if (var53 == 1) {
                        class88 var57 = Statics.field2947.method1670(Statics.field572, var48, var49);
                        if (var57 != null) {
                            int var58 = var57.field1502 >> 14 & 0x7FFF;
                            if (var51 == 4 || var51 == 5) {
                                var57.field1500 = new class11(var58, 4, var52, Statics.field572, var48, var49, var54, false, var57.field1500);
                            } else if (var51 == 6) {
                                var57.field1500 = new class11(var58, 4, var52 + 4, Statics.field572, var48, var49, var54, false, var57.field1500);
                            } else if (var51 == 7) {
                                var57.field1500 = new class11(var58, 4, (var52 + 2 & 0x3) + 4, Statics.field572, var48, var49, var54, false, var57.field1500);
                            } else if (var51 == 8) {
                                var57.field1500 = new class11(var58, 4, var52 + 4, Statics.field572, var48, var49, var54, false, var57.field1500);
                                var57.field1501 = new class11(var58, 4, (var52 + 2 & 0x3) + 4, Statics.field572, var48, var49, var54, false, var57.field1501);
                            }
                        }
                    }
                    if (var53 == 2) {
                        class92 var59 = Statics.field2947.method1616(Statics.field572, var48, var49);
                        if (var51 == 11) {
                            var51 = 10;
                        }
                        if (var59 != null) {
                            var59.field1556 = new class11(var59.field1560 >> 14 & 0x7FFF, var51, var52, Statics.field572, var48, var49, var54, false, var59.field1556);
                        }
                    }
                    if (var53 == 3) {
                        class87 var60 = Statics.field2947.method1617(Statics.field572, var48, var49);
                        if (var60 != null) {
                            var60.field1490 = new class11(var60.field1488 >> 14 & 0x7FFF, 22, var52, Statics.field572, var48, var49, var54, false, var60.field1490);
                        }
                    }
                }
            } else if (field305 == 218) {
                int var61 = field488.method2282();
                int var62 = field488.method2156();
                int var63 = (var62 >> 4 & 0x7) + Statics.field546;
                int var64 = (var62 & 0x7) + Statics.field1895;
                int var65 = field488.method2163();
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    class26 var66 = new class26();
                    var66.field625 = var61;
                    var66.field622 = var65;
                    if (field393[Statics.field572][var63][var64] == null) {
                        field393[Statics.field572][var63][var64] = new class182();
                    }
                    field393[Statics.field572][var63][var64].method3274(var66);
                    method32(var63, var64);
                }
            } else if (field305 == 180) {
                int var67 = field488.method2199();
                int var68 = (var67 >> 4 & 0x7) + Statics.field546;
                int var69 = (var67 & 0x7) + Statics.field1895;
                int var70 = var68 + field488.method2132();
                int var71 = var69 + field488.method2132();
                int var72 = field488.method2134();
                int var73 = field488.method2282();
                int var74 = field488.method2199() * 4;
                int var75 = field488.method2199() * 4;
                int var76 = field488.method2282();
                int var77 = field488.method2282();
                int var78 = field488.method2199();
                int var79 = field488.method2199();
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104 && var73 != 65535) {
                    int var80 = var68 * 128 + 64;
                    int var81 = var69 * 128 + 64;
                    int var82 = var70 * 128 + 64;
                    int var83 = var71 * 128 + 64;
                    class7 var84 = new class7(var73, Statics.field572, var80, var81, method1875(var80, var81, Statics.field572) - var74, field266 + var76, field266 + var77, var78, var79, var72, var75);
                    var84.method91(var82, var83, method1875(var82, var83, Statics.field572) - var75, field266 + var76);
                    field395.method3274(var84);
                }
            } else if (field305 == 67) {
                int var85 = field488.method2298();
                int var86 = field488.method2163();
                int var87 = field488.method2163();
                int var88 = field488.method2156();
                int var89 = var88 >> 2;
                int var90 = var88 & 0x3;
                int var91 = field322[var89];
                byte var92 = field488.method2132();
                byte var93 = field488.method2132();
                int var94 = field488.method2157();
                int var95 = (var94 >> 4 & 0x7) + Statics.field546;
                int var96 = (var94 & 0x7) + Statics.field1895;
                byte var97 = field488.method2280();
                byte var98 = field488.method2159();
                int var99 = field488.method2164();
                class3 var100;
                if (field426 == var87) {
                    var100 = Statics.field1358;
                } else {
                    var100 = field378[var87];
                }
                if (var100 != null) {
                    class37 var101 = class37.method2964(var85);
                    int var102;
                    int var103;
                    if (var90 == 1 || var90 == 3) {
                        var102 = var101.field859;
                        var103 = var101.field858;
                    } else {
                        var102 = var101.field858;
                        var103 = var101.field859;
                    }
                    int var104 = (var102 >> 1) + var95;
                    int var105 = (var102 + 1 >> 1) + var95;
                    int var106 = (var103 >> 1) + var96;
                    int var107 = (var103 + 1 >> 1) + var96;
                    int[][] var108 = class6.field94[Statics.field572];
                    int var109 = var108[var104][var106] + var108[var105][var106] + var108[var104][var107] + var108[var105][var107] >> 2;
                    int var110 = (var95 << 7) + (var102 << 6);
                    int var111 = (var96 << 7) + (var103 << 6);
                    class99 var112 = var101.method672(var89, var90, var108, var110, var109, var111);
                    if (var112 != null) {
                        Statics.method96(Statics.field572, var95, var96, var91, -1, 0, 0, var86 + 1, var99 + 1);
                        var100.field52 = field266 + var86;
                        var100.field38 = field266 + var99;
                        var100.field49 = var112;
                        var100.field39 = var95 * 128 + var102 * 64;
                        var100.field41 = var96 * 128 + var103 * 64;
                        var100.field40 = var109;
                        if (var98 > var97) {
                            byte var113 = var98;
                            var98 = var97;
                            var97 = var113;
                        }
                        if (var93 > var92) {
                            byte var114 = var93;
                            var93 = var92;
                            var92 = var114;
                        }
                        var100.field43 = var95 + var98;
                        var100.field45 = var95 + var97;
                        var100.field51 = var93 + var96;
                        var100.field46 = var92 + var96;
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.ay(I)V")
    public static final void method553() {
        for (class15 var0 = (class15) field270.method3251(); var0 != null; var0 = (class15) field270.method3261()) {
            if (var0.field214 == -1) {
                var0.field224 = 0;
                method1965(var0);
            } else {
                var0.method3343();
            }
        }
    }

    @ObfuscatedName("cv.bu(Lo;B)V")
    public static final void method1965(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field215 == 0) {
            var1 = Statics.field2947.method1618(arg0.field226, arg0.field216, arg0.field217);
        }
        if (arg0.field215 == 1) {
            var1 = Statics.field2947.method1600(arg0.field226, arg0.field216, arg0.field217);
        }
        if (arg0.field215 == 2) {
            var1 = Statics.field2947.method1620(arg0.field226, arg0.field216, arg0.field217);
        }
        if (arg0.field215 == 3) {
            var1 = Statics.field2947.method1621(arg0.field226, arg0.field216, arg0.field217);
        }
        if (var1 != 0) {
            int var5 = Statics.field2947.method1622(arg0.field226, arg0.field216, arg0.field217, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field219 = var2;
        arg0.field220 = var3;
        arg0.field223 = var4;
    }

    @ObfuscatedName("i.bo(I)V")
    public static final void method23() {
        for (class15 var0 = (class15) field270.method3251(); var0 != null; var0 = (class15) field270.method3261()) {
            if (var0.field214 > 0) {
                var0.field214--;
            }
            if (var0.field214 == 0) {
                if (var0.field219 >= 0) {
                    int var1 = var0.field219;
                    int var2 = var0.field220;
                    class37 var3 = class37.method2964(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method673(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method2713(var0.field226, var0.field215, var0.field216, var0.field217, var0.field219, var0.field223, var0.field220);
                var0.method3343();
            } else {
                if (var0.field224 > 0) {
                    var0.field224--;
                }
                if (var0.field224 == 0 && var0.field216 >= 1 && var0.field217 >= 1 && var0.field216 <= 102 && var0.field217 <= 102) {
                    if (var0.field221 >= 0) {
                        int var5 = var0.field221;
                        int var6 = var0.field218;
                        class37 var7 = class37.method2964(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method673(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method2713(var0.field226, var0.field215, var0.field216, var0.field217, var0.field221, var0.field222, var0.field218);
                    var0.field224 = -1;
                    if (var0.field221 == var0.field219 && var0.field219 == -1) {
                        var0.method3343();
                    } else if (var0.field221 == var0.field219 && var0.field223 == var0.field222 && var0.field220 == var0.field218) {
                        var0.method3343();
                    }
                }
            }
        }
    }

    @ObfuscatedName("en.bi(IIIIIIII)V")
    public static final void method2713(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field262 && Statics.field572 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2947.method1618(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2947.method1600(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2947.method1620(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2947.method1621(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2947.method1622(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2947.method1685(arg0, arg2, arg3);
                class37 var15 = class37.method2964(var12);
                if (var15.field842 != 0) {
                    field319[arg0].method3593(arg2, arg3, var13, var14, var15.field861);
                }
            }
            if (arg1 == 1) {
                Statics.field2947.method1610(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2947.method1611(arg0, arg2, arg3);
                class37 var16 = class37.method2964(var12);
                if (var16.field858 + arg2 > 103 || var16.field858 + arg3 > 103 || var16.field859 + arg2 > 103 || var16.field859 + arg3 > 103) {
                    return;
                }
                if (var16.field842 != 0) {
                    field319[arg0].method3582(arg2, arg3, var16.field858, var16.field859, var14, var16.field861);
                }
            }
            if (arg1 == 3) {
                Statics.field2947.method1650(arg0, arg2, arg3);
                class37 var17 = class37.method2964(var12);
                if (var17.field842 == 1) {
                    field319[arg0].method3584(arg2, arg3);
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
        class80 var19 = Statics.field2947;
        class211 var20 = field319[arg0];
        class37 var21 = class37.method2964(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field859;
            var23 = var21.field858;
        } else {
            var22 = var21.field858;
            var23 = var21.field859;
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
        int[][] var28 = class6.field94[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field862 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field883 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class79 var34;
            if (var21.field875 == -1 && var21.field884 == null) {
                var34 = var21.method672(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field875, true, (class79) null);
            }
            var19.method1598(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field842 == 1) {
                var20.method3598(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class79 var57;
            if (var21.field875 == -1 && var21.field884 == null) {
                var57 = var21.method672(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field875, true, (class79) null);
            }
            if (var57 != null) {
                var19.method1602(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field842 != 0) {
                var20.method3577(arg2, arg3, var22, var23, var21.field861);
            }
        } else if (arg6 >= 12) {
            class79 var35;
            if (var21.field875 == -1 && var21.field884 == null) {
                var35 = var21.method672(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field875, true, (class79) null);
            }
            var19.method1602(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field842 != 0) {
                var20.method3577(arg2, arg3, var22, var23, var21.field861);
            }
        } else if (arg6 == 0) {
            class79 var36;
            if (var21.field875 == -1 && var21.field884 == null) {
                var36 = var21.method672(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field875, true, (class79) null);
            }
            var19.method1631(arg0, arg2, arg3, var29, var36, (class79) null, class6.field85[arg5], 0, var32, var33);
            if (var21.field842 != 0) {
                var20.method3576(arg2, arg3, arg6, arg5, var21.field861);
            }
        } else if (arg6 == 1) {
            class79 var37;
            if (var21.field875 == -1 && var21.field884 == null) {
                var37 = var21.method672(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field875, true, (class79) null);
            }
            var19.method1631(arg0, arg2, arg3, var29, var37, (class79) null, class6.field77[arg5], 0, var32, var33);
            if (var21.field842 != 0) {
                var20.method3576(arg2, arg3, arg6, arg5, var21.field861);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class79 var39;
            class79 var40;
            if (var21.field875 == -1 && var21.field884 == null) {
                var39 = var21.method672(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method672(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field875, true, (class79) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field875, true, (class79) null);
            }
            var19.method1631(arg0, arg2, arg3, var29, var39, var40, class6.field85[arg5], class6.field85[var38], var32, var33);
            if (var21.field842 != 0) {
                var20.method3576(arg2, arg3, arg6, arg5, var21.field861);
            }
        } else if (arg6 == 3) {
            class79 var41;
            if (var21.field875 == -1 && var21.field884 == null) {
                var41 = var21.method672(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field875, true, (class79) null);
            }
            var19.method1631(arg0, arg2, arg3, var29, var41, (class79) null, class6.field77[arg5], 0, var32, var33);
            if (var21.field842 != 0) {
                var20.method3576(arg2, arg3, arg6, arg5, var21.field861);
            }
        } else if (arg6 == 9) {
            class79 var42;
            if (var21.field875 == -1 && var21.field884 == null) {
                var42 = var21.method672(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field875, true, (class79) null);
            }
            var19.method1602(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field842 != 0) {
                var20.method3577(arg2, arg3, var22, var23, var21.field861);
            }
        } else if (arg6 == 4) {
            class79 var43;
            if (var21.field875 == -1 && var21.field884 == null) {
                var43 = var21.method672(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field875, true, (class79) null);
            }
            var19.method1601(arg0, arg2, arg3, var29, var43, (class79) null, class6.field85[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1618(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class37.method2964(var45 >> 14 & 0x7FFF).field867;
            }
            class79 var46;
            if (var21.field875 == -1 && var21.field884 == null) {
                var46 = var21.method672(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field875, true, (class79) null);
            }
            var19.method1601(arg0, arg2, arg3, var29, var46, (class79) null, class6.field85[arg5], 0, class6.field87[arg5] * var44, class6.field88[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1618(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class37.method2964(var48 >> 14 & 0x7FFF).field867 / 2;
            }
            class79 var49;
            if (var21.field875 == -1 && var21.field884 == null) {
                var49 = var21.method672(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field875, true, (class79) null);
            }
            var19.method1601(arg0, arg2, arg3, var29, var49, (class79) null, 256, arg5, class6.field89[arg5] * var47, class6.field90[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class79 var51;
            if (var21.field875 == -1 && var21.field884 == null) {
                var51 = var21.method672(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field875, true, (class79) null);
            }
            var19.method1601(arg0, arg2, arg3, var29, var51, (class79) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1618(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class37.method2964(var53 >> 14 & 0x7FFF).field867 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class79 var55;
            class79 var56;
            if (var21.field875 == -1 && var21.field884 == null) {
                var55 = var21.method672(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method672(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field875, true, (class79) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field875, true, (class79) null);
            }
            var19.method1601(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field89[arg5] * var52, class6.field90[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("b.bs(IIB)V")
    public static final void method32(int arg0, int arg1) {
        class182 var2 = field393[Statics.field572][arg0][arg1];
        if (var2 == null) {
            Statics.field2947.method1635(Statics.field572, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class26 var5 = null;
        for (class26 var6 = (class26) var2.method3251(); var6 != null; var6 = (class26) var2.method3261()) {
            class46 var7 = class46.method740(var6.field625);
            long var8 = (long) var7.field1048;
            if (var7.field1032 == 1) {
                var8 = (long) (var6.field622 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2947.method1635(Statics.field572, arg0, arg1);
            return;
        }
        var2.method3257(var5);
        class26 var10 = null;
        class26 var11 = null;
        for (class26 var12 = (class26) var2.method3251(); var12 != null; var12 = (class26) var2.method3261()) {
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
        Statics.field2947.method1678(Statics.field572, arg0, arg1, method1875(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field572), var5, var13, var10, var11);
    }

    @ObfuscatedName("er.bl(B)V")
    public static final void method2855() {
        int var0 = field488.method2365(8);
        if (var0 < field379) {
            for (int var1 = var0; var1 < field379; var1++) {
                field387[++field386 - 1] = field380[var1];
            }
        }
        if (var0 > field379) {
            throw new RuntimeException("");
        }
        field379 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field380[var2];
            class3 var4 = field378[var3];
            int var5 = field488.method2365(1);
            if (var5 == 0) {
                field380[++field379 - 1] = var3;
                var4.field771 = field266;
            } else {
                int var6 = field488.method2365(2);
                if (var6 == 0) {
                    field380[++field379 - 1] = var3;
                    var4.field771 = field266;
                    field333[++field320 - 1] = var3;
                } else if (var6 == 1) {
                    field380[++field379 - 1] = var3;
                    var4.field771 = field266;
                    int var7 = field488.method2365(3);
                    var4.method616(var7, false);
                    int var8 = field488.method2365(1);
                    if (var8 == 1) {
                        field333[++field320 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field380[++field379 - 1] = var3;
                    var4.field771 = field266;
                    int var9 = field488.method2365(3);
                    var4.method616(var9, true);
                    int var10 = field488.method2365(3);
                    var4.method616(var10, true);
                    int var11 = field488.method2365(1);
                    if (var11 == 1) {
                        field333[++field320 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field387[++field386 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ff.bp(I)V")
    public static final void method2965() {
        for (int var0 = 0; var0 < field320; var0++) {
            int var1 = field333[var0];
            class3 var2 = field378[var1];
            int var3 = field488.method2199();
            if ((var3 & 0x20) != 0) {
                var3 += field488.method2199() << 8;
            }
            Statics.method131(var1, var2, var3);
        }
    }

    @ObfuscatedName("dr.bm(ZB)V")
    public static final void method2416(boolean arg0) {
        field386 = 0;
        field320 = 0;
        field488.method2362();
        int var1 = field488.method2365(8);
        if (var1 < field298) {
            for (int var2 = var1; var2 < field298; var2++) {
                field387[++field386 - 1] = field299[var2];
            }
        }
        if (var1 > field298) {
            throw new RuntimeException("");
        }
        field298 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field299[var3];
            class31 var5 = field464[var4];
            int var6 = field488.method2365(1);
            if (var6 == 0) {
                field299[++field298 - 1] = var4;
                var5.field771 = field266;
            } else {
                int var7 = field488.method2365(2);
                if (var7 == 0) {
                    field299[++field298 - 1] = var4;
                    var5.field771 = field266;
                    field333[++field320 - 1] = var4;
                } else if (var7 == 1) {
                    field299[++field298 - 1] = var4;
                    var5.field771 = field266;
                    int var8 = field488.method2365(3);
                    var5.method616(var8, false);
                    int var9 = field488.method2365(1);
                    if (var9 == 1) {
                        field333[++field320 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field299[++field298 - 1] = var4;
                    var5.field771 = field266;
                    int var10 = field488.method2365(3);
                    var5.method616(var10, true);
                    int var11 = field488.method2365(3);
                    var5.method616(var11, true);
                    int var12 = field488.method2365(1);
                    if (var12 == 1) {
                        field333[++field320 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field387[++field386 - 1] = var4;
                }
            }
        }
        method139(arg0);
        method2702();
        for (int var13 = 0; var13 < field386; var13++) {
            int var14 = field387[var13];
            if (field266 != field464[var14].field771) {
                field464[var14].field707 = null;
                field464[var14] = null;
            }
        }
        if (field484 != field488.field1861) {
            throw new RuntimeException(field488.field1861 + class2.field23 + field484);
        }
        for (int var15 = 0; var15 < field298; var15++) {
            if (field464[field299[var15]] == null) {
                throw new RuntimeException(var15 + class2.field23 + field298);
            }
        }
    }

    @ObfuscatedName("f.bz(ZI)V")
    public static final void method139(boolean arg0) {
        while (true) {
            if (field488.method2367(field484) >= 27) {
                int var1 = field488.method2365(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field464[var1] == null) {
                        field464[var1] = new class31();
                        var2 = true;
                    }
                    class31 var3 = field464[var1];
                    field299[++field298 - 1] = var1;
                    var3.field771 = field266;
                    int var4;
                    if (arg0) {
                        var4 = field488.method2365(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field488.method2365(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    int var5 = field488.method2365(1);
                    if (var5 == 1) {
                        field333[++field320 - 1] = var1;
                    }
                    var3.field707 = class36.method1074(field488.method2365(14));
                    int var6;
                    if (arg0) {
                        var6 = field488.method2365(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field488.method2365(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7 = field483[field488.method2365(3)];
                    if (var2) {
                        var3.field785 = var3.field777 = var7;
                    }
                    int var8 = field488.method2365(1);
                    var3.field739 = var3.field707.field820;
                    var3.field787 = var3.field707.field823;
                    if (var3.field787 == 0) {
                        var3.field777 = 0;
                    }
                    var3.field753 = var3.field707.field815;
                    var3.field744 = var3.field707.field816;
                    var3.field745 = var3.field707.field817;
                    var3.field789 = var3.field707.field818;
                    var3.field740 = var3.field707.field819;
                    var3.field741 = var3.field707.field813;
                    var3.field742 = var3.field707.field832;
                    var3.method613(Statics.field1358.field795[0] + var4, Statics.field1358.field743[0] + var6, var8 == 1);
                    continue;
                }
            }
            field488.method2380();
            return;
        }
    }

    @ObfuscatedName("eb.br(I)V")
    public static final void method2702() {
        for (int var0 = 0; var0 < field320; var0++) {
            int var1 = field333[var0];
            class31 var2 = field464[var1];
            int var3 = field488.method2199();
            if ((var3 & 0x2) != 0) {
                var2.field794 = field488.method2282();
                int var4 = field488.method2136();
                var2.field775 = var4 >> 16;
                var2.field774 = (var4 & 0xFFFF) + field266;
                var2.field772 = 0;
                var2.field773 = 0;
                if (var2.field774 > field266) {
                    var2.field772 = -1;
                }
                if (var2.field794 == 65535) {
                    var2.field794 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                int var5 = field488.method2163();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = field488.method2261();
                if (var2.field766 == var5 && var5 != -1) {
                    int var7 = Statics.method97(var5).field910;
                    if (var7 == 1) {
                        var2.field767 = 0;
                        var2.field757 = 0;
                        var2.field769 = var6;
                        var2.field770 = 0;
                    }
                    if (var7 == 2) {
                        var2.field770 = 0;
                    }
                } else if (var5 == -1 || var2.field766 == -1 || Statics.method97(var5).field917 >= Statics.method97(var2.field766).field917) {
                    var2.field766 = var5;
                    var2.field767 = 0;
                    var2.field757 = 0;
                    var2.field769 = var6;
                    var2.field770 = 0;
                    var2.field749 = var2.field788;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field707 = class36.method1074(field488.method2298());
                var2.field739 = var2.field707.field820;
                var2.field787 = var2.field707.field823;
                var2.field753 = var2.field707.field815;
                var2.field744 = var2.field707.field816;
                var2.field745 = var2.field707.field817;
                var2.field789 = var2.field707.field818;
                var2.field740 = var2.field707.field819;
                var2.field741 = var2.field707.field813;
                var2.field742 = var2.field707.field832;
            }
            if ((var3 & 0x8) != 0) {
                int var8 = field488.method2199();
                int var9 = field488.method2199();
                var2.method620(var8, var9, field266);
                var2.field776 = field266 + 300;
                var2.field758 = field488.method2282();
                var2.field759 = field488.method2298();
            }
            if ((var3 & 0x80) != 0) {
                var2.field764 = field488.method2298();
                if (var2.field764 == 65535) {
                    var2.field764 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field761 = field488.method2164();
                var2.field762 = field488.method2164();
            }
            if ((var3 & 0x1) != 0) {
                int var10 = field488.method2157();
                int var11 = field488.method2199();
                var2.method620(var10, var11, field266);
                var2.field776 = field266 + 300;
                var2.field758 = field488.method2298();
                var2.field759 = field488.method2163();
            }
            if ((var3 & 0x40) != 0) {
                var2.field748 = field488.method2139();
                var2.field751 = 100;
            }
        }
    }

    @ObfuscatedName("df.be(III)V")
    public static final void method2396(int arg0, int arg1) {
        if (field402 < 2 && field297 == 0 && !field497) {
            return;
        }
        String var2;
        if (field297 == 1 && field402 < 2) {
            var2 = class147.field2194 + class147.field2341 + field432 + " " + class2.field26;
        } else if (field497 && field402 < 2) {
            var2 = field349 + class147.field2341 + field420 + " " + class2.field26;
        } else {
            int var3 = field402 - 1;
            String var4;
            if (field345[var3].length() > 0) {
                var4 = field407[var3] + class147.field2341 + field345[var3];
            } else {
                var4 = field407[var3];
            }
            var2 = var4;
        }
        if (field402 > 2) {
            var2 = var2 + class2.method2316(16777215) + " " + '/' + " " + (field402 - 2) + class147.field2335;
        }
        Statics.field652.method3475(var2, arg0 + 4, arg1 + 15, 16777215, 0, field266 / 1000);
    }

    @ObfuscatedName("ed.bb(I)V")
    public static final void method2727() {
        int var0 = Statics.field999;
        int var1 = Statics.field2700;
        int var2 = Statics.field22;
        int var3 = Statics.field1506;
        int var4 = 6116423;
        class74.method1520(var0, var1, var2, var3, var4);
        class74.method1520(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class74.method1522(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field652.method3522(class147.field2349, var0 + 3, var1 + 14, var4, -1);
        int var5 = class131.field2030;
        int var6 = class131.field2031 * -778357537;
        for (int var7 = 0; var7 < field402; var7++) {
            int var8 = (field402 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class207 var10 = Statics.field652;
            String var11;
            if (field345[var7].length() > 0) {
                var11 = field407[var7] + class147.field2341 + field345[var7];
            } else {
                var11 = field407[var7];
            }
            var10.method3522(var11, var0 + 3, var8, var9, 0);
        }
        method2069(Statics.field999, Statics.field2700, Statics.field22, Statics.field1506);
    }

    @ObfuscatedName("cc.bc(IIIII)V")
    public static final void method1968(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field465; var4++) {
            if (field472[var4] + field257[var4] > arg0 && field257[var4] < arg0 + arg2 && field473[var4] + field471[var4] > arg1 && field471[var4] < arg1 + arg3) {
                field467[var4] = true;
            }
        }
    }

    @ObfuscatedName("cs.bk(IIIII)V")
    public static final void method2069(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field465; var4++) {
            if (field472[var4] + field257[var4] > arg0 && field257[var4] < arg0 + arg2 && field473[var4] + field471[var4] > arg1 && field471[var4] < arg1 + arg3) {
                field468[var4] = true;
            }
        }
    }

    @ObfuscatedName("ar.bf(I)V")
    public static final void method591() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field402 - 1; var1++) {
                if (field405[var1] < 1000 && field405[var1 + 1] > 1000) {
                    String var2 = field345[var1];
                    field345[var1] = field345[var1 + 1];
                    field345[var1 + 1] = var2;
                    String var3 = field407[var1];
                    field407[var1] = field407[var1 + 1];
                    field407[var1 + 1] = var3;
                    int var4 = field405[var1];
                    field405[var1] = field405[var1 + 1];
                    field405[var1 + 1] = var4;
                    int var5 = field430[var1];
                    field430[var1] = field430[var1 + 1];
                    field430[var1 + 1] = var5;
                    int var6 = field366[var1];
                    field366[var1] = field366[var1 + 1];
                    field366[var1 + 1] = var6;
                    int var7 = field406[var1];
                    field406[var1] = field406[var1 + 1];
                    field406[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field185 != null || field433 != null) {
            return;
        }
        int var20;
        int var21;
        label216: {
            int var8 = class131.field2036;
            if (field401) {
                if (var8 != 1 && (Statics.field1816 || var8 != 4)) {
                    int var9 = class131.field2030;
                    int var10 = class131.field2031 * -778357537;
                    if (var9 < Statics.field999 - 10 || var9 > Statics.field999 + Statics.field22 + 10 || var10 < Statics.field2700 - 10 || var10 > Statics.field2700 + Statics.field1506 + 10) {
                        field401 = false;
                        method1968(Statics.field999, Statics.field2700, Statics.field22, Statics.field1506);
                    }
                }
                if (var8 == 1 || !Statics.field1816 && var8 == 4) {
                    int var11 = Statics.field999;
                    int var12 = Statics.field2700;
                    int var13 = Statics.field22;
                    int var14 = class131.field2024;
                    int var15 = class131.field2026;
                    int var16 = -1;
                    for (int var17 = 0; var17 < field402; var17++) {
                        int var18 = (field402 - 1 - var17) * 15 + var12 + 31;
                        if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                            var16 = var17;
                        }
                    }
                    if (var16 != -1) {
                        method175(var16);
                    }
                    field401 = false;
                    method1968(Statics.field999, Statics.field2700, Statics.field22, Statics.field1506);
                }
            } else {
                if ((var8 == 1 || !Statics.field1816 && var8 == 4) && field402 > 0) {
                    int var19 = field405[field402 - 1];
                    if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                        var20 = field430[field402 - 1];
                        var21 = field366[field402 - 1];
                        class157 var22 = class157.method1871(var21);
                        int var23 = method34(var22);
                        boolean var24 = (var23 >> 28 & 0x1) != 0;
                        if (var24) {
                            break label216;
                        }
                        class161 var10000 = (class161) null;
                        if (class161.method1411(method34(var22))) {
                            break label216;
                        }
                    }
                }
                if ((var8 == 1 || !Statics.field1816 && var8 == 4) && (field520 == 1 && field402 > 2 || method135(field402 - 1))) {
                    var8 = 2;
                }
                if ((var8 == 1 || !Statics.field1816 && var8 == 4) && field402 > 0) {
                    method175(field402 - 1);
                }
                if (var8 == 2 && field402 > 0) {
                    method2398(class131.field2024, class131.field2026);
                }
            }
            return;
        }
        if (Statics.field185 != null && !field287 && field520 != 1 && !method135(field402 - 1) && field402 > 0) {
            int var25 = field342;
            int var26 = field275;
            method519(Statics.field114, var25, var26);
            Statics.field114 = null;
        }
        field287 = false;
        field343 = 0;
        if (Statics.field185 != null) {
            method1372(Statics.field185);
        }
        Statics.field185 = class157.method1871(var21);
        field371 = var20;
        field342 = class131.field2024;
        field275 = class131.field2026;
        if (field402 > 0) {
            int var27 = field402 - 1;
            Statics.field114 = new class28();
            Statics.field114.field649 = field430[var27];
            Statics.field114.field646 = field366[var27];
            Statics.field114.field644 = field405[var27];
            Statics.field114.field648 = field406[var27];
            Statics.field114.field642 = field407[var27];
        }
        method1372(Statics.field185);
    }

    @ObfuscatedName("dw.bg(III)V")
    public static final void method2398(int arg0, int arg1) {
        int var2 = Statics.field652.method3443(class147.field2349);
        for (int var3 = 0; var3 < field402; var3++) {
            int var4 = Statics.field652.method3443(method133(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field402 * 15 + 21;
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
        field401 = true;
        Statics.field999 = var6;
        Statics.field2700 = var7;
        Statics.field22 = var2;
        Statics.field1506 = field402 * 15 + 22;
    }

    @ObfuscatedName("f.bt(II)Z")
    public static final boolean method135(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field405[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("o.bx(II)V")
    public static final void method175(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field430[arg0];
        int var2 = field366[arg0];
        int var3 = field405[arg0];
        int var4 = field406[arg0];
        String var5 = field407[arg0];
        String var6 = field345[arg0];
        method31(var1, var2, var3, var4, var5, var6, class131.field2024, class131.field2026);
    }

    @ObfuscatedName("y.bn(Las;III)V")
    public static final void method519(class28 arg0, int arg1, int arg2) {
        method31(arg0.field649, arg0.field646, arg0.field644, arg0.field648, arg0.field642, arg0.field642, arg1, arg2);
    }

    @ObfuscatedName("b.bq(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method31(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 31) {
            field301.method2376(163);
            field301.method2287(arg3);
            field301.method2120(arg1);
            field301.method2287(Statics.field760);
            field301.method2188(arg0);
            field301.method2170(Statics.field1836);
            field301.method2161(Statics.field28);
            field369 = 0;
            Statics.field582 = class157.method1871(arg1);
            field370 = arg0;
        }
        if (arg2 == 2) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field492 = arg0;
            field325 = arg1;
            field301.method2376(184);
            field301.method2161(arg3 >> 14 & 0x7FFF);
            field301.method2161(field451);
            field301.method2218(Statics.field1935 + arg0);
            field301.method2152(class128.field1991[82] ? 1 : 0);
            field301.method2161(Statics.field1820 + arg1);
            field301.method2170(Statics.field568);
        }
        if (arg2 == 33) {
            field301.method2376(32);
            field301.method2188(arg0);
            field301.method2287(arg3);
            field301.method2169(arg1);
            field369 = 0;
            Statics.field582 = class157.method1871(arg1);
            field370 = arg0;
        }
        if (arg2 == 42) {
            field301.method2376(61);
            field301.method2169(arg1);
            field301.method2161(arg3);
            field301.method2161(arg0);
            field369 = 0;
            Statics.field582 = class157.method1871(arg1);
            field370 = arg0;
        }
        if (arg2 == 7) {
            class31 var8 = field464[arg3];
            if (var8 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(225);
                field301.method2161(Statics.field28);
                field301.method2120(Statics.field1836);
                field301.method2218(arg3);
                field301.method2152(class128.field1991[82] ? 1 : 0);
                field301.method2218(Statics.field760);
            }
        }
        if (arg2 == 11) {
            class31 var9 = field464[arg3];
            if (var9 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(65);
                field301.method2161(arg3);
                field301.method2117(class128.field1991[82] ? 1 : 0);
            }
        }
        if (arg2 == 17) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field492 = arg0;
            field325 = arg1;
            field301.method2376(204);
            field301.method2161(arg3);
            field301.method2218(field451);
            field301.method2188(Statics.field1935 + arg0);
            field301.method2154(class128.field1991[82] ? 1 : 0);
            field301.method2161(Statics.field1820 + arg1);
            field301.method2169(Statics.field568);
        }
        if (arg2 == 16) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field492 = arg0;
            field325 = arg1;
            field301.method2376(197);
            field301.method2117(class128.field1991[82] ? 1 : 0);
            field301.method2170(Statics.field1836);
            field301.method2188(Statics.field28);
            field301.method2188(Statics.field1820 + arg1);
            field301.method2188(Statics.field1935 + arg0);
            field301.method2218(arg3);
            field301.method2287(Statics.field760);
        }
        if (arg2 == 26) {
            method530();
        }
        if (arg2 == 43) {
            field301.method2376(103);
            field301.method2287(arg0);
            field301.method2120(arg1);
            field301.method2161(arg3);
            field369 = 0;
            Statics.field582 = class157.method1871(arg1);
            field370 = arg0;
        }
        if (arg2 == 18) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field492 = arg0;
            field325 = arg1;
            field301.method2376(212);
            field301.method2154(class128.field1991[82] ? 1 : 0);
            field301.method2218(Statics.field1935 + arg0);
            field301.method2287(Statics.field1820 + arg1);
            field301.method2287(arg3);
        }
        if (arg2 == 51) {
            class3 var10 = field378[arg3];
            if (var10 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(38);
                field301.method2218(arg3);
                field301.method2154(class128.field1991[82] ? 1 : 0);
            }
        }
        if (arg2 == 30 && field425 == null) {
            method36(arg1, arg0);
            field425 = class157.method598(arg1, arg0);
            method1372(field425);
        }
        if (arg2 == 28) {
            field301.method2376(116);
            field301.method2120(arg1);
            class157 var11 = class157.method1871(arg1);
            if (var11.field2670 != null && var11.field2670[0][0] == 5) {
                int var12 = var11.field2670[0][1];
                class159.field2701[var12] = 1 - class159.field2701[var12];
                method99(var12);
            }
        }
        if (arg2 == 40) {
            field301.method2376(27);
            field301.method2287(arg0);
            field301.method2254(arg1);
            field301.method2287(arg3);
            field369 = 0;
            Statics.field582 = class157.method1871(arg1);
            field370 = arg0;
        }
        if (arg2 == 22) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field492 = arg0;
            field325 = arg1;
            field301.method2376(240);
            field301.method2287(Statics.field1820 + arg1);
            field301.method2218(Statics.field1935 + arg0);
            field301.method2218(arg3);
            field301.method2152(class128.field1991[82] ? 1 : 0);
        }
        if (arg2 == 19) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field492 = arg0;
            field325 = arg1;
            field301.method2376(120);
            field301.method2287(Statics.field1935 + arg0);
            field301.method2287(Statics.field1820 + arg1);
            field301.method2152(class128.field1991[82] ? 1 : 0);
            field301.method2287(arg3);
        }
        if (arg2 == 36) {
            field301.method2376(148);
            field301.method2170(arg1);
            field301.method2218(arg3);
            field301.method2287(arg0);
            field369 = 0;
            Statics.field582 = class157.method1871(arg1);
            field370 = arg0;
        }
        if (arg2 == 1004) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field301.method2376(129);
            field301.method2287(arg3);
        }
        if (arg2 == 10) {
            class31 var13 = field464[arg3];
            if (var13 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(19);
                field301.method2161(arg3);
                field301.method2117(class128.field1991[82] ? 1 : 0);
            }
        }
        if (arg2 == 41) {
            field301.method2376(81);
            field301.method2120(arg1);
            field301.method2287(arg0);
            field301.method2161(arg3);
            field369 = 0;
            Statics.field582 = class157.method1871(arg1);
            field370 = arg0;
        }
        if (arg2 == 38) {
            method1338();
            class157 var14 = class157.method1871(arg1);
            field297 = 1;
            Statics.field28 = arg0;
            Statics.field1836 = arg1;
            Statics.field760 = arg3;
            method1372(var14);
            field432 = class2.method2316(16748608) + class46.method740(arg3).field1024 + class2.method2316(16777215);
            if (field432 == null) {
                field432 = "null";
            }
            return;
        }
        if (arg2 == 45) {
            class3 var15 = field378[arg3];
            if (var15 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(198);
                field301.method2152(class128.field1991[82] ? 1 : 0);
                field301.method2188(arg3);
            }
        }
        if (arg2 == 1001) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field492 = arg0;
            field325 = arg1;
            field301.method2376(48);
            field301.method2154(class128.field1991[82] ? 1 : 0);
            field301.method2287(Statics.field1820 + arg1);
            field301.method2188(Statics.field1935 + arg0);
            field301.method2188(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 34) {
            field301.method2376(115);
            field301.method2218(arg0);
            field301.method2287(arg3);
            field301.method2120(arg1);
            field369 = 0;
            Statics.field582 = class157.method1871(arg1);
            field370 = arg0;
        }
        if (arg2 == 39) {
            field301.method2376(123);
            field301.method2254(arg1);
            field301.method2287(arg0);
            field301.method2188(arg3);
            field369 = 0;
            Statics.field582 = class157.method1871(arg1);
            field370 = arg0;
        }
        if (arg2 == 29) {
            field301.method2376(116);
            field301.method2120(arg1);
            class157 var16 = class157.method1871(arg1);
            if (var16.field2670 != null && var16.field2670[0][0] == 5) {
                int var17 = var16.field2670[0][1];
                if (class159.field2701[var17] != var16.field2672[0]) {
                    class159.field2701[var17] = var16.field2672[0];
                    method99(var17);
                }
            }
        }
        if (arg2 == 1003) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            class31 var18 = field464[arg3];
            if (var18 != null) {
                class36 var19 = var18.field707;
                if (var19.field833 != null) {
                    var19 = var19.method635();
                }
                if (var19 != null) {
                    field301.method2376(192);
                    field301.method2287(var19.field807);
                }
            }
        }
        if (arg2 == 3) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field492 = arg0;
            field325 = arg1;
            field301.method2376(221);
            field301.method2287(Statics.field1935 + arg0);
            field301.method2287(arg3 >> 14 & 0x7FFF);
            field301.method2188(Statics.field1820 + arg1);
            field301.method2153(class128.field1991[82] ? 1 : 0);
        }
        if (arg2 == 6) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field492 = arg0;
            field325 = arg1;
            field301.method2376(94);
            field301.method2287(Statics.field1820 + arg1);
            field301.method2153(class128.field1991[82] ? 1 : 0);
            field301.method2161(Statics.field1935 + arg0);
            field301.method2161(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 58) {
            class157 var20 = class157.method598(arg1, arg0);
            if (var20 != null) {
                field301.method2376(124);
                field301.method2218(arg0);
                field301.method2287(var20.field2678);
                field301.method2161(field451);
                field301.method2287(field418);
                field301.method2120(arg1);
                field301.method2169(Statics.field568);
            }
        }
        if (arg2 == 23) {
            Statics.field2947.method1629(Statics.field572, arg0, arg1);
        }
        if (arg2 == 21) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field492 = arg0;
            field325 = arg1;
            field301.method2376(112);
            field301.method2188(Statics.field1820 + arg1);
            field301.method2161(arg3);
            field301.method2218(Statics.field1935 + arg0);
            field301.method2154(class128.field1991[82] ? 1 : 0);
        }
        if (arg2 == 12) {
            class31 var21 = field464[arg3];
            if (var21 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(68);
                field301.method2154(class128.field1991[82] ? 1 : 0);
                field301.method2287(arg3);
            }
        }
        if (arg2 == 14) {
            class3 var22 = field378[arg3];
            if (var22 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(165);
                field301.method2161(Statics.field760);
                field301.method2154(class128.field1991[82] ? 1 : 0);
                field301.method2254(Statics.field1836);
                field301.method2287(Statics.field28);
                field301.method2218(arg3);
            }
        }
        if (arg2 == 4) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field492 = arg0;
            field325 = arg1;
            field301.method2376(31);
            field301.method2161(Statics.field1935 + arg0);
            field301.method2188(arg3 >> 14 & 0x7FFF);
            field301.method2287(Statics.field1820 + arg1);
            field301.method2154(class128.field1991[82] ? 1 : 0);
        }
        if (arg2 == 1002) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field301.method2376(133);
            field301.method2287(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 50) {
            class3 var23 = field378[arg3];
            if (var23 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(69);
                field301.method2218(arg3);
                field301.method2152(class128.field1991[82] ? 1 : 0);
            }
        }
        if (arg2 == 20) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field492 = arg0;
            field325 = arg1;
            field301.method2376(231);
            field301.method2152(class128.field1991[82] ? 1 : 0);
            field301.method2218(Statics.field1820 + arg1);
            field301.method2188(arg3);
            field301.method2161(Statics.field1935 + arg0);
        }
        if (arg2 == 5) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field492 = arg0;
            field325 = arg1;
            field301.method2376(93);
            field301.method2161(Statics.field1935 + arg0);
            field301.method2161(Statics.field1820 + arg1);
            field301.method2218(arg3 >> 14 & 0x7FFF);
            field301.method2117(class128.field1991[82] ? 1 : 0);
        }
        if (arg2 == 32) {
            field301.method2376(153);
            field301.method2120(arg1);
            field301.method2218(field451);
            field301.method2218(arg3);
            field301.method2120(Statics.field568);
            field301.method2188(arg0);
            field369 = 0;
            Statics.field582 = class157.method1871(arg1);
            field370 = arg0;
        }
        if (arg2 == 49) {
            class3 var24 = field378[arg3];
            if (var24 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(118);
                field301.method2218(arg3);
                field301.method2153(class128.field1991[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class31 var25 = field464[arg3];
            if (var25 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(181);
                field301.method2287(arg3);
                field301.method2152(class128.field1991[82] ? 1 : 0);
            }
        }
        if (arg2 == 1005) {
            class157 var26 = class157.method1871(arg1);
            if (var26 == null || var26.field2612[arg0] < 100000) {
                field301.method2376(129);
                field301.method2287(arg3);
            } else {
                class10.method2599(27, "", var26.field2612[arg0] + " x " + class46.method740(arg3).field1024);
            }
            field369 = 0;
            Statics.field582 = class157.method1871(arg1);
            field370 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class157 var27 = class157.method598(arg1, arg0);
            if (var27 != null) {
                int var28 = var27.field2678;
                class157 var29 = class157.method598(arg1, arg0);
                if (var29 != null) {
                    if (var29.field2659 != null) {
                        class1 var30 = new class1();
                        var30.field10 = var29;
                        var30.field12 = arg3;
                        var30.field7 = arg5;
                        var30.field6 = var29.field2659;
                        class33.method182(var30);
                    }
                    boolean var31 = true;
                    if (var29.field2575 > 0) {
                        var31 = method100(var29);
                    }
                    if (var31) {
                        int var32 = method34(var29);
                        int var33 = arg3 - 1;
                        boolean var34 = (var32 >> var33 + 1 & 0x1) != 0;
                        if (var34) {
                            if (arg3 == 1) {
                                field301.method2376(237);
                                field301.method2120(arg1);
                                field301.method2188(arg0);
                                field301.method2188(var28);
                            }
                            if (arg3 == 2) {
                                field301.method2376(223);
                                field301.method2120(arg1);
                                field301.method2188(arg0);
                                field301.method2188(var28);
                            }
                            if (arg3 == 3) {
                                field301.method2376(219);
                                field301.method2120(arg1);
                                field301.method2188(arg0);
                                field301.method2188(var28);
                            }
                            if (arg3 == 4) {
                                field301.method2376(188);
                                field301.method2120(arg1);
                                field301.method2188(arg0);
                                field301.method2188(var28);
                            }
                            if (arg3 == 5) {
                                field301.method2376(28);
                                field301.method2120(arg1);
                                field301.method2188(arg0);
                                field301.method2188(var28);
                            }
                            if (arg3 == 6) {
                                field301.method2376(220);
                                field301.method2120(arg1);
                                field301.method2188(arg0);
                                field301.method2188(var28);
                            }
                            if (arg3 == 7) {
                                field301.method2376(110);
                                field301.method2120(arg1);
                                field301.method2188(arg0);
                                field301.method2188(var28);
                            }
                            if (arg3 == 8) {
                                field301.method2376(60);
                                field301.method2120(arg1);
                                field301.method2188(arg0);
                                field301.method2188(var28);
                            }
                            if (arg3 == 9) {
                                field301.method2376(146);
                                field301.method2120(arg1);
                                field301.method2188(arg0);
                                field301.method2188(var28);
                            }
                            if (arg3 == 10) {
                                field301.method2376(157);
                                field301.method2120(arg1);
                                field301.method2188(arg0);
                                field301.method2188(var28);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 9) {
            class31 var35 = field464[arg3];
            if (var35 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(91);
                field301.method2287(arg3);
                field301.method2117(class128.field1991[82] ? 1 : 0);
            }
        }
        if (arg2 == 24) {
            class157 var36 = class157.method1871(arg1);
            boolean var37 = true;
            if (var36.field2575 > 0) {
                var37 = method100(var36);
            }
            if (var37) {
                field301.method2376(116);
                field301.method2120(arg1);
            }
        }
        if (arg2 == 37) {
            field301.method2376(97);
            field301.method2188(arg3);
            field301.method2170(arg1);
            field301.method2218(arg0);
            field369 = 0;
            Statics.field582 = class157.method1871(arg1);
            field370 = arg0;
        }
        if (arg2 == 8) {
            class31 var38 = field464[arg3];
            if (var38 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(207);
                field301.method2218(arg3);
                field301.method2161(field451);
                field301.method2170(Statics.field568);
                field301.method2152(class128.field1991[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field301.method2376(55);
            field301.method2161(arg3);
            field301.method2161(arg0);
            field301.method2120(arg1);
            field369 = 0;
            Statics.field582 = class157.method1871(arg1);
            field370 = arg0;
        }
        if (arg2 == 44) {
            class3 var39 = field378[arg3];
            if (var39 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(85);
                field301.method2153(class128.field1991[82] ? 1 : 0);
                field301.method2287(arg3);
            }
        }
        if (arg2 == 47) {
            class3 var40 = field378[arg3];
            if (var40 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(189);
                field301.method2117(class128.field1991[82] ? 1 : 0);
                field301.method2188(arg3);
            }
        }
        if (arg2 == 25) {
            class157 var41 = class157.method598(arg1, arg0);
            if (var41 != null) {
                method1338();
                int var44 = method34(var41);
                int var45 = var44 >> 11 & 0x3F;
                method2714(arg1, arg0, var45, var41.field2678);
                field297 = 0;
                field349 = method2070(var41);
                if (field349 == null) {
                    field349 = "Null";
                }
                if (var41.field2595) {
                    field420 = var41.field2632 + class2.method2316(16777215);
                } else {
                    field420 = class2.method2316(65280) + var41.field2674 + class2.method2316(16777215);
                }
            }
            return;
        }
        if (arg2 == 48) {
            class3 var46 = field378[arg3];
            if (var46 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(132);
                field301.method2161(arg3);
                field301.method2154(class128.field1991[82] ? 1 : 0);
            }
        }
        if (arg2 == 1) {
            field365 = arg6;
            field517 = arg7;
            field368 = 2;
            field367 = 0;
            field492 = arg0;
            field325 = arg1;
            field301.method2376(244);
            field301.method2218(arg3 >> 14 & 0x7FFF);
            field301.method2161(Statics.field1820 + arg1);
            field301.method2153(class128.field1991[82] ? 1 : 0);
            field301.method2218(Statics.field28);
            field301.method2120(Statics.field1836);
            field301.method2287(Statics.field760);
            field301.method2218(Statics.field1935 + arg0);
        }
        if (arg2 == 15) {
            class3 var47 = field378[arg3];
            if (var47 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(71);
                field301.method2120(Statics.field568);
                field301.method2287(arg3);
                field301.method2117(class128.field1991[82] ? 1 : 0);
                field301.method2188(field451);
            }
        }
        if (arg2 == 46) {
            class3 var48 = field378[arg3];
            if (var48 != null) {
                field365 = arg6;
                field517 = arg7;
                field368 = 2;
                field367 = 0;
                field492 = arg0;
                field325 = arg1;
                field301.method2376(82);
                field301.method2152(class128.field1991[82] ? 1 : 0);
                field301.method2218(arg3);
            }
        }
        if (field297 != 0) {
            field297 = 0;
            method1372(class157.method1871(Statics.field1836));
        }
        if (field497) {
            method1338();
        }
        if (Statics.field582 != null && field369 == 0) {
            method1372(Statics.field582);
        }
    }

    @ObfuscatedName("w.ba(ILjava/lang/String;I)V")
    public static void method98(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field379; var3++) {
            class3 var4 = field378[field380[var3]];
            if (var4 != null && var4.field37 != null && var4.field37.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field301.method2376(85);
                    field301.method2153(0);
                    field301.method2287(field380[var3]);
                } else if (arg0 == 4) {
                    field301.method2376(189);
                    field301.method2117(0);
                    field301.method2188(field380[var3]);
                } else if (arg0 == 6) {
                    field301.method2376(118);
                    field301.method2218(field380[var3]);
                    field301.method2153(0);
                } else if (arg0 == 7) {
                    field301.method2376(69);
                    field301.method2218(field380[var3]);
                    field301.method2152(0);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class10.method2599(4, "", class147.field2421 + arg1);
        }
    }

    @ObfuscatedName("en.bv(IIIII)V")
    public static void method2714(int arg0, int arg1, int arg2, int arg3) {
        class157 var4 = class157.method598(arg0, arg1);
        if (var4 != null && var4.field2616 != null) {
            class1 var5 = new class1();
            var5.field10 = var4;
            var5.field6 = var4.field2616;
            class33.method182(var5);
        }
        field418 = arg3;
        field497 = true;
        Statics.field568 = arg0;
        field451 = arg1;
        Statics.field157 = arg2;
        method1372(var4);
    }

    @ObfuscatedName("bt.bd(B)V")
    public static void method1338() {
        if (!field497) {
            return;
        }
        class157 var0 = class157.method598(Statics.field568, field451);
        if (var0 != null && var0.field2658 != null) {
            class1 var1 = new class1();
            var1.field10 = var0;
            var1.field6 = var0.field2658;
            class33.method182(var1);
        }
        field497 = false;
        method1372(var0);
    }

    @ObfuscatedName("l.bh(IIB)V")
    public static void method36(int arg0, int arg1) {
        field301.method2376(80);
        field301.method2188(arg1);
        field301.method2170(arg0);
    }

    @ObfuscatedName("cg.bj(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method1873(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field401 || field402 >= 500) {
            return;
        }
        field407[field402] = arg0;
        field345[field402] = arg1;
        field405[field402] = arg2;
        field406[field402] = arg3;
        field430[field402] = arg4;
        field366[field402] = arg5;
        field402++;
    }

    @ObfuscatedName("ad.by(B)V")
    public static void method851() {
        for (int var0 = 0; var0 < field402; var0++) {
            if (method2838(field405[var0])) {
                if (var0 < field402 - 1) {
                    for (int var1 = var0; var1 < field402 - 1; var1++) {
                        field407[var1] = field407[var1 + 1];
                        field345[var1] = field345[var1 + 1];
                        field405[var1] = field405[var1 + 1];
                        field406[var1] = field406[var1 + 1];
                        field430[var1] = field430[var1 + 1];
                        field366[var1] = field366[var1 + 1];
                    }
                }
                field402--;
            }
        }
    }

    @ObfuscatedName("ez.cr(IB)Z")
    public static boolean method2838(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("k.ct(IB)Ljava/lang/String;")
    public static String method133(int arg0) {
        return field345[arg0].length() > 0 ? field407[arg0] + class147.field2341 + field345[arg0] : field407[arg0];
    }

    @ObfuscatedName("j.cw(IIIII)V")
    public static final void method511(int arg0, int arg1, int arg2, int arg3) {
        if (field297 == 0 && !field497) {
            method1873(class147.field2323, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class99.field1754; var6++) {
            int var7 = class99.field1755[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field2947.method1622(Statics.field572, var8, var9, var7) >= 0) {
                    class37 var12 = class37.method2964(var11);
                    if (var12.field884 != null) {
                        var12 = var12.method675();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field297 == 1) {
                        method1873(class147.field2194, field432 + " " + class2.field26 + " " + class2.method2316(65535) + var12.field879, 1, var7, var8, var9);
                    } else if (!field497) {
                        String[] var13 = var12.field870;
                        if (field385) {
                            var13 = method2901(var13);
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
                                    method1873(var13[var14], class2.method2316(65535) + var12.field879, var15, var7, var8, var9);
                                }
                            }
                        }
                        method1873(class147.field2332, class2.method2316(65535) + var12.field879, 1002, var12.field850 << 14, var8, var9);
                    } else if ((Statics.field157 & 0x4) == 4) {
                        method1873(field349, field420 + " " + class2.field26 + " " + class2.method2316(65535) + var12.field879, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class31 var16 = field464[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field707.field820 == 1 && (var16.field793 & 0x7F) == 64 && (var16.field736 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field298; var17++) {
                            class31 var18 = field464[field299[var17]];
                            if (var18 != null && var16 != var18 && var18.field707.field820 == 1 && var16.field793 == var18.field793 && var16.field736 == var18.field736) {
                                method3173(var18.field707, field299[var17], var8, var9);
                            }
                        }
                        for (int var19 = 0; var19 < field379; var19++) {
                            class3 var20 = field378[field380[var19]];
                            if (var20 != null && var16.field793 == var20.field793 && var16.field736 == var20.field736) {
                                method921(var20, field380[var19], var8, var9);
                            }
                        }
                    }
                    method3173(var16.field707, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var21 = field378[var11];
                    if (var21 == null) {
                        continue;
                    }
                    if ((var21.field793 & 0x7F) == 64 && (var21.field736 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < field298; var22++) {
                            class31 var23 = field464[field299[var22]];
                            if (var23 != null && var23.field707.field820 == 1 && var21.field793 == var23.field793 && var21.field736 == var23.field736) {
                                method3173(var23.field707, field299[var22], var8, var9);
                            }
                        }
                        for (int var24 = 0; var24 < field379; var24++) {
                            class3 var25 = field378[field380[var24]];
                            if (var25 != null && var21 != var25 && var21.field793 == var25.field793 && var21.field736 == var25.field736) {
                                method921(var25, field380[var24], var8, var9);
                            }
                        }
                    }
                    if (field469 == var11) {
                        var4 = var7;
                    } else {
                        method921(var21, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class182 var26 = field393[Statics.field572][var8][var9];
                    if (var26 != null) {
                        for (class26 var27 = (class26) var26.method3252(); var27 != null; var27 = (class26) var26.method3253()) {
                            class46 var28 = class46.method740(var27.field625);
                            if (field297 == 1) {
                                method1873(class147.field2194, field432 + " " + class2.field26 + " " + class2.method2316(16748608) + var28.field1024, 16, var27.field625, var8, var9);
                            } else if (!field497) {
                                String[] var29 = var28.field1037;
                                if (field385) {
                                    var29 = method2901(var29);
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
                                        method1873(var29[var30], class2.method2316(16748608) + var28.field1024, var31, var27.field625, var8, var9);
                                    } else if (var30 == 2) {
                                        method1873(class147.field2316, class2.method2316(16748608) + var28.field1024, 20, var27.field625, var8, var9);
                                    }
                                }
                                method1873(class147.field2332, class2.method2316(16748608) + var28.field1024, 1004, var27.field625, var8, var9);
                            } else if ((Statics.field157 & 0x1) == 1) {
                                method1873(field349, field420 + " " + class2.field26 + " " + class2.method2316(16748608) + var28.field1024, 17, var27.field625, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var32 = var4 & 0x7F;
            int var33 = var4 >> 7 & 0x7F;
            class3 var34 = field378[field469];
            method921(var34, field469, var32, var33);
        }
    }

    @ObfuscatedName("fy.cq(Lax;IIII)V")
    public static final void method3173(class36 arg0, int arg1, int arg2, int arg3) {
        if (field402 >= 400) {
            return;
        }
        if (arg0.field833 != null) {
            arg0 = arg0.method635();
        }
        if (arg0 == null || !arg0.field836 || arg0.field838 && field429 != arg1) {
            return;
        }
        String var4 = arg0.field827;
        if (arg0.field825 != 0) {
            int var6 = arg0.field825;
            int var7 = Statics.field1358.field34;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2316(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2316(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2316(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2316(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2316(65280);
            } else if (var8 > 6) {
                var9 = class2.method2316(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2316(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2316(12648192);
            } else {
                var9 = class2.method2316(16776960);
            }
            var4 = var4 + var9 + " " + class2.field17 + class147.field2190 + arg0.field825 + class2.field18;
        }
        if (field297 == 1) {
            method1873(class147.field2194, field432 + " " + class2.field26 + " " + class2.method2316(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field497) {
            String[] var10 = arg0.field822;
            if (field385) {
                var10 = method2901(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class147.field2303)) {
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
                        method1873(var10[var11], class2.method2316(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class147.field2303)) {
                        short var14 = 0;
                        if (field284 == class18.field530 || field284 == class18.field532 && arg0.field825 > Statics.field1358.field34) {
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
                        method1873(var10[var13], class2.method2316(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method1873(class147.field2332, class2.method2316(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field157 & 0x2) == 2) {
            method1873(field349, field420 + " " + class2.field26 + " " + class2.method2316(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("aj.ci(Li;IIII)V")
    public static final void method921(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1358 == arg0 || field402 >= 400) {
            return;
        }
        String var9;
        if (arg0.field44 == 0) {
            String var4 = arg0.field37;
            int var5 = arg0.field34;
            int var6 = Statics.field1358.field34;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2316(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2316(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2316(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2316(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2316(65280);
            } else if (var7 > 6) {
                var8 = class2.method2316(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2316(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2316(12648192);
            } else {
                var8 = class2.method2316(16776960);
            }
            var9 = var4 + var8 + " " + class2.field17 + class147.field2190 + arg0.field34 + class2.field18;
        } else {
            var9 = arg0.field37 + " " + class2.field17 + class147.field2338 + arg0.field44 + class2.field18;
        }
        if (field297 == 1) {
            method1873(class147.field2194, field432 + " " + class2.field26 + " " + class2.method2316(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field497) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field389[var10] != null) {
                    short var11 = 0;
                    if (field389[var10].equalsIgnoreCase(class147.field2303)) {
                        if (field284 == class18.field530 || field284 == class18.field532 && arg0.field34 > Statics.field1358.field34) {
                            var11 = 2000;
                        }
                        if (Statics.field1358.field48 != 0 && arg0.field48 != 0) {
                            if (Statics.field1358.field48 == arg0.field48) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field277[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field388[var10] + var11;
                    method1873(field389[var10], class2.method2316(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field157 & 0x8) == 8) {
            method1873(field349, field420 + " " + class2.field26 + " " + class2.method2316(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field402; var14++) {
            if (field405[var14] == 23) {
                field345[var14] = class2.method2316(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("l.cf(IIIIIIIIB)V")
    public static final void method33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class157.method764(arg0)) {
            Statics.field143 = null;
            method626(Statics.field2599[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field143 != null) {
                method626(Statics.field143, -1412584499, arg1, arg2, arg3, arg4, Statics.field618, Statics.field35, arg7);
                Statics.field143 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field467[var8] = true;
            }
        } else {
            field467[arg7] = true;
        }
    }

    @ObfuscatedName("aq.co([Lft;IIIIIIIII)V")
    public static final void method626(class157[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class74.method1514(arg2, arg3, arg4, arg5);
        class85.method1769();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class157 var10 = arg0[var9];
            if (var10 != null && (var10.field2587 == arg1 || arg1 == -1412584499 && field433 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field257[field465] = var10.field2576 + arg6;
                    field471[field465] = var10.field2688 + arg7;
                    field472[field465] = var10.field2580;
                    field473[field465] = var10.field2581;
                    var11 = ++field465 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2689 = var11;
                var10.field2687 = field266;
                if (!var10.field2595 || !method17(var10)) {
                    if (var10.field2575 > 0) {
                        method1872(var10);
                    }
                    int var12 = var10.field2576 + arg6;
                    int var13 = var10.field2688 + arg7;
                    int var14 = var10.field2593;
                    if (field433 == var10) {
                        if (arg1 != -1412584499 && !var10.field2637) {
                            Statics.field143 = arg0;
                            Statics.field618 = arg6;
                            Statics.field35 = arg7;
                            continue;
                        }
                        if (field444 && field282) {
                            int var15 = class131.field2030;
                            int var16 = class131.field2031 * -778357537;
                            int var17 = var15 - field435;
                            int var18 = var16 - field436;
                            if (var17 < field439) {
                                var17 = field439;
                            }
                            if (var10.field2580 + var17 > field439 + field458.field2580) {
                                var17 = field439 + field458.field2580 - var10.field2580;
                            }
                            if (var18 < field440) {
                                var18 = field440;
                            }
                            if (var10.field2581 + var18 > field440 + field458.field2581) {
                                var18 = field440 + field458.field2581 - var10.field2581;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2637) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2573 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2573 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2580 + var12;
                        int var26 = var10.field2581 + var13;
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
                        int var29 = var10.field2580 + var12;
                        int var30 = var10.field2581 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2595 || var19 < var21 && var20 < var22) {
                        if (var10.field2575 != 0) {
                            if (var10.field2575 == 1337) {
                                field409 = var12;
                                field410 = var13;
                                int var31 = var10.field2580;
                                int var32 = var10.field2581;
                                class74.method1514(var12, var13, var12 + var31, var13 + var32);
                                class85.method1769();
                                field362++;
                                method1848(class30.field692);
                                boolean var33 = false;
                                if (field469 >= 0) {
                                    for (int var34 = 0; var34 < field379; var34++) {
                                        if (field469 == field380[var34]) {
                                            var33 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var33) {
                                    method1848(class30.field700);
                                }
                                method561(true);
                                method1848(var33 ? class30.field694 : class30.field693);
                                method561(false);
                                method22();
                                for (class27 var35 = (class27) field396.method3251(); var35 != null; var35 = (class27) field396.method3261()) {
                                    if (Statics.field572 != var35.field629 || var35.field636) {
                                        var35.method3343();
                                    } else if (field266 >= var35.field628) {
                                        var35.method555(field431);
                                        if (var35.field636) {
                                            var35.method3343();
                                        } else {
                                            Statics.field2947.method1603(var35.field629, var35.field632, var35.field631, var35.field627, 60, var35, 0, -1, false);
                                        }
                                    }
                                }
                                if (!field500) {
                                    int var36 = field335;
                                    if (field390 / 256 > var36) {
                                        var36 = field390 / 256;
                                    }
                                    if (field508[4] && field510[4] + 128 > var36) {
                                        var36 = field510[4] + 128;
                                    }
                                    int var37 = field443 + field300 & 0x7FF;
                                    int var38 = Statics.field230;
                                    int var39 = method1875(Statics.field1358.field793, Statics.field1358.field736, Statics.field572) - 50;
                                    int var40 = Statics.field162;
                                    int var41 = var36 * 3 + 600;
                                    int var42 = 2048 - var36 & 0x7FF;
                                    int var43 = 2048 - var37 & 0x7FF;
                                    int var44 = 0;
                                    int var45 = 0;
                                    int var46 = var41;
                                    if (var42 != 0) {
                                        int var47 = class85.field1482[var42];
                                        int var48 = class85.field1483[var42];
                                        int var49 = var45 * var48 - var41 * var47 >> 16;
                                        var46 = var45 * var47 + var41 * var48 >> 16;
                                        var45 = var49;
                                    }
                                    if (var43 != 0) {
                                        int var50 = class85.field1482[var43];
                                        int var51 = class85.field1483[var43];
                                        int var52 = var44 * var51 + var46 * var50 >> 16;
                                        var46 = var46 * var51 - var44 * var50 >> 16;
                                        var44 = var52;
                                    }
                                    Statics.field635 = var38 - var44;
                                    Statics.field145 = var39 - var45;
                                    Statics.field2561 = var40 - var46;
                                    Statics.field968 = var36;
                                    Statics.field1909 = var37;
                                }
                                int var65;
                                if (field500) {
                                    int var66;
                                    if (Statics.field101.field142) {
                                        var66 = Statics.field572;
                                    } else {
                                        int var67 = method1875(Statics.field635, Statics.field2561, Statics.field572);
                                        if (var67 - Statics.field145 >= 800 || (class6.field76[Statics.field572][Statics.field635 >> 7][Statics.field2561 >> 7] & 0x4) == 0) {
                                            var66 = 3;
                                        } else {
                                            var66 = Statics.field572;
                                        }
                                    }
                                    var65 = var66;
                                } else {
                                    int var53;
                                    if (Statics.field101.field142) {
                                        var53 = Statics.field572;
                                    } else {
                                        int var54 = 3;
                                        if (Statics.field968 < 310) {
                                            int var55 = Statics.field635 >> 7;
                                            int var56 = Statics.field2561 >> 7;
                                            int var57 = Statics.field1358.field793 >> 7;
                                            int var58 = Statics.field1358.field736 >> 7;
                                            if ((class6.field76[Statics.field572][var55][var56] & 0x4) != 0) {
                                                var54 = Statics.field572;
                                            }
                                            int var59;
                                            if (var57 > var55) {
                                                var59 = var57 - var55;
                                            } else {
                                                var59 = var55 - var57;
                                            }
                                            int var60;
                                            if (var58 > var56) {
                                                var60 = var58 - var56;
                                            } else {
                                                var60 = var56 - var58;
                                            }
                                            if (var59 > var60) {
                                                int var61 = var60 * 65536 / var59;
                                                int var62 = 32768;
                                                while (var55 != var57) {
                                                    if (var55 < var57) {
                                                        var55++;
                                                    } else if (var55 > var57) {
                                                        var55--;
                                                    }
                                                    if ((class6.field76[Statics.field572][var55][var56] & 0x4) != 0) {
                                                        var54 = Statics.field572;
                                                    }
                                                    var62 += var61;
                                                    if (var62 >= 65536) {
                                                        var62 -= 65536;
                                                        if (var56 < var58) {
                                                            var56++;
                                                        } else if (var56 > var58) {
                                                            var56--;
                                                        }
                                                        if ((class6.field76[Statics.field572][var55][var56] & 0x4) != 0) {
                                                            var54 = Statics.field572;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var63 = var59 * 65536 / var60;
                                                int var64 = 32768;
                                                while (var56 != var58) {
                                                    if (var56 < var58) {
                                                        var56++;
                                                    } else if (var56 > var58) {
                                                        var56--;
                                                    }
                                                    if ((class6.field76[Statics.field572][var55][var56] & 0x4) != 0) {
                                                        var54 = Statics.field572;
                                                    }
                                                    var64 += var63;
                                                    if (var64 >= 65536) {
                                                        var64 -= 65536;
                                                        if (var55 < var57) {
                                                            var55++;
                                                        } else if (var55 > var57) {
                                                            var55--;
                                                        }
                                                        if ((class6.field76[Statics.field572][var55][var56] & 0x4) != 0) {
                                                            var54 = Statics.field572;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class6.field76[Statics.field572][Statics.field1358.field793 >> 7][Statics.field1358.field736 >> 7] & 0x4) != 0) {
                                            var54 = Statics.field572;
                                        }
                                        var53 = var54;
                                    }
                                    var65 = var53;
                                }
                                int var68 = Statics.field635;
                                int var69 = Statics.field145;
                                int var70 = Statics.field2561;
                                int var71 = Statics.field968;
                                int var72 = Statics.field1909;
                                for (int var73 = 0; var73 < 5; var73++) {
                                    if (field508[var73]) {
                                        int var74 = (int) (Math.random() * (double) (field509[var73] * 2 + 1) - (double) field509[var73] + Math.sin((double) field511[var73] / 100.0D * (double) field445[var73]) * (double) field510[var73]);
                                        if (var73 == 0) {
                                            Statics.field635 += var74;
                                        }
                                        if (var73 == 1) {
                                            Statics.field145 += var74;
                                        }
                                        if (var73 == 2) {
                                            Statics.field2561 += var74;
                                        }
                                        if (var73 == 3) {
                                            Statics.field1909 = Statics.field1909 + var74 & 0x7FF;
                                        }
                                        if (var73 == 4) {
                                            Statics.field968 += var74;
                                            if (Statics.field968 < 128) {
                                                Statics.field968 = 128;
                                            }
                                            if (Statics.field968 > 383) {
                                                Statics.field968 = 383;
                                            }
                                        }
                                    }
                                }
                                int var75 = class131.field2030;
                                int var76 = class131.field2031 * -778357537;
                                if (class131.field2036 != 0) {
                                    var75 = class131.field2024;
                                    var76 = class131.field2026;
                                }
                                if (var75 >= var12 && var75 < var12 + var31 && var76 >= var13 && var76 < var13 + var32) {
                                    class99.field1743 = true;
                                    class99.field1754 = 0;
                                    class99.field1752 = var75 - var12;
                                    class99.field1713 = var76 - var13;
                                } else {
                                    class99.field1743 = false;
                                    class99.field1754 = 0;
                                }
                                method537();
                                class74.method1520(var12, var13, var31, var32, 0);
                                method537();
                                Statics.field2947.method1630(Statics.field635, Statics.field145, Statics.field2561, Statics.field968, Statics.field1909, var65);
                                method537();
                                Statics.field2947.method1606();
                                method852(var12, var13, var31, var32);
                                if (field470 == 2) {
                                    method2847((field278 - Statics.field1935 << 7) + field375, (field279 - Statics.field1820 << 7) + field350, field280 * 2);
                                    if (field363 > -1 && field266 % 20 < 10) {
                                        Statics.field1655[0].method1503(field363 + var12 - 12, field253 + var13 - 28);
                                    }
                                }
                                ((class89) Statics.field1479).method1856(field431);
                                method177(var12, var13, var31, var32);
                                Statics.field635 = var68;
                                Statics.field145 = var69;
                                Statics.field2561 = var70;
                                Statics.field968 = var71;
                                Statics.field1909 = var72;
                                if (field265) {
                                    byte var77 = 0;
                                    int var78 = class155.field2539 + class155.field2537 + var77;
                                    if (var78 == 0) {
                                        field265 = false;
                                    }
                                }
                                if (field265) {
                                    class74.method1520(var12, var13, var31, var32, 0);
                                    method1874(class147.field2285, false);
                                }
                                class74.method1514(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2575 == 1338) {
                                method537();
                                class74.method1514(var12, var13, Statics.field578.field1328 + var12, Statics.field578.field1327 + var13);
                                if (field494 == 2 || field494 == 5) {
                                    class74.method1561(var12 + 25, var13 + 5, 0, Statics.field1880, Statics.field1124);
                                } else {
                                    int var80 = field443 + field330 & 0x7FF;
                                    int var81 = Statics.field1358.field793 / 32 + 48;
                                    int var82 = 464 - Statics.field1358.field736 / 32;
                                    Statics.field1764.method1438(var12 + 25, var13 + 5, 146, 151, var81, var82, var80, field332 + 256, Statics.field1880, Statics.field1124);
                                    for (int var83 = 0; var83 < field416; var83++) {
                                        int var84 = field489[var83] * 4 + 2 - Statics.field1358.field793 / 32;
                                        int var85 = field490[var83] * 4 + 2 - Statics.field1358.field736 / 32;
                                        method1869(var12, var13, var84, var85, field491[var83]);
                                    }
                                    for (int var86 = 0; var86 < 104; var86++) {
                                        for (int var87 = 0; var87 < 104; var87++) {
                                            class182 var88 = field393[Statics.field572][var86][var87];
                                            if (var88 != null) {
                                                int var89 = var86 * 4 + 2 - Statics.field1358.field793 / 32;
                                                int var90 = var87 * 4 + 2 - Statics.field1358.field736 / 32;
                                                method1869(var12, var13, var89, var90, Statics.field2844[0]);
                                            }
                                        }
                                    }
                                    for (int var91 = 0; var91 < field298; var91++) {
                                        class31 var92 = field464[field299[var91]];
                                        if (var92 != null && var92.method15()) {
                                            class36 var93 = var92.field707;
                                            if (var93 != null && var93.field833 != null) {
                                                var93 = var93.method635();
                                            }
                                            if (var93 != null && var93.field824 && var93.field836) {
                                                int var94 = var92.field793 / 32 - Statics.field1358.field793 / 32;
                                                int var95 = var92.field736 / 32 - Statics.field1358.field736 / 32;
                                                method1869(var12, var13, var94, var95, Statics.field2844[1]);
                                            }
                                        }
                                    }
                                    for (int var96 = 0; var96 < field379; var96++) {
                                        class3 var97 = field378[field380[var96]];
                                        if (var97 != null && var97.method15() && !var97.field31) {
                                            int var98 = var97.field793 / 32 - Statics.field1358.field793 / 32;
                                            int var99 = var97.field736 / 32 - Statics.field1358.field736 / 32;
                                            boolean var100 = false;
                                            if (method38(var97.field37, true)) {
                                                var100 = true;
                                            }
                                            boolean var101 = false;
                                            for (int var102 = 0; var102 < Statics.field1672; var102++) {
                                                if (var97.field37.equals(Statics.field225[var102].field576)) {
                                                    var101 = true;
                                                    break;
                                                }
                                            }
                                            boolean var103 = false;
                                            if (Statics.field1358.field48 != 0 && var97.field48 != 0 && Statics.field1358.field48 == var97.field48) {
                                                var103 = true;
                                            }
                                            if (var100) {
                                                method1869(var12, var13, var98, var99, Statics.field2844[3]);
                                            } else if (var103) {
                                                method1869(var12, var13, var98, var99, Statics.field2844[4]);
                                            } else if (var101) {
                                                method1869(var12, var13, var98, var99, Statics.field2844[5]);
                                            } else {
                                                method1869(var12, var13, var98, var99, Statics.field2844[2]);
                                            }
                                        }
                                    }
                                    if (field470 != 0 && field266 % 20 < 10) {
                                        if (field470 == 1 && field276 >= 0 && field276 < field464.length) {
                                            class31 var104 = field464[field276];
                                            if (var104 != null) {
                                                int var105 = var104.field793 / 32 - Statics.field1358.field793 / 32;
                                                int var106 = var104.field736 / 32 - Statics.field1358.field736 / 32;
                                                method1583(var12, var13, var105, var106, Statics.field2016[1]);
                                            }
                                        }
                                        if (field470 == 2) {
                                            int var107 = field278 * 4 - Statics.field1935 * 4 + 2 - Statics.field1358.field793 / 32;
                                            int var108 = field279 * 4 - Statics.field1820 * 4 + 2 - Statics.field1358.field736 / 32;
                                            method1583(var12, var13, var107, var108, Statics.field2016[1]);
                                        }
                                        if (field470 == 10 && field326 >= 0 && field326 < field378.length) {
                                            class3 var109 = field378[field326];
                                            if (var109 != null) {
                                                int var110 = var109.field793 / 32 - Statics.field1358.field793 / 32;
                                                int var111 = var109.field736 / 32 - Statics.field1358.field736 / 32;
                                                method1583(var12, var13, var110, var111, Statics.field2016[1]);
                                            }
                                        }
                                    }
                                    if (field492 != 0) {
                                        int var112 = field492 * 4 + 2 - Statics.field1358.field793 / 32;
                                        int var113 = field325 * 4 + 2 - Statics.field1358.field736 / 32;
                                        method1869(var12, var13, var112, var113, Statics.field2016[0]);
                                    }
                                    if (!Statics.field1358.field31) {
                                        class74.method1520(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                    }
                                }
                                if (field494 < 3) {
                                    Statics.field121.method1438(var12, var13, 33, 33, 25, 25, field443, 256, Statics.field27, Statics.field580);
                                } else {
                                    class74.method1561(var12, var13, 0, Statics.field27, Statics.field580);
                                }
                                if (field454[var11]) {
                                    Statics.field578.method1573(var12, var13);
                                }
                                field468[var11] = true;
                                class74.method1514(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2573 == 0) {
                            if (!var10.field2595 && method17(var10) && Statics.field411 != var10) {
                                continue;
                            }
                            if (!var10.field2595) {
                                if (var10.field2585 > var10.field2577 - var10.field2581) {
                                    var10.field2585 = var10.field2577 - var10.field2581;
                                }
                                if (var10.field2585 < 0) {
                                    var10.field2585 = 0;
                                }
                            }
                            method626(arg0, var10.field2649, var19, var20, var21, var22, var12 - var10.field2586, var13 - var10.field2585, var11);
                            if (var10.field2682 != null) {
                                method626(var10.field2682, var10.field2649, var19, var20, var21, var22, var12 - var10.field2586, var13 - var10.field2585, var11);
                            }
                            class4 var114 = (class4) field422.method3231((long) var10.field2649);
                            if (var114 != null) {
                                method33(var114.field63, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class74.method1514(arg2, arg3, arg4, arg5);
                            class85.method1769();
                        }
                        if (field454[var11] || field474 > 1) {
                            if (var10.field2573 == 0 && !var10.field2595 && var10.field2577 > var10.field2581) {
                                method137(var10.field2580 + var12, var13, var10.field2585, var10.field2581, var10.field2577);
                            }
                            if (var10.field2573 != 1) {
                                if (var10.field2573 == 2) {
                                    int var115 = 0;
                                    for (int var116 = 0; var116 < var10.field2581; var116++) {
                                        for (int var117 = 0; var117 < var10.field2580; var117++) {
                                            int var118 = (var10.field2602 + 32) * var117 + var12;
                                            int var119 = (var10.field2626 + 32) * var116 + var13;
                                            if (var115 < 20) {
                                                var118 += var10.field2627[var115];
                                                var119 += var10.field2628[var115];
                                            }
                                            if (var10.field2676[var115] > 0) {
                                                boolean var120 = false;
                                                boolean var121 = false;
                                                int var122 = var10.field2676[var115] - 1;
                                                if (var118 + 32 > arg2 && var118 < arg4 && var119 + 32 > arg3 && var119 < arg5 || Statics.field185 == var10 && field371 == var115) {
                                                    class73 var123;
                                                    if (field297 == 1 && Statics.field28 == var115 && Statics.field1836 == var10.field2649) {
                                                        var123 = class46.method609(var122, var10.field2612[var115], 2, 0, 2, false);
                                                    } else {
                                                        var123 = class46.method609(var122, var10.field2612[var115], 1, 3153952, 2, false);
                                                    }
                                                    if (var123 == null) {
                                                        method1372(var10);
                                                    } else if (Statics.field185 == var10 && field371 == var115) {
                                                        int var124 = class131.field2030 - field342;
                                                        int var125 = class131.field2031 * -778357537 - field275;
                                                        if (var124 < 5 && var124 > -5) {
                                                            var124 = 0;
                                                        }
                                                        if (var125 < 5 && var125 > -5) {
                                                            var125 = 0;
                                                        }
                                                        if (field343 < 5) {
                                                            var124 = 0;
                                                            var125 = 0;
                                                        }
                                                        var123.method1471(var118 + var124, var119 + var125, 128);
                                                        if (arg1 != -1) {
                                                            class157 var126 = arg0[arg1 & 0xFFFF];
                                                            if (var119 + var125 < class74.field1321 && var126.field2585 > 0) {
                                                                int var127 = field431 * (class74.field1321 - var119 - var125) / 3;
                                                                if (var127 > field431 * 10) {
                                                                    var127 = field431 * 10;
                                                                }
                                                                if (var127 > var126.field2585) {
                                                                    var127 = var126.field2585;
                                                                }
                                                                var126.field2585 -= var127;
                                                                field275 += var127;
                                                                method1372(var126);
                                                            }
                                                            if (var119 + var125 + 32 > class74.field1319 && var126.field2585 < var126.field2577 - var126.field2581) {
                                                                int var128 = field431 * (var119 + var125 + 32 - class74.field1319) / 3;
                                                                if (var128 > field431 * 10) {
                                                                    var128 = field431 * 10;
                                                                }
                                                                if (var128 > var126.field2577 - var126.field2581 - var126.field2585) {
                                                                    var128 = var126.field2577 - var126.field2581 - var126.field2585;
                                                                }
                                                                var126.field2585 += var128;
                                                                field275 -= var128;
                                                                method1372(var126);
                                                            }
                                                        }
                                                    } else if (Statics.field582 == var10 && field370 == var115) {
                                                        var123.method1471(var118, var119, 128);
                                                    } else {
                                                        var123.method1503(var118, var119);
                                                    }
                                                }
                                            } else if (var10.field2582 != null && var115 < 20) {
                                                class73 var129 = var10.method2857(var115);
                                                if (var129 != null) {
                                                    var129.method1503(var118, var119);
                                                } else if (class157.field2569) {
                                                    method1372(var10);
                                                }
                                            }
                                            var115++;
                                        }
                                    }
                                } else if (var10.field2573 == 3) {
                                    int var130;
                                    if (method26(var10)) {
                                        var130 = var10.field2636;
                                        if (Statics.field411 == var10 && var10.field2584 != 0) {
                                            var130 = var10.field2584;
                                        }
                                    } else {
                                        var130 = var10.field2588;
                                        if (Statics.field411 == var10 && var10.field2631 != 0) {
                                            var130 = var10.field2631;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2592) {
                                            class74.method1520(var12, var13, var10.field2580, var10.field2581, var130);
                                        } else {
                                            class74.method1522(var12, var13, var10.field2580, var10.field2581, var130);
                                        }
                                    } else if (var10.field2592) {
                                        class74.method1519(var12, var13, var10.field2580, var10.field2581, var130, 256 - (var14 & 0xFF));
                                    } else {
                                        class74.method1559(var12, var13, var10.field2580, var10.field2581, var130, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2573 == 4) {
                                    class207 var131 = var10.method2864();
                                    if (var131 != null) {
                                        String var132 = var10.field2619;
                                        int var133;
                                        if (method26(var10)) {
                                            var133 = var10.field2636;
                                            if (Statics.field411 == var10 && var10.field2584 != 0) {
                                                var133 = var10.field2584;
                                            }
                                            if (var10.field2620.length() > 0) {
                                                var132 = var10.field2620;
                                            }
                                        } else {
                                            var133 = var10.field2588;
                                            if (Statics.field411 == var10 && var10.field2631 != 0) {
                                                var133 = var10.field2631;
                                            }
                                        }
                                        if (var10.field2595 && var10.field2678 != -1) {
                                            class46 var134 = class46.method740(var10.field2678);
                                            var132 = var134.field1024;
                                            if (var132 == null) {
                                                var132 = "null";
                                            }
                                            if ((var134.field1032 == 1 || var10.field2679 != 1) && var10.field2679 != -1) {
                                                var132 = class2.method2316(16748608) + var132 + class2.field21 + " " + 'x' + method924(var10.field2679);
                                            }
                                        }
                                        if (field425 == var10) {
                                            class147 var10000 = (class147) null;
                                            var132 = class147.field2357;
                                            var133 = var10.field2588;
                                        }
                                        if (!var10.field2595) {
                                            var132 = method510(var132, var10);
                                        }
                                        var131.method3451(var132, var12, var13, var10.field2580, var10.field2581, var133, var10.field2624 ? 0 : -1, var10.field2622, var10.field2606, var10.field2621);
                                    } else if (class157.field2569) {
                                        method1372(var10);
                                    }
                                } else if (var10.field2573 == 5) {
                                    if (var10.field2595) {
                                        class73 var136;
                                        if (var10.field2678 == -1) {
                                            var136 = var10.method2863(false);
                                        } else {
                                            var136 = class46.method609(var10.field2678, var10.field2679, var10.field2690, var10.field2600, var10.field2681, false);
                                        }
                                        if (var136 != null) {
                                            int var137 = var136.field1311;
                                            int var138 = var136.field1312;
                                            if (var10.field2598) {
                                                class74.method1515(var12, var13, var10.field2580 + var12, var10.field2581 + var13);
                                                int var139 = (var10.field2580 + (var137 - 1)) / var137;
                                                int var140 = (var10.field2581 + (var138 - 1)) / var138;
                                                for (int var141 = 0; var141 < var139; var141++) {
                                                    for (int var142 = 0; var142 < var140; var142++) {
                                                        if (var10.field2597 != 0) {
                                                            var136.method1447(var137 / 2 + var137 * var141 + var12, var138 / 2 + var138 * var142 + var13, var10.field2597, 4096);
                                                        } else if (var14 == 0) {
                                                            var136.method1503(var137 * var141 + var12, var138 * var142 + var13);
                                                        } else {
                                                            var136.method1471(var137 * var141 + var12, var138 * var142 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class74.method1514(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var143 = var10.field2580 * 4096 / var137;
                                                if (var10.field2597 != 0) {
                                                    var136.method1447(var10.field2580 / 2 + var12, var10.field2581 / 2 + var13, var10.field2597, var143);
                                                } else if (var14 != 0) {
                                                    var136.method1436(var12, var13, var10.field2580, var10.field2581, 256 - (var14 & 0xFF));
                                                } else if (var10.field2580 == var137 && var10.field2581 == var138) {
                                                    var136.method1503(var12, var13);
                                                } else {
                                                    var136.method1431(var12, var13, var10.field2580, var10.field2581);
                                                }
                                            }
                                        } else if (class157.field2569) {
                                            method1372(var10);
                                        }
                                    } else {
                                        class73 var135 = var10.method2863(method26(var10));
                                        if (var135 != null) {
                                            var135.method1503(var12, var13);
                                        } else if (class157.field2569) {
                                            method1372(var10);
                                        }
                                    }
                                } else if (var10.field2573 == 6) {
                                    boolean var144 = method26(var10);
                                    int var145;
                                    if (var144) {
                                        var145 = var10.field2608;
                                    } else {
                                        var145 = var10.field2607;
                                    }
                                    class99 var146 = null;
                                    int var147 = 0;
                                    if (var10.field2678 != -1) {
                                        class46 var148 = class46.method740(var10.field2678);
                                        if (var148 != null) {
                                            class46 var149 = var148.method869(var10.field2679);
                                            var146 = var149.method868(1);
                                            if (var146 == null) {
                                                method1372(var10);
                                            } else {
                                                var146.method1980();
                                                var147 = var146.field1356 / 2;
                                            }
                                        }
                                    } else if (var10.field2657 == 5) {
                                        if (var10.field2604 == 0) {
                                            var146 = field519.method2935((class39) null, -1, (class39) null, -1);
                                        } else {
                                            var146 = Statics.field1358.method24();
                                        }
                                    } else if (var145 == -1) {
                                        var146 = var10.method2860((class39) null, -1, var144, Statics.field1358.field42);
                                        if (var146 == null && class157.field2569) {
                                            method1372(var10);
                                        }
                                    } else {
                                        class39 var150 = Statics.method97(var145);
                                        var146 = var10.method2860(var150, var10.field2662, var144, Statics.field1358.field42);
                                        if (var146 == null && class157.field2569) {
                                            method1372(var10);
                                        }
                                    }
                                    class85.method1816(var10.field2580 / 2 + var12, var10.field2581 / 2 + var13);
                                    int var151 = var10.field2614 * class85.field1482[var10.field2611] >> 16;
                                    int var152 = var10.field2614 * class85.field1483[var10.field2611] >> 16;
                                    if (var146 != null) {
                                        if (var10.field2595) {
                                            var146.method1980();
                                            if (var10.field2685) {
                                                var146.method2014(0, var10.field2680, var10.field2613, var10.field2611, var10.field2609, var10.field2610 + var147 + var151, var10.field2610 + var152, var10.field2614);
                                            } else {
                                                var146.method1976(0, var10.field2680, var10.field2613, var10.field2611, var10.field2609, var10.field2610 + var147 + var151, var10.field2610 + var152);
                                            }
                                        } else {
                                            var146.method1976(0, var10.field2680, 0, var10.field2611, 0, var151, var152);
                                        }
                                    }
                                    class85.method1829();
                                } else {
                                    if (var10.field2573 == 7) {
                                        class207 var153 = var10.method2864();
                                        if (var153 == null) {
                                            if (class157.field2569) {
                                                method1372(var10);
                                            }
                                            continue;
                                        }
                                        int var154 = 0;
                                        for (int var155 = 0; var155 < var10.field2581; var155++) {
                                            for (int var156 = 0; var156 < var10.field2580; var156++) {
                                                if (var10.field2676[var154] > 0) {
                                                    class46 var157 = class46.method740(var10.field2676[var154] - 1);
                                                    String var158;
                                                    if (var157.field1032 != 1 && var10.field2612[var154] == 1) {
                                                        var158 = class2.method2316(16748608) + var157.field1024 + class2.field21;
                                                    } else {
                                                        var158 = class2.method2316(16748608) + var157.field1024 + class2.field21 + " " + 'x' + method924(var10.field2612[var154]);
                                                    }
                                                    int var159 = (var10.field2602 + 115) * var156 + var12;
                                                    int var160 = (var10.field2626 + 12) * var155 + var13;
                                                    if (var10.field2622 == 0) {
                                                        var153.method3522(var158, var159, var160, var10.field2588, var10.field2624 ? 0 : -1);
                                                    } else if (var10.field2622 == 1) {
                                                        var153.method3450(var158, var10.field2580 / 2 + var159, var160, var10.field2588, var10.field2624 ? 0 : -1);
                                                    } else {
                                                        var153.method3459(var158, var10.field2580 + var159 - 1, var160, var10.field2588, var10.field2624 ? 0 : -1);
                                                    }
                                                }
                                                var154++;
                                            }
                                        }
                                    }
                                    if (var10.field2573 == 8 && Statics.field892 == var10 && field507 == field412) {
                                        int var161 = 0;
                                        int var162 = 0;
                                        class207 var163 = Statics.field11;
                                        String var164 = var10.field2619;
                                        String var165 = method510(var164, var10);
                                        while (var165.length() > 0) {
                                            int var166 = var165.indexOf(class2.field20);
                                            String var167;
                                            if (var166 == -1) {
                                                var167 = var165;
                                                var165 = "";
                                            } else {
                                                var167 = var165.substring(0, var166);
                                                var165 = var165.substring(var166 + 4);
                                            }
                                            int var168 = var163.method3443(var167);
                                            if (var168 > var161) {
                                                var161 = var168;
                                            }
                                            var162 += var163.field2983 + 1;
                                        }
                                        var161 += 6;
                                        var162 += 7;
                                        int var169 = var10.field2580 + var12 - 5 - var161;
                                        int var170 = var10.field2581 + var13 + 5;
                                        if (var169 < var12 + 5) {
                                            var169 = var12 + 5;
                                        }
                                        if (var161 + var169 > arg4) {
                                            var169 = arg4 - var161;
                                        }
                                        if (var162 + var170 > arg5) {
                                            var170 = arg5 - var162;
                                        }
                                        class74.method1520(var169, var170, var161, var162, 16777120);
                                        class74.method1522(var169, var170, var161, var162, 0);
                                        String var171 = var10.field2619;
                                        int var172 = var163.field2983 + var170 + 2;
                                        String var173 = method510(var171, var10);
                                        while (var173.length() > 0) {
                                            int var174 = var173.indexOf(class2.field20);
                                            String var175;
                                            if (var174 == -1) {
                                                var175 = var173;
                                                var173 = "";
                                            } else {
                                                var175 = var173.substring(0, var174);
                                                var173 = var173.substring(var174 + 4);
                                            }
                                            var163.method3522(var175, var169 + 3, var172, 0, -1);
                                            var172 += var163.field2983 + 1;
                                        }
                                    }
                                    if (var10.field2573 == 9) {
                                        if (var10.field2594 == 1) {
                                            class74.method1538(var12, var13, var10.field2580 + var12, var10.field2581 + var13, var10.field2588);
                                        } else {
                                            int var176 = var10.field2580 >= 0 ? var10.field2580 : -var10.field2580;
                                            int var177 = var10.field2581 >= 0 ? var10.field2581 : -var10.field2581;
                                            int var178 = var176;
                                            if (var176 < var177) {
                                                var178 = var177;
                                            }
                                            if (var178 != 0) {
                                                int var179 = (var10.field2580 << 16) / var178;
                                                int var180 = (var10.field2581 << 16) / var178;
                                                if (var180 <= var179) {
                                                    var179 = -var179;
                                                } else {
                                                    var180 = -var180;
                                                }
                                                int var181 = var10.field2594 * var180 >> 17;
                                                int var182 = var10.field2594 * var180 + 1 >> 17;
                                                int var183 = var10.field2594 * var179 >> 17;
                                                int var184 = var10.field2594 * var179 + 1 >> 17;
                                                int var185 = var12 + var181;
                                                int var186 = var12 - var182;
                                                int var187 = var10.field2580 + var12 - var182;
                                                int var188 = var10.field2580 + var12 + var181;
                                                int var189 = var13 + var183;
                                                int var190 = var13 - var184;
                                                int var191 = var10.field2581 + var13 - var184;
                                                int var192 = var10.field2581 + var13 + var183;
                                                class85.method1777(var185, var186, var187);
                                                class85.method1809(var189, var190, var191, var185, var186, var187, var10.field2588);
                                                class85.method1777(var185, var187, var188);
                                                class85.method1809(var189, var191, var192, var185, var187, var188, var10.field2588);
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

    @ObfuscatedName("j.cj(Ljava/lang/String;Lft;I)Ljava/lang/String;")
    public static String method510(String arg0, class157 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method90(method2837(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field732 != null) {
                    var5 = class213.method2400(Statics.field732.field2099);
                    if (Statics.field732.field2097 != null) {
                        var5 = (String) Statics.field732.field2097;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("aj.cd(IB)Ljava/lang/String;")
    public static final String method924(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field23 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2316(65408) + var1.substring(0, var1.length() - 8) + class147.field2182 + " " + class2.field17 + var1 + class2.field18 + class2.field21;
        } else if (var1.length() > 6) {
            return " " + class2.method2316(16777215) + var1.substring(0, var1.length() - 4) + class147.field2327 + " " + class2.field17 + var1 + class2.field18 + class2.field21;
        } else {
            return " " + class2.method2316(16776960) + var1 + class2.field21;
        }
    }

    @ObfuscatedName("f.cb(IIIIII)V")
    public static final void method137(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1962[0].method1573(arg0, arg1);
        Statics.field1962[1].method1573(arg0, arg1 + arg3 - 16);
        class74.method1520(arg0, arg1 + 16, 16, arg3 - 32, field355);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class74.method1520(arg0, arg1 + 16 + var6, 16, var5, field264);
        class74.method1526(arg0, arg1 + 16 + var6, var5, field339);
        class74.method1526(arg0 + 1, arg1 + 16 + var6, var5, field339);
        class74.method1524(arg0, arg1 + 16 + var6, 16, field339);
        class74.method1524(arg0, arg1 + 17 + var6, 16, field339);
        class74.method1526(arg0 + 15, arg1 + 16 + var6, var5, field382);
        class74.method1526(arg0 + 14, arg1 + 17 + var6, var5 - 1, field382);
        class74.method1524(arg0, arg1 + 15 + var6 + var5, 16, field382);
        class74.method1524(arg0 + 1, arg1 + 14 + var6 + var5, 15, field382);
    }

    @ObfuscatedName("w.ch(II)Ljava/lang/String;")
    public static final String method90(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("i.cn(Lft;I)Z")
    public static final boolean method26(class157 arg0) {
        if (arg0.field2671 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2671.length; var1++) {
            int var2 = method2837(arg0, var1);
            int var3 = arg0.field2672[var1];
            if (arg0.field2671[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2671[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2671[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ez.cp(Lft;IB)I")
    public static final int method2837(class157 arg0, int arg1) {
        if (arg0.field2670 == null || arg1 >= arg0.field2670.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2670[arg1];
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
                    var7 = field398[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field399[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class157 var11 = class157.method1871(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class46.method740(var12).field1014 || field261)) {
                        for (int var13 = 0; var13 < var11.field2676.length; var13++) {
                            if (var12 + 1 == var11.field2676[var13]) {
                                var7 += var11.field2612[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class159.field2701[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class145.field2168[field398[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class159.field2701[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1358.field34;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class145.field2169[var14]) {
                            var7 += field398[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class157 var17 = class157.method1871(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class46.method740(var18).field1014 || field261)) {
                        for (int var19 = 0; var19 < var17.field2676.length; var19++) {
                            if (var18 + 1 == var17.field2676[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field437;
                }
                if (var6 == 12) {
                    var7 = field427;
                }
                if (var6 == 13) {
                    int var20 = class159.field2701[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class159.method2538(var22);
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
                    var7 = (Statics.field1358.field793 >> 7) + Statics.field1935;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1358.field736 >> 7) + Statics.field1820;
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

    @ObfuscatedName("o.ck(Lft;IIB)V")
    public static final void method172(class157 arg0, int arg1, int arg2) {
        if (arg0.field2574 == 1) {
            method1873(arg0.field2675, "", 24, 0, 0, arg0.field2649);
        }
        if (arg0.field2574 == 2 && !field497) {
            String var3 = method2070(arg0);
            if (var3 != null) {
                method1873(var3, class2.method2316(65280) + arg0.field2674, 25, 0, -1, arg0.field2649);
            }
        }
        if (arg0.field2574 == 3) {
            method1873(class147.field2340, "", 26, 0, 0, arg0.field2649);
        }
        if (arg0.field2574 == 4) {
            method1873(arg0.field2675, "", 28, 0, 0, arg0.field2649);
        }
        if (arg0.field2574 == 5) {
            method1873(arg0.field2675, "", 29, 0, 0, arg0.field2649);
        }
        if (arg0.field2574 == 6 && field425 == null) {
            method1873(arg0.field2675, "", 30, 0, -1, arg0.field2649);
        }
        if (arg0.field2573 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2581; var5++) {
                for (int var6 = 0; var6 < arg0.field2580; var6++) {
                    int var7 = (arg0.field2602 + 32) * var6;
                    int var8 = (arg0.field2626 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2627[var4];
                        var8 += arg0.field2628[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field374 = var4;
                        Statics.field1354 = arg0;
                        if (arg0.field2676[var4] > 0) {
                            class46 var9 = class46.method740(arg0.field2676[var4] - 1);
                            if (field297 != 1 || !class161.method2074(method34(arg0))) {
                                label322: {
                                    if (field497) {
                                        int var10 = method34(arg0);
                                        boolean var11 = (var10 >> 30 & 0x1) != 0;
                                        if (var11) {
                                            if ((Statics.field157 & 0x10) == 16) {
                                                method1873(field349, field420 + " " + class2.field26 + " " + class2.method2316(16748608) + var9.field1024, 32, var9.field1019, var4, arg0.field2649);
                                            }
                                            break label322;
                                        }
                                    }
                                    String[] var12 = var9.field1036;
                                    if (field385) {
                                        var12 = method2901(var12);
                                    }
                                    int var13 = method34(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        for (int var15 = 4; var15 >= 3; var15--) {
                                            if (var12 != null && var12[var15] != null) {
                                                byte var16;
                                                if (var15 == 3) {
                                                    var16 = 36;
                                                } else {
                                                    var16 = 37;
                                                }
                                                method1873(var12[var15], class2.method2316(16748608) + var9.field1024, var16, var9.field1019, var4, arg0.field2649);
                                            } else if (var15 == 4) {
                                                method1873(class147.field2183, class2.method2316(16748608) + var9.field1024, 37, var9.field1019, var4, arg0.field2649);
                                            }
                                        }
                                    }
                                    int var17 = method34(arg0);
                                    boolean var18 = (var17 >> 31 & 0x1) != 0;
                                    if (var18) {
                                        method1873(class147.field2194, class2.method2316(16748608) + var9.field1024, 38, var9.field1019, var4, arg0.field2649);
                                    }
                                    int var19 = method34(arg0);
                                    boolean var20 = (var19 >> 30 & 0x1) != 0;
                                    if (var20 && var12 != null) {
                                        for (int var21 = 2; var21 >= 0; var21--) {
                                            if (var12[var21] != null) {
                                                byte var22 = 0;
                                                if (var21 == 0) {
                                                    var22 = 33;
                                                }
                                                if (var21 == 1) {
                                                    var22 = 34;
                                                }
                                                if (var21 == 2) {
                                                    var22 = 35;
                                                }
                                                method1873(var12[var21], class2.method2316(16748608) + var9.field1024, var22, var9.field1019, var4, arg0.field2649);
                                            }
                                        }
                                    }
                                    String[] var23 = arg0.field2630;
                                    if (field385) {
                                        var23 = method2901(var23);
                                    }
                                    if (var23 != null) {
                                        for (int var24 = 4; var24 >= 0; var24--) {
                                            if (var23[var24] != null) {
                                                byte var25 = 0;
                                                if (var24 == 0) {
                                                    var25 = 39;
                                                }
                                                if (var24 == 1) {
                                                    var25 = 40;
                                                }
                                                if (var24 == 2) {
                                                    var25 = 41;
                                                }
                                                if (var24 == 3) {
                                                    var25 = 42;
                                                }
                                                if (var24 == 4) {
                                                    var25 = 43;
                                                }
                                                method1873(var23[var24], class2.method2316(16748608) + var9.field1024, var25, var9.field1019, var4, arg0.field2649);
                                            }
                                        }
                                    }
                                    method1873(class147.field2332, class2.method2316(16748608) + var9.field1024, 1005, var9.field1019, var4, arg0.field2649);
                                }
                            } else if (Statics.field1836 != arg0.field2649 || Statics.field28 != var4) {
                                method1873(class147.field2194, field432 + " " + class2.field26 + " " + class2.method2316(16748608) + var9.field1024, 31, var9.field1019, var4, arg0.field2649);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2595) {
            return;
        }
        if (!field497) {
            for (int var26 = 9; var26 >= 5; var26--) {
                String var27 = method2358(arg0, var26);
                if (var27 != null) {
                    method1873(var27, arg0.field2632, 1007, var26 + 1, arg0.field2665, arg0.field2649);
                }
            }
            String var28 = method2070(arg0);
            if (var28 != null) {
                method1873(var28, arg0.field2632, 25, 0, arg0.field2665, arg0.field2649);
            }
            for (int var29 = 4; var29 >= 0; var29--) {
                int var30 = method34(arg0);
                boolean var31 = (var30 >> var29 + 1 & 0x1) != 0;
                String var32;
                if (!var31 && arg0.field2659 == null) {
                    var32 = null;
                } else if (arg0.field2633 == null || arg0.field2633.length <= var29 || arg0.field2633[var29] == null || arg0.field2633[var29].trim().length() == 0) {
                    var32 = null;
                } else {
                    var32 = arg0.field2633[var29];
                }
                if (var32 != null) {
                    method1873(var32, arg0.field2632, 57, var29 + 1, arg0.field2665, arg0.field2649);
                }
            }
            int var34 = method34(arg0);
            boolean var35 = (var34 & 0x1) != 0;
            if (var35) {
                method1873(class147.field2187, "", 30, 0, arg0.field2665, arg0.field2649);
            }
        } else if (class161.method154(method34(arg0)) && (Statics.field157 & 0x20) == 32) {
            method1873(field349, field420 + " " + class2.field26 + " " + arg0.field2632, 58, 0, arg0.field2665, arg0.field2649);
        }
    }

    @ObfuscatedName("v.cg(IIIIIIIB)V")
    public static final void method7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class157.method764(arg0)) {
            method1764(Statics.field2599[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("cw.cy([Lft;IIIIIIIB)V")
    public static final void method1764(class157[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class157 var9 = arg0[var8];
            if (var9 != null && (!var9.field2595 || var9.field2573 == 0 || var9.field2639 || method34(var9) != 0 || field458 == var9) && var9.field2587 == arg1 && (!var9.field2595 || !method17(var9))) {
                int var10 = var9.field2576 + arg6;
                int var11 = var9.field2688 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2573 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2573 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2580 + var10;
                    int var19 = var9.field2581 + var11;
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
                    int var22 = var9.field2580 + var10;
                    int var23 = var9.field2581 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field433 == var9) {
                    field441 = true;
                    field442 = var10;
                    field338 = var11;
                }
                if (!var9.field2595 || var12 < var14 && var13 < var15) {
                    int var24 = class131.field2030;
                    int var25 = class131.field2031 * -778357537;
                    if (class131.field2036 != 0) {
                        var24 = class131.field2024;
                        var25 = class131.field2026;
                    }
                    if (var9.field2575 == 1337) {
                        method1372(var9);
                        if (!field265 && !field401 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method511(var24, var25, var12, var13);
                        }
                    } else if (var9.field2575 != 1338) {
                        if (!field401 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method172(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2573 == 0) {
                            if (!var9.field2595 && method17(var9) && Statics.field411 != var9) {
                                continue;
                            }
                            method1764(arg0, var9.field2649, var12, var13, var14, var15, var10 - var9.field2586, var11 - var9.field2585);
                            if (var9.field2682 != null) {
                                method1764(var9.field2682, var9.field2649, var12, var13, var14, var15, var10 - var9.field2586, var11 - var9.field2585);
                            }
                            class4 var37 = (class4) field422.method3231((long) var9.field2649);
                            if (var37 != null) {
                                if (var37.field55 == 0 && class131.field2030 >= var12 && class131.field2031 * -778357537 >= var13 && class131.field2030 < var14 && class131.field2031 * -778357537 < var15 && !field401 && !field419) {
                                    field407[0] = class147.field2374;
                                    field345[0] = "";
                                    field405[0] = 1006;
                                    field402 = 1;
                                }
                                method7(var37.field63, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2595) {
                            if (var9.field2691 && class131.field2030 >= var12 && class131.field2031 * -778357537 >= var13 && class131.field2030 < var14 && class131.field2031 * -778357537 < var15) {
                                for (class1 var38 = (class1) field461.method3251(); var38 != null; var38 = (class1) field461.method3261()) {
                                    if (var38.field2) {
                                        var38.method3343();
                                        var38.field10.field2683 = false;
                                    }
                                }
                                if (Statics.field141 == 0) {
                                    field433 = null;
                                    field458 = null;
                                }
                                if (!field401) {
                                    field407[0] = class147.field2374;
                                    field345[0] = "";
                                    field405[0] = 1006;
                                    field402 = 1;
                                }
                            }
                            boolean var39;
                            if (class131.field2030 >= var12 && class131.field2031 * -778357537 >= var13 && class131.field2030 < var14 && class131.field2031 * -778357537 < var15) {
                                var39 = true;
                            } else {
                                var39 = false;
                            }
                            boolean var40 = false;
                            if ((class131.field2029 == 1 || !Statics.field1816 && class131.field2029 == 4) && var39) {
                                var40 = true;
                            }
                            boolean var41 = false;
                            if ((class131.field2036 == 1 || !Statics.field1816 && class131.field2036 == 4) && class131.field2024 >= var12 && class131.field2026 >= var13 && class131.field2024 < var14 && class131.field2026 < var15) {
                                var41 = true;
                            }
                            if (var41) {
                                method1584(var9, class131.field2024 - var10, class131.field2026 - var11);
                            }
                            if (field433 != null && field433 != var9 && var39 && class161.method627(method34(var9))) {
                                field516 = var9;
                            }
                            if (field458 == var9) {
                                field282 = true;
                                field439 = var10;
                                field440 = var11;
                            }
                            if (var9.field2639) {
                                if (var39 && field460 != 0 && var9.field2660 != null) {
                                    class1 var42 = new class1();
                                    var42.field2 = true;
                                    var42.field10 = var9;
                                    var42.field5 = field460;
                                    var42.field6 = var9.field2660;
                                    field461.method3274(var42);
                                }
                                if (field433 != null || Statics.field185 != null || field401) {
                                    var41 = false;
                                    var40 = false;
                                    var39 = false;
                                }
                                if (!var9.field2570 && var41) {
                                    var9.field2570 = true;
                                    if (var9.field2646 != null) {
                                        class1 var43 = new class1();
                                        var43.field2 = true;
                                        var43.field10 = var9;
                                        var43.field4 = class131.field2024 - var10;
                                        var43.field5 = class131.field2026 - var11;
                                        var43.field6 = var9.field2646;
                                        field461.method3274(var43);
                                    }
                                }
                                if (var9.field2570 && var40 && var9.field2642 != null) {
                                    class1 var44 = new class1();
                                    var44.field2 = true;
                                    var44.field10 = var9;
                                    var44.field4 = class131.field2030 - var10;
                                    var44.field5 = class131.field2031 * -778357537 - var11;
                                    var44.field6 = var9.field2642;
                                    field461.method3274(var44);
                                }
                                if (var9.field2570 && !var40) {
                                    var9.field2570 = false;
                                    if (var9.field2643 != null) {
                                        class1 var45 = new class1();
                                        var45.field2 = true;
                                        var45.field10 = var9;
                                        var45.field4 = class131.field2030 - var10;
                                        var45.field5 = class131.field2031 * -778357537 - var11;
                                        var45.field6 = var9.field2643;
                                        field463.method3274(var45);
                                    }
                                }
                                if (var40 && var9.field2644 != null) {
                                    class1 var46 = new class1();
                                    var46.field2 = true;
                                    var46.field10 = var9;
                                    var46.field4 = class131.field2030 - var10;
                                    var46.field5 = class131.field2031 * -778357537 - var11;
                                    var46.field6 = var9.field2644;
                                    field461.method3274(var46);
                                }
                                if (!var9.field2683 && var39) {
                                    var9.field2683 = true;
                                    if (var9.field2617 != null) {
                                        class1 var47 = new class1();
                                        var47.field2 = true;
                                        var47.field10 = var9;
                                        var47.field4 = class131.field2030 - var10;
                                        var47.field5 = class131.field2031 * -778357537 - var11;
                                        var47.field6 = var9.field2617;
                                        field461.method3274(var47);
                                    }
                                }
                                if (var9.field2683 && var39 && var9.field2571 != null) {
                                    class1 var48 = new class1();
                                    var48.field2 = true;
                                    var48.field10 = var9;
                                    var48.field4 = class131.field2030 - var10;
                                    var48.field5 = class131.field2031 * -778357537 - var11;
                                    var48.field6 = var9.field2571;
                                    field461.method3274(var48);
                                }
                                if (var9.field2683 && !var39) {
                                    var9.field2683 = false;
                                    if (var9.field2647 != null) {
                                        class1 var49 = new class1();
                                        var49.field2 = true;
                                        var49.field10 = var9;
                                        var49.field4 = class131.field2030 - var10;
                                        var49.field5 = class131.field2031 * -778357537 - var11;
                                        var49.field6 = var9.field2647;
                                        field463.method3274(var49);
                                    }
                                }
                                if (var9.field2618 != null) {
                                    class1 var50 = new class1();
                                    var50.field10 = var9;
                                    var50.field6 = var9.field2618;
                                    field462.method3274(var50);
                                }
                                if (var9.field2572 != null && field447 > var9.field2686) {
                                    if (var9.field2653 == null || field447 - var9.field2686 > 32) {
                                        class1 var55 = new class1();
                                        var55.field10 = var9;
                                        var55.field6 = var9.field2572;
                                        field461.method3274(var55);
                                    } else {
                                        label586: for (int var51 = var9.field2686; var51 < field447; var51++) {
                                            int var52 = field373[var51 & 0x1F];
                                            for (int var53 = 0; var53 < var9.field2653.length; var53++) {
                                                if (var9.field2653[var53] == var52) {
                                                    class1 var54 = new class1();
                                                    var54.field10 = var9;
                                                    var54.field6 = var9.field2572;
                                                    field461.method3274(var54);
                                                    break label586;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2686 = field447;
                                }
                                if (var9.field2590 != null && field449 > var9.field2641) {
                                    if (var9.field2655 == null || field449 - var9.field2641 > 32) {
                                        class1 var60 = new class1();
                                        var60.field10 = var9;
                                        var60.field6 = var9.field2590;
                                        field461.method3274(var60);
                                    } else {
                                        label562: for (int var56 = var9.field2641; var56 < field449; var56++) {
                                            int var57 = field448[var56 & 0x1F];
                                            for (int var58 = 0; var58 < var9.field2655.length; var58++) {
                                                if (var9.field2655[var58] == var57) {
                                                    class1 var59 = new class1();
                                                    var59.field10 = var9;
                                                    var59.field6 = var9.field2590;
                                                    field461.method3274(var59);
                                                    break label562;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2641 = field449;
                                }
                                if (var9.field2656 != null && field274 > var9.field2563) {
                                    if (var9.field2568 == null || field274 - var9.field2563 > 32) {
                                        class1 var65 = new class1();
                                        var65.field10 = var9;
                                        var65.field6 = var9.field2656;
                                        field461.method3274(var65);
                                    } else {
                                        label538: for (int var61 = var9.field2563; var61 < field274; var61++) {
                                            int var62 = field487[var61 & 0x1F];
                                            for (int var63 = 0; var63 < var9.field2568.length; var63++) {
                                                if (var9.field2568[var63] == var62) {
                                                    class1 var64 = new class1();
                                                    var64.field10 = var9;
                                                    var64.field6 = var9.field2656;
                                                    field461.method3274(var64);
                                                    break label538;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2563 = field274;
                                }
                                if (field452 > var9.field2589 && var9.field2661 != null) {
                                    class1 var66 = new class1();
                                    var66.field10 = var9;
                                    var66.field6 = var9.field2661;
                                    field461.method3274(var66);
                                }
                                if (field486 > var9.field2589 && var9.field2663 != null) {
                                    class1 var67 = new class1();
                                    var67.field10 = var9;
                                    var67.field6 = var9.field2663;
                                    field461.method3274(var67);
                                }
                                if (field259 > var9.field2589 && var9.field2605 != null) {
                                    class1 var68 = new class1();
                                    var68.field10 = var9;
                                    var68.field6 = var9.field2605;
                                    field461.method3274(var68);
                                }
                                if (field501 > var9.field2589 && var9.field2668 != null) {
                                    class1 var69 = new class1();
                                    var69.field10 = var9;
                                    var69.field6 = var9.field2668;
                                    field461.method3274(var69);
                                }
                                if (field455 > var9.field2589 && var9.field2669 != null) {
                                    class1 var70 = new class1();
                                    var70.field10 = var9;
                                    var70.field6 = var9.field2669;
                                    field461.method3274(var70);
                                }
                                if (field457 > var9.field2589 && var9.field2645 != null) {
                                    class1 var71 = new class1();
                                    var71.field10 = var9;
                                    var71.field6 = var9.field2645;
                                    field461.method3274(var71);
                                }
                                var9.field2589 = field414;
                                if (var9.field2623 != null) {
                                    for (int var72 = 0; var72 < field481; var72++) {
                                        class1 var73 = new class1();
                                        var73.field10 = var9;
                                        var73.field8 = field413[var72];
                                        var73.field9 = field482[var72];
                                        var73.field6 = var9.field2623;
                                        field461.method3274(var73);
                                    }
                                }
                            }
                        }
                        if (!var9.field2595 && field433 == null && Statics.field185 == null && !field401) {
                            if ((var9.field2673 >= 0 || var9.field2631 != 0) && class131.field2030 >= var12 && class131.field2031 * -778357537 >= var13 && class131.field2030 < var14 && class131.field2031 * -778357537 < var15) {
                                if (var9.field2673 >= 0) {
                                    Statics.field411 = arg0[var9.field2673];
                                } else {
                                    Statics.field411 = var9;
                                }
                            }
                            if (var9.field2573 == 8 && class131.field2030 >= var12 && class131.field2031 * -778357537 >= var13 && class131.field2030 < var14 && class131.field2031 * -778357537 < var15) {
                                Statics.field892 = var9;
                            }
                            if (var9.field2577 > var9.field2581) {
                                int var74 = var9.field2580 + var10;
                                int var75 = var9.field2581;
                                int var76 = var9.field2577;
                                int var77 = class131.field2030;
                                int var78 = class131.field2031 * -778357537;
                                if (field340) {
                                    field372 = 32;
                                } else {
                                    field372 = 0;
                                }
                                field340 = false;
                                if (class131.field2029 == 1 || !Statics.field1816 && class131.field2029 == 4) {
                                    if (var77 >= var74 && var77 < var74 + 16 && var78 >= var11 && var78 < var11 + 16) {
                                        var9.field2585 -= 4;
                                        method1372(var9);
                                    } else if (var77 >= var74 && var77 < var74 + 16 && var78 >= var11 + var75 - 16 && var78 < var11 + var75) {
                                        var9.field2585 += 4;
                                        method1372(var9);
                                    } else if (var77 >= var74 - field372 && var77 < field372 + var74 + 16 && var78 >= var11 + 16 && var78 < var11 + var75 - 16) {
                                        int var79 = (var75 - 32) * var75 / var76;
                                        if (var79 < 8) {
                                            var79 = 8;
                                        }
                                        int var80 = var78 - var11 - 16 - var79 / 2;
                                        int var81 = var75 - 32 - var79;
                                        var9.field2585 = (var76 - var75) * var80 / var81;
                                        method1372(var9);
                                        field340 = true;
                                    }
                                }
                                if (field460 != 0) {
                                    int var82 = var9.field2580;
                                    if (var77 >= var74 - var82 && var78 >= var11 && var77 < var74 + 16 && var78 <= var11 + var75) {
                                        var9.field2585 += field460 * 45;
                                        method1372(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field494 == 0 || field494 == 3) && (class131.field2036 == 1 || !Statics.field1816 && class131.field2036 == 4)) {
                        int var26 = class131.field2024 - 25 - var10;
                        int var27 = class131.field2026 - 5 - var11;
                        if (var26 >= 0 && var27 >= 0 && var26 < 146 && var27 < 151 && (var26 < 0 || var26 > 23 || var27 < 117 || var27 > 142)) {
                            var26 -= 73;
                            var27 -= 75;
                            int var28 = field443 + field330 & 0x7FF;
                            int var29 = class85.field1482[var28];
                            int var30 = class85.field1483[var28];
                            int var31 = (field332 + 256) * var29 >> 8;
                            int var32 = (field332 + 256) * var30 >> 8;
                            int var33 = var26 * var32 + var27 * var31 >> 11;
                            int var34 = var27 * var32 - var26 * var31 >> 11;
                            int var35 = Statics.field1358.field793 + var33 >> 7;
                            int var36 = Statics.field1358.field736 - var34 >> 7;
                            field301.method2376(246);
                            field301.method2117(18);
                            field301.method2161(Statics.field1820 + var36);
                            field301.method2154(class128.field1991[82] ? (class128.field1991[81] ? 2 : 1) : 0);
                            field301.method2218(Statics.field1935 + var35);
                            field301.method2117(var26);
                            field301.method2117(var27);
                            field301.method2188(field443);
                            field301.method2117(57);
                            field301.method2117(field330);
                            field301.method2117(field332);
                            field301.method2117(89);
                            field301.method2188(Statics.field1358.field793);
                            field301.method2188(Statics.field1358.field736);
                            field301.method2117(63);
                            field492 = var35;
                            field325 = var36;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.cv([Lft;II)V")
    public static final void method138(class157[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class157 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2573 == 0) {
                    if (var3.field2682 != null) {
                        method138(var3.field2682, arg1);
                    }
                    class4 var4 = (class4) field422.method3231((long) var3.field2649);
                    if (var4 != null) {
                        int var5 = var4.field63;
                        if (class157.method764(var5)) {
                            method138(Statics.field2599[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2666 != null) {
                    class1 var6 = new class1();
                    var6.field10 = var3;
                    var6.field6 = var3.field2666;
                    class33.method182(var6);
                }
                if (arg1 == 1 && var3.field2667 != null) {
                    if (var3.field2665 >= 0) {
                        class157 var7 = class157.method1871(var3.field2649);
                        if (var7 == null || var7.field2682 == null || var3.field2665 >= var7.field2682.length || var7.field2682[var3.field2665] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field10 = var3;
                    var8.field6 = var3.field2667;
                    class33.method182(var8);
                }
            }
        }
    }

    @ObfuscatedName("by.cc(Lft;IIB)V")
    public static final void method1584(class157 arg0, int arg1, int arg2) {
        if (field433 != null || field401 || arg0 == null) {
            return;
        }
        class157 var3 = method499(arg0);
        if (var3 == null) {
            var3 = arg0.field2634;
        }
        if (var3 == null) {
            return;
        }
        field433 = arg0;
        class157 var5 = method499(arg0);
        if (var5 == null) {
            var5 = arg0.field2634;
        }
        field458 = var5;
        field435 = arg1;
        field436 = arg2;
        Statics.field141 = 0;
        field444 = false;
        if (field402 > 0) {
            int var7 = field402 - 1;
            Statics.field114 = new class28();
            Statics.field114.field649 = field430[var7];
            Statics.field114.field646 = field366[var7];
            Statics.field114.field644 = field405[var7];
            Statics.field114.field648 = field406[var7];
            Statics.field114.field642 = field407[var7];
        }
        return;
    }

    @ObfuscatedName("cd.cx(B)V")
    public static final void method1847() {
        method1372(field433);
        Statics.field141++;
        if (field441 && field282) {
            int var0 = class131.field2030;
            int var1 = class131.field2031 * -778357537;
            int var2 = var0 - field435;
            int var3 = var1 - field436;
            if (var2 < field439) {
                var2 = field439;
            }
            if (field433.field2580 + var2 > field439 + field458.field2580) {
                var2 = field439 + field458.field2580 - field433.field2580;
            }
            if (var3 < field440) {
                var3 = field440;
            }
            if (field433.field2581 + var3 > field440 + field458.field2581) {
                var3 = field440 + field458.field2581 - field433.field2581;
            }
            int var4 = var2 - field442;
            int var5 = var3 - field338;
            int var6 = field433.field2635;
            if (Statics.field141 > field433.field2603 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field444 = true;
            }
            int var7 = field458.field2586 + (var2 - field439);
            int var8 = field458.field2585 + (var3 - field440);
            if (field433.field2648 != null && field444) {
                class1 var9 = new class1();
                var9.field10 = field433;
                var9.field4 = var7;
                var9.field5 = var8;
                var9.field6 = field433.field2648;
                class33.method182(var9);
            }
            if (class131.field2029 == 0) {
                if (field444) {
                    if (field433.field2664 != null) {
                        class1 var10 = new class1();
                        var10.field10 = field433;
                        var10.field4 = var7;
                        var10.field5 = var8;
                        var10.field1 = field516;
                        var10.field6 = field433.field2664;
                        class33.method182(var10);
                    }
                    if (field516 != null && method499(field433) != null) {
                        field301.method2376(127);
                        field301.method2161(field516.field2665);
                        field301.method2287(field516.field2678);
                        field301.method2120(field516.field2649);
                        field301.method2161(field433.field2678);
                        field301.method2169(field433.field2649);
                        field301.method2218(field433.field2665);
                    }
                } else if ((field520 == 1 || method135(field402 - 1)) && field402 > 2) {
                    method2398(field442 + field435, field436 + field338);
                } else if (field402 > 0) {
                    int var11 = field442 + field435;
                    int var12 = field436 + field338;
                    method519(Statics.field114, var11, var12);
                    Statics.field114 = null;
                }
                field433 = null;
            }
        } else if (Statics.field141 > 1) {
            field433 = null;
        }
    }

    @ObfuscatedName("bx.ce(Lft;I)V")
    public static void method1372(class157 arg0) {
        if (field336 == arg0.field2687) {
            field467[arg0.field2689] = true;
        }
    }

    @ObfuscatedName("ck.cl(I)V")
    public static void method1868() {
        for (class4 var0 = (class4) field422.method3210(); var0 != null; var0 = (class4) field422.method3214()) {
            int var1 = var0.field63;
            if (class157.method764(var1)) {
                boolean var2 = true;
                class157[] var3 = Statics.field2599[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2595;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2908;
                    class157 var6 = class157.method1871(var5);
                    if (var6 != null) {
                        method1372(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fv.cz([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2901(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("m.cm(IB)V")
    public static final void method62(int arg0) {
        if (!class157.method764(arg0)) {
            return;
        }
        class157[] var1 = Statics.field2599[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3 != null) {
                var3.field2662 = 0;
                var3.field2654 = 0;
            }
        }
    }

    @ObfuscatedName("i.cu(II)V")
    public static final void method25(int arg0) {
        if (class157.method764(arg0)) {
            method2705(Statics.field2599[arg0], -1);
        }
    }

    @ObfuscatedName("ey.ca([Lft;IB)V")
    public static final void method2705(class157[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class157 var3 = arg0[var2];
            if (var3 != null && var3.field2587 == arg1 && (!var3.field2595 || !method17(var3))) {
                if (var3.field2573 == 0) {
                    if (!var3.field2595 && method17(var3) && Statics.field411 != var3) {
                        continue;
                    }
                    method2705(arg0, var3.field2649);
                    if (var3.field2682 != null) {
                        method2705(var3.field2682, var3.field2649);
                    }
                    class4 var4 = (class4) field422.method3231((long) var3.field2649);
                    if (var4 != null) {
                        int var5 = var4.field63;
                        if (class157.method764(var5)) {
                            method2705(Statics.field2599[var5], -1);
                        }
                    }
                }
                if (var3.field2573 == 6) {
                    if (var3.field2607 != -1 || var3.field2608 != -1) {
                        boolean var6 = method26(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2608;
                        } else {
                            var7 = var3.field2607;
                        }
                        if (var7 != -1) {
                            class39 var8 = Statics.method97(var7);
                            var3.field2654 += field431;
                            while (var3.field2654 > var8.field912[var3.field2662]) {
                                var3.field2654 -= var8.field912[var3.field2662];
                                var3.field2662++;
                                if (var3.field2662 >= var8.field911.length) {
                                    var3.field2662 -= var8.field914;
                                    if (var3.field2662 < 0 || var3.field2662 >= var8.field911.length) {
                                        var3.field2662 = 0;
                                    }
                                }
                                method1372(var3);
                            }
                        }
                    }
                    if (var3.field2615 != 0 && !var3.field2595) {
                        int var9 = var3.field2615 >> 16;
                        int var10 = var3.field2615 << 16 >> 16;
                        int var11 = field431 * var9;
                        int var12 = field431 * var10;
                        var3.field2611 = var3.field2611 + var11 & 0x7FF;
                        var3.field2680 = var3.field2680 + var12 & 0x7FF;
                        method1372(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.cs(IS)V")
    public static final void method99(int arg0) {
        method1868();
        class21.method2359();
        int var1 = class47.method2357(arg0).field1067;
        if (var1 == 0) {
            return;
        }
        int var2 = class159.field2701[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class85.method1768(0.9D);
                ((class89) Statics.field1479).method1855(0.9D);
            }
            if (var2 == 2) {
                class85.method1768(0.8D);
                ((class89) Statics.field1479).method1855(0.8D);
            }
            if (var2 == 3) {
                class85.method1768(0.7D);
                ((class89) Statics.field1479).method1855(0.7D);
            }
            if (var2 == 4) {
                class85.method1768(0.6D);
                ((class89) Statics.field1479).method1855(0.6D);
            }
            class46.field1018.method3184();
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
            if (field495 != var3) {
                if (field495 == 0 && field496 != -1) {
                    class166.method130(Statics.field250, field496, 0, var3, false);
                    field408 = false;
                } else if (var3 == 0) {
                    class166.method3();
                    field408 = false;
                } else if (class166.field2748 == 0) {
                    Statics.field3043.method3059(var3);
                } else {
                    Statics.field210 = var3;
                }
                field495 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field498 = 127;
            }
            if (var2 == 1) {
                field498 = 96;
            }
            if (var2 == 2) {
                field498 = 64;
            }
            if (var2 == 3) {
                field498 = 32;
            }
            if (var2 == 4) {
                field498 = 0;
            }
        }
        if (var1 == 5) {
            field520 = var2;
        }
        if (var1 == 6) {
            field423 = var2;
        }
        if (var1 == 9) {
            field424 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field499 = 127;
            }
            if (var2 == 1) {
                field499 = 96;
            }
            if (var2 == 2) {
                field499 = 64;
            }
            if (var2 == 3) {
                field499 = 32;
            }
            if (var2 == 4) {
                field499 = 0;
            }
        }
        if (var1 == 17) {
            field429 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field284 = (class18) class100.method111(class18.method600(), var2);
            if (field284 == null) {
                field284 = class18.field532;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field469 = -1;
        } else {
            field469 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("cg.dg(Lft;I)V")
    public static final void method1872(class157 arg0) {
        int var1 = arg0.field2575;
        if (var1 == 324) {
            if (field466 == -1) {
                field466 = arg0.field2629;
                field521 = arg0.field2596;
            }
            if (field519.field2711) {
                arg0.field2629 = field466;
            } else {
                arg0.field2629 = field521;
            }
        } else if (var1 == 325) {
            if (field466 == -1) {
                field466 = arg0.field2629;
                field521 = arg0.field2596;
            }
            if (field519.field2711) {
                arg0.field2629 = field521;
            } else {
                arg0.field2629 = field466;
            }
        } else if (var1 == 327) {
            arg0.field2611 = 150;
            arg0.field2680 = (int) (Math.sin((double) field266 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2657 = 5;
            arg0.field2604 = 0;
        } else if (var1 == 328) {
            arg0.field2611 = 150;
            arg0.field2680 = (int) (Math.sin((double) field266 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2657 = 5;
            arg0.field2604 = 1;
        }
    }

    @ObfuscatedName("p.dd(S)V")
    public static final void method530() {
        field301.method2376(25);
        for (class4 var0 = (class4) field422.method3210(); var0 != null; var0 = (class4) field422.method3214()) {
            if (var0.field55 == 0 || var0.field55 == 3) {
                method2712(var0, true);
            }
        }
        if (field425 != null) {
            method1372(field425);
            field425 = null;
        }
    }

    @ObfuscatedName("em.dp(Lb;ZI)V")
    public static final void method2712(class4 arg0, boolean arg1) {
        int var2 = arg0.field63;
        int var3 = (int) arg0.field2908;
        arg0.method3343();
        if (arg1 && var2 != -1 && Statics.field2564[var2]) {
            Statics.field2565.method2742(var2);
            if (Statics.field2599[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2599[var2].length; var5++) {
                    if (Statics.field2599[var2][var5] != null) {
                        if (Statics.field2599[var2][var5].field2573 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2599[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2599[var2] = null;
                }
                Statics.field2564[var2] = false;
            }
        }
        for (class184 var6 = (class184) field346.method3210(); var6 != null; var6 = (class184) field346.method3214()) {
            if ((var6.field2908 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3343();
            }
        }
        class157 var7 = class157.method1871(var3);
        if (var7 != null) {
            method1372(var7);
        }
        method851();
        if (field421 != -1) {
            int var8 = field421;
            if (class157.method764(var8)) {
                method138(Statics.field2599[var8], 1);
            }
        }
    }

    @ObfuscatedName("e.du(Lft;I)Z")
    public static final boolean method100(class157 arg0) {
        int var1 = arg0.field2575;
        if (var1 == 205) {
            field308 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field519.method2942(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field519.method2949(var4, var5 == 1);
        }
        if (var1 == 324) {
            field519.method2932(false);
        }
        if (var1 == 325) {
            field519.method2932(true);
        }
        if (var1 == 326) {
            field301.method2376(177);
            field519.method2933(field301);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("by.dj(IIIILba;I)V")
    public static final void method1583(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method1869(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field443 + field330 & 0x7FF;
        int var7 = class85.field1482[var6];
        int var8 = class85.field1483[var6];
        int var9 = var7 * 256 / (field332 + 256);
        int var10 = var8 * 256 / (field332 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1973.method1506(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("ck.di(IIIILba;I)V")
    public static final void method1869(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field443 + field330 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class85.field1482[var5];
        int var8 = class85.field1483[var5];
        int var9 = var7 * 256 / (field332 + 256);
        int var10 = var8 * 256 / (field332 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1442(Statics.field578, arg0 + 94 + var11 - arg4.field1311 / 2 + 4, arg1 + 83 - var12 - arg4.field1312 / 2 - 4);
        } else {
            arg4.method1503(arg0 + 94 + var11 - arg4.field1311 / 2 + 4, arg1 + 83 - var12 - arg4.field1312 / 2 - 4);
        }
    }

    @ObfuscatedName("m.do(Ljava/lang/String;ZI)Z")
    public static boolean method38(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class214.method2062(arg0, Statics.field67);
        for (int var3 = 0; var3 < field513; var3++) {
            if (var2.equalsIgnoreCase(class214.method2062(field515[var3].field233, Statics.field67)) && (!arg1 || field515[var3].field235 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class214.method2062(Statics.field1358.field37, Statics.field67))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bn.dq(Ljava/lang/String;I)Z")
    public static boolean method1408(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class214.method2062(arg0, Statics.field67);
        for (int var2 = 0; var2 < field434; var2++) {
            class8 var3 = field518[var2];
            if (var1.equalsIgnoreCase(class214.method2062(var3.field137, Statics.field67))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class214.method2062(var3.field138, Statics.field67))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("dl.dh(Ljava/lang/String;B)V")
    public static final void method2425(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field513 < 200 || field417 == 1) || field513 >= 400) {
            class10.method2599(30, "", class147.field2347);
            return;
        }
        String var1 = class214.method2062(arg0, Statics.field67);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field513; var2++) {
            class16 var3 = field515[var2];
            String var4 = class214.method2062(var3.field233, Statics.field67);
            if (var4 != null && var4.equals(var1)) {
                class10.method2599(30, "", arg0 + class147.field2311);
                return;
            }
            if (var3.field232 != null) {
                String var5 = class214.method2062(var3.field232, Statics.field67);
                if (var5 != null && var5.equals(var1)) {
                    class10.method2599(30, "", arg0 + class147.field2311);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field434; var6++) {
            class8 var7 = field518[var6];
            String var8 = class214.method2062(var7.field137, Statics.field67);
            if (var8 != null && var8.equals(var1)) {
                class10.method2599(30, "", class147.field2353 + arg0 + class147.field2354);
                return;
            }
            if (var7.field138 != null) {
                String var9 = class214.method2062(var7.field138, Statics.field67);
                if (var9 != null && var9.equals(var1)) {
                    class10.method2599(30, "", class147.field2353 + arg0 + class147.field2354);
                    return;
                }
            }
        }
        if (class214.method2062(Statics.field1358.field37, Statics.field67).equals(var1)) {
            class10.method2599(30, "", class147.field2351);
            return;
        }
        field301.method2376(156);
        class113 var10 = field301;
        int var11 = arg0.length() + 1;
        var10.method2117(var11);
        field301.method2122(arg0);
    }

    @ObfuscatedName("dv.df(Ljava/lang/String;B)V")
    public static final void method2421(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class214.method2062(arg0, Statics.field67);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field513; var2++) {
            class16 var3 = field515[var2];
            String var4 = var3.field233;
            String var5 = class214.method2062(var4, Statics.field67);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field513--;
                for (int var7 = var2; var7 < field513; var7++) {
                    field515[var7] = field515[var7 + 1];
                }
                field486 = field414;
                field301.method2376(232);
                class113 var8 = field301;
                int var9 = arg0.length() + 1;
                var8.method2117(var9);
                field301.method2122(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cc.dw(Ljava/lang/String;I)V")
    public static final void method1967(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class214.method2062(arg0, Statics.field67);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field434; var2++) {
            class8 var3 = field518[var2];
            String var4 = var3.field137;
            String var5 = class214.method2062(var4, Statics.field67);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field434--;
                for (int var7 = var2; var7 < field434; var7++) {
                    field518[var7] = field518[var7 + 1];
                }
                field486 = field414;
                field301.method2376(136);
                class113 var8 = field301;
                int var9 = arg0.length() + 1;
                var8.method2117(var9);
                field301.method2122(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ah.dk(Ljava/lang/String;B)V")
    public static final void method587(String arg0) {
        if (arg0.equals("")) {
            return;
        }
        field301.method2376(46);
        class113 var1 = field301;
        int var2 = arg0.length() + 1;
        var1.method2117(var2);
        field301.method2122(arg0);
    }

    @ObfuscatedName("ci.dr(I)V")
    public static final void method1766() {
        field301.method2376(46);
        field301.method2117(0);
    }

    @ObfuscatedName("l.dv(Lft;I)I")
    public static int method34(class157 arg0) {
        class184 var1 = (class184) field346.method3231(((long) arg0.field2649 << 32) + (long) arg0.field2665);
        return var1 == null ? arg0.field2566 : var1.field2894;
    }

    @ObfuscatedName("u.dt(Lft;I)Lft;")
    public static class157 method499(class157 arg0) {
        int var1 = class161.method1969(method34(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class157.method1871(arg0.field2587);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("i.dl(Lft;B)Z")
    public static boolean method17(class157 arg0) {
        if (field419) {
            if (method34(arg0) != 0) {
                return false;
            }
            if (arg0.field2573 == 0) {
                return false;
            }
        }
        return arg0.field2583;
    }

    @ObfuscatedName("dq.ds(Lft;IB)Ljava/lang/String;")
    public static String method2358(class157 arg0, int arg1) {
        int var2 = method34(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2659 == null) {
            return null;
        } else if (arg0.field2633 == null || arg0.field2633.length <= arg1 || arg0.field2633[arg1] == null || arg0.field2633[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2633[arg1];
        }
    }

    @ObfuscatedName("cs.dc(Lft;I)Ljava/lang/String;")
    public static String method2070(class157 arg0) {
        int var1 = method34(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2638 == null || arg0.field2638.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2638;
        }
    }

    @ObfuscatedName("p.dn(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method527(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field315 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field315 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field315 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field315 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field315 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1453 != null) {
            var3 = "/p=" + Statics.field1453;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field263 + "/a=" + Statics.field1919 + var3 + "/";
    }

    @ObfuscatedName("gn.da(Ljava/lang/String;ZI)V")
    public static void method3369(String arg0, boolean arg1) {
        Statics.field1276.field2502 = false;
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2951; var5++) {
            class46 var6 = class46.method740(var5);
            if ((!arg1 || var6.field1023) && var6.field1052 == -1 && var6.field1024.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field179 = -1;
                    Statics.field1570 = null;
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
        Statics.field1570 = var3;
        Statics.field1286 = 0;
        Statics.field179 = var4;
        String[] var9 = new String[Statics.field179];
        for (int var10 = 0; var10 < Statics.field179; var10++) {
            var9[var10] = class46.method740(var3[var10]).field1024;
        }
        short[] var11 = Statics.field1570;
        Statics.method1849(var9, var11, 0, var9.length - 1);
        Statics.field1276.method2743();
        Statics.field1276.field2502 = true;
    }
}

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

public final class client extends class135 {

    @ObfuscatedName("client.c")
    public static boolean field406 = true;

    @ObfuscatedName("client.r")
    public static int field269 = 1;

    @ObfuscatedName("client.f")
    public static int field233 = 0;

    @ObfuscatedName("client.o")
    public static int field235 = 0;

    @ObfuscatedName("client.h")
    public static boolean field250 = false;

    @ObfuscatedName("client.m")
    public static boolean field317 = false;

    @ObfuscatedName("client.w")
    public static class211[] field273 = new class211[4];

    @ObfuscatedName("client.q")
    public static int field240 = 0;

    @ObfuscatedName("client.j")
    public static int field241 = 0;

    @ObfuscatedName("client.a")
    public static boolean field254 = true;

    @ObfuscatedName("client.n")
    public static int field243 = 0;

    @ObfuscatedName("client.v")
    public static long field353 = -1L;

    @ObfuscatedName("client.t")
    public static int field245 = -1;

    @ObfuscatedName("client.i")
    public static int field246 = -1;

    @ObfuscatedName("client.aw")
    public static int field247 = -1;

    @ObfuscatedName("client.ar")
    public static boolean field248 = true;

    @ObfuscatedName("client.af")
    public static boolean field249 = false;

    @ObfuscatedName("client.am")
    public static int field312 = 0;

    @ObfuscatedName("client.ax")
    public static int field251 = 0;

    @ObfuscatedName("client.av")
    public static int field252 = 0;

    @ObfuscatedName("client.al")
    public static int field403 = 0;

    @ObfuscatedName("client.ab")
    public static int field239 = 0;

    @ObfuscatedName("client.ac")
    public static int field255 = 0;

    @ObfuscatedName("client.aq")
    public static int field256 = 0;

    @ObfuscatedName("client.az")
    public static int field447 = 0;

    @ObfuscatedName("client.ah")
    public static int field258 = 0;

    @ObfuscatedName("client.at")
    public static class110 field259 = new class110(new byte[5000]);

    @ObfuscatedName("client.au")
    public static class18 field282 = class18.field503;

    @ObfuscatedName("client.an")
    public static int field263 = 0;

    @ObfuscatedName("client.ak")
    public static int field454 = 0;

    @ObfuscatedName("client.ay")
    public static int field318 = 0;

    @ObfuscatedName("client.bo")
    public static int field234 = 0;

    @ObfuscatedName("client.bd")
    public static int field268 = 0;

    @ObfuscatedName("client.bz")
    public static int field286 = 0;

    @ObfuscatedName("client.bs")
    public static int field270 = 0;

    @ObfuscatedName("client.bx")
    public static int field271 = 0;

    @ObfuscatedName("client.cc")
    public static class31[] field272 = new class31[32768];

    @ObfuscatedName("client.cb")
    public static int field366 = 0;

    @ObfuscatedName("client.cx")
    public static int[] field467 = new int[32768];

    @ObfuscatedName("client.ct")
    public static class113 field275 = new class113(5000);

    @ObfuscatedName("client.ci")
    public static class113 field261 = new class113(5000);

    @ObfuscatedName("client.cg")
    public static class113 field277 = new class113(5000);

    @ObfuscatedName("client.co")
    public static int field413 = 0;

    @ObfuscatedName("client.cm")
    public static int field279 = 0;

    @ObfuscatedName("client.cf")
    public static int field280 = 0;

    @ObfuscatedName("client.ck")
    public static int field480 = 0;

    @ObfuscatedName("client.cp")
    public static int field301 = 0;

    @ObfuscatedName("client.cj")
    public static int field283 = 0;

    @ObfuscatedName("client.ch")
    public static int field483 = 0;

    @ObfuscatedName("client.cs")
    public static int field285 = 0;

    @ObfuscatedName("client.cr")
    public static boolean field448 = false;

    @ObfuscatedName("client.cv")
    public static int field287 = 0;

    @ObfuscatedName("client.da")
    public static int field288 = 0;

    @ObfuscatedName("client.dk")
    public static int field289 = 1;

    @ObfuscatedName("client.dr")
    public static int field290 = 0;

    @ObfuscatedName("client.dg")
    public static int field238 = 1;

    @ObfuscatedName("client.dm")
    public static int field292 = 0;

    @ObfuscatedName("client.dd")
    public static boolean field294 = false;

    @ObfuscatedName("client.dx")
    public static int[][][] field477 = new int[4][13][13];

    @ObfuscatedName("client.dq")
    public static final int[] field296 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dl")
    public static int field457 = 0;

    @ObfuscatedName("client.di")
    public static int field298 = 2;

    @ObfuscatedName("client.dv")
    public static int field357 = 0;

    @ObfuscatedName("client.df")
    public static int field274 = 2;

    @ObfuscatedName("client.db")
    public static int field407 = 0;

    @ObfuscatedName("client.dt")
    public static int field302 = 1;

    @ObfuscatedName("client.dh")
    public static int field382 = 0;

    @ObfuscatedName("client.ez")
    public static int field304 = 0;

    @ObfuscatedName("client.em")
    public static int field305 = 2;

    @ObfuscatedName("client.ej")
    public static int field306 = 0;

    @ObfuscatedName("client.ev")
    public static int field307 = 1;

    @ObfuscatedName("client.ee")
    public static int field308 = 0;

    @ObfuscatedName("client.ex")
    public static int field309 = 0;

    @ObfuscatedName("client.et")
    public static int field311 = 2301979;

    @ObfuscatedName("client.ep")
    public static int field260 = 5063219;

    @ObfuscatedName("client.fy")
    public static int field414 = 3353893;

    @ObfuscatedName("client.fe")
    public static int field314 = 7759444;

    @ObfuscatedName("client.fj")
    public static boolean field315 = false;

    @ObfuscatedName("client.fh")
    public static int field316 = 0;

    @ObfuscatedName("client.fb")
    public static int field291 = 128;

    @ObfuscatedName("client.fo")
    public static int field310 = 0;

    @ObfuscatedName("client.fn")
    public static int field319 = 0;

    @ObfuscatedName("client.fw")
    public static int field320 = 0;

    @ObfuscatedName("client.fc")
    public static int field244 = 0;

    @ObfuscatedName("client.fr")
    public static int field322 = 0;

    @ObfuscatedName("client.fs")
    public static int field389 = 0;

    @ObfuscatedName("client.fm")
    public static boolean field324 = false;

    @ObfuscatedName("client.fk")
    public static int field325 = 0;

    @ObfuscatedName("client.fz")
    public static int field253 = 0;

    @ObfuscatedName("client.fu")
    public static int field359 = 50;

    @ObfuscatedName("client.fv")
    public static int[] field328 = new int[field359];

    @ObfuscatedName("client.fp")
    public static int[] field329 = new int[field359];

    @ObfuscatedName("client.fg")
    public static int[] field387 = new int[field359];

    @ObfuscatedName("client.ft")
    public static int[] field331 = new int[field359];

    @ObfuscatedName("client.gh")
    public static int[] field332 = new int[field359];

    @ObfuscatedName("client.gx")
    public static int[] field333 = new int[field359];

    @ObfuscatedName("client.gl")
    public static int[] field437 = new int[field359];

    @ObfuscatedName("client.gf")
    public static String[] field335 = new String[field359];

    @ObfuscatedName("client.go")
    public static int[][] field336 = new int[104][104];

    @ObfuscatedName("client.ge")
    public static int field337 = 0;

    @ObfuscatedName("client.gi")
    public static int field338 = -1;

    @ObfuscatedName("client.gq")
    public static int field339 = -1;

    @ObfuscatedName("client.gu")
    public static int field340 = 0;

    @ObfuscatedName("client.gd")
    public static int field341 = 0;

    @ObfuscatedName("client.gj")
    public static int field342 = 0;

    @ObfuscatedName("client.gt")
    public static int field343 = 0;

    @ObfuscatedName("client.gk")
    public static int field344 = 0;

    @ObfuscatedName("client.gp")
    public static int field345 = 0;

    @ObfuscatedName("client.gv")
    public static int field230 = 0;

    @ObfuscatedName("client.gr")
    public static int field232 = 0;

    @ObfuscatedName("client.gz")
    public static int field348 = 0;

    @ObfuscatedName("client.gc")
    public static int field349 = 0;

    @ObfuscatedName("client.gn")
    public static boolean field432 = false;

    @ObfuscatedName("client.ga")
    public static int field351 = 0;

    @ObfuscatedName("client.gb")
    public static int field352 = 0;

    @ObfuscatedName("client.hz")
    public static class3[] field276 = new class3[2048];

    @ObfuscatedName("client.hi")
    public static int field354 = 0;

    @ObfuscatedName("client.hx")
    public static int[] field355 = new int[2048];

    @ObfuscatedName("client.hl")
    public static int field356 = 0;

    @ObfuscatedName("client.hg")
    public static int[] field267 = new int[2048];

    @ObfuscatedName("client.hu")
    public static class110[] field497 = new class110[2048];

    @ObfuscatedName("client.ht")
    public static int field326 = -1;

    @ObfuscatedName("client.hv")
    public static int field374 = 0;

    @ObfuscatedName("client.hj")
    public static int field361 = 0;

    @ObfuscatedName("client.hn")
    public static int[] field362 = new int[1000];

    @ObfuscatedName("client.hp")
    public static final int[] field350 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hs")
    public static String[] field295 = new String[8];

    @ObfuscatedName("client.hy")
    public static boolean[] field365 = new boolean[8];

    @ObfuscatedName("client.hb")
    public static int[] field358 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hm")
    public static int field367 = -1;

    @ObfuscatedName("client.hd")
    public static class182[][][] field368 = new class182[4][104][104];

    @ObfuscatedName("client.hf")
    public static class182 field369 = new class182();

    @ObfuscatedName("client.hq")
    public static class182 field370 = new class182();

    @ObfuscatedName("client.hh")
    public static class182 field371 = new class182();

    @ObfuscatedName("client.ho")
    public static int[] field372 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field373 = new int[25];

    @ObfuscatedName("client.hc")
    public static int[] field293 = new int[25];

    @ObfuscatedName("client.he")
    public static int field446 = 0;

    @ObfuscatedName("client.io")
    public static boolean field376 = false;

    @ObfuscatedName("client.ik")
    public static int field441 = 0;

    @ObfuscatedName("client.is")
    public static int[] field408 = new int[500];

    @ObfuscatedName("client.ia")
    public static int[] field463 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field380 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field381 = new int[500];

    @ObfuscatedName("client.iv")
    public static String[] field346 = new String[500];

    @ObfuscatedName("client.iu")
    public static String[] field383 = new String[500];

    @ObfuscatedName("client.im")
    public static int field384 = -1;

    @ObfuscatedName("client.ii")
    public static int field430 = -1;

    @ObfuscatedName("client.ie")
    public static int field386 = 0;

    @ObfuscatedName("client.ij")
    public static int field303 = 50;

    @ObfuscatedName("client.ic")
    public static int field388 = 0;

    @ObfuscatedName("client.it")
    public static String field390 = null;

    @ObfuscatedName("client.ir")
    public static boolean field363 = false;

    @ObfuscatedName("client.js")
    public static int field391 = -1;

    @ObfuscatedName("client.je")
    public static int field392 = -1;

    @ObfuscatedName("client.jo")
    public static String field393 = null;

    @ObfuscatedName("client.jn")
    public static String field394 = null;

    @ObfuscatedName("client.ji")
    public static int field395 = -1;

    @ObfuscatedName("client.jv")
    public static class179 field396 = new class179(8);

    @ObfuscatedName("client.jp")
    public static int field397 = 0;

    @ObfuscatedName("client.jb")
    public static int field398 = 0;

    @ObfuscatedName("client.jl")
    public static class157 field399 = null;

    @ObfuscatedName("client.jr")
    public static int field323 = 0;

    @ObfuscatedName("client.jk")
    public static int field401 = 0;

    @ObfuscatedName("client.ja")
    public static int field402 = 0;

    @ObfuscatedName("client.jh")
    public static int field281 = -1;

    @ObfuscatedName("client.jj")
    public static boolean field404 = false;

    @ObfuscatedName("client.jd")
    public static boolean field405 = false;

    @ObfuscatedName("client.jy")
    public static boolean field455 = false;

    @ObfuscatedName("client.ju")
    public static class157 field297 = null;

    @ObfuscatedName("client.jq")
    public static class157 field265 = null;

    @ObfuscatedName("client.jx")
    public static int field364 = 0;

    @ObfuscatedName("client.jw")
    public static int field410 = 0;

    @ObfuscatedName("client.jg")
    public static class157 field411 = null;

    @ObfuscatedName("client.jt")
    public static boolean field412 = false;

    @ObfuscatedName("client.jm")
    public static int field445 = -1;

    @ObfuscatedName("client.jz")
    public static int field236 = -1;

    @ObfuscatedName("client.ks")
    public static boolean field415 = false;

    @ObfuscatedName("client.kp")
    public static int field416 = -1;

    @ObfuscatedName("client.kg")
    public static int field300 = -1;

    @ObfuscatedName("client.kz")
    public static boolean field418 = false;

    @ObfuscatedName("client.kc")
    public static int field471 = 1;

    @ObfuscatedName("client.kh")
    public static int[] field420 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field421 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field422 = new int[32];

    @ObfuscatedName("client.ka")
    public static int field334 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field424 = new int[32];

    @ObfuscatedName("client.ke")
    public static int field425 = 0;

    @ObfuscatedName("client.kb")
    public static int field426 = 0;

    @ObfuscatedName("client.kt")
    public static int field427 = 0;

    @ObfuscatedName("client.kw")
    public static int field419 = 0;

    @ObfuscatedName("client.kk")
    public static int field429 = 0;

    @ObfuscatedName("client.kj")
    public static int field499 = 0;

    @ObfuscatedName("client.ky")
    public static int field431 = 0;

    @ObfuscatedName("client.kf")
    public static int[] field400 = new int[2000];

    @ObfuscatedName("client.ku")
    public static String[] field433 = new String[1000];

    @ObfuscatedName("client.lm")
    public static int field434 = 0;

    @ObfuscatedName("client.lc")
    public static class182 field435 = new class182();

    @ObfuscatedName("client.lq")
    public static class182 field436 = new class182();

    @ObfuscatedName("client.lj")
    public static class182 field409 = new class182();

    @ObfuscatedName("client.ly")
    public static class179 field347 = new class179(512);

    @ObfuscatedName("client.lg")
    public static int field440 = 0;

    @ObfuscatedName("client.lf")
    public static int field461 = -2;

    @ObfuscatedName("client.la")
    public static boolean[] field442 = new boolean[100];

    @ObfuscatedName("client.lh")
    public static boolean[] field443 = new boolean[100];

    @ObfuscatedName("client.ll")
    public static boolean[] field444 = new boolean[100];

    @ObfuscatedName("client.lz")
    public static int[] field377 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field385 = new int[100];

    @ObfuscatedName("client.lr")
    public static int[] field284 = new int[100];

    @ObfuscatedName("client.lx")
    public static int[] field438 = new int[100];

    @ObfuscatedName("client.le")
    public static int field449 = 0;

    @ObfuscatedName("client.lt")
    public static int[] field450 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.li")
    public static int field451 = 0;

    @ObfuscatedName("client.lv")
    public static int field439 = 0;

    @ObfuscatedName("client.ln")
    public static String field453 = "";

    @ObfuscatedName("client.lo")
    public static long[] field360 = new long[100];

    @ObfuscatedName("client.lb")
    public static int field417 = 0;

    @ObfuscatedName("client.lk")
    public static int field456 = 0;

    @ObfuscatedName("client.mi")
    public static int[] field299 = new int[128];

    @ObfuscatedName("client.mh")
    public static int[] field458 = new int[128];

    @ObfuscatedName("client.mc")
    public static long field459 = -1L;

    @ObfuscatedName("client.mg")
    public static String field460 = null;

    @ObfuscatedName("client.ma")
    public static String field423 = null;

    @ObfuscatedName("client.mo")
    public static int field462 = -1;

    @ObfuscatedName("client.mr")
    public static int field378 = 0;

    @ObfuscatedName("client.mq")
    public static int[] field464 = new int[1000];

    @ObfuscatedName("client.mj")
    public static int[] field465 = new int[1000];

    @ObfuscatedName("client.mp")
    public static class73[] field466 = new class73[1000];

    @ObfuscatedName("client.mz")
    public static int field479 = 0;

    @ObfuscatedName("client.mf")
    public static int field468 = 0;

    @ObfuscatedName("client.mn")
    public static int field500 = 0;

    @ObfuscatedName("client.mt")
    public static int field470 = 255;

    @ObfuscatedName("client.mk")
    public static int field469 = -1;

    @ObfuscatedName("client.ms")
    public static boolean field472 = false;

    @ObfuscatedName("client.nx")
    public static int field473 = 127;

    @ObfuscatedName("client.na")
    public static int field474 = 127;

    @ObfuscatedName("client.nq")
    public static int field475 = 0;

    @ObfuscatedName("client.nk")
    public static int[] field476 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field452 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field478 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field379 = new int[50];

    @ObfuscatedName("client.ny")
    public static class53[] field257 = new class53[50];

    @ObfuscatedName("client.nl")
    public static boolean field481 = false;

    @ObfuscatedName("client.of")
    public static boolean[] field482 = new boolean[5];

    @ObfuscatedName("client.ok")
    public static int[] field278 = new int[5];

    @ObfuscatedName("client.oh")
    public static int[] field484 = new int[5];

    @ObfuscatedName("client.oi")
    public static int[] field485 = new int[5];

    @ObfuscatedName("client.ob")
    public static int[] field486 = new int[5];

    @ObfuscatedName("client.oj")
    public static int field487 = 0;

    @ObfuscatedName("client.oc")
    public static int field488 = 0;

    @ObfuscatedName("client.oy")
    public static class16[] field489 = new class16[400];

    @ObfuscatedName("client.om")
    public static class178 field490 = new class178();

    @ObfuscatedName("client.og")
    public static int field491 = 0;

    @ObfuscatedName("client.ot")
    public static class8[] field492 = new class8[400];

    @ObfuscatedName("client.oq")
    public static class162 field493 = new class162();

    @ObfuscatedName("client.od")
    public static int field494 = -1;

    @ObfuscatedName("client.oz")
    public static int field495 = -1;

    @ObfuscatedName("client.oo")
    public static class203[] field496 = new class203[6];

    @ObfuscatedName("client.r(S)V")
    public final void method174() {
    }

    public final void init() {
        if (!this.method2625()) {
            return;
        }
        class173[] var1 = class173.method617();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2856);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2856)) {
                    case 1:
                        Statics.field1886 = Integer.parseInt(var4);
                        break;
                    case 2:
                        if (var4.equalsIgnoreCase(class2.field15)) {
                        }
                        break;
                    case 3:
                        Statics.field375 = class143.method2539(Integer.parseInt(var4));
                    case 4:
                    case 7:
                    case 10:
                    default:
                        break;
                    case 5:
                        Statics.field66 = var4;
                        break;
                    case 6:
                        Statics.field330 = (class144) Statics.method620(class144.method598(), Integer.parseInt(var4));
                        if (Statics.field330 == class144.field2135) {
                            Statics.field237 = class195.field2931;
                        } else {
                            Statics.field237 = class195.field2929;
                        }
                        break;
                    case 8:
                        field233 = Integer.parseInt(var4);
                        break;
                    case 9:
                        Statics.field525 = var4;
                        break;
                    case 11:
                        field235 = Integer.parseInt(var4);
                        break;
                    case 12:
                        field269 = Integer.parseInt(var4);
                        break;
                    case 13:
                        if (var4.equalsIgnoreCase(class2.field15)) {
                            field250 = true;
                        } else {
                            field250 = false;
                        }
                        break;
                    case 14:
                        field240 = Integer.parseInt(var4);
                        break;
                    case 15:
                        Statics.field61 = Integer.parseInt(var4);
                }
            }
        }
        method3634();
        Statics.field1447 = this.getCodeBase().getHost();
        String var5 = Statics.field375.field2126;
        byte var6 = 0;
        try {
            class140.method1978("oldschool", var5, var6, 16);
        } catch (Exception var8) {
            class139.method2074((String) null, var8);
        }
        Statics.field602 = this;
        this.method2688(765, 503, 76);
    }

    @ObfuscatedName("hx.z(B)V")
    public static final void method3634() {
        class80.field1350 = false;
        field317 = false;
    }

    @ObfuscatedName("client.o(I)V")
    public final void method177() {
        Statics.field81 = field235 == 0 ? 43594 : field269 + 40000;
        Statics.field2515 = field235 == 0 ? 443 : field269 + 50000;
        Statics.field2429 = Statics.field81;
        Statics.field2700 = class158.field2676;
        Statics.field2705 = class158.field2672;
        Statics.field185 = class158.field2673;
        Statics.field2702 = class158.field2674;
        class128.method2394();
        class128.method2054(Statics.field877);
        class131.method2726(Statics.field877);
        Statics.field553 = class122.method29();
        if (Statics.field553 != null) {
            Statics.field553.method2440(Statics.field877);
        }
        Statics.field1651 = new class125(255, class140.field2097, class140.field2098, 500000);
        class209 var1 = null;
        class9 var2 = new class9();
        try {
            var1 = class140.method561("", Statics.field330.field2136, false);
            byte[] var3 = new byte[(int) var1.method3565()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method3570(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class9(new class110(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method3564();
            }
        } catch (Exception var9) {
        }
        Statics.field1993 = var2;
        Statics.field627 = this.getToolkit().getSystemClipboard();
        class129.method846(this, Statics.field1759);
        if (field235 != 0) {
            field249 = true;
        }
    }

    @ObfuscatedName("client.k(B)V")
    public final void method178() {
        field243++;
        this.method181();
        while (true) {
            class182 var1 = class154.field2510;
            class153 var2;
            synchronized (class154.field2510) {
                var2 = (class153) class154.field2513.method3279();
            }
            if (var2 == null) {
                class166.method2709();
                method2930();
                class128 var4 = class128.field1983;
                synchronized (class128.field1983) {
                    class128.field1981++;
                    class128.field1961 = class128.field1980;
                    class128.field1977 = 0;
                    if (class128.field1973 >= 0) {
                        while (class128.field1973 != class128.field1972) {
                            int var6 = class128.field1971[class128.field1972];
                            class128.field1972 = class128.field1972 + 1 & 0x7F;
                            if (var6 < 0) {
                                class128.field1978[~var6] = false;
                            } else {
                                if (!class128.field1978[var6] && class128.field1977 < class128.field1976.length - 1) {
                                    class128.field1976[++class128.field1977 - 1] = var6;
                                }
                                class128.field1978[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class128.field1978[var5] = false;
                        }
                        class128.field1973 = class128.field1972;
                    }
                    class128.field1980 = class128.field1979;
                }
                class131.method619();
                if (Statics.field553 != null) {
                    int var8 = Statics.field553.method2442();
                    field434 = var8;
                }
                if (field241 == 0) {
                    method2536();
                    Statics.field626.method2455();
                    for (int var9 = 0; var9 < 32; var9++) {
                        field2062[var9] = 0L;
                    }
                    for (int var10 = 0; var10 < 32; var10++) {
                        field2063[var10] = 0L;
                    }
                    Statics.field183 = 0;
                } else if (field241 == 5) {
                    class29.method1988(this);
                    method2536();
                    Statics.field626.method2455();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field2062[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field2063[var12] = 0L;
                    }
                    Statics.field183 = 0;
                } else if (field241 == 10 || field241 == 11) {
                    class29.method1988(this);
                } else if (field241 == 20) {
                    class29.method1988(this);
                    method137();
                } else if (field241 == 25) {
                    method1617();
                }
                if (field241 == 30) {
                    method516();
                } else if (field241 == 40 || field241 == 45) {
                    method137();
                }
                return;
            }
            var2.field2505.method2824(var2.field2501, (int) var2.field2903, var2.field2502, false);
        }
    }

    @ObfuscatedName("client.s(I)V")
    public final void method313() {
        boolean var1 = class166.method3182();
        if (var1 && field472 && Statics.field108 != null) {
            Statics.field108.method1016();
        }
        if (field2056) {
            class128.method1410(Statics.field877);
            class131.method2556(Statics.field877);
            if (Statics.field553 != null) {
                Statics.field553.method2441(Statics.field877);
            }
            this.method2624();
            Canvas var2 = Statics.field877;
            var2.setFocusTraversalKeysEnabled(false);
            var2.addKeyListener(class128.field1983);
            var2.addFocusListener(class128.field1983);
            class131.method2726(Statics.field877);
            if (Statics.field553 != null) {
                Statics.field553.method2440(Statics.field877);
            }
        }
        if (field241 == 0) {
            int var3 = class29.field638;
            String var4 = class29.field647;
            Color var5 = null;
            try {
                Graphics var6 = Statics.field877.getGraphics();
                if (Statics.field930 == null) {
                    Statics.field930 = new Font("Helvetica", 1, 13);
                    Statics.field1453 = Statics.field877.getFontMetrics(Statics.field930);
                }
                if (field2054) {
                    field2054 = false;
                    var6.setColor(Color.black);
                    var6.fillRect(0, 0, Statics.field1517, Statics.field2508);
                }
                if (var5 == null) {
                    var5 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1340 == null) {
                        Statics.field1340 = Statics.field877.createImage(304, 34);
                    }
                    Graphics var7 = Statics.field1340.getGraphics();
                    var7.setColor(var5);
                    var7.drawRect(0, 0, 303, 33);
                    var7.fillRect(2, 2, var3 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(1, 1, 301, 31);
                    var7.fillRect(var3 * 3 + 2, 2, 300 - var3 * 3, 30);
                    var7.setFont(Statics.field930);
                    var7.setColor(Color.white);
                    var7.drawString(var4, (304 - Statics.field1453.stringWidth(var4)) / 2, 22);
                    var6.drawImage(Statics.field1340, Statics.field1517 / 2 - 152, Statics.field2508 / 2 - 18, (ImageObserver) null);
                } catch (Exception var20) {
                    int var9 = Statics.field1517 / 2 - 152;
                    int var10 = Statics.field2508 / 2 - 18;
                    var6.setColor(var5);
                    var6.drawRect(var9, var10, 303, 33);
                    var6.fillRect(var9 + 2, var10 + 2, var3 * 3, 30);
                    var6.setColor(Color.black);
                    var6.drawRect(var9 + 1, var10 + 1, 301, 31);
                    var6.fillRect(var3 * 3 + var9 + 2, var10 + 2, 300 - var3 * 3, 30);
                    var6.setFont(Statics.field930);
                    var6.setColor(Color.white);
                    var6.drawString(var4, var9 + (304 - Statics.field1453.stringWidth(var4)) / 2, var10 + 22);
                }
            } catch (Exception var21) {
                Statics.field877.repaint();
            }
        } else if (field241 == 5) {
            class29.method2874(Statics.field184, Statics.field215);
        } else if (field241 == 10 || field241 == 11) {
            class29.method2874(Statics.field184, Statics.field215);
        } else if (field241 == 20) {
            class29.method2874(Statics.field184, Statics.field215);
        } else if (field241 == 25) {
            if (field292 == 1) {
                if (field288 > field289) {
                    field289 = field288;
                }
                int var12 = (field289 * 50 - field288 * 50) / field289;
                method563(class147.field2206 + class2.field20 + class2.field17 + var12 + "%" + class2.field25, false);
            } else if (field292 == 2) {
                if (field290 > field238) {
                    field238 = field290;
                }
                int var13 = (field238 * 50 - field290 * 50) / field238 + 50;
                method563(class147.field2206 + class2.field20 + class2.field17 + var13 + "%" + class2.field25, false);
            } else {
                method563(class147.field2206, false);
            }
        } else if (field241 == 30) {
            method1987();
        } else if (field241 == 40) {
            method563(class147.field2174 + class2.field20 + class147.field2222, false);
        } else if (field241 == 45) {
            method563(class147.field2322, false);
        }
        if (field241 == 30 && field449 == 0 && !field2054) {
            try {
                Graphics var14 = Statics.field877.getGraphics();
                for (int var15 = 0; var15 < field440; var15++) {
                    if (field443[var15]) {
                        Statics.field1994.method1401(var14, field377[var15], field385[var15], field284[var15], field438[var15]);
                        field443[var15] = false;
                    }
                }
            } catch (Exception var23) {
                Statics.field877.repaint();
            }
        } else if (field241 > 0) {
            try {
                Graphics var17 = Statics.field877.getGraphics();
                Statics.field1994.method1384(var17, 0, 0);
                field2054 = false;
                for (int var18 = 0; var18 < field440; var18++) {
                    field443[var18] = false;
                }
            } catch (Exception var22) {
                Statics.field877.repaint();
            }
        }
    }

    @ObfuscatedName("client.h(I)V")
    public final void method180() {
        if (Statics.field953 != null) {
            Statics.field953.field156 = false;
        }
        Statics.field953 = null;
        if (Statics.field3046 != null) {
            Statics.field3046.method2611();
            Statics.field3046 = null;
        }
        if (class128.field1983 != null) {
            class128 var1 = class128.field1983;
            synchronized (class128.field1983) {
                class128.field1983 = null;
            }
        }
        if (class131.field2013 != null) {
            class131 var3 = class131.field2013;
            synchronized (class131.field2013) {
                class131.field2013 = null;
            }
        }
        Statics.field553 = null;
        if (Statics.field108 != null) {
            Statics.field108.method1024();
        }
        if (Statics.field112 != null) {
            Statics.field112.method1024();
        }
        if (Statics.field2687 != null) {
            Statics.field2687.method2611();
        }
        Object var5 = class154.field2512;
        synchronized (class154.field2512) {
            if (class154.field2511 != 0) {
                class154.field2511 = 1;
                try {
                    class154.field2512.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        class140.method1899();
    }

    @ObfuscatedName("ad.m(II)V")
    public static void method871(int arg0) {
        if (field241 == arg0) {
            return;
        }
        if (field241 == 0) {
            Statics.field1340 = null;
            Statics.field930 = null;
            Statics.field1453 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field268 = 0;
            field286 = 0;
            field270 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field175 != null) {
            Statics.field175.method2611();
            Statics.field175 = null;
        }
        if (field241 == 25) {
            field292 = 0;
            field288 = 0;
            field289 = 1;
            field290 = 0;
            field238 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class29.method2708(Statics.field877, Statics.field1957, Statics.field1509, true, 0);
        } else if (arg0 == 20) {
            class29.method2708(Statics.field877, Statics.field1957, Statics.field1509, true, field241 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class29.method2708(Statics.field877, Statics.field1957, Statics.field1509, false, 4);
        } else {
            class29.method2732();
        }
        field241 = arg0;
    }

    @ObfuscatedName("client.w(I)V")
    public void method181() {
        if (field241 == 1000) {
            return;
        }
        long var1 = class106.method870();
        int var3 = (int) (var1 - Statics.field2517);
        Statics.field2517 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class155.field2523 += var3;
        boolean var4;
        if (class155.field2526 == 0 && class155.field2529 == 0 && class155.field2524 == 0 && class155.field2522 == 0) {
            var4 = true;
        } else if (Statics.field2687 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class155.field2523 > 30000) {
                        throw new IOException();
                    }
                    while (class155.field2529 < 20 && class155.field2522 > 0) {
                        class156 var5 = (class156) class155.field2536.method3227();
                        class110 var6 = new class110(4);
                        var6.method2110(1);
                        var6.method2112((int) var5.field2903);
                        Statics.field2687.method2599(var6.field1844, 0, 4);
                        class155.field2520.method3225(var5, var5.field2903);
                        class155.field2522--;
                        class155.field2529++;
                    }
                    while (class155.field2526 < 20 && class155.field2524 > 0) {
                        class156 var7 = (class156) class155.field2532.method3327();
                        class110 var8 = new class110(4);
                        var8.method2110(0);
                        var8.method2112((int) var7.field2903);
                        Statics.field2687.method2599(var8.field1844, 0, 4);
                        var7.method3331();
                        class155.field2525.method3225(var7, var7.field2903);
                        class155.field2524--;
                        class155.field2526++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2687.method2597();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class155.field2523 = 0;
                        byte var11 = 0;
                        if (Statics.field1493 == null) {
                            var11 = 8;
                        } else if (class155.field2516 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class155.field2528.field1842;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2687.method2598(class155.field2528.field1844, class155.field2528.field1842, var12);
                            if (class155.field2519 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class155.field2528.field1844[class155.field2528.field1842 + var13] ^= class155.field2519;
                                }
                            }
                            class155.field2528.field1842 += var12;
                            if (class155.field2528.field1842 < var11) {
                                break;
                            }
                            if (Statics.field1493 == null) {
                                class155.field2528.field1842 = 0;
                                int var14 = class155.field2528.method2309();
                                int var15 = class155.field2528.method2243();
                                int var16 = class155.field2528.method2309();
                                int var17 = class155.field2528.method2164();
                                long var18 = (long) ((var14 << 16) + var15);
                                class156 var20 = (class156) class155.field2520.method3224(var18);
                                Statics.field2527 = true;
                                if (var20 == null) {
                                    var20 = (class156) class155.field2525.method3224(var18);
                                    Statics.field2527 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1493 = var20;
                                Statics.field2035 = new class110(var17 + var21 + Statics.field1493.field2539);
                                Statics.field2035.method2110(var16);
                                Statics.field2035.method2113(var17);
                                class155.field2516 = 8;
                                class155.field2528.field1842 = 0;
                            } else if (class155.field2516 == 0) {
                                if (class155.field2528.field1844[0] == -1) {
                                    class155.field2516 = 1;
                                    class155.field2528.field1842 = 0;
                                } else {
                                    Statics.field1493 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2035.field1844.length - Statics.field1493.field2539;
                            int var23 = 512 - class155.field2516;
                            if (var23 > var22 - Statics.field2035.field1842) {
                                var23 = var22 - Statics.field2035.field1842;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2687.method2598(Statics.field2035.field1844, Statics.field2035.field1842, var23);
                            if (class155.field2519 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2035.field1844[Statics.field2035.field1842 + var24] ^= class155.field2519;
                                }
                            }
                            Statics.field2035.field1842 += var23;
                            class155.field2516 += var23;
                            if (Statics.field2035.field1842 == var22) {
                                if (Statics.field1493.field2903 == 16711935L) {
                                    Statics.field878 = Statics.field2035;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class152 var26 = class155.field2531[var25];
                                        if (var26 != null) {
                                            Statics.field878.field1842 = var25 * 8 + 5;
                                            int var27 = Statics.field878.method2164();
                                            int var28 = Statics.field878.method2164();
                                            var26.method2825(var27, var28);
                                        }
                                    }
                                } else {
                                    class155.field2530.reset();
                                    class155.field2530.update(Statics.field2035.field1844, 0, var22);
                                    int var29 = (int) class155.field2530.getValue();
                                    if (Statics.field1493.field2538 != var29) {
                                        try {
                                            Statics.field2687.method2611();
                                        } catch (Exception var35) {
                                        }
                                        class155.field2533++;
                                        Statics.field2687 = null;
                                        class155.field2519 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class155.field2533 = 0;
                                    class155.field2534 = 0;
                                    Statics.field1493.field2537.method2827((int) (Statics.field1493.field2903 & 0xFFFFL), Statics.field2035.field1844, (Statics.field1493.field2903 & 0xFF0000L) == 16711680L, Statics.field2527);
                                }
                                Statics.field1493.method3358();
                                if (Statics.field2527) {
                                    class155.field2529--;
                                } else {
                                    class155.field2526--;
                                }
                                class155.field2516 = 0;
                                Statics.field1493 = null;
                                Statics.field2035 = null;
                            } else {
                                if (class155.field2516 != 512) {
                                    break;
                                }
                                class155.field2516 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2687.method2611();
                } catch (Exception var34) {
                }
                class155.field2534++;
                Statics.field2687 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method182();
        }
    }

    @ObfuscatedName("client.q(I)V")
    public void method182() {
        if (class155.field2533 >= 4) {
            this.method2632("js5crc");
            field241 = 1000;
            return;
        }
        if (class155.field2534 >= 4) {
            if (field241 <= 5) {
                this.method2632("js5io");
                field241 = 1000;
                return;
            }
            field318 = 3000;
            class155.field2534 = 3;
        }
        if (--field318 + 1 > 0) {
            return;
        }
        try {
            if (field454 == 0) {
                Statics.field2037 = Statics.field1115.method2483(Statics.field1447, Statics.field2429);
                field454++;
            }
            if (field454 == 1) {
                if (Statics.field2037.field2074 == 2) {
                    this.method183(-1);
                    return;
                }
                if (Statics.field2037.field2074 == 1) {
                    field454++;
                }
            }
            if (field454 == 2) {
                Statics.field225 = new class134((Socket) Statics.field2037.field2078, Statics.field1115);
                class110 var1 = new class110(5);
                var1.method2110(15);
                var1.method2113(76);
                Statics.field225.method2599(var1.field1844, 0, 5);
                field454++;
                Statics.field2099 = class106.method870();
            }
            if (field454 == 3) {
                if (field241 <= 5 || Statics.field225.method2597() > 0) {
                    int var2 = Statics.field225.method2596();
                    if (var2 != 0) {
                        this.method183(var2);
                        return;
                    }
                    field454++;
                } else if (class106.method870() - Statics.field2099 > 30000L) {
                    this.method183(-2);
                    return;
                }
            }
            if (field454 == 4) {
                class134 var3 = Statics.field225;
                boolean var4 = field241 > 20;
                if (Statics.field2687 != null) {
                    try {
                        Statics.field2687.method2611();
                    } catch (Exception var14) {
                    }
                    Statics.field2687 = null;
                }
                Statics.field2687 = var3;
                class155.method1876(var4);
                class155.field2528.field1842 = 0;
                Statics.field1493 = null;
                Statics.field2035 = null;
                class155.field2516 = 0;
                while (true) {
                    class156 var6 = (class156) class155.field2520.method3227();
                    if (var6 == null) {
                        while (true) {
                            class156 var7 = (class156) class155.field2525.method3227();
                            if (var7 == null) {
                                if (class155.field2519 != 0) {
                                    try {
                                        class110 var8 = new class110(4);
                                        var8.method2110(4);
                                        var8.method2110(class155.field2519);
                                        var8.method2111(0);
                                        Statics.field2687.method2599(var8.field1844, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2687.method2611();
                                        } catch (Exception var12) {
                                        }
                                        class155.field2534++;
                                        Statics.field2687 = null;
                                    }
                                }
                                class155.field2523 = 0;
                                Statics.field2517 = class106.method870();
                                Statics.field2037 = null;
                                Statics.field225 = null;
                                field454 = 0;
                                field234 = 0;
                                return;
                            }
                            class155.field2532.method3316(var7);
                            class155.field2521.method3225(var7, var7.field2903);
                            class155.field2524++;
                            class155.field2526--;
                        }
                    }
                    class155.field2536.method3225(var6, var6.field2903);
                    class155.field2522++;
                    class155.field2529--;
                }
            }
        } catch (IOException var15) {
            this.method183(-3);
        }
    }

    @ObfuscatedName("client.u(II)V")
    public void method183(int arg0) {
        Statics.field2037 = null;
        Statics.field225 = null;
        field454 = 0;
        if (Statics.field81 == Statics.field2429) {
            Statics.field2429 = Statics.field2515;
        } else {
            Statics.field2429 = Statics.field81;
        }
        field234++;
        if (field234 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field241 <= 5) {
                this.method2632("js5connect_full");
                field241 = 1000;
            } else {
                field318 = 3000;
            }
        } else if (field234 >= 2 && arg0 == 6) {
            this.method2632("js5connect_outofdate");
            field241 = 1000;
        } else if (field234 >= 4) {
            if (field241 <= 5) {
                this.method2632("js5connect");
                field241 = 1000;
            } else {
                field318 = 3000;
            }
        }
    }

    @ObfuscatedName("db.e(I)V")
    public static void method2536() {
        if (field263 == 0) {
            Statics.field761 = new class80(4, 104, 104, class6.field74);
            for (int var0 = 0; var0 < 4; var0++) {
                field273[var0] = new class211(104, 104);
            }
            Statics.field2142 = new class73(512, 512);
            class29.field647 = class147.field2210;
            class29.field638 = 5;
            field263 = 20;
        } else if (field263 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1470[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class80.method1681(var1, 500, 800, 512, 334);
            class29.field647 = class147.field2374;
            class29.field638 = 10;
            field263 = 30;
        } else if (field263 == 30) {
            Statics.field2003 = method119(0, false, true, true);
            Statics.field264 = method119(1, false, true, true);
            Statics.field683 = method119(2, true, false, true);
            Statics.field1083 = method119(3, false, true, true);
            Statics.field63 = method119(4, false, true, true);
            Statics.field2085 = method119(5, true, true, true);
            Statics.field1928 = method119(6, true, true, false);
            Statics.field242 = method119(7, false, true, true);
            Statics.field1509 = method119(8, false, true, true);
            Statics.field1114 = method119(9, false, true, true);
            Statics.field1957 = method119(10, false, true, true);
            Statics.field266 = method119(11, false, true, true);
            Statics.field1893 = method119(12, false, true, true);
            Statics.field587 = method119(13, true, false, true);
            Statics.field567 = method119(14, false, true, false);
            Statics.field138 = method119(15, false, true, true);
            class29.field647 = class147.field2395;
            class29.field638 = 20;
            field263 = 40;
        } else if (field263 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2003.method2823() * 4 / 100;
            int var8 = var7 + Statics.field264.method2823() * 4 / 100;
            int var9 = var8 + Statics.field683.method2823() * 2 / 100;
            int var10 = var9 + Statics.field1083.method2823() * 2 / 100;
            int var11 = var10 + Statics.field63.method2823() * 6 / 100;
            int var12 = var11 + Statics.field2085.method2823() * 4 / 100;
            int var13 = var12 + Statics.field1928.method2823() * 2 / 100;
            int var14 = var13 + Statics.field242.method2823() * 60 / 100;
            int var15 = var14 + Statics.field1509.method2823() * 2 / 100;
            int var16 = var15 + Statics.field1114.method2823() * 2 / 100;
            int var17 = var16 + Statics.field1957.method2823() * 2 / 100;
            int var18 = var17 + Statics.field266.method2823() * 2 / 100;
            int var19 = var18 + Statics.field1893.method2823() * 2 / 100;
            int var20 = var19 + Statics.field587.method2823() * 2 / 100;
            int var21 = var20 + Statics.field567.method2823() * 2 / 100;
            int var22 = var21 + Statics.field138.method2823() * 2 / 100;
            if (var22 == 100) {
                class29.field647 = class147.field2240;
                class29.field638 = 30;
                field263 = 45;
            } else {
                if (var22 != 0) {
                    class29.field647 = class147.field2179 + var22 + "%";
                }
                class29.field638 = 30;
            }
        } else if (field263 == 45) {
            boolean var23 = !field317;
            Statics.field1071 = 22050;
            Statics.field1067 = var23;
            Statics.field2959 = 2;
            class167 var24 = new class167();
            var24.method3075(9, 128);
            Statics.field108 = class51.method1891(Statics.field1115, Statics.field877, 0, 22050);
            Statics.field108.method1014(var24);
            class152 var25 = Statics.field138;
            class152 var26 = Statics.field567;
            class152 var27 = Statics.field63;
            Statics.field2741 = var25;
            Statics.field2746 = var26;
            Statics.field2737 = var27;
            Statics.field2738 = var24;
            Statics.field112 = class51.method1891(Statics.field1115, Statics.field877, 1, 2048);
            Statics.field543 = new class50();
            Statics.field112.method1014(Statics.field543);
            Statics.field687 = new class69(22050, Statics.field1071);
            class29.field647 = class147.field2181;
            class29.field638 = 35;
            field263 = 50;
        } else if (field263 == 50) {
            int var28 = 0;
            if (Statics.field215 == null) {
                Statics.field215 = class71.method2729(Statics.field1509, Statics.field587, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field903 == null) {
                Statics.field903 = class71.method2729(Statics.field1509, Statics.field587, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field184 == null) {
                Statics.field184 = class71.method2729(Statics.field1509, Statics.field587, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class29.field647 = class147.field2182 + var28 * 100 / 3 + "%";
                class29.field638 = 40;
            } else {
                Statics.field1576 = new class150(true);
                class29.field647 = class147.field2397;
                class29.field638 = 40;
                field263 = 60;
            }
        } else if (field263 == 60) {
            class152 var29 = Statics.field1957;
            class152 var30 = Statics.field1509;
            int var31 = 0;
            if (var29.method2782("title.jpg", "")) {
                var31++;
            }
            if (var30.method2782("logo", "")) {
                var31++;
            }
            if (var30.method2782("titlebox", "")) {
                var31++;
            }
            if (var30.method2782("titlebutton", "")) {
                var31++;
            }
            if (var30.method2782("runes", "")) {
                var31++;
            }
            if (var30.method2782("title_mute", "")) {
                var31++;
            }
            if (var30.method2814("options_radio_buttons,0")) {
                var31++;
            }
            if (var30.method2814("options_radio_buttons,2")) {
                var31++;
            }
            var30.method2782("sl_back", "");
            var30.method2782("sl_flags", "");
            var30.method2782("sl_arrows", "");
            var30.method2782("sl_stars", "");
            var30.method2782("sl_button", "");
            byte var34 = 8;
            if (var31 < var34) {
                class29.field647 = class147.field2307 + var31 * 100 / var34 + "%";
                class29.field638 = 50;
            } else {
                class29.field647 = class147.field2341;
                class29.field638 = 50;
                method871(5);
                field263 = 70;
            }
        } else if (field263 == 70) {
            if (Statics.field683.method2808()) {
                class152 var36 = Statics.field683;
                Statics.field942 = var36;
                class38.method518(Statics.field683);
                class41.method1895(Statics.field683, Statics.field242);
                class37.method11(Statics.field683, Statics.field242, field317);
                class152 var37 = Statics.field683;
                class152 var38 = Statics.field242;
                Statics.field781 = var37;
                Statics.field790 = var38;
                class152 var39 = Statics.field683;
                class152 var40 = Statics.field242;
                boolean var41 = field250;
                class207 var42 = Statics.field215;
                Statics.field2955 = var39;
                Statics.field1823 = var40;
                Statics.field992 = var41;
                Statics.field549 = Statics.field2955.method2757(10);
                Statics.field1270 = var42;
                class152 var43 = Statics.field683;
                class152 var44 = Statics.field2003;
                class152 var45 = Statics.field264;
                Statics.field885 = var43;
                Statics.field901 = var44;
                Statics.field883 = var45;
                class40.method2322(Statics.field683, Statics.field242);
                class43.method1900(Statics.field683);
                class152 var46 = Statics.field683;
                Statics.field1049 = var46;
                Statics.field3028 = Statics.field1049.method2757(16);
                class157.method1989(Statics.field1083, Statics.field242, Statics.field1509, Statics.field587);
                class152 var47 = Statics.field683;
                Statics.field987 = var47;
                class152 var48 = Statics.field683;
                Statics.field968 = var48;
                class29.field647 = class147.field2187;
                class29.field638 = 60;
                field263 = 80;
            } else {
                class29.field647 = class147.field2389 + Statics.field683.method2846() + "%";
                class29.field638 = 60;
            }
        } else if (field263 == 80) {
            int var49 = 0;
            if (Statics.field2815 == null) {
                class152 var50 = Statics.field1509;
                int var51 = var50.method2762("compass");
                int var52 = var50.method2763(var51, "");
                class73 var53;
                if (class71.method545(var50, var51, var52)) {
                    class73 var54 = new class73();
                    var54.field1299 = Statics.field1278;
                    var54.field1300 = Statics.field1279;
                    var54.field1304 = Statics.field1280[0];
                    var54.field1298 = Statics.field1287[0];
                    var54.field1302 = Statics.field1107[0];
                    var54.field1296 = Statics.field3029[0];
                    int var55 = var54.field1302 * var54.field1296;
                    byte[] var56 = Statics.field1283[0];
                    var54.field1295 = new int[var55];
                    for (int var57 = 0; var57 < var55; var57++) {
                        var54.field1295[var57] = Statics.field1282[var56[var57] & 0xFF];
                    }
                    class71.method1379();
                    var53 = var54;
                } else {
                    var53 = null;
                }
                Statics.field2815 = var53;
            } else {
                var49++;
            }
            if (Statics.field872 == null) {
                class152 var60 = Statics.field1509;
                int var61 = var60.method2762("mapedge");
                int var62 = var60.method2763(var61, "");
                class73 var63;
                if (class71.method545(var60, var61, var62)) {
                    class73 var64 = new class73();
                    var64.field1299 = Statics.field1278;
                    var64.field1300 = Statics.field1279;
                    var64.field1304 = Statics.field1280[0];
                    var64.field1298 = Statics.field1287[0];
                    var64.field1302 = Statics.field1107[0];
                    var64.field1296 = Statics.field3029[0];
                    int var65 = var64.field1302 * var64.field1296;
                    byte[] var66 = Statics.field1283[0];
                    var64.field1295 = new int[var65];
                    for (int var67 = 0; var67 < var65; var67++) {
                        var64.field1295[var67] = Statics.field1282[var66[var67] & 0xFF];
                    }
                    class71.method1379();
                    var63 = var64;
                } else {
                    var63 = null;
                }
                Statics.field872 = var63;
            } else {
                var49++;
            }
            if (Statics.field1043 == null) {
                Statics.field1043 = Statics.method124(Statics.field1509, "mapscene", "");
            } else {
                var49++;
            }
            if (Statics.field870 == null) {
                Statics.field870 = class71.method778(Statics.field1509, "mapfunction", "");
            } else {
                var49++;
            }
            if (Statics.field64 == null) {
                Statics.field64 = class71.method778(Statics.field1509, "hitmarks", "");
            } else {
                var49++;
            }
            if (Statics.field2052 == null) {
                Statics.field2052 = class71.method778(Statics.field1509, "headicons_pk", "");
            } else {
                var49++;
            }
            if (Statics.field1508 == null) {
                Statics.field1508 = class71.method778(Statics.field1509, "headicons_prayer", "");
            } else {
                var49++;
            }
            if (Statics.field1526 == null) {
                Statics.field1526 = class71.method778(Statics.field1509, "headicons_hint", "");
            } else {
                var49++;
            }
            if (Statics.field1269 == null) {
                Statics.field1269 = class71.method778(Statics.field1509, "mapmarker", "");
            } else {
                var49++;
            }
            if (Statics.field165 == null) {
                Statics.field165 = class71.method778(Statics.field1509, "cross", "");
            } else {
                var49++;
            }
            if (Statics.field198 == null) {
                Statics.field198 = class71.method778(Statics.field1509, "mapdots", "");
            } else {
                var49++;
            }
            if (Statics.field11 == null) {
                Statics.field11 = Statics.method124(Statics.field1509, "scrollbar", "");
            } else {
                var49++;
            }
            if (Statics.field1891 == null) {
                Statics.field1891 = Statics.method124(Statics.field1509, "mod_icons", "");
            } else {
                var49++;
            }
            if (Statics.field2148 == null) {
                Statics.field2148 = class71.method2424(Statics.field1509, "mapback", "");
            } else {
                var49++;
            }
            if (var49 < 14) {
                class29.field647 = class147.field2188 + var49 * 100 / 14 + "%";
                class29.field638 = 70;
            } else {
                Statics.field2987 = Statics.field1891;
                Statics.field872.method1455();
                int var70 = (int) (Math.random() * 21.0D) - 10;
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 21.0D) - 10;
                int var73 = (int) (Math.random() * 41.0D) - 20;
                for (int var74 = 0; var74 < Statics.field870.length; var74++) {
                    Statics.field870[var74].method1454(var70 + var73, var71 + var73, var72 + var73);
                }
                Statics.field1043[0].method1598(var70 + var73, var71 + var73, var72 + var73);
                method504();
                class29.field647 = class147.field2189;
                class29.field638 = 70;
                field263 = 90;
            }
        } else if (field263 == 90) {
            if (Statics.field1114.method2808()) {
                class89 var75 = new class89(Statics.field1114, Statics.field1509, 20, 0.8D, field317 ? 64 : 128);
                class85.method1835(var75);
                class85.method1820(0.8D);
                class29.field647 = class147.field2191;
                class29.field638 = 90;
                field263 = 110;
            } else {
                class29.field647 = class147.field2183 + Statics.field1114.method2846() + "%";
                class29.field638 = 90;
            }
        } else if (field263 == 110) {
            Statics.field953 = new class12();
            Statics.field1115.method2500(Statics.field953, 10);
            class29.field647 = class147.field2220;
            class29.field638 = 94;
            field263 = 120;
        } else if (field263 == 120) {
            if (Statics.field1957.method2782("huffman", "")) {
                class104 var76 = new class104(Statics.field1957.method2764("huffman", ""));
                class205.method1896(var76);
                class29.field647 = class147.field2180;
                class29.field638 = 96;
                field263 = 130;
            } else {
                class29.field647 = class147.field2193 + "%";
                class29.field638 = 96;
            }
        } else if (field263 == 130) {
            if (!Statics.field1083.method2808()) {
                class29.field647 = class147.field2195 + Statics.field1083.method2846() * 4 / 5 + "%";
                class29.field638 = 100;
            } else if (!Statics.field1893.method2808()) {
                class29.field647 = class147.field2195 + (80 + Statics.field1893.method2846() / 6) + "%";
                class29.field638 = 100;
            } else if (Statics.field587.method2808()) {
                class29.field647 = class147.field2286;
                class29.field638 = 100;
                field263 = 140;
            } else {
                class29.field647 = class147.field2195 + (96 + Statics.field587.method2846() / 20) + "%";
                class29.field638 = 100;
            }
        } else if (field263 == 140) {
            method871(10);
        }
    }

    @ObfuscatedName("s.b(IZZZB)Les;")
    public static class152 method119(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class125 var4 = null;
        if (class140.field2097 != null) {
            var4 = new class125(arg0, class140.field2097, Statics.field62[arg0], 1000000);
        }
        return new class152(var4, Statics.field1651, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("j.g(B)V")
    public static void method504() {
        Statics.field1882 = new int[33];
        Statics.field2707 = new int[33];
        Statics.field321 = new int[151];
        Statics.field2693 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field2148.field1316[Statics.field2148.field1315 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field1882[var0] = var1;
            Statics.field2707[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field2148.field1316[Statics.field2148.field1315 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field321[var4 - 5] = var5 - 25;
            Statics.field2693[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("m.j(I)V")
    public static final void method137() {
        try {
            if (field268 == 0) {
                if (Statics.field3046 != null) {
                    Statics.field3046.method2611();
                    Statics.field3046 = null;
                }
                Statics.field769 = null;
                field448 = false;
                field286 = 0;
                field268 = 1;
            }
            if (field268 == 1) {
                if (Statics.field769 == null) {
                    Statics.field769 = Statics.field1115.method2483(Statics.field1447, Statics.field2429);
                }
                if (Statics.field769.field2074 == 2) {
                    throw new IOException();
                }
                if (Statics.field769.field2074 == 1) {
                    Statics.field3046 = new class134((Socket) Statics.field769.field2078, Statics.field1115);
                    Statics.field769 = null;
                    field268 = 2;
                }
            }
            if (field268 == 2) {
                field275.field1842 = 0;
                field275.method2110(14);
                Statics.field3046.method2599(field275.field1844, 0, 1);
                field277.field1842 = 0;
                field268 = 3;
            }
            if (field268 == 3) {
                if (Statics.field108 != null) {
                    Statics.field108.method1021();
                }
                if (Statics.field112 != null) {
                    Statics.field112.method1021();
                }
                int var0 = Statics.field3046.method2596();
                if (Statics.field108 != null) {
                    Statics.field108.method1021();
                }
                if (Statics.field112 != null) {
                    Statics.field112.method1021();
                }
                if (var0 != 0) {
                    method2462(var0);
                    return;
                }
                field277.field1842 = 0;
                field268 = 5;
            }
            if (field268 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field275.field1842 = 0;
                field275.method2110(1);
                field275.method2110(class29.field655.method490());
                field275.method2113(var1[0]);
                field275.method2113(var1[1]);
                field275.method2113(var1[2]);
                field275.method2113(var1[3]);
                switch(class29.field655.field2424) {
                    case 0:
                        field275.field1842 += 8;
                        break;
                    case 1:
                    case 2:
                        field275.method2112(Statics.field2950);
                        field275.field1842 += 5;
                        break;
                    case 3:
                        field275.method2113((Integer) Statics.field1993.field128.get(class213.method2058(class29.field637)));
                        field275.field1842 += 4;
                }
                field275.method2314(class29.field654);
                field275.method2142(class5.field65, class5.field59);
                field261.field1842 = 0;
                if (field241 == 40) {
                    field261.method2110(18);
                } else {
                    field261.method2110(16);
                }
                field261.method2111(0);
                int var2 = field261.field1842;
                field261.method2113(76);
                field261.method2118(field275.field1844, 0, field275.field1842);
                int var3 = field261.field1842;
                field261.method2314(class29.field637);
                field261.method2110(field317 ? 1 : 0);
                class140.method129(field261);
                field261.method2314(Statics.field66);
                field261.method2113(Statics.field1886);
                class110 var4 = new class110(Statics.field1576.method2736());
                Statics.field1576.method2735(var4);
                field261.method2118(var4.field1844, 0, var4.field1844.length);
                field261.method2110(Statics.field61);
                field261.method2113(Statics.field2003.field2480);
                field261.method2113(Statics.field264.field2480);
                field261.method2113(Statics.field683.field2480);
                field261.method2113(Statics.field1083.field2480);
                field261.method2113(Statics.field63.field2480);
                field261.method2113(Statics.field2085.field2480);
                field261.method2113(Statics.field1928.field2480);
                field261.method2113(Statics.field242.field2480);
                field261.method2113(Statics.field1509.field2480);
                field261.method2113(Statics.field1114.field2480);
                field261.method2113(Statics.field1957.field2480);
                field261.method2113(Statics.field266.field2480);
                field261.method2113(Statics.field1893.field2480);
                field261.method2113(Statics.field587.field2480);
                field261.method2113(Statics.field567.field2480);
                field261.method2113(Statics.field138.field2480);
                field261.method2251(var1, var3, field261.field1842);
                field261.method2120(field261.field1842 - var2);
                Statics.field3046.method2599(field261.field1844, 0, field261.field1842);
                field275.method2366(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field277.method2366(var1);
                field268 = 6;
            }
            if (field268 == 6 && Statics.field3046.method2597() > 0) {
                int var6 = Statics.field3046.method2596();
                if (var6 == 21 && field241 == 20) {
                    field268 = 7;
                } else if (var6 == 2) {
                    field268 = 9;
                } else if (var6 == 15 && field241 == 40) {
                    method1798();
                    return;
                } else if (var6 == 23 && field270 < 1) {
                    field270++;
                    field268 = 0;
                } else {
                    method2462(var6);
                    return;
                }
            }
            if (field268 == 7 && Statics.field3046.method2597() > 0) {
                field271 = (Statics.field3046.method2596() + 3) * 60;
                field268 = 8;
            }
            if (field268 == 8) {
                field286 = 0;
                class29.method668(class147.field2200, class147.field2201, field271 / 60 + class147.field2202);
                if (--field271 <= 0) {
                    field268 = 0;
                }
            } else {
                if (field268 == 9 && Statics.field3046.method2597() >= 13) {
                    boolean var7 = Statics.field3046.method2596() == 1;
                    Statics.field3046.method2598(field277.field1844, 0, 4);
                    field277.field1842 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field277.method2368() << 24;
                        int var10 = var9 | field277.method2368() << 16;
                        int var11 = var10 | field277.method2368() << 8;
                        int var12 = var11 | field277.method2368();
                        int var13 = class213.method2058(class29.field637);
                        if (Statics.field1993.field128.size() >= 10 && !Statics.field1993.field128.containsKey(var13)) {
                            Iterator var14 = Statics.field1993.field128.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field1993.field128.put(var13, var12);
                        class9.method3364();
                    }
                    field402 = Statics.field3046.method2596();
                    field404 = Statics.field3046.method2596() == 1;
                    field326 = Statics.field3046.method2596();
                    field326 <<= 0x8;
                    field326 += Statics.field3046.method2596();
                    field374 = Statics.field3046.method2596();
                    Statics.field3046.method2598(field277.field1844, 0, 1);
                    field277.field1842 = 0;
                    field279 = field277.method2368();
                    Statics.field3046.method2598(field277.field1844, 0, 2);
                    field277.field1842 = 0;
                    field413 = field277.method2243();
                    if (field374 == 1) {
                        try {
                            class123.method2453(Statics.field602, "zap");
                        } catch (Throwable var19) {
                        }
                    } else {
                        try {
                            class123.method2453(Statics.field602, "unzap");
                        } catch (Throwable var18) {
                        }
                    }
                    field268 = 10;
                }
                if (field268 != 10) {
                    field286++;
                    if (field286 > 2000) {
                        if (field270 < 1) {
                            if (Statics.field81 == Statics.field2429) {
                                Statics.field2429 = Statics.field2515;
                            } else {
                                Statics.field2429 = Statics.field81;
                            }
                            field270++;
                            field268 = 0;
                        } else {
                            method2462(-3);
                        }
                    }
                } else if (Statics.field3046.method2597() >= field413) {
                    field277.field1842 = 0;
                    Statics.field3046.method2598(field277.field1844, 0, field413);
                    method1879();
                    Statics.field1414 = -1;
                    method1897(false);
                    field279 = -1;
                }
            }
        } catch (IOException var20) {
            if (field270 < 1) {
                if (Statics.field81 == Statics.field2429) {
                    Statics.field2429 = Statics.field2515;
                } else {
                    Statics.field2429 = Statics.field81;
                }
                field270++;
                field268 = 0;
            } else {
                method2462(-2);
            }
        }
    }

    @ObfuscatedName("cg.a(I)V")
    public static void method1879() {
        field353 = -1L;
        field247 = -1;
        Statics.field953.field163 = 0;
        Statics.field1413 = true;
        field248 = true;
        field459 = -1L;
        class194.method558();
        field275.field1842 = 0;
        field277.field1842 = 0;
        field279 = -1;
        field283 = -1;
        field483 = -1;
        field285 = -1;
        field280 = 0;
        field312 = 0;
        field301 = 0;
        field251 = 0;
        field441 = 0;
        field376 = false;
        class131.field2004 = 0;
        class10.method3644();
        field388 = 0;
        field363 = false;
        field475 = 0;
        field457 = (int) (Math.random() * 100.0D) - 50;
        field357 = (int) (Math.random() * 110.0D) - 55;
        field407 = (int) (Math.random() * 80.0D) - 40;
        field304 = (int) (Math.random() * 120.0D) - 60;
        field306 = (int) (Math.random() * 30.0D) - 20;
        field310 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field500 = 0;
        field462 = -1;
        field479 = 0;
        field468 = 0;
        field282 = class18.field503;
        field354 = 0;
        field366 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field276[var0] = null;
            field497[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field272[var1] = null;
        }
        Statics.field2498 = field276[2047] = new class3();
        field367 = -1;
        field370.method3255();
        field371.method3255();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field368[var2][var3][var4] = null;
                }
            }
        }
        field369 = new class182();
        field488 = 0;
        field487 = 0;
        field491 = 0;
        for (int var5 = 0; var5 < Statics.field3028; var5++) {
            class47 var6 = class47.method639(var5);
            if (var6 != null) {
                class159.field2681[var5] = 0;
                class159.field2680[var5] = 0;
            }
        }
        for (int var7 = 0; var7 < field400.length; var7++) {
            field400[var7] = -1;
        }
        field281 = -1;
        if (field395 != -1) {
            class157.method547(field395);
        }
        for (class4 var8 = (class4) field396.method3227(); var8 != null; var8 = (class4) field396.method3228()) {
            method549(var8, true);
        }
        field395 = -1;
        field396 = new class179(8);
        field399 = null;
        field376 = false;
        field441 = 0;
        field493.method2947((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field295[var9] = null;
            field365[var9] = false;
        }
        class14.field180 = new class179(32);
        field254 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field442[var10] = true;
        }
        field460 = null;
        Statics.field765 = 0;
        Statics.field13 = null;
        for (int var11 = 0; var11 < 6; var11++) {
            field496[var11] = new class203();
        }
        Statics.field981 = null;
    }

    @ObfuscatedName("cd.x(I)V")
    public static void method1798() {
        field275.field1842 = 0;
        field277.field1842 = 0;
        field279 = -1;
        field283 = -1;
        field483 = -1;
        field285 = -1;
        field413 = 0;
        field280 = 0;
        field312 = 0;
        field441 = 0;
        field376 = false;
        field500 = 0;
        field479 = 0;
        for (int var0 = 0; var0 < field276.length; var0++) {
            if (field276[var0] != null) {
                field276[var0].field726 = -1;
            }
        }
        for (int var1 = 0; var1 < field272.length; var1++) {
            if (field272[var1] != null) {
                field272[var1].field726 = -1;
            }
        }
        class14.field180 = new class179(32);
        method871(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field442[var2] = true;
        }
    }

    @ObfuscatedName("dl.n(IB)V")
    public static void method2462(int arg0) {
        if (arg0 == -3) {
            class29.method668(class147.field2203, class147.field2213, class147.field2205);
        } else if (arg0 == -2) {
            class29.method668(class147.field2255, class147.field2249, class147.field2208);
        } else if (arg0 == -1) {
            class29.method668(class147.field2209, class147.field2177, class147.field2219);
        } else if (arg0 == 3) {
            class29.method668(class147.field2212, class147.field2367, class147.field2214);
        } else if (arg0 == 4) {
            class29.method668(class147.field2290, class147.field2216, class147.field2217);
        } else if (arg0 == 5) {
            class29.method668(class147.field2218, class147.field2343, class147.field2297);
        } else if (arg0 == 6) {
            class29.method668(class147.field2221, class147.field2261, class147.field2277);
        } else if (arg0 == 7) {
            class29.method668(class147.field2224, class147.field2225, class147.field2226);
        } else if (arg0 == 8) {
            class29.method668(class147.field2227, class147.field2228, class147.field2229);
        } else if (arg0 == 9) {
            class29.method668(class147.field2230, class147.field2231, class147.field2232);
        } else if (arg0 == 10) {
            class29.method668(class147.field2233, class147.field2163, class147.field2313);
        } else if (arg0 == 11) {
            class29.method668(class147.field2236, class147.field2237, class147.field2184);
        } else if (arg0 == 12) {
            class29.method668(class147.field2198, class147.field2373, class147.field2291);
        } else if (arg0 == 13) {
            class29.method668(class147.field2242, class147.field2243, class147.field2244);
        } else if (arg0 == 14) {
            class29.method668(class147.field2245, class147.field2335, class147.field2247);
        } else if (arg0 == 16) {
            class29.method668(class147.field2248, class147.field2387, class147.field2250);
        } else if (arg0 == 17) {
            class29.method668(class147.field2337, class147.field2252, class147.field2253);
        } else if (arg0 == 18) {
            class29.method668(class147.field2352, class147.field2207, class147.field2256);
        } else if (arg0 == 19) {
            class29.method668(class147.field2257, class147.field2280, class147.field2259);
        } else if (arg0 == 20) {
            class29.method668(class147.field2270, class147.field2204, class147.field2262);
        } else if (arg0 == 22) {
            class29.method668(class147.field2404, class147.field2264, class147.field2265);
        } else if (arg0 == 23) {
            class29.method668(class147.field2266, class147.field2192, class147.field2268);
        } else if (arg0 == 24) {
            class29.method668(class147.field2269, class147.field2185, class147.field2271);
        } else if (arg0 == 25) {
            class29.method668(class147.field2272, class147.field2273, class147.field2274);
        } else if (arg0 == 26) {
            class29.method668(class147.field2275, class147.field2263, class147.field2316);
        } else if (arg0 == 27) {
            class29.method668(class147.field2215, class147.field2363, class147.field2371);
        } else if (arg0 == 31) {
            class29.method668(class147.field2287, class147.field2288, class147.field2289);
        } else if (arg0 == 32) {
            class29.method668(class147.field2186, class147.field2251, class147.field2292);
        } else if (arg0 == 37) {
            class29.method668(class147.field2293, class147.field2294, class147.field2295);
        } else if (arg0 == 38) {
            class29.method668(class147.field2391, class147.field2260, class147.field2298);
        } else if (arg0 == 55) {
            class29.method668(class147.field2299, class147.field2300, class147.field2301);
        } else if (arg0 == 56) {
            class29.method668(class147.field2302, class147.field2303, class147.field2211);
            method871(11);
            return;
        } else if (arg0 == 57) {
            class29.method668(class147.field2305, class147.field2306, class147.field2173);
            method871(11);
            return;
        } else {
            class29.method668(class147.field2308, class147.field2309, class147.field2310);
        }
        method871(10);
    }

    @ObfuscatedName("ae.v(I)V")
    public static final void method917() {
        if (Statics.field3046 != null) {
            Statics.field3046.method2611();
            Statics.field3046 = null;
        }
        method133();
        Statics.field761.method1744();
        for (int var0 = 0; var0 < 4; var0++) {
            field273[var0].method3607();
        }
        System.gc();
        class166.method2725(2);
        field469 = -1;
        field472 = false;
        for (class21 var1 = (class21) class21.field531.method3270(); var1 != null; var1 = (class21) class21.field531.method3262()) {
            if (var1.field534 != null) {
                Statics.field543.method1012(var1.field534);
                var1.field534 = null;
            }
            if (var1.field540 != null) {
                Statics.field543.method1012(var1.field540);
                var1.field540 = null;
            }
        }
        class21.field531.method3255();
        method871(10);
    }

    @ObfuscatedName("m.l(B)V")
    public static final void method133() {
        class42.method663();
        class38.field866.method3190();
        class41.method2605();
        class37.field815.method3190();
        class37.field818.method3190();
        class37.field819.method3190();
        class37.field820.method3190();
        class36.field775.method3190();
        class36.field776.method3190();
        class46.field993.method3190();
        class46.field994.method3190();
        class46.field1015.method3190();
        class39.field882.method3190();
        class39.field898.method3190();
        class40.field906.method3190();
        class40.field907.method3190();
        class43.field963.method3190();
        Statics.method2();
        class162.field2704.method3190();
        class157.field2544.method3190();
        class157.field2637.method3190();
        class157.field2617.method3190();
        ((class89) Statics.field1479).method1882();
        class19.field516.method3190();
        Statics.field2003.method2760();
        Statics.field264.method2760();
        Statics.field1083.method2760();
        Statics.field63.method2760();
        Statics.field2085.method2760();
        Statics.field1928.method2760();
        Statics.field242.method2760();
        Statics.field1509.method2760();
        Statics.field1114.method2760();
        Statics.field1957.method2760();
        Statics.field266.method2760();
        Statics.field1893.method2760();
    }

    @ObfuscatedName("x.t(I)V")
    public static final void method516() {
        if (field312 > 1) {
            field312--;
        }
        if (field301 > 0) {
            field301--;
        }
        if (field448) {
            field448 = false;
            if (field301 > 0) {
                method917();
            } else {
                method871(40);
                Statics.field175 = Statics.field3046;
                Statics.field3046 = null;
            }
            return;
        }
        if (!field376) {
            field346[0] = class147.field2400;
            field383[0] = "";
            field380[0] = 1006;
            field441 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field3046 == null) {
                var1 = false;
            } else {
                label2642: {
                    try {
                        int var2 = Statics.field3046.method2597();
                        if (var2 == 0) {
                            var1 = false;
                            break label2642;
                        }
                        if (field279 == -1) {
                            Statics.field3046.method2598(field277.field1844, 0, 1);
                            field277.field1842 = 0;
                            field279 = field277.method2368();
                            field413 = class171.field2820[field279];
                            var2--;
                        }
                        if (field413 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2642;
                            }
                            Statics.field3046.method2598(field277.field1844, 0, 1);
                            field413 = field277.field1844[0] & 0xFF;
                            var2--;
                        }
                        if (field413 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2642;
                            }
                            Statics.field3046.method2598(field277.field1844, 0, 2);
                            field277.field1842 = 0;
                            field413 = field277.method2243();
                            var2 -= 2;
                        }
                        if (var2 < field413) {
                            var1 = false;
                            break label2642;
                        }
                        field277.field1842 = 0;
                        Statics.field3046.method2598(field277.field1844, 0, field413);
                        field280 = 0;
                        field285 = field483;
                        field483 = field283;
                        field283 = field279;
                        if (field279 == 34) {
                            int var3 = field277.method2164();
                            int var4 = field277.method2243();
                            if (var3 < -70000) {
                                var4 += 32768;
                            }
                            class157 var5;
                            if (var3 >= 0) {
                                var5 = class157.method2872(var3);
                            } else {
                                var5 = null;
                            }
                            if (var5 != null) {
                                for (int var6 = 0; var6 < var5.field2541.length; var6++) {
                                    var5.field2541[var6] = 0;
                                    var5.field2659[var6] = 0;
                                }
                            }
                            class14 var7 = (class14) class14.field180.method3224((long) var4);
                            if (var7 != null) {
                                for (int var8 = 0; var8 < var7.field178.length; var8++) {
                                    var7.field178[var8] = -1;
                                    var7.field181[var8] = 0;
                                }
                            }
                            int var9 = field277.method2243();
                            for (int var10 = 0; var10 < var9; var10++) {
                                int var11 = field277.method2149();
                                if (var11 == 255) {
                                    var11 = field277.method2189();
                                }
                                int var12 = field277.method2243();
                                if (var5 != null && var10 < var5.field2541.length) {
                                    var5.field2541[var10] = var12;
                                    var5.field2659[var10] = var11;
                                }
                                class14.method1796(var4, var10, var12 - 1, var11);
                            }
                            if (var5 != null) {
                                method3177(var5);
                            }
                            method161();
                            field422[++field334 - 1 & 0x1F] = var4 & 0x7FFF;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 52) {
                            String var13 = field277.method2132();
                            long var14 = field277.method2263();
                            long var16 = (long) field277.method2243();
                            long var18 = (long) field277.method2128();
                            class142 var20 = (class142) Statics.method620(class142.method499(), field277.method2309());
                            long var21 = (var16 << 32) + var18;
                            boolean var23 = false;
                            for (int var24 = 0; var24 < 100; var24++) {
                                if (field360[var24] == var21) {
                                    var23 = true;
                                    break;
                                }
                            }
                            if (var20.field2118 && method1369(var13)) {
                                var23 = true;
                            }
                            if (!var23 && field352 == 0) {
                                field360[field417] = var21;
                                field417 = (field417 + 1) % 100;
                                String var25 = class206.method3468(class213.method2557(class205.method2721(field277)));
                                if (var20.field2116 == -1) {
                                    class10.method2731(9, var13, var25, class212.method3407(var14));
                                } else {
                                    int var26 = var20.field2116;
                                    String var27 = "<img=" + var26 + ">";
                                    class10.method2731(9, var27 + var13, var25, class212.method3407(var14));
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 31) {
                            if (field395 != -1) {
                                method2405(field395, 0);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 102) {
                            class23 var28 = new class23();
                            var28.field560 = field277.method2132();
                            var28.field562 = field277.method2243();
                            int var29 = field277.method2164();
                            var28.field563 = var29;
                            method871(45);
                            Statics.field3046.method2611();
                            Statics.field3046 = null;
                            class29.method546(var28);
                            field279 = -1;
                            var1 = false;
                            break label2642;
                        }
                        if (field279 == 36) {
                            int var30 = field277.method2158();
                            field395 = var30;
                            method3(var30);
                            class33.method520(field395);
                            for (int var31 = 0; var31 < 100; var31++) {
                                field442[var31] = true;
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 207) {
                            int var32 = field277.method2164();
                            String var33 = field277.method2132();
                            class157 var34 = class157.method2872(var32);
                            if (!var33.equals(var34.field2597)) {
                                var34.field2597 = var33;
                                method3177(var34);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 32) {
                            field419 = field471;
                            if (field413 == 0) {
                                field460 = null;
                                field423 = null;
                                Statics.field765 = 0;
                                Statics.field13 = null;
                                field279 = -1;
                                var1 = true;
                            } else {
                                field423 = field277.method2132();
                                long var35 = field277.method2263();
                                field460 = class212.method1892(var35);
                                Statics.field2909 = field277.method2125();
                                int var37 = field277.method2309();
                                if (var37 == 255) {
                                    field279 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field765 = var37;
                                    class22[] var38 = new class22[100];
                                    for (int var39 = 0; var39 < Statics.field765; var39++) {
                                        var38[var39] = new class22();
                                        var38[var39].field555 = field277.method2132();
                                        var38[var39].field550 = class214.method2464(var38[var39].field555, Statics.field237);
                                        var38[var39].field551 = field277.method2243();
                                        var38[var39].field552 = field277.method2125();
                                        field277.method2132();
                                        if (var38[var39].field555.equals(Statics.field2498.field43)) {
                                            Statics.field119 = var38[var39].field552;
                                        }
                                    }
                                    boolean var40 = false;
                                    int var41 = Statics.field765;
                                    while (var41 > 0) {
                                        boolean var42 = true;
                                        var41--;
                                        for (int var43 = 0; var43 < var41; var43++) {
                                            if (var38[var43].field550.compareTo(var38[var43 + 1].field550) > 0) {
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
                                    Statics.field13 = var38;
                                    field279 = -1;
                                    var1 = true;
                                }
                            }
                            break label2642;
                        }
                        if (field279 == 37) {
                            method550(true);
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 215) {
                            field251 = field277.method2309();
                            if (field251 == 1) {
                                field252 = field277.method2243();
                            }
                            if (field251 >= 2 && field251 <= 6) {
                                if (field251 == 2) {
                                    field447 = 64;
                                    field258 = 64;
                                }
                                if (field251 == 3) {
                                    field447 = 0;
                                    field258 = 64;
                                }
                                if (field251 == 4) {
                                    field447 = 128;
                                    field258 = 64;
                                }
                                if (field251 == 5) {
                                    field447 = 64;
                                    field258 = 0;
                                }
                                if (field251 == 6) {
                                    field447 = 64;
                                    field258 = 128;
                                }
                                field251 = 2;
                                field239 = field277.method2243();
                                field255 = field277.method2243();
                                field256 = field277.method2309();
                            }
                            if (field251 == 10) {
                                field403 = field277.method2243();
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 56) {
                            String var45 = field277.method2132();
                            Object[] var46 = new Object[var45.length() + 1];
                            for (int var47 = var45.length() - 1; var47 >= 0; var47--) {
                                if (var45.charAt(var47) == 's') {
                                    var46[var47 + 1] = field277.method2132();
                                } else {
                                    var46[var47 + 1] = Integer.valueOf(field277.method2164());
                                }
                            }
                            var46[0] = Integer.valueOf(field277.method2164());
                            class1 var48 = new class1();
                            var48.field5 = var46;
                            class33.method131(var48);
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 113) {
                            class113 var49 = field277;
                            int var50 = field413;
                            class193 var51 = new class193();
                            var51.field2910 = var49.method2309();
                            var51.field2918 = var49.method2164();
                            var51.field2912 = new int[var51.field2910];
                            var51.field2913 = new int[var51.field2910];
                            var51.field2914 = new Field[var51.field2910];
                            var51.field2915 = new int[var51.field2910];
                            var51.field2916 = new Method[var51.field2910];
                            var51.field2917 = new byte[var51.field2910][][];
                            for (int var52 = 0; var52 < var51.field2910; var52++) {
                                try {
                                    int var53 = var49.method2309();
                                    if (var53 == 0 || var53 == 1 || var53 == 2) {
                                        String var54 = var49.method2132();
                                        String var55 = var49.method2132();
                                        int var56 = 0;
                                        if (var53 == 1) {
                                            var56 = var49.method2164();
                                        }
                                        var51.field2912[var52] = var53;
                                        var51.field2915[var52] = var56;
                                        if (class194.method2593(var54).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        var51.field2914[var52] = class194.method2593(var54).getDeclaredField(var55);
                                    } else if (var53 == 3 || var53 == 4) {
                                        String var57 = var49.method2132();
                                        String var58 = var49.method2132();
                                        int var59 = var49.method2309();
                                        String[] var60 = new String[var59];
                                        for (int var61 = 0; var61 < var59; var61++) {
                                            var60[var61] = var49.method2132();
                                        }
                                        String var62 = var49.method2132();
                                        byte[][] var63 = new byte[var59][];
                                        if (var53 == 3) {
                                            for (int var64 = 0; var64 < var59; var64++) {
                                                int var65 = var49.method2164();
                                                var63[var64] = new byte[var65];
                                                var49.method2225(var63[var64], 0, var65);
                                            }
                                        }
                                        var51.field2912[var52] = var53;
                                        Class[] var66 = new Class[var59];
                                        for (int var67 = 0; var67 < var59; var67++) {
                                            var66[var67] = class194.method2593(var60[var67]);
                                        }
                                        Class var68 = class194.method2593(var62);
                                        if (class194.method2593(var57).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        Method[] var69 = class194.method2593(var57).getDeclaredMethods();
                                        Method[] var70 = var69;
                                        for (int var71 = 0; var71 < var70.length; var71++) {
                                            Method var72 = var70[var71];
                                            if (var72.getName().equals(var58)) {
                                                Class[] var73 = var72.getParameterTypes();
                                                if (var66.length == var73.length) {
                                                    boolean var74 = true;
                                                    for (int var75 = 0; var75 < var66.length; var75++) {
                                                        if (var66[var75] != var73[var75]) {
                                                            var74 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (var74 && var68 == var72.getReturnType()) {
                                                        var51.field2916[var52] = var72;
                                                    }
                                                }
                                            }
                                        }
                                        var51.field2917[var52] = var63;
                                    }
                                } catch (ClassNotFoundException var398) {
                                    var51.field2913[var52] = -1;
                                } catch (SecurityException var399) {
                                    var51.field2913[var52] = -2;
                                } catch (NullPointerException var400) {
                                    var51.field2913[var52] = -3;
                                } catch (Exception var401) {
                                    var51.field2913[var52] = -4;
                                } catch (Throwable var402) {
                                    var51.field2913[var52] = -5;
                                }
                            }
                            class194.field2921.method3304(var51);
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 1) {
                            String var81 = field277.method2132();
                            String var82 = class206.method3468(class213.method2557(class205.method2721(field277)));
                            class10.method616(6, var81, var82);
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 57) {
                            int var83 = field277.method2309();
                            int var84 = field277.method2149();
                            int var85 = field277.method2149();
                            Statics.field1082 = var84 >> 1;
                            Statics.field2498.method637(var85, var83, (var84 & 0x1) == 1);
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 46) {
                            int var86 = field277.method2243();
                            byte var87 = field277.method2151();
                            class159.field2681[var86] = var87;
                            if (class159.field2680[var86] != var87) {
                                class159.field2680[var86] = var87;
                                method1893(var86);
                            }
                            field420[++field421 - 1 & 0x1F] = var86;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 95) {
                            method161();
                            field401 = field277.method2127();
                            field431 = field471;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 123) {
                            Statics.field1804 = field277.method2148();
                            Statics.field2535 = field277.method2149();
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 217 || field279 == 166 || field279 == 227 || field279 == 63 || field279 == 11 || field279 == 255 || field279 == 162 || field279 == 116 || field279 == 80 || field279 == 226) {
                            method564();
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 96) {
                            int var88 = field277.method2309();
                            int var89 = field277.method2309();
                            int var90 = field277.method2309();
                            int var91 = field277.method2309();
                            field482[var88] = true;
                            field278[var88] = var89;
                            field484[var88] = var90;
                            field485[var88] = var91;
                            field486[var88] = 0;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 105) {
                            while (field277.field1842 < field413) {
                                int var92 = field277.method2309();
                                boolean var93 = (var92 & 0x1) == 1;
                                String var94 = field277.method2132();
                                String var95 = field277.method2132();
                                field277.method2132();
                                for (int var96 = 0; var96 < field491; var96++) {
                                    class8 var97 = field492[var96];
                                    if (var93) {
                                        if (var95.equals(var97.field114)) {
                                            var97.field114 = var94;
                                            var97.field111 = var95;
                                            var94 = null;
                                            break;
                                        }
                                    } else if (var94.equals(var97.field114)) {
                                        var97.field114 = var94;
                                        var97.field111 = var95;
                                        var94 = null;
                                        break;
                                    }
                                }
                                if (var94 != null && field491 < 400) {
                                    class8 var98 = new class8();
                                    field492[field491] = var98;
                                    var98.field114 = var94;
                                    var98.field111 = var95;
                                    field491++;
                                }
                            }
                            field427 = field471;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 142) {
                            int var99 = field277.method2202();
                            if (var99 == 65535) {
                                var99 = -1;
                            }
                            if (var99 == -1 && !field472) {
                                class166.method503();
                            } else if (var99 != -1 && field469 != var99 && field470 != 0 && !field472) {
                                class166.method1890(2, Statics.field1928, var99, 0, field470, false);
                            }
                            field469 = var99;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 143) {
                            int var100 = field277.method2243();
                            if (var100 == 65535) {
                                var100 = -1;
                            }
                            int var101 = field277.method2162();
                            if (field470 != 0 && var100 != -1) {
                                class166.method812(Statics.field266, var100, 0, field470, false);
                                field472 = true;
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 85) {
                            method161();
                            int var102 = field277.method2148();
                            int var103 = field277.method2167();
                            int var104 = field277.method2309();
                            field293[var102] = var103;
                            field372[var102] = var104;
                            field373[var102] = 1;
                            for (int var105 = 0; var105 < 98; var105++) {
                                if (var103 >= class145.field2146[var105]) {
                                    field373[var102] = var105 + 2;
                                }
                            }
                            field424[++field425 - 1 & 0x1F] = var102;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 167) {
                            for (int var106 = 0; var106 < Statics.field3028; var106++) {
                                class47 var107 = class47.method639(var106);
                                if (var107 != null) {
                                    class159.field2681[var106] = 0;
                                    class159.field2680[var106] = 0;
                                }
                            }
                            method161();
                            field421 += 32;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 192) {
                            field488 = 1;
                            field427 = field471;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 149) {
                            int var108 = field277.method2164();
                            int var109 = field277.method2243();
                            if (var108 < -70000) {
                                var109 += 32768;
                            }
                            class157 var110;
                            if (var108 >= 0) {
                                var110 = class157.method2872(var108);
                            } else {
                                var110 = null;
                            }
                            while (field277.field1842 < field413) {
                                int var111 = field277.method2137();
                                int var112 = field277.method2243();
                                int var113 = 0;
                                if (var112 != 0) {
                                    var113 = field277.method2309();
                                    if (var113 == 255) {
                                        var113 = field277.method2164();
                                    }
                                }
                                if (var110 != null && var111 >= 0 && var111 < var110.field2541.length) {
                                    var110.field2541[var111] = var112;
                                    var110.field2659[var111] = var113;
                                }
                                class14.method1796(var109, var111, var112 - 1, var113);
                            }
                            if (var110 != null) {
                                method3177(var110);
                            }
                            method161();
                            field422[++field334 - 1 & 0x1F] = var109 & 0x7FFF;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 68) {
                            int var114 = field277.method2243();
                            int var115 = field277.method2164();
                            int var116 = field277.method2321();
                            class4 var117 = (class4) field396.method3224((long) var115);
                            if (var117 != null) {
                                method549(var117, var117.field54 != var114);
                            }
                            class4 var118 = new class4();
                            var118.field54 = var114;
                            var118.field58 = var116;
                            field396.method3225(var118, (long) var115);
                            method3(var114);
                            class33.method520(var114);
                            class157 var119 = class157.method2872(var115);
                            if (var119 != null) {
                                method3177(var119);
                            }
                            if (field399 != null) {
                                method3177(field399);
                                field399 = null;
                            }
                            method2850();
                            if (field395 != -1) {
                                method2405(field395, 1);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 132) {
                            int var120 = field277.method2158();
                            int var121 = field277.method2164();
                            class159.field2681[var120] = var121;
                            if (class159.field2680[var120] != var121) {
                                class159.field2680[var120] = var121;
                                method1893(var120);
                            }
                            field420[++field421 - 1 & 0x1F] = var120;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 232) {
                            int var122 = field277.method2243();
                            int var123 = field277.method2309();
                            int var124 = field277.method2243();
                            method2435(var122, var123, var124);
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 22) {
                            method618(field277.method2132());
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 210) {
                            int var125 = field277.method2309();
                            class121[] var126 = class121.method2056();
                            int var127 = 0;
                            class121 var129;
                            while (true) {
                                if (var127 >= var126.length) {
                                    var129 = null;
                                    break;
                                }
                                class121 var128 = var126[var127];
                                if (var128.field1910 == var125) {
                                    var129 = var128;
                                    break;
                                }
                                var127++;
                            }
                            Statics.field700 = var129;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 23) {
                            int var130 = field277.method2309();
                            if (field277.method2309() == 0) {
                                field496[var130] = new class203();
                                field277.field1842 += 18;
                            } else {
                                field277.field1842--;
                                field496[var130] = new class203(field277, false);
                            }
                            field429 = field471;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 160) {
                            for (int var131 = 0; var131 < class159.field2680.length; var131++) {
                                if (class159.field2681[var131] != class159.field2680[var131]) {
                                    class159.field2680[var131] = class159.field2681[var131];
                                    method1893(var131);
                                    field420[++field421 - 1 & 0x1F] = var131;
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 137) {
                            int var132 = field277.method2168();
                            Statics.field106 = Statics.field1115.method2487(var132);
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 174) {
                            method1897(false);
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 126) {
                            int var133 = field277.method2202();
                            int var134 = field277.method2168();
                            class157 var135 = class157.method2872(var134);
                            if (var135 != null && var135.field2551 == 0) {
                                if (var133 > var135.field2565 - var135.field2559) {
                                    var133 = var135.field2565 - var135.field2559;
                                }
                                if (var133 < 0) {
                                    var133 = 0;
                                }
                                if (var135.field2563 != var133) {
                                    var135.field2563 = var133;
                                    method3177(var135);
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 138) {
                            int var136 = field277.method2202();
                            int var137 = field277.method2168();
                            int var138 = var136 >> 10 & 0x1F;
                            int var139 = var136 >> 5 & 0x1F;
                            int var140 = var136 & 0x1F;
                            int var141 = (var140 << 3) + (var138 << 19) + (var139 << 11);
                            class157 var142 = class157.method2872(var137);
                            if (var142.field2566 != var141) {
                                var142.field2566 = var141;
                                method3177(var142);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 88) {
                            int var143 = field277.method2164();
                            class4 var144 = (class4) field396.method3224((long) var143);
                            if (var144 != null) {
                                method549(var144, true);
                            }
                            if (field399 != null) {
                                method3177(field399);
                                field399 = null;
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 75) {
                            Statics.field1804 = field277.method2321();
                            Statics.field2535 = field277.method2149();
                            while (field277.field1842 < field413) {
                                field279 = field277.method2309();
                                method564();
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 58) {
                            field479 = field277.method2309();
                            if (field479 == 255) {
                                field479 = 0;
                            }
                            field468 = field277.method2309();
                            if (field468 == 255) {
                                field468 = 0;
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 83) {
                            Statics.field1804 = field277.method2149();
                            Statics.field2535 = field277.method2321();
                            for (int var145 = Statics.field1804; var145 < Statics.field1804 + 8; var145++) {
                                for (int var146 = Statics.field2535; var146 < Statics.field2535 + 8; var146++) {
                                    if (field368[Statics.field1082][var145][var146] != null) {
                                        field368[Statics.field1082][var145][var146] = null;
                                        method3170(var145, var146);
                                    }
                                }
                            }
                            for (class15 var147 = (class15) field369.method3270(); var147 != null; var147 = (class15) field369.method3262()) {
                                if (var147.field199 >= Statics.field1804 && var147.field199 < Statics.field1804 + 8 && var147.field200 >= Statics.field2535 && var147.field200 < Statics.field2535 + 8 && Statics.field1082 == var147.field191) {
                                    var147.field197 = 0;
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 10) {
                            while (field277.field1842 < field413) {
                                boolean var148 = field277.method2309() == 1;
                                String var149 = field277.method2132();
                                String var150 = field277.method2132();
                                int var151 = field277.method2243();
                                int var152 = field277.method2309();
                                int var153 = field277.method2309();
                                boolean var154 = (var153 & 0x2) != 0;
                                boolean var155 = (var153 & 0x1) != 0;
                                if (var151 > 0) {
                                    field277.method2132();
                                    field277.method2309();
                                    field277.method2164();
                                }
                                field277.method2132();
                                for (int var156 = 0; var156 < field487; var156++) {
                                    class16 var157 = field489[var156];
                                    if (var148) {
                                        if (var150.equals(var157.field214)) {
                                            var157.field214 = var149;
                                            var157.field203 = var150;
                                            var149 = null;
                                            break;
                                        }
                                    } else if (var149.equals(var157.field214)) {
                                        if (var157.field204 != var151) {
                                            boolean var158 = true;
                                            for (class35 var159 = (class35) field490.method3217(); var159 != null; var159 = (class35) field490.method3215()) {
                                                if (var159.field764.equals(var149)) {
                                                    if (var151 != 0 && var159.field770 == 0) {
                                                        var159.method3350();
                                                        var158 = false;
                                                    } else if (var151 == 0 && var159.field770 != 0) {
                                                        var159.method3350();
                                                        var158 = false;
                                                    }
                                                }
                                            }
                                            if (var158) {
                                                field490.method3220(new class35(var149, var151));
                                            }
                                            var157.field204 = var151;
                                        }
                                        var157.field203 = var150;
                                        var157.field206 = var152;
                                        var157.field207 = var154;
                                        var157.field208 = var155;
                                        var149 = null;
                                        break;
                                    }
                                }
                                if (var149 != null && field487 < 400) {
                                    class16 var160 = new class16();
                                    field489[field487] = var160;
                                    var160.field214 = var149;
                                    var160.field203 = var150;
                                    var160.field204 = var151;
                                    var160.field206 = var152;
                                    var160.field207 = var154;
                                    var160.field208 = var155;
                                    field487++;
                                }
                            }
                            field488 = 2;
                            field427 = field471;
                            boolean var161 = false;
                            int var162 = field487;
                            while (var162 > 0) {
                                boolean var163 = true;
                                var162--;
                                for (int var164 = 0; var164 < var162; var164++) {
                                    boolean var165 = false;
                                    class16 var166 = field489[var164];
                                    class16 var167 = field489[var164 + 1];
                                    if (field269 != var166.field204 && field269 == var167.field204) {
                                        var165 = true;
                                    }
                                    if (!var165 && var166.field204 == 0 && var167.field204 != 0) {
                                        var165 = true;
                                    }
                                    if (!var165 && !var166.field207 && var167.field207) {
                                        var165 = true;
                                    }
                                    if (!var165 && !var166.field208 && var167.field208) {
                                        var165 = true;
                                    }
                                    if (var165) {
                                        class16 var168 = field489[var164];
                                        field489[var164] = field489[var164 + 1];
                                        field489[var164 + 1] = var168;
                                        var163 = false;
                                    }
                                }
                                if (var163) {
                                    break;
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 64) {
                            int var169 = field277.method2202();
                            int var170 = field277.method2167();
                            class157 var171 = class157.method2872(var170);
                            if (var171.field2581 != 2 || var171.field2582 != var169) {
                                var171.field2581 = 2;
                                var171.field2582 = var169;
                                method3177(var171);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 203) {
                            int var172 = field277.method2158();
                            int var173 = field277.method2202();
                            int var174 = field277.method2164();
                            int var175 = field277.method2157();
                            class157 var176 = class157.method2872(var174);
                            if (var176.field2589 != var172 || var176.field2604 != var175 || var176.field2651 != var173) {
                                var176.field2589 = var172;
                                var176.field2604 = var175;
                                var176.field2651 = var173;
                                method3177(var176);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 163) {
                            int var177 = field277.method2167();
                            class157 var178 = class157.method2872(var177);
                            for (int var179 = 0; var179 < var178.field2541.length; var179++) {
                                var178.field2541[var179] = -1;
                                var178.field2541[var179] = 0;
                            }
                            method3177(var178);
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 177) {
                            int var180 = field277.method2167();
                            int var181 = field277.method2157();
                            class157 var182 = class157.method2872(var180);
                            if (var182.field2581 != 1 || var182.field2582 != var181) {
                                var182.field2581 = 1;
                                var182.field2582 = var181;
                                method3177(var182);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 200) {
                            int var183 = field277.method2127();
                            int var184 = field277.method2189();
                            class157 var185 = class157.method2872(var184);
                            if (var185.field2585 != var183 || var183 == -1) {
                                var185.field2585 = var183;
                                var185.field2619 = 0;
                                var185.field2601 = 0;
                                method3177(var185);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 194) {
                            int var186 = field277.method2287();
                            int var187 = field277.method2167();
                            int var188 = field277.method2159();
                            class157 var189 = class157.method2872(var187);
                            int var190 = var189.field2654 + var188;
                            int var191 = var189.field2557 + var186;
                            if (var189.field2639 != var190 || var189.field2576 != var191) {
                                var189.field2639 = var190;
                                var189.field2576 = var191;
                                method3177(var189);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 239) {
                            field481 = true;
                            Statics.field1490 = field277.method2309();
                            Statics.field151 = field277.method2309();
                            Statics.field1832 = field277.method2243();
                            Statics.field1757 = field277.method2309();
                            Statics.field542 = field277.method2309();
                            if (Statics.field542 >= 100) {
                                Statics.field159 = Statics.field1490 * 128 + 64;
                                Statics.field921 = Statics.field151 * 128 + 64;
                                Statics.field1281 = method868(Statics.field159, Statics.field921, Statics.field1082) - Statics.field1832;
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 216) {
                            field481 = true;
                            Statics.field2930 = field277.method2309();
                            Statics.field598 = field277.method2309();
                            Statics.field29 = field277.method2243();
                            Statics.field1923 = field277.method2309();
                            Statics.field192 = field277.method2309();
                            if (Statics.field192 >= 100) {
                                int var192 = Statics.field2930 * 128 + 64;
                                int var193 = Statics.field598 * 128 + 64;
                                int var194 = method868(var192, var193, Statics.field1082) - Statics.field29;
                                int var195 = var192 - Statics.field159;
                                int var196 = var194 - Statics.field1281;
                                int var197 = var193 - Statics.field921;
                                int var198 = (int) Math.sqrt((double) (var195 * var195 + var197 * var197));
                                Statics.field2599 = (int) (Math.atan2((double) var196, (double) var198) * 325.949D) & 0x7FF;
                                Statics.field2161 = (int) (Math.atan2((double) var195, (double) var197) * -325.949D) & 0x7FF;
                                if (Statics.field2599 < 128) {
                                    Statics.field2599 = 128;
                                }
                                if (Statics.field2599 > 383) {
                                    Statics.field2599 = 383;
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 139) {
                            method550(false);
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 198) {
                            String var199 = field277.method2132();
                            int var200 = field277.method2243();
                            byte var201 = field277.method2125();
                            boolean var202 = false;
                            if (var201 == -128) {
                                var202 = true;
                            }
                            if (var202) {
                                if (Statics.field765 == 0) {
                                    field279 = -1;
                                    var1 = true;
                                    break label2642;
                                }
                                boolean var203 = false;
                                int var204;
                                for (var204 = 0; var204 < Statics.field765 && (!Statics.field13[var204].field555.equals(var199) || Statics.field13[var204].field551 != var200); var204++) {
                                }
                                if (var204 < Statics.field765) {
                                    while (var204 < Statics.field765 - 1) {
                                        Statics.field13[var204] = Statics.field13[var204 + 1];
                                        var204++;
                                    }
                                    Statics.field765--;
                                    Statics.field13[Statics.field765] = null;
                                }
                            } else {
                                field277.method2132();
                                class22 var205 = new class22();
                                var205.field555 = var199;
                                var205.field550 = class214.method2464(var205.field555, Statics.field237);
                                var205.field551 = var200;
                                var205.field552 = var201;
                                int var206;
                                for (var206 = Statics.field765 - 1; var206 >= 0; var206--) {
                                    int var207 = Statics.field13[var206].field550.compareTo(var205.field550);
                                    if (var207 == 0) {
                                        Statics.field13[var206].field551 = var200;
                                        Statics.field13[var206].field552 = var201;
                                        if (var199.equals(Statics.field2498.field43)) {
                                            Statics.field119 = var201;
                                        }
                                        field419 = field471;
                                        field279 = -1;
                                        var1 = true;
                                        break label2642;
                                    }
                                    if (var207 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field765 >= Statics.field13.length) {
                                    field279 = -1;
                                    var1 = true;
                                    break label2642;
                                }
                                for (int var208 = Statics.field765 - 1; var208 > var206; var208--) {
                                    Statics.field13[var208 + 1] = Statics.field13[var208];
                                }
                                if (Statics.field765 == 0) {
                                    Statics.field13 = new class22[100];
                                }
                                Statics.field13[var206 + 1] = var205;
                                Statics.field765++;
                                if (var199.equals(Statics.field2498.field43)) {
                                    Statics.field119 = var201;
                                }
                            }
                            field419 = field471;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 168) {
                            field451 = field277.method2309();
                            field439 = field277.method2309();
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 145) {
                            field481 = false;
                            for (int var209 = 0; var209 < 5; var209++) {
                                field482[var209] = false;
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 55) {
                            field361 = 0;
                            field356 = 0;
                            field277.method2393();
                            int var210 = field277.method2370(1);
                            if (var210 != 0) {
                                int var211 = field277.method2370(2);
                                if (var211 == 0) {
                                    field267[++field356 - 1] = 2047;
                                } else if (var211 == 1) {
                                    int var212 = field277.method2370(3);
                                    Statics.field2498.method625(var212, false);
                                    int var213 = field277.method2370(1);
                                    if (var213 == 1) {
                                        field267[++field356 - 1] = 2047;
                                    }
                                } else if (var211 == 2) {
                                    int var214 = field277.method2370(3);
                                    Statics.field2498.method625(var214, true);
                                    int var215 = field277.method2370(3);
                                    Statics.field2498.method625(var215, true);
                                    int var216 = field277.method2370(1);
                                    if (var216 == 1) {
                                        field267[++field356 - 1] = 2047;
                                    }
                                } else if (var211 == 3) {
                                    int var217 = field277.method2370(1);
                                    Statics.field1082 = field277.method2370(2);
                                    int var218 = field277.method2370(7);
                                    int var219 = field277.method2370(1);
                                    if (var219 == 1) {
                                        field267[++field356 - 1] = 2047;
                                    }
                                    int var220 = field277.method2370(7);
                                    Statics.field2498.method637(var218, var220, var217 == 1);
                                }
                            }
                            Statics.method23();
                            while (field277.method2372(field413) >= 11) {
                                int var221 = field277.method2370(11);
                                if (var221 == 2047) {
                                    break;
                                }
                                boolean var222 = false;
                                if (field276[var221] == null) {
                                    field276[var221] = new class3();
                                    if (field497[var221] != null) {
                                        field276[var221].method12(field497[var221]);
                                    }
                                    var222 = true;
                                }
                                field355[++field354 - 1] = var221;
                                class3 var223 = field276[var221];
                                var223.field736 = field243;
                                int var224 = field277.method2370(5);
                                if (var224 > 15) {
                                    var224 -= 32;
                                }
                                int var225 = field277.method2370(1);
                                if (var225 == 1) {
                                    field267[++field356 - 1] = var221;
                                }
                                int var226 = field277.method2370(1);
                                int var227 = field358[field277.method2370(3)];
                                if (var222) {
                                    var223.field716 = var223.field703 = var227;
                                }
                                int var228 = field277.method2370(5);
                                if (var228 > 15) {
                                    var228 -= 32;
                                }
                                var223.method637(Statics.field2498.field755[0] + var224, Statics.field2498.field756[0] + var228, var226 == 1);
                            }
                            field277.method2371();
                            method856();
                            for (int var229 = 0; var229 < field361; var229++) {
                                int var230 = field362[var229];
                                if (field243 != field276[var230].field736) {
                                    field276[var230] = null;
                                }
                            }
                            if (field413 != field277.field1842) {
                                throw new RuntimeException(field277.field1842 + class2.field23 + field413);
                            }
                            for (int var231 = 0; var231 < field354; var231++) {
                                if (field276[field355[var231]] == null) {
                                    throw new RuntimeException(var231 + class2.field23 + field354);
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 33) {
                            field277.field1842 += 28;
                            if (field277.method2144()) {
                                class113 var232 = field277;
                                int var233 = field277.field1842 - 28;
                                if (class140.field2090 != null) {
                                    try {
                                        class140.field2090.method3581(0L);
                                        class140.field2090.method3586(var232.field1844, var233, 24);
                                    } catch (Exception var395) {
                                    }
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 0) {
                            boolean var235 = field277.method2321() == 1;
                            int var236 = field277.method2167();
                            class157 var237 = class157.method2872(var236);
                            if (var237.field2561 != var235) {
                                var237.field2561 = var235;
                                method3177(var237);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 101) {
                            int var238 = field277.method2164();
                            int var239 = field277.method2243();
                            int var240 = field277.method2202();
                            class157 var241 = class157.method2872(var238);
                            var241.field2593 = (var240 << 16) + var239;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 106) {
                            int var242 = field413 + field277.field1842;
                            int var243 = field277.method2243();
                            int var244 = field277.method2243();
                            if (field395 != var243) {
                                field395 = var243;
                                method3(field395);
                                class33.method520(field395);
                                for (int var245 = 0; var245 < 100; var245++) {
                                    field442[var245] = true;
                                }
                            }
                            while (var244-- > 0) {
                                int var246 = field277.method2164();
                                int var247 = field277.method2243();
                                int var248 = field277.method2309();
                                class4 var249 = (class4) field396.method3224((long) var246);
                                if (var249 != null && var249.field54 != var247) {
                                    method549(var249, true);
                                    var249 = null;
                                }
                                if (var249 == null) {
                                    class4 var250 = new class4();
                                    var250.field54 = var247;
                                    var250.field58 = var248;
                                    field396.method3225(var250, (long) var246);
                                    method3(var247);
                                    class33.method520(var247);
                                    class157 var251 = class157.method2872(var246);
                                    if (var251 != null) {
                                        method3177(var251);
                                    }
                                    if (field399 != null) {
                                        method3177(field399);
                                        field399 = null;
                                    }
                                    method2850();
                                    if (field395 != -1) {
                                        method2405(field395, 1);
                                    }
                                    var249 = var250;
                                }
                                var249.field52 = true;
                            }
                            for (class4 var253 = (class4) field396.method3227(); var253 != null; var253 = (class4) field396.method3228()) {
                                if (var253.field52) {
                                    var253.field52 = false;
                                } else {
                                    method549(var253, true);
                                }
                            }
                            field347 = new class179(512);
                            while (field277.field1842 < var242) {
                                int var254 = field277.method2164();
                                int var255 = field277.method2243();
                                int var256 = field277.method2243();
                                int var257 = field277.method2164();
                                for (int var258 = var255; var258 <= var256; var258++) {
                                    long var259 = ((long) var254 << 32) + (long) var258;
                                    field347.method3225(new class184(var257), var259);
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 213) {
                            int var261 = field277.method2137();
                            boolean var262 = field277.method2309() == 1;
                            String var263 = "";
                            boolean var264 = false;
                            if (var262) {
                                var263 = field277.method2132();
                                if (method1369(var263)) {
                                    var264 = true;
                                }
                            }
                            String var265 = field277.method2132();
                            if (!var264) {
                                class10.method616(var261, var263, var265);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 128) {
                            field312 = field277.method2157() * 30;
                            field431 = field471;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 202) {
                            String var266 = field277.method2132();
                            int var267 = field277.method2148();
                            int var268 = field277.method2148();
                            if (var267 >= 1 && var267 <= 8) {
                                if (var266.equalsIgnoreCase("null")) {
                                    var266 = null;
                                }
                                field295[var267 - 1] = var266;
                                field365[var267 - 1] = var268 == 0;
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 201) {
                            method161();
                            field323 = field277.method2309();
                            field431 = field471;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 144) {
                            int var269 = field277.method2202();
                            class14.method2706(var269);
                            field422[++field334 - 1 & 0x1F] = var269 & 0x7FFF;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 212) {
                            boolean var270 = field277.method2309() == 1;
                            if (var270) {
                                Statics.field1889 = class106.method870() - field277.method2263();
                                Statics.field981 = new class204(field277, true);
                            } else {
                                Statics.field981 = null;
                            }
                            field499 = field471;
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 67) {
                            method917();
                            field279 = -1;
                            var1 = false;
                            break label2642;
                        }
                        if (field279 == 26) {
                            int var271 = field277.method2167();
                            class157 var272 = class157.method2872(var271);
                            var272.field2581 = 3;
                            var272.field2582 = Statics.field2498.field31.method2955();
                            method3177(var272);
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 6) {
                            field500 = field277.method2309();
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 209) {
                            for (int var273 = 0; var273 < field276.length; var273++) {
                                if (field276[var273] != null) {
                                    field276[var273].field732 = -1;
                                }
                            }
                            for (int var274 = 0; var274 < field272.length; var274++) {
                                if (field272[var274] != null) {
                                    field272[var274].field732 = -1;
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 152) {
                            int var275 = field277.method2189();
                            int var276 = field277.method2168();
                            int var277 = field277.method2157();
                            if (var277 == 65535) {
                                var277 = -1;
                            }
                            class157 var278 = class157.method2872(var275);
                            if (var278.field2592) {
                                var278.field2656 = var277;
                                var278.field2657 = var276;
                                class46 var280 = Statics.method607(var277);
                                var278.field2589 = var280.field1041;
                                var278.field2604 = var280.field1005;
                                var278.field2567 = var280.field1006;
                                var278.field2587 = var280.field1019;
                                var278.field2588 = var280.field1004;
                                var278.field2651 = var280.field1003;
                                if (var280.field1009 == 1) {
                                    var278.field2595 = 1;
                                } else {
                                    var278.field2595 = 2;
                                }
                                if (var278.field2577 > 0) {
                                    var278.field2651 = var278.field2651 * 32 / var278.field2577;
                                }
                                method3177(var278);
                            } else {
                                if (var277 == -1) {
                                    var278.field2581 = 0;
                                    field279 = -1;
                                    var1 = true;
                                    break label2642;
                                }
                                class46 var279 = Statics.method607(var277);
                                var278.field2581 = 4;
                                var278.field2582 = var277;
                                var278.field2589 = var279.field1041;
                                var278.field2604 = var279.field1005;
                                var278.field2651 = var279.field1003 * 100 / var276;
                                method3177(var278);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 117) {
                            method1897(true);
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 125) {
                            String var281 = field277.method2132();
                            long var282 = (long) field277.method2243();
                            long var284 = (long) field277.method2128();
                            class142 var286 = (class142) Statics.method620(class142.method499(), field277.method2309());
                            long var287 = (var282 << 32) + var284;
                            boolean var289 = false;
                            for (int var290 = 0; var290 < 100; var290++) {
                                if (field360[var290] == var287) {
                                    var289 = true;
                                    break;
                                }
                            }
                            if (method1369(var281)) {
                                var289 = true;
                            }
                            if (!var289 && field352 == 0) {
                                field360[field417] = var287;
                                field417 = (field417 + 1) % 100;
                                String var291 = class206.method3468(class213.method2557(class205.method2721(field277)));
                                byte var292;
                                if (var286.field2120) {
                                    var292 = 7;
                                } else {
                                    var292 = 3;
                                }
                                if (var286.field2116 == -1) {
                                    class10.method616(var292, var281, var291);
                                } else {
                                    int var294 = var286.field2116;
                                    String var295 = "<img=" + var294 + ">";
                                    class10.method616(var292, var295 + var281, var291);
                                }
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        if (field279 == 195) {
                            int var296 = field277.method2167();
                            int var297 = field277.method2158();
                            if (var297 == 65535) {
                                var297 = -1;
                            }
                            int var298 = field277.method2167();
                            int var299 = field277.method2158();
                            if (var299 == 65535) {
                                var299 = -1;
                            }
                            for (int var300 = var299; var300 <= var297; var300++) {
                                long var301 = ((long) var296 << 32) + (long) var300;
                                class191 var303 = field347.method3224(var301);
                                if (var303 != null) {
                                    var303.method3358();
                                }
                                field347.method3225(new class184(var298), var301);
                            }
                            field279 = -1;
                            var1 = true;
                            break label2642;
                        }
                        class139.method2074("" + field279 + class2.field23 + field483 + class2.field23 + field285 + class2.field23 + field413, (Throwable) null);
                        method917();
                    } catch (IOException var403) {
                        if (field301 > 0) {
                            method917();
                        } else {
                            method871(40);
                            Statics.field175 = Statics.field3046;
                            Statics.field3046 = null;
                        }
                    } catch (Exception var404) {
                        String var306 = "" + field279 + class2.field23 + field483 + class2.field23 + field285 + class2.field23 + field413 + class2.field23 + (Statics.field24 + Statics.field2498.field755[0]) + class2.field23 + (Statics.field1047 + Statics.field2498.field756[0]) + class2.field23;
                        for (int var307 = 0; var307 < field413 && var307 < 50; var307++) {
                            var306 = var306 + field277.field1844[var307] + class2.field23;
                        }
                        class139.method2074(var306, var404);
                        method917();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field241 != 30) {
            return;
        }
        while (class194.method1878()) {
            field275.method2367(242);
            field275.method2110(0);
            int var308 = field275.field1842;
            class194.method609(field275);
            field275.method2121(field275.field1842 - var308);
        }
        Object var309 = Statics.field953.field162;
        synchronized (Statics.field953.field162) {
            if (!field406) {
                Statics.field953.field163 = 0;
            } else if (class131.field2017 != 0 || Statics.field953.field163 >= 40) {
                field275.method2367(43);
                field275.method2110(0);
                int var310 = field275.field1842;
                int var311 = 0;
                for (int var312 = 0; var312 < Statics.field953.field163 && field275.field1842 - var310 < 240; var312++) {
                    var311++;
                    int var313 = Statics.field953.field158[var312];
                    if (var313 < 0) {
                        var313 = 0;
                    } else if (var313 > 502) {
                        var313 = 502;
                    }
                    int var314 = Statics.field953.field157[var312];
                    if (var314 < 0) {
                        var314 = 0;
                    } else if (var314 > 764) {
                        var314 = 764;
                    }
                    int var315 = var313 * 765 + var314;
                    if (Statics.field953.field158[var312] == -1 && Statics.field953.field157[var312] == -1) {
                        var314 = -1;
                        var313 = -1;
                        var315 = 524287;
                    }
                    if (field245 != var314 || field246 != var313) {
                        int var316 = var314 - field245;
                        field245 = var314;
                        int var317 = var313 - field246;
                        field246 = var313;
                        if (field247 < 8 && var316 >= -32 && var316 <= 31 && var317 >= -32 && var317 <= 31) {
                            var316 += 32;
                            var317 += 32;
                            field275.method2111((field247 << 12) + (var316 << 6) + var317);
                            field247 = 0;
                        } else if (field247 < 8) {
                            field275.method2112((field247 << 19) + 8388608 + var315);
                            field247 = 0;
                        } else {
                            field275.method2113((field247 << 19) + -1073741824 + var315);
                            field247 = 0;
                        }
                    } else if (field247 < 2047) {
                        field247++;
                    }
                }
                field275.method2121(field275.field1842 - var310);
                if (var311 >= Statics.field953.field163) {
                    Statics.field953.field163 = 0;
                } else {
                    Statics.field953.field163 -= var311;
                    for (int var318 = 0; var318 < Statics.field953.field163; var318++) {
                        Statics.field953.field157[var318] = Statics.field953.field157[var311 + var318];
                        Statics.field953.field158[var318] = Statics.field953.field158[var311 + var318];
                    }
                }
            }
        }
        if (class131.field2017 == 1 || !Statics.field1271 && class131.field2017 == 4 || class131.field2017 == 2) {
            long var320 = (class131.field2018 - field353) / 50L;
            if (var320 > 4095L) {
                var320 = 4095L;
            }
            field353 = class131.field2018;
            int var322 = class131.field2020;
            if (var322 < 0) {
                var322 = 0;
            } else if (var322 > 502) {
                var322 = 502;
            }
            int var323 = class131.field2016;
            if (var323 < 0) {
                var323 = 0;
            } else if (var323 > 764) {
                var323 = 764;
            }
            int var324 = var322 * 765 + var323;
            byte var325 = 0;
            if (class131.field2017 == 2) {
                var325 = 1;
            }
            int var326 = (int) var320;
            field275.method2367(130);
            field275.method2113((var325 << 19) + (var326 << 20) + var324);
        }
        if (class128.field1977 > 0) {
            field275.method2367(250);
            field275.method2111(0);
            int var327 = field275.field1842;
            long var328 = class106.method870();
            for (int var330 = 0; var330 < class128.field1977; var330++) {
                long var331 = var328 - field459;
                if (var331 > 16777215L) {
                    var331 = 16777215L;
                }
                field459 = var328;
                field275.method2161((int) var331);
                field275.method2110(class128.field1976[var330]);
            }
            field275.method2120(field275.field1842 - var327);
        }
        if (field389 > 0) {
            field389--;
        }
        if (class128.field1978[96] || class128.field1978[97] || class128.field1978[98] || class128.field1978[99]) {
            field324 = true;
        }
        if (field324 && field389 <= 0) {
            field389 = 20;
            field324 = false;
            field275.method2367(214);
            field275.method2155(field291);
            field275.method2111(field310);
        }
        if (Statics.field1413 && !field248) {
            field248 = true;
            field275.method2367(101);
            field275.method2110(1);
        }
        if (!Statics.field1413 && field248) {
            field248 = false;
            field275.method2367(101);
            field275.method2110(0);
        }
        method601();
        if (field241 != 30) {
            return;
        }
        method130();
        method166();
        field280++;
        if (field280 <= 750) {
            for (int var333 = -1; var333 < field354; var333++) {
                int var334;
                if (var333 == -1) {
                    var334 = 2047;
                } else {
                    var334 = field355[var333];
                }
                class3 var335 = field276[var334];
                if (var335 != null) {
                    method1378(var335, 1);
                }
            }
            method163();
            method830();
            field309++;
            if (field343 != 0) {
                field342 += 20;
                if (field342 >= 400) {
                    field343 = 0;
                }
            }
            if (Statics.field975 != null) {
                field344++;
                if (field344 >= 15) {
                    method3177(Statics.field975);
                    Statics.field975 = null;
                }
            }
            class157 var336 = Statics.field1439;
            class157 var337 = Statics.field541;
            Statics.field1439 = null;
            Statics.field541 = null;
            field411 = null;
            field415 = false;
            field412 = false;
            field456 = 0;
            while (class128.method2205() && field456 < 128) {
                if (field402 >= 2 && class128.field1978[82] && Statics.field1812 == 66) {
                    String var338 = "";
                    Iterator var339 = class10.field132.iterator();
                    while (var339.hasNext()) {
                        class32 var340 = (class32) var339.next();
                        var338 = var338 + var340.field677 + ':' + var340.field682 + '\n';
                    }
                    Statics.field627.setContents(new StringSelection(var338), (ClipboardOwner) null);
                } else {
                    field458[field456] = Statics.field1812;
                    field299[field456] = Statics.field129;
                    field456++;
                }
            }
            int var343 = field395;
            if (class157.method831(var343)) {
                method2443(Statics.field2641[var343], -1, 0, 0, 765, 503, 0, 0);
            }
            field471++;
            while (true) {
                class1 var344;
                class157 var345;
                class157 var346;
                do {
                    var344 = (class1) field436.method3279();
                    if (var344 == null) {
                        while (true) {
                            class1 var347;
                            class157 var348;
                            class157 var349;
                            do {
                                var347 = (class1) field409.method3279();
                                if (var347 == null) {
                                    while (true) {
                                        class1 var350;
                                        class157 var351;
                                        class157 var352;
                                        do {
                                            var350 = (class1) field435.method3279();
                                            if (var350 == null) {
                                                Statics.method869();
                                                if (field297 != null) {
                                                    method3177(field297);
                                                    Statics.field1250++;
                                                    if (field415 && field412) {
                                                        int var353 = class131.field2009;
                                                        int var354 = class131.field2010;
                                                        int var355 = var353 - field364;
                                                        int var356 = var354 - field410;
                                                        if (var355 < field445) {
                                                            var355 = field445;
                                                        }
                                                        if (field297.field2577 + var355 > field445 + field265.field2577) {
                                                            var355 = field445 + field265.field2577 - field297.field2577;
                                                        }
                                                        if (var356 < field236) {
                                                            var356 = field236;
                                                        }
                                                        if (field297.field2559 + var356 > field236 + field265.field2559) {
                                                            var356 = field236 + field265.field2559 - field297.field2559;
                                                        }
                                                        int var357 = var355 - field416;
                                                        int var358 = var356 - field300;
                                                        int var359 = field297.field2613;
                                                        if (Statics.field1250 > field297.field2614 && (var357 > var359 || var357 < -var359 || var358 > var359 || var358 < -var359)) {
                                                            field418 = true;
                                                        }
                                                        int var360 = field265.field2562 + (var355 - field445);
                                                        int var361 = field265.field2563 + (var356 - field236);
                                                        if (field297.field2626 != null && field418) {
                                                            class1 var362 = new class1();
                                                            var362.field3 = field297;
                                                            var362.field7 = var360;
                                                            var362.field4 = var361;
                                                            var362.field5 = field297.field2626;
                                                            class33.method131(var362);
                                                        }
                                                        if (class131.field2008 == 0) {
                                                            if (field418) {
                                                                if (field297.field2552 != null) {
                                                                    class1 var363 = new class1();
                                                                    var363.field3 = field297;
                                                                    var363.field7 = var360;
                                                                    var363.field4 = var361;
                                                                    var363.field1 = field411;
                                                                    var363.field5 = field297.field2552;
                                                                    class33.method131(var363);
                                                                }
                                                                if (field411 != null && method832(field297) != null) {
                                                                    field275.method2367(9);
                                                                    field275.method2129(field411.field2550);
                                                                    field275.method2163(field297.field2622);
                                                                    field275.method2154(field297.field2550);
                                                                    field275.method2111(field411.field2656);
                                                                    field275.method2154(field297.field2656);
                                                                    field275.method2113(field411.field2622);
                                                                }
                                                            } else if ((field446 == 1 || method640(field441 - 1)) && field441 > 2) {
                                                                method2925(field416 + field364, field410 + field300);
                                                            } else if (field441 > 0) {
                                                                method623(field416 + field364, field410 + field300);
                                                            }
                                                            field297 = null;
                                                        }
                                                    } else if (Statics.field1250 > 1) {
                                                        field297 = null;
                                                    }
                                                }
                                                if (Statics.field22 != null) {
                                                    method3177(Statics.field22);
                                                    field351++;
                                                    if (class131.field2008 == 0) {
                                                        if (field432) {
                                                            if (Statics.field22 == Statics.field212 && field349 != field230) {
                                                                class157 var364 = Statics.field22;
                                                                byte var365 = 0;
                                                                if (field398 == 1 && var364.field2670 == 206) {
                                                                    var365 = 1;
                                                                }
                                                                if (var364.field2541[field349] <= 0) {
                                                                    var365 = 0;
                                                                }
                                                                int var366 = method838(var364);
                                                                boolean var367 = (var366 >> 29 & 0x1) != 0;
                                                                if (var367) {
                                                                    int var368 = field230;
                                                                    int var369 = field349;
                                                                    var364.field2541[var369] = var364.field2541[var368];
                                                                    var364.field2659[var369] = var364.field2659[var368];
                                                                    var364.field2541[var368] = -1;
                                                                    var364.field2659[var368] = 0;
                                                                } else if (var365 == 1) {
                                                                    int var370 = field230;
                                                                    int var371 = field349;
                                                                    while (var370 != var371) {
                                                                        if (var370 > var371) {
                                                                            var364.method2880(var370 - 1, var370);
                                                                            var370--;
                                                                        } else if (var370 < var371) {
                                                                            var364.method2880(var370 + 1, var370);
                                                                            var370++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var364.method2880(field349, field230);
                                                                }
                                                                field275.method2367(26);
                                                                field275.method2111(field230);
                                                                field275.method2146(var365);
                                                                field275.method2113(Statics.field22.field2622);
                                                                field275.method2154(field349);
                                                            }
                                                        } else if ((field446 == 1 || method640(field441 - 1)) && field441 > 2) {
                                                            method2925(field232, field348);
                                                        } else if (field441 > 0) {
                                                            method623(field232, field348);
                                                        }
                                                        field344 = 10;
                                                        class131.field2017 = 0;
                                                        Statics.field22 = null;
                                                    } else if (field351 >= 5 && (class131.field2009 > field232 + 5 || class131.field2009 < field232 - 5 || class131.field2010 > field348 + 5 || class131.field2010 < field348 - 5)) {
                                                        field432 = true;
                                                    }
                                                }
                                                if (class80.field1381 != -1) {
                                                    int var372 = class80.field1381;
                                                    int var373 = class80.field1349;
                                                    field275.method2367(109);
                                                    field275.method2110(5);
                                                    field275.method2129(Statics.field24 + var372);
                                                    field275.method2147(class128.field1978[82] ? (class128.field1978[81] ? 2 : 1) : 0);
                                                    field275.method2155(Statics.field1047 + var373);
                                                    class80.field1381 = -1;
                                                    field340 = class131.field2016;
                                                    field341 = class131.field2020;
                                                    field343 = 1;
                                                    field342 = 0;
                                                    field479 = var372;
                                                    field468 = var373;
                                                }
                                                if (Statics.field1439 != var336) {
                                                    if (var336 != null) {
                                                        method3177(var336);
                                                    }
                                                    if (Statics.field1439 != null) {
                                                        method3177(Statics.field1439);
                                                    }
                                                }
                                                if (Statics.field541 != var337 && field386 == field303) {
                                                    if (var337 != null) {
                                                        method3177(var337);
                                                    }
                                                    if (Statics.field541 != null) {
                                                        method3177(Statics.field541);
                                                    }
                                                }
                                                if (Statics.field541 == null) {
                                                    if (field386 > 0) {
                                                        field386--;
                                                    }
                                                } else if (field386 < field303) {
                                                    field386++;
                                                    if (field386 == field303) {
                                                        method3177(Statics.field541);
                                                    }
                                                }
                                                int var374 = field457 + Statics.field2498.field746;
                                                int var375 = field357 + Statics.field2498.field752;
                                                if (Statics.field962 - var374 < -500 || Statics.field962 - var374 > 500 || Statics.field51 - var375 < -500 || Statics.field51 - var375 > 500) {
                                                    Statics.field962 = var374;
                                                    Statics.field51 = var375;
                                                }
                                                if (Statics.field962 != var374) {
                                                    Statics.field962 += (var374 - Statics.field962) / 16;
                                                }
                                                if (Statics.field51 != var375) {
                                                    Statics.field51 += (var375 - Statics.field51) / 16;
                                                }
                                                if (class131.field2008 == 4 && Statics.field1271) {
                                                    int var376 = class131.field2010 - field322;
                                                    field320 = var376 * 2;
                                                    field322 = var376 == -1 || var376 == 1 ? class131.field2010 : (field322 + class131.field2010) / 2;
                                                    int var377 = field244 - class131.field2009;
                                                    field319 = var377 * 2;
                                                    field244 = var377 == -1 || var377 == 1 ? class131.field2009 : (field244 + class131.field2009) / 2;
                                                } else {
                                                    if (class128.field1978[96]) {
                                                        field319 += (-24 - field319) / 2;
                                                    } else if (class128.field1978[97]) {
                                                        field319 += (24 - field319) / 2;
                                                    } else {
                                                        field319 /= 2;
                                                    }
                                                    if (class128.field1978[98]) {
                                                        field320 += (12 - field320) / 2;
                                                    } else if (class128.field1978[99]) {
                                                        field320 += (-12 - field320) / 2;
                                                    } else {
                                                        field320 /= 2;
                                                    }
                                                    field322 = class131.field2010;
                                                    field244 = class131.field2009;
                                                }
                                                field310 = field319 / 2 + field310 & 0x7FF;
                                                field291 += field320 / 2;
                                                if (field291 < 128) {
                                                    field291 = 128;
                                                }
                                                if (field291 > 383) {
                                                    field291 = 383;
                                                }
                                                int var378 = Statics.field962 >> 7;
                                                int var379 = Statics.field51 >> 7;
                                                int var380 = method868(Statics.field962, Statics.field51, Statics.field1082);
                                                int var381 = 0;
                                                if (var378 > 3 && var379 > 3 && var378 < 100 && var379 < 100) {
                                                    for (int var382 = var378 - 4; var382 <= var378 + 4; var382++) {
                                                        for (int var383 = var379 - 4; var383 <= var379 + 4; var383++) {
                                                            int var384 = Statics.field1082;
                                                            if (var384 < 3 && (class6.field70[1][var382][var383] & 0x2) == 2) {
                                                                var384++;
                                                            }
                                                            int var385 = var380 - class6.field74[var384][var382][var383];
                                                            if (var385 > var381) {
                                                                var381 = var385;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var386 = var381 * 192;
                                                if (var386 > 98048) {
                                                    var386 = 98048;
                                                }
                                                if (var386 < 32768) {
                                                    var386 = 32768;
                                                }
                                                if (var386 > field325) {
                                                    field325 += (var386 - field325) / 24;
                                                } else if (var386 < field325) {
                                                    field325 += (var386 - field325) / 80;
                                                }
                                                if (field481) {
                                                    method1797();
                                                }
                                                for (int var387 = 0; var387 < 5; var387++) {
                                                    int var10002 = field486[var387]++;
                                                }
                                                int var388 = class131.method2535();
                                                int var389 = class128.field1981;
                                                if (var388 > 15000 && var389 > 15000) {
                                                    field301 = 250;
                                                    class131.field2004 = 14500;
                                                    field275.method2367(190);
                                                }
                                                field382++;
                                                if (field382 > 500) {
                                                    field382 = 0;
                                                    int var391 = (int) (Math.random() * 8.0D);
                                                    if ((var391 & 0x1) == 1) {
                                                        field457 += field298;
                                                    }
                                                    if ((var391 & 0x2) == 2) {
                                                        field357 += field274;
                                                    }
                                                    if ((var391 & 0x4) == 4) {
                                                        field407 += field302;
                                                    }
                                                }
                                                if (field457 < -50) {
                                                    field298 = 2;
                                                }
                                                if (field457 > 50) {
                                                    field298 = -2;
                                                }
                                                if (field357 < -55) {
                                                    field274 = 2;
                                                }
                                                if (field357 > 55) {
                                                    field274 = -2;
                                                }
                                                if (field407 < -40) {
                                                    field302 = 1;
                                                }
                                                if (field407 > 40) {
                                                    field302 = -1;
                                                }
                                                field308++;
                                                if (field308 > 500) {
                                                    field308 = 0;
                                                    int var392 = (int) (Math.random() * 8.0D);
                                                    if ((var392 & 0x1) == 1) {
                                                        field304 += field305;
                                                    }
                                                    if ((var392 & 0x2) == 2) {
                                                        field306 += field307;
                                                    }
                                                }
                                                if (field304 < -60) {
                                                    field305 = 2;
                                                }
                                                if (field304 > 60) {
                                                    field305 = -2;
                                                }
                                                if (field306 < -20) {
                                                    field307 = 1;
                                                }
                                                if (field306 > 10) {
                                                    field307 = -1;
                                                }
                                                for (class35 var393 = (class35) field490.method3217(); var393 != null; var393 = (class35) field490.method3215()) {
                                                    if ((long) var393.field768 < class106.method870() / 1000L - 5L) {
                                                        if (var393.field770 > 0) {
                                                            class10.method616(5, "", var393.field764 + class147.field2311);
                                                        }
                                                        if (var393.field770 == 0) {
                                                            class10.method616(5, "", var393.field764 + class147.field2312);
                                                        }
                                                        var393.method3350();
                                                    }
                                                }
                                                field480++;
                                                if (field480 > 50) {
                                                    field275.method2367(174);
                                                }
                                                try {
                                                    if (Statics.field3046 != null && field275.field1842 > 0) {
                                                        Statics.field3046.method2599(field275.field1844, 0, field275.field1842);
                                                        field275.field1842 = 0;
                                                        field480 = 0;
                                                    }
                                                } catch (IOException var396) {
                                                    if (field301 > 0) {
                                                        method917();
                                                    } else {
                                                        method871(40);
                                                        Statics.field175 = Statics.field3046;
                                                        Statics.field3046 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var351 = var350.field3;
                                            if (var351.field2550 < 0) {
                                                break;
                                            }
                                            var352 = class157.method2872(var351.field2608);
                                        } while (var352 == null || var352.field2660 == null || var351.field2550 >= var352.field2660.length || var352.field2660[var351.field2550] != var351);
                                        class33.method131(var350);
                                    }
                                }
                                var348 = var347.field3;
                                if (var348.field2550 < 0) {
                                    break;
                                }
                                var349 = class157.method2872(var348.field2608);
                            } while (var349 == null || var349.field2660 == null || var348.field2550 >= var349.field2660.length || var349.field2660[var348.field2550] != var348);
                            class33.method131(var347);
                        }
                    }
                    var345 = var344.field3;
                    if (var345.field2550 < 0) {
                        break;
                    }
                    var346 = class157.method2872(var345.field2608);
                } while (var346 == null || var346.field2660 == null || var345.field2550 >= var346.field2660.length || var346.field2660[var345.field2550] != var345);
                class33.method131(var344);
            }
        } else if (field301 > 0) {
            method917();
        } else {
            method871(40);
            Statics.field175 = Statics.field3046;
            Statics.field3046 = null;
        }
    }

    @ObfuscatedName("fj.i(S)V")
    public static final void method2930() {
        if (Statics.field112 != null) {
            Statics.field112.method1015();
        }
        if (Statics.field108 != null) {
            Statics.field108.method1015();
        }
    }

    @ObfuscatedName("e.aw(B)V")
    public static final void method166() {
        for (int var0 = 0; var0 < field475; var0++) {
            int var10002 = field478[var0]--;
            if (field478[var0] >= -10) {
                class53 var2 = field257[var0];
                if (var2 == null) {
                    class53 var10000 = (class53) null;
                    var2 = class53.method1069(Statics.field63, field476[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field478[var0] += var2.method1063();
                    field257[var0] = var2;
                }
                if (field478[var0] < 0) {
                    int var9;
                    if (field379[var0] == 0) {
                        var9 = field473;
                    } else {
                        int var3 = (field379[var0] & 0xFF) * 128;
                        int var4 = field379[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2498.field746;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field379[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2498.field752;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field478[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field474 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class57 var10 = var2.method1062().method1098(Statics.field687);
                        class59 var11 = class59.method1167(var10, 100, var9);
                        var11.method1248(field452[var0] - 1);
                        Statics.field543.method978(var11);
                    }
                    field478[var0] = -100;
                }
            } else {
                field475--;
                for (int var1 = var0; var1 < field475; var1++) {
                    field476[var1] = field476[var1 + 1];
                    field257[var1] = field257[var1 + 1];
                    field452[var1] = field452[var1 + 1];
                    field478[var1] = field478[var1 + 1];
                    field379[var1] = field379[var1 + 1];
                }
                var0--;
            }
        }
        if (field472 && !class166.method2592()) {
            if (field470 != 0 && field469 != -1) {
                class166.method812(Statics.field1928, field469, 0, field470, false);
            }
            field472 = false;
        }
    }

    @ObfuscatedName("z.ar(Lat;IIII)V")
    public static void method84(class39 arg0, int arg1, int arg2, int arg3) {
        if (field475 >= 50 || field474 == 0 || arg0.field887 == null || arg1 >= arg0.field887.length) {
            return;
        }
        int var4 = arg0.field887[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field476[field475] = var5;
        field452[field475] = var6;
        field478[field475] = 0;
        field257[field475] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field379[field475] = (var8 << 16) + (var9 << 8) + var7;
        field475++;
    }

    @ObfuscatedName("dc.af(IIII)V")
    public static void method2435(int arg0, int arg1, int arg2) {
        if (field473 == 0 || arg1 == 0 || field475 >= 50) {
            return;
        }
        field476[field475] = arg0;
        field452[field475] = arg1;
        field478[field475] = arg2;
        field257[field475] = null;
        field379[field475] = 0;
        field475++;
    }

    @ObfuscatedName("ax.am(I)V")
    public static final void method601() {
        if (field317 && Statics.field1082 != field287) {
            method2861(Statics.field1414, Statics.field813, Statics.field1082, Statics.field2498.field755[0], Statics.field2498.field756[0]);
        } else if (Statics.field1082 != field462) {
            field462 = Statics.field1082;
            method2730(Statics.field1082);
        }
    }

    @ObfuscatedName("au.ax(I)V")
    public static final void method830() {
        for (int var0 = -1; var0 < field354; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field355[var0];
            }
            class3 var2 = field276[var1];
            if (var2 != null && var2.field717 > 0) {
                var2.field717--;
                if (var2.field717 == 0) {
                    var2.field714 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field366; var3++) {
            int var4 = field467[var3];
            class31 var5 = field272[var4];
            if (var5 != null && var5.field717 > 0) {
                var5.field717--;
                if (var5.field717 == 0) {
                    var5.field714 = null;
                }
            }
        }
    }

    @ObfuscatedName("cd.av(I)V")
    public static final void method1797() {
        int var0 = Statics.field1490 * 128 + 64;
        int var1 = Statics.field151 * 128 + 64;
        int var2 = method868(var0, var1, Statics.field1082) - Statics.field1832;
        if (Statics.field159 < var0) {
            Statics.field159 += Statics.field542 * (var0 - Statics.field159) / 1000 + Statics.field1757;
            if (Statics.field159 > var0) {
                Statics.field159 = var0;
            }
        }
        if (Statics.field159 > var0) {
            Statics.field159 -= Statics.field542 * (Statics.field159 - var0) / 1000 + Statics.field1757;
            if (Statics.field159 < var0) {
                Statics.field159 = var0;
            }
        }
        if (Statics.field1281 < var2) {
            Statics.field1281 += Statics.field542 * (var2 - Statics.field1281) / 1000 + Statics.field1757;
            if (Statics.field1281 > var2) {
                Statics.field1281 = var2;
            }
        }
        if (Statics.field1281 > var2) {
            Statics.field1281 -= Statics.field542 * (Statics.field1281 - var2) / 1000 + Statics.field1757;
            if (Statics.field1281 < var2) {
                Statics.field1281 = var2;
            }
        }
        if (Statics.field921 < var1) {
            Statics.field921 += Statics.field542 * (var1 - Statics.field921) / 1000 + Statics.field1757;
            if (Statics.field921 > var1) {
                Statics.field921 = var1;
            }
        }
        if (Statics.field921 > var1) {
            Statics.field921 -= Statics.field542 * (Statics.field921 - var1) / 1000 + Statics.field1757;
            if (Statics.field921 < var1) {
                Statics.field921 = var1;
            }
        }
        int var3 = Statics.field2930 * 128 + 64;
        int var4 = Statics.field598 * 128 + 64;
        int var5 = method868(var3, var4, Statics.field1082) - Statics.field29;
        int var6 = var3 - Statics.field159;
        int var7 = var5 - Statics.field1281;
        int var8 = var4 - Statics.field921;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2599 < var10) {
            Statics.field2599 += Statics.field192 * (var10 - Statics.field2599) / 1000 + Statics.field1923;
            if (Statics.field2599 > var10) {
                Statics.field2599 = var10;
            }
        }
        if (Statics.field2599 > var10) {
            Statics.field2599 -= Statics.field192 * (Statics.field2599 - var10) / 1000 + Statics.field1923;
            if (Statics.field2599 < var10) {
                Statics.field2599 = var10;
            }
        }
        int var12 = var11 - Statics.field2161;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field2161 += Statics.field192 * var12 / 1000 + Statics.field1923;
            Statics.field2161 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field2161 -= Statics.field192 * -var12 / 1000 + Statics.field1923;
            Statics.field2161 &= 0x7FF;
        }
        int var13 = var11 - Statics.field2161;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field2161 = var11;
        }
    }

    @ObfuscatedName("u.al(I)V")
    public static final void method163() {
        for (int var0 = 0; var0 < field366; var0++) {
            int var1 = field467[var0];
            class31 var2 = field272[var1];
            if (var2 != null) {
                method1378(var2, var2.field675.field779);
            }
        }
    }

    @ObfuscatedName("bs.ab(Lab;II)V")
    public static final void method1378(class34 arg0, int arg1) {
        if (arg0.field733 > field243) {
            int var2 = arg0.field733 - field243;
            int var3 = arg0.field742 * 128 + arg0.field705 * 64;
            int var4 = arg0.field712 * 128 + arg0.field705 * 64;
            arg0.field746 += (var3 - arg0.field746) / var2;
            arg0.field752 += (var4 - arg0.field752) / var2;
            arg0.field758 = 0;
            if (arg0.field748 == 0) {
                arg0.field716 = 1024;
            }
            if (arg0.field748 == 1) {
                arg0.field716 = 1536;
            }
            if (arg0.field748 == 2) {
                arg0.field716 = 0;
            }
            if (arg0.field748 == 3) {
                arg0.field716 = 512;
            }
        } else if (arg0.field735 >= field243) {
            if (field243 == arg0.field735 || arg0.field732 == -1 || arg0.field760 != 0 || arg0.field734 + 1 > class39.method2920(arg0.field732).field886[arg0.field702]) {
                int var5 = arg0.field735 - arg0.field733;
                int var6 = field243 - arg0.field733;
                int var7 = arg0.field742 * 128 + arg0.field705 * 64;
                int var8 = arg0.field712 * 128 + arg0.field705 * 64;
                int var9 = arg0.field743 * 128 + arg0.field705 * 64;
                int var10 = arg0.field745 * 128 + arg0.field705 * 64;
                arg0.field746 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field752 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field758 = 0;
            if (arg0.field748 == 0) {
                arg0.field716 = 1024;
            }
            if (arg0.field748 == 1) {
                arg0.field716 = 1536;
            }
            if (arg0.field748 == 2) {
                arg0.field716 = 0;
            }
            if (arg0.field748 == 3) {
                arg0.field716 = 512;
            }
            arg0.field703 = arg0.field716;
        } else {
            method18(arg0);
        }
        if (arg0.field746 < 128 || arg0.field752 < 128 || arg0.field746 >= 13184 || arg0.field752 >= 13184) {
            arg0.field732 = -1;
            arg0.field738 = -1;
            arg0.field733 = 0;
            arg0.field735 = 0;
            arg0.field746 = arg0.field755[0] * 128 + arg0.field705 * 64;
            arg0.field752 = arg0.field756[0] * 128 + arg0.field705 * 64;
            arg0.method638();
        }
        if (Statics.field2498 == arg0 && (arg0.field746 < 1536 || arg0.field752 < 1536 || arg0.field746 >= 11776 || arg0.field752 >= 11776)) {
            arg0.field732 = -1;
            arg0.field738 = -1;
            arg0.field733 = 0;
            arg0.field735 = 0;
            arg0.field746 = arg0.field755[0] * 128 + arg0.field705 * 64;
            arg0.field752 = arg0.field756[0] * 128 + arg0.field705 * 64;
            arg0.method638();
        }
        Statics.method3418(arg0);
        arg0.field704 = false;
        if (arg0.field729 != -1) {
            class39 var11 = class39.method2920(arg0.field729);
            if (var11 == null || var11.field892 == null) {
                arg0.field729 = -1;
            } else {
                arg0.field731++;
                if (arg0.field730 < var11.field892.length && arg0.field731 > var11.field886[arg0.field730]) {
                    arg0.field731 = 1;
                    arg0.field730++;
                    method84(var11, arg0.field730, arg0.field746, arg0.field752);
                }
                if (arg0.field730 >= var11.field892.length) {
                    arg0.field731 = 0;
                    arg0.field730 = 0;
                    method84(var11, arg0.field730, arg0.field746, arg0.field752);
                }
            }
        }
        if (arg0.field738 != -1 && field243 >= arg0.field711) {
            if (arg0.field762 < 0) {
                arg0.field762 = 0;
            }
            int var12 = class40.method761(arg0.field738).field915;
            if (var12 == -1) {
                arg0.field738 = -1;
            } else {
                class39 var13 = class39.method2920(var12);
                if (var13 == null || var13.field892 == null) {
                    arg0.field738 = -1;
                } else {
                    arg0.field737++;
                    if (arg0.field762 < var13.field892.length && arg0.field737 > var13.field886[arg0.field762]) {
                        arg0.field737 = 1;
                        arg0.field762++;
                        method84(var13, arg0.field762, arg0.field746, arg0.field752);
                    }
                    if (arg0.field762 >= var13.field892.length && (arg0.field762 < 0 || arg0.field762 >= var13.field892.length)) {
                        arg0.field738 = -1;
                    }
                }
            }
        }
        if (arg0.field732 != -1 && arg0.field760 <= 1) {
            class39 var14 = class39.method2920(arg0.field732);
            if (var14.field895 == 1 && arg0.field759 > 0 && arg0.field733 <= field243 && arg0.field735 < field243) {
                arg0.field760 = 1;
                return;
            }
        }
        if (arg0.field732 != -1 && arg0.field760 == 0) {
            class39 var15 = class39.method2920(arg0.field732);
            if (var15 == null || var15.field892 == null) {
                arg0.field732 = -1;
            } else {
                arg0.field734++;
                if (arg0.field702 < var15.field892.length && arg0.field734 > var15.field886[arg0.field702]) {
                    arg0.field734 = 1;
                    arg0.field702++;
                    method84(var15, arg0.field702, arg0.field746, arg0.field752);
                }
                if (arg0.field702 >= var15.field892.length) {
                    arg0.field702 -= var15.field888;
                    arg0.field740++;
                    if (arg0.field740 >= var15.field879) {
                        arg0.field732 = -1;
                    } else if (arg0.field702 >= 0 && arg0.field702 < var15.field892.length) {
                        method84(var15, arg0.field702, arg0.field746, arg0.field752);
                    } else {
                        arg0.field732 = -1;
                    }
                }
                arg0.field704 = var15.field890;
            }
        }
        if (arg0.field760 > 0) {
            arg0.field760--;
        }
    }

    @ObfuscatedName("d.ac(Lab;B)V")
    public static final void method18(class34 arg0) {
        arg0.field729 = arg0.field706;
        if (arg0.field751 == 0) {
            arg0.field758 = 0;
            return;
        }
        if (arg0.field732 != -1 && arg0.field760 == 0) {
            class39 var1 = class39.method2920(arg0.field732);
            if (arg0.field759 > 0 && var1.field895 == 0) {
                arg0.field758++;
                return;
            }
            if (arg0.field759 <= 0 && var1.field896 == 0) {
                arg0.field758++;
                return;
            }
        }
        int var2 = arg0.field746;
        int var3 = arg0.field752;
        int var4 = arg0.field755[arg0.field751 - 1] * 128 + arg0.field705 * 64;
        int var5 = arg0.field756[arg0.field751 - 1] * 128 + arg0.field705 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field746 = var4;
            arg0.field752 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field716 = 1280;
            } else if (var3 > var5) {
                arg0.field716 = 1792;
            } else {
                arg0.field716 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field716 = 768;
            } else if (var3 > var5) {
                arg0.field716 = 256;
            } else {
                arg0.field716 = 512;
            }
        } else if (var3 < var5) {
            arg0.field716 = 1024;
        } else if (var3 > var5) {
            arg0.field716 = 0;
        }
        int var6 = arg0.field716 - arg0.field703 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field757;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field754;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field721;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field709;
        }
        if (var7 == -1) {
            var7 = arg0.field754;
        }
        arg0.field729 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class31) {
            var9 = ((class31) arg0).field675.field797;
        }
        if (var9) {
            if (arg0.field716 != arg0.field703 && arg0.field726 == -1 && arg0.field710 != 0) {
                var8 = 2;
            }
            if (arg0.field751 > 2) {
                var8 = 6;
            }
            if (arg0.field751 > 3) {
                var8 = 8;
            }
            if (arg0.field758 > 0 && arg0.field751 > 1) {
                var8 = 8;
                arg0.field758--;
            }
        } else {
            if (arg0.field751 > 1) {
                var8 = 6;
            }
            if (arg0.field751 > 2) {
                var8 = 8;
            }
            if (arg0.field758 > 0 && arg0.field751 > 1) {
                var8 = 8;
                arg0.field758--;
            }
        }
        if (arg0.field747[arg0.field751 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field754 == arg0.field729 && arg0.field749 != -1) {
            arg0.field729 = arg0.field749;
        }
        if (var2 < var4) {
            arg0.field746 += var8;
            if (arg0.field746 > var4) {
                arg0.field746 = var4;
            }
        } else if (var2 > var4) {
            arg0.field746 -= var8;
            if (arg0.field746 < var4) {
                arg0.field746 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field752 += var8;
            if (arg0.field752 > var5) {
                arg0.field752 = var5;
            }
        } else if (var3 > var5) {
            arg0.field752 -= var8;
            if (arg0.field752 < var5) {
                arg0.field752 = var5;
            }
        }
        if (arg0.field746 == var4 && arg0.field752 == var5) {
            arg0.field751--;
            if (arg0.field759 > 0) {
                arg0.field759--;
            }
        }
    }

    @ObfuscatedName("u.az(Ld;III)V")
    public static void method164(class3 arg0, int arg1, int arg2) {
        if (arg0.field732 == arg1 && arg1 != -1) {
            int var3 = class39.method2920(arg1).field897;
            if (var3 == 1) {
                arg0.field702 = 0;
                arg0.field734 = 0;
                arg0.field760 = arg2;
                arg0.field740 = 0;
            }
            if (var3 == 2) {
                arg0.field740 = 0;
            }
        } else if (arg1 == -1 || arg0.field732 == -1 || class39.method2920(arg1).field894 >= class39.method2920(arg0.field732).field894) {
            arg0.field732 = arg1;
            arg0.field702 = 0;
            arg0.field734 = 0;
            arg0.field760 = arg2;
            arg0.field740 = 0;
            arg0.field759 = arg0.field751;
        }
    }

    @ObfuscatedName("cw.ah(B)V")
    public static final void method1987() {
        if (field395 != -1) {
            int var0 = field395;
            if (class157.method831(var0)) {
                method1620(Statics.field2641[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field440; var1++) {
            if (field442[var1]) {
                field443[var1] = true;
            }
            field444[var1] = field442[var1];
            field442[var1] = false;
        }
        field461 = field243;
        field384 = -1;
        field430 = -1;
        Statics.field212 = null;
        if (field395 != -1) {
            field440 = 0;
            method2716(field395, 0, 0, 765, 503, 0, 0, -1);
        }
        class74.method1533();
        if (field376) {
            int var2 = Statics.field965;
            int var3 = Statics.field620;
            int var4 = Statics.field2932;
            int var5 = Statics.field12;
            int var6 = 6116423;
            class74.method1540(var2, var3, var4, var5, var6);
            class74.method1540(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class74.method1539(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field184.method3534(class147.field2317, var2 + 3, var3 + 14, var6, -1);
            int var7 = class131.field2009;
            int var8 = class131.field2010;
            for (int var9 = 0; var9 < field441; var9++) {
                int var10 = (field441 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                Statics.field184.method3534(method2717(var9), var2 + 3, var10, var11, 0);
            }
            method641(Statics.field965, Statics.field620, Statics.field2932, Statics.field12);
        } else if (field384 != -1) {
            method725(field384, field430);
        }
        if (field449 == 3) {
            for (int var12 = 0; var12 < field440; var12++) {
                if (field444[var12]) {
                    class74.method1531(field377[var12], field385[var12], field284[var12], field438[var12], 16711935, 128);
                } else if (field443[var12]) {
                    class74.method1531(field377[var12], field385[var12], field284[var12], field438[var12], 16711680, 128);
                }
            }
        }
        class21.method559(Statics.field1082, Statics.field2498.field746, Statics.field2498.field752, field309);
        field309 = 0;
    }

    @ObfuscatedName("ar.at(Ljava/lang/String;ZI)V")
    public static final void method563(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field903.method3502(arg0, 250);
        int var6 = Statics.field903.method3485(arg0, 250) * 13;
        class74.method1540(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class74.method1539(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field903.method3489(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2875(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method641(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field877.getGraphics();
            Statics.field1994.method1384(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field877.repaint();
        }
    }

    @ObfuscatedName("cd.as(Lam;I)V")
    public static final void method1799(class30 arg0) {
        if (Statics.field2498.field746 >> 7 == field479 && Statics.field2498.field752 >> 7 == field468) {
            field479 = 0;
        }
        int var1 = field354;
        if (class30.field666 == arg0 || class30.field667 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class30.field666 == arg0) {
                var3 = Statics.field2498;
                var4 = 33538048;
            } else if (class30.field667 == arg0) {
                var3 = field276[field367];
                var4 = field367 << 14;
            } else {
                var3 = field276[field355[var2]];
                var4 = field355[var2] << 14;
                if (class30.field669 == arg0 && field367 == field355[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method14() && !var3.field49) {
                var3.field47 = false;
                if ((field317 && field354 > 50 || field354 > 200) && class30.field666 != arg0 && var3.field729 == var3.field706) {
                    var3.field47 = true;
                }
                int var5 = var3.field746 >> 7;
                int var6 = var3.field752 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field42 == null || field243 < var3.field32 || field243 >= var3.field38) {
                        if ((var3.field746 & 0x7F) == 64 && (var3.field752 & 0x7F) == 64) {
                            if (field337 == field336[var5][var6]) {
                                continue;
                            }
                            field336[var5][var6] = field337;
                        }
                        var3.field36 = method868(var3.field746, var3.field752, Statics.field1082);
                        Statics.field761.method1634(Statics.field1082, var3.field746, var3.field752, var3.field36, 60, var3, var3.field703, var4, var3.field704);
                    } else {
                        var3.field47 = false;
                        var3.field36 = method868(var3.field746, var3.field752, Statics.field1082);
                        Statics.field761.method1635(Statics.field1082, var3.field746, var3.field752, var3.field36, 60, var3, var3.field703, var4, var3.field45, var3.field30, var3.field35, var3.field44);
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.au(ZB)V")
    public static final void method93(boolean arg0) {
        for (int var1 = 0; var1 < field366; var1++) {
            class31 var2 = field272[field467[var1]];
            int var3 = (field467[var1] << 14) + 536870912;
            if (var2 != null && var2.method14() && var2.field675.field798 == arg0 && var2.field675.method647()) {
                int var4 = var2.field746 >> 7;
                int var5 = var2.field752 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field705 == 1 && (var2.field746 & 0x7F) == 64 && (var2.field752 & 0x7F) == 64) {
                        if (field337 == field336[var4][var5]) {
                            continue;
                        }
                        field336[var4][var5] = field337;
                    }
                    if (!var2.field675.field806) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field761.method1634(Statics.field1082, var2.field746, var2.field752, method868(var2.field746 + (var2.field705 * 64 - 64), var2.field752 + (var2.field705 * 64 - 64), Statics.field1082), var2.field705 * 64 - 64 + 60, var2, var2.field703, var3, var2.field704);
                }
            }
        }
    }

    @ObfuscatedName("cz.ag(I)V")
    public static final void method1985() {
        for (class27 var0 = (class27) field371.method3270(); var0 != null; var0 = (class27) field371.method3262()) {
            if (Statics.field1082 != var0.field612 || var0.field618) {
                var0.method3358();
            } else if (field243 >= var0.field616) {
                var0.method551(field309);
                if (var0.field618) {
                    var0.method3358();
                } else {
                    Statics.field761.method1634(var0.field612, var0.field609, var0.field610, var0.field611, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("er.an(I)I")
    public static final int method2862() {
        if (Statics.field1993.field126) {
            return Statics.field1082;
        }
        int var0 = 3;
        if (Statics.field2599 < 310) {
            int var1 = Statics.field159 >> 7;
            int var2 = Statics.field921 >> 7;
            int var3 = Statics.field2498.field746 >> 7;
            int var4 = Statics.field2498.field752 >> 7;
            if ((class6.field70[Statics.field1082][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1082;
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
                    if ((class6.field70[Statics.field1082][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1082;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field70[Statics.field1082][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1082;
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
                    if ((class6.field70[Statics.field1082][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1082;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field70[Statics.field1082][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1082;
                        }
                    }
                }
            }
        }
        if ((class6.field70[Statics.field1082][Statics.field2498.field746 >> 7][Statics.field2498.field752 >> 7] & 0x4) != 0) {
            var0 = Statics.field1082;
        }
        return var0;
    }

    @ObfuscatedName("fd.ad(I)I")
    public static final int method3184() {
        if (Statics.field1993.field126) {
            return Statics.field1082;
        } else {
            int var0 = method868(Statics.field159, Statics.field921, Statics.field1082);
            return var0 - Statics.field1281 >= 800 || (class6.field70[Statics.field1082][Statics.field159 >> 7][Statics.field921 >> 7] & 0x4) == 0 ? 3 : Statics.field1082;
        }
    }

    @ObfuscatedName("f.ae(Lab;IIIIIB)V")
    public static final void method83(class34 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method14()) {
            return;
        }
        if (arg0 instanceof class31) {
            class36 var6 = ((class31) arg0).field675;
            if (var6.field801 != null) {
                var6 = var6.method646();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field354) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field49) {
                return;
            }
            if (var8.field46 != -1 || var8.field33 != -1) {
                method145(arg0, arg0.field750 + 15);
                if (field338 > -1) {
                    if (var8.field46 != -1) {
                        Statics.field2052[var8.field46].method1463(field338 + arg2 - 12, field339 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field33 != -1) {
                        Statics.field1508[var8.field33].method1463(field338 + arg2 - 12, field339 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field251 == 10 && field403 == field355[arg1]) {
                method145(arg0, arg0.field750 + 15);
                if (field338 > -1) {
                    Statics.field1526[1].method1463(field338 + arg2 - 12, field339 + arg3 - var7);
                }
            }
        } else {
            class36 var9 = ((class31) arg0).field675;
            if (var9.field801 != null) {
                var9 = var9.method646();
            }
            if (var9.field778 >= 0 && var9.field778 < Statics.field1508.length) {
                method145(arg0, arg0.field750 + 15);
                if (field338 > -1) {
                    Statics.field1508[var9.field778].method1463(field338 + arg2 - 12, field339 + arg3 - 30);
                }
            }
            if (field251 == 1 && field252 == field467[arg1 - field354] && field243 % 20 < 10) {
                method145(arg0, arg0.field750 + 15);
                if (field338 > -1) {
                    Statics.field1526[0].method1463(field338 + arg2 - 12, field339 + arg3 - 28);
                }
            }
        }
        if (arg0.field714 != null && (arg1 >= field354 || !arg0.field753 && (field451 == 4 || !arg0.field715 && (field451 == 0 || field451 == 3 || field451 == 1 && method165(((class3) arg0).field43, false))))) {
            method145(arg0, arg0.field750);
            if (field338 > -1 && field253 < field359) {
                field331[field253] = Statics.field184.method3464(arg0.field714) / 2;
                field387[field253] = Statics.field184.field2981;
                field328[field253] = field338;
                field329[field253] = field339;
                field332[field253] = arg0.field718;
                field333[field253] = arg0.field719;
                field437[field253] = arg0.field717;
                field335[field253] = arg0.field714;
                field253++;
            }
        }
        if (arg0.field723 > field243) {
            method145(arg0, arg0.field750 + 15);
            if (field338 > -1) {
                int var10;
                if (arg1 < field354) {
                    var10 = 30;
                } else {
                    class36 var11 = ((class31) arg0).field675;
                    var10 = var11.field786;
                }
                int var12 = arg0.field724 * var10 / arg0.field725;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field724 > 0) {
                    var12 = 1;
                }
                class74.method1540(field338 + arg2 - var10 / 2, field339 + arg3 - 3, var12, 5, 65280);
                class74.method1540(field338 + arg2 - var10 / 2 + var12, field339 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field722[var13] > field243) {
                method145(arg0, arg0.field750 / 2);
                if (field338 > -1) {
                    if (var13 == 1) {
                        field339 -= 20;
                    }
                    if (var13 == 2) {
                        field338 -= 15;
                        field339 -= 10;
                    }
                    if (var13 == 3) {
                        field338 += 15;
                        field339 -= 10;
                    }
                    Statics.field64[arg0.field701[var13]].method1463(field338 + arg2 - 12, field339 + arg3 - 12);
                    Statics.field215.method3471(Integer.toString(arg0.field720[var13]), field338 + arg2 - 1, field339 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("fj.ak(IIIII)V")
    public static final void method2933(int arg0, int arg1, int arg2, int arg3) {
        field253 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field366 + field354; var6++) {
            class34 var7;
            if (var6 == -1) {
                var7 = Statics.field2498;
            } else if (var6 < field354) {
                var7 = field276[field355[var6]];
                if (field367 == field355[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field272[field467[var6 - field354]];
            }
            method83(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method83(field276[field367], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field253; var8++) {
            int var9 = field328[var8];
            int var10 = field329[var8];
            int var11 = field331[var8];
            int var12 = field387[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field329[var14] - field387[var14] && var10 - var12 < field329[var14] + 2 && var9 - var11 < field331[var14] + field328[var14] && var9 + var11 > field328[var14] - field331[var14] && field329[var14] - field387[var14] < var10) {
                        var10 = field329[var14] - field387[var14];
                        var13 = true;
                    }
                }
            }
            field338 = field328[var8];
            field339 = field329[var8] = var10;
            String var15 = field335[var8];
            if (field397 == 0) {
                int var16 = 16776960;
                if (field332[var8] < 6) {
                    var16 = field450[field332[var8]];
                }
                if (field332[var8] == 6) {
                    var16 = field337 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field332[var8] == 7) {
                    var16 = field337 % 20 < 10 ? 255 : 65535;
                }
                if (field332[var8] == 8) {
                    var16 = field337 % 20 < 10 ? 45056 : 8454016;
                }
                if (field332[var8] == 9) {
                    int var17 = 150 - field437[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field332[var8] == 10) {
                    int var18 = 150 - field437[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field332[var8] == 11) {
                    int var19 = 150 - field437[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field333[var8] == 0) {
                    Statics.field184.method3471(var15, field338 + arg0, field339 + arg1, var16, 0);
                }
                if (field333[var8] == 1) {
                    Statics.field184.method3560(var15, field338 + arg0, field339 + arg1, var16, 0, field337);
                }
                if (field333[var8] == 2) {
                    Statics.field184.method3474(var15, field338 + arg0, field339 + arg1, var16, 0, field337);
                }
                if (field333[var8] == 3) {
                    Statics.field184.method3475(var15, field338 + arg0, field339 + arg1, var16, 0, field337, 150 - field437[var8]);
                }
                if (field333[var8] == 4) {
                    int var20 = (150 - field437[var8]) * (Statics.field184.method3464(var15) + 100) / 150;
                    class74.method1535(field338 + arg0 - 50, arg1, field338 + arg0 + 50, arg1 + arg3);
                    Statics.field184.method3534(var15, field338 + arg0 + 50 - var20, field339 + arg1, var16, 0);
                    class74.method1534(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field333[var8] == 5) {
                    int var21 = 150 - field437[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class74.method1535(arg0, field339 + arg1 - Statics.field184.field2981 - 1, arg0 + arg2, field339 + arg1 + 5);
                    Statics.field184.method3471(var15, field338 + arg0, field339 + arg1 + var22, var16, 0);
                    class74.method1534(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field184.method3471(var15, field338 + arg0, field339 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("w.ay(Lab;II)V")
    public static final void method145(class34 arg0, int arg1) {
        method157(arg0.field746, arg0.field752, arg1);
    }

    @ObfuscatedName("q.ao(IIII)V")
    public static final void method157(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field338 = -1;
            field339 = -1;
            return;
        }
        int var3 = method868(arg0, arg1, Statics.field1082) - arg2;
        int var4 = arg0 - Statics.field159;
        int var5 = var3 - Statics.field1281;
        int var6 = arg1 - Statics.field921;
        int var7 = class85.field1470[Statics.field2599];
        int var8 = class85.field1483[Statics.field2599];
        int var9 = class85.field1470[Statics.field2161];
        int var10 = class85.field1483[Statics.field2161];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field338 = (var11 << 9) / var15 + 256;
            field339 = (var14 << 9) / var15 + 167;
        } else {
            field338 = -1;
            field339 = -1;
        }
    }

    @ObfuscatedName("ad.ai(IIII)I")
    public static final int method868(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field74[var5][var3][var4] + class6.field74[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field74[var5][var3][var4 + 1] + class6.field74[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("y.aa(IIIIIII)V")
    public static final void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class85.field1470[var6];
            int var12 = class85.field1483[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class85.field1470[var7];
            int var15 = class85.field1483[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field159 = arg0 - var8;
        Statics.field1281 = arg1 - var9;
        Statics.field921 = arg2 - var10;
        Statics.field2599 = arg3;
        Statics.field2161 = arg4;
    }

    @ObfuscatedName("cp.aj(ZI)V")
    public static final void method1897(boolean arg0) {
        field294 = arg0;
        if (!field294) {
            int var1 = field277.method2202();
            int var2 = field277.method2243();
            int var3 = field277.method2243();
            int var4 = field277.method2202();
            int var5 = field277.method2149();
            int var6 = (field413 - field277.field1842) / 16;
            Statics.field26 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    Statics.field26[var7][var8] = field277.method2189();
                }
            }
            Statics.field213 = new int[var6];
            Statics.field2745 = new int[var6];
            Statics.field977 = new int[var6];
            Statics.field210 = new byte[var6][];
            Statics.field604 = new byte[var6][];
            boolean var9 = false;
            if ((var4 / 8 == 48 || var4 / 8 == 49) && var2 / 8 == 48) {
                var9 = true;
            }
            if (var4 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var4 - 6) / 8; var11 <= (var4 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field213[var10] = var13;
                        Statics.field2745[var10] = Statics.field2085.method2762("m" + var11 + "_" + var12);
                        Statics.field977[var10] = Statics.field2085.method2762("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method2861(var4, var2, var5, var3, var1);
            return;
        }
        int var14 = field277.method2202();
        int var15 = field277.method2158();
        int var16 = field277.method2157();
        int var17 = field277.method2148();
        int var18 = field277.method2202();
        field277.method2393();
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = field277.method2370(1);
                    if (var22 == 1) {
                        field477[var19][var20][var21] = field277.method2370(26);
                    } else {
                        field477[var19][var20][var21] = -1;
                    }
                }
            }
        }
        field277.method2371();
        int var23 = (field413 - field277.field1842) / 16;
        Statics.field26 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                Statics.field26[var24][var25] = field277.method2164();
            }
        }
        Statics.field213 = new int[var23];
        Statics.field2745 = new int[var23];
        Statics.field977 = new int[var23];
        Statics.field210 = new byte[var23][];
        Statics.field604 = new byte[var23][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field477[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field213[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field213[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field2745[var26] = Statics.field2085.method2762("m" + var35 + "_" + var36);
                            Statics.field977[var26] = Statics.field2085.method2762("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method2861(var18, var14, var17, var16, var15);
    }

    @ObfuscatedName("er.be(IIIIII)V")
    public static final void method2861(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1414 == arg0 && Statics.field813 == arg1 && field287 == arg2 || !field317) {
            return;
        }
        Statics.field1414 = arg0;
        Statics.field813 = arg1;
        field287 = arg2;
        if (!field317) {
            field287 = 0;
        }
        method871(25);
        method563(class147.field2206, true);
        int var5 = Statics.field24;
        int var6 = Statics.field1047;
        Statics.field24 = (arg0 - 6) * 8;
        Statics.field1047 = (arg1 - 6) * 8;
        int var7 = Statics.field24 - var5;
        int var8 = Statics.field1047 - var6;
        int var9 = Statics.field24;
        int var10 = Statics.field1047;
        for (int var11 = 0; var11 < 32768; var11++) {
            class31 var12 = field272[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field755[var13] -= var7;
                    var12.field756[var13] -= var8;
                }
                var12.field746 -= var7 * 128;
                var12.field752 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field276[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field755[var16] -= var7;
                    var15.field756[var16] -= var8;
                }
                var15.field746 -= var7 * 128;
                var15.field752 -= var8 * 128;
            }
        }
        Statics.field1082 = arg2;
        Statics.field2498.method637(arg3, arg4, false);
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
                        field368[var27][var23][var24] = field368[var27][var25][var26];
                    } else {
                        field368[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field369.method3270(); var28 != null; var28 = (class15) field369.method3262()) {
            var28.field199 -= var7;
            var28.field200 -= var8;
            if (var28.field199 < 0 || var28.field200 < 0 || var28.field199 >= 104 || var28.field200 >= 104) {
                var28.method3358();
            }
        }
        if (field479 != 0) {
            field479 -= var7;
            field468 -= var8;
        }
        field475 = 0;
        field481 = false;
        field462 = -1;
        field371.method3255();
        field370.method3255();
    }

    @ObfuscatedName("w.bi(ZI)V")
    public static final void method143(boolean arg0) {
        method2930();
        field480++;
        if (field480 < 50 && !arg0) {
            return;
        }
        field480 = 0;
        if (field448 || Statics.field3046 == null) {
            return;
        }
        field275.method2367(174);
        try {
            Statics.field3046.method2599(field275.field1844, 0, field275.field1842);
            field275.field1842 = 0;
        } catch (IOException var2) {
            field448 = true;
        }
    }

    @ObfuscatedName("cc.bn(I)V")
    public static final void method1617() {
        method143(false);
        field288 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field210.length; var1++) {
            if (Statics.field2745[var1] != -1 && Statics.field210[var1] == null) {
                Statics.field210[var1] = Statics.field2085.method2811(Statics.field2745[var1], 0);
                if (Statics.field210[var1] == null) {
                    var0 = false;
                    field288++;
                }
            }
            if (Statics.field977[var1] != -1 && Statics.field604[var1] == null) {
                Statics.field604[var1] = Statics.field2085.method2748(Statics.field977[var1], 0, Statics.field26[var1]);
                if (Statics.field604[var1] == null) {
                    var0 = false;
                    field288++;
                }
            }
        }
        if (!var0) {
            field292 = 1;
            return;
        }
        field290 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field210.length; var3++) {
            byte[] var4 = Statics.field604[var3];
            if (var4 != null) {
                int var5 = (Statics.field213[var3] >> 8) * 64 - Statics.field24;
                int var6 = (Statics.field213[var3] & 0xFF) * 64 - Statics.field1047;
                if (field294) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method519(var4, var5, var6);
            }
        }
        if (!var2) {
            field292 = 2;
            return;
        }
        if (field292 != 0) {
            method563(class147.field2206 + class2.field20 + class2.field17 + 100 + "%" + class2.field25, true);
        }
        method2930();
        method133();
        method2930();
        Statics.field761.method1744();
        method2930();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field273[var7].method3607();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field70[var8][var9][var10] = 0;
                }
            }
        }
        method2930();
        class6.field68 = 99;
        Statics.field695 = new byte[4][104][104];
        Statics.field69 = new byte[4][104][104];
        Statics.field1819 = new byte[4][104][104];
        Statics.field1663 = new byte[4][104][104];
        Statics.field72 = new int[4][105][105];
        Statics.field82 = new byte[4][105][105];
        Statics.field3036 = new int[105][105];
        Statics.field766 = new int[104];
        Statics.field2937 = new int[104];
        Statics.field71 = new int[104];
        Statics.field2124 = new int[104];
        Statics.field1808 = new int[104];
        int var11 = Statics.field210.length;
        for (class21 var12 = (class21) class21.field531.method3270(); var12 != null; var12 = (class21) class21.field531.method3262()) {
            if (var12.field534 != null) {
                Statics.field543.method1012(var12.field534);
                var12.field534 = null;
            }
            if (var12.field540 != null) {
                Statics.field543.method1012(var12.field540);
                var12.field540 = null;
            }
        }
        class21.field531.method3255();
        method143(true);
        if (!field294) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field213[var13] >> 8) * 64 - Statics.field24;
                int var15 = (Statics.field213[var13] & 0xFF) * 64 - Statics.field1047;
                byte[] var16 = Statics.field210[var13];
                if (var16 != null) {
                    method2930();
                    class6.method2364(var16, var14, var15, Statics.field1414 * 8 - 48, Statics.field813 * 8 - 48, field273);
                }
            }
            for (int var17 = 0; var17 < var11; var17++) {
                int var18 = (Statics.field213[var17] >> 8) * 64 - Statics.field24;
                int var19 = (Statics.field213[var17] & 0xFF) * 64 - Statics.field1047;
                byte[] var20 = Statics.field210[var17];
                if (var20 == null && Statics.field813 < 800) {
                    method2930();
                    class6.method599(var18, var19, 64, 64);
                }
            }
            method143(true);
            for (int var21 = 0; var21 < var11; var21++) {
                byte[] var22 = Statics.field604[var21];
                if (var22 != null) {
                    int var23 = (Statics.field213[var21] >> 8) * 64 - Statics.field24;
                    int var24 = (Statics.field213[var21] & 0xFF) * 64 - Statics.field1047;
                    method2930();
                    class6.method20(var22, var23, var24, Statics.field761, field273);
                }
            }
        }
        if (field294) {
            for (int var25 = 0; var25 < 4; var25++) {
                method2930();
                for (int var26 = 0; var26 < 13; var26++) {
                    for (int var27 = 0; var27 < 13; var27++) {
                        boolean var28 = false;
                        int var29 = field477[var25][var26][var27];
                        if (var29 != -1) {
                            int var30 = var29 >> 24 & 0x3;
                            int var31 = var29 >> 1 & 0x3;
                            int var32 = var29 >> 14 & 0x3FF;
                            int var33 = var29 >> 3 & 0x7FF;
                            int var34 = (var32 / 8 << 8) + var33 / 8;
                            for (int var35 = 0; var35 < Statics.field213.length; var35++) {
                                if (Statics.field213[var35] == var34 && Statics.field210[var35] != null) {
                                    Statics.method142(Statics.field210[var35], var25, var26 * 8, var27 * 8, var30, (var32 & 0x7) * 8, (var33 & 0x7) * 8, var31, field273);
                                    var28 = true;
                                    break;
                                }
                            }
                        }
                        if (!var28) {
                            int var36 = var25;
                            int var37 = var26 * 8;
                            int var38 = var27 * 8;
                            for (int var39 = 0; var39 < 8; var39++) {
                                for (int var40 = 0; var40 < 8; var40++) {
                                    class6.field74[var36][var37 + var39][var38 + var40] = 0;
                                }
                            }
                            if (var37 > 0) {
                                for (int var41 = 1; var41 < 8; var41++) {
                                    class6.field74[var36][var37][var38 + var41] = class6.field74[var36][var37 - 1][var38 + var41];
                                }
                            }
                            if (var38 > 0) {
                                for (int var42 = 1; var42 < 8; var42++) {
                                    class6.field74[var36][var37 + var42][var38] = class6.field74[var36][var37 + var42][var38 - 1];
                                }
                            }
                            if (var37 > 0 && class6.field74[var36][var37 - 1][var38] != 0) {
                                class6.field74[var36][var37][var38] = class6.field74[var36][var37 - 1][var38];
                            } else if (var38 > 0 && class6.field74[var36][var37][var38 - 1] != 0) {
                                class6.field74[var36][var37][var38] = class6.field74[var36][var37][var38 - 1];
                            } else if (var37 > 0 && var38 > 0 && class6.field74[var36][var37 - 1][var38 - 1] != 0) {
                                class6.field74[var36][var37][var38] = class6.field74[var36][var37 - 1][var38 - 1];
                            }
                        }
                    }
                }
            }
            for (int var43 = 0; var43 < 13; var43++) {
                for (int var44 = 0; var44 < 13; var44++) {
                    int var45 = field477[0][var43][var44];
                    if (var45 == -1) {
                        class6.method599(var43 * 8, var44 * 8, 8, 8);
                    }
                }
            }
            method143(true);
            for (int var46 = 0; var46 < 4; var46++) {
                method2930();
                for (int var47 = 0; var47 < 13; var47++) {
                    for (int var48 = 0; var48 < 13; var48++) {
                        int var49 = field477[var46][var47][var48];
                        if (var49 != -1) {
                            int var50 = var49 >> 24 & 0x3;
                            int var51 = var49 >> 1 & 0x3;
                            int var52 = var49 >> 14 & 0x3FF;
                            int var53 = var49 >> 3 & 0x7FF;
                            int var54 = (var52 / 8 << 8) + var53 / 8;
                            for (int var55 = 0; var55 < Statics.field213.length; var55++) {
                                if (Statics.field213[var55] == var54 && Statics.field604[var55] != null) {
                                    class6.method2067(Statics.field604[var55], var46, var47 * 8, var48 * 8, var50, (var52 & 0x7) * 8, (var53 & 0x7) * 8, var51, Statics.field761, field273);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method143(true);
        method133();
        method2930();
        class6.method25(Statics.field761, field273);
        method143(true);
        int var56 = class6.field68;
        if (var56 > Statics.field1082) {
            var56 = Statics.field1082;
        }
        if (var56 < Statics.field1082 - 1) {
            int var57 = Statics.field1082 - 1;
        }
        if (field317) {
            Statics.field761.method1624(class6.field68);
        } else {
            Statics.field761.method1624(0);
        }
        for (int var58 = 0; var58 < 104; var58++) {
            for (int var59 = 0; var59 < 104; var59++) {
                method3170(var58, var59);
            }
        }
        method2930();
        method28();
        class37.field818.method3190();
        if (Statics.field228 != null) {
            field275.method2367(162);
            field275.method2113(1057001181);
        }
        if (!field294) {
            int var60 = (Statics.field1414 - 6) / 8;
            int var61 = (Statics.field1414 + 6) / 8;
            int var62 = (Statics.field813 - 6) / 8;
            int var63 = (Statics.field813 + 6) / 8;
            for (int var64 = var60 - 1; var64 <= var61 + 1; var64++) {
                for (int var65 = var62 - 1; var65 <= var63 + 1; var65++) {
                    if (var64 < var60 || var64 > var61 || var65 < var62 || var65 > var63) {
                        Statics.field2085.method2767("m" + var64 + "_" + var65);
                        Statics.field2085.method2767("l" + var64 + "_" + var65);
                    }
                }
            }
        }
        method871(30);
        method2930();
        Statics.field695 = (byte[][][]) null;
        Statics.field69 = (byte[][][]) null;
        Statics.field1819 = (byte[][][]) null;
        Statics.field1663 = (byte[][][]) null;
        Statics.field72 = (int[][][]) null;
        Statics.field82 = (byte[][][]) null;
        Statics.field3036 = (int[][]) null;
        Statics.field766 = null;
        Statics.field2937 = null;
        Statics.field71 = null;
        Statics.field2124 = null;
        Statics.field1808 = null;
        field275.method2367(196);
        Statics.field626.method2455();
        for (int var66 = 0; var66 < 32; var66++) {
            field2062[var66] = 0L;
        }
        for (int var67 = 0; var67 < 32; var67++) {
            field2063[var67] = 0L;
        }
        Statics.field183 = 0;
    }

    @ObfuscatedName("eo.bt(II)V")
    public static final void method2730(int arg0) {
        int[] var1 = Statics.field2142.field1295;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field70[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field761.method1675(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field70[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field761.method1675(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2142.method1477();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field70[arg0][var10][var9] & 0x18) == 0) {
                    method2475(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field70[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2475(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field378 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field761.method1652(Statics.field1082, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class37.method2053(var14).field833;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field273[Statics.field1082].field3026;
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
                        field466[field378] = Statics.field870[var15];
                        field464[field378] = var16;
                        field465[field378] = var17;
                        field378++;
                    }
                }
            }
        }
        Statics.field1994.method1447();
    }

    @ObfuscatedName("di.bk(IIIIII)V")
    public static final void method2475(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field761.method1788(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field761.method1653(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2142.field1295;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class37 var13 = class37.method2053(var12);
            if (var13.field844 == -1) {
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
                class75 var14 = Statics.field1043[var13.field844];
                if (var14 != null) {
                    int var15 = (var13.field856 * 4 - var14.field1315) / 2;
                    int var16 = (var13.field831 * 4 - var14.field1313) / 2;
                    var14.method1601(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field831) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field761.method1706(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field761.method1653(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class37 var22 = class37.method2053(var21);
            if (var22.field844 != -1) {
                class75 var23 = Statics.field1043[var22.field844];
                if (var23 != null) {
                    int var24 = (var22.field856 * 4 - var23.field1315) / 2;
                    int var25 = (var22.field831 * 4 - var23.field1313) / 2;
                    var23.method1601(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field831) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2142.field1295;
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
        int var29 = Statics.field761.method1652(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class37 var31 = class37.method2053(var30);
        if (var31.field844 == -1) {
            return;
        }
        class75 var32 = Statics.field1043[var31.field844];
        if (var32 != null) {
            int var33 = (var31.field856 * 4 - var32.field1315) / 2;
            int var34 = (var31.field831 * 4 - var32.field1313) / 2;
            var32.method1601(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field831) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("af.br(B)V")
    public static final void method564() {
        if (field279 == 255) {
            int var0 = field277.method2202();
            int var1 = field277.method2148();
            int var2 = (var1 >> 4 & 0x7) + Statics.field1804;
            int var3 = (var1 & 0x7) + Statics.field2535;
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class182 var4 = field368[Statics.field1082][var2][var3];
                if (var4 != null) {
                    for (class26 var5 = (class26) var4.method3270(); var5 != null; var5 = (class26) var4.method3262()) {
                        if ((var0 & 0x7FFF) == var5.field605) {
                            var5.method3358();
                            break;
                        }
                    }
                    if (var4.method3270() == null) {
                        field368[Statics.field1082][var2][var3] = null;
                    }
                    method3170(var2, var3);
                }
            }
            return;
        }
        if (field279 == 227) {
            byte var6 = field277.method2216();
            int var7 = field277.method2158();
            int var8 = field277.method2243();
            byte var9 = field277.method2216();
            byte var10 = field277.method2323();
            int var11 = field277.method2202();
            int var12 = field277.method2149();
            int var13 = (var12 >> 4 & 0x7) + Statics.field1804;
            int var14 = (var12 & 0x7) + Statics.field2535;
            int var15 = field277.method2157();
            int var16 = field277.method2149();
            int var17 = var16 >> 2;
            int var18 = var16 & 0x3;
            int var19 = field296[var17];
            byte var20 = field277.method2323();
            class3 var21;
            if (field326 == var7) {
                var21 = Statics.field2498;
            } else {
                var21 = field276[var7];
            }
            if (var21 != null) {
                class37 var22 = class37.method2053(var11);
                int var23;
                int var24;
                if (var18 == 1 || var18 == 3) {
                    var23 = var22.field831;
                    var24 = var22.field856;
                } else {
                    var23 = var22.field856;
                    var24 = var22.field831;
                }
                int var25 = (var23 >> 1) + var13;
                int var26 = (var23 + 1 >> 1) + var13;
                int var27 = (var24 >> 1) + var14;
                int var28 = (var24 + 1 >> 1) + var14;
                int[][] var29 = class6.field74[Statics.field1082];
                int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
                int var31 = (var13 << 7) + (var23 << 6);
                int var32 = (var14 << 7) + (var24 << 6);
                class99 var33 = var22.method708(var17, var18, var29, var31, var30, var32);
                if (var33 != null) {
                    method495(Statics.field1082, var13, var14, var19, -1, 0, 0, var15 + 1, var8 + 1);
                    var21.field32 = field243 + var15;
                    var21.field38 = field243 + var8;
                    var21.field42 = var33;
                    var21.field39 = var13 * 128 + var23 * 64;
                    var21.field41 = var14 * 128 + var24 * 64;
                    var21.field40 = var30;
                    if (var6 > var10) {
                        byte var34 = var6;
                        var6 = var10;
                        var10 = var34;
                    }
                    if (var20 > var9) {
                        byte var35 = var20;
                        var20 = var9;
                        var9 = var35;
                    }
                    var21.field45 = var6 + var13;
                    var21.field35 = var10 + var13;
                    var21.field30 = var14 + var20;
                    var21.field44 = var9 + var14;
                }
            }
        }
        if (field279 == 166) {
            int var36 = field277.method2309();
            int var37 = (var36 >> 4 & 0x7) + Statics.field1804;
            int var38 = (var36 & 0x7) + Statics.field2535;
            int var39 = field277.method2243();
            int var40 = field277.method2243();
            int var41 = field277.method2243();
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                class182 var42 = field368[Statics.field1082][var37][var38];
                if (var42 != null) {
                    for (class26 var43 = (class26) var42.method3270(); var43 != null; var43 = (class26) var42.method3262()) {
                        if ((var39 & 0x7FFF) == var43.field605 && var43.field603 == var40) {
                            var43.field603 = var41;
                            break;
                        }
                    }
                    method3170(var37, var38);
                }
            }
        } else if (field279 == 80) {
            int var44 = field277.method2309();
            int var45 = var44 >> 2;
            int var46 = var44 & 0x3;
            int var47 = field296[var45];
            int var48 = field277.method2309();
            int var49 = (var48 >> 4 & 0x7) + Statics.field1804;
            int var50 = (var48 & 0x7) + Statics.field2535;
            if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                method495(Statics.field1082, var49, var50, var47, -1, var45, var46, 0, -1);
            }
        } else if (field279 == 11) {
            int var51 = field277.method2309();
            int var52 = (var51 >> 4 & 0x7) + Statics.field1804;
            int var53 = (var51 & 0x7) + Statics.field2535;
            int var54 = var52 + field277.method2125();
            int var55 = var53 + field277.method2125();
            int var56 = field277.method2127();
            int var57 = field277.method2243();
            int var58 = field277.method2309() * 4;
            int var59 = field277.method2309() * 4;
            int var60 = field277.method2243();
            int var61 = field277.method2243();
            int var62 = field277.method2309();
            int var63 = field277.method2309();
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104 && var57 != 65535) {
                int var64 = var52 * 128 + 64;
                int var65 = var53 * 128 + 64;
                int var66 = var54 * 128 + 64;
                int var67 = var55 * 128 + 64;
                class7 var68 = new class7(var57, Statics.field1082, var64, var65, method868(var64, var65, Statics.field1082) - var58, field243 + var60, field243 + var61, var62, var63, var56, var59);
                var68.method85(var66, var67, method868(var66, var67, Statics.field1082) - var59, field243 + var60);
                field370.method3256(var68);
            }
        } else {
            if (field279 == 217) {
                int var69 = field277.method2309();
                int var70 = (var69 >> 4 & 0x7) + Statics.field1804;
                int var71 = (var69 & 0x7) + Statics.field2535;
                int var72 = field277.method2243();
                int var73 = field277.method2309();
                int var74 = var73 >> 4 & 0xF;
                int var75 = var73 & 0x7;
                int var76 = field277.method2309();
                if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                    int var77 = var74 + 1;
                    if (Statics.field2498.field755[0] >= var70 - var77 && Statics.field2498.field755[0] <= var70 + var77 && Statics.field2498.field756[0] >= var71 - var77 && Statics.field2498.field756[0] <= var71 + var77 && field474 != 0 && var75 > 0 && field475 < 50) {
                        field476[field475] = var72;
                        field452[field475] = var75;
                        field478[field475] = var76;
                        field257[field475] = null;
                        field379[field475] = (var70 << 16) + (var71 << 8) + var74;
                        field475++;
                    }
                }
            }
            if (field279 == 162) {
                int var78 = field277.method2148();
                int var79 = (var78 >> 4 & 0x7) + Statics.field1804;
                int var80 = (var78 & 0x7) + Statics.field2535;
                int var81 = field277.method2202();
                int var82 = field277.method2157();
                if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                    class26 var83 = new class26();
                    var83.field605 = var82;
                    var83.field603 = var81;
                    if (field368[Statics.field1082][var79][var80] == null) {
                        field368[Statics.field1082][var79][var80] = new class182();
                    }
                    field368[Statics.field1082][var79][var80].method3256(var83);
                    method3170(var79, var80);
                }
            } else if (field279 == 116) {
                int var84 = field277.method2157();
                int var85 = field277.method2148();
                int var86 = var85 >> 2;
                int var87 = var85 & 0x3;
                int var88 = field296[var86];
                int var89 = field277.method2149();
                int var90 = (var89 >> 4 & 0x7) + Statics.field1804;
                int var91 = (var89 & 0x7) + Statics.field2535;
                if (var90 >= 0 && var91 >= 0 && var90 < 103 && var91 < 103) {
                    if (var88 == 0) {
                        class81 var92 = Statics.field761.method1645(Statics.field1082, var90, var91);
                        if (var92 != null) {
                            int var93 = var92.field1415 >> 14 & 0x7FFF;
                            if (var86 == 2) {
                                var92.field1420 = new class11(var93, 2, var87 + 4, Statics.field1082, var90, var91, var84, false, var92.field1420);
                                var92.field1424 = new class11(var93, 2, var87 + 1 & 0x3, Statics.field1082, var90, var91, var84, false, var92.field1424);
                            } else {
                                var92.field1420 = new class11(var93, var86, var87, Statics.field1082, var90, var91, var84, false, var92.field1420);
                            }
                        }
                    }
                    if (var88 == 1) {
                        class88 var94 = Statics.field761.method1756(Statics.field1082, var90, var91);
                        if (var94 != null) {
                            int var95 = var94.field1505 >> 14 & 0x7FFF;
                            if (var86 == 4 || var86 == 5) {
                                var94.field1504 = new class11(var95, 4, var87, Statics.field1082, var90, var91, var84, false, var94.field1504);
                            } else if (var86 == 6) {
                                var94.field1504 = new class11(var95, 4, var87 + 4, Statics.field1082, var90, var91, var84, false, var94.field1504);
                            } else if (var86 == 7) {
                                var94.field1504 = new class11(var95, 4, (var87 + 2 & 0x3) + 4, Statics.field1082, var90, var91, var84, false, var94.field1504);
                            } else if (var86 == 8) {
                                var94.field1504 = new class11(var95, 4, var87 + 4, Statics.field1082, var90, var91, var84, false, var94.field1504);
                                var94.field1507 = new class11(var95, 4, (var87 + 2 & 0x3) + 4, Statics.field1082, var90, var91, var84, false, var94.field1507);
                            }
                        }
                    }
                    if (var88 == 2) {
                        class92 var96 = Statics.field761.method1647(Statics.field1082, var90, var91);
                        if (var86 == 11) {
                            var86 = 10;
                        }
                        if (var96 != null) {
                            var96.field1554 = new class11(var96.field1562 >> 14 & 0x7FFF, var86, var87, Statics.field1082, var90, var91, var84, false, var96.field1554);
                        }
                    }
                    if (var88 == 3) {
                        class87 var97 = Statics.field761.method1648(Statics.field1082, var90, var91);
                        if (var97 != null) {
                            var97.field1487 = new class11(var97.field1494 >> 14 & 0x7FFF, 22, var87, Statics.field1082, var90, var91, var84, false, var97.field1487);
                        }
                    }
                }
            } else if (field279 == 63) {
                int var98 = field277.method2309();
                int var99 = (var98 >> 4 & 0x7) + Statics.field1804;
                int var100 = (var98 & 0x7) + Statics.field2535;
                int var101 = field277.method2243();
                int var102 = field277.method2309();
                int var103 = field277.method2243();
                if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                    int var104 = var99 * 128 + 64;
                    int var105 = var100 * 128 + 64;
                    class27 var106 = new class27(var101, Statics.field1082, var104, var105, method868(var104, var105, Statics.field1082) - var102, var103, field243);
                    field371.method3256(var106);
                }
            } else if (field279 == 226) {
                int var107 = field277.method2149();
                int var108 = var107 >> 2;
                int var109 = var107 & 0x3;
                int var110 = field296[var108];
                int var111 = field277.method2158();
                int var112 = field277.method2309();
                int var113 = (var112 >> 4 & 0x7) + Statics.field1804;
                int var114 = (var112 & 0x7) + Statics.field2535;
                if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                    method495(Statics.field1082, var113, var114, var110, var111, var108, var109, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("g.bg(IIIIIIIIII)V")
    public static final void method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field369.method3270(); var10 != null; var10 = (class15) field369.method3262()) {
            if (var10.field191 == arg0 && var10.field199 == arg1 && var10.field200 == arg2 && var10.field187 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field191 = arg0;
            var9.field187 = arg3;
            var9.field199 = arg1;
            var9.field200 = arg2;
            method1615(var9);
            field369.method3256(var9);
        }
        var9.field193 = arg4;
        var9.field195 = arg5;
        var9.field194 = arg6;
        var9.field196 = arg7;
        var9.field197 = arg8;
    }

    @ObfuscatedName("r.bp(I)V")
    public static final void method28() {
        for (class15 var0 = (class15) field369.method3270(); var0 != null; var0 = (class15) field369.method3262()) {
            if (var0.field197 == -1) {
                var0.field196 = 0;
                method1615(var0);
            } else {
                var0.method3358();
            }
        }
    }

    @ObfuscatedName("ba.bw(Lu;S)V")
    public static final void method1615(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field187 == 0) {
            var1 = Statics.field761.method1788(arg0.field191, arg0.field199, arg0.field200);
        }
        if (arg0.field187 == 1) {
            var1 = Statics.field761.method1650(arg0.field191, arg0.field199, arg0.field200);
        }
        if (arg0.field187 == 2) {
            var1 = Statics.field761.method1706(arg0.field191, arg0.field199, arg0.field200);
        }
        if (arg0.field187 == 3) {
            var1 = Statics.field761.method1652(arg0.field191, arg0.field199, arg0.field200);
        }
        if (var1 != 0) {
            int var5 = Statics.field761.method1653(arg0.field191, arg0.field199, arg0.field200, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field190 = var2;
        arg0.field186 = var3;
        arg0.field189 = var4;
    }

    @ObfuscatedName("h.bu(B)V")
    public static final void method130() {
        for (class15 var0 = (class15) field369.method3270(); var0 != null; var0 = (class15) field369.method3262()) {
            if (var0.field197 > 0) {
                var0.field197--;
            }
            if (var0.field197 == 0) {
                if (var0.field190 >= 0) {
                    int var1 = var0.field190;
                    int var2 = var0.field186;
                    class37 var3 = class37.method2053(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method669(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method496(var0.field191, var0.field187, var0.field199, var0.field200, var0.field190, var0.field189, var0.field186);
                var0.method3358();
            } else {
                if (var0.field196 > 0) {
                    var0.field196--;
                }
                if (var0.field196 == 0 && var0.field199 >= 1 && var0.field200 >= 1 && var0.field199 <= 102 && var0.field200 <= 102) {
                    if (var0.field193 >= 0) {
                        int var5 = var0.field193;
                        int var6 = var0.field195;
                        class37 var7 = class37.method2053(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method669(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method496(var0.field191, var0.field187, var0.field199, var0.field200, var0.field193, var0.field194, var0.field195);
                    var0.field196 = -1;
                    if (var0.field193 == var0.field190 && var0.field190 == -1) {
                        var0.method3358();
                    } else if (var0.field193 == var0.field190 && var0.field194 == var0.field189 && var0.field195 == var0.field186) {
                        var0.method3358();
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.bb(IIIIIIII)V")
    public static final void method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field317 && Statics.field1082 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field761.method1788(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field761.method1650(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field761.method1706(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field761.method1652(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field761.method1653(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field761.method1640(arg0, arg2, arg3);
                class37 var15 = class37.method2053(var12);
                if (var15.field836 != 0) {
                    field273[arg0].method3625(arg2, arg3, var13, var14, var15.field825);
                }
            }
            if (arg1 == 1) {
                Statics.field761.method1641(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field761.method1642(arg0, arg2, arg3);
                class37 var16 = class37.method2053(var12);
                if (var16.field856 + arg2 > 103 || var16.field856 + arg3 > 103 || var16.field831 + arg2 > 103 || var16.field831 + arg3 > 103) {
                    return;
                }
                if (var16.field836 != 0) {
                    field273[arg0].method3614(arg2, arg3, var16.field856, var16.field831, var14, var16.field825);
                }
            }
            if (arg1 == 3) {
                Statics.field761.method1639(arg0, arg2, arg3);
                class37 var17 = class37.method2053(var12);
                if (var17.field836 == 1) {
                    field273[arg0].method3616(arg2, arg3);
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
        class80 var19 = Statics.field761;
        class211 var20 = field273[arg0];
        class37 var21 = class37.method2053(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field831;
            var23 = var21.field856;
        } else {
            var22 = var21.field856;
            var23 = var21.field831;
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
        int[][] var28 = class6.field74[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field849 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field855 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class79 var34;
            if (var21.field817 == -1 && var21.field828 == null) {
                var34 = var21.method708(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field817, true, (class79) null);
            }
            var19.method1629(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field836 == 1) {
                var20.method3611(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class79 var57;
            if (var21.field817 == -1 && var21.field828 == null) {
                var57 = var21.method708(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field817, true, (class79) null);
            }
            if (var57 != null) {
                var19.method1633(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field836 != 0) {
                var20.method3626(arg2, arg3, var22, var23, var21.field825);
            }
        } else if (arg6 >= 12) {
            class79 var35;
            if (var21.field817 == -1 && var21.field828 == null) {
                var35 = var21.method708(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field817, true, (class79) null);
            }
            var19.method1633(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field836 != 0) {
                var20.method3626(arg2, arg3, var22, var23, var21.field825);
            }
        } else if (arg6 == 0) {
            class79 var36;
            if (var21.field817 == -1 && var21.field828 == null) {
                var36 = var21.method708(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field817, true, (class79) null);
            }
            var19.method1669(arg0, arg2, arg3, var29, var36, (class79) null, class6.field73[arg5], 0, var32, var33);
            if (var21.field836 != 0) {
                var20.method3608(arg2, arg3, arg6, arg5, var21.field825);
            }
        } else if (arg6 == 1) {
            class79 var37;
            if (var21.field817 == -1 && var21.field828 == null) {
                var37 = var21.method708(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field817, true, (class79) null);
            }
            var19.method1669(arg0, arg2, arg3, var29, var37, (class79) null, class6.field67[arg5], 0, var32, var33);
            if (var21.field836 != 0) {
                var20.method3608(arg2, arg3, arg6, arg5, var21.field825);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class79 var39;
            class79 var40;
            if (var21.field817 == -1 && var21.field828 == null) {
                var39 = var21.method708(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method708(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field817, true, (class79) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field817, true, (class79) null);
            }
            var19.method1669(arg0, arg2, arg3, var29, var39, var40, class6.field73[arg5], class6.field73[var38], var32, var33);
            if (var21.field836 != 0) {
                var20.method3608(arg2, arg3, arg6, arg5, var21.field825);
            }
        } else if (arg6 == 3) {
            class79 var41;
            if (var21.field817 == -1 && var21.field828 == null) {
                var41 = var21.method708(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field817, true, (class79) null);
            }
            var19.method1669(arg0, arg2, arg3, var29, var41, (class79) null, class6.field67[arg5], 0, var32, var33);
            if (var21.field836 != 0) {
                var20.method3608(arg2, arg3, arg6, arg5, var21.field825);
            }
        } else if (arg6 == 9) {
            class79 var42;
            if (var21.field817 == -1 && var21.field828 == null) {
                var42 = var21.method708(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field817, true, (class79) null);
            }
            var19.method1633(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field836 != 0) {
                var20.method3626(arg2, arg3, var22, var23, var21.field825);
            }
        } else if (arg6 == 4) {
            class79 var43;
            if (var21.field817 == -1 && var21.field828 == null) {
                var43 = var21.method708(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field817, true, (class79) null);
            }
            var19.method1632(arg0, arg2, arg3, var29, var43, (class79) null, class6.field73[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1788(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class37.method2053(var45 >> 14 & 0x7FFF).field839;
            }
            class79 var46;
            if (var21.field817 == -1 && var21.field828 == null) {
                var46 = var21.method708(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field817, true, (class79) null);
            }
            var19.method1632(arg0, arg2, arg3, var29, var46, (class79) null, class6.field73[arg5], 0, class6.field75[arg5] * var44, class6.field76[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1788(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class37.method2053(var48 >> 14 & 0x7FFF).field839 / 2;
            }
            class79 var49;
            if (var21.field817 == -1 && var21.field828 == null) {
                var49 = var21.method708(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field817, true, (class79) null);
            }
            var19.method1632(arg0, arg2, arg3, var29, var49, (class79) null, 256, arg5, class6.field77[arg5] * var47, class6.field78[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class79 var51;
            if (var21.field817 == -1 && var21.field828 == null) {
                var51 = var21.method708(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field817, true, (class79) null);
            }
            var19.method1632(arg0, arg2, arg3, var29, var51, (class79) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1788(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class37.method2053(var53 >> 14 & 0x7FFF).field839 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class79 var55;
            class79 var56;
            if (var21.field817 == -1 && var21.field828 == null) {
                var55 = var21.method708(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method708(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field817, true, (class79) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field817, true, (class79) null);
            }
            var19.method1632(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field77[arg5] * var52, class6.field78[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("fw.bj(IIB)V")
    public static final void method3170(int arg0, int arg1) {
        class182 var2 = field368[Statics.field1082][arg0][arg1];
        if (var2 == null) {
            Statics.field761.method1722(Statics.field1082, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class26 var5 = null;
        for (class26 var6 = (class26) var2.method3270(); var6 != null; var6 = (class26) var2.method3262()) {
            class46 var7 = Statics.method607(var6.field605);
            long var8 = (long) var7.field1010;
            if (var7.field1009 == 1) {
                var8 = (long) (var6.field603 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field761.method1722(Statics.field1082, arg0, arg1);
            return;
        }
        var2.method3273(var5);
        class26 var10 = null;
        class26 var11 = null;
        for (class26 var12 = (class26) var2.method3270(); var12 != null; var12 = (class26) var2.method3262()) {
            if (var5.field605 != var12.field605) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field605 != var12.field605 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field761.method1760(Statics.field1082, arg0, arg1, method868(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1082), var5, var13, var10, var11);
    }

    @ObfuscatedName("an.bo(I)V")
    public static final void method856() {
        for (int var0 = 0; var0 < field356; var0++) {
            int var1 = field267[var0];
            class3 var2 = field276[var1];
            int var3 = field277.method2309();
            if ((var3 & 0x8) != 0) {
                var3 += field277.method2309() << 8;
            }
            method2430(var1, var2, var3);
        }
    }

    @ObfuscatedName("do.bd(ILd;II)V")
    public static final void method2430(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x2) != 0) {
            int var3 = field277.method2321();
            byte[] var4 = new byte[var3];
            class110 var5 = new class110(var4);
            field277.method2169(var4, 0, var3);
            field497[arg0] = var5;
            arg1.method12(var5);
        }
        if ((arg2 & 0x4) != 0) {
            arg1.field727 = field277.method2243();
            arg1.field728 = field277.method2157();
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field738 = field277.method2157();
            int var6 = field277.method2167();
            arg1.field741 = var6 >> 16;
            arg1.field711 = (var6 & 0xFFFF) + field243;
            arg1.field762 = 0;
            arg1.field737 = 0;
            if (arg1.field711 > field243) {
                arg1.field762 = -1;
            }
            if (arg1.field738 == 65535) {
                arg1.field738 = -1;
            }
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field742 = field277.method2321();
            arg1.field712 = field277.method2321();
            arg1.field743 = field277.method2321();
            arg1.field745 = field277.method2148();
            arg1.field733 = field277.method2243() + field243;
            arg1.field735 = field277.method2202() + field243;
            arg1.field748 = field277.method2309();
            arg1.field751 = 1;
            arg1.field759 = 0;
        }
        if ((arg2 & 0x1) != 0) {
            int var7 = field277.method2158();
            int var8 = field277.method2148();
            arg1.method627(var7, var8, field243);
            arg1.field723 = field243 + 300;
            arg1.field724 = field277.method2309();
            arg1.field725 = field277.method2321();
        }
        if ((arg2 & 0x80) != 0) {
            int var9 = field277.method2243();
            class142 var10 = (class142) Statics.method620(class142.method499(), field277.method2321());
            boolean var11 = field277.method2148() == 1;
            int var12 = field277.method2321();
            int var13 = field277.field1842;
            if (arg1.field43 != null && arg1.field31 != null) {
                boolean var14 = false;
                if (var10.field2118 && method1369(arg1.field43)) {
                    var14 = true;
                }
                if (!var14 && field352 == 0 && !arg1.field49) {
                    field259.field1842 = 0;
                    field277.method2170(field259.field1844, 0, var12);
                    field259.field1842 = 0;
                    String var15 = class206.method3468(class213.method2557(class205.method2721(field259)));
                    arg1.field714 = var15.trim();
                    arg1.field718 = var9 >> 8;
                    arg1.field719 = var9 & 0xFF;
                    arg1.field717 = 150;
                    arg1.field715 = var11;
                    arg1.field753 = Statics.field2498 != arg1 && var10.field2118 && field453 != "" && var15.toLowerCase().indexOf(field453) == -1;
                    int var16;
                    if (var10.field2120) {
                        var16 = var11 ? 91 : 1;
                    } else {
                        var16 = var11 ? 90 : 2;
                    }
                    if (var10.field2116 == -1) {
                        class10.method616(var16, arg1.field43, var15);
                    } else {
                        int var18 = var10.field2116;
                        String var19 = "<img=" + var18 + ">";
                        class10.method616(var16, var19 + arg1.field43, var15);
                    }
                }
            }
            field277.field1842 = var12 + var13;
        }
        if ((arg2 & 0x200) != 0) {
            int var20 = field277.method2157();
            int var21 = field277.method2148();
            arg1.method627(var20, var21, field243);
            arg1.field723 = field243 + 300;
            arg1.field724 = field277.method2148();
            arg1.field725 = field277.method2309();
        }
        if ((arg2 & 0x10) != 0) {
            int var22 = field277.method2158();
            if (var22 == 65535) {
                var22 = -1;
            }
            int var23 = field277.method2149();
            method164(arg1, var22, var23);
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field726 = field277.method2157();
            if (arg1.field726 == 65535) {
                arg1.field726 = -1;
            }
        }
        if ((arg2 & 0x20) == 0) {
            return;
        }
        arg1.field714 = field277.method2132();
        if (arg1.field714.charAt(0) == '~') {
            arg1.field714 = arg1.field714.substring(1);
            class10.method616(2, arg1.field43, arg1.field714);
        } else if (Statics.field2498 == arg1) {
            class10.method616(2, arg1.field43, arg1.field714);
        }
        arg1.field715 = false;
        arg1.field718 = 0;
        arg1.field719 = 0;
        arg1.field717 = 150;
    }

    @ObfuscatedName("i.bz(ZI)V")
    public static final void method550(boolean arg0) {
        field361 = 0;
        field356 = 0;
        method22();
        method562(arg0);
        for (int var1 = 0; var1 < field356; var1++) {
            int var2 = field267[var1];
            class31 var3 = field272[var2];
            int var4 = field277.method2309();
            if ((var4 & 0x4) != 0) {
                var3.field714 = field277.method2132();
                var3.field717 = 100;
            }
            if ((var4 & 0x80) != 0) {
                var3.field738 = field277.method2202();
                int var5 = field277.method2167();
                var3.field741 = var5 >> 16;
                var3.field711 = (var5 & 0xFFFF) + field243;
                var3.field762 = 0;
                var3.field737 = 0;
                if (var3.field711 > field243) {
                    var3.field762 = -1;
                }
                if (var3.field738 == 65535) {
                    var3.field738 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field675 = class36.method31(field277.method2157());
                var3.field705 = var3.field675.field779;
                var3.field710 = var3.field675.field802;
                var3.field754 = var3.field675.field785;
                var3.field757 = var3.field675.field773;
                var3.field709 = var3.field675.field787;
                var3.field721 = var3.field675.field788;
                var3.field706 = var3.field675.field805;
                var3.field707 = var3.field675.field809;
                var3.field708 = var3.field675.field783;
            }
            if ((var4 & 0x1) != 0) {
                var3.field726 = field277.method2202();
                if (var3.field726 == 65535) {
                    var3.field726 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var6 = field277.method2157();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field277.method2321();
                if (var3.field732 == var6 && var6 != -1) {
                    int var8 = class39.method2920(var6).field897;
                    if (var8 == 1) {
                        var3.field702 = 0;
                        var3.field734 = 0;
                        var3.field760 = var7;
                        var3.field740 = 0;
                    }
                    if (var8 == 2) {
                        var3.field740 = 0;
                    }
                } else if (var6 == -1 || var3.field732 == -1 || class39.method2920(var6).field894 >= class39.method2920(var3.field732).field894) {
                    var3.field732 = var6;
                    var3.field702 = 0;
                    var3.field734 = 0;
                    var3.field760 = var7;
                    var3.field740 = 0;
                    var3.field759 = var3.field751;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field727 = field277.method2202();
                var3.field728 = field277.method2202();
            }
            if ((var4 & 0x8) != 0) {
                int var9 = field277.method2309();
                int var10 = field277.method2321();
                var3.method627(var9, var10, field243);
                var3.field723 = field243 + 300;
                var3.field724 = field277.method2202();
                var3.field725 = field277.method2158();
            }
            if ((var4 & 0x10) != 0) {
                int var11 = field277.method2321();
                int var12 = field277.method2149();
                var3.method627(var11, var12, field243);
                var3.field723 = field243 + 300;
                var3.field724 = field277.method2158();
                var3.field725 = field277.method2202();
            }
        }
        for (int var13 = 0; var13 < field361; var13++) {
            int var14 = field362[var13];
            if (field243 != field272[var14].field736) {
                field272[var14].field675 = null;
                field272[var14] = null;
            }
        }
        if (field413 != field277.field1842) {
            throw new RuntimeException(field277.field1842 + class2.field23 + field413);
        }
        for (int var15 = 0; var15 < field366; var15++) {
            if (field272[field467[var15]] == null) {
                throw new RuntimeException(var15 + class2.field23 + field366);
            }
        }
    }

    @ObfuscatedName("d.bs(B)V")
    public static final void method22() {
        field277.method2393();
        int var0 = field277.method2370(8);
        if (var0 < field366) {
            for (int var1 = var0; var1 < field366; var1++) {
                field362[++field361 - 1] = field467[var1];
            }
        }
        if (var0 > field366) {
            throw new RuntimeException("");
        }
        field366 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field467[var2];
            class31 var4 = field272[var3];
            int var5 = field277.method2370(1);
            if (var5 == 0) {
                field467[++field366 - 1] = var3;
                var4.field736 = field243;
            } else {
                int var6 = field277.method2370(2);
                if (var6 == 0) {
                    field467[++field366 - 1] = var3;
                    var4.field736 = field243;
                    field267[++field356 - 1] = var3;
                } else if (var6 == 1) {
                    field467[++field366 - 1] = var3;
                    var4.field736 = field243;
                    int var7 = field277.method2370(3);
                    var4.method625(var7, false);
                    int var8 = field277.method2370(1);
                    if (var8 == 1) {
                        field267[++field356 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field467[++field366 - 1] = var3;
                    var4.field736 = field243;
                    int var9 = field277.method2370(3);
                    var4.method625(var9, true);
                    int var10 = field277.method2370(3);
                    var4.method625(var10, true);
                    int var11 = field277.method2370(1);
                    if (var11 == 1) {
                        field267[++field356 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field362[++field361 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ar.bx(ZI)V")
    public static final void method562(boolean arg0) {
        while (true) {
            if (field277.method2372(field413) >= 27) {
                int var1 = field277.method2370(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field272[var1] == null) {
                        field272[var1] = new class31();
                        var2 = true;
                    }
                    class31 var3 = field272[var1];
                    field467[++field366 - 1] = var1;
                    var3.field736 = field243;
                    int var4 = field358[field277.method2370(3)];
                    if (var2) {
                        var3.field716 = var3.field703 = var4;
                    }
                    int var5;
                    if (arg0) {
                        var5 = field277.method2370(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field277.method2370(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6;
                    if (arg0) {
                        var6 = field277.method2370(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field277.method2370(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    var3.field675 = class36.method31(field277.method2370(14));
                    int var7 = field277.method2370(1);
                    int var8 = field277.method2370(1);
                    if (var8 == 1) {
                        field267[++field356 - 1] = var1;
                    }
                    var3.field705 = var3.field675.field779;
                    var3.field710 = var3.field675.field802;
                    if (var3.field710 == 0) {
                        var3.field703 = 0;
                    }
                    var3.field754 = var3.field675.field785;
                    var3.field757 = var3.field675.field773;
                    var3.field709 = var3.field675.field787;
                    var3.field721 = var3.field675.field788;
                    var3.field706 = var3.field675.field805;
                    var3.field707 = var3.field675.field809;
                    var3.field708 = var3.field675.field783;
                    var3.method637(Statics.field2498.field755[0] + var5, Statics.field2498.field756[0] + var6, var7 == 1);
                    continue;
                }
            }
            field277.method2371();
            return;
        }
    }

    @ObfuscatedName("ah.bl(IIS)V")
    public static final void method725(int arg0, int arg1) {
        if (field441 < 2 && field388 == 0 && !field363) {
            return;
        }
        String var2;
        if (field388 == 1 && field441 < 2) {
            var2 = class147.field2304 + class147.field2276 + field390 + " " + class2.field19;
        } else if (field363 && field441 < 2) {
            var2 = field393 + class147.field2276 + field394 + " " + class2.field19;
        } else {
            var2 = method2717(field441 - 1);
        }
        if (field441 > 2) {
            var2 = var2 + class2.method82(16777215) + " " + '/' + " " + (field441 - 2) + class147.field2318;
        }
        Statics.field184.method3476(var2, arg0 + 4, arg1 + 15, 16777215, 0, field243 / 1000);
    }

    @ObfuscatedName("fy.bm(IIIIS)V")
    public static final void method2875(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field440; var4++) {
            if (field377[var4] + field284[var4] > arg0 && field377[var4] < arg0 + arg2 && field438[var4] + field385[var4] > arg1 && field385[var4] < arg1 + arg3) {
                field442[var4] = true;
            }
        }
    }

    @ObfuscatedName("ac.bq(IIIIB)V")
    public static final void method641(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field440; var4++) {
            if (field377[var4] + field284[var4] > arg0 && field377[var4] < arg0 + arg2 && field438[var4] + field385[var4] > arg1 && field385[var4] < arg1 + arg3) {
                field443[var4] = true;
            }
        }
    }

    @ObfuscatedName("fe.bf(III)V")
    public static final void method2925(int arg0, int arg1) {
        int var2 = Statics.field184.method3464(class147.field2317);
        for (int var3 = 0; var3 < field441; var3++) {
            int var4 = Statics.field184.method3464(method2717(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field441 * 15 + 21;
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
        field376 = true;
        Statics.field965 = var6;
        Statics.field620 = var7;
        Statics.field2932 = var2;
        Statics.field12 = field441 * 15 + 22;
    }

    @ObfuscatedName("ac.by(II)Z")
    public static final boolean method640(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field380[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("dn.bv(Lar;III)V")
    public static final void method2411(class28 arg0, int arg1, int arg2) {
        method1408(arg0.field622, arg0.field621, arg0.field629, arg0.field623, arg0.field624, arg0.field624, arg1, arg2);
    }

    @ObfuscatedName("bx.ba(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1408(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 28) {
            field275.method2367(194);
            field275.method2113(arg1);
            class157 var8 = class157.method2872(arg1);
            if (var8.field2648 != null && var8.field2648[0][0] == 5) {
                int var9 = var8.field2648[0][1];
                class159.field2680[var9] = 1 - class159.field2680[var9];
                method1893(var9);
            }
        }
        if (arg2 == 1002) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field275.method2367(100);
            field275.method2129(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 42) {
            field275.method2367(169);
            field275.method2163(arg1);
            field275.method2155(arg0);
            field275.method2155(arg3);
            field344 = 0;
            Statics.field975 = class157.method2872(arg1);
            field345 = arg0;
        }
        if (arg2 == 29) {
            field275.method2367(194);
            field275.method2113(arg1);
            class157 var10 = class157.method2872(arg1);
            if (var10.field2648 != null && var10.field2648[0][0] == 5) {
                int var11 = var10.field2648[0][1];
                if (class159.field2680[var11] != var10.field2650[0]) {
                    class159.field2680[var11] = var10.field2650[0];
                    method1893(var11);
                }
            }
        }
        if (arg2 == 31) {
            field275.method2367(124);
            field275.method2181(arg1);
            field275.method2154(arg0);
            field275.method2163(Statics.field130);
            field275.method2111(Statics.field873);
            field275.method2111(Statics.field115);
            field275.method2154(arg3);
            field344 = 0;
            Statics.field975 = class157.method2872(arg1);
            field345 = arg0;
        }
        if (arg2 == 24) {
            class157 var12 = class157.method2872(arg1);
            boolean var13 = true;
            if (var12.field2670 > 0) {
                var13 = method845(var12);
            }
            if (var13) {
                field275.method2367(194);
                field275.method2113(arg1);
            }
        }
        if (arg2 == 25) {
            class157 var14 = class157.method2707(arg1, arg0);
            if (var14 != null) {
                method2467();
                int var17 = method838(var14);
                int var18 = var17 >> 11 & 0x3F;
                method26(arg1, arg0, var18, var14.field2656);
                field388 = 0;
                field393 = method1621(var14);
                if (field393 == null) {
                    field393 = "Null";
                }
                if (var14.field2592) {
                    field394 = var14.field2610 + class2.method82(16777215);
                } else {
                    field394 = class2.method82(65280) + var14.field2652 + class2.method82(16777215);
                }
            }
            return;
        }
        if (arg2 == 22) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field479 = arg0;
            field468 = arg1;
            field275.method2367(187);
            field275.method2147(class128.field1978[82] ? 1 : 0);
            field275.method2129(Statics.field1047 + arg1);
            field275.method2129(Statics.field24 + arg0);
            field275.method2154(arg3);
        }
        if (arg2 == 47) {
            class3 var19 = field276[arg3];
            if (var19 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(122);
                field275.method2129(arg3);
                field275.method2146(class128.field1978[82] ? 1 : 0);
            }
        }
        if (arg2 == 38) {
            method2467();
            class157 var20 = class157.method2872(arg1);
            field388 = 1;
            Statics.field873 = arg0;
            Statics.field130 = arg1;
            Statics.field115 = arg3;
            method3177(var20);
            field390 = class2.method82(16748608) + Statics.method607(arg3).field998 + class2.method82(16777215);
            if (field390 == null) {
                field390 = "null";
            }
            return;
        }
        if (arg2 == 12) {
            class31 var21 = field272[arg3];
            if (var21 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(199);
                field275.method2147(class128.field1978[82] ? 1 : 0);
                field275.method2154(arg3);
            }
        }
        if (arg2 == 34) {
            field275.method2367(106);
            field275.method2129(arg3);
            field275.method2163(arg1);
            field275.method2155(arg0);
            field344 = 0;
            Statics.field975 = class157.method2872(arg1);
            field345 = arg0;
        }
        if (arg2 == 13) {
            class31 var22 = field272[arg3];
            if (var22 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(128);
                field275.method2111(arg3);
                field275.method2110(class128.field1978[82] ? 1 : 0);
            }
        }
        if (arg2 == 37) {
            field275.method2367(85);
            field275.method2181(arg1);
            field275.method2155(arg0);
            field275.method2155(arg3);
            field344 = 0;
            Statics.field975 = class157.method2872(arg1);
            field345 = arg0;
        }
        if (arg2 == 6) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field479 = arg0;
            field468 = arg1;
            field275.method2367(75);
            field275.method2147(class128.field1978[82] ? 1 : 0);
            field275.method2154(Statics.field1047 + arg1);
            field275.method2111(Statics.field24 + arg0);
            field275.method2155(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 32) {
            field275.method2367(49);
            field275.method2129(arg0);
            field275.method2195(arg1);
            field275.method2154(arg3);
            field275.method2111(field391);
            field275.method2113(Statics.field1887);
            field344 = 0;
            Statics.field975 = class157.method2872(arg1);
            field345 = arg0;
        }
        if (arg2 == 45) {
            class3 var23 = field276[arg3];
            if (var23 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(215);
                field275.method2219(class128.field1978[82] ? 1 : 0);
                field275.method2129(arg3);
            }
        }
        if (arg2 == 33) {
            field275.method2367(133);
            field275.method2155(arg3);
            field275.method2163(arg1);
            field275.method2129(arg0);
            field344 = 0;
            Statics.field975 = class157.method2872(arg1);
            field345 = arg0;
        }
        if (arg2 == 40) {
            field275.method2367(13);
            field275.method2155(arg3);
            field275.method2111(arg0);
            field275.method2195(arg1);
            field344 = 0;
            Statics.field975 = class157.method2872(arg1);
            field345 = arg0;
        }
        if (arg2 == 1005) {
            class157 var24 = class157.method2872(arg1);
            if (var24 == null || var24.field2659[arg0] < 100000) {
                field275.method2367(171);
                field275.method2155(arg3);
            } else {
                class10.method616(27, "", var24.field2659[arg0] + " x " + Statics.method607(arg3).field998);
            }
            field344 = 0;
            Statics.field975 = class157.method2872(arg1);
            field345 = arg0;
        }
        if (arg2 == 20) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field479 = arg0;
            field468 = arg1;
            field275.method2367(191);
            field275.method2129(Statics.field1047 + arg1);
            field275.method2219(class128.field1978[82] ? 1 : 0);
            field275.method2155(Statics.field24 + arg0);
            field275.method2129(arg3);
        }
        if (arg2 == 10) {
            class31 var25 = field272[arg3];
            if (var25 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(180);
                field275.method2111(arg3);
                field275.method2147(class128.field1978[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class31 var26 = field272[arg3];
            if (var26 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(22);
                field275.method2147(class128.field1978[82] ? 1 : 0);
                field275.method2111(arg3);
            }
        }
        if (arg2 == 48) {
            class3 var27 = field276[arg3];
            if (var27 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(64);
                field275.method2219(class128.field1978[82] ? 1 : 0);
                field275.method2155(arg3);
            }
        }
        if (arg2 == 49) {
            class3 var28 = field276[arg3];
            if (var28 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(102);
                field275.method2147(class128.field1978[82] ? 1 : 0);
                field275.method2154(arg3);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class157 var29 = class157.method2707(arg1, arg0);
            if (var29 != null) {
                int var30 = var29.field2656;
                class157 var31 = class157.method2707(arg1, arg0);
                if (var31 != null) {
                    if (var31.field2556 != null) {
                        class1 var32 = new class1();
                        var32.field3 = var31;
                        var32.field6 = arg3;
                        var32.field10 = arg5;
                        var32.field5 = var31.field2556;
                        class33.method131(var32);
                    }
                    boolean var33 = true;
                    if (var31.field2670 > 0) {
                        var33 = method845(var31);
                    }
                    if (var33) {
                        int var34 = method838(var31);
                        int var35 = arg3 - 1;
                        boolean var36 = (var34 >> var35 + 1 & 0x1) != 0;
                        if (var36) {
                            if (arg3 == 1) {
                                field275.method2367(144);
                                field275.method2113(arg1);
                                field275.method2111(arg0);
                                field275.method2111(var30);
                            }
                            if (arg3 == 2) {
                                field275.method2367(147);
                                field275.method2113(arg1);
                                field275.method2111(arg0);
                                field275.method2111(var30);
                            }
                            if (arg3 == 3) {
                                field275.method2367(40);
                                field275.method2113(arg1);
                                field275.method2111(arg0);
                                field275.method2111(var30);
                            }
                            if (arg3 == 4) {
                                field275.method2367(192);
                                field275.method2113(arg1);
                                field275.method2111(arg0);
                                field275.method2111(var30);
                            }
                            if (arg3 == 5) {
                                field275.method2367(193);
                                field275.method2113(arg1);
                                field275.method2111(arg0);
                                field275.method2111(var30);
                            }
                            if (arg3 == 6) {
                                field275.method2367(175);
                                field275.method2113(arg1);
                                field275.method2111(arg0);
                                field275.method2111(var30);
                            }
                            if (arg3 == 7) {
                                field275.method2367(134);
                                field275.method2113(arg1);
                                field275.method2111(arg0);
                                field275.method2111(var30);
                            }
                            if (arg3 == 8) {
                                field275.method2367(137);
                                field275.method2113(arg1);
                                field275.method2111(arg0);
                                field275.method2111(var30);
                            }
                            if (arg3 == 9) {
                                field275.method2367(111);
                                field275.method2113(arg1);
                                field275.method2111(arg0);
                                field275.method2111(var30);
                            }
                            if (arg3 == 10) {
                                field275.method2367(107);
                                field275.method2113(arg1);
                                field275.method2111(arg0);
                                field275.method2111(var30);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 35) {
            field275.method2367(152);
            field275.method2155(arg3);
            field275.method2181(arg1);
            field275.method2129(arg0);
            field344 = 0;
            Statics.field975 = class157.method2872(arg1);
            field345 = arg0;
        }
        if (arg2 == 1001) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field479 = arg0;
            field468 = arg1;
            field275.method2367(197);
            field275.method2129(Statics.field1047 + arg1);
            field275.method2154(arg3 >> 14 & 0x7FFF);
            field275.method2147(class128.field1978[82] ? 1 : 0);
            field275.method2155(Statics.field24 + arg0);
        }
        if (arg2 == 8) {
            class31 var37 = field272[arg3];
            if (var37 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(170);
                field275.method2155(field391);
                field275.method2155(arg3);
                field275.method2113(Statics.field1887);
                field275.method2110(class128.field1978[82] ? 1 : 0);
            }
        }
        if (arg2 == 50) {
            class3 var38 = field276[arg3];
            if (var38 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(120);
                field275.method2129(arg3);
                field275.method2219(class128.field1978[82] ? 1 : 0);
            }
        }
        if (arg2 == 7) {
            class31 var39 = field272[arg3];
            if (var39 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(166);
                field275.method2154(arg3);
                field275.method2113(Statics.field130);
                field275.method2110(class128.field1978[82] ? 1 : 0);
                field275.method2129(Statics.field115);
                field275.method2129(Statics.field873);
            }
        }
        if (arg2 == 36) {
            field275.method2367(204);
            field275.method2181(arg1);
            field275.method2155(arg0);
            field275.method2154(arg3);
            field344 = 0;
            Statics.field975 = class157.method2872(arg1);
            field345 = arg0;
        }
        if (arg2 == 15) {
            class3 var40 = field276[arg3];
            if (var40 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(2);
                field275.method2147(class128.field1978[82] ? 1 : 0);
                field275.method2155(arg3);
                field275.method2129(field391);
                field275.method2181(Statics.field1887);
            }
        }
        if (arg2 == 43) {
            field275.method2367(172);
            field275.method2111(arg3);
            field275.method2155(arg0);
            field275.method2163(arg1);
            field344 = 0;
            Statics.field975 = class157.method2872(arg1);
            field345 = arg0;
        }
        if (arg2 == 1003) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            class31 var41 = field272[arg3];
            if (var41 != null) {
                class36 var42 = var41.field675;
                if (var42.field801 != null) {
                    var42 = var42.method646();
                }
                if (var42 != null) {
                    field275.method2367(58);
                    field275.method2129(var42.field777);
                }
            }
        }
        if (arg2 == 2) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field479 = arg0;
            field468 = arg1;
            field275.method2367(233);
            field275.method2155(Statics.field24 + arg0);
            field275.method2113(Statics.field1887);
            field275.method2154(field391);
            field275.method2147(class128.field1978[82] ? 1 : 0);
            field275.method2129(arg3 >> 14 & 0x7FFF);
            field275.method2155(Statics.field1047 + arg1);
        }
        if (arg2 == 41) {
            field275.method2367(217);
            field275.method2155(arg0);
            field275.method2163(arg1);
            field275.method2154(arg3);
            field344 = 0;
            Statics.field975 = class157.method2872(arg1);
            field345 = arg0;
        }
        if (arg2 == 26) {
            field275.method2367(145);
            for (class4 var43 = (class4) field396.method3227(); var43 != null; var43 = (class4) field396.method3228()) {
                if (var43.field58 == 0 || var43.field58 == 3) {
                    method549(var43, true);
                }
            }
            if (field399 != null) {
                method3177(field399);
                field399 = null;
            }
        }
        if (arg2 == 39) {
            field275.method2367(51);
            field275.method2155(arg0);
            field275.method2163(arg1);
            field275.method2154(arg3);
            field344 = 0;
            Statics.field975 = class157.method2872(arg1);
            field345 = arg0;
        }
        if (arg2 == 46) {
            class3 var44 = field276[arg3];
            if (var44 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(1);
                field275.method2111(arg3);
                field275.method2146(class128.field1978[82] ? 1 : 0);
            }
        }
        if (arg2 == 16) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field479 = arg0;
            field468 = arg1;
            field275.method2367(63);
            field275.method2155(Statics.field873);
            field275.method2155(Statics.field24 + arg0);
            field275.method2155(Statics.field115);
            field275.method2155(arg3);
            field275.method2129(Statics.field1047 + arg1);
            field275.method2195(Statics.field130);
            field275.method2147(class128.field1978[82] ? 1 : 0);
        }
        if (arg2 == 1) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field479 = arg0;
            field468 = arg1;
            field275.method2367(54);
            field275.method2111(Statics.field873);
            field275.method2129(Statics.field115);
            field275.method2113(Statics.field130);
            field275.method2129(arg3 >> 14 & 0x7FFF);
            field275.method2154(Statics.field24 + arg0);
            field275.method2219(class128.field1978[82] ? 1 : 0);
            field275.method2154(Statics.field1047 + arg1);
        }
        if (arg2 == 11) {
            class31 var45 = field272[arg3];
            if (var45 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(249);
                field275.method2154(arg3);
                field275.method2110(class128.field1978[82] ? 1 : 0);
            }
        }
        if (arg2 == 5) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field479 = arg0;
            field468 = arg1;
            field275.method2367(157);
            field275.method2129(Statics.field24 + arg0);
            field275.method2155(Statics.field1047 + arg1);
            field275.method2219(class128.field1978[82] ? 1 : 0);
            field275.method2154(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 3) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field479 = arg0;
            field468 = arg1;
            field275.method2367(225);
            field275.method2146(class128.field1978[82] ? 1 : 0);
            field275.method2154(arg3 >> 14 & 0x7FFF);
            field275.method2155(Statics.field1047 + arg1);
            field275.method2154(Statics.field24 + arg0);
        }
        if (arg2 == 23) {
            Statics.field761.method1659(Statics.field1082, arg0, arg1);
        }
        if (arg2 == 18) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field479 = arg0;
            field468 = arg1;
            field275.method2367(27);
            field275.method2154(Statics.field1047 + arg1);
            field275.method2111(Statics.field24 + arg0);
            field275.method2111(arg3);
            field275.method2110(class128.field1978[82] ? 1 : 0);
        }
        if (arg2 == 14) {
            class3 var46 = field276[arg3];
            if (var46 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(5);
                field275.method2155(Statics.field873);
                field275.method2147(class128.field1978[82] ? 1 : 0);
                field275.method2163(Statics.field130);
                field275.method2155(arg3);
                field275.method2154(Statics.field115);
            }
        }
        if (arg2 == 19) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field479 = arg0;
            field468 = arg1;
            field275.method2367(141);
            field275.method2111(Statics.field1047 + arg1);
            field275.method2111(Statics.field24 + arg0);
            field275.method2147(class128.field1978[82] ? 1 : 0);
            field275.method2129(arg3);
        }
        if (arg2 == 4) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field479 = arg0;
            field468 = arg1;
            field275.method2367(123);
            field275.method2155(arg3 >> 14 & 0x7FFF);
            field275.method2111(Statics.field24 + arg0);
            field275.method2146(class128.field1978[82] ? 1 : 0);
            field275.method2111(Statics.field1047 + arg1);
        }
        if (arg2 == 17) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field479 = arg0;
            field468 = arg1;
            field275.method2367(110);
            field275.method2163(Statics.field1887);
            field275.method2111(field391);
            field275.method2111(arg3);
            field275.method2219(class128.field1978[82] ? 1 : 0);
            field275.method2111(Statics.field1047 + arg1);
            field275.method2111(Statics.field24 + arg0);
        }
        if (arg2 == 51) {
            class3 var47 = field276[arg3];
            if (var47 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(108);
                field275.method2147(class128.field1978[82] ? 1 : 0);
                field275.method2111(arg3);
            }
        }
        if (arg2 == 30 && field399 == null) {
            method811(arg1, arg0);
            field399 = class157.method2707(arg1, arg0);
            method3177(field399);
        }
        if (arg2 == 1004) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field275.method2367(171);
            field275.method2155(arg3);
        }
        if (arg2 == 58) {
            class157 var48 = class157.method2707(arg1, arg0);
            if (var48 != null) {
                field275.method2367(149);
                field275.method2129(var48.field2656);
                field275.method2113(Statics.field1887);
                field275.method2111(field392);
                field275.method2181(arg1);
                field275.method2154(arg0);
                field275.method2155(field391);
            }
        }
        if (arg2 == 21) {
            field340 = arg6;
            field341 = arg7;
            field343 = 2;
            field342 = 0;
            field479 = arg0;
            field468 = arg1;
            field275.method2367(89);
            field275.method2111(Statics.field24 + arg0);
            field275.method2129(Statics.field1047 + arg1);
            field275.method2110(class128.field1978[82] ? 1 : 0);
            field275.method2129(arg3);
        }
        if (arg2 == 44) {
            class3 var49 = field276[arg3];
            if (var49 != null) {
                field340 = arg6;
                field341 = arg7;
                field343 = 2;
                field342 = 0;
                field479 = arg0;
                field468 = arg1;
                field275.method2367(220);
                field275.method2154(arg3);
                field275.method2110(class128.field1978[82] ? 1 : 0);
            }
        }
        if (field388 != 0) {
            field388 = 0;
            method3177(class157.method2872(Statics.field130));
        }
        if (field363) {
            method2467();
        }
        if (Statics.field975 != null && field344 == 0) {
            method3177(Statics.field975);
        }
    }

    @ObfuscatedName("r.cc(IIIIB)V")
    public static void method26(int arg0, int arg1, int arg2, int arg3) {
        class157 var4 = class157.method2707(arg0, arg1);
        if (var4 != null && var4.field2649 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field5 = var4.field2649;
            class33.method131(var5);
        }
        field392 = arg3;
        field363 = true;
        Statics.field1887 = arg0;
        field391 = arg1;
        Statics.field2466 = arg2;
        method3177(var4);
    }

    @ObfuscatedName("di.cb(I)V")
    public static void method2467() {
        if (!field363) {
            return;
        }
        class157 var0 = class157.method2707(Statics.field1887, field391);
        if (var0 != null && var0.field2629 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field5 = var0.field2629;
            class33.method131(var1);
        }
        field363 = false;
        method3177(var0);
    }

    @ObfuscatedName("as.cx(III)V")
    public static void method811(int arg0, int arg1) {
        field275.method2367(7);
        field275.method2111(arg1);
        field275.method2113(arg0);
    }

    @ObfuscatedName("ap.cq(I)V")
    public static final void method765() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field441 - 1; var1++) {
                if (field380[var1] < 1000 && field380[var1 + 1] > 1000) {
                    String var2 = field383[var1];
                    field383[var1] = field383[var1 + 1];
                    field383[var1 + 1] = var2;
                    String var3 = field346[var1];
                    field346[var1] = field346[var1 + 1];
                    field346[var1 + 1] = var3;
                    int var4 = field380[var1];
                    field380[var1] = field380[var1 + 1];
                    field380[var1 + 1] = var4;
                    int var5 = field408[var1];
                    field408[var1] = field408[var1 + 1];
                    field408[var1 + 1] = var5;
                    int var6 = field463[var1];
                    field463[var1] = field463[var1 + 1];
                    field463[var1 + 1] = var6;
                    int var7 = field381[var1];
                    field381[var1] = field381[var1 + 1];
                    field381[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("au.cd(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method829(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field376 || field441 >= 500) {
            return;
        }
        field346[field441] = arg0;
        field383[field441] = arg1;
        field380[field441] = arg2;
        field381[field441] = arg3;
        field408[field441] = arg4;
        field463[field441] = arg5;
        field441++;
    }

    @ObfuscatedName("ed.cu(I)V")
    public static void method2850() {
        for (int var0 = 0; var0 < field441; var0++) {
            if (method777(field380[var0])) {
                if (var0 < field441 - 1) {
                    for (int var1 = var0; var1 < field441 - 1; var1++) {
                        field346[var1] = field346[var1 + 1];
                        field383[var1] = field383[var1 + 1];
                        field380[var1] = field380[var1 + 1];
                        field381[var1] = field381[var1 + 1];
                        field408[var1] = field408[var1 + 1];
                        field463[var1] = field463[var1 + 1];
                    }
                }
                field441--;
            }
        }
    }

    @ObfuscatedName("ap.ct(IB)Z")
    public static boolean method777(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ea.ci(II)Ljava/lang/String;")
    public static String method2717(int arg0) {
        return field383[arg0].length() > 0 ? field346[arg0] + class147.field2276 + field383[arg0] : field346[arg0];
    }

    @ObfuscatedName("aa.cg(IIIIB)V")
    public static final void method1049(int arg0, int arg1, int arg2, int arg3) {
        if (field388 == 0 && !field363) {
            method829(class147.field2319, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class99.field1746; var6++) {
            int var7 = class99.field1747[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field761.method1653(Statics.field1082, var8, var9, var7) >= 0) {
                    class37 var12 = class37.method2053(var11);
                    if (var12.field828 != null) {
                        var12 = var12.method678();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field388 == 1) {
                        method829(class147.field2304, field390 + " " + class2.field19 + " " + class2.method82(65535) + var12.field835, 1, var7, var8, var9);
                    } else if (!field363) {
                        String[] var13 = var12.field842;
                        if (field455) {
                            var13 = method553(var13);
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
                                    method829(var13[var14], class2.method82(65535) + var12.field835, var15, var7, var8, var9);
                                }
                            }
                        }
                        method829(class147.field2315, class2.method82(65535) + var12.field835, 1002, var12.field838 << 14, var8, var9);
                    } else if ((Statics.field2466 & 0x4) == 4) {
                        method829(field393, field394 + " " + class2.field19 + " " + class2.method82(65535) + var12.field835, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class31 var16 = field272[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field675.field779 == 1 && (var16.field746 & 0x7F) == 64 && (var16.field752 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field366; var17++) {
                            class31 var18 = field272[field467[var17]];
                            if (var18 != null && var16 != var18 && var18.field675.field779 == 1 && var16.field746 == var18.field746 && var16.field752 == var18.field752) {
                                method2944(var18.field675, field467[var17], var8, var9);
                            }
                        }
                        for (int var19 = 0; var19 < field354; var19++) {
                            class3 var20 = field276[field355[var19]];
                            if (var20 != null && var16.field746 == var20.field746 && var16.field752 == var20.field752) {
                                method555(var20, field355[var19], var8, var9);
                            }
                        }
                    }
                    method2944(var16.field675, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var21 = field276[var11];
                    if (var21 == null) {
                        continue;
                    }
                    if ((var21.field746 & 0x7F) == 64 && (var21.field752 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < field366; var22++) {
                            class31 var23 = field272[field467[var22]];
                            if (var23 != null && var23.field675.field779 == 1 && var21.field746 == var23.field746 && var21.field752 == var23.field752) {
                                method2944(var23.field675, field467[var22], var8, var9);
                            }
                        }
                        for (int var24 = 0; var24 < field354; var24++) {
                            class3 var25 = field276[field355[var24]];
                            if (var25 != null && var21 != var25 && var21.field746 == var25.field746 && var21.field752 == var25.field752) {
                                method555(var25, field355[var24], var8, var9);
                            }
                        }
                    }
                    if (field367 == var11) {
                        var4 = var7;
                    } else {
                        method555(var21, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class182 var26 = field368[Statics.field1082][var8][var9];
                    if (var26 != null) {
                        for (class26 var27 = (class26) var26.method3261(); var27 != null; var27 = (class26) var26.method3276()) {
                            class46 var28 = Statics.method607(var27.field605);
                            if (field388 == 1) {
                                method829(class147.field2304, field390 + " " + class2.field19 + " " + class2.method82(16748608) + var28.field998, 16, var27.field605, var8, var9);
                            } else if (!field363) {
                                String[] var29 = var28.field990;
                                if (field455) {
                                    var29 = method553(var29);
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
                                        method829(var29[var30], class2.method82(16748608) + var28.field998, var31, var27.field605, var8, var9);
                                    } else if (var30 == 2) {
                                        method829(class147.field2164, class2.method82(16748608) + var28.field998, 20, var27.field605, var8, var9);
                                    }
                                }
                                method829(class147.field2315, class2.method82(16748608) + var28.field998, 1004, var27.field605, var8, var9);
                            } else if ((Statics.field2466 & 0x1) == 1) {
                                method829(field393, field394 + " " + class2.field19 + " " + class2.method82(16748608) + var28.field998, 17, var27.field605, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var32 = var4 & 0x7F;
            int var33 = var4 >> 7 & 0x7F;
            class3 var34 = field276[field367];
            method555(var34, field367, var32, var33);
        }
    }

    @ObfuscatedName("fi.co(Laq;IIII)V")
    public static final void method2944(class36 arg0, int arg1, int arg2, int arg3) {
        if (field441 >= 400) {
            return;
        }
        if (arg0.field801 != null) {
            arg0 = arg0.method646();
        }
        if (arg0 == null || !arg0.field806 || arg0.field808 && field281 != arg1) {
            return;
        }
        String var4 = arg0.field784;
        if (arg0.field795 != 0) {
            int var6 = arg0.field795;
            int var7 = Statics.field2498.field34;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method82(16711680);
            } else if (var8 < -6) {
                var9 = class2.method82(16723968);
            } else if (var8 < -3) {
                var9 = class2.method82(16740352);
            } else if (var8 < 0) {
                var9 = class2.method82(16756736);
            } else if (var8 > 9) {
                var9 = class2.method82(65280);
            } else if (var8 > 6) {
                var9 = class2.method82(4259584);
            } else if (var8 > 3) {
                var9 = class2.method82(8453888);
            } else if (var8 > 0) {
                var9 = class2.method82(12648192);
            } else {
                var9 = class2.method82(16776960);
            }
            var4 = var4 + var9 + " " + class2.field17 + class147.field2320 + arg0.field795 + class2.field25;
        }
        if (field388 == 1) {
            method829(class147.field2304, field390 + " " + class2.field19 + " " + class2.method82(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field363) {
            String[] var10 = arg0.field793;
            if (field455) {
                var10 = method553(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class147.field2402)) {
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
                        method829(var10[var11], class2.method82(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class147.field2402)) {
                        short var14 = 0;
                        if (field282 == class18.field502 || field282 == class18.field503 && arg0.field795 > Statics.field2498.field34) {
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
                        method829(var10[var13], class2.method82(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method829(class147.field2315, class2.method82(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2466 & 0x2) == 2) {
            method829(field393, field394 + " " + class2.field19 + " " + class2.method82(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("aw.cm(Ld;IIII)V")
    public static final void method555(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2498 == arg0 || field441 >= 400) {
            return;
        }
        String var9;
        if (arg0.field50 == 0) {
            String var4 = arg0.field43;
            int var5 = arg0.field34;
            int var6 = Statics.field2498.field34;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method82(16711680);
            } else if (var7 < -6) {
                var8 = class2.method82(16723968);
            } else if (var7 < -3) {
                var8 = class2.method82(16740352);
            } else if (var7 < 0) {
                var8 = class2.method82(16756736);
            } else if (var7 > 9) {
                var8 = class2.method82(65280);
            } else if (var7 > 6) {
                var8 = class2.method82(4259584);
            } else if (var7 > 3) {
                var8 = class2.method82(8453888);
            } else if (var7 > 0) {
                var8 = class2.method82(12648192);
            } else {
                var8 = class2.method82(16776960);
            }
            var9 = var4 + var8 + " " + class2.field17 + class147.field2320 + arg0.field34 + class2.field25;
        } else {
            var9 = arg0.field43 + " " + class2.field17 + class147.field2321 + arg0.field50 + class2.field25;
        }
        if (field388 == 1) {
            method829(class147.field2304, field390 + " " + class2.field19 + " " + class2.method82(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field363) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field295[var10] != null) {
                    short var11 = 0;
                    if (field295[var10].equalsIgnoreCase(class147.field2402)) {
                        if (field282 == class18.field502 || field282 == class18.field503 && arg0.field34 > Statics.field2498.field34) {
                            var11 = 2000;
                        }
                        if (Statics.field2498.field48 != 0 && arg0.field48 != 0) {
                            if (Statics.field2498.field48 == arg0.field48) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field365[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field350[var10] + var11;
                    method829(field295[var10], class2.method82(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2466 & 0x8) == 8) {
            method829(field393, field394 + " " + class2.field19 + " " + class2.method82(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field441; var14++) {
            if (field380[var14] == 23) {
                field383[var14] = class2.method82(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ea.cf(IIIIIIIIS)V")
    public static final void method2716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class157.method831(arg0)) {
            Statics.field2953 = null;
            method10(Statics.field2641[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2953 != null) {
                method10(Statics.field2953, -1412584499, arg1, arg2, arg3, arg4, Statics.field428, Statics.field2671, arg7);
                Statics.field2953 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field442[var8] = true;
            }
        } else {
            field442[arg7] = true;
        }
    }

    @ObfuscatedName("y.ck([Lfy;IIIIIIIIB)V")
    public static final void method10(class157[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class74.method1534(arg2, arg3, arg4, arg5);
        class85.method1803();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class157 var10 = arg0[var9];
            if (var10 != null && (var10.field2608 == arg1 || arg1 == -1412584499 && field297 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field377[field440] = var10.field2639 + arg6;
                    field385[field440] = var10.field2576 + arg7;
                    field284[field440] = var10.field2577;
                    field438[field440] = var10.field2559;
                    var11 = ++field440 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2667 = var11;
                var10.field2668 = field243;
                if (!var10.field2592 || !Statics.method3185(var10)) {
                    if (var10.field2670 > 0) {
                        method92(var10);
                    }
                    int var12 = var10.field2639 + arg6;
                    int var13 = var10.field2576 + arg7;
                    int var14 = var10.field2600;
                    if (field297 == var10) {
                        if (arg1 != -1412584499 && !var10.field2655) {
                            Statics.field2953 = arg0;
                            Statics.field428 = arg6;
                            Statics.field2671 = arg7;
                            continue;
                        }
                        if (field418 && field412) {
                            int var15 = class131.field2009;
                            int var16 = class131.field2010;
                            int var17 = var15 - field364;
                            int var18 = var16 - field410;
                            if (var17 < field445) {
                                var17 = field445;
                            }
                            if (var10.field2577 + var17 > field445 + field265.field2577) {
                                var17 = field445 + field265.field2577 - var10.field2577;
                            }
                            if (var18 < field236) {
                                var18 = field236;
                            }
                            if (var10.field2559 + var18 > field236 + field265.field2559) {
                                var18 = field236 + field265.field2559 - var10.field2559;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2655) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2551 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2551 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2577 + var12;
                        int var26 = var10.field2559 + var13;
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
                        int var29 = var10.field2577 + var12;
                        int var30 = var10.field2559 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2592 || var19 < var21 && var20 < var22) {
                        if (var10.field2670 != 0) {
                            if (var10.field2670 == 1337) {
                                field384 = var12;
                                field430 = var13;
                                Statics.method552(var12, var13, var10.field2577, var10.field2559);
                                class74.method1534(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2670 == 1338) {
                                method95(var12, var13, var11);
                                class74.method1534(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2551 == 0) {
                            if (!var10.field2592 && Statics.method3185(var10) && Statics.field1439 != var10) {
                                continue;
                            }
                            if (!var10.field2592) {
                                if (var10.field2563 > var10.field2565 - var10.field2559) {
                                    var10.field2563 = var10.field2565 - var10.field2559;
                                }
                                if (var10.field2563 < 0) {
                                    var10.field2563 = 0;
                                }
                            }
                            method10(arg0, var10.field2622, var19, var20, var21, var22, var12 - var10.field2562, var13 - var10.field2563, var11);
                            if (var10.field2660 != null) {
                                method10(var10.field2660, var10.field2622, var19, var20, var21, var22, var12 - var10.field2562, var13 - var10.field2563, var11);
                            }
                            class4 var31 = (class4) field396.method3224((long) var10.field2622);
                            if (var31 != null) {
                                method2716(var31.field54, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class74.method1534(arg2, arg3, arg4, arg5);
                            class85.method1803();
                        }
                        if (field444[var11] || field449 > 1) {
                            if (var10.field2551 == 0 && !var10.field2592 && var10.field2565 > var10.field2559) {
                                int var32 = var10.field2577 + var12;
                                int var33 = var10.field2563;
                                int var34 = var10.field2559;
                                int var35 = var10.field2565;
                                Statics.field11[0].method1601(var32, var13);
                                Statics.field11[1].method1601(var32, var13 + var34 - 16);
                                class74.method1540(var32, var13 + 16, 16, var34 - 32, field311);
                                int var36 = (var34 - 32) * var34 / var35;
                                if (var36 < 8) {
                                    var36 = 8;
                                }
                                int var37 = (var34 - 32 - var36) * var33 / (var35 - var34);
                                class74.method1540(var32, var13 + 16 + var37, 16, var36, field260);
                                class74.method1546(var32, var13 + 16 + var37, var36, field314);
                                class74.method1546(var32 + 1, var13 + 16 + var37, var36, field314);
                                class74.method1544(var32, var13 + 16 + var37, 16, field314);
                                class74.method1544(var32, var13 + 17 + var37, 16, field314);
                                class74.method1546(var32 + 15, var13 + 16 + var37, var36, field414);
                                class74.method1546(var32 + 14, var13 + 17 + var37, var36 - 1, field414);
                                class74.method1544(var32, var13 + 15 + var37 + var36, 16, field414);
                                class74.method1544(var32 + 1, var13 + 14 + var37 + var36, 15, field414);
                            }
                            if (var10.field2551 != 1) {
                                if (var10.field2551 == 2) {
                                    int var38 = 0;
                                    for (int var39 = 0; var39 < var10.field2559; var39++) {
                                        for (int var40 = 0; var40 < var10.field2577; var40++) {
                                            int var41 = (var10.field2638 + 32) * var40 + var12;
                                            int var42 = (var10.field2575 + 32) * var39 + var13;
                                            if (var38 < 20) {
                                                var41 += var10.field2605[var38];
                                                var42 += var10.field2606[var38];
                                            }
                                            if (var10.field2541[var38] > 0) {
                                                boolean var43 = false;
                                                boolean var44 = false;
                                                int var45 = var10.field2541[var38] - 1;
                                                if (var41 + 32 > arg2 && var41 < arg4 && var42 + 32 > arg3 && var42 < arg5 || Statics.field22 == var10 && field230 == var38) {
                                                    class73 var46;
                                                    if (field388 == 1 && Statics.field873 == var38 && Statics.field130 == var10.field2622) {
                                                        var46 = class46.method3398(var45, var10.field2659[var38], 2, 0, 2, false);
                                                    } else {
                                                        var46 = class46.method3398(var45, var10.field2659[var38], 1, 3153952, 2, false);
                                                    }
                                                    if (var46 == null) {
                                                        method3177(var10);
                                                    } else if (Statics.field22 == var10 && field230 == var38) {
                                                        int var47 = class131.field2009 - field232;
                                                        int var48 = class131.field2010 - field348;
                                                        if (var47 < 5 && var47 > -5) {
                                                            var47 = 0;
                                                        }
                                                        if (var48 < 5 && var48 > -5) {
                                                            var48 = 0;
                                                        }
                                                        if (field351 < 5) {
                                                            var47 = 0;
                                                            var48 = 0;
                                                        }
                                                        var46.method1469(var41 + var47, var42 + var48, 128);
                                                        if (arg1 != -1) {
                                                            class157 var49 = arg0[arg1 & 0xFFFF];
                                                            if (var42 + var48 < class74.field1306 && var49.field2563 > 0) {
                                                                int var50 = field309 * (class74.field1306 - var42 - var48) / 3;
                                                                if (var50 > field309 * 10) {
                                                                    var50 = field309 * 10;
                                                                }
                                                                if (var50 > var49.field2563) {
                                                                    var50 = var49.field2563;
                                                                }
                                                                var49.field2563 -= var50;
                                                                field348 += var50;
                                                                method3177(var49);
                                                            }
                                                            if (var42 + var48 + 32 > class74.field1310 && var49.field2563 < var49.field2565 - var49.field2559) {
                                                                int var51 = field309 * (var42 + var48 + 32 - class74.field1310) / 3;
                                                                if (var51 > field309 * 10) {
                                                                    var51 = field309 * 10;
                                                                }
                                                                if (var51 > var49.field2565 - var49.field2559 - var49.field2563) {
                                                                    var51 = var49.field2565 - var49.field2559 - var49.field2563;
                                                                }
                                                                var49.field2563 += var51;
                                                                field348 -= var51;
                                                                method3177(var49);
                                                            }
                                                        }
                                                    } else if (Statics.field975 == var10 && field345 == var38) {
                                                        var46.method1469(var41, var42, 128);
                                                    } else {
                                                        var46.method1463(var41, var42);
                                                    }
                                                }
                                            } else if (var10.field2607 != null && var38 < 20) {
                                                class73 var52 = var10.method2891(var38);
                                                if (var52 != null) {
                                                    var52.method1463(var41, var42);
                                                } else if (class157.field2547) {
                                                    method3177(var10);
                                                }
                                            }
                                            var38++;
                                        }
                                    }
                                } else if (var10.field2551 == 3) {
                                    int var53;
                                    if (method2723(var10)) {
                                        var53 = var10.field2574;
                                        if (Statics.field1439 == var10 && var10.field2569 != 0) {
                                            var53 = var10.field2569;
                                        }
                                    } else {
                                        var53 = var10.field2566;
                                        if (Statics.field1439 == var10 && var10.field2568 != 0) {
                                            var53 = var10.field2568;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2570) {
                                            class74.method1540(var12, var13, var10.field2577, var10.field2559, var53);
                                        } else {
                                            class74.method1539(var12, var13, var10.field2577, var10.field2559, var53);
                                        }
                                    } else if (var10.field2570) {
                                        class74.method1531(var12, var13, var10.field2577, var10.field2559, var53, 256 - (var14 & 0xFF));
                                    } else {
                                        class74.method1543(var12, var13, var10.field2577, var10.field2559, var53, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2551 == 4) {
                                    class207 var54 = var10.method2882();
                                    if (var54 != null) {
                                        String var55 = var10.field2597;
                                        int var56;
                                        if (method2723(var10)) {
                                            var56 = var10.field2574;
                                            if (Statics.field1439 == var10 && var10.field2569 != 0) {
                                                var56 = var10.field2569;
                                            }
                                            if (var10.field2598.length() > 0) {
                                                var55 = var10.field2598;
                                            }
                                        } else {
                                            var56 = var10.field2566;
                                            if (Statics.field1439 == var10 && var10.field2568 != 0) {
                                                var56 = var10.field2568;
                                            }
                                        }
                                        if (var10.field2592 && var10.field2656 != -1) {
                                            class46 var57 = Statics.method607(var10.field2656);
                                            var55 = var57.field998;
                                            if (var55 == null) {
                                                var55 = "null";
                                            }
                                            if ((var57.field1009 == 1 || var10.field2657 != 1) && var10.field2657 != -1) {
                                                var55 = class2.method82(16748608) + var55 + class2.field21 + " " + 'x' + method2728(var10.field2657);
                                            }
                                        }
                                        if (field399 == var10) {
                                            class147 var10000 = (class147) null;
                                            var55 = class147.field2322;
                                            var56 = var10.field2566;
                                        }
                                        if (!var10.field2592) {
                                            var55 = method1443(var55, var10);
                                        }
                                        var54.method3489(var55, var12, var13, var10.field2577, var10.field2559, var56, var10.field2621 ? 0 : -1, var10.field2624, var10.field2611, var10.field2623);
                                    } else if (class157.field2547) {
                                        method3177(var10);
                                    }
                                } else if (var10.field2551 == 5) {
                                    if (var10.field2592) {
                                        class73 var59;
                                        if (var10.field2656 == -1) {
                                            var59 = var10.method2878(false);
                                        } else {
                                            var59 = class46.method3398(var10.field2656, var10.field2657, var10.field2555, var10.field2578, var10.field2595, false);
                                        }
                                        if (var59 != null) {
                                            int var60 = var59.field1299;
                                            int var61 = var59.field1300;
                                            if (var10.field2609) {
                                                class74.method1535(var12, var13, var10.field2577 + var12, var10.field2559 + var13);
                                                int var62 = (var10.field2577 + (var60 - 1)) / var60;
                                                int var63 = (var10.field2559 + (var61 - 1)) / var61;
                                                for (int var64 = 0; var64 < var62; var64++) {
                                                    for (int var65 = 0; var65 < var63; var65++) {
                                                        if (var10.field2602 != 0) {
                                                            var59.method1453(var60 / 2 + var60 * var64 + var12, var61 / 2 + var61 * var65 + var13, var10.field2602, 4096);
                                                        } else if (var14 == 0) {
                                                            var59.method1463(var60 * var64 + var12, var61 * var65 + var13);
                                                        } else {
                                                            var59.method1469(var60 * var64 + var12, var61 * var65 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class74.method1534(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var66 = var10.field2577 * 4096 / var60;
                                                if (var10.field2602 != 0) {
                                                    var59.method1453(var10.field2577 / 2 + var12, var10.field2559 / 2 + var13, var10.field2602, var66);
                                                } else if (var14 != 0) {
                                                    var59.method1471(var12, var13, var10.field2577, var10.field2559, 256 - (var14 & 0xFF));
                                                } else if (var10.field2577 == var60 && var10.field2559 == var61) {
                                                    var59.method1463(var12, var13);
                                                } else {
                                                    var59.method1465(var12, var13, var10.field2577, var10.field2559);
                                                }
                                            }
                                        } else if (class157.field2547) {
                                            method3177(var10);
                                        }
                                    } else {
                                        class73 var58 = var10.method2878(method2723(var10));
                                        if (var58 != null) {
                                            var58.method1463(var12, var13);
                                        } else if (class157.field2547) {
                                            method3177(var10);
                                        }
                                    }
                                } else if (var10.field2551 == 6) {
                                    boolean var67 = method2723(var10);
                                    int var68;
                                    if (var67) {
                                        var68 = var10.field2586;
                                    } else {
                                        var68 = var10.field2585;
                                    }
                                    class99 var69 = null;
                                    int var70 = 0;
                                    if (var10.field2656 != -1) {
                                        class46 var71 = Statics.method607(var10.field2656);
                                        if (var71 != null) {
                                            class46 var72 = var71.method880(var10.field2657);
                                            var69 = var72.method879(1);
                                            if (var69 == null) {
                                                method3177(var10);
                                            } else {
                                                var69.method1996();
                                                var70 = var69.field1344 / 2;
                                            }
                                        }
                                    } else if (var10.field2581 == 5) {
                                        if (var10.field2582 == 0) {
                                            var69 = field493.method2961((class39) null, -1, (class39) null, -1);
                                        } else {
                                            var69 = Statics.field2498.method13();
                                        }
                                    } else if (var68 == -1) {
                                        var69 = var10.method2879((class39) null, -1, var67, Statics.field2498.field31);
                                        if (var69 == null && class157.field2547) {
                                            method3177(var10);
                                        }
                                    } else {
                                        class39 var73 = class39.method2920(var68);
                                        var69 = var10.method2879(var73, var10.field2619, var67, Statics.field2498.field31);
                                        if (var69 == null && class157.field2547) {
                                            method3177(var10);
                                        }
                                    }
                                    class85.method1805(var10.field2577 / 2 + var12, var10.field2559 / 2 + var13);
                                    int var74 = var10.field2651 * class85.field1470[var10.field2589] >> 16;
                                    int var75 = var10.field2651 * class85.field1483[var10.field2589] >> 16;
                                    if (var69 != null) {
                                        if (var10.field2592) {
                                            var69.method1996();
                                            if (var10.field2594) {
                                                var69.method2030(0, var10.field2604, var10.field2567, var10.field2589, var10.field2587, var10.field2588 + var70 + var74, var10.field2588 + var75, var10.field2651);
                                            } else {
                                                var69.method2008(0, var10.field2604, var10.field2567, var10.field2589, var10.field2587, var10.field2588 + var70 + var74, var10.field2588 + var75);
                                            }
                                        } else {
                                            var69.method2008(0, var10.field2604, 0, var10.field2589, 0, var74, var75);
                                        }
                                    }
                                    class85.method1844();
                                } else {
                                    if (var10.field2551 == 7) {
                                        class207 var76 = var10.method2882();
                                        if (var76 == null) {
                                            if (class157.field2547) {
                                                method3177(var10);
                                            }
                                            continue;
                                        }
                                        int var77 = 0;
                                        for (int var78 = 0; var78 < var10.field2559; var78++) {
                                            for (int var79 = 0; var79 < var10.field2577; var79++) {
                                                if (var10.field2541[var77] > 0) {
                                                    class46 var80 = Statics.method607(var10.field2541[var77] - 1);
                                                    String var81;
                                                    if (var80.field1009 != 1 && var10.field2659[var77] == 1) {
                                                        var81 = class2.method82(16748608) + var80.field998 + class2.field21;
                                                    } else {
                                                        var81 = class2.method82(16748608) + var80.field998 + class2.field21 + " " + 'x' + method2728(var10.field2659[var77]);
                                                    }
                                                    int var82 = (var10.field2638 + 115) * var79 + var12;
                                                    int var83 = (var10.field2575 + 12) * var78 + var13;
                                                    if (var10.field2624 == 0) {
                                                        var76.method3534(var81, var82, var83, var10.field2566, var10.field2621 ? 0 : -1);
                                                    } else if (var10.field2624 == 1) {
                                                        var76.method3471(var81, var10.field2577 / 2 + var82, var83, var10.field2566, var10.field2621 ? 0 : -1);
                                                    } else {
                                                        var76.method3470(var81, var10.field2577 + var82 - 1, var83, var10.field2566, var10.field2621 ? 0 : -1);
                                                    }
                                                }
                                                var77++;
                                            }
                                        }
                                    }
                                    if (var10.field2551 == 8 && Statics.field541 == var10 && field386 == field303) {
                                        int var84 = 0;
                                        int var85 = 0;
                                        class207 var86 = Statics.field903;
                                        String var87 = var10.field2597;
                                        String var88 = method1443(var87, var10);
                                        while (var88.length() > 0) {
                                            int var89 = var88.indexOf(class2.field20);
                                            String var90;
                                            if (var89 == -1) {
                                                var90 = var88;
                                                var88 = "";
                                            } else {
                                                var90 = var88.substring(0, var89);
                                                var88 = var88.substring(var89 + 4);
                                            }
                                            int var91 = var86.method3464(var90);
                                            if (var91 > var84) {
                                                var84 = var91;
                                            }
                                            var85 += var86.field2981 + 1;
                                        }
                                        var84 += 6;
                                        var85 += 7;
                                        int var92 = var10.field2577 + var12 - 5 - var84;
                                        int var93 = var10.field2559 + var13 + 5;
                                        if (var92 < var12 + 5) {
                                            var92 = var12 + 5;
                                        }
                                        if (var84 + var92 > arg4) {
                                            var92 = arg4 - var84;
                                        }
                                        if (var85 + var93 > arg5) {
                                            var93 = arg5 - var85;
                                        }
                                        class74.method1540(var92, var93, var84, var85, 16777120);
                                        class74.method1539(var92, var93, var84, var85, 0);
                                        String var94 = var10.field2597;
                                        int var95 = var86.field2981 + var93 + 2;
                                        String var96 = method1443(var94, var10);
                                        while (var96.length() > 0) {
                                            int var97 = var96.indexOf(class2.field20);
                                            String var98;
                                            if (var97 == -1) {
                                                var98 = var96;
                                                var96 = "";
                                            } else {
                                                var98 = var96.substring(0, var97);
                                                var96 = var96.substring(var97 + 4);
                                            }
                                            var86.method3534(var98, var92 + 3, var95, 0, -1);
                                            var95 += var86.field2981 + 1;
                                        }
                                    }
                                    if (var10.field2551 == 9) {
                                        if (var10.field2572 == 1) {
                                            class74.method1548(var12, var13, var10.field2577 + var12, var10.field2559 + var13, var10.field2566);
                                        } else {
                                            int var99 = var10.field2577 >= 0 ? var10.field2577 : -var10.field2577;
                                            int var100 = var10.field2559 >= 0 ? var10.field2559 : -var10.field2559;
                                            int var101 = var99;
                                            if (var99 < var100) {
                                                var101 = var100;
                                            }
                                            if (var101 != 0) {
                                                int var102 = (var10.field2577 << 16) / var101;
                                                int var103 = (var10.field2559 << 16) / var101;
                                                if (var103 <= var102) {
                                                    var102 = -var102;
                                                } else {
                                                    var103 = -var103;
                                                }
                                                int var104 = var10.field2572 * var103 >> 17;
                                                int var105 = var10.field2572 * var103 + 1 >> 17;
                                                int var106 = var10.field2572 * var102 >> 17;
                                                int var107 = var10.field2572 * var102 + 1 >> 17;
                                                int var108 = var12 + var104;
                                                int var109 = var12 - var105;
                                                int var110 = var10.field2577 + var12 - var105;
                                                int var111 = var10.field2577 + var12 + var104;
                                                int var112 = var13 + var106;
                                                int var113 = var13 - var107;
                                                int var114 = var10.field2559 + var13 - var107;
                                                int var115 = var10.field2559 + var13 + var106;
                                                class85.method1806(var108, var109, var110);
                                                class85.method1808(var112, var113, var114, var108, var109, var110, var10.field2566);
                                                class85.method1806(var108, var110, var111);
                                                class85.method1808(var112, var114, var115, var108, var110, var111, var10.field2566);
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

    @ObfuscatedName("bm.cp(Ljava/lang/String;Lfy;B)Ljava/lang/String;")
    public static String method1443(String arg0, class157 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method24(method96(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field106 != null) {
                    var5 = class213.method3391(Statics.field106.field2076);
                    if (Statics.field106.field2078 != null) {
                        var5 = (String) Statics.field106.field2078;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("eo.cj(IB)Ljava/lang/String;")
    public static final String method2728(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field23 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method82(65408) + var1.substring(0, var1.length() - 8) + class147.field2325 + " " + class2.field17 + var1 + class2.field25 + class2.field21;
        } else if (var1.length() > 6) {
            return " " + class2.method82(16777215) + var1.substring(0, var1.length() - 4) + class147.field2327 + " " + class2.field17 + var1 + class2.field25 + class2.field21;
        } else {
            return " " + class2.method82(16776960) + var1 + class2.field21;
        }
    }

    @ObfuscatedName("e.ch(Lfy;IIIIIII)V")
    public static final void method170(class157 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field315) {
            field316 = 32;
        } else {
            field316 = 0;
        }
        field315 = false;
        if (class131.field2008 == 1 || !Statics.field1271 && class131.field2008 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2563 -= 4;
                method3177(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2563 += 4;
                method3177(arg0);
            } else if (arg5 >= arg1 - field316 && arg5 < field316 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2563 = (arg4 - arg3) * var8 / var9;
                method3177(arg0);
                field315 = true;
            }
        }
        if (field434 == 0) {
            return;
        }
        int var10 = arg0.field2577;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2563 += field434 * 45;
            method3177(arg0);
        }
    }

    @ObfuscatedName("c.cs(II)Ljava/lang/String;")
    public static final String method24(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ey.cr(Lfy;I)Z")
    public static final boolean method2723(class157 arg0) {
        if (arg0.field2540 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2540.length; var1++) {
            int var2 = method96(arg0, var1);
            int var3 = arg0.field2650[var1];
            if (arg0.field2540[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2540[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2540[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("o.cz(Lfy;IB)I")
    public static final int method96(class157 arg0, int arg1) {
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
                    var7 = field372[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field373[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field293[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class157 var11 = class157.method2872(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!Statics.method607(var12).field1037 || field250)) {
                        for (int var13 = 0; var13 < var11.field2541.length; var13++) {
                            if (var12 + 1 == var11.field2541[var13]) {
                                var7 += var11.field2659[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class159.field2680[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class145.field2146[field373[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class159.field2680[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2498.field34;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class145.field2145[var14]) {
                            var7 += field373[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class157 var17 = class157.method2872(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!Statics.method607(var18).field1037 || field250)) {
                        for (int var19 = 0; var19 < var17.field2541.length; var19++) {
                            if (var18 + 1 == var17.field2541[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field323;
                }
                if (var6 == 12) {
                    var7 = field401;
                }
                if (var6 == 13) {
                    int var20 = class159.field2680[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class159.method2859(var22);
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
                    var7 = (Statics.field2498.field746 >> 7) + Statics.field24;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2498.field752 >> 7) + Statics.field1047;
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

    @ObfuscatedName("et.cw(Lfy;III)V")
    public static final void method2873(class157 arg0, int arg1, int arg2) {
        if (arg0.field2618 == 1) {
            method829(arg0.field2653, "", 24, 0, 0, arg0.field2622);
        }
        if (arg0.field2618 == 2 && !field363) {
            String var3 = method1621(arg0);
            if (var3 != null) {
                method829(var3, class2.method82(65280) + arg0.field2652, 25, 0, -1, arg0.field2622);
            }
        }
        if (arg0.field2618 == 3) {
            method829(class147.field2323, "", 26, 0, 0, arg0.field2622);
        }
        if (arg0.field2618 == 4) {
            method829(arg0.field2653, "", 28, 0, 0, arg0.field2622);
        }
        if (arg0.field2618 == 5) {
            method829(arg0.field2653, "", 29, 0, 0, arg0.field2622);
        }
        if (arg0.field2618 == 6 && field399 == null) {
            method829(arg0.field2653, "", 30, 0, -1, arg0.field2622);
        }
        if (arg0.field2551 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2559; var5++) {
                for (int var6 = 0; var6 < arg0.field2577; var6++) {
                    int var7 = (arg0.field2638 + 32) * var6;
                    int var8 = (arg0.field2575 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2605[var4];
                        var8 += arg0.field2606[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field349 = var4;
                        Statics.field212 = arg0;
                        if (arg0.field2541[var4] > 0) {
                            label288: {
                                class46 var9 = Statics.method607(arg0.field2541[var4] - 1);
                                if (field388 == 1) {
                                    int var10 = method838(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field130 != arg0.field2622 || Statics.field873 != var4) {
                                            method829(class147.field2304, field390 + " " + class2.field19 + " " + class2.method82(16748608) + var9.field998, 31, var9.field996, var4, arg0.field2622);
                                        }
                                        break label288;
                                    }
                                }
                                if (field363) {
                                    int var12 = method838(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field2466 & 0x10) == 16) {
                                            method829(field393, field394 + " " + class2.field19 + " " + class2.method82(16748608) + var9.field998, 32, var9.field996, var4, arg0.field2622);
                                        }
                                        break label288;
                                    }
                                }
                                String[] var14 = var9.field1013;
                                if (field455) {
                                    var14 = method553(var14);
                                }
                                int var15 = method838(arg0);
                                boolean var16 = (var15 >> 30 & 0x1) != 0;
                                if (var16) {
                                    for (int var17 = 4; var17 >= 3; var17--) {
                                        if (var14 != null && var14[var17] != null) {
                                            byte var18;
                                            if (var17 == 3) {
                                                var18 = 36;
                                            } else {
                                                var18 = 37;
                                            }
                                            method829(var14[var17], class2.method82(16748608) + var9.field998, var18, var9.field996, var4, arg0.field2622);
                                        } else if (var17 == 4) {
                                            method829(class147.field2165, class2.method82(16748608) + var9.field998, 37, var9.field996, var4, arg0.field2622);
                                        }
                                    }
                                }
                                int var19 = method838(arg0);
                                boolean var20 = (var19 >> 31 & 0x1) != 0;
                                if (var20) {
                                    method829(class147.field2304, class2.method82(16748608) + var9.field998, 38, var9.field996, var4, arg0.field2622);
                                }
                                int var21 = method838(arg0);
                                boolean var22 = (var21 >> 30 & 0x1) != 0;
                                if (var22 && var14 != null) {
                                    for (int var23 = 2; var23 >= 0; var23--) {
                                        if (var14[var23] != null) {
                                            byte var24 = 0;
                                            if (var23 == 0) {
                                                var24 = 33;
                                            }
                                            if (var23 == 1) {
                                                var24 = 34;
                                            }
                                            if (var23 == 2) {
                                                var24 = 35;
                                            }
                                            method829(var14[var23], class2.method82(16748608) + var9.field998, var24, var9.field996, var4, arg0.field2622);
                                        }
                                    }
                                }
                                String[] var25 = arg0.field2591;
                                if (field455) {
                                    var25 = method553(var25);
                                }
                                if (var25 != null) {
                                    for (int var26 = 4; var26 >= 0; var26--) {
                                        if (var25[var26] != null) {
                                            byte var27 = 0;
                                            if (var26 == 0) {
                                                var27 = 39;
                                            }
                                            if (var26 == 1) {
                                                var27 = 40;
                                            }
                                            if (var26 == 2) {
                                                var27 = 41;
                                            }
                                            if (var26 == 3) {
                                                var27 = 42;
                                            }
                                            if (var26 == 4) {
                                                var27 = 43;
                                            }
                                            method829(var25[var26], class2.method82(16748608) + var9.field998, var27, var9.field996, var4, arg0.field2622);
                                        }
                                    }
                                }
                                method829(class147.field2315, class2.method82(16748608) + var9.field998, 1005, var9.field996, var4, arg0.field2622);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2592) {
            return;
        }
        if (field363) {
            int var28 = method838(arg0);
            boolean var29 = (var28 >> 21 & 0x1) != 0;
            if (var29 && (Statics.field2466 & 0x20) == 32) {
                method829(field393, field394 + " " + class2.field19 + " " + arg0.field2610, 58, 0, arg0.field2550, arg0.field2622);
            }
            return;
        }
        for (int var30 = 9; var30 >= 5; var30--) {
            String var31 = method146(arg0, var30);
            if (var31 != null) {
                method829(var31, arg0.field2610, 1007, var30 + 1, arg0.field2550, arg0.field2622);
            }
        }
        String var32 = method1621(arg0);
        if (var32 != null) {
            method829(var32, arg0.field2610, 25, 0, arg0.field2550, arg0.field2622);
        }
        for (int var33 = 4; var33 >= 0; var33--) {
            String var34 = method146(arg0, var33);
            if (var34 != null) {
                method829(var34, arg0.field2610, 57, var33 + 1, arg0.field2550, arg0.field2622);
            }
        }
        if (class161.method132(method838(arg0))) {
            method829(class147.field2169, "", 30, 0, arg0.field2550, arg0.field2622);
        }
    }

    @ObfuscatedName("dy.cy([Lfy;IIIIIIII)V")
    public static final void method2443(class157[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class157 var9 = arg0[var8];
            if (var9 != null && (!var9.field2592 || var9.field2551 == 0 || var9.field2590 || method838(var9) != 0 || field265 == var9) && var9.field2608 == arg1 && (!var9.field2592 || !Statics.method3185(var9))) {
                int var10 = var9.field2639 + arg6;
                int var11 = var9.field2576 + arg7;
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
                    int var18 = var9.field2577 + var10;
                    int var19 = var9.field2559 + var11;
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
                    int var22 = var9.field2577 + var10;
                    int var23 = var9.field2559 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field297 == var9) {
                    field415 = true;
                    field416 = var10;
                    field300 = var11;
                }
                if (!var9.field2592 || var12 < var14 && var13 < var15) {
                    int var24 = class131.field2009;
                    int var25 = class131.field2010;
                    if (class131.field2017 != 0) {
                        var24 = class131.field2016;
                        var25 = class131.field2020;
                    }
                    if (var9.field2670 == 1337) {
                        method3177(var9);
                        if (!field254 && !field376 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1049(var24, var25, var12, var13);
                        }
                    } else if (var9.field2670 != 1338) {
                        if (!field376 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2873(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2551 == 0) {
                            if (!var9.field2592 && Statics.method3185(var9) && Statics.field1439 != var9) {
                                continue;
                            }
                            method2443(arg0, var9.field2622, var12, var13, var14, var15, var10 - var9.field2562, var11 - var9.field2563);
                            if (var9.field2660 != null) {
                                method2443(var9.field2660, var9.field2622, var12, var13, var14, var15, var10 - var9.field2562, var11 - var9.field2563);
                            }
                            class4 var37 = (class4) field396.method3224((long) var9.field2622);
                            if (var37 != null) {
                                if (var37.field58 == 0 && class131.field2009 >= var12 && class131.field2010 >= var13 && class131.field2009 < var14 && class131.field2010 < var15 && !field376 && !field405) {
                                    field346[0] = class147.field2400;
                                    field383[0] = "";
                                    field380[0] = 1006;
                                    field441 = 1;
                                }
                                int var38 = var37.field54;
                                if (class157.method831(var38)) {
                                    method2443(Statics.field2641[var38], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2592) {
                            if (var9.field2669 && class131.field2009 >= var12 && class131.field2010 >= var13 && class131.field2009 < var14 && class131.field2010 < var15) {
                                for (class1 var39 = (class1) field435.method3270(); var39 != null; var39 = (class1) field435.method3262()) {
                                    if (var39.field2) {
                                        var39.method3358();
                                        var39.field3.field2661 = false;
                                    }
                                }
                                if (Statics.field1250 == 0) {
                                    field297 = null;
                                    field265 = null;
                                }
                                if (!field376) {
                                    field346[0] = class147.field2400;
                                    field383[0] = "";
                                    field380[0] = 1006;
                                    field441 = 1;
                                }
                            }
                            boolean var40;
                            if (class131.field2009 >= var12 && class131.field2010 >= var13 && class131.field2009 < var14 && class131.field2010 < var15) {
                                var40 = true;
                            } else {
                                var40 = false;
                            }
                            boolean var41 = false;
                            if ((class131.field2008 == 1 || !Statics.field1271 && class131.field2008 == 4) && var40) {
                                var41 = true;
                            }
                            boolean var42 = false;
                            if ((class131.field2017 == 1 || !Statics.field1271 && class131.field2017 == 4) && class131.field2016 >= var12 && class131.field2020 >= var13 && class131.field2016 < var14 && class131.field2020 < var15) {
                                var42 = true;
                            }
                            if (var42) {
                                method168(var9, class131.field2016 - var10, class131.field2020 - var11);
                            }
                            if (field297 != null && field297 != var9 && var40 && class161.method1403(method838(var9))) {
                                field411 = var9;
                            }
                            if (field265 == var9) {
                                field412 = true;
                                field445 = var10;
                                field236 = var11;
                            }
                            if (var9.field2590) {
                                if (var40 && field434 != 0 && var9.field2546 != null) {
                                    class1 var43 = new class1();
                                    var43.field2 = true;
                                    var43.field3 = var9;
                                    var43.field4 = field434;
                                    var43.field5 = var9.field2546;
                                    field435.method3256(var43);
                                }
                                if (field297 != null || Statics.field22 != null || field376) {
                                    var42 = false;
                                    var41 = false;
                                    var40 = false;
                                }
                                if (!var9.field2662 && var42) {
                                    var9.field2662 = true;
                                    if (var9.field2615 != null) {
                                        class1 var44 = new class1();
                                        var44.field2 = true;
                                        var44.field3 = var9;
                                        var44.field7 = class131.field2016 - var10;
                                        var44.field4 = class131.field2020 - var11;
                                        var44.field5 = var9.field2615;
                                        field435.method3256(var44);
                                    }
                                }
                                if (var9.field2662 && var41 && var9.field2620 != null) {
                                    class1 var45 = new class1();
                                    var45.field2 = true;
                                    var45.field3 = var9;
                                    var45.field7 = class131.field2009 - var10;
                                    var45.field4 = class131.field2010 - var11;
                                    var45.field5 = var9.field2620;
                                    field435.method3256(var45);
                                }
                                if (var9.field2662 && !var41) {
                                    var9.field2662 = false;
                                    if (var9.field2554 != null) {
                                        class1 var46 = new class1();
                                        var46.field2 = true;
                                        var46.field3 = var9;
                                        var46.field7 = class131.field2009 - var10;
                                        var46.field4 = class131.field2010 - var11;
                                        var46.field5 = var9.field2554;
                                        field409.method3256(var46);
                                    }
                                }
                                if (var41 && var9.field2603 != null) {
                                    class1 var47 = new class1();
                                    var47.field2 = true;
                                    var47.field3 = var9;
                                    var47.field7 = class131.field2009 - var10;
                                    var47.field4 = class131.field2010 - var11;
                                    var47.field5 = var9.field2603;
                                    field435.method3256(var47);
                                }
                                if (!var9.field2661 && var40) {
                                    var9.field2661 = true;
                                    if (var9.field2553 != null) {
                                        class1 var48 = new class1();
                                        var48.field2 = true;
                                        var48.field3 = var9;
                                        var48.field7 = class131.field2009 - var10;
                                        var48.field4 = class131.field2010 - var11;
                                        var48.field5 = var9.field2553;
                                        field435.method3256(var48);
                                    }
                                }
                                if (var9.field2661 && var40 && var9.field2642 != null) {
                                    class1 var49 = new class1();
                                    var49.field2 = true;
                                    var49.field3 = var9;
                                    var49.field7 = class131.field2009 - var10;
                                    var49.field4 = class131.field2010 - var11;
                                    var49.field5 = var9.field2642;
                                    field435.method3256(var49);
                                }
                                if (var9.field2661 && !var40) {
                                    var9.field2661 = false;
                                    if (var9.field2627 != null) {
                                        class1 var50 = new class1();
                                        var50.field2 = true;
                                        var50.field3 = var9;
                                        var50.field7 = class131.field2009 - var10;
                                        var50.field4 = class131.field2010 - var11;
                                        var50.field5 = var9.field2627;
                                        field409.method3256(var50);
                                    }
                                }
                                if (var9.field2636 != null) {
                                    class1 var51 = new class1();
                                    var51.field3 = var9;
                                    var51.field5 = var9.field2636;
                                    field436.method3256(var51);
                                }
                                if (var9.field2630 != null && field421 > var9.field2664) {
                                    if (var9.field2631 == null || field421 - var9.field2664 > 32) {
                                        class1 var56 = new class1();
                                        var56.field3 = var9;
                                        var56.field5 = var9.field2630;
                                        field435.method3256(var56);
                                    } else {
                                        label528: for (int var52 = var9.field2664; var52 < field421; var52++) {
                                            int var53 = field420[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field2631.length; var54++) {
                                                if (var9.field2631[var54] == var53) {
                                                    class1 var55 = new class1();
                                                    var55.field3 = var9;
                                                    var55.field5 = var9.field2630;
                                                    field435.method3256(var55);
                                                    break label528;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2664 = field421;
                                }
                                if (var9.field2632 != null && field334 > var9.field2665) {
                                    if (var9.field2633 == null || field334 - var9.field2665 > 32) {
                                        class1 var61 = new class1();
                                        var61.field3 = var9;
                                        var61.field5 = var9.field2632;
                                        field435.method3256(var61);
                                    } else {
                                        label504: for (int var57 = var9.field2665; var57 < field334; var57++) {
                                            int var58 = field422[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var9.field2633.length; var59++) {
                                                if (var9.field2633[var59] == var58) {
                                                    class1 var60 = new class1();
                                                    var60.field3 = var9;
                                                    var60.field5 = var9.field2632;
                                                    field435.method3256(var60);
                                                    break label504;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2665 = field334;
                                }
                                if (var9.field2634 != null && field425 > var9.field2579) {
                                    if (var9.field2635 == null || field425 - var9.field2579 > 32) {
                                        class1 var66 = new class1();
                                        var66.field3 = var9;
                                        var66.field5 = var9.field2634;
                                        field435.method3256(var66);
                                    } else {
                                        label480: for (int var62 = var9.field2579; var62 < field425; var62++) {
                                            int var63 = field424[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var9.field2635.length; var64++) {
                                                if (var9.field2635[var64] == var63) {
                                                    class1 var65 = new class1();
                                                    var65.field3 = var9;
                                                    var65.field5 = var9.field2634;
                                                    field435.method3256(var65);
                                                    break label480;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2579 = field425;
                                }
                                if (field426 > var9.field2663 && var9.field2571 != null) {
                                    class1 var67 = new class1();
                                    var67.field3 = var9;
                                    var67.field5 = var9.field2571;
                                    field435.method3256(var67);
                                }
                                if (field427 > var9.field2663 && var9.field2625 != null) {
                                    class1 var68 = new class1();
                                    var68.field3 = var9;
                                    var68.field5 = var9.field2625;
                                    field435.method3256(var68);
                                }
                                if (field419 > var9.field2663 && var9.field2666 != null) {
                                    class1 var69 = new class1();
                                    var69.field3 = var9;
                                    var69.field5 = var9.field2666;
                                    field435.method3256(var69);
                                }
                                if (field429 > var9.field2663 && var9.field2646 != null) {
                                    class1 var70 = new class1();
                                    var70.field3 = var9;
                                    var70.field5 = var9.field2646;
                                    field435.method3256(var70);
                                }
                                if (field499 > var9.field2663 && var9.field2647 != null) {
                                    class1 var71 = new class1();
                                    var71.field3 = var9;
                                    var71.field5 = var9.field2647;
                                    field435.method3256(var71);
                                }
                                if (field431 > var9.field2663 && var9.field2643 != null) {
                                    class1 var72 = new class1();
                                    var72.field3 = var9;
                                    var72.field5 = var9.field2643;
                                    field435.method3256(var72);
                                }
                                var9.field2663 = field471;
                                if (var9.field2640 != null) {
                                    for (int var73 = 0; var73 < field456; var73++) {
                                        class1 var74 = new class1();
                                        var74.field3 = var9;
                                        var74.field8 = field458[var73];
                                        var74.field9 = field299[var73];
                                        var74.field5 = var9.field2640;
                                        field435.method3256(var74);
                                    }
                                }
                            }
                        }
                        if (!var9.field2592 && field297 == null && Statics.field22 == null && !field376) {
                            if ((var9.field2583 >= 0 || var9.field2568 != 0) && class131.field2009 >= var12 && class131.field2010 >= var13 && class131.field2009 < var14 && class131.field2010 < var15) {
                                if (var9.field2583 >= 0) {
                                    Statics.field1439 = arg0[var9.field2583];
                                } else {
                                    Statics.field1439 = var9;
                                }
                            }
                            if (var9.field2551 == 8 && class131.field2009 >= var12 && class131.field2010 >= var13 && class131.field2009 < var14 && class131.field2010 < var15) {
                                Statics.field541 = var9;
                            }
                            if (var9.field2565 > var9.field2559) {
                                method170(var9, var9.field2577 + var10, var11, var9.field2559, var9.field2565, class131.field2009, class131.field2010);
                            }
                        }
                    } else if ((field500 == 0 || field500 == 3) && (class131.field2017 == 1 || !Statics.field1271 && class131.field2017 == 4)) {
                        int var26 = class131.field2016 - 25 - var10;
                        int var27 = class131.field2020 - 5 - var11;
                        if (var26 >= 0 && var27 >= 0 && var26 < 146 && var27 < 151 && (var26 < 0 || var26 > 23 || var27 < 117 || var27 > 142)) {
                            var26 -= 73;
                            var27 -= 75;
                            int var28 = field310 + field304 & 0x7FF;
                            int var29 = class85.field1470[var28];
                            int var30 = class85.field1483[var28];
                            int var31 = (field306 + 256) * var29 >> 8;
                            int var32 = (field306 + 256) * var30 >> 8;
                            int var33 = var26 * var32 + var27 * var31 >> 11;
                            int var34 = var27 * var32 - var26 * var31 >> 11;
                            int var35 = Statics.field2498.field746 + var33 >> 7;
                            int var36 = Statics.field2498.field752 - var34 >> 7;
                            field275.method2367(32);
                            field275.method2110(18);
                            field275.method2129(Statics.field24 + var35);
                            field275.method2147(class128.field1978[82] ? (class128.field1978[81] ? 2 : 1) : 0);
                            field275.method2155(Statics.field1047 + var36);
                            field275.method2110(var26);
                            field275.method2110(var27);
                            field275.method2111(field310);
                            field275.method2110(57);
                            field275.method2110(field304);
                            field275.method2110(field306);
                            field275.method2110(89);
                            field275.method2111(Statics.field2498.field746);
                            field275.method2111(Statics.field2498.field752);
                            field275.method2110(63);
                            field479 = var35;
                            field468 = var36;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dj.cn(III)V")
    public static final void method2405(int arg0, int arg1) {
        if (class157.method831(arg0)) {
            method693(Statics.field2641[arg0], arg1);
        }
    }

    @ObfuscatedName("az.ce([Lfy;II)V")
    public static final void method693(class157[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class157 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2551 == 0) {
                    if (var3.field2660 != null) {
                        method693(var3.field2660, arg1);
                    }
                    class4 var4 = (class4) field396.method3224((long) var3.field2622);
                    if (var4 != null) {
                        method2405(var4.field54, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2644 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field5 = var3.field2644;
                    class33.method131(var5);
                }
                if (arg1 == 1 && var3.field2560 != null) {
                    if (var3.field2550 >= 0) {
                        class157 var6 = class157.method2872(var3.field2622);
                        if (var6 == null || var6.field2660 == null || var3.field2550 >= var6.field2660.length || var6.field2660[var3.field2550] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field5 = var3.field2560;
                    class33.method131(var7);
                }
            }
        }
    }

    @ObfuscatedName("e.cl(Lfy;IIB)V")
    public static final void method168(class157 arg0, int arg1, int arg2) {
        if (field297 != null || field376 || arg0 == null) {
            return;
        }
        class157 var3 = method832(arg0);
        if (var3 == null) {
            var3 = arg0.field2612;
        }
        if (var3 == null) {
            return;
        }
        field297 = arg0;
        class157 var5 = method832(arg0);
        if (var5 == null) {
            var5 = arg0.field2612;
        }
        field265 = var5;
        field364 = arg1;
        field410 = arg2;
        Statics.field1250 = 0;
        field418 = false;
        if (field441 > 0) {
            int var7 = field441 - 1;
            Statics.field1884 = new class28();
            Statics.field1884.field622 = field408[var7];
            Statics.field1884.field621 = field463[var7];
            Statics.field1884.field629 = field380[var7];
            Statics.field1884.field623 = field381[var7];
            Statics.field1884.field624 = field346[var7];
        }
        return;
    }

    @ObfuscatedName("al.ca(IIB)V")
    public static void method623(int arg0, int arg1) {
        method2411(Statics.field1884, arg0, arg1);
        Statics.field1884 = null;
    }

    @ObfuscatedName("fw.cv(Lfy;I)V")
    public static void method3177(class157 arg0) {
        if (field461 == arg0.field2668) {
            field442[arg0.field2667] = true;
        }
    }

    @ObfuscatedName("q.de(I)V")
    public static void method161() {
        for (class4 var0 = (class4) field396.method3227(); var0 != null; var0 = (class4) field396.method3228()) {
            int var1 = var0.field54;
            if (class157.method831(var1)) {
                boolean var2 = true;
                class157[] var3 = Statics.field2641[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2592;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2903;
                    class157 var6 = class157.method2872(var5);
                    if (var6 != null) {
                        method3177(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.dw([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method553(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("p.da(II)V")
    public static final void method3(int arg0) {
        if (!class157.method831(arg0)) {
            return;
        }
        class157[] var1 = Statics.field2641[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3 != null) {
                var3.field2619 = 0;
                var3.field2601 = 0;
            }
        }
    }

    @ObfuscatedName("cc.dk([Lfy;II)V")
    public static final void method1620(class157[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class157 var3 = arg0[var2];
            if (var3 != null && var3.field2608 == arg1 && (!var3.field2592 || !Statics.method3185(var3))) {
                if (var3.field2551 == 0) {
                    if (!var3.field2592 && Statics.method3185(var3) && Statics.field1439 != var3) {
                        continue;
                    }
                    method1620(arg0, var3.field2622);
                    if (var3.field2660 != null) {
                        method1620(var3.field2660, var3.field2622);
                    }
                    class4 var4 = (class4) field396.method3224((long) var3.field2622);
                    if (var4 != null) {
                        int var5 = var4.field54;
                        if (class157.method831(var5)) {
                            method1620(Statics.field2641[var5], -1);
                        }
                    }
                }
                if (var3.field2551 == 6) {
                    if (var3.field2585 != -1 || var3.field2586 != -1) {
                        boolean var6 = method2723(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2586;
                        } else {
                            var7 = var3.field2585;
                        }
                        if (var7 != -1) {
                            class39 var8 = class39.method2920(var7);
                            var3.field2601 += field309;
                            while (var3.field2601 > var8.field886[var3.field2619]) {
                                var3.field2601 -= var8.field886[var3.field2619];
                                var3.field2619++;
                                if (var3.field2619 >= var8.field892.length) {
                                    var3.field2619 -= var8.field888;
                                    if (var3.field2619 < 0 || var3.field2619 >= var8.field892.length) {
                                        var3.field2619 = 0;
                                    }
                                }
                                method3177(var3);
                            }
                        }
                    }
                    if (var3.field2593 != 0 && !var3.field2592) {
                        int var9 = var3.field2593 >> 16;
                        int var10 = var3.field2593 << 16 >> 16;
                        int var11 = field309 * var9;
                        int var12 = field309 * var10;
                        var3.field2589 = var3.field2589 + var11 & 0x7FF;
                        var3.field2604 = var3.field2604 + var12 & 0x7FF;
                        method3177(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cp.dr(II)V")
    public static final void method1893(int arg0) {
        method161();
        for (class21 var1 = (class21) class21.field531.method3270(); var1 != null; var1 = (class21) class21.field531.method3262()) {
            if (var1.field535 != null) {
                var1.method512();
            }
        }
        int var2 = class47.method639(arg0).field1046;
        if (var2 == 0) {
            return;
        }
        int var3 = class159.field2680[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class85.method1820(0.9D);
                ((class89) Statics.field1479).method1880(0.9D);
            }
            if (var3 == 2) {
                class85.method1820(0.8D);
                ((class89) Statics.field1479).method1880(0.8D);
            }
            if (var3 == 3) {
                class85.method1820(0.7D);
                ((class89) Statics.field1479).method1880(0.7D);
            }
            if (var3 == 4) {
                class85.method1820(0.6D);
                ((class89) Statics.field1479).method1880(0.6D);
            }
            class46.method602();
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
            if (field470 != var4) {
                if (field470 == 0 && field469 != -1) {
                    class166.method812(Statics.field1928, field469, 0, var4, false);
                    field472 = false;
                } else if (var4 == 0) {
                    class166.method503();
                    field472 = false;
                } else {
                    class166.method81(var4);
                }
                field470 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field473 = 127;
            }
            if (var3 == 1) {
                field473 = 96;
            }
            if (var3 == 2) {
                field473 = 64;
            }
            if (var3 == 3) {
                field473 = 32;
            }
            if (var3 == 4) {
                field473 = 0;
            }
        }
        if (var2 == 5) {
            field446 = var3;
        }
        if (var2 == 6) {
            field397 = var3;
        }
        if (var2 == 9) {
            field398 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field474 = 127;
            }
            if (var3 == 1) {
                field474 = 96;
            }
            if (var3 == 2) {
                field474 = 64;
            }
            if (var3 == 3) {
                field474 = 32;
            }
            if (var3 == 4) {
                field474 = 0;
            }
        }
        if (var2 == 17) {
            field281 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class18[] var5 = new class18[] { class18.field501, class18.field502, class18.field503 };
            field282 = (class18) Statics.method620(var5, var3);
            if (field282 == null) {
                field282 = class18.field503;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field367 = -1;
        } else {
            field367 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("z.dg(Lfy;B)V")
    public static final void method92(class157 arg0) {
        int var1 = arg0.field2670;
        if (var1 == 324) {
            if (field494 == -1) {
                field494 = arg0.field2573;
                field495 = arg0.field2548;
            }
            if (field493.field2696) {
                arg0.field2573 = field494;
            } else {
                arg0.field2573 = field495;
            }
        } else if (var1 == 325) {
            if (field494 == -1) {
                field494 = arg0.field2573;
                field495 = arg0.field2548;
            }
            if (field493.field2696) {
                arg0.field2573 = field495;
            } else {
                arg0.field2573 = field494;
            }
        } else if (var1 == 327) {
            arg0.field2589 = 150;
            arg0.field2604 = (int) (Math.sin((double) field243 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2581 = 5;
            arg0.field2582 = 0;
        } else if (var1 == 328) {
            arg0.field2589 = 150;
            arg0.field2604 = (int) (Math.sin((double) field243 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2581 = 5;
            arg0.field2582 = 1;
        }
    }

    @ObfuscatedName("i.dm(Lc;ZS)V")
    public static final void method549(class4 arg0, boolean arg1) {
        int var2 = arg0.field54;
        int var3 = (int) arg0.field2903;
        arg0.method3358();
        if (arg1) {
            class157.method547(var2);
        }
        for (class184 var4 = (class184) field347.method3227(); var4 != null; var4 = (class184) field347.method3228()) {
            if ((long) var2 == (var4.field2903 >> 48 & 0xFFFFL)) {
                var4.method3358();
            }
        }
        class157 var5 = class157.method2872(var3);
        if (var5 != null) {
            method3177(var5);
        }
        method2850();
        if (field395 != -1) {
            method2405(field395, 1);
        }
    }

    @ObfuscatedName("ag.ds(Lfy;I)Z")
    public static final boolean method845(class157 arg0) {
        int var1 = arg0.field2670;
        if (var1 == 205) {
            field301 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field493.method2963(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field493.method2949(var4, var5 == 1);
        }
        if (var1 == 324) {
            field493.method2950(false);
        }
        if (var1 == 325) {
            field493.method2950(true);
        }
        if (var1 == 326) {
            field275.method2367(219);
            field493.method2977(field275);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("o.dp(IIII)V")
    public static final void method95(int arg0, int arg1, int arg2) {
        method2930();
        class74.method1534(arg0, arg1, Statics.field2148.field1315 + arg0, Statics.field2148.field1313 + arg1);
        if (field500 == 2 || field500 == 5) {
            class74.method1558(arg0 + 25, arg1 + 5, 0, Statics.field321, Statics.field2693);
        } else {
            int var3 = field310 + field304 & 0x7FF;
            int var4 = Statics.field2498.field746 / 32 + 48;
            int var5 = 464 - Statics.field2498.field752 / 32;
            Statics.field2142.method1473(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field306 + 256, Statics.field321, Statics.field2693);
            for (int var6 = 0; var6 < field378; var6++) {
                int var7 = field464[var6] * 4 + 2 - Statics.field2498.field746 / 32;
                int var8 = field465[var6] * 4 + 2 - Statics.field2498.field752 / 32;
                Statics.method144(arg0, arg1, var7, var8, field466[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class182 var11 = field368[Statics.field1082][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field2498.field746 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field2498.field752 / 32;
                        Statics.method144(arg0, arg1, var12, var13, Statics.field198[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field366; var14++) {
                class31 var15 = field272[field467[var14]];
                if (var15 != null && var15.method14()) {
                    class36 var16 = var15.field675;
                    if (var16 != null && var16.field801 != null) {
                        var16 = var16.method646();
                    }
                    if (var16 != null && var16.field794 && var16.field806) {
                        int var17 = var15.field746 / 32 - Statics.field2498.field746 / 32;
                        int var18 = var15.field752 / 32 - Statics.field2498.field752 / 32;
                        Statics.method144(arg0, arg1, var17, var18, Statics.field198[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field354; var19++) {
                class3 var20 = field276[field355[var19]];
                if (var20 != null && var20.method14() && !var20.field49) {
                    int var21 = var20.field746 / 32 - Statics.field2498.field746 / 32;
                    int var22 = var20.field752 / 32 - Statics.field2498.field752 / 32;
                    boolean var23 = false;
                    if (method165(var20.field43, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field765; var25++) {
                        if (var20.field43.equals(Statics.field13[var25].field555)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field2498.field48 != 0 && var20.field48 != 0 && Statics.field2498.field48 == var20.field48) {
                        var26 = true;
                    }
                    if (var23) {
                        Statics.method144(arg0, arg1, var21, var22, Statics.field198[3]);
                    } else if (var26) {
                        Statics.method144(arg0, arg1, var21, var22, Statics.field198[4]);
                    } else if (var24) {
                        Statics.method144(arg0, arg1, var21, var22, Statics.field198[5]);
                    } else {
                        Statics.method144(arg0, arg1, var21, var22, Statics.field198[2]);
                    }
                }
            }
            if (field251 != 0 && field243 % 20 < 10) {
                if (field251 == 1 && field252 >= 0 && field252 < field272.length) {
                    class31 var27 = field272[field252];
                    if (var27 != null) {
                        int var28 = var27.field746 / 32 - Statics.field2498.field746 / 32;
                        int var29 = var27.field752 / 32 - Statics.field2498.field752 / 32;
                        method78(arg0, arg1, var28, var29, Statics.field1269[1]);
                    }
                }
                if (field251 == 2) {
                    int var30 = field239 * 4 - Statics.field24 * 4 + 2 - Statics.field2498.field746 / 32;
                    int var31 = field255 * 4 - Statics.field1047 * 4 + 2 - Statics.field2498.field752 / 32;
                    method78(arg0, arg1, var30, var31, Statics.field1269[1]);
                }
                if (field251 == 10 && field403 >= 0 && field403 < field276.length) {
                    class3 var32 = field276[field403];
                    if (var32 != null) {
                        int var33 = var32.field746 / 32 - Statics.field2498.field746 / 32;
                        int var34 = var32.field752 / 32 - Statics.field2498.field752 / 32;
                        method78(arg0, arg1, var33, var34, Statics.field1269[1]);
                    }
                }
            }
            if (field479 != 0) {
                int var35 = field479 * 4 + 2 - Statics.field2498.field746 / 32;
                int var36 = field468 * 4 + 2 - Statics.field2498.field752 / 32;
                Statics.method144(arg0, arg1, var35, var36, Statics.field1269[0]);
            }
            if (!Statics.field2498.field49) {
                class74.method1540(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
            }
        }
        if (field500 < 3) {
            Statics.field2815.method1473(arg0, arg1, 33, 33, 25, 25, field310, 256, Statics.field1882, Statics.field2707);
        } else {
            class74.method1558(arg0, arg1, 0, Statics.field1882, Statics.field2707);
        }
        if (field444[arg2]) {
            Statics.field2148.method1601(arg0, arg1);
        }
        field443[arg2] = true;
    }

    @ObfuscatedName("f.dj(IIIILbq;I)V")
    public static final void method78(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            Statics.method144(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field310 + field304 & 0x7FF;
        int var7 = class85.field1470[var6];
        int var8 = class85.field1483[var6];
        int var9 = var7 * 256 / (field306 + 256);
        int var10 = var8 * 256 / (field306 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field872.method1474(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("e.dz(Ljava/lang/String;ZI)Z")
    public static boolean method165(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class214.method2464(arg0, Statics.field237);
        for (int var3 = 0; var3 < field487; var3++) {
            if (var2.equalsIgnoreCase(class214.method2464(field489[var3].field214, Statics.field237)) && (!arg1 || field489[var3].field204 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class214.method2464(Statics.field2498.field43, Statics.field237))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bs.do(Ljava/lang/String;B)Z")
    public static boolean method1369(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class214.method2464(arg0, Statics.field237);
        for (int var2 = 0; var2 < field491; var2++) {
            class8 var3 = field492[var2];
            if (var1.equalsIgnoreCase(class214.method2464(var3.field114, Statics.field237))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class214.method2464(var3.field111, Statics.field237))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ar.dc(Ljava/lang/String;I)V")
    public static final void method560(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class214.method2464(arg0, Statics.field237);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field491; var2++) {
            class8 var3 = field492[var2];
            String var4 = var3.field114;
            String var5 = class214.method2464(var4, Statics.field237);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field491--;
                for (int var7 = var2; var7 < field491; var7++) {
                    field492[var7] = field492[var7 + 1];
                }
                field427 = field471;
                field275.method2367(135);
                field275.method2110(class110.method505(arg0));
                field275.method2314(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cd.dd(Ljava/lang/String;I)V")
    public static final void method1800(String arg0) {
        if (!arg0.equals("")) {
            field275.method2367(76);
            field275.method2110(class110.method505(arg0));
            field275.method2314(arg0);
        }
    }

    @ObfuscatedName("gr.dx(I)V")
    public static final void method3410() {
        field275.method2367(76);
        field275.method2110(0);
    }

    @ObfuscatedName("ag.dq(Lfy;S)I")
    public static int method838(class157 arg0) {
        class184 var1 = (class184) field347.method3224(((long) arg0.field2622 << 32) + (long) arg0.field2550);
        return var1 == null ? arg0.field2545 : var1.field2888;
    }

    @ObfuscatedName("au.dy(Lfy;B)Lfy;")
    public static class157 method832(class157 arg0) {
        int var1 = method838(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class157.method2872(arg0.field2608);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("w.dl(Lfy;IB)Ljava/lang/String;")
    public static String method146(class157 arg0, int arg1) {
        int var2 = method838(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2556 == null) {
            return null;
        } else if (arg0.field2628 == null || arg0.field2628.length <= arg1 || arg0.field2628[arg1] == null || arg0.field2628[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2628[arg1];
        }
    }

    @ObfuscatedName("cc.di(Lfy;I)Ljava/lang/String;")
    public static String method1621(class157 arg0) {
        int var1 = method838(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2616 == null || arg0.field2616.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2616;
        }
    }

    @ObfuscatedName("ce.dv(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method2055(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field235 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field235 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field235 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field235 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field235 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field66 != null) {
            var3 = "/p=" + Statics.field66;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field240 + "/a=" + Statics.field1886 + var3 + "/";
    }

    @ObfuscatedName("al.df(Ljava/lang/String;B)V")
    public static void method618(String arg0) {
        Statics.field66 = arg0;
        try {
            String var1 = Statics.field602.getParameter(class173.field2853.field2856);
            String var2 = Statics.field602.getParameter(class173.field2854.field2856);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class102.method2851(class106.method870() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field602;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }
}

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

public final class client extends class131 {

    @ObfuscatedName("client.h")
    public static boolean field425 = true;

    @ObfuscatedName("client.m")
    public static int field497 = 1;

    @ObfuscatedName("client.u")
    public static int field242 = 0;

    @ObfuscatedName("client.b")
    public static int field468 = 0;

    @ObfuscatedName("client.w")
    public static class198[] field418 = new class198[4];

    @ObfuscatedName("client.o")
    public static boolean field245 = false;

    @ObfuscatedName("client.a")
    public static boolean field403 = false;

    @ObfuscatedName("client.f")
    public static int field283 = 0;

    @ObfuscatedName("client.e")
    public static int field495 = 0;

    @ObfuscatedName("client.t")
    public static boolean field250 = true;

    @ObfuscatedName("client.c")
    public static int field251 = 0;

    @ObfuscatedName("client.l")
    public static long field332 = 1L;

    @ObfuscatedName("client.d")
    public static int field253 = -1;

    @ObfuscatedName("client.p")
    public static int field254 = -1;

    @ObfuscatedName("client.z")
    public static int field473 = -1;

    @ObfuscatedName("client.q")
    public static boolean field275 = true;

    @ObfuscatedName("client.i")
    public static boolean field257 = false;

    @ObfuscatedName("client.ah")
    public static int field258 = 0;

    @ObfuscatedName("client.aj")
    public static int field356 = 0;

    @ObfuscatedName("client.aq")
    public static int field260 = 0;

    @ObfuscatedName("client.aa")
    public static int field261 = 0;

    @ObfuscatedName("client.ar")
    public static int field294 = 0;

    @ObfuscatedName("client.at")
    public static int field263 = 0;

    @ObfuscatedName("client.av")
    public static int field264 = 0;

    @ObfuscatedName("client.af")
    public static int field265 = 0;

    @ObfuscatedName("client.ap")
    public static int field252 = 0;

    @ObfuscatedName("client.ao")
    public static class107 field267 = new class107(new byte[5000]);

    @ObfuscatedName("client.ad")
    public static class18 field268 = class18.field508;

    @ObfuscatedName("client.ay")
    public static int field270 = 0;

    @ObfuscatedName("client.an")
    public static int field271 = 0;

    @ObfuscatedName("client.ab")
    public static int field272 = 0;

    @ObfuscatedName("client.bk")
    public static int field327 = 0;

    @ObfuscatedName("client.bm")
    public static int field238 = 0;

    @ObfuscatedName("client.bx")
    public static int field247 = 0;

    @ObfuscatedName("client.bj")
    public static int field277 = 0;

    @ObfuscatedName("client.bp")
    public static int field284 = 0;

    @ObfuscatedName("client.bl")
    public static class30[] field279 = new class30[32768];

    @ObfuscatedName("client.bz")
    public static int field357 = 0;

    @ObfuscatedName("client.bh")
    public static int[] field281 = new int[32768];

    @ObfuscatedName("client.cd")
    public static class110 field361 = new class110(5000);

    @ObfuscatedName("client.cp")
    public static class110 field485 = new class110(5000);

    @ObfuscatedName("client.cz")
    public static class110 field285 = new class110(5000);

    @ObfuscatedName("client.ch")
    public static int field286 = 0;

    @ObfuscatedName("client.cr")
    public static int field287 = 0;

    @ObfuscatedName("client.cm")
    public static int field288 = 0;

    @ObfuscatedName("client.cx")
    public static int field289 = 0;

    @ObfuscatedName("client.cc")
    public static int field290 = 0;

    @ObfuscatedName("client.cn")
    public static int field446 = 0;

    @ObfuscatedName("client.ce")
    public static int field292 = 0;

    @ObfuscatedName("client.ca")
    public static int field326 = 0;

    @ObfuscatedName("client.cv")
    public static boolean field499 = false;

    @ObfuscatedName("client.cf")
    public static int field296 = 0;

    @ObfuscatedName("client.ct")
    public static int field297 = 0;

    @ObfuscatedName("client.df")
    public static int field298 = 1;

    @ObfuscatedName("client.dz")
    public static int field362 = 0;

    @ObfuscatedName("client.di")
    public static int field455 = 1;

    @ObfuscatedName("client.dg")
    public static int field301 = 0;

    @ObfuscatedName("client.dx")
    public static boolean field303 = false;

    @ObfuscatedName("client.dt")
    public static int[][][] field304 = new int[4][13][13];

    @ObfuscatedName("client.dq")
    public static final int[] field450 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.da")
    public static int field306 = 0;

    @ObfuscatedName("client.dy")
    public static int field307 = 2;

    @ObfuscatedName("client.dv")
    public static int field308 = 0;

    @ObfuscatedName("client.ds")
    public static int field309 = 2;

    @ObfuscatedName("client.dl")
    public static int field310 = 0;

    @ObfuscatedName("client.dm")
    public static int field311 = 1;

    @ObfuscatedName("client.dp")
    public static int field312 = 0;

    @ObfuscatedName("client.do")
    public static int field322 = 0;

    @ObfuscatedName("client.du")
    public static int field314 = 2;

    @ObfuscatedName("client.dd")
    public static int field243 = 0;

    @ObfuscatedName("client.ee")
    public static int field316 = 1;

    @ObfuscatedName("client.ez")
    public static int field262 = 0;

    @ObfuscatedName("client.em")
    public static int field280 = 0;

    @ObfuscatedName("client.eq")
    public static int field320 = 2301979;

    @ObfuscatedName("client.ei")
    public static int field321 = 5063219;

    @ObfuscatedName("client.ek")
    public static int field500 = 3353893;

    @ObfuscatedName("client.ep")
    public static int field392 = 7759444;

    @ObfuscatedName("client.ew")
    public static boolean field324 = false;

    @ObfuscatedName("client.fc")
    public static int field416 = 0;

    @ObfuscatedName("client.fb")
    public static int field291 = 128;

    @ObfuscatedName("client.fe")
    public static int field478 = 0;

    @ObfuscatedName("client.fs")
    public static int field380 = 0;

    @ObfuscatedName("client.fx")
    public static int field329 = 0;

    @ObfuscatedName("client.fw")
    public static int field330 = 0;

    @ObfuscatedName("client.fm")
    public static int field331 = 0;

    @ObfuscatedName("client.fq")
    public static int field389 = 0;

    @ObfuscatedName("client.fl")
    public static boolean field333 = false;

    @ObfuscatedName("client.ft")
    public static int field334 = 0;

    @ObfuscatedName("client.fy")
    public static int field315 = 0;

    @ObfuscatedName("client.fz")
    public static int field336 = 50;

    @ObfuscatedName("client.fv")
    public static int[] field337 = new int[field336];

    @ObfuscatedName("client.fd")
    public static int[] field338 = new int[field336];

    @ObfuscatedName("client.fn")
    public static int[] field339 = new int[field336];

    @ObfuscatedName("client.ff")
    public static int[] field444 = new int[field336];

    @ObfuscatedName("client.fh")
    public static int[] field341 = new int[field336];

    @ObfuscatedName("client.fg")
    public static int[] field335 = new int[field336];

    @ObfuscatedName("client.fr")
    public static int[] field246 = new int[field336];

    @ObfuscatedName("client.gc")
    public static String[] field344 = new String[field336];

    @ObfuscatedName("client.gd")
    public static int[][] field345 = new int[104][104];

    @ObfuscatedName("client.gb")
    public static int field346 = 0;

    @ObfuscatedName("client.go")
    public static int field347 = -1;

    @ObfuscatedName("client.gg")
    public static int field348 = -1;

    @ObfuscatedName("client.gw")
    public static int field349 = 0;

    @ObfuscatedName("client.gx")
    public static int field350 = 0;

    @ObfuscatedName("client.gm")
    public static int field420 = 0;

    @ObfuscatedName("client.gj")
    public static int field352 = 0;

    @ObfuscatedName("client.gk")
    public static int field353 = 0;

    @ObfuscatedName("client.ge")
    public static int field354 = 0;

    @ObfuscatedName("client.gs")
    public static int field355 = 0;

    @ObfuscatedName("client.ga")
    public static int field493 = 0;

    @ObfuscatedName("client.gl")
    public static int field476 = 0;

    @ObfuscatedName("client.gt")
    public static int field358 = 0;

    @ObfuscatedName("client.gr")
    public static boolean field396 = false;

    @ObfuscatedName("client.gn")
    public static int field360 = 0;

    @ObfuscatedName("client.gf")
    public static int field419 = 0;

    @ObfuscatedName("client.gy")
    public static class3[] field386 = new class3[2048];

    @ObfuscatedName("client.gv")
    public static int field259 = 0;

    @ObfuscatedName("client.gi")
    public static int[] field364 = new int[2048];

    @ObfuscatedName("client.hh")
    public static int field365 = 0;

    @ObfuscatedName("client.ho")
    public static int[] field255 = new int[2048];

    @ObfuscatedName("client.he")
    public static class107[] field479 = new class107[2048];

    @ObfuscatedName("client.hc")
    public static int field368 = -1;

    @ObfuscatedName("client.hi")
    public static int field369 = 0;

    @ObfuscatedName("client.hz")
    public static int field370 = 0;

    @ObfuscatedName("client.hy")
    public static int[] field371 = new int[1000];

    @ObfuscatedName("client.hm")
    public static final int[] field372 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ht")
    public static String[] field373 = new String[8];

    @ObfuscatedName("client.hw")
    public static boolean[] field325 = new boolean[8];

    @ObfuscatedName("client.hs")
    public static int[] field375 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hb")
    public static int field376 = -1;

    @ObfuscatedName("client.hr")
    public static class178[][][] field377 = new class178[4][104][104];

    @ObfuscatedName("client.hg")
    public static class178 field378 = new class178();

    @ObfuscatedName("client.hv")
    public static class178 field472 = new class178();

    @ObfuscatedName("client.hp")
    public static class178 field453 = new class178();

    @ObfuscatedName("client.hf")
    public static int[] field381 = new int[25];

    @ObfuscatedName("client.hk")
    public static int[] field382 = new int[25];

    @ObfuscatedName("client.hn")
    public static int[] field383 = new int[25];

    @ObfuscatedName("client.hx")
    public static int field384 = 0;

    @ObfuscatedName("client.hu")
    public static boolean field466 = false;

    @ObfuscatedName("client.ih")
    public static int field494 = 0;

    @ObfuscatedName("client.ik")
    public static int[] field282 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field388 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field299 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field390 = new int[500];

    @ObfuscatedName("client.iv")
    public static String[] field391 = new String[500];

    @ObfuscatedName("client.ig")
    public static String[] field366 = new String[500];

    @ObfuscatedName("client.il")
    public static int field393 = -1;

    @ObfuscatedName("client.id")
    public static int field394 = -1;

    @ObfuscatedName("client.ib")
    public static int field342 = 0;

    @ObfuscatedName("client.is")
    public static int field397 = 50;

    @ObfuscatedName("client.iw")
    public static int field398 = 0;

    @ObfuscatedName("client.it")
    public static String field399 = null;

    @ObfuscatedName("client.ip")
    public static boolean field400 = false;

    @ObfuscatedName("client.iy")
    public static int field401 = -1;

    @ObfuscatedName("client.ie")
    public static int field340 = -1;

    @ObfuscatedName("client.jp")
    public static String field367 = null;

    @ObfuscatedName("client.jt")
    public static String field404 = null;

    @ObfuscatedName("client.jq")
    public static int field405 = -1;

    @ObfuscatedName("client.jb")
    public static class175 field406 = new class175(8);

    @ObfuscatedName("client.jo")
    public static int field407 = 0;

    @ObfuscatedName("client.je")
    public static int field408 = 0;

    @ObfuscatedName("client.jc")
    public static class153 field409 = null;

    @ObfuscatedName("client.jx")
    public static int field410 = 0;

    @ObfuscatedName("client.jn")
    public static int field474 = 0;

    @ObfuscatedName("client.ja")
    public static int field412 = 0;

    @ObfuscatedName("client.jy")
    public static int field413 = -1;

    @ObfuscatedName("client.js")
    public static boolean field414 = false;

    @ObfuscatedName("client.jf")
    public static boolean field415 = false;

    @ObfuscatedName("client.jd")
    public static boolean field471 = false;

    @ObfuscatedName("client.jk")
    public static class153 field417 = null;

    @ObfuscatedName("client.jz")
    public static class153 field313 = null;

    @ObfuscatedName("client.jr")
    public static int field328 = 0;

    @ObfuscatedName("client.ji")
    public static int field302 = 0;

    @ObfuscatedName("client.jj")
    public static class153 field421 = null;

    @ObfuscatedName("client.ju")
    public static boolean field422 = false;

    @ObfuscatedName("client.jw")
    public static int field423 = -1;

    @ObfuscatedName("client.jg")
    public static int field424 = -1;

    @ObfuscatedName("client.jm")
    public static boolean field239 = false;

    @ObfuscatedName("client.jv")
    public static int field426 = -1;

    @ObfuscatedName("client.jl")
    public static int field427 = -1;

    @ObfuscatedName("client.kc")
    public static boolean field440 = false;

    @ObfuscatedName("client.km")
    public static int field429 = 1;

    @ObfuscatedName("client.ki")
    public static int[] field430 = new int[32];

    @ObfuscatedName("client.kr")
    public static int field431 = 0;

    @ObfuscatedName("client.kw")
    public static int[] field432 = new int[32];

    @ObfuscatedName("client.kg")
    public static int field433 = 0;

    @ObfuscatedName("client.kn")
    public static int[] field434 = new int[32];

    @ObfuscatedName("client.ke")
    public static int field439 = 0;

    @ObfuscatedName("client.kk")
    public static int field359 = 0;

    @ObfuscatedName("client.kt")
    public static int field437 = 0;

    @ObfuscatedName("client.kp")
    public static int field438 = 0;

    @ObfuscatedName("client.ka")
    public static int field300 = 0;

    @ObfuscatedName("client.kj")
    public static int[] field470 = new int[2000];

    @ObfuscatedName("client.kv")
    public static String[] field441 = new String[1000];

    @ObfuscatedName("client.kx")
    public static int field442 = 0;

    @ObfuscatedName("client.ks")
    public static class178 field443 = new class178();

    @ObfuscatedName("client.kz")
    public static class178 field489 = new class178();

    @ObfuscatedName("client.kq")
    public static class178 field445 = new class178();

    @ObfuscatedName("client.kl")
    public static class175 field266 = new class175(512);

    @ObfuscatedName("client.lp")
    public static int field447 = 0;

    @ObfuscatedName("client.lk")
    public static int field448 = -2;

    @ObfuscatedName("client.lt")
    public static boolean[] field449 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field351 = new boolean[100];

    @ObfuscatedName("client.lz")
    public static boolean[] field451 = new boolean[100];

    @ObfuscatedName("client.lh")
    public static int[] field452 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field343 = new int[100];

    @ObfuscatedName("client.lu")
    public static int[] field454 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field317 = new int[100];

    @ObfuscatedName("client.lx")
    public static int field456 = 0;

    @ObfuscatedName("client.lr")
    public static int[] field249 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lw")
    public static int field458 = 0;

    @ObfuscatedName("client.lb")
    public static int field459 = 0;

    @ObfuscatedName("client.lg")
    public static String field460 = "";

    @ObfuscatedName("client.ly")
    public static long[] field461 = new long[100];

    @ObfuscatedName("client.lf")
    public static int field462 = 0;

    @ObfuscatedName("client.lm")
    public static int field463 = 0;

    @ObfuscatedName("client.li")
    public static int[] field464 = new int[128];

    @ObfuscatedName("client.ll")
    public static int[] field465 = new int[128];

    @ObfuscatedName("client.ld")
    public static long field385 = -1L;

    @ObfuscatedName("client.ls")
    public static String field467 = null;

    @ObfuscatedName("client.lv")
    public static String field276 = null;

    @ObfuscatedName("client.mh")
    public static int field469 = -1;

    @ObfuscatedName("client.mm")
    public static int field411 = 0;

    @ObfuscatedName("client.mp")
    public static int[] field387 = new int[1000];

    @ObfuscatedName("client.mt")
    public static int[] field305 = new int[1000];

    @ObfuscatedName("client.mx")
    public static class72[] field274 = new class72[1000];

    @ObfuscatedName("client.mz")
    public static int field256 = 0;

    @ObfuscatedName("client.md")
    public static int field475 = 0;

    @ObfuscatedName("client.me")
    public static int field379 = 0;

    @ObfuscatedName("client.mn")
    public static int field477 = 255;

    @ObfuscatedName("client.mb")
    public static int field457 = -1;

    @ObfuscatedName("client.ms")
    public static boolean field240 = false;

    @ObfuscatedName("client.mi")
    public static int field480 = 127;

    @ObfuscatedName("client.mg")
    public static int field435 = 127;

    @ObfuscatedName("client.nz")
    public static int field482 = 0;

    @ObfuscatedName("client.no")
    public static int[] field483 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field484 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field481 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field486 = new int[50];

    @ObfuscatedName("client.nv")
    public static class52[] field487 = new class52[50];

    @ObfuscatedName("client.nn")
    public static boolean field488 = false;

    @ObfuscatedName("client.ng")
    public static boolean[] field363 = new boolean[5];

    @ObfuscatedName("client.nx")
    public static int[] field490 = new int[5];

    @ObfuscatedName("client.nd")
    public static int[] field491 = new int[5];

    @ObfuscatedName("client.nl")
    public static int[] field492 = new int[5];

    @ObfuscatedName("client.nh")
    public static int[] field402 = new int[5];

    @ObfuscatedName("client.oj")
    public static int field318 = 0;

    @ObfuscatedName("client.ot")
    public static int field278 = 0;

    @ObfuscatedName("client.of")
    public static class16[] field496 = new class16[400];

    @ObfuscatedName("client.or")
    public static class174 field269 = new class174();

    @ObfuscatedName("client.oi")
    public static int field498 = 0;

    @ObfuscatedName("client.ok")
    public static class8[] field293 = new class8[400];

    @ObfuscatedName("client.oo")
    public static class158 field323 = new class158();

    @ObfuscatedName("client.on")
    public static int field501 = -1;

    @ObfuscatedName("client.op")
    public static int field502 = -1;

    @ObfuscatedName("client.j(B)V")
    public final void method375() {
    }

    public final void init() {
        if (!this.method2565()) {
            return;
        }
        class169[] var1 = class169.method2351();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class169 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2828);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2828)) {
                    case 1:
                        class140[] var5 = new class140[] { class140.field2121, class140.field2125, class140.field2117, class140.field2122, class140.field2120, class140.field2118 };
                        Statics.field244 = (class140) class99.method511(var5, Integer.parseInt(var4));
                        if (Statics.field244 == class140.field2122) {
                            Statics.field2395 = class191.field2899;
                        } else {
                            Statics.field2395 = class191.field2900;
                        }
                        break;
                    case 2:
                        Statics.field248 = var4;
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class2.field22)) {
                            field245 = true;
                        } else {
                            field245 = false;
                        }
                        break;
                    case 4:
                        field497 = Integer.parseInt(var4);
                        break;
                    case 5:
                        field283 = Integer.parseInt(var4);
                        break;
                    case 6:
                        field468 = Integer.parseInt(var4);
                    case 7:
                    default:
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class2.field22)) {
                        }
                        break;
                    case 9:
                        Statics.field2816 = class139.method755(Integer.parseInt(var4));
                        break;
                    case 10:
                        field242 = Integer.parseInt(var4);
                }
            }
        }
        method146();
        Statics.field2786 = this.getCodeBase().getHost();
        String var6 = Statics.field2816.field2109;
        byte var7 = 0;
        try {
            class136.method327("oldschool", var6, var7, 16);
        } catch (Exception var9) {
            class135.method1860((String) null, var9);
        }
        Statics.field428 = this;
        this.method2580(765, 503, 64);
    }

    @ObfuscatedName("o.v(I)V")
    public static final void method146() {
        class79.field1362 = false;
        field403 = false;
    }

    @ObfuscatedName("client.y(I)V")
    public final void method182() {
        Statics.field1298 = field468 == 0 ? 43594 : field497 + 40000;
        Statics.field1249 = field468 == 0 ? 443 : field497 + 50000;
        Statics.field2394 = Statics.field1298;
        Statics.field2683 = class154.field2654;
        Statics.field1655 = class154.field2655;
        Statics.field2481 = class154.field2656;
        Statics.field1662 = class154.field2657;
        class124.method1845();
        Canvas var1 = Statics.field2027;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class124.field1969);
        var1.addFocusListener(class124.field1969);
        Canvas var2 = Statics.field2027;
        var2.addMouseListener(class127.field1994);
        var2.addMouseMotionListener(class127.field1994);
        var2.addFocusListener(class127.field1994);
        Statics.field529 = class118.method32();
        if (Statics.field529 != null) {
            Statics.field529.method2410(Statics.field2027);
        }
        Statics.field156 = new class121(255, class136.field2075, class136.field2076, 500000);
        class196 var3 = null;
        class9 var4 = new class9();
        try {
            var3 = class136.method2652("", Statics.field244.field2123, false);
            byte[] var5 = new byte[(int) var3.method3423()];
            int var7;
            for (int var6 = 0; var6 < var5.length; var6 += var7) {
                var7 = var3.method3424(var5, var6, var5.length - var6);
                if (var7 == -1) {
                    throw new IOException();
                }
            }
            var4 = new class9(new class107(var5));
        } catch (Exception var14) {
        }
        try {
            if (var3 != null) {
                var3.method3422();
            }
        } catch (Exception var13) {
        }
        Statics.field1979 = var4;
        Statics.field683 = this.getToolkit().getSystemClipboard();
        String var12 = Statics.field1301;
        class125.field1971 = this;
        class125.field1978 = var12;
        if (field468 != 0) {
            field257 = true;
        }
    }

    @ObfuscatedName("client.w(I)V")
    public final void method183() {
        field251++;
        this.method186();
        while (true) {
            class178 var1 = class150.field2484;
            class149 var2;
            synchronized (class150.field2484) {
                var2 = (class149) class150.field2485.method3195();
            }
            if (var2 == null) {
                Statics.method2287();
                method1759();
                class124 var4 = class124.field1969;
                synchronized (class124.field1969) {
                    class124.field1968++;
                    class124.field1945 = class124.field1967;
                    class124.field1950 = 0;
                    if (class124.field1960 >= 0) {
                        while (class124.field1960 != class124.field1959) {
                            int var6 = class124.field1958[class124.field1959];
                            class124.field1959 = class124.field1959 + 1 & 0x7F;
                            if (var6 < 0) {
                                class124.field1957[~var6] = false;
                            } else {
                                if (!class124.field1957[var6] && class124.field1950 < class124.field1963.length - 1) {
                                    class124.field1963[++class124.field1950 - 1] = var6;
                                }
                                class124.field1957[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class124.field1957[var5] = false;
                        }
                        class124.field1960 = class124.field1959;
                    }
                    class124.field1967 = class124.field1966;
                }
                class127 var8 = class127.field1994;
                synchronized (class127.field1994) {
                    class127.field1985 = class127.field1987;
                    class127.field1992 = class127.field2000;
                    class127.field1988 = class127.field1989;
                    class127.field1997 = class127.field1993;
                    class127.field1998 = class127.field1990;
                    class127.field1999 = class127.field1995;
                    class127.field2003 = class127.field1996;
                    class127.field1993 = 0;
                }
                if (Statics.field529 != null) {
                    int var10 = Statics.field529.method2404();
                    field442 = var10;
                }
                int var10002;
                if (field495 == 0) {
                    method543();
                    Statics.field783.method2419();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field2039[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field2040[var12] = 0L;
                    }
                    Statics.field129 = 0;
                } else if (field495 == 5) {
                    class28.method47(this);
                    method543();
                    Statics.field783.method2419();
                    for (int var13 = 0; var13 < 32; var13++) {
                        field2039[var13] = 0L;
                    }
                    for (int var14 = 0; var14 < 32; var14++) {
                        field2040[var14] = 0L;
                    }
                    Statics.field129 = 0;
                } else if (field495 == 10 || field495 == 11) {
                    class28.method47(this);
                } else if (field495 == 20) {
                    class28.method47(this);
                    method2643();
                } else if (field495 == 25) {
                    method164(false);
                    field297 = 0;
                    boolean var15 = true;
                    for (int var16 = 0; var16 < Statics.field1663.length; var16++) {
                        if (Statics.field1893[var16] != -1 && Statics.field1663[var16] == null) {
                            Statics.field1663[var16] = Statics.field1278.method2667(Statics.field1893[var16], 0);
                            if (Statics.field1663[var16] == null) {
                                var15 = false;
                                field297++;
                            }
                        }
                        if (Statics.field219[var16] != -1 && Statics.field616[var16] == null) {
                            Statics.field616[var16] = Statics.field1278.method2669(Statics.field219[var16], 0, Statics.field2489[var16]);
                            if (Statics.field616[var16] == null) {
                                var15 = false;
                                field297++;
                            }
                        }
                    }
                    if (var15) {
                        field362 = 0;
                        boolean var17 = true;
                        for (int var18 = 0; var18 < Statics.field1663.length; var18++) {
                            byte[] var19 = Statics.field616[var18];
                            if (var19 != null) {
                                int var20 = (Statics.field1685[var18] >> 8) * 64 - Statics.field2103;
                                int var21 = (Statics.field1685[var18] & 0xFF) * 64 - Statics.field88;
                                if (field303) {
                                    var20 = 10;
                                    var21 = 10;
                                }
                                var17 &= class6.method1939(var19, var20, var21);
                            }
                        }
                        if (var17) {
                            if (field301 != 0) {
                                method27(class143.field2306 + class2.field16 + class2.field19 + 100 + "%" + class2.field20, true);
                            }
                            method1759();
                            method5();
                            method1759();
                            Statics.field199.method1608();
                            method1759();
                            System.gc();
                            for (int var22 = 0; var22 < 4; var22++) {
                                field418[var22].method3471();
                            }
                            for (int var23 = 0; var23 < 4; var23++) {
                                for (int var24 = 0; var24 < 104; var24++) {
                                    for (int var25 = 0; var25 < 104; var25++) {
                                        class6.field66[var23][var24][var25] = 0;
                                    }
                                }
                            }
                            method1759();
                            class6.field81 = 99;
                            Statics.field67 = new byte[4][104][104];
                            Statics.field69 = new byte[4][104][104];
                            Statics.field2876 = new byte[4][104][104];
                            Statics.field70 = new byte[4][104][104];
                            Statics.field72 = new int[4][105][105];
                            Statics.field2889 = new byte[4][105][105];
                            Statics.field975 = new int[105][105];
                            Statics.field71 = new int[104];
                            Statics.field1111 = new int[104];
                            Statics.field190 = new int[104];
                            Statics.field181 = new int[104];
                            Statics.field1851 = new int[104];
                            int var26 = Statics.field1663.length;
                            for (class20 var27 = (class20) class20.field542.method3196(); var27 != null; var27 = (class20) class20.field542.method3206()) {
                                if (var27.field540 != null) {
                                    Statics.field1060.method954(var27.field540);
                                    var27.field540 = null;
                                }
                                if (var27.field552 != null) {
                                    Statics.field1060.method954(var27.field552);
                                    var27.field552 = null;
                                }
                            }
                            class20.field542.method3191();
                            method164(true);
                            if (!field303) {
                                for (int var28 = 0; var28 < var26; var28++) {
                                    int var29 = (Statics.field1685[var28] >> 8) * 64 - Statics.field2103;
                                    int var30 = (Statics.field1685[var28] & 0xFF) * 64 - Statics.field88;
                                    byte[] var31 = Statics.field1663[var28];
                                    if (var31 != null) {
                                        method1759();
                                        class6.method99(var31, var29, var30, Statics.field606 * 8 - 48, Statics.field164 * 8 - 48, field418);
                                    }
                                }
                                for (int var32 = 0; var32 < var26; var32++) {
                                    int var33 = (Statics.field1685[var32] >> 8) * 64 - Statics.field2103;
                                    int var34 = (Statics.field1685[var32] & 0xFF) * 64 - Statics.field88;
                                    byte[] var35 = Statics.field1663[var32];
                                    if (var35 == null && Statics.field164 < 800) {
                                        method1759();
                                        class6.method1601(var33, var34, 64, 64);
                                    }
                                }
                                method164(true);
                                for (int var36 = 0; var36 < var26; var36++) {
                                    byte[] var37 = Statics.field616[var36];
                                    if (var37 != null) {
                                        int var38 = (Statics.field1685[var36] >> 8) * 64 - Statics.field2103;
                                        int var39 = (Statics.field1685[var36] & 0xFF) * 64 - Statics.field88;
                                        method1759();
                                        class6.method96(var37, var38, var39, Statics.field199, field418);
                                    }
                                }
                            }
                            if (field303) {
                                int var40 = 0;
                                label1880: while (true) {
                                    if (var40 >= 4) {
                                        for (int var71 = 0; var71 < 13; var71++) {
                                            for (int var72 = 0; var72 < 13; var72++) {
                                                int var73 = field304[0][var71][var72];
                                                if (var73 == -1) {
                                                    class6.method1601(var71 * 8, var72 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method164(true);
                                        int var74 = 0;
                                        while (true) {
                                            if (var74 >= 4) {
                                                break label1880;
                                            }
                                            method1759();
                                            for (int var75 = 0; var75 < 13; var75++) {
                                                for (int var76 = 0; var76 < 13; var76++) {
                                                    int var77 = field304[var74][var75][var76];
                                                    if (var77 != -1) {
                                                        int var78 = var77 >> 24 & 0x3;
                                                        int var79 = var77 >> 1 & 0x3;
                                                        int var80 = var77 >> 14 & 0x3FF;
                                                        int var81 = var77 >> 3 & 0x7FF;
                                                        int var82 = (var80 / 8 << 8) + var81 / 8;
                                                        for (int var83 = 0; var83 < Statics.field1685.length; var83++) {
                                                            if (Statics.field1685[var83] == var82 && Statics.field616[var83] != null) {
                                                                class6.method797(Statics.field616[var83], var74, var75 * 8, var76 * 8, var78, (var80 & 0x7) * 8, (var81 & 0x7) * 8, var79, Statics.field199, field418);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var74++;
                                        }
                                    }
                                    method1759();
                                    for (int var41 = 0; var41 < 13; var41++) {
                                        for (int var42 = 0; var42 < 13; var42++) {
                                            boolean var43 = false;
                                            int var44 = field304[var40][var41][var42];
                                            if (var44 != -1) {
                                                int var45 = var44 >> 24 & 0x3;
                                                int var46 = var44 >> 1 & 0x3;
                                                int var47 = var44 >> 14 & 0x3FF;
                                                int var48 = var44 >> 3 & 0x7FF;
                                                int var49 = (var47 / 8 << 8) + var48 / 8;
                                                for (int var50 = 0; var50 < Statics.field1685.length; var50++) {
                                                    if (Statics.field1685[var50] == var49 && Statics.field1663[var50] != null) {
                                                        byte[] var51 = Statics.field1663[var50];
                                                        int var52 = var41 * 8;
                                                        int var53 = var42 * 8;
                                                        int var54 = (var47 & 0x7) * 8;
                                                        int var55 = (var48 & 0x7) * 8;
                                                        class198[] var56 = field418;
                                                        for (int var57 = 0; var57 < 8; var57++) {
                                                            for (int var58 = 0; var58 < 8; var58++) {
                                                                if (var52 + var57 > 0 && var52 + var57 < 103 && var53 + var58 > 0 && var53 + var58 < 103) {
                                                                    var56[var40].field2961[var52 + var57][var53 + var58] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class107 var59 = new class107(var51);
                                                        for (int var60 = 0; var60 < 4; var60++) {
                                                            for (int var61 = 0; var61 < 64; var61++) {
                                                                for (int var62 = 0; var62 < 64; var62++) {
                                                                    if (var45 == var60 && var61 >= var54 && var61 < var54 + 8 && var62 >= var55 && var62 < var55 + 8) {
                                                                        int var66 = var61 & 0x7;
                                                                        int var67 = var62 & 0x7;
                                                                        int var69 = var46 & 0x3;
                                                                        int var70;
                                                                        if (var69 == 0) {
                                                                            var70 = var66;
                                                                        } else if (var69 == 1) {
                                                                            var70 = var67;
                                                                        } else if (var69 == 2) {
                                                                            var70 = 7 - var66;
                                                                        } else {
                                                                            var70 = 7 - var67;
                                                                        }
                                                                        class6.method1857(var59, var40, var52 + var70, var53 + class156.method2495(var61 & 0x7, var62 & 0x7, var46), 0, 0, var46);
                                                                    } else {
                                                                        class6.method1857(var59, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var43 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var43) {
                                                class6.method538(var40, var41 * 8, var42 * 8);
                                            }
                                        }
                                    }
                                    var40++;
                                }
                            }
                            method164(true);
                            method5();
                            method1759();
                            class79 var84 = Statics.field199;
                            class198[] var85 = field418;
                            for (int var86 = 0; var86 < 4; var86++) {
                                for (int var87 = 0; var87 < 104; var87++) {
                                    for (int var88 = 0; var88 < 104; var88++) {
                                        if ((class6.field66[var86][var87][var88] & 0x1) == 1) {
                                            int var89 = var86;
                                            if ((class6.field66[1][var87][var88] & 0x2) == 2) {
                                                var89 = var86 - 1;
                                            }
                                            if (var89 >= 0) {
                                                var85[var89].method3478(var87, var88);
                                            }
                                        }
                                    }
                                }
                            }
                            class6.field77 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field77 < -8) {
                                class6.field77 = -8;
                            }
                            if (class6.field77 > 8) {
                                class6.field77 = 8;
                            }
                            class6.field80 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field80 < -16) {
                                class6.field80 = -16;
                            }
                            if (class6.field80 > 16) {
                                class6.field80 = 16;
                            }
                            for (int var90 = 0; var90 < 4; var90++) {
                                byte[][] var91 = Statics.field2889[var90];
                                int var92 = (int) Math.sqrt(5100.0D);
                                int var93 = var92 * 768 >> 8;
                                for (int var94 = 1; var94 < 103; var94++) {
                                    for (int var95 = 1; var95 < 103; var95++) {
                                        int var96 = class6.field65[var90][var95 + 1][var94] - class6.field65[var90][var95 - 1][var94];
                                        int var97 = class6.field65[var90][var95][var94 + 1] - class6.field65[var90][var95][var94 - 1];
                                        int var98 = (int) Math.sqrt((double) (var97 * var97 + var96 * var96 + 65536));
                                        int var99 = (var96 << 8) / var98;
                                        int var100 = 65536 / var98;
                                        int var101 = (var97 << 8) / var98;
                                        int var102 = (var101 * -50 + var99 * -50 + var100 * -10) / var93 + 96;
                                        int var103 = (var91[var95][var94] >> 1) + (var91[var95][var94 + 1] >> 3) + (var91[var95][var94 - 1] >> 2) + (var91[var95 - 1][var94] >> 2) + (var91[var95 + 1][var94] >> 3);
                                        Statics.field975[var95][var94] = var102 - var103;
                                    }
                                }
                                for (int var104 = 0; var104 < 104; var104++) {
                                    Statics.field71[var104] = 0;
                                    Statics.field1111[var104] = 0;
                                    Statics.field190[var104] = 0;
                                    Statics.field181[var104] = 0;
                                    Statics.field1851[var104] = 0;
                                }
                                for (int var105 = -5; var105 < 109; var105++) {
                                    for (int var106 = 0; var106 < 104; var106++) {
                                        int var107 = var105 + 5;
                                        if (var107 >= 0 && var107 < 104) {
                                            int var108 = Statics.field67[var90][var107][var106] & 0xFF;
                                            if (var108 > 0) {
                                                int var109 = var108 - 1;
                                                class37 var110 = (class37) class37.field881.method3130((long) var109);
                                                class37 var111;
                                                if (var110 == null) {
                                                    byte[] var112 = Statics.field893.method2667(1, var109);
                                                    class37 var113 = new class37();
                                                    if (var112 != null) {
                                                        var113.method691(new class107(var112), var109);
                                                    }
                                                    var113.method690();
                                                    class37.field881.method3126(var113, (long) var109);
                                                    var111 = var113;
                                                } else {
                                                    var111 = var110;
                                                }
                                                Statics.field71[var106] += var111.field884;
                                                Statics.field1111[var106] += var111.field885;
                                                Statics.field190[var106] += var111.field886;
                                                Statics.field181[var106] += var111.field887;
                                                var10002 = Statics.field1851[var106]++;
                                            }
                                        }
                                        int var115 = var105 - 5;
                                        if (var115 >= 0 && var115 < 104) {
                                            int var116 = Statics.field67[var90][var115][var106] & 0xFF;
                                            if (var116 > 0) {
                                                int var117 = var116 - 1;
                                                class37 var118 = (class37) class37.field881.method3130((long) var117);
                                                class37 var119;
                                                if (var118 == null) {
                                                    byte[] var120 = Statics.field893.method2667(1, var117);
                                                    class37 var121 = new class37();
                                                    if (var120 != null) {
                                                        var121.method691(new class107(var120), var117);
                                                    }
                                                    var121.method690();
                                                    class37.field881.method3126(var121, (long) var117);
                                                    var119 = var121;
                                                } else {
                                                    var119 = var118;
                                                }
                                                Statics.field71[var106] -= var119.field884;
                                                Statics.field1111[var106] -= var119.field885;
                                                Statics.field190[var106] -= var119.field886;
                                                Statics.field181[var106] -= var119.field887;
                                                var10002 = Statics.field1851[var106]--;
                                            }
                                        }
                                    }
                                    if (var105 >= 1 && var105 < 103) {
                                        int var123 = 0;
                                        int var124 = 0;
                                        int var125 = 0;
                                        int var126 = 0;
                                        int var127 = 0;
                                        for (int var128 = -5; var128 < 109; var128++) {
                                            int var129 = var128 + 5;
                                            if (var129 >= 0 && var129 < 104) {
                                                var123 += Statics.field71[var129];
                                                var124 += Statics.field1111[var129];
                                                var125 += Statics.field190[var129];
                                                var126 += Statics.field181[var129];
                                                var127 += Statics.field1851[var129];
                                            }
                                            int var130 = var128 - 5;
                                            if (var130 >= 0 && var130 < 104) {
                                                var123 -= Statics.field71[var130];
                                                var124 -= Statics.field1111[var130];
                                                var125 -= Statics.field190[var130];
                                                var126 -= Statics.field181[var130];
                                                var127 -= Statics.field1851[var130];
                                            }
                                            if (var128 >= 1 && var128 < 103 && (!field403 || (class6.field66[0][var105][var128] & 0x2) != 0 || (class6.field66[var90][var105][var128] & 0x10) == 0 && class6.method147(var90, var105, var128) == field296)) {
                                                if (var90 < class6.field81) {
                                                    class6.field81 = var90;
                                                }
                                                int var131 = Statics.field67[var90][var105][var128] & 0xFF;
                                                int var132 = Statics.field69[var90][var105][var128] & 0xFF;
                                                if (var131 > 0 || var132 > 0) {
                                                    int var133 = class6.field65[var90][var105][var128];
                                                    int var134 = class6.field65[var90][var105 + 1][var128];
                                                    int var135 = class6.field65[var90][var105 + 1][var128 + 1];
                                                    int var136 = class6.field65[var90][var105][var128 + 1];
                                                    int var137 = Statics.field975[var105][var128];
                                                    int var138 = Statics.field975[var105 + 1][var128];
                                                    int var139 = Statics.field975[var105 + 1][var128 + 1];
                                                    int var140 = Statics.field975[var105][var128 + 1];
                                                    int var141 = -1;
                                                    int var142 = -1;
                                                    if (var131 > 0) {
                                                        int var143 = var123 * 256 / var126;
                                                        int var144 = var124 / var127;
                                                        int var145 = var125 / var127;
                                                        var141 = class6.method495(var143, var144, var145);
                                                        int var146 = class6.field77 + var143 & 0xFF;
                                                        int var147 = class6.field80 + var145;
                                                        if (var147 < 0) {
                                                            var147 = 0;
                                                        } else if (var147 > 255) {
                                                            var147 = 255;
                                                        }
                                                        var142 = class6.method495(var146, var144, var147);
                                                    }
                                                    if (var90 > 0) {
                                                        boolean var148 = true;
                                                        if (var131 == 0 && Statics.field2876[var90][var105][var128] != 0) {
                                                            var148 = false;
                                                        }
                                                        if (var132 > 0 && !class41.method1062(var132 - 1).field956) {
                                                            var148 = false;
                                                        }
                                                        if (var148 && var133 == var134 && var133 == var135 && var133 == var136) {
                                                            Statics.field72[var90][var105][var128] |= 0x924;
                                                        }
                                                    }
                                                    int var149 = 0;
                                                    if (var142 != -1) {
                                                        var149 = class84.field1469[class6.method2422(var142, 96)];
                                                    }
                                                    if (var132 == 0) {
                                                        var84.method1613(var90, var105, var128, 0, 0, -1, var133, var134, var135, var136, class6.method2422(var141, var137), class6.method2422(var141, var138), class6.method2422(var141, var139), class6.method2422(var141, var140), 0, 0, 0, 0, var149, 0);
                                                    } else {
                                                        int var150 = Statics.field2876[var90][var105][var128] + 1;
                                                        byte var151 = Statics.field70[var90][var105][var128];
                                                        class41 var152 = class41.method1062(var132 - 1);
                                                        int var153 = var152.field958;
                                                        int var154;
                                                        int var155;
                                                        if (var153 >= 0) {
                                                            var154 = Statics.field1480.method1833(var153);
                                                            var155 = -1;
                                                        } else if (var152.field957 == 16711935) {
                                                            var155 = -2;
                                                            var153 = -1;
                                                            var154 = -2;
                                                        } else {
                                                            var155 = class6.method495(var152.field965, var152.field962, var152.field963);
                                                            int var156 = class6.field77 + var152.field965 & 0xFF;
                                                            int var157 = class6.field80 + var152.field963;
                                                            if (var157 < 0) {
                                                                var157 = 0;
                                                            } else if (var157 > 255) {
                                                                var157 = 255;
                                                            }
                                                            var154 = class6.method495(var156, var152.field962, var157);
                                                        }
                                                        int var158 = 0;
                                                        if (var154 != -2) {
                                                            var158 = class84.field1469[class6.method1327(var154, 96)];
                                                        }
                                                        if (var152.field960 != -1) {
                                                            int var159 = class6.field77 + var152.field964 & 0xFF;
                                                            int var160 = class6.field80 + var152.field966;
                                                            if (var160 < 0) {
                                                                var160 = 0;
                                                            } else if (var160 > 255) {
                                                                var160 = 255;
                                                            }
                                                            int var161 = class6.method495(var159, var152.field955, var160);
                                                            var158 = class84.field1469[class6.method1327(var161, 96)];
                                                        }
                                                        var84.method1613(var90, var105, var128, var150, var151, var153, var133, var134, var135, var136, class6.method2422(var141, var137), class6.method2422(var141, var138), class6.method2422(var141, var139), class6.method2422(var141, var140), class6.method1327(var155, var137), class6.method1327(var155, var138), class6.method1327(var155, var139), class6.method1327(var155, var140), var149, var158);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var162 = 1; var162 < 103; var162++) {
                                    for (int var163 = 1; var163 < 103; var163++) {
                                        var84.method1612(var90, var163, var162, class6.method147(var90, var163, var162));
                                    }
                                }
                                Statics.field67[var90] = (byte[][]) null;
                                Statics.field69[var90] = (byte[][]) null;
                                Statics.field2876[var90] = (byte[][]) null;
                                Statics.field70[var90] = (byte[][]) null;
                                Statics.field2889[var90] = (byte[][]) null;
                            }
                            var84.method1636(-50, -10, -50);
                            for (int var164 = 0; var164 < 104; var164++) {
                                for (int var165 = 0; var165 < 104; var165++) {
                                    if ((class6.field66[1][var164][var165] & 0x2) == 2) {
                                        var84.method1661(var164, var165);
                                    }
                                }
                            }
                            int var166 = 1;
                            int var167 = 2;
                            int var168 = 4;
                            for (int var169 = 0; var169 < 4; var169++) {
                                if (var169 > 0) {
                                    var166 <<= 0x3;
                                    var167 <<= 0x3;
                                    var168 <<= 0x3;
                                }
                                for (int var170 = 0; var170 <= var169; var170++) {
                                    for (int var171 = 0; var171 <= 104; var171++) {
                                        for (int var172 = 0; var172 <= 104; var172++) {
                                            if ((Statics.field72[var170][var172][var171] & var166) != 0) {
                                                int var173 = var171;
                                                int var174 = var171;
                                                int var175 = var170;
                                                int var176 = var170;
                                                while (var173 > 0 && (Statics.field72[var170][var172][var173 - 1] & var166) != 0) {
                                                    var173--;
                                                }
                                                while (var174 < 104 && (Statics.field72[var170][var172][var174 + 1] & var166) != 0) {
                                                    var174++;
                                                }
                                                label1536: while (var175 > 0) {
                                                    for (int var177 = var173; var177 <= var174; var177++) {
                                                        if ((Statics.field72[var175 - 1][var172][var177] & var166) == 0) {
                                                            break label1536;
                                                        }
                                                    }
                                                    var175--;
                                                }
                                                label1525: while (var176 < var169) {
                                                    for (int var178 = var173; var178 <= var174; var178++) {
                                                        if ((Statics.field72[var176 + 1][var172][var178] & var166) == 0) {
                                                            break label1525;
                                                        }
                                                    }
                                                    var176++;
                                                }
                                                int var179 = (var176 + 1 - var175) * (var174 - var173 + 1);
                                                if (var179 >= 8) {
                                                    short var180 = 240;
                                                    int var181 = class6.field65[var176][var172][var173] - var180;
                                                    int var182 = class6.field65[var175][var172][var173];
                                                    class79.method1611(var169, 1, var172 * 128, var172 * 128, var173 * 128, var174 * 128 + 128, var181, var182);
                                                    for (int var183 = var175; var183 <= var176; var183++) {
                                                        for (int var184 = var173; var184 <= var174; var184++) {
                                                            Statics.field72[var183][var172][var184] &= ~var166;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field72[var170][var172][var171] & var167) != 0) {
                                                int var185 = var172;
                                                int var186 = var172;
                                                int var187 = var170;
                                                int var188 = var170;
                                                while (var185 > 0 && (Statics.field72[var170][var185 - 1][var171] & var167) != 0) {
                                                    var185--;
                                                }
                                                while (var186 < 104 && (Statics.field72[var170][var186 + 1][var171] & var167) != 0) {
                                                    var186++;
                                                }
                                                label1589: while (var187 > 0) {
                                                    for (int var189 = var185; var189 <= var186; var189++) {
                                                        if ((Statics.field72[var187 - 1][var189][var171] & var167) == 0) {
                                                            break label1589;
                                                        }
                                                    }
                                                    var187--;
                                                }
                                                label1578: while (var188 < var169) {
                                                    for (int var190 = var185; var190 <= var186; var190++) {
                                                        if ((Statics.field72[var188 + 1][var190][var171] & var167) == 0) {
                                                            break label1578;
                                                        }
                                                    }
                                                    var188++;
                                                }
                                                int var191 = (var188 + 1 - var187) * (var186 - var185 + 1);
                                                if (var191 >= 8) {
                                                    short var192 = 240;
                                                    int var193 = class6.field65[var188][var185][var171] - var192;
                                                    int var194 = class6.field65[var187][var185][var171];
                                                    class79.method1611(var169, 2, var185 * 128, var186 * 128 + 128, var171 * 128, var171 * 128, var193, var194);
                                                    for (int var195 = var187; var195 <= var188; var195++) {
                                                        for (int var196 = var185; var196 <= var186; var196++) {
                                                            Statics.field72[var195][var196][var171] &= ~var167;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field72[var170][var172][var171] & var168) != 0) {
                                                int var197 = var172;
                                                int var198 = var172;
                                                int var199 = var171;
                                                int var200 = var171;
                                                while (var199 > 0 && (Statics.field72[var170][var172][var199 - 1] & var168) != 0) {
                                                    var199--;
                                                }
                                                while (var200 < 104 && (Statics.field72[var170][var172][var200 + 1] & var168) != 0) {
                                                    var200++;
                                                }
                                                label1642: while (var197 > 0) {
                                                    for (int var201 = var199; var201 <= var200; var201++) {
                                                        if ((Statics.field72[var170][var197 - 1][var201] & var168) == 0) {
                                                            break label1642;
                                                        }
                                                    }
                                                    var197--;
                                                }
                                                label1631: while (var198 < 104) {
                                                    for (int var202 = var199; var202 <= var200; var202++) {
                                                        if ((Statics.field72[var170][var198 + 1][var202] & var168) == 0) {
                                                            break label1631;
                                                        }
                                                    }
                                                    var198++;
                                                }
                                                if ((var198 - var197 + 1) * (var200 - var199 + 1) >= 4) {
                                                    int var203 = class6.field65[var170][var197][var199];
                                                    class79.method1611(var169, 4, var197 * 128, var198 * 128 + 128, var199 * 128, var200 * 128 + 128, var203, var203);
                                                    for (int var204 = var197; var204 <= var198; var204++) {
                                                        for (int var205 = var199; var205 <= var200; var205++) {
                                                            Statics.field72[var170][var204][var205] &= ~var168;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method164(true);
                            int var206 = class6.field81;
                            if (var206 > Statics.field59) {
                                var206 = Statics.field59;
                            }
                            if (var206 < Statics.field59 - 1) {
                                int var207 = Statics.field59 - 1;
                            }
                            if (field403) {
                                Statics.field199.method1609(class6.field81);
                            } else {
                                Statics.field199.method1609(0);
                            }
                            for (int var208 = 0; var208 < 104; var208++) {
                                for (int var209 = 0; var209 < 104; var209++) {
                                    method2386(var208, var209);
                                }
                            }
                            method1759();
                            method2506();
                            class36.field832.method3127();
                            if (Statics.field639 != null) {
                                field361.method2334(254);
                                field361.method2253(1057001181);
                            }
                            if (!field303) {
                                int var210 = (Statics.field606 - 6) / 8;
                                int var211 = (Statics.field606 + 6) / 8;
                                int var212 = (Statics.field164 - 6) / 8;
                                int var213 = (Statics.field164 + 6) / 8;
                                for (int var214 = var210 - 1; var214 <= var211 + 1; var214++) {
                                    for (int var215 = var212 - 1; var215 <= var213 + 1; var215++) {
                                        if (var214 < var210 || var214 > var211 || var215 < var212 || var215 > var213) {
                                            Statics.field1278.method2687("m" + var214 + "_" + var215);
                                            Statics.field1278.method2687("l" + var214 + "_" + var215);
                                        }
                                    }
                                }
                            }
                            method2320(30);
                            method1759();
                            Statics.field67 = (byte[][][]) null;
                            Statics.field69 = (byte[][][]) null;
                            Statics.field2876 = (byte[][][]) null;
                            Statics.field70 = (byte[][][]) null;
                            Statics.field72 = (int[][][]) null;
                            Statics.field2889 = (byte[][][]) null;
                            Statics.field975 = (int[][]) null;
                            Statics.field71 = null;
                            Statics.field1111 = null;
                            Statics.field190 = null;
                            Statics.field181 = null;
                            Statics.field1851 = null;
                            field361.method2334(146);
                            Statics.field783.method2419();
                            for (int var216 = 0; var216 < 32; var216++) {
                                field2039[var216] = 0L;
                            }
                            for (int var217 = 0; var217 < 32; var217++) {
                                field2040[var217] = 0L;
                            }
                            Statics.field129 = 0;
                        } else {
                            field301 = 2;
                        }
                    } else {
                        field301 = 1;
                    }
                }
                if (field495 == 30) {
                    if (field258 > 1) {
                        field258--;
                    }
                    if (field290 > 0) {
                        field290--;
                    }
                    if (field499) {
                        field499 = false;
                        method581();
                    } else {
                        if (!field466) {
                            field391[0] = class143.field2376;
                            field366[0] = "";
                            field299[0] = 1006;
                            field494 = 1;
                        }
                        for (int var218 = 0; var218 < 100 && method767(); var218++) {
                        }
                        if (field495 == 30) {
                            while (true) {
                                class189 var219 = (class189) class190.field2888.method3227();
                                boolean var220;
                                if (var219 == null) {
                                    var220 = false;
                                } else {
                                    var220 = true;
                                }
                                if (!var220) {
                                    Object var222 = Statics.field571.field160;
                                    synchronized (Statics.field571.field160) {
                                        if (!field425) {
                                            Statics.field571.field161 = 0;
                                        } else if (class127.field1997 != 0 || Statics.field571.field161 >= 40) {
                                            field361.method2334(37);
                                            field361.method2087(0);
                                            int var223 = field361.field1835;
                                            int var224 = 0;
                                            for (int var225 = 0; var225 < Statics.field571.field161 && field361.field1835 - var223 < 240; var225++) {
                                                var224++;
                                                int var226 = Statics.field571.field163[var225];
                                                if (var226 < 0) {
                                                    var226 = 0;
                                                } else if (var226 > 502) {
                                                    var226 = 502;
                                                }
                                                int var227 = Statics.field571.field171[var225];
                                                if (var227 < 0) {
                                                    var227 = 0;
                                                } else if (var227 > 764) {
                                                    var227 = 764;
                                                }
                                                int var228 = var226 * 765 + var227;
                                                if (Statics.field571.field163[var225] == -1 && Statics.field571.field171[var225] == -1) {
                                                    var227 = -1;
                                                    var226 = -1;
                                                    var228 = 524287;
                                                }
                                                if (field253 != var227 || field254 != var226) {
                                                    int var229 = var227 - field253;
                                                    field253 = var227;
                                                    int var230 = var226 - field254;
                                                    field254 = var226;
                                                    if (field473 < 8 && var229 >= -32 && var229 <= 31 && var230 >= -32 && var230 <= 31) {
                                                        var229 += 32;
                                                        var230 += 32;
                                                        field361.method2088((field473 << 12) + (var229 << 6) + var230);
                                                        field473 = 0;
                                                    } else if (field473 < 8) {
                                                        field361.method2089((field473 << 19) + 8388608 + var228);
                                                        field473 = 0;
                                                    } else {
                                                        field361.method2253((field473 << 19) + -1073741824 + var228);
                                                        field473 = 0;
                                                    }
                                                } else if (field473 < 2047) {
                                                    field473++;
                                                }
                                            }
                                            field361.method2170(field361.field1835 - var223);
                                            if (var224 >= Statics.field571.field161) {
                                                Statics.field571.field161 = 0;
                                            } else {
                                                Statics.field571.field161 -= var224;
                                                for (int var231 = 0; var231 < Statics.field571.field161; var231++) {
                                                    Statics.field571.field171[var231] = Statics.field571.field171[var224 + var231];
                                                    Statics.field571.field163[var231] = Statics.field571.field163[var224 + var231];
                                                }
                                            }
                                        }
                                    }
                                    if (class127.field1997 == 1 || !Statics.field2473 && class127.field1997 == 4 || class127.field1997 == 2) {
                                        long var233 = (class127.field2003 - field332 * -1L) / 50L;
                                        if (var233 > 4095L) {
                                            var233 = 4095L;
                                        }
                                        field332 = class127.field2003 * -1L;
                                        int var235 = class127.field1999;
                                        if (var235 < 0) {
                                            var235 = 0;
                                        } else if (var235 > 502) {
                                            var235 = 502;
                                        }
                                        int var236 = class127.field1998;
                                        if (var236 < 0) {
                                            var236 = 0;
                                        } else if (var236 > 764) {
                                            var236 = 764;
                                        }
                                        int var237 = var235 * 765 + var236;
                                        byte var238 = 0;
                                        if (class127.field1997 == 2) {
                                            var238 = 1;
                                        }
                                        int var239 = (int) var233;
                                        field361.method2334(230);
                                        field361.method2253((var238 << 19) + (var239 << 20) + var237);
                                    }
                                    if (class124.field1950 > 0) {
                                        field361.method2334(7);
                                        field361.method2088(0);
                                        int var240 = field361.field1835;
                                        long var241 = class103.method494();
                                        for (int var243 = 0; var243 < class124.field1950; var243++) {
                                            long var244 = var241 - field385;
                                            if (var244 > 16777215L) {
                                                var244 = 16777215L;
                                            }
                                            field385 = var241;
                                            field361.method2132(class124.field1963[var243]);
                                            field361.method2089((int) var244);
                                        }
                                        field361.method2097(field361.field1835 - var240);
                                    }
                                    if (field389 > 0) {
                                        field389--;
                                    }
                                    if (class124.field1957[96] || class124.field1957[97] || class124.field1957[98] || class124.field1957[99]) {
                                        field333 = true;
                                    }
                                    if (field333 && field389 <= 0) {
                                        field389 = 20;
                                        field333 = false;
                                        field361.method2334(220);
                                        field361.method2284(field291);
                                        field361.method2133(field478);
                                    }
                                    if (Statics.field1906 && !field275) {
                                        field275 = true;
                                        field361.method2334(98);
                                        field361.method2087(1);
                                    }
                                    if (!Statics.field1906 && field275) {
                                        field275 = false;
                                        field361.method2334(98);
                                        field361.method2087(0);
                                    }
                                    Statics.method2387();
                                    if (field495 == 30) {
                                        method2775();
                                        method575();
                                        field288++;
                                        if (field288 > 750) {
                                            method581();
                                        } else {
                                            for (int var246 = -1; var246 < field259; var246++) {
                                                int var247;
                                                if (var246 == -1) {
                                                    var247 = 2047;
                                                } else {
                                                    var247 = field364[var246];
                                                }
                                                class3 var248 = field386[var247];
                                                if (var248 != null) {
                                                    method535(var248, 1);
                                                }
                                            }
                                            method78();
                                            for (int var249 = -1; var249 < field259; var249++) {
                                                int var250;
                                                if (var249 == -1) {
                                                    var250 = 2047;
                                                } else {
                                                    var250 = field364[var249];
                                                }
                                                class3 var251 = field386[var250];
                                                if (var251 != null && var251.field736 > 0) {
                                                    var251.field736--;
                                                    if (var251.field736 == 0) {
                                                        var251.field748 = null;
                                                    }
                                                }
                                            }
                                            for (int var252 = 0; var252 < field357; var252++) {
                                                int var253 = field281[var252];
                                                class30 var254 = field279[var253];
                                                if (var254 != null && var254.field736 > 0) {
                                                    var254.field736--;
                                                    if (var254.field736 == 0) {
                                                        var254.field748 = null;
                                                    }
                                                }
                                            }
                                            field280++;
                                            if (field352 != 0) {
                                                field420 += 20;
                                                if (field420 >= 400) {
                                                    field352 = 0;
                                                }
                                            }
                                            if (Statics.field1855 != null) {
                                                field353++;
                                                if (field353 >= 15) {
                                                    method1839(Statics.field1855);
                                                    Statics.field1855 = null;
                                                }
                                            }
                                            class153 var255 = Statics.field194;
                                            class153 var256 = Statics.field395;
                                            Statics.field194 = null;
                                            Statics.field395 = null;
                                            field421 = null;
                                            field239 = false;
                                            field422 = false;
                                            field463 = 0;
                                            while (true) {
                                                while (class124.method2379() && field463 < 128) {
                                                    if (field412 >= 2 && class124.field1957[82] && Statics.field691 == 66) {
                                                        String var257 = "";
                                                        Iterator var258 = class10.field133.iterator();
                                                        while (var258.hasNext()) {
                                                            class31 var259 = (class31) var258.next();
                                                            var257 = var257 + var259.field695 + ':' + var259.field692 + '\n';
                                                        }
                                                        Statics.field683.setContents(new StringSelection(var257), (ClipboardOwner) null);
                                                    } else {
                                                        field465[field463] = Statics.field691;
                                                        field464[field463] = Statics.field514;
                                                        field463++;
                                                    }
                                                }
                                                int var262 = field405;
                                                if (class153.method2045(var262)) {
                                                    Statics.method467(Statics.field2590[var262], -1, 0, 0, 765, 503, 0, 0);
                                                }
                                                field429++;
                                                while (true) {
                                                    class1 var263;
                                                    class153 var264;
                                                    class153 var265;
                                                    do {
                                                        var263 = (class1) field489.method3195();
                                                        if (var263 == null) {
                                                            while (true) {
                                                                class1 var266;
                                                                class153 var267;
                                                                class153 var268;
                                                                do {
                                                                    var266 = (class1) field445.method3195();
                                                                    if (var266 == null) {
                                                                        while (true) {
                                                                            class1 var269;
                                                                            class153 var270;
                                                                            class153 var271;
                                                                            do {
                                                                                var269 = (class1) field443.method3195();
                                                                                if (var269 == null) {
                                                                                    method1331();
                                                                                    if (field417 != null) {
                                                                                        method1839(field417);
                                                                                        Statics.field950++;
                                                                                        if (field239 && field422) {
                                                                                            int var272 = class127.field1992;
                                                                                            int var273 = class127.field1988;
                                                                                            int var274 = var272 - field328;
                                                                                            int var275 = var273 - field302;
                                                                                            if (var274 < field423) {
                                                                                                var274 = field423;
                                                                                            }
                                                                                            if (field417.field2544 + var274 > field423 + field313.field2544) {
                                                                                                var274 = field423 + field313.field2544 - field417.field2544;
                                                                                            }
                                                                                            if (var275 < field424) {
                                                                                                var275 = field424;
                                                                                            }
                                                                                            if (field417.field2545 + var275 > field424 + field313.field2545) {
                                                                                                var275 = field424 + field313.field2545 - field417.field2545;
                                                                                            }
                                                                                            int var276 = var274 - field426;
                                                                                            int var277 = var275 - field427;
                                                                                            int var278 = field417.field2526;
                                                                                            if (Statics.field950 > field417.field2599 && (var276 > var278 || var276 < -var278 || var277 > var278 || var277 < -var278)) {
                                                                                                field440 = true;
                                                                                            }
                                                                                            int var279 = field313.field2548 + (var274 - field423);
                                                                                            int var280 = field313.field2549 + (var275 - field424);
                                                                                            if (field417.field2611 != null && field440) {
                                                                                                class1 var281 = new class1();
                                                                                                var281.field12 = field417;
                                                                                                var281.field5 = var279;
                                                                                                var281.field3 = var280;
                                                                                                var281.field14 = field417.field2611;
                                                                                                class32.method572(var281);
                                                                                            }
                                                                                            if (class127.field1985 == 0) {
                                                                                                if (field440) {
                                                                                                    if (field417.field2627 != null) {
                                                                                                        class1 var282 = new class1();
                                                                                                        var282.field12 = field417;
                                                                                                        var282.field5 = var279;
                                                                                                        var282.field3 = var280;
                                                                                                        var282.field7 = field421;
                                                                                                        var282.field14 = field417.field2627;
                                                                                                        class32.method572(var282);
                                                                                                    }
                                                                                                    if (field421 != null && method142(field417) != null) {
                                                                                                        field361.method2334(95);
                                                                                                        field361.method2284(field417.field2639);
                                                                                                        field361.method2209(field417.field2638);
                                                                                                        field361.method2140(field417.field2535);
                                                                                                        field361.method2139(field421.field2535);
                                                                                                        field361.method2209(field421.field2639);
                                                                                                        field361.method2133(field421.field2638);
                                                                                                    }
                                                                                                } else if ((field384 == 1 || method2466(field494 - 1)) && field494 > 2) {
                                                                                                    method1323(field426 + field328, field427 + field302);
                                                                                                } else if (field494 > 0) {
                                                                                                    int var283 = field426 + field328;
                                                                                                    int var284 = field427 + field302;
                                                                                                    method512(Statics.field699, var283, var284);
                                                                                                    Statics.field699 = null;
                                                                                                }
                                                                                                field417 = null;
                                                                                            }
                                                                                        } else if (Statics.field950 > 1) {
                                                                                            field417 = null;
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field237 != null) {
                                                                                        method1839(Statics.field237);
                                                                                        field360++;
                                                                                        if (class127.field1985 == 0) {
                                                                                            if (field396) {
                                                                                                if (Statics.field237 == Statics.field112 && field358 != field355) {
                                                                                                    class153 var285 = Statics.field237;
                                                                                                    byte var286 = 0;
                                                                                                    if (field408 == 1 && var285.field2539 == 206) {
                                                                                                        var286 = 1;
                                                                                                    }
                                                                                                    if (var285.field2566[field358] <= 0) {
                                                                                                        var286 = 0;
                                                                                                    }
                                                                                                    int var287 = method3000(var285);
                                                                                                    boolean var288 = (var287 >> 29 & 0x1) != 0;
                                                                                                    if (var288) {
                                                                                                        int var289 = field355;
                                                                                                        int var290 = field358;
                                                                                                        var285.field2566[var290] = var285.field2566[var289];
                                                                                                        var285.field2643[var290] = var285.field2643[var289];
                                                                                                        var285.field2566[var289] = -1;
                                                                                                        var285.field2643[var289] = 0;
                                                                                                    } else if (var286 == 1) {
                                                                                                        int var291 = field355;
                                                                                                        int var292 = field358;
                                                                                                        while (var291 != var292) {
                                                                                                            if (var291 > var292) {
                                                                                                                var285.method2824(var291 - 1, var291);
                                                                                                                var291--;
                                                                                                            } else if (var291 < var292) {
                                                                                                                var285.method2824(var291 + 1, var291);
                                                                                                                var291++;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        var285.method2824(field358, field355);
                                                                                                    }
                                                                                                    field361.method2334(78);
                                                                                                    field361.method2133(field358);
                                                                                                    field361.method2088(field355);
                                                                                                    field361.method2253(Statics.field237.field2535);
                                                                                                    field361.method2122(var286);
                                                                                                }
                                                                                            } else if ((field384 == 1 || method2466(field494 - 1)) && field494 > 2) {
                                                                                                method1323(field493, field476);
                                                                                            } else if (field494 > 0) {
                                                                                                int var293 = field493;
                                                                                                int var294 = field476;
                                                                                                method512(Statics.field699, var293, var294);
                                                                                                Statics.field699 = null;
                                                                                            }
                                                                                            field353 = 10;
                                                                                            class127.field1997 = 0;
                                                                                            Statics.field237 = null;
                                                                                        } else if (field360 >= 5 && (class127.field1992 > field493 + 5 || class127.field1992 < field493 - 5 || class127.field1988 > field476 + 5 || class127.field1988 < field476 - 5)) {
                                                                                            field396 = true;
                                                                                        }
                                                                                    }
                                                                                    if (class79.field1391 != -1) {
                                                                                        int var295 = class79.field1391;
                                                                                        int var296 = class79.field1359;
                                                                                        field361.method2334(200);
                                                                                        field361.method2087(5);
                                                                                        field361.method2197(class124.field1957[82] ? (class124.field1957[81] ? 2 : 1) : 0);
                                                                                        field361.method2088(Statics.field2103 + var295);
                                                                                        field361.method2209(Statics.field88 + var296);
                                                                                        class79.field1391 = -1;
                                                                                        field349 = class127.field1998;
                                                                                        field350 = class127.field1999;
                                                                                        field352 = 1;
                                                                                        field420 = 0;
                                                                                        field256 = var295;
                                                                                        field475 = var296;
                                                                                    }
                                                                                    if (Statics.field194 != var255) {
                                                                                        if (var255 != null) {
                                                                                            method1839(var255);
                                                                                        }
                                                                                        if (Statics.field194 != null) {
                                                                                            method1839(Statics.field194);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field395 != var256 && field397 == field342) {
                                                                                        if (var256 != null) {
                                                                                            method1839(var256);
                                                                                        }
                                                                                        if (Statics.field395 != null) {
                                                                                            method1839(Statics.field395);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field395 == null) {
                                                                                        if (field342 > 0) {
                                                                                            field342--;
                                                                                        }
                                                                                    } else if (field342 < field397) {
                                                                                        field342++;
                                                                                        if (field397 == field342) {
                                                                                            method1839(Statics.field395);
                                                                                        }
                                                                                    }
                                                                                    method1606();
                                                                                    if (field488) {
                                                                                        int var297 = Statics.field878 * 128 + 64;
                                                                                        int var298 = Statics.field630 * 128 + 64;
                                                                                        int var299 = method79(var297, var298, Statics.field59) - Statics.field524;
                                                                                        if (Statics.field226 < var297) {
                                                                                            Statics.field226 += Statics.field2813 * (var297 - Statics.field226) / 1000 + Statics.field2008;
                                                                                            if (Statics.field226 > var297) {
                                                                                                Statics.field226 = var297;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field226 > var297) {
                                                                                            Statics.field226 -= Statics.field2813 * (Statics.field226 - var297) / 1000 + Statics.field2008;
                                                                                            if (Statics.field226 < var297) {
                                                                                                Statics.field226 = var297;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field223 < var299) {
                                                                                            Statics.field223 += Statics.field2813 * (var299 - Statics.field223) / 1000 + Statics.field2008;
                                                                                            if (Statics.field223 > var299) {
                                                                                                Statics.field223 = var299;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field223 > var299) {
                                                                                            Statics.field223 -= Statics.field2813 * (Statics.field223 - var299) / 1000 + Statics.field2008;
                                                                                            if (Statics.field223 < var299) {
                                                                                                Statics.field223 = var299;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field167 < var298) {
                                                                                            Statics.field167 += Statics.field2813 * (var298 - Statics.field167) / 1000 + Statics.field2008;
                                                                                            if (Statics.field167 > var298) {
                                                                                                Statics.field167 = var298;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field167 > var298) {
                                                                                            Statics.field167 -= Statics.field2813 * (Statics.field167 - var298) / 1000 + Statics.field2008;
                                                                                            if (Statics.field167 < var298) {
                                                                                                Statics.field167 = var298;
                                                                                            }
                                                                                        }
                                                                                        int var300 = Statics.field2653 * 128 + 64;
                                                                                        int var301 = Statics.field522 * 128 + 64;
                                                                                        int var302 = method79(var300, var301, Statics.field59) - Statics.field1824;
                                                                                        int var303 = var300 - Statics.field226;
                                                                                        int var304 = var302 - Statics.field223;
                                                                                        int var305 = var301 - Statics.field167;
                                                                                        int var306 = (int) Math.sqrt((double) (var303 * var303 + var305 * var305));
                                                                                        int var307 = (int) (Math.atan2((double) var304, (double) var306) * 325.949D) & 0x7FF;
                                                                                        int var308 = (int) (Math.atan2((double) var303, (double) var305) * -325.949D) & 0x7FF;
                                                                                        if (var307 < 128) {
                                                                                            var307 = 128;
                                                                                        }
                                                                                        if (var307 > 383) {
                                                                                            var307 = 383;
                                                                                        }
                                                                                        if (Statics.field547 < var307) {
                                                                                            Statics.field547 += Statics.field175 * (var307 - Statics.field547) / 1000 + Statics.field1;
                                                                                            if (Statics.field547 > var307) {
                                                                                                Statics.field547 = var307;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field547 > var307) {
                                                                                            Statics.field547 -= Statics.field175 * (Statics.field547 - var307) / 1000 + Statics.field1;
                                                                                            if (Statics.field547 < var307) {
                                                                                                Statics.field547 = var307;
                                                                                            }
                                                                                        }
                                                                                        int var309 = var308 - Statics.field2393;
                                                                                        if (var309 > 1024) {
                                                                                            var309 -= 2048;
                                                                                        }
                                                                                        if (var309 < -1024) {
                                                                                            var309 += 2048;
                                                                                        }
                                                                                        if (var309 > 0) {
                                                                                            Statics.field2393 += Statics.field175 * var309 / 1000 + Statics.field1;
                                                                                            Statics.field2393 &= 0x7FF;
                                                                                        }
                                                                                        if (var309 < 0) {
                                                                                            Statics.field2393 -= Statics.field175 * -var309 / 1000 + Statics.field1;
                                                                                            Statics.field2393 &= 0x7FF;
                                                                                        }
                                                                                        int var310 = var308 - Statics.field2393;
                                                                                        if (var310 > 1024) {
                                                                                            var310 -= 2048;
                                                                                        }
                                                                                        if (var310 < -1024) {
                                                                                            var310 += 2048;
                                                                                        }
                                                                                        if (var310 < 0 && var309 > 0 || var310 > 0 && var309 < 0) {
                                                                                            Statics.field2393 = var308;
                                                                                        }
                                                                                    }
                                                                                    for (int var311 = 0; var311 < 5; var311++) {
                                                                                        var10002 = field402[var311]++;
                                                                                    }
                                                                                    int var312 = ++class127.field1986 - 1;
                                                                                    int var314 = class124.field1968;
                                                                                    if (var312 > 15000 && var314 > 15000) {
                                                                                        field290 = 250;
                                                                                        class127.method177(14500);
                                                                                        field361.method2334(204);
                                                                                    }
                                                                                    field312++;
                                                                                    if (field312 > 500) {
                                                                                        field312 = 0;
                                                                                        int var316 = (int) (Math.random() * 8.0D);
                                                                                        if ((var316 & 0x1) == 1) {
                                                                                            field306 += field307;
                                                                                        }
                                                                                        if ((var316 & 0x2) == 2) {
                                                                                            field308 += field309;
                                                                                        }
                                                                                        if ((var316 & 0x4) == 4) {
                                                                                            field310 += field311;
                                                                                        }
                                                                                    }
                                                                                    if (field306 < -50) {
                                                                                        field307 = 2;
                                                                                    }
                                                                                    if (field306 > 50) {
                                                                                        field307 = -2;
                                                                                    }
                                                                                    if (field308 < -55) {
                                                                                        field309 = 2;
                                                                                    }
                                                                                    if (field308 > 55) {
                                                                                        field309 = -2;
                                                                                    }
                                                                                    if (field310 < -40) {
                                                                                        field311 = 1;
                                                                                    }
                                                                                    if (field310 > 40) {
                                                                                        field311 = -1;
                                                                                    }
                                                                                    field262++;
                                                                                    if (field262 > 500) {
                                                                                        field262 = 0;
                                                                                        int var317 = (int) (Math.random() * 8.0D);
                                                                                        if ((var317 & 0x1) == 1) {
                                                                                            field322 += field314;
                                                                                        }
                                                                                        if ((var317 & 0x2) == 2) {
                                                                                            field243 += field316;
                                                                                        }
                                                                                    }
                                                                                    if (field322 < -60) {
                                                                                        field314 = 2;
                                                                                    }
                                                                                    if (field322 > 60) {
                                                                                        field314 = -2;
                                                                                    }
                                                                                    if (field243 < -20) {
                                                                                        field316 = 1;
                                                                                    }
                                                                                    if (field243 > 10) {
                                                                                        field316 = -1;
                                                                                    }
                                                                                    for (class34 var318 = (class34) field269.method3151(); var318 != null; var318 = (class34) field269.method3158()) {
                                                                                        if ((long) var318.field780 < class103.method494() / 1000L - 5L) {
                                                                                            if (var318.field782 > 0) {
                                                                                                class10.method100(5, "", var318.field781 + class143.field2287);
                                                                                            }
                                                                                            if (var318.field782 == 0) {
                                                                                                class10.method100(5, "", var318.field781 + class143.field2273);
                                                                                            }
                                                                                            var318.method3276();
                                                                                        }
                                                                                    }
                                                                                    field289++;
                                                                                    if (field289 > 50) {
                                                                                        field361.method2334(137);
                                                                                    }
                                                                                    try {
                                                                                        if (Statics.field436 != null && field361.field1835 > 0) {
                                                                                            Statics.field436.method2538(field361.field1839, 0, field361.field1835);
                                                                                            field361.field1835 = 0;
                                                                                            field289 = 0;
                                                                                            return;
                                                                                        }
                                                                                    } catch (IOException var320) {
                                                                                        method581();
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                var270 = var269.field12;
                                                                                if (var270.field2638 < 0) {
                                                                                    break;
                                                                                }
                                                                                var271 = class153.method2362(var270.field2578);
                                                                            } while (var271 == null || var271.field2623 == null || var270.field2638 >= var271.field2623.length || var271.field2623[var270.field2638] != var270);
                                                                            class32.method572(var269);
                                                                        }
                                                                    }
                                                                    var267 = var266.field12;
                                                                    if (var267.field2638 < 0) {
                                                                        break;
                                                                    }
                                                                    var268 = class153.method2362(var267.field2578);
                                                                } while (var268 == null || var268.field2623 == null || var267.field2638 >= var268.field2623.length || var268.field2623[var267.field2638] != var267);
                                                                class32.method572(var266);
                                                            }
                                                        }
                                                        var264 = var263.field12;
                                                        if (var264.field2638 < 0) {
                                                            break;
                                                        }
                                                        var265 = class153.method2362(var264.field2578);
                                                    } while (var265 == null || var265.field2623 == null || var264.field2638 >= var265.field2623.length || var265.field2623[var264.field2638] != var264);
                                                    class32.method572(var263);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                field361.method2334(182);
                                field361.method2087(0);
                                int var221 = field361.field1835;
                                class190.method1602(field361);
                                field361.method2170(field361.field1835 - var221);
                            }
                        }
                    }
                } else if (field495 == 40 || field495 == 45) {
                    method2643();
                }
                return;
            }
            var2.field2475.method2757(var2.field2477, (int) var2.field2873, var2.field2476, false);
        }
    }

    @ObfuscatedName("client.x(I)V")
    public final void method184() {
        boolean var1;
        label327: {
            try {
                if (class162.field2718 == 2) {
                    if (Statics.field1299 == null) {
                        Statics.field1299 = class159.method2915(Statics.field560, Statics.field2723, Statics.field2663);
                        if (Statics.field1299 == null) {
                            var1 = false;
                            break label327;
                        }
                    }
                    if (Statics.field2524 == null) {
                        Statics.field2524 = new class53(Statics.field2716, Statics.field2715);
                    }
                    if (Statics.field2522.method3099(Statics.field1299, Statics.field2721, Statics.field2524, 22050)) {
                        Statics.field2522.method3040();
                        Statics.field2522.method3004(Statics.field2719);
                        Statics.field2522.method3063(Statics.field1299, Statics.field2714);
                        class162.field2718 = 0;
                        Statics.field1299 = null;
                        Statics.field2524 = null;
                        Statics.field560 = null;
                        var1 = true;
                        break label327;
                    }
                }
            } catch (Exception var57) {
                var57.printStackTrace();
                Statics.field2522.method3010();
                class162.field2718 = 0;
                Statics.field1299 = null;
                Statics.field2524 = null;
                Statics.field560 = null;
            }
            var1 = false;
        }
        if (var1 && field240 && Statics.field826 != null) {
            Statics.field826.method987();
        }
        if (field2043) {
            Canvas var4 = Statics.field2027;
            var4.removeKeyListener(class124.field1969);
            var4.removeFocusListener(class124.field1969);
            class124.field1960 = -1;
            Canvas var5 = Statics.field2027;
            var5.removeMouseListener(class127.field1994);
            var5.removeMouseMotionListener(class127.field1994);
            var5.removeFocusListener(class127.field1994);
            class127.field1987 = 0;
            if (Statics.field529 != null) {
                Statics.field529.method2403(Statics.field2027);
            }
            this.method2597();
            Canvas var6 = Statics.field2027;
            var6.setFocusTraversalKeysEnabled(false);
            var6.addKeyListener(class124.field1969);
            var6.addFocusListener(class124.field1969);
            class127.method1859(Statics.field2027);
            if (Statics.field529 != null) {
                Statics.field529.method2410(Statics.field2027);
            }
        }
        if (field495 == 0) {
            int var7 = class28.field675;
            String var8 = class28.field659;
            Color var9 = null;
            try {
                Graphics var10 = Statics.field2027.getGraphics();
                if (Statics.field2013 == null) {
                    Statics.field2013 = new Font("Helvetica", 1, 13);
                    Statics.field1115 = Statics.field2027.getFontMetrics(Statics.field2013);
                }
                if (field2047) {
                    field2047 = false;
                    var10.setColor(Color.black);
                    var10.fillRect(0, 0, Statics.field1860, Statics.field1976);
                }
                if (var9 == null) {
                    var9 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1271 == null) {
                        Statics.field1271 = Statics.field2027.createImage(304, 34);
                    }
                    Graphics var11 = Statics.field1271.getGraphics();
                    var11.setColor(var9);
                    var11.drawRect(0, 0, 303, 33);
                    var11.fillRect(2, 2, var7 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(1, 1, 301, 31);
                    var11.fillRect(var7 * 3 + 2, 2, 300 - var7 * 3, 30);
                    var11.setFont(Statics.field2013);
                    var11.setColor(Color.white);
                    var11.drawString(var8, (304 - Statics.field1115.stringWidth(var8)) / 2, 22);
                    var10.drawImage(Statics.field1271, Statics.field1860 / 2 - 152, Statics.field1976 / 2 - 18, (ImageObserver) null);
                } catch (Exception var53) {
                    int var13 = Statics.field1860 / 2 - 152;
                    int var14 = Statics.field1976 / 2 - 18;
                    var10.setColor(var9);
                    var10.drawRect(var13, var14, 303, 33);
                    var10.fillRect(var13 + 2, var14 + 2, var7 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(var13 + 1, var14 + 1, 301, 31);
                    var10.fillRect(var7 * 3 + var13 + 2, var14 + 2, 300 - var7 * 3, 30);
                    var10.setFont(Statics.field2013);
                    var10.setColor(Color.white);
                    var10.drawString(var8, var13 + (304 - Statics.field1115.stringWidth(var8)) / 2, var14 + 22);
                }
            } catch (Exception var54) {
                Statics.field2027.repaint();
            }
        } else if (field495 == 5) {
            Statics.method1940(Statics.field611, Statics.field2480);
        } else if (field495 == 10 || field495 == 11) {
            Statics.method1940(Statics.field611, Statics.field2480);
        } else if (field495 == 20) {
            Statics.method1940(Statics.field611, Statics.field2480);
        } else if (field495 == 25) {
            if (field301 == 1) {
                if (field297 > field298) {
                    field298 = field297;
                }
                int var16 = (field298 * 50 - field297 * 50) / field298;
                method27(class143.field2306 + class2.field16 + class2.field19 + var16 + "%" + class2.field20, false);
            } else if (field301 == 2) {
                if (field362 > field455) {
                    field455 = field362;
                }
                int var17 = (field455 * 50 - field362 * 50) / field455 + 50;
                method27(class143.field2306 + class2.field16 + class2.field19 + var17 + "%" + class2.field20, false);
            } else {
                method27(class143.field2306, false);
            }
        } else if (field495 == 30) {
            if (field405 != -1) {
                method1840(field405);
            }
            for (int var18 = 0; var18 < field447; var18++) {
                if (field449[var18]) {
                    field351[var18] = true;
                }
                field451[var18] = field449[var18];
                field449[var18] = false;
            }
            field448 = field251;
            field393 = -1;
            field394 = -1;
            Statics.field112 = null;
            if (field405 != -1) {
                field447 = 0;
                method2642(field405, 0, 0, 765, 503, 0, 0, -1);
            }
            class73.method1557();
            if (field466) {
                int var22 = Statics.field976;
                int var23 = Statics.field221;
                int var24 = Statics.field827;
                int var25 = Statics.field136;
                int var26 = 6116423;
                class73.method1527(var22, var23, var24, var25, var26);
                class73.method1527(var22 + 1, var23 + 1, var24 - 2, 16, 0);
                class73.method1522(var22 + 1, var23 + 18, var24 - 2, var25 - 19, 0);
                Statics.field611.method3319(class143.field2341, var22 + 3, var23 + 14, var26, -1);
                int var27 = class127.field1992;
                int var28 = class127.field1988;
                for (int var29 = 0; var29 < field494; var29++) {
                    int var30 = (field494 - 1 - var29) * 15 + var23 + 31;
                    int var31 = 16777215;
                    if (var27 > var22 && var27 < var22 + var24 && var28 > var30 - 13 && var28 < var30 + 3) {
                        var31 = 16776960;
                    }
                    Statics.field611.method3319(method68(var29), var22 + 3, var30, var31, 0);
                }
                method160(Statics.field976, Statics.field221, Statics.field827, Statics.field136);
            } else if (field393 != -1) {
                int var19 = field393;
                int var20 = field394;
                if (field494 >= 2 || field398 != 0 || field400) {
                    String var21;
                    if (field398 == 1 && field494 < 2) {
                        var21 = class143.field2340 + class143.field2300 + field399 + " " + class2.field21;
                    } else if (field400 && field494 < 2) {
                        var21 = field367 + class143.field2300 + field404 + " " + class2.field21;
                    } else {
                        var21 = method68(field494 - 1);
                    }
                    if (field494 > 2) {
                        var21 = var21 + class2.method2037(16777215) + " " + '/' + " " + (field494 - 2) + class143.field2294;
                    }
                    Statics.field611.method3361(var21, var19 + 4, var20 + 15, 16777215, 0, field251 / 1000);
                }
            }
            if (field456 == 3) {
                for (int var32 = 0; var32 < field447; var32++) {
                    if (field451[var32]) {
                        class73.method1523(field452[var32], field343[var32], field454[var32], field317[var32], 16711935, 128);
                    } else if (field351[var32]) {
                        class73.method1523(field452[var32], field343[var32], field454[var32], field317[var32], 16711680, 128);
                    }
                }
            }
            int var33 = Statics.field59;
            int var34 = Statics.field628.field771;
            int var35 = Statics.field628.field721;
            int var36 = field280;
            for (class20 var37 = (class20) class20.field542.method3196(); var37 != null; var37 = (class20) class20.field542.method3206()) {
                if (var37.field551 != -1 || var37.field543 != null) {
                    int var38 = 0;
                    if (var34 > var37.field536) {
                        var38 += var34 - var37.field536;
                    } else if (var34 < var37.field534) {
                        var38 += var37.field534 - var34;
                    }
                    if (var35 > var37.field537) {
                        var38 += var35 - var37.field537;
                    } else if (var35 < var37.field538) {
                        var38 += var37.field538 - var35;
                    }
                    if (var38 - 64 > var37.field532 || field435 == 0 || var37.field539 != var33) {
                        if (var37.field540 != null) {
                            Statics.field1060.method954(var37.field540);
                            var37.field540 = null;
                        }
                        if (var37.field552 != null) {
                            Statics.field1060.method954(var37.field552);
                            var37.field552 = null;
                        }
                    } else {
                        var38 -= 64;
                        if (var38 < 0) {
                            var38 = 0;
                        }
                        int var39 = field435 * (var37.field532 - var38) / var37.field532;
                        class52 var10000;
                        if (var37.field540 != null) {
                            var37.field540.method1104(var39);
                        } else if (var37.field551 >= 0) {
                            var10000 = (class52) null;
                            class52 var40 = class52.method1032(Statics.field1823, var37.field551, 0);
                            if (var40 != null) {
                                class56 var41 = var40.method1030().method1073(Statics.field120);
                                class58 var42 = class58.method1100(var41, 100, var39);
                                var42.method1103(-1);
                                Statics.field1060.method933(var42);
                                var37.field540 = var42;
                            }
                        }
                        if (var37.field552 != null) {
                            var37.field552.method1104(var39);
                            if (!var37.field552.method3281()) {
                                var37.field552 = null;
                            }
                        } else if (var37.field543 != null && (var37.field544 -= var36) <= 0) {
                            int var43 = (int) (Math.random() * (double) var37.field543.length);
                            var10000 = (class52) null;
                            class52 var44 = class52.method1032(Statics.field1823, var37.field543[var43], 0);
                            if (var44 != null) {
                                class56 var45 = var44.method1030().method1073(Statics.field120);
                                class58 var46 = class58.method1100(var45, 100, var39);
                                var46.method1103(0);
                                Statics.field1060.method933(var46);
                                var37.field552 = var46;
                                var37.field544 = var37.field535 + (int) (Math.random() * (double) (var37.field533 - var37.field535));
                            }
                        }
                    }
                }
            }
            field280 = 0;
        } else if (field495 == 40) {
            method27(class143.field2150 + class2.field16 + class143.field2386, false);
        } else if (field495 == 45) {
            method27(class143.field2228, false);
        }
        if (field495 == 30 && field456 == 0 && !field2047) {
            try {
                Graphics var47 = Statics.field2027.getGraphics();
                for (int var48 = 0; var48 < field447; var48++) {
                    if (field351[var48]) {
                        Statics.field1114.method1337(var47, field452[var48], field343[var48], field454[var48], field317[var48]);
                        field351[var48] = false;
                    }
                }
            } catch (Exception var56) {
                Statics.field2027.repaint();
            }
        } else if (field495 > 0) {
            try {
                Graphics var50 = Statics.field2027.getGraphics();
                Statics.field1114.method1351(var50, 0, 0);
                field2047 = false;
                for (int var51 = 0; var51 < field447; var51++) {
                    field351[var51] = false;
                }
            } catch (Exception var55) {
                Statics.field2027.repaint();
            }
        }
    }

    @ObfuscatedName("client.k(B)V")
    public final void method185() {
        if (Statics.field571 != null) {
            Statics.field571.field170 = false;
        }
        Statics.field571 = null;
        if (Statics.field436 != null) {
            Statics.field436.method2551();
            Statics.field436 = null;
        }
        class124.method490();
        if (class127.field1994 != null) {
            class127 var1 = class127.field1994;
            synchronized (class127.field1994) {
                class127.field1994 = null;
            }
        }
        Statics.field529 = null;
        if (Statics.field826 != null) {
            Statics.field826.method1006();
        }
        if (Statics.field162 != null) {
            Statics.field162.method1006();
        }
        class151.method163();
        class150.method2646();
        try {
            class136.field2075.method3441();
            for (int var3 = 0; var3 < Statics.field1760; var3++) {
                Statics.field574[var3].method3441();
            }
            class136.field2076.method3441();
            class136.field2073.method3441();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("de.o(II)V")
    public static void method2320(int arg0) {
        if (field495 == arg0) {
            return;
        }
        if (field495 == 0) {
            class131.method558();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field238 = 0;
            field247 = 0;
            field277 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2112 != null) {
            Statics.field2112.method2551();
            Statics.field2112 = null;
        }
        if (field495 == 25) {
            field301 = 0;
            field297 = 0;
            field298 = 1;
            field362 = 0;
            field455 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method171(Statics.field2027, Statics.field610, Statics.field273, true, 0);
        } else if (arg0 == 20) {
            class28.method171(Statics.field2027, Statics.field610, Statics.field273, true, field495 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method171(Statics.field2027, Statics.field610, Statics.field273, false, 4);
        } else if (Statics.field673) {
            Statics.field644 = null;
            Statics.field645 = null;
            Statics.field646 = null;
            Statics.field1894 = null;
            Statics.field638 = null;
            Statics.field2127 = null;
            Statics.field647 = null;
            Statics.field603 = null;
            Statics.field700 = null;
            Statics.field2659 = null;
            Statics.field2722 = null;
            Statics.field592 = null;
            Statics.field1527 = null;
            Statics.field985 = null;
            Statics.field1856 = null;
            Statics.field511 = null;
            Statics.field651 = null;
            Statics.field185 = null;
            Statics.field2001 = null;
            Statics.field2002 = null;
            Statics.field572 = null;
            Statics.field1943 = null;
            class162.field2718 = 1;
            Statics.field560 = null;
            Statics.field2723 = -1;
            Statics.field2663 = -1;
            Statics.field2719 = 0;
            Statics.field2714 = false;
            Statics.field2720 = 2;
            class151.method2232(true);
            Statics.field673 = false;
        }
        field495 = arg0;
    }

    @ObfuscatedName("client.a(B)V")
    public void method186() {
        if (field495 == 1000) {
            return;
        }
        long var1 = class103.method494();
        int var3 = (int) (var1 - Statics.field2493);
        Statics.field2493 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class151.field2491 += var3;
        boolean var4;
        if (class151.field2492 == 0 && class151.field2507 == 0 && class151.field2500 == 0 && class151.field2516 == 0) {
            var4 = true;
        } else if (Statics.field2495 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class151.field2491 > 30000) {
                        throw new IOException();
                    }
                    while (class151.field2507 < 20 && class151.field2516 > 0) {
                        class152 var5 = (class152) class151.field2497.method3163();
                        class107 var6 = new class107(4);
                        var6.method2087(1);
                        var6.method2089((int) var5.field2873);
                        Statics.field2495.method2538(var6.field1839, 0, 4);
                        class151.field2496.method3161(var5, var5.field2873);
                        class151.field2516--;
                        class151.field2507++;
                    }
                    while (class151.field2492 < 20 && class151.field2500 > 0) {
                        class152 var7 = (class152) class151.field2498.method3244();
                        class107 var8 = new class107(4);
                        var8.method2087(0);
                        var8.method2089((int) var7.field2873);
                        Statics.field2495.method2538(var8.field1839, 0, 4);
                        var7.method3260();
                        class151.field2503.method3161(var7, var7.field2873);
                        class151.field2500--;
                        class151.field2492++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2495.method2544();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class151.field2491 = 0;
                        byte var11 = 0;
                        if (Statics.field2494 == null) {
                            var11 = 8;
                        } else if (class151.field2505 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class151.field2504.field1835;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2495.method2541(class151.field2504.field1839, class151.field2504.field1835, var12);
                            if (class151.field2509 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class151.field2504.field1839[class151.field2504.field1835 + var13] ^= class151.field2509;
                                }
                            }
                            class151.field2504.field1835 += var12;
                            if (class151.field2504.field1835 < var11) {
                                break;
                            }
                            if (Statics.field2494 == null) {
                                class151.field2504.field1835 = 0;
                                int var14 = class151.field2504.method2101();
                                int var15 = class151.field2504.method2166();
                                int var16 = class151.field2504.method2101();
                                int var17 = class151.field2504.method2286();
                                long var18 = (long) ((var14 << 16) + var15);
                                class152 var20 = (class152) class151.field2496.method3171(var18);
                                Statics.field2029 = true;
                                if (var20 == null) {
                                    var20 = (class152) class151.field2503.method3171(var18);
                                    Statics.field2029 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2494 = var20;
                                Statics.field541 = new class107(var17 + var21 + Statics.field2494.field2520);
                                Statics.field541.method2087(var16);
                                Statics.field541.method2253(var17);
                                class151.field2505 = 8;
                                class151.field2504.field1835 = 0;
                            } else if (class151.field2505 == 0) {
                                if (class151.field2504.field1839[0] == -1) {
                                    class151.field2505 = 1;
                                    class151.field2504.field1835 = 0;
                                } else {
                                    Statics.field2494 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field541.field1839.length - Statics.field2494.field2520;
                            int var23 = 512 - class151.field2505;
                            if (var23 > var22 - Statics.field541.field1835) {
                                var23 = var22 - Statics.field541.field1835;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2495.method2541(Statics.field541.field1839, Statics.field541.field1835, var23);
                            if (class151.field2509 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field541.field1839[Statics.field541.field1835 + var24] ^= class151.field2509;
                                }
                            }
                            Statics.field541.field1835 += var23;
                            class151.field2505 += var23;
                            if (Statics.field541.field1835 == var22) {
                                if (Statics.field2494.field2873 == 16711935L) {
                                    Statics.field63 = Statics.field541;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class148 var26 = class151.field2508[var25];
                                        if (var26 != null) {
                                            Statics.field63.field1835 = var25 * 8 + 5;
                                            int var27 = Statics.field63.method2286();
                                            int var28 = Statics.field63.method2286();
                                            var26.method2751(var27, var28);
                                        }
                                    }
                                } else {
                                    class151.field2501.reset();
                                    class151.field2501.update(Statics.field541.field1839, 0, var22);
                                    int var29 = (int) class151.field2501.getValue();
                                    if (Statics.field2494.field2523 != var29) {
                                        try {
                                            Statics.field2495.method2551();
                                        } catch (Exception var35) {
                                        }
                                        class151.field2510++;
                                        Statics.field2495 = null;
                                        class151.field2509 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class151.field2510 = 0;
                                    class151.field2511 = 0;
                                    Statics.field2494.field2519.method2756((int) (Statics.field2494.field2873 & 0xFFFFL), Statics.field541.field1839, (Statics.field2494.field2873 & 0xFF0000L) == 16711680L, Statics.field2029);
                                }
                                Statics.field2494.method3280();
                                if (Statics.field2029) {
                                    class151.field2507--;
                                } else {
                                    class151.field2492--;
                                }
                                class151.field2505 = 0;
                                Statics.field2494 = null;
                                Statics.field541 = null;
                            } else {
                                if (class151.field2505 != 512) {
                                    break;
                                }
                                class151.field2505 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2495.method2551();
                } catch (Exception var34) {
                }
                class151.field2511++;
                Statics.field2495 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method251();
        }
    }

    @ObfuscatedName("client.f(B)V")
    public void method251() {
        if (class151.field2510 >= 4) {
            this.method2614("js5crc");
            field495 = 1000;
            return;
        }
        if (class151.field2511 >= 4) {
            if (field495 <= 5) {
                this.method2614("js5io");
                field495 = 1000;
                return;
            }
            field272 = 3000;
            class151.field2511 = 3;
        }
        if (--field272 + 1 > 0) {
            return;
        }
        try {
            if (field271 == 0) {
                Statics.field1660 = Statics.field235.method2442(Statics.field2786, Statics.field2394);
                field271++;
            }
            if (field271 == 1) {
                if (Statics.field1660.field2051 == 2) {
                    this.method188(-1);
                    return;
                }
                if (Statics.field1660.field2051 == 1) {
                    field271++;
                }
            }
            if (field271 == 2) {
                Statics.field2512 = new class130((Socket) Statics.field1660.field2057, Statics.field235);
                class107 var1 = new class107(5);
                var1.method2087(15);
                var1.method2253(64);
                Statics.field2512.method2538(var1.field1839, 0, 5);
                field271++;
                Statics.field1459 = class103.method494();
            }
            if (field271 == 3) {
                if (field495 <= 5 || Statics.field2512.method2544() > 0) {
                    int var2 = Statics.field2512.method2539();
                    if (var2 != 0) {
                        this.method188(var2);
                        return;
                    }
                    field271++;
                } else if (class103.method494() - Statics.field1459 > 30000L) {
                    this.method188(-2);
                    return;
                }
            }
            if (field271 == 4) {
                class151.method2319(Statics.field2512, field495 > 20);
                Statics.field1660 = null;
                Statics.field2512 = null;
                field271 = 0;
                field327 = 0;
            }
        } catch (IOException var4) {
            this.method188(-3);
        }
    }

    @ObfuscatedName("client.r(IB)V")
    public void method188(int arg0) {
        Statics.field1660 = null;
        Statics.field2512 = null;
        field271 = 0;
        if (Statics.field2394 == Statics.field1298) {
            Statics.field2394 = Statics.field1249;
        } else {
            Statics.field2394 = Statics.field1298;
        }
        field327++;
        if (field327 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field495 <= 5) {
                this.method2614("js5connect_full");
                field495 = 1000;
            } else {
                field272 = 3000;
            }
        } else if (field327 >= 2 && arg0 == 6) {
            this.method2614("js5connect_outofdate");
            field495 = 1000;
        } else if (field327 >= 4) {
            if (field495 <= 5) {
                this.method2614("js5connect");
                field495 = 1000;
            } else {
                field272 = 3000;
            }
        }
    }

    @ObfuscatedName("ah.e(I)V")
    public static void method543() {
        if (field270 == 0) {
            Statics.field199 = new class79(4, 104, 104, class6.field65);
            for (int var0 = 0; var0 < 4; var0++) {
                field418[var0] = new class198(104, 104);
            }
            Statics.field2012 = new class72(512, 512);
            class28.field659 = class143.field2258;
            class28.field675 = 5;
            field270 = 20;
        } else if (field270 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1461[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1717(var1, 500, 800, 512, 334);
            class28.field659 = class143.field2153;
            class28.field675 = 10;
            field270 = 30;
        } else if (field270 == 30) {
            Statics.field1912 = method499(0, false, true, true);
            Statics.field573 = method499(1, false, true, true);
            Statics.field1053 = method499(2, true, false, true);
            Statics.field894 = method499(3, false, true, true);
            Statics.field1823 = method499(4, false, true, true);
            Statics.field1278 = method499(5, true, true, true);
            Statics.field1569 = method499(6, true, true, false);
            Statics.field576 = method499(7, false, true, true);
            Statics.field273 = method499(8, false, true, true);
            Statics.field2458 = method499(9, false, true, true);
            Statics.field610 = method499(10, false, true, true);
            Statics.field641 = method499(11, false, true, true);
            Statics.field1803 = method499(12, false, true, true);
            Statics.field178 = method499(13, true, false, true);
            Statics.field927 = method499(14, false, true, false);
            Statics.field188 = method499(15, false, true, true);
            class28.field659 = class143.field2187;
            class28.field675 = 20;
            field270 = 40;
        } else if (field270 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1912.method2752() * 4 / 100;
            int var8 = var7 + Statics.field573.method2752() * 4 / 100;
            int var9 = var8 + Statics.field1053.method2752() * 2 / 100;
            int var10 = var9 + Statics.field894.method2752() * 2 / 100;
            int var11 = var10 + Statics.field1823.method2752() * 6 / 100;
            int var12 = var11 + Statics.field1278.method2752() * 4 / 100;
            int var13 = var12 + Statics.field1569.method2752() * 2 / 100;
            int var14 = var13 + Statics.field576.method2752() * 60 / 100;
            int var15 = var14 + Statics.field273.method2752() * 2 / 100;
            int var16 = var15 + Statics.field2458.method2752() * 2 / 100;
            int var17 = var16 + Statics.field610.method2752() * 2 / 100;
            int var18 = var17 + Statics.field641.method2752() * 2 / 100;
            int var19 = var18 + Statics.field1803.method2752() * 2 / 100;
            int var20 = var19 + Statics.field178.method2752() * 2 / 100;
            int var21 = var20 + Statics.field927.method2752() * 2 / 100;
            int var22 = var21 + Statics.field188.method2752() * 2 / 100;
            if (var22 == 100) {
                class28.field659 = class143.field2234;
                class28.field675 = 30;
                field270 = 45;
            } else {
                if (var22 != 0) {
                    class28.field659 = class143.field2155 + var22 + "%";
                }
                class28.field675 = 30;
            }
        } else if (field270 == 45) {
            class50.method144(22050, !field403, 2);
            class163 var23 = new class163();
            var23.method3012(9, 128);
            Statics.field826 = class50.method594(Statics.field235, Statics.field2027, 0, 22050);
            Statics.field826.method976(var23);
            class162.method2858(Statics.field188, Statics.field927, Statics.field1823, var23);
            Statics.field162 = class50.method594(Statics.field235, Statics.field2027, 1, 2048);
            Statics.field1060 = new class49();
            Statics.field162.method976(Statics.field1060);
            Statics.field120 = new class68(22050, Statics.field1071);
            class28.field659 = class143.field2157;
            class28.field675 = 35;
            field270 = 50;
        } else if (field270 == 50) {
            int var24 = 0;
            if (Statics.field2480 == null) {
                Statics.field2480 = class70.method1951(Statics.field273, Statics.field178, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field998 == null) {
                Statics.field998 = class70.method1951(Statics.field273, Statics.field178, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field611 == null) {
                Statics.field611 = class70.method1951(Statics.field273, Statics.field178, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class28.field659 = class143.field2158 + var24 * 100 / 3 + "%";
                class28.field675 = 40;
            } else {
                Statics.field523 = new class146(true);
                class28.field659 = class143.field2159;
                class28.field675 = 40;
                field270 = 60;
            }
        } else if (field270 == 60) {
            class148 var25 = Statics.field610;
            class148 var26 = Statics.field273;
            int var27 = 0;
            if (var25.method2685("title.jpg", "")) {
                var27++;
            }
            if (var26.method2685("logo", "")) {
                var27++;
            }
            if (var26.method2685("titlebox", "")) {
                var27++;
            }
            if (var26.method2685("titlebutton", "")) {
                var27++;
            }
            if (var26.method2685("runes", "")) {
                var27++;
            }
            if (var26.method2685("title_mute", "")) {
                var27++;
            }
            if (var26.method2664("options_radio_buttons,0")) {
                var27++;
            }
            if (var26.method2664("options_radio_buttons,2")) {
                var27++;
            }
            var26.method2685("sl_back", "");
            var26.method2685("sl_flags", "");
            var26.method2685("sl_arrows", "");
            var26.method2685("sl_stars", "");
            var26.method2685("sl_button", "");
            byte var30 = 8;
            if (var27 < var30) {
                class28.field659 = class143.field2160 + var27 * 100 / var30 + "%";
                class28.field675 = 50;
            } else {
                class28.field659 = class143.field2385;
                class28.field675 = 50;
                method2320(5);
                field270 = 70;
            }
        } else if (field270 == 70) {
            if (Statics.field1053.method2679()) {
                class41.method143(Statics.field1053);
                class148 var32 = Statics.field1053;
                Statics.field893 = var32;
                class148 var33 = Statics.field1053;
                class148 var34 = Statics.field576;
                Statics.field939 = var33;
                Statics.field2014 = var34;
                Statics.field2970 = Statics.field939.method2732(3);
                class36.method1422(Statics.field1053, Statics.field576, field403);
                class148 var35 = Statics.field1053;
                class148 var36 = Statics.field576;
                Statics.field794 = var35;
                Statics.field788 = var36;
                class45.method826(Statics.field1053, Statics.field576, field245, Statics.field2480);
                class38.method159(Statics.field1053, Statics.field1912, Statics.field573);
                class39.method501(Statics.field1053, Statics.field576);
                class42.method3116(Statics.field1053);
                class148 var37 = Statics.field1053;
                Statics.field1059 = var37;
                Statics.field2891 = Statics.field1059.method2732(16);
                class148 var38 = Statics.field894;
                class148 var39 = Statics.field576;
                class148 var40 = Statics.field273;
                class148 var41 = Statics.field178;
                Statics.field2527 = var38;
                Statics.field2641 = var39;
                Statics.field2479 = var40;
                Statics.field2630 = var41;
                Statics.field2590 = new class153[Statics.field2527.method2678()][];
                Statics.field2620 = new boolean[Statics.field2527.method2678()];
                class148 var42 = Statics.field1053;
                Statics.field1000 = var42;
                class148 var43 = Statics.field1053;
                Statics.field991 = var43;
                class28.field659 = class143.field2163;
                class28.field675 = 60;
                field270 = 80;
            } else {
                class28.field659 = class143.field2162 + Statics.field1053.method2760() + "%";
                class28.field675 = 60;
            }
        } else if (field270 == 80) {
            int var44 = 0;
            if (Statics.field210 == null) {
                Statics.field210 = class70.method1835(Statics.field273, "compass", "");
            } else {
                var44++;
            }
            if (Statics.field40 == null) {
                Statics.field40 = class70.method1835(Statics.field273, "mapedge", "");
            } else {
                var44++;
            }
            if (Statics.field1055 == null) {
                Statics.field1055 = class70.method3287(Statics.field273, "mapscene", "");
            } else {
                var44++;
            }
            if (Statics.field2699 == null) {
                Statics.field2699 = class70.method8(Statics.field273, "mapfunction", "");
            } else {
                var44++;
            }
            if (Statics.field319 == null) {
                Statics.field319 = class70.method8(Statics.field273, "hitmarks", "");
            } else {
                var44++;
            }
            if (Statics.field1793 == null) {
                Statics.field1793 = class70.method8(Statics.field273, "headicons_pk", "");
            } else {
                var44++;
            }
            if (Statics.field907 == null) {
                Statics.field907 = class70.method8(Statics.field273, "headicons_prayer", "");
            } else {
                var44++;
            }
            if (Statics.field922 == null) {
                Statics.field922 = class70.method8(Statics.field273, "headicons_hint", "");
            } else {
                var44++;
            }
            if (Statics.field1507 == null) {
                Statics.field1507 = class70.method8(Statics.field273, "mapmarker", "");
            } else {
                var44++;
            }
            if (Statics.field2439 == null) {
                Statics.field2439 = class70.method8(Statics.field273, "cross", "");
            } else {
                var44++;
            }
            if (Statics.field1427 == null) {
                Statics.field1427 = class70.method8(Statics.field273, "mapdots", "");
            } else {
                var44++;
            }
            if (Statics.field2513 == null) {
                Statics.field2513 = class70.method3287(Statics.field273, "scrollbar", "");
            } else {
                var44++;
            }
            if (Statics.field772 == null) {
                Statics.field772 = class70.method3287(Statics.field273, "mod_icons", "");
            } else {
                var44++;
            }
            if (Statics.field2514 == null) {
                Statics.field2514 = class70.method1856(Statics.field273, "mapback", "");
            } else {
                var44++;
            }
            if (var44 < 14) {
                class28.field659 = class143.field2164 + var44 * 100 / 14 + "%";
                class28.field675 = 70;
            } else {
                Statics.field2917 = Statics.field772;
                Statics.field40.method1432();
                int var45 = (int) (Math.random() * 21.0D) - 10;
                int var46 = (int) (Math.random() * 21.0D) - 10;
                int var47 = (int) (Math.random() * 21.0D) - 10;
                int var48 = (int) (Math.random() * 41.0D) - 20;
                for (int var49 = 0; var49 < Statics.field2699.length; var49++) {
                    Statics.field2699[var49].method1461(var45 + var48, var46 + var48, var47 + var48);
                }
                Statics.field1055[0].method1578(var45 + var48, var46 + var48, var47 + var48);
                method134();
                class28.field659 = class143.field2165;
                class28.field675 = 70;
                field270 = 90;
            }
        } else if (field270 == 90) {
            if (Statics.field2458.method2679()) {
                class88 var50 = new class88(Statics.field2458, Statics.field273, 20, 0.8D, field403 ? 64 : 128);
                class84.method1769(var50);
                class84.method1779(0.8D);
                class28.field659 = class143.field2167;
                class28.field675 = 90;
                field270 = 110;
            } else {
                class28.field659 = class143.field2156 + Statics.field2458.method2760() + "%";
                class28.field675 = 90;
            }
        } else if (field270 == 110) {
            Statics.field571 = new class12();
            Statics.field235.method2443(Statics.field571, 10);
            class28.field659 = class143.field2168;
            class28.field675 = 94;
            field270 = 120;
        } else if (field270 == 120) {
            if (Statics.field610.method2685("huffman", "")) {
                class102 var51 = new class102(Statics.field610.method2671("huffman", ""));
                class192.method2788(var51);
                class28.field659 = class143.field2170;
                class28.field675 = 96;
                field270 = 130;
            } else {
                class28.field659 = class143.field2205 + "%";
                class28.field675 = 96;
            }
        } else if (field270 == 130) {
            if (!Statics.field894.method2679()) {
                class28.field659 = class143.field2321 + Statics.field894.method2760() * 4 / 5 + "%";
                class28.field675 = 100;
            } else if (!Statics.field1803.method2679()) {
                class28.field659 = class143.field2321 + (80 + Statics.field1803.method2760() / 6) + "%";
                class28.field675 = 100;
            } else if (Statics.field178.method2679()) {
                class28.field659 = class143.field2172;
                class28.field675 = 100;
                field270 = 140;
            } else {
                class28.field659 = class143.field2321 + (96 + Statics.field178.method2760() / 20) + "%";
                class28.field675 = 100;
            }
        } else if (field270 == 140) {
            method2320(10);
        }
    }

    @ObfuscatedName("l.t(IZZZI)Leg;")
    public static class148 method499(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2075 != null) {
            var4 = new class121(arg0, class136.field2075, Statics.field574[arg0], 1000000);
        }
        return new class148(var4, Statics.field156, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("w.c(I)V")
    public static void method134() {
        Statics.field152 = new int[33];
        Statics.field627 = new int[33];
        Statics.field1819 = new int[151];
        Statics.field1523 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field2514.field1324[Statics.field2514.field1328 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field152[var0] = var1;
            Statics.field627[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field2514.field1324[Statics.field2514.field1328 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field1819[var4 - 5] = var5 - 25;
            Statics.field1523[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("ex.l(I)V")
    public static final void method2643() {
        try {
            if (field238 == 0) {
                if (Statics.field436 != null) {
                    Statics.field436.method2551();
                    Statics.field436 = null;
                }
                Statics.field626 = null;
                field499 = false;
                field247 = 0;
                field238 = 1;
            }
            if (field238 == 1) {
                if (Statics.field626 == null) {
                    Statics.field626 = Statics.field235.method2442(Statics.field2786, Statics.field2394);
                }
                if (Statics.field626.field2051 == 2) {
                    throw new IOException();
                }
                if (Statics.field626.field2051 == 1) {
                    Statics.field436 = new class130((Socket) Statics.field626.field2057, Statics.field235);
                    Statics.field626 = null;
                    field238 = 2;
                }
            }
            if (field238 == 2) {
                field361.field1835 = 0;
                field361.method2087(14);
                Statics.field436.method2538(field361.field1839, 0, 1);
                field285.field1835 = 0;
                field238 = 3;
            }
            if (field238 == 3) {
                if (Statics.field826 != null) {
                    Statics.field826.method978();
                }
                if (Statics.field162 != null) {
                    Statics.field162.method978();
                }
                int var0 = Statics.field436.method2539();
                if (Statics.field826 != null) {
                    Statics.field826.method978();
                }
                if (Statics.field162 != null) {
                    Statics.field162.method978();
                }
                if (var0 != 0) {
                    method112(var0);
                    return;
                }
                field285.field1835 = 0;
                field238 = 5;
            }
            if (field238 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field361.field1835 = 0;
                field361.method2087(1);
                field361.method2087(class28.field648.method488());
                field361.method2253(var1[0]);
                field361.method2253(var1[1]);
                field361.method2253(var1[2]);
                field361.method2253(var1[3]);
                switch(class28.field648.field2401) {
                    case 0:
                        field361.method2253((Integer) Statics.field1979.field124.get(class200.method2350(class28.field657)));
                        field361.field1835 += 4;
                        break;
                    case 1:
                    case 2:
                        field361.method2089(Statics.field1817);
                        field361.field1835 += 5;
                        break;
                    case 3:
                        field361.field1835 += 8;
                }
                field361.method2092(class28.field665);
                field361.method2119(class5.field61, class5.field60);
                field485.field1835 = 0;
                if (field495 == 40) {
                    field485.method2087(18);
                } else {
                    field485.method2087(16);
                }
                field485.method2088(0);
                int var2 = field485.field1835;
                field485.method2253(64);
                field485.method2208(field361.field1839, 0, field361.field1835);
                int var3 = field485.field1835;
                field485.method2092(class28.field657);
                field485.method2087(field403 ? 1 : 0);
                class110 var4 = field485;
                byte[] var5 = new byte[24];
                try {
                    class136.field2073.method3450(0L);
                    class136.field2073.method3444(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var36) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2208(var5, 0, 24);
                class107 var9 = new class107(Statics.field523.method2656());
                Statics.field523.method2654(var9);
                field485.method2208(var9.field1839, 0, var9.field1839.length);
                field485.method2253(Statics.field1912.field2453);
                field485.method2253(Statics.field573.field2453);
                field485.method2253(Statics.field1053.field2453);
                field485.method2253(Statics.field894.field2453);
                field485.method2253(Statics.field1823.field2453);
                field485.method2253(Statics.field1278.field2453);
                field485.method2253(Statics.field1569.field2453);
                field485.method2253(Statics.field576.field2453);
                field485.method2253(Statics.field273.field2453);
                field485.method2253(Statics.field2458.field2453);
                field485.method2253(Statics.field610.field2453);
                field485.method2253(Statics.field641.field2453);
                field485.method2253(Statics.field1803.field2453);
                field485.method2253(Statics.field178.field2453);
                field485.method2253(Statics.field927.field2453);
                field485.method2253(Statics.field188.field2453);
                field485.method2214(var1, var3, field485.field1835);
                field485.method2097(field485.field1835 - var2);
                Statics.field436.method2538(field485.field1839, 0, field485.field1835);
                field361.method2343(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field285.method2343(var1);
                field238 = 6;
            }
            if (field238 == 6 && Statics.field436.method2544() > 0) {
                int var11 = Statics.field436.method2539();
                if (var11 == 21 && field495 == 20) {
                    field238 = 7;
                } else if (var11 == 2) {
                    field238 = 9;
                } else if (var11 == 15 && field495 == 40) {
                    method1760();
                    return;
                } else if (var11 == 23 && field277 < 1) {
                    field277++;
                    field238 = 0;
                } else {
                    method112(var11);
                    return;
                }
            }
            if (field238 == 7 && Statics.field436.method2544() > 0) {
                field284 = (Statics.field436.method2539() + 3) * 60;
                field238 = 8;
            }
            if (field238 == 8) {
                field247 = 0;
                class28.method1756(class143.field2224, class143.field2177, field284 / 60 + class143.field2339);
                if (--field284 <= 0) {
                    field238 = 0;
                }
            } else {
                if (field238 == 9 && Statics.field436.method2544() >= 13) {
                    boolean var12 = Statics.field436.method2539() == 1;
                    Statics.field436.method2541(field285.field1839, 0, 4);
                    field285.field1835 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field285.method2339() << 24;
                        int var15 = var14 | field285.method2339() << 16;
                        int var16 = var15 | field285.method2339() << 8;
                        int var17 = var16 | field285.method2339();
                        int var18 = class200.method2350(class28.field657);
                        if (Statics.field1979.field124.size() >= 10 && !Statics.field1979.field124.containsKey(var18)) {
                            Iterator var19 = Statics.field1979.field124.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field1979.field124.put(var18, var17);
                        class9.method1862();
                    }
                    field412 = Statics.field436.method2539();
                    field414 = Statics.field436.method2539() == 1;
                    field368 = Statics.field436.method2539();
                    field368 <<= 0x8;
                    field368 += Statics.field436.method2539();
                    field369 = Statics.field436.method2539();
                    Statics.field436.method2541(field285.field1839, 0, 1);
                    field285.field1835 = 0;
                    field287 = field285.method2339();
                    Statics.field436.method2541(field285.field1839, 0, 2);
                    field285.field1835 = 0;
                    field286 = field285.method2166();
                    if (field369 == 1) {
                        try {
                            class119.method2415(Statics.field428, "zap");
                        } catch (Throwable var35) {
                        }
                    } else {
                        try {
                            class119.method2415(Statics.field428, "unzap");
                        } catch (Throwable var34) {
                        }
                    }
                    field238 = 10;
                }
                if (field238 != 10) {
                    field247++;
                    if (field247 > 2000) {
                        if (field277 < 1) {
                            if (Statics.field2394 == Statics.field1298) {
                                Statics.field2394 = Statics.field1249;
                            } else {
                                Statics.field2394 = Statics.field1298;
                            }
                            field277++;
                            field238 = 0;
                        } else {
                            method112(-3);
                        }
                    }
                } else if (Statics.field436.method2544() >= field286) {
                    field285.field1835 = 0;
                    Statics.field436.method2541(field285.field1839, 0, field286);
                    field332 = 1L;
                    field473 = -1;
                    Statics.field571.field161 = 0;
                    Statics.field1906 = true;
                    field275 = true;
                    field385 = -1L;
                    class190.method2044();
                    field361.field1835 = 0;
                    field285.field1835 = 0;
                    field287 = -1;
                    field446 = -1;
                    field292 = -1;
                    field326 = -1;
                    field288 = 0;
                    field258 = 0;
                    field290 = 0;
                    field356 = 0;
                    field494 = 0;
                    field466 = false;
                    class127.method177(0);
                    class10.method2649();
                    field398 = 0;
                    field400 = false;
                    field482 = 0;
                    field306 = (int) (Math.random() * 100.0D) - 50;
                    field308 = (int) (Math.random() * 110.0D) - 55;
                    field310 = (int) (Math.random() * 80.0D) - 40;
                    field322 = (int) (Math.random() * 120.0D) - 60;
                    field243 = (int) (Math.random() * 30.0D) - 20;
                    field478 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field379 = 0;
                    field469 = -1;
                    field256 = 0;
                    field475 = 0;
                    field268 = class18.field508;
                    field259 = 0;
                    field357 = 0;
                    for (int var22 = 0; var22 < 2048; var22++) {
                        field386[var22] = null;
                        field479[var22] = null;
                    }
                    for (int var23 = 0; var23 < 32768; var23++) {
                        field279[var23] = null;
                    }
                    Statics.field628 = field386[2047] = new class3();
                    field376 = -1;
                    field472.method3191();
                    field453.method3191();
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 104; var25++) {
                            for (int var26 = 0; var26 < 104; var26++) {
                                field377[var24][var25][var26] = null;
                            }
                        }
                    }
                    field378 = new class178();
                    field278 = 0;
                    field318 = 0;
                    field498 = 0;
                    for (int var27 = 0; var27 < Statics.field2891; var27++) {
                        class46 var28 = class46.method2399(var27);
                        if (var28 != null) {
                            class155.field2662[var27] = 0;
                            class155.field2664[var27] = 0;
                        }
                    }
                    for (int var29 = 0; var29 < field470.length; var29++) {
                        field470[var29] = -1;
                    }
                    field413 = -1;
                    if (field405 != -1) {
                        class153.method831(field405);
                    }
                    for (class4 var30 = (class4) field406.method3163(); var30 != null; var30 = (class4) field406.method3172()) {
                        method161(var30, true);
                    }
                    field405 = -1;
                    field406 = new class175(8);
                    field409 = null;
                    field466 = false;
                    field494 = 0;
                    field323.method2881((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var31 = 0; var31 < 8; var31++) {
                        field373[var31] = null;
                        field325[var31] = false;
                    }
                    class14.method636();
                    field250 = true;
                    for (int var32 = 0; var32 < 100; var32++) {
                        field449[var32] = true;
                    }
                    field467 = null;
                    Statics.field130 = 0;
                    Statics.field1690 = null;
                    Statics.field606 = -1;
                    method513(false);
                    field287 = -1;
                }
            }
        } catch (IOException var37) {
            if (field277 < 1) {
                if (Statics.field2394 == Statics.field1298) {
                    Statics.field2394 = Statics.field1249;
                } else {
                    Statics.field2394 = Statics.field1298;
                }
                field277++;
                field238 = 0;
            } else {
                method112(-2);
            }
        }
    }

    @ObfuscatedName("cd.n(I)V")
    public static void method1760() {
        field361.field1835 = 0;
        field285.field1835 = 0;
        field287 = -1;
        field446 = -1;
        field292 = -1;
        field326 = -1;
        field286 = 0;
        field288 = 0;
        field258 = 0;
        field494 = 0;
        field466 = false;
        field379 = 0;
        field256 = 0;
        for (int var0 = 0; var0 < field386.length; var0++) {
            if (field386[var0] != null) {
                field386[var0].field745 = -1;
            }
        }
        for (int var1 = 0; var1 < field279.length; var1++) {
            if (field279[var1] != null) {
                field279[var1].field745 = -1;
            }
        }
        class14.method636();
        method2320(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field449[var2] = true;
        }
    }

    @ObfuscatedName("y.d(II)V")
    public static void method112(int arg0) {
        if (arg0 == -3) {
            class28.method1756(class143.field2179, class143.field2161, class143.field2181);
        } else if (arg0 == -2) {
            class28.method1756(class143.field2182, class143.field2171, class143.field2295);
        } else if (arg0 == -1) {
            class28.method1756(class143.field2149, class143.field2186, class143.field2293);
        } else if (arg0 == 3) {
            class28.method1756(class143.field2188, class143.field2380, class143.field2190);
        } else if (arg0 == 4) {
            class28.method1756(class143.field2191, class143.field2154, class143.field2193);
        } else if (arg0 == 5) {
            class28.method1756(class143.field2194, class143.field2279, class143.field2196);
        } else if (arg0 == 6) {
            class28.method1756(class143.field2197, class143.field2198, class143.field2199);
        } else if (arg0 == 7) {
            class28.method1756(class143.field2200, class143.field2201, class143.field2202);
        } else if (arg0 == 8) {
            class28.method1756(class143.field2284, class143.field2212, class143.field2169);
        } else if (arg0 == 9) {
            class28.method1756(class143.field2166, class143.field2180, class143.field2208);
        } else if (arg0 == 10) {
            class28.method1756(class143.field2209, class143.field2324, class143.field2211);
        } else if (arg0 == 11) {
            class28.method1756(class143.field2185, class143.field2213, class143.field2214);
        } else if (arg0 == 12) {
            class28.method1756(class143.field2215, class143.field2216, class143.field2174);
        } else if (arg0 == 13) {
            class28.method1756(class143.field2240, class143.field2305, class143.field2220);
        } else if (arg0 == 14) {
            class28.method1756(class143.field2221, class143.field2222, class143.field2302);
        } else if (arg0 == 16) {
            class28.method1756(class143.field2369, class143.field2225, class143.field2226);
        } else if (arg0 == 17) {
            class28.method1756(class143.field2227, class143.field2326, class143.field2229);
        } else if (arg0 == 18) {
            class28.method1756(class143.field2230, class143.field2231, class143.field2297);
        } else if (arg0 == 19) {
            class28.method1756(class143.field2233, class143.field2274, class143.field2235);
        } else if (arg0 == 20) {
            class28.method1756(class143.field2315, class143.field2184, class143.field2238);
        } else if (arg0 == 22) {
            class28.method1756(class143.field2239, class143.field2308, class143.field2241);
        } else if (arg0 == 23) {
            class28.method1756(class143.field2242, class143.field2243, class143.field2244);
        } else if (arg0 == 24) {
            class28.method1756(class143.field2140, class143.field2347, class143.field2247);
        } else if (arg0 == 25) {
            class28.method1756(class143.field2248, class143.field2249, class143.field2250);
        } else if (arg0 == 26) {
            class28.method1756(class143.field2251, class143.field2349, class143.field2245);
        } else if (arg0 == 27) {
            class28.method1756(class143.field2254, class143.field2255, class143.field2277);
        } else if (arg0 == 31) {
            class28.method1756(class143.field2148, class143.field2219, class143.field2264);
        } else if (arg0 == 32) {
            class28.method1756(class143.field2183, class143.field2267, class143.field2252);
        } else if (arg0 == 37) {
            class28.method1756(class143.field2269, class143.field2270, class143.field2271);
        } else if (arg0 == 38) {
            class28.method1756(class143.field2272, class143.field2152, class143.field2246);
        } else if (arg0 == 55) {
            class28.method1756(class143.field2275, class143.field2276, class143.field2265);
        } else if (arg0 == 56) {
            class28.method1756(class143.field2278, class143.field2210, class143.field2280);
            method2320(11);
            return;
        } else if (arg0 == 57) {
            class28.method1756(class143.field2281, class143.field2282, class143.field2283);
            method2320(11);
            return;
        } else {
            class28.method1756(class143.field2318, class143.field2285, class143.field2286);
        }
        method2320(10);
    }

    @ObfuscatedName("f.p(B)V")
    public static final void method162() {
        if (Statics.field436 != null) {
            Statics.field436.method2551();
            Statics.field436 = null;
        }
        method5();
        Statics.field199.method1608();
        for (int var0 = 0; var0 < 4; var0++) {
            field418[var0].method3471();
        }
        System.gc();
        class162.field2718 = 1;
        Statics.field560 = null;
        Statics.field2723 = -1;
        Statics.field2663 = -1;
        Statics.field2719 = 0;
        Statics.field2714 = false;
        Statics.field2720 = 2;
        field457 = -1;
        field240 = false;
        for (class20 var1 = (class20) class20.field542.method3196(); var1 != null; var1 = (class20) class20.field542.method3206()) {
            if (var1.field540 != null) {
                Statics.field1060.method954(var1.field540);
                var1.field540 = null;
            }
            if (var1.field552 != null) {
                Statics.field1060.method954(var1.field552);
                var1.field552 = null;
            }
        }
        class20.field542.method3191();
        method2320(10);
    }

    @ObfuscatedName("s.z(I)V")
    public static final void method5() {
        class41.field968.method3127();
        class37.method167();
        class40.field940.method3127();
        class36.field831.method3127();
        class36.field832.method3127();
        class36.field833.method3127();
        class36.field834.method3127();
        class35.field789.method3127();
        class35.field790.method3127();
        class45.method482();
        class38.field914.method3127();
        class38.field899.method3127();
        class39.field919.method3127();
        class39.field920.method3127();
        class42.field977.method3127();
        class46.field1057.method3127();
        class158.field2677.method3127();
        class153.method584();
        ((class88) Statics.field1480).method1843();
        class19.field525.method3127();
        Statics.field1912.method2680();
        Statics.field573.method2680();
        Statics.field894.method2680();
        Statics.field1823.method2680();
        Statics.field1278.method2680();
        Statics.field1569.method2680();
        Statics.field576.method2680();
        Statics.field273.method2680();
        Statics.field2458.method2680();
        Statics.field610.method2680();
        Statics.field641.method2680();
        Statics.field1803.method2680();
    }

    @ObfuscatedName("ar.q(I)V")
    public static final void method581() {
        if (field290 > 0) {
            method162();
        } else {
            method2320(40);
            Statics.field2112 = Statics.field436;
            Statics.field436 = null;
        }
    }

    @ObfuscatedName("cd.i(I)V")
    public static final void method1759() {
        if (Statics.field162 != null) {
            Statics.field162.method977();
        }
        if (Statics.field826 != null) {
            Statics.field826.method977();
        }
    }

    @ObfuscatedName("aa.ah(B)V")
    public static final void method575() {
        for (int var0 = 0; var0 < field482; var0++) {
            int var10002 = field481[var0]--;
            if (field481[var0] >= -10) {
                class52 var2 = field487[var0];
                if (var2 == null) {
                    class52 var10000 = (class52) null;
                    var2 = class52.method1032(Statics.field1823, field483[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field481[var0] += var2.method1033();
                    field487[var0] = var2;
                }
                if (field481[var0] < 0) {
                    int var9;
                    if (field486[var0] == 0) {
                        var9 = field480;
                    } else {
                        int var3 = (field486[var0] & 0xFF) * 128;
                        int var4 = field486[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field628.field771;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field486[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field628.field721;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field481[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field435 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method1030().method1073(Statics.field120);
                        class58 var11 = class58.method1100(var10, 100, var9);
                        var11.method1103(field484[var0] - 1);
                        Statics.field1060.method933(var11);
                    }
                    field481[var0] = -100;
                }
            } else {
                field482--;
                for (int var1 = var0; var1 < field482; var1++) {
                    field483[var1] = field483[var1 + 1];
                    field487[var1] = field487[var1 + 1];
                    field484[var1] = field484[var1 + 1];
                    field481[var1] = field481[var1 + 1];
                    field486[var1] = field486[var1 + 1];
                }
                var0--;
            }
        }
        if (!field240) {
            return;
        }
        boolean var12;
        if (class162.field2718 == 0) {
            var12 = Statics.field2522.method3011();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field477 != 0 && field457 != -1) {
                class162.method1421(Statics.field1569, field457, 0, field477, false);
            }
            field240 = false;
        }
    }

    @ObfuscatedName("el.aj(Lac;IIII)V")
    public static void method2644(class38 arg0, int arg1, int arg2, int arg3) {
        if (field482 >= 50 || field435 == 0 || arg0.field903 == null || arg1 >= arg0.field903.length) {
            return;
        }
        int var4 = arg0.field903[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field483[field482] = var5;
        field484[field482] = var6;
        field481[field482] = 0;
        field487[field482] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field486[field482] = (var8 << 16) + (var9 << 8) + var7;
        field482++;
    }

    @ObfuscatedName("ap.aq(II)V")
    public static void method622(int arg0) {
        if (arg0 == -1 && !field240) {
            class162.method1755();
        } else if (arg0 != -1 && field457 != arg0 && field477 != 0 && !field240) {
            class148 var1 = Statics.field1569;
            int var2 = field477;
            class162.field2718 = 1;
            Statics.field560 = var1;
            Statics.field2723 = arg0;
            Statics.field2663 = 0;
            Statics.field2719 = var2;
            Statics.field2714 = false;
            Statics.field2720 = 2;
        }
        field457 = arg0;
    }

    @ObfuscatedName("at.ar(III)V")
    public static final void method590(int arg0, int arg1) {
        if (field379 != 0 && field379 != 3 || class127.field1997 != 1 && Statics.field2473 || class127.field1997 != 4) {
            return;
        }
        int var2 = class127.field1998 - 25 - arg0;
        int var3 = class127.field1999 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field478 + field322 & 0x7FF;
        int var5 = class84.field1461[var4];
        int var6 = class84.field1484[var4];
        int var7 = (field243 + 256) * var5 >> 8;
        int var8 = (field243 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field628.field771 + var9 >> 7;
        int var12 = Statics.field628.field721 - var10 >> 7;
        field361.method2334(187);
        field361.method2087(18);
        field361.method2197(class124.field1957[82] ? (class124.field1957[81] ? 2 : 1) : 0);
        field361.method2088(Statics.field2103 + var11);
        field361.method2209(Statics.field88 + var12);
        field361.method2087(var2);
        field361.method2087(var3);
        field361.method2088(field478);
        field361.method2087(57);
        field361.method2087(field322);
        field361.method2087(field243);
        field361.method2087(89);
        field361.method2088(Statics.field628.field771);
        field361.method2088(Statics.field628.field721);
        field361.method2087(63);
        field256 = var11;
        field475 = var12;
    }

    @ObfuscatedName("bh.at(I)V")
    public static final void method1606() {
        int var0 = field306 + Statics.field628.field771;
        int var1 = field308 + Statics.field628.field721;
        if (Statics.field75 - var0 < -500 || Statics.field75 - var0 > 500 || Statics.field165 - var1 < -500 || Statics.field165 - var1 > 500) {
            Statics.field75 = var0;
            Statics.field165 = var1;
        }
        if (Statics.field75 != var0) {
            Statics.field75 += (var0 - Statics.field75) / 16;
        }
        if (Statics.field165 != var1) {
            Statics.field165 += (var1 - Statics.field165) / 16;
        }
        if (class127.field1985 == 4 && Statics.field2473) {
            int var2 = class127.field1988 - field331;
            field329 = var2 * 2;
            field331 = var2 == -1 || var2 == 1 ? class127.field1988 : (field331 + class127.field1988) / 2;
            int var3 = field330 - class127.field1992;
            field380 = var3 * 2;
            field330 = var3 == -1 || var3 == 1 ? class127.field1992 : (field330 + class127.field1992) / 2;
        } else {
            if (class124.field1957[96]) {
                field380 += (-24 - field380) / 2;
            } else if (class124.field1957[97]) {
                field380 += (24 - field380) / 2;
            } else {
                field380 /= 2;
            }
            if (class124.field1957[98]) {
                field329 += (12 - field329) / 2;
            } else if (class124.field1957[99]) {
                field329 += (-12 - field329) / 2;
            } else {
                field329 /= 2;
            }
            field331 = class127.field1988;
            field330 = class127.field1992;
        }
        field478 = field380 / 2 + field478 & 0x7FF;
        field291 += field329 / 2;
        if (field291 < 128) {
            field291 = 128;
        }
        if (field291 > 383) {
            field291 = 383;
        }
        int var4 = Statics.field75 >> 7;
        int var5 = Statics.field165 >> 7;
        int var6 = method79(Statics.field75, Statics.field165, Statics.field59);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field59;
                    if (var10 < 3 && (class6.field66[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field65[var10][var8][var9];
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
        if (var12 > field334) {
            field334 += (var12 - field334) / 24;
        } else if (var12 < field334) {
            field334 += (var12 - field334) / 80;
        }
    }

    @ObfuscatedName("j.av(I)V")
    public static final void method78() {
        for (int var0 = 0; var0 < field357; var0++) {
            int var1 = field281[var0];
            class30 var2 = field279[var1];
            if (var2 != null) {
                method535(var2, var2.field689.field799);
            }
        }
    }

    @ObfuscatedName("i.af(Lav;IB)V")
    public static final void method535(class33 arg0, int arg1) {
        if (arg0.field765 > field251) {
            int var2 = arg0.field765 - field251;
            int var3 = arg0.field764 * 64 + arg0.field747 * 128;
            int var4 = arg0.field764 * 64 + arg0.field763 * 128;
            arg0.field771 += (var3 - arg0.field771) / var2;
            arg0.field721 += (var4 - arg0.field721) / var2;
            arg0.field725 = 0;
            if (arg0.field767 == 0) {
                arg0.field720 = 1024;
            }
            if (arg0.field767 == 1) {
                arg0.field720 = 1536;
            }
            if (arg0.field767 == 2) {
                arg0.field720 = 0;
            }
            if (arg0.field767 == 3) {
                arg0.field720 = 512;
            }
        } else if (arg0.field753 >= field251) {
            method98(arg0);
        } else {
            method148(arg0);
        }
        if (arg0.field771 < 128 || arg0.field721 < 128 || arg0.field771 >= 13184 || arg0.field721 >= 13184) {
            arg0.field751 = -1;
            arg0.field723 = -1;
            arg0.field765 = 0;
            arg0.field753 = 0;
            arg0.field771 = arg0.field774[0] * 128 + arg0.field764 * 64;
            arg0.field721 = arg0.field775[0] * 128 + arg0.field764 * 64;
            arg0.method599();
        }
        if (Statics.field628 == arg0 && (arg0.field771 < 1536 || arg0.field721 < 1536 || arg0.field771 >= 11776 || arg0.field721 >= 11776)) {
            arg0.field751 = -1;
            arg0.field723 = -1;
            arg0.field765 = 0;
            arg0.field753 = 0;
            arg0.field771 = arg0.field774[0] * 128 + arg0.field764 * 64;
            arg0.field721 = arg0.field775[0] * 128 + arg0.field764 * 64;
            arg0.method599();
        }
        if (arg0.field722 != 0) {
            if (arg0.field745 != -1 && arg0.field745 < 32768) {
                class30 var5 = field279[arg0.field745];
                if (var5 != null) {
                    int var6 = arg0.field771 - var5.field771;
                    int var7 = arg0.field721 - var5.field721;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field720 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field745 >= 32768) {
                int var8 = arg0.field745 - 32768;
                if (field368 == var8) {
                    var8 = 2047;
                }
                class3 var9 = field386[var8];
                if (var9 != null) {
                    int var10 = arg0.field771 - var9.field771;
                    int var11 = arg0.field721 - var9.field721;
                    if (var10 != 0 || var11 != 0) {
                        arg0.field720 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field746 != 0 || arg0.field755 != 0) && (arg0.field773 == 0 || arg0.field725 > 0)) {
                int var12 = arg0.field771 - (arg0.field746 * 64 - Statics.field2103 * 64 - Statics.field2103 * 64);
                int var13 = arg0.field721 - (arg0.field755 * 64 - Statics.field88 * 64 - Statics.field88 * 64);
                if (var12 != 0 || var13 != 0) {
                    arg0.field720 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                }
                arg0.field746 = 0;
                arg0.field755 = 0;
            }
            int var14 = arg0.field720 - arg0.field766 & 0x7FF;
            if (var14 == 0) {
                arg0.field724 = 0;
            } else {
                arg0.field724++;
                if (var14 > 1024) {
                    arg0.field766 -= arg0.field722;
                    boolean var15 = true;
                    if (var14 < arg0.field722 || var14 > 2048 - arg0.field722) {
                        arg0.field766 = arg0.field720;
                        var15 = false;
                    }
                    if (arg0.field770 == arg0.field756 && (arg0.field724 > 25 || var15)) {
                        if (arg0.field726 == -1) {
                            arg0.field770 = arg0.field728;
                        } else {
                            arg0.field770 = arg0.field726;
                        }
                    }
                } else {
                    arg0.field766 += arg0.field722;
                    boolean var16 = true;
                    if (var14 < arg0.field722 || var14 > 2048 - arg0.field722) {
                        arg0.field766 = arg0.field720;
                        var16 = false;
                    }
                    if (arg0.field770 == arg0.field756 && (arg0.field724 > 25 || var16)) {
                        if (arg0.field727 == -1) {
                            arg0.field770 = arg0.field728;
                        } else {
                            arg0.field770 = arg0.field727;
                        }
                    }
                }
                arg0.field766 &= 0x7FF;
            }
        }
        method2031(arg0);
    }

    @ObfuscatedName("v.ap(Lav;B)V")
    public static final void method98(class33 arg0) {
        if (field251 == arg0.field753 || arg0.field751 == -1 || arg0.field754 != 0 || arg0.field778 + 1 > class38.method114(arg0.field751).field895[arg0.field752]) {
            int var1 = arg0.field753 - arg0.field765;
            int var2 = field251 - arg0.field765;
            int var3 = arg0.field764 * 64 + arg0.field747 * 128;
            int var4 = arg0.field764 * 64 + arg0.field763 * 128;
            int var5 = arg0.field764 * 64 + arg0.field762 * 128;
            int var6 = arg0.field764 * 64 + arg0.field733 * 128;
            arg0.field771 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field721 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field725 = 0;
        if (arg0.field767 == 0) {
            arg0.field720 = 1024;
        }
        if (arg0.field767 == 1) {
            arg0.field720 = 1536;
        }
        if (arg0.field767 == 2) {
            arg0.field720 = 0;
        }
        if (arg0.field767 == 3) {
            arg0.field720 = 512;
        }
        arg0.field766 = arg0.field720;
    }

    @ObfuscatedName("o.ao(Lav;B)V")
    public static final void method148(class33 arg0) {
        arg0.field770 = arg0.field756;
        if (arg0.field773 == 0) {
            arg0.field725 = 0;
            return;
        }
        if (arg0.field751 != -1 && arg0.field754 == 0) {
            class38 var1 = class38.method114(arg0.field751);
            if (arg0.field761 > 0 && var1.field911 == 0) {
                arg0.field725++;
                return;
            }
            if (arg0.field761 <= 0 && var1.field908 == 0) {
                arg0.field725++;
                return;
            }
        }
        int var2 = arg0.field771;
        int var3 = arg0.field721;
        int var4 = arg0.field774[arg0.field773 - 1] * 128 + arg0.field764 * 64;
        int var5 = arg0.field775[arg0.field773 - 1] * 128 + arg0.field764 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field771 = var4;
            arg0.field721 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field720 = 1280;
            } else if (var3 > var5) {
                arg0.field720 = 1792;
            } else {
                arg0.field720 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field720 = 768;
            } else if (var3 > var5) {
                arg0.field720 = 256;
            } else {
                arg0.field720 = 512;
            }
        } else if (var3 < var5) {
            arg0.field720 = 1024;
        } else if (var3 > var5) {
            arg0.field720 = 0;
        }
        int var6 = arg0.field720 - arg0.field766 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field729;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field728;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field731;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field768;
        }
        if (var7 == -1) {
            var7 = arg0.field728;
        }
        arg0.field770 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class30) {
            var9 = ((class30) arg0).field689.field792;
        }
        if (var9) {
            if (arg0.field766 != arg0.field720 && arg0.field745 == -1 && arg0.field722 != 0) {
                var8 = 2;
            }
            if (arg0.field773 > 2) {
                var8 = 6;
            }
            if (arg0.field773 > 3) {
                var8 = 8;
            }
            if (arg0.field725 > 0 && arg0.field773 > 1) {
                var8 = 8;
                arg0.field725--;
            }
        } else {
            if (arg0.field773 > 1) {
                var8 = 6;
            }
            if (arg0.field773 > 2) {
                var8 = 8;
            }
            if (arg0.field725 > 0 && arg0.field773 > 1) {
                var8 = 8;
                arg0.field725--;
            }
        }
        if (arg0.field779[arg0.field773 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field770 == arg0.field728 && arg0.field730 != -1) {
            arg0.field770 = arg0.field730;
        }
        if (var2 < var4) {
            arg0.field771 += var8;
            if (arg0.field771 > var4) {
                arg0.field771 = var4;
            }
        } else if (var2 > var4) {
            arg0.field771 -= var8;
            if (arg0.field771 < var4) {
                arg0.field771 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field721 += var8;
            if (arg0.field721 > var5) {
                arg0.field721 = var5;
            }
        } else if (var3 > var5) {
            arg0.field721 -= var8;
            if (arg0.field721 < var5) {
                arg0.field721 = var5;
            }
        }
        if (arg0.field771 == var4 && arg0.field721 == var5) {
            arg0.field773--;
            if (arg0.field761 > 0) {
                arg0.field761--;
            }
        }
    }

    @ObfuscatedName("cy.az(Lav;I)V")
    public static final void method2031(class33 arg0) {
        arg0.field739 = false;
        if (arg0.field770 != -1) {
            class38 var1 = class38.method114(arg0.field770);
            if (var1 == null || var1.field900 == null) {
                arg0.field770 = -1;
            } else {
                arg0.field750++;
                if (arg0.field749 < var1.field900.length && arg0.field750 > var1.field895[arg0.field749]) {
                    arg0.field750 = 1;
                    arg0.field749++;
                    method2644(var1, arg0.field749, arg0.field771, arg0.field721);
                }
                if (arg0.field749 >= var1.field900.length) {
                    arg0.field750 = 0;
                    arg0.field749 = 0;
                    method2644(var1, arg0.field749, arg0.field771, arg0.field721);
                }
            }
        }
        if (arg0.field723 != -1 && field251 >= arg0.field732) {
            if (arg0.field757 < 0) {
                arg0.field757 = 0;
            }
            int var2 = class39.method3306(arg0.field723).field917;
            if (var2 == -1) {
                arg0.field723 = -1;
            } else {
                class38 var3 = class38.method114(var2);
                if (var3 == null || var3.field900 == null) {
                    arg0.field723 = -1;
                } else {
                    arg0.field758++;
                    if (arg0.field757 < var3.field900.length && arg0.field758 > var3.field895[arg0.field757]) {
                        arg0.field758 = 1;
                        arg0.field757++;
                        method2644(var3, arg0.field757, arg0.field771, arg0.field721);
                    }
                    if (arg0.field757 >= var3.field900.length && (arg0.field757 < 0 || arg0.field757 >= var3.field900.length)) {
                        arg0.field723 = -1;
                    }
                }
            }
        }
        if (arg0.field751 != -1 && arg0.field754 <= 1) {
            class38 var4 = class38.method114(arg0.field751);
            if (var4.field911 == 1 && arg0.field761 > 0 && arg0.field765 <= field251 && arg0.field753 < field251) {
                arg0.field754 = 1;
                return;
            }
        }
        if (arg0.field751 != -1 && arg0.field754 == 0) {
            class38 var5 = class38.method114(arg0.field751);
            if (var5 == null || var5.field900 == null) {
                arg0.field751 = -1;
            } else {
                arg0.field778++;
                if (arg0.field752 < var5.field900.length && arg0.field778 > var5.field895[arg0.field752]) {
                    arg0.field778 = 1;
                    arg0.field752++;
                    method2644(var5, arg0.field752, arg0.field771, arg0.field721);
                }
                if (arg0.field752 >= var5.field900.length) {
                    arg0.field752 -= var5.field902;
                    arg0.field759++;
                    if (arg0.field759 >= var5.field910) {
                        arg0.field751 = -1;
                    } else if (arg0.field752 >= 0 && arg0.field752 < var5.field900.length) {
                        method2644(var5, arg0.field752, arg0.field771, arg0.field721);
                    } else {
                        arg0.field751 = -1;
                    }
                }
                arg0.field739 = var5.field906;
            }
        }
        if (arg0.field754 > 0) {
            arg0.field754--;
        }
    }

    @ObfuscatedName("de.ac(Lh;III)V")
    public static void method2321(class3 arg0, int arg1, int arg2) {
        if (arg0.field751 == arg1 && arg1 != -1) {
            int var3 = class38.method114(arg1).field913;
            if (var3 == 1) {
                arg0.field752 = 0;
                arg0.field778 = 0;
                arg0.field754 = arg2;
                arg0.field759 = 0;
            }
            if (var3 == 2) {
                arg0.field759 = 0;
            }
        } else if (arg1 == -1 || arg0.field751 == -1 || class38.method114(arg1).field912 >= class38.method114(arg0.field751).field912) {
            arg0.field751 = arg1;
            arg0.field752 = 0;
            arg0.field778 = 0;
            arg0.field754 = arg2;
            arg0.field759 = 0;
            arg0.field761 = arg0.field773;
        }
    }

    @ObfuscatedName("h.ad(Ljava/lang/String;ZI)V")
    public static final void method27(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field998.method3316(arg0, 250);
        int var6 = Statics.field998.method3317(arg0, 250) * 13;
        class73.method1527(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1522(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field998.method3337(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method493(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method160(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field2027.getGraphics();
            Statics.field1114.method1351(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field2027.repaint();
        }
    }

    @ObfuscatedName("fk.al(IIIII)V")
    public static final void method2910(int arg0, int arg1, int arg2, int arg3) {
        class73.method1521(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class84.method1765();
        field346++;
        method798(class29.field682);
        boolean var4 = false;
        if (field376 >= 0) {
            for (int var5 = 0; var5 < field259; var5++) {
                if (field376 == field364[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method798(class29.field680);
        }
        method832(true);
        method798(var4 ? class29.field687 : class29.field679);
        method832(false);
        method568();
        for (class26 var6 = (class26) field453.method3196(); var6 != null; var6 = (class26) field453.method3206()) {
            if (Statics.field59 != var6.field619 || var6.field617) {
                var6.method3280();
            } else if (field251 >= var6.field629) {
                var6.method534(field280);
                if (var6.field617) {
                    var6.method3280();
                } else {
                    Statics.field199.method1628(var6.field619, var6.field620, var6.field621, var6.field622, 60, var6, 0, -1, false);
                }
            }
        }
        if (!field488) {
            int var7 = field291;
            if (field334 / 256 > var7) {
                var7 = field334 / 256;
            }
            if (field363[4] && field491[4] + 128 > var7) {
                var7 = field491[4] + 128;
            }
            int var8 = field478 + field310 & 0x7FF;
            int var9 = Statics.field75;
            int var10 = method79(Statics.field628.field771, Statics.field628.field721, Statics.field59) - 50;
            int var11 = Statics.field165;
            int var12 = var7 * 3 + 600;
            int var13 = 2048 - var7 & 0x7FF;
            int var14 = 2048 - var8 & 0x7FF;
            int var15 = 0;
            int var16 = 0;
            int var17 = var12;
            if (var13 != 0) {
                int var18 = class84.field1461[var13];
                int var19 = class84.field1484[var13];
                int var20 = var16 * var19 - var12 * var18 >> 16;
                var17 = var16 * var18 + var12 * var19 >> 16;
                var16 = var20;
            }
            if (var14 != 0) {
                int var21 = class84.field1461[var14];
                int var22 = class84.field1484[var14];
                int var23 = var15 * var22 + var17 * var21 >> 16;
                var17 = var17 * var22 - var15 * var21 >> 16;
                var15 = var23;
            }
            Statics.field226 = var9 - var15;
            Statics.field223 = var10 - var16;
            Statics.field167 = var11 - var17;
            Statics.field547 = var7;
            Statics.field2393 = var8;
        }
        int var36;
        if (field488) {
            int var37;
            if (Statics.field1979.field122) {
                var37 = Statics.field59;
            } else {
                int var38 = method79(Statics.field226, Statics.field167, Statics.field59);
                if (var38 - Statics.field223 >= 800 || (class6.field66[Statics.field59][Statics.field226 >> 7][Statics.field167 >> 7] & 0x4) == 0) {
                    var37 = 3;
                } else {
                    var37 = Statics.field59;
                }
            }
            var36 = var37;
        } else {
            int var24;
            if (Statics.field1979.field122) {
                var24 = Statics.field59;
            } else {
                int var25 = 3;
                if (Statics.field547 < 310) {
                    int var26 = Statics.field226 >> 7;
                    int var27 = Statics.field167 >> 7;
                    int var28 = Statics.field628.field771 >> 7;
                    int var29 = Statics.field628.field721 >> 7;
                    if ((class6.field66[Statics.field59][var26][var27] & 0x4) != 0) {
                        var25 = Statics.field59;
                    }
                    int var30;
                    if (var28 > var26) {
                        var30 = var28 - var26;
                    } else {
                        var30 = var26 - var28;
                    }
                    int var31;
                    if (var29 > var27) {
                        var31 = var29 - var27;
                    } else {
                        var31 = var27 - var29;
                    }
                    if (var30 > var31) {
                        int var32 = var31 * 65536 / var30;
                        int var33 = 32768;
                        while (var26 != var28) {
                            if (var26 < var28) {
                                var26++;
                            } else if (var26 > var28) {
                                var26--;
                            }
                            if ((class6.field66[Statics.field59][var26][var27] & 0x4) != 0) {
                                var25 = Statics.field59;
                            }
                            var33 += var32;
                            if (var33 >= 65536) {
                                var33 -= 65536;
                                if (var27 < var29) {
                                    var27++;
                                } else if (var27 > var29) {
                                    var27--;
                                }
                                if ((class6.field66[Statics.field59][var26][var27] & 0x4) != 0) {
                                    var25 = Statics.field59;
                                }
                            }
                        }
                    } else {
                        int var34 = var30 * 65536 / var31;
                        int var35 = 32768;
                        while (var27 != var29) {
                            if (var27 < var29) {
                                var27++;
                            } else if (var27 > var29) {
                                var27--;
                            }
                            if ((class6.field66[Statics.field59][var26][var27] & 0x4) != 0) {
                                var25 = Statics.field59;
                            }
                            var35 += var34;
                            if (var35 >= 65536) {
                                var35 -= 65536;
                                if (var26 < var28) {
                                    var26++;
                                } else if (var26 > var28) {
                                    var26--;
                                }
                                if ((class6.field66[Statics.field59][var26][var27] & 0x4) != 0) {
                                    var25 = Statics.field59;
                                }
                            }
                        }
                    }
                }
                if ((class6.field66[Statics.field59][Statics.field628.field771 >> 7][Statics.field628.field721 >> 7] & 0x4) != 0) {
                    var25 = Statics.field59;
                }
                var24 = var25;
            }
            var36 = var24;
        }
        int var39 = Statics.field226;
        int var40 = Statics.field223;
        int var41 = Statics.field167;
        int var42 = Statics.field547;
        int var43 = Statics.field2393;
        for (int var44 = 0; var44 < 5; var44++) {
            if (field363[var44]) {
                int var45 = (int) (Math.random() * (double) (field490[var44] * 2 + 1) - (double) field490[var44] + Math.sin((double) field492[var44] / 100.0D * (double) field402[var44]) * (double) field491[var44]);
                if (var44 == 0) {
                    Statics.field226 += var45;
                }
                if (var44 == 1) {
                    Statics.field223 += var45;
                }
                if (var44 == 2) {
                    Statics.field167 += var45;
                }
                if (var44 == 3) {
                    Statics.field2393 = Statics.field2393 + var45 & 0x7FF;
                }
                if (var44 == 4) {
                    Statics.field547 += var45;
                    if (Statics.field547 < 128) {
                        Statics.field547 = 128;
                    }
                    if (Statics.field547 > 383) {
                        Statics.field547 = 383;
                    }
                }
            }
        }
        int var46 = class127.field1992;
        int var47 = class127.field1988;
        if (class127.field1997 != 0) {
            var46 = class127.field1998;
            var47 = class127.field1999;
        }
        if (var46 >= arg0 && var46 < arg0 + arg2 && var47 >= arg1 && var47 < arg1 + arg3) {
            class98.field1746 = true;
            class98.field1749 = 0;
            class98.field1747 = var46 - arg0;
            class98.field1707 = var47 - arg1;
        } else {
            class98.field1746 = false;
            class98.field1749 = 0;
        }
        method1759();
        class73.method1527(arg0, arg1, arg2, arg3, 0);
        method1759();
        Statics.field199.method1645(Statics.field226, Statics.field223, Statics.field167, Statics.field547, Statics.field2393, var36);
        method1759();
        Statics.field199.method1622();
        field315 = 0;
        boolean var48 = false;
        int var49 = -1;
        for (int var50 = -1; var50 < field357 + field259; var50++) {
            class33 var51;
            if (var50 == -1) {
                var51 = Statics.field628;
            } else if (var50 < field259) {
                var51 = field386[field364[var50]];
                if (field376 == field364[var50]) {
                    var48 = true;
                    var49 = var50;
                    continue;
                }
            } else {
                var51 = field279[field281[var50 - field259]];
            }
            method9(var51, var50, arg0, arg1, arg2, arg3);
        }
        if (var48) {
            method9(field386[field376], var49, arg0, arg1, arg2, arg3);
        }
        for (int var52 = 0; var52 < field315; var52++) {
            int var53 = field337[var52];
            int var54 = field338[var52];
            int var55 = field444[var52];
            int var56 = field339[var52];
            boolean var57 = true;
            while (var57) {
                var57 = false;
                for (int var58 = 0; var58 < var52; var58++) {
                    if (var54 + 2 > field338[var58] - field339[var58] && var54 - var56 < field338[var58] + 2 && var53 - var55 < field444[var58] + field337[var58] && var53 + var55 > field337[var58] - field444[var58] && field338[var58] - field339[var58] < var54) {
                        var54 = field338[var58] - field339[var58];
                        var57 = true;
                    }
                }
            }
            field347 = field337[var52];
            field348 = field338[var52] = var54;
            String var59 = field344[var52];
            if (field407 == 0) {
                int var60 = 16776960;
                if (field341[var52] < 6) {
                    var60 = field249[field341[var52]];
                }
                if (field341[var52] == 6) {
                    var60 = field346 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field341[var52] == 7) {
                    var60 = field346 % 20 < 10 ? 255 : 65535;
                }
                if (field341[var52] == 8) {
                    var60 = field346 % 20 < 10 ? 45056 : 8454016;
                }
                if (field341[var52] == 9) {
                    int var61 = 150 - field246[var52];
                    if (var61 < 50) {
                        var60 = var61 * 1280 + 16711680;
                    } else if (var61 < 100) {
                        var60 = 16776960 - (var61 - 50) * 327680;
                    } else if (var61 < 150) {
                        var60 = (var61 - 100) * 5 + 65280;
                    }
                }
                if (field341[var52] == 10) {
                    int var62 = 150 - field246[var52];
                    if (var62 < 50) {
                        var60 = var62 * 5 + 16711680;
                    } else if (var62 < 100) {
                        var60 = 16711935 - (var62 - 50) * 327680;
                    } else if (var62 < 150) {
                        var60 = (var62 - 100) * 327680 + 255 - (var62 - 100) * 5;
                    }
                }
                if (field341[var52] == 11) {
                    int var63 = 150 - field246[var52];
                    if (var63 < 50) {
                        var60 = 16777215 - var63 * 327685;
                    } else if (var63 < 100) {
                        var60 = (var63 - 50) * 327685 + 65280;
                    } else if (var63 < 150) {
                        var60 = 16777215 - (var63 - 100) * 327680;
                    }
                }
                if (field335[var52] == 0) {
                    Statics.field611.method3321(var59, field347 + arg0, field348 + arg1, var60, 0);
                }
                if (field335[var52] == 1) {
                    Statics.field611.method3323(var59, field347 + arg0, field348 + arg1, var60, 0, field346);
                }
                if (field335[var52] == 2) {
                    Statics.field611.method3324(var59, field347 + arg0, field348 + arg1, var60, 0, field346);
                }
                if (field335[var52] == 3) {
                    Statics.field611.method3325(var59, field347 + arg0, field348 + arg1, var60, 0, field346, 150 - field246[var52]);
                }
                if (field335[var52] == 4) {
                    int var64 = (150 - field246[var52]) * (Statics.field611.method3314(var59) + 100) / 150;
                    class73.method1542(field347 + arg0 - 50, arg1, field347 + arg0 + 50, arg1 + arg3);
                    Statics.field611.method3319(var59, field347 + arg0 + 50 - var64, field348 + arg1, var60, 0);
                    class73.method1521(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field335[var52] == 5) {
                    int var65 = 150 - field246[var52];
                    int var66 = 0;
                    if (var65 < 25) {
                        var66 = var65 - 25;
                    } else if (var65 > 125) {
                        var66 = var65 - 125;
                    }
                    class73.method1542(arg0, field348 + arg1 - Statics.field611.field2914 - 1, arg0 + arg2, field348 + arg1 + 5);
                    Statics.field611.method3321(var59, field347 + arg0, field348 + arg1 + var66, var60, 0);
                    class73.method1521(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field611.method3321(var59, field347 + arg0, field348 + arg1, 16776960, 0);
            }
        }
        method779(arg0, arg1);
        ((class88) Statics.field1480).method1841(field280);
        if (field352 == 1) {
            Statics.field2439[field420 / 100].method1440(field349 - 8, field350 - 8);
        }
        if (field352 == 2) {
            Statics.field2439[field420 / 100 + 4].method1440(field349 - 8, field350 - 8);
        }
        method1426();
        if (field257) {
            int var67 = arg0 + 512 - 5;
            int var68 = arg1 + 20;
            Statics.field998.method3320("Fps:" + field2038, var67, var68, 16776960, -1);
            int var72 = var68 + 15;
            Runtime var69 = Runtime.getRuntime();
            int var70 = (int) ((var69.totalMemory() - var69.freeMemory()) / 1024L);
            int var71 = 16776960;
            if (var70 > 32768 && field403) {
                var71 = 16711680;
            }
            if (var70 > 65536 && !field403) {
                var71 = 16711680;
            }
            Statics.field998.method3320("Mem:" + var70 + "k", var67, var72, var71, -1);
            var68 = var72 + 15;
        }
        Statics.field226 = var39;
        Statics.field223 = var40;
        Statics.field167 = var41;
        Statics.field547 = var42;
        Statics.field2393 = var43;
        if (field250 && class151.method2772(true, false) == 0) {
            field250 = false;
        }
        if (field250) {
            class73.method1527(arg0, arg1, arg2, arg3, 0);
            method27(class143.field2306, false);
        }
    }

    @ObfuscatedName("ay.ay(Laq;I)V")
    public static final void method798(class29 arg0) {
        if (Statics.field628.field771 >> 7 == field256 && Statics.field628.field721 >> 7 == field475) {
            field256 = 0;
        }
        int var1 = field259;
        if (class29.field682 == arg0 || class29.field680 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field682 == arg0) {
                var3 = Statics.field628;
                var4 = 33538048;
            } else if (class29.field680 == arg0) {
                var3 = field386[field376];
                var4 = field376 << 14;
            } else {
                var3 = field386[field364[var2]];
                var4 = field364[var2] << 14;
                if (class29.field687 == arg0 && field376 == field364[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method18() && !var3.field49) {
                var3.field50 = false;
                if ((field403 && field259 > 50 || field259 > 200) && class29.field682 != arg0 && var3.field770 == var3.field756) {
                    var3.field50 = true;
                }
                int var5 = var3.field771 >> 7;
                int var6 = var3.field721 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field43 == null || field251 < var3.field37 || field251 >= var3.field46) {
                        if ((var3.field771 & 0x7F) == 64 && (var3.field721 & 0x7F) == 64) {
                            if (field346 == field345[var5][var6]) {
                                continue;
                            }
                            field345[var5][var6] = field346;
                        }
                        var3.field36 = method79(var3.field771, var3.field721, Statics.field59);
                        Statics.field199.method1628(Statics.field59, var3.field771, var3.field721, var3.field36, 60, var3, var3.field766, var4, var3.field739);
                    } else {
                        var3.field50 = false;
                        var3.field36 = method79(var3.field771, var3.field721, Statics.field59);
                        Statics.field199.method1620(Statics.field59, var3.field771, var3.field721, var3.field36, 60, var3, var3.field766, var4, var3.field41, var3.field44, var3.field47, var3.field33);
                    }
                }
            }
        }
    }

    @ObfuscatedName("an.ag(ZI)V")
    public static final void method832(boolean arg0) {
        for (int var1 = 0; var1 < field357; var1++) {
            class30 var2 = field279[field281[var1]];
            int var3 = (field281[var1] << 14) + 536870912;
            if (var2 != null && var2.method18() && var2.field689.field812 == arg0 && var2.field689.method630()) {
                int var4 = var2.field771 >> 7;
                int var5 = var2.field721 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field764 == 1 && (var2.field771 & 0x7F) == 64 && (var2.field721 & 0x7F) == 64) {
                        if (field346 == field345[var4][var5]) {
                            continue;
                        }
                        field345[var4][var5] = field346;
                    }
                    if (!var2.field689.field820) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field199.method1628(Statics.field59, var2.field771, var2.field721, method79(var2.field771 + (var2.field764 * 64 - 64), var2.field721 + (var2.field764 * 64 - 64), Statics.field59), var2.field764 * 64 - 64 + 60, var2, var2.field766, var3, var2.field739);
                }
            }
        }
    }

    @ObfuscatedName("aj.ak(B)V")
    public static final void method568() {
        for (class7 var0 = (class7) field472.method3196(); var0 != null; var0 = (class7) field472.method3206()) {
            if (Statics.field59 != var0.field108 || field251 > var0.field91) {
                var0.method3280();
            } else if (field251 >= var0.field97) {
                if (var0.field99 > 0) {
                    class30 var1 = field279[var0.field99 - 1];
                    if (var1 != null && var1.field771 >= 0 && var1.field771 < 13312 && var1.field721 >= 0 && var1.field721 < 13312) {
                        var0.method89(var1.field771, var1.field721, method79(var1.field771, var1.field721, var0.field108) - var0.field90, field251);
                    }
                }
                if (var0.field99 < 0) {
                    int var2 = -var0.field99 - 1;
                    class3 var3;
                    if (field368 == var2) {
                        var3 = Statics.field628;
                    } else {
                        var3 = field386[var2];
                    }
                    if (var3 != null && var3.field771 >= 0 && var3.field771 < 13312 && var3.field721 >= 0 && var3.field721 < 13312) {
                        var0.method89(var3.field771, var3.field721, method79(var3.field771, var3.field721, var0.field108) - var0.field90, field251);
                    }
                }
                var0.method88(field280);
                Statics.field199.method1628(Statics.field59, (int) var0.field96, (int) var0.field92, (int) var0.field98, 60, var0, var0.field104, -1, false);
            }
        }
    }

    @ObfuscatedName("al.an(III)V")
    public static final void method779(int arg0, int arg1) {
        if (field356 == 2) {
            method101((field294 - Statics.field2103 << 7) + field265, (field263 - Statics.field88 << 7) + field252, field264 * 2);
            if (field347 > -1 && field251 % 20 < 10) {
                Statics.field922[0].method1440(field347 + arg0 - 12, field348 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("s.ab(Lav;IIIIIB)V")
    public static final void method9(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method18()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field689;
            if (var6.field808 != null) {
                var6 = var6.method643();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field259) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field49) {
                return;
            }
            if (var8.field32 != -1 || var8.field38 != -1) {
                method97(arg0, arg0.field769 + 15);
                if (field347 > -1) {
                    if (var8.field32 != -1) {
                        Statics.field1793[var8.field32].method1440(field347 + arg2 - 12, field348 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field38 != -1) {
                        Statics.field907[var8.field38].method1440(field347 + arg2 - 12, field348 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field356 == 10 && field261 == field364[arg1]) {
                method97(arg0, arg0.field769 + 15);
                if (field347 > -1) {
                    Statics.field922[1].method1440(field347 + arg2 - 12, field348 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field689;
            if (var9.field808 != null) {
                var9 = var9.method643();
            }
            if (var9.field815 >= 0 && var9.field815 < Statics.field907.length) {
                method97(arg0, arg0.field769 + 15);
                if (field347 > -1) {
                    Statics.field907[var9.field815].method1440(field347 + arg2 - 12, field348 + arg3 - 30);
                }
            }
            if (field356 == 1 && field260 == field281[arg1 - field259] && field251 % 20 < 10) {
                method97(arg0, arg0.field769 + 15);
                if (field347 > -1) {
                    Statics.field922[0].method1440(field347 + arg2 - 12, field348 + arg3 - 28);
                }
            }
        }
        if (arg0.field748 != null && (arg1 >= field259 || !arg0.field735 && (field458 == 4 || !arg0.field734 && (field458 == 0 || field458 == 3 || field458 == 1 && method2038(((class3) arg0).field42, false))))) {
            method97(arg0, arg0.field769);
            if (field347 > -1 && field315 < field336) {
                field444[field315] = Statics.field611.method3314(arg0.field748) / 2;
                field339[field315] = Statics.field611.field2914;
                field337[field315] = field347;
                field338[field315] = field348;
                field341[field315] = arg0.field737;
                field335[field315] = arg0.field738;
                field246[field315] = arg0.field736;
                field344[field315] = arg0.field748;
                field315++;
            }
        }
        if (arg0.field742 > field251) {
            method97(arg0, arg0.field769 + 15);
            if (field347 > -1) {
                int var10;
                if (arg1 < field259) {
                    var10 = 30;
                } else {
                    class35 var11 = ((class30) arg0).field689;
                    var10 = var11.field823;
                }
                int var12 = arg0.field743 * var10 / arg0.field744;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field743 > 0) {
                    var12 = 1;
                }
                class73.method1527(field347 + arg2 - var10 / 2, field348 + arg3 - 3, var12, 5, 65280);
                class73.method1527(field347 + arg2 - var10 / 2 + var12, field348 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field741[var13] > field251) {
                method97(arg0, arg0.field769 / 2);
                if (field347 > -1) {
                    if (var13 == 1) {
                        field348 -= 20;
                    }
                    if (var13 == 2) {
                        field347 -= 15;
                        field348 -= 10;
                    }
                    if (var13 == 3) {
                        field347 += 15;
                        field348 -= 10;
                    }
                    Statics.field319[arg0.field740[var13]].method1440(field347 + arg2 - 12, field348 + arg3 - 12);
                    Statics.field2480.method3321(Integer.toString(arg0.field777[var13]), field347 + arg2 - 1, field348 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("bt.am(I)V")
    public static final void method1426() {
        field419 = 0;
        int var0 = (Statics.field628.field771 >> 7) + Statics.field2103;
        int var1 = (Statics.field628.field721 >> 7) + Statics.field88;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field419 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field419 = 1;
        }
        if (field419 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field419 = 0;
        }
    }

    @ObfuscatedName("v.aw(Lav;II)V")
    public static final void method97(class33 arg0, int arg1) {
        method101(arg0.field771, arg0.field721, arg1);
    }

    @ObfuscatedName("v.as(IIII)V")
    public static final void method101(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field347 = -1;
            field348 = -1;
            return;
        }
        int var3 = method79(arg0, arg1, Statics.field59) - arg2;
        int var4 = arg0 - Statics.field226;
        int var5 = var3 - Statics.field223;
        int var6 = arg1 - Statics.field167;
        int var7 = class84.field1461[Statics.field547];
        int var8 = class84.field1484[Statics.field547];
        int var9 = class84.field1461[Statics.field2393];
        int var10 = class84.field1484[Statics.field2393];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field347 = (var11 << 9) / var15 + 256;
            field348 = (var14 << 9) / var15 + 167;
        } else {
            field347 = -1;
            field348 = -1;
        }
    }

    @ObfuscatedName("j.au(IIIB)I")
    public static final int method79(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field66[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field65[var5][var3][var4] + class6.field65[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field65[var5][var3][var4 + 1] + class6.field65[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("d.ax(ZI)V")
    public static final void method513(boolean arg0) {
        field303 = arg0;
        if (!field303) {
            int var1 = field285.method2136();
            int var2 = (field286 - field285.field1835) / 16;
            Statics.field2489 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    Statics.field2489[var3][var4] = field285.method2286();
                }
            }
            int var5 = field285.method2134();
            int var6 = field285.method2125();
            int var7 = field285.method2166();
            int var8 = field285.method2134();
            Statics.field1685 = new int[var2];
            Statics.field1893 = new int[var2];
            Statics.field219 = new int[var2];
            Statics.field1663 = new byte[var2][];
            Statics.field616 = new byte[var2][];
            boolean var9 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && var1 / 8 == 48) {
                var9 = true;
            }
            if (var7 / 8 == 48 && var1 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var1 - 6) / 8; var12 <= (var1 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1685[var10] = var13;
                        Statics.field1893[var10] = Statics.field1278.method2682("m" + var11 + "_" + var12);
                        Statics.field219[var10] = Statics.field1278.method2682("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method830(var7, var1, var6, var8, var5);
            return;
        }
        int var14 = field285.method2136();
        field285.method2326();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field285.method2327(1);
                    if (var18 == 1) {
                        field304[var15][var16][var17] = field285.method2327(26);
                    } else {
                        field304[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field285.method2328();
        int var19 = (field286 - field285.field1835) / 16;
        Statics.field2489 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2489[var20][var21] = field285.method2142();
            }
        }
        int var22 = field285.method2134();
        int var23 = field285.method2166();
        int var24 = field285.method2136();
        int var25 = field285.method2101();
        Statics.field1685 = new int[var19];
        Statics.field1893 = new int[var19];
        Statics.field219 = new int[var19];
        Statics.field1663 = new byte[var19][];
        Statics.field616 = new byte[var19][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field304[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1685[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1685[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1893[var26] = Statics.field1278.method2682("m" + var35 + "_" + var36);
                            Statics.field219[var26] = Statics.field1278.method2682("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method830(var23, var24, var25, var14, var22);
    }

    @ObfuscatedName("an.ae(IIIIIB)V")
    public static final void method830(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field606 == arg0 && Statics.field164 == arg1 && field296 == arg2 || !field403) {
            return;
        }
        Statics.field606 = arg0;
        Statics.field164 = arg1;
        field296 = arg2;
        if (!field403) {
            field296 = 0;
        }
        method2320(25);
        method27(class143.field2306, true);
        int var5 = Statics.field2103;
        int var6 = Statics.field88;
        Statics.field2103 = (arg0 - 6) * 8;
        Statics.field88 = (arg1 - 6) * 8;
        int var7 = Statics.field2103 - var5;
        int var8 = Statics.field88 - var6;
        int var9 = Statics.field2103;
        int var10 = Statics.field88;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field279[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field774[var13] -= var7;
                    var12.field775[var13] -= var8;
                }
                var12.field771 -= var7 * 128;
                var12.field721 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field386[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field774[var16] -= var7;
                    var15.field775[var16] -= var8;
                }
                var15.field771 -= var7 * 128;
                var15.field721 -= var8 * 128;
            }
        }
        Statics.field59 = arg2;
        Statics.field628.method605(arg3, arg4, false);
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
                        field377[var27][var23][var24] = field377[var27][var25][var26];
                    } else {
                        field377[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field378.method3196(); var28 != null; var28 = (class15) field378.method3206()) {
            var28.field198 -= var7;
            var28.field205 -= var8;
            if (var28.field198 < 0 || var28.field205 < 0 || var28.field198 >= 104 || var28.field205 >= 104) {
                var28.method3280();
            }
        }
        if (field256 != 0) {
            field256 -= var7;
            field475 -= var8;
        }
        field482 = 0;
        field488 = false;
        field469 = -1;
        field453.method3191();
        field472.method3191();
    }

    @ObfuscatedName("r.ai(ZI)V")
    public static final void method164(boolean arg0) {
        method1759();
        field289++;
        if (field289 < 50 && !arg0) {
            return;
        }
        field289 = 0;
        if (field499 || Statics.field436 == null) {
            return;
        }
        field361.method2334(137);
        try {
            Statics.field436.method2538(field361.field1839, 0, field361.field1835);
            field361.field1835 = 0;
        } catch (IOException var2) {
            field499 = true;
        }
    }

    @ObfuscatedName("n.bc(IIIIII)V")
    public static final void method500(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field199.method1618(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field199.method1718(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2012.field1305;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method2773(var12);
            if (var13.field866 == -1) {
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
                class74 var14 = Statics.field1055[var13.field866];
                if (var14 != null) {
                    int var15 = (var13.field844 * 4 - var14.field1328) / 2;
                    int var16 = (var13.field845 * 4 - var14.field1323) / 2;
                    var14.method1583(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field845) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field199.method1635(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field199.method1718(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method2773(var21);
            if (var22.field866 != -1) {
                class74 var23 = Statics.field1055[var22.field866];
                if (var23 != null) {
                    int var24 = (var22.field844 * 4 - var23.field1328) / 2;
                    int var25 = (var22.field845 * 4 - var23.field1323) / 2;
                    var23.method1583(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field845) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2012.field1305;
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
        int var29 = Statics.field199.method1714(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method2773(var30);
        if (var31.field866 == -1) {
            return;
        }
        class74 var32 = Statics.field1055[var31.field866];
        if (var32 != null) {
            int var33 = (var31.field844 * 4 - var32.field1328) / 2;
            int var34 = (var31.field845 * 4 - var32.field1323) / 2;
            var32.method1583(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field845) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("al.bg(I)Z")
    public static final boolean method767() {
        if (Statics.field436 == null) {
            return false;
        }
        try {
            int var0 = Statics.field436.method2544();
            if (var0 == 0) {
                return false;
            }
            if (field287 == -1) {
                Statics.field436.method2541(field285.field1839, 0, 1);
                field285.field1835 = 0;
                field287 = field285.method2339();
                field286 = class167.field2812[field287];
                var0--;
            }
            if (field286 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field436.method2541(field285.field1839, 0, 1);
                field286 = field285.field1839[0] & 0xFF;
                var0--;
            }
            if (field286 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field436.method2541(field285.field1839, 0, 2);
                field285.field1835 = 0;
                field286 = field285.method2166();
                var0 -= 2;
            }
            if (var0 < field286) {
                return false;
            }
            field285.field1835 = 0;
            Statics.field436.method2541(field285.field1839, 0, field286);
            field288 = 0;
            field326 = field292;
            field292 = field446;
            field446 = field287;
            if (field287 == 147) {
                int var1 = field285.method2134();
                if (var1 == 65535) {
                    var1 = -1;
                }
                method622(var1);
                field287 = -1;
                return true;
            }
            if (field287 == 26) {
                int var2 = field285.method2138();
                int var3 = field285.method2166();
                if (var3 == 65535) {
                    var3 = -1;
                }
                if (field477 != 0 && var3 != -1) {
                    class162.method1421(Statics.field641, var3, 0, field477, false);
                    field240 = true;
                }
                field287 = -1;
                return true;
            }
            if (field287 == 235) {
                field488 = false;
                for (int var4 = 0; var4 < 5; var4++) {
                    field363[var4] = false;
                }
                field287 = -1;
                return true;
            }
            if (field287 == 161) {
                int var5 = field285.method2286();
                int var6 = field285.method2166();
                if (var5 < -70000) {
                    var6 += 32768;
                }
                class153 var7;
                if (var5 >= 0) {
                    var7 = class153.method2362(var5);
                } else {
                    var7 = null;
                }
                if (var7 != null) {
                    for (int var8 = 0; var8 < var7.field2566.length; var8++) {
                        var7.field2566[var8] = 0;
                        var7.field2643[var8] = 0;
                    }
                }
                class14.method135(var6);
                int var9 = field285.method2166();
                for (int var10 = 0; var10 < var9; var10++) {
                    int var11 = field285.method2136();
                    int var12 = field285.method2126();
                    if (var12 == 255) {
                        var12 = field285.method2156();
                    }
                    if (var7 != null && var10 < var7.field2566.length) {
                        var7.field2566[var10] = var11;
                        var7.field2643[var10] = var12;
                    }
                    class14.method800(var6, var10, var11 - 1, var12);
                }
                if (var7 != null) {
                    method1839(var7);
                }
                method176();
                field432[++field433 - 1 & 0x1F] = var6 & 0x7FFF;
                field287 = -1;
                return true;
            }
            if (field287 == 211) {
                Statics.field213 = field285.method2125();
                Statics.field1581 = field285.method2126();
                while (field285.field1835 < field286) {
                    field287 = field285.method2101();
                    method3503();
                }
                field287 = -1;
                return true;
            }
            if (field287 == 68) {
                int var13 = field285.method2166();
                int var14 = field285.method2101();
                int var15 = field285.method2166();
                if (field480 != 0 && var14 != 0 && field482 < 50) {
                    field483[field482] = var13;
                    field484[field482] = var14;
                    field481[field482] = var15;
                    field487[field482] = null;
                    field486[field482] = 0;
                    field482++;
                }
                field287 = -1;
                return true;
            }
            if (field287 == 151) {
                int var19 = field285.method2101();
                int var20 = field285.method2101();
                int var21 = field285.method2101();
                int var22 = field285.method2101();
                field363[var19] = true;
                field490[var19] = var20;
                field491[var19] = var21;
                field492[var19] = var22;
                field402[var19] = 0;
                field287 = -1;
                return true;
            }
            if (field287 == 119) {
                field379 = field285.method2101();
                field287 = -1;
                return true;
            }
            if (field287 == 0) {
                int var23 = field285.method2166();
                int var24 = field285.method2156();
                class153 var25 = class153.method2362(var24);
                if (var25.field2605 != 2 || var25.field2568 != var23) {
                    var25.field2605 = 2;
                    var25.field2568 = var23;
                    method1839(var25);
                }
                field287 = -1;
                return true;
            }
            if (field287 == 248) {
                Statics.field1581 = field285.method2101();
                Statics.field213 = field285.method2090();
                for (int var26 = Statics.field1581; var26 < Statics.field1581 + 8; var26++) {
                    for (int var27 = Statics.field213; var27 < Statics.field213 + 8; var27++) {
                        if (field377[Statics.field59][var26][var27] != null) {
                            field377[Statics.field59][var26][var27] = null;
                            method2386(var26, var27);
                        }
                    }
                }
                for (class15 var28 = (class15) field378.method3196(); var28 != null; var28 = (class15) field378.method3206()) {
                    if (var28.field198 >= Statics.field1581 && var28.field198 < Statics.field1581 + 8 && var28.field205 >= Statics.field213 && var28.field205 < Statics.field213 + 8 && Statics.field59 == var28.field211) {
                        var28.field207 = 0;
                    }
                }
                field287 = -1;
                return true;
            }
            if (field287 == 3) {
                String var29 = field285.method2137();
                int var30 = field285.method2125();
                int var31 = field285.method2090();
                if (var30 >= 1 && var30 <= 8) {
                    if (var29.equalsIgnoreCase("null")) {
                        var29 = null;
                    }
                    field373[var30 - 1] = var29;
                    field325[var30 - 1] = var31 == 0;
                }
                field287 = -1;
                return true;
            }
            if (field287 == 33) {
                field370 = 0;
                field365 = 0;
                field285.method2326();
                int var32 = field285.method2327(8);
                if (var32 < field357) {
                    for (int var33 = var32; var33 < field357; var33++) {
                        field371[++field370 - 1] = field281[var33];
                    }
                }
                if (var32 > field357) {
                    throw new RuntimeException("");
                }
                field357 = 0;
                for (int var34 = 0; var34 < var32; var34++) {
                    int var35 = field281[var34];
                    class30 var36 = field279[var35];
                    int var37 = field285.method2327(1);
                    if (var37 == 0) {
                        field281[++field357 - 1] = var35;
                        var36.field776 = field251;
                    } else {
                        int var38 = field285.method2327(2);
                        if (var38 == 0) {
                            field281[++field357 - 1] = var35;
                            var36.field776 = field251;
                            field255[++field365 - 1] = var35;
                        } else if (var38 == 1) {
                            field281[++field357 - 1] = var35;
                            var36.field776 = field251;
                            int var39 = field285.method2327(3);
                            var36.method598(var39, false);
                            int var40 = field285.method2327(1);
                            if (var40 == 1) {
                                field255[++field365 - 1] = var35;
                            }
                        } else if (var38 == 2) {
                            field281[++field357 - 1] = var35;
                            var36.field776 = field251;
                            int var41 = field285.method2327(3);
                            var36.method598(var41, true);
                            int var42 = field285.method2327(3);
                            var36.method598(var42, true);
                            int var43 = field285.method2327(1);
                            if (var43 == 1) {
                                field255[++field365 - 1] = var35;
                            }
                        } else if (var38 == 3) {
                            field371[++field370 - 1] = var35;
                        }
                    }
                }
                while (field285.method2323(field286) >= 27) {
                    int var44 = field285.method2327(15);
                    if (var44 == 32767) {
                        break;
                    }
                    boolean var45 = false;
                    if (field279[var44] == null) {
                        field279[var44] = new class30();
                        var45 = true;
                    }
                    class30 var46 = field279[var44];
                    field281[++field357 - 1] = var44;
                    var46.field776 = field251;
                    int var47 = field285.method2327(5);
                    if (var47 > 15) {
                        var47 -= 32;
                    }
                    int var48 = field285.method2327(1);
                    if (var48 == 1) {
                        field255[++field365 - 1] = var44;
                    }
                    int var49 = field285.method2327(1);
                    var46.field689 = class35.method12(field285.method2327(14));
                    int var50 = field285.method2327(5);
                    if (var50 > 15) {
                        var50 -= 32;
                    }
                    int var51 = field375[field285.method2327(3)];
                    if (var45) {
                        var46.field720 = var46.field766 = var51;
                    }
                    var46.field764 = var46.field689.field799;
                    var46.field722 = var46.field689.field816;
                    if (var46.field722 == 0) {
                        var46.field766 = 0;
                    }
                    var46.field728 = var46.field689.field803;
                    var46.field729 = var46.field689.field800;
                    var46.field768 = var46.field689.field825;
                    var46.field731 = var46.field689.field802;
                    var46.field756 = var46.field689.field796;
                    var46.field726 = var46.field689.field797;
                    var46.field727 = var46.field689.field798;
                    var46.method605(Statics.field628.field774[0] + var47, Statics.field628.field775[0] + var50, var49 == 1);
                }
                field285.method2328();
                for (int var52 = 0; var52 < field365; var52++) {
                    int var53 = field255[var52];
                    class30 var54 = field279[var53];
                    int var55 = field285.method2101();
                    if ((var55 & 0x40) != 0) {
                        var54.field748 = field285.method2137();
                        var54.field736 = 100;
                    }
                    if ((var55 & 0x20) != 0) {
                        var54.field746 = field285.method2136();
                        var54.field755 = field285.method2136();
                    }
                    if ((var55 & 0x10) != 0) {
                        var54.field689 = class35.method12(field285.method2136());
                        var54.field764 = var54.field689.field799;
                        var54.field722 = var54.field689.field816;
                        var54.field728 = var54.field689.field803;
                        var54.field729 = var54.field689.field800;
                        var54.field768 = var54.field689.field825;
                        var54.field731 = var54.field689.field802;
                        var54.field756 = var54.field689.field796;
                        var54.field726 = var54.field689.field797;
                        var54.field727 = var54.field689.field798;
                    }
                    if ((var55 & 0x80) != 0) {
                        int var56 = field285.method2125();
                        int var57 = field285.method2126();
                        var54.method597(var56, var57, field251);
                        var54.field742 = field251 + 300;
                        var54.field743 = field285.method2127();
                        var54.field744 = field285.method2136();
                    }
                    if ((var55 & 0x4) != 0) {
                        int var58 = field285.method2136();
                        if (var58 == 65535) {
                            var58 = -1;
                        }
                        int var59 = field285.method2126();
                        if (var54.field751 == var58 && var58 != -1) {
                            int var60 = class38.method114(var58).field913;
                            if (var60 == 1) {
                                var54.field752 = 0;
                                var54.field778 = 0;
                                var54.field754 = var59;
                                var54.field759 = 0;
                            }
                            if (var60 == 2) {
                                var54.field759 = 0;
                            }
                        } else if (var58 == -1 || var54.field751 == -1 || class38.method114(var58).field912 >= class38.method114(var54.field751).field912) {
                            var54.field751 = var58;
                            var54.field752 = 0;
                            var54.field778 = 0;
                            var54.field754 = var59;
                            var54.field759 = 0;
                            var54.field761 = var54.field773;
                        }
                    }
                    if ((var55 & 0x1) != 0) {
                        var54.field745 = field285.method2166();
                        if (var54.field745 == 65535) {
                            var54.field745 = -1;
                        }
                    }
                    if ((var55 & 0x2) != 0) {
                        int var61 = field285.method2126();
                        int var62 = field285.method2126();
                        var54.method597(var61, var62, field251);
                        var54.field742 = field251 + 300;
                        var54.field743 = field285.method2127();
                        var54.field744 = field285.method2127();
                    }
                    if ((var55 & 0x8) != 0) {
                        var54.field723 = field285.method2166();
                        int var63 = field285.method2156();
                        var54.field760 = var63 >> 16;
                        var54.field732 = (var63 & 0xFFFF) + field251;
                        var54.field757 = 0;
                        var54.field758 = 0;
                        if (var54.field732 > field251) {
                            var54.field757 = -1;
                        }
                        if (var54.field723 == 65535) {
                            var54.field723 = -1;
                        }
                    }
                }
                for (int var64 = 0; var64 < field370; var64++) {
                    int var65 = field371[var64];
                    if (field251 != field279[var65].field776) {
                        field279[var65].field689 = null;
                        field279[var65] = null;
                    }
                }
                if (field286 != field285.field1835) {
                    throw new RuntimeException(field285.field1835 + class2.field25 + field286);
                }
                for (int var66 = 0; var66 < field357; var66++) {
                    if (field279[field281[var66]] == null) {
                        throw new RuntimeException(var66 + class2.field25 + field357);
                    }
                }
                field287 = -1;
                return true;
            }
            if (field287 == 115) {
                int var67 = field285.method2142();
                class153 var68 = class153.method2362(var67);
                var68.field2605 = 3;
                var68.field2568 = Statics.field628.field30.method2904();
                method1839(var68);
                field287 = -1;
                return true;
            }
            if (field287 == 95) {
                Statics.field1581 = field285.method2101();
                Statics.field213 = field285.method2126();
                field287 = -1;
                return true;
            }
            if (field287 == 157) {
                method176();
                int var69 = field285.method2090();
                int var70 = field285.method2090();
                int var71 = field285.method2156();
                field383[var70] = var71;
                field381[var70] = var69;
                field382[var70] = 1;
                for (int var72 = 0; var72 < 98; var72++) {
                    if (var71 >= class141.field2128[var72]) {
                        field382[var70] = var72 + 2;
                    }
                }
                field434[++field439 - 1 & 0x1F] = var70;
                field287 = -1;
                return true;
            }
            if (field287 == 67) {
                field256 = field285.method2101();
                if (field256 == 255) {
                    field256 = 0;
                }
                field475 = field285.method2101();
                if (field475 == 255) {
                    field475 = 0;
                }
                field287 = -1;
                return true;
            }
            if (field287 == 92) {
                class110 var73 = field285;
                int var74 = field286;
                class189 var75 = new class189();
                var75.field2884 = var73.method2101();
                var75.field2882 = var73.method2286();
                var75.field2879 = new int[var75.field2884];
                var75.field2880 = new int[var75.field2884];
                var75.field2881 = new Field[var75.field2884];
                var75.field2878 = new int[var75.field2884];
                var75.field2877 = new Method[var75.field2884];
                var75.field2883 = new byte[var75.field2884][][];
                for (int var76 = 0; var76 < var75.field2884; var76++) {
                    try {
                        int var77 = var73.method2101();
                        if (var77 == 0 || var77 == 1 || var77 == 2) {
                            String var78 = var73.method2137();
                            String var79 = var73.method2137();
                            int var80 = 0;
                            if (var77 == 1) {
                                var80 = var73.method2286();
                            }
                            var75.field2879[var76] = var77;
                            var75.field2878[var76] = var80;
                            if (class190.method702(var78).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var75.field2881[var76] = class190.method702(var78).getDeclaredField(var79);
                        } else if (var77 == 3 || var77 == 4) {
                            String var81 = var73.method2137();
                            String var82 = var73.method2137();
                            int var83 = var73.method2101();
                            String[] var84 = new String[var83];
                            for (int var85 = 0; var85 < var83; var85++) {
                                var84[var85] = var73.method2137();
                            }
                            String var86 = var73.method2137();
                            byte[][] var87 = new byte[var83][];
                            if (var77 == 3) {
                                for (int var88 = 0; var88 < var83; var88++) {
                                    int var89 = var73.method2286();
                                    var87[var88] = new byte[var89];
                                    var73.method2256(var87[var88], 0, var89);
                                }
                            }
                            var75.field2879[var76] = var77;
                            Class[] var90 = new Class[var83];
                            for (int var91 = 0; var91 < var83; var91++) {
                                var90[var91] = class190.method702(var84[var91]);
                            }
                            Class var92 = class190.method702(var86);
                            if (class190.method702(var81).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var93 = class190.method702(var81).getDeclaredMethods();
                            Method[] var94 = var93;
                            for (int var95 = 0; var95 < var94.length; var95++) {
                                Method var96 = var94[var95];
                                if (var96.getName().equals(var82)) {
                                    Class[] var97 = var96.getParameterTypes();
                                    if (var90.length == var97.length) {
                                        boolean var98 = true;
                                        for (int var99 = 0; var99 < var90.length; var99++) {
                                            if (var90[var99] != var97[var99]) {
                                                var98 = false;
                                                break;
                                            }
                                        }
                                        if (var98 && var92 == var96.getReturnType()) {
                                            var75.field2877[var76] = var96;
                                        }
                                    }
                                }
                            }
                            var75.field2883[var76] = var87;
                        }
                    } catch (ClassNotFoundException var357) {
                        var75.field2880[var76] = -1;
                    } catch (SecurityException var358) {
                        var75.field2880[var76] = -2;
                    } catch (NullPointerException var359) {
                        var75.field2880[var76] = -3;
                    } catch (Exception var360) {
                        var75.field2880[var76] = -4;
                    } catch (Throwable var361) {
                        var75.field2880[var76] = -5;
                    }
                }
                class190.field2888.method3228(var75);
                field287 = -1;
                return true;
            }
            if (field287 == 69) {
                String var105 = field285.method2137();
                Object[] var106 = new Object[var105.length() + 1];
                for (int var107 = var105.length() - 1; var107 >= 0; var107--) {
                    if (var105.charAt(var107) == 's') {
                        var106[var107 + 1] = field285.method2137();
                    } else {
                        var106[var107 + 1] = Integer.valueOf(field285.method2286());
                    }
                }
                var106[0] = Integer.valueOf(field285.method2286());
                class1 var108 = new class1();
                var108.field14 = var106;
                class32.method572(var108);
                field287 = -1;
                return true;
            }
            if (field287 == 19) {
                String var109 = field285.method2137();
                long var110 = field285.method2107();
                long var112 = (long) field285.method2166();
                long var114 = (long) field285.method2105();
                class138[] var116 = new class138[] { class138.field2093, class138.field2102, class138.field2104, class138.field2097, class138.field2095 };
                class138 var117 = (class138) class99.method511(var116, field285.method2101());
                long var118 = (var112 << 32) + var114;
                boolean var120 = false;
                for (int var121 = 0; var121 < 100; var121++) {
                    if (field461[var121] == var118) {
                        var120 = true;
                        break;
                    }
                }
                if (var117.field2100 && method2433(var109)) {
                    var120 = true;
                }
                if (!var120 && field419 == 0) {
                    field461[field462] = var118;
                    field462 = (field462 + 1) % 100;
                    class110 var122 = field285;
                    String var126;
                    try {
                        int var123 = var122.method2114();
                        if (var123 > 32767) {
                            var123 = 32767;
                        }
                        byte[] var124 = new byte[var123];
                        var122.field1835 += Statics.field2907.method2028(var122.field1839, var122.field1835, var124, 0, var123);
                        String var125 = class202.method2859(var124, 0, var123);
                        var126 = var125;
                    } catch (Exception var356) {
                        var126 = "Cabbage";
                    }
                    String var129 = class193.method3318(class200.method516(var126));
                    if (var117.field2098 == -1) {
                        class10.method81(9, var109, var129, class199.method1941(var110));
                    } else {
                        class10.method81(9, class2.method2522(var117.field2098) + var109, var129, class199.method1941(var110));
                    }
                }
                field287 = -1;
                return true;
            }
            if (field287 == 76) {
                String var130 = field285.method2137();
                int var131 = field285.method2143();
                class153 var132 = class153.method2362(var131);
                if (!var130.equals(var132.field2582)) {
                    var132.field2582 = var130;
                    method1839(var132);
                }
                field287 = -1;
                return true;
            }
            if (field287 == 170) {
                class22 var133 = new class22();
                var133.field568 = field285.method2137();
                var133.field564 = field285.method2166();
                int var134 = field285.method2286();
                var133.field567 = var134;
                method2320(45);
                Statics.field436.method2551();
                Statics.field436 = null;
                class28.method3002(var133);
                field287 = -1;
                return false;
            }
            if (field287 == 215) {
                int var135 = field285.method2136();
                int var136 = field285.method2286();
                class153 var137 = class153.method2362(var136);
                if (var137.field2605 != 1 || var137.field2568 != var135) {
                    var137.field2605 = 1;
                    var137.field2568 = var135;
                    method1839(var137);
                }
                field287 = -1;
                return true;
            }
            if (field287 == 2) {
                method513(true);
                field287 = -1;
                return true;
            }
            if (field287 == 180) {
                for (int var138 = 0; var138 < Statics.field2891; var138++) {
                    class46 var139 = class46.method2399(var138);
                    if (var139 != null) {
                        class155.field2662[var138] = 0;
                        class155.field2664[var138] = 0;
                    }
                }
                method176();
                field431 += 32;
                field287 = -1;
                return true;
            }
            if (field287 == 93) {
                for (int var140 = 0; var140 < class155.field2664.length; var140++) {
                    if (class155.field2664[var140] != class155.field2662[var140]) {
                        class155.field2664[var140] = class155.field2662[var140];
                        method29(var140);
                        field430[++field431 - 1 & 0x1F] = var140;
                    }
                }
                field287 = -1;
                return true;
            }
            if (field287 == 118) {
                String var141 = field285.method2137();
                class110 var142 = field285;
                String var146;
                try {
                    int var143 = var142.method2114();
                    if (var143 > 32767) {
                        var143 = 32767;
                    }
                    byte[] var144 = new byte[var143];
                    var142.field1835 += Statics.field2907.method2028(var142.field1839, var142.field1835, var144, 0, var143);
                    String var145 = class202.method2859(var144, 0, var143);
                    var146 = var145;
                } catch (Exception var355) {
                    var146 = "Cabbage";
                }
                String var149 = class193.method3318(class200.method516(var146));
                class10.method100(6, var141, var149);
                field287 = -1;
                return true;
            }
            if (field287 == 217) {
                int var150 = field285.method2156();
                int var151 = field285.method2104();
                int var152 = field285.method2104();
                class153 var153 = class153.method2362(var150);
                int var154 = var153.field2542 + var151;
                int var155 = var153.field2543 + var152;
                if (var153.field2540 != var154 || var153.field2546 != var155) {
                    var153.field2540 = var154;
                    var153.field2546 = var155;
                    method1839(var153);
                }
                field287 = -1;
                return true;
            }
            if (field287 == 238) {
                while (field285.field1835 < field286) {
                    int var156 = field285.method2101();
                    boolean var157 = (var156 & 0x1) == 1;
                    String var158 = field285.method2137();
                    String var159 = field285.method2137();
                    field285.method2137();
                    for (int var160 = 0; var160 < field498; var160++) {
                        class8 var161 = field293[var160];
                        if (var157) {
                            if (var159.equals(var161.field117)) {
                                var161.field117 = var158;
                                var161.field114 = var159;
                                var158 = null;
                                break;
                            }
                        } else if (var158.equals(var161.field117)) {
                            var161.field117 = var158;
                            var161.field114 = var159;
                            var158 = null;
                            break;
                        }
                    }
                    if (var158 != null && field498 < 400) {
                        class8 var162 = new class8();
                        field293[field498] = var162;
                        var162.field117 = var158;
                        var162.field114 = var159;
                        field498++;
                    }
                }
                field437 = field429;
                field287 = -1;
                return true;
            }
            if (field287 == 247) {
                int var163 = field285.method2286();
                Statics.field2887 = Statics.field235.method2439(var163);
                field287 = -1;
                return true;
            }
            if (field287 == 23) {
                int var164 = field286 + field285.field1835;
                int var165 = field285.method2166();
                int var166 = field285.method2166();
                if (field405 != var165) {
                    field405 = var165;
                    method573(field405);
                    class32.method1762(field405);
                    for (int var167 = 0; var167 < 100; var167++) {
                        field449[var167] = true;
                    }
                }
                while (var166-- > 0) {
                    int var168 = field285.method2286();
                    int var169 = field285.method2166();
                    int var170 = field285.method2101();
                    class4 var171 = (class4) field406.method3171((long) var168);
                    if (var171 != null && var171.field52 != var169) {
                        method161(var171, true);
                        var171 = null;
                    }
                    if (var171 == null) {
                        var171 = method2631(var168, var169, var170);
                    }
                    var171.field57 = true;
                }
                for (class4 var172 = (class4) field406.method3163(); var172 != null; var172 = (class4) field406.method3172()) {
                    if (var172.field57) {
                        var172.field57 = false;
                    } else {
                        method161(var172, true);
                    }
                }
                field266 = new class175(512);
                while (field285.field1835 < var164) {
                    int var173 = field285.method2286();
                    int var174 = field285.method2166();
                    int var175 = field285.method2166();
                    int var176 = field285.method2286();
                    for (int var177 = var174; var177 <= var175; var177++) {
                        long var178 = ((long) var173 << 32) + (long) var177;
                        field266.method3161(new class180(var176), var178);
                    }
                }
                field287 = -1;
                return true;
            }
            if (field287 == 66) {
                int var180 = field285.method2127();
                class14 var181 = (class14) class14.field192.method3171((long) var180);
                if (var181 != null) {
                    var181.method3280();
                }
                field432[++field433 - 1 & 0x1F] = var180 & 0x7FFF;
                field287 = -1;
                return true;
            }
            if (field287 == 84) {
                method176();
                field410 = field285.method2101();
                field300 = field429;
                field287 = -1;
                return true;
            }
            if (field287 == 124) {
                field458 = field285.method2101();
                field459 = field285.method2101();
                field287 = -1;
                return true;
            }
            if (field287 == 31) {
                int var182 = field285.method2134();
                field405 = var182;
                method573(var182);
                class32.method1762(field405);
                for (int var183 = 0; var183 < 100; var183++) {
                    field449[var183] = true;
                }
                field287 = -1;
                return true;
            }
            if (field287 == 12) {
                int var184 = field285.method2106();
                int var185 = field285.method2142();
                class153 var186 = class153.method2362(var185);
                if (var186.field2571 != var184 || var184 == -1) {
                    var186.field2571 = var184;
                    var186.field2647 = 0;
                    var186.field2642 = 0;
                    method1839(var186);
                }
                field287 = -1;
                return true;
            }
            if (field287 == 140) {
                int var187 = field285.method2101();
                class117[] var188 = new class117[] { class117.field1900, class117.field1899, class117.field1901 };
                class117[] var189 = var188;
                int var190 = 0;
                class117 var192;
                while (true) {
                    if (var190 >= var189.length) {
                        var192 = null;
                        break;
                    }
                    class117 var191 = var189[var190];
                    if (var191.field1903 == var187) {
                        var192 = var191;
                        break;
                    }
                    var190++;
                }
                Statics.field2968 = var192;
                field287 = -1;
                return true;
            }
            if (field287 == 7 || field287 == 81 || field287 == 183 || field287 == 253 || field287 == 200 || field287 == 206 || field287 == 45 || field287 == 97 || field287 == 187 || field287 == 137) {
                method3503();
                field287 = -1;
                return true;
            }
            if (field287 == 98) {
                byte var193 = field285.method2128();
                int var194 = field285.method2136();
                class155.field2662[var194] = var193;
                if (class155.field2664[var194] != var193) {
                    class155.field2664[var194] = var193;
                    method29(var194);
                }
                field430[++field431 - 1 & 0x1F] = var194;
                field287 = -1;
                return true;
            }
            if (field287 == 27) {
                int var195 = field285.method2286();
                class4 var196 = (class4) field406.method3171((long) var195);
                if (var196 != null) {
                    method161(var196, true);
                }
                if (field409 != null) {
                    method1839(field409);
                    field409 = null;
                }
                field287 = -1;
                return true;
            }
            if (field287 == 184) {
                String var197 = field285.method2137();
                long var198 = (long) field285.method2166();
                long var200 = (long) field285.method2105();
                class138[] var202 = new class138[] { class138.field2093, class138.field2102, class138.field2104, class138.field2097, class138.field2095 };
                class138 var203 = (class138) class99.method511(var202, field285.method2101());
                long var204 = (var198 << 32) + var200;
                boolean var206 = false;
                for (int var207 = 0; var207 < 100; var207++) {
                    if (field461[var207] == var204) {
                        var206 = true;
                        break;
                    }
                }
                if (method2433(var197)) {
                    var206 = true;
                }
                if (!var206 && field419 == 0) {
                    field461[field462] = var204;
                    field462 = (field462 + 1) % 100;
                    class110 var208 = field285;
                    String var212;
                    try {
                        int var209 = var208.method2114();
                        if (var209 > 32767) {
                            var209 = 32767;
                        }
                        byte[] var210 = new byte[var209];
                        var208.field1835 += Statics.field2907.method2028(var208.field1839, var208.field1835, var210, 0, var209);
                        String var211 = class202.method2859(var210, 0, var209);
                        var212 = var211;
                    } catch (Exception var354) {
                        var212 = "Cabbage";
                    }
                    String var215 = class193.method3318(class200.method516(var212));
                    byte var216;
                    if (var203.field2099) {
                        var216 = 7;
                    } else {
                        var216 = 3;
                    }
                    if (var203.field2098 == -1) {
                        class10.method100(var216, var197, var215);
                    } else {
                        class10.method100(var216, class2.method2522(var203.field2098) + var197, var215);
                    }
                }
                field287 = -1;
                return true;
            }
            if (field287 == 165) {
                String var217 = field285.method2137();
                int var218 = field285.method2166();
                byte var219 = field285.method2263();
                boolean var220 = false;
                if (var219 == -128) {
                    var220 = true;
                }
                if (var220) {
                    if (Statics.field130 == 0) {
                        field287 = -1;
                        return true;
                    }
                    boolean var221 = false;
                    int var222;
                    for (var222 = 0; var222 < Statics.field130 && (!Statics.field1690[var222].field558.equals(var217) || Statics.field1690[var222].field556 != var218); var222++) {
                    }
                    if (var222 < Statics.field130) {
                        while (var222 < Statics.field130 - 1) {
                            Statics.field1690[var222] = Statics.field1690[var222 + 1];
                            var222++;
                        }
                        Statics.field130--;
                        Statics.field1690[Statics.field130] = null;
                    }
                } else {
                    field285.method2137();
                    class21 var223 = new class21();
                    var223.field558 = var217;
                    var223.field554 = class201.method2051(var223.field558, Statics.field2395);
                    var223.field556 = var218;
                    var223.field557 = var219;
                    int var224;
                    for (var224 = Statics.field130 - 1; var224 >= 0; var224--) {
                        int var225 = Statics.field1690[var224].field554.compareTo(var223.field558);
                        if (var225 == 0) {
                            Statics.field1690[var224].field556 = var218;
                            Statics.field1690[var224].field557 = var219;
                            if (var217.equals(Statics.field628.field42)) {
                                Statics.field1913 = var219;
                            }
                            field438 = field429;
                            field287 = -1;
                            return true;
                        }
                        if (var225 < 0) {
                            break;
                        }
                    }
                    if (Statics.field130 >= Statics.field1690.length) {
                        field287 = -1;
                        return true;
                    }
                    for (int var226 = Statics.field130 - 1; var226 > var224; var226--) {
                        Statics.field1690[var226 + 1] = Statics.field1690[var226];
                    }
                    if (Statics.field130 == 0) {
                        Statics.field1690 = new class21[100];
                    }
                    Statics.field1690[var224 + 1] = var223;
                    Statics.field130++;
                    if (var217.equals(Statics.field628.field42)) {
                        Statics.field1913 = var219;
                    }
                }
                field438 = field429;
                field287 = -1;
                return true;
            }
            if (field287 == 14) {
                int var227 = field285.method2286();
                int var228 = field285.method2286();
                int var229 = field285.method2134();
                if (var229 == 65535) {
                    var229 = -1;
                }
                class153 var230 = class153.method2362(var227);
                if (var230.field2534) {
                    var230.field2639 = var229;
                    var230.field2640 = var228;
                    class45 var232 = class45.method612(var229);
                    var230.field2575 = var232.field1022;
                    var230.field2576 = var232.field1021;
                    var230.field2577 = var232.field1025;
                    var230.field2635 = var232.field1010;
                    var230.field2574 = var232.field1024;
                    var230.field2573 = var232.field1019;
                    if (var230.field2544 > 0) {
                        var230.field2573 = var230.field2573 * 32 / var230.field2544;
                    }
                    method1839(var230);
                } else if (var229 == -1) {
                    var230.field2605 = 0;
                    field287 = -1;
                    return true;
                } else {
                    class45 var231 = class45.method612(var229);
                    var230.field2605 = 4;
                    var230.field2568 = var229;
                    var230.field2575 = var231.field1022;
                    var230.field2576 = var231.field1021;
                    var230.field2573 = var231.field1019 * 100 / var228;
                    method1839(var230);
                }
                field287 = -1;
                return true;
            }
            if (field287 == 58) {
                field356 = field285.method2101();
                if (field356 == 1) {
                    field260 = field285.method2166();
                }
                if (field356 >= 2 && field356 <= 6) {
                    if (field356 == 2) {
                        field265 = 64;
                        field252 = 64;
                    }
                    if (field356 == 3) {
                        field265 = 0;
                        field252 = 64;
                    }
                    if (field356 == 4) {
                        field265 = 128;
                        field252 = 64;
                    }
                    if (field356 == 5) {
                        field265 = 64;
                        field252 = 0;
                    }
                    if (field356 == 6) {
                        field265 = 64;
                        field252 = 128;
                    }
                    field356 = 2;
                    field294 = field285.method2166();
                    field263 = field285.method2166();
                    field264 = field285.method2101();
                }
                if (field356 == 10) {
                    field261 = field285.method2166();
                }
                field287 = -1;
                return true;
            }
            if (field287 == 136) {
                boolean var233 = field285.method2125() == 1;
                int var234 = field285.method2142();
                class153 var235 = class153.method2362(var234);
                if (var235.field2547 != var233) {
                    var235.field2547 = var233;
                    method1839(var235);
                }
                field287 = -1;
                return true;
            }
            if (field287 == 226) {
                int var236 = field285.method2127();
                int var237 = field285.method2143();
                class153 var238 = class153.method2362(var237);
                if (var238 != null && var238.field2634 == 0) {
                    if (var236 > var238.field2551 - var238.field2545) {
                        var236 = var238.field2551 - var238.field2545;
                    }
                    if (var236 < 0) {
                        var236 = 0;
                    }
                    if (var238.field2549 != var236) {
                        var238.field2549 = var236;
                        method1839(var238);
                    }
                }
                field287 = -1;
                return true;
            }
            if (field287 == 102) {
                int var239 = field285.method2136();
                int var240 = field285.method2286();
                int var241 = field285.method2136();
                int var242 = field285.method2127();
                class153 var243 = class153.method2362(var240);
                if (var243.field2575 != var242 || var243.field2576 != var241 || var243.field2573 != var239) {
                    var243.field2575 = var242;
                    var243.field2576 = var241;
                    var243.field2573 = var239;
                    method1839(var243);
                }
                field287 = -1;
                return true;
            }
            if (field287 == 146) {
                method513(false);
                field287 = -1;
                return true;
            }
            if (field287 == 13) {
                field258 = field285.method2134() * 30;
                field300 = field429;
                field287 = -1;
                return true;
            }
            if (field287 == 109) {
                int var244 = field285.method2143();
                int var245 = field285.method2166();
                int var246 = var245 >> 10 & 0x1F;
                int var247 = var245 >> 5 & 0x1F;
                int var248 = var245 & 0x1F;
                int var249 = (var248 << 3) + (var246 << 19) + (var247 << 11);
                class153 var250 = class153.method2362(var244);
                if (var250.field2552 != var249) {
                    var250.field2552 = var249;
                    method1839(var250);
                }
                field287 = -1;
                return true;
            }
            if (field287 == 242) {
                field285.field1835 += 28;
                if (field285.method2216()) {
                    class110 var251 = field285;
                    int var252 = field285.field1835 - 28;
                    if (class136.field2073 != null) {
                        try {
                            class136.field2073.method3450(0L);
                            class136.field2073.method3463(var251.field1839, var252, 24);
                        } catch (Exception var353) {
                        }
                    }
                }
                field287 = -1;
                return true;
            }
            if (field287 == 252) {
                int var254 = field285.method2114();
                boolean var255 = field285.method2101() == 1;
                String var256 = "";
                boolean var257 = false;
                if (var255) {
                    var256 = field285.method2137();
                    if (method2433(var256)) {
                        var257 = true;
                    }
                }
                String var258 = field285.method2137();
                if (!var257) {
                    class10.method100(var254, var256, var258);
                }
                field287 = -1;
                return true;
            }
            if (field287 == 108) {
                for (int var259 = 0; var259 < field386.length; var259++) {
                    if (field386[var259] != null) {
                        field386[var259].field751 = -1;
                    }
                }
                for (int var260 = 0; var260 < field279.length; var260++) {
                    if (field279[var260] != null) {
                        field279[var260].field751 = -1;
                    }
                }
                field287 = -1;
                return true;
            }
            if (field287 == 190) {
                int var261 = field285.method2126();
                int var262 = field285.method2101();
                int var263 = field285.method2125();
                Statics.field59 = var263 >> 1;
                Statics.field628.method605(var262, var261, (var263 & 0x1) == 1);
                field287 = -1;
                return true;
            }
            if (field287 == 32) {
                while (field285.field1835 < field286) {
                    boolean var264 = field285.method2101() == 1;
                    String var265 = field285.method2137();
                    String var266 = field285.method2137();
                    int var267 = field285.method2166();
                    int var268 = field285.method2101();
                    int var269 = field285.method2101();
                    boolean var270 = (var269 & 0x2) != 0;
                    boolean var271 = (var269 & 0x1) != 0;
                    if (var267 > 0) {
                        field285.method2137();
                        field285.method2101();
                        field285.method2286();
                    }
                    field285.method2137();
                    for (int var272 = 0; var272 < field318; var272++) {
                        class16 var273 = field496[var272];
                        if (var264) {
                            if (var266.equals(var273.field225)) {
                                var273.field225 = var265;
                                var273.field224 = var266;
                                var265 = null;
                                break;
                            }
                        } else if (var265.equals(var273.field225)) {
                            if (var273.field215 != var267) {
                                boolean var274 = true;
                                for (class34 var275 = (class34) field269.method3151(); var275 != null; var275 = (class34) field269.method3158()) {
                                    if (var275.field781.equals(var265)) {
                                        if (var267 != 0 && var275.field782 == 0) {
                                            var275.method3276();
                                            var274 = false;
                                        } else if (var267 == 0 && var275.field782 != 0) {
                                            var275.method3276();
                                            var274 = false;
                                        }
                                    }
                                }
                                if (var274) {
                                    field269.method3150(new class34(var265, var267));
                                }
                                var273.field215 = var267;
                            }
                            var273.field224 = var266;
                            var273.field216 = var268;
                            var273.field217 = var270;
                            var273.field222 = var271;
                            var265 = null;
                            break;
                        }
                    }
                    if (var265 != null && field318 < 400) {
                        class16 var276 = new class16();
                        field496[field318] = var276;
                        var276.field225 = var265;
                        var276.field224 = var266;
                        var276.field215 = var267;
                        var276.field216 = var268;
                        var276.field217 = var270;
                        var276.field222 = var271;
                        field318++;
                    }
                }
                field278 = 2;
                field437 = field429;
                boolean var277 = false;
                int var278 = field318;
                while (var278 > 0) {
                    boolean var279 = true;
                    var278--;
                    for (int var280 = 0; var280 < var278; var280++) {
                        boolean var281 = false;
                        class16 var282 = field496[var280];
                        class16 var283 = field496[var280 + 1];
                        if (field497 != var282.field215 && field497 == var283.field215) {
                            var281 = true;
                        }
                        if (!var281 && var282.field215 == 0 && var283.field215 != 0) {
                            var281 = true;
                        }
                        if (!var281 && !var282.field217 && var283.field217) {
                            var281 = true;
                        }
                        if (!var281 && !var282.field222 && var283.field222) {
                            var281 = true;
                        }
                        if (var281) {
                            class16 var284 = field496[var280];
                            field496[var280] = field496[var280 + 1];
                            field496[var280 + 1] = var284;
                            var279 = false;
                        }
                    }
                    if (var279) {
                        break;
                    }
                }
                field287 = -1;
                return true;
            }
            if (field287 == 36) {
                int var285 = field285.method2090();
                int var286 = field285.method2127();
                int var287 = field285.method2142();
                class4 var288 = (class4) field406.method3171((long) var287);
                if (var288 != null) {
                    method161(var288, var288.field52 != var286);
                }
                method2631(var287, var286, var285);
                field287 = -1;
                return true;
            }
            if (field287 == 52) {
                method162();
                field287 = -1;
                return false;
            }
            if (field287 == 71) {
                field278 = 1;
                field437 = field429;
                field287 = -1;
                return true;
            }
            if (field287 == 143) {
                field370 = 0;
                field365 = 0;
                method1861();
                method484();
                while (field285.method2323(field286) >= 11) {
                    int var289 = field285.method2327(11);
                    if (var289 == 2047) {
                        break;
                    }
                    boolean var290 = false;
                    if (field386[var289] == null) {
                        field386[var289] = new class3();
                        if (field479[var289] != null) {
                            field386[var289].method16(field479[var289]);
                        }
                        var290 = true;
                    }
                    field364[++field259 - 1] = var289;
                    class3 var291 = field386[var289];
                    var291.field776 = field251;
                    int var292 = field285.method2327(5);
                    if (var292 > 15) {
                        var292 -= 32;
                    }
                    int var293 = field285.method2327(5);
                    if (var293 > 15) {
                        var293 -= 32;
                    }
                    int var294 = field285.method2327(1);
                    int var295 = field375[field285.method2327(3)];
                    if (var290) {
                        var291.field720 = var291.field766 = var295;
                    }
                    int var296 = field285.method2327(1);
                    if (var296 == 1) {
                        field255[++field365 - 1] = var289;
                    }
                    var291.method605(Statics.field628.field774[0] + var293, Statics.field628.field775[0] + var292, var294 == 1);
                }
                field285.method2328();
                method614();
                for (int var297 = 0; var297 < field370; var297++) {
                    int var298 = field371[var297];
                    if (field251 != field386[var298].field776) {
                        field386[var298] = null;
                    }
                }
                if (field286 != field285.field1835) {
                    throw new RuntimeException(field285.field1835 + class2.field25 + field286);
                }
                for (int var299 = 0; var299 < field259; var299++) {
                    if (field386[field364[var299]] == null) {
                        throw new RuntimeException(var299 + class2.field25 + field259);
                    }
                }
                field287 = -1;
                return true;
            }
            if (field287 == 225) {
                int var300 = field285.method2156();
                int var301 = field285.method2134();
                int var302 = field285.method2166();
                class153 var303 = class153.method2362(var300);
                var303.field2579 = (var302 << 16) + var301;
                field287 = -1;
                return true;
            }
            if (field287 == 49) {
                method176();
                field474 = field285.method2104();
                field300 = field429;
                field287 = -1;
                return true;
            }
            if (field287 == 82) {
                if (field405 != -1) {
                    method2388(field405, 0);
                }
                field287 = -1;
                return true;
            }
            if (field287 == 149) {
                int var304 = field285.method2127();
                int var305 = field285.method2286();
                class155.field2662[var304] = var305;
                if (class155.field2664[var304] != var305) {
                    class155.field2664[var304] = var305;
                    method29(var304);
                }
                field430[++field431 - 1 & 0x1F] = var304;
                field287 = -1;
                return true;
            }
            if (field287 == 234) {
                field488 = true;
                Statics.field878 = field285.method2101();
                Statics.field630 = field285.method2101();
                Statics.field524 = field285.method2166();
                Statics.field2008 = field285.method2101();
                Statics.field2813 = field285.method2101();
                if (Statics.field2813 >= 100) {
                    Statics.field226 = Statics.field878 * 128 + 64;
                    Statics.field167 = Statics.field630 * 128 + 64;
                    Statics.field223 = method79(Statics.field226, Statics.field167, Statics.field59) - Statics.field524;
                }
                field287 = -1;
                return true;
            }
            if (field287 == 116) {
                field488 = true;
                Statics.field2653 = field285.method2101();
                Statics.field522 = field285.method2101();
                Statics.field1824 = field285.method2166();
                Statics.field1 = field285.method2101();
                Statics.field175 = field285.method2101();
                if (Statics.field175 >= 100) {
                    int var306 = Statics.field2653 * 128 + 64;
                    int var307 = Statics.field522 * 128 + 64;
                    int var308 = method79(var306, var307, Statics.field59) - Statics.field1824;
                    int var309 = var306 - Statics.field226;
                    int var310 = var308 - Statics.field223;
                    int var311 = var307 - Statics.field167;
                    int var312 = (int) Math.sqrt((double) (var309 * var309 + var311 * var311));
                    Statics.field547 = (int) (Math.atan2((double) var310, (double) var312) * 325.949D) & 0x7FF;
                    Statics.field2393 = (int) (Math.atan2((double) var309, (double) var311) * -325.949D) & 0x7FF;
                    if (Statics.field547 < 128) {
                        Statics.field547 = 128;
                    }
                    if (Statics.field547 > 383) {
                        Statics.field547 = 383;
                    }
                }
                field287 = -1;
                return true;
            }
            if (field287 == 229) {
                int var313 = field285.method2143();
                class153 var314 = class153.method2362(var313);
                for (int var315 = 0; var315 < var314.field2566.length; var315++) {
                    var314.field2566[var315] = -1;
                    var314.field2566[var315] = 0;
                }
                method1839(var314);
                field287 = -1;
                return true;
            }
            if (field287 == 1) {
                field438 = field429;
                if (field286 == 0) {
                    field467 = null;
                    field276 = null;
                    Statics.field130 = 0;
                    Statics.field1690 = null;
                    field287 = -1;
                    return true;
                }
                field276 = field285.method2137();
                long var316 = field285.method2107();
                long var318 = var316;
                String var320;
                if (var316 <= 0L || var316 >= 6582952005840035281L) {
                    var320 = null;
                } else if (var316 % 37L == 0L) {
                    var320 = null;
                } else {
                    int var321 = 0;
                    for (long var322 = var316; var322 != 0L; var322 /= 37L) {
                        var321++;
                    }
                    StringBuilder var324 = new StringBuilder(var321);
                    while (var318 != 0L) {
                        long var325 = var318;
                        var318 /= 37L;
                        var324.append(class199.field2969[(int) (var325 - var318 * 37L)]);
                    }
                    var320 = var324.reverse().toString();
                }
                field467 = var320;
                Statics.field1877 = field285.method2263();
                int var327 = field285.method2101();
                if (var327 == 255) {
                    field287 = -1;
                    return true;
                }
                Statics.field130 = var327;
                class21[] var328 = new class21[100];
                for (int var329 = 0; var329 < Statics.field130; var329++) {
                    var328[var329] = new class21();
                    var328[var329].field558 = field285.method2137();
                    var328[var329].field554 = class201.method2051(var328[var329].field558, Statics.field2395);
                    var328[var329].field556 = field285.method2166();
                    var328[var329].field557 = field285.method2263();
                    field285.method2137();
                    if (var328[var329].field558.equals(Statics.field628.field42)) {
                        Statics.field1913 = var328[var329].field557;
                    }
                }
                boolean var330 = false;
                int var331 = Statics.field130;
                while (var331 > 0) {
                    boolean var332 = true;
                    var331--;
                    for (int var333 = 0; var333 < var331; var333++) {
                        if (var328[var333].field554.compareTo(var328[var333 + 1].field554) > 0) {
                            class21 var334 = var328[var333];
                            var328[var333] = var328[var333 + 1];
                            var328[var333 + 1] = var334;
                            var332 = false;
                        }
                    }
                    if (var332) {
                        break;
                    }
                }
                Statics.field1690 = var328;
                field287 = -1;
                return true;
            }
            if (field287 == 63) {
                int var335 = field285.method2136();
                if (var335 == 65535) {
                    var335 = -1;
                }
                int var336 = field285.method2166();
                if (var336 == 65535) {
                    var336 = -1;
                }
                int var337 = field285.method2143();
                int var338 = field285.method2142();
                for (int var339 = var335; var339 <= var336; var339++) {
                    long var340 = ((long) var338 << 32) + (long) var339;
                    class187 var342 = field266.method3171(var340);
                    if (var342 != null) {
                        var342.method3280();
                    }
                    field266.method3161(new class180(var337), var340);
                }
                field287 = -1;
                return true;
            }
            if (field287 == 65) {
                int var343 = field285.method2286();
                int var344 = field285.method2166();
                if (var343 < -70000) {
                    var344 += 32768;
                }
                class153 var345;
                if (var343 >= 0) {
                    var345 = class153.method2362(var343);
                } else {
                    var345 = null;
                }
                while (field285.field1835 < field286) {
                    int var346 = field285.method2114();
                    int var347 = field285.method2166();
                    int var348 = 0;
                    if (var347 != 0) {
                        var348 = field285.method2101();
                        if (var348 == 255) {
                            var348 = field285.method2286();
                        }
                    }
                    if (var345 != null && var346 >= 0 && var346 < var345.field2566.length) {
                        var345.field2566[var346] = var347;
                        var345.field2643[var346] = var348;
                    }
                    class14.method800(var344, var346, var347 - 1, var348);
                }
                if (var345 != null) {
                    method1839(var345);
                }
                method176();
                field432[++field433 - 1 & 0x1F] = var344 & 0x7FFF;
                field287 = -1;
                return true;
            }
            class135.method1860("" + field287 + class2.field25 + field292 + class2.field25 + field326 + class2.field25 + field286, (Throwable) null);
            method162();
        } catch (IOException var362) {
            method581();
        } catch (Exception var363) {
            String var351 = "" + field287 + class2.field25 + field292 + class2.field25 + field326 + class2.field25 + field286 + class2.field25 + (Statics.field2103 + Statics.field628.field774[0]) + class2.field25 + (Statics.field88 + Statics.field628.field775[0]) + class2.field25;
            for (int var352 = 0; var352 < field286 && var352 < 50; var352++) {
                var351 = var351 + field285.field1839[var352] + class2.field25;
            }
            class135.method1860(var351, var363);
            method162();
        }
        return true;
    }

    @ObfuscatedName("ga.bb(I)V")
    public static final void method3503() {
        if (field287 == 187) {
            int var0 = field285.method2125();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = field450[var1];
            int var4 = field285.method2125();
            int var5 = (var4 >> 4 & 0x7) + Statics.field1581;
            int var6 = (var4 & 0x7) + Statics.field213;
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                method2368(Statics.field59, var5, var6, var3, -1, var1, var2, 0, -1);
            }
        } else if (field287 == 97) {
            int var7 = field285.method2126();
            int var8 = (var7 >> 4 & 0x7) + Statics.field1581;
            int var9 = (var7 & 0x7) + Statics.field213;
            int var10 = field285.method2136();
            int var11 = field285.method2126();
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = field450[var12];
            if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
                if (var14 == 0) {
                    class80 var15 = Statics.field199.method1712(Statics.field59, var8, var9);
                    if (var15 != null) {
                        int var16 = var15.field1425 >> 14 & 0x7FFF;
                        if (var12 == 2) {
                            var15.field1418 = new class11(var16, 2, var13 + 4, Statics.field59, var8, var9, var10, false, var15.field1418);
                            var15.field1424 = new class11(var16, 2, var13 + 1 & 0x3, Statics.field59, var8, var9, var10, false, var15.field1424);
                        } else {
                            var15.field1418 = new class11(var16, var12, var13, Statics.field59, var8, var9, var10, false, var15.field1418);
                        }
                    }
                }
                if (var14 == 1) {
                    class87 var17 = Statics.field199.method1746(Statics.field59, var8, var9);
                    if (var17 != null) {
                        int var18 = var17.field1501 >> 14 & 0x7FFF;
                        if (var12 == 4 || var12 == 5) {
                            var17.field1503 = new class11(var18, 4, var13, Statics.field59, var8, var9, var10, false, var17.field1503);
                        } else if (var12 == 6) {
                            var17.field1503 = new class11(var18, 4, var13 + 4, Statics.field59, var8, var9, var10, false, var17.field1503);
                        } else if (var12 == 7) {
                            var17.field1503 = new class11(var18, 4, (var13 + 2 & 0x3) + 4, Statics.field59, var8, var9, var10, false, var17.field1503);
                        } else if (var12 == 8) {
                            var17.field1503 = new class11(var18, 4, var13 + 4, Statics.field59, var8, var9, var10, false, var17.field1503);
                            var17.field1496 = new class11(var18, 4, (var13 + 2 & 0x3) + 4, Statics.field59, var8, var9, var10, false, var17.field1496);
                        }
                    }
                }
                if (var14 == 2) {
                    class91 var19 = Statics.field199.method1722(Statics.field59, var8, var9);
                    if (var12 == 11) {
                        var12 = 10;
                    }
                    if (var19 != null) {
                        var19.field1567 = new class11(var19.field1566 >> 14 & 0x7FFF, var12, var13, Statics.field59, var8, var9, var10, false, var19.field1567);
                    }
                }
                if (var14 == 3) {
                    class86 var20 = Statics.field199.method1632(Statics.field59, var8, var9);
                    if (var20 != null) {
                        var20.field1492 = new class11(var20.field1489 >> 14 & 0x7FFF, 22, var13, Statics.field59, var8, var9, var10, false, var20.field1492);
                    }
                }
            }
        } else if (field287 == 206) {
            int var21 = field285.method2134();
            int var22 = field285.method2125();
            int var23 = (var22 >> 4 & 0x7) + Statics.field1581;
            int var24 = (var22 & 0x7) + Statics.field213;
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                class178 var25 = field377[Statics.field59][var23][var24];
                if (var25 != null) {
                    for (class25 var26 = (class25) var25.method3196(); var26 != null; var26 = (class25) var25.method3206()) {
                        if ((var21 & 0x7FFF) == var26.field605) {
                            var26.method3280();
                            break;
                        }
                    }
                    if (var25.method3196() == null) {
                        field377[Statics.field59][var23][var24] = null;
                    }
                    method2386(var23, var24);
                }
            }
        } else if (field287 == 253) {
            int var27 = field285.method2101();
            int var28 = (var27 >> 4 & 0x7) + Statics.field1581;
            int var29 = (var27 & 0x7) + Statics.field213;
            int var30 = field285.method2166();
            int var31 = field285.method2101();
            int var32 = field285.method2166();
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                int var33 = var28 * 128 + 64;
                int var34 = var29 * 128 + 64;
                class26 var35 = new class26(var30, Statics.field59, var33, var34, method79(var33, var34, Statics.field59) - var31, var32, field251);
                field453.method3200(var35);
            }
        } else if (field287 == 81) {
            int var36 = field285.method2101();
            int var37 = (var36 >> 4 & 0x7) + Statics.field1581;
            int var38 = (var36 & 0x7) + Statics.field213;
            int var39 = field285.method2166();
            int var40 = field285.method2166();
            int var41 = field285.method2166();
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                class178 var42 = field377[Statics.field59][var37][var38];
                if (var42 != null) {
                    for (class25 var43 = (class25) var42.method3196(); var43 != null; var43 = (class25) var42.method3206()) {
                        if ((var39 & 0x7FFF) == var43.field605 && var43.field615 == var40) {
                            var43.field615 = var41;
                            break;
                        }
                    }
                    method2386(var37, var38);
                }
            }
        } else {
            if (field287 == 7) {
                int var44 = field285.method2101();
                int var45 = (var44 >> 4 & 0x7) + Statics.field1581;
                int var46 = (var44 & 0x7) + Statics.field213;
                int var47 = field285.method2166();
                int var48 = field285.method2101();
                int var49 = var48 >> 4 & 0xF;
                int var50 = var48 & 0x7;
                int var51 = field285.method2101();
                if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                    int var52 = var49 + 1;
                    if (Statics.field628.field774[0] >= var45 - var52 && Statics.field628.field774[0] <= var45 + var52 && Statics.field628.field775[0] >= var46 - var52 && Statics.field628.field775[0] <= var46 + var52 && field435 != 0 && var50 > 0 && field482 < 50) {
                        field483[field482] = var47;
                        field484[field482] = var50;
                        field481[field482] = var51;
                        field487[field482] = null;
                        field486[field482] = (var45 << 16) + (var46 << 8) + var49;
                        field482++;
                    }
                }
            }
            if (field287 == 137) {
                int var53 = field285.method2126();
                int var54 = (var53 >> 4 & 0x7) + Statics.field1581;
                int var55 = (var53 & 0x7) + Statics.field213;
                int var56 = field285.method2136();
                int var57 = field285.method2101();
                int var58 = var57 >> 2;
                int var59 = var57 & 0x3;
                int var60 = field450[var58];
                if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                    method2368(Statics.field59, var54, var55, var60, var56, var58, var59, 0, -1);
                }
            } else {
                if (field287 == 183) {
                    byte var61 = field285.method2263();
                    byte var62 = field285.method2130();
                    int var63 = field285.method2136();
                    int var64 = field285.method2125();
                    int var65 = (var64 >> 4 & 0x7) + Statics.field1581;
                    int var66 = (var64 & 0x7) + Statics.field213;
                    int var67 = field285.method2125();
                    int var68 = var67 >> 2;
                    int var69 = var67 & 0x3;
                    int var70 = field450[var68];
                    byte var71 = field285.method2129();
                    byte var72 = field285.method2128();
                    int var73 = field285.method2166();
                    int var74 = field285.method2136();
                    int var75 = field285.method2127();
                    class3 var76;
                    if (field368 == var75) {
                        var76 = Statics.field628;
                    } else {
                        var76 = field386[var75];
                    }
                    if (var76 != null) {
                        class36 var77 = class36.method2773(var73);
                        int var78;
                        int var79;
                        if (var69 == 1 || var69 == 3) {
                            var78 = var77.field845;
                            var79 = var77.field844;
                        } else {
                            var78 = var77.field844;
                            var79 = var77.field845;
                        }
                        int var80 = (var78 >> 1) + var65;
                        int var81 = (var78 + 1 >> 1) + var65;
                        int var82 = (var79 >> 1) + var66;
                        int var83 = (var79 + 1 >> 1) + var66;
                        int[][] var84 = class6.field65[Statics.field59];
                        int var85 = var84[var80][var82] + var84[var81][var82] + var84[var80][var83] + var84[var81][var83] >> 2;
                        int var86 = (var65 << 7) + (var78 << 6);
                        int var87 = (var66 << 7) + (var79 << 6);
                        class98 var88 = var77.method652(var68, var69, var84, var86, var85, var87);
                        if (var88 != null) {
                            method2368(Statics.field59, var65, var66, var70, -1, 0, 0, var63 + 1, var74 + 1);
                            var76.field37 = field251 + var63;
                            var76.field46 = field251 + var74;
                            var76.field43 = var88;
                            var76.field39 = var65 * 128 + var78 * 64;
                            var76.field45 = var66 * 128 + var79 * 64;
                            var76.field31 = var85;
                            if (var62 > var71) {
                                byte var89 = var62;
                                var62 = var71;
                                var71 = var89;
                            }
                            if (var72 > var61) {
                                byte var90 = var72;
                                var72 = var61;
                                var61 = var90;
                            }
                            var76.field41 = var62 + var65;
                            var76.field47 = var65 + var71;
                            var76.field44 = var66 + var72;
                            var76.field33 = var61 + var66;
                        }
                    }
                }
                if (field287 == 45) {
                    int var91 = field285.method2166();
                    int var92 = field285.method2125();
                    int var93 = (var92 >> 4 & 0x7) + Statics.field1581;
                    int var94 = (var92 & 0x7) + Statics.field213;
                    int var95 = field285.method2136();
                    if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                        class25 var96 = new class25();
                        var96.field605 = var91;
                        var96.field615 = var95;
                        if (field377[Statics.field59][var93][var94] == null) {
                            field377[Statics.field59][var93][var94] = new class178();
                        }
                        field377[Statics.field59][var93][var94].method3200(var96);
                        method2386(var93, var94);
                    }
                } else if (field287 == 200) {
                    int var97 = field285.method2101();
                    int var98 = (var97 >> 4 & 0x7) + Statics.field1581;
                    int var99 = (var97 & 0x7) + Statics.field213;
                    int var100 = var98 + field285.method2263();
                    int var101 = var99 + field285.method2263();
                    int var102 = field285.method2104();
                    int var103 = field285.method2166();
                    int var104 = field285.method2101() * 4;
                    int var105 = field285.method2101() * 4;
                    int var106 = field285.method2166();
                    int var107 = field285.method2166();
                    int var108 = field285.method2101();
                    int var109 = field285.method2101();
                    if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                        int var110 = var98 * 128 + 64;
                        int var111 = var99 * 128 + 64;
                        int var112 = var100 * 128 + 64;
                        int var113 = var101 * 128 + 64;
                        class7 var114 = new class7(var103, Statics.field59, var110, var111, method79(var110, var111, Statics.field59) - var104, field251 + var106, field251 + var107, var108, var109, var102, var105);
                        var114.method89(var112, var113, method79(var112, var113, Statics.field59) - var105, field251 + var106);
                        field472.method3200(var114);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dj.bi(IIIIIIIIII)V")
    public static final void method2368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field378.method3196(); var10 != null; var10 = (class15) field378.method3206()) {
            if (var10.field211 == arg0 && var10.field198 == arg1 && var10.field205 == arg2 && var10.field197 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field211 = arg0;
            var9.field197 = arg3;
            var9.field198 = arg1;
            var9.field205 = arg2;
            Statics.method1758(var9);
            field378.method3200(var9);
        }
        var9.field203 = arg4;
        var9.field196 = arg5;
        var9.field204 = arg6;
        var9.field206 = arg7;
        var9.field207 = arg8;
    }

    @ObfuscatedName("dm.by(I)V")
    public static final void method2506() {
        for (class15 var0 = (class15) field378.method3196(); var0 != null; var0 = (class15) field378.method3206()) {
            if (var0.field207 == -1) {
                var0.field206 = 0;
                Statics.method1758(var0);
            } else {
                var0.method3280();
            }
        }
    }

    @ObfuscatedName("et.bs(I)V")
    public static final void method2775() {
        for (class15 var0 = (class15) field378.method3196(); var0 != null; var0 = (class15) field378.method3206()) {
            if (var0.field207 > 0) {
                var0.field207--;
            }
            if (var0.field207 != 0) {
                if (var0.field206 > 0) {
                    var0.field206--;
                }
                if (var0.field206 == 0 && var0.field198 >= 1 && var0.field205 >= 1 && var0.field198 <= 102 && var0.field205 <= 102 && (var0.field203 < 0 || class6.method2043(var0.field203, var0.field196))) {
                    method33(var0.field211, var0.field197, var0.field198, var0.field205, var0.field203, var0.field204, var0.field196);
                    var0.field206 = -1;
                    if (var0.field203 == var0.field200 && var0.field200 == -1) {
                        var0.method3280();
                    } else if (var0.field203 == var0.field200 && var0.field204 == var0.field201 && var0.field202 == var0.field196) {
                        var0.method3280();
                    }
                }
            } else if (var0.field200 < 0 || class6.method2043(var0.field200, var0.field202)) {
                method33(var0.field211, var0.field197, var0.field198, var0.field205, var0.field200, var0.field201, var0.field202);
                var0.method3280();
            }
        }
    }

    @ObfuscatedName("m.bw(IIIIIIII)V")
    public static final void method33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field403 && Statics.field59 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field199.method1618(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field199.method1634(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field199.method1635(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field199.method1714(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field199.method1718(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field199.method1624(arg0, arg2, arg3);
                class36 var15 = class36.method2773(var12);
                if (var15.field850 != 0) {
                    field418[arg0].method3476(arg2, arg3, var13, var14, var15.field847);
                }
            }
            if (arg1 == 1) {
                Statics.field199.method1742(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field199.method1648(arg0, arg2, arg3);
                class36 var16 = class36.method2773(var12);
                if (var16.field844 + arg2 > 103 || var16.field844 + arg3 > 103 || var16.field845 + arg2 > 103 || var16.field845 + arg3 > 103) {
                    return;
                }
                if (var16.field850 != 0) {
                    field418[arg0].method3477(arg2, arg3, var16.field844, var16.field845, var14, var16.field847);
                }
            }
            if (arg1 == 3) {
                Statics.field199.method1627(arg0, arg2, arg3);
                class36 var17 = class36.method2773(var12);
                if (var17.field850 == 1) {
                    field418[arg0].method3487(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field66[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class79 var19 = Statics.field199;
        class198 var20 = field418[arg0];
        class36 var21 = class36.method2773(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field845;
            var23 = var21.field844;
        } else {
            var22 = var21.field844;
            var23 = var21.field845;
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
        int[][] var28 = class6.field65[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field867 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field851 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class78 var34;
            if (var21.field852 == -1 && var21.field846 == null) {
                var34 = var21.method652(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field852, true, (class78) null);
            }
            var19.method1614(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field850 == 1) {
                var20.method3495(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class78 var57;
            if (var21.field852 == -1 && var21.field846 == null) {
                var57 = var21.method652(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field852, true, (class78) null);
            }
            if (var57 != null) {
                var19.method1607(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field850 != 0) {
                var20.method3473(arg2, arg3, var22, var23, var21.field847);
            }
        } else if (arg6 >= 12) {
            class78 var35;
            if (var21.field852 == -1 && var21.field846 == null) {
                var35 = var21.method652(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field852, true, (class78) null);
            }
            var19.method1607(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3473(arg2, arg3, var22, var23, var21.field847);
            }
        } else if (arg6 == 0) {
            class78 var36;
            if (var21.field852 == -1 && var21.field846 == null) {
                var36 = var21.method652(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field852, true, (class78) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var36, (class78) null, class6.field73[arg5], 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3472(arg2, arg3, arg6, arg5, var21.field847);
            }
        } else if (arg6 == 1) {
            class78 var37;
            if (var21.field852 == -1 && var21.field846 == null) {
                var37 = var21.method652(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field852, true, (class78) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var37, (class78) null, class6.field74[arg5], 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3472(arg2, arg3, arg6, arg5, var21.field847);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class78 var39;
            class78 var40;
            if (var21.field852 == -1 && var21.field846 == null) {
                var39 = var21.method652(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method652(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field852, true, (class78) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field852, true, (class78) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var39, var40, class6.field73[arg5], class6.field73[var38], var32, var33);
            if (var21.field850 != 0) {
                var20.method3472(arg2, arg3, arg6, arg5, var21.field847);
            }
        } else if (arg6 == 3) {
            class78 var41;
            if (var21.field852 == -1 && var21.field846 == null) {
                var41 = var21.method652(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field852, true, (class78) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var41, (class78) null, class6.field74[arg5], 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3472(arg2, arg3, arg6, arg5, var21.field847);
            }
        } else if (arg6 == 9) {
            class78 var42;
            if (var21.field852 == -1 && var21.field846 == null) {
                var42 = var21.method652(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field852, true, (class78) null);
            }
            var19.method1607(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3473(arg2, arg3, var22, var23, var21.field847);
            }
        } else if (arg6 == 4) {
            class78 var43;
            if (var21.field852 == -1 && var21.field846 == null) {
                var43 = var21.method652(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field852, true, (class78) null);
            }
            var19.method1625(arg0, arg2, arg3, var29, var43, (class78) null, class6.field73[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1618(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class36.method2773(var45 >> 14 & 0x7FFF).field853;
            }
            class78 var46;
            if (var21.field852 == -1 && var21.field846 == null) {
                var46 = var21.method652(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field852, true, (class78) null);
            }
            var19.method1625(arg0, arg2, arg3, var29, var46, (class78) null, class6.field73[arg5], 0, class6.field82[arg5] * var44, class6.field76[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1618(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class36.method2773(var48 >> 14 & 0x7FFF).field853 / 2;
            }
            class78 var49;
            if (var21.field852 == -1 && var21.field846 == null) {
                var49 = var21.method652(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field852, true, (class78) null);
            }
            var19.method1625(arg0, arg2, arg3, var29, var49, (class78) null, 256, arg5, class6.field68[arg5] * var47, class6.field78[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class78 var51;
            if (var21.field852 == -1 && var21.field846 == null) {
                var51 = var21.method652(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field852, true, (class78) null);
            }
            var19.method1625(arg0, arg2, arg3, var29, var51, (class78) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1618(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class36.method2773(var53 >> 14 & 0x7FFF).field853 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class78 var55;
            class78 var56;
            if (var21.field852 == -1 && var21.field846 == null) {
                var55 = var21.method652(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method652(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field852, true, (class78) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field852, true, (class78) null);
            }
            var19.method1625(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field68[arg5] * var52, class6.field78[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("dh.bo(III)V")
    public static final void method2386(int arg0, int arg1) {
        class178 var2 = field377[Statics.field59][arg0][arg1];
        if (var2 == null) {
            Statics.field199.method1643(Statics.field59, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3196(); var6 != null; var6 = (class25) var2.method3206()) {
            class45 var7 = class45.method612(var6.field605);
            long var8 = (long) var7.field1026;
            if (var7.field1043 == 1) {
                var8 = (long) (var6.field615 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field199.method1643(Statics.field59, arg0, arg1);
            return;
        }
        var2.method3217(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3196(); var12 != null; var12 = (class25) var2.method3206()) {
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
        Statics.field199.method1615(Statics.field59, arg0, arg1, method79(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field59), var5, var13, var10, var11);
    }

    @ObfuscatedName("cc.be(I)V")
    public static final void method1861() {
        field285.method2326();
        int var0 = field285.method2327(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field285.method2327(2);
        if (var1 == 0) {
            field255[++field365 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field285.method2327(3);
            Statics.field628.method598(var2, false);
            int var3 = field285.method2327(1);
            if (var3 == 1) {
                field255[++field365 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field285.method2327(3);
            Statics.field628.method598(var4, true);
            int var5 = field285.method2327(3);
            Statics.field628.method598(var5, true);
            int var6 = field285.method2327(1);
            if (var6 == 1) {
                field255[++field365 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field285.method2327(1);
            if (var7 == 1) {
                field255[++field365 - 1] = 2047;
            }
            int var8 = field285.method2327(7);
            Statics.field59 = field285.method2327(2);
            int var9 = field285.method2327(1);
            int var10 = field285.method2327(7);
            Statics.field628.method605(var10, var8, var9 == 1);
        }
    }

    @ObfuscatedName("client.bu(B)V")
    public static final void method484() {
        int var0 = field285.method2327(8);
        if (var0 < field259) {
            for (int var1 = var0; var1 < field259; var1++) {
                field371[++field370 - 1] = field364[var1];
            }
        }
        if (var0 > field259) {
            throw new RuntimeException("");
        }
        field259 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field364[var2];
            class3 var4 = field386[var3];
            int var5 = field285.method2327(1);
            if (var5 == 0) {
                field364[++field259 - 1] = var3;
                var4.field776 = field251;
            } else {
                int var6 = field285.method2327(2);
                if (var6 == 0) {
                    field364[++field259 - 1] = var3;
                    var4.field776 = field251;
                    field255[++field365 - 1] = var3;
                } else if (var6 == 1) {
                    field364[++field259 - 1] = var3;
                    var4.field776 = field251;
                    int var7 = field285.method2327(3);
                    var4.method598(var7, false);
                    int var8 = field285.method2327(1);
                    if (var8 == 1) {
                        field255[++field365 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field364[++field259 - 1] = var3;
                    var4.field776 = field251;
                    int var9 = field285.method2327(3);
                    var4.method598(var9, true);
                    int var10 = field285.method2327(3);
                    var4.method598(var10, true);
                    int var11 = field285.method2327(1);
                    if (var11 == 1) {
                        field255[++field365 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field371[++field370 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("av.bk(I)V")
    public static final void method614() {
        for (int var0 = 0; var0 < field365; var0++) {
            int var1 = field255[var0];
            class3 var2 = field386[var1];
            int var3 = field285.method2101();
            if ((var3 & 0x10) != 0) {
                var3 += field285.method2101() << 8;
            }
            if ((var3 & 0x1) != 0) {
                int var4 = field285.method2134();
                int var5 = field285.method2125();
                var2.method597(var4, var5, field251);
                var2.field742 = field251 + 300;
                var2.field743 = field285.method2125();
                var2.field744 = field285.method2090();
            }
            if ((var3 & 0x4) != 0) {
                var2.field746 = field285.method2166();
                var2.field755 = field285.method2134();
            }
            if ((var3 & 0x200) != 0) {
                int var6 = field285.method2134();
                int var7 = field285.method2090();
                var2.method597(var6, var7, field251);
                var2.field742 = field251 + 300;
                var2.field743 = field285.method2125();
                var2.field744 = field285.method2101();
            }
            if ((var3 & 0x8) != 0) {
                int var8 = field285.method2134();
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = field285.method2125();
                method2321(var2, var8, var9);
            }
            if ((var3 & 0x80) != 0) {
                var2.field748 = field285.method2137();
                if (var2.field748.charAt(0) == '~') {
                    var2.field748 = var2.field748.substring(1);
                    class10.method100(2, var2.field42, var2.field748);
                } else if (Statics.field628 == var2) {
                    class10.method100(2, var2.field42, var2.field748);
                }
                var2.field734 = false;
                var2.field737 = 0;
                var2.field738 = 0;
                var2.field736 = 150;
            }
            if ((var3 & 0x400) != 0) {
                var2.field747 = field285.method2101();
                var2.field763 = field285.method2101();
                var2.field762 = field285.method2101();
                var2.field733 = field285.method2125();
                var2.field765 = field285.method2127() + field251;
                var2.field753 = field285.method2136() + field251;
                var2.field767 = field285.method2090();
                var2.field773 = 1;
                var2.field761 = 0;
            }
            if ((var3 & 0x2) != 0) {
                int var10 = field285.method2166();
                class138[] var11 = new class138[] { class138.field2093, class138.field2102, class138.field2104, class138.field2097, class138.field2095 };
                class138 var12 = (class138) class99.method511(var11, field285.method2101());
                boolean var13 = field285.method2125() == 1;
                int var14 = field285.method2090();
                int var15 = field285.field1835;
                if (var2.field42 != null && var2.field30 != null) {
                    boolean var16 = false;
                    if (var12.field2100 && method2433(var2.field42)) {
                        var16 = true;
                    }
                    if (!var16 && field419 == 0 && !var2.field49) {
                        field267.field1835 = 0;
                        field285.method2256(field267.field1839, 0, var14);
                        field267.field1835 = 0;
                        class107 var17 = field267;
                        String var21;
                        try {
                            int var18 = var17.method2114();
                            if (var18 > 32767) {
                                var18 = 32767;
                            }
                            byte[] var19 = new byte[var18];
                            var17.field1835 += Statics.field2907.method2028(var17.field1839, var17.field1835, var19, 0, var18);
                            String var20 = class202.method2859(var19, 0, var18);
                            var21 = var20;
                        } catch (Exception var30) {
                            var21 = "Cabbage";
                        }
                        String var24 = class193.method3318(class200.method516(var21));
                        var2.field748 = var24.trim();
                        var2.field737 = var10 >> 8;
                        var2.field738 = var10 & 0xFF;
                        var2.field736 = 150;
                        var2.field734 = var13;
                        var2.field735 = Statics.field628 != var2 && var12.field2100 && field460 != "" && var24.toLowerCase().indexOf(field460) == -1;
                        int var25;
                        if (var12.field2099) {
                            var25 = var13 ? 91 : 1;
                        } else {
                            var25 = var13 ? 90 : 2;
                        }
                        if (var12.field2098 == -1) {
                            class10.method100(var25, var2.field42, var24);
                        } else {
                            class10.method100(var25, class2.method2522(var12.field2098) + var2.field42, var24);
                        }
                    }
                }
                field285.field1835 = var14 + var15;
            }
            if ((var3 & 0x20) != 0) {
                int var26 = field285.method2090();
                byte[] var27 = new byte[var26];
                class107 var28 = new class107(var27);
                field285.method2144(var27, 0, var26);
                field479[var1] = var28;
                var2.method16(var28);
            }
            if ((var3 & 0x40) != 0) {
                var2.field745 = field285.method2136();
                if (var2.field745 == 65535) {
                    var2.field745 = -1;
                }
            }
            if ((var3 & 0x100) != 0) {
                var2.field723 = field285.method2136();
                int var29 = field285.method2142();
                var2.field760 = var29 >> 16;
                var2.field732 = (var29 & 0xFFFF) + field251;
                var2.field757 = 0;
                var2.field758 = 0;
                if (var2.field732 > field251) {
                    var2.field757 = -1;
                }
                if (var2.field723 == 65535) {
                    var2.field723 = -1;
                }
            }
        }
    }

    @ObfuscatedName("c.bm(IIIII)V")
    public static final void method493(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field447; var4++) {
            if (field454[var4] + field452[var4] > arg0 && field452[var4] < arg0 + arg2 && field343[var4] + field317[var4] > arg1 && field343[var4] < arg1 + arg3) {
                field449[var4] = true;
            }
        }
    }

    @ObfuscatedName("f.bx(IIIII)V")
    public static final void method160(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field447; var4++) {
            if (field454[var4] + field452[var4] > arg0 && field452[var4] < arg0 + arg2 && field343[var4] + field317[var4] > arg1 && field343[var4] < arg1 + arg3) {
                field351[var4] = true;
            }
        }
    }

    @ObfuscatedName("bp.bj(I)V")
    public static final void method1331() {
        method31();
        if (Statics.field237 != null || field417 != null) {
            return;
        }
        int var0 = class127.field1997;
        if (field466) {
            if (var0 != 1 && (Statics.field2473 || var0 != 4)) {
                int var1 = class127.field1992;
                int var2 = class127.field1988;
                if (var1 < Statics.field976 - 10 || var1 > Statics.field976 + Statics.field827 + 10 || var2 < Statics.field221 - 10 || var2 > Statics.field221 + Statics.field136 + 10) {
                    field466 = false;
                    method493(Statics.field976, Statics.field221, Statics.field827, Statics.field136);
                }
            }
            if (var0 == 1 || !Statics.field2473 && var0 == 4) {
                int var3 = Statics.field976;
                int var4 = Statics.field221;
                int var5 = Statics.field827;
                int var6 = class127.field1998;
                int var7 = class127.field1999;
                int var8 = -1;
                for (int var9 = 0; var9 < field494; var9++) {
                    int var10 = (field494 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1 && var8 >= 0) {
                    int var11 = field282[var8];
                    int var12 = field388[var8];
                    int var13 = field299[var8];
                    int var14 = field390[var8];
                    String var15 = field391[var8];
                    String var16 = field366[var8];
                    method2645(var11, var12, var13, var14, var15, var16, class127.field1998, class127.field1999);
                }
                field466 = false;
                method493(Statics.field976, Statics.field221, Statics.field827, Statics.field136);
            }
            return;
        }
        if ((var0 == 1 || !Statics.field2473 && var0 == 4) && field494 > 0) {
            int var17 = field299[field494 - 1];
            if (var17 == 39 || var17 == 40 || var17 == 41 || var17 == 42 || var17 == 43 || var17 == 33 || var17 == 34 || var17 == 35 || var17 == 36 || var17 == 37 || var17 == 38 || var17 == 1005) {
                label208: {
                    int var18 = field282[field494 - 1];
                    int var19 = field388[field494 - 1];
                    class153 var20 = class153.method2362(var19);
                    int var21 = method3000(var20);
                    boolean var22 = (var21 >> 28 & 0x1) != 0;
                    if (!var22) {
                        int var23 = method3000(var20);
                        boolean var24 = (var23 >> 29 & 0x1) != 0;
                        if (!var24) {
                            break label208;
                        }
                    }
                    if (Statics.field237 != null && !field396 && field384 != 1 && !method2466(field494 - 1) && field494 > 0) {
                        int var25 = field493;
                        int var26 = field476;
                        method512(Statics.field699, var25, var26);
                        Statics.field699 = null;
                    }
                    field396 = false;
                    field360 = 0;
                    if (Statics.field237 != null) {
                        method1839(Statics.field237);
                    }
                    Statics.field237 = class153.method2362(var19);
                    field355 = var18;
                    field493 = class127.field1998;
                    field476 = class127.field1999;
                    if (field494 > 0) {
                        int var27 = field494 - 1;
                        Statics.field699 = new class27();
                        Statics.field699.field640 = field282[var27];
                        Statics.field699.field634 = field388[var27];
                        Statics.field699.field636 = field299[var27];
                        Statics.field699.field642 = field390[var27];
                        Statics.field699.field637 = field391[var27];
                    }
                    method1839(Statics.field237);
                    return;
                }
            }
        }
        if ((var0 == 1 || !Statics.field2473 && var0 == 4) && (field384 == 1 && field494 > 2 || method2466(field494 - 1))) {
            var0 = 2;
        }
        if ((var0 == 1 || !Statics.field2473 && var0 == 4) && field494 > 0) {
            method1(field494 - 1);
        }
        if (var0 == 2 && field494 > 0) {
            method1323(class127.field1998, class127.field1999);
        }
    }

    @ObfuscatedName("bp.bp(III)V")
    public static final void method1323(int arg0, int arg1) {
        int var2 = Statics.field611.method3314(class143.field2341);
        for (int var3 = 0; var3 < field494; var3++) {
            int var4 = Statics.field611.method3314(method68(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field494 * 15 + 21;
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
        field466 = true;
        Statics.field976 = var6;
        Statics.field221 = var7;
        Statics.field827 = var2;
        Statics.field136 = field494 * 15 + 22;
    }

    @ObfuscatedName("dv.bn(IB)Z")
    public static final boolean method2466(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field299[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("g.br(II)V")
    public static final void method1(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field282[arg0];
        int var2 = field388[arg0];
        int var3 = field299[arg0];
        int var4 = field390[arg0];
        String var5 = field391[arg0];
        String var6 = field366[arg0];
        method2645(var1, var2, var3, var4, var5, var6, class127.field1998, class127.field1999);
    }

    @ObfuscatedName("d.bt(Lah;IIB)V")
    public static final void method512(class27 arg0, int arg1, int arg2) {
        method2645(arg0.field640, arg0.field634, arg0.field636, arg0.field642, arg0.field637, arg0.field637, arg1, arg2);
    }

    @ObfuscatedName("el.bv(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2645(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 26) {
            method10();
        }
        if (arg2 == 11) {
            class30 var8 = field279[arg3];
            if (var8 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(155);
                field361.method2088(arg3);
                field361.method2132(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 47) {
            class3 var9 = field386[arg3];
            if (var9 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(181);
                field361.method2087(class124.field1957[82] ? 1 : 0);
                field361.method2133(arg3);
            }
        }
        if (arg2 == 12) {
            class30 var10 = field279[arg3];
            if (var10 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(47);
                field361.method2122(class124.field1957[82] ? 1 : 0);
                field361.method2209(arg3);
            }
        }
        if (arg2 == 40) {
            field361.method2334(108);
            field361.method2140(arg1);
            field361.method2209(arg3);
            field361.method2284(arg0);
            field353 = 0;
            Statics.field1855 = class153.method2362(arg1);
            field354 = arg0;
        }
        if (arg2 == 29) {
            field361.method2334(82);
            field361.method2253(arg1);
            class153 var11 = class153.method2362(arg1);
            if (var11.field2631 != null && var11.field2631[0][0] == 5) {
                int var12 = var11.field2631[0][1];
                if (class155.field2664[var12] != var11.field2559[0]) {
                    class155.field2664[var12] = var11.field2559[0];
                    method29(var12);
                }
            }
        }
        if (arg2 == 33) {
            field361.method2334(201);
            field361.method2133(arg3);
            field361.method2139(arg1);
            field361.method2284(arg0);
            field353 = 0;
            Statics.field1855 = class153.method2362(arg1);
            field354 = arg0;
        }
        if (arg2 == 3) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field256 = arg0;
            field475 = arg1;
            field361.method2334(158);
            field361.method2088(Statics.field2103 + arg0);
            field361.method2133(arg3 >> 14 & 0x7FFF);
            field361.method2087(class124.field1957[82] ? 1 : 0);
            field361.method2209(Statics.field88 + arg1);
        }
        if (arg2 == 58) {
            class153 var13 = class153.method2470(arg1, arg0);
            if (var13 != null) {
                field361.method2334(74);
                field361.method2139(arg1);
                field361.method2088(field340);
                field361.method2133(field401);
                field361.method2133(arg0);
                field361.method2133(var13.field2639);
                field361.method2253(Statics.field801);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class153 var14 = class153.method2470(arg1, arg0);
            if (var14 != null) {
                method132(arg3, arg1, arg0, var14.field2639, arg5);
            }
        }
        if (arg2 == 36) {
            field361.method2334(210);
            field361.method2141(arg1);
            field361.method2284(arg3);
            field361.method2284(arg0);
            field353 = 0;
            Statics.field1855 = class153.method2362(arg1);
            field354 = arg0;
        }
        if (arg2 == 46) {
            class3 var15 = field386[arg3];
            if (var15 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(194);
                field361.method2284(arg3);
                field361.method2122(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class3 var16 = field386[arg3];
            if (var16 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(49);
                field361.method2088(arg3);
                field361.method2197(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 20) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field256 = arg0;
            field475 = arg1;
            field361.method2334(57);
            field361.method2209(Statics.field88 + arg1);
            field361.method2209(Statics.field2103 + arg0);
            field361.method2132(class124.field1957[82] ? 1 : 0);
            field361.method2133(arg3);
        }
        if (arg2 == 49) {
            class3 var17 = field386[arg3];
            if (var17 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(175);
                field361.method2284(arg3);
                field361.method2132(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 42) {
            field361.method2334(6);
            field361.method2284(arg3);
            field361.method2139(arg1);
            field361.method2088(arg0);
            field353 = 0;
            Statics.field1855 = class153.method2362(arg1);
            field354 = arg0;
        }
        if (arg2 == 22) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field256 = arg0;
            field475 = arg1;
            field361.method2334(226);
            field361.method2284(Statics.field2103 + arg0);
            field361.method2133(arg3);
            field361.method2122(class124.field1957[82] ? 1 : 0);
            field361.method2284(Statics.field88 + arg1);
        }
        if (arg2 == 1001) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field256 = arg0;
            field475 = arg1;
            field361.method2334(81);
            field361.method2133(Statics.field88 + arg1);
            field361.method2209(Statics.field2103 + arg0);
            field361.method2133(arg3 >> 14 & 0x7FFF);
            field361.method2087(class124.field1957[82] ? 1 : 0);
        }
        if (arg2 == 5) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field256 = arg0;
            field475 = arg1;
            field361.method2334(103);
            field361.method2197(class124.field1957[82] ? 1 : 0);
            field361.method2209(Statics.field2103 + arg0);
            field361.method2284(Statics.field88 + arg1);
            field361.method2088(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 25) {
            class153 var18 = class153.method2470(arg1, arg0);
            if (var18 != null) {
                method169();
                method2807(arg1, arg0, class157.method648(method3000(var18)), var18.field2639);
                field398 = 0;
                String var19;
                if (class157.method648(method3000(var18)) == 0) {
                    var19 = null;
                } else if (var18.field2652 == null || var18.field2652.trim().length() == 0) {
                    var19 = null;
                } else {
                    var19 = var18.field2652;
                }
                field367 = var19;
                if (field367 == null) {
                    field367 = "Null";
                }
                if (var18.field2534) {
                    field404 = var18.field2595 + class2.method2037(16777215);
                } else {
                    field404 = class2.method2037(65280) + var18.field2625 + class2.method2037(16777215);
                }
            }
            return;
        }
        if (arg2 == 35) {
            field361.method2334(234);
            field361.method2133(arg3);
            field361.method2141(arg1);
            field361.method2209(arg0);
            field353 = 0;
            Statics.field1855 = class153.method2362(arg1);
            field354 = arg0;
        }
        if (arg2 == 41) {
            field361.method2334(161);
            field361.method2133(arg0);
            field361.method2284(arg3);
            field361.method2140(arg1);
            field353 = 0;
            Statics.field1855 = class153.method2362(arg1);
            field354 = arg0;
        }
        if (arg2 == 16) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field256 = arg0;
            field475 = arg1;
            field361.method2334(58);
            field361.method2209(Statics.field2103 + arg0);
            field361.method2209(Statics.field154);
            field361.method2284(Statics.field88 + arg1);
            field361.method2133(Statics.field153);
            field361.method2197(class124.field1957[82] ? 1 : 0);
            field361.method2088(arg3);
            field361.method2140(Statics.field159);
        }
        if (arg2 == 43) {
            field361.method2334(144);
            field361.method2133(arg3);
            field361.method2284(arg0);
            field361.method2140(arg1);
            field353 = 0;
            Statics.field1855 = class153.method2362(arg1);
            field354 = arg0;
        }
        if (arg2 == 1003) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            class30 var20 = field279[arg3];
            if (var20 != null) {
                class35 var21 = var20.field689;
                if (var21.field808 != null) {
                    var21 = var21.method643();
                }
                if (var21 != null) {
                    field361.method2334(205);
                    field361.method2284(var21.field791);
                }
            }
        }
        if (arg2 == 14) {
            class3 var22 = field386[arg3];
            if (var22 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(178);
                field361.method2088(Statics.field153);
                field361.method2141(Statics.field159);
                field361.method2209(arg3);
                field361.method2088(Statics.field154);
                field361.method2197(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class30 var23 = field279[arg3];
            if (var23 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(153);
                field361.method2133(arg3);
                field361.method2087(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 48) {
            class3 var24 = field386[arg3];
            if (var24 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(63);
                field361.method2087(class124.field1957[82] ? 1 : 0);
                field361.method2088(arg3);
            }
        }
        if (arg2 == 2) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field256 = arg0;
            field475 = arg1;
            field361.method2334(93);
            field361.method2088(Statics.field88 + arg1);
            field361.method2133(arg3 >> 14 & 0x7FFF);
            field361.method2197(class124.field1957[82] ? 1 : 0);
            field361.method2088(field401);
            field361.method2088(Statics.field2103 + arg0);
            field361.method2253(Statics.field801);
        }
        if (arg2 == 7) {
            class30 var25 = field279[arg3];
            if (var25 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(208);
                field361.method2197(class124.field1957[82] ? 1 : 0);
                field361.method2133(Statics.field154);
                field361.method2253(Statics.field159);
                field361.method2209(arg3);
                field361.method2284(Statics.field153);
            }
        }
        if (arg2 == 31) {
            field361.method2334(13);
            field361.method2284(arg3);
            field361.method2140(Statics.field159);
            field361.method2088(Statics.field154);
            field361.method2133(arg0);
            field361.method2284(Statics.field153);
            field361.method2139(arg1);
            field353 = 0;
            Statics.field1855 = class153.method2362(arg1);
            field354 = arg0;
        }
        if (arg2 == 15) {
            class3 var26 = field386[arg3];
            if (var26 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(229);
                field361.method2197(class124.field1957[82] ? 1 : 0);
                field361.method2141(Statics.field801);
                field361.method2284(field401);
                field361.method2133(arg3);
            }
        }
        if (arg2 == 4) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field256 = arg0;
            field475 = arg1;
            field361.method2334(193);
            field361.method2284(arg3 >> 14 & 0x7FFF);
            field361.method2122(class124.field1957[82] ? 1 : 0);
            field361.method2088(Statics.field88 + arg1);
            field361.method2209(Statics.field2103 + arg0);
        }
        if (arg2 == 39) {
            field361.method2334(141);
            field361.method2209(arg0);
            field361.method2139(arg1);
            field361.method2133(arg3);
            field353 = 0;
            Statics.field1855 = class153.method2362(arg1);
            field354 = arg0;
        }
        if (arg2 == 18) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field256 = arg0;
            field475 = arg1;
            field361.method2334(9);
            field361.method2133(Statics.field88 + arg1);
            field361.method2088(Statics.field2103 + arg0);
            field361.method2197(class124.field1957[82] ? 1 : 0);
            field361.method2088(arg3);
        }
        if (arg2 == 44) {
            class3 var27 = field386[arg3];
            if (var27 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(48);
                field361.method2088(arg3);
                field361.method2132(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 38) {
            method169();
            class153 var28 = class153.method2362(arg1);
            field398 = 1;
            Statics.field153 = arg0;
            Statics.field159 = arg1;
            Statics.field154 = arg3;
            method1839(var28);
            field399 = class2.method2037(16748608) + class45.method612(arg3).field1014 + class2.method2037(16777215);
            if (field399 == null) {
                field399 = "null";
            }
            return;
        }
        if (arg2 == 1004) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field361.method2334(20);
            field361.method2133(arg3);
        }
        if (arg2 == 10) {
            class30 var29 = field279[arg3];
            if (var29 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(138);
                field361.method2132(class124.field1957[82] ? 1 : 0);
                field361.method2209(arg3);
            }
        }
        if (arg2 == 9) {
            class30 var30 = field279[arg3];
            if (var30 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(174);
                field361.method2132(class124.field1957[82] ? 1 : 0);
                field361.method2088(arg3);
            }
        }
        if (arg2 == 37) {
            field361.method2334(4);
            field361.method2284(arg3);
            field361.method2253(arg1);
            field361.method2088(arg0);
            field353 = 0;
            Statics.field1855 = class153.method2362(arg1);
            field354 = arg0;
        }
        if (arg2 == 24) {
            class153 var31 = class153.method2362(arg1);
            boolean var32 = true;
            if (var31.field2539 > 0) {
                var32 = method3102(var31);
            }
            if (var32) {
                field361.method2334(82);
                field361.method2253(arg1);
            }
        }
        if (arg2 == 1) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field256 = arg0;
            field475 = arg1;
            field361.method2334(99);
            field361.method2133(Statics.field2103 + arg0);
            field361.method2197(class124.field1957[82] ? 1 : 0);
            field361.method2133(Statics.field154);
            field361.method2088(Statics.field88 + arg1);
            field361.method2139(Statics.field159);
            field361.method2209(Statics.field153);
            field361.method2209(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 32) {
            field361.method2334(156);
            field361.method2140(arg1);
            field361.method2088(field401);
            field361.method2253(Statics.field801);
            field361.method2284(arg0);
            field361.method2284(arg3);
            field353 = 0;
            Statics.field1855 = class153.method2362(arg1);
            field354 = arg0;
        }
        if (arg2 == 34) {
            field361.method2334(168);
            field361.method2088(arg0);
            field361.method2253(arg1);
            field361.method2088(arg3);
            field353 = 0;
            Statics.field1855 = class153.method2362(arg1);
            field354 = arg0;
        }
        if (arg2 == 28) {
            field361.method2334(82);
            field361.method2253(arg1);
            class153 var33 = class153.method2362(arg1);
            if (var33.field2631 != null && var33.field2631[0][0] == 5) {
                int var34 = var33.field2631[0][1];
                class155.field2664[var34] = 1 - class155.field2664[var34];
                method29(var34);
            }
        }
        if (arg2 == 23) {
            Statics.field199.method1644(Statics.field59, arg0, arg1);
        }
        if (arg2 == 1002) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field361.method2334(24);
            field361.method2088(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 6) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field256 = arg0;
            field475 = arg1;
            field361.method2334(239);
            field361.method2209(arg3 >> 14 & 0x7FFF);
            field361.method2197(class124.field1957[82] ? 1 : 0);
            field361.method2284(Statics.field2103 + arg0);
            field361.method2088(Statics.field88 + arg1);
        }
        if (arg2 == 45) {
            class3 var35 = field386[arg3];
            if (var35 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(139);
                field361.method2133(arg3);
                field361.method2087(class124.field1957[82] ? 1 : 0);
            }
        }
        if (arg2 == 1005) {
            class153 var36 = class153.method2362(arg1);
            if (var36 == null || var36.field2643[arg0] < 100000) {
                field361.method2334(20);
                field361.method2133(arg3);
            } else {
                class10.method100(27, "", var36.field2643[arg0] + " x " + class45.method612(arg3).field1014);
            }
            field353 = 0;
            Statics.field1855 = class153.method2362(arg1);
            field354 = arg0;
        }
        if (arg2 == 19) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field256 = arg0;
            field475 = arg1;
            field361.method2334(127);
            field361.method2284(arg3);
            field361.method2209(Statics.field2103 + arg0);
            field361.method2197(class124.field1957[82] ? 1 : 0);
            field361.method2088(Statics.field88 + arg1);
        }
        if (arg2 == 21) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field256 = arg0;
            field475 = arg1;
            field361.method2334(73);
            field361.method2197(class124.field1957[82] ? 1 : 0);
            field361.method2209(Statics.field2103 + arg0);
            field361.method2284(arg3);
            field361.method2209(Statics.field88 + arg1);
        }
        if (arg2 == 17) {
            field349 = arg6;
            field350 = arg7;
            field352 = 2;
            field420 = 0;
            field256 = arg0;
            field475 = arg1;
            field361.method2334(236);
            field361.method2132(class124.field1957[82] ? 1 : 0);
            field361.method2133(Statics.field88 + arg1);
            field361.method2139(Statics.field801);
            field361.method2088(Statics.field2103 + arg0);
            field361.method2284(field401);
            field361.method2284(arg3);
        }
        if (arg2 == 50) {
            class3 var37 = field386[arg3];
            if (var37 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(79);
                field361.method2087(class124.field1957[82] ? 1 : 0);
                field361.method2088(arg3);
            }
        }
        if (arg2 == 30 && field409 == null) {
            field361.method2334(10);
            field361.method2140(arg1);
            field361.method2088(arg0);
            field409 = class153.method2470(arg1, arg0);
            method1839(field409);
        }
        if (arg2 == 8) {
            class30 var38 = field279[arg3];
            if (var38 != null) {
                field349 = arg6;
                field350 = arg7;
                field352 = 2;
                field420 = 0;
                field256 = arg0;
                field475 = arg1;
                field361.method2334(228);
                field361.method2197(class124.field1957[82] ? 1 : 0);
                field361.method2209(arg3);
                field361.method2284(field401);
                field361.method2253(Statics.field801);
            }
        }
        if (field398 != 0) {
            field398 = 0;
            method1839(class153.method2362(Statics.field159));
        }
        if (field400) {
            method169();
        }
        if (Statics.field1855 != null && field353 == 0) {
            method1839(Statics.field1855);
        }
    }

    @ObfuscatedName("eq.ba(IIIII)V")
    public static void method2807(int arg0, int arg1, int arg2, int arg3) {
        class153 var4 = class153.method2470(arg0, arg1);
        if (var4 != null && var4.field2613 != null) {
            class1 var5 = new class1();
            var5.field12 = var4;
            var5.field14 = var4.field2613;
            class32.method572(var5);
        }
        field340 = arg3;
        field400 = true;
        Statics.field801 = arg0;
        field401 = arg1;
        Statics.field614 = arg2;
        method1839(var4);
    }

    @ObfuscatedName("r.bq(S)V")
    public static void method169() {
        if (!field400) {
            return;
        }
        class153 var0 = class153.method2470(Statics.field801, field401);
        if (var0 != null && var0.field2537 != null) {
            class1 var1 = new class1();
            var1.field12 = var0;
            var1.field14 = var0.field2537;
            class32.method572(var1);
        }
        field400 = false;
        method1839(var0);
    }

    @ObfuscatedName("w.bd(IIIILjava/lang/String;B)V")
    public static void method132(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class153 var5 = class153.method2470(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2622 != null) {
            class1 var6 = new class1();
            var6.field12 = var5;
            var6.field6 = arg0;
            var6.field10 = arg4;
            var6.field14 = var5.field2622;
            class32.method572(var6);
        }
        boolean var7 = true;
        if (var5.field2539 > 0) {
            var7 = method3102(var5);
        }
        if (!var7 || !class157.method149(method3000(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field361.method2334(115);
            field361.method2253(arg1);
            field361.method2088(arg2);
            field361.method2088(arg3);
        }
        if (arg0 == 2) {
            field361.method2334(84);
            field361.method2253(arg1);
            field361.method2088(arg2);
            field361.method2088(arg3);
        }
        if (arg0 == 3) {
            field361.method2334(169);
            field361.method2253(arg1);
            field361.method2088(arg2);
            field361.method2088(arg3);
        }
        if (arg0 == 4) {
            field361.method2334(131);
            field361.method2253(arg1);
            field361.method2088(arg2);
            field361.method2088(arg3);
        }
        if (arg0 == 5) {
            field361.method2334(206);
            field361.method2253(arg1);
            field361.method2088(arg2);
            field361.method2088(arg3);
        }
        if (arg0 == 6) {
            field361.method2334(166);
            field361.method2253(arg1);
            field361.method2088(arg2);
            field361.method2088(arg3);
        }
        if (arg0 == 7) {
            field361.method2334(25);
            field361.method2253(arg1);
            field361.method2088(arg2);
            field361.method2088(arg3);
        }
        if (arg0 == 8) {
            field361.method2334(86);
            field361.method2253(arg1);
            field361.method2088(arg2);
            field361.method2088(arg3);
        }
        if (arg0 == 9) {
            field361.method2334(21);
            field361.method2253(arg1);
            field361.method2088(arg2);
            field361.method2088(arg3);
        }
        if (arg0 == 10) {
            field361.method2334(42);
            field361.method2253(arg1);
            field361.method2088(arg2);
            field361.method2088(arg3);
        }
    }

    @ObfuscatedName("m.bl(I)V")
    public static final void method31() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field494 - 1; var1++) {
                if (field299[var1] < 1000 && field299[var1 + 1] > 1000) {
                    String var2 = field366[var1];
                    field366[var1] = field366[var1 + 1];
                    field366[var1 + 1] = var2;
                    String var3 = field391[var1];
                    field391[var1] = field391[var1 + 1];
                    field391[var1 + 1] = var3;
                    int var4 = field299[var1];
                    field299[var1] = field299[var1 + 1];
                    field299[var1 + 1] = var4;
                    int var5 = field282[var1];
                    field282[var1] = field282[var1 + 1];
                    field282[var1 + 1] = var5;
                    int var6 = field388[var1];
                    field388[var1] = field388[var1 + 1];
                    field388[var1 + 1] = var6;
                    int var7 = field390[var1];
                    field390[var1] = field390[var1 + 1];
                    field390[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("cr.bz(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1834(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field466 || field494 >= 500) {
            return;
        }
        field391[field494] = arg0;
        field366[field494] = arg1;
        field299[field494] = arg2;
        field390[field494] = arg3;
        field282[field494] = arg4;
        field388[field494] = arg5;
        field494++;
    }

    @ObfuscatedName("ar.bh(I)V")
    public static void method582() {
        for (int var0 = 0; var0 < field494; var0++) {
            if (method2431(field299[var0])) {
                if (var0 < field494 - 1) {
                    for (int var1 = var0; var1 < field494 - 1; var1++) {
                        field391[var1] = field391[var1 + 1];
                        field366[var1] = field366[var1 + 1];
                        field299[var1] = field299[var1 + 1];
                        field390[var1] = field390[var1 + 1];
                        field282[var1] = field282[var1 + 1];
                        field388[var1] = field388[var1 + 1];
                    }
                }
                field494--;
            }
        }
    }

    @ObfuscatedName("da.cb(II)Z")
    public static boolean method2431(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("j.cj(II)Ljava/lang/String;")
    public static String method68(int arg0) {
        return field366[arg0].length() > 0 ? field391[arg0] + class143.field2300 + field366[arg0] : field391[arg0];
    }

    @ObfuscatedName("d.cq(Lap;IIII)V")
    public static final void method514(class35 arg0, int arg1, int arg2, int arg3) {
        if (field494 >= 400) {
            return;
        }
        if (arg0.field808 != null) {
            arg0 = arg0.method643();
        }
        if (arg0 == null || !arg0.field820 || arg0.field822 && field413 != arg1) {
            return;
        }
        String var4 = arg0.field821;
        if (arg0.field809 != 0) {
            int var6 = arg0.field809;
            int var7 = Statics.field628.field34;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2037(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2037(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2037(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2037(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2037(65280);
            } else if (var8 > 6) {
                var9 = class2.method2037(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2037(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2037(12648192);
            } else {
                var9 = class2.method2037(16776960);
            }
            var4 = var4 + var9 + " " + class2.field19 + class143.field2296 + arg0.field809 + class2.field20;
        }
        if (field398 == 1) {
            method1834(class143.field2340, field399 + " " + class2.field21 + " " + class2.method2037(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field400) {
            String[] var10 = arg0.field807;
            if (field471) {
                var10 = method2874(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class143.field2292)) {
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
                        method1834(var10[var11], class2.method2037(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class143.field2292)) {
                        short var14 = 0;
                        if (field268 == class18.field504 || field268 == class18.field508 && arg0.field809 > Statics.field628.field34) {
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
                        method1834(var10[var13], class2.method2037(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method1834(class143.field2291, class2.method2037(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field614 & 0x2) == 2) {
            method1834(field367, field404 + " " + class2.field21 + " " + class2.method2037(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dp.cd(Lh;IIII)V")
    public static final void method2514(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field628 == arg0 || field494 >= 400) {
            return;
        }
        String var9;
        if (arg0.field35 == 0) {
            String var4 = arg0.field42;
            int var5 = arg0.field34;
            int var6 = Statics.field628.field34;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2037(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2037(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2037(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2037(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2037(65280);
            } else if (var7 > 6) {
                var8 = class2.method2037(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2037(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2037(12648192);
            } else {
                var8 = class2.method2037(16776960);
            }
            var9 = var4 + var8 + " " + class2.field19 + class143.field2296 + arg0.field34 + class2.field20;
        } else {
            var9 = arg0.field42 + " " + class2.field19 + class143.field2343 + arg0.field35 + class2.field20;
        }
        if (field398 == 1) {
            method1834(class143.field2340, field399 + " " + class2.field21 + " " + class2.method2037(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field400) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field373[var10] != null) {
                    short var11 = 0;
                    if (field373[var10].equalsIgnoreCase(class143.field2292)) {
                        if (field268 == class18.field504 || field268 == class18.field508 && arg0.field34 > Statics.field628.field34) {
                            var11 = 2000;
                        }
                        if (Statics.field628.field48 != 0 && arg0.field48 != 0) {
                            if (Statics.field628.field48 == arg0.field48) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field325[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field372[var10] + var11;
                    method1834(field373[var10], class2.method2037(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field614 & 0x8) == 8) {
            method1834(field367, field404 + " " + class2.field21 + " " + class2.method2037(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field494; var14++) {
            if (field299[var14] == 23) {
                field366[var14] = class2.method2037(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ex.cp(IIIIIIIIB)V")
    public static final void method2642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class153.method2045(arg0)) {
            Statics.field2441 = null;
            method633(Statics.field2590[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2441 != null) {
                method633(Statics.field2441, -1412584499, arg1, arg2, arg3, arg4, Statics.field1890, Statics.field158, arg7);
                Statics.field2441 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field449[var8] = true;
            }
        } else {
            field449[arg7] = true;
        }
    }

    @ObfuscatedName("ap.cz([Lei;IIIIIIIII)V")
    public static final void method633(class153[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1521(arg2, arg3, arg4, arg5);
        class84.method1765();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class153 var10 = arg0[var9];
            if (var10 != null && (var10.field2578 == arg1 || arg1 == -1412584499 && field417 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field452[field447] = var10.field2540 + arg6;
                    field343[field447] = var10.field2546 + arg7;
                    field454[field447] = var10.field2544;
                    field317[field447] = var10.field2545;
                    var11 = ++field447 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2650 = var11;
                var10.field2651 = field251;
                if (!var10.field2534 || !method102(var10)) {
                    if (var10.field2539 > 0) {
                        int var12 = var10.field2539;
                        if (var12 == 324) {
                            if (field501 == -1) {
                                field501 = var10.field2598;
                                field502 = var10.field2560;
                            }
                            if (field323.field2679) {
                                var10.field2598 = field501;
                            } else {
                                var10.field2598 = field502;
                            }
                        } else if (var12 == 325) {
                            if (field501 == -1) {
                                field501 = var10.field2598;
                                field502 = var10.field2560;
                            }
                            if (field323.field2679) {
                                var10.field2598 = field502;
                            } else {
                                var10.field2598 = field501;
                            }
                        } else if (var12 == 327) {
                            var10.field2575 = 150;
                            var10.field2576 = (int) (Math.sin((double) field251 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2605 = 5;
                            var10.field2568 = 0;
                        } else if (var12 == 328) {
                            var10.field2575 = 150;
                            var10.field2576 = (int) (Math.sin((double) field251 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2605 = 5;
                            var10.field2568 = 1;
                        }
                    }
                    int var13 = var10.field2540 + arg6;
                    int var14 = var10.field2546 + arg7;
                    int var15 = var10.field2557;
                    if (field417 == var10) {
                        if (arg1 != -1412584499 && !var10.field2648) {
                            Statics.field2441 = arg0;
                            Statics.field1890 = arg6;
                            Statics.field158 = arg7;
                            continue;
                        }
                        if (field440 && field422) {
                            int var16 = class127.field1992;
                            int var17 = class127.field1988;
                            int var18 = var16 - field328;
                            int var19 = var17 - field302;
                            if (var18 < field423) {
                                var18 = field423;
                            }
                            if (var10.field2544 + var18 > field423 + field313.field2544) {
                                var18 = field423 + field313.field2544 - var10.field2544;
                            }
                            if (var19 < field424) {
                                var19 = field424;
                            }
                            if (var10.field2545 + var19 > field424 + field313.field2545) {
                                var19 = field424 + field313.field2545 - var10.field2545;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2648) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2634 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2634 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2544 + var13;
                        int var27 = var10.field2545 + var14;
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
                        int var30 = var10.field2544 + var13;
                        int var31 = var10.field2545 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2534 || var20 < var22 && var21 < var23) {
                        if (var10.field2539 != 0) {
                            if (var10.field2539 == 1337) {
                                field393 = var13;
                                field394 = var14;
                                method2910(var13, var14, var10.field2544, var10.field2545);
                                class73.method1521(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2539 == 1338) {
                                Statics.method1852(var13, var14, var11);
                                class73.method1521(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2634 == 0) {
                            if (!var10.field2534 && method102(var10) && Statics.field194 != var10) {
                                continue;
                            }
                            if (!var10.field2534) {
                                if (var10.field2549 > var10.field2551 - var10.field2545) {
                                    var10.field2549 = var10.field2551 - var10.field2545;
                                }
                                if (var10.field2549 < 0) {
                                    var10.field2549 = 0;
                                }
                            }
                            method633(arg0, var10.field2535, var20, var21, var22, var23, var13 - var10.field2548, var14 - var10.field2549, var11);
                            if (var10.field2623 != null) {
                                method633(var10.field2623, var10.field2535, var20, var21, var22, var23, var13 - var10.field2548, var14 - var10.field2549, var11);
                            }
                            class4 var32 = (class4) field406.method3171((long) var10.field2535);
                            if (var32 != null) {
                                method2642(var32.field52, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class73.method1521(arg2, arg3, arg4, arg5);
                            class84.method1765();
                        }
                        if (field451[var11] || field456 > 1) {
                            if (var10.field2634 == 0 && !var10.field2534 && var10.field2551 > var10.field2545) {
                                method1757(var10.field2544 + var13, var14, var10.field2549, var10.field2545, var10.field2551);
                            }
                            if (var10.field2634 != 1) {
                                if (var10.field2634 == 2) {
                                    int var33 = 0;
                                    for (int var34 = 0; var34 < var10.field2545; var34++) {
                                        for (int var35 = 0; var35 < var10.field2544; var35++) {
                                            int var36 = (var10.field2588 + 32) * var35 + var13;
                                            int var37 = (var10.field2589 + 32) * var34 + var14;
                                            if (var33 < 20) {
                                                var36 += var10.field2636[var33];
                                                var37 += var10.field2591[var33];
                                            }
                                            if (var10.field2566[var33] > 0) {
                                                boolean var38 = false;
                                                boolean var39 = false;
                                                int var40 = var10.field2566[var33] - 1;
                                                if (var36 + 32 > arg2 && var36 < arg4 && var37 + 32 > arg3 && var37 < arg5 || Statics.field237 == var10 && field355 == var33) {
                                                    class72 var41;
                                                    if (field398 == 1 && Statics.field153 == var33 && Statics.field159 == var10.field2535) {
                                                        var41 = class45.method542(var40, var10.field2643[var33], 2, 0, false);
                                                    } else {
                                                        var41 = class45.method542(var40, var10.field2643[var33], 1, 3153952, false);
                                                    }
                                                    if (var41 == null) {
                                                        method1839(var10);
                                                    } else if (Statics.field237 == var10 && field355 == var33) {
                                                        int var42 = class127.field1992 - field493;
                                                        int var43 = class127.field1988 - field476;
                                                        if (var42 < 5 && var42 > -5) {
                                                            var42 = 0;
                                                        }
                                                        if (var43 < 5 && var43 > -5) {
                                                            var43 = 0;
                                                        }
                                                        if (field360 < 5) {
                                                            var42 = 0;
                                                            var43 = 0;
                                                        }
                                                        var41.method1474(var36 + var42, var37 + var43, 128);
                                                        if (arg1 != -1) {
                                                            class153 var44 = arg0[arg1 & 0xFFFF];
                                                            if (var37 + var43 < class73.field1317 && var44.field2549 > 0) {
                                                                int var45 = field280 * (class73.field1317 - var37 - var43) / 3;
                                                                if (var45 > field280 * 10) {
                                                                    var45 = field280 * 10;
                                                                }
                                                                if (var45 > var44.field2549) {
                                                                    var45 = var44.field2549;
                                                                }
                                                                var44.field2549 -= var45;
                                                                field476 += var45;
                                                                method1839(var44);
                                                            }
                                                            if (var37 + var43 + 32 > class73.field1318 && var44.field2549 < var44.field2551 - var44.field2545) {
                                                                int var46 = field280 * (var37 + var43 + 32 - class73.field1318) / 3;
                                                                if (var46 > field280 * 10) {
                                                                    var46 = field280 * 10;
                                                                }
                                                                if (var46 > var44.field2551 - var44.field2545 - var44.field2549) {
                                                                    var46 = var44.field2551 - var44.field2545 - var44.field2549;
                                                                }
                                                                var44.field2549 += var46;
                                                                field476 -= var46;
                                                                method1839(var44);
                                                            }
                                                        }
                                                    } else if (Statics.field1855 == var10 && field354 == var33) {
                                                        var41.method1474(var36, var37, 128);
                                                    } else {
                                                        var41.method1440(var36, var37);
                                                    }
                                                }
                                            } else if (var10.field2592 != null && var33 < 20) {
                                                class72 var47 = var10.method2816(var33);
                                                if (var47 != null) {
                                                    var47.method1440(var36, var37);
                                                } else if (class153.field2533) {
                                                    method1839(var10);
                                                }
                                            }
                                            var33++;
                                        }
                                    }
                                } else if (var10.field2634 == 3) {
                                    int var48;
                                    if (method80(var10)) {
                                        var48 = var10.field2553;
                                        if (Statics.field194 == var10 && var10.field2555 != 0) {
                                            var48 = var10.field2555;
                                        }
                                    } else {
                                        var48 = var10.field2552;
                                        if (Statics.field194 == var10 && var10.field2612 != 0) {
                                            var48 = var10.field2612;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2583) {
                                            class73.method1527(var13, var14, var10.field2544, var10.field2545, var48);
                                        } else {
                                            class73.method1522(var13, var14, var10.field2544, var10.field2545, var48);
                                        }
                                    } else if (var10.field2583) {
                                        class73.method1523(var13, var14, var10.field2544, var10.field2545, var48, 256 - (var15 & 0xFF));
                                    } else {
                                        class73.method1530(var13, var14, var10.field2544, var10.field2545, var48, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2634 == 4) {
                                    class194 var49 = var10.method2815();
                                    if (var49 != null) {
                                        String var50 = var10.field2582;
                                        int var51;
                                        if (method80(var10)) {
                                            var51 = var10.field2553;
                                            if (Statics.field194 == var10 && var10.field2555 != 0) {
                                                var51 = var10.field2555;
                                            }
                                            if (var10.field2597.length() > 0) {
                                                var50 = var10.field2597;
                                            }
                                        } else {
                                            var51 = var10.field2552;
                                            if (Statics.field194 == var10 && var10.field2612 != 0) {
                                                var51 = var10.field2612;
                                            }
                                        }
                                        if (var10.field2534 && var10.field2639 != -1) {
                                            class45 var52 = class45.method612(var10.field2639);
                                            var50 = var52.field1014;
                                            if (var50 == null) {
                                                var50 = "null";
                                            }
                                            if ((var52.field1043 == 1 || var10.field2640 != 1) && var10.field2640 != -1) {
                                                var50 = class2.method2037(16748608) + var50 + class2.field23 + " " + 'x' + method647(var10.field2640);
                                            }
                                        }
                                        if (field409 == var10) {
                                            class143 var10000 = (class143) null;
                                            var50 = class143.field2228;
                                            var51 = var10.field2552;
                                        }
                                        if (!var10.field2534) {
                                            var50 = method115(var50, var10);
                                        }
                                        var49.method3337(var50, var13, var14, var10.field2544, var10.field2545, var51, var10.field2587 ? 0 : -1, var10.field2585, var10.field2531, var10.field2584);
                                    } else if (class153.field2533) {
                                        method1839(var10);
                                    }
                                } else if (var10.field2634 == 5) {
                                    if (var10.field2534) {
                                        class72 var54;
                                        if (var10.field2639 == -1) {
                                            var54 = var10.method2830(false);
                                        } else {
                                            var54 = class45.method542(var10.field2639, var10.field2640, var10.field2563, var10.field2564, false);
                                        }
                                        if (var54 != null) {
                                            int var55 = var54.field1307;
                                            int var56 = var54.field1308;
                                            if (var10.field2628) {
                                                class73.method1542(var13, var14, var10.field2544 + var13, var10.field2545 + var14);
                                                int var57 = (var10.field2544 + (var55 - 1)) / var55;
                                                int var58 = (var10.field2545 + (var56 - 1)) / var56;
                                                for (int var59 = 0; var59 < var57; var59++) {
                                                    for (int var60 = 0; var60 < var58; var60++) {
                                                        if (var10.field2619 != 0) {
                                                            var54.method1452(var55 / 2 + var55 * var59 + var13, var56 / 2 + var56 * var60 + var14, var10.field2619, 4096);
                                                        } else if (var15 == 0) {
                                                            var54.method1440(var55 * var59 + var13, var56 * var60 + var14);
                                                        } else {
                                                            var54.method1474(var55 * var59 + var13, var56 * var60 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1521(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var61 = var10.field2544 * 4096 / var55;
                                                if (var10.field2619 != 0) {
                                                    var54.method1452(var10.field2544 / 2 + var13, var10.field2545 / 2 + var14, var10.field2619, var61);
                                                } else if (var15 != 0) {
                                                    var54.method1428(var13, var14, var10.field2544, var10.field2545, 256 - (var15 & 0xFF));
                                                } else if (var10.field2544 == var55 && var10.field2545 == var56) {
                                                    var54.method1440(var13, var14);
                                                } else {
                                                    var54.method1475(var13, var14, var10.field2544, var10.field2545);
                                                }
                                            }
                                        } else if (class153.field2533) {
                                            method1839(var10);
                                        }
                                    } else {
                                        class72 var53 = var10.method2830(method80(var10));
                                        if (var53 != null) {
                                            var53.method1440(var13, var14);
                                        } else if (class153.field2533) {
                                            method1839(var10);
                                        }
                                    }
                                } else if (var10.field2634 == 6) {
                                    boolean var62 = method80(var10);
                                    int var63;
                                    if (var62) {
                                        var63 = var10.field2572;
                                    } else {
                                        var63 = var10.field2571;
                                    }
                                    class98 var64 = null;
                                    int var65 = 0;
                                    if (var10.field2639 != -1) {
                                        class45 var66 = class45.method612(var10.field2639);
                                        if (var66 != null) {
                                            class45 var67 = var66.method839(var10.field2640);
                                            var64 = var67.method881(1);
                                            if (var64 == null) {
                                                method1839(var10);
                                            } else {
                                                var64.method1958();
                                                var65 = var64.field1354 / 2;
                                            }
                                        }
                                    } else if (var10.field2605 == 5) {
                                        if (var10.field2568 == 0) {
                                            var64 = field323.method2886((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var64 = Statics.field628.method17();
                                        }
                                    } else if (var63 == -1) {
                                        var64 = var10.method2834((class38) null, -1, var62, Statics.field628.field30);
                                        if (var64 == null && class153.field2533) {
                                            method1839(var10);
                                        }
                                    } else {
                                        class38 var68 = class38.method114(var63);
                                        var64 = var10.method2834(var68, var10.field2647, var62, Statics.field628.field30);
                                        if (var64 == null && class153.field2533) {
                                            method1839(var10);
                                        }
                                    }
                                    class84.method1768(var10.field2544 / 2 + var13, var10.field2545 / 2 + var14);
                                    int var69 = var10.field2573 * class84.field1461[var10.field2575] >> 16;
                                    int var70 = var10.field2573 * class84.field1484[var10.field2575] >> 16;
                                    if (var64 != null) {
                                        if (var10.field2534) {
                                            var64.method1958();
                                            if (var10.field2580) {
                                                var64.method1971(0, var10.field2576, var10.field2577, var10.field2575, var10.field2635, var10.field2574 + var65 + var69, var10.field2574 + var70, var10.field2573);
                                            } else {
                                                var64.method1970(0, var10.field2576, var10.field2577, var10.field2575, var10.field2635, var10.field2574 + var65 + var69, var10.field2574 + var70);
                                            }
                                        } else {
                                            var64.method1970(0, var10.field2576, 0, var10.field2575, 0, var69, var70);
                                        }
                                    }
                                    class84.method1767();
                                } else {
                                    if (var10.field2634 == 7) {
                                        class194 var71 = var10.method2815();
                                        if (var71 == null) {
                                            if (class153.field2533) {
                                                method1839(var10);
                                            }
                                            continue;
                                        }
                                        int var72 = 0;
                                        for (int var73 = 0; var73 < var10.field2545; var73++) {
                                            for (int var74 = 0; var74 < var10.field2544; var74++) {
                                                if (var10.field2566[var72] > 0) {
                                                    class45 var75 = class45.method612(var10.field2566[var72] - 1);
                                                    String var76;
                                                    if (var75.field1043 != 1 && var10.field2643[var72] == 1) {
                                                        var76 = class2.method2037(16748608) + var75.field1014 + class2.field23;
                                                    } else {
                                                        var76 = class2.method2037(16748608) + var75.field1014 + class2.field23 + " " + 'x' + method647(var10.field2643[var72]);
                                                    }
                                                    int var77 = (var10.field2588 + 115) * var74 + var13;
                                                    int var78 = (var10.field2589 + 12) * var73 + var14;
                                                    if (var10.field2585 == 0) {
                                                        var71.method3319(var76, var77, var78, var10.field2552, var10.field2587 ? 0 : -1);
                                                    } else if (var10.field2585 == 1) {
                                                        var71.method3321(var76, var10.field2544 / 2 + var77, var78, var10.field2552, var10.field2587 ? 0 : -1);
                                                    } else {
                                                        var71.method3320(var76, var10.field2544 + var77 - 1, var78, var10.field2552, var10.field2587 ? 0 : -1);
                                                    }
                                                }
                                                var72++;
                                            }
                                        }
                                    }
                                    if (var10.field2634 == 8 && Statics.field395 == var10 && field397 == field342) {
                                        int var79 = 0;
                                        int var80 = 0;
                                        class194 var81 = Statics.field998;
                                        String var82 = var10.field2582;
                                        String var83 = method115(var82, var10);
                                        while (var83.length() > 0) {
                                            int var84 = var83.indexOf(class2.field16);
                                            String var85;
                                            if (var84 == -1) {
                                                var85 = var83;
                                                var83 = "";
                                            } else {
                                                var85 = var83.substring(0, var84);
                                                var83 = var83.substring(var84 + 4);
                                            }
                                            int var86 = var81.method3314(var85);
                                            if (var86 > var79) {
                                                var79 = var86;
                                            }
                                            var80 += var81.field2914 + 1;
                                        }
                                        var79 += 6;
                                        var80 += 7;
                                        int var87 = var10.field2544 + var13 - 5 - var79;
                                        int var88 = var10.field2545 + var14 + 5;
                                        if (var87 < var13 + 5) {
                                            var87 = var13 + 5;
                                        }
                                        if (var79 + var87 > arg4) {
                                            var87 = arg4 - var79;
                                        }
                                        if (var80 + var88 > arg5) {
                                            var88 = arg5 - var80;
                                        }
                                        class73.method1527(var87, var88, var79, var80, 16777120);
                                        class73.method1522(var87, var88, var79, var80, 0);
                                        String var89 = var10.field2582;
                                        int var90 = var81.field2914 + var88 + 2;
                                        String var91 = method115(var89, var10);
                                        while (var91.length() > 0) {
                                            int var92 = var91.indexOf(class2.field16);
                                            String var93;
                                            if (var92 == -1) {
                                                var93 = var91;
                                                var91 = "";
                                            } else {
                                                var93 = var91.substring(0, var92);
                                                var91 = var91.substring(var92 + 4);
                                            }
                                            var81.method3319(var93, var87 + 3, var90, 0, -1);
                                            var90 += var81.field2914 + 1;
                                        }
                                    }
                                    if (var10.field2634 == 9) {
                                        if (var10.field2558 == 1) {
                                            class73.method1529(var13, var14, var10.field2544 + var13, var10.field2545 + var14, var10.field2552);
                                        } else {
                                            int var94 = var10.field2544 >= 0 ? var10.field2544 : -var10.field2544;
                                            int var95 = var10.field2545 >= 0 ? var10.field2545 : -var10.field2545;
                                            int var96 = var94;
                                            if (var94 < var95) {
                                                var96 = var95;
                                            }
                                            if (var96 != 0) {
                                                int var97 = (var10.field2544 << 16) / var96;
                                                int var98 = (var10.field2545 << 16) / var96;
                                                if (var98 <= var97) {
                                                    var97 = -var97;
                                                } else {
                                                    var98 = -var98;
                                                }
                                                int var99 = var10.field2558 * var98 >> 17;
                                                int var100 = var10.field2558 * var98 + 1 >> 17;
                                                int var101 = var10.field2558 * var97 >> 17;
                                                int var102 = var10.field2558 * var97 + 1 >> 17;
                                                int var103 = var13 + var99;
                                                int var104 = var13 - var100;
                                                int var105 = var10.field2544 + var13 - var100;
                                                int var106 = var10.field2544 + var13 + var99;
                                                int var107 = var14 + var101;
                                                int var108 = var14 - var102;
                                                int var109 = var10.field2545 + var14 - var102;
                                                int var110 = var10.field2545 + var14 + var101;
                                                class84.method1773(var103, var104, var105);
                                                class84.method1812(var107, var108, var109, var103, var104, var105, var10.field2552);
                                                class84.method1773(var103, var105, var106);
                                                class84.method1812(var107, var109, var110, var103, var105, var106, var10.field2552);
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

    @ObfuscatedName("w.ch(Ljava/lang/String;Lei;I)Ljava/lang/String;")
    public static String method115(String arg0, class153 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2412(arg1, var2 - 1);
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
                if (Statics.field2887 != null) {
                    int var9 = Statics.field2887.field2055;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field2887.field2057 != null) {
                        var8 = (String) Statics.field2887.field2057;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ap.cr(II)Ljava/lang/String;")
    public static final String method647(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field25 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2037(65408) + var1.substring(0, var1.length() - 8) + class143.field2301 + " " + class2.field19 + var1 + class2.field20 + class2.field23;
        } else if (var1.length() > 6) {
            return " " + class2.method2037(16777215) + var1.substring(0, var1.length() - 4) + class143.field2303 + " " + class2.field19 + var1 + class2.field20 + class2.field23;
        } else {
            return " " + class2.method2037(16776960) + var1 + class2.field23;
        }
    }

    @ObfuscatedName("cd.cm(IIIIII)V")
    public static final void method1757(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2513[0].method1583(arg0, arg1);
        Statics.field2513[1].method1583(arg0, arg1 + arg3 - 16);
        class73.method1527(arg0, arg1 + 16, 16, arg3 - 32, field320);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class73.method1527(arg0, arg1 + 16 + var6, 16, var5, field321);
        class73.method1558(arg0, arg1 + 16 + var6, var5, field392);
        class73.method1558(arg0 + 1, arg1 + 16 + var6, var5, field392);
        class73.method1531(arg0, arg1 + 16 + var6, 16, field392);
        class73.method1531(arg0, arg1 + 17 + var6, 16, field392);
        class73.method1558(arg0 + 15, arg1 + 16 + var6, var5, field500);
        class73.method1558(arg0 + 14, arg1 + 17 + var6, var5 - 1, field500);
        class73.method1531(arg0, arg1 + 15 + var6 + var5, 16, field500);
        class73.method1531(arg0 + 1, arg1 + 14 + var6 + var5, 15, field500);
    }

    @ObfuscatedName("j.cx(Lei;I)Z")
    public static final boolean method80(class153 arg0) {
        if (arg0.field2632 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2632.length; var1++) {
            int var2 = method2412(arg0, var1);
            int var3 = arg0.field2559[var1];
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

    @ObfuscatedName("dq.cc(Lei;II)I")
    public static final int method2412(class153 arg0, int arg1) {
        if (arg0.field2631 == null || arg1 >= arg0.field2631.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2631[arg1];
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
                    var7 = field381[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field382[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field383[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class153 var11 = class153.method2362(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method612(var12).field1027 || field245)) {
                        for (int var13 = 0; var13 < var11.field2566.length; var13++) {
                            if (var12 + 1 == var11.field2566[var13]) {
                                var7 += var11.field2643[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class155.field2664[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class141.field2128[field382[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class155.field2664[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field628.field34;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class141.field2126[var14]) {
                            var7 += field382[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class153 var17 = class153.method2362(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method612(var18).field1027 || field245)) {
                        for (int var19 = 0; var19 < var17.field2566.length; var19++) {
                            if (var18 + 1 == var17.field2566[var19]) {
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
                    var7 = field474;
                }
                if (var6 == 13) {
                    int var20 = class155.field2664[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class155.method1855(var22);
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
                    var7 = (Statics.field628.field771 >> 7) + Statics.field2103;
                }
                if (var6 == 19) {
                    var7 = (Statics.field628.field721 >> 7) + Statics.field88;
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

    @ObfuscatedName("ca.cn(Lei;III)V")
    public static final void method1863(class153 arg0, int arg1, int arg2) {
        if (arg0.field2538 == 1) {
            method1834(arg0.field2596, "", 24, 0, 0, arg0.field2535);
        }
        if (arg0.field2538 == 2 && !field400) {
            String var3;
            if (class157.method648(method3000(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2652 == null || arg0.field2652.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2652;
            }
            if (var3 != null) {
                method1834(var3, class2.method2037(65280) + arg0.field2625, 25, 0, -1, arg0.field2535);
            }
        }
        if (arg0.field2538 == 3) {
            method1834(class143.field2299, "", 26, 0, 0, arg0.field2535);
        }
        if (arg0.field2538 == 4) {
            method1834(arg0.field2596, "", 28, 0, 0, arg0.field2535);
        }
        if (arg0.field2538 == 5) {
            method1834(arg0.field2596, "", 29, 0, 0, arg0.field2535);
        }
        if (arg0.field2538 == 6 && field409 == null) {
            method1834(arg0.field2596, "", 30, 0, -1, arg0.field2535);
        }
        if (arg0.field2634 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2545; var6++) {
                for (int var7 = 0; var7 < arg0.field2544; var7++) {
                    int var8 = (arg0.field2588 + 32) * var7;
                    int var9 = (arg0.field2589 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2636[var5];
                        var9 += arg0.field2591[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field358 = var5;
                        Statics.field112 = arg0;
                        if (arg0.field2566[var5] > 0) {
                            class45 var10 = class45.method612(arg0.field2566[var5] - 1);
                            if (field398 == 1 && class157.method809(method3000(arg0))) {
                                if (Statics.field159 != arg0.field2535 || Statics.field153 != var5) {
                                    method1834(class143.field2340, field399 + " " + class2.field21 + " " + class2.method2037(16748608) + var10.field1014, 31, var10.field1012, var5, arg0.field2535);
                                }
                            } else if (!field400 || !class157.method809(method3000(arg0))) {
                                String[] var11 = var10.field1029;
                                if (field471) {
                                    var11 = method2874(var11);
                                }
                                if (class157.method809(method3000(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 36;
                                            } else {
                                                var13 = 37;
                                            }
                                            method1834(var11[var12], class2.method2037(16748608) + var10.field1014, var13, var10.field1012, var5, arg0.field2535);
                                        } else if (var12 == 4) {
                                            method1834(class143.field2142, class2.method2037(16748608) + var10.field1014, 37, var10.field1012, var5, arg0.field2535);
                                        }
                                    }
                                }
                                int var14 = method3000(arg0);
                                boolean var15 = (var14 >> 31 & 0x1) != 0;
                                if (var15) {
                                    method1834(class143.field2340, class2.method2037(16748608) + var10.field1014, 38, var10.field1012, var5, arg0.field2535);
                                }
                                class157 var10000 = (class157) null;
                                if (class157.method809(method3000(arg0)) && var11 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var11[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 33;
                                            }
                                            if (var16 == 1) {
                                                var17 = 34;
                                            }
                                            if (var16 == 2) {
                                                var17 = 35;
                                            }
                                            method1834(var11[var16], class2.method2037(16748608) + var10.field1014, var17, var10.field1012, var5, arg0.field2535);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field2593;
                                if (field471) {
                                    var18 = method2874(var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 39;
                                            }
                                            if (var19 == 1) {
                                                var20 = 40;
                                            }
                                            if (var19 == 2) {
                                                var20 = 41;
                                            }
                                            if (var19 == 3) {
                                                var20 = 42;
                                            }
                                            if (var19 == 4) {
                                                var20 = 43;
                                            }
                                            method1834(var18[var19], class2.method2037(16748608) + var10.field1014, var20, var10.field1012, var5, arg0.field2535);
                                        }
                                    }
                                }
                                method1834(class143.field2291, class2.method2037(16748608) + var10.field1014, 1005, var10.field1012, var5, arg0.field2535);
                            } else if ((Statics.field614 & 0x10) == 16) {
                                method1834(field367, field404 + " " + class2.field21 + " " + class2.method2037(16748608) + var10.field1014, 32, var10.field1012, var5, arg0.field2535);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2534) {
            return;
        }
        if (field400) {
            int var21 = method3000(arg0);
            boolean var22 = (var21 >> 21 & 0x1) != 0;
            if (var22 && (Statics.field614 & 0x20) == 32) {
                method1834(field367, field404 + " " + class2.field21 + " " + arg0.field2595, 58, 0, arg0.field2638, arg0.field2535);
            }
            return;
        }
        for (int var23 = 9; var23 >= 5; var23--) {
            String var24;
            if (!class157.method149(method3000(arg0), var23) && arg0.field2622 == null) {
                var24 = null;
            } else if (arg0.field2610 == null || arg0.field2610.length <= var23 || arg0.field2610[var23] == null || arg0.field2610[var23].trim().length() == 0) {
                var24 = null;
            } else {
                var24 = arg0.field2610[var23];
            }
            if (var24 != null) {
                method1834(var24, arg0.field2595, 1007, var23 + 1, arg0.field2638, arg0.field2535);
            }
        }
        String var26;
        if (class157.method648(method3000(arg0)) == 0) {
            var26 = null;
        } else if (arg0.field2652 == null || arg0.field2652.trim().length() == 0) {
            var26 = null;
        } else {
            var26 = arg0.field2652;
        }
        if (var26 != null) {
            method1834(var26, arg0.field2595, 25, 0, arg0.field2638, arg0.field2535);
        }
        for (int var28 = 4; var28 >= 0; var28--) {
            String var29;
            if (!class157.method149(method3000(arg0), var28) && arg0.field2622 == null) {
                var29 = null;
            } else if (arg0.field2610 == null || arg0.field2610.length <= var28 || arg0.field2610[var28] == null || arg0.field2610[var28].trim().length() == 0) {
                var29 = null;
            } else {
                var29 = arg0.field2610[var28];
            }
            if (var29 != null) {
                method1834(var29, arg0.field2595, 57, var28 + 1, arg0.field2638, arg0.field2535);
            }
        }
        if (class157.method83(method3000(arg0))) {
            method1834(class143.field2146, "", 30, 0, arg0.field2638, arg0.field2535);
        }
    }

    @ObfuscatedName("dh.ca(III)V")
    public static final void method2388(int arg0, int arg1) {
        if (class153.method2045(arg0)) {
            method533(Statics.field2590[arg0], arg1);
        }
    }

    @ObfuscatedName("i.cv([Lei;IB)V")
    public static final void method533(class153[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class153 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2634 == 0) {
                    if (var3.field2623 != null) {
                        method533(var3.field2623, arg1);
                    }
                    class4 var4 = (class4) field406.method3171((long) var3.field2535);
                    if (var4 != null) {
                        method2388(var4.field52, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2629 != null) {
                    class1 var5 = new class1();
                    var5.field12 = var3;
                    var5.field14 = var3.field2629;
                    class32.method572(var5);
                }
                if (arg1 == 1 && var3.field2637 != null) {
                    if (var3.field2638 >= 0) {
                        class153 var6 = class153.method2362(var3.field2535);
                        if (var6 == null || var6.field2623 == null || var3.field2638 >= var6.field2623.length || var6.field2623[var3.field2638] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field12 = var3;
                    var7.field14 = var3.field2637;
                    class32.method572(var7);
                }
            }
        }
    }

    @ObfuscatedName("av.cw(Lei;IIB)V")
    public static final void method596(class153 arg0, int arg1, int arg2) {
        if (field417 != null || field466 || arg0 == null || method2494(arg0) == null) {
            return;
        }
        field417 = arg0;
        field313 = method2494(arg0);
        field328 = arg1;
        field302 = arg2;
        Statics.field950 = 0;
        field440 = false;
        if (field494 <= 0) {
            return;
        }
        int var3 = field494 - 1;
        Statics.field699 = new class27();
        Statics.field699.field640 = field282[var3];
        Statics.field699.field634 = field388[var3];
        Statics.field699.field636 = field299[var3];
        Statics.field699.field642 = field390[var3];
        Statics.field699.field637 = field391[var3];
    }

    @ObfuscatedName("cm.ci(Lei;I)V")
    public static void method1839(class153 arg0) {
        if (field448 == arg0.field2651) {
            field449[arg0.field2650] = true;
        }
    }

    @ObfuscatedName("e.cu(I)V")
    public static void method176() {
        for (class4 var0 = (class4) field406.method3163(); var0 != null; var0 = (class4) field406.method3172()) {
            int var1 = var0.field52;
            if (class153.method2045(var1)) {
                boolean var2 = true;
                class153[] var3 = Statics.field2590[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2534;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2873;
                    class153 var6 = class153.method2362(var5);
                    if (var6 != null) {
                        method1839(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ds.cs(Lei;B)Lei;")
    public static class153 method2494(class153 arg0) {
        class153 var1 = method142(arg0);
        if (var1 == null) {
            var1 = arg0.field2532;
        }
        return var1;
    }

    @ObfuscatedName("fc.cl([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2874(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("aa.ck(II)V")
    public static final void method573(int arg0) {
        if (!class153.method2045(arg0)) {
            return;
        }
        class153[] var1 = Statics.field2590[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3 != null) {
                var3.field2647 = 0;
                var3.field2642 = 0;
            }
        }
    }

    @ObfuscatedName("cm.co(IB)V")
    public static final void method1840(int arg0) {
        if (class153.method2045(arg0)) {
            method1837(Statics.field2590[arg0], -1);
        }
    }

    @ObfuscatedName("cm.cf([Lei;II)V")
    public static final void method1837(class153[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class153 var3 = arg0[var2];
            if (var3 != null && var3.field2578 == arg1 && (!var3.field2534 || !method102(var3))) {
                if (var3.field2634 == 0) {
                    if (!var3.field2534 && method102(var3) && Statics.field194 != var3) {
                        continue;
                    }
                    method1837(arg0, var3.field2535);
                    if (var3.field2623 != null) {
                        method1837(var3.field2623, var3.field2535);
                    }
                    class4 var4 = (class4) field406.method3171((long) var3.field2535);
                    if (var4 != null) {
                        method1840(var4.field52);
                    }
                }
                if (var3.field2634 == 6) {
                    if (var3.field2571 != -1 || var3.field2572 != -1) {
                        boolean var5 = method80(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2572;
                        } else {
                            var6 = var3.field2571;
                        }
                        if (var6 != -1) {
                            class38 var7 = class38.method114(var6);
                            var3.field2642 += field280;
                            while (var3.field2642 > var7.field895[var3.field2647]) {
                                var3.field2642 -= var7.field895[var3.field2647];
                                var3.field2647++;
                                if (var3.field2647 >= var7.field900.length) {
                                    var3.field2647 -= var7.field902;
                                    if (var3.field2647 < 0 || var3.field2647 >= var7.field900.length) {
                                        var3.field2647 = 0;
                                    }
                                }
                                method1839(var3);
                            }
                        }
                    }
                    if (var3.field2579 != 0 && !var3.field2534) {
                        int var8 = var3.field2579 >> 16;
                        int var9 = var3.field2579 << 16 >> 16;
                        int var10 = field280 * var8;
                        int var11 = field280 * var9;
                        var3.field2575 = var3.field2575 + var10 & 0x7FF;
                        var3.field2576 = var3.field2576 + var11 & 0x7FF;
                        method1839(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.cy(II)V")
    public static final void method29(int arg0) {
        method176();
        for (class20 var1 = (class20) class20.field542.method3196(); var1 != null; var1 = (class20) class20.field542.method3206()) {
            if (var1.field546 != null) {
                var1.method498();
            }
        }
        int var2 = class46.method2399(arg0).field1056;
        if (var2 == 0) {
            return;
        }
        int var3 = class155.field2664[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class84.method1779(0.9D);
                ((class88) Statics.field1480).method1842(0.9D);
            }
            if (var3 == 2) {
                class84.method1779(0.8D);
                ((class88) Statics.field1480).method1842(0.8D);
            }
            if (var3 == 3) {
                class84.method1779(0.7D);
                ((class88) Statics.field1480).method1842(0.7D);
            }
            if (var3 == 4) {
                class84.method1779(0.6D);
                ((class88) Statics.field1480).method1842(0.6D);
            }
            class45.method531();
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
            if (field477 != var4) {
                if (field477 == 0 && field457 != -1) {
                    class162.method1421(Statics.field1569, field457, 0, var4, false);
                    field240 = false;
                } else if (var4 == 0) {
                    class162.method1755();
                    field240 = false;
                } else {
                    class162.method810(var4);
                }
                field477 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field480 = 127;
            }
            if (var3 == 1) {
                field480 = 96;
            }
            if (var3 == 2) {
                field480 = 64;
            }
            if (var3 == 3) {
                field480 = 32;
            }
            if (var3 == 4) {
                field480 = 0;
            }
        }
        if (var2 == 5) {
            field384 = var3;
        }
        if (var2 == 6) {
            field407 = var3;
        }
        if (var2 == 9) {
            field408 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field435 = 127;
            }
            if (var3 == 1) {
                field435 = 96;
            }
            if (var3 == 2) {
                field435 = 64;
            }
            if (var3 == 3) {
                field435 = 32;
            }
            if (var3 == 4) {
                field435 = 0;
            }
        }
        if (var2 == 17) {
            field413 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class18[] var5 = new class18[] { class18.field506, class18.field508, class18.field504 };
            field268 = (class18) class99.method511(var5, var3);
            if (field268 == null) {
                field268 = class18.field508;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field376 = -1;
        } else {
            field376 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("s.cg(B)V")
    public static final void method10() {
        field361.method2334(149);
        for (class4 var0 = (class4) field406.method3163(); var0 != null; var0 = (class4) field406.method3172()) {
            if (var0.field53 == 0 || var0.field53 == 3) {
                method161(var0, true);
            }
        }
        if (field409 != null) {
            method1839(field409);
            field409 = null;
        }
    }

    @ObfuscatedName("ec.ct(IIIB)Lm;")
    public static final class4 method2631(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field52 = arg1;
        var3.field53 = arg2;
        field406.method3161(var3, (long) arg0);
        method573(arg1);
        class32.method1762(arg1);
        class153 var4 = class153.method2362(arg0);
        if (var4 != null) {
            method1839(var4);
        }
        if (field409 != null) {
            method1839(field409);
            field409 = null;
        }
        method582();
        if (field405 != -1) {
            method2388(field405, 1);
        }
        return var3;
    }

    @ObfuscatedName("f.df(Lm;ZI)V")
    public static final void method161(class4 arg0, boolean arg1) {
        int var2 = arg0.field52;
        int var3 = (int) arg0.field2873;
        arg0.method3280();
        if (arg1) {
            class153.method831(var2);
        }
        for (class180 var4 = (class180) field266.method3163(); var4 != null; var4 = (class180) field266.method3172()) {
            if ((long) var2 == (var4.field2873 >> 48 & 0xFFFFL)) {
                var4.method3280();
            }
        }
        class153 var5 = class153.method2362(var3);
        if (var5 != null) {
            method1839(var5);
        }
        method582();
        if (field405 != -1) {
            method2388(field405, 1);
        }
    }

    @ObfuscatedName("fe.dz(Lei;I)Z")
    public static final boolean method3102(class153 arg0) {
        int var1 = arg0.field2539;
        if (var1 == 205) {
            field290 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field323.method2909(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field323.method2882(var4, var5 == 1);
        }
        if (var1 == 324) {
            field323.method2883(false);
        }
        if (var1 == 325) {
            field323.method2883(true);
        }
        if (var1 == 326) {
            field361.method2334(33);
            field323.method2884(field361);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bt.dg(IIIILbv;B)V")
    public static final void method1424(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            Statics.method11(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field478 + field322 & 0x7FF;
        int var7 = class84.field1461[var6];
        int var8 = class84.field1484[var6];
        int var9 = var7 * 256 / (field243 + 256);
        int var10 = var8 * 256 / (field243 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field40.method1503(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("cy.dn(Ljava/lang/String;ZI)Z")
    public static boolean method2038(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class201.method2051(arg0, Statics.field2395);
        for (int var3 = 0; var3 < field318; var3++) {
            if (var2.equalsIgnoreCase(class201.method2051(field496[var3].field225, Statics.field2395)) && (!arg1 || field496[var3].field215 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class201.method2051(Statics.field628.field42, Statics.field2395))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("da.db(Ljava/lang/String;I)Z")
    public static boolean method2433(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class201.method2051(arg0, Statics.field2395);
        for (int var2 = 0; var2 < field498; var2++) {
            class8 var3 = field293[var2];
            if (var1.equalsIgnoreCase(class201.method2051(var3.field117, Statics.field2395))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class201.method2051(var3.field114, Statics.field2395))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ag.dj(Ljava/lang/String;B)V")
    public static final void method805(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field318 < 200 || field369 == 1) || field318 >= 400) {
            class10.method100(30, "", class143.field2195);
            return;
        }
        String var1 = class201.method2051(arg0, Statics.field2395);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field318; var2++) {
            class16 var3 = field496[var2];
            String var4 = class201.method2051(var3.field225, Statics.field2395);
            if (var4 != null && var4.equals(var1)) {
                class10.method100(30, "", arg0 + class143.field2307);
                return;
            }
            if (var3.field224 != null) {
                String var5 = class201.method2051(var3.field224, Statics.field2395);
                if (var5 != null && var5.equals(var1)) {
                    class10.method100(30, "", arg0 + class143.field2307);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field498; var6++) {
            class8 var7 = field293[var6];
            String var8 = class201.method2051(var7.field117, Statics.field2395);
            if (var8 != null && var8.equals(var1)) {
                class10.method100(30, "", class143.field2312 + arg0 + class143.field2313);
                return;
            }
            if (var7.field114 != null) {
                String var9 = class201.method2051(var7.field114, Statics.field2395);
                if (var9 != null && var9.equals(var1)) {
                    class10.method100(30, "", class143.field2312 + arg0 + class143.field2313);
                    return;
                }
            }
        }
        if (class201.method2051(Statics.field628.field42, Statics.field2395).equals(var1)) {
            class10.method100(30, "", class143.field2310);
            return;
        }
        field361.method2334(214);
        class110 var10 = field361;
        int var11 = arg0.length() + 1;
        var10.method2087(var11);
        field361.method2092(arg0);
    }

    @ObfuscatedName("b.dr(Ljava/lang/String;ZB)V")
    public static final void method95(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field498 < 100 || field369 == 1) || field498 >= 400) {
            class10.method100(31, "", class143.field2237);
            return;
        }
        String var2 = class201.method2051(arg0, Statics.field2395);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field498; var3++) {
            class8 var4 = field293[var3];
            String var5 = class201.method2051(var4.field117, Statics.field2395);
            if (var5 != null && var5.equals(var2)) {
                class10.method100(31, "", arg0 + class143.field2309);
                return;
            }
            if (var4.field114 != null) {
                String var6 = class201.method2051(var4.field114, Statics.field2395);
                if (var6 != null && var6.equals(var2)) {
                    class10.method100(31, "", arg0 + class143.field2309);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field318; var7++) {
            class16 var8 = field496[var7];
            String var9 = class201.method2051(var8.field225, Statics.field2395);
            if (var9 != null && var9.equals(var2)) {
                class10.method100(31, "", class143.field2314 + arg0 + class143.field2141);
                return;
            }
            if (var8.field224 != null) {
                String var10 = class201.method2051(var8.field224, Statics.field2395);
                if (var10 != null && var10.equals(var2)) {
                    class10.method100(31, "", class143.field2314 + arg0 + class143.field2141);
                    return;
                }
            }
        }
        if (class201.method2051(Statics.field628.field42, Statics.field2395).equals(var2)) {
            class10.method100(31, "", class143.field2311);
            return;
        }
        field361.method2334(2);
        class110 var11 = field361;
        int var12 = arg0.length() + 1;
        var11.method2087(var12);
        field361.method2092(arg0);
    }

    @ObfuscatedName("ax.dh(Ljava/lang/String;IB)V")
    public static final void method1015(String arg0, int arg1) {
        field361.method2334(171);
        class110 var2 = field361;
        int var3 = arg0.length() + 1;
        var2.method2087(var3 + 1);
        field361.method2092(arg0);
        field361.method2197(arg1);
    }

    @ObfuscatedName("ar.dk(Ljava/lang/String;I)V")
    public static final void method583(String arg0) {
        if (Statics.field1690 == null) {
            return;
        }
        field361.method2334(203);
        class110 var1 = field361;
        int var2 = arg0.length() + 1;
        var1.method2087(var2);
        field361.method2092(arg0);
    }

    @ObfuscatedName("ci.dx(I)V")
    public static final void method1943() {
        field361.method2334(197);
        field361.method2087(0);
    }

    @ObfuscatedName("fa.dt(Lei;B)I")
    public static int method3000(class153 arg0) {
        class180 var1 = (class180) field266.method3171(((long) arg0.field2535 << 32) + (long) arg0.field2638);
        return var1 == null ? arg0.field2594 : var1.field2859;
    }

    @ObfuscatedName("k.dq(Lei;I)Lei;")
    public static class153 method142(class153 arg0) {
        int var1 = method3000(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class153.method2362(arg0.field2578);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("y.dw(Lei;I)Z")
    public static boolean method102(class153 arg0) {
        if (field415) {
            if (method3000(arg0) != 0) {
                return false;
            }
            if (arg0.field2634 == 0) {
                return false;
            }
        }
        return arg0.field2547;
    }

    @ObfuscatedName("m.dc(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method30(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field468 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field468 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field468 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field468 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field468 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field283 + "/";
    }
}

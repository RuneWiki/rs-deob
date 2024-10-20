package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class131 {

    @ObfuscatedName("client.c")
    public static boolean field339 = true;

    @ObfuscatedName("client.n")
    public static int field320 = 1;

    @ObfuscatedName("client.s")
    public static int field256 = 0;

    @ObfuscatedName("client.w")
    public static class198[] field500 = new class198[4];

    @ObfuscatedName("client.u")
    public static int field418 = 0;

    @ObfuscatedName("client.a")
    public static boolean field513 = false;

    @ObfuscatedName("client.v")
    public static boolean field459 = false;

    @ObfuscatedName("client.e")
    public static int field261 = 0;

    @ObfuscatedName("client.z")
    public static int field398 = 0;

    @ObfuscatedName("client.l")
    public static boolean field263 = true;

    @ObfuscatedName("client.t")
    public static int field343 = 0;

    @ObfuscatedName("client.q")
    public static long field355 = -1L;

    @ObfuscatedName("client.o")
    public static int field409 = -1;

    @ObfuscatedName("client.i")
    public static int field352 = -1;

    @ObfuscatedName("client.m")
    public static int field501 = -1;

    @ObfuscatedName("client.f")
    public static boolean field270 = true;

    @ObfuscatedName("client.k")
    public static boolean field321 = false;

    @ObfuscatedName("client.an")
    public static int field272 = 0;

    @ObfuscatedName("client.aw")
    public static int field273 = 0;

    @ObfuscatedName("client.at")
    public static int field274 = 0;

    @ObfuscatedName("client.al")
    public static int field275 = 0;

    @ObfuscatedName("client.as")
    public static int field325 = 0;

    @ObfuscatedName("client.ak")
    public static int field293 = 0;

    @ObfuscatedName("client.aa")
    public static int field278 = 0;

    @ObfuscatedName("client.ao")
    public static int field279 = 0;

    @ObfuscatedName("client.af")
    public static int field280 = 0;

    @ObfuscatedName("client.aj")
    public static class107 field281 = new class107(new byte[5000]);

    @ObfuscatedName("client.av")
    public static class18 field282 = class18.field520;

    @ObfuscatedName("client.ai")
    public static int field427 = 0;

    @ObfuscatedName("client.au")
    public static int field284 = 0;

    @ObfuscatedName("client.ag")
    public static int field285 = 0;

    @ObfuscatedName("client.bh")
    public static int field288 = 0;

    @ObfuscatedName("client.bo")
    public static int field289 = 0;

    @ObfuscatedName("client.bi")
    public static int field404 = 0;

    @ObfuscatedName("client.bg")
    public static int field291 = 0;

    @ObfuscatedName("client.bq")
    public static int field292 = 0;

    @ObfuscatedName("client.bl")
    public static class30[] field410 = new class30[32768];

    @ObfuscatedName("client.be")
    public static int field294 = 0;

    @ObfuscatedName("client.bb")
    public static int[] field295 = new int[32768];

    @ObfuscatedName("client.ch")
    public static class110 field297 = new class110(5000);

    @ObfuscatedName("client.cf")
    public static class110 field298 = new class110(5000);

    @ObfuscatedName("client.cs")
    public static class110 field299 = new class110(5000);

    @ObfuscatedName("client.ci")
    public static int field394 = 0;

    @ObfuscatedName("client.ct")
    public static int field265 = 0;

    @ObfuscatedName("client.cd")
    public static int field348 = 0;

    @ObfuscatedName("client.cm")
    public static int field303 = 0;

    @ObfuscatedName("client.cb")
    public static int field389 = 0;

    @ObfuscatedName("client.cc")
    public static int field392 = 0;

    @ObfuscatedName("client.cj")
    public static int field267 = 0;

    @ObfuscatedName("client.cx")
    public static int field462 = 0;

    @ObfuscatedName("client.cq")
    public static boolean field308 = false;

    @ObfuscatedName("client.cw")
    public static int field485 = 0;

    @ObfuscatedName("client.cr")
    public static int field466 = 0;

    @ObfuscatedName("client.dh")
    public static int field326 = 1;

    @ObfuscatedName("client.de")
    public static int field504 = 0;

    @ObfuscatedName("client.dp")
    public static int field313 = 1;

    @ObfuscatedName("client.dl")
    public static int field362 = 0;

    @ObfuscatedName("client.di")
    public static boolean field317 = false;

    @ObfuscatedName("client.dj")
    public static int[][][] field375 = new int[4][13][13];

    @ObfuscatedName("client.do")
    public static final int[] field319 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.ds")
    public static int field505 = 0;

    @ObfuscatedName("client.dn")
    public static int field277 = 2;

    @ObfuscatedName("client.dq")
    public static int field322 = 0;

    @ObfuscatedName("client.dd")
    public static int field307 = 2;

    @ObfuscatedName("client.df")
    public static int field324 = 0;

    @ObfuscatedName("client.dv")
    public static int field428 = 1;

    @ObfuscatedName("client.dm")
    public static int field318 = 0;

    @ObfuscatedName("client.dy")
    public static int field387 = 0;

    @ObfuscatedName("client.dr")
    public static int field328 = 2;

    @ObfuscatedName("client.db")
    public static int field329 = 0;

    @ObfuscatedName("client.ef")
    public static int field330 = 1;

    @ObfuscatedName("client.el")
    public static int field331 = 0;

    @ObfuscatedName("client.ei")
    public static int field332 = 0;

    @ObfuscatedName("client.ee")
    public static int field472 = 2301979;

    @ObfuscatedName("client.eq")
    public static int field334 = 5063219;

    @ObfuscatedName("client.em")
    public static int field335 = 3353893;

    @ObfuscatedName("client.ez")
    public static int field336 = 7759444;

    @ObfuscatedName("client.eh")
    public static boolean field337 = false;

    @ObfuscatedName("client.ft")
    public static int field338 = 0;

    @ObfuscatedName("client.fj")
    public static int field340 = 128;

    @ObfuscatedName("client.fg")
    public static int field396 = 0;

    @ObfuscatedName("client.fx")
    public static int field342 = 0;

    @ObfuscatedName("client.fr")
    public static int field414 = 0;

    @ObfuscatedName("client.fm")
    public static int field344 = 0;

    @ObfuscatedName("client.fa")
    public static int field345 = 0;

    @ObfuscatedName("client.fw")
    public static int field346 = 0;

    @ObfuscatedName("client.fh")
    public static boolean field347 = false;

    @ObfuscatedName("client.fl")
    public static int field419 = 0;

    @ObfuscatedName("client.fz")
    public static int field349 = 0;

    @ObfuscatedName("client.fu")
    public static int field464 = 50;

    @ObfuscatedName("client.fb")
    public static int[] field351 = new int[field464];

    @ObfuscatedName("client.fs")
    public static int[] field316 = new int[field464];

    @ObfuscatedName("client.fv")
    public static int[] field353 = new int[field464];

    @ObfuscatedName("client.fc")
    public static int[] field354 = new int[field464];

    @ObfuscatedName("client.fp")
    public static int[] field259 = new int[field464];

    @ObfuscatedName("client.fo")
    public static int[] field310 = new int[field464];

    @ObfuscatedName("client.fd")
    public static int[] field357 = new int[field464];

    @ObfuscatedName("client.gl")
    public static String[] field358 = new String[field464];

    @ObfuscatedName("client.gh")
    public static int[][] field356 = new int[104][104];

    @ObfuscatedName("client.gt")
    public static int field262 = 0;

    @ObfuscatedName("client.gb")
    public static int field361 = -1;

    @ObfuscatedName("client.gq")
    public static int field260 = -1;

    @ObfuscatedName("client.gd")
    public static int field363 = 0;

    @ObfuscatedName("client.gr")
    public static int field364 = 0;

    @ObfuscatedName("client.ge")
    public static int field365 = 0;

    @ObfuscatedName("client.gy")
    public static int field255 = 0;

    @ObfuscatedName("client.gg")
    public static int field367 = 0;

    @ObfuscatedName("client.gk")
    public static int field366 = 0;

    @ObfuscatedName("client.gs")
    public static int field369 = 0;

    @ObfuscatedName("client.gp")
    public static int field424 = 0;

    @ObfuscatedName("client.gx")
    public static int field371 = 0;

    @ObfuscatedName("client.gf")
    public static int field372 = 0;

    @ObfuscatedName("client.go")
    public static boolean field373 = false;

    @ObfuscatedName("client.gw")
    public static int field374 = 0;

    @ObfuscatedName("client.gn")
    public static int field483 = 0;

    @ObfuscatedName("client.gz")
    public static class3[] field333 = new class3[2048];

    @ObfuscatedName("client.gj")
    public static int field377 = 0;

    @ObfuscatedName("client.gv")
    public static int[] field378 = new int[2048];

    @ObfuscatedName("client.he")
    public static int field379 = 0;

    @ObfuscatedName("client.hy")
    public static int[] field380 = new int[2048];

    @ObfuscatedName("client.hb")
    public static class107[] field315 = new class107[2048];

    @ObfuscatedName("client.hh")
    public static int field382 = -1;

    @ObfuscatedName("client.hi")
    public static int field383 = 0;

    @ObfuscatedName("client.ha")
    public static int field384 = 0;

    @ObfuscatedName("client.hf")
    public static int[] field385 = new int[1000];

    @ObfuscatedName("client.hu")
    public static final int[] field360 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hm")
    public static String[] field479 = new String[8];

    @ObfuscatedName("client.hk")
    public static boolean[] field421 = new boolean[8];

    @ObfuscatedName("client.hl")
    public static int[] field390 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hz")
    public static int field391 = -1;

    @ObfuscatedName("client.ht")
    public static class178[][][] field470 = new class178[4][104][104];

    @ObfuscatedName("client.hc")
    public static class178 field393 = new class178();

    @ObfuscatedName("client.hs")
    public static class178 field477 = new class178();

    @ObfuscatedName("client.hx")
    public static class178 field311 = new class178();

    @ObfuscatedName("client.hd")
    public static int[] field381 = new int[25];

    @ObfuscatedName("client.hq")
    public static int[] field397 = new int[25];

    @ObfuscatedName("client.hr")
    public static int[] field323 = new int[25];

    @ObfuscatedName("client.hn")
    public static int field399 = 0;

    @ObfuscatedName("client.ho")
    public static boolean field400 = false;

    @ObfuscatedName("client.iu")
    public static int field401 = 0;

    @ObfuscatedName("client.if")
    public static int[] field402 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field403 = new int[500];

    @ObfuscatedName("client.ik")
    public static int[] field508 = new int[500];

    @ObfuscatedName("client.ip")
    public static int[] field405 = new int[500];

    @ObfuscatedName("client.iy")
    public static String[] field406 = new String[500];

    @ObfuscatedName("client.ic")
    public static String[] field407 = new String[500];

    @ObfuscatedName("client.ia")
    public static int field314 = -1;

    @ObfuscatedName("client.im")
    public static int field370 = -1;

    @ObfuscatedName("client.in")
    public static int field476 = 0;

    @ObfuscatedName("client.ie")
    public static int field411 = 50;

    @ObfuscatedName("client.ig")
    public static int field506 = 0;

    @ObfuscatedName("client.it")
    public static String field413 = null;

    @ObfuscatedName("client.iv")
    public static boolean field302 = false;

    @ObfuscatedName("client.iz")
    public static int field415 = -1;

    @ObfuscatedName("client.io")
    public static int field416 = -1;

    @ObfuscatedName("client.jr")
    public static String field327 = null;

    @ObfuscatedName("client.jd")
    public static String field412 = null;

    @ObfuscatedName("client.jf")
    public static int field350 = -1;

    @ObfuscatedName("client.jy")
    public static class175 field420 = new class175(8);

    @ObfuscatedName("client.jb")
    public static int field497 = 0;

    @ObfuscatedName("client.jp")
    public static int field422 = 0;

    @ObfuscatedName("client.ju")
    public static class153 field423 = null;

    @ObfuscatedName("client.ja")
    public static int field488 = 0;

    @ObfuscatedName("client.jm")
    public static int field425 = 0;

    @ObfuscatedName("client.jt")
    public static int field426 = 0;

    @ObfuscatedName("client.ji")
    public static int field268 = -1;

    @ObfuscatedName("client.jc")
    public static boolean field519 = false;

    @ObfuscatedName("client.jq")
    public static boolean field429 = false;

    @ObfuscatedName("client.js")
    public static boolean field430 = false;

    @ObfuscatedName("client.jh")
    public static class153 field431 = null;

    @ObfuscatedName("client.jk")
    public static class153 field432 = null;

    @ObfuscatedName("client.jj")
    public static int field475 = 0;

    @ObfuscatedName("client.jv")
    public static int field434 = 0;

    @ObfuscatedName("client.jl")
    public static class153 field435 = null;

    @ObfuscatedName("client.jz")
    public static boolean field436 = false;

    @ObfuscatedName("client.jw")
    public static int field253 = -1;

    @ObfuscatedName("client.jn")
    public static int field438 = -1;

    @ObfuscatedName("client.je")
    public static boolean field439 = false;

    @ObfuscatedName("client.jg")
    public static int field440 = -1;

    @ObfuscatedName("client.jo")
    public static int field441 = -1;

    @ObfuscatedName("client.ke")
    public static boolean field442 = false;

    @ObfuscatedName("client.kk")
    public static int field443 = 1;

    @ObfuscatedName("client.ks")
    public static int[] field444 = new int[32];

    @ObfuscatedName("client.kt")
    public static int field376 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field446 = new int[32];

    @ObfuscatedName("client.ky")
    public static int field447 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field448 = new int[32];

    @ObfuscatedName("client.kg")
    public static int field449 = 0;

    @ObfuscatedName("client.kv")
    public static int field388 = 0;

    @ObfuscatedName("client.kn")
    public static int field451 = 0;

    @ObfuscatedName("client.kf")
    public static int field452 = 0;

    @ObfuscatedName("client.kd")
    public static int field453 = 0;

    @ObfuscatedName("client.kp")
    public static int[] field287 = new int[2000];

    @ObfuscatedName("client.kh")
    public static String[] field455 = new String[1000];

    @ObfuscatedName("client.kw")
    public static int field456 = 0;

    @ObfuscatedName("client.kb")
    public static class178 field252 = new class178();

    @ObfuscatedName("client.km")
    public static class178 field445 = new class178();

    @ObfuscatedName("client.kj")
    public static class178 field467 = new class178();

    @ObfuscatedName("client.kc")
    public static class175 field460 = new class175(512);

    @ObfuscatedName("client.ll")
    public static int field461 = 0;

    @ObfuscatedName("client.lp")
    public static int field514 = -2;

    @ObfuscatedName("client.lg")
    public static boolean[] field463 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static boolean[] field458 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field465 = new boolean[100];

    @ObfuscatedName("client.lb")
    public static int[] field450 = new int[100];

    @ObfuscatedName("client.ly")
    public static int[] field437 = new int[100];

    @ObfuscatedName("client.lx")
    public static int[] field468 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field469 = new int[100];

    @ObfuscatedName("client.lt")
    public static int field300 = 0;

    @ObfuscatedName("client.lf")
    public static int[] field473 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lh")
    public static int field359 = 0;

    @ObfuscatedName("client.lv")
    public static int field304 = 0;

    @ObfuscatedName("client.lk")
    public static long[] field474 = new long[100];

    @ObfuscatedName("client.lw")
    public static int field312 = 0;

    @ObfuscatedName("client.ls")
    public static int field457 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field264 = new int[128];

    @ObfuscatedName("client.lu")
    public static int[] field478 = new int[128];

    @ObfuscatedName("client.lj")
    public static long field417 = -1L;

    @ObfuscatedName("client.lo")
    public static String field480 = null;

    @ObfuscatedName("client.lq")
    public static String field481 = null;

    @ObfuscatedName("client.mb")
    public static int field482 = -1;

    @ObfuscatedName("client.mv")
    public static int field454 = 0;

    @ObfuscatedName("client.mm")
    public static int[] field484 = new int[1000];

    @ObfuscatedName("client.mw")
    public static int[] field433 = new int[1000];

    @ObfuscatedName("client.mt")
    public static class72[] field486 = new class72[1000];

    @ObfuscatedName("client.mr")
    public static int field487 = 0;

    @ObfuscatedName("client.mk")
    public static int field309 = 0;

    @ObfuscatedName("client.mx")
    public static int field490 = 0;

    @ObfuscatedName("client.me")
    public static int field491 = 255;

    @ObfuscatedName("client.mp")
    public static int field492 = -1;

    @ObfuscatedName("client.ma")
    public static boolean field493 = false;

    @ObfuscatedName("client.mo")
    public static int field494 = 127;

    @ObfuscatedName("client.mi")
    public static int field495 = 127;

    @ObfuscatedName("client.no")
    public static int field496 = 0;

    @ObfuscatedName("client.ne")
    public static int[] field395 = new int[50];

    @ObfuscatedName("client.nh")
    public static int[] field498 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field499 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field290 = new int[50];

    @ObfuscatedName("client.nn")
    public static class52[] field271 = new class52[50];

    @ObfuscatedName("client.nz")
    public static boolean field502 = false;

    @ObfuscatedName("client.nx")
    public static boolean[] field503 = new boolean[5];

    @ObfuscatedName("client.nc")
    public static int[] field471 = new int[5];

    @ObfuscatedName("client.nt")
    public static int[] field306 = new int[5];

    @ObfuscatedName("client.nw")
    public static int[] field276 = new int[5];

    @ObfuscatedName("client.ny")
    public static int[] field507 = new int[5];

    @ObfuscatedName("client.nd")
    public static int field269 = 0;

    @ObfuscatedName("client.ov")
    public static int field509 = 0;

    @ObfuscatedName("client.oi")
    public static class16[] field510 = new class16[400];

    @ObfuscatedName("client.ok")
    public static class174 field511 = new class174();

    @ObfuscatedName("client.od")
    public static int field512 = 0;

    @ObfuscatedName("client.ox")
    public static class8[] field257 = new class8[400];

    @ObfuscatedName("client.oc")
    public static class158 field305 = new class158();

    @ObfuscatedName("client.on")
    public static int field515 = -1;

    @ObfuscatedName("client.os")
    public static int field516 = -1;

    @ObfuscatedName("client.n(B)V")
    public final void method168() {
    }

    public final void init() {
        if (!this.method2706()) {
            return;
        }
        class169[] var1 = new class169[] { class169.field2831, class169.field2824, class169.field2837, class169.field2827, class169.field2829, class169.field2833, class169.field2828, class169.field2832, class169.field2825, class169.field2834 };
        class169[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class169 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2826);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2826)) {
                    case 1:
                        Statics.field989 = var5;
                    case 2:
                    default:
                        break;
                    case 3:
                        field256 = Integer.parseInt(var5);
                        break;
                    case 4:
                        field261 = Integer.parseInt(var5);
                        break;
                    case 5:
                        if (var5.equalsIgnoreCase(class2.field18)) {
                        }
                        break;
                    case 6:
                        field320 = Integer.parseInt(var5);
                        break;
                    case 7:
                        int var6 = Integer.parseInt(var5);
                        class139[] var7 = class139.method1071();
                        int var8 = 0;
                        class139 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class139 var9 = var7[var8];
                            if (var9.field2113 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field1909 = var10;
                        break;
                    case 8:
                        field418 = Integer.parseInt(var5);
                        break;
                    case 9:
                        Statics.field258 = (class140) class99.method496(class140.method2109(), Integer.parseInt(var5));
                        if (Statics.field258 == class140.field2124) {
                            Statics.field2064 = class191.field2894;
                        } else {
                            Statics.field2064 = class191.field2900;
                        }
                        break;
                    case 10:
                        if (var5.equalsIgnoreCase(class2.field18)) {
                            field513 = true;
                        } else {
                            field513 = false;
                        }
                }
            }
        }
        class79.field1371 = false;
        field459 = false;
        Statics.field612 = this.getCodeBase().getHost();
        String var11 = Statics.field1909.field2112;
        byte var12 = 0;
        try {
            Statics.field2078 = 16;
            Statics.field602 = var12;
            try {
                Statics.field1266 = System.getProperty("os.name");
            } catch (Exception var26) {
                Statics.field1266 = "Unknown";
            }
            Statics.field2029 = Statics.field1266.toLowerCase();
            try {
                Statics.field971 = System.getProperty("user.home");
                if (Statics.field971 != null) {
                    Statics.field971 = Statics.field971 + "/";
                }
            } catch (Exception var25) {
            }
            try {
                if (Statics.field2029.startsWith("win")) {
                    if (Statics.field971 == null) {
                        Statics.field971 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field971 == null) {
                    Statics.field971 = System.getenv("HOME");
                }
                if (Statics.field971 != null) {
                    Statics.field971 = Statics.field971 + "/";
                }
            } catch (Exception var24) {
            }
            if (Statics.field971 == null) {
                Statics.field971 = "~/";
            }
            Statics.field2085 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field971, "/tmp/", "" };
            Statics.field793 = new String[] { ".jagex_cache_" + Statics.field602, ".file_store_" + Statics.field602 };
            label120: for (int var16 = 0; var16 < 4; var16++) {
                Statics.field2074 = class136.method1651("oldschool", var11, var16);
                if (!Statics.field2074.exists()) {
                    Statics.field2074.mkdirs();
                }
                File[] var17 = Statics.field2074.listFiles();
                if (var17 == null) {
                    break;
                }
                File[] var18 = var17;
                int var19 = 0;
                while (true) {
                    if (var19 >= var18.length) {
                        break label120;
                    }
                    File var20 = var18[var19];
                    if (!class136.method2114(var20, false)) {
                        break;
                    }
                    var19++;
                }
            }
            File var21 = Statics.field2074;
            Statics.field1920 = var21;
            if (!Statics.field1920.exists()) {
                throw new RuntimeException("");
            }
            class122.field1925 = true;
            class136.method136();
            class136.field2081 = new class197(new class196(class122.method1645("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class136.field2079 = new class197(new class196(class122.method1645("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1496 = new class197[Statics.field2078];
            for (int var22 = 0; var22 < Statics.field2078; var22++) {
                Statics.field1496[var22] = new class197(new class196(class122.method1645("main_file_cache.idx" + var22), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var27) {
            class135.method2121((String) null, var27);
        }
        Statics.field254 = this;
        this.method2673(765, 503, 61);
    }

    @ObfuscatedName("client.r(I)V")
    public final void method470() {
        Statics.field59 = field418 == 0 ? 43594 : field320 + 40000;
        Statics.field1884 = field418 == 0 ? 443 : field320 + 50000;
        Statics.field603 = Statics.field59;
        Statics.field621 = class154.field2658;
        Statics.field1463 = class154.field2659;
        Statics.field2682 = class154.field2656;
        Statics.field686 = class154.field2657;
        class124.method537();
        Canvas var1 = Statics.field1272;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class124.field1965);
        var1.addFocusListener(class124.field1965);
        class127.method2100(Statics.field1272);
        Statics.field628 = class118.method484();
        if (Statics.field628 != null) {
            Statics.field628.method2478(Statics.field1272);
        }
        Statics.field1452 = new class121(255, class136.field2081, class136.field2079, 500000);
        Statics.field813 = class9.method1369();
        Statics.field56 = this.getToolkit().getSystemClipboard();
        class125.method1914(this, Statics.field1914);
        if (field418 != 0) {
            field321 = true;
        }
    }

    @ObfuscatedName("client.w(I)V")
    public final void method171() {
        field343++;
        this.method174();
        while (true) {
            class178 var1 = class150.field2494;
            class149 var2;
            synchronized (class150.field2494) {
                var2 = (class149) class150.field2491.method3305();
            }
            if (var2 == null) {
                try {
                    if (class162.field2720 == 1) {
                        int var4 = Statics.field697.method3105();
                        if (var4 > 0 && Statics.field697.method3110()) {
                            int var5 = var4 - Statics.field1432;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field697.method3104(var5);
                        } else {
                            Statics.field697.method3109();
                            Statics.field697.method3108();
                            if (Statics.field1897 == null) {
                                class162.field2720 = 0;
                            } else {
                                class162.field2720 = 2;
                            }
                            Statics.field2721 = null;
                            Statics.field2134 = null;
                        }
                    }
                } catch (Exception var13) {
                    var13.printStackTrace();
                    Statics.field697.method3109();
                    class162.field2720 = 0;
                    Statics.field2721 = null;
                    Statics.field2134 = null;
                    Statics.field1897 = null;
                }
                Statics.method161();
                class124.method2026();
                class127.method553();
                if (Statics.field628 != null) {
                    int var7 = Statics.field628.method2492();
                    field456 = var7;
                }
                if (field398 == 0) {
                    method2545();
                    Statics.field61.method2502();
                    for (int var8 = 0; var8 < 32; var8++) {
                        field2040[var8] = 0L;
                    }
                    for (int var9 = 0; var9 < 32; var9++) {
                        field2045[var9] = 0L;
                    }
                    Statics.field1268 = 0;
                } else if (field398 == 5) {
                    class28.method35(this);
                    method2545();
                    Statics.field61.method2502();
                    for (int var10 = 0; var10 < 32; var10++) {
                        field2040[var10] = 0L;
                    }
                    for (int var11 = 0; var11 < 32; var11++) {
                        field2045[var11] = 0L;
                    }
                    Statics.field1268 = 0;
                } else if (field398 == 10 || field398 == 11) {
                    class28.method35(this);
                } else if (field398 == 20) {
                    class28.method35(this);
                    method1934();
                } else if (field398 == 25) {
                    Statics.method37();
                }
                if (field398 == 30) {
                    method954();
                } else if (field398 == 40 || field398 == 45) {
                    method1934();
                }
                return;
            }
            var2.field2483.method2879(var2.field2486, (int) var2.field2881, var2.field2485, false);
        }
    }

    @ObfuscatedName("client.u(I)V")
    public final void method172() {
        boolean var1;
        label157: {
            try {
                if (class162.field2720 == 2) {
                    if (Statics.field2721 == null) {
                        Statics.field2721 = class159.method3013(Statics.field1897, Statics.field1890, Statics.field2413);
                        if (Statics.field2721 == null) {
                            var1 = false;
                            break label157;
                        }
                    }
                    if (Statics.field2134 == null) {
                        Statics.field2134 = new class53(Statics.field2719, Statics.field1888);
                    }
                    if (Statics.field697.method3106(Statics.field2721, Statics.field2718, Statics.field2134, 22050)) {
                        Statics.field697.method3135();
                        Statics.field697.method3104(Statics.field74);
                        Statics.field697.method3202(Statics.field2721, Statics.field1873);
                        class162.field2720 = 0;
                        Statics.field2721 = null;
                        Statics.field2134 = null;
                        Statics.field1897 = null;
                        var1 = true;
                        break label157;
                    }
                }
            } catch (Exception var28) {
                var28.printStackTrace();
                Statics.field697.method3109();
                class162.field2720 = 0;
                Statics.field2721 = null;
                Statics.field2134 = null;
                Statics.field1897 = null;
            }
            var1 = false;
        }
        if (var1 && field493 && Statics.field1515 != null) {
            Statics.field1515.method1047();
        }
        if (field2048) {
            Canvas var4 = Statics.field1272;
            var4.removeKeyListener(class124.field1965);
            var4.removeFocusListener(class124.field1965);
            class124.field1962 = -1;
            Canvas var5 = Statics.field1272;
            var5.removeMouseListener(class127.field1994);
            var5.removeMouseMotionListener(class127.field1994);
            var5.removeFocusListener(class127.field1994);
            class127.field1998 = 0;
            if (Statics.field628 != null) {
                Statics.field628.method2480(Statics.field1272);
            }
            this.method2717();
            Canvas var6 = Statics.field1272;
            var6.setFocusTraversalKeysEnabled(false);
            var6.addKeyListener(class124.field1965);
            var6.addFocusListener(class124.field1965);
            class127.method2100(Statics.field1272);
            if (Statics.field628 != null) {
                Statics.field628.method2478(Statics.field1272);
            }
        }
        if (field398 == 0) {
            int var7 = class28.field682;
            String var8 = class28.field678;
            Color var9 = null;
            try {
                Graphics var10 = Statics.field1272.getGraphics();
                if (Statics.field1981 == null) {
                    Statics.field1981 = new Font("Helvetica", 1, 13);
                    Statics.field2700 = Statics.field1272.getFontMetrics(Statics.field1981);
                }
                if (field2046) {
                    field2046 = false;
                    var10.setColor(Color.black);
                    var10.fillRect(0, 0, Statics.field1848, Statics.field521);
                }
                if (var9 == null) {
                    var9 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1521 == null) {
                        Statics.field1521 = Statics.field1272.createImage(304, 34);
                    }
                    Graphics var11 = Statics.field1521.getGraphics();
                    var11.setColor(var9);
                    var11.drawRect(0, 0, 303, 33);
                    var11.fillRect(2, 2, var7 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(1, 1, 301, 31);
                    var11.fillRect(var7 * 3 + 2, 2, 300 - var7 * 3, 30);
                    var11.setFont(Statics.field1981);
                    var11.setColor(Color.white);
                    var11.drawString(var8, (304 - Statics.field2700.stringWidth(var8)) / 2, 22);
                    var10.drawImage(Statics.field1521, Statics.field1848 / 2 - 152, Statics.field521 / 2 - 18, (ImageObserver) null);
                } catch (Exception var24) {
                    int var13 = Statics.field1848 / 2 - 152;
                    int var14 = Statics.field521 / 2 - 18;
                    var10.setColor(var9);
                    var10.drawRect(var13, var14, 303, 33);
                    var10.fillRect(var13 + 2, var14 + 2, var7 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(var13 + 1, var14 + 1, 301, 31);
                    var10.fillRect(var7 * 3 + var13 + 2, var14 + 2, 300 - var7 * 3, 30);
                    var10.setFont(Statics.field1981);
                    var10.setColor(Color.white);
                    var10.drawString(var8, var13 + (304 - Statics.field2700.stringWidth(var8)) / 2, var14 + 22);
                }
            } catch (Exception var25) {
                Statics.field1272.repaint();
            }
        } else if (field398 == 5) {
            class28.method41(Statics.field183, Statics.field577);
        } else if (field398 == 10 || field398 == 11) {
            class28.method41(Statics.field183, Statics.field577);
        } else if (field398 == 20) {
            class28.method41(Statics.field183, Statics.field577);
        } else if (field398 == 25) {
            if (field362 == 1) {
                if (field466 > field326) {
                    field326 = field466;
                }
                int var16 = (field326 * 50 - field466 * 50) / field326;
                method48(class143.field2156 + class2.field25 + class2.field21 + var16 + "%" + class2.field22, false);
            } else if (field362 == 2) {
                if (field504 > field313) {
                    field313 = field504;
                }
                int var17 = (field313 * 50 - field504 * 50) / field313 + 50;
                method48(class143.field2156 + class2.field25 + class2.field21 + var17 + "%" + class2.field22, false);
            } else {
                method48(class143.field2156, false);
            }
        } else if (field398 == 30) {
            method2624();
        } else if (field398 == 40) {
            method48(class143.field2157 + class2.field25 + class143.field2246, false);
        } else if (field398 == 45) {
            method48(class143.field2305, false);
        }
        if (field398 == 30 && field300 == 0 && !field2046) {
            try {
                Graphics var18 = Statics.field1272.getGraphics();
                for (int var19 = 0; var19 < field461; var19++) {
                    if (field458[var19]) {
                        Statics.field2011.method1397(var18, field450[var19], field437[var19], field468[var19], field469[var19]);
                        field458[var19] = false;
                    }
                }
            } catch (Exception var27) {
                Statics.field1272.repaint();
            }
        } else if (field398 > 0) {
            try {
                Graphics var21 = Statics.field1272.getGraphics();
                Statics.field2011.method1398(var21, 0, 0);
                field2046 = false;
                for (int var22 = 0; var22 < field461; var22++) {
                    field458[var22] = false;
                }
            } catch (Exception var26) {
                Statics.field1272.repaint();
            }
        }
    }

    @ObfuscatedName("client.d(I)V")
    public final void method173() {
        if (Statics.field266 != null) {
            Statics.field266.field181 = false;
        }
        Statics.field266 = null;
        if (Statics.field1109 != null) {
            Statics.field1109.method2648();
            Statics.field1109 = null;
        }
        if (class124.field1965 != null) {
            class124 var1 = class124.field1965;
            synchronized (class124.field1965) {
                class124.field1965 = null;
            }
        }
        class127.method696();
        Statics.field628 = null;
        if (Statics.field1515 != null) {
            Statics.field1515.method1046();
        }
        if (Statics.field691 != null) {
            Statics.field691.method1046();
        }
        if (Statics.field2500 != null) {
            Statics.field2500.method2648();
        }
        class150.method841();
        class136.method2098();
    }

    @ObfuscatedName("do.h(II)V")
    public static void method2490(int arg0) {
        if (field398 == arg0) {
            return;
        }
        if (field398 == 0) {
            Statics.field1521 = null;
            Statics.field1981 = null;
            Statics.field2700 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field289 = 0;
            field404 = 0;
            field291 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field296 != null) {
            Statics.field296.method2648();
            Statics.field296 = null;
        }
        if (field398 == 25) {
            field362 = 0;
            field466 = 0;
            field326 = 1;
            field504 = 0;
            field313 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            Statics.method1(Statics.field1272, Statics.field1052, Statics.field709, true, 0);
        } else if (arg0 == 20) {
            Statics.method1(Statics.field1272, Statics.field1052, Statics.field709, true, field398 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            Statics.method1(Statics.field1272, Statics.field1052, Statics.field709, false, 4);
        } else if (Statics.field673) {
            Statics.field646 = null;
            Statics.field647 = null;
            Statics.field648 = null;
            Statics.field649 = null;
            Statics.field650 = null;
            Statics.field670 = null;
            Statics.field652 = null;
            Statics.field653 = null;
            Statics.field1282 = null;
            Statics.field204 = null;
            Statics.field2410 = null;
            Statics.field1695 = null;
            Statics.field635 = null;
            Statics.field1817 = null;
            Statics.field656 = null;
            Statics.field1987 = null;
            Statics.field724 = null;
            Statics.field2022 = null;
            Statics.field76 = null;
            Statics.field643 = null;
            Statics.field12 = null;
            Statics.field619 = null;
            class162.field2720 = 1;
            Statics.field1897 = null;
            Statics.field1890 = -1;
            Statics.field2413 = -1;
            Statics.field74 = 0;
            Statics.field1873 = false;
            Statics.field1432 = 2;
            class151.method2491(true);
            Statics.field673 = false;
        }
        field398 = arg0;
    }

    @ObfuscatedName("client.a(I)V")
    public void method174() {
        if (field398 == 1000) {
            return;
        }
        long var1 = class103.method550();
        int var3 = (int) (var1 - Statics.field2499);
        Statics.field2499 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class151.field2498 += var3;
        boolean var4;
        if (class151.field2508 == 0 && class151.field2503 == 0 && class151.field2506 == 0 && class151.field2512 == 0) {
            var4 = true;
        } else if (Statics.field2500 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class151.field2498 > 30000) {
                        throw new IOException();
                    }
                    while (class151.field2503 < 20 && class151.field2512 > 0) {
                        class152 var5 = (class152) class151.field2513.method3277();
                        class107 var6 = new class107(4);
                        var6.method2159(1);
                        var6.method2161((int) var5.field2881);
                        Statics.field2500.method2636(var6.field1838, 0, 4);
                        class151.field2505.method3264(var5, var5.field2881);
                        class151.field2512--;
                        class151.field2503++;
                    }
                    while (class151.field2508 < 20 && class151.field2506 > 0) {
                        class152 var7 = (class152) class151.field2504.method3349();
                        class107 var8 = new class107(4);
                        var8.method2159(0);
                        var8.method2161((int) var7.field2881);
                        Statics.field2500.method2636(var8.field1838, 0, 4);
                        var7.method3356();
                        class151.field2507.method3264(var7, var7.field2881);
                        class151.field2506--;
                        class151.field2508++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2500.method2637();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class151.field2498 = 0;
                        byte var11 = 0;
                        if (Statics.field1764 == null) {
                            var11 = 8;
                        } else if (class151.field2510 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class151.field2509.field1837;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2500.method2635(class151.field2509.field1838, class151.field2509.field1837, var12);
                            if (class151.field2514 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class151.field2509.field1838[class151.field2509.field1837 + var13] ^= class151.field2514;
                                }
                            }
                            class151.field2509.field1837 += var12;
                            if (class151.field2509.field1837 < var11) {
                                break;
                            }
                            if (Statics.field1764 == null) {
                                class151.field2509.field1837 = 0;
                                int var14 = class151.field2509.method2173();
                                int var15 = class151.field2509.method2175();
                                int var16 = class151.field2509.method2173();
                                int var17 = class151.field2509.method2305();
                                long var18 = (long) ((var14 << 16) + var15);
                                class152 var20 = (class152) class151.field2505.method3263(var18);
                                Statics.field1059 = true;
                                if (var20 == null) {
                                    var20 = (class152) class151.field2507.method3263(var18);
                                    Statics.field1059 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1764 = var20;
                                Statics.field1857 = new class107(var17 + var21 + Statics.field1764.field2520);
                                Statics.field1857.method2159(var16);
                                Statics.field1857.method2162(var17);
                                class151.field2510 = 8;
                                class151.field2509.field1837 = 0;
                            } else if (class151.field2510 == 0) {
                                if (class151.field2509.field1838[0] == -1) {
                                    class151.field2510 = 1;
                                    class151.field2509.field1837 = 0;
                                } else {
                                    Statics.field1764 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1857.field1838.length - Statics.field1764.field2520;
                            int var23 = 512 - class151.field2510;
                            if (var23 > var22 - Statics.field1857.field1837) {
                                var23 = var22 - Statics.field1857.field1837;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2500.method2635(Statics.field1857.field1838, Statics.field1857.field1837, var23);
                            if (class151.field2514 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1857.field1838[Statics.field1857.field1837 + var24] ^= class151.field2514;
                                }
                            }
                            Statics.field1857.field1837 += var23;
                            class151.field2510 += var23;
                            if (Statics.field1857.field1837 == var22) {
                                if (Statics.field1764.field2881 == 16711935L) {
                                    Statics.field2497 = Statics.field1857;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class148 var26 = class151.field2501[var25];
                                        if (var26 != null) {
                                            Statics.field2497.field1837 = var25 * 8 + 5;
                                            int var27 = Statics.field2497.method2305();
                                            int var28 = Statics.field2497.method2305();
                                            var26.method2863(var27, var28);
                                        }
                                    }
                                } else {
                                    class151.field2511.reset();
                                    class151.field2511.update(Statics.field1857.field1838, 0, var22);
                                    int var29 = (int) class151.field2511.getValue();
                                    if (Statics.field1764.field2521 != var29) {
                                        try {
                                            Statics.field2500.method2648();
                                        } catch (Exception var35) {
                                        }
                                        class151.field2515++;
                                        Statics.field2500 = null;
                                        class151.field2514 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class151.field2515 = 0;
                                    class151.field2516 = 0;
                                    Statics.field1764.field2525.method2869((int) (Statics.field1764.field2881 & 0xFFFFL), Statics.field1857.field1838, (Statics.field1764.field2881 & 0xFF0000L) == 16711680L, Statics.field1059);
                                }
                                Statics.field1764.method3378();
                                if (Statics.field1059) {
                                    class151.field2503--;
                                } else {
                                    class151.field2508--;
                                }
                                class151.field2510 = 0;
                                Statics.field1764 = null;
                                Statics.field1857 = null;
                            } else {
                                if (class151.field2510 != 512) {
                                    break;
                                }
                                class151.field2510 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2500.method2648();
                } catch (Exception var34) {
                }
                class151.field2516++;
                Statics.field2500 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method175();
        }
    }

    @ObfuscatedName("client.y(B)V")
    public void method175() {
        if (class151.field2515 >= 4) {
            this.method2667("js5crc");
            field398 = 1000;
            return;
        }
        if (class151.field2516 >= 4) {
            if (field398 <= 5) {
                this.method2667("js5io");
                field398 = 1000;
                return;
            }
            field285 = 3000;
            class151.field2516 = 3;
        }
        if (--field285 + 1 > 0) {
            return;
        }
        try {
            if (field284 == 0) {
                Statics.field2464 = Statics.field2680.method2528(Statics.field612, Statics.field603);
                field284++;
            }
            if (field284 == 1) {
                if (Statics.field2464.field2053 == 2) {
                    this.method406(-1);
                    return;
                }
                if (Statics.field2464.field2053 == 1) {
                    field284++;
                }
            }
            if (field284 == 2) {
                Statics.field642 = new class130((Socket) Statics.field2464.field2055, Statics.field2680);
                class107 var1 = new class107(5);
                var1.method2159(15);
                var1.method2162(61);
                Statics.field642.method2636(var1.field1838, 0, 5);
                field284++;
                Statics.field77 = class103.method550();
            }
            if (field284 == 3) {
                if (field398 <= 5 || Statics.field642.method2637() > 0) {
                    int var2 = Statics.field642.method2633();
                    if (var2 != 0) {
                        this.method406(var2);
                        return;
                    }
                    field284++;
                } else if (class103.method550() - Statics.field77 > 30000L) {
                    this.method406(-2);
                    return;
                }
            }
            if (field284 == 4) {
                class130 var3 = Statics.field642;
                boolean var4 = field398 > 20;
                if (Statics.field2500 != null) {
                    try {
                        Statics.field2500.method2648();
                    } catch (Exception var14) {
                    }
                    Statics.field2500 = null;
                }
                Statics.field2500 = var3;
                class151.method2491(var4);
                class151.field2509.field1837 = 0;
                Statics.field1764 = null;
                Statics.field1857 = null;
                class151.field2510 = 0;
                while (true) {
                    class152 var6 = (class152) class151.field2505.method3277();
                    if (var6 == null) {
                        while (true) {
                            class152 var7 = (class152) class151.field2507.method3277();
                            if (var7 == null) {
                                if (class151.field2514 != 0) {
                                    try {
                                        class107 var8 = new class107(4);
                                        var8.method2159(4);
                                        var8.method2159(class151.field2514);
                                        var8.method2364(0);
                                        Statics.field2500.method2636(var8.field1838, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2500.method2648();
                                        } catch (Exception var12) {
                                        }
                                        class151.field2516++;
                                        Statics.field2500 = null;
                                    }
                                }
                                class151.field2498 = 0;
                                Statics.field2499 = class103.method550();
                                Statics.field2464 = null;
                                Statics.field642 = null;
                                field284 = 0;
                                field288 = 0;
                                return;
                            }
                            class151.field2504.method3342(var7);
                            class151.field2502.method3264(var7, var7.field2881);
                            class151.field2506++;
                            class151.field2508--;
                        }
                    }
                    class151.field2513.method3264(var6, var6.field2881);
                    class151.field2512++;
                    class151.field2503--;
                }
            }
        } catch (IOException var15) {
            this.method406(-3);
        }
    }

    @ObfuscatedName("client.v(II)V")
    public void method406(int arg0) {
        Statics.field2464 = null;
        Statics.field642 = null;
        field284 = 0;
        if (Statics.field603 == Statics.field59) {
            Statics.field603 = Statics.field1884;
        } else {
            Statics.field603 = Statics.field59;
        }
        field288++;
        if (field288 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field398 <= 5) {
                this.method2667("js5connect_full");
                field398 = 1000;
            } else {
                field285 = 3000;
            }
        } else if (field288 >= 2 && arg0 == 6) {
            this.method2667("js5connect_outofdate");
            field398 = 1000;
        } else if (field288 >= 4) {
            if (field398 <= 5) {
                this.method2667("js5connect");
                field398 = 1000;
            } else {
                field285 = 3000;
            }
        }
    }

    @ObfuscatedName("dq.e(I)V")
    public static void method2545() {
        if (field427 == 0) {
            Statics.field2687 = new class79(4, 104, 104, class6.field84);
            for (int var0 = 0; var0 < 4; var0++) {
                field500[var0] = new class198(104, 104);
            }
            Statics.field60 = new class72(512, 512);
            class28.field678 = class143.field2159;
            class28.field682 = 5;
            field427 = 20;
        } else if (field427 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1489[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1797(var1, 500, 800, 512, 334);
            class28.field678 = class143.field2160;
            class28.field682 = 10;
            field427 = 30;
        } else if (field427 == 30) {
            Statics.field238 = method2471(0, false, true, true);
            Statics.field286 = method2471(1, false, true, true);
            Statics.field1901 = method2471(2, true, false, true);
            Statics.field2128 = method2471(3, false, true, true);
            Statics.field1084 = method2471(4, false, true, true);
            Statics.field29 = method2471(5, true, true, true);
            Statics.field195 = method2471(6, true, true, false);
            Statics.field117 = method2471(7, false, true, true);
            Statics.field709 = method2471(8, false, true, true);
            Statics.field1807 = method2471(9, false, true, true);
            Statics.field1052 = method2471(10, false, true, true);
            Statics.field223 = method2471(11, false, true, true);
            Statics.field1818 = method2471(12, false, true, true);
            Statics.field799 = method2471(13, true, false, true);
            Statics.field1955 = method2471(14, false, true, false);
            Statics.field368 = method2471(15, false, true, true);
            class28.field678 = class143.field2161;
            class28.field682 = 20;
            field427 = 40;
        } else if (field427 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field238.method2861() * 4 / 100;
            int var8 = var7 + Statics.field286.method2861() * 4 / 100;
            int var9 = var8 + Statics.field1901.method2861() * 2 / 100;
            int var10 = var9 + Statics.field2128.method2861() * 2 / 100;
            int var11 = var10 + Statics.field1084.method2861() * 6 / 100;
            int var12 = var11 + Statics.field29.method2861() * 4 / 100;
            int var13 = var12 + Statics.field195.method2861() * 2 / 100;
            int var14 = var13 + Statics.field117.method2861() * 60 / 100;
            int var15 = var14 + Statics.field709.method2861() * 2 / 100;
            int var16 = var15 + Statics.field1807.method2861() * 2 / 100;
            int var17 = var16 + Statics.field1052.method2861() * 2 / 100;
            int var18 = var17 + Statics.field223.method2861() * 2 / 100;
            int var19 = var18 + Statics.field1818.method2861() * 2 / 100;
            int var20 = var19 + Statics.field799.method2861() * 2 / 100;
            int var21 = var20 + Statics.field1955.method2861() * 2 / 100;
            int var22 = var21 + Statics.field368.method2861() * 2 / 100;
            if (var22 == 100) {
                class28.field678 = class143.field2210;
                class28.field682 = 30;
                field427 = 45;
            } else {
                if (var22 != 0) {
                    class28.field678 = class143.field2162 + var22 + "%";
                }
                class28.field682 = 30;
            }
        } else if (field427 == 45) {
            class50.method1940(22050, !field459, 2);
            class163 var23 = new class163();
            var23.method3111(9, 128);
            Statics.field1515 = class50.method545(Statics.field2680, Statics.field1272, 0, 22050);
            Statics.field1515.method1039(var23);
            class162.method2468(Statics.field368, Statics.field1955, Statics.field1084, var23);
            Statics.field691 = class50.method545(Statics.field2680, Statics.field1272, 1, 2048);
            Statics.field2468 = new class49();
            Statics.field691.method1039(Statics.field2468);
            Statics.field975 = new class68(22050, Statics.field2674);
            class28.field678 = class143.field2247;
            class28.field682 = 35;
            field427 = 50;
        } else if (field427 == 50) {
            int var24 = 0;
            if (Statics.field577 == null) {
                Statics.field577 = class70.method790(Statics.field709, Statics.field799, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field1984 == null) {
                Statics.field1984 = class70.method790(Statics.field709, Statics.field799, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field183 == null) {
                Statics.field183 = class70.method790(Statics.field709, Statics.field799, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class28.field678 = class143.field2165 + var24 * 100 / 3 + "%";
                class28.field682 = 40;
            } else {
                Statics.field1497 = new class146(true);
                class28.field678 = class143.field2237;
                class28.field682 = 40;
                field427 = 60;
            }
        } else if (field427 == 60) {
            int var25 = class28.method481(Statics.field1052, Statics.field709);
            int var26 = class28.method2865();
            if (var25 < var26) {
                class28.field678 = class143.field2167 + var25 * 100 / var26 + "%";
                class28.field682 = 50;
            } else {
                class28.field678 = class143.field2168;
                class28.field682 = 50;
                method2490(5);
                field427 = 70;
            }
        } else if (field427 == 70) {
            if (Statics.field1901.method2825()) {
                class41.method42(Statics.field1901);
                class37.method854(Statics.field1901);
                class40.method508(Statics.field1901, Statics.field117);
                class36.method2013(Statics.field1901, Statics.field117, field459);
                class35.method31(Statics.field1901, Statics.field117);
                class45.method155(Statics.field1901, Statics.field117, field513, Statics.field577);
                class148 var27 = Statics.field1901;
                class148 var28 = Statics.field238;
                class148 var29 = Statics.field286;
                Statics.field904 = var27;
                Statics.field915 = var28;
                Statics.field902 = var29;
                class39.method608(Statics.field1901, Statics.field117);
                class148 var30 = Statics.field1901;
                Statics.field970 = var30;
                class148 var31 = Statics.field1901;
                Statics.field1055 = var31;
                Statics.field1054 = Statics.field1055.method2796(16);
                class148 var32 = Statics.field2128;
                class148 var33 = Statics.field117;
                class148 var34 = Statics.field709;
                class148 var35 = Statics.field799;
                Statics.field2602 = var32;
                Statics.field2531 = var33;
                Statics.field620 = var34;
                Statics.field2611 = var35;
                Statics.field2572 = new class153[Statics.field2602.method2848()][];
                Statics.field2529 = new boolean[Statics.field2602.method2848()];
                class44.method627(Statics.field1901);
                class148 var36 = Statics.field1901;
                Statics.field995 = var36;
                class28.field678 = class143.field2350;
                class28.field682 = 60;
                field427 = 80;
            } else {
                class28.field678 = class143.field2191 + Statics.field1901.method2867() + "%";
                class28.field682 = 60;
            }
        } else if (field427 == 80) {
            int var37 = 0;
            if (Statics.field1876 == null) {
                class148 var38 = Statics.field709;
                int var39 = var38.method2801("compass");
                int var40 = var38.method2802(var39, "");
                class72 var41 = class70.method855(var38, var39, var40);
                Statics.field1876 = var41;
            } else {
                var37++;
            }
            if (Statics.field1498 == null) {
                class148 var42 = Statics.field709;
                int var43 = var42.method2801("mapedge");
                int var44 = var42.method2802(var43, "");
                class72 var45 = class70.method855(var42, var43, var44);
                Statics.field1498 = var45;
            } else {
                var37++;
            }
            if (Statics.field977 == null) {
                Statics.field977 = class70.method2023(Statics.field709, "mapscene", "");
            } else {
                var37++;
            }
            if (Statics.field564 == null) {
                Statics.field564 = class70.method1426(Statics.field709, "mapfunction", "");
            } else {
                var37++;
            }
            if (Statics.field633 == null) {
                Statics.field633 = class70.method1426(Statics.field709, "hitmarks", "");
            } else {
                var37++;
            }
            if (Statics.field184 == null) {
                Statics.field184 = class70.method1426(Statics.field709, "headicons_pk", "");
            } else {
                var37++;
            }
            if (Statics.field2703 == null) {
                Statics.field2703 = class70.method1426(Statics.field709, "headicons_prayer", "");
            } else {
                var37++;
            }
            if (Statics.field2033 == null) {
                Statics.field2033 = class70.method1426(Statics.field709, "headicons_hint", "");
            } else {
                var37++;
            }
            if (Statics.field26 == null) {
                Statics.field26 = class70.method1426(Statics.field709, "mapmarker", "");
            } else {
                var37++;
            }
            if (Statics.field1243 == null) {
                Statics.field1243 = class70.method1426(Statics.field709, "cross", "");
            } else {
                var37++;
            }
            if (Statics.field68 == null) {
                Statics.field68 = class70.method1426(Statics.field709, "mapdots", "");
            } else {
                var37++;
            }
            if (Statics.field702 == null) {
                Statics.field702 = class70.method2023(Statics.field709, "scrollbar", "");
            } else {
                var37++;
            }
            if (Statics.field107 == null) {
                Statics.field107 = class70.method2023(Statics.field709, "mod_icons", "");
            } else {
                var37++;
            }
            if (Statics.field185 == null) {
                Statics.field185 = class70.method1939(Statics.field709, "mapback", "");
            } else {
                var37++;
            }
            if (var37 < 14) {
                class28.field678 = class143.field2364 + var37 * 100 / 14 + "%";
                class28.field682 = 70;
            } else {
                Statics.field2918 = Statics.field107;
                Statics.field1498.method1470();
                int var46 = (int) (Math.random() * 21.0D) - 10;
                int var47 = (int) (Math.random() * 21.0D) - 10;
                int var48 = (int) (Math.random() * 21.0D) - 10;
                int var49 = (int) (Math.random() * 41.0D) - 20;
                for (int var50 = 0; var50 < Statics.field564.length; var50++) {
                    Statics.field564[var50].method1469(var46 + var49, var47 + var49, var48 + var49);
                }
                Statics.field977[0].method1620(var46 + var49, var47 + var49, var48 + var49);
                Statics.field1868 = new int[33];
                Statics.field1534 = new int[33];
                Statics.field837 = new int[151];
                Statics.field24 = new int[151];
                for (int var51 = 0; var51 < 33; var51++) {
                    int var52 = 999;
                    int var53 = 0;
                    for (int var54 = 0; var54 < 34; var54++) {
                        if (Statics.field185.field1325[Statics.field185.field1329 * var51 + var54] == 0) {
                            if (var52 == 999) {
                                var52 = var54;
                            }
                        } else if (var52 != 999) {
                            var53 = var54;
                            break;
                        }
                    }
                    Statics.field1868[var51] = var52;
                    Statics.field1534[var51] = var53 - var52;
                }
                for (int var55 = 5; var55 < 156; var55++) {
                    int var56 = 999;
                    int var57 = 0;
                    for (int var58 = 25; var58 < 172; var58++) {
                        if (Statics.field185.field1325[Statics.field185.field1329 * var55 + var58] == 0 && var58 > 34 || var55 > 34) {
                            if (var56 == 999) {
                                var56 = var58;
                            }
                        } else if (var56 != 999) {
                            var57 = var58;
                            break;
                        }
                    }
                    Statics.field837[var55 - 5] = var56 - 25;
                    Statics.field24[var55 - 5] = var57 - var56;
                }
                class28.field678 = class143.field2172;
                class28.field682 = 70;
                field427 = 90;
            }
        } else if (field427 == 90) {
            if (Statics.field1807.method2825()) {
                class88 var59 = new class88(Statics.field1807, Statics.field709, 20, 0.8D, field459 ? 64 : 128);
                class84.method1898(var59);
                class84.method1840(0.8D);
                class28.field678 = class143.field2174;
                class28.field682 = 90;
                field427 = 110;
            } else {
                class28.field678 = class143.field2173 + Statics.field1807.method2867() + "%";
                class28.field682 = 90;
            }
        } else if (field427 == 110) {
            Statics.field266 = new class12();
            Statics.field2680.method2546(Statics.field266, 10);
            class28.field678 = class143.field2354;
            class28.field682 = 94;
            field427 = 120;
        } else if (field427 == 120) {
            if (Statics.field1052.method2837("huffman", "")) {
                class102 var60 = new class102(Statics.field1052.method2803("huffman", ""));
                Statics.field2905 = var60;
                class28.field678 = class143.field2177;
                class28.field682 = 96;
                field427 = 130;
            } else {
                class28.field678 = class143.field2280 + "%";
                class28.field682 = 96;
            }
        } else if (field427 == 130) {
            if (!Statics.field2128.method2825()) {
                class28.field678 = class143.field2169 + Statics.field2128.method2867() * 4 / 5 + "%";
                class28.field682 = 100;
            } else if (!Statics.field1818.method2825()) {
                class28.field678 = class143.field2169 + (80 + Statics.field1818.method2867() / 6) + "%";
                class28.field682 = 100;
            } else if (Statics.field799.method2825()) {
                class28.field678 = class143.field2179;
                class28.field682 = 100;
                field427 = 140;
            } else {
                class28.field678 = class143.field2169 + (96 + Statics.field799.method2867() / 20) + "%";
                class28.field682 = 100;
            }
        } else if (field427 == 140) {
            method2490(10);
        }
    }

    @ObfuscatedName("dx.b(IZZZI)Lek;")
    public static class148 method2471(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2081 != null) {
            var4 = new class121(arg0, class136.field2081, Statics.field1496[arg0], 1000000);
        }
        return new class148(var4, Statics.field1452, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cb.z(I)V")
    public static final void method1934() {
        try {
            if (field289 == 0) {
                if (Statics.field1109 != null) {
                    Statics.field1109.method2648();
                    Statics.field1109 = null;
                }
                Statics.field2489 = null;
                field308 = false;
                field404 = 0;
                field289 = 1;
            }
            if (field289 == 1) {
                if (Statics.field2489 == null) {
                    Statics.field2489 = Statics.field2680.method2528(Statics.field612, Statics.field603);
                }
                if (Statics.field2489.field2053 == 2) {
                    throw new IOException();
                }
                if (Statics.field2489.field2053 == 1) {
                    Statics.field1109 = new class130((Socket) Statics.field2489.field2055, Statics.field2680);
                    Statics.field2489 = null;
                    field289 = 2;
                }
            }
            if (field289 == 2) {
                field297.field1837 = 0;
                field297.method2159(14);
                Statics.field1109.method2636(field297.field1838, 0, 1);
                field299.field1837 = 0;
                field289 = 3;
            }
            if (field289 == 3) {
                if (Statics.field1515 != null) {
                    Statics.field1515.method1041();
                }
                if (Statics.field691 != null) {
                    Statics.field691.method1041();
                }
                int var0 = Statics.field1109.method2633();
                if (Statics.field1515 != null) {
                    Statics.field1515.method1041();
                }
                if (Statics.field691 != null) {
                    Statics.field691.method1041();
                }
                if (var0 != 0) {
                    method2436(var0);
                    return;
                }
                field299.field1837 = 0;
                field289 = 5;
            }
            if (field289 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field297.field1837 = 0;
                field297.method2159(1);
                field297.method2159(class28.field679.method489());
                field297.method2162(var1[0]);
                field297.method2162(var1[1]);
                field297.method2162(var1[2]);
                field297.method2162(var1[3]);
                switch(class28.field679.field2408) {
                    case 0:
                        field297.method2162((Integer) Statics.field813.field147.get(class200.method2025(class28.field669)));
                        field297.field1837 += 4;
                        break;
                    case 1:
                    case 3:
                        field297.method2161(Statics.field131);
                        field297.field1837 += 5;
                        break;
                    case 2:
                        field297.field1837 += 8;
                }
                field297.method2199(class28.field671);
                field297.method2303(class5.field69, class5.field67);
                field298.field1837 = 0;
                if (field398 == 40) {
                    field298.method2159(18);
                } else {
                    field298.method2159(16);
                }
                field298.method2364(0);
                int var2 = field298.field1837;
                field298.method2162(61);
                field298.method2160(field297.field1838, 0, field297.field1837);
                int var3 = field298.field1837;
                field298.method2199(class28.field669);
                field298.method2159(field459 ? 1 : 0);
                class136.method2581(field298);
                class107 var4 = new class107(Statics.field1497.method2774());
                Statics.field1497.method2773(var4);
                field298.method2160(var4.field1838, 0, var4.field1838.length);
                field298.method2162(Statics.field238.field2460);
                field298.method2162(Statics.field286.field2460);
                field298.method2162(Statics.field1901.field2460);
                field298.method2162(Statics.field2128.field2460);
                field298.method2162(Statics.field1084.field2460);
                field298.method2162(Statics.field29.field2460);
                field298.method2162(Statics.field195.field2460);
                field298.method2162(Statics.field117.field2460);
                field298.method2162(Statics.field709.field2460);
                field298.method2162(Statics.field1807.field2460);
                field298.method2162(Statics.field1052.field2460);
                field298.method2162(Statics.field223.field2460);
                field298.method2162(Statics.field1818.field2460);
                field298.method2162(Statics.field799.field2460);
                field298.method2162(Statics.field1955.field2460);
                field298.method2162(Statics.field368.field2460);
                field298.method2189(var1, var3, field298.field1837);
                field298.method2169(field298.field1837 - var2);
                Statics.field1109.method2636(field298.field1838, 0, field298.field1837);
                field297.method2407(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field299.method2407(var1);
                field289 = 6;
            }
            if (field289 == 6 && Statics.field1109.method2637() > 0) {
                int var6 = Statics.field1109.method2633();
                if (var6 == 21 && field398 == 20) {
                    field289 = 7;
                } else if (var6 == 2) {
                    field289 = 9;
                } else if (var6 == 15 && field398 == 40) {
                    field297.field1837 = 0;
                    field299.field1837 = 0;
                    field265 = -1;
                    field392 = -1;
                    field267 = -1;
                    field462 = -1;
                    field394 = 0;
                    field348 = 0;
                    field272 = 0;
                    field401 = 0;
                    field400 = false;
                    field490 = 0;
                    field487 = 0;
                    for (int var7 = 0; var7 < field333.length; var7++) {
                        if (field333[var7] != null) {
                            field333[var7].field739 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field410.length; var8++) {
                        if (field410[var8] != null) {
                            field410[var8].field739 = -1;
                        }
                    }
                    class14.method2766();
                    method2490(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field463[var9] = true;
                    }
                    return;
                } else if (var6 == 23 && field291 < 1) {
                    field291++;
                    field289 = 0;
                } else {
                    method2436(var6);
                    return;
                }
            }
            if (field289 == 7 && Statics.field1109.method2637() > 0) {
                field292 = (Statics.field1109.method2633() + 3) * 60;
                field289 = 8;
            }
            if (field289 == 8) {
                field404 = 0;
                class28.method2107(class143.field2373, class143.field2301, field292 / 60 + class143.field2185);
                if (--field292 <= 0) {
                    field289 = 0;
                }
            } else {
                if (field289 == 9 && Statics.field1109.method2637() >= 13) {
                    boolean var10 = Statics.field1109.method2633() == 1;
                    Statics.field1109.method2635(field299.field1838, 0, 4);
                    field299.field1837 = 0;
                    boolean var11 = false;
                    if (var10) {
                        int var12 = field299.method2428() << 24;
                        int var13 = var12 | field299.method2428() << 16;
                        int var14 = var13 | field299.method2428() << 8;
                        int var15 = var14 | field299.method2428();
                        int var16 = class200.method2025(class28.field669);
                        if (Statics.field813.field147.size() >= 10 && !Statics.field813.field147.containsKey(var16)) {
                            Iterator var17 = Statics.field813.field147.entrySet().iterator();
                            var17.next();
                            var17.remove();
                        }
                        Statics.field813.field147.put(var16, var15);
                        class9.method2015();
                    }
                    field426 = Statics.field1109.method2633();
                    field519 = Statics.field1109.method2633() == 1;
                    field382 = Statics.field1109.method2633();
                    field382 <<= 0x8;
                    field382 += Statics.field1109.method2633();
                    field383 = Statics.field1109.method2633();
                    Statics.field1109.method2635(field299.field1838, 0, 1);
                    field299.field1837 = 0;
                    field265 = field299.method2428();
                    Statics.field1109.method2635(field299.field1838, 0, 2);
                    field299.field1837 = 0;
                    field394 = field299.method2175();
                    if (field383 == 1) {
                        try {
                            client var18 = Statics.field254;
                            JSObject.getWindow(var18).call("zap", (Object[]) null);
                        } catch (Throwable var23) {
                        }
                    } else {
                        try {
                            class119.method2497(Statics.field254, "unzap");
                        } catch (Throwable var22) {
                        }
                    }
                    field289 = 10;
                }
                if (field289 != 10) {
                    field404++;
                    if (field404 > 2000) {
                        if (field291 < 1) {
                            if (Statics.field603 == Statics.field59) {
                                Statics.field603 = Statics.field1884;
                            } else {
                                Statics.field603 = Statics.field59;
                            }
                            field291++;
                            field289 = 0;
                        } else {
                            method2436(-3);
                        }
                    }
                } else if (Statics.field1109.method2637() >= field394) {
                    field299.field1837 = 0;
                    Statics.field1109.method2635(field299.field1838, 0, field394);
                    method544();
                    Statics.field71 = -1;
                    method2948(false);
                    field265 = -1;
                }
            }
        } catch (IOException var24) {
            if (field291 < 1) {
                if (Statics.field603 == Statics.field59) {
                    Statics.field603 = Statics.field1884;
                } else {
                    Statics.field603 = Statics.field59;
                }
                field291++;
                field289 = 0;
            } else {
                method2436(-2);
            }
        }
    }

    @ObfuscatedName("f.l(I)V")
    public static void method544() {
        field355 = -1L;
        field501 = -1;
        Statics.field266.field187 = 0;
        Statics.field550 = true;
        field270 = true;
        field417 = -1L;
        class190.field2892 = new class181();
        field297.field1837 = 0;
        field299.field1837 = 0;
        field265 = -1;
        field392 = -1;
        field267 = -1;
        field462 = -1;
        field348 = 0;
        field272 = 0;
        field389 = 0;
        field273 = 0;
        field401 = 0;
        field400 = false;
        class127.field1996 = 0;
        class10.method38();
        field506 = 0;
        field302 = false;
        field496 = 0;
        field505 = (int) (Math.random() * 100.0D) - 50;
        field322 = (int) (Math.random() * 110.0D) - 55;
        field324 = (int) (Math.random() * 80.0D) - 40;
        field387 = (int) (Math.random() * 120.0D) - 60;
        field329 = (int) (Math.random() * 30.0D) - 20;
        field396 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field490 = 0;
        field482 = -1;
        field487 = 0;
        field309 = 0;
        field282 = class18.field520;
        field377 = 0;
        field294 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field333[var0] = null;
            field315[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field410[var1] = null;
        }
        Statics.field1248 = field333[2047] = new class3();
        field391 = -1;
        field477.method3292();
        field311.method3292();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field470[var2][var3][var4] = null;
                }
            }
        }
        field393 = new class178();
        field509 = 0;
        field269 = 0;
        field512 = 0;
        for (int var5 = 0; var5 < Statics.field1054; var5++) {
            class46 var6 = class46.method707(var5);
            if (var6 != null) {
                class155.field2663[var5] = 0;
                class155.field2662[var5] = 0;
            }
        }
        for (int var7 = 0; var7 < field287.length; var7++) {
            field287[var7] = -1;
        }
        field268 = -1;
        if (field350 != -1) {
            int var8 = field350;
            if (var8 != -1 && Statics.field2529[var8]) {
                Statics.field2602.method2798(var8);
                if (Statics.field2572[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field2572[var8].length; var10++) {
                        if (Statics.field2572[var8][var10] != null) {
                            if (Statics.field2572[var8][var10].field2542 == 2) {
                                var9 = false;
                            } else {
                                Statics.field2572[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field2572[var8] = null;
                    }
                    Statics.field2529[var8] = false;
                }
            }
        }
        for (class4 var11 = (class4) field420.method3277(); var11 != null; var11 = (class4) field420.method3267()) {
            method2754(var11, true);
        }
        field350 = -1;
        field420 = new class175(8);
        field423 = null;
        field400 = false;
        field401 = 0;
        field305.method2969((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field479[var12] = null;
            field421[var12] = false;
        }
        class14.method2766();
        field263 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field463[var13] = true;
        }
        field480 = null;
        Statics.field1290 = 0;
        Statics.field1015 = null;
    }

    @ObfuscatedName("dc.t(IS)V")
    public static void method2436(int arg0) {
        if (arg0 == -3) {
            class28.method2107(class143.field2186, class143.field2383, class143.field2224);
        } else if (arg0 == -2) {
            class28.method2107(class143.field2189, class143.field2190, class143.field2240);
        } else if (arg0 == -1) {
            class28.method2107(class143.field2330, class143.field2193, class143.field2194);
        } else if (arg0 == 3) {
            class28.method2107(class143.field2195, class143.field2196, class143.field2220);
        } else if (arg0 == 4) {
            class28.method2107(class143.field2198, class143.field2170, class143.field2200);
        } else if (arg0 == 5) {
            class28.method2107(class143.field2213, class143.field2199, class143.field2203);
        } else if (arg0 == 6) {
            class28.method2107(class143.field2204, class143.field2205, class143.field2206);
        } else if (arg0 == 7) {
            class28.method2107(class143.field2223, class143.field2208, class143.field2281);
        } else if (arg0 == 8) {
            class28.method2107(class143.field2202, class143.field2211, class143.field2212);
        } else if (arg0 == 9) {
            class28.method2107(class143.field2176, class143.field2214, class143.field2215);
        } else if (arg0 == 10) {
            class28.method2107(class143.field2216, class143.field2163, class143.field2218);
        } else if (arg0 == 11) {
            class28.method2107(class143.field2219, class143.field2263, class143.field2221);
        } else if (arg0 == 12) {
            class28.method2107(class143.field2222, class143.field2175, class143.field2253);
        } else if (arg0 == 13) {
            class28.method2107(class143.field2225, class143.field2226, class143.field2209);
        } else if (arg0 == 14) {
            class28.method2107(class143.field2228, class143.field2229, class143.field2230);
        } else if (arg0 == 16) {
            class28.method2107(class143.field2231, class143.field2232, class143.field2233);
        } else if (arg0 == 17) {
            class28.method2107(class143.field2234, class143.field2235, class143.field2236);
        } else if (arg0 == 18) {
            class28.method2107(class143.field2201, class143.field2238, class143.field2239);
        } else if (arg0 == 19) {
            class28.method2107(class143.field2192, class143.field2241, class143.field2242);
        } else if (arg0 == 20) {
            class28.method2107(class143.field2243, class143.field2384, class143.field2244);
        } else if (arg0 == 22) {
            class28.method2107(class143.field2314, class143.field2166, class143.field2248);
        } else if (arg0 == 23) {
            class28.method2107(class143.field2249, class143.field2250, class143.field2251);
        } else if (arg0 == 24) {
            class28.method2107(class143.field2252, class143.field2164, class143.field2254);
        } else if (arg0 == 25) {
            class28.method2107(class143.field2255, class143.field2276, class143.field2267);
        } else if (arg0 == 26) {
            class28.method2107(class143.field2258, class143.field2259, class143.field2260);
        } else if (arg0 == 27) {
            class28.method2107(class143.field2286, class143.field2262, class143.field2188);
        } else if (arg0 == 31) {
            class28.method2107(class143.field2270, class143.field2271, class143.field2272);
        } else if (arg0 == 32) {
            class28.method2107(class143.field2155, class143.field2183, class143.field2275);
        } else if (arg0 == 37) {
            class28.method2107(class143.field2358, class143.field2277, class143.field2278);
        } else if (arg0 == 38) {
            class28.method2107(class143.field2279, class143.field2320, class143.field2395);
        } else if (arg0 == 55) {
            class28.method2107(class143.field2178, class143.field2283, class143.field2318);
        } else if (arg0 == 56) {
            class28.method2107(class143.field2285, class143.field2293, class143.field2287);
            method2490(11);
            return;
        } else if (arg0 == 57) {
            class28.method2107(class143.field2288, class143.field2289, class143.field2290);
            method2490(11);
            return;
        } else {
            class28.method2107(class143.field2376, class143.field2388, class143.field2274);
        }
        method2490(10);
    }

    @ObfuscatedName("di.q(I)V")
    public static final void method2473() {
        if (Statics.field1109 != null) {
            Statics.field1109.method2648();
            Statics.field1109 = null;
        }
        method2();
        Statics.field2687.method1654();
        for (int var0 = 0; var0 < 4; var0++) {
            field500[var0].method3547();
        }
        System.gc();
        class162.field2720 = 1;
        Statics.field1897 = null;
        Statics.field1890 = -1;
        Statics.field2413 = -1;
        Statics.field74 = 0;
        Statics.field1873 = false;
        Statics.field1432 = 2;
        field492 = -1;
        field493 = false;
        for (class20 var1 = (class20) class20.field540.method3303(); var1 != null; var1 = (class20) class20.field540.method3300()) {
            if (var1.field546 != null) {
                Statics.field2468.method1037(var1.field546);
                var1.field546 = null;
            }
            if (var1.field553 != null) {
                Statics.field2468.method1037(var1.field553);
                var1.field553 = null;
            }
        }
        class20.field540.method3292();
        method2490(10);
    }

    @ObfuscatedName("p.j(I)V")
    public static final void method2() {
        class41.field955.method3227();
        class37.method3386();
        class40.method629();
        class36.method729();
        class35.field802.method3227();
        class35.field803.method3227();
        class45.field1024.method3227();
        class45.field1040.method3227();
        class45.field1041.method3227();
        class38.field916.method3227();
        class38.field914.method3227();
        class39.method659();
        class42.field973.method3227();
        class46.method156();
        class158.method1460();
        class153.field2533.method3227();
        class153.field2534.method3227();
        class153.field2565.method3227();
        ((class88) Statics.field1486).method1930();
        class19.field532.method3227();
        Statics.field238.method2831();
        Statics.field286.method2831();
        Statics.field2128.method2831();
        Statics.field1084.method2831();
        Statics.field29.method2831();
        Statics.field195.method2831();
        Statics.field117.method2831();
        Statics.field709.method2831();
        Statics.field1807.method2831();
        Statics.field1052.method2831();
        Statics.field223.method2831();
        Statics.field1818.method2831();
    }

    @ObfuscatedName("ar.o(B)V")
    public static final void method954() {
        if (field272 > 1) {
            field272--;
        }
        if (field389 > 0) {
            field389--;
        }
        if (field308) {
            field308 = false;
            if (field389 > 0) {
                method2473();
            } else {
                method2490(40);
                Statics.field296 = Statics.field1109;
                Statics.field1109 = null;
            }
            return;
        }
        if (!field400) {
            field406[0] = class143.field2369;
            field407[0] = "";
            field508[0] = 1006;
            field401 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field1109 == null) {
                var1 = false;
            } else {
                label2884: {
                    try {
                        int var2 = Statics.field1109.method2637();
                        if (var2 == 0) {
                            var1 = false;
                            break label2884;
                        }
                        if (field265 == -1) {
                            Statics.field1109.method2635(field299.field1838, 0, 1);
                            field299.field1837 = 0;
                            field265 = field299.method2428();
                            field394 = class167.field2801[field265];
                            var2--;
                        }
                        if (field394 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2884;
                            }
                            Statics.field1109.method2635(field299.field1838, 0, 1);
                            field394 = field299.field1838[0] & 0xFF;
                            var2--;
                        }
                        if (field394 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2884;
                            }
                            Statics.field1109.method2635(field299.field1838, 0, 2);
                            field299.field1837 = 0;
                            field394 = field299.method2175();
                            var2 -= 2;
                        }
                        if (var2 < field394) {
                            var1 = false;
                            break label2884;
                        }
                        field299.field1837 = 0;
                        Statics.field1109.method2635(field299.field1838, 0, field394);
                        field348 = 0;
                        field462 = field267;
                        field267 = field392;
                        field392 = field265;
                        if (field265 == 89) {
                            while (field299.field1837 < field394) {
                                boolean var3 = field299.method2173() == 1;
                                String var4 = field299.method2351();
                                String var5 = field299.method2351();
                                int var6 = field299.method2175();
                                int var7 = field299.method2173();
                                int var8 = field299.method2173();
                                boolean var9 = (var8 & 0x2) != 0;
                                boolean var10 = (var8 & 0x1) != 0;
                                if (var6 > 0) {
                                    field299.method2351();
                                    field299.method2173();
                                    field299.method2305();
                                }
                                field299.method2351();
                                for (int var11 = 0; var11 < field269; var11++) {
                                    class16 var12 = field510[var11];
                                    if (var3) {
                                        if (var5.equals(var12.field232)) {
                                            var12.field232 = var4;
                                            var12.field230 = var5;
                                            var4 = null;
                                            break;
                                        }
                                    } else if (var4.equals(var12.field232)) {
                                        if (var12.field236 != var6) {
                                            boolean var13 = true;
                                            for (class34 var14 = (class34) field511.method3253(); var14 != null; var14 = (class34) field511.method3261()) {
                                                if (var14.field790.equals(var4)) {
                                                    if (var6 != 0 && var14.field791 == 0) {
                                                        var14.method3374();
                                                        var13 = false;
                                                    } else if (var6 == 0 && var14.field791 != 0) {
                                                        var14.method3374();
                                                        var13 = false;
                                                    }
                                                }
                                            }
                                            if (var13) {
                                                field511.method3252(new class34(var4, var6));
                                            }
                                            var12.field236 = var6;
                                        }
                                        var12.field230 = var5;
                                        var12.field237 = var7;
                                        var12.field233 = var9;
                                        var12.field234 = var10;
                                        var4 = null;
                                        break;
                                    }
                                }
                                if (var4 != null && field269 < 400) {
                                    class16 var15 = new class16();
                                    field510[field269] = var15;
                                    var15.field232 = var4;
                                    var15.field230 = var5;
                                    var15.field236 = var6;
                                    var15.field237 = var7;
                                    var15.field233 = var9;
                                    var15.field234 = var10;
                                    field269++;
                                }
                            }
                            field509 = 2;
                            field451 = field443;
                            boolean var16 = false;
                            int var17 = field269;
                            while (var17 > 0) {
                                boolean var18 = true;
                                var17--;
                                for (int var19 = 0; var19 < var17; var19++) {
                                    boolean var20 = false;
                                    class16 var21 = field510[var19];
                                    class16 var22 = field510[var19 + 1];
                                    if (field320 != var21.field236 && field320 == var22.field236) {
                                        var20 = true;
                                    }
                                    if (!var20 && var21.field236 == 0 && var22.field236 != 0) {
                                        var20 = true;
                                    }
                                    if (!var20 && !var21.field233 && var22.field233) {
                                        var20 = true;
                                    }
                                    if (!var20 && !var21.field234 && var22.field234) {
                                        var20 = true;
                                    }
                                    if (var20) {
                                        class16 var23 = field510[var19];
                                        field510[var19] = field510[var19 + 1];
                                        field510[var19 + 1] = var23;
                                        var18 = false;
                                    }
                                }
                                if (var18) {
                                    break;
                                }
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 31) {
                            method135();
                            int var24 = field299.method2187();
                            int var25 = field299.method2305();
                            int var26 = field299.method2187();
                            field323[var26] = var25;
                            field381[var26] = var24;
                            field397[var26] = 1;
                            for (int var27 = 0; var27 < 98; var27++) {
                                if (var25 >= class141.field2131[var27]) {
                                    field397[var26] = var27 + 2;
                                }
                            }
                            field448[++field449 - 1 & 0x1F] = var26;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 119) {
                            int var28 = field299.method2305();
                            boolean var29 = field299.method2220() == 1;
                            class153 var30 = class153.method2577(var28);
                            if (var30.field2550 != var29) {
                                var30.field2550 = var29;
                                method45(var30);
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 204) {
                            int var31 = field299.method2205();
                            if (var31 == 65535) {
                                var31 = -1;
                            }
                            int var32 = field299.method2214();
                            int var33 = field299.method2196();
                            class153 var34 = class153.method2577(var32);
                            if (var34.field2537) {
                                var34.field2642 = var31;
                                var34.field2643 = var33;
                                class45 var36 = class45.method588(var31);
                                var34.field2578 = var36.field1018;
                                var34.field2548 = var36.field1019;
                                var34.field2576 = var36.field1020;
                                var34.field2541 = var36.field1021;
                                var34.field2577 = var36.field1022;
                                var34.field2613 = var36.field1008;
                                if (var34.field2547 > 0) {
                                    var34.field2613 = var34.field2613 * 32 / var34.field2547;
                                }
                                method45(var34);
                            } else {
                                if (var31 == -1) {
                                    var34.field2570 = 0;
                                    field265 = -1;
                                    var1 = true;
                                    break label2884;
                                }
                                class45 var35 = class45.method588(var31);
                                var34.field2570 = 4;
                                var34.field2555 = var31;
                                var34.field2578 = var35.field1018;
                                var34.field2548 = var35.field1019;
                                var34.field2613 = var35.field1008 * 100 / var33;
                                method45(var34);
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 51) {
                            int var37 = field299.method2214();
                            int var38 = field299.method2175();
                            class153 var39 = class153.method2577(var37);
                            if (var39.field2570 != 2 || var39.field2555 != var38) {
                                var39.field2570 = 2;
                                var39.field2555 = var38;
                                method45(var39);
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 128) {
                            field502 = false;
                            for (int var40 = 0; var40 < 5; var40++) {
                                field503[var40] = false;
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 106) {
                            int var41 = field299.method2213();
                            int var42 = field299.method2205();
                            if (var42 == 65535) {
                                var42 = -1;
                            }
                            int var43 = field299.method2305();
                            int var44 = field299.method2205();
                            if (var44 == 65535) {
                                var44 = -1;
                            }
                            for (int var45 = var42; var45 <= var44; var45++) {
                                long var46 = ((long) var43 << 32) + (long) var45;
                                class187 var48 = field460.method3263(var46);
                                if (var48 != null) {
                                    var48.method3378();
                                }
                                field460.method3264(new class180(var41), var46);
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 168) {
                            field502 = true;
                            Statics.field2411 = field299.method2173();
                            Statics.field1813 = field299.method2173();
                            Statics.field2403 = field299.method2175();
                            Statics.field1461 = field299.method2173();
                            Statics.field239 = field299.method2173();
                            if (Statics.field239 >= 100) {
                                int var49 = Statics.field2411 * 128 + 64;
                                int var50 = Statics.field1813 * 128 + 64;
                                int var51 = method124(var49, var50, Statics.field243) - Statics.field2403;
                                int var52 = var49 - Statics.field1457;
                                int var53 = var51 - Statics.field1354;
                                int var54 = var50 - Statics.field283;
                                int var55 = (int) Math.sqrt((double) (var52 * var52 + var54 * var54));
                                Statics.field134 = (int) (Math.atan2((double) var53, (double) var55) * 325.949D) & 0x7FF;
                                Statics.field137 = (int) (Math.atan2((double) var52, (double) var54) * -325.949D) & 0x7FF;
                                if (Statics.field134 < 128) {
                                    Statics.field134 = 128;
                                }
                                if (Statics.field134 > 383) {
                                    Statics.field134 = 383;
                                }
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 80) {
                            int var56 = field299.method2204();
                            int var57 = field299.method2214();
                            int var58 = field299.method2175();
                            int var59 = field299.method2204();
                            class153 var60 = class153.method2577(var57);
                            if (var60.field2578 != var58 || var60.field2548 != var59 || var60.field2613 != var56) {
                                var60.field2578 = var58;
                                var60.field2548 = var59;
                                var60.field2613 = var56;
                                method45(var60);
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 242) {
                            int var61 = field299.method2175();
                            int var62 = field299.method2173();
                            int var63 = field299.method2175();
                            method734(var61, var62, var63);
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 16) {
                            field490 = field299.method2173();
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 164) {
                            int var64 = field299.method2207();
                            int var65 = field299.method2213();
                            class153 var66 = class153.method2577(var65);
                            if (var66.field2574 != var64 || var64 == -1) {
                                var66.field2574 = var64;
                                var66.field2580 = 0;
                                var66.field2645 = 0;
                                method45(var66);
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 218) {
                            int var67 = field299.method2205();
                            field350 = var67;
                            method1368(var67);
                            class32.method1643(field350);
                            for (int var68 = 0; var68 < 100; var68++) {
                                field463[var68] = true;
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 220) {
                            if (field350 != -1) {
                                int var69 = field350;
                                if (class153.method487(var69)) {
                                    method552(Statics.field2572[var69], 0);
                                }
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 253) {
                            int var70 = field299.method2298();
                            class14 var71 = (class14) class14.field198.method3263((long) var70);
                            if (var71 != null) {
                                var71.method3378();
                            }
                            field446[++field447 - 1 & 0x1F] = var70 & 0x7FFF;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 176) {
                            for (int var72 = 0; var72 < class155.field2662.length; var72++) {
                                if (class155.field2663[var72] != class155.field2662[var72]) {
                                    class155.field2662[var72] = class155.field2663[var72];
                                    method590(var72);
                                    field444[++field376 - 1 & 0x1F] = var72;
                                }
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 45) {
                            field509 = 1;
                            field451 = field443;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 39) {
                            int var73 = field299.method2175();
                            int var74 = field299.method2214();
                            class153 var75 = class153.method2577(var74);
                            if (var75 != null && var75.field2542 == 0) {
                                if (var73 > var75.field2530 - var75.field2648) {
                                    var73 = var75.field2530 - var75.field2648;
                                }
                                if (var73 < 0) {
                                    var73 = 0;
                                }
                                if (var75.field2552 != var73) {
                                    var75.field2552 = var73;
                                    method45(var75);
                                }
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 120) {
                            field299.field1837 += 28;
                            if (field299.method2221()) {
                                class136.method1918(field299, field299.field1837 - 28);
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 161) {
                            int var76 = field299.method2204();
                            byte var77 = field299.method2283();
                            class155.field2663[var76] = var77;
                            if (class155.field2662[var76] != var77) {
                                class155.field2662[var76] = var77;
                                method590(var76);
                            }
                            field444[++field376 - 1 & 0x1F] = var76;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 86) {
                            int var78 = field299.method2173();
                            int var79 = field299.method2173();
                            int var80 = field299.method2173();
                            int var81 = field299.method2173();
                            field503[var78] = true;
                            field471[var78] = var79;
                            field306[var78] = var80;
                            field276[var78] = var81;
                            field507[var78] = 0;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 1) {
                            int var82 = field299.method2186();
                            boolean var83 = field299.method2173() == 1;
                            String var84 = "";
                            boolean var85 = false;
                            if (var83) {
                                var84 = field299.method2351();
                                if (method514(var84)) {
                                    var85 = true;
                                }
                            }
                            String var86 = field299.method2351();
                            if (!var85) {
                                class10.method849(var82, var84, var86);
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 11) {
                            field487 = field299.method2173();
                            if (field487 == 255) {
                                field487 = 0;
                            }
                            field309 = field299.method2173();
                            if (field309 == 255) {
                                field309 = 0;
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 152) {
                            int var87 = field299.method2196();
                            Statics.field8 = Statics.field2680.method2547(var87);
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 82) {
                            String var88 = field299.method2351();
                            long var89 = (long) field299.method2175();
                            long var91 = (long) field299.method2329();
                            class138 var93 = (class138) class99.method496(class138.method107(), field299.method2173());
                            long var94 = (var89 << 32) + var91;
                            boolean var96 = false;
                            for (int var97 = 0; var97 < 100; var97++) {
                                if (field474[var97] == var94) {
                                    var96 = true;
                                    break;
                                }
                            }
                            if (method514(var88)) {
                                var96 = true;
                            }
                            if (!var96 && field483 == 0) {
                                field474[field312] = var94;
                                field312 = (field312 + 1) % 100;
                                class110 var98 = field299;
                                String var102;
                                try {
                                    int var99 = var98.method2186();
                                    if (var99 > 32767) {
                                        var99 = 32767;
                                    }
                                    byte[] var100 = new byte[var99];
                                    var98.field1837 += Statics.field2905.method2104(var98.field1838, var98.field1837, var100, 0, var99);
                                    String var101 = class202.method3084(var100, 0, var99);
                                    var102 = var101;
                                } catch (Exception var439) {
                                    var102 = "Cabbage";
                                }
                                String var105 = class193.method3405(class200.method540(var102));
                                byte var106;
                                if (var93.field2095) {
                                    var106 = 7;
                                } else {
                                    var106 = 3;
                                }
                                if (var93.field2103 == -1) {
                                    class10.method849(var106, var88, var105);
                                } else {
                                    class10.method849(var106, class2.method3385(var93.field2103) + var88, var105);
                                }
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 36) {
                            field272 = field299.method2175() * 30;
                            field453 = field443;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 223) {
                            Statics.field66 = field299.method2173();
                            Statics.field207 = field299.method2220();
                            for (int var107 = Statics.field66; var107 < Statics.field66 + 8; var107++) {
                                for (int var108 = Statics.field207; var108 < Statics.field207 + 8; var108++) {
                                    if (field470[Statics.field243][var107][var108] != null) {
                                        field470[Statics.field243][var107][var108] = null;
                                        method127(var107, var108);
                                    }
                                }
                            }
                            for (class15 var109 = (class15) field393.method3303(); var109 != null; var109 = (class15) field393.method3300()) {
                                if (var109.field208 >= Statics.field66 && var109.field208 < Statics.field66 + 8 && var109.field211 >= Statics.field207 && var109.field211 < Statics.field207 + 8 && Statics.field243 == var109.field225) {
                                    var109.field222 = 0;
                                }
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 84) {
                            int var110 = field394 + field299.field1837;
                            int var111 = field299.method2175();
                            int var112 = field299.method2175();
                            if (field350 != var111) {
                                field350 = var111;
                                method1368(field350);
                                class32.method1643(field350);
                                for (int var113 = 0; var113 < 100; var113++) {
                                    field463[var113] = true;
                                }
                            }
                            while (var112-- > 0) {
                                int var114 = field299.method2305();
                                int var115 = field299.method2175();
                                int var116 = field299.method2173();
                                class4 var117 = (class4) field420.method3263((long) var114);
                                if (var117 != null && var117.field63 != var115) {
                                    method2754(var117, true);
                                    var117 = null;
                                }
                                if (var117 == null) {
                                    class4 var118 = new class4();
                                    var118.field63 = var115;
                                    var118.field62 = var116;
                                    field420.method3264(var118, (long) var114);
                                    method1368(var115);
                                    class32.method1643(var115);
                                    class153 var119 = class153.method2577(var114);
                                    if (var119 != null) {
                                        method45(var119);
                                    }
                                    if (field423 != null) {
                                        method45(field423);
                                        field423 = null;
                                    }
                                    method3204();
                                    if (field350 != -1) {
                                        int var120 = field350;
                                        if (class153.method487(var120)) {
                                            method552(Statics.field2572[var120], 1);
                                        }
                                    }
                                    var117 = var118;
                                }
                                var117.field57 = true;
                            }
                            for (class4 var122 = (class4) field420.method3277(); var122 != null; var122 = (class4) field420.method3267()) {
                                if (var122.field57) {
                                    var122.field57 = false;
                                } else {
                                    method2754(var122, true);
                                }
                            }
                            field460 = new class175(512);
                            while (field299.field1837 < var110) {
                                int var123 = field299.method2305();
                                int var124 = field299.method2175();
                                int var125 = field299.method2175();
                                int var126 = field299.method2305();
                                for (int var127 = var124; var127 <= var125; var127++) {
                                    long var128 = ((long) var123 << 32) + (long) var127;
                                    field460.method3264(new class180(var126), var128);
                                }
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 211) {
                            int var130 = field299.method2173();
                            class117[] var131 = new class117[] { class117.field1895, class117.field1894, class117.field1896 };
                            class117[] var132 = var131;
                            int var133 = 0;
                            class117 var135;
                            while (true) {
                                if (var133 >= var132.length) {
                                    var135 = null;
                                    break;
                                }
                                class117 var134 = var132[var133];
                                if (var134.field1893 == var130) {
                                    var135 = var134;
                                    break;
                                }
                                var133++;
                            }
                            Statics.field2451 = var135;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 231) {
                            int var136 = field299.method2305();
                            int var137 = field299.method2204();
                            class155.field2663[var137] = var136;
                            if (class155.field2662[var137] != var136) {
                                class155.field2662[var137] = var136;
                                method590(var137);
                            }
                            field444[++field376 - 1 & 0x1F] = var137;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 54) {
                            int var138 = field299.method2298();
                            int var139 = field299.method2305();
                            int var140 = field299.method2205();
                            class153 var141 = class153.method2577(var139);
                            var141.field2582 = (var140 << 16) + var138;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 101) {
                            int var142 = field299.method2196();
                            class153 var143 = class153.method2577(var142);
                            var143.field2570 = 3;
                            var143.field2555 = Statics.field1248.field47.method2977();
                            method45(var143);
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 2) {
                            int var144 = field299.method2175();
                            if (var144 == 65535) {
                                var144 = -1;
                            }
                            if (var144 == -1 && !field493) {
                                Statics.field697.method3109();
                                class162.field2720 = 1;
                                Statics.field1897 = null;
                            } else if (var144 != -1 && field492 != var144 && field491 != 0 && !field493) {
                                class162.method2769(2, Statics.field195, var144, 0, field491, false);
                            }
                            field492 = var144;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 249) {
                            int var145 = field299.method2329();
                            int var146 = field299.method2204();
                            if (var146 == 65535) {
                                var146 = -1;
                            }
                            if (field491 != 0 && var146 != -1) {
                                class162.method2893(Statics.field223, var146, 0, field491, false);
                                field493 = true;
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 125) {
                            while (field299.field1837 < field394) {
                                int var147 = field299.method2173();
                                boolean var148 = (var147 & 0x1) == 1;
                                String var149 = field299.method2351();
                                String var150 = field299.method2351();
                                field299.method2351();
                                for (int var151 = 0; var151 < field512; var151++) {
                                    class8 var152 = field257[var151];
                                    if (var148) {
                                        if (var150.equals(var152.field130)) {
                                            var152.field130 = var149;
                                            var152.field140 = var150;
                                            var149 = null;
                                            break;
                                        }
                                    } else if (var149.equals(var152.field130)) {
                                        var152.field130 = var149;
                                        var152.field140 = var150;
                                        var149 = null;
                                        break;
                                    }
                                }
                                if (var149 != null && field512 < 400) {
                                    class8 var153 = new class8();
                                    field257[field512] = var153;
                                    var153.field130 = var149;
                                    var153.field140 = var150;
                                    field512++;
                                }
                            }
                            field451 = field443;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 126) {
                            int var154 = field299.method2220();
                            int var155 = field299.method2173();
                            int var156 = field299.method2272();
                            Statics.field243 = var156 >> 1;
                            Statics.field1248.method609(var155, var154, (var156 & 0x1) == 1);
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 234) {
                            int var157 = field299.method2173();
                            int var158 = field299.method2173();
                            String var159 = field299.method2351();
                            if (var157 >= 1 && var157 <= 8) {
                                if (var159.equalsIgnoreCase("null")) {
                                    var159 = null;
                                }
                                field479[var157 - 1] = var159;
                                field421[var157 - 1] = var158 == 0;
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 222) {
                            int var160 = field299.method2205();
                            int var161 = field299.method2305();
                            class153 var162 = class153.method2577(var161);
                            if (var162.field2570 != 1 || var162.field2555 != var160) {
                                var162.field2570 = 1;
                                var162.field2555 = var160;
                                method45(var162);
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 216) {
                            int var163 = field299.method2305();
                            int var164 = field299.method2175();
                            if (var163 < -70000) {
                                var164 += 32768;
                            }
                            class153 var165;
                            if (var163 >= 0) {
                                var165 = class153.method2577(var163);
                            } else {
                                var165 = null;
                            }
                            while (field299.field1837 < field394) {
                                int var166 = field299.method2186();
                                int var167 = field299.method2175();
                                int var168 = 0;
                                if (var167 != 0) {
                                    var168 = field299.method2173();
                                    if (var168 == 255) {
                                        var168 = field299.method2305();
                                    }
                                }
                                if (var165 != null && var166 >= 0 && var166 < var165.field2559.length) {
                                    var165.field2559[var166] = var167;
                                    var165.field2641[var166] = var168;
                                }
                                Statics.method710(var164, var166, var167 - 1, var168);
                            }
                            if (var165 != null) {
                                method45(var165);
                            }
                            method135();
                            field446[++field447 - 1 & 0x1F] = var164 & 0x7FFF;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 70) {
                            method607();
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 34) {
                            for (int var169 = 0; var169 < Statics.field1054; var169++) {
                                class46 var170 = class46.method707(var169);
                                if (var170 != null) {
                                    class155.field2663[var169] = 0;
                                    class155.field2662[var169] = 0;
                                }
                            }
                            method135();
                            field376 += 32;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 75) {
                            String var171 = field299.method2351();
                            Object[] var172 = new Object[var171.length() + 1];
                            for (int var173 = var171.length() - 1; var173 >= 0; var173--) {
                                if (var171.charAt(var173) == 's') {
                                    var172[var173 + 1] = field299.method2351();
                                } else {
                                    var172[var173 + 1] = Integer.valueOf(field299.method2305());
                                }
                            }
                            var172[0] = Integer.valueOf(field299.method2305());
                            class1 var174 = new class1();
                            var174.field7 = var172;
                            class32.method47(var174);
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 201) {
                            Statics.field207 = field299.method2220();
                            Statics.field66 = field299.method2187();
                            while (field299.field1837 < field394) {
                                field265 = field299.method2173();
                                method2519();
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 5) {
                            int var175 = field299.method2305();
                            int var176 = field299.method2298();
                            int var177 = var176 >> 10 & 0x1F;
                            int var178 = var176 >> 5 & 0x1F;
                            int var179 = var176 & 0x1F;
                            int var180 = (var179 << 3) + (var177 << 19) + (var178 << 11);
                            class153 var181 = class153.method2577(var175);
                            if (var181.field2571 != var180) {
                                var181.field2571 = var180;
                                method45(var181);
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 137) {
                            int var182 = field299.method2305();
                            int var183 = field299.method2175();
                            if (var182 < -70000) {
                                var183 += 32768;
                            }
                            class153 var184;
                            if (var182 >= 0) {
                                var184 = class153.method2577(var182);
                            } else {
                                var184 = null;
                            }
                            if (var184 != null) {
                                for (int var185 = 0; var185 < var184.field2559.length; var185++) {
                                    var184.field2559[var185] = 0;
                                    var184.field2641[var185] = 0;
                                }
                            }
                            class14.method556(var183);
                            int var186 = field299.method2175();
                            for (int var187 = 0; var187 < var186; var187++) {
                                int var188 = field299.method2173();
                                if (var188 == 255) {
                                    var188 = field299.method2305();
                                }
                                int var189 = field299.method2205();
                                if (var184 != null && var187 < var184.field2559.length) {
                                    var184.field2559[var187] = var189;
                                    var184.field2641[var187] = var188;
                                }
                                Statics.method710(var183, var187, var189 - 1, var188);
                            }
                            if (var184 != null) {
                                method45(var184);
                            }
                            method135();
                            field446[++field447 - 1 & 0x1F] = var183 & 0x7FFF;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 62) {
                            class110 var190 = field299;
                            int var191 = field394;
                            class189 var192 = new class189();
                            var192.field2883 = var190.method2173();
                            var192.field2882 = var190.method2305();
                            var192.field2884 = new int[var192.field2883];
                            var192.field2886 = new int[var192.field2883];
                            var192.field2887 = new Field[var192.field2883];
                            var192.field2885 = new int[var192.field2883];
                            var192.field2888 = new Method[var192.field2883];
                            var192.field2889 = new byte[var192.field2883][][];
                            for (int var193 = 0; var193 < var192.field2883; var193++) {
                                try {
                                    int var194 = var190.method2173();
                                    if (var194 == 0 || var194 == 1 || var194 == 2) {
                                        String var195 = var190.method2351();
                                        String var196 = var190.method2351();
                                        int var197 = 0;
                                        if (var194 == 1) {
                                            var197 = var190.method2305();
                                        }
                                        var192.field2884[var193] = var194;
                                        var192.field2885[var193] = var197;
                                        if (class190.method89(var195).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        var192.field2887[var193] = class190.method89(var195).getDeclaredField(var196);
                                    } else if (var194 == 3 || var194 == 4) {
                                        String var198 = var190.method2351();
                                        String var199 = var190.method2351();
                                        int var200 = var190.method2173();
                                        String[] var201 = new String[var200];
                                        for (int var202 = 0; var202 < var200; var202++) {
                                            var201[var202] = var190.method2351();
                                        }
                                        String var203 = var190.method2351();
                                        byte[][] var204 = new byte[var200][];
                                        if (var194 == 3) {
                                            for (int var205 = 0; var205 < var200; var205++) {
                                                int var206 = var190.method2305();
                                                var204[var205] = new byte[var206];
                                                var190.method2184(var204[var205], 0, var206);
                                            }
                                        }
                                        var192.field2884[var193] = var194;
                                        Class[] var207 = new Class[var200];
                                        for (int var208 = 0; var208 < var200; var208++) {
                                            var207[var208] = class190.method89(var201[var208]);
                                        }
                                        Class var209 = class190.method89(var203);
                                        if (class190.method89(var198).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        Method[] var210 = class190.method89(var198).getDeclaredMethods();
                                        Method[] var211 = var210;
                                        for (int var212 = 0; var212 < var211.length; var212++) {
                                            Method var213 = var211[var212];
                                            if (var213.getName().equals(var199)) {
                                                Class[] var214 = var213.getParameterTypes();
                                                if (var207.length == var214.length) {
                                                    boolean var215 = true;
                                                    for (int var216 = 0; var216 < var207.length; var216++) {
                                                        if (var207[var216] != var214[var216]) {
                                                            var215 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (var215 && var209 == var213.getReturnType()) {
                                                        var192.field2888[var193] = var213;
                                                    }
                                                }
                                            }
                                        }
                                        var192.field2889[var193] = var204;
                                    }
                                } catch (ClassNotFoundException var442) {
                                    var192.field2886[var193] = -1;
                                } catch (SecurityException var443) {
                                    var192.field2886[var193] = -2;
                                } catch (NullPointerException var444) {
                                    var192.field2886[var193] = -3;
                                } catch (Exception var445) {
                                    var192.field2886[var193] = -4;
                                } catch (Throwable var446) {
                                    var192.field2886[var193] = -5;
                                }
                            }
                            class190.field2892.method3326(var192);
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 78) {
                            String var222 = field299.method2351();
                            int var223 = field299.method2175();
                            byte var224 = field299.method2174();
                            boolean var225 = false;
                            if (var224 == -128) {
                                var225 = true;
                            }
                            if (var225) {
                                if (Statics.field1290 == 0) {
                                    field265 = -1;
                                    var1 = true;
                                    break label2884;
                                }
                                boolean var226 = false;
                                int var227;
                                for (var227 = 0; var227 < Statics.field1290 && (!Statics.field1015[var227].field561.equals(var222) || Statics.field1015[var227].field559 != var223); var227++) {
                                }
                                if (var227 < Statics.field1290) {
                                    while (var227 < Statics.field1290 - 1) {
                                        Statics.field1015[var227] = Statics.field1015[var227 + 1];
                                        var227++;
                                    }
                                    Statics.field1290--;
                                    Statics.field1015[Statics.field1290] = null;
                                }
                            } else {
                                field299.method2351();
                                class21 var228 = new class21();
                                var228.field561 = var222;
                                var228.field558 = class201.method1115(var228.field561, Statics.field2064);
                                var228.field559 = var223;
                                var228.field560 = var224;
                                int var229;
                                for (var229 = Statics.field1290 - 1; var229 >= 0; var229--) {
                                    int var230 = Statics.field1015[var229].field558.compareTo(var228.field561);
                                    if (var230 == 0) {
                                        Statics.field1015[var229].field559 = var223;
                                        Statics.field1015[var229].field560 = var224;
                                        if (var222.equals(Statics.field1248.field44)) {
                                            Statics.field146 = var224;
                                        }
                                        field452 = field443;
                                        field265 = -1;
                                        var1 = true;
                                        break label2884;
                                    }
                                    if (var230 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field1290 >= Statics.field1015.length) {
                                    field265 = -1;
                                    var1 = true;
                                    break label2884;
                                }
                                for (int var231 = Statics.field1290 - 1; var231 > var229; var231--) {
                                    Statics.field1015[var231 + 1] = Statics.field1015[var231];
                                }
                                if (Statics.field1290 == 0) {
                                    Statics.field1015 = new class21[100];
                                }
                                Statics.field1015[var229 + 1] = var228;
                                Statics.field1290++;
                                if (var222.equals(Statics.field1248.field44)) {
                                    Statics.field146 = var224;
                                }
                            }
                            field452 = field443;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 57) {
                            method2473();
                            field265 = -1;
                            var1 = false;
                            break label2884;
                        }
                        if (field265 == 83) {
                            field502 = true;
                            Statics.field1262 = field299.method2173();
                            Statics.field55 = field299.method2173();
                            Statics.field1525 = field299.method2175();
                            Statics.field722 = field299.method2173();
                            Statics.field1869 = field299.method2173();
                            if (Statics.field1869 >= 100) {
                                Statics.field1457 = Statics.field1262 * 128 + 64;
                                Statics.field283 = Statics.field55 * 128 + 64;
                                Statics.field1354 = method124(Statics.field1457, Statics.field283, Statics.field243) - Statics.field1525;
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 81) {
                            Statics.field207 = field299.method2187();
                            Statics.field66 = field299.method2220();
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 143) {
                            method2948(true);
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 158) {
                            int var232 = field299.method2305();
                            class4 var233 = (class4) field420.method3263((long) var232);
                            if (var233 != null) {
                                method2754(var233, true);
                            }
                            if (field423 != null) {
                                method45(field423);
                                field423 = null;
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 187) {
                            method135();
                            field425 = field299.method2176();
                            field453 = field443;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 188) {
                            int var234 = field299.method2213();
                            class153 var235 = class153.method2577(var234);
                            for (int var236 = 0; var236 < var235.field2559.length; var236++) {
                                var235.field2559[var236] = -1;
                                var235.field2559[var236] = 0;
                            }
                            method45(var235);
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 147) {
                            String var237 = field299.method2351();
                            class110 var238 = field299;
                            String var242;
                            try {
                                int var239 = var238.method2186();
                                if (var239 > 32767) {
                                    var239 = 32767;
                                }
                                byte[] var240 = new byte[var239];
                                var238.field1837 += Statics.field2905.method2104(var238.field1838, var238.field1837, var240, 0, var239);
                                String var241 = class202.method3084(var240, 0, var239);
                                var242 = var241;
                            } catch (Exception var438) {
                                var242 = "Cabbage";
                            }
                            String var245 = class193.method3405(class200.method540(var242));
                            class10.method849(6, var237, var245);
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 239) {
                            String var246 = field299.method2351();
                            int var247 = field299.method2213();
                            class153 var248 = class153.method2577(var247);
                            if (!var246.equals(var248.field2543)) {
                                var248.field2543 = var246;
                                method45(var248);
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 33) {
                            field359 = field299.method2173();
                            field304 = field299.method2173();
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 38) {
                            for (int var249 = 0; var249 < field333.length; var249++) {
                                if (field333[var249] != null) {
                                    field333[var249].field759 = -1;
                                }
                            }
                            for (int var250 = 0; var250 < field410.length; var250++) {
                                if (field410[var250] != null) {
                                    field410[var250].field759 = -1;
                                }
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 77) {
                            field452 = field443;
                            if (field394 == 0) {
                                field480 = null;
                                field481 = null;
                                Statics.field1290 = 0;
                                Statics.field1015 = null;
                                field265 = -1;
                                var1 = true;
                            } else {
                                field481 = field299.method2351();
                                long var251 = field299.method2179();
                                field480 = class199.method3384(var251);
                                Statics.field150 = field299.method2174();
                                int var253 = field299.method2173();
                                if (var253 == 255) {
                                    field265 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field1290 = var253;
                                    class21[] var254 = new class21[100];
                                    for (int var255 = 0; var255 < Statics.field1290; var255++) {
                                        var254[var255] = new class21();
                                        var254[var255].field561 = field299.method2351();
                                        var254[var255].field558 = class201.method1115(var254[var255].field561, Statics.field2064);
                                        var254[var255].field559 = field299.method2175();
                                        var254[var255].field560 = field299.method2174();
                                        field299.method2351();
                                        if (var254[var255].field561.equals(Statics.field1248.field44)) {
                                            Statics.field146 = var254[var255].field560;
                                        }
                                    }
                                    boolean var256 = false;
                                    int var257 = Statics.field1290;
                                    while (var257 > 0) {
                                        boolean var258 = true;
                                        var257--;
                                        for (int var259 = 0; var259 < var257; var259++) {
                                            if (var254[var259].field558.compareTo(var254[var259 + 1].field558) > 0) {
                                                class21 var260 = var254[var259];
                                                var254[var259] = var254[var259 + 1];
                                                var254[var259 + 1] = var260;
                                                var258 = false;
                                            }
                                        }
                                        if (var258) {
                                            break;
                                        }
                                    }
                                    Statics.field1015 = var254;
                                    field265 = -1;
                                    var1 = true;
                                }
                            }
                            break label2884;
                        }
                        if (field265 == 210) {
                            field273 = field299.method2173();
                            if (field273 == 1) {
                                field274 = field299.method2175();
                            }
                            if (field273 >= 2 && field273 <= 6) {
                                if (field273 == 2) {
                                    field279 = 64;
                                    field280 = 64;
                                }
                                if (field273 == 3) {
                                    field279 = 0;
                                    field280 = 64;
                                }
                                if (field273 == 4) {
                                    field279 = 128;
                                    field280 = 64;
                                }
                                if (field273 == 5) {
                                    field279 = 64;
                                    field280 = 0;
                                }
                                if (field273 == 6) {
                                    field279 = 64;
                                    field280 = 128;
                                }
                                field273 = 2;
                                field325 = field299.method2175();
                                field293 = field299.method2175();
                                field278 = field299.method2173();
                            }
                            if (field273 == 10) {
                                field275 = field299.method2175();
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 192) {
                            String var261 = field299.method2351();
                            long var262 = field299.method2179();
                            long var264 = (long) field299.method2175();
                            long var266 = (long) field299.method2329();
                            class138 var268 = (class138) class99.method496(class138.method107(), field299.method2173());
                            long var269 = (var264 << 32) + var266;
                            boolean var271 = false;
                            for (int var272 = 0; var272 < 100; var272++) {
                                if (field474[var272] == var269) {
                                    var271 = true;
                                    break;
                                }
                            }
                            if (var268.field2097 && method514(var261)) {
                                var271 = true;
                            }
                            if (!var271 && field483 == 0) {
                                field474[field312] = var269;
                                field312 = (field312 + 1) % 100;
                                class110 var273 = field299;
                                String var277;
                                try {
                                    int var274 = var273.method2186();
                                    if (var274 > 32767) {
                                        var274 = 32767;
                                    }
                                    byte[] var275 = new byte[var274];
                                    var273.field1837 += Statics.field2905.method2104(var273.field1838, var273.field1837, var275, 0, var274);
                                    String var276 = class202.method3084(var275, 0, var274);
                                    var277 = var276;
                                } catch (Exception var437) {
                                    var277 = "Cabbage";
                                }
                                String var280 = class193.method3405(class200.method540(var277));
                                if (var268.field2103 == -1) {
                                    class10.method10(9, var261, var280, class199.method3387(var262));
                                } else {
                                    int var281 = var268.field2103;
                                    String var282 = "<img=" + var281 + ">";
                                    class10.method10(9, var282 + var261, var280, class199.method3387(var262));
                                }
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 55 || field265 == 193 || field265 == 252 || field265 == 109 || field265 == 110 || field265 == 209 || field265 == 30 || field265 == 175 || field265 == 184 || field265 == 12) {
                            method2519();
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 53) {
                            int var283 = field299.method2213();
                            int var284 = field299.method2176();
                            int var285 = field299.method2208();
                            class153 var286 = class153.method2577(var283);
                            int var287 = var286.field2545 + var285;
                            int var288 = var286.field2640 + var284;
                            if (var286.field2617 != var287 || var286.field2544 != var288) {
                                var286.field2617 = var287;
                                var286.field2544 = var288;
                                method45(var286);
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 199) {
                            int var289 = field299.method2220();
                            int var290 = field299.method2196();
                            int var291 = field299.method2298();
                            class4 var292 = (class4) field420.method3263((long) var290);
                            if (var292 != null) {
                                method2754(var292, var292.field63 != var291);
                            }
                            class4 var293 = new class4();
                            var293.field63 = var291;
                            var293.field62 = var289;
                            field420.method3264(var293, (long) var290);
                            method1368(var291);
                            class32.method1643(var291);
                            class153 var294 = class153.method2577(var290);
                            if (var294 != null) {
                                method45(var294);
                            }
                            if (field423 != null) {
                                method45(field423);
                                field423 = null;
                            }
                            method3204();
                            if (field350 != -1) {
                                int var295 = field350;
                                if (class153.method487(var295)) {
                                    method552(Statics.field2572[var295], 1);
                                }
                            }
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 182) {
                            method135();
                            field488 = field299.method2173();
                            field453 = field443;
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 72) {
                            method2948(false);
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 42) {
                            method2629();
                            field265 = -1;
                            var1 = true;
                            break label2884;
                        }
                        if (field265 == 46) {
                            class22 var296 = new class22();
                            var296.field572 = field299.method2351();
                            var296.field576 = field299.method2175();
                            int var297 = field299.method2305();
                            var296.field569 = var297;
                            method2490(45);
                            Statics.field1109.method2648();
                            Statics.field1109 = null;
                            class28.method2101(var296);
                            field265 = -1;
                            var1 = false;
                            break label2884;
                        }
                        class135.method2121("" + field265 + class2.field19 + field267 + class2.field19 + field462 + class2.field19 + field394, (Throwable) null);
                        method2473();
                    } catch (IOException var447) {
                        if (field389 > 0) {
                            method2473();
                        } else {
                            method2490(40);
                            Statics.field296 = Statics.field1109;
                            Statics.field1109 = null;
                        }
                    } catch (Exception var448) {
                        String var300 = "" + field265 + class2.field19 + field267 + class2.field19 + field462 + class2.field19 + field394 + class2.field19 + (Statics.field1245 + Statics.field1248.field782[0]) + class2.field19 + (Statics.field2495 + Statics.field1248.field783[0]) + class2.field19;
                        for (int var301 = 0; var301 < field394 && var301 < 50; var301++) {
                            var300 = var300 + field299.field1838[var301] + class2.field19;
                        }
                        class135.method2121(var300, var448);
                        method2473();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field398 != 30) {
            return;
        }
        while (class190.method3002()) {
            field297.method2408(114);
            field297.method2159(0);
            int var302 = field297.field1837;
            Statics.method513(field297);
            field297.method2206(field297.field1837 - var302);
        }
        Object var303 = Statics.field266.field179;
        synchronized (Statics.field266.field179) {
            if (!field339) {
                Statics.field266.field187 = 0;
            } else if (class127.field2003 != 0 || Statics.field266.field187 >= 40) {
                field297.method2408(169);
                field297.method2159(0);
                int var304 = field297.field1837;
                int var305 = 0;
                for (int var306 = 0; var306 < Statics.field266.field187 && field297.field1837 - var304 < 240; var306++) {
                    var305++;
                    int var307 = Statics.field266.field182[var306];
                    if (var307 < 0) {
                        var307 = 0;
                    } else if (var307 > 502) {
                        var307 = 502;
                    }
                    int var308 = Statics.field266.field186[var306];
                    if (var308 < 0) {
                        var308 = 0;
                    } else if (var308 > 764) {
                        var308 = 764;
                    }
                    int var309 = var307 * 765 + var308;
                    if (Statics.field266.field182[var306] == -1 && Statics.field266.field186[var306] == -1) {
                        var308 = -1;
                        var307 = -1;
                        var309 = 524287;
                    }
                    if (field409 != var308 || field352 != var307) {
                        int var310 = var308 - field409;
                        field409 = var308;
                        int var311 = var307 - field352;
                        field352 = var307;
                        if (field501 < 8 && var310 >= -32 && var310 <= 31 && var311 >= -32 && var311 <= 31) {
                            var310 += 32;
                            var311 += 32;
                            field297.method2364((field501 << 12) + (var310 << 6) + var311);
                            field501 = 0;
                        } else if (field501 < 8) {
                            field297.method2161((field501 << 19) + 8388608 + var309);
                            field501 = 0;
                        } else {
                            field297.method2162((field501 << 19) + -1073741824 + var309);
                            field501 = 0;
                        }
                    } else if (field501 < 2047) {
                        field501++;
                    }
                }
                field297.method2206(field297.field1837 - var304);
                if (var305 >= Statics.field266.field187) {
                    Statics.field266.field187 = 0;
                } else {
                    Statics.field266.field187 -= var305;
                    for (int var312 = 0; var312 < Statics.field266.field187; var312++) {
                        Statics.field266.field186[var312] = Statics.field266.field186[var305 + var312];
                        Statics.field266.field182[var312] = Statics.field266.field182[var305 + var312];
                    }
                }
            }
        }
        if (class127.field2003 == 1 || !Statics.field2084 && class127.field2003 == 4 || class127.field2003 == 2) {
            long var314 = (class127.field1993 - field355) / 50L;
            if (var314 > 4095L) {
                var314 = 4095L;
            }
            field355 = class127.field1993;
            int var316 = class127.field2002;
            if (var316 < 0) {
                var316 = 0;
            } else if (var316 > 502) {
                var316 = 502;
            }
            int var317 = class127.field1988;
            if (var317 < 0) {
                var317 = 0;
            } else if (var317 > 764) {
                var317 = 764;
            }
            int var318 = var316 * 765 + var317;
            byte var319 = 0;
            if (class127.field2003 == 2) {
                var319 = 1;
            }
            int var320 = (int) var314;
            field297.method2408(41);
            field297.method2162((var319 << 19) + (var320 << 20) + var318);
        }
        if (class124.field1972 > 0) {
            field297.method2408(248);
            field297.method2364(0);
            int var321 = field297.field1837;
            long var322 = class103.method550();
            for (int var324 = 0; var324 < class124.field1972; var324++) {
                long var325 = var322 - field417;
                if (var325 > 16777215L) {
                    var325 = 16777215L;
                }
                field417 = var322;
                field297.method2194(class124.field1943[var324]);
                field297.method2243((int) var325);
            }
            field297.method2169(field297.field1837 - var321);
        }
        if (field346 > 0) {
            field346--;
        }
        if (class124.field1946[96] || class124.field1946[97] || class124.field1946[98] || class124.field1946[99]) {
            field347 = true;
        }
        if (field347 && field346 <= 0) {
            field346 = 20;
            field347 = false;
            field297.method2408(106);
            field297.method2364(field396);
            field297.method2201(field340);
        }
        if (Statics.field550 && !field270) {
            field270 = true;
            field297.method2408(188);
            field297.method2159(1);
        }
        if (!Statics.field550 && field270) {
            field270 = false;
            field297.method2408(188);
            field297.method2159(0);
        }
        method2024();
        if (field398 != 30) {
            return;
        }
        method2770();
        int var10002;
        for (int var327 = 0; var327 < field496; var327++) {
            var10002 = field499[var327]--;
            if (field499[var327] >= -10) {
                class52 var329 = field271[var327];
                if (var329 == null) {
                    class52 var449 = (class52) null;
                    var329 = class52.method1090(Statics.field1084, field395[var327], 0);
                    if (var329 == null) {
                        continue;
                    }
                    field499[var327] += var329.method1087();
                    field271[var327] = var329;
                }
                if (field499[var327] < 0) {
                    int var336;
                    if (field290[var327] == 0) {
                        var336 = field494;
                    } else {
                        int var330 = (field290[var327] & 0xFF) * 128;
                        int var331 = field290[var327] >> 16 & 0xFF;
                        int var332 = var331 * 128 + 64 - Statics.field1248.field740;
                        if (var332 < 0) {
                            var332 = -var332;
                        }
                        int var333 = field290[var327] >> 8 & 0xFF;
                        int var334 = var333 * 128 + 64 - Statics.field1248.field730;
                        if (var334 < 0) {
                            var334 = -var334;
                        }
                        int var335 = var332 + var334 - 128;
                        if (var335 > var330) {
                            field499[var327] = -100;
                            continue;
                        }
                        if (var335 < 0) {
                            var335 = 0;
                        }
                        var336 = field495 * (var330 - var335) / var330;
                    }
                    if (var336 > 0) {
                        class56 var337 = var329.method1085().method1127(Statics.field975);
                        class58 var338 = class58.method1176(var337, 100, var336);
                        var338.method1265(field498[var327] - 1);
                        Statics.field2468.method1001(var338);
                    }
                    field499[var327] = -100;
                }
            } else {
                field496--;
                for (int var328 = var327; var328 < field496; var328++) {
                    field395[var328] = field395[var328 + 1];
                    field271[var328] = field271[var328 + 1];
                    field498[var328] = field498[var328 + 1];
                    field499[var328] = field499[var328 + 1];
                    field290[var328] = field290[var328 + 1];
                }
                var327--;
            }
        }
        if (field493 && !class162.method2517()) {
            if (field491 != 0 && field492 != -1) {
                class162.method2893(Statics.field195, field492, 0, field491, false);
            }
            field493 = false;
        }
        field348++;
        if (field348 <= 750) {
            method1383();
            method4();
            for (int var339 = -1; var339 < field377; var339++) {
                int var340;
                if (var339 == -1) {
                    var340 = 2047;
                } else {
                    var340 = field378[var339];
                }
                class3 var341 = field333[var340];
                if (var341 != null && var341.field744 > 0) {
                    var341.field744--;
                    if (var341.field744 == 0) {
                        var341.field729 = null;
                    }
                }
            }
            for (int var342 = 0; var342 < field294; var342++) {
                int var343 = field295[var342];
                class30 var344 = field410[var343];
                if (var344 != null && var344.field744 > 0) {
                    var344.field744--;
                    if (var344.field744 == 0) {
                        var344.field729 = null;
                    }
                }
            }
            field332++;
            if (field255 != 0) {
                field365 += 20;
                if (field365 >= 400) {
                    field255 = 0;
                }
            }
            if (Statics.field161 != null) {
                field367++;
                if (field367 >= 15) {
                    method45(Statics.field161);
                    Statics.field161 = null;
                }
            }
            class153 var345 = Statics.field221;
            class153 var346 = Statics.field967;
            Statics.field221 = null;
            Statics.field967 = null;
            field435 = null;
            field439 = false;
            field436 = false;
            field457 = 0;
            while (class124.method2476() && field457 < 128) {
                if (field426 >= 2 && class124.field1946[82] && Statics.field49 == 66) {
                    String var347 = class10.method2727();
                    Statics.field56.setContents(new StringSelection(var347), (ClipboardOwner) null);
                } else {
                    field478[field457] = Statics.field49;
                    field264[field457] = Statics.field2496;
                    field457++;
                }
            }
            int var348 = field350;
            if (class153.method487(var348)) {
                method2412(Statics.field2572[var348], -1, 0, 0, 765, 503, 0, 0);
            }
            field443++;
            while (true) {
                class1 var349;
                class153 var350;
                class153 var351;
                do {
                    var349 = (class1) field445.method3305();
                    if (var349 == null) {
                        while (true) {
                            class1 var352;
                            class153 var353;
                            class153 var354;
                            do {
                                var352 = (class1) field467.method3305();
                                if (var352 == null) {
                                    while (true) {
                                        class1 var355;
                                        class153 var356;
                                        class153 var357;
                                        do {
                                            var355 = (class1) field252.method3305();
                                            if (var355 == null) {
                                                boolean var358 = false;
                                                while (!var358) {
                                                    var358 = true;
                                                    for (int var359 = 0; var359 < field401 - 1; var359++) {
                                                        if (field508[var359] < 1000 && field508[var359 + 1] > 1000) {
                                                            String var360 = field407[var359];
                                                            field407[var359] = field407[var359 + 1];
                                                            field407[var359 + 1] = var360;
                                                            String var361 = field406[var359];
                                                            field406[var359] = field406[var359 + 1];
                                                            field406[var359 + 1] = var361;
                                                            int var362 = field508[var359];
                                                            field508[var359] = field508[var359 + 1];
                                                            field508[var359 + 1] = var362;
                                                            int var363 = field402[var359];
                                                            field402[var359] = field402[var359 + 1];
                                                            field402[var359 + 1] = var363;
                                                            int var364 = field403[var359];
                                                            field403[var359] = field403[var359 + 1];
                                                            field403[var359 + 1] = var364;
                                                            int var365 = field405[var359];
                                                            field405[var359] = field405[var359 + 1];
                                                            field405[var359 + 1] = var365;
                                                            var358 = false;
                                                        }
                                                    }
                                                }
                                                if (Statics.field694 == null && field431 == null) {
                                                    int var366 = class127.field2003;
                                                    if (field400) {
                                                        if (var366 != 1 && (Statics.field2084 || var366 != 4)) {
                                                            int var367 = class127.field1990;
                                                            int var368 = class127.field1995;
                                                            if (var367 < Statics.field2104 - 10 || var367 > Statics.field2104 + Statics.field200 + 10 || var368 < Statics.field2819 - 10 || var368 > Statics.field562 + Statics.field2819 + 10) {
                                                                field400 = false;
                                                                method2518(Statics.field2104, Statics.field2819, Statics.field200, Statics.field562);
                                                            }
                                                        }
                                                        if (var366 == 1 || !Statics.field2084 && var366 == 4) {
                                                            int var369 = Statics.field2104;
                                                            int var370 = Statics.field2819;
                                                            int var371 = Statics.field200;
                                                            int var372 = class127.field1988;
                                                            int var373 = class127.field2002;
                                                            int var374 = -1;
                                                            for (int var375 = 0; var375 < field401; var375++) {
                                                                int var376 = (field401 - 1 - var375) * 15 + var370 + 31;
                                                                if (var372 > var369 && var372 < var369 + var371 && var373 > var376 - 13 && var373 < var376 + 3) {
                                                                    var374 = var375;
                                                                }
                                                            }
                                                            if (var374 != -1) {
                                                                method123(var374);
                                                            }
                                                            field400 = false;
                                                            method2518(Statics.field2104, Statics.field2819, Statics.field200, Statics.field562);
                                                        }
                                                    } else {
                                                        label3127: {
                                                            if ((var366 == 1 || !Statics.field2084 && var366 == 4) && field401 > 0) {
                                                                int var377 = field508[field401 - 1];
                                                                if (var377 == 39 || var377 == 40 || var377 == 41 || var377 == 42 || var377 == 43 || var377 == 33 || var377 == 34 || var377 == 35 || var377 == 36 || var377 == 37 || var377 == 38 || var377 == 1005) {
                                                                    int var378 = field402[field401 - 1];
                                                                    int var379 = field403[field401 - 1];
                                                                    class153 var380 = class153.method2577(var379);
                                                                    if (class157.method2118(method708(var380)) || class157.method148(method708(var380))) {
                                                                        if (Statics.field694 != null && !field373 && field399 != 1 && !method1393(field401 - 1) && field401 > 0) {
                                                                            Statics.method2654(field424, field371);
                                                                        }
                                                                        field373 = false;
                                                                        field374 = 0;
                                                                        if (Statics.field694 != null) {
                                                                            method45(Statics.field694);
                                                                        }
                                                                        Statics.field694 = class153.method2577(var379);
                                                                        field369 = var378;
                                                                        field424 = class127.field1988;
                                                                        field371 = class127.field2002;
                                                                        if (field401 > 0) {
                                                                            int var381 = field401 - 1;
                                                                            Statics.field1460 = new class27();
                                                                            Statics.field1460.field640 = field402[var381];
                                                                            Statics.field1460.field638 = field403[var381];
                                                                            Statics.field1460.field637 = field508[var381];
                                                                            Statics.field1460.field644 = field405[var381];
                                                                            Statics.field1460.field639 = field406[var381];
                                                                        }
                                                                        method45(Statics.field694);
                                                                        break label3127;
                                                                    }
                                                                }
                                                            }
                                                            if ((var366 == 1 || !Statics.field2084 && var366 == 4) && (field399 == 1 && field401 > 2 || method1393(field401 - 1))) {
                                                                var366 = 2;
                                                            }
                                                            if ((var366 == 1 || !Statics.field2084 && var366 == 4) && field401 > 0) {
                                                                method123(field401 - 1);
                                                            }
                                                            if (var366 == 2 && field401 > 0) {
                                                                method950(class127.field1988, class127.field2002);
                                                            }
                                                        }
                                                    }
                                                }
                                                if (field431 != null) {
                                                    method45(field431);
                                                    Statics.field1503++;
                                                    if (field439 && field436) {
                                                        int var382 = class127.field1990;
                                                        int var383 = class127.field1995;
                                                        int var384 = var382 - field475;
                                                        int var385 = var383 - field434;
                                                        if (var384 < field253) {
                                                            var384 = field253;
                                                        }
                                                        if (field431.field2547 + var384 > field253 + field432.field2547) {
                                                            var384 = field253 + field432.field2547 - field431.field2547;
                                                        }
                                                        if (var385 < field438) {
                                                            var385 = field438;
                                                        }
                                                        if (field431.field2648 + var385 > field438 + field432.field2648) {
                                                            var385 = field438 + field432.field2648 - field431.field2648;
                                                        }
                                                        int var386 = var384 - field440;
                                                        int var387 = var385 - field441;
                                                        int var388 = field431.field2601;
                                                        if (Statics.field1503 > field431.field2581 && (var386 > var388 || var386 < -var388 || var387 > var388 || var387 < -var388)) {
                                                            field442 = true;
                                                        }
                                                        int var389 = field432.field2551 + (var384 - field253);
                                                        int var390 = field432.field2552 + (var385 - field438);
                                                        if (field431.field2614 != null && field442) {
                                                            class1 var391 = new class1();
                                                            var391.field3 = field431;
                                                            var391.field4 = var389;
                                                            var391.field9 = var390;
                                                            var391.field7 = field431.field2614;
                                                            class32.method47(var391);
                                                        }
                                                        if (class127.field2001 == 0) {
                                                            if (field442) {
                                                                if (field431.field2532 != null) {
                                                                    class1 var392 = new class1();
                                                                    var392.field3 = field431;
                                                                    var392.field4 = var389;
                                                                    var392.field9 = var390;
                                                                    var392.field11 = field435;
                                                                    var392.field7 = field431.field2532;
                                                                    class32.method47(var392);
                                                                }
                                                                if (field435 != null && method596(field431) != null) {
                                                                    field297.method2408(34);
                                                                    field297.method2336(field431.field2538);
                                                                    field297.method2203(field431.field2642);
                                                                    field297.method2341(field435.field2538);
                                                                    field297.method2198(field431.field2539);
                                                                    field297.method2198(field435.field2642);
                                                                    field297.method2198(field435.field2539);
                                                                }
                                                            } else if ((field399 == 1 || method1393(field401 - 1)) && field401 > 2) {
                                                                method950(field475 + field440, field441 + field434);
                                                            } else if (field401 > 0) {
                                                                Statics.method2654(field475 + field440, field441 + field434);
                                                            }
                                                            field431 = null;
                                                        }
                                                    } else if (Statics.field1503 > 1) {
                                                        field431 = null;
                                                    }
                                                }
                                                if (Statics.field694 != null) {
                                                    method45(Statics.field694);
                                                    field374++;
                                                    if (class127.field2001 == 0) {
                                                        if (field373) {
                                                            if (Statics.field891 == Statics.field694 && field372 != field369) {
                                                                class153 var393 = Statics.field694;
                                                                byte var394 = 0;
                                                                if (field422 == 1 && var393.field2625 == 206) {
                                                                    var394 = 1;
                                                                }
                                                                if (var393.field2559[field372] <= 0) {
                                                                    var394 = 0;
                                                                }
                                                                if (class157.method148(method708(var393))) {
                                                                    int var395 = field369;
                                                                    int var396 = field372;
                                                                    var393.field2559[var396] = var393.field2559[var395];
                                                                    var393.field2641[var396] = var393.field2641[var395];
                                                                    var393.field2559[var395] = -1;
                                                                    var393.field2641[var395] = 0;
                                                                } else if (var394 == 1) {
                                                                    int var397 = field369;
                                                                    int var398 = field372;
                                                                    while (var397 != var398) {
                                                                        if (var397 > var398) {
                                                                            var393.method2917(var397 - 1, var397);
                                                                            var397--;
                                                                        } else if (var397 < var398) {
                                                                            var393.method2917(var397 + 1, var397);
                                                                            var397++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var393.method2917(field372, field369);
                                                                }
                                                                field297.method2408(223);
                                                                field297.method2364(field369);
                                                                field297.method2159(var394);
                                                                field297.method2364(field372);
                                                                field297.method2336(Statics.field694.field2538);
                                                            }
                                                        } else if ((field399 == 1 || method1393(field401 - 1)) && field401 > 2) {
                                                            method950(field424, field371);
                                                        } else if (field401 > 0) {
                                                            Statics.method2654(field424, field371);
                                                        }
                                                        field367 = 10;
                                                        class127.field2003 = 0;
                                                        Statics.field694 = null;
                                                    } else if (field374 >= 5 && (class127.field1990 > field424 + 5 || class127.field1990 < field424 - 5 || class127.field1995 > field371 + 5 || class127.field1995 < field371 - 5)) {
                                                        field373 = true;
                                                    }
                                                }
                                                if (class79.field1395 != -1) {
                                                    int var399 = class79.field1395;
                                                    int var400 = class79.field1396;
                                                    field297.method2408(203);
                                                    field297.method2159(5);
                                                    field297.method2203(Statics.field1245 + var399);
                                                    field297.method2198(Statics.field2495 + var400);
                                                    field297.method2194(class124.field1946[82] ? (class124.field1946[81] ? 2 : 1) : 0);
                                                    class79.field1395 = -1;
                                                    field363 = class127.field1988;
                                                    field364 = class127.field2002;
                                                    field255 = 1;
                                                    field365 = 0;
                                                    field487 = var399;
                                                    field309 = var400;
                                                }
                                                if (Statics.field221 != var345) {
                                                    if (var345 != null) {
                                                        method45(var345);
                                                    }
                                                    if (Statics.field221 != null) {
                                                        method45(Statics.field221);
                                                    }
                                                }
                                                if (Statics.field967 != var346 && field476 == field411) {
                                                    if (var346 != null) {
                                                        method45(var346);
                                                    }
                                                    if (Statics.field967 != null) {
                                                        method45(Statics.field967);
                                                    }
                                                }
                                                if (Statics.field967 == null) {
                                                    if (field476 > 0) {
                                                        field476--;
                                                    }
                                                } else if (field476 < field411) {
                                                    field476++;
                                                    if (field476 == field411) {
                                                        method45(Statics.field967);
                                                    }
                                                }
                                                int var401 = field505 + Statics.field1248.field740;
                                                int var402 = field322 + Statics.field1248.field730;
                                                if (Statics.field2469 - var401 < -500 || Statics.field2469 - var401 > 500 || Statics.field1274 - var402 < -500 || Statics.field1274 - var402 > 500) {
                                                    Statics.field2469 = var401;
                                                    Statics.field1274 = var402;
                                                }
                                                if (Statics.field2469 != var401) {
                                                    Statics.field2469 += (var401 - Statics.field2469) / 16;
                                                }
                                                if (Statics.field1274 != var402) {
                                                    Statics.field1274 += (var402 - Statics.field1274) / 16;
                                                }
                                                if (class127.field2001 == 4 && Statics.field2084) {
                                                    int var403 = class127.field1995 - field345;
                                                    field414 = var403 * 2;
                                                    field345 = var403 == -1 || var403 == 1 ? class127.field1995 : (field345 + class127.field1995) / 2;
                                                    int var404 = field344 - class127.field1990;
                                                    field342 = var404 * 2;
                                                    field344 = var404 == -1 || var404 == 1 ? class127.field1990 : (field344 + class127.field1990) / 2;
                                                } else {
                                                    if (class124.field1946[96]) {
                                                        field342 += (-24 - field342) / 2;
                                                    } else if (class124.field1946[97]) {
                                                        field342 += (24 - field342) / 2;
                                                    } else {
                                                        field342 /= 2;
                                                    }
                                                    if (class124.field1946[98]) {
                                                        field414 += (12 - field414) / 2;
                                                    } else if (class124.field1946[99]) {
                                                        field414 += (-12 - field414) / 2;
                                                    } else {
                                                        field414 /= 2;
                                                    }
                                                    field345 = class127.field1995;
                                                    field344 = class127.field1990;
                                                }
                                                field396 = field342 / 2 + field396 & 0x7FF;
                                                field340 += field414 / 2;
                                                if (field340 < 128) {
                                                    field340 = 128;
                                                }
                                                if (field340 > 383) {
                                                    field340 = 383;
                                                }
                                                int var405 = Statics.field2469 >> 7;
                                                int var406 = Statics.field1274 >> 7;
                                                int var407 = method124(Statics.field2469, Statics.field1274, Statics.field243);
                                                int var408 = 0;
                                                if (var405 > 3 && var406 > 3 && var405 < 100 && var406 < 100) {
                                                    for (int var409 = var405 - 4; var409 <= var405 + 4; var409++) {
                                                        for (int var410 = var406 - 4; var410 <= var406 + 4; var410++) {
                                                            int var411 = Statics.field243;
                                                            if (var411 < 3 && (class6.field95[1][var409][var410] & 0x2) == 2) {
                                                                var411++;
                                                            }
                                                            int var412 = var407 - class6.field84[var411][var409][var410];
                                                            if (var412 > var408) {
                                                                var408 = var412;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var413 = var408 * 192;
                                                if (var413 > 98048) {
                                                    var413 = 98048;
                                                }
                                                if (var413 < 32768) {
                                                    var413 = 32768;
                                                }
                                                if (var413 > field419) {
                                                    field419 += (var413 - field419) / 24;
                                                } else if (var413 < field419) {
                                                    field419 += (var413 - field419) / 80;
                                                }
                                                if (field502) {
                                                    int var414 = Statics.field1262 * 128 + 64;
                                                    int var415 = Statics.field55 * 128 + 64;
                                                    int var416 = method124(var414, var415, Statics.field243) - Statics.field1525;
                                                    if (Statics.field1457 < var414) {
                                                        Statics.field1457 += Statics.field1869 * (var414 - Statics.field1457) / 1000 + Statics.field722;
                                                        if (Statics.field1457 > var414) {
                                                            Statics.field1457 = var414;
                                                        }
                                                    }
                                                    if (Statics.field1457 > var414) {
                                                        Statics.field1457 -= Statics.field1869 * (Statics.field1457 - var414) / 1000 + Statics.field722;
                                                        if (Statics.field1457 < var414) {
                                                            Statics.field1457 = var414;
                                                        }
                                                    }
                                                    if (Statics.field1354 < var416) {
                                                        Statics.field1354 += Statics.field1869 * (var416 - Statics.field1354) / 1000 + Statics.field722;
                                                        if (Statics.field1354 > var416) {
                                                            Statics.field1354 = var416;
                                                        }
                                                    }
                                                    if (Statics.field1354 > var416) {
                                                        Statics.field1354 -= Statics.field1869 * (Statics.field1354 - var416) / 1000 + Statics.field722;
                                                        if (Statics.field1354 < var416) {
                                                            Statics.field1354 = var416;
                                                        }
                                                    }
                                                    if (Statics.field283 < var415) {
                                                        Statics.field283 += Statics.field1869 * (var415 - Statics.field283) / 1000 + Statics.field722;
                                                        if (Statics.field283 > var415) {
                                                            Statics.field283 = var415;
                                                        }
                                                    }
                                                    if (Statics.field283 > var415) {
                                                        Statics.field283 -= Statics.field1869 * (Statics.field283 - var415) / 1000 + Statics.field722;
                                                        if (Statics.field283 < var415) {
                                                            Statics.field283 = var415;
                                                        }
                                                    }
                                                    int var417 = Statics.field2411 * 128 + 64;
                                                    int var418 = Statics.field1813 * 128 + 64;
                                                    int var419 = method124(var417, var418, Statics.field243) - Statics.field2403;
                                                    int var420 = var417 - Statics.field1457;
                                                    int var421 = var419 - Statics.field1354;
                                                    int var422 = var418 - Statics.field283;
                                                    int var423 = (int) Math.sqrt((double) (var420 * var420 + var422 * var422));
                                                    int var424 = (int) (Math.atan2((double) var421, (double) var423) * 325.949D) & 0x7FF;
                                                    int var425 = (int) (Math.atan2((double) var420, (double) var422) * -325.949D) & 0x7FF;
                                                    if (var424 < 128) {
                                                        var424 = 128;
                                                    }
                                                    if (var424 > 383) {
                                                        var424 = 383;
                                                    }
                                                    if (Statics.field134 < var424) {
                                                        Statics.field134 += Statics.field239 * (var424 - Statics.field134) / 1000 + Statics.field1461;
                                                        if (Statics.field134 > var424) {
                                                            Statics.field134 = var424;
                                                        }
                                                    }
                                                    if (Statics.field134 > var424) {
                                                        Statics.field134 -= Statics.field239 * (Statics.field134 - var424) / 1000 + Statics.field1461;
                                                        if (Statics.field134 < var424) {
                                                            Statics.field134 = var424;
                                                        }
                                                    }
                                                    int var426 = var425 - Statics.field137;
                                                    if (var426 > 1024) {
                                                        var426 -= 2048;
                                                    }
                                                    if (var426 < -1024) {
                                                        var426 += 2048;
                                                    }
                                                    if (var426 > 0) {
                                                        Statics.field137 += Statics.field239 * var426 / 1000 + Statics.field1461;
                                                        Statics.field137 &= 0x7FF;
                                                    }
                                                    if (var426 < 0) {
                                                        Statics.field137 -= Statics.field239 * -var426 / 1000 + Statics.field1461;
                                                        Statics.field137 &= 0x7FF;
                                                    }
                                                    int var427 = var425 - Statics.field137;
                                                    if (var427 > 1024) {
                                                        var427 -= 2048;
                                                    }
                                                    if (var427 < -1024) {
                                                        var427 += 2048;
                                                    }
                                                    if (var427 < 0 && var426 > 0 || var427 > 0 && var426 < 0) {
                                                        Statics.field137 = var425;
                                                    }
                                                }
                                                for (int var428 = 0; var428 < 5; var428++) {
                                                    var10002 = field507[var428]++;
                                                }
                                                int var429 = ++class127.field1996 - 1;
                                                int var431 = class124.field1973;
                                                if (var429 > 15000 && var431 > 15000) {
                                                    field389 = 250;
                                                    class127.field1996 = 14500;
                                                    field297.method2408(237);
                                                }
                                                field318++;
                                                if (field318 > 500) {
                                                    field318 = 0;
                                                    int var433 = (int) (Math.random() * 8.0D);
                                                    if ((var433 & 0x1) == 1) {
                                                        field505 += field277;
                                                    }
                                                    if ((var433 & 0x2) == 2) {
                                                        field322 += field307;
                                                    }
                                                    if ((var433 & 0x4) == 4) {
                                                        field324 += field428;
                                                    }
                                                }
                                                if (field505 < -50) {
                                                    field277 = 2;
                                                }
                                                if (field505 > 50) {
                                                    field277 = -2;
                                                }
                                                if (field322 < -55) {
                                                    field307 = 2;
                                                }
                                                if (field322 > 55) {
                                                    field307 = -2;
                                                }
                                                if (field324 < -40) {
                                                    field428 = 1;
                                                }
                                                if (field324 > 40) {
                                                    field428 = -1;
                                                }
                                                field331++;
                                                if (field331 > 500) {
                                                    field331 = 0;
                                                    int var434 = (int) (Math.random() * 8.0D);
                                                    if ((var434 & 0x1) == 1) {
                                                        field387 += field328;
                                                    }
                                                    if ((var434 & 0x2) == 2) {
                                                        field329 += field330;
                                                    }
                                                }
                                                if (field387 < -60) {
                                                    field328 = 2;
                                                }
                                                if (field387 > 60) {
                                                    field328 = -2;
                                                }
                                                if (field329 < -20) {
                                                    field330 = 1;
                                                }
                                                if (field329 > 10) {
                                                    field330 = -1;
                                                }
                                                for (class34 var435 = (class34) field511.method3253(); var435 != null; var435 = (class34) field511.method3261()) {
                                                    if ((long) var435.field792 < class103.method550() / 1000L - 5L) {
                                                        if (var435.field791 > 0) {
                                                            class10.method849(5, "", var435.field790 + class143.field2294);
                                                        }
                                                        if (var435.field791 == 0) {
                                                            class10.method849(5, "", var435.field790 + class143.field2295);
                                                        }
                                                        var435.method3374();
                                                    }
                                                }
                                                field303++;
                                                if (field303 > 50) {
                                                    field297.method2408(231);
                                                }
                                                try {
                                                    if (Statics.field1109 != null && field297.field1837 > 0) {
                                                        Statics.field1109.method2636(field297.field1838, 0, field297.field1837);
                                                        field297.field1837 = 0;
                                                        field303 = 0;
                                                    }
                                                } catch (IOException var440) {
                                                    if (field389 > 0) {
                                                        method2473();
                                                    } else {
                                                        method2490(40);
                                                        Statics.field296 = Statics.field1109;
                                                        Statics.field1109 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var356 = var355.field3;
                                            if (var356.field2539 < 0) {
                                                break;
                                            }
                                            var357 = class153.method2577(var356.field2549);
                                        } while (var357 == null || var357.field2632 == null || var356.field2539 >= var357.field2632.length || var357.field2632[var356.field2539] != var356);
                                        class32.method47(var355);
                                    }
                                }
                                var353 = var352.field3;
                                if (var353.field2539 < 0) {
                                    break;
                                }
                                var354 = class153.method2577(var353.field2549);
                            } while (var354 == null || var354.field2632 == null || var353.field2539 >= var354.field2632.length || var354.field2632[var353.field2539] != var353);
                            class32.method47(var352);
                        }
                    }
                    var350 = var349.field3;
                    if (var350.field2539 < 0) {
                        break;
                    }
                    var351 = class153.method2577(var350.field2549);
                } while (var351 == null || var351.field2632 == null || var350.field2539 >= var351.field2632.length || var351.field2632[var350.field2539] != var350);
                class32.method47(var349);
            }
        } else if (field389 > 0) {
            method2473();
        } else {
            method2490(40);
            Statics.field296 = Statics.field1109;
            Statics.field1109 = null;
        }
    }

    @ObfuscatedName("ao.m(Lae;IIII)V")
    public static void method628(class38 arg0, int arg1, int arg2, int arg3) {
        if (field496 >= 50 || field495 == 0 || arg0.field908 == null || arg1 >= arg0.field908.length) {
            return;
        }
        int var4 = arg0.field908[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field395[field496] = var5;
        field498[field496] = var6;
        field499[field496] = 0;
        field271[field496] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field290[field496] = (var8 << 16) + (var9 << 8) + var7;
        field496++;
    }

    @ObfuscatedName("az.f(IIIB)V")
    public static void method734(int arg0, int arg1, int arg2) {
        if (field494 == 0 || arg1 == 0 || field496 >= 50) {
            return;
        }
        field395[field496] = arg0;
        field498[field496] = arg1;
        field499[field496] = arg2;
        field271[field496] = null;
        field290[field496] = 0;
        field496++;
    }

    @ObfuscatedName("cz.k(I)V")
    public static final void method2024() {
        if (field459 && Statics.field243 != field485) {
            method935(Statics.field71, Statics.field164, Statics.field243, Statics.field1248.field782[0], Statics.field1248.field783[0]);
        } else if (Statics.field243 != field482) {
            field482 = Statics.field243;
            method626(Statics.field243);
        }
    }

    @ObfuscatedName("bq.an(I)V")
    public static final void method1383() {
        for (int var0 = -1; var0 < field377; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field378[var0];
            }
            class3 var2 = field333[var1];
            if (var2 != null) {
                method2018(var2, 1);
            }
        }
    }

    @ObfuscatedName("p.aw(I)V")
    public static final void method4() {
        for (int var0 = 0; var0 < field294; var0++) {
            int var1 = field295[var0];
            class30 var2 = field410[var1];
            if (var2 != null) {
                method2018(var2, var2.field701.field827);
            }
        }
    }

    @ObfuscatedName("cz.at(Laa;IS)V")
    public static final void method2018(class33 arg0, int arg1) {
        if (arg0.field773 > field343) {
            int var2 = arg0.field773 - field343;
            int var3 = arg0.field776 * 128 + arg0.field733 * 64;
            int var4 = arg0.field771 * 128 + arg0.field733 * 64;
            arg0.field740 += (var3 - arg0.field740) / var2;
            arg0.field730 += (var4 - arg0.field730) / var2;
            arg0.field785 = 0;
            if (arg0.field775 == 0) {
                arg0.field754 = 1024;
            }
            if (arg0.field775 == 1) {
                arg0.field754 = 1536;
            }
            if (arg0.field775 == 2) {
                arg0.field754 = 0;
            }
            if (arg0.field775 == 3) {
                arg0.field754 = 512;
            }
        } else if (arg0.field778 >= field343) {
            method2886(arg0);
        } else {
            method82(arg0);
        }
        if (arg0.field740 < 128 || arg0.field730 < 128 || arg0.field740 >= 13184 || arg0.field730 >= 13184) {
            arg0.field759 = -1;
            arg0.field764 = -1;
            arg0.field773 = 0;
            arg0.field778 = 0;
            arg0.field740 = arg0.field782[0] * 128 + arg0.field733 * 64;
            arg0.field730 = arg0.field783[0] * 128 + arg0.field733 * 64;
            arg0.method612();
        }
        if (Statics.field1248 == arg0 && (arg0.field740 < 1536 || arg0.field730 < 1536 || arg0.field740 >= 11776 || arg0.field730 >= 11776)) {
            arg0.field759 = -1;
            arg0.field764 = -1;
            arg0.field773 = 0;
            arg0.field778 = 0;
            arg0.field740 = arg0.field782[0] * 128 + arg0.field733 * 64;
            arg0.field730 = arg0.field783[0] * 128 + arg0.field733 * 64;
            arg0.method612();
        }
        method149(arg0);
        method541(arg0);
    }

    @ObfuscatedName("ew.al(Laa;B)V")
    public static final void method2886(class33 arg0) {
        if (field343 == arg0.field778 || arg0.field759 == -1 || arg0.field762 != 0 || arg0.field761 + 1 > class38.method507(arg0.field759).field907[arg0.field760]) {
            int var1 = arg0.field778 - arg0.field773;
            int var2 = field343 - arg0.field773;
            int var3 = arg0.field776 * 128 + arg0.field733 * 64;
            int var4 = arg0.field771 * 128 + arg0.field733 * 64;
            int var5 = arg0.field737 * 128 + arg0.field733 * 64;
            int var6 = arg0.field772 * 128 + arg0.field733 * 64;
            arg0.field740 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field730 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field785 = 0;
        if (arg0.field775 == 0) {
            arg0.field754 = 1024;
        }
        if (arg0.field775 == 1) {
            arg0.field754 = 1536;
        }
        if (arg0.field775 == 2) {
            arg0.field754 = 0;
        }
        if (arg0.field775 == 3) {
            arg0.field754 = 512;
        }
        arg0.field774 = arg0.field754;
    }

    @ObfuscatedName("r.as(Laa;I)V")
    public static final void method82(class33 arg0) {
        arg0.field756 = arg0.field734;
        if (arg0.field781 == 0) {
            arg0.field785 = 0;
            return;
        }
        if (arg0.field759 != -1 && arg0.field762 == 0) {
            class38 var1 = class38.method507(arg0.field759);
            if (arg0.field786 > 0 && var1.field901 == 0) {
                arg0.field785++;
                return;
            }
            if (arg0.field786 <= 0 && var1.field917 == 0) {
                arg0.field785++;
                return;
            }
        }
        int var2 = arg0.field740;
        int var3 = arg0.field730;
        int var4 = arg0.field782[arg0.field781 - 1] * 128 + arg0.field733 * 64;
        int var5 = arg0.field783[arg0.field781 - 1] * 128 + arg0.field733 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field740 = var4;
            arg0.field730 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field754 = 1280;
            } else if (var3 > var5) {
                arg0.field754 = 1792;
            } else {
                arg0.field754 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field754 = 768;
            } else if (var3 > var5) {
                arg0.field754 = 256;
            } else {
                arg0.field754 = 512;
            }
        } else if (var3 < var5) {
            arg0.field754 = 1024;
        } else if (var3 > var5) {
            arg0.field754 = 0;
        }
        int var6 = arg0.field754 - arg0.field774 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field738;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field746;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field751;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field784;
        }
        if (var7 == -1) {
            var7 = arg0.field746;
        }
        arg0.field756 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class30) {
            var9 = ((class30) arg0).field701.field834;
        }
        if (var9) {
            if (arg0.field774 != arg0.field754 && arg0.field739 == -1 && arg0.field780 != 0) {
                var8 = 2;
            }
            if (arg0.field781 > 2) {
                var8 = 6;
            }
            if (arg0.field781 > 3) {
                var8 = 8;
            }
            if (arg0.field785 > 0 && arg0.field781 > 1) {
                var8 = 8;
                arg0.field785--;
            }
        } else {
            if (arg0.field781 > 1) {
                var8 = 6;
            }
            if (arg0.field781 > 2) {
                var8 = 8;
            }
            if (arg0.field785 > 0 && arg0.field781 > 1) {
                var8 = 8;
                arg0.field785--;
            }
        }
        if (arg0.field753[arg0.field781 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field756 == arg0.field746 && arg0.field741 != -1) {
            arg0.field756 = arg0.field741;
        }
        if (var2 < var4) {
            arg0.field740 += var8;
            if (arg0.field740 > var4) {
                arg0.field740 = var4;
            }
        } else if (var2 > var4) {
            arg0.field740 -= var8;
            if (arg0.field740 < var4) {
                arg0.field740 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field730 += var8;
            if (arg0.field730 > var5) {
                arg0.field730 = var5;
            }
        } else if (var3 > var5) {
            arg0.field730 -= var8;
            if (arg0.field730 < var5) {
                arg0.field730 = var5;
            }
        }
        if (arg0.field740 == var4 && arg0.field730 == var5) {
            arg0.field781--;
            if (arg0.field786 > 0) {
                arg0.field786--;
            }
        }
    }

    @ObfuscatedName("e.ak(Laa;B)V")
    public static final void method149(class33 arg0) {
        if (arg0.field780 == 0) {
            return;
        }
        if (arg0.field739 != -1 && arg0.field739 < 32768) {
            class30 var1 = field410[arg0.field739];
            if (var1 != null) {
                int var2 = arg0.field740 - var1.field740;
                int var3 = arg0.field730 - var1.field730;
                if (var2 != 0 || var3 != 0) {
                    arg0.field754 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field739 >= 32768) {
            int var4 = arg0.field739 - 32768;
            if (field382 == var4) {
                var4 = 2047;
            }
            class3 var5 = field333[var4];
            if (var5 != null) {
                int var6 = arg0.field740 - var5.field740;
                int var7 = arg0.field730 - var5.field730;
                if (var6 != 0 || var7 != 0) {
                    arg0.field754 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field757 != 0 || arg0.field755 != 0) && (arg0.field781 == 0 || arg0.field785 > 0)) {
            int var8 = arg0.field740 - (arg0.field757 * 64 - Statics.field1245 * 64 - Statics.field1245 * 64);
            int var9 = arg0.field730 - (arg0.field755 * 64 - Statics.field2495 * 64 - Statics.field2495 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field754 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field757 = 0;
            arg0.field755 = 0;
        }
        int var10 = arg0.field754 - arg0.field774 & 0x7FF;
        if (var10 == 0) {
            arg0.field779 = 0;
            return;
        }
        arg0.field779++;
        if (var10 > 1024) {
            arg0.field774 -= arg0.field780;
            boolean var11 = true;
            if (var10 < arg0.field780 || var10 > 2048 - arg0.field780) {
                arg0.field774 = arg0.field754;
                var11 = false;
            }
            if (arg0.field756 == arg0.field734 && (arg0.field779 > 25 || var11)) {
                if (arg0.field735 == -1) {
                    arg0.field756 = arg0.field746;
                } else {
                    arg0.field756 = arg0.field735;
                }
            }
        } else {
            arg0.field774 += arg0.field780;
            boolean var12 = true;
            if (var10 < arg0.field780 || var10 > 2048 - arg0.field780) {
                arg0.field774 = arg0.field754;
                var12 = false;
            }
            if (arg0.field756 == arg0.field734 && (arg0.field779 > 25 || var12)) {
                if (arg0.field736 == -1) {
                    arg0.field756 = arg0.field746;
                } else {
                    arg0.field756 = arg0.field736;
                }
            }
        }
        arg0.field774 &= 0x7FF;
    }

    @ObfuscatedName("f.aa(Laa;B)V")
    public static final void method541(class33 arg0) {
        arg0.field732 = false;
        if (arg0.field756 != -1) {
            class38 var1 = class38.method507(arg0.field756);
            if (var1 == null || var1.field905 == null) {
                arg0.field756 = -1;
            } else {
                arg0.field758++;
                if (arg0.field731 < var1.field905.length && arg0.field758 > var1.field907[arg0.field731]) {
                    arg0.field758 = 1;
                    arg0.field731++;
                    method628(var1, arg0.field731, arg0.field740, arg0.field730);
                }
                if (arg0.field731 >= var1.field905.length) {
                    arg0.field758 = 0;
                    arg0.field731 = 0;
                    method628(var1, arg0.field731, arg0.field740, arg0.field730);
                }
            }
        }
        if (arg0.field764 != -1 && field343 >= arg0.field788) {
            if (arg0.field765 < 0) {
                arg0.field765 = 0;
            }
            int var2 = class39.method3391(arg0.field764).field928;
            if (var2 == -1) {
                arg0.field764 = -1;
            } else {
                class38 var3 = class38.method507(var2);
                if (var3 == null || var3.field905 == null) {
                    arg0.field764 = -1;
                } else {
                    arg0.field766++;
                    if (arg0.field765 < var3.field905.length && arg0.field766 > var3.field907[arg0.field765]) {
                        arg0.field766 = 1;
                        arg0.field765++;
                        method628(var3, arg0.field765, arg0.field740, arg0.field730);
                    }
                    if (arg0.field765 >= var3.field905.length && (arg0.field765 < 0 || arg0.field765 >= var3.field905.length)) {
                        arg0.field764 = -1;
                    }
                }
            }
        }
        if (arg0.field759 != -1 && arg0.field762 <= 1) {
            class38 var4 = class38.method507(arg0.field759);
            if (var4.field901 == 1 && arg0.field786 > 0 && arg0.field773 <= field343 && arg0.field778 < field343) {
                arg0.field762 = 1;
                return;
            }
        }
        if (arg0.field759 != -1 && arg0.field762 == 0) {
            class38 var5 = class38.method507(arg0.field759);
            if (var5 == null || var5.field905 == null) {
                arg0.field759 = -1;
            } else {
                arg0.field761++;
                if (arg0.field760 < var5.field905.length && arg0.field761 > var5.field907[arg0.field760]) {
                    arg0.field761 = 1;
                    arg0.field760++;
                    method628(var5, arg0.field760, arg0.field740, arg0.field730);
                }
                if (arg0.field760 >= var5.field905.length) {
                    arg0.field760 -= var5.field909;
                    arg0.field763++;
                    if (arg0.field763 >= var5.field920) {
                        arg0.field759 = -1;
                    } else if (arg0.field760 >= 0 && arg0.field760 < var5.field905.length) {
                        method628(var5, arg0.field760, arg0.field740, arg0.field730);
                    } else {
                        arg0.field759 = -1;
                    }
                }
                arg0.field732 = var5.field906;
            }
        }
        if (arg0.field762 > 0) {
            arg0.field762--;
        }
    }

    @ObfuscatedName("dm.af(I)V")
    public static final void method2624() {
        if (field350 != -1) {
            Statics.method154(field350);
        }
        for (int var0 = 0; var0 < field461; var0++) {
            if (field463[var0]) {
                field458[var0] = true;
            }
            field465[var0] = field463[var0];
            field463[var0] = false;
        }
        field514 = field343;
        field314 = -1;
        field370 = -1;
        Statics.field891 = null;
        if (field350 != -1) {
            field461 = 0;
            method510(field350, 0, 0, 765, 503, 0, 0, -1);
        }
        class73.method1556();
        if (field400) {
            method146();
        } else if (field314 != -1) {
            method1936(field314, field370);
        }
        if (field300 == 3) {
            for (int var1 = 0; var1 < field461; var1++) {
                if (field465[var1]) {
                    class73.method1561(field450[var1], field437[var1], field468[var1], field469[var1], 16711935, 128);
                } else if (field458[var1]) {
                    class73.method1561(field450[var1], field437[var1], field468[var1], field469[var1], 16711680, 128);
                }
            }
        }
        class20.method542(Statics.field243, Statics.field1248.field740, Statics.field1248.field730, field332);
        field332 = 0;
    }

    @ObfuscatedName("n.aj(Ljava/lang/String;ZI)V")
    public static final void method48(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1984.method3403(arg0, 250);
        int var6 = Statics.field1984.method3404(arg0, 250) * 13;
        class73.method1605(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1564(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1984.method3399(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2518(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2521(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1272.getGraphics();
            Statics.field2011.method1398(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1272.repaint();
        }
    }

    @ObfuscatedName("cj.az(IIIIB)V")
    public static final void method1935(int arg0, int arg1, int arg2, int arg3) {
        class73.method1554(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class84.method1835();
        field262++;
        method14(class29.field692);
        boolean var4 = false;
        if (field391 >= 0) {
            for (int var5 = 0; var5 < field377; var5++) {
                if (field391 == field378[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method14(class29.field688);
        }
        method2560(true);
        method14(var4 ? class29.field690 : class29.field689);
        method2560(false);
        for (class7 var6 = (class7) field477.method3303(); var6 != null; var6 = (class7) field477.method3300()) {
            if (Statics.field243 != var6.field101 || field343 > var6.field100) {
                var6.method3378();
            } else if (field343 >= var6.field125) {
                if (var6.field110 > 0) {
                    class30 var7 = field410[var6.field110 - 1];
                    if (var7 != null && var7.field740 >= 0 && var7.field740 < 13312 && var7.field730 >= 0 && var7.field730 < 13312) {
                        var6.method86(var7.field740, var7.field730, method124(var7.field740, var7.field730, var6.field101) - var6.field129, field343);
                    }
                }
                if (var6.field110 < 0) {
                    int var8 = -var6.field110 - 1;
                    class3 var9;
                    if (field382 == var8) {
                        var9 = Statics.field1248;
                    } else {
                        var9 = field333[var8];
                    }
                    if (var9 != null && var9.field740 >= 0 && var9.field740 < 13312 && var9.field730 >= 0 && var9.field730 < 13312) {
                        var6.method86(var9.field740, var9.field730, method124(var9.field740, var9.field730, var6.field101) - var6.field129, field343);
                    }
                }
                var6.method81(field332);
                Statics.field2687.method1665(Statics.field243, (int) var6.field112, (int) var6.field113, (int) var6.field114, 60, var6, var6.field116, -1, false);
            }
        }
        for (class26 var10 = (class26) field311.method3303(); var10 != null; var10 = (class26) field311.method3300()) {
            if (Statics.field243 != var10.field625 || var10.field632) {
                var10.method3378();
            } else if (field343 >= var10.field631) {
                var10.method547(field332);
                if (var10.field632) {
                    var10.method3378();
                } else {
                    Statics.field2687.method1665(var10.field625, var10.field626, var10.field624, var10.field627, 60, var10, 0, -1, false);
                }
            }
        }
        if (!field502) {
            int var11 = field340;
            if (field419 / 256 > var11) {
                var11 = field419 / 256;
            }
            if (field503[4] && field306[4] + 128 > var11) {
                var11 = field306[4] + 128;
            }
            int var12 = field396 + field324 & 0x7FF;
            method153(Statics.field2469, method124(Statics.field1248.field740, Statics.field1248.field730, Statics.field243) - 50, Statics.field1274, var11, var12, var11 * 3 + 600);
        }
        int var13;
        if (field502) {
            int var14;
            if (Statics.field813.field145) {
                var14 = Statics.field243;
            } else {
                int var15 = method124(Statics.field1457, Statics.field283, Statics.field243);
                if (var15 - Statics.field1354 >= 800 || (class6.field95[Statics.field243][Statics.field1457 >> 7][Statics.field283 >> 7] & 0x4) == 0) {
                    var14 = 3;
                } else {
                    var14 = Statics.field243;
                }
            }
            var13 = var14;
        } else {
            var13 = method34();
        }
        int var16 = Statics.field1457;
        int var17 = Statics.field1354;
        int var18 = Statics.field283;
        int var19 = Statics.field134;
        int var20 = Statics.field137;
        for (int var21 = 0; var21 < 5; var21++) {
            if (field503[var21]) {
                int var22 = (int) (Math.random() * (double) (field471[var21] * 2 + 1) - (double) field471[var21] + Math.sin((double) field276[var21] / 100.0D * (double) field507[var21]) * (double) field306[var21]);
                if (var21 == 0) {
                    Statics.field1457 += var22;
                }
                if (var21 == 1) {
                    Statics.field1354 += var22;
                }
                if (var21 == 2) {
                    Statics.field283 += var22;
                }
                if (var21 == 3) {
                    Statics.field137 = Statics.field137 + var22 & 0x7FF;
                }
                if (var21 == 4) {
                    Statics.field134 += var22;
                    if (Statics.field134 < 128) {
                        Statics.field134 = 128;
                    }
                    if (Statics.field134 > 383) {
                        Statics.field134 = 383;
                    }
                }
            }
        }
        int var23 = class127.field1990;
        int var24 = class127.field1995;
        if (class127.field2003 != 0) {
            var23 = class127.field1988;
            var24 = class127.field2002;
        }
        if (var23 >= arg0 && var23 < arg0 + arg2 && var24 >= arg1 && var24 < arg1 + arg3) {
            class98.field1752 = true;
            class98.field1740 = 0;
            class98.field1753 = var23 - arg0;
            class98.field1754 = var24 - arg1;
        } else {
            class98.field1752 = false;
            class98.field1740 = 0;
        }
        Statics.method161();
        class73.method1605(arg0, arg1, arg2, arg3, 0);
        Statics.method161();
        Statics.field2687.method1691(Statics.field1457, Statics.field1354, Statics.field283, Statics.field134, Statics.field137, var13);
        Statics.method161();
        Statics.field2687.method1817();
        field349 = 0;
        boolean var25 = false;
        int var26 = -1;
        for (int var27 = -1; var27 < field377 + field294; var27++) {
            class33 var28;
            if (var27 == -1) {
                var28 = Statics.field1248;
            } else if (var27 < field377) {
                var28 = field333[field378[var27]];
                if (field391 == field378[var27]) {
                    var25 = true;
                    var26 = var27;
                    continue;
                }
            } else {
                var28 = field410[field295[var27 - field377]];
            }
            method16(var28, var27, arg0, arg1, arg2, arg3);
        }
        if (var25) {
            method16(field333[field391], var26, arg0, arg1, arg2, arg3);
        }
        for (int var29 = 0; var29 < field349; var29++) {
            int var30 = field351[var29];
            int var31 = field316[var29];
            int var32 = field354[var29];
            int var33 = field353[var29];
            boolean var34 = true;
            while (var34) {
                var34 = false;
                for (int var35 = 0; var35 < var29; var35++) {
                    if (var31 + 2 > field316[var35] - field353[var35] && var31 - var33 < field316[var35] + 2 && var30 - var32 < field354[var35] + field351[var35] && var30 + var32 > field351[var35] - field354[var35] && field316[var35] - field353[var35] < var31) {
                        var31 = field316[var35] - field353[var35];
                        var34 = true;
                    }
                }
            }
            field361 = field351[var29];
            field260 = field316[var29] = var31;
            String var36 = field358[var29];
            if (field497 == 0) {
                int var37 = 16776960;
                if (field259[var29] < 6) {
                    var37 = field473[field259[var29]];
                }
                if (field259[var29] == 6) {
                    var37 = field262 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field259[var29] == 7) {
                    var37 = field262 % 20 < 10 ? 255 : 65535;
                }
                if (field259[var29] == 8) {
                    var37 = field262 % 20 < 10 ? 45056 : 8454016;
                }
                if (field259[var29] == 9) {
                    int var38 = 150 - field357[var29];
                    if (var38 < 50) {
                        var37 = var38 * 1280 + 16711680;
                    } else if (var38 < 100) {
                        var37 = 16776960 - (var38 - 50) * 327680;
                    } else if (var38 < 150) {
                        var37 = (var38 - 100) * 5 + 65280;
                    }
                }
                if (field259[var29] == 10) {
                    int var39 = 150 - field357[var29];
                    if (var39 < 50) {
                        var37 = var39 * 5 + 16711680;
                    } else if (var39 < 100) {
                        var37 = 16711935 - (var39 - 50) * 327680;
                    } else if (var39 < 150) {
                        var37 = (var39 - 100) * 327680 + 255 - (var39 - 100) * 5;
                    }
                }
                if (field259[var29] == 11) {
                    int var40 = 150 - field357[var29];
                    if (var40 < 50) {
                        var37 = 16777215 - var40 * 327685;
                    } else if (var40 < 100) {
                        var37 = (var40 - 50) * 327685 + 65280;
                    } else if (var40 < 150) {
                        var37 = 16777215 - (var40 - 100) * 327680;
                    }
                }
                if (field310[var29] == 0) {
                    Statics.field183.method3415(var36, field361 + arg0, field260 + arg1, var37, 0);
                }
                if (field310[var29] == 1) {
                    Statics.field183.method3485(var36, field361 + arg0, field260 + arg1, var37, 0, field262);
                }
                if (field310[var29] == 2) {
                    Statics.field183.method3410(var36, field361 + arg0, field260 + arg1, var37, 0, field262);
                }
                if (field310[var29] == 3) {
                    Statics.field183.method3466(var36, field361 + arg0, field260 + arg1, var37, 0, field262, 150 - field357[var29]);
                }
                if (field310[var29] == 4) {
                    int var41 = (150 - field357[var29]) * (Statics.field183.method3401(var36) + 100) / 150;
                    class73.method1585(field361 + arg0 - 50, arg1, field361 + arg0 + 50, arg1 + arg3);
                    Statics.field183.method3397(var36, field361 + arg0 + 50 - var41, field260 + arg1, var37, 0);
                    class73.method1554(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field310[var29] == 5) {
                    int var42 = 150 - field357[var29];
                    int var43 = 0;
                    if (var42 < 25) {
                        var43 = var42 - 25;
                    } else if (var42 > 125) {
                        var43 = var42 - 125;
                    }
                    class73.method1585(arg0, field260 + arg1 - Statics.field183.field2926 - 1, arg0 + arg2, field260 + arg1 + 5);
                    Statics.field183.method3415(var36, field361 + arg0, field260 + arg1 + var43, var37, 0);
                    class73.method1554(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field183.method3415(var36, field361 + arg0, field260 + arg1, 16776960, 0);
            }
        }
        method955(arg0, arg1);
        ((class88) Statics.field1486).method1920(field332);
        if (field255 == 1) {
            Statics.field1243[field365 / 100].method1478(field363 - 8, field364 - 8);
        }
        if (field255 == 2) {
            Statics.field1243[field365 / 100 + 4].method1478(field363 - 8, field364 - 8);
        }
        field483 = 0;
        int var44 = (Statics.field1248.field740 >> 7) + Statics.field1245;
        int var45 = (Statics.field1248.field730 >> 7) + Statics.field2495;
        if (var44 >= 3053 && var44 <= 3156 && var45 >= 3056 && var45 <= 3136) {
            field483 = 1;
        }
        if (var44 >= 3072 && var44 <= 3118 && var45 >= 9492 && var45 <= 9535) {
            field483 = 1;
        }
        if (field483 == 1 && var44 >= 3139 && var44 <= 3199 && var45 >= 3008 && var45 <= 3062) {
            field483 = 0;
        }
        if (field321) {
            int var46 = arg0 + 512 - 5;
            int var47 = arg1 + 20;
            Statics.field1984.method3407("Fps:" + field2043, var46, var47, 16776960, -1);
            int var54 = var47 + 15;
            Runtime var48 = Runtime.getRuntime();
            int var49 = (int) ((var48.totalMemory() - var48.freeMemory()) / 1024L);
            int var50 = 16776960;
            if (var49 > 32768 && field459) {
                var50 = 16711680;
            }
            if (var49 > 65536 && !field459) {
                var50 = 16711680;
            }
            Statics.field1984.method3407("Mem:" + var49 + "k", var46, var54, var50, -1);
            var47 = var54 + 15;
        }
        Statics.field1457 = var16;
        Statics.field1354 = var17;
        Statics.field283 = var18;
        Statics.field134 = var19;
        Statics.field137 = var20;
        if (field263) {
            byte var51 = 0;
            int var52 = class151.field2512 + class151.field2503 + var51;
            if (var52 == 0) {
                field263 = false;
            }
        }
        if (field263) {
            class73.method1605(arg0, arg1, arg2, arg3, 0);
            method48(class143.field2156, false);
        }
    }

    @ObfuscatedName("g.ae(Lat;S)V")
    public static final void method14(class29 arg0) {
        if (Statics.field1248.field740 >> 7 == field487 && Statics.field1248.field730 >> 7 == field309) {
            field487 = 0;
        }
        int var1 = field377;
        if (class29.field692 == arg0 || class29.field688 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field692 == arg0) {
                var3 = Statics.field1248;
                var4 = 33538048;
            } else if (class29.field688 == arg0) {
                var3 = field333[field391];
                var4 = field391 << 14;
            } else {
                var3 = field333[field378[var2]];
                var4 = field378[var2] << 14;
                if (class29.field690 == arg0 && field391 == field378[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method21() && !var3.field43) {
                var3.field38 = false;
                if ((field459 && field377 > 50 || field377 > 200) && class29.field692 != arg0 && var3.field756 == var3.field734) {
                    var3.field38 = true;
                }
                int var5 = var3.field740 >> 7;
                int var6 = var3.field730 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field34 == null || field343 < var3.field37 || field343 >= var3.field30) {
                        if ((var3.field740 & 0x7F) == 64 && (var3.field730 & 0x7F) == 64) {
                            if (field262 == field356[var5][var6]) {
                                continue;
                            }
                            field356[var5][var6] = field262;
                        }
                        var3.field36 = method124(var3.field740, var3.field730, Statics.field243);
                        Statics.field2687.method1665(Statics.field243, var3.field740, var3.field730, var3.field36, 60, var3, var3.field774, var4, var3.field732);
                    } else {
                        var3.field38 = false;
                        var3.field36 = method124(var3.field740, var3.field730, Statics.field243);
                        Statics.field2687.method1682(Statics.field243, var3.field740, var3.field730, var3.field36, 60, var3, var3.field774, var4, var3.field50, var3.field53, var3.field45, var3.field46);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dd.av(ZI)V")
    public static final void method2560(boolean arg0) {
        for (int var1 = 0; var1 < field294; var1++) {
            class30 var2 = field410[field295[var1]];
            int var3 = (field295[var1] << 14) + 536870912;
            if (var2 != null && var2.method21() && var2.field701.field825 == arg0 && var2.field701.method630()) {
                int var4 = var2.field740 >> 7;
                int var5 = var2.field730 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field733 == 1 && (var2.field740 & 0x7F) == 64 && (var2.field730 & 0x7F) == 64) {
                        if (field262 == field356[var4][var5]) {
                            continue;
                        }
                        field356[var4][var5] = field262;
                    }
                    if (!var2.field701.field833) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2687.method1665(Statics.field243, var2.field740, var2.field730, method124(var2.field740 + (var2.field733 * 64 - 64), var2.field730 + (var2.field733 * 64 - 64), Statics.field243), var2.field733 * 64 - 64 + 60, var2, var2.field774, var3, var2.field732);
                }
            }
        }
    }

    @ObfuscatedName("x.ax(I)I")
    public static final int method34() {
        if (Statics.field813.field145) {
            return Statics.field243;
        }
        int var0 = 3;
        if (Statics.field134 < 310) {
            int var1 = Statics.field1457 >> 7;
            int var2 = Statics.field283 >> 7;
            int var3 = Statics.field1248.field740 >> 7;
            int var4 = Statics.field1248.field730 >> 7;
            if ((class6.field95[Statics.field243][var1][var2] & 0x4) != 0) {
                var0 = Statics.field243;
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
                    if ((class6.field95[Statics.field243][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field243;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field95[Statics.field243][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field243;
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
                    if ((class6.field95[Statics.field243][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field243;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field95[Statics.field243][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field243;
                        }
                    }
                }
            }
        }
        if ((class6.field95[Statics.field243][Statics.field1248.field740 >> 7][Statics.field1248.field730 >> 7] & 0x4) != 0) {
            var0 = Statics.field243;
        }
        return var0;
    }

    @ObfuscatedName("ar.ai(III)V")
    public static final void method955(int arg0, int arg1) {
        if (field273 == 2) {
            method706((field325 - Statics.field1245 << 7) + field279, (field293 - Statics.field2495 << 7) + field280, field278 * 2);
            if (field361 > -1 && field343 % 20 < 10) {
                Statics.field2033[0].method1478(field361 + arg0 - 12, field260 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("g.aq(Laa;IIIIIB)V")
    public static final void method16(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method21()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field701;
            if (var6.field830 != null) {
                var6 = var6.method636();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field377) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field43) {
                return;
            }
            if (var8.field32 != -1 || var8.field33 != -1) {
                method2450(arg0, arg0.field777 + 15);
                if (field361 > -1) {
                    if (var8.field32 != -1) {
                        Statics.field184[var8.field32].method1478(field361 + arg2 - 12, field260 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field33 != -1) {
                        Statics.field2703[var8.field33].method1478(field361 + arg2 - 12, field260 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field273 == 10 && field275 == field378[arg1]) {
                method2450(arg0, arg0.field777 + 15);
                if (field361 > -1) {
                    Statics.field2033[1].method1478(field361 + arg2 - 12, field260 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field701;
            if (var9.field830 != null) {
                var9 = var9.method636();
            }
            if (var9.field818 >= 0 && var9.field818 < Statics.field2703.length) {
                method2450(arg0, arg0.field777 + 15);
                if (field361 > -1) {
                    Statics.field2703[var9.field818].method1478(field361 + arg2 - 12, field260 + arg3 - 30);
                }
            }
            if (field273 == 1 && field274 == field295[arg1 - field377] && field343 % 20 < 10) {
                method2450(arg0, arg0.field777 + 15);
                if (field361 > -1) {
                    Statics.field2033[0].method1478(field361 + arg2 - 12, field260 + arg3 - 28);
                }
            }
        }
        if (arg0.field729 != null && (arg1 >= field377 || field359 == 4 || !arg0.field743 && (field359 == 0 || field359 == 3 || field359 == 1 && method936(((class3) arg0).field44, false)))) {
            method2450(arg0, arg0.field777);
            if (field361 > -1 && field349 < field464) {
                field354[field349] = Statics.field183.method3401(arg0.field729) / 2;
                field353[field349] = Statics.field183.field2926;
                field351[field349] = field361;
                field316[field349] = field260;
                field259[field349] = arg0.field745;
                field310[field349] = arg0.field769;
                field357[field349] = arg0.field744;
                field358[field349] = arg0.field729;
                field349++;
            }
        }
        if (arg0.field750 > field343) {
            method2450(arg0, arg0.field777 + 15);
            if (field361 > -1) {
                int var10;
                if (arg1 < field377) {
                    var10 = 30;
                } else {
                    class35 var11 = ((class30) arg0).field701;
                    var10 = var11.field826;
                }
                int var12 = arg0.field749 * var10 / arg0.field752;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field749 > 0) {
                    var12 = 1;
                }
                class73.method1605(field361 + arg2 - var10 / 2, field260 + arg3 - 3, var12, 5, 65280);
                class73.method1605(field361 + arg2 - var10 / 2 + var12, field260 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field770[var13] > field343) {
                method2450(arg0, arg0.field777 / 2);
                if (field361 > -1) {
                    if (var13 == 1) {
                        field260 -= 20;
                    }
                    if (var13 == 2) {
                        field361 -= 15;
                        field260 -= 10;
                    }
                    if (var13 == 3) {
                        field361 += 15;
                        field260 -= 10;
                    }
                    Statics.field633[arg0.field768[var13]].method1478(field361 + arg2 - 12, field260 + arg3 - 12);
                    Statics.field577.method3415(Integer.toString(arg0.field747[var13]), field361 + arg2 - 1, field260 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("da.ad(Laa;II)V")
    public static final void method2450(class33 arg0, int arg1) {
        method706(arg0.field740, arg0.field730, arg1);
    }

    @ObfuscatedName("aj.au(IIII)V")
    public static final void method706(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field361 = -1;
            field260 = -1;
            return;
        }
        int var3 = method124(arg0, arg1, Statics.field243) - arg2;
        int var4 = arg0 - Statics.field1457;
        int var5 = var3 - Statics.field1354;
        int var6 = arg1 - Statics.field283;
        int var7 = class84.field1489[Statics.field134];
        int var8 = class84.field1470[Statics.field134];
        int var9 = class84.field1489[Statics.field137];
        int var10 = class84.field1470[Statics.field137];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field361 = (var11 << 9) / var15 + 256;
            field260 = (var14 << 9) / var15 + 167;
        } else {
            field361 = -1;
            field260 = -1;
        }
    }

    @ObfuscatedName("d.ag(IIII)I")
    public static final int method124(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field95[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field84[var5][var3][var4] + class6.field84[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field84[var5][var3][var4 + 1] + class6.field84[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("b.ar(IIIIIII)V")
    public static final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class84.field1489[var6];
            int var12 = class84.field1470[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class84.field1489[var7];
            int var15 = class84.field1470[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1457 = arg0 - var8;
        Statics.field1354 = arg1 - var9;
        Statics.field283 = arg2 - var10;
        Statics.field134 = arg3;
        Statics.field137 = arg4;
    }

    @ObfuscatedName("em.am(ZI)V")
    public static final void method2948(boolean arg0) {
        field317 = arg0;
        if (!field317) {
            int var1 = field299.method2175();
            int var2 = field299.method2298();
            int var3 = field299.method2272();
            int var4 = field299.method2175();
            int var5 = field299.method2204();
            int var6 = (field394 - field299.field1837) / 16;
            Statics.field787 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    Statics.field787[var7][var8] = field299.method2305();
                }
            }
            Statics.field2685 = new int[var6];
            Statics.field105 = new int[var6];
            Statics.field341 = new int[var6];
            Statics.field693 = new byte[var6][];
            Statics.field580 = new byte[var6][];
            boolean var9 = false;
            if ((var5 / 8 == 48 || var5 / 8 == 49) && var1 / 8 == 48) {
                var9 = true;
            }
            if (var5 / 8 == 48 && var1 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var5 - 6) / 8; var11 <= (var5 + 6) / 8; var11++) {
                for (int var12 = (var1 - 6) / 8; var12 <= (var1 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field2685[var10] = var13;
                        Statics.field105[var10] = Statics.field29.method2801("m" + var11 + "_" + var12);
                        Statics.field341[var10] = Statics.field29.method2801("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method935(var5, var1, var3, var4, var2);
            return;
        }
        int var14 = field299.method2175();
        int var15 = field299.method2175();
        int var16 = field299.method2220();
        int var17 = field299.method2298();
        field299.method2425();
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = field299.method2409(1);
                    if (var21 == 1) {
                        field375[var18][var19][var20] = field299.method2409(26);
                    } else {
                        field375[var18][var19][var20] = -1;
                    }
                }
            }
        }
        field299.method2410();
        int var22 = (field394 - field299.field1837) / 16;
        Statics.field787 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.field787[var23][var24] = field299.method2214();
            }
        }
        int var25 = field299.method2175();
        Statics.field2685 = new int[var22];
        Statics.field105 = new int[var22];
        Statics.field341 = new int[var22];
        Statics.field693 = new byte[var22][];
        Statics.field580 = new byte[var22][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field375[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field2685[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field2685[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field105[var26] = Statics.field29.method2801("m" + var35 + "_" + var36);
                            Statics.field341[var26] = Statics.field29.method2801("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method935(var25, var14, var16, var15, var17);
    }

    @ObfuscatedName("ag.ab(IIIIII)V")
    public static final void method935(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field71 == arg0 && Statics.field164 == arg1 && field485 == arg2 || !field459) {
            return;
        }
        Statics.field71 = arg0;
        Statics.field164 = arg1;
        field485 = arg2;
        if (!field459) {
            field485 = 0;
        }
        method2490(25);
        method48(class143.field2156, true);
        int var5 = Statics.field1245;
        int var6 = Statics.field2495;
        Statics.field1245 = (arg0 - 6) * 8;
        Statics.field2495 = (arg1 - 6) * 8;
        int var7 = Statics.field1245 - var5;
        int var8 = Statics.field2495 - var6;
        int var9 = Statics.field1245;
        int var10 = Statics.field2495;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field410[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field782[var13] -= var7;
                    var12.field783[var13] -= var8;
                }
                var12.field740 -= var7 * 128;
                var12.field730 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field333[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field782[var16] -= var7;
                    var15.field783[var16] -= var8;
                }
                var15.field740 -= var7 * 128;
                var15.field730 -= var8 * 128;
            }
        }
        Statics.field243 = arg2;
        Statics.field1248.method609(arg3, arg4, false);
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
                        field470[var27][var23][var24] = field470[var27][var25][var26];
                    } else {
                        field470[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field393.method3303(); var28 != null; var28 = (class15) field393.method3300()) {
            var28.field208 -= var7;
            var28.field211 -= var8;
            if (var28.field208 < 0 || var28.field211 < 0 || var28.field208 >= 104 || var28.field211 >= 104) {
                var28.method3378();
            }
        }
        if (field487 != 0) {
            field487 -= var7;
            field309 -= var8;
        }
        field496 = 0;
        field502 = false;
        field482 = -1;
        field311.method3292();
        field477.method3292();
    }

    @ObfuscatedName("z.ac(ZB)V")
    public static final void method160(boolean arg0) {
        Statics.method161();
        field303++;
        if (field303 < 50 && !arg0) {
            return;
        }
        field303 = 0;
        if (field308 || Statics.field1109 == null) {
            return;
        }
        field297.method2408(231);
        try {
            Statics.field1109.method2636(field297.field1838, 0, field297.field1837);
            field297.field1837 = 0;
        } catch (IOException var2) {
            field308 = true;
        }
    }

    @ObfuscatedName("ao.ay(II)V")
    public static final void method626(int arg0) {
        int[] var1 = Statics.field60.field1312;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field95[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2687.method1687(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field95[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2687.method1687(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field60.method1480();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field95[arg0][var10][var9] & 0x18) == 0) {
                    method842(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field95[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method842(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field454 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field2687.method1807(Statics.field243, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class36.method2523(var14).field868;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field500[Statics.field243].field2964;
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
                        field486[field454] = Statics.field564[var15];
                        field484[field454] = var16;
                        field433[field454] = var17;
                        field454++;
                    }
                }
            }
        }
        Statics.field2011.method1462();
    }

    @ObfuscatedName("ai.ap(IIIIII)V")
    public static final void method842(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2687.method1679(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2687.method1683(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field60.field1312;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method2523(var12);
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
                class74 var14 = Statics.field977[var13.field869];
                if (var14 != null) {
                    int var15 = (var13.field853 * 4 - var14.field1329) / 2;
                    int var16 = (var13.field873 * 4 - var14.field1326) / 2;
                    var14.method1615(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field873) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2687.method1681(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2687.method1683(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method2523(var21);
            if (var22.field869 != -1) {
                class74 var23 = Statics.field977[var22.field869];
                if (var23 != null) {
                    int var24 = (var22.field853 * 4 - var23.field1329) / 2;
                    int var25 = (var22.field873 * 4 - var23.field1326) / 2;
                    var23.method1615(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field873) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field60.field1312;
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
        int var29 = Statics.field2687.method1807(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method2523(var30);
        if (var31.field869 == -1) {
            return;
        }
        class74 var32 = Statics.field977[var31.field869];
        if (var32 != null) {
            int var33 = (var31.field853 * 4 - var32.field1329) / 2;
            int var34 = (var31.field873 * 4 - var32.field1326) / 2;
            var32.method1615(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field873) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("dn.bj(I)V")
    public static final void method2519() {
        if (field265 == 30) {
            int var0 = field299.method2173();
            int var1 = (var0 >> 4 & 0x7) + Statics.field66;
            int var2 = (var0 & 0x7) + Statics.field207;
            int var3 = field299.method2175();
            int var4 = field299.method2204();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class25 var5 = new class25();
                var5.field617 = var4;
                var5.field616 = var3;
                if (field470[Statics.field243][var1][var2] == null) {
                    field470[Statics.field243][var1][var2] = new class178();
                }
                field470[Statics.field243][var1][var2].method3291(var5);
                method127(var1, var2);
            }
        } else if (field265 == 184) {
            int var6 = field299.method2272();
            int var7 = (var6 >> 4 & 0x7) + Statics.field66;
            int var8 = (var6 & 0x7) + Statics.field207;
            int var9 = field299.method2187();
            int var10 = var9 >> 2;
            int var11 = var9 & 0x3;
            int var12 = field319[var10];
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                method2653(Statics.field243, var7, var8, var12, -1, var10, var11, 0, -1);
            }
        } else if (field265 == 193) {
            int var13 = field299.method2173();
            int var14 = (var13 >> 4 & 0x7) + Statics.field66;
            int var15 = (var13 & 0x7) + Statics.field207;
            int var16 = field299.method2175();
            int var17 = field299.method2175();
            int var18 = field299.method2175();
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                class178 var19 = field470[Statics.field243][var14][var15];
                if (var19 != null) {
                    for (class25 var20 = (class25) var19.method3303(); var20 != null; var20 = (class25) var19.method3300()) {
                        if ((var16 & 0x7FFF) == var20.field617 && var20.field616 == var17) {
                            var20.field616 = var18;
                            break;
                        }
                    }
                    method127(var14, var15);
                }
            }
        } else if (field265 == 110) {
            int var21 = field299.method2173();
            int var22 = (var21 >> 4 & 0x7) + Statics.field66;
            int var23 = (var21 & 0x7) + Statics.field207;
            int var24 = var22 + field299.method2174();
            int var25 = var23 + field299.method2174();
            int var26 = field299.method2176();
            int var27 = field299.method2175();
            int var28 = field299.method2173() * 4;
            int var29 = field299.method2173() * 4;
            int var30 = field299.method2175();
            int var31 = field299.method2175();
            int var32 = field299.method2173();
            int var33 = field299.method2173();
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && var27 != 65535) {
                int var34 = var22 * 128 + 64;
                int var35 = var23 * 128 + 64;
                int var36 = var24 * 128 + 64;
                int var37 = var25 * 128 + 64;
                class7 var38 = new class7(var27, Statics.field243, var34, var35, method124(var34, var35, Statics.field243) - var28, field343 + var30, field343 + var31, var32, var33, var26, var29);
                var38.method86(var36, var37, method124(var36, var37, Statics.field243) - var29, field343 + var30);
                field477.method3291(var38);
            }
        } else {
            if (field265 == 252) {
                byte var39 = field299.method2283();
                byte var40 = field299.method2283();
                int var41 = field299.method2272();
                int var42 = (var41 >> 4 & 0x7) + Statics.field66;
                int var43 = (var41 & 0x7) + Statics.field207;
                int var44 = field299.method2220();
                int var45 = var44 >> 2;
                int var46 = var44 & 0x3;
                int var47 = field319[var45];
                int var48 = field299.method2175();
                int var49 = field299.method2205();
                byte var50 = field299.method2174();
                int var51 = field299.method2205();
                byte var52 = field299.method2174();
                int var53 = field299.method2204();
                class3 var54;
                if (field382 == var51) {
                    var54 = Statics.field1248;
                } else {
                    var54 = field333[var51];
                }
                if (var54 != null) {
                    class36 var55 = class36.method2523(var53);
                    int var56;
                    int var57;
                    if (var46 == 1 || var46 == 3) {
                        var56 = var55.field873;
                        var57 = var55.field853;
                    } else {
                        var56 = var55.field853;
                        var57 = var55.field873;
                    }
                    int var58 = (var56 >> 1) + var42;
                    int var59 = (var56 + 1 >> 1) + var42;
                    int var60 = (var57 >> 1) + var43;
                    int var61 = (var57 + 1 >> 1) + var43;
                    int[][] var62 = class6.field84[Statics.field243];
                    int var63 = var62[var58][var60] + var62[var59][var60] + var62[var58][var61] + var62[var59][var61] >> 2;
                    int var64 = (var42 << 7) + (var56 << 6);
                    int var65 = (var43 << 7) + (var57 << 6);
                    class98 var66 = var55.method668(var45, var46, var62, var64, var63, var65);
                    if (var66 != null) {
                        method2653(Statics.field243, var42, var43, var47, -1, 0, 0, var49 + 1, var48 + 1);
                        var54.field37 = field343 + var49;
                        var54.field30 = field343 + var48;
                        var54.field34 = var66;
                        var54.field39 = var42 * 128 + var56 * 64;
                        var54.field41 = var43 * 128 + var57 * 64;
                        var54.field40 = var63;
                        if (var50 > var40) {
                            byte var67 = var50;
                            var50 = var40;
                            var40 = var67;
                        }
                        if (var52 > var39) {
                            byte var68 = var52;
                            var52 = var39;
                            var39 = var68;
                        }
                        var54.field50 = var42 + var50;
                        var54.field45 = var40 + var42;
                        var54.field53 = var43 + var52;
                        var54.field46 = var39 + var43;
                    }
                }
            }
            if (field265 == 175) {
                int var69 = field299.method2220();
                int var70 = var69 >> 2;
                int var71 = var69 & 0x3;
                int var72 = field319[var70];
                int var73 = field299.method2187();
                int var74 = (var73 >> 4 & 0x7) + Statics.field66;
                int var75 = (var73 & 0x7) + Statics.field207;
                int var76 = field299.method2298();
                if (var74 >= 0 && var75 >= 0 && var74 < 103 && var75 < 103) {
                    if (var72 == 0) {
                        class80 var77 = Statics.field2687.method1755(Statics.field243, var74, var75);
                        if (var77 != null) {
                            int var78 = var77.field1425 >> 14 & 0x7FFF;
                            if (var70 == 2) {
                                var77.field1427 = new class11(var78, 2, var71 + 4, Statics.field243, var74, var75, var76, false, var77.field1427);
                                var77.field1428 = new class11(var78, 2, var71 + 1 & 0x3, Statics.field243, var74, var75, var76, false, var77.field1428);
                            } else {
                                var77.field1427 = new class11(var78, var70, var71, Statics.field243, var74, var75, var76, false, var77.field1427);
                            }
                        }
                    }
                    if (var72 == 1) {
                        class87 var79 = Statics.field2687.method1676(Statics.field243, var74, var75);
                        if (var79 != null) {
                            int var80 = var79.field1512 >> 14 & 0x7FFF;
                            if (var70 == 4 || var70 == 5) {
                                var79.field1510 = new class11(var80, 4, var71, Statics.field243, var74, var75, var76, false, var79.field1510);
                            } else if (var70 == 6) {
                                var79.field1510 = new class11(var80, 4, var71 + 4, Statics.field243, var74, var75, var76, false, var79.field1510);
                            } else if (var70 == 7) {
                                var79.field1510 = new class11(var80, 4, (var71 + 2 & 0x3) + 4, Statics.field243, var74, var75, var76, false, var79.field1510);
                            } else if (var70 == 8) {
                                var79.field1510 = new class11(var80, 4, var71 + 4, Statics.field243, var74, var75, var76, false, var79.field1510);
                                var79.field1504 = new class11(var80, 4, (var71 + 2 & 0x3) + 4, Statics.field243, var74, var75, var76, false, var79.field1504);
                            }
                        }
                    }
                    if (var72 == 2) {
                        class91 var81 = Statics.field2687.method1677(Statics.field243, var74, var75);
                        if (var70 == 11) {
                            var70 = 10;
                        }
                        if (var81 != null) {
                            var81.field1578 = new class11(var81.field1569 >> 14 & 0x7FFF, var70, var71, Statics.field243, var74, var75, var76, false, var81.field1578);
                        }
                    }
                    if (var72 == 3) {
                        class86 var82 = Statics.field2687.method1830(Statics.field243, var74, var75);
                        if (var82 != null) {
                            var82.field1491 = new class11(var82.field1495 >> 14 & 0x7FFF, 22, var71, Statics.field243, var74, var75, var76, false, var82.field1491);
                        }
                    }
                }
            } else {
                if (field265 == 55) {
                    int var83 = field299.method2173();
                    int var84 = (var83 >> 4 & 0x7) + Statics.field66;
                    int var85 = (var83 & 0x7) + Statics.field207;
                    int var86 = field299.method2175();
                    int var87 = field299.method2173();
                    int var88 = var87 >> 4 & 0xF;
                    int var89 = var87 & 0x7;
                    int var90 = field299.method2173();
                    if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                        int var91 = var88 + 1;
                        if (Statics.field1248.field782[0] >= var84 - var91 && Statics.field1248.field782[0] <= var84 + var91 && Statics.field1248.field783[0] >= var85 - var91 && Statics.field1248.field783[0] <= var85 + var91 && field495 != 0 && var89 > 0 && field496 < 50) {
                            field395[field496] = var86;
                            field498[field496] = var89;
                            field499[field496] = var90;
                            field271[field496] = null;
                            field290[field496] = (var84 << 16) + (var85 << 8) + var88;
                            field496++;
                        }
                    }
                }
                if (field265 == 109) {
                    int var92 = field299.method2173();
                    int var93 = (var92 >> 4 & 0x7) + Statics.field66;
                    int var94 = (var92 & 0x7) + Statics.field207;
                    int var95 = field299.method2175();
                    int var96 = field299.method2173();
                    int var97 = field299.method2175();
                    if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                        int var98 = var93 * 128 + 64;
                        int var99 = var94 * 128 + 64;
                        class26 var100 = new class26(var95, Statics.field243, var98, var99, method124(var98, var99, Statics.field243) - var96, var97, field343);
                        field311.method3291(var100);
                    }
                } else if (field265 == 12) {
                    int var101 = field299.method2204();
                    int var102 = field299.method2173();
                    int var103 = (var102 >> 4 & 0x7) + Statics.field66;
                    int var104 = (var102 & 0x7) + Statics.field207;
                    int var105 = field299.method2173();
                    int var106 = var105 >> 2;
                    int var107 = var105 & 0x3;
                    int var108 = field319[var106];
                    if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                        method2653(Statics.field243, var103, var104, var108, var101, var106, var107, 0, -1);
                    }
                } else if (field265 == 209) {
                    int var109 = field299.method2220();
                    int var110 = (var109 >> 4 & 0x7) + Statics.field66;
                    int var111 = (var109 & 0x7) + Statics.field207;
                    int var112 = field299.method2175();
                    if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                        class178 var113 = field470[Statics.field243][var110][var111];
                        if (var113 != null) {
                            for (class25 var114 = (class25) var113.method3303(); var114 != null; var114 = (class25) var113.method3300()) {
                                if ((var112 & 0x7FFF) == var114.field617) {
                                    var114.method3378();
                                    break;
                                }
                            }
                            if (var113.method3303() == null) {
                                field470[Statics.field243][var110][var111] = null;
                            }
                            method127(var110, var111);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.bm(IIIIIIIIII)V")
    public static final void method2653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field393.method3303(); var10 != null; var10 = (class15) field393.method3300()) {
            if (var10.field225 == arg0 && var10.field208 == arg1 && var10.field211 == arg2 && var10.field209 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field225 = arg0;
            var9.field209 = arg3;
            var9.field208 = arg1;
            var9.field211 = arg2;
            method164(var9);
            field393.method3291(var9);
        }
        var9.field215 = arg4;
        var9.field226 = arg5;
        var9.field216 = arg6;
        var9.field218 = arg7;
        var9.field222 = arg8;
    }

    @ObfuscatedName("db.by(S)V")
    public static final void method2645() {
        for (class15 var0 = (class15) field393.method3303(); var0 != null; var0 = (class15) field393.method3300()) {
            if (var0.field222 == -1) {
                var0.field218 = 0;
                method164(var0);
            } else {
                var0.method3378();
            }
        }
    }

    @ObfuscatedName("z.bp(Le;I)V")
    public static final void method164(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field209 == 0) {
            var1 = Statics.field2687.method1679(arg0.field225, arg0.field208, arg0.field211);
        }
        if (arg0.field209 == 1) {
            var1 = Statics.field2687.method1680(arg0.field225, arg0.field208, arg0.field211);
        }
        if (arg0.field209 == 2) {
            var1 = Statics.field2687.method1681(arg0.field225, arg0.field208, arg0.field211);
        }
        if (arg0.field209 == 3) {
            var1 = Statics.field2687.method1807(arg0.field225, arg0.field208, arg0.field211);
        }
        if (var1 != 0) {
            int var5 = Statics.field2687.method1683(arg0.field225, arg0.field208, arg0.field211, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field217 = var2;
        arg0.field214 = var3;
        arg0.field210 = var4;
    }

    @ObfuscatedName("et.bc(I)V")
    public static final void method2770() {
        for (class15 var0 = (class15) field393.method3303(); var0 != null; var0 = (class15) field393.method3300()) {
            if (var0.field222 > 0) {
                var0.field222--;
            }
            if (var0.field222 != 0) {
                if (var0.field218 > 0) {
                    var0.field218--;
                }
                if (var0.field218 == 0 && var0.field208 >= 1 && var0.field211 >= 1 && var0.field208 <= 102 && var0.field211 <= 102 && (var0.field215 < 0 || class6.method852(var0.field215, var0.field226))) {
                    method2432(var0.field225, var0.field209, var0.field208, var0.field211, var0.field215, var0.field216, var0.field226);
                    var0.field218 = -1;
                    if (var0.field217 == var0.field215 && var0.field217 == -1) {
                        var0.method3378();
                    } else if (var0.field217 == var0.field215 && var0.field216 == var0.field210 && var0.field226 == var0.field214) {
                        var0.method3378();
                    }
                }
            } else if (var0.field217 < 0 || class6.method852(var0.field217, var0.field214)) {
                method2432(var0.field225, var0.field209, var0.field208, var0.field211, var0.field217, var0.field210, var0.field214);
                var0.method3378();
            }
        }
    }

    @ObfuscatedName("dz.bd(IIIIIIII)V")
    public static final void method2432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field459 && Statics.field243 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2687.method1679(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2687.method1680(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2687.method1681(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2687.method1807(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2687.method1683(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2687.method1701(arg0, arg2, arg3);
                class36 var15 = class36.method2523(var12);
                if (var15.field857 != 0) {
                    field500[arg0].method3553(arg2, arg3, var13, var14, var15.field858);
                }
            }
            if (arg1 == 1) {
                Statics.field2687.method1822(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2687.method1672(arg0, arg2, arg3);
                class36 var16 = class36.method2523(var12);
                if (var16.field853 + arg2 > 103 || var16.field853 + arg3 > 103 || var16.field873 + arg2 > 103 || var16.field873 + arg3 > 103) {
                    return;
                }
                if (var16.field857 != 0) {
                    field500[arg0].method3554(arg2, arg3, var16.field853, var16.field873, var14, var16.field858);
                }
            }
            if (arg1 == 3) {
                Statics.field2687.method1673(arg0, arg2, arg3);
                class36 var17 = class36.method2523(var12);
                if (var17.field857 == 1) {
                    field500[arg0].method3555(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field95[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method2579(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field2687, field500[arg0]);
    }

    @ObfuscatedName("h.bk(IIB)V")
    public static final void method127(int arg0, int arg1) {
        class178 var2 = field470[Statics.field243][arg0][arg1];
        if (var2 == null) {
            Statics.field2687.method1736(Statics.field243, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3303(); var6 != null; var6 = (class25) var2.method3300()) {
            class45 var7 = class45.method588(var6.field617);
            long var8 = (long) var7.field1044;
            if (var7.field1023 == 1) {
                var8 = (long) (var6.field616 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2687.method1736(Statics.field243, arg0, arg1);
            return;
        }
        var2.method3294(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3303(); var12 != null; var12 = (class25) var2.method3300()) {
            if (var5.field617 != var12.field617) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field617 != var12.field617 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2687.method1729(Statics.field243, arg0, arg1, method124(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field243), var5, var13, var10, var11);
    }

    @ObfuscatedName("ak.bn(S)V")
    public static final void method607() {
        field384 = 0;
        field379 = 0;
        method1070();
        int var0 = field299.method2409(8);
        if (var0 < field377) {
            for (int var1 = var0; var1 < field377; var1++) {
                field385[++field384 - 1] = field378[var1];
            }
        }
        if (var0 > field377) {
            throw new RuntimeException("");
        }
        field377 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field378[var2];
            class3 var4 = field333[var3];
            int var5 = field299.method2409(1);
            if (var5 == 0) {
                field378[++field377 - 1] = var3;
                var4.field748 = field343;
            } else {
                int var6 = field299.method2409(2);
                if (var6 == 0) {
                    field378[++field377 - 1] = var3;
                    var4.field748 = field343;
                    field380[++field379 - 1] = var3;
                } else if (var6 == 1) {
                    field378[++field377 - 1] = var3;
                    var4.field748 = field343;
                    int var7 = field299.method2409(3);
                    var4.method611(var7, false);
                    int var8 = field299.method2409(1);
                    if (var8 == 1) {
                        field380[++field379 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field378[++field377 - 1] = var3;
                    var4.field748 = field343;
                    int var9 = field299.method2409(3);
                    var4.method611(var9, true);
                    int var10 = field299.method2409(3);
                    var4.method611(var10, true);
                    int var11 = field299.method2409(1);
                    if (var11 == 1) {
                        field380[++field379 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field385[++field384 - 1] = var3;
                }
            }
        }
        while (field299.method2411(field394) >= 11) {
            int var12 = field299.method2409(11);
            if (var12 == 2047) {
                break;
            }
            boolean var16 = false;
            if (field333[var12] == null) {
                field333[var12] = new class3();
                if (field315[var12] != null) {
                    field333[var12].method22(field315[var12]);
                }
                var16 = true;
            }
            field378[++field377 - 1] = var12;
            class3 var17 = field333[var12];
            var17.field748 = field343;
            int var18 = field299.method2409(1);
            int var19 = field299.method2409(5);
            if (var19 > 15) {
                var19 -= 32;
            }
            int var20 = field299.method2409(1);
            if (var20 == 1) {
                field380[++field379 - 1] = var12;
            }
            int var21 = field390[field299.method2409(3)];
            if (var16) {
                var17.field754 = var17.field774 = var21;
            }
            int var22 = field299.method2409(5);
            if (var22 > 15) {
                var22 -= 32;
            }
            var17.method609(Statics.field1248.field782[0] + var22, Statics.field1248.field783[0] + var19, var18 == 1);
        }
        field299.method2410();
        method43();
        for (int var13 = 0; var13 < field384; var13++) {
            int var14 = field385[var13];
            if (field343 != field333[var14].field748) {
                field333[var14] = null;
            }
        }
        if (field394 != field299.field1837) {
            throw new RuntimeException(field299.field1837 + class2.field19 + field394);
        }
        for (int var15 = 0; var15 < field377; var15++) {
            if (field333[field378[var15]] == null) {
                throw new RuntimeException(var15 + class2.field19 + field377);
            }
        }
    }

    @ObfuscatedName("ah.bt(I)V")
    public static final void method1070() {
        field299.method2425();
        int var0 = field299.method2409(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field299.method2409(2);
        if (var1 == 0) {
            field380[++field379 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field299.method2409(3);
            Statics.field1248.method611(var2, false);
            int var3 = field299.method2409(1);
            if (var3 == 1) {
                field380[++field379 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field299.method2409(3);
            Statics.field1248.method611(var4, true);
            int var5 = field299.method2409(3);
            Statics.field1248.method611(var5, true);
            int var6 = field299.method2409(1);
            if (var6 == 1) {
                field380[++field379 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field299.method2409(7);
            int var8 = field299.method2409(1);
            if (var8 == 1) {
                field380[++field379 - 1] = 2047;
            }
            Statics.field243 = field299.method2409(2);
            int var9 = field299.method2409(1);
            int var10 = field299.method2409(7);
            Statics.field1248.method609(var10, var7, var9 == 1);
        }
    }

    @ObfuscatedName("c.bz(B)V")
    public static final void method43() {
        for (int var0 = 0; var0 < field379; var0++) {
            int var1 = field380[var0];
            class3 var2 = field333[var1];
            int var3 = field299.method2173();
            if ((var3 & 0x20) != 0) {
                var3 += field299.method2173() << 8;
            }
            if ((var3 & 0x400) != 0) {
                var2.field776 = field299.method2272();
                var2.field771 = field299.method2220();
                var2.field737 = field299.method2187();
                var2.field772 = field299.method2173();
                var2.field773 = field299.method2175() + field343;
                var2.field778 = field299.method2204() + field343;
                var2.field775 = field299.method2187();
                var2.field781 = 1;
                var2.field786 = 0;
            }
            if ((var3 & 0x10) != 0) {
                var2.field739 = field299.method2175();
                if (var2.field739 == 65535) {
                    var2.field739 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var4 = field299.method2175();
                int var5 = field299.method2220();
                var2.method614(var4, var5, field343);
                var2.field750 = field343 + 300;
                var2.field749 = field299.method2187();
                var2.field752 = field299.method2220();
            }
            if ((var3 & 0x4) != 0) {
                var2.field757 = field299.method2204();
                var2.field755 = field299.method2205();
            }
            if ((var3 & 0x100) != 0) {
                var2.field764 = field299.method2204();
                int var6 = field299.method2305();
                var2.field767 = var6 >> 16;
                var2.field788 = (var6 & 0xFFFF) + field343;
                var2.field765 = 0;
                var2.field766 = 0;
                if (var2.field788 > field343) {
                    var2.field765 = -1;
                }
                if (var2.field764 == 65535) {
                    var2.field764 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                int var7 = field299.method2220();
                byte[] var8 = new byte[var7];
                class107 var9 = new class107(var8);
                field299.method2217(var8, 0, var7);
                field315[var1] = var9;
                var2.method22(var9);
            }
            if ((var3 & 0x40) != 0) {
                var2.field729 = field299.method2351();
                if (var2.field729.charAt(0) == '~') {
                    var2.field729 = var2.field729.substring(1);
                    class10.method849(2, var2.field44, var2.field729);
                } else if (Statics.field1248 == var2) {
                    class10.method849(2, var2.field44, var2.field729);
                }
                var2.field743 = false;
                var2.field745 = 0;
                var2.field769 = 0;
                var2.field744 = 150;
            }
            if ((var3 & 0x80) != 0) {
                int var10 = field299.method2205();
                class138 var11 = (class138) class99.method496(class138.method107(), field299.method2187());
                boolean var12 = field299.method2272() == 1;
                int var13 = field299.method2272();
                int var14 = field299.field1837;
                if (var2.field44 != null && var2.field47 != null) {
                    boolean var15 = false;
                    if (var11.field2097 && method514(var2.field44)) {
                        var15 = true;
                    }
                    if (!var15 && field483 == 0 && !var2.field43) {
                        field281.field1837 = 0;
                        field299.method2216(field281.field1838, 0, var13);
                        field281.field1837 = 0;
                        class107 var16 = field281;
                        String var20;
                        try {
                            int var17 = var16.method2186();
                            if (var17 > 32767) {
                                var17 = 32767;
                            }
                            byte[] var18 = new byte[var17];
                            var16.field1837 += Statics.field2905.method2104(var16.field1838, var16.field1837, var18, 0, var17);
                            String var19 = class202.method3084(var18, 0, var17);
                            var20 = var19;
                        } catch (Exception var32) {
                            var20 = "Cabbage";
                        }
                        String var23 = class193.method3405(class200.method540(var20));
                        var2.field729 = var23.trim();
                        var2.field745 = var10 >> 8;
                        var2.field769 = var10 & 0xFF;
                        var2.field744 = 150;
                        var2.field743 = var12;
                        int var24;
                        if (var11.field2095) {
                            var24 = var12 ? 91 : 1;
                        } else {
                            var24 = var12 ? 90 : 2;
                        }
                        if (var11.field2103 == -1) {
                            class10.method849(var24, var2.field44, var23);
                        } else {
                            int var26 = var11.field2103;
                            String var27 = "<img=" + var26 + ">";
                            class10.method849(var24, var27 + var2.field44, var23);
                        }
                    }
                }
                field299.field1837 = var13 + var14;
            }
            if ((var3 & 0x200) != 0) {
                int var28 = field299.method2205();
                int var29 = field299.method2187();
                var2.method614(var28, var29, field343);
                var2.field750 = field343 + 300;
                var2.field749 = field299.method2173();
                var2.field752 = field299.method2220();
            }
            if ((var3 & 0x8) != 0) {
                int var30 = field299.method2204();
                if (var30 == 65535) {
                    var30 = -1;
                }
                int var31 = field299.method2220();
                Statics.method3390(var2, var30, var31);
            }
        }
    }

    @ObfuscatedName("dy.bh(I)V")
    public static final void method2629() {
        field384 = 0;
        field379 = 0;
        method2767();
        method54();
        method597();
        for (int var0 = 0; var0 < field384; var0++) {
            int var1 = field385[var0];
            if (field343 != field410[var1].field748) {
                field410[var1].field701 = null;
                field410[var1] = null;
            }
        }
        if (field394 != field299.field1837) {
            throw new RuntimeException(field299.field1837 + class2.field19 + field394);
        }
        for (int var2 = 0; var2 < field294; var2++) {
            if (field410[field295[var2]] == null) {
                throw new RuntimeException(var2 + class2.field19 + field294);
            }
        }
    }

    @ObfuscatedName("eg.bo(B)V")
    public static final void method2767() {
        field299.method2425();
        int var0 = field299.method2409(8);
        if (var0 < field294) {
            for (int var1 = var0; var1 < field294; var1++) {
                field385[++field384 - 1] = field295[var1];
            }
        }
        if (var0 > field294) {
            throw new RuntimeException("");
        }
        field294 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field295[var2];
            class30 var4 = field410[var3];
            int var5 = field299.method2409(1);
            if (var5 == 0) {
                field295[++field294 - 1] = var3;
                var4.field748 = field343;
            } else {
                int var6 = field299.method2409(2);
                if (var6 == 0) {
                    field295[++field294 - 1] = var3;
                    var4.field748 = field343;
                    field380[++field379 - 1] = var3;
                } else if (var6 == 1) {
                    field295[++field294 - 1] = var3;
                    var4.field748 = field343;
                    int var7 = field299.method2409(3);
                    var4.method611(var7, false);
                    int var8 = field299.method2409(1);
                    if (var8 == 1) {
                        field380[++field379 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field295[++field294 - 1] = var3;
                    var4.field748 = field343;
                    int var9 = field299.method2409(3);
                    var4.method611(var9, true);
                    int var10 = field299.method2409(3);
                    var4.method611(var10, true);
                    int var11 = field299.method2409(1);
                    if (var11 == 1) {
                        field380[++field379 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field385[++field384 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("s.bf(B)V")
    public static final void method54() {
        while (true) {
            if (field299.method2411(field394) >= 27) {
                int var0 = field299.method2409(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field410[var0] == null) {
                        field410[var0] = new class30();
                        var1 = true;
                    }
                    class30 var2 = field410[var0];
                    field295[++field294 - 1] = var0;
                    var2.field748 = field343;
                    int var3 = field390[field299.method2409(3)];
                    if (var1) {
                        var2.field754 = var2.field774 = var3;
                    }
                    int var4 = field299.method2409(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field299.method2409(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field299.method2409(1);
                    if (var6 == 1) {
                        field380[++field379 - 1] = var0;
                    }
                    var2.field701 = class35.method586(field299.method2409(14));
                    int var7 = field299.method2409(1);
                    var2.field733 = var2.field701.field827;
                    var2.field780 = var2.field701.field829;
                    if (var2.field780 == 0) {
                        var2.field774 = 0;
                    }
                    var2.field746 = var2.field701.field812;
                    var2.field738 = var2.field701.field804;
                    var2.field784 = var2.field701.field836;
                    var2.field751 = var2.field701.field815;
                    var2.field734 = var2.field701.field807;
                    var2.field735 = var2.field701.field810;
                    var2.field736 = var2.field701.field811;
                    var2.method609(Statics.field1248.field782[0] + var4, Statics.field1248.field783[0] + var5, var7 == 1);
                    continue;
                }
            }
            field299.method2410();
            return;
        }
    }

    @ObfuscatedName("as.bi(B)V")
    public static final void method597() {
        for (int var0 = 0; var0 < field379; var0++) {
            int var1 = field380[var0];
            class30 var2 = field410[var1];
            int var3 = field299.method2173();
            if ((var3 & 0x40) != 0) {
                int var4 = field299.method2272();
                int var5 = field299.method2272();
                var2.method614(var4, var5, field343);
                var2.field750 = field343 + 300;
                var2.field749 = field299.method2298();
                var2.field752 = field299.method2205();
            }
            if ((var3 & 0x4) != 0) {
                var2.field757 = field299.method2298();
                var2.field755 = field299.method2205();
            }
            if ((var3 & 0x80) != 0) {
                var2.field729 = field299.method2351();
                var2.field744 = 100;
            }
            if ((var3 & 0x2) != 0) {
                var2.field739 = field299.method2205();
                if (var2.field739 == 65535) {
                    var2.field739 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field764 = field299.method2298();
                int var6 = field299.method2196();
                var2.field767 = var6 >> 16;
                var2.field788 = (var6 & 0xFFFF) + field343;
                var2.field765 = 0;
                var2.field766 = 0;
                if (var2.field788 > field343) {
                    var2.field765 = -1;
                }
                if (var2.field764 == 65535) {
                    var2.field764 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                int var7 = field299.method2298();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field299.method2187();
                if (var2.field759 == var7 && var7 != -1) {
                    int var9 = class38.method507(var7).field900;
                    if (var9 == 1) {
                        var2.field760 = 0;
                        var2.field761 = 0;
                        var2.field762 = var8;
                        var2.field763 = 0;
                    }
                    if (var9 == 2) {
                        var2.field763 = 0;
                    }
                } else if (var7 == -1 || var2.field759 == -1 || class38.method507(var7).field912 >= class38.method507(var2.field759).field912) {
                    var2.field759 = var7;
                    var2.field760 = 0;
                    var2.field761 = 0;
                    var2.field762 = var8;
                    var2.field763 = 0;
                    var2.field786 = var2.field781;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field701 = class35.method586(field299.method2175());
                var2.field733 = var2.field701.field827;
                var2.field780 = var2.field701.field829;
                var2.field746 = var2.field701.field812;
                var2.field738 = var2.field701.field804;
                var2.field784 = var2.field701.field836;
                var2.field751 = var2.field701.field815;
                var2.field734 = var2.field701.field807;
                var2.field735 = var2.field701.field810;
                var2.field736 = var2.field701.field811;
            }
            if ((var3 & 0x1) != 0) {
                int var10 = field299.method2173();
                int var11 = field299.method2187();
                var2.method614(var10, var11, field343);
                var2.field750 = field343 + 300;
                var2.field749 = field299.method2298();
                var2.field752 = field299.method2298();
            }
        }
    }

    @ObfuscatedName("cj.bg(III)V")
    public static final void method1936(int arg0, int arg1) {
        if (field401 < 2 && field506 == 0 && !field302) {
            return;
        }
        String var2;
        if (field506 == 1 && field401 < 2) {
            var2 = class143.field2297 + class143.field2307 + field413 + " " + class2.field27;
        } else if (field302 && field401 < 2) {
            var2 = field327 + class143.field2307 + field412 + " " + class2.field27;
        } else {
            var2 = method2016(field401 - 1);
        }
        if (field401 > 2) {
            var2 = var2 + class2.method660(16777215) + " " + '/' + " " + (field401 - 2) + class143.field2335;
        }
        Statics.field183.method3412(var2, arg0 + 4, arg1 + 15, 16777215, 0, field343 / 1000);
    }

    @ObfuscatedName("v.bq(I)V")
    public static final void method146() {
        int var0 = Statics.field2104;
        int var1 = Statics.field2819;
        int var2 = Statics.field200;
        int var3 = Statics.field562;
        int var4 = 6116423;
        class73.method1605(var0, var1, var2, var3, var4);
        class73.method1605(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class73.method1564(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field183.method3397(class143.field2300, var0 + 3, var1 + 14, var4, -1);
        int var5 = class127.field1990;
        int var6 = class127.field1995;
        for (int var7 = 0; var7 < field401; var7++) {
            int var8 = (field401 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field183.method3397(method2016(var7), var0 + 3, var8, var9, 0);
        }
        method2521(Statics.field2104, Statics.field2819, Statics.field200, Statics.field562);
    }

    @ObfuscatedName("ds.bx(IIIIB)V")
    public static final void method2518(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field461; var4++) {
            if (field468[var4] + field450[var4] > arg0 && field450[var4] < arg0 + arg2 && field469[var4] + field437[var4] > arg1 && field437[var4] < arg1 + arg3) {
                field463[var4] = true;
            }
        }
    }

    @ObfuscatedName("dn.bv(IIIII)V")
    public static final void method2521(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field461; var4++) {
            if (field468[var4] + field450[var4] > arg0 && field450[var4] < arg0 + arg2 && field469[var4] + field437[var4] > arg1 && field437[var4] < arg1 + arg3) {
                field458[var4] = true;
            }
        }
    }

    @ObfuscatedName("ar.ba(IIB)V")
    public static final void method950(int arg0, int arg1) {
        int var2 = Statics.field183.method3401(class143.field2300);
        for (int var3 = 0; var3 < field401; var3++) {
            int var4 = Statics.field183.method3401(method2016(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field401 * 15 + 21;
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
        field400 = true;
        Statics.field2104 = var6;
        Statics.field2819 = var7;
        Statics.field200 = var2;
        Statics.field562 = field401 * 15 + 22;
    }

    @ObfuscatedName("bq.bs(II)Z")
    public static final boolean method1393(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field508[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("d.bw(II)V")
    public static final void method123(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field402[arg0];
        int var2 = field403[arg0];
        int var3 = field508[arg0];
        int var4 = field405[arg0];
        String var5 = field406[arg0];
        String var6 = field407[arg0];
        method150(var1, var2, var3, var4, var5, var6, class127.field1988, class127.field2002);
    }

    @ObfuscatedName("ep.bu(Lan;III)V")
    public static final void method2756(class27 arg0, int arg1, int arg2) {
        method150(arg0.field640, arg0.field638, arg0.field637, arg0.field644, arg0.field639, arg0.field639, arg1, arg2);
    }

    @ObfuscatedName("e.br(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method150(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 18) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field487 = arg0;
            field309 = arg1;
            field297.method2408(197);
            field297.method2195(class124.field1946[82] ? 1 : 0);
            field297.method2198(arg3);
            field297.method2203(Statics.field1245 + arg0);
            field297.method2201(Statics.field2495 + arg1);
        }
        if (arg2 == 10) {
            class30 var8 = field410[arg3];
            if (var8 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(132);
                field297.method2342(class124.field1946[82] ? 1 : 0);
                field297.method2364(arg3);
            }
        }
        if (arg2 == 37) {
            field297.method2408(161);
            field297.method2341(arg1);
            field297.method2201(arg0);
            field297.method2203(arg3);
            field367 = 0;
            Statics.field161 = class153.method2577(arg1);
            field366 = arg0;
        }
        if (arg2 == 1) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field487 = arg0;
            field309 = arg1;
            field297.method2408(11);
            field297.method2203(Statics.field2484);
            field297.method2364(arg3 >> 14 & 0x7FFF);
            field297.method2198(Statics.field991);
            field297.method2203(Statics.field1245 + arg0);
            field297.method2201(Statics.field2495 + arg1);
            field297.method2212(Statics.field696);
            field297.method2342(class124.field1946[82] ? 1 : 0);
        }
        if (arg2 == 17) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field487 = arg0;
            field309 = arg1;
            field297.method2408(218);
            field297.method2203(Statics.field1245 + arg0);
            field297.method2198(arg3);
            field297.method2201(field415);
            field297.method2159(class124.field1946[82] ? 1 : 0);
            field297.method2212(Statics.field1824);
            field297.method2203(Statics.field2495 + arg1);
        }
        if (arg2 == 33) {
            field297.method2408(76);
            field297.method2198(arg3);
            field297.method2364(arg0);
            field297.method2212(arg1);
            field367 = 0;
            Statics.field161 = class153.method2577(arg1);
            field366 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class153 var9 = class153.method2472(arg1, arg0);
            if (var9 != null) {
                method873(arg3, arg1, arg0, var9.field2642, arg5);
            }
        }
        if (arg2 == 2) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field487 = arg0;
            field309 = arg1;
            field297.method2408(153);
            field297.method2198(Statics.field2495 + arg1);
            field297.method2201(field415);
            field297.method2195(class124.field1946[82] ? 1 : 0);
            field297.method2162(Statics.field1824);
            field297.method2201(arg3 >> 14 & 0x7FFF);
            field297.method2364(Statics.field1245 + arg0);
        }
        if (arg2 == 50) {
            class3 var10 = field333[arg3];
            if (var10 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(246);
                field297.method2342(class124.field1946[82] ? 1 : 0);
                field297.method2364(arg3);
            }
        }
        if (arg2 == 3) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field487 = arg0;
            field309 = arg1;
            field297.method2408(249);
            field297.method2203(Statics.field2495 + arg1);
            field297.method2203(Statics.field1245 + arg0);
            field297.method2198(arg3 >> 14 & 0x7FFF);
            field297.method2195(class124.field1946[82] ? 1 : 0);
        }
        if (arg2 == 1003) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            class30 var11 = field410[arg3];
            if (var11 != null) {
                class35 var12 = var11.field701;
                if (var12.field830 != null) {
                    var12 = var12.method636();
                }
                if (var12 != null) {
                    field297.method2408(156);
                    field297.method2198(var12.field809);
                }
            }
        }
        if (arg2 == 49) {
            class3 var13 = field333[arg3];
            if (var13 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(26);
                field297.method2201(arg3);
                field297.method2195(class124.field1946[82] ? 1 : 0);
            }
        }
        if (arg2 == 30 && field423 == null) {
            method2442(arg1, arg0);
            field423 = class153.method2472(arg1, arg0);
            method45(field423);
        }
        if (arg2 == 15) {
            class3 var14 = field333[arg3];
            if (var14 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(149);
                field297.method2198(field415);
                field297.method2342(class124.field1946[82] ? 1 : 0);
                field297.method2364(arg3);
                field297.method2341(Statics.field1824);
            }
        }
        if (arg2 == 4) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field487 = arg0;
            field309 = arg1;
            field297.method2408(43);
            field297.method2203(arg3 >> 14 & 0x7FFF);
            field297.method2203(Statics.field2495 + arg1);
            field297.method2342(class124.field1946[82] ? 1 : 0);
            field297.method2201(Statics.field1245 + arg0);
        }
        if (arg2 == 1002) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field297.method2408(38);
            field297.method2203(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 12) {
            class30 var15 = field410[arg3];
            if (var15 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(236);
                field297.method2194(class124.field1946[82] ? 1 : 0);
                field297.method2201(arg3);
            }
        }
        if (arg2 == 16) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field487 = arg0;
            field309 = arg1;
            field297.method2408(239);
            field297.method2195(class124.field1946[82] ? 1 : 0);
            field297.method2198(Statics.field991);
            field297.method2201(Statics.field2495 + arg1);
            field297.method2203(arg3);
            field297.method2198(Statics.field1245 + arg0);
            field297.method2201(Statics.field2484);
            field297.method2336(Statics.field696);
        }
        if (arg2 == 7) {
            class30 var16 = field410[arg3];
            if (var16 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(104);
                field297.method2364(Statics.field991);
                field297.method2364(arg3);
                field297.method2159(class124.field1946[82] ? 1 : 0);
                field297.method2201(Statics.field2484);
                field297.method2341(Statics.field696);
            }
        }
        if (arg2 == 36) {
            field297.method2408(72);
            field297.method2201(arg0);
            field297.method2336(arg1);
            field297.method2201(arg3);
            field367 = 0;
            Statics.field161 = class153.method2577(arg1);
            field366 = arg0;
        }
        if (arg2 == 11) {
            class30 var17 = field410[arg3];
            if (var17 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(0);
                field297.method2194(class124.field1946[82] ? 1 : 0);
                field297.method2198(arg3);
            }
        }
        if (arg2 == 13) {
            class30 var18 = field410[arg3];
            if (var18 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(171);
                field297.method2203(arg3);
                field297.method2195(class124.field1946[82] ? 1 : 0);
            }
        }
        if (arg2 == 46) {
            class3 var19 = field333[arg3];
            if (var19 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(141);
                field297.method2201(arg3);
                field297.method2159(class124.field1946[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field297.method2408(151);
            field297.method2162(arg1);
            field297.method2201(arg3);
            field297.method2212(Statics.field1824);
            field297.method2201(field415);
            field297.method2364(arg0);
            field367 = 0;
            Statics.field161 = class153.method2577(arg1);
            field366 = arg0;
        }
        if (arg2 == 9) {
            class30 var20 = field410[arg3];
            if (var20 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(122);
                field297.method2194(class124.field1946[82] ? 1 : 0);
                field297.method2198(arg3);
            }
        }
        if (arg2 == 1005) {
            class153 var21 = class153.method2577(arg1);
            if (var21 == null || var21.field2641[arg0] < 100000) {
                field297.method2408(105);
                field297.method2201(arg3);
            } else {
                class10.method849(27, "", var21.field2641[arg0] + " x " + class45.method588(arg3).field1012);
            }
            field367 = 0;
            Statics.field161 = class153.method2577(arg1);
            field366 = arg0;
        }
        if (arg2 == 29) {
            field297.method2408(50);
            field297.method2162(arg1);
            class153 var22 = class153.method2577(arg1);
            if (var22.field2634 != null && var22.field2634[0][0] == 5) {
                int var23 = var22.field2634[0][1];
                if (class155.field2662[var23] != var22.field2636[0]) {
                    class155.field2662[var23] = var22.field2636[0];
                    method590(var23);
                }
            }
        }
        if (arg2 == 35) {
            field297.method2408(158);
            field297.method2162(arg1);
            field297.method2364(arg3);
            field297.method2201(arg0);
            field367 = 0;
            Statics.field161 = class153.method2577(arg1);
            field366 = arg0;
        }
        if (arg2 == 28) {
            field297.method2408(50);
            field297.method2162(arg1);
            class153 var24 = class153.method2577(arg1);
            if (var24.field2634 != null && var24.field2634[0][0] == 5) {
                int var25 = var24.field2634[0][1];
                class155.field2662[var25] = 1 - class155.field2662[var25];
                method590(var25);
            }
        }
        if (arg2 == 6) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field487 = arg0;
            field309 = arg1;
            field297.method2408(19);
            field297.method2203(Statics.field2495 + arg1);
            field297.method2342(class124.field1946[82] ? 1 : 0);
            field297.method2201(Statics.field1245 + arg0);
            field297.method2198(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 44) {
            class3 var26 = field333[arg3];
            if (var26 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(32);
                field297.method2195(class124.field1946[82] ? 1 : 0);
                field297.method2364(arg3);
            }
        }
        if (arg2 == 5) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field487 = arg0;
            field309 = arg1;
            field297.method2408(25);
            field297.method2364(Statics.field1245 + arg0);
            field297.method2195(class124.field1946[82] ? 1 : 0);
            field297.method2201(arg3 >> 14 & 0x7FFF);
            field297.method2198(Statics.field2495 + arg1);
        }
        if (arg2 == 40) {
            field297.method2408(119);
            field297.method2162(arg1);
            field297.method2364(arg0);
            field297.method2203(arg3);
            field367 = 0;
            Statics.field161 = class153.method2577(arg1);
            field366 = arg0;
        }
        if (arg2 == 39) {
            field297.method2408(206);
            field297.method2364(arg3);
            field297.method2198(arg0);
            field297.method2341(arg1);
            field367 = 0;
            Statics.field161 = class153.method2577(arg1);
            field366 = arg0;
        }
        if (arg2 == 19) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field487 = arg0;
            field309 = arg1;
            field297.method2408(168);
            field297.method2203(Statics.field1245 + arg0);
            field297.method2364(arg3);
            field297.method2195(class124.field1946[82] ? 1 : 0);
            field297.method2198(Statics.field2495 + arg1);
        }
        if (arg2 == 26) {
            field297.method2408(77);
            for (class4 var27 = (class4) field420.method3277(); var27 != null; var27 = (class4) field420.method3267()) {
                if (var27.field62 == 0 || var27.field62 == 3) {
                    method2754(var27, true);
                }
            }
            if (field423 != null) {
                method45(field423);
                field423 = null;
            }
        }
        if (arg2 == 21) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field487 = arg0;
            field309 = arg1;
            field297.method2408(164);
            field297.method2364(arg3);
            field297.method2198(Statics.field1245 + arg0);
            field297.method2364(Statics.field2495 + arg1);
            field297.method2195(class124.field1946[82] ? 1 : 0);
        }
        if (arg2 == 8) {
            class30 var28 = field410[arg3];
            if (var28 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(136);
                field297.method2342(class124.field1946[82] ? 1 : 0);
                field297.method2198(field415);
                field297.method2364(arg3);
                field297.method2212(Statics.field1824);
            }
        }
        if (arg2 == 51) {
            class3 var29 = field333[arg3];
            if (var29 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(247);
                field297.method2194(class124.field1946[82] ? 1 : 0);
                field297.method2198(arg3);
            }
        }
        if (arg2 == 38) {
            method68();
            class153 var30 = class153.method2577(arg1);
            field506 = 1;
            Statics.field2484 = arg0;
            Statics.field696 = arg1;
            Statics.field991 = arg3;
            method45(var30);
            field413 = class2.method660(16748608) + class45.method588(arg3).field1012 + class2.method660(16777215);
            if (field413 == null) {
                field413 = "null";
            }
            return;
        }
        if (arg2 == 23) {
            Statics.field2687.method1690(Statics.field243, arg0, arg1);
        }
        if (arg2 == 58) {
            class153 var31 = class153.method2472(arg1, arg0);
            if (var31 != null) {
                field297.method2408(82);
                field297.method2336(Statics.field1824);
                field297.method2203(field416);
                field297.method2201(arg0);
                field297.method2364(var31.field2642);
                field297.method2212(arg1);
                field297.method2203(field415);
            }
        }
        if (arg2 == 41) {
            field297.method2408(129);
            field297.method2198(arg0);
            field297.method2203(arg3);
            field297.method2162(arg1);
            field367 = 0;
            Statics.field161 = class153.method2577(arg1);
            field366 = arg0;
        }
        if (arg2 == 47) {
            class3 var32 = field333[arg3];
            if (var32 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(131);
                field297.method2201(arg3);
                field297.method2195(class124.field1946[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field297.method2408(20);
            field297.method2198(arg0);
            field297.method2203(arg3);
            field297.method2336(arg1);
            field367 = 0;
            Statics.field161 = class153.method2577(arg1);
            field366 = arg0;
        }
        if (arg2 == 43) {
            field297.method2408(213);
            field297.method2364(arg3);
            field297.method2162(arg1);
            field297.method2198(arg0);
            field367 = 0;
            Statics.field161 = class153.method2577(arg1);
            field366 = arg0;
        }
        if (arg2 == 1001) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field487 = arg0;
            field309 = arg1;
            field297.method2408(68);
            field297.method2198(Statics.field1245 + arg0);
            field297.method2195(class124.field1946[82] ? 1 : 0);
            field297.method2198(Statics.field2495 + arg1);
            field297.method2198(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 14) {
            class3 var33 = field333[arg3];
            if (var33 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(208);
                field297.method2162(Statics.field696);
                field297.method2342(class124.field1946[82] ? 1 : 0);
                field297.method2203(Statics.field991);
                field297.method2201(arg3);
                field297.method2203(Statics.field2484);
            }
        }
        if (arg2 == 25) {
            class153 var34 = class153.method2472(arg1, arg0);
            if (var34 != null) {
                method68();
                int var37 = method708(var34);
                int var38 = var37 >> 11 & 0x3F;
                method933(arg1, arg0, var38, var34.field2642);
                field506 = 0;
                int var39 = method708(var34);
                int var40 = var39 >> 11 & 0x3F;
                String var41;
                if (var40 == 0) {
                    var41 = null;
                } else if (var34.field2589 == null || var34.field2589.trim().length() == 0) {
                    var41 = null;
                } else {
                    var41 = var34.field2589;
                }
                field327 = var41;
                if (field327 == null) {
                    field327 = "Null";
                }
                if (var34.field2537) {
                    field412 = var34.field2554 + class2.method660(16777215);
                } else {
                    field412 = class2.method660(65280) + var34.field2644 + class2.method660(16777215);
                }
            }
            return;
        }
        if (arg2 == 45) {
            class3 var42 = field333[arg3];
            if (var42 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(116);
                field297.method2203(arg3);
                field297.method2194(class124.field1946[82] ? 1 : 0);
            }
        }
        if (arg2 == 48) {
            class3 var43 = field333[arg3];
            if (var43 != null) {
                field363 = arg6;
                field364 = arg7;
                field255 = 2;
                field365 = 0;
                field487 = arg0;
                field309 = arg1;
                field297.method2408(199);
                field297.method2159(class124.field1946[82] ? 1 : 0);
                field297.method2201(arg3);
            }
        }
        if (arg2 == 22) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field487 = arg0;
            field309 = arg1;
            field297.method2408(47);
            field297.method2198(Statics.field2495 + arg1);
            field297.method2194(class124.field1946[82] ? 1 : 0);
            field297.method2198(Statics.field1245 + arg0);
            field297.method2203(arg3);
        }
        if (arg2 == 42) {
            field297.method2408(138);
            field297.method2341(arg1);
            field297.method2203(arg0);
            field297.method2203(arg3);
            field367 = 0;
            Statics.field161 = class153.method2577(arg1);
            field366 = arg0;
        }
        if (arg2 == 24) {
            class153 var44 = class153.method2577(arg1);
            boolean var45 = true;
            if (var44.field2625 > 0) {
                var45 = method126(var44);
            }
            if (var45) {
                field297.method2408(50);
                field297.method2162(arg1);
            }
        }
        if (arg2 == 20) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field487 = arg0;
            field309 = arg1;
            field297.method2408(159);
            field297.method2198(arg3);
            field297.method2195(class124.field1946[82] ? 1 : 0);
            field297.method2364(Statics.field2495 + arg1);
            field297.method2364(Statics.field1245 + arg0);
        }
        if (arg2 == 1004) {
            field363 = arg6;
            field364 = arg7;
            field255 = 2;
            field365 = 0;
            field297.method2408(105);
            field297.method2201(arg3);
        }
        if (arg2 == 31) {
            field297.method2408(240);
            field297.method2203(Statics.field991);
            field297.method2364(Statics.field2484);
            field297.method2203(arg0);
            field297.method2212(arg1);
            field297.method2336(Statics.field696);
            field297.method2201(arg3);
            field367 = 0;
            Statics.field161 = class153.method2577(arg1);
            field366 = arg0;
        }
        if (field506 != 0) {
            field506 = 0;
            method45(class153.method2577(Statics.field696));
        }
        if (field302) {
            method68();
        }
        if (Statics.field161 != null && field367 == 0) {
            method45(Statics.field161);
        }
    }

    @ObfuscatedName("ah.bl(ILjava/lang/String;B)V")
    public static void method1048(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field377; var3++) {
            class3 var4 = field333[field378[var3]];
            if (var4 != null && var4.field44 != null && var4.field44.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field297.method2408(32);
                    field297.method2195(0);
                    field297.method2364(field378[var3]);
                } else if (arg0 == 4) {
                    field297.method2408(131);
                    field297.method2201(field378[var3]);
                    field297.method2195(0);
                } else if (arg0 == 6) {
                    field297.method2408(26);
                    field297.method2201(field378[var3]);
                    field297.method2195(0);
                } else if (arg0 == 7) {
                    field297.method2408(246);
                    field297.method2342(0);
                    field297.method2364(field378[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class10.method849(4, "", class143.field2347 + arg1);
        }
    }

    @ObfuscatedName("ag.be(IIIIB)V")
    public static void method933(int arg0, int arg1, int arg2, int arg3) {
        class153 var4 = class153.method2472(arg0, arg1);
        if (var4 != null && var4.field2591 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field7 = var4.field2591;
            class32.method47(var5);
        }
        field416 = arg3;
        field302 = true;
        Statics.field1824 = arg0;
        field415 = arg1;
        Statics.field1538 = arg2;
        method45(var4);
    }

    @ObfuscatedName("s.bb(I)V")
    public static void method68() {
        if (!field302) {
            return;
        }
        class153 var0 = class153.method2472(Statics.field1824, field415);
        if (var0 != null && var0.field2584 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field7 = var0.field2584;
            class32.method47(var1);
        }
        field302 = false;
        method45(var0);
    }

    @ObfuscatedName("dc.cl(IIS)V")
    public static void method2442(int arg0, int arg1) {
        field297.method2408(33);
        field297.method2201(arg1);
        field297.method2212(arg0);
    }

    @ObfuscatedName("au.cu(IIIILjava/lang/String;I)V")
    public static void method873(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class153 var5 = class153.method2472(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2606 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field6 = arg0;
            var6.field10 = arg4;
            var6.field7 = var5.field2606;
            class32.method47(var6);
        }
        boolean var7 = true;
        if (var5.field2625 > 0) {
            var7 = method126(var5);
        }
        if (!var7 || !class157.method2578(method708(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field297.method2408(118);
            field297.method2162(arg1);
            field297.method2364(arg2);
            field297.method2364(arg3);
        }
        if (arg0 == 2) {
            field297.method2408(8);
            field297.method2162(arg1);
            field297.method2364(arg2);
            field297.method2364(arg3);
        }
        if (arg0 == 3) {
            field297.method2408(255);
            field297.method2162(arg1);
            field297.method2364(arg2);
            field297.method2364(arg3);
        }
        if (arg0 == 4) {
            field297.method2408(207);
            field297.method2162(arg1);
            field297.method2364(arg2);
            field297.method2364(arg3);
        }
        if (arg0 == 5) {
            field297.method2408(146);
            field297.method2162(arg1);
            field297.method2364(arg2);
            field297.method2364(arg3);
        }
        if (arg0 == 6) {
            field297.method2408(251);
            field297.method2162(arg1);
            field297.method2364(arg2);
            field297.method2364(arg3);
        }
        if (arg0 == 7) {
            field297.method2408(9);
            field297.method2162(arg1);
            field297.method2364(arg2);
            field297.method2364(arg3);
        }
        if (arg0 == 8) {
            field297.method2408(185);
            field297.method2162(arg1);
            field297.method2364(arg2);
            field297.method2364(arg3);
        }
        if (arg0 == 9) {
            field297.method2408(228);
            field297.method2162(arg1);
            field297.method2364(arg2);
            field297.method2364(arg3);
        }
        if (arg0 == 10) {
            field297.method2408(62);
            field297.method2162(arg1);
            field297.method2364(arg2);
            field297.method2364(arg3);
        }
    }

    @ObfuscatedName("u.cg(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method92(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field400 || field401 >= 500) {
            return;
        }
        field406[field401] = arg0;
        field407[field401] = arg1;
        field508[field401] = arg2;
        field405[field401] = arg3;
        field402[field401] = arg4;
        field403[field401] = arg5;
        field401++;
    }

    @ObfuscatedName("fj.ch(B)V")
    public static void method3204() {
        for (int var0 = 0; var0 < field401; var0++) {
            if (method15(field508[var0])) {
                if (var0 < field401 - 1) {
                    for (int var1 = var0; var1 < field401 - 1; var1++) {
                        field406[var1] = field406[var1 + 1];
                        field407[var1] = field407[var1 + 1];
                        field508[var1] = field508[var1 + 1];
                        field405[var1] = field405[var1 + 1];
                        field402[var1] = field402[var1 + 1];
                        field403[var1] = field403[var1 + 1];
                    }
                }
                field401--;
            }
        }
    }

    @ObfuscatedName("g.cf(II)Z")
    public static boolean method15(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ca.cs(II)Ljava/lang/String;")
    public static String method2016(int arg0) {
        return field407[arg0].length() > 0 ? field406[arg0] + class143.field2307 + field407[arg0] : field406[arg0];
    }

    @ObfuscatedName("a.ci(Laf;IIII)V")
    public static final void method133(class35 arg0, int arg1, int arg2, int arg3) {
        if (field401 >= 400) {
            return;
        }
        if (arg0.field830 != null) {
            arg0 = arg0.method636();
        }
        if (arg0 == null || !arg0.field833 || arg0.field835 && field268 != arg1) {
            return;
        }
        String var4 = arg0.field805;
        if (arg0.field822 != 0) {
            var4 = var4 + method1430(arg0.field822, Statics.field1248.field31) + " " + class2.field21 + class143.field2303 + arg0.field822 + class2.field22;
        }
        if (field506 == 1) {
            method92(class143.field2297, field413 + " " + class2.field27 + " " + class2.method660(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field302) {
            String[] var5 = arg0.field800;
            if (field430) {
                var5 = method509(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class143.field2299)) {
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
                        method92(var5[var6], class2.method660(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class143.field2299)) {
                        short var9 = 0;
                        if (field282 == class18.field523 || field282 == class18.field520 && arg0.field822 > Statics.field1248.field31) {
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
                        method92(var5[var8], class2.method660(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method92(class143.field2298, class2.method660(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1538 & 0x2) == 2) {
            method92(field327, field412 + " " + class2.field27 + " " + class2.method660(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("h.ct(Lx;IIII)V")
    public static final void method125(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1248 == arg0 || field401 >= 400) {
            return;
        }
        String var4;
        if (arg0.field35 == 0) {
            var4 = arg0.field44 + method1430(arg0.field31, Statics.field1248.field31) + " " + class2.field21 + class143.field2303 + arg0.field31 + class2.field22;
        } else {
            var4 = arg0.field44 + " " + class2.field21 + class143.field2304 + arg0.field35 + class2.field22;
        }
        if (field506 == 1) {
            method92(class143.field2297, field413 + " " + class2.field27 + " " + class2.method660(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field302) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field479[var5] != null) {
                    short var6 = 0;
                    if (field479[var5].equalsIgnoreCase(class143.field2299)) {
                        if (field282 == class18.field523 || field282 == class18.field520 && arg0.field31 > Statics.field1248.field31) {
                            var6 = 2000;
                        }
                        if (Statics.field1248.field48 != 0 && arg0.field48 != 0) {
                            if (Statics.field1248.field48 == arg0.field48) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field421[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field360[var5] + var6;
                    method92(field479[var5], class2.method660(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1538 & 0x8) == 8) {
            method92(field327, field412 + " " + class2.field27 + " " + class2.method660(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field401; var9++) {
            if (field508[var9] == 23) {
                field407[var9] = class2.method660(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("bv.cd(III)Ljava/lang/String;")
    public static final String method1430(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method660(16711680);
        } else if (var2 < -6) {
            return class2.method660(16723968);
        } else if (var2 < -3) {
            return class2.method660(16740352);
        } else if (var2 < 0) {
            return class2.method660(16756736);
        } else if (var2 > 9) {
            return class2.method660(65280);
        } else if (var2 > 6) {
            return class2.method660(4259584);
        } else if (var2 > 3) {
            return class2.method660(8453888);
        } else if (var2 > 0) {
            return class2.method660(12648192);
        } else {
            return class2.method660(16776960);
        }
    }

    @ObfuscatedName("q.cm(IIIIIIIIB)V")
    public static final void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class153.method487(arg0)) {
            Statics.field1821 = null;
            method820(Statics.field2572[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1821 != null) {
                method820(Statics.field1821, -1412584499, arg1, arg2, arg3, arg4, Statics.field2664, Statics.field2227, arg7);
                Statics.field1821 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field463[var8] = true;
            }
        } else {
            field463[arg7] = true;
        }
    }

    @ObfuscatedName("ax.cb([Leq;IIIIIIIII)V")
    public static final void method820(class153[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1554(arg2, arg3, arg4, arg5);
        class84.method1835();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class153 var10 = arg0[var9];
            if (var10 != null && (var10.field2549 == arg1 || arg1 == -1412584499 && field431 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field450[field461] = var10.field2617 + arg6;
                    field437[field461] = var10.field2544 + arg7;
                    field468[field461] = var10.field2547;
                    field469[field461] = var10.field2648;
                    var11 = ++field461 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2653 = var11;
                var10.field2583 = field343;
                if (!var10.field2537 || !method2096(var10)) {
                    if (var10.field2625 > 0) {
                        int var12 = var10.field2625;
                        if (var12 == 324) {
                            if (field515 == -1) {
                                field515 = var10.field2546;
                                field516 = var10.field2563;
                            }
                            if (field305.field2681) {
                                var10.field2546 = field515;
                            } else {
                                var10.field2546 = field516;
                            }
                        } else if (var12 == 325) {
                            if (field515 == -1) {
                                field515 = var10.field2546;
                                field516 = var10.field2563;
                            }
                            if (field305.field2681) {
                                var10.field2546 = field516;
                            } else {
                                var10.field2546 = field515;
                            }
                        } else if (var12 == 327) {
                            var10.field2578 = 150;
                            var10.field2548 = (int) (Math.sin((double) field343 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2570 = 5;
                            var10.field2555 = 0;
                        } else if (var12 == 328) {
                            var10.field2578 = 150;
                            var10.field2548 = (int) (Math.sin((double) field343 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2570 = 5;
                            var10.field2555 = 1;
                        }
                    }
                    int var13 = var10.field2617 + arg6;
                    int var14 = var10.field2544 + arg7;
                    int var15 = var10.field2560;
                    if (field431 == var10) {
                        if (arg1 != -1412584499 && !var10.field2603) {
                            Statics.field1821 = arg0;
                            Statics.field2664 = arg6;
                            Statics.field2227 = arg7;
                            continue;
                        }
                        if (field442 && field436) {
                            int var16 = class127.field1990;
                            int var17 = class127.field1995;
                            int var18 = var16 - field475;
                            int var19 = var17 - field434;
                            if (var18 < field253) {
                                var18 = field253;
                            }
                            if (var10.field2547 + var18 > field253 + field432.field2547) {
                                var18 = field253 + field432.field2547 - var10.field2547;
                            }
                            if (var19 < field438) {
                                var19 = field438;
                            }
                            if (var10.field2648 + var19 > field438 + field432.field2648) {
                                var19 = field438 + field432.field2648 - var10.field2648;
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
                    if (var10.field2542 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2542 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2547 + var13;
                        int var27 = var10.field2648 + var14;
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
                        int var31 = var10.field2648 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2537 || var20 < var22 && var21 < var23) {
                        if (var10.field2625 != 0) {
                            if (var10.field2625 == 1337) {
                                field314 = var13;
                                field370 = var14;
                                method1935(var13, var14, var10.field2547, var10.field2648);
                                class73.method1554(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2625 == 1338) {
                                method503(var13, var14, var11);
                                class73.method1554(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2542 == 0) {
                            if (!var10.field2537 && method2096(var10) && Statics.field221 != var10) {
                                continue;
                            }
                            if (!var10.field2537) {
                                if (var10.field2552 > var10.field2530 - var10.field2648) {
                                    var10.field2552 = var10.field2530 - var10.field2648;
                                }
                                if (var10.field2552 < 0) {
                                    var10.field2552 = 0;
                                }
                            }
                            method820(arg0, var10.field2538, var20, var21, var22, var23, var13 - var10.field2551, var14 - var10.field2552, var11);
                            if (var10.field2632 != null) {
                                method820(var10.field2632, var10.field2538, var20, var21, var22, var23, var13 - var10.field2551, var14 - var10.field2552, var11);
                            }
                            class4 var32 = (class4) field420.method3263((long) var10.field2538);
                            if (var32 != null) {
                                method510(var32.field63, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class73.method1554(arg2, arg3, arg4, arg5);
                            class84.method1835();
                        }
                        if (field465[var11] || field300 > 1) {
                            if (var10.field2542 == 0 && !var10.field2537 && var10.field2530 > var10.field2648) {
                                int var33 = var10.field2547 + var13;
                                int var34 = var10.field2552;
                                int var35 = var10.field2648;
                                int var36 = var10.field2530;
                                Statics.field702[0].method1615(var33, var14);
                                Statics.field702[1].method1615(var33, var14 + var35 - 16);
                                class73.method1605(var33, var14 + 16, 16, var35 - 32, field472);
                                int var37 = (var35 - 32) * var35 / var36;
                                if (var37 < 8) {
                                    var37 = 8;
                                }
                                int var38 = (var35 - 32 - var37) * var34 / (var36 - var35);
                                class73.method1605(var33, var14 + 16 + var38, 16, var37, field334);
                                class73.method1597(var33, var14 + 16 + var38, var37, field336);
                                class73.method1597(var33 + 1, var14 + 16 + var38, var37, field336);
                                class73.method1571(var33, var14 + 16 + var38, 16, field336);
                                class73.method1571(var33, var14 + 17 + var38, 16, field336);
                                class73.method1597(var33 + 15, var14 + 16 + var38, var37, field335);
                                class73.method1597(var33 + 14, var14 + 17 + var38, var37 - 1, field335);
                                class73.method1571(var33, var14 + 15 + var38 + var37, 16, field335);
                                class73.method1571(var33 + 1, var14 + 14 + var38 + var37, 15, field335);
                            }
                            if (var10.field2542 != 1) {
                                if (var10.field2542 == 2) {
                                    int var39 = 0;
                                    for (int var40 = 0; var40 < var10.field2648; var40++) {
                                        for (int var41 = 0; var41 < var10.field2547; var41++) {
                                            int var42 = (var10.field2608 + 32) * var41 + var13;
                                            int var43 = (var10.field2592 + 32) * var40 + var14;
                                            if (var39 < 20) {
                                                var42 += var10.field2593[var39];
                                                var43 += var10.field2609[var39];
                                            }
                                            if (var10.field2559[var39] > 0) {
                                                boolean var44 = false;
                                                boolean var45 = false;
                                                int var46 = var10.field2559[var39] - 1;
                                                if (var42 + 32 > arg2 && var42 < arg4 && var43 + 32 > arg3 && var43 < arg5 || Statics.field694 == var10 && field369 == var39) {
                                                    class72 var47;
                                                    if (field506 == 1 && Statics.field2484 == var39 && Statics.field696 == var10.field2538) {
                                                        var47 = class45.method2626(var46, var10.field2641[var39], 2, 0, false);
                                                    } else {
                                                        var47 = class45.method2626(var46, var10.field2641[var39], 1, 3153952, false);
                                                    }
                                                    if (var47 == null) {
                                                        method45(var10);
                                                    } else if (Statics.field694 == var10 && field369 == var39) {
                                                        int var48 = class127.field1990 - field424;
                                                        int var49 = class127.field1995 - field371;
                                                        if (var48 < 5 && var48 > -5) {
                                                            var48 = 0;
                                                        }
                                                        if (var49 < 5 && var49 > -5) {
                                                            var49 = 0;
                                                        }
                                                        if (field374 < 5) {
                                                            var48 = 0;
                                                            var49 = 0;
                                                        }
                                                        var47.method1484(var42 + var48, var43 + var49, 128);
                                                        if (arg1 != -1) {
                                                            class153 var50 = arg0[arg1 & 0xFFFF];
                                                            if (var43 + var49 < class73.field1316 && var50.field2552 > 0) {
                                                                int var51 = field332 * (class73.field1316 - var43 - var49) / 3;
                                                                if (var51 > field332 * 10) {
                                                                    var51 = field332 * 10;
                                                                }
                                                                if (var51 > var50.field2552) {
                                                                    var51 = var50.field2552;
                                                                }
                                                                var50.field2552 -= var51;
                                                                field371 += var51;
                                                                method45(var50);
                                                            }
                                                            if (var43 + var49 + 32 > class73.field1320 && var50.field2552 < var50.field2530 - var50.field2648) {
                                                                int var52 = field332 * (var43 + var49 + 32 - class73.field1320) / 3;
                                                                if (var52 > field332 * 10) {
                                                                    var52 = field332 * 10;
                                                                }
                                                                if (var52 > var50.field2530 - var50.field2648 - var50.field2552) {
                                                                    var52 = var50.field2530 - var50.field2648 - var50.field2552;
                                                                }
                                                                var50.field2552 += var52;
                                                                field371 -= var52;
                                                                method45(var50);
                                                            }
                                                        }
                                                    } else if (Statics.field161 == var10 && field366 == var39) {
                                                        var47.method1484(var42, var43, 128);
                                                    } else {
                                                        var47.method1478(var42, var43);
                                                    }
                                                }
                                            } else if (var10.field2595 != null && var39 < 20) {
                                                class72 var53 = var10.method2920(var39);
                                                if (var53 != null) {
                                                    var53.method1478(var42, var43);
                                                } else if (class153.field2536) {
                                                    method45(var10);
                                                }
                                            }
                                            var39++;
                                        }
                                    }
                                } else if (var10.field2542 == 3) {
                                    int var54;
                                    if (method2628(var10)) {
                                        var54 = var10.field2556;
                                        if (Statics.field221 == var10 && var10.field2558 != 0) {
                                            var54 = var10.field2558;
                                        }
                                    } else {
                                        var54 = var10.field2571;
                                        if (Statics.field221 == var10 && var10.field2557 != 0) {
                                            var54 = var10.field2557;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2654) {
                                            class73.method1605(var13, var14, var10.field2547, var10.field2648, var54);
                                        } else {
                                            class73.method1564(var13, var14, var10.field2547, var10.field2648, var54);
                                        }
                                    } else if (var10.field2654) {
                                        class73.method1561(var13, var14, var10.field2547, var10.field2648, var54, 256 - (var15 & 0xFF));
                                    } else {
                                        class73.method1555(var13, var14, var10.field2547, var10.field2648, var54, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2542 == 4) {
                                    class194 var55 = var10.method2919();
                                    if (var55 != null) {
                                        String var56 = var10.field2543;
                                        int var57;
                                        if (method2628(var10)) {
                                            var57 = var10.field2556;
                                            if (Statics.field221 == var10 && var10.field2558 != 0) {
                                                var57 = var10.field2558;
                                            }
                                            if (var10.field2586.length() > 0) {
                                                var56 = var10.field2586;
                                            }
                                        } else {
                                            var57 = var10.field2571;
                                            if (Statics.field221 == var10 && var10.field2557 != 0) {
                                                var57 = var10.field2557;
                                            }
                                        }
                                        if (var10.field2537 && var10.field2642 != -1) {
                                            class45 var58 = class45.method588(var10.field2642);
                                            var56 = var58.field1012;
                                            if (var56 == null) {
                                                var56 = "null";
                                            }
                                            if ((var58.field1023 == 1 || var10.field2643 != 1) && var10.field2643 != -1) {
                                                var56 = class2.method660(16748608) + var56 + class2.field23 + " " + 'x' + method1938(var10.field2643);
                                            }
                                        }
                                        if (field423 == var10) {
                                            class143 var10000 = (class143) null;
                                            var56 = class143.field2305;
                                            var57 = var10.field2571;
                                        }
                                        if (!var10.field2537) {
                                            var56 = method1832(var56, var10);
                                        }
                                        var55.method3399(var56, var13, var14, var10.field2547, var10.field2648, var57, var10.field2590 ? 0 : -1, var10.field2588, var10.field2616, var10.field2587);
                                    } else if (class153.field2536) {
                                        method45(var10);
                                    }
                                } else if (var10.field2542 == 5) {
                                    if (var10.field2537) {
                                        class72 var60;
                                        if (var10.field2642 == -1) {
                                            var60 = var10.method2946(false);
                                        } else {
                                            var60 = class45.method2626(var10.field2642, var10.field2643, var10.field2566, var10.field2567, false);
                                        }
                                        if (var60 != null) {
                                            int var61 = var60.field1310;
                                            int var62 = var60.field1307;
                                            if (var10.field2564) {
                                                class73.method1585(var13, var14, var10.field2547 + var13, var10.field2648 + var14);
                                                int var63 = (var10.field2547 + (var61 - 1)) / var61;
                                                int var64 = (var10.field2648 + (var62 - 1)) / var62;
                                                for (int var65 = 0; var65 < var63; var65++) {
                                                    for (int var66 = 0; var66 < var64; var66++) {
                                                        if (var10.field2604 != 0) {
                                                            var60.method1523(var61 / 2 + var61 * var65 + var13, var62 / 2 + var62 * var66 + var14, var10.field2604, 4096);
                                                        } else if (var15 == 0) {
                                                            var60.method1478(var61 * var65 + var13, var62 * var66 + var14);
                                                        } else {
                                                            var60.method1484(var61 * var65 + var13, var62 * var66 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1554(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var67 = var10.field2547 * 4096 / var61;
                                                if (var10.field2604 != 0) {
                                                    var60.method1523(var10.field2547 / 2 + var13, var10.field2648 / 2 + var14, var10.field2604, var67);
                                                } else if (var15 != 0) {
                                                    var60.method1486(var13, var14, var10.field2547, var10.field2648, 256 - (var15 & 0xFF));
                                                } else if (var10.field2547 == var61 && var10.field2648 == var62) {
                                                    var60.method1478(var13, var14);
                                                } else {
                                                    var60.method1468(var13, var14, var10.field2547, var10.field2648);
                                                }
                                            }
                                        } else if (class153.field2536) {
                                            method45(var10);
                                        }
                                    } else {
                                        class72 var59 = var10.method2946(method2628(var10));
                                        if (var59 != null) {
                                            var59.method1478(var13, var14);
                                        } else if (class153.field2536) {
                                            method45(var10);
                                        }
                                    }
                                } else if (var10.field2542 == 6) {
                                    boolean var68 = method2628(var10);
                                    int var69;
                                    if (var68) {
                                        var69 = var10.field2575;
                                    } else {
                                        var69 = var10.field2574;
                                    }
                                    class98 var70 = null;
                                    int var71 = 0;
                                    if (var10.field2642 != -1) {
                                        class45 var72 = class45.method588(var10.field2642);
                                        if (var72 != null) {
                                            class45 var73 = var72.method884(var10.field2643);
                                            var70 = var73.method878(1);
                                            if (var70 == null) {
                                                method45(var10);
                                            } else {
                                                var70.method2034();
                                                var71 = var70.field1357 / 2;
                                            }
                                        }
                                    } else if (var10.field2570 == 5) {
                                        if (var10.field2555 == 0) {
                                            var70 = field305.method2975((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var70 = Statics.field1248.method20();
                                        }
                                    } else if (var69 == -1) {
                                        var70 = var10.method2921((class38) null, -1, var68, Statics.field1248.field47);
                                        if (var70 == null && class153.field2536) {
                                            method45(var10);
                                        }
                                    } else {
                                        class38 var74 = class38.method507(var69);
                                        var70 = var10.method2921(var74, var10.field2580, var68, Statics.field1248.field47);
                                        if (var70 == null && class153.field2536) {
                                            method45(var10);
                                        }
                                    }
                                    class84.method1889(var10.field2547 / 2 + var13, var10.field2648 / 2 + var14);
                                    int var75 = var10.field2613 * class84.field1489[var10.field2578] >> 16;
                                    int var76 = var10.field2613 * class84.field1470[var10.field2578] >> 16;
                                    if (var70 != null) {
                                        if (var10.field2537) {
                                            var70.method2034();
                                            if (var10.field2623) {
                                                var70.method2047(0, var10.field2548, var10.field2576, var10.field2578, var10.field2541, var10.field2577 + var71 + var75, var10.field2577 + var76, var10.field2613);
                                            } else {
                                                var70.method2086(0, var10.field2548, var10.field2576, var10.field2578, var10.field2541, var10.field2577 + var71 + var75, var10.field2577 + var76);
                                            }
                                        } else {
                                            var70.method2086(0, var10.field2548, 0, var10.field2578, 0, var75, var76);
                                        }
                                    }
                                    class84.method1853();
                                } else {
                                    if (var10.field2542 == 7) {
                                        class194 var77 = var10.method2919();
                                        if (var77 == null) {
                                            if (class153.field2536) {
                                                method45(var10);
                                            }
                                            continue;
                                        }
                                        int var78 = 0;
                                        for (int var79 = 0; var79 < var10.field2648; var79++) {
                                            for (int var80 = 0; var80 < var10.field2547; var80++) {
                                                if (var10.field2559[var78] > 0) {
                                                    class45 var81 = class45.method588(var10.field2559[var78] - 1);
                                                    String var82;
                                                    if (var81.field1023 != 1 && var10.field2641[var78] == 1) {
                                                        var82 = class2.method660(16748608) + var81.field1012 + class2.field23;
                                                    } else {
                                                        var82 = class2.method660(16748608) + var81.field1012 + class2.field23 + " " + 'x' + method1938(var10.field2641[var78]);
                                                    }
                                                    int var83 = (var10.field2608 + 115) * var80 + var13;
                                                    int var84 = (var10.field2592 + 12) * var79 + var14;
                                                    if (var10.field2588 == 0) {
                                                        var77.method3397(var82, var83, var84, var10.field2571, var10.field2590 ? 0 : -1);
                                                    } else if (var10.field2588 == 1) {
                                                        var77.method3415(var82, var10.field2547 / 2 + var83, var84, var10.field2571, var10.field2590 ? 0 : -1);
                                                    } else {
                                                        var77.method3407(var82, var10.field2547 + var83 - 1, var84, var10.field2571, var10.field2590 ? 0 : -1);
                                                    }
                                                }
                                                var78++;
                                            }
                                        }
                                    }
                                    if (var10.field2542 == 8 && Statics.field967 == var10 && field476 == field411) {
                                        int var85 = 0;
                                        int var86 = 0;
                                        class194 var87 = Statics.field1984;
                                        String var88 = var10.field2543;
                                        String var89 = method1832(var88, var10);
                                        while (var89.length() > 0) {
                                            int var90 = var89.indexOf(class2.field25);
                                            String var91;
                                            if (var90 == -1) {
                                                var91 = var89;
                                                var89 = "";
                                            } else {
                                                var91 = var89.substring(0, var90);
                                                var89 = var89.substring(var90 + 4);
                                            }
                                            int var92 = var87.method3401(var91);
                                            if (var92 > var85) {
                                                var85 = var92;
                                            }
                                            var86 += var87.field2926 + 1;
                                        }
                                        var85 += 6;
                                        var86 += 7;
                                        int var93 = var10.field2547 + var13 - 5 - var85;
                                        int var94 = var10.field2648 + var14 + 5;
                                        if (var93 < var13 + 5) {
                                            var93 = var13 + 5;
                                        }
                                        if (var85 + var93 > arg4) {
                                            var93 = arg4 - var85;
                                        }
                                        if (var86 + var94 > arg5) {
                                            var94 = arg5 - var86;
                                        }
                                        class73.method1605(var93, var94, var85, var86, 16777120);
                                        class73.method1564(var93, var94, var85, var86, 0);
                                        String var95 = var10.field2543;
                                        int var96 = var87.field2926 + var94 + 2;
                                        String var97 = method1832(var95, var10);
                                        while (var97.length() > 0) {
                                            int var98 = var97.indexOf(class2.field25);
                                            String var99;
                                            if (var98 == -1) {
                                                var99 = var97;
                                                var97 = "";
                                            } else {
                                                var99 = var97.substring(0, var98);
                                                var97 = var97.substring(var98 + 4);
                                            }
                                            var87.method3397(var99, var93 + 3, var96, 0, -1);
                                            var96 += var87.field2926 + 1;
                                        }
                                    }
                                    if (var10.field2542 == 9) {
                                        if (var10.field2561 == 1) {
                                            class73.method1570(var13, var14, var10.field2547 + var13, var10.field2648 + var14, var10.field2571);
                                        } else {
                                            int var100 = var10.field2547 >= 0 ? var10.field2547 : -var10.field2547;
                                            int var101 = var10.field2648 >= 0 ? var10.field2648 : -var10.field2648;
                                            int var102 = var100;
                                            if (var100 < var101) {
                                                var102 = var101;
                                            }
                                            if (var102 != 0) {
                                                int var103 = (var10.field2547 << 16) / var102;
                                                int var104 = (var10.field2648 << 16) / var102;
                                                if (var104 <= var103) {
                                                    var103 = -var103;
                                                } else {
                                                    var104 = -var104;
                                                }
                                                int var105 = var10.field2561 * var104 >> 17;
                                                int var106 = var10.field2561 * var104 + 1 >> 17;
                                                int var107 = var10.field2561 * var103 >> 17;
                                                int var108 = var10.field2561 * var103 + 1 >> 17;
                                                int var109 = var13 + var105;
                                                int var110 = var13 - var106;
                                                int var111 = var10.field2547 + var13 - var106;
                                                int var112 = var10.field2547 + var13 + var105;
                                                int var113 = var14 + var107;
                                                int var114 = var14 - var108;
                                                int var115 = var10.field2648 + var14 - var108;
                                                int var116 = var10.field2648 + var14 + var107;
                                                class84.method1843(var109, var110, var111);
                                                class84.method1846(var113, var114, var115, var109, var110, var111, var10.field2571);
                                                class84.method1843(var109, var111, var112);
                                                class84.method1846(var113, var115, var116, var109, var111, var112, var10.field2571);
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

    @ObfuscatedName("ch.cc(Ljava/lang/String;Leq;I)Ljava/lang/String;")
    public static String method1832(String arg0, class153 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method78(method103(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field8 != null) {
                    var5 = class200.method128(Statics.field8.field2059);
                    if (Statics.field8.field2055 != null) {
                        var5 = (String) Statics.field8.field2055;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cx.cj(II)Ljava/lang/String;")
    public static final String method1938(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field19 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method660(65408) + var1.substring(0, var1.length() - 8) + class143.field2184 + " " + class2.field21 + var1 + class2.field22 + class2.field23;
        } else if (var1.length() > 6) {
            return " " + class2.method660(16777215) + var1.substring(0, var1.length() - 4) + class143.field2310 + " " + class2.field21 + var1 + class2.field22 + class2.field23;
        } else {
            return " " + class2.method660(16776960) + var1 + class2.field23;
        }
    }

    @ObfuscatedName("s.cx(II)Ljava/lang/String;")
    public static final String method78(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("dy.cq(Leq;S)Z")
    public static final boolean method2628(class153 arg0) {
        if (arg0.field2635 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2635.length; var1++) {
            int var2 = method103(arg0, var1);
            int var3 = arg0.field2636[var1];
            if (arg0.field2635[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2635[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2635[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("u.co(Leq;II)I")
    public static final int method103(class153 arg0, int arg1) {
        if (arg0.field2634 == null || arg1 >= arg0.field2634.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2634[arg1];
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
                    var7 = field397[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field323[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class153 var11 = class153.method2577(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method588(var12).field1025 || field513)) {
                        for (int var13 = 0; var13 < var11.field2559.length; var13++) {
                            if (var12 + 1 == var11.field2559[var13]) {
                                var7 += var11.field2641[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class155.field2662[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class141.field2131[field397[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class155.field2662[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1248.field31;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class141.field2133[var14]) {
                            var7 += field397[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class153 var17 = class153.method2577(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method588(var18).field1025 || field513)) {
                        for (int var19 = 0; var19 < var17.field2559.length; var19++) {
                            if (var18 + 1 == var17.field2559[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field488;
                }
                if (var6 == 12) {
                    var7 = field425;
                }
                if (var6 == 13) {
                    int var20 = class155.field2662[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class155.method2483(var22);
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
                    var7 = (Statics.field1248.field740 >> 7) + Statics.field1245;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1248.field730 >> 7) + Statics.field2495;
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

    @ObfuscatedName("gf.ca(Leq;IIB)V")
    public static final void method3622(class153 arg0, int arg1, int arg2) {
        if (arg0.field2540 == 1) {
            method92(arg0.field2639, "", 24, 0, 0, arg0.field2538);
        }
        if (arg0.field2540 == 2 && !field302) {
            int var3 = method708(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2589 == null || arg0.field2589.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2589;
            }
            if (var5 != null) {
                method92(var5, class2.method660(65280) + arg0.field2644, 25, 0, -1, arg0.field2538);
            }
        }
        if (arg0.field2540 == 3) {
            method92(class143.field2306, "", 26, 0, 0, arg0.field2538);
        }
        if (arg0.field2540 == 4) {
            method92(arg0.field2639, "", 28, 0, 0, arg0.field2538);
        }
        if (arg0.field2540 == 5) {
            method92(arg0.field2639, "", 29, 0, 0, arg0.field2538);
        }
        if (arg0.field2540 == 6 && field423 == null) {
            method92(arg0.field2639, "", 30, 0, -1, arg0.field2538);
        }
        if (arg0.field2542 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2648; var8++) {
                for (int var9 = 0; var9 < arg0.field2547; var9++) {
                    int var10 = (arg0.field2608 + 32) * var9;
                    int var11 = (arg0.field2592 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2593[var7];
                        var11 += arg0.field2609[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field372 = var7;
                        Statics.field891 = arg0;
                        if (arg0.field2559[var7] > 0) {
                            label314: {
                                class45 var12 = class45.method588(arg0.field2559[var7] - 1);
                                if (field506 == 1) {
                                    int var13 = method708(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if (Statics.field696 != arg0.field2538 || Statics.field2484 != var7) {
                                            method92(class143.field2297, field413 + " " + class2.field27 + " " + class2.method660(16748608) + var12.field1012, 31, var12.field1010, var7, arg0.field2538);
                                        }
                                        break label314;
                                    }
                                }
                                if (field302) {
                                    int var15 = method708(arg0);
                                    boolean var16 = (var15 >> 30 & 0x1) != 0;
                                    if (var16) {
                                        if ((Statics.field1538 & 0x10) == 16) {
                                            method92(field327, field412 + " " + class2.field27 + " " + class2.method660(16748608) + var12.field1012, 32, var12.field1010, var7, arg0.field2538);
                                        }
                                        break label314;
                                    }
                                }
                                String[] var17 = var12.field1027;
                                if (field430) {
                                    var17 = method509(var17);
                                }
                                int var18 = method708(arg0);
                                boolean var19 = (var18 >> 30 & 0x1) != 0;
                                if (var19) {
                                    for (int var20 = 4; var20 >= 3; var20--) {
                                        if (var17 != null && var17[var20] != null) {
                                            byte var21;
                                            if (var20 == 3) {
                                                var21 = 36;
                                            } else {
                                                var21 = 37;
                                            }
                                            method92(var17[var20], class2.method660(16748608) + var12.field1012, var21, var12.field1010, var7, arg0.field2538);
                                        } else if (var20 == 4) {
                                            method92(class143.field2149, class2.method660(16748608) + var12.field1012, 37, var12.field1010, var7, arg0.field2538);
                                        }
                                    }
                                }
                                class157 var10000 = (class157) null;
                                if (class157.method846(method708(arg0))) {
                                    method92(class143.field2297, class2.method660(16748608) + var12.field1012, 38, var12.field1010, var7, arg0.field2538);
                                }
                                int var22 = method708(arg0);
                                boolean var23 = (var22 >> 30 & 0x1) != 0;
                                if (var23 && var17 != null) {
                                    for (int var24 = 2; var24 >= 0; var24--) {
                                        if (var17[var24] != null) {
                                            byte var25 = 0;
                                            if (var24 == 0) {
                                                var25 = 33;
                                            }
                                            if (var24 == 1) {
                                                var25 = 34;
                                            }
                                            if (var24 == 2) {
                                                var25 = 35;
                                            }
                                            method92(var17[var24], class2.method660(16748608) + var12.field1012, var25, var12.field1010, var7, arg0.field2538);
                                        }
                                    }
                                }
                                String[] var26 = arg0.field2596;
                                if (field430) {
                                    var26 = method509(var26);
                                }
                                if (var26 != null) {
                                    for (int var27 = 4; var27 >= 0; var27--) {
                                        if (var26[var27] != null) {
                                            byte var28 = 0;
                                            if (var27 == 0) {
                                                var28 = 39;
                                            }
                                            if (var27 == 1) {
                                                var28 = 40;
                                            }
                                            if (var27 == 2) {
                                                var28 = 41;
                                            }
                                            if (var27 == 3) {
                                                var28 = 42;
                                            }
                                            if (var27 == 4) {
                                                var28 = 43;
                                            }
                                            method92(var26[var27], class2.method660(16748608) + var12.field1012, var28, var12.field1010, var7, arg0.field2538);
                                        }
                                    }
                                }
                                method92(class143.field2298, class2.method660(16748608) + var12.field1012, 1005, var12.field1010, var7, arg0.field2538);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2537) {
            return;
        }
        if (field302) {
            int var29 = method708(arg0);
            boolean var30 = (var29 >> 21 & 0x1) != 0;
            if (var30 && (Statics.field1538 & 0x20) == 32) {
                method92(field327, field412 + " " + class2.field27 + " " + arg0.field2554, 58, 0, arg0.field2539, arg0.field2538);
            }
            return;
        }
        for (int var31 = 9; var31 >= 5; var31--) {
            String var32 = method2911(arg0, var31);
            if (var32 != null) {
                method92(var32, arg0.field2554, 1007, var31 + 1, arg0.field2539, arg0.field2538);
            }
        }
        int var33 = method708(arg0);
        int var34 = var33 >> 11 & 0x3F;
        String var35;
        if (var34 == 0) {
            var35 = null;
        } else if (arg0.field2589 == null || arg0.field2589.trim().length() == 0) {
            var35 = null;
        } else {
            var35 = arg0.field2589;
        }
        if (var35 != null) {
            method92(var35, arg0.field2554, 25, 0, arg0.field2539, arg0.field2538);
        }
        for (int var37 = 4; var37 >= 0; var37--) {
            String var38 = method2911(arg0, var37);
            if (var38 != null) {
                method92(var38, arg0.field2554, 57, var37 + 1, arg0.field2539, arg0.field2538);
            }
        }
        if (class157.method523(method708(arg0))) {
            method92(class143.field2375, "", 30, 0, arg0.field2539, arg0.field2538);
        }
    }

    @ObfuscatedName("dz.cz([Leq;IIIIIIII)V")
    public static final void method2412(class153[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class153 var9 = arg0[var8];
            if (var9 != null && (!var9.field2537 || var9.field2542 == 0 || var9.field2562 || method708(var9) != 0 || field432 == var9) && var9.field2549 == arg1 && (!var9.field2537 || !method2096(var9))) {
                int var10 = var9.field2617 + arg6;
                int var11 = var9.field2544 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2542 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2542 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2547 + var10;
                    int var19 = var9.field2648 + var11;
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
                    int var23 = var9.field2648 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field431 == var9) {
                    field439 = true;
                    field440 = var10;
                    field441 = var11;
                }
                if (!var9.field2537 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field1990;
                    int var25 = class127.field1995;
                    if (class127.field2003 != 0) {
                        var24 = class127.field1988;
                        var25 = class127.field2002;
                    }
                    if (var9.field2625 == 1337) {
                        method45(var9);
                        if (!field263 && !field400 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field506 == 0 && !field302) {
                                method92(class143.field2171, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            for (int var27 = 0; var27 < class98.field1740; var27++) {
                                int var28 = class98.field1756[var27];
                                int var29 = var28 & 0x7F;
                                int var30 = var28 >> 7 & 0x7F;
                                int var31 = var28 >> 29 & 0x3;
                                int var32 = var28 >> 14 & 0x7FFF;
                                if (var26 != var28) {
                                    var26 = var28;
                                    if (var31 == 2 && Statics.field2687.method1683(Statics.field243, var29, var30, var28) >= 0) {
                                        class36 var33 = class36.method2523(var32);
                                        if (var33.field881 != null) {
                                            var33 = var33.method686();
                                        }
                                        if (var33 == null) {
                                            continue;
                                        }
                                        if (field506 == 1) {
                                            method92(class143.field2297, field413 + " " + class2.field27 + " " + class2.method660(65535) + var33.field850, 1, var28, var29, var30);
                                        } else if (!field302) {
                                            String[] var34 = var33.field855;
                                            if (field430) {
                                                var34 = method509(var34);
                                            }
                                            if (var34 != null) {
                                                for (int var35 = 4; var35 >= 0; var35--) {
                                                    if (var34[var35] != null) {
                                                        short var36 = 0;
                                                        if (var35 == 0) {
                                                            var36 = 3;
                                                        }
                                                        if (var35 == 1) {
                                                            var36 = 4;
                                                        }
                                                        if (var35 == 2) {
                                                            var36 = 5;
                                                        }
                                                        if (var35 == 3) {
                                                            var36 = 6;
                                                        }
                                                        if (var35 == 4) {
                                                            var36 = 1001;
                                                        }
                                                        method92(var34[var35], class2.method660(65535) + var33.field850, var36, var28, var29, var30);
                                                    }
                                                }
                                            }
                                            method92(class143.field2298, class2.method660(65535) + var33.field850, 1002, var33.field847 << 14, var29, var30);
                                        } else if ((Statics.field1538 & 0x4) == 4) {
                                            method92(field327, field412 + " " + class2.field27 + " " + class2.method660(65535) + var33.field850, 2, var28, var29, var30);
                                        }
                                    }
                                    if (var31 == 1) {
                                        class30 var37 = field410[var32];
                                        if (var37 == null) {
                                            continue;
                                        }
                                        if (var37.field701.field827 == 1 && (var37.field740 & 0x7F) == 64 && (var37.field730 & 0x7F) == 64) {
                                            for (int var38 = 0; var38 < field294; var38++) {
                                                class30 var39 = field410[field295[var38]];
                                                if (var39 != null && var37 != var39 && var39.field701.field827 == 1 && var37.field740 == var39.field740 && var37.field730 == var39.field730) {
                                                    method133(var39.field701, field295[var38], var29, var30);
                                                }
                                            }
                                            for (int var40 = 0; var40 < field377; var40++) {
                                                class3 var41 = field333[field378[var40]];
                                                if (var41 != null && var37.field740 == var41.field740 && var37.field730 == var41.field730) {
                                                    method125(var41, field378[var40], var29, var30);
                                                }
                                            }
                                        }
                                        method133(var37.field701, var32, var29, var30);
                                    }
                                    if (var31 == 0) {
                                        class3 var42 = field333[var32];
                                        if (var42 == null) {
                                            continue;
                                        }
                                        if ((var42.field740 & 0x7F) == 64 && (var42.field730 & 0x7F) == 64) {
                                            for (int var43 = 0; var43 < field294; var43++) {
                                                class30 var44 = field410[field295[var43]];
                                                if (var44 != null && var44.field701.field827 == 1 && var42.field740 == var44.field740 && var42.field730 == var44.field730) {
                                                    method133(var44.field701, field295[var43], var29, var30);
                                                }
                                            }
                                            for (int var45 = 0; var45 < field377; var45++) {
                                                class3 var46 = field333[field378[var45]];
                                                if (var46 != null && var42 != var46 && var42.field740 == var46.field740 && var42.field730 == var46.field730) {
                                                    method125(var46, field378[var45], var29, var30);
                                                }
                                            }
                                        }
                                        method125(var42, var32, var29, var30);
                                    }
                                    if (var31 == 3) {
                                        class178 var47 = field470[Statics.field243][var29][var30];
                                        if (var47 != null) {
                                            for (class25 var48 = (class25) var47.method3299(); var48 != null; var48 = (class25) var47.method3317()) {
                                                class45 var49 = class45.method588(var48.field617);
                                                if (field506 == 1) {
                                                    method92(class143.field2297, field413 + " " + class2.field27 + " " + class2.method660(16748608) + var49.field1012, 16, var48.field617, var29, var30);
                                                } else if (!field302) {
                                                    String[] var50 = var49.field1050;
                                                    if (field430) {
                                                        var50 = method509(var50);
                                                    }
                                                    for (int var51 = 4; var51 >= 0; var51--) {
                                                        if (var50 != null && var50[var51] != null) {
                                                            byte var52 = 0;
                                                            if (var51 == 0) {
                                                                var52 = 18;
                                                            }
                                                            if (var51 == 1) {
                                                                var52 = 19;
                                                            }
                                                            if (var51 == 2) {
                                                                var52 = 20;
                                                            }
                                                            if (var51 == 3) {
                                                                var52 = 21;
                                                            }
                                                            if (var51 == 4) {
                                                                var52 = 22;
                                                            }
                                                            method92(var50[var51], class2.method660(16748608) + var49.field1012, var52, var48.field617, var29, var30);
                                                        } else if (var51 == 2) {
                                                            method92(class143.field2148, class2.method660(16748608) + var49.field1012, 20, var48.field617, var29, var30);
                                                        }
                                                    }
                                                    method92(class143.field2298, class2.method660(16748608) + var49.field1012, 1004, var48.field617, var29, var30);
                                                } else if ((Statics.field1538 & 0x1) == 1) {
                                                    method92(field327, field412 + " " + class2.field27 + " " + class2.method660(16748608) + var49.field1012, 17, var48.field617, var29, var30);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var9.field2625 != 1338) {
                        if (!field400 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method3622(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2542 == 0) {
                            if (!var9.field2537 && method2096(var9) && Statics.field221 != var9) {
                                continue;
                            }
                            method2412(arg0, var9.field2538, var12, var13, var14, var15, var10 - var9.field2551, var11 - var9.field2552);
                            if (var9.field2632 != null) {
                                method2412(var9.field2632, var9.field2538, var12, var13, var14, var15, var10 - var9.field2551, var11 - var9.field2552);
                            }
                            class4 var64 = (class4) field420.method3263((long) var9.field2538);
                            if (var64 != null) {
                                if (var64.field62 == 0 && class127.field1990 >= var12 && class127.field1995 >= var13 && class127.field1990 < var14 && class127.field1995 < var15 && !field400 && !field429) {
                                    field406[0] = class143.field2369;
                                    field407[0] = "";
                                    field508[0] = 1006;
                                    field401 = 1;
                                }
                                int var65 = var64.field63;
                                if (class153.method487(var65)) {
                                    method2412(Statics.field2572[var65], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2537) {
                            if (var9.field2605 && class127.field1990 >= var12 && class127.field1995 >= var13 && class127.field1990 < var14 && class127.field1995 < var15) {
                                for (class1 var66 = (class1) field252.method3303(); var66 != null; var66 = (class1) field252.method3300()) {
                                    if (var66.field2) {
                                        var66.method3378();
                                        var66.field3.field2647 = false;
                                    }
                                }
                                if (Statics.field1503 == 0) {
                                    field431 = null;
                                    field432 = null;
                                }
                                if (!field400) {
                                    field406[0] = class143.field2369;
                                    field407[0] = "";
                                    field508[0] = 1006;
                                    field401 = 1;
                                }
                            }
                            boolean var67;
                            if (class127.field1990 >= var12 && class127.field1995 >= var13 && class127.field1990 < var14 && class127.field1995 < var15) {
                                var67 = true;
                            } else {
                                var67 = false;
                            }
                            boolean var68 = false;
                            if ((class127.field2001 == 1 || !Statics.field2084 && class127.field2001 == 4) && var67) {
                                var68 = true;
                            }
                            boolean var69 = false;
                            if ((class127.field2003 == 1 || !Statics.field2084 && class127.field2003 == 4) && class127.field1988 >= var12 && class127.field2002 >= var13 && class127.field1988 < var14 && class127.field2002 < var15) {
                                var69 = true;
                            }
                            if (var69) {
                                method2776(var9, class127.field1988 - var10, class127.field2002 - var11);
                            }
                            if (field431 != null && field431 != var9 && var67 && class157.method2474(method708(var9))) {
                                field435 = var9;
                            }
                            if (field432 == var9) {
                                field436 = true;
                                field253 = var10;
                                field438 = var11;
                            }
                            if (var9.field2562) {
                                if (var67 && field456 != 0 && var9.field2626 != null) {
                                    class1 var70 = new class1();
                                    var70.field2 = true;
                                    var70.field3 = var9;
                                    var70.field9 = field456;
                                    var70.field7 = var9.field2626;
                                    field252.method3291(var70);
                                }
                                if (field431 != null || Statics.field694 != null || field400) {
                                    var69 = false;
                                    var68 = false;
                                    var67 = false;
                                }
                                if (!var9.field2594 && var69) {
                                    var9.field2594 = true;
                                    if (var9.field2607 != null) {
                                        class1 var71 = new class1();
                                        var71.field2 = true;
                                        var71.field3 = var9;
                                        var71.field4 = class127.field1988 - var10;
                                        var71.field9 = class127.field2002 - var11;
                                        var71.field7 = var9.field2607;
                                        field252.method3291(var71);
                                    }
                                }
                                if (var9.field2594 && var68 && var9.field2528 != null) {
                                    class1 var72 = new class1();
                                    var72.field2 = true;
                                    var72.field3 = var9;
                                    var72.field4 = class127.field1990 - var10;
                                    var72.field9 = class127.field1995 - var11;
                                    var72.field7 = var9.field2528;
                                    field252.method3291(var72);
                                }
                                if (var9.field2594 && !var68) {
                                    var9.field2594 = false;
                                    if (var9.field2535 != null) {
                                        class1 var73 = new class1();
                                        var73.field2 = true;
                                        var73.field3 = var9;
                                        var73.field4 = class127.field1990 - var10;
                                        var73.field9 = class127.field1995 - var11;
                                        var73.field7 = var9.field2535;
                                        field467.method3291(var73);
                                    }
                                }
                                if (var68 && var9.field2610 != null) {
                                    class1 var74 = new class1();
                                    var74.field2 = true;
                                    var74.field3 = var9;
                                    var74.field4 = class127.field1990 - var10;
                                    var74.field9 = class127.field1995 - var11;
                                    var74.field7 = var9.field2610;
                                    field252.method3291(var74);
                                }
                                if (!var9.field2647 && var67) {
                                    var9.field2647 = true;
                                    if (var9.field2579 != null) {
                                        class1 var75 = new class1();
                                        var75.field2 = true;
                                        var75.field3 = var9;
                                        var75.field4 = class127.field1990 - var10;
                                        var75.field9 = class127.field1995 - var11;
                                        var75.field7 = var9.field2579;
                                        field252.method3291(var75);
                                    }
                                }
                                if (var9.field2647 && var67 && var9.field2612 != null) {
                                    class1 var76 = new class1();
                                    var76.field2 = true;
                                    var76.field3 = var9;
                                    var76.field4 = class127.field1990 - var10;
                                    var76.field9 = class127.field1995 - var11;
                                    var76.field7 = var9.field2612;
                                    field252.method3291(var76);
                                }
                                if (var9.field2647 && !var67) {
                                    var9.field2647 = false;
                                    if (var9.field2638 != null) {
                                        class1 var77 = new class1();
                                        var77.field2 = true;
                                        var77.field3 = var9;
                                        var77.field4 = class127.field1990 - var10;
                                        var77.field9 = class127.field1995 - var11;
                                        var77.field7 = var9.field2638;
                                        field467.method3291(var77);
                                    }
                                }
                                if (var9.field2624 != null) {
                                    class1 var78 = new class1();
                                    var78.field3 = var9;
                                    var78.field7 = var9.field2624;
                                    field445.method3291(var78);
                                }
                                if (var9.field2618 != null && field376 > var9.field2650) {
                                    if (var9.field2619 == null || field376 - var9.field2650 > 32) {
                                        class1 var83 = new class1();
                                        var83.field3 = var9;
                                        var83.field7 = var9.field2618;
                                        field252.method3291(var83);
                                    } else {
                                        label839: for (int var79 = var9.field2650; var79 < field376; var79++) {
                                            int var80 = field444[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var9.field2619.length; var81++) {
                                                if (var9.field2619[var81] == var80) {
                                                    class1 var82 = new class1();
                                                    var82.field3 = var9;
                                                    var82.field7 = var9.field2618;
                                                    field252.method3291(var82);
                                                    break label839;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2650 = field376;
                                }
                                if (var9.field2620 != null && field447 > var9.field2651) {
                                    if (var9.field2621 == null || field447 - var9.field2651 > 32) {
                                        class1 var88 = new class1();
                                        var88.field3 = var9;
                                        var88.field7 = var9.field2620;
                                        field252.method3291(var88);
                                    } else {
                                        label815: for (int var84 = var9.field2651; var84 < field447; var84++) {
                                            int var85 = field446[var84 & 0x1F];
                                            for (int var86 = 0; var86 < var9.field2621.length; var86++) {
                                                if (var9.field2621[var86] == var85) {
                                                    class1 var87 = new class1();
                                                    var87.field3 = var9;
                                                    var87.field7 = var9.field2620;
                                                    field252.method3291(var87);
                                                    break label815;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2651 = field447;
                                }
                                if (var9.field2622 != null && field449 > var9.field2652) {
                                    if (var9.field2615 == null || field449 - var9.field2652 > 32) {
                                        class1 var93 = new class1();
                                        var93.field3 = var9;
                                        var93.field7 = var9.field2622;
                                        field252.method3291(var93);
                                    } else {
                                        label791: for (int var89 = var9.field2652; var89 < field449; var89++) {
                                            int var90 = field448[var89 & 0x1F];
                                            for (int var91 = 0; var91 < var9.field2615.length; var91++) {
                                                if (var9.field2615[var91] == var90) {
                                                    class1 var92 = new class1();
                                                    var92.field3 = var9;
                                                    var92.field7 = var9.field2622;
                                                    field252.method3291(var92);
                                                    break label791;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2652 = field449;
                                }
                                if (field388 > var9.field2649 && var9.field2627 != null) {
                                    class1 var94 = new class1();
                                    var94.field3 = var9;
                                    var94.field7 = var9.field2627;
                                    field252.method3291(var94);
                                }
                                if (field451 > var9.field2649 && var9.field2629 != null) {
                                    class1 var95 = new class1();
                                    var95.field3 = var9;
                                    var95.field7 = var9.field2629;
                                    field252.method3291(var95);
                                }
                                if (field452 > var9.field2649 && var9.field2630 != null) {
                                    class1 var96 = new class1();
                                    var96.field3 = var9;
                                    var96.field7 = var9.field2630;
                                    field252.method3291(var96);
                                }
                                if (field453 > var9.field2649 && var9.field2631 != null) {
                                    class1 var97 = new class1();
                                    var97.field3 = var9;
                                    var97.field7 = var9.field2631;
                                    field252.method3291(var97);
                                }
                                var9.field2649 = field443;
                                if (var9.field2628 != null) {
                                    for (int var98 = 0; var98 < field457; var98++) {
                                        class1 var99 = new class1();
                                        var99.field3 = var9;
                                        var99.field1 = field478[var98];
                                        var99.field16 = field264[var98];
                                        var99.field7 = var9.field2628;
                                        field252.method3291(var99);
                                    }
                                }
                            }
                        }
                        if (!var9.field2537 && field431 == null && Statics.field694 == null && !field400) {
                            if ((var9.field2637 >= 0 || var9.field2557 != 0) && class127.field1990 >= var12 && class127.field1995 >= var13 && class127.field1990 < var14 && class127.field1995 < var15) {
                                if (var9.field2637 >= 0) {
                                    Statics.field221 = arg0[var9.field2637];
                                } else {
                                    Statics.field221 = var9;
                                }
                            }
                            if (var9.field2542 == 8 && class127.field1990 >= var12 && class127.field1995 >= var13 && class127.field1990 < var14 && class127.field1995 < var15) {
                                Statics.field967 = var9;
                            }
                            if (var9.field2530 > var9.field2648) {
                                int var100 = var9.field2547 + var10;
                                int var101 = var9.field2648;
                                int var102 = var9.field2530;
                                int var103 = class127.field1990;
                                int var104 = class127.field1995;
                                if (field337) {
                                    field338 = 32;
                                } else {
                                    field338 = 0;
                                }
                                field337 = false;
                                if (class127.field2001 == 1 || !Statics.field2084 && class127.field2001 == 4) {
                                    if (var103 >= var100 && var103 < var100 + 16 && var104 >= var11 && var104 < var11 + 16) {
                                        var9.field2552 -= 4;
                                        method45(var9);
                                    } else if (var103 >= var100 && var103 < var100 + 16 && var104 >= var11 + var101 - 16 && var104 < var11 + var101) {
                                        var9.field2552 += 4;
                                        method45(var9);
                                    } else if (var103 >= var100 - field338 && var103 < field338 + var100 + 16 && var104 >= var11 + 16 && var104 < var11 + var101 - 16) {
                                        int var105 = (var101 - 32) * var101 / var102;
                                        if (var105 < 8) {
                                            var105 = 8;
                                        }
                                        int var106 = var104 - var11 - 16 - var105 / 2;
                                        int var107 = var101 - 32 - var105;
                                        var9.field2552 = (var102 - var101) * var106 / var107;
                                        method45(var9);
                                        field337 = true;
                                    }
                                }
                                if (field456 != 0) {
                                    int var108 = var9.field2547;
                                    if (var103 >= var100 - var108 && var104 >= var11 && var103 < var100 + 16 && var104 <= var11 + var101) {
                                        var9.field2552 += field456 * 45;
                                        method45(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field490 == 0 || field490 == 3) && (class127.field2003 == 1 || !Statics.field2084 && class127.field2003 == 4)) {
                        int var53 = class127.field1988 - 25 - var10;
                        int var54 = class127.field2002 - 5 - var11;
                        if (var53 >= 0 && var54 >= 0 && var53 < 146 && var54 < 151 && (var53 < 0 || var53 > 23 || var54 < 117 || var54 > 142)) {
                            var53 -= 73;
                            var54 -= 75;
                            int var55 = field396 + field387 & 0x7FF;
                            int var56 = class84.field1489[var55];
                            int var57 = class84.field1470[var55];
                            int var58 = (field329 + 256) * var56 >> 8;
                            int var59 = (field329 + 256) * var57 >> 8;
                            int var60 = var53 * var59 + var54 * var58 >> 11;
                            int var61 = var54 * var59 - var53 * var58 >> 11;
                            int var62 = Statics.field1248.field740 + var60 >> 7;
                            int var63 = Statics.field1248.field730 - var61 >> 7;
                            field297.method2408(227);
                            field297.method2159(18);
                            field297.method2203(Statics.field1245 + var62);
                            field297.method2198(Statics.field2495 + var63);
                            field297.method2194(class124.field1946[82] ? (class124.field1946[81] ? 2 : 1) : 0);
                            field297.method2159(var53);
                            field297.method2159(var54);
                            field297.method2364(field396);
                            field297.method2159(57);
                            field297.method2159(field387);
                            field297.method2159(field329);
                            field297.method2159(89);
                            field297.method2364(Statics.field1248.field740);
                            field297.method2364(Statics.field1248.field730);
                            field297.method2159(63);
                            field487 = var62;
                            field309 = var63;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.ce([Leq;II)V")
    public static final void method552(class153[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class153 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2542 == 0) {
                    if (var3.field2632 != null) {
                        method552(var3.field2632, arg1);
                    }
                    class4 var4 = (class4) field420.method3263((long) var3.field2538);
                    if (var4 != null) {
                        int var5 = var4.field63;
                        if (class153.method487(var5)) {
                            method552(Statics.field2572[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2646 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field7 = var3.field2646;
                    class32.method47(var6);
                }
                if (arg1 == 1 && var3.field2633 != null) {
                    if (var3.field2539 >= 0) {
                        class153 var7 = class153.method2577(var3.field2538);
                        if (var7 == null || var7.field2632 == null || var3.field2539 >= var7.field2632.length || var7.field2632[var3.field2539] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field7 = var3.field2633;
                    class32.method47(var8);
                }
            }
        }
    }

    @ObfuscatedName("ec.cn(Leq;IIB)V")
    public static final void method2776(class153 arg0, int arg1, int arg2) {
        if (field431 != null || field400 || arg0 == null || Statics.method486(arg0) == null) {
            return;
        }
        field431 = arg0;
        field432 = Statics.method486(arg0);
        field475 = arg1;
        field434 = arg2;
        Statics.field1503 = 0;
        field442 = false;
        if (field401 <= 0) {
            return;
        }
        int var3 = field401 - 1;
        Statics.field1460 = new class27();
        Statics.field1460.field640 = field402[var3];
        Statics.field1460.field638 = field403[var3];
        Statics.field1460.field637 = field508[var3];
        Statics.field1460.field644 = field405[var3];
        Statics.field1460.field639 = field406[var3];
    }

    @ObfuscatedName("n.cv(Leq;I)V")
    public static void method45(class153 arg0) {
        if (field514 == arg0.field2583) {
            field463[arg0.field2653] = true;
        }
    }

    @ObfuscatedName("y.cw(I)V")
    public static void method135() {
        for (class4 var0 = (class4) field420.method3277(); var0 != null; var0 = (class4) field420.method3267()) {
            int var1 = var0.field63;
            if (class153.method487(var1)) {
                boolean var2 = true;
                class153[] var3 = Statics.field2572[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2537;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2881;
                    class153 var6 = class153.method2577(var5);
                    if (var6 != null) {
                        method45(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.cp([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method509(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("bi.cr(II)V")
    public static final void method1368(int arg0) {
        if (!class153.method487(arg0)) {
            return;
        }
        class153[] var1 = Statics.field2572[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3 != null) {
                var3.field2580 = 0;
                var3.field2645 = 0;
            }
        }
    }

    @ObfuscatedName("y.de([Leq;II)V")
    public static final void method134(class153[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class153 var3 = arg0[var2];
            if (var3 != null && var3.field2549 == arg1 && (!var3.field2537 || !method2096(var3))) {
                if (var3.field2542 == 0) {
                    if (!var3.field2537 && method2096(var3) && Statics.field221 != var3) {
                        continue;
                    }
                    method134(arg0, var3.field2538);
                    if (var3.field2632 != null) {
                        method134(var3.field2632, var3.field2538);
                    }
                    class4 var4 = (class4) field420.method3263((long) var3.field2538);
                    if (var4 != null) {
                        Statics.method154(var4.field63);
                    }
                }
                if (var3.field2542 == 6) {
                    if (var3.field2574 != -1 || var3.field2575 != -1) {
                        boolean var5 = method2628(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2575;
                        } else {
                            var6 = var3.field2574;
                        }
                        if (var6 != -1) {
                            class38 var7 = class38.method507(var6);
                            var3.field2645 += field332;
                            while (var3.field2645 > var7.field907[var3.field2580]) {
                                var3.field2645 -= var7.field907[var3.field2580];
                                var3.field2580++;
                                if (var3.field2580 >= var7.field905.length) {
                                    var3.field2580 -= var7.field909;
                                    if (var3.field2580 < 0 || var3.field2580 >= var7.field905.length) {
                                        var3.field2580 = 0;
                                    }
                                }
                                method45(var3);
                            }
                        }
                    }
                    if (var3.field2582 != 0 && !var3.field2537) {
                        int var8 = var3.field2582 >> 16;
                        int var9 = var3.field2582 << 16 >> 16;
                        int var10 = field332 * var8;
                        int var11 = field332 * var9;
                        var3.field2578 = var3.field2578 + var10 & 0x7FF;
                        var3.field2548 = var3.field2548 + var11 & 0x7FF;
                        method45(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.dp(II)V")
    public static final void method590(int arg0) {
        method135();
        for (class20 var1 = (class20) class20.field540.method3303(); var1 != null; var1 = (class20) class20.field540.method3300()) {
            if (var1.field554 != null) {
                var1.method497();
            }
        }
        int var2 = class46.method707(arg0).field1061;
        if (var2 == 0) {
            return;
        }
        int var3 = class155.field2662[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class84.method1840(0.9D);
                ((class88) Statics.field1486).method1919(0.9D);
            }
            if (var3 == 2) {
                class84.method1840(0.8D);
                ((class88) Statics.field1486).method1919(0.8D);
            }
            if (var3 == 3) {
                class84.method1840(0.7D);
                ((class88) Statics.field1486).method1919(0.7D);
            }
            if (var3 == 4) {
                class84.method1840(0.6D);
                ((class88) Statics.field1486).method1919(0.6D);
            }
            class45.method1362();
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
            if (field491 != var4) {
                if (field491 == 0 && field492 != -1) {
                    class162.method2893(Statics.field195, field492, 0, var4, false);
                    field493 = false;
                } else if (var4 == 0) {
                    Statics.field697.method3109();
                    class162.field2720 = 1;
                    Statics.field1897 = null;
                    field493 = false;
                } else {
                    class162.method46(var4);
                }
                field491 = var4;
            }
        }
        if (var2 == 4) {
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
        if (var2 == 5) {
            field399 = var3;
        }
        if (var2 == 6) {
            field497 = var3;
        }
        if (var2 == 9) {
            field422 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field495 = 127;
            }
            if (var3 == 1) {
                field495 = 96;
            }
            if (var3 == 2) {
                field495 = 64;
            }
            if (var3 == 3) {
                field495 = 32;
            }
            if (var3 == 4) {
                field495 = 0;
            }
        }
        if (var2 == 17) {
            field268 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class18[] var5 = new class18[] { class18.field523, class18.field525, class18.field520 };
            field282 = (class18) class99.method496(var5, var3);
            if (field282 == null) {
                field282 = class18.field520;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field391 = -1;
        } else {
            field391 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("es.dl(Lc;ZB)V")
    public static final void method2754(class4 arg0, boolean arg1) {
        int var2 = arg0.field63;
        int var3 = (int) arg0.field2881;
        arg0.method3378();
        if (arg1 && var2 != -1 && Statics.field2529[var2]) {
            Statics.field2602.method2798(var2);
            if (Statics.field2572[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2572[var2].length; var5++) {
                    if (Statics.field2572[var2][var5] != null) {
                        if (Statics.field2572[var2][var5].field2542 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2572[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2572[var2] = null;
                }
                Statics.field2529[var2] = false;
            }
        }
        for (class180 var6 = (class180) field460.method3277(); var6 != null; var6 = (class180) field460.method3267()) {
            if ((long) var2 == (var6.field2881 >> 48 & 0xFFFFL)) {
                var6.method3378();
            }
        }
        class153 var7 = class153.method2577(var3);
        if (var7 != null) {
            method45(var7);
        }
        method3204();
        if (field350 != -1) {
            int var8 = field350;
            if (class153.method487(var8)) {
                method552(Statics.field2572[var8], 1);
            }
        }
    }

    @ObfuscatedName("h.du(Leq;I)Z")
    public static final boolean method126(class153 arg0) {
        int var1 = arg0.field2625;
        if (var1 == 205) {
            field389 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field305.method2985(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field305.method2982(var4, var5 == 1);
        }
        if (var1 == 324) {
            field305.method2972(false);
        }
        if (var1 == 325) {
            field305.method2972(true);
        }
        if (var1 == 326) {
            field297.method2408(70);
            field305.method2973(field297);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("q.dz(IIII)V")
    public static final void method503(int arg0, int arg1, int arg2) {
        Statics.method161();
        class73.method1554(arg0, arg1, Statics.field185.field1329 + arg0, Statics.field185.field1326 + arg1);
        if (field490 == 2 || field490 == 5) {
            class73.method1607(arg0 + 25, arg1 + 5, 0, Statics.field837, Statics.field24);
        } else {
            int var3 = field396 + field387 & 0x7FF;
            int var4 = Statics.field1248.field740 / 32 + 48;
            int var5 = 464 - Statics.field1248.field730 / 32;
            Statics.field60.method1516(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field329 + 256, Statics.field837, Statics.field24);
            for (int var6 = 0; var6 < field454; var6++) {
                int var7 = field484[var6] * 4 + 2 - Statics.field1248.field740 / 32;
                int var8 = field433[var6] * 4 + 2 - Statics.field1248.field730 / 32;
                method88(arg0, arg1, var7, var8, field486[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class178 var11 = field470[Statics.field243][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1248.field740 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1248.field730 / 32;
                        method88(arg0, arg1, var12, var13, Statics.field68[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field294; var14++) {
                class30 var15 = field410[field295[var14]];
                if (var15 != null && var15.method21()) {
                    class35 var16 = var15.field701;
                    if (var16 != null && var16.field830 != null) {
                        var16 = var16.method636();
                    }
                    if (var16 != null && var16.field821 && var16.field833) {
                        int var17 = var15.field740 / 32 - Statics.field1248.field740 / 32;
                        int var18 = var15.field730 / 32 - Statics.field1248.field730 / 32;
                        method88(arg0, arg1, var17, var18, Statics.field68[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field377; var19++) {
                class3 var20 = field333[field378[var19]];
                if (var20 != null && var20.method21() && !var20.field43) {
                    int var21 = var20.field740 / 32 - Statics.field1248.field740 / 32;
                    int var22 = var20.field730 / 32 - Statics.field1248.field730 / 32;
                    boolean var23 = false;
                    if (method936(var20.field44, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field1290; var25++) {
                        if (var20.field44.equals(Statics.field1015[var25].field561)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field1248.field48 != 0 && var20.field48 != 0 && Statics.field1248.field48 == var20.field48) {
                        var26 = true;
                    }
                    if (var23) {
                        method88(arg0, arg1, var21, var22, Statics.field68[3]);
                    } else if (var26) {
                        method88(arg0, arg1, var21, var22, Statics.field68[4]);
                    } else if (var24) {
                        method88(arg0, arg1, var21, var22, Statics.field68[5]);
                    } else {
                        method88(arg0, arg1, var21, var22, Statics.field68[2]);
                    }
                }
            }
            if (field273 != 0 && field343 % 20 < 10) {
                if (field273 == 1 && field274 >= 0 && field274 < field410.length) {
                    class30 var27 = field410[field274];
                    if (var27 != null) {
                        int var28 = var27.field740 / 32 - Statics.field1248.field740 / 32;
                        int var29 = var27.field730 / 32 - Statics.field1248.field730 / 32;
                        method750(arg0, arg1, var28, var29, Statics.field26[1]);
                    }
                }
                if (field273 == 2) {
                    int var30 = field325 * 4 - Statics.field1245 * 4 + 2 - Statics.field1248.field740 / 32;
                    int var31 = field293 * 4 - Statics.field2495 * 4 + 2 - Statics.field1248.field730 / 32;
                    method750(arg0, arg1, var30, var31, Statics.field26[1]);
                }
                if (field273 == 10 && field275 >= 0 && field275 < field333.length) {
                    class3 var32 = field333[field275];
                    if (var32 != null) {
                        int var33 = var32.field740 / 32 - Statics.field1248.field740 / 32;
                        int var34 = var32.field730 / 32 - Statics.field1248.field730 / 32;
                        method750(arg0, arg1, var33, var34, Statics.field26[1]);
                    }
                }
            }
            if (field487 != 0) {
                int var35 = field487 * 4 + 2 - Statics.field1248.field740 / 32;
                int var36 = field309 * 4 + 2 - Statics.field1248.field730 / 32;
                method88(arg0, arg1, var35, var36, Statics.field26[0]);
            }
            if (!Statics.field1248.field43) {
                class73.method1605(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
            }
        }
        if (field490 < 3) {
            Statics.field1876.method1516(arg0, arg1, 33, 33, 25, 25, field396, 256, Statics.field1868, Statics.field1534);
        } else {
            class73.method1607(arg0, arg1, 0, Statics.field1868, Statics.field1534);
        }
        if (field465[arg2]) {
            Statics.field185.method1615(arg0, arg1);
        }
        field458[arg2] = true;
    }

    @ObfuscatedName("ae.dc(IIIILbs;I)V")
    public static final void method750(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method88(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field396 + field387 & 0x7FF;
        int var7 = class84.field1489[var6];
        int var8 = class84.field1470[var6];
        int var9 = var7 * 256 / (field329 + 256);
        int var10 = var8 * 256 / (field329 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1498.method1489(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("r.da(IIIILbs;I)V")
    public static final void method88(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field396 + field387 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1489[var5];
        int var8 = class84.field1470[var5];
        int var9 = var7 * 256 / (field329 + 256);
        int var10 = var8 * 256 / (field329 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1514(Statics.field185, arg0 + 94 + var11 - arg4.field1310 / 2 + 4, arg1 + 83 - var12 - arg4.field1307 / 2 - 4);
        } else {
            arg4.method1478(arg0 + 94 + var11 - arg4.field1310 / 2 + 4, arg1 + 83 - var12 - arg4.field1307 / 2 - 4);
        }
    }

    @ObfuscatedName("ag.dg(Ljava/lang/String;ZI)Z")
    public static boolean method936(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class201.method1115(arg0, Statics.field2064);
        for (int var3 = 0; var3 < field269; var3++) {
            if (var2.equalsIgnoreCase(class201.method1115(field510[var3].field232, Statics.field2064)) && (!arg1 || field510[var3].field236 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class201.method1115(Statics.field1248.field44, Statics.field2064))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("j.dx(Ljava/lang/String;B)Z")
    public static boolean method514(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class201.method1115(arg0, Statics.field2064);
        for (int var2 = 0; var2 < field512; var2++) {
            class8 var3 = field257[var2];
            if (var1.equalsIgnoreCase(class201.method1115(var3.field130, Statics.field2064))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class201.method1115(var3.field140, Statics.field2064))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("m.dw(Ljava/lang/String;ZB)V")
    public static final void method525(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field512 < 100 || field383 == 1) || field512 >= 400) {
            class10.method849(31, "", class143.field2315);
            return;
        }
        String var2 = class201.method1115(arg0, Statics.field2064);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field512; var3++) {
            class8 var4 = field257[var3];
            String var5 = class201.method1115(var4.field130, Statics.field2064);
            if (var5 != null && var5.equals(var2)) {
                class10.method849(31, "", arg0 + class143.field2316);
                return;
            }
            if (var4.field140 != null) {
                String var6 = class201.method1115(var4.field140, Statics.field2064);
                if (var6 != null && var6.equals(var2)) {
                    class10.method849(31, "", arg0 + class143.field2316);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field269; var7++) {
            class16 var8 = field510[var7];
            String var9 = class201.method1115(var8.field232, Statics.field2064);
            if (var9 != null && var9.equals(var2)) {
                class10.method849(31, "", class143.field2321 + arg0 + class143.field2322);
                return;
            }
            if (var8.field230 != null) {
                String var10 = class201.method1115(var8.field230, Statics.field2064);
                if (var10 != null && var10.equals(var2)) {
                    class10.method849(31, "", class143.field2321 + arg0 + class143.field2322);
                    return;
                }
            }
        }
        if (class201.method1115(Statics.field1248.field44, Statics.field2064).equals(var2)) {
            class10.method849(31, "", class143.field2311);
            return;
        }
        field297.method2408(30);
        class110 var11 = field297;
        int var12 = arg0.length() + 1;
        var11.method2159(var12);
        field297.method2199(arg0);
    }

    @ObfuscatedName("dv.di(Ljava/lang/String;B)V")
    public static final void method2590(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class201.method1115(arg0, Statics.field2064);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field269; var2++) {
            class16 var3 = field510[var2];
            String var4 = var3.field232;
            String var5 = class201.method1115(var4, Statics.field2064);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field269--;
                for (int var7 = var2; var7 < field269; var7++) {
                    field510[var7] = field510[var7 + 1];
                }
                field451 = field443;
                field297.method2408(183);
                class110 var8 = field297;
                int var9 = arg0.length() + 1;
                var8.method2159(var9);
                field297.method2199(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ey.dj(Ljava/lang/String;IS)V")
    public static final void method2757(String arg0, int arg1) {
        field297.method2408(204);
        class110 var2 = field297;
        int var3 = arg0.length() + 1;
        var2.method2159(var3 + 1);
        field297.method2199(arg0);
        field297.method2194(arg1);
    }

    @ObfuscatedName("m.do(Ljava/lang/String;B)V")
    public static final void method536(String arg0) {
        if (Statics.field1015 == null) {
            return;
        }
        field297.method2408(123);
        class110 var1 = field297;
        int var2 = arg0.length() + 1;
        var1.method2159(var2);
        field297.method2199(arg0);
    }

    @ObfuscatedName("v.dt(I)V")
    public static final void method147() {
        field297.method2408(10);
        field297.method2159(0);
    }

    @ObfuscatedName("aj.dk(Leq;I)I")
    public static int method708(class153 arg0) {
        class180 var1 = (class180) field460.method3263(((long) arg0.field2538 << 32) + (long) arg0.field2539);
        return var1 == null ? arg0.field2597 : var1.field2866;
    }

    @ObfuscatedName("as.ds(Leq;I)Leq;")
    public static class153 method596(class153 arg0) {
        int var1 = method708(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class153.method2577(arg0.field2549);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cy.dn(Leq;B)Z")
    public static boolean method2096(class153 arg0) {
        if (field429) {
            if (method708(arg0) != 0) {
                return false;
            }
            if (arg0.field2542 == 0) {
                return false;
            }
        }
        return arg0.field2550;
    }

    @ObfuscatedName("ee.dq(Leq;II)Ljava/lang/String;")
    public static String method2911(class153 arg0, int arg1) {
        if (!class157.method2578(method708(arg0), arg1) && arg0.field2606 == null) {
            return null;
        } else if (arg0.field2599 == null || arg0.field2599.length <= arg1 || arg0.field2599[arg1] == null || arg0.field2599[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2599[arg1];
        }
    }

    @ObfuscatedName("ca.dd(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2017(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field418 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field418 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field418 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field418 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field418 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field261 + "/";
    }
}

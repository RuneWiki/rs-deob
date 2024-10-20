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
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class131 {

    @ObfuscatedName("client.e")
    public static boolean field253 = true;

    @ObfuscatedName("client.i")
    public static int field424 = 1;

    @ObfuscatedName("client.t")
    public static int field255 = 0;

    @ObfuscatedName("client.g")
    public static int field256 = 0;

    @ObfuscatedName("client.q")
    public static boolean field259 = false;

    @ObfuscatedName("client.w")
    public static class197[] field316 = new class197[4];

    @ObfuscatedName("client.p")
    public static boolean field279 = false;

    @ObfuscatedName("client.m")
    public static int field261 = 0;

    @ObfuscatedName("client.u")
    public static int field263 = 0;

    @ObfuscatedName("client.n")
    public static boolean field264 = true;

    @ObfuscatedName("client.f")
    public static int field265 = 0;

    @ObfuscatedName("client.v")
    public static long field266 = 1L;

    @ObfuscatedName("client.r")
    public static int field267 = -1;

    @ObfuscatedName("client.j")
    public static int field268 = -1;

    @ObfuscatedName("client.h")
    public static int field269 = -1;

    @ObfuscatedName("client.d")
    public static boolean field399 = true;

    @ObfuscatedName("client.l")
    public static boolean field271 = false;

    @ObfuscatedName("client.ag")
    public static int field272 = 0;

    @ObfuscatedName("client.au")
    public static int field273 = 0;

    @ObfuscatedName("client.ak")
    public static int field274 = 0;

    @ObfuscatedName("client.aw")
    public static int field275 = 0;

    @ObfuscatedName("client.at")
    public static int field276 = 0;

    @ObfuscatedName("client.ah")
    public static int field277 = 0;

    @ObfuscatedName("client.aj")
    public static int field370 = 0;

    @ObfuscatedName("client.an")
    public static int field472 = 0;

    @ObfuscatedName("client.as")
    public static int field262 = 0;

    @ObfuscatedName("client.ap")
    public static class107 field299 = new class107(new byte[5000]);

    @ObfuscatedName("client.ae")
    public static class18 field282 = class18.field518;

    @ObfuscatedName("client.ab")
    public static int field258 = 0;

    @ObfuscatedName("client.ao")
    public static int field284 = 0;

    @ObfuscatedName("client.am")
    public static int field285 = 0;

    @ObfuscatedName("client.bg")
    public static int field455 = 0;

    @ObfuscatedName("client.bt")
    public static int field364 = 0;

    @ObfuscatedName("client.bk")
    public static int field288 = 0;

    @ObfuscatedName("client.by")
    public static int field289 = 0;

    @ObfuscatedName("client.bo")
    public static int field290 = 0;

    @ObfuscatedName("client.bj")
    public static class30[] field484 = new class30[32768];

    @ObfuscatedName("client.ba")
    public static int field293 = 0;

    @ObfuscatedName("client.bz")
    public static int[] field294 = new int[32768];

    @ObfuscatedName("client.cu")
    public static class110 field499 = new class110(5000);

    @ObfuscatedName("client.cd")
    public static class110 field456 = new class110(5000);

    @ObfuscatedName("client.cs")
    public static class110 field297 = new class110(5000);

    @ObfuscatedName("client.co")
    public static int field300 = 0;

    @ObfuscatedName("client.ch")
    public static int field374 = 0;

    @ObfuscatedName("client.cg")
    public static int field302 = 0;

    @ObfuscatedName("client.cy")
    public static int field303 = 0;

    @ObfuscatedName("client.cj")
    public static int field332 = 0;

    @ObfuscatedName("client.cx")
    public static int field305 = 0;

    @ObfuscatedName("client.cc")
    public static int field306 = 0;

    @ObfuscatedName("client.cq")
    public static int field283 = 0;

    @ObfuscatedName("client.cv")
    public static boolean field438 = false;

    @ObfuscatedName("client.cw")
    public static int field309 = 0;

    @ObfuscatedName("client.ci")
    public static int field310 = 0;

    @ObfuscatedName("client.df")
    public static int field420 = 1;

    @ObfuscatedName("client.dc")
    public static int field312 = 0;

    @ObfuscatedName("client.di")
    public static int field313 = 1;

    @ObfuscatedName("client.dn")
    public static int field442 = 0;

    @ObfuscatedName("client.do")
    public static boolean field317 = false;

    @ObfuscatedName("client.de")
    public static int[][][] field318 = new int[4][13][13];

    @ObfuscatedName("client.dm")
    public static final int[] field319 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dr")
    public static int field280 = 0;

    @ObfuscatedName("client.dt")
    public static int field322 = 2;

    @ObfuscatedName("client.da")
    public static int field401 = 0;

    @ObfuscatedName("client.dw")
    public static int field324 = 2;

    @ObfuscatedName("client.dy")
    public static int field407 = 0;

    @ObfuscatedName("client.ds")
    public static int field304 = 1;

    @ObfuscatedName("client.dx")
    public static int field419 = 0;

    @ObfuscatedName("client.du")
    public static int field251 = 0;

    @ObfuscatedName("client.dg")
    public static int field325 = 2;

    @ObfuscatedName("client.dj")
    public static int field330 = 0;

    @ObfuscatedName("client.em")
    public static int field331 = 1;

    @ObfuscatedName("client.ei")
    public static int field292 = 0;

    @ObfuscatedName("client.eg")
    public static int field335 = 0;

    @ObfuscatedName("client.ea")
    public static int field334 = 2301979;

    @ObfuscatedName("client.eo")
    public static int field507 = 5063219;

    @ObfuscatedName("client.ek")
    public static int field394 = 3353893;

    @ObfuscatedName("client.ew")
    public static int field337 = 7759444;

    @ObfuscatedName("client.er")
    public static boolean field338 = false;

    @ObfuscatedName("client.fx")
    public static int field409 = 0;

    @ObfuscatedName("client.fb")
    public static int field340 = 128;

    @ObfuscatedName("client.fq")
    public static int field341 = 0;

    @ObfuscatedName("client.fd")
    public static int field342 = 0;

    @ObfuscatedName("client.fs")
    public static int field343 = 0;

    @ObfuscatedName("client.fp")
    public static int field501 = 0;

    @ObfuscatedName("client.fn")
    public static int field307 = 0;

    @ObfuscatedName("client.fw")
    public static int field254 = 0;

    @ObfuscatedName("client.ff")
    public static boolean field347 = false;

    @ObfuscatedName("client.fj")
    public static int field348 = 0;

    @ObfuscatedName("client.fy")
    public static int field349 = 0;

    @ObfuscatedName("client.fg")
    public static int field350 = 50;

    @ObfuscatedName("client.fh")
    public static int[] field351 = new int[field350];

    @ObfuscatedName("client.fc")
    public static int[] field352 = new int[field350];

    @ObfuscatedName("client.fe")
    public static int[] field353 = new int[field350];

    @ObfuscatedName("client.fz")
    public static int[] field354 = new int[field350];

    @ObfuscatedName("client.fm")
    public static int[] field355 = new int[field350];

    @ObfuscatedName("client.fr")
    public static int[] field356 = new int[field350];

    @ObfuscatedName("client.fl")
    public static int[] field357 = new int[field350];

    @ObfuscatedName("client.gi")
    public static String[] field502 = new String[field350];

    @ObfuscatedName("client.gt")
    public static int[][] field359 = new int[104][104];

    @ObfuscatedName("client.go")
    public static int field360 = 0;

    @ObfuscatedName("client.gy")
    public static int field361 = -1;

    @ObfuscatedName("client.gh")
    public static int field362 = -1;

    @ObfuscatedName("client.gg")
    public static int field363 = 0;

    @ObfuscatedName("client.gm")
    public static int field286 = 0;

    @ObfuscatedName("client.gf")
    public static int field365 = 0;

    @ObfuscatedName("client.gc")
    public static int field366 = 0;

    @ObfuscatedName("client.gj")
    public static int field425 = 0;

    @ObfuscatedName("client.gl")
    public static int field368 = 0;

    @ObfuscatedName("client.gx")
    public static int field369 = 0;

    @ObfuscatedName("client.ge")
    public static int field260 = 0;

    @ObfuscatedName("client.gk")
    public static int field480 = 0;

    @ObfuscatedName("client.gv")
    public static int field372 = 0;

    @ObfuscatedName("client.gz")
    public static boolean field373 = false;

    @ObfuscatedName("client.gq")
    public static int field336 = 0;

    @ObfuscatedName("client.gp")
    public static int field375 = 0;

    @ObfuscatedName("client.gd")
    public static class3[] field376 = new class3[2048];

    @ObfuscatedName("client.gs")
    public static int field377 = 0;

    @ObfuscatedName("client.gr")
    public static int[] field378 = new int[2048];

    @ObfuscatedName("client.hw")
    public static int field323 = 0;

    @ObfuscatedName("client.hb")
    public static int[] field380 = new int[2048];

    @ObfuscatedName("client.hx")
    public static class107[] field371 = new class107[2048];

    @ObfuscatedName("client.hk")
    public static int field479 = -1;

    @ObfuscatedName("client.hp")
    public static int field383 = 0;

    @ObfuscatedName("client.hi")
    public static int field384 = 0;

    @ObfuscatedName("client.hz")
    public static int[] field385 = new int[1000];

    @ObfuscatedName("client.hf")
    public static final int[] field386 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hc")
    public static String[] field387 = new String[8];

    @ObfuscatedName("client.ht")
    public static boolean[] field429 = new boolean[8];

    @ObfuscatedName("client.ho")
    public static int[] field389 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hh")
    public static int field328 = -1;

    @ObfuscatedName("client.hv")
    public static class177[][][] field391 = new class177[4][104][104];

    @ObfuscatedName("client.hq")
    public static class177 field392 = new class177();

    @ObfuscatedName("client.hm")
    public static class177 field333 = new class177();

    @ObfuscatedName("client.ha")
    public static class177 field444 = new class177();

    @ObfuscatedName("client.hn")
    public static int[] field395 = new int[25];

    @ObfuscatedName("client.hj")
    public static int[] field396 = new int[25];

    @ObfuscatedName("client.hs")
    public static int[] field476 = new int[25];

    @ObfuscatedName("client.hd")
    public static int field398 = 0;

    @ObfuscatedName("client.hy")
    public static boolean field278 = false;

    @ObfuscatedName("client.if")
    public static int field321 = 0;

    @ObfuscatedName("client.ib")
    public static int[] field402 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field471 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field404 = new int[500];

    @ObfuscatedName("client.ia")
    public static int[] field405 = new int[500];

    @ObfuscatedName("client.ip")
    public static String[] field475 = new String[500];

    @ObfuscatedName("client.ik")
    public static String[] field397 = new String[500];

    @ObfuscatedName("client.ii")
    public static int field308 = -1;

    @ObfuscatedName("client.il")
    public static int field453 = -1;

    @ObfuscatedName("client.im")
    public static int field410 = 0;

    @ObfuscatedName("client.iu")
    public static int field411 = 50;

    @ObfuscatedName("client.ih")
    public static int field412 = 0;

    @ObfuscatedName("client.it")
    public static String field413 = null;

    @ObfuscatedName("client.ig")
    public static boolean field314 = false;

    @ObfuscatedName("client.iz")
    public static int field415 = -1;

    @ObfuscatedName("client.iq")
    public static int field416 = -1;

    @ObfuscatedName("client.jh")
    public static String field417 = null;

    @ObfuscatedName("client.jq")
    public static String field287 = null;

    @ObfuscatedName("client.jy")
    public static int field477 = -1;

    @ObfuscatedName("client.ji")
    public static class174 field379 = new class174(8);

    @ObfuscatedName("client.js")
    public static int field421 = 0;

    @ObfuscatedName("client.jw")
    public static int field422 = 0;

    @ObfuscatedName("client.jk")
    public static class152 field423 = null;

    @ObfuscatedName("client.jp")
    public static int field270 = 0;

    @ObfuscatedName("client.jv")
    public static int field426 = 0;

    @ObfuscatedName("client.ja")
    public static int field326 = 0;

    @ObfuscatedName("client.jg")
    public static int field427 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field367 = false;

    @ObfuscatedName("client.jc")
    public static boolean field474 = false;

    @ObfuscatedName("client.jm")
    public static boolean field432 = false;

    @ObfuscatedName("client.jf")
    public static class152 field431 = null;

    @ObfuscatedName("client.jo")
    public static class152 field339 = null;

    @ObfuscatedName("client.jx")
    public static int field433 = 0;

    @ObfuscatedName("client.jb")
    public static int field434 = 0;

    @ObfuscatedName("client.jt")
    public static class152 field435 = null;

    @ObfuscatedName("client.jn")
    public static boolean field436 = false;

    @ObfuscatedName("client.ju")
    public static int field437 = -1;

    @ObfuscatedName("client.jz")
    public static int field492 = -1;

    @ObfuscatedName("client.jl")
    public static boolean field439 = false;

    @ObfuscatedName("client.jr")
    public static int field440 = -1;

    @ObfuscatedName("client.jj")
    public static int field441 = -1;

    @ObfuscatedName("client.kc")
    public static boolean field346 = false;

    @ObfuscatedName("client.ko")
    public static int field443 = 1;

    @ObfuscatedName("client.ku")
    public static int[] field345 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field445 = 0;

    @ObfuscatedName("client.kg")
    public static int[] field406 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field447 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field448 = new int[32];

    @ObfuscatedName("client.ka")
    public static int field449 = 0;

    @ObfuscatedName("client.kv")
    public static int field450 = 0;

    @ObfuscatedName("client.kx")
    public static int field451 = 0;

    @ObfuscatedName("client.kb")
    public static int field452 = 0;

    @ObfuscatedName("client.kp")
    public static int field388 = 0;

    @ObfuscatedName("client.kh")
    public static int[] field454 = new int[2000];

    @ObfuscatedName("client.kf")
    public static String[] field446 = new String[1000];

    @ObfuscatedName("client.kt")
    public static int field381 = 0;

    @ObfuscatedName("client.ky")
    public static class177 field457 = new class177();

    @ObfuscatedName("client.kz")
    public static class177 field458 = new class177();

    @ObfuscatedName("client.km")
    public static class177 field459 = new class177();

    @ObfuscatedName("client.ke")
    public static class174 field460 = new class174(512);

    @ObfuscatedName("client.lj")
    public static int field461 = 0;

    @ObfuscatedName("client.lr")
    public static int field462 = -2;

    @ObfuscatedName("client.lg")
    public static boolean[] field344 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field464 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static boolean[] field465 = new boolean[100];

    @ObfuscatedName("client.lb")
    public static int[] field466 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field467 = new int[100];

    @ObfuscatedName("client.lh")
    public static int[] field468 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field469 = new int[100];

    @ObfuscatedName("client.lx")
    public static int field470 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field311 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.la")
    public static int field393 = 0;

    @ObfuscatedName("client.lz")
    public static int field473 = 0;

    @ObfuscatedName("client.lo")
    public static long[] field508 = new long[100];

    @ObfuscatedName("client.lw")
    public static int field327 = 0;

    @ObfuscatedName("client.lm")
    public static int field390 = 0;

    @ObfuscatedName("client.le")
    public static int[] field408 = new int[128];

    @ObfuscatedName("client.lp")
    public static int[] field418 = new int[128];

    @ObfuscatedName("client.lu")
    public static long field382 = -1L;

    @ObfuscatedName("client.li")
    public static String field301 = null;

    @ObfuscatedName("client.ly")
    public static String field481 = null;

    @ObfuscatedName("client.mf")
    public static int field482 = -1;

    @ObfuscatedName("client.mb")
    public static int field483 = 0;

    @ObfuscatedName("client.ml")
    public static int[] field281 = new int[1000];

    @ObfuscatedName("client.mj")
    public static int[] field485 = new int[1000];

    @ObfuscatedName("client.mh")
    public static class72[] field486 = new class72[1000];

    @ObfuscatedName("client.mr")
    public static int field487 = 0;

    @ObfuscatedName("client.mo")
    public static int field488 = 0;

    @ObfuscatedName("client.md")
    public static int field489 = 0;

    @ObfuscatedName("client.mg")
    public static int field490 = 255;

    @ObfuscatedName("client.mi")
    public static int field491 = -1;

    @ObfuscatedName("client.ma")
    public static boolean field296 = false;

    @ObfuscatedName("client.mk")
    public static int field493 = 127;

    @ObfuscatedName("client.mw")
    public static int field494 = 127;

    @ObfuscatedName("client.nj")
    public static int field495 = 0;

    @ObfuscatedName("client.no")
    public static int[] field430 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field497 = new int[50];

    @ObfuscatedName("client.nk")
    public static int[] field498 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field506 = new int[50];

    @ObfuscatedName("client.nh")
    public static class52[] field500 = new class52[50];

    @ObfuscatedName("client.nl")
    public static boolean field428 = false;

    @ObfuscatedName("client.np")
    public static boolean[] field503 = new boolean[5];

    @ObfuscatedName("client.nw")
    public static int[] field504 = new int[5];

    @ObfuscatedName("client.nf")
    public static int[] field505 = new int[5];

    @ObfuscatedName("client.ns")
    public static int[] field358 = new int[5];

    @ObfuscatedName("client.nq")
    public static int[] field414 = new int[5];

    @ObfuscatedName("client.nd")
    public static int field329 = 0;

    @ObfuscatedName("client.ow")
    public static int field509 = 0;

    @ObfuscatedName("client.oy")
    public static class16[] field510 = new class16[400];

    @ObfuscatedName("client.om")
    public static class173 field511 = new class173();

    @ObfuscatedName("client.ot")
    public static int field512 = 0;

    @ObfuscatedName("client.og")
    public static class8[] field513 = new class8[400];

    @ObfuscatedName("client.of")
    public static class157 field514 = new class157();

    @ObfuscatedName("client.od")
    public static int field515 = -1;

    @ObfuscatedName("client.oq")
    public static int field516 = -1;

    @ObfuscatedName("client.i(I)V")
    public final void method283() {
    }

    public final void init() {
        if (!this.method2585()) {
            return;
        }
        class168[] var1 = class168.method2130();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class168 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2817);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2817)) {
                    case 1:
                        Statics.field496 = var4;
                        break;
                    case 2:
                        if (var4.equalsIgnoreCase(class2.field23)) {
                        }
                        break;
                    case 3:
                        field261 = Integer.parseInt(var4);
                        break;
                    case 4:
                        field256 = Integer.parseInt(var4);
                        break;
                    case 5:
                        field255 = Integer.parseInt(var4);
                        break;
                    case 6:
                        field424 = Integer.parseInt(var4);
                        break;
                    case 7:
                        class139[] var10 = new class139[] { class139.field2125, class139.field2124, class139.field2128, class139.field2126, class139.field2130, class139.field2123 };
                        int var11 = Integer.parseInt(var4);
                        class139[] var12 = var10;
                        int var13 = 0;
                        class139 var15;
                        while (true) {
                            if (var13 >= var12.length) {
                                var15 = null;
                                break;
                            }
                            class139 var14 = var12[var13];
                            if (var11 == var14.method464()) {
                                var15 = var14;
                                break;
                            }
                            var13++;
                        }
                        Statics.field257 = (class139) var15;
                        if (Statics.field257 == class139.field2128) {
                            Statics.field298 = class190.field2892;
                        } else {
                            Statics.field298 = class190.field2882;
                        }
                        break;
                    case 8:
                        int var5 = Integer.parseInt(var4);
                        class138[] var6 = class138.method467();
                        int var7 = 0;
                        class138 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class138 var8 = var6[var7];
                            if (var8.field2119 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field148 = var9;
                    case 9:
                    default:
                        break;
                    case 10:
                        if (var4.equalsIgnoreCase(class2.field23)) {
                            field259 = true;
                        } else {
                            field259 = false;
                        }
                }
            }
        }
        method733();
        Statics.field291 = this.getCodeBase().getHost();
        String var16 = Statics.field148.field2116;
        byte var17 = 0;
        try {
            Statics.field1686 = 16;
            Statics.field1879 = var17;
            try {
                Statics.field2957 = System.getProperty("os.name");
            } catch (Exception var36) {
                Statics.field2957 = "Unknown";
            }
            Statics.field2095 = Statics.field2957.toLowerCase();
            try {
                Statics.field975 = System.getProperty("user.home");
                if (Statics.field975 != null) {
                    Statics.field975 = Statics.field975 + "/";
                }
            } catch (Exception var35) {
            }
            try {
                if (Statics.field2095.startsWith("win")) {
                    if (Statics.field975 == null) {
                        Statics.field975 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field975 == null) {
                    Statics.field975 = System.getenv("HOME");
                }
                if (Statics.field975 != null) {
                    Statics.field975 = Statics.field975 + "/";
                }
            } catch (Exception var34) {
            }
            if (Statics.field975 == null) {
                Statics.field975 = "~/";
            }
            Statics.field1301 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field975, "/tmp/", "" };
            Statics.field2887 = new String[] { ".jagex_cache_" + Statics.field1879, ".file_store_" + Statics.field1879 };
            label134: for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2094 = class136.method90("oldschool", var16, var21);
                if (!Statics.field2094.exists()) {
                    Statics.field2094.mkdirs();
                }
                File[] var22 = Statics.field2094.listFiles();
                if (var22 == null) {
                    break;
                }
                File[] var23 = var22;
                int var24 = 0;
                while (true) {
                    if (var24 >= var23.length) {
                        break label134;
                    }
                    File var25 = var23[var24];
                    boolean var28;
                    try {
                        RandomAccessFile var26 = new RandomAccessFile(var25, "rw");
                        int var27 = var26.read();
                        var26.seek(0L);
                        var26.write(var27);
                        var26.seek(0L);
                        var26.close();
                        var28 = true;
                    } catch (Exception var33) {
                        var28 = false;
                    }
                    if (!var28) {
                        break;
                    }
                    var24++;
                }
            }
            File var30 = Statics.field2094;
            Statics.field1941 = var30;
            if (!Statics.field1941.exists()) {
                throw new RuntimeException("");
            }
            class122.field1944 = true;
            class136.method8();
            class136.field2101 = new class196(new class195(class122.method1765("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class136.field2100 = new class196(new class195(class122.method1765("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1945 = new class196[Statics.field1686];
            for (int var31 = 0; var31 < Statics.field1686; var31++) {
                Statics.field1945[var31] = new class196(new class195(class122.method1765("main_file_cache.idx" + var31), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var37) {
            class135.method2560((String) null, var37);
        }
        Statics.field252 = this;
        this.method2597(765, 503, 54);
    }

    @ObfuscatedName("av.z(I)V")
    public static final void method733() {
        class79.field1403 = false;
        field279 = false;
    }

    @ObfuscatedName("client.g(I)V")
    public final void method185() {
        Statics.field236 = field256 == 0 ? 43594 : field424 + 40000;
        Statics.field678 = field256 == 0 ? 443 : field424 + 50000;
        Statics.field1889 = Statics.field236;
        Statics.field2673 = class153.field2656;
        Statics.field2678 = class153.field2657;
        Statics.field2679 = class153.field2658;
        Statics.field1499 = class153.field2655;
        if (Statics.field1956.toLowerCase().indexOf("microsoft") == -1) {
            class124.field1982[44] = 71;
            class124.field1982[45] = 26;
            class124.field1982[46] = 72;
            class124.field1982[47] = 73;
            class124.field1982[59] = 57;
            class124.field1982[61] = 27;
            class124.field1982[91] = 42;
            class124.field1982[92] = 74;
            class124.field1982[93] = 43;
            class124.field1982[192] = 28;
            class124.field1982[222] = 58;
            class124.field1982[520] = 59;
        } else {
            class124.field1982[186] = 57;
            class124.field1982[187] = 27;
            class124.field1982[188] = 71;
            class124.field1982[189] = 26;
            class124.field1982[190] = 72;
            class124.field1982[191] = 73;
            class124.field1982[192] = 58;
            class124.field1982[219] = 42;
            class124.field1982[220] = 74;
            class124.field1982[221] = 43;
            class124.field1982[222] = 59;
            class124.field1982[223] = 28;
        }
        Canvas var1 = Statics.field1657;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class124.field1961);
        var1.addFocusListener(class124.field1961);
        class127.method2418(Statics.field1657);
        class132 var2;
        try {
            var2 = new class132();
        } catch (Throwable var13) {
            var2 = null;
        }
        Statics.field1991 = var2;
        if (Statics.field1991 != null) {
            Statics.field1991.method2426(Statics.field1657);
        }
        Statics.field2545 = new class121(255, class136.field2101, class136.field2100, 500000);
        class195 var4 = null;
        class9 var5 = new class9();
        try {
            var4 = class136.method32("", Statics.field257.field2129, false);
            byte[] var6 = new byte[(int) var4.method3452()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method3448(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class9(new class107(var6));
        } catch (Exception var14) {
        }
        try {
            if (var4 != null) {
                var4.method3451();
            }
        } catch (Exception var12) {
        }
        Statics.field30 = var5;
        Statics.field697 = this.getToolkit().getSystemClipboard();
        class125.method3153(this, Statics.field1590);
        if (field256 != 0) {
            field271 = true;
        }
    }

    @ObfuscatedName("client.c(I)V")
    public final void method186() {
        field265++;
        this.method295();
        while (true) {
            class177 var1 = class149.field2498;
            class148 var2;
            synchronized (class149.field2498) {
                var2 = (class148) class149.field2495.method3226();
            }
            if (var2 == null) {
                try {
                    if (class161.field2714 == 1) {
                        int var4 = Statics.field1930.method3031();
                        if (var4 > 0 && Statics.field1930.method3036()) {
                            int var5 = var4 - Statics.field2713;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field1930.method3030(var5);
                        } else {
                            Statics.field1930.method3103();
                            Statics.field1930.method3121();
                            if (Statics.field2715 == null) {
                                class161.field2714 = 0;
                            } else {
                                class161.field2714 = 2;
                            }
                            Statics.field2938 = null;
                            Statics.field2718 = null;
                        }
                    }
                } catch (Exception var12) {
                    var12.printStackTrace();
                    Statics.field1930.method3103();
                    class161.field2714 = 0;
                    Statics.field2938 = null;
                    Statics.field2718 = null;
                    Statics.field2715 = null;
                }
                method2676();
                class124.method31();
                class127 var7 = class127.field2019;
                synchronized (class127.field2019) {
                    class127.field2011 = class127.field2012;
                    class127.field2010 = class127.field2013;
                    class127.field2017 = class127.field2014 * -999419279;
                    class127.field2022 = class127.field2018;
                    class127.field2023 = class127.field2016;
                    class127.field2015 = class127.field2020;
                    class127.field2025 = class127.field2021;
                    class127.field2018 = 0;
                }
                if (Statics.field1991 != null) {
                    int var9 = Statics.field1991.method2429();
                    field381 = var9;
                }
                if (field263 == 0) {
                    method1420();
                    class131.method94();
                } else if (field263 == 5) {
                    class28.method574(this);
                    method1420();
                    class131.method94();
                } else if (field263 == 10 || field263 == 11) {
                    class28.method574(this);
                } else if (field263 == 20) {
                    class28.method574(this);
                    method2680();
                } else if (field263 == 25) {
                    method506();
                }
                if (field263 == 30) {
                    method756();
                } else if (field263 == 40 || field263 == 45) {
                    method2680();
                }
                return;
            }
            var2.field2488.method2768(var2.field2487, (int) var2.field2867, var2.field2490, false);
        }
    }

    @ObfuscatedName("client.o(I)V")
    public final void method187() {
        boolean var1;
        label261: {
            try {
                if (class161.field2714 == 2) {
                    if (Statics.field2938 == null) {
                        Statics.field2938 = class158.method2945(Statics.field2715, Statics.field1093, Statics.field894);
                        if (Statics.field2938 == null) {
                            var1 = false;
                            break label261;
                        }
                    }
                    if (Statics.field2718 == null) {
                        Statics.field2718 = new class53(Statics.field2716, Statics.field2712);
                    }
                    if (Statics.field1930.method3029(Statics.field2938, Statics.field2720, Statics.field2718, 22050)) {
                        Statics.field1930.method3032();
                        Statics.field1930.method3030(Statics.field2717);
                        Statics.field1930.method3099(Statics.field2938, Statics.field2873);
                        class161.field2714 = 0;
                        Statics.field2938 = null;
                        Statics.field2718 = null;
                        Statics.field2715 = null;
                        var1 = true;
                        break label261;
                    }
                }
            } catch (Exception var48) {
                var48.printStackTrace();
                Statics.field1930.method3103();
                class161.field2714 = 0;
                Statics.field2938 = null;
                Statics.field2718 = null;
                Statics.field2715 = null;
            }
            var1 = false;
        }
        if (var1 && field296 && Statics.field1913 != null) {
            Statics.field1913.method984();
        }
        if (field2063) {
            Canvas var4 = Statics.field1657;
            var4.removeKeyListener(class124.field1961);
            var4.removeFocusListener(class124.field1961);
            class124.field1979 = -1;
            class127.method150(Statics.field1657);
            if (Statics.field1991 != null) {
                Statics.field1991.method2425(Statics.field1657);
            }
            this.method2590();
            Canvas var5 = Statics.field1657;
            var5.setFocusTraversalKeysEnabled(false);
            var5.addKeyListener(class124.field1961);
            var5.addFocusListener(class124.field1961);
            class127.method2418(Statics.field1657);
            if (Statics.field1991 != null) {
                Statics.field1991.method2426(Statics.field1657);
            }
        }
        if (field263 == 0) {
            int var6 = class28.field665;
            String var7 = class28.field663;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field1657.getGraphics();
                if (Statics.field1897 == null) {
                    Statics.field1897 = new Font("Helvetica", 1, 13);
                    Statics.field221 = Statics.field1657.getFontMetrics(Statics.field1897);
                }
                if (field2055) {
                    field2055 = false;
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field982, Statics.field1902);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field918 == null) {
                        Statics.field918 = Statics.field1657.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field918.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field1897);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field221.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field918, Statics.field982 / 2 - 152, Statics.field1902 / 2 - 18, (ImageObserver) null);
                } catch (Exception var44) {
                    int var12 = Statics.field982 / 2 - 152;
                    int var13 = Statics.field1902 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field1897);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field221.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var45) {
                Statics.field1657.repaint();
            }
        } else if (field263 == 5) {
            class28.method2671(Statics.field1690, Statics.field533);
        } else if (field263 == 10 || field263 == 11) {
            class28.method2671(Statics.field1690, Statics.field533);
        } else if (field263 == 20) {
            class28.method2671(Statics.field1690, Statics.field533);
        } else if (field263 == 25) {
            if (field442 == 1) {
                if (field310 > field420) {
                    field420 = field310;
                }
                int var15 = (field420 * 50 - field310 * 50) / field420;
                method127(class142.field2164 + class2.field26 + class2.field33 + var15 + "%" + class2.field24, false);
            } else if (field442 == 2) {
                if (field312 > field313) {
                    field313 = field312;
                }
                int var16 = (field313 * 50 - field312 * 50) / field313 + 50;
                method127(class142.field2164 + class2.field26 + class2.field33 + var16 + "%" + class2.field24, false);
            } else {
                method127(class142.field2164, false);
            }
        } else if (field263 == 30) {
            if (field477 != -1) {
                method169(field477);
            }
            for (int var17 = 0; var17 < field461; var17++) {
                if (field344[var17]) {
                    field464[var17] = true;
                }
                field465[var17] = field344[var17];
                field344[var17] = false;
            }
            field462 = field265;
            field308 = -1;
            field453 = -1;
            Statics.field1298 = null;
            if (field477 != -1) {
                field461 = 0;
                int var18 = field477;
                if (class152.method561(var18)) {
                    Statics.field181 = null;
                    method1956(Statics.field2579[var18], -1, 0, 0, 765, 503, 0, 0, -1);
                    if (Statics.field181 != null) {
                        method1956(Statics.field181, -1412584499, 0, 0, 765, 503, Statics.field146, Statics.field1666, -1);
                        Statics.field181 = null;
                    }
                } else {
                    for (int var19 = 0; var19 < 100; var19++) {
                        field344[var19] = true;
                    }
                }
            }
            class73.method1510();
            if (field278) {
                int var20 = Statics.field32;
                int var21 = Statics.field64;
                int var22 = Statics.field1513;
                int var23 = Statics.field1429;
                int var24 = 6116423;
                class73.method1517(var20, var21, var22, var23, var24);
                class73.method1517(var20 + 1, var21 + 1, var22 - 2, 16, 0);
                class73.method1520(var20 + 1, var21 + 18, var22 - 2, var23 - 19, 0);
                Statics.field1690.method3380(class142.field2308, var20 + 3, var21 + 14, var24, -1);
                int var25 = class127.field2010;
                int var26 = class127.field2017 * -991203695;
                for (int var27 = 0; var27 < field321; var27++) {
                    int var28 = (field321 - 1 - var27) * 15 + var21 + 31;
                    int var29 = 16777215;
                    if (var25 > var20 && var25 < var20 + var22 && var26 > var28 - 13 && var26 < var28 + 3) {
                        var29 = 16776960;
                    }
                    class193 var30 = Statics.field1690;
                    String var31;
                    if (field397[var27].length() > 0) {
                        var31 = field475[var27] + class142.field2315 + field397[var27];
                    } else {
                        var31 = field475[var27];
                    }
                    var30.method3380(var31, var20 + 3, var28, var29, 0);
                }
                int var32 = Statics.field32;
                int var33 = Statics.field64;
                int var34 = Statics.field1513;
                int var35 = Statics.field1429;
                for (int var36 = 0; var36 < field461; var36++) {
                    if (field468[var36] + field466[var36] > var32 && field466[var36] < var32 + var34 && field469[var36] + field467[var36] > var33 && field467[var36] < var33 + var35) {
                        field464[var36] = true;
                    }
                }
            } else if (field308 != -1) {
                method179(field308, field453);
            }
            if (field470 == 3) {
                for (int var37 = 0; var37 < field461; var37++) {
                    if (field465[var37]) {
                        class73.method1516(field466[var37], field467[var37], field468[var37], field469[var37], 16711935, 128);
                    } else if (field464[var37]) {
                        class73.method1516(field466[var37], field467[var37], field468[var37], field469[var37], 16711680, 128);
                    }
                }
            }
            class20.method2066(Statics.field56, Statics.field892.field770, Statics.field892.field728, field335);
            field335 = 0;
        } else if (field263 == 40) {
            method127(class142.field2165 + class2.field26 + class142.field2166, false);
        } else if (field263 == 45) {
            method127(class142.field2295, false);
        }
        if (field263 == 30 && field470 == 0 && !field2055) {
            try {
                Graphics var38 = Statics.field1657.getGraphics();
                for (int var39 = 0; var39 < field461; var39++) {
                    if (field464[var39]) {
                        Statics.field1684.method1343(var38, field466[var39], field467[var39], field468[var39], field469[var39]);
                        field464[var39] = false;
                    }
                }
            } catch (Exception var47) {
                Statics.field1657.repaint();
            }
        } else if (field263 > 0) {
            try {
                Graphics var41 = Statics.field1657.getGraphics();
                Statics.field1684.method1338(var41, 0, 0);
                field2055 = false;
                for (int var42 = 0; var42 < field461; var42++) {
                    field464[var42] = false;
                }
            } catch (Exception var46) {
                Statics.field1657.repaint();
            }
        }
    }

    @ObfuscatedName("client.q(I)V")
    public final void method188() {
        if (Statics.field229 != null) {
            Statics.field229.field185 = false;
        }
        Statics.field229 = null;
        if (Statics.field295 != null) {
            Statics.field295.method2567();
            Statics.field295 = null;
        }
        class124.method2562();
        class127.method2433();
        Statics.field1991 = null;
        if (Statics.field1913 != null) {
            Statics.field1913.method1002();
        }
        if (Statics.field220 != null) {
            Statics.field220.method1002();
        }
        class150.method2049();
        class149.method144();
        class136.method2497();
    }

    @ObfuscatedName("cc.w(IB)V")
    public static void method1870(int arg0) {
        if (field263 == arg0) {
            return;
        }
        if (field263 == 0) {
            Statics.field918 = null;
            Statics.field1897 = null;
            Statics.field221 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field364 = 0;
            field288 = 0;
            field289 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field478 != null) {
            Statics.field478.method2567();
            Statics.field478 = null;
        }
        if (field263 == 25) {
            field442 = 0;
            field310 = 0;
            field420 = 1;
            field312 = 0;
            field313 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method1768(Statics.field1657, Statics.field916, Statics.field199, true, 0);
        } else if (arg0 == 20) {
            class28.method1768(Statics.field1657, Statics.field916, Statics.field199, true, field263 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method1768(Statics.field1657, Statics.field916, Statics.field199, false, 4);
        } else {
            class28.method2685();
        }
        field263 = arg0;
    }

    @ObfuscatedName("client.y(I)V")
    public void method295() {
        if (field263 != 1000) {
            boolean var1 = class150.method572();
            if (!var1) {
                this.method190();
            }
        }
    }

    @ObfuscatedName("client.p(B)V")
    public void method190() {
        if (class150.field2519 >= 4) {
            this.method2595("js5crc");
            field263 = 1000;
            return;
        }
        if (class150.field2520 >= 4) {
            if (field263 <= 5) {
                this.method2595("js5io");
                field263 = 1000;
                return;
            }
            field285 = 3000;
            class150.field2520 = 3;
        }
        if (--field285 + 1 > 0) {
            return;
        }
        try {
            if (field284 == 0) {
                Statics.field704 = Statics.field1005.method2477(Statics.field291, Statics.field1889);
                field284++;
            }
            if (field284 == 1) {
                if (Statics.field704.field2069 == 2) {
                    this.method191(-1);
                    return;
                }
                if (Statics.field704.field2069 == 1) {
                    field284++;
                }
            }
            if (field284 == 2) {
                Statics.field1254 = new class130((Socket) Statics.field704.field2070, Statics.field1005);
                class107 var1 = new class107(5);
                var1.method2102(15);
                var1.method2303(54);
                Statics.field1254.method2563(var1.field1857, 0, 5);
                field284++;
                Statics.field1891 = class103.method2455();
            }
            if (field284 == 3) {
                if (field263 <= 5 || Statics.field1254.method2565() > 0) {
                    int var2 = Statics.field1254.method2564();
                    if (var2 != 0) {
                        this.method191(var2);
                        return;
                    }
                    field284++;
                } else if (class103.method2455() - Statics.field1891 > 30000L) {
                    this.method191(-2);
                    return;
                }
            }
            if (field284 == 4) {
                class130 var3 = Statics.field1254;
                boolean var4 = field263 > 20;
                if (Statics.field2508 != null) {
                    try {
                        Statics.field2508.method2567();
                    } catch (Exception var14) {
                    }
                    Statics.field2508 = null;
                }
                Statics.field2508 = var3;
                class150.method886(var4);
                class150.field2514.field1862 = 0;
                Statics.field2513 = null;
                Statics.field1110 = null;
                class150.field2515 = 0;
                while (true) {
                    class151 var6 = (class151) class150.field2506.method3199();
                    if (var6 == null) {
                        while (true) {
                            class151 var7 = (class151) class150.field2511.method3199();
                            if (var7 == null) {
                                if (class150.field2518 != 0) {
                                    try {
                                        class107 var8 = new class107(4);
                                        var8.method2102(4);
                                        var8.method2102(class150.field2518);
                                        var8.method2275(0);
                                        Statics.field2508.method2563(var8.field1857, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2508.method2567();
                                        } catch (Exception var12) {
                                        }
                                        class150.field2520++;
                                        Statics.field2508 = null;
                                    }
                                }
                                class150.field2509 = 0;
                                Statics.field131 = class103.method2455();
                                Statics.field704 = null;
                                Statics.field1254 = null;
                                field284 = 0;
                                field455 = 0;
                                return;
                            }
                            class150.field2510.method3297(var7);
                            class150.field2517.method3191(var7, var7.field2867);
                            class150.field2512++;
                            class150.field2521--;
                        }
                    }
                    class150.field2504.method3191(var6, var6.field2867);
                    class150.field2505++;
                    class150.field2507--;
                }
            }
        } catch (IOException var15) {
            this.method191(-3);
        }
    }

    @ObfuscatedName("client.m(II)V")
    public void method191(int arg0) {
        Statics.field704 = null;
        Statics.field1254 = null;
        field284 = 0;
        if (Statics.field236 == Statics.field1889) {
            Statics.field1889 = Statics.field678;
        } else {
            Statics.field1889 = Statics.field236;
        }
        field455++;
        if (field455 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field263 <= 5) {
                this.method2595("js5connect_full");
                field263 = 1000;
            } else {
                field285 = 3000;
            }
        } else if (field455 >= 2 && arg0 == 6) {
            this.method2595("js5connect_outofdate");
            field263 = 1000;
        } else if (field455 >= 4) {
            if (field263 <= 5) {
                this.method2595("js5connect");
                field263 = 1000;
            } else {
                field285 = 3000;
            }
        }
    }

    @ObfuscatedName("be.a(I)V")
    public static void method1420() {
        if (field258 == 0) {
            Statics.field2481 = new class79(4, 104, 104, class6.field81);
            for (int var0 = 0; var0 < 4; var0++) {
                field316[var0] = new class197(104, 104);
            }
            Statics.field2695 = new class72(512, 512);
            class28.field663 = class142.field2377;
            class28.field665 = 5;
            field258 = 20;
        } else if (field258 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1478[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1630(var1, 500, 800, 512, 334);
            class28.field663 = class142.field2374;
            class28.field665 = 10;
            field258 = 30;
        } else if (field258 == 30) {
            Statics.field1277 = method104(0, false, true, true);
            Statics.field2089 = method104(1, false, true, true);
            Statics.field1872 = method104(2, true, false, true);
            Statics.field1255 = method104(3, false, true, true);
            Statics.field2766 = method104(4, false, true, true);
            Statics.field2926 = method104(5, true, true, true);
            Statics.field1251 = method104(6, true, true, false);
            Statics.field11 = method104(7, false, true, true);
            Statics.field199 = method104(8, false, true, true);
            Statics.field1531 = method104(9, false, true, true);
            Statics.field916 = method104(10, false, true, true);
            Statics.field549 = method104(11, false, true, true);
            Statics.field914 = method104(12, false, true, true);
            Statics.field586 = method104(13, true, false, true);
            Statics.field1268 = method104(14, false, true, false);
            Statics.field1463 = method104(15, false, true, true);
            class28.field663 = class142.field2255;
            class28.field665 = 20;
            field258 = 40;
        } else if (field258 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1277.method2766() * 4 / 100;
            int var8 = var7 + Statics.field2089.method2766() * 4 / 100;
            int var9 = var8 + Statics.field1872.method2766() * 2 / 100;
            int var10 = var9 + Statics.field1255.method2766() * 2 / 100;
            int var11 = var10 + Statics.field2766.method2766() * 6 / 100;
            int var12 = var11 + Statics.field2926.method2766() * 4 / 100;
            int var13 = var12 + Statics.field1251.method2766() * 2 / 100;
            int var14 = var13 + Statics.field11.method2766() * 60 / 100;
            int var15 = var14 + Statics.field199.method2766() * 2 / 100;
            int var16 = var15 + Statics.field1531.method2766() * 2 / 100;
            int var17 = var16 + Statics.field916.method2766() * 2 / 100;
            int var18 = var17 + Statics.field549.method2766() * 2 / 100;
            int var19 = var18 + Statics.field914.method2766() * 2 / 100;
            int var20 = var19 + Statics.field586.method2766() * 2 / 100;
            int var21 = var20 + Statics.field1268.method2766() * 2 / 100;
            int var22 = var21 + Statics.field1463.method2766() * 2 / 100;
            if (var22 == 100) {
                class28.field663 = class142.field2171;
                class28.field665 = 30;
                field258 = 45;
            } else {
                if (var22 != 0) {
                    class28.field663 = class142.field2170 + var22 + "%";
                }
                class28.field665 = 30;
            }
        } else if (field258 == 45) {
            class50.method492(22050, !field279, 2);
            class162 var23 = new class162();
            var23.method3037(9, 128);
            Statics.field1913 = class50.method833(Statics.field1005, Statics.field1657, 0, 22050);
            Statics.field1913.method981(var23);
            class161.method2785(Statics.field1463, Statics.field1268, Statics.field2766, var23);
            Statics.field220 = class50.method833(Statics.field1005, Statics.field1657, 1, 2048);
            Statics.field571 = new class49();
            Statics.field220.method981(Statics.field571);
            Statics.field57 = new class68(22050, Statics.field1075);
            class28.field663 = class142.field2224;
            class28.field665 = 35;
            field258 = 50;
        } else if (field258 == 50) {
            int var24 = 0;
            if (Statics.field533 == null) {
                Statics.field533 = class70.method1053(Statics.field199, Statics.field586, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field891 == null) {
                Statics.field891 = class70.method1053(Statics.field199, Statics.field586, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field1690 == null) {
                Statics.field1690 = class70.method1053(Statics.field199, Statics.field586, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class28.field663 = class142.field2173 + var24 * 100 / 3 + "%";
                class28.field665 = 40;
            } else {
                Statics.field65 = new class145(true);
                class28.field663 = class142.field2332;
                class28.field665 = 40;
                field258 = 60;
            }
        } else if (field258 == 60) {
            int var25 = class28.method599(Statics.field916, Statics.field199);
            int var26 = class28.method1415();
            if (var25 < var26) {
                class28.field663 = class142.field2175 + var25 * 100 / var26 + "%";
                class28.field665 = 50;
            } else {
                class28.field663 = class142.field2176;
                class28.field665 = 50;
                method1870(5);
                field258 = 70;
            }
        } else if (field258 == 70) {
            if (Statics.field1872.method2702()) {
                class41.method582(Statics.field1872);
                class147 var27 = Statics.field1872;
                Statics.field890 = var27;
                class147 var28 = Statics.field1872;
                class147 var29 = Statics.field11;
                Statics.field955 = var28;
                Statics.field946 = var29;
                Statics.field947 = Statics.field955.method2723(3);
                class36.method1872(Statics.field1872, Statics.field11, field279);
                class35.method559(Statics.field1872, Statics.field11);
                class147 var30 = Statics.field1872;
                class147 var31 = Statics.field11;
                boolean var32 = field259;
                class193 var33 = Statics.field533;
                Statics.field1009 = var30;
                Statics.field1055 = var31;
                Statics.field1010 = var32;
                Statics.field1009.method2723(10);
                Statics.field1014 = var33;
                Statics.method2784(Statics.field1872, Statics.field1277, Statics.field2089);
                class39.method596(Statics.field1872, Statics.field11);
                class42.method134(Statics.field1872);
                class147 var34 = Statics.field1872;
                Statics.field1065 = var34;
                Statics.field1066 = Statics.field1065.method2723(16);
                class147 var35 = Statics.field1255;
                class147 var36 = Statics.field11;
                class147 var37 = Statics.field199;
                class147 var38 = Statics.field586;
                Statics.field2562 = var35;
                Statics.field2529 = var36;
                Statics.field2530 = var37;
                Statics.field1534 = var38;
                Statics.field2579 = new class152[Statics.field2562.method2708()][];
                Statics.field2537 = new boolean[Statics.field2562.method2708()];
                class147 var39 = Statics.field1872;
                Statics.field1007 = var39;
                class43.method16(Statics.field1872);
                class28.field663 = class142.field2168;
                class28.field665 = 60;
                field258 = 80;
            } else {
                class28.field663 = class142.field2177 + Statics.field1872.method2773() + "%";
                class28.field665 = 60;
            }
        } else if (field258 == 80) {
            int var40 = 0;
            if (Statics.field524 == null) {
                Statics.field524 = class70.method77(Statics.field199, "compass", "");
            } else {
                var40++;
            }
            if (Statics.field147 == null) {
                Statics.field147 = class70.method77(Statics.field199, "mapedge", "");
            } else {
                var40++;
            }
            if (Statics.field957 == null) {
                Statics.field957 = Statics.method76(Statics.field199, "mapscene", "");
            } else {
                var40++;
            }
            if (Statics.field881 == null) {
                Statics.field881 = class70.method813(Statics.field199, "mapfunction", "");
            } else {
                var40++;
            }
            if (Statics.field647 == null) {
                Statics.field647 = class70.method813(Statics.field199, "hitmarks", "");
            } else {
                var40++;
            }
            if (Statics.field1293 == null) {
                Statics.field1293 = class70.method813(Statics.field199, "headicons_pk", "");
            } else {
                var40++;
            }
            if (Statics.field1299 == null) {
                Statics.field1299 = class70.method813(Statics.field199, "headicons_prayer", "");
            } else {
                var40++;
            }
            if (Statics.field1059 == null) {
                Statics.field1059 = class70.method813(Statics.field199, "headicons_hint", "");
            } else {
                var40++;
            }
            if (Statics.field2765 == null) {
                Statics.field2765 = class70.method813(Statics.field199, "mapmarker", "");
            } else {
                var40++;
            }
            if (Statics.field700 == null) {
                Statics.field700 = class70.method813(Statics.field199, "cross", "");
            } else {
                var40++;
            }
            if (Statics.field2486 == null) {
                Statics.field2486 = class70.method813(Statics.field199, "mapdots", "");
            } else {
                var40++;
            }
            if (Statics.field2663 == null) {
                Statics.field2663 = Statics.method76(Statics.field199, "scrollbar", "");
            } else {
                var40++;
            }
            if (Statics.field1680 == null) {
                Statics.field1680 = Statics.method76(Statics.field199, "mod_icons", "");
            } else {
                var40++;
            }
            if (Statics.field827 == null) {
                Statics.field827 = class70.method140(Statics.field199, "mapback", "");
            } else {
                var40++;
            }
            if (var40 < 14) {
                class28.field663 = class142.field2179 + var40 * 100 / 14 + "%";
                class28.field665 = 70;
            } else {
                Statics.field2902 = Statics.field1680;
                Statics.field147.method1498();
                int var41 = (int) (Math.random() * 21.0D) - 10;
                int var42 = (int) (Math.random() * 21.0D) - 10;
                int var43 = (int) (Math.random() * 21.0D) - 10;
                int var44 = (int) (Math.random() * 41.0D) - 20;
                for (int var45 = 0; var45 < Statics.field881.length; var45++) {
                    Statics.field881[var45].method1425(var41 + var44, var42 + var44, var43 + var44);
                }
                Statics.field957[0].method1563(var41 + var44, var42 + var44, var43 + var44);
                Statics.field2034 = new int[33];
                Statics.field2118 = new int[33];
                Statics.field614 = new int[151];
                Statics.field29 = new int[151];
                for (int var46 = 0; var46 < 33; var46++) {
                    int var47 = 999;
                    int var48 = 0;
                    for (int var49 = 0; var49 < 34; var49++) {
                        if (Statics.field827.field1329[Statics.field827.field1327 * var46 + var49] == 0) {
                            if (var47 == 999) {
                                var47 = var49;
                            }
                        } else if (var47 != 999) {
                            var48 = var49;
                            break;
                        }
                    }
                    Statics.field2034[var46] = var47;
                    Statics.field2118[var46] = var48 - var47;
                }
                for (int var50 = 5; var50 < 156; var50++) {
                    int var51 = 999;
                    int var52 = 0;
                    for (int var53 = 25; var53 < 172; var53++) {
                        if (Statics.field827.field1329[Statics.field827.field1327 * var50 + var53] == 0 && var53 > 34 || var50 > 34) {
                            if (var51 == 999) {
                                var51 = var53;
                            }
                        } else if (var51 != 999) {
                            var52 = var53;
                            break;
                        }
                    }
                    Statics.field614[var50 - 5] = var51 - 25;
                    Statics.field29[var50 - 5] = var52 - var51;
                }
                class28.field663 = class142.field2180;
                class28.field665 = 70;
                field258 = 90;
            }
        } else if (field258 == 90) {
            if (Statics.field1531.method2702()) {
                class88 var54 = new class88(Statics.field1531, Statics.field199, 20, 0.8D, field279 ? 64 : 128);
                class84.method1822(var54);
                class84.method1781(0.8D);
                class28.field663 = class142.field2182;
                class28.field665 = 90;
                field258 = 110;
            } else {
                class28.field663 = class142.field2181 + Statics.field1531.method2773() + "%";
                class28.field665 = 90;
            }
        } else if (field258 == 110) {
            Statics.field229 = new class12();
            Statics.field1005.method2463(Statics.field229, 10);
            class28.field663 = class142.field2183;
            class28.field665 = 94;
            field258 = 120;
        } else if (field258 == 120) {
            if (Statics.field916.method2715("huffman", "")) {
                class102 var55 = new class102(Statics.field916.method2714("huffman", ""));
                class191.method79(var55);
                class28.field663 = class142.field2185;
                class28.field665 = 96;
                field258 = 130;
            } else {
                class28.field663 = class142.field2257 + "%";
                class28.field665 = 96;
            }
        } else if (field258 == 130) {
            if (!Statics.field1255.method2702()) {
                class28.field663 = class142.field2186 + Statics.field1255.method2773() * 4 / 5 + "%";
                class28.field665 = 100;
            } else if (!Statics.field914.method2702()) {
                class28.field663 = class142.field2186 + (80 + Statics.field914.method2773() / 6) + "%";
                class28.field665 = 100;
            } else if (Statics.field586.method2702()) {
                class28.field663 = class142.field2187;
                class28.field665 = 100;
                field258 = 140;
            } else {
                class28.field663 = class142.field2186 + (96 + Statics.field586.method2773() / 20) + "%";
                class28.field665 = 100;
            }
        } else if (field258 == 140) {
            method1870(10);
        }
    }

    @ObfuscatedName("o.u(IZZZI)Leh;")
    public static class147 method104(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2101 != null) {
            var4 = new class121(arg0, class136.field2101, Statics.field1945[arg0], 1000000);
        }
        return new class147(var4, Statics.field2545, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("eu.n(I)V")
    public static final void method2680() {
        try {
            if (field364 == 0) {
                if (Statics.field295 != null) {
                    Statics.field295.method2567();
                    Statics.field295 = null;
                }
                Statics.field62 = null;
                field438 = false;
                field288 = 0;
                field364 = 1;
            }
            if (field364 == 1) {
                if (Statics.field62 == null) {
                    Statics.field62 = Statics.field1005.method2477(Statics.field291, Statics.field1889);
                }
                if (Statics.field62.field2069 == 2) {
                    throw new IOException();
                }
                if (Statics.field62.field2069 == 1) {
                    Statics.field295 = new class130((Socket) Statics.field62.field2070, Statics.field1005);
                    Statics.field62 = null;
                    field364 = 2;
                }
            }
            if (field364 == 2) {
                field499.field1862 = 0;
                field499.method2102(14);
                Statics.field295.method2563(field499.field1857, 0, 1);
                field297.field1862 = 0;
                field364 = 3;
            }
            if (field364 == 3) {
                if (Statics.field1913 != null) {
                    Statics.field1913.method988();
                }
                if (Statics.field220 != null) {
                    Statics.field220.method988();
                }
                int var0 = Statics.field295.method2564();
                if (Statics.field1913 != null) {
                    Statics.field1913.method988();
                }
                if (Statics.field220 != null) {
                    Statics.field220.method988();
                }
                if (var0 != 0) {
                    method507(var0);
                    return;
                }
                field297.field1862 = 0;
                field364 = 5;
            }
            if (field364 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field499.field1862 = 0;
                field499.method2102(1);
                field499.method2102(class28.field673.method464());
                field499.method2303(var1[0]);
                field499.method2303(var1[1]);
                field499.method2303(var1[2]);
                field499.method2303(var1[3]);
                switch(class28.field673.field2408) {
                    case 0:
                    case 1:
                        field499.method2104(Statics.field669);
                        field499.field1862 += 5;
                        break;
                    case 2:
                        field499.field1862 += 8;
                        break;
                    case 3:
                        field499.method2303((Integer) Statics.field30.field140.get(class199.method2491(class28.field675)));
                        field499.field1862 += 4;
                }
                field499.method2107(class28.field671);
                field499.method2202(class5.field71, class5.field80);
                field456.field1862 = 0;
                if (field263 == 40) {
                    field456.method2102(18);
                } else {
                    field456.method2102(16);
                }
                field456.method2275(0);
                int var2 = field456.field1862;
                field456.method2303(54);
                field456.method2110(field499.field1857, 0, field499.field1862);
                int var3 = field456.field1862;
                field456.method2107(class28.field675);
                field456.method2102(field279 ? 1 : 0);
                class110 var4 = field456;
                byte[] var5 = new byte[24];
                try {
                    class136.field2099.method3473(0L);
                    class136.field2099.method3474(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var27) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2110(var5, 0, 24);
                class107 var9 = new class107(Statics.field65.method2690());
                Statics.field65.method2689(var9);
                field456.method2110(var9.field1857, 0, var9.field1857.length);
                field456.method2303(Statics.field1277.field2465);
                field456.method2303(Statics.field2089.field2465);
                field456.method2303(Statics.field1872.field2465);
                field456.method2303(Statics.field1255.field2465);
                field456.method2303(Statics.field2766.field2465);
                field456.method2303(Statics.field2926.field2465);
                field456.method2303(Statics.field1251.field2465);
                field456.method2303(Statics.field11.field2465);
                field456.method2303(Statics.field199.field2465);
                field456.method2303(Statics.field1531.field2465);
                field456.method2303(Statics.field916.field2465);
                field456.method2303(Statics.field549.field2465);
                field456.method2303(Statics.field914.field2465);
                field456.method2303(Statics.field586.field2465);
                field456.method2303(Statics.field1268.field2465);
                field456.method2303(Statics.field1463.field2465);
                field456.method2131(var1, var3, field456.field1862);
                field456.method2262(field456.field1862 - var2);
                Statics.field295.method2563(field456.field1857, 0, field456.field1862);
                field499.method2348(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field297.method2348(var1);
                field364 = 6;
            }
            if (field364 == 6 && Statics.field295.method2565() > 0) {
                int var11 = Statics.field295.method2564();
                if (var11 == 21 && field263 == 20) {
                    field364 = 7;
                } else if (var11 == 2) {
                    field364 = 9;
                } else if (var11 == 15 && field263 == 40) {
                    method2658();
                    return;
                } else if (var11 == 23 && field289 < 1) {
                    field289++;
                    field364 = 0;
                } else {
                    method507(var11);
                    return;
                }
            }
            if (field364 == 7 && Statics.field295.method2565() > 0) {
                field290 = (Statics.field295.method2564() + 3) * 60;
                field364 = 8;
            }
            if (field364 == 8) {
                field288 = 0;
                class28.method2681(class142.field2352, class142.field2351, field290 / 60 + class142.field2241);
                if (--field290 <= 0) {
                    field364 = 0;
                }
            } else {
                if (field364 == 9 && Statics.field295.method2565() >= 13) {
                    boolean var12 = Statics.field295.method2564() == 1;
                    Statics.field295.method2577(field297.field1857, 0, 4);
                    field297.field1862 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field297.method2351() << 24;
                        int var15 = var14 | field297.method2351() << 16;
                        int var16 = var15 | field297.method2351() << 8;
                        int var17 = var16 | field297.method2351();
                        int var18 = class199.method2491(class28.field675);
                        if (Statics.field30.field140.size() >= 10 && !Statics.field30.field140.containsKey(var18)) {
                            Iterator var19 = Statics.field30.field140.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field30.field140.put(var18, var17);
                        class9.method2();
                    }
                    field326 = Statics.field295.method2564();
                    field367 = Statics.field295.method2564() == 1;
                    field479 = Statics.field295.method2564();
                    field479 <<= 0x8;
                    field479 += Statics.field295.method2564();
                    field383 = Statics.field295.method2564();
                    Statics.field295.method2577(field297.field1857, 0, 1);
                    field297.field1862 = 0;
                    field374 = field297.method2351();
                    Statics.field295.method2577(field297.field1857, 0, 2);
                    field297.field1862 = 0;
                    field300 = field297.method2117();
                    if (field383 == 1) {
                        try {
                            client var20 = Statics.field252;
                            JSObject.getWindow(var20).call("zap", (Object[]) null);
                        } catch (Throwable var26) {
                        }
                    } else {
                        try {
                            client var22 = Statics.field252;
                            JSObject.getWindow(var22).call("unzap", (Object[]) null);
                        } catch (Throwable var25) {
                        }
                    }
                    field364 = 10;
                }
                if (field364 != 10) {
                    field288++;
                    if (field288 > 2000) {
                        if (field289 < 1) {
                            if (Statics.field236 == Statics.field1889) {
                                Statics.field1889 = Statics.field678;
                            } else {
                                Statics.field1889 = Statics.field236;
                            }
                            field289++;
                            field364 = 0;
                        } else {
                            method507(-3);
                        }
                    }
                } else if (Statics.field295.method2565() >= field300) {
                    field297.field1862 = 0;
                    Statics.field295.method2577(field297.field1857, 0, field300);
                    method145();
                    Statics.field188 = -1;
                    method2778(false);
                    field374 = -1;
                }
            }
        } catch (IOException var28) {
            if (field289 < 1) {
                if (Statics.field236 == Statics.field1889) {
                    Statics.field1889 = Statics.field678;
                } else {
                    Statics.field1889 = Statics.field236;
                }
                field289++;
                field364 = 0;
            } else {
                method507(-2);
            }
        }
    }

    @ObfuscatedName("y.x(I)V")
    public static void method145() {
        field266 = 1L;
        field269 = -1;
        Statics.field229.field183 = 0;
        Statics.field696 = true;
        field399 = true;
        field382 = -1L;
        class189.method1875();
        field499.field1862 = 0;
        field297.field1862 = 0;
        field374 = -1;
        field305 = -1;
        field306 = -1;
        field283 = -1;
        field302 = 0;
        field272 = 0;
        field332 = 0;
        field273 = 0;
        field321 = 0;
        field278 = false;
        class127.method1018(0);
        class10.method2404();
        field412 = 0;
        field314 = false;
        field495 = 0;
        field280 = (int) (Math.random() * 100.0D) - 50;
        field401 = (int) (Math.random() * 110.0D) - 55;
        field407 = (int) (Math.random() * 80.0D) - 40;
        field251 = (int) (Math.random() * 120.0D) - 60;
        field330 = (int) (Math.random() * 30.0D) - 20;
        field341 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field489 = 0;
        field482 = -1;
        field487 = 0;
        field488 = 0;
        field282 = class18.field518;
        field377 = 0;
        field293 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field376[var0] = null;
            field371[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field484[var1] = null;
        }
        Statics.field892 = field376[2047] = new class3();
        field328 = -1;
        field333.method3245();
        field444.method3245();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field391[var2][var3][var4] = null;
                }
            }
        }
        field392 = new class177();
        field509 = 0;
        field329 = 0;
        field512 = 0;
        for (int var5 = 0; var5 < Statics.field1066; var5++) {
            class46 var6 = class46.method1873(var5);
            if (var6 != null) {
                class154.field2662[var5] = 0;
                class154.field2661[var5] = 0;
            }
        }
        for (int var7 = 0; var7 < field454.length; var7++) {
            field454[var7] = -1;
        }
        field427 = -1;
        if (field477 != -1) {
            int var8 = field477;
            if (var8 != -1 && Statics.field2537[var8]) {
                Statics.field2562.method2709(var8);
                if (Statics.field2579[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field2579[var8].length; var10++) {
                        if (Statics.field2579[var8][var10] != null) {
                            if (Statics.field2579[var8][var10].field2538 == 2) {
                                var9 = false;
                            } else {
                                Statics.field2579[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field2579[var8] = null;
                    }
                    Statics.field2537[var8] = false;
                }
            }
        }
        for (class4 var11 = (class4) field379.method3199(); var11 != null; var11 = (class4) field379.method3193()) {
            method1061(var11, true);
        }
        field477 = -1;
        field379 = new class174(8);
        field423 = null;
        field278 = false;
        field321 = 0;
        field514.method2911((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field387[var12] = null;
            field429[var12] = false;
        }
        class14.field197 = new class174(32);
        field264 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field344[var13] = true;
        }
        field301 = null;
        Statics.field224 = 0;
        Statics.field1994 = null;
    }

    @ObfuscatedName("ex.f(B)V")
    public static void method2658() {
        field499.field1862 = 0;
        field297.field1862 = 0;
        field374 = -1;
        field305 = -1;
        field306 = -1;
        field283 = -1;
        field300 = 0;
        field302 = 0;
        field272 = 0;
        field321 = 0;
        field278 = false;
        field489 = 0;
        field487 = 0;
        for (int var0 = 0; var0 < field376.length; var0++) {
            if (field376[var0] != null) {
                field376[var0].field765 = -1;
            }
        }
        for (int var1 = 0; var1 < field484.length; var1++) {
            if (field484[var1] != null) {
                field484[var1].field765 = -1;
            }
        }
        class14.field197 = new class174(32);
        method1870(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field344[var2] = true;
        }
    }

    @ObfuscatedName("d.v(II)V")
    public static void method507(int arg0) {
        if (arg0 == -3) {
            class28.method2681(class142.field2194, class142.field2195, class142.field2267);
        } else if (arg0 == -2) {
            class28.method2681(class142.field2197, class142.field2198, class142.field2199);
        } else if (arg0 == -1) {
            class28.method2681(class142.field2200, class142.field2201, class142.field2202);
        } else if (arg0 == 3) {
            class28.method2681(class142.field2341, class142.field2204, class142.field2395);
        } else if (arg0 == 4) {
            class28.method2681(class142.field2191, class142.field2207, class142.field2208);
        } else if (arg0 == 5) {
            class28.method2681(class142.field2184, class142.field2206, class142.field2211);
        } else if (arg0 == 6) {
            class28.method2681(class142.field2284, class142.field2213, class142.field2214);
        } else if (arg0 == 7) {
            class28.method2681(class142.field2215, class142.field2216, class142.field2355);
        } else if (arg0 == 8) {
            class28.method2681(class142.field2218, class142.field2219, class142.field2220);
        } else if (arg0 == 9) {
            class28.method2681(class142.field2221, class142.field2222, class142.field2223);
        } else if (arg0 == 10) {
            class28.method2681(class142.field2365, class142.field2225, class142.field2226);
        } else if (arg0 == 11) {
            class28.method2681(class142.field2227, class142.field2228, class142.field2372);
        } else if (arg0 == 12) {
            class28.method2681(class142.field2230, class142.field2231, class142.field2232);
        } else if (arg0 == 13) {
            class28.method2681(class142.field2233, class142.field2234, class142.field2190);
        } else if (arg0 == 14) {
            class28.method2681(class142.field2236, class142.field2237, class142.field2238);
        } else if (arg0 == 16) {
            class28.method2681(class142.field2192, class142.field2240, class142.field2172);
        } else if (arg0 == 17) {
            class28.method2681(class142.field2242, class142.field2243, class142.field2209);
        } else if (arg0 == 18) {
            class28.method2681(class142.field2245, class142.field2246, class142.field2247);
        } else if (arg0 == 19) {
            class28.method2681(class142.field2362, class142.field2249, class142.field2250);
        } else if (arg0 == 20) {
            class28.method2681(class142.field2251, class142.field2252, class142.field2212);
        } else if (arg0 == 22) {
            class28.method2681(class142.field2254, class142.field2311, class142.field2256);
        } else if (arg0 == 23) {
            class28.method2681(class142.field2196, class142.field2205, class142.field2259);
        } else if (arg0 == 24) {
            class28.method2681(class142.field2360, class142.field2261, class142.field2319);
        } else if (arg0 == 25) {
            class28.method2681(class142.field2263, class142.field2264, class142.field2265);
        } else if (arg0 == 26) {
            class28.method2681(class142.field2266, class142.field2162, class142.field2363);
        } else if (arg0 == 27) {
            class28.method2681(class142.field2258, class142.field2169, class142.field2278);
        } else if (arg0 == 31) {
            class28.method2681(class142.field2386, class142.field2279, class142.field2280);
        } else if (arg0 == 32) {
            class28.method2681(class142.field2281, class142.field2282, class142.field2283);
        } else if (arg0 == 37) {
            class28.method2681(class142.field2248, class142.field2402, class142.field2286);
        } else if (arg0 == 38) {
            class28.method2681(class142.field2193, class142.field2253, class142.field2174);
        } else if (arg0 == 55) {
            class28.method2681(class142.field2307, class142.field2239, class142.field2382);
        } else if (arg0 == 56) {
            class28.method2681(class142.field2203, class142.field2379, class142.field2397);
            method1870(11);
            return;
        } else if (arg0 == 57) {
            class28.method2681(class142.field2327, class142.field2297, class142.field2298);
            method1870(11);
            return;
        } else {
            class28.method2681(class142.field2299, class142.field2300, class142.field2323);
        }
        method1870(10);
    }

    @ObfuscatedName("p.s(B)V")
    public static final void method149() {
        if (Statics.field295 != null) {
            Statics.field295.method2567();
            Statics.field295 = null;
        }
        method481();
        Statics.field2481.method1595();
        for (int var0 = 0; var0 < 4; var0++) {
            field316[var0].method3498();
        }
        System.gc();
        class161.method2533(2);
        field491 = -1;
        field296 = false;
        class20.method1959();
        method1870(10);
    }

    @ObfuscatedName("s.r(I)V")
    public static final void method481() {
        class41.field959.method3162();
        class37.field883.method3162();
        class40.field945.method3162();
        class36.field876.method3162();
        class36.field835.method3162();
        class36.field836.method3162();
        class36.field837.method3162();
        class35.method1867();
        class45.field1017.method3162();
        class45.field1012.method3162();
        class45.field1013.method3162();
        class38.method2450();
        class39.method2414();
        class42.method2345();
        class46.field1061.method3162();
        class157.field2681.method3162();
        class152.method2505();
        ((class88) Statics.field1485).method1853();
        class19.field541.method3162();
        Statics.field1277.method2710();
        Statics.field2089.method2710();
        Statics.field1255.method2710();
        Statics.field2766.method2710();
        Statics.field2926.method2710();
        Statics.field1251.method2710();
        Statics.field11.method2710();
        Statics.field199.method2710();
        Statics.field1531.method2710();
        Statics.field916.method2710();
        Statics.field549.method2710();
        Statics.field914.method2710();
    }

    @ObfuscatedName("u.j(I)V")
    public static final void method172() {
        if (field332 > 0) {
            method149();
        } else {
            method1870(40);
            Statics.field478 = Statics.field295;
            Statics.field295 = null;
        }
    }

    @ObfuscatedName("ae.h(I)V")
    public static final void method756() {
        if (field272 > 1) {
            field272--;
        }
        if (field332 > 0) {
            field332--;
        }
        if (field438) {
            field438 = false;
            method172();
            return;
        }
        if (!field278) {
            field475[0] = class142.field2391;
            field397[0] = "";
            field404[0] = 1006;
            field321 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field295 == null) {
                var1 = false;
            } else {
                label2596: {
                    try {
                        int var2 = Statics.field295.method2565();
                        if (var2 == 0) {
                            var1 = false;
                            break label2596;
                        }
                        if (field374 == -1) {
                            Statics.field295.method2577(field297.field1857, 0, 1);
                            field297.field1862 = 0;
                            field374 = field297.method2351();
                            field300 = class166.field2804[field374];
                            var2--;
                        }
                        if (field300 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2596;
                            }
                            Statics.field295.method2577(field297.field1857, 0, 1);
                            field300 = field297.field1857[0] & 0xFF;
                            var2--;
                        }
                        if (field300 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2596;
                            }
                            Statics.field295.method2577(field297.field1857, 0, 2);
                            field297.field1862 = 0;
                            field300 = field297.method2117();
                            var2 -= 2;
                        }
                        if (var2 < field300) {
                            var1 = false;
                            break label2596;
                        }
                        field297.field1862 = 0;
                        Statics.field295.method2577(field297.field1857, 0, field300);
                        field302 = 0;
                        field283 = field306;
                        field306 = field305;
                        field305 = field374;
                        if (field374 == 246) {
                            String var3 = field297.method2123();
                            long var4 = (long) field297.method2117();
                            long var6 = (long) field297.method2119();
                            int var8 = field297.method2115();
                            long var9 = (var4 << 32) + var6;
                            boolean var11 = false;
                            for (int var12 = 0; var12 < 100; var12++) {
                                if (field508[var12] == var9) {
                                    var11 = true;
                                    break;
                                }
                            }
                            if (method3470(var3)) {
                                var11 = true;
                            }
                            if (!var11 && field375 == 0) {
                                field508[field327] = var9;
                                field327 = (field327 + 1) % 100;
                                String var13 = class192.method3368(class199.method3528(class191.method136(field297)));
                                if (var8 == 2 || var8 == 3) {
                                    class10.method1970(7, class2.method597(1) + var3, var13);
                                } else if (var8 == 1) {
                                    class10.method1970(7, class2.method597(0) + var3, var13);
                                } else {
                                    class10.method1970(3, var3, var13);
                                }
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 207) {
                            method2422();
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 115) {
                            method2511();
                            field270 = field297.method2115();
                            field388 = field443;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 241) {
                            method149();
                            field374 = -1;
                            var1 = false;
                            break label2596;
                        }
                        if (field374 == 232) {
                            int var14 = field300 + field297.field1862;
                            int var15 = field297.method2117();
                            int var16 = field297.method2117();
                            if (field477 != var15) {
                                field477 = var15;
                                method146(field477);
                                class32.method91(field477);
                                for (int var17 = 0; var17 < 100; var17++) {
                                    field344[var17] = true;
                                }
                            }
                            while (var16-- > 0) {
                                int var18 = field297.method2120();
                                int var19 = field297.method2117();
                                int var20 = field297.method2115();
                                class4 var21 = (class4) field379.method3197((long) var18);
                                if (var21 != null && var21.field68 != var19) {
                                    method1061(var21, true);
                                    var21 = null;
                                }
                                if (var21 == null) {
                                    var21 = method86(var18, var19, var20);
                                }
                                var21.field67 = true;
                            }
                            for (class4 var22 = (class4) field379.method3199(); var22 != null; var22 = (class4) field379.method3193()) {
                                if (var22.field67) {
                                    var22.field67 = false;
                                } else {
                                    method1061(var22, true);
                                }
                            }
                            field460 = new class174(512);
                            while (field297.field1862 < var14) {
                                int var23 = field297.method2120();
                                int var24 = field297.method2117();
                                int var25 = field297.method2117();
                                int var26 = field297.method2120();
                                for (int var27 = var24; var27 <= var25; var27++) {
                                    long var28 = ((long) var23 << 32) + (long) var27;
                                    field460.method3191(new class179(var26), var28);
                                }
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 78) {
                            while (field297.field1862 < field300) {
                                boolean var30 = field297.method2115() == 1;
                                String var31 = field297.method2123();
                                String var32 = field297.method2123();
                                int var33 = field297.method2117();
                                int var34 = field297.method2115();
                                int var35 = field297.method2115();
                                boolean var36 = (var35 & 0x2) != 0;
                                boolean var37 = (var35 & 0x1) != 0;
                                if (var33 > 0) {
                                    field297.method2123();
                                    field297.method2115();
                                    field297.method2120();
                                }
                                field297.method2123();
                                for (int var38 = 0; var38 < field329; var38++) {
                                    class16 var39 = field510[var38];
                                    if (var30) {
                                        if (var32.equals(var39.field234)) {
                                            var39.field234 = var31;
                                            var39.field231 = var32;
                                            var31 = null;
                                            break;
                                        }
                                    } else if (var31.equals(var39.field234)) {
                                        if (var39.field225 != var33) {
                                            boolean var40 = true;
                                            for (class34 var41 = (class34) field511.method3181(); var41 != null; var41 = (class34) field511.method3184()) {
                                                if (var41.field786.equals(var31)) {
                                                    if (var33 != 0 && var41.field785 == 0) {
                                                        var41.method3319();
                                                        var40 = false;
                                                    } else if (var33 == 0 && var41.field785 != 0) {
                                                        var41.method3319();
                                                        var40 = false;
                                                    }
                                                }
                                            }
                                            if (var40) {
                                                field511.method3182(new class34(var31, var33));
                                            }
                                            var39.field225 = var33;
                                        }
                                        var39.field231 = var32;
                                        var39.field226 = var34;
                                        var39.field227 = var36;
                                        var39.field228 = var37;
                                        var31 = null;
                                        break;
                                    }
                                }
                                if (var31 != null && field329 < 400) {
                                    class16 var42 = new class16();
                                    field510[field329] = var42;
                                    var42.field234 = var31;
                                    var42.field231 = var32;
                                    var42.field225 = var33;
                                    var42.field226 = var34;
                                    var42.field227 = var36;
                                    var42.field228 = var37;
                                    field329++;
                                }
                            }
                            field509 = 2;
                            field451 = field443;
                            boolean var43 = false;
                            int var44 = field329;
                            while (var44 > 0) {
                                boolean var45 = true;
                                var44--;
                                for (int var46 = 0; var46 < var44; var46++) {
                                    boolean var47 = false;
                                    class16 var48 = field510[var46];
                                    class16 var49 = field510[var46 + 1];
                                    if (field424 != var48.field225 && field424 == var49.field225) {
                                        var47 = true;
                                    }
                                    if (!var47 && var48.field225 == 0 && var49.field225 != 0) {
                                        var47 = true;
                                    }
                                    if (!var47 && !var48.field227 && var49.field227) {
                                        var47 = true;
                                    }
                                    if (!var47 && !var48.field228 && var49.field228) {
                                        var47 = true;
                                    }
                                    if (var47) {
                                        class16 var50 = field510[var46];
                                        field510[var46] = field510[var46 + 1];
                                        field510[var46 + 1] = var50;
                                        var45 = false;
                                    }
                                }
                                if (var45) {
                                    break;
                                }
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 126) {
                            method33();
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 233) {
                            if (field477 != -1) {
                                method2055(field477, 0);
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 104) {
                            int var51 = field297.method2236();
                            int var52 = field297.method2118();
                            class152 var53 = class152.method493(var51);
                            if (var53.field2572 != var52 || var52 == -1) {
                                var53.field2572 = var52;
                                var53.field2642 = 0;
                                var53.field2534 = 0;
                                method564(var53);
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 224 || field374 == 60 || field374 == 54 || field374 == 147 || field374 == 105 || field374 == 0 || field374 == 87 || field374 == 199 || field374 == 65 || field374 == 88) {
                            method2466();
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 22) {
                            String var54 = field297.method2123();
                            int var55 = field297.method2117();
                            byte var56 = field297.method2116();
                            boolean var57 = false;
                            if (var56 == -128) {
                                var57 = true;
                            }
                            if (var57) {
                                if (Statics.field224 == 0) {
                                    field374 = -1;
                                    var1 = true;
                                    break label2596;
                                }
                                boolean var58 = false;
                                int var59;
                                for (var59 = 0; var59 < Statics.field224 && (!Statics.field1994[var59].field570.equals(var54) || Statics.field1994[var59].field569 != var55); var59++) {
                                }
                                if (var59 < Statics.field224) {
                                    while (var59 < Statics.field224 - 1) {
                                        Statics.field1994[var59] = Statics.field1994[var59 + 1];
                                        var59++;
                                    }
                                    Statics.field224--;
                                    Statics.field1994[Statics.field224] = null;
                                }
                            } else {
                                field297.method2123();
                                class21 var60 = new class21();
                                var60.field570 = var54;
                                var60.field566 = class200.method583(var60.field570, Statics.field298);
                                var60.field569 = var55;
                                var60.field568 = var56;
                                int var61;
                                for (var61 = Statics.field224 - 1; var61 >= 0; var61--) {
                                    int var62 = Statics.field1994[var61].field566.compareTo(var60.field570);
                                    if (var62 == 0) {
                                        Statics.field1994[var61].field569 = var55;
                                        Statics.field1994[var61].field568 = var56;
                                        if (var54.equals(Statics.field892.field55)) {
                                            Statics.field245 = var56;
                                        }
                                        field452 = field443;
                                        field374 = -1;
                                        var1 = true;
                                        break label2596;
                                    }
                                    if (var62 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field224 >= Statics.field1994.length) {
                                    field374 = -1;
                                    var1 = true;
                                    break label2596;
                                }
                                for (int var63 = Statics.field224 - 1; var63 > var61; var63--) {
                                    Statics.field1994[var63 + 1] = Statics.field1994[var63];
                                }
                                if (Statics.field224 == 0) {
                                    Statics.field1994 = new class21[100];
                                }
                                Statics.field1994[var61 + 1] = var60;
                                Statics.field224++;
                                if (var54.equals(Statics.field892.field55)) {
                                    Statics.field245 = var56;
                                }
                            }
                            field452 = field443;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 254) {
                            int var64 = field297.method2120();
                            int var65 = field297.method2301();
                            int var66 = var65 >> 10 & 0x1F;
                            int var67 = var65 >> 5 & 0x1F;
                            int var68 = var65 & 0x1F;
                            int var69 = (var68 << 3) + (var66 << 19) + (var67 << 11);
                            class152 var70 = class152.method493(var64);
                            if (var70.field2553 != var69) {
                                var70.field2553 = var69;
                                method564(var70);
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 197) {
                            Statics.field320 = field297.method2204();
                            Statics.field200 = field297.method2140();
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 171) {
                            field272 = field297.method2117() * 30;
                            field388 = field443;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 142) {
                            field297.field1862 += 28;
                            if (field297.method2175()) {
                                class110 var71 = field297;
                                int var72 = field297.field1862 - 28;
                                if (class136.field2099 != null) {
                                    try {
                                        class136.field2099.method3473(0L);
                                        class136.field2099.method3476(var71.field1857, var72, 24);
                                    } catch (Exception var386) {
                                    }
                                }
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 98) {
                            int var74 = field297.method2120();
                            int var75 = field297.method2118();
                            int var76 = field297.method2118();
                            class152 var77 = class152.method493(var74);
                            int var78 = var77.field2543 + var76;
                            int var79 = var77.field2645 + var75;
                            if (var77.field2615 != var78 || var77.field2542 != var79) {
                                var77.field2615 = var78;
                                var77.field2542 = var79;
                                method564(var77);
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 72) {
                            int var80 = field297.method2117();
                            class14 var81 = (class14) class14.field197.method3197((long) var80);
                            if (var81 != null) {
                                var81.method3321();
                            }
                            field406[++field447 - 1 & 0x1F] = var80 & 0x7FFF;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 179) {
                            method2511();
                            int var82 = field297.method2120();
                            int var83 = field297.method2140();
                            int var84 = field297.method2140();
                            field476[var84] = var82;
                            field395[var84] = var83;
                            field396[var84] = 1;
                            for (int var85 = 0; var85 < 98; var85++) {
                                if (var82 >= class140.field2137[var85]) {
                                    field396[var84] = var85 + 2;
                                }
                            }
                            field448[++field449 - 1 & 0x1F] = var84;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 21) {
                            class110 var86 = field297;
                            int var87 = field300;
                            class188 var88 = new class188();
                            var88.field2870 = var86.method2115();
                            var88.field2871 = var86.method2120();
                            var88.field2877 = new int[var88.field2870];
                            var88.field2869 = new int[var88.field2870];
                            var88.field2878 = new Field[var88.field2870];
                            var88.field2874 = new int[var88.field2870];
                            var88.field2875 = new Method[var88.field2870];
                            var88.field2876 = new byte[var88.field2870][][];
                            for (int var89 = 0; var89 < var88.field2870; var89++) {
                                try {
                                    int var90 = var86.method2115();
                                    if (var90 == 0 || var90 == 1 || var90 == 2) {
                                        String var91 = var86.method2123();
                                        String var92 = var86.method2123();
                                        int var93 = 0;
                                        if (var90 == 1) {
                                            var93 = var86.method2120();
                                        }
                                        var88.field2877[var89] = var90;
                                        var88.field2874[var89] = var93;
                                        if (class189.method522(var91).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        var88.field2878[var89] = class189.method522(var91).getDeclaredField(var92);
                                    } else if (var90 == 3 || var90 == 4) {
                                        String var94 = var86.method2123();
                                        String var95 = var86.method2123();
                                        int var96 = var86.method2115();
                                        String[] var97 = new String[var96];
                                        for (int var98 = 0; var98 < var96; var98++) {
                                            var97[var98] = var86.method2123();
                                        }
                                        String var99 = var86.method2123();
                                        byte[][] var100 = new byte[var96][];
                                        if (var90 == 3) {
                                            for (int var101 = 0; var101 < var96; var101++) {
                                                int var102 = var86.method2120();
                                                var100[var101] = new byte[var102];
                                                var86.method2300(var100[var101], 0, var102);
                                            }
                                        }
                                        var88.field2877[var89] = var90;
                                        Class[] var103 = new Class[var96];
                                        for (int var104 = 0; var104 < var96; var104++) {
                                            var103[var104] = class189.method522(var97[var104]);
                                        }
                                        Class var105 = class189.method522(var99);
                                        if (class189.method522(var94).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        Method[] var106 = class189.method522(var94).getDeclaredMethods();
                                        Method[] var107 = var106;
                                        for (int var108 = 0; var108 < var107.length; var108++) {
                                            Method var109 = var107[var108];
                                            if (var109.getName().equals(var95)) {
                                                Class[] var110 = var109.getParameterTypes();
                                                if (var103.length == var110.length) {
                                                    boolean var111 = true;
                                                    for (int var112 = 0; var112 < var103.length; var112++) {
                                                        if (var103[var112] != var110[var112]) {
                                                            var111 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (var111 && var105 == var109.getReturnType()) {
                                                        var88.field2875[var89] = var109;
                                                    }
                                                }
                                            }
                                        }
                                        var88.field2876[var89] = var100;
                                    }
                                } catch (ClassNotFoundException var388) {
                                    var88.field2869[var89] = -1;
                                } catch (SecurityException var389) {
                                    var88.field2869[var89] = -2;
                                } catch (NullPointerException var390) {
                                    var88.field2869[var89] = -3;
                                } catch (Exception var391) {
                                    var88.field2869[var89] = -4;
                                } catch (Throwable var392) {
                                    var88.field2869[var89] = -5;
                                }
                            }
                            class189.field2880.method3278(var88);
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 132) {
                            boolean var118 = field297.method2115() == 1;
                            int var119 = field297.method2120();
                            class152 var120 = class152.method493(var119);
                            if (var120.field2548 != var118) {
                                var120.field2548 = var118;
                                method564(var120);
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 205) {
                            field489 = field297.method2115();
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 163) {
                            int var121 = field297.method2120();
                            int var122 = field297.method2117();
                            if (var121 < -70000) {
                                var122 += 32768;
                            }
                            class152 var123;
                            if (var121 >= 0) {
                                var123 = class152.method493(var121);
                            } else {
                                var123 = null;
                            }
                            while (field297.field1862 < field300) {
                                int var124 = field297.method2128();
                                int var125 = field297.method2117();
                                int var126 = 0;
                                if (var125 != 0) {
                                    var126 = field297.method2115();
                                    if (var126 == 255) {
                                        var126 = field297.method2120();
                                    }
                                }
                                if (var123 != null && var124 >= 0 && var124 < var123.field2638.length) {
                                    var123.field2638[var124] = var125;
                                    var123.field2639[var124] = var126;
                                }
                                class14.method152(var122, var124, var125 - 1, var126);
                            }
                            if (var123 != null) {
                                method564(var123);
                            }
                            method2511();
                            field406[++field447 - 1 & 0x1F] = var122 & 0x7FFF;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 221) {
                            int var127 = field297.method2236();
                            Statics.field2026 = Statics.field1005.method2464(var127);
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 212) {
                            int var128 = field297.method2236();
                            class152 var129 = class152.method493(var128);
                            var129.field2568 = 3;
                            var129.field2580 = Statics.field892.field36.method2919();
                            method564(var129);
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 123) {
                            field393 = field297.method2115();
                            field473 = field297.method2115();
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 5) {
                            int var130 = field297.method2115();
                            int var131 = field297.method2204();
                            int var132 = field297.method2204();
                            Statics.field56 = var131 >> 1;
                            Statics.field892.method587(var130, var132, (var131 & 0x1) == 1);
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 174) {
                            String var133 = field297.method2123();
                            String var134 = class192.method3368(class199.method3528(class191.method136(field297)));
                            class10.method1970(6, var133, var134);
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 53) {
                            field509 = 1;
                            field451 = field443;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 255) {
                            field487 = field297.method2115();
                            if (field487 == 255) {
                                field487 = 0;
                            }
                            field488 = field297.method2115();
                            if (field488 == 255) {
                                field488 = 0;
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 24) {
                            String var135 = field297.method2123();
                            int var136 = field297.method2140();
                            int var137 = field297.method2115();
                            if (var136 >= 1 && var136 <= 8) {
                                if (var135.equalsIgnoreCase("null")) {
                                    var135 = null;
                                }
                                field387[var136 - 1] = var135;
                                field429[var136 - 1] = var137 == 0;
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 133) {
                            int var138 = field297.method2120();
                            class4 var139 = (class4) field379.method3197((long) var138);
                            if (var139 != null) {
                                method1061(var139, true);
                            }
                            if (field423 != null) {
                                method564(field423);
                                field423 = null;
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 25) {
                            int var140 = field297.method2117();
                            field477 = var140;
                            method146(var140);
                            class32.method91(field477);
                            for (int var141 = 0; var141 < 100; var141++) {
                                field344[var141] = true;
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 236) {
                            int var142 = field297.method2236();
                            int var143 = field297.method2117();
                            if (var143 == 65535) {
                                var143 = -1;
                            }
                            int var144 = field297.method2120();
                            class152 var145 = class152.method493(var144);
                            if (var145.field2535) {
                                var145.field2640 = var143;
                                var145.field2641 = var142;
                                class45 var147 = class45.method2458(var143);
                                var145.field2628 = var147.field1023;
                                var145.field2554 = var147.field1024;
                                var145.field2578 = var147.field1022;
                                var145.field2574 = var147.field1043;
                                var145.field2575 = var147.field1027;
                                var145.field2629 = var147.field1020;
                                if (var145.field2617 > 0) {
                                    var145.field2629 = var145.field2629 * 32 / var145.field2617;
                                }
                                method564(var145);
                            } else {
                                if (var143 == -1) {
                                    var145.field2568 = 0;
                                    field374 = -1;
                                    var1 = true;
                                    break label2596;
                                }
                                class45 var146 = class45.method2458(var143);
                                var145.field2568 = 4;
                                var145.field2580 = var143;
                                var145.field2628 = var146.field1023;
                                var145.field2554 = var146.field1024;
                                var145.field2629 = var146.field1020 * 100 / var142;
                                method564(var145);
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 70) {
                            int var148 = field297.method2301();
                            if (var148 == 65535) {
                                var148 = -1;
                            }
                            if (var148 == -1 && !field296) {
                                class161.method1383();
                            } else if (var148 != -1 && field491 != var148 && field490 != 0 && !field296) {
                                class161.method469(2, Statics.field1251, var148, 0, field490, false);
                            }
                            field491 = var148;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 229) {
                            int var149 = field297.method2160();
                            int var150 = field297.method2301();
                            if (var150 == 65535) {
                                var150 = -1;
                            }
                            method2888(var150, var149);
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 111) {
                            String var151 = field297.method2123();
                            long var152 = field297.method2132();
                            long var154 = (long) field297.method2117();
                            long var156 = (long) field297.method2119();
                            int var158 = field297.method2115();
                            long var159 = (var154 << 32) + var156;
                            boolean var161 = false;
                            for (int var162 = 0; var162 < 100; var162++) {
                                if (field508[var162] == var159) {
                                    var161 = true;
                                    break;
                                }
                            }
                            if (var158 <= 1 && method3470(var151)) {
                                var161 = true;
                            }
                            if (!var161 && field375 == 0) {
                                field508[field327] = var159;
                                field327 = (field327 + 1) % 100;
                                String var163 = class192.method3368(class199.method3528(class191.method136(field297)));
                                if (var158 == 2 || var158 == 3) {
                                    class10.method1315(9, class2.method597(1) + var151, var163, class198.method2559(var152));
                                } else if (var158 == 1) {
                                    class10.method1315(9, class2.method597(0) + var151, var163, class198.method2559(var152));
                                } else {
                                    class10.method1315(9, var151, var163, class198.method2559(var152));
                                }
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 103) {
                            int var164 = field297.method2301();
                            int var165 = field297.method2106();
                            int var166 = field297.method2148();
                            class152 var167 = class152.method493(var165);
                            var167.field2561 = (var166 << 16) + var164;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 69) {
                            field428 = true;
                            Statics.field999 = field297.method2115();
                            Statics.field139 = field297.method2115();
                            Statics.field1271 = field297.method2117();
                            Statics.field1576 = field297.method2115();
                            Statics.field702 = field297.method2115();
                            if (Statics.field702 >= 100) {
                                int var168 = Statics.field999 * 128 + 64;
                                int var169 = Statics.field139 * 128 + 64;
                                int var170 = method22(var168, var169, Statics.field56) - Statics.field1271;
                                int var171 = var168 - Statics.field13;
                                int var172 = var170 - Statics.field1927;
                                int var173 = var169 - Statics.field60;
                                int var174 = (int) Math.sqrt((double) (var171 * var171 + var173 * var173));
                                Statics.field1283 = (int) (Math.atan2((double) var172, (double) var174) * 325.949D) & 0x7FF;
                                Statics.field151 = (int) (Math.atan2((double) var171, (double) var173) * -325.949D) & 0x7FF;
                                if (Statics.field1283 < 128) {
                                    Statics.field1283 = 128;
                                }
                                if (Statics.field1283 > 383) {
                                    Statics.field1283 = 383;
                                }
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 31) {
                            field452 = field443;
                            if (field300 == 0) {
                                field301 = null;
                                field481 = null;
                                Statics.field224 = 0;
                                Statics.field1994 = null;
                                field374 = -1;
                                var1 = true;
                            } else {
                                field481 = field297.method2123();
                                long var175 = field297.method2132();
                                long var177 = var175;
                                String var179;
                                if (var175 <= 0L || var175 >= 6582952005840035281L) {
                                    var179 = null;
                                } else if (var175 % 37L == 0L) {
                                    var179 = null;
                                } else {
                                    int var180 = 0;
                                    for (long var181 = var175; var181 != 0L; var181 /= 37L) {
                                        var180++;
                                    }
                                    StringBuilder var183 = new StringBuilder(var180);
                                    while (var177 != 0L) {
                                        long var184 = var177;
                                        var177 /= 37L;
                                        var183.append(class198.field2954[(int) (var184 - var177 * 37L)]);
                                    }
                                    var179 = var183.reverse().toString();
                                }
                                field301 = var179;
                                Statics.field626 = field297.method2116();
                                int var186 = field297.method2115();
                                if (var186 == 255) {
                                    field374 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field224 = var186;
                                    class21[] var187 = new class21[100];
                                    for (int var188 = 0; var188 < Statics.field224; var188++) {
                                        var187[var188] = new class21();
                                        var187[var188].field570 = field297.method2123();
                                        var187[var188].field566 = class200.method583(var187[var188].field570, Statics.field298);
                                        var187[var188].field569 = field297.method2117();
                                        var187[var188].field568 = field297.method2116();
                                        field297.method2123();
                                        if (var187[var188].field570.equals(Statics.field892.field55)) {
                                            Statics.field245 = var187[var188].field568;
                                        }
                                    }
                                    boolean var189 = false;
                                    int var190 = Statics.field224;
                                    while (var190 > 0) {
                                        boolean var191 = true;
                                        var190--;
                                        for (int var192 = 0; var192 < var190; var192++) {
                                            if (var187[var192].field566.compareTo(var187[var192 + 1].field566) > 0) {
                                                class21 var193 = var187[var192];
                                                var187[var192] = var187[var192 + 1];
                                                var187[var192 + 1] = var193;
                                                var191 = false;
                                            }
                                        }
                                        if (var191) {
                                            break;
                                        }
                                    }
                                    Statics.field1994 = var187;
                                    field374 = -1;
                                    var1 = true;
                                }
                            }
                            break label2596;
                        }
                        if (field374 == 167) {
                            byte var194 = field297.method2144();
                            int var195 = field297.method2148();
                            class154.field2662[var195] = var194;
                            if (class154.field2661[var195] != var194) {
                                class154.field2661[var195] = var194;
                                method2678(var195);
                            }
                            field345[++field445 - 1 & 0x1F] = var195;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 130) {
                            int var196 = field297.method2117();
                            int var197 = field297.method2115();
                            int var198 = field297.method2117();
                            method1968(var196, var197, var198);
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 50) {
                            int var199 = field297.method2120();
                            int var200 = field297.method2301();
                            class154.field2662[var200] = var199;
                            if (class154.field2661[var200] != var199) {
                                class154.field2661[var200] = var199;
                                method2678(var200);
                            }
                            field345[++field445 - 1 & 0x1F] = var200;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 194) {
                            int var201 = field297.method2128();
                            boolean var202 = field297.method2115() == 1;
                            String var203 = "";
                            boolean var204 = false;
                            if (var202) {
                                var203 = field297.method2123();
                                if (method3470(var203)) {
                                    var204 = true;
                                }
                            }
                            String var205 = field297.method2123();
                            if (!var204) {
                                class10.method1970(var201, var203, var205);
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 2) {
                            Statics.field1821 = class117.method78(field297.method2115());
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 89) {
                            field428 = true;
                            Statics.field642 = field297.method2115();
                            Statics.field538 = field297.method2115();
                            Statics.field70 = field297.method2117();
                            Statics.field463 = field297.method2115();
                            Statics.field884 = field297.method2115();
                            if (Statics.field884 >= 100) {
                                Statics.field13 = Statics.field642 * 128 + 64;
                                Statics.field60 = Statics.field538 * 128 + 64;
                                Statics.field1927 = method22(Statics.field13, Statics.field60, Statics.field56) - Statics.field70;
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 180) {
                            int var206 = field297.method2156();
                            int var207 = field297.method2149();
                            class152 var208 = class152.method493(var206);
                            if (var208.field2568 != 1 || var208.field2580 != var207) {
                                var208.field2568 = 1;
                                var208.field2580 = var207;
                                method564(var208);
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 129) {
                            field428 = false;
                            for (int var209 = 0; var209 < 5; var209++) {
                                field503[var209] = false;
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 141) {
                            int var210 = field297.method2115();
                            int var211 = field297.method2115();
                            int var212 = field297.method2115();
                            int var213 = field297.method2115();
                            field503[var210] = true;
                            field504[var210] = var211;
                            field505[var210] = var212;
                            field358[var210] = var213;
                            field414[var210] = 0;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 184) {
                            int var214 = field297.method2120();
                            int var215 = field297.method2117();
                            if (var214 < -70000) {
                                var215 += 32768;
                            }
                            class152 var216;
                            if (var214 >= 0) {
                                var216 = class152.method493(var214);
                            } else {
                                var216 = null;
                            }
                            if (var216 != null) {
                                for (int var217 = 0; var217 < var216.field2638.length; var217++) {
                                    var216.field2638[var217] = 0;
                                    var216.field2639[var217] = 0;
                                }
                            }
                            class14.method557(var215);
                            int var218 = field297.method2117();
                            for (int var219 = 0; var219 < var218; var219++) {
                                int var220 = field297.method2140();
                                if (var220 == 255) {
                                    var220 = field297.method2120();
                                }
                                int var221 = field297.method2117();
                                if (var216 != null && var219 < var216.field2638.length) {
                                    var216.field2638[var219] = var221;
                                    var216.field2639[var219] = var220;
                                }
                                class14.method152(var215, var219, var221 - 1, var220);
                            }
                            if (var216 != null) {
                                method564(var216);
                            }
                            method2511();
                            field406[++field447 - 1 & 0x1F] = var215 & 0x7FFF;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 62) {
                            for (int var222 = 0; var222 < Statics.field1066; var222++) {
                                class46 var223 = class46.method1873(var222);
                                if (var223 != null) {
                                    class154.field2662[var222] = 0;
                                    class154.field2661[var222] = 0;
                                }
                            }
                            method2511();
                            field445 += 32;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 253) {
                            int var224 = field297.method2148();
                            int var225 = field297.method2156();
                            int var226 = field297.method2204();
                            class4 var227 = (class4) field379.method3197((long) var225);
                            if (var227 != null) {
                                method1061(var227, var227.field68 != var224);
                            }
                            method86(var225, var224, var226);
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 153) {
                            int var228 = field297.method2106();
                            String var229 = field297.method2123();
                            class152 var230 = class152.method493(var228);
                            if (!var229.equals(var230.field2583)) {
                                var230.field2583 = var229;
                                method564(var230);
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 182) {
                            int var231 = field297.method2117();
                            if (var231 == 65535) {
                                var231 = -1;
                            }
                            int var232 = field297.method2106();
                            int var233 = field297.method2117();
                            if (var233 == 65535) {
                                var233 = -1;
                            }
                            int var234 = field297.method2120();
                            for (int var235 = var233; var235 <= var231; var235++) {
                                long var236 = ((long) var234 << 32) + (long) var235;
                                class186 var238 = field460.method3197(var236);
                                if (var238 != null) {
                                    var238.method3321();
                                }
                                field460.method3191(new class179(var232), var236);
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 178) {
                            int var239 = field297.method2148();
                            int var240 = field297.method2120();
                            class152 var241 = class152.method493(var240);
                            if (var241.field2568 != 2 || var241.field2580 != var239) {
                                var241.field2568 = 2;
                                var241.field2580 = var239;
                                method564(var241);
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 113) {
                            field273 = field297.method2115();
                            if (field273 == 1) {
                                field274 = field297.method2117();
                            }
                            if (field273 >= 2 && field273 <= 6) {
                                if (field273 == 2) {
                                    field472 = 64;
                                    field262 = 64;
                                }
                                if (field273 == 3) {
                                    field472 = 0;
                                    field262 = 64;
                                }
                                if (field273 == 4) {
                                    field472 = 128;
                                    field262 = 64;
                                }
                                if (field273 == 5) {
                                    field472 = 64;
                                    field262 = 0;
                                }
                                if (field273 == 6) {
                                    field472 = 64;
                                    field262 = 128;
                                }
                                field273 = 2;
                                field276 = field297.method2117();
                                field277 = field297.method2117();
                                field370 = field297.method2115();
                            }
                            if (field273 == 10) {
                                field275 = field297.method2117();
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 6) {
                            method2778(true);
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 191) {
                            for (int var242 = 0; var242 < class154.field2661.length; var242++) {
                                if (class154.field2662[var242] != class154.field2661[var242]) {
                                    class154.field2661[var242] = class154.field2662[var242];
                                    method2678(var242);
                                    field345[++field445 - 1 & 0x1F] = var242;
                                }
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 219) {
                            for (int var243 = 0; var243 < field376.length; var243++) {
                                if (field376[var243] != null) {
                                    field376[var243].field757 = -1;
                                }
                            }
                            for (int var244 = 0; var244 < field484.length; var244++) {
                                if (field484[var244] != null) {
                                    field484[var244].field757 = -1;
                                }
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 110) {
                            int var245 = field297.method2301();
                            int var246 = field297.method2106();
                            class152 var247 = class152.method493(var246);
                            if (var247 != null && var247.field2538 == 0) {
                                if (var245 > var247.field2552 - var247.field2546) {
                                    var245 = var247.field2552 - var247.field2546;
                                }
                                if (var245 < 0) {
                                    var245 = 0;
                                }
                                if (var247.field2643 != var245) {
                                    var247.field2643 = var245;
                                    method564(var247);
                                }
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 215) {
                            method2511();
                            field426 = field297.method2118();
                            field388 = field443;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 71) {
                            method2778(false);
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 165) {
                            class22 var248 = new class22();
                            var248.field583 = field297.method2123();
                            var248.field587 = field297.method2117();
                            int var249 = field297.method2120();
                            var248.field581 = var249;
                            method1870(45);
                            Statics.field295.method2567();
                            Statics.field295 = null;
                            class28.method2419(var248);
                            field374 = -1;
                            var1 = false;
                            break label2596;
                        }
                        if (field374 == 99) {
                            Statics.field200 = field297.method2204();
                            Statics.field320 = field297.method2141();
                            while (field297.field1862 < field300) {
                                field374 = field297.method2115();
                                method2466();
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 168) {
                            int var250 = field297.method2156();
                            class152 var251 = class152.method493(var250);
                            for (int var252 = 0; var252 < var251.field2638.length; var252++) {
                                var251.field2638[var252] = -1;
                                var251.field2638[var252] = 0;
                            }
                            method564(var251);
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 243) {
                            int var253 = field297.method2117();
                            int var254 = field297.method2301();
                            int var255 = field297.method2301();
                            int var256 = field297.method2236();
                            class152 var257 = class152.method493(var256);
                            if (var257.field2628 != var255 || var257.field2554 != var254 || var257.field2629 != var253) {
                                var257.field2628 = var255;
                                var257.field2554 = var254;
                                var257.field2629 = var253;
                                method564(var257);
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 74) {
                            Statics.field320 = field297.method2115();
                            Statics.field200 = field297.method2141();
                            for (int var258 = Statics.field200; var258 < Statics.field200 + 8; var258++) {
                                for (int var259 = Statics.field320; var259 < Statics.field320 + 8; var259++) {
                                    if (field391[Statics.field56][var258][var259] != null) {
                                        field391[Statics.field56][var258][var259] = null;
                                        method1411(var258, var259);
                                    }
                                }
                            }
                            for (class15 var260 = (class15) field392.method3228(); var260 != null; var260 = (class15) field392.method3254()) {
                                if (var260.field208 >= Statics.field200 && var260.field208 < Statics.field200 + 8 && var260.field213 >= Statics.field320 && var260.field213 < Statics.field320 + 8 && Statics.field56 == var260.field215) {
                                    var260.field209 = 0;
                                }
                            }
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 152) {
                            while (field297.field1862 < field300) {
                                int var261 = field297.method2115();
                                boolean var262 = (var261 & 0x1) == 1;
                                String var263 = field297.method2123();
                                String var264 = field297.method2123();
                                field297.method2123();
                                for (int var265 = 0; var265 < field512; var265++) {
                                    class8 var266 = field513[var265];
                                    if (var262) {
                                        if (var264.equals(var266.field133)) {
                                            var266.field133 = var263;
                                            var266.field128 = var264;
                                            var263 = null;
                                            break;
                                        }
                                    } else if (var263.equals(var266.field133)) {
                                        var266.field133 = var263;
                                        var266.field128 = var264;
                                        var263 = null;
                                        break;
                                    }
                                }
                                if (var263 != null && field512 < 400) {
                                    class8 var267 = new class8();
                                    field513[field512] = var267;
                                    var267.field133 = var263;
                                    var267.field128 = var264;
                                    field512++;
                                }
                            }
                            field451 = field443;
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        if (field374 == 244) {
                            String var268 = field297.method2123();
                            Object[] var269 = new Object[var268.length() + 1];
                            for (int var270 = var268.length() - 1; var270 >= 0; var270--) {
                                if (var268.charAt(var270) == 's') {
                                    var269[var270 + 1] = field297.method2123();
                                } else {
                                    var269[var270 + 1] = Integer.valueOf(field297.method2120());
                                }
                            }
                            var269[0] = Integer.valueOf(field297.method2120());
                            class1 var271 = new class1();
                            var271.field8 = var269;
                            class32.method563(var271, 200000);
                            field374 = -1;
                            var1 = true;
                            break label2596;
                        }
                        class135.method2560("" + field374 + class2.field25 + field306 + class2.field25 + field283 + class2.field25 + field300, (Throwable) null);
                        method149();
                    } catch (IOException var393) {
                        method172();
                    } catch (Exception var394) {
                        String var274 = "" + field374 + class2.field25 + field306 + class2.field25 + field283 + class2.field25 + field300 + class2.field25 + (Statics.field1782 + Statics.field892.field779[0]) + class2.field25 + (Statics.field1859 + Statics.field892.field764[0]) + class2.field25;
                        for (int var275 = 0; var275 < field300 && var275 < 50; var275++) {
                            var274 = var274 + field297.field1857[var275] + class2.field25;
                        }
                        class135.method2560(var274, var394);
                        method149();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field263 != 30) {
            return;
        }
        while (true) {
            class188 var276 = (class188) class189.field2880.method3266();
            boolean var277;
            if (var276 == null) {
                var277 = false;
            } else {
                var277 = true;
            }
            if (!var277) {
                Object var279 = Statics.field229.field172;
                synchronized (Statics.field229.field172) {
                    if (!field253) {
                        Statics.field229.field183 = 0;
                    } else if (class127.field2022 != 0 || Statics.field229.field183 >= 40) {
                        field499.method2347(2);
                        field499.method2102(0);
                        int var280 = field499.field1862;
                        int var281 = 0;
                        for (int var282 = 0; var282 < Statics.field229.field183 && field499.field1862 - var280 < 240; var282++) {
                            var281++;
                            int var283 = Statics.field229.field179[var282];
                            if (var283 < 0) {
                                var283 = 0;
                            } else if (var283 > 502) {
                                var283 = 502;
                            }
                            int var284 = Statics.field229.field174[var282];
                            if (var284 < 0) {
                                var284 = 0;
                            } else if (var284 > 764) {
                                var284 = 764;
                            }
                            int var285 = var283 * 765 + var284;
                            if (Statics.field229.field179[var282] == -1 && Statics.field229.field174[var282] == -1) {
                                var284 = -1;
                                var283 = -1;
                                var285 = 524287;
                            }
                            if (field267 != var284 || field268 != var283) {
                                int var286 = var284 - field267;
                                field267 = var284;
                                int var287 = var283 - field268;
                                field268 = var283;
                                if (field269 < 8 && var286 >= -32 && var286 <= 31 && var287 >= -32 && var287 <= 31) {
                                    var286 += 32;
                                    var287 += 32;
                                    field499.method2275((field269 << 12) + (var286 << 6) + var287);
                                    field269 = 0;
                                } else if (field269 < 8) {
                                    field499.method2104((field269 << 19) + 8388608 + var285);
                                    field269 = 0;
                                } else {
                                    field499.method2303((field269 << 19) + -1073741824 + var285);
                                    field269 = 0;
                                }
                            } else if (field269 < 2047) {
                                field269++;
                            }
                        }
                        field499.method2143(field499.field1862 - var280);
                        if (var281 >= Statics.field229.field183) {
                            Statics.field229.field183 = 0;
                        } else {
                            Statics.field229.field183 -= var281;
                            for (int var288 = 0; var288 < Statics.field229.field183; var288++) {
                                Statics.field229.field174[var288] = Statics.field229.field174[var281 + var288];
                                Statics.field229.field179[var288] = Statics.field229.field179[var281 + var288];
                            }
                        }
                    }
                }
                if (class127.field2022 == 1 || !Statics.field171 && class127.field2022 == 4 || class127.field2022 == 2) {
                    long var290 = (class127.field2025 - field266 * -1L) / 50L;
                    if (var290 > 4095L) {
                        var290 = 4095L;
                    }
                    field266 = class127.field2025 * -1L;
                    int var292 = class127.field2015;
                    if (var292 < 0) {
                        var292 = 0;
                    } else if (var292 > 502) {
                        var292 = 502;
                    }
                    int var293 = class127.field2023;
                    if (var293 < 0) {
                        var293 = 0;
                    } else if (var293 > 764) {
                        var293 = 764;
                    }
                    int var294 = var292 * 765 + var293;
                    byte var295 = 0;
                    if (class127.field2022 == 2) {
                        var295 = 1;
                    }
                    int var296 = (int) var290;
                    field499.method2347(130);
                    field499.method2303((var295 << 19) + (var296 << 20) + var294);
                }
                if (class124.field1960 > 0) {
                    field499.method2347(78);
                    field499.method2275(0);
                    int var297 = field499.field1862;
                    long var298 = class103.method2455();
                    for (int var300 = 0; var300 < class124.field1960; var300++) {
                        long var301 = var298 - field382;
                        if (var301 > 16777215L) {
                            var301 = 16777215L;
                        }
                        field382 = var298;
                        field499.method2104((int) var301);
                        field499.method2138(class124.field1983[var300]);
                    }
                    field499.method2262(field499.field1862 - var297);
                }
                if (field254 > 0) {
                    field254--;
                }
                if (class124.field1976[96] || class124.field1976[97] || class124.field1976[98] || class124.field1976[99]) {
                    field347 = true;
                }
                if (field347 && field254 <= 0) {
                    field254 = 20;
                    field347 = false;
                    field499.method2347(11);
                    field499.method2145(field340);
                    field499.method2147(field341);
                }
                if (Statics.field696 && !field399) {
                    field399 = true;
                    field499.method2347(51);
                    field499.method2102(1);
                }
                if (!Statics.field696 && field399) {
                    field399 = false;
                    field499.method2347(51);
                    field499.method2102(0);
                }
                if (field279 && Statics.field56 != field309) {
                    method898(Statics.field188, Statics.field1119, Statics.field56, Statics.field892.field779[0], Statics.field892.field764[0]);
                } else if (Statics.field56 != field482) {
                    field482 = Statics.field56;
                    int var303 = Statics.field56;
                    int[] var304 = Statics.field2695.field1311;
                    int var305 = var304.length;
                    for (int var306 = 0; var306 < var305; var306++) {
                        var304[var306] = 0;
                    }
                    for (int var307 = 1; var307 < 103; var307++) {
                        int var308 = (103 - var307) * 2048 + 24628;
                        for (int var309 = 1; var309 < 103; var309++) {
                            if ((class6.field82[var303][var309][var307] & 0x18) == 0) {
                                Statics.field2481.method1629(var304, var308, 512, var303, var309, var307);
                            }
                            if (var303 < 3 && (class6.field82[var303 + 1][var309][var307] & 0x8) != 0) {
                                Statics.field2481.method1629(var304, var308, 512, var303 + 1, var309, var307);
                            }
                            var308 += 4;
                        }
                    }
                    int var310 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var311 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field2695.method1442();
                    for (int var312 = 1; var312 < 103; var312++) {
                        for (int var313 = 1; var313 < 103; var313++) {
                            if ((class6.field82[var303][var313][var312] & 0x18) == 0) {
                                method168(var303, var313, var312, var310, var311);
                            }
                            if (var303 < 3 && (class6.field82[var303 + 1][var313][var312] & 0x8) != 0) {
                                method168(var303 + 1, var313, var312, var310, var311);
                            }
                        }
                    }
                    field483 = 0;
                    for (int var314 = 0; var314 < 104; var314++) {
                        for (int var315 = 0; var315 < 104; var315++) {
                            int var316 = Statics.field2481.method1624(Statics.field56, var314, var315);
                            if (var316 != 0) {
                                int var317 = var316 >> 14 & 0x7FFF;
                                int var318 = class36.method93(var317).field860;
                                if (var318 >= 0) {
                                    int var319 = var314;
                                    int var320 = var315;
                                    if (var318 != 22 && var318 != 29 && var318 != 34 && var318 != 36 && var318 != 46 && var318 != 47 && var318 != 48) {
                                        int[][] var321 = field316[Statics.field56].field2953;
                                        for (int var322 = 0; var322 < 10; var322++) {
                                            int var323 = (int) (Math.random() * 4.0D);
                                            if (var323 == 0 && var319 > 0 && var319 > var314 - 3 && (var321[var319 - 1][var320] & 0x1240108) == 0) {
                                                var319--;
                                            }
                                            if (var323 == 1 && var319 < 103 && var319 < var314 + 3 && (var321[var319 + 1][var320] & 0x1240180) == 0) {
                                                var319++;
                                            }
                                            if (var323 == 2 && var320 > 0 && var320 > var315 - 3 && (var321[var319][var320 - 1] & 0x1240102) == 0) {
                                                var320--;
                                            }
                                            if (var323 == 3 && var320 < 103 && var320 < var315 + 3 && (var321[var319][var320 + 1] & 0x1240120) == 0) {
                                                var320++;
                                            }
                                        }
                                    }
                                    field486[field483] = Statics.field881[var318];
                                    field281[field483] = var319;
                                    field485[field483] = var320;
                                    field483++;
                                }
                            }
                        }
                    }
                    Statics.field1684.method1409();
                }
                if (field263 != 30) {
                    return;
                }
                method151();
                method142();
                field302++;
                if (field302 > 750) {
                    method172();
                    return;
                }
                method885();
                for (int var324 = 0; var324 < field293; var324++) {
                    int var325 = field294[var324];
                    class30 var326 = field484[var325];
                    if (var326 != null) {
                        method30(var326, var326.field699.field796);
                    }
                }
                for (int var327 = -1; var327 < field377; var327++) {
                    int var328;
                    if (var327 == -1) {
                        var328 = 2047;
                    } else {
                        var328 = field378[var327];
                    }
                    class3 var329 = field376[var328];
                    if (var329 != null && var329.field742 > 0) {
                        var329.field742--;
                        if (var329.field742 == 0) {
                            var329.field740 = null;
                        }
                    }
                }
                for (int var330 = 0; var330 < field293; var330++) {
                    int var331 = field294[var330];
                    class30 var332 = field484[var331];
                    if (var332 != null && var332.field742 > 0) {
                        var332.field742--;
                        if (var332.field742 == 0) {
                            var332.field740 = null;
                        }
                    }
                }
                field335++;
                if (field366 != 0) {
                    field365 += 20;
                    if (field365 >= 400) {
                        field366 = 0;
                    }
                }
                if (Statics.field828 != null) {
                    field425++;
                    if (field425 >= 15) {
                        method564(Statics.field828);
                        Statics.field828 = null;
                    }
                }
                class152 var333 = Statics.field230;
                class152 var334 = Statics.field176;
                Statics.field230 = null;
                Statics.field176 = null;
                field435 = null;
                field439 = false;
                field436 = false;
                field390 = 0;
                while (class124.method2056() && field390 < 128) {
                    if (field326 >= 2 && class124.field1976[82] && Statics.field2035 == 66) {
                        String var335 = "";
                        Iterator var336 = class10.field145.iterator();
                        while (var336.hasNext()) {
                            class31 var337 = (class31) var336.next();
                            var335 = var335 + var337.field706 + ':' + var337.field708 + '\n';
                        }
                        Statics.field697.setContents(new StringSelection(var335), (ClipboardOwner) null);
                    } else {
                        field418[field390] = Statics.field2035;
                        field408[field390] = Statics.field1536;
                        field390++;
                    }
                }
                method1408(field477, 0, 0, 765, 503, 0, 0);
                field443++;
                while (true) {
                    class1 var340;
                    class152 var341;
                    class152 var342;
                    do {
                        var340 = (class1) field458.method3226();
                        if (var340 == null) {
                            while (true) {
                                class1 var343;
                                class152 var344;
                                class152 var345;
                                do {
                                    var343 = (class1) field459.method3226();
                                    if (var343 == null) {
                                        while (true) {
                                            class1 var346;
                                            class152 var347;
                                            class152 var348;
                                            do {
                                                var346 = (class1) field457.method3226();
                                                if (var346 == null) {
                                                    method1955();
                                                    if (field431 != null) {
                                                        method1865();
                                                    }
                                                    if (Statics.field915 != null) {
                                                        method564(Statics.field915);
                                                        field336++;
                                                        if (class127.field2011 == 0) {
                                                            if (!field373) {
                                                                label2753: {
                                                                    label1795: {
                                                                        if (field398 != 1) {
                                                                            int var357 = field321 - 1;
                                                                            boolean var358;
                                                                            if (var357 < 0) {
                                                                                var358 = false;
                                                                            } else {
                                                                                int var359 = field404[var357];
                                                                                if (var359 >= 2000) {
                                                                                    var359 -= 2000;
                                                                                }
                                                                                if (var359 == 1007) {
                                                                                    var358 = true;
                                                                                } else {
                                                                                    var358 = false;
                                                                                }
                                                                            }
                                                                            if (!var358) {
                                                                                break label1795;
                                                                            }
                                                                        }
                                                                        if (field321 > 2) {
                                                                            method153(field260, field480);
                                                                            break label2753;
                                                                        }
                                                                    }
                                                                    if (field321 > 0) {
                                                                        int var360 = field260;
                                                                        int var361 = field480;
                                                                        class27 var362 = Statics.field2407;
                                                                        method88(var362.field643, var362.field644, var362.field645, var362.field646, var362.field648, var362.field648, var360, var361);
                                                                        Statics.field2407 = null;
                                                                    }
                                                                }
                                                            } else if (Statics.field915 == Statics.field1298 && field372 != field369) {
                                                                class152 var349 = Statics.field915;
                                                                byte var350 = 0;
                                                                if (field422 == 1 && var349.field2631 == 206) {
                                                                    var350 = 1;
                                                                }
                                                                if (var349.field2638[field372] <= 0) {
                                                                    var350 = 0;
                                                                }
                                                                int var351 = method143(var349);
                                                                boolean var352 = (var351 >> 29 & 0x1) != 0;
                                                                if (var352) {
                                                                    int var353 = field369;
                                                                    int var354 = field372;
                                                                    var349.field2638[var354] = var349.field2638[var353];
                                                                    var349.field2639[var354] = var349.field2639[var353];
                                                                    var349.field2638[var353] = -1;
                                                                    var349.field2639[var353] = 0;
                                                                } else if (var350 == 1) {
                                                                    int var355 = field369;
                                                                    int var356 = field372;
                                                                    while (var355 != var356) {
                                                                        if (var355 > var356) {
                                                                            var349.method2824(var355 - 1, var355);
                                                                            var355--;
                                                                        } else if (var355 < var356) {
                                                                            var349.method2824(var355 + 1, var355);
                                                                            var355++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var349.method2824(field372, field369);
                                                                }
                                                                field499.method2347(91);
                                                                field499.method2147(field372);
                                                                field499.method2146(field369);
                                                                field499.method2158(Statics.field915.field2536);
                                                                field499.method2138(var350);
                                                            }
                                                            field425 = 10;
                                                            class127.field2022 = 0;
                                                            Statics.field915 = null;
                                                        } else if (field336 >= 5 && (class127.field2010 > field260 + 5 || class127.field2010 < field260 - 5 || class127.field2017 * -991203695 > field480 + 5 || class127.field2017 * -991203695 < field480 - 5)) {
                                                            field373 = true;
                                                        }
                                                    }
                                                    if (class79.field1392 != -1) {
                                                        int var363 = class79.field1392;
                                                        int var364 = class79.field1393;
                                                        field499.method2347(242);
                                                        field499.method2102(5);
                                                        field499.method2146(Statics.field1859 + var364);
                                                        field499.method2137(class124.field1976[82] ? (class124.field1976[81] ? 2 : 1) : 0);
                                                        field499.method2145(Statics.field1782 + var363);
                                                        class79.field1392 = -1;
                                                        field363 = class127.field2023;
                                                        field286 = class127.field2015;
                                                        field366 = 1;
                                                        field365 = 0;
                                                        field487 = var363;
                                                        field488 = var364;
                                                    }
                                                    if (Statics.field230 != var333) {
                                                        if (var333 != null) {
                                                            method564(var333);
                                                        }
                                                        if (Statics.field230 != null) {
                                                            method564(Statics.field230);
                                                        }
                                                    }
                                                    if (Statics.field176 != var334 && field411 == field410) {
                                                        if (var334 != null) {
                                                            method564(var334);
                                                        }
                                                        if (Statics.field176 != null) {
                                                            method564(Statics.field176);
                                                        }
                                                    }
                                                    if (Statics.field176 == null) {
                                                        if (field410 > 0) {
                                                            field410--;
                                                        }
                                                    } else if (field410 < field411) {
                                                        field410++;
                                                        if (field411 == field410) {
                                                            method564(Statics.field176);
                                                        }
                                                    }
                                                    int var365 = field280 + Statics.field892.field770;
                                                    int var366 = field401 + Statics.field892.field728;
                                                    if (Statics.field73 - var365 < -500 || Statics.field73 - var365 > 500 || Statics.field58 - var366 < -500 || Statics.field58 - var366 > 500) {
                                                        Statics.field73 = var365;
                                                        Statics.field58 = var366;
                                                    }
                                                    if (Statics.field73 != var365) {
                                                        Statics.field73 += (var365 - Statics.field73) / 16;
                                                    }
                                                    if (Statics.field58 != var366) {
                                                        Statics.field58 += (var366 - Statics.field58) / 16;
                                                    }
                                                    if (class127.field2011 == 4 && Statics.field171) {
                                                        int var367 = class127.field2017 * -991203695 - field307;
                                                        field343 = var367 * 2;
                                                        field307 = var367 == -1 || var367 == 1 ? class127.field2017 * -991203695 : (field307 + class127.field2017 * -991203695) / 2;
                                                        int var368 = field501 - class127.field2010;
                                                        field342 = var368 * 2;
                                                        field501 = var368 == -1 || var368 == 1 ? class127.field2010 : (field501 + class127.field2010) / 2;
                                                    } else {
                                                        if (class124.field1976[96]) {
                                                            field342 += (-24 - field342) / 2;
                                                        } else if (class124.field1976[97]) {
                                                            field342 += (24 - field342) / 2;
                                                        } else {
                                                            field342 /= 2;
                                                        }
                                                        if (class124.field1976[98]) {
                                                            field343 += (12 - field343) / 2;
                                                        } else if (class124.field1976[99]) {
                                                            field343 += (-12 - field343) / 2;
                                                        } else {
                                                            field343 /= 2;
                                                        }
                                                        field307 = class127.field2017 * -991203695;
                                                        field501 = class127.field2010;
                                                    }
                                                    field341 = field342 / 2 + field341 & 0x7FF;
                                                    field340 += field343 / 2;
                                                    if (field340 < 128) {
                                                        field340 = 128;
                                                    }
                                                    if (field340 > 383) {
                                                        field340 = 383;
                                                    }
                                                    int var369 = Statics.field73 >> 7;
                                                    int var370 = Statics.field58 >> 7;
                                                    int var371 = method22(Statics.field73, Statics.field58, Statics.field56);
                                                    int var372 = 0;
                                                    if (var369 > 3 && var370 > 3 && var369 < 100 && var370 < 100) {
                                                        for (int var373 = var369 - 4; var373 <= var369 + 4; var373++) {
                                                            for (int var374 = var370 - 4; var374 <= var370 + 4; var374++) {
                                                                int var375 = Statics.field56;
                                                                if (var375 < 3 && (class6.field82[1][var373][var374] & 0x2) == 2) {
                                                                    var375++;
                                                                }
                                                                int var376 = var371 - class6.field81[var375][var373][var374];
                                                                if (var376 > var372) {
                                                                    var372 = var376;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var377 = var372 * 192;
                                                    if (var377 > 98048) {
                                                        var377 = 98048;
                                                    }
                                                    if (var377 < 32768) {
                                                        var377 = 32768;
                                                    }
                                                    if (var377 > field348) {
                                                        field348 += (var377 - field348) / 24;
                                                    } else if (var377 < field348) {
                                                        field348 += (var377 - field348) / 80;
                                                    }
                                                    if (field428) {
                                                        method635();
                                                    }
                                                    for (int var378 = 0; var378 < 5; var378++) {
                                                        int var10002 = field414[var378]++;
                                                    }
                                                    int var379 = class127.method566();
                                                    int var380 = class124.method132();
                                                    if (var379 > 15000 && var380 > 15000) {
                                                        field332 = 250;
                                                        class127.method1018(14500);
                                                        field499.method2347(164);
                                                    }
                                                    field419++;
                                                    if (field419 > 500) {
                                                        field419 = 0;
                                                        int var381 = (int) (Math.random() * 8.0D);
                                                        if ((var381 & 0x1) == 1) {
                                                            field280 += field322;
                                                        }
                                                        if ((var381 & 0x2) == 2) {
                                                            field401 += field324;
                                                        }
                                                        if ((var381 & 0x4) == 4) {
                                                            field407 += field304;
                                                        }
                                                    }
                                                    if (field280 < -50) {
                                                        field322 = 2;
                                                    }
                                                    if (field280 > 50) {
                                                        field322 = -2;
                                                    }
                                                    if (field401 < -55) {
                                                        field324 = 2;
                                                    }
                                                    if (field401 > 55) {
                                                        field324 = -2;
                                                    }
                                                    if (field407 < -40) {
                                                        field304 = 1;
                                                    }
                                                    if (field407 > 40) {
                                                        field304 = -1;
                                                    }
                                                    field292++;
                                                    if (field292 > 500) {
                                                        field292 = 0;
                                                        int var382 = (int) (Math.random() * 8.0D);
                                                        if ((var382 & 0x1) == 1) {
                                                            field251 += field325;
                                                        }
                                                        if ((var382 & 0x2) == 2) {
                                                            field330 += field331;
                                                        }
                                                    }
                                                    if (field251 < -60) {
                                                        field325 = 2;
                                                    }
                                                    if (field251 > 60) {
                                                        field325 = -2;
                                                    }
                                                    if (field330 < -20) {
                                                        field331 = 1;
                                                    }
                                                    if (field330 > 10) {
                                                        field331 = -1;
                                                    }
                                                    for (class34 var383 = (class34) field511.method3181(); var383 != null; var383 = (class34) field511.method3184()) {
                                                        if ((long) var383.field787 < class103.method2455() / 1000L - 5L) {
                                                            if (var383.field785 > 0) {
                                                                class10.method1970(5, "", var383.field786 + class142.field2302);
                                                            }
                                                            if (var383.field785 == 0) {
                                                                class10.method1970(5, "", var383.field786 + class142.field2303);
                                                            }
                                                            var383.method3319();
                                                        }
                                                    }
                                                    field303++;
                                                    if (field303 > 50) {
                                                        field499.method2347(107);
                                                    }
                                                    try {
                                                        if (Statics.field295 != null && field499.field1862 > 0) {
                                                            Statics.field295.method2563(field499.field1857, 0, field499.field1862);
                                                            field499.field1862 = 0;
                                                            field303 = 0;
                                                        }
                                                    } catch (IOException var385) {
                                                        method172();
                                                    }
                                                    return;
                                                }
                                                var347 = var346.field4;
                                                if (var347.field2650 < 0) {
                                                    break;
                                                }
                                                var348 = class152.method493(var347.field2547);
                                            } while (var348 == null || var348.field2644 == null || var347.field2650 >= var348.field2644.length || var348.field2644[var347.field2650] != var347);
                                            class32.method563(var346, 200000);
                                        }
                                    }
                                    var344 = var343.field4;
                                    if (var344.field2650 < 0) {
                                        break;
                                    }
                                    var345 = class152.method493(var344.field2547);
                                } while (var345 == null || var345.field2644 == null || var344.field2650 >= var345.field2644.length || var345.field2644[var344.field2650] != var344);
                                class32.method563(var343, 200000);
                            }
                        }
                        var341 = var340.field4;
                        if (var341.field2650 < 0) {
                            break;
                        }
                        var342 = class152.method493(var341.field2547);
                    } while (var342 == null || var342.field2644 == null || var341.field2650 >= var342.field2644.length || var342.field2644[var341.field2650] != var341);
                    class32.method563(var340, 200000);
                }
            }
            field499.method2347(108);
            field499.method2102(0);
            int var278 = field499.field1862;
            class189.method2961(field499);
            field499.method2143(field499.field1862 - var278);
        }
    }

    @ObfuscatedName("et.d(I)V")
    public static final void method2676() {
        if (Statics.field220 != null) {
            Statics.field220.method985();
        }
        if (Statics.field1913 != null) {
            Statics.field1913.method985();
        }
    }

    @ObfuscatedName("y.l(I)V")
    public static final void method142() {
        for (int var0 = 0; var0 < field495; var0++) {
            int var10002 = field498[var0]--;
            if (field498[var0] >= -10) {
                class52 var2 = field500[var0];
                if (var2 == null) {
                    class52 var10000 = (class52) null;
                    var2 = class52.method1047(Statics.field2766, field430[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field498[var0] += var2.method1038();
                    field500[var0] = var2;
                }
                if (field498[var0] < 0) {
                    int var9;
                    if (field506[var0] == 0) {
                        var9 = field493;
                    } else {
                        int var3 = (field506[var0] & 0xFF) * 128;
                        int var4 = field506[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field892.field770;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field506[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field892.field728;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field498[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field494 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method1037().method1072(Statics.field57);
                        class58 var11 = class58.method1190(var10, 100, var9);
                        var11.method1097(field497[var0] - 1);
                        Statics.field571.method958(var11);
                    }
                    field498[var0] = -100;
                }
            } else {
                field495--;
                for (int var1 = var0; var1 < field495; var1++) {
                    field430[var1] = field430[var1 + 1];
                    field500[var1] = field500[var1 + 1];
                    field497[var1] = field497[var1 + 1];
                    field498[var1] = field498[var1 + 1];
                    field506[var1] = field506[var1 + 1];
                }
                var0--;
            }
        }
        if (field296 && !Statics.method1972()) {
            if (field490 != 0 && field491 != -1) {
                class161.method1587(Statics.field1251, field491, 0, field490, false);
            }
            field296 = false;
        }
    }

    @ObfuscatedName("be.ag(Lav;IIII)V")
    public static void method1418(class38 arg0, int arg1, int arg2, int arg3) {
        if (field495 >= 50 || field494 == 0 || arg0.field903 == null || arg1 >= arg0.field903.length) {
            return;
        }
        int var4 = arg0.field903[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field430[field495] = var5;
        field497[field495] = var6;
        field498[field495] = 0;
        field500[field495] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field506[field495] = (var8 << 16) + (var9 << 8) + var7;
        field495++;
    }

    @ObfuscatedName("cm.au(IIII)V")
    public static void method1968(int arg0, int arg1, int arg2) {
        if (field493 == 0 || arg1 == 0 || field495 >= 50) {
            return;
        }
        field430[field495] = arg0;
        field497[field495] = arg1;
        field498[field495] = arg2;
        field500[field495] = null;
        field506[field495] = 0;
        field495++;
    }

    @ObfuscatedName("ek.ak(III)V")
    public static void method2888(int arg0, int arg1) {
        if (field490 != 0 && arg0 != -1) {
            class161.method1587(Statics.field549, arg0, 0, field490, false);
            field296 = true;
        }
    }

    @ObfuscatedName("as.aw(I)V")
    public static final void method635() {
        int var0 = Statics.field642 * 128 + 64;
        int var1 = Statics.field538 * 128 + 64;
        int var2 = method22(var0, var1, Statics.field56) - Statics.field70;
        if (Statics.field13 < var0) {
            Statics.field13 += Statics.field884 * (var0 - Statics.field13) / 1000 + Statics.field463;
            if (Statics.field13 > var0) {
                Statics.field13 = var0;
            }
        }
        if (Statics.field13 > var0) {
            Statics.field13 -= Statics.field884 * (Statics.field13 - var0) / 1000 + Statics.field463;
            if (Statics.field13 < var0) {
                Statics.field13 = var0;
            }
        }
        if (Statics.field1927 < var2) {
            Statics.field1927 += Statics.field884 * (var2 - Statics.field1927) / 1000 + Statics.field463;
            if (Statics.field1927 > var2) {
                Statics.field1927 = var2;
            }
        }
        if (Statics.field1927 > var2) {
            Statics.field1927 -= Statics.field884 * (Statics.field1927 - var2) / 1000 + Statics.field463;
            if (Statics.field1927 < var2) {
                Statics.field1927 = var2;
            }
        }
        if (Statics.field60 < var1) {
            Statics.field60 += Statics.field884 * (var1 - Statics.field60) / 1000 + Statics.field463;
            if (Statics.field60 > var1) {
                Statics.field60 = var1;
            }
        }
        if (Statics.field60 > var1) {
            Statics.field60 -= Statics.field884 * (Statics.field60 - var1) / 1000 + Statics.field463;
            if (Statics.field60 < var1) {
                Statics.field60 = var1;
            }
        }
        int var3 = Statics.field999 * 128 + 64;
        int var4 = Statics.field139 * 128 + 64;
        int var5 = method22(var3, var4, Statics.field56) - Statics.field1271;
        int var6 = var3 - Statics.field13;
        int var7 = var5 - Statics.field1927;
        int var8 = var4 - Statics.field60;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1283 < var10) {
            Statics.field1283 += Statics.field702 * (var10 - Statics.field1283) / 1000 + Statics.field1576;
            if (Statics.field1283 > var10) {
                Statics.field1283 = var10;
            }
        }
        if (Statics.field1283 > var10) {
            Statics.field1283 -= Statics.field702 * (Statics.field1283 - var10) / 1000 + Statics.field1576;
            if (Statics.field1283 < var10) {
                Statics.field1283 = var10;
            }
        }
        int var12 = var11 - Statics.field151;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field151 += Statics.field702 * var12 / 1000 + Statics.field1576;
            Statics.field151 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field151 -= Statics.field702 * -var12 / 1000 + Statics.field1576;
            Statics.field151 &= 0x7FF;
        }
        int var13 = var11 - Statics.field151;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field151 = var11;
        }
    }

    @ObfuscatedName("am.at(I)V")
    public static final void method885() {
        for (int var0 = -1; var0 < field377; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field378[var0];
            }
            class3 var2 = field376[var1];
            if (var2 != null) {
                method30(var2, 1);
            }
        }
    }

    @ObfuscatedName("t.ah(Laj;II)V")
    public static final void method30(class33 arg0, int arg1) {
        if (arg0.field771 > field265) {
            int var2 = arg0.field771 - field265;
            int var3 = arg0.field747 * 128 + arg0.field731 * 64;
            int var4 = arg0.field732 * 128 + arg0.field731 * 64;
            arg0.field770 += (var3 - arg0.field770) / var2;
            arg0.field728 += (var4 - arg0.field728) / var2;
            arg0.field783 = 0;
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
        } else if (arg0.field782 >= field265) {
            method130(arg0);
        } else {
            arg0.field778 = arg0.field775;
            if (arg0.field745 == 0) {
                arg0.field783 = 0;
            } else {
                label330: {
                    if (arg0.field757 != -1 && arg0.field760 == 0) {
                        class38 var5 = class38.method595(arg0.field757);
                        if (arg0.field784 > 0 && var5.field911 == 0) {
                            arg0.field783++;
                            break label330;
                        }
                        if (arg0.field784 <= 0 && var5.field910 == 0) {
                            arg0.field783++;
                            break label330;
                        }
                    }
                    int var6 = arg0.field770;
                    int var7 = arg0.field728;
                    int var8 = arg0.field779[arg0.field745 - 1] * 128 + arg0.field731 * 64;
                    int var9 = arg0.field764[arg0.field745 - 1] * 128 + arg0.field731 * 64;
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        if (var6 < var8) {
                            if (var7 < var9) {
                                arg0.field776 = 1280;
                            } else if (var7 > var9) {
                                arg0.field776 = 1792;
                            } else {
                                arg0.field776 = 1536;
                            }
                        } else if (var6 > var8) {
                            if (var7 < var9) {
                                arg0.field776 = 768;
                            } else if (var7 > var9) {
                                arg0.field776 = 256;
                            } else {
                                arg0.field776 = 512;
                            }
                        } else if (var7 < var9) {
                            arg0.field776 = 1024;
                        } else if (var7 > var9) {
                            arg0.field776 = 0;
                        }
                        int var10 = arg0.field776 - arg0.field729 & 0x7FF;
                        if (var10 > 1024) {
                            var10 -= 2048;
                        }
                        int var11 = arg0.field736;
                        if (var10 >= -256 && var10 <= 256) {
                            var11 = arg0.field735;
                        } else if (var10 >= 256 && var10 < 768) {
                            var11 = arg0.field738;
                        } else if (var10 >= -768 && var10 <= -256) {
                            var11 = arg0.field730;
                        }
                        if (var11 == -1) {
                            var11 = arg0.field735;
                        }
                        arg0.field778 = var11;
                        int var12 = 4;
                        boolean var13 = true;
                        if (arg0 instanceof class30) {
                            var13 = ((class30) arg0).field699.field824;
                        }
                        if (var13) {
                            if (arg0.field776 != arg0.field729 && arg0.field765 == -1 && arg0.field739 != 0) {
                                var12 = 2;
                            }
                            if (arg0.field745 > 2) {
                                var12 = 6;
                            }
                            if (arg0.field745 > 3) {
                                var12 = 8;
                            }
                            if (arg0.field783 > 0 && arg0.field745 > 1) {
                                var12 = 8;
                                arg0.field783--;
                            }
                        } else {
                            if (arg0.field745 > 1) {
                                var12 = 6;
                            }
                            if (arg0.field745 > 2) {
                                var12 = 8;
                            }
                            if (arg0.field783 > 0 && arg0.field745 > 1) {
                                var12 = 8;
                                arg0.field783--;
                            }
                        }
                        if (arg0.field743[arg0.field745 - 1]) {
                            var12 <<= 0x1;
                        }
                        if (var12 >= 8 && arg0.field778 == arg0.field735 && arg0.field769 != -1) {
                            arg0.field778 = arg0.field769;
                        }
                        if (var6 < var8) {
                            arg0.field770 += var12;
                            if (arg0.field770 > var8) {
                                arg0.field770 = var8;
                            }
                        } else if (var6 > var8) {
                            arg0.field770 -= var12;
                            if (arg0.field770 < var8) {
                                arg0.field770 = var8;
                            }
                        }
                        if (var7 < var9) {
                            arg0.field728 += var12;
                            if (arg0.field728 > var9) {
                                arg0.field728 = var9;
                            }
                        } else if (var7 > var9) {
                            arg0.field728 -= var12;
                            if (arg0.field728 < var9) {
                                arg0.field728 = var9;
                            }
                        }
                        if (arg0.field770 == var8 && arg0.field728 == var9) {
                            arg0.field745--;
                            if (arg0.field784 > 0) {
                                arg0.field784--;
                            }
                        }
                    } else {
                        arg0.field770 = var8;
                        arg0.field728 = var9;
                    }
                }
            }
        }
        if (arg0.field770 < 128 || arg0.field728 < 128 || arg0.field770 >= 13184 || arg0.field728 >= 13184) {
            arg0.field757 = -1;
            arg0.field762 = -1;
            arg0.field771 = 0;
            arg0.field782 = 0;
            arg0.field770 = arg0.field779[0] * 128 + arg0.field731 * 64;
            arg0.field728 = arg0.field764[0] * 128 + arg0.field731 * 64;
            arg0.method590();
        }
        if (Statics.field892 == arg0 && (arg0.field770 < 1536 || arg0.field728 < 1536 || arg0.field770 >= 11776 || arg0.field728 >= 11776)) {
            arg0.field757 = -1;
            arg0.field762 = -1;
            arg0.field771 = 0;
            arg0.field782 = 0;
            arg0.field770 = arg0.field779[0] * 128 + arg0.field731 * 64;
            arg0.field728 = arg0.field764[0] * 128 + arg0.field731 * 64;
            arg0.method590();
        }
        method133(arg0);
        arg0.field759 = false;
        if (arg0.field778 != -1) {
            class38 var14 = class38.method595(arg0.field778);
            if (var14 == null || var14.field906 == null) {
                arg0.field778 = -1;
            } else {
                arg0.field756++;
                if (arg0.field755 < var14.field906.length && arg0.field756 > var14.field902[arg0.field755]) {
                    arg0.field756 = 1;
                    arg0.field755++;
                    method1418(var14, arg0.field755, arg0.field770, arg0.field728);
                }
                if (arg0.field755 >= var14.field906.length) {
                    arg0.field756 = 0;
                    arg0.field755 = 0;
                    method1418(var14, arg0.field755, arg0.field770, arg0.field728);
                }
            }
        }
        if (arg0.field762 != -1 && field265 >= arg0.field772) {
            if (arg0.field763 < 0) {
                arg0.field763 = 0;
            }
            int var15 = class39.method788(arg0.field762).field934;
            if (var15 == -1) {
                arg0.field762 = -1;
            } else {
                class38 var16 = class38.method595(var15);
                if (var16 == null || var16.field906 == null) {
                    arg0.field762 = -1;
                } else {
                    arg0.field780++;
                    if (arg0.field763 < var16.field906.length && arg0.field780 > var16.field902[arg0.field763]) {
                        arg0.field780 = 1;
                        arg0.field763++;
                        method1418(var16, arg0.field763, arg0.field770, arg0.field728);
                    }
                    if (arg0.field763 >= var16.field906.length && (arg0.field763 < 0 || arg0.field763 >= var16.field906.length)) {
                        arg0.field762 = -1;
                    }
                }
            }
        }
        if (arg0.field757 != -1 && arg0.field760 <= 1) {
            class38 var17 = class38.method595(arg0.field757);
            if (var17.field911 == 1 && arg0.field784 > 0 && arg0.field771 <= field265 && arg0.field782 < field265) {
                arg0.field760 = 1;
                return;
            }
        }
        if (arg0.field757 != -1 && arg0.field760 == 0) {
            class38 var18 = class38.method595(arg0.field757);
            if (var18 == null || var18.field906 == null) {
                arg0.field757 = -1;
            } else {
                arg0.field727++;
                if (arg0.field758 < var18.field906.length && arg0.field727 > var18.field902[arg0.field758]) {
                    arg0.field727 = 1;
                    arg0.field758++;
                    method1418(var18, arg0.field758, arg0.field770, arg0.field728);
                }
                if (arg0.field758 >= var18.field906.length) {
                    arg0.field758 -= var18.field904;
                    arg0.field761++;
                    if (arg0.field761 >= var18.field912) {
                        arg0.field757 = -1;
                    } else if (arg0.field758 >= 0 && arg0.field758 < var18.field906.length) {
                        method1418(var18, arg0.field758, arg0.field770, arg0.field728);
                    } else {
                        arg0.field757 = -1;
                    }
                }
                arg0.field759 = var18.field908;
            }
        }
        if (arg0.field760 > 0) {
            arg0.field760--;
        }
    }

    @ObfuscatedName("q.aj(Laj;I)V")
    public static final void method130(class33 arg0) {
        if (field265 == arg0.field782 || arg0.field757 == -1 || arg0.field760 != 0 || arg0.field727 + 1 > class38.method595(arg0.field757).field902[arg0.field758]) {
            int var1 = arg0.field782 - arg0.field771;
            int var2 = field265 - arg0.field771;
            int var3 = arg0.field747 * 128 + arg0.field731 * 64;
            int var4 = arg0.field732 * 128 + arg0.field731 * 64;
            int var5 = arg0.field768 * 128 + arg0.field731 * 64;
            int var6 = arg0.field767 * 128 + arg0.field731 * 64;
            arg0.field770 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field728 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field783 = 0;
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
        arg0.field729 = arg0.field776;
    }

    @ObfuscatedName("w.an(Laj;I)V")
    public static final void method133(class33 arg0) {
        if (arg0.field739 == 0) {
            return;
        }
        if (arg0.field765 != -1 && arg0.field765 < 32768) {
            class30 var1 = field484[arg0.field765];
            if (var1 != null) {
                int var2 = arg0.field770 - var1.field770;
                int var3 = arg0.field728 - var1.field728;
                if (var2 != 0 || var3 != 0) {
                    arg0.field776 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field765 >= 32768) {
            int var4 = arg0.field765 - 32768;
            if (field479 == var4) {
                var4 = 2047;
            }
            class3 var5 = field376[var4];
            if (var5 != null) {
                int var6 = arg0.field770 - var5.field770;
                int var7 = arg0.field728 - var5.field728;
                if (var6 != 0 || var7 != 0) {
                    arg0.field776 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field752 != 0 || arg0.field753 != 0) && (arg0.field745 == 0 || arg0.field783 > 0)) {
            int var8 = arg0.field770 - (arg0.field752 * 64 - Statics.field1782 * 64 - Statics.field1782 * 64);
            int var9 = arg0.field728 - (arg0.field753 * 64 - Statics.field1859 * 64 - Statics.field1859 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field776 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field752 = 0;
            arg0.field753 = 0;
        }
        int var10 = arg0.field776 - arg0.field729 & 0x7FF;
        if (var10 == 0) {
            arg0.field781 = 0;
            return;
        }
        arg0.field781++;
        if (var10 > 1024) {
            arg0.field729 -= arg0.field739;
            boolean var11 = true;
            if (var10 < arg0.field739 || var10 > 2048 - arg0.field739) {
                arg0.field729 = arg0.field776;
                var11 = false;
            }
            if (arg0.field778 == arg0.field775 && (arg0.field781 > 25 || var11)) {
                if (arg0.field749 == -1) {
                    arg0.field778 = arg0.field735;
                } else {
                    arg0.field778 = arg0.field749;
                }
            }
        } else {
            arg0.field729 += arg0.field739;
            boolean var12 = true;
            if (var10 < arg0.field739 || var10 > 2048 - arg0.field739) {
                arg0.field729 = arg0.field776;
                var12 = false;
            }
            if (arg0.field778 == arg0.field775 && (arg0.field781 > 25 || var12)) {
                if (arg0.field734 == -1) {
                    arg0.field778 = arg0.field735;
                } else {
                    arg0.field778 = arg0.field734;
                }
            }
        }
        arg0.field729 &= 0x7FF;
    }

    @ObfuscatedName("cq.as(Le;III)V")
    public static void method1878(class3 arg0, int arg1, int arg2) {
        if (arg0.field757 == arg1 && arg1 != -1) {
            int var3 = class38.method595(arg1).field913;
            if (var3 == 1) {
                arg0.field758 = 0;
                arg0.field727 = 0;
                arg0.field760 = arg2;
                arg0.field761 = 0;
            }
            if (var3 == 2) {
                arg0.field761 = 0;
            }
        } else if (arg1 == -1 || arg0.field757 == -1 || class38.method595(arg1).field907 >= class38.method595(arg0.field757).field907) {
            arg0.field757 = arg1;
            arg0.field758 = 0;
            arg0.field727 = 0;
            arg0.field760 = arg2;
            arg0.field761 = 0;
            arg0.field784 = arg0.field745;
        }
    }

    @ObfuscatedName("q.ap(Ljava/lang/String;ZB)V")
    public static final void method127(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field891.method3360(arg0, 250);
        int var6 = Statics.field891.method3367(arg0, 250) * 13;
        class73.method1517(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1520(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field891.method3377(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method129(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method28(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1657.getGraphics();
            Statics.field1684.method1338(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1657.repaint();
        }
    }

    @ObfuscatedName("db.ai(Lak;B)V")
    public static final void method2343(class29 arg0) {
        if (Statics.field892.field770 >> 7 == field487 && Statics.field892.field728 >> 7 == field488) {
            field487 = 0;
        }
        int var1 = field377;
        if (class29.field690 == arg0 || class29.field693 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field690 == arg0) {
                var3 = Statics.field892;
                var4 = 33538048;
            } else if (class29.field693 == arg0) {
                var3 = field376[field328];
                var4 = field328 << 14;
            } else {
                var3 = field376[field378[var2]];
                var4 = field378[var2] << 14;
                if (class29.field692 == arg0 && field328 == field378[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method11() && !var3.field53) {
                var3.field52 = false;
                if ((field279 && field377 > 50 || field377 > 200) && class29.field690 != arg0 && var3.field778 == var3.field775) {
                    var3.field52 = true;
                }
                int var5 = var3.field770 >> 7;
                int var6 = var3.field728 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field39 == null || field265 < var3.field42 || field265 >= var3.field43) {
                        if ((var3.field770 & 0x7F) == 64 && (var3.field728 & 0x7F) == 64) {
                            if (field360 == field359[var5][var6]) {
                                continue;
                            }
                            field359[var5][var6] = field360;
                        }
                        var3.field47 = method22(var3.field770, var3.field728, Statics.field56);
                        Statics.field2481.method1606(Statics.field56, var3.field770, var3.field728, var3.field47, 60, var3, var3.field729, var4, var3.field759);
                    } else {
                        var3.field52 = false;
                        var3.field47 = method22(var3.field770, var3.field728, Statics.field56);
                        Statics.field2481.method1632(Statics.field56, var3.field770, var3.field728, var3.field47, 60, var3, var3.field729, var4, var3.field48, var3.field41, var3.field50, var3.field51);
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.av(ZB)V")
    public static final void method147(boolean arg0) {
        for (int var1 = 0; var1 < field293; var1++) {
            class30 var2 = field484[field294[var1]];
            int var3 = (field294[var1] << 14) + 536870912;
            if (var2 != null && var2.method11() && var2.field699.field815 == arg0 && var2.field699.method600()) {
                int var4 = var2.field770 >> 7;
                int var5 = var2.field728 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field731 == 1 && (var2.field770 & 0x7F) == 64 && (var2.field728 & 0x7F) == 64) {
                        if (field360 == field359[var4][var5]) {
                            continue;
                        }
                        field359[var4][var5] = field360;
                    }
                    if (!var2.field699.field816) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2481.method1606(Statics.field56, var2.field770, var2.field728, method22(var2.field770 + (var2.field731 * 64 - 64), var2.field728 + (var2.field731 * 64 - 64), Statics.field56), var2.field731 * 64 - 64 + 60, var2, var2.field729, var3, var2.field759);
                }
            }
        }
    }

    @ObfuscatedName("av.ae(I)V")
    public static final void method701() {
        for (class26 var0 = (class26) field444.method3228(); var0 != null; var0 = (class26) field444.method3254()) {
            if (Statics.field56 != var0.field630 || var0.field637) {
                var0.method3321();
            } else if (field265 >= var0.field638) {
                var0.method509(field335);
                if (var0.field637) {
                    var0.method3321();
                } else {
                    Statics.field2481.method1606(var0.field630, var0.field628, var0.field641, var0.field636, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("b.ab(Laj;IIIIII)V")
    public static final void method3(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method11()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field699;
            if (var6.field823 != null) {
                var6 = var6.method605();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field377) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field53) {
                return;
            }
            if (var8.field37 != -1 || var8.field38 != -1) {
                method491(arg0, arg0.field737 + 15);
                if (field361 > -1) {
                    if (var8.field37 != -1) {
                        Statics.field1293[var8.field37].method1434(field361 + arg2 - 12, field362 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field38 != -1) {
                        Statics.field1299[var8.field38].method1434(field361 + arg2 - 12, field362 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field273 == 10 && field275 == field378[arg1]) {
                method491(arg0, arg0.field737 + 15);
                if (field361 > -1) {
                    Statics.field1059[1].method1434(field361 + arg2 - 12, field362 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field699;
            if (var9.field823 != null) {
                var9 = var9.method605();
            }
            if (var9.field818 >= 0 && var9.field818 < Statics.field1299.length) {
                method491(arg0, arg0.field737 + 15);
                if (field361 > -1) {
                    Statics.field1299[var9.field818].method1434(field361 + arg2 - 12, field362 + arg3 - 30);
                }
            }
            if (field273 == 1 && field274 == field294[arg1 - field377] && field265 % 20 < 10) {
                method491(arg0, arg0.field737 + 15);
                if (field361 > -1) {
                    Statics.field1059[0].method1434(field361 + arg2 - 12, field362 + arg3 - 28);
                }
            }
        }
        if (arg0.field740 != null && (arg1 >= field377 || field393 == 4 || !arg0.field741 && (field393 == 0 || field393 == 3 || field393 == 1 && method148(((class3) arg0).field55, false)))) {
            method491(arg0, arg0.field737);
            if (field361 > -1 && field349 < field350) {
                field354[field349] = Statics.field1690.method3421(arg0.field740) / 2;
                field353[field349] = Statics.field1690.field2907;
                field351[field349] = field361;
                field352[field349] = field362;
                field355[field349] = arg0.field754;
                field356[field349] = arg0.field744;
                field357[field349] = arg0.field742;
                field502[field349] = arg0.field740;
                field349++;
            }
        }
        if (arg0.field751 > field265) {
            method491(arg0, arg0.field737 + 15);
            if (field361 > -1) {
                int var10;
                if (arg1 < field377) {
                    var10 = 30;
                } else {
                    class35 var11 = ((class30) arg0).field699;
                    var10 = var11.field826;
                }
                int var12 = arg0.field748 * var10 / arg0.field750;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field748 > 0) {
                    var12 = 1;
                }
                class73.method1517(field361 + arg2 - var10 / 2, field362 + arg3 - 3, var12, 5, 65280);
                class73.method1517(field361 + arg2 - var10 / 2 + var12, field362 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field777[var13] > field265) {
                method491(arg0, arg0.field737 / 2);
                if (field361 > -1) {
                    if (var13 == 1) {
                        field362 -= 20;
                    }
                    if (var13 == 2) {
                        field361 -= 15;
                        field362 -= 10;
                    }
                    if (var13 == 3) {
                        field361 += 15;
                        field362 -= 10;
                    }
                    Statics.field647[arg0.field746[var13]].method1434(field361 + arg2 - 12, field362 + arg3 - 12);
                    Statics.field533.method3371(Integer.toString(arg0.field733[var13]), field361 + arg2 - 1, field362 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("bz.az(IIIIB)V")
    public static final void method1593(int arg0, int arg1, int arg2, int arg3) {
        if (field366 == 1) {
            Statics.field700[field365 / 100].method1434(field363 - 8, field286 - 8);
        }
        if (field366 == 2) {
            Statics.field700[field365 / 100 + 4].method1434(field363 - 8, field286 - 8);
        }
        field375 = 0;
        int var4 = (Statics.field892.field770 >> 7) + Statics.field1782;
        int var5 = (Statics.field892.field728 >> 7) + Statics.field1859;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field375 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field375 = 1;
        }
        if (field375 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field375 = 0;
        }
        if (!field271) {
            return;
        }
        int var6 = arg0 + 512 - 5;
        int var7 = arg1 + 20;
        Statics.field891.method3370("Fps:" + field2058, var6, var7, 16776960, -1);
        int var11 = var7 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        int var10 = 16776960;
        if (var9 > 32768 && field279) {
            var10 = 16711680;
        }
        if (var9 > 65536 && !field279) {
            var10 = 16711680;
        }
        Statics.field891.method3370("Mem:" + var9 + "k", var6, var11, var10, -1);
        var7 = var11 + 15;
    }

    @ObfuscatedName("r.ad(Laj;IS)V")
    public static final void method491(class33 arg0, int arg1) {
        method2524(arg0.field770, arg0.field728, arg1);
    }

    @ObfuscatedName("ds.ao(IIII)V")
    public static final void method2524(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field361 = -1;
            field362 = -1;
            return;
        }
        int var3 = method22(arg0, arg1, Statics.field56) - arg2;
        int var4 = arg0 - Statics.field13;
        int var5 = var3 - Statics.field1927;
        int var6 = arg1 - Statics.field60;
        int var7 = class84.field1478[Statics.field1283];
        int var8 = class84.field1489[Statics.field1283];
        int var9 = class84.field1478[Statics.field151];
        int var10 = class84.field1489[Statics.field151];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field361 = (var11 << 9) / var15 + 256;
            field362 = (var14 << 9) / var15 + 167;
        } else {
            field361 = -1;
            field362 = -1;
        }
    }

    @ObfuscatedName("i.am(IIIB)I")
    public static final int method22(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field82[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field81[var5][var3][var4] + class6.field81[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field81[var5][var3][var4 + 1] + class6.field81[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("cf.al(IIIIIIB)V")
    public static final void method1954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class84.field1478[var6];
            int var12 = class84.field1489[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class84.field1478[var7];
            int var15 = class84.field1489[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field13 = arg0 - var8;
        Statics.field1927 = arg1 - var9;
        Statics.field60 = arg2 - var10;
        Statics.field1283 = arg3;
        Statics.field151 = arg4;
    }

    @ObfuscatedName("eh.ac(ZI)V")
    public static final void method2778(boolean arg0) {
        field317 = arg0;
        if (!field317) {
            int var1 = field297.method2149();
            int var2 = (field300 - field297.field1862) / 16;
            Statics.field829 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    Statics.field829[var3][var4] = field297.method2106();
                }
            }
            int var5 = field297.method2301();
            int var6 = field297.method2148();
            int var7 = field297.method2149();
            int var8 = field297.method2141();
            Statics.field1495 = new int[var2];
            Statics.field315 = new int[var2];
            Statics.field2067 = new int[var2];
            Statics.field66 = new byte[var2][];
            Statics.field2677 = new byte[var2][];
            boolean var9 = false;
            if ((var5 / 8 == 48 || var5 / 8 == 49) && var7 / 8 == 48) {
                var9 = true;
            }
            if (var5 / 8 == 48 && var7 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var5 - 6) / 8; var11 <= (var5 + 6) / 8; var11++) {
                for (int var12 = (var7 - 6) / 8; var12 <= (var7 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1495[var10] = var13;
                        Statics.field315[var10] = Statics.field2926.method2728("m" + var11 + "_" + var12);
                        Statics.field2067[var10] = Statics.field2926.method2728("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method898(var5, var7, var8, var1, var6);
            return;
        }
        int var14 = field297.method2148();
        int var15 = field297.method2115();
        int var16 = field297.method2117();
        field297.method2353();
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var18 = 0; var18 < 13; var18++) {
                for (int var19 = 0; var19 < 13; var19++) {
                    int var20 = field297.method2352(1);
                    if (var20 == 1) {
                        field318[var17][var18][var19] = field297.method2352(26);
                    } else {
                        field318[var17][var18][var19] = -1;
                    }
                }
            }
        }
        field297.method2377();
        int var21 = (field300 - field297.field1862) / 16;
        Statics.field829 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var23 = 0; var23 < 4; var23++) {
                Statics.field829[var22][var23] = field297.method2236();
            }
        }
        int var24 = field297.method2148();
        int var25 = field297.method2301();
        Statics.field1495 = new int[var21];
        Statics.field315 = new int[var21];
        Statics.field2067 = new int[var21];
        Statics.field66 = new byte[var21][];
        Statics.field2677 = new byte[var21][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field318[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1495[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1495[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field315[var26] = Statics.field2926.method2728("m" + var35 + "_" + var36);
                            Statics.field2067[var26] = Statics.field2926.method2728("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method898(var14, var24, var15, var25, var16);
    }

    @ObfuscatedName("al.ax(IIIIII)V")
    public static final void method898(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field188 == arg0 && Statics.field1119 == arg1 && field309 == arg2 || !field279) {
            return;
        }
        Statics.field188 = arg0;
        Statics.field1119 = arg1;
        field309 = arg2;
        if (!field279) {
            field309 = 0;
        }
        method1870(25);
        method127(class142.field2164, true);
        int var5 = Statics.field1782;
        int var6 = Statics.field1859;
        Statics.field1782 = (arg0 - 6) * 8;
        Statics.field1859 = (arg1 - 6) * 8;
        int var7 = Statics.field1782 - var5;
        int var8 = Statics.field1859 - var6;
        int var9 = Statics.field1782;
        int var10 = Statics.field1859;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field484[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field779[var13] -= var7;
                    var12.field764[var13] -= var8;
                }
                var12.field770 -= var7 * 128;
                var12.field728 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field376[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field779[var16] -= var7;
                    var15.field764[var16] -= var8;
                }
                var15.field770 -= var7 * 128;
                var15.field728 -= var8 * 128;
            }
        }
        Statics.field56 = arg2;
        Statics.field892.method587(arg3, arg4, false);
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
                        field391[var27][var23][var24] = field391[var27][var25][var26];
                    } else {
                        field391[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field392.method3228(); var28 != null; var28 = (class15) field392.method3254()) {
            var28.field208 -= var7;
            var28.field213 -= var8;
            if (var28.field208 < 0 || var28.field213 < 0 || var28.field208 >= 104 || var28.field213 >= 104) {
                var28.method3321();
            }
        }
        if (field487 != 0) {
            field487 -= var7;
            field488 -= var8;
        }
        field495 = 0;
        field428 = false;
        field482 = -1;
        field444.method3245();
        field333.method3245();
    }

    @ObfuscatedName("cc.aa(ZI)V")
    public static final void method1871(boolean arg0) {
        method2676();
        field303++;
        if (field303 < 50 && !arg0) {
            return;
        }
        field303 = 0;
        if (field438 || Statics.field295 == null) {
            return;
        }
        field499.method2347(107);
        try {
            Statics.field295.method2563(field499.field1857, 0, field499.field1862);
            field499.field1862 = 0;
        } catch (IOException var2) {
            field438 = true;
        }
    }

    @ObfuscatedName("d.aq(B)V")
    public static final void method506() {
        method1871(false);
        field310 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field66.length; var1++) {
            if (Statics.field315[var1] != -1 && Statics.field66[var1] == null) {
                Statics.field66[var1] = Statics.field2926.method2759(Statics.field315[var1], 0);
                if (Statics.field66[var1] == null) {
                    var0 = false;
                    field310++;
                }
            }
            if (Statics.field2067[var1] != -1 && Statics.field2677[var1] == null) {
                Statics.field2677[var1] = Statics.field2926.method2699(Statics.field2067[var1], 0, Statics.field829[var1]);
                if (Statics.field2677[var1] == null) {
                    var0 = false;
                    field310++;
                }
            }
        }
        if (!var0) {
            field442 = 1;
            return;
        }
        field312 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field66.length; var3++) {
            byte[] var4 = Statics.field2677[var3];
            if (var4 != null) {
                int var5 = (Statics.field1495[var3] >> 8) * 64 - Statics.field1782;
                int var6 = (Statics.field1495[var3] & 0xFF) * 64 - Statics.field1859;
                if (field317) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class107 var9 = new class107(var4);
                int var10 = -1;
                label488: while (true) {
                    int var11 = var9.method2128();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2128();
                            if (var16 == 0) {
                                continue label488;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2115() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class36 var22 = class36.method93(var10);
                                if (var19 != 22 || !field279 || var22.field851 != 0 || var22.field849 == 1 || var22.field853) {
                                    if (!var22.method643()) {
                                        field312++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2128();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2115();
                    }
                }
            }
        }
        if (!var2) {
            field442 = 2;
            return;
        }
        if (field442 != 0) {
            method127(class142.field2164 + class2.field26 + class2.field33 + 100 + "%" + class2.field24, true);
        }
        method2676();
        method481();
        method2676();
        Statics.field2481.method1595();
        method2676();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field316[var23].method3498();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field82[var24][var25][var26] = 0;
                }
            }
        }
        method2676();
        class6.method478();
        int var27 = Statics.field66.length;
        class20.method1959();
        method1871(true);
        if (!field317) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field1495[var28] >> 8) * 64 - Statics.field1782;
                int var30 = (Statics.field1495[var28] & 0xFF) * 64 - Statics.field1859;
                byte[] var31 = Statics.field66[var28];
                if (var31 != null) {
                    method2676();
                    class6.method170(var31, var29, var30, Statics.field188 * 8 - 48, Statics.field1119 * 8 - 48, field316);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field1495[var32] >> 8) * 64 - Statics.field1782;
                int var34 = (Statics.field1495[var32] & 0xFF) * 64 - Statics.field1859;
                byte[] var35 = Statics.field66[var32];
                if (var35 == null && Statics.field1119 < 800) {
                    method2676();
                    class6.method167(var33, var34, 64, 64);
                }
            }
            method1871(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field2677[var36];
                if (var37 != null) {
                    int var38 = (Statics.field1495[var36] >> 8) * 64 - Statics.field1782;
                    int var39 = (Statics.field1495[var36] & 0xFF) * 64 - Statics.field1859;
                    method2676();
                    class6.method565(var37, var38, var39, Statics.field2481, field316);
                }
            }
        }
        if (field317) {
            for (int var40 = 0; var40 < 4; var40++) {
                method2676();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        boolean var43 = false;
                        int var44 = field318[var40][var41][var42];
                        if (var44 != -1) {
                            int var45 = var44 >> 24 & 0x3;
                            int var46 = var44 >> 1 & 0x3;
                            int var47 = var44 >> 14 & 0x3FF;
                            int var48 = var44 >> 3 & 0x7FF;
                            int var49 = (var47 / 8 << 8) + var48 / 8;
                            for (int var50 = 0; var50 < Statics.field1495.length; var50++) {
                                if (Statics.field1495[var50] == var49 && Statics.field66[var50] != null) {
                                    byte[] var51 = Statics.field66[var50];
                                    int var52 = var41 * 8;
                                    int var53 = var42 * 8;
                                    int var54 = (var47 & 0x7) * 8;
                                    int var55 = (var48 & 0x7) * 8;
                                    class197[] var56 = field316;
                                    for (int var57 = 0; var57 < 8; var57++) {
                                        for (int var58 = 0; var58 < 8; var58++) {
                                            if (var52 + var57 > 0 && var52 + var57 < 103 && var53 + var58 > 0 && var53 + var58 < 103) {
                                                var56[var40].field2953[var52 + var57][var53 + var58] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class107 var59 = new class107(var51);
                                    for (int var60 = 0; var60 < 4; var60++) {
                                        for (int var61 = 0; var61 < 64; var61++) {
                                            for (int var62 = 0; var62 < 64; var62++) {
                                                if (var45 == var60 && var61 >= var54 && var61 < var54 + 8 && var62 >= var55 && var62 < var55 + 8) {
                                                    class6.method2058(var59, var40, var52 + class155.method23(var61 & 0x7, var62 & 0x7, var46), var53 + class155.method821(var61 & 0x7, var62 & 0x7, var46), 0, 0, var46);
                                                } else {
                                                    class6.method2058(var59, 0, -1, -1, 0, 0, 0);
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
                            int var63 = var40;
                            int var64 = var41 * 8;
                            int var65 = var42 * 8;
                            for (int var66 = 0; var66 < 8; var66++) {
                                for (int var67 = 0; var67 < 8; var67++) {
                                    class6.field81[var63][var64 + var66][var65 + var67] = 0;
                                }
                            }
                            if (var64 > 0) {
                                for (int var68 = 1; var68 < 8; var68++) {
                                    class6.field81[var63][var64][var65 + var68] = class6.field81[var63][var64 - 1][var65 + var68];
                                }
                            }
                            if (var65 > 0) {
                                for (int var69 = 1; var69 < 8; var69++) {
                                    class6.field81[var63][var64 + var69][var65] = class6.field81[var63][var64 + var69][var65 - 1];
                                }
                            }
                            if (var64 > 0 && class6.field81[var63][var64 - 1][var65] != 0) {
                                class6.field81[var63][var64][var65] = class6.field81[var63][var64 - 1][var65];
                            } else if (var65 > 0 && class6.field81[var63][var64][var65 - 1] != 0) {
                                class6.field81[var63][var64][var65] = class6.field81[var63][var64][var65 - 1];
                            } else if (var64 > 0 && var65 > 0 && class6.field81[var63][var64 - 1][var65 - 1] != 0) {
                                class6.field81[var63][var64][var65] = class6.field81[var63][var64 - 1][var65 - 1];
                            }
                        }
                    }
                }
            }
            for (int var70 = 0; var70 < 13; var70++) {
                for (int var71 = 0; var71 < 13; var71++) {
                    int var72 = field318[0][var70][var71];
                    if (var72 == -1) {
                        class6.method167(var70 * 8, var71 * 8, 8, 8);
                    }
                }
            }
            method1871(true);
            for (int var73 = 0; var73 < 4; var73++) {
                method2676();
                for (int var74 = 0; var74 < 13; var74++) {
                    for (int var75 = 0; var75 < 13; var75++) {
                        int var76 = field318[var73][var74][var75];
                        if (var76 != -1) {
                            int var77 = var76 >> 24 & 0x3;
                            int var78 = var76 >> 1 & 0x3;
                            int var79 = var76 >> 14 & 0x3FF;
                            int var80 = var76 >> 3 & 0x7FF;
                            int var81 = (var79 / 8 << 8) + var80 / 8;
                            for (int var82 = 0; var82 < Statics.field1495.length; var82++) {
                                if (Statics.field1495[var82] == var81 && Statics.field2677[var82] != null) {
                                    Statics.method1866(Statics.field2677[var82], var73, var74 * 8, var75 * 8, var77, (var79 & 0x7) * 8, (var80 & 0x7) * 8, var78, Statics.field2481, field316);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method1871(true);
        method481();
        method2676();
        class6.method1774(Statics.field2481, field316);
        method1871(true);
        int var83 = class6.field83;
        if (var83 > Statics.field56) {
            var83 = Statics.field56;
        }
        if (var83 < Statics.field56 - 1) {
            int var84 = Statics.field56 - 1;
        }
        if (field279) {
            Statics.field2481.method1596(class6.field83);
        } else {
            Statics.field2481.method1596(0);
        }
        for (int var85 = 0; var85 < 104; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                method1411(var85, var86);
            }
        }
        method2676();
        method1772();
        class36.field835.method3162();
        if (Statics.field941 != null) {
            field499.method2347(13);
            field499.method2303(1057001181);
        }
        if (!field317) {
            int var87 = (Statics.field188 - 6) / 8;
            int var88 = (Statics.field188 + 6) / 8;
            int var89 = (Statics.field1119 - 6) / 8;
            int var90 = (Statics.field1119 + 6) / 8;
            for (int var91 = var87 - 1; var91 <= var88 + 1; var91++) {
                for (int var92 = var89 - 1; var92 <= var90 + 1; var92++) {
                    if (var91 < var87 || var91 > var88 || var92 < var89 || var92 > var90) {
                        Statics.field2926.method2717("m" + var91 + "_" + var92);
                        Statics.field2926.method2717("l" + var91 + "_" + var92);
                    }
                }
            }
        }
        method1870(30);
        method2676();
        class6.method1879();
        field499.method2347(43);
        class131.method94();
    }

    @ObfuscatedName("a.af(IIIIIB)V")
    public static final void method168(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2481.method1620(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2481.method1603(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2695.field1311;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method93(var12);
            if (var13.field861 == -1) {
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
                class74 var14 = Statics.field957[var13.field861];
                if (var14 != null) {
                    int var15 = (var13.field854 * 4 - var14.field1327) / 2;
                    int var16 = (var13.field839 * 4 - var14.field1325) / 2;
                    var14.method1565(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field839) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2481.method1696(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2481.method1603(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method93(var21);
            if (var22.field861 != -1) {
                class74 var23 = Statics.field957[var22.field861];
                if (var23 != null) {
                    int var24 = (var22.field854 * 4 - var23.field1327) / 2;
                    int var25 = (var22.field839 * 4 - var23.field1325) / 2;
                    var23.method1565(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field839) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2695.field1311;
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
        int var29 = Statics.field2481.method1624(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method93(var30);
        if (var31.field861 == -1) {
            return;
        }
        class74 var32 = Statics.field957[var31.field861];
        if (var32 != null) {
            int var33 = (var31.field854 * 4 - var32.field1327) / 2;
            int var34 = (var31.field839 * 4 - var32.field1325) / 2;
            var32.method1565(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field839) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("da.ar(B)V")
    public static final void method2466() {
        if (field374 == 147) {
            int var0 = field297.method2115();
            int var1 = (var0 >> 4 & 0x7) + Statics.field200;
            int var2 = (var0 & 0x7) + Statics.field320;
            int var3 = field297.method2117();
            int var4 = field297.method2115();
            int var5 = field297.method2117();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var6 = var1 * 128 + 64;
                int var7 = var2 * 128 + 64;
                class26 var8 = new class26(var3, Statics.field56, var6, var7, method22(var6, var7, Statics.field56) - var4, var5, field265);
                field444.method3223(var8);
            }
        } else if (field374 == 87) {
            int var9 = field297.method2149();
            int var10 = field297.method2204();
            int var11 = (var10 >> 4 & 0x7) + Statics.field200;
            int var12 = (var10 & 0x7) + Statics.field320;
            int var13 = field297.method2301();
            if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                class25 var14 = new class25();
                var14.field624 = var13;
                var14.field621 = var9;
                if (field391[Statics.field56][var11][var12] == null) {
                    field391[Statics.field56][var11][var12] = new class177();
                }
                field391[Statics.field56][var11][var12].method3223(var14);
                method1411(var11, var12);
            }
        } else if (field374 == 0) {
            int var15 = field297.method2141();
            int var16 = (var15 >> 4 & 0x7) + Statics.field200;
            int var17 = (var15 & 0x7) + Statics.field320;
            int var18 = field297.method2117();
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                class177 var19 = field391[Statics.field56][var16][var17];
                if (var19 != null) {
                    for (class25 var20 = (class25) var19.method3228(); var20 != null; var20 = (class25) var19.method3254()) {
                        if ((var18 & 0x7FFF) == var20.field624) {
                            var20.method3321();
                            break;
                        }
                    }
                    if (var19.method3228() == null) {
                        field391[Statics.field56][var16][var17] = null;
                    }
                    method1411(var16, var17);
                }
            }
        } else if (field374 == 65) {
            int var21 = field297.method2204();
            int var22 = var21 >> 2;
            int var23 = var21 & 0x3;
            int var24 = field319[var22];
            int var25 = field297.method2204();
            int var26 = (var25 >> 4 & 0x7) + Statics.field200;
            int var27 = (var25 & 0x7) + Statics.field320;
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                method124(Statics.field56, var26, var27, var24, -1, var22, var23, 0, -1);
            }
        } else if (field374 == 60) {
            int var28 = field297.method2115();
            int var29 = (var28 >> 4 & 0x7) + Statics.field200;
            int var30 = (var28 & 0x7) + Statics.field320;
            int var31 = field297.method2117();
            int var32 = field297.method2117();
            int var33 = field297.method2117();
            if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                class177 var34 = field391[Statics.field56][var29][var30];
                if (var34 != null) {
                    for (class25 var35 = (class25) var34.method3228(); var35 != null; var35 = (class25) var34.method3254()) {
                        if ((var31 & 0x7FFF) == var35.field624 && var35.field621 == var32) {
                            var35.field621 = var33;
                            break;
                        }
                    }
                    method1411(var29, var30);
                }
            }
        } else if (field374 == 199) {
            int var36 = field297.method2115();
            int var37 = var36 >> 2;
            int var38 = var36 & 0x3;
            int var39 = field319[var37];
            int var40 = field297.method2301();
            int var41 = field297.method2115();
            int var42 = (var41 >> 4 & 0x7) + Statics.field200;
            int var43 = (var41 & 0x7) + Statics.field320;
            if (var42 >= 0 && var43 >= 0 && var42 < 103 && var43 < 103) {
                if (var39 == 0) {
                    class80 var44 = Statics.field2481.method1617(Statics.field56, var42, var43);
                    if (var44 != null) {
                        int var45 = var44.field1426 >> 14 & 0x7FFF;
                        if (var37 == 2) {
                            var44.field1433 = new class11(var45, 2, var38 + 4, Statics.field56, var42, var43, var40, false, var44.field1433);
                            var44.field1421 = new class11(var45, 2, var38 + 1 & 0x3, Statics.field56, var42, var43, var40, false, var44.field1421);
                        } else {
                            var44.field1433 = new class11(var45, var37, var38, Statics.field56, var42, var43, var40, false, var44.field1433);
                        }
                    }
                }
                if (var39 == 1) {
                    class87 var46 = Statics.field2481.method1618(Statics.field56, var42, var43);
                    if (var46 != null) {
                        int var47 = var46.field1511 >> 14 & 0x7FFF;
                        if (var37 == 4 || var37 == 5) {
                            var46.field1509 = new class11(var47, 4, var38, Statics.field56, var42, var43, var40, false, var46.field1509);
                        } else if (var37 == 6) {
                            var46.field1509 = new class11(var47, 4, var38 + 4, Statics.field56, var42, var43, var40, false, var46.field1509);
                        } else if (var37 == 7) {
                            var46.field1509 = new class11(var47, 4, (var38 + 2 & 0x3) + 4, Statics.field56, var42, var43, var40, false, var46.field1509);
                        } else if (var37 == 8) {
                            var46.field1509 = new class11(var47, 4, var38 + 4, Statics.field56, var42, var43, var40, false, var46.field1509);
                            var46.field1510 = new class11(var47, 4, (var38 + 2 & 0x3) + 4, Statics.field56, var42, var43, var40, false, var46.field1510);
                        }
                    }
                }
                if (var39 == 2) {
                    class91 var48 = Statics.field2481.method1619(Statics.field56, var42, var43);
                    if (var37 == 11) {
                        var37 = 10;
                    }
                    if (var48 != null) {
                        var48.field1575 = new class11(var48.field1574 >> 14 & 0x7FFF, var37, var38, Statics.field56, var42, var43, var40, false, var48.field1575);
                    }
                }
                if (var39 == 3) {
                    class86 var49 = Statics.field2481.method1658(Statics.field56, var42, var43);
                    if (var49 != null) {
                        var49.field1494 = new class11(var49.field1490 >> 14 & 0x7FFF, 22, var38, Statics.field56, var42, var43, var40, false, var49.field1494);
                    }
                }
            }
        } else {
            if (field374 == 54) {
                int var50 = field297.method2115();
                int var51 = (var50 >> 4 & 0x7) + Statics.field200;
                int var52 = (var50 & 0x7) + Statics.field320;
                byte var53 = field297.method2215();
                int var54 = field297.method2117();
                int var55 = field297.method2149();
                byte var56 = field297.method2299();
                byte var57 = field297.method2116();
                int var58 = field297.method2148();
                int var59 = field297.method2204();
                int var60 = var59 >> 2;
                int var61 = var59 & 0x3;
                int var62 = field319[var60];
                byte var63 = field297.method2116();
                int var64 = field297.method2117();
                class3 var65;
                if (field479 == var55) {
                    var65 = Statics.field892;
                } else {
                    var65 = field376[var55];
                }
                if (var65 != null) {
                    class36 var66 = class36.method93(var58);
                    int var67;
                    int var68;
                    if (var61 == 1 || var61 == 3) {
                        var67 = var66.field839;
                        var68 = var66.field854;
                    } else {
                        var67 = var66.field854;
                        var68 = var66.field839;
                    }
                    int var69 = (var67 >> 1) + var51;
                    int var70 = (var67 + 1 >> 1) + var51;
                    int var71 = (var68 >> 1) + var52;
                    int var72 = (var68 + 1 >> 1) + var52;
                    int[][] var73 = class6.field81[Statics.field56];
                    int var74 = var73[var69][var71] + var73[var70][var71] + var73[var69][var72] + var73[var70][var72] >> 2;
                    int var75 = (var51 << 7) + (var67 << 6);
                    int var76 = (var52 << 7) + (var68 << 6);
                    class98 var77 = var66.method645(var60, var61, var73, var75, var74, var76);
                    if (var77 != null) {
                        method124(Statics.field56, var51, var52, var62, -1, 0, 0, var64 + 1, var54 + 1);
                        var65.field42 = field265 + var64;
                        var65.field43 = field265 + var54;
                        var65.field39 = var77;
                        var65.field44 = var51 * 128 + var67 * 64;
                        var65.field46 = var52 * 128 + var68 * 64;
                        var65.field45 = var74;
                        if (var53 > var56) {
                            byte var78 = var53;
                            var53 = var56;
                            var56 = var78;
                        }
                        if (var63 > var57) {
                            byte var79 = var63;
                            var63 = var57;
                            var57 = var79;
                        }
                        var65.field48 = var51 + var53;
                        var65.field50 = var51 + var56;
                        var65.field41 = var52 + var63;
                        var65.field51 = var52 + var57;
                    }
                }
            }
            if (field374 == 105) {
                int var80 = field297.method2115();
                int var81 = (var80 >> 4 & 0x7) + Statics.field200;
                int var82 = (var80 & 0x7) + Statics.field320;
                int var83 = var81 + field297.method2116();
                int var84 = var82 + field297.method2116();
                int var85 = field297.method2118();
                int var86 = field297.method2117();
                int var87 = field297.method2115() * 4;
                int var88 = field297.method2115() * 4;
                int var89 = field297.method2117();
                int var90 = field297.method2117();
                int var91 = field297.method2115();
                int var92 = field297.method2115();
                if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104 && var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && var86 != 65535) {
                    int var93 = var81 * 128 + 64;
                    int var94 = var82 * 128 + 64;
                    int var95 = var83 * 128 + 64;
                    int var96 = var84 * 128 + 64;
                    class7 var97 = new class7(var86, Statics.field56, var93, var94, method22(var93, var94, Statics.field56) - var87, field265 + var89, field265 + var90, var91, var92, var85, var88);
                    var97.method81(var95, var96, method22(var95, var96, Statics.field56) - var88, field265 + var89);
                    field333.method3223(var97);
                }
            } else if (field374 == 88) {
                int var98 = field297.method2149();
                int var99 = field297.method2204();
                int var100 = var99 >> 2;
                int var101 = var99 & 0x3;
                int var102 = field319[var100];
                int var103 = field297.method2204();
                int var104 = (var103 >> 4 & 0x7) + Statics.field200;
                int var105 = (var103 & 0x7) + Statics.field320;
                if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104) {
                    method124(Statics.field56, var104, var105, var102, var98, var100, var101, 0, -1);
                }
            } else if (field374 == 224) {
                int var106 = field297.method2115();
                int var107 = (var106 >> 4 & 0x7) + Statics.field200;
                int var108 = (var106 & 0x7) + Statics.field320;
                int var109 = field297.method2117();
                int var110 = field297.method2115();
                int var111 = var110 >> 4 & 0xF;
                int var112 = var110 & 0x7;
                int var113 = field297.method2115();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var114 = var111 + 1;
                    if (Statics.field892.field779[0] >= var107 - var114 && Statics.field892.field779[0] <= var107 + var114 && Statics.field892.field764[0] >= var108 - var114 && Statics.field892.field764[0] <= var108 + var114 && field494 != 0 && var112 > 0 && field495 < 50) {
                        field430[field495] = var109;
                        field497[field495] = var112;
                        field498[field495] = var113;
                        field500[field495] = null;
                        field506[field495] = (var107 << 16) + (var108 << 8) + var111;
                        field495++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.bl(IIIIIIIIII)V")
    public static final void method124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field392.method3228(); var10 != null; var10 = (class15) field392.method3254()) {
            if (var10.field215 == arg0 && var10.field208 == arg1 && var10.field213 == arg2 && var10.field211 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field215 = arg0;
            var9.field211 = arg3;
            var9.field208 = arg1;
            var9.field213 = arg2;
            method2657(var9);
            field392.method3223(var9);
        }
        var9.field216 = arg4;
        var9.field217 = arg5;
        var9.field218 = arg6;
        var9.field219 = arg7;
        var9.field209 = arg8;
    }

    @ObfuscatedName("cd.bb(I)V")
    public static final void method1772() {
        for (class15 var0 = (class15) field392.method3228(); var0 != null; var0 = (class15) field392.method3254()) {
            if (var0.field209 == -1) {
                var0.field219 = 0;
                method2657(var0);
            } else {
                var0.method3321();
            }
        }
    }

    @ObfuscatedName("en.bm(La;I)V")
    public static final void method2657(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field211 == 0) {
            var1 = Statics.field2481.method1620(arg0.field215, arg0.field208, arg0.field213);
        }
        if (arg0.field211 == 1) {
            var1 = Statics.field2481.method1622(arg0.field215, arg0.field208, arg0.field213);
        }
        if (arg0.field211 == 2) {
            var1 = Statics.field2481.method1696(arg0.field215, arg0.field208, arg0.field213);
        }
        if (arg0.field211 == 3) {
            var1 = Statics.field2481.method1624(arg0.field215, arg0.field208, arg0.field213);
        }
        if (var1 != 0) {
            int var5 = Statics.field2481.method1603(arg0.field215, arg0.field208, arg0.field213, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field212 = var2;
        arg0.field214 = var3;
        arg0.field210 = var4;
    }

    @ObfuscatedName("p.bf(I)V")
    public static final void method151() {
        for (class15 var0 = (class15) field392.method3228(); var0 != null; var0 = (class15) field392.method3254()) {
            if (var0.field209 > 0) {
                var0.field209--;
            }
            if (var0.field209 != 0) {
                if (var0.field219 > 0) {
                    var0.field219--;
                }
                if (var0.field219 == 0 && var0.field208 >= 1 && var0.field213 >= 1 && var0.field208 <= 102 && var0.field213 <= 102 && (var0.field216 < 0 || class6.method21(var0.field216, var0.field217))) {
                    method1869(var0.field215, var0.field211, var0.field208, var0.field213, var0.field216, var0.field218, var0.field217);
                    var0.field219 = -1;
                    if (var0.field216 == var0.field212 && var0.field212 == -1) {
                        var0.method3321();
                    } else if (var0.field216 == var0.field212 && var0.field218 == var0.field210 && var0.field217 == var0.field214) {
                        var0.method3321();
                    }
                }
            } else if (var0.field212 < 0 || class6.method21(var0.field212, var0.field214)) {
                method1869(var0.field215, var0.field211, var0.field208, var0.field213, var0.field212, var0.field210, var0.field214);
                var0.method3321();
            }
        }
    }

    @ObfuscatedName("cc.bn(IIIIIIIB)V")
    public static final void method1869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field279 && Statics.field56 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2481.method1620(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2481.method1622(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2481.method1696(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2481.method1624(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2481.method1603(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2481.method1612(arg0, arg2, arg3);
                class36 var15 = class36.method93(var12);
                if (var15.field849 != 0) {
                    field316[arg0].method3506(arg2, arg3, var13, var14, var15.field863);
                }
            }
            if (arg1 == 1) {
                Statics.field2481.method1613(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2481.method1663(arg0, arg2, arg3);
                class36 var16 = class36.method93(var12);
                if (var16.field854 + arg2 > 103 || var16.field854 + arg3 > 103 || var16.field839 + arg2 > 103 || var16.field839 + arg3 > 103) {
                    return;
                }
                if (var16.field849 != 0) {
                    field316[arg0].method3505(arg2, arg3, var16.field854, var16.field839, var14, var16.field863);
                }
            }
            if (arg1 == 3) {
                Statics.field2481.method1615(arg0, arg2, arg3);
                class36 var17 = class36.method93(var12);
                if (var17.field849 == 1) {
                    field316[arg0].method3507(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field82[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class79 var19 = Statics.field2481;
        class197 var20 = field316[arg0];
        class36 var21 = class36.method93(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field839;
            var23 = var21.field854;
        } else {
            var22 = var21.field854;
            var23 = var21.field839;
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
        int[][] var28 = class6.field81[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field851 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field872 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class78 var34;
            if (var21.field855 == -1 && var21.field873 == null) {
                var34 = var21.method645(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field855, true, (class78) null);
            }
            var19.method1601(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field849 == 1) {
                var20.method3502(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class78 var57;
            if (var21.field855 == -1 && var21.field873 == null) {
                var57 = var21.method645(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field855, true, (class78) null);
            }
            if (var57 != null) {
                var19.method1744(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field849 != 0) {
                var20.method3500(arg2, arg3, var22, var23, var21.field863);
            }
        } else if (arg6 >= 12) {
            class78 var35;
            if (var21.field855 == -1 && var21.field873 == null) {
                var35 = var21.method645(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field855, true, (class78) null);
            }
            var19.method1744(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field849 != 0) {
                var20.method3500(arg2, arg3, var22, var23, var21.field863);
            }
        } else if (arg6 == 0) {
            class78 var36;
            if (var21.field855 == -1 && var21.field873 == null) {
                var36 = var21.method645(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field855, true, (class78) null);
            }
            var19.method1714(arg0, arg2, arg3, var29, var36, (class78) null, class6.field89[arg5], 0, var32, var33);
            if (var21.field849 != 0) {
                var20.method3521(arg2, arg3, arg6, arg5, var21.field863);
            }
        } else if (arg6 == 1) {
            class78 var37;
            if (var21.field855 == -1 && var21.field873 == null) {
                var37 = var21.method645(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field855, true, (class78) null);
            }
            var19.method1714(arg0, arg2, arg3, var29, var37, (class78) null, class6.field86[arg5], 0, var32, var33);
            if (var21.field849 != 0) {
                var20.method3521(arg2, arg3, arg6, arg5, var21.field863);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class78 var39;
            class78 var40;
            if (var21.field855 == -1 && var21.field873 == null) {
                var39 = var21.method645(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method645(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field855, true, (class78) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field855, true, (class78) null);
            }
            var19.method1714(arg0, arg2, arg3, var29, var39, var40, class6.field89[arg5], class6.field89[var38], var32, var33);
            if (var21.field849 != 0) {
                var20.method3521(arg2, arg3, arg6, arg5, var21.field863);
            }
        } else if (arg6 == 3) {
            class78 var41;
            if (var21.field855 == -1 && var21.field873 == null) {
                var41 = var21.method645(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field855, true, (class78) null);
            }
            var19.method1714(arg0, arg2, arg3, var29, var41, (class78) null, class6.field86[arg5], 0, var32, var33);
            if (var21.field849 != 0) {
                var20.method3521(arg2, arg3, arg6, arg5, var21.field863);
            }
        } else if (arg6 == 9) {
            class78 var42;
            if (var21.field855 == -1 && var21.field873 == null) {
                var42 = var21.method645(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field855, true, (class78) null);
            }
            var19.method1744(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field849 != 0) {
                var20.method3500(arg2, arg3, var22, var23, var21.field863);
            }
        } else if (arg6 == 4) {
            class78 var43;
            if (var21.field855 == -1 && var21.field873 == null) {
                var43 = var21.method645(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field855, true, (class78) null);
            }
            var19.method1604(arg0, arg2, arg3, var29, var43, (class78) null, class6.field89[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1620(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class36.method93(var45 >> 14 & 0x7FFF).field850;
            }
            class78 var46;
            if (var21.field855 == -1 && var21.field873 == null) {
                var46 = var21.method645(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field855, true, (class78) null);
            }
            var19.method1604(arg0, arg2, arg3, var29, var46, (class78) null, class6.field89[arg5], 0, class6.field91[arg5] * var44, class6.field92[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1620(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class36.method93(var48 >> 14 & 0x7FFF).field850 / 2;
            }
            class78 var49;
            if (var21.field855 == -1 && var21.field873 == null) {
                var49 = var21.method645(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field855, true, (class78) null);
            }
            var19.method1604(arg0, arg2, arg3, var29, var49, (class78) null, 256, arg5, class6.field93[arg5] * var47, class6.field95[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class78 var51;
            if (var21.field855 == -1 && var21.field873 == null) {
                var51 = var21.method645(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field855, true, (class78) null);
            }
            var19.method1604(arg0, arg2, arg3, var29, var51, (class78) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1620(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class36.method93(var53 >> 14 & 0x7FFF).field850 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class78 var55;
            class78 var56;
            if (var21.field855 == -1 && var21.field873 == null) {
                var55 = var21.method645(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method645(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field855, true, (class78) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field855, true, (class78) null);
            }
            var19.method1604(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field93[arg5] * var52, class6.field95[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("be.bi(III)V")
    public static final void method1411(int arg0, int arg1) {
        class177 var2 = field391[Statics.field56][arg0][arg1];
        if (var2 == null) {
            Statics.field2481.method1616(Statics.field56, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3228(); var6 != null; var6 = (class25) var2.method3254()) {
            class45 var7 = class45.method2458(var6.field624);
            long var8 = (long) var7.field1029;
            if (var7.field1028 == 1) {
                var8 = (long) (var6.field621 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2481.method1616(Statics.field56, arg0, arg1);
            return;
        }
        var2.method3224(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3228(); var12 != null; var12 = (class25) var2.method3254()) {
            if (var5.field624 != var12.field624) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field624 != var12.field624 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2481.method1602(Statics.field56, arg0, arg1, method22(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field56), var5, var13, var10, var11);
    }

    @ObfuscatedName("de.bp(I)V")
    public static final void method2422() {
        field384 = 0;
        field323 = 0;
        field297.method2353();
        int var0 = field297.method2352(1);
        if (var0 != 0) {
            int var1 = field297.method2352(2);
            if (var1 == 0) {
                field380[++field323 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field297.method2352(3);
                Statics.field892.method586(var2, false);
                int var3 = field297.method2352(1);
                if (var3 == 1) {
                    field380[++field323 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field297.method2352(3);
                Statics.field892.method586(var4, true);
                int var5 = field297.method2352(3);
                Statics.field892.method586(var5, true);
                int var6 = field297.method2352(1);
                if (var6 == 1) {
                    field380[++field323 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field297.method2352(1);
                if (var7 == 1) {
                    field380[++field323 - 1] = 2047;
                }
                int var8 = field297.method2352(7);
                int var9 = field297.method2352(1);
                int var10 = field297.method2352(7);
                Statics.field56 = field297.method2352(2);
                Statics.field892.method587(var8, var10, var9 == 1);
            }
        }
        method2878();
        method1868();
        method2686();
        for (int var11 = 0; var11 < field384; var11++) {
            int var12 = field385[var11];
            if (field265 != field376[var12].field774) {
                field376[var12] = null;
            }
        }
        if (field300 != field297.field1862) {
            throw new RuntimeException(field297.field1862 + class2.field25 + field300);
        }
        for (int var13 = 0; var13 < field377; var13++) {
            if (field376[field378[var13]] == null) {
                throw new RuntimeException(var13 + class2.field25 + field377);
            }
        }
    }

    @ObfuscatedName("ea.bh(I)V")
    public static final void method2878() {
        int var0 = field297.method2352(8);
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
            class3 var4 = field376[var3];
            int var5 = field297.method2352(1);
            if (var5 == 0) {
                field378[++field377 - 1] = var3;
                var4.field774 = field265;
            } else {
                int var6 = field297.method2352(2);
                if (var6 == 0) {
                    field378[++field377 - 1] = var3;
                    var4.field774 = field265;
                    field380[++field323 - 1] = var3;
                } else if (var6 == 1) {
                    field378[++field377 - 1] = var3;
                    var4.field774 = field265;
                    int var7 = field297.method2352(3);
                    var4.method586(var7, false);
                    int var8 = field297.method2352(1);
                    if (var8 == 1) {
                        field380[++field323 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field378[++field377 - 1] = var3;
                    var4.field774 = field265;
                    int var9 = field297.method2352(3);
                    var4.method586(var9, true);
                    int var10 = field297.method2352(3);
                    var4.method586(var10, true);
                    int var11 = field297.method2352(1);
                    if (var11 == 1) {
                        field380[++field323 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field385[++field384 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("cc.bq(I)V")
    public static final void method1868() {
        while (true) {
            if (field297.method2362(field300) >= 11) {
                int var0 = field297.method2352(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field376[var0] == null) {
                        field376[var0] = new class3();
                        if (field371[var0] != null) {
                            field376[var0].method10(field371[var0]);
                        }
                        var1 = true;
                    }
                    field378[++field377 - 1] = var0;
                    class3 var2 = field376[var0];
                    var2.field774 = field265;
                    int var3 = field297.method2352(1);
                    int var4 = field297.method2352(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field389[field297.method2352(3)];
                    if (var1) {
                        var2.field776 = var2.field729 = var5;
                    }
                    int var6 = field297.method2352(1);
                    if (var6 == 1) {
                        field380[++field323 - 1] = var0;
                    }
                    int var7 = field297.method2352(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.method587(Statics.field892.field779[0] + var4, Statics.field892.field764[0] + var7, var3 == 1);
                    continue;
                }
            }
            field297.method2377();
            return;
        }
    }

    @ObfuscatedName("ez.bc(B)V")
    public static final void method2686() {
        for (int var0 = 0; var0 < field323; var0++) {
            int var1 = field380[var0];
            class3 var2 = field376[var1];
            int var3 = field297.method2115();
            if ((var3 & 0x40) != 0) {
                var3 += field297.method2115() << 8;
            }
            method1971(var1, var2, var3);
        }
    }

    @ObfuscatedName("cr.bw(ILe;II)V")
    public static final void method1971(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x100) != 0) {
            arg1.field747 = field297.method2204();
            arg1.field732 = field297.method2204();
            arg1.field768 = field297.method2115();
            arg1.field767 = field297.method2204();
            arg1.field771 = field297.method2149() + field265;
            arg1.field782 = field297.method2148() + field265;
            arg1.field773 = field297.method2115();
            arg1.field745 = 1;
            arg1.field784 = 0;
        }
        if ((arg2 & 0x4) != 0) {
            arg1.field752 = field297.method2301();
            arg1.field753 = field297.method2148();
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field762 = field297.method2148();
            int var3 = field297.method2156();
            arg1.field766 = var3 >> 16;
            arg1.field772 = (var3 & 0xFFFF) + field265;
            arg1.field763 = 0;
            arg1.field780 = 0;
            if (arg1.field772 > field265) {
                arg1.field763 = -1;
            }
            if (arg1.field762 == 65535) {
                arg1.field762 = -1;
            }
        }
        if ((arg2 & 0x80) != 0) {
            int var4 = field297.method2149();
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = field297.method2140();
            method1878(arg1, var4, var5);
        }
        if ((arg2 & 0x20) != 0) {
            int var6 = field297.method2140();
            byte[] var7 = new byte[var6];
            class107 var8 = new class107(var7);
            field297.method2300(var7, 0, var6);
            field371[arg0] = var8;
            arg1.method10(var8);
        }
        if ((arg2 & 0x10) != 0) {
            int var9 = field297.method2149();
            int var10 = field297.method2140();
            arg1.method588(var9, var10, field265);
            arg1.field751 = field265 + 300;
            arg1.field748 = field297.method2140();
            arg1.field750 = field297.method2141();
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field740 = field297.method2123();
            if (arg1.field740.charAt(0) == '~') {
                arg1.field740 = arg1.field740.substring(1);
                class10.method1970(2, arg1.field55, arg1.field740);
            } else if (Statics.field892 == arg1) {
                class10.method1970(2, arg1.field55, arg1.field740);
            }
            arg1.field741 = false;
            arg1.field754 = 0;
            arg1.field744 = 0;
            arg1.field742 = 150;
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field765 = field297.method2148();
            if (arg1.field765 == 65535) {
                arg1.field765 = -1;
            }
        }
        if ((arg2 & 0x1) != 0) {
            int var11 = field297.method2117();
            int var12 = field297.method2204();
            boolean var13 = field297.method2204() == 1;
            int var14 = field297.method2204();
            int var15 = field297.field1862;
            if (arg1.field55 != null && arg1.field36 != null) {
                boolean var16 = false;
                if (var12 <= 1 && method3470(arg1.field55)) {
                    var16 = true;
                }
                if (!var16 && field375 == 0 && !arg1.field53) {
                    field299.field1862 = 0;
                    field297.method2201(field299.field1857, 0, var14);
                    field299.field1862 = 0;
                    String var17 = class192.method3368(class199.method3528(class191.method136(field299)));
                    arg1.field740 = var17.trim();
                    arg1.field754 = var11 >> 8;
                    arg1.field744 = var11 & 0xFF;
                    arg1.field742 = 150;
                    arg1.field741 = var13;
                    if (var12 == 2 || var12 == 3) {
                        class10.method1970(var13 ? 91 : 1, class2.method597(1) + arg1.field55, var17);
                    } else if (var12 == 1) {
                        class10.method1970(var13 ? 91 : 1, class2.method597(0) + arg1.field55, var17);
                    } else {
                        class10.method1970(var13 ? 90 : 2, arg1.field55, var17);
                    }
                }
            }
            field297.field1862 = var14 + var15;
        }
        if ((arg2 & 0x400) == 0) {
            return;
        }
        int var18 = field297.method2149();
        int var19 = field297.method2115();
        arg1.method588(var18, var19, field265);
        arg1.field751 = field265 + 300;
        arg1.field748 = field297.method2115();
        arg1.field750 = field297.method2204();
    }

    @ObfuscatedName("z.bg(B)V")
    public static final void method33() {
        field384 = 0;
        field323 = 0;
        method569();
        while (field297.method2362(field300) >= 27) {
            int var0 = field297.method2352(15);
            if (var0 == 32767) {
                break;
            }
            boolean var4 = false;
            if (field484[var0] == null) {
                field484[var0] = new class30();
                var4 = true;
            }
            class30 var5 = field484[var0];
            field294[++field293 - 1] = var0;
            var5.field774 = field265;
            int var6 = field297.method2352(5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = field297.method2352(1);
            int var8 = field297.method2352(5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var5.field699 = class35.method479(field297.method2352(14));
            int var9 = field297.method2352(1);
            if (var9 == 1) {
                field380[++field323 - 1] = var0;
            }
            int var10 = field389[field297.method2352(3)];
            if (var4) {
                var5.field776 = var5.field729 = var10;
            }
            var5.field731 = var5.field699.field796;
            var5.field739 = var5.field699.field819;
            if (var5.field739 == 0) {
                var5.field729 = 0;
            }
            var5.field735 = var5.field699.field802;
            var5.field736 = var5.field699.field803;
            var5.field730 = var5.field699.field804;
            var5.field738 = var5.field699.field791;
            var5.field775 = var5.field699.field797;
            var5.field749 = var5.field699.field800;
            var5.field734 = var5.field699.field801;
            var5.method587(Statics.field892.field779[0] + var8, Statics.field892.field764[0] + var6, var7 == 1);
        }
        field297.method2377();
        method2879();
        for (int var1 = 0; var1 < field384; var1++) {
            int var2 = field385[var1];
            if (field265 != field484[var2].field774) {
                field484[var2].field699 = null;
                field484[var2] = null;
            }
        }
        if (field300 != field297.field1862) {
            throw new RuntimeException(field297.field1862 + class2.field25 + field300);
        }
        for (int var3 = 0; var3 < field293; var3++) {
            if (field484[field294[var3]] == null) {
                throw new RuntimeException(var3 + class2.field25 + field293);
            }
        }
    }

    @ObfuscatedName("at.bt(I)V")
    public static final void method569() {
        field297.method2353();
        int var0 = field297.method2352(8);
        if (var0 < field293) {
            for (int var1 = var0; var1 < field293; var1++) {
                field385[++field384 - 1] = field294[var1];
            }
        }
        if (var0 > field293) {
            throw new RuntimeException("");
        }
        field293 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field294[var2];
            class30 var4 = field484[var3];
            int var5 = field297.method2352(1);
            if (var5 == 0) {
                field294[++field293 - 1] = var3;
                var4.field774 = field265;
            } else {
                int var6 = field297.method2352(2);
                if (var6 == 0) {
                    field294[++field293 - 1] = var3;
                    var4.field774 = field265;
                    field380[++field323 - 1] = var3;
                } else if (var6 == 1) {
                    field294[++field293 - 1] = var3;
                    var4.field774 = field265;
                    int var7 = field297.method2352(3);
                    var4.method586(var7, false);
                    int var8 = field297.method2352(1);
                    if (var8 == 1) {
                        field380[++field323 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field294[++field293 - 1] = var3;
                    var4.field774 = field265;
                    int var9 = field297.method2352(3);
                    var4.method586(var9, true);
                    int var10 = field297.method2352(3);
                    var4.method586(var10, true);
                    int var11 = field297.method2352(1);
                    if (var11 == 1) {
                        field380[++field323 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field385[++field384 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ea.bk(I)V")
    public static final void method2879() {
        for (int var0 = 0; var0 < field323; var0++) {
            int var1 = field380[var0];
            class30 var2 = field484[var1];
            int var3 = field297.method2115();
            if ((var3 & 0x10) != 0) {
                var2.field752 = field297.method2149();
                var2.field753 = field297.method2149();
            }
            if ((var3 & 0x1) != 0) {
                var2.field762 = field297.method2149();
                int var4 = field297.method2120();
                var2.field766 = var4 >> 16;
                var2.field772 = (var4 & 0xFFFF) + field265;
                var2.field763 = 0;
                var2.field780 = 0;
                if (var2.field772 > field265) {
                    var2.field763 = -1;
                }
                if (var2.field762 == 65535) {
                    var2.field762 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field699 = class35.method479(field297.method2117());
                var2.field731 = var2.field699.field796;
                var2.field739 = var2.field699.field819;
                var2.field735 = var2.field699.field802;
                var2.field736 = var2.field699.field803;
                var2.field730 = var2.field699.field804;
                var2.field738 = var2.field699.field791;
                var2.field775 = var2.field699.field797;
                var2.field749 = var2.field699.field800;
                var2.field734 = var2.field699.field801;
            }
            if ((var3 & 0x8) != 0) {
                var2.field740 = field297.method2123();
                var2.field742 = 100;
            }
            if ((var3 & 0x2) != 0) {
                var2.field765 = field297.method2149();
                if (var2.field765 == 65535) {
                    var2.field765 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var5 = field297.method2301();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = field297.method2115();
                if (var2.field757 == var5 && var5 != -1) {
                    int var7 = class38.method595(var5).field913;
                    if (var7 == 1) {
                        var2.field758 = 0;
                        var2.field727 = 0;
                        var2.field760 = var6;
                        var2.field761 = 0;
                    }
                    if (var7 == 2) {
                        var2.field761 = 0;
                    }
                } else if (var5 == -1 || var2.field757 == -1 || class38.method595(var5).field907 >= class38.method595(var2.field757).field907) {
                    var2.field757 = var5;
                    var2.field758 = 0;
                    var2.field727 = 0;
                    var2.field760 = var6;
                    var2.field761 = 0;
                    var2.field784 = var2.field745;
                }
            }
            if ((var3 & 0x40) != 0) {
                int var8 = field297.method2140();
                int var9 = field297.method2115();
                var2.method588(var8, var9, field265);
                var2.field751 = field265 + 300;
                var2.field748 = field297.method2301();
                var2.field750 = field297.method2148();
            }
            if ((var3 & 0x80) != 0) {
                int var10 = field297.method2204();
                int var11 = field297.method2141();
                var2.method588(var10, var11, field265);
                var2.field751 = field265 + 300;
                var2.field748 = field297.method2148();
                var2.field750 = field297.method2117();
            }
        }
    }

    @ObfuscatedName("n.by(III)V")
    public static final void method179(int arg0, int arg1) {
        if (field321 < 2 && field412 == 0 && !field314) {
            return;
        }
        String var2;
        if (field412 == 1 && field321 < 2) {
            var2 = class142.field2348 + class142.field2315 + field413 + " " + class2.field21;
        } else if (field314 && field321 < 2) {
            var2 = field417 + class142.field2315 + field287 + " " + class2.field21;
        } else {
            int var3 = field321 - 1;
            String var4;
            if (field397[var3].length() > 0) {
                var4 = field475[var3] + class142.field2315 + field397[var3];
            } else {
                var4 = field475[var3];
            }
            var2 = var4;
        }
        if (field321 > 2) {
            var2 = var2 + Statics.method558(16777215) + " " + '/' + " " + (field321 - 2) + class142.field2309;
        }
        Statics.field1690.method3376(var2, arg0 + 4, arg1 + 15, 16777215, 0, field265 / 1000);
    }

    @ObfuscatedName("q.bo(IIIII)V")
    public static final void method129(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field461; var4++) {
            if (field468[var4] + field466[var4] > arg0 && field466[var4] < arg0 + arg2 && field469[var4] + field467[var4] > arg1 && field467[var4] < arg1 + arg3) {
                field344[var4] = true;
            }
        }
    }

    @ObfuscatedName("i.bs(IIIII)V")
    public static final void method28(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field461; var4++) {
            if (field468[var4] + field466[var4] > arg0 && field466[var4] < arg0 + arg2 && field469[var4] + field467[var4] > arg1 && field467[var4] < arg1 + arg3) {
                field464[var4] = true;
            }
        }
    }

    @ObfuscatedName("ce.bv(B)V")
    public static final void method1955() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field321 - 1; var1++) {
                if (field404[var1] < 1000 && field404[var1 + 1] > 1000) {
                    String var2 = field397[var1];
                    field397[var1] = field397[var1 + 1];
                    field397[var1 + 1] = var2;
                    String var3 = field475[var1];
                    field475[var1] = field475[var1 + 1];
                    field475[var1 + 1] = var3;
                    int var4 = field404[var1];
                    field404[var1] = field404[var1 + 1];
                    field404[var1 + 1] = var4;
                    int var5 = field402[var1];
                    field402[var1] = field402[var1 + 1];
                    field402[var1 + 1] = var5;
                    int var6 = field471[var1];
                    field471[var1] = field471[var1 + 1];
                    field471[var1 + 1] = var6;
                    int var7 = field405[var1];
                    field405[var1] = field405[var1 + 1];
                    field405[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field915 != null || field431 != null) {
            return;
        }
        int var8 = class127.field2022;
        if (!field278) {
            int var26;
            int var27;
            label274: {
                if ((var8 == 1 || !Statics.field171 && var8 == 4) && field321 > 0) {
                    int var25 = field404[field321 - 1];
                    if (var25 == 39 || var25 == 40 || var25 == 41 || var25 == 42 || var25 == 43 || var25 == 33 || var25 == 34 || var25 == 35 || var25 == 36 || var25 == 37 || var25 == 38 || var25 == 1005) {
                        var26 = field402[field321 - 1];
                        var27 = field471[field321 - 1];
                        class152 var28 = class152.method493(var27);
                        int var29 = method143(var28);
                        boolean var30 = (var29 >> 28 & 0x1) != 0;
                        if (var30) {
                            break label274;
                        }
                        int var31 = method143(var28);
                        boolean var32 = (var31 >> 29 & 0x1) != 0;
                        if (var32) {
                            break label274;
                        }
                    }
                }
                if (var8 == 1 || !Statics.field171 && var8 == 4) {
                    label265: {
                        if (field398 != 1 || field321 <= 2) {
                            int var39 = field321 - 1;
                            boolean var40;
                            if (var39 < 0) {
                                var40 = false;
                            } else {
                                int var41 = field404[var39];
                                if (var41 >= 2000) {
                                    var41 -= 2000;
                                }
                                if (var41 == 1007) {
                                    var40 = true;
                                } else {
                                    var40 = false;
                                }
                            }
                            if (!var40) {
                                break label265;
                            }
                        }
                        var8 = 2;
                    }
                }
                if ((var8 == 1 || !Statics.field171 && var8 == 4) && field321 > 0) {
                    int var42 = field321 - 1;
                    if (var42 >= 0) {
                        int var43 = field402[var42];
                        int var44 = field471[var42];
                        int var45 = field404[var42];
                        int var46 = field405[var42];
                        String var47 = field475[var42];
                        String var48 = field397[var42];
                        method88(var43, var44, var45, var46, var47, var48, class127.field2023, class127.field2015);
                    }
                }
                if (var8 == 2 && field321 > 0) {
                    method153(class127.field2023, class127.field2015);
                }
                return;
            }
            if (Statics.field915 != null && !field373 && field398 != 1) {
                int var33 = field321 - 1;
                boolean var34;
                if (var33 < 0) {
                    var34 = false;
                } else {
                    int var35 = field404[var33];
                    if (var35 >= 2000) {
                        var35 -= 2000;
                    }
                    if (var35 == 1007) {
                        var34 = true;
                    } else {
                        var34 = false;
                    }
                }
                if (!var34 && field321 > 0) {
                    int var36 = field260;
                    int var37 = field480;
                    class27 var38 = Statics.field2407;
                    method88(var38.field643, var38.field644, var38.field645, var38.field646, var38.field648, var38.field648, var36, var37);
                    Statics.field2407 = null;
                }
            }
            field373 = false;
            field336 = 0;
            if (Statics.field915 != null) {
                method564(Statics.field915);
            }
            Statics.field915 = class152.method493(var27);
            field369 = var26;
            field260 = class127.field2023;
            field480 = class127.field2015;
            if (field321 > 0) {
                method676(field321 - 1);
            }
            method564(Statics.field915);
            return;
        }
        if (var8 != 1 && (Statics.field171 || var8 != 4)) {
            int var9 = class127.field2010;
            int var10 = class127.field2017 * -991203695;
            if (var9 < Statics.field32 - 10 || var9 > Statics.field32 + Statics.field1513 + 10 || var10 < Statics.field64 - 10 || var10 > Statics.field64 + Statics.field1429 + 10) {
                field278 = false;
                method129(Statics.field32, Statics.field64, Statics.field1513, Statics.field1429);
            }
        }
        if (var8 != 1 && Statics.field171 || var8 != 4) {
            return;
        }
        int var11 = Statics.field32;
        int var12 = Statics.field64;
        int var13 = Statics.field1513;
        int var14 = class127.field2023;
        int var15 = class127.field2015;
        int var16 = -1;
        for (int var17 = 0; var17 < field321; var17++) {
            int var18 = (field321 - 1 - var17) * 15 + var12 + 31;
            if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                var16 = var17;
            }
        }
        if (var16 != -1 && var16 >= 0) {
            int var19 = field402[var16];
            int var20 = field471[var16];
            int var21 = field404[var16];
            int var22 = field405[var16];
            String var23 = field475[var16];
            String var24 = field397[var16];
            method88(var19, var20, var21, var22, var23, var24, class127.field2023, class127.field2015);
        }
        field278 = false;
        method129(Statics.field32, Statics.field64, Statics.field1513, Statics.field1429);
    }

    @ObfuscatedName("p.be(IIS)V")
    public static final void method153(int arg0, int arg1) {
        int var2 = Statics.field1690.method3421(class142.field2308);
        for (int var3 = 0; var3 < field321; var3++) {
            class193 var4 = Statics.field1690;
            String var5;
            if (field397[var3].length() > 0) {
                var5 = field475[var3] + class142.field2315 + field397[var3];
            } else {
                var5 = field475[var3];
            }
            int var6 = var4.method3421(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field321 * 15 + 21;
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
        field278 = true;
        Statics.field32 = var8;
        Statics.field64 = var9;
        Statics.field1513 = var2;
        Statics.field1429 = field321 * 15 + 22;
    }

    @ObfuscatedName("g.bd(IIIILjava/lang/String;Ljava/lang/String;IIS)V")
    public static final void method88(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 9) {
            class30 var8 = field484[arg3];
            if (var8 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(97);
                field499.method2146(arg3);
                field499.method2138(class124.field1976[82] ? 1 : 0);
            }
        }
        if (arg2 == 33) {
            field499.method2347(216);
            field499.method2153(arg1);
            field499.method2145(arg3);
            field499.method2147(arg0);
            field425 = 0;
            Statics.field828 = class152.method493(arg1);
            field368 = arg0;
        }
        if (arg2 == 24) {
            class152 var9 = class152.method493(arg1);
            boolean var10 = true;
            if (var9.field2631 > 0) {
                var10 = method636(var9);
            }
            if (var10) {
                field499.method2347(81);
                field499.method2303(arg1);
            }
        }
        if (arg2 == 8) {
            class30 var11 = field484[arg3];
            if (var11 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(106);
                field499.method2146(field415);
                field499.method2153(Statics.field985);
                field499.method2137(class124.field1976[82] ? 1 : 0);
                field499.method2147(arg3);
            }
        }
        if (arg2 == 1004) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field499.method2347(178);
            field499.method2146(arg3);
        }
        if (arg2 == 6) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field487 = arg0;
            field488 = arg1;
            field499.method2347(10);
            field499.method2146(Statics.field1859 + arg1);
            field499.method2145(arg3 >> 14 & 0x7FFF);
            field499.method2147(Statics.field1782 + arg0);
            field499.method2137(class124.field1976[82] ? 1 : 0);
        }
        if (arg2 == 39) {
            field499.method2347(241);
            field499.method2147(arg0);
            field499.method2303(arg1);
            field499.method2275(arg3);
            field425 = 0;
            Statics.field828 = class152.method493(arg1);
            field368 = arg0;
        }
        if (arg2 == 3) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field487 = arg0;
            field488 = arg1;
            field499.method2347(173);
            field499.method2275(Statics.field1782 + arg0);
            field499.method2292(class124.field1976[82] ? 1 : 0);
            field499.method2146(Statics.field1859 + arg1);
            field499.method2275(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 29) {
            field499.method2347(81);
            field499.method2303(arg1);
            class152 var12 = class152.method493(arg1);
            if (var12.field2632 != null && var12.field2632[0][0] == 5) {
                int var13 = var12.field2632[0][1];
                if (class154.field2661[var13] != var12.field2634[0]) {
                    class154.field2661[var13] = var12.field2634[0];
                    method2678(var13);
                }
            }
        }
        if (arg2 == 15) {
            class3 var14 = field376[arg3];
            if (var14 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(20);
                field499.method2146(field415);
                field499.method2153(Statics.field985);
                field499.method2275(arg3);
                field499.method2292(class124.field1976[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field499.method2347(204);
            field499.method2158(Statics.field1458);
            field499.method2275(arg0);
            field499.method2235(arg1);
            field499.method2147(arg3);
            field499.method2145(Statics.field698);
            field499.method2146(Statics.field1685);
            field425 = 0;
            Statics.field828 = class152.method493(arg1);
            field368 = arg0;
        }
        if (arg2 == 42) {
            field499.method2347(92);
            field499.method2145(arg3);
            field499.method2146(arg0);
            field499.method2235(arg1);
            field425 = 0;
            Statics.field828 = class152.method493(arg1);
            field368 = arg0;
        }
        if (arg2 == 43) {
            field499.method2347(52);
            field499.method2303(arg1);
            field499.method2146(arg0);
            field499.method2147(arg3);
            field425 = 0;
            Statics.field828 = class152.method493(arg1);
            field368 = arg0;
        }
        if (arg2 == 1003) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            class30 var15 = field484[arg3];
            if (var15 != null) {
                class35 var16 = var15.field699;
                if (var16.field823 != null) {
                    var16 = var16.method605();
                }
                if (var16 != null) {
                    field499.method2347(84);
                    field499.method2146(var16.field821);
                }
            }
        }
        if (arg2 == 38) {
            method637();
            class152 var17 = class152.method493(arg1);
            field412 = 1;
            Statics.field698 = arg0;
            Statics.field1458 = arg1;
            Statics.field1685 = arg3;
            method564(var17);
            field413 = Statics.method558(16748608) + class45.method2458(arg3).field1016 + Statics.method558(16777215);
            if (field413 == null) {
                field413 = "null";
            }
            return;
        }
        if (arg2 == 1002) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field499.method2347(65);
            field499.method2147(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 21) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field487 = arg0;
            field488 = arg1;
            field499.method2347(167);
            field499.method2147(arg3);
            field499.method2275(Statics.field1782 + arg0);
            field499.method2146(Statics.field1859 + arg1);
            field499.method2102(class124.field1976[82] ? 1 : 0);
        }
        if (arg2 == 4) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field487 = arg0;
            field488 = arg1;
            field499.method2347(116);
            field499.method2137(class124.field1976[82] ? 1 : 0);
            field499.method2146(Statics.field1782 + arg0);
            field499.method2147(Statics.field1859 + arg1);
            field499.method2146(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 5) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field487 = arg0;
            field488 = arg1;
            field499.method2347(215);
            field499.method2147(Statics.field1782 + arg0);
            field499.method2102(class124.field1976[82] ? 1 : 0);
            field499.method2146(Statics.field1859 + arg1);
            field499.method2146(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 45) {
            class3 var18 = field376[arg3];
            if (var18 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(77);
                field499.method2102(class124.field1976[82] ? 1 : 0);
                field499.method2275(arg3);
            }
        }
        if (arg2 == 34) {
            field499.method2347(70);
            field499.method2158(arg1);
            field499.method2275(arg0);
            field499.method2147(arg3);
            field425 = 0;
            Statics.field828 = class152.method493(arg1);
            field368 = arg0;
        }
        if (arg2 == 2) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field487 = arg0;
            field488 = arg1;
            field499.method2347(159);
            field499.method2147(Statics.field1859 + arg1);
            field499.method2138(class124.field1976[82] ? 1 : 0);
            field499.method2146(field415);
            field499.method2146(Statics.field1782 + arg0);
            field499.method2147(arg3 >> 14 & 0x7FFF);
            field499.method2153(Statics.field985);
        }
        if (arg2 == 44) {
            class3 var19 = field376[arg3];
            if (var19 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(8);
                field499.method2138(class124.field1976[82] ? 1 : 0);
                field499.method2146(arg3);
            }
        }
        if (arg2 == 16) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field487 = arg0;
            field488 = arg1;
            field499.method2347(94);
            field499.method2292(class124.field1976[82] ? 1 : 0);
            field499.method2147(Statics.field1859 + arg1);
            field499.method2275(Statics.field698);
            field499.method2153(Statics.field1458);
            field499.method2146(Statics.field1685);
            field499.method2275(Statics.field1782 + arg0);
            field499.method2275(arg3);
        }
        if (arg2 == 12) {
            class30 var20 = field484[arg3];
            if (var20 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(155);
                field499.method2137(class124.field1976[82] ? 1 : 0);
                field499.method2146(arg3);
            }
        }
        if (arg2 == 58) {
            class152 var21 = class152.method842(arg1, arg0);
            if (var21 != null) {
                field499.method2347(36);
                field499.method2303(arg1);
                field499.method2146(field415);
                field499.method2275(arg0);
                field499.method2158(Statics.field985);
                field499.method2275(var21.field2640);
                field499.method2145(field416);
            }
        }
        if (arg2 == 47) {
            class3 var22 = field376[arg3];
            if (var22 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(169);
                field499.method2146(arg3);
                field499.method2102(class124.field1976[82] ? 1 : 0);
            }
        }
        if (arg2 == 10) {
            class30 var23 = field484[arg3];
            if (var23 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(5);
                field499.method2146(arg3);
                field499.method2138(class124.field1976[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            Statics.field2481.method1701(Statics.field56, arg0, arg1);
        }
        if (arg2 == 37) {
            field499.method2347(180);
            field499.method2158(arg1);
            field499.method2145(arg0);
            field499.method2146(arg3);
            field425 = 0;
            Statics.field828 = class152.method493(arg1);
            field368 = arg0;
        }
        if (arg2 == 32) {
            field499.method2347(24);
            field499.method2147(arg0);
            field499.method2147(field415);
            field499.method2235(Statics.field985);
            field499.method2145(arg3);
            field499.method2153(arg1);
            field425 = 0;
            Statics.field828 = class152.method493(arg1);
            field368 = arg0;
        }
        if (arg2 == 1001) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field487 = arg0;
            field488 = arg1;
            field499.method2347(156);
            field499.method2145(Statics.field1782 + arg0);
            field499.method2145(arg3 >> 14 & 0x7FFF);
            field499.method2102(class124.field1976[82] ? 1 : 0);
            field499.method2145(Statics.field1859 + arg1);
        }
        if (arg2 == 13) {
            class30 var24 = field484[arg3];
            if (var24 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(125);
                field499.method2275(arg3);
                field499.method2137(class124.field1976[82] ? 1 : 0);
            }
        }
        if (arg2 == 20) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field487 = arg0;
            field488 = arg1;
            field499.method2347(26);
            field499.method2147(Statics.field1782 + arg0);
            field499.method2145(arg3);
            field499.method2275(Statics.field1859 + arg1);
            field499.method2138(class124.field1976[82] ? 1 : 0);
        }
        if (arg2 == 48) {
            class3 var25 = field376[arg3];
            if (var25 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(230);
                field499.method2137(class124.field1976[82] ? 1 : 0);
                field499.method2146(arg3);
            }
        }
        if (arg2 == 1) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field487 = arg0;
            field488 = arg1;
            field499.method2347(214);
            field499.method2147(Statics.field1685);
            field499.method2147(Statics.field698);
            field499.method2145(Statics.field1859 + arg1);
            field499.method2303(Statics.field1458);
            field499.method2102(class124.field1976[82] ? 1 : 0);
            field499.method2147(arg3 >> 14 & 0x7FFF);
            field499.method2275(Statics.field1782 + arg0);
        }
        if (arg2 == 30 && field423 == null) {
            method471(arg1, arg0);
            field423 = class152.method842(arg1, arg0);
            method564(field423);
        }
        if (arg2 == 14) {
            class3 var26 = field376[arg3];
            if (var26 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(231);
                field499.method2275(Statics.field698);
                field499.method2158(Statics.field1458);
                field499.method2147(Statics.field1685);
                field499.method2138(class124.field1976[82] ? 1 : 0);
                field499.method2275(arg3);
            }
        }
        if (arg2 == 25) {
            class152 var27 = class152.method842(arg1, arg0);
            if (var27 != null) {
                method637();
                int var30 = method143(var27);
                int var31 = var30 >> 11 & 0x3F;
                Statics.method14(arg1, arg0, var31, var27.field2640);
                field412 = 0;
                field417 = method496(var27);
                if (field417 == null) {
                    field417 = "Null";
                }
                if (var27.field2535) {
                    field287 = var27.field2596 + Statics.method558(16777215);
                } else {
                    field287 = Statics.method558(65280) + var27.field2636 + Statics.method558(16777215);
                }
            }
            return;
        }
        if (arg2 == 49) {
            class3 var32 = field376[arg3];
            if (var32 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(62);
                field499.method2147(arg3);
                field499.method2102(class124.field1976[82] ? 1 : 0);
            }
        }
        if (arg2 == 17) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field487 = arg0;
            field488 = arg1;
            field499.method2347(42);
            field499.method2235(Statics.field985);
            field499.method2292(class124.field1976[82] ? 1 : 0);
            field499.method2146(Statics.field1859 + arg1);
            field499.method2147(Statics.field1782 + arg0);
            field499.method2147(field415);
            field499.method2146(arg3);
        }
        if (arg2 == 11) {
            class30 var33 = field484[arg3];
            if (var33 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(170);
                field499.method2292(class124.field1976[82] ? 1 : 0);
                field499.method2147(arg3);
            }
        }
        if (arg2 == 36) {
            field499.method2347(171);
            field499.method2153(arg1);
            field499.method2146(arg3);
            field499.method2145(arg0);
            field425 = 0;
            Statics.field828 = class152.method493(arg1);
            field368 = arg0;
        }
        if (arg2 == 26) {
            method137();
        }
        if (arg2 == 50) {
            class3 var34 = field376[arg3];
            if (var34 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(219);
                field499.method2145(arg3);
                field499.method2138(class124.field1976[82] ? 1 : 0);
            }
        }
        if (arg2 == 40) {
            field499.method2347(23);
            field499.method2153(arg1);
            field499.method2275(arg3);
            field499.method2147(arg0);
            field425 = 0;
            Statics.field828 = class152.method493(arg1);
            field368 = arg0;
        }
        if (arg2 == 1005) {
            class152 var35 = class152.method493(arg1);
            if (var35 == null || var35.field2639[arg0] < 100000) {
                field499.method2347(178);
                field499.method2146(arg3);
            } else {
                class10.method1970(27, "", var35.field2639[arg0] + " x " + class45.method2458(arg3).field1016);
            }
            field425 = 0;
            Statics.field828 = class152.method493(arg1);
            field368 = arg0;
        }
        if (arg2 == 51) {
            class3 var36 = field376[arg3];
            if (var36 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(69);
                field499.method2138(class124.field1976[82] ? 1 : 0);
                field499.method2147(arg3);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class152 var37 = class152.method842(arg1, arg0);
            if (var37 != null) {
                int var38 = var37.field2640;
                class152 var39 = class152.method842(arg1, arg0);
                if (var39 != null) {
                    if (var39.field2623 != null) {
                        class1 var40 = new class1();
                        var40.field4 = var39;
                        var40.field16 = arg3;
                        var40.field18 = arg5;
                        var40.field8 = var39.field2623;
                        class32.method563(var40, 200000);
                    }
                    boolean var41 = true;
                    if (var39.field2631 > 0) {
                        var41 = method636(var39);
                    }
                    if (var41 && class156.method131(method143(var39), arg3 - 1)) {
                        if (arg3 == 1) {
                            field499.method2347(85);
                            field499.method2303(arg1);
                            field499.method2275(arg0);
                            field499.method2275(var38);
                        }
                        if (arg3 == 2) {
                            field499.method2347(245);
                            field499.method2303(arg1);
                            field499.method2275(arg0);
                            field499.method2275(var38);
                        }
                        if (arg3 == 3) {
                            field499.method2347(181);
                            field499.method2303(arg1);
                            field499.method2275(arg0);
                            field499.method2275(var38);
                        }
                        if (arg3 == 4) {
                            field499.method2347(21);
                            field499.method2303(arg1);
                            field499.method2275(arg0);
                            field499.method2275(var38);
                        }
                        if (arg3 == 5) {
                            field499.method2347(147);
                            field499.method2303(arg1);
                            field499.method2275(arg0);
                            field499.method2275(var38);
                        }
                        if (arg3 == 6) {
                            field499.method2347(235);
                            field499.method2303(arg1);
                            field499.method2275(arg0);
                            field499.method2275(var38);
                        }
                        if (arg3 == 7) {
                            field499.method2347(60);
                            field499.method2303(arg1);
                            field499.method2275(arg0);
                            field499.method2275(var38);
                        }
                        if (arg3 == 8) {
                            field499.method2347(251);
                            field499.method2303(arg1);
                            field499.method2275(arg0);
                            field499.method2275(var38);
                        }
                        if (arg3 == 9) {
                            field499.method2347(210);
                            field499.method2303(arg1);
                            field499.method2275(arg0);
                            field499.method2275(var38);
                        }
                        if (arg3 == 10) {
                            field499.method2347(132);
                            field499.method2303(arg1);
                            field499.method2275(arg0);
                            field499.method2275(var38);
                        }
                    }
                }
            }
        }
        if (arg2 == 19) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field487 = arg0;
            field488 = arg1;
            field499.method2347(61);
            field499.method2146(Statics.field1782 + arg0);
            field499.method2146(Statics.field1859 + arg1);
            field499.method2137(class124.field1976[82] ? 1 : 0);
            field499.method2145(arg3);
        }
        if (arg2 == 35) {
            field499.method2347(30);
            field499.method2147(arg3);
            field499.method2158(arg1);
            field499.method2275(arg0);
            field425 = 0;
            Statics.field828 = class152.method493(arg1);
            field368 = arg0;
        }
        if (arg2 == 22) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field487 = arg0;
            field488 = arg1;
            field499.method2347(212);
            field499.method2275(Statics.field1782 + arg0);
            field499.method2292(class124.field1976[82] ? 1 : 0);
            field499.method2147(Statics.field1859 + arg1);
            field499.method2275(arg3);
        }
        if (arg2 == 28) {
            field499.method2347(81);
            field499.method2303(arg1);
            class152 var42 = class152.method493(arg1);
            if (var42.field2632 != null && var42.field2632[0][0] == 5) {
                int var43 = var42.field2632[0][1];
                class154.field2661[var43] = 1 - class154.field2661[var43];
                method2678(var43);
            }
        }
        if (arg2 == 7) {
            class30 var44 = field484[arg3];
            if (var44 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(109);
                field499.method2147(Statics.field698);
                field499.method2303(Statics.field1458);
                field499.method2275(arg3);
                field499.method2146(Statics.field1685);
                field499.method2292(class124.field1976[82] ? 1 : 0);
            }
        }
        if (arg2 == 18) {
            field363 = arg6;
            field286 = arg7;
            field366 = 2;
            field365 = 0;
            field487 = arg0;
            field488 = arg1;
            field499.method2347(148);
            field499.method2146(Statics.field1859 + arg1);
            field499.method2147(Statics.field1782 + arg0);
            field499.method2138(class124.field1976[82] ? 1 : 0);
            field499.method2145(arg3);
        }
        if (arg2 == 41) {
            field499.method2347(144);
            field499.method2145(arg0);
            field499.method2158(arg1);
            field499.method2145(arg3);
            field425 = 0;
            Statics.field828 = class152.method493(arg1);
            field368 = arg0;
        }
        if (arg2 == 46) {
            class3 var45 = field376[arg3];
            if (var45 != null) {
                field363 = arg6;
                field286 = arg7;
                field366 = 2;
                field365 = 0;
                field487 = arg0;
                field488 = arg1;
                field499.method2347(220);
                field499.method2102(class124.field1976[82] ? 1 : 0);
                field499.method2147(arg3);
            }
        }
        if (field412 != 0) {
            field412 = 0;
            method564(class152.method493(Statics.field1458));
        }
        if (field314) {
            method637();
        }
        if (Statics.field828 != null && field425 == 0) {
            method564(Statics.field828);
        }
    }

    @ObfuscatedName("as.bu(B)V")
    public static void method637() {
        if (!field314) {
            return;
        }
        class152 var0 = class152.method842(Statics.field985, field415);
        if (var0 != null && var0.field2559 != null) {
            class1 var1 = new class1();
            var1.field4 = var0;
            var1.field8 = var0.field2559;
            class32.method563(var1, 200000);
        }
        field314 = false;
        method564(var0);
    }

    @ObfuscatedName("v.bx(III)V")
    public static void method471(int arg0, int arg1) {
        field499.method2347(152);
        field499.method2147(arg1);
        field499.method2235(arg0);
    }

    @ObfuscatedName("ey.bj(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method2696(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field278 || field321 >= 500) {
            return;
        }
        field475[field321] = arg0;
        field397[field321] = arg1;
        field404[field321] = arg2;
        field405[field321] = arg3;
        field402[field321] = arg4;
        field471[field321] = arg5;
        field321++;
    }

    @ObfuscatedName("ae.ba(B)V")
    public static void method740() {
        for (int var0 = 0; var0 < field321; var0++) {
            int var1 = field404[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field321 - 1) {
                    for (int var3 = var0; var3 < field321 - 1; var3++) {
                        field475[var3] = field475[var3 + 1];
                        field397[var3] = field397[var3 + 1];
                        field404[var3] = field404[var3 + 1];
                        field405[var3] = field405[var3 + 1];
                        field402[var3] = field402[var3 + 1];
                        field471[var3] = field471[var3 + 1];
                    }
                }
                field321--;
            }
        }
    }

    @ObfuscatedName("cp.bz(IIIII)V")
    public static final void method2048(int arg0, int arg1, int arg2, int arg3) {
        if (field412 == 0 && !field314) {
            method2696(class142.field2330, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class98.field1740; var5++) {
            int var6 = class98.field1771[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field2481.method1603(Statics.field56, var7, var8, var6) >= 0) {
                    class36 var11 = class36.method93(var10);
                    if (var11.field873 != null) {
                        var11 = var11.method648();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field412 == 1) {
                        method2696(class142.field2348, field413 + " " + class2.field21 + " " + Statics.method558(65535) + var11.field842, 1, var6, var7, var8);
                    } else if (!field314) {
                        String[] var12 = var11.field865;
                        if (field432) {
                            var12 = method560(var12);
                        }
                        if (var12 != null) {
                            for (int var13 = 4; var13 >= 0; var13--) {
                                if (var12[var13] != null) {
                                    short var14 = 0;
                                    if (var13 == 0) {
                                        var14 = 3;
                                    }
                                    if (var13 == 1) {
                                        var14 = 4;
                                    }
                                    if (var13 == 2) {
                                        var14 = 5;
                                    }
                                    if (var13 == 3) {
                                        var14 = 6;
                                    }
                                    if (var13 == 4) {
                                        var14 = 1001;
                                    }
                                    method2696(var12[var13], Statics.method558(65535) + var11.field842, var14, var6, var7, var8);
                                }
                            }
                        }
                        method2696(class142.field2306, Statics.method558(65535) + var11.field842, 1002, var11.field880 << 14, var7, var8);
                    } else if ((Statics.field1113 & 0x4) == 4) {
                        method2696(field417, field287 + " " + class2.field21 + " " + Statics.method558(65535) + var11.field842, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class30 var15 = field484[var10];
                    if (var15 == null) {
                        continue;
                    }
                    if (var15.field699.field796 == 1 && (var15.field770 & 0x7F) == 64 && (var15.field728 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field293; var16++) {
                            class30 var17 = field484[field294[var16]];
                            if (var17 != null && var15 != var17 && var17.field699.field796 == 1 && var15.field770 == var17.field770 && var15.field728 == var17.field728) {
                                method1957(var17.field699, field294[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field377; var18++) {
                            class3 var19 = field376[field378[var18]];
                            if (var19 != null && var15.field770 == var19.field770 && var15.field728 == var19.field728) {
                                method489(var19, field378[var18], var7, var8);
                            }
                        }
                    }
                    method1957(var15.field699, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field376[var10];
                    if (var20 == null) {
                        continue;
                    }
                    if ((var20.field770 & 0x7F) == 64 && (var20.field728 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field293; var21++) {
                            class30 var22 = field484[field294[var21]];
                            if (var22 != null && var22.field699.field796 == 1 && var20.field770 == var22.field770 && var20.field728 == var22.field728) {
                                method1957(var22.field699, field294[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field377; var23++) {
                            class3 var24 = field376[field378[var23]];
                            if (var24 != null && var20 != var24 && var20.field770 == var24.field770 && var20.field728 == var24.field728) {
                                method489(var24, field378[var23], var7, var8);
                            }
                        }
                    }
                    method489(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class177 var25 = field391[Statics.field56][var7][var8];
                    if (var25 != null) {
                        for (class25 var26 = (class25) var25.method3239(); var26 != null; var26 = (class25) var25.method3231()) {
                            class45 var27 = class45.method2458(var26.field624);
                            if (field412 == 1) {
                                method2696(class142.field2348, field413 + " " + class2.field21 + " " + Statics.method558(16748608) + var27.field1016, 16, var26.field624, var7, var8);
                            } else if (!field314) {
                                String[] var28 = var27.field1031;
                                if (field432) {
                                    var28 = method560(var28);
                                }
                                for (int var29 = 4; var29 >= 0; var29--) {
                                    if (var28 != null && var28[var29] != null) {
                                        byte var30 = 0;
                                        if (var29 == 0) {
                                            var30 = 18;
                                        }
                                        if (var29 == 1) {
                                            var30 = 19;
                                        }
                                        if (var29 == 2) {
                                            var30 = 20;
                                        }
                                        if (var29 == 3) {
                                            var30 = 21;
                                        }
                                        if (var29 == 4) {
                                            var30 = 22;
                                        }
                                        method2696(var28[var29], Statics.method558(16748608) + var27.field1016, var30, var26.field624, var7, var8);
                                    } else if (var29 == 2) {
                                        method2696(class142.field2156, Statics.method558(16748608) + var27.field1016, 20, var26.field624, var7, var8);
                                    }
                                }
                                method2696(class142.field2306, Statics.method558(16748608) + var27.field1016, 1004, var26.field624, var7, var8);
                            } else if ((Statics.field1113 & 0x1) == 1) {
                                method2696(field417, field287 + " " + class2.field21 + " " + Statics.method558(16748608) + var27.field1016, 17, var26.field624, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ce.cb(Las;IIIB)V")
    public static final void method1957(class35 arg0, int arg1, int arg2, int arg3) {
        if (field321 >= 400) {
            return;
        }
        if (arg0.field823 != null) {
            arg0 = arg0.method605();
        }
        if (arg0 == null || !arg0.field816 || arg0.field825 && field427 != arg1) {
            return;
        }
        String var4 = arg0.field795;
        if (arg0.field814 != 0) {
            int var6 = arg0.field814;
            int var7 = Statics.field892.field40;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = Statics.method558(16711680);
            } else if (var8 < -6) {
                var9 = Statics.method558(16723968);
            } else if (var8 < -3) {
                var9 = Statics.method558(16740352);
            } else if (var8 < 0) {
                var9 = Statics.method558(16756736);
            } else if (var8 > 9) {
                var9 = Statics.method558(65280);
            } else if (var8 > 6) {
                var9 = Statics.method558(4259584);
            } else if (var8 > 3) {
                var9 = Statics.method558(8453888);
            } else if (var8 > 0) {
                var9 = Statics.method558(12648192);
            } else {
                var9 = Statics.method558(16776960);
            }
            var4 = var4 + var9 + " " + class2.field33 + class142.field2155 + arg0.field814 + class2.field24;
        }
        if (field412 == 1) {
            method2696(class142.field2348, field413 + " " + class2.field21 + " " + Statics.method558(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field314) {
            String[] var10 = arg0.field808;
            if (field432) {
                var10 = method560(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class142.field2317)) {
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
                        method2696(var10[var11], Statics.method558(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class142.field2317)) {
                        short var14 = 0;
                        if (field282 == class18.field519 || field282 == class18.field518 && arg0.field814 > Statics.field892.field40) {
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
                        method2696(var10[var13], Statics.method558(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method2696(class142.field2306, Statics.method558(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1113 & 0x2) == 2) {
            method2696(field417, field287 + " " + class2.field21 + " " + Statics.method558(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("r.ct(Le;IIIB)V")
    public static final void method489(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field892 == arg0 || field321 >= 400) {
            return;
        }
        String var9;
        if (arg0.field59 == 0) {
            String var4 = arg0.field55;
            int var5 = arg0.field40;
            int var6 = Statics.field892.field40;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = Statics.method558(16711680);
            } else if (var7 < -6) {
                var8 = Statics.method558(16723968);
            } else if (var7 < -3) {
                var8 = Statics.method558(16740352);
            } else if (var7 < 0) {
                var8 = Statics.method558(16756736);
            } else if (var7 > 9) {
                var8 = Statics.method558(65280);
            } else if (var7 > 6) {
                var8 = Statics.method558(4259584);
            } else if (var7 > 3) {
                var8 = Statics.method558(8453888);
            } else if (var7 > 0) {
                var8 = Statics.method558(12648192);
            } else {
                var8 = Statics.method558(16776960);
            }
            var9 = var4 + var8 + " " + class2.field33 + class142.field2155 + arg0.field40 + class2.field24;
        } else {
            var9 = arg0.field55 + " " + class2.field33 + class142.field2312 + arg0.field59 + class2.field24;
        }
        if (field412 == 1) {
            method2696(class142.field2348, field413 + " " + class2.field21 + " " + Statics.method558(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field314) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field387[var10] != null) {
                    short var11 = 0;
                    if (field387[var10].equalsIgnoreCase(class142.field2317)) {
                        if (field282 == class18.field519 || field282 == class18.field518 && arg0.field40 > Statics.field892.field40) {
                            var11 = 2000;
                        }
                        if (Statics.field892.field35 != 0 && arg0.field35 != 0) {
                            if (Statics.field892.field35 == arg0.field35) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field429[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field386[var10] + var11;
                    method2696(field387[var10], Statics.method558(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1113 & 0x8) == 8) {
            method2696(field417, field287 + " " + class2.field21 + " " + Statics.method558(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field321; var14++) {
            if (field404[var14] == 23) {
                field397[var14] = Statics.method558(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ce.cn([Lea;IIIIIIIII)V")
    public static final void method1956(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1511(arg2, arg3, arg4, arg5);
        class84.method1776();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class152 var10 = arg0[var9];
            if (var10 != null && (var10.field2547 == arg1 || arg1 == -1412584499 && field431 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field466[field461] = var10.field2615 + arg6;
                    field467[field461] = var10.field2542 + arg7;
                    field468[field461] = var10.field2617;
                    field469[field461] = var10.field2546;
                    var11 = ++field461 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2651 = var11;
                var10.field2626 = field265;
                if (!var10.field2535 || !method760(var10)) {
                    if (var10.field2631 > 0) {
                        method2684(var10);
                    }
                    int var12 = var10.field2615 + arg6;
                    int var13 = var10.field2542 + arg7;
                    int var14 = var10.field2528;
                    if (field431 == var10) {
                        if (arg1 != -1412584499 && !var10.field2573) {
                            Statics.field181 = arg0;
                            Statics.field146 = arg6;
                            Statics.field1666 = arg7;
                            continue;
                        }
                        if (field346 && field436) {
                            int var15 = class127.field2010;
                            int var16 = class127.field2017 * -991203695;
                            int var17 = var15 - field433;
                            int var18 = var16 - field434;
                            if (var17 < field437) {
                                var17 = field437;
                            }
                            if (var10.field2617 + var17 > field437 + field339.field2617) {
                                var17 = field437 + field339.field2617 - var10.field2617;
                            }
                            if (var18 < field492) {
                                var18 = field492;
                            }
                            if (var10.field2546 + var18 > field492 + field339.field2546) {
                                var18 = field492 + field339.field2546 - var10.field2546;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2573) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2538 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2538 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2617 + var12;
                        int var26 = var10.field2546 + var13;
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
                        int var29 = var10.field2617 + var12;
                        int var30 = var10.field2546 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2535 || var19 < var21 && var20 < var22) {
                        if (var10.field2631 != 0) {
                            if (var10.field2631 == 1337) {
                                field308 = var12;
                                field453 = var13;
                                int var31 = var10.field2617;
                                int var32 = var10.field2546;
                                class73.method1511(var12, var13, var12 + var31, var13 + var32);
                                class84.method1776();
                                field360++;
                                method2343(class29.field690);
                                boolean var33 = false;
                                if (field328 >= 0) {
                                    for (int var34 = 0; var34 < field377; var34++) {
                                        if (field328 == field378[var34]) {
                                            var33 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var33) {
                                    method2343(class29.field693);
                                }
                                method147(true);
                                method2343(var33 ? class29.field692 : class29.field691);
                                method147(false);
                                for (class7 var35 = (class7) field333.method3228(); var35 != null; var35 = (class7) field333.method3254()) {
                                    if (Statics.field56 != var35.field123 || field265 > var35.field106) {
                                        var35.method3321();
                                    } else if (field265 >= var35.field108) {
                                        if (var35.field126 > 0) {
                                            class30 var36 = field484[var35.field126 - 1];
                                            if (var36 != null && var36.field770 >= 0 && var36.field770 < 13312 && var36.field728 >= 0 && var36.field728 < 13312) {
                                                var35.method81(var36.field770, var36.field728, method22(var36.field770, var36.field728, var35.field123) - var35.field104, field265);
                                            }
                                        }
                                        if (var35.field126 < 0) {
                                            int var37 = -var35.field126 - 1;
                                            class3 var38;
                                            if (field479 == var37) {
                                                var38 = Statics.field892;
                                            } else {
                                                var38 = field376[var37];
                                            }
                                            if (var38 != null && var38.field770 >= 0 && var38.field770 < 13312 && var38.field728 >= 0 && var38.field728 < 13312) {
                                                var35.method81(var38.field770, var38.field728, method22(var38.field770, var38.field728, var35.field123) - var35.field104, field265);
                                            }
                                        }
                                        var35.method82(field335);
                                        Statics.field2481.method1606(Statics.field56, (int) var35.field111, (int) var35.field109, (int) var35.field112, 60, var35, var35.field119, -1, false);
                                    }
                                }
                                method701();
                                if (!field428) {
                                    int var39 = field340;
                                    if (field348 / 256 > var39) {
                                        var39 = field348 / 256;
                                    }
                                    if (field503[4] && field505[4] + 128 > var39) {
                                        var39 = field505[4] + 128;
                                    }
                                    int var40 = field407 + field341 & 0x7FF;
                                    method1954(Statics.field73, method22(Statics.field892.field770, Statics.field892.field728, Statics.field56) - 50, Statics.field58, var39, var40, var39 * 3 + 600);
                                }
                                int var41;
                                if (field428) {
                                    int var42;
                                    if (Statics.field30.field136) {
                                        var42 = Statics.field56;
                                    } else {
                                        int var43 = method22(Statics.field13, Statics.field60, Statics.field56);
                                        if (var43 - Statics.field1927 >= 800 || (class6.field82[Statics.field56][Statics.field13 >> 7][Statics.field60 >> 7] & 0x4) == 0) {
                                            var42 = 3;
                                        } else {
                                            var42 = Statics.field56;
                                        }
                                    }
                                    var41 = var42;
                                } else {
                                    var41 = Statics.method1766();
                                }
                                int var44 = Statics.field13;
                                int var45 = Statics.field1927;
                                int var46 = Statics.field60;
                                int var47 = Statics.field1283;
                                int var48 = Statics.field151;
                                for (int var49 = 0; var49 < 5; var49++) {
                                    if (field503[var49]) {
                                        int var50 = (int) (Math.random() * (double) (field504[var49] * 2 + 1) - (double) field504[var49] + Math.sin((double) field358[var49] / 100.0D * (double) field414[var49]) * (double) field505[var49]);
                                        if (var49 == 0) {
                                            Statics.field13 += var50;
                                        }
                                        if (var49 == 1) {
                                            Statics.field1927 += var50;
                                        }
                                        if (var49 == 2) {
                                            Statics.field60 += var50;
                                        }
                                        if (var49 == 3) {
                                            Statics.field151 = Statics.field151 + var50 & 0x7FF;
                                        }
                                        if (var49 == 4) {
                                            Statics.field1283 += var50;
                                            if (Statics.field1283 < 128) {
                                                Statics.field1283 = 128;
                                            }
                                            if (Statics.field1283 > 383) {
                                                Statics.field1283 = 383;
                                            }
                                        }
                                    }
                                }
                                int var51 = class127.field2010;
                                int var52 = class127.field2017 * -991203695;
                                if (class127.field2022 != 0) {
                                    var51 = class127.field2023;
                                    var52 = class127.field2015;
                                }
                                if (var51 >= var12 && var51 < var12 + var31 && var52 >= var13 && var52 < var13 + var32) {
                                    class98.field1767 = true;
                                    class98.field1740 = 0;
                                    class98.field1768 = var51 - var12;
                                    class98.field1769 = var52 - var13;
                                } else {
                                    class98.field1767 = false;
                                    class98.field1740 = 0;
                                }
                                method2676();
                                class73.method1517(var12, var13, var31, var32, 0);
                                method2676();
                                Statics.field2481.method1633(Statics.field13, Statics.field1927, Statics.field60, Statics.field1283, Statics.field151, var41);
                                method2676();
                                Statics.field2481.method1609();
                                field349 = 0;
                                boolean var53 = false;
                                int var54 = -1;
                                for (int var55 = -1; var55 < field377 + field293; var55++) {
                                    class33 var56;
                                    if (var55 == -1) {
                                        var56 = Statics.field892;
                                    } else if (var55 < field377) {
                                        var56 = field376[field378[var55]];
                                        if (field328 == field378[var55]) {
                                            var53 = true;
                                            var54 = var55;
                                            continue;
                                        }
                                    } else {
                                        var56 = field484[field294[var55 - field377]];
                                    }
                                    method3(var56, var55, var12, var13, var31, var32);
                                }
                                if (var53) {
                                    method3(field376[field328], var54, var12, var13, var31, var32);
                                }
                                for (int var57 = 0; var57 < field349; var57++) {
                                    int var58 = field351[var57];
                                    int var59 = field352[var57];
                                    int var60 = field354[var57];
                                    int var61 = field353[var57];
                                    boolean var62 = true;
                                    while (var62) {
                                        var62 = false;
                                        for (int var63 = 0; var63 < var57; var63++) {
                                            if (var59 + 2 > field352[var63] - field353[var63] && var59 - var61 < field352[var63] + 2 && var58 - var60 < field354[var63] + field351[var63] && var58 + var60 > field351[var63] - field354[var63] && field352[var63] - field353[var63] < var59) {
                                                var59 = field352[var63] - field353[var63];
                                                var62 = true;
                                            }
                                        }
                                    }
                                    field361 = field351[var57];
                                    field362 = field352[var57] = var59;
                                    String var64 = field502[var57];
                                    if (field421 == 0) {
                                        int var65 = 16776960;
                                        if (field355[var57] < 6) {
                                            var65 = field311[field355[var57]];
                                        }
                                        if (field355[var57] == 6) {
                                            var65 = field360 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field355[var57] == 7) {
                                            var65 = field360 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field355[var57] == 8) {
                                            var65 = field360 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field355[var57] == 9) {
                                            int var66 = 150 - field357[var57];
                                            if (var66 < 50) {
                                                var65 = var66 * 1280 + 16711680;
                                            } else if (var66 < 100) {
                                                var65 = 16776960 - (var66 - 50) * 327680;
                                            } else if (var66 < 150) {
                                                var65 = (var66 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field355[var57] == 10) {
                                            int var67 = 150 - field357[var57];
                                            if (var67 < 50) {
                                                var65 = var67 * 5 + 16711680;
                                            } else if (var67 < 100) {
                                                var65 = 16711935 - (var67 - 50) * 327680;
                                            } else if (var67 < 150) {
                                                var65 = (var67 - 100) * 327680 + 255 - (var67 - 100) * 5;
                                            }
                                        }
                                        if (field355[var57] == 11) {
                                            int var68 = 150 - field357[var57];
                                            if (var68 < 50) {
                                                var65 = 16777215 - var68 * 327685;
                                            } else if (var68 < 100) {
                                                var65 = (var68 - 50) * 327685 + 65280;
                                            } else if (var68 < 150) {
                                                var65 = 16777215 - (var68 - 100) * 327680;
                                            }
                                        }
                                        if (field356[var57] == 0) {
                                            Statics.field1690.method3371(var64, field361 + var12, field362 + var13, var65, 0);
                                        }
                                        if (field356[var57] == 1) {
                                            Statics.field1690.method3373(var64, field361 + var12, field362 + var13, var65, 0, field360);
                                        }
                                        if (field356[var57] == 2) {
                                            Statics.field1690.method3374(var64, field361 + var12, field362 + var13, var65, 0, field360);
                                        }
                                        if (field356[var57] == 3) {
                                            Statics.field1690.method3375(var64, field361 + var12, field362 + var13, var65, 0, field360, 150 - field357[var57]);
                                        }
                                        if (field356[var57] == 4) {
                                            int var69 = (150 - field357[var57]) * (Statics.field1690.method3421(var64) + 100) / 150;
                                            class73.method1512(field361 + var12 - 50, var13, field361 + var12 + 50, var13 + var32);
                                            Statics.field1690.method3380(var64, field361 + var12 + 50 - var69, field362 + var13, var65, 0);
                                            class73.method1511(var12, var13, var12 + var31, var13 + var32);
                                        }
                                        if (field356[var57] == 5) {
                                            int var70 = 150 - field357[var57];
                                            int var71 = 0;
                                            if (var70 < 25) {
                                                var71 = var70 - 25;
                                            } else if (var70 > 125) {
                                                var71 = var70 - 125;
                                            }
                                            class73.method1512(var12, field362 + var13 - Statics.field1690.field2907 - 1, var12 + var31, field362 + var13 + 5);
                                            Statics.field1690.method3371(var64, field361 + var12, field362 + var13 + var71, var65, 0);
                                            class73.method1511(var12, var13, var12 + var31, var13 + var32);
                                        }
                                    } else {
                                        Statics.field1690.method3371(var64, field361 + var12, field362 + var13, 16776960, 0);
                                    }
                                }
                                if (field273 == 2) {
                                    method2524((field276 - Statics.field1782 << 7) + field472, (field277 - Statics.field1859 << 7) + field262, field370 * 2);
                                    if (field361 > -1 && field265 % 20 < 10) {
                                        Statics.field1059[0].method1434(field361 + var12 - 12, field362 + var13 - 28);
                                    }
                                }
                                ((class88) Statics.field1485).method1854(field335);
                                method1593(var12, var13, var31, var32);
                                Statics.field13 = var44;
                                Statics.field1927 = var45;
                                Statics.field60 = var46;
                                Statics.field1283 = var47;
                                Statics.field151 = var48;
                                if (field264 && class150.method2764(true, false) == 0) {
                                    field264 = false;
                                }
                                if (field264) {
                                    class73.method1517(var12, var13, var31, var32, 0);
                                    method127(class142.field2164, false);
                                }
                                class73.method1511(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2631 == 1338) {
                                method2676();
                                class73.method1511(var12, var13, Statics.field827.field1327 + var12, Statics.field827.field1325 + var13);
                                if (field489 == 2 || field489 == 5) {
                                    class73.method1526(var12 + 25, var13 + 5, 0, Statics.field614, Statics.field29);
                                } else {
                                    int var72 = field341 + field251 & 0x7FF;
                                    int var73 = Statics.field892.field770 / 32 + 48;
                                    int var74 = 464 - Statics.field892.field728 / 32;
                                    Statics.field2695.method1507(var12 + 25, var13 + 5, 146, 151, var73, var74, var72, field330 + 256, Statics.field614, Statics.field29);
                                    for (int var75 = 0; var75 < field483; var75++) {
                                        int var76 = field281[var75] * 4 + 2 - Statics.field892.field770 / 32;
                                        int var77 = field485[var75] * 4 + 2 - Statics.field892.field728 / 32;
                                        method154(var12, var13, var76, var77, field486[var75]);
                                    }
                                    for (int var78 = 0; var78 < 104; var78++) {
                                        for (int var79 = 0; var79 < 104; var79++) {
                                            class177 var80 = field391[Statics.field56][var78][var79];
                                            if (var80 != null) {
                                                int var81 = var78 * 4 + 2 - Statics.field892.field770 / 32;
                                                int var82 = var79 * 4 + 2 - Statics.field892.field728 / 32;
                                                method154(var12, var13, var81, var82, Statics.field2486[0]);
                                            }
                                        }
                                    }
                                    for (int var83 = 0; var83 < field293; var83++) {
                                        class30 var84 = field484[field294[var83]];
                                        if (var84 != null && var84.method11()) {
                                            class35 var85 = var84.field699;
                                            if (var85 != null && var85.field823 != null) {
                                                var85 = var85.method605();
                                            }
                                            if (var85 != null && var85.field813 && var85.field816) {
                                                int var86 = var84.field770 / 32 - Statics.field892.field770 / 32;
                                                int var87 = var84.field728 / 32 - Statics.field892.field728 / 32;
                                                method154(var12, var13, var86, var87, Statics.field2486[1]);
                                            }
                                        }
                                    }
                                    for (int var88 = 0; var88 < field377; var88++) {
                                        class3 var89 = field376[field378[var88]];
                                        if (var89 != null && var89.method11() && !var89.field53) {
                                            int var90 = var89.field770 / 32 - Statics.field892.field770 / 32;
                                            int var91 = var89.field728 / 32 - Statics.field892.field728 / 32;
                                            boolean var92 = false;
                                            if (method148(var89.field55, true)) {
                                                var92 = true;
                                            }
                                            boolean var93 = false;
                                            for (int var94 = 0; var94 < Statics.field224; var94++) {
                                                if (var89.field55.equals(Statics.field1994[var94].field570)) {
                                                    var93 = true;
                                                    break;
                                                }
                                            }
                                            boolean var95 = false;
                                            if (Statics.field892.field35 != 0 && var89.field35 != 0 && Statics.field892.field35 == var89.field35) {
                                                var95 = true;
                                            }
                                            if (var92) {
                                                method154(var12, var13, var90, var91, Statics.field2486[3]);
                                            } else if (var95) {
                                                method154(var12, var13, var90, var91, Statics.field2486[4]);
                                            } else if (var93) {
                                                method154(var12, var13, var90, var91, Statics.field2486[5]);
                                            } else {
                                                method154(var12, var13, var90, var91, Statics.field2486[2]);
                                            }
                                        }
                                    }
                                    if (field273 != 0 && field265 % 20 < 10) {
                                        if (field273 == 1 && field274 >= 0 && field274 < field484.length) {
                                            class30 var96 = field484[field274];
                                            if (var96 != null) {
                                                int var97 = var96.field770 / 32 - Statics.field892.field770 / 32;
                                                int var98 = var96.field728 / 32 - Statics.field892.field728 / 32;
                                                method166(var12, var13, var97, var98, Statics.field2765[1]);
                                            }
                                        }
                                        if (field273 == 2) {
                                            int var99 = field276 * 4 - Statics.field1782 * 4 + 2 - Statics.field892.field770 / 32;
                                            int var100 = field277 * 4 - Statics.field1859 * 4 + 2 - Statics.field892.field728 / 32;
                                            method166(var12, var13, var99, var100, Statics.field2765[1]);
                                        }
                                        if (field273 == 10 && field275 >= 0 && field275 < field376.length) {
                                            class3 var101 = field376[field275];
                                            if (var101 != null) {
                                                int var102 = var101.field770 / 32 - Statics.field892.field770 / 32;
                                                int var103 = var101.field728 / 32 - Statics.field892.field728 / 32;
                                                method166(var12, var13, var102, var103, Statics.field2765[1]);
                                            }
                                        }
                                    }
                                    if (field487 != 0) {
                                        int var104 = field487 * 4 + 2 - Statics.field892.field770 / 32;
                                        int var105 = field488 * 4 + 2 - Statics.field892.field728 / 32;
                                        method154(var12, var13, var104, var105, Statics.field2765[0]);
                                    }
                                    if (!Statics.field892.field53) {
                                        class73.method1517(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                    }
                                }
                                if (field489 < 3) {
                                    Statics.field524.method1507(var12, var13, 33, 33, 25, 25, field341, 256, Statics.field2034, Statics.field2118);
                                } else {
                                    class73.method1526(var12, var13, 0, Statics.field2034, Statics.field2118);
                                }
                                if (field465[var11]) {
                                    Statics.field827.method1565(var12, var13);
                                }
                                field464[var11] = true;
                                class73.method1511(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2538 == 0) {
                            if (!var10.field2535 && method760(var10) && Statics.field230 != var10) {
                                continue;
                            }
                            if (!var10.field2535) {
                                if (var10.field2643 > var10.field2552 - var10.field2546) {
                                    var10.field2643 = var10.field2552 - var10.field2546;
                                }
                                if (var10.field2643 < 0) {
                                    var10.field2643 = 0;
                                }
                            }
                            method1956(arg0, var10.field2536, var19, var20, var21, var22, var12 - var10.field2549, var13 - var10.field2643, var11);
                            if (var10.field2644 != null) {
                                method1956(var10.field2644, var10.field2536, var19, var20, var21, var22, var12 - var10.field2549, var13 - var10.field2643, var11);
                            }
                            class4 var106 = (class4) field379.method3197((long) var10.field2536);
                            if (var106 != null) {
                                int var107 = var106.field68;
                                if (class152.method561(var107)) {
                                    Statics.field181 = null;
                                    method1956(Statics.field2579[var107], -1, var19, var20, var21, var22, var12, var13, var11);
                                    if (Statics.field181 != null) {
                                        method1956(Statics.field181, -1412584499, var19, var20, var21, var22, Statics.field146, Statics.field1666, var11);
                                        Statics.field181 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var108 = 0; var108 < 100; var108++) {
                                        field344[var108] = true;
                                    }
                                } else {
                                    field344[var11] = true;
                                }
                            }
                            class73.method1511(arg2, arg3, arg4, arg5);
                            class84.method1776();
                        }
                        if (field465[var11] || field470 > 1) {
                            if (var10.field2538 == 0 && !var10.field2535 && var10.field2552 > var10.field2546) {
                                int var109 = var10.field2617 + var12;
                                int var110 = var10.field2643;
                                int var111 = var10.field2546;
                                int var112 = var10.field2552;
                                Statics.field2663[0].method1565(var109, var13);
                                Statics.field2663[1].method1565(var109, var13 + var111 - 16);
                                class73.method1517(var109, var13 + 16, 16, var111 - 32, field334);
                                int var113 = (var111 - 32) * var111 / var112;
                                if (var113 < 8) {
                                    var113 = 8;
                                }
                                int var114 = (var111 - 32 - var113) * var110 / (var112 - var111);
                                class73.method1517(var109, var13 + 16 + var114, 16, var113, field507);
                                class73.method1523(var109, var13 + 16 + var114, var113, field337);
                                class73.method1523(var109 + 1, var13 + 16 + var114, var113, field337);
                                class73.method1521(var109, var13 + 16 + var114, 16, field337);
                                class73.method1521(var109, var13 + 17 + var114, 16, field337);
                                class73.method1523(var109 + 15, var13 + 16 + var114, var113, field394);
                                class73.method1523(var109 + 14, var13 + 17 + var114, var113 - 1, field394);
                                class73.method1521(var109, var13 + 15 + var114 + var113, 16, field394);
                                class73.method1521(var109 + 1, var13 + 14 + var114 + var113, 15, field394);
                            }
                            if (var10.field2538 != 1) {
                                if (var10.field2538 == 2) {
                                    int var115 = 0;
                                    for (int var116 = 0; var116 < var10.field2546; var116++) {
                                        for (int var117 = 0; var117 < var10.field2617; var117++) {
                                            int var118 = (var10.field2612 + 32) * var117 + var12;
                                            int var119 = (var10.field2590 + 32) * var116 + var13;
                                            if (var115 < 20) {
                                                var118 += var10.field2603[var115];
                                                var119 += var10.field2592[var115];
                                            }
                                            if (var10.field2638[var115] > 0) {
                                                boolean var120 = false;
                                                boolean var121 = false;
                                                int var122 = var10.field2638[var115] - 1;
                                                if (var118 + 32 > arg2 && var118 < arg4 && var119 + 32 > arg3 && var119 < arg5 || Statics.field915 == var10 && field369 == var115) {
                                                    class72 var123;
                                                    if (field412 == 1 && Statics.field698 == var115 && Statics.field1458 == var10.field2536) {
                                                        var123 = class45.method1770(var122, var10.field2639[var115], 2, 0, false);
                                                    } else {
                                                        var123 = class45.method1770(var122, var10.field2639[var115], 1, 3153952, false);
                                                    }
                                                    if (var123 == null) {
                                                        method564(var10);
                                                    } else if (Statics.field915 == var10 && field369 == var115) {
                                                        int var124 = class127.field2010 - field260;
                                                        int var125 = class127.field2017 * -991203695 - field480;
                                                        if (var124 < 5 && var124 > -5) {
                                                            var124 = 0;
                                                        }
                                                        if (var125 < 5 && var125 > -5) {
                                                            var125 = 0;
                                                        }
                                                        if (field336 < 5) {
                                                            var124 = 0;
                                                            var125 = 0;
                                                        }
                                                        var123.method1440(var118 + var124, var119 + var125, 128);
                                                        if (arg1 != -1) {
                                                            class152 var126 = arg0[arg1 & 0xFFFF];
                                                            if (var119 + var125 < class73.field1318 && var126.field2643 > 0) {
                                                                int var127 = field335 * (class73.field1318 - var119 - var125) / 3;
                                                                if (var127 > field335 * 10) {
                                                                    var127 = field335 * 10;
                                                                }
                                                                if (var127 > var126.field2643) {
                                                                    var127 = var126.field2643;
                                                                }
                                                                var126.field2643 -= var127;
                                                                field480 += var127;
                                                                method564(var126);
                                                            }
                                                            if (var119 + var125 + 32 > class73.field1320 && var126.field2643 < var126.field2552 - var126.field2546) {
                                                                int var128 = field335 * (var119 + var125 + 32 - class73.field1320) / 3;
                                                                if (var128 > field335 * 10) {
                                                                    var128 = field335 * 10;
                                                                }
                                                                if (var128 > var126.field2552 - var126.field2546 - var126.field2643) {
                                                                    var128 = var126.field2552 - var126.field2546 - var126.field2643;
                                                                }
                                                                var126.field2643 += var128;
                                                                field480 -= var128;
                                                                method564(var126);
                                                            }
                                                        }
                                                    } else if (Statics.field828 == var10 && field368 == var115) {
                                                        var123.method1440(var118, var119, 128);
                                                    } else {
                                                        var123.method1434(var118, var119);
                                                    }
                                                }
                                            } else if (var10.field2593 != null && var115 < 20) {
                                                class72 var129 = var10.method2827(var115);
                                                if (var129 != null) {
                                                    var129.method1434(var118, var119);
                                                } else if (class152.field2577) {
                                                    method564(var10);
                                                }
                                            }
                                            var115++;
                                        }
                                    }
                                } else if (var10.field2538 == 3) {
                                    int var130;
                                    if (method697(var10)) {
                                        var130 = var10.field2560;
                                        if (Statics.field230 == var10 && var10.field2556 != 0) {
                                            var130 = var10.field2556;
                                        }
                                    } else {
                                        var130 = var10.field2553;
                                        if (Statics.field230 == var10 && var10.field2555 != 0) {
                                            var130 = var10.field2555;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2557) {
                                            class73.method1517(var12, var13, var10.field2617, var10.field2546, var130);
                                        } else {
                                            class73.method1520(var12, var13, var10.field2617, var10.field2546, var130);
                                        }
                                    } else if (var10.field2557) {
                                        class73.method1516(var12, var13, var10.field2617, var10.field2546, var130, 256 - (var14 & 0xFF));
                                    } else {
                                        class73.method1515(var12, var13, var10.field2617, var10.field2546, var130, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2538 == 4) {
                                    class193 var131 = var10.method2826();
                                    if (var131 != null) {
                                        String var132 = var10.field2583;
                                        int var133;
                                        if (method697(var10)) {
                                            var133 = var10.field2560;
                                            if (Statics.field230 == var10 && var10.field2556 != 0) {
                                                var133 = var10.field2556;
                                            }
                                            if (var10.field2584.length() > 0) {
                                                var132 = var10.field2584;
                                            }
                                        } else {
                                            var133 = var10.field2553;
                                            if (Statics.field230 == var10 && var10.field2555 != 0) {
                                                var133 = var10.field2555;
                                            }
                                        }
                                        if (var10.field2535 && var10.field2640 != -1) {
                                            class45 var134 = class45.method2458(var10.field2640);
                                            var132 = var134.field1016;
                                            if (var132 == null) {
                                                var132 = "null";
                                            }
                                            if ((var134.field1028 == 1 || var10.field2641 != 1) && var10.field2641 != -1) {
                                                var132 = Statics.method558(16748608) + var132 + class2.field27 + " " + 'x' + method1877(var10.field2641);
                                            }
                                        }
                                        if (field423 == var10) {
                                            class142 var10000 = (class142) null;
                                            var132 = class142.field2295;
                                            var133 = var10.field2553;
                                        }
                                        if (!var10.field2535) {
                                            var132 = method106(var132, var10);
                                        }
                                        var131.method3377(var132, var12, var13, var10.field2617, var10.field2546, var133, var10.field2588 ? 0 : -1, var10.field2576, var10.field2587, var10.field2618);
                                    } else if (class152.field2577) {
                                        method564(var10);
                                    }
                                } else if (var10.field2538 == 5) {
                                    if (var10.field2535) {
                                        class72 var136;
                                        if (var10.field2640 == -1) {
                                            var136 = var10.method2825(false);
                                        } else {
                                            var136 = class45.method1770(var10.field2640, var10.field2641, var10.field2564, var10.field2633, false);
                                        }
                                        if (var136 != null) {
                                            int var137 = var136.field1313;
                                            int var138 = var136.field1312;
                                            if (var10.field2563) {
                                                class73.method1512(var12, var13, var10.field2617 + var12, var10.field2546 + var13);
                                                int var139 = (var10.field2617 + (var137 - 1)) / var137;
                                                int var140 = (var10.field2546 + (var138 - 1)) / var138;
                                                for (int var141 = 0; var141 < var139; var141++) {
                                                    for (int var142 = 0; var142 < var140; var142++) {
                                                        if (var10.field2591 != 0) {
                                                            var136.method1446(var137 / 2 + var137 * var141 + var12, var138 / 2 + var138 * var142 + var13, var10.field2591, 4096);
                                                        } else if (var14 == 0) {
                                                            var136.method1434(var137 * var141 + var12, var138 * var142 + var13);
                                                        } else {
                                                            var136.method1440(var137 * var141 + var12, var138 * var142 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1511(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var143 = var10.field2617 * 4096 / var137;
                                                if (var10.field2591 != 0) {
                                                    var136.method1446(var10.field2617 / 2 + var12, var10.field2546 / 2 + var13, var10.field2591, var143);
                                                } else if (var14 != 0) {
                                                    var136.method1444(var12, var13, var10.field2617, var10.field2546, 256 - (var14 & 0xFF));
                                                } else if (var10.field2617 == var137 && var10.field2546 == var138) {
                                                    var136.method1434(var12, var13);
                                                } else {
                                                    var136.method1489(var12, var13, var10.field2617, var10.field2546);
                                                }
                                            }
                                        } else if (class152.field2577) {
                                            method564(var10);
                                        }
                                    } else {
                                        class72 var135 = var10.method2825(method697(var10));
                                        if (var135 != null) {
                                            var135.method1434(var12, var13);
                                        } else if (class152.field2577) {
                                            method564(var10);
                                        }
                                    }
                                } else if (var10.field2538 == 6) {
                                    boolean var144 = method697(var10);
                                    int var145;
                                    if (var144) {
                                        var145 = var10.field2541;
                                    } else {
                                        var145 = var10.field2572;
                                    }
                                    class98 var146 = null;
                                    int var147 = 0;
                                    if (var10.field2640 != -1) {
                                        class45 var148 = class45.method2458(var10.field2640);
                                        if (var148 != null) {
                                            class45 var149 = var148.method850(var10.field2641);
                                            var146 = var149.method849(1);
                                            if (var146 == null) {
                                                method564(var10);
                                            } else {
                                                var146.method1979();
                                                var147 = var146.field1353 / 2;
                                            }
                                        }
                                    } else if (var10.field2568 == 5) {
                                        if (var10.field2580 == 0) {
                                            var146 = field514.method2917((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var146 = Statics.field892.method19();
                                        }
                                    } else if (var145 == -1) {
                                        var146 = var10.method2873((class38) null, -1, var144, Statics.field892.field36);
                                        if (var146 == null && class152.field2577) {
                                            method564(var10);
                                        }
                                    } else {
                                        class38 var150 = class38.method595(var145);
                                        var146 = var10.method2873(var150, var10.field2642, var144, Statics.field892.field36);
                                        if (var146 == null && class152.field2577) {
                                            method564(var10);
                                        }
                                    }
                                    class84.method1779(var10.field2617 / 2 + var12, var10.field2546 / 2 + var13);
                                    int var151 = var10.field2629 * class84.field1478[var10.field2628] >> 16;
                                    int var152 = var10.field2629 * class84.field1489[var10.field2628] >> 16;
                                    if (var146 != null) {
                                        if (var10.field2535) {
                                            var146.method1979();
                                            if (var10.field2581) {
                                                var146.method1988(0, var10.field2554, var10.field2578, var10.field2628, var10.field2574, var10.field2575 + var147 + var151, var10.field2575 + var152, var10.field2629);
                                            } else {
                                                var146.method2036(0, var10.field2554, var10.field2578, var10.field2628, var10.field2574, var10.field2575 + var147 + var151, var10.field2575 + var152);
                                            }
                                        } else {
                                            var146.method2036(0, var10.field2554, 0, var10.field2628, 0, var151, var152);
                                        }
                                    }
                                    class84.method1836();
                                } else {
                                    if (var10.field2538 == 7) {
                                        class193 var153 = var10.method2826();
                                        if (var153 == null) {
                                            if (class152.field2577) {
                                                method564(var10);
                                            }
                                            continue;
                                        }
                                        int var154 = 0;
                                        for (int var155 = 0; var155 < var10.field2546; var155++) {
                                            for (int var156 = 0; var156 < var10.field2617; var156++) {
                                                if (var10.field2638[var154] > 0) {
                                                    class45 var157 = class45.method2458(var10.field2638[var154] - 1);
                                                    String var158;
                                                    if (var157.field1028 != 1 && var10.field2639[var154] == 1) {
                                                        var158 = Statics.method558(16748608) + var157.field1016 + class2.field27;
                                                    } else {
                                                        var158 = Statics.method558(16748608) + var157.field1016 + class2.field27 + " " + 'x' + method1877(var10.field2639[var154]);
                                                    }
                                                    int var159 = (var10.field2612 + 115) * var156 + var12;
                                                    int var160 = (var10.field2590 + 12) * var155 + var13;
                                                    if (var10.field2576 == 0) {
                                                        var153.method3380(var158, var159, var160, var10.field2553, var10.field2588 ? 0 : -1);
                                                    } else if (var10.field2576 == 1) {
                                                        var153.method3371(var158, var10.field2617 / 2 + var159, var160, var10.field2553, var10.field2588 ? 0 : -1);
                                                    } else {
                                                        var153.method3370(var158, var10.field2617 + var159 - 1, var160, var10.field2553, var10.field2588 ? 0 : -1);
                                                    }
                                                }
                                                var154++;
                                            }
                                        }
                                    }
                                    if (var10.field2538 == 8 && Statics.field176 == var10 && field411 == field410) {
                                        int var161 = 0;
                                        int var162 = 0;
                                        class193 var163 = Statics.field891;
                                        String var164 = var10.field2583;
                                        String var165 = method106(var164, var10);
                                        while (var165.length() > 0) {
                                            int var166 = var165.indexOf(class2.field26);
                                            String var167;
                                            if (var166 == -1) {
                                                var167 = var165;
                                                var165 = "";
                                            } else {
                                                var167 = var165.substring(0, var166);
                                                var165 = var165.substring(var166 + 4);
                                            }
                                            int var168 = var163.method3421(var167);
                                            if (var168 > var161) {
                                                var161 = var168;
                                            }
                                            var162 += var163.field2907 + 1;
                                        }
                                        var161 += 6;
                                        var162 += 7;
                                        int var169 = var10.field2617 + var12 - 5 - var161;
                                        int var170 = var10.field2546 + var13 + 5;
                                        if (var169 < var12 + 5) {
                                            var169 = var12 + 5;
                                        }
                                        if (var161 + var169 > arg4) {
                                            var169 = arg4 - var161;
                                        }
                                        if (var162 + var170 > arg5) {
                                            var170 = arg5 - var162;
                                        }
                                        class73.method1517(var169, var170, var161, var162, 16777120);
                                        class73.method1520(var169, var170, var161, var162, 0);
                                        String var171 = var10.field2583;
                                        int var172 = var163.field2907 + var170 + 2;
                                        String var173 = method106(var171, var10);
                                        while (var173.length() > 0) {
                                            int var174 = var173.indexOf(class2.field26);
                                            String var175;
                                            if (var174 == -1) {
                                                var175 = var173;
                                                var173 = "";
                                            } else {
                                                var175 = var173.substring(0, var174);
                                                var173 = var173.substring(var174 + 4);
                                            }
                                            var163.method3380(var175, var169 + 3, var172, 0, -1);
                                            var172 += var163.field2907 + 1;
                                        }
                                    }
                                    if (var10.field2538 == 9) {
                                        if (var10.field2550 == 1) {
                                            class73.method1525(var12, var13, var10.field2617 + var12, var10.field2546 + var13, var10.field2553);
                                        } else {
                                            int var176 = var10.field2617 >= 0 ? var10.field2617 : -var10.field2617;
                                            int var177 = var10.field2546 >= 0 ? var10.field2546 : -var10.field2546;
                                            int var178 = var176;
                                            if (var176 < var177) {
                                                var178 = var177;
                                            }
                                            if (var178 != 0) {
                                                int var179 = (var10.field2617 << 16) / var178;
                                                int var180 = (var10.field2546 << 16) / var178;
                                                if (var180 <= var179) {
                                                    var179 = -var179;
                                                } else {
                                                    var180 = -var180;
                                                }
                                                int var181 = var10.field2550 * var180 >> 17;
                                                int var182 = var10.field2550 * var180 + 1 >> 17;
                                                int var183 = var10.field2550 * var179 >> 17;
                                                int var184 = var10.field2550 * var179 + 1 >> 17;
                                                int var185 = var12 + var181;
                                                int var186 = var12 - var182;
                                                int var187 = var10.field2617 + var12 - var182;
                                                int var188 = var10.field2617 + var12 + var181;
                                                int var189 = var13 + var183;
                                                int var190 = var13 - var184;
                                                int var191 = var10.field2546 + var13 - var184;
                                                int var192 = var10.field2546 + var13 + var183;
                                                class84.method1784(var185, var186, var187);
                                                class84.method1787(var189, var190, var191, var185, var186, var187, var10.field2553);
                                                class84.method1784(var185, var187, var188);
                                                class84.method1787(var189, var191, var192, var185, var187, var188, var10.field2553);
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

    @ObfuscatedName("q.cu(Ljava/lang/String;Lea;I)Ljava/lang/String;")
    public static String method106(String arg0, class152 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2522(Statics.method465(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field2026 != null) {
                    int var6 = Statics.field2026.field2075;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field2026.field2070 != null) {
                        var5 = (String) Statics.field2026.field2070;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cq.cd(II)Ljava/lang/String;")
    public static final String method1877(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field25 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + Statics.method558(65408) + var1.substring(0, var1.length() - 8) + class142.field2316 + " " + class2.field33 + var1 + class2.field24 + class2.field27;
        } else if (var1.length() > 6) {
            return " " + Statics.method558(16777215) + var1.substring(0, var1.length() - 4) + class142.field2318 + " " + class2.field33 + var1 + class2.field24 + class2.field27;
        } else {
            return " " + Statics.method558(16776960) + var1 + class2.field27;
        }
    }

    @ObfuscatedName("di.cs(Lea;IIIIIII)V")
    public static final void method2242(class152 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field338) {
            field409 = 32;
        } else {
            field409 = 0;
        }
        field338 = false;
        if (class127.field2011 == 1 || !Statics.field171 && class127.field2011 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2643 -= 4;
                method564(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2643 += 4;
                method564(arg0);
            } else if (arg5 >= arg1 - field409 && arg5 < field409 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2643 = (arg4 - arg3) * var8 / var9;
                method564(arg0);
                field338 = true;
            }
        }
        if (field381 == 0) {
            return;
        }
        int var10 = arg0.field2617;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2643 += field381 * 45;
            method564(arg0);
        }
    }

    @ObfuscatedName("ds.co(II)Ljava/lang/String;")
    public static final String method2522(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("av.ch(Lea;I)Z")
    public static final boolean method697(class152 arg0) {
        if (arg0.field2635 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2635.length; var1++) {
            int var2 = Statics.method465(arg0, var1);
            int var3 = arg0.field2634[var1];
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

    @ObfuscatedName("bv.cy(Lea;III)V")
    public static final void method1391(class152 arg0, int arg1, int arg2) {
        if (arg0.field2539 == 1) {
            method2696(arg0.field2637, "", 24, 0, 0, arg0.field2536);
        }
        if (arg0.field2539 == 2 && !field314) {
            String var3 = method496(arg0);
            if (var3 != null) {
                method2696(var3, Statics.method558(65280) + arg0.field2636, 25, 0, -1, arg0.field2536);
            }
        }
        if (arg0.field2539 == 3) {
            method2696(class142.field2314, "", 26, 0, 0, arg0.field2536);
        }
        if (arg0.field2539 == 4) {
            method2696(arg0.field2637, "", 28, 0, 0, arg0.field2536);
        }
        if (arg0.field2539 == 5) {
            method2696(arg0.field2637, "", 29, 0, 0, arg0.field2536);
        }
        if (arg0.field2539 == 6 && field423 == null) {
            method2696(arg0.field2637, "", 30, 0, -1, arg0.field2536);
        }
        if (arg0.field2538 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2546; var5++) {
                for (int var6 = 0; var6 < arg0.field2617; var6++) {
                    int var7 = (arg0.field2612 + 32) * var6;
                    int var8 = (arg0.field2590 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2603[var4];
                        var8 += arg0.field2592[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field372 = var4;
                        Statics.field1298 = arg0;
                        if (arg0.field2638[var4] > 0) {
                            label315: {
                                class45 var9 = class45.method2458(arg0.field2638[var4] - 1);
                                if (field412 == 1) {
                                    int var10 = method143(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field1458 != arg0.field2536 || Statics.field698 != var4) {
                                            method2696(class142.field2348, field413 + " " + class2.field21 + " " + Statics.method558(16748608) + var9.field1016, 31, var9.field1015, var4, arg0.field2536);
                                        }
                                        break label315;
                                    }
                                }
                                if (!field314 || !class156.method736(method143(arg0))) {
                                    String[] var12 = var9.field1032;
                                    if (field432) {
                                        var12 = method560(var12);
                                    }
                                    if (class156.method736(method143(arg0))) {
                                        for (int var13 = 4; var13 >= 3; var13--) {
                                            if (var12 != null && var12[var13] != null) {
                                                byte var14;
                                                if (var13 == 3) {
                                                    var14 = 36;
                                                } else {
                                                    var14 = 37;
                                                }
                                                method2696(var12[var13], Statics.method558(16748608) + var9.field1016, var14, var9.field1015, var4, arg0.field2536);
                                            } else if (var13 == 4) {
                                                method2696(class142.field2157, Statics.method558(16748608) + var9.field1016, 37, var9.field1015, var4, arg0.field2536);
                                            }
                                        }
                                    }
                                    int var15 = method143(arg0);
                                    boolean var16 = (var15 >> 31 & 0x1) != 0;
                                    if (var16) {
                                        method2696(class142.field2348, Statics.method558(16748608) + var9.field1016, 38, var9.field1015, var4, arg0.field2536);
                                    }
                                    class156 var10000 = (class156) null;
                                    if (class156.method736(method143(arg0)) && var12 != null) {
                                        for (int var17 = 2; var17 >= 0; var17--) {
                                            if (var12[var17] != null) {
                                                byte var18 = 0;
                                                if (var17 == 0) {
                                                    var18 = 33;
                                                }
                                                if (var17 == 1) {
                                                    var18 = 34;
                                                }
                                                if (var17 == 2) {
                                                    var18 = 35;
                                                }
                                                method2696(var12[var17], Statics.method558(16748608) + var9.field1016, var18, var9.field1015, var4, arg0.field2536);
                                            }
                                        }
                                    }
                                    String[] var19 = arg0.field2594;
                                    if (field432) {
                                        var19 = method560(var19);
                                    }
                                    if (var19 != null) {
                                        for (int var20 = 4; var20 >= 0; var20--) {
                                            if (var19[var20] != null) {
                                                byte var21 = 0;
                                                if (var20 == 0) {
                                                    var21 = 39;
                                                }
                                                if (var20 == 1) {
                                                    var21 = 40;
                                                }
                                                if (var20 == 2) {
                                                    var21 = 41;
                                                }
                                                if (var20 == 3) {
                                                    var21 = 42;
                                                }
                                                if (var20 == 4) {
                                                    var21 = 43;
                                                }
                                                method2696(var19[var20], Statics.method558(16748608) + var9.field1016, var21, var9.field1015, var4, arg0.field2536);
                                            }
                                        }
                                    }
                                    method2696(class142.field2306, Statics.method558(16748608) + var9.field1016, 1005, var9.field1015, var4, arg0.field2536);
                                } else if ((Statics.field1113 & 0x10) == 16) {
                                    method2696(field417, field287 + " " + class2.field21 + " " + Statics.method558(16748608) + var9.field1016, 32, var9.field1015, var4, arg0.field2536);
                                }
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2535) {
            return;
        }
        if (field314) {
            int var22 = method143(arg0);
            boolean var23 = (var22 >> 21 & 0x1) != 0;
            if (var23 && (Statics.field1113 & 0x20) == 32) {
                method2696(field417, field287 + " " + class2.field21 + " " + arg0.field2596, 58, 0, arg0.field2650, arg0.field2536);
            }
            return;
        }
        for (int var24 = 9; var24 >= 5; var24--) {
            String var25;
            if (!class156.method131(method143(arg0), var24) && arg0.field2623 == null) {
                var25 = null;
            } else if (arg0.field2597 == null || arg0.field2597.length <= var24 || arg0.field2597[var24] == null || arg0.field2597[var24].trim().length() == 0) {
                var25 = null;
            } else {
                var25 = arg0.field2597[var24];
            }
            if (var25 != null) {
                method2696(var25, arg0.field2596, 1007, var24 + 1, arg0.field2650, arg0.field2536);
            }
        }
        String var27 = method496(arg0);
        if (var27 != null) {
            method2696(var27, arg0.field2596, 25, 0, arg0.field2650, arg0.field2536);
        }
        for (int var28 = 4; var28 >= 0; var28--) {
            String var29;
            if (!class156.method131(method143(arg0), var28) && arg0.field2623 == null) {
                var29 = null;
            } else if (arg0.field2597 == null || arg0.field2597.length <= var28 || arg0.field2597[var28] == null || arg0.field2597[var28].trim().length() == 0) {
                var29 = null;
            } else {
                var29 = arg0.field2597[var28];
            }
            if (var29 != null) {
                method2696(var29, arg0.field2596, 57, var28 + 1, arg0.field2650, arg0.field2536);
            }
        }
        if (class156.method2683(method143(arg0))) {
            method2696(class142.field2260, "", 30, 0, arg0.field2650, arg0.field2536);
        }
    }

    @ObfuscatedName("bv.cj(IIIIIIIB)V")
    public static final void method1408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class152.method561(arg0)) {
            method2395(Statics.field2579[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("dq.cx([Lea;IIIIIIIS)V")
    public static final void method2395(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class152 var9 = arg0[var8];
            if (var9 != null && (!var9.field2535 || var9.field2538 == 0 || var9.field2652 || method143(var9) != 0 || field339 == var9) && var9.field2547 == arg1 && (!var9.field2535 || !method760(var9))) {
                int var10 = var9.field2615 + arg6;
                int var11 = var9.field2542 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2538 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2538 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2617 + var10;
                    int var19 = var9.field2546 + var11;
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
                    int var22 = var9.field2617 + var10;
                    int var23 = var9.field2546 + var11;
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
                if (!var9.field2535 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field2010;
                    int var25 = class127.field2017 * -991203695;
                    if (class127.field2022 != 0) {
                        var24 = class127.field2023;
                        var25 = class127.field2015;
                    }
                    if (var9.field2631 == 1337) {
                        method564(var9);
                        if (!field264 && !field278 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2048(var24, var25, var12, var13);
                        }
                    } else if (var9.field2631 != 1338) {
                        if (!field278 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1391(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2538 == 0) {
                            if (!var9.field2535 && method760(var9) && Statics.field230 != var9) {
                                continue;
                            }
                            method2395(arg0, var9.field2536, var12, var13, var14, var15, var10 - var9.field2549, var11 - var9.field2643);
                            if (var9.field2644 != null) {
                                method2395(var9.field2644, var9.field2536, var12, var13, var14, var15, var10 - var9.field2549, var11 - var9.field2643);
                            }
                            class4 var37 = (class4) field379.method3197((long) var9.field2536);
                            if (var37 != null) {
                                if (var37.field61 == 0 && class127.field2010 >= var12 && class127.field2017 * -991203695 >= var13 && class127.field2010 < var14 && class127.field2017 * -991203695 < var15 && !field278 && !field474) {
                                    field475[0] = class142.field2391;
                                    field397[0] = "";
                                    field404[0] = 1006;
                                    field321 = 1;
                                }
                                method1408(var37.field68, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2535) {
                            if (var9.field2565 && class127.field2010 >= var12 && class127.field2017 * -991203695 >= var13 && class127.field2010 < var14 && class127.field2017 * -991203695 < var15) {
                                for (class1 var38 = (class1) field457.method3228(); var38 != null; var38 = (class1) field457.method3254()) {
                                    if (var38.field2) {
                                        var38.method3321();
                                        var38.field4.field2611 = false;
                                    }
                                }
                                if (Statics.field90 == 0) {
                                    field431 = null;
                                    field339 = null;
                                }
                                if (!field278) {
                                    field475[0] = class142.field2391;
                                    field397[0] = "";
                                    field404[0] = 1006;
                                    field321 = 1;
                                }
                            }
                            boolean var39;
                            if (class127.field2010 >= var12 && class127.field2017 * -991203695 >= var13 && class127.field2010 < var14 && class127.field2017 * -991203695 < var15) {
                                var39 = true;
                            } else {
                                var39 = false;
                            }
                            boolean var40 = false;
                            if ((class127.field2011 == 1 || !Statics.field171 && class127.field2011 == 4) && var39) {
                                var40 = true;
                            }
                            boolean var41 = false;
                            if ((class127.field2022 == 1 || !Statics.field171 && class127.field2022 == 4) && class127.field2023 >= var12 && class127.field2015 >= var13 && class127.field2023 < var14 && class127.field2015 < var15) {
                                var41 = true;
                            }
                            if (var41) {
                                method7(var9, class127.field2023 - var10, class127.field2015 - var11);
                            }
                            if (field431 != null && field431 != var9 && var39) {
                                int var42 = method143(var9);
                                boolean var43 = (var42 >> 20 & 0x1) != 0;
                                if (var43) {
                                    field435 = var9;
                                }
                            }
                            if (field339 == var9) {
                                field436 = true;
                                field437 = var10;
                                field492 = var11;
                            }
                            if (var9.field2652) {
                                if (var39 && field381 != 0 && var9.field2624 != null) {
                                    class1 var44 = new class1();
                                    var44.field2 = true;
                                    var44.field4 = var9;
                                    var44.field5 = field381;
                                    var44.field8 = var9.field2624;
                                    field457.method3223(var44);
                                }
                                if (field431 != null || Statics.field915 != null || field278) {
                                    var41 = false;
                                    var40 = false;
                                    var39 = false;
                                }
                                if (!var9.field2646 && var41) {
                                    var9.field2646 = true;
                                    if (var9.field2605 != null) {
                                        class1 var45 = new class1();
                                        var45.field2 = true;
                                        var45.field4 = var9;
                                        var45.field6 = class127.field2023 - var10;
                                        var45.field5 = class127.field2015 - var11;
                                        var45.field8 = var9.field2605;
                                        field457.method3223(var45);
                                    }
                                }
                                if (var9.field2646 && var40 && var9.field2606 != null) {
                                    class1 var46 = new class1();
                                    var46.field2 = true;
                                    var46.field4 = var9;
                                    var46.field6 = class127.field2010 - var10;
                                    var46.field5 = class127.field2017 * -991203695 - var11;
                                    var46.field8 = var9.field2606;
                                    field457.method3223(var46);
                                }
                                if (var9.field2646 && !var40) {
                                    var9.field2646 = false;
                                    if (var9.field2607 != null) {
                                        class1 var47 = new class1();
                                        var47.field2 = true;
                                        var47.field4 = var9;
                                        var47.field6 = class127.field2010 - var10;
                                        var47.field5 = class127.field2017 * -991203695 - var11;
                                        var47.field8 = var9.field2607;
                                        field459.method3223(var47);
                                    }
                                }
                                if (var40 && var9.field2608 != null) {
                                    class1 var48 = new class1();
                                    var48.field2 = true;
                                    var48.field4 = var9;
                                    var48.field6 = class127.field2010 - var10;
                                    var48.field5 = class127.field2017 * -991203695 - var11;
                                    var48.field8 = var9.field2608;
                                    field457.method3223(var48);
                                }
                                if (!var9.field2611 && var39) {
                                    var9.field2611 = true;
                                    if (var9.field2609 != null) {
                                        class1 var49 = new class1();
                                        var49.field2 = true;
                                        var49.field4 = var9;
                                        var49.field6 = class127.field2010 - var10;
                                        var49.field5 = class127.field2017 * -991203695 - var11;
                                        var49.field8 = var9.field2609;
                                        field457.method3223(var49);
                                    }
                                }
                                if (var9.field2611 && var39 && var9.field2610 != null) {
                                    class1 var50 = new class1();
                                    var50.field2 = true;
                                    var50.field4 = var9;
                                    var50.field6 = class127.field2010 - var10;
                                    var50.field5 = class127.field2017 * -991203695 - var11;
                                    var50.field8 = var9.field2610;
                                    field457.method3223(var50);
                                }
                                if (var9.field2611 && !var39) {
                                    var9.field2611 = false;
                                    if (var9.field2526 != null) {
                                        class1 var51 = new class1();
                                        var51.field2 = true;
                                        var51.field4 = var9;
                                        var51.field6 = class127.field2010 - var10;
                                        var51.field5 = class127.field2017 * -991203695 - var11;
                                        var51.field8 = var9.field2526;
                                        field459.method3223(var51);
                                    }
                                }
                                if (var9.field2540 != null) {
                                    class1 var52 = new class1();
                                    var52.field4 = var9;
                                    var52.field8 = var9.field2540;
                                    field458.method3223(var52);
                                }
                                if (var9.field2616 != null && field445 > var9.field2648) {
                                    if (var9.field2654 == null || field445 - var9.field2648 > 32) {
                                        class1 var57 = new class1();
                                        var57.field4 = var9;
                                        var57.field8 = var9.field2616;
                                        field457.method3223(var57);
                                    } else {
                                        label518: for (int var53 = var9.field2648; var53 < field445; var53++) {
                                            int var54 = field345[var53 & 0x1F];
                                            for (int var55 = 0; var55 < var9.field2654.length; var55++) {
                                                if (var9.field2654[var55] == var54) {
                                                    class1 var56 = new class1();
                                                    var56.field4 = var9;
                                                    var56.field8 = var9.field2616;
                                                    field457.method3223(var56);
                                                    break label518;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2648 = field445;
                                }
                                if (var9.field2589 != null && field447 > var9.field2649) {
                                    if (var9.field2619 == null || field447 - var9.field2649 > 32) {
                                        class1 var62 = new class1();
                                        var62.field4 = var9;
                                        var62.field8 = var9.field2589;
                                        field457.method3223(var62);
                                    } else {
                                        label494: for (int var58 = var9.field2649; var58 < field447; var58++) {
                                            int var59 = field406[var58 & 0x1F];
                                            for (int var60 = 0; var60 < var9.field2619.length; var60++) {
                                                if (var9.field2619[var60] == var59) {
                                                    class1 var61 = new class1();
                                                    var61.field4 = var9;
                                                    var61.field8 = var9.field2589;
                                                    field457.method3223(var61);
                                                    break label494;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2649 = field447;
                                }
                                if (var9.field2602 != null && field449 > var9.field2653) {
                                    if (var9.field2621 == null || field449 - var9.field2653 > 32) {
                                        class1 var67 = new class1();
                                        var67.field4 = var9;
                                        var67.field8 = var9.field2602;
                                        field457.method3223(var67);
                                    } else {
                                        label470: for (int var63 = var9.field2653; var63 < field449; var63++) {
                                            int var64 = field448[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var9.field2621.length; var65++) {
                                                if (var9.field2621[var65] == var64) {
                                                    class1 var66 = new class1();
                                                    var66.field4 = var9;
                                                    var66.field8 = var9.field2602;
                                                    field457.method3223(var66);
                                                    break label470;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2653 = field449;
                                }
                                if (field450 > var9.field2647 && var9.field2625 != null) {
                                    class1 var68 = new class1();
                                    var68.field4 = var9;
                                    var68.field8 = var9.field2625;
                                    field457.method3223(var68);
                                }
                                if (field451 > var9.field2647 && var9.field2627 != null) {
                                    class1 var69 = new class1();
                                    var69.field4 = var9;
                                    var69.field8 = var9.field2627;
                                    field457.method3223(var69);
                                }
                                if (field452 > var9.field2647 && var9.field2544 != null) {
                                    class1 var70 = new class1();
                                    var70.field4 = var9;
                                    var70.field8 = var9.field2544;
                                    field457.method3223(var70);
                                }
                                if (field388 > var9.field2647 && var9.field2630 != null) {
                                    class1 var71 = new class1();
                                    var71.field4 = var9;
                                    var71.field8 = var9.field2630;
                                    field457.method3223(var71);
                                }
                                var9.field2647 = field443;
                                if (var9.field2569 != null) {
                                    for (int var72 = 0; var72 < field390; var72++) {
                                        class1 var73 = new class1();
                                        var73.field4 = var9;
                                        var73.field10 = field418[var72];
                                        var73.field9 = field408[var72];
                                        var73.field8 = var9.field2569;
                                        field457.method3223(var73);
                                    }
                                }
                            }
                        }
                        if (!var9.field2535 && field431 == null && Statics.field915 == null && !field278) {
                            if ((var9.field2558 >= 0 || var9.field2555 != 0) && class127.field2010 >= var12 && class127.field2017 * -991203695 >= var13 && class127.field2010 < var14 && class127.field2017 * -991203695 < var15) {
                                if (var9.field2558 >= 0) {
                                    Statics.field230 = arg0[var9.field2558];
                                } else {
                                    Statics.field230 = var9;
                                }
                            }
                            if (var9.field2538 == 8 && class127.field2010 >= var12 && class127.field2017 * -991203695 >= var13 && class127.field2010 < var14 && class127.field2017 * -991203695 < var15) {
                                Statics.field176 = var9;
                            }
                            if (var9.field2552 > var9.field2546) {
                                method2242(var9, var9.field2617 + var10, var11, var9.field2546, var9.field2552, class127.field2010, class127.field2017 * -991203695);
                            }
                        }
                    } else if ((field489 == 0 || field489 == 3) && (class127.field2022 == 1 || !Statics.field171 && class127.field2022 == 4)) {
                        int var26 = class127.field2023 - 25 - var10;
                        int var27 = class127.field2015 - 5 - var11;
                        if (var26 >= 0 && var27 >= 0 && var26 < 146 && var27 < 151 && (var26 < 0 || var26 > 23 || var27 < 117 || var27 > 142)) {
                            var26 -= 73;
                            var27 -= 75;
                            int var28 = field341 + field251 & 0x7FF;
                            int var29 = class84.field1478[var28];
                            int var30 = class84.field1489[var28];
                            int var31 = (field330 + 256) * var29 >> 8;
                            int var32 = (field330 + 256) * var30 >> 8;
                            int var33 = var26 * var32 + var27 * var31 >> 11;
                            int var34 = var27 * var32 - var26 * var31 >> 11;
                            int var35 = Statics.field892.field770 + var33 >> 7;
                            int var36 = Statics.field892.field728 - var34 >> 7;
                            field499.method2347(191);
                            field499.method2102(18);
                            field499.method2146(Statics.field1859 + var36);
                            field499.method2137(class124.field1976[82] ? (class124.field1976[81] ? 2 : 1) : 0);
                            field499.method2145(Statics.field1782 + var35);
                            field499.method2102(var26);
                            field499.method2102(var27);
                            field499.method2275(field341);
                            field499.method2102(57);
                            field499.method2102(field251);
                            field499.method2102(field330);
                            field499.method2102(89);
                            field499.method2275(Statics.field892.field770);
                            field499.method2275(Statics.field892.field728);
                            field499.method2102(63);
                            field487 = var35;
                            field488 = var36;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cl.cc(III)V")
    public static final void method2055(int arg0, int arg1) {
        if (class152.method561(arg0)) {
            method92(Statics.field2579[arg0], arg1);
        }
    }

    @ObfuscatedName("g.cq([Lea;II)V")
    public static final void method92(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2538 == 0) {
                    if (var3.field2644 != null) {
                        method92(var3.field2644, arg1);
                    }
                    class4 var4 = (class4) field379.method3197((long) var3.field2536);
                    if (var4 != null) {
                        method2055(var4.field68, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2566 != null) {
                    class1 var5 = new class1();
                    var5.field4 = var3;
                    var5.field8 = var3.field2566;
                    class32.method563(var5, 200000);
                }
                if (arg1 == 1 && var3.field2622 != null) {
                    if (var3.field2650 >= 0) {
                        class152 var6 = class152.method493(var3.field2536);
                        if (var6 == null || var6.field2644 == null || var3.field2650 >= var6.field2644.length || var6.field2644[var3.field2650] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field4 = var3;
                    var7.field8 = var3.field2622;
                    class32.method563(var7, 200000);
                }
            }
        }
    }

    @ObfuscatedName("b.cv(Lea;III)V")
    public static final void method7(class152 arg0, int arg1, int arg2) {
        if (field431 != null || field278 || arg0 == null) {
            return;
        }
        class152 var3 = arg0;
        int var4 = method143(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class152 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class152.method493(var3.field2547);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class152 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2586;
        }
        if (var9 == null) {
            return;
        }
        field431 = arg0;
        class152 var11 = arg0;
        int var12 = method143(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class152 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class152.method493(var11.field2547);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class152 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2586;
        }
        field339 = var17;
        field433 = arg1;
        field434 = arg2;
        Statics.field90 = 0;
        field346 = false;
        if (field321 > 0) {
            method676(field321 - 1);
        }
        return;
    }

    @ObfuscatedName("cy.cf(I)V")
    public static final void method1865() {
        method564(field431);
        Statics.field90++;
        if (field439 && field436) {
            int var0 = class127.field2010;
            int var1 = class127.field2017 * -991203695;
            int var2 = var0 - field433;
            int var3 = var1 - field434;
            if (var2 < field437) {
                var2 = field437;
            }
            if (field431.field2617 + var2 > field437 + field339.field2617) {
                var2 = field437 + field339.field2617 - field431.field2617;
            }
            if (var3 < field492) {
                var3 = field492;
            }
            if (field431.field2546 + var3 > field492 + field339.field2546) {
                var3 = field492 + field339.field2546 - field431.field2546;
            }
            int var4 = var2 - field440;
            int var5 = var3 - field441;
            int var6 = field431.field2599;
            if (Statics.field90 > field431.field2600 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field346 = true;
            }
            int var7 = field339.field2549 + (var2 - field437);
            int var8 = field339.field2643 + (var3 - field492);
            if (field431.field2620 != null && field346) {
                class1 var9 = new class1();
                var9.field4 = field431;
                var9.field6 = var7;
                var9.field5 = var8;
                var9.field8 = field431.field2620;
                class32.method563(var9, 200000);
            }
            if (class127.field2011 == 0) {
                if (field346) {
                    if (field431.field2613 != null) {
                        class1 var10 = new class1();
                        var10.field4 = field431;
                        var10.field6 = var7;
                        var10.field5 = var8;
                        var10.field7 = field435;
                        var10.field8 = field431.field2613;
                        class32.method563(var10, 200000);
                    }
                    if (field435 != null) {
                        class152 var11 = field431;
                        int var12 = method143(var11);
                        int var13 = var12 >> 17 & 0x7;
                        int var14 = var13;
                        class152 var15;
                        if (var13 == 0) {
                            var15 = null;
                        } else {
                            int var16 = 0;
                            while (true) {
                                if (var16 >= var14) {
                                    var15 = var11;
                                    break;
                                }
                                var11 = class152.method493(var11.field2547);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field499.method2347(27);
                            field499.method2147(field435.field2640);
                            field499.method2303(field431.field2536);
                            field499.method2235(field435.field2536);
                            field499.method2147(field435.field2650);
                            field499.method2147(field431.field2640);
                            field499.method2146(field431.field2650);
                        }
                    }
                } else {
                    label120: {
                        label91: {
                            if (field398 != 1) {
                                int var17 = field321 - 1;
                                boolean var18;
                                if (var17 < 0) {
                                    var18 = false;
                                } else {
                                    int var19 = field404[var17];
                                    if (var19 >= 2000) {
                                        var19 -= 2000;
                                    }
                                    if (var19 == 1007) {
                                        var18 = true;
                                    } else {
                                        var18 = false;
                                    }
                                }
                                if (!var18) {
                                    break label91;
                                }
                            }
                            if (field321 > 2) {
                                method153(field440 + field433, field441 + field434);
                                break label120;
                            }
                        }
                        if (field321 > 0) {
                            int var20 = field440 + field433;
                            int var21 = field441 + field434;
                            class27 var22 = Statics.field2407;
                            method88(var22.field643, var22.field644, var22.field645, var22.field646, var22.field648, var22.field648, var20, var21);
                            Statics.field2407 = null;
                        }
                    }
                }
                field431 = null;
            }
        } else if (Statics.field90 > 1) {
            field431 = null;
        }
    }

    @ObfuscatedName("ap.ce(IB)V")
    public static void method676(int arg0) {
        Statics.field2407 = new class27();
        Statics.field2407.field643 = field402[arg0];
        Statics.field2407.field644 = field471[arg0];
        Statics.field2407.field645 = field404[arg0];
        Statics.field2407.field646 = field405[arg0];
        Statics.field2407.field648 = field475[arg0];
    }

    @ObfuscatedName("aw.cm(Lea;I)V")
    public static void method564(class152 arg0) {
        if (field462 == arg0.field2626) {
            field344[arg0.field2651] = true;
        }
    }

    @ObfuscatedName("dy.cr(B)V")
    public static void method2511() {
        for (class4 var0 = (class4) field379.method3199(); var0 != null; var0 = (class4) field379.method3193()) {
            int var1 = var0.field68;
            if (class152.method561(var1)) {
                boolean var2 = true;
                class152[] var3 = Statics.field2579[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2535;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2867;
                    class152 var6 = class152.method493(var5);
                    if (var6 != null) {
                        method564(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.ck([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method560(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("p.ca(II)V")
    public static final void method146(int arg0) {
        if (!class152.method561(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2579[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3 != null) {
                var3.field2642 = 0;
                var3.field2534 = 0;
            }
        }
    }

    @ObfuscatedName("a.cp(II)V")
    public static final void method169(int arg0) {
        if (class152.method561(arg0)) {
            method1874(Statics.field2579[arg0], -1);
        }
    }

    @ObfuscatedName("cc.cw([Lea;II)V")
    public static final void method1874(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null && var3.field2547 == arg1 && (!var3.field2535 || !method760(var3))) {
                if (var3.field2538 == 0) {
                    if (!var3.field2535 && method760(var3) && Statics.field230 != var3) {
                        continue;
                    }
                    method1874(arg0, var3.field2536);
                    if (var3.field2644 != null) {
                        method1874(var3.field2644, var3.field2536);
                    }
                    class4 var4 = (class4) field379.method3197((long) var3.field2536);
                    if (var4 != null) {
                        method169(var4.field68);
                    }
                }
                if (var3.field2538 == 6) {
                    if (var3.field2572 != -1 || var3.field2541 != -1) {
                        boolean var5 = method697(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2541;
                        } else {
                            var6 = var3.field2572;
                        }
                        if (var6 != -1) {
                            class38 var7 = class38.method595(var6);
                            var3.field2534 += field335;
                            while (var3.field2534 > var7.field902[var3.field2642]) {
                                var3.field2534 -= var7.field902[var3.field2642];
                                var3.field2642++;
                                if (var3.field2642 >= var7.field906.length) {
                                    var3.field2642 -= var7.field904;
                                    if (var3.field2642 < 0 || var3.field2642 >= var7.field906.length) {
                                        var3.field2642 = 0;
                                    }
                                }
                                method564(var3);
                            }
                        }
                    }
                    if (var3.field2561 != 0 && !var3.field2535) {
                        int var8 = var3.field2561 >> 16;
                        int var9 = var3.field2561 << 16 >> 16;
                        int var10 = field335 * var8;
                        int var11 = field335 * var9;
                        var3.field2628 = var3.field2628 + var10 & 0x7FF;
                        var3.field2554 = var3.field2554 + var11 & 0x7FF;
                        method564(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ep.cl(II)V")
    public static final void method2678(int arg0) {
        method2511();
        class20.method1773();
        int var1 = class46.method1873(arg0).field1060;
        if (var1 == 0) {
            return;
        }
        int var2 = class154.field2661[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class84.method1781(0.9D);
                ((class88) Statics.field1485).method1864(0.9D);
            }
            if (var2 == 2) {
                class84.method1781(0.8D);
                ((class88) Statics.field1485).method1864(0.8D);
            }
            if (var2 == 3) {
                class84.method1781(0.7D);
                ((class88) Statics.field1485).method1864(0.7D);
            }
            if (var2 == 4) {
                class84.method1781(0.6D);
                ((class88) Statics.field1485).method1864(0.6D);
            }
            class45.field1013.method3162();
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
            if (field490 != var3) {
                if (field490 == 0 && field491 != -1) {
                    class161.method1587(Statics.field1251, field491, 0, var3, false);
                    field296 = false;
                } else if (var3 == 0) {
                    class161.method1383();
                    field296 = false;
                } else if (class161.field2714 == 0) {
                    Statics.field1930.method3030(var3);
                } else {
                    Statics.field2717 = var3;
                }
                field490 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field493 = 127;
            }
            if (var2 == 1) {
                field493 = 96;
            }
            if (var2 == 2) {
                field493 = 64;
            }
            if (var2 == 3) {
                field493 = 32;
            }
            if (var2 == 4) {
                field493 = 0;
            }
        }
        if (var1 == 5) {
            field398 = var2;
        }
        if (var1 == 6) {
            field421 = var2;
        }
        if (var1 == 9) {
            field422 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field494 = 127;
            }
            if (var2 == 1) {
                field494 = 96;
            }
            if (var2 == 2) {
                field494 = 64;
            }
            if (var2 == 3) {
                field494 = 32;
            }
            if (var2 == 4) {
                field494 = 0;
            }
        }
        if (var1 == 17) {
            field427 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class18[] var4 = new class18[] { class18.field517, class18.field518, class18.field519 };
            class18[] var5 = var4;
            int var6 = 0;
            class18 var8;
            while (true) {
                if (var6 >= var5.length) {
                    var8 = null;
                    break;
                }
                class18 var7 = var5[var6];
                if (var2 == var7.method464()) {
                    var8 = var7;
                    break;
                }
                var6++;
            }
            field282 = (class18) var8;
            if (field282 == null) {
                field282 = class18.field518;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field328 = -1;
        } else {
            field328 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("ej.cz(Lea;B)V")
    public static final void method2684(class152 arg0) {
        int var1 = arg0.field2631;
        if (var1 == 324) {
            if (field515 == -1) {
                field515 = arg0.field2585;
                field516 = arg0.field2527;
            }
            if (field514.field2671) {
                arg0.field2585 = field515;
            } else {
                arg0.field2585 = field516;
            }
        } else if (var1 == 325) {
            if (field515 == -1) {
                field515 = arg0.field2585;
                field516 = arg0.field2527;
            }
            if (field514.field2671) {
                arg0.field2585 = field516;
            } else {
                arg0.field2585 = field515;
            }
        } else if (var1 == 327) {
            arg0.field2628 = 150;
            arg0.field2554 = (int) (Math.sin((double) field265 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2568 = 5;
            arg0.field2580 = 0;
        } else if (var1 == 328) {
            arg0.field2628 = 150;
            arg0.field2554 = (int) (Math.sin((double) field265 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2568 = 5;
            arg0.field2580 = 1;
        }
    }

    @ObfuscatedName("w.ci(I)V")
    public static final void method137() {
        field499.method2347(40);
        for (class4 var0 = (class4) field379.method3199(); var0 != null; var0 = (class4) field379.method3193()) {
            if (var0.field61 == 0 || var0.field61 == 3) {
                method1061(var0, true);
            }
        }
        if (field423 != null) {
            method564(field423);
            field423 = null;
        }
    }

    @ObfuscatedName("g.df(IIII)Li;")
    public static final class4 method86(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field68 = arg1;
        var3.field61 = arg2;
        field379.method3191(var3, (long) arg0);
        method146(arg1);
        class32.method91(arg1);
        class152 var4 = class152.method493(arg0);
        if (var4 != null) {
            method564(var4);
        }
        if (field423 != null) {
            method564(field423);
            field423 = null;
        }
        method740();
        if (field477 != -1) {
            method2055(field477, 1);
        }
        return var3;
    }

    @ObfuscatedName("bl.dc(Li;ZS)V")
    public static final void method1061(class4 arg0, boolean arg1) {
        int var2 = arg0.field68;
        int var3 = (int) arg0.field2867;
        arg0.method3321();
        if (arg1 && var2 != -1 && Statics.field2537[var2]) {
            Statics.field2562.method2709(var2);
            if (Statics.field2579[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2579[var2].length; var5++) {
                    if (Statics.field2579[var2][var5] != null) {
                        if (Statics.field2579[var2][var5].field2538 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2579[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2579[var2] = null;
                }
                Statics.field2537[var2] = false;
            }
        }
        for (class179 var6 = (class179) field460.method3199(); var6 != null; var6 = (class179) field460.method3193()) {
            if ((var6.field2867 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3321();
            }
        }
        class152 var7 = class152.method493(var3);
        if (var7 != null) {
            method564(var7);
        }
        method740();
        if (field477 != -1) {
            method2055(field477, 1);
        }
    }

    @ObfuscatedName("as.di(Lea;B)Z")
    public static final boolean method636(class152 arg0) {
        int var1 = arg0.field2631;
        if (var1 == 205) {
            field332 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field514.method2912(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field514.method2913(var4, var5 == 1);
        }
        if (var1 == 324) {
            field514.method2914(false);
        }
        if (var1 == 325) {
            field514.method2914(true);
        }
        if (var1 == 326) {
            field499.method2347(252);
            field514.method2915(field499);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("m.dn(IIIILbd;I)V")
    public static final void method166(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method154(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field341 + field251 & 0x7FF;
        int var7 = class84.field1478[var6];
        int var8 = class84.field1489[var6];
        int var9 = var7 * 256 / (field330 + 256);
        int var10 = var8 * 256 / (field330 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field147.method1445(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("p.db(IIIILbd;I)V")
    public static final void method154(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field341 + field251 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1478[var5];
        int var8 = class84.field1489[var5];
        int var9 = var7 * 256 / (field330 + 256);
        int var10 = var8 * 256 / (field330 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1448(Statics.field827, arg0 + 94 + var11 - arg4.field1313 / 2 + 4, arg1 + 83 - var12 - arg4.field1312 / 2 - 4);
        } else {
            arg4.method1434(arg0 + 94 + var11 - arg4.field1313 / 2 + 4, arg1 + 83 - var12 - arg4.field1312 / 2 - 4);
        }
    }

    @ObfuscatedName("p.dl(Ljava/lang/String;ZI)Z")
    public static boolean method148(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class200.method583(arg0, Statics.field298);
        for (int var3 = 0; var3 < field329; var3++) {
            if (var2.equalsIgnoreCase(class200.method583(field510[var3].field234, Statics.field298)) && (!arg1 || field510[var3].field225 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class200.method583(Statics.field892.field55, Statics.field298))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gu.dh(Ljava/lang/String;I)Z")
    public static boolean method3470(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class200.method583(arg0, Statics.field298);
        for (int var2 = 0; var2 < field512; var2++) {
            class8 var3 = field513[var2];
            if (var1.equalsIgnoreCase(class200.method583(var3.field133, Statics.field298))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class200.method583(var3.field128, Statics.field298))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("q.dq(Ljava/lang/String;ZI)V")
    public static final void method110(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field512 < 100 || field383 == 1) || field512 >= 400) {
            class10.method1970(31, "", class142.field2367);
            return;
        }
        String var2 = class200.method583(arg0, Statics.field298);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field512; var3++) {
            class8 var4 = field513[var3];
            String var5 = class200.method583(var4.field133, Statics.field298);
            if (var5 != null && var5.equals(var2)) {
                class10.method1970(31, "", arg0 + class142.field2324);
                return;
            }
            if (var4.field128 != null) {
                String var6 = class200.method583(var4.field128, Statics.field298);
                if (var6 != null && var6.equals(var2)) {
                    class10.method1970(31, "", arg0 + class142.field2324);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field329; var7++) {
            class16 var8 = field510[var7];
            String var9 = class200.method583(var8.field234, Statics.field298);
            if (var9 != null && var9.equals(var2)) {
                class10.method1970(31, "", class142.field2357 + arg0 + class142.field2178);
                return;
            }
            if (var8.field231 != null) {
                String var10 = class200.method583(var8.field231, Statics.field298);
                if (var10 != null && var10.equals(var2)) {
                    class10.method1970(31, "", class142.field2357 + arg0 + class142.field2178);
                    return;
                }
            }
        }
        if (class200.method583(Statics.field892.field55, Statics.field298).equals(var2)) {
            class10.method1970(31, "", class142.field2326);
        } else {
            field499.method2347(185);
            field499.method2102(class107.method598(arg0));
            field499.method2107(arg0);
        }
    }

    @ObfuscatedName("g.dz(Ljava/lang/String;I)V")
    public static final void method89(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class200.method583(arg0, Statics.field298);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field329; var2++) {
            class16 var3 = field510[var2];
            String var4 = var3.field234;
            String var5 = class200.method583(var4, Statics.field298);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field329--;
                for (int var7 = var2; var7 < field329; var7++) {
                    field510[var7] = field510[var7 + 1];
                }
                field451 = field443;
                field499.method2347(233);
                field499.method2102(class107.method598(arg0));
                field499.method2107(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("b.dp(Ljava/lang/String;I)V")
    public static final void method6(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class200.method583(arg0, Statics.field298);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field512; var2++) {
            class8 var3 = field513[var2];
            String var4 = var3.field133;
            String var5 = class200.method583(var4, Statics.field298);
            if (class116.method24(arg0, var1, var4, var5)) {
                field512--;
                for (int var6 = var2; var6 < field512; var6++) {
                    field513[var6] = field513[var6 + 1];
                }
                field451 = field443;
                field499.method2347(74);
                field499.method2102(class107.method598(arg0));
                field499.method2107(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("q.do(Ljava/lang/String;II)V")
    public static final void method126(String arg0, int arg1) {
        field499.method2347(118);
        field499.method2102(class107.method598(arg0) + 1);
        field499.method2107(arg0);
        field499.method2102(arg1);
    }

    @ObfuscatedName("cd.de(Ljava/lang/String;I)V")
    public static final void method1767(String arg0) {
        if (Statics.field1994 != null) {
            field499.method2347(232);
            field499.method2102(class107.method598(arg0));
            field499.method2107(arg0);
        }
    }

    @ObfuscatedName("d.dm(Ljava/lang/String;B)V")
    public static final void method508(String arg0) {
        if (!arg0.equals("")) {
            field499.method2347(190);
            field499.method2102(class107.method598(arg0));
            field499.method2107(arg0);
        }
    }

    @ObfuscatedName("y.dk(Lea;I)I")
    public static int method143(class152 arg0) {
        class179 var1 = (class179) field460.method3197(((long) arg0.field2536 << 32) + (long) arg0.field2650);
        return var1 == null ? arg0.field2595 : var1.field2853;
    }

    @ObfuscatedName("ae.dd(Lea;S)Z")
    public static boolean method760(class152 arg0) {
        if (field474) {
            if (method143(arg0) != 0) {
                return false;
            }
            if (arg0.field2538 == 0) {
                return false;
            }
        }
        return arg0.field2548;
    }

    @ObfuscatedName("h.dr(Lea;I)Ljava/lang/String;")
    public static String method496(class152 arg0) {
        int var1 = method143(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2598 == null || arg0.field2598.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2598;
        }
    }

    @ObfuscatedName("cm.dt(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1958(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field256 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field256 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field256 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field256 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field256 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field261 + "/";
    }
}

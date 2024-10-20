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
import netscape.javascript.JSObject;

public final class client extends class128 {

    @ObfuscatedName("client.u")
    public static boolean field259 = true;

    @ObfuscatedName("client.t")
    public static int field494 = 1;

    @ObfuscatedName("client.e")
    public static int field261 = 0;

    @ObfuscatedName("client.l")
    public static int field471 = 0;

    @ObfuscatedName("client.k")
    public static boolean field296 = false;

    @ObfuscatedName("client.g")
    public static boolean field265 = false;

    @ObfuscatedName("client.d")
    public static int field301 = 0;

    @ObfuscatedName("client.i")
    public static int field268 = 0;

    @ObfuscatedName("client.o")
    public static boolean field269 = true;

    @ObfuscatedName("client.m")
    public static int field270 = 0;

    @ObfuscatedName("client.f")
    public static long field271 = -1L;

    @ObfuscatedName("client.c")
    public static int field414 = -1;

    @ObfuscatedName("client.h")
    public static int field291 = -1;

    @ObfuscatedName("client.r")
    public static int field274 = -1;

    @ObfuscatedName("client.w")
    public static class187[] field323 = new class187[4];

    @ObfuscatedName("client.p")
    public static boolean field275 = true;

    @ObfuscatedName("client.s")
    public static boolean field276 = false;

    @ObfuscatedName("client.ag")
    public static int field515 = 0;

    @ObfuscatedName("client.ad")
    public static int field422 = 0;

    @ObfuscatedName("client.ak")
    public static int field279 = 0;

    @ObfuscatedName("client.ai")
    public static int field280 = 0;

    @ObfuscatedName("client.ac")
    public static int field281 = 0;

    @ObfuscatedName("client.as")
    public static int field420 = 0;

    @ObfuscatedName("client.ar")
    public static int field283 = 0;

    @ObfuscatedName("client.an")
    public static int field497 = 0;

    @ObfuscatedName("client.ah")
    public static int field285 = 0;

    @ObfuscatedName("client.ax")
    public static class104 field421 = new class104(new byte[5000]);

    @ObfuscatedName("client.aj")
    public static class17 field287 = class17.field532;

    @ObfuscatedName("client.am")
    public static int field288 = 0;

    @ObfuscatedName("client.ab")
    public static int field290 = 0;

    @ObfuscatedName("client.aw")
    public static int field317 = 0;

    @ObfuscatedName("client.bn")
    public static int field496 = 0;

    @ObfuscatedName("client.bl")
    public static int field390 = 0;

    @ObfuscatedName("client.bz")
    public static int field434 = 0;

    @ObfuscatedName("client.bw")
    public static int field299 = 0;

    @ObfuscatedName("client.bg")
    public static int field468 = 0;

    @ObfuscatedName("client.bd")
    public static class28[] field325 = new class28[32768];

    @ObfuscatedName("client.bc")
    public static int field284 = 0;

    @ObfuscatedName("client.bs")
    public static int[] field484 = new int[32768];

    @ObfuscatedName("client.ca")
    public static class107 field340 = new class107(5000);

    @ObfuscatedName("client.cz")
    public static class107 field441 = new class107(5000);

    @ObfuscatedName("client.ck")
    public static class107 field306 = new class107(5000);

    @ObfuscatedName("client.cd")
    public static int field462 = 0;

    @ObfuscatedName("client.cs")
    public static int field308 = 0;

    @ObfuscatedName("client.ch")
    public static int field309 = 0;

    @ObfuscatedName("client.cc")
    public static int field431 = 0;

    @ObfuscatedName("client.ci")
    public static int field311 = 0;

    @ObfuscatedName("client.cv")
    public static int field312 = 0;

    @ObfuscatedName("client.cb")
    public static int field502 = 0;

    @ObfuscatedName("client.cw")
    public static int field417 = 0;

    @ObfuscatedName("client.cr")
    public static boolean field315 = false;

    @ObfuscatedName("client.cu")
    public static int field408 = 0;

    @ObfuscatedName("client.cj")
    public static int field376 = 0;

    @ObfuscatedName("client.dc")
    public static int field319 = 1;

    @ObfuscatedName("client.dt")
    public static int field320 = 0;

    @ObfuscatedName("client.dm")
    public static int field305 = 1;

    @ObfuscatedName("client.dq")
    public static int field322 = 0;

    @ObfuscatedName("client.dn")
    public static boolean field522 = false;

    @ObfuscatedName("client.dp")
    public static int[][][] field331 = new int[4][13][13];

    @ObfuscatedName("client.dx")
    public static final int[] field482 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dr")
    public static int field307 = 0;

    @ObfuscatedName("client.dg")
    public static int field328 = 2;

    @ObfuscatedName("client.di")
    public static int field302 = 0;

    @ObfuscatedName("client.de")
    public static int field330 = 2;

    @ObfuscatedName("client.dl")
    public static int field273 = 0;

    @ObfuscatedName("client.dz")
    public static int field332 = 1;

    @ObfuscatedName("client.da")
    public static int field384 = 0;

    @ObfuscatedName("client.db")
    public static int field334 = 0;

    @ObfuscatedName("client.dj")
    public static int field355 = 2;

    @ObfuscatedName("client.df")
    public static int field451 = 0;

    @ObfuscatedName("client.ek")
    public static int field337 = 1;

    @ObfuscatedName("client.ez")
    public static int field341 = 0;

    @ObfuscatedName("client.ef")
    public static int field339 = 0;

    @ObfuscatedName("client.ed")
    public static int field342 = 2301979;

    @ObfuscatedName("client.ei")
    public static int field446 = 5063219;

    @ObfuscatedName("client.eu")
    public static int field344 = 3353893;

    @ObfuscatedName("client.ev")
    public static int field266 = 7759444;

    @ObfuscatedName("client.en")
    public static boolean field326 = false;

    @ObfuscatedName("client.fn")
    public static int field347 = 0;

    @ObfuscatedName("client.fk")
    public static int field348 = 128;

    @ObfuscatedName("client.fu")
    public static int field466 = 0;

    @ObfuscatedName("client.fw")
    public static int field327 = 0;

    @ObfuscatedName("client.fa")
    public static int field351 = 0;

    @ObfuscatedName("client.fc")
    public static int field403 = 0;

    @ObfuscatedName("client.fo")
    public static int field353 = 0;

    @ObfuscatedName("client.fr")
    public static int field354 = 0;

    @ObfuscatedName("client.fj")
    public static boolean field526 = false;

    @ObfuscatedName("client.fl")
    public static int field356 = 0;

    @ObfuscatedName("client.fb")
    public static int field357 = 0;

    @ObfuscatedName("client.ft")
    public static int field358 = 50;

    @ObfuscatedName("client.fs")
    public static int[] field438 = new int[field358];

    @ObfuscatedName("client.fp")
    public static int[] field360 = new int[field358];

    @ObfuscatedName("client.fe")
    public static int[] field352 = new int[field358];

    @ObfuscatedName("client.fm")
    public static int[] field495 = new int[field358];

    @ObfuscatedName("client.fx")
    public static int[] field363 = new int[field358];

    @ObfuscatedName("client.fy")
    public static int[] field501 = new int[field358];

    @ObfuscatedName("client.fd")
    public static int[] field365 = new int[field358];

    @ObfuscatedName("client.gs")
    public static String[] field366 = new String[field358];

    @ObfuscatedName("client.gj")
    public static int[][] field346 = new int[104][104];

    @ObfuscatedName("client.gc")
    public static int field278 = 0;

    @ObfuscatedName("client.gv")
    public static int field369 = -1;

    @ObfuscatedName("client.gq")
    public static int field370 = -1;

    @ObfuscatedName("client.gl")
    public static int field371 = 0;

    @ObfuscatedName("client.gz")
    public static int field372 = 0;

    @ObfuscatedName("client.gk")
    public static int field373 = 0;

    @ObfuscatedName("client.gp")
    public static int field374 = 0;

    @ObfuscatedName("client.gi")
    public static int field375 = 0;

    @ObfuscatedName("client.gw")
    public static int field264 = 0;

    @ObfuscatedName("client.gm")
    public static int field377 = 0;

    @ObfuscatedName("client.gf")
    public static int field378 = 0;

    @ObfuscatedName("client.gt")
    public static int field379 = 0;

    @ObfuscatedName("client.gr")
    public static int field380 = 0;

    @ObfuscatedName("client.gu")
    public static boolean field381 = false;

    @ObfuscatedName("client.gx")
    public static int field450 = 0;

    @ObfuscatedName("client.ga")
    public static int field383 = 0;

    @ObfuscatedName("client.gb")
    public static class3[] field510 = new class3[2048];

    @ObfuscatedName("client.gy")
    public static int field385 = 0;

    @ObfuscatedName("client.gg")
    public static int[] field386 = new int[2048];

    @ObfuscatedName("client.hf")
    public static int field387 = 0;

    @ObfuscatedName("client.hm")
    public static int[] field388 = new int[2048];

    @ObfuscatedName("client.hv")
    public static class104[] field389 = new class104[2048];

    @ObfuscatedName("client.hy")
    public static int field445 = -1;

    @ObfuscatedName("client.hg")
    public static int field303 = 0;

    @ObfuscatedName("client.ht")
    public static int field392 = 0;

    @ObfuscatedName("client.hb")
    public static int[] field393 = new int[1000];

    @ObfuscatedName("client.hz")
    public static final int[] field394 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hl")
    public static String[] field476 = new String[8];

    @ObfuscatedName("client.hj")
    public static boolean[] field396 = new boolean[8];

    @ObfuscatedName("client.hc")
    public static int[] field397 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hd")
    public static int field398 = -1;

    @ObfuscatedName("client.hr")
    public static class171[][][] field473 = new class171[4][104][104];

    @ObfuscatedName("client.hp")
    public static class171 field400 = new class171();

    @ObfuscatedName("client.hu")
    public static class171 field401 = new class171();

    @ObfuscatedName("client.hi")
    public static class171 field402 = new class171();

    @ObfuscatedName("client.hw")
    public static int[] field262 = new int[25];

    @ObfuscatedName("client.hk")
    public static int[] field318 = new int[25];

    @ObfuscatedName("client.hh")
    public static int[] field293 = new int[25];

    @ObfuscatedName("client.hx")
    public static int field277 = 0;

    @ObfuscatedName("client.hs")
    public static boolean field333 = false;

    @ObfuscatedName("client.in")
    public static int field286 = 0;

    @ObfuscatedName("client.iv")
    public static int[] field409 = new int[500];

    @ObfuscatedName("client.ir")
    public static int[] field349 = new int[500];

    @ObfuscatedName("client.ik")
    public static int[] field411 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field412 = new int[500];

    @ObfuscatedName("client.id")
    public static String[] field413 = new String[500];

    @ObfuscatedName("client.iy")
    public static String[] field525 = new String[500];

    @ObfuscatedName("client.ie")
    public static int field399 = -1;

    @ObfuscatedName("client.il")
    public static int field416 = -1;

    @ObfuscatedName("client.ia")
    public static int field321 = 0;

    @ObfuscatedName("client.iw")
    public static int field418 = 50;

    @ObfuscatedName("client.ig")
    public static int field419 = 0;

    @ObfuscatedName("client.it")
    public static String field310 = null;

    @ObfuscatedName("client.ib")
    public static boolean field350 = false;

    @ObfuscatedName("client.iq")
    public static int field343 = -1;

    @ObfuscatedName("client.jg")
    public static String field423 = null;

    @ObfuscatedName("client.jf")
    public static String field424 = null;

    @ObfuscatedName("client.jz")
    public static int field425 = -1;

    @ObfuscatedName("client.ja")
    public static class169 field426 = new class169(8);

    @ObfuscatedName("client.jc")
    public static int field427 = 0;

    @ObfuscatedName("client.jd")
    public static int field428 = 0;

    @ObfuscatedName("client.jr")
    public static class148 field429 = null;

    @ObfuscatedName("client.jt")
    public static int field430 = 0;

    @ObfuscatedName("client.jn")
    public static int field481 = 0;

    @ObfuscatedName("client.jk")
    public static int field432 = 0;

    @ObfuscatedName("client.jm")
    public static int field272 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field405 = false;

    @ObfuscatedName("client.jp")
    public static boolean field435 = false;

    @ObfuscatedName("client.jo")
    public static boolean field436 = false;

    @ObfuscatedName("client.jq")
    public static class148 field437 = null;

    @ObfuscatedName("client.je")
    public static class148 field498 = null;

    @ObfuscatedName("client.ju")
    public static int field439 = 0;

    @ObfuscatedName("client.jl")
    public static int field440 = 0;

    @ObfuscatedName("client.jv")
    public static class148 field404 = null;

    @ObfuscatedName("client.jb")
    public static boolean field442 = false;

    @ObfuscatedName("client.js")
    public static int field443 = -1;

    @ObfuscatedName("client.jy")
    public static int field444 = -1;

    @ObfuscatedName("client.jx")
    public static boolean field368 = false;

    @ObfuscatedName("client.jj")
    public static int field324 = -1;

    @ObfuscatedName("client.ji")
    public static int field447 = -1;

    @ObfuscatedName("client.jh")
    public static boolean field448 = false;

    @ObfuscatedName("client.kj")
    public static int field449 = 1;

    @ObfuscatedName("client.kw")
    public static int[] field452 = new int[32];

    @ObfuscatedName("client.kg")
    public static int field338 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field407 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field453 = 0;

    @ObfuscatedName("client.kh")
    public static int[] field454 = new int[32];

    @ObfuscatedName("client.kr")
    public static int field455 = 0;

    @ObfuscatedName("client.ke")
    public static int field456 = 0;

    @ObfuscatedName("client.kb")
    public static int field457 = 0;

    @ObfuscatedName("client.kv")
    public static int field458 = 0;

    @ObfuscatedName("client.kp")
    public static int field459 = 0;

    @ObfuscatedName("client.km")
    public static int[] field460 = new int[2000];

    @ObfuscatedName("client.ks")
    public static String[] field461 = new String[1000];

    @ObfuscatedName("client.kx")
    public static int field298 = 0;

    @ObfuscatedName("client.ku")
    public static class171 field507 = new class171();

    @ObfuscatedName("client.ka")
    public static class171 field464 = new class171();

    @ObfuscatedName("client.kn")
    public static class171 field465 = new class171();

    @ObfuscatedName("client.kk")
    public static class169 field282 = new class169(512);

    @ObfuscatedName("client.lc")
    public static int field467 = 0;

    @ObfuscatedName("client.lm")
    public static int field463 = -2;

    @ObfuscatedName("client.ln")
    public static boolean[] field469 = new boolean[100];

    @ObfuscatedName("client.lo")
    public static boolean[] field470 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static boolean[] field395 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static int[] field472 = new int[100];

    @ObfuscatedName("client.lj")
    public static int[] field300 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field474 = new int[100];

    @ObfuscatedName("client.ly")
    public static int[] field475 = new int[100];

    @ObfuscatedName("client.ll")
    public static int field499 = 0;

    @ObfuscatedName("client.lh")
    public static int[] field477 = new int[100];

    @ObfuscatedName("client.la")
    public static String[] field478 = new String[100];

    @ObfuscatedName("client.lf")
    public static String[] field382 = new String[100];

    @ObfuscatedName("client.lw")
    public static String[] field480 = new String[100];

    @ObfuscatedName("client.lb")
    public static int field433 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field513 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lp")
    public static int field483 = 0;

    @ObfuscatedName("client.lu")
    public static int field314 = 0;

    @ObfuscatedName("client.lk")
    public static long[] field485 = new long[100];

    @ObfuscatedName("client.lr")
    public static int field486 = 0;

    @ObfuscatedName("client.le")
    public static int field487 = 0;

    @ObfuscatedName("client.lq")
    public static int[] field488 = new int[128];

    @ObfuscatedName("client.mg")
    public static int[] field489 = new int[128];

    @ObfuscatedName("client.mc")
    public static long field490 = -1L;

    @ObfuscatedName("client.mo")
    public static String field491 = null;

    @ObfuscatedName("client.mr")
    public static String field492 = null;

    @ObfuscatedName("client.mm")
    public static int field493 = -1;

    @ObfuscatedName("client.mw")
    public static int field329 = 0;

    @ObfuscatedName("client.mv")
    public static int[] field364 = new int[1000];

    @ObfuscatedName("client.ml")
    public static int[] field415 = new int[1000];

    @ObfuscatedName("client.mu")
    public static class69[] field260 = new class69[1000];

    @ObfuscatedName("client.mn")
    public static int field406 = 0;

    @ObfuscatedName("client.mh")
    public static int field367 = 0;

    @ObfuscatedName("client.me")
    public static int field500 = 0;

    @ObfuscatedName("client.mk")
    public static int field289 = 255;

    @ObfuscatedName("client.mj")
    public static int field335 = -1;

    @ObfuscatedName("client.ma")
    public static boolean field503 = false;

    @ObfuscatedName("client.np")
    public static int field504 = 127;

    @ObfuscatedName("client.nx")
    public static int field505 = 127;

    @ObfuscatedName("client.nk")
    public static int field506 = 0;

    @ObfuscatedName("client.ne")
    public static int[] field361 = new int[50];

    @ObfuscatedName("client.ns")
    public static int[] field508 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field509 = new int[50];

    @ObfuscatedName("client.ny")
    public static int[] field257 = new int[50];

    @ObfuscatedName("client.nw")
    public static class49[] field511 = new class49[50];

    @ObfuscatedName("client.nz")
    public static boolean field512 = false;

    @ObfuscatedName("client.nd")
    public static boolean[] field359 = new boolean[5];

    @ObfuscatedName("client.or")
    public static int[] field514 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field479 = new int[5];

    @ObfuscatedName("client.oh")
    public static int[] field516 = new int[5];

    @ObfuscatedName("client.of")
    public static int[] field517 = new int[5];

    @ObfuscatedName("client.ou")
    public static int field518 = 0;

    @ObfuscatedName("client.oc")
    public static int field519 = 0;

    @ObfuscatedName("client.os")
    public static class15[] field520 = new class15[400];

    @ObfuscatedName("client.ov")
    public static class168 field410 = new class168();

    @ObfuscatedName("client.ol")
    public static int field362 = 0;

    @ObfuscatedName("client.ox")
    public static class8[] field523 = new class8[400];

    @ObfuscatedName("client.oi")
    public static class153 field524 = new class153();

    @ObfuscatedName("client.op")
    public static int field391 = -1;

    @ObfuscatedName("client.ot")
    public static int field304 = -1;

    @ObfuscatedName("client.u(B)V")
    public final void method187() {
    }

    public final void init() {
        if (!this.method2624()) {
            return;
        }
        class164[] var1 = class164.method2918();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2787);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2787)) {
                    case 1:
                        field471 = Integer.parseInt(var4);
                        break;
                    case 2:
                        int var11 = Integer.parseInt(var4);
                        class135[] var12 = class135.method2449();
                        int var13 = 0;
                        class135 var15;
                        while (true) {
                            if (var13 >= var12.length) {
                                var15 = null;
                                break;
                            }
                            class135 var14 = var12[var13];
                            if (var14.field2096 == var11) {
                                var15 = var14;
                                break;
                            }
                            var13++;
                        }
                        Statics.field154 = var15;
                        break;
                    case 3:
                        field261 = Integer.parseInt(var4);
                        break;
                    case 4:
                        class136[] var5 = class136.method1342();
                        int var6 = Integer.parseInt(var4);
                        class136[] var7 = var5;
                        int var8 = 0;
                        class136 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class136 var9 = var7[var8];
                            if (var6 == var9.method499()) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field191 = (class136) var10;
                        if (Statics.field191 == class136.field2101) {
                            Statics.field263 = class180.field2835;
                        } else {
                            Statics.field263 = class180.field2840;
                        }
                        break;
                    case 5:
                        field494 = Integer.parseInt(var4);
                        break;
                    case 6:
                        Statics.field267 = var4;
                    case 7:
                    default:
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class2.field26)) {
                            field296 = true;
                        } else {
                            field296 = false;
                        }
                        break;
                    case 9:
                        if (var4.equalsIgnoreCase(class2.field26)) {
                        }
                        break;
                    case 10:
                        field301 = Integer.parseInt(var4);
                }
            }
        }
        method1415();
        Statics.field701 = this.getCodeBase().getHost();
        String var16 = Statics.field154.field2095;
        byte var17 = 0;
        try {
            Statics.field2070 = 16;
            Statics.field1837 = var17;
            try {
                Statics.field2029 = System.getProperty("os.name");
            } catch (Exception var35) {
                Statics.field2029 = "Unknown";
            }
            Statics.field1997 = Statics.field2029.toLowerCase();
            try {
                Statics.field767 = System.getProperty("user.home");
                if (Statics.field767 != null) {
                    Statics.field767 = Statics.field767 + "/";
                }
            } catch (Exception var34) {
            }
            try {
                if (Statics.field1997.startsWith("win")) {
                    if (Statics.field767 == null) {
                        Statics.field767 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field767 == null) {
                    Statics.field767 = System.getenv("HOME");
                }
                if (Statics.field767 != null) {
                    Statics.field767 = Statics.field767 + "/";
                }
            } catch (Exception var33) {
            }
            if (Statics.field767 == null) {
                Statics.field767 = "~/";
            }
            Statics.field183 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field767, "/tmp/", "" };
            Statics.field1553 = new String[] { ".jagex_cache_" + Statics.field1837, ".file_store_" + Statics.field1837 };
            label130: for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2905 = class133.method2438("oldschool", var16, var21);
                if (!Statics.field2905.exists()) {
                    Statics.field2905.mkdirs();
                }
                File[] var22 = Statics.field2905.listFiles();
                if (var22 == null) {
                    break;
                }
                File[] var23 = var22;
                int var24 = 0;
                while (true) {
                    if (var24 >= var23.length) {
                        break label130;
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
                    } catch (Exception var32) {
                        var28 = false;
                    }
                    if (!var28) {
                        break;
                    }
                    var24++;
                }
            }
            class119.method2561(Statics.field2905);
            class133.method121();
            class133.field2078 = new class186(new class185(class119.method1418("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class133.field2079 = new class186(new class185(class119.method1418("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1256 = new class186[Statics.field2070];
            for (int var30 = 0; var30 < Statics.field2070; var30++) {
                Statics.field1256[var30] = new class186(new class185(class119.method1418("main_file_cache.idx" + var30), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var36) {
            class132.method508((String) null, var36);
        }
        Statics.field258 = this;
        this.method2622(765, 503, 45);
    }

    @ObfuscatedName("bw.e(I)V")
    public static final void method1415() {
        class76.field1369 = false;
        field265 = false;
    }

    @ObfuscatedName("client.a(B)V")
    public final void method189() {
        Statics.field179 = field471 == 0 ? 43594 : field494 + 40000;
        Statics.field2773 = field471 == 0 ? 443 : field494 + 50000;
        Statics.field1876 = Statics.field179;
        Statics.field2642 = class149.field2621;
        Statics.field2643 = class149.field2620;
        Statics.field2640 = class149.field2615;
        Statics.field2636 = class149.field2616;
        class121.method14();
        class121.method892(Statics.field1915);
        class124.method1341(Statics.field1915);
        class129 var1;
        try {
            var1 = new class129();
        } catch (Throwable var12) {
            var1 = null;
        }
        Statics.field68 = var1;
        if (Statics.field68 != null) {
            Statics.field68.method2456(Statics.field1915);
        }
        Statics.field1898 = new class118(255, class133.field2078, class133.field2079, 500000);
        class185 var3 = null;
        class9 var4 = new class9();
        try {
            var3 = class133.method1891("", Statics.field191.field2099, false);
            byte[] var5 = new byte[(int) var3.method3398()];
            int var7;
            for (int var6 = 0; var6 < var5.length; var6 += var7) {
                var7 = var3.method3401(var5, var6, var5.length - var6);
                if (var7 == -1) {
                    throw new IOException();
                }
            }
            var4 = new class9(new class104(var5));
        } catch (Exception var13) {
        }
        try {
            if (var3 != null) {
                var3.method3397();
            }
        } catch (Exception var11) {
        }
        Statics.field156 = var4;
        Statics.field2048 = this.getToolkit().getSystemClipboard();
        Statics.method2(this, Statics.field1900);
        if (field471 != 0) {
            field276 = true;
        }
    }

    @ObfuscatedName("client.l(B)V")
    public final void method305() {
        field270++;
        this.method193();
        class145.method12();
        class157.method552();
        method513();
        class121.method3();
        class124 var1 = class124.field1994;
        synchronized (class124.field1994) {
            class124.field1985 = class124.field1982;
            class124.field1991 = class124.field1999;
            class124.field1986 = class124.field1984;
            class124.field1992 = class124.field1987;
            class124.field1993 = class124.field1989;
            class124.field1988 = class124.field1990;
            class124.field1995 = class124.field1980;
            class124.field1987 = 0;
        }
        if (Statics.field68 != null) {
            int var3 = Statics.field68.method2458();
            field298 = var3;
        }
        if (field268 == 0) {
            method541();
            class128.method2463();
        } else if (field268 == 5) {
            class26.method185(this);
            method541();
            class128.method2463();
        } else if (field268 == 10) {
            class26.method185(this);
        } else if (field268 == 20) {
            class26.method185(this);
            method592();
        } else if (field268 == 25) {
            method832();
        }
        if (field268 == 30) {
            if (field515 > 1) {
                field515--;
            }
            if (field311 > 0) {
                field311--;
            }
            if (field315) {
                field315 = false;
                method2887();
            } else {
                if (!field333) {
                    field413[0] = class139.field2161;
                    field525[0] = "";
                    field411[0] = 1006;
                    field286 = 1;
                }
                for (int var4 = 0; var4 < 100 && method899(); var4++) {
                }
                if (field268 == 30) {
                    class179.method1019(field340, 91);
                    Object var5 = Statics.field688.field175;
                    synchronized (Statics.field688.field175) {
                        if (!field259) {
                            Statics.field688.field176 = 0;
                        } else if (class124.field1992 != 0 || Statics.field688.field176 >= 40) {
                            field340.method2376(96);
                            field340.method2113(0);
                            int var6 = field340.field1815;
                            int var7 = 0;
                            for (int var8 = 0; var8 < Statics.field688.field176 && field340.field1815 - var6 < 240; var8++) {
                                var7++;
                                int var9 = Statics.field688.field178[var8];
                                if (var9 < 0) {
                                    var9 = 0;
                                } else if (var9 > 502) {
                                    var9 = 502;
                                }
                                int var10 = Statics.field688.field177[var8];
                                if (var10 < 0) {
                                    var10 = 0;
                                } else if (var10 > 764) {
                                    var10 = 764;
                                }
                                int var11 = var9 * 765 + var10;
                                if (Statics.field688.field178[var8] == -1 && Statics.field688.field177[var8] == -1) {
                                    var10 = -1;
                                    var9 = -1;
                                    var11 = 524287;
                                }
                                if (field414 != var10 || field291 != var9) {
                                    int var12 = var10 - field414;
                                    field414 = var10;
                                    int var13 = var9 - field291;
                                    field291 = var9;
                                    if (field274 < 8 && var12 >= -32 && var12 <= 31 && var13 >= -32 && var13 <= 31) {
                                        var12 += 32;
                                        var13 += 32;
                                        field340.method2114((field274 << 12) + (var12 << 6) + var13);
                                        field274 = 0;
                                    } else if (field274 < 8) {
                                        field340.method2115((field274 << 19) + 8388608 + var11);
                                        field274 = 0;
                                    } else {
                                        field340.method2144((field274 << 19) + -1073741824 + var11);
                                        field274 = 0;
                                    }
                                } else if (field274 < 2047) {
                                    field274++;
                                }
                            }
                            field340.method2124(field340.field1815 - var6);
                            if (var7 >= Statics.field688.field176) {
                                Statics.field688.field176 = 0;
                            } else {
                                Statics.field688.field176 -= var7;
                                for (int var14 = 0; var14 < Statics.field688.field176; var14++) {
                                    Statics.field688.field177[var14] = Statics.field688.field177[var7 + var14];
                                    Statics.field688.field178[var14] = Statics.field688.field178[var7 + var14];
                                }
                            }
                        }
                    }
                    if (class124.field1992 == 1 || !Statics.field2015 && class124.field1992 == 4 || class124.field1992 == 2) {
                        long var16 = (class124.field1995 - field271) / 50L;
                        if (var16 > 4095L) {
                            var16 = 4095L;
                        }
                        field271 = class124.field1995;
                        int var18 = class124.field1988;
                        if (var18 < 0) {
                            var18 = 0;
                        } else if (var18 > 502) {
                            var18 = 502;
                        }
                        int var19 = class124.field1993;
                        if (var19 < 0) {
                            var19 = 0;
                        } else if (var19 > 764) {
                            var19 = 764;
                        }
                        int var20 = var18 * 765 + var19;
                        byte var21 = 0;
                        if (class124.field1992 == 2) {
                            var21 = 1;
                        }
                        int var22 = (int) var16;
                        field340.method2376(136);
                        field340.method2144((var21 << 19) + (var22 << 20) + var20);
                    }
                    if (class121.field1954 > 0) {
                        field340.method2376(37);
                        field340.method2114(0);
                        int var23 = field340.field1815;
                        long var24 = class100.method496();
                        for (int var26 = 0; var26 < class121.field1954; var26++) {
                            long var27 = var24 - field490;
                            if (var27 > 16777215L) {
                                var27 = 16777215L;
                            }
                            field490 = var24;
                            field340.method2164((int) var27);
                            field340.method2323(class121.field1943[var26]);
                        }
                        field340.method2244(field340.field1815 - var23);
                    }
                    if (field354 > 0) {
                        field354--;
                    }
                    if (class121.field1947[96] || class121.field1947[97] || class121.field1947[98] || class121.field1947[99]) {
                        field526 = true;
                    }
                    if (field526 && field354 <= 0) {
                        field354 = 20;
                        field526 = false;
                        field340.method2376(186);
                        field340.method2157(field466);
                        field340.method2158(field348);
                    }
                    if (Statics.field134 && !field275) {
                        field275 = true;
                        field340.method2376(30);
                        field340.method2113(1);
                    }
                    if (!Statics.field134 && field275) {
                        field275 = false;
                        field340.method2376(30);
                        field340.method2113(0);
                    }
                    method1();
                    if (field268 == 30) {
                        method177();
                        int var10002;
                        for (int var29 = 0; var29 < field506; var29++) {
                            var10002 = field509[var29]--;
                            if (field509[var29] >= -10) {
                                class49 var31 = field511[var29];
                                if (var31 == null) {
                                    class49 var10000 = (class49) null;
                                    var31 = class49.method1040(Statics.field2089, field361[var29], 0);
                                    if (var31 == null) {
                                        continue;
                                    }
                                    field509[var29] += var31.method1035();
                                    field511[var29] = var31;
                                }
                                if (field509[var29] < 0) {
                                    int var38;
                                    if (field257[var29] == 0) {
                                        var38 = field504;
                                    } else {
                                        int var32 = (field257[var29] & 0xFF) * 128;
                                        int var33 = field257[var29] >> 16 & 0xFF;
                                        int var34 = var33 * 128 + 64 - Statics.field180.field717;
                                        if (var34 < 0) {
                                            var34 = -var34;
                                        }
                                        int var35 = field257[var29] >> 8 & 0xFF;
                                        int var36 = var35 * 128 + 64 - Statics.field180.field747;
                                        if (var36 < 0) {
                                            var36 = -var36;
                                        }
                                        int var37 = var34 + var36 - 128;
                                        if (var37 > var32) {
                                            field509[var29] = -100;
                                            continue;
                                        }
                                        if (var37 < 0) {
                                            var37 = 0;
                                        }
                                        var38 = field505 * (var32 - var37) / var32;
                                    }
                                    if (var38 > 0) {
                                        class53 var39 = var31.method1036().method1077(Statics.field899);
                                        class55 var40 = class55.method1099(var39, 100, var38);
                                        var40.method1135(field508[var29] - 1);
                                        Statics.field531.method967(var40);
                                    }
                                    field509[var29] = -100;
                                }
                            } else {
                                field506--;
                                for (int var30 = var29; var30 < field506; var30++) {
                                    field361[var30] = field361[var30 + 1];
                                    field511[var30] = field511[var30 + 1];
                                    field508[var30] = field508[var30 + 1];
                                    field509[var30] = field509[var30 + 1];
                                    field257[var30] = field257[var30 + 1];
                                }
                                var29--;
                            }
                        }
                        if (field503 && !class157.method1343()) {
                            if (field289 != 0 && field335 != -1) {
                                class157.method858(Statics.field1804, field335, 0, field289, false);
                            }
                            field503 = false;
                        }
                        field309++;
                        if (field309 > 750) {
                            method2887();
                        } else {
                            method2417();
                            for (int var41 = 0; var41 < field284; var41++) {
                                int var42 = field484[var41];
                                class28 var43 = field325[var42];
                                if (var43 != null) {
                                    method3126(var43, var43.field684.field778);
                                }
                            }
                            method76();
                            field339++;
                            if (field374 != 0) {
                                field373 += 20;
                                if (field373 >= 400) {
                                    field374 = 0;
                                }
                            }
                            if (Statics.field94 != null) {
                                field375++;
                                if (field375 >= 15) {
                                    method32(Statics.field94);
                                    Statics.field94 = null;
                                }
                            }
                            class148 var44 = Statics.field252;
                            class148 var45 = Statics.field2652;
                            Statics.field252 = null;
                            Statics.field2652 = null;
                            field404 = null;
                            field368 = false;
                            field442 = false;
                            field487 = 0;
                            while (true) {
                                while (true) {
                                    class121 var46 = class121.field1933;
                                    boolean var47;
                                    synchronized (class121.field1933) {
                                        if (class121.field1957 == class121.field1955) {
                                            var47 = false;
                                        } else {
                                            Statics.field1313 = class121.field1952[class121.field1955];
                                            Statics.field1927 = class121.field1951[class121.field1955];
                                            class121.field1955 = class121.field1955 + 1 & 0x7F;
                                            var47 = true;
                                        }
                                    }
                                    if (!var47 || field487 >= 128) {
                                        method5(field425, 0, 0, 765, 503, 0, 0);
                                        field449++;
                                        while (true) {
                                            class1 var51;
                                            class148 var52;
                                            class148 var53;
                                            do {
                                                var51 = (class1) field464.method3260();
                                                if (var51 == null) {
                                                    while (true) {
                                                        class1 var54;
                                                        class148 var55;
                                                        class148 var56;
                                                        do {
                                                            var54 = (class1) field465.method3260();
                                                            if (var54 == null) {
                                                                while (true) {
                                                                    class1 var57;
                                                                    class148 var58;
                                                                    class148 var59;
                                                                    do {
                                                                        var57 = (class1) field507.method3260();
                                                                        if (var57 == null) {
                                                                            method2721();
                                                                            if (Statics.field683 == null && field437 == null) {
                                                                                int var60 = class124.field1992;
                                                                                if (field333) {
                                                                                    if (var60 != 1 && (Statics.field2015 || var60 != 4)) {
                                                                                        int var61 = class124.field1991;
                                                                                        int var62 = class124.field1986;
                                                                                        if (var61 < Statics.field1548 - 10 || var61 > Statics.field942 + Statics.field1548 + 10 || var62 < Statics.field1314 - 10 || var62 > Statics.field1476 + Statics.field1314 + 10) {
                                                                                            field333 = false;
                                                                                            method2868(Statics.field1548, Statics.field1314, Statics.field942, Statics.field1476);
                                                                                        }
                                                                                    }
                                                                                    if (var60 == 1 || !Statics.field2015 && var60 == 4) {
                                                                                        int var63 = Statics.field1548;
                                                                                        int var64 = Statics.field1314;
                                                                                        int var65 = Statics.field942;
                                                                                        int var66 = class124.field1993;
                                                                                        int var67 = class124.field1988;
                                                                                        int var68 = -1;
                                                                                        for (int var69 = 0; var69 < field286; var69++) {
                                                                                            int var70 = (field286 - 1 - var69) * 15 + var64 + 31;
                                                                                            if (var66 > var63 && var66 < var63 + var65 && var67 > var70 - 13 && var67 < var70 + 3) {
                                                                                                var68 = var69;
                                                                                            }
                                                                                        }
                                                                                        if (var68 != -1 && var68 >= 0) {
                                                                                            int var71 = field409[var68];
                                                                                            int var72 = field349[var68];
                                                                                            int var73 = field411[var68];
                                                                                            int var74 = field412[var68];
                                                                                            String var75 = field413[var68];
                                                                                            String var76 = field525[var68];
                                                                                            method905(var71, var72, var73, var74, var75, var76, class124.field1993, class124.field1988);
                                                                                        }
                                                                                        field333 = false;
                                                                                        method2868(Statics.field1548, Statics.field1314, Statics.field942, Statics.field1476);
                                                                                    }
                                                                                } else {
                                                                                    label1292: {
                                                                                        if ((var60 == 1 || !Statics.field2015 && var60 == 4) && field286 > 0) {
                                                                                            int var77 = field411[field286 - 1];
                                                                                            if (var77 == 39 || var77 == 40 || var77 == 41 || var77 == 42 || var77 == 43 || var77 == 33 || var77 == 34 || var77 == 35 || var77 == 36 || var77 == 37 || var77 == 38 || var77 == 1005) {
                                                                                                label1272: {
                                                                                                    int var78 = field409[field286 - 1];
                                                                                                    int var79 = field349[field286 - 1];
                                                                                                    class148 var80 = class148.method16(var79);
                                                                                                    int var81 = method640(var80);
                                                                                                    boolean var82 = (var81 >> 28 & 0x1) != 0;
                                                                                                    if (!var82) {
                                                                                                        class152 var151 = (class152) null;
                                                                                                        if (!class152.method2421(method640(var80))) {
                                                                                                            break label1272;
                                                                                                        }
                                                                                                    }
                                                                                                    if (Statics.field683 != null && !field381 && field277 != 1) {
                                                                                                        int var83 = field286 - 1;
                                                                                                        boolean var84;
                                                                                                        if (var83 < 0) {
                                                                                                            var84 = false;
                                                                                                        } else {
                                                                                                            int var85 = field411[var83];
                                                                                                            if (var85 >= 2000) {
                                                                                                                var85 -= 2000;
                                                                                                            }
                                                                                                            if (var85 == 1007) {
                                                                                                                var84 = true;
                                                                                                            } else {
                                                                                                                var84 = false;
                                                                                                            }
                                                                                                        }
                                                                                                        if (!var84 && field286 > 0) {
                                                                                                            method1888(field378, field379);
                                                                                                        }
                                                                                                    }
                                                                                                    field381 = false;
                                                                                                    field450 = 0;
                                                                                                    if (Statics.field683 != null) {
                                                                                                        method32(Statics.field683);
                                                                                                    }
                                                                                                    Statics.field683 = class148.method16(var79);
                                                                                                    field377 = var78;
                                                                                                    field378 = class124.field1993;
                                                                                                    field379 = class124.field1988;
                                                                                                    if (field286 > 0) {
                                                                                                        int var86 = field286 - 1;
                                                                                                        Statics.field679 = new class25();
                                                                                                        Statics.field679.field638 = field409[var86];
                                                                                                        Statics.field679.field633 = field349[var86];
                                                                                                        Statics.field679.field634 = field411[var86];
                                                                                                        Statics.field679.field636 = field412[var86];
                                                                                                        Statics.field679.field637 = field413[var86];
                                                                                                    }
                                                                                                    method32(Statics.field683);
                                                                                                    break label1292;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (var60 == 1 || !Statics.field2015 && var60 == 4) {
                                                                                            label1285: {
                                                                                                if (field277 != 1 || field286 <= 2) {
                                                                                                    int var87 = field286 - 1;
                                                                                                    boolean var88;
                                                                                                    if (var87 < 0) {
                                                                                                        var88 = false;
                                                                                                    } else {
                                                                                                        int var89 = field411[var87];
                                                                                                        if (var89 >= 2000) {
                                                                                                            var89 -= 2000;
                                                                                                        }
                                                                                                        if (var89 == 1007) {
                                                                                                            var88 = true;
                                                                                                        } else {
                                                                                                            var88 = false;
                                                                                                        }
                                                                                                    }
                                                                                                    if (!var88) {
                                                                                                        break label1285;
                                                                                                    }
                                                                                                }
                                                                                                var60 = 2;
                                                                                            }
                                                                                        }
                                                                                        if ((var60 == 1 || !Statics.field2015 && var60 == 4) && field286 > 0) {
                                                                                            int var90 = field286 - 1;
                                                                                            if (var90 >= 0) {
                                                                                                int var91 = field409[var90];
                                                                                                int var92 = field349[var90];
                                                                                                int var93 = field411[var90];
                                                                                                int var94 = field412[var90];
                                                                                                String var95 = field413[var90];
                                                                                                String var96 = field525[var90];
                                                                                                method905(var91, var92, var93, var94, var95, var96, class124.field1993, class124.field1988);
                                                                                            }
                                                                                        }
                                                                                        if (var60 == 2 && field286 > 0) {
                                                                                            Statics.method2365(class124.field1993, class124.field1988);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field437 != null) {
                                                                                method32(field437);
                                                                                Statics.field232++;
                                                                                if (field368 && field442) {
                                                                                    int var97 = class124.field1991;
                                                                                    int var98 = class124.field1986;
                                                                                    int var99 = var97 - field439;
                                                                                    int var100 = var98 - field440;
                                                                                    if (var99 < field443) {
                                                                                        var99 = field443;
                                                                                    }
                                                                                    if (field437.field2516 + var99 > field443 + field498.field2516) {
                                                                                        var99 = field443 + field498.field2516 - field437.field2516;
                                                                                    }
                                                                                    if (var100 < field444) {
                                                                                        var100 = field444;
                                                                                    }
                                                                                    if (field437.field2503 + var100 > field444 + field498.field2503) {
                                                                                        var100 = field444 + field498.field2503 - field437.field2503;
                                                                                    }
                                                                                    int var101 = var99 - field324;
                                                                                    int var102 = var100 - field447;
                                                                                    int var103 = field437.field2553;
                                                                                    if (Statics.field232 > field437.field2557 && (var101 > var103 || var101 < -var103 || var102 > var103 || var102 < -var103)) {
                                                                                        field448 = true;
                                                                                    }
                                                                                    int var104 = field498.field2571 + (var99 - field443);
                                                                                    int var105 = field498.field2507 + (var100 - field444);
                                                                                    if (field437.field2569 != null && field448) {
                                                                                        class1 var106 = new class1();
                                                                                        var106.field4 = field437;
                                                                                        var106.field9 = var104;
                                                                                        var106.field5 = var105;
                                                                                        var106.field10 = field437.field2569;
                                                                                        class29.method1054(var106);
                                                                                    }
                                                                                    if (class124.field1985 == 0) {
                                                                                        if (field448) {
                                                                                            if (field437.field2570 != null) {
                                                                                                class1 var107 = new class1();
                                                                                                var107.field4 = field437;
                                                                                                var107.field9 = var104;
                                                                                                var107.field5 = var105;
                                                                                                var107.field7 = field404;
                                                                                                var107.field10 = field437.field2570;
                                                                                                class29.method1054(var107);
                                                                                            }
                                                                                            if (field404 != null) {
                                                                                                class148 var108 = field437;
                                                                                                int var109 = class152.method994(method640(var108));
                                                                                                class148 var110;
                                                                                                if (var109 == 0) {
                                                                                                    var110 = null;
                                                                                                } else {
                                                                                                    int var111 = 0;
                                                                                                    while (true) {
                                                                                                        if (var111 >= var109) {
                                                                                                            var110 = var108;
                                                                                                            break;
                                                                                                        }
                                                                                                        var108 = class148.method16(var108.field2504);
                                                                                                        if (var108 == null) {
                                                                                                            var110 = null;
                                                                                                            break;
                                                                                                        }
                                                                                                        var111++;
                                                                                                    }
                                                                                                }
                                                                                                if (var110 != null) {
                                                                                                    field340.method2376(210);
                                                                                                    field340.method2157(field437.field2494);
                                                                                                    field340.method2114(field404.field2494);
                                                                                                    field340.method2222(field404.field2493);
                                                                                                    field340.method2144(field437.field2493);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            label877: {
                                                                                                label876: {
                                                                                                    if (field277 != 1) {
                                                                                                        int var112 = field286 - 1;
                                                                                                        boolean var113;
                                                                                                        if (var112 < 0) {
                                                                                                            var113 = false;
                                                                                                        } else {
                                                                                                            int var114 = field411[var112];
                                                                                                            if (var114 >= 2000) {
                                                                                                                var114 -= 2000;
                                                                                                            }
                                                                                                            if (var114 == 1007) {
                                                                                                                var113 = true;
                                                                                                            } else {
                                                                                                                var113 = false;
                                                                                                            }
                                                                                                        }
                                                                                                        if (!var113) {
                                                                                                            break label876;
                                                                                                        }
                                                                                                    }
                                                                                                    if (field286 > 2) {
                                                                                                        Statics.method2365(field439 + field324, field447 + field440);
                                                                                                        break label877;
                                                                                                    }
                                                                                                }
                                                                                                if (field286 > 0) {
                                                                                                    method1888(field439 + field324, field447 + field440);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        field437 = null;
                                                                                    }
                                                                                } else if (Statics.field232 > 1) {
                                                                                    field437 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field683 != null) {
                                                                                method32(Statics.field683);
                                                                                field450++;
                                                                                if (class124.field1985 == 0) {
                                                                                    if (!field381) {
                                                                                        label834: {
                                                                                            label833: {
                                                                                                if (field277 != 1) {
                                                                                                    int var121 = field286 - 1;
                                                                                                    boolean var122;
                                                                                                    if (var121 < 0) {
                                                                                                        var122 = false;
                                                                                                    } else {
                                                                                                        int var123 = field411[var121];
                                                                                                        if (var123 >= 2000) {
                                                                                                            var123 -= 2000;
                                                                                                        }
                                                                                                        if (var123 == 1007) {
                                                                                                            var122 = true;
                                                                                                        } else {
                                                                                                            var122 = false;
                                                                                                        }
                                                                                                    }
                                                                                                    if (!var122) {
                                                                                                        break label833;
                                                                                                    }
                                                                                                }
                                                                                                if (field286 > 2) {
                                                                                                    Statics.method2365(field378, field379);
                                                                                                    break label834;
                                                                                                }
                                                                                            }
                                                                                            if (field286 > 0) {
                                                                                                method1888(field378, field379);
                                                                                            }
                                                                                        }
                                                                                    } else if (Statics.field683 == Statics.field238 && field380 != field377) {
                                                                                        class148 var115 = Statics.field683;
                                                                                        byte var116 = 0;
                                                                                        if (field428 == 1 && var115.field2612 == 206) {
                                                                                            var116 = 1;
                                                                                        }
                                                                                        if (var115.field2595[field380] <= 0) {
                                                                                            var116 = 0;
                                                                                        }
                                                                                        if (class152.method2421(method640(var115))) {
                                                                                            int var117 = field377;
                                                                                            int var118 = field380;
                                                                                            var115.field2595[var118] = var115.field2595[var117];
                                                                                            var115.field2586[var118] = var115.field2586[var117];
                                                                                            var115.field2595[var117] = -1;
                                                                                            var115.field2586[var117] = 0;
                                                                                        } else if (var116 == 1) {
                                                                                            int var119 = field377;
                                                                                            int var120 = field380;
                                                                                            while (var119 != var120) {
                                                                                                if (var119 > var120) {
                                                                                                    var115.method2874(var119 - 1, var119);
                                                                                                    var119--;
                                                                                                } else if (var119 < var120) {
                                                                                                    var115.method2874(var119 + 1, var119);
                                                                                                    var119++;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            var115.method2874(field380, field377);
                                                                                        }
                                                                                        field340.method2376(13);
                                                                                        field340.method2138(Statics.field683.field2493);
                                                                                        field340.method2156(field380);
                                                                                        field340.method2323(var116);
                                                                                        field340.method2114(field377);
                                                                                    }
                                                                                    field375 = 10;
                                                                                    class124.field1992 = 0;
                                                                                    Statics.field683 = null;
                                                                                } else if (field450 >= 5 && (class124.field1991 > field378 + 5 || class124.field1991 < field378 - 5 || class124.field1986 > field379 + 5 || class124.field1986 < field379 - 5)) {
                                                                                    field381 = true;
                                                                                }
                                                                            }
                                                                            if (class76.field1365 != -1) {
                                                                                int var124 = class76.field1365;
                                                                                int var125 = class76.field1353;
                                                                                field340.method2376(169);
                                                                                field340.method2113(5);
                                                                                field340.method2114(Statics.field945 + var125);
                                                                                field340.method2157(Statics.field1624 + var124);
                                                                                field340.method2150(class121.field1947[82] ? (class121.field1947[81] ? 2 : 1) : 0);
                                                                                class76.field1365 = -1;
                                                                                field371 = class124.field1993;
                                                                                field372 = class124.field1988;
                                                                                field374 = 1;
                                                                                field373 = 0;
                                                                                field406 = var124;
                                                                                field367 = var125;
                                                                            }
                                                                            if (Statics.field252 != var44) {
                                                                                if (var44 != null) {
                                                                                    method32(var44);
                                                                                }
                                                                                if (Statics.field252 != null) {
                                                                                    method32(Statics.field252);
                                                                                }
                                                                            }
                                                                            if (Statics.field2652 != var45 && field418 == field321) {
                                                                                if (var45 != null) {
                                                                                    method32(var45);
                                                                                }
                                                                                if (Statics.field2652 != null) {
                                                                                    method32(Statics.field2652);
                                                                                }
                                                                            }
                                                                            if (Statics.field2652 == null) {
                                                                                if (field321 > 0) {
                                                                                    field321--;
                                                                                }
                                                                            } else if (field321 < field418) {
                                                                                field321++;
                                                                                if (field418 == field321) {
                                                                                    method32(Statics.field2652);
                                                                                }
                                                                            }
                                                                            int var126 = field307 + Statics.field180.field717;
                                                                            int var127 = field302 + Statics.field180.field747;
                                                                            if (Statics.field198 - var126 < -500 || Statics.field198 - var126 > 500 || Statics.field1545 - var127 < -500 || Statics.field1545 - var127 > 500) {
                                                                                Statics.field198 = var126;
                                                                                Statics.field1545 = var127;
                                                                            }
                                                                            if (Statics.field198 != var126) {
                                                                                Statics.field198 += (var126 - Statics.field198) / 16;
                                                                            }
                                                                            if (Statics.field1545 != var127) {
                                                                                Statics.field1545 += (var127 - Statics.field1545) / 16;
                                                                            }
                                                                            if (class124.field1985 == 4 && Statics.field2015) {
                                                                                int var128 = class124.field1986 - field353;
                                                                                field351 = var128 * 2;
                                                                                field353 = var128 == -1 || var128 == 1 ? class124.field1986 : (field353 + class124.field1986) / 2;
                                                                                int var129 = field403 - class124.field1991;
                                                                                field327 = var129 * 2;
                                                                                field403 = var129 == -1 || var129 == 1 ? class124.field1991 : (field403 + class124.field1991) / 2;
                                                                            } else {
                                                                                if (class121.field1947[96]) {
                                                                                    field327 += (-24 - field327) / 2;
                                                                                } else if (class121.field1947[97]) {
                                                                                    field327 += (24 - field327) / 2;
                                                                                } else {
                                                                                    field327 /= 2;
                                                                                }
                                                                                if (class121.field1947[98]) {
                                                                                    field351 += (12 - field351) / 2;
                                                                                } else if (class121.field1947[99]) {
                                                                                    field351 += (-12 - field351) / 2;
                                                                                } else {
                                                                                    field351 /= 2;
                                                                                }
                                                                                field353 = class124.field1986;
                                                                                field403 = class124.field1991;
                                                                            }
                                                                            field466 = field327 / 2 + field466 & 0x7FF;
                                                                            field348 += field351 / 2;
                                                                            if (field348 < 128) {
                                                                                field348 = 128;
                                                                            }
                                                                            if (field348 > 383) {
                                                                                field348 = 383;
                                                                            }
                                                                            int var130 = Statics.field198 >> 7;
                                                                            int var131 = Statics.field1545 >> 7;
                                                                            int var132 = method2398(Statics.field198, Statics.field1545, Statics.field1);
                                                                            int var133 = 0;
                                                                            if (var130 > 3 && var131 > 3 && var130 < 100 && var131 < 100) {
                                                                                for (int var134 = var130 - 4; var134 <= var130 + 4; var134++) {
                                                                                    for (int var135 = var131 - 4; var135 <= var131 + 4; var135++) {
                                                                                        int var136 = Statics.field1;
                                                                                        if (var136 < 3 && (class6.field75[1][var134][var135] & 0x2) == 2) {
                                                                                            var136++;
                                                                                        }
                                                                                        int var137 = var132 - class6.field103[var136][var134][var135];
                                                                                        if (var137 > var133) {
                                                                                            var133 = var137;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var138 = var133 * 192;
                                                                            if (var138 > 98048) {
                                                                                var138 = 98048;
                                                                            }
                                                                            if (var138 < 32768) {
                                                                                var138 = 32768;
                                                                            }
                                                                            if (var138 > field356) {
                                                                                field356 += (var138 - field356) / 24;
                                                                            } else if (var138 < field356) {
                                                                                field356 += (var138 - field356) / 80;
                                                                            }
                                                                            if (field512) {
                                                                                method2416();
                                                                            }
                                                                            for (int var139 = 0; var139 < 5; var139++) {
                                                                                var10002 = field517[var139]++;
                                                                            }
                                                                            int var140 = class124.method34();
                                                                            int var141 = class121.field1934;
                                                                            if (var140 > 15000 && var141 > 15000) {
                                                                                field311 = 250;
                                                                                class124.method1605(14500);
                                                                                field340.method2376(137);
                                                                            }
                                                                            field384++;
                                                                            if (field384 > 500) {
                                                                                field384 = 0;
                                                                                int var143 = (int) (Math.random() * 8.0D);
                                                                                if ((var143 & 0x1) == 1) {
                                                                                    field307 += field328;
                                                                                }
                                                                                if ((var143 & 0x2) == 2) {
                                                                                    field302 += field330;
                                                                                }
                                                                                if ((var143 & 0x4) == 4) {
                                                                                    field273 += field332;
                                                                                }
                                                                            }
                                                                            if (field307 < -50) {
                                                                                field328 = 2;
                                                                            }
                                                                            if (field307 > 50) {
                                                                                field328 = -2;
                                                                            }
                                                                            if (field302 < -55) {
                                                                                field330 = 2;
                                                                            }
                                                                            if (field302 > 55) {
                                                                                field330 = -2;
                                                                            }
                                                                            if (field273 < -40) {
                                                                                field332 = 1;
                                                                            }
                                                                            if (field273 > 40) {
                                                                                field332 = -1;
                                                                            }
                                                                            field341++;
                                                                            if (field341 > 500) {
                                                                                field341 = 0;
                                                                                int var144 = (int) (Math.random() * 8.0D);
                                                                                if ((var144 & 0x1) == 1) {
                                                                                    field334 += field355;
                                                                                }
                                                                                if ((var144 & 0x2) == 2) {
                                                                                    field451 += field337;
                                                                                }
                                                                            }
                                                                            if (field334 < -60) {
                                                                                field355 = 2;
                                                                            }
                                                                            if (field334 > 60) {
                                                                                field355 = -2;
                                                                            }
                                                                            if (field451 < -20) {
                                                                                field337 = 1;
                                                                            }
                                                                            if (field451 > 10) {
                                                                                field337 = -1;
                                                                            }
                                                                            for (class31 var145 = (class31) field410.method3197(); var145 != null; var145 = (class31) field410.method3195()) {
                                                                                if ((long) var145.field772 < class100.method496() / 1000L - 5L) {
                                                                                    if (var145.field768 > 0) {
                                                                                        method555(5, "", var145.field763 + class139.field2313);
                                                                                    }
                                                                                    if (var145.field768 == 0) {
                                                                                        method555(5, "", var145.field763 + class139.field2265);
                                                                                    }
                                                                                    var145.method3286();
                                                                                }
                                                                            }
                                                                            field431++;
                                                                            if (field431 > 50) {
                                                                                field340.method2376(128);
                                                                            }
                                                                            try {
                                                                                if (Statics.field1822 != null && field340.field1815 > 0) {
                                                                                    Statics.field1822.method2600(field340.field1819, 0, field340.field1815);
                                                                                    field340.field1815 = 0;
                                                                                    field431 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var147) {
                                                                                method2887();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var58 = var57.field4;
                                                                        if (var58.field2494 < 0) {
                                                                            break;
                                                                        }
                                                                        var59 = class148.method16(var58.field2504);
                                                                    } while (var59 == null || var59.field2601 == null || var58.field2494 >= var59.field2601.length || var59.field2601[var58.field2494] != var58);
                                                                    class29.method1054(var57);
                                                                }
                                                            }
                                                            var55 = var54.field4;
                                                            if (var55.field2494 < 0) {
                                                                break;
                                                            }
                                                            var56 = class148.method16(var55.field2504);
                                                        } while (var56 == null || var56.field2601 == null || var55.field2494 >= var56.field2601.length || var56.field2601[var55.field2494] != var55);
                                                        class29.method1054(var54);
                                                    }
                                                }
                                                var52 = var51.field4;
                                                if (var52.field2494 < 0) {
                                                    break;
                                                }
                                                var53 = class148.method16(var52.field2504);
                                            } while (var53 == null || var53.field2601 == null || var52.field2494 >= var53.field2601.length || var53.field2601[var52.field2494] != var52);
                                            class29.method1054(var51);
                                        }
                                    }
                                    if (field432 >= 2 && class121.field1947[82] && Statics.field1313 == 66) {
                                        String var49 = "";
                                        for (int var50 = 0; var50 < field433 && var50 < 100; var50++) {
                                            var49 = var49 + field478[var50] + ':' + field480[var50] + '\n';
                                        }
                                        Statics.field2048.setContents(new StringSelection(var49), (ClipboardOwner) null);
                                    } else {
                                        field489[field487] = Statics.field1313;
                                        field488[field487] = Statics.field1927;
                                        field487++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (field268 == 40 || field268 == 45) {
            method592();
        }
    }

    @ObfuscatedName("client.v(I)V")
    public final void method282() {
        boolean var1 = class157.method2076();
        if (var1 && field503 && Statics.field247 != null) {
            Statics.field247.method989();
        }
        if (field2044) {
            class121.method520(Statics.field1915);
            class124.method1425(Statics.field1915);
            if (Statics.field68 != null) {
                Statics.field68.method2457(Statics.field1915);
            }
            this.method2634();
            Canvas var2 = Statics.field1915;
            var2.setFocusTraversalKeysEnabled(false);
            var2.addKeyListener(class121.field1933);
            var2.addFocusListener(class121.field1933);
            class124.method1341(Statics.field1915);
            if (Statics.field68 != null) {
                Statics.field68.method2456(Statics.field1915);
            }
        }
        if (field268 == 0) {
            int var3 = class26.field656;
            String var4 = class26.field652;
            Color var5 = null;
            try {
                Graphics var6 = Statics.field1915.getGraphics();
                if (Statics.field2315 == null) {
                    Statics.field2315 = new Font("Helvetica", 1, 13);
                    Statics.field2109 = Statics.field1915.getFontMetrics(Statics.field2315);
                }
                if (field2042) {
                    field2042 = false;
                    var6.setColor(Color.black);
                    var6.fillRect(0, 0, Statics.field2022, Statics.field27);
                }
                if (var5 == null) {
                    var5 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1996 == null) {
                        Statics.field1996 = Statics.field1915.createImage(304, 34);
                    }
                    Graphics var7 = Statics.field1996.getGraphics();
                    var7.setColor(var5);
                    var7.drawRect(0, 0, 303, 33);
                    var7.fillRect(2, 2, var3 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(1, 1, 301, 31);
                    var7.fillRect(var3 * 3 + 2, 2, 300 - var3 * 3, 30);
                    var7.setFont(Statics.field2315);
                    var7.setColor(Color.white);
                    var7.drawString(var4, (304 - Statics.field2109.stringWidth(var4)) / 2, 22);
                    var6.drawImage(Statics.field1996, Statics.field2022 / 2 - 152, Statics.field27 / 2 - 18, (ImageObserver) null);
                } catch (Exception var20) {
                    int var9 = Statics.field2022 / 2 - 152;
                    int var10 = Statics.field27 / 2 - 18;
                    var6.setColor(var5);
                    var6.drawRect(var9, var10, 303, 33);
                    var6.fillRect(var9 + 2, var10 + 2, var3 * 3, 30);
                    var6.setColor(Color.black);
                    var6.drawRect(var9 + 1, var10 + 1, 301, 31);
                    var6.fillRect(var3 * 3 + var9 + 2, var10 + 2, 300 - var3 * 3, 30);
                    var6.setFont(Statics.field2315);
                    var6.setColor(Color.white);
                    var6.drawString(var4, var9 + (304 - Statics.field2109.stringWidth(var4)) / 2, var10 + 22);
                }
            } catch (Exception var21) {
                Statics.field1915.repaint();
            }
        } else if (field268 == 5) {
            class26.method2446(Statics.field87, Statics.field1028);
        } else if (field268 == 10) {
            class26.method2446(Statics.field87, Statics.field1028);
        } else if (field268 == 20) {
            class26.method2446(Statics.field87, Statics.field1028);
        } else if (field268 == 25) {
            if (field322 == 1) {
                if (field376 > field319) {
                    field319 = field376;
                }
                int var12 = (field319 * 50 - field376 * 50) / field319;
                method3174(class139.field2135 + class2.field23 + class2.field21 + var12 + "%" + class2.field20, false);
            } else if (field322 == 2) {
                if (field320 > field305) {
                    field305 = field320;
                }
                int var13 = (field305 * 50 - field320 * 50) / field305 + 50;
                method3174(class139.field2135 + class2.field23 + class2.field21 + var13 + "%" + class2.field20, false);
            } else {
                method3174(class139.field2135, false);
            }
        } else if (field268 == 30) {
            method123();
        } else if (field268 == 40) {
            method3174(class139.field2136 + class2.field23 + class139.field2137, false);
        } else if (field268 == 45) {
            method3174(class139.field2275, false);
        }
        if (field268 == 30 && field499 == 0 && !field2042) {
            try {
                Graphics var14 = Statics.field1915.getGraphics();
                for (int var15 = 0; var15 < field467; var15++) {
                    if (field470[var15]) {
                        Statics.field1913.method1349(var14, field472[var15], field300[var15], field474[var15], field475[var15]);
                        field470[var15] = false;
                    }
                }
            } catch (Exception var23) {
                Statics.field1915.repaint();
            }
        } else if (field268 > 0) {
            try {
                Graphics var17 = Statics.field1915.getGraphics();
                Statics.field1913.method1347(var17, 0, 0);
                field2042 = false;
                for (int var18 = 0; var18 < field467; var18++) {
                    field470[var18] = false;
                }
            } catch (Exception var22) {
                Statics.field1915.repaint();
            }
        }
    }

    @ObfuscatedName("client.j(I)V")
    public final void method441() {
        if (Statics.field688 != null) {
            Statics.field688.field174 = false;
        }
        Statics.field688 = null;
        if (Statics.field1822 != null) {
            Statics.field1822.method2613();
            Statics.field1822 = null;
        }
        if (class121.field1933 != null) {
            class121 var1 = class121.field1933;
            synchronized (class121.field1933) {
                class121.field1933 = null;
            }
        }
        if (class124.field1994 != null) {
            class124 var3 = class124.field1994;
            synchronized (class124.field1994) {
                class124.field1994 = null;
            }
        }
        Statics.field68 = null;
        if (Statics.field247 != null) {
            Statics.field247.method990();
        }
        if (Statics.field1029 != null) {
            Statics.field1029.method990();
        }
        class146.method122();
        class145.method706();
        class133.method2619();
    }

    @ObfuscatedName("cd.k(IB)V")
    public static void method1889(int arg0) {
        if (field268 == arg0) {
            return;
        }
        if (field268 == 0) {
            Statics.field1996 = null;
            Statics.field2315 = null;
            Statics.field2109 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field390 = 0;
            field434 = 0;
            field299 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1255 != null) {
            Statics.field1255.method2613();
            Statics.field1255 = null;
        }
        if (field268 == 25) {
            field322 = 0;
            field376 = 0;
            field319 = 1;
            field320 = 0;
            field305 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field1915;
            class143 var2 = Statics.field673;
            class143 var3 = Statics.field242;
            if (!Statics.field648) {
                class70.method1519();
                byte[] var4 = var2.method2762("title.jpg", "");
                Statics.field644 = new class69(var4, var1);
                Statics.field658 = Statics.field644.method1427();
                Statics.field671 = class67.method812(var3, "logo", "");
                Statics.field641 = class67.method812(var3, "titlebox", "");
                Statics.field1638 = class67.method812(var3, "titlebutton", "");
                Statics.field643 = class67.method1310(var3, "runes", "");
                Statics.field2627 = class67.method1310(var3, "title_mute", "");
                Statics.field1534 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field1534[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field1534[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field1534[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field1534[var8 + 192] = 16777215;
                }
                Statics.field609 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field609[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field609[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field609[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field609[var12 + 192] = 16777215;
                }
                Statics.field2630 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field2630[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field2630[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field2630[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field2630[var16 + 192] = 16777215;
                }
                Statics.field2882 = new int[256];
                Statics.field2774 = new int[32768];
                Statics.field646 = new int[32768];
                class26.method2448((class71) null);
                Statics.field206 = new int[32768];
                Statics.field865 = new int[32768];
                class26.field657 = 0;
                class26.field662 = "";
                class26.field663 = "";
                class26.field666 = false;
                if (Statics.field156.field146) {
                    class157.field2681 = 1;
                    Statics.field2679 = null;
                    Statics.field579 = -1;
                    Statics.field2447 = -1;
                    Statics.field1914 = 0;
                    Statics.field1218 = false;
                    Statics.field2678 = 2;
                } else {
                    class143 var17 = Statics.field1804;
                    int var18 = var17.method2760("scape main");
                    int var19 = var17.method2761(var18, "");
                    class157.method40(2, var17, var18, var19, 255, false);
                }
                class146.method2696(false);
                Statics.field648 = true;
                Statics.field644.method1509(0, 0);
                Statics.field658.method1509(382, 0);
                Statics.field671.method1583(382 - Statics.field671.field1287 / 2, 18);
            }
        } else if (Statics.field648) {
            Statics.field641 = null;
            Statics.field1638 = null;
            Statics.field643 = null;
            Statics.field644 = null;
            Statics.field658 = null;
            Statics.field671 = null;
            Statics.field2627 = null;
            Statics.field967 = null;
            Statics.field161 = null;
            Statics.field2113 = null;
            Statics.field610 = null;
            Statics.field188 = null;
            Statics.field1534 = null;
            Statics.field609 = null;
            Statics.field2630 = null;
            Statics.field2882 = null;
            Statics.field2774 = null;
            Statics.field646 = null;
            Statics.field206 = null;
            Statics.field865 = null;
            class157.field2681 = 1;
            Statics.field2679 = null;
            Statics.field579 = -1;
            Statics.field2447 = -1;
            Statics.field1914 = 0;
            Statics.field1218 = false;
            Statics.field2678 = 2;
            class146.method2696(true);
            Statics.field648 = false;
        }
        field268 = arg0;
    }

    @ObfuscatedName("client.g(B)V")
    public void method193() {
        if (field268 == 1000) {
            return;
        }
        long var1 = class100.method496();
        int var3 = (int) (var1 - Statics.field143);
        Statics.field143 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class146.field2472 += var3;
        boolean var4;
        if (class146.field2469 == 0 && class146.field2460 == 0 && class146.field2473 == 0 && class146.field2458 == 0) {
            var4 = true;
        } else if (Statics.field2464 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class146.field2472 > 30000) {
                        throw new IOException();
                    }
                    while (class146.field2460 < 20 && class146.field2458 > 0) {
                        class147 var5 = (class147) class146.field2457.method3211();
                        class104 var6 = new class104(4);
                        var6.method2113(1);
                        var6.method2115((int) var5.field2817);
                        Statics.field2464.method2600(var6.field1819, 0, 4);
                        class146.field2459.method3210(var5, var5.field2817);
                        class146.field2458--;
                        class146.field2460++;
                    }
                    while (class146.field2469 < 20 && class146.field2473 > 0) {
                        class147 var7 = (class147) class146.field2461.method3264();
                        class104 var8 = new class104(4);
                        var8.method2113(0);
                        var8.method2115((int) var7.field2817);
                        Statics.field2464.method2600(var8.field1819, 0, 4);
                        var7.method3282();
                        class146.field2455.method3210(var7, var7.field2817);
                        class146.field2473--;
                        class146.field2469++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2464.method2599();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class146.field2472 = 0;
                        byte var11 = 0;
                        if (Statics.field1411 == null) {
                            var11 = 8;
                        } else if (class146.field2468 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class146.field2466.field1815;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2464.method2597(class146.field2466.field1819, class146.field2466.field1815, var12);
                            if (class146.field2471 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class146.field2466.field1819[class146.field2466.field1815 + var13] ^= class146.field2471;
                                }
                            }
                            class146.field2466.field1815 += var12;
                            if (class146.field2466.field1815 < var11) {
                                break;
                            }
                            if (Statics.field1411 == null) {
                                class146.field2466.field1815 = 0;
                                int var14 = class146.field2466.method2257();
                                int var15 = class146.field2466.method2206();
                                int var16 = class146.field2466.method2257();
                                int var17 = class146.field2466.method2130();
                                long var18 = (long) ((var14 << 16) + var15);
                                class147 var20 = (class147) class146.field2459.method3208(var18);
                                Statics.field1877 = true;
                                if (var20 == null) {
                                    var20 = (class147) class146.field2455.method3208(var18);
                                    Statics.field1877 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1411 = var20;
                                Statics.field2467 = new class104(var17 + var21 + Statics.field1411.field2481);
                                Statics.field2467.method2113(var16);
                                Statics.field2467.method2144(var17);
                                class146.field2468 = 8;
                                class146.field2466.field1815 = 0;
                            } else if (class146.field2468 == 0) {
                                if (class146.field2466.field1819[0] == -1) {
                                    class146.field2468 = 1;
                                    class146.field2466.field1815 = 0;
                                } else {
                                    Statics.field1411 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2467.field1819.length - Statics.field1411.field2481;
                            int var23 = 512 - class146.field2468;
                            if (var23 > var22 - Statics.field2467.field1815) {
                                var23 = var22 - Statics.field2467.field1815;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2464.method2597(Statics.field2467.field1819, Statics.field2467.field1815, var23);
                            if (class146.field2471 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2467.field1819[Statics.field2467.field1815 + var24] ^= class146.field2471;
                                }
                            }
                            Statics.field2467.field1815 += var23;
                            class146.field2468 += var23;
                            if (Statics.field2467.field1815 == var22) {
                                if (Statics.field1411.field2817 == 16711935L) {
                                    Statics.field1536 = Statics.field2467;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class143 var26 = class146.field2470[var25];
                                        if (var26 != null) {
                                            Statics.field1536.field1815 = var25 * 8 + 5;
                                            int var27 = Statics.field1536.method2130();
                                            int var28 = Statics.field1536.method2130();
                                            var26.method2842(var27, var28);
                                        }
                                    }
                                } else {
                                    class146.field2474.reset();
                                    class146.field2474.update(Statics.field2467.field1819, 0, var22);
                                    int var29 = (int) class146.field2474.getValue();
                                    if (Statics.field1411.field2478 != var29) {
                                        try {
                                            Statics.field2464.method2613();
                                        } catch (Exception var35) {
                                        }
                                        class146.field2465++;
                                        Statics.field2464 = null;
                                        class146.field2471 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class146.field2465 = 0;
                                    class146.field2463 = 0;
                                    Statics.field1411.field2479.method2832((int) (Statics.field1411.field2817 & 0xFFFFL), Statics.field2467.field1819, (Statics.field1411.field2817 & 0xFF0000L) == 16711680L, Statics.field1877);
                                }
                                Statics.field1411.method3288();
                                if (Statics.field1877) {
                                    class146.field2460--;
                                } else {
                                    class146.field2469--;
                                }
                                class146.field2468 = 0;
                                Statics.field1411 = null;
                                Statics.field2467 = null;
                            } else {
                                if (class146.field2468 != 512) {
                                    break;
                                }
                                class146.field2468 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2464.method2613();
                } catch (Exception var34) {
                }
                class146.field2463++;
                Statics.field2464 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method194();
        }
    }

    @ObfuscatedName("client.d(I)V")
    public void method194() {
        if (class146.field2465 >= 4) {
            this.method2676("js5crc");
            field268 = 1000;
            return;
        }
        if (class146.field2463 >= 4) {
            if (field268 <= 5) {
                this.method2676("js5io");
                field268 = 1000;
                return;
            }
            field317 = 3000;
            class146.field2463 = 3;
        }
        if (--field317 + 1 > 0) {
            return;
        }
        try {
            if (field290 == 0) {
                Statics.field1973 = Statics.field1249.method2505(Statics.field701, Statics.field1876);
                field290++;
            }
            if (field290 == 1) {
                if (Statics.field1973.field2055 == 2) {
                    this.method377(-1);
                    return;
                }
                if (Statics.field1973.field2055 == 1) {
                    field290++;
                }
            }
            if (field290 == 2) {
                Statics.field313 = new class127((Socket) Statics.field1973.field2059, Statics.field1249);
                class104 var1 = new class104(5);
                var1.method2113(15);
                var1.method2144(45);
                Statics.field313.method2600(var1.field1819, 0, 5);
                field290++;
                Statics.field292 = class100.method496();
            }
            if (field290 == 3) {
                if (field268 <= 5 || Statics.field313.method2599() > 0) {
                    int var2 = Statics.field313.method2598();
                    if (var2 != 0) {
                        this.method377(var2);
                        return;
                    }
                    field290++;
                } else if (class100.method496() - Statics.field292 > 30000L) {
                    this.method377(-2);
                    return;
                }
            }
            if (field290 == 4) {
                class146.method535(Statics.field313, field268 > 20);
                Statics.field1973 = null;
                Statics.field313 = null;
                field290 = 0;
                field496 = 0;
            }
        } catch (IOException var4) {
            this.method377(-3);
        }
    }

    @ObfuscatedName("client.b(IB)V")
    public void method377(int arg0) {
        Statics.field1973 = null;
        Statics.field313 = null;
        field290 = 0;
        if (Statics.field1876 == Statics.field179) {
            Statics.field1876 = Statics.field2773;
        } else {
            Statics.field1876 = Statics.field179;
        }
        field496++;
        if (field496 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field268 <= 5) {
                this.method2676("js5connect_full");
                field268 = 1000;
            } else {
                field317 = 3000;
            }
        } else if (field496 >= 2 && arg0 == 6) {
            this.method2676("js5connect_outofdate");
            field268 = 1000;
        } else if (field496 >= 4) {
            if (field268 <= 5) {
                this.method2676("js5connect");
                field268 = 1000;
            } else {
                field317 = 3000;
            }
        }
    }

    @ObfuscatedName("y.i(B)V")
    public static void method541() {
        if (field288 == 0) {
            Statics.field1911 = new class76(4, 104, 104, class6.field103);
            for (int var0 = 0; var0 < 4; var0++) {
                field323[var0] = new class187(104, 104);
            }
            Statics.field606 = new class69(512, 512);
            class26.field652 = class139.field2138;
            class26.field656 = 5;
            field288 = 20;
        } else if (field288 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class81.field1425[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class76.method1641(var1, 500, 800, 512, 334);
            class26.field652 = class139.field2139;
            class26.field656 = 10;
            field288 = 30;
        } else if (field288 == 30) {
            Statics.field521 = method1982(0, false, true, true);
            Statics.field294 = method1982(1, false, true, true);
            Statics.field1872 = method1982(2, true, false, true);
            Statics.field1865 = method1982(3, false, true, true);
            Statics.field2089 = method1982(4, false, true, true);
            Statics.field1971 = method1982(5, true, true, true);
            Statics.field1804 = method1982(6, true, true, false);
            Statics.field1455 = method1982(7, false, true, true);
            Statics.field242 = method1982(8, false, true, true);
            Statics.field811 = method1982(9, false, true, true);
            Statics.field673 = method1982(10, false, true, true);
            Statics.field295 = method1982(11, false, true, true);
            Statics.field80 = method1982(12, false, true, true);
            Statics.field148 = method1982(13, true, false, true);
            Statics.field1454 = method1982(14, false, true, false);
            Statics.field135 = method1982(15, false, true, true);
            class26.field652 = class139.field2364;
            class26.field656 = 20;
            field288 = 40;
        } else if (field288 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field521.method2829() * 4 / 100;
            int var8 = var7 + Statics.field294.method2829() * 4 / 100;
            int var9 = var8 + Statics.field1872.method2829() * 2 / 100;
            int var10 = var9 + Statics.field1865.method2829() * 2 / 100;
            int var11 = var10 + Statics.field2089.method2829() * 6 / 100;
            int var12 = var11 + Statics.field1971.method2829() * 4 / 100;
            int var13 = var12 + Statics.field1804.method2829() * 2 / 100;
            int var14 = var13 + Statics.field1455.method2829() * 60 / 100;
            int var15 = var14 + Statics.field242.method2829() * 2 / 100;
            int var16 = var15 + Statics.field811.method2829() * 2 / 100;
            int var17 = var16 + Statics.field673.method2829() * 2 / 100;
            int var18 = var17 + Statics.field295.method2829() * 2 / 100;
            int var19 = var18 + Statics.field80.method2829() * 2 / 100;
            int var20 = var19 + Statics.field148.method2829() * 2 / 100;
            int var21 = var20 + Statics.field1454.method2829() * 2 / 100;
            int var22 = var21 + Statics.field135.method2829() * 2 / 100;
            if (var22 == 100) {
                class26.field652 = class139.field2208;
                class26.field656 = 30;
                field288 = 45;
            } else {
                if (var22 != 0) {
                    class26.field652 = class139.field2257 + var22 + "%";
                }
                class26.field656 = 30;
            }
        } else if (field288 == 45) {
            class47.method3175(22050, !field265, 2);
            class158 var23 = new class158();
            var23.method3132(9, 128);
            Statics.field247 = class47.method556(Statics.field1249, Statics.field1915, 0, 22050);
            Statics.field247.method987(var23);
            class143 var24 = Statics.field135;
            class143 var25 = Statics.field1454;
            class143 var26 = Statics.field2089;
            Statics.field2677 = var24;
            Statics.field2680 = var25;
            Statics.field1972 = var26;
            Statics.field2676 = var23;
            Statics.field1029 = class47.method556(Statics.field1249, Statics.field1915, 1, 2048);
            Statics.field531 = new class46();
            Statics.field1029.method987(Statics.field531);
            Statics.field899 = new class65(22050, Statics.field2844);
            class26.field652 = class139.field2282;
            class26.field656 = 35;
            field288 = 50;
        } else if (field288 == 50) {
            int var27 = 0;
            if (Statics.field1028 == null) {
                class143 var28 = Statics.field242;
                class143 var29 = Statics.field148;
                int var30 = var28.method2760("p11_full");
                int var31 = var28.method2761(var30, "");
                class183 var32 = class67.method118(var28, var29, var30, var31);
                Statics.field1028 = var32;
            } else {
                var27++;
            }
            if (Statics.field316 == null) {
                class143 var33 = Statics.field242;
                class143 var34 = Statics.field148;
                int var35 = var33.method2760("p12_full");
                int var36 = var33.method2761(var35, "");
                class183 var37 = class67.method118(var33, var34, var35, var36);
                Statics.field316 = var37;
            } else {
                var27++;
            }
            if (Statics.field87 == null) {
                class143 var38 = Statics.field242;
                class143 var39 = Statics.field148;
                int var40 = var38.method2760("b12_full");
                int var41 = var38.method2761(var40, "");
                class183 var42 = class67.method118(var38, var39, var40, var41);
                Statics.field87 = var42;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class26.field652 = class139.field2144 + var27 * 100 / 3 + "%";
                class26.field656 = 40;
            } else {
                Statics.field1048 = new class141(true);
                class26.field652 = class139.field2145;
                class26.field656 = 40;
                field288 = 60;
            }
        } else if (field288 == 60) {
            class143 var43 = Statics.field673;
            class143 var44 = Statics.field242;
            int var45 = 0;
            if (var43.method2763("title.jpg", "")) {
                var45++;
            }
            if (var44.method2763("logo", "")) {
                var45++;
            }
            if (var44.method2763("titlebox", "")) {
                var45++;
            }
            if (var44.method2763("titlebutton", "")) {
                var45++;
            }
            if (var44.method2763("runes", "")) {
                var45++;
            }
            if (var44.method2763("title_mute", "")) {
                var45++;
            }
            var44.method2763("sl_back", "");
            var44.method2763("sl_flags", "");
            var44.method2763("sl_arrows", "");
            var44.method2763("sl_stars", "");
            var44.method2763("sl_button", "");
            byte var48 = 6;
            if (var45 < var48) {
                class26.field652 = class139.field2146 + var45 * 100 / var48 + "%";
                class26.field656 = 50;
            } else {
                class26.field652 = class139.field2283;
                class26.field656 = 50;
                method1889(5);
                field288 = 70;
            }
        } else if (field288 == 70) {
            if (Statics.field1872.method2774()) {
                class143 var50 = Statics.field1872;
                Statics.field938 = var50;
                class34.method1874(Statics.field1872);
                class37.method2077(Statics.field1872, Statics.field1455);
                class143 var51 = Statics.field1872;
                class143 var52 = Statics.field1455;
                boolean var53 = field265;
                Statics.field813 = var51;
                Statics.field814 = var52;
                class33.field853 = var53;
                class32.method38(Statics.field1872, Statics.field1455);
                class42.method172(Statics.field1872, Statics.field1455, field296, Statics.field1028);
                class143 var54 = Statics.field1872;
                class143 var55 = Statics.field521;
                class143 var56 = Statics.field294;
                Statics.field884 = var54;
                Statics.field889 = var55;
                Statics.field878 = var56;
                class36.method3162(Statics.field1872, Statics.field1455);
                class39.method2413(Statics.field1872);
                class143 var57 = Statics.field1872;
                Statics.field1739 = var57;
                Statics.field1025 = Statics.field1739.method2755(16);
                class148.method110(Statics.field1865, Statics.field1455, Statics.field242, Statics.field148);
                class41.method64(Statics.field1872);
                Statics.method2987(Statics.field1872);
                class26.field652 = class139.field2222;
                class26.field656 = 60;
                field288 = 80;
            } else {
                class26.field652 = class139.field2300 + Statics.field1872.method2830() + "%";
                class26.field656 = 60;
            }
        } else if (field288 == 80) {
            int var58 = 0;
            if (Statics.field1974 == null) {
                Statics.field1974 = class67.method1787(Statics.field242, "compass", "");
            } else {
                var58++;
            }
            if (Statics.field1086 == null) {
                Statics.field1086 = class67.method1787(Statics.field242, "mapedge", "");
            } else {
                var58++;
            }
            if (Statics.field1263 == null) {
                Statics.field1263 = class67.method1310(Statics.field242, "mapscene", "");
            } else {
                var58++;
            }
            if (Statics.field1908 == null) {
                Statics.field1908 = class67.method639(Statics.field242, "mapfunction", "");
            } else {
                var58++;
            }
            if (Statics.field1779 == null) {
                Statics.field1779 = class67.method639(Statics.field242, "hitmarks", "");
            } else {
                var58++;
            }
            if (Statics.field1456 == null) {
                Statics.field1456 = class67.method639(Statics.field242, "headicons_pk", "");
            } else {
                var58++;
            }
            if (Statics.field51 == null) {
                Statics.field51 = class67.method639(Statics.field242, "headicons_prayer", "");
            } else {
                var58++;
            }
            if (Statics.field1491 == null) {
                Statics.field1491 = class67.method639(Statics.field242, "headicons_hint", "");
            } else {
                var58++;
            }
            if (Statics.field1752 == null) {
                Statics.field1752 = class67.method639(Statics.field242, "mapmarker", "");
            } else {
                var58++;
            }
            if (Statics.field336 == null) {
                Statics.field336 = class67.method639(Statics.field242, "cross", "");
            } else {
                var58++;
            }
            if (Statics.field55 == null) {
                Statics.field55 = class67.method639(Statics.field242, "mapdots", "");
            } else {
                var58++;
            }
            if (Statics.field256 == null) {
                Statics.field256 = class67.method1310(Statics.field242, "scrollbar", "");
            } else {
                var58++;
            }
            if (Statics.field1665 == null) {
                Statics.field1665 = class67.method1310(Statics.field242, "mod_icons", "");
            } else {
                var58++;
            }
            if (Statics.field297 == null) {
                Statics.field297 = class67.method812(Statics.field242, "mapback", "");
            } else {
                var58++;
            }
            if (var58 < 14) {
                class26.field652 = class139.field2276 + var58 * 100 / 14 + "%";
                class26.field656 = 70;
            } else {
                Statics.field2854 = Statics.field1665;
                Statics.field1086.method1430();
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 41.0D) - 20;
                for (int var63 = 0; var63 < Statics.field1908.length; var63++) {
                    Statics.field1908[var63].method1429(var59 + var62, var60 + var62, var61 + var62);
                }
                Statics.field1263[0].method1576(var59 + var62, var60 + var62, var61 + var62);
                Statics.field2114 = new int[33];
                Statics.field248 = new int[33];
                Statics.field1862 = new int[151];
                Statics.field1737 = new int[151];
                for (int var64 = 0; var64 < 33; var64++) {
                    int var65 = 999;
                    int var66 = 0;
                    for (int var67 = 0; var67 < 34; var67++) {
                        if (Statics.field297.field1289[Statics.field297.field1287 * var64 + var67] == 0) {
                            if (var65 == 999) {
                                var65 = var67;
                            }
                        } else if (var65 != 999) {
                            var66 = var67;
                            break;
                        }
                    }
                    Statics.field2114[var64] = var65;
                    Statics.field248[var64] = var66 - var65;
                }
                for (int var68 = 5; var68 < 156; var68++) {
                    int var69 = 999;
                    int var70 = 0;
                    for (int var71 = 25; var71 < 172; var71++) {
                        if (Statics.field297.field1289[Statics.field297.field1287 * var68 + var71] == 0 && (var71 > 34 || var68 > 34)) {
                            if (var69 == 999) {
                                var69 = var71;
                            }
                        } else if (var69 != 999) {
                            var70 = var71;
                            break;
                        }
                    }
                    Statics.field1862[var68 - 5] = var69 - 25;
                    Statics.field1737[var68 - 5] = var70 - var69;
                }
                class26.field652 = class139.field2151;
                class26.field656 = 70;
                field288 = 90;
            }
        } else if (field288 == 90) {
            if (Statics.field811.method2774()) {
                class85 var72 = new class85(Statics.field811, Statics.field242, 20, 0.8D, field265 ? 64 : 128);
                class81.method1795(var72);
                class81.method1796(0.8D);
                class26.field652 = class139.field2252;
                class26.field656 = 90;
                field288 = 110;
            } else {
                class26.field652 = class139.field2152 + Statics.field811.method2830() + "%";
                class26.field656 = 90;
            }
        } else if (field288 == 110) {
            Statics.field688 = new class11();
            Statics.field1249.method2523(Statics.field688, 10);
            class26.field652 = class139.field2316;
            class26.field656 = 94;
            field288 = 120;
        } else if (field288 == 120) {
            if (Statics.field673.method2763("huffman", "")) {
                class99 var73 = new class99(Statics.field673.method2762("huffman", ""));
                class181.method2856(var73);
                class26.field652 = class139.field2156;
                class26.field656 = 96;
                field288 = 130;
            } else {
                class26.field652 = class139.field2155 + "%";
                class26.field656 = 96;
            }
        } else if (field288 == 130) {
            if (!Statics.field1865.method2774()) {
                class26.field652 = class139.field2157 + Statics.field1865.method2830() * 4 / 5 + "%";
                class26.field656 = 100;
            } else if (!Statics.field80.method2774()) {
                class26.field652 = class139.field2157 + (80 + Statics.field80.method2830() / 6) + "%";
                class26.field656 = 100;
            } else if (Statics.field148.method2774()) {
                class26.field652 = class139.field2158;
                class26.field656 = 100;
                field288 = 140;
            } else {
                class26.field652 = class139.field2157 + (96 + Statics.field148.method2830() / 20) + "%";
                class26.field656 = 100;
            }
        } else if (field288 == 140) {
            method1889(10);
        }
    }

    @ObfuscatedName("cb.o(IZZZB)Leh;")
    public static class143 method1982(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class118 var4 = null;
        if (class133.field2078 != null) {
            var4 = new class118(arg0, class133.field2078, Statics.field1256[arg0], 1000000);
        }
        return new class143(var4, Statics.field1898, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ak.x(B)V")
    public static final void method592() {
        try {
            if (field390 == 0) {
                if (Statics.field1822 != null) {
                    Statics.field1822.method2613();
                    Statics.field1822 = null;
                }
                Statics.field1871 = null;
                field315 = false;
                field434 = 0;
                field390 = 1;
            }
            if (field390 == 1) {
                if (Statics.field1871 == null) {
                    Statics.field1871 = Statics.field1249.method2505(Statics.field701, Statics.field1876);
                }
                if (Statics.field1871.field2055 == 2) {
                    throw new IOException();
                }
                if (Statics.field1871.field2055 == 1) {
                    Statics.field1822 = new class127((Socket) Statics.field1871.field2059, Statics.field1249);
                    Statics.field1871 = null;
                    field390 = 2;
                }
            }
            if (field390 == 2) {
                field340.field1815 = 0;
                field340.method2113(14);
                Statics.field1822.method2600(field340.field1819, 0, 1);
                field306.field1815 = 0;
                field390 = 3;
            }
            if (field390 == 3) {
                if (Statics.field247 != null) {
                    Statics.field247.method1016();
                }
                if (Statics.field1029 != null) {
                    Statics.field1029.method1016();
                }
                int var0 = Statics.field1822.method2598();
                if (Statics.field247 != null) {
                    Statics.field247.method1016();
                }
                if (Statics.field1029 != null) {
                    Statics.field1029.method1016();
                }
                if (var0 != 0) {
                    method2410(var0);
                    return;
                }
                field306.field1815 = 0;
                field390 = 5;
            }
            if (field390 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field340.field1815 = 0;
                field340.method2113(10);
                field340.method2144(var1[0]);
                field340.method2144(var1[1]);
                field340.method2144(var1[2]);
                field340.method2144(var1[3]);
                field340.method2117(0L);
                field340.method2118(class26.field663);
                field340.method2228(class5.field74, class5.field61);
                field441.field1815 = 0;
                if (field268 == 40) {
                    field441.method2113(18);
                } else {
                    field441.method2113(16);
                }
                field441.method2114(0);
                int var2 = field441.field1815;
                field441.method2144(45);
                field441.method2276(field340.field1819, 0, field340.field1815);
                int var3 = field441.field1815;
                field441.method2118(class26.field662);
                field441.method2113(field265 ? 1 : 0);
                class133.method39(field441);
                class104 var4 = new class104(Statics.field1048.method2731());
                Statics.field1048.method2730(var4);
                field441.method2276(var4.field1819, 0, var4.field1819.length);
                field441.method2144(Statics.field521.field2423);
                field441.method2144(Statics.field294.field2423);
                field441.method2144(Statics.field1872.field2423);
                field441.method2144(Statics.field1865.field2423);
                field441.method2144(Statics.field2089.field2423);
                field441.method2144(Statics.field1971.field2423);
                field441.method2144(Statics.field1804.field2423);
                field441.method2144(Statics.field1455.field2423);
                field441.method2144(Statics.field242.field2423);
                field441.method2144(Statics.field811.field2423);
                field441.method2144(Statics.field673.field2423);
                field441.method2144(Statics.field295.field2423);
                field441.method2144(Statics.field80.field2423);
                field441.method2144(Statics.field148.field2423);
                field441.method2144(Statics.field1454.field2423);
                field441.method2144(Statics.field135.field2423);
                field441.method2143(var1, var3, field441.field1815);
                field441.method2244(field441.field1815 - var2);
                Statics.field1822.method2600(field441.field1819, 0, field441.field1815);
                field340.method2375(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field306.method2375(var1);
                field390 = 6;
            }
            if (field390 == 6 && Statics.field1822.method2599() > 0) {
                int var6 = Statics.field1822.method2598();
                if (var6 == 21 && field268 == 20) {
                    field390 = 7;
                } else if (var6 == 2) {
                    field390 = 9;
                } else if (var6 == 15 && field268 == 40) {
                    method546();
                    return;
                } else if (var6 == 23 && field299 < 1) {
                    field299++;
                    field390 = 0;
                } else {
                    method2410(var6);
                    return;
                }
            }
            if (field390 == 7 && Statics.field1822.method2599() > 0) {
                field468 = (Statics.field1822.method2598() + 3) * 60;
                field390 = 8;
            }
            if (field390 == 8) {
                field434 = 0;
                class26.method152(class139.field2140, class139.field2179, field468 / 60 + class139.field2196);
                if (--field468 <= 0) {
                    field390 = 0;
                }
            } else {
                if (field390 == 9 && Statics.field1822.method2599() >= 8) {
                    field432 = Statics.field1822.method2598();
                    field405 = Statics.field1822.method2598() == 1;
                    field445 = Statics.field1822.method2598();
                    field445 <<= 0x8;
                    field445 += Statics.field1822.method2598();
                    field303 = Statics.field1822.method2598();
                    Statics.field1822.method2597(field306.field1819, 0, 1);
                    field306.field1815 = 0;
                    field308 = field306.method2395();
                    Statics.field1822.method2597(field306.field1819, 0, 2);
                    field306.field1815 = 0;
                    field462 = field306.method2206();
                    if (field303 == 1) {
                        try {
                            client var7 = Statics.field258;
                            JSObject.getWindow(var7).call("zap", (Object[]) null);
                        } catch (Throwable var28) {
                        }
                    } else {
                        try {
                            client var9 = Statics.field258;
                            JSObject.getWindow(var9).call("unzap", (Object[]) null);
                        } catch (Throwable var27) {
                        }
                    }
                    field390 = 10;
                }
                if (field390 != 10) {
                    field434++;
                    if (field434 > 2000) {
                        if (field299 < 1) {
                            if (Statics.field1876 == Statics.field179) {
                                Statics.field1876 = Statics.field2773;
                            } else {
                                Statics.field1876 = Statics.field179;
                            }
                            field299++;
                            field390 = 0;
                        } else {
                            method2410(-3);
                        }
                    }
                } else if (Statics.field1822.method2599() >= field462) {
                    field306.field1815 = 0;
                    Statics.field1822.method2597(field306.field1819, 0, field462);
                    field271 = -1L;
                    field274 = -1;
                    Statics.field688.field176 = 0;
                    Statics.field134 = true;
                    field275 = true;
                    field490 = -1L;
                    class179.field2832 = new class171();
                    field340.field1815 = 0;
                    field306.field1815 = 0;
                    field308 = -1;
                    field312 = -1;
                    field502 = -1;
                    field417 = -1;
                    field309 = 0;
                    field515 = 0;
                    field311 = 0;
                    field422 = 0;
                    field286 = 0;
                    field333 = false;
                    class124.method1605(0);
                    for (int var11 = 0; var11 < 100; var11++) {
                        field480[var11] = null;
                    }
                    field433 = 0;
                    field419 = 0;
                    field350 = false;
                    field506 = 0;
                    field307 = (int) (Math.random() * 100.0D) - 50;
                    field302 = (int) (Math.random() * 110.0D) - 55;
                    field273 = (int) (Math.random() * 80.0D) - 40;
                    field334 = (int) (Math.random() * 120.0D) - 60;
                    field451 = (int) (Math.random() * 30.0D) - 20;
                    field466 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field500 = 0;
                    field493 = -1;
                    field406 = 0;
                    field367 = 0;
                    field287 = class17.field532;
                    field385 = 0;
                    field284 = 0;
                    for (int var12 = 0; var12 < 2048; var12++) {
                        field510[var12] = null;
                        field389[var12] = null;
                    }
                    for (int var13 = 0; var13 < 32768; var13++) {
                        field325[var13] = null;
                    }
                    Statics.field180 = field510[2047] = new class3();
                    field398 = -1;
                    field401.method3220();
                    field402.method3220();
                    for (int var14 = 0; var14 < 4; var14++) {
                        for (int var15 = 0; var15 < 104; var15++) {
                            for (int var16 = 0; var16 < 104; var16++) {
                                field473[var14][var15][var16] = null;
                            }
                        }
                    }
                    field400 = new class171();
                    field519 = 0;
                    field518 = 0;
                    field362 = 0;
                    for (int var17 = 0; var17 < Statics.field1025; var17++) {
                        class43 var18 = class43.method178(var17);
                        if (var18 != null && var18.field1027 == 0) {
                            class150.field2622[var17] = 0;
                            class150.field2625[var17] = 0;
                        }
                    }
                    for (int var19 = 0; var19 < field460.length; var19++) {
                        field460[var19] = -1;
                    }
                    field272 = -1;
                    if (field425 != -1) {
                        int var20 = field425;
                        if (var20 != -1 && Statics.field2485[var20]) {
                            Statics.field2486.method2757(var20);
                            if (Statics.field2602[var20] != null) {
                                boolean var21 = true;
                                for (int var22 = 0; var22 < Statics.field2602[var20].length; var22++) {
                                    if (Statics.field2602[var20][var22] != null) {
                                        if (Statics.field2602[var20][var22].field2502 == 2) {
                                            var21 = false;
                                        } else {
                                            Statics.field2602[var20][var22] = null;
                                        }
                                    }
                                }
                                if (var21) {
                                    Statics.field2602[var20] = null;
                                }
                                Statics.field2485[var20] = false;
                            }
                        }
                    }
                    for (class4 var23 = (class4) field426.method3211(); var23 != null; var23 = (class4) field426.method3212()) {
                        method2443(var23, true);
                    }
                    field425 = -1;
                    field426 = new class169(8);
                    field429 = null;
                    field333 = false;
                    field286 = 0;
                    field524.method2944((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var24 = 0; var24 < 8; var24++) {
                        field476[var24] = null;
                        field396[var24] = false;
                    }
                    class13.method3414();
                    field269 = true;
                    for (int var25 = 0; var25 < 100; var25++) {
                        field469[var25] = true;
                    }
                    field491 = null;
                    Statics.field1794 = 0;
                    Statics.field187 = null;
                    Statics.field2007 = -1;
                    method1606(false);
                    field308 = -1;
                }
            }
        } catch (IOException var29) {
            if (field299 < 1) {
                if (Statics.field1876 == Statics.field179) {
                    Statics.field1876 = Statics.field2773;
                } else {
                    Statics.field1876 = Statics.field179;
                }
                field299++;
                field390 = 0;
            } else {
                method2410(-2);
            }
        }
    }

    @ObfuscatedName("r.m(I)V")
    public static void method546() {
        field340.field1815 = 0;
        field306.field1815 = 0;
        field308 = -1;
        field312 = -1;
        field502 = -1;
        field417 = -1;
        field462 = 0;
        field309 = 0;
        field515 = 0;
        field286 = 0;
        field333 = false;
        field500 = 0;
        field406 = 0;
        for (int var0 = 0; var0 < field510.length; var0++) {
            if (field510[var0] != null) {
                field510[var0].field708 = -1;
            }
        }
        for (int var1 = 0; var1 < field325.length; var1++) {
            if (field325[var1] != null) {
                field325[var1].field708 = -1;
            }
        }
        class13.method3414();
        method1889(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field469[var2] = true;
        }
    }

    @ObfuscatedName("dq.f(II)V")
    public static void method2410(int arg0) {
        if (arg0 == -3) {
            class26.method152(class139.field2253, class139.field2367, class139.field2164);
        } else if (arg0 == -2) {
            class26.method152(class139.field2165, class139.field2263, class139.field2167);
        } else if (arg0 == -1) {
            class26.method152(class139.field2168, class139.field2169, class139.field2170);
        } else if (arg0 == 3) {
            class26.method152(class139.field2171, class139.field2172, class139.field2173);
        } else if (arg0 == 4) {
            class26.method152(class139.field2174, class139.field2175, class139.field2343);
        } else if (arg0 == 5) {
            class26.method152(class139.field2177, class139.field2260, class139.field2147);
        } else if (arg0 == 6) {
            class26.method152(class139.field2180, class139.field2181, class139.field2176);
        } else if (arg0 == 7) {
            class26.method152(class139.field2183, class139.field2184, class139.field2238);
        } else if (arg0 == 8) {
            class26.method152(class139.field2186, class139.field2341, class139.field2188);
        } else if (arg0 == 9) {
            class26.method152(class139.field2273, class139.field2309, class139.field2191);
        } else if (arg0 == 10) {
            class26.method152(class139.field2192, class139.field2193, class139.field2194);
        } else if (arg0 == 11) {
            class26.method152(class139.field2195, class139.field2310, class139.field2292);
        } else if (arg0 == 12) {
            class26.method152(class139.field2198, class139.field2199, class139.field2200);
        } else if (arg0 == 13) {
            class26.method152(class139.field2201, class139.field2363, class139.field2203);
        } else if (arg0 == 14) {
            class26.method152(class139.field2166, class139.field2205, class139.field2206);
        } else if (arg0 == 16) {
            class26.method152(class139.field2207, class139.field2204, class139.field2209);
        } else if (arg0 == 17) {
            class26.method152(class139.field2210, class139.field2211, class139.field2212);
        } else if (arg0 == 18) {
            class26.method152(class139.field2213, class139.field2214, class139.field2352);
        } else if (arg0 == 19) {
            class26.method152(class139.field2216, class139.field2217, class139.field2149);
        } else if (arg0 == 20) {
            class26.method152(class139.field2219, class139.field2220, class139.field2221);
        } else if (arg0 == 22) {
            class26.method152(class139.field2228, class139.field2223, class139.field2224);
        } else if (arg0 == 23) {
            class26.method152(class139.field2225, class139.field2226, class139.field2353);
        } else if (arg0 == 24) {
            class26.method152(class139.field2308, class139.field2229, class139.field2230);
        } else if (arg0 == 25) {
            class26.method152(class139.field2231, class139.field2232, class139.field2312);
        } else if (arg0 == 26) {
            class26.method152(class139.field2234, class139.field2334, class139.field2236);
        } else if (arg0 == 27) {
            class26.method152(class139.field2237, class139.field2189, class139.field2239);
        } else if (arg0 == 31) {
            class26.method152(class139.field2246, class139.field2247, class139.field2141);
        } else if (arg0 == 32) {
            class26.method152(class139.field2249, class139.field2250, class139.field2251);
        } else if (arg0 == 37) {
            class26.method152(class139.field2150, class139.field2299, class139.field2254);
        } else if (arg0 == 38) {
            class26.method152(class139.field2326, class139.field2256, class139.field2241);
        } else if (arg0 == 55) {
            class26.method152(class139.field2258, class139.field2259, class139.field2350);
        } else {
            class26.method152(class139.field2261, class139.field2262, class139.field2159);
        }
        method1889(10);
    }

    @ObfuscatedName("ad.q(I)V")
    public static final void method577() {
        if (Statics.field1822 != null) {
            Statics.field1822.method2613();
            Statics.field1822 = null;
        }
        method54();
        Statics.field1911.method1607();
        for (int var0 = 0; var0 < 4; var0++) {
            field323[var0].method3455();
        }
        System.gc();
        class157.field2681 = 1;
        Statics.field2679 = null;
        Statics.field579 = -1;
        Statics.field2447 = -1;
        Statics.field1914 = 0;
        Statics.field1218 = false;
        Statics.field2678 = 2;
        field335 = -1;
        field503 = false;
        class19.method2718();
        method1889(10);
    }

    @ObfuscatedName("a.c(I)V")
    public static final void method54() {
        class38.field944.method3193();
        class34.field873.method3193();
        class37.method136();
        class33.method176();
        class32.method539();
        class42.method538();
        class35.method579();
        class36.method2727();
        class39.method3059();
        class43.method594();
        class153.field2647.method3193();
        class148.method134();
        ((class85) Statics.field1442).method1879();
        class18.field542.method3193();
        Statics.field521.method2758();
        Statics.field294.method2758();
        Statics.field1865.method2758();
        Statics.field2089.method2758();
        Statics.field1971.method2758();
        Statics.field1804.method2758();
        Statics.field1455.method2758();
        Statics.field242.method2758();
        Statics.field811.method2758();
        Statics.field673.method2758();
        Statics.field295.method2758();
        Statics.field80.method2758();
    }

    @ObfuscatedName("ex.h(I)V")
    public static final void method2887() {
        if (field311 > 0) {
            method577();
        } else {
            method1889(40);
            Statics.field1255 = Statics.field1822;
            Statics.field1822 = null;
        }
    }

    @ObfuscatedName("q.y(I)V")
    public static final void method513() {
        if (Statics.field1029 != null) {
            Statics.field1029.method996();
        }
        if (Statics.field247 != null) {
            Statics.field247.method996();
        }
    }

    @ObfuscatedName("dm.r(Lah;IIIB)V")
    public static void method2396(class35 arg0, int arg1, int arg2, int arg3) {
        if (field506 >= 50 || field505 == 0 || arg0.field881 == null || arg1 >= arg0.field881.length) {
            return;
        }
        int var4 = arg0.field881[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field361[field506] = var5;
        field508[field506] = var6;
        field509[field506] = 0;
        field511[field506] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field257[field506] = (var8 << 16) + (var9 << 8) + var7;
        field506++;
    }

    @ObfuscatedName("b.w(IIIB)V")
    public static void method156(int arg0, int arg1, int arg2) {
        if (field504 == 0 || arg1 == 0 || field506 >= 50) {
            return;
        }
        field361[field506] = arg0;
        field508[field506] = arg1;
        field509[field506] = arg2;
        field511[field506] = null;
        field257[field506] = 0;
        field506++;
    }

    @ObfuscatedName("z.p(B)V")
    public static final void method1() {
        if (field265 && Statics.field1 != field408) {
            method2066(Statics.field2007, Statics.field1843, Statics.field1, Statics.field180.field740[0], Statics.field180.field757[0]);
        } else if (Statics.field1 != field493) {
            field493 = Statics.field1;
            method147(Statics.field1);
        }
    }

    @ObfuscatedName("a.s(I)V")
    public static final void method76() {
        for (int var0 = -1; var0 < field385; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field386[var0];
            }
            class3 var2 = field510[var1];
            if (var2 != null && var2.field741 > 0) {
                var2.field741--;
                if (var2.field741 == 0) {
                    var2.field750 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field284; var3++) {
            int var4 = field484[var3];
            class28 var5 = field325[var4];
            if (var5 != null && var5.field741 > 0) {
                var5.field741--;
                if (var5.field741 == 0) {
                    var5.field750 = null;
                }
            }
        }
    }

    @ObfuscatedName("dv.ag(B)V")
    public static final void method2416() {
        int var0 = Statics.field547 * 128 + 64;
        int var1 = Statics.field2682 * 128 + 64;
        int var2 = method2398(var0, var1, Statics.field1) - Statics.field115;
        if (Statics.field239 < var0) {
            Statics.field239 += Statics.field2867 * (var0 - Statics.field239) / 1000 + Statics.field246;
            if (Statics.field239 > var0) {
                Statics.field239 = var0;
            }
        }
        if (Statics.field239 > var0) {
            Statics.field239 -= Statics.field2867 * (Statics.field239 - var0) / 1000 + Statics.field246;
            if (Statics.field239 < var0) {
                Statics.field239 = var0;
            }
        }
        if (Statics.field1873 < var2) {
            Statics.field1873 += Statics.field2867 * (var2 - Statics.field1873) / 1000 + Statics.field246;
            if (Statics.field1873 > var2) {
                Statics.field1873 = var2;
            }
        }
        if (Statics.field1873 > var2) {
            Statics.field1873 -= Statics.field2867 * (Statics.field1873 - var2) / 1000 + Statics.field246;
            if (Statics.field1873 < var2) {
                Statics.field1873 = var2;
            }
        }
        if (Statics.field1224 < var1) {
            Statics.field1224 += Statics.field2867 * (var1 - Statics.field1224) / 1000 + Statics.field246;
            if (Statics.field1224 > var1) {
                Statics.field1224 = var1;
            }
        }
        if (Statics.field1224 > var1) {
            Statics.field1224 -= Statics.field2867 * (Statics.field1224 - var1) / 1000 + Statics.field246;
            if (Statics.field1224 < var1) {
                Statics.field1224 = var1;
            }
        }
        int var3 = Statics.field65 * 128 + 64;
        int var4 = Statics.field193 * 128 + 64;
        int var5 = method2398(var3, var4, Statics.field1) - Statics.field13;
        int var6 = var3 - Statics.field239;
        int var7 = var5 - Statics.field1873;
        int var8 = var4 - Statics.field1224;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field951 < var10) {
            Statics.field951 += Statics.field2002 * (var10 - Statics.field951) / 1000 + Statics.field1864;
            if (Statics.field951 > var10) {
                Statics.field951 = var10;
            }
        }
        if (Statics.field951 > var10) {
            Statics.field951 -= Statics.field2002 * (Statics.field951 - var10) / 1000 + Statics.field1864;
            if (Statics.field951 < var10) {
                Statics.field951 = var10;
            }
        }
        int var12 = var11 - Statics.field1626;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1626 += Statics.field2002 * var12 / 1000 + Statics.field1864;
            Statics.field1626 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1626 -= Statics.field2002 * -var12 / 1000 + Statics.field1864;
            Statics.field1626 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1626;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1626 = var11;
        }
    }

    @ObfuscatedName("dv.ad(I)V")
    public static final void method2417() {
        for (int var0 = -1; var0 < field385; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field386[var0];
            }
            class3 var2 = field510[var1];
            if (var2 != null) {
                method3126(var2, 1);
            }
        }
    }

    @ObfuscatedName("fv.ak(Lai;II)V")
    public static final void method3126(class30 arg0, int arg1) {
        if (arg0.field716 > field270) {
            method2072(arg0);
        } else if (arg0.field748 >= field270) {
            if (field270 == arg0.field748 || arg0.field733 == -1 || arg0.field736 != 0 || arg0.field735 + 1 > class35.method2065(arg0.field733).field877[arg0.field703]) {
                int var2 = arg0.field748 - arg0.field716;
                int var3 = field270 - arg0.field716;
                int var4 = arg0.field743 * 128 + arg0.field728 * 64;
                int var5 = arg0.field745 * 128 + arg0.field728 * 64;
                int var6 = arg0.field744 * 128 + arg0.field728 * 64;
                int var7 = arg0.field746 * 128 + arg0.field728 * 64;
                arg0.field717 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field747 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field759 = 0;
            if (arg0.field749 == 0) {
                arg0.field752 = 1024;
            }
            if (arg0.field749 == 1) {
                arg0.field752 = 1536;
            }
            if (arg0.field749 == 2) {
                arg0.field752 = 0;
            }
            if (arg0.field749 == 3) {
                arg0.field752 = 512;
            }
            arg0.field705 = arg0.field752;
        } else {
            method2414(arg0);
        }
        if (arg0.field717 < 128 || arg0.field747 < 128 || arg0.field717 >= 13184 || arg0.field747 >= 13184) {
            arg0.field733 = -1;
            arg0.field738 = -1;
            arg0.field716 = 0;
            arg0.field748 = 0;
            arg0.field717 = arg0.field740[0] * 128 + arg0.field728 * 64;
            arg0.field747 = arg0.field757[0] * 128 + arg0.field728 * 64;
            arg0.method597();
        }
        if (Statics.field180 == arg0 && (arg0.field717 < 1536 || arg0.field747 < 1536 || arg0.field717 >= 11776 || arg0.field747 >= 11776)) {
            arg0.field733 = -1;
            arg0.field738 = -1;
            arg0.field716 = 0;
            arg0.field748 = 0;
            arg0.field717 = arg0.field740[0] * 128 + arg0.field728 * 64;
            arg0.field747 = arg0.field757[0] * 128 + arg0.field728 * 64;
            arg0.method597();
        }
        if (arg0.field754 != 0) {
            if (arg0.field708 != -1 && arg0.field708 < 32768) {
                class28 var8 = field325[arg0.field708];
                if (var8 != null) {
                    int var9 = arg0.field717 - var8.field717;
                    int var10 = arg0.field747 - var8.field747;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field752 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field708 >= 32768) {
                int var11 = arg0.field708 - 32768;
                if (field445 == var11) {
                    var11 = 2047;
                }
                class3 var12 = field510[var11];
                if (var12 != null) {
                    int var13 = arg0.field717 - var12.field717;
                    int var14 = arg0.field747 - var12.field747;
                    if (var13 != 0 || var14 != 0) {
                        arg0.field752 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field715 != 0 || arg0.field729 != 0) && (arg0.field737 == 0 || arg0.field759 > 0)) {
                int var15 = arg0.field717 - (arg0.field715 * 64 - Statics.field1624 * 64 - Statics.field1624 * 64);
                int var16 = arg0.field747 - (arg0.field729 * 64 - Statics.field945 * 64 - Statics.field945 * 64);
                if (var15 != 0 || var16 != 0) {
                    arg0.field752 = (int) (Math.atan2((double) var15, (double) var16) * 325.949D) & 0x7FF;
                }
                arg0.field715 = 0;
                arg0.field729 = 0;
            }
            int var17 = arg0.field752 - arg0.field705 & 0x7FF;
            if (var17 == 0) {
                arg0.field753 = 0;
            } else {
                arg0.field753++;
                if (var17 > 1024) {
                    arg0.field705 -= arg0.field754;
                    boolean var18 = true;
                    if (var17 < arg0.field754 || var17 > 2048 - arg0.field754) {
                        arg0.field705 = arg0.field752;
                        var18 = false;
                    }
                    if (arg0.field730 == arg0.field711 && (arg0.field753 > 25 || var18)) {
                        if (arg0.field704 == -1) {
                            arg0.field730 = arg0.field755;
                        } else {
                            arg0.field730 = arg0.field704;
                        }
                    }
                } else {
                    arg0.field705 += arg0.field754;
                    boolean var19 = true;
                    if (var17 < arg0.field754 || var17 > 2048 - arg0.field754) {
                        arg0.field705 = arg0.field752;
                        var19 = false;
                    }
                    if (arg0.field730 == arg0.field711 && (arg0.field753 > 25 || var19)) {
                        if (arg0.field710 == -1) {
                            arg0.field730 = arg0.field755;
                        } else {
                            arg0.field730 = arg0.field710;
                        }
                    }
                }
                arg0.field705 &= 0x7FF;
            }
        }
        arg0.field721 = false;
        if (arg0.field730 != -1) {
            class35 var21 = class35.method2065(arg0.field730);
            if (var21 == null || var21.field876 == null) {
                arg0.field730 = -1;
            } else {
                arg0.field732++;
                if (arg0.field731 < var21.field876.length && arg0.field732 > var21.field877[arg0.field731]) {
                    arg0.field732 = 1;
                    arg0.field731++;
                    method2396(var21, arg0.field731, arg0.field717, arg0.field747);
                }
                if (arg0.field731 >= var21.field876.length) {
                    arg0.field732 = 0;
                    arg0.field731 = 0;
                    method2396(var21, arg0.field731, arg0.field717, arg0.field747);
                }
            }
        }
        if (arg0.field738 != -1 && field270 >= arg0.field720) {
            if (arg0.field739 < 0) {
                arg0.field739 = 0;
            }
            int var22 = class36.method2724(arg0.field738).field902;
            if (var22 == -1) {
                arg0.field738 = -1;
            } else {
                class35 var23 = class35.method2065(var22);
                if (var23 == null || var23.field876 == null) {
                    arg0.field738 = -1;
                } else {
                    arg0.field758++;
                    if (arg0.field739 < var23.field876.length && arg0.field758 > var23.field877[arg0.field739]) {
                        arg0.field758 = 1;
                        arg0.field739++;
                        method2396(var23, arg0.field739, arg0.field717, arg0.field747);
                    }
                    if (arg0.field739 >= var23.field876.length && (arg0.field739 < 0 || arg0.field739 >= var23.field876.length)) {
                        arg0.field738 = -1;
                    }
                }
            }
        }
        if (arg0.field733 != -1 && arg0.field736 <= 1) {
            class35 var24 = class35.method2065(arg0.field733);
            if (var24.field892 == 1 && arg0.field760 > 0 && arg0.field716 <= field270 && arg0.field748 < field270) {
                arg0.field736 = 1;
                return;
            }
        }
        if (arg0.field733 != -1 && arg0.field736 == 0) {
            class35 var25 = class35.method2065(arg0.field733);
            if (var25 == null || var25.field876 == null) {
                arg0.field733 = -1;
            } else {
                arg0.field735++;
                if (arg0.field703 < var25.field876.length && arg0.field735 > var25.field877[arg0.field703]) {
                    arg0.field735 = 1;
                    arg0.field703++;
                    method2396(var25, arg0.field703, arg0.field717, arg0.field747);
                }
                if (arg0.field703 >= var25.field876.length) {
                    arg0.field703 -= var25.field885;
                    arg0.field727++;
                    if (arg0.field727 >= var25.field879) {
                        arg0.field733 = -1;
                    } else if (arg0.field703 >= 0 && arg0.field703 < var25.field876.length) {
                        method2396(var25, arg0.field703, arg0.field717, arg0.field747);
                    } else {
                        arg0.field733 = -1;
                    }
                }
                arg0.field721 = var25.field887;
            }
        }
        if (arg0.field736 > 0) {
            arg0.field736--;
        }
    }

    @ObfuscatedName("cg.ai(Lai;B)V")
    public static final void method2072(class30 arg0) {
        int var1 = arg0.field716 - field270;
        int var2 = arg0.field743 * 128 + arg0.field728 * 64;
        int var3 = arg0.field745 * 128 + arg0.field728 * 64;
        arg0.field717 += (var2 - arg0.field717) / var1;
        arg0.field747 += (var3 - arg0.field747) / var1;
        arg0.field759 = 0;
        if (arg0.field749 == 0) {
            arg0.field752 = 1024;
        }
        if (arg0.field749 == 1) {
            arg0.field752 = 1536;
        }
        if (arg0.field749 == 2) {
            arg0.field752 = 0;
        }
        if (arg0.field749 == 3) {
            arg0.field752 = 512;
        }
    }

    @ObfuscatedName("dq.ac(Lai;B)V")
    public static final void method2414(class30 arg0) {
        arg0.field730 = arg0.field711;
        if (arg0.field737 == 0) {
            arg0.field759 = 0;
            return;
        }
        if (arg0.field733 != -1 && arg0.field736 == 0) {
            class35 var1 = class35.method2065(arg0.field733);
            if (arg0.field760 > 0 && var1.field892 == 0) {
                arg0.field759++;
                return;
            }
            if (arg0.field760 <= 0 && var1.field893 == 0) {
                arg0.field759++;
                return;
            }
        }
        int var2 = arg0.field717;
        int var3 = arg0.field747;
        int var4 = arg0.field740[arg0.field737 - 1] * 128 + arg0.field728 * 64;
        int var5 = arg0.field757[arg0.field737 - 1] * 128 + arg0.field728 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field717 = var4;
            arg0.field747 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field752 = 1280;
            } else if (var3 > var5) {
                arg0.field752 = 1792;
            } else {
                arg0.field752 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field752 = 768;
            } else if (var3 > var5) {
                arg0.field752 = 256;
            } else {
                arg0.field752 = 512;
            }
        } else if (var3 < var5) {
            arg0.field752 = 1024;
        } else if (var3 > var5) {
            arg0.field752 = 0;
        }
        int var6 = arg0.field752 - arg0.field705 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field712;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field755;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field714;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field713;
        }
        if (var7 == -1) {
            var7 = arg0.field755;
        }
        arg0.field730 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class28) {
            var9 = ((class28) arg0).field684.field794;
        }
        if (var9) {
            if (arg0.field752 != arg0.field705 && arg0.field708 == -1 && arg0.field754 != 0) {
                var8 = 2;
            }
            if (arg0.field737 > 2) {
                var8 = 6;
            }
            if (arg0.field737 > 3) {
                var8 = 8;
            }
            if (arg0.field759 > 0 && arg0.field737 > 1) {
                var8 = 8;
                arg0.field759--;
            }
        } else {
            if (arg0.field737 > 1) {
                var8 = 6;
            }
            if (arg0.field737 > 2) {
                var8 = 8;
            }
            if (arg0.field759 > 0 && arg0.field737 > 1) {
                var8 = 8;
                arg0.field759--;
            }
        }
        if (arg0.field725[arg0.field737 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field755 == arg0.field730 && arg0.field706 != -1) {
            arg0.field730 = arg0.field706;
        }
        if (var2 < var4) {
            arg0.field717 += var8;
            if (arg0.field717 > var4) {
                arg0.field717 = var4;
            }
        } else if (var2 > var4) {
            arg0.field717 -= var8;
            if (arg0.field717 < var4) {
                arg0.field717 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field747 += var8;
            if (arg0.field747 > var5) {
                arg0.field747 = var5;
            }
        } else if (var3 > var5) {
            arg0.field747 -= var8;
            if (arg0.field747 < var5) {
                arg0.field747 = var5;
            }
        }
        if (arg0.field717 == var4 && arg0.field747 == var5) {
            arg0.field737--;
            if (arg0.field760 > 0) {
                arg0.field760--;
            }
        }
    }

    @ObfuscatedName("ar.as(Lu;III)V")
    public static void method683(class3 arg0, int arg1, int arg2) {
        if (arg0.field733 == arg1 && arg1 != -1) {
            int var3 = class35.method2065(arg1).field894;
            if (var3 == 1) {
                arg0.field703 = 0;
                arg0.field735 = 0;
                arg0.field736 = arg2;
                arg0.field727 = 0;
            }
            if (var3 == 2) {
                arg0.field727 = 0;
            }
        } else if (arg1 == -1 || arg0.field733 == -1 || class35.method2065(arg1).field888 >= class35.method2065(arg0.field733).field888) {
            arg0.field733 = arg1;
            arg0.field703 = 0;
            arg0.field735 = 0;
            arg0.field736 = arg2;
            arg0.field727 = 0;
            arg0.field760 = arg0.field737;
        }
    }

    @ObfuscatedName("v.ar(B)V")
    public static final void method123() {
        if (field425 != -1) {
            method145(field425);
        }
        for (int var0 = 0; var0 < field467; var0++) {
            if (field469[var0]) {
                field470[var0] = true;
            }
            field395[var0] = field469[var0];
            field469[var0] = false;
        }
        field463 = field270;
        field399 = -1;
        field416 = -1;
        Statics.field238 = null;
        if (field425 != -1) {
            field467 = 0;
            int var1 = field425;
            if (class148.method2726(var1)) {
                Statics.field629 = null;
                method1788(Statics.field2602[var1], -1, 0, 0, 765, 503, 0, 0, -1);
                if (Statics.field629 != null) {
                    method1788(Statics.field629, -1412584499, 0, 0, 765, 503, Statics.field2634, Statics.field913, -1);
                    Statics.field629 = null;
                }
            } else {
                for (int var2 = 0; var2 < 100; var2++) {
                    field469[var2] = true;
                }
            }
        }
        class70.method1545();
        if (field333) {
            int var8 = Statics.field1548;
            int var9 = Statics.field1314;
            int var10 = Statics.field942;
            int var11 = Statics.field1476;
            int var12 = 6116423;
            class70.method1521(var8, var9, var10, var11, var12);
            class70.method1521(var8 + 1, var9 + 1, var10 - 2, 16, 0);
            class70.method1523(var8 + 1, var9 + 18, var10 - 2, var11 - 19, 0);
            Statics.field87.method3354(class139.field2270, var8 + 3, var9 + 14, var12, -1);
            int var13 = class124.field1991;
            int var14 = class124.field1986;
            for (int var15 = 0; var15 < field286; var15++) {
                int var16 = (field286 - 1 - var15) * 15 + var9 + 31;
                int var17 = 16777215;
                if (var13 > var8 && var13 < var8 + var10 && var14 > var16 - 13 && var14 < var16 + 3) {
                    var17 = 16776960;
                }
                class183 var18 = Statics.field87;
                String var19;
                if (field525[var15].length() > 0) {
                    var19 = field413[var15] + class139.field2277 + field525[var15];
                } else {
                    var19 = field413[var15];
                }
                var18.method3354(var19, var8 + 3, var16, var17, 0);
            }
            method2686(Statics.field1548, Statics.field1314, Statics.field942, Statics.field1476);
        } else if (field399 != -1) {
            int var3 = field399;
            int var4 = field416;
            if (field286 >= 2 || field419 != 0 || field350) {
                String var5;
                if (field419 == 1 && field286 < 2) {
                    var5 = class139.field2267 + class139.field2277 + field310 + " " + class2.field16;
                } else if (field350 && field286 < 2) {
                    var5 = field423 + class139.field2277 + field424 + " " + class2.field16;
                } else {
                    int var6 = field286 - 1;
                    String var7;
                    if (field525[var6].length() > 0) {
                        var7 = field413[var6] + class139.field2277 + field525[var6];
                    } else {
                        var7 = field413[var6];
                    }
                    var5 = var7;
                }
                if (field286 > 2) {
                    var5 = var5 + class2.method517(16777215) + " " + '/' + " " + (field286 - 2) + class139.field2271;
                }
                Statics.field87.method3360(var5, var3 + 4, var4 + 15, 16777215, 0, field270 / 1000);
            }
        }
        if (field499 == 3) {
            for (int var20 = 0; var20 < field467; var20++) {
                if (field395[var20]) {
                    class70.method1541(field472[var20], field300[var20], field474[var20], field475[var20], 16711935, 128);
                } else if (field470[var20]) {
                    class70.method1541(field472[var20], field300[var20], field474[var20], field475[var20], 16711680, 128);
                }
            }
        }
        class19.method1786(Statics.field1, Statics.field180.field717, Statics.field180.field747, field339);
        field339 = 0;
    }

    @ObfuscatedName("fk.an(Ljava/lang/String;ZI)V")
    public static final void method3174(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field316.method3313(arg0, 250);
        int var6 = Statics.field316.method3325(arg0, 250) * 13;
        class70.method1521(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class70.method1523(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field316.method3319(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2868(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2686(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1915.getGraphics();
            Statics.field1913.method1347(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1915.repaint();
        }
    }

    @ObfuscatedName("di.ah(Lag;I)V")
    public static final void method2565(class27 arg0) {
        if (Statics.field180.field717 >> 7 == field406 && Statics.field180.field747 >> 7 == field367) {
            field406 = 0;
        }
        int var1 = field385;
        if (class27.field678 == arg0 || class27.field675 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class27.field678 == arg0) {
                var3 = Statics.field180;
                var4 = 33538048;
            } else if (class27.field675 == arg0) {
                var3 = field510[field398];
                var4 = field398 << 14;
            } else {
                var3 = field510[field386[var2]];
                var4 = field386[var2] << 14;
                if (class27.field677 == arg0 && field398 == field386[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method28()) {
                var3.field45 = false;
                if ((field265 && field385 > 50 || field385 > 200) && class27.field678 != arg0 && var3.field730 == var3.field711) {
                    var3.field45 = true;
                }
                int var5 = var3.field717 >> 7;
                int var6 = var3.field747 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field31 == null || field270 < var3.field35 || field270 >= var3.field32) {
                        if ((var3.field717 & 0x7F) == 64 && (var3.field747 & 0x7F) == 64) {
                            if (field278 == field346[var5][var6]) {
                                continue;
                            }
                            field346[var5][var6] = field278;
                        }
                        var3.field34 = method2398(var3.field717, var3.field747, Statics.field1);
                        Statics.field1911.method1618(Statics.field1, var3.field717, var3.field747, var3.field34, 60, var3, var3.field705, var4, var3.field721);
                    } else {
                        var3.field45 = false;
                        var3.field34 = method2398(var3.field717, var3.field747, Statics.field1);
                        Statics.field1911.method1619(Statics.field1, var3.field717, var3.field747, var3.field34, 60, var3, var3.field705, var4, var3.field41, var3.field42, var3.field28, var3.field44);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ad.ax(ZI)V")
    public static final void method580(boolean arg0) {
        for (int var1 = 0; var1 < field284; var1++) {
            class28 var2 = field325[field484[var1]];
            int var3 = (field484[var1] << 14) + 536870912;
            if (var2 != null && var2.method28() && var2.field684.field790 == arg0 && var2.field684.method624()) {
                int var4 = var2.field717 >> 7;
                int var5 = var2.field747 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field728 == 1 && (var2.field717 & 0x7F) == 64 && (var2.field747 & 0x7F) == 64) {
                        if (field278 == field346[var4][var5]) {
                            continue;
                        }
                        field346[var4][var5] = field278;
                    }
                    if (!var2.field684.field782) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1911.method1618(Statics.field1, var2.field717, var2.field747, method2398(var2.field717 + (var2.field728 * 64 - 64), var2.field747 + (var2.field728 * 64 - 64), Statics.field1), var2.field728 * 64 - 64 + 60, var2, var2.field705, var3, var2.field721);
                }
            }
        }
    }

    @ObfuscatedName("di.ae(I)V")
    public static final void method2562() {
        for (class24 var0 = (class24) field402.method3236(); var0 != null; var0 = (class24) field402.method3228()) {
            if (Statics.field1 != var0.field621 || var0.field628) {
                var0.method3288();
            } else if (field270 >= var0.field620) {
                var0.method548(field339);
                if (var0.field628) {
                    var0.method3288();
                } else {
                    Statics.field1911.method1618(var0.field621, var0.field622, var0.field623, var0.field619, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("d.ao(I)I")
    public static final int method149() {
        if (Statics.field156.field145) {
            return Statics.field1;
        } else {
            int var0 = method2398(Statics.field239, Statics.field1224, Statics.field1);
            return var0 - Statics.field1873 >= 800 || (class6.field75[Statics.field1][Statics.field239 >> 7][Statics.field1224 >> 7] & 0x4) == 0 ? 3 : Statics.field1;
        }
    }

    @ObfuscatedName("o.aj(III)V")
    public static final void method179(int arg0, int arg1) {
        if (field422 == 2) {
            method146((field281 - Statics.field1624 << 7) + field497, (field420 - Statics.field945 << 7) + field285, field283 * 2);
            if (field369 > -1 && field270 % 20 < 10) {
                Statics.field1491[0].method1500(field369 + arg0 - 12, field370 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("v.ap(Lai;IIIIII)V")
    public static final void method119(class30 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method28()) {
            return;
        }
        if (arg0 instanceof class28) {
            class32 var6 = ((class28) arg0).field684;
            if (var6.field802 != null) {
                var6 = var6.method616();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field385) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field33 != -1 || var8.field43 != -1) {
                method180(arg0, arg0.field751 + 15);
                if (field369 > -1) {
                    if (var8.field33 != -1) {
                        Statics.field1456[var8.field33].method1500(field369 + arg2 - 12, field370 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field43 != -1) {
                        Statics.field51[var8.field43].method1500(field369 + arg2 - 12, field370 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field422 == 10 && field280 == field386[arg1]) {
                method180(arg0, arg0.field751 + 15);
                if (field369 > -1) {
                    Statics.field1491[1].method1500(field369 + arg2 - 12, field370 + arg3 - var7);
                }
            }
        } else {
            class32 var9 = ((class28) arg0).field684;
            if (var9.field802 != null) {
                var9 = var9.method616();
            }
            if (var9.field800 >= 0 && var9.field800 < Statics.field51.length) {
                method180(arg0, arg0.field751 + 15);
                if (field369 > -1) {
                    Statics.field51[var9.field800].method1500(field369 + arg2 - 12, field370 + arg3 - 30);
                }
            }
            if (field422 == 1 && field279 == field484[arg1 - field385] && field270 % 20 < 10) {
                method180(arg0, arg0.field751 + 15);
                if (field369 > -1) {
                    Statics.field1491[0].method1500(field369 + arg2 - 12, field370 + arg3 - 28);
                }
            }
        }
        if (arg0.field750 != null && (arg1 >= field385 || field483 == 0 || field483 == 3 || field483 == 1 && method139(((class3) arg0).field36, false))) {
            method180(arg0, arg0.field751);
            if (field369 > -1 && field357 < field358) {
                field495[field357] = Statics.field87.method3311(arg0.field750) / 2;
                field352[field357] = Statics.field87.field2851;
                field438[field357] = field369;
                field360[field357] = field370;
                field363[field357] = arg0.field734;
                field501[field357] = arg0.field719;
                field365[field357] = arg0.field741;
                field366[field357] = arg0.field750;
                field357++;
            }
        }
        if (arg0.field724 > field270) {
            method180(arg0, arg0.field751 + 15);
            if (field369 > -1) {
                int var10 = arg0.field709 * 30 / arg0.field726;
                if (var10 > 30) {
                    var10 = 30;
                } else if (var10 == 0 && arg0.field709 > 0) {
                    var10 = 1;
                }
                class70.method1521(field369 + arg2 - 15, field370 + arg3 - 3, var10, 5, 65280);
                class70.method1521(field369 + arg2 - 15 + var10, field370 + arg3 - 3, 30 - var10, 5, 16711680);
            }
        }
        for (int var11 = 0; var11 < 4; var11++) {
            if (arg0.field723[var11] > field270) {
                method180(arg0, arg0.field751 / 2);
                if (field369 > -1) {
                    if (var11 == 1) {
                        field370 -= 20;
                    }
                    if (var11 == 2) {
                        field369 -= 15;
                        field370 -= 10;
                    }
                    if (var11 == 3) {
                        field369 += 15;
                        field370 -= 10;
                    }
                    Statics.field1779[arg0.field722[var11]].method1500(field369 + arg2 - 12, field370 + arg3 - 12);
                    Statics.field1028.method3318(Integer.toString(arg0.field707[var11]), field369 + arg2 - 1, field370 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("cb.am(IIIII)V")
    public static final void method1980(int arg0, int arg1, int arg2, int arg3) {
        field357 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field385 + field284; var6++) {
            class30 var7;
            if (var6 == -1) {
                var7 = Statics.field180;
            } else if (var6 < field385) {
                var7 = field510[field386[var6]];
                if (field398 == field386[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field325[field484[var6 - field385]];
            }
            method119(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method119(field510[field398], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field357; var8++) {
            int var9 = field438[var8];
            int var10 = field360[var8];
            int var11 = field495[var8];
            int var12 = field352[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field360[var14] - field352[var14] && var10 - var12 < field360[var14] + 2 && var9 - var11 < field495[var14] + field438[var14] && var9 + var11 > field438[var14] - field495[var14] && field360[var14] - field352[var14] < var10) {
                        var10 = field360[var14] - field352[var14];
                        var13 = true;
                    }
                }
            }
            field369 = field438[var8];
            field370 = field360[var8] = var10;
            String var15 = field366[var8];
            if (field427 == 0) {
                int var16 = 16776960;
                if (field363[var8] < 6) {
                    var16 = field513[field363[var8]];
                }
                if (field363[var8] == 6) {
                    var16 = field278 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field363[var8] == 7) {
                    var16 = field278 % 20 < 10 ? 255 : 65535;
                }
                if (field363[var8] == 8) {
                    var16 = field278 % 20 < 10 ? 45056 : 8454016;
                }
                if (field363[var8] == 9) {
                    int var17 = 150 - field365[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field363[var8] == 10) {
                    int var18 = 150 - field365[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field363[var8] == 11) {
                    int var19 = 150 - field365[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field501[var8] == 0) {
                    Statics.field87.method3318(var15, field369 + arg0, field370 + arg1, var16, 0);
                }
                if (field501[var8] == 1) {
                    Statics.field87.method3320(var15, field369 + arg0, field370 + arg1, var16, 0, field278);
                }
                if (field501[var8] == 2) {
                    Statics.field87.method3372(var15, field369 + arg0, field370 + arg1, var16, 0, field278);
                }
                if (field501[var8] == 3) {
                    Statics.field87.method3321(var15, field369 + arg0, field370 + arg1, var16, 0, field278, 150 - field365[var8]);
                }
                if (field501[var8] == 4) {
                    int var20 = (150 - field365[var8]) * (Statics.field87.method3311(var15) + 100) / 150;
                    class70.method1512(field369 + arg0 - 50, arg1, field369 + arg0 + 50, arg1 + arg3);
                    Statics.field87.method3354(var15, field369 + arg0 + 50 - var20, field370 + arg1, var16, 0);
                    class70.method1515(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field501[var8] == 5) {
                    int var21 = 150 - field365[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class70.method1512(arg0, field370 + arg1 - Statics.field87.field2851 - 1, arg0 + arg2, field370 + arg1 + 5);
                    Statics.field87.method3318(var15, field369 + arg0, field370 + arg1 + var22, var16, 0);
                    class70.method1515(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field87.method3318(var15, field369 + arg0, field370 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("an.az(IIIII)V")
    public static final void method701(int arg0, int arg1, int arg2, int arg3) {
        if (field374 == 1) {
            Statics.field336[field373 / 100].method1500(field371 - 8, field372 - 8);
        }
        if (field374 == 2) {
            Statics.field336[field373 / 100 + 4].method1500(field371 - 8, field372 - 8);
        }
        field383 = 0;
        int var4 = (Statics.field180.field717 >> 7) + Statics.field1624;
        int var5 = (Statics.field180.field747 >> 7) + Statics.field945;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field383 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field383 = 1;
        }
        if (field383 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field383 = 0;
        }
        if (!field276) {
            return;
        }
        int var6 = arg0 + 512 - 5;
        int var7 = arg1 + 20;
        Statics.field316.method3317("Fps:" + field2033, var6, var7, 16776960, -1);
        int var11 = var7 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        int var10 = 16776960;
        if (var9 > 32768 && field265) {
            var10 = 16711680;
        }
        if (var9 > 65536 && !field265) {
            var10 = 16711680;
        }
        Statics.field316.method3317("Mem:" + var9 + "k", var6, var11, var10, -1);
        var7 = var11 + 15;
    }

    @ObfuscatedName("x.aa(Lai;II)V")
    public static final void method180(class30 arg0, int arg1) {
        method146(arg0.field717, arg0.field747, arg1);
    }

    @ObfuscatedName("g.ab(IIIB)V")
    public static final void method146(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field369 = -1;
            field370 = -1;
            return;
        }
        int var3 = method2398(arg0, arg1, Statics.field1) - arg2;
        int var4 = arg0 - Statics.field239;
        int var5 = var3 - Statics.field1873;
        int var6 = arg1 - Statics.field1224;
        int var7 = class81.field1425[Statics.field951];
        int var8 = class81.field1446[Statics.field951];
        int var9 = class81.field1425[Statics.field1626];
        int var10 = class81.field1446[Statics.field1626];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field369 = (var11 << 9) / var15 + 256;
            field370 = (var14 << 9) / var15 + 167;
        } else {
            field369 = -1;
            field370 = -1;
        }
    }

    @ObfuscatedName("dq.aw(IIIB)I")
    public static final int method2398(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field75[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field103[var5][var3][var4] + class6.field103[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field103[var5][var3][var4 + 1] + class6.field103[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("az.av(IIIIIII)V")
    public static final void method896(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class81.field1425[var6];
            int var12 = class81.field1446[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class81.field1425[var7];
            int var15 = class81.field1446[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field239 = arg0 - var8;
        Statics.field1873 = arg1 - var9;
        Statics.field1224 = arg2 - var10;
        Statics.field951 = arg3;
        Statics.field1626 = arg4;
    }

    @ObfuscatedName("bm.al(ZI)V")
    public static final void method1606(boolean arg0) {
        field522 = arg0;
        if (!field522) {
            int var1 = field306.method2206();
            int var2 = field306.method2152();
            int var3 = field306.method2161();
            int var4 = field306.method2159();
            int var5 = (field462 - field306.field1815) / 16;
            Statics.field1241 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var7 = 0; var7 < 4; var7++) {
                    Statics.field1241[var6][var7] = field306.method2171();
                }
            }
            int var8 = field306.method2161();
            Statics.field613 = new int[var5];
            Statics.field47 = new int[var5];
            Statics.field149 = new int[var5];
            Statics.field862 = new byte[var5][];
            Statics.field48 = new byte[var5][];
            boolean var9 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var3 / 8 == 48) {
                var9 = true;
            }
            if (var8 / 8 == 48 && var3 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var8 - 6) / 8; var11 <= (var8 + 6) / 8; var11++) {
                for (int var12 = (var3 - 6) / 8; var12 <= (var3 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field613[var10] = var13;
                        Statics.field47[var10] = Statics.field1971.method2760("m" + var11 + "_" + var12);
                        Statics.field149[var10] = Statics.field1971.method2760("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method2066(var8, var3, var2, var1, var4);
            return;
        }
        int var14 = field306.method2159();
        int var15 = field306.method2159();
        field306.method2397();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = field306.method2371(1);
                    if (var19 == 1) {
                        field331[var16][var17][var18] = field306.method2371(26);
                    } else {
                        field331[var16][var17][var18] = -1;
                    }
                }
            }
        }
        field306.method2377();
        int var20 = (field462 - field306.field1815) / 16;
        Statics.field1241 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var22 = 0; var22 < 4; var22++) {
                Statics.field1241[var21][var22] = field306.method2170();
            }
        }
        int var23 = field306.method2153();
        int var24 = field306.method2160();
        int var25 = field306.method2206();
        Statics.field613 = new int[var20];
        Statics.field47 = new int[var20];
        Statics.field149 = new int[var20];
        Statics.field862 = new byte[var20][];
        Statics.field48 = new byte[var20][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field331[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field613[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field613[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field47[var26] = Statics.field1971.method2760("m" + var35 + "_" + var36);
                            Statics.field149[var26] = Statics.field1971.method2760("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method2066(var14, var15, var23, var25, var24);
    }

    @ObfuscatedName("cy.aq(IIIIII)V")
    public static final void method2066(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field2007 == arg0 && Statics.field1843 == arg1 && field408 == arg2 || !field265) {
            return;
        }
        Statics.field2007 = arg0;
        Statics.field1843 = arg1;
        field408 = arg2;
        if (!field265) {
            field408 = 0;
        }
        method1889(25);
        method3174(class139.field2135, true);
        int var5 = Statics.field1624;
        int var6 = Statics.field945;
        Statics.field1624 = (arg0 - 6) * 8;
        Statics.field945 = (arg1 - 6) * 8;
        int var7 = Statics.field1624 - var5;
        int var8 = Statics.field945 - var6;
        int var9 = Statics.field1624;
        int var10 = Statics.field945;
        for (int var11 = 0; var11 < 32768; var11++) {
            class28 var12 = field325[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field740[var13] -= var7;
                    var12.field757[var13] -= var8;
                }
                var12.field717 -= var7 * 128;
                var12.field747 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field510[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field740[var16] -= var7;
                    var15.field757[var16] -= var8;
                }
                var15.field717 -= var7 * 128;
                var15.field747 -= var8 * 128;
            }
        }
        Statics.field1 = arg2;
        Statics.field180.method595(arg3, arg4, false);
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
                        field473[var27][var23][var24] = field473[var27][var25][var26];
                    } else {
                        field473[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class14 var28 = (class14) field400.method3236(); var28 != null; var28 = (class14) field400.method3228()) {
            var28.field221 -= var7;
            var28.field210 -= var8;
            if (var28.field221 < 0 || var28.field210 < 0 || var28.field221 >= 104 || var28.field210 >= 104) {
                var28.method3288();
            }
        }
        if (field406 != 0) {
            field406 -= var7;
            field367 -= var8;
        }
        field506 = 0;
        field512 = false;
        field493 = -1;
        field402.method3220();
        field401.method3220();
    }

    @ObfuscatedName("eo.au(ZS)V")
    public static final void method2712(boolean arg0) {
        method513();
        field431++;
        if (field431 < 50 && !arg0) {
            return;
        }
        field431 = 0;
        if (field315 || Statics.field1822 == null) {
            return;
        }
        field340.method2376(128);
        try {
            Statics.field1822.method2600(field340.field1819, 0, field340.field1815);
            field340.field1815 = 0;
        } catch (IOException var2) {
            field315 = true;
        }
    }

    @ObfuscatedName("am.ay(I)V")
    public static final void method832() {
        method2712(false);
        field376 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field862.length; var1++) {
            if (Statics.field47[var1] != -1 && Statics.field862[var1] == null) {
                Statics.field862[var1] = Statics.field1971.method2768(Statics.field47[var1], 0);
                if (Statics.field862[var1] == null) {
                    var0 = false;
                    field376++;
                }
            }
            if (Statics.field149[var1] != -1 && Statics.field48[var1] == null) {
                Statics.field48[var1] = Statics.field1971.method2746(Statics.field149[var1], 0, Statics.field1241[var1]);
                if (Statics.field48[var1] == null) {
                    var0 = false;
                    field376++;
                }
            }
        }
        if (!var0) {
            field322 = 1;
            return;
        }
        field320 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field862.length; var3++) {
            byte[] var4 = Statics.field48[var3];
            if (var4 != null) {
                int var5 = (Statics.field613[var3] >> 8) * 64 - Statics.field1624;
                int var6 = (Statics.field613[var3] & 0xFF) * 64 - Statics.field945;
                if (field522) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class104 var9 = new class104(var4);
                int var10 = -1;
                label439: while (true) {
                    int var11 = var9.method2204();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2204();
                            if (var16 == 0) {
                                continue label439;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2257() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class33 var22 = class33.method115(var10);
                                if (var19 != 22 || !field265 || var22.field832 != 0 || var22.field830 == 1 || var22.field851) {
                                    if (!var22.method647()) {
                                        field320++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2204();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2257();
                    }
                }
            }
        }
        if (!var2) {
            field322 = 2;
            return;
        }
        if (field322 != 0) {
            method3174(class139.field2135 + class2.field23 + class2.field21 + 100 + "%" + class2.field20, true);
        }
        method513();
        method54();
        method513();
        Statics.field1911.method1607();
        method513();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field323[var23].method3455();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field75[var24][var25][var26] = 0;
                }
            }
        }
        method513();
        class6.method570();
        int var27 = Statics.field862.length;
        class19.method2718();
        method2712(true);
        if (!field522) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field613[var28] >> 8) * 64 - Statics.field1624;
                int var30 = (Statics.field613[var28] & 0xFF) * 64 - Statics.field945;
                byte[] var31 = Statics.field862[var28];
                if (var31 != null) {
                    method513();
                    int var32 = Statics.field2007 * 8 - 48;
                    int var33 = Statics.field1843 * 8 - 48;
                    class187[] var34 = field323;
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 64; var36++) {
                            for (int var37 = 0; var37 < 64; var37++) {
                                if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                    var34[var35].field2901[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class104 var38 = new class104(var31);
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 64; var40++) {
                            for (int var41 = 0; var41 < 64; var41++) {
                                class6.method581(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < var27; var42++) {
                int var43 = (Statics.field613[var42] >> 8) * 64 - Statics.field1624;
                int var44 = (Statics.field613[var42] & 0xFF) * 64 - Statics.field945;
                byte[] var45 = Statics.field862[var42];
                if (var45 == null && Statics.field1843 < 800) {
                    method513();
                    class6.method507(var43, var44, 64, 64);
                }
            }
            method2712(true);
            for (int var46 = 0; var46 < var27; var46++) {
                byte[] var47 = Statics.field48[var46];
                if (var47 != null) {
                    int var48 = (Statics.field613[var46] >> 8) * 64 - Statics.field1624;
                    int var49 = (Statics.field613[var46] & 0xFF) * 64 - Statics.field945;
                    method513();
                    class6.method2728(var47, var48, var49, Statics.field1911, field323);
                }
            }
        }
        if (field522) {
            for (int var50 = 0; var50 < 4; var50++) {
                method513();
                for (int var51 = 0; var51 < 13; var51++) {
                    for (int var52 = 0; var52 < 13; var52++) {
                        boolean var53 = false;
                        int var54 = field331[var50][var51][var52];
                        if (var54 != -1) {
                            int var55 = var54 >> 24 & 0x3;
                            int var56 = var54 >> 1 & 0x3;
                            int var57 = var54 >> 14 & 0x3FF;
                            int var58 = var54 >> 3 & 0x7FF;
                            int var59 = (var57 / 8 << 8) + var58 / 8;
                            for (int var60 = 0; var60 < Statics.field613.length; var60++) {
                                if (Statics.field613[var60] == var59 && Statics.field862[var60] != null) {
                                    class6.method244(Statics.field862[var60], var50, var51 * 8, var52 * 8, var55, (var57 & 0x7) * 8, (var58 & 0x7) * 8, var56, field323);
                                    var53 = true;
                                    break;
                                }
                            }
                        }
                        if (!var53) {
                            class6.method529(var50, var51 * 8, var52 * 8);
                        }
                    }
                }
            }
            for (int var61 = 0; var61 < 13; var61++) {
                for (int var62 = 0; var62 < 13; var62++) {
                    int var63 = field331[0][var61][var62];
                    if (var63 == -1) {
                        class6.method507(var61 * 8, var62 * 8, 8, 8);
                    }
                }
            }
            method2712(true);
            for (int var64 = 0; var64 < 4; var64++) {
                method513();
                for (int var65 = 0; var65 < 13; var65++) {
                    for (int var66 = 0; var66 < 13; var66++) {
                        int var67 = field331[var64][var65][var66];
                        if (var67 != -1) {
                            int var68 = var67 >> 24 & 0x3;
                            int var69 = var67 >> 1 & 0x3;
                            int var70 = var67 >> 14 & 0x3FF;
                            int var71 = var67 >> 3 & 0x7FF;
                            int var72 = (var70 / 8 << 8) + var71 / 8;
                            for (int var73 = 0; var73 < Statics.field613.length; var73++) {
                                if (Statics.field613[var73] == var72 && Statics.field48[var73] != null) {
                                    class6.method42(Statics.field48[var73], var64, var65 * 8, var66 * 8, var68, (var70 & 0x7) * 8, (var71 & 0x7) * 8, var69, Statics.field1911, field323);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2712(true);
        method54();
        method513();
        class6.method2722(Statics.field1911, field323);
        method2712(true);
        int var74 = class6.field77;
        if (var74 > Statics.field1) {
            var74 = Statics.field1;
        }
        if (var74 < Statics.field1 - 1) {
            int var75 = Statics.field1 - 1;
        }
        if (field265) {
            Statics.field1911.method1691(class6.field77);
        } else {
            Statics.field1911.method1691(0);
        }
        for (int var76 = 0; var76 < 104; var76++) {
            for (int var77 = 0; var77 < 104; var77++) {
                method2434(var76, var77);
            }
        }
        method513();
        for (class14 var78 = (class14) field400.method3236(); var78 != null; var78 = (class14) field400.method3228()) {
            if (var78.field209 == -1) {
                var78.field217 = 0;
                method1789(var78);
            } else {
                var78.method3288();
            }
        }
        class33.field846.method3193();
        if (Statics.field138 != null) {
            field340.method2376(199);
            field340.method2144(1057001181);
        }
        if (!field522) {
            int var79 = (Statics.field2007 - 6) / 8;
            int var80 = (Statics.field2007 + 6) / 8;
            int var81 = (Statics.field1843 - 6) / 8;
            int var82 = (Statics.field1843 + 6) / 8;
            for (int var83 = var79 - 1; var83 <= var80 + 1; var83++) {
                for (int var84 = var81 - 1; var84 <= var82 + 1; var84++) {
                    if (var83 < var79 || var83 > var80 || var84 < var81 || var84 > var82) {
                        Statics.field1971.method2764("m" + var83 + "_" + var84);
                        Statics.field1971.method2764("l" + var83 + "_" + var84);
                    }
                }
            }
        }
        method1889(30);
        method513();
        class6.method2844();
        field340.method2376(44);
        class128.method2463();
    }

    @ObfuscatedName("g.at(IB)V")
    public static final void method147(int arg0) {
        int[] var1 = Statics.field606.field1274;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field75[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1911.method1748(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field75[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1911.method1748(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field606.method1437();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field75[arg0][var10][var9] & 0x18) == 0) {
                    method1880(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field75[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method1880(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field329 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1911.method1635(Statics.field1, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class33.method115(var14).field841;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field323[Statics.field1].field2901;
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
                        field260[field329] = Statics.field1908[var15];
                        field364[field329] = var16;
                        field415[field329] = var17;
                        field329++;
                    }
                }
            }
        }
        Statics.field1913.method1417();
    }

    @ObfuscatedName("cd.af(IIIIII)V")
    public static final void method1880(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1911.method1632(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1911.method1636(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field606.field1274;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class33 var13 = class33.method115(var12);
            if (var13.field819 == -1) {
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
                class71 var14 = Statics.field1263[var13.field819];
                if (var14 != null) {
                    int var15 = (var13.field828 * 4 - var14.field1287) / 2;
                    int var16 = (var13.field836 * 4 - var14.field1288) / 2;
                    var14.method1583(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field836) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1911.method1634(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1911.method1636(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class33 var22 = class33.method115(var21);
            if (var22.field819 != -1) {
                class71 var23 = Statics.field1263[var22.field819];
                if (var23 != null) {
                    int var24 = (var22.field828 * 4 - var23.field1287) / 2;
                    int var25 = (var22.field836 * 4 - var23.field1288) / 2;
                    var23.method1583(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field836) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field606.field1274;
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
        int var29 = Statics.field1911.method1635(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class33 var31 = class33.method115(var30);
        if (var31.field819 == -1) {
            return;
        }
        class71 var32 = Statics.field1263[var31.field819];
        if (var32 != null) {
            int var33 = (var31.field828 * 4 - var32.field1287) / 2;
            int var34 = (var31.field836 * 4 - var32.field1288) / 2;
            var32.method1583(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field836) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("az.bp(I)Z")
    public static final boolean method899() {
        if (Statics.field1822 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1822.method2599();
            if (var0 == 0) {
                return false;
            }
            if (field308 == -1) {
                Statics.field1822.method2597(field306.field1819, 0, 1);
                field306.field1815 = 0;
                field308 = field306.method2395();
                field462 = class162.field2772[field308];
                var0--;
            }
            if (field462 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1822.method2597(field306.field1819, 0, 1);
                field462 = field306.field1819[0] & 0xFF;
                var0--;
            }
            if (field462 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1822.method2597(field306.field1819, 0, 2);
                field306.field1815 = 0;
                field462 = field306.method2206();
                var0 -= 2;
            }
            if (var0 < field462) {
                return false;
            }
            field306.field1815 = 0;
            Statics.field1822.method2597(field306.field1819, 0, field462);
            field309 = 0;
            field417 = field502;
            field502 = field312;
            field312 = field308;
            if (field308 == 65) {
                int var1 = field306.method2206();
                class13.method495(var1);
                field407[++field453 - 1 & 0x1F] = var1 & 0x7FFF;
                field308 = -1;
                return true;
            }
            if (field308 == 246) {
                int var2 = field306.method2254();
                int var3 = field306.method2130();
                int var4 = field306.method2163();
                class148 var5 = class148.method16(var3);
                int var6 = var5.field2500 + var2;
                int var7 = var5.field2582 + var4;
                if (var5.field2521 != var6 || var5.field2499 != var7) {
                    var5.field2521 = var6;
                    var5.field2499 = var7;
                    method32(var5);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 213) {
                Statics.field22 = class114.method2708(field306.method2257());
                field308 = -1;
                return true;
            }
            if (field308 == 245) {
                int var8 = field306.method2130();
                class4 var9 = (class4) field426.method3208((long) var8);
                if (var9 != null) {
                    method2443(var9, true);
                }
                if (field429 != null) {
                    method32(field429);
                    field429 = null;
                }
                field308 = -1;
                return true;
            }
            if (field308 == 197) {
                method1606(false);
                field308 = -1;
                return true;
            }
            if (field308 == 128) {
                class107 var10 = field306;
                int var11 = field462;
                class178 var12 = new class178();
                var12.field2824 = var10.method2257();
                var12.field2826 = var10.method2130();
                var12.field2825 = new int[var12.field2824];
                var12.field2827 = new int[var12.field2824];
                var12.field2823 = new Field[var12.field2824];
                var12.field2828 = new int[var12.field2824];
                var12.field2829 = new Method[var12.field2824];
                var12.field2830 = new byte[var12.field2824][][];
                for (int var13 = 0; var13 < var12.field2824; var13++) {
                    try {
                        int var14 = var10.method2257();
                        if (var14 == 0 || var14 == 1 || var14 == 2) {
                            String var15 = new String(var10.method2187());
                            String var16 = new String(var10.method2187());
                            int var17 = 0;
                            if (var14 == 1) {
                                var17 = var10.method2130();
                            }
                            var12.field2825[var13] = var14;
                            var12.field2828[var13] = var17;
                            var12.field2823[var13] = class179.method2479(var15).getDeclaredField(var16);
                        } else if (var14 == 3 || var14 == 4) {
                            String var18 = new String(var10.method2187());
                            String var19 = new String(var10.method2187());
                            int var20 = var10.method2257();
                            String[] var21 = new String[var20];
                            for (int var22 = 0; var22 < var20; var22++) {
                                var21[var22] = new String(var10.method2187());
                            }
                            byte[][] var23 = new byte[var20][];
                            if (var14 == 3) {
                                for (int var24 = 0; var24 < var20; var24++) {
                                    int var25 = var10.method2130();
                                    var23[var24] = new byte[var25];
                                    var10.method2146(var23[var24], 0, var25);
                                }
                            }
                            var12.field2825[var13] = var14;
                            Class[] var26 = new Class[var20];
                            for (int var27 = 0; var27 < var20; var27++) {
                                var26[var27] = class179.method2479(var21[var27]);
                            }
                            var12.field2829[var13] = class179.method2479(var18).getDeclaredMethod(var19, var26);
                            var12.field2830[var13] = var23;
                        }
                    } catch (ClassNotFoundException var302) {
                        var12.field2827[var13] = -1;
                    } catch (SecurityException var303) {
                        var12.field2827[var13] = -2;
                    } catch (NullPointerException var304) {
                        var12.field2827[var13] = -3;
                    } catch (Exception var305) {
                        var12.field2827[var13] = -4;
                    } catch (Throwable var306) {
                        var12.field2827[var13] = -5;
                    }
                }
                class179.field2832.method3221(var12);
                field308 = -1;
                return true;
            }
            if (field308 == 149) {
                int var33 = field306.method2170();
                int var34 = field306.method2165();
                class148 var35 = class148.method16(var33);
                if (var35.field2589 != var34 || var34 == -1) {
                    var35.field2589 = var34;
                    var35.field2524 = 0;
                    var35.field2501 = 0;
                    method32(var35);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 134) {
                int var36 = field306.method2151();
                int var37 = field306.method2152();
                int var38 = field306.method2152();
                Statics.field1 = var38 >> 1;
                Statics.field180.method595(var37, var36, (var38 & 0x1) == 1);
                field308 = -1;
                return true;
            }
            if (field308 == 137) {
                String var39 = field306.method2187();
                long var40 = (long) field306.method2206();
                long var42 = (long) field306.method2167();
                int var44 = field306.method2257();
                long var45 = (var40 << 32) + var42;
                boolean var47 = false;
                for (int var48 = 0; var48 < 100; var48++) {
                    if (field485[var48] == var45) {
                        var47 = true;
                        break;
                    }
                }
                if (method1986(var39)) {
                    var47 = true;
                }
                if (!var47 && field383 == 0) {
                    field485[field486] = var45;
                    field486 = (field486 + 1) % 100;
                    class107 var49 = field306;
                    String var53;
                    try {
                        int var50 = var49.method2204();
                        if (var50 > 32767) {
                            var50 = 32767;
                        }
                        byte[] var51 = new byte[var50];
                        var49.field1815 += Statics.field2843.method2068(var49.field1819, var49.field1815, var51, 0, var50);
                        String var52 = class191.method37(var51, 0, var50);
                        var53 = var52;
                    } catch (Exception var301) {
                        var53 = "Cabbage";
                    }
                    String var56 = class182.method3315(class189.method544(var53));
                    if (var44 == 2 || var44 == 3) {
                        method555(7, class2.method2717(1) + var39, var56);
                    } else if (var44 == 1) {
                        method555(7, class2.method2717(0) + var39, var56);
                    } else {
                        method555(3, var39, var56);
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 151) {
                String var57 = field306.method2187();
                class107 var58 = field306;
                String var62;
                try {
                    int var59 = var58.method2204();
                    if (var59 > 32767) {
                        var59 = 32767;
                    }
                    byte[] var60 = new byte[var59];
                    var58.field1815 += Statics.field2843.method2068(var58.field1819, var58.field1815, var60, 0, var59);
                    String var61 = class191.method37(var60, 0, var59);
                    var62 = var61;
                } catch (Exception var300) {
                    var62 = "Cabbage";
                }
                String var65 = class182.method3315(class189.method544(var62));
                method555(6, var57, var65);
                field308 = -1;
                return true;
            }
            if (field308 == 165) {
                Statics.field1735 = field306.method2152();
                Statics.field866 = field306.method2257();
                while (field306.field1815 < field462) {
                    field308 = field306.method2257();
                    method2857();
                }
                field308 = -1;
                return true;
            }
            if (field308 == 96 || field308 == 83 || field308 == 5 || field308 == 103 || field308 == 192 || field308 == 81 || field308 == 191 || field308 == 182 || field308 == 239 || field308 == 42) {
                method2857();
                field308 = -1;
                return true;
            }
            if (field308 == 92) {
                int var66 = field306.method2161();
                int var67 = field306.method2130();
                int var68 = field306.method2206();
                class148 var69 = class148.method16(var67);
                var69.field2537 = (var68 << 16) + var66;
                field308 = -1;
                return true;
            }
            if (field308 == 69) {
                int var70 = field306.method2130();
                int var71 = field306.method2160();
                class150.field2622[var71] = var70;
                if (class150.field2625[var71] != var70) {
                    class150.field2625[var71] = var70;
                    Statics.method536(var71);
                }
                field452[++field338 - 1 & 0x1F] = var71;
                field308 = -1;
                return true;
            }
            if (field308 == 110) {
                field512 = true;
                Statics.field65 = field306.method2257();
                Statics.field193 = field306.method2257();
                Statics.field13 = field306.method2206();
                Statics.field1864 = field306.method2257();
                Statics.field2002 = field306.method2257();
                if (Statics.field2002 >= 100) {
                    int var72 = Statics.field65 * 128 + 64;
                    int var73 = Statics.field193 * 128 + 64;
                    int var74 = method2398(var72, var73, Statics.field1) - Statics.field13;
                    int var75 = var72 - Statics.field239;
                    int var76 = var74 - Statics.field1873;
                    int var77 = var73 - Statics.field1224;
                    int var78 = (int) Math.sqrt((double) (var75 * var75 + var77 * var77));
                    Statics.field951 = (int) (Math.atan2((double) var76, (double) var78) * 325.949D) & 0x7FF;
                    Statics.field1626 = (int) (Math.atan2((double) var75, (double) var77) * -325.949D) & 0x7FF;
                    if (Statics.field951 < 128) {
                        Statics.field951 = 128;
                    }
                    if (Statics.field951 > 383) {
                        Statics.field951 = 383;
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 198) {
                field392 = 0;
                field387 = 0;
                field306.method2397();
                int var79 = field306.method2371(8);
                if (var79 < field284) {
                    for (int var80 = var79; var80 < field284; var80++) {
                        field393[++field392 - 1] = field484[var80];
                    }
                }
                if (var79 > field284) {
                    throw new RuntimeException("");
                }
                field284 = 0;
                for (int var81 = 0; var81 < var79; var81++) {
                    int var82 = field484[var81];
                    class28 var83 = field325[var82];
                    int var84 = field306.method2371(1);
                    if (var84 == 0) {
                        field484[++field284 - 1] = var82;
                        var83.field756 = field270;
                    } else {
                        int var85 = field306.method2371(2);
                        if (var85 == 0) {
                            field484[++field284 - 1] = var82;
                            var83.field756 = field270;
                            field388[++field387 - 1] = var82;
                        } else if (var85 == 1) {
                            field484[++field284 - 1] = var82;
                            var83.field756 = field270;
                            int var86 = field306.method2371(3);
                            var83.method605(var86, false);
                            int var87 = field306.method2371(1);
                            if (var87 == 1) {
                                field388[++field387 - 1] = var82;
                            }
                        } else if (var85 == 2) {
                            field484[++field284 - 1] = var82;
                            var83.field756 = field270;
                            int var88 = field306.method2371(3);
                            var83.method605(var88, true);
                            int var89 = field306.method2371(3);
                            var83.method605(var89, true);
                            int var90 = field306.method2371(1);
                            if (var90 == 1) {
                                field388[++field387 - 1] = var82;
                            }
                        } else if (var85 == 3) {
                            field393[++field392 - 1] = var82;
                        }
                    }
                }
                while (field306.method2374(field462) >= 27) {
                    int var91 = field306.method2371(15);
                    if (var91 == 32767) {
                        break;
                    }
                    boolean var92 = false;
                    if (field325[var91] == null) {
                        field325[var91] = new class28();
                        var92 = true;
                    }
                    class28 var93 = field325[var91];
                    field484[++field284 - 1] = var91;
                    var93.field756 = field270;
                    int var94 = field306.method2371(1);
                    if (var94 == 1) {
                        field388[++field387 - 1] = var91;
                    }
                    int var95 = field306.method2371(5);
                    if (var95 > 15) {
                        var95 -= 32;
                    }
                    int var96 = field306.method2371(5);
                    if (var96 > 15) {
                        var96 -= 32;
                    }
                    var93.field684 = Statics.method15(field306.method2371(14));
                    int var97 = field397[field306.method2371(3)];
                    if (var92) {
                        var93.field752 = var93.field705 = var97;
                    }
                    int var98 = field306.method2371(1);
                    var93.field728 = var93.field684.field778;
                    var93.field754 = var93.field684.field808;
                    if (var93.field754 == 0) {
                        var93.field705 = 0;
                    }
                    var93.field755 = var93.field684.field801;
                    var93.field712 = var93.field684.field785;
                    var93.field713 = var93.field684.field786;
                    var93.field714 = var93.field684.field789;
                    var93.field711 = var93.field684.field781;
                    var93.field704 = var93.field684.field774;
                    var93.field710 = var93.field684.field783;
                    var93.method595(Statics.field180.field740[0] + var95, Statics.field180.field757[0] + var96, var98 == 1);
                }
                field306.method2377();
                method1020();
                for (int var99 = 0; var99 < field392; var99++) {
                    int var100 = field393[var99];
                    if (field270 != field325[var100].field756) {
                        field325[var100].field684 = null;
                        field325[var100] = null;
                    }
                }
                if (field462 != field306.field1815) {
                    throw new RuntimeException(field306.field1815 + class2.field17 + field462);
                }
                for (int var101 = 0; var101 < field284; var101++) {
                    if (field325[field484[var101]] == null) {
                        throw new RuntimeException(var101 + class2.field17 + field284);
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 163) {
                field500 = field306.method2257();
                field308 = -1;
                return true;
            }
            if (field308 == 40) {
                field512 = true;
                Statics.field547 = field306.method2257();
                Statics.field2682 = field306.method2257();
                Statics.field115 = field306.method2206();
                Statics.field246 = field306.method2257();
                Statics.field2867 = field306.method2257();
                if (Statics.field2867 >= 100) {
                    Statics.field239 = Statics.field547 * 128 + 64;
                    Statics.field1224 = Statics.field2682 * 128 + 64;
                    Statics.field1873 = method2398(Statics.field239, Statics.field1224, Statics.field1) - Statics.field115;
                }
                field308 = -1;
                return true;
            }
            if (field308 == 60) {
                for (int var102 = 0; var102 < field510.length; var102++) {
                    if (field510[var102] != null) {
                        field510[var102].field733 = -1;
                    }
                }
                for (int var103 = 0; var103 < field325.length; var103++) {
                    if (field325[var103] != null) {
                        field325[var103].field733 = -1;
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 160) {
                int var104 = field306.method2169();
                int var105 = field306.method2160();
                int var106 = field306.method2152();
                class4 var107 = (class4) field426.method3208((long) var104);
                if (var107 != null) {
                    method2443(var107, var107.field56 != var105);
                }
                method2723(var104, var105, var106);
                field308 = -1;
                return true;
            }
            if (field308 == 194) {
                while (field306.field1815 < field462) {
                    boolean var108 = field306.method2257() == 1;
                    String var109 = field306.method2187();
                    String var110 = field306.method2187();
                    int var111 = field306.method2206();
                    int var112 = field306.method2257();
                    int var113 = field306.method2257();
                    boolean var114 = (var113 & 0x2) != 0;
                    boolean var115 = (var113 & 0x1) != 0;
                    if (var111 > 0) {
                        field306.method2187();
                        field306.method2257();
                        field306.method2130();
                    }
                    field306.method2187();
                    for (int var116 = 0; var116 < field518; var116++) {
                        class15 var117 = field520[var116];
                        if (var108) {
                            if (var110.equals(var117.field225)) {
                                var117.field225 = var109;
                                var117.field223 = var110;
                                var109 = null;
                                break;
                            }
                        } else if (var109.equals(var117.field225)) {
                            if (var117.field226 != var111) {
                                boolean var118 = true;
                                for (class31 var119 = (class31) field410.method3197(); var119 != null; var119 = (class31) field410.method3195()) {
                                    if (var119.field763.equals(var109)) {
                                        if (var111 != 0 && var119.field768 == 0) {
                                            var119.method3286();
                                            var118 = false;
                                        } else if (var111 == 0 && var119.field768 != 0) {
                                            var119.method3286();
                                            var118 = false;
                                        }
                                    }
                                }
                                if (var118) {
                                    field410.method3204(new class31(var109, var111));
                                }
                                var117.field226 = var111;
                            }
                            var117.field223 = var110;
                            var117.field227 = var112;
                            var117.field224 = var114;
                            var117.field230 = var115;
                            var109 = null;
                            break;
                        }
                    }
                    if (var109 != null && field518 < 400) {
                        class15 var120 = new class15();
                        field520[field518] = var120;
                        var120.field225 = var109;
                        var120.field223 = var110;
                        var120.field226 = var111;
                        var120.field227 = var112;
                        var120.field224 = var114;
                        var120.field230 = var115;
                        field518++;
                    }
                }
                field519 = 2;
                field457 = field449;
                boolean var121 = false;
                int var122 = field518;
                while (var122 > 0) {
                    boolean var123 = true;
                    var122--;
                    for (int var124 = 0; var124 < var122; var124++) {
                        boolean var125 = false;
                        class15 var126 = field520[var124];
                        class15 var127 = field520[var124 + 1];
                        if (field494 != var126.field226 && field494 == var127.field226) {
                            var125 = true;
                        }
                        if (!var125 && var126.field226 == 0 && var127.field226 != 0) {
                            var125 = true;
                        }
                        if (!var125 && !var126.field224 && var127.field224) {
                            var125 = true;
                        }
                        if (!var125 && !var126.field230 && var127.field230) {
                            var125 = true;
                        }
                        if (var125) {
                            class15 var128 = field520[var124];
                            field520[var124] = field520[var124 + 1];
                            field520[var124 + 1] = var128;
                            var123 = false;
                        }
                    }
                    if (var123) {
                        break;
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 52) {
                for (int var129 = 0; var129 < Statics.field1025; var129++) {
                    class43 var130 = class43.method178(var129);
                    if (var130 != null && var130.field1027 == 0) {
                        class150.field2622[var129] = 0;
                        class150.field2625[var129] = 0;
                    }
                }
                method2476();
                field338 += 32;
                field308 = -1;
                return true;
            }
            if (field308 == 86) {
                int var131 = field306.method2169();
                boolean var132 = field306.method2151() == 1;
                class148 var133 = class148.method16(var131);
                if (var133.field2505 != var132) {
                    var133.field2505 = var132;
                    method32(var133);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 10) {
                method1606(true);
                field308 = -1;
                return true;
            }
            if (field308 == 49) {
                field483 = field306.method2257();
                field314 = field306.method2257();
                field308 = -1;
                return true;
            }
            if (field308 == 119) {
                method2560();
                field308 = -1;
                return true;
            }
            if (field308 == 214) {
                field406 = field306.method2257();
                if (field406 == 255) {
                    field406 = 0;
                }
                field367 = field306.method2257();
                if (field367 == 255) {
                    field367 = 0;
                }
                field308 = -1;
                return true;
            }
            if (field308 == 126) {
                int var134 = field306.method2169();
                int var135 = field306.method2206();
                int var136 = var135 >> 10 & 0x1F;
                int var137 = var135 >> 5 & 0x1F;
                int var138 = var135 & 0x1F;
                int var139 = (var138 << 3) + (var136 << 19) + (var137 << 11);
                class148 var140 = class148.method16(var134);
                if (var140.field2510 != var139) {
                    var140.field2510 = var139;
                    method32(var140);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 4) {
                String var141 = field306.method2187();
                int var142 = field306.method2206();
                byte var143 = field306.method2237();
                boolean var144 = false;
                if (var143 == -128) {
                    var144 = true;
                }
                if (var144) {
                    if (Statics.field1794 == 0) {
                        field308 = -1;
                        return true;
                    }
                    boolean var145 = false;
                    int var146;
                    for (var146 = 0; var146 < Statics.field1794 && (!Statics.field187[var146].field578.equals(var141) || Statics.field187[var146].field573 != var142); var146++) {
                    }
                    if (var146 < Statics.field1794) {
                        while (var146 < Statics.field1794 - 1) {
                            Statics.field187[var146] = Statics.field187[var146 + 1];
                            var146++;
                        }
                        Statics.field1794--;
                        Statics.field187[Statics.field1794] = null;
                    }
                } else {
                    field306.method2187();
                    class20 var147 = new class20();
                    var147.field578 = var141;
                    var147.field572 = class190.method582(var147.field578, Statics.field263);
                    var147.field573 = var142;
                    var147.field574 = var143;
                    int var148;
                    for (var148 = Statics.field1794 - 1; var148 >= 0; var148--) {
                        int var149 = Statics.field187[var148].field572.compareTo(var147.field578);
                        if (var149 == 0) {
                            Statics.field187[var148].field573 = var142;
                            Statics.field187[var148].field574 = var143;
                            if (var141.equals(Statics.field180.field36)) {
                                Statics.field1899 = var143;
                            }
                            field458 = field449;
                            field308 = -1;
                            return true;
                        }
                        if (var149 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1794 >= Statics.field187.length) {
                        field308 = -1;
                        return true;
                    }
                    for (int var150 = Statics.field1794 - 1; var150 > var148; var150--) {
                        Statics.field187[var150 + 1] = Statics.field187[var150];
                    }
                    if (Statics.field1794 == 0) {
                        Statics.field187 = new class20[100];
                    }
                    Statics.field187[var148 + 1] = var147;
                    Statics.field1794++;
                    if (var141.equals(Statics.field180.field36)) {
                        Statics.field1899 = var143;
                    }
                }
                field458 = field449;
                field308 = -1;
                return true;
            }
            if (field308 == 73) {
                int var151 = field462 + field306.field1815;
                int var152 = field306.method2206();
                int var153 = field306.method2206();
                if (field425 != var152) {
                    field425 = var152;
                    method492(field425);
                    class29.method2719(field425);
                    for (int var154 = 0; var154 < 100; var154++) {
                        field469[var154] = true;
                    }
                }
                while (var153-- > 0) {
                    int var155 = field306.method2130();
                    int var156 = field306.method2206();
                    int var157 = field306.method2257();
                    class4 var158 = (class4) field426.method3208((long) var155);
                    if (var158 != null && var158.field56 != var156) {
                        method2443(var158, true);
                        var158 = null;
                    }
                    if (var158 == null) {
                        var158 = method2723(var155, var156, var157);
                    }
                    var158.field53 = true;
                }
                for (class4 var159 = (class4) field426.method3211(); var159 != null; var159 = (class4) field426.method3212()) {
                    if (var159.field53) {
                        var159.field53 = false;
                    } else {
                        method2443(var159, true);
                    }
                }
                field282 = new class169(512);
                while (field306.field1815 < var151) {
                    int var160 = field306.method2130();
                    int var161 = field306.method2206();
                    int var162 = field306.method2206();
                    int var163 = field306.method2130();
                    for (int var164 = var161; var164 <= var162; var164++) {
                        long var165 = ((long) var160 << 32) + (long) var164;
                        field282.method3210(new class172(var163), var165);
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 164) {
                int var167 = field306.method2206();
                if (var167 == 65535) {
                    var167 = -1;
                }
                int var168 = field306.method2159();
                if (var168 == 65535) {
                    var168 = -1;
                }
                int var169 = field306.method2130();
                int var170 = field306.method2170();
                for (int var171 = var167; var171 <= var168; var171++) {
                    long var172 = ((long) var169 << 32) + (long) var171;
                    class176 var174 = field282.method3208(var172);
                    if (var174 != null) {
                        var174.method3288();
                    }
                    field282.method3210(new class172(var170), var172);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 53) {
                int var175 = field306.method2159();
                int var176 = field306.method2169();
                class148 var177 = class148.method16(var176);
                if (var177.field2525 != 1 || var177.field2526 != var175) {
                    var177.field2525 = 1;
                    var177.field2526 = var175;
                    method32(var177);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 139) {
                int var178 = field306.method2170();
                class148 var179 = class148.method16(var178);
                var179.field2525 = 3;
                var179.field2526 = Statics.field180.field29.method2951();
                method32(var179);
                field308 = -1;
                return true;
            }
            if (field308 == 244) {
                int var180 = field306.method2206();
                if (var180 == 65535) {
                    var180 = -1;
                }
                if (var180 == -1 && !field503) {
                    class157.method2917();
                } else if (var180 != -1 && field335 != var180 && field289 != 0 && !field503) {
                    class143 var181 = Statics.field1804;
                    int var182 = field289;
                    class157.field2681 = 1;
                    Statics.field2679 = var181;
                    Statics.field579 = var180;
                    Statics.field2447 = 0;
                    Statics.field1914 = var182;
                    Statics.field1218 = false;
                    Statics.field2678 = 2;
                }
                field335 = var180;
                field308 = -1;
                return true;
            }
            if (field308 == 75) {
                int var183 = field306.method2162();
                int var184 = field306.method2159();
                if (var184 == 65535) {
                    var184 = -1;
                }
                if (field289 != 0 && var184 != -1) {
                    class157.method858(Statics.field295, var184, 0, field289, false);
                    field503 = true;
                }
                field308 = -1;
                return true;
            }
            if (field308 == 146) {
                while (field306.field1815 < field462) {
                    int var185 = field306.method2257();
                    boolean var186 = (var185 & 0x1) == 1;
                    String var187 = field306.method2187();
                    String var188 = field306.method2187();
                    field306.method2187();
                    for (int var189 = 0; var189 < field362; var189++) {
                        class8 var190 = field523[var189];
                        if (var186) {
                            if (var188.equals(var190.field140)) {
                                var190.field140 = var187;
                                var190.field136 = var188;
                                var187 = null;
                                break;
                            }
                        } else if (var187.equals(var190.field140)) {
                            var190.field140 = var187;
                            var190.field136 = var188;
                            var187 = null;
                            break;
                        }
                    }
                    if (var187 != null && field362 < 400) {
                        class8 var191 = new class8();
                        field523[field362] = var191;
                        var191.field140 = var187;
                        var191.field136 = var188;
                        field362++;
                    }
                }
                field457 = field449;
                field308 = -1;
                return true;
            }
            if (field308 == 32) {
                field306.field1815 += 28;
                if (field306.method2147()) {
                    class133.method524(field306, field306.field1815 - 28);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 45) {
                method2476();
                int var192 = field306.method2171();
                int var193 = field306.method2151();
                int var194 = field306.method2153();
                field293[var194] = var192;
                field262[var194] = var193;
                field318[var194] = 1;
                for (int var195 = 0; var195 < 98; var195++) {
                    if (var192 >= class137.field2112[var195]) {
                        field318[var194] = var195 + 2;
                    }
                }
                field454[++field455 - 1 & 0x1F] = var194;
                field308 = -1;
                return true;
            }
            if (field308 == 190) {
                Statics.field866 = field306.method2152();
                Statics.field1735 = field306.method2152();
                field308 = -1;
                return true;
            }
            if (field308 == 15) {
                field512 = false;
                for (int var196 = 0; var196 < 5; var196++) {
                    field359[var196] = false;
                }
                field308 = -1;
                return true;
            }
            if (field308 == 122) {
                int var197 = field306.method2169();
                class148 var198 = class148.method16(var197);
                for (int var199 = 0; var199 < var198.field2595.length; var199++) {
                    var198.field2595[var199] = -1;
                    var198.field2595[var199] = 0;
                }
                method32(var198);
                field308 = -1;
                return true;
            }
            if (field308 == 187) {
                int var200 = field306.method2130();
                int var201 = field306.method2206();
                if (var200 < -70000) {
                    var201 += 32768;
                }
                class148 var202;
                if (var200 >= 0) {
                    var202 = class148.method16(var200);
                } else {
                    var202 = null;
                }
                while (field306.field1815 < field462) {
                    int var203 = field306.method2204();
                    int var204 = field306.method2206();
                    int var205 = 0;
                    if (var204 != 0) {
                        var205 = field306.method2257();
                        if (var205 == 255) {
                            var205 = field306.method2130();
                        }
                    }
                    if (var202 != null && var203 >= 0 && var203 < var202.field2595.length) {
                        var202.field2595[var203] = var204;
                        var202.field2586[var203] = var205;
                    }
                    class13.method794(var201, var203, var204 - 1, var205);
                }
                if (var202 != null) {
                    method32(var202);
                }
                method2476();
                field407[++field453 - 1 & 0x1F] = var201 & 0x7FFF;
                field308 = -1;
                return true;
            }
            if (field308 == 31) {
                if (field425 != -1) {
                    method3301(field425, 0);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 253) {
                int var206 = field306.method2152();
                int var207 = field306.method2152();
                String var208 = field306.method2187();
                if (var207 >= 1 && var207 <= 8) {
                    if (var208.equalsIgnoreCase("null")) {
                        var208 = null;
                    }
                    field476[var207 - 1] = var208;
                    field396[var207 - 1] = var206 == 0;
                }
                field308 = -1;
                return true;
            }
            if (field308 == 235) {
                field519 = 1;
                field457 = field449;
                field308 = -1;
                return true;
            }
            if (field308 == 189) {
                method577();
                field308 = -1;
                return false;
            }
            if (field308 == 196) {
                int var209 = field306.method2206();
                field425 = var209;
                method492(var209);
                class29.method2719(field425);
                for (int var210 = 0; var210 < 100; var210++) {
                    field469[var210] = true;
                }
                field308 = -1;
                return true;
            }
            if (field308 == 121) {
                field515 = field306.method2206() * 30;
                field459 = field449;
                field308 = -1;
                return true;
            }
            if (field308 == 94) {
                class21 var211 = new class21();
                var211.field585 = field306.method2187();
                var211.field587 = field306.method2206();
                int var212 = field306.method2130();
                var211.field583 = var212;
                method1889(45);
                Statics.field1822.method2613();
                Statics.field1822 = null;
                if (var211.method528() != field296) {
                    field296 = var211.method528();
                    boolean var213 = var211.method528();
                    if (Statics.field981 != var213) {
                        class42.method538();
                        Statics.field981 = var213;
                    }
                }
                Statics.field701 = var211.field585;
                field494 = var211.field587;
                field261 = var211.field583;
                Statics.field179 = field471 == 0 ? 43594 : var211.field587 + 40000;
                Statics.field2773 = field471 == 0 ? 443 : var211.field587 + 50000;
                Statics.field1876 = Statics.field179;
                field308 = -1;
                return false;
            }
            if (field308 == 91) {
                String var214 = field306.method2187();
                Object[] var215 = new Object[var214.length() + 1];
                for (int var216 = var214.length() - 1; var216 >= 0; var216--) {
                    if (var214.charAt(var216) == 's') {
                        var215[var216 + 1] = field306.method2187();
                    } else {
                        var215[var216 + 1] = Integer.valueOf(field306.method2130());
                    }
                }
                var215[0] = Integer.valueOf(field306.method2130());
                class1 var217 = new class1();
                var217.field10 = var215;
                class29.method1054(var217);
                field308 = -1;
                return true;
            }
            if (field308 == 56) {
                int var218 = field306.method2160();
                int var219 = field306.method2130();
                class148 var220 = class148.method16(var219);
                if (var220.field2525 != 2 || var220.field2526 != var218) {
                    var220.field2525 = 2;
                    var220.field2526 = var218;
                    method32(var220);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 68) {
                int var221 = field306.method2130();
                int var222 = field306.method2206();
                if (var221 < -70000) {
                    var222 += 32768;
                }
                class148 var223;
                if (var221 >= 0) {
                    var223 = class148.method16(var221);
                } else {
                    var223 = null;
                }
                if (var223 != null) {
                    for (int var224 = 0; var224 < var223.field2595.length; var224++) {
                        var223.field2595[var224] = 0;
                        var223.field2586[var224] = 0;
                    }
                }
                class13.method522(var222);
                int var225 = field306.method2206();
                for (int var226 = 0; var226 < var225; var226++) {
                    int var227 = field306.method2257();
                    if (var227 == 255) {
                        var227 = field306.method2170();
                    }
                    int var228 = field306.method2206();
                    if (var223 != null && var226 < var223.field2595.length) {
                        var223.field2595[var226] = var228;
                        var223.field2586[var226] = var227;
                    }
                    class13.method794(var222, var226, var228 - 1, var227);
                }
                if (var223 != null) {
                    method32(var223);
                }
                method2476();
                field407[++field453 - 1 & 0x1F] = var222 & 0x7FFF;
                field308 = -1;
                return true;
            }
            if (field308 == 74) {
                int var229 = field306.method2170();
                Statics.field2126 = Statics.field1249.method2507(var229);
                field308 = -1;
                return true;
            }
            if (field308 == 109) {
                method2476();
                field481 = field306.method2254();
                field459 = field449;
                field308 = -1;
                return true;
            }
            if (field308 == 131) {
                int var230 = field306.method2206();
                int var231 = field306.method2161();
                int var232 = field306.method2170();
                int var233 = field306.method2206();
                class148 var234 = class148.method16(var232);
                if (var234.field2533 != var230 || var234.field2512 != var233 || var234.field2590 != var231) {
                    var234.field2533 = var230;
                    var234.field2512 = var233;
                    var234.field2590 = var231;
                    method32(var234);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 130) {
                field422 = field306.method2257();
                if (field422 == 1) {
                    field279 = field306.method2206();
                }
                if (field422 >= 2 && field422 <= 6) {
                    if (field422 == 2) {
                        field497 = 64;
                        field285 = 64;
                    }
                    if (field422 == 3) {
                        field497 = 0;
                        field285 = 64;
                    }
                    if (field422 == 4) {
                        field497 = 128;
                        field285 = 64;
                    }
                    if (field422 == 5) {
                        field497 = 64;
                        field285 = 0;
                    }
                    if (field422 == 6) {
                        field497 = 64;
                        field285 = 128;
                    }
                    field422 = 2;
                    field281 = field306.method2206();
                    field420 = field306.method2206();
                    field283 = field306.method2257();
                }
                if (field422 == 10) {
                    field280 = field306.method2206();
                }
                field308 = -1;
                return true;
            }
            if (field308 == 254) {
                field458 = field449;
                if (field462 == 0) {
                    field491 = null;
                    field492 = null;
                    Statics.field1794 = 0;
                    Statics.field187 = null;
                    field308 = -1;
                    return true;
                }
                field492 = field306.method2187();
                long var235 = field306.method2133();
                field491 = class188.method35(var235);
                Statics.field2716 = field306.method2237();
                int var237 = field306.method2257();
                if (var237 == 255) {
                    field308 = -1;
                    return true;
                }
                Statics.field1794 = var237;
                class20[] var238 = new class20[100];
                for (int var239 = 0; var239 < Statics.field1794; var239++) {
                    var238[var239] = new class20();
                    var238[var239].field578 = field306.method2187();
                    var238[var239].field572 = class190.method582(var238[var239].field578, Statics.field263);
                    var238[var239].field573 = field306.method2206();
                    var238[var239].field574 = field306.method2237();
                    field306.method2187();
                    if (var238[var239].field578.equals(Statics.field180.field36)) {
                        Statics.field1899 = var238[var239].field574;
                    }
                }
                boolean var240 = false;
                int var241 = Statics.field1794;
                while (var241 > 0) {
                    boolean var242 = true;
                    var241--;
                    for (int var243 = 0; var243 < var241; var243++) {
                        if (var238[var243].field572.compareTo(var238[var243 + 1].field572) > 0) {
                            class20 var244 = var238[var243];
                            var238[var243] = var238[var243 + 1];
                            var238[var243 + 1] = var244;
                            var242 = false;
                        }
                    }
                    if (var242) {
                        break;
                    }
                }
                Statics.field187 = var238;
                field308 = -1;
                return true;
            }
            if (field308 == 21) {
                int var245 = field306.method2171();
                String var246 = field306.method2187();
                class148 var247 = class148.method16(var245);
                if (!var246.equals(var247.field2578)) {
                    var247.field2578 = var246;
                    method32(var247);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 210) {
                for (int var248 = 0; var248 < class150.field2625.length; var248++) {
                    if (class150.field2625[var248] != class150.field2622[var248]) {
                        class150.field2625[var248] = class150.field2622[var248];
                        Statics.method536(var248);
                        field452[++field338 - 1 & 0x1F] = var248;
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 57) {
                String var249 = field306.method2187();
                long var250 = field306.method2133();
                long var252 = (long) field306.method2206();
                long var254 = (long) field306.method2167();
                int var256 = field306.method2257();
                long var257 = (var252 << 32) + var254;
                boolean var259 = false;
                for (int var260 = 0; var260 < 100; var260++) {
                    if (field485[var260] == var257) {
                        var259 = true;
                        break;
                    }
                }
                if (var256 <= 1 && method1986(var249)) {
                    var259 = true;
                }
                if (!var259 && field383 == 0) {
                    field485[field486] = var257;
                    field486 = (field486 + 1) % 100;
                    class107 var261 = field306;
                    String var265;
                    try {
                        int var262 = var261.method2204();
                        if (var262 > 32767) {
                            var262 = 32767;
                        }
                        byte[] var263 = new byte[var262];
                        var261.field1815 += Statics.field2843.method2068(var261.field1819, var261.field1815, var263, 0, var262);
                        String var264 = class191.method37(var263, 0, var262);
                        var265 = var264;
                    } catch (Exception var299) {
                        var265 = "Cabbage";
                    }
                    String var268 = class182.method3315(class189.method544(var265));
                    if (var256 == 2 || var256 == 3) {
                        method2687(9, class2.method2717(1) + var249, var268, class188.method2713(var250));
                    } else if (var256 == 1) {
                        method2687(9, class2.method2717(0) + var249, var268, class188.method2713(var250));
                    } else {
                        method2687(9, var249, var268, class188.method2713(var250));
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 63) {
                method2476();
                field430 = field306.method2257();
                field459 = field449;
                field308 = -1;
                return true;
            }
            if (field308 == 241) {
                Statics.field866 = field306.method2152();
                Statics.field1735 = field306.method2152();
                for (int var269 = Statics.field1735; var269 < Statics.field1735 + 8; var269++) {
                    for (int var270 = Statics.field866; var270 < Statics.field866 + 8; var270++) {
                        if (field473[Statics.field1][var269][var270] != null) {
                            field473[Statics.field1][var269][var270] = null;
                            method2434(var269, var270);
                        }
                    }
                }
                for (class14 var271 = (class14) field400.method3236(); var271 != null; var271 = (class14) field400.method3228()) {
                    if (var271.field221 >= Statics.field1735 && var271.field221 < Statics.field1735 + 8 && var271.field210 >= Statics.field866 && var271.field210 < Statics.field866 + 8 && Statics.field1 == var271.field207) {
                        var271.field209 = 0;
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 168) {
                int var272 = field306.method2257();
                int var273 = field306.method2257();
                int var274 = field306.method2257();
                int var275 = field306.method2257();
                field359[var272] = true;
                field514[var272] = var273;
                field479[var272] = var274;
                field516[var272] = var275;
                field517[var272] = 0;
                field308 = -1;
                return true;
            }
            if (field308 == 12) {
                int var276 = field306.method2204();
                boolean var277 = field306.method2257() == 1;
                String var278 = "";
                boolean var279 = false;
                if (var277) {
                    var278 = field306.method2187();
                    if (method1986(var278)) {
                        var279 = true;
                    }
                }
                String var280 = field306.method2187();
                if (!var279) {
                    method555(var276, var278, var280);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 80) {
                int var281 = field306.method2130();
                int var282 = field306.method2160();
                class148 var283 = class148.method16(var281);
                if (var283 != null && var283.field2502 == 0) {
                    if (var282 > var283.field2509 - var283.field2503) {
                        var282 = var283.field2509 - var283.field2503;
                    }
                    if (var282 < 0) {
                        var282 = 0;
                    }
                    if (var283.field2507 != var282) {
                        var283.field2507 = var282;
                        method32(var283);
                    }
                }
                field308 = -1;
                return true;
            }
            if (field308 == 0) {
                int var284 = field306.method2206();
                byte var285 = field306.method2155();
                class150.field2622[var284] = var285;
                if (class150.field2625[var284] != var285) {
                    class150.field2625[var284] = var285;
                    Statics.method536(var284);
                }
                field452[++field338 - 1 & 0x1F] = var284;
                field308 = -1;
                return true;
            }
            if (field308 == 64) {
                int var286 = field306.method2161();
                if (var286 == 65535) {
                    var286 = -1;
                }
                int var287 = field306.method2169();
                int var288 = field306.method2171();
                class148 var289 = class148.method16(var287);
                if (var289.field2534) {
                    var289.field2511 = var286;
                    var289.field2598 = var288;
                    class42 var291 = class42.method2477(var286);
                    var289.field2533 = var291.field993;
                    var289.field2512 = var291.field994;
                    var289.field2530 = var291.field995;
                    var289.field2531 = var291.field996;
                    var289.field2532 = var291.field997;
                    var289.field2590 = var291.field1020;
                    if (var289.field2516 > 0) {
                        var289.field2590 = var289.field2590 * 32 / var289.field2516;
                    }
                    method32(var289);
                } else if (var286 == -1) {
                    var289.field2525 = 0;
                    field308 = -1;
                    return true;
                } else {
                    class42 var290 = class42.method2477(var286);
                    var289.field2525 = 4;
                    var289.field2526 = var286;
                    var289.field2533 = var290.field993;
                    var289.field2512 = var290.field994;
                    var289.field2590 = var290.field1020 * 100 / var288;
                    method32(var289);
                }
                field308 = -1;
                return true;
            }
            if (field308 == 76) {
                int var292 = field306.method2206();
                int var293 = field306.method2257();
                int var294 = field306.method2206();
                method156(var292, var293, var294);
                field308 = -1;
                return true;
            }
            class132.method508("" + field308 + class2.field17 + field502 + class2.field17 + field417 + class2.field17 + field462, (Throwable) null);
            method577();
        } catch (IOException var307) {
            method2887();
        } catch (Exception var308) {
            String var297 = "" + field308 + class2.field17 + field502 + class2.field17 + field417 + class2.field17 + field462 + class2.field17 + (Statics.field1624 + Statics.field180.field740[0]) + class2.field17 + (Statics.field945 + Statics.field180.field757[0]) + class2.field17;
            for (int var298 = 0; var298 < field462 && var298 < 50; var298++) {
                var297 = var297 + field306.field1819[var298] + class2.field17;
            }
            class132.method508(var297, var308);
            method577();
        }
        return true;
    }

    @ObfuscatedName("er.bx(I)V")
    public static final void method2857() {
        if (field308 == 5) {
            int var0 = field306.method2151();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1735;
            int var2 = (var0 & 0x7) + Statics.field866;
            int var3 = field306.method2152();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field482[var4];
            int var7 = field306.method2161();
            int var8 = field306.method2161();
            byte var9 = field306.method2237();
            byte var10 = field306.method2268();
            int var11 = field306.method2159();
            byte var12 = field306.method2237();
            byte var13 = field306.method2155();
            int var14 = field306.method2206();
            class3 var15;
            if (field445 == var11) {
                var15 = Statics.field180;
            } else {
                var15 = field510[var11];
            }
            if (var15 != null) {
                class33 var16 = class33.method115(var7);
                int var17;
                int var18;
                if (var5 == 1 || var5 == 3) {
                    var17 = var16.field836;
                    var18 = var16.field828;
                } else {
                    var17 = var16.field828;
                    var18 = var16.field836;
                }
                int var19 = (var17 >> 1) + var1;
                int var20 = (var17 + 1 >> 1) + var1;
                int var21 = (var18 >> 1) + var2;
                int var22 = (var18 + 1 >> 1) + var2;
                int[][] var23 = class6.field103[Statics.field1];
                int var24 = var23[var19][var21] + var23[var20][var21] + var23[var19][var22] + var23[var20][var22] >> 2;
                int var25 = (var1 << 7) + (var17 << 6);
                int var26 = (var2 << 7) + (var18 << 6);
                class95 var27 = var16.method667(var4, var5, var23, var25, var24, var26);
                if (var27 != null) {
                    method2925(Statics.field1, var1, var2, var6, -1, 0, 0, var14 + 1, var8 + 1);
                    var15.field35 = field270 + var14;
                    var15.field32 = field270 + var8;
                    var15.field31 = var27;
                    var15.field37 = var1 * 128 + var17 * 64;
                    var15.field39 = var2 * 128 + var18 * 64;
                    var15.field40 = var24;
                    if (var13 > var12) {
                        byte var28 = var13;
                        var13 = var12;
                        var12 = var28;
                    }
                    if (var9 > var10) {
                        byte var29 = var9;
                        var9 = var10;
                        var10 = var29;
                    }
                    var15.field41 = var1 + var13;
                    var15.field28 = var1 + var12;
                    var15.field42 = var2 + var9;
                    var15.field44 = var2 + var10;
                }
            }
        }
        if (field308 == 192) {
            int var30 = field306.method2257();
            int var31 = (var30 >> 4 & 0x7) + Statics.field1735;
            int var32 = (var30 & 0x7) + Statics.field866;
            int var33 = var31 + field306.method2237();
            int var34 = var32 + field306.method2237();
            int var35 = field306.method2254();
            int var36 = field306.method2206();
            int var37 = field306.method2257() * 4;
            int var38 = field306.method2257() * 4;
            int var39 = field306.method2206();
            int var40 = field306.method2206();
            int var41 = field306.method2257();
            int var42 = field306.method2257();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && var36 != 65535) {
                int var43 = var31 * 128 + 64;
                int var44 = var32 * 128 + 64;
                int var45 = var33 * 128 + 64;
                int var46 = var34 * 128 + 64;
                class7 var47 = new class7(var36, Statics.field1, var43, var44, method2398(var43, var44, Statics.field1) - var37, field270 + var39, field270 + var40, var41, var42, var35, var38);
                var47.method108(var45, var46, method2398(var45, var46, Statics.field1) - var38, field270 + var39);
                field401.method3221(var47);
            }
        } else if (field308 == 83) {
            int var48 = field306.method2257();
            int var49 = (var48 >> 4 & 0x7) + Statics.field1735;
            int var50 = (var48 & 0x7) + Statics.field866;
            int var51 = field306.method2206();
            int var52 = field306.method2206();
            int var53 = field306.method2206();
            if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                class171 var54 = field473[Statics.field1][var49][var50];
                if (var54 != null) {
                    for (class23 var55 = (class23) var54.method3236(); var55 != null; var55 = (class23) var54.method3228()) {
                        if ((var51 & 0x7FFF) == var55.field611 && var55.field616 == var52) {
                            var55.field616 = var53;
                            break;
                        }
                    }
                    method2434(var49, var50);
                }
            }
        } else {
            if (field308 == 96) {
                int var56 = field306.method2257();
                int var57 = (var56 >> 4 & 0x7) + Statics.field1735;
                int var58 = (var56 & 0x7) + Statics.field866;
                int var59 = field306.method2206();
                int var60 = field306.method2257();
                int var61 = var60 >> 4 & 0xF;
                int var62 = var60 & 0x7;
                int var63 = field306.method2257();
                if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                    int var64 = var61 + 1;
                    if (Statics.field180.field740[0] >= var57 - var64 && Statics.field180.field740[0] <= var57 + var64 && Statics.field180.field757[0] >= var58 - var64 && Statics.field180.field757[0] <= var58 + var64 && field505 != 0 && var62 > 0 && field506 < 50) {
                        field361[field506] = var59;
                        field508[field506] = var62;
                        field509[field506] = var63;
                        field511[field506] = null;
                        field257[field506] = (var57 << 16) + (var58 << 8) + var61;
                        field506++;
                    }
                }
            }
            if (field308 == 42) {
                int var65 = field306.method2151();
                int var66 = (var65 >> 4 & 0x7) + Statics.field1735;
                int var67 = (var65 & 0x7) + Statics.field866;
                int var68 = field306.method2206();
                int var69 = field306.method2257();
                int var70 = var69 >> 2;
                int var71 = var69 & 0x3;
                int var72 = field482[var70];
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                    method2925(Statics.field1, var66, var67, var72, var68, var70, var71, 0, -1);
                }
            } else if (field308 == 239) {
                int var73 = field306.method2153();
                int var74 = (var73 >> 4 & 0x7) + Statics.field1735;
                int var75 = (var73 & 0x7) + Statics.field866;
                int var76 = field306.method2257();
                int var77 = var76 >> 2;
                int var78 = var76 & 0x3;
                int var79 = field482[var77];
                if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
                    method2925(Statics.field1, var74, var75, var79, -1, var77, var78, 0, -1);
                }
            } else if (field308 == 191) {
                int var80 = field306.method2153();
                int var81 = (var80 >> 4 & 0x7) + Statics.field1735;
                int var82 = (var80 & 0x7) + Statics.field866;
                int var83 = field306.method2159();
                int var84 = field306.method2160();
                if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
                    class23 var85 = new class23();
                    var85.field611 = var83;
                    var85.field616 = var84;
                    if (field473[Statics.field1][var81][var82] == null) {
                        field473[Statics.field1][var81][var82] = new class171();
                    }
                    field473[Statics.field1][var81][var82].method3221(var85);
                    method2434(var81, var82);
                }
            } else if (field308 == 182) {
                int var86 = field306.method2153();
                int var87 = var86 >> 2;
                int var88 = var86 & 0x3;
                int var89 = field482[var87];
                int var90 = field306.method2153();
                int var91 = (var90 >> 4 & 0x7) + Statics.field1735;
                int var92 = (var90 & 0x7) + Statics.field866;
                int var93 = field306.method2160();
                if (var91 >= 0 && var92 >= 0 && var91 < 103 && var92 < 103) {
                    if (var89 == 0) {
                        class77 var94 = Statics.field1911.method1628(Statics.field1, var91, var92);
                        if (var94 != null) {
                            int var95 = var94.field1386 >> 14 & 0x7FFF;
                            if (var87 == 2) {
                                var94.field1381 = new class10(var95, 2, var88 + 4, Statics.field1, var91, var92, var93, false, var94.field1381);
                                var94.field1385 = new class10(var95, 2, var88 + 1 & 0x3, Statics.field1, var91, var92, var93, false, var94.field1385);
                            } else {
                                var94.field1381 = new class10(var95, var87, var88, Statics.field1, var91, var92, var93, false, var94.field1381);
                            }
                        }
                    }
                    if (var89 == 1) {
                        class84 var96 = Statics.field1911.method1629(Statics.field1, var91, var92);
                        if (var96 != null) {
                            int var97 = var96.field1470 >> 14 & 0x7FFF;
                            if (var87 == 4 || var87 == 5) {
                                var96.field1461 = new class10(var97, 4, var88, Statics.field1, var91, var92, var93, false, var96.field1461);
                            } else if (var87 == 6) {
                                var96.field1461 = new class10(var97, 4, var88 + 4, Statics.field1, var91, var92, var93, false, var96.field1461);
                            } else if (var87 == 7) {
                                var96.field1461 = new class10(var97, 4, (var88 + 2 & 0x3) + 4, Statics.field1, var91, var92, var93, false, var96.field1461);
                            } else if (var87 == 8) {
                                var96.field1461 = new class10(var97, 4, var88 + 4, Statics.field1, var91, var92, var93, false, var96.field1461);
                                var96.field1472 = new class10(var97, 4, (var88 + 2 & 0x3) + 4, Statics.field1, var91, var92, var93, false, var96.field1472);
                            }
                        }
                    }
                    if (var89 == 2) {
                        class88 var98 = Statics.field1911.method1694(Statics.field1, var91, var92);
                        if (var87 == 11) {
                            var87 = 10;
                        }
                        if (var98 != null) {
                            var98.field1524 = new class10(var98.field1532 >> 14 & 0x7FFF, var87, var88, Statics.field1, var91, var92, var93, false, var98.field1524);
                        }
                    }
                    if (var89 == 3) {
                        class83 var99 = Statics.field1911.method1631(Statics.field1, var91, var92);
                        if (var99 != null) {
                            var99.field1452 = new class10(var99.field1448 >> 14 & 0x7FFF, 22, var88, Statics.field1, var91, var92, var93, false, var99.field1452);
                        }
                    }
                }
            } else if (field308 == 81) {
                int var100 = field306.method2152();
                int var101 = (var100 >> 4 & 0x7) + Statics.field1735;
                int var102 = (var100 & 0x7) + Statics.field866;
                int var103 = field306.method2160();
                if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                    class171 var104 = field473[Statics.field1][var101][var102];
                    if (var104 != null) {
                        for (class23 var105 = (class23) var104.method3236(); var105 != null; var105 = (class23) var104.method3228()) {
                            if ((var103 & 0x7FFF) == var105.field611) {
                                var105.method3288();
                                break;
                            }
                        }
                        if (var104.method3236() == null) {
                            field473[Statics.field1][var101][var102] = null;
                        }
                        method2434(var101, var102);
                    }
                }
            } else if (field308 == 103) {
                int var106 = field306.method2257();
                int var107 = (var106 >> 4 & 0x7) + Statics.field1735;
                int var108 = (var106 & 0x7) + Statics.field866;
                int var109 = field306.method2206();
                int var110 = field306.method2257();
                int var111 = field306.method2206();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var112 = var107 * 128 + 64;
                    int var113 = var108 * 128 + 64;
                    class24 var114 = new class24(var109, Statics.field1, var112, var113, method2398(var112, var113, Statics.field1) - var110, var111, field270);
                    field402.method3221(var114);
                }
            }
        }
    }

    @ObfuscatedName("ey.by(IIIIIIIIII)V")
    public static final void method2925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class14 var9 = null;
        for (class14 var10 = (class14) field400.method3236(); var10 != null; var10 = (class14) field400.method3228()) {
            if (var10.field207 == arg0 && var10.field221 == arg1 && var10.field210 == arg2 && var10.field208 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class14();
            var9.field207 = arg0;
            var9.field208 = arg3;
            var9.field221 = arg1;
            var9.field210 = arg2;
            method1789(var9);
            field400.method3221(var9);
        }
        var9.field214 = arg4;
        var9.field216 = arg5;
        var9.field215 = arg6;
        var9.field217 = arg7;
        var9.field209 = arg8;
    }

    @ObfuscatedName("co.bq(Li;B)V")
    public static final void method1789(class14 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field208 == 0) {
            var1 = Statics.field1911.method1632(arg0.field207, arg0.field221, arg0.field210);
        }
        if (arg0.field208 == 1) {
            var1 = Statics.field1911.method1693(arg0.field207, arg0.field221, arg0.field210);
        }
        if (arg0.field208 == 2) {
            var1 = Statics.field1911.method1634(arg0.field207, arg0.field221, arg0.field210);
        }
        if (arg0.field208 == 3) {
            var1 = Statics.field1911.method1635(arg0.field207, arg0.field221, arg0.field210);
        }
        if (var1 != 0) {
            int var5 = Statics.field1911.method1636(arg0.field207, arg0.field221, arg0.field210, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field211 = var2;
        arg0.field213 = var3;
        arg0.field212 = var4;
    }

    @ObfuscatedName("i.bt(B)V")
    public static final void method177() {
        for (class14 var0 = (class14) field400.method3236(); var0 != null; var0 = (class14) field400.method3228()) {
            if (var0.field209 > 0) {
                var0.field209--;
            }
            if (var0.field209 != 0) {
                if (var0.field217 > 0) {
                    var0.field217--;
                }
                if (var0.field217 == 0 && var0.field221 >= 1 && var0.field210 >= 1 && var0.field221 <= 102 && var0.field210 <= 102 && (var0.field214 < 0 || class6.method1981(var0.field214, var0.field216))) {
                    method2427(var0.field207, var0.field208, var0.field221, var0.field210, var0.field214, var0.field215, var0.field216);
                    var0.field217 = -1;
                    if (var0.field214 == var0.field211 && var0.field211 == -1) {
                        var0.method3288();
                    } else if (var0.field214 == var0.field211 && var0.field215 == var0.field212 && var0.field216 == var0.field213) {
                        var0.method3288();
                    }
                }
            } else if (var0.field211 < 0 || class6.method1981(var0.field211, var0.field213)) {
                method2427(var0.field207, var0.field208, var0.field221, var0.field210, var0.field211, var0.field212, var0.field213);
                var0.method3288();
            }
        }
    }

    @ObfuscatedName("dv.br(IIIIIIII)V")
    public static final void method2427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field265 && Statics.field1 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1911.method1632(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1911.method1693(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1911.method1634(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1911.method1635(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1911.method1636(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1911.method1715(arg0, arg2, arg3);
                class33 var15 = class33.method115(var12);
                if (var15.field830 != 0) {
                    field323[arg0].method3447(arg2, arg3, var13, var14, var15.field831);
                }
            }
            if (arg1 == 1) {
                Statics.field1911.method1624(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1911.method1625(arg0, arg2, arg3);
                class33 var16 = class33.method115(var12);
                if (var16.field828 + arg2 > 103 || var16.field828 + arg3 > 103 || var16.field836 + arg2 > 103 || var16.field836 + arg3 > 103) {
                    return;
                }
                if (var16.field830 != 0) {
                    field323[arg0].method3448(arg2, arg3, var16.field828, var16.field836, var14, var16.field831);
                }
            }
            if (arg1 == 3) {
                Statics.field1911.method1626(arg0, arg2, arg3);
                class33 var17 = class33.method115(var12);
                if (var17.field830 == 1) {
                    field323[arg0].method3450(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field75[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class76 var19 = Statics.field1911;
        class187 var20 = field323[arg0];
        class33 var21 = class33.method115(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field836;
            var23 = var21.field828;
        } else {
            var22 = var21.field828;
            var23 = var21.field836;
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
        int[][] var28 = class6.field103[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field832 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field858 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class75 var34;
            if (var21.field840 == -1 && var21.field842 == null) {
                var34 = var21.method667(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class10(arg4, 22, arg5, var18, arg2, arg3, var21.field840, true, (class75) null);
            }
            var19.method1623(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field830 == 1) {
                var20.method3445(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class75 var57;
            if (var21.field840 == -1 && var21.field842 == null) {
                var57 = var21.method667(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class10(arg4, 10, arg5, var18, arg2, arg3, var21.field840, true, (class75) null);
            }
            if (var57 != null) {
                var19.method1617(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field830 != 0) {
                var20.method3443(arg2, arg3, var22, var23, var21.field831);
            }
        } else if (arg6 >= 12) {
            class75 var35;
            if (var21.field840 == -1 && var21.field842 == null) {
                var35 = var21.method667(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class10(arg4, arg6, arg5, var18, arg2, arg3, var21.field840, true, (class75) null);
            }
            var19.method1617(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field830 != 0) {
                var20.method3443(arg2, arg3, var22, var23, var21.field831);
            }
        } else if (arg6 == 0) {
            class75 var36;
            if (var21.field840 == -1 && var21.field842 == null) {
                var36 = var21.method667(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class10(arg4, 0, arg5, var18, arg2, arg3, var21.field840, true, (class75) null);
            }
            var19.method1785(arg0, arg2, arg3, var29, var36, (class75) null, class6.field86[arg5], 0, var32, var33);
            if (var21.field830 != 0) {
                var20.method3449(arg2, arg3, arg6, arg5, var21.field831);
            }
        } else if (arg6 == 1) {
            class75 var37;
            if (var21.field840 == -1 && var21.field842 == null) {
                var37 = var21.method667(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class10(arg4, 1, arg5, var18, arg2, arg3, var21.field840, true, (class75) null);
            }
            var19.method1785(arg0, arg2, arg3, var29, var37, (class75) null, class6.field96[arg5], 0, var32, var33);
            if (var21.field830 != 0) {
                var20.method3449(arg2, arg3, arg6, arg5, var21.field831);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class75 var39;
            class75 var40;
            if (var21.field840 == -1 && var21.field842 == null) {
                var39 = var21.method667(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method667(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class10(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field840, true, (class75) null);
                var40 = new class10(arg4, 2, var38, var18, arg2, arg3, var21.field840, true, (class75) null);
            }
            var19.method1785(arg0, arg2, arg3, var29, var39, var40, class6.field86[arg5], class6.field86[var38], var32, var33);
            if (var21.field830 != 0) {
                var20.method3449(arg2, arg3, arg6, arg5, var21.field831);
            }
        } else if (arg6 == 3) {
            class75 var41;
            if (var21.field840 == -1 && var21.field842 == null) {
                var41 = var21.method667(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class10(arg4, 3, arg5, var18, arg2, arg3, var21.field840, true, (class75) null);
            }
            var19.method1785(arg0, arg2, arg3, var29, var41, (class75) null, class6.field96[arg5], 0, var32, var33);
            if (var21.field830 != 0) {
                var20.method3449(arg2, arg3, arg6, arg5, var21.field831);
            }
        } else if (arg6 == 9) {
            class75 var42;
            if (var21.field840 == -1 && var21.field842 == null) {
                var42 = var21.method667(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class10(arg4, arg6, arg5, var18, arg2, arg3, var21.field840, true, (class75) null);
            }
            var19.method1617(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field830 != 0) {
                var20.method3443(arg2, arg3, var22, var23, var21.field831);
            }
        } else if (arg6 == 4) {
            class75 var43;
            if (var21.field840 == -1 && var21.field842 == null) {
                var43 = var21.method667(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class10(arg4, 4, arg5, var18, arg2, arg3, var21.field840, true, (class75) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var43, (class75) null, class6.field86[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1632(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class33.method115(var45 >> 14 & 0x7FFF).field823;
            }
            class75 var46;
            if (var21.field840 == -1 && var21.field842 == null) {
                var46 = var21.method667(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class10(arg4, 4, arg5, var18, arg2, arg3, var21.field840, true, (class75) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var46, (class75) null, class6.field86[arg5], 0, class6.field88[arg5] * var44, class6.field76[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1632(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class33.method115(var48 >> 14 & 0x7FFF).field823 / 2;
            }
            class75 var49;
            if (var21.field840 == -1 && var21.field842 == null) {
                var49 = var21.method667(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class10(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field840, true, (class75) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var49, (class75) null, 256, arg5, class6.field90[arg5] * var47, class6.field91[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class75 var51;
            if (var21.field840 == -1 && var21.field842 == null) {
                var51 = var21.method667(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class10(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field840, true, (class75) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var51, (class75) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1632(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class33.method115(var53 >> 14 & 0x7FFF).field823 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class75 var55;
            class75 var56;
            if (var21.field840 == -1 && var21.field842 == null) {
                var55 = var21.method667(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method667(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class10(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field840, true, (class75) null);
                var56 = new class10(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field840, true, (class75) null);
            }
            var19.method1616(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field90[arg5] * var52, class6.field91[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("dh.bi(III)V")
    public static final void method2434(int arg0, int arg1) {
        class171 var2 = field473[Statics.field1][arg0][arg1];
        if (var2 == null) {
            Statics.field1911.method1627(Statics.field1, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class23 var5 = null;
        for (class23 var6 = (class23) var2.method3236(); var6 != null; var6 = (class23) var2.method3228()) {
            class42 var7 = class42.method2477(var6.field611);
            long var8 = (long) var7.field1019;
            if (var7.field998 == 1) {
                var8 = (long) (var6.field616 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1911.method1627(Statics.field1, arg0, arg1);
            return;
        }
        var2.method3237(var5);
        class23 var10 = null;
        class23 var11 = null;
        for (class23 var12 = (class23) var2.method3236(); var12 != null; var12 = (class23) var2.method3228()) {
            if (var5.field611 != var12.field611) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field611 != var12.field611 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1911.method1752(Statics.field1, arg0, arg1, method2398(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1), var5, var13, var10, var11);
    }

    @ObfuscatedName("dg.ba(I)V")
    public static final void method2560() {
        field392 = 0;
        field387 = 0;
        method138();
        int var0 = field306.method2371(8);
        if (var0 < field385) {
            for (int var1 = var0; var1 < field385; var1++) {
                field393[++field392 - 1] = field386[var1];
            }
        }
        if (var0 > field385) {
            throw new RuntimeException("");
        }
        field385 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field386[var2];
            class3 var4 = field510[var3];
            int var5 = field306.method2371(1);
            if (var5 == 0) {
                field386[++field385 - 1] = var3;
                var4.field756 = field270;
            } else {
                int var6 = field306.method2371(2);
                if (var6 == 0) {
                    field386[++field385 - 1] = var3;
                    var4.field756 = field270;
                    field388[++field387 - 1] = var3;
                } else if (var6 == 1) {
                    field386[++field385 - 1] = var3;
                    var4.field756 = field270;
                    int var7 = field306.method2371(3);
                    var4.method605(var7, false);
                    int var8 = field306.method2371(1);
                    if (var8 == 1) {
                        field388[++field387 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field386[++field385 - 1] = var3;
                    var4.field756 = field270;
                    int var9 = field306.method2371(3);
                    var4.method605(var9, true);
                    int var10 = field306.method2371(3);
                    var4.method605(var10, true);
                    int var11 = field306.method2371(1);
                    if (var11 == 1) {
                        field388[++field387 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field393[++field392 - 1] = var3;
                }
            }
        }
        method704();
        for (int var12 = 0; var12 < field387; var12++) {
            int var13 = field388[var12];
            class3 var14 = field510[var13];
            int var15 = field306.method2257();
            if ((var15 & 0x10) != 0) {
                var15 += field306.method2257() << 8;
            }
            method547(var13, var14, var15);
        }
        for (int var16 = 0; var16 < field392; var16++) {
            int var17 = field393[var16];
            if (field270 != field510[var17].field756) {
                field510[var17] = null;
            }
        }
        if (field462 != field306.field1815) {
            throw new RuntimeException(field306.field1815 + class2.field17 + field462);
        }
        for (int var18 = 0; var18 < field385; var18++) {
            if (field510[field386[var18]] == null) {
                throw new RuntimeException(var18 + class2.field17 + field385);
            }
        }
    }

    @ObfuscatedName("k.bf(S)V")
    public static final void method138() {
        field306.method2397();
        int var0 = field306.method2371(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field306.method2371(2);
        if (var1 == 0) {
            field388[++field387 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field306.method2371(3);
            Statics.field180.method605(var2, false);
            int var3 = field306.method2371(1);
            if (var3 == 1) {
                field388[++field387 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field306.method2371(3);
            Statics.field180.method605(var4, true);
            int var5 = field306.method2371(3);
            Statics.field180.method605(var5, true);
            int var6 = field306.method2371(1);
            if (var6 == 1) {
                field388[++field387 - 1] = 2047;
            }
        } else if (var1 == 3) {
            Statics.field1 = field306.method2371(2);
            int var7 = field306.method2371(1);
            int var8 = field306.method2371(7);
            int var9 = field306.method2371(1);
            if (var9 == 1) {
                field388[++field387 - 1] = 2047;
            }
            int var10 = field306.method2371(7);
            Statics.field180.method595(var10, var8, var7 == 1);
        }
    }

    @ObfuscatedName("an.bh(I)V")
    public static final void method704() {
        while (true) {
            if (field306.method2374(field462) >= 11) {
                int var0 = field306.method2371(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field510[var0] == null) {
                        field510[var0] = new class3();
                        if (field389[var0] != null) {
                            field510[var0].method18(field389[var0]);
                        }
                        var1 = true;
                    }
                    field386[++field385 - 1] = var0;
                    class3 var2 = field510[var0];
                    var2.field756 = field270;
                    int var3 = field397[field306.method2371(3)];
                    if (var1) {
                        var2.field752 = var2.field705 = var3;
                    }
                    int var4 = field306.method2371(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field306.method2371(1);
                    if (var5 == 1) {
                        field388[++field387 - 1] = var0;
                    }
                    int var6 = field306.method2371(1);
                    int var7 = field306.method2371(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.method595(Statics.field180.field740[0] + var7, Statics.field180.field757[0] + var4, var6 == 1);
                    continue;
                }
            }
            field306.method2377();
            return;
        }
    }

    @ObfuscatedName("w.bo(ILu;II)V")
    public static final void method547(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x40) != 0) {
            int var3 = field306.method2159();
            if (var3 == 65535) {
                var3 = -1;
            }
            int var4 = field306.method2152();
            method683(arg1, var3, var4);
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field708 = field306.method2160();
            if (arg1.field708 == 65535) {
                arg1.field708 = -1;
            }
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field738 = field306.method2159();
            int var5 = field306.method2130();
            arg1.field742 = var5 >> 16;
            arg1.field720 = (var5 & 0xFFFF) + field270;
            arg1.field739 = 0;
            arg1.field758 = 0;
            if (arg1.field720 > field270) {
                arg1.field739 = -1;
            }
            if (arg1.field738 == 65535) {
                arg1.field738 = -1;
            }
        }
        if ((arg2 & 0x1) != 0) {
            int var6 = field306.method2152();
            byte[] var7 = new byte[var6];
            class104 var8 = new class104(var7);
            field306.method2217(var7, 0, var6);
            field389[arg0] = var8;
            arg1.method18(var8);
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field750 = field306.method2187();
            if (arg1.field750.charAt(0) == '~') {
                arg1.field750 = arg1.field750.substring(1);
                method555(2, arg1.field36, arg1.field750);
            } else if (Statics.field180 == arg1) {
                method555(2, arg1.field36, arg1.field750);
            }
            arg1.field734 = 0;
            arg1.field719 = 0;
            arg1.field741 = 150;
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field743 = field306.method2151();
            arg1.field745 = field306.method2257();
            arg1.field744 = field306.method2152();
            arg1.field746 = field306.method2151();
            arg1.field716 = field306.method2206() + field270;
            arg1.field748 = field306.method2206() + field270;
            arg1.field749 = field306.method2152();
            arg1.field737 = 1;
            arg1.field760 = 0;
        }
        if ((arg2 & 0x2) != 0) {
            int var9 = field306.method2257();
            int var10 = field306.method2151();
            arg1.method599(var9, var10, field270);
            arg1.field724 = field270 + 300;
            arg1.field709 = field306.method2151();
            arg1.field726 = field306.method2151();
        }
        if ((arg2 & 0x400) != 0) {
            int var11 = field306.method2153();
            int var12 = field306.method2257();
            arg1.method599(var11, var12, field270);
            arg1.field724 = field270 + 300;
            arg1.field709 = field306.method2153();
            arg1.field726 = field306.method2152();
        }
        if ((arg2 & 0x80) != 0) {
            int var13 = field306.method2159();
            int var14 = field306.method2153();
            int var15 = field306.method2153();
            int var16 = field306.field1815;
            if (arg1.field36 != null && arg1.field29 != null) {
                boolean var17 = false;
                if (var14 <= 1 && method1986(arg1.field36)) {
                    var17 = true;
                }
                if (!var17 && field383 == 0) {
                    field421.field1815 = 0;
                    field306.method2311(field421.field1819, 0, var15);
                    field421.field1815 = 0;
                    class104 var18 = field421;
                    String var22;
                    try {
                        int var19 = var18.method2204();
                        if (var19 > 32767) {
                            var19 = 32767;
                        }
                        byte[] var20 = new byte[var19];
                        var18.field1815 += Statics.field2843.method2068(var18.field1819, var18.field1815, var20, 0, var19);
                        String var21 = class191.method37(var20, 0, var19);
                        var22 = var21;
                    } catch (Exception var26) {
                        var22 = "Cabbage";
                    }
                    String var25 = class182.method3315(class189.method544(var22));
                    arg1.field750 = var25.trim();
                    arg1.field734 = var13 >> 8;
                    arg1.field719 = var13 & 0xFF;
                    arg1.field741 = 150;
                    if (var14 == 2 || var14 == 3) {
                        method555(1, class2.method2717(1) + arg1.field36, var25);
                    } else if (var14 == 1) {
                        method555(1, class2.method2717(0) + arg1.field36, var25);
                    } else {
                        method555(2, arg1.field36, var25);
                    }
                }
            }
            field306.field1815 = var15 + var16;
        }
        if ((arg2 & 0x4) != 0) {
            arg1.field715 = field306.method2206();
            arg1.field729 = field306.method2161();
        }
    }

    @ObfuscatedName("al.bn(B)V")
    public static final void method1020() {
        for (int var0 = 0; var0 < field387; var0++) {
            int var1 = field388[var0];
            class28 var2 = field325[var1];
            int var3 = field306.method2257();
            if ((var3 & 0x2) != 0) {
                var2.field715 = field306.method2206();
                var2.field729 = field306.method2160();
            }
            if ((var3 & 0x40) != 0) {
                var2.field738 = field306.method2160();
                int var4 = field306.method2169();
                var2.field742 = var4 >> 16;
                var2.field720 = (var4 & 0xFFFF) + field270;
                var2.field739 = 0;
                var2.field758 = 0;
                if (var2.field720 > field270) {
                    var2.field739 = -1;
                }
                if (var2.field738 == 65535) {
                    var2.field738 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                int var5 = field306.method2152();
                int var6 = field306.method2152();
                var2.method599(var5, var6, field270);
                var2.field724 = field270 + 300;
                var2.field709 = field306.method2152();
                var2.field726 = field306.method2151();
            }
            if ((var3 & 0x1) != 0) {
                var2.field708 = field306.method2206();
                if (var2.field708 == 65535) {
                    var2.field708 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field684 = Statics.method15(field306.method2159());
                var2.field728 = var2.field684.field778;
                var2.field754 = var2.field684.field808;
                var2.field755 = var2.field684.field801;
                var2.field712 = var2.field684.field785;
                var2.field713 = var2.field684.field786;
                var2.field714 = var2.field684.field789;
                var2.field711 = var2.field684.field781;
                var2.field704 = var2.field684.field774;
                var2.field710 = var2.field684.field783;
            }
            if ((var3 & 0x4) != 0) {
                var2.field750 = field306.method2187();
                var2.field741 = 100;
            }
            if ((var3 & 0x8) != 0) {
                int var7 = field306.method2159();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field306.method2153();
                if (var2.field733 == var7 && var7 != -1) {
                    int var9 = class35.method2065(var7).field894;
                    if (var9 == 1) {
                        var2.field703 = 0;
                        var2.field735 = 0;
                        var2.field736 = var8;
                        var2.field727 = 0;
                    }
                    if (var9 == 2) {
                        var2.field727 = 0;
                    }
                } else if (var7 == -1 || var2.field733 == -1 || class35.method2065(var7).field888 >= class35.method2065(var2.field733).field888) {
                    var2.field733 = var7;
                    var2.field703 = 0;
                    var2.field735 = 0;
                    var2.field736 = var8;
                    var2.field727 = 0;
                    var2.field760 = var2.field737;
                }
            }
            if ((var3 & 0x10) != 0) {
                int var10 = field306.method2151();
                int var11 = field306.method2153();
                var2.method599(var10, var11, field270);
                var2.field724 = field270 + 300;
                var2.field709 = field306.method2153();
                var2.field726 = field306.method2152();
            }
        }
    }

    @ObfuscatedName("eq.bl(IIIII)V")
    public static final void method2868(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field467; var4++) {
            if (field474[var4] + field472[var4] > arg0 && field472[var4] < arg0 + arg2 && field475[var4] + field300[var4] > arg1 && field300[var4] < arg1 + arg3) {
                field469[var4] = true;
            }
        }
    }

    @ObfuscatedName("ez.bz(IIIIB)V")
    public static final void method2686(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field467; var4++) {
            if (field474[var4] + field472[var4] > arg0 && field472[var4] < arg0 + arg2 && field475[var4] + field300[var4] > arg1 && field300[var4] < arg1 + arg3) {
                field470[var4] = true;
            }
        }
    }

    @ObfuscatedName("f.bg(Lp;III)V")
    public static final void method505(class25 arg0, int arg1, int arg2) {
        method905(arg0.field638, arg0.field633, arg0.field634, arg0.field636, arg0.field637, arg0.field637, arg1, arg2);
    }

    @ObfuscatedName("aa.bb(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method905(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 2) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field406 = arg0;
            field367 = arg1;
            field340.method2376(55);
            field340.method2114(Statics.field945 + arg1);
            field340.method2113(class121.field1947[82] ? 1 : 0);
            field340.method2157(arg3 >> 14 & 0x7FFF);
            field340.method2138(Statics.field617);
            field340.method2157(field343);
            field340.method2114(Statics.field1624 + arg0);
        }
        if (arg2 == 12) {
            class28 var8 = field325[arg3];
            if (var8 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(60);
                field340.method2158(arg3);
                field340.method2323(class121.field1947[82] ? 1 : 0);
            }
        }
        if (arg2 == 18) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field406 = arg0;
            field367 = arg1;
            field340.method2376(125);
            field340.method2156(arg3);
            field340.method2157(Statics.field945 + arg1);
            field340.method2156(Statics.field1624 + arg0);
            field340.method2189(class121.field1947[82] ? 1 : 0);
        }
        if (arg2 == 1003) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            class28 var9 = field325[arg3];
            if (var9 != null) {
                class32 var10 = var9.field684;
                if (var10.field802 != null) {
                    var10 = var10.method616();
                }
                if (var10 != null) {
                    field340.method2376(213);
                    field340.method2114(var10.field776);
                }
            }
        }
        if (arg2 == 32) {
            field340.method2376(145);
            field340.method2158(arg0);
            field340.method2158(field343);
            field340.method2222(arg1);
            field340.method2114(arg3);
            field340.method2177(Statics.field617);
            field375 = 0;
            Statics.field94 = class148.method16(arg1);
            field264 = arg0;
        }
        if (arg2 == 42) {
            field340.method2376(53);
            field340.method2156(arg3);
            field340.method2177(arg1);
            field340.method2156(arg0);
            field375 = 0;
            Statics.field94 = class148.method16(arg1);
            field264 = arg0;
        }
        if (arg2 == 47) {
            class3 var11 = field510[arg3];
            if (var11 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(187);
                field340.method2189(class121.field1947[82] ? 1 : 0);
                field340.method2158(arg3);
            }
        }
        if (arg2 == 25) {
            class148 var12 = class148.method2867(arg1, arg0);
            if (var12 != null) {
                method2382();
                int var15 = method640(var12);
                int var16 = var15 >> 11 & 0x3F;
                method1985(arg1, arg0, var16);
                field419 = 0;
                field423 = method41(var12);
                if (field423 == null) {
                    field423 = "Null";
                }
                if (var12.field2534) {
                    field424 = var12.field2597 + class2.method517(16777215);
                } else {
                    field424 = class2.method517(65280) + var12.field2593 + class2.method517(16777215);
                }
            }
            return;
        }
        if (arg2 == 4) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field406 = arg0;
            field367 = arg1;
            field340.method2376(73);
            field340.method2189(class121.field1947[82] ? 1 : 0);
            field340.method2156(Statics.field1624 + arg0);
            field340.method2114(arg3 >> 14 & 0x7FFF);
            field340.method2158(Statics.field945 + arg1);
        }
        if (arg2 == 6) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field406 = arg0;
            field367 = arg1;
            field340.method2376(10);
            field340.method2158(arg3 >> 14 & 0x7FFF);
            field340.method2157(Statics.field1624 + arg0);
            field340.method2114(Statics.field945 + arg1);
            field340.method2113(class121.field1947[82] ? 1 : 0);
        }
        if (arg2 == 26) {
            method30();
        }
        if (arg2 == 28) {
            field340.method2376(223);
            field340.method2144(arg1);
            class148 var17 = class148.method16(arg1);
            if (var17.field2491 != null && var17.field2491[0][0] == 5) {
                int var18 = var17.field2491[0][1];
                class150.field2625[var18] = 1 - class150.field2625[var18];
                Statics.method536(var18);
            }
        }
        if (arg2 == 48) {
            class3 var19 = field510[arg3];
            if (var19 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(98);
                field340.method2150(class121.field1947[82] ? 1 : 0);
                field340.method2157(arg3);
            }
        }
        if (arg2 == 1) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field406 = arg0;
            field367 = arg1;
            field340.method2376(170);
            field340.method2138(Statics.field203);
            field340.method2323(class121.field1947[82] ? 1 : 0);
            field340.method2114(Statics.field883);
            field340.method2158(Statics.field945 + arg1);
            field340.method2158(arg3 >> 14 & 0x7FFF);
            field340.method2157(Statics.field69);
            field340.method2158(Statics.field1624 + arg0);
        }
        if (arg2 == 24) {
            class148 var20 = class148.method16(arg1);
            boolean var21 = true;
            if (var20.field2612 > 0) {
                var21 = method769(var20);
            }
            if (var21) {
                field340.method2376(223);
                field340.method2144(arg1);
            }
        }
        if (arg2 == 15) {
            class3 var22 = field510[arg3];
            if (var22 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(240);
                field340.method2156(field343);
                field340.method2158(arg3);
                field340.method2222(Statics.field617);
                field340.method2189(class121.field1947[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class28 var23 = field325[arg3];
            if (var23 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(78);
                field340.method2156(arg3);
                field340.method2323(class121.field1947[82] ? 1 : 0);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class148 var24 = class148.method2867(arg1, arg0);
            if (var24 != null) {
                if (var24.field2580 != null) {
                    class1 var25 = new class1();
                    var25.field4 = var24;
                    var25.field6 = arg3;
                    var25.field15 = arg5;
                    var25.field10 = var24.field2580;
                    class29.method1054(var25);
                }
                boolean var26 = true;
                if (var24.field2612 > 0) {
                    var26 = method769(var24);
                }
                if (var26) {
                    int var27 = method640(var24);
                    int var28 = arg3 - 1;
                    boolean var29 = (var27 >> var28 + 1 & 0x1) != 0;
                    if (var29) {
                        if (arg3 == 1) {
                            field340.method2376(66);
                            field340.method2144(arg1);
                            field340.method2114(arg0);
                        }
                        if (arg3 == 2) {
                            field340.method2376(242);
                            field340.method2144(arg1);
                            field340.method2114(arg0);
                        }
                        if (arg3 == 3) {
                            field340.method2376(107);
                            field340.method2144(arg1);
                            field340.method2114(arg0);
                        }
                        if (arg3 == 4) {
                            field340.method2376(204);
                            field340.method2144(arg1);
                            field340.method2114(arg0);
                        }
                        if (arg3 == 5) {
                            field340.method2376(196);
                            field340.method2144(arg1);
                            field340.method2114(arg0);
                        }
                        if (arg3 == 6) {
                            field340.method2376(252);
                            field340.method2144(arg1);
                            field340.method2114(arg0);
                        }
                        if (arg3 == 7) {
                            field340.method2376(3);
                            field340.method2144(arg1);
                            field340.method2114(arg0);
                        }
                        if (arg3 == 8) {
                            field340.method2376(114);
                            field340.method2144(arg1);
                            field340.method2114(arg0);
                        }
                        if (arg3 == 9) {
                            field340.method2376(248);
                            field340.method2144(arg1);
                            field340.method2114(arg0);
                        }
                        if (arg3 == 10) {
                            field340.method2376(24);
                            field340.method2144(arg1);
                            field340.method2114(arg0);
                        }
                    }
                }
            }
        }
        if (arg2 == 58) {
            field340.method2376(231);
            field340.method2222(arg1);
            field340.method2158(arg0);
            field340.method2157(field343);
            field340.method2177(Statics.field617);
        }
        if (arg2 == 34) {
            field340.method2376(168);
            field340.method2156(arg0);
            field340.method2177(arg1);
            field340.method2114(arg3);
            field375 = 0;
            Statics.field94 = class148.method16(arg1);
            field264 = arg0;
        }
        if (arg2 == 22) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field406 = arg0;
            field367 = arg1;
            field340.method2376(212);
            field340.method2156(arg3);
            field340.method2158(Statics.field1624 + arg0);
            field340.method2158(Statics.field945 + arg1);
            field340.method2113(class121.field1947[82] ? 1 : 0);
        }
        if (arg2 == 43) {
            field340.method2376(130);
            field340.method2156(arg0);
            field340.method2222(arg1);
            field340.method2114(arg3);
            field375 = 0;
            Statics.field94 = class148.method16(arg1);
            field264 = arg0;
        }
        if (arg2 == 38) {
            method2382();
            class148 var30 = class148.method16(arg1);
            field419 = 1;
            Statics.field69 = arg0;
            Statics.field203 = arg1;
            Statics.field883 = arg3;
            method32(var30);
            field310 = class2.method517(16748608) + class42.method2477(arg3).field987 + class2.method517(16777215);
            if (field310 == null) {
                field310 = "null";
            }
            return;
        }
        if (arg2 == 31) {
            field340.method2376(207);
            field340.method2156(Statics.field69);
            field340.method2177(Statics.field203);
            field340.method2156(arg3);
            field340.method2177(arg1);
            field340.method2156(arg0);
            field340.method2158(Statics.field883);
            field375 = 0;
            Statics.field94 = class148.method16(arg1);
            field264 = arg0;
        }
        if (arg2 == 40) {
            field340.method2376(251);
            field340.method2222(arg1);
            field340.method2157(arg3);
            field340.method2157(arg0);
            field375 = 0;
            Statics.field94 = class148.method16(arg1);
            field264 = arg0;
        }
        if (arg2 == 9) {
            class28 var31 = field325[arg3];
            if (var31 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(232);
                field340.method2114(arg3);
                field340.method2113(class121.field1947[82] ? 1 : 0);
            }
        }
        if (arg2 == 41) {
            field340.method2376(65);
            field340.method2157(arg3);
            field340.method2158(arg0);
            field340.method2144(arg1);
            field375 = 0;
            Statics.field94 = class148.method16(arg1);
            field264 = arg0;
        }
        if (arg2 == 29) {
            field340.method2376(223);
            field340.method2144(arg1);
            class148 var32 = class148.method16(arg1);
            if (var32.field2491 != null && var32.field2491[0][0] == 5) {
                int var33 = var32.field2491[0][1];
                if (class150.field2625[var33] != var32.field2560[0]) {
                    class150.field2625[var33] = var32.field2560[0];
                    Statics.method536(var33);
                }
            }
        }
        if (arg2 == 17) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field406 = arg0;
            field367 = arg1;
            field340.method2376(180);
            field340.method2156(Statics.field945 + arg1);
            field340.method2113(class121.field1947[82] ? 1 : 0);
            field340.method2114(Statics.field1624 + arg0);
            field340.method2138(Statics.field617);
            field340.method2158(field343);
            field340.method2114(arg3);
        }
        if (arg2 == 51) {
            class3 var34 = field510[arg3];
            if (var34 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(226);
                field340.method2113(class121.field1947[82] ? 1 : 0);
                field340.method2158(arg3);
            }
        }
        if (arg2 == 23) {
            Statics.field1911.method1703(Statics.field1, arg0, arg1);
        }
        if (arg2 == 5) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field406 = arg0;
            field367 = arg1;
            field340.method2376(157);
            field340.method2156(arg3 >> 14 & 0x7FFF);
            field340.method2113(class121.field1947[82] ? 1 : 0);
            field340.method2156(Statics.field1624 + arg0);
            field340.method2157(Statics.field945 + arg1);
        }
        if (arg2 == 3) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field406 = arg0;
            field367 = arg1;
            field340.method2376(1);
            field340.method2323(class121.field1947[82] ? 1 : 0);
            field340.method2158(Statics.field945 + arg1);
            field340.method2158(Statics.field1624 + arg0);
            field340.method2158(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 39) {
            field340.method2376(94);
            field340.method2144(arg1);
            field340.method2158(arg3);
            field340.method2158(arg0);
            field375 = 0;
            Statics.field94 = class148.method16(arg1);
            field264 = arg0;
        }
        if (arg2 == 45) {
            class3 var35 = field510[arg3];
            if (var35 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(68);
                field340.method2156(arg3);
                field340.method2189(class121.field1947[82] ? 1 : 0);
            }
        }
        if (arg2 == 37) {
            field340.method2376(27);
            field340.method2158(arg0);
            field340.method2222(arg1);
            field340.method2156(arg3);
            field375 = 0;
            Statics.field94 = class148.method16(arg1);
            field264 = arg0;
        }
        if (arg2 == 36) {
            field340.method2376(209);
            field340.method2157(arg0);
            field340.method2157(arg3);
            field340.method2138(arg1);
            field375 = 0;
            Statics.field94 = class148.method16(arg1);
            field264 = arg0;
        }
        if (arg2 == 49) {
            class3 var36 = field510[arg3];
            if (var36 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(138);
                field340.method2150(class121.field1947[82] ? 1 : 0);
                field340.method2157(arg3);
            }
        }
        if (arg2 == 30 && field429 == null) {
            method2063(arg1, arg0);
            field429 = class148.method2867(arg1, arg0);
            method32(field429);
        }
        if (arg2 == 19) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field406 = arg0;
            field367 = arg1;
            field340.method2376(83);
            field340.method2158(arg3);
            field340.method2158(Statics.field945 + arg1);
            field340.method2113(class121.field1947[82] ? 1 : 0);
            field340.method2114(Statics.field1624 + arg0);
        }
        if (arg2 == 7) {
            class28 var37 = field325[arg3];
            if (var37 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(85);
                field340.method2156(Statics.field69);
                field340.method2157(arg3);
                field340.method2144(Statics.field203);
                field340.method2150(class121.field1947[82] ? 1 : 0);
                field340.method2114(Statics.field883);
            }
        }
        if (arg2 == 1001) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field406 = arg0;
            field367 = arg1;
            field340.method2376(84);
            field340.method2156(Statics.field945 + arg1);
            field340.method2156(arg3 >> 14 & 0x7FFF);
            field340.method2189(class121.field1947[82] ? 1 : 0);
            field340.method2157(Statics.field1624 + arg0);
        }
        if (arg2 == 33) {
            field340.method2376(76);
            field340.method2114(arg0);
            field340.method2138(arg1);
            field340.method2158(arg3);
            field375 = 0;
            Statics.field94 = class148.method16(arg1);
            field264 = arg0;
        }
        if (arg2 == 1005) {
            class148 var38 = class148.method16(arg1);
            if (var38 == null || var38.field2586[arg0] < 100000) {
                field340.method2376(97);
                field340.method2157(arg3);
            } else {
                method555(27, "", var38.field2586[arg0] + " x " + class42.method2477(arg3).field987);
            }
            field375 = 0;
            Statics.field94 = class148.method16(arg1);
            field264 = arg0;
        }
        if (arg2 == 8) {
            class28 var39 = field325[arg3];
            if (var39 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(42);
                field340.method2156(arg3);
                field340.method2138(Statics.field617);
                field340.method2157(field343);
                field340.method2189(class121.field1947[82] ? 1 : 0);
            }
        }
        if (arg2 == 21) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field406 = arg0;
            field367 = arg1;
            field340.method2376(8);
            field340.method2323(class121.field1947[82] ? 1 : 0);
            field340.method2158(Statics.field945 + arg1);
            field340.method2156(Statics.field1624 + arg0);
            field340.method2157(arg3);
        }
        if (arg2 == 1002) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field340.method2376(202);
            field340.method2158(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1004) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field340.method2376(97);
            field340.method2157(arg3);
        }
        if (arg2 == 10) {
            class28 var40 = field325[arg3];
            if (var40 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(208);
                field340.method2113(class121.field1947[82] ? 1 : 0);
                field340.method2157(arg3);
            }
        }
        if (arg2 == 14) {
            class3 var41 = field510[arg3];
            if (var41 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(182);
                field340.method2177(Statics.field203);
                field340.method2158(Statics.field883);
                field340.method2157(arg3);
                field340.method2189(class121.field1947[82] ? 1 : 0);
                field340.method2158(Statics.field69);
            }
        }
        if (arg2 == 35) {
            field340.method2376(146);
            field340.method2156(arg0);
            field340.method2156(arg3);
            field340.method2177(arg1);
            field375 = 0;
            Statics.field94 = class148.method16(arg1);
            field264 = arg0;
        }
        if (arg2 == 11) {
            class28 var42 = field325[arg3];
            if (var42 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(51);
                field340.method2157(arg3);
                field340.method2189(class121.field1947[82] ? 1 : 0);
            }
        }
        if (arg2 == 46) {
            class3 var43 = field510[arg3];
            if (var43 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(72);
                field340.method2150(class121.field1947[82] ? 1 : 0);
                field340.method2156(arg3);
            }
        }
        if (arg2 == 20) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field406 = arg0;
            field367 = arg1;
            field340.method2376(193);
            field340.method2113(class121.field1947[82] ? 1 : 0);
            field340.method2157(Statics.field1624 + arg0);
            field340.method2158(arg3);
            field340.method2157(Statics.field945 + arg1);
        }
        if (arg2 == 16) {
            field371 = arg6;
            field372 = arg7;
            field374 = 2;
            field373 = 0;
            field406 = arg0;
            field367 = arg1;
            field340.method2376(58);
            field340.method2157(Statics.field69);
            field340.method2156(Statics.field945 + arg1);
            field340.method2156(Statics.field883);
            field340.method2158(arg3);
            field340.method2189(class121.field1947[82] ? 1 : 0);
            field340.method2222(Statics.field203);
            field340.method2156(Statics.field1624 + arg0);
        }
        if (arg2 == 44) {
            class3 var44 = field510[arg3];
            if (var44 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(61);
                field340.method2189(class121.field1947[82] ? 1 : 0);
                field340.method2114(arg3);
            }
        }
        if (arg2 == 50) {
            class3 var45 = field510[arg3];
            if (var45 != null) {
                field371 = arg6;
                field372 = arg7;
                field374 = 2;
                field373 = 0;
                field406 = arg0;
                field367 = arg1;
                field340.method2376(179);
                field340.method2113(class121.field1947[82] ? 1 : 0);
                field340.method2157(arg3);
            }
        }
        if (field419 != 0) {
            field419 = 0;
            method32(class148.method16(Statics.field203));
        }
        if (field350) {
            method2382();
        }
        if (Statics.field94 != null && field375 == 0) {
            method32(Statics.field94);
        }
    }

    @ObfuscatedName("cr.bj(IIII)V")
    public static void method1985(int arg0, int arg1, int arg2) {
        class148 var3 = class148.method2867(arg0, arg1);
        if (var3 != null && var3.field2484 != null) {
            class1 var4 = new class1();
            var4.field4 = var3;
            var4.field10 = var3.field2484;
            class29.method1054(var4);
        }
        field350 = true;
        Statics.field617 = arg0;
        field343 = arg1;
        Statics.field971 = arg2;
        method32(var3);
    }

    @ObfuscatedName("dm.bu(B)V")
    public static void method2382() {
        if (!field350) {
            return;
        }
        class148 var0 = class148.method2867(Statics.field617, field343);
        if (var0 != null && var0.field2587 != null) {
            class1 var1 = new class1();
            var1.field4 = var0;
            var1.field10 = var0.field2587;
            class29.method1054(var1);
        }
        field350 = false;
        method32(var0);
    }

    @ObfuscatedName("cn.bk(III)V")
    public static void method2063(int arg0, int arg1) {
        field340.method2376(139);
        field340.method2138(arg0);
        field340.method2114(arg1);
    }

    @ObfuscatedName("es.bv(B)V")
    public static final void method2721() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field286 - 1; var1++) {
                if (field411[var1] < 1000 && field411[var1 + 1] > 1000) {
                    String var2 = field525[var1];
                    field525[var1] = field525[var1 + 1];
                    field525[var1 + 1] = var2;
                    String var3 = field413[var1];
                    field413[var1] = field413[var1 + 1];
                    field413[var1 + 1] = var3;
                    int var4 = field411[var1];
                    field411[var1] = field411[var1 + 1];
                    field411[var1 + 1] = var4;
                    int var5 = field409[var1];
                    field409[var1] = field409[var1 + 1];
                    field409[var1 + 1] = var5;
                    int var6 = field349[var1];
                    field349[var1] = field349[var1 + 1];
                    field349[var1 + 1] = var6;
                    int var7 = field412[var1];
                    field412[var1] = field412[var1 + 1];
                    field412[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("cc.be(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1890(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field333 || field286 >= 500) {
            return;
        }
        field413[field286] = arg0;
        field525[field286] = arg1;
        field411[field286] = arg2;
        field412[field286] = arg3;
        field409[field286] = arg4;
        field349[field286] = arg5;
        field286++;
    }

    @ObfuscatedName("bm.bm(I)V")
    public static void method1600() {
        for (int var0 = 0; var0 < field286; var0++) {
            int var1 = field411[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field286 - 1) {
                    for (int var3 = var0; var3 < field286 - 1; var3++) {
                        field413[var3] = field413[var3 + 1];
                        field525[var3] = field525[var3 + 1];
                        field411[var3] = field411[var3 + 1];
                        field412[var3] = field412[var3 + 1];
                        field409[var3] = field409[var3 + 1];
                        field349[var3] = field349[var3 + 1];
                    }
                }
                field286--;
            }
        }
    }

    @ObfuscatedName("a.bd(Las;IIIS)V")
    public static final void method91(class32 arg0, int arg1, int arg2, int arg3) {
        if (field286 >= 400) {
            return;
        }
        if (arg0.field802 != null) {
            arg0 = arg0.method616();
        }
        if (arg0 == null || !arg0.field782 || arg0.field784 && field272 != arg1) {
            return;
        }
        String var4 = arg0.field777;
        if (arg0.field796 != 0) {
            int var6 = arg0.field796;
            int var7 = Statics.field180.field30;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method517(16711680);
            } else if (var8 < -6) {
                var9 = class2.method517(16723968);
            } else if (var8 < -3) {
                var9 = class2.method517(16740352);
            } else if (var8 < 0) {
                var9 = class2.method517(16756736);
            } else if (var8 > 9) {
                var9 = class2.method517(65280);
            } else if (var8 > 6) {
                var9 = class2.method517(4259584);
            } else if (var8 > 3) {
                var9 = class2.method517(8453888);
            } else if (var8 > 0) {
                var9 = class2.method517(12648192);
            } else {
                var9 = class2.method517(16776960);
            }
            var4 = var4 + var9 + " " + class2.field21 + class139.field2160 + arg0.field796 + class2.field20;
        }
        if (field419 == 1) {
            method1890(class139.field2267, field310 + " " + class2.field16 + " " + class2.method517(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field350) {
            String[] var10 = arg0.field792;
            if (field436) {
                var10 = method2362(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class139.field2269)) {
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
                        method1890(var10[var11], class2.method517(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class139.field2269)) {
                        short var14 = 0;
                        if (field287 == class17.field528 || field287 == class17.field532 && arg0.field796 > Statics.field180.field30) {
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
                        method1890(var10[var13], class2.method517(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method1890(class139.field2268, class2.method517(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field971 & 0x2) == 2) {
            method1890(field423, field424 + " " + class2.field16 + " " + class2.method517(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("eh.bc(Lu;IIIB)V")
    public static final void method2845(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field180 == arg0 || field286 >= 400) {
            return;
        }
        String var9;
        if (arg0.field46 == 0) {
            String var4 = arg0.field36;
            int var5 = arg0.field30;
            int var6 = Statics.field180.field30;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method517(16711680);
            } else if (var7 < -6) {
                var8 = class2.method517(16723968);
            } else if (var7 < -3) {
                var8 = class2.method517(16740352);
            } else if (var7 < 0) {
                var8 = class2.method517(16756736);
            } else if (var7 > 9) {
                var8 = class2.method517(65280);
            } else if (var7 > 6) {
                var8 = class2.method517(4259584);
            } else if (var7 > 3) {
                var8 = class2.method517(8453888);
            } else if (var7 > 0) {
                var8 = class2.method517(12648192);
            } else {
                var8 = class2.method517(16776960);
            }
            var9 = var4 + var8 + " " + class2.field21 + class139.field2160 + arg0.field30 + class2.field20;
        } else {
            var9 = arg0.field36 + " " + class2.field21 + class139.field2274 + arg0.field46 + class2.field20;
        }
        if (field419 == 1) {
            method1890(class139.field2267, field310 + " " + class2.field16 + " " + class2.method517(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field350) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field476[var10] != null) {
                    short var11 = 0;
                    if (field476[var10].equalsIgnoreCase(class139.field2269)) {
                        if (field287 == class17.field528 || field287 == class17.field532 && arg0.field30 > Statics.field180.field30) {
                            var11 = 2000;
                        }
                        if (Statics.field180.field38 != 0 && arg0.field38 != 0) {
                            if (Statics.field180.field38 == arg0.field38) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field396[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field394[var10] + var11;
                    method1890(field476[var10], class2.method517(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field971 & 0x8) == 8) {
            method1890(field423, field424 + " " + class2.field16 + " " + class2.method517(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field286; var14++) {
            if (field411[var14] == 23) {
                field525[var14] = class2.method517(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("co.bs([Lex;IIIIIIIII)V")
    public static final void method1788(class148[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class70.method1515(arg2, arg3, arg4, arg5);
        class81.method1833();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class148 var10 = arg0[var9];
            if (var10 != null && (var10.field2504 == arg1 || arg1 == -1412584499 && field437 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field472[field467] = var10.field2521 + arg6;
                    field300[field467] = var10.field2499 + arg7;
                    field474[field467] = var10.field2516;
                    field475[field467] = var10.field2503;
                    var11 = ++field467 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2600 = var11;
                var10.field2556 = field270;
                if (!var10.field2534 || !method140(var10)) {
                    if (var10.field2612 > 0) {
                        method558(var10);
                    }
                    int var12 = var10.field2521 + arg6;
                    int var13 = var10.field2499 + arg7;
                    int var14 = var10.field2515;
                    if (field437 == var10) {
                        if (arg1 != -1412584499 && !var10.field2558) {
                            Statics.field629 = arg0;
                            Statics.field2634 = arg6;
                            Statics.field913 = arg7;
                            continue;
                        }
                        if (field448 && field442) {
                            int var15 = class124.field1991;
                            int var16 = class124.field1986;
                            int var17 = var15 - field439;
                            int var18 = var16 - field440;
                            if (var17 < field443) {
                                var17 = field443;
                            }
                            if (var10.field2516 + var17 > field443 + field498.field2516) {
                                var17 = field443 + field498.field2516 - var10.field2516;
                            }
                            if (var18 < field444) {
                                var18 = field444;
                            }
                            if (var10.field2503 + var18 > field444 + field498.field2503) {
                                var18 = field444 + field498.field2503 - var10.field2503;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2558) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2502 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2502 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2516 + var12;
                        int var26 = var10.field2503 + var13;
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
                        int var29 = var10.field2516 + var12;
                        int var30 = var10.field2503 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2534 || var19 < var21 && var20 < var22) {
                        if (var10.field2612 != 0) {
                            if (var10.field2612 == 1337) {
                                field399 = var12;
                                field416 = var13;
                                int var31 = var10.field2516;
                                int var32 = var10.field2503;
                                class70.method1515(var12, var13, var12 + var31, var13 + var32);
                                class81.method1833();
                                field278++;
                                method2565(class27.field678);
                                boolean var33 = false;
                                if (field398 >= 0) {
                                    for (int var34 = 0; var34 < field385; var34++) {
                                        if (field398 == field386[var34]) {
                                            var33 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var33) {
                                    method2565(class27.field675);
                                }
                                method580(true);
                                method2565(var33 ? class27.field677 : class27.field676);
                                method580(false);
                                for (class7 var35 = (class7) field401.method3236(); var35 != null; var35 = (class7) field401.method3228()) {
                                    if (Statics.field1 != var35.field105 || field270 > var35.field130) {
                                        var35.method3288();
                                    } else if (field270 >= var35.field111) {
                                        if (var35.field114 > 0) {
                                            class28 var36 = field325[var35.field114 - 1];
                                            if (var36 != null && var36.field717 >= 0 && var36.field717 < 13312 && var36.field747 >= 0 && var36.field747 < 13312) {
                                                var35.method108(var36.field717, var36.field747, method2398(var36.field717, var36.field747, var35.field105) - var35.field118, field270);
                                            }
                                        }
                                        if (var35.field114 < 0) {
                                            int var37 = -var35.field114 - 1;
                                            class3 var38;
                                            if (field445 == var37) {
                                                var38 = Statics.field180;
                                            } else {
                                                var38 = field510[var37];
                                            }
                                            if (var38 != null && var38.field717 >= 0 && var38.field717 < 13312 && var38.field747 >= 0 && var38.field747 < 13312) {
                                                var35.method108(var38.field717, var38.field747, method2398(var38.field717, var38.field747, var35.field105) - var35.field118, field270);
                                            }
                                        }
                                        var35.method109(field339);
                                        Statics.field1911.method1618(Statics.field1, (int) var35.field116, (int) var35.field117, (int) var35.field122, 60, var35, var35.field124, -1, false);
                                    }
                                }
                                method2562();
                                if (!field512) {
                                    int var39 = field348;
                                    if (field356 / 256 > var39) {
                                        var39 = field356 / 256;
                                    }
                                    if (field359[4] && field479[4] + 128 > var39) {
                                        var39 = field479[4] + 128;
                                    }
                                    int var40 = field466 + field273 & 0x7FF;
                                    method896(Statics.field198, method2398(Statics.field180.field717, Statics.field180.field747, Statics.field1) - 50, Statics.field1545, var39, var40, var39 * 3 + 600);
                                }
                                int var53;
                                if (field512) {
                                    var53 = method149();
                                } else {
                                    int var41;
                                    if (Statics.field156.field145) {
                                        var41 = Statics.field1;
                                    } else {
                                        int var42 = 3;
                                        if (Statics.field951 < 310) {
                                            int var43 = Statics.field239 >> 7;
                                            int var44 = Statics.field1224 >> 7;
                                            int var45 = Statics.field180.field717 >> 7;
                                            int var46 = Statics.field180.field747 >> 7;
                                            if ((class6.field75[Statics.field1][var43][var44] & 0x4) != 0) {
                                                var42 = Statics.field1;
                                            }
                                            int var47;
                                            if (var45 > var43) {
                                                var47 = var45 - var43;
                                            } else {
                                                var47 = var43 - var45;
                                            }
                                            int var48;
                                            if (var46 > var44) {
                                                var48 = var46 - var44;
                                            } else {
                                                var48 = var44 - var46;
                                            }
                                            if (var47 > var48) {
                                                int var49 = var48 * 65536 / var47;
                                                int var50 = 32768;
                                                while (var43 != var45) {
                                                    if (var43 < var45) {
                                                        var43++;
                                                    } else if (var43 > var45) {
                                                        var43--;
                                                    }
                                                    if ((class6.field75[Statics.field1][var43][var44] & 0x4) != 0) {
                                                        var42 = Statics.field1;
                                                    }
                                                    var50 += var49;
                                                    if (var50 >= 65536) {
                                                        var50 -= 65536;
                                                        if (var44 < var46) {
                                                            var44++;
                                                        } else if (var44 > var46) {
                                                            var44--;
                                                        }
                                                        if ((class6.field75[Statics.field1][var43][var44] & 0x4) != 0) {
                                                            var42 = Statics.field1;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var51 = var47 * 65536 / var48;
                                                int var52 = 32768;
                                                while (var44 != var46) {
                                                    if (var44 < var46) {
                                                        var44++;
                                                    } else if (var44 > var46) {
                                                        var44--;
                                                    }
                                                    if ((class6.field75[Statics.field1][var43][var44] & 0x4) != 0) {
                                                        var42 = Statics.field1;
                                                    }
                                                    var52 += var51;
                                                    if (var52 >= 65536) {
                                                        var52 -= 65536;
                                                        if (var43 < var45) {
                                                            var43++;
                                                        } else if (var43 > var45) {
                                                            var43--;
                                                        }
                                                        if ((class6.field75[Statics.field1][var43][var44] & 0x4) != 0) {
                                                            var42 = Statics.field1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class6.field75[Statics.field1][Statics.field180.field717 >> 7][Statics.field180.field747 >> 7] & 0x4) != 0) {
                                            var42 = Statics.field1;
                                        }
                                        var41 = var42;
                                    }
                                    var53 = var41;
                                }
                                int var54 = Statics.field239;
                                int var55 = Statics.field1873;
                                int var56 = Statics.field1224;
                                int var57 = Statics.field951;
                                int var58 = Statics.field1626;
                                for (int var59 = 0; var59 < 5; var59++) {
                                    if (field359[var59]) {
                                        int var60 = (int) (Math.random() * (double) (field514[var59] * 2 + 1) - (double) field514[var59] + Math.sin((double) field516[var59] / 100.0D * (double) field517[var59]) * (double) field479[var59]);
                                        if (var59 == 0) {
                                            Statics.field239 += var60;
                                        }
                                        if (var59 == 1) {
                                            Statics.field1873 += var60;
                                        }
                                        if (var59 == 2) {
                                            Statics.field1224 += var60;
                                        }
                                        if (var59 == 3) {
                                            Statics.field1626 = Statics.field1626 + var60 & 0x7FF;
                                        }
                                        if (var59 == 4) {
                                            Statics.field951 += var60;
                                            if (Statics.field951 < 128) {
                                                Statics.field951 = 128;
                                            }
                                            if (Statics.field951 > 383) {
                                                Statics.field951 = 383;
                                            }
                                        }
                                    }
                                }
                                int var61 = class124.field1991;
                                int var62 = class124.field1986;
                                if (class124.field1992 != 0) {
                                    var61 = class124.field1993;
                                    var62 = class124.field1988;
                                }
                                if (var61 >= var12 && var61 < var12 + var31 && var62 >= var13 && var62 < var13 + var32) {
                                    class95.field1721 = true;
                                    class95.field1724 = 0;
                                    class95.field1722 = var61 - var12;
                                    class95.field1723 = var62 - var13;
                                } else {
                                    class95.field1721 = false;
                                    class95.field1724 = 0;
                                }
                                method513();
                                class70.method1521(var12, var13, var31, var32, 0);
                                method513();
                                Statics.field1911.method1644(Statics.field239, Statics.field1873, Statics.field1224, Statics.field951, Statics.field1626, var53);
                                method513();
                                Statics.field1911.method1700();
                                method1980(var12, var13, var31, var32);
                                method179(var12, var13);
                                ((class85) Statics.field1442).method1878(field339);
                                method701(var12, var13, var31, var32);
                                Statics.field239 = var54;
                                Statics.field1873 = var55;
                                Statics.field1224 = var56;
                                Statics.field951 = var57;
                                Statics.field1626 = var58;
                                if (field269) {
                                    byte var63 = 0;
                                    int var64 = class146.field2460 + class146.field2458 + var63;
                                    if (var64 == 0) {
                                        field269 = false;
                                    }
                                }
                                if (field269) {
                                    class70.method1521(var12, var13, var31, var32, 0);
                                    method3174(class139.field2135, false);
                                }
                                class70.method1515(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2612 == 1338) {
                                method2367(var12, var13, var11);
                                class70.method1515(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2502 == 0) {
                            if (!var10.field2534 && method140(var10) && Statics.field252 != var10) {
                                continue;
                            }
                            if (!var10.field2534) {
                                if (var10.field2507 > var10.field2509 - var10.field2503) {
                                    var10.field2507 = var10.field2509 - var10.field2503;
                                }
                                if (var10.field2507 < 0) {
                                    var10.field2507 = 0;
                                }
                            }
                            method1788(arg0, var10.field2493, var19, var20, var21, var22, var12 - var10.field2571, var13 - var10.field2507, var11);
                            if (var10.field2601 != null) {
                                method1788(var10.field2601, var10.field2493, var19, var20, var21, var22, var12 - var10.field2571, var13 - var10.field2507, var11);
                            }
                            class4 var66 = (class4) field426.method3208((long) var10.field2493);
                            if (var66 != null) {
                                int var67 = var66.field56;
                                if (class148.method2726(var67)) {
                                    Statics.field629 = null;
                                    method1788(Statics.field2602[var67], -1, var19, var20, var21, var22, var12, var13, var11);
                                    if (Statics.field629 != null) {
                                        method1788(Statics.field629, -1412584499, var19, var20, var21, var22, Statics.field2634, Statics.field913, var11);
                                        Statics.field629 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var68 = 0; var68 < 100; var68++) {
                                        field469[var68] = true;
                                    }
                                } else {
                                    field469[var11] = true;
                                }
                            }
                            class70.method1515(arg2, arg3, arg4, arg5);
                            class81.method1833();
                        }
                        if (field395[var11] || field499 > 1) {
                            if (var10.field2502 == 0 && !var10.field2534 && var10.field2509 > var10.field2503) {
                                int var69 = var10.field2516 + var12;
                                int var70 = var10.field2507;
                                int var71 = var10.field2503;
                                int var72 = var10.field2509;
                                Statics.field256[0].method1583(var69, var13);
                                Statics.field256[1].method1583(var69, var13 + var71 - 16);
                                class70.method1521(var69, var13 + 16, 16, var71 - 32, field342);
                                int var73 = (var71 - 32) * var71 / var72;
                                if (var73 < 8) {
                                    var73 = 8;
                                }
                                int var74 = (var71 - 32 - var73) * var70 / (var72 - var71);
                                class70.method1521(var69, var13 + 16 + var74, 16, var73, field446);
                                class70.method1527(var69, var13 + 16 + var74, var73, field266);
                                class70.method1527(var69 + 1, var13 + 16 + var74, var73, field266);
                                class70.method1525(var69, var13 + 16 + var74, 16, field266);
                                class70.method1525(var69, var13 + 17 + var74, 16, field266);
                                class70.method1527(var69 + 15, var13 + 16 + var74, var73, field344);
                                class70.method1527(var69 + 14, var13 + 17 + var74, var73 - 1, field344);
                                class70.method1525(var69, var13 + 15 + var74 + var73, 16, field344);
                                class70.method1525(var69 + 1, var13 + 14 + var74 + var73, 15, field344);
                            }
                            if (var10.field2502 != 1) {
                                if (var10.field2502 == 2) {
                                    int var75 = 0;
                                    for (int var76 = 0; var76 < var10.field2503; var76++) {
                                        for (int var77 = 0; var77 < var10.field2516; var77++) {
                                            int var78 = (var10.field2546 + 32) * var77 + var12;
                                            int var79 = (var10.field2547 + 32) * var76 + var13;
                                            if (var75 < 20) {
                                                var78 += var10.field2548[var75];
                                                var79 += var10.field2549[var75];
                                            }
                                            if (var10.field2595[var75] > 0) {
                                                boolean var80 = false;
                                                boolean var81 = false;
                                                int var82 = var10.field2595[var75] - 1;
                                                if (var78 + 32 > arg2 && var78 < arg4 && var79 + 32 > arg3 && var79 < arg5 || Statics.field683 == var10 && field377 == var75) {
                                                    class69 var83;
                                                    if (field419 == 1 && Statics.field69 == var75 && Statics.field203 == var10.field2493) {
                                                        var83 = class42.method174(var82, var10.field2586[var75], 2, 0, false);
                                                    } else {
                                                        var83 = class42.method174(var82, var10.field2586[var75], 1, 3153952, false);
                                                    }
                                                    if (var83 == null) {
                                                        method32(var10);
                                                    } else if (Statics.field683 == var10 && field377 == var75) {
                                                        int var84 = class124.field1991 - field378;
                                                        int var85 = class124.field1986 - field379;
                                                        if (var84 < 5 && var84 > -5) {
                                                            var84 = 0;
                                                        }
                                                        if (var85 < 5 && var85 > -5) {
                                                            var85 = 0;
                                                        }
                                                        if (field450 < 5) {
                                                            var84 = 0;
                                                            var85 = 0;
                                                        }
                                                        var83.method1444(var78 + var84, var79 + var85, 128);
                                                        if (arg1 != -1) {
                                                            class148 var86 = arg0[arg1 & 0xFFFF];
                                                            if (var79 + var85 < class70.field1281 && var86.field2507 > 0) {
                                                                int var87 = field339 * (class70.field1281 - var79 - var85) / 3;
                                                                if (var87 > field339 * 10) {
                                                                    var87 = field339 * 10;
                                                                }
                                                                if (var87 > var86.field2507) {
                                                                    var87 = var86.field2507;
                                                                }
                                                                var86.field2507 -= var87;
                                                                field379 += var87;
                                                                method32(var86);
                                                            }
                                                            if (var79 + var85 + 32 > class70.field1278 && var86.field2507 < var86.field2509 - var86.field2503) {
                                                                int var88 = field339 * (var79 + var85 + 32 - class70.field1278) / 3;
                                                                if (var88 > field339 * 10) {
                                                                    var88 = field339 * 10;
                                                                }
                                                                if (var88 > var86.field2509 - var86.field2503 - var86.field2507) {
                                                                    var88 = var86.field2509 - var86.field2503 - var86.field2507;
                                                                }
                                                                var86.field2507 += var88;
                                                                field379 -= var88;
                                                                method32(var86);
                                                            }
                                                        }
                                                    } else if (Statics.field94 == var10 && field264 == var75) {
                                                        var83.method1444(var78, var79, 128);
                                                    } else {
                                                        var83.method1500(var78, var79);
                                                    }
                                                }
                                            } else if (var10.field2550 != null && var75 < 20) {
                                                class69 var89 = var10.method2876(var75);
                                                if (var89 != null) {
                                                    var89.method1500(var78, var79);
                                                } else if (class148.field2506) {
                                                    method32(var10);
                                                }
                                            }
                                            var75++;
                                        }
                                    }
                                } else if (var10.field2502 == 3) {
                                    int var90;
                                    if (method1344(var10)) {
                                        var90 = var10.field2609;
                                        if (Statics.field252 == var10 && var10.field2513 != 0) {
                                            var90 = var10.field2513;
                                        }
                                    } else {
                                        var90 = var10.field2510;
                                        if (Statics.field252 == var10 && var10.field2545 != 0) {
                                            var90 = var10.field2545;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2514) {
                                            class70.method1521(var12, var13, var10.field2516, var10.field2503, var90);
                                        } else {
                                            class70.method1523(var12, var13, var10.field2516, var10.field2503, var90);
                                        }
                                    } else if (var10.field2514) {
                                        class70.method1541(var12, var13, var10.field2516, var10.field2503, var90, 256 - (var14 & 0xFF));
                                    } else {
                                        class70.method1524(var12, var13, var10.field2516, var10.field2503, var90, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2502 == 4) {
                                    class183 var91 = var10.method2884();
                                    if (var91 != null) {
                                        String var92 = var10.field2578;
                                        int var93;
                                        if (method1344(var10)) {
                                            var93 = var10.field2609;
                                            if (Statics.field252 == var10 && var10.field2513 != 0) {
                                                var93 = var10.field2513;
                                            }
                                            if (var10.field2541.length() > 0) {
                                                var92 = var10.field2541;
                                            }
                                        } else {
                                            var93 = var10.field2510;
                                            if (Statics.field252 == var10 && var10.field2545 != 0) {
                                                var93 = var10.field2545;
                                            }
                                        }
                                        if (var10.field2534 && var10.field2511 != -1) {
                                            class42 var94 = class42.method2477(var10.field2511);
                                            var92 = var94.field987;
                                            if (var92 == null) {
                                                var92 = "null";
                                            }
                                            if ((var94.field998 == 1 || var10.field2598 != 1) && var10.field2598 != -1) {
                                                String var95 = class2.method517(16748608) + var92 + class2.field19 + " " + 'x';
                                                int var96 = var10.field2598;
                                                String var97 = Integer.toString(var96);
                                                for (int var98 = var97.length() - 3; var98 > 0; var98 -= 3) {
                                                    var97 = var97.substring(0, var98) + class2.field17 + var97.substring(var98);
                                                }
                                                StringBuilder var10000;
                                                class139 var10001;
                                                String var99;
                                                if (var97.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method517(65408)).append(var97.substring(0, var97.length() - 8));
                                                    var10001 = (class139) null;
                                                    var99 = var10000.append(class139.field2142).append(" ").append(class2.field21).append(var97).append(class2.field20).append(class2.field19).toString();
                                                } else if (var97.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method517(16777215)).append(var97.substring(0, var97.length() - 4));
                                                    var10001 = (class139) null;
                                                    var99 = var10000.append(class139.field2233).append(" ").append(class2.field21).append(var97).append(class2.field20).append(class2.field19).toString();
                                                } else {
                                                    var99 = " " + class2.method517(16776960) + var97 + class2.field19;
                                                }
                                                var92 = var95 + var99;
                                            }
                                        }
                                        if (field429 == var10) {
                                            class139 var163 = (class139) null;
                                            var92 = class139.field2275;
                                            var93 = var10.field2510;
                                        }
                                        if (!var10.field2534) {
                                            var92 = method2064(var92, var10);
                                        }
                                        var91.method3319(var92, var12, var13, var10.field2516, var10.field2503, var93, var10.field2536 ? 0 : -1, var10.field2579, var10.field2495, var10.field2542);
                                    } else if (class148.field2506) {
                                        method32(var10);
                                    }
                                } else if (var10.field2502 == 5) {
                                    if (var10.field2534) {
                                        class69 var101;
                                        if (var10.field2511 == -1) {
                                            var101 = var10.method2875(false);
                                        } else {
                                            var101 = class42.method174(var10.field2511, var10.field2598, var10.field2540, var10.field2522, false);
                                        }
                                        if (var101 != null) {
                                            int var102 = var101.field1271;
                                            int var103 = var101.field1272;
                                            if (var10.field2591) {
                                                class70.method1512(var12, var13, var10.field2516 + var12, var10.field2503 + var13);
                                                int var104 = (var10.field2516 + (var102 - 1)) / var102;
                                                int var105 = (var10.field2503 + (var103 - 1)) / var103;
                                                for (int var106 = 0; var106 < var104; var106++) {
                                                    for (int var107 = 0; var107 < var105; var107++) {
                                                        if (var10.field2519 != 0) {
                                                            var101.method1450(var102 / 2 + var102 * var106 + var12, var103 / 2 + var103 * var107 + var13, var10.field2519, 4096);
                                                        } else if (var14 == 0) {
                                                            var101.method1500(var102 * var106 + var12, var103 * var107 + var13);
                                                        } else {
                                                            var101.method1444(var102 * var106 + var12, var103 * var107 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class70.method1515(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var108 = var10.field2516 * 4096 / var102;
                                                if (var10.field2519 != 0) {
                                                    var101.method1450(var10.field2516 / 2 + var12, var10.field2503 / 2 + var13, var10.field2519, var108);
                                                } else if (var14 != 0) {
                                                    var101.method1487(var12, var13, var10.field2516, var10.field2503, 256 - (var14 & 0xFF));
                                                } else if (var10.field2516 == var102 && var10.field2503 == var103) {
                                                    var101.method1500(var12, var13);
                                                } else {
                                                    var101.method1439(var12, var13, var10.field2516, var10.field2503);
                                                }
                                            }
                                        } else if (class148.field2506) {
                                            method32(var10);
                                        }
                                    } else {
                                        class69 var100 = var10.method2875(method1344(var10));
                                        if (var100 != null) {
                                            var100.method1500(var12, var13);
                                        } else if (class148.field2506) {
                                            method32(var10);
                                        }
                                    }
                                } else if (var10.field2502 == 6) {
                                    boolean var109 = method1344(var10);
                                    int var110;
                                    if (var109) {
                                        var110 = var10.field2555;
                                    } else {
                                        var110 = var10.field2589;
                                    }
                                    class95 var111 = null;
                                    int var112 = 0;
                                    if (var10.field2511 != -1) {
                                        class42 var113 = class42.method2477(var10.field2511);
                                        if (var113 != null) {
                                            class42 var114 = var113.method872(var10.field2598);
                                            var111 = var114.method871(1);
                                            if (var111 == null) {
                                                method32(var10);
                                            } else {
                                                var111.method2051();
                                                var112 = var111.field1315 / 2;
                                            }
                                        }
                                    } else if (var10.field2525 == 5) {
                                        if (var10.field2526 == 0) {
                                            var111 = field524.method2949((class35) null, -1, (class35) null, -1);
                                        } else {
                                            var111 = Statics.field180.method19();
                                        }
                                    } else if (var110 == -1) {
                                        var111 = var10.method2911((class35) null, -1, var109, Statics.field180.field29);
                                        if (var111 == null && class148.field2506) {
                                            method32(var10);
                                        }
                                    } else {
                                        class35 var115 = class35.method2065(var110);
                                        var111 = var10.method2911(var115, var10.field2524, var109, Statics.field180.field29);
                                        if (var111 == null && class148.field2506) {
                                            method32(var10);
                                        }
                                    }
                                    class81.method1794(var10.field2516 / 2 + var12, var10.field2503 / 2 + var13);
                                    int var116 = var10.field2590 * class81.field1425[var10.field2533] >> 16;
                                    int var117 = var10.field2590 * class81.field1446[var10.field2533] >> 16;
                                    if (var111 != null) {
                                        if (var10.field2534) {
                                            var111.method2051();
                                            if (var10.field2527) {
                                                var111.method2024(0, var10.field2512, var10.field2530, var10.field2533, var10.field2531, var10.field2532 + var112 + var116, var10.field2532 + var117, var10.field2590);
                                            } else {
                                                var111.method2003(0, var10.field2512, var10.field2530, var10.field2533, var10.field2531, var10.field2532 + var112 + var116, var10.field2532 + var117);
                                            }
                                        } else {
                                            var111.method2003(0, var10.field2512, 0, var10.field2533, 0, var116, var117);
                                        }
                                    }
                                    class81.method1849();
                                } else {
                                    if (var10.field2502 == 7) {
                                        class183 var118 = var10.method2884();
                                        if (var118 == null) {
                                            if (class148.field2506) {
                                                method32(var10);
                                            }
                                            continue;
                                        }
                                        int var119 = 0;
                                        for (int var120 = 0; var120 < var10.field2503; var120++) {
                                            for (int var121 = 0; var121 < var10.field2516; var121++) {
                                                if (var10.field2595[var119] > 0) {
                                                    class42 var122 = class42.method2477(var10.field2595[var119] - 1);
                                                    String var123;
                                                    if (var122.field998 != 1 && var10.field2586[var119] == 1) {
                                                        var123 = class2.method517(16748608) + var122.field987 + class2.field19;
                                                    } else {
                                                        String var124 = class2.method517(16748608) + var122.field987 + class2.field19 + " " + 'x';
                                                        int var125 = var10.field2586[var119];
                                                        String var126 = Integer.toString(var125);
                                                        for (int var127 = var126.length() - 3; var127 > 0; var127 -= 3) {
                                                            var126 = var126.substring(0, var127) + class2.field17 + var126.substring(var127);
                                                        }
                                                        String var128;
                                                        if (var126.length() > 9) {
                                                            var128 = " " + class2.method517(65408) + var126.substring(0, var126.length() - 8) + class139.field2142 + " " + class2.field21 + var126 + class2.field20 + class2.field19;
                                                        } else if (var126.length() > 6) {
                                                            var128 = " " + class2.method517(16777215) + var126.substring(0, var126.length() - 4) + class139.field2233 + " " + class2.field21 + var126 + class2.field20 + class2.field19;
                                                        } else {
                                                            var128 = " " + class2.method517(16776960) + var126 + class2.field19;
                                                        }
                                                        var123 = var124 + var128;
                                                    }
                                                    int var129 = (var10.field2546 + 115) * var121 + var12;
                                                    int var130 = (var10.field2547 + 12) * var120 + var13;
                                                    if (var10.field2579 == 0) {
                                                        var118.method3354(var123, var129, var130, var10.field2510, var10.field2536 ? 0 : -1);
                                                    } else if (var10.field2579 == 1) {
                                                        var118.method3318(var123, var10.field2516 / 2 + var129, var130, var10.field2510, var10.field2536 ? 0 : -1);
                                                    } else {
                                                        var118.method3317(var123, var10.field2516 + var129 - 1, var130, var10.field2510, var10.field2536 ? 0 : -1);
                                                    }
                                                }
                                                var119++;
                                            }
                                        }
                                    }
                                    if (var10.field2502 == 8 && Statics.field2652 == var10 && field418 == field321) {
                                        int var131 = 0;
                                        int var132 = 0;
                                        class183 var133 = Statics.field316;
                                        String var134 = var10.field2578;
                                        String var135 = method2064(var134, var10);
                                        while (var135.length() > 0) {
                                            int var136 = var135.indexOf(class2.field23);
                                            String var137;
                                            if (var136 == -1) {
                                                var137 = var135;
                                                var135 = "";
                                            } else {
                                                var137 = var135.substring(0, var136);
                                                var135 = var135.substring(var136 + 4);
                                            }
                                            int var138 = var133.method3311(var137);
                                            if (var138 > var131) {
                                                var131 = var138;
                                            }
                                            var132 += var133.field2851 + 1;
                                        }
                                        var131 += 6;
                                        var132 += 7;
                                        int var139 = var10.field2516 + var12 - 5 - var131;
                                        int var140 = var10.field2503 + var13 + 5;
                                        if (var139 < var12 + 5) {
                                            var139 = var12 + 5;
                                        }
                                        if (var131 + var139 > arg4) {
                                            var139 = arg4 - var131;
                                        }
                                        if (var132 + var140 > arg5) {
                                            var140 = arg5 - var132;
                                        }
                                        class70.method1521(var139, var140, var131, var132, 16777120);
                                        class70.method1523(var139, var140, var131, var132, 0);
                                        String var141 = var10.field2578;
                                        int var142 = var133.field2851 + var140 + 2;
                                        String var143 = method2064(var141, var10);
                                        while (var143.length() > 0) {
                                            int var144 = var143.indexOf(class2.field23);
                                            String var145;
                                            if (var144 == -1) {
                                                var145 = var143;
                                                var143 = "";
                                            } else {
                                                var145 = var143.substring(0, var144);
                                                var143 = var143.substring(var144 + 4);
                                            }
                                            var133.method3354(var145, var139 + 3, var142, 0, -1);
                                            var142 += var133.field2851 + 1;
                                        }
                                    }
                                    if (var10.field2502 == 9) {
                                        if (var10.field2608 == 1) {
                                            class70.method1573(var12, var13, var10.field2516 + var12, var10.field2503 + var13, var10.field2510);
                                        } else {
                                            int var146 = var10.field2516 >= 0 ? var10.field2516 : -var10.field2516;
                                            int var147 = var10.field2503 >= 0 ? var10.field2503 : -var10.field2503;
                                            int var148 = var146;
                                            if (var146 < var147) {
                                                var148 = var147;
                                            }
                                            if (var148 != 0) {
                                                int var149 = (var10.field2516 << 16) / var148;
                                                int var150 = (var10.field2503 << 16) / var148;
                                                if (var150 <= var149) {
                                                    var149 = -var149;
                                                } else {
                                                    var150 = -var150;
                                                }
                                                int var151 = var10.field2608 * var150 >> 17;
                                                int var152 = var10.field2608 * var150 + 1 >> 17;
                                                int var153 = var10.field2608 * var149 >> 17;
                                                int var154 = var10.field2608 * var149 + 1 >> 17;
                                                int var155 = var12 + var151;
                                                int var156 = var12 - var152;
                                                int var157 = var10.field2516 + var12 - var152;
                                                int var158 = var10.field2516 + var12 + var151;
                                                int var159 = var13 + var153;
                                                int var160 = var13 - var154;
                                                int var161 = var10.field2503 + var13 - var154;
                                                int var162 = var10.field2503 + var13 + var153;
                                                class81.method1799(var155, var156, var157);
                                                class81.method1802(var159, var160, var161, var155, var156, var157, var10.field2510);
                                                class81.method1799(var155, var157, var158);
                                                class81.method1802(var159, var161, var162, var155, var157, var158, var10.field2510);
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

    @ObfuscatedName("cn.cl(Ljava/lang/String;Lex;I)Ljava/lang/String;")
    public static String method2064(String arg0, class148 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1416(arg1, var2 - 1);
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
                if (Statics.field2126 != null) {
                    int var9 = Statics.field2126.field2051;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field2126.field2059 != null) {
                        var8 = (String) Statics.field2126.field2059;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bl.co(Lex;B)Z")
    public static final boolean method1344(class148 arg0) {
        if (arg0.field2606 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2606.length; var1++) {
            int var2 = method1416(arg0, var1);
            int var3 = arg0.field2560[var1];
            if (arg0.field2606[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2606[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2606[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bw.ce(Lex;II)I")
    public static final int method1416(class148 arg0, int arg1) {
        if (arg0.field2491 == null || arg1 >= arg0.field2491.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2491[arg1];
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
                    var7 = field262[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field318[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field293[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class148 var11 = class148.method16(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class42.method2477(var12).field1000 || field296)) {
                        for (int var13 = 0; var13 < var11.field2595.length; var13++) {
                            if (var12 + 1 == var11.field2595[var13]) {
                                var7 += var11.field2586[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class150.field2625[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class137.field2112[field318[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class150.field2625[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field180.field30;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class137.field2111[var14]) {
                            var7 += field318[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class148 var17 = class148.method16(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class42.method2477(var18).field1000 || field296)) {
                        for (int var19 = 0; var19 < var17.field2595.length; var19++) {
                            if (var18 + 1 == var17.field2595[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field430;
                }
                if (var6 == 12) {
                    var7 = field481;
                }
                if (var6 == 13) {
                    int var20 = class150.field2625[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class150.method117(var22);
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
                    var7 = (Statics.field180.field717 >> 7) + Statics.field1624;
                }
                if (var6 == 19) {
                    var7 = (Statics.field180.field747 >> 7) + Statics.field945;
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

    @ObfuscatedName("n.ca(IIIIIIIB)V")
    public static final void method5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class148.method2726(arg0)) {
            method1875(Statics.field2602[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ck.cz([Lex;IIIIIIII)V")
    public static final void method1875(class148[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class148 var9 = arg0[var8];
            if (var9 != null && (!var9.field2534 || var9.field2502 == 0 || var9.field2498 || method640(var9) != 0 || field498 == var9) && var9.field2504 == arg1 && (!var9.field2534 || !method140(var9))) {
                int var10 = var9.field2521 + arg6;
                int var11 = var9.field2499 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2502 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2502 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2516 + var10;
                    int var19 = var9.field2503 + var11;
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
                    int var22 = var9.field2516 + var10;
                    int var23 = var9.field2503 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field437 == var9) {
                    field368 = true;
                    field324 = var10;
                    field447 = var11;
                }
                if (!var9.field2534 || var12 < var14 && var13 < var15) {
                    int var24 = class124.field1991;
                    int var25 = class124.field1986;
                    if (class124.field1992 != 0) {
                        var24 = class124.field1993;
                        var25 = class124.field1988;
                    }
                    if (var9.field2612 == 1337) {
                        method32(var9);
                        if (!field269 && !field333 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field419 == 0 && !field350) {
                                method1890(class139.field2272, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            for (int var27 = 0; var27 < class95.field1724; var27++) {
                                int var28 = class95.field1725[var27];
                                int var29 = var28 & 0x7F;
                                int var30 = var28 >> 7 & 0x7F;
                                int var31 = var28 >> 29 & 0x3;
                                int var32 = var28 >> 14 & 0x7FFF;
                                if (var26 != var28) {
                                    var26 = var28;
                                    if (var31 == 2 && Statics.field1911.method1636(Statics.field1, var29, var30, var28) >= 0) {
                                        class33 var33 = class33.method115(var32);
                                        if (var33.field842 != null) {
                                            var33 = var33.method676();
                                        }
                                        if (var33 == null) {
                                            continue;
                                        }
                                        if (field419 == 1) {
                                            method1890(class139.field2267, field310 + " " + class2.field16 + " " + class2.method517(65535) + var33.field815, 1, var28, var29, var30);
                                        } else if (!field350) {
                                            String[] var34 = var33.field825;
                                            if (field436) {
                                                var34 = method2362(var34);
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
                                                        method1890(var34[var35], class2.method517(65535) + var33.field815, var36, var28, var29, var30);
                                                    }
                                                }
                                            }
                                            method1890(class139.field2268, class2.method517(65535) + var33.field815, 1002, var33.field820 << 14, var29, var30);
                                        } else if ((Statics.field971 & 0x4) == 4) {
                                            method1890(field423, field424 + " " + class2.field16 + " " + class2.method517(65535) + var33.field815, 2, var28, var29, var30);
                                        }
                                    }
                                    if (var31 == 1) {
                                        class28 var37 = field325[var32];
                                        if (var37 == null) {
                                            continue;
                                        }
                                        if (var37.field684.field778 == 1 && (var37.field717 & 0x7F) == 64 && (var37.field747 & 0x7F) == 64) {
                                            for (int var38 = 0; var38 < field284; var38++) {
                                                class28 var39 = field325[field484[var38]];
                                                if (var39 != null && var37 != var39 && var39.field684.field778 == 1 && var37.field717 == var39.field717 && var37.field747 == var39.field747) {
                                                    method91(var39.field684, field484[var38], var29, var30);
                                                }
                                            }
                                            for (int var40 = 0; var40 < field385; var40++) {
                                                class3 var41 = field510[field386[var40]];
                                                if (var41 != null && var37.field717 == var41.field717 && var37.field747 == var41.field747) {
                                                    method2845(var41, field386[var40], var29, var30);
                                                }
                                            }
                                        }
                                        method91(var37.field684, var32, var29, var30);
                                    }
                                    if (var31 == 0) {
                                        class3 var42 = field510[var32];
                                        if (var42 == null) {
                                            continue;
                                        }
                                        if ((var42.field717 & 0x7F) == 64 && (var42.field747 & 0x7F) == 64) {
                                            for (int var43 = 0; var43 < field284; var43++) {
                                                class28 var44 = field325[field484[var43]];
                                                if (var44 != null && var44.field684.field778 == 1 && var42.field717 == var44.field717 && var42.field747 == var44.field747) {
                                                    method91(var44.field684, field484[var43], var29, var30);
                                                }
                                            }
                                            for (int var45 = 0; var45 < field385; var45++) {
                                                class3 var46 = field510[field386[var45]];
                                                if (var46 != null && var42 != var46 && var42.field717 == var46.field717 && var42.field747 == var46.field747) {
                                                    method2845(var46, field386[var45], var29, var30);
                                                }
                                            }
                                        }
                                        method2845(var42, var32, var29, var30);
                                    }
                                    if (var31 == 3) {
                                        class171 var47 = field473[Statics.field1][var29][var30];
                                        if (var47 != null) {
                                            for (class23 var48 = (class23) var47.method3227(); var48 != null; var48 = (class23) var47.method3229()) {
                                                class42 var49 = class42.method2477(var48.field611);
                                                if (field419 == 1) {
                                                    method1890(class139.field2267, field310 + " " + class2.field16 + " " + class2.method517(16748608) + var49.field987, 16, var48.field611, var29, var30);
                                                } else if (!field350) {
                                                    String[] var50 = var49.field1001;
                                                    if (field436) {
                                                        var50 = method2362(var50);
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
                                                            method1890(var50[var51], class2.method517(16748608) + var49.field987, var52, var48.field611, var29, var30);
                                                        } else if (var51 == 2) {
                                                            method1890(class139.field2129, class2.method517(16748608) + var49.field987, 20, var48.field611, var29, var30);
                                                        }
                                                    }
                                                    method1890(class139.field2268, class2.method517(16748608) + var49.field987, 1004, var48.field611, var29, var30);
                                                } else if ((Statics.field971 & 0x1) == 1) {
                                                    method1890(field423, field424 + " " + class2.field16 + " " + class2.method517(16748608) + var49.field987, 17, var48.field611, var29, var30);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var9.field2612 != 1338) {
                        if (!field333 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var64 = var24 - var10;
                            int var65 = var25 - var11;
                            if (var9.field2538 == 1) {
                                method1890(var9.field2594, "", 24, 0, 0, var9.field2493);
                            }
                            if (var9.field2538 == 2 && !field350) {
                                String var66 = method41(var9);
                                if (var66 != null) {
                                    method1890(var66, class2.method517(65280) + var9.field2593, 25, 0, -1, var9.field2493);
                                }
                            }
                            if (var9.field2538 == 3) {
                                method1890(class139.field2134, "", 26, 0, 0, var9.field2493);
                            }
                            if (var9.field2538 == 4) {
                                method1890(var9.field2594, "", 28, 0, 0, var9.field2493);
                            }
                            if (var9.field2538 == 5) {
                                method1890(var9.field2594, "", 29, 0, 0, var9.field2493);
                            }
                            if (var9.field2538 == 6 && field429 == null) {
                                method1890(var9.field2594, "", 30, 0, -1, var9.field2493);
                            }
                            if (var9.field2502 == 2) {
                                int var67 = 0;
                                for (int var68 = 0; var68 < var9.field2503; var68++) {
                                    for (int var69 = 0; var69 < var9.field2516; var69++) {
                                        int var70 = (var9.field2546 + 32) * var69;
                                        int var71 = (var9.field2547 + 32) * var68;
                                        if (var67 < 20) {
                                            var70 += var9.field2548[var67];
                                            var71 += var9.field2549[var67];
                                        }
                                        if (var64 >= var70 && var65 >= var71 && var64 < var70 + 32 && var65 < var71 + 32) {
                                            field380 = var67;
                                            Statics.field238 = var9;
                                            if (var9.field2595[var67] > 0) {
                                                label1295: {
                                                    class42 var72 = class42.method2477(var9.field2595[var67] - 1);
                                                    if (field419 == 1) {
                                                        int var73 = method640(var9);
                                                        boolean var74 = (var73 >> 30 & 0x1) != 0;
                                                        if (var74) {
                                                            if (Statics.field203 != var9.field2493 || Statics.field69 != var67) {
                                                                method1890(class139.field2267, field310 + " " + class2.field16 + " " + class2.method517(16748608) + var72.field987, 31, var72.field985, var67, var9.field2493);
                                                            }
                                                            break label1295;
                                                        }
                                                    }
                                                    if (field350) {
                                                        int var75 = method640(var9);
                                                        boolean var76 = (var75 >> 30 & 0x1) != 0;
                                                        if (var76) {
                                                            if ((Statics.field971 & 0x10) == 16) {
                                                                method1890(field423, field424 + " " + class2.field16 + " " + class2.method517(16748608) + var72.field987, 32, var72.field985, var67, var9.field2493);
                                                            }
                                                            break label1295;
                                                        }
                                                    }
                                                    String[] var77 = var72.field1002;
                                                    if (field436) {
                                                        var77 = method2362(var77);
                                                    }
                                                    int var78 = method640(var9);
                                                    boolean var79 = (var78 >> 30 & 0x1) != 0;
                                                    if (var79) {
                                                        for (int var80 = 4; var80 >= 3; var80--) {
                                                            if (var77 != null && var77[var80] != null) {
                                                                byte var81;
                                                                if (var80 == 3) {
                                                                    var81 = 36;
                                                                } else {
                                                                    var81 = 37;
                                                                }
                                                                method1890(var77[var80], class2.method517(16748608) + var72.field987, var81, var72.field985, var67, var9.field2493);
                                                            } else if (var80 == 4) {
                                                                method1890(class139.field2130, class2.method517(16748608) + var72.field987, 37, var72.field985, var67, var9.field2493);
                                                            }
                                                        }
                                                    }
                                                    int var82 = method640(var9);
                                                    boolean var83 = (var82 >> 31 & 0x1) != 0;
                                                    if (var83) {
                                                        method1890(class139.field2267, class2.method517(16748608) + var72.field987, 38, var72.field985, var67, var9.field2493);
                                                    }
                                                    int var84 = method640(var9);
                                                    boolean var85 = (var84 >> 30 & 0x1) != 0;
                                                    if (var85 && var77 != null) {
                                                        for (int var86 = 2; var86 >= 0; var86--) {
                                                            if (var77[var86] != null) {
                                                                byte var87 = 0;
                                                                if (var86 == 0) {
                                                                    var87 = 33;
                                                                }
                                                                if (var86 == 1) {
                                                                    var87 = 34;
                                                                }
                                                                if (var86 == 2) {
                                                                    var87 = 35;
                                                                }
                                                                method1890(var77[var86], class2.method517(16748608) + var72.field987, var87, var72.field985, var67, var9.field2493);
                                                            }
                                                        }
                                                    }
                                                    String[] var88 = var9.field2551;
                                                    if (field436) {
                                                        var88 = method2362(var88);
                                                    }
                                                    if (var88 != null) {
                                                        for (int var89 = 4; var89 >= 0; var89--) {
                                                            if (var88[var89] != null) {
                                                                byte var90 = 0;
                                                                if (var89 == 0) {
                                                                    var90 = 39;
                                                                }
                                                                if (var89 == 1) {
                                                                    var90 = 40;
                                                                }
                                                                if (var89 == 2) {
                                                                    var90 = 41;
                                                                }
                                                                if (var89 == 3) {
                                                                    var90 = 42;
                                                                }
                                                                if (var89 == 4) {
                                                                    var90 = 43;
                                                                }
                                                                method1890(var88[var89], class2.method517(16748608) + var72.field987, var90, var72.field985, var67, var9.field2493);
                                                            }
                                                        }
                                                    }
                                                    method1890(class139.field2268, class2.method517(16748608) + var72.field987, 1005, var72.field985, var67, var9.field2493);
                                                }
                                            }
                                        }
                                        var67++;
                                    }
                                }
                            }
                            if (var9.field2534) {
                                if (field350) {
                                    int var91 = method640(var9);
                                    boolean var92 = (var91 >> 21 & 0x1) != 0;
                                    if (var92 && (Statics.field971 & 0x20) == 32) {
                                        method1890(field423, field424 + " " + class2.field16 + " " + var9.field2597, 58, 0, var9.field2494, var9.field2493);
                                    }
                                } else {
                                    for (int var93 = 9; var93 >= 5; var93--) {
                                        String var94 = method703(var9, var93);
                                        if (var94 != null) {
                                            method1890(var94, var9.field2597, 1007, var93 + 1, var9.field2494, var9.field2493);
                                        }
                                    }
                                    String var95 = method41(var9);
                                    if (var95 != null) {
                                        method1890(var95, var9.field2597, 25, 0, var9.field2494, var9.field2493);
                                    }
                                    for (int var96 = 4; var96 >= 0; var96--) {
                                        String var97 = method703(var9, var96);
                                        if (var97 != null) {
                                            method1890(var97, var9.field2597, 57, var96 + 1, var9.field2494, var9.field2493);
                                        }
                                    }
                                    if (class152.method141(method640(var9))) {
                                        method1890(class139.field2278, "", 30, 0, var9.field2494, var9.field2493);
                                    }
                                }
                            }
                        }
                        if (var9.field2502 == 0) {
                            if (!var9.field2534 && method140(var9) && Statics.field252 != var9) {
                                continue;
                            }
                            method1875(arg0, var9.field2493, var12, var13, var14, var15, var10 - var9.field2571, var11 - var9.field2507);
                            if (var9.field2601 != null) {
                                method1875(var9.field2601, var9.field2493, var12, var13, var14, var15, var10 - var9.field2571, var11 - var9.field2507);
                            }
                            class4 var98 = (class4) field426.method3208((long) var9.field2493);
                            if (var98 != null) {
                                if (var98.field50 == 0 && class124.field1991 >= var12 && class124.field1986 >= var13 && class124.field1991 < var14 && class124.field1986 < var15 && !field333 && !field435) {
                                    field413[0] = class139.field2161;
                                    field525[0] = "";
                                    field411[0] = 1006;
                                    field286 = 1;
                                }
                                method5(var98.field56, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2534) {
                            if (var9.field2610 && class124.field1991 >= var12 && class124.field1986 >= var13 && class124.field1991 < var14 && class124.field1986 < var15) {
                                for (class1 var99 = (class1) field507.method3236(); var99 != null; var99 = (class1) field507.method3228()) {
                                    if (var99.field3) {
                                        var99.method3288();
                                        var99.field4.field2544 = false;
                                    }
                                }
                                if (Statics.field232 == 0) {
                                    field437 = null;
                                    field498 = null;
                                }
                                if (!field333) {
                                    field413[0] = class139.field2161;
                                    field525[0] = "";
                                    field411[0] = 1006;
                                    field286 = 1;
                                }
                            }
                            boolean var100;
                            if (class124.field1991 >= var12 && class124.field1986 >= var13 && class124.field1991 < var14 && class124.field1986 < var15) {
                                var100 = true;
                            } else {
                                var100 = false;
                            }
                            boolean var101 = false;
                            if ((class124.field1985 == 1 || !Statics.field2015 && class124.field1985 == 4) && var100) {
                                var101 = true;
                            }
                            boolean var102 = false;
                            if ((class124.field1992 == 1 || !Statics.field2015 && class124.field1992 == 4) && class124.field1993 >= var12 && class124.field1988 >= var13 && class124.field1993 < var14 && class124.field1988 < var15) {
                                var102 = true;
                            }
                            if (var102) {
                                method153(var9, class124.field1993 - var10, class124.field1988 - var11);
                            }
                            if (field437 != null && field437 != var9 && var100) {
                                int var103 = method640(var9);
                                boolean var104 = (var103 >> 20 & 0x1) != 0;
                                if (var104) {
                                    field404 = var9;
                                }
                            }
                            if (field498 == var9) {
                                field442 = true;
                                field443 = var10;
                                field444 = var11;
                            }
                            if (var9.field2498) {
                                if (var100 && field298 != 0 && var9.field2581 != null) {
                                    class1 var105 = new class1();
                                    var105.field3 = true;
                                    var105.field4 = var9;
                                    var105.field5 = field298;
                                    var105.field10 = var9.field2581;
                                    field507.method3221(var105);
                                }
                                if (field437 != null || Statics.field683 != null || field333) {
                                    var102 = false;
                                    var101 = false;
                                    var100 = false;
                                }
                                if (!var9.field2603 && var102) {
                                    var9.field2603 = true;
                                    if (var9.field2562 != null) {
                                        class1 var106 = new class1();
                                        var106.field3 = true;
                                        var106.field4 = var9;
                                        var106.field9 = class124.field1993 - var10;
                                        var106.field5 = class124.field1988 - var11;
                                        var106.field10 = var9.field2562;
                                        field507.method3221(var106);
                                    }
                                }
                                if (var9.field2603 && var101 && var9.field2563 != null) {
                                    class1 var107 = new class1();
                                    var107.field3 = true;
                                    var107.field4 = var9;
                                    var107.field9 = class124.field1991 - var10;
                                    var107.field5 = class124.field1986 - var11;
                                    var107.field10 = var9.field2563;
                                    field507.method3221(var107);
                                }
                                if (var9.field2603 && !var101) {
                                    var9.field2603 = false;
                                    if (var9.field2564 != null) {
                                        class1 var108 = new class1();
                                        var108.field3 = true;
                                        var108.field4 = var9;
                                        var108.field9 = class124.field1991 - var10;
                                        var108.field5 = class124.field1986 - var11;
                                        var108.field10 = var9.field2564;
                                        field465.method3221(var108);
                                    }
                                }
                                if (var101 && var9.field2565 != null) {
                                    class1 var109 = new class1();
                                    var109.field3 = true;
                                    var109.field4 = var9;
                                    var109.field9 = class124.field1991 - var10;
                                    var109.field5 = class124.field1986 - var11;
                                    var109.field10 = var9.field2565;
                                    field507.method3221(var109);
                                }
                                if (!var9.field2544 && var100) {
                                    var9.field2544 = true;
                                    if (var9.field2566 != null) {
                                        class1 var110 = new class1();
                                        var110.field3 = true;
                                        var110.field4 = var9;
                                        var110.field9 = class124.field1991 - var10;
                                        var110.field5 = class124.field1986 - var11;
                                        var110.field10 = var9.field2566;
                                        field507.method3221(var110);
                                    }
                                }
                                if (var9.field2544 && var100 && var9.field2567 != null) {
                                    class1 var111 = new class1();
                                    var111.field3 = true;
                                    var111.field4 = var9;
                                    var111.field9 = class124.field1991 - var10;
                                    var111.field5 = class124.field1986 - var11;
                                    var111.field10 = var9.field2567;
                                    field507.method3221(var111);
                                }
                                if (var9.field2544 && !var100) {
                                    var9.field2544 = false;
                                    if (var9.field2568 != null) {
                                        class1 var112 = new class1();
                                        var112.field3 = true;
                                        var112.field4 = var9;
                                        var112.field9 = class124.field1991 - var10;
                                        var112.field5 = class124.field1986 - var11;
                                        var112.field10 = var9.field2568;
                                        field465.method3221(var112);
                                    }
                                }
                                if (var9.field2529 != null) {
                                    class1 var113 = new class1();
                                    var113.field4 = var9;
                                    var113.field10 = var9.field2529;
                                    field464.method3221(var113);
                                }
                                if (var9.field2573 != null && field338 > var9.field2605) {
                                    if (var9.field2574 == null || field338 - var9.field2605 > 32) {
                                        class1 var118 = new class1();
                                        var118.field4 = var9;
                                        var118.field10 = var9.field2573;
                                        field507.method3221(var118);
                                    } else {
                                        label1005: for (int var114 = var9.field2605; var114 < field338; var114++) {
                                            int var115 = field452[var114 & 0x1F];
                                            for (int var116 = 0; var116 < var9.field2574.length; var116++) {
                                                if (var9.field2574[var116] == var115) {
                                                    class1 var117 = new class1();
                                                    var117.field4 = var9;
                                                    var117.field10 = var9.field2573;
                                                    field507.method3221(var117);
                                                    break label1005;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2605 = field338;
                                }
                                if (var9.field2575 != null && field453 > var9.field2517) {
                                    if (var9.field2576 == null || field453 - var9.field2517 > 32) {
                                        class1 var123 = new class1();
                                        var123.field4 = var9;
                                        var123.field10 = var9.field2575;
                                        field507.method3221(var123);
                                    } else {
                                        label981: for (int var119 = var9.field2517; var119 < field453; var119++) {
                                            int var120 = field407[var119 & 0x1F];
                                            for (int var121 = 0; var121 < var9.field2576.length; var121++) {
                                                if (var9.field2576[var121] == var120) {
                                                    class1 var122 = new class1();
                                                    var122.field4 = var9;
                                                    var122.field10 = var9.field2575;
                                                    field507.method3221(var122);
                                                    break label981;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2517 = field453;
                                }
                                if (var9.field2577 != null && field455 > var9.field2607) {
                                    if (var9.field2497 == null || field455 - var9.field2607 > 32) {
                                        class1 var128 = new class1();
                                        var128.field4 = var9;
                                        var128.field10 = var9.field2577;
                                        field507.method3221(var128);
                                    } else {
                                        label957: for (int var124 = var9.field2607; var124 < field455; var124++) {
                                            int var125 = field454[var124 & 0x1F];
                                            for (int var126 = 0; var126 < var9.field2497.length; var126++) {
                                                if (var9.field2497[var126] == var125) {
                                                    class1 var127 = new class1();
                                                    var127.field4 = var9;
                                                    var127.field10 = var9.field2577;
                                                    field507.method3221(var127);
                                                    break label957;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2607 = field455;
                                }
                                if (field456 > var9.field2604 && var9.field2543 != null) {
                                    class1 var129 = new class1();
                                    var129.field4 = var9;
                                    var129.field10 = var9.field2543;
                                    field507.method3221(var129);
                                }
                                if (field457 > var9.field2604 && var9.field2584 != null) {
                                    class1 var130 = new class1();
                                    var130.field4 = var9;
                                    var130.field10 = var9.field2584;
                                    field507.method3221(var130);
                                }
                                if (field458 > var9.field2604 && var9.field2585 != null) {
                                    class1 var131 = new class1();
                                    var131.field4 = var9;
                                    var131.field10 = var9.field2585;
                                    field507.method3221(var131);
                                }
                                if (field459 > var9.field2604 && var9.field2535 != null) {
                                    class1 var132 = new class1();
                                    var132.field4 = var9;
                                    var132.field10 = var9.field2535;
                                    field507.method3221(var132);
                                }
                                var9.field2604 = field449;
                                if (var9.field2583 != null) {
                                    for (int var133 = 0; var133 < field487; var133++) {
                                        class1 var134 = new class1();
                                        var134.field4 = var9;
                                        var134.field8 = field489[var133];
                                        var134.field11 = field488[var133];
                                        var134.field10 = var9.field2583;
                                        field507.method3221(var134);
                                    }
                                }
                            }
                        }
                        if (!var9.field2534 && field437 == null && Statics.field683 == null && !field333) {
                            if ((var9.field2592 >= 0 || var9.field2545 != 0) && class124.field1991 >= var12 && class124.field1986 >= var13 && class124.field1991 < var14 && class124.field1986 < var15) {
                                if (var9.field2592 >= 0) {
                                    Statics.field252 = arg0[var9.field2592];
                                } else {
                                    Statics.field252 = var9;
                                }
                            }
                            if (var9.field2502 == 8 && class124.field1991 >= var12 && class124.field1986 >= var13 && class124.field1991 < var14 && class124.field1986 < var15) {
                                Statics.field2652 = var9;
                            }
                            if (var9.field2509 > var9.field2503) {
                                int var135 = var9.field2516 + var10;
                                int var136 = var9.field2503;
                                int var137 = var9.field2509;
                                int var138 = class124.field1991;
                                int var139 = class124.field1986;
                                if (field326) {
                                    field347 = 32;
                                } else {
                                    field347 = 0;
                                }
                                field326 = false;
                                if (class124.field1985 == 1 || !Statics.field2015 && class124.field1985 == 4) {
                                    if (var138 >= var135 && var138 < var135 + 16 && var139 >= var11 && var139 < var11 + 16) {
                                        var9.field2507 -= 4;
                                        method32(var9);
                                    } else if (var138 >= var135 && var138 < var135 + 16 && var139 >= var11 + var136 - 16 && var139 < var11 + var136) {
                                        var9.field2507 += 4;
                                        method32(var9);
                                    } else if (var138 >= var135 - field347 && var138 < field347 + var135 + 16 && var139 >= var11 + 16 && var139 < var11 + var136 - 16) {
                                        int var140 = (var136 - 32) * var136 / var137;
                                        if (var140 < 8) {
                                            var140 = 8;
                                        }
                                        int var141 = var139 - var11 - 16 - var140 / 2;
                                        int var142 = var136 - 32 - var140;
                                        var9.field2507 = (var137 - var136) * var141 / var142;
                                        method32(var9);
                                        field326 = true;
                                    }
                                }
                                if (field298 != 0) {
                                    int var143 = var9.field2516;
                                    if (var138 >= var135 - var143 && var139 >= var11 && var138 < var135 + 16 && var139 <= var11 + var136) {
                                        var9.field2507 += field298 * 45;
                                        method32(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field500 == 0 || field500 == 3) && (class124.field1992 == 1 || !Statics.field2015 && class124.field1992 == 4)) {
                        int var53 = class124.field1993 - 25 - var10;
                        int var54 = class124.field1988 - 5 - var11;
                        if (var53 >= 0 && var54 >= 0 && var53 < 146 && var54 < 151 && (var53 < 0 || var53 > 23 || var54 < 117 || var54 > 142)) {
                            var53 -= 73;
                            var54 -= 75;
                            int var55 = field466 + field334 & 0x7FF;
                            int var56 = class81.field1425[var55];
                            int var57 = class81.field1446[var55];
                            int var58 = (field451 + 256) * var56 >> 8;
                            int var59 = (field451 + 256) * var57 >> 8;
                            int var60 = var53 * var59 + var54 * var58 >> 11;
                            int var61 = var54 * var59 - var53 * var58 >> 11;
                            int var62 = Statics.field180.field717 + var60 >> 7;
                            int var63 = Statics.field180.field747 - var61 >> 7;
                            field340.method2376(7);
                            field340.method2113(18);
                            field340.method2114(Statics.field945 + var63);
                            field340.method2157(Statics.field1624 + var62);
                            field340.method2150(class121.field1947[82] ? (class121.field1947[81] ? 2 : 1) : 0);
                            field340.method2113(var53);
                            field340.method2113(var54);
                            field340.method2114(field466);
                            field340.method2113(57);
                            field340.method2113(field334);
                            field340.method2113(field451);
                            field340.method2113(89);
                            field340.method2114(Statics.field180.field717);
                            field340.method2114(Statics.field180.field747);
                            field340.method2113(63);
                            field406 = var62;
                            field367 = var63;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fx.ck(III)V")
    public static final void method3301(int arg0, int arg1) {
        if (class148.method2726(arg0)) {
            method2453(Statics.field2602[arg0], arg1);
        }
    }

    @ObfuscatedName("dy.cd([Lex;IB)V")
    public static final void method2453(class148[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class148 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2502 == 0) {
                    if (var3.field2601 != null) {
                        method2453(var3.field2601, arg1);
                    }
                    class4 var4 = (class4) field426.method3208((long) var3.field2493);
                    if (var4 != null) {
                        method3301(var4.field56, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2599 != null) {
                    class1 var5 = new class1();
                    var5.field4 = var3;
                    var5.field10 = var3.field2599;
                    class29.method1054(var5);
                }
                if (arg1 == 1 && var3.field2588 != null) {
                    if (var3.field2494 >= 0) {
                        class148 var6 = class148.method16(var3.field2493);
                        if (var6 == null || var6.field2601 == null || var3.field2494 >= var6.field2601.length || var6.field2601[var3.field2494] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field4 = var3;
                    var7.field10 = var3.field2588;
                    class29.method1054(var7);
                }
            }
        }
    }

    @ObfuscatedName("d.cs(Lex;III)V")
    public static final void method153(class148 arg0, int arg1, int arg2) {
        if (field437 != null || field333 || arg0 == null || method184(arg0) == null) {
            return;
        }
        field437 = arg0;
        field498 = method184(arg0);
        field439 = arg1;
        field440 = arg2;
        Statics.field232 = 0;
        field448 = false;
        if (field286 <= 0) {
            return;
        }
        int var3 = field286 - 1;
        Statics.field679 = new class25();
        Statics.field679.field638 = field409[var3];
        Statics.field679.field633 = field349[var3];
        Statics.field679.field634 = field411[var3];
        Statics.field679.field636 = field412[var3];
        Statics.field679.field637 = field413[var3];
    }

    @ObfuscatedName("cd.ch(III)V")
    public static void method1888(int arg0, int arg1) {
        method505(Statics.field679, arg0, arg1);
        Statics.field679 = null;
    }

    @ObfuscatedName("t.cc(Lex;B)V")
    public static void method32(class148 arg0) {
        if (field463 == arg0.field2556) {
            field469[arg0.field2600] = true;
        }
    }

    @ObfuscatedName("dp.ci(I)V")
    public static void method2476() {
        for (class4 var0 = (class4) field426.method3211(); var0 != null; var0 = (class4) field426.method3212()) {
            int var1 = var0.field56;
            if (class148.method2726(var1)) {
                boolean var2 = true;
                class148[] var3 = Statics.field2602[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2534;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2817;
                    class148 var6 = class148.method16(var5);
                    if (var6 != null) {
                        method32(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.cv(Lex;I)Lex;")
    public static class148 method184(class148 arg0) {
        class148 var1 = arg0;
        int var2 = class152.method994(method640(arg0));
        class148 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class148.method16(var1.field2504);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class148 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2496;
        }
        return var5;
    }

    @ObfuscatedName("dt.cb([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2362(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("client.cw(II)V")
    public static final void method492(int arg0) {
        if (!class148.method2726(arg0)) {
            return;
        }
        class148[] var1 = Statics.field2602[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class148 var3 = var1[var2];
            if (var3 != null) {
                var3.field2524 = 0;
                var3.field2501 = 0;
            }
        }
    }

    @ObfuscatedName("g.cr(II)V")
    public static final void method145(int arg0) {
        if (class148.method2726(arg0)) {
            method36(Statics.field2602[arg0], -1);
        }
    }

    @ObfuscatedName("e.cx([Lex;IB)V")
    public static final void method36(class148[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class148 var3 = arg0[var2];
            if (var3 != null && var3.field2504 == arg1 && (!var3.field2534 || !method140(var3))) {
                if (var3.field2502 == 0) {
                    if (!var3.field2534 && method140(var3) && Statics.field252 != var3) {
                        continue;
                    }
                    method36(arg0, var3.field2493);
                    if (var3.field2601 != null) {
                        method36(var3.field2601, var3.field2493);
                    }
                    class4 var4 = (class4) field426.method3208((long) var3.field2493);
                    if (var4 != null) {
                        method145(var4.field56);
                    }
                }
                if (var3.field2502 == 6) {
                    if (var3.field2589 != -1 || var3.field2555 != -1) {
                        boolean var5 = method1344(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2555;
                        } else {
                            var6 = var3.field2589;
                        }
                        if (var6 != -1) {
                            class35 var7 = class35.method2065(var6);
                            var3.field2501 += field339;
                            while (var3.field2501 > var7.field877[var3.field2524]) {
                                var3.field2501 -= var7.field877[var3.field2524];
                                var3.field2524++;
                                if (var3.field2524 >= var7.field876.length) {
                                    var3.field2524 -= var7.field885;
                                    if (var3.field2524 < 0 || var3.field2524 >= var7.field876.length) {
                                        var3.field2524 = 0;
                                    }
                                }
                                method32(var3);
                            }
                        }
                    }
                    if (var3.field2537 != 0 && !var3.field2534) {
                        int var8 = var3.field2537 >> 16;
                        int var9 = var3.field2537 << 16 >> 16;
                        int var10 = field339 * var8;
                        int var11 = field339 * var9;
                        var3.field2533 = var3.field2533 + var10 & 0x7FF;
                        var3.field2512 = var3.field2512 + var11 & 0x7FF;
                        method32(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.cn(Lex;I)V")
    public static final void method558(class148 arg0) {
        int var1 = arg0.field2612;
        if (var1 == 324) {
            if (field391 == -1) {
                field391 = arg0.field2572;
                field304 = arg0.field2518;
            }
            if (field524.field2638) {
                arg0.field2572 = field391;
            } else {
                arg0.field2572 = field304;
            }
        } else if (var1 == 325) {
            if (field391 == -1) {
                field391 = arg0.field2572;
                field304 = arg0.field2518;
            }
            if (field524.field2638) {
                arg0.field2572 = field304;
            } else {
                arg0.field2572 = field391;
            }
        } else if (var1 == 327) {
            arg0.field2533 = 150;
            arg0.field2512 = (int) (Math.sin((double) field270 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2525 = 5;
            arg0.field2526 = 0;
        } else if (var1 == 328) {
            arg0.field2533 = 150;
            arg0.field2512 = (int) (Math.sin((double) field270 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2525 = 5;
            arg0.field2526 = 1;
        }
    }

    @ObfuscatedName("u.cy(I)V")
    public static final void method30() {
        field340.method2376(142);
        for (class4 var0 = (class4) field426.method3211(); var0 != null; var0 = (class4) field426.method3212()) {
            if (var0.field50 == 0 || var0.field50 == 3) {
                method2443(var0, true);
            }
        }
        if (field429 != null) {
            method32(field429);
            field429 = null;
        }
    }

    @ObfuscatedName("ee.cq(IIIB)Lt;")
    public static final class4 method2723(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field56 = arg1;
        var3.field50 = arg2;
        field426.method3210(var3, (long) arg0);
        method492(arg1);
        class29.method2719(arg1);
        class148 var4 = class148.method16(arg0);
        if (var4 != null) {
            method32(var4);
        }
        if (field429 != null) {
            method32(field429);
            field429 = null;
        }
        method1600();
        if (field425 != -1) {
            method3301(field425, 1);
        }
        return var3;
    }

    @ObfuscatedName("dd.cg(Lt;ZI)V")
    public static final void method2443(class4 arg0, boolean arg1) {
        int var2 = arg0.field56;
        int var3 = (int) arg0.field2817;
        arg0.method3288();
        if (arg1 && var2 != -1 && Statics.field2485[var2]) {
            Statics.field2486.method2757(var2);
            if (Statics.field2602[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2602[var2].length; var5++) {
                    if (Statics.field2602[var2][var5] != null) {
                        if (Statics.field2602[var2][var5].field2502 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2602[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2602[var2] = null;
                }
                Statics.field2485[var2] = false;
            }
        }
        for (class172 var6 = (class172) field282.method3211(); var6 != null; var6 = (class172) field282.method3212()) {
            if ((var6.field2817 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3288();
            }
        }
        class148 var7 = class148.method16(var3);
        if (var7 != null) {
            method32(var7);
        }
        method1600();
        if (field425 != -1) {
            method3301(field425, 1);
        }
    }

    @ObfuscatedName("ax.ct(Lex;I)Z")
    public static final boolean method769(class148 arg0) {
        int var1 = arg0.field2612;
        if (var1 == 205) {
            field311 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field524.method2953(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field524.method2945(var4, var5 == 1);
        }
        if (var1 == 324) {
            field524.method2957(false);
        }
        if (var1 == 325) {
            field524.method2957(true);
        }
        if (var1 == 326) {
            field340.method2376(229);
            field524.method2947(field340);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dt.cu(IIII)V")
    public static final void method2367(int arg0, int arg1, int arg2) {
        method513();
        class70.method1515(arg0, arg1, Statics.field297.field1287 + arg0, Statics.field297.field1288 + arg1);
        if (field500 == 2 || field500 == 5) {
            class70.method1530(arg0 + 25, arg1 + 5, 0, Statics.field1862, Statics.field1737);
        } else {
            int var3 = field466 + field334 & 0x7FF;
            int var4 = Statics.field180.field717 / 32 + 48;
            int var5 = 464 - Statics.field180.field747 / 32;
            Statics.field606.method1448(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field451 + 256, Statics.field1862, Statics.field1737);
            for (int var6 = 0; var6 < field329; var6++) {
                int var7 = field364[var6] * 4 + 2 - Statics.field180.field717 / 32;
                int var8 = field415[var6] * 4 + 2 - Statics.field180.field747 / 32;
                method2369(arg0, arg1, var7, var8, field260[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class171 var11 = field473[Statics.field1][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field180.field717 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field180.field747 / 32;
                        method2369(arg0, arg1, var12, var13, Statics.field55[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field284; var14++) {
                class28 var15 = field325[field484[var14]];
                if (var15 != null && var15.method28()) {
                    class32 var16 = var15.field684;
                    if (var16 != null && var16.field802 != null) {
                        var16 = var16.method616();
                    }
                    if (var16 != null && var16.field793 && var16.field782) {
                        int var17 = var15.field717 / 32 - Statics.field180.field717 / 32;
                        int var18 = var15.field747 / 32 - Statics.field180.field747 / 32;
                        method2369(arg0, arg1, var17, var18, Statics.field55[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field385; var19++) {
                class3 var20 = field510[field386[var19]];
                if (var20 != null && var20.method28()) {
                    int var21 = var20.field717 / 32 - Statics.field180.field717 / 32;
                    int var22 = var20.field747 / 32 - Statics.field180.field747 / 32;
                    boolean var23 = false;
                    if (method139(var20.field36, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field1794; var25++) {
                        if (var20.field36.equals(Statics.field187[var25].field578)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field180.field38 != 0 && var20.field38 != 0 && Statics.field180.field38 == var20.field38) {
                        var26 = true;
                    }
                    if (var23) {
                        method2369(arg0, arg1, var21, var22, Statics.field55[3]);
                    } else if (var26) {
                        method2369(arg0, arg1, var21, var22, Statics.field55[4]);
                    } else if (var24) {
                        method2369(arg0, arg1, var21, var22, Statics.field55[5]);
                    } else {
                        method2369(arg0, arg1, var21, var22, Statics.field55[2]);
                    }
                }
            }
            if (field422 != 0 && field270 % 20 < 10) {
                if (field422 == 1 && field279 >= 0 && field279 < field325.length) {
                    class28 var27 = field325[field279];
                    if (var27 != null) {
                        int var28 = var27.field717 / 32 - Statics.field180.field717 / 32;
                        int var29 = var27.field747 / 32 - Statics.field180.field747 / 32;
                        method682(arg0, arg1, var28, var29, Statics.field1752[1]);
                    }
                }
                if (field422 == 2) {
                    int var30 = field281 * 4 - Statics.field1624 * 4 + 2 - Statics.field180.field717 / 32;
                    int var31 = field420 * 4 - Statics.field945 * 4 + 2 - Statics.field180.field747 / 32;
                    method682(arg0, arg1, var30, var31, Statics.field1752[1]);
                }
                if (field422 == 10 && field280 >= 0 && field280 < field510.length) {
                    class3 var32 = field510[field280];
                    if (var32 != null) {
                        int var33 = var32.field717 / 32 - Statics.field180.field717 / 32;
                        int var34 = var32.field747 / 32 - Statics.field180.field747 / 32;
                        method682(arg0, arg1, var33, var34, Statics.field1752[1]);
                    }
                }
            }
            if (field406 != 0) {
                int var35 = field406 * 4 + 2 - Statics.field180.field717 / 32;
                int var36 = field367 * 4 + 2 - Statics.field180.field747 / 32;
                method2369(arg0, arg1, var35, var36, Statics.field1752[0]);
            }
            class70.method1521(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field500 < 3) {
            Statics.field1974.method1448(arg0, arg1, 33, 33, 25, 25, field466, 256, Statics.field2114, Statics.field248);
        } else {
            class70.method1530(arg0, arg1, 0, Statics.field2114, Statics.field248);
        }
        if (field395[arg2]) {
            Statics.field297.method1583(arg0, arg1);
        }
        field470[arg2] = true;
    }

    @ObfuscatedName("ar.cf(IIIILbb;I)V")
    public static final void method682(int arg0, int arg1, int arg2, int arg3, class69 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method2369(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field466 + field334 & 0x7FF;
        int var7 = class81.field1425[var6];
        int var8 = class81.field1446[var6];
        int var9 = var7 * 256 / (field451 + 256);
        int var10 = var8 * 256 / (field451 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1086.method1497(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("dt.cm(IIIILbb;I)V")
    public static final void method2369(int arg0, int arg1, int arg2, int arg3, class69 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field466 + field334 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class81.field1425[var5];
        int var8 = class81.field1446[var5];
        int var9 = var7 * 256 / (field451 + 256);
        int var10 = var8 * 256 / (field451 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1452(Statics.field297, arg0 + 94 + var11 - arg4.field1271 / 2 + 4, arg1 + 83 - var12 - arg4.field1272 / 2 - 4);
        } else {
            arg4.method1500(arg0 + 94 + var11 - arg4.field1271 / 2 + 4, arg1 + 83 - var12 - arg4.field1272 / 2 - 4);
        }
    }

    @ObfuscatedName("p.cj(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method555(int arg0, String arg1, String arg2) {
        method2687(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ez.dc(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method2687(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field477[var4] = field477[var4 - 1];
            field478[var4] = field478[var4 - 1];
            field480[var4] = field480[var4 - 1];
            field382[var4] = field382[var4 - 1];
        }
        field477[0] = arg0;
        field478[0] = arg1;
        field480[0] = arg2;
        field382[0] = arg3;
        field433++;
        field456 = field449;
    }

    @ObfuscatedName("k.dt(Ljava/lang/String;ZI)Z")
    public static boolean method139(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class190.method582(arg0, Statics.field263);
        for (int var3 = 0; var3 < field518; var3++) {
            if (var2.equalsIgnoreCase(class190.method582(field520[var3].field225, Statics.field263)) && (!arg1 || field520[var3].field226 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class190.method582(Statics.field180.field36, Statics.field263))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cr.dm(Ljava/lang/String;I)Z")
    public static boolean method1986(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class190.method582(arg0, Statics.field263);
        for (int var2 = 0; var2 < field362; var2++) {
            class8 var3 = field523[var2];
            if (var1.equalsIgnoreCase(class190.method582(var3.field140, Statics.field263))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class190.method582(var3.field136, Statics.field263))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ci.dq(Ljava/lang/String;B)V")
    public static final void method1893(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field518 < 200 || field303 == 1) || field518 >= 400) {
            method555(30, "", class139.field2280);
            return;
        }
        String var1 = class190.method582(arg0, Statics.field263);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field518; var2++) {
            class15 var3 = field520[var2];
            String var4 = class190.method582(var3.field225, Statics.field263);
            if (var4 != null && var4.equals(var1)) {
                method555(30, "", arg0 + class139.field2143);
                return;
            }
            if (var3.field223 != null) {
                String var5 = class190.method582(var3.field223, Statics.field263);
                if (var5 != null && var5.equals(var1)) {
                    method555(30, "", arg0 + class139.field2143);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field362; var6++) {
            class8 var7 = field523[var6];
            String var8 = class190.method582(var7.field140, Statics.field263);
            if (var8 != null && var8.equals(var1)) {
                method555(30, "", class139.field2289 + arg0 + class139.field2163);
                return;
            }
            if (var7.field136 != null) {
                String var9 = class190.method582(var7.field136, Statics.field263);
                if (var9 != null && var9.equals(var1)) {
                    method555(30, "", class139.field2289 + arg0 + class139.field2163);
                    return;
                }
            }
        }
        if (class190.method582(Statics.field180.field36, Statics.field263).equals(var1)) {
            method555(30, "", class139.field2287);
            return;
        }
        field340.method2376(177);
        class107 var10 = field340;
        int var11 = arg0.length() + 1;
        var10.method2113(var11);
        field340.method2118(arg0);
    }

    @ObfuscatedName("eb.dv(Ljava/lang/String;IS)V")
    public static final void method2707(String arg0, int arg1) {
        field340.method2376(74);
        class107 var2 = field340;
        int var3 = arg0.length() + 1;
        var2.method2113(var3 + 1);
        field340.method2118(arg0);
        field340.method2323(arg1);
    }

    @ObfuscatedName("be.dh(Ljava/lang/String;I)V")
    public static final void method1598(String arg0) {
        if (arg0.equals("")) {
            return;
        }
        field340.method2376(253);
        class107 var1 = field340;
        int var2 = arg0.length() + 1;
        var1.method2113(var2);
        field340.method2118(arg0);
    }

    @ObfuscatedName("as.dd(Lex;B)I")
    public static int method640(class148 arg0) {
        class172 var1 = (class172) field282.method3208(((long) arg0.field2493 << 32) + (long) arg0.field2494);
        return var1 == null ? arg0.field2552 : var1.field2811;
    }

    @ObfuscatedName("k.ds(Lex;I)Z")
    public static boolean method140(class148 arg0) {
        if (field435) {
            if (method640(arg0) != 0) {
                return false;
            }
            if (arg0.field2502 == 0) {
                return false;
            }
        }
        return arg0.field2505;
    }

    @ObfuscatedName("an.do(Lex;II)Ljava/lang/String;")
    public static String method703(class148 arg0, int arg1) {
        int var2 = method640(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2580 == null) {
            return null;
        } else if (arg0.field2492 == null || arg0.field2492.length <= arg1 || arg0.field2492[arg1] == null || arg0.field2492[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2492[arg1];
        }
    }

    @ObfuscatedName("e.dy(Lex;I)Ljava/lang/String;")
    public static String method41(class148 arg0) {
        int var1 = method640(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2559 == null || arg0.field2559.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2559;
        }
    }
}

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

    @ObfuscatedName("client.g")
    public static boolean field248 = true;

    @ObfuscatedName("client.r")
    public static int field249 = 1;

    @ObfuscatedName("client.i")
    public static int field250 = 0;

    @ObfuscatedName("client.a")
    public static int field371 = 0;

    @ObfuscatedName("client.w")
    public static class187[] field307 = new class187[4];

    @ObfuscatedName("client.t")
    public static boolean field254 = false;

    @ObfuscatedName("client.j")
    public static boolean field458 = false;

    @ObfuscatedName("client.q")
    public static int field256 = 0;

    @ObfuscatedName("client.v")
    public static int field257 = 0;

    @ObfuscatedName("client.n")
    public static boolean field258 = true;

    @ObfuscatedName("client.l")
    public static int field463 = 0;

    @ObfuscatedName("client.c")
    public static long field260 = 1L;

    @ObfuscatedName("client.s")
    public static int field261 = -1;

    @ObfuscatedName("client.o")
    public static int field431 = -1;

    @ObfuscatedName("client.h")
    public static int field263 = -1;

    @ObfuscatedName("client.e")
    public static boolean field264 = true;

    @ObfuscatedName("client.z")
    public static boolean field265 = false;

    @ObfuscatedName("client.az")
    public static int field266 = 0;

    @ObfuscatedName("client.av")
    public static int field267 = 0;

    @ObfuscatedName("client.ay")
    public static int field268 = 0;

    @ObfuscatedName("client.ah")
    public static int field269 = 0;

    @ObfuscatedName("client.ao")
    public static int field270 = 0;

    @ObfuscatedName("client.aj")
    public static int field271 = 0;

    @ObfuscatedName("client.ad")
    public static int field415 = 0;

    @ObfuscatedName("client.ai")
    public static int field414 = 0;

    @ObfuscatedName("client.af")
    public static int field274 = 0;

    @ObfuscatedName("client.am")
    public static class104 field275 = new class104(new byte[5000]);

    @ObfuscatedName("client.an")
    public static class17 field440 = class17.field516;

    @ObfuscatedName("client.aa")
    public static int field433 = 0;

    @ObfuscatedName("client.ap")
    public static int field450 = 0;

    @ObfuscatedName("client.ac")
    public static int field279 = 0;

    @ObfuscatedName("client.bp")
    public static int field281 = 0;

    @ObfuscatedName("client.bo")
    public static int field282 = 0;

    @ObfuscatedName("client.be")
    public static int field283 = 0;

    @ObfuscatedName("client.bj")
    public static int field411 = 0;

    @ObfuscatedName("client.bx")
    public static int field342 = 0;

    @ObfuscatedName("client.by")
    public static class28[] field410 = new class28[32768];

    @ObfuscatedName("client.bl")
    public static int field287 = 0;

    @ObfuscatedName("client.bn")
    public static int[] field288 = new int[32768];

    @ObfuscatedName("client.cp")
    public static class107 field289 = new class107(5000);

    @ObfuscatedName("client.cg")
    public static class107 field290 = new class107(5000);

    @ObfuscatedName("client.cd")
    public static class107 field291 = new class107(5000);

    @ObfuscatedName("client.ch")
    public static int field292 = 0;

    @ObfuscatedName("client.cs")
    public static int field319 = 0;

    @ObfuscatedName("client.cj")
    public static int field294 = 0;

    @ObfuscatedName("client.cm")
    public static int field295 = 0;

    @ObfuscatedName("client.cr")
    public static int field259 = 0;

    @ObfuscatedName("client.ck")
    public static int field485 = 0;

    @ObfuscatedName("client.co")
    public static int field298 = 0;

    @ObfuscatedName("client.ct")
    public static int field299 = 0;

    @ObfuscatedName("client.ca")
    public static boolean field300 = false;

    @ObfuscatedName("client.cy")
    public static int field301 = 0;

    @ObfuscatedName("client.cb")
    public static int field364 = 0;

    @ObfuscatedName("client.da")
    public static int field351 = 1;

    @ObfuscatedName("client.di")
    public static int field304 = 0;

    @ObfuscatedName("client.dj")
    public static int field305 = 1;

    @ObfuscatedName("client.db")
    public static int field337 = 0;

    @ObfuscatedName("client.dt")
    public static boolean field310 = false;

    @ObfuscatedName("client.dz")
    public static int[][][] field309 = new int[4][13][13];

    @ObfuscatedName("client.do")
    public static final int[] field397 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dg")
    public static int field311 = 0;

    @ObfuscatedName("client.dr")
    public static int field404 = 2;

    @ObfuscatedName("client.dy")
    public static int field313 = 0;

    @ObfuscatedName("client.dh")
    public static int field314 = 2;

    @ObfuscatedName("client.de")
    public static int field315 = 0;

    @ObfuscatedName("client.dd")
    public static int field316 = 1;

    @ObfuscatedName("client.dc")
    public static int field482 = 0;

    @ObfuscatedName("client.dq")
    public static int field445 = 0;

    @ObfuscatedName("client.du")
    public static int field393 = 2;

    @ObfuscatedName("client.dm")
    public static int field320 = 0;

    @ObfuscatedName("client.el")
    public static int field335 = 1;

    @ObfuscatedName("client.ev")
    public static int field322 = 0;

    @ObfuscatedName("client.ex")
    public static int field323 = 0;

    @ObfuscatedName("client.eg")
    public static int field324 = 2301979;

    @ObfuscatedName("client.em")
    public static int field325 = 5063219;

    @ObfuscatedName("client.eq")
    public static int field326 = 3353893;

    @ObfuscatedName("client.ej")
    public static int field497 = 7759444;

    @ObfuscatedName("client.ef")
    public static boolean field328 = false;

    @ObfuscatedName("client.ff")
    public static int field329 = 0;

    @ObfuscatedName("client.fh")
    public static int field330 = 128;

    @ObfuscatedName("client.fm")
    public static int field306 = 0;

    @ObfuscatedName("client.fb")
    public static int field262 = 0;

    @ObfuscatedName("client.fx")
    public static int field333 = 0;

    @ObfuscatedName("client.fl")
    public static int field510 = 0;

    @ObfuscatedName("client.fu")
    public static int field508 = 0;

    @ObfuscatedName("client.fj")
    public static int field334 = 0;

    @ObfuscatedName("client.fy")
    public static boolean field308 = false;

    @ObfuscatedName("client.fk")
    public static int field338 = 0;

    @ObfuscatedName("client.fw")
    public static int field339 = 0;

    @ObfuscatedName("client.fr")
    public static int field340 = 50;

    @ObfuscatedName("client.fv")
    public static int[] field360 = new int[field340];

    @ObfuscatedName("client.fe")
    public static int[] field286 = new int[field340];

    @ObfuscatedName("client.fc")
    public static int[] field343 = new int[field340];

    @ObfuscatedName("client.fs")
    public static int[] field344 = new int[field340];

    @ObfuscatedName("client.fz")
    public static int[] field345 = new int[field340];

    @ObfuscatedName("client.fg")
    public static int[] field346 = new int[field340];

    @ObfuscatedName("client.fp")
    public static int[] field494 = new int[field340];

    @ObfuscatedName("client.gj")
    public static String[] field348 = new String[field340];

    @ObfuscatedName("client.ge")
    public static int[][] field349 = new int[104][104];

    @ObfuscatedName("client.gp")
    public static int field354 = 0;

    @ObfuscatedName("client.gy")
    public static int field327 = -1;

    @ObfuscatedName("client.gk")
    public static int field347 = -1;

    @ObfuscatedName("client.gw")
    public static int field434 = 0;

    @ObfuscatedName("client.gv")
    public static int field278 = 0;

    @ObfuscatedName("client.ga")
    public static int field303 = 0;

    @ObfuscatedName("client.gu")
    public static int field356 = 0;

    @ObfuscatedName("client.gn")
    public static int field357 = 0;

    @ObfuscatedName("client.gm")
    public static int field358 = 0;

    @ObfuscatedName("client.gg")
    public static int field359 = 0;

    @ObfuscatedName("client.gi")
    public static int field284 = 0;

    @ObfuscatedName("client.gc")
    public static int field285 = 0;

    @ObfuscatedName("client.gx")
    public static int field362 = 0;

    @ObfuscatedName("client.gb")
    public static boolean field336 = false;

    @ObfuscatedName("client.gl")
    public static int field352 = 0;

    @ObfuscatedName("client.gs")
    public static int field255 = 0;

    @ObfuscatedName("client.gt")
    public static class3[] field366 = new class3[2048];

    @ObfuscatedName("client.gh")
    public static int field367 = 0;

    @ObfuscatedName("client.gq")
    public static int[] field368 = new int[2048];

    @ObfuscatedName("client.ho")
    public static int field407 = 0;

    @ObfuscatedName("client.ht")
    public static int[] field454 = new int[2048];

    @ObfuscatedName("client.hw")
    public static class104[] field280 = new class104[2048];

    @ObfuscatedName("client.hd")
    public static int field372 = -1;

    @ObfuscatedName("client.hs")
    public static int field373 = 0;

    @ObfuscatedName("client.hi")
    public static int field374 = 0;

    @ObfuscatedName("client.hb")
    public static int[] field375 = new int[1000];

    @ObfuscatedName("client.hg")
    public static final int[] field293 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hj")
    public static String[] field398 = new String[8];

    @ObfuscatedName("client.hp")
    public static boolean[] field378 = new boolean[8];

    @ObfuscatedName("client.hm")
    public static int[] field379 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hl")
    public static int field380 = -1;

    @ObfuscatedName("client.ha")
    public static class171[][][] field381 = new class171[4][104][104];

    @ObfuscatedName("client.hr")
    public static class171 field382 = new class171();

    @ObfuscatedName("client.hc")
    public static class171 field383 = new class171();

    @ObfuscatedName("client.hu")
    public static class171 field384 = new class171();

    @ObfuscatedName("client.hz")
    public static int[] field385 = new int[25];

    @ObfuscatedName("client.hk")
    public static int[] field386 = new int[25];

    @ObfuscatedName("client.hn")
    public static int[] field387 = new int[25];

    @ObfuscatedName("client.hh")
    public static int field388 = 0;

    @ObfuscatedName("client.hx")
    public static boolean field389 = false;

    @ObfuscatedName("client.ie")
    public static int field390 = 0;

    @ObfuscatedName("client.iw")
    public static int[] field493 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field392 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field246 = new int[500];

    @ObfuscatedName("client.ig")
    public static int[] field394 = new int[500];

    @ObfuscatedName("client.iv")
    public static String[] field395 = new String[500];

    @ObfuscatedName("client.im")
    public static String[] field321 = new String[500];

    @ObfuscatedName("client.ib")
    public static int field353 = -1;

    @ObfuscatedName("client.iu")
    public static int field436 = -1;

    @ObfuscatedName("client.ir")
    public static int field399 = 0;

    @ObfuscatedName("client.ik")
    public static int field400 = 50;

    @ObfuscatedName("client.iy")
    public static int field401 = 0;

    @ObfuscatedName("client.it")
    public static String field402 = null;

    @ObfuscatedName("client.is")
    public static boolean field403 = false;

    @ObfuscatedName("client.if")
    public static int field370 = -1;

    @ObfuscatedName("client.ju")
    public static String field296 = null;

    @ObfuscatedName("client.je")
    public static String field488 = null;

    @ObfuscatedName("client.jf")
    public static int field361 = -1;

    @ObfuscatedName("client.jo")
    public static class169 field408 = new class169(8);

    @ObfuscatedName("client.jm")
    public static int field331 = 0;

    @ObfuscatedName("client.ja")
    public static int field471 = 0;

    @ObfuscatedName("client.jq")
    public static class148 field446 = null;

    @ObfuscatedName("client.jx")
    public static int field412 = 0;

    @ObfuscatedName("client.jg")
    public static int field413 = 0;

    @ObfuscatedName("client.jp")
    public static int field470 = 0;

    @ObfuscatedName("client.jk")
    public static int field365 = -1;

    @ObfuscatedName("client.jn")
    public static boolean field416 = false;

    @ObfuscatedName("client.jl")
    public static boolean field406 = false;

    @ObfuscatedName("client.jj")
    public static boolean field484 = false;

    @ObfuscatedName("client.jr")
    public static class148 field419 = null;

    @ObfuscatedName("client.js")
    public static class148 field420 = null;

    @ObfuscatedName("client.jc")
    public static int field448 = 0;

    @ObfuscatedName("client.jy")
    public static int field422 = 0;

    @ObfuscatedName("client.jb")
    public static class148 field423 = null;

    @ObfuscatedName("client.jh")
    public static boolean field424 = false;

    @ObfuscatedName("client.jz")
    public static int field425 = -1;

    @ObfuscatedName("client.jw")
    public static int field426 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field427 = false;

    @ObfuscatedName("client.jt")
    public static int field428 = -1;

    @ObfuscatedName("client.jv")
    public static int field429 = -1;

    @ObfuscatedName("client.ji")
    public static boolean field430 = false;

    @ObfuscatedName("client.kx")
    public static int field318 = 1;

    @ObfuscatedName("client.kw")
    public static int[] field451 = new int[32];

    @ObfuscatedName("client.kg")
    public static int field443 = 0;

    @ObfuscatedName("client.ka")
    public static int[] field487 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field435 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field297 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field437 = 0;

    @ObfuscatedName("client.kr")
    public static int field438 = 0;

    @ObfuscatedName("client.kc")
    public static int field439 = 0;

    @ObfuscatedName("client.kk")
    public static int field363 = 0;

    @ObfuscatedName("client.kz")
    public static int field441 = 0;

    @ObfuscatedName("client.ki")
    public static int[] field452 = new int[2000];

    @ObfuscatedName("client.km")
    public static String[] field376 = new String[1000];

    @ObfuscatedName("client.ke")
    public static int field444 = 0;

    @ObfuscatedName("client.kf")
    public static class171 field341 = new class171();

    @ObfuscatedName("client.ks")
    public static class171 field391 = new class171();

    @ObfuscatedName("client.ko")
    public static class171 field447 = new class171();

    @ObfuscatedName("client.kl")
    public static class169 field272 = new class169(512);

    @ObfuscatedName("client.ll")
    public static int field449 = 0;

    @ObfuscatedName("client.ls")
    public static int field276 = -2;

    @ObfuscatedName("client.lx")
    public static boolean[] field499 = new boolean[100];

    @ObfuscatedName("client.lz")
    public static boolean[] field473 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static boolean[] field453 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static int[] field500 = new int[100];

    @ObfuscatedName("client.lu")
    public static int[] field455 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field417 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field457 = new int[100];

    @ObfuscatedName("client.lm")
    public static int field332 = 0;

    @ObfuscatedName("client.le")
    public static int[] field459 = new int[100];

    @ObfuscatedName("client.lg")
    public static String[] field460 = new String[100];

    @ObfuscatedName("client.lq")
    public static String[] field461 = new String[100];

    @ObfuscatedName("client.ld")
    public static String[] field456 = new String[100];

    @ObfuscatedName("client.lv")
    public static int field432 = 0;

    @ObfuscatedName("client.lw")
    public static int[] field464 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lb")
    public static int field465 = 0;

    @ObfuscatedName("client.lr")
    public static int field466 = 0;

    @ObfuscatedName("client.ln")
    public static long[] field467 = new long[100];

    @ObfuscatedName("client.lh")
    public static int field468 = 0;

    @ObfuscatedName("client.lc")
    public static int field277 = 0;

    @ObfuscatedName("client.lj")
    public static int[] field252 = new int[128];

    @ObfuscatedName("client.mt")
    public static int[] field355 = new int[128];

    @ObfuscatedName("client.mp")
    public static long field472 = -1L;

    @ObfuscatedName("client.mk")
    public static String field350 = null;

    @ObfuscatedName("client.mj")
    public static String field474 = null;

    @ObfuscatedName("client.mf")
    public static int field475 = -1;

    @ObfuscatedName("client.ml")
    public static int field476 = 0;

    @ObfuscatedName("client.mr")
    public static int[] field477 = new int[1000];

    @ObfuscatedName("client.mh")
    public static int[] field478 = new int[1000];

    @ObfuscatedName("client.mi")
    public static class69[] field479 = new class69[1000];

    @ObfuscatedName("client.mz")
    public static int field480 = 0;

    @ObfuscatedName("client.md")
    public static int field481 = 0;

    @ObfuscatedName("client.ma")
    public static int field273 = 0;

    @ObfuscatedName("client.me")
    public static int field483 = 255;

    @ObfuscatedName("client.mn")
    public static int field312 = -1;

    @ObfuscatedName("client.mb")
    public static boolean field421 = false;

    @ObfuscatedName("client.nh")
    public static int field486 = 127;

    @ObfuscatedName("client.nj")
    public static int field302 = 127;

    @ObfuscatedName("client.no")
    public static int field377 = 0;

    @ObfuscatedName("client.nx")
    public static int[] field489 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field490 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field317 = new int[50];

    @ObfuscatedName("client.ny")
    public static int[] field492 = new int[50];

    @ObfuscatedName("client.nk")
    public static class49[] field405 = new class49[50];

    @ObfuscatedName("client.nq")
    public static boolean field442 = false;

    @ObfuscatedName("client.nc")
    public static boolean[] field495 = new boolean[5];

    @ObfuscatedName("client.ov")
    public static int[] field496 = new int[5];

    @ObfuscatedName("client.oz")
    public static int[] field409 = new int[5];

    @ObfuscatedName("client.ol")
    public static int[] field498 = new int[5];

    @ObfuscatedName("client.oj")
    public static int[] field396 = new int[5];

    @ObfuscatedName("client.of")
    public static int field491 = 0;

    @ObfuscatedName("client.oo")
    public static int field501 = 0;

    @ObfuscatedName("client.op")
    public static class15[] field502 = new class15[400];

    @ObfuscatedName("client.os")
    public static class168 field503 = new class168();

    @ObfuscatedName("client.od")
    public static int field504 = 0;

    @ObfuscatedName("client.og")
    public static class8[] field505 = new class8[400];

    @ObfuscatedName("client.ob")
    public static class153 field506 = new class153();

    @ObfuscatedName("client.oe")
    public static int field507 = -1;

    @ObfuscatedName("client.ox")
    public static int field369 = -1;

    @ObfuscatedName("client.y(I)V")
    public final void method386() {
    }

    public final void init() {
        if (!this.method2582()) {
            return;
        }
        class164[] var1 = class164.method578();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2777);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2777)) {
                    case 1:
                        field256 = Integer.parseInt(var4);
                    case 2:
                    default:
                        break;
                    case 3:
                        field249 = Integer.parseInt(var4);
                        break;
                    case 4:
                        class136[] var5 = new class136[] { class136.field2094, class136.field2093, class136.field2095, class136.field2090, class136.field2096, class136.field2092 };
                        Statics.field253 = (class136) class96.method1(var5, Integer.parseInt(var4));
                        if (Statics.field253 == class136.field2094) {
                            Statics.field184 = class180.field2834;
                        } else {
                            Statics.field184 = class180.field2829;
                        }
                        break;
                    case 5:
                        if (var4.equalsIgnoreCase(class2.field20)) {
                            field254 = true;
                        } else {
                            field254 = false;
                        }
                        break;
                    case 6:
                        field371 = Integer.parseInt(var4);
                        break;
                    case 7:
                        Statics.field251 = class135.method1584(Integer.parseInt(var4));
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class2.field20)) {
                        }
                        break;
                    case 9:
                        field250 = Integer.parseInt(var4);
                        break;
                    case 10:
                        Statics.field1856 = var4;
                }
            }
        }
        method2427();
        Statics.field853 = this.getCodeBase().getHost();
        String var6 = Statics.field251.field2085;
        byte var7 = 0;
        try {
            Statics.field2061 = 16;
            Statics.field2065 = var7;
            try {
                Statics.field2070 = System.getProperty("os.name");
            } catch (Exception var53) {
                Statics.field2070 = "Unknown";
            }
            Statics.field1486 = Statics.field2070.toLowerCase();
            try {
                Statics.field1912 = System.getProperty("user.home");
                if (Statics.field1912 != null) {
                    Statics.field1912 = Statics.field1912 + "/";
                }
            } catch (Exception var52) {
            }
            try {
                if (Statics.field1486.startsWith("win")) {
                    if (Statics.field1912 == null) {
                        Statics.field1912 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1912 == null) {
                    Statics.field1912 = System.getenv("HOME");
                }
                if (Statics.field1912 != null) {
                    Statics.field1912 = Statics.field1912 + "/";
                }
            } catch (Exception var51) {
            }
            if (Statics.field1912 == null) {
                Statics.field1912 = "~/";
            }
            Statics.field1855 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1912, "/tmp/", "" };
            Statics.field2066 = new String[] { ".jagex_cache_" + Statics.field2065, ".file_store_" + Statics.field2065 };
            int var11 = 0;
            label281: while (var11 < 4) {
                String var12 = var11 == 0 ? "" : "" + var11;
                Statics.field2058 = new File(Statics.field1912, "jagex_cl_oldschool_" + var6 + var12 + ".dat");
                String var13 = null;
                String var14 = null;
                boolean var15 = false;
                if (Statics.field2058.exists()) {
                    try {
                        class185 var16 = new class185(Statics.field2058, "rw", 10000L);
                        class104 var17 = new class104((int) var16.method3355());
                        while (var17.field1806 < var17.field1808.length) {
                            int var18 = var16.method3353(var17.field1808, var17.field1806, var17.field1808.length - var17.field1806);
                            if (var18 == -1) {
                                throw new IOException();
                            }
                            var17.field1806 += var18;
                        }
                        var17.field1806 = 0;
                        int var19 = var17.method2190();
                        if (var19 < 1 || var19 > 3) {
                            throw new IOException("" + var19);
                        }
                        int var20 = 0;
                        if (var19 > 1) {
                            var20 = var17.method2190();
                        }
                        if (var19 <= 2) {
                            var13 = var17.method2157();
                            if (var20 == 1) {
                                var14 = var17.method2157();
                            }
                        } else {
                            var13 = var17.method2140();
                            if (var20 == 1) {
                                var14 = var17.method2140();
                            }
                        }
                        var16.method3351();
                    } catch (IOException var56) {
                        var56.printStackTrace();
                    }
                    if (var13 != null) {
                        File var22 = new File(var13);
                        if (!var22.exists()) {
                            var13 = null;
                        }
                    }
                    if (var13 != null) {
                        File var23 = new File(var13, "test.dat");
                        if (!class133.method2426(var23, true)) {
                            var13 = null;
                        }
                    }
                }
                if (var13 == null && var11 == 0) {
                    label256: for (int var24 = 0; var24 < Statics.field2066.length; var24++) {
                        for (int var25 = 0; var25 < Statics.field1855.length; var25++) {
                            File var26 = new File(Statics.field1855[var25] + Statics.field2066[var24] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var26.exists() && class133.method2426(new File(var26, "test.dat"), true)) {
                                var13 = var26.toString();
                                var15 = true;
                                break label256;
                            }
                        }
                    }
                }
                if (var13 == null) {
                    var13 = Statics.field1912 + File.separatorChar + "jagexcache" + var12 + File.separatorChar + "oldschool" + File.separatorChar + var6 + File.separatorChar;
                    var15 = true;
                }
                if (var14 != null) {
                    File var27 = new File(var14);
                    File var28 = new File(var13);
                    try {
                        File[] var29 = var27.listFiles();
                        File[] var30 = var29;
                        for (int var31 = 0; var31 < var30.length; var31++) {
                            File var32 = var30[var31];
                            File var33 = new File(var28, var32.getName());
                            boolean var34 = var32.renameTo(var33);
                            if (!var34) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var55) {
                        var55.printStackTrace();
                    }
                    var15 = true;
                }
                if (var15) {
                    class133.method2392(new File(var13), (File) null);
                }
                File var36 = new File(var13);
                Statics.field2057 = var36;
                if (!Statics.field2057.exists()) {
                    Statics.field2057.mkdirs();
                }
                File[] var37 = Statics.field2057.listFiles();
                if (var37 != null) {
                    File[] var38 = var37;
                    for (int var39 = 0; var39 < var38.length; var39++) {
                        File var40 = var38[var39];
                        if (!class133.method2426(var40, false)) {
                            var11++;
                            continue label281;
                        }
                    }
                }
                break;
            }
            File var41 = Statics.field2057;
            Statics.field1894 = var41;
            if (!Statics.field1894.exists()) {
                throw new RuntimeException("");
            }
            class119.field1898 = true;
            try {
                File var42 = new File(Statics.field1912, "random.dat");
                if (var42.exists()) {
                    class133.field2071 = new class186(new class185(var42, "rw", 25L), 24, 0);
                } else {
                    label205: for (int var43 = 0; var43 < Statics.field2066.length; var43++) {
                        for (int var44 = 0; var44 < Statics.field1855.length; var44++) {
                            File var45 = new File(Statics.field1855[var44] + Statics.field2066[var43] + File.separatorChar + "random.dat");
                            if (var45.exists()) {
                                class133.field2071 = new class186(new class185(var45, "rw", 25L), 24, 0);
                                break label205;
                            }
                        }
                    }
                }
                if (class133.field2071 == null) {
                    RandomAccessFile var46 = new RandomAccessFile(var42, "rw");
                    int var47 = var46.read();
                    var46.seek(0L);
                    var46.write(var47);
                    var46.seek(0L);
                    var46.close();
                    class133.field2071 = new class186(new class185(var42, "rw", 25L), 24, 0);
                }
            } catch (IOException var54) {
            }
            class133.field2063 = new class186(new class185(class119.method133("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class133.field2064 = new class186(new class185(class119.method133("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field583 = new class186[Statics.field2061];
            for (int var49 = 0; var49 < Statics.field2061; var49++) {
                Statics.field583[var49] = new class186(new class185(class119.method133("main_file_cache.idx" + var49), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var57) {
            class132.method130((String) null, var57);
        }
        Statics.field247 = this;
        this.method2580(765, 503, 46);
    }

    @ObfuscatedName("dp.r(I)V")
    public static final void method2427() {
        class76.field1376 = false;
        field458 = false;
    }

    @ObfuscatedName("client.i(I)V")
    public final void method173() {
        Statics.field1643 = field371 == 0 ? 43594 : field249 + 40000;
        Statics.field865 = field371 == 0 ? 443 : field249 + 50000;
        Statics.field528 = Statics.field1643;
        Statics.field1843 = class149.field2599;
        Statics.field1239 = class149.field2597;
        Statics.field1631 = class149.field2595;
        Statics.field2081 = class149.field2598;
        if (Statics.field1901.toLowerCase().indexOf("microsoft") == -1) {
            class121.field1941[44] = 71;
            class121.field1941[45] = 26;
            class121.field1941[46] = 72;
            class121.field1941[47] = 73;
            class121.field1941[59] = 57;
            class121.field1941[61] = 27;
            class121.field1941[91] = 42;
            class121.field1941[92] = 74;
            class121.field1941[93] = 43;
            class121.field1941[192] = 28;
            class121.field1941[222] = 58;
            class121.field1941[520] = 59;
        } else {
            class121.field1941[186] = 57;
            class121.field1941[187] = 27;
            class121.field1941[188] = 71;
            class121.field1941[189] = 26;
            class121.field1941[190] = 72;
            class121.field1941[191] = 73;
            class121.field1941[192] = 58;
            class121.field1941[219] = 42;
            class121.field1941[220] = 74;
            class121.field1941[221] = 43;
            class121.field1941[222] = 59;
            class121.field1941[223] = 28;
        }
        Canvas var1 = Statics.field591;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class121.field1919);
        var1.addFocusListener(class121.field1919);
        Canvas var2 = Statics.field591;
        var2.addMouseListener(class124.field1964);
        var2.addMouseMotionListener(class124.field1964);
        var2.addFocusListener(class124.field1964);
        Statics.field1944 = Statics.method1758();
        if (Statics.field1944 != null) {
            Statics.field1944.method2430(Statics.field591);
        }
        Statics.field1992 = new class118(255, class133.field2063, class133.field2064, 500000);
        Statics.field1858 = class9.method2438();
        Statics.field551 = this.getToolkit().getSystemClipboard();
        class122.method33(this, Statics.field1847);
        if (field371 != 0) {
            field265 = true;
        }
    }

    @ObfuscatedName("client.f(I)V")
    public final void method174() {
        field463++;
        this.method177();
        class145.method2679();
        try {
            if (class157.field2660 == 1) {
                int var1 = Statics.field2665.method3081();
                if (var1 > 0 && Statics.field2665.method3049()) {
                    int var2 = var1 - Statics.field2056;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2665.method3010(var2);
                } else {
                    Statics.field2665.method3016();
                    Statics.field2665.method3109();
                    if (Statics.field183 == null) {
                        class157.field2660 = 0;
                    } else {
                        class157.field2660 = 2;
                    }
                    Statics.field2907 = null;
                    Statics.field668 = null;
                }
            }
        } catch (Exception var13) {
            var13.printStackTrace();
            Statics.field2665.method3016();
            class157.field2660 = 0;
            Statics.field2907 = null;
            Statics.field668 = null;
            Statics.field183 = null;
        }
        method2371();
        class121 var4 = class121.field1919;
        synchronized (class121.field1919) {
            class121.field1940++;
            class121.field1937 = class121.field1934;
            class121.field1936 = 0;
            if (class121.field1945 >= 0) {
                while (class121.field1945 != class121.field1931) {
                    int var6 = class121.field1924[class121.field1931];
                    class121.field1931 = class121.field1931 + 1 & 0x7F;
                    if (var6 < 0) {
                        class121.field1929[~var6] = false;
                    } else {
                        if (!class121.field1929[var6] && class121.field1936 < class121.field1935.length - 1) {
                            class121.field1935[++class121.field1936 - 1] = var6;
                        }
                        class121.field1929[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class121.field1929[var5] = false;
                }
                class121.field1945 = class121.field1931;
            }
            class121.field1934 = class121.field1948;
        }
        class124 var8 = class124.field1964;
        synchronized (class124.field1964) {
            class124.field1968 = class124.field1965;
            class124.field1969 = class124.field1966;
            class124.field1970 = class124.field1971;
            class124.field1972 = class124.field1980;
            class124.field1976 = class124.field1979;
            class124.field1977 = class124.field1973;
            class124.field1978 = class124.field1974;
            class124.field1980 = 0;
        }
        if (Statics.field1944 != null) {
            int var10 = Statics.field1944.method2431();
            field444 = var10;
        }
        if (field257 == 0) {
            method2394();
            class128.method129();
        } else if (field257 == 5) {
            class26.method2671(this);
            method2394();
            class128.method129();
        } else if (field257 == 10) {
            class26.method2671(this);
        } else if (field257 == 20) {
            class26.method2671(this);
            method2301();
        } else if (field257 == 25) {
            method104();
        }
        if (field257 == 30) {
            method1971();
        } else if (field257 == 40 || field257 == 45) {
            method2301();
        }
    }

    @ObfuscatedName("client.a(I)V")
    public final void method175() {
        boolean var1;
        label235: {
            try {
                if (class157.field2660 == 2) {
                    if (Statics.field2907 == null) {
                        Statics.field2907 = class154.method2930(Statics.field183, Statics.field1638, Statics.field2366);
                        if (Statics.field2907 == null) {
                            var1 = false;
                            break label235;
                        }
                    }
                    if (Statics.field668 == null) {
                        Statics.field668 = new class50(Statics.field2658, Statics.field1792);
                    }
                    if (Statics.field2665.method3012(Statics.field2907, Statics.field2659, Statics.field668, 22050)) {
                        Statics.field2665.method3032();
                        Statics.field2665.method3010(Statics.field2657);
                        Statics.field2665.method3015(Statics.field2907, Statics.field2662);
                        class157.field2660 = 0;
                        Statics.field2907 = null;
                        Statics.field668 = null;
                        Statics.field183 = null;
                        var1 = true;
                        break label235;
                    }
                }
            } catch (Exception var33) {
                var33.printStackTrace();
                Statics.field2665.method3016();
                class157.field2660 = 0;
                Statics.field2907 = null;
                Statics.field668 = null;
                Statics.field183 = null;
            }
            var1 = false;
        }
        if (var1 && field421 && Statics.field1950 != null) {
            Statics.field1950.method958();
        }
        if (field2015) {
            class121.method1871(Statics.field591);
            Statics.method1580(Statics.field591);
            if (Statics.field1944 != null) {
                Statics.field1944.method2436(Statics.field591);
            }
            this.method2592();
            Canvas var4 = Statics.field591;
            var4.setFocusTraversalKeysEnabled(false);
            var4.addKeyListener(class121.field1919);
            var4.addFocusListener(class121.field1919);
            Canvas var5 = Statics.field591;
            var5.addMouseListener(class124.field1964);
            var5.addMouseMotionListener(class124.field1964);
            var5.addFocusListener(class124.field1964);
            if (Statics.field1944 != null) {
                Statics.field1944.method2430(Statics.field591);
            }
        }
        if (field257 == 0) {
            int var6 = class26.field657;
            String var7 = class26.field644;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field591.getGraphics();
                if (Statics.field222 == null) {
                    Statics.field222 = new Font("Helvetica", 1, 13);
                    Statics.field2615 = Statics.field591.getFontMetrics(Statics.field222);
                }
                if (field2031) {
                    field2031 = false;
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field2440, Statics.field74);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1920 == null) {
                        Statics.field1920 = Statics.field591.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field1920.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field222);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field2615.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field1920, Statics.field2440 / 2 - 152, Statics.field74 / 2 - 18, (ImageObserver) null);
                } catch (Exception var29) {
                    int var12 = Statics.field2440 / 2 - 152;
                    int var13 = Statics.field74 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field222);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field2615.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var30) {
                Statics.field591.repaint();
            }
        } else if (field257 == 5) {
            class26.method668(Statics.field2871, Statics.field517);
        } else if (field257 == 10) {
            class26.method668(Statics.field2871, Statics.field517);
        } else if (field257 == 20) {
            class26.method668(Statics.field2871, Statics.field517);
        } else if (field257 == 25) {
            if (field337 == 1) {
                if (field364 > field351) {
                    field351 = field364;
                }
                int var15 = (field351 * 50 - field364 * 50) / field351;
                method106(class139.field2128 + class2.field23 + class2.field25 + var15 + "%" + class2.field18, false);
            } else if (field337 == 2) {
                if (field304 > field305) {
                    field305 = field304;
                }
                int var16 = (field305 * 50 - field304 * 50) / field305 + 50;
                method106(class139.field2128 + class2.field23 + class2.field25 + var16 + "%" + class2.field18, false);
            } else {
                method106(class139.field2128, false);
            }
        } else if (field257 == 30) {
            if (field361 != -1) {
                int var17 = field361;
                if (class148.method148(var17)) {
                    method2666(Statics.field2524[var17], -1);
                }
            }
            for (int var18 = 0; var18 < field449; var18++) {
                if (field499[var18]) {
                    field473[var18] = true;
                }
                field453[var18] = field499[var18];
                field499[var18] = false;
            }
            field276 = field463;
            field353 = -1;
            field436 = -1;
            Statics.field1029 = null;
            if (field361 != -1) {
                field449 = 0;
                method1963(field361, 0, 0, 765, 503, 0, 0, -1);
            }
            class70.method1536();
            if (field389) {
                method99();
            } else if (field353 != -1) {
                int var19 = field353;
                int var20 = field436;
                if (field390 >= 2 || field401 != 0 || field403) {
                    String var21;
                    if (field401 == 1 && field390 < 2) {
                        var21 = class139.field2254 + class139.field2270 + field402 + " " + class2.field22;
                    } else if (field403 && field390 < 2) {
                        var21 = field296 + class139.field2270 + field488 + " " + class2.field22;
                    } else {
                        var21 = method109(field390 - 1);
                    }
                    if (field390 > 2) {
                        var21 = var21 + class2.method1581(16777215) + " " + '/' + " " + (field390 - 2) + class139.field2183;
                    }
                    Statics.field2871.method3276(var21, var19 + 4, var20 + 15, 16777215, 0, field463 / 1000);
                }
            }
            if (field332 == 3) {
                for (int var22 = 0; var22 < field449; var22++) {
                    if (field453[var22]) {
                        class70.method1494(field500[var22], field455[var22], field417[var22], field457[var22], 16711935, 128);
                    } else if (field473[var22]) {
                        class70.method1494(field500[var22], field455[var22], field417[var22], field457[var22], 16711680, 128);
                    }
                }
            }
            class19.method30(Statics.field1795, Statics.field944.field704, Statics.field944.field693, field323);
            field323 = 0;
        } else if (field257 == 40) {
            method106(class139.field2129 + class2.field23 + class139.field2130, false);
        } else if (field257 == 45) {
            method106(class139.field2268, false);
        }
        if (field257 == 30 && field332 == 0 && !field2031) {
            try {
                Graphics var23 = Statics.field591.getGraphics();
                for (int var24 = 0; var24 < field449; var24++) {
                    if (field473[var24]) {
                        Statics.field2608.method1337(var23, field500[var24], field455[var24], field417[var24], field457[var24]);
                        field473[var24] = false;
                    }
                }
            } catch (Exception var32) {
                Statics.field591.repaint();
            }
        } else if (field257 > 0) {
            try {
                Graphics var26 = Statics.field591.getGraphics();
                Statics.field2608.method1325(var26, 0, 0);
                field2031 = false;
                for (int var27 = 0; var27 < field449; var27++) {
                    field473[var27] = false;
                }
            } catch (Exception var31) {
                Statics.field591.repaint();
            }
        }
    }

    @ObfuscatedName("client.w(I)V")
    public final void method176() {
        if (Statics.field193 != null) {
            Statics.field193.field180 = false;
        }
        Statics.field193 = null;
        if (Statics.field2909 != null) {
            Statics.field2909.method2560();
            Statics.field2909 = null;
        }
        class121.method701();
        if (class124.field1964 != null) {
            class124 var1 = class124.field1964;
            synchronized (class124.field1964) {
                class124.field1964 = null;
            }
        }
        Statics.field1944 = null;
        if (Statics.field1950 != null) {
            Statics.field1950.method963();
        }
        if (Statics.field946 != null) {
            Statics.field946.method963();
        }
        if (Statics.field2456 != null) {
            Statics.field2456.method2560();
        }
        Object var3 = class145.field2444;
        synchronized (class145.field2444) {
            if (class145.field2442 != 0) {
                class145.field2442 = 1;
                try {
                    class145.field2444.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class133.method532();
    }

    @ObfuscatedName("t.u(II)V")
    public static void method138(int arg0) {
        if (field257 == arg0) {
            return;
        }
        if (field257 == 0) {
            Statics.method2452();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field282 = 0;
            field283 = 0;
            field411 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field565 != null) {
            Statics.field565.method2560();
            Statics.field565 = null;
        }
        if (field257 == 25) {
            field337 = 0;
            field364 = 0;
            field351 = 1;
            field304 = 0;
            field305 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field591;
            class143 var2 = Statics.field2014;
            class143 var3 = Statics.field56;
            if (!Statics.field627) {
                class70.method1493();
                byte[] var4 = var2.method2693("title.jpg", "");
                Statics.field2905 = new class69(var4, var1);
                Statics.field630 = Statics.field2905.method1395();
                Statics.field2105 = class67.method767(var3, "logo", "");
                Statics.field654 = class67.method767(var3, "titlebox", "");
                Statics.field628 = class67.method767(var3, "titlebutton", "");
                Statics.field2609 = class67.method24(var3, "runes", "");
                Statics.field153 = class67.method24(var3, "title_mute", "");
                Statics.field1483 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field1483[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field1483[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field1483[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field1483[var8 + 192] = 16777215;
                }
                Statics.field685 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field685[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field685[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field685[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field685[var12 + 192] = 16777215;
                }
                Statics.field187 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field187[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field187[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field187[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field187[var16 + 192] = 16777215;
                }
                Statics.field135 = new int[256];
                Statics.field921 = new int[32768];
                Statics.field637 = new int[32768];
                class26.method1291((class71) null);
                Statics.field638 = new int[32768];
                Statics.field2817 = new int[32768];
                class26.field650 = 0;
                class26.field643 = "";
                class26.field652 = "";
                class26.field653 = false;
                if (Statics.field1858.field146) {
                    class157.method1962(2);
                } else {
                    class143 var17 = Statics.field1996;
                    int var18 = var17.method2757("scape main");
                    int var19 = var17.method2715(var18, "");
                    class157.field2660 = 1;
                    Statics.field183 = var17;
                    Statics.field1638 = var18;
                    Statics.field2366 = var19;
                    Statics.field2657 = 255;
                    Statics.field2662 = false;
                    Statics.field2056 = 2;
                }
                class146.method484(false);
                Statics.field627 = true;
                Statics.field2905.method1404(0, 0);
                Statics.field630.method1404(382, 0);
                Statics.field2105.method1552(382 - Statics.field2105.field1285 / 2, 18);
            }
        } else if (Statics.field627) {
            Statics.field654 = null;
            Statics.field628 = null;
            Statics.field2609 = null;
            Statics.field2905 = null;
            Statics.field630 = null;
            Statics.field2105 = null;
            Statics.field153 = null;
            Statics.field1087 = null;
            Statics.field1036 = null;
            Statics.field545 = null;
            Statics.field137 = null;
            Statics.field1386 = null;
            Statics.field1483 = null;
            Statics.field685 = null;
            Statics.field187 = null;
            Statics.field135 = null;
            Statics.field921 = null;
            Statics.field637 = null;
            Statics.field638 = null;
            Statics.field2817 = null;
            class157.method1962(2);
            class146.method484(true);
            Statics.field627 = false;
        }
        field257 = arg0;
    }

    @ObfuscatedName("client.d(B)V")
    public void method177() {
        if (field257 == 1000) {
            return;
        }
        long var1 = class100.method100();
        int var3 = (int) (var1 - Statics.field2462);
        Statics.field2462 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class146.field2446 += var3;
        boolean var4;
        if (class146.field2454 == 0 && class146.field2460 == 0 && class146.field2451 == 0 && class146.field2449 == 0) {
            var4 = true;
        } else if (Statics.field2456 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class146.field2446 > 30000) {
                        throw new IOException();
                    }
                    while (class146.field2460 < 20 && class146.field2449 > 0) {
                        class147 var5 = (class147) class146.field2448.method3156();
                        class104 var6 = new class104(4);
                        var6.method2133(1);
                        var6.method2118((int) var5.field2812);
                        Statics.field2456.method2564(var6.field1808, 0, 4);
                        class146.field2453.method3165(var5, var5.field2812);
                        class146.field2449--;
                        class146.field2460++;
                    }
                    while (class146.field2454 < 20 && class146.field2451 > 0) {
                        class147 var7 = (class147) class146.field2452.method3205();
                        class104 var8 = new class104(4);
                        var8.method2133(0);
                        var8.method2118((int) var7.field2812);
                        Statics.field2456.method2564(var8.field1808, 0, 4);
                        var7.method3216();
                        class146.field2455.method3165(var7, var7.field2812);
                        class146.field2451--;
                        class146.field2454++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2456.method2562();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class146.field2446 = 0;
                        byte var11 = 0;
                        if (Statics.field1911 == null) {
                            var11 = 8;
                        } else if (class146.field2459 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class146.field2458.field1806;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2456.method2563(class146.field2458.field1808, class146.field2458.field1806, var12);
                            if (class146.field2445 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class146.field2458.field1808[class146.field2458.field1806 + var13] ^= class146.field2445;
                                }
                            }
                            class146.field2458.field1806 += var12;
                            if (class146.field2458.field1806 < var11) {
                                break;
                            }
                            if (Statics.field1911 == null) {
                                class146.field2458.field1806 = 0;
                                int var14 = class146.field2458.method2190();
                                int var15 = class146.field2458.method2132();
                                int var16 = class146.field2458.method2190();
                                int var17 = class146.field2458.method2135();
                                long var18 = (long) ((var14 << 16) + var15);
                                class147 var20 = (class147) class146.field2453.method3159(var18);
                                Statics.field2457 = true;
                                if (var20 == null) {
                                    var20 = (class147) class146.field2455.method3159(var18);
                                    Statics.field2457 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1911 = var20;
                                Statics.field861 = new class104(var17 + var21 + Statics.field1911.field2466);
                                Statics.field861.method2133(var16);
                                Statics.field861.method2131(var17);
                                class146.field2459 = 8;
                                class146.field2458.field1806 = 0;
                            } else if (class146.field2459 == 0) {
                                if (class146.field2458.field1808[0] == -1) {
                                    class146.field2459 = 1;
                                    class146.field2458.field1806 = 0;
                                } else {
                                    Statics.field1911 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field861.field1808.length - Statics.field1911.field2466;
                            int var23 = 512 - class146.field2459;
                            if (var23 > var22 - Statics.field861.field1806) {
                                var23 = var22 - Statics.field861.field1806;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2456.method2563(Statics.field861.field1808, Statics.field861.field1806, var23);
                            if (class146.field2445 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field861.field1808[Statics.field861.field1806 + var24] ^= class146.field2445;
                                }
                            }
                            Statics.field861.field1806 += var23;
                            class146.field2459 += var23;
                            if (Statics.field861.field1806 == var22) {
                                if (Statics.field1911.field2812 == 16711935L) {
                                    Statics.field1255 = Statics.field861;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class143 var26 = class146.field2461[var25];
                                        if (var26 != null) {
                                            Statics.field1255.field1806 = var25 * 8 + 5;
                                            int var27 = Statics.field1255.method2135();
                                            int var28 = Statics.field1255.method2135();
                                            var26.method2777(var27, var28);
                                        }
                                    }
                                } else {
                                    class146.field2450.reset();
                                    class146.field2450.update(Statics.field861.field1808, 0, var22);
                                    int var29 = (int) class146.field2450.getValue();
                                    if (Statics.field1911.field2468 != var29) {
                                        try {
                                            Statics.field2456.method2560();
                                        } catch (Exception var35) {
                                        }
                                        class146.field2463++;
                                        Statics.field2456 = null;
                                        class146.field2445 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class146.field2463 = 0;
                                    class146.field2464 = 0;
                                    Statics.field1911.field2467.method2794((int) (Statics.field1911.field2812 & 0xFFFFL), Statics.field861.field1808, (Statics.field1911.field2812 & 0xFF0000L) == 16711680L, Statics.field2457);
                                }
                                Statics.field1911.method3223();
                                if (Statics.field2457) {
                                    class146.field2460--;
                                } else {
                                    class146.field2454--;
                                }
                                class146.field2459 = 0;
                                Statics.field1911 = null;
                                Statics.field861 = null;
                            } else {
                                if (class146.field2459 != 512) {
                                    break;
                                }
                                class146.field2459 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2456.method2560();
                } catch (Exception var34) {
                }
                class146.field2464++;
                Statics.field2456 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method178();
        }
    }

    @ObfuscatedName("client.t(I)V")
    public void method178() {
        if (class146.field2463 >= 4) {
            this.method2590("js5crc");
            field257 = 1000;
            return;
        }
        if (class146.field2464 >= 4) {
            if (field257 <= 5) {
                this.method2590("js5io");
                field257 = 1000;
                return;
            }
            field279 = 3000;
            class146.field2464 = 3;
        }
        if (--field279 + 1 > 0) {
            return;
        }
        try {
            if (field450 == 0) {
                Statics.field21 = Statics.field1949.method2470(Statics.field853, Statics.field528);
                field450++;
            }
            if (field450 == 1) {
                if (Statics.field21.field2037 == 2) {
                    this.method179(-1);
                    return;
                }
                if (Statics.field21.field2037 == 1) {
                    field450++;
                }
            }
            if (field450 == 2) {
                Statics.field2766 = new class127((Socket) Statics.field21.field2041, Statics.field1949);
                class104 var1 = new class104(5);
                var1.method2133(15);
                var1.method2131(46);
                Statics.field2766.method2564(var1.field1808, 0, 5);
                field450++;
                Statics.field205 = class100.method100();
            }
            if (field450 == 3) {
                if (field257 <= 5 || Statics.field2766.method2562() > 0) {
                    int var2 = Statics.field2766.method2571();
                    if (var2 != 0) {
                        this.method179(var2);
                        return;
                    }
                    field450++;
                } else if (class100.method100() - Statics.field205 > 30000L) {
                    this.method179(-2);
                    return;
                }
            }
            if (field450 == 4) {
                class146.method575(Statics.field2766, field257 > 20);
                Statics.field21 = null;
                Statics.field2766 = null;
                field450 = 0;
                field281 = 0;
            }
        } catch (IOException var4) {
            this.method179(-3);
        }
    }

    @ObfuscatedName("client.j(II)V")
    public void method179(int arg0) {
        Statics.field21 = null;
        Statics.field2766 = null;
        field450 = 0;
        if (Statics.field528 == Statics.field1643) {
            Statics.field528 = Statics.field865;
        } else {
            Statics.field528 = Statics.field1643;
        }
        field281++;
        if (field281 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field257 <= 5) {
                this.method2590("js5connect_full");
                field257 = 1000;
            } else {
                field279 = 3000;
            }
        } else if (field281 >= 2 && arg0 == 6) {
            this.method2590("js5connect_outofdate");
            field257 = 1000;
        } else if (field281 >= 4) {
            if (field257 <= 5) {
                this.method2590("js5connect");
                field257 = 1000;
            } else {
                field279 = 3000;
            }
        }
    }

    @ObfuscatedName("db.q(B)V")
    public static void method2394() {
        if (field433 == 0) {
            Statics.field878 = new class76(4, 104, 104, class6.field97);
            for (int var0 = 0; var0 < 4; var0++) {
                field307[var0] = new class187(104, 104);
            }
            Statics.field2627 = new class69(512, 512);
            class26.field644 = class139.field2131;
            class26.field657 = 5;
            field433 = 20;
        } else if (field433 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class81.field1448[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class76.method1622(var1, 500, 800, 512, 334);
            class26.field644 = class139.field2132;
            class26.field657 = 10;
            field433 = 30;
        } else if (field433 == 30) {
            Statics.field1729 = method14(0, false, true, true);
            Statics.field462 = method14(1, false, true, true);
            Statics.field3 = method14(2, true, false, true);
            Statics.field2076 = method14(3, false, true, true);
            Statics.field1085 = method14(4, false, true, true);
            Statics.field658 = method14(5, true, true, true);
            Statics.field1996 = method14(6, true, true, false);
            Statics.field802 = method14(7, false, true, true);
            Statics.field56 = method14(8, false, true, true);
            Statics.field1237 = method14(9, false, true, true);
            Statics.field2014 = method14(10, false, true, true);
            Statics.field67 = method14(11, false, true, true);
            Statics.field58 = method14(12, false, true, true);
            Statics.field904 = method14(13, true, false, true);
            Statics.field1248 = method14(14, false, true, false);
            Statics.field1837 = method14(15, false, true, true);
            class26.field644 = class139.field2133;
            class26.field657 = 20;
            field433 = 40;
        } else if (field433 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1729.method2775() * 4 / 100;
            int var8 = var7 + Statics.field462.method2775() * 4 / 100;
            int var9 = var8 + Statics.field3.method2775() * 2 / 100;
            int var10 = var9 + Statics.field2076.method2775() * 2 / 100;
            int var11 = var10 + Statics.field1085.method2775() * 6 / 100;
            int var12 = var11 + Statics.field658.method2775() * 4 / 100;
            int var13 = var12 + Statics.field1996.method2775() * 2 / 100;
            int var14 = var13 + Statics.field802.method2775() * 60 / 100;
            int var15 = var14 + Statics.field56.method2775() * 2 / 100;
            int var16 = var15 + Statics.field1237.method2775() * 2 / 100;
            int var17 = var16 + Statics.field2014.method2775() * 2 / 100;
            int var18 = var17 + Statics.field67.method2775() * 2 / 100;
            int var19 = var18 + Statics.field58.method2775() * 2 / 100;
            int var20 = var19 + Statics.field904.method2775() * 2 / 100;
            int var21 = var20 + Statics.field1248.method2775() * 2 / 100;
            int var22 = var21 + Statics.field1837.method2775() * 2 / 100;
            if (var22 == 100) {
                class26.field644 = class139.field2300;
                class26.field657 = 30;
                field433 = 45;
            } else {
                if (var22 != 0) {
                    class26.field644 = class139.field2214 + var22 + "%";
                }
                class26.field657 = 30;
            }
        } else if (field433 == 45) {
            class47.method2680(22050, !field458, 2);
            class158 var23 = new class158();
            var23.method3018(9, 128);
            Statics.field1950 = class47.method2420(Statics.field1949, Statics.field591, 0, 22050);
            Statics.field1950.method955(var23);
            class143 var24 = Statics.field1837;
            class143 var25 = Statics.field1248;
            class143 var26 = Statics.field1085;
            Statics.field2659 = var24;
            Statics.field1792 = var25;
            Statics.field2658 = var26;
            Statics.field2665 = var23;
            Statics.field946 = class47.method2420(Statics.field1949, Statics.field591, 1, 2048);
            Statics.field1962 = new class46();
            Statics.field946.method955(Statics.field1962);
            Statics.field27 = new class65(22050, Statics.field1056);
            class26.field644 = class139.field2136;
            class26.field657 = 35;
            field433 = 50;
        } else if (field433 == 50) {
            int var27 = 0;
            if (Statics.field517 == null) {
                class143 var28 = Statics.field56;
                class143 var29 = Statics.field904;
                int var30 = var28.method2757("p11_full");
                int var31 = var28.method2715(var30, "");
                class183 var32;
                if (class67.method609(var28, var30, var31)) {
                    byte[] var33 = var29.method2725(var30, var31);
                    class183 var34;
                    if (var33 == null) {
                        var34 = null;
                    } else {
                        class183 var35 = new class183(var33, Statics.field1249, Statics.field1250, Statics.field972, Statics.field950, Statics.field1247, Statics.field1252);
                        class67.method793();
                        var34 = var35;
                    }
                    var32 = var34;
                } else {
                    var32 = null;
                }
                Statics.field517 = var32;
            } else {
                var27++;
            }
            if (Statics.field171 == null) {
                class143 var37 = Statics.field56;
                class143 var38 = Statics.field904;
                int var39 = var37.method2757("p12_full");
                int var40 = var37.method2715(var39, "");
                class183 var41;
                if (class67.method609(var37, var39, var40)) {
                    byte[] var42 = var38.method2725(var39, var40);
                    class183 var43;
                    if (var42 == null) {
                        var43 = null;
                    } else {
                        class183 var44 = new class183(var42, Statics.field1249, Statics.field1250, Statics.field972, Statics.field950, Statics.field1247, Statics.field1252);
                        class67.method793();
                        var43 = var44;
                    }
                    var41 = var43;
                } else {
                    var41 = null;
                }
                Statics.field171 = var41;
            } else {
                var27++;
            }
            if (Statics.field2871 == null) {
                class143 var46 = Statics.field56;
                class143 var47 = Statics.field904;
                int var48 = var46.method2757("b12_full");
                int var49 = var46.method2715(var48, "");
                class183 var50;
                if (class67.method609(var46, var48, var49)) {
                    byte[] var51 = var47.method2725(var48, var49);
                    class183 var52;
                    if (var51 == null) {
                        var52 = null;
                    } else {
                        class183 var53 = new class183(var51, Statics.field1249, Statics.field1250, Statics.field972, Statics.field950, Statics.field1247, Statics.field1252);
                        class67.method793();
                        var52 = var53;
                    }
                    var50 = var52;
                } else {
                    var50 = null;
                }
                Statics.field2871 = var50;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class26.field644 = class139.field2339 + var27 * 100 / 3 + "%";
                class26.field657 = 40;
            } else {
                Statics.field132 = new class141(true);
                class26.field644 = class139.field2138;
                class26.field657 = 40;
                field433 = 60;
            }
        } else if (field433 == 60) {
            class143 var55 = Statics.field2014;
            class143 var56 = Statics.field56;
            int var57 = 0;
            if (var55.method2713("title.jpg", "")) {
                var57++;
            }
            if (var56.method2713("logo", "")) {
                var57++;
            }
            if (var56.method2713("titlebox", "")) {
                var57++;
            }
            if (var56.method2713("titlebutton", "")) {
                var57++;
            }
            if (var56.method2713("runes", "")) {
                var57++;
            }
            if (var56.method2713("title_mute", "")) {
                var57++;
            }
            var56.method2713("sl_back", "");
            var56.method2713("sl_flags", "");
            var56.method2713("sl_arrows", "");
            var56.method2713("sl_stars", "");
            var56.method2713("sl_button", "");
            byte var60 = 6;
            if (var57 < var60) {
                class26.field644 = class139.field2174 + var57 * 100 / var60 + "%";
                class26.field657 = 50;
            } else {
                class26.field644 = class139.field2261;
                class26.field657 = 50;
                method138(5);
                field433 = 70;
            }
        } else if (field433 == 70) {
            if (Statics.field3.method2699()) {
                class38.method34(Statics.field3);
                class143 var62 = Statics.field3;
                Statics.field854 = var62;
                class143 var63 = Statics.field3;
                class143 var64 = Statics.field802;
                Statics.field909 = var63;
                Statics.field910 = var64;
                Statics.field911 = Statics.field909.method2705(3);
                class143 var65 = Statics.field3;
                class143 var66 = Statics.field802;
                boolean var67 = field458;
                Statics.field798 = var65;
                Statics.field799 = var66;
                class33.field835 = var67;
                class143 var68 = Statics.field3;
                class143 var69 = Statics.field802;
                Statics.field787 = var68;
                Statics.field1421 = var69;
                class143 var70 = Statics.field3;
                class143 var71 = Statics.field802;
                boolean var72 = field254;
                class183 var73 = Statics.field517;
                Statics.field1026 = var70;
                Statics.field978 = var71;
                Statics.field993 = var72;
                Statics.field1026.method2705(10);
                Statics.field983 = var73;
                class35.method1387(Statics.field3, Statics.field1729, Statics.field462);
                class143 var74 = Statics.field3;
                class143 var75 = Statics.field802;
                Statics.field907 = var74;
                Statics.field888 = var75;
                class143 var76 = Statics.field3;
                Statics.field945 = var76;
                Statics.method510(Statics.field3);
                class143 var77 = Statics.field2076;
                class143 var78 = Statics.field802;
                class143 var79 = Statics.field56;
                class143 var80 = Statics.field904;
                Statics.field75 = var77;
                Statics.field1497 = var78;
                Statics.field1956 = var79;
                Statics.field2570 = var80;
                Statics.field2524 = new class148[Statics.field75.method2736()][];
                Statics.field2470 = new boolean[Statics.field75.method2736()];
                class41.method650(Statics.field3);
                class40.method2652(Statics.field3);
                class26.field644 = class139.field2142;
                class26.field657 = 60;
                field433 = 80;
            } else {
                class26.field644 = class139.field2141 + Statics.field3.method2780() + "%";
                class26.field657 = 60;
            }
        } else if (field433 == 80) {
            int var81 = 0;
            if (Statics.field2601 == null) {
                Statics.field2601 = class67.method989(Statics.field56, "compass", "");
            } else {
                var81++;
            }
            if (Statics.field529 == null) {
                Statics.field529 = class67.method989(Statics.field56, "mapedge", "");
            } else {
                var81++;
            }
            if (Statics.field174 == null) {
                Statics.field174 = class67.method24(Statics.field56, "mapscene", "");
            } else {
                var81++;
            }
            if (Statics.field1869 == null) {
                Statics.field1869 = class67.method2948(Statics.field56, "mapfunction", "");
            } else {
                var81++;
            }
            if (Statics.field71 == null) {
                Statics.field71 = class67.method2948(Statics.field56, "hitmarks", "");
            } else {
                var81++;
            }
            if (Statics.field4 == null) {
                Statics.field4 = class67.method2948(Statics.field56, "headicons_pk", "");
            } else {
                var81++;
            }
            if (Statics.field973 == null) {
                Statics.field973 = class67.method2948(Statics.field56, "headicons_prayer", "");
            } else {
                var81++;
            }
            if (Statics.field509 == null) {
                Statics.field509 = class67.method2948(Statics.field56, "headicons_hint", "");
            } else {
                var81++;
            }
            if (Statics.field576 == null) {
                Statics.field576 = class67.method2948(Statics.field56, "mapmarker", "");
            } else {
                var81++;
            }
            if (Statics.field1396 == null) {
                Statics.field1396 = class67.method2948(Statics.field56, "cross", "");
            } else {
                var81++;
            }
            if (Statics.field886 == null) {
                Statics.field886 = class67.method2948(Statics.field56, "mapdots", "");
            } else {
                var81++;
            }
            if (Statics.field1416 == null) {
                Statics.field1416 = class67.method24(Statics.field56, "scrollbar", "");
            } else {
                var81++;
            }
            if (Statics.field117 == null) {
                Statics.field117 = class67.method24(Statics.field56, "mod_icons", "");
            } else {
                var81++;
            }
            if (Statics.field1221 == null) {
                Statics.field1221 = class67.method767(Statics.field56, "mapback", "");
            } else {
                var81++;
            }
            if (var81 < 14) {
                class26.field644 = class139.field2143 + var81 * 100 / 14 + "%";
                class26.field657 = 70;
            } else {
                Statics.field2853 = Statics.field117;
                Statics.field529.method1415();
                int var82 = (int) (Math.random() * 21.0D) - 10;
                int var83 = (int) (Math.random() * 21.0D) - 10;
                int var84 = (int) (Math.random() * 21.0D) - 10;
                int var85 = (int) (Math.random() * 41.0D) - 20;
                for (int var86 = 0; var86 < Statics.field1869.length; var86++) {
                    Statics.field1869[var86].method1444(var82 + var85, var83 + var85, var84 + var85);
                }
                Statics.field174[0].method1554(var82 + var85, var83 + var85, var84 + var85);
                Statics.field1630 = new int[33];
                Statics.field1028 = new int[33];
                Statics.field1485 = new int[151];
                Statics.field1845 = new int[151];
                for (int var87 = 0; var87 < 33; var87++) {
                    int var88 = 999;
                    int var89 = 0;
                    for (int var90 = 0; var90 < 34; var90++) {
                        if (Statics.field1221.field1286[Statics.field1221.field1285 * var87 + var90] == 0) {
                            if (var88 == 999) {
                                var88 = var90;
                            }
                        } else if (var88 != 999) {
                            var89 = var90;
                            break;
                        }
                    }
                    Statics.field1630[var87] = var88;
                    Statics.field1028[var87] = var89 - var88;
                }
                for (int var91 = 5; var91 < 156; var91++) {
                    int var92 = 999;
                    int var93 = 0;
                    for (int var94 = 25; var94 < 172; var94++) {
                        if (Statics.field1221.field1286[Statics.field1221.field1285 * var91 + var94] == 0 && (var94 > 34 || var91 > 34)) {
                            if (var92 == 999) {
                                var92 = var94;
                            }
                        } else if (var92 != 999) {
                            var93 = var94;
                            break;
                        }
                    }
                    Statics.field1485[var91 - 5] = var92 - 25;
                    Statics.field1845[var91 - 5] = var93 - var92;
                }
                class26.field644 = class139.field2331;
                class26.field657 = 70;
                field433 = 90;
            }
        } else if (field433 == 90) {
            if (Statics.field1237.method2699()) {
                class85 var95 = new class85(Statics.field1237, Statics.field56, 20, 0.8D, field458 ? 64 : 128);
                class81.method1774(var95);
                class81.method1769(0.8D);
                class26.field644 = class139.field2146;
                class26.field657 = 90;
                field433 = 110;
            } else {
                class26.field644 = class139.field2320 + Statics.field1237.method2780() + "%";
                class26.field657 = 90;
            }
        } else if (field433 == 110) {
            Statics.field193 = new class11();
            Statics.field1949.method2468(Statics.field193, 10);
            class26.field644 = class139.field2147;
            class26.field657 = 94;
            field433 = 120;
        } else if (field433 == 120) {
            if (Statics.field2014.method2713("huffman", "")) {
                class99 var96 = new class99(Statics.field2014.method2693("huffman", ""));
                class181.method1003(var96);
                class26.field644 = class139.field2149;
                class26.field657 = 96;
                field433 = 130;
            } else {
                class26.field644 = class139.field2148 + "%";
                class26.field657 = 96;
            }
        } else if (field433 == 130) {
            if (!Statics.field2076.method2699()) {
                class26.field644 = class139.field2150 + Statics.field2076.method2780() * 4 / 5 + "%";
                class26.field657 = 100;
            } else if (!Statics.field58.method2699()) {
                class26.field644 = class139.field2150 + (80 + Statics.field58.method2780() / 6) + "%";
                class26.field657 = 100;
            } else if (Statics.field904.method2699()) {
                class26.field644 = class139.field2151;
                class26.field657 = 100;
                field433 = 140;
            } else {
                class26.field644 = class139.field2150 + (96 + Statics.field904.method2780() / 20) + "%";
                class26.field657 = 100;
            }
        } else if (field433 == 140) {
            method138(10);
        }
    }

    @ObfuscatedName("k.p(IZZZB)Ler;")
    public static class143 method14(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class118 var4 = null;
        if (class133.field2063 != null) {
            var4 = new class118(arg0, class133.field2063, Statics.field583[arg0], 1000000);
        }
        return new class143(var4, Statics.field1992, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cb.v(B)V")
    public static final void method2301() {
        try {
            if (field282 == 0) {
                if (Statics.field2909 != null) {
                    Statics.field2909.method2560();
                    Statics.field2909 = null;
                }
                Statics.field2043 = null;
                field300 = false;
                field283 = 0;
                field282 = 1;
            }
            if (field282 == 1) {
                if (Statics.field2043 == null) {
                    Statics.field2043 = Statics.field1949.method2470(Statics.field853, Statics.field528);
                }
                if (Statics.field2043.field2037 == 2) {
                    throw new IOException();
                }
                if (Statics.field2043.field2037 == 1) {
                    Statics.field2909 = new class127((Socket) Statics.field2043.field2041, Statics.field1949);
                    Statics.field2043 = null;
                    field282 = 2;
                }
            }
            if (field282 == 2) {
                field289.field1806 = 0;
                field289.method2133(14);
                Statics.field2909.method2564(field289.field1808, 0, 1);
                field291.field1806 = 0;
                field282 = 3;
            }
            if (field282 == 3) {
                if (Statics.field1950 != null) {
                    Statics.field1950.method957();
                }
                if (Statics.field946 != null) {
                    Statics.field946.method957();
                }
                int var0 = Statics.field2909.method2571();
                if (Statics.field1950 != null) {
                    Statics.field1950.method957();
                }
                if (Statics.field946 != null) {
                    Statics.field946.method957();
                }
                if (var0 != 0) {
                    method126(var0);
                    return;
                }
                field291.field1806 = 0;
                field282 = 5;
            }
            if (field282 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field289.field1806 = 0;
                field289.method2133(10);
                field289.method2131(var1[0]);
                field289.method2131(var1[1]);
                field289.method2131(var1[2]);
                field289.method2131(var1[3]);
                field289.method2120(0L);
                field289.method2116(class26.field652);
                field289.method2148(class5.field76, class5.field77);
                field290.field1806 = 0;
                if (field257 == 40) {
                    field290.method2133(18);
                } else {
                    field290.method2133(16);
                }
                field290.method2117(0);
                int var2 = field290.field1806;
                field290.method2131(46);
                field290.method2124(field289.field1808, 0, field289.field1806);
                int var3 = field290.field1806;
                field290.method2116(class26.field643);
                field290.method2133(field458 ? 1 : 0);
                class133.method1867(field290);
                class104 var4 = new class104(Statics.field132.method2683());
                Statics.field132.method2684(var4);
                field290.method2124(var4.field1808, 0, var4.field1808.length);
                field290.method2131(Statics.field1729.field2418);
                field290.method2131(Statics.field462.field2418);
                field290.method2131(Statics.field3.field2418);
                field290.method2131(Statics.field2076.field2418);
                field290.method2131(Statics.field1085.field2418);
                field290.method2131(Statics.field658.field2418);
                field290.method2131(Statics.field1996.field2418);
                field290.method2131(Statics.field802.field2418);
                field290.method2131(Statics.field56.field2418);
                field290.method2131(Statics.field1237.field2418);
                field290.method2131(Statics.field2014.field2418);
                field290.method2131(Statics.field67.field2418);
                field290.method2131(Statics.field58.field2418);
                field290.method2131(Statics.field904.field2418);
                field290.method2131(Statics.field1248.field2418);
                field290.method2131(Statics.field1837.field2418);
                field290.method2146(var1, var3, field290.field1806);
                field290.method2126(field290.field1806 - var2);
                Statics.field2909.method2564(field290.field1808, 0, field290.field1806);
                field289.method2373(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field291.method2373(var1);
                field282 = 6;
            }
            if (field282 == 6 && Statics.field2909.method2562() > 0) {
                int var6 = Statics.field2909.method2571();
                if (var6 == 21 && field257 == 20) {
                    field282 = 7;
                } else if (var6 == 2) {
                    field282 = 9;
                } else if (var6 == 15 && field257 == 40) {
                    field289.field1806 = 0;
                    field291.field1806 = 0;
                    field319 = -1;
                    field485 = -1;
                    field298 = -1;
                    field299 = -1;
                    field292 = 0;
                    field294 = 0;
                    field266 = 0;
                    field390 = 0;
                    field389 = false;
                    field273 = 0;
                    field480 = 0;
                    for (int var7 = 0; var7 < field366.length; var7++) {
                        if (field366[var7] != null) {
                            field366[var7].field715 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field410.length; var8++) {
                        if (field410[var8] != null) {
                            field410[var8].field715 = -1;
                        }
                    }
                    class13.field207 = new class169(32);
                    method138(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field499[var9] = true;
                    }
                    return;
                } else if (var6 == 23 && field411 < 1) {
                    field411++;
                    field282 = 0;
                } else {
                    method126(var6);
                    return;
                }
            }
            if (field282 == 7 && Statics.field2909.method2562() > 0) {
                field342 = (Statics.field2909.method2571() + 3) * 60;
                field282 = 8;
            }
            if (field282 == 8) {
                field283 = 0;
                class26.method2611(class139.field2284, class139.field2153, field342 / 60 + class139.field2266);
                if (--field342 <= 0) {
                    field282 = 0;
                }
            } else {
                if (field282 == 9 && Statics.field2909.method2562() >= 8) {
                    field470 = Statics.field2909.method2571();
                    field416 = Statics.field2909.method2571() == 1;
                    field372 = Statics.field2909.method2571();
                    field372 <<= 0x8;
                    field372 += Statics.field2909.method2571();
                    field373 = Statics.field2909.method2571();
                    Statics.field2909.method2563(field291.field1808, 0, 1);
                    field291.field1806 = 0;
                    field319 = field291.method2374();
                    Statics.field2909.method2563(field291.field1808, 0, 2);
                    field291.field1806 = 0;
                    field292 = field291.method2132();
                    if (field373 == 1) {
                        try {
                            client var10 = Statics.field247;
                            JSObject.getWindow(var10).call("zap", (Object[]) null);
                        } catch (Throwable var28) {
                        }
                    } else {
                        try {
                            client var12 = Statics.field247;
                            JSObject.getWindow(var12).call("unzap", (Object[]) null);
                        } catch (Throwable var27) {
                        }
                    }
                    field282 = 10;
                }
                if (field282 != 10) {
                    field283++;
                    if (field283 > 2000) {
                        if (field411 < 1) {
                            if (Statics.field528 == Statics.field1643) {
                                Statics.field528 = Statics.field865;
                            } else {
                                Statics.field528 = Statics.field1643;
                            }
                            field411++;
                            field282 = 0;
                        } else {
                            method126(-3);
                        }
                    }
                } else if (Statics.field2909.method2562() >= field292) {
                    field291.field1806 = 0;
                    Statics.field2909.method2563(field291.field1808, 0, field292);
                    field260 = 1L;
                    field263 = -1;
                    Statics.field193.field173 = 0;
                    Statics.field1607 = true;
                    field264 = true;
                    field472 = -1L;
                    class179.method1002();
                    field289.field1806 = 0;
                    field291.field1806 = 0;
                    field319 = -1;
                    field485 = -1;
                    field298 = -1;
                    field299 = -1;
                    field294 = 0;
                    field266 = 0;
                    field259 = 0;
                    field267 = 0;
                    field390 = 0;
                    field389 = false;
                    class124.method3(0);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field456[var14] = null;
                    }
                    field432 = 0;
                    field401 = 0;
                    field403 = false;
                    field377 = 0;
                    field311 = (int) (Math.random() * 100.0D) - 50;
                    field313 = (int) (Math.random() * 110.0D) - 55;
                    field315 = (int) (Math.random() * 80.0D) - 40;
                    field445 = (int) (Math.random() * 120.0D) - 60;
                    field320 = (int) (Math.random() * 30.0D) - 20;
                    field306 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field273 = 0;
                    field475 = -1;
                    field480 = 0;
                    field481 = 0;
                    field440 = class17.field516;
                    field367 = 0;
                    field287 = 0;
                    for (int var15 = 0; var15 < 2048; var15++) {
                        field366[var15] = null;
                        field280[var15] = null;
                    }
                    for (int var16 = 0; var16 < 32768; var16++) {
                        field410[var16] = null;
                    }
                    Statics.field944 = field366[2047] = new class3();
                    field380 = -1;
                    field383.method3171();
                    field384.method3171();
                    for (int var17 = 0; var17 < 4; var17++) {
                        for (int var18 = 0; var18 < 104; var18++) {
                            for (int var19 = 0; var19 < 104; var19++) {
                                field381[var17][var18][var19] = null;
                            }
                        }
                    }
                    field382 = new class171();
                    field501 = 0;
                    field491 = 0;
                    field504 = 0;
                    for (int var20 = 0; var20 < Statics.field1030; var20++) {
                        class43 var21 = class43.method102(var20);
                        if (var21 != null) {
                            class150.field2602[var20] = 0;
                            class150.field2603[var20] = 0;
                        }
                    }
                    for (int var22 = 0; var22 < field452.length; var22++) {
                        field452[var22] = -1;
                    }
                    field365 = -1;
                    if (field361 != -1) {
                        class148.method2367(field361);
                    }
                    for (class4 var23 = (class4) field408.method3156(); var23 != null; var23 = (class4) field408.method3157()) {
                        method134(var23, true);
                    }
                    field361 = -1;
                    field408 = new class169(8);
                    field446 = null;
                    field389 = false;
                    field390 = 0;
                    field506.method2907((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var24 = 0; var24 < 8; var24++) {
                        field398[var24] = null;
                        field378[var24] = false;
                    }
                    class13.field207 = new class169(32);
                    field258 = true;
                    for (int var25 = 0; var25 < 100; var25++) {
                        field499[var25] = true;
                    }
                    field350 = null;
                    Statics.field418 = 0;
                    Statics.field1311 = null;
                    Statics.field2115 = -1;
                    method2795(false);
                    field319 = -1;
                }
            }
        } catch (IOException var29) {
            if (field411 < 1) {
                if (Statics.field528 == Statics.field1643) {
                    Statics.field528 = Statics.field865;
                } else {
                    Statics.field528 = Statics.field1643;
                }
                field411++;
                field282 = 0;
            } else {
                method126(-2);
            }
        }
    }

    @ObfuscatedName("d.n(IB)V")
    public static void method126(int arg0) {
        if (arg0 == -3) {
            class26.method2611(class139.field2155, class139.field2156, class139.field2188);
        } else if (arg0 == -2) {
            class26.method2611(class139.field2288, class139.field2159, class139.field2160);
        } else if (arg0 == -1) {
            class26.method2611(class139.field2161, class139.field2203, class139.field2163);
        } else if (arg0 == 3) {
            class26.method2611(class139.field2318, class139.field2165, class139.field2166);
        } else if (arg0 == 4) {
            class26.method2611(class139.field2326, class139.field2168, class139.field2169);
        } else if (arg0 == 5) {
            class26.method2611(class139.field2234, class139.field2171, class139.field2172);
        } else if (arg0 == 6) {
            class26.method2611(class139.field2173, class139.field2123, class139.field2175);
        } else if (arg0 == 7) {
            class26.method2611(class139.field2154, class139.field2177, class139.field2178);
        } else if (arg0 == 8) {
            class26.method2611(class139.field2179, class139.field2286, class139.field2181);
        } else if (arg0 == 9) {
            class26.method2611(class139.field2182, class139.field2324, class139.field2184);
        } else if (arg0 == 10) {
            class26.method2611(class139.field2185, class139.field2186, class139.field2187);
        } else if (arg0 == 11) {
            class26.method2611(class139.field2242, class139.field2189, class139.field2192);
        } else if (arg0 == 12) {
            class26.method2611(class139.field2191, class139.field2158, class139.field2193);
        } else if (arg0 == 13) {
            class26.method2611(class139.field2194, class139.field2195, class139.field2196);
        } else if (arg0 == 14) {
            class26.method2611(class139.field2197, class139.field2198, class139.field2180);
        } else if (arg0 == 16) {
            class26.method2611(class139.field2137, class139.field2126, class139.field2213);
        } else if (arg0 == 17) {
            class26.method2611(class139.field2217, class139.field2204, class139.field2205);
        } else if (arg0 == 18) {
            class26.method2611(class139.field2206, class139.field2207, class139.field2350);
        } else if (arg0 == 19) {
            class26.method2611(class139.field2209, class139.field2210, class139.field2211);
        } else if (arg0 == 20) {
            class26.method2611(class139.field2212, class139.field2271, class139.field2316);
        } else if (arg0 == 22) {
            class26.method2611(class139.field2349, class139.field2216, class139.field2358);
        } else if (arg0 == 23) {
            class26.method2611(class139.field2218, class139.field2219, class139.field2220);
        } else if (arg0 == 24) {
            class26.method2611(class139.field2221, class139.field2222, class139.field2223);
        } else if (arg0 == 25) {
            class26.method2611(class139.field2224, class139.field2276, class139.field2357);
        } else if (arg0 == 26) {
            class26.method2611(class139.field2227, class139.field2228, class139.field2229);
        } else if (arg0 == 27) {
            class26.method2611(class139.field2208, class139.field2215, class139.field2232);
        } else if (arg0 == 31) {
            class26.method2611(class139.field2239, class139.field2240, class139.field2241);
        } else if (arg0 == 32) {
            class26.method2611(class139.field2145, class139.field2293, class139.field2250);
        } else if (arg0 == 37) {
            class26.method2611(class139.field2245, class139.field2152, class139.field2231);
        } else if (arg0 == 38) {
            class26.method2611(class139.field2248, class139.field2249, class139.field2176);
        } else if (arg0 == 55) {
            class26.method2611(class139.field2251, class139.field2252, class139.field2253);
        } else {
            class26.method2611(class139.field2235, class139.field2260, class139.field2167);
        }
        method138(10);
    }

    @ObfuscatedName("client.l(I)V")
    public static final void method473() {
        if (Statics.field2909 != null) {
            Statics.field2909.method2560();
            Statics.field2909 = null;
        }
        method825();
        Statics.field878.method1587();
        for (int var0 = 0; var0 < 4; var0++) {
            field307[var0].method3399();
        }
        System.gc();
        class157.method1962(2);
        field312 = -1;
        field421 = false;
        class19.method1045();
        method138(10);
    }

    @ObfuscatedName("ag.c(I)V")
    public static final void method825() {
        class38.field928.method3134();
        class34.field862.method3134();
        class37.field914.method3134();
        class33.method3123();
        class32.method1959();
        class42.method2329();
        class35.method511();
        class36.field889.method3134();
        class36.field900.method3134();
        class39.field947.method3134();
        class43.method1321();
        class153.method87();
        class148.method2796();
        ((class85) Statics.field1445).method1854();
        class18.field525.method3134();
        Statics.field1729.method2773();
        Statics.field462.method2773();
        Statics.field2076.method2773();
        Statics.field1085.method2773();
        Statics.field658.method2773();
        Statics.field1996.method2773();
        Statics.field802.method2773();
        Statics.field56.method2773();
        Statics.field1237.method2773();
        Statics.field2014.method2773();
        Statics.field67.method2773();
        Statics.field58.method2773();
    }

    @ObfuscatedName("cv.b(I)V")
    public static final void method1971() {
        if (field266 > 1) {
            field266--;
        }
        if (field259 > 0) {
            field259--;
        }
        if (field300) {
            field300 = false;
            if (field259 > 0) {
                method473();
            } else {
                method138(40);
                Statics.field565 = Statics.field2909;
                Statics.field2909 = null;
            }
            return;
        }
        if (!field389) {
            field395[0] = class139.field2190;
            field321[0] = "";
            field246[0] = 1006;
            field390 = 1;
        }
        for (int var0 = 0; var0 < 100 && method161(); var0++) {
        }
        if (field257 != 30) {
            return;
        }
        class179.method122(field289, 65);
        Object var1 = Statics.field193.field177;
        synchronized (Statics.field193.field177) {
            if (!field248) {
                Statics.field193.field173 = 0;
            } else if (class124.field1972 != 0 || Statics.field193.field173 >= 40) {
                field289.method2372(9);
                field289.method2133(0);
                int var2 = field289.field1806;
                int var3 = 0;
                for (int var4 = 0; var4 < Statics.field193.field173 && field289.field1806 - var2 < 240; var4++) {
                    var3++;
                    int var5 = Statics.field193.field175[var4];
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > 502) {
                        var5 = 502;
                    }
                    int var6 = Statics.field193.field181[var4];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var7 = var5 * 765 + var6;
                    if (Statics.field193.field175[var4] == -1 && Statics.field193.field181[var4] == -1) {
                        var6 = -1;
                        var5 = -1;
                        var7 = 524287;
                    }
                    if (field261 != var6 || field431 != var5) {
                        int var8 = var6 - field261;
                        field261 = var6;
                        int var9 = var5 - field431;
                        field431 = var5;
                        if (field263 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                            var8 += 32;
                            var9 += 32;
                            field289.method2117((field263 << 12) + (var8 << 6) + var9);
                            field263 = 0;
                        } else if (field263 < 8) {
                            field289.method2118((field263 << 19) + 8388608 + var7);
                            field263 = 0;
                        } else {
                            field289.method2131((field263 << 19) + -1073741824 + var7);
                            field263 = 0;
                        }
                    } else if (field263 < 2047) {
                        field263++;
                    }
                }
                field289.method2127(field289.field1806 - var2);
                if (var3 >= Statics.field193.field173) {
                    Statics.field193.field173 = 0;
                } else {
                    Statics.field193.field173 -= var3;
                    for (int var10 = 0; var10 < Statics.field193.field173; var10++) {
                        Statics.field193.field181[var10] = Statics.field193.field181[var3 + var10];
                        Statics.field193.field175[var10] = Statics.field193.field175[var3 + var10];
                    }
                }
            }
        }
        if (class124.field1972 == 1 || !Statics.field1067 && class124.field1972 == 4 || class124.field1972 == 2) {
            long var12 = (class124.field1978 - field260 * -1L) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            field260 = class124.field1978 * -1L;
            int var14 = class124.field1977;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class124.field1976;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = var14 * 765 + var15;
            byte var17 = 0;
            if (class124.field1972 == 2) {
                var17 = 1;
            }
            int var18 = (int) var12;
            field289.method2372(86);
            field289.method2131((var17 << 19) + (var18 << 20) + var16);
        }
        if (class121.field1936 > 0) {
            field289.method2372(245);
            field289.method2117(0);
            int var19 = field289.field1806;
            long var20 = class100.method100();
            for (int var22 = 0; var22 < class121.field1936; var22++) {
                long var23 = var20 - field472;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field472 = var20;
                field289.method2193((int) var23);
                field289.method2133(class121.field1935[var22]);
            }
            field289.method2126(field289.field1806 - var19);
        }
        if (field334 > 0) {
            field334--;
        }
        if (class121.field1929[96] || class121.field1929[97] || class121.field1929[98] || class121.field1929[99]) {
            field308 = true;
        }
        if (field308 && field334 <= 0) {
            field334 = 20;
            field308 = false;
            field289.method2372(5);
            field289.method2117(field306);
            field289.method2117(field330);
        }
        if (Statics.field1607 && !field264) {
            field264 = true;
            field289.method2372(238);
            field289.method2133(1);
        }
        if (!Statics.field1607 && field264) {
            field264 = false;
            field289.method2372(238);
            field289.method2133(0);
        }
        method2453();
        if (field257 != 30) {
            return;
        }
        for (class14 var25 = (class14) field382.method3178(); var25 != null; var25 = (class14) field382.method3179()) {
            if (var25.field220 > 0) {
                var25.field220--;
            }
            if (var25.field220 != 0) {
                if (var25.field217 > 0) {
                    var25.field217--;
                }
                if (var25.field217 == 0 && var25.field209 >= 1 && var25.field210 >= 1 && var25.field209 <= 102 && var25.field210 <= 102 && (var25.field219 < 0 || class6.method1958(var25.field219, var25.field218))) {
                    method1969(var25.field212, var25.field216, var25.field209, var25.field210, var25.field219, var25.field211, var25.field218);
                    var25.field217 = -1;
                    if (var25.field219 == var25.field213 && var25.field213 == -1) {
                        var25.method3223();
                    } else if (var25.field219 == var25.field213 && var25.field214 == var25.field211 && var25.field218 == var25.field215) {
                        var25.method3223();
                    }
                }
            } else if (var25.field213 < 0 || class6.method1958(var25.field213, var25.field215)) {
                method1969(var25.field212, var25.field216, var25.field209, var25.field210, var25.field213, var25.field214, var25.field215);
                var25.method3223();
            }
        }
        int var10002;
        for (int var26 = 0; var26 < field377; var26++) {
            var10002 = field317[var26]--;
            if (field317[var26] >= -10) {
                class49 var28 = field405[var26];
                if (var28 == null) {
                    class49 var10000 = (class49) null;
                    var28 = class49.method1027(Statics.field1085, field489[var26], 0);
                    if (var28 == null) {
                        continue;
                    }
                    field317[var26] += var28.method1022();
                    field405[var26] = var28;
                }
                if (field317[var26] < 0) {
                    int var35;
                    if (field492[var26] == 0) {
                        var35 = field486;
                    } else {
                        int var29 = (field492[var26] & 0xFF) * 128;
                        int var30 = field492[var26] >> 16 & 0xFF;
                        int var31 = var30 * 128 + 64 - Statics.field944.field704;
                        if (var31 < 0) {
                            var31 = -var31;
                        }
                        int var32 = field492[var26] >> 8 & 0xFF;
                        int var33 = var32 * 128 + 64 - Statics.field944.field693;
                        if (var33 < 0) {
                            var33 = -var33;
                        }
                        int var34 = var31 + var33 - 128;
                        if (var34 > var29) {
                            field317[var26] = -100;
                            continue;
                        }
                        if (var34 < 0) {
                            var34 = 0;
                        }
                        var35 = field302 * (var29 - var34) / var29;
                    }
                    if (var35 > 0) {
                        class53 var36 = var28.method1021().method1063(Statics.field27);
                        class55 var37 = class55.method1085(var36, 100, var35);
                        var37.method1179(field490[var26] - 1);
                        Statics.field1962.method914(var37);
                    }
                    field317[var26] = -100;
                }
            } else {
                field377--;
                for (int var27 = var26; var27 < field377; var27++) {
                    field489[var27] = field489[var27 + 1];
                    field405[var27] = field405[var27 + 1];
                    field490[var27] = field490[var27 + 1];
                    field317[var27] = field317[var27 + 1];
                    field492[var27] = field492[var27 + 1];
                }
                var26--;
            }
        }
        if (field421) {
            boolean var38;
            if (class157.field2660 == 0) {
                var38 = Statics.field2665.method3049();
            } else {
                var38 = true;
            }
            if (!var38) {
                if (field483 != 0 && field312 != -1) {
                    class157.method1866(Statics.field1996, field312, 0, field483, false);
                }
                field421 = false;
            }
        }
        field294++;
        if (field294 <= 750) {
            method1868();
            for (int var39 = 0; var39 < field287; var39++) {
                int var40 = field288[var39];
                class28 var41 = field410[var40];
                if (var41 != null) {
                    method2428(var41, var41.field674.field789);
                }
            }
            for (int var42 = -1; var42 < field367; var42++) {
                int var43;
                if (var42 == -1) {
                    var43 = 2047;
                } else {
                    var43 = field368[var42];
                }
                class3 var44 = field366[var43];
                if (var44 != null && var44.field706 > 0) {
                    var44.field706--;
                    if (var44.field706 == 0) {
                        var44.field724 = null;
                    }
                }
            }
            for (int var45 = 0; var45 < field287; var45++) {
                int var46 = field288[var45];
                class28 var47 = field410[var46];
                if (var47 != null && var47.field706 > 0) {
                    var47.field706--;
                    if (var47.field706 == 0) {
                        var47.field724 = null;
                    }
                }
            }
            field323++;
            if (field356 != 0) {
                field303 += 20;
                if (field303 >= 400) {
                    field356 = 0;
                }
            }
            if (Statics.field1989 != null) {
                field357++;
                if (field357 >= 15) {
                    method141(Statics.field1989);
                    Statics.field1989 = null;
                }
            }
            class148 var48 = Statics.field178;
            class148 var49 = Statics.field1954;
            Statics.field178 = null;
            Statics.field1954 = null;
            field423 = null;
            field427 = false;
            field424 = false;
            field277 = 0;
            while (class121.method1961() && field277 < 128) {
                if (field470 >= 2 && class121.field1929[82] && Statics.field1632 == 66) {
                    String var50 = "";
                    for (int var51 = 0; var51 < field432 && var51 < 100; var51++) {
                        var50 = var50 + field460[var51] + ':' + field456[var51] + '\n';
                    }
                    Statics.field551.setContents(new StringSelection(var50), (ClipboardOwner) null);
                } else {
                    field355[field277] = Statics.field1632;
                    field252[field277] = Statics.field1621;
                    field277++;
                }
            }
            method769(field361, 0, 0, 765, 503, 0, 0);
            field318++;
            while (true) {
                class1 var52;
                class148 var53;
                class148 var54;
                do {
                    var52 = (class1) field391.method3182();
                    if (var52 == null) {
                        while (true) {
                            class1 var55;
                            class148 var56;
                            class148 var57;
                            do {
                                var55 = (class1) field447.method3182();
                                if (var55 == null) {
                                    while (true) {
                                        class1 var58;
                                        class148 var59;
                                        class148 var60;
                                        do {
                                            var58 = (class1) field341.method3182();
                                            if (var58 == null) {
                                                Statics.method2578();
                                                if (field419 != null) {
                                                    Statics.method1960();
                                                }
                                                if (Statics.field1035 != null) {
                                                    method141(Statics.field1035);
                                                    field352++;
                                                    if (class124.field1968 == 0) {
                                                        if (field336) {
                                                            if (Statics.field1035 == Statics.field1029 && field362 != field359) {
                                                                class148 var61 = Statics.field1035;
                                                                byte var62 = 0;
                                                                if (field471 == 1 && var61.field2481 == 206) {
                                                                    var62 = 1;
                                                                }
                                                                if (var61.field2579[field362] <= 0) {
                                                                    var62 = 0;
                                                                }
                                                                if (class152.method702(method2642(var61))) {
                                                                    int var63 = field359;
                                                                    int var64 = field362;
                                                                    var61.field2579[var64] = var61.field2579[var63];
                                                                    var61.field2580[var64] = var61.field2580[var63];
                                                                    var61.field2579[var63] = -1;
                                                                    var61.field2580[var63] = 0;
                                                                } else if (var62 == 1) {
                                                                    int var65 = field359;
                                                                    int var66 = field362;
                                                                    while (var65 != var66) {
                                                                        if (var65 > var66) {
                                                                            var61.method2822(var65 - 1, var65);
                                                                            var65--;
                                                                        } else if (var65 < var66) {
                                                                            var61.method2822(var65 + 1, var65);
                                                                            var65++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var61.method2822(field362, field359);
                                                                }
                                                                field289.method2372(151);
                                                                field289.method2231(field359);
                                                                field289.method2130(var62);
                                                                field289.method2151(field362);
                                                                field289.method2313(Statics.field1035.field2507);
                                                            }
                                                        } else if ((field388 == 1 || method2673(field390 - 1)) && field390 > 2) {
                                                            method26(field284, field285);
                                                        } else if (field390 > 0) {
                                                            int var67 = field284;
                                                            int var68 = field285;
                                                            method3115(Statics.field17, var67, var68);
                                                            Statics.field17 = null;
                                                        }
                                                        field357 = 10;
                                                        class124.field1972 = 0;
                                                        Statics.field1035 = null;
                                                    } else if (field352 >= 5 && (class124.field1969 > field284 + 5 || class124.field1969 < field284 - 5 || class124.field1970 > field285 + 5 || class124.field1970 < field285 - 5)) {
                                                        field336 = true;
                                                    }
                                                }
                                                if (class76.field1348 != -1) {
                                                    int var69 = class76.field1348;
                                                    int var70 = class76.field1355;
                                                    field289.method2372(50);
                                                    field289.method2133(5);
                                                    field289.method2151(Statics.field557 + var69);
                                                    field289.method2237(class121.field1929[82] ? (class121.field1929[81] ? 2 : 1) : 0);
                                                    field289.method2117(Statics.field172 + var70);
                                                    class76.field1348 = -1;
                                                    field434 = class124.field1976;
                                                    field278 = class124.field1977;
                                                    field356 = 1;
                                                    field303 = 0;
                                                    field480 = var69;
                                                    field481 = var70;
                                                }
                                                if (Statics.field178 != var48) {
                                                    if (var48 != null) {
                                                        method141(var48);
                                                    }
                                                    if (Statics.field178 != null) {
                                                        method141(Statics.field178);
                                                    }
                                                }
                                                if (Statics.field1954 != var49 && field400 == field399) {
                                                    if (var49 != null) {
                                                        method141(var49);
                                                    }
                                                    if (Statics.field1954 != null) {
                                                        method141(Statics.field1954);
                                                    }
                                                }
                                                if (Statics.field1954 == null) {
                                                    if (field399 > 0) {
                                                        field399--;
                                                    }
                                                } else if (field399 < field400) {
                                                    field399++;
                                                    if (field400 == field399) {
                                                        method141(Statics.field1954);
                                                    }
                                                }
                                                method42();
                                                if (field442) {
                                                    int var71 = Statics.field1862 * 128 + 64;
                                                    int var72 = Statics.field1307 * 128 + 64;
                                                    int var73 = method11(var71, var72, Statics.field1795) - Statics.field2869;
                                                    if (Statics.field1389 < var71) {
                                                        Statics.field1389 += Statics.field2019 * (var71 - Statics.field1389) / 1000 + Statics.field511;
                                                        if (Statics.field1389 > var71) {
                                                            Statics.field1389 = var71;
                                                        }
                                                    }
                                                    if (Statics.field1389 > var71) {
                                                        Statics.field1389 -= Statics.field2019 * (Statics.field1389 - var71) / 1000 + Statics.field511;
                                                        if (Statics.field1389 < var71) {
                                                            Statics.field1389 = var71;
                                                        }
                                                    }
                                                    if (Statics.field223 < var73) {
                                                        Statics.field223 += Statics.field2019 * (var73 - Statics.field223) / 1000 + Statics.field511;
                                                        if (Statics.field223 > var73) {
                                                            Statics.field223 = var73;
                                                        }
                                                    }
                                                    if (Statics.field223 > var73) {
                                                        Statics.field223 -= Statics.field2019 * (Statics.field223 - var73) / 1000 + Statics.field511;
                                                        if (Statics.field223 < var73) {
                                                            Statics.field223 = var73;
                                                        }
                                                    }
                                                    if (Statics.field2051 < var72) {
                                                        Statics.field2051 += Statics.field2019 * (var72 - Statics.field2051) / 1000 + Statics.field511;
                                                        if (Statics.field2051 > var72) {
                                                            Statics.field2051 = var72;
                                                        }
                                                    }
                                                    if (Statics.field2051 > var72) {
                                                        Statics.field2051 -= Statics.field2019 * (Statics.field2051 - var72) / 1000 + Statics.field511;
                                                        if (Statics.field2051 < var72) {
                                                            Statics.field2051 = var72;
                                                        }
                                                    }
                                                    int var74 = Statics.field66 * 128 + 64;
                                                    int var75 = Statics.field133 * 128 + 64;
                                                    int var76 = method11(var74, var75, Statics.field1795) - Statics.field953;
                                                    int var77 = var74 - Statics.field1389;
                                                    int var78 = var76 - Statics.field223;
                                                    int var79 = var75 - Statics.field2051;
                                                    int var80 = (int) Math.sqrt((double) (var77 * var77 + var79 * var79));
                                                    int var81 = (int) (Math.atan2((double) var78, (double) var80) * 325.949D) & 0x7FF;
                                                    int var82 = (int) (Math.atan2((double) var77, (double) var79) * -325.949D) & 0x7FF;
                                                    if (var81 < 128) {
                                                        var81 = 128;
                                                    }
                                                    if (var81 > 383) {
                                                        var81 = 383;
                                                    }
                                                    if (Statics.field2369 < var81) {
                                                        Statics.field2369 += Statics.field629 * (var81 - Statics.field2369) / 1000 + Statics.field1846;
                                                        if (Statics.field2369 > var81) {
                                                            Statics.field2369 = var81;
                                                        }
                                                    }
                                                    if (Statics.field2369 > var81) {
                                                        Statics.field2369 -= Statics.field629 * (Statics.field2369 - var81) / 1000 + Statics.field1846;
                                                        if (Statics.field2369 < var81) {
                                                            Statics.field2369 = var81;
                                                        }
                                                    }
                                                    int var83 = var82 - Statics.field1640;
                                                    if (var83 > 1024) {
                                                        var83 -= 2048;
                                                    }
                                                    if (var83 < -1024) {
                                                        var83 += 2048;
                                                    }
                                                    if (var83 > 0) {
                                                        Statics.field1640 += Statics.field629 * var83 / 1000 + Statics.field1846;
                                                        Statics.field1640 &= 0x7FF;
                                                    }
                                                    if (var83 < 0) {
                                                        Statics.field1640 -= Statics.field629 * -var83 / 1000 + Statics.field1846;
                                                        Statics.field1640 &= 0x7FF;
                                                    }
                                                    int var84 = var82 - Statics.field1640;
                                                    if (var84 > 1024) {
                                                        var84 -= 2048;
                                                    }
                                                    if (var84 < -1024) {
                                                        var84 += 2048;
                                                    }
                                                    if (var84 < 0 && var83 > 0 || var84 > 0 && var83 < 0) {
                                                        Statics.field1640 = var82;
                                                    }
                                                }
                                                for (int var85 = 0; var85 < 5; var85++) {
                                                    var10002 = field396[var85]++;
                                                }
                                                int var86 = Statics.method2797();
                                                int var87 = class121.method2058();
                                                if (var86 > 15000 && var87 > 15000) {
                                                    field259 = 250;
                                                    class124.method3(14500);
                                                    field289.method2372(36);
                                                }
                                                field482++;
                                                if (field482 > 500) {
                                                    field482 = 0;
                                                    int var88 = (int) (Math.random() * 8.0D);
                                                    if ((var88 & 0x1) == 1) {
                                                        field311 += field404;
                                                    }
                                                    if ((var88 & 0x2) == 2) {
                                                        field313 += field314;
                                                    }
                                                    if ((var88 & 0x4) == 4) {
                                                        field315 += field316;
                                                    }
                                                }
                                                if (field311 < -50) {
                                                    field404 = 2;
                                                }
                                                if (field311 > 50) {
                                                    field404 = -2;
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
                                                field322++;
                                                if (field322 > 500) {
                                                    field322 = 0;
                                                    int var89 = (int) (Math.random() * 8.0D);
                                                    if ((var89 & 0x1) == 1) {
                                                        field445 += field393;
                                                    }
                                                    if ((var89 & 0x2) == 2) {
                                                        field320 += field335;
                                                    }
                                                }
                                                if (field445 < -60) {
                                                    field393 = 2;
                                                }
                                                if (field445 > 60) {
                                                    field393 = -2;
                                                }
                                                if (field320 < -20) {
                                                    field335 = 1;
                                                }
                                                if (field320 > 10) {
                                                    field335 = -1;
                                                }
                                                for (class31 var90 = (class31) field503.method3145(); var90 != null; var90 = (class31) field503.method3149()) {
                                                    if ((long) var90.field750 < class100.method100() / 1000L - 5L) {
                                                        if (var90.field752 > 0) {
                                                            method2508(5, "", var90.field751 + class139.field2257);
                                                        }
                                                        if (var90.field752 == 0) {
                                                            method2508(5, "", var90.field751 + class139.field2258);
                                                        }
                                                        var90.method3222();
                                                    }
                                                }
                                                field295++;
                                                if (field295 > 50) {
                                                    field289.method2372(169);
                                                }
                                                try {
                                                    if (Statics.field2909 != null && field289.field1806 > 0) {
                                                        Statics.field2909.method2564(field289.field1808, 0, field289.field1806);
                                                        field289.field1806 = 0;
                                                        field295 = 0;
                                                    }
                                                } catch (IOException var92) {
                                                    if (field259 > 0) {
                                                        method473();
                                                    } else {
                                                        method138(40);
                                                        Statics.field565 = Statics.field2909;
                                                        Statics.field2909 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var59 = var58.field11;
                                            if (var59.field2527 < 0) {
                                                break;
                                            }
                                            var60 = class148.method1290(var59.field2502);
                                        } while (var60 == null || var60.field2585 == null || var59.field2527 >= var60.field2585.length || var60.field2585[var59.field2527] != var59);
                                        class29.method2814(var58);
                                    }
                                }
                                var56 = var55.field11;
                                if (var56.field2527 < 0) {
                                    break;
                                }
                                var57 = class148.method1290(var56.field2502);
                            } while (var57 == null || var57.field2585 == null || var56.field2527 >= var57.field2585.length || var57.field2585[var56.field2527] != var56);
                            class29.method2814(var55);
                        }
                    }
                    var53 = var52.field11;
                    if (var53.field2527 < 0) {
                        break;
                    }
                    var54 = class148.method1290(var53.field2502);
                } while (var54 == null || var54.field2585 == null || var53.field2527 >= var54.field2585.length || var54.field2585[var53.field2527] != var53);
                class29.method2814(var52);
            }
        } else if (field259 > 0) {
            method473();
        } else {
            method138(40);
            Statics.field565 = Statics.field2909;
            Statics.field2909 = null;
        }
    }

    @ObfuscatedName("di.s(I)V")
    public static final void method2371() {
        if (Statics.field946 != null) {
            Statics.field946.method956();
        }
        if (Statics.field1950 != null) {
            Statics.field1950.method956();
        }
    }

    @ObfuscatedName("p.o(Laf;IIII)V")
    public static void method151(class35 arg0, int arg1, int arg2, int arg3) {
        if (field377 >= 50 || field302 == 0 || arg0.field880 == null || arg1 >= arg0.field880.length) {
            return;
        }
        int var4 = arg0.field880[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field489[field377] = var5;
        field490[field377] = var6;
        field317[field377] = 0;
        field405[field377] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field492[field377] = (var8 << 16) + (var9 << 8) + var7;
        field377++;
    }

    @ObfuscatedName("g.h(III)V")
    public static void method35(int arg0, int arg1) {
        if (field483 != 0 && arg0 != -1) {
            class157.method1866(Statics.field67, arg0, 0, field483, false);
            field421 = true;
        }
    }

    @ObfuscatedName("dz.x(I)V")
    public static final void method2453() {
        if (field458 && Statics.field1795 != field301) {
            method651(Statics.field2115, Statics.field2437, Statics.field1795, Statics.field944.field732[0], Statics.field944.field745[0]);
        } else if (Statics.field1795 != field475) {
            field475 = Statics.field1795;
            method31(Statics.field1795);
        }
    }

    @ObfuscatedName("db.e(III)V")
    public static final void method2395(int arg0, int arg1) {
        if (field273 != 0 && field273 != 3 || class124.field1972 != 1 && Statics.field1067 || class124.field1972 != 4) {
            return;
        }
        int var2 = class124.field1976 - 25 - arg0;
        int var3 = class124.field1977 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field445 + field306 & 0x7FF;
        int var5 = class81.field1448[var4];
        int var6 = class81.field1449[var4];
        int var7 = (field320 + 256) * var5 >> 8;
        int var8 = (field320 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field944.field704 + var9 >> 7;
        int var12 = Statics.field944.field693 - var10 >> 7;
        field289.method2372(42);
        field289.method2133(18);
        field289.method2151(Statics.field557 + var11);
        field289.method2237(class121.field1929[82] ? (class121.field1929[81] ? 2 : 1) : 0);
        field289.method2117(Statics.field172 + var12);
        field289.method2133(var2);
        field289.method2133(var3);
        field289.method2117(field306);
        field289.method2133(57);
        field289.method2133(field445);
        field289.method2133(field320);
        field289.method2133(89);
        field289.method2117(Statics.field944.field704);
        field289.method2117(Statics.field944.field693);
        field289.method2133(63);
        field480 = var11;
        field481 = var12;
    }

    @ObfuscatedName("r.z(I)V")
    public static final void method42() {
        int var0 = field311 + Statics.field944.field704;
        int var1 = field313 + Statics.field944.field693;
        if (Statics.field98 - var0 < -500 || Statics.field98 - var0 > 500 || Statics.field837 - var1 < -500 || Statics.field837 - var1 > 500) {
            Statics.field98 = var0;
            Statics.field837 = var1;
        }
        if (Statics.field98 != var0) {
            Statics.field98 += (var0 - Statics.field98) / 16;
        }
        if (Statics.field837 != var1) {
            Statics.field837 += (var1 - Statics.field837) / 16;
        }
        if (class124.field1968 == 4 && Statics.field1067) {
            int var2 = class124.field1970 - field508;
            field333 = var2 * 2;
            field508 = var2 == -1 || var2 == 1 ? class124.field1970 : (field508 + class124.field1970) / 2;
            int var3 = field510 - class124.field1969;
            field262 = var3 * 2;
            field510 = var3 == -1 || var3 == 1 ? class124.field1969 : (field510 + class124.field1969) / 2;
        } else {
            if (class121.field1929[96]) {
                field262 += (-24 - field262) / 2;
            } else if (class121.field1929[97]) {
                field262 += (24 - field262) / 2;
            } else {
                field262 /= 2;
            }
            if (class121.field1929[98]) {
                field333 += (12 - field333) / 2;
            } else if (class121.field1929[99]) {
                field333 += (-12 - field333) / 2;
            } else {
                field333 /= 2;
            }
            field508 = class124.field1970;
            field510 = class124.field1969;
        }
        field306 = field262 / 2 + field306 & 0x7FF;
        field330 += field333 / 2;
        if (field330 < 128) {
            field330 = 128;
        }
        if (field330 > 383) {
            field330 = 383;
        }
        int var4 = Statics.field98 >> 7;
        int var5 = Statics.field837 >> 7;
        int var6 = method11(Statics.field98, Statics.field837, Statics.field1795);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1795;
                    if (var10 < 3 && (class6.field93[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field97[var10][var8][var9];
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
        if (var12 > field338) {
            field338 += (var12 - field338) / 24;
        } else if (var12 < field338) {
            field338 += (var12 - field338) / 80;
        }
    }

    @ObfuscatedName("cm.az(I)V")
    public static final void method1868() {
        for (int var0 = -1; var0 < field367; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field368[var0];
            }
            class3 var2 = field366[var1];
            if (var2 != null) {
                method2428(var2, 1);
            }
        }
    }

    @ObfuscatedName("dp.av(Lah;II)V")
    public static final void method2428(class30 arg0, int arg1) {
        if (arg0.field744 > field463) {
            int var2 = arg0.field744 - field463;
            int var3 = arg0.field703 * 128 + arg0.field696 * 64;
            int var4 = arg0.field733 * 128 + arg0.field696 * 64;
            arg0.field704 += (var3 - arg0.field704) / var2;
            arg0.field693 += (var4 - arg0.field693) / var2;
            arg0.field747 = 0;
            if (arg0.field748 == 0) {
                arg0.field743 = 1024;
            }
            if (arg0.field748 == 1) {
                arg0.field743 = 1536;
            }
            if (arg0.field748 == 2) {
                arg0.field743 = 0;
            }
            if (arg0.field748 == 3) {
                arg0.field743 = 512;
            }
        } else if (arg0.field736 >= field463) {
            if (field463 == arg0.field736 || arg0.field721 == -1 || arg0.field749 != 0 || arg0.field700 + 1 > class35.method162(arg0.field721).field884[arg0.field716]) {
                int var5 = arg0.field736 - arg0.field744;
                int var6 = field463 - arg0.field744;
                int var7 = arg0.field703 * 128 + arg0.field696 * 64;
                int var8 = arg0.field733 * 128 + arg0.field696 * 64;
                int var9 = arg0.field723 * 128 + arg0.field696 * 64;
                int var10 = arg0.field734 * 128 + arg0.field696 * 64;
                arg0.field704 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field693 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field747 = 0;
            if (arg0.field748 == 0) {
                arg0.field743 = 1024;
            }
            if (arg0.field748 == 1) {
                arg0.field743 = 1536;
            }
            if (arg0.field748 == 2) {
                arg0.field743 = 0;
            }
            if (arg0.field748 == 3) {
                arg0.field743 = 512;
            }
            arg0.field694 = arg0.field743;
        } else {
            arg0.field718 = arg0.field731;
            if (arg0.field710 == 0) {
                arg0.field747 = 0;
            } else {
                label359: {
                    if (arg0.field721 != -1 && arg0.field749 == 0) {
                        class35 var11 = class35.method162(arg0.field721);
                        if (arg0.field725 > 0 && var11.field882 == 0) {
                            arg0.field747++;
                            break label359;
                        }
                        if (arg0.field725 <= 0 && var11.field866 == 0) {
                            arg0.field747++;
                            break label359;
                        }
                    }
                    int var12 = arg0.field704;
                    int var13 = arg0.field693;
                    int var14 = arg0.field732[arg0.field710 - 1] * 128 + arg0.field696 * 64;
                    int var15 = arg0.field745[arg0.field710 - 1] * 128 + arg0.field696 * 64;
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        if (var12 < var14) {
                            if (var13 < var15) {
                                arg0.field743 = 1280;
                            } else if (var13 > var15) {
                                arg0.field743 = 1792;
                            } else {
                                arg0.field743 = 1536;
                            }
                        } else if (var12 > var14) {
                            if (var13 < var15) {
                                arg0.field743 = 768;
                            } else if (var13 > var15) {
                                arg0.field743 = 256;
                            } else {
                                arg0.field743 = 512;
                            }
                        } else if (var13 < var15) {
                            arg0.field743 = 1024;
                        } else if (var13 > var15) {
                            arg0.field743 = 0;
                        }
                        int var16 = arg0.field743 - arg0.field694 & 0x7FF;
                        if (var16 > 1024) {
                            var16 -= 2048;
                        }
                        int var17 = arg0.field701;
                        if (var16 >= -256 && var16 <= 256) {
                            var17 = arg0.field726;
                        } else if (var16 >= 256 && var16 < 768) {
                            var17 = arg0.field705;
                        } else if (var16 >= -768 && var16 <= -256) {
                            var17 = arg0.field702;
                        }
                        if (var17 == -1) {
                            var17 = arg0.field726;
                        }
                        arg0.field718 = var17;
                        int var18 = 4;
                        boolean var19 = true;
                        if (arg0 instanceof class28) {
                            var19 = ((class28) arg0).field674.field788;
                        }
                        if (var19) {
                            if (arg0.field743 != arg0.field694 && arg0.field715 == -1 && arg0.field742 != 0) {
                                var18 = 2;
                            }
                            if (arg0.field710 > 2) {
                                var18 = 6;
                            }
                            if (arg0.field710 > 3) {
                                var18 = 8;
                            }
                            if (arg0.field747 > 0 && arg0.field710 > 1) {
                                var18 = 8;
                                arg0.field747--;
                            }
                        } else {
                            if (arg0.field710 > 1) {
                                var18 = 6;
                            }
                            if (arg0.field710 > 2) {
                                var18 = 8;
                            }
                            if (arg0.field747 > 0 && arg0.field710 > 1) {
                                var18 = 8;
                                arg0.field747--;
                            }
                        }
                        if (arg0.field746[arg0.field710 - 1]) {
                            var18 <<= 0x1;
                        }
                        if (var18 >= 8 && arg0.field726 == arg0.field718 && arg0.field737 != -1) {
                            arg0.field718 = arg0.field737;
                        }
                        if (var12 < var14) {
                            arg0.field704 += var18;
                            if (arg0.field704 > var14) {
                                arg0.field704 = var14;
                            }
                        } else if (var12 > var14) {
                            arg0.field704 -= var18;
                            if (arg0.field704 < var14) {
                                arg0.field704 = var14;
                            }
                        }
                        if (var13 < var15) {
                            arg0.field693 += var18;
                            if (arg0.field693 > var15) {
                                arg0.field693 = var15;
                            }
                        } else if (var13 > var15) {
                            arg0.field693 -= var18;
                            if (arg0.field693 < var15) {
                                arg0.field693 = var15;
                            }
                        }
                        if (arg0.field704 == var14 && arg0.field693 == var15) {
                            arg0.field710--;
                            if (arg0.field725 > 0) {
                                arg0.field725--;
                            }
                        }
                    } else {
                        arg0.field704 = var14;
                        arg0.field693 = var15;
                    }
                }
            }
        }
        if (arg0.field704 < 128 || arg0.field693 < 128 || arg0.field704 >= 13184 || arg0.field693 >= 13184) {
            arg0.field721 = -1;
            arg0.field697 = -1;
            arg0.field744 = 0;
            arg0.field736 = 0;
            arg0.field704 = arg0.field732[0] * 128 + arg0.field696 * 64;
            arg0.field693 = arg0.field745[0] * 128 + arg0.field696 * 64;
            arg0.method564();
        }
        if (Statics.field944 == arg0 && (arg0.field704 < 1536 || arg0.field693 < 1536 || arg0.field704 >= 11776 || arg0.field693 >= 11776)) {
            arg0.field721 = -1;
            arg0.field697 = -1;
            arg0.field744 = 0;
            arg0.field736 = 0;
            arg0.field704 = arg0.field732[0] * 128 + arg0.field696 * 64;
            arg0.field693 = arg0.field745[0] * 128 + arg0.field696 * 64;
            arg0.method564();
        }
        method2675(arg0);
        arg0.field727 = false;
        if (arg0.field718 != -1) {
            class35 var20 = class35.method162(arg0.field718);
            if (var20 == null || var20.field870 == null) {
                arg0.field718 = -1;
            } else {
                arg0.field720++;
                if (arg0.field719 < var20.field870.length && arg0.field720 > var20.field884[arg0.field719]) {
                    arg0.field720 = 1;
                    arg0.field719++;
                    method151(var20, arg0.field719, arg0.field704, arg0.field693);
                }
                if (arg0.field719 >= var20.field870.length) {
                    arg0.field720 = 0;
                    arg0.field719 = 0;
                    method151(var20, arg0.field719, arg0.field704, arg0.field693);
                }
            }
        }
        if (arg0.field697 != -1 && field463 >= arg0.field729) {
            if (arg0.field722 < 0) {
                arg0.field722 = 0;
            }
            int var21 = class36.method2678(arg0.field697).field893;
            if (var21 == -1) {
                arg0.field697 = -1;
            } else {
                class35 var22 = class35.method162(var21);
                if (var22 == null || var22.field870 == null) {
                    arg0.field697 = -1;
                } else {
                    arg0.field695++;
                    if (arg0.field722 < var22.field870.length && arg0.field695 > var22.field884[arg0.field722]) {
                        arg0.field695 = 1;
                        arg0.field722++;
                        method151(var22, arg0.field722, arg0.field704, arg0.field693);
                    }
                    if (arg0.field722 >= var22.field870.length && (arg0.field722 < 0 || arg0.field722 >= var22.field870.length)) {
                        arg0.field697 = -1;
                    }
                }
            }
        }
        if (arg0.field721 != -1 && arg0.field749 <= 1) {
            class35 var23 = class35.method162(arg0.field721);
            if (var23.field882 == 1 && arg0.field725 > 0 && arg0.field744 <= field463 && arg0.field736 < field463) {
                arg0.field749 = 1;
                return;
            }
        }
        if (arg0.field721 != -1 && arg0.field749 == 0) {
            class35 var24 = class35.method162(arg0.field721);
            if (var24 == null || var24.field870 == null) {
                arg0.field721 = -1;
            } else {
                arg0.field700++;
                if (arg0.field716 < var24.field870.length && arg0.field700 > var24.field884[arg0.field716]) {
                    arg0.field700 = 1;
                    arg0.field716++;
                    method151(var24, arg0.field716, arg0.field704, arg0.field693);
                }
                if (arg0.field716 >= var24.field870.length) {
                    arg0.field716 -= var24.field872;
                    arg0.field740++;
                    if (arg0.field740 >= var24.field879) {
                        arg0.field721 = -1;
                    } else if (arg0.field716 >= 0 && arg0.field716 < var24.field870.length) {
                        method151(var24, arg0.field716, arg0.field704, arg0.field693);
                    } else {
                        arg0.field721 = -1;
                    }
                }
                arg0.field727 = var24.field876;
            }
        }
        if (arg0.field749 > 0) {
            arg0.field749--;
        }
    }

    @ObfuscatedName("et.ay(Lah;I)V")
    public static final void method2675(class30 arg0) {
        if (arg0.field742 == 0) {
            return;
        }
        if (arg0.field715 != -1 && arg0.field715 < 32768) {
            class28 var1 = field410[arg0.field715];
            if (var1 != null) {
                int var2 = arg0.field704 - var1.field704;
                int var3 = arg0.field693 - var1.field693;
                if (var2 != 0 || var3 != 0) {
                    arg0.field743 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field715 >= 32768) {
            int var4 = arg0.field715 - 32768;
            if (field372 == var4) {
                var4 = 2047;
            }
            class3 var5 = field366[var4];
            if (var5 != null) {
                int var6 = arg0.field704 - var5.field704;
                int var7 = arg0.field693 - var5.field693;
                if (var6 != 0 || var7 != 0) {
                    arg0.field743 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field741 != 0 || arg0.field717 != 0) && (arg0.field710 == 0 || arg0.field747 > 0)) {
            int var8 = arg0.field704 - (arg0.field741 * 64 - Statics.field557 * 64 - Statics.field557 * 64);
            int var9 = arg0.field693 - (arg0.field717 * 64 - Statics.field172 * 64 - Statics.field172 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field743 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field741 = 0;
            arg0.field717 = 0;
        }
        int var10 = arg0.field743 - arg0.field694 & 0x7FF;
        if (var10 == 0) {
            arg0.field692 = 0;
            return;
        }
        arg0.field692++;
        if (var10 > 1024) {
            arg0.field694 -= arg0.field742;
            boolean var11 = true;
            if (var10 < arg0.field742 || var10 > 2048 - arg0.field742) {
                arg0.field694 = arg0.field743;
                var11 = false;
            }
            if (arg0.field731 == arg0.field718 && (arg0.field692 > 25 || var11)) {
                if (arg0.field698 == -1) {
                    arg0.field718 = arg0.field726;
                } else {
                    arg0.field718 = arg0.field698;
                }
            }
        } else {
            arg0.field694 += arg0.field742;
            boolean var12 = true;
            if (var10 < arg0.field742 || var10 > 2048 - arg0.field742) {
                arg0.field694 = arg0.field743;
                var12 = false;
            }
            if (arg0.field731 == arg0.field718 && (arg0.field692 > 25 || var12)) {
                if (arg0.field728 == -1) {
                    arg0.field718 = arg0.field726;
                } else {
                    arg0.field718 = arg0.field728;
                }
            }
        }
        arg0.field694 &= 0x7FF;
    }

    @ObfuscatedName("at.ah(Ly;III)V")
    public static void method1051(class3 arg0, int arg1, int arg2) {
        if (arg0.field721 == arg1 && arg1 != -1) {
            int var3 = class35.method162(arg1).field874;
            if (var3 == 1) {
                arg0.field716 = 0;
                arg0.field700 = 0;
                arg0.field749 = arg2;
                arg0.field740 = 0;
            }
            if (var3 == 2) {
                arg0.field740 = 0;
            }
        } else if (arg1 == -1 || arg0.field721 == -1 || class35.method162(arg1).field877 >= class35.method162(arg0.field721).field877) {
            arg0.field721 = arg1;
            arg0.field716 = 0;
            arg0.field700 = 0;
            arg0.field749 = arg2;
            arg0.field740 = 0;
            arg0.field725 = arg0.field710;
        }
    }

    @ObfuscatedName("w.ao(Ljava/lang/String;ZI)V")
    public static final void method106(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field171.method3266(arg0, 250);
        int var6 = Statics.field171.method3330(arg0, 250) * 13;
        class70.method1495(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class70.method1549(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field171.method3272(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method3435(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field591.getGraphics();
                Statics.field2608.method1325(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field591.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field449; var13++) {
            if (field500[var13] + field417[var13] > var9 && field500[var13] < var9 + var11 && field457[var13] + field455[var13] > var10 && field455[var13] < var10 + var12) {
                field473[var13] = true;
            }
        }
    }

    @ObfuscatedName("t.aj(IIIIB)V")
    public static final void method135(int arg0, int arg1, int arg2, int arg3) {
        class70.method1488(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class81.method1764();
        field354++;
        method1583(class27.field664);
        boolean var4 = false;
        if (field380 >= 0) {
            for (int var5 = 0; var5 < field367; var5++) {
                if (field380 == field368[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method1583(class27.field662);
        }
        method136(true);
        method1583(var4 ? class27.field666 : class27.field663);
        method136(false);
        for (class7 var6 = (class7) field383.method3178(); var6 != null; var6 = (class7) field383.method3179()) {
            if (Statics.field1795 != var6.field107 || field463 > var6.field111) {
                var6.method3223();
            } else if (field463 >= var6.field110) {
                if (var6.field114 > 0) {
                    class28 var7 = field410[var6.field114 - 1];
                    if (var7 != null && var7.field704 >= 0 && var7.field704 < 13312 && var7.field693 >= 0 && var7.field693 < 13312) {
                        var6.method90(var7.field704, var7.field693, method11(var7.field704, var7.field693, var6.field107) - var6.field109, field463);
                    }
                }
                if (var6.field114 < 0) {
                    int var8 = -var6.field114 - 1;
                    class3 var9;
                    if (field372 == var8) {
                        var9 = Statics.field944;
                    } else {
                        var9 = field366[var8];
                    }
                    if (var9 != null && var9.field704 >= 0 && var9.field704 < 13312 && var9.field693 >= 0 && var9.field693 < 13312) {
                        var6.method90(var9.field704, var9.field693, method11(var9.field704, var9.field693, var6.field107) - var6.field109, field463);
                    }
                }
                var6.method98(field323);
                Statics.field878.method1598(Statics.field1795, (int) var6.field116, (int) var6.field128, (int) var6.field118, 60, var6, var6.field124, -1, false);
            }
        }
        method2076();
        if (!field442) {
            int var10 = field330;
            if (field338 / 256 > var10) {
                var10 = field338 / 256;
            }
            if (field495[4] && field409[4] + 128 > var10) {
                var10 = field409[4] + 128;
            }
            int var11 = field315 + field306 & 0x7FF;
            method1850(Statics.field98, method11(Statics.field944.field704, Statics.field944.field693, Statics.field1795) - 50, Statics.field837, var10, var11, var10 * 3 + 600);
        }
        int var12;
        if (field442) {
            var12 = Statics.method143();
        } else {
            var12 = method495();
        }
        int var13 = Statics.field1389;
        int var14 = Statics.field223;
        int var15 = Statics.field2051;
        int var16 = Statics.field2369;
        int var17 = Statics.field1640;
        for (int var18 = 0; var18 < 5; var18++) {
            if (field495[var18]) {
                int var19 = (int) (Math.random() * (double) (field496[var18] * 2 + 1) - (double) field496[var18] + Math.sin((double) field498[var18] / 100.0D * (double) field396[var18]) * (double) field409[var18]);
                if (var18 == 0) {
                    Statics.field1389 += var19;
                }
                if (var18 == 1) {
                    Statics.field223 += var19;
                }
                if (var18 == 2) {
                    Statics.field2051 += var19;
                }
                if (var18 == 3) {
                    Statics.field1640 = Statics.field1640 + var19 & 0x7FF;
                }
                if (var18 == 4) {
                    Statics.field2369 += var19;
                    if (Statics.field2369 < 128) {
                        Statics.field2369 = 128;
                    }
                    if (Statics.field2369 > 383) {
                        Statics.field2369 = 383;
                    }
                }
            }
        }
        int var20 = class124.field1969;
        int var21 = class124.field1970;
        if (class124.field1972 != 0) {
            var20 = class124.field1976;
            var21 = class124.field1977;
        }
        if (var20 >= arg0 && var20 < arg0 + arg2 && var21 >= arg1 && var21 < arg1 + arg3) {
            class95.field1671 = true;
            class95.field1720 = 0;
            class95.field1666 = var20 - arg0;
            class95.field1691 = var21 - arg1;
        } else {
            class95.field1671 = false;
            class95.field1720 = 0;
        }
        method2371();
        class70.method1495(arg0, arg1, arg2, arg3, 0);
        method2371();
        Statics.field878.method1591(Statics.field1389, Statics.field223, Statics.field2051, Statics.field2369, Statics.field1640, var12);
        method2371();
        Statics.field878.method1601();
        field339 = 0;
        boolean var22 = false;
        int var23 = -1;
        for (int var24 = -1; var24 < field367 + field287; var24++) {
            class30 var25;
            if (var24 == -1) {
                var25 = Statics.field944;
            } else if (var24 < field367) {
                var25 = field366[field368[var24]];
                if (field380 == field368[var24]) {
                    var22 = true;
                    var23 = var24;
                    continue;
                }
            } else {
                var25 = field410[field288[var24 - field367]];
            }
            method127(var25, var24, arg0, arg1, arg2, arg3);
        }
        if (var22) {
            method127(field366[field380], var23, arg0, arg1, arg2, arg3);
        }
        for (int var26 = 0; var26 < field339; var26++) {
            int var27 = field360[var26];
            int var28 = field286[var26];
            int var29 = field344[var26];
            int var30 = field343[var26];
            boolean var31 = true;
            while (var31) {
                var31 = false;
                for (int var32 = 0; var32 < var26; var32++) {
                    if (var28 + 2 > field286[var32] - field343[var32] && var28 - var30 < field286[var32] + 2 && var27 - var29 < field360[var32] + field344[var32] && var27 + var29 > field360[var32] - field344[var32] && field286[var32] - field343[var32] < var28) {
                        var28 = field286[var32] - field343[var32];
                        var31 = true;
                    }
                }
            }
            field327 = field360[var26];
            field347 = field286[var26] = var28;
            String var33 = field348[var26];
            if (field331 == 0) {
                int var34 = 16776960;
                if (field345[var26] < 6) {
                    var34 = field464[field345[var26]];
                }
                if (field345[var26] == 6) {
                    var34 = field354 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field345[var26] == 7) {
                    var34 = field354 % 20 < 10 ? 255 : 65535;
                }
                if (field345[var26] == 8) {
                    var34 = field354 % 20 < 10 ? 45056 : 8454016;
                }
                if (field345[var26] == 9) {
                    int var35 = 150 - field494[var26];
                    if (var35 < 50) {
                        var34 = var35 * 1280 + 16711680;
                    } else if (var35 < 100) {
                        var34 = 16776960 - (var35 - 50) * 327680;
                    } else if (var35 < 150) {
                        var34 = (var35 - 100) * 5 + 65280;
                    }
                }
                if (field345[var26] == 10) {
                    int var36 = 150 - field494[var26];
                    if (var36 < 50) {
                        var34 = var36 * 5 + 16711680;
                    } else if (var36 < 100) {
                        var34 = 16711935 - (var36 - 50) * 327680;
                    } else if (var36 < 150) {
                        var34 = (var36 - 100) * 327680 + 255 - (var36 - 100) * 5;
                    }
                }
                if (field345[var26] == 11) {
                    int var37 = 150 - field494[var26];
                    if (var37 < 50) {
                        var34 = 16777215 - var37 * 327685;
                    } else if (var37 < 100) {
                        var34 = (var37 - 50) * 327685 + 65280;
                    } else if (var37 < 150) {
                        var34 = 16777215 - (var37 - 100) * 327680;
                    }
                }
                if (field346[var26] == 0) {
                    Statics.field2871.method3271(var33, field327 + arg0, field347 + arg1, var34, 0);
                }
                if (field346[var26] == 1) {
                    Statics.field2871.method3273(var33, field327 + arg0, field347 + arg1, var34, 0, field354);
                }
                if (field346[var26] == 2) {
                    Statics.field2871.method3274(var33, field327 + arg0, field347 + arg1, var34, 0, field354);
                }
                if (field346[var26] == 3) {
                    Statics.field2871.method3275(var33, field327 + arg0, field347 + arg1, var34, 0, field354, 150 - field494[var26]);
                }
                if (field346[var26] == 4) {
                    int var38 = (150 - field494[var26]) * (Statics.field2871.method3327(var33) + 100) / 150;
                    class70.method1514(field327 + arg0 - 50, arg1, field327 + arg0 + 50, arg1 + arg3);
                    Statics.field2871.method3277(var33, field327 + arg0 + 50 - var38, field347 + arg1, var34, 0);
                    class70.method1488(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field346[var26] == 5) {
                    int var39 = 150 - field494[var26];
                    int var40 = 0;
                    if (var39 < 25) {
                        var40 = var39 - 25;
                    } else if (var39 > 125) {
                        var40 = var39 - 125;
                    }
                    class70.method1514(arg0, field347 + arg1 - Statics.field2871.field2862 - 1, arg0 + arg2, field347 + arg1 + 5);
                    Statics.field2871.method3271(var33, field327 + arg0, field347 + arg1 + var40, var34, 0);
                    class70.method1488(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2871.method3271(var33, field327 + arg0, field347 + arg1, 16776960, 0);
            }
        }
        method2644(arg0, arg1);
        ((class85) Statics.field1445).method1861(field323);
        method3476(arg0, arg1, arg2, arg3);
        Statics.field1389 = var13;
        Statics.field223 = var14;
        Statics.field2051 = var15;
        Statics.field2369 = var16;
        Statics.field1640 = var17;
        if (field258) {
            byte var41 = 0;
            int var42 = class146.field2460 + class146.field2449 + var41;
            if (var42 == 0) {
                field258 = false;
            }
        }
        if (field258) {
            class70.method1495(arg0, arg1, arg2, arg3, 0);
            method106(class139.field2128, false);
        }
    }

    @ObfuscatedName("by.ad(Laz;I)V")
    public static final void method1583(class27 arg0) {
        if (Statics.field944.field704 >> 7 == field480 && Statics.field944.field693 >> 7 == field481) {
            field480 = 0;
        }
        int var1 = field367;
        if (class27.field664 == arg0 || class27.field662 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class27.field664 == arg0) {
                var3 = Statics.field944;
                var4 = 33538048;
            } else if (class27.field662 == arg0) {
                var3 = field366[field380];
                var4 = field380 << 14;
            } else {
                var3 = field366[field368[var2]];
                var4 = field368[var2] << 14;
                if (class27.field666 == arg0 && field380 == field368[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method18()) {
                var3.field33 = false;
                if ((field458 && field367 > 50 || field367 > 200) && class27.field664 != arg0 && var3.field731 == var3.field718) {
                    var3.field33 = true;
                }
                int var5 = var3.field704 >> 7;
                int var6 = var3.field693 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field44 == null || field463 < var3.field39 || field463 >= var3.field45) {
                        if ((var3.field704 & 0x7F) == 64 && (var3.field693 & 0x7F) == 64) {
                            if (field354 == field349[var5][var6]) {
                                continue;
                            }
                            field349[var5][var6] = field354;
                        }
                        var3.field54 = method11(var3.field704, var3.field693, Statics.field1795);
                        Statics.field878.method1598(Statics.field1795, var3.field704, var3.field693, var3.field54, 60, var3, var3.field694, var4, var3.field727);
                    } else {
                        var3.field33 = false;
                        var3.field54 = method11(var3.field704, var3.field693, Statics.field1795);
                        Statics.field878.method1752(Statics.field1795, var3.field704, var3.field693, var3.field54, 60, var3, var3.field694, var4, var3.field40, var3.field46, var3.field47, var3.field48);
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.ai(ZI)V")
    public static final void method136(boolean arg0) {
        for (int var1 = 0; var1 < field287; var1++) {
            class28 var2 = field410[field288[var1]];
            int var3 = (field288[var1] << 14) + 536870912;
            if (var2 != null && var2.method18() && var2.field674.field773 == arg0 && var2.field674.method605()) {
                int var4 = var2.field704 >> 7;
                int var5 = var2.field693 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field696 == 1 && (var2.field704 & 0x7F) == 64 && (var2.field693 & 0x7F) == 64) {
                        if (field354 == field349[var4][var5]) {
                            continue;
                        }
                        field349[var4][var5] = field354;
                    }
                    if (!var2.field674.field760) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field878.method1598(Statics.field1795, var2.field704, var2.field693, method11(var2.field704 + (var2.field696 * 64 - 64), var2.field693 + (var2.field696 * 64 - 64), Statics.field1795), var2.field696 * 64 - 64 + 60, var2, var2.field694, var3, var2.field727);
                }
            }
        }
    }

    @ObfuscatedName("cn.af(S)V")
    public static final void method2076() {
        for (class24 var0 = (class24) field384.method3178(); var0 != null; var0 = (class24) field384.method3179()) {
            if (Statics.field1795 != var0.field600 || var0.field607) {
                var0.method3223();
            } else if (field463 >= var0.field599) {
                var0.method513(field323);
                if (var0.field607) {
                    var0.method3223();
                } else {
                    Statics.field878.method1598(var0.field600, var0.field605, var0.field613, var0.field604, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("c.am(I)I")
    public static final int method495() {
        if (Statics.field1858.field145) {
            return Statics.field1795;
        }
        int var0 = 3;
        if (Statics.field2369 < 310) {
            int var1 = Statics.field1389 >> 7;
            int var2 = Statics.field2051 >> 7;
            int var3 = Statics.field944.field704 >> 7;
            int var4 = Statics.field944.field693 >> 7;
            if ((class6.field93[Statics.field1795][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1795;
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
                    if ((class6.field93[Statics.field1795][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1795;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field93[Statics.field1795][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1795;
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
                    if ((class6.field93[Statics.field1795][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1795;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field93[Statics.field1795][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1795;
                        }
                    }
                }
            }
        }
        if ((class6.field93[Statics.field1795][Statics.field944.field704 >> 7][Statics.field944.field693 >> 7] & 0x4) != 0) {
            var0 = Statics.field1795;
        }
        return var0;
    }

    @ObfuscatedName("dq.ar(III)V")
    public static final void method2644(int arg0, int arg1) {
        if (field267 == 2) {
            method2524((field270 - Statics.field557 << 7) + field414, (field271 - Statics.field172 << 7) + field274, field415 * 2);
            if (field327 > -1 && field463 % 20 < 10) {
                Statics.field509[0].method1431(field327 + arg0 - 12, field347 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("d.an(Lah;IIIIII)V")
    public static final void method127(class30 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method18()) {
            return;
        }
        if (arg0 instanceof class28) {
            class32 var6 = ((class28) arg0).field674;
            if (var6.field774 != null) {
                var6 = var6.method579();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field367) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field34 != -1 || var8.field35 != -1) {
                method84(arg0, arg0.field739 + 15);
                if (field327 > -1) {
                    if (var8.field34 != -1) {
                        Statics.field4[var8.field34].method1431(field327 + arg2 - 12, field347 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field35 != -1) {
                        Statics.field973[var8.field35].method1431(field327 + arg2 - 12, field347 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field267 == 10 && field269 == field368[arg1]) {
                method84(arg0, arg0.field739 + 15);
                if (field327 > -1) {
                    Statics.field509[1].method1431(field327 + arg2 - 12, field347 + arg3 - var7);
                }
            }
        } else {
            class32 var9 = ((class28) arg0).field674;
            if (var9.field774 != null) {
                var9 = var9.method579();
            }
            if (var9.field782 >= 0 && var9.field782 < Statics.field973.length) {
                method84(arg0, arg0.field739 + 15);
                if (field327 > -1) {
                    Statics.field973[var9.field782].method1431(field327 + arg2 - 12, field347 + arg3 - 30);
                }
            }
            if (field267 == 1 && field268 == field288[arg1 - field367] && field463 % 20 < 10) {
                method84(arg0, arg0.field739 + 15);
                if (field327 > -1) {
                    Statics.field509[0].method1431(field327 + arg2 - 12, field347 + arg3 - 28);
                }
            }
        }
        if (arg0.field724 != null && (arg1 >= field367 || field465 == 0 || field465 == 3 || field465 == 1 && method137(((class3) arg0).field38, false))) {
            method84(arg0, arg0.field739);
            if (field327 > -1 && field339 < field340) {
                field344[field339] = Statics.field2871.method3327(arg0.field724) / 2;
                field343[field339] = Statics.field2871.field2862;
                field360[field339] = field327;
                field286[field339] = field347;
                field345[field339] = arg0.field707;
                field346[field339] = arg0.field708;
                field494[field339] = arg0.field706;
                field348[field339] = arg0.field724;
                field339++;
            }
        }
        if (arg0.field712 > field463) {
            method84(arg0, arg0.field739 + 15);
            if (field327 > -1) {
                int var10 = arg0.field713 * 30 / arg0.field714;
                if (var10 > 30) {
                    var10 = 30;
                } else if (var10 == 0 && arg0.field713 > 0) {
                    var10 = 1;
                }
                class70.method1495(field327 + arg2 - 15, field347 + arg3 - 3, var10, 5, 65280);
                class70.method1495(field327 + arg2 - 15 + var10, field347 + arg3 - 3, 30 - var10, 5, 16711680);
            }
        }
        for (int var11 = 0; var11 < 4; var11++) {
            if (arg0.field711[var11] > field463) {
                method84(arg0, arg0.field739 / 2);
                if (field327 > -1) {
                    if (var11 == 1) {
                        field347 -= 20;
                    }
                    if (var11 == 2) {
                        field327 -= 15;
                        field347 -= 10;
                    }
                    if (var11 == 3) {
                        field327 += 15;
                        field347 -= 10;
                    }
                    Statics.field71[arg0.field709[var11]].method1431(field327 + arg2 - 12, field347 + arg3 - 12);
                    Statics.field517.method3271(Integer.toString(arg0.field699[var11]), field327 + arg2 - 1, field347 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("et.au(I)V")
    public static final void method2674() {
        field255 = 0;
        int var0 = (Statics.field944.field704 >> 7) + Statics.field557;
        int var1 = (Statics.field944.field693 >> 7) + Statics.field172;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field255 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field255 = 1;
        }
        if (field255 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field255 = 0;
        }
    }

    @ObfuscatedName("gu.aa(IIIIB)V")
    public static final void method3476(int arg0, int arg1, int arg2, int arg3) {
        if (field356 == 1) {
            Statics.field1396[field303 / 100].method1431(field434 - 8, field278 - 8);
        }
        if (field356 == 2) {
            Statics.field1396[field303 / 100 + 4].method1431(field434 - 8, field278 - 8);
        }
        method2674();
        if (!field265) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field171.method3270("Fps:" + field2022, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field458) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field458) {
            var8 = 16711680;
        }
        Statics.field171.method3270("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("i.ag(Lah;II)V")
    public static final void method84(class30 arg0, int arg1) {
        method2524(arg0.field704, arg0.field693, arg1);
    }

    @ObfuscatedName("dy.al(IIII)V")
    public static final void method2524(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field327 = -1;
            field347 = -1;
            return;
        }
        int var3 = method11(arg0, arg1, Statics.field1795) - arg2;
        int var4 = arg0 - Statics.field1389;
        int var5 = var3 - Statics.field223;
        int var6 = arg1 - Statics.field2051;
        int var7 = class81.field1448[Statics.field2369];
        int var8 = class81.field1449[Statics.field2369];
        int var9 = class81.field1448[Statics.field1640];
        int var10 = class81.field1449[Statics.field1640];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field327 = (var11 << 9) / var15 + 256;
            field347 = (var14 << 9) / var15 + 167;
        } else {
            field327 = -1;
            field347 = -1;
        }
    }

    @ObfuscatedName("k.ap(IIII)I")
    public static final int method11(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field93[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field97[var5][var3][var4] + class6.field97[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field97[var5][var3][var4 + 1] + class6.field97[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("cg.ac(IIIIIII)V")
    public static final void method1850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class81.field1448[var6];
            int var12 = class81.field1449[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class81.field1448[var7];
            int var15 = class81.field1449[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1389 = arg0 - var8;
        Statics.field223 = arg1 - var9;
        Statics.field2051 = arg2 - var10;
        Statics.field2369 = arg3;
        Statics.field1640 = arg4;
    }

    @ObfuscatedName("eo.ak(ZB)V")
    public static final void method2795(boolean arg0) {
        field310 = arg0;
        if (!field310) {
            int var1 = field291.method2161();
            int var2 = (field292 - field291.field1806) / 16;
            Statics.field2840 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    Statics.field2840[var3][var4] = field291.method2171();
                }
            }
            int var5 = field291.method2261();
            int var6 = field291.method2197();
            int var7 = field291.method2261();
            int var8 = field291.method2132();
            Statics.field661 = new int[var2];
            Statics.field140 = new int[var2];
            Statics.field208 = new int[var2];
            Statics.field917 = new byte[var2][];
            Statics.field998 = new byte[var2][];
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
                        Statics.field661[var10] = var13;
                        Statics.field140[var10] = Statics.field658.method2757("m" + var11 + "_" + var12);
                        Statics.field208[var10] = Statics.field658.method2757("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method651(var8, var1, var6, var7, var5);
            return;
        }
        int var14 = field291.method2197();
        int var15 = field291.method2161();
        int var16 = field291.method2132();
        field291.method2379();
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var18 = 0; var18 < 13; var18++) {
                for (int var19 = 0; var19 < 13; var19++) {
                    int var20 = field291.method2376(1);
                    if (var20 == 1) {
                        field309[var17][var18][var19] = field291.method2376(26);
                    } else {
                        field309[var17][var18][var19] = -1;
                    }
                }
            }
        }
        field291.method2377();
        int var21 = (field292 - field291.field1806) / 16;
        Statics.field2840 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var23 = 0; var23 < 4; var23++) {
                Statics.field2840[var22][var23] = field291.method2170();
            }
        }
        int var24 = field291.method2161();
        int var25 = field291.method2161();
        Statics.field661 = new int[var21];
        Statics.field140 = new int[var21];
        Statics.field208 = new int[var21];
        Statics.field917 = new byte[var21][];
        Statics.field998 = new byte[var21][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field309[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field661[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field661[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field140[var26] = Statics.field658.method2757("m" + var35 + "_" + var36);
                            Statics.field208[var26] = Statics.field658.method2757("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method651(var24, var15, var14, var16, var25);
    }

    @ObfuscatedName("ad.ax(IIIIIB)V")
    public static final void method651(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field2115 == arg0 && Statics.field2437 == arg1 && field301 == arg2 || !field458) {
            return;
        }
        Statics.field2115 = arg0;
        Statics.field2437 = arg1;
        field301 = arg2;
        if (!field458) {
            field301 = 0;
        }
        method138(25);
        method106(class139.field2128, true);
        int var5 = Statics.field557;
        int var6 = Statics.field172;
        Statics.field557 = (arg0 - 6) * 8;
        Statics.field172 = (arg1 - 6) * 8;
        int var7 = Statics.field557 - var5;
        int var8 = Statics.field172 - var6;
        int var9 = Statics.field557;
        int var10 = Statics.field172;
        for (int var11 = 0; var11 < 32768; var11++) {
            class28 var12 = field410[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field732[var13] -= var7;
                    var12.field745[var13] -= var8;
                }
                var12.field704 -= var7 * 128;
                var12.field693 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field366[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field732[var16] -= var7;
                    var15.field745[var16] -= var8;
                }
                var15.field704 -= var7 * 128;
                var15.field693 -= var8 * 128;
            }
        }
        Statics.field1795 = arg2;
        Statics.field944.method561(arg3, arg4, false);
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
                        field381[var27][var23][var24] = field381[var27][var25][var26];
                    } else {
                        field381[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class14 var28 = (class14) field382.method3178(); var28 != null; var28 = (class14) field382.method3179()) {
            var28.field209 -= var7;
            var28.field210 -= var8;
            if (var28.field209 < 0 || var28.field210 < 0 || var28.field209 >= 104 || var28.field210 >= 104) {
                var28.method3223();
            }
        }
        if (field480 != 0) {
            field480 -= var7;
            field481 -= var8;
        }
        field377 = 0;
        field442 = false;
        field475 = -1;
        field384.method3171();
        field383.method3171();
    }

    @ObfuscatedName("a.aw(I)V")
    public static final void method104() {
        Statics.method499(false);
        field364 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field917.length; var1++) {
            if (Statics.field140[var1] != -1 && Statics.field917[var1] == null) {
                Statics.field917[var1] = Statics.field658.method2725(Statics.field140[var1], 0);
                if (Statics.field917[var1] == null) {
                    var0 = false;
                    field364++;
                }
            }
            if (Statics.field208[var1] != -1 && Statics.field998[var1] == null) {
                Statics.field998[var1] = Statics.field658.method2696(Statics.field208[var1], 0, Statics.field2840[var1]);
                if (Statics.field998[var1] == null) {
                    var0 = false;
                    field364++;
                }
            }
        }
        if (!var0) {
            field337 = 1;
            return;
        }
        field304 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field917.length; var3++) {
            byte[] var4 = Statics.field998[var3];
            if (var4 != null) {
                int var5 = (Statics.field661[var3] >> 8) * 64 - Statics.field557;
                int var6 = (Statics.field661[var3] & 0xFF) * 64 - Statics.field172;
                if (field310) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class104 var9 = new class104(var4);
                int var10 = -1;
                label1029: while (true) {
                    int var11 = var9.method2143();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2143();
                            if (var16 == 0) {
                                continue label1029;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2190() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class33 var22 = class33.method13(var10);
                                if (var19 != 22 || !field458 || var22.field801 != 0 || var22.field803 == 1 || var22.field836) {
                                    if (!var22.method616()) {
                                        field304++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2143();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2190();
                    }
                }
            }
        }
        if (!var2) {
            field337 = 2;
            return;
        }
        if (field337 != 0) {
            method106(class139.field2128 + class2.field23 + class2.field25 + 100 + "%" + class2.field18, true);
        }
        method2371();
        method825();
        method2371();
        Statics.field878.method1587();
        method2371();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field307[var23].method3399();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field93[var24][var25][var26] = 0;
                }
            }
        }
        method2371();
        Statics.method121();
        int var27 = Statics.field917.length;
        class19.method1045();
        Statics.method499(true);
        if (!field310) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field661[var28] >> 8) * 64 - Statics.field557;
                int var30 = (Statics.field661[var28] & 0xFF) * 64 - Statics.field172;
                byte[] var31 = Statics.field917[var28];
                if (var31 != null) {
                    method2371();
                    int var32 = Statics.field2115 * 8 - 48;
                    int var33 = Statics.field2437 * 8 - 48;
                    class187[] var34 = field307;
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 64; var36++) {
                            for (int var37 = 0; var37 < 64; var37++) {
                                if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                    var34[var35].field2897[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class104 var38 = new class104(var31);
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 64; var40++) {
                            for (int var41 = 0; var41 < 64; var41++) {
                                class6.method549(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < var27; var42++) {
                int var43 = (Statics.field661[var42] >> 8) * 64 - Statics.field557;
                int var44 = (Statics.field661[var42] & 0xFF) * 64 - Statics.field172;
                byte[] var45 = Statics.field917[var42];
                if (var45 == null && Statics.field2437 < 800) {
                    method2371();
                    class6.method207(var43, var44, 64, 64);
                }
            }
            Statics.method499(true);
            for (int var46 = 0; var46 < var27; var46++) {
                byte[] var47 = Statics.field998[var46];
                if (var47 != null) {
                    int var48 = (Statics.field661[var46] >> 8) * 64 - Statics.field557;
                    int var49 = (Statics.field661[var46] & 0xFF) * 64 - Statics.field172;
                    method2371();
                    class6.method85(var47, var48, var49, Statics.field878, field307);
                }
            }
        }
        if (field310) {
            for (int var50 = 0; var50 < 4; var50++) {
                method2371();
                for (int var51 = 0; var51 < 13; var51++) {
                    for (int var52 = 0; var52 < 13; var52++) {
                        boolean var53 = false;
                        int var54 = field309[var50][var51][var52];
                        if (var54 != -1) {
                            int var55 = var54 >> 24 & 0x3;
                            int var56 = var54 >> 1 & 0x3;
                            int var57 = var54 >> 14 & 0x3FF;
                            int var58 = var54 >> 3 & 0x7FF;
                            int var59 = (var57 / 8 << 8) + var58 / 8;
                            for (int var60 = 0; var60 < Statics.field661.length; var60++) {
                                if (Statics.field661[var60] == var59 && Statics.field917[var60] != null) {
                                    class6.method2665(Statics.field917[var60], var50, var51 * 8, var52 * 8, var55, (var57 & 0x7) * 8, (var58 & 0x7) * 8, var56, field307);
                                    var53 = true;
                                    break;
                                }
                            }
                        }
                        if (!var53) {
                            Statics.method2507(var50, var51 * 8, var52 * 8);
                        }
                    }
                }
            }
            for (int var61 = 0; var61 < 13; var61++) {
                for (int var62 = 0; var62 < 13; var62++) {
                    int var63 = field309[0][var61][var62];
                    if (var63 == -1) {
                        class6.method207(var61 * 8, var62 * 8, 8, 8);
                    }
                }
            }
            Statics.method499(true);
            for (int var64 = 0; var64 < 4; var64++) {
                method2371();
                for (int var65 = 0; var65 < 13; var65++) {
                    for (int var66 = 0; var66 < 13; var66++) {
                        int var67 = field309[var64][var65][var66];
                        if (var67 != -1) {
                            int var68 = var67 >> 24 & 0x3;
                            int var69 = var67 >> 1 & 0x3;
                            int var70 = var67 >> 14 & 0x3FF;
                            int var71 = var67 >> 3 & 0x7FF;
                            int var72 = (var70 / 8 << 8) + var71 / 8;
                            for (int var73 = 0; var73 < Statics.field661.length; var73++) {
                                if (Statics.field661[var73] == var72 && Statics.field998[var73] != null) {
                                    class6.method547(Statics.field998[var73], var64, var65 * 8, var66 * 8, var68, (var70 & 0x7) * 8, (var71 & 0x7) * 8, var69, Statics.field878, field307);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        Statics.method499(true);
        method825();
        method2371();
        class76 var74 = Statics.field878;
        class187[] var75 = field307;
        for (int var76 = 0; var76 < 4; var76++) {
            for (int var77 = 0; var77 < 104; var77++) {
                for (int var78 = 0; var78 < 104; var78++) {
                    if ((class6.field93[var76][var77][var78] & 0x1) == 1) {
                        int var79 = var76;
                        if ((class6.field93[1][var77][var78] & 0x2) == 2) {
                            var79 = var76 - 1;
                        }
                        if (var79 >= 0) {
                            var75[var79].method3402(var77, var78);
                        }
                    }
                }
            }
        }
        class6.field99 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field99 < -8) {
            class6.field99 = -8;
        }
        if (class6.field99 > 8) {
            class6.field99 = 8;
        }
        class6.field84 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field84 < -16) {
            class6.field84 = -16;
        }
        if (class6.field84 > 16) {
            class6.field84 = 16;
        }
        for (int var80 = 0; var80 < 4; var80++) {
            byte[][] var81 = Statics.field86[var80];
            int var82 = (int) Math.sqrt(5100.0D);
            int var83 = var82 * 768 >> 8;
            for (int var84 = 1; var84 < 103; var84++) {
                for (int var85 = 1; var85 < 103; var85++) {
                    int var86 = class6.field97[var80][var85 + 1][var84] - class6.field97[var80][var85 - 1][var84];
                    int var87 = class6.field97[var80][var85][var84 + 1] - class6.field97[var80][var85][var84 - 1];
                    int var88 = (int) Math.sqrt((double) (var87 * var87 + var86 * var86 + 65536));
                    int var89 = (var86 << 8) / var88;
                    int var90 = 65536 / var88;
                    int var91 = (var87 << 8) / var88;
                    int var92 = (var91 * -50 + var89 * -50 + var90 * -10) / var83 + 96;
                    int var93 = (var81[var85][var84] >> 1) + (var81[var85][var84 + 1] >> 3) + (var81[var85][var84 - 1] >> 2) + (var81[var85 - 1][var84] >> 2) + (var81[var85 + 1][var84] >> 3);
                    Statics.field87[var85][var84] = var92 - var93;
                }
            }
            for (int var94 = 0; var94 < 104; var94++) {
                Statics.field81[var94] = 0;
                Statics.field1456[var94] = 0;
                Statics.field1242[var94] = 0;
                Statics.field176[var94] = 0;
                Statics.field1951[var94] = 0;
            }
            for (int var95 = -5; var95 < 109; var95++) {
                for (int var96 = 0; var96 < 104; var96++) {
                    int var97 = var95 + 5;
                    int var10002;
                    if (var97 >= 0 && var97 < 104) {
                        int var98 = Statics.field82[var80][var97][var96] & 0xFF;
                        if (var98 > 0) {
                            class34 var99 = class34.method91(var98 - 1);
                            Statics.field81[var96] += var99.field856;
                            Statics.field1456[var96] += var99.field859;
                            Statics.field1242[var96] += var99.field857;
                            Statics.field176[var96] += var99.field860;
                            var10002 = Statics.field1951[var96]++;
                        }
                    }
                    int var100 = var95 - 5;
                    if (var100 >= 0 && var100 < 104) {
                        int var101 = Statics.field82[var80][var100][var96] & 0xFF;
                        if (var101 > 0) {
                            class34 var102 = class34.method91(var101 - 1);
                            Statics.field81[var96] -= var102.field856;
                            Statics.field1456[var96] -= var102.field859;
                            Statics.field1242[var96] -= var102.field857;
                            Statics.field176[var96] -= var102.field860;
                            var10002 = Statics.field1951[var96]--;
                        }
                    }
                }
                if (var95 >= 1 && var95 < 103) {
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = 0;
                    for (int var108 = -5; var108 < 109; var108++) {
                        int var109 = var108 + 5;
                        if (var109 >= 0 && var109 < 104) {
                            var103 += Statics.field81[var109];
                            var104 += Statics.field1456[var109];
                            var105 += Statics.field1242[var109];
                            var106 += Statics.field176[var109];
                            var107 += Statics.field1951[var109];
                        }
                        int var110 = var108 - 5;
                        if (var110 >= 0 && var110 < 104) {
                            var103 -= Statics.field81[var110];
                            var104 -= Statics.field1456[var110];
                            var105 -= Statics.field1242[var110];
                            var106 -= Statics.field176[var110];
                            var107 -= Statics.field1951[var110];
                        }
                        if (var108 >= 1 && var108 < 103 && (!field458 || (class6.field93[0][var95][var108] & 0x2) != 0 || (class6.field93[var80][var95][var108] & 0x10) == 0 && class6.method577(var80, var95, var108) == field301)) {
                            if (var80 < class6.field79) {
                                class6.field79 = var80;
                            }
                            int var111 = Statics.field82[var80][var95][var108] & 0xFF;
                            int var112 = Statics.field100[var80][var95][var108] & 0xFF;
                            if (var111 > 0 || var112 > 0) {
                                int var113 = class6.field97[var80][var95][var108];
                                int var114 = class6.field97[var80][var95 + 1][var108];
                                int var115 = class6.field97[var80][var95 + 1][var108 + 1];
                                int var116 = class6.field97[var80][var95][var108 + 1];
                                int var117 = Statics.field87[var95][var108];
                                int var118 = Statics.field87[var95 + 1][var108];
                                int var119 = Statics.field87[var95 + 1][var108 + 1];
                                int var120 = Statics.field87[var95][var108 + 1];
                                int var121 = -1;
                                int var122 = -1;
                                if (var111 > 0) {
                                    int var123 = var103 * 256 / var106;
                                    int var124 = var104 / var107;
                                    int var125 = var105 / var107;
                                    var121 = class6.method2(var123, var124, var125);
                                    int var126 = class6.field99 + var123 & 0xFF;
                                    int var127 = class6.field84 + var125;
                                    if (var127 < 0) {
                                        var127 = 0;
                                    } else if (var127 > 255) {
                                        var127 = 255;
                                    }
                                    var122 = class6.method2(var126, var124, var127);
                                }
                                if (var80 > 0) {
                                    boolean var128 = true;
                                    if (var111 == 0 && Statics.field80[var80][var95][var108] != 0) {
                                        var128 = false;
                                    }
                                    if (var112 > 0) {
                                        int var129 = var112 - 1;
                                        class38 var130 = (class38) class38.field928.method3137((long) var129);
                                        class38 var131;
                                        if (var130 == null) {
                                            byte[] var132 = Statics.field942.method2725(4, var129);
                                            class38 var133 = new class38();
                                            if (var132 != null) {
                                                var133.method747(new class104(var132), var129);
                                            }
                                            var133.method758();
                                            class38.field928.method3130(var133, (long) var129);
                                            var131 = var133;
                                        } else {
                                            var131 = var130;
                                        }
                                        if (!var131.field927) {
                                            var128 = false;
                                        }
                                    }
                                    if (var128 && var113 == var114 && var113 == var115 && var113 == var116) {
                                        Statics.field89[var80][var95][var108] |= 0x924;
                                    }
                                }
                                int var134 = 0;
                                if (var122 != -1) {
                                    var134 = class81.field1444[class6.method471(var122, 96)];
                                }
                                if (var112 == 0) {
                                    var74.method1592(var80, var95, var108, 0, 0, -1, var113, var114, var115, var116, class6.method471(var121, var117), class6.method471(var121, var118), class6.method471(var121, var119), class6.method471(var121, var120), 0, 0, 0, 0, var134, 0);
                                } else {
                                    int var135 = Statics.field80[var80][var95][var108] + 1;
                                    byte var136 = Statics.field85[var80][var95][var108];
                                    int var137 = var112 - 1;
                                    class38 var138 = (class38) class38.field928.method3137((long) var137);
                                    class38 var139;
                                    if (var138 == null) {
                                        byte[] var140 = Statics.field942.method2725(4, var137);
                                        class38 var141 = new class38();
                                        if (var140 != null) {
                                            var141.method747(new class104(var140), var137);
                                        }
                                        var141.method758();
                                        class38.field928.method3130(var141, (long) var137);
                                        var139 = var141;
                                    } else {
                                        var139 = var138;
                                    }
                                    int var143 = var139.field935;
                                    int var144;
                                    int var145;
                                    if (var143 >= 0) {
                                        var144 = Statics.field1445.method1835(var143);
                                        var145 = -1;
                                    } else if (var139.field929 == 16711935) {
                                        var145 = -2;
                                        var143 = -1;
                                        var144 = -2;
                                    } else {
                                        var145 = class6.method2(var139.field933, var139.field934, var139.field936);
                                        int var146 = class6.field99 + var139.field933 & 0xFF;
                                        int var147 = class6.field84 + var139.field936;
                                        if (var147 < 0) {
                                            var147 = 0;
                                        } else if (var147 > 255) {
                                            var147 = 255;
                                        }
                                        var144 = class6.method2(var146, var139.field934, var147);
                                    }
                                    int var148 = 0;
                                    if (var144 != -2) {
                                        var148 = class81.field1444[class6.method2059(var144, 96)];
                                    }
                                    if (var139.field932 != -1) {
                                        int var149 = class6.field99 + var139.field931 & 0xFF;
                                        int var150 = class6.field84 + var139.field938;
                                        if (var150 < 0) {
                                            var150 = 0;
                                        } else if (var150 > 255) {
                                            var150 = 255;
                                        }
                                        int var151 = class6.method2(var149, var139.field937, var150);
                                        var148 = class81.field1444[class6.method2059(var151, 96)];
                                    }
                                    var74.method1592(var80, var95, var108, var135, var136, var143, var113, var114, var115, var116, class6.method471(var121, var117), class6.method471(var121, var118), class6.method471(var121, var119), class6.method471(var121, var120), class6.method2059(var145, var117), class6.method2059(var145, var118), class6.method2059(var145, var119), class6.method2059(var145, var120), var134, var148);
                                }
                            }
                        }
                    }
                }
            }
            for (int var152 = 1; var152 < 103; var152++) {
                for (int var153 = 1; var153 < 103; var153++) {
                    var74.method1714(var80, var153, var152, class6.method577(var80, var153, var152));
                }
            }
            Statics.field82[var80] = (byte[][]) null;
            Statics.field100[var80] = (byte[][]) null;
            Statics.field80[var80] = (byte[][]) null;
            Statics.field85[var80] = (byte[][]) null;
            Statics.field86[var80] = (byte[][]) null;
        }
        var74.method1694(-50, -10, -50);
        for (int var154 = 0; var154 < 104; var154++) {
            for (int var155 = 0; var155 < 104; var155++) {
                if ((class6.field93[1][var154][var155] & 0x2) == 2) {
                    var74.method1589(var154, var155);
                }
            }
        }
        int var156 = 1;
        int var157 = 2;
        int var158 = 4;
        for (int var159 = 0; var159 < 4; var159++) {
            if (var159 > 0) {
                var156 <<= 0x3;
                var157 <<= 0x3;
                var158 <<= 0x3;
            }
            for (int var160 = 0; var160 <= var159; var160++) {
                for (int var161 = 0; var161 <= 104; var161++) {
                    for (int var162 = 0; var162 <= 104; var162++) {
                        if ((Statics.field89[var160][var162][var161] & var156) != 0) {
                            int var163 = var161;
                            int var164 = var161;
                            int var165 = var160;
                            int var166 = var160;
                            while (var163 > 0 && (Statics.field89[var160][var162][var163 - 1] & var156) != 0) {
                                var163--;
                            }
                            while (var164 < 104 && (Statics.field89[var160][var162][var164 + 1] & var156) != 0) {
                                var164++;
                            }
                            label610: while (var165 > 0) {
                                for (int var167 = var163; var167 <= var164; var167++) {
                                    if ((Statics.field89[var165 - 1][var162][var167] & var156) == 0) {
                                        break label610;
                                    }
                                }
                                var165--;
                            }
                            label599: while (var166 < var159) {
                                for (int var168 = var163; var168 <= var164; var168++) {
                                    if ((Statics.field89[var166 + 1][var162][var168] & var156) == 0) {
                                        break label599;
                                    }
                                }
                                var166++;
                            }
                            int var169 = (var166 + 1 - var165) * (var164 - var163 + 1);
                            if (var169 >= 8) {
                                short var170 = 240;
                                int var171 = class6.field97[var166][var162][var163] - var170;
                                int var172 = class6.field97[var165][var162][var163];
                                class76.method1696(var159, 1, var162 * 128, var162 * 128, var163 * 128, var164 * 128 + 128, var171, var172);
                                for (int var173 = var165; var173 <= var166; var173++) {
                                    for (int var174 = var163; var174 <= var164; var174++) {
                                        Statics.field89[var173][var162][var174] &= ~var156;
                                    }
                                }
                            }
                        }
                        if ((Statics.field89[var160][var162][var161] & var157) != 0) {
                            int var175 = var162;
                            int var176 = var162;
                            int var177 = var160;
                            int var178 = var160;
                            while (var175 > 0 && (Statics.field89[var160][var175 - 1][var161] & var157) != 0) {
                                var175--;
                            }
                            while (var176 < 104 && (Statics.field89[var160][var176 + 1][var161] & var157) != 0) {
                                var176++;
                            }
                            label663: while (var177 > 0) {
                                for (int var179 = var175; var179 <= var176; var179++) {
                                    if ((Statics.field89[var177 - 1][var179][var161] & var157) == 0) {
                                        break label663;
                                    }
                                }
                                var177--;
                            }
                            label652: while (var178 < var159) {
                                for (int var180 = var175; var180 <= var176; var180++) {
                                    if ((Statics.field89[var178 + 1][var180][var161] & var157) == 0) {
                                        break label652;
                                    }
                                }
                                var178++;
                            }
                            int var181 = (var178 + 1 - var177) * (var176 - var175 + 1);
                            if (var181 >= 8) {
                                short var182 = 240;
                                int var183 = class6.field97[var178][var175][var161] - var182;
                                int var184 = class6.field97[var177][var175][var161];
                                class76.method1696(var159, 2, var175 * 128, var176 * 128 + 128, var161 * 128, var161 * 128, var183, var184);
                                for (int var185 = var177; var185 <= var178; var185++) {
                                    for (int var186 = var175; var186 <= var176; var186++) {
                                        Statics.field89[var185][var186][var161] &= ~var157;
                                    }
                                }
                            }
                        }
                        if ((Statics.field89[var160][var162][var161] & var158) != 0) {
                            int var187 = var162;
                            int var188 = var162;
                            int var189 = var161;
                            int var190 = var161;
                            while (var189 > 0 && (Statics.field89[var160][var162][var189 - 1] & var158) != 0) {
                                var189--;
                            }
                            while (var190 < 104 && (Statics.field89[var160][var162][var190 + 1] & var158) != 0) {
                                var190++;
                            }
                            label716: while (var187 > 0) {
                                for (int var191 = var189; var191 <= var190; var191++) {
                                    if ((Statics.field89[var160][var187 - 1][var191] & var158) == 0) {
                                        break label716;
                                    }
                                }
                                var187--;
                            }
                            label705: while (var188 < 104) {
                                for (int var192 = var189; var192 <= var190; var192++) {
                                    if ((Statics.field89[var160][var188 + 1][var192] & var158) == 0) {
                                        break label705;
                                    }
                                }
                                var188++;
                            }
                            if ((var188 - var187 + 1) * (var190 - var189 + 1) >= 4) {
                                int var193 = class6.field97[var160][var187][var189];
                                class76.method1696(var159, 4, var187 * 128, var188 * 128 + 128, var189 * 128, var190 * 128 + 128, var193, var193);
                                for (int var194 = var187; var194 <= var188; var194++) {
                                    for (int var195 = var189; var195 <= var190; var195++) {
                                        Statics.field89[var160][var194][var195] &= ~var158;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Statics.method499(true);
        int var196 = class6.field79;
        if (var196 > Statics.field1795) {
            var196 = Statics.field1795;
        }
        if (var196 < Statics.field1795 - 1) {
            int var197 = Statics.field1795 - 1;
        }
        if (field458) {
            Statics.field878.method1702(class6.field79);
        } else {
            Statics.field878.method1702(0);
        }
        for (int var198 = 0; var198 < 104; var198++) {
            for (int var199 = 0; var199 < 104; var199++) {
                method2861(var198, var199);
            }
        }
        method2371();
        for (class14 var200 = (class14) field382.method3178(); var200 != null; var200 = (class14) field382.method3179()) {
            if (var200.field220 == -1) {
                var200.field217 = 0;
                method2672(var200);
            } else {
                var200.method3223();
            }
        }
        class33.field814.method3134();
        if (Statics.field51 != null) {
            field289.method2372(191);
            field289.method2131(1057001181);
        }
        if (!field310) {
            int var201 = (Statics.field2115 - 6) / 8;
            int var202 = (Statics.field2115 + 6) / 8;
            int var203 = (Statics.field2437 - 6) / 8;
            int var204 = (Statics.field2437 + 6) / 8;
            for (int var205 = var201 - 1; var205 <= var202 + 1; var205++) {
                for (int var206 = var203 - 1; var206 <= var204 + 1; var206++) {
                    if (var205 < var201 || var205 > var202 || var206 < var203 || var206 > var204) {
                        Statics.field658.method2714("m" + var205 + "_" + var206);
                        Statics.field658.method2714("l" + var205 + "_" + var206);
                    }
                }
            }
        }
        method138(30);
        method2371();
        Statics.field82 = (byte[][][]) null;
        Statics.field100 = (byte[][][]) null;
        Statics.field80 = (byte[][][]) null;
        Statics.field85 = (byte[][][]) null;
        Statics.field89 = (int[][][]) null;
        Statics.field86 = (byte[][][]) null;
        Statics.field87 = (int[][]) null;
        Statics.field81 = null;
        Statics.field1456 = null;
        Statics.field1242 = null;
        Statics.field176 = null;
        Statics.field1951 = null;
        field289.method2372(186);
        class128.method129();
    }

    @ObfuscatedName("g.at(II)V")
    public static final void method31(int arg0) {
        int[] var1 = Statics.field2627.field1265;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field93[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field878.method1621(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field93[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field878.method1621(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2627.method1396();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field93[arg0][var10][var9] & 0x18) == 0) {
                    method167(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field93[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method167(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field476 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field878.method1616(Statics.field1795, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class33.method13(var14).field805;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field307[Statics.field1795].field2897;
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
                        field479[field476] = Statics.field1869[var15];
                        field477[field476] = var16;
                        field478[field476] = var17;
                        field476++;
                    }
                }
            }
        }
        Statics.field2608.method1391();
    }

    @ObfuscatedName("v.as(IIIIII)V")
    public static final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field878.method1655(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field878.method1755(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2627.field1265;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class33 var13 = class33.method13(var12);
            if (var13.field827 == -1) {
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
                class71 var14 = Statics.field174[var13.field827];
                if (var14 != null) {
                    int var15 = (var13.field813 * 4 - var14.field1285) / 2;
                    int var16 = (var13.field816 * 4 - var14.field1288) / 2;
                    var14.method1552(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field816) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field878.method1744(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field878.method1755(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class33 var22 = class33.method13(var21);
            if (var22.field827 != -1) {
                class71 var23 = Statics.field174[var22.field827];
                if (var23 != null) {
                    int var24 = (var22.field813 * 4 - var23.field1285) / 2;
                    int var25 = (var22.field816 * 4 - var23.field1288) / 2;
                    var23.method1552(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field816) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2627.field1265;
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
        int var29 = Statics.field878.method1616(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class33 var31 = class33.method13(var30);
        if (var31.field827 == -1) {
            return;
        }
        class71 var32 = Statics.field174[var31.field827];
        if (var32 != null) {
            int var33 = (var31.field813 * 4 - var32.field1285) / 2;
            int var34 = (var31.field816 * 4 - var32.field1288) / 2;
            var32.method1552(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field816) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("v.ae(I)Z")
    public static final boolean method161() {
        if (Statics.field2909 == null) {
            return false;
        }
        try {
            int var0 = Statics.field2909.method2562();
            if (var0 == 0) {
                return false;
            }
            if (field319 == -1) {
                Statics.field2909.method2563(field291.field1808, 0, 1);
                field291.field1806 = 0;
                field319 = field291.method2374();
                field292 = class162.field2761[field319];
                var0--;
            }
            if (field292 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field2909.method2563(field291.field1808, 0, 1);
                field292 = field291.field1808[0] & 0xFF;
                var0--;
            }
            if (field292 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field2909.method2563(field291.field1808, 0, 2);
                field291.field1806 = 0;
                field292 = field291.method2132();
                var0 -= 2;
            }
            if (var0 < field292) {
                return false;
            }
            field291.field1806 = 0;
            Statics.field2909.method2563(field291.field1808, 0, field292);
            field294 = 0;
            field299 = field298;
            field298 = field485;
            field485 = field319;
            if (field319 == 20) {
                Statics.field103 = field291.method2190();
                Statics.field1899 = field291.method2197();
                while (field291.field1806 < field292) {
                    field319 = field291.method2190();
                    method2075();
                }
                field319 = -1;
                return true;
            }
            if (field319 == 160) {
                String var1 = field291.method2138();
                String var2 = class182.method3268(class189.method481(class181.method796(field291)));
                method2508(6, var1, var2);
                field319 = -1;
                return true;
            }
            if (field319 == 78) {
                class107 var3 = field291;
                int var4 = field292;
                class178 var5 = new class178();
                var5.field2818 = var3.method2190();
                var5.field2820 = var3.method2135();
                var5.field2819 = new int[var5.field2818];
                var5.field2821 = new int[var5.field2818];
                var5.field2822 = new Field[var5.field2818];
                var5.field2823 = new int[var5.field2818];
                var5.field2824 = new Method[var5.field2818];
                var5.field2825 = new byte[var5.field2818][][];
                for (int var6 = 0; var6 < var5.field2818; var6++) {
                    try {
                        int var7 = var3.method2190();
                        if (var7 == 0 || var7 == 1 || var7 == 2) {
                            String var8 = new String(var3.method2138());
                            String var9 = new String(var3.method2138());
                            int var10 = 0;
                            if (var7 == 1) {
                                var10 = var3.method2135();
                            }
                            var5.field2819[var6] = var7;
                            var5.field2823[var6] = var10;
                            var5.field2822[var6] = class179.method1862(var8).getDeclaredField(var9);
                        } else if (var7 == 3 || var7 == 4) {
                            String var11 = new String(var3.method2138());
                            String var12 = new String(var3.method2138());
                            int var13 = var3.method2190();
                            String[] var14 = new String[var13];
                            for (int var15 = 0; var15 < var13; var15++) {
                                var14[var15] = new String(var3.method2138());
                            }
                            byte[][] var16 = new byte[var13][];
                            if (var7 == 3) {
                                for (int var17 = 0; var17 < var13; var17++) {
                                    int var18 = var3.method2135();
                                    var16[var17] = new byte[var18];
                                    var3.method2291(var16[var17], 0, var18);
                                }
                            }
                            var5.field2819[var6] = var7;
                            Class[] var19 = new Class[var13];
                            for (int var20 = 0; var20 < var13; var20++) {
                                var19[var20] = class179.method1862(var14[var20]);
                            }
                            var5.field2824[var6] = class179.method1862(var11).getDeclaredMethod(var12, var19);
                            var5.field2825[var6] = var16;
                        }
                    } catch (ClassNotFoundException var276) {
                        var5.field2821[var6] = -1;
                    } catch (SecurityException var277) {
                        var5.field2821[var6] = -2;
                    } catch (NullPointerException var278) {
                        var5.field2821[var6] = -3;
                    } catch (Exception var279) {
                        var5.field2821[var6] = -4;
                    } catch (Throwable var280) {
                        var5.field2821[var6] = -5;
                    }
                }
                class179.field2826.method3180(var5);
                field319 = -1;
                return true;
            }
            if (field319 == 11) {
                method153();
                field319 = -1;
                return true;
            }
            if (field319 == 51) {
                int var26 = field291.method2190();
                class114[] var27 = new class114[] { class114.field1865, class114.field1867, class114.field1864 };
                class114[] var28 = var27;
                int var29 = 0;
                class114 var31;
                while (true) {
                    if (var29 >= var28.length) {
                        var31 = null;
                        break;
                    }
                    class114 var30 = var28[var29];
                    if (var30.field1866 == var26) {
                        var31 = var30;
                        break;
                    }
                    var29++;
                }
                Statics.field667 = var31;
                field319 = -1;
                return true;
            }
            if (field319 == 140) {
                method2659();
                field413 = field291.method2154();
                field441 = field318;
                field319 = -1;
                return true;
            }
            if (field319 == 123) {
                int var32 = field291.method2190();
                int var33 = field291.method2190();
                int var34 = field291.method2190();
                int var35 = field291.method2190();
                field495[var32] = true;
                field496[var32] = var33;
                field409[var32] = var34;
                field498[var32] = var35;
                field396[var32] = 0;
                field319 = -1;
                return true;
            }
            if (field319 == 241) {
                int var36 = field291.method2170();
                Statics.field2623 = Statics.field1949.method2471(var36);
                field319 = -1;
                return true;
            }
            if (field319 == 234) {
                method2795(false);
                field319 = -1;
                return true;
            }
            if (field319 == 229) {
                field266 = field291.method2261() * 30;
                field441 = field318;
                field319 = -1;
                return true;
            }
            if (field319 == 167) {
                while (field291.field1806 < field292) {
                    boolean var37 = field291.method2190() == 1;
                    String var38 = field291.method2138();
                    String var39 = field291.method2138();
                    int var40 = field291.method2132();
                    int var41 = field291.method2190();
                    int var42 = field291.method2190();
                    boolean var43 = (var42 & 0x2) != 0;
                    boolean var44 = (var42 & 0x1) != 0;
                    if (var40 > 0) {
                        field291.method2138();
                        field291.method2190();
                        field291.method2135();
                    }
                    field291.method2138();
                    for (int var45 = 0; var45 < field491; var45++) {
                        class15 var46 = field502[var45];
                        if (var37) {
                            if (var39.equals(var46.field229)) {
                                var46.field229 = var38;
                                var46.field224 = var39;
                                var38 = null;
                                break;
                            }
                        } else if (var38.equals(var46.field229)) {
                            if (var46.field231 != var40) {
                                boolean var47 = true;
                                for (class31 var48 = (class31) field503.method3145(); var48 != null; var48 = (class31) field503.method3149()) {
                                    if (var48.field751.equals(var38)) {
                                        if (var40 != 0 && var48.field752 == 0) {
                                            var48.method3222();
                                            var47 = false;
                                        } else if (var40 == 0 && var48.field752 != 0) {
                                            var48.method3222();
                                            var47 = false;
                                        }
                                    }
                                }
                                if (var47) {
                                    field503.method3144(new class31(var38, var40));
                                }
                                var46.field231 = var40;
                            }
                            var46.field224 = var39;
                            var46.field226 = var41;
                            var46.field227 = var43;
                            var46.field228 = var44;
                            var38 = null;
                            break;
                        }
                    }
                    if (var38 != null && field491 < 400) {
                        class15 var49 = new class15();
                        field502[field491] = var49;
                        var49.field229 = var38;
                        var49.field224 = var39;
                        var49.field231 = var40;
                        var49.field226 = var41;
                        var49.field227 = var43;
                        var49.field228 = var44;
                        field491++;
                    }
                }
                field501 = 2;
                field439 = field318;
                boolean var50 = false;
                int var51 = field491;
                while (var51 > 0) {
                    boolean var52 = true;
                    var51--;
                    for (int var53 = 0; var53 < var51; var53++) {
                        boolean var54 = false;
                        class15 var55 = field502[var53];
                        class15 var56 = field502[var53 + 1];
                        if (field249 != var55.field231 && field249 == var56.field231) {
                            var54 = true;
                        }
                        if (!var54 && var55.field231 == 0 && var56.field231 != 0) {
                            var54 = true;
                        }
                        if (!var54 && !var55.field227 && var56.field227) {
                            var54 = true;
                        }
                        if (!var54 && !var55.field228 && var56.field228) {
                            var54 = true;
                        }
                        if (var54) {
                            class15 var57 = field502[var53];
                            field502[var53] = field502[var53 + 1];
                            field502[var53 + 1] = var57;
                            var52 = false;
                        }
                    }
                    if (var52) {
                        break;
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 183) {
                class21 var58 = new class21();
                var58.field569 = field291.method2138();
                var58.field577 = field291.method2132();
                int var59 = field291.method2135();
                var58.field567 = var59;
                method138(45);
                Statics.field2909.method2560();
                Statics.field2909 = null;
                class26.method2066(var58);
                field319 = -1;
                return false;
            }
            if (field319 == 121) {
                int var60 = field291.method2135();
                int var61 = field291.method2261();
                if (var61 == 65535) {
                    var61 = -1;
                }
                int var62 = field291.method2172();
                class148 var63 = class148.method1290(var60);
                if (var63.field2476) {
                    var63.field2581 = var61;
                    var63.field2582 = var62;
                    class42 var65 = class42.method124(var61);
                    var63.field2489 = var65.field992;
                    var63.field2518 = var65.field995;
                    var63.field2519 = var65.field994;
                    var63.field2554 = var65.field1015;
                    var63.field2516 = var65.field996;
                    var63.field2520 = var65.field991;
                    if (var63.field2485 > 0) {
                        var63.field2520 = var63.field2520 * 32 / var63.field2485;
                    }
                    method141(var63);
                } else if (var61 == -1) {
                    var63.field2509 = 0;
                    field319 = -1;
                    return true;
                } else {
                    class42 var64 = class42.method124(var61);
                    var63.field2509 = 4;
                    var63.field2547 = var61;
                    var63.field2489 = var64.field992;
                    var63.field2518 = var64.field995;
                    var63.field2520 = var64.field991 * 100 / var62;
                    method141(var63);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 254) {
                String var66 = field291.method2138();
                long var67 = (long) field291.method2132();
                long var69 = (long) field291.method2134();
                int var71 = field291.method2190();
                long var72 = (var67 << 32) + var69;
                boolean var74 = false;
                for (int var75 = 0; var75 < 100; var75++) {
                    if (field467[var75] == var72) {
                        var74 = true;
                        break;
                    }
                }
                if (method150(var66)) {
                    var74 = true;
                }
                if (!var74 && field255 == 0) {
                    field467[field468] = var72;
                    field468 = (field468 + 1) % 100;
                    String var76 = class182.method3268(class189.method481(class181.method796(field291)));
                    if (var71 == 2 || var71 == 3) {
                        method2508(7, class2.method572(1) + var66, var76);
                    } else if (var71 == 1) {
                        method2508(7, class2.method572(0) + var66, var76);
                    } else {
                        method2508(3, var66, var76);
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 13) {
                method2659();
                field412 = field291.method2190();
                field441 = field318;
                field319 = -1;
                return true;
            }
            if (field319 == 158) {
                int var77 = field292 + field291.field1806;
                int var78 = field291.method2132();
                int var79 = field291.method2132();
                if (field361 != var78) {
                    field361 = var78;
                    Statics.method163(field361);
                    class29.method795(field361);
                    for (int var80 = 0; var80 < 100; var80++) {
                        field499[var80] = true;
                    }
                }
                while (var79-- > 0) {
                    int var81 = field291.method2135();
                    int var82 = field291.method2132();
                    int var83 = field291.method2190();
                    class4 var84 = (class4) field408.method3159((long) var81);
                    if (var84 != null && var84.field65 != var82) {
                        method134(var84, true);
                        var84 = null;
                    }
                    if (var84 == null) {
                        var84 = method1287(var81, var82, var83);
                    }
                    var84.field62 = true;
                }
                for (class4 var85 = (class4) field408.method3156(); var85 != null; var85 = (class4) field408.method3157()) {
                    if (var85.field62) {
                        var85.field62 = false;
                    } else {
                        method134(var85, true);
                    }
                }
                field272 = new class169(512);
                while (field291.field1806 < var77) {
                    int var86 = field291.method2135();
                    int var87 = field291.method2132();
                    int var88 = field291.method2132();
                    int var89 = field291.method2135();
                    for (int var90 = var87; var90 <= var88; var90++) {
                        long var91 = ((long) var86 << 32) + (long) var90;
                        field272.method3165(new class172(var89), var91);
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 220) {
                for (int var93 = 0; var93 < Statics.field1030; var93++) {
                    class43 var94 = class43.method102(var93);
                    if (var94 != null) {
                        class150.field2602[var93] = 0;
                        class150.field2603[var93] = 0;
                    }
                }
                method2659();
                field443 += 32;
                field319 = -1;
                return true;
            }
            if (field319 == 106) {
                int var95 = field291.method2143();
                boolean var96 = field291.method2190() == 1;
                String var97 = "";
                boolean var98 = false;
                if (var96) {
                    var97 = field291.method2138();
                    if (method150(var97)) {
                        var98 = true;
                    }
                }
                String var99 = field291.method2138();
                if (!var98) {
                    method2508(var95, var97, var99);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 7) {
                method2795(true);
                field319 = -1;
                return true;
            }
            if (field319 == 1) {
                field480 = field291.method2190();
                if (field480 == 255) {
                    field480 = 0;
                }
                field481 = field291.method2190();
                if (field481 == 255) {
                    field481 = 0;
                }
                field319 = -1;
                return true;
            }
            if (field319 == 102) {
                int var100 = field291.method2132();
                if (var100 == 65535) {
                    var100 = -1;
                }
                if (var100 == -1 && !field421) {
                    class157.method515();
                } else if (var100 != -1 && field312 != var100 && field483 != 0 && !field421) {
                    class143 var101 = Statics.field1996;
                    int var102 = field483;
                    class157.field2660 = 1;
                    Statics.field183 = var101;
                    Statics.field1638 = var100;
                    Statics.field2366 = 0;
                    Statics.field2657 = var102;
                    Statics.field2662 = false;
                    Statics.field2056 = 2;
                }
                field312 = var100;
                field319 = -1;
                return true;
            }
            if (field319 == 210) {
                int var103 = field291.method2161();
                if (var103 == 65535) {
                    var103 = -1;
                }
                int var104 = field291.method2166();
                method35(var103, var104);
                field319 = -1;
                return true;
            }
            if (field319 == 246) {
                String var105 = field291.method2138();
                int var106 = field291.method2132();
                byte var107 = field291.method2159();
                boolean var108 = false;
                if (var107 == -128) {
                    var108 = true;
                }
                if (var108) {
                    if (Statics.field418 == 0) {
                        field319 = -1;
                        return true;
                    }
                    boolean var109 = false;
                    int var110;
                    for (var110 = 0; var110 < Statics.field418 && (!Statics.field1311[var110].field563.equals(var105) || Statics.field1311[var110].field559 != var106); var110++) {
                    }
                    if (var110 < Statics.field418) {
                        while (var110 < Statics.field418 - 1) {
                            Statics.field1311[var110] = Statics.field1311[var110 + 1];
                            var110++;
                        }
                        Statics.field418--;
                        Statics.field1311[Statics.field418] = null;
                    }
                } else {
                    field291.method2138();
                    class20 var111 = new class20();
                    var111.field563 = var105;
                    var111.field562 = class190.method2903(var111.field563, Statics.field184);
                    var111.field559 = var106;
                    var111.field561 = var107;
                    int var112;
                    for (var112 = Statics.field418 - 1; var112 >= 0; var112--) {
                        int var113 = Statics.field1311[var112].field562.compareTo(var111.field563);
                        if (var113 == 0) {
                            Statics.field1311[var112].field559 = var106;
                            Statics.field1311[var112].field561 = var107;
                            if (var105.equals(Statics.field944.field38)) {
                                Statics.field1243 = var107;
                            }
                            field363 = field318;
                            field319 = -1;
                            return true;
                        }
                        if (var113 < 0) {
                            break;
                        }
                    }
                    if (Statics.field418 >= Statics.field1311.length) {
                        field319 = -1;
                        return true;
                    }
                    for (int var114 = Statics.field418 - 1; var114 > var112; var114--) {
                        Statics.field1311[var114 + 1] = Statics.field1311[var114];
                    }
                    if (Statics.field418 == 0) {
                        Statics.field1311 = new class20[100];
                    }
                    Statics.field1311[var112 + 1] = var111;
                    Statics.field418++;
                    if (var105.equals(Statics.field944.field38)) {
                        Statics.field1243 = var107;
                    }
                }
                field363 = field318;
                field319 = -1;
                return true;
            }
            if (field319 == 175) {
                int var115 = field291.method2135();
                int var116 = field291.method2132();
                if (var115 < -70000) {
                    var116 += 32768;
                }
                class148 var117;
                if (var115 >= 0) {
                    var117 = class148.method1290(var115);
                } else {
                    var117 = null;
                }
                while (field291.field1806 < field292) {
                    int var118 = field291.method2143();
                    int var119 = field291.method2132();
                    int var120 = 0;
                    if (var119 != 0) {
                        var120 = field291.method2190();
                        if (var120 == 255) {
                            var120 = field291.method2135();
                        }
                    }
                    if (var117 != null && var118 >= 0 && var118 < var117.field2579.length) {
                        var117.field2579[var118] = var119;
                        var117.field2580[var118] = var120;
                    }
                    class13.method2434(var116, var118, var119 - 1, var120);
                }
                if (var117 != null) {
                    method141(var117);
                }
                method2659();
                field487[++field435 - 1 & 0x1F] = var116 & 0x7FFF;
                field319 = -1;
                return true;
            }
            if (field319 == 85) {
                int var121 = field291.method2170();
                int var122 = field291.method2161();
                class148 var123 = class148.method1290(var121);
                if (var123.field2509 != 2 || var123.field2547 != var122) {
                    var123.field2509 = 2;
                    var123.field2547 = var122;
                    method141(var123);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 87) {
                field291.field1806 += 28;
                if (field291.method2125()) {
                    class133.method649(field291, field291.field1806 - 28);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 138) {
                method2659();
                int var124 = field291.method2172();
                int var125 = field291.method2190();
                int var126 = field291.method2153();
                field387[var126] = var124;
                field385[var126] = var125;
                field386[var126] = 1;
                for (int var127 = 0; var127 < 98; var127++) {
                    if (var124 >= class137.field2103[var127]) {
                        field386[var126] = var127 + 2;
                    }
                }
                field297[++field437 - 1 & 0x1F] = var126;
                field319 = -1;
                return true;
            }
            if (field319 == 200) {
                method473();
                field319 = -1;
                return false;
            }
            if (field319 == 231) {
                int var128 = field291.method2190();
                int var129 = field291.method2197();
                int var130 = field291.method2190();
                Statics.field1795 = var130 >> 1;
                Statics.field944.method561(var129, var128, (var130 & 0x1) == 1);
                field319 = -1;
                return true;
            }
            if (field319 == 170) {
                String var131 = field291.method2138();
                Object[] var132 = new Object[var131.length() + 1];
                for (int var133 = var131.length() - 1; var133 >= 0; var133--) {
                    if (var131.charAt(var133) == 's') {
                        var132[var133 + 1] = field291.method2138();
                    } else {
                        var132[var133 + 1] = Integer.valueOf(field291.method2135());
                    }
                }
                var132[0] = Integer.valueOf(field291.method2135());
                class1 var134 = new class1();
                var134.field9 = var132;
                class29.method2814(var134);
                field319 = -1;
                return true;
            }
            if (field319 == 17) {
                if (field361 != -1) {
                    int var135 = field361;
                    if (class148.method148(var135)) {
                        Statics.method120(Statics.field2524[var135], 0);
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 141) {
                int var136 = field291.method2261();
                field361 = var136;
                Statics.method163(var136);
                class29.method795(field361);
                for (int var137 = 0; var137 < 100; var137++) {
                    field499[var137] = true;
                }
                field319 = -1;
                return true;
            }
            if (field319 == 19) {
                field501 = 1;
                field439 = field318;
                field319 = -1;
                return true;
            }
            if (field319 == 68) {
                int var138 = field291.method2161();
                int var139 = field291.method2171();
                class150.field2602[var138] = var139;
                if (class150.field2603[var138] != var139) {
                    class150.field2603[var138] = var139;
                    method1761(var138);
                }
                field451[++field443 - 1 & 0x1F] = var138;
                field319 = -1;
                return true;
            }
            if (field319 == 130) {
                int var140 = field291.method2153();
                int var141 = field291.method2153();
                String var142 = field291.method2138();
                if (var140 >= 1 && var140 <= 8) {
                    if (var142.equalsIgnoreCase("null")) {
                        var142 = null;
                    }
                    field398[var140 - 1] = var142;
                    field378[var140 - 1] = var141 == 0;
                }
                field319 = -1;
                return true;
            }
            if (field319 == 84) {
                byte var143 = field291.method2156();
                int var144 = field291.method2161();
                class150.field2602[var144] = var143;
                if (class150.field2603[var144] != var143) {
                    class150.field2603[var144] = var143;
                    method1761(var144);
                }
                field451[++field443 - 1 & 0x1F] = var144;
                field319 = -1;
                return true;
            }
            if (field319 == 61) {
                int var145 = field291.method2135();
                int var146 = field291.method2132();
                if (var145 < -70000) {
                    var146 += 32768;
                }
                class148 var147;
                if (var145 >= 0) {
                    var147 = class148.method1290(var145);
                } else {
                    var147 = null;
                }
                if (var147 != null) {
                    for (int var148 = 0; var148 < var147.field2579.length; var148++) {
                        var147.field2579[var148] = 0;
                        var147.field2580[var148] = 0;
                    }
                }
                class13 var149 = (class13) class13.field207.method3159((long) var146);
                if (var149 != null) {
                    for (int var150 = 0; var150 < var149.field203.length; var150++) {
                        var149.field203[var150] = -1;
                        var149.field204[var150] = 0;
                    }
                }
                int var151 = field291.method2132();
                for (int var152 = 0; var152 < var151; var152++) {
                    int var153 = field291.method2132();
                    int var154 = field291.method2155();
                    if (var154 == 255) {
                        var154 = field291.method2135();
                    }
                    if (var147 != null && var152 < var147.field2579.length) {
                        var147.field2579[var152] = var153;
                        var147.field2580[var152] = var154;
                    }
                    class13.method2434(var146, var152, var153 - 1, var154);
                }
                if (var147 != null) {
                    method141(var147);
                }
                method2659();
                field487[++field435 - 1 & 0x1F] = var146 & 0x7FFF;
                field319 = -1;
                return true;
            }
            if (field319 == 219) {
                int var155 = field291.method2170();
                int var156 = field291.method2161();
                class148 var157 = class148.method1290(var155);
                if (var157 != null && var157.field2479 == 0) {
                    if (var156 > var157.field2575 - var157.field2487) {
                        var156 = var157.field2575 - var157.field2487;
                    }
                    if (var156 < 0) {
                        var156 = 0;
                    }
                    if (var157.field2551 != var156) {
                        var157.field2551 = var156;
                        method141(var157);
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 236) {
                int var158 = field291.method2135();
                int var159 = field291.method2132();
                int var160 = field291.method2261();
                class148 var161 = class148.method1290(var158);
                var161.field2521 = (var160 << 16) + var159;
                field319 = -1;
                return true;
            }
            if (field319 == 247) {
                int var162 = field291.method2135();
                class148 var163 = class148.method1290(var162);
                var163.field2509 = 3;
                var163.field2547 = Statics.field944.field50.method2920();
                method141(var163);
                field319 = -1;
                return true;
            }
            if (field319 == 64) {
                Statics.field103 = field291.method2197();
                Statics.field1899 = field291.method2155();
                field319 = -1;
                return true;
            }
            if (field319 == 176) {
                int var164 = field291.method2154();
                int var165 = field291.method2135();
                int var166 = field291.method2154();
                class148 var167 = class148.method1290(var165);
                int var168 = var167.field2484 + var166;
                int var169 = var167.field2515 + var164;
                if (var167.field2482 != var168 || var167.field2555 != var169) {
                    var167.field2482 = var168;
                    var167.field2555 = var169;
                    method141(var167);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 44) {
                int var170 = field291.method2162();
                if (var170 == 65535) {
                    var170 = -1;
                }
                int var171 = field291.method2172();
                int var172 = field291.method2172();
                int var173 = field291.method2162();
                if (var173 == 65535) {
                    var173 = -1;
                }
                for (int var174 = var173; var174 <= var170; var174++) {
                    long var175 = ((long) var172 << 32) + (long) var174;
                    class176 var177 = field272.method3159(var175);
                    if (var177 != null) {
                        var177.method3223();
                    }
                    field272.method3165(new class172(var171), var175);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 69) {
                int var178 = field291.method2161();
                class13 var179 = (class13) class13.field207.method3159((long) var178);
                if (var179 != null) {
                    var179.method3223();
                }
                field487[++field435 - 1 & 0x1F] = var178 & 0x7FFF;
                field319 = -1;
                return true;
            }
            if (field319 == 39) {
                field273 = field291.method2190();
                field319 = -1;
                return true;
            }
            if (field319 == 192 || field319 == 54 || field319 == 214 || field319 == 251 || field319 == 126 || field319 == 145 || field319 == 33 || field319 == 202 || field319 == 144 || field319 == 91) {
                method2075();
                field319 = -1;
                return true;
            }
            if (field319 == 89) {
                int var180 = field291.method2170();
                int var181 = field291.method2161();
                int var182 = field291.method2132();
                int var183 = field291.method2261();
                class148 var184 = class148.method1290(var180);
                if (var184.field2489 != var181 || var184.field2518 != var183 || var184.field2520 != var182) {
                    var184.field2489 = var181;
                    var184.field2518 = var183;
                    var184.field2520 = var182;
                    method141(var184);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 52) {
                while (field291.field1806 < field292) {
                    int var185 = field291.method2190();
                    boolean var186 = (var185 & 0x1) == 1;
                    String var187 = field291.method2138();
                    String var188 = field291.method2138();
                    field291.method2138();
                    for (int var189 = 0; var189 < field504; var189++) {
                        class8 var190 = field505[var189];
                        if (var186) {
                            if (var188.equals(var190.field131)) {
                                var190.field131 = var187;
                                var190.field134 = var188;
                                var187 = null;
                                break;
                            }
                        } else if (var187.equals(var190.field131)) {
                            var190.field131 = var187;
                            var190.field134 = var188;
                            var187 = null;
                            break;
                        }
                    }
                    if (var187 != null && field504 < 400) {
                        class8 var191 = new class8();
                        field505[field504] = var191;
                        var191.field131 = var187;
                        var191.field134 = var188;
                        field504++;
                    }
                }
                field439 = field318;
                field319 = -1;
                return true;
            }
            if (field319 == 239) {
                int var192 = field291.method2171();
                int var193 = field291.method2162();
                class148 var194 = class148.method1290(var192);
                if (var194.field2509 != 1 || var194.field2547 != var193) {
                    var194.field2509 = 1;
                    var194.field2547 = var193;
                    method141(var194);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 132) {
                Statics.field103 = field291.method2155();
                Statics.field1899 = field291.method2153();
                for (int var195 = Statics.field1899; var195 < Statics.field1899 + 8; var195++) {
                    for (int var196 = Statics.field103; var196 < Statics.field103 + 8; var196++) {
                        if (field381[Statics.field1795][var195][var196] != null) {
                            field381[Statics.field1795][var195][var196] = null;
                            method2861(var195, var196);
                        }
                    }
                }
                for (class14 var197 = (class14) field382.method3178(); var197 != null; var197 = (class14) field382.method3179()) {
                    if (var197.field209 >= Statics.field1899 && var197.field209 < Statics.field1899 + 8 && var197.field210 >= Statics.field103 && var197.field210 < Statics.field103 + 8 && Statics.field1795 == var197.field212) {
                        var197.field220 = 0;
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 70) {
                field442 = true;
                Statics.field66 = field291.method2190();
                Statics.field133 = field291.method2190();
                Statics.field953 = field291.method2132();
                Statics.field1846 = field291.method2190();
                Statics.field629 = field291.method2190();
                if (Statics.field629 >= 100) {
                    int var198 = Statics.field66 * 128 + 64;
                    int var199 = Statics.field133 * 128 + 64;
                    int var200 = method11(var198, var199, Statics.field1795) - Statics.field953;
                    int var201 = var198 - Statics.field1389;
                    int var202 = var200 - Statics.field223;
                    int var203 = var199 - Statics.field2051;
                    int var204 = (int) Math.sqrt((double) (var201 * var201 + var203 * var203));
                    Statics.field2369 = (int) (Math.atan2((double) var202, (double) var204) * 325.949D) & 0x7FF;
                    Statics.field1640 = (int) (Math.atan2((double) var201, (double) var203) * -325.949D) & 0x7FF;
                    if (Statics.field2369 < 128) {
                        Statics.field2369 = 128;
                    }
                    if (Statics.field2369 > 383) {
                        Statics.field2369 = 383;
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 196) {
                field442 = true;
                Statics.field1862 = field291.method2190();
                Statics.field1307 = field291.method2190();
                Statics.field2869 = field291.method2132();
                Statics.field511 = field291.method2190();
                Statics.field2019 = field291.method2190();
                if (Statics.field2019 >= 100) {
                    Statics.field1389 = Statics.field1862 * 128 + 64;
                    Statics.field2051 = Statics.field1307 * 128 + 64;
                    Statics.field223 = method11(Statics.field1389, Statics.field2051, Statics.field1795) - Statics.field2869;
                }
                field319 = -1;
                return true;
            }
            if (field319 == 171) {
                int var205 = field291.method2132();
                int var206 = field291.method2190();
                int var207 = field291.method2132();
                if (field486 != 0 && var206 != 0 && field377 < 50) {
                    field489[field377] = var205;
                    field490[field377] = var206;
                    field317[field377] = var207;
                    field405[field377] = null;
                    field492[field377] = 0;
                    field377++;
                }
                field319 = -1;
                return true;
            }
            if (field319 == 75) {
                String var211 = field291.method2138();
                int var212 = field291.method2170();
                class148 var213 = class148.method1290(var212);
                if (!var211.equals(var213.field2537)) {
                    var213.field2537 = var211;
                    method141(var213);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 225) {
                int var214 = field291.method2162();
                int var215 = field291.method2190();
                int var216 = field291.method2170();
                class4 var217 = (class4) field408.method3159((long) var216);
                if (var217 != null) {
                    method134(var217, var217.field65 != var214);
                }
                method1287(var216, var214, var215);
                field319 = -1;
                return true;
            }
            if (field319 == 3) {
                method149();
                field319 = -1;
                return true;
            }
            if (field319 == 252) {
                for (int var218 = 0; var218 < field366.length; var218++) {
                    if (field366[var218] != null) {
                        field366[var218].field721 = -1;
                    }
                }
                for (int var219 = 0; var219 < field410.length; var219++) {
                    if (field410[var219] != null) {
                        field410[var219].field721 = -1;
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 27) {
                int var220 = field291.method2135();
                class4 var221 = (class4) field408.method3159((long) var220);
                if (var221 != null) {
                    method134(var221, true);
                }
                if (field446 != null) {
                    method141(field446);
                    field446 = null;
                }
                field319 = -1;
                return true;
            }
            if (field319 == 30) {
                field442 = false;
                for (int var222 = 0; var222 < 5; var222++) {
                    field495[var222] = false;
                }
                field319 = -1;
                return true;
            }
            if (field319 == 74) {
                String var223 = field291.method2138();
                long var224 = field291.method2136();
                long var226 = (long) field291.method2132();
                long var228 = (long) field291.method2134();
                int var230 = field291.method2190();
                long var231 = (var226 << 32) + var228;
                boolean var233 = false;
                for (int var234 = 0; var234 < 100; var234++) {
                    if (field467[var234] == var231) {
                        var233 = true;
                        break;
                    }
                }
                if (var230 <= 1 && method150(var223)) {
                    var233 = true;
                }
                if (!var233 && field255 == 0) {
                    field467[field468] = var231;
                    field468 = (field468 + 1) % 100;
                    String var235 = class182.method3268(class189.method481(class181.method796(field291)));
                    if (var230 == 2 || var230 == 3) {
                        method38(9, class2.method572(1) + var223, var235, class188.method703(var224));
                    } else if (var230 == 1) {
                        method38(9, class2.method572(0) + var223, var235, class188.method703(var224));
                    } else {
                        method38(9, var223, var235, class188.method703(var224));
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 14) {
                field267 = field291.method2190();
                if (field267 == 1) {
                    field268 = field291.method2132();
                }
                if (field267 >= 2 && field267 <= 6) {
                    if (field267 == 2) {
                        field414 = 64;
                        field274 = 64;
                    }
                    if (field267 == 3) {
                        field414 = 0;
                        field274 = 64;
                    }
                    if (field267 == 4) {
                        field414 = 128;
                        field274 = 64;
                    }
                    if (field267 == 5) {
                        field414 = 64;
                        field274 = 0;
                    }
                    if (field267 == 6) {
                        field414 = 64;
                        field274 = 128;
                    }
                    field267 = 2;
                    field270 = field291.method2132();
                    field271 = field291.method2132();
                    field415 = field291.method2190();
                }
                if (field267 == 10) {
                    field269 = field291.method2132();
                }
                field319 = -1;
                return true;
            }
            if (field319 == 34) {
                int var236 = field291.method2170();
                int var237 = field291.method2320();
                class148 var238 = class148.method1290(var236);
                if (var238.field2517 != var237 || var237 == -1) {
                    var238.field2517 = var237;
                    var238.field2583 = 0;
                    var238.field2483 = 0;
                    method141(var238);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 49) {
                int var239 = field291.method2172();
                class148 var240 = class148.method1290(var239);
                for (int var241 = 0; var241 < var240.field2579.length; var241++) {
                    var240.field2579[var241] = -1;
                    var240.field2579[var241] = 0;
                }
                method141(var240);
                field319 = -1;
                return true;
            }
            if (field319 == 180) {
                int var242 = field291.method2261();
                int var243 = field291.method2172();
                int var244 = var242 >> 10 & 0x1F;
                int var245 = var242 >> 5 & 0x1F;
                int var246 = var242 & 0x1F;
                int var247 = (var246 << 3) + (var244 << 19) + (var245 << 11);
                class148 var248 = class148.method1290(var243);
                if (var248.field2494 != var247) {
                    var248.field2494 = var247;
                    method141(var248);
                }
                field319 = -1;
                return true;
            }
            if (field319 == 161) {
                field465 = field291.method2190();
                field466 = field291.method2190();
                field319 = -1;
                return true;
            }
            if (field319 == 25) {
                field363 = field318;
                if (field292 == 0) {
                    field350 = null;
                    field474 = null;
                    Statics.field418 = 0;
                    Statics.field1311 = null;
                    field319 = -1;
                    return true;
                }
                field474 = field291.method2138();
                long var249 = field291.method2136();
                long var251 = var249;
                String var253;
                if (var249 <= 0L || var249 >= 6582952005840035281L) {
                    var253 = null;
                } else if (var249 % 37L == 0L) {
                    var253 = null;
                } else {
                    int var254 = 0;
                    for (long var255 = var249; var255 != 0L; var255 /= 37L) {
                        var254++;
                    }
                    StringBuilder var257 = new StringBuilder(var254);
                    while (var251 != 0L) {
                        long var258 = var251;
                        var251 /= 37L;
                        var257.append(class188.field2901[(int) (var258 - var251 * 37L)]);
                    }
                    var253 = var257.reverse().toString();
                }
                field350 = var253;
                Statics.field155 = field291.method2159();
                int var260 = field291.method2190();
                if (var260 == 255) {
                    field319 = -1;
                    return true;
                }
                Statics.field418 = var260;
                class20[] var261 = new class20[100];
                for (int var262 = 0; var262 < Statics.field418; var262++) {
                    var261[var262] = new class20();
                    var261[var262].field563 = field291.method2138();
                    var261[var262].field562 = class190.method2903(var261[var262].field563, Statics.field184);
                    var261[var262].field559 = field291.method2132();
                    var261[var262].field561 = field291.method2159();
                    field291.method2138();
                    if (var261[var262].field563.equals(Statics.field944.field38)) {
                        Statics.field1243 = var261[var262].field561;
                    }
                }
                boolean var263 = false;
                int var264 = Statics.field418;
                while (var264 > 0) {
                    boolean var265 = true;
                    var264--;
                    for (int var266 = 0; var266 < var264; var266++) {
                        if (var261[var266].field562.compareTo(var261[var266 + 1].field562) > 0) {
                            class20 var267 = var261[var266];
                            var261[var266] = var261[var266 + 1];
                            var261[var266 + 1] = var267;
                            var265 = false;
                        }
                    }
                    if (var265) {
                        break;
                    }
                }
                Statics.field1311 = var261;
                field319 = -1;
                return true;
            }
            if (field319 == 162) {
                for (int var268 = 0; var268 < class150.field2603.length; var268++) {
                    if (class150.field2603[var268] != class150.field2602[var268]) {
                        class150.field2603[var268] = class150.field2602[var268];
                        method1761(var268);
                        field451[++field443 - 1 & 0x1F] = var268;
                    }
                }
                field319 = -1;
                return true;
            }
            if (field319 == 24) {
                int var269 = field291.method2171();
                boolean var270 = field291.method2155() == 1;
                class148 var271 = class148.method1290(var269);
                if (var271.field2589 != var270) {
                    var271.field2589 = var270;
                    method141(var271);
                }
                field319 = -1;
                return true;
            }
            class132.method130("" + field319 + class2.field19 + field298 + class2.field19 + field299 + class2.field19 + field292, (Throwable) null);
            method473();
        } catch (IOException var281) {
            if (field259 > 0) {
                method473();
            } else {
                method138(40);
                Statics.field565 = Statics.field2909;
                Statics.field2909 = null;
            }
        } catch (Exception var282) {
            String var274 = "" + field319 + class2.field19 + field298 + class2.field19 + field299 + class2.field19 + field292 + class2.field19 + (Statics.field557 + Statics.field944.field732[0]) + class2.field19 + (Statics.field172 + Statics.field944.field745[0]) + class2.field19;
            for (int var275 = 0; var275 < field292 && var275 < 50; var275++) {
                var274 = var274 + field291.field1808[var275] + class2.field19;
            }
            class132.method130(var274, var282);
            method473();
        }
        return true;
    }

    @ObfuscatedName("cn.bw(B)V")
    public static final void method2075() {
        if (field319 == 145) {
            int var0 = field291.method2153();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1899;
            int var2 = (var0 & 0x7) + Statics.field103;
            int var3 = field291.method2261();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class171 var4 = field381[Statics.field1795][var1][var2];
                if (var4 != null) {
                    for (class23 var5 = (class23) var4.method3178(); var5 != null; var5 = (class23) var4.method3179()) {
                        if ((var3 & 0x7FFF) == var5.field597) {
                            var5.method3223();
                            break;
                        }
                    }
                    if (var4.method3178() == null) {
                        field381[Statics.field1795][var1][var2] = null;
                    }
                    method2861(var1, var2);
                }
            }
        } else if (field319 == 251) {
            int var6 = field291.method2190();
            int var7 = (var6 >> 4 & 0x7) + Statics.field1899;
            int var8 = (var6 & 0x7) + Statics.field103;
            int var9 = field291.method2132();
            int var10 = field291.method2190();
            int var11 = field291.method2132();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                int var12 = var7 * 128 + 64;
                int var13 = var8 * 128 + 64;
                class24 var14 = new class24(var9, Statics.field1795, var12, var13, method11(var12, var13, Statics.field1795) - var10, var11, field463);
                field384.method3180(var14);
            }
        } else {
            if (field319 == 214) {
                int var15 = field291.method2161();
                byte var16 = field291.method2277();
                int var17 = field291.method2197();
                int var18 = var17 >> 2;
                int var19 = var17 & 0x3;
                int var20 = field397[var18];
                int var21 = field291.method2261();
                byte var22 = field291.method2159();
                int var23 = field291.method2132();
                byte var24 = field291.method2156();
                int var25 = field291.method2161();
                int var26 = field291.method2197();
                int var27 = (var26 >> 4 & 0x7) + Statics.field1899;
                int var28 = (var26 & 0x7) + Statics.field103;
                byte var29 = field291.method2156();
                class3 var30;
                if (field372 == var25) {
                    var30 = Statics.field944;
                } else {
                    var30 = field366[var25];
                }
                if (var30 != null) {
                    class33 var31 = class33.method13(var15);
                    int var32;
                    int var33;
                    if (var19 == 1 || var19 == 3) {
                        var32 = var31.field816;
                        var33 = var31.field813;
                    } else {
                        var32 = var31.field813;
                        var33 = var31.field816;
                    }
                    int var34 = (var32 >> 1) + var27;
                    int var35 = (var32 + 1 >> 1) + var27;
                    int var36 = (var33 >> 1) + var28;
                    int var37 = (var33 + 1 >> 1) + var28;
                    int[][] var38 = class6.field97[Statics.field1795];
                    int var39 = var38[var34][var36] + var38[var35][var36] + var38[var34][var37] + var38[var35][var37] >> 2;
                    int var40 = (var27 << 7) + (var32 << 6);
                    int var41 = (var28 << 7) + (var33 << 6);
                    class95 var42 = var31.method618(var18, var19, var38, var40, var39, var41);
                    if (var42 != null) {
                        method37(Statics.field1795, var27, var28, var20, -1, 0, 0, var21 + 1, var23 + 1);
                        var30.field39 = field463 + var21;
                        var30.field45 = field463 + var23;
                        var30.field44 = var42;
                        var30.field41 = var27 * 128 + var32 * 64;
                        var30.field43 = var28 * 128 + var33 * 64;
                        var30.field42 = var39;
                        if (var29 > var24) {
                            byte var43 = var29;
                            var29 = var24;
                            var24 = var43;
                        }
                        if (var22 > var16) {
                            byte var44 = var22;
                            var22 = var16;
                            var16 = var44;
                        }
                        var30.field40 = var27 + var29;
                        var30.field47 = var24 + var27;
                        var30.field46 = var22 + var28;
                        var30.field48 = var16 + var28;
                    }
                }
            }
            if (field319 == 144) {
                int var45 = field291.method2190();
                int var46 = (var45 >> 4 & 0x7) + Statics.field1899;
                int var47 = (var45 & 0x7) + Statics.field103;
                int var48 = field291.method2153();
                int var49 = var48 >> 2;
                int var50 = var48 & 0x3;
                int var51 = field397[var49];
                if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                    method37(Statics.field1795, var46, var47, var51, -1, var49, var50, 0, -1);
                }
            } else if (field319 == 91) {
                int var52 = field291.method2161();
                int var53 = field291.method2155();
                int var54 = var53 >> 2;
                int var55 = var53 & 0x3;
                int var56 = field397[var54];
                int var57 = field291.method2155();
                int var58 = (var57 >> 4 & 0x7) + Statics.field1899;
                int var59 = (var57 & 0x7) + Statics.field103;
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                    method37(Statics.field1795, var58, var59, var56, var52, var54, var55, 0, -1);
                }
            } else if (field319 == 202) {
                int var60 = field291.method2161();
                int var61 = field291.method2197();
                int var62 = (var61 >> 4 & 0x7) + Statics.field1899;
                int var63 = (var61 & 0x7) + Statics.field103;
                int var64 = field291.method2197();
                int var65 = var64 >> 2;
                int var66 = var64 & 0x3;
                int var67 = field397[var65];
                if (var62 >= 0 && var63 >= 0 && var62 < 103 && var63 < 103) {
                    if (var67 == 0) {
                        class77 var68 = Statics.field878.method1609(Statics.field1795, var62, var63);
                        if (var68 != null) {
                            int var69 = var68.field1388 >> 14 & 0x7FFF;
                            if (var65 == 2) {
                                var68.field1382 = new class10(var69, 2, var66 + 4, Statics.field1795, var62, var63, var60, false, var68.field1382);
                                var68.field1387 = new class10(var69, 2, var66 + 1 & 0x3, Statics.field1795, var62, var63, var60, false, var68.field1387);
                            } else {
                                var68.field1382 = new class10(var69, var65, var66, Statics.field1795, var62, var63, var60, false, var68.field1382);
                            }
                        }
                    }
                    if (var67 == 1) {
                        class84 var70 = Statics.field878.method1610(Statics.field1795, var62, var63);
                        if (var70 != null) {
                            int var71 = var70.field1472 >> 14 & 0x7FFF;
                            if (var65 == 4 || var65 == 5) {
                                var70.field1467 = new class10(var71, 4, var66, Statics.field1795, var62, var63, var60, false, var70.field1467);
                            } else if (var65 == 6) {
                                var70.field1467 = new class10(var71, 4, var66 + 4, Statics.field1795, var62, var63, var60, false, var70.field1467);
                            } else if (var65 == 7) {
                                var70.field1467 = new class10(var71, 4, (var66 + 2 & 0x3) + 4, Statics.field1795, var62, var63, var60, false, var70.field1467);
                            } else if (var65 == 8) {
                                var70.field1467 = new class10(var71, 4, var66 + 4, Statics.field1795, var62, var63, var60, false, var70.field1467);
                                var70.field1471 = new class10(var71, 4, (var66 + 2 & 0x3) + 4, Statics.field1795, var62, var63, var60, false, var70.field1471);
                            }
                        }
                    }
                    if (var67 == 2) {
                        class88 var72 = Statics.field878.method1611(Statics.field1795, var62, var63);
                        if (var65 == 11) {
                            var65 = 10;
                        }
                        if (var72 != null) {
                            var72.field1521 = new class10(var72.field1536 >> 14 & 0x7FFF, var65, var66, Statics.field1795, var62, var63, var60, false, var72.field1521);
                        }
                    }
                    if (var67 == 3) {
                        class83 var73 = Statics.field878.method1612(Statics.field1795, var62, var63);
                        if (var73 != null) {
                            var73.field1453 = new class10(var73.field1461 >> 14 & 0x7FFF, 22, var66, Statics.field1795, var62, var63, var60, false, var73.field1453);
                        }
                    }
                }
            } else if (field319 == 54) {
                int var74 = field291.method2190();
                int var75 = (var74 >> 4 & 0x7) + Statics.field1899;
                int var76 = (var74 & 0x7) + Statics.field103;
                int var77 = field291.method2132();
                int var78 = field291.method2132();
                int var79 = field291.method2132();
                if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
                    class171 var80 = field381[Statics.field1795][var75][var76];
                    if (var80 != null) {
                        for (class23 var81 = (class23) var80.method3178(); var81 != null; var81 = (class23) var80.method3179()) {
                            if ((var77 & 0x7FFF) == var81.field597 && var81.field596 == var78) {
                                var81.field596 = var79;
                                break;
                            }
                        }
                        method2861(var75, var76);
                    }
                }
            } else {
                if (field319 == 192) {
                    int var82 = field291.method2190();
                    int var83 = (var82 >> 4 & 0x7) + Statics.field1899;
                    int var84 = (var82 & 0x7) + Statics.field103;
                    int var85 = field291.method2132();
                    int var86 = field291.method2190();
                    int var87 = var86 >> 4 & 0xF;
                    int var88 = var86 & 0x7;
                    int var89 = field291.method2190();
                    if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                        int var90 = var87 + 1;
                        if (Statics.field944.field732[0] >= var83 - var90 && Statics.field944.field732[0] <= var83 + var90 && Statics.field944.field745[0] >= var84 - var90 && Statics.field944.field745[0] <= var84 + var90 && field302 != 0 && var88 > 0 && field377 < 50) {
                            field489[field377] = var85;
                            field490[field377] = var88;
                            field317[field377] = var89;
                            field405[field377] = null;
                            field492[field377] = (var83 << 16) + (var84 << 8) + var87;
                            field377++;
                        }
                    }
                }
                if (field319 == 33) {
                    int var91 = field291.method2162();
                    int var92 = field291.method2132();
                    int var93 = field291.method2155();
                    int var94 = (var93 >> 4 & 0x7) + Statics.field1899;
                    int var95 = (var93 & 0x7) + Statics.field103;
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        class23 var96 = new class23();
                        var96.field597 = var91;
                        var96.field596 = var92;
                        if (field381[Statics.field1795][var94][var95] == null) {
                            field381[Statics.field1795][var94][var95] = new class171();
                        }
                        field381[Statics.field1795][var94][var95].method3180(var96);
                        method2861(var94, var95);
                    }
                } else if (field319 == 126) {
                    int var97 = field291.method2190();
                    int var98 = (var97 >> 4 & 0x7) + Statics.field1899;
                    int var99 = (var97 & 0x7) + Statics.field103;
                    int var100 = var98 + field291.method2159();
                    int var101 = var99 + field291.method2159();
                    int var102 = field291.method2154();
                    int var103 = field291.method2132();
                    int var104 = field291.method2190() * 4;
                    int var105 = field291.method2190() * 4;
                    int var106 = field291.method2132();
                    int var107 = field291.method2132();
                    int var108 = field291.method2190();
                    int var109 = field291.method2190();
                    if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                        int var110 = var98 * 128 + 64;
                        int var111 = var99 * 128 + 64;
                        int var112 = var100 * 128 + 64;
                        int var113 = var101 * 128 + 64;
                        class7 var114 = new class7(var103, Statics.field1795, var110, var111, method11(var110, var111, Statics.field1795) - var104, field463 + var106, field463 + var107, var108, var109, var102, var105);
                        var114.method90(var112, var113, method11(var112, var113, Statics.field1795) - var105, field463 + var106);
                        field383.method3180(var114);
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.ba(IIIIIIIIII)V")
    public static final void method37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class14 var9 = null;
        for (class14 var10 = (class14) field382.method3178(); var10 != null; var10 = (class14) field382.method3179()) {
            if (var10.field212 == arg0 && var10.field209 == arg1 && var10.field210 == arg2 && var10.field216 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class14();
            var9.field212 = arg0;
            var9.field216 = arg3;
            var9.field209 = arg1;
            var9.field210 = arg2;
            method2672(var9);
            field382.method3180(var9);
        }
        var9.field219 = arg4;
        var9.field218 = arg5;
        var9.field211 = arg6;
        var9.field217 = arg7;
        var9.field220 = arg8;
    }

    @ObfuscatedName("eb.bk(Lq;I)V")
    public static final void method2672(class14 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field216 == 0) {
            var1 = Statics.field878.method1655(arg0.field212, arg0.field209, arg0.field210);
        }
        if (arg0.field216 == 1) {
            var1 = Statics.field878.method1614(arg0.field212, arg0.field209, arg0.field210);
        }
        if (arg0.field216 == 2) {
            var1 = Statics.field878.method1744(arg0.field212, arg0.field209, arg0.field210);
        }
        if (arg0.field216 == 3) {
            var1 = Statics.field878.method1616(arg0.field212, arg0.field209, arg0.field210);
        }
        if (var1 != 0) {
            int var5 = Statics.field878.method1755(arg0.field212, arg0.field209, arg0.field210, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field213 = var2;
        arg0.field215 = var3;
        arg0.field214 = var4;
    }

    @ObfuscatedName("ca.bv(IIIIIIII)V")
    public static final void method1969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field458 && Statics.field1795 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field878.method1655(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field878.method1614(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field878.method1744(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field878.method1616(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field878.method1755(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field878.method1641(arg0, arg2, arg3);
                class33 var15 = class33.method13(var12);
                if (var15.field803 != 0) {
                    field307[arg0].method3403(arg2, arg3, var13, var14, var15.field852);
                }
            }
            if (arg1 == 1) {
                Statics.field878.method1605(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field878.method1606(arg0, arg2, arg3);
                class33 var16 = class33.method13(var12);
                if (var16.field813 + arg2 > 103 || var16.field813 + arg3 > 103 || var16.field816 + arg2 > 103 || var16.field816 + arg3 > 103) {
                    return;
                }
                if (var16.field803 != 0) {
                    field307[arg0].method3408(arg2, arg3, var16.field813, var16.field816, var14, var16.field852);
                }
            }
            if (arg1 == 3) {
                Statics.field878.method1607(arg0, arg2, arg3);
                class33 var17 = class33.method13(var12);
                if (var17.field803 == 1) {
                    field307[arg0].method3406(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field93[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method154(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field878, field307[arg0]);
    }

    @ObfuscatedName("ed.bm(IIB)V")
    public static final void method2861(int arg0, int arg1) {
        class171 var2 = field381[Statics.field1795][arg0][arg1];
        if (var2 == null) {
            Statics.field878.method1625(Statics.field1795, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class23 var5 = null;
        for (class23 var6 = (class23) var2.method3178(); var6 != null; var6 = (class23) var2.method3179()) {
            class42 var7 = class42.method124(var6.field597);
            long var8 = (long) var7.field999;
            if (var7.field997 == 1) {
                var8 = (long) (var6.field596 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field878.method1625(Statics.field1795, arg0, arg1);
            return;
        }
        var2.method3176(var5);
        class23 var10 = null;
        class23 var11 = null;
        for (class23 var12 = (class23) var2.method3178(); var12 != null; var12 = (class23) var2.method3179()) {
            if (var5.field597 != var12.field597) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field597 != var12.field597 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field878.method1594(Statics.field1795, arg0, arg1, method11(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1795), var5, var13, var10, var11);
    }

    @ObfuscatedName("p.bi(I)V")
    public static final void method149() {
        field374 = 0;
        field407 = 0;
        field291.method2379();
        int var0 = field291.method2376(1);
        if (var0 != 0) {
            int var1 = field291.method2376(2);
            if (var1 == 0) {
                field454[++field407 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field291.method2376(3);
                Statics.field944.method568(var2, false);
                int var3 = field291.method2376(1);
                if (var3 == 1) {
                    field454[++field407 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field291.method2376(3);
                Statics.field944.method568(var4, true);
                int var5 = field291.method2376(3);
                Statics.field944.method568(var5, true);
                int var6 = field291.method2376(1);
                if (var6 == 1) {
                    field454[++field407 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field291.method2376(1);
                if (var7 == 1) {
                    field454[++field407 - 1] = 2047;
                }
                int var8 = field291.method2376(7);
                Statics.field1795 = field291.method2376(2);
                int var9 = field291.method2376(1);
                int var10 = field291.method2376(7);
                Statics.field944.method561(var8, var10, var9 == 1);
            }
        }
        int var11 = field291.method2376(8);
        if (var11 < field367) {
            for (int var12 = var11; var12 < field367; var12++) {
                field375[++field374 - 1] = field368[var12];
            }
        }
        if (var11 > field367) {
            throw new RuntimeException("");
        }
        field367 = 0;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = field368[var13];
            class3 var15 = field366[var14];
            int var16 = field291.method2376(1);
            if (var16 == 0) {
                field368[++field367 - 1] = var14;
                var15.field738 = field463;
            } else {
                int var17 = field291.method2376(2);
                if (var17 == 0) {
                    field368[++field367 - 1] = var14;
                    var15.field738 = field463;
                    field454[++field407 - 1] = var14;
                } else if (var17 == 1) {
                    field368[++field367 - 1] = var14;
                    var15.field738 = field463;
                    int var18 = field291.method2376(3);
                    var15.method568(var18, false);
                    int var19 = field291.method2376(1);
                    if (var19 == 1) {
                        field454[++field407 - 1] = var14;
                    }
                } else if (var17 == 2) {
                    field368[++field367 - 1] = var14;
                    var15.field738 = field463;
                    int var20 = field291.method2376(3);
                    var15.method568(var20, true);
                    int var21 = field291.method2376(3);
                    var15.method568(var21, true);
                    int var22 = field291.method2376(1);
                    if (var22 == 1) {
                        field454[++field407 - 1] = var14;
                    }
                } else if (var17 == 3) {
                    field375[++field374 - 1] = var14;
                }
            }
        }
        while (field291.method2378(field292) >= 11) {
            int var23 = field291.method2376(11);
            if (var23 == 2047) {
                break;
            }
            boolean var47 = false;
            if (field366[var23] == null) {
                field366[var23] = new class3();
                if (field280[var23] != null) {
                    field366[var23].method17(field280[var23]);
                }
                var47 = true;
            }
            field368[++field367 - 1] = var23;
            class3 var48 = field366[var23];
            var48.field738 = field463;
            int var49 = field291.method2376(5);
            if (var49 > 15) {
                var49 -= 32;
            }
            int var50 = field291.method2376(1);
            int var51 = field291.method2376(1);
            if (var51 == 1) {
                field454[++field407 - 1] = var23;
            }
            int var52 = field379[field291.method2376(3)];
            if (var47) {
                var48.field743 = var48.field694 = var52;
            }
            int var53 = field291.method2376(5);
            if (var53 > 15) {
                var53 -= 32;
            }
            var48.method561(Statics.field944.field732[0] + var53, Statics.field944.field745[0] + var49, var50 == 1);
        }
        field291.method2377();
        for (int var24 = 0; var24 < field407; var24++) {
            int var25 = field454[var24];
            class3 var26 = field366[var25];
            int var27 = field291.method2190();
            if ((var27 & 0x8) != 0) {
                var27 += field291.method2190() << 8;
            }
            if ((var27 & 0x400) != 0) {
                int var28 = field291.method2153();
                int var29 = field291.method2197();
                var26.method569(var28, var29, field463);
                var26.field712 = field463 + 300;
                var26.field713 = field291.method2197();
                var26.field714 = field291.method2197();
            }
            if ((var27 & 0x100) != 0) {
                var26.field703 = field291.method2155();
                var26.field733 = field291.method2197();
                var26.field723 = field291.method2197();
                var26.field734 = field291.method2190();
                var26.field744 = field291.method2132() + field463;
                var26.field736 = field291.method2162() + field463;
                var26.field748 = field291.method2153();
                var26.field710 = 1;
                var26.field725 = 0;
            }
            if ((var27 & 0x80) != 0) {
                var26.field724 = field291.method2138();
                if (var26.field724.charAt(0) == '~') {
                    var26.field724 = var26.field724.substring(1);
                    method2508(2, var26.field38, var26.field724);
                } else if (Statics.field944 == var26) {
                    method2508(2, var26.field38, var26.field724);
                }
                var26.field707 = 0;
                var26.field708 = 0;
                var26.field706 = 150;
            }
            if ((var27 & 0x2) != 0) {
                int var30 = field291.method2261();
                if (var30 == 65535) {
                    var30 = -1;
                }
                int var31 = field291.method2197();
                method1051(var26, var30, var31);
            }
            if ((var27 & 0x20) != 0) {
                var26.field741 = field291.method2132();
                var26.field717 = field291.method2162();
            }
            if ((var27 & 0x10) != 0) {
                int var32 = field291.method2162();
                int var33 = field291.method2197();
                int var34 = field291.method2153();
                int var35 = field291.field1806;
                if (var26.field38 != null && var26.field50 != null) {
                    boolean var36 = false;
                    if (var33 <= 1 && method150(var26.field38)) {
                        var36 = true;
                    }
                    if (!var36 && field255 == 0) {
                        field275.field1806 = 0;
                        field291.method2145(field275.field1808, 0, var34);
                        field275.field1806 = 0;
                        String var37 = class182.method3268(class189.method481(class181.method796(field275)));
                        var26.field724 = var37.trim();
                        var26.field707 = var32 >> 8;
                        var26.field708 = var32 & 0xFF;
                        var26.field706 = 150;
                        if (var33 == 2 || var33 == 3) {
                            method2508(1, class2.method572(1) + var26.field38, var37);
                        } else if (var33 == 1) {
                            method2508(1, class2.method572(0) + var26.field38, var37);
                        } else {
                            method2508(2, var26.field38, var37);
                        }
                    }
                }
                field291.field1806 = var34 + var35;
            }
            if ((var27 & 0x200) != 0) {
                var26.field697 = field291.method2261();
                int var38 = field291.method2172();
                var26.field730 = var38 >> 16;
                var26.field729 = (var38 & 0xFFFF) + field463;
                var26.field722 = 0;
                var26.field695 = 0;
                if (var26.field729 > field463) {
                    var26.field722 = -1;
                }
                if (var26.field697 == 65535) {
                    var26.field697 = -1;
                }
            }
            if ((var27 & 0x40) != 0) {
                int var39 = field291.method2197();
                int var40 = field291.method2197();
                var26.method569(var39, var40, field463);
                var26.field712 = field463 + 300;
                var26.field713 = field291.method2197();
                var26.field714 = field291.method2197();
            }
            if ((var27 & 0x4) != 0) {
                int var41 = field291.method2153();
                byte[] var42 = new byte[var41];
                class104 var43 = new class104(var42);
                field291.method2291(var42, 0, var41);
                field280[var25] = var43;
                var26.method17(var43);
            }
            if ((var27 & 0x1) != 0) {
                var26.field715 = field291.method2261();
                if (var26.field715 == 65535) {
                    var26.field715 = -1;
                }
            }
        }
        for (int var44 = 0; var44 < field374; var44++) {
            int var45 = field375[var44];
            if (field463 != field366[var45].field738) {
                field366[var45] = null;
            }
        }
        if (field292 != field291.field1806) {
            throw new RuntimeException(field291.field1806 + class2.field19 + field292);
        }
        for (int var46 = 0; var46 < field367; var46++) {
            if (field366[field368[var46]] == null) {
                throw new RuntimeException(var46 + class2.field19 + field367);
            }
        }
    }

    @ObfuscatedName("p.bd(I)V")
    public static final void method153() {
        field374 = 0;
        field407 = 0;
        field291.method2379();
        int var0 = field291.method2376(8);
        if (var0 < field287) {
            for (int var1 = var0; var1 < field287; var1++) {
                field375[++field374 - 1] = field288[var1];
            }
        }
        if (var0 > field287) {
            throw new RuntimeException("");
        }
        field287 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field288[var2];
            class28 var4 = field410[var3];
            int var5 = field291.method2376(1);
            if (var5 == 0) {
                field288[++field287 - 1] = var3;
                var4.field738 = field463;
            } else {
                int var6 = field291.method2376(2);
                if (var6 == 0) {
                    field288[++field287 - 1] = var3;
                    var4.field738 = field463;
                    field454[++field407 - 1] = var3;
                } else if (var6 == 1) {
                    field288[++field287 - 1] = var3;
                    var4.field738 = field463;
                    int var7 = field291.method2376(3);
                    var4.method568(var7, false);
                    int var8 = field291.method2376(1);
                    if (var8 == 1) {
                        field454[++field407 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field288[++field287 - 1] = var3;
                    var4.field738 = field463;
                    int var9 = field291.method2376(3);
                    var4.method568(var9, true);
                    int var10 = field291.method2376(3);
                    var4.method568(var10, true);
                    int var11 = field291.method2376(1);
                    if (var11 == 1) {
                        field454[++field407 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field375[++field374 - 1] = var3;
                }
            }
        }
        while (field291.method2378(field292) >= 27) {
            int var12 = field291.method2376(15);
            if (var12 == 32767) {
                break;
            }
            boolean var16 = false;
            if (field410[var12] == null) {
                field410[var12] = new class28();
                var16 = true;
            }
            class28 var17 = field410[var12];
            field288[++field287 - 1] = var12;
            var17.field738 = field463;
            var17.field674 = class32.method504(field291.method2376(14));
            int var18 = field291.method2376(5);
            if (var18 > 15) {
                var18 -= 32;
            }
            int var19 = field291.method2376(1);
            if (var19 == 1) {
                field454[++field407 - 1] = var12;
            }
            int var20 = field379[field291.method2376(3)];
            if (var16) {
                var17.field743 = var17.field694 = var20;
            }
            int var21 = field291.method2376(1);
            int var22 = field291.method2376(5);
            if (var22 > 15) {
                var22 -= 32;
            }
            var17.field696 = var17.field674.field789;
            var17.field742 = var17.field674.field761;
            if (var17.field742 == 0) {
                var17.field694 = 0;
            }
            var17.field726 = var17.field674.field762;
            var17.field701 = var17.field674.field767;
            var17.field702 = var17.field674.field768;
            var17.field705 = var17.field674.field771;
            var17.field731 = var17.field674.field769;
            var17.field698 = var17.field674.field764;
            var17.field728 = var17.field674.field765;
            var17.method561(Statics.field944.field732[0] + var18, Statics.field944.field745[0] + var22, var21 == 1);
        }
        field291.method2377();
        method814();
        for (int var13 = 0; var13 < field374; var13++) {
            int var14 = field375[var13];
            if (field463 != field410[var14].field738) {
                field410[var14].field674 = null;
                field410[var14] = null;
            }
        }
        if (field292 != field291.field1806) {
            throw new RuntimeException(field291.field1806 + class2.field19 + field292);
        }
        for (int var15 = 0; var15 < field287; var15++) {
            if (field410[field288[var15]] == null) {
                throw new RuntimeException(var15 + class2.field19 + field287);
            }
        }
    }

    @ObfuscatedName("ag.bt(B)V")
    public static final void method814() {
        for (int var0 = 0; var0 < field407; var0++) {
            int var1 = field454[var0];
            class28 var2 = field410[var1];
            int var3 = field291.method2190();
            if ((var3 & 0x80) != 0) {
                var2.field715 = field291.method2161();
                if (var2.field715 == 65535) {
                    var2.field715 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field741 = field291.method2261();
                var2.field717 = field291.method2132();
            }
            if ((var3 & 0x40) != 0) {
                var2.field697 = field291.method2161();
                int var4 = field291.method2170();
                var2.field730 = var4 >> 16;
                var2.field729 = (var4 & 0xFFFF) + field463;
                var2.field722 = 0;
                var2.field695 = 0;
                if (var2.field729 > field463) {
                    var2.field722 = -1;
                }
                if (var2.field697 == 65535) {
                    var2.field697 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                int var5 = field291.method2153();
                int var6 = field291.method2190();
                var2.method569(var5, var6, field463);
                var2.field712 = field463 + 300;
                var2.field713 = field291.method2197();
                var2.field714 = field291.method2190();
            }
            if ((var3 & 0x20) != 0) {
                int var7 = field291.method2161();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field291.method2155();
                if (var2.field721 == var7 && var7 != -1) {
                    int var9 = class35.method162(var7).field874;
                    if (var9 == 1) {
                        var2.field716 = 0;
                        var2.field700 = 0;
                        var2.field749 = var8;
                        var2.field740 = 0;
                    }
                    if (var9 == 2) {
                        var2.field740 = 0;
                    }
                } else if (var7 == -1 || var2.field721 == -1 || class35.method162(var7).field877 >= class35.method162(var2.field721).field877) {
                    var2.field721 = var7;
                    var2.field716 = 0;
                    var2.field700 = 0;
                    var2.field749 = var8;
                    var2.field740 = 0;
                    var2.field725 = var2.field710;
                }
            }
            if ((var3 & 0x8) != 0) {
                int var10 = field291.method2155();
                int var11 = field291.method2155();
                var2.method569(var10, var11, field463);
                var2.field712 = field463 + 300;
                var2.field713 = field291.method2153();
                var2.field714 = field291.method2197();
            }
            if ((var3 & 0x4) != 0) {
                var2.field674 = class32.method504(field291.method2132());
                var2.field696 = var2.field674.field789;
                var2.field742 = var2.field674.field761;
                var2.field726 = var2.field674.field762;
                var2.field701 = var2.field674.field767;
                var2.field702 = var2.field674.field768;
                var2.field705 = var2.field674.field771;
                var2.field731 = var2.field674.field769;
                var2.field698 = var2.field674.field764;
                var2.field728 = var2.field674.field765;
            }
            if ((var3 & 0x1) != 0) {
                var2.field724 = field291.method2138();
                var2.field706 = 100;
            }
        }
    }

    @ObfuscatedName("f.br(B)V")
    public static final void method99() {
        int var0 = Statics.field848;
        int var1 = Statics.field2069;
        int var2 = Statics.field192;
        int var3 = Statics.field196;
        int var4 = 6116423;
        class70.method1495(var0, var1, var2, var3, var4);
        class70.method1495(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class70.method1549(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field2871.method3277(class139.field2263, var0 + 3, var1 + 14, var4, -1);
        int var5 = class124.field1969;
        int var6 = class124.field1970;
        for (int var7 = 0; var7 < field390; var7++) {
            int var8 = (field390 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field2871.method3277(method109(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field848;
        int var11 = Statics.field2069;
        int var12 = Statics.field192;
        int var13 = Statics.field196;
        for (int var14 = 0; var14 < field449; var14++) {
            if (field500[var14] + field417[var14] > var10 && field500[var14] < var10 + var12 && field457[var14] + field455[var14] > var11 && field455[var14] < var11 + var13) {
                field473[var14] = true;
            }
        }
    }

    @ObfuscatedName("gw.bq(IIIII)V")
    public static final void method3435(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field449; var4++) {
            if (field500[var4] + field417[var4] > arg0 && field500[var4] < arg0 + arg2 && field457[var4] + field455[var4] > arg1 && field455[var4] < arg1 + arg3) {
                field499[var4] = true;
            }
        }
    }

    @ObfuscatedName("y.bo(III)V")
    public static final void method26(int arg0, int arg1) {
        int var2 = Statics.field2871.method3327(class139.field2263);
        for (int var3 = 0; var3 < field390; var3++) {
            int var4 = Statics.field2871.method3327(method109(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field390 * 15 + 21;
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
        field389 = true;
        Statics.field848 = var6;
        Statics.field2069 = var7;
        Statics.field192 = var2;
        Statics.field196 = field390 * 15 + 22;
    }

    @ObfuscatedName("eb.be(IS)Z")
    public static final boolean method2673(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field246[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("fd.bx(Le;III)V")
    public static final void method3115(class25 arg0, int arg1, int arg2) {
        method576(arg0.field625, arg0.field621, arg0.field616, arg0.field618, arg0.field617, arg0.field617, arg1, arg2);
    }

    @ObfuscatedName("ah.bz(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method576(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 10) {
            class28 var8 = field410[arg3];
            if (var8 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(58);
                field289.method2133(class121.field1929[82] ? 1 : 0);
                field289.method2117(arg3);
            }
        }
        if (arg2 == 41) {
            field289.method2372(246);
            field289.method2117(arg0);
            field289.method2117(arg3);
            field289.method2292(arg1);
            field357 = 0;
            Statics.field1989 = class148.method1290(arg1);
            field358 = arg0;
        }
        if (arg2 == 37) {
            field289.method2372(125);
            field289.method2131(arg1);
            field289.method2231(arg0);
            field289.method2151(arg3);
            field357 = 0;
            Statics.field1989 = class148.method1290(arg1);
            field358 = arg0;
        }
        if (arg2 == 11) {
            class28 var9 = field410[arg3];
            if (var9 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(53);
                field289.method2117(arg3);
                field289.method2246(class121.field1929[82] ? 1 : 0);
            }
        }
        if (arg2 == 50) {
            class3 var10 = field366[arg3];
            if (var10 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(48);
                field289.method2231(arg3);
                field289.method2133(class121.field1929[82] ? 1 : 0);
            }
        }
        if (arg2 == 1) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field480 = arg0;
            field481 = arg1;
            field289.method2372(21);
            field289.method2131(Statics.field108);
            field289.method2117(Statics.field172 + arg1);
            field289.method2237(class121.field1929[82] ? 1 : 0);
            field289.method2151(Statics.field557 + arg0);
            field289.method2151(arg3 >> 14 & 0x7FFF);
            field289.method2160(Statics.field952);
            field289.method2151(Statics.field673);
        }
        if (arg2 == 6) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field480 = arg0;
            field481 = arg1;
            field289.method2372(8);
            field289.method2246(class121.field1929[82] ? 1 : 0);
            field289.method2117(Statics.field172 + arg1);
            field289.method2151(arg3 >> 14 & 0x7FFF);
            field289.method2151(Statics.field557 + arg0);
        }
        if (arg2 == 23) {
            Statics.field878.method1624(Statics.field1795, arg0, arg1);
        }
        if (arg2 == 35) {
            field289.method2372(221);
            field289.method2231(arg0);
            field289.method2167(arg1);
            field289.method2231(arg3);
            field357 = 0;
            Statics.field1989 = class148.method1290(arg1);
            field358 = arg0;
        }
        if (arg2 == 12) {
            class28 var11 = field410[arg3];
            if (var11 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(122);
                field289.method2130(class121.field1929[82] ? 1 : 0);
                field289.method2117(arg3);
            }
        }
        if (arg2 == 38) {
            method375();
            class148 var12 = class148.method1290(arg1);
            field401 = 1;
            Statics.field952 = arg0;
            Statics.field108 = arg1;
            Statics.field673 = arg3;
            method141(var12);
            field402 = class2.method1581(16748608) + class42.method124(arg3).field985 + class2.method1581(16777215);
            if (field402 == null) {
                field402 = "null";
            }
            return;
        }
        if (arg2 == 14) {
            class3 var13 = field366[arg3];
            if (var13 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(31);
                field289.method2133(class121.field1929[82] ? 1 : 0);
                field289.method2117(Statics.field952);
                field289.method2117(arg3);
                field289.method2167(Statics.field108);
                field289.method2160(Statics.field673);
            }
        }
        if (arg2 == 34) {
            field289.method2372(147);
            field289.method2231(arg3);
            field289.method2313(arg1);
            field289.method2231(arg0);
            field357 = 0;
            Statics.field1989 = class148.method1290(arg1);
            field358 = arg0;
        }
        if (arg2 == 39) {
            field289.method2372(251);
            field289.method2117(arg3);
            field289.method2231(arg0);
            field289.method2167(arg1);
            field357 = 0;
            Statics.field1989 = class148.method1290(arg1);
            field358 = arg0;
        }
        if (arg2 == 58) {
            field289.method2372(43);
            field289.method2131(arg1);
            field289.method2151(field370);
            field289.method2313(Statics.field1775);
            field289.method2151(arg0);
        }
        if (arg2 == 2) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field480 = arg0;
            field481 = arg1;
            field289.method2372(249);
            field289.method2237(class121.field1929[82] ? 1 : 0);
            field289.method2231(field370);
            field289.method2151(arg3 >> 14 & 0x7FFF);
            field289.method2151(Statics.field172 + arg1);
            field289.method2151(Statics.field557 + arg0);
            field289.method2167(Statics.field1775);
        }
        if (arg2 == 48) {
            class3 var14 = field366[arg3];
            if (var14 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(214);
                field289.method2130(class121.field1929[82] ? 1 : 0);
                field289.method2151(arg3);
            }
        }
        if (arg2 == 40) {
            field289.method2372(181);
            field289.method2151(arg3);
            field289.method2231(arg0);
            field289.method2313(arg1);
            field357 = 0;
            Statics.field1989 = class148.method1290(arg1);
            field358 = arg0;
        }
        if (arg2 == 1002) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field289.method2372(187);
            field289.method2231(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 25) {
            class148 var15 = class148.method2650(arg1, arg0);
            if (var15 != null) {
                method375();
                method103(arg1, arg0, class152.method2677(method2642(var15)));
                field401 = 0;
                String var16;
                if (class152.method2677(method2642(var15)) == 0) {
                    var16 = null;
                } else if (var15.field2543 == null || var15.field2543.trim().length() == 0) {
                    var16 = null;
                } else {
                    var16 = var15.field2543;
                }
                field296 = var16;
                if (field296 == null) {
                    field296 = "Null";
                }
                if (var15.field2476) {
                    field488 = var15.field2477 + class2.method1581(16777215);
                } else {
                    field488 = class2.method1581(65280) + var15.field2577 + class2.method1581(16777215);
                }
            }
            return;
        }
        if (arg2 == 31) {
            field289.method2372(23);
            field289.method2160(Statics.field673);
            field289.method2167(Statics.field108);
            field289.method2117(arg0);
            field289.method2131(arg1);
            field289.method2151(Statics.field952);
            field289.method2151(arg3);
            field357 = 0;
            Statics.field1989 = class148.method1290(arg1);
            field358 = arg0;
        }
        if (arg2 == 22) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field480 = arg0;
            field481 = arg1;
            field289.method2372(196);
            field289.method2133(class121.field1929[82] ? 1 : 0);
            field289.method2160(Statics.field557 + arg0);
            field289.method2151(Statics.field172 + arg1);
            field289.method2160(arg3);
        }
        if (arg2 == 21) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field480 = arg0;
            field481 = arg1;
            field289.method2372(237);
            field289.method2160(Statics.field557 + arg0);
            field289.method2160(arg3);
            field289.method2231(Statics.field172 + arg1);
            field289.method2246(class121.field1929[82] ? 1 : 0);
        }
        if (arg2 == 30 && field446 == null) {
            method2056(arg1, arg0);
            field446 = class148.method2650(arg1, arg0);
            method141(field446);
        }
        if (arg2 == 8) {
            class28 var17 = field410[arg3];
            if (var17 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(179);
                field289.method2167(Statics.field1775);
                field289.method2117(arg3);
                field289.method2117(field370);
                field289.method2237(class121.field1929[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class28 var18 = field410[arg3];
            if (var18 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(150);
                field289.method2160(arg3);
                field289.method2246(class121.field1929[82] ? 1 : 0);
            }
        }
        if (arg2 == 3) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field480 = arg0;
            field481 = arg1;
            field289.method2372(188);
            field289.method2117(Statics.field172 + arg1);
            field289.method2231(Statics.field557 + arg0);
            field289.method2231(arg3 >> 14 & 0x7FFF);
            field289.method2237(class121.field1929[82] ? 1 : 0);
        }
        if (arg2 == 42) {
            field289.method2372(178);
            field289.method2160(arg3);
            field289.method2117(arg0);
            field289.method2292(arg1);
            field357 = 0;
            Statics.field1989 = class148.method1290(arg1);
            field358 = arg0;
        }
        if (arg2 == 9) {
            class28 var19 = field410[arg3];
            if (var19 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(189);
                field289.method2151(arg3);
                field289.method2133(class121.field1929[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field289.method2372(171);
            field289.method2131(arg1);
            class148 var20 = class148.method1290(arg1);
            if (var20.field2573 != null && var20.field2573[0][0] == 5) {
                int var21 = var20.field2573[0][1];
                if (class150.field2603[var21] != var20.field2503[0]) {
                    class150.field2603[var21] = var20.field2503[0];
                    method1761(var21);
                }
            }
        }
        if (arg2 == 19) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field480 = arg0;
            field481 = arg1;
            field289.method2372(40);
            field289.method2117(Statics.field172 + arg1);
            field289.method2160(arg3);
            field289.method2237(class121.field1929[82] ? 1 : 0);
            field289.method2160(Statics.field557 + arg0);
        }
        if (arg2 == 26) {
            method27();
        }
        if (arg2 == 7) {
            class28 var22 = field410[arg3];
            if (var22 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(114);
                field289.method2131(Statics.field108);
                field289.method2160(Statics.field673);
                field289.method2130(class121.field1929[82] ? 1 : 0);
                field289.method2117(Statics.field952);
                field289.method2117(arg3);
            }
        }
        if (arg2 == 43) {
            field289.method2372(11);
            field289.method2160(arg3);
            field289.method2151(arg0);
            field289.method2313(arg1);
            field357 = 0;
            Statics.field1989 = class148.method1290(arg1);
            field358 = arg0;
        }
        if (arg2 == 4) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field480 = arg0;
            field481 = arg1;
            field289.method2372(134);
            field289.method2231(Statics.field172 + arg1);
            field289.method2246(class121.field1929[82] ? 1 : 0);
            field289.method2117(Statics.field557 + arg0);
            field289.method2151(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 20) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field480 = arg0;
            field481 = arg1;
            field289.method2372(56);
            field289.method2151(Statics.field172 + arg1);
            field289.method2231(Statics.field557 + arg0);
            field289.method2117(arg3);
            field289.method2237(class121.field1929[82] ? 1 : 0);
        }
        if (arg2 == 51) {
            class3 var23 = field366[arg3];
            if (var23 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(47);
                field289.method2237(class121.field1929[82] ? 1 : 0);
                field289.method2117(arg3);
            }
        }
        if (arg2 == 49) {
            class3 var24 = field366[arg3];
            if (var24 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(76);
                field289.method2231(arg3);
                field289.method2246(class121.field1929[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field480 = arg0;
            field481 = arg1;
            field289.method2372(170);
            field289.method2151(arg3 >> 14 & 0x7FFF);
            field289.method2246(class121.field1929[82] ? 1 : 0);
            field289.method2231(Statics.field172 + arg1);
            field289.method2117(Statics.field557 + arg0);
        }
        if (arg2 == 47) {
            class3 var25 = field366[arg3];
            if (var25 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(219);
                field289.method2237(class121.field1929[82] ? 1 : 0);
                field289.method2160(arg3);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            method144(arg3, arg1, arg0, arg5);
        }
        if (arg2 == 36) {
            field289.method2372(172);
            field289.method2160(arg0);
            field289.method2313(arg1);
            field289.method2117(arg3);
            field357 = 0;
            Statics.field1989 = class148.method1290(arg1);
            field358 = arg0;
        }
        if (arg2 == 24) {
            class148 var26 = class148.method1290(arg1);
            boolean var27 = true;
            if (var26.field2481 > 0) {
                var27 = method1852(var26);
            }
            if (var27) {
                field289.method2372(171);
                field289.method2131(arg1);
            }
        }
        if (arg2 == 16) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field480 = arg0;
            field481 = arg1;
            field289.method2372(236);
            field289.method2231(arg3);
            field289.method2151(Statics.field557 + arg0);
            field289.method2151(Statics.field673);
            field289.method2246(class121.field1929[82] ? 1 : 0);
            field289.method2160(Statics.field172 + arg1);
            field289.method2292(Statics.field108);
            field289.method2231(Statics.field952);
        }
        if (arg2 == 15) {
            class3 var28 = field366[arg3];
            if (var28 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(218);
                field289.method2246(class121.field1929[82] ? 1 : 0);
                field289.method2151(field370);
                field289.method2151(arg3);
                field289.method2292(Statics.field1775);
            }
        }
        if (arg2 == 33) {
            field289.method2372(75);
            field289.method2117(arg3);
            field289.method2313(arg1);
            field289.method2117(arg0);
            field357 = 0;
            Statics.field1989 = class148.method1290(arg1);
            field358 = arg0;
        }
        if (arg2 == 44) {
            class3 var29 = field366[arg3];
            if (var29 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(110);
                field289.method2160(arg3);
                field289.method2133(class121.field1929[82] ? 1 : 0);
            }
        }
        if (arg2 == 17) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field480 = arg0;
            field481 = arg1;
            field289.method2372(217);
            field289.method2231(Statics.field172 + arg1);
            field289.method2292(Statics.field1775);
            field289.method2160(field370);
            field289.method2117(Statics.field557 + arg0);
            field289.method2151(arg3);
            field289.method2237(class121.field1929[82] ? 1 : 0);
        }
        if (arg2 == 1003) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            class28 var30 = field410[arg3];
            if (var30 != null) {
                class32 var31 = var30.field674;
                if (var31.field774 != null) {
                    var31 = var31.method579();
                }
                if (var31 != null) {
                    field289.method2372(142);
                    field289.method2117(var31.field792);
                }
            }
        }
        if (arg2 == 45) {
            class3 var32 = field366[arg3];
            if (var32 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(144);
                field289.method2231(arg3);
                field289.method2246(class121.field1929[82] ? 1 : 0);
            }
        }
        if (arg2 == 1005) {
            class148 var33 = class148.method1290(arg1);
            if (var33 == null || var33.field2580[arg0] < 100000) {
                field289.method2372(174);
                field289.method2160(arg3);
            } else {
                method2508(27, "", var33.field2580[arg0] + " x " + class42.method124(arg3).field985);
            }
            field357 = 0;
            Statics.field1989 = class148.method1290(arg1);
            field358 = arg0;
        }
        if (arg2 == 28) {
            field289.method2372(171);
            field289.method2131(arg1);
            class148 var34 = class148.method1290(arg1);
            if (var34.field2573 != null && var34.field2573[0][0] == 5) {
                int var35 = var34.field2573[0][1];
                class150.field2603[var35] = 1 - class150.field2603[var35];
                method1761(var35);
            }
        }
        if (arg2 == 46) {
            class3 var36 = field366[arg3];
            if (var36 != null) {
                field434 = arg6;
                field278 = arg7;
                field356 = 2;
                field303 = 0;
                field480 = arg0;
                field481 = arg1;
                field289.method2372(33);
                field289.method2246(class121.field1929[82] ? 1 : 0);
                field289.method2151(arg3);
            }
        }
        if (arg2 == 32) {
            field289.method2372(111);
            field289.method2292(Statics.field1775);
            field289.method2160(arg3);
            field289.method2160(arg0);
            field289.method2313(arg1);
            field289.method2231(field370);
            field357 = 0;
            Statics.field1989 = class148.method1290(arg1);
            field358 = arg0;
        }
        if (arg2 == 18) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field480 = arg0;
            field481 = arg1;
            field289.method2372(49);
            field289.method2231(Statics.field557 + arg0);
            field289.method2133(class121.field1929[82] ? 1 : 0);
            field289.method2117(Statics.field172 + arg1);
            field289.method2231(arg3);
        }
        if (arg2 == 1004) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field289.method2372(174);
            field289.method2160(arg3);
        }
        if (arg2 == 5) {
            field434 = arg6;
            field278 = arg7;
            field356 = 2;
            field303 = 0;
            field480 = arg0;
            field481 = arg1;
            field289.method2372(166);
            field289.method2160(Statics.field557 + arg0);
            field289.method2151(Statics.field172 + arg1);
            field289.method2130(class121.field1929[82] ? 1 : 0);
            field289.method2151(arg3 >> 14 & 0x7FFF);
        }
        if (field401 != 0) {
            field401 = 0;
            method141(class148.method1290(Statics.field108));
        }
        if (field403) {
            method375();
        }
        if (Statics.field1989 != null && field357 == 0) {
            method141(Statics.field1989);
        }
    }

    @ObfuscatedName("a.bb(IIII)V")
    public static void method103(int arg0, int arg1, int arg2) {
        class148 var3 = class148.method2650(arg0, arg1);
        if (var3 != null && var3.field2498 != null) {
            class1 var4 = new class1();
            var4.field11 = var3;
            var4.field9 = var3.field2498;
            class29.method2814(var4);
        }
        field403 = true;
        Statics.field1775 = arg0;
        field370 = arg1;
        Statics.field735 = arg2;
        method141(var3);
    }

    @ObfuscatedName("client.bc(B)V")
    public static void method375() {
        if (!field403) {
            return;
        }
        class148 var0 = class148.method2650(Statics.field1775, field370);
        if (var0 != null && var0.field2556 != null) {
            class1 var1 = new class1();
            var1.field11 = var0;
            var1.field9 = var0.field2556;
            class29.method2814(var1);
        }
        field403 = false;
        method141(var0);
    }

    @ObfuscatedName("cx.bu(IIB)V")
    public static void method2056(int arg0, int arg1) {
        field289.method2372(157);
        field289.method2151(arg1);
        field289.method2131(arg0);
    }

    @ObfuscatedName("j.bg(IIILjava/lang/String;I)V")
    public static void method144(int arg0, int arg1, int arg2, String arg3) {
        class148 var4 = class148.method2650(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2564 != null) {
            class1 var5 = new class1();
            var5.field11 = var4;
            var5.field6 = arg0;
            var5.field10 = arg3;
            var5.field9 = var4.field2564;
            class29.method2814(var5);
        }
        boolean var6 = true;
        if (var4.field2481 > 0) {
            var6 = method1852(var4);
        }
        if (!var6) {
            return;
        }
        int var7 = method2642(var4);
        int var8 = arg0 - 1;
        boolean var9 = (var7 >> var8 + 1 & 0x1) != 0;
        if (!var9) {
            return;
        }
        if (arg0 == 1) {
            field289.method2372(124);
            field289.method2131(arg1);
            field289.method2117(arg2);
        }
        if (arg0 == 2) {
            field289.method2372(127);
            field289.method2131(arg1);
            field289.method2117(arg2);
        }
        if (arg0 == 3) {
            field289.method2372(152);
            field289.method2131(arg1);
            field289.method2117(arg2);
        }
        if (arg0 == 4) {
            field289.method2372(223);
            field289.method2131(arg1);
            field289.method2117(arg2);
        }
        if (arg0 == 5) {
            field289.method2372(248);
            field289.method2131(arg1);
            field289.method2117(arg2);
        }
        if (arg0 == 6) {
            field289.method2372(19);
            field289.method2131(arg1);
            field289.method2117(arg2);
        }
        if (arg0 == 7) {
            field289.method2372(29);
            field289.method2131(arg1);
            field289.method2117(arg2);
        }
        if (arg0 == 8) {
            field289.method2372(145);
            field289.method2131(arg1);
            field289.method2117(arg2);
        }
        if (arg0 == 9) {
            field289.method2372(30);
            field289.method2131(arg1);
            field289.method2117(arg2);
        }
        if (arg0 == 10) {
            field289.method2372(60);
            field289.method2131(arg1);
            field289.method2117(arg2);
        }
    }

    @ObfuscatedName("k.bh(I)V")
    public static final void method12() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field390 - 1; var1++) {
                if (field246[var1] < 1000 && field246[var1 + 1] > 1000) {
                    String var2 = field321[var1];
                    field321[var1] = field321[var1 + 1];
                    field321[var1 + 1] = var2;
                    String var3 = field395[var1];
                    field395[var1] = field395[var1 + 1];
                    field395[var1 + 1] = var3;
                    int var4 = field246[var1];
                    field246[var1] = field246[var1 + 1];
                    field246[var1 + 1] = var4;
                    int var5 = field493[var1];
                    field493[var1] = field493[var1 + 1];
                    field493[var1 + 1] = var5;
                    int var6 = field392[var1];
                    field392[var1] = field392[var1 + 1];
                    field392[var1 + 1] = var6;
                    int var7 = field394[var1];
                    field394[var1] = field394[var1 + 1];
                    field394[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("r.bs(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method39(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field389 || field390 >= 500) {
            return;
        }
        field395[field390] = arg0;
        field321[field390] = arg1;
        field246[field390] = arg2;
        field394[field390] = arg3;
        field493[field390] = arg4;
        field392[field390] = arg5;
        field390++;
    }

    @ObfuscatedName("y.by(B)V")
    public static void method16() {
        for (int var0 = 0; var0 < field390; var0++) {
            if (method966(field246[var0])) {
                if (var0 < field390 - 1) {
                    for (int var1 = var0; var1 < field390 - 1; var1++) {
                        field395[var1] = field395[var1 + 1];
                        field321[var1] = field321[var1 + 1];
                        field246[var1] = field246[var1 + 1];
                        field394[var1] = field394[var1 + 1];
                        field493[var1] = field493[var1 + 1];
                        field392[var1] = field392[var1 + 1];
                    }
                }
                field390--;
            }
        }
    }

    @ObfuscatedName("ax.bf(II)Z")
    public static boolean method966(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("w.bl(IB)Ljava/lang/String;")
    public static String method109(int arg0) {
        return field321[arg0].length() > 0 ? field395[arg0] + class139.field2270 + field321[arg0] : field395[arg0];
    }

    @ObfuscatedName("ew.bn(Laj;IIIB)V")
    public static final void method2676(class32 arg0, int arg1, int arg2, int arg3) {
        if (field390 >= 400) {
            return;
        }
        if (arg0.field774 != null) {
            arg0 = arg0.method579();
        }
        if (arg0 == null || !arg0.field760 || arg0.field766 && field365 != arg1) {
            return;
        }
        String var4 = arg0.field775;
        if (arg0.field776 != 0) {
            var4 = var4 + method1759(arg0.field776, Statics.field944.field36) + " " + class2.field25 + class139.field2140 + arg0.field776 + class2.field18;
        }
        if (field401 == 1) {
            method39(class139.field2254, field402 + " " + class2.field22 + " " + class2.method1581(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field403) {
            String[] var5 = arg0.field777;
            if (field484) {
                var5 = method2404(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class139.field2262)) {
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
                        method39(var5[var6], class2.method1581(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class139.field2262)) {
                        short var9 = 0;
                        if (field440 == class17.field512 || field440 == class17.field516 && arg0.field776 > Statics.field944.field36) {
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
                        method39(var5[var8], class2.method1581(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method39(class139.field2297, class2.method1581(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field735 & 0x2) == 2) {
            method39(field296, field488 + " " + class2.field22 + " " + class2.method1581(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ex.cc(Ly;IIII)V")
    public static final void method2664(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field944 == arg0 || field390 >= 400) {
            return;
        }
        String var9;
        if (arg0.field37 == 0) {
            String var4 = arg0.field38;
            int var5 = arg0.field36;
            int var6 = Statics.field944.field36;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method1581(16711680);
            } else if (var7 < -6) {
                var8 = class2.method1581(16723968);
            } else if (var7 < -3) {
                var8 = class2.method1581(16740352);
            } else if (var7 < 0) {
                var8 = class2.method1581(16756736);
            } else if (var7 > 9) {
                var8 = class2.method1581(65280);
            } else if (var7 > 6) {
                var8 = class2.method1581(4259584);
            } else if (var7 > 3) {
                var8 = class2.method1581(8453888);
            } else if (var7 > 0) {
                var8 = class2.method1581(12648192);
            } else {
                var8 = class2.method1581(16776960);
            }
            var9 = var4 + var8 + " " + class2.field25 + class139.field2140 + arg0.field36 + class2.field18;
        } else {
            var9 = arg0.field38 + " " + class2.field25 + class139.field2267 + arg0.field37 + class2.field18;
        }
        if (field401 == 1) {
            method39(class139.field2254, field402 + " " + class2.field22 + " " + class2.method1581(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field403) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field398[var10] != null) {
                    short var11 = 0;
                    if (field398[var10].equalsIgnoreCase(class139.field2262)) {
                        if (field440 == class17.field512 || field440 == class17.field516 && arg0.field36 > Statics.field944.field36) {
                            var11 = 2000;
                        }
                        if (Statics.field944.field32 != 0 && arg0.field32 != 0) {
                            if (Statics.field944.field32 == arg0.field32) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field378[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field293[var10] + var11;
                    method39(field398[var10], class2.method1581(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field735 & 0x8) == 8) {
            method39(field296, field488 + " " + class2.field22 + " " + class2.method1581(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field390; var14++) {
            if (field246[var14] == 23) {
                field321[var14] = class2.method1581(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("cc.ce(IIS)Ljava/lang/String;")
    public static final String method1759(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method1581(16711680);
        } else if (var2 < -6) {
            return class2.method1581(16723968);
        } else if (var2 < -3) {
            return class2.method1581(16740352);
        } else if (var2 < 0) {
            return class2.method1581(16756736);
        } else if (var2 > 9) {
            return class2.method1581(65280);
        } else if (var2 > 6) {
            return class2.method1581(4259584);
        } else if (var2 > 3) {
            return class2.method1581(8453888);
        } else if (var2 > 0) {
            return class2.method1581(12648192);
        } else {
            return class2.method1581(16776960);
        }
    }

    @ObfuscatedName("ct.cq(IIIIIIIIB)V")
    public static final void method1963(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class148.method148(arg0)) {
            Statics.field59 = null;
            Statics.method160(Statics.field2524[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field59 != null) {
                Statics.method160(Statics.field59, -1412584499, arg1, arg2, arg3, arg4, Statics.field676, Statics.field72, arg7);
                Statics.field59 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field499[var8] = true;
            }
        } else {
            field499[arg7] = true;
        }
    }

    @ObfuscatedName("cx.cg(Ljava/lang/String;Len;I)Ljava/lang/String;")
    public static String method2057(String arg0, class148 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method358(arg1, var2 - 1);
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
                if (Statics.field2623 != null) {
                    var8 = Statics.method548(Statics.field2623.field2039);
                    if (Statics.field2623.field2041 != null) {
                        var8 = (String) Statics.field2623.field2041;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ai.cd(II)Ljava/lang/String;")
    public static final String method667(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field19 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1581(65408) + var1.substring(0, var1.length() - 8) + class139.field2290 + " " + class2.field25 + var1 + class2.field18 + class2.field26;
        } else if (var1.length() > 6) {
            return " " + class2.method1581(16777215) + var1.substring(0, var1.length() - 4) + class139.field2303 + " " + class2.field25 + var1 + class2.field18 + class2.field26;
        } else {
            return " " + class2.method1581(16776960) + var1 + class2.field26;
        }
    }

    @ObfuscatedName("a.ch(IIIIII)V")
    public static final void method101(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1416[0].method1552(arg0, arg1);
        Statics.field1416[1].method1552(arg0, arg1 + arg3 - 16);
        class70.method1495(arg0, arg1 + 16, 16, arg3 - 32, field324);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class70.method1495(arg0, arg1 + 16 + var6, 16, var5, field325);
        class70.method1509(arg0, arg1 + 16 + var6, var5, field497);
        class70.method1509(arg0 + 1, arg1 + 16 + var6, var5, field497);
        class70.method1501(arg0, arg1 + 16 + var6, 16, field497);
        class70.method1501(arg0, arg1 + 17 + var6, 16, field497);
        class70.method1509(arg0 + 15, arg1 + 16 + var6, var5, field326);
        class70.method1509(arg0 + 14, arg1 + 17 + var6, var5 - 1, field326);
        class70.method1501(arg0, arg1 + 15 + var6 + var5, 16, field326);
        class70.method1501(arg0 + 1, arg1 + 14 + var6 + var5, 15, field326);
    }

    @ObfuscatedName("am.cs(Len;I)Z")
    public static final boolean method712(class148 arg0) {
        if (arg0.field2574 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2574.length; var1++) {
            int var2 = method358(arg0, var1);
            int var3 = arg0.field2503[var1];
            if (arg0.field2574[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2574[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2574[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("client.cj(Len;IB)I")
    public static final int method358(class148 arg0, int arg1) {
        if (arg0.field2573 == null || arg1 >= arg0.field2573.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2573[arg1];
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
                    var7 = field385[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field386[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field387[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class148 var11 = class148.method1290(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class42.method124(var12).field982 || field254)) {
                        for (int var13 = 0; var13 < var11.field2579.length; var13++) {
                            if (var12 + 1 == var11.field2579[var13]) {
                                var7 += var11.field2580[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class150.field2603[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class137.field2103[field386[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class150.field2603[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field944.field36;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class137.field2101[var14]) {
                            var7 += field386[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class148 var17 = class148.method1290(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class42.method124(var18).field982 || field254)) {
                        for (int var19 = 0; var19 < var17.field2579.length; var19++) {
                            if (var18 + 1 == var17.field2579[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field412;
                }
                if (var6 == 12) {
                    var7 = field413;
                }
                if (var6 == 13) {
                    int var20 = class150.field2603[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class150.method88(var22);
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
                    var7 = (Statics.field944.field704 >> 7) + Statics.field557;
                }
                if (var6 == 19) {
                    var7 = (Statics.field944.field693 >> 7) + Statics.field172;
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

    @ObfuscatedName("ay.cm(Len;III)V")
    public static final void method555(class148 arg0, int arg1, int arg2) {
        if (arg0.field2529 == 1) {
            method39(arg0.field2578, "", 24, 0, 0, arg0.field2507);
        }
        if (arg0.field2529 == 2 && !field403) {
            String var3;
            if (class152.method2677(method2642(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2543 == null || arg0.field2543.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2543;
            }
            if (var3 != null) {
                method39(var3, class2.method1581(65280) + arg0.field2577, 25, 0, -1, arg0.field2507);
            }
        }
        if (arg0.field2529 == 3) {
            method39(class139.field2269, "", 26, 0, 0, arg0.field2507);
        }
        if (arg0.field2529 == 4) {
            method39(arg0.field2578, "", 28, 0, 0, arg0.field2507);
        }
        if (arg0.field2529 == 5) {
            method39(arg0.field2578, "", 29, 0, 0, arg0.field2507);
        }
        if (arg0.field2529 == 6 && field446 == null) {
            method39(arg0.field2578, "", 30, 0, -1, arg0.field2507);
        }
        if (arg0.field2479 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2487; var6++) {
                for (int var7 = 0; var7 < arg0.field2485; var7++) {
                    int var8 = (arg0.field2488 + 32) * var7;
                    int var9 = (arg0.field2531 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2511[var5];
                        var9 += arg0.field2593[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field362 = var5;
                        Statics.field1029 = arg0;
                        if (arg0.field2579[var5] > 0) {
                            class42 var10 = class42.method124(arg0.field2579[var5] - 1);
                            if (field401 == 1 && class152.method574(method2642(arg0))) {
                                if (Statics.field108 != arg0.field2507 || Statics.field952 != var5) {
                                    method39(class139.field2254, field402 + " " + class2.field22 + " " + class2.method1581(16748608) + var10.field985, 31, var10.field984, var5, arg0.field2507);
                                }
                            } else if (!field403 || !class152.method574(method2642(arg0))) {
                                String[] var11 = var10.field1001;
                                if (field484) {
                                    var11 = method2404(var11);
                                }
                                if (class152.method574(method2642(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 36;
                                            } else {
                                                var13 = 37;
                                            }
                                            method39(var11[var12], class2.method1581(16748608) + var10.field985, var13, var10.field984, var5, arg0.field2507);
                                        } else if (var12 == 4) {
                                            method39(class139.field2170, class2.method1581(16748608) + var10.field985, 37, var10.field984, var5, arg0.field2507);
                                        }
                                    }
                                }
                                if (class152.method1851(method2642(arg0))) {
                                    method39(class139.field2254, class2.method1581(16748608) + var10.field985, 38, var10.field984, var5, arg0.field2507);
                                }
                                if (class152.method574(method2642(arg0)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 33;
                                            }
                                            if (var14 == 1) {
                                                var15 = 34;
                                            }
                                            if (var14 == 2) {
                                                var15 = 35;
                                            }
                                            method39(var11[var14], class2.method1581(16748608) + var10.field985, var15, var10.field984, var5, arg0.field2507);
                                        }
                                    }
                                }
                                String[] var16 = arg0.field2535;
                                if (field484) {
                                    var16 = method2404(var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 39;
                                            }
                                            if (var17 == 1) {
                                                var18 = 40;
                                            }
                                            if (var17 == 2) {
                                                var18 = 41;
                                            }
                                            if (var17 == 3) {
                                                var18 = 42;
                                            }
                                            if (var17 == 4) {
                                                var18 = 43;
                                            }
                                            method39(var16[var17], class2.method1581(16748608) + var10.field985, var18, var10.field984, var5, arg0.field2507);
                                        }
                                    }
                                }
                                method39(class139.field2297, class2.method1581(16748608) + var10.field985, 1005, var10.field984, var5, arg0.field2507);
                            } else if ((Statics.field735 & 0x10) == 16) {
                                method39(field296, field488 + " " + class2.field22 + " " + class2.method1581(16748608) + var10.field985, 32, var10.field984, var5, arg0.field2507);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2476) {
            return;
        }
        if (!field403) {
            for (int var19 = 9; var19 >= 5; var19--) {
                int var20 = method2642(arg0);
                boolean var21 = (var20 >> var19 + 1 & 0x1) != 0;
                String var22;
                if (!var21 && arg0.field2564 == null) {
                    var22 = null;
                } else if (arg0.field2538 == null || arg0.field2538.length <= var19 || arg0.field2538[var19] == null || arg0.field2538[var19].trim().length() == 0) {
                    var22 = null;
                } else {
                    var22 = arg0.field2538[var19];
                }
                if (var22 != null) {
                    method39(var22, arg0.field2477, 1007, var19 + 1, arg0.field2527, arg0.field2507);
                }
            }
            String var24 = method573(arg0);
            if (var24 != null) {
                method39(var24, arg0.field2477, 25, 0, arg0.field2527, arg0.field2507);
            }
            for (int var25 = 4; var25 >= 0; var25--) {
                int var26 = method2642(arg0);
                boolean var27 = (var26 >> var25 + 1 & 0x1) != 0;
                String var28;
                if (!var27 && arg0.field2564 == null) {
                    var28 = null;
                } else if (arg0.field2538 == null || arg0.field2538.length <= var25 || arg0.field2538[var25] == null || arg0.field2538[var25].trim().length() == 0) {
                    var28 = null;
                } else {
                    var28 = arg0.field2538[var25];
                }
                if (var28 != null) {
                    method39(var28, arg0.field2477, 57, var25 + 1, arg0.field2527, arg0.field2507);
                }
            }
            if (class152.method97(method2642(arg0))) {
                method39(class139.field2127, "", 30, 0, arg0.field2527, arg0.field2507);
            }
        } else if (class152.method3250(method2642(arg0)) && (Statics.field735 & 0x20) == 32) {
            method39(field296, field488 + " " + class2.field22 + " " + arg0.field2477, 58, 0, arg0.field2527, arg0.field2507);
        }
    }

    @ObfuscatedName("an.cr(IIIIIIIB)V")
    public static final void method769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class148.method148(arg0)) {
            method2947(Statics.field2524[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ej.ck([Len;IIIIIIIB)V")
    public static final void method2947(class148[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class148 var9 = arg0[var8];
            if (var9 != null && (!var9.field2476 || var9.field2479 == 0 || var9.field2548 || method2642(var9) != 0 || field420 == var9) && var9.field2502 == arg1 && (!var9.field2476 || !method2670(var9))) {
                int var10 = var9.field2482 + arg6;
                int var11 = var9.field2555 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2479 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2479 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2485 + var10;
                    int var19 = var9.field2487 + var11;
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
                    int var22 = var9.field2485 + var10;
                    int var23 = var9.field2487 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field419 == var9) {
                    field427 = true;
                    field428 = var10;
                    field429 = var11;
                }
                if (!var9.field2476 || var12 < var14 && var13 < var15) {
                    int var24 = class124.field1969;
                    int var25 = class124.field1970;
                    if (class124.field1972 != 0) {
                        var24 = class124.field1976;
                        var25 = class124.field1977;
                    }
                    if (var9.field2481 == 1337) {
                        method141(var9);
                        if (!field258 && !field389 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field401 == 0 && !field403) {
                                method39(class139.field2265, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            for (int var27 = 0; var27 < class95.field1720; var27++) {
                                int var28 = class95.field1721[var27];
                                int var29 = var28 & 0x7F;
                                int var30 = var28 >> 7 & 0x7F;
                                int var31 = var28 >> 29 & 0x3;
                                int var32 = var28 >> 14 & 0x7FFF;
                                if (var26 != var28) {
                                    var26 = var28;
                                    if (var31 == 2 && Statics.field878.method1755(Statics.field1795, var29, var30, var28) >= 0) {
                                        class33 var33 = class33.method13(var32);
                                        if (var33.field839 != null) {
                                            var33 = var33.method621();
                                        }
                                        if (var33 == null) {
                                            continue;
                                        }
                                        if (field401 == 1) {
                                            method39(class139.field2254, field402 + " " + class2.field22 + " " + class2.method1581(65535) + var33.field829, 1, var28, var29, var30);
                                        } else if (!field403) {
                                            String[] var34 = var33.field808;
                                            if (field484) {
                                                var34 = method2404(var34);
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
                                                        method39(var34[var35], class2.method1581(65535) + var33.field829, var36, var28, var29, var30);
                                                    }
                                                }
                                            }
                                            method39(class139.field2297, class2.method1581(65535) + var33.field829, 1002, var33.field834 << 14, var29, var30);
                                        } else if ((Statics.field735 & 0x4) == 4) {
                                            method39(field296, field488 + " " + class2.field22 + " " + class2.method1581(65535) + var33.field829, 2, var28, var29, var30);
                                        }
                                    }
                                    if (var31 == 1) {
                                        class28 var37 = field410[var32];
                                        if (var37 == null) {
                                            continue;
                                        }
                                        if (var37.field674.field789 == 1 && (var37.field704 & 0x7F) == 64 && (var37.field693 & 0x7F) == 64) {
                                            for (int var38 = 0; var38 < field287; var38++) {
                                                class28 var39 = field410[field288[var38]];
                                                if (var39 != null && var37 != var39 && var39.field674.field789 == 1 && var37.field704 == var39.field704 && var37.field693 == var39.field693) {
                                                    method2676(var39.field674, field288[var38], var29, var30);
                                                }
                                            }
                                            for (int var40 = 0; var40 < field367; var40++) {
                                                class3 var41 = field366[field368[var40]];
                                                if (var41 != null && var37.field704 == var41.field704 && var37.field693 == var41.field693) {
                                                    method2664(var41, field368[var40], var29, var30);
                                                }
                                            }
                                        }
                                        method2676(var37.field674, var32, var29, var30);
                                    }
                                    if (var31 == 0) {
                                        class3 var42 = field366[var32];
                                        if (var42 == null) {
                                            continue;
                                        }
                                        if ((var42.field704 & 0x7F) == 64 && (var42.field693 & 0x7F) == 64) {
                                            for (int var43 = 0; var43 < field287; var43++) {
                                                class28 var44 = field410[field288[var43]];
                                                if (var44 != null && var44.field674.field789 == 1 && var42.field704 == var44.field704 && var42.field693 == var44.field693) {
                                                    method2676(var44.field674, field288[var43], var29, var30);
                                                }
                                            }
                                            for (int var45 = 0; var45 < field367; var45++) {
                                                class3 var46 = field366[field368[var45]];
                                                if (var46 != null && var42 != var46 && var42.field704 == var46.field704 && var42.field693 == var46.field693) {
                                                    method2664(var46, field368[var45], var29, var30);
                                                }
                                            }
                                        }
                                        method2664(var42, var32, var29, var30);
                                    }
                                    if (var31 == 3) {
                                        class171 var47 = field381[Statics.field1795][var29][var30];
                                        if (var47 != null) {
                                            for (class23 var48 = (class23) var47.method3186(); var48 != null; var48 = (class23) var47.method3173()) {
                                                class42 var49 = class42.method124(var48.field597);
                                                if (field401 == 1) {
                                                    method39(class139.field2254, field402 + " " + class2.field22 + " " + class2.method1581(16748608) + var49.field985, 16, var48.field597, var29, var30);
                                                } else if (!field403) {
                                                    String[] var50 = var49.field1000;
                                                    if (field484) {
                                                        var50 = method2404(var50);
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
                                                            method39(var50[var51], class2.method1581(16748608) + var49.field985, var52, var48.field597, var29, var30);
                                                        } else if (var51 == 2) {
                                                            method39(class139.field2122, class2.method1581(16748608) + var49.field985, 20, var48.field597, var29, var30);
                                                        }
                                                    }
                                                    method39(class139.field2297, class2.method1581(16748608) + var49.field985, 1004, var48.field597, var29, var30);
                                                } else if ((Statics.field735 & 0x1) == 1) {
                                                    method39(field296, field488 + " " + class2.field22 + " " + class2.method1581(16748608) + var49.field985, 17, var48.field597, var29, var30);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var9.field2481 == 1338) {
                        method2395(var10, var11);
                    } else {
                        if (!field389 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method555(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2479 == 0) {
                            if (!var9.field2476 && method2670(var9) && Statics.field178 != var9) {
                                continue;
                            }
                            method2947(arg0, var9.field2507, var12, var13, var14, var15, var10 - var9.field2495, var11 - var9.field2551);
                            if (var9.field2585 != null) {
                                method2947(var9.field2585, var9.field2507, var12, var13, var14, var15, var10 - var9.field2495, var11 - var9.field2551);
                            }
                            class4 var53 = (class4) field408.method3159((long) var9.field2507);
                            if (var53 != null) {
                                if (var53.field61 == 0 && class124.field1969 >= var12 && class124.field1970 >= var13 && class124.field1969 < var14 && class124.field1970 < var15 && !field389 && !field406) {
                                    field395[0] = class139.field2190;
                                    field321[0] = "";
                                    field246[0] = 1006;
                                    field390 = 1;
                                }
                                method769(var53.field65, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2476) {
                            if (var9.field2594 && class124.field1969 >= var12 && class124.field1970 >= var13 && class124.field1969 < var14 && class124.field1970 < var15) {
                                for (class1 var54 = (class1) field341.method3178(); var54 != null; var54 = (class1) field341.method3179()) {
                                    if (var54.field15) {
                                        var54.method3223();
                                        var54.field11.field2572 = false;
                                    }
                                }
                                if (Statics.field170 == 0) {
                                    field419 = null;
                                    field420 = null;
                                }
                                if (!field389) {
                                    field395[0] = class139.field2190;
                                    field321[0] = "";
                                    field246[0] = 1006;
                                    field390 = 1;
                                }
                            }
                            boolean var55;
                            if (class124.field1969 >= var12 && class124.field1970 >= var13 && class124.field1969 < var14 && class124.field1970 < var15) {
                                var55 = true;
                            } else {
                                var55 = false;
                            }
                            boolean var56 = false;
                            if ((class124.field1968 == 1 || !Statics.field1067 && class124.field1968 == 4) && var55) {
                                var56 = true;
                            }
                            boolean var57 = false;
                            if ((class124.field1972 == 1 || !Statics.field1067 && class124.field1972 == 4) && class124.field1976 >= var12 && class124.field1977 >= var13 && class124.field1976 < var14 && class124.field1977 < var15) {
                                var57 = true;
                            }
                            if (var57) {
                                method9(var9, class124.field1976 - var10, class124.field1977 - var11);
                            }
                            if (field419 != null && field419 != var9 && var55 && class152.method2060(method2642(var9))) {
                                field423 = var9;
                            }
                            if (field420 == var9) {
                                field424 = true;
                                field425 = var10;
                                field426 = var11;
                            }
                            if (var9.field2548) {
                                if (var55 && field444 != 0 && var9.field2565 != null) {
                                    class1 var58 = new class1();
                                    var58.field15 = true;
                                    var58.field11 = var9;
                                    var58.field5 = field444;
                                    var58.field9 = var9.field2565;
                                    field341.method3180(var58);
                                }
                                if (field419 != null || Statics.field1035 != null || field389) {
                                    var57 = false;
                                    var56 = false;
                                    var55 = false;
                                }
                                if (!var9.field2587 && var57) {
                                    var9.field2587 = true;
                                    if (var9.field2546 != null) {
                                        class1 var59 = new class1();
                                        var59.field15 = true;
                                        var59.field11 = var9;
                                        var59.field1 = class124.field1976 - var10;
                                        var59.field5 = class124.field1977 - var11;
                                        var59.field9 = var9.field2546;
                                        field341.method3180(var59);
                                    }
                                }
                                if (var9.field2587 && var56 && var9.field2563 != null) {
                                    class1 var60 = new class1();
                                    var60.field15 = true;
                                    var60.field11 = var9;
                                    var60.field1 = class124.field1969 - var10;
                                    var60.field5 = class124.field1970 - var11;
                                    var60.field9 = var9.field2563;
                                    field341.method3180(var60);
                                }
                                if (var9.field2587 && !var56) {
                                    var9.field2587 = false;
                                    if (var9.field2586 != null) {
                                        class1 var61 = new class1();
                                        var61.field15 = true;
                                        var61.field11 = var9;
                                        var61.field1 = class124.field1969 - var10;
                                        var61.field5 = class124.field1970 - var11;
                                        var61.field9 = var9.field2586;
                                        field447.method3180(var61);
                                    }
                                }
                                if (var56 && var9.field2549 != null) {
                                    class1 var62 = new class1();
                                    var62.field15 = true;
                                    var62.field11 = var9;
                                    var62.field1 = class124.field1969 - var10;
                                    var62.field5 = class124.field1970 - var11;
                                    var62.field9 = var9.field2549;
                                    field341.method3180(var62);
                                }
                                if (!var9.field2572 && var55) {
                                    var9.field2572 = true;
                                    if (var9.field2550 != null) {
                                        class1 var63 = new class1();
                                        var63.field15 = true;
                                        var63.field11 = var9;
                                        var63.field1 = class124.field1969 - var10;
                                        var63.field5 = class124.field1970 - var11;
                                        var63.field9 = var9.field2550;
                                        field341.method3180(var63);
                                    }
                                }
                                if (var9.field2572 && var55 && var9.field2541 != null) {
                                    class1 var64 = new class1();
                                    var64.field15 = true;
                                    var64.field11 = var9;
                                    var64.field1 = class124.field1969 - var10;
                                    var64.field5 = class124.field1970 - var11;
                                    var64.field9 = var9.field2541;
                                    field341.method3180(var64);
                                }
                                if (var9.field2572 && !var55) {
                                    var9.field2572 = false;
                                    if (var9.field2552 != null) {
                                        class1 var65 = new class1();
                                        var65.field15 = true;
                                        var65.field11 = var9;
                                        var65.field1 = class124.field1969 - var10;
                                        var65.field5 = class124.field1970 - var11;
                                        var65.field9 = var9.field2552;
                                        field447.method3180(var65);
                                    }
                                }
                                if (var9.field2584 != null) {
                                    class1 var66 = new class1();
                                    var66.field11 = var9;
                                    var66.field9 = var9.field2584;
                                    field391.method3180(var66);
                                }
                                if (var9.field2557 != null && field443 > var9.field2510) {
                                    if (var9.field2558 == null || field443 - var9.field2510 > 32) {
                                        class1 var71 = new class1();
                                        var71.field11 = var9;
                                        var71.field9 = var9.field2557;
                                        field341.method3180(var71);
                                    } else {
                                        label791: for (int var67 = var9.field2510; var67 < field443; var67++) {
                                            int var68 = field451[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var9.field2558.length; var69++) {
                                                if (var9.field2558[var69] == var68) {
                                                    class1 var70 = new class1();
                                                    var70.field11 = var9;
                                                    var70.field9 = var9.field2557;
                                                    field341.method3180(var70);
                                                    break label791;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2510 = field443;
                                }
                                if (var9.field2471 != null && field435 > var9.field2590) {
                                    if (var9.field2560 == null || field435 - var9.field2590 > 32) {
                                        class1 var76 = new class1();
                                        var76.field11 = var9;
                                        var76.field9 = var9.field2471;
                                        field341.method3180(var76);
                                    } else {
                                        label767: for (int var72 = var9.field2590; var72 < field435; var72++) {
                                            int var73 = field487[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var9.field2560.length; var74++) {
                                                if (var9.field2560[var74] == var73) {
                                                    class1 var75 = new class1();
                                                    var75.field11 = var9;
                                                    var75.field9 = var9.field2471;
                                                    field341.method3180(var75);
                                                    break label767;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2590 = field435;
                                }
                                if (var9.field2561 != null && field437 > var9.field2493) {
                                    if (var9.field2562 == null || field437 - var9.field2493 > 32) {
                                        class1 var81 = new class1();
                                        var81.field11 = var9;
                                        var81.field9 = var9.field2561;
                                        field341.method3180(var81);
                                    } else {
                                        label743: for (int var77 = var9.field2493; var77 < field437; var77++) {
                                            int var78 = field297[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var9.field2562.length; var79++) {
                                                if (var9.field2562[var79] == var78) {
                                                    class1 var80 = new class1();
                                                    var80.field11 = var9;
                                                    var80.field9 = var9.field2561;
                                                    field341.method3180(var80);
                                                    break label743;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2493 = field437;
                                }
                                if (field438 > var9.field2588 && var9.field2566 != null) {
                                    class1 var82 = new class1();
                                    var82.field11 = var9;
                                    var82.field9 = var9.field2566;
                                    field341.method3180(var82);
                                }
                                if (field439 > var9.field2588 && var9.field2568 != null) {
                                    class1 var83 = new class1();
                                    var83.field11 = var9;
                                    var83.field9 = var9.field2568;
                                    field341.method3180(var83);
                                }
                                if (field363 > var9.field2588 && var9.field2569 != null) {
                                    class1 var84 = new class1();
                                    var84.field11 = var9;
                                    var84.field9 = var9.field2569;
                                    field341.method3180(var84);
                                }
                                if (field441 > var9.field2588 && var9.field2576 != null) {
                                    class1 var85 = new class1();
                                    var85.field11 = var9;
                                    var85.field9 = var9.field2576;
                                    field341.method3180(var85);
                                }
                                var9.field2588 = field318;
                                if (var9.field2567 != null) {
                                    for (int var86 = 0; var86 < field277; var86++) {
                                        class1 var87 = new class1();
                                        var87.field11 = var9;
                                        var87.field8 = field355[var86];
                                        var87.field2 = field252[var86];
                                        var87.field9 = var9.field2567;
                                        field341.method3180(var87);
                                    }
                                }
                            }
                        }
                        if (!var9.field2476 && field419 == null && Statics.field1035 == null && !field389) {
                            if ((var9.field2532 >= 0 || var9.field2496 != 0) && class124.field1969 >= var12 && class124.field1970 >= var13 && class124.field1969 < var14 && class124.field1970 < var15) {
                                if (var9.field2532 >= 0) {
                                    Statics.field178 = arg0[var9.field2532];
                                } else {
                                    Statics.field178 = var9;
                                }
                            }
                            if (var9.field2479 == 8 && class124.field1969 >= var12 && class124.field1970 >= var13 && class124.field1969 < var14 && class124.field1970 < var15) {
                                Statics.field1954 = var9;
                            }
                            if (var9.field2575 > var9.field2487) {
                                int var88 = var9.field2485 + var10;
                                int var89 = var9.field2487;
                                int var90 = var9.field2575;
                                int var91 = class124.field1969;
                                int var92 = class124.field1970;
                                if (field328) {
                                    field329 = 32;
                                } else {
                                    field329 = 0;
                                }
                                field328 = false;
                                if (class124.field1968 == 1 || !Statics.field1067 && class124.field1968 == 4) {
                                    if (var91 >= var88 && var91 < var88 + 16 && var92 >= var11 && var92 < var11 + 16) {
                                        var9.field2551 -= 4;
                                        method141(var9);
                                    } else if (var91 >= var88 && var91 < var88 + 16 && var92 >= var11 + var89 - 16 && var92 < var11 + var89) {
                                        var9.field2551 += 4;
                                        method141(var9);
                                    } else if (var91 >= var88 - field329 && var91 < field329 + var88 + 16 && var92 >= var11 + 16 && var92 < var11 + var89 - 16) {
                                        int var93 = (var89 - 32) * var89 / var90;
                                        if (var93 < 8) {
                                            var93 = 8;
                                        }
                                        int var94 = var92 - var11 - 16 - var93 / 2;
                                        int var95 = var89 - 32 - var93;
                                        var9.field2551 = (var90 - var89) * var94 / var95;
                                        method141(var9);
                                        field328 = true;
                                    }
                                }
                                if (field444 != 0) {
                                    int var96 = var9.field2485;
                                    if (var91 >= var88 - var96 && var92 >= var11 && var91 < var88 + 16 && var92 <= var11 + var89) {
                                        var9.field2551 += field444 * 45;
                                        method141(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.ct(Len;IIB)V")
    public static final void method9(class148 arg0, int arg1, int arg2) {
        if (field419 != null || field389 || arg0 == null) {
            return;
        }
        class148 var3 = method1863(arg0);
        if (var3 == null) {
            var3 = arg0.field2539;
        }
        if (var3 == null) {
            return;
        }
        field419 = arg0;
        class148 var5 = method1863(arg0);
        if (var5 == null) {
            var5 = arg0.field2539;
        }
        field420 = var5;
        field448 = arg1;
        field422 = arg2;
        Statics.field170 = 0;
        field430 = false;
        if (field390 > 0) {
            int var7 = field390 - 1;
            Statics.field17 = new class25();
            Statics.field17.field625 = field493[var7];
            Statics.field17.field621 = field392[var7];
            Statics.field17.field616 = field246[var7];
            Statics.field17.field618 = field394[var7];
            Statics.field17.field617 = field395[var7];
        }
        return;
    }

    @ObfuscatedName("j.cv(Len;I)V")
    public static void method141(class148 arg0) {
        if (field276 == arg0.field2469) {
            field499[arg0.field2592] = true;
        }
    }

    @ObfuscatedName("ex.cl(I)V")
    public static void method2659() {
        for (class4 var0 = (class4) field408.method3156(); var0 != null; var0 = (class4) field408.method3157()) {
            int var1 = var0.field65;
            if (class148.method148(var1)) {
                boolean var2 = true;
                class148[] var3 = Statics.field2524[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2476;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2812;
                    class148 var6 = class148.method1290(var5);
                    if (var6 != null) {
                        method141(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("df.cw([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2404(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("b.ci(IB)V")
    public static final void method498(int arg0) {
        if (class148.method148(arg0)) {
            method2666(Statics.field2524[arg0], -1);
        }
    }

    @ObfuscatedName("ex.cf([Len;IB)V")
    public static final void method2666(class148[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class148 var3 = arg0[var2];
            if (var3 != null && var3.field2502 == arg1 && (!var3.field2476 || !method2670(var3))) {
                if (var3.field2479 == 0) {
                    if (!var3.field2476 && method2670(var3) && Statics.field178 != var3) {
                        continue;
                    }
                    method2666(arg0, var3.field2507);
                    if (var3.field2585 != null) {
                        method2666(var3.field2585, var3.field2507);
                    }
                    class4 var4 = (class4) field408.method3159((long) var3.field2507);
                    if (var4 != null) {
                        method498(var4.field65);
                    }
                }
                if (var3.field2479 == 6) {
                    if (var3.field2517 != -1 || var3.field2514 != -1) {
                        boolean var5 = method712(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2514;
                        } else {
                            var6 = var3.field2517;
                        }
                        if (var6 != -1) {
                            class35 var7 = class35.method162(var6);
                            var3.field2483 += field323;
                            while (var3.field2483 > var7.field884[var3.field2583]) {
                                var3.field2483 -= var7.field884[var3.field2583];
                                var3.field2583++;
                                if (var3.field2583 >= var7.field870.length) {
                                    var3.field2583 -= var7.field872;
                                    if (var3.field2583 < 0 || var3.field2583 >= var7.field870.length) {
                                        var3.field2583 = 0;
                                    }
                                }
                                method141(var3);
                            }
                        }
                    }
                    if (var3.field2521 != 0 && !var3.field2476) {
                        int var8 = var3.field2521 >> 16;
                        int var9 = var3.field2521 << 16 >> 16;
                        int var10 = field323 * var8;
                        int var11 = field323 * var9;
                        var3.field2489 = var3.field2489 + var10 & 0x7FF;
                        var3.field2518 = var3.field2518 + var11 & 0x7FF;
                        method141(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ce.cn(IB)V")
    public static final void method1761(int arg0) {
        method2659();
        class19.method2668();
        int var1 = class43.method102(arg0).field1032;
        if (var1 == 0) {
            return;
        }
        int var2 = class150.field2603[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class81.method1769(0.9D);
                ((class85) Statics.field1445).method1857(0.9D);
            }
            if (var2 == 2) {
                class81.method1769(0.8D);
                ((class85) Statics.field1445).method1857(0.8D);
            }
            if (var2 == 3) {
                class81.method1769(0.7D);
                ((class85) Statics.field1445).method1857(0.7D);
            }
            if (var2 == 4) {
                class81.method1769(0.6D);
                ((class85) Statics.field1445).method1857(0.6D);
            }
            class42.field1016.method3134();
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
            if (field483 != var3) {
                if (field483 == 0 && field312 != -1) {
                    class157.method1866(Statics.field1996, field312, 0, var3, false);
                    field421 = false;
                } else if (var3 == 0) {
                    class157.method515();
                    field421 = false;
                } else if (class157.field2660 == 0) {
                    Statics.field2665.method3010(var3);
                } else {
                    Statics.field2657 = var3;
                }
                field483 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field486 = 127;
            }
            if (var2 == 1) {
                field486 = 96;
            }
            if (var2 == 2) {
                field486 = 64;
            }
            if (var2 == 3) {
                field486 = 32;
            }
            if (var2 == 4) {
                field486 = 0;
            }
        }
        if (var1 == 5) {
            field388 = var2;
        }
        if (var1 == 6) {
            field331 = var2;
        }
        if (var1 == 9) {
            field471 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field302 = 127;
            }
            if (var2 == 1) {
                field302 = 96;
            }
            if (var2 == 2) {
                field302 = 64;
            }
            if (var2 == 3) {
                field302 = 32;
            }
            if (var2 == 4) {
                field302 = 0;
            }
        }
        if (var1 == 17) {
            field365 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class17[] var4 = new class17[] { class17.field514, class17.field516, class17.field512 };
            field440 = (class17) class96.method1(var4, var2);
            if (field440 == null) {
                field440 = class17.field516;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field380 = -1;
        } else {
            field380 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("y.cy(I)V")
    public static final void method27() {
        field289.method2372(73);
        for (class4 var0 = (class4) field408.method3156(); var0 != null; var0 = (class4) field408.method3157()) {
            if (var0.field61 == 0 || var0.field61 == 3) {
                method134(var0, true);
            }
        }
        if (field446 != null) {
            method141(field446);
            field446 = null;
        }
    }

    @ObfuscatedName("bp.cz(IIII)Lg;")
    public static final class4 method1287(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field65 = arg1;
        var3.field61 = arg2;
        field408.method3165(var3, (long) arg0);
        Statics.method163(arg1);
        class29.method795(arg1);
        class148 var4 = class148.method1290(arg0);
        if (var4 != null) {
            method141(var4);
        }
        if (field446 != null) {
            method141(field446);
            field446 = null;
        }
        method16();
        if (field361 != -1) {
            int var5 = field361;
            if (class148.method148(var5)) {
                Statics.method120(Statics.field2524[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("t.cu(Lg;ZI)V")
    public static final void method134(class4 arg0, boolean arg1) {
        int var2 = arg0.field65;
        int var3 = (int) arg0.field2812;
        arg0.method3223();
        if (arg1) {
            class148.method2367(var2);
        }
        for (class172 var4 = (class172) field272.method3156(); var4 != null; var4 = (class172) field272.method3157()) {
            if ((long) var2 == (var4.field2812 >> 48 & 0xFFFFL)) {
                var4.method3223();
            }
        }
        class148 var5 = class148.method1290(var3);
        if (var5 != null) {
            method141(var5);
        }
        method16();
        if (field361 != -1) {
            int var6 = field361;
            if (class148.method148(var6)) {
                Statics.method120(Statics.field2524[var6], 1);
            }
        }
    }

    @ObfuscatedName("cd.cb(Len;I)Z")
    public static final boolean method1852(class148 arg0) {
        int var1 = arg0.field2481;
        if (var1 == 205) {
            field259 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field506.method2887(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field506.method2894(var4, var5 == 1);
        }
        if (var1 == 324) {
            field506.method2889(false);
        }
        if (var1 == 325) {
            field506.method2889(true);
        }
        if (var1 == 326) {
            field289.method2372(44);
            field506.method2890(field289);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ds.da(IIIILbb;I)V")
    public static final void method2418(int arg0, int arg1, int arg2, int arg3, class69 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method168(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field445 + field306 & 0x7FF;
        int var7 = class81.field1448[var6];
        int var8 = class81.field1449[var6];
        int var9 = var7 * 256 / (field320 + 256);
        int var10 = var8 * 256 / (field320 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field529.method1393(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("v.di(IIIILbb;I)V")
    public static final void method168(int arg0, int arg1, int arg2, int arg3, class69 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field445 + field306 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class81.field1448[var5];
        int var8 = class81.field1449[var5];
        int var9 = var7 * 256 / (field320 + 256);
        int var10 = var8 * 256 / (field320 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1420(Statics.field1221, arg0 + 94 + var11 - arg4.field1269 / 2 + 4, arg1 + 83 - var12 - arg4.field1270 / 2 - 4);
        } else {
            arg4.method1431(arg0 + 94 + var11 - arg4.field1269 / 2 + 4, arg1 + 83 - var12 - arg4.field1270 / 2 - 4);
        }
    }

    @ObfuscatedName("dg.dj(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method2508(int arg0, String arg1, String arg2) {
        method38(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("g.db(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method38(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field459[var4] = field459[var4 - 1];
            field460[var4] = field460[var4 - 1];
            field456[var4] = field456[var4 - 1];
            field461[var4] = field461[var4 - 1];
        }
        field459[0] = arg0;
        field460[0] = arg1;
        field456[0] = arg2;
        field461[0] = arg3;
        field432++;
        field438 = field318;
    }

    @ObfuscatedName("t.df(Ljava/lang/String;ZI)Z")
    public static boolean method137(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class190.method2903(arg0, Statics.field184);
        for (int var3 = 0; var3 < field491; var3++) {
            if (var2.equalsIgnoreCase(class190.method2903(field502[var3].field229, Statics.field184)) && (!arg1 || field502[var3].field231 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class190.method2903(Statics.field944.field38, Statics.field184))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("p.ds(Ljava/lang/String;I)Z")
    public static boolean method150(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class190.method2903(arg0, Statics.field184);
        for (int var2 = 0; var2 < field504; var2++) {
            class8 var3 = field505[var2];
            if (var1.equalsIgnoreCase(class190.method2903(var3.field131, Statics.field184))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class190.method2903(var3.field134, Statics.field184))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("f.dk(Ljava/lang/String;B)V")
    public static final void method96(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field491 < 200 || field373 == 1) || field491 >= 400) {
            method2508(30, "", class139.field2244);
            return;
        }
        String var1 = class190.method2903(arg0, Statics.field184);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field491; var2++) {
            class15 var3 = field502[var2];
            String var4 = class190.method2903(var3.field229, Statics.field184);
            if (var4 != null && var4.equals(var1)) {
                method2508(30, "", arg0 + class139.field2277);
                return;
            }
            if (var3.field224 != null) {
                String var5 = class190.method2903(var3.field224, Statics.field184);
                if (var5 != null && var5.equals(var1)) {
                    method2508(30, "", arg0 + class139.field2277);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field504; var6++) {
            class8 var7 = field505[var6];
            String var8 = class190.method2903(var7.field131, Statics.field184);
            if (var8 != null && var8.equals(var1)) {
                method2508(30, "", class139.field2282 + arg0 + class139.field2283);
                return;
            }
            if (var7.field134 != null) {
                String var9 = class190.method2903(var7.field134, Statics.field184);
                if (var9 != null && var9.equals(var1)) {
                    method2508(30, "", class139.field2282 + arg0 + class139.field2283);
                    return;
                }
            }
        }
        if (class190.method2903(Statics.field944.field38, Statics.field184).equals(var1)) {
            method2508(30, "", class139.field2280);
            return;
        }
        field289.method2372(175);
        class107 var10 = field289;
        int var11 = arg0.length() + 1;
        var10.method2133(var11);
        field289.method2116(arg0);
    }

    @ObfuscatedName("s.dw(Ljava/lang/String;I)V")
    public static final void method500(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class190.method2903(arg0, Statics.field184);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field491; var2++) {
            class15 var3 = field502[var2];
            String var4 = var3.field229;
            String var5 = class190.method2903(var4, Statics.field184);
            if (class113.method1760(arg0, var1, var4, var5)) {
                field491--;
                for (int var6 = var2; var6 < field491; var6++) {
                    field502[var6] = field502[var6 + 1];
                }
                field439 = field318;
                field289.method2372(233);
                class107 var7 = field289;
                int var8 = arg0.length() + 1;
                var7.method2133(var8);
                field289.method2116(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("g.dn(Ljava/lang/String;II)V")
    public static final void method32(String arg0, int arg1) {
        field289.method2372(254);
        class107 var2 = field289;
        int var3 = arg0.length() + 1;
        var2.method2133(var3 + 1);
        field289.method2130(arg1);
        field289.method2116(arg0);
    }

    @ObfuscatedName("cb.dp(Ljava/lang/String;I)V")
    public static final void method2321(String arg0) {
        if (Statics.field1311 == null) {
            return;
        }
        field289.method2372(85);
        class107 var1 = field289;
        int var2 = arg0.length() + 1;
        var1.method2133(var2);
        field289.method2116(arg0);
    }

    @ObfuscatedName("dq.dx(Len;I)I")
    public static int method2642(class148 arg0) {
        class172 var1 = (class172) field272.method3159(((long) arg0.field2507 << 32) + (long) arg0.field2527);
        return var1 == null ? arg0.field2536 : var1.field2805;
    }

    @ObfuscatedName("cs.dt(Len;B)Len;")
    public static class148 method1863(class148 arg0) {
        int var1 = class152.method1849(method2642(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class148.method1290(arg0.field2502);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("eb.dz(Len;I)Z")
    public static boolean method2670(class148 arg0) {
        if (field406) {
            if (method2642(arg0) != 0) {
                return false;
            }
            if (arg0.field2479 == 0) {
                return false;
            }
        }
        return arg0.field2589;
    }

    @ObfuscatedName("ah.do(Len;B)Ljava/lang/String;")
    public static String method573(class148 arg0) {
        if (class152.method2677(method2642(arg0)) == 0) {
            return null;
        } else if (arg0.field2543 == null || arg0.field2543.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2543;
        }
    }
}

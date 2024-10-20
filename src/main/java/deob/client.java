package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;

public final class client extends class131 {

    @ObfuscatedName("client.a")
    public static boolean field325 = true;

    @ObfuscatedName("client.i")
    public static int field245 = 1;

    @ObfuscatedName("client.b")
    public static int field246 = 0;

    @ObfuscatedName("client.q")
    public static int field248 = 0;

    @ObfuscatedName("client.r")
    public static boolean field249 = false;

    @ObfuscatedName("client.o")
    public static boolean field250 = false;

    @ObfuscatedName("client.f")
    public static int field283 = 0;

    @ObfuscatedName("client.c")
    public static int field252 = 0;

    @ObfuscatedName("client.l")
    public static boolean field409 = true;

    @ObfuscatedName("client.w")
    public static class195[] field303 = new class195[4];

    @ObfuscatedName("client.t")
    public static int field386 = 0;

    @ObfuscatedName("client.k")
    public static long field255 = 1L;

    @ObfuscatedName("client.v")
    public static int field256 = -1;

    @ObfuscatedName("client.n")
    public static int field257 = -1;

    @ObfuscatedName("client.d")
    public static int field469 = -1;

    @ObfuscatedName("client.m")
    public static boolean field259 = true;

    @ObfuscatedName("client.g")
    public static boolean field260 = false;

    @ObfuscatedName("client.aq")
    public static int field471 = 0;

    @ObfuscatedName("client.ao")
    public static int field262 = 0;

    @ObfuscatedName("client.af")
    public static int field263 = 0;

    @ObfuscatedName("client.ag")
    public static int field264 = 0;

    @ObfuscatedName("client.ad")
    public static int field406 = 0;

    @ObfuscatedName("client.ak")
    public static int field266 = 0;

    @ObfuscatedName("client.aj")
    public static int field444 = 0;

    @ObfuscatedName("client.as")
    public static int field268 = 0;

    @ObfuscatedName("client.al")
    public static int field429 = 0;

    @ObfuscatedName("client.ai")
    public static class107 field422 = new class107(new byte[5000]);

    @ObfuscatedName("client.ay")
    public static class18 field345 = class18.field509;

    @ObfuscatedName("client.ar")
    public static int field272 = 0;

    @ObfuscatedName("client.ae")
    public static int field274 = 0;

    @ObfuscatedName("client.aa")
    public static int field333 = 0;

    @ObfuscatedName("client.bh")
    public static int field277 = 0;

    @ObfuscatedName("client.bb")
    public static int field278 = 0;

    @ObfuscatedName("client.bs")
    public static int field258 = 0;

    @ObfuscatedName("client.bc")
    public static int field280 = 0;

    @ObfuscatedName("client.bk")
    public static int field281 = 0;

    @ObfuscatedName("client.bn")
    public static class30[] field376 = new class30[32768];

    @ObfuscatedName("client.bt")
    public static int field440 = 0;

    @ObfuscatedName("client.br")
    public static int[] field363 = new int[32768];

    @ObfuscatedName("client.ck")
    public static class110 field285 = new class110(5000);

    @ObfuscatedName("client.cq")
    public static class110 field453 = new class110(5000);

    @ObfuscatedName("client.co")
    public static class110 field287 = new class110(5000);

    @ObfuscatedName("client.cw")
    public static int field288 = 0;

    @ObfuscatedName("client.cz")
    public static int field289 = 0;

    @ObfuscatedName("client.cj")
    public static int field290 = 0;

    @ObfuscatedName("client.cm")
    public static int field291 = 0;

    @ObfuscatedName("client.cs")
    public static int field321 = 0;

    @ObfuscatedName("client.cv")
    public static int field293 = 0;

    @ObfuscatedName("client.cx")
    public static int field294 = 0;

    @ObfuscatedName("client.cd")
    public static int field295 = 0;

    @ObfuscatedName("client.cy")
    public static boolean field304 = false;

    @ObfuscatedName("client.cb")
    public static int field459 = 0;

    @ObfuscatedName("client.ca")
    public static int field298 = 0;

    @ObfuscatedName("client.dv")
    public static int field299 = 1;

    @ObfuscatedName("client.dc")
    public static int field456 = 0;

    @ObfuscatedName("client.dq")
    public static int field301 = 1;

    @ObfuscatedName("client.db")
    public static int field302 = 0;

    @ObfuscatedName("client.dn")
    public static boolean field356 = false;

    @ObfuscatedName("client.da")
    public static int[][][] field305 = new int[4][13][13];

    @ObfuscatedName("client.dx")
    public static final int[] field306 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dm")
    public static int field378 = 0;

    @ObfuscatedName("client.dd")
    public static int field309 = 2;

    @ObfuscatedName("client.de")
    public static int field310 = 0;

    @ObfuscatedName("client.dt")
    public static int field311 = 2;

    @ObfuscatedName("client.dz")
    public static int field312 = 0;

    @ObfuscatedName("client.di")
    public static int field313 = 1;

    @ObfuscatedName("client.dl")
    public static int field314 = 0;

    @ObfuscatedName("client.du")
    public static int field254 = 0;

    @ObfuscatedName("client.dp")
    public static int field324 = 2;

    @ObfuscatedName("client.dj")
    public static int field348 = 0;

    @ObfuscatedName("client.ev")
    public static int field300 = 1;

    @ObfuscatedName("client.eg")
    public static int field319 = 0;

    @ObfuscatedName("client.ec")
    public static int field265 = 0;

    @ObfuscatedName("client.ed")
    public static int field439 = 2301979;

    @ObfuscatedName("client.eb")
    public static int field370 = 5063219;

    @ObfuscatedName("client.eo")
    public static int field412 = 3353893;

    @ObfuscatedName("client.ea")
    public static int field373 = 7759444;

    @ObfuscatedName("client.en")
    public static boolean field369 = false;

    @ObfuscatedName("client.fg")
    public static int field326 = 0;

    @ObfuscatedName("client.ft")
    public static int field424 = 128;

    @ObfuscatedName("client.fm")
    public static int field346 = 0;

    @ObfuscatedName("client.fo")
    public static int field308 = 0;

    @ObfuscatedName("client.fv")
    public static int field331 = 0;

    @ObfuscatedName("client.fx")
    public static int field332 = 0;

    @ObfuscatedName("client.ff")
    public static int field328 = 0;

    @ObfuscatedName("client.fy")
    public static int field334 = 0;

    @ObfuscatedName("client.fq")
    public static boolean field335 = false;

    @ObfuscatedName("client.fd")
    public static int field336 = 0;

    @ObfuscatedName("client.fh")
    public static int field337 = 0;

    @ObfuscatedName("client.fb")
    public static int field338 = 50;

    @ObfuscatedName("client.fi")
    public static int[] field327 = new int[field338];

    @ObfuscatedName("client.fn")
    public static int[] field340 = new int[field338];

    @ObfuscatedName("client.fp")
    public static int[] field341 = new int[field338];

    @ObfuscatedName("client.fj")
    public static int[] field342 = new int[field338];

    @ObfuscatedName("client.fz")
    public static int[] field343 = new int[field338];

    @ObfuscatedName("client.fe")
    public static int[] field479 = new int[field338];

    @ObfuscatedName("client.fc")
    public static int[] field270 = new int[field338];

    @ObfuscatedName("client.gh")
    public static String[] field296 = new String[field338];

    @ObfuscatedName("client.gj")
    public static int[][] field347 = new int[104][104];

    @ObfuscatedName("client.gd")
    public static int field279 = 0;

    @ObfuscatedName("client.gv")
    public static int field349 = -1;

    @ObfuscatedName("client.gf")
    public static int field457 = -1;

    @ObfuscatedName("client.ga")
    public static int field351 = 0;

    @ObfuscatedName("client.gr")
    public static int field352 = 0;

    @ObfuscatedName("client.gw")
    public static int field353 = 0;

    @ObfuscatedName("client.ge")
    public static int field354 = 0;

    @ObfuscatedName("client.gk")
    public static int field276 = 0;

    @ObfuscatedName("client.gi")
    public static int field400 = 0;

    @ObfuscatedName("client.gl")
    public static int field377 = 0;

    @ObfuscatedName("client.gs")
    public static int field358 = 0;

    @ObfuscatedName("client.go")
    public static int field359 = 0;

    @ObfuscatedName("client.gq")
    public static int field360 = 0;

    @ObfuscatedName("client.gb")
    public static boolean field480 = false;

    @ObfuscatedName("client.gt")
    public static int field284 = 0;

    @ObfuscatedName("client.gc")
    public static int field398 = 0;

    @ObfuscatedName("client.gz")
    public static class3[] field364 = new class3[2048];

    @ObfuscatedName("client.gu")
    public static int field365 = 0;

    @ObfuscatedName("client.gm")
    public static int[] field366 = new int[2048];

    @ObfuscatedName("client.hv")
    public static int field367 = 0;

    @ObfuscatedName("client.hc")
    public static int[] field368 = new int[2048];

    @ObfuscatedName("client.hx")
    public static class107[] field271 = new class107[2048];

    @ObfuscatedName("client.ho")
    public static int field468 = -1;

    @ObfuscatedName("client.hs")
    public static int field371 = 0;

    @ObfuscatedName("client.hy")
    public static int field372 = 0;

    @ObfuscatedName("client.hu")
    public static int[] field297 = new int[1000];

    @ObfuscatedName("client.hh")
    public static final int[] field374 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hq")
    public static String[] field375 = new String[8];

    @ObfuscatedName("client.hi")
    public static boolean[] field405 = new boolean[8];

    @ObfuscatedName("client.hj")
    public static int[] field322 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hk")
    public static int field316 = -1;

    @ObfuscatedName("client.hf")
    public static class177[][][] field379 = new class177[4][104][104];

    @ObfuscatedName("client.hw")
    public static class177 field452 = new class177();

    @ObfuscatedName("client.hn")
    public static class177 field473 = new class177();

    @ObfuscatedName("client.hm")
    public static class177 field392 = new class177();

    @ObfuscatedName("client.hg")
    public static int[] field383 = new int[25];

    @ObfuscatedName("client.he")
    public static int[] field384 = new int[25];

    @ObfuscatedName("client.hz")
    public static int[] field385 = new int[25];

    @ObfuscatedName("client.hb")
    public static int field380 = 0;

    @ObfuscatedName("client.hl")
    public static boolean field387 = false;

    @ObfuscatedName("client.is")
    public static int field388 = 0;

    @ObfuscatedName("client.ig")
    public static int[] field389 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field390 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field391 = new int[500];

    @ObfuscatedName("client.ir")
    public static int[] field502 = new int[500];

    @ObfuscatedName("client.ik")
    public static String[] field393 = new String[500];

    @ObfuscatedName("client.ip")
    public static String[] field503 = new String[500];

    @ObfuscatedName("client.iq")
    public static int field395 = -1;

    @ObfuscatedName("client.id")
    public static int field396 = -1;

    @ObfuscatedName("client.in")
    public static int field431 = 0;

    @ObfuscatedName("client.im")
    public static int field242 = 50;

    @ObfuscatedName("client.ia")
    public static int field399 = 0;

    @ObfuscatedName("client.if")
    public static String field261 = null;

    @ObfuscatedName("client.ie")
    public static boolean field401 = false;

    @ObfuscatedName("client.it")
    public static int field269 = -1;

    @ObfuscatedName("client.jp")
    public static String field282 = null;

    @ObfuscatedName("client.jy")
    public static String field404 = null;

    @ObfuscatedName("client.jn")
    public static int field381 = -1;

    @ObfuscatedName("client.ji")
    public static class174 field362 = new class174(8);

    @ObfuscatedName("client.jh")
    public static int field407 = 0;

    @ObfuscatedName("client.js")
    public static int field408 = 0;

    @ObfuscatedName("client.ja")
    public static class152 field323 = null;

    @ObfuscatedName("client.jo")
    public static int field410 = 0;

    @ObfuscatedName("client.jr")
    public static int field411 = 0;

    @ObfuscatedName("client.jc")
    public static int field476 = 0;

    @ObfuscatedName("client.jz")
    public static int field413 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field470 = false;

    @ObfuscatedName("client.jw")
    public static boolean field415 = false;

    @ObfuscatedName("client.jq")
    public static boolean field416 = false;

    @ObfuscatedName("client.jt")
    public static class152 field417 = null;

    @ObfuscatedName("client.je")
    public static class152 field418 = null;

    @ObfuscatedName("client.ju")
    public static int field419 = 0;

    @ObfuscatedName("client.jx")
    public static int field420 = 0;

    @ObfuscatedName("client.jf")
    public static class152 field421 = null;

    @ObfuscatedName("client.jm")
    public static boolean field320 = false;

    @ObfuscatedName("client.jl")
    public static int field423 = -1;

    @ObfuscatedName("client.jv")
    public static int field403 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field425 = false;

    @ObfuscatedName("client.jk")
    public static int field426 = -1;

    @ObfuscatedName("client.jj")
    public static int field481 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field428 = false;

    @ObfuscatedName("client.kc")
    public static int field462 = 1;

    @ObfuscatedName("client.ku")
    public static int[] field430 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field496 = 0;

    @ObfuscatedName("client.kp")
    public static int[] field432 = new int[32];

    @ObfuscatedName("client.ke")
    public static int field433 = 0;

    @ObfuscatedName("client.kn")
    public static int[] field434 = new int[32];

    @ObfuscatedName("client.ky")
    public static int field435 = 0;

    @ObfuscatedName("client.kw")
    public static int field436 = 0;

    @ObfuscatedName("client.ks")
    public static int field437 = 0;

    @ObfuscatedName("client.kz")
    public static int field438 = 0;

    @ObfuscatedName("client.kt")
    public static int field275 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field350 = new int[2000];

    @ObfuscatedName("client.kl")
    public static String[] field253 = new String[1000];

    @ObfuscatedName("client.kx")
    public static int field442 = 0;

    @ObfuscatedName("client.kd")
    public static class177 field443 = new class177();

    @ObfuscatedName("client.ki")
    public static class177 field494 = new class177();

    @ObfuscatedName("client.ko")
    public static class177 field445 = new class177();

    @ObfuscatedName("client.kj")
    public static class174 field446 = new class174(512);

    @ObfuscatedName("client.lq")
    public static int field447 = 0;

    @ObfuscatedName("client.ls")
    public static int field448 = -2;

    @ObfuscatedName("client.lp")
    public static boolean[] field449 = new boolean[100];

    @ObfuscatedName("client.la")
    public static boolean[] field450 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field451 = new boolean[100];

    @ObfuscatedName("client.lb")
    public static int[] field463 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field357 = new int[100];

    @ObfuscatedName("client.lj")
    public static int[] field339 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field455 = new int[100];

    @ObfuscatedName("client.lr")
    public static int field489 = 0;

    @ObfuscatedName("client.lg")
    public static int[] field441 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ll")
    public static int field458 = 0;

    @ObfuscatedName("client.lt")
    public static int field330 = 0;

    @ObfuscatedName("client.ly")
    public static long[] field460 = new long[100];

    @ObfuscatedName("client.lz")
    public static int field292 = 0;

    @ObfuscatedName("client.lv")
    public static int field501 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field267 = new int[128];

    @ObfuscatedName("client.ln")
    public static int[] field382 = new int[128];

    @ObfuscatedName("client.lf")
    public static long field465 = -1L;

    @ObfuscatedName("client.lw")
    public static String field466 = null;

    @ObfuscatedName("client.ld")
    public static String field467 = null;

    @ObfuscatedName("client.md")
    public static int field318 = -1;

    @ObfuscatedName("client.me")
    public static int field394 = 0;

    @ObfuscatedName("client.mw")
    public static int[] field286 = new int[1000];

    @ObfuscatedName("client.mp")
    public static int[] field397 = new int[1000];

    @ObfuscatedName("client.ms")
    public static class72[] field472 = new class72[1000];

    @ObfuscatedName("client.ma")
    public static int field344 = 0;

    @ObfuscatedName("client.mc")
    public static int field474 = 0;

    @ObfuscatedName("client.mv")
    public static int field475 = 0;

    @ObfuscatedName("client.mg")
    public static int field414 = 255;

    @ObfuscatedName("client.mr")
    public static int field477 = -1;

    @ObfuscatedName("client.ml")
    public static boolean field478 = false;

    @ObfuscatedName("client.mb")
    public static int field454 = 127;

    @ObfuscatedName("client.my")
    public static int field251 = 127;

    @ObfuscatedName("client.nn")
    public static int field482 = 0;

    @ObfuscatedName("client.nl")
    public static int[] field483 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field484 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field485 = new int[50];

    @ObfuscatedName("client.na")
    public static int[] field486 = new int[50];

    @ObfuscatedName("client.ny")
    public static class52[] field487 = new class52[50];

    @ObfuscatedName("client.nc")
    public static boolean field488 = false;

    @ObfuscatedName("client.ng")
    public static boolean[] field402 = new boolean[5];

    @ObfuscatedName("client.nk")
    public static int[] field490 = new int[5];

    @ObfuscatedName("client.nw")
    public static int[] field491 = new int[5];

    @ObfuscatedName("client.nb")
    public static int[] field492 = new int[5];

    @ObfuscatedName("client.nr")
    public static int[] field493 = new int[5];

    @ObfuscatedName("client.nz")
    public static int field361 = 0;

    @ObfuscatedName("client.nt")
    public static int field495 = 0;

    @ObfuscatedName("client.ob")
    public static class16[] field315 = new class16[400];

    @ObfuscatedName("client.oy")
    public static class173 field497 = new class173();

    @ObfuscatedName("client.oh")
    public static int field498 = 0;

    @ObfuscatedName("client.od")
    public static class8[] field464 = new class8[400];

    @ObfuscatedName("client.ou")
    public static class157 field500 = new class157();

    @ObfuscatedName("client.oo")
    public static int field427 = -1;

    @ObfuscatedName("client.on")
    public static int field317 = -1;

    @ObfuscatedName("client.a(I)V")
    public final void method211() {
    }

    public final void init() {
        if (!this.method2603()) {
            return;
        }
        class168[] var1 = class168.method2064();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class168 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2809);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2809)) {
                    case 1:
                        Statics.field247 = class138.method2586(Integer.parseInt(var4));
                        break;
                    case 2:
                        field246 = Integer.parseInt(var4);
                        break;
                    case 3:
                        field248 = Integer.parseInt(var4);
                        break;
                    case 4:
                        class139[] var5 = new class139[] { class139.field2111, class139.field2113, class139.field2108, class139.field2107, class139.field2109, class139.field2106 };
                        Statics.field2394 = (class139) Statics.method720(var5, Integer.parseInt(var4));
                        if (Statics.field2394 == class139.field2111) {
                            Statics.field1222 = class188.field2881;
                        } else {
                            Statics.field1222 = class188.field2880;
                        }
                        break;
                    case 5:
                        Statics.field160 = var4;
                        break;
                    case 6:
                        if (var4.equalsIgnoreCase(class2.field30)) {
                            field249 = true;
                        } else {
                            field249 = false;
                        }
                        break;
                    case 7:
                        field245 = Integer.parseInt(var4);
                    case 8:
                    default:
                        break;
                    case 9:
                        if (var4.equalsIgnoreCase(class2.field30)) {
                        }
                        break;
                    case 10:
                        field283 = Integer.parseInt(var4);
                }
            }
        }
        class79.field1380 = false;
        field250 = false;
        Statics.field1742 = this.getCodeBase().getHost();
        String var6 = Statics.field247.field2101;
        byte var7 = 0;
        try {
            class136.method2665("oldschool", var6, var7, 16);
        } catch (Exception var9) {
            class135.method2452((String) null, var9);
        }
        Statics.field243 = this;
        this.method2602(765, 503, 50);
    }

    @ObfuscatedName("client.i(B)V")
    public final void method394() {
        Statics.field1235 = field248 == 0 ? 43594 : field245 + 40000;
        Statics.field202 = field248 == 0 ? 443 : field245 + 50000;
        Statics.field2489 = Statics.field1235;
        Statics.field2663 = class153.field2642;
        Statics.field2128 = class153.field2640;
        Statics.field1251 = class153.field2643;
        Statics.field2656 = class153.field2641;
        if (Statics.field1927.toLowerCase().indexOf("microsoft") == -1) {
            class124.field1958[44] = 71;
            class124.field1958[45] = 26;
            class124.field1958[46] = 72;
            class124.field1958[47] = 73;
            class124.field1958[59] = 57;
            class124.field1958[61] = 27;
            class124.field1958[91] = 42;
            class124.field1958[92] = 74;
            class124.field1958[93] = 43;
            class124.field1958[192] = 28;
            class124.field1958[222] = 58;
            class124.field1958[520] = 59;
        } else {
            class124.field1958[186] = 57;
            class124.field1958[187] = 27;
            class124.field1958[188] = 71;
            class124.field1958[189] = 26;
            class124.field1958[190] = 72;
            class124.field1958[191] = 73;
            class124.field1958[192] = 58;
            class124.field1958[219] = 42;
            class124.field1958[220] = 74;
            class124.field1958[221] = 43;
            class124.field1958[222] = 59;
            class124.field1958[223] = 28;
        }
        class124.method39(Statics.field2676);
        class127.method580(Statics.field2676);
        Statics.field214 = class118.method2077();
        if (Statics.field214 != null) {
            Statics.field214.method2436(Statics.field2676);
        }
        Statics.field149 = new class121(255, class136.field2078, class136.field2079, 500000);
        class193 var1 = null;
        class9 var2 = new class9();
        try {
            var1 = Statics.method1854("", Statics.field2394.field2112, false);
            byte[] var3 = new byte[(int) var1.method3454()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method3444(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class9(new class107(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method3437();
            }
        } catch (Exception var9) {
        }
        Statics.field57 = var2;
        Statics.field174 = this.getToolkit().getSystemClipboard();
        class125.method3144(this, Statics.field1874);
        if (field248 != 0) {
            field260 = true;
        }
    }

    @ObfuscatedName("client.b(I)V")
    public final void method176() {
        field386++;
        this.method184();
        while (true) {
            class177 var1 = class149.field2477;
            class148 var2;
            synchronized (class149.field2477) {
                var2 = (class148) class149.field2476.method3258();
            }
            if (var2 == null) {
                class161.method2883();
                method108();
                class124.method498();
                class127.method766();
                if (Statics.field214 != null) {
                    int var4 = Statics.field214.method2438();
                    field442 = var4;
                }
                if (field252 == 0) {
                    method1881();
                    class131.method827();
                } else if (field252 == 5) {
                    class28.method153(this);
                    method1881();
                    class131.method827();
                } else if (field252 == 10 || field252 == 11) {
                    class28.method153(this);
                } else if (field252 == 20) {
                    class28.method153(this);
                    method2388();
                } else if (field252 == 25) {
                    method2671();
                }
                if (field252 == 30) {
                    if (field471 > 1) {
                        field471--;
                    }
                    if (field321 > 0) {
                        field321--;
                    }
                    if (field304) {
                        field304 = false;
                        method125();
                    } else {
                        if (!field387) {
                            field393[0] = class142.field2341;
                            field503[0] = "";
                            field391[0] = 1006;
                            field388 = 1;
                        }
                        for (int var5 = 0; var5 < 100 && method74(); var5++) {
                        }
                        if (field252 == 30) {
                            Statics.method473(field285, 220);
                            Object var6 = Statics.field2910.field170;
                            synchronized (Statics.field2910.field170) {
                                if (!field325) {
                                    Statics.field2910.field171 = 0;
                                } else if (class127.field1996 != 0 || Statics.field2910.field171 >= 40) {
                                    field285.method2364(197);
                                    field285.method2108(0);
                                    int var7 = field285.field1819;
                                    int var8 = 0;
                                    for (int var9 = 0; var9 < Statics.field2910.field171 && field285.field1819 - var7 < 240; var9++) {
                                        var8++;
                                        int var10 = Statics.field2910.field175[var9];
                                        if (var10 < 0) {
                                            var10 = 0;
                                        } else if (var10 > 502) {
                                            var10 = 502;
                                        }
                                        int var11 = Statics.field2910.field172[var9];
                                        if (var11 < 0) {
                                            var11 = 0;
                                        } else if (var11 > 764) {
                                            var11 = 764;
                                        }
                                        int var12 = var10 * 765 + var11;
                                        if (Statics.field2910.field175[var9] == -1 && Statics.field2910.field172[var9] == -1) {
                                            var11 = -1;
                                            var10 = -1;
                                            var12 = 524287;
                                        }
                                        if (field256 != var11 || field257 != var10) {
                                            int var13 = var11 - field256;
                                            field256 = var11;
                                            int var14 = var10 - field257;
                                            field257 = var10;
                                            if (field469 < 8 && var13 >= -32 && var13 <= 31 && var14 >= -32 && var14 <= 31) {
                                                var13 += 32;
                                                var14 += 32;
                                                field285.method2109((field469 << 12) + (var13 << 6) + var14);
                                                field469 = 0;
                                            } else if (field469 < 8) {
                                                field285.method2276((field469 << 19) + 8388608 + var12);
                                                field469 = 0;
                                            } else {
                                                field285.method2111((field469 << 19) + -1073741824 + var12);
                                                field469 = 0;
                                            }
                                        } else if (field469 < 2047) {
                                            field469++;
                                        }
                                    }
                                    field285.method2119(field285.field1819 - var7);
                                    if (var8 >= Statics.field2910.field171) {
                                        Statics.field2910.field171 = 0;
                                    } else {
                                        Statics.field2910.field171 -= var8;
                                        for (int var15 = 0; var15 < Statics.field2910.field171; var15++) {
                                            Statics.field2910.field172[var15] = Statics.field2910.field172[var8 + var15];
                                            Statics.field2910.field175[var15] = Statics.field2910.field175[var8 + var15];
                                        }
                                    }
                                }
                            }
                            if (class127.field1996 == 1 || !Statics.field2015 && class127.field1996 == 4 || class127.field1996 == 2) {
                                long var17 = (class127.field1984 - field255 * -1L) / 50L;
                                if (var17 > 4095L) {
                                    var17 = 4095L;
                                }
                                field255 = class127.field1984 * -1L;
                                int var19 = class127.field2002;
                                if (var19 < 0) {
                                    var19 = 0;
                                } else if (var19 > 502) {
                                    var19 = 502;
                                }
                                int var20 = class127.field1995;
                                if (var20 < 0) {
                                    var20 = 0;
                                } else if (var20 > 764) {
                                    var20 = 764;
                                }
                                int var21 = var19 * 765 + var20;
                                byte var22 = 0;
                                if (class127.field1996 == 2) {
                                    var22 = 1;
                                }
                                int var23 = (int) var17;
                                field285.method2364(44);
                                field285.method2111((var22 << 19) + (var23 << 20) + var21);
                            }
                            if (class124.field1950 > 0) {
                                field285.method2364(75);
                                field285.method2109(0);
                                int var24 = field285.field1819;
                                long var25 = class103.method26();
                                for (int var27 = 0; var27 < class124.field1950; var27++) {
                                    long var28 = var25 - field465;
                                    if (var28 > 16777215L) {
                                        var28 = 16777215L;
                                    }
                                    field465 = var25;
                                    field285.method2158((int) var28);
                                    field285.method2144(class124.field1955[var27]);
                                }
                                field285.method2232(field285.field1819 - var24);
                            }
                            if (field334 > 0) {
                                field334--;
                            }
                            if (class124.field1946[96] || class124.field1946[97] || class124.field1946[98] || class124.field1946[99]) {
                                field335 = true;
                            }
                            if (field335 && field334 <= 0) {
                                field334 = 20;
                                field335 = false;
                                field285.method2364(83);
                                field285.method2152(field424);
                                field285.method2152(field346);
                            }
                            if (Statics.field1821 && !field259) {
                                field259 = true;
                                field285.method2364(156);
                                field285.method2108(1);
                            }
                            if (!Statics.field1821 && field259) {
                                field259 = false;
                                field285.method2364(156);
                                field285.method2108(0);
                            }
                            method30();
                            if (field252 == 30) {
                                for (class15 var30 = (class15) field452.method3232(); var30 != null; var30 = (class15) field452.method3251()) {
                                    if (var30.field212 > 0) {
                                        var30.field212--;
                                    }
                                    if (var30.field212 == 0) {
                                        if (var30.field200 >= 0) {
                                            int var31 = var30.field200;
                                            int var32 = var30.field197;
                                            class36 var33 = class36.method167(var31);
                                            if (var32 == 11) {
                                                var32 = 10;
                                            }
                                            if (var32 >= 5 && var32 <= 8) {
                                                var32 = 4;
                                            }
                                            boolean var34 = var33.method630(var32);
                                            if (!var34) {
                                                continue;
                                            }
                                        }
                                        method145(var30.field210, var30.field211, var30.field198, var30.field199, var30.field200, var30.field201, var30.field197);
                                        var30.method3311();
                                    } else {
                                        if (var30.field206 > 0) {
                                            var30.field206--;
                                        }
                                        if (var30.field206 == 0 && var30.field198 >= 1 && var30.field199 >= 1 && var30.field198 <= 102 && var30.field199 <= 102) {
                                            if (var30.field208 >= 0) {
                                                int var35 = var30.field208;
                                                int var36 = var30.field205;
                                                class36 var37 = class36.method167(var35);
                                                if (var36 == 11) {
                                                    var36 = 10;
                                                }
                                                if (var36 >= 5 && var36 <= 8) {
                                                    var36 = 4;
                                                }
                                                boolean var38 = var37.method630(var36);
                                                if (!var38) {
                                                    continue;
                                                }
                                            }
                                            method145(var30.field210, var30.field211, var30.field198, var30.field199, var30.field208, var30.field204, var30.field205);
                                            var30.field206 = -1;
                                            if (var30.field208 == var30.field200 && var30.field200 == -1) {
                                                var30.method3311();
                                            } else if (var30.field208 == var30.field200 && var30.field204 == var30.field201 && var30.field205 == var30.field197) {
                                                var30.method3311();
                                            }
                                        }
                                    }
                                }
                                int var10002;
                                for (int var39 = 0; var39 < field482; var39++) {
                                    var10002 = field485[var39]--;
                                    if (field485[var39] >= -10) {
                                        class52 var41 = field487[var39];
                                        if (var41 == null) {
                                            class52 var10000 = (class52) null;
                                            var41 = class52.method1008(Statics.field2105, field483[var39], 0);
                                            if (var41 == null) {
                                                continue;
                                            }
                                            field485[var39] += var41.method1014();
                                            field487[var39] = var41;
                                        }
                                        if (field485[var39] < 0) {
                                            int var48;
                                            if (field486[var39] == 0) {
                                                var48 = field454;
                                            } else {
                                                int var42 = (field486[var39] & 0xFF) * 128;
                                                int var43 = field486[var39] >> 16 & 0xFF;
                                                int var44 = var43 * 128 + 64 - Statics.field1669.field700;
                                                if (var44 < 0) {
                                                    var44 = -var44;
                                                }
                                                int var45 = field486[var39] >> 8 & 0xFF;
                                                int var46 = var45 * 128 + 64 - Statics.field1669.field726;
                                                if (var46 < 0) {
                                                    var46 = -var46;
                                                }
                                                int var47 = var44 + var46 - 128;
                                                if (var47 > var42) {
                                                    field485[var39] = -100;
                                                    continue;
                                                }
                                                if (var47 < 0) {
                                                    var47 = 0;
                                                }
                                                var48 = field251 * (var42 - var47) / var42;
                                            }
                                            if (var48 > 0) {
                                                class56 var49 = var41.method1009().method1047(Statics.field1963);
                                                class58 var50 = class58.method1160(var49, 100, var48);
                                                var50.method1073(field484[var39] - 1);
                                                Statics.field461.method936(var50);
                                            }
                                            field485[var39] = -100;
                                        }
                                    } else {
                                        field482--;
                                        for (int var40 = var39; var40 < field482; var40++) {
                                            field483[var40] = field483[var40 + 1];
                                            field487[var40] = field487[var40 + 1];
                                            field484[var40] = field484[var40 + 1];
                                            field485[var40] = field485[var40 + 1];
                                            field486[var40] = field486[var40 + 1];
                                        }
                                        var39--;
                                    }
                                }
                                if (field478) {
                                    boolean var51;
                                    if (class161.field2699 == 0) {
                                        var51 = Statics.field1882.method3042();
                                    } else {
                                        var51 = true;
                                    }
                                    if (!var51) {
                                        if (field414 != 0 && field477 != -1) {
                                            class161.method2945(Statics.field2706, field477, 0, field414, false);
                                        }
                                        field478 = false;
                                    }
                                }
                                field290++;
                                if (field290 > 750) {
                                    method125();
                                } else {
                                    for (int var52 = -1; var52 < field365; var52++) {
                                        int var53;
                                        if (var52 == -1) {
                                            var53 = 2047;
                                        } else {
                                            var53 = field366[var52];
                                        }
                                        class3 var54 = field364[var53];
                                        if (var54 != null) {
                                            method2401(var54, 1);
                                        }
                                    }
                                    for (int var55 = 0; var55 < field440; var55++) {
                                        int var56 = field363[var55];
                                        class30 var57 = field376[var56];
                                        if (var57 != null) {
                                            method2401(var57, var57.field664.field790);
                                        }
                                    }
                                    for (int var58 = -1; var58 < field365; var58++) {
                                        int var59;
                                        if (var58 == -1) {
                                            var59 = 2047;
                                        } else {
                                            var59 = field366[var58];
                                        }
                                        class3 var60 = field364[var59];
                                        if (var60 != null && var60.field712 > 0) {
                                            var60.field712--;
                                            if (var60.field712 == 0) {
                                                var60.field710 = null;
                                            }
                                        }
                                    }
                                    for (int var61 = 0; var61 < field440; var61++) {
                                        int var62 = field363[var61];
                                        class30 var63 = field376[var62];
                                        if (var63 != null && var63.field712 > 0) {
                                            var63.field712--;
                                            if (var63.field712 == 0) {
                                                var63.field710 = null;
                                            }
                                        }
                                    }
                                    field265++;
                                    if (field354 != 0) {
                                        field353 += 20;
                                        if (field353 >= 400) {
                                            field354 = 0;
                                        }
                                    }
                                    if (Statics.field2102 != null) {
                                        field276++;
                                        if (field276 >= 15) {
                                            method151(Statics.field2102);
                                            Statics.field2102 = null;
                                        }
                                    }
                                    class152 var64 = Statics.field661;
                                    class152 var65 = Statics.field240;
                                    Statics.field661 = null;
                                    Statics.field240 = null;
                                    field421 = null;
                                    field425 = false;
                                    field320 = false;
                                    field501 = 0;
                                    while (true) {
                                        while (class124.method90() && field501 < 128) {
                                            if (field476 >= 2 && class124.field1946[82] && Statics.field1425 == 66) {
                                                String var66 = "";
                                                Iterator var67 = class10.field145.iterator();
                                                while (var67.hasNext()) {
                                                    class31 var68 = (class31) var67.next();
                                                    var66 = var66 + var68.field671 + ':' + var68.field673 + '\n';
                                                }
                                                Statics.field174.setContents(new StringSelection(var66), (ClipboardOwner) null);
                                            } else {
                                                field382[field501] = Statics.field1425;
                                                field267[field501] = Statics.field1026;
                                                field501++;
                                            }
                                        }
                                        int var71 = field381;
                                        if (class152.method2525(var71)) {
                                            method1975(Statics.field2574[var71], -1, 0, 0, 765, 503, 0, 0);
                                        }
                                        field462++;
                                        while (true) {
                                            class1 var72;
                                            class152 var73;
                                            class152 var74;
                                            do {
                                                var72 = (class1) field494.method3258();
                                                if (var72 == null) {
                                                    while (true) {
                                                        class1 var75;
                                                        class152 var76;
                                                        class152 var77;
                                                        do {
                                                            var75 = (class1) field445.method3258();
                                                            if (var75 == null) {
                                                                while (true) {
                                                                    class1 var78;
                                                                    class152 var79;
                                                                    class152 var80;
                                                                    do {
                                                                        var78 = (class1) field443.method3258();
                                                                        if (var78 == null) {
                                                                            method147();
                                                                            if (Statics.field29 == null && field417 == null) {
                                                                                int var81 = class127.field1996;
                                                                                if (field387) {
                                                                                    if (var81 != 1 && (Statics.field2015 || var81 != 4)) {
                                                                                        int var82 = class127.field1988;
                                                                                        int var83 = class127.field1989 * -632739763;
                                                                                        if (var82 < Statics.field209 - 10 || var82 > Statics.field209 + Statics.field147 + 10 || var83 < Statics.field21 - 10 || var83 > Statics.field2864 + Statics.field21 + 10) {
                                                                                            field387 = false;
                                                                                            method2321(Statics.field209, Statics.field21, Statics.field147, Statics.field2864);
                                                                                        }
                                                                                    }
                                                                                    if (var81 == 1 || !Statics.field2015 && var81 == 4) {
                                                                                        int var84 = Statics.field209;
                                                                                        int var85 = Statics.field21;
                                                                                        int var86 = Statics.field147;
                                                                                        int var87 = class127.field1995;
                                                                                        int var88 = class127.field2002;
                                                                                        int var89 = -1;
                                                                                        for (int var90 = 0; var90 < field388; var90++) {
                                                                                            int var91 = (field388 - 1 - var90) * 15 + var85 + 31;
                                                                                            if (var87 > var84 && var87 < var84 + var86 && var88 > var91 - 13 && var88 < var91 + 3) {
                                                                                                var89 = var90;
                                                                                            }
                                                                                        }
                                                                                        if (var89 != -1) {
                                                                                            method2420(var89);
                                                                                        }
                                                                                        field387 = false;
                                                                                        method2321(Statics.field209, Statics.field21, Statics.field147, Statics.field2864);
                                                                                    }
                                                                                } else {
                                                                                    label1280: {
                                                                                        int var93;
                                                                                        int var94;
                                                                                        label1318: {
                                                                                            if ((var81 == 1 || !Statics.field2015 && var81 == 4) && field388 > 0) {
                                                                                                int var92 = field391[field388 - 1];
                                                                                                if (var92 == 39 || var92 == 40 || var92 == 41 || var92 == 42 || var92 == 43 || var92 == 33 || var92 == 34 || var92 == 35 || var92 == 36 || var92 == 37 || var92 == 38 || var92 == 1005) {
                                                                                                    var93 = field389[field388 - 1];
                                                                                                    var94 = field390[field388 - 1];
                                                                                                    class152 var95 = class152.method124(var94);
                                                                                                    int var96 = method474(var95);
                                                                                                    boolean var97 = (var96 >> 28 & 0x1) != 0;
                                                                                                    if (var97) {
                                                                                                        break label1318;
                                                                                                    }
                                                                                                    int var98 = method474(var95);
                                                                                                    boolean var99 = (var98 >> 29 & 0x1) != 0;
                                                                                                    if (var99) {
                                                                                                        break label1318;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (var81 == 1 || !Statics.field2015 && var81 == 4) {
                                                                                                label1316: {
                                                                                                    if (field380 != 1 || field388 <= 2) {
                                                                                                        int var106 = field388 - 1;
                                                                                                        boolean var107;
                                                                                                        if (var106 < 0) {
                                                                                                            var107 = false;
                                                                                                        } else {
                                                                                                            int var108 = field391[var106];
                                                                                                            if (var108 >= 2000) {
                                                                                                                var108 -= 2000;
                                                                                                            }
                                                                                                            if (var108 == 1007) {
                                                                                                                var107 = true;
                                                                                                            } else {
                                                                                                                var107 = false;
                                                                                                            }
                                                                                                        }
                                                                                                        if (!var107) {
                                                                                                            break label1316;
                                                                                                        }
                                                                                                    }
                                                                                                    var81 = 2;
                                                                                                }
                                                                                            }
                                                                                            if ((var81 == 1 || !Statics.field2015 && var81 == 4) && field388 > 0) {
                                                                                                method2420(field388 - 1);
                                                                                            }
                                                                                            if (var81 == 2 && field388 > 0) {
                                                                                                method142(class127.field1995, class127.field2002);
                                                                                            }
                                                                                            break label1280;
                                                                                        }
                                                                                        if (Statics.field29 != null && !field480 && field380 != 1) {
                                                                                            int var100 = field388 - 1;
                                                                                            boolean var101;
                                                                                            if (var100 < 0) {
                                                                                                var101 = false;
                                                                                            } else {
                                                                                                int var102 = field391[var100];
                                                                                                if (var102 >= 2000) {
                                                                                                    var102 -= 2000;
                                                                                                }
                                                                                                if (var102 == 1007) {
                                                                                                    var101 = true;
                                                                                                } else {
                                                                                                    var101 = false;
                                                                                                }
                                                                                            }
                                                                                            if (!var101 && field388 > 0) {
                                                                                                int var103 = field358;
                                                                                                int var104 = field359;
                                                                                                method625(Statics.field128, var103, var104);
                                                                                                Statics.field128 = null;
                                                                                            }
                                                                                        }
                                                                                        field480 = false;
                                                                                        field284 = 0;
                                                                                        if (Statics.field29 != null) {
                                                                                            method151(Statics.field29);
                                                                                        }
                                                                                        Statics.field29 = class152.method124(var94);
                                                                                        field377 = var93;
                                                                                        field358 = class127.field1995;
                                                                                        field359 = class127.field2002;
                                                                                        if (field388 > 0) {
                                                                                            int var105 = field388 - 1;
                                                                                            Statics.field128 = new class27();
                                                                                            Statics.field128.field608 = field389[var105];
                                                                                            Statics.field128.field604 = field390[var105];
                                                                                            Statics.field128.field609 = field391[var105];
                                                                                            Statics.field128.field606 = field502[var105];
                                                                                            Statics.field128.field607 = field393[var105];
                                                                                        }
                                                                                        method151(Statics.field29);
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field417 != null) {
                                                                                method151(field417);
                                                                                Statics.field864++;
                                                                                if (field425 && field320) {
                                                                                    int var109 = class127.field1988;
                                                                                    int var110 = class127.field1989 * -632739763;
                                                                                    int var111 = var109 - field419;
                                                                                    int var112 = var110 - field420;
                                                                                    if (var111 < field423) {
                                                                                        var111 = field423;
                                                                                    }
                                                                                    if (field417.field2531 + var111 > field423 + field418.field2531) {
                                                                                        var111 = field423 + field418.field2531 - field417.field2531;
                                                                                    }
                                                                                    if (var112 < field403) {
                                                                                        var112 = field403;
                                                                                    }
                                                                                    if (field417.field2584 + var112 > field403 + field418.field2584) {
                                                                                        var112 = field403 + field418.field2584 - field417.field2584;
                                                                                    }
                                                                                    int var113 = var111 - field426;
                                                                                    int var114 = var112 - field481;
                                                                                    int var115 = field417.field2585;
                                                                                    if (Statics.field864 > field417.field2586 && (var113 > var115 || var113 < -var115 || var114 > var115 || var114 < -var115)) {
                                                                                        field428 = true;
                                                                                    }
                                                                                    int var116 = field418.field2535 + (var111 - field423);
                                                                                    int var117 = field418.field2536 + (var112 - field403);
                                                                                    if (field417.field2598 != null && field428) {
                                                                                        class1 var118 = new class1();
                                                                                        var118.field19 = field417;
                                                                                        var118.field4 = var116;
                                                                                        var118.field5 = var117;
                                                                                        var118.field10 = field417.field2598;
                                                                                        Statics.method562(var118);
                                                                                    }
                                                                                    if (class127.field1987 == 0) {
                                                                                        if (field428) {
                                                                                            if (field417.field2599 != null) {
                                                                                                class1 var119 = new class1();
                                                                                                var119.field19 = field417;
                                                                                                var119.field4 = var116;
                                                                                                var119.field5 = var117;
                                                                                                var119.field14 = field421;
                                                                                                var119.field10 = field417.field2599;
                                                                                                Statics.method562(var119);
                                                                                            }
                                                                                            if (field421 != null) {
                                                                                                class152 var120 = field417;
                                                                                                int var121 = class156.method1974(method474(var120));
                                                                                                class152 var122;
                                                                                                if (var121 == 0) {
                                                                                                    var122 = null;
                                                                                                } else {
                                                                                                    int var123 = 0;
                                                                                                    while (true) {
                                                                                                        if (var123 >= var121) {
                                                                                                            var122 = var120;
                                                                                                            break;
                                                                                                        }
                                                                                                        var120 = class152.method124(var120.field2533);
                                                                                                        if (var120 == null) {
                                                                                                            var122 = null;
                                                                                                            break;
                                                                                                        }
                                                                                                        var123++;
                                                                                                    }
                                                                                                }
                                                                                                if (var122 != null) {
                                                                                                    field285.method2364(106);
                                                                                                    field285.method2151(field417.field2568);
                                                                                                    field285.method2162(field417.field2559);
                                                                                                    field285.method2151(field421.field2568);
                                                                                                    field285.method2259(field421.field2559);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            label838: {
                                                                                                label837: {
                                                                                                    if (field380 != 1) {
                                                                                                        int var124 = field388 - 1;
                                                                                                        boolean var125;
                                                                                                        if (var124 < 0) {
                                                                                                            var125 = false;
                                                                                                        } else {
                                                                                                            int var126 = field391[var124];
                                                                                                            if (var126 >= 2000) {
                                                                                                                var126 -= 2000;
                                                                                                            }
                                                                                                            if (var126 == 1007) {
                                                                                                                var125 = true;
                                                                                                            } else {
                                                                                                                var125 = false;
                                                                                                            }
                                                                                                        }
                                                                                                        if (!var125) {
                                                                                                            break label837;
                                                                                                        }
                                                                                                    }
                                                                                                    if (field388 > 2) {
                                                                                                        method142(field426 + field419, field481 + field420);
                                                                                                        break label838;
                                                                                                    }
                                                                                                }
                                                                                                if (field388 > 0) {
                                                                                                    int var127 = field426 + field419;
                                                                                                    int var128 = field481 + field420;
                                                                                                    method625(Statics.field128, var127, var128);
                                                                                                    Statics.field128 = null;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        field417 = null;
                                                                                    }
                                                                                } else if (Statics.field864 > 1) {
                                                                                    field417 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field29 != null) {
                                                                                method151(Statics.field29);
                                                                                field284++;
                                                                                if (class127.field1987 == 0) {
                                                                                    if (!field480) {
                                                                                        label794: {
                                                                                            label793: {
                                                                                                if (field380 != 1) {
                                                                                                    int var137 = field388 - 1;
                                                                                                    boolean var138;
                                                                                                    if (var137 < 0) {
                                                                                                        var138 = false;
                                                                                                    } else {
                                                                                                        int var139 = field391[var137];
                                                                                                        if (var139 >= 2000) {
                                                                                                            var139 -= 2000;
                                                                                                        }
                                                                                                        if (var139 == 1007) {
                                                                                                            var138 = true;
                                                                                                        } else {
                                                                                                            var138 = false;
                                                                                                        }
                                                                                                    }
                                                                                                    if (!var138) {
                                                                                                        break label793;
                                                                                                    }
                                                                                                }
                                                                                                if (field388 > 2) {
                                                                                                    method142(field358, field359);
                                                                                                    break label794;
                                                                                                }
                                                                                            }
                                                                                            if (field388 > 0) {
                                                                                                int var140 = field358;
                                                                                                int var141 = field359;
                                                                                                method625(Statics.field128, var140, var141);
                                                                                                Statics.field128 = null;
                                                                                            }
                                                                                        }
                                                                                    } else if (Statics.field29 == Statics.field1426 && field377 != field360) {
                                                                                        class152 var129 = Statics.field29;
                                                                                        byte var130 = 0;
                                                                                        if (field408 == 1 && var129.field2526 == 206) {
                                                                                            var130 = 1;
                                                                                        }
                                                                                        if (var129.field2624[field360] <= 0) {
                                                                                            var130 = 0;
                                                                                        }
                                                                                        int var131 = method474(var129);
                                                                                        boolean var132 = (var131 >> 29 & 0x1) != 0;
                                                                                        if (var132) {
                                                                                            int var133 = field377;
                                                                                            int var134 = field360;
                                                                                            var129.field2624[var134] = var129.field2624[var133];
                                                                                            var129.field2573[var134] = var129.field2573[var133];
                                                                                            var129.field2624[var133] = -1;
                                                                                            var129.field2573[var133] = 0;
                                                                                        } else if (var130 == 1) {
                                                                                            int var135 = field377;
                                                                                            int var136 = field360;
                                                                                            while (var135 != var136) {
                                                                                                if (var135 > var136) {
                                                                                                    var129.method2840(var135 - 1, var135);
                                                                                                    var135--;
                                                                                                } else if (var135 < var136) {
                                                                                                    var129.method2840(var135 + 1, var135);
                                                                                                    var135++;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            var129.method2840(field360, field377);
                                                                                        }
                                                                                        field285.method2364(242);
                                                                                        field285.method2153(field377);
                                                                                        field285.method2143(var130);
                                                                                        field285.method2109(field360);
                                                                                        field285.method2111(Statics.field29.field2559);
                                                                                    }
                                                                                    field276 = 10;
                                                                                    class127.field1996 = 0;
                                                                                    Statics.field29 = null;
                                                                                } else if (field284 >= 5 && (class127.field1988 > field358 + 5 || class127.field1988 < field358 - 5 || class127.field1989 * -632739763 > field359 + 5 || class127.field1989 * -632739763 < field359 - 5)) {
                                                                                    field480 = true;
                                                                                }
                                                                            }
                                                                            if (class79.field1365 != -1) {
                                                                                int var142 = class79.field1365;
                                                                                int var143 = class79.field1361;
                                                                                field285.method2364(124);
                                                                                field285.method2108(5);
                                                                                field285.method2153(Statics.field919 + var143);
                                                                                field285.method2108(class124.field1946[82] ? (class124.field1946[81] ? 2 : 1) : 0);
                                                                                field285.method2152(Statics.field928 + var142);
                                                                                class79.field1365 = -1;
                                                                                field351 = class127.field1995;
                                                                                field352 = class127.field2002;
                                                                                field354 = 1;
                                                                                field353 = 0;
                                                                                field344 = var142;
                                                                                field474 = var143;
                                                                            }
                                                                            if (Statics.field661 != var64) {
                                                                                if (var64 != null) {
                                                                                    method151(var64);
                                                                                }
                                                                                if (Statics.field661 != null) {
                                                                                    method151(Statics.field661);
                                                                                }
                                                                            }
                                                                            if (Statics.field240 != var65 && field431 == field242) {
                                                                                if (var65 != null) {
                                                                                    method151(var65);
                                                                                }
                                                                                if (Statics.field240 != null) {
                                                                                    method151(Statics.field240);
                                                                                }
                                                                            }
                                                                            if (Statics.field240 == null) {
                                                                                if (field431 > 0) {
                                                                                    field431--;
                                                                                }
                                                                            } else if (field431 < field242) {
                                                                                field431++;
                                                                                if (field431 == field242) {
                                                                                    method151(Statics.field240);
                                                                                }
                                                                            }
                                                                            method126();
                                                                            if (field488) {
                                                                                method2685();
                                                                            }
                                                                            for (int var144 = 0; var144 < 5; var144++) {
                                                                                var10002 = field493[var144]++;
                                                                            }
                                                                            int var145 = ++class127.field1982 - 1;
                                                                            int var147 = class124.method2387();
                                                                            if (var145 > 15000 && var147 > 15000) {
                                                                                field321 = 250;
                                                                                class127.field1982 = 14500;
                                                                                field285.method2364(12);
                                                                            }
                                                                            field314++;
                                                                            if (field314 > 500) {
                                                                                field314 = 0;
                                                                                int var148 = (int) (Math.random() * 8.0D);
                                                                                if ((var148 & 0x1) == 1) {
                                                                                    field378 += field309;
                                                                                }
                                                                                if ((var148 & 0x2) == 2) {
                                                                                    field310 += field311;
                                                                                }
                                                                                if ((var148 & 0x4) == 4) {
                                                                                    field312 += field313;
                                                                                }
                                                                            }
                                                                            if (field378 < -50) {
                                                                                field309 = 2;
                                                                            }
                                                                            if (field378 > 50) {
                                                                                field309 = -2;
                                                                            }
                                                                            if (field310 < -55) {
                                                                                field311 = 2;
                                                                            }
                                                                            if (field310 > 55) {
                                                                                field311 = -2;
                                                                            }
                                                                            if (field312 < -40) {
                                                                                field313 = 1;
                                                                            }
                                                                            if (field312 > 40) {
                                                                                field313 = -1;
                                                                            }
                                                                            field319++;
                                                                            if (field319 > 500) {
                                                                                field319 = 0;
                                                                                int var149 = (int) (Math.random() * 8.0D);
                                                                                if ((var149 & 0x1) == 1) {
                                                                                    field254 += field324;
                                                                                }
                                                                                if ((var149 & 0x2) == 2) {
                                                                                    field348 += field300;
                                                                                }
                                                                            }
                                                                            if (field254 < -60) {
                                                                                field324 = 2;
                                                                            }
                                                                            if (field254 > 60) {
                                                                                field324 = -2;
                                                                            }
                                                                            if (field348 < -20) {
                                                                                field300 = 1;
                                                                            }
                                                                            if (field348 > 10) {
                                                                                field300 = -1;
                                                                            }
                                                                            for (class34 var150 = (class34) field497.method3189(); var150 != null; var150 = (class34) field497.method3188()) {
                                                                                if ((long) var150.field764 < class103.method26() / 1000L - 5L) {
                                                                                    if (var150.field758 > 0) {
                                                                                        class10.method2425(5, "", var150.field756 + class142.field2278);
                                                                                    }
                                                                                    if (var150.field758 == 0) {
                                                                                        class10.method2425(5, "", var150.field756 + class142.field2279);
                                                                                    }
                                                                                    var150.method3307();
                                                                                }
                                                                            }
                                                                            field291++;
                                                                            if (field291 > 50) {
                                                                                field285.method2364(128);
                                                                            }
                                                                            try {
                                                                                if (Statics.field1670 != null && field285.field1819 > 0) {
                                                                                    Statics.field1670.method2585(field285.field1823, 0, field285.field1819);
                                                                                    field285.field1819 = 0;
                                                                                    field291 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var152) {
                                                                                method125();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var79 = var78.field19;
                                                                        if (var79.field2568 < 0) {
                                                                            break;
                                                                        }
                                                                        var80 = class152.method124(var79.field2533);
                                                                    } while (var80 == null || var80.field2622 == null || var79.field2568 >= var80.field2622.length || var80.field2622[var79.field2568] != var79);
                                                                    Statics.method562(var78);
                                                                }
                                                            }
                                                            var76 = var75.field19;
                                                            if (var76.field2568 < 0) {
                                                                break;
                                                            }
                                                            var77 = class152.method124(var76.field2533);
                                                        } while (var77 == null || var77.field2622 == null || var76.field2568 >= var77.field2622.length || var77.field2622[var76.field2568] != var76);
                                                        Statics.method562(var75);
                                                    }
                                                }
                                                var73 = var72.field19;
                                                if (var73.field2568 < 0) {
                                                    break;
                                                }
                                                var74 = class152.method124(var73.field2533);
                                            } while (var74 == null || var74.field2622 == null || var73.field2568 >= var74.field2622.length || var74.field2622[var73.field2568] != var73);
                                            Statics.method562(var72);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (field252 == 40 || field252 == 45) {
                    method2388();
                }
                return;
            }
            var2.field2467.method2794(var2.field2469, (int) var2.field2857, var2.field2466, false);
        }
    }

    @ObfuscatedName("client.s(I)V")
    public final void method308() {
        boolean var1 = class161.method470();
        if (var1 && field478 && Statics.field164 != null) {
            Statics.field164.method971();
        }
        if (field2050) {
            Canvas var2 = Statics.field2676;
            var2.removeKeyListener(class124.field1960);
            var2.removeFocusListener(class124.field1960);
            class124.field1959 = -1;
            Statics.method2358(Statics.field2676);
            if (Statics.field214 != null) {
                Statics.field214.method2437(Statics.field2676);
            }
            this.method2619();
            class124.method39(Statics.field2676);
            class127.method580(Statics.field2676);
            if (Statics.field214 != null) {
                Statics.field214.method2436(Statics.field2676);
            }
        }
        if (field252 == 0) {
            class131.method2414(class28.field652, class28.field642, (Color) null);
        } else if (field252 == 5) {
            class28.method1400(Statics.field568, Statics.field1550);
        } else if (field252 == 10 || field252 == 11) {
            class28.method1400(Statics.field568, Statics.field1550);
        } else if (field252 == 20) {
            class28.method1400(Statics.field568, Statics.field1550);
        } else if (field252 == 25) {
            if (field302 == 1) {
                if (field298 > field299) {
                    field299 = field298;
                }
                int var3 = (field299 * 50 - field298 * 50) / field299;
                method1874(class142.field2280 + class2.field31 + class2.field24 + var3 + "%" + class2.field27, false);
            } else if (field302 == 2) {
                if (field456 > field301) {
                    field301 = field456;
                }
                int var4 = (field301 * 50 - field456 * 50) / field301 + 50;
                method1874(class142.field2280 + class2.field31 + class2.field24 + var4 + "%" + class2.field27, false);
            } else {
                method1874(class142.field2280, false);
            }
        } else if (field252 == 30) {
            if (field381 != -1) {
                int var5 = field381;
                if (class152.method2525(var5)) {
                    method1(Statics.field2574[var5], -1);
                }
            }
            for (int var6 = 0; var6 < field447; var6++) {
                if (field449[var6]) {
                    field450[var6] = true;
                }
                field451[var6] = field449[var6];
                field449[var6] = false;
            }
            field448 = field386;
            field395 = -1;
            field396 = -1;
            Statics.field1426 = null;
            if (field381 != -1) {
                field447 = 0;
                method1966(field381, 0, 0, 765, 503, 0, 0, -1);
            }
            class73.method1535();
            if (field387) {
                int var7 = Statics.field209;
                int var8 = Statics.field21;
                int var9 = Statics.field147;
                int var10 = Statics.field2864;
                int var11 = 6116423;
                class73.method1508(var7, var8, var9, var10, var11);
                class73.method1508(var7 + 1, var8 + 1, var9 - 2, 16, 0);
                class73.method1510(var7 + 1, var8 + 18, var9 - 2, var10 - 19, 0);
                Statics.field568.method3352(class142.field2284, var7 + 3, var8 + 14, var11, -1);
                int var12 = class127.field1988;
                int var13 = class127.field1989 * -632739763;
                for (int var14 = 0; var14 < field388; var14++) {
                    int var15 = (field388 - 1 - var14) * 15 + var8 + 31;
                    int var16 = 16777215;
                    if (var12 > var7 && var12 < var7 + var9 && var13 > var15 - 13 && var13 < var15 + 3) {
                        var16 = 16776960;
                    }
                    class191 var17 = Statics.field568;
                    String var18;
                    if (field503[var14].length() > 0) {
                        var18 = field393[var14] + class142.field2372 + field503[var14];
                    } else {
                        var18 = field393[var14];
                    }
                    var17.method3352(var18, var7 + 3, var15, var16, 0);
                }
                int var19 = Statics.field209;
                int var20 = Statics.field21;
                int var21 = Statics.field147;
                int var22 = Statics.field2864;
                for (int var23 = 0; var23 < field447; var23++) {
                    if (field463[var23] + field339[var23] > var19 && field463[var23] < var19 + var21 && field455[var23] + field357[var23] > var20 && field357[var23] < var20 + var22) {
                        field450[var23] = true;
                    }
                }
            } else if (field395 != -1) {
                method1772(field395, field396);
            }
            if (field489 == 3) {
                for (int var24 = 0; var24 < field447; var24++) {
                    if (field451[var24]) {
                        class73.method1507(field463[var24], field357[var24], field339[var24], field455[var24], 16711935, 128);
                    } else if (field450[var24]) {
                        class73.method1507(field463[var24], field357[var24], field339[var24], field455[var24], 16711680, 128);
                    }
                }
            }
            int var25 = Statics.field1999;
            int var26 = Statics.field1669.field700;
            int var27 = Statics.field1669.field726;
            int var28 = field265;
            for (class20 var29 = (class20) class20.field528.method3232(); var29 != null; var29 = (class20) class20.field528.method3251()) {
                if (var29.field531 != -1 || var29.field535 != null) {
                    int var30 = 0;
                    if (var26 > var29.field537) {
                        var30 += var26 - var29.field537;
                    } else if (var26 < var29.field526) {
                        var30 += var29.field526 - var26;
                    }
                    if (var27 > var29.field529) {
                        var30 += var27 - var29.field529;
                    } else if (var27 < var29.field527) {
                        var30 += var29.field527 - var27;
                    }
                    if (var30 - 64 > var29.field530 || field251 == 0 || var29.field525 != var25) {
                        if (var29.field532 != null) {
                            Statics.field461.method950(var29.field532);
                            var29.field532 = null;
                        }
                        if (var29.field538 != null) {
                            Statics.field461.method950(var29.field538);
                            var29.field538 = null;
                        }
                    } else {
                        var30 -= 64;
                        if (var30 < 0) {
                            var30 = 0;
                        }
                        int var31 = field251 * (var29.field530 - var30) / var29.field530;
                        class52 var10000;
                        if (var29.field532 != null) {
                            var29.field532.method1074(var31);
                        } else if (var29.field531 >= 0) {
                            var10000 = (class52) null;
                            class52 var32 = class52.method1008(Statics.field2105, var29.field531, 0);
                            if (var32 != null) {
                                class56 var33 = var32.method1009().method1047(Statics.field1963);
                                class58 var34 = class58.method1160(var33, 100, var31);
                                var34.method1073(-1);
                                Statics.field461.method936(var34);
                                var29.field532 = var34;
                            }
                        }
                        if (var29.field538 != null) {
                            var29.field538.method1074(var31);
                            if (!var29.field538.method3312()) {
                                var29.field538 = null;
                            }
                        } else if (var29.field535 != null && (var29.field536 -= var28) <= 0) {
                            int var35 = (int) (Math.random() * (double) var29.field535.length);
                            var10000 = (class52) null;
                            class52 var36 = class52.method1008(Statics.field2105, var29.field535[var35], 0);
                            if (var36 != null) {
                                class56 var37 = var36.method1009().method1047(Statics.field1963);
                                class58 var38 = class58.method1160(var37, 100, var31);
                                var38.method1073(0);
                                Statics.field461.method936(var38);
                                var29.field538 = var38;
                                var29.field536 = var29.field524 + (int) (Math.random() * (double) (var29.field539 - var29.field524));
                            }
                        }
                    }
                }
            }
            field265 = 0;
        } else if (field252 == 40) {
            method1874(class142.field2223 + class2.field31 + class142.field2142, false);
        } else if (field252 == 45) {
            method1874(class142.field2289, false);
        }
        if (field252 == 30 && field489 == 0 && !field2046) {
            try {
                Graphics var39 = Statics.field2676.getGraphics();
                for (int var40 = 0; var40 < field447; var40++) {
                    if (field450[var40]) {
                        Statics.field1631.method1326(var39, field463[var40], field357[var40], field339[var40], field455[var40]);
                        field450[var40] = false;
                    }
                }
            } catch (Exception var46) {
                Statics.field2676.repaint();
            }
        } else if (field252 > 0) {
            try {
                Graphics var42 = Statics.field2676.getGraphics();
                Statics.field1631.method1325(var42, 0, 0);
                field2046 = false;
                for (int var43 = 0; var43 < field447; var43++) {
                    field450[var43] = false;
                }
            } catch (Exception var45) {
                Statics.field2676.repaint();
            }
        }
    }

    @ObfuscatedName("client.q(B)V")
    public final void method183() {
        if (Statics.field2910 != null) {
            Statics.field2910.field173 = false;
        }
        Statics.field2910 = null;
        if (Statics.field1670 != null) {
            Statics.field1670.method2581();
            Statics.field1670 = null;
        }
        if (class124.field1960 != null) {
            class124 var1 = class124.field1960;
            synchronized (class124.field1960) {
                class124.field1960 = null;
            }
        }
        class127.method118();
        Statics.field214 = null;
        if (Statics.field164 != null) {
            Statics.field164.method992();
        }
        if (Statics.field2094 != null) {
            Statics.field2094.method992();
        }
        if (Statics.field2503 != null) {
            Statics.field2503.method2581();
        }
        Object var3 = class149.field2478;
        synchronized (class149.field2478) {
            if (class149.field2480 != 0) {
                class149.field2480 = 1;
                try {
                    class149.field2478.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class136.method2485();
    }

    @ObfuscatedName("ej.p(IB)V")
    public static void method2683(int arg0) {
        if (field252 == arg0) {
            return;
        }
        if (field252 == 0) {
            Statics.field223 = null;
            Statics.field600 = null;
            Statics.field194 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field278 = 0;
            field258 = 0;
            field280 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1786 != null) {
            Statics.field1786.method2581();
            Statics.field1786 = null;
        }
        if (field252 == 25) {
            field302 = 0;
            field298 = 0;
            field299 = 1;
            field456 = 0;
            field301 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method569(Statics.field2676, Statics.field962, Statics.field906, true, 0);
        } else if (arg0 == 20) {
            class28.method569(Statics.field2676, Statics.field962, Statics.field906, true, field252 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method569(Statics.field2676, Statics.field962, Statics.field906, false, 4);
        } else if (Statics.field621) {
            Statics.field614 = null;
            Statics.field623 = null;
            Statics.field616 = null;
            Statics.field66 = null;
            Statics.field624 = null;
            Statics.field618 = null;
            Statics.field512 = null;
            Statics.field639 = null;
            Statics.field627 = null;
            Statics.field2861 = null;
            Statics.field2509 = null;
            Statics.field926 = null;
            Statics.field90 = null;
            Statics.field560 = null;
            Statics.field1904 = null;
            Statics.field166 = null;
            Statics.field2872 = null;
            Statics.field59 = null;
            Statics.field626 = null;
            Statics.field1531 = null;
            Statics.field1325 = null;
            Statics.field929 = null;
            class161.method156(2);
            class150.method2500(true);
            Statics.field621 = false;
        }
        field252 = arg0;
    }

    @ObfuscatedName("client.h(B)V")
    public void method184() {
        if (field252 == 1000) {
            return;
        }
        long var1 = class103.method26();
        int var3 = (int) (var1 - Statics.field2859);
        Statics.field2859 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class150.field2485 += var3;
        boolean var4;
        if (class150.field2494 == 0 && class150.field2497 == 0 && class150.field2492 == 0 && class150.field2493 == 0) {
            var4 = true;
        } else if (Statics.field2503 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class150.field2485 > 30000) {
                        throw new IOException();
                    }
                    while (class150.field2497 < 20 && class150.field2493 > 0) {
                        class151 var5 = (class151) class150.field2484.method3197();
                        class107 var6 = new class107(4);
                        var6.method2108(1);
                        var6.method2276((int) var5.field2857);
                        Statics.field2503.method2585(var6.field1823, 0, 4);
                        class150.field2488.method3205(var5, var5.field2857);
                        class150.field2493--;
                        class150.field2497++;
                    }
                    while (class150.field2494 < 20 && class150.field2492 > 0) {
                        class151 var7 = (class151) class150.field2490.method3274();
                        class107 var8 = new class107(4);
                        var8.method2108(0);
                        var8.method2276((int) var7.field2857);
                        Statics.field2503.method2585(var8.field1823, 0, 4);
                        var7.method3294();
                        class150.field2486.method3205(var7, var7.field2857);
                        class150.field2492--;
                        class150.field2494++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2503.method2583();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class150.field2485 = 0;
                        byte var11 = 0;
                        if (Statics.field2495 == null) {
                            var11 = 8;
                        } else if (class150.field2504 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class150.field2496.field1819;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2503.method2591(class150.field2496.field1823, class150.field2496.field1819, var12);
                            if (class150.field2501 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class150.field2496.field1823[class150.field2496.field1819 + var13] ^= class150.field2501;
                                }
                            }
                            class150.field2496.field1819 += var12;
                            if (class150.field2496.field1819 < var11) {
                                break;
                            }
                            if (Statics.field2495 == null) {
                                class150.field2496.field1819 = 0;
                                int var14 = class150.field2496.method2122();
                                int var15 = class150.field2496.method2239();
                                int var16 = class150.field2496.method2122();
                                int var17 = class150.field2496.method2127();
                                long var18 = (long) ((var14 << 16) + var15);
                                class151 var20 = (class151) class150.field2488.method3204(var18);
                                Statics.field1971 = true;
                                if (var20 == null) {
                                    var20 = (class151) class150.field2486.method3204(var18);
                                    Statics.field1971 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2495 = var20;
                                Statics.field581 = new class107(var17 + var21 + Statics.field2495.field2508);
                                Statics.field581.method2108(var16);
                                Statics.field581.method2111(var17);
                                class150.field2504 = 8;
                                class150.field2496.field1819 = 0;
                            } else if (class150.field2504 == 0) {
                                if (class150.field2496.field1823[0] == -1) {
                                    class150.field2504 = 1;
                                    class150.field2496.field1819 = 0;
                                } else {
                                    Statics.field2495 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field581.field1823.length - Statics.field2495.field2508;
                            int var23 = 512 - class150.field2504;
                            if (var23 > var22 - Statics.field581.field1819) {
                                var23 = var22 - Statics.field581.field1819;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2503.method2591(Statics.field581.field1823, Statics.field581.field1819, var23);
                            if (class150.field2501 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field581.field1823[Statics.field581.field1819 + var24] ^= class150.field2501;
                                }
                            }
                            Statics.field581.field1819 += var23;
                            class150.field2504 += var23;
                            if (Statics.field581.field1819 == var22) {
                                if (Statics.field2495.field2857 == 16711935L) {
                                    Statics.field1465 = Statics.field581;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class147 var26 = class150.field2500[var25];
                                        if (var26 != null) {
                                            Statics.field1465.field1819 = var25 * 8 + 5;
                                            int var27 = Statics.field1465.method2127();
                                            int var28 = Statics.field1465.method2127();
                                            var26.method2792(var27, var28);
                                        }
                                    }
                                } else {
                                    class150.field2499.reset();
                                    class150.field2499.update(Statics.field581.field1823, 0, var22);
                                    int var29 = (int) class150.field2499.getValue();
                                    if (Statics.field2495.field2506 != var29) {
                                        try {
                                            Statics.field2503.method2581();
                                        } catch (Exception var35) {
                                        }
                                        class150.field2502++;
                                        Statics.field2503 = null;
                                        class150.field2501 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class150.field2502 = 0;
                                    class150.field2505 = 0;
                                    Statics.field2495.field2512.method2793((int) (Statics.field2495.field2857 & 0xFFFFL), Statics.field581.field1823, (Statics.field2495.field2857 & 0xFF0000L) == 16711680L, Statics.field1971);
                                }
                                Statics.field2495.method3311();
                                if (Statics.field1971) {
                                    class150.field2497--;
                                } else {
                                    class150.field2494--;
                                }
                                class150.field2504 = 0;
                                Statics.field2495 = null;
                                Statics.field581 = null;
                            } else {
                                if (class150.field2504 != 512) {
                                    break;
                                }
                                class150.field2504 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2503.method2581();
                } catch (Exception var34) {
                }
                class150.field2505++;
                Statics.field2503 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method185();
        }
    }

    @ObfuscatedName("client.r(B)V")
    public void method185() {
        if (class150.field2502 >= 4) {
            this.method2614("js5crc");
            field252 = 1000;
            return;
        }
        if (class150.field2505 >= 4) {
            if (field252 <= 5) {
                this.method2614("js5io");
                field252 = 1000;
                return;
            }
            field333 = 3000;
            class150.field2505 = 3;
        }
        if (--field333 + 1 > 0) {
            return;
        }
        try {
            if (field274 == 0) {
                Statics.field273 = Statics.field1881.method2482(Statics.field1742, Statics.field2489);
                field274++;
            }
            if (field274 == 1) {
                if (Statics.field273.field2057 == 2) {
                    this.method186(-1);
                    return;
                }
                if (Statics.field273.field2057 == 1) {
                    field274++;
                }
            }
            if (field274 == 2) {
                Statics.field136 = new class130((Socket) Statics.field273.field2058, Statics.field1881);
                class107 var1 = new class107(5);
                var1.method2108(15);
                var1.method2111(50);
                Statics.field136.method2585(var1.field1823, 0, 5);
                field274++;
                Statics.field1998 = class103.method26();
            }
            if (field274 == 3) {
                if (field252 <= 5 || Statics.field136.method2583() > 0) {
                    int var2 = Statics.field136.method2582();
                    if (var2 != 0) {
                        this.method186(var2);
                        return;
                    }
                    field274++;
                } else if (class103.method26() - Statics.field1998 > 30000L) {
                    this.method186(-2);
                    return;
                }
            }
            if (field274 == 4) {
                class130 var3 = Statics.field136;
                boolean var4 = field252 > 20;
                if (Statics.field2503 != null) {
                    try {
                        Statics.field2503.method2581();
                    } catch (Exception var14) {
                    }
                    Statics.field2503 = null;
                }
                Statics.field2503 = var3;
                class150.method2500(var4);
                class150.field2496.field1819 = 0;
                Statics.field2495 = null;
                Statics.field581 = null;
                class150.field2504 = 0;
                while (true) {
                    class151 var6 = (class151) class150.field2488.method3197();
                    if (var6 == null) {
                        while (true) {
                            class151 var7 = (class151) class150.field2486.method3197();
                            if (var7 == null) {
                                if (class150.field2501 != 0) {
                                    try {
                                        class107 var8 = new class107(4);
                                        var8.method2108(4);
                                        var8.method2108(class150.field2501);
                                        var8.method2109(0);
                                        Statics.field2503.method2585(var8.field1823, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2503.method2581();
                                        } catch (Exception var12) {
                                        }
                                        class150.field2505++;
                                        Statics.field2503 = null;
                                    }
                                }
                                class150.field2485 = 0;
                                Statics.field2859 = class103.method26();
                                Statics.field273 = null;
                                Statics.field136 = null;
                                field274 = 0;
                                field277 = 0;
                                return;
                            }
                            class150.field2490.method3270(var7);
                            class150.field2491.method3205(var7, var7.field2857);
                            class150.field2492++;
                            class150.field2494--;
                        }
                    }
                    class150.field2484.method3205(var6, var6.field2857);
                    class150.field2493++;
                    class150.field2497--;
                }
            }
        } catch (IOException var15) {
            this.method186(-3);
        }
    }

    @ObfuscatedName("client.o(IB)V")
    public void method186(int arg0) {
        Statics.field273 = null;
        Statics.field136 = null;
        field274 = 0;
        if (Statics.field2489 == Statics.field1235) {
            Statics.field2489 = Statics.field202;
        } else {
            Statics.field2489 = Statics.field1235;
        }
        field277++;
        if (field277 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field252 <= 5) {
                this.method2614("js5connect_full");
                field252 = 1000;
            } else {
                field333 = 3000;
            }
        } else if (field277 >= 2 && arg0 == 6) {
            this.method2614("js5connect_outofdate");
            field252 = 1000;
        } else if (field277 >= 4) {
            if (field252 <= 5) {
                this.method2614("js5connect");
                field252 = 1000;
            } else {
                field333 = 3000;
            }
        }
    }

    @ObfuscatedName("cx.f(S)V")
    public static void method1881() {
        if (field272 == 0) {
            Statics.field1490 = new class79(4, 104, 104, class6.field74);
            for (int var0 = 0; var0 < 4; var0++) {
                field303[var0] = new class195(104, 104);
            }
            Statics.field2083 = new class72(512, 512);
            class28.field642 = class142.field2203;
            class28.field652 = 5;
            field272 = 20;
        } else if (field272 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1447[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1635(var1, 500, 800, 512, 334);
            class28.field642 = class142.field2144;
            class28.field652 = 10;
            field272 = 30;
        } else if (field272 == 30) {
            Statics.field118 = method795(0, false, true, true);
            Statics.field801 = method795(1, false, true, true);
            Statics.field130 = method795(2, true, false, true);
            Statics.field1063 = method795(3, false, true, true);
            Statics.field2105 = method795(4, false, true, true);
            Statics.field153 = method795(5, true, true, true);
            Statics.field2706 = method795(6, true, true, false);
            Statics.field220 = method795(7, false, true, true);
            Statics.field906 = method795(8, false, true, true);
            Statics.field582 = method795(9, false, true, true);
            Statics.field962 = method795(10, false, true, true);
            Statics.field1041 = method795(11, false, true, true);
            Statics.field549 = method795(12, false, true, true);
            Statics.field2479 = method795(13, true, false, true);
            Statics.field11 = method795(14, false, true, false);
            Statics.field499 = method795(15, false, true, true);
            class28.field642 = class142.field2145;
            class28.field652 = 20;
            field272 = 40;
        } else if (field272 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field118.method2789() * 4 / 100;
            int var8 = var7 + Statics.field801.method2789() * 4 / 100;
            int var9 = var8 + Statics.field130.method2789() * 2 / 100;
            int var10 = var9 + Statics.field1063.method2789() * 2 / 100;
            int var11 = var10 + Statics.field2105.method2789() * 6 / 100;
            int var12 = var11 + Statics.field153.method2789() * 4 / 100;
            int var13 = var12 + Statics.field2706.method2789() * 2 / 100;
            int var14 = var13 + Statics.field220.method2789() * 60 / 100;
            int var15 = var14 + Statics.field906.method2789() * 2 / 100;
            int var16 = var15 + Statics.field582.method2789() * 2 / 100;
            int var17 = var16 + Statics.field962.method2789() * 2 / 100;
            int var18 = var17 + Statics.field1041.method2789() * 2 / 100;
            int var19 = var18 + Statics.field549.method2789() * 2 / 100;
            int var20 = var19 + Statics.field2479.method2789() * 2 / 100;
            int var21 = var20 + Statics.field11.method2789() * 2 / 100;
            int var22 = var21 + Statics.field499.method2789() * 2 / 100;
            if (var22 == 100) {
                class28.field642 = class142.field2147;
                class28.field652 = 30;
                field272 = 45;
            } else {
                if (var22 != 0) {
                    class28.field642 = class142.field2146 + var22 + "%";
                }
                class28.field652 = 30;
            }
        } else if (field272 == 45) {
            boolean var23 = !field250;
            Statics.field1044 = 22050;
            Statics.field1042 = var23;
            Statics.field510 = 2;
            class162 var24 = new class162();
            var24.method3043(9, 128);
            Statics.field164 = class50.method676(Statics.field1881, Statics.field2676, 0, 22050);
            Statics.field164.method968(var24);
            class161.method2537(Statics.field499, Statics.field11, Statics.field2105, var24);
            Statics.field2094 = class50.method676(Statics.field1881, Statics.field2676, 1, 2048);
            Statics.field461 = new class49();
            Statics.field2094.method968(Statics.field461);
            Statics.field1963 = new class68(22050, Statics.field1044);
            class28.field642 = class142.field2362;
            class28.field652 = 35;
            field272 = 50;
        } else if (field272 == 50) {
            int var25 = 0;
            if (Statics.field1550 == null) {
                Statics.field1550 = class70.method685(Statics.field906, Statics.field2479, "p11_full", "");
            } else {
                var25++;
            }
            if (Statics.field630 == null) {
                Statics.field630 = class70.method685(Statics.field906, Statics.field2479, "p12_full", "");
            } else {
                var25++;
            }
            if (Statics.field568 == null) {
                Statics.field568 = class70.method685(Statics.field906, Statics.field2479, "b12_full", "");
            } else {
                var25++;
            }
            if (var25 < 3) {
                class28.field642 = class142.field2149 + var25 * 100 / 3 + "%";
                class28.field652 = 40;
            } else {
                Statics.field236 = new class145(true);
                class28.field642 = class142.field2150;
                class28.field652 = 40;
                field272 = 60;
            }
        } else if (field272 == 60) {
            int var26 = class28.method624(Statics.field962, Statics.field906);
            byte var27 = 8;
            if (var26 < var27) {
                class28.field642 = class142.field2187 + var26 * 100 / var27 + "%";
                class28.field652 = 50;
            } else {
                class28.field642 = class142.field2152;
                class28.field652 = 50;
                method2683(5);
                field272 = 70;
            }
        } else if (field272 == 70) {
            if (Statics.field130.method2709()) {
                class41.method2416(Statics.field130);
                class37.method32(Statics.field130);
                class40.method1599(Statics.field130, Statics.field220);
                class36.method85(Statics.field130, Statics.field220, field250);
                class35.method1771(Statics.field130, Statics.field220);
                class147 var29 = Statics.field130;
                class147 var30 = Statics.field220;
                boolean var31 = field249;
                class191 var32 = Statics.field1550;
                Statics.field1014 = var29;
                Statics.field2012 = var30;
                Statics.field1023 = var31;
                Statics.field1014.method2738(10);
                Statics.field998 = var32;
                class147 var33 = Statics.field130;
                class147 var34 = Statics.field118;
                class147 var35 = Statics.field801;
                Statics.field889 = var33;
                Statics.field868 = var34;
                Statics.field874 = var35;
                class147 var36 = Statics.field130;
                class147 var37 = Statics.field220;
                Statics.field1877 = var36;
                Statics.field898 = var37;
                class147 var38 = Statics.field130;
                Statics.field956 = var38;
                class46.method25(Statics.field130);
                class147 var39 = Statics.field1063;
                class147 var40 = Statics.field220;
                class147 var41 = Statics.field906;
                class147 var42 = Statics.field2479;
                Statics.field2515 = var39;
                Statics.field583 = var40;
                Statics.field2516 = var41;
                Statics.field2014 = var42;
                Statics.field2574 = new class152[Statics.field2515.method2716()][];
                Statics.field2630 = new boolean[Statics.field2515.method2716()];
                class147 var43 = Statics.field130;
                Statics.field975 = var43;
                class147 var44 = Statics.field130;
                Statics.field967 = var44;
                class28.field642 = class142.field2366;
                class28.field652 = 60;
                field272 = 80;
            } else {
                class28.field642 = class142.field2344 + Statics.field130.method2796() + "%";
                class28.field652 = 60;
            }
        } else if (field272 == 80) {
            int var45 = 0;
            if (Statics.field580 == null) {
                class147 var46 = Statics.field906;
                int var47 = var46.method2707("compass");
                int var48 = var46.method2721(var47, "");
                class72 var49;
                if (class70.method1877(var46, var47, var48)) {
                    class72 var50 = new class72();
                    var50.field1282 = Statics.field1255;
                    var50.field1287 = Statics.field1259;
                    var50.field1280 = Statics.field2885[0];
                    var50.field1281 = Statics.field1263[0];
                    var50.field1278 = Statics.field1226[0];
                    var50.field1279 = Statics.field1257[0];
                    int var51 = var50.field1279 * var50.field1278;
                    byte[] var52 = Statics.field183[0];
                    var50.field1283 = new int[var51];
                    for (int var53 = 0; var53 < var51; var53++) {
                        var50.field1283[var53] = Statics.field1256[var52[var53] & 0xFF];
                    }
                    Statics.field2885 = null;
                    Statics.field1263 = null;
                    Statics.field1226 = null;
                    Statics.field1257 = null;
                    Statics.field1256 = null;
                    Statics.field183 = (byte[][]) null;
                    var49 = var50;
                } else {
                    var49 = null;
                }
                Statics.field580 = var49;
            } else {
                var45++;
            }
            if (Statics.field908 == null) {
                class147 var56 = Statics.field906;
                int var57 = var56.method2707("mapedge");
                int var58 = var56.method2721(var57, "");
                class72 var59;
                if (class70.method1877(var56, var57, var58)) {
                    class72 var60 = new class72();
                    var60.field1282 = Statics.field1255;
                    var60.field1287 = Statics.field1259;
                    var60.field1280 = Statics.field2885[0];
                    var60.field1281 = Statics.field1263[0];
                    var60.field1278 = Statics.field1226[0];
                    var60.field1279 = Statics.field1257[0];
                    int var61 = var60.field1279 * var60.field1278;
                    byte[] var62 = Statics.field183[0];
                    var60.field1283 = new int[var61];
                    for (int var63 = 0; var63 < var61; var63++) {
                        var60.field1283[var63] = Statics.field1256[var62[var63] & 0xFF];
                    }
                    Statics.field2885 = null;
                    Statics.field1263 = null;
                    Statics.field1226 = null;
                    Statics.field1257 = null;
                    Statics.field1256 = null;
                    Statics.field183 = (byte[][]) null;
                    var59 = var60;
                } else {
                    var59 = null;
                }
                Statics.field908 = var59;
            } else {
                var45++;
            }
            if (Statics.field188 == null) {
                Statics.field188 = class70.method1320(Statics.field906, "mapscene", "");
            } else {
                var45++;
            }
            if (Statics.field1013 == null) {
                Statics.field1013 = class70.method2576(Statics.field906, "mapfunction", "");
            } else {
                var45++;
            }
            if (Statics.field670 == null) {
                Statics.field670 = class70.method2576(Statics.field906, "hitmarks", "");
            } else {
                var45++;
            }
            if (Statics.field574 == null) {
                Statics.field574 = class70.method2576(Statics.field906, "headicons_pk", "");
            } else {
                var45++;
            }
            if (Statics.field163 == null) {
                Statics.field163 = class70.method2576(Statics.field906, "headicons_prayer", "");
            } else {
                var45++;
            }
            if (Statics.field20 == null) {
                Statics.field20 = class70.method2576(Statics.field906, "headicons_hint", "");
            } else {
                var45++;
            }
            if (Statics.field7 == null) {
                Statics.field7 = class70.method2576(Statics.field906, "mapmarker", "");
            } else {
                var45++;
            }
            if (Statics.field15 == null) {
                Statics.field15 = class70.method2576(Statics.field906, "cross", "");
            } else {
                var45++;
            }
            if (Statics.field953 == null) {
                Statics.field953 = class70.method2576(Statics.field906, "mapdots", "");
            } else {
                var45++;
            }
            if (Statics.field86 == null) {
                Statics.field86 = class70.method1320(Statics.field906, "scrollbar", "");
            } else {
                var45++;
            }
            if (Statics.field234 == null) {
                Statics.field234 = class70.method1320(Statics.field906, "mod_icons", "");
            } else {
                var45++;
            }
            if (Statics.field2487 == null) {
                Statics.field2487 = class70.method1857(Statics.field906, "mapback", "");
            } else {
                var45++;
            }
            if (var45 < 14) {
                class28.field642 = class142.field2155 + var45 * 100 / 14 + "%";
                class28.field652 = 70;
            } else {
                Statics.field2898 = Statics.field234;
                Statics.field908.method1414();
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 21.0D) - 10;
                int var68 = (int) (Math.random() * 21.0D) - 10;
                int var69 = (int) (Math.random() * 41.0D) - 20;
                for (int var70 = 0; var70 < Statics.field1013.length; var70++) {
                    Statics.field1013[var70].method1469(var66 + var69, var67 + var69, var68 + var69);
                }
                Statics.field188[0].method1571(var66 + var69, var67 + var69, var68 + var69);
                Statics.field70 = new int[33];
                Statics.field195 = new int[33];
                Statics.field943 = new int[151];
                Statics.field1402 = new int[151];
                for (int var71 = 0; var71 < 33; var71++) {
                    int var72 = 999;
                    int var73 = 0;
                    for (int var74 = 0; var74 < 34; var74++) {
                        if (Statics.field2487.field1297[Statics.field2487.field1298 * var71 + var74] == 0) {
                            if (var72 == 999) {
                                var72 = var74;
                            }
                        } else if (var72 != 999) {
                            var73 = var74;
                            break;
                        }
                    }
                    Statics.field70[var71] = var72;
                    Statics.field195[var71] = var73 - var72;
                }
                for (int var75 = 5; var75 < 156; var75++) {
                    int var76 = 999;
                    int var77 = 0;
                    for (int var78 = 25; var78 < 172; var78++) {
                        if (Statics.field2487.field1297[Statics.field2487.field1298 * var75 + var78] == 0 && var78 > 34 || var75 > 34) {
                            if (var76 == 999) {
                                var76 = var78;
                            }
                        } else if (var76 != 999) {
                            var77 = var78;
                            break;
                        }
                    }
                    Statics.field943[var75 - 5] = var76 - 25;
                    Statics.field1402[var75 - 5] = var77 - var76;
                }
                class28.field642 = class142.field2156;
                class28.field652 = 70;
                field272 = 90;
            }
        } else if (field272 == 90) {
            if (Statics.field582.method2709()) {
                class88 var79 = new class88(Statics.field582, Statics.field906, 20, 0.8D, field250 ? 64 : 128);
                class84.method1786(var79);
                class84.method1835(0.8D);
                class28.field642 = class142.field2240;
                class28.field652 = 90;
                field272 = 110;
            } else {
                class28.field642 = class142.field2157 + Statics.field582.method2796() + "%";
                class28.field652 = 90;
            }
        } else if (field272 == 110) {
            Statics.field2910 = new class12();
            Statics.field1881.method2484(Statics.field2910, 10);
            class28.field642 = class142.field2338;
            class28.field652 = 94;
            field272 = 120;
        } else if (field272 == 120) {
            if (Statics.field962.method2723("huffman", "")) {
                class102 var80 = new class102(Statics.field962.method2722("huffman", ""));
                class189.method2820(var80);
                class28.field642 = class142.field2161;
                class28.field652 = 96;
                field272 = 130;
            } else {
                class28.field642 = class142.field2168 + "%";
                class28.field652 = 96;
            }
        } else if (field272 == 130) {
            if (!Statics.field1063.method2709()) {
                class28.field642 = class142.field2162 + Statics.field1063.method2796() * 4 / 5 + "%";
                class28.field652 = 100;
            } else if (!Statics.field549.method2709()) {
                class28.field642 = class142.field2162 + (80 + Statics.field549.method2796() / 6) + "%";
                class28.field652 = 100;
            } else if (Statics.field2479.method2709()) {
                class28.field642 = class142.field2163;
                class28.field652 = 100;
                field272 = 140;
            } else {
                class28.field642 = class142.field2162 + (96 + Statics.field2479.method2796() / 20) + "%";
                class28.field652 = 100;
            }
        } else if (field272 == 140) {
            method2683(10);
        }
    }

    @ObfuscatedName("ap.u(IZZZI)Leq;")
    public static class147 method795(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2078 != null) {
            var4 = new class121(arg0, class136.field2078, Statics.field2074[arg0], 1000000);
        }
        return new class147(var4, Statics.field149, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dr.c(S)V")
    public static final void method2388() {
        try {
            if (field278 == 0) {
                if (Statics.field1670 != null) {
                    Statics.field1670.method2581();
                    Statics.field1670 = null;
                }
                Statics.field1793 = null;
                field304 = false;
                field258 = 0;
                field278 = 1;
            }
            if (field278 == 1) {
                if (Statics.field1793 == null) {
                    Statics.field1793 = Statics.field1881.method2482(Statics.field1742, Statics.field2489);
                }
                if (Statics.field1793.field2057 == 2) {
                    throw new IOException();
                }
                if (Statics.field1793.field2057 == 1) {
                    Statics.field1670 = new class130((Socket) Statics.field1793.field2058, Statics.field1881);
                    Statics.field1793 = null;
                    field278 = 2;
                }
            }
            if (field278 == 2) {
                field285.field1819 = 0;
                field285.method2108(14);
                Statics.field1670.method2585(field285.field1823, 0, 1);
                field287.field1819 = 0;
                field278 = 3;
            }
            if (field278 == 3) {
                if (Statics.field164 != null) {
                    Statics.field164.method970();
                }
                if (Statics.field2094 != null) {
                    Statics.field2094.method970();
                }
                int var0 = Statics.field1670.method2582();
                if (Statics.field164 != null) {
                    Statics.field164.method970();
                }
                if (Statics.field2094 != null) {
                    Statics.field2094.method970();
                }
                if (var0 != 0) {
                    method487(var0);
                    return;
                }
                field287.field1819 = 0;
                field278 = 5;
            }
            if (field278 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field285.field1819 = 0;
                field285.method2108(1);
                field285.method2108(class28.field648.method457());
                field285.method2111(var1[0]);
                field285.method2111(var1[1]);
                field285.method2111(var1[2]);
                field285.method2111(var1[3]);
                switch(class28.field648.field2392) {
                    case 0:
                    case 1:
                        field285.method2276(Statics.field2682);
                        field285.field1819 += 5;
                        break;
                    case 2:
                        field285.field1819 += 8;
                        break;
                    case 3:
                        field285.method2111((Integer) Statics.field57.field139.get(class197.method3520(class28.field620)));
                        field285.field1819 += 4;
                }
                field285.method2113(class28.field615);
                field285.method2140(class5.field71, class5.field67);
                field453.field1819 = 0;
                if (field252 == 40) {
                    field453.method2108(18);
                } else {
                    field453.method2108(16);
                }
                field453.method2109(0);
                int var2 = field453.field1819;
                field453.method2111(50);
                field453.method2230(field285.field1823, 0, field285.field1819);
                int var3 = field453.field1819;
                field453.method2113(class28.field620);
                field453.method2108(field250 ? 1 : 0);
                class110 var4 = field453;
                byte[] var5 = new byte[24];
                try {
                    class136.field2077.method3457(0L);
                    class136.field2077.method3474(var5);
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
                var4.method2230(var5, 0, 24);
                class107 var9 = new class107(Statics.field236.method2695());
                Statics.field236.method2694(var9);
                field453.method2230(var9.field1823, 0, var9.field1823.length);
                field453.method2111(Statics.field118.field2446);
                field453.method2111(Statics.field801.field2446);
                field453.method2111(Statics.field130.field2446);
                field453.method2111(Statics.field1063.field2446);
                field453.method2111(Statics.field2105.field2446);
                field453.method2111(Statics.field153.field2446);
                field453.method2111(Statics.field2706.field2446);
                field453.method2111(Statics.field220.field2446);
                field453.method2111(Statics.field906.field2446);
                field453.method2111(Statics.field582.field2446);
                field453.method2111(Statics.field962.field2446);
                field453.method2111(Statics.field1041.field2446);
                field453.method2111(Statics.field549.field2446);
                field453.method2111(Statics.field2479.field2446);
                field453.method2111(Statics.field11.field2446);
                field453.method2111(Statics.field499.field2446);
                field453.method2204(var1, var3, field453.field1819);
                field453.method2232(field453.field1819 - var2);
                Statics.field1670.method2585(field453.field1823, 0, field453.field1819);
                field285.method2363(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field287.method2363(var1);
                field278 = 6;
            }
            if (field278 == 6 && Statics.field1670.method2583() > 0) {
                int var11 = Statics.field1670.method2582();
                if (var11 == 21 && field252 == 20) {
                    field278 = 7;
                } else if (var11 == 2) {
                    field278 = 9;
                } else if (var11 == 15 && field252 == 40) {
                    field285.field1819 = 0;
                    field287.field1819 = 0;
                    field289 = -1;
                    field293 = -1;
                    field294 = -1;
                    field295 = -1;
                    field288 = 0;
                    field290 = 0;
                    field471 = 0;
                    field388 = 0;
                    field387 = false;
                    field475 = 0;
                    field344 = 0;
                    for (int var12 = 0; var12 < field364.length; var12++) {
                        if (field364[var12] != null) {
                            field364[var12].field698 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field376.length; var13++) {
                        if (field376[var13] != null) {
                            field376[var13].field698 = -1;
                        }
                    }
                    class14.field191 = new class174(32);
                    method2683(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field449[var14] = true;
                    }
                    return;
                } else if (var11 == 23 && field280 < 1) {
                    field280++;
                    field278 = 0;
                } else {
                    method487(var11);
                    return;
                }
            }
            if (field278 == 7 && Statics.field1670.method2583() > 0) {
                field281 = (Statics.field1670.method2582() + 3) * 60;
                field278 = 8;
            }
            if (field278 == 8) {
                field258 = 0;
                class28.method100(class142.field2376, class142.field2251, field281 / 60 + class142.field2169);
                if (--field281 <= 0) {
                    field278 = 0;
                }
            } else {
                if (field278 == 9 && Statics.field1670.method2583() >= 13) {
                    boolean var15 = Statics.field1670.method2582() == 1;
                    Statics.field1670.method2591(field287.field1823, 0, 4);
                    field287.field1819 = 0;
                    boolean var16 = false;
                    if (var15) {
                        int var17 = field287.method2377() << 24;
                        int var18 = var17 | field287.method2377() << 16;
                        int var19 = var18 | field287.method2377() << 8;
                        int var20 = var19 | field287.method2377();
                        int var21 = class197.method3520(class28.field620);
                        if (Statics.field57.field139.size() >= 10 && !Statics.field57.field139.containsKey(var21)) {
                            Iterator var22 = Statics.field57.field139.entrySet().iterator();
                            var22.next();
                            var22.remove();
                        }
                        Statics.field57.field139.put(var21, var20);
                        class9.method1408();
                    }
                    field476 = Statics.field1670.method2582();
                    field470 = Statics.field1670.method2582() == 1;
                    field468 = Statics.field1670.method2582();
                    field468 <<= 0x8;
                    field468 += Statics.field1670.method2582();
                    field371 = Statics.field1670.method2582();
                    Statics.field1670.method2591(field287.field1823, 0, 1);
                    field287.field1819 = 0;
                    field289 = field287.method2377();
                    Statics.field1670.method2591(field287.field1823, 0, 2);
                    field287.field1819 = 0;
                    field288 = field287.method2239();
                    if (field371 == 1) {
                        try {
                            class119.method2453(Statics.field243, "zap");
                        } catch (Throwable var27) {
                        }
                    } else {
                        try {
                            class119.method2453(Statics.field243, "unzap");
                        } catch (Throwable var26) {
                        }
                    }
                    field278 = 10;
                }
                if (field278 != 10) {
                    field258++;
                    if (field258 > 2000) {
                        if (field280 < 1) {
                            if (Statics.field2489 == Statics.field1235) {
                                Statics.field2489 = Statics.field202;
                            } else {
                                Statics.field2489 = Statics.field1235;
                            }
                            field280++;
                            field278 = 0;
                        } else {
                            method487(-3);
                        }
                    }
                } else if (Statics.field1670.method2583() >= field288) {
                    field287.field1819 = 0;
                    Statics.field1670.method2591(field287.field1823, 0, field288);
                    method500();
                    Statics.field522 = -1;
                    method1967(false);
                    field289 = -1;
                }
            }
        } catch (IOException var29) {
            if (field280 < 1) {
                if (Statics.field2489 == Statics.field1235) {
                    Statics.field2489 = Statics.field202;
                } else {
                    Statics.field2489 = Statics.field1235;
                }
                field280++;
                field278 = 0;
            } else {
                method487(-2);
            }
        }
    }

    @ObfuscatedName("n.l(B)V")
    public static void method500() {
        field255 = 1L;
        field469 = -1;
        Statics.field2910.field171 = 0;
        Statics.field1821 = true;
        field259 = true;
        field465 = -1L;
        class187.method3155();
        field285.field1819 = 0;
        field287.field1819 = 0;
        field289 = -1;
        field293 = -1;
        field294 = -1;
        field295 = -1;
        field290 = 0;
        field471 = 0;
        field321 = 0;
        field262 = 0;
        field388 = 0;
        field387 = false;
        class127.field1982 = 0;
        class10.method2690();
        field399 = 0;
        field401 = false;
        field482 = 0;
        field378 = (int) (Math.random() * 100.0D) - 50;
        field310 = (int) (Math.random() * 110.0D) - 55;
        field312 = (int) (Math.random() * 80.0D) - 40;
        field254 = (int) (Math.random() * 120.0D) - 60;
        field348 = (int) (Math.random() * 30.0D) - 20;
        field346 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field475 = 0;
        field318 = -1;
        field344 = 0;
        field474 = 0;
        field345 = class18.field509;
        field365 = 0;
        field440 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field364[var0] = null;
            field271[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field376[var1] = null;
        }
        Statics.field1669 = field364[2047] = new class3();
        field316 = -1;
        field473.method3226();
        field392.method3226();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field379[var2][var3][var4] = null;
                }
            }
        }
        field452 = new class177();
        field495 = 0;
        field361 = 0;
        field498 = 0;
        for (int var5 = 0; var5 < Statics.field2953; var5++) {
            class46 var6 = (class46) class46.field1029.method3162((long) var5);
            class46 var7;
            if (var6 == null) {
                byte[] var8 = Statics.field1033.method2705(16, var5);
                class46 var9 = new class46();
                if (var8 != null) {
                    var9.method889(new class107(var8));
                }
                class46.field1029.method3171(var9, (long) var5);
                var7 = var9;
            } else {
                var7 = var6;
            }
            if (var7 != null) {
                class154.field2646[var5] = 0;
                class154.field2649[var5] = 0;
            }
        }
        for (int var11 = 0; var11 < field350.length; var11++) {
            field350[var11] = -1;
        }
        field413 = -1;
        if (field381 != -1) {
            class152.method561(field381);
        }
        for (class4 var12 = (class4) field362.method3197(); var12 != null; var12 = (class4) field362.method3200()) {
            method2691(var12, true);
        }
        field381 = -1;
        field362 = new class174(8);
        field323 = null;
        field387 = false;
        field388 = 0;
        field500.method2914((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var13 = 0; var13 < 8; var13++) {
            field375[var13] = null;
            field405[var13] = false;
        }
        class14.field191 = new class174(32);
        field409 = true;
        for (int var14 = 0; var14 < 100; var14++) {
            field449[var14] = true;
        }
        field466 = null;
        Statics.field861 = 0;
        Statics.field2474 = null;
    }

    @ObfuscatedName("v.w(II)V")
    public static void method487(int arg0) {
        if (arg0 == -3) {
            class28.method100(class142.field2227, class142.field2171, class142.field2291);
        } else if (arg0 == -2) {
            class28.method100(class142.field2369, class142.field2174, class142.field2175);
        } else if (arg0 == -1) {
            class28.method100(class142.field2257, class142.field2231, class142.field2249);
        } else if (arg0 == 3) {
            class28.method100(class142.field2179, class142.field2180, class142.field2365);
        } else if (arg0 == 4) {
            class28.method100(class142.field2182, class142.field2183, class142.field2184);
        } else if (arg0 == 5) {
            class28.method100(class142.field2185, class142.field2143, class142.field2346);
        } else if (arg0 == 6) {
            class28.method100(class142.field2181, class142.field2189, class142.field2190);
        } else if (arg0 == 7) {
            class28.method100(class142.field2191, class142.field2192, class142.field2193);
        } else if (arg0 == 8) {
            class28.method100(class142.field2194, class142.field2195, class142.field2196);
        } else if (arg0 == 9) {
            class28.method100(class142.field2197, class142.field2212, class142.field2225);
        } else if (arg0 == 10) {
            class28.method100(class142.field2200, class142.field2201, class142.field2368);
        } else if (arg0 == 11) {
            class28.method100(class142.field2360, class142.field2248, class142.field2205);
        } else if (arg0 == 12) {
            class28.method100(class142.field2206, class142.field2339, class142.field2141);
        } else if (arg0 == 13) {
            class28.method100(class142.field2209, class142.field2210, class142.field2186);
        } else if (arg0 == 14) {
            class28.method100(class142.field2276, class142.field2271, class142.field2348);
        } else if (arg0 == 16) {
            class28.method100(class142.field2215, class142.field2216, class142.field2217);
        } else if (arg0 == 17) {
            class28.method100(class142.field2218, class142.field2198, class142.field2220);
        } else if (arg0 == 18) {
            class28.method100(class142.field2221, class142.field2222, class142.field2334);
        } else if (arg0 == 19) {
            class28.method100(class142.field2224, class142.field2332, class142.field2296);
        } else if (arg0 == 20) {
            class28.method100(class142.field2247, class142.field2177, class142.field2324);
        } else if (arg0 == 22) {
            class28.method100(class142.field2230, class142.field2176, class142.field2199);
        } else if (arg0 == 23) {
            class28.method100(class142.field2233, class142.field2234, class142.field2235);
        } else if (arg0 == 24) {
            class28.method100(class142.field2236, class142.field2363, class142.field2238);
        } else if (arg0 == 25) {
            class28.method100(class142.field2336, class142.field2281, class142.field2241);
        } else if (arg0 == 26) {
            class28.method100(class142.field2237, class142.field2243, class142.field2244);
        } else if (arg0 == 27) {
            class28.method100(class142.field2245, class142.field2246, class142.field2295);
        } else if (arg0 == 31) {
            class28.method100(class142.field2254, class142.field2255, class142.field2154);
        } else if (arg0 == 32) {
            class28.method100(class142.field2140, class142.field2258, class142.field2313);
        } else if (arg0 == 37) {
            class28.method100(class142.field2260, class142.field2261, class142.field2262);
        } else if (arg0 == 38) {
            class28.method100(class142.field2263, class142.field2264, class142.field2265);
        } else if (arg0 == 55) {
            class28.method100(class142.field2266, class142.field2267, class142.field2268);
        } else if (arg0 == 56) {
            class28.method100(class142.field2269, class142.field2270, class142.field2204);
            method2683(11);
            return;
        } else if (arg0 == 57) {
            class28.method100(class142.field2272, class142.field2226, class142.field2274);
            method2683(11);
            return;
        } else {
            class28.method100(class142.field2207, class142.field2374, class142.field2277);
        }
        method2683(10);
    }

    @ObfuscatedName("gk.x(B)V")
    public static final void method3440() {
        if (Statics.field1670 != null) {
            Statics.field1670.method2581();
            Statics.field1670 = null;
        }
        method459();
        Statics.field1490.method1602();
        for (int var0 = 0; var0 < 4; var0++) {
            field303[var0].method3514();
        }
        System.gc();
        class161.method156(2);
        field477 = -1;
        field478 = false;
        for (class20 var1 = (class20) class20.field528.method3232(); var1 != null; var1 = (class20) class20.field528.method3251()) {
            if (var1.field532 != null) {
                Statics.field461.method950(var1.field532);
                var1.field532 = null;
            }
            if (var1.field538 != null) {
                Statics.field461.method950(var1.field538);
                var1.field538 = null;
            }
        }
        class20.field528.method3226();
        method2683(10);
    }

    @ObfuscatedName("x.t(I)V")
    public static final void method459() {
        class41.field937.method3164();
        class37.field858.method3164();
        class40.field915.method3164();
        class36.field809.method3164();
        class36.field810.method3164();
        class36.field806.method3164();
        class36.field853.method3164();
        class35.field769.method3164();
        class35.field770.method3164();
        class45.method811();
        class38.method2062();
        class39.method1961();
        class42.method2070();
        class46.field1029.method3164();
        class157.method2536();
        class152.field2517.method3164();
        class152.field2521.method3164();
        class152.field2519.method3164();
        ((class88) Statics.field1450).method1866();
        class19.field519.method3164();
        Statics.field118.method2718();
        Statics.field801.method2718();
        Statics.field1063.method2718();
        Statics.field2105.method2718();
        Statics.field153.method2718();
        Statics.field2706.method2718();
        Statics.field220.method2718();
        Statics.field906.method2718();
        Statics.field582.method2718();
        Statics.field962.method2718();
        Statics.field1041.method2718();
        Statics.field549.method2718();
    }

    @ObfuscatedName("o.k(I)V")
    public static final void method125() {
        if (field321 > 0) {
            method3440();
        } else {
            method2683(40);
            Statics.field1786 = Statics.field1670;
            Statics.field1670 = null;
        }
    }

    @ObfuscatedName("h.e(I)V")
    public static final void method108() {
        if (Statics.field2094 != null) {
            Statics.field2094.method969();
        }
        if (Statics.field164 != null) {
            Statics.field164.method969();
        }
    }

    @ObfuscatedName("l.v(Law;IIII)V")
    public static void method160(class38 arg0, int arg1, int arg2, int arg3) {
        if (field482 >= 50 || field251 == 0 || arg0.field875 == null || arg1 >= arg0.field875.length) {
            return;
        }
        int var4 = arg0.field875[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field483[field482] = var5;
        field484[field482] = var6;
        field485[field482] = 0;
        field487[field482] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field486[field482] = (var8 << 16) + (var9 << 8) + var7;
        field482++;
    }

    @ObfuscatedName("bl.n(IB)V")
    public static void method1402(int arg0) {
        if (arg0 == -1 && !field478) {
            class161.method2880();
        } else if (arg0 != -1 && field477 != arg0 && field414 != 0 && !field478) {
            class161.method786(2, Statics.field2706, arg0, 0, field414, false);
        }
        field477 = arg0;
    }

    @ObfuscatedName("cp.d(IIB)V")
    public static void method2068(int arg0, int arg1) {
        if (field414 != 0 && arg0 != -1) {
            class161.method2945(Statics.field1041, arg0, 0, field414, false);
            field478 = true;
        }
    }

    @ObfuscatedName("i.m(B)V")
    public static final void method30() {
        if (field250 && Statics.field1999 != field459) {
            method1864(Statics.field522, Statics.field187, Statics.field1999, Statics.field1669.field750[0], Statics.field1669.field751[0]);
        } else if (Statics.field1999 != field318) {
            field318 = Statics.field1999;
            method1322(Statics.field1999);
        }
    }

    @ObfuscatedName("da.g(IIS)V")
    public static final void method2434(int arg0, int arg1) {
        if (field475 != 0 && field475 != 3 || class127.field1996 != 1 && Statics.field2015 || class127.field1996 != 4) {
            return;
        }
        int var2 = class127.field1995 - 25 - arg0;
        int var3 = class127.field2002 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field346 + field254 & 0x7FF;
        int var5 = class84.field1447[var4];
        int var6 = class84.field1454[var4];
        int var7 = (field348 + 256) * var5 >> 8;
        int var8 = (field348 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field1669.field700 + var9 >> 7;
        int var12 = Statics.field1669.field726 - var10 >> 7;
        field285.method2364(165);
        field285.method2108(18);
        field285.method2153(Statics.field919 + var12);
        field285.method2108(class124.field1946[82] ? (class124.field1946[81] ? 2 : 1) : 0);
        field285.method2152(Statics.field928 + var11);
        field285.method2108(var2);
        field285.method2108(var3);
        field285.method2109(field346);
        field285.method2108(57);
        field285.method2108(field254);
        field285.method2108(field348);
        field285.method2108(89);
        field285.method2109(Statics.field1669.field700);
        field285.method2109(Statics.field1669.field726);
        field285.method2108(63);
        field344 = var11;
        field474 = var12;
    }

    @ObfuscatedName("ej.aq(B)V")
    public static final void method2685() {
        int var0 = Statics.field235 * 128 + 64;
        int var1 = Statics.field585 * 128 + 64;
        int var2 = method496(var0, var1, Statics.field1999) - Statics.field125;
        if (Statics.field1497 < var0) {
            Statics.field1497 += Statics.field1224 * (var0 - Statics.field1497) / 1000 + Statics.field916;
            if (Statics.field1497 > var0) {
                Statics.field1497 = var0;
            }
        }
        if (Statics.field1497 > var0) {
            Statics.field1497 -= Statics.field1224 * (Statics.field1497 - var0) / 1000 + Statics.field916;
            if (Statics.field1497 < var0) {
                Statics.field1497 = var0;
            }
        }
        if (Statics.field1648 < var2) {
            Statics.field1648 += Statics.field1224 * (var2 - Statics.field1648) / 1000 + Statics.field916;
            if (Statics.field1648 > var2) {
                Statics.field1648 = var2;
            }
        }
        if (Statics.field1648 > var2) {
            Statics.field1648 -= Statics.field1224 * (Statics.field1648 - var2) / 1000 + Statics.field916;
            if (Statics.field1648 < var2) {
                Statics.field1648 = var2;
            }
        }
        if (Statics.field1536 < var1) {
            Statics.field1536 += Statics.field1224 * (var1 - Statics.field1536) / 1000 + Statics.field916;
            if (Statics.field1536 > var1) {
                Statics.field1536 = var1;
            }
        }
        if (Statics.field1536 > var1) {
            Statics.field1536 -= Statics.field1224 * (Statics.field1536 - var1) / 1000 + Statics.field916;
            if (Statics.field1536 < var1) {
                Statics.field1536 = var1;
            }
        }
        int var3 = Statics.field1228 * 128 + 64;
        int var4 = Statics.field1803 * 128 + 64;
        int var5 = method496(var3, var4, Statics.field1999) - Statics.field158;
        int var6 = var3 - Statics.field1497;
        int var7 = var5 - Statics.field1648;
        int var8 = var4 - Statics.field1536;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field244 < var10) {
            Statics.field244 += Statics.field1466 * (var10 - Statics.field244) / 1000 + Statics.field679;
            if (Statics.field244 > var10) {
                Statics.field244 = var10;
            }
        }
        if (Statics.field244 > var10) {
            Statics.field244 -= Statics.field1466 * (Statics.field244 - var10) / 1000 + Statics.field679;
            if (Statics.field244 < var10) {
                Statics.field244 = var10;
            }
        }
        int var12 = var11 - Statics.field1939;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1939 += Statics.field1466 * var12 / 1000 + Statics.field679;
            Statics.field1939 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1939 -= Statics.field1466 * -var12 / 1000 + Statics.field679;
            Statics.field1939 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1939;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1939 = var11;
        }
    }

    @ObfuscatedName("f.ao(I)V")
    public static final void method126() {
        int var0 = field378 + Statics.field1669.field700;
        int var1 = field310 + Statics.field1669.field726;
        if (Statics.field25 - var0 < -500 || Statics.field25 - var0 > 500 || Statics.field2703 - var1 < -500 || Statics.field2703 - var1 > 500) {
            Statics.field25 = var0;
            Statics.field2703 = var1;
        }
        if (Statics.field25 != var0) {
            Statics.field25 += (var0 - Statics.field25) / 16;
        }
        if (Statics.field2703 != var1) {
            Statics.field2703 += (var1 - Statics.field2703) / 16;
        }
        if (class127.field1987 == 4 && Statics.field2015) {
            int var2 = class127.field1989 * -632739763 - field328;
            field331 = var2 * 2;
            field328 = var2 == -1 || var2 == 1 ? class127.field1989 * -632739763 : (field328 + class127.field1989 * -632739763) / 2;
            int var3 = field332 - class127.field1988;
            field308 = var3 * 2;
            field332 = var3 == -1 || var3 == 1 ? class127.field1988 : (field332 + class127.field1988) / 2;
        } else {
            if (class124.field1946[96]) {
                field308 += (-24 - field308) / 2;
            } else if (class124.field1946[97]) {
                field308 += (24 - field308) / 2;
            } else {
                field308 /= 2;
            }
            if (class124.field1946[98]) {
                field331 += (12 - field331) / 2;
            } else if (class124.field1946[99]) {
                field331 += (-12 - field331) / 2;
            } else {
                field331 /= 2;
            }
            field328 = class127.field1989 * -632739763;
            field332 = class127.field1988;
        }
        field346 = field308 / 2 + field346 & 0x7FF;
        field424 += field331 / 2;
        if (field424 < 128) {
            field424 = 128;
        }
        if (field424 > 383) {
            field424 = 383;
        }
        int var4 = Statics.field25 >> 7;
        int var5 = Statics.field2703 >> 7;
        int var6 = method496(Statics.field25, Statics.field2703, Statics.field1999);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1999;
                    if (var10 < 3 && (class6.field82[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field74[var10][var8][var9];
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
        if (var12 > field336) {
            field336 += (var12 - field336) / 24;
        } else if (var12 < field336) {
            field336 += (var12 - field336) / 80;
        }
    }

    @ObfuscatedName("dk.af(Laj;IB)V")
    public static final void method2401(class33 arg0, int arg1) {
        if (arg0.field741 > field386) {
            method582(arg0);
        } else if (arg0.field737 >= field386) {
            method596(arg0);
        } else {
            arg0.field724 = arg0.field733;
            if (arg0.field749 == 0) {
                arg0.field753 = 0;
            } else {
                label314: {
                    if (arg0.field697 != -1 && arg0.field730 == 0) {
                        class38 var2 = class38.method84(arg0.field697);
                        if (arg0.field754 > 0 && var2.field886 == 0) {
                            arg0.field753++;
                            break label314;
                        }
                        if (arg0.field754 <= 0 && var2.field880 == 0) {
                            arg0.field753++;
                            break label314;
                        }
                    }
                    int var3 = arg0.field700;
                    int var4 = arg0.field726;
                    int var5 = arg0.field750[arg0.field749 - 1] * 128 + arg0.field701 * 64;
                    int var6 = arg0.field751[arg0.field749 - 1] * 128 + arg0.field701 * 64;
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        if (var3 < var5) {
                            if (var4 < var6) {
                                arg0.field721 = 1280;
                            } else if (var4 > var6) {
                                arg0.field721 = 1792;
                            } else {
                                arg0.field721 = 1536;
                            }
                        } else if (var3 > var5) {
                            if (var4 < var6) {
                                arg0.field721 = 768;
                            } else if (var4 > var6) {
                                arg0.field721 = 256;
                            } else {
                                arg0.field721 = 512;
                            }
                        } else if (var4 < var6) {
                            arg0.field721 = 1024;
                        } else if (var4 > var6) {
                            arg0.field721 = 0;
                        }
                        int var7 = arg0.field721 - arg0.field728 & 0x7FF;
                        if (var7 > 1024) {
                            var7 -= 2048;
                        }
                        int var8 = arg0.field706;
                        if (var7 >= -256 && var7 <= 256) {
                            var8 = arg0.field705;
                        } else if (var7 >= 256 && var7 < 768) {
                            var8 = arg0.field722;
                        } else if (var7 >= -768 && var7 <= -256) {
                            var8 = arg0.field707;
                        }
                        if (var8 == -1) {
                            var8 = arg0.field705;
                        }
                        arg0.field724 = var8;
                        int var9 = 4;
                        boolean var10 = true;
                        if (arg0 instanceof class30) {
                            var10 = ((class30) arg0).field664.field799;
                        }
                        if (var10) {
                            if (arg0.field728 != arg0.field721 && arg0.field698 == -1 && arg0.field748 != 0) {
                                var9 = 2;
                            }
                            if (arg0.field749 > 2) {
                                var9 = 6;
                            }
                            if (arg0.field749 > 3) {
                                var9 = 8;
                            }
                            if (arg0.field753 > 0 && arg0.field749 > 1) {
                                var9 = 8;
                                arg0.field753--;
                            }
                        } else {
                            if (arg0.field749 > 1) {
                                var9 = 6;
                            }
                            if (arg0.field749 > 2) {
                                var9 = 8;
                            }
                            if (arg0.field753 > 0 && arg0.field749 > 1) {
                                var9 = 8;
                                arg0.field753--;
                            }
                        }
                        if (arg0.field752[arg0.field749 - 1]) {
                            var9 <<= 0x1;
                        }
                        if (var9 >= 8 && arg0.field724 == arg0.field705 && arg0.field709 != -1) {
                            arg0.field724 = arg0.field709;
                        }
                        if (var3 < var5) {
                            arg0.field700 += var9;
                            if (arg0.field700 > var5) {
                                arg0.field700 = var5;
                            }
                        } else if (var3 > var5) {
                            arg0.field700 -= var9;
                            if (arg0.field700 < var5) {
                                arg0.field700 = var5;
                            }
                        }
                        if (var4 < var6) {
                            arg0.field726 += var9;
                            if (arg0.field726 > var6) {
                                arg0.field726 = var6;
                            }
                        } else if (var4 > var6) {
                            arg0.field726 -= var9;
                            if (arg0.field726 < var6) {
                                arg0.field726 = var6;
                            }
                        }
                        if (arg0.field700 == var5 && arg0.field726 == var6) {
                            arg0.field749--;
                            if (arg0.field754 > 0) {
                                arg0.field754--;
                            }
                        }
                    } else {
                        arg0.field700 = var5;
                        arg0.field726 = var6;
                    }
                }
            }
        }
        if (arg0.field700 < 128 || arg0.field726 < 128 || arg0.field700 >= 13184 || arg0.field726 >= 13184) {
            arg0.field697 = -1;
            arg0.field732 = -1;
            arg0.field741 = 0;
            arg0.field737 = 0;
            arg0.field700 = arg0.field750[0] * 128 + arg0.field701 * 64;
            arg0.field726 = arg0.field751[0] * 128 + arg0.field701 * 64;
            arg0.method586();
        }
        if (Statics.field1669 == arg0 && (arg0.field700 < 1536 || arg0.field726 < 1536 || arg0.field700 >= 11776 || arg0.field726 >= 11776)) {
            arg0.field697 = -1;
            arg0.field732 = -1;
            arg0.field741 = 0;
            arg0.field737 = 0;
            arg0.field700 = arg0.field750[0] * 128 + arg0.field701 * 64;
            arg0.field726 = arg0.field751[0] * 128 + arg0.field701 * 64;
            arg0.method586();
        }
        Statics.method3156(arg0);
        arg0.field740 = false;
        if (arg0.field724 != -1) {
            class38 var11 = class38.method84(arg0.field724);
            if (var11 == null || var11.field872 == null) {
                arg0.field724 = -1;
            } else {
                arg0.field729++;
                if (arg0.field725 < var11.field872.length && arg0.field729 > var11.field867[arg0.field725]) {
                    arg0.field729 = 1;
                    arg0.field725++;
                    method160(var11, arg0.field725, arg0.field700, arg0.field726);
                }
                if (arg0.field725 >= var11.field872.length) {
                    arg0.field729 = 0;
                    arg0.field725 = 0;
                    method160(var11, arg0.field725, arg0.field700, arg0.field726);
                }
            }
        }
        if (arg0.field732 != -1 && field386 >= arg0.field739) {
            if (arg0.field727 < 0) {
                arg0.field727 = 0;
            }
            int var12 = class39.method1360(arg0.field732).field896;
            if (var12 == -1) {
                arg0.field732 = -1;
            } else {
                class38 var13 = class38.method84(var12);
                if (var13 == null || var13.field872 == null) {
                    arg0.field732 = -1;
                } else {
                    arg0.field734++;
                    if (arg0.field727 < var13.field872.length && arg0.field734 > var13.field867[arg0.field727]) {
                        arg0.field734 = 1;
                        arg0.field727++;
                        method160(var13, arg0.field727, arg0.field700, arg0.field726);
                    }
                    if (arg0.field727 >= var13.field872.length && (arg0.field727 < 0 || arg0.field727 >= var13.field872.length)) {
                        arg0.field732 = -1;
                    }
                }
            }
        }
        if (arg0.field697 != -1 && arg0.field730 <= 1) {
            class38 var14 = class38.method84(arg0.field697);
            if (var14.field886 == 1 && arg0.field754 > 0 && arg0.field741 <= field386 && arg0.field737 < field386) {
                arg0.field730 = 1;
                return;
            }
        }
        if (arg0.field697 != -1 && arg0.field730 == 0) {
            class38 var15 = class38.method84(arg0.field697);
            if (var15 == null || var15.field872 == null) {
                arg0.field697 = -1;
            } else {
                arg0.field735++;
                if (arg0.field702 < var15.field872.length && arg0.field735 > var15.field867[arg0.field702]) {
                    arg0.field735 = 1;
                    arg0.field702++;
                    method160(var15, arg0.field702, arg0.field700, arg0.field726);
                }
                if (arg0.field702 >= var15.field872.length) {
                    arg0.field702 -= var15.field883;
                    arg0.field738++;
                    if (arg0.field738 >= var15.field882) {
                        arg0.field697 = -1;
                    } else if (arg0.field702 >= 0 && arg0.field702 < var15.field872.length) {
                        method160(var15, arg0.field702, arg0.field700, arg0.field726);
                    } else {
                        arg0.field697 = -1;
                    }
                }
                arg0.field740 = var15.field878;
            }
        }
        if (arg0.field730 > 0) {
            arg0.field730--;
        }
    }

    @ObfuscatedName("ak.ag(Laj;B)V")
    public static final void method582(class33 arg0) {
        int var1 = arg0.field741 - field386;
        int var2 = arg0.field745 * 128 + arg0.field701 * 64;
        int var3 = arg0.field708 * 128 + arg0.field701 * 64;
        arg0.field700 += (var2 - arg0.field700) / var1;
        arg0.field726 += (var3 - arg0.field726) / var1;
        arg0.field753 = 0;
        if (arg0.field743 == 0) {
            arg0.field721 = 1024;
        }
        if (arg0.field743 == 1) {
            arg0.field721 = 1536;
        }
        if (arg0.field743 == 2) {
            arg0.field721 = 0;
        }
        if (arg0.field743 == 3) {
            arg0.field721 = 512;
        }
    }

    @ObfuscatedName("as.ad(Laj;B)V")
    public static final void method596(class33 arg0) {
        if (field386 == arg0.field737 || arg0.field697 == -1 || arg0.field730 != 0 || arg0.field735 + 1 > class38.method84(arg0.field697).field867[arg0.field702]) {
            int var1 = arg0.field737 - arg0.field741;
            int var2 = field386 - arg0.field741;
            int var3 = arg0.field745 * 128 + arg0.field701 * 64;
            int var4 = arg0.field708 * 128 + arg0.field701 * 64;
            int var5 = arg0.field701 * 64 + arg0.field699 * 128;
            int var6 = arg0.field742 * 128 + arg0.field701 * 64;
            arg0.field700 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field726 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field753 = 0;
        if (arg0.field743 == 0) {
            arg0.field721 = 1024;
        }
        if (arg0.field743 == 1) {
            arg0.field721 = 1536;
        }
        if (arg0.field743 == 2) {
            arg0.field721 = 0;
        }
        if (arg0.field743 == 3) {
            arg0.field721 = 512;
        }
        arg0.field728 = arg0.field721;
    }

    @ObfuscatedName("f.aj(La;IIB)V")
    public static void method128(class3 arg0, int arg1, int arg2) {
        if (arg0.field697 == arg1 && arg1 != -1) {
            int var3 = class38.method84(arg1).field885;
            if (var3 == 1) {
                arg0.field702 = 0;
                arg0.field735 = 0;
                arg0.field730 = arg2;
                arg0.field738 = 0;
            }
            if (var3 == 2) {
                arg0.field738 = 0;
            }
        } else if (arg1 == -1 || arg0.field697 == -1 || class38.method84(arg1).field876 >= class38.method84(arg0.field697).field876) {
            arg0.field697 = arg1;
            arg0.field702 = 0;
            arg0.field735 = 0;
            arg0.field730 = arg2;
            arg0.field738 = 0;
            arg0.field754 = arg0.field749;
        }
    }

    @ObfuscatedName("cm.as(Ljava/lang/String;ZI)V")
    public static final void method1874(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field630.method3347(arg0, 250);
        int var6 = Statics.field630.method3348(arg0, 250) * 13;
        class73.method1508(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1510(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field630.method3421(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2321(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field2676.getGraphics();
                Statics.field1631.method1325(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field2676.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field447; var13++) {
            if (field463[var13] + field339[var13] > var9 && field463[var13] < var9 + var11 && field455[var13] + field357[var13] > var10 && field357[var13] < var10 + var12) {
                field450[var13] = true;
            }
        }
    }

    @ObfuscatedName("a.al(Laf;I)V")
    public static final void method24(class29 arg0) {
        if (Statics.field1669.field700 >> 7 == field344 && Statics.field1669.field726 >> 7 == field474) {
            field344 = 0;
        }
        int var1 = field365;
        if (class29.field654 == arg0 || class29.field655 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field654 == arg0) {
                var3 = Statics.field1669;
                var4 = 33538048;
            } else if (class29.field655 == arg0) {
                var3 = field364[field316];
                var4 = field316 << 14;
            } else {
                var3 = field364[field366[var2]];
                var4 = field366[var2] << 14;
                if (class29.field659 == arg0 && field316 == field366[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method17()) {
                var3.field49 = false;
                if ((field250 && field365 > 50 || field365 > 200) && class29.field654 != arg0 && var3.field733 == var3.field724) {
                    var3.field49 = true;
                }
                int var5 = var3.field700 >> 7;
                int var6 = var3.field726 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field44 == null || field386 < var3.field39 || field386 >= var3.field36) {
                        if ((var3.field700 & 0x7F) == 64 && (var3.field726 & 0x7F) == 64) {
                            if (field279 == field347[var5][var6]) {
                                continue;
                            }
                            field347[var5][var6] = field279;
                        }
                        var3.field38 = method496(var3.field700, var3.field726, Statics.field1999);
                        Statics.field1490.method1655(Statics.field1999, var3.field700, var3.field726, var3.field38, 60, var3, var3.field728, var4, var3.field740);
                    } else {
                        var3.field49 = false;
                        var3.field38 = method496(var3.field700, var3.field726, Statics.field1999);
                        Statics.field1490.method1614(Statics.field1999, var3.field700, var3.field726, var3.field38, 60, var3, var3.field728, var4, var3.field35, var3.field46, var3.field47, var3.field48);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.ai(ZB)V")
    public static final void method628(boolean arg0) {
        for (int var1 = 0; var1 < field440; var1++) {
            class30 var2 = field376[field363[var1]];
            int var3 = (field363[var1] << 14) + 536870912;
            if (var2 != null && var2.method17() && var2.field664.field792 == arg0 && var2.field664.method606()) {
                int var4 = var2.field700 >> 7;
                int var5 = var2.field726 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field701 == 1 && (var2.field700 & 0x7F) == 64 && (var2.field726 & 0x7F) == 64) {
                        if (field279 == field347[var4][var5]) {
                            continue;
                        }
                        field347[var4][var5] = field279;
                    }
                    if (!var2.field664.field800) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1490.method1655(Statics.field1999, var2.field700, var2.field726, method496(var2.field700 + (var2.field701 * 64 - 64), var2.field726 + (var2.field701 * 64 - 64), Statics.field1999), var2.field701 * 64 - 64 + 60, var2, var2.field728, var3, var2.field740);
                }
            }
        }
    }

    @ObfuscatedName("ag.az(B)V")
    public static final void method568() {
        for (class7 var0 = (class7) field473.method3232(); var0 != null; var0 = (class7) field473.method3251()) {
            if (Statics.field1999 != var0.field94 || field386 > var0.field100) {
                var0.method3311();
            } else if (field386 >= var0.field99) {
                if (var0.field107 > 0) {
                    class30 var1 = field376[var0.field107 - 1];
                    if (var1 != null && var1.field700 >= 0 && var1.field700 < 13312 && var1.field726 >= 0 && var1.field726 < 13312) {
                        var0.method77(var1.field700, var1.field726, method496(var1.field700, var1.field726, var0.field94) - var0.field113, field386);
                    }
                }
                if (var0.field107 < 0) {
                    int var2 = -var0.field107 - 1;
                    class3 var3;
                    if (field468 == var2) {
                        var3 = Statics.field1669;
                    } else {
                        var3 = field364[var2];
                    }
                    if (var3 != null && var3.field700 >= 0 && var3.field700 < 13312 && var3.field726 >= 0 && var3.field726 < 13312) {
                        var0.method77(var3.field700, var3.field726, method496(var3.field700, var3.field726, var0.field94) - var0.field113, field386);
                    }
                }
                var0.method82(field265);
                Statics.field1490.method1655(Statics.field1999, (int) var0.field105, (int) var0.field93, (int) var0.field102, 60, var0, var0.field119, -1, false);
            }
        }
    }

    @ObfuscatedName("n.aw(B)V")
    public static final void method497() {
        for (class26 var0 = (class26) field392.method3232(); var0 != null; var0 = (class26) field392.method3251()) {
            if (Statics.field1999 != var0.field602 || var0.field596) {
                var0.method3311();
            } else if (field386 >= var0.field588) {
                var0.method520(field265);
                if (var0.field596) {
                    var0.method3311();
                } else {
                    Statics.field1490.method1655(var0.field602, var0.field589, var0.field591, var0.field592, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("k.ay(Laj;IIIIII)V")
    public static final void method481(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method17()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field664;
            if (var6.field785 != null) {
                var6 = var6.method605();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field365) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field40 != -1 || var8.field32 != -1) {
                method1876(arg0, arg0.field744 + 15);
                if (field349 > -1) {
                    if (var8.field40 != -1) {
                        Statics.field574[var8.field40].method1422(field349 + arg2 - 12, field457 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field32 != -1) {
                        Statics.field163[var8.field32].method1422(field349 + arg2 - 12, field457 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field262 == 10 && field264 == field366[arg1]) {
                method1876(arg0, arg0.field744 + 15);
                if (field349 > -1) {
                    Statics.field20[1].method1422(field349 + arg2 - 12, field457 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field664;
            if (var9.field785 != null) {
                var9 = var9.method605();
            }
            if (var9.field795 >= 0 && var9.field795 < Statics.field163.length) {
                method1876(arg0, arg0.field744 + 15);
                if (field349 > -1) {
                    Statics.field163[var9.field795].method1422(field349 + arg2 - 12, field457 + arg3 - 30);
                }
            }
            if (field262 == 1 && field263 == field363[arg1 - field365] && field386 % 20 < 10) {
                method1876(arg0, arg0.field744 + 15);
                if (field349 > -1) {
                    Statics.field20[0].method1422(field349 + arg2 - 12, field457 + arg3 - 28);
                }
            }
        }
        if (arg0.field710 != null && (arg1 >= field365 || field458 == 4 || !arg0.field731 && (field458 == 0 || field458 == 3 || field458 == 1 && method883(((class3) arg0).field42, false)))) {
            method1876(arg0, arg0.field744);
            if (field349 > -1 && field337 < field338) {
                field342[field337] = Statics.field568.method3345(arg0.field710) / 2;
                field341[field337] = Statics.field568.field2894;
                field327[field337] = field349;
                field340[field337] = field457;
                field343[field337] = arg0.field713;
                field479[field337] = arg0.field714;
                field270[field337] = arg0.field712;
                field296[field337] = arg0.field710;
                field337++;
            }
        }
        if (arg0.field711 > field386) {
            method1876(arg0, arg0.field744 + 15);
            if (field349 > -1) {
                int var10 = arg0.field719 * 30 / arg0.field720;
                if (var10 > 30) {
                    var10 = 30;
                } else if (var10 == 0 && arg0.field719 > 0) {
                    var10 = 1;
                }
                class73.method1508(field349 + arg2 - 15, field457 + arg3 - 3, var10, 5, 65280);
                class73.method1508(field349 + arg2 - 15 + var10, field457 + arg3 - 3, 30 - var10, 5, 16711680);
            }
        }
        for (int var11 = 0; var11 < 4; var11++) {
            if (arg0.field717[var11] > field386) {
                method1876(arg0, arg0.field744 / 2);
                if (field349 > -1) {
                    if (var11 == 1) {
                        field457 -= 20;
                    }
                    if (var11 == 2) {
                        field349 -= 15;
                        field457 -= 10;
                    }
                    if (var11 == 3) {
                        field349 += 15;
                        field457 -= 10;
                    }
                    Statics.field670[arg0.field716[var11]].method1422(field349 + arg2 - 12, field457 + arg3 - 12);
                    Statics.field1550.method3429(Integer.toString(arg0.field715[var11]), field349 + arg2 - 1, field457 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("u.au(B)V")
    public static final void method139() {
        field398 = 0;
        int var0 = (Statics.field1669.field700 >> 7) + Statics.field928;
        int var1 = (Statics.field1669.field726 >> 7) + Statics.field919;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field398 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field398 = 1;
        }
        if (field398 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field398 = 0;
        }
    }

    @ObfuscatedName("cs.ar(Laj;IB)V")
    public static final void method1876(class33 arg0, int arg1) {
        method493(arg0.field700, arg0.field726, arg1);
    }

    @ObfuscatedName("v.ap(IIII)V")
    public static final void method493(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field349 = -1;
            field457 = -1;
            return;
        }
        int var3 = method496(arg0, arg1, Statics.field1999) - arg2;
        int var4 = arg0 - Statics.field1497;
        int var5 = var3 - Statics.field1648;
        int var6 = arg1 - Statics.field1536;
        int var7 = class84.field1447[Statics.field244];
        int var8 = class84.field1454[Statics.field244];
        int var9 = class84.field1447[Statics.field1939];
        int var10 = class84.field1454[Statics.field1939];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field349 = (var11 << 9) / var15 + 256;
            field457 = (var14 << 9) / var15 + 167;
        } else {
            field349 = -1;
            field457 = -1;
        }
    }

    @ObfuscatedName("n.an(IIII)I")
    public static final int method496(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field74[var5][var3][var4] + class6.field74[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field74[var5][var3][var4 + 1] + class6.field74[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("cl.ae(ZI)V")
    public static final void method1967(boolean arg0) {
        field356 = arg0;
        if (!field356) {
            int var1 = (field288 - field287.field1819) / 16;
            Statics.field222 = new int[var1][4];
            for (int var2 = 0; var2 < var1; var2++) {
                for (int var3 = 0; var3 < 4; var3++) {
                    Statics.field222[var2][var3] = field287.method2165();
                }
            }
            int var4 = field287.method2155();
            int var5 = field287.method2262();
            int var6 = field287.method2239();
            int var7 = field287.method2155();
            int var8 = field287.method2148();
            Statics.field1327 = new int[var1];
            Statics.field674 = new int[var1];
            Statics.field2419 = new int[var1];
            Statics.field856 = new byte[var1][];
            Statics.field1920 = new byte[var1][];
            boolean var9 = false;
            if ((var4 / 8 == 48 || var4 / 8 == 49) && var6 / 8 == 48) {
                var9 = true;
            }
            if (var4 / 8 == 48 && var6 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var4 - 6) / 8; var11 <= (var4 + 6) / 8; var11++) {
                for (int var12 = (var6 - 6) / 8; var12 <= (var6 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1327[var10] = var13;
                        Statics.field674[var10] = Statics.field153.method2707("m" + var11 + "_" + var12);
                        Statics.field2419[var10] = Statics.field153.method2707("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method1864(var4, var6, var8, var5, var7);
            return;
        }
        int var14 = field287.method2155();
        field287.method2381();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field287.method2368(1);
                    if (var18 == 1) {
                        field305[var15][var16][var17] = field287.method2368(26);
                    } else {
                        field305[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field287.method2369();
        int var19 = (field288 - field287.field1819) / 16;
        Statics.field222 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field222[var20][var21] = field287.method2164();
            }
        }
        int var22 = field287.method2186();
        int var23 = field287.method2186();
        int var24 = field287.method2148();
        int var25 = field287.method2155();
        Statics.field1327 = new int[var19];
        Statics.field674 = new int[var19];
        Statics.field2419 = new int[var19];
        Statics.field856 = new byte[var19][];
        Statics.field1920 = new byte[var19][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field305[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1327[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1327[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field674[var26] = Statics.field153.method2707("m" + var35 + "_" + var36);
                            Statics.field2419[var26] = Statics.field153.method2707("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method1864(var14, var23, var24, var22, var25);
    }

    @ObfuscatedName("cm.aa(IIIIII)V")
    public static final void method1864(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field522 == arg0 && Statics.field187 == arg1 && field459 == arg2 || !field250) {
            return;
        }
        Statics.field522 = arg0;
        Statics.field187 = arg1;
        field459 = arg2;
        if (!field250) {
            field459 = 0;
        }
        method2683(25);
        method1874(class142.field2280, true);
        int var5 = Statics.field928;
        int var6 = Statics.field919;
        Statics.field928 = (arg0 - 6) * 8;
        Statics.field919 = (arg1 - 6) * 8;
        int var7 = Statics.field928 - var5;
        int var8 = Statics.field919 - var6;
        int var9 = Statics.field928;
        int var10 = Statics.field919;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field376[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field750[var13] -= var7;
                    var12.field751[var13] -= var8;
                }
                var12.field700 -= var7 * 128;
                var12.field726 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field364[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field750[var16] -= var7;
                    var15.field751[var16] -= var8;
                }
                var15.field700 -= var7 * 128;
                var15.field726 -= var8 * 128;
            }
        }
        Statics.field1999 = arg2;
        Statics.field1669.method589(arg3, arg4, false);
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
                        field379[var27][var23][var24] = field379[var27][var25][var26];
                    } else {
                        field379[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field452.method3232(); var28 != null; var28 = (class15) field452.method3251()) {
            var28.field198 -= var7;
            var28.field199 -= var8;
            if (var28.field198 < 0 || var28.field199 < 0 || var28.field198 >= 104 || var28.field199 >= 104) {
                var28.method3311();
            }
        }
        if (field344 != 0) {
            field344 -= var7;
            field474 -= var8;
        }
        field482 = 0;
        field488 = false;
        field318 = -1;
        field392.method3226();
        field473.method3226();
    }

    @ObfuscatedName("ct.ax(ZI)V")
    public static final void method2060(boolean arg0) {
        method108();
        field291++;
        if (field291 < 50 && !arg0) {
            return;
        }
        field291 = 0;
        if (field304 || Statics.field1670 == null) {
            return;
        }
        field285.method2364(128);
        try {
            Statics.field1670.method2585(field285.field1823, 0, field285.field1819);
            field285.field1819 = 0;
        } catch (IOException var2) {
            field304 = true;
        }
    }

    @ObfuscatedName("ei.am(I)V")
    public static final void method2671() {
        method2060(false);
        field298 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field856.length; var1++) {
            if (Statics.field674[var1] != -1 && Statics.field856[var1] == null) {
                Statics.field856[var1] = Statics.field153.method2705(Statics.field674[var1], 0);
                if (Statics.field856[var1] == null) {
                    var0 = false;
                    field298++;
                }
            }
            if (Statics.field2419[var1] != -1 && Statics.field1920[var1] == null) {
                Statics.field1920[var1] = Statics.field153.method2734(Statics.field2419[var1], 0, Statics.field222[var1]);
                if (Statics.field1920[var1] == null) {
                    var0 = false;
                    field298++;
                }
            }
        }
        if (!var0) {
            field302 = 1;
            return;
        }
        field456 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field856.length; var3++) {
            byte[] var4 = Statics.field1920[var3];
            if (var4 != null) {
                int var5 = (Statics.field1327[var3] >> 8) * 64 - Statics.field928;
                int var6 = (Statics.field1327[var3] & 0xFF) * 64 - Statics.field919;
                if (field356) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class107 var9 = new class107(var4);
                int var10 = -1;
                label515: while (true) {
                    int var11 = var9.method2197();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2197();
                            if (var16 == 0) {
                                continue label515;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2122() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class36 var22 = class36.method167(var10);
                                if (var19 != 22 || !field250 || var22.field835 != 0 || var22.field824 == 1 || var22.field851) {
                                    if (!var22.method652()) {
                                        field456++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2197();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2122();
                    }
                }
            }
        }
        if (!var2) {
            field302 = 2;
            return;
        }
        if (field302 != 0) {
            method1874(class142.field2280 + class2.field31 + class2.field24 + 100 + "%" + class2.field27, true);
        }
        method108();
        method459();
        method108();
        Statics.field1490.method1602();
        method108();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field303[var23].method3514();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field82[var24][var25][var26] = 0;
                }
            }
        }
        method108();
        class6.method564();
        int var27 = Statics.field856.length;
        for (class20 var28 = (class20) class20.field528.method3232(); var28 != null; var28 = (class20) class20.field528.method3251()) {
            if (var28.field532 != null) {
                Statics.field461.method950(var28.field532);
                var28.field532 = null;
            }
            if (var28.field538 != null) {
                Statics.field461.method950(var28.field538);
                var28.field538 = null;
            }
        }
        class20.field528.method3226();
        method2060(true);
        if (!field356) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field1327[var29] >> 8) * 64 - Statics.field928;
                int var31 = (Statics.field1327[var29] & 0xFF) * 64 - Statics.field919;
                byte[] var32 = Statics.field856[var29];
                if (var32 != null) {
                    method108();
                    class6.method515(var32, var30, var31, Statics.field522 * 8 - 48, Statics.field187 * 8 - 48, field303);
                }
            }
            for (int var33 = 0; var33 < var27; var33++) {
                int var34 = (Statics.field1327[var33] >> 8) * 64 - Statics.field928;
                int var35 = (Statics.field1327[var33] & 0xFF) * 64 - Statics.field919;
                byte[] var36 = Statics.field856[var33];
                if (var36 == null && Statics.field187 < 800) {
                    method108();
                    class6.method73(var34, var35, 64, 64);
                }
            }
            method2060(true);
            for (int var37 = 0; var37 < var27; var37++) {
                byte[] var38 = Statics.field1920[var37];
                if (var38 != null) {
                    int var39 = (Statics.field1327[var37] >> 8) * 64 - Statics.field928;
                    int var40 = (Statics.field1327[var37] & 0xFF) * 64 - Statics.field919;
                    method108();
                    class79 var41 = Statics.field1490;
                    class195[] var42 = field303;
                    class107 var43 = new class107(var38);
                    int var44 = -1;
                    while (true) {
                        int var45 = var43.method2197();
                        if (var45 == 0) {
                            break;
                        }
                        var44 += var45;
                        int var46 = 0;
                        while (true) {
                            int var47 = var43.method2197();
                            if (var47 == 0) {
                                break;
                            }
                            var46 += var47 - 1;
                            int var48 = var46 & 0x3F;
                            int var49 = var46 >> 6 & 0x3F;
                            int var50 = var46 >> 12;
                            int var51 = var43.method2122();
                            int var52 = var51 >> 2;
                            int var53 = var51 & 0x3;
                            int var54 = var39 + var49;
                            int var55 = var40 + var48;
                            if (var54 > 0 && var55 > 0 && var54 < 103 && var55 < 103) {
                                int var56 = var50;
                                if ((class6.field82[1][var54][var55] & 0x2) == 2) {
                                    var56 = var50 - 1;
                                }
                                class195 var57 = null;
                                if (var56 >= 0) {
                                    var57 = var42[var56];
                                }
                                class6.method1776(var50, var54, var55, var44, var53, var52, var41, var57);
                            }
                        }
                    }
                }
            }
        }
        if (field356) {
            for (int var58 = 0; var58 < 4; var58++) {
                method108();
                for (int var59 = 0; var59 < 13; var59++) {
                    for (int var60 = 0; var60 < 13; var60++) {
                        boolean var61 = false;
                        int var62 = field305[var58][var59][var60];
                        if (var62 != -1) {
                            int var63 = var62 >> 24 & 0x3;
                            int var64 = var62 >> 1 & 0x3;
                            int var65 = var62 >> 14 & 0x3FF;
                            int var66 = var62 >> 3 & 0x7FF;
                            int var67 = (var65 / 8 << 8) + var66 / 8;
                            for (int var68 = 0; var68 < Statics.field1327.length; var68++) {
                                if (Statics.field1327[var68] == var67 && Statics.field856[var68] != null) {
                                    class6.method7(Statics.field856[var68], var58, var59 * 8, var60 * 8, var63, (var65 & 0x7) * 8, (var66 & 0x7) * 8, var64, field303);
                                    var61 = true;
                                    break;
                                }
                            }
                        }
                        if (!var61) {
                            int var69 = var58;
                            int var70 = var59 * 8;
                            int var71 = var60 * 8;
                            for (int var72 = 0; var72 < 8; var72++) {
                                for (int var73 = 0; var73 < 8; var73++) {
                                    class6.field74[var69][var70 + var72][var71 + var73] = 0;
                                }
                            }
                            if (var70 > 0) {
                                for (int var74 = 1; var74 < 8; var74++) {
                                    class6.field74[var69][var70][var71 + var74] = class6.field74[var69][var70 - 1][var71 + var74];
                                }
                            }
                            if (var71 > 0) {
                                for (int var75 = 1; var75 < 8; var75++) {
                                    class6.field74[var69][var70 + var75][var71] = class6.field74[var69][var70 + var75][var71 - 1];
                                }
                            }
                            if (var70 > 0 && class6.field74[var69][var70 - 1][var71] != 0) {
                                class6.field74[var69][var70][var71] = class6.field74[var69][var70 - 1][var71];
                            } else if (var71 > 0 && class6.field74[var69][var70][var71 - 1] != 0) {
                                class6.field74[var69][var70][var71] = class6.field74[var69][var70][var71 - 1];
                            } else if (var70 > 0 && var71 > 0 && class6.field74[var69][var70 - 1][var71 - 1] != 0) {
                                class6.field74[var69][var70][var71] = class6.field74[var69][var70 - 1][var71 - 1];
                            }
                        }
                    }
                }
            }
            for (int var76 = 0; var76 < 13; var76++) {
                for (int var77 = 0; var77 < 13; var77++) {
                    int var78 = field305[0][var76][var77];
                    if (var78 == -1) {
                        class6.method73(var76 * 8, var77 * 8, 8, 8);
                    }
                }
            }
            method2060(true);
            for (int var79 = 0; var79 < 4; var79++) {
                method108();
                for (int var80 = 0; var80 < 13; var80++) {
                    label337: for (int var81 = 0; var81 < 13; var81++) {
                        int var82 = field305[var79][var80][var81];
                        if (var82 != -1) {
                            int var83 = var82 >> 24 & 0x3;
                            int var84 = var82 >> 1 & 0x3;
                            int var85 = var82 >> 14 & 0x3FF;
                            int var86 = var82 >> 3 & 0x7FF;
                            int var87 = (var85 / 8 << 8) + var86 / 8;
                            for (int var88 = 0; var88 < Statics.field1327.length; var88++) {
                                if (Statics.field1327[var88] == var87 && Statics.field1920[var88] != null) {
                                    byte[] var89 = Statics.field1920[var88];
                                    int var90 = var80 * 8;
                                    int var91 = var81 * 8;
                                    int var92 = (var85 & 0x7) * 8;
                                    int var93 = (var86 & 0x7) * 8;
                                    class79 var94 = Statics.field1490;
                                    class195[] var95 = field303;
                                    class107 var96 = new class107(var89);
                                    int var97 = -1;
                                    while (true) {
                                        int var98 = var96.method2197();
                                        if (var98 == 0) {
                                            continue label337;
                                        }
                                        var97 += var98;
                                        int var99 = 0;
                                        while (true) {
                                            int var100 = var96.method2197();
                                            if (var100 == 0) {
                                                break;
                                            }
                                            var99 += var100 - 1;
                                            int var101 = var99 & 0x3F;
                                            int var102 = var99 >> 6 & 0x3F;
                                            int var103 = var99 >> 12;
                                            int var104 = var96.method2122();
                                            int var105 = var104 >> 2;
                                            int var106 = var104 & 0x3;
                                            if (var83 == var103 && var102 >= var92 && var102 < var92 + 8 && var101 >= var93 && var101 < var93 + 8) {
                                                class36 var107 = class36.method167(var97);
                                                int var108 = var90 + class155.method2577(var102 & 0x7, var101 & 0x7, var84, var107.field822, var107.field823, var106);
                                                int var109 = var91 + class155.method682(var102 & 0x7, var101 & 0x7, var84, var107.field822, var107.field823, var106);
                                                if (var108 > 0 && var109 > 0 && var108 < 103 && var109 < 103) {
                                                    int var110 = var79;
                                                    if ((class6.field82[1][var108][var109] & 0x2) == 2) {
                                                        var110 = var79 - 1;
                                                    }
                                                    class195 var111 = null;
                                                    if (var110 >= 0) {
                                                        var111 = var95[var110];
                                                    }
                                                    class6.method1776(var79, var108, var109, var97, var84 + var106 & 0x3, var105, var94, var111);
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
        method2060(true);
        method459();
        method108();
        class6.method161(Statics.field1490, field303);
        method2060(true);
        int var112 = class6.field84;
        if (var112 > Statics.field1999) {
            var112 = Statics.field1999;
        }
        if (var112 < Statics.field1999 - 1) {
            int var113 = Statics.field1999 - 1;
        }
        if (field250) {
            Statics.field1490.method1648(class6.field84);
        } else {
            Statics.field1490.method1648(0);
        }
        for (int var114 = 0; var114 < 104; var114++) {
            for (int var115 = 0; var115 < 104; var115++) {
                method719(var114, var115);
            }
        }
        method108();
        method31();
        class36.field810.method3164();
        if (Statics.field101 != null) {
            field285.method2364(184);
            field285.method2111(1057001181);
        }
        if (!field356) {
            int var116 = (Statics.field522 - 6) / 8;
            int var117 = (Statics.field522 + 6) / 8;
            int var118 = (Statics.field187 - 6) / 8;
            int var119 = (Statics.field187 + 6) / 8;
            for (int var120 = var116 - 1; var120 <= var117 + 1; var120++) {
                for (int var121 = var118 - 1; var121 <= var119 + 1; var121++) {
                    if (var120 < var116 || var120 > var117 || var121 < var118 || var121 > var119) {
                        Statics.field153.method2725("m" + var120 + "_" + var121);
                        Statics.field153.method2725("l" + var120 + "_" + var121);
                    }
                }
            }
        }
        method2683(30);
        method108();
        Statics.field75 = (byte[][][]) null;
        Statics.field76 = (byte[][][]) null;
        Statics.field77 = (byte[][][]) null;
        Statics.field1975 = (byte[][][]) null;
        Statics.field80 = (int[][][]) null;
        Statics.field1797 = (byte[][][]) null;
        Statics.field78 = (int[][]) null;
        Statics.field355 = null;
        Statics.field79 = null;
        Statics.field1421 = null;
        Statics.field2482 = null;
        Statics.field1901 = null;
        field285.method2364(145);
        class131.method827();
    }

    @ObfuscatedName("ba.ab(II)V")
    public static final void method1322(int arg0) {
        int[] var1 = Statics.field2083.field1283;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field82[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1490.method1634(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field82[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1490.method1634(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2083.method1412();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field82[arg0][var10][var9] & 0x18) == 0) {
                    Statics.method483(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field82[arg0 + 1][var10][var9] & 0x8) != 0) {
                    Statics.method483(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field394 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1490.method1613(Statics.field1999, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class36.method167(var14).field852;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field303[Statics.field1999].field2933;
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
                        field472[field394] = Statics.field1013[var15];
                        field286[field394] = var16;
                        field397[field394] = var17;
                        field394++;
                    }
                }
            }
        }
        Statics.field1631.method1403();
    }

    @ObfuscatedName("s.ah(B)Z")
    public static final boolean method74() {
        if (Statics.field1670 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1670.method2583();
            if (var0 == 0) {
                return false;
            }
            if (field289 == -1) {
                Statics.field1670.method2591(field287.field1823, 0, 1);
                field287.field1819 = 0;
                field289 = field287.method2377();
                field288 = class166.field2790[field289];
                var0--;
            }
            if (field288 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1670.method2591(field287.field1823, 0, 1);
                field288 = field287.field1823[0] & 0xFF;
                var0--;
            }
            if (field288 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1670.method2591(field287.field1823, 0, 2);
                field287.field1819 = 0;
                field288 = field287.method2239();
                var0 -= 2;
            }
            if (var0 < field288) {
                return false;
            }
            field287.field1819 = 0;
            Statics.field1670.method2591(field287.field1823, 0, field288);
            field290 = 0;
            field295 = field294;
            field294 = field293;
            field293 = field289;
            if (field289 == 247) {
                method3440();
                field289 = -1;
                return false;
            }
            if (field289 == 12) {
                String var1 = field287.method2130();
                Object[] var2 = new Object[var1.length() + 1];
                for (int var3 = var1.length() - 1; var3 >= 0; var3--) {
                    if (var1.charAt(var3) == 's') {
                        var2[var3 + 1] = field287.method2130();
                    } else {
                        var2[var3 + 1] = Integer.valueOf(field287.method2127());
                    }
                }
                var2[0] = Integer.valueOf(field287.method2127());
                class1 var4 = new class1();
                var4.field10 = var2;
                Statics.method562(var4);
                field289 = -1;
                return true;
            }
            if (field289 == 179) {
                for (int var5 = 0; var5 < Statics.field2953; var5++) {
                    class46 var6 = (class46) class46.field1029.method3162((long) var5);
                    class46 var7;
                    if (var6 == null) {
                        byte[] var8 = Statics.field1033.method2705(16, var5);
                        class46 var9 = new class46();
                        if (var8 != null) {
                            var9.method889(new class107(var8));
                        }
                        class46.field1029.method3171(var9, (long) var5);
                        var7 = var9;
                    } else {
                        var7 = var6;
                    }
                    if (var7 != null) {
                        class154.field2646[var5] = 0;
                        class154.field2649[var5] = 0;
                    }
                }
                method574();
                field496 += 32;
                field289 = -1;
                return true;
            }
            if (field289 == 38) {
                for (int var11 = 0; var11 < field364.length; var11++) {
                    if (field364[var11] != null) {
                        field364[var11].field697 = -1;
                    }
                }
                for (int var12 = 0; var12 < field376.length; var12++) {
                    if (field376[var12] != null) {
                        field376[var12].field697 = -1;
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 121) {
                field495 = 1;
                field437 = field462;
                field289 = -1;
                return true;
            }
            if (field289 == 241) {
                class110 var13 = field287;
                int var14 = field288;
                class186 var15 = new class186();
                var15.field2862 = var13.method2122();
                var15.field2867 = var13.method2127();
                var15.field2863 = new int[var15.field2862];
                var15.field2865 = new int[var15.field2862];
                var15.field2870 = new Field[var15.field2862];
                var15.field2866 = new int[var15.field2862];
                var15.field2869 = new Method[var15.field2862];
                var15.field2868 = new byte[var15.field2862][][];
                for (int var16 = 0; var16 < var15.field2862; var16++) {
                    try {
                        int var17 = var13.method2122();
                        if (var17 == 0 || var17 == 1 || var17 == 2) {
                            String var18 = new String(var13.method2130());
                            String var19 = new String(var13.method2130());
                            int var20 = 0;
                            if (var17 == 1) {
                                var20 = var13.method2127();
                            }
                            var15.field2863[var16] = var17;
                            var15.field2866[var16] = var20;
                            var15.field2870[var16] = class187.method484(var18).getDeclaredField(var19);
                        } else if (var17 == 3 || var17 == 4) {
                            String var21 = new String(var13.method2130());
                            String var22 = new String(var13.method2130());
                            int var23 = var13.method2122();
                            String[] var24 = new String[var23];
                            for (int var25 = 0; var25 < var23; var25++) {
                                var24[var25] = new String(var13.method2130());
                            }
                            byte[][] var26 = new byte[var23][];
                            if (var17 == 3) {
                                for (int var27 = 0; var27 < var23; var27++) {
                                    int var28 = var13.method2127();
                                    var26[var27] = new byte[var28];
                                    var13.method2133(var26[var27], 0, var28);
                                }
                            }
                            var15.field2863[var16] = var17;
                            Class[] var29 = new Class[var23];
                            for (int var30 = 0; var30 < var23; var30++) {
                                var29[var30] = class187.method484(var24[var30]);
                            }
                            var15.field2869[var16] = class187.method484(var21).getDeclaredMethod(var22, var29);
                            var15.field2868[var16] = var26;
                        }
                    } catch (ClassNotFoundException var274) {
                        var15.field2865[var16] = -1;
                    } catch (SecurityException var275) {
                        var15.field2865[var16] = -2;
                    } catch (NullPointerException var276) {
                        var15.field2865[var16] = -3;
                    } catch (Exception var277) {
                        var15.field2865[var16] = -4;
                    } catch (Throwable var278) {
                        var15.field2865[var16] = -5;
                    }
                }
                class187.field2871.method3227(var15);
                field289 = -1;
                return true;
            }
            if (field289 == 116) {
                String var36 = field287.method2130();
                long var37 = field287.method2128();
                long var39 = (long) field287.method2239();
                long var41 = (long) field287.method2212();
                int var43 = field287.method2122();
                long var44 = (var39 << 32) + var41;
                boolean var46 = false;
                for (int var47 = 0; var47 < 100; var47++) {
                    if (field460[var47] == var44) {
                        var46 = true;
                        break;
                    }
                }
                if (var43 <= 1 && method2535(var36)) {
                    var46 = true;
                }
                if (!var46 && field398 == 0) {
                    field460[field292] = var44;
                    field292 = (field292 + 1) % 100;
                    class110 var48 = field287;
                    String var49 = Statics.method1875(var48, 32767);
                    String var50 = class190.method3367(class197.method1963(var49));
                    if (var43 == 2 || var43 == 3) {
                        class10.method494(9, class2.method817(1) + var36, var50, class196.method168(var37));
                    } else if (var43 == 1) {
                        class10.method494(9, class2.method817(0) + var36, var50, class196.method168(var37));
                    } else {
                        class10.method494(9, var36, var50, class196.method168(var37));
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 117) {
                String var51 = field287.method2130();
                long var52 = (long) field287.method2239();
                long var54 = (long) field287.method2212();
                int var56 = field287.method2122();
                long var57 = (var52 << 32) + var54;
                boolean var59 = false;
                for (int var60 = 0; var60 < 100; var60++) {
                    if (field460[var60] == var57) {
                        var59 = true;
                        break;
                    }
                }
                if (method2535(var51)) {
                    var59 = true;
                }
                if (!var59 && field398 == 0) {
                    field460[field292] = var57;
                    field292 = (field292 + 1) % 100;
                    class110 var61 = field287;
                    String var62 = Statics.method1875(var61, 32767);
                    String var63 = class190.method3367(class197.method1963(var62));
                    if (var56 == 2 || var56 == 3) {
                        class10.method2425(7, class2.method817(1) + var51, var63);
                    } else if (var56 == 1) {
                        class10.method2425(7, class2.method817(0) + var51, var63);
                    } else {
                        class10.method2425(3, var51, var63);
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 5) {
                Statics.field1242 = field287.method2148();
                Statics.field307 = field287.method2122();
                while (field287.field1819 < field288) {
                    field289 = field287.method2122();
                    method1878();
                }
                field289 = -1;
                return true;
            }
            if (field289 == 82) {
                method574();
                field410 = field287.method2122();
                field275 = field462;
                field289 = -1;
                return true;
            }
            if (field289 == 207) {
                int var64 = field287.method2262();
                class14.method127(var64);
                field432[++field433 - 1 & 0x1F] = var64 & 0x7FFF;
                field289 = -1;
                return true;
            }
            if (field289 == 89) {
                class22 var65 = new class22();
                var65.field553 = field287.method2130();
                var65.field558 = field287.method2239();
                int var66 = field287.method2127();
                var65.field557 = var66;
                method2683(45);
                Statics.field1670.method2581();
                Statics.field1670 = null;
                class28.method148(var65);
                field289 = -1;
                return false;
            }
            if (field289 == 183) {
                int var67 = field287.method2127();
                class4 var68 = (class4) field362.method3204((long) var67);
                if (var68 != null) {
                    method2691(var68, true);
                }
                if (field323 != null) {
                    method151(field323);
                    field323 = null;
                }
                field289 = -1;
                return true;
            }
            if (field289 == 36) {
                int var69 = field287.method2148();
                int var70 = field287.method2147();
                int var71 = field287.method2148();
                Statics.field1999 = var71 >> 1;
                Statics.field1669.method589(var70, var69, (var71 & 0x1) == 1);
                field289 = -1;
                return true;
            }
            if (field289 == 58) {
                int var72 = field287.method2155();
                int var73 = field287.method2186();
                int var74 = field287.method2163();
                int var75 = field287.method2239();
                class152 var76 = class152.method124(var74);
                if (var76.field2590 != var75 || var76.field2563 != var72 || var76.field2565 != var73) {
                    var76.field2590 = var75;
                    var76.field2563 = var72;
                    var76.field2565 = var73;
                    method151(var76);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 244) {
                int var77 = field288 + field287.field1819;
                int var78 = field287.method2239();
                int var79 = field287.method2239();
                if (field381 != var78) {
                    field381 = var78;
                    method526(field381);
                    Statics.method2418(field381);
                    for (int var80 = 0; var80 < 100; var80++) {
                        field449[var80] = true;
                    }
                }
                while (var79-- > 0) {
                    int var81 = field287.method2127();
                    int var82 = field287.method2239();
                    int var83 = field287.method2122();
                    class4 var84 = (class4) field362.method3204((long) var81);
                    if (var84 != null && var84.field58 != var82) {
                        method2691(var84, true);
                        var84 = null;
                    }
                    if (var84 == null) {
                        class4 var85 = new class4();
                        var85.field58 = var82;
                        var85.field60 = var83;
                        field362.method3205(var85, (long) var81);
                        method526(var82);
                        Statics.method2418(var82);
                        class152 var86 = class152.method124(var81);
                        if (var86 != null) {
                            method151(var86);
                        }
                        if (field323 != null) {
                            method151(field323);
                            field323 = null;
                        }
                        method78();
                        if (field381 != -1) {
                            method28(field381, 1);
                        }
                        var84 = var85;
                    }
                    var84.field56 = true;
                }
                for (class4 var88 = (class4) field362.method3197(); var88 != null; var88 = (class4) field362.method3200()) {
                    if (var88.field56) {
                        var88.field56 = false;
                    } else {
                        method2691(var88, true);
                    }
                }
                field446 = new class174(512);
                while (field287.field1819 < var77) {
                    int var89 = field287.method2127();
                    int var90 = field287.method2239();
                    int var91 = field287.method2239();
                    int var92 = field287.method2127();
                    for (int var93 = var90; var93 <= var91; var93++) {
                        long var94 = ((long) var89 << 32) + (long) var93;
                        field446.method3205(new class179(var92), var94);
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 165) {
                method1967(false);
                field289 = -1;
                return true;
            }
            if (field289 == 107) {
                int var96 = field287.method2155();
                int var97 = field287.method2127();
                int var98 = var96 >> 10 & 0x1F;
                int var99 = var96 >> 5 & 0x1F;
                int var100 = var96 & 0x1F;
                int var101 = (var100 << 3) + (var98 << 19) + (var99 << 11);
                class152 var102 = class152.method124(var97);
                if (var102.field2625 != var101) {
                    var102.field2625 = var101;
                    method151(var102);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 204) {
                field344 = field287.method2122();
                if (field344 == 255) {
                    field344 = 0;
                }
                field474 = field287.method2122();
                if (field474 == 255) {
                    field474 = 0;
                }
                field289 = -1;
                return true;
            }
            if (field289 == 69) {
                for (int var103 = 0; var103 < class154.field2649.length; var103++) {
                    if (class154.field2649[var103] != class154.field2646[var103]) {
                        class154.field2649[var103] = class154.field2646[var103];
                        method1962(var103);
                        field430[++field496 - 1 & 0x1F] = var103;
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 22) {
                int var104 = field287.method2127();
                int var105 = field287.method2186();
                class152 var106 = class152.method124(var104);
                if (var106 != null && var106.field2524 == 0) {
                    if (var105 > var106.field2538 - var106.field2584) {
                        var105 = var106.field2538 - var106.field2584;
                    }
                    if (var105 < 0) {
                        var105 = 0;
                    }
                    if (var106.field2536 != var105) {
                        var106.field2536 = var105;
                        method151(var106);
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 236) {
                method574();
                int var107 = field287.method2148();
                int var108 = field287.method2147();
                int var109 = field287.method2164();
                field385[var107] = var109;
                field383[var107] = var108;
                field384[var107] = 1;
                for (int var110 = 0; var110 < 98; var110++) {
                    if (var109 >= class140.field2118[var110]) {
                        field384[var107] = var110 + 2;
                    }
                }
                field434[++field435 - 1 & 0x1F] = var107;
                field289 = -1;
                return true;
            }
            if (field289 == 156) {
                Statics.field1242 = field287.method2147();
                Statics.field307 = field287.method2135();
                field289 = -1;
                return true;
            }
            if (field289 == 47) {
                field488 = true;
                Statics.field1228 = field287.method2122();
                Statics.field1803 = field287.method2122();
                Statics.field158 = field287.method2239();
                Statics.field679 = field287.method2122();
                Statics.field1466 = field287.method2122();
                if (Statics.field1466 >= 100) {
                    int var111 = Statics.field1228 * 128 + 64;
                    int var112 = Statics.field1803 * 128 + 64;
                    int var113 = method496(var111, var112, Statics.field1999) - Statics.field158;
                    int var114 = var111 - Statics.field1497;
                    int var115 = var113 - Statics.field1648;
                    int var116 = var112 - Statics.field1536;
                    int var117 = (int) Math.sqrt((double) (var114 * var114 + var116 * var116));
                    Statics.field244 = (int) (Math.atan2((double) var115, (double) var117) * 325.949D) & 0x7FF;
                    Statics.field1939 = (int) (Math.atan2((double) var114, (double) var116) * -325.949D) & 0x7FF;
                    if (Statics.field244 < 128) {
                        Statics.field244 = 128;
                    }
                    if (Statics.field244 > 383) {
                        Statics.field244 = 383;
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 240) {
                while (field287.field1819 < field288) {
                    int var118 = field287.method2122();
                    boolean var119 = (var118 & 0x1) == 1;
                    String var120 = field287.method2130();
                    String var121 = field287.method2130();
                    field287.method2130();
                    for (int var122 = 0; var122 < field498; var122++) {
                        class8 var123 = field464[var122];
                        if (var119) {
                            if (var121.equals(var123.field127)) {
                                var123.field127 = var120;
                                var123.field126 = var121;
                                var120 = null;
                                break;
                            }
                        } else if (var120.equals(var123.field127)) {
                            var123.field127 = var120;
                            var123.field126 = var121;
                            var120 = null;
                            break;
                        }
                    }
                    if (var120 != null && field498 < 400) {
                        class8 var124 = new class8();
                        field464[field498] = var124;
                        var124.field127 = var120;
                        var124.field126 = var121;
                        field498++;
                    }
                }
                field437 = field462;
                field289 = -1;
                return true;
            }
            if (field289 == 135 || field289 == 216 || field289 == 61 || field289 == 27 || field289 == 18 || field289 == 177 || field289 == 125 || field289 == 73 || field289 == 189 || field289 == 70) {
                method1878();
                field289 = -1;
                return true;
            }
            if (field289 == 63) {
                int var125 = field287.method2164();
                int var126 = field287.method2155();
                class152 var127 = class152.method124(var125);
                if (var127.field2617 != 2 || var127.field2543 != var126) {
                    var127.field2617 = 2;
                    var127.field2543 = var126;
                    method151(var127);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 227) {
                int var128 = field287.method2164();
                int var129 = field287.method2186();
                int var130 = field287.method2148();
                class4 var131 = (class4) field362.method3204((long) var128);
                if (var131 != null) {
                    method2691(var131, var131.field58 != var129);
                }
                class4 var132 = new class4();
                var132.field58 = var129;
                var132.field60 = var130;
                field362.method3205(var132, (long) var128);
                method526(var129);
                Statics.method2418(var129);
                class152 var133 = class152.method124(var128);
                if (var133 != null) {
                    method151(var133);
                }
                if (field323 != null) {
                    method151(field323);
                    field323 = null;
                }
                method78();
                if (field381 != -1) {
                    method28(field381, 1);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 88) {
                int var134 = field287.method2127();
                int var135 = field287.method2239();
                if (var134 < -70000) {
                    var135 += 32768;
                }
                class152 var136;
                if (var134 >= 0) {
                    var136 = class152.method124(var134);
                } else {
                    var136 = null;
                }
                while (field287.field1819 < field288) {
                    int var137 = field287.method2197();
                    int var138 = field287.method2239();
                    int var139 = 0;
                    if (var138 != 0) {
                        var139 = field287.method2122();
                        if (var139 == 255) {
                            var139 = field287.method2127();
                        }
                    }
                    if (var136 != null && var137 >= 0 && var137 < var136.field2624.length) {
                        var136.field2624[var137] = var138;
                        var136.field2573[var137] = var139;
                    }
                    class14.method1879(var135, var137, var138 - 1, var139);
                }
                if (var136 != null) {
                    method151(var136);
                }
                method574();
                field432[++field433 - 1 & 0x1F] = var135 & 0x7FFF;
                field289 = -1;
                return true;
            }
            if (field289 == 195) {
                String var140 = field287.method2130();
                class110 var141 = field287;
                String var142 = Statics.method1875(var141, 32767);
                String var143 = class190.method3367(class197.method1963(var142));
                class10.method2425(6, var140, var143);
                field289 = -1;
                return true;
            }
            if (field289 == 155) {
                int var144 = field287.method2239();
                int var145 = field287.method2122();
                int var146 = field287.method2239();
                if (field454 != 0 && var145 != 0 && field482 < 50) {
                    field483[field482] = var144;
                    field484[field482] = var145;
                    field485[field482] = var146;
                    field487[field482] = null;
                    field486[field482] = 0;
                    field482++;
                }
                field289 = -1;
                return true;
            }
            if (field289 == 212) {
                while (field287.field1819 < field288) {
                    boolean var150 = field287.method2122() == 1;
                    String var151 = field287.method2130();
                    String var152 = field287.method2130();
                    int var153 = field287.method2239();
                    int var154 = field287.method2122();
                    int var155 = field287.method2122();
                    boolean var156 = (var155 & 0x2) != 0;
                    boolean var157 = (var155 & 0x1) != 0;
                    if (var153 > 0) {
                        field287.method2130();
                        field287.method2122();
                        field287.method2127();
                    }
                    field287.method2130();
                    for (int var158 = 0; var158 < field361; var158++) {
                        class16 var159 = field315[var158];
                        if (var150) {
                            if (var152.equals(var159.field221)) {
                                var159.field221 = var151;
                                var159.field219 = var152;
                                var151 = null;
                                break;
                            }
                        } else if (var151.equals(var159.field221)) {
                            if (var159.field216 != var153) {
                                boolean var160 = true;
                                for (class34 var161 = (class34) field497.method3189(); var161 != null; var161 = (class34) field497.method3188()) {
                                    if (var161.field756.equals(var151)) {
                                        if (var153 != 0 && var161.field758 == 0) {
                                            var161.method3307();
                                            var160 = false;
                                        } else if (var153 == 0 && var161.field758 != 0) {
                                            var161.method3307();
                                            var160 = false;
                                        }
                                    }
                                }
                                if (var160) {
                                    field497.method3191(new class34(var151, var153));
                                }
                                var159.field216 = var153;
                            }
                            var159.field219 = var152;
                            var159.field217 = var154;
                            var159.field218 = var156;
                            var159.field224 = var157;
                            var151 = null;
                            break;
                        }
                    }
                    if (var151 != null && field361 < 400) {
                        class16 var162 = new class16();
                        field315[field361] = var162;
                        var162.field221 = var151;
                        var162.field219 = var152;
                        var162.field216 = var153;
                        var162.field217 = var154;
                        var162.field218 = var156;
                        var162.field224 = var157;
                        field361++;
                    }
                }
                field495 = 2;
                field437 = field462;
                boolean var163 = false;
                int var164 = field361;
                while (var164 > 0) {
                    boolean var165 = true;
                    var164--;
                    for (int var166 = 0; var166 < var164; var166++) {
                        boolean var167 = false;
                        class16 var168 = field315[var166];
                        class16 var169 = field315[var166 + 1];
                        if (field245 != var168.field216 && field245 == var169.field216) {
                            var167 = true;
                        }
                        if (!var167 && var168.field216 == 0 && var169.field216 != 0) {
                            var167 = true;
                        }
                        if (!var167 && !var168.field218 && var169.field218) {
                            var167 = true;
                        }
                        if (!var167 && !var168.field224 && var169.field224) {
                            var167 = true;
                        }
                        if (var167) {
                            class16 var170 = field315[var166];
                            field315[var166] = field315[var166 + 1];
                            field315[var166 + 1] = var170;
                            var165 = false;
                        }
                    }
                    if (var165) {
                        break;
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 110) {
                int var171 = field287.method2157();
                int var172 = field287.method2163();
                class152 var173 = class152.method124(var172);
                if (var173.field2591 != var171 || var171 == -1) {
                    var173.field2591 = var171;
                    var173.field2525 = 0;
                    var173.field2629 = 0;
                    method151(var173);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 76) {
                int var174 = field287.method2122();
                int var175 = field287.method2122();
                int var176 = field287.method2122();
                int var177 = field287.method2122();
                field402[var174] = true;
                field490[var174] = var175;
                field491[var174] = var176;
                field492[var174] = var177;
                field493[var174] = 0;
                field289 = -1;
                return true;
            }
            if (field289 == 150) {
                Statics.field307 = field287.method2122();
                Statics.field1242 = field287.method2135();
                for (int var178 = Statics.field307; var178 < Statics.field307 + 8; var178++) {
                    for (int var179 = Statics.field1242; var179 < Statics.field1242 + 8; var179++) {
                        if (field379[Statics.field1999][var178][var179] != null) {
                            field379[Statics.field1999][var178][var179] = null;
                            method719(var178, var179);
                        }
                    }
                }
                for (class15 var180 = (class15) field452.method3232(); var180 != null; var180 = (class15) field452.method3251()) {
                    if (var180.field198 >= Statics.field307 && var180.field198 < Statics.field307 + 8 && var180.field199 >= Statics.field1242 && var180.field199 < Statics.field1242 + 8 && Statics.field1999 == var180.field210) {
                        var180.field212 = 0;
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 152) {
                String var181 = field287.method2130();
                int var182 = field287.method2239();
                byte var183 = field287.method2201();
                boolean var184 = false;
                if (var183 == -128) {
                    var184 = true;
                }
                if (var184) {
                    if (Statics.field861 == 0) {
                        field289 = -1;
                        return true;
                    }
                    boolean var185 = false;
                    int var186;
                    for (var186 = 0; var186 < Statics.field861 && (!Statics.field2474[var186].field548.equals(var181) || Statics.field2474[var186].field545 != var182); var186++) {
                    }
                    if (var186 < Statics.field861) {
                        while (var186 < Statics.field861 - 1) {
                            Statics.field2474[var186] = Statics.field2474[var186 + 1];
                            var186++;
                        }
                        Statics.field861--;
                        Statics.field2474[Statics.field861] = null;
                    }
                } else {
                    field287.method2130();
                    class21 var187 = new class21();
                    var187.field548 = var181;
                    var187.field546 = class198.method1858(var187.field548, Statics.field1222);
                    var187.field545 = var182;
                    var187.field544 = var183;
                    int var188;
                    for (var188 = Statics.field861 - 1; var188 >= 0; var188--) {
                        int var189 = Statics.field2474[var188].field546.compareTo(var187.field548);
                        if (var189 == 0) {
                            Statics.field2474[var188].field545 = var182;
                            Statics.field2474[var188].field544 = var183;
                            if (var181.equals(Statics.field1669.field42)) {
                                Statics.field1872 = var183;
                            }
                            field438 = field462;
                            field289 = -1;
                            return true;
                        }
                        if (var189 < 0) {
                            break;
                        }
                    }
                    if (Statics.field861 >= Statics.field2474.length) {
                        field289 = -1;
                        return true;
                    }
                    for (int var190 = Statics.field861 - 1; var190 > var188; var190--) {
                        Statics.field2474[var190 + 1] = Statics.field2474[var190];
                    }
                    if (Statics.field861 == 0) {
                        Statics.field2474 = new class21[100];
                    }
                    Statics.field2474[var188 + 1] = var187;
                    Statics.field861++;
                    if (var181.equals(Statics.field1669.field42)) {
                        Statics.field1872 = var183;
                    }
                }
                field438 = field462;
                field289 = -1;
                return true;
            }
            if (field289 == 0) {
                int var191 = field287.method2155();
                int var192 = field287.method2165();
                int var193 = field287.method2239();
                class152 var194 = class152.method124(var192);
                var194.field2566 = (var193 << 16) + var191;
                field289 = -1;
                return true;
            }
            if (field289 == 215) {
                method1777();
                field289 = -1;
                return true;
            }
            if (field289 == 6) {
                method99();
                field289 = -1;
                return true;
            }
            if (field289 == 93) {
                int var195 = field287.method2127();
                int var196 = field287.method2239();
                if (var195 < -70000) {
                    var196 += 32768;
                }
                class152 var197;
                if (var195 >= 0) {
                    var197 = class152.method124(var195);
                } else {
                    var197 = null;
                }
                if (var197 != null) {
                    for (int var198 = 0; var198 < var197.field2624.length; var198++) {
                        var197.field2624[var198] = 0;
                        var197.field2573[var198] = 0;
                    }
                }
                class14.method2507(var196);
                int var199 = field287.method2239();
                for (int var200 = 0; var200 < var199; var200++) {
                    int var201 = field287.method2148();
                    if (var201 == 255) {
                        var201 = field287.method2127();
                    }
                    int var202 = field287.method2239();
                    if (var197 != null && var200 < var197.field2624.length) {
                        var197.field2624[var200] = var202;
                        var197.field2573[var200] = var201;
                    }
                    class14.method1879(var196, var200, var202 - 1, var201);
                }
                if (var197 != null) {
                    method151(var197);
                }
                method574();
                field432[++field433 - 1 & 0x1F] = var196 & 0x7FFF;
                field289 = -1;
                return true;
            }
            if (field289 == 174) {
                field475 = field287.method2122();
                field289 = -1;
                return true;
            }
            if (field289 == 214) {
                int var203 = field287.method2165();
                String var204 = field287.method2130();
                class152 var205 = class152.method124(var203);
                if (!var204.equals(var205.field2603)) {
                    var205.field2603 = var204;
                    method151(var205);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 25) {
                int var206 = field287.method2165();
                class152 var207 = class152.method124(var206);
                for (int var208 = 0; var208 < var207.field2624.length; var208++) {
                    var207.field2624[var208] = -1;
                    var207.field2624[var208] = 0;
                }
                method151(var207);
                field289 = -1;
                return true;
            }
            if (field289 == 106) {
                method1967(true);
                field289 = -1;
                return true;
            }
            if (field289 == 137) {
                field471 = field287.method2186() * 30;
                field275 = field462;
                field289 = -1;
                return true;
            }
            if (field289 == 253) {
                field438 = field462;
                if (field288 == 0) {
                    field466 = null;
                    field467 = null;
                    Statics.field861 = 0;
                    Statics.field2474 = null;
                    field289 = -1;
                    return true;
                }
                field467 = field287.method2130();
                long var209 = field287.method2128();
                field466 = class196.method174(var209);
                Statics.field1802 = field287.method2201();
                int var211 = field287.method2122();
                if (var211 == 255) {
                    field289 = -1;
                    return true;
                }
                Statics.field861 = var211;
                class21[] var212 = new class21[100];
                for (int var213 = 0; var213 < Statics.field861; var213++) {
                    var212[var213] = new class21();
                    var212[var213].field548 = field287.method2130();
                    var212[var213].field546 = class198.method1858(var212[var213].field548, Statics.field1222);
                    var212[var213].field545 = field287.method2239();
                    var212[var213].field544 = field287.method2201();
                    field287.method2130();
                    if (var212[var213].field548.equals(Statics.field1669.field42)) {
                        Statics.field1872 = var212[var213].field544;
                    }
                }
                boolean var214 = false;
                int var215 = Statics.field861;
                while (var215 > 0) {
                    boolean var216 = true;
                    var215--;
                    for (int var217 = 0; var217 < var215; var217++) {
                        if (var212[var217].field546.compareTo(var212[var217 + 1].field546) > 0) {
                            class21 var218 = var212[var217];
                            var212[var217] = var212[var217 + 1];
                            var212[var217 + 1] = var218;
                            var216 = false;
                        }
                    }
                    if (var216) {
                        break;
                    }
                }
                Statics.field2474 = var212;
                field289 = -1;
                return true;
            }
            if (field289 == 8) {
                method574();
                field411 = field287.method2125();
                field275 = field462;
                field289 = -1;
                return true;
            }
            if (field289 == 198) {
                int var219 = field287.method2127();
                int var220 = field287.method2155();
                class154.field2646[var220] = var219;
                if (class154.field2649[var220] != var219) {
                    class154.field2649[var220] = var219;
                    method1962(var220);
                }
                field430[++field496 - 1 & 0x1F] = var220;
                field289 = -1;
                return true;
            }
            if (field289 == 7) {
                field262 = field287.method2122();
                if (field262 == 1) {
                    field263 = field287.method2239();
                }
                if (field262 >= 2 && field262 <= 6) {
                    if (field262 == 2) {
                        field268 = 64;
                        field429 = 64;
                    }
                    if (field262 == 3) {
                        field268 = 0;
                        field429 = 64;
                    }
                    if (field262 == 4) {
                        field268 = 128;
                        field429 = 64;
                    }
                    if (field262 == 5) {
                        field268 = 64;
                        field429 = 0;
                    }
                    if (field262 == 6) {
                        field268 = 64;
                        field429 = 128;
                    }
                    field262 = 2;
                    field406 = field287.method2239();
                    field266 = field287.method2239();
                    field444 = field287.method2122();
                }
                if (field262 == 10) {
                    field264 = field287.method2239();
                }
                field289 = -1;
                return true;
            }
            if (field289 == 248) {
                int var221 = field287.method2186();
                if (var221 == 65535) {
                    var221 = -1;
                }
                method1402(var221);
                field289 = -1;
                return true;
            }
            if (field289 == 254) {
                int var222 = field287.method2159();
                int var223 = field287.method2239();
                if (var223 == 65535) {
                    var223 = -1;
                }
                method2068(var223, var222);
                field289 = -1;
                return true;
            }
            if (field289 == 218) {
                int var224 = field287.method2122();
                int var225 = field287.method2135();
                String var226 = field287.method2130();
                if (var225 >= 1 && var225 <= 8) {
                    if (var226.equalsIgnoreCase("null")) {
                        var226 = null;
                    }
                    field375[var225 - 1] = var226;
                    field405[var225 - 1] = var224 == 0;
                }
                field289 = -1;
                return true;
            }
            if (field289 == 185) {
                int var227 = field287.method2262();
                field381 = var227;
                method526(var227);
                Statics.method2418(field381);
                for (int var228 = 0; var228 < 100; var228++) {
                    field449[var228] = true;
                }
                field289 = -1;
                return true;
            }
            if (field289 == 138) {
                field488 = true;
                Statics.field235 = field287.method2122();
                Statics.field585 = field287.method2122();
                Statics.field125 = field287.method2239();
                Statics.field916 = field287.method2122();
                Statics.field1224 = field287.method2122();
                if (Statics.field1224 >= 100) {
                    Statics.field1497 = Statics.field235 * 128 + 64;
                    Statics.field1536 = Statics.field585 * 128 + 64;
                    Statics.field1648 = method496(Statics.field1497, Statics.field1536, Statics.field1999) - Statics.field125;
                }
                field289 = -1;
                return true;
            }
            if (field289 == 46) {
                int var229 = field287.method2157();
                int var230 = field287.method2163();
                int var231 = field287.method2157();
                class152 var232 = class152.method124(var230);
                int var233 = var232.field2529 + var231;
                int var234 = var232.field2530 + var229;
                if (var232.field2527 != var233 || var232.field2528 != var234) {
                    var232.field2527 = var233;
                    var232.field2528 = var234;
                    method151(var232);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 23) {
                int var235 = field287.method2155();
                byte var236 = field287.method2201();
                class154.field2646[var235] = var236;
                if (class154.field2649[var235] != var236) {
                    class154.field2649[var235] = var236;
                    method1962(var235);
                }
                field430[++field496 - 1 & 0x1F] = var235;
                field289 = -1;
                return true;
            }
            if (field289 == 202) {
                int var237 = field287.method2127();
                int var238 = field287.method2239();
                if (var238 == 65535) {
                    var238 = -1;
                }
                int var239 = field287.method2262();
                if (var239 == 65535) {
                    var239 = -1;
                }
                int var240 = field287.method2165();
                for (int var241 = var238; var241 <= var239; var241++) {
                    long var242 = ((long) var237 << 32) + (long) var241;
                    class184 var244 = field446.method3204(var242);
                    if (var244 != null) {
                        var244.method3311();
                    }
                    field446.method3205(new class179(var240), var242);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 221) {
                int var245 = field287.method2262();
                int var246 = field287.method2163();
                class152 var247 = class152.method124(var246);
                if (var247.field2617 != 1 || var247.field2543 != var245) {
                    var247.field2617 = 1;
                    var247.field2543 = var245;
                    method151(var247);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 99) {
                int var248 = field287.method2197();
                boolean var249 = field287.method2122() == 1;
                String var250 = "";
                boolean var251 = false;
                if (var249) {
                    var250 = field287.method2130();
                    if (method2535(var250)) {
                        var251 = true;
                    }
                }
                String var252 = field287.method2130();
                if (!var251) {
                    class10.method2425(var248, var250, var252);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 112) {
                boolean var253 = field287.method2135() == 1;
                int var254 = field287.method2164();
                class152 var255 = class152.method124(var254);
                if (var255.field2534 != var253) {
                    var255.field2534 = var253;
                    method151(var255);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 3) {
                field488 = false;
                for (int var256 = 0; var256 < 5; var256++) {
                    field402[var256] = false;
                }
                field289 = -1;
                return true;
            }
            if (field289 == 238) {
                field287.field1819 += 28;
                if (field287.method2141()) {
                    class110 var257 = field287;
                    int var258 = field287.field1819 - 28;
                    if (class136.field2077 != null) {
                        try {
                            class136.field2077.method3457(0L);
                            class136.field2077.method3462(var257.field1823, var258, 24);
                        } catch (Exception var273) {
                        }
                    }
                }
                field289 = -1;
                return true;
            }
            if (field289 == 44) {
                int var260 = field287.method2127();
                class152 var261 = class152.method124(var260);
                var261.field2617 = 3;
                var261.field2543 = Statics.field1669.field33.method2936();
                method151(var261);
                field289 = -1;
                return true;
            }
            if (field289 == 167) {
                field458 = field287.method2122();
                field330 = field287.method2122();
                field289 = -1;
                return true;
            }
            if (field289 == 184) {
                if (field381 != -1) {
                    method28(field381, 0);
                }
                field289 = -1;
                return true;
            }
            if (field289 == 50) {
                int var262 = field287.method2163();
                Statics.field555 = Statics.field1881.method2499(var262);
                field289 = -1;
                return true;
            }
            if (field289 == 126) {
                Statics.field1557 = class117.method1023(field287.method2122());
                field289 = -1;
                return true;
            }
            if (field289 == 32) {
                int var263 = field287.method2127();
                int var264 = field287.method2163();
                int var265 = field287.method2262();
                if (var265 == 65535) {
                    var265 = -1;
                }
                class152 var266 = class152.method124(var263);
                if (var266.field2636) {
                    var266.field2606 = var265;
                    var266.field2627 = var264;
                    class45 var268 = class45.method158(var265);
                    var266.field2590 = var268.field987;
                    var266.field2563 = var268.field993;
                    var266.field2549 = var268.field994;
                    var266.field2546 = var268.field995;
                    var266.field2544 = var268.field996;
                    var266.field2565 = var268.field979;
                    if (var266.field2531 > 0) {
                        var266.field2565 = var266.field2565 * 32 / var266.field2531;
                    }
                    method151(var266);
                } else if (var265 == -1) {
                    var266.field2617 = 0;
                    field289 = -1;
                    return true;
                } else {
                    class45 var267 = class45.method158(var265);
                    var266.field2617 = 4;
                    var266.field2543 = var265;
                    var266.field2590 = var267.field987;
                    var266.field2563 = var267.field993;
                    var266.field2565 = var267.field979 * 100 / var264;
                    method151(var266);
                }
                field289 = -1;
                return true;
            }
            class135.method2452("" + field289 + class2.field22 + field294 + class2.field22 + field295 + class2.field22 + field288, (Throwable) null);
            method3440();
        } catch (IOException var279) {
            method125();
        } catch (Exception var280) {
            String var271 = "" + field289 + class2.field22 + field294 + class2.field22 + field295 + class2.field22 + field288 + class2.field22 + (Statics.field928 + Statics.field1669.field750[0]) + class2.field22 + (Statics.field919 + Statics.field1669.field751[0]) + class2.field22;
            for (int var272 = 0; var272 < field288 && var272 < 50; var272++) {
                var271 = var271 + field287.field1823[var272] + class2.field22;
            }
            class135.method2452(var271, var280);
            method3440();
        }
        return true;
    }

    @ObfuscatedName("cs.ac(B)V")
    public static final void method1878() {
        if (field289 == 189) {
            int var0 = field287.method2147();
            int var1 = (var0 >> 4 & 0x7) + Statics.field307;
            int var2 = (var0 & 0x7) + Statics.field1242;
            int var3 = field287.method2148();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field306[var4];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method598(Statics.field1999, var1, var2, var6, -1, var4, var5, 0, -1);
            }
        } else if (field289 == 27) {
            int var7 = field287.method2122();
            int var8 = (var7 >> 4 & 0x7) + Statics.field307;
            int var9 = (var7 & 0x7) + Statics.field1242;
            int var10 = field287.method2239();
            int var11 = field287.method2122();
            int var12 = field287.method2239();
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                int var13 = var8 * 128 + 64;
                int var14 = var9 * 128 + 64;
                class26 var15 = new class26(var10, Statics.field1999, var13, var14, method496(var13, var14, Statics.field1999) - var11, var12, field386);
                field392.method3227(var15);
            }
        } else if (field289 == 177) {
            int var16 = field287.method2135();
            int var17 = (var16 >> 4 & 0x7) + Statics.field307;
            int var18 = (var16 & 0x7) + Statics.field1242;
            int var19 = field287.method2239();
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                class177 var20 = field379[Statics.field1999][var17][var18];
                if (var20 != null) {
                    for (class25 var21 = (class25) var20.method3232(); var21 != null; var21 = (class25) var20.method3251()) {
                        if ((var19 & 0x7FFF) == var21.field579) {
                            var21.method3311();
                            break;
                        }
                    }
                    if (var20.method3232() == null) {
                        field379[Statics.field1999][var17][var18] = null;
                    }
                    method719(var17, var18);
                }
            }
        } else if (field289 == 70) {
            int var22 = field287.method2147();
            int var23 = (var22 >> 4 & 0x7) + Statics.field307;
            int var24 = (var22 & 0x7) + Statics.field1242;
            int var25 = field287.method2155();
            int var26 = field287.method2135();
            int var27 = var26 >> 2;
            int var28 = var26 & 0x3;
            int var29 = field306[var27];
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                method598(Statics.field1999, var23, var24, var29, var25, var27, var28, 0, -1);
            }
        } else if (field289 == 125) {
            int var30 = field287.method2155();
            int var31 = field287.method2147();
            int var32 = (var31 >> 4 & 0x7) + Statics.field307;
            int var33 = (var31 & 0x7) + Statics.field1242;
            int var34 = field287.method2186();
            if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                class25 var35 = new class25();
                var35.field579 = var34;
                var35.field584 = var30;
                if (field379[Statics.field1999][var32][var33] == null) {
                    field379[Statics.field1999][var32][var33] = new class177();
                }
                field379[Statics.field1999][var32][var33].method3227(var35);
                method719(var32, var33);
            }
        } else {
            if (field289 == 61) {
                int var36 = field287.method2262();
                int var37 = field287.method2262();
                byte var38 = field287.method2150();
                byte var39 = field287.method2149();
                int var40 = field287.method2262();
                byte var41 = field287.method2150();
                int var42 = field287.method2155();
                byte var43 = field287.method2201();
                int var44 = field287.method2122();
                int var45 = var44 >> 2;
                int var46 = var44 & 0x3;
                int var47 = field306[var45];
                int var48 = field287.method2148();
                int var49 = (var48 >> 4 & 0x7) + Statics.field307;
                int var50 = (var48 & 0x7) + Statics.field1242;
                class3 var51;
                if (field468 == var36) {
                    var51 = Statics.field1669;
                } else {
                    var51 = field364[var36];
                }
                if (var51 != null) {
                    class36 var52 = class36.method167(var37);
                    int var53;
                    int var54;
                    if (var46 == 1 || var46 == 3) {
                        var53 = var52.field823;
                        var54 = var52.field822;
                    } else {
                        var53 = var52.field822;
                        var54 = var52.field823;
                    }
                    int var55 = (var53 >> 1) + var49;
                    int var56 = (var53 + 1 >> 1) + var49;
                    int var57 = (var54 >> 1) + var50;
                    int var58 = (var54 + 1 >> 1) + var50;
                    int[][] var59 = class6.field74[Statics.field1999];
                    int var60 = var59[var55][var57] + var59[var56][var57] + var59[var55][var58] + var59[var56][var58] >> 2;
                    int var61 = (var49 << 7) + (var53 << 6);
                    int var62 = (var50 << 7) + (var54 << 6);
                    class98 var63 = var52.method633(var45, var46, var59, var61, var60, var62);
                    if (var63 != null) {
                        method598(Statics.field1999, var49, var50, var47, -1, 0, 0, var42 + 1, var40 + 1);
                        var51.field39 = field386 + var42;
                        var51.field36 = field386 + var40;
                        var51.field44 = var63;
                        var51.field45 = var49 * 128 + var53 * 64;
                        var51.field43 = var50 * 128 + var54 * 64;
                        var51.field34 = var60;
                        if (var39 > var43) {
                            byte var64 = var39;
                            var39 = var43;
                            var43 = var64;
                        }
                        if (var38 > var41) {
                            byte var65 = var38;
                            var38 = var41;
                            var41 = var65;
                        }
                        var51.field35 = var39 + var49;
                        var51.field47 = var43 + var49;
                        var51.field46 = var38 + var50;
                        var51.field48 = var41 + var50;
                    }
                }
            }
            if (field289 == 135) {
                int var66 = field287.method2122();
                int var67 = (var66 >> 4 & 0x7) + Statics.field307;
                int var68 = (var66 & 0x7) + Statics.field1242;
                int var69 = field287.method2239();
                int var70 = field287.method2122();
                int var71 = var70 >> 4 & 0xF;
                int var72 = var70 & 0x7;
                int var73 = field287.method2122();
                if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                    int var74 = var71 + 1;
                    if (Statics.field1669.field750[0] >= var67 - var74 && Statics.field1669.field750[0] <= var67 + var74 && Statics.field1669.field751[0] >= var68 - var74 && Statics.field1669.field751[0] <= var68 + var74 && field251 != 0 && var72 > 0 && field482 < 50) {
                        field483[field482] = var69;
                        field484[field482] = var72;
                        field485[field482] = var73;
                        field487[field482] = null;
                        field486[field482] = (var67 << 16) + (var68 << 8) + var71;
                        field482++;
                    }
                }
            }
            if (field289 == 18) {
                int var75 = field287.method2122();
                int var76 = (var75 >> 4 & 0x7) + Statics.field307;
                int var77 = (var75 & 0x7) + Statics.field1242;
                int var78 = var76 + field287.method2201();
                int var79 = var77 + field287.method2201();
                int var80 = field287.method2125();
                int var81 = field287.method2239();
                int var82 = field287.method2122() * 4;
                int var83 = field287.method2122() * 4;
                int var84 = field287.method2239();
                int var85 = field287.method2239();
                int var86 = field287.method2122();
                int var87 = field287.method2122();
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104 && var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104 && var81 != 65535) {
                    int var88 = var76 * 128 + 64;
                    int var89 = var77 * 128 + 64;
                    int var90 = var78 * 128 + 64;
                    int var91 = var79 * 128 + 64;
                    class7 var92 = new class7(var81, Statics.field1999, var88, var89, method496(var88, var89, Statics.field1999) - var82, field386 + var84, field386 + var85, var86, var87, var80, var83);
                    var92.method77(var90, var91, method496(var90, var91, Statics.field1999) - var83, field386 + var84);
                    field473.method3227(var92);
                }
            } else if (field289 == 216) {
                int var93 = field287.method2122();
                int var94 = (var93 >> 4 & 0x7) + Statics.field307;
                int var95 = (var93 & 0x7) + Statics.field1242;
                int var96 = field287.method2239();
                int var97 = field287.method2239();
                int var98 = field287.method2239();
                if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                    class177 var99 = field379[Statics.field1999][var94][var95];
                    if (var99 != null) {
                        for (class25 var100 = (class25) var99.method3232(); var100 != null; var100 = (class25) var99.method3251()) {
                            if ((var96 & 0x7FFF) == var100.field579 && var100.field584 == var97) {
                                var100.field584 = var98;
                                break;
                            }
                        }
                        method719(var94, var95);
                    }
                }
            } else if (field289 == 73) {
                int var101 = field287.method2135();
                int var102 = (var101 >> 4 & 0x7) + Statics.field307;
                int var103 = (var101 & 0x7) + Statics.field1242;
                int var104 = field287.method2135();
                int var105 = var104 >> 2;
                int var106 = var104 & 0x3;
                int var107 = field306[var105];
                int var108 = field287.method2239();
                if (var102 >= 0 && var103 >= 0 && var102 < 103 && var103 < 103) {
                    if (var107 == 0) {
                        class80 var109 = Statics.field1490.method1733(Statics.field1999, var102, var103);
                        if (var109 != null) {
                            int var110 = var109.field1399 >> 14 & 0x7FFF;
                            if (var105 == 2) {
                                var109.field1392 = new class11(var110, 2, var106 + 4, Statics.field1999, var102, var103, var108, false, var109.field1392);
                                var109.field1398 = new class11(var110, 2, var106 + 1 & 0x3, Statics.field1999, var102, var103, var108, false, var109.field1398);
                            } else {
                                var109.field1392 = new class11(var110, var105, var106, Statics.field1999, var102, var103, var108, false, var109.field1392);
                            }
                        }
                    }
                    if (var107 == 1) {
                        class87 var111 = Statics.field1490.method1625(Statics.field1999, var102, var103);
                        if (var111 != null) {
                            int var112 = var111.field1468 >> 14 & 0x7FFF;
                            if (var105 == 4 || var105 == 5) {
                                var111.field1473 = new class11(var112, 4, var106, Statics.field1999, var102, var103, var108, false, var111.field1473);
                            } else if (var105 == 6) {
                                var111.field1473 = new class11(var112, 4, var106 + 4, Statics.field1999, var102, var103, var108, false, var111.field1473);
                            } else if (var105 == 7) {
                                var111.field1473 = new class11(var112, 4, (var106 + 2 & 0x3) + 4, Statics.field1999, var102, var103, var108, false, var111.field1473);
                            } else if (var105 == 8) {
                                var111.field1473 = new class11(var112, 4, var106 + 4, Statics.field1999, var102, var103, var108, false, var111.field1473);
                                var111.field1474 = new class11(var112, 4, (var106 + 2 & 0x3) + 4, Statics.field1999, var102, var103, var108, false, var111.field1474);
                            }
                        }
                    }
                    if (var107 == 2) {
                        class91 var113 = Statics.field1490.method1626(Statics.field1999, var102, var103);
                        if (var105 == 11) {
                            var105 = 10;
                        }
                        if (var113 != null) {
                            var113.field1526 = new class11(var113.field1534 >> 14 & 0x7FFF, var105, var106, Statics.field1999, var102, var103, var108, false, var113.field1526);
                        }
                    }
                    if (var107 == 3) {
                        class86 var114 = Statics.field1490.method1707(Statics.field1999, var102, var103);
                        if (var114 != null) {
                            var114.field1458 = new class11(var114.field1459 >> 14 & 0x7FFF, 22, var106, Statics.field1999, var102, var103, var108, false, var114.field1458);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.av(IIIIIIIIIB)V")
    public static final void method598(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field452.method3232(); var10 != null; var10 = (class15) field452.method3251()) {
            if (var10.field210 == arg0 && var10.field198 == arg1 && var10.field199 == arg2 && var10.field211 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field210 = arg0;
            var9.field211 = arg3;
            var9.field198 = arg1;
            var9.field199 = arg2;
            method150(var9);
            field452.method3227(var9);
        }
        var9.field208 = arg4;
        var9.field205 = arg5;
        var9.field204 = arg6;
        var9.field206 = arg7;
        var9.field212 = arg8;
    }

    @ObfuscatedName("i.bp(B)V")
    public static final void method31() {
        for (class15 var0 = (class15) field452.method3232(); var0 != null; var0 = (class15) field452.method3251()) {
            if (var0.field212 == -1) {
                var0.field206 = 0;
                method150(var0);
            } else {
                var0.method3311();
            }
        }
    }

    @ObfuscatedName("c.bg(Lc;I)V")
    public static final void method150(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field211 == 0) {
            var1 = Statics.field1490.method1627(arg0.field210, arg0.field198, arg0.field199);
        }
        if (arg0.field211 == 1) {
            var1 = Statics.field1490.method1628(arg0.field210, arg0.field198, arg0.field199);
        }
        if (arg0.field211 == 2) {
            var1 = Statics.field1490.method1629(arg0.field210, arg0.field198, arg0.field199);
        }
        if (arg0.field211 == 3) {
            var1 = Statics.field1490.method1613(arg0.field210, arg0.field198, arg0.field199);
        }
        if (var1 != 0) {
            int var5 = Statics.field1490.method1631(arg0.field210, arg0.field198, arg0.field199, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field200 = var2;
        arg0.field197 = var3;
        arg0.field201 = var4;
    }

    @ObfuscatedName("u.by(IIIIIIII)V")
    public static final void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field250 && Statics.field1999 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1490.method1627(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1490.method1628(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1490.method1629(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1490.method1613(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1490.method1631(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1490.method1619(arg0, arg2, arg3);
                class36 var15 = class36.method167(var12);
                if (var15.field824 != 0) {
                    field303[arg0].method3495(arg2, arg3, var13, var14, var15.field813);
                }
            }
            if (arg1 == 1) {
                Statics.field1490.method1620(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1490.method1621(arg0, arg2, arg3);
                class36 var16 = class36.method167(var12);
                if (var16.field822 + arg2 > 103 || var16.field822 + arg3 > 103 || var16.field823 + arg2 > 103 || var16.field823 + arg3 > 103) {
                    return;
                }
                if (var16.field824 != 0) {
                    field303[arg0].method3488(arg2, arg3, var16.field822, var16.field823, var14, var16.field813);
                }
            }
            if (arg1 == 3) {
                Statics.field1490.method1769(arg0, arg2, arg3);
                class36 var17 = class36.method167(var12);
                if (var17.field824 == 1) {
                    field303[arg0].method3489(arg2, arg3);
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
        class79 var19 = Statics.field1490;
        class195 var20 = field303[arg0];
        class36 var21 = class36.method167(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field823;
            var23 = var21.field822;
        } else {
            var22 = var21.field822;
            var23 = var21.field823;
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
        if (var21.field835 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field847 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class78 var34;
            if (var21.field830 == -1 && var21.field848 == null) {
                var34 = var21.method633(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class11(arg4, 22, arg5, var18, arg2, arg3, var21.field830, true, (class78) null);
            }
            var19.method1608(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field824 == 1) {
                var20.method3508(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class78 var57;
            if (var21.field830 == -1 && var21.field848 == null) {
                var57 = var21.method633(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class11(arg4, 10, arg5, var18, arg2, arg3, var21.field830, true, (class78) null);
            }
            if (var57 != null) {
                var19.method1612(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field824 != 0) {
                var20.method3507(arg2, arg3, var22, var23, var21.field813);
            }
        } else if (arg6 >= 12) {
            class78 var35;
            if (var21.field830 == -1 && var21.field848 == null) {
                var35 = var21.method633(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field830, true, (class78) null);
            }
            var19.method1612(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field824 != 0) {
                var20.method3507(arg2, arg3, var22, var23, var21.field813);
            }
        } else if (arg6 == 0) {
            class78 var36;
            if (var21.field830 == -1 && var21.field848 == null) {
                var36 = var21.method633(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class11(arg4, 0, arg5, var18, arg2, arg3, var21.field830, true, (class78) null);
            }
            var19.method1610(arg0, arg2, arg3, var29, var36, (class78) null, class6.field83[arg5], 0, var32, var33);
            if (var21.field824 != 0) {
                var20.method3482(arg2, arg3, arg6, arg5, var21.field813);
            }
        } else if (arg6 == 1) {
            class78 var37;
            if (var21.field830 == -1 && var21.field848 == null) {
                var37 = var21.method633(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class11(arg4, 1, arg5, var18, arg2, arg3, var21.field830, true, (class78) null);
            }
            var19.method1610(arg0, arg2, arg3, var29, var37, (class78) null, class6.field91[arg5], 0, var32, var33);
            if (var21.field824 != 0) {
                var20.method3482(arg2, arg3, arg6, arg5, var21.field813);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class78 var39;
            class78 var40;
            if (var21.field830 == -1 && var21.field848 == null) {
                var39 = var21.method633(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method633(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class11(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field830, true, (class78) null);
                var40 = new class11(arg4, 2, var38, var18, arg2, arg3, var21.field830, true, (class78) null);
            }
            var19.method1610(arg0, arg2, arg3, var29, var39, var40, class6.field83[arg5], class6.field83[var38], var32, var33);
            if (var21.field824 != 0) {
                var20.method3482(arg2, arg3, arg6, arg5, var21.field813);
            }
        } else if (arg6 == 3) {
            class78 var41;
            if (var21.field830 == -1 && var21.field848 == null) {
                var41 = var21.method633(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class11(arg4, 3, arg5, var18, arg2, arg3, var21.field830, true, (class78) null);
            }
            var19.method1610(arg0, arg2, arg3, var29, var41, (class78) null, class6.field91[arg5], 0, var32, var33);
            if (var21.field824 != 0) {
                var20.method3482(arg2, arg3, arg6, arg5, var21.field813);
            }
        } else if (arg6 == 9) {
            class78 var42;
            if (var21.field830 == -1 && var21.field848 == null) {
                var42 = var21.method633(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class11(arg4, arg6, arg5, var18, arg2, arg3, var21.field830, true, (class78) null);
            }
            var19.method1612(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field824 != 0) {
                var20.method3507(arg2, arg3, var22, var23, var21.field813);
            }
        } else if (arg6 == 4) {
            class78 var43;
            if (var21.field830 == -1 && var21.field848 == null) {
                var43 = var21.method633(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field830, true, (class78) null);
            }
            var19.method1611(arg0, arg2, arg3, var29, var43, (class78) null, class6.field83[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1627(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class36.method167(var45 >> 14 & 0x7FFF).field826;
            }
            class78 var46;
            if (var21.field830 == -1 && var21.field848 == null) {
                var46 = var21.method633(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class11(arg4, 4, arg5, var18, arg2, arg3, var21.field830, true, (class78) null);
            }
            var19.method1611(arg0, arg2, arg3, var29, var46, (class78) null, class6.field83[arg5], 0, class6.field81[arg5] * var44, class6.field85[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1627(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class36.method167(var48 >> 14 & 0x7FFF).field826 / 2;
            }
            class78 var49;
            if (var21.field830 == -1 && var21.field848 == null) {
                var49 = var21.method633(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field830, true, (class78) null);
            }
            var19.method1611(arg0, arg2, arg3, var29, var49, (class78) null, 256, arg5, class6.field73[arg5] * var47, class6.field87[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class78 var51;
            if (var21.field830 == -1 && var21.field848 == null) {
                var51 = var21.method633(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class11(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field830, true, (class78) null);
            }
            var19.method1611(arg0, arg2, arg3, var29, var51, (class78) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1627(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class36.method167(var53 >> 14 & 0x7FFF).field826 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class78 var55;
            class78 var56;
            if (var21.field830 == -1 && var21.field848 == null) {
                var55 = var21.method633(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method633(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class11(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field830, true, (class78) null);
                var56 = new class11(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field830, true, (class78) null);
            }
            var19.method1611(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field73[arg5] * var52, class6.field87[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("aw.bi(IIB)V")
    public static final void method719(int arg0, int arg1) {
        class177 var2 = field379[Statics.field1999][arg0][arg1];
        if (var2 == null) {
            Statics.field1490.method1623(Statics.field1999, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3232(); var6 != null; var6 = (class25) var2.method3251()) {
            class45 var7 = class45.method158(var6.field579);
            long var8 = (long) var7.field1027;
            if (var7.field997 == 1) {
                var8 = (long) (var6.field584 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1490.method1623(Statics.field1999, arg0, arg1);
            return;
        }
        var2.method3228(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3232(); var12 != null; var12 = (class25) var2.method3251()) {
            if (var5.field579 != var12.field579) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field579 != var12.field579 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1490.method1716(Statics.field1999, arg0, arg1, method496(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1999), var5, var13, var10, var11);
    }

    @ObfuscatedName("p.bz(I)V")
    public static final void method99() {
        field372 = 0;
        field367 = 0;
        method517();
        method1392();
        method166();
        method788();
        for (int var0 = 0; var0 < field372; var0++) {
            int var1 = field297[var0];
            if (field386 != field364[var1].field704) {
                field364[var1] = null;
            }
        }
        if (field288 != field287.field1819) {
            throw new RuntimeException(field287.field1819 + class2.field22 + field288);
        }
        for (int var2 = 0; var2 < field365; var2++) {
            if (field364[field366[var2]] == null) {
                throw new RuntimeException(var2 + class2.field22 + field365);
            }
        }
    }

    @ObfuscatedName("m.be(I)V")
    public static final void method517() {
        field287.method2381();
        int var0 = field287.method2368(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field287.method2368(2);
        if (var1 == 0) {
            field368[++field367 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field287.method2368(3);
            Statics.field1669.method593(var2, false);
            int var3 = field287.method2368(1);
            if (var3 == 1) {
                field368[++field367 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field287.method2368(3);
            Statics.field1669.method593(var4, true);
            int var5 = field287.method2368(3);
            Statics.field1669.method593(var5, true);
            int var6 = field287.method2368(1);
            if (var6 == 1) {
                field368[++field367 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field287.method2368(7);
            Statics.field1999 = field287.method2368(2);
            int var8 = field287.method2368(1);
            if (var8 == 1) {
                field368[++field367 - 1] = 2047;
            }
            int var9 = field287.method2368(7);
            int var10 = field287.method2368(1);
            Statics.field1669.method589(var7, var9, var10 == 1);
        }
    }

    @ObfuscatedName("bx.bm(B)V")
    public static final void method1392() {
        int var0 = field287.method2368(8);
        if (var0 < field365) {
            for (int var1 = var0; var1 < field365; var1++) {
                field297[++field372 - 1] = field366[var1];
            }
        }
        if (var0 > field365) {
            throw new RuntimeException("");
        }
        field365 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field366[var2];
            class3 var4 = field364[var3];
            int var5 = field287.method2368(1);
            if (var5 == 0) {
                field366[++field365 - 1] = var3;
                var4.field704 = field386;
            } else {
                int var6 = field287.method2368(2);
                if (var6 == 0) {
                    field366[++field365 - 1] = var3;
                    var4.field704 = field386;
                    field368[++field367 - 1] = var3;
                } else if (var6 == 1) {
                    field366[++field365 - 1] = var3;
                    var4.field704 = field386;
                    int var7 = field287.method2368(3);
                    var4.method593(var7, false);
                    int var8 = field287.method2368(1);
                    if (var8 == 1) {
                        field368[++field367 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field366[++field365 - 1] = var3;
                    var4.field704 = field386;
                    int var9 = field287.method2368(3);
                    var4.method593(var9, true);
                    int var10 = field287.method2368(3);
                    var4.method593(var10, true);
                    int var11 = field287.method2368(1);
                    if (var11 == 1) {
                        field368[++field367 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field297[++field372 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("w.bq(B)V")
    public static final void method166() {
        while (true) {
            if (field287.method2367(field288) >= 11) {
                int var0 = field287.method2368(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field364[var0] == null) {
                        field364[var0] = new class3();
                        if (field271[var0] != null) {
                            field364[var0].method14(field271[var0]);
                        }
                        var1 = true;
                    }
                    field366[++field365 - 1] = var0;
                    class3 var2 = field364[var0];
                    var2.field704 = field386;
                    int var3 = field287.method2368(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field287.method2368(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field322[field287.method2368(3)];
                    if (var1) {
                        var2.field721 = var2.field728 = var5;
                    }
                    int var6 = field287.method2368(1);
                    int var7 = field287.method2368(1);
                    if (var7 == 1) {
                        field368[++field367 - 1] = var0;
                    }
                    var2.method589(Statics.field1669.field750[0] + var4, Statics.field1669.field751[0] + var3, var6 == 1);
                    continue;
                }
            }
            field287.method2369();
            return;
        }
    }

    @ObfuscatedName("ar.bu(I)V")
    public static final void method788() {
        for (int var0 = 0; var0 < field367; var0++) {
            int var1 = field368[var0];
            class3 var2 = field364[var1];
            int var3 = field287.method2122();
            if ((var3 & 0x40) != 0) {
                var3 += field287.method2122() << 8;
            }
            method21(var1, var2, var3);
        }
    }

    @ObfuscatedName("a.bo(ILa;II)V")
    public static final void method21(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x200) != 0) {
            arg1.field732 = field287.method2186();
            int var3 = field287.method2165();
            arg1.field736 = var3 >> 16;
            arg1.field739 = (var3 & 0xFFFF) + field386;
            arg1.field727 = 0;
            arg1.field734 = 0;
            if (arg1.field739 > field386) {
                arg1.field727 = -1;
            }
            if (arg1.field732 == 65535) {
                arg1.field732 = -1;
            }
        }
        if ((arg2 & 0x10) != 0) {
            int var4 = field287.method2262();
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = field287.method2122();
            method128(arg1, var4, var5);
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field710 = field287.method2130();
            if (arg1.field710.charAt(0) == '~') {
                arg1.field710 = arg1.field710.substring(1);
                class10.method2425(2, arg1.field42, arg1.field710);
            } else if (Statics.field1669 == arg1) {
                class10.method2425(2, arg1.field42, arg1.field710);
            }
            arg1.field731 = false;
            arg1.field713 = 0;
            arg1.field714 = 0;
            arg1.field712 = 150;
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field698 = field287.method2262();
            if (arg1.field698 == 65535) {
                arg1.field698 = -1;
            }
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field746 = field287.method2186();
            arg1.field723 = field287.method2239();
        }
        if ((arg2 & 0x2) != 0) {
            int var6 = field287.method2122();
            byte[] var7 = new byte[var6];
            class107 var8 = new class107(var7);
            field287.method2311(var7, 0, var6);
            field271[arg0] = var8;
            arg1.method14(var8);
        }
        if ((arg2 & 0x100) != 0) {
            int var9 = field287.method2148();
            int var10 = field287.method2122();
            arg1.method588(var9, var10, field386);
            arg1.field711 = field386 + 300;
            arg1.field719 = field287.method2147();
            arg1.field720 = field287.method2122();
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field745 = field287.method2148();
            arg1.field708 = field287.method2122();
            arg1.field699 = field287.method2148();
            arg1.field742 = field287.method2148();
            arg1.field741 = field287.method2239() + field386;
            arg1.field737 = field287.method2155() + field386;
            arg1.field743 = field287.method2135();
            arg1.field749 = 1;
            arg1.field754 = 0;
        }
        if ((arg2 & 0x20) != 0) {
            int var11 = field287.method2147();
            int var12 = field287.method2148();
            arg1.method588(var11, var12, field386);
            arg1.field711 = field386 + 300;
            arg1.field719 = field287.method2148();
            arg1.field720 = field287.method2147();
        }
        if ((arg2 & 0x4) == 0) {
            return;
        }
        int var13 = field287.method2155();
        int var14 = field287.method2122();
        boolean var15 = field287.method2122() == 1;
        int var16 = field287.method2147();
        int var17 = field287.field1819;
        if (arg1.field42 != null && arg1.field33 != null) {
            boolean var18 = false;
            if (var14 <= 1 && method2535(arg1.field42)) {
                var18 = true;
            }
            if (!var18 && field398 == 0) {
                field422.field1819 = 0;
                field287.method2133(field422.field1823, 0, var16);
                field422.field1819 = 0;
                class107 var19 = field422;
                String var20 = Statics.method1875(var19, 32767);
                String var21 = class190.method3367(class197.method1963(var20));
                arg1.field710 = var21.trim();
                arg1.field713 = var13 >> 8;
                arg1.field714 = var13 & 0xFF;
                arg1.field712 = 150;
                arg1.field731 = var15;
                if (var14 == 2 || var14 == 3) {
                    class10.method2425(var15 ? 91 : 1, class2.method817(1) + arg1.field42, var21);
                } else if (var14 == 1) {
                    class10.method2425(var15 ? 91 : 1, class2.method817(0) + arg1.field42, var21);
                } else {
                    class10.method2425(var15 ? 90 : 2, arg1.field42, var21);
                }
            }
        }
        field287.field1819 = var16 + var17;
    }

    @ObfuscatedName("ck.bh(B)V")
    public static final void method1777() {
        field372 = 0;
        field367 = 0;
        field287.method2381();
        int var0 = field287.method2368(8);
        if (var0 < field440) {
            for (int var1 = var0; var1 < field440; var1++) {
                field297[++field372 - 1] = field363[var1];
            }
        }
        if (var0 > field440) {
            throw new RuntimeException("");
        }
        field440 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field363[var2];
            class30 var4 = field376[var3];
            int var5 = field287.method2368(1);
            if (var5 == 0) {
                field363[++field440 - 1] = var3;
                var4.field704 = field386;
            } else {
                int var6 = field287.method2368(2);
                if (var6 == 0) {
                    field363[++field440 - 1] = var3;
                    var4.field704 = field386;
                    field368[++field367 - 1] = var3;
                } else if (var6 == 1) {
                    field363[++field440 - 1] = var3;
                    var4.field704 = field386;
                    int var7 = field287.method2368(3);
                    var4.method593(var7, false);
                    int var8 = field287.method2368(1);
                    if (var8 == 1) {
                        field368[++field367 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field363[++field440 - 1] = var3;
                    var4.field704 = field386;
                    int var9 = field287.method2368(3);
                    var4.method593(var9, true);
                    int var10 = field287.method2368(3);
                    var4.method593(var10, true);
                    int var11 = field287.method2368(1);
                    if (var11 == 1) {
                        field368[++field367 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field297[++field372 - 1] = var3;
                }
            }
        }
        method2400();
        for (int var12 = 0; var12 < field367; var12++) {
            int var13 = field368[var12];
            class30 var14 = field376[var13];
            int var15 = field287.method2122();
            if ((var15 & 0x40) != 0) {
                var14.field664 = class35.method514(field287.method2239());
                var14.field701 = var14.field664.field790;
                var14.field748 = var14.field664.field796;
                var14.field705 = var14.field664.field779;
                var14.field706 = var14.field664.field780;
                var14.field707 = var14.field664.field782;
                var14.field722 = var14.field664.field803;
                var14.field733 = var14.field664.field767;
                var14.field703 = var14.field664.field777;
                var14.field755 = var14.field664.field778;
            }
            if ((var15 & 0x4) != 0) {
                var14.field710 = field287.method2130();
                var14.field712 = 100;
            }
            if ((var15 & 0x2) != 0) {
                var14.field746 = field287.method2155();
                var14.field723 = field287.method2155();
            }
            if ((var15 & 0x20) != 0) {
                var14.field732 = field287.method2186();
                int var16 = field287.method2164();
                var14.field736 = var16 >> 16;
                var14.field739 = (var16 & 0xFFFF) + field386;
                var14.field727 = 0;
                var14.field734 = 0;
                if (var14.field739 > field386) {
                    var14.field727 = -1;
                }
                if (var14.field732 == 65535) {
                    var14.field732 = -1;
                }
            }
            if ((var15 & 0x10) != 0) {
                var14.field698 = field287.method2155();
                if (var14.field698 == 65535) {
                    var14.field698 = -1;
                }
            }
            if ((var15 & 0x1) != 0) {
                int var17 = field287.method2135();
                int var18 = field287.method2135();
                var14.method588(var17, var18, field386);
                var14.field711 = field386 + 300;
                var14.field719 = field287.method2147();
                var14.field720 = field287.method2135();
            }
            if ((var15 & 0x80) != 0) {
                int var19 = field287.method2147();
                int var20 = field287.method2147();
                var14.method588(var19, var20, field386);
                var14.field711 = field386 + 300;
                var14.field719 = field287.method2148();
                var14.field720 = field287.method2147();
            }
            if ((var15 & 0x8) != 0) {
                int var21 = field287.method2262();
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var22 = field287.method2148();
                if (var14.field697 == var21 && var21 != -1) {
                    int var23 = class38.method84(var21).field885;
                    if (var23 == 1) {
                        var14.field702 = 0;
                        var14.field735 = 0;
                        var14.field730 = var22;
                        var14.field738 = 0;
                    }
                    if (var23 == 2) {
                        var14.field738 = 0;
                    }
                } else if (var21 == -1 || var14.field697 == -1 || class38.method84(var21).field876 >= class38.method84(var14.field697).field876) {
                    var14.field697 = var21;
                    var14.field702 = 0;
                    var14.field735 = 0;
                    var14.field730 = var22;
                    var14.field738 = 0;
                    var14.field754 = var14.field749;
                }
            }
        }
        for (int var24 = 0; var24 < field372; var24++) {
            int var25 = field297[var24];
            if (field386 != field376[var25].field704) {
                field376[var25].field664 = null;
                field376[var25] = null;
            }
        }
        if (field288 != field287.field1819) {
            throw new RuntimeException(field287.field1819 + class2.field22 + field288);
        }
        for (int var26 = 0; var26 < field440; var26++) {
            if (field376[field363[var26]] == null) {
                throw new RuntimeException(var26 + class2.field22 + field440);
            }
        }
    }

    @ObfuscatedName("dk.bb(I)V")
    public static final void method2400() {
        while (true) {
            if (field287.method2367(field288) >= 27) {
                int var0 = field287.method2368(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field376[var0] == null) {
                        field376[var0] = new class30();
                        var1 = true;
                    }
                    class30 var2 = field376[var0];
                    field363[++field440 - 1] = var0;
                    var2.field704 = field386;
                    int var3 = field287.method2368(1);
                    var2.field664 = class35.method514(field287.method2368(14));
                    int var4 = field287.method2368(1);
                    if (var4 == 1) {
                        field368[++field367 - 1] = var0;
                    }
                    int var5 = field287.method2368(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field322[field287.method2368(3)];
                    if (var1) {
                        var2.field721 = var2.field728 = var6;
                    }
                    int var7 = field287.method2368(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.field701 = var2.field664.field790;
                    var2.field748 = var2.field664.field796;
                    if (var2.field748 == 0) {
                        var2.field728 = 0;
                    }
                    var2.field705 = var2.field664.field779;
                    var2.field706 = var2.field664.field780;
                    var2.field707 = var2.field664.field782;
                    var2.field722 = var2.field664.field803;
                    var2.field733 = var2.field664.field767;
                    var2.field703 = var2.field664.field777;
                    var2.field755 = var2.field664.field778;
                    var2.method589(Statics.field1669.field750[0] + var5, Statics.field1669.field751[0] + var7, var3 == 1);
                    continue;
                }
            }
            field287.method2369();
            return;
        }
    }

    @ObfuscatedName("ci.bs(IIB)V")
    public static final void method1772(int arg0, int arg1) {
        if (field388 < 2 && field399 == 0 && !field401) {
            return;
        }
        String var2;
        if (field399 == 1 && field388 < 2) {
            var2 = class142.field2307 + class142.field2372 + field261 + " " + class2.field26;
        } else if (field401 && field388 < 2) {
            var2 = field282 + class142.field2372 + field404 + " " + class2.field26;
        } else {
            int var3 = field388 - 1;
            String var4;
            if (field503[var3].length() > 0) {
                var4 = field393[var3] + class142.field2372 + field503[var3];
            } else {
                var4 = field393[var3];
            }
            var2 = var4;
        }
        if (field388 > 2) {
            var2 = var2 + class2.method2(16777215) + " " + '/' + " " + (field388 - 2) + class142.field2131;
        }
        Statics.field568.method3342(var2, arg0 + 4, arg1 + 15, 16777215, 0, field386 / 1000);
    }

    @ObfuscatedName("dq.bc(IIIII)V")
    public static final void method2321(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field447; var4++) {
            if (field463[var4] + field339[var4] > arg0 && field463[var4] < arg0 + arg2 && field455[var4] + field357[var4] > arg1 && field357[var4] < arg1 + arg3) {
                field449[var4] = true;
            }
        }
    }

    @ObfuscatedName("u.bk(III)V")
    public static final void method142(int arg0, int arg1) {
        int var2 = Statics.field568.method3345(class142.field2284);
        for (int var3 = 0; var3 < field388; var3++) {
            class191 var4 = Statics.field568;
            String var5;
            if (field503[var3].length() > 0) {
                var5 = field393[var3] + class142.field2372 + field503[var3];
            } else {
                var5 = field393[var3];
            }
            int var6 = var4.method3345(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field388 * 15 + 21;
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
        field387 = true;
        Statics.field209 = var8;
        Statics.field21 = var9;
        Statics.field147 = var2;
        Statics.field2864 = field388 * 15 + 22;
    }

    @ObfuscatedName("df.ba(II)V")
    public static final void method2420(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field389[arg0];
        int var2 = field390[arg0];
        int var3 = field391[arg0];
        int var4 = field502[arg0];
        String var5 = field393[arg0];
        String var6 = field503[arg0];
        method791(var1, var2, var3, var4, var5, var6, class127.field1995, class127.field2002);
    }

    @ObfuscatedName("al.bd(Laq;IIB)V")
    public static final void method625(class27 arg0, int arg1, int arg2) {
        method791(arg0.field608, arg0.field604, arg0.field609, arg0.field606, arg0.field607, arg0.field607, arg1, arg2);
    }

    @ObfuscatedName("ap.bx(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method791(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 25) {
            class152 var8 = class152.method1775(arg1, arg0);
            if (var8 != null) {
                method2575();
                method2063(arg1, arg0, class156.method2812(method474(var8)));
                field399 = 0;
                field282 = method2598(var8);
                if (field282 == null) {
                    field282 = "Null";
                }
                if (var8.field2636) {
                    field404 = var8.field2582 + class2.method2(16777215);
                } else {
                    field404 = class2.method2(65280) + var8.field2628 + class2.method2(16777215);
                }
            }
            return;
        }
        if (arg2 == 9) {
            class30 var9 = field376[arg3];
            if (var9 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(135);
                field285.method2145(class124.field1946[82] ? 1 : 0);
                field285.method2153(arg3);
            }
        }
        if (arg2 == 33) {
            field285.method2364(65);
            field285.method2259(arg1);
            field285.method2151(arg3);
            field285.method2151(arg0);
            field276 = 0;
            Statics.field2102 = class152.method124(arg1);
            field400 = arg0;
        }
        if (arg2 == 1003) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            class30 var10 = field376[arg3];
            if (var10 != null) {
                class35 var11 = var10.field664;
                if (var11.field785 != null) {
                    var11 = var11.method605();
                }
                if (var11 != null) {
                    field285.method2364(248);
                    field285.method2109(var11.field771);
                }
            }
        }
        if (arg2 == 39) {
            field285.method2364(134);
            field285.method2153(arg0);
            field285.method2161(arg1);
            field285.method2109(arg3);
            field276 = 0;
            Statics.field2102 = class152.method124(arg1);
            field400 = arg0;
        }
        if (arg2 == 31) {
            field285.method2364(251);
            field285.method2161(arg1);
            field285.method2153(arg0);
            field285.method2152(Statics.field129);
            field285.method2151(arg3);
            field285.method2152(Statics.field650);
            field285.method2259(Statics.field2667);
            field276 = 0;
            Statics.field2102 = class152.method124(arg1);
            field400 = arg0;
        }
        if (arg2 == 37) {
            field285.method2364(160);
            field285.method2151(arg3);
            field285.method2153(arg0);
            field285.method2161(arg1);
            field276 = 0;
            Statics.field2102 = class152.method124(arg1);
            field400 = arg0;
        }
        if (arg2 == 24) {
            class152 var12 = class152.method124(arg1);
            boolean var13 = true;
            if (var12.field2526 > 0) {
                var13 = method977(var12);
            }
            if (var13) {
                field285.method2364(187);
                field285.method2111(arg1);
            }
        }
        if (arg2 == 1002) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field285.method2364(147);
            field285.method2152(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 57 || arg2 == 1007) {
            method54(arg3, arg1, arg0, arg5);
        }
        if (arg2 == 34) {
            field285.method2364(89);
            field285.method2153(arg0);
            field285.method2153(arg3);
            field285.method2162(arg1);
            field276 = 0;
            Statics.field2102 = class152.method124(arg1);
            field400 = arg0;
        }
        if (arg2 == 17) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field344 = arg0;
            field474 = arg1;
            field285.method2364(246);
            field285.method2109(arg3);
            field285.method2153(Statics.field919 + arg1);
            field285.method2152(Statics.field928 + arg0);
            field285.method2108(class124.field1946[82] ? 1 : 0);
            field285.method2162(Statics.field123);
            field285.method2152(field269);
        }
        if (arg2 == 4) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field344 = arg0;
            field474 = arg1;
            field285.method2364(169);
            field285.method2151(Statics.field919 + arg1);
            field285.method2109(Statics.field928 + arg0);
            field285.method2153(arg3 >> 14 & 0x7FFF);
            field285.method2145(class124.field1946[82] ? 1 : 0);
        }
        if (arg2 == 3) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field344 = arg0;
            field474 = arg1;
            field285.method2364(167);
            field285.method2151(Statics.field928 + arg0);
            field285.method2153(Statics.field919 + arg1);
            field285.method2152(arg3 >> 14 & 0x7FFF);
            field285.method2144(class124.field1946[82] ? 1 : 0);
        }
        if (arg2 == 28) {
            field285.method2364(187);
            field285.method2111(arg1);
            class152 var14 = class152.method124(arg1);
            if (var14.field2522 != null && var14.field2522[0][0] == 5) {
                int var15 = var14.field2522[0][1];
                class154.field2649[var15] = 1 - class154.field2649[var15];
                method1962(var15);
            }
        }
        if (arg2 == 26) {
            field285.method2364(94);
            for (class4 var16 = (class4) field362.method3197(); var16 != null; var16 = (class4) field362.method3200()) {
                if (var16.field60 == 0 || var16.field60 == 3) {
                    method2691(var16, true);
                }
            }
            if (field323 != null) {
                method151(field323);
                field323 = null;
            }
        }
        if (arg2 == 44) {
            class3 var17 = field364[arg3];
            if (var17 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(164);
                field285.method2108(class124.field1946[82] ? 1 : 0);
                field285.method2151(arg3);
            }
        }
        if (arg2 == 46) {
            class3 var18 = field364[arg3];
            if (var18 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(153);
                field285.method2109(arg3);
                field285.method2144(class124.field1946[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field285.method2364(27);
            field285.method2161(arg1);
            field285.method2152(arg3);
            field285.method2153(arg0);
            field285.method2151(field269);
            field285.method2161(Statics.field123);
            field276 = 0;
            Statics.field2102 = class152.method124(arg1);
            field400 = arg0;
        }
        if (arg2 == 13) {
            class30 var19 = field376[arg3];
            if (var19 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(253);
                field285.method2143(class124.field1946[82] ? 1 : 0);
                field285.method2151(arg3);
            }
        }
        if (arg2 == 15) {
            class3 var20 = field364[arg3];
            if (var20 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(218);
                field285.method2151(field269);
                field285.method2151(arg3);
                field285.method2111(Statics.field123);
                field285.method2108(class124.field1946[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field285.method2364(126);
            field285.method2109(arg3);
            field285.method2153(arg0);
            field285.method2111(arg1);
            field276 = 0;
            Statics.field2102 = class152.method124(arg1);
            field400 = arg0;
        }
        if (arg2 == 7) {
            class30 var21 = field376[arg3];
            if (var21 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(70);
                field285.method2109(arg3);
                field285.method2111(Statics.field2667);
                field285.method2153(Statics.field129);
                field285.method2108(class124.field1946[82] ? 1 : 0);
                field285.method2151(Statics.field650);
            }
        }
        if (arg2 == 20) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field344 = arg0;
            field474 = arg1;
            field285.method2364(54);
            field285.method2109(Statics.field928 + arg0);
            field285.method2108(class124.field1946[82] ? 1 : 0);
            field285.method2109(Statics.field919 + arg1);
            field285.method2151(arg3);
        }
        if (arg2 == 41) {
            field285.method2364(188);
            field285.method2151(arg0);
            field285.method2109(arg3);
            field285.method2259(arg1);
            field276 = 0;
            Statics.field2102 = class152.method124(arg1);
            field400 = arg0;
        }
        if (arg2 == 48) {
            class3 var22 = field364[arg3];
            if (var22 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(74);
                field285.method2109(arg3);
                field285.method2108(class124.field1946[82] ? 1 : 0);
            }
        }
        if (arg2 == 38) {
            method2575();
            class152 var23 = class152.method124(arg1);
            field399 = 1;
            Statics.field650 = arg0;
            Statics.field2667 = arg1;
            Statics.field129 = arg3;
            method151(var23);
            field261 = class2.method2(16748608) + class45.method158(arg3).field986 + class2.method2(16777215);
            if (field261 == null) {
                field261 = "null";
            }
            return;
        }
        if (arg2 == 1005) {
            class152 var24 = class152.method124(arg1);
            if (var24 == null || var24.field2573[arg0] < 100000) {
                field285.method2364(68);
                field285.method2153(arg3);
            } else {
                class10.method2425(27, "", var24.field2573[arg0] + " x " + class45.method158(arg3).field986);
            }
            field276 = 0;
            Statics.field2102 = class152.method124(arg1);
            field400 = arg0;
        }
        if (arg2 == 18) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field344 = arg0;
            field474 = arg1;
            field285.method2364(29);
            field285.method2153(Statics.field928 + arg0);
            field285.method2143(class124.field1946[82] ? 1 : 0);
            field285.method2151(arg3);
            field285.method2152(Statics.field919 + arg1);
        }
        if (arg2 == 1004) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field285.method2364(68);
            field285.method2153(arg3);
        }
        if (arg2 == 29) {
            field285.method2364(187);
            field285.method2111(arg1);
            class152 var25 = class152.method124(arg1);
            if (var25.field2522 != null && var25.field2522[0][0] == 5) {
                int var26 = var25.field2522[0][1];
                if (class154.field2649[var26] != var25.field2620[0]) {
                    class154.field2649[var26] = var25.field2620[0];
                    method1962(var26);
                }
            }
        }
        if (arg2 == 23) {
            Statics.field1490.method1671(Statics.field1999, arg0, arg1);
        }
        if (arg2 == 1) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field344 = arg0;
            field474 = arg1;
            field285.method2364(236);
            field285.method2162(Statics.field2667);
            field285.method2152(arg3 >> 14 & 0x7FFF);
            field285.method2109(Statics.field928 + arg0);
            field285.method2109(Statics.field919 + arg1);
            field285.method2143(class124.field1946[82] ? 1 : 0);
            field285.method2109(Statics.field650);
            field285.method2152(Statics.field129);
        }
        if (arg2 == 16) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field344 = arg0;
            field474 = arg1;
            field285.method2364(33);
            field285.method2109(Statics.field129);
            field285.method2109(Statics.field919 + arg1);
            field285.method2111(Statics.field2667);
            field285.method2144(class124.field1946[82] ? 1 : 0);
            field285.method2109(Statics.field650);
            field285.method2152(arg3);
            field285.method2152(Statics.field928 + arg0);
        }
        if (arg2 == 51) {
            class3 var27 = field364[arg3];
            if (var27 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(121);
                field285.method2143(class124.field1946[82] ? 1 : 0);
                field285.method2109(arg3);
            }
        }
        if (arg2 == 30 && field323 == null) {
            method69(arg1, arg0);
            field323 = class152.method1775(arg1, arg0);
            method151(field323);
        }
        if (arg2 == 50) {
            class3 var28 = field364[arg3];
            if (var28 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(252);
                field285.method2143(class124.field1946[82] ? 1 : 0);
                field285.method2152(arg3);
            }
        }
        if (arg2 == 12) {
            class30 var29 = field376[arg3];
            if (var29 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(69);
                field285.method2151(arg3);
                field285.method2144(class124.field1946[82] ? 1 : 0);
            }
        }
        if (arg2 == 21) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field344 = arg0;
            field474 = arg1;
            field285.method2364(67);
            field285.method2109(Statics.field919 + arg1);
            field285.method2108(class124.field1946[82] ? 1 : 0);
            field285.method2109(arg3);
            field285.method2152(Statics.field928 + arg0);
        }
        if (arg2 == 10) {
            class30 var30 = field376[arg3];
            if (var30 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(245);
                field285.method2109(arg3);
                field285.method2108(class124.field1946[82] ? 1 : 0);
            }
        }
        if (arg2 == 42) {
            field285.method2364(25);
            field285.method2151(arg3);
            field285.method2151(arg0);
            field285.method2259(arg1);
            field276 = 0;
            Statics.field2102 = class152.method124(arg1);
            field400 = arg0;
        }
        if (arg2 == 14) {
            class3 var31 = field364[arg3];
            if (var31 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(24);
                field285.method2109(arg3);
                field285.method2259(Statics.field2667);
                field285.method2108(class124.field1946[82] ? 1 : 0);
                field285.method2152(Statics.field650);
                field285.method2153(Statics.field129);
            }
        }
        if (arg2 == 49) {
            class3 var32 = field364[arg3];
            if (var32 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(231);
                field285.method2152(arg3);
                field285.method2143(class124.field1946[82] ? 1 : 0);
            }
        }
        if (arg2 == 19) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field344 = arg0;
            field474 = arg1;
            field285.method2364(105);
            field285.method2109(arg3);
            field285.method2144(class124.field1946[82] ? 1 : 0);
            field285.method2151(Statics.field928 + arg0);
            field285.method2153(Statics.field919 + arg1);
        }
        if (arg2 == 43) {
            field285.method2364(30);
            field285.method2152(arg0);
            field285.method2109(arg3);
            field285.method2162(arg1);
            field276 = 0;
            Statics.field2102 = class152.method124(arg1);
            field400 = arg0;
        }
        if (arg2 == 22) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field344 = arg0;
            field474 = arg1;
            field285.method2364(132);
            field285.method2151(Statics.field919 + arg1);
            field285.method2152(arg3);
            field285.method2152(Statics.field928 + arg0);
            field285.method2143(class124.field1946[82] ? 1 : 0);
        }
        if (arg2 == 11) {
            class30 var33 = field376[arg3];
            if (var33 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(31);
                field285.method2108(class124.field1946[82] ? 1 : 0);
                field285.method2151(arg3);
            }
        }
        if (arg2 == 35) {
            field285.method2364(199);
            field285.method2153(arg0);
            field285.method2111(arg1);
            field285.method2152(arg3);
            field276 = 0;
            Statics.field2102 = class152.method124(arg1);
            field400 = arg0;
        }
        if (arg2 == 47) {
            class3 var34 = field364[arg3];
            if (var34 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(186);
                field285.method2143(class124.field1946[82] ? 1 : 0);
                field285.method2109(arg3);
            }
        }
        if (arg2 == 6) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field344 = arg0;
            field474 = arg1;
            field285.method2364(198);
            field285.method2151(arg3 >> 14 & 0x7FFF);
            field285.method2151(Statics.field919 + arg1);
            field285.method2153(Statics.field928 + arg0);
            field285.method2143(class124.field1946[82] ? 1 : 0);
        }
        if (arg2 == 5) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field344 = arg0;
            field474 = arg1;
            field285.method2364(98);
            field285.method2153(Statics.field928 + arg0);
            field285.method2152(Statics.field919 + arg1);
            field285.method2144(class124.field1946[82] ? 1 : 0);
            field285.method2151(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 40) {
            field285.method2364(62);
            field285.method2162(arg1);
            field285.method2109(arg3);
            field285.method2109(arg0);
            field276 = 0;
            Statics.field2102 = class152.method124(arg1);
            field400 = arg0;
        }
        if (arg2 == 58) {
            field285.method2364(66);
            field285.method2259(Statics.field123);
            field285.method2161(arg1);
            field285.method2152(field269);
            field285.method2109(arg0);
        }
        if (arg2 == 1001) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field344 = arg0;
            field474 = arg1;
            field285.method2364(64);
            field285.method2153(Statics.field919 + arg1);
            field285.method2143(class124.field1946[82] ? 1 : 0);
            field285.method2151(arg3 >> 14 & 0x7FFF);
            field285.method2151(Statics.field928 + arg0);
        }
        if (arg2 == 45) {
            class3 var35 = field364[arg3];
            if (var35 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(11);
                field285.method2153(arg3);
                field285.method2143(class124.field1946[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class30 var36 = field376[arg3];
            if (var36 != null) {
                field351 = arg6;
                field352 = arg7;
                field354 = 2;
                field353 = 0;
                field344 = arg0;
                field474 = arg1;
                field285.method2364(201);
                field285.method2153(arg3);
                field285.method2259(Statics.field123);
                field285.method2153(field269);
                field285.method2145(class124.field1946[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field351 = arg6;
            field352 = arg7;
            field354 = 2;
            field353 = 0;
            field344 = arg0;
            field474 = arg1;
            field285.method2364(150);
            field285.method2108(class124.field1946[82] ? 1 : 0);
            field285.method2152(arg3 >> 14 & 0x7FFF);
            field285.method2153(Statics.field928 + arg0);
            field285.method2109(field269);
            field285.method2162(Statics.field123);
            field285.method2153(Statics.field919 + arg1);
        }
        if (field399 != 0) {
            field399 = 0;
            method151(class152.method124(Statics.field2667));
        }
        if (field401) {
            method2575();
        }
        if (Statics.field2102 != null && field276 == 0) {
            method151(Statics.field2102);
        }
    }

    @ObfuscatedName("x.bl(ILjava/lang/String;I)V")
    public static void method460(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field365; var3++) {
            class3 var4 = field364[field366[var3]];
            if (var4 != null && var4.field42 != null && var4.field42.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field285.method2364(164);
                    field285.method2108(0);
                    field285.method2151(field366[var3]);
                } else if (arg0 == 4) {
                    field285.method2364(186);
                    field285.method2143(0);
                    field285.method2109(field366[var3]);
                } else if (arg0 == 6) {
                    field285.method2364(231);
                    field285.method2152(field366[var3]);
                    field285.method2143(0);
                } else if (arg0 == 7) {
                    field285.method2364(252);
                    field285.method2143(0);
                    field285.method2152(field366[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class10.method2425(4, "", class142.field2228 + arg1);
        }
    }

    @ObfuscatedName("cp.bw(IIII)V")
    public static void method2063(int arg0, int arg1, int arg2) {
        class152 var3 = class152.method1775(arg0, arg1);
        if (var3 != null && var3.field2612 != null) {
            class1 var4 = new class1();
            var4.field19 = var3;
            var4.field10 = var3.field2612;
            Statics.method562(var4);
        }
        field401 = true;
        Statics.field123 = arg0;
        field269 = arg1;
        Statics.field52 = arg2;
        method151(var3);
    }

    @ObfuscatedName("dl.bv(I)V")
    public static void method2575() {
        if (!field401) {
            return;
        }
        class152 var0 = class152.method1775(Statics.field123, field269);
        if (var0 != null && var0.field2601 != null) {
            class1 var1 = new class1();
            var1.field19 = var0;
            var1.field10 = var0.field2601;
            Statics.method562(var1);
        }
        field401 = false;
        method151(var0);
    }

    @ObfuscatedName("b.bj(III)V")
    public static void method69(int arg0, int arg1) {
        field285.method2364(36);
        field285.method2111(arg0);
        field285.method2152(arg1);
    }

    @ObfuscatedName("b.bn(IIILjava/lang/String;I)V")
    public static void method54(int arg0, int arg1, int arg2, String arg3) {
        class152 var4 = class152.method1775(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2609 != null) {
            class1 var5 = new class1();
            var5.field19 = var4;
            var5.field1 = arg0;
            var5.field9 = arg3;
            var5.field10 = var4.field2609;
            Statics.method562(var5);
        }
        boolean var6 = true;
        if (var4.field2526 > 0) {
            var6 = method977(var4);
        }
        if (!var6) {
            return;
        }
        int var7 = method474(var4);
        int var8 = arg0 - 1;
        boolean var9 = (var7 >> var8 + 1 & 0x1) != 0;
        if (!var9) {
            return;
        }
        if (arg0 == 1) {
            field285.method2364(142);
            field285.method2111(arg1);
            field285.method2109(arg2);
        }
        if (arg0 == 2) {
            field285.method2364(86);
            field285.method2111(arg1);
            field285.method2109(arg2);
        }
        if (arg0 == 3) {
            field285.method2364(123);
            field285.method2111(arg1);
            field285.method2109(arg2);
        }
        if (arg0 == 4) {
            field285.method2364(114);
            field285.method2111(arg1);
            field285.method2109(arg2);
        }
        if (arg0 == 5) {
            field285.method2364(227);
            field285.method2111(arg1);
            field285.method2109(arg2);
        }
        if (arg0 == 6) {
            field285.method2364(228);
            field285.method2111(arg1);
            field285.method2109(arg2);
        }
        if (arg0 == 7) {
            field285.method2364(6);
            field285.method2111(arg1);
            field285.method2109(arg2);
        }
        if (arg0 == 8) {
            field285.method2364(158);
            field285.method2111(arg1);
            field285.method2109(arg2);
        }
        if (arg0 == 9) {
            field285.method2364(194);
            field285.method2111(arg1);
            field285.method2109(arg2);
        }
        if (arg0 == 10) {
            field285.method2364(102);
            field285.method2111(arg1);
            field285.method2109(arg2);
        }
    }

    @ObfuscatedName("u.bt(B)V")
    public static final void method147() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field388 - 1; var1++) {
                if (field391[var1] < 1000 && field391[var1 + 1] > 1000) {
                    String var2 = field503[var1];
                    field503[var1] = field503[var1 + 1];
                    field503[var1 + 1] = var2;
                    String var3 = field393[var1];
                    field393[var1] = field393[var1 + 1];
                    field393[var1 + 1] = var3;
                    int var4 = field391[var1];
                    field391[var1] = field391[var1 + 1];
                    field391[var1 + 1] = var4;
                    int var5 = field389[var1];
                    field389[var1] = field389[var1 + 1];
                    field389[var1 + 1] = var5;
                    int var6 = field390[var1];
                    field390[var1] = field390[var1 + 1];
                    field390[var1 + 1] = var6;
                    int var7 = field502[var1];
                    field502[var1] = field502[var1 + 1];
                    field502[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("s.bf(I)V")
    public static void method78() {
        for (int var0 = 0; var0 < field388; var0++) {
            int var1 = field391[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field388 - 1) {
                    for (int var3 = var0; var3 < field388 - 1; var3++) {
                        field393[var3] = field393[var3 + 1];
                        field503[var3] = field503[var3 + 1];
                        field391[var3] = field391[var3 + 1];
                        field502[var3] = field502[var3 + 1];
                        field389[var3] = field389[var3 + 1];
                        field390[var3] = field390[var3 + 1];
                    }
                }
                field388--;
            }
        }
    }

    @ObfuscatedName("ad.cc(Lal;IIIB)V")
    public static final void method573(class35 arg0, int arg1, int arg2, int arg3) {
        if (field388 >= 400) {
            return;
        }
        if (arg0.field785 != null) {
            arg0 = arg0.method605();
        }
        if (arg0 == null || !arg0.field800 || arg0.field781 && field413 != arg1) {
            return;
        }
        String var4 = arg0.field802;
        if (arg0.field789 != 0) {
            int var6 = arg0.field789;
            int var7 = Statics.field1669.field41;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2(65280);
            } else if (var8 > 6) {
                var9 = class2.method2(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2(12648192);
            } else {
                var9 = class2.method2(16776960);
            }
            var4 = var4 + var9 + " " + class2.field24 + class142.field2287 + arg0.field789 + class2.field27;
        }
        if (field399 == 1) {
            Statics.method2059(class142.field2307, field261 + " " + class2.field26 + " " + class2.method2(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field401) {
            String[] var10 = arg0.field787;
            if (field416) {
                var10 = method3145(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class142.field2283)) {
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
                        Statics.method2059(var10[var11], class2.method2(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class142.field2283)) {
                        short var14 = 0;
                        if (field345 == class18.field505 || field345 == class18.field509 && arg0.field789 > Statics.field1669.field41) {
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
                        Statics.method2059(var10[var13], class2.method2(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            Statics.method2059(class142.field2282, class2.method2(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field52 & 0x2) == 2) {
            Statics.method2059(field282, field404 + " " + class2.field26 + " " + class2.method2(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bx.ci(La;IIIB)V")
    public static final void method1372(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1669 == arg0 || field388 >= 400) {
            return;
        }
        String var9;
        if (arg0.field37 == 0) {
            String var4 = arg0.field42;
            int var5 = arg0.field41;
            int var6 = Statics.field1669.field41;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2(65280);
            } else if (var7 > 6) {
                var8 = class2.method2(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2(12648192);
            } else {
                var8 = class2.method2(16776960);
            }
            var9 = var4 + var8 + " " + class2.field24 + class142.field2287 + arg0.field41 + class2.field27;
        } else {
            var9 = arg0.field42 + " " + class2.field24 + class142.field2288 + arg0.field37 + class2.field27;
        }
        if (field399 == 1) {
            Statics.method2059(class142.field2307, field261 + " " + class2.field26 + " " + class2.method2(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field401) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field375[var10] != null) {
                    short var11 = 0;
                    if (field375[var10].equalsIgnoreCase(class142.field2283)) {
                        if (field345 == class18.field505 || field345 == class18.field509 && arg0.field41 > Statics.field1669.field41) {
                            var11 = 2000;
                        }
                        if (Statics.field1669.field50 != 0 && arg0.field50 != 0) {
                            if (Statics.field1669.field50 == arg0.field50) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field405[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field374[var10] + var11;
                    Statics.method2059(field375[var10], class2.method2(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field52 & 0x8) == 8) {
            Statics.method2059(field282, field404 + " " + class2.field26 + " " + class2.method2(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field388; var14++) {
            if (field391[var14] == 23) {
                field503[var14] = class2.method2(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("cl.cn(IIIIIIIII)V")
    public static final void method1966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class152.method2525(arg0)) {
            Statics.field1658 = null;
            method2522(Statics.field2574[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1658 != null) {
                method2522(Statics.field1658, -1412584499, arg1, arg2, arg3, arg4, Statics.field534, Statics.field1822, arg7);
                Statics.field1658 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field449[var8] = true;
            }
        } else {
            field449[arg7] = true;
        }
    }

    @ObfuscatedName("dt.ck([Led;IIIIIIIIB)V")
    public static final void method2522(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1502(arg2, arg3, arg4, arg5);
        class84.method1782();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class152 var10 = arg0[var9];
            if (var10 != null && (var10.field2533 == arg1 || arg1 == -1412584499 && field417 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field463[field447] = var10.field2527 + arg6;
                    field357[field447] = var10.field2528 + arg7;
                    field339[field447] = var10.field2531;
                    field455[field447] = var10.field2584;
                    var11 = ++field447 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2637 = var11;
                var10.field2615 = field386;
                if (!var10.field2636 || !method117(var10)) {
                    if (var10.field2526 > 0) {
                        int var12 = var10.field2526;
                        if (var12 == 324) {
                            if (field427 == -1) {
                                field427 = var10.field2613;
                                field317 = var10.field2547;
                            }
                            if (field500.field2659) {
                                var10.field2613 = field427;
                            } else {
                                var10.field2613 = field317;
                            }
                        } else if (var12 == 325) {
                            if (field427 == -1) {
                                field427 = var10.field2613;
                                field317 = var10.field2547;
                            }
                            if (field500.field2659) {
                                var10.field2613 = field317;
                            } else {
                                var10.field2613 = field427;
                            }
                        } else if (var12 == 327) {
                            var10.field2590 = 150;
                            var10.field2563 = (int) (Math.sin((double) field386 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2617 = 5;
                            var10.field2543 = 0;
                        } else if (var12 == 328) {
                            var10.field2590 = 150;
                            var10.field2563 = (int) (Math.sin((double) field386 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2617 = 5;
                            var10.field2543 = 1;
                        }
                    }
                    int var13 = var10.field2527 + arg6;
                    int var14 = var10.field2528 + arg7;
                    int var15 = var10.field2626;
                    if (field417 == var10) {
                        if (arg1 != -1412584499 && !var10.field2587) {
                            Statics.field1658 = arg0;
                            Statics.field534 = arg6;
                            Statics.field1822 = arg7;
                            continue;
                        }
                        if (field428 && field320) {
                            int var16 = class127.field1988;
                            int var17 = class127.field1989 * -632739763;
                            int var18 = var16 - field419;
                            int var19 = var17 - field420;
                            if (var18 < field423) {
                                var18 = field423;
                            }
                            if (var10.field2531 + var18 > field423 + field418.field2531) {
                                var18 = field423 + field418.field2531 - var10.field2531;
                            }
                            if (var19 < field403) {
                                var19 = field403;
                            }
                            if (var10.field2584 + var19 > field403 + field418.field2584) {
                                var19 = field403 + field418.field2584 - var10.field2584;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2587) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2524 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2524 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2531 + var13;
                        int var27 = var10.field2584 + var14;
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
                        int var30 = var10.field2531 + var13;
                        int var31 = var10.field2584 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2636 || var20 < var22 && var21 < var23) {
                        if (var10.field2526 != 0) {
                            if (var10.field2526 == 1337) {
                                field395 = var13;
                                field396 = var14;
                                int var32 = var10.field2531;
                                int var33 = var10.field2584;
                                class73.method1502(var13, var14, var13 + var32, var14 + var33);
                                class84.method1782();
                                field279++;
                                method24(class29.field654);
                                boolean var34 = false;
                                if (field316 >= 0) {
                                    for (int var35 = 0; var35 < field365; var35++) {
                                        if (field316 == field366[var35]) {
                                            var34 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var34) {
                                    method24(class29.field655);
                                }
                                method628(true);
                                method24(var34 ? class29.field659 : class29.field656);
                                method628(false);
                                method568();
                                method497();
                                if (!field488) {
                                    int var36 = field424;
                                    if (field336 / 256 > var36) {
                                        var36 = field336 / 256;
                                    }
                                    if (field402[4] && field491[4] + 128 > var36) {
                                        var36 = field491[4] + 128;
                                    }
                                    int var37 = field346 + field312 & 0x7FF;
                                    int var38 = Statics.field25;
                                    int var39 = method496(Statics.field1669.field700, Statics.field1669.field726, Statics.field1999) - 50;
                                    int var40 = Statics.field2703;
                                    int var41 = var36 * 3 + 600;
                                    int var42 = 2048 - var36 & 0x7FF;
                                    int var43 = 2048 - var37 & 0x7FF;
                                    int var44 = 0;
                                    int var45 = 0;
                                    int var46 = var41;
                                    if (var42 != 0) {
                                        int var47 = class84.field1447[var42];
                                        int var48 = class84.field1454[var42];
                                        int var49 = var45 * var48 - var41 * var47 >> 16;
                                        var46 = var45 * var47 + var41 * var48 >> 16;
                                        var45 = var49;
                                    }
                                    if (var43 != 0) {
                                        int var50 = class84.field1447[var43];
                                        int var51 = class84.field1454[var43];
                                        int var52 = var44 * var51 + var46 * var50 >> 16;
                                        var46 = var46 * var51 - var44 * var50 >> 16;
                                        var44 = var52;
                                    }
                                    Statics.field1497 = var38 - var44;
                                    Statics.field1648 = var39 - var45;
                                    Statics.field1536 = var40 - var46;
                                    Statics.field244 = var36;
                                    Statics.field1939 = var37;
                                }
                                int var65;
                                if (field488) {
                                    int var66;
                                    if (Statics.field57.field138) {
                                        var66 = Statics.field1999;
                                    } else {
                                        int var67 = method496(Statics.field1497, Statics.field1536, Statics.field1999);
                                        if (var67 - Statics.field1648 >= 800 || (class6.field82[Statics.field1999][Statics.field1497 >> 7][Statics.field1536 >> 7] & 0x4) == 0) {
                                            var66 = 3;
                                        } else {
                                            var66 = Statics.field1999;
                                        }
                                    }
                                    var65 = var66;
                                } else {
                                    int var53;
                                    if (Statics.field57.field138) {
                                        var53 = Statics.field1999;
                                    } else {
                                        int var54 = 3;
                                        if (Statics.field244 < 310) {
                                            int var55 = Statics.field1497 >> 7;
                                            int var56 = Statics.field1536 >> 7;
                                            int var57 = Statics.field1669.field700 >> 7;
                                            int var58 = Statics.field1669.field726 >> 7;
                                            if ((class6.field82[Statics.field1999][var55][var56] & 0x4) != 0) {
                                                var54 = Statics.field1999;
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
                                                    if ((class6.field82[Statics.field1999][var55][var56] & 0x4) != 0) {
                                                        var54 = Statics.field1999;
                                                    }
                                                    var62 += var61;
                                                    if (var62 >= 65536) {
                                                        var62 -= 65536;
                                                        if (var56 < var58) {
                                                            var56++;
                                                        } else if (var56 > var58) {
                                                            var56--;
                                                        }
                                                        if ((class6.field82[Statics.field1999][var55][var56] & 0x4) != 0) {
                                                            var54 = Statics.field1999;
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
                                                    if ((class6.field82[Statics.field1999][var55][var56] & 0x4) != 0) {
                                                        var54 = Statics.field1999;
                                                    }
                                                    var64 += var63;
                                                    if (var64 >= 65536) {
                                                        var64 -= 65536;
                                                        if (var55 < var57) {
                                                            var55++;
                                                        } else if (var55 > var57) {
                                                            var55--;
                                                        }
                                                        if ((class6.field82[Statics.field1999][var55][var56] & 0x4) != 0) {
                                                            var54 = Statics.field1999;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class6.field82[Statics.field1999][Statics.field1669.field700 >> 7][Statics.field1669.field726 >> 7] & 0x4) != 0) {
                                            var54 = Statics.field1999;
                                        }
                                        var53 = var54;
                                    }
                                    var65 = var53;
                                }
                                int var68 = Statics.field1497;
                                int var69 = Statics.field1648;
                                int var70 = Statics.field1536;
                                int var71 = Statics.field244;
                                int var72 = Statics.field1939;
                                for (int var73 = 0; var73 < 5; var73++) {
                                    if (field402[var73]) {
                                        int var74 = (int) (Math.random() * (double) (field490[var73] * 2 + 1) - (double) field490[var73] + Math.sin((double) field492[var73] / 100.0D * (double) field493[var73]) * (double) field491[var73]);
                                        if (var73 == 0) {
                                            Statics.field1497 += var74;
                                        }
                                        if (var73 == 1) {
                                            Statics.field1648 += var74;
                                        }
                                        if (var73 == 2) {
                                            Statics.field1536 += var74;
                                        }
                                        if (var73 == 3) {
                                            Statics.field1939 = Statics.field1939 + var74 & 0x7FF;
                                        }
                                        if (var73 == 4) {
                                            Statics.field244 += var74;
                                            if (Statics.field244 < 128) {
                                                Statics.field244 = 128;
                                            }
                                            if (Statics.field244 > 383) {
                                                Statics.field244 = 383;
                                            }
                                        }
                                    }
                                }
                                int var75 = class127.field1988;
                                int var76 = class127.field1989 * -632739763;
                                if (class127.field1996 != 0) {
                                    var75 = class127.field1995;
                                    var76 = class127.field2002;
                                }
                                if (var75 >= var13 && var75 < var13 + var32 && var76 >= var14 && var76 < var14 + var33) {
                                    class98.field1738 = true;
                                    class98.field1732 = 0;
                                    class98.field1730 = var75 - var13;
                                    class98.field1731 = var76 - var14;
                                } else {
                                    class98.field1738 = false;
                                    class98.field1732 = 0;
                                }
                                method108();
                                class73.method1508(var13, var14, var32, var33, 0);
                                method108();
                                Statics.field1490.method1638(Statics.field1497, Statics.field1648, Statics.field1536, Statics.field244, Statics.field1939, var65);
                                method108();
                                Statics.field1490.method1616();
                                field337 = 0;
                                boolean var77 = false;
                                int var78 = -1;
                                for (int var79 = -1; var79 < field440 + field365; var79++) {
                                    class33 var80;
                                    if (var79 == -1) {
                                        var80 = Statics.field1669;
                                    } else if (var79 < field365) {
                                        var80 = field364[field366[var79]];
                                        if (field316 == field366[var79]) {
                                            var77 = true;
                                            var78 = var79;
                                            continue;
                                        }
                                    } else {
                                        var80 = field376[field363[var79 - field365]];
                                    }
                                    method481(var80, var79, var13, var14, var32, var33);
                                }
                                if (var77) {
                                    method481(field364[field316], var78, var13, var14, var32, var33);
                                }
                                for (int var81 = 0; var81 < field337; var81++) {
                                    int var82 = field327[var81];
                                    int var83 = field340[var81];
                                    int var84 = field342[var81];
                                    int var85 = field341[var81];
                                    boolean var86 = true;
                                    while (var86) {
                                        var86 = false;
                                        for (int var87 = 0; var87 < var81; var87++) {
                                            if (var83 + 2 > field340[var87] - field341[var87] && var83 - var85 < field340[var87] + 2 && var82 - var84 < field342[var87] + field327[var87] && var82 + var84 > field327[var87] - field342[var87] && field340[var87] - field341[var87] < var83) {
                                                var83 = field340[var87] - field341[var87];
                                                var86 = true;
                                            }
                                        }
                                    }
                                    field349 = field327[var81];
                                    field457 = field340[var81] = var83;
                                    String var88 = field296[var81];
                                    if (field407 == 0) {
                                        int var89 = 16776960;
                                        if (field343[var81] < 6) {
                                            var89 = field441[field343[var81]];
                                        }
                                        if (field343[var81] == 6) {
                                            var89 = field279 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field343[var81] == 7) {
                                            var89 = field279 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field343[var81] == 8) {
                                            var89 = field279 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field343[var81] == 9) {
                                            int var90 = 150 - field270[var81];
                                            if (var90 < 50) {
                                                var89 = var90 * 1280 + 16711680;
                                            } else if (var90 < 100) {
                                                var89 = 16776960 - (var90 - 50) * 327680;
                                            } else if (var90 < 150) {
                                                var89 = (var90 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field343[var81] == 10) {
                                            int var91 = 150 - field270[var81];
                                            if (var91 < 50) {
                                                var89 = var91 * 5 + 16711680;
                                            } else if (var91 < 100) {
                                                var89 = 16711935 - (var91 - 50) * 327680;
                                            } else if (var91 < 150) {
                                                var89 = (var91 - 100) * 327680 + 255 - (var91 - 100) * 5;
                                            }
                                        }
                                        if (field343[var81] == 11) {
                                            int var92 = 150 - field270[var81];
                                            if (var92 < 50) {
                                                var89 = 16777215 - var92 * 327685;
                                            } else if (var92 < 100) {
                                                var89 = (var92 - 50) * 327685 + 65280;
                                            } else if (var92 < 150) {
                                                var89 = 16777215 - (var92 - 100) * 327680;
                                            }
                                        }
                                        if (field479[var81] == 0) {
                                            Statics.field568.method3429(var88, field349 + var13, field457 + var14, var89, 0);
                                        }
                                        if (field479[var81] == 1) {
                                            Statics.field568.method3353(var88, field349 + var13, field457 + var14, var89, 0, field279);
                                        }
                                        if (field479[var81] == 2) {
                                            Statics.field568.method3355(var88, field349 + var13, field457 + var14, var89, 0, field279);
                                        }
                                        if (field479[var81] == 3) {
                                            Statics.field568.method3418(var88, field349 + var13, field457 + var14, var89, 0, field279, 150 - field270[var81]);
                                        }
                                        if (field479[var81] == 4) {
                                            int var93 = (150 - field270[var81]) * (Statics.field568.method3345(var88) + 100) / 150;
                                            class73.method1505(field349 + var13 - 50, var14, field349 + var13 + 50, var14 + var33);
                                            Statics.field568.method3352(var88, field349 + var13 + 50 - var93, field457 + var14, var89, 0);
                                            class73.method1502(var13, var14, var13 + var32, var14 + var33);
                                        }
                                        if (field479[var81] == 5) {
                                            int var94 = 150 - field270[var81];
                                            int var95 = 0;
                                            if (var94 < 25) {
                                                var95 = var94 - 25;
                                            } else if (var94 > 125) {
                                                var95 = var94 - 125;
                                            }
                                            class73.method1505(var13, field457 + var14 - Statics.field568.field2894 - 1, var13 + var32, field457 + var14 + 5);
                                            Statics.field568.method3429(var88, field349 + var13, field457 + var14 + var95, var89, 0);
                                            class73.method1502(var13, var14, var13 + var32, var14 + var33);
                                        }
                                    } else {
                                        Statics.field568.method3429(var88, field349 + var13, field457 + var14, 16776960, 0);
                                    }
                                }
                                if (field262 == 2) {
                                    method493((field406 - Statics.field928 << 7) + field268, (field266 - Statics.field919 << 7) + field429, field444 * 2);
                                    if (field349 > -1 && field386 % 20 < 10) {
                                        Statics.field20[0].method1422(field349 + var13 - 12, field457 + var14 - 28);
                                    }
                                }
                                ((class88) Statics.field1450).method1862(field265);
                                if (field354 == 1) {
                                    Statics.field15[field353 / 100].method1422(field351 - 8, field352 - 8);
                                }
                                if (field354 == 2) {
                                    Statics.field15[field353 / 100 + 4].method1422(field351 - 8, field352 - 8);
                                }
                                method139();
                                if (field260) {
                                    int var96 = var13 + 512 - 5;
                                    int var97 = var14 + 20;
                                    Statics.field630.method3351("Fps:" + field2043, var96, var97, 16776960, -1);
                                    int var180 = var97 + 15;
                                    Runtime var98 = Runtime.getRuntime();
                                    int var99 = (int) ((var98.totalMemory() - var98.freeMemory()) / 1024L);
                                    int var100 = 16776960;
                                    if (var99 > 32768 && field250) {
                                        var100 = 16711680;
                                    }
                                    if (var99 > 65536 && !field250) {
                                        var100 = 16711680;
                                    }
                                    Statics.field630.method3351("Mem:" + var99 + "k", var96, var180, var100, -1);
                                    var97 = var180 + 15;
                                }
                                Statics.field1497 = var68;
                                Statics.field1648 = var69;
                                Statics.field1536 = var70;
                                Statics.field244 = var71;
                                Statics.field1939 = var72;
                                if (field409 && class150.method1861(true, false) == 0) {
                                    field409 = false;
                                }
                                if (field409) {
                                    class73.method1508(var13, var14, var32, var33, 0);
                                    method1874(class142.field2280, false);
                                }
                                class73.method1502(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2526 == 1338) {
                                method595(var13, var14, var11);
                                class73.method1502(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2524 == 0) {
                            if (!var10.field2636 && method117(var10) && Statics.field661 != var10) {
                                continue;
                            }
                            if (!var10.field2636) {
                                if (var10.field2536 > var10.field2538 - var10.field2584) {
                                    var10.field2536 = var10.field2538 - var10.field2584;
                                }
                                if (var10.field2536 < 0) {
                                    var10.field2536 = 0;
                                }
                            }
                            method2522(arg0, var10.field2559, var20, var21, var22, var23, var13 - var10.field2535, var14 - var10.field2536, var11);
                            if (var10.field2622 != null) {
                                method2522(var10.field2622, var10.field2559, var20, var21, var22, var23, var13 - var10.field2535, var14 - var10.field2536, var11);
                            }
                            class4 var101 = (class4) field362.method3204((long) var10.field2559);
                            if (var101 != null) {
                                method1966(var101.field58, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class73.method1502(arg2, arg3, arg4, arg5);
                            class84.method1782();
                        }
                        if (field451[var11] || field489 > 1) {
                            if (var10.field2524 == 0 && !var10.field2636 && var10.field2538 > var10.field2584) {
                                method1871(var10.field2531 + var13, var14, var10.field2536, var10.field2584, var10.field2538);
                            }
                            if (var10.field2524 != 1) {
                                if (var10.field2524 == 2) {
                                    int var102 = 0;
                                    for (int var103 = 0; var103 < var10.field2584; var103++) {
                                        for (int var104 = 0; var104 < var10.field2531; var104++) {
                                            int var105 = (var10.field2575 + 32) * var104 + var13;
                                            int var106 = (var10.field2576 + 32) * var103 + var14;
                                            if (var102 < 20) {
                                                var105 += var10.field2577[var102];
                                                var106 += var10.field2542[var102];
                                            }
                                            if (var10.field2624[var102] > 0) {
                                                boolean var107 = false;
                                                boolean var108 = false;
                                                int var109 = var10.field2624[var102] - 1;
                                                if (var105 + 32 > arg2 && var105 < arg4 && var106 + 32 > arg3 && var106 < arg5 || Statics.field29 == var10 && field377 == var102) {
                                                    class72 var110;
                                                    if (field399 == 1 && Statics.field650 == var102 && Statics.field2667 == var10.field2559) {
                                                        var110 = class45.method13(var109, var10.field2573[var102], 2, 0, false);
                                                    } else {
                                                        var110 = class45.method13(var109, var10.field2573[var102], 1, 3153952, false);
                                                    }
                                                    if (var110 == null) {
                                                        method151(var10);
                                                    } else if (Statics.field29 == var10 && field377 == var102) {
                                                        int var111 = class127.field1988 - field358;
                                                        int var112 = class127.field1989 * -632739763 - field359;
                                                        if (var111 < 5 && var111 > -5) {
                                                            var111 = 0;
                                                        }
                                                        if (var112 < 5 && var112 > -5) {
                                                            var112 = 0;
                                                        }
                                                        if (field284 < 5) {
                                                            var111 = 0;
                                                            var112 = 0;
                                                        }
                                                        var110.method1428(var105 + var111, var106 + var112, 128);
                                                        if (arg1 != -1) {
                                                            class152 var113 = arg0[arg1 & 0xFFFF];
                                                            if (var106 + var112 < class73.field1293 && var113.field2536 > 0) {
                                                                int var114 = field265 * (class73.field1293 - var106 - var112) / 3;
                                                                if (var114 > field265 * 10) {
                                                                    var114 = field265 * 10;
                                                                }
                                                                if (var114 > var113.field2536) {
                                                                    var114 = var113.field2536;
                                                                }
                                                                var113.field2536 -= var114;
                                                                field359 += var114;
                                                                method151(var113);
                                                            }
                                                            if (var106 + var112 + 32 > class73.field1289 && var113.field2536 < var113.field2538 - var113.field2584) {
                                                                int var115 = field265 * (var106 + var112 + 32 - class73.field1289) / 3;
                                                                if (var115 > field265 * 10) {
                                                                    var115 = field265 * 10;
                                                                }
                                                                if (var115 > var113.field2538 - var113.field2584 - var113.field2536) {
                                                                    var115 = var113.field2538 - var113.field2584 - var113.field2536;
                                                                }
                                                                var113.field2536 += var115;
                                                                field359 -= var115;
                                                                method151(var113);
                                                            }
                                                        }
                                                    } else if (Statics.field2102 == var10 && field400 == var102) {
                                                        var110.method1428(var105, var106, 128);
                                                    } else {
                                                        var110.method1422(var105, var106);
                                                    }
                                                }
                                            } else if (var10.field2579 != null && var102 < 20) {
                                                class72 var116 = var10.method2843(var102);
                                                if (var116 != null) {
                                                    var116.method1422(var105, var106);
                                                } else if (class152.field2520) {
                                                    method151(var10);
                                                }
                                            }
                                            var102++;
                                        }
                                    }
                                } else if (var10.field2524 == 3) {
                                    int var117;
                                    if (Statics.method172(var10)) {
                                        var117 = var10.field2556;
                                        if (Statics.field661 == var10 && var10.field2639 != 0) {
                                            var117 = var10.field2639;
                                        }
                                    } else {
                                        var117 = var10.field2625;
                                        if (Statics.field661 == var10 && var10.field2541 != 0) {
                                            var117 = var10.field2541;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2540) {
                                            class73.method1508(var13, var14, var10.field2531, var10.field2584, var117);
                                        } else {
                                            class73.method1510(var13, var14, var10.field2531, var10.field2584, var117);
                                        }
                                    } else if (var10.field2540) {
                                        class73.method1507(var13, var14, var10.field2531, var10.field2584, var117, 256 - (var15 & 0xFF));
                                    } else {
                                        class73.method1557(var13, var14, var10.field2531, var10.field2584, var117, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2524 == 4) {
                                    class191 var118 = var10.method2837();
                                    if (var118 != null) {
                                        String var119 = var10.field2603;
                                        int var120;
                                        if (Statics.method172(var10)) {
                                            var120 = var10.field2556;
                                            if (Statics.field661 == var10 && var10.field2639 != 0) {
                                                var120 = var10.field2639;
                                            }
                                            if (var10.field2570.length() > 0) {
                                                var119 = var10.field2570;
                                            }
                                        } else {
                                            var120 = var10.field2625;
                                            if (Statics.field661 == var10 && var10.field2541 != 0) {
                                                var120 = var10.field2541;
                                            }
                                        }
                                        if (var10.field2636 && var10.field2606 != -1) {
                                            class45 var121 = class45.method158(var10.field2606);
                                            var119 = var121.field986;
                                            if (var119 == null) {
                                                var119 = "null";
                                            }
                                            if ((var121.field997 == 1 || var10.field2627 != 1) && var10.field2627 != -1) {
                                                var119 = class2.method2(16748608) + var119 + class2.field28 + " " + 'x' + method2689(var10.field2627);
                                            }
                                        }
                                        if (field323 == var10) {
                                            class142 var10000 = (class142) null;
                                            var119 = class142.field2289;
                                            var120 = var10.field2625;
                                        }
                                        if (!var10.field2636) {
                                            var119 = method9(var119, var10);
                                        }
                                        var118.method3421(var119, var13, var14, var10.field2531, var10.field2584, var120, var10.field2569 ? 0 : -1, var10.field2572, var10.field2554, var10.field2571);
                                    } else if (class152.field2520) {
                                        method151(var10);
                                    }
                                } else if (var10.field2524 == 5) {
                                    if (var10.field2636) {
                                        class72 var123;
                                        if (var10.field2606 == -1) {
                                            var123 = var10.method2841(false);
                                        } else {
                                            var123 = class45.method13(var10.field2606, var10.field2627, var10.field2550, var10.field2551, false);
                                        }
                                        if (var123 != null) {
                                            int var124 = var123.field1282;
                                            int var125 = var123.field1287;
                                            if (var10.field2604) {
                                                class73.method1505(var13, var14, var10.field2531 + var13, var10.field2584 + var14);
                                                int var126 = (var10.field2531 + (var124 - 1)) / var124;
                                                int var127 = (var10.field2584 + (var125 - 1)) / var125;
                                                for (int var128 = 0; var128 < var126; var128++) {
                                                    for (int var129 = 0; var129 < var127; var129++) {
                                                        if (var10.field2548 != 0) {
                                                            var123.method1434(var124 / 2 + var124 * var128 + var13, var125 / 2 + var125 * var129 + var14, var10.field2548, 4096);
                                                        } else if (var15 == 0) {
                                                            var123.method1422(var124 * var128 + var13, var125 * var129 + var14);
                                                        } else {
                                                            var123.method1428(var124 * var128 + var13, var125 * var129 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1502(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var130 = var10.field2531 * 4096 / var124;
                                                if (var10.field2548 != 0) {
                                                    var123.method1434(var10.field2531 / 2 + var13, var10.field2584 / 2 + var14, var10.field2548, var130);
                                                } else if (var15 != 0) {
                                                    var123.method1421(var13, var14, var10.field2531, var10.field2584, 256 - (var15 & 0xFF));
                                                } else if (var10.field2531 == var124 && var10.field2584 == var125) {
                                                    var123.method1422(var13, var14);
                                                } else {
                                                    var123.method1488(var13, var14, var10.field2531, var10.field2584);
                                                }
                                            }
                                        } else if (class152.field2520) {
                                            method151(var10);
                                        }
                                    } else {
                                        class72 var122 = var10.method2841(Statics.method172(var10));
                                        if (var122 != null) {
                                            var122.method1422(var13, var14);
                                        } else if (class152.field2520) {
                                            method151(var10);
                                        }
                                    }
                                } else if (var10.field2524 == 6) {
                                    boolean var131 = Statics.method172(var10);
                                    int var132;
                                    if (var131) {
                                        var132 = var10.field2555;
                                    } else {
                                        var132 = var10.field2591;
                                    }
                                    class98 var133 = null;
                                    int var134 = 0;
                                    if (var10.field2606 != -1) {
                                        class45 var135 = class45.method158(var10.field2606);
                                        if (var135 != null) {
                                            class45 var136 = var135.method839(var10.field2627);
                                            var133 = var136.method834(1);
                                            if (var133 == null) {
                                                method151(var10);
                                            } else {
                                                var133.method1981();
                                                var134 = var133.field1328 / 2;
                                            }
                                        }
                                    } else if (var10.field2617 == 5) {
                                        if (var10.field2543 == 0) {
                                            var133 = field500.method2920((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var133 = Statics.field1669.method16();
                                        }
                                    } else if (var132 == -1) {
                                        var133 = var10.method2859((class38) null, -1, var131, Statics.field1669.field33);
                                        if (var133 == null && class152.field2520) {
                                            method151(var10);
                                        }
                                    } else {
                                        class38 var137 = class38.method84(var132);
                                        var133 = var10.method2859(var137, var10.field2525, var131, Statics.field1669.field33);
                                        if (var133 == null && class152.field2520) {
                                            method151(var10);
                                        }
                                    }
                                    class84.method1826(var10.field2531 / 2 + var13, var10.field2584 / 2 + var14);
                                    int var138 = var10.field2565 * class84.field1447[var10.field2590] >> 16;
                                    int var139 = var10.field2565 * class84.field1454[var10.field2590] >> 16;
                                    if (var133 != null) {
                                        if (var10.field2636) {
                                            var133.method1981();
                                            if (var10.field2567) {
                                                var133.method1994(0, var10.field2563, var10.field2549, var10.field2590, var10.field2546, var10.field2544 + var134 + var138, var10.field2544 + var139, var10.field2565);
                                            } else {
                                                var133.method1993(0, var10.field2563, var10.field2549, var10.field2590, var10.field2546, var10.field2544 + var134 + var138, var10.field2544 + var139);
                                            }
                                        } else {
                                            var133.method1993(0, var10.field2563, 0, var10.field2590, 0, var138, var139);
                                        }
                                    }
                                    class84.method1784();
                                } else {
                                    if (var10.field2524 == 7) {
                                        class191 var140 = var10.method2837();
                                        if (var140 == null) {
                                            if (class152.field2520) {
                                                method151(var10);
                                            }
                                            continue;
                                        }
                                        int var141 = 0;
                                        for (int var142 = 0; var142 < var10.field2584; var142++) {
                                            for (int var143 = 0; var143 < var10.field2531; var143++) {
                                                if (var10.field2624[var141] > 0) {
                                                    class45 var144 = class45.method158(var10.field2624[var141] - 1);
                                                    String var145;
                                                    if (var144.field997 != 1 && var10.field2573[var141] == 1) {
                                                        var145 = class2.method2(16748608) + var144.field986 + class2.field28;
                                                    } else {
                                                        var145 = class2.method2(16748608) + var144.field986 + class2.field28 + " " + 'x' + method2689(var10.field2573[var141]);
                                                    }
                                                    int var146 = (var10.field2575 + 115) * var143 + var13;
                                                    int var147 = (var10.field2576 + 12) * var142 + var14;
                                                    if (var10.field2572 == 0) {
                                                        var140.method3352(var145, var146, var147, var10.field2625, var10.field2569 ? 0 : -1);
                                                    } else if (var10.field2572 == 1) {
                                                        var140.method3429(var145, var10.field2531 / 2 + var146, var147, var10.field2625, var10.field2569 ? 0 : -1);
                                                    } else {
                                                        var140.method3351(var145, var10.field2531 + var146 - 1, var147, var10.field2625, var10.field2569 ? 0 : -1);
                                                    }
                                                }
                                                var141++;
                                            }
                                        }
                                    }
                                    if (var10.field2524 == 8 && Statics.field240 == var10 && field431 == field242) {
                                        int var148 = 0;
                                        int var149 = 0;
                                        class191 var150 = Statics.field630;
                                        String var151 = var10.field2603;
                                        String var152 = method9(var151, var10);
                                        while (var152.length() > 0) {
                                            int var153 = var152.indexOf(class2.field31);
                                            String var154;
                                            if (var153 == -1) {
                                                var154 = var152;
                                                var152 = "";
                                            } else {
                                                var154 = var152.substring(0, var153);
                                                var152 = var152.substring(var153 + 4);
                                            }
                                            int var155 = var150.method3345(var154);
                                            if (var155 > var148) {
                                                var148 = var155;
                                            }
                                            var149 += var150.field2894 + 1;
                                        }
                                        var148 += 6;
                                        var149 += 7;
                                        int var156 = var10.field2531 + var13 - 5 - var148;
                                        int var157 = var10.field2584 + var14 + 5;
                                        if (var156 < var13 + 5) {
                                            var156 = var13 + 5;
                                        }
                                        if (var148 + var156 > arg4) {
                                            var156 = arg4 - var148;
                                        }
                                        if (var149 + var157 > arg5) {
                                            var157 = arg5 - var149;
                                        }
                                        class73.method1508(var156, var157, var148, var149, 16777120);
                                        class73.method1510(var156, var157, var148, var149, 0);
                                        String var158 = var10.field2603;
                                        int var159 = var150.field2894 + var157 + 2;
                                        String var160 = method9(var158, var10);
                                        while (var160.length() > 0) {
                                            int var161 = var160.indexOf(class2.field31);
                                            String var162;
                                            if (var161 == -1) {
                                                var162 = var160;
                                                var160 = "";
                                            } else {
                                                var162 = var160.substring(0, var161);
                                                var160 = var160.substring(var161 + 4);
                                            }
                                            var150.method3352(var162, var156 + 3, var159, 0, -1);
                                            var159 += var150.field2894 + 1;
                                        }
                                    }
                                    if (var10.field2524 == 9) {
                                        if (var10.field2545 == 1) {
                                            class73.method1515(var13, var14, var10.field2531 + var13, var10.field2584 + var14, var10.field2625);
                                        } else {
                                            int var163 = var10.field2531 >= 0 ? var10.field2531 : -var10.field2531;
                                            int var164 = var10.field2584 >= 0 ? var10.field2584 : -var10.field2584;
                                            int var165 = var163;
                                            if (var163 < var164) {
                                                var165 = var164;
                                            }
                                            if (var165 != 0) {
                                                int var166 = (var10.field2531 << 16) / var165;
                                                int var167 = (var10.field2584 << 16) / var165;
                                                if (var167 <= var166) {
                                                    var166 = -var166;
                                                } else {
                                                    var167 = -var167;
                                                }
                                                int var168 = var10.field2545 * var167 >> 17;
                                                int var169 = var10.field2545 * var167 + 1 >> 17;
                                                int var170 = var10.field2545 * var166 >> 17;
                                                int var171 = var10.field2545 * var166 + 1 >> 17;
                                                int var172 = var13 + var168;
                                                int var173 = var13 - var169;
                                                int var174 = var10.field2531 + var13 - var169;
                                                int var175 = var10.field2531 + var13 + var168;
                                                int var176 = var14 + var170;
                                                int var177 = var14 - var171;
                                                int var178 = var10.field2584 + var14 - var171;
                                                int var179 = var10.field2584 + var14 + var170;
                                                class84.method1802(var172, var173, var174);
                                                class84.method1793(var176, var177, var178, var172, var173, var174, var10.field2625);
                                                class84.method1802(var172, var174, var175);
                                                class84.method1793(var176, var178, var179, var172, var174, var175, var10.field2625);
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

    @ObfuscatedName("j.cq(Ljava/lang/String;Led;B)Ljava/lang/String;")
    public static String method9(String arg0, class152 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2479(arg1, var2 - 1);
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
                if (Statics.field555 != null) {
                    int var9 = Statics.field555.field2059;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field555.field2058 != null) {
                        var8 = (String) Statics.field555.field2058;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ef.co(II)Ljava/lang/String;")
    public static final String method2689(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field22 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2(65408) + var1.substring(0, var1.length() - 8) + class142.field2292 + " " + class2.field24 + var1 + class2.field27 + class2.field28;
        } else if (var1.length() > 6) {
            return " " + class2.method2(16777215) + var1.substring(0, var1.length() - 4) + class142.field2294 + " " + class2.field24 + var1 + class2.field27 + class2.field28;
        } else {
            return " " + class2.method2(16776960) + var1 + class2.field28;
        }
    }

    @ObfuscatedName("aa.cw(Led;IIIIIII)V")
    public static final void method882(class152 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field369) {
            field326 = 32;
        } else {
            field326 = 0;
        }
        field369 = false;
        if (class127.field1987 == 1 || !Statics.field2015 && class127.field1987 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2536 -= 4;
                method151(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2536 += 4;
                method151(arg0);
            } else if (arg5 >= arg1 - field326 && arg5 < field326 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2536 = (arg4 - arg3) * var8 / var9;
                method151(arg0);
                field369 = true;
            }
        }
        if (field442 == 0) {
            return;
        }
        int var10 = arg0.field2531;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2536 += field442 * 45;
            method151(arg0);
        }
    }

    @ObfuscatedName("cm.cz(IIIIIB)V")
    public static final void method1871(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field86[0].method1581(arg0, arg1);
        Statics.field86[1].method1581(arg0, arg1 + arg3 - 16);
        class73.method1508(arg0, arg1 + 16, 16, arg3 - 32, field439);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class73.method1508(arg0, arg1 + 16 + var6, 16, var5, field370);
        class73.method1514(arg0, arg1 + 16 + var6, var5, field373);
        class73.method1514(arg0 + 1, arg1 + 16 + var6, var5, field373);
        class73.method1504(arg0, arg1 + 16 + var6, 16, field373);
        class73.method1504(arg0, arg1 + 17 + var6, 16, field373);
        class73.method1514(arg0 + 15, arg1 + 16 + var6, var5, field412);
        class73.method1514(arg0 + 14, arg1 + 17 + var6, var5 - 1, field412);
        class73.method1504(arg0, arg1 + 15 + var6 + var5, 16, field412);
        class73.method1504(arg0 + 1, arg1 + 14 + var6 + var5, 15, field412);
    }

    @ObfuscatedName("de.cm(Led;II)I")
    public static final int method2479(class152 arg0, int arg1) {
        if (arg0.field2522 == null || arg1 >= arg0.field2522.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2522[arg1];
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
                    var7 = field383[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field384[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field385[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class152 var11 = class152.method124(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method158(var12).field990 || field249)) {
                        for (int var13 = 0; var13 < var11.field2624.length; var13++) {
                            if (var12 + 1 == var11.field2624[var13]) {
                                var7 += var11.field2573[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class154.field2649[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class140.field2118[field384[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class154.field2649[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1669.field41;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class140.field2117[var14]) {
                            var7 += field384[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class152 var17 = class152.method124(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method158(var18).field990 || field249)) {
                        for (int var19 = 0; var19 < var17.field2624.length; var19++) {
                            if (var18 + 1 == var17.field2624[var19]) {
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
                    var7 = field411;
                }
                if (var6 == 13) {
                    int var20 = class154.field2649[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class154.method2824(var22);
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
                    var7 = (Statics.field1669.field700 >> 7) + Statics.field928;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1669.field726 >> 7) + Statics.field919;
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

    @ObfuscatedName("cr.cs([Led;IIIIIIII)V")
    public static final void method1975(class152[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class152 var9 = arg0[var8];
            if (var9 != null && (!var9.field2636 || var9.field2524 == 0 || var9.field2589 || method474(var9) != 0 || field418 == var9) && var9.field2533 == arg1 && (!var9.field2636 || !method117(var9))) {
                int var10 = var9.field2527 + arg6;
                int var11 = var9.field2528 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2524 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2524 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2531 + var10;
                    int var19 = var9.field2584 + var11;
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
                    int var22 = var9.field2531 + var10;
                    int var23 = var9.field2584 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field417 == var9) {
                    field425 = true;
                    field426 = var10;
                    field481 = var11;
                }
                if (!var9.field2636 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field1988;
                    int var25 = class127.field1989 * -632739763;
                    if (class127.field1996 != 0) {
                        var24 = class127.field1995;
                        var25 = class127.field2002;
                    }
                    if (var9.field2526 == 1337) {
                        method151(var9);
                        if (!field409 && !field387 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field399 == 0 && !field401) {
                                Statics.method2059(class142.field2312, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            for (int var27 = 0; var27 < class98.field1732; var27++) {
                                int var28 = class98.field1685[var27];
                                int var29 = var28 & 0x7F;
                                int var30 = var28 >> 7 & 0x7F;
                                int var31 = var28 >> 29 & 0x3;
                                int var32 = var28 >> 14 & 0x7FFF;
                                if (var26 != var28) {
                                    var26 = var28;
                                    if (var31 == 2 && Statics.field1490.method1631(Statics.field1999, var29, var30, var28) >= 0) {
                                        class36 var33 = class36.method167(var32);
                                        if (var33.field848 != null) {
                                            var33 = var33.method636();
                                        }
                                        if (var33 == null) {
                                            continue;
                                        }
                                        if (field399 == 1) {
                                            Statics.method2059(class142.field2307, field261 + " " + class2.field26 + " " + class2.method2(65535) + var33.field815, 1, var28, var29, var30);
                                        } else if (!field401) {
                                            String[] var34 = var33.field811;
                                            if (field416) {
                                                var34 = method3145(var34);
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
                                                        Statics.method2059(var34[var35], class2.method2(65535) + var33.field815, var36, var28, var29, var30);
                                                    }
                                                }
                                            }
                                            Statics.method2059(class142.field2282, class2.method2(65535) + var33.field815, 1002, var33.field814 << 14, var29, var30);
                                        } else if ((Statics.field52 & 0x4) == 4) {
                                            Statics.method2059(field282, field404 + " " + class2.field26 + " " + class2.method2(65535) + var33.field815, 2, var28, var29, var30);
                                        }
                                    }
                                    if (var31 == 1) {
                                        class30 var37 = field376[var32];
                                        if (var37 == null) {
                                            continue;
                                        }
                                        if (var37.field664.field790 == 1 && (var37.field700 & 0x7F) == 64 && (var37.field726 & 0x7F) == 64) {
                                            for (int var38 = 0; var38 < field440; var38++) {
                                                class30 var39 = field376[field363[var38]];
                                                if (var39 != null && var37 != var39 && var39.field664.field790 == 1 && var37.field700 == var39.field700 && var37.field726 == var39.field726) {
                                                    method573(var39.field664, field363[var38], var29, var30);
                                                }
                                            }
                                            for (int var40 = 0; var40 < field365; var40++) {
                                                class3 var41 = field364[field366[var40]];
                                                if (var41 != null && var37.field700 == var41.field700 && var37.field726 == var41.field726) {
                                                    method1372(var41, field366[var40], var29, var30);
                                                }
                                            }
                                        }
                                        method573(var37.field664, var32, var29, var30);
                                    }
                                    if (var31 == 0) {
                                        class3 var42 = field364[var32];
                                        if (var42 == null) {
                                            continue;
                                        }
                                        if ((var42.field700 & 0x7F) == 64 && (var42.field726 & 0x7F) == 64) {
                                            for (int var43 = 0; var43 < field440; var43++) {
                                                class30 var44 = field376[field363[var43]];
                                                if (var44 != null && var44.field664.field790 == 1 && var42.field700 == var44.field700 && var42.field726 == var44.field726) {
                                                    method573(var44.field664, field363[var43], var29, var30);
                                                }
                                            }
                                            for (int var45 = 0; var45 < field365; var45++) {
                                                class3 var46 = field364[field366[var45]];
                                                if (var46 != null && var42 != var46 && var42.field700 == var46.field700 && var42.field726 == var46.field726) {
                                                    method1372(var46, field366[var45], var29, var30);
                                                }
                                            }
                                        }
                                        method1372(var42, var32, var29, var30);
                                    }
                                    if (var31 == 3) {
                                        class177 var47 = field379[Statics.field1999][var29][var30];
                                        if (var47 != null) {
                                            for (class25 var48 = (class25) var47.method3233(); var48 != null; var48 = (class25) var47.method3254()) {
                                                class45 var49 = class45.method158(var48.field579);
                                                if (field399 == 1) {
                                                    Statics.method2059(class142.field2307, field261 + " " + class2.field26 + " " + class2.method2(16748608) + var49.field986, 16, var48.field579, var29, var30);
                                                } else if (!field401) {
                                                    String[] var50 = var49.field1000;
                                                    if (field416) {
                                                        var50 = method3145(var50);
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
                                                            Statics.method2059(var50[var51], class2.method2(16748608) + var49.field986, var52, var48.field579, var29, var30);
                                                        } else if (var51 == 2) {
                                                            Statics.method2059(class142.field2211, class2.method2(16748608) + var49.field986, 20, var48.field579, var29, var30);
                                                        }
                                                    }
                                                    Statics.method2059(class142.field2282, class2.method2(16748608) + var49.field986, 1004, var48.field579, var29, var30);
                                                } else if ((Statics.field52 & 0x1) == 1) {
                                                    Statics.method2059(field282, field404 + " " + class2.field26 + " " + class2.method2(16748608) + var49.field986, 17, var48.field579, var29, var30);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var9.field2526 == 1338) {
                        method2434(var10, var11);
                    } else {
                        if (!field387 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var53 = var24 - var10;
                            int var54 = var25 - var11;
                            if (var9.field2564 == 1) {
                                Statics.method2059(var9.field2623, "", 24, 0, 0, var9.field2559);
                            }
                            if (var9.field2564 == 2 && !field401) {
                                String var55 = method2598(var9);
                                if (var55 != null) {
                                    Statics.method2059(var55, class2.method2(65280) + var9.field2628, 25, 0, -1, var9.field2559);
                                }
                            }
                            if (var9.field2564 == 3) {
                                Statics.method2059(class142.field2290, "", 26, 0, 0, var9.field2559);
                            }
                            if (var9.field2564 == 4) {
                                Statics.method2059(var9.field2623, "", 28, 0, 0, var9.field2559);
                            }
                            if (var9.field2564 == 5) {
                                Statics.method2059(var9.field2623, "", 29, 0, 0, var9.field2559);
                            }
                            if (var9.field2564 == 6 && field323 == null) {
                                Statics.method2059(var9.field2623, "", 30, 0, -1, var9.field2559);
                            }
                            if (var9.field2524 == 2) {
                                int var56 = 0;
                                for (int var57 = 0; var57 < var9.field2584; var57++) {
                                    for (int var58 = 0; var58 < var9.field2531; var58++) {
                                        int var59 = (var9.field2575 + 32) * var58;
                                        int var60 = (var9.field2576 + 32) * var57;
                                        if (var56 < 20) {
                                            var59 += var9.field2577[var56];
                                            var60 += var9.field2542[var56];
                                        }
                                        if (var53 >= var59 && var54 >= var60 && var53 < var59 + 32 && var54 < var60 + 32) {
                                            field360 = var56;
                                            Statics.field1426 = var9;
                                            if (var9.field2624[var56] > 0) {
                                                class45 var61 = class45.method158(var9.field2624[var56] - 1);
                                                if (field399 == 1 && class156.method1779(method474(var9))) {
                                                    if (Statics.field2667 != var9.field2559 || Statics.field650 != var56) {
                                                        Statics.method2059(class142.field2307, field261 + " " + class2.field26 + " " + class2.method2(16748608) + var61.field986, 31, var61.field984, var56, var9.field2559);
                                                    }
                                                } else if (!field401 || !class156.method1779(method474(var9))) {
                                                    String[] var62 = var61.field1001;
                                                    if (field416) {
                                                        var62 = method3145(var62);
                                                    }
                                                    if (class156.method1779(method474(var9))) {
                                                        for (int var63 = 4; var63 >= 3; var63--) {
                                                            if (var62 != null && var62[var63] != null) {
                                                                byte var64;
                                                                if (var63 == 3) {
                                                                    var64 = 36;
                                                                } else {
                                                                    var64 = 37;
                                                                }
                                                                Statics.method2059(var62[var63], class2.method2(16748608) + var61.field986, var64, var61.field984, var56, var9.field2559);
                                                            } else if (var63 == 4) {
                                                                Statics.method2059(class142.field2133, class2.method2(16748608) + var61.field986, 37, var61.field984, var56, var9.field2559);
                                                            }
                                                        }
                                                    }
                                                    if (class156.method2538(method474(var9))) {
                                                        Statics.method2059(class142.field2307, class2.method2(16748608) + var61.field986, 38, var61.field984, var56, var9.field2559);
                                                    }
                                                    if (class156.method1779(method474(var9)) && var62 != null) {
                                                        for (int var65 = 2; var65 >= 0; var65--) {
                                                            if (var62[var65] != null) {
                                                                byte var66 = 0;
                                                                if (var65 == 0) {
                                                                    var66 = 33;
                                                                }
                                                                if (var65 == 1) {
                                                                    var66 = 34;
                                                                }
                                                                if (var65 == 2) {
                                                                    var66 = 35;
                                                                }
                                                                Statics.method2059(var62[var65], class2.method2(16748608) + var61.field986, var66, var61.field984, var56, var9.field2559);
                                                            }
                                                        }
                                                    }
                                                    String[] var67 = var9.field2580;
                                                    if (field416) {
                                                        var67 = method3145(var67);
                                                    }
                                                    if (var67 != null) {
                                                        for (int var68 = 4; var68 >= 0; var68--) {
                                                            if (var67[var68] != null) {
                                                                byte var69 = 0;
                                                                if (var68 == 0) {
                                                                    var69 = 39;
                                                                }
                                                                if (var68 == 1) {
                                                                    var69 = 40;
                                                                }
                                                                if (var68 == 2) {
                                                                    var69 = 41;
                                                                }
                                                                if (var68 == 3) {
                                                                    var69 = 42;
                                                                }
                                                                if (var68 == 4) {
                                                                    var69 = 43;
                                                                }
                                                                Statics.method2059(var67[var68], class2.method2(16748608) + var61.field986, var69, var61.field984, var56, var9.field2559);
                                                            }
                                                        }
                                                    }
                                                    Statics.method2059(class142.field2282, class2.method2(16748608) + var61.field986, 1005, var61.field984, var56, var9.field2559);
                                                } else if ((Statics.field52 & 0x10) == 16) {
                                                    Statics.method2059(field282, field404 + " " + class2.field26 + " " + class2.method2(16748608) + var61.field986, 32, var61.field984, var56, var9.field2559);
                                                }
                                            }
                                        }
                                        var56++;
                                    }
                                }
                            }
                            if (var9.field2636) {
                                if (field401) {
                                    int var70 = method474(var9);
                                    boolean var71 = (var70 >> 21 & 0x1) != 0;
                                    if (var71 && (Statics.field52 & 0x20) == 32) {
                                        Statics.method2059(field282, field404 + " " + class2.field26 + " " + var9.field2582, 58, 0, var9.field2568, var9.field2559);
                                    }
                                } else {
                                    for (int var72 = 9; var72 >= 5; var72--) {
                                        String var73 = method1592(var9, var72);
                                        if (var73 != null) {
                                            Statics.method2059(var73, var9.field2582, 1007, var72 + 1, var9.field2568, var9.field2559);
                                        }
                                    }
                                    String var74 = method2598(var9);
                                    if (var74 != null) {
                                        Statics.method2059(var74, var9.field2582, 25, 0, var9.field2568, var9.field2559);
                                    }
                                    for (int var75 = 4; var75 >= 0; var75--) {
                                        String var76 = method1592(var9, var75);
                                        if (var76 != null) {
                                            Statics.method2059(var76, var9.field2582, 57, var75 + 1, var9.field2568, var9.field2559);
                                        }
                                    }
                                    int var77 = method474(var9);
                                    boolean var78 = (var77 & 0x1) != 0;
                                    if (var78) {
                                        Statics.method2059(class142.field2137, "", 30, 0, var9.field2568, var9.field2559);
                                    }
                                }
                            }
                        }
                        if (var9.field2524 == 0) {
                            if (!var9.field2636 && method117(var9) && Statics.field661 != var9) {
                                continue;
                            }
                            method1975(arg0, var9.field2559, var12, var13, var14, var15, var10 - var9.field2535, var11 - var9.field2536);
                            if (var9.field2622 != null) {
                                method1975(var9.field2622, var9.field2559, var12, var13, var14, var15, var10 - var9.field2535, var11 - var9.field2536);
                            }
                            class4 var79 = (class4) field362.method3204((long) var9.field2559);
                            if (var79 != null) {
                                if (var79.field60 == 0 && class127.field1988 >= var12 && class127.field1989 * -632739763 >= var13 && class127.field1988 < var14 && class127.field1989 * -632739763 < var15 && !field387 && !field415) {
                                    field393[0] = class142.field2341;
                                    field503[0] = "";
                                    field391[0] = 1006;
                                    field388 = 1;
                                }
                                int var80 = var79.field58;
                                if (class152.method2525(var80)) {
                                    method1975(Statics.field2574[var80], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2636) {
                            if (var9.field2600 && class127.field1988 >= var12 && class127.field1989 * -632739763 >= var13 && class127.field1988 < var14 && class127.field1989 * -632739763 < var15) {
                                for (class1 var81 = (class1) field443.method3232(); var81 != null; var81 = (class1) field443.method3251()) {
                                    if (var81.field2) {
                                        var81.method3311();
                                        var81.field19.field2578 = false;
                                    }
                                }
                                if (Statics.field864 == 0) {
                                    field417 = null;
                                    field418 = null;
                                }
                                if (!field387) {
                                    field393[0] = class142.field2341;
                                    field503[0] = "";
                                    field391[0] = 1006;
                                    field388 = 1;
                                }
                            }
                            boolean var82;
                            if (class127.field1988 >= var12 && class127.field1989 * -632739763 >= var13 && class127.field1988 < var14 && class127.field1989 * -632739763 < var15) {
                                var82 = true;
                            } else {
                                var82 = false;
                            }
                            boolean var83 = false;
                            if ((class127.field1987 == 1 || !Statics.field2015 && class127.field1987 == 4) && var82) {
                                var83 = true;
                            }
                            boolean var84 = false;
                            if ((class127.field1996 == 1 || !Statics.field2015 && class127.field1996 == 4) && class127.field1995 >= var12 && class127.field2002 >= var13 && class127.field1995 < var14 && class127.field2002 < var15) {
                                var84 = true;
                            }
                            if (var84) {
                                method1778(var9, class127.field1995 - var10, class127.field2002 - var11);
                            }
                            if (field417 != null && field417 != var9 && var82 && class156.method518(method474(var9))) {
                                field421 = var9;
                            }
                            if (field418 == var9) {
                                field320 = true;
                                field423 = var10;
                                field403 = var11;
                            }
                            if (var9.field2589) {
                                if (var82 && field442 != 0 && var9.field2610 != null) {
                                    class1 var85 = new class1();
                                    var85.field2 = true;
                                    var85.field19 = var9;
                                    var85.field5 = field442;
                                    var85.field10 = var9.field2610;
                                    field443.method3227(var85);
                                }
                                if (field417 != null || Statics.field29 != null || field387) {
                                    var84 = false;
                                    var83 = false;
                                    var82 = false;
                                }
                                if (!var9.field2632 && var84) {
                                    var9.field2632 = true;
                                    if (var9.field2631 != null) {
                                        class1 var86 = new class1();
                                        var86.field2 = true;
                                        var86.field19 = var9;
                                        var86.field4 = class127.field1995 - var10;
                                        var86.field5 = class127.field2002 - var11;
                                        var86.field10 = var9.field2631;
                                        field443.method3227(var86);
                                    }
                                }
                                if (var9.field2632 && var83 && var9.field2592 != null) {
                                    class1 var87 = new class1();
                                    var87.field2 = true;
                                    var87.field19 = var9;
                                    var87.field4 = class127.field1988 - var10;
                                    var87.field5 = class127.field1989 * -632739763 - var11;
                                    var87.field10 = var9.field2592;
                                    field443.method3227(var87);
                                }
                                if (var9.field2632 && !var83) {
                                    var9.field2632 = false;
                                    if (var9.field2593 != null) {
                                        class1 var88 = new class1();
                                        var88.field2 = true;
                                        var88.field19 = var9;
                                        var88.field4 = class127.field1988 - var10;
                                        var88.field5 = class127.field1989 * -632739763 - var11;
                                        var88.field10 = var9.field2593;
                                        field445.method3227(var88);
                                    }
                                }
                                if (var83 && var9.field2594 != null) {
                                    class1 var89 = new class1();
                                    var89.field2 = true;
                                    var89.field19 = var9;
                                    var89.field4 = class127.field1988 - var10;
                                    var89.field5 = class127.field1989 * -632739763 - var11;
                                    var89.field10 = var9.field2594;
                                    field443.method3227(var89);
                                }
                                if (!var9.field2578 && var82) {
                                    var9.field2578 = true;
                                    if (var9.field2595 != null) {
                                        class1 var90 = new class1();
                                        var90.field2 = true;
                                        var90.field19 = var9;
                                        var90.field4 = class127.field1988 - var10;
                                        var90.field5 = class127.field1989 * -632739763 - var11;
                                        var90.field10 = var9.field2595;
                                        field443.method3227(var90);
                                    }
                                }
                                if (var9.field2578 && var82 && var9.field2596 != null) {
                                    class1 var91 = new class1();
                                    var91.field2 = true;
                                    var91.field19 = var9;
                                    var91.field4 = class127.field1988 - var10;
                                    var91.field5 = class127.field1989 * -632739763 - var11;
                                    var91.field10 = var9.field2596;
                                    field443.method3227(var91);
                                }
                                if (var9.field2578 && !var82) {
                                    var9.field2578 = false;
                                    if (var9.field2597 != null) {
                                        class1 var92 = new class1();
                                        var92.field2 = true;
                                        var92.field19 = var9;
                                        var92.field4 = class127.field1988 - var10;
                                        var92.field5 = class127.field1989 * -632739763 - var11;
                                        var92.field10 = var9.field2597;
                                        field445.method3227(var92);
                                    }
                                }
                                if (var9.field2608 != null) {
                                    class1 var93 = new class1();
                                    var93.field19 = var9;
                                    var93.field10 = var9.field2608;
                                    field494.method3227(var93);
                                }
                                if (var9.field2539 != null && field496 > var9.field2634) {
                                    if (var9.field2532 == null || field496 - var9.field2634 > 32) {
                                        class1 var98 = new class1();
                                        var98.field19 = var9;
                                        var98.field10 = var9.field2539;
                                        field443.method3227(var98);
                                    } else {
                                        label884: for (int var94 = var9.field2634; var94 < field496; var94++) {
                                            int var95 = field430[var94 & 0x1F];
                                            for (int var96 = 0; var96 < var9.field2532.length; var96++) {
                                                if (var9.field2532[var96] == var95) {
                                                    class1 var97 = new class1();
                                                    var97.field19 = var9;
                                                    var97.field10 = var9.field2539;
                                                    field443.method3227(var97);
                                                    break label884;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2634 = field496;
                                }
                                if (var9.field2635 != null && field433 > var9.field2518) {
                                    if (var9.field2605 == null || field433 - var9.field2518 > 32) {
                                        class1 var103 = new class1();
                                        var103.field19 = var9;
                                        var103.field10 = var9.field2635;
                                        field443.method3227(var103);
                                    } else {
                                        label860: for (int var99 = var9.field2518; var99 < field433; var99++) {
                                            int var100 = field432[var99 & 0x1F];
                                            for (int var101 = 0; var101 < var9.field2605.length; var101++) {
                                                if (var9.field2605[var101] == var100) {
                                                    class1 var102 = new class1();
                                                    var102.field19 = var9;
                                                    var102.field10 = var9.field2635;
                                                    field443.method3227(var102);
                                                    break label860;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2518 = field433;
                                }
                                if (var9.field2561 != null && field435 > var9.field2513) {
                                    if (var9.field2607 == null || field435 - var9.field2513 > 32) {
                                        class1 var108 = new class1();
                                        var108.field19 = var9;
                                        var108.field10 = var9.field2561;
                                        field443.method3227(var108);
                                    } else {
                                        label836: for (int var104 = var9.field2513; var104 < field435; var104++) {
                                            int var105 = field434[var104 & 0x1F];
                                            for (int var106 = 0; var106 < var9.field2607.length; var106++) {
                                                if (var9.field2607[var106] == var105) {
                                                    class1 var107 = new class1();
                                                    var107.field19 = var9;
                                                    var107.field10 = var9.field2561;
                                                    field443.method3227(var107);
                                                    break label836;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2513 = field435;
                                }
                                if (field436 > var9.field2633 && var9.field2611 != null) {
                                    class1 var109 = new class1();
                                    var109.field19 = var9;
                                    var109.field10 = var9.field2611;
                                    field443.method3227(var109);
                                }
                                if (field437 > var9.field2633 && var9.field2558 != null) {
                                    class1 var110 = new class1();
                                    var110.field19 = var9;
                                    var110.field10 = var9.field2558;
                                    field443.method3227(var110);
                                }
                                if (field438 > var9.field2633 && var9.field2614 != null) {
                                    class1 var111 = new class1();
                                    var111.field19 = var9;
                                    var111.field10 = var9.field2614;
                                    field443.method3227(var111);
                                }
                                if (field275 > var9.field2633 && var9.field2618 != null) {
                                    class1 var112 = new class1();
                                    var112.field19 = var9;
                                    var112.field10 = var9.field2618;
                                    field443.method3227(var112);
                                }
                                var9.field2633 = field462;
                                if (var9.field2552 != null) {
                                    for (int var113 = 0; var113 < field501; var113++) {
                                        class1 var114 = new class1();
                                        var114.field19 = var9;
                                        var114.field8 = field382[var113];
                                        var114.field12 = field267[var113];
                                        var114.field10 = var9.field2552;
                                        field443.method3227(var114);
                                    }
                                }
                            }
                        }
                        if (!var9.field2636 && field417 == null && Statics.field29 == null && !field387) {
                            if ((var9.field2621 >= 0 || var9.field2541 != 0) && class127.field1988 >= var12 && class127.field1989 * -632739763 >= var13 && class127.field1988 < var14 && class127.field1989 * -632739763 < var15) {
                                if (var9.field2621 >= 0) {
                                    Statics.field661 = arg0[var9.field2621];
                                } else {
                                    Statics.field661 = var9;
                                }
                            }
                            if (var9.field2524 == 8 && class127.field1988 >= var12 && class127.field1989 * -632739763 >= var13 && class127.field1988 < var14 && class127.field1989 * -632739763 < var15) {
                                Statics.field240 = var9;
                            }
                            if (var9.field2538 > var9.field2584) {
                                method882(var9, var9.field2531 + var10, var11, var9.field2584, var9.field2538, class127.field1988, class127.field1989 * -632739763);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.cv(III)V")
    public static final void method28(int arg0, int arg1) {
        if (class152.method2525(arg0)) {
            Statics.method159(Statics.field2574[arg0], arg1);
        }
    }

    @ObfuscatedName("ck.cd(Led;III)V")
    public static final void method1778(class152 arg0, int arg1, int arg2) {
        if (field417 != null || field387 || arg0 == null || method597(arg0) == null) {
            return;
        }
        field417 = arg0;
        field418 = method597(arg0);
        field419 = arg1;
        field420 = arg2;
        Statics.field864 = 0;
        field428 = false;
        if (field388 <= 0) {
            return;
        }
        int var3 = field388 - 1;
        Statics.field128 = new class27();
        Statics.field128.field608 = field389[var3];
        Statics.field128.field604 = field390[var3];
        Statics.field128.field609 = field391[var3];
        Statics.field128.field606 = field502[var3];
        Statics.field128.field607 = field393[var3];
    }

    @ObfuscatedName("c.cy(Led;I)V")
    public static void method151(class152 arg0) {
        if (field448 == arg0.field2615) {
            field449[arg0.field2637] = true;
        }
    }

    @ObfuscatedName("ad.cf(I)V")
    public static void method574() {
        for (class4 var0 = (class4) field362.method3197(); var0 != null; var0 = (class4) field362.method3200()) {
            int var1 = var0.field58;
            if (class152.method2525(var1)) {
                boolean var2 = true;
                class152[] var3 = Statics.field2574[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2636;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2857;
                    class152 var6 = class152.method124(var5);
                    if (var6 != null) {
                        method151(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.cl(Led;I)Led;")
    public static class152 method597(class152 arg0) {
        class152 var1 = arg0;
        int var2 = class156.method1974(method474(arg0));
        class152 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class152.method124(var1.field2533);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class152 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2560;
        }
        return var5;
    }

    @ObfuscatedName("fm.ch([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method3145(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("g.cr(II)V")
    public static final void method526(int arg0) {
        if (!class152.method2525(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2574[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3 != null) {
                var3.field2525 = 0;
                var3.field2629 = 0;
            }
        }
    }

    @ObfuscatedName("z.cu([Led;II)V")
    public static final void method1(class152[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class152 var3 = arg0[var2];
            if (var3 != null && var3.field2533 == arg1 && (!var3.field2636 || !method117(var3))) {
                if (var3.field2524 == 0) {
                    if (!var3.field2636 && method117(var3) && Statics.field661 != var3) {
                        continue;
                    }
                    method1(arg0, var3.field2559);
                    if (var3.field2622 != null) {
                        method1(var3.field2622, var3.field2559);
                    }
                    class4 var4 = (class4) field362.method3204((long) var3.field2559);
                    if (var4 != null) {
                        int var5 = var4.field58;
                        if (class152.method2525(var5)) {
                            method1(Statics.field2574[var5], -1);
                        }
                    }
                }
                if (var3.field2524 == 6) {
                    if (var3.field2591 != -1 || var3.field2555 != -1) {
                        boolean var6 = Statics.method172(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2555;
                        } else {
                            var7 = var3.field2591;
                        }
                        if (var7 != -1) {
                            class38 var8 = class38.method84(var7);
                            var3.field2629 += field265;
                            while (var3.field2629 > var8.field867[var3.field2525]) {
                                var3.field2629 -= var8.field867[var3.field2525];
                                var3.field2525++;
                                if (var3.field2525 >= var8.field872.length) {
                                    var3.field2525 -= var8.field883;
                                    if (var3.field2525 < 0 || var3.field2525 >= var8.field872.length) {
                                        var3.field2525 = 0;
                                    }
                                }
                                method151(var3);
                            }
                        }
                    }
                    if (var3.field2566 != 0 && !var3.field2636) {
                        int var9 = var3.field2566 >> 16;
                        int var10 = var3.field2566 << 16 >> 16;
                        int var11 = field265 * var9;
                        int var12 = field265 * var10;
                        var3.field2590 = var3.field2590 + var11 & 0x7FF;
                        var3.field2563 = var3.field2563 + var12 & 0x7FF;
                        method151(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cf.cg(II)V")
    public static final void method1962(int arg0) {
        method574();
        class20.method499();
        class46 var1 = (class46) class46.field1029.method3162((long) arg0);
        class46 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1033.method2705(16, arg0);
            class46 var4 = new class46();
            if (var3 != null) {
                var4.method889(new class107(var3));
            }
            class46.field1029.method3171(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field1028;
        if (var5 == 0) {
            return;
        }
        int var6 = class154.field2649[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class84.method1835(0.9D);
                ((class88) Statics.field1450).method1863(0.9D);
            }
            if (var6 == 2) {
                class84.method1835(0.8D);
                ((class88) Statics.field1450).method1863(0.8D);
            }
            if (var6 == 3) {
                class84.method1835(0.7D);
                ((class88) Statics.field1450).method1863(0.7D);
            }
            if (var6 == 4) {
                class84.method1835(0.6D);
                ((class88) Statics.field1450).method1863(0.6D);
            }
            class45.method669();
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
            if (field414 != var7) {
                if (field414 == 0 && field477 != -1) {
                    class161.method2945(Statics.field2706, field477, 0, var7, false);
                    field478 = false;
                } else if (var7 == 0) {
                    class161.method2880();
                    field478 = false;
                } else if (class161.field2699 == 0) {
                    Statics.field1882.method3036(var7);
                } else {
                    Statics.field2664 = var7;
                }
                field414 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field454 = 127;
            }
            if (var6 == 1) {
                field454 = 96;
            }
            if (var6 == 2) {
                field454 = 64;
            }
            if (var6 == 3) {
                field454 = 32;
            }
            if (var6 == 4) {
                field454 = 0;
            }
        }
        if (var5 == 5) {
            field380 = var6;
        }
        if (var5 == 6) {
            field407 = var6;
        }
        if (var5 == 9) {
            field408 = var6;
        }
        if (var5 == 10) {
            if (var6 == 0) {
                field251 = 127;
            }
            if (var6 == 1) {
                field251 = 96;
            }
            if (var6 == 2) {
                field251 = 64;
            }
            if (var6 == 3) {
                field251 = 32;
            }
            if (var6 == 4) {
                field251 = 0;
            }
        }
        if (var5 == 17) {
            field413 = var6 & 0xFFFF;
        }
        if (var5 == 18) {
            field345 = (class18) Statics.method720(class18.method65(), var6);
            if (field345 == null) {
                field345 = class18.field509;
            }
        }
        if (var5 != 19) {
            return;
        }
        if (var6 == -1) {
            field316 = -1;
        } else {
            field316 = var6 & 0x7FF;
        }
    }

    @ObfuscatedName("ep.ct(Ly;ZB)V")
    public static final void method2691(class4 arg0, boolean arg1) {
        int var2 = arg0.field58;
        int var3 = (int) arg0.field2857;
        arg0.method3311();
        if (arg1) {
            class152.method561(var2);
        }
        for (class179 var4 = (class179) field446.method3197(); var4 != null; var4 = (class179) field446.method3200()) {
            if ((long) var2 == (var4.field2857 >> 48 & 0xFFFFL)) {
                var4.method3311();
            }
        }
        class152 var5 = class152.method124(var3);
        if (var5 != null) {
            method151(var5);
        }
        method78();
        if (field381 != -1) {
            method28(field381, 1);
        }
    }

    @ObfuscatedName("ah.cb(Led;I)Z")
    public static final boolean method977(class152 arg0) {
        int var1 = arg0.field2526;
        if (var1 == 205) {
            field321 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field500.method2915(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field500.method2916(var4, var5 == 1);
        }
        if (var1 == 324) {
            field500.method2923(false);
        }
        if (var1 == 325) {
            field500.method2923(true);
        }
        if (var1 == 326) {
            field285.method2364(202);
            field500.method2943(field285);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aj.cp(IIII)V")
    public static final void method595(int arg0, int arg1, int arg2) {
        method108();
        class73.method1502(arg0, arg1, Statics.field2487.field1298 + arg0, Statics.field2487.field1299 + arg1);
        if (field475 == 2 || field475 == 5) {
            class73.method1516(arg0 + 25, arg1 + 5, 0, Statics.field943, Statics.field1402);
        } else {
            int var3 = field346 + field254 & 0x7FF;
            int var4 = Statics.field1669.field700 / 32 + 48;
            int var5 = 464 - Statics.field1669.field726 / 32;
            Statics.field2083.method1410(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field348 + 256, Statics.field943, Statics.field1402);
            for (int var6 = 0; var6 < field394; var6++) {
                int var7 = field286[var6] * 4 + 2 - Statics.field1669.field700 / 32;
                int var8 = field397[var6] * 4 + 2 - Statics.field1669.field726 / 32;
                method2785(arg0, arg1, var7, var8, field472[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field379[Statics.field1999][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1669.field700 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1669.field726 / 32;
                        method2785(arg0, arg1, var12, var13, Statics.field953[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field440; var14++) {
                class30 var15 = field376[field363[var14]];
                if (var15 != null && var15.method17()) {
                    class35 var16 = var15.field664;
                    if (var16 != null && var16.field785 != null) {
                        var16 = var16.method605();
                    }
                    if (var16 != null && var16.field788 && var16.field800) {
                        int var17 = var15.field700 / 32 - Statics.field1669.field700 / 32;
                        int var18 = var15.field726 / 32 - Statics.field1669.field726 / 32;
                        method2785(arg0, arg1, var17, var18, Statics.field953[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field365; var19++) {
                class3 var20 = field364[field366[var19]];
                if (var20 != null && var20.method17()) {
                    int var21 = var20.field700 / 32 - Statics.field1669.field700 / 32;
                    int var22 = var20.field726 / 32 - Statics.field1669.field726 / 32;
                    boolean var23 = false;
                    if (method883(var20.field42, true)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field861; var25++) {
                        if (var20.field42.equals(Statics.field2474[var25].field548)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field1669.field50 != 0 && var20.field50 != 0 && Statics.field1669.field50 == var20.field50) {
                        var26 = true;
                    }
                    if (var23) {
                        method2785(arg0, arg1, var21, var22, Statics.field953[3]);
                    } else if (var26) {
                        method2785(arg0, arg1, var21, var22, Statics.field953[4]);
                    } else if (var24) {
                        method2785(arg0, arg1, var21, var22, Statics.field953[5]);
                    } else {
                        method2785(arg0, arg1, var21, var22, Statics.field953[2]);
                    }
                }
            }
            if (field262 != 0 && field386 % 20 < 10) {
                if (field262 == 1 && field263 >= 0 && field263 < field376.length) {
                    class30 var27 = field376[field263];
                    if (var27 != null) {
                        int var28 = var27.field700 / 32 - Statics.field1669.field700 / 32;
                        int var29 = var27.field726 / 32 - Statics.field1669.field726 / 32;
                        method1308(arg0, arg1, var28, var29, Statics.field7[1]);
                    }
                }
                if (field262 == 2) {
                    int var30 = field406 * 4 - Statics.field928 * 4 + 2 - Statics.field1669.field700 / 32;
                    int var31 = field266 * 4 - Statics.field919 * 4 + 2 - Statics.field1669.field726 / 32;
                    method1308(arg0, arg1, var30, var31, Statics.field7[1]);
                }
                if (field262 == 10 && field264 >= 0 && field264 < field364.length) {
                    class3 var32 = field364[field264];
                    if (var32 != null) {
                        int var33 = var32.field700 / 32 - Statics.field1669.field700 / 32;
                        int var34 = var32.field726 / 32 - Statics.field1669.field726 / 32;
                        method1308(arg0, arg1, var33, var34, Statics.field7[1]);
                    }
                }
            }
            if (field344 != 0) {
                int var35 = field344 * 4 + 2 - Statics.field1669.field700 / 32;
                int var36 = field474 * 4 + 2 - Statics.field1669.field726 / 32;
                method2785(arg0, arg1, var35, var36, Statics.field7[0]);
            }
            class73.method1508(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field475 < 3) {
            Statics.field580.method1410(arg0, arg1, 33, 33, 25, 25, field346, 256, Statics.field70, Statics.field195);
        } else {
            class73.method1516(arg0, arg1, 0, Statics.field70, Statics.field195);
        }
        if (field451[arg2]) {
            Statics.field2487.method1581(arg0, arg1);
        }
        field450[arg2] = true;
    }

    @ObfuscatedName("ba.ce(IIIILbw;I)V")
    public static final void method1308(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method2785(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field346 + field254 & 0x7FF;
        int var7 = class84.field1447[var6];
        int var8 = class84.field1454[var6];
        int var9 = var7 * 256 / (field348 + 256);
        int var10 = var8 * 256 / (field348 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field908.method1497(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("er.ca(IIIILbw;I)V")
    public static final void method2785(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field346 + field254 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1447[var5];
        int var8 = class84.field1454[var5];
        int var9 = var7 * 256 / (field348 + 256);
        int var10 = var8 * 256 / (field348 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1493(Statics.field2487, arg0 + 94 + var11 - arg4.field1282 / 2 + 4, arg1 + 83 - var12 - arg4.field1287 / 2 - 4);
        } else {
            arg4.method1422(arg0 + 94 + var11 - arg4.field1282 / 2 + 4, arg1 + 83 - var12 - arg4.field1287 / 2 - 4);
        }
    }

    @ObfuscatedName("aa.dv(Ljava/lang/String;ZI)Z")
    public static boolean method883(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class198.method1858(arg0, Statics.field1222);
        for (int var3 = 0; var3 < field361; var3++) {
            if (var2.equalsIgnoreCase(class198.method1858(field315[var3].field221, Statics.field1222)) && (!arg1 || field315[var3].field216 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class198.method1858(Statics.field1669.field42, Statics.field1222))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dz.dc(Ljava/lang/String;B)Z")
    public static boolean method2535(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class198.method1858(arg0, Statics.field1222);
        for (int var2 = 0; var2 < field498; var2++) {
            class8 var3 = field464[var2];
            if (var1.equalsIgnoreCase(class198.method1858(var3.field127, Statics.field1222))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class198.method1858(var3.field126, Statics.field1222))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("g.dq(Ljava/lang/String;B)V")
    public static final void method522(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field361 < 200 || field371 == 1) || field361 >= 400) {
            class10.method2425(30, "", class142.field2297);
            return;
        }
        String var1 = class198.method1858(arg0, Statics.field1222);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field361; var2++) {
            class16 var3 = field315[var2];
            String var4 = class198.method1858(var3.field221, Statics.field1222);
            if (var4 != null && var4.equals(var1)) {
                class10.method2425(30, "", arg0 + class142.field2298);
                return;
            }
            if (var3.field219 != null) {
                String var5 = class198.method1858(var3.field219, Statics.field1222);
                if (var5 != null && var5.equals(var1)) {
                    class10.method2425(30, "", arg0 + class142.field2298);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field498; var6++) {
            class8 var7 = field464[var6];
            String var8 = class198.method1858(var7.field127, Statics.field1222);
            if (var8 != null && var8.equals(var1)) {
                class10.method2425(30, "", class142.field2303 + arg0 + class142.field2304);
                return;
            }
            if (var7.field126 != null) {
                String var9 = class198.method1858(var7.field126, Statics.field1222);
                if (var9 != null && var9.equals(var1)) {
                    class10.method2425(30, "", class142.field2303 + arg0 + class142.field2304);
                    return;
                }
            }
        }
        if (class198.method1858(Statics.field1669.field42, Statics.field1222).equals(var1)) {
            class10.method2425(30, "", class142.field2301);
        } else {
            field285.method2364(84);
            field285.method2108(class107.method722(arg0));
            field285.method2113(arg0);
        }
    }

    @ObfuscatedName("bf.db(Ljava/lang/String;I)V")
    public static final void method1597(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class198.method1858(arg0, Statics.field1222);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field498; var2++) {
            class8 var3 = field464[var2];
            String var4 = var3.field127;
            String var5 = class198.method1858(var4, Statics.field1222);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field498--;
                for (int var7 = var2; var7 < field498; var7++) {
                    field464[var7] = field464[var7 + 1];
                }
                field437 = field462;
                field285.method2364(175);
                field285.method2108(class107.method722(arg0));
                field285.method2113(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("x.dg(Ljava/lang/String;I)V")
    public static final void method463(String arg0) {
        if (!arg0.equals("")) {
            field285.method2364(204);
            field285.method2108(class107.method722(arg0));
            field285.method2113(arg0);
        }
    }

    @ObfuscatedName("w.dr(I)V")
    public static final void method173() {
        field285.method2364(204);
        field285.method2108(0);
    }

    @ObfuscatedName("k.dk(Led;S)I")
    public static int method474(class152 arg0) {
        class179 var1 = (class179) field446.method3204(((long) arg0.field2559 << 32) + (long) arg0.field2568);
        return var1 == null ? arg0.field2581 : var1.field2846;
    }

    @ObfuscatedName("h.dw(Led;I)Z")
    public static boolean method117(class152 arg0) {
        if (field415) {
            if (method474(arg0) != 0) {
                return false;
            }
            if (arg0.field2524 == 0) {
                return false;
            }
        }
        return arg0.field2534;
    }

    @ObfuscatedName("br.do(Led;II)Ljava/lang/String;")
    public static String method1592(class152 arg0, int arg1) {
        int var2 = method474(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2609 == null) {
            return null;
        } else if (arg0.field2583 == null || arg0.field2583.length <= arg1 || arg0.field2583[arg1] == null || arg0.field2583[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2583[arg1];
        }
    }

    @ObfuscatedName("dj.df(Led;B)Ljava/lang/String;")
    public static String method2598(class152 arg0) {
        if (class156.method2812(method474(arg0)) == 0) {
            return null;
        } else if (arg0.field2588 == null || arg0.field2588.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2588;
        }
    }

    @ObfuscatedName("x.dh(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method465(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field248 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field248 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field248 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field248 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field248 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field283 + "/";
    }
}

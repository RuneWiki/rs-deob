package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

public final class client extends class131 {

    @ObfuscatedName("client.g")
    public static boolean field240 = true;

    @ObfuscatedName("client.h")
    public static int field241 = 1;

    @ObfuscatedName("client.l")
    public static int field423 = 0;

    @ObfuscatedName("client.u")
    public static int field384 = 0;

    @ObfuscatedName("client.d")
    public static boolean field361 = false;

    @ObfuscatedName("client.v")
    public static boolean field246 = false;

    @ObfuscatedName("client.n")
    public static int field247 = 0;

    @ObfuscatedName("client.a")
    public static int field416 = 0;

    @ObfuscatedName("client.t")
    public static boolean field250 = true;

    @ObfuscatedName("client.p")
    public static int field245 = 0;

    @ObfuscatedName("client.i")
    public static long field307 = 1L;

    @ObfuscatedName("client.w")
    public static class198[] field254 = new class198[4];

    @ObfuscatedName("client.b")
    public static int field341 = -1;

    @ObfuscatedName("client.q")
    public static int field438 = -1;

    @ObfuscatedName("client.o")
    public static int field255 = -1;

    @ObfuscatedName("client.m")
    public static boolean field256 = true;

    @ObfuscatedName("client.f")
    public static boolean field257 = false;

    @ObfuscatedName("client.ab")
    public static int field401 = 0;

    @ObfuscatedName("client.al")
    public static int field259 = 0;

    @ObfuscatedName("client.an")
    public static int field260 = 0;

    @ObfuscatedName("client.aw")
    public static int field261 = 0;

    @ObfuscatedName("client.ar")
    public static int field262 = 0;

    @ObfuscatedName("client.ai")
    public static int field424 = 0;

    @ObfuscatedName("client.aj")
    public static int field264 = 0;

    @ObfuscatedName("client.ao")
    public static int field486 = 0;

    @ObfuscatedName("client.ap")
    public static int field266 = 0;

    @ObfuscatedName("client.as")
    public static class107 field267 = new class107(new byte[5000]);

    @ObfuscatedName("client.ay")
    public static class18 field268 = class18.field515;

    @ObfuscatedName("client.ak")
    public static int field269 = 0;

    @ObfuscatedName("client.az")
    public static int field456 = 0;

    @ObfuscatedName("client.ag")
    public static int field265 = 0;

    @ObfuscatedName("client.be")
    public static int field371 = 0;

    @ObfuscatedName("client.bp")
    public static int field274 = 0;

    @ObfuscatedName("client.bv")
    public static int field249 = 0;

    @ObfuscatedName("client.bx")
    public static int field283 = 0;

    @ObfuscatedName("client.ba")
    public static int field277 = 0;

    @ObfuscatedName("client.bh")
    public static class30[] field279 = new class30[32768];

    @ObfuscatedName("client.bu")
    public static int field280 = 0;

    @ObfuscatedName("client.bw")
    public static int[] field281 = new int[32768];

    @ObfuscatedName("client.cn")
    public static class110 field282 = new class110(5000);

    @ObfuscatedName("client.cg")
    public static class110 field242 = new class110(5000);

    @ObfuscatedName("client.cd")
    public static class110 field284 = new class110(5000);

    @ObfuscatedName("client.ce")
    public static int field285 = 0;

    @ObfuscatedName("client.cs")
    public static int field286 = 0;

    @ObfuscatedName("client.ca")
    public static int field287 = 0;

    @ObfuscatedName("client.cr")
    public static int field288 = 0;

    @ObfuscatedName("client.cl")
    public static int field289 = 0;

    @ObfuscatedName("client.cy")
    public static int field406 = 0;

    @ObfuscatedName("client.ci")
    public static int field326 = 0;

    @ObfuscatedName("client.co")
    public static int field292 = 0;

    @ObfuscatedName("client.cf")
    public static boolean field434 = false;

    @ObfuscatedName("client.ch")
    public static int field449 = 0;

    @ObfuscatedName("client.cx")
    public static int field295 = 0;

    @ObfuscatedName("client.dx")
    public static int field492 = 1;

    @ObfuscatedName("client.di")
    public static int field297 = 0;

    @ObfuscatedName("client.dy")
    public static int field385 = 1;

    @ObfuscatedName("client.du")
    public static int field299 = 0;

    @ObfuscatedName("client.da")
    public static boolean field301 = false;

    @ObfuscatedName("client.dz")
    public static int[][][] field302 = new int[4][13][13];

    @ObfuscatedName("client.dp")
    public static final int[] field447 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dt")
    public static int field304 = 0;

    @ObfuscatedName("client.dc")
    public static int field305 = 2;

    @ObfuscatedName("client.do")
    public static int field306 = 0;

    @ObfuscatedName("client.de")
    public static int field376 = 2;

    @ObfuscatedName("client.dq")
    public static int field448 = 0;

    @ObfuscatedName("client.dg")
    public static int field263 = 1;

    @ObfuscatedName("client.df")
    public static int field310 = 0;

    @ObfuscatedName("client.dv")
    public static int field318 = 0;

    @ObfuscatedName("client.dd")
    public static int field312 = 2;

    @ObfuscatedName("client.dk")
    public static int field313 = 0;

    @ObfuscatedName("client.es")
    public static int field314 = 1;

    @ObfuscatedName("client.eh")
    public static int field315 = 0;

    @ObfuscatedName("client.et")
    public static int field244 = 0;

    @ObfuscatedName("client.ef")
    public static int field317 = 2301979;

    @ObfuscatedName("client.ep")
    public static int field270 = 5063219;

    @ObfuscatedName("client.ez")
    public static int field319 = 3353893;

    @ObfuscatedName("client.ek")
    public static int field320 = 7759444;

    @ObfuscatedName("client.el")
    public static boolean field321 = false;

    @ObfuscatedName("client.fb")
    public static int field322 = 0;

    @ObfuscatedName("client.ff")
    public static int field464 = 128;

    @ObfuscatedName("client.fq")
    public static int field325 = 0;

    @ObfuscatedName("client.fn")
    public static int field351 = 0;

    @ObfuscatedName("client.fr")
    public static int field327 = 0;

    @ObfuscatedName("client.fj")
    public static int field252 = 0;

    @ObfuscatedName("client.fv")
    public static int field329 = 0;

    @ObfuscatedName("client.fl")
    public static int field291 = 0;

    @ObfuscatedName("client.fu")
    public static boolean field400 = false;

    @ObfuscatedName("client.fm")
    public static int field332 = 0;

    @ObfuscatedName("client.fx")
    public static int field333 = 0;

    @ObfuscatedName("client.fk")
    public static int field411 = 50;

    @ObfuscatedName("client.fs")
    public static int[] field335 = new int[field411];

    @ObfuscatedName("client.ft")
    public static int[] field460 = new int[field411];

    @ObfuscatedName("client.fw")
    public static int[] field337 = new int[field411];

    @ObfuscatedName("client.fz")
    public static int[] field476 = new int[field411];

    @ObfuscatedName("client.fi")
    public static int[] field339 = new int[field411];

    @ObfuscatedName("client.fd")
    public static int[] field345 = new int[field411];

    @ObfuscatedName("client.fp")
    public static int[] field338 = new int[field411];

    @ObfuscatedName("client.gj")
    public static String[] field342 = new String[field411];

    @ObfuscatedName("client.ga")
    public static int[][] field343 = new int[104][104];

    @ObfuscatedName("client.gf")
    public static int field331 = 0;

    @ObfuscatedName("client.gb")
    public static int field360 = -1;

    @ObfuscatedName("client.gk")
    public static int field346 = -1;

    @ObfuscatedName("client.ge")
    public static int field296 = 0;

    @ObfuscatedName("client.gr")
    public static int field348 = 0;

    @ObfuscatedName("client.gt")
    public static int field349 = 0;

    @ObfuscatedName("client.gd")
    public static int field350 = 0;

    @ObfuscatedName("client.gc")
    public static int field420 = 0;

    @ObfuscatedName("client.gn")
    public static int field352 = 0;

    @ObfuscatedName("client.gx")
    public static int field454 = 0;

    @ObfuscatedName("client.gi")
    public static int field354 = 0;

    @ObfuscatedName("client.gm")
    public static int field355 = 0;

    @ObfuscatedName("client.gv")
    public static int field356 = 0;

    @ObfuscatedName("client.gz")
    public static boolean field357 = false;

    @ObfuscatedName("client.gs")
    public static int field328 = 0;

    @ObfuscatedName("client.go")
    public static int field359 = 0;

    @ObfuscatedName("client.gp")
    public static class3[] field358 = new class3[2048];

    @ObfuscatedName("client.gw")
    public static int field294 = 0;

    @ObfuscatedName("client.gg")
    public static int[] field362 = new int[2048];

    @ObfuscatedName("client.hh")
    public static int field363 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field364 = new int[2048];

    @ObfuscatedName("client.hk")
    public static class107[] field365 = new class107[2048];

    @ObfuscatedName("client.ha")
    public static int field366 = -1;

    @ObfuscatedName("client.hn")
    public static int field367 = 0;

    @ObfuscatedName("client.hx")
    public static int field368 = 0;

    @ObfuscatedName("client.hp")
    public static int[] field369 = new int[1000];

    @ObfuscatedName("client.hm")
    public static final int[] field370 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hr")
    public static String[] field502 = new String[8];

    @ObfuscatedName("client.hl")
    public static boolean[] field372 = new boolean[8];

    @ObfuscatedName("client.hq")
    public static int[] field373 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hg")
    public static int field374 = -1;

    @ObfuscatedName("client.hw")
    public static class178[][][] field452 = new class178[4][104][104];

    @ObfuscatedName("client.hf")
    public static class178 field499 = new class178();

    @ObfuscatedName("client.hz")
    public static class178 field377 = new class178();

    @ObfuscatedName("client.hv")
    public static class178 field378 = new class178();

    @ObfuscatedName("client.hy")
    public static int[] field478 = new int[25];

    @ObfuscatedName("client.he")
    public static int[] field380 = new int[25];

    @ObfuscatedName("client.ht")
    public static int[] field381 = new int[25];

    @ObfuscatedName("client.hd")
    public static int field293 = 0;

    @ObfuscatedName("client.hu")
    public static boolean field383 = false;

    @ObfuscatedName("client.il")
    public static int field258 = 0;

    @ObfuscatedName("client.ij")
    public static int[] field390 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field330 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field387 = new int[500];

    @ObfuscatedName("client.io")
    public static int[] field388 = new int[500];

    @ObfuscatedName("client.ii")
    public static String[] field389 = new String[500];

    @ObfuscatedName("client.ir")
    public static String[] field501 = new String[500];

    @ObfuscatedName("client.ic")
    public static int field391 = -1;

    @ObfuscatedName("client.ie")
    public static int field466 = -1;

    @ObfuscatedName("client.ik")
    public static int field393 = 0;

    @ObfuscatedName("client.im")
    public static int field394 = 50;

    @ObfuscatedName("client.if")
    public static int field395 = 0;

    @ObfuscatedName("client.it")
    public static String field396 = null;

    @ObfuscatedName("client.iy")
    public static boolean field397 = false;

    @ObfuscatedName("client.ia")
    public static int field398 = -1;

    @ObfuscatedName("client.id")
    public static int field399 = -1;

    @ObfuscatedName("client.jc")
    public static String field308 = null;

    @ObfuscatedName("client.jq")
    public static String field298 = null;

    @ObfuscatedName("client.jg")
    public static int field402 = -1;

    @ObfuscatedName("client.jm")
    public static class175 field403 = new class175(8);

    @ObfuscatedName("client.ja")
    public static int field404 = 0;

    @ObfuscatedName("client.jp")
    public static int field405 = 0;

    @ObfuscatedName("client.jb")
    public static class153 field451 = null;

    @ObfuscatedName("client.jy")
    public static int field309 = 0;

    @ObfuscatedName("client.jf")
    public static int field334 = 0;

    @ObfuscatedName("client.jn")
    public static int field409 = 0;

    @ObfuscatedName("client.jh")
    public static int field410 = -1;

    @ObfuscatedName("client.js")
    public static boolean field316 = false;

    @ObfuscatedName("client.jx")
    public static boolean field491 = false;

    @ObfuscatedName("client.jk")
    public static boolean field413 = false;

    @ObfuscatedName("client.jr")
    public static class153 field271 = null;

    @ObfuscatedName("client.jo")
    public static class153 field415 = null;

    @ObfuscatedName("client.je")
    public static int field248 = 0;

    @ObfuscatedName("client.ji")
    public static int field417 = 0;

    @ObfuscatedName("client.jv")
    public static class153 field418 = null;

    @ObfuscatedName("client.jz")
    public static boolean field419 = false;

    @ObfuscatedName("client.jj")
    public static int field484 = -1;

    @ObfuscatedName("client.jl")
    public static int field421 = -1;

    @ObfuscatedName("client.jt")
    public static boolean field422 = false;

    @ObfuscatedName("client.jw")
    public static int field253 = -1;

    @ObfuscatedName("client.jd")
    public static int field474 = -1;

    @ObfuscatedName("client.kk")
    public static boolean field324 = false;

    @ObfuscatedName("client.kn")
    public static int field303 = 1;

    @ObfuscatedName("client.kp")
    public static int[] field459 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field469 = 0;

    @ObfuscatedName("client.kw")
    public static int[] field386 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field431 = 0;

    @ObfuscatedName("client.kg")
    public static int[] field432 = new int[32];

    @ObfuscatedName("client.kv")
    public static int field433 = 0;

    @ObfuscatedName("client.ks")
    public static int field311 = 0;

    @ObfuscatedName("client.kq")
    public static int field435 = 0;

    @ObfuscatedName("client.ka")
    public static int field436 = 0;

    @ObfuscatedName("client.ko")
    public static int field437 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field428 = new int[2000];

    @ObfuscatedName("client.ki")
    public static String[] field439 = new String[1000];

    @ObfuscatedName("client.kd")
    public static int field440 = 0;

    @ObfuscatedName("client.kx")
    public static class178 field441 = new class178();

    @ObfuscatedName("client.kj")
    public static class178 field340 = new class178();

    @ObfuscatedName("client.kf")
    public static class178 field443 = new class178();

    @ObfuscatedName("client.km")
    public static class175 field444 = new class175(512);

    @ObfuscatedName("client.ln")
    public static int field445 = 0;

    @ObfuscatedName("client.lh")
    public static int field238 = -2;

    @ObfuscatedName("client.le")
    public static boolean[] field375 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static boolean[] field479 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static boolean[] field408 = new boolean[100];

    @ObfuscatedName("client.ll")
    public static int[] field450 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field275 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field379 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field453 = new int[100];

    @ObfuscatedName("client.lj")
    public static int field446 = 0;

    @ObfuscatedName("client.lu")
    public static int[] field455 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lo")
    public static int field495 = 0;

    @ObfuscatedName("client.lr")
    public static int field457 = 0;

    @ObfuscatedName("client.lb")
    public static long[] field458 = new long[100];

    @ObfuscatedName("client.lq")
    public static int field251 = 0;

    @ObfuscatedName("client.lx")
    public static int field353 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field461 = new int[128];

    @ObfuscatedName("client.lm")
    public static int[] field462 = new int[128];

    @ObfuscatedName("client.lp")
    public static long field463 = -1L;

    @ObfuscatedName("client.lw")
    public static String field427 = null;

    @ObfuscatedName("client.ls")
    public static String field465 = null;

    @ObfuscatedName("client.ml")
    public static int field425 = -1;

    @ObfuscatedName("client.mz")
    public static int field467 = 0;

    @ObfuscatedName("client.mc")
    public static int[] field468 = new int[1000];

    @ObfuscatedName("client.mn")
    public static int[] field412 = new int[1000];

    @ObfuscatedName("client.mx")
    public static class72[] field470 = new class72[1000];

    @ObfuscatedName("client.mk")
    public static int field471 = 0;

    @ObfuscatedName("client.mg")
    public static int field472 = 0;

    @ObfuscatedName("client.mq")
    public static int field473 = 0;

    @ObfuscatedName("client.mv")
    public static int field290 = 255;

    @ObfuscatedName("client.md")
    public static int field475 = -1;

    @ObfuscatedName("client.mp")
    public static boolean field276 = false;

    @ObfuscatedName("client.mr")
    public static int field477 = 127;

    @ObfuscatedName("client.mt")
    public static int field429 = 127;

    @ObfuscatedName("client.nd")
    public static int field407 = 0;

    @ObfuscatedName("client.na")
    public static int[] field496 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field481 = new int[50];

    @ObfuscatedName("client.nb")
    public static int[] field482 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field483 = new int[50];

    @ObfuscatedName("client.nf")
    public static class52[] field344 = new class52[50];

    @ObfuscatedName("client.np")
    public static boolean field485 = false;

    @ObfuscatedName("client.nv")
    public static boolean[] field300 = new boolean[5];

    @ObfuscatedName("client.ny")
    public static int[] field487 = new int[5];

    @ObfuscatedName("client.no")
    public static int[] field488 = new int[5];

    @ObfuscatedName("client.nk")
    public static int[] field489 = new int[5];

    @ObfuscatedName("client.ns")
    public static int[] field490 = new int[5];

    @ObfuscatedName("client.nt")
    public static int field442 = 0;

    @ObfuscatedName("client.ok")
    public static int field239 = 0;

    @ObfuscatedName("client.oh")
    public static class16[] field493 = new class16[400];

    @ObfuscatedName("client.ou")
    public static class174 field494 = new class174();

    @ObfuscatedName("client.of")
    public static int field347 = 0;

    @ObfuscatedName("client.oe")
    public static class8[] field273 = new class8[400];

    @ObfuscatedName("client.om")
    public static class158 field497 = new class158();

    @ObfuscatedName("client.oj")
    public static int field498 = -1;

    @ObfuscatedName("client.og")
    public static int field414 = -1;

    @ObfuscatedName("client.l(B)V")
    public final void method219() {
    }

    public final void init() {
        if (!this.method2616()) {
            return;
        }
        class169[] var1 = class169.method767();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class169 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2832);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2832)) {
                    case 2:
                        field384 = Integer.parseInt(var4);
                        break;
                    case 3:
                        field241 = Integer.parseInt(var4);
                        break;
                    case 4:
                        field247 = Integer.parseInt(var4);
                        break;
                    case 5:
                        Statics.field336 = var4;
                        break;
                    case 6:
                        class140[] var5 = new class140[] { class140.field2143, class140.field2139, class140.field2141, class140.field2140, class140.field2142, class140.field2148 };
                        Statics.field122 = (class140) class99.method531(var5, Integer.parseInt(var4));
                        if (Statics.field122 == class140.field2148) {
                            Statics.field777 = class191.field2904;
                        } else {
                            Statics.field777 = class191.field2896;
                        }
                        break;
                    case 7:
                        if (var4.equalsIgnoreCase(class2.field20)) {
                            field361 = true;
                        } else {
                            field361 = false;
                        }
                        break;
                    case 8:
                        field423 = Integer.parseInt(var4);
                        break;
                    case 9:
                        int var6 = Integer.parseInt(var4);
                        class139[] var7 = class139.method812();
                        int var8 = 0;
                        class139 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class139 var9 = var7[var8];
                            if (var9.field2137 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field243 = var10;
                        break;
                    case 10:
                        if (var4.equalsIgnoreCase(class2.field20)) {
                        }
                }
            }
        }
        method2482();
        Statics.field1747 = this.getCodeBase().getHost();
        String var11 = Statics.field243.field2134;
        byte var12 = 0;
        try {
            class136.method1021("oldschool", var11, var12, 16);
        } catch (Exception var14) {
            class135.method2083((String) null, var14);
        }
        Statics.field480 = this;
        this.method2595(765, 503, 62);
    }

    @ObfuscatedName("do.u(I)V")
    public static final void method2482() {
        class79.field1362 = false;
        field246 = false;
    }

    @ObfuscatedName("client.j(B)V")
    public final void method158() {
        Statics.field1944 = field384 == 0 ? 43594 : field241 + 40000;
        Statics.field2968 = field384 == 0 ? 443 : field241 + 50000;
        Statics.field204 = Statics.field1944;
        Statics.field2022 = class154.field2664;
        Statics.field2687 = class154.field2665;
        Statics.field2681 = class154.field2663;
        Statics.field2686 = class154.field2662;
        if (Statics.field1935.toLowerCase().indexOf("microsoft") == -1) {
            class124.field1978[44] = 71;
            class124.field1978[45] = 26;
            class124.field1978[46] = 72;
            class124.field1978[47] = 73;
            class124.field1978[59] = 57;
            class124.field1978[61] = 27;
            class124.field1978[91] = 42;
            class124.field1978[92] = 74;
            class124.field1978[93] = 43;
            class124.field1978[192] = 28;
            class124.field1978[222] = 58;
            class124.field1978[520] = 59;
        } else {
            class124.field1978[186] = 57;
            class124.field1978[187] = 27;
            class124.field1978[188] = 71;
            class124.field1978[189] = 26;
            class124.field1978[190] = 72;
            class124.field1978[191] = 73;
            class124.field1978[192] = 58;
            class124.field1978[219] = 42;
            class124.field1978[220] = 74;
            class124.field1978[221] = 43;
            class124.field1978[222] = 59;
            class124.field1978[223] = 28;
        }
        Canvas var1 = Statics.field208;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class124.field1958);
        var1.addFocusListener(class124.field1958);
        class127.method1971(Statics.field208);
        Statics.field527 = class118.method683();
        if (Statics.field527 != null) {
            Statics.field527.method2438(Statics.field208);
        }
        Statics.field696 = new class121(255, class136.field2089, class136.field2100, 500000);
        class196 var2 = null;
        class9 var3 = new class9();
        try {
            var2 = class136.method463("", Statics.field122.field2147, false);
            byte[] var4 = new byte[(int) var2.method3500()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method3494(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class9(new class107(var4));
        } catch (Exception var11) {
        }
        try {
            if (var2 != null) {
                var2.method3497();
            }
        } catch (Exception var10) {
        }
        Statics.field2674 = var3;
        Statics.field1529 = this.getToolkit().getSystemClipboard();
        class125.method2065(this, Statics.field671);
        if (field384 != 0) {
            field257 = true;
        }
    }

    @ObfuscatedName("client.c(B)V")
    public final void method159() {
        field245++;
        this.method162();
        while (true) {
            class178 var1 = class150.field2504;
            class149 var2;
            synchronized (class150.field2504) {
                var2 = (class149) class150.field2499.method3274();
            }
            if (var2 == null) {
                class162.method1982();
                method2977();
                Statics.method494();
                class127.method2441();
                if (Statics.field527 != null) {
                    int var4 = Statics.field527.method2447();
                    field440 = var4;
                }
                if (field416 == 0) {
                    method2815();
                    class131.method453();
                } else if (field416 == 5) {
                    class28.method572(this);
                    method2815();
                    class131.method453();
                } else if (field416 == 10 || field416 == 11) {
                    class28.method572(this);
                } else if (field416 == 20) {
                    class28.method572(this);
                    method120();
                } else if (field416 == 25) {
                    method2459(false);
                    field295 = 0;
                    boolean var5 = true;
                    for (int var6 = 0; var6 < Statics.field774.length; var6++) {
                        if (Statics.field121[var6] != -1 && Statics.field774[var6] == null) {
                            Statics.field774[var6] = Statics.field26.method2729(Statics.field121[var6], 0);
                            if (Statics.field774[var6] == null) {
                                var5 = false;
                                field295++;
                            }
                        }
                        if (Statics.field902[var6] != -1 && Statics.field2527[var6] == null) {
                            Statics.field2527[var6] = Statics.field26.method2785(Statics.field902[var6], 0, Statics.field1943[var6]);
                            if (Statics.field2527[var6] == null) {
                                var5 = false;
                                field295++;
                            }
                        }
                    }
                    if (var5) {
                        field297 = 0;
                        boolean var7 = true;
                        for (int var8 = 0; var8 < Statics.field774.length; var8++) {
                            byte[] var9 = Statics.field2527[var8];
                            if (var9 != null) {
                                int var10 = (Statics.field907[var8] >> 8) * 64 - Statics.field1557;
                                int var11 = (Statics.field907[var8] & 0xFF) * 64 - Statics.field551;
                                if (field301) {
                                    var10 = 10;
                                    var11 = 10;
                                }
                                var7 &= class6.method1794(var9, var10, var11);
                            }
                        }
                        if (var7) {
                            if (field299 != 0) {
                                method738(class143.field2174 + class2.field22 + class2.field19 + 100 + "%" + class2.field18, true);
                            }
                            method2977();
                            method149();
                            method2977();
                            Statics.field1562.method1607();
                            method2977();
                            System.gc();
                            for (int var12 = 0; var12 < 4; var12++) {
                                field254[var12].method3546();
                            }
                            for (int var13 = 0; var13 < 4; var13++) {
                                for (int var14 = 0; var14 < 104; var14++) {
                                    for (int var15 = 0; var15 < 104; var15++) {
                                        class6.field65[var13][var14][var15] = 0;
                                    }
                                }
                            }
                            method2977();
                            class6.method718();
                            int var16 = Statics.field774.length;
                            class20.method571();
                            method2459(true);
                            if (!field301) {
                                int var17 = 0;
                                label479: while (true) {
                                    if (var17 >= var16) {
                                        for (int var31 = 0; var31 < var16; var31++) {
                                            int var32 = (Statics.field907[var31] >> 8) * 64 - Statics.field1557;
                                            int var33 = (Statics.field907[var31] & 0xFF) * 64 - Statics.field551;
                                            byte[] var34 = Statics.field774[var31];
                                            if (var34 == null && Statics.field1260 < 800) {
                                                method2977();
                                                class6.method1338(var32, var33, 64, 64);
                                            }
                                        }
                                        method2459(true);
                                        int var35 = 0;
                                        while (true) {
                                            if (var35 >= var16) {
                                                break label479;
                                            }
                                            byte[] var36 = Statics.field2527[var35];
                                            if (var36 != null) {
                                                int var37 = (Statics.field907[var35] >> 8) * 64 - Statics.field1557;
                                                int var38 = (Statics.field907[var35] & 0xFF) * 64 - Statics.field551;
                                                method2977();
                                                class6.method2590(var36, var37, var38, Statics.field1562, field254);
                                            }
                                            var35++;
                                        }
                                    }
                                    int var18 = (Statics.field907[var17] >> 8) * 64 - Statics.field1557;
                                    int var19 = (Statics.field907[var17] & 0xFF) * 64 - Statics.field551;
                                    byte[] var20 = Statics.field774[var17];
                                    if (var20 != null) {
                                        method2977();
                                        int var21 = Statics.field1855 * 8 - 48;
                                        int var22 = Statics.field1260 * 8 - 48;
                                        class198[] var23 = field254;
                                        int var24 = 0;
                                        label476: while (true) {
                                            if (var24 >= 4) {
                                                class107 var27 = new class107(var20);
                                                int var28 = 0;
                                                while (true) {
                                                    if (var28 >= 4) {
                                                        break label476;
                                                    }
                                                    for (int var29 = 0; var29 < 64; var29++) {
                                                        for (int var30 = 0; var30 < 64; var30++) {
                                                            class6.method534(var27, var28, var18 + var29, var19 + var30, var21, var22, 0);
                                                        }
                                                    }
                                                    var28++;
                                                }
                                            }
                                            for (int var25 = 0; var25 < 64; var25++) {
                                                for (int var26 = 0; var26 < 64; var26++) {
                                                    if (var18 + var25 > 0 && var18 + var25 < 103 && var19 + var26 > 0 && var19 + var26 < 103) {
                                                        var23[var24].field2961[var18 + var25][var19 + var26] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var24++;
                                        }
                                    }
                                    var17++;
                                }
                            }
                            if (field301) {
                                int var39 = 0;
                                label425: while (true) {
                                    if (var39 >= 4) {
                                        for (int var79 = 0; var79 < 13; var79++) {
                                            for (int var80 = 0; var80 < 13; var80++) {
                                                int var81 = field302[0][var79][var80];
                                                if (var81 == -1) {
                                                    class6.method1338(var79 * 8, var80 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method2459(true);
                                        int var82 = 0;
                                        while (true) {
                                            if (var82 >= 4) {
                                                break label425;
                                            }
                                            method2977();
                                            for (int var83 = 0; var83 < 13; var83++) {
                                                for (int var84 = 0; var84 < 13; var84++) {
                                                    int var85 = field302[var82][var83][var84];
                                                    if (var85 != -1) {
                                                        int var86 = var85 >> 24 & 0x3;
                                                        int var87 = var85 >> 1 & 0x3;
                                                        int var88 = var85 >> 14 & 0x3FF;
                                                        int var89 = var85 >> 3 & 0x7FF;
                                                        int var90 = (var88 / 8 << 8) + var89 / 8;
                                                        for (int var91 = 0; var91 < Statics.field907.length; var91++) {
                                                            if (Statics.field907[var91] == var90 && Statics.field2527[var91] != null) {
                                                                class6.method461(Statics.field2527[var91], var82, var83 * 8, var84 * 8, var86, (var88 & 0x7) * 8, (var89 & 0x7) * 8, var87, Statics.field1562, field254);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var82++;
                                        }
                                    }
                                    method2977();
                                    for (int var40 = 0; var40 < 13; var40++) {
                                        for (int var41 = 0; var41 < 13; var41++) {
                                            boolean var42 = false;
                                            int var43 = field302[var39][var40][var41];
                                            if (var43 != -1) {
                                                int var44 = var43 >> 24 & 0x3;
                                                int var45 = var43 >> 1 & 0x3;
                                                int var46 = var43 >> 14 & 0x3FF;
                                                int var47 = var43 >> 3 & 0x7FF;
                                                int var48 = (var46 / 8 << 8) + var47 / 8;
                                                for (int var49 = 0; var49 < Statics.field907.length; var49++) {
                                                    if (Statics.field907[var49] == var48 && Statics.field774[var49] != null) {
                                                        byte[] var50 = Statics.field774[var49];
                                                        int var51 = var40 * 8;
                                                        int var52 = var41 * 8;
                                                        int var53 = (var46 & 0x7) * 8;
                                                        int var54 = (var47 & 0x7) * 8;
                                                        class198[] var55 = field254;
                                                        for (int var56 = 0; var56 < 8; var56++) {
                                                            for (int var57 = 0; var57 < 8; var57++) {
                                                                if (var51 + var56 > 0 && var51 + var56 < 103 && var52 + var57 > 0 && var52 + var57 < 103) {
                                                                    var55[var39].field2961[var51 + var56][var52 + var57] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class107 var58 = new class107(var50);
                                                        for (int var59 = 0; var59 < 4; var59++) {
                                                            for (int var60 = 0; var60 < 64; var60++) {
                                                                for (int var61 = 0; var61 < 64; var61++) {
                                                                    if (var44 == var59 && var60 >= var53 && var60 < var53 + 8 && var61 >= var54 && var61 < var54 + 8) {
                                                                        int var65 = var60 & 0x7;
                                                                        int var66 = var61 & 0x7;
                                                                        int var68 = var45 & 0x3;
                                                                        int var69;
                                                                        if (var68 == 0) {
                                                                            var69 = var65;
                                                                        } else if (var68 == 1) {
                                                                            var69 = var66;
                                                                        } else if (var68 == 2) {
                                                                            var69 = 7 - var65;
                                                                        } else {
                                                                            var69 = 7 - var66;
                                                                        }
                                                                        int var72 = var51 + var69;
                                                                        int var74 = var60 & 0x7;
                                                                        int var75 = var61 & 0x7;
                                                                        int var77 = var45 & 0x3;
                                                                        int var78;
                                                                        if (var77 == 0) {
                                                                            var78 = var75;
                                                                        } else if (var77 == 1) {
                                                                            var78 = 7 - var74;
                                                                        } else if (var77 == 2) {
                                                                            var78 = 7 - var75;
                                                                        } else {
                                                                            var78 = var74;
                                                                        }
                                                                        class6.method534(var58, var39, var72, var52 + var78, 0, 0, var45);
                                                                    } else {
                                                                        class6.method534(var58, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var42 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var42) {
                                                class6.method2504(var39, var40 * 8, var41 * 8);
                                            }
                                        }
                                    }
                                    var39++;
                                }
                            }
                            method2459(true);
                            method149();
                            method2977();
                            class6.method2522(Statics.field1562, field254);
                            method2459(true);
                            int var92 = class6.field67;
                            if (var92 > Statics.field224) {
                                var92 = Statics.field224;
                            }
                            if (var92 < Statics.field224 - 1) {
                                int var93 = Statics.field224 - 1;
                            }
                            if (field246) {
                                Statics.field1562.method1608(class6.field67);
                            } else {
                                Statics.field1562.method1608(0);
                            }
                            for (int var94 = 0; var94 < 104; var94++) {
                                for (int var95 = 0; var95 < 104; var95++) {
                                    method1793(var94, var95);
                                }
                            }
                            method2977();
                            for (class15 var96 = (class15) field499.method3301(); var96 != null; var96 = (class15) field499.method3278()) {
                                if (var96.field200 == -1) {
                                    var96.field203 = 0;
                                    method1601(var96);
                                } else {
                                    var96.method3365();
                                }
                            }
                            class36.field829.method3210();
                            if (Statics.field1639 != null) {
                                field282.method2366(154);
                                field282.method2127(1057001181);
                            }
                            if (!field301) {
                                int var97 = (Statics.field1855 - 6) / 8;
                                int var98 = (Statics.field1855 + 6) / 8;
                                int var99 = (Statics.field1260 - 6) / 8;
                                int var100 = (Statics.field1260 + 6) / 8;
                                for (int var101 = var97 - 1; var101 <= var98 + 1; var101++) {
                                    for (int var102 = var99 - 1; var102 <= var100 + 1; var102++) {
                                        if (var101 < var97 || var101 > var98 || var102 < var99 || var102 > var100) {
                                            Statics.field26.method2789("m" + var101 + "_" + var102);
                                            Statics.field26.method2789("l" + var101 + "_" + var102);
                                        }
                                    }
                                }
                            }
                            method645(30);
                            method2977();
                            class6.method539();
                            field282.method2366(185);
                            class131.method453();
                        } else {
                            field299 = 2;
                        }
                    } else {
                        field299 = 1;
                    }
                }
                if (field416 == 30) {
                    method452();
                } else if (field416 == 40 || field416 == 45) {
                    method120();
                }
                return;
            }
            var2.field2494.method2825(var2.field2493, (int) var2.field2879, var2.field2492, false);
        }
    }

    @ObfuscatedName("client.d(I)V")
    public final void method160() {
        boolean var1 = class162.method2813();
        if (var1 && field276 && Statics.field1233 != null) {
            Statics.field1233.method992();
        }
        if (field2062) {
            Canvas var2 = Statics.field208;
            var2.removeKeyListener(class124.field1958);
            var2.removeFocusListener(class124.field1958);
            class124.field1960 = -1;
            class127.method1326(Statics.field208);
            if (Statics.field527 != null) {
                Statics.field527.method2437(Statics.field208);
            }
            this.method2649();
            Canvas var3 = Statics.field208;
            var3.setFocusTraversalKeysEnabled(false);
            var3.addKeyListener(class124.field1958);
            var3.addFocusListener(class124.field1958);
            class127.method1971(Statics.field208);
            if (Statics.field527 != null) {
                Statics.field527.method2438(Statics.field208);
            }
        }
        if (field416 == 0) {
            class131.method1969(class28.field647, class28.field651, (Color) null);
        } else if (field416 == 5) {
            class28.method1371(Statics.field503, Statics.field654);
        } else if (field416 == 10 || field416 == 11) {
            class28.method1371(Statics.field503, Statics.field654);
        } else if (field416 == 20) {
            class28.method1371(Statics.field503, Statics.field654);
        } else if (field416 == 25) {
            if (field299 == 1) {
                if (field295 > field492) {
                    field492 = field295;
                }
                int var4 = (field492 * 50 - field295 * 50) / field492;
                method738(class143.field2174 + class2.field22 + class2.field19 + var4 + "%" + class2.field18, false);
            } else if (field299 == 2) {
                if (field297 > field385) {
                    field385 = field297;
                }
                int var5 = (field385 * 50 - field297 * 50) / field385 + 50;
                method738(class143.field2174 + class2.field22 + class2.field19 + var5 + "%" + class2.field18, false);
            } else {
                method738(class143.field2174, false);
            }
        } else if (field416 == 30) {
            if (field402 != -1) {
                int var6 = field402;
                if (class153.method2811(var6)) {
                    method1975(Statics.field2535[var6], -1);
                }
            }
            for (int var7 = 0; var7 < field445; var7++) {
                if (field375[var7]) {
                    field479[var7] = true;
                }
                field408[var7] = field375[var7];
                field375[var7] = false;
            }
            field238 = field245;
            field391 = -1;
            field466 = -1;
            Statics.field986 = null;
            if (field402 != -1) {
                field445 = 0;
                method829(field402, 0, 0, 765, 503, 0, 0, -1);
            }
            class73.method1531();
            if (field383) {
                method724();
            } else if (field391 != -1) {
                int var8 = field391;
                int var9 = field466;
                if (field258 >= 2 || field395 != 0 || field397) {
                    String var10;
                    if (field395 == 1 && field258 < 2) {
                        var10 = class143.field2369 + class143.field2325 + field396 + " " + class2.field16;
                    } else if (field397 && field258 < 2) {
                        var10 = field308 + class143.field2325 + field298 + " " + class2.field16;
                    } else {
                        var10 = method654(field258 - 1);
                    }
                    if (field258 > 2) {
                        var10 = var10 + class2.method49(16777215) + " " + '/' + " " + (field258 - 2) + class143.field2319;
                    }
                    Statics.field503.method3473(var10, var8 + 4, var9 + 15, 16777215, 0, field245 / 1000);
                }
            }
            if (field446 == 3) {
                for (int var11 = 0; var11 < field445; var11++) {
                    if (field408[var11]) {
                        class73.method1517(field450[var11], field275[var11], field379[var11], field453[var11], 16711935, 128);
                    } else if (field479[var11]) {
                        class73.method1517(field450[var11], field275[var11], field379[var11], field453[var11], 16711680, 128);
                    }
                }
            }
            int var12 = Statics.field224;
            int var13 = Statics.field590.field760;
            int var14 = Statics.field590.field716;
            int var15 = field244;
            for (class20 var16 = (class20) class20.field531.method3301(); var16 != null; var16 = (class20) class20.field531.method3278()) {
                if (var16.field538 != -1 || var16.field542 != null) {
                    int var17 = 0;
                    if (var13 > var16.field535) {
                        var17 += var13 - var16.field535;
                    } else if (var13 < var16.field533) {
                        var17 += var16.field533 - var13;
                    }
                    if (var14 > var16.field536) {
                        var17 += var14 - var16.field536;
                    } else if (var14 < var16.field534) {
                        var17 += var16.field534 - var14;
                    }
                    if (var17 - 64 > var16.field537 || field429 == 0 || var16.field532 != var12) {
                        if (var16.field539 != null) {
                            Statics.field2152.method947(var16.field539);
                            var16.field539 = null;
                        }
                        if (var16.field540 != null) {
                            Statics.field2152.method947(var16.field540);
                            var16.field540 = null;
                        }
                    } else {
                        var17 -= 64;
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        int var18 = field429 * (var16.field537 - var17) / var16.field537;
                        class52 var10000;
                        if (var16.field539 != null) {
                            var16.field539.method1113(var18);
                        } else if (var16.field538 >= 0) {
                            var10000 = (class52) null;
                            class52 var19 = class52.method1047(Statics.field1823, var16.field538, 0);
                            if (var19 != null) {
                                class56 var20 = var19.method1042().method1084(Statics.field2107);
                                class58 var21 = class58.method1109(var20, 100, var18);
                                var21.method1112(-1);
                                Statics.field2152.method946(var21);
                                var16.field539 = var21;
                            }
                        }
                        if (var16.field540 != null) {
                            var16.field540.method1113(var18);
                            if (!var16.field540.method3366()) {
                                var16.field540 = null;
                            }
                        } else if (var16.field542 != null && (var16.field545 -= var15) <= 0) {
                            int var22 = (int) (Math.random() * (double) var16.field542.length);
                            var10000 = (class52) null;
                            class52 var23 = class52.method1047(Statics.field1823, var16.field542[var22], 0);
                            if (var23 != null) {
                                class56 var24 = var23.method1042().method1084(Statics.field2107);
                                class58 var25 = class58.method1109(var24, 100, var18);
                                var25.method1112(0);
                                Statics.field2152.method946(var25);
                                var16.field540 = var25;
                                var16.field545 = var16.field544 + (int) (Math.random() * (double) (var16.field541 - var16.field544));
                            }
                        }
                    }
                }
            }
            field244 = 0;
        } else if (field416 == 40) {
            method738(class143.field2175 + class2.field22 + class143.field2176, false);
        } else if (field416 == 45) {
            method738(class143.field2271, false);
        }
        if (field416 == 30 && field446 == 0 && !field2056) {
            try {
                Graphics var26 = Statics.field208.getGraphics();
                for (int var27 = 0; var27 < field445; var27++) {
                    if (field479[var27]) {
                        Statics.field2431.method1342(var26, field450[var27], field275[var27], field379[var27], field453[var27]);
                        field479[var27] = false;
                    }
                }
            } catch (Exception var33) {
                Statics.field208.repaint();
            }
        } else if (field416 > 0) {
            try {
                Graphics var29 = Statics.field208.getGraphics();
                Statics.field2431.method1345(var29, 0, 0);
                field2056 = false;
                for (int var30 = 0; var30 < field445; var30++) {
                    field479[var30] = false;
                }
            } catch (Exception var32) {
                Statics.field208.repaint();
            }
        }
    }

    @ObfuscatedName("client.v(I)V")
    public final void method161() {
        if (Statics.field2156 != null) {
            Statics.field2156.field162 = false;
        }
        Statics.field2156 = null;
        if (Statics.field1933 != null) {
            Statics.field1933.method2584();
            Statics.field1933 = null;
        }
        class124.method721();
        class127.method8();
        Statics.field527 = null;
        if (Statics.field1233 != null) {
            Statics.field1233.method990();
        }
        if (Statics.field783 != null) {
            Statics.field783.method990();
        }
        if (Statics.field2513 != null) {
            Statics.field2513.method2584();
        }
        Object var1 = class150.field2500;
        synchronized (class150.field2500) {
            if (class150.field2501 != 0) {
                class150.field2501 = 1;
                try {
                    class150.field2500.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        try {
            class136.field2089.method3515();
            for (int var4 = 0; var4 < Statics.field2108; var4++) {
                Statics.field933[var4].method3515();
            }
            class136.field2100.method3515();
            class136.field2098.method3515();
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("as.n(II)V")
    public static void method645(int arg0) {
        if (field416 == arg0) {
            return;
        }
        if (field416 == 0) {
            class131.method2566();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field274 = 0;
            field249 = 0;
            field283 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field392 != null) {
            Statics.field392.method2584();
            Statics.field392 = null;
        }
        if (field416 == 25) {
            field299 = 0;
            field295 = 0;
            field492 = 1;
            field297 = 0;
            field385 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class28.method1983(Statics.field208, Statics.field1405, Statics.field1071, true, 0);
        } else if (arg0 == 20) {
            class28.method1983(Statics.field208, Statics.field1405, Statics.field1071, true, field416 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class28.method1983(Statics.field208, Statics.field1405, Statics.field1071, false, 4);
        } else if (Statics.field661) {
            Statics.field1888 = null;
            Statics.field633 = null;
            Statics.field634 = null;
            Statics.field635 = null;
            Statics.field632 = null;
            Statics.field667 = null;
            Statics.field1822 = null;
            Statics.field1560 = null;
            Statics.field638 = null;
            Statics.field1753 = null;
            Statics.field1095 = null;
            Statics.field1250 = null;
            Statics.field983 = null;
            Statics.field27 = null;
            Statics.field712 = null;
            Statics.field2030 = null;
            Statics.field177 = null;
            Statics.field643 = null;
            Statics.field1812 = null;
            Statics.field1754 = null;
            Statics.field135 = null;
            Statics.field2793 = null;
            class162.method860(2);
            class151.method2405(true);
            Statics.field661 = false;
        }
        field416 = arg0;
    }

    @ObfuscatedName("client.z(I)V")
    public void method162() {
        if (field416 == 1000) {
            return;
        }
        long var1 = class103.method16();
        int var3 = (int) (var1 - Statics.field2509);
        Statics.field2509 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class151.field2519 += var3;
        boolean var4;
        if (class151.field2522 == 0 && class151.field2517 == 0 && class151.field2516 == 0 && class151.field2511 == 0) {
            var4 = true;
        } else if (Statics.field2513 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class151.field2519 > 30000) {
                        throw new IOException();
                    }
                    while (class151.field2517 < 20 && class151.field2511 > 0) {
                        class152 var5 = (class152) class151.field2510.method3252();
                        class107 var6 = new class107(4);
                        var6.method2124(1);
                        var6.method2126((int) var5.field2879);
                        Statics.field2513.method2571(var6.field1844, 0, 4);
                        class151.field2512.method3253(var5, var5.field2879);
                        class151.field2511--;
                        class151.field2517++;
                    }
                    while (class151.field2522 < 20 && class151.field2516 > 0) {
                        class152 var7 = (class152) class151.field2514.method3333();
                        class107 var8 = new class107(4);
                        var8.method2124(0);
                        var8.method2126((int) var7.field2879);
                        Statics.field2513.method2571(var8.field1844, 0, 4);
                        var7.method3346();
                        class151.field2518.method3253(var7, var7.field2879);
                        class151.field2516--;
                        class151.field2522++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2513.method2585();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class151.field2519 = 0;
                        byte var11 = 0;
                        if (Statics.field880 == null) {
                            var11 = 8;
                        } else if (class151.field2520 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class151.field2507.field1838;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2513.method2569(class151.field2507.field1844, class151.field2507.field1838, var12);
                            if (class151.field2523 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class151.field2507.field1844[class151.field2507.field1838 + var13] ^= class151.field2523;
                                }
                            }
                            class151.field2507.field1838 += var12;
                            if (class151.field2507.field1838 < var11) {
                                break;
                            }
                            if (Statics.field880 == null) {
                                class151.field2507.field1838 = 0;
                                int var14 = class151.field2507.method2138();
                                int var15 = class151.field2507.method2239();
                                int var16 = class151.field2507.method2138();
                                int var17 = class151.field2507.method2143();
                                long var18 = (long) ((var14 << 16) + var15);
                                class152 var20 = (class152) class151.field2512.method3244(var18);
                                Statics.field1097 = true;
                                if (var20 == null) {
                                    var20 = (class152) class151.field2518.method3244(var18);
                                    Statics.field1097 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field880 = var20;
                                Statics.field169 = new class107(var17 + var21 + Statics.field880.field2530);
                                Statics.field169.method2124(var16);
                                Statics.field169.method2127(var17);
                                class151.field2520 = 8;
                                class151.field2507.field1838 = 0;
                            } else if (class151.field2520 == 0) {
                                if (class151.field2507.field1844[0] == -1) {
                                    class151.field2520 = 1;
                                    class151.field2507.field1838 = 0;
                                } else {
                                    Statics.field880 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field169.field1844.length - Statics.field880.field2530;
                            int var23 = 512 - class151.field2520;
                            if (var23 > var22 - Statics.field169.field1838) {
                                var23 = var22 - Statics.field169.field1838;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2513.method2569(Statics.field169.field1844, Statics.field169.field1838, var23);
                            if (class151.field2523 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field169.field1844[Statics.field169.field1838 + var24] ^= class151.field2523;
                                }
                            }
                            Statics.field169.field1838 += var23;
                            class151.field2520 += var23;
                            if (Statics.field169.field1838 == var22) {
                                if (Statics.field880.field2879 == 16711935L) {
                                    Statics.field509 = Statics.field169;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class148 var26 = class151.field2525[var25];
                                        if (var26 != null) {
                                            Statics.field509.field1838 = var25 * 8 + 5;
                                            int var27 = Statics.field509.method2143();
                                            int var28 = Statics.field509.method2143();
                                            var26.method2819(var27, var28);
                                        }
                                    }
                                } else {
                                    class151.field2521.reset();
                                    class151.field2521.update(Statics.field169.field1844, 0, var22);
                                    int var29 = (int) class151.field2521.getValue();
                                    if (Statics.field880.field2529 != var29) {
                                        try {
                                            Statics.field2513.method2584();
                                        } catch (Exception var35) {
                                        }
                                        class151.field2524++;
                                        Statics.field2513 = null;
                                        class151.field2523 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class151.field2524 = 0;
                                    class151.field2508 = 0;
                                    Statics.field880.field2531.method2820((int) (Statics.field880.field2879 & 0xFFFFL), Statics.field169.field1844, (Statics.field880.field2879 & 0xFF0000L) == 16711680L, Statics.field1097);
                                }
                                Statics.field880.method3365();
                                if (Statics.field1097) {
                                    class151.field2517--;
                                } else {
                                    class151.field2522--;
                                }
                                class151.field2520 = 0;
                                Statics.field880 = null;
                                Statics.field169 = null;
                            } else {
                                if (class151.field2520 != 512) {
                                    break;
                                }
                                class151.field2520 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2513.method2584();
                } catch (Exception var34) {
                }
                class151.field2508++;
                Statics.field2513 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method417();
        }
    }

    @ObfuscatedName("client.a(B)V")
    public void method417() {
        if (class151.field2524 >= 4) {
            this.method2606("js5crc");
            field416 = 1000;
            return;
        }
        if (class151.field2508 >= 4) {
            if (field416 <= 5) {
                this.method2606("js5io");
                field416 = 1000;
                return;
            }
            field265 = 3000;
            class151.field2508 = 3;
        }
        if (--field265 + 1 > 0) {
            return;
        }
        try {
            if (field456 == 0) {
                Statics.field601 = Statics.field1752.method2480(Statics.field1747, Statics.field204);
                field456++;
            }
            if (field456 == 1) {
                if (Statics.field601.field2072 == 2) {
                    this.method284(-1);
                    return;
                }
                if (Statics.field601.field2072 == 1) {
                    field456++;
                }
            }
            if (field456 == 2) {
                Statics.field885 = new class130((Socket) Statics.field601.field2068, Statics.field1752);
                class107 var1 = new class107(5);
                var1.method2124(15);
                var1.method2127(62);
                Statics.field885.method2571(var1.field1844, 0, 5);
                field456++;
                Statics.field2163 = class103.method16();
            }
            if (field456 == 3) {
                if (field416 <= 5 || Statics.field885.method2585() > 0) {
                    int var2 = Statics.field885.method2568();
                    if (var2 != 0) {
                        this.method284(var2);
                        return;
                    }
                    field456++;
                } else if (class103.method16() - Statics.field2163 > 30000L) {
                    this.method284(-2);
                    return;
                }
            }
            if (field456 == 4) {
                class151.method2592(Statics.field885, field416 > 20);
                Statics.field601 = null;
                Statics.field885 = null;
                field456 = 0;
                field371 = 0;
            }
        } catch (IOException var4) {
            this.method284(-3);
        }
    }

    @ObfuscatedName("client.t(IB)V")
    public void method284(int arg0) {
        Statics.field601 = null;
        Statics.field885 = null;
        field456 = 0;
        if (Statics.field204 == Statics.field1944) {
            Statics.field204 = Statics.field2968;
        } else {
            Statics.field204 = Statics.field1944;
        }
        field371++;
        if (field371 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field416 <= 5) {
                this.method2606("js5connect_full");
                field416 = 1000;
            } else {
                field265 = 3000;
            }
        } else if (field371 >= 2 && arg0 == 6) {
            this.method2606("js5connect_outofdate");
            field416 = 1000;
        } else if (field371 >= 4) {
            if (field416 <= 5) {
                this.method2606("js5connect");
                field416 = 1000;
            } else {
                field265 = 3000;
            }
        }
    }

    @ObfuscatedName("ei.p(I)V")
    public static void method2815() {
        if (field269 == 0) {
            Statics.field1562 = new class79(4, 104, 104, class6.field73);
            for (int var0 = 0; var0 < 4; var0++) {
                field254[var0] = new class198(104, 104);
            }
            Statics.field1907 = new class72(512, 512);
            class28.field651 = class143.field2177;
            class28.field647 = 5;
            field269 = 20;
        } else if (field269 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1435[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1642(var1, 500, 800, 512, 334);
            class28.field651 = class143.field2178;
            class28.field647 = 10;
            field269 = 30;
        } else if (field269 == 30) {
            Statics.field272 = method832(0, false, true, true);
            Statics.field2136 = method832(1, false, true, true);
            Statics.field1044 = method832(2, true, false, true);
            Statics.field1253 = method832(3, false, true, true);
            Statics.field1823 = method832(4, false, true, true);
            Statics.field26 = method832(5, true, true, true);
            Statics.field1550 = method832(6, true, true, false);
            Statics.field55 = method832(7, false, true, true);
            Statics.field1071 = method832(8, false, true, true);
            Statics.field625 = method832(9, false, true, true);
            Statics.field1405 = method832(10, false, true, true);
            Statics.field123 = method832(11, false, true, true);
            Statics.field1999 = method832(12, false, true, true);
            Statics.field2005 = method832(13, true, false, true);
            Statics.field2839 = method832(14, false, true, false);
            Statics.field2498 = method832(15, false, true, true);
            class28.field651 = class143.field2303;
            class28.field647 = 20;
            field269 = 40;
        } else if (field269 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field272.method2817() * 4 / 100;
            int var8 = var7 + Statics.field2136.method2817() * 4 / 100;
            int var9 = var8 + Statics.field1044.method2817() * 2 / 100;
            int var10 = var9 + Statics.field1253.method2817() * 2 / 100;
            int var11 = var10 + Statics.field1823.method2817() * 6 / 100;
            int var12 = var11 + Statics.field26.method2817() * 4 / 100;
            int var13 = var12 + Statics.field1550.method2817() * 2 / 100;
            int var14 = var13 + Statics.field55.method2817() * 60 / 100;
            int var15 = var14 + Statics.field1071.method2817() * 2 / 100;
            int var16 = var15 + Statics.field625.method2817() * 2 / 100;
            int var17 = var16 + Statics.field1405.method2817() * 2 / 100;
            int var18 = var17 + Statics.field123.method2817() * 2 / 100;
            int var19 = var18 + Statics.field1999.method2817() * 2 / 100;
            int var20 = var19 + Statics.field2005.method2817() * 2 / 100;
            int var21 = var20 + Statics.field2839.method2817() * 2 / 100;
            int var22 = var21 + Statics.field2498.method2817() * 2 / 100;
            if (var22 == 100) {
                class28.field651 = class143.field2181;
                class28.field647 = 30;
                field269 = 45;
            } else {
                if (var22 != 0) {
                    class28.field651 = class143.field2168 + var22 + "%";
                }
                class28.field647 = 30;
            }
        } else if (field269 == 45) {
            class50.method792(22050, !field246, 2);
            class163 var23 = new class163();
            var23.method3163(9, 128);
            Statics.field1233 = class50.method491(Statics.field1752, Statics.field208, 0, 22050);
            Statics.field1233.method998(var23);
            class148 var24 = Statics.field2498;
            class148 var25 = Statics.field2839;
            class148 var26 = Statics.field1823;
            Statics.field2726 = var24;
            Statics.field2413 = var25;
            Statics.field2719 = var26;
            Statics.field2720 = var23;
            Statics.field783 = class50.method491(Statics.field1752, Statics.field208, 1, 2048);
            Statics.field2152 = new class49();
            Statics.field783.method998(Statics.field2152);
            Statics.field2107 = new class68(22050, Statics.field1074);
            class28.field651 = class143.field2182;
            class28.field647 = 35;
            field269 = 50;
        } else if (field269 == 50) {
            int var27 = 0;
            if (Statics.field654 == null) {
                class148 var28 = Statics.field1071;
                class148 var29 = Statics.field2005;
                int var30 = var28.method2743("p11_full");
                int var31 = var28.method2744(var30, "");
                class194 var32;
                if (class70.method490(var28, var30, var31)) {
                    var32 = Statics.method582(var29.method2729(var30, var31));
                } else {
                    var32 = null;
                }
                Statics.field654 = var32;
            } else {
                var27++;
            }
            if (Statics.field1755 == null) {
                class148 var34 = Statics.field1071;
                class148 var35 = Statics.field2005;
                int var36 = var34.method2743("p12_full");
                int var37 = var34.method2744(var36, "");
                class194 var38;
                if (class70.method490(var34, var36, var37)) {
                    var38 = Statics.method582(var35.method2729(var36, var37));
                } else {
                    var38 = null;
                }
                Statics.field1755 = var38;
            } else {
                var27++;
            }
            if (Statics.field503 == null) {
                class148 var40 = Statics.field1071;
                class148 var41 = Statics.field2005;
                int var42 = var40.method2743("b12_full");
                int var43 = var40.method2744(var42, "");
                class194 var44;
                if (class70.method490(var40, var42, var43)) {
                    var44 = Statics.method582(var41.method2729(var42, var43));
                } else {
                    var44 = null;
                }
                Statics.field503 = var44;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class28.field651 = class143.field2234 + var27 * 100 / 3 + "%";
                class28.field647 = 40;
            } else {
                Statics.field236 = new class146(true);
                class28.field651 = class143.field2358;
                class28.field647 = 40;
                field269 = 60;
            }
        } else if (field269 == 60) {
            int var46 = class28.method2406(Statics.field1405, Statics.field1071);
            byte var47 = 8;
            if (var46 < var47) {
                class28.field651 = class143.field2185 + var46 * 100 / var47 + "%";
                class28.field647 = 50;
            } else {
                class28.field651 = class143.field2272;
                class28.field647 = 50;
                method645(5);
                field269 = 70;
            }
        } else if (field269 == 70) {
            if (Statics.field1044.method2733()) {
                class148 var49 = Statics.field1044;
                Statics.field944 = var49;
                class37.method527(Statics.field1044);
                class40.method116(Statics.field1044, Statics.field55);
                class148 var50 = Statics.field1044;
                class148 var51 = Statics.field55;
                boolean var52 = field246;
                Statics.field2971 = var50;
                Statics.field827 = var51;
                class36.field865 = var52;
                class35.method540(Statics.field1044, Statics.field55);
                class45.method1422(Statics.field1044, Statics.field55, field361, Statics.field654);
                class148 var53 = Statics.field1044;
                class148 var54 = Statics.field272;
                class148 var55 = Statics.field2136;
                Statics.field891 = var53;
                Statics.field2964 = var54;
                Statics.field887 = var55;
                class148 var56 = Statics.field1044;
                class148 var57 = Statics.field55;
                Statics.field913 = var56;
                Statics.field2678 = var57;
                class148 var58 = Statics.field1044;
                Statics.field965 = var58;
                class148 var59 = Statics.field1044;
                Statics.field1038 = var59;
                Statics.field1037 = Statics.field1038.method2739(16);
                class153.method3(Statics.field1253, Statics.field55, Statics.field1071, Statics.field2005);
                class44.method885(Statics.field1044);
                class148 var60 = Statics.field1044;
                Statics.field973 = var60;
                class28.field651 = class143.field2209;
                class28.field647 = 60;
                field269 = 80;
            } else {
                class28.field651 = class143.field2187 + Statics.field1044.method2818() + "%";
                class28.field647 = 60;
            }
        } else if (field269 == 80) {
            int var61 = 0;
            if (Statics.field1900 == null) {
                Statics.field1900 = class70.method830(Statics.field1071, "compass", "");
            } else {
                var61++;
            }
            if (Statics.field2105 == null) {
                Statics.field2105 = class70.method830(Statics.field1071, "mapedge", "");
            } else {
                var61++;
            }
            if (Statics.field572 == null) {
                Statics.field572 = class70.method15(Statics.field1071, "mapscene", "");
            } else {
                var61++;
            }
            if (Statics.field2828 == null) {
                Statics.field2828 = class70.method1603(Statics.field1071, "mapfunction", "");
            } else {
                var61++;
            }
            if (Statics.field1329 == null) {
                Statics.field1329 = class70.method1603(Statics.field1071, "hitmarks", "");
            } else {
                var61++;
            }
            if (Statics.field60 == null) {
                Statics.field60 = class70.method1603(Statics.field1071, "headicons_pk", "");
            } else {
                var61++;
            }
            if (Statics.field126 == null) {
                Statics.field126 = class70.method1603(Statics.field1071, "headicons_prayer", "");
            } else {
                var61++;
            }
            if (Statics.field1252 == null) {
                Statics.field1252 = class70.method1603(Statics.field1071, "headicons_hint", "");
            } else {
                var61++;
            }
            if (Statics.field1813 == null) {
                Statics.field1813 = class70.method1603(Statics.field1071, "mapmarker", "");
            } else {
                var61++;
            }
            if (Statics.field192 == null) {
                Statics.field192 = class70.method1603(Statics.field1071, "cross", "");
            } else {
                var61++;
            }
            if (Statics.field1559 == null) {
                Statics.field1559 = class70.method1603(Statics.field1071, "mapdots", "");
            } else {
                var61++;
            }
            if (Statics.field5 == null) {
                Statics.field5 = class70.method15(Statics.field1071, "scrollbar", "");
            } else {
                var61++;
            }
            if (Statics.field219 == null) {
                Statics.field219 = class70.method15(Statics.field1071, "mod_icons", "");
            } else {
                var61++;
            }
            if (Statics.field2769 == null) {
                Statics.field2769 = class70.method2874(Statics.field1071, "mapback", "");
            } else {
                var61++;
            }
            if (var61 < 14) {
                class28.field651 = class143.field2189 + var61 * 100 / 14 + "%";
                class28.field647 = 70;
            } else {
                Statics.field2918 = Statics.field219;
                Statics.field2105.method1431();
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 41.0D) - 20;
                for (int var66 = 0; var66 < Statics.field2828.length; var66++) {
                    Statics.field2828[var66].method1430(var62 + var65, var63 + var65, var64 + var65);
                }
                Statics.field572[0].method1583(var62 + var65, var63 + var65, var64 + var65);
                method2675();
                class28.field651 = class143.field2353;
                class28.field647 = 70;
                field269 = 90;
            }
        } else if (field269 == 90) {
            if (Statics.field625.method2733()) {
                class88 var67 = new class88(Statics.field625, Statics.field1071, 20, 0.8D, field246 ? 64 : 128);
                class84.method1803(var67);
                class84.method1804(0.8D);
                class28.field651 = class143.field2304;
                class28.field647 = 90;
                field269 = 110;
            } else {
                class28.field651 = class143.field2398 + Statics.field625.method2818() + "%";
                class28.field647 = 90;
            }
        } else if (field269 == 110) {
            Statics.field2156 = new class12();
            Statics.field1752.method2481(Statics.field2156, 10);
            class28.field651 = class143.field2279;
            class28.field647 = 94;
            field269 = 120;
        } else if (field269 == 120) {
            if (Statics.field1405.method2745("huffman", "")) {
                class102 var68 = new class102(Statics.field1405.method2758("huffman", ""));
                class192.method3196(var68);
                class28.field651 = class143.field2373;
                class28.field647 = 96;
                field269 = 130;
            } else {
                class28.field651 = class143.field2194 + "%";
                class28.field647 = 96;
            }
        } else if (field269 == 130) {
            if (!Statics.field1253.method2733()) {
                class28.field651 = class143.field2196 + Statics.field1253.method2818() * 4 / 5 + "%";
                class28.field647 = 100;
            } else if (!Statics.field1999.method2733()) {
                class28.field651 = class143.field2196 + (80 + Statics.field1999.method2818() / 6) + "%";
                class28.field647 = 100;
            } else if (Statics.field2005.method2733()) {
                class28.field651 = class143.field2305;
                class28.field647 = 100;
                field269 = 140;
            } else {
                class28.field651 = class143.field2196 + (96 + Statics.field2005.method2818() / 20) + "%";
                class28.field647 = 100;
            }
        } else if (field269 == 140) {
            method645(10);
        }
    }

    @ObfuscatedName("az.i(IZZZI)Lem;")
    public static class148 method832(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class136.field2089 != null) {
            var4 = new class121(arg0, class136.field2089, Statics.field933[arg0], 1000000);
        }
        return new class148(var4, Statics.field696, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("eb.r(S)V")
    public static void method2675() {
        Statics.field1637 = new int[33];
        Statics.field1989 = new int[33];
        Statics.field782 = new int[151];
        Statics.field48 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field2769.field1300[Statics.field2769.field1302 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field1637[var0] = var1;
            Statics.field1989[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field2769.field1300[Statics.field2769.field1302 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field782[var4 - 5] = var5 - 25;
            Statics.field48[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("d.w(I)V")
    public static final void method120() {
        try {
            if (field274 == 0) {
                if (Statics.field1933 != null) {
                    Statics.field1933.method2584();
                    Statics.field1933 = null;
                }
                Statics.field1931 = null;
                field434 = false;
                field249 = 0;
                field274 = 1;
            }
            if (field274 == 1) {
                if (Statics.field1931 == null) {
                    Statics.field1931 = Statics.field1752.method2480(Statics.field1747, Statics.field204);
                }
                if (Statics.field1931.field2072 == 2) {
                    throw new IOException();
                }
                if (Statics.field1931.field2072 == 1) {
                    Statics.field1933 = new class130((Socket) Statics.field1931.field2068, Statics.field1752);
                    Statics.field1931 = null;
                    field274 = 2;
                }
            }
            if (field274 == 2) {
                field282.field1838 = 0;
                field282.method2124(14);
                Statics.field1933.method2571(field282.field1844, 0, 1);
                field284.field1838 = 0;
                field274 = 3;
            }
            if (field274 == 3) {
                if (Statics.field1233 != null) {
                    Statics.field1233.method991();
                }
                if (Statics.field783 != null) {
                    Statics.field783.method991();
                }
                int var0 = Statics.field1933.method2568();
                if (Statics.field1233 != null) {
                    Statics.field1233.method991();
                }
                if (Statics.field783 != null) {
                    Statics.field783.method991();
                }
                if (var0 != 0) {
                    method793(var0);
                    return;
                }
                field284.field1838 = 0;
                field274 = 5;
            }
            if (field274 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field282.field1838 = 0;
                field282.method2124(1);
                field282.method2124(class28.field658.method438());
                field282.method2127(var1[0]);
                field282.method2127(var1[1]);
                field282.method2127(var1[2]);
                field282.method2127(var1[3]);
                switch(class28.field658.field2426) {
                    case 0:
                        field282.method2127((Integer) Statics.field2674.field131.get(class200.method3193(class28.field637)));
                        field282.field1838 += 4;
                        break;
                    case 1:
                    case 2:
                        field282.method2126(Statics.field1919);
                        field282.field1838 += 5;
                        break;
                    case 3:
                        field282.field1838 += 8;
                }
                field282.method2129(class28.field641);
                field282.method2287(class5.field63, class5.field58);
                field242.field1838 = 0;
                if (field416 == 40) {
                    field242.method2124(18);
                } else {
                    field242.method2124(16);
                }
                field242.method2132(0);
                int var2 = field242.field1838;
                field242.method2127(62);
                field242.method2209(field282.field1844, 0, field282.field1838);
                int var3 = field242.field1838;
                field242.method2129(class28.field637);
                field242.method2124(field246 ? 1 : 0);
                class136.method655(field242);
                class107 var4 = new class107(Statics.field236.method2716());
                Statics.field236.method2715(var4);
                field242.method2209(var4.field1844, 0, var4.field1844.length);
                field242.method2127(Statics.field272.field2476);
                field242.method2127(Statics.field2136.field2476);
                field242.method2127(Statics.field1044.field2476);
                field242.method2127(Statics.field1253.field2476);
                field242.method2127(Statics.field1823.field2476);
                field242.method2127(Statics.field26.field2476);
                field242.method2127(Statics.field1550.field2476);
                field242.method2127(Statics.field55.field2476);
                field242.method2127(Statics.field1071.field2476);
                field242.method2127(Statics.field625.field2476);
                field242.method2127(Statics.field1405.field2476);
                field242.method2127(Statics.field123.field2476);
                field242.method2127(Statics.field1999.field2476);
                field242.method2127(Statics.field2005.field2476);
                field242.method2127(Statics.field2839.field2476);
                field242.method2127(Statics.field2498.field2476);
                field242.method2154(var1, var3, field242.field1838);
                field242.method2134(field242.field1838 - var2);
                Statics.field1933.method2571(field242.field1844, 0, field242.field1838);
                field282.method2365(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field284.method2365(var1);
                field274 = 6;
            }
            if (field274 == 6 && Statics.field1933.method2585() > 0) {
                int var6 = Statics.field1933.method2568();
                if (var6 == 21 && field416 == 20) {
                    field274 = 7;
                } else if (var6 == 2) {
                    field274 = 9;
                } else if (var6 == 15 && field416 == 40) {
                    field282.field1838 = 0;
                    field284.field1838 = 0;
                    field286 = -1;
                    field406 = -1;
                    field326 = -1;
                    field292 = -1;
                    field285 = 0;
                    field287 = 0;
                    field401 = 0;
                    field258 = 0;
                    field383 = false;
                    field473 = 0;
                    field471 = 0;
                    for (int var7 = 0; var7 < field358.length; var7++) {
                        if (field358[var7] != null) {
                            field358[var7].field739 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field279.length; var8++) {
                        if (field279[var8] != null) {
                            field279[var8].field739 = -1;
                        }
                    }
                    class14.field190 = new class175(32);
                    method645(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field375[var9] = true;
                    }
                    return;
                } else if (var6 == 23 && field283 < 1) {
                    field283++;
                    field274 = 0;
                } else {
                    method793(var6);
                    return;
                }
            }
            if (field274 == 7 && Statics.field1933.method2585() > 0) {
                field277 = (Statics.field1933.method2568() + 3) * 60;
                field274 = 8;
            }
            if (field274 == 8) {
                field249 = 0;
                class28.method444(class143.field2201, class143.field2202, field277 / 60 + class143.field2301);
                if (--field277 <= 0) {
                    field274 = 0;
                }
            } else {
                if (field274 == 9 && Statics.field1933.method2585() >= 13) {
                    boolean var10 = Statics.field1933.method2568() == 1;
                    Statics.field1933.method2569(field284.field1844, 0, 4);
                    field284.field1838 = 0;
                    boolean var11 = false;
                    if (var10) {
                        int var12 = field284.method2367() << 24;
                        int var13 = var12 | field284.method2367() << 16;
                        int var14 = var13 | field284.method2367() << 8;
                        int var15 = var14 | field284.method2367();
                        int var16 = class200.method3193(class28.field637);
                        if (Statics.field2674.field131.size() >= 10 && !Statics.field2674.field131.containsKey(var16)) {
                            Iterator var17 = Statics.field2674.field131.entrySet().iterator();
                            var17.next();
                            var17.remove();
                        }
                        Statics.field2674.field131.put(var16, var15);
                        class9.method466();
                    }
                    field409 = Statics.field1933.method2568();
                    field316 = Statics.field1933.method2568() == 1;
                    field366 = Statics.field1933.method2568();
                    field366 <<= 0x8;
                    field366 += Statics.field1933.method2568();
                    field367 = Statics.field1933.method2568();
                    Statics.field1933.method2569(field284.field1844, 0, 1);
                    field284.field1838 = 0;
                    field286 = field284.method2367();
                    Statics.field1933.method2569(field284.field1844, 0, 2);
                    field284.field1838 = 0;
                    field285 = field284.method2239();
                    if (field367 == 1) {
                        try {
                            class119.method2449(Statics.field480, "zap");
                        } catch (Throwable var36) {
                        }
                    } else {
                        try {
                            class119.method2449(Statics.field480, "unzap");
                        } catch (Throwable var35) {
                        }
                    }
                    field274 = 10;
                }
                if (field274 != 10) {
                    field249++;
                    if (field249 > 2000) {
                        if (field283 < 1) {
                            if (Statics.field204 == Statics.field1944) {
                                Statics.field204 = Statics.field2968;
                            } else {
                                Statics.field204 = Statics.field1944;
                            }
                            field283++;
                            field274 = 0;
                        } else {
                            method793(-3);
                        }
                    }
                } else if (Statics.field1933.method2585() >= field285) {
                    field284.field1838 = 0;
                    Statics.field1933.method2569(field284.field1844, 0, field285);
                    field307 = 1L;
                    field255 = -1;
                    Statics.field2156.field163 = 0;
                    Statics.field221 = true;
                    field256 = true;
                    field463 = -1L;
                    class190.method1873();
                    field282.field1838 = 0;
                    field284.field1838 = 0;
                    field286 = -1;
                    field406 = -1;
                    field326 = -1;
                    field292 = -1;
                    field287 = 0;
                    field401 = 0;
                    field289 = 0;
                    field259 = 0;
                    field258 = 0;
                    field383 = false;
                    class127.field2002 = 0;
                    class10.method656();
                    field395 = 0;
                    field397 = false;
                    field407 = 0;
                    field304 = (int) (Math.random() * 100.0D) - 50;
                    field306 = (int) (Math.random() * 110.0D) - 55;
                    field448 = (int) (Math.random() * 80.0D) - 40;
                    field318 = (int) (Math.random() * 120.0D) - 60;
                    field313 = (int) (Math.random() * 30.0D) - 20;
                    field325 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field473 = 0;
                    field425 = -1;
                    field471 = 0;
                    field472 = 0;
                    field268 = class18.field515;
                    field294 = 0;
                    field280 = 0;
                    for (int var20 = 0; var20 < 2048; var20++) {
                        field358[var20] = null;
                        field365[var20] = null;
                    }
                    for (int var21 = 0; var21 < 32768; var21++) {
                        field279[var21] = null;
                    }
                    Statics.field590 = field358[2047] = new class3();
                    field374 = -1;
                    field377.method3270();
                    field378.method3270();
                    for (int var22 = 0; var22 < 4; var22++) {
                        for (int var23 = 0; var23 < 104; var23++) {
                            for (int var24 = 0; var24 < 104; var24++) {
                                field452[var22][var23][var24] = null;
                            }
                        }
                    }
                    field499 = new class178();
                    field239 = 0;
                    field442 = 0;
                    field347 = 0;
                    for (int var25 = 0; var25 < Statics.field1037; var25++) {
                        class46 var26 = class46.method127(var25);
                        if (var26 != null) {
                            class155.field2669[var25] = 0;
                            class155.field2670[var25] = 0;
                        }
                    }
                    for (int var27 = 0; var27 < field428.length; var27++) {
                        field428[var27] = -1;
                    }
                    field410 = -1;
                    if (field402 != -1) {
                        int var28 = field402;
                        if (var28 != -1 && Statics.field1993[var28]) {
                            Statics.field2593.method2740(var28);
                            if (Statics.field2535[var28] != null) {
                                boolean var29 = true;
                                for (int var30 = 0; var30 < Statics.field2535[var28].length; var30++) {
                                    if (Statics.field2535[var28][var30] != null) {
                                        if (Statics.field2535[var28][var30].field2545 == 2) {
                                            var29 = false;
                                        } else {
                                            Statics.field2535[var28][var30] = null;
                                        }
                                    }
                                }
                                if (var29) {
                                    Statics.field2535[var28] = null;
                                }
                                Statics.field1993[var28] = false;
                            }
                        }
                    }
                    for (class4 var31 = (class4) field403.method3252(); var31 != null; var31 = (class4) field403.method3248()) {
                        method2404(var31, true);
                    }
                    field402 = -1;
                    field403 = new class175(8);
                    field451 = null;
                    field383 = false;
                    field258 = 0;
                    field497.method2948((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var32 = 0; var32 < 8; var32++) {
                        field502[var32] = null;
                        field372[var32] = false;
                    }
                    class14.field190 = new class175(32);
                    field250 = true;
                    for (int var33 = 0; var33 < 100; var33++) {
                        field375[var33] = true;
                    }
                    field427 = null;
                    Statics.field1856 = 0;
                    Statics.field174 = null;
                    Statics.field1855 = -1;
                    method130(false);
                    field286 = -1;
                }
            }
        } catch (IOException var37) {
            if (field283 < 1) {
                if (Statics.field204 == Statics.field1944) {
                    Statics.field204 = Statics.field2968;
                } else {
                    Statics.field204 = Statics.field1944;
                }
                field283++;
                field274 = 0;
            } else {
                method793(-2);
            }
        }
    }

    @ObfuscatedName("ae.b(II)V")
    public static void method793(int arg0) {
        if (arg0 == -3) {
            class28.method444(class143.field2204, class143.field2236, class143.field2206);
        } else if (arg0 == -2) {
            class28.method444(class143.field2339, class143.field2391, class143.field2165);
        } else if (arg0 == -1) {
            class28.method444(class143.field2210, class143.field2211, class143.field2399);
        } else if (arg0 == 3) {
            class28.method444(class143.field2207, class143.field2214, class143.field2215);
        } else if (arg0 == 4) {
            class28.method444(class143.field2256, class143.field2217, class143.field2371);
        } else if (arg0 == 5) {
            class28.method444(class143.field2184, class143.field2220, class143.field2179);
        } else if (arg0 == 6) {
            class28.method444(class143.field2360, class143.field2223, class143.field2224);
        } else if (arg0 == 7) {
            class28.method444(class143.field2225, class143.field2226, class143.field2227);
        } else if (arg0 == 8) {
            class28.method444(class143.field2243, class143.field2229, class143.field2230);
        } else if (arg0 == 9) {
            class28.method444(class143.field2231, class143.field2228, class143.field2233);
        } else if (arg0 == 10) {
            class28.method444(class143.field2355, class143.field2235, class143.field2280);
        } else if (arg0 == 11) {
            class28.method444(class143.field2237, class143.field2238, class143.field2239);
        } else if (arg0 == 12) {
            class28.method444(class143.field2260, class143.field2241, class143.field2242);
        } else if (arg0 == 13) {
            class28.method444(class143.field2247, class143.field2244, class143.field2245);
        } else if (arg0 == 14) {
            class28.method444(class143.field2246, class143.field2232, class143.field2385);
        } else if (arg0 == 16) {
            class28.method444(class143.field2249, class143.field2276, class143.field2251);
        } else if (arg0 == 17) {
            class28.method444(class143.field2252, class143.field2253, class143.field2254);
        } else if (arg0 == 18) {
            class28.method444(class143.field2300, class143.field2388, class143.field2293);
        } else if (arg0 == 19) {
            class28.method444(class143.field2258, class143.field2259, class143.field2384);
        } else if (arg0 == 20) {
            class28.method444(class143.field2261, class143.field2407, class143.field2263);
        } else if (arg0 == 22) {
            class28.method444(class143.field2264, class143.field2265, class143.field2266);
        } else if (arg0 == 23) {
            class28.method444(class143.field2216, class143.field2268, class143.field2269);
        } else if (arg0 == 24) {
            class28.method444(class143.field2270, class143.field2190, class143.field2248);
        } else if (arg0 == 25) {
            class28.method444(class143.field2273, class143.field2274, class143.field2275);
        } else if (arg0 == 26) {
            class28.method444(class143.field2285, class143.field2277, class143.field2188);
        } else if (arg0 == 27) {
            class28.method444(class143.field2346, class143.field2405, class143.field2281);
        } else if (arg0 == 31) {
            class28.method444(class143.field2288, class143.field2173, class143.field2290);
        } else if (arg0 == 32) {
            class28.method444(class143.field2291, class143.field2292, class143.field2315);
        } else if (arg0 == 37) {
            class28.method444(class143.field2294, class143.field2295, class143.field2376);
        } else if (arg0 == 38) {
            class28.method444(class143.field2297, class143.field2298, class143.field2299);
        } else if (arg0 == 55) {
            class28.method444(class143.field2362, class143.field2348, class143.field2302);
        } else if (arg0 == 56) {
            class28.method444(class143.field2257, class143.field2180, class143.field2382);
            method645(11);
            return;
        } else if (arg0 == 57) {
            class28.method444(class143.field2306, class143.field2307, class143.field2308);
            method645(11);
            return;
        } else {
            class28.method444(class143.field2309, class143.field2310, class143.field2311);
        }
        method645(10);
    }

    @ObfuscatedName("eg.x(I)V")
    public static final void method2703() {
        if (Statics.field1933 != null) {
            Statics.field1933.method2584();
            Statics.field1933 = null;
        }
        method149();
        Statics.field1562.method1607();
        for (int var0 = 0; var0 < 4; var0++) {
            field254[var0].method3546();
        }
        System.gc();
        class162.method860(2);
        field475 = -1;
        field276 = false;
        class20.method571();
        method645(10);
    }

    @ObfuscatedName("p.q(B)V")
    public static final void method149() {
        class41.method113();
        class37.method465();
        class40.field928.method3210();
        class36.method509();
        class35.field786.method3210();
        class35.field787.method3210();
        class45.method821();
        class38.method6();
        class39.method568();
        class42.field956.method3210();
        Statics.method548();
        class158.field2691.method3210();
        class153.field2538.method3210();
        class153.field2651.method3210();
        class153.field2626.method3210();
        ((class88) Statics.field1453).method1880();
        class19.field529.method3210();
        Statics.field272.method2769();
        Statics.field2136.method2769();
        Statics.field1253.method2769();
        Statics.field1823.method2769();
        Statics.field26.method2769();
        Statics.field1550.method2769();
        Statics.field55.method2769();
        Statics.field1071.method2769();
        Statics.field625.method2769();
        Statics.field1405.method2769();
        Statics.field123.method2769();
        Statics.field1999.method2769();
    }

    @ObfuscatedName("e.o(I)V")
    public static final void method85() {
        if (field289 > 0) {
            method2703();
        } else {
            method645(40);
            Statics.field392 = Statics.field1933;
            Statics.field1933 = null;
        }
    }

    @ObfuscatedName("w.m(I)V")
    public static final void method452() {
        if (field401 > 1) {
            field401--;
        }
        if (field289 > 0) {
            field289--;
        }
        if (field434) {
            field434 = false;
            method85();
            return;
        }
        if (!field383) {
            field389[0] = class143.field2401;
            field501[0] = "";
            field387[0] = 1006;
            field258 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field1933 == null) {
                var1 = false;
            } else {
                label2831: {
                    try {
                        int var2 = Statics.field1933.method2585();
                        if (var2 == 0) {
                            var1 = false;
                            break label2831;
                        }
                        if (field286 == -1) {
                            Statics.field1933.method2569(field284.field1844, 0, 1);
                            field284.field1838 = 0;
                            field286 = field284.method2367();
                            field285 = class167.field2816[field286];
                            var2--;
                        }
                        if (field285 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2831;
                            }
                            Statics.field1933.method2569(field284.field1844, 0, 1);
                            field285 = field284.field1844[0] & 0xFF;
                            var2--;
                        }
                        if (field285 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2831;
                            }
                            Statics.field1933.method2569(field284.field1844, 0, 2);
                            field284.field1838 = 0;
                            field285 = field284.method2239();
                            var2 -= 2;
                        }
                        if (var2 < field285) {
                            var1 = false;
                            break label2831;
                        }
                        field284.field1838 = 0;
                        Statics.field1933.method2569(field284.field1844, 0, field285);
                        field287 = 0;
                        field292 = field326;
                        field326 = field406;
                        field406 = field286;
                        if (field286 == 220) {
                            int var3 = field284.method2138();
                            int var4 = field284.method2138();
                            int var5 = field284.method2138();
                            int var6 = field284.method2138();
                            field300[var3] = true;
                            field487[var3] = var4;
                            field488[var3] = var5;
                            field489[var3] = var6;
                            field490[var3] = 0;
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 12) {
                            int var7 = field284.method2172();
                            int var8 = field284.method2242();
                            int var9 = field284.method2239();
                            class153 var10 = class153.method2702(var8);
                            var10.field2587 = (var7 << 16) + var9;
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 40) {
                            field485 = false;
                            for (int var11 = 0; var11 < 5; var11++) {
                                field300[var11] = false;
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 38) {
                            String var12 = field284.method2146();
                            long var13 = (long) field284.method2239();
                            long var15 = (long) field284.method2142();
                            class138[] var17 = new class138[] { class138.field2125, class138.field2121, class138.field2118, class138.field2127, class138.field2120 };
                            class138 var18 = (class138) class99.method531(var17, field284.method2138());
                            long var19 = (var13 << 32) + var15;
                            boolean var21 = false;
                            for (int var22 = 0; var22 < 100; var22++) {
                                if (field458[var22] == var19) {
                                    var21 = true;
                                    break;
                                }
                            }
                            if (method437(var12)) {
                                var21 = true;
                            }
                            if (!var21 && field359 == 0) {
                                field458[field251] = var19;
                                field251 = (field251 + 1) % 100;
                                String var23 = class193.method3404(class200.method2844(class192.method2471(field284)));
                                byte var24;
                                if (var18.field2124) {
                                    var24 = 7;
                                } else {
                                    var24 = 3;
                                }
                                if (var18.field2123 == -1) {
                                    class10.method132(var24, var12, var23);
                                } else {
                                    class10.method132(var24, class2.method1336(var18.field2123) + var12, var23);
                                }
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 20) {
                            int var25 = field284.method2175();
                            int var26 = field284.method2174();
                            int var27 = field284.method2143();
                            class153 var28 = class153.method2702(var27);
                            int var29 = var28.field2550 + var26;
                            int var30 = var28.field2551 + var25;
                            if (var28.field2588 != var29 || var28.field2549 != var30) {
                                var28.field2588 = var29;
                                var28.field2549 = var30;
                                method2520(var28);
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 73) {
                            int var31 = field284.method2239();
                            int var32 = field284.method2181();
                            class153 var33 = class153.method2702(var32);
                            if (var33.field2610 != 2 || var33.field2576 != var31) {
                                var33.field2610 = 2;
                                var33.field2576 = var31;
                                method2520(var33);
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 131) {
                            int var34 = field284.method2172();
                            byte var35 = field284.method2165();
                            class155.field2669[var34] = var35;
                            if (class155.field2670[var34] != var35) {
                                class155.field2670[var34] = var35;
                                method2431(var34);
                            }
                            field459[++field469 - 1 & 0x1F] = var34;
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 125) {
                            field259 = field284.method2138();
                            if (field259 == 1) {
                                field260 = field284.method2239();
                            }
                            if (field259 >= 2 && field259 <= 6) {
                                if (field259 == 2) {
                                    field486 = 64;
                                    field266 = 64;
                                }
                                if (field259 == 3) {
                                    field486 = 0;
                                    field266 = 64;
                                }
                                if (field259 == 4) {
                                    field486 = 128;
                                    field266 = 64;
                                }
                                if (field259 == 5) {
                                    field486 = 64;
                                    field266 = 0;
                                }
                                if (field259 == 6) {
                                    field486 = 64;
                                    field266 = 128;
                                }
                                field259 = 2;
                                field262 = field284.method2239();
                                field424 = field284.method2239();
                                field264 = field284.method2138();
                            }
                            if (field259 == 10) {
                                field261 = field284.method2239();
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 157) {
                            int var36 = field284.method2143();
                            class153 var37 = class153.method2702(var36);
                            for (int var38 = 0; var38 < var37.field2645.length; var38++) {
                                var37.field2645[var38] = -1;
                                var37.field2645[var38] = 0;
                            }
                            method2520(var37);
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 10) {
                            int var39 = field284.method2172();
                            field402 = var39;
                            method542(var39);
                            class32.method1795(field402);
                            for (int var40 = 0; var40 < 100; var40++) {
                                field375[var40] = true;
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 158) {
                            int var41 = field284.method2143();
                            int var42 = field284.method2239();
                            if (var41 < -70000) {
                                var42 += 32768;
                            }
                            class153 var43;
                            if (var41 >= 0) {
                                var43 = class153.method2702(var41);
                            } else {
                                var43 = null;
                            }
                            while (field284.field1838 < field285) {
                                int var44 = field284.method2151();
                                int var45 = field284.method2239();
                                int var46 = 0;
                                if (var45 != 0) {
                                    var46 = field284.method2138();
                                    if (var46 == 255) {
                                        var46 = field284.method2143();
                                    }
                                }
                                if (var43 != null && var44 >= 0 && var44 < var43.field2645.length) {
                                    var43.field2645[var44] = var45;
                                    var43.field2616[var44] = var46;
                                }
                                class14.method2082(var42, var44, var45 - 1, var46);
                            }
                            if (var43 != null) {
                                method2520(var43);
                            }
                            method2705();
                            field386[++field431 - 1 & 0x1F] = var42 & 0x7FFF;
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 124) {
                            String var47 = field284.method2146();
                            long var48 = field284.method2144();
                            long var50 = (long) field284.method2239();
                            long var52 = (long) field284.method2142();
                            class138[] var54 = new class138[] { class138.field2125, class138.field2121, class138.field2118, class138.field2127, class138.field2120 };
                            class138 var55 = (class138) class99.method531(var54, field284.method2138());
                            long var56 = (var50 << 32) + var52;
                            boolean var58 = false;
                            for (int var59 = 0; var59 < 100; var59++) {
                                if (field458[var59] == var56) {
                                    var58 = true;
                                    break;
                                }
                            }
                            if (var55.field2117 && method437(var47)) {
                                var58 = true;
                            }
                            if (!var58 && field359 == 0) {
                                field458[field251] = var56;
                                field251 = (field251 + 1) % 100;
                                String var60 = class193.method3404(class200.method2844(class192.method2471(field284)));
                                if (var55.field2123 == -1) {
                                    class10.method532(9, var47, var60, class199.method1070(var48));
                                } else {
                                    class10.method532(9, class2.method1336(var55.field2123) + var47, var60, class199.method1070(var48));
                                }
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 61) {
                            Statics.method904(field284, field285);
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 43) {
                            method2705();
                            field334 = field284.method2283();
                            field437 = field303;
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 212) {
                            field473 = field284.method2138();
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 173) {
                            String var61 = field284.method2146();
                            int var62 = field284.method2239();
                            byte var63 = field284.method2139();
                            boolean var64 = false;
                            if (var63 == -128) {
                                var64 = true;
                            }
                            if (var64) {
                                if (Statics.field1856 == 0) {
                                    field286 = -1;
                                    var1 = true;
                                    break label2831;
                                }
                                boolean var65 = false;
                                int var66;
                                for (var66 = 0; var66 < Statics.field1856 && (!Statics.field174[var66].field550.equals(var61) || Statics.field174[var66].field552 != var62); var66++) {
                                }
                                if (var66 < Statics.field1856) {
                                    while (var66 < Statics.field1856 - 1) {
                                        Statics.field174[var66] = Statics.field174[var66 + 1];
                                        var66++;
                                    }
                                    Statics.field1856--;
                                    Statics.field174[Statics.field1856] = null;
                                }
                            } else {
                                field284.method2146();
                                class21 var67 = new class21();
                                var67.field550 = var61;
                                var67.field559 = class201.method2843(var67.field550, Statics.field777);
                                var67.field552 = var62;
                                var67.field553 = var63;
                                int var68;
                                for (var68 = Statics.field1856 - 1; var68 >= 0; var68--) {
                                    int var69 = Statics.field174[var68].field559.compareTo(var67.field550);
                                    if (var69 == 0) {
                                        Statics.field174[var68].field552 = var62;
                                        Statics.field174[var68].field553 = var63;
                                        if (var61.equals(Statics.field590.field46)) {
                                            Statics.field2673 = var63;
                                        }
                                        field436 = field303;
                                        field286 = -1;
                                        var1 = true;
                                        break label2831;
                                    }
                                    if (var69 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field1856 >= Statics.field174.length) {
                                    field286 = -1;
                                    var1 = true;
                                    break label2831;
                                }
                                for (int var70 = Statics.field1856 - 1; var70 > var68; var70--) {
                                    Statics.field174[var70 + 1] = Statics.field174[var70];
                                }
                                if (Statics.field1856 == 0) {
                                    Statics.field174 = new class21[100];
                                }
                                Statics.field174[var68 + 1] = var67;
                                Statics.field1856++;
                                if (var61.equals(Statics.field590.field46)) {
                                    Statics.field2673 = var63;
                                }
                            }
                            field436 = field303;
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 168) {
                            field471 = field284.method2138();
                            if (field471 == 255) {
                                field471 = 0;
                            }
                            field472 = field284.method2138();
                            if (field472 == 255) {
                                field472 = 0;
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 198) {
                            int var71 = field284.method2181();
                            int var72 = field284.method2239();
                            int var73 = field284.method2294();
                            class4 var74 = (class4) field403.method3244((long) var71);
                            if (var74 != null) {
                                method2404(var74, var74.field54 != var72);
                            }
                            class4 var75 = new class4();
                            var75.field54 = var72;
                            var75.field51 = var73;
                            field403.method3253(var75, (long) var71);
                            method542(var72);
                            class32.method1795(var72);
                            class153 var76 = class153.method2702(var71);
                            if (var76 != null) {
                                method2520(var76);
                            }
                            if (field451 != null) {
                                method2520(field451);
                                field451 = null;
                            }
                            method2071();
                            if (field402 != -1) {
                                method2709(field402, 1);
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 1) {
                            if (field402 != -1) {
                                method2709(field402, 0);
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 66) {
                            Statics.field146 = field284.method2238();
                            Statics.field698 = field284.method2238();
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 100) {
                            for (int var77 = 0; var77 < class155.field2670.length; var77++) {
                                if (class155.field2670[var77] != class155.field2669[var77]) {
                                    class155.field2670[var77] = class155.field2669[var77];
                                    method2431(var77);
                                    field459[++field469 - 1 & 0x1F] = var77;
                                }
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 15) {
                            int var78 = field284.method2239();
                            if (var78 == 65535) {
                                var78 = -1;
                            }
                            method77(var78);
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 250) {
                            int var79 = field284.method2172();
                            if (var79 == 65535) {
                                var79 = -1;
                            }
                            int var80 = field284.method2304();
                            if (field290 != 0 && var79 != -1) {
                                class162.method2875(Statics.field123, var79, 0, field290, false);
                                field276 = true;
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 209) {
                            int var81 = field284.method2171();
                            int var82 = field284.method2140();
                            int var83 = field284.method2140();
                            int var84 = field284.method2242();
                            class153 var85 = class153.method2702(var84);
                            if (var85.field2583 != var81 || var85.field2584 != var83 || var85.field2604 != var82) {
                                var85.field2583 = var81;
                                var85.field2584 = var83;
                                var85.field2604 = var82;
                                method2520(var85);
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 207) {
                            method2703();
                            field286 = -1;
                            var1 = false;
                            break label2831;
                        }
                        if (field286 == 24) {
                            int var86 = field284.method2239();
                            int var87 = field284.method2143();
                            int var88 = var86 >> 10 & 0x1F;
                            int var89 = var86 >> 5 & 0x1F;
                            int var90 = var86 & 0x1F;
                            int var91 = (var90 << 3) + (var88 << 19) + (var89 << 11);
                            class153 var92 = class153.method2702(var87);
                            if (var92.field2564 != var91) {
                                var92.field2564 = var91;
                                method2520(var92);
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 96) {
                            method528();
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 240) {
                            Statics.field698 = field284.method2294();
                            Statics.field146 = field284.method2238();
                            while (field284.field1838 < field285) {
                                field286 = field284.method2138();
                                method454();
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 55) {
                            int var93 = field284.method2182();
                            int var94 = field284.method2140();
                            class155.field2669[var94] = var93;
                            if (class155.field2670[var94] != var93) {
                                class155.field2670[var94] = var93;
                                method2431(var94);
                            }
                            field459[++field469 - 1 & 0x1F] = var94;
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 58) {
                            String var95 = field284.method2146();
                            String var96 = class193.method3404(class200.method2844(class192.method2471(field284)));
                            class10.method132(6, var95, var96);
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 77) {
                            field485 = true;
                            Statics.field1428 = field284.method2138();
                            Statics.field978 = field284.method2138();
                            Statics.field1273 = field284.method2239();
                            Statics.field185 = field284.method2138();
                            Statics.field682 = field284.method2138();
                            if (Statics.field682 >= 100) {
                                int var97 = Statics.field1428 * 128 + 64;
                                int var98 = Statics.field978 * 128 + 64;
                                int var99 = method2479(var97, var98, Statics.field224) - Statics.field1273;
                                int var100 = var97 - Statics.field323;
                                int var101 = var99 - Statics.field1909;
                                int var102 = var98 - Statics.field181;
                                int var103 = (int) Math.sqrt((double) (var100 * var100 + var102 * var102));
                                Statics.field165 = (int) (Math.atan2((double) var101, (double) var103) * 325.949D) & 0x7FF;
                                Statics.field1912 = (int) (Math.atan2((double) var100, (double) var102) * -325.949D) & 0x7FF;
                                if (Statics.field165 < 128) {
                                    Statics.field165 = 128;
                                }
                                if (Statics.field165 > 383) {
                                    Statics.field165 = 383;
                                }
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 70) {
                            int var104 = field284.method2172();
                            class14 var105 = (class14) class14.field190.method3244((long) var104);
                            if (var105 != null) {
                                var105.method3365();
                            }
                            field386[++field431 - 1 & 0x1F] = var104 & 0x7FFF;
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 252) {
                            int var106 = field284.method2143();
                            boolean var107 = field284.method2238() == 1;
                            class153 var108 = class153.method2702(var106);
                            if (var108.field2555 != var107) {
                                var108.field2555 = var107;
                                method2520(var108);
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 101) {
                            int var109 = field284.method2294();
                            int var110 = field284.method2138();
                            int var111 = field284.method2305();
                            Statics.field224 = var109 >> 1;
                            Statics.field590.method569(var111, var110, (var109 & 0x1) == 1);
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 167) {
                            int var112 = field284.method2143();
                            int var113 = field284.method2239();
                            if (var112 < -70000) {
                                var113 += 32768;
                            }
                            class153 var114;
                            if (var112 >= 0) {
                                var114 = class153.method2702(var112);
                            } else {
                                var114 = null;
                            }
                            if (var114 != null) {
                                for (int var115 = 0; var115 < var114.field2645.length; var115++) {
                                    var114.field2645[var115] = 0;
                                    var114.field2616[var115] = 0;
                                }
                            }
                            class14.method2712(var113);
                            int var116 = field284.method2239();
                            for (int var117 = 0; var117 < var116; var117++) {
                                int var118 = field284.method2305();
                                if (var118 == 255) {
                                    var118 = field284.method2143();
                                }
                                int var119 = field284.method2140();
                                if (var114 != null && var117 < var114.field2645.length) {
                                    var114.field2645[var117] = var119;
                                    var114.field2616[var117] = var118;
                                }
                                class14.method2082(var113, var117, var119 - 1, var118);
                            }
                            if (var114 != null) {
                                method2520(var114);
                            }
                            method2705();
                            field386[++field431 - 1 & 0x1F] = var113 & 0x7FFF;
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 3) {
                            while (field284.field1838 < field285) {
                                int var120 = field284.method2138();
                                boolean var121 = (var120 & 0x1) == 1;
                                String var122 = field284.method2146();
                                String var123 = field284.method2146();
                                field284.method2146();
                                for (int var124 = 0; var124 < field347; var124++) {
                                    class8 var125 = field273[var124];
                                    if (var121) {
                                        if (var123.equals(var125.field124)) {
                                            var125.field124 = var122;
                                            var125.field119 = var123;
                                            var122 = null;
                                            break;
                                        }
                                    } else if (var122.equals(var125.field124)) {
                                        var125.field124 = var122;
                                        var125.field119 = var123;
                                        var122 = null;
                                        break;
                                    }
                                }
                                if (var122 != null && field347 < 400) {
                                    class8 var126 = new class8();
                                    field273[field347] = var126;
                                    var126.field124 = var122;
                                    var126.field119 = var123;
                                    field347++;
                                }
                            }
                            field435 = field303;
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 48) {
                            field485 = true;
                            Statics.field1866 = field284.method2138();
                            Statics.field964 = field284.method2138();
                            Statics.field1654 = field284.method2239();
                            Statics.field115 = field284.method2138();
                            Statics.field1926 = field284.method2138();
                            if (Statics.field1926 >= 100) {
                                Statics.field323 = Statics.field1866 * 128 + 64;
                                Statics.field181 = Statics.field964 * 128 + 64;
                                Statics.field1909 = method2479(Statics.field323, Statics.field181, Statics.field224) - Statics.field1654;
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 140) {
                            field284.field1838 += 28;
                            if (field284.method2324()) {
                                class136.method1889(field284, field284.field1838 - 28);
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 147) {
                            field239 = 1;
                            field435 = field303;
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 251) {
                            int var127 = field284.method2182();
                            Statics.field1490 = Statics.field1752.method2486(var127);
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 219) {
                            while (field284.field1838 < field285) {
                                boolean var128 = field284.method2138() == 1;
                                String var129 = field284.method2146();
                                String var130 = field284.method2146();
                                int var131 = field284.method2239();
                                int var132 = field284.method2138();
                                int var133 = field284.method2138();
                                boolean var134 = (var133 & 0x2) != 0;
                                boolean var135 = (var133 & 0x1) != 0;
                                if (var131 > 0) {
                                    field284.method2146();
                                    field284.method2138();
                                    field284.method2143();
                                }
                                field284.method2146();
                                for (int var136 = 0; var136 < field442; var136++) {
                                    class16 var137 = field493[var136];
                                    if (var128) {
                                        if (var130.equals(var137.field220)) {
                                            var137.field220 = var129;
                                            var137.field211 = var130;
                                            var129 = null;
                                            break;
                                        }
                                    } else if (var129.equals(var137.field220)) {
                                        if (var137.field212 != var131) {
                                            boolean var138 = true;
                                            for (class34 var139 = (class34) field494.method3230(); var139 != null; var139 = (class34) field494.method3231()) {
                                                if (var139.field778.equals(var129)) {
                                                    if (var131 != 0 && var139.field776 == 0) {
                                                        var139.method3363();
                                                        var138 = false;
                                                    } else if (var131 == 0 && var139.field776 != 0) {
                                                        var139.method3363();
                                                        var138 = false;
                                                    }
                                                }
                                            }
                                            if (var138) {
                                                field494.method3235(new class34(var129, var131));
                                            }
                                            var137.field212 = var131;
                                        }
                                        var137.field211 = var130;
                                        var137.field215 = var132;
                                        var137.field210 = var134;
                                        var137.field222 = var135;
                                        var129 = null;
                                        break;
                                    }
                                }
                                if (var129 != null && field442 < 400) {
                                    class16 var140 = new class16();
                                    field493[field442] = var140;
                                    var140.field220 = var129;
                                    var140.field211 = var130;
                                    var140.field212 = var131;
                                    var140.field215 = var132;
                                    var140.field210 = var134;
                                    var140.field222 = var135;
                                    field442++;
                                }
                            }
                            field239 = 2;
                            field435 = field303;
                            boolean var141 = false;
                            int var142 = field442;
                            while (var142 > 0) {
                                boolean var143 = true;
                                var142--;
                                for (int var144 = 0; var144 < var142; var144++) {
                                    boolean var145 = false;
                                    class16 var146 = field493[var144];
                                    class16 var147 = field493[var144 + 1];
                                    if (field241 != var146.field212 && field241 == var147.field212) {
                                        var145 = true;
                                    }
                                    if (!var145 && var146.field212 == 0 && var147.field212 != 0) {
                                        var145 = true;
                                    }
                                    if (!var145 && !var146.field210 && var147.field210) {
                                        var145 = true;
                                    }
                                    if (!var145 && !var146.field222 && var147.field222) {
                                        var145 = true;
                                    }
                                    if (var145) {
                                        class16 var148 = field493[var144];
                                        field493[var144] = field493[var144 + 1];
                                        field493[var144 + 1] = var148;
                                        var143 = false;
                                    }
                                }
                                if (var143) {
                                    break;
                                }
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 230) {
                            method2705();
                            int var149 = field284.method2182();
                            int var150 = field284.method2305();
                            int var151 = field284.method2305();
                            field381[var151] = var149;
                            field478[var151] = var150;
                            field380[var151] = 1;
                            for (int var152 = 0; var152 < 98; var152++) {
                                if (var149 >= class141.field2151[var152]) {
                                    field380[var151] = var152 + 2;
                                }
                            }
                            field432[++field433 - 1 & 0x1F] = var151;
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 19) {
                            for (int var153 = 0; var153 < field358.length; var153++) {
                                if (field358[var153] != null) {
                                    field358[var153].field745 = -1;
                                }
                            }
                            for (int var154 = 0; var154 < field279.length; var154++) {
                                if (field279[var154] != null) {
                                    field279[var154].field745 = -1;
                                }
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 52) {
                            field368 = 0;
                            field363 = 0;
                            field284.method2368();
                            int var155 = field284.method2369(1);
                            if (var155 != 0) {
                                int var156 = field284.method2369(2);
                                if (var156 == 0) {
                                    field364[++field363 - 1] = 2047;
                                } else if (var156 == 1) {
                                    int var157 = field284.method2369(3);
                                    Statics.field590.method550(var157, false);
                                    int var158 = field284.method2369(1);
                                    if (var158 == 1) {
                                        field364[++field363 - 1] = 2047;
                                    }
                                } else if (var156 == 2) {
                                    int var159 = field284.method2369(3);
                                    Statics.field590.method550(var159, true);
                                    int var160 = field284.method2369(3);
                                    Statics.field590.method550(var160, true);
                                    int var161 = field284.method2369(1);
                                    if (var161 == 1) {
                                        field364[++field363 - 1] = 2047;
                                    }
                                } else if (var156 == 3) {
                                    int var162 = field284.method2369(7);
                                    int var163 = field284.method2369(1);
                                    int var164 = field284.method2369(7);
                                    Statics.field224 = field284.method2369(2);
                                    int var165 = field284.method2369(1);
                                    if (var165 == 1) {
                                        field364[++field363 - 1] = 2047;
                                    }
                                    Statics.field590.method569(var162, var164, var163 == 1);
                                }
                            }
                            int var166 = field284.method2369(8);
                            if (var166 < field294) {
                                for (int var167 = var166; var167 < field294; var167++) {
                                    field369[++field368 - 1] = field362[var167];
                                }
                            }
                            if (var166 > field294) {
                                throw new RuntimeException("");
                            }
                            field294 = 0;
                            for (int var168 = 0; var168 < var166; var168++) {
                                int var169 = field362[var168];
                                class3 var170 = field358[var169];
                                int var171 = field284.method2369(1);
                                if (var171 == 0) {
                                    field362[++field294 - 1] = var169;
                                    var170.field762 = field245;
                                } else {
                                    int var172 = field284.method2369(2);
                                    if (var172 == 0) {
                                        field362[++field294 - 1] = var169;
                                        var170.field762 = field245;
                                        field364[++field363 - 1] = var169;
                                    } else if (var172 == 1) {
                                        field362[++field294 - 1] = var169;
                                        var170.field762 = field245;
                                        int var173 = field284.method2369(3);
                                        var170.method550(var173, false);
                                        int var174 = field284.method2369(1);
                                        if (var174 == 1) {
                                            field364[++field363 - 1] = var169;
                                        }
                                    } else if (var172 == 2) {
                                        field362[++field294 - 1] = var169;
                                        var170.field762 = field245;
                                        int var175 = field284.method2369(3);
                                        var170.method550(var175, true);
                                        int var176 = field284.method2369(3);
                                        var170.method550(var176, true);
                                        int var177 = field284.method2369(1);
                                        if (var177 == 1) {
                                            field364[++field363 - 1] = var169;
                                        }
                                    } else if (var172 == 3) {
                                        field369[++field368 - 1] = var169;
                                    }
                                }
                            }
                            while (field284.method2371(field285) >= 11) {
                                int var178 = field284.method2369(11);
                                if (var178 == 2047) {
                                    break;
                                }
                                boolean var179 = false;
                                if (field358[var178] == null) {
                                    field358[var178] = new class3();
                                    if (field365[var178] != null) {
                                        field358[var178].method21(field365[var178]);
                                    }
                                    var179 = true;
                                }
                                field362[++field294 - 1] = var178;
                                class3 var180 = field358[var178];
                                var180.field762 = field245;
                                int var181 = field284.method2369(1);
                                int var182 = field373[field284.method2369(3)];
                                if (var179) {
                                    var180.field764 = var180.field715 = var182;
                                }
                                int var183 = field284.method2369(5);
                                if (var183 > 15) {
                                    var183 -= 32;
                                }
                                int var184 = field284.method2369(5);
                                if (var184 > 15) {
                                    var184 -= 32;
                                }
                                int var185 = field284.method2369(1);
                                if (var185 == 1) {
                                    field364[++field363 - 1] = var178;
                                }
                                var180.method569(Statics.field590.field765[0] + var183, Statics.field590.field769[0] + var184, var181 == 1);
                            }
                            field284.method2370();
                            for (int var186 = 0; var186 < field363; var186++) {
                                int var187 = field364[var186];
                                class3 var188 = field358[var187];
                                int var189 = field284.method2138();
                                if ((var189 & 0x10) != 0) {
                                    var189 += field284.method2138() << 8;
                                }
                                if ((var189 & 0x4) != 0) {
                                    int var190 = field284.method2239();
                                    if (var190 == 65535) {
                                        var190 = -1;
                                    }
                                    int var191 = field284.method2305();
                                    method3188(var188, var190, var191);
                                }
                                if ((var189 & 0x200) != 0) {
                                    var188.field755 = field284.method2238();
                                    var188.field717 = field284.method2294();
                                    var188.field756 = field284.method2138();
                                    var188.field758 = field284.method2138();
                                    var188.field772 = field284.method2239() + field245;
                                    var188.field770 = field284.method2171() + field245;
                                    var188.field761 = field284.method2138();
                                    var188.field741 = 1;
                                    var188.field733 = 0;
                                }
                                if ((var189 & 0x1) != 0) {
                                    int var192 = field284.method2294();
                                    byte[] var193 = new byte[var192];
                                    class107 var194 = new class107(var193);
                                    field284.method2235(var193, 0, var192);
                                    field365[var187] = var194;
                                    var188.method21(var194);
                                }
                                if ((var189 & 0x80) != 0) {
                                    int var195 = field284.method2140();
                                    int var196 = field284.method2294();
                                    var188.method553(var195, var196, field245);
                                    var188.field736 = field245 + 300;
                                    var188.field737 = field284.method2294();
                                    var188.field738 = field284.method2294();
                                }
                                if ((var189 & 0x400) != 0) {
                                    var188.field750 = field284.method2239();
                                    int var197 = field284.method2182();
                                    var188.field751 = var197 >> 16;
                                    var188.field753 = (var197 & 0xFFFF) + field245;
                                    var188.field743 = 0;
                                    var188.field752 = 0;
                                    if (var188.field753 > field245) {
                                        var188.field743 = -1;
                                    }
                                    if (var188.field750 == 65535) {
                                        var188.field750 = -1;
                                    }
                                }
                                if ((var189 & 0x20) != 0) {
                                    var188.field739 = field284.method2239();
                                    if (var188.field739 == 65535) {
                                        var188.field739 = -1;
                                    }
                                }
                                if ((var189 & 0x100) != 0) {
                                    int var198 = field284.method2140();
                                    int var199 = field284.method2238();
                                    var188.method553(var198, var199, field245);
                                    var188.field736 = field245 + 300;
                                    var188.field737 = field284.method2238();
                                    var188.field738 = field284.method2294();
                                }
                                if ((var189 & 0x2) != 0) {
                                    var188.field728 = field284.method2146();
                                    if (var188.field728.charAt(0) == '~') {
                                        var188.field728 = var188.field728.substring(1);
                                        class10.method132(2, var188.field46, var188.field728);
                                    } else if (Statics.field590 == var188) {
                                        class10.method132(2, var188.field46, var188.field728);
                                    }
                                    var188.field759 = false;
                                    var188.field763 = 0;
                                    var188.field768 = 0;
                                    var188.field730 = 150;
                                }
                                if ((var189 & 0x40) != 0) {
                                    int var200 = field284.method2171();
                                    class138[] var201 = new class138[] { class138.field2125, class138.field2121, class138.field2118, class138.field2127, class138.field2120 };
                                    class138 var202 = (class138) class99.method531(var201, field284.method2294());
                                    boolean var203 = field284.method2294() == 1;
                                    int var204 = field284.method2138();
                                    int var205 = field284.field1838;
                                    if (var188.field46 != null && var188.field29 != null) {
                                        boolean var206 = false;
                                        if (var202.field2117 && method437(var188.field46)) {
                                            var206 = true;
                                        }
                                        if (!var206 && field359 == 0 && !var188.field42) {
                                            field267.field1838 = 0;
                                            field284.method2235(field267.field1844, 0, var204);
                                            field267.field1838 = 0;
                                            String var207 = class193.method3404(class200.method2844(class192.method2471(field267)));
                                            var188.field728 = var207.trim();
                                            var188.field763 = var200 >> 8;
                                            var188.field768 = var200 & 0xFF;
                                            var188.field730 = 150;
                                            var188.field759 = var203;
                                            int var208;
                                            if (var202.field2124) {
                                                var208 = var203 ? 91 : 1;
                                            } else {
                                                var208 = var203 ? 90 : 2;
                                            }
                                            if (var202.field2123 == -1) {
                                                class10.method132(var208, var188.field46, var207);
                                            } else {
                                                class10.method132(var208, class2.method1336(var202.field2123) + var188.field46, var207);
                                            }
                                        }
                                    }
                                    field284.field1838 = var204 + var205;
                                }
                                if ((var189 & 0x8) != 0) {
                                    var188.field740 = field284.method2171();
                                    var188.field754 = field284.method2171();
                                }
                            }
                            for (int var209 = 0; var209 < field368; var209++) {
                                int var210 = field369[var209];
                                if (field245 != field358[var210].field762) {
                                    field358[var210] = null;
                                }
                            }
                            if (field285 != field284.field1838) {
                                throw new RuntimeException(field284.field1838 + class2.field17 + field285);
                            }
                            for (int var211 = 0; var211 < field294; var211++) {
                                if (field358[field362[var211]] == null) {
                                    throw new RuntimeException(var211 + class2.field17 + field294);
                                }
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 162) {
                            field495 = field284.method2138();
                            field457 = field284.method2138();
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 8) {
                            method130(true);
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 222) {
                            method130(false);
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 128) {
                            Statics.field1884 = class117.method2286(field284.method2138());
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 60) {
                            int var212 = field284.method2143();
                            class4 var213 = (class4) field403.method3244((long) var212);
                            if (var213 != null) {
                                method2404(var213, true);
                            }
                            if (field451 != null) {
                                method2520(field451);
                                field451 = null;
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 145) {
                            int var214 = field285 + field284.field1838;
                            int var215 = field284.method2239();
                            int var216 = field284.method2239();
                            if (field402 != var215) {
                                field402 = var215;
                                method542(field402);
                                class32.method1795(field402);
                                for (int var217 = 0; var217 < 100; var217++) {
                                    field375[var217] = true;
                                }
                            }
                            while (var216-- > 0) {
                                int var218 = field284.method2143();
                                int var219 = field284.method2239();
                                int var220 = field284.method2138();
                                class4 var221 = (class4) field403.method3244((long) var218);
                                if (var221 != null && var221.field54 != var219) {
                                    method2404(var221, true);
                                    var221 = null;
                                }
                                if (var221 == null) {
                                    class4 var222 = new class4();
                                    var222.field54 = var219;
                                    var222.field51 = var220;
                                    field403.method3253(var222, (long) var218);
                                    method542(var219);
                                    class32.method1795(var219);
                                    class153 var223 = class153.method2702(var218);
                                    if (var223 != null) {
                                        method2520(var223);
                                    }
                                    if (field451 != null) {
                                        method2520(field451);
                                        field451 = null;
                                    }
                                    method2071();
                                    if (field402 != -1) {
                                        method2709(field402, 1);
                                    }
                                    var221 = var222;
                                }
                                var221.field52 = true;
                            }
                            for (class4 var225 = (class4) field403.method3252(); var225 != null; var225 = (class4) field403.method3248()) {
                                if (var225.field52) {
                                    var225.field52 = false;
                                } else {
                                    method2404(var225, true);
                                }
                            }
                            field444 = new class175(512);
                            while (field284.field1838 < var214) {
                                int var226 = field284.method2143();
                                int var227 = field284.method2239();
                                int var228 = field284.method2239();
                                int var229 = field284.method2143();
                                for (int var230 = var227; var230 <= var228; var230++) {
                                    long var231 = ((long) var226 << 32) + (long) var230;
                                    field444.method3253(new class180(var229), var231);
                                }
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 110) {
                            int var233 = field284.method2143();
                            int var234 = field284.method2239();
                            if (var234 == 65535) {
                                var234 = -1;
                            }
                            int var235 = field284.method2242();
                            class153 var236 = class153.method2702(var235);
                            if (var236.field2596) {
                                var236.field2586 = var234;
                                var236.field2579 = var233;
                                class45 var238 = class45.method114(var234);
                                var236.field2583 = var238.field1004;
                                var236.field2584 = var238.field1010;
                                var236.field2585 = var238.field1029;
                                var236.field2581 = var238.field1030;
                                var236.field2582 = var238.field1008;
                                var236.field2604 = var238.field1019;
                                if (var236.field2552 > 0) {
                                    var236.field2604 = var236.field2604 * 32 / var236.field2552;
                                }
                                method2520(var236);
                            } else {
                                if (var234 == -1) {
                                    var236.field2610 = 0;
                                    field286 = -1;
                                    var1 = true;
                                    break label2831;
                                }
                                class45 var237 = class45.method114(var234);
                                var236.field2610 = 4;
                                var236.field2576 = var234;
                                var236.field2583 = var237.field1004;
                                var236.field2584 = var237.field1010;
                                var236.field2604 = var237.field1019 * 100 / var233;
                                method2520(var236);
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 193) {
                            int var239 = field284.method2171();
                            int var240 = field284.method2143();
                            class153 var241 = class153.method2702(var240);
                            if (var241.field2610 != 1 || var241.field2576 != var239) {
                                var241.field2610 = 1;
                                var241.field2576 = var239;
                                method2520(var241);
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 32) {
                            field436 = field303;
                            if (field285 == 0) {
                                field427 = null;
                                field465 = null;
                                Statics.field1856 = 0;
                                Statics.field174 = null;
                                field286 = -1;
                                var1 = true;
                            } else {
                                field465 = field284.method2146();
                                long var242 = field284.method2144();
                                long var244 = var242;
                                String var246;
                                if (var242 <= 0L || var242 >= 6582952005840035281L) {
                                    var246 = null;
                                } else if (var242 % 37L == 0L) {
                                    var246 = null;
                                } else {
                                    int var247 = 0;
                                    for (long var248 = var242; var248 != 0L; var248 /= 37L) {
                                        var247++;
                                    }
                                    StringBuilder var250 = new StringBuilder(var247);
                                    while (var244 != 0L) {
                                        long var251 = var244;
                                        var244 /= 37L;
                                        var250.append(class199.field2963[(int) (var251 - var244 * 37L)]);
                                    }
                                    var246 = var250.reverse().toString();
                                }
                                field427 = var246;
                                Statics.field155 = field284.method2139();
                                int var253 = field284.method2138();
                                if (var253 == 255) {
                                    field286 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field1856 = var253;
                                    class21[] var254 = new class21[100];
                                    for (int var255 = 0; var255 < Statics.field1856; var255++) {
                                        var254[var255] = new class21();
                                        var254[var255].field550 = field284.method2146();
                                        var254[var255].field559 = class201.method2843(var254[var255].field550, Statics.field777);
                                        var254[var255].field552 = field284.method2239();
                                        var254[var255].field553 = field284.method2139();
                                        field284.method2146();
                                        if (var254[var255].field550.equals(Statics.field590.field46)) {
                                            Statics.field2673 = var254[var255].field553;
                                        }
                                    }
                                    boolean var256 = false;
                                    int var257 = Statics.field1856;
                                    while (var257 > 0) {
                                        boolean var258 = true;
                                        var257--;
                                        for (int var259 = 0; var259 < var257; var259++) {
                                            if (var254[var259].field559.compareTo(var254[var259 + 1].field559) > 0) {
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
                                    Statics.field174 = var254;
                                    field286 = -1;
                                    var1 = true;
                                }
                            }
                            break label2831;
                        }
                        if (field286 == 85) {
                            method2705();
                            field309 = field284.method2138();
                            field437 = field303;
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 26) {
                            field401 = field284.method2239() * 30;
                            field437 = field303;
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 214) {
                            int var261 = field284.method2143();
                            class153 var262 = class153.method2702(var261);
                            var262.field2610 = 3;
                            var262.field2576 = Statics.field590.field29.method2957();
                            method2520(var262);
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 115) {
                            for (int var263 = 0; var263 < Statics.field1037; var263++) {
                                class46 var264 = class46.method127(var263);
                                if (var264 != null) {
                                    class155.field2669[var263] = 0;
                                    class155.field2670[var263] = 0;
                                }
                            }
                            method2705();
                            field469 += 32;
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 233) {
                            int var265 = field284.method2283();
                            int var266 = field284.method2242();
                            class153 var267 = class153.method2702(var266);
                            if (var267.field2622 != var265 || var265 == -1) {
                                var267.field2622 = var265;
                                var267.field2617 = 0;
                                var267.field2650 = 0;
                                method2520(var267);
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 4) {
                            int var268 = field284.method2239();
                            int var269 = field284.method2138();
                            int var270 = field284.method2239();
                            Statics.method2904(var268, var269, var270);
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 44) {
                            String var271 = field284.method2146();
                            Object[] var272 = new Object[var271.length() + 1];
                            for (int var273 = var271.length() - 1; var273 >= 0; var273--) {
                                if (var271.charAt(var273) == 's') {
                                    var272[var273 + 1] = field284.method2146();
                                } else {
                                    var272[var273 + 1] = Integer.valueOf(field284.method2143());
                                }
                            }
                            var272[0] = Integer.valueOf(field284.method2143());
                            class1 var274 = new class1();
                            var274.field7 = var272;
                            class32.method1424(var274);
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 98) {
                            class22 var275 = new class22();
                            var275.field565 = field284.method2146();
                            var275.field560 = field284.method2239();
                            int var276 = field284.method2143();
                            var275.field561 = var276;
                            method645(45);
                            Statics.field1933.method2584();
                            Statics.field1933 = null;
                            class28.method2359(var275);
                            field286 = -1;
                            var1 = false;
                            break label2831;
                        }
                        if (field286 == 164) {
                            int var277 = field284.method2143();
                            String var278 = field284.method2146();
                            class153 var279 = class153.method2702(var277);
                            if (!var278.equals(var279.field2590)) {
                                var279.field2590 = var278;
                                method2520(var279);
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 121 || field286 == 236 || field286 == 151 || field286 == 191 || field286 == 72 || field286 == 142 || field286 == 211 || field286 == 91 || field286 == 199 || field286 == 126) {
                            method454();
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 232) {
                            int var280 = field284.method2171();
                            int var281 = field284.method2182();
                            class153 var282 = class153.method2702(var281);
                            if (var282 != null && var282.field2545 == 0) {
                                if (var280 > var282.field2559 - var282.field2649) {
                                    var280 = var282.field2559 - var282.field2649;
                                }
                                if (var280 < 0) {
                                    var280 = 0;
                                }
                                if (var282.field2557 != var280) {
                                    var282.field2557 = var280;
                                    method2520(var282);
                                }
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 243) {
                            int var283 = field284.method2294();
                            String var284 = field284.method2146();
                            int var285 = field284.method2238();
                            if (var285 >= 1 && var285 <= 8) {
                                if (var284.equalsIgnoreCase("null")) {
                                    var284 = null;
                                }
                                field502[var285 - 1] = var284;
                                field372[var285 - 1] = var283 == 0;
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 16) {
                            int var286 = field284.method2171();
                            if (var286 == 65535) {
                                var286 = -1;
                            }
                            int var287 = field284.method2172();
                            if (var287 == 65535) {
                                var287 = -1;
                            }
                            int var288 = field284.method2242();
                            int var289 = field284.method2242();
                            for (int var290 = var286; var290 <= var287; var290++) {
                                long var291 = ((long) var289 << 32) + (long) var290;
                                class187 var293 = field444.method3244(var291);
                                if (var293 != null) {
                                    var293.method3365();
                                }
                                field444.method3253(new class180(var288), var291);
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 23) {
                            int var294 = field284.method2151();
                            boolean var295 = field284.method2138() == 1;
                            String var296 = "";
                            boolean var297 = false;
                            if (var295) {
                                var296 = field284.method2146();
                                if (method437(var296)) {
                                    var297 = true;
                                }
                            }
                            String var298 = field284.method2146();
                            if (!var297) {
                                class10.method132(var294, var296, var298);
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        if (field286 == 155) {
                            Statics.field146 = field284.method2294();
                            Statics.field698 = field284.method2138();
                            for (int var299 = Statics.field698; var299 < Statics.field698 + 8; var299++) {
                                for (int var300 = Statics.field146; var300 < Statics.field146 + 8; var300++) {
                                    if (field452[Statics.field224][var299][var300] != null) {
                                        field452[Statics.field224][var299][var300] = null;
                                        method1793(var299, var300);
                                    }
                                }
                            }
                            for (class15 var301 = (class15) field499.method3301(); var301 != null; var301 = (class15) field499.method3278()) {
                                if (var301.field195 >= Statics.field698 && var301.field195 < Statics.field698 + 8 && var301.field193 >= Statics.field146 && var301.field193 < Statics.field146 + 8 && Statics.field224 == var301.field209) {
                                    var301.field200 = 0;
                                }
                            }
                            field286 = -1;
                            var1 = true;
                            break label2831;
                        }
                        class135.method2083("" + field286 + class2.field17 + field326 + class2.field17 + field292 + class2.field17 + field285, (Throwable) null);
                        method2703();
                    } catch (IOException var429) {
                        method85();
                    } catch (Exception var430) {
                        String var304 = "" + field286 + class2.field17 + field326 + class2.field17 + field292 + class2.field17 + field285 + class2.field17 + (Statics.field1557 + Statics.field590.field765[0]) + class2.field17 + (Statics.field551 + Statics.field590.field769[0]) + class2.field17;
                        for (int var305 = 0; var305 < field285 && var305 < 50; var305++) {
                            var304 = var304 + field284.field1844[var305] + class2.field17;
                        }
                        class135.method2083(var304, var430);
                        method2703();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field416 != 30) {
            return;
        }
        while (true) {
            class189 var306 = (class189) class190.field2889.method3319();
            boolean var307;
            if (var306 == null) {
                var307 = false;
            } else {
                var307 = true;
            }
            if (!var307) {
                Object var309 = Statics.field2156.field166;
                synchronized (Statics.field2156.field166) {
                    if (!field240) {
                        Statics.field2156.field163 = 0;
                    } else if (class127.field2004 != 0 || Statics.field2156.field163 >= 40) {
                        field282.method2366(51);
                        field282.method2124(0);
                        int var310 = field282.field1838;
                        int var311 = 0;
                        for (int var312 = 0; var312 < Statics.field2156.field163 && field282.field1838 - var310 < 240; var312++) {
                            var311++;
                            int var313 = Statics.field2156.field168[var312];
                            if (var313 < 0) {
                                var313 = 0;
                            } else if (var313 > 502) {
                                var313 = 502;
                            }
                            int var314 = Statics.field2156.field161[var312];
                            if (var314 < 0) {
                                var314 = 0;
                            } else if (var314 > 764) {
                                var314 = 764;
                            }
                            int var315 = var313 * 765 + var314;
                            if (Statics.field2156.field168[var312] == -1 && Statics.field2156.field161[var312] == -1) {
                                var314 = -1;
                                var313 = -1;
                                var315 = 524287;
                            }
                            if (field341 != var314 || field438 != var313) {
                                int var316 = var314 - field341;
                                field341 = var314;
                                int var317 = var313 - field438;
                                field438 = var313;
                                if (field255 < 8 && var316 >= -32 && var316 <= 31 && var317 >= -32 && var317 <= 31) {
                                    var316 += 32;
                                    var317 += 32;
                                    field282.method2132((field255 << 12) + (var316 << 6) + var317);
                                    field255 = 0;
                                } else if (field255 < 8) {
                                    field282.method2126((field255 << 19) + 8388608 + var315);
                                    field255 = 0;
                                } else {
                                    field282.method2127((field255 << 19) + -1073741824 + var315);
                                    field255 = 0;
                                }
                            } else if (field255 < 2047) {
                                field255++;
                            }
                        }
                        field282.method2135(field282.field1838 - var310);
                        if (var311 >= Statics.field2156.field163) {
                            Statics.field2156.field163 = 0;
                        } else {
                            Statics.field2156.field163 -= var311;
                            for (int var318 = 0; var318 < Statics.field2156.field163; var318++) {
                                Statics.field2156.field161[var318] = Statics.field2156.field161[var311 + var318];
                                Statics.field2156.field168[var318] = Statics.field2156.field168[var311 + var318];
                            }
                        }
                    }
                }
                if (class127.field2004 == 1 || !Statics.field697 && class127.field2004 == 4 || class127.field2004 == 2) {
                    long var320 = (class127.field2016 - field307 * -1L) / 50L;
                    if (var320 > 4095L) {
                        var320 = 4095L;
                    }
                    field307 = class127.field2016 * -1L;
                    int var322 = class127.field2015;
                    if (var322 < 0) {
                        var322 = 0;
                    } else if (var322 > 502) {
                        var322 = 502;
                    }
                    int var323 = class127.field2013;
                    if (var323 < 0) {
                        var323 = 0;
                    } else if (var323 > 764) {
                        var323 = 764;
                    }
                    int var324 = var322 * 765 + var323;
                    byte var325 = 0;
                    if (class127.field2004 == 2) {
                        var325 = 1;
                    }
                    int var326 = (int) var320;
                    field282.method2366(160);
                    field282.method2127((var325 << 19) + (var326 << 20) + var324);
                }
                if (class124.field1973 > 0) {
                    field282.method2366(134);
                    field282.method2132(0);
                    int var327 = field282.field1838;
                    long var328 = class103.method16();
                    for (int var330 = 0; var330 < class124.field1973; var330++) {
                        long var331 = var328 - field463;
                        if (var331 > 16777215L) {
                            var331 = 16777215L;
                        }
                        field463 = var328;
                        field282.method2176((int) var331);
                        field282.method2124(class124.field1972[var330]);
                    }
                    field282.method2134(field282.field1838 - var327);
                }
                if (field291 > 0) {
                    field291--;
                }
                if (class124.field1977[96] || class124.field1977[97] || class124.field1977[98] || class124.field1977[99]) {
                    field400 = true;
                }
                if (field400 && field291 <= 0) {
                    field291 = 20;
                    field400 = false;
                    field282.method2366(101);
                    field282.method2132(field325);
                    field282.method2169(field464);
                }
                if (Statics.field221 && !field256) {
                    field256 = true;
                    field282.method2366(247);
                    field282.method2124(1);
                }
                if (!Statics.field221 && field256) {
                    field256 = false;
                    field282.method2366(247);
                    field282.method2124(0);
                }
                if (field246 && Statics.field224 != field449) {
                    method1374(Statics.field1855, Statics.field1260, Statics.field224, Statics.field590.field765[0], Statics.field590.field769[0]);
                } else if (Statics.field224 != field425) {
                    field425 = Statics.field224;
                    int var333 = Statics.field224;
                    int[] var334 = Statics.field1907.field1288;
                    int var335 = var334.length;
                    for (int var336 = 0; var336 < var335; var336++) {
                        var334[var336] = 0;
                    }
                    for (int var337 = 1; var337 < 103; var337++) {
                        int var338 = (103 - var337) * 2048 + 24628;
                        for (int var339 = 1; var339 < 103; var339++) {
                            if ((class6.field65[var333][var339][var337] & 0x18) == 0) {
                                Statics.field1562.method1777(var334, var338, 512, var333, var339, var337);
                            }
                            if (var333 < 3 && (class6.field65[var333 + 1][var339][var337] & 0x8) != 0) {
                                Statics.field1562.method1777(var334, var338, 512, var333 + 1, var339, var337);
                            }
                            var338 += 4;
                        }
                    }
                    int var340 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var341 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field1907.method1429();
                    for (int var342 = 1; var342 < 103; var342++) {
                        for (int var343 = 1; var343 < 103; var343++) {
                            if ((class6.field65[var333][var343][var342] & 0x18) == 0) {
                                method28(var333, var343, var342, var340, var341);
                            }
                            if (var333 < 3 && (class6.field65[var333 + 1][var343][var342] & 0x8) != 0) {
                                method28(var333 + 1, var343, var342, var340, var341);
                            }
                        }
                    }
                    field467 = 0;
                    for (int var344 = 0; var344 < 104; var344++) {
                        for (int var345 = 0; var345 < 104; var345++) {
                            int var346 = Statics.field1562.method1732(Statics.field224, var344, var345);
                            if (var346 != 0) {
                                int var347 = var346 >> 14 & 0x7FFF;
                                int var348 = class36.method525(var347).field854;
                                if (var348 >= 0) {
                                    int var349 = var344;
                                    int var350 = var345;
                                    if (var348 != 22 && var348 != 29 && var348 != 34 && var348 != 36 && var348 != 46 && var348 != 47 && var348 != 48) {
                                        int[][] var351 = field254[Statics.field224].field2961;
                                        for (int var352 = 0; var352 < 10; var352++) {
                                            int var353 = (int) (Math.random() * 4.0D);
                                            if (var353 == 0 && var349 > 0 && var349 > var344 - 3 && (var351[var349 - 1][var350] & 0x1240108) == 0) {
                                                var349--;
                                            }
                                            if (var353 == 1 && var349 < 103 && var349 < var344 + 3 && (var351[var349 + 1][var350] & 0x1240180) == 0) {
                                                var349++;
                                            }
                                            if (var353 == 2 && var350 > 0 && var350 > var345 - 3 && (var351[var349][var350 - 1] & 0x1240102) == 0) {
                                                var350--;
                                            }
                                            if (var353 == 3 && var350 < 103 && var350 < var345 + 3 && (var351[var349][var350 + 1] & 0x1240120) == 0) {
                                                var350++;
                                            }
                                        }
                                    }
                                    field470[field467] = Statics.field2828[var348];
                                    field468[field467] = var349;
                                    field412[field467] = var350;
                                    field467++;
                                }
                            }
                        }
                    }
                    Statics.field2431.method1412();
                }
                if (field416 != 30) {
                    return;
                }
                for (class15 var354 = (class15) field499.method3301(); var354 != null; var354 = (class15) field499.method3278()) {
                    if (var354.field200 > 0) {
                        var354.field200--;
                    }
                    if (var354.field200 == 0) {
                        if (var354.field197 >= 0) {
                            int var355 = var354.field197;
                            int var356 = var354.field199;
                            class36 var357 = class36.method525(var355);
                            if (var356 == 11) {
                                var356 = 10;
                            }
                            if (var356 >= 5 && var356 <= 8) {
                                var356 = 4;
                            }
                            boolean var358 = var357.method608(var356);
                            if (!var358) {
                                continue;
                            }
                        }
                        method2477(var354.field209, var354.field196, var354.field195, var354.field193, var354.field197, var354.field198, var354.field199);
                        var354.method3365();
                    } else {
                        if (var354.field203 > 0) {
                            var354.field203--;
                        }
                        if (var354.field203 == 0 && var354.field195 >= 1 && var354.field193 >= 1 && var354.field195 <= 102 && var354.field193 <= 102) {
                            if (var354.field207 >= 0) {
                                int var359 = var354.field207;
                                int var360 = var354.field202;
                                class36 var361 = class36.method525(var359);
                                if (var360 == 11) {
                                    var360 = 10;
                                }
                                if (var360 >= 5 && var360 <= 8) {
                                    var360 = 4;
                                }
                                boolean var362 = var361.method608(var360);
                                if (!var362) {
                                    continue;
                                }
                            }
                            method2477(var354.field209, var354.field196, var354.field195, var354.field193, var354.field207, var354.field201, var354.field202);
                            var354.field203 = -1;
                            if (var354.field207 == var354.field197 && var354.field197 == -1) {
                                var354.method3365();
                            } else if (var354.field207 == var354.field197 && var354.field201 == var354.field198 && var354.field202 == var354.field199) {
                                var354.method3365();
                            }
                        }
                    }
                }
                int var10002;
                for (int var363 = 0; var363 < field407; var363++) {
                    var10002 = field482[var363]--;
                    if (field482[var363] >= -10) {
                        class52 var365 = field344[var363];
                        if (var365 == null) {
                            class52 var431 = (class52) null;
                            var365 = class52.method1047(Statics.field1823, field496[var363], 0);
                            if (var365 == null) {
                                continue;
                            }
                            field482[var363] += var365.method1043();
                            field344[var363] = var365;
                        }
                        if (field482[var363] < 0) {
                            int var372;
                            if (field483[var363] == 0) {
                                var372 = field477;
                            } else {
                                int var366 = (field483[var363] & 0xFF) * 128;
                                int var367 = field483[var363] >> 16 & 0xFF;
                                int var368 = var367 * 128 + 64 - Statics.field590.field760;
                                if (var368 < 0) {
                                    var368 = -var368;
                                }
                                int var369 = field483[var363] >> 8 & 0xFF;
                                int var370 = var369 * 128 + 64 - Statics.field590.field716;
                                if (var370 < 0) {
                                    var370 = -var370;
                                }
                                int var371 = var368 + var370 - 128;
                                if (var371 > var366) {
                                    field482[var363] = -100;
                                    continue;
                                }
                                if (var371 < 0) {
                                    var371 = 0;
                                }
                                var372 = field429 * (var366 - var371) / var366;
                            }
                            if (var372 > 0) {
                                class56 var373 = var365.method1042().method1084(Statics.field2107);
                                class58 var374 = class58.method1109(var373, 100, var372);
                                var374.method1112(field481[var363] - 1);
                                Statics.field2152.method946(var374);
                            }
                            field482[var363] = -100;
                        }
                    } else {
                        field407--;
                        for (int var364 = var363; var364 < field407; var364++) {
                            field496[var364] = field496[var364 + 1];
                            field344[var364] = field344[var364 + 1];
                            field481[var364] = field481[var364 + 1];
                            field482[var364] = field482[var364 + 1];
                            field483[var364] = field483[var364 + 1];
                        }
                        var363--;
                    }
                }
                if (field276) {
                    boolean var375;
                    if (class162.field2723 == 0) {
                        var375 = Statics.field2720.method3085();
                    } else {
                        var375 = true;
                    }
                    if (!var375) {
                        if (field290 != 0 && field475 != -1) {
                            class162.method2875(Statics.field1550, field475, 0, field290, false);
                        }
                        field276 = false;
                    }
                }
                field287++;
                if (field287 > 750) {
                    method85();
                    return;
                }
                method78();
                method2327();
                for (int var376 = -1; var376 < field294; var376++) {
                    int var377;
                    if (var376 == -1) {
                        var377 = 2047;
                    } else {
                        var377 = field362[var376];
                    }
                    class3 var378 = field358[var377];
                    if (var378 != null && var378.field730 > 0) {
                        var378.field730--;
                        if (var378.field730 == 0) {
                            var378.field728 = null;
                        }
                    }
                }
                for (int var379 = 0; var379 < field280; var379++) {
                    int var380 = field281[var379];
                    class30 var381 = field279[var380];
                    if (var381 != null && var381.field730 > 0) {
                        var381.field730--;
                        if (var381.field730 == 0) {
                            var381.field728 = null;
                        }
                    }
                }
                field244++;
                if (field350 != 0) {
                    field349 += 20;
                    if (field349 >= 400) {
                        field350 = 0;
                    }
                }
                if (Statics.field90 != null) {
                    field420++;
                    if (field420 >= 15) {
                        method2520(Statics.field90);
                        Statics.field90 = null;
                    }
                }
                class153 var382 = Statics.field500;
                class153 var383 = Statics.field1649;
                Statics.field500 = null;
                Statics.field1649 = null;
                field418 = null;
                field422 = false;
                field419 = false;
                field353 = 0;
                while (class124.method2430() && field353 < 128) {
                    if (field409 >= 2 && class124.field1977[82] && Statics.field1922 == 66) {
                        String var384 = class10.method486();
                        Statics.field1529.setContents(new StringSelection(var384), (ClipboardOwner) null);
                    } else {
                        field462[field353] = Statics.field1922;
                        field461[field353] = Statics.field1805;
                        field353++;
                    }
                }
                method18(field402, 0, 0, 765, 503, 0, 0);
                field303++;
                while (true) {
                    class1 var385;
                    class153 var386;
                    class153 var387;
                    do {
                        var385 = (class1) field340.method3274();
                        if (var385 == null) {
                            while (true) {
                                class1 var388;
                                class153 var389;
                                class153 var390;
                                do {
                                    var388 = (class1) field443.method3274();
                                    if (var388 == null) {
                                        while (true) {
                                            class1 var391;
                                            class153 var392;
                                            class153 var393;
                                            do {
                                                var391 = (class1) field441.method3274();
                                                if (var391 == null) {
                                                    method1981();
                                                    if (field271 != null) {
                                                        method2551();
                                                    }
                                                    if (Statics.field24 != null) {
                                                        method2520(Statics.field24);
                                                        field328++;
                                                        if (class127.field2006 == 0) {
                                                            if (field357) {
                                                                if (Statics.field986 == Statics.field24 && field454 != field356) {
                                                                    class153 var394 = Statics.field24;
                                                                    byte var395 = 0;
                                                                    if (field405 == 1 && var394.field2628 == 206) {
                                                                        var395 = 1;
                                                                    }
                                                                    if (var394.field2645[field356] <= 0) {
                                                                        var395 = 0;
                                                                    }
                                                                    int var396 = method2591(var394);
                                                                    boolean var397 = (var396 >> 29 & 0x1) != 0;
                                                                    if (var397) {
                                                                        int var398 = field454;
                                                                        int var399 = field356;
                                                                        var394.field2645[var399] = var394.field2645[var398];
                                                                        var394.field2616[var399] = var394.field2616[var398];
                                                                        var394.field2645[var398] = -1;
                                                                        var394.field2616[var398] = 0;
                                                                    } else if (var395 == 1) {
                                                                        int var400 = field454;
                                                                        int var401 = field356;
                                                                        while (var400 != var401) {
                                                                            if (var400 > var401) {
                                                                                var394.method2881(var400 - 1, var400);
                                                                                var400--;
                                                                            } else if (var400 < var401) {
                                                                                var394.method2881(var400 + 1, var400);
                                                                                var400++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var394.method2881(field356, field454);
                                                                    }
                                                                    field282.method2366(174);
                                                                    field282.method2124(var395);
                                                                    field282.method2127(Statics.field24.field2543);
                                                                    field282.method2169(field454);
                                                                    field282.method2132(field356);
                                                                }
                                                            } else if ((field293 == 1 || method2383(field258 - 1)) && field258 > 2) {
                                                                method2076(field354, field355);
                                                            } else if (field258 > 0) {
                                                                method2601(field354, field355);
                                                            }
                                                            field420 = 10;
                                                            class127.field2004 = 0;
                                                            Statics.field24 = null;
                                                        } else if (field328 >= 5 && (class127.field2007 > field354 + 5 || class127.field2007 < field354 - 5 || class127.field2008 > field355 + 5 || class127.field2008 < field355 - 5)) {
                                                            field357 = true;
                                                        }
                                                    }
                                                    if (class79.field1369 != -1) {
                                                        int var402 = class79.field1369;
                                                        int var403 = class79.field1370;
                                                        field282.method2366(40);
                                                        field282.method2124(5);
                                                        field282.method2168(Statics.field551 + var403);
                                                        field282.method2270(class124.field1977[82] ? (class124.field1977[81] ? 2 : 1) : 0);
                                                        field282.method2169(Statics.field1557 + var402);
                                                        class79.field1369 = -1;
                                                        field296 = class127.field2013;
                                                        field348 = class127.field2015;
                                                        field350 = 1;
                                                        field349 = 0;
                                                        field471 = var402;
                                                        field472 = var403;
                                                    }
                                                    if (Statics.field500 != var382) {
                                                        if (var382 != null) {
                                                            method2520(var382);
                                                        }
                                                        if (Statics.field500 != null) {
                                                            method2520(Statics.field500);
                                                        }
                                                    }
                                                    if (Statics.field1649 != var383 && field394 == field393) {
                                                        if (var383 != null) {
                                                            method2520(var383);
                                                        }
                                                        if (Statics.field1649 != null) {
                                                            method2520(Statics.field1649);
                                                        }
                                                    }
                                                    if (Statics.field1649 == null) {
                                                        if (field393 > 0) {
                                                            field393--;
                                                        }
                                                    } else if (field393 < field394) {
                                                        field393++;
                                                        if (field394 == field393) {
                                                            method2520(Statics.field1649);
                                                        }
                                                    }
                                                    method3189();
                                                    if (field485) {
                                                        int var404 = Statics.field1866 * 128 + 64;
                                                        int var405 = Statics.field964 * 128 + 64;
                                                        int var406 = method2479(var404, var405, Statics.field224) - Statics.field1654;
                                                        if (Statics.field323 < var404) {
                                                            Statics.field323 += Statics.field1926 * (var404 - Statics.field323) / 1000 + Statics.field115;
                                                            if (Statics.field323 > var404) {
                                                                Statics.field323 = var404;
                                                            }
                                                        }
                                                        if (Statics.field323 > var404) {
                                                            Statics.field323 -= Statics.field1926 * (Statics.field323 - var404) / 1000 + Statics.field115;
                                                            if (Statics.field323 < var404) {
                                                                Statics.field323 = var404;
                                                            }
                                                        }
                                                        if (Statics.field1909 < var406) {
                                                            Statics.field1909 += Statics.field1926 * (var406 - Statics.field1909) / 1000 + Statics.field115;
                                                            if (Statics.field1909 > var406) {
                                                                Statics.field1909 = var406;
                                                            }
                                                        }
                                                        if (Statics.field1909 > var406) {
                                                            Statics.field1909 -= Statics.field1926 * (Statics.field1909 - var406) / 1000 + Statics.field115;
                                                            if (Statics.field1909 < var406) {
                                                                Statics.field1909 = var406;
                                                            }
                                                        }
                                                        if (Statics.field181 < var405) {
                                                            Statics.field181 += Statics.field1926 * (var405 - Statics.field181) / 1000 + Statics.field115;
                                                            if (Statics.field181 > var405) {
                                                                Statics.field181 = var405;
                                                            }
                                                        }
                                                        if (Statics.field181 > var405) {
                                                            Statics.field181 -= Statics.field1926 * (Statics.field181 - var405) / 1000 + Statics.field115;
                                                            if (Statics.field181 < var405) {
                                                                Statics.field181 = var405;
                                                            }
                                                        }
                                                        int var407 = Statics.field1428 * 128 + 64;
                                                        int var408 = Statics.field978 * 128 + 64;
                                                        int var409 = method2479(var407, var408, Statics.field224) - Statics.field1273;
                                                        int var410 = var407 - Statics.field323;
                                                        int var411 = var409 - Statics.field1909;
                                                        int var412 = var408 - Statics.field181;
                                                        int var413 = (int) Math.sqrt((double) (var410 * var410 + var412 * var412));
                                                        int var414 = (int) (Math.atan2((double) var411, (double) var413) * 325.949D) & 0x7FF;
                                                        int var415 = (int) (Math.atan2((double) var410, (double) var412) * -325.949D) & 0x7FF;
                                                        if (var414 < 128) {
                                                            var414 = 128;
                                                        }
                                                        if (var414 > 383) {
                                                            var414 = 383;
                                                        }
                                                        if (Statics.field165 < var414) {
                                                            Statics.field165 += Statics.field682 * (var414 - Statics.field165) / 1000 + Statics.field185;
                                                            if (Statics.field165 > var414) {
                                                                Statics.field165 = var414;
                                                            }
                                                        }
                                                        if (Statics.field165 > var414) {
                                                            Statics.field165 -= Statics.field682 * (Statics.field165 - var414) / 1000 + Statics.field185;
                                                            if (Statics.field165 < var414) {
                                                                Statics.field165 = var414;
                                                            }
                                                        }
                                                        int var416 = var415 - Statics.field1912;
                                                        if (var416 > 1024) {
                                                            var416 -= 2048;
                                                        }
                                                        if (var416 < -1024) {
                                                            var416 += 2048;
                                                        }
                                                        if (var416 > 0) {
                                                            Statics.field1912 += Statics.field682 * var416 / 1000 + Statics.field185;
                                                            Statics.field1912 &= 0x7FF;
                                                        }
                                                        if (var416 < 0) {
                                                            Statics.field1912 -= Statics.field682 * -var416 / 1000 + Statics.field185;
                                                            Statics.field1912 &= 0x7FF;
                                                        }
                                                        int var417 = var415 - Statics.field1912;
                                                        if (var417 > 1024) {
                                                            var417 -= 2048;
                                                        }
                                                        if (var417 < -1024) {
                                                            var417 += 2048;
                                                        }
                                                        if (var417 < 0 && var416 > 0 || var417 > 0 && var416 < 0) {
                                                            Statics.field1912 = var415;
                                                        }
                                                    }
                                                    for (int var418 = 0; var418 < 5; var418++) {
                                                        var10002 = field490[var418]++;
                                                    }
                                                    int var419 = ++class127.field2002 - 1;
                                                    int var421 = class124.field1980;
                                                    if (var419 > 15000 && var421 > 15000) {
                                                        field289 = 250;
                                                        class127.field2002 = 14500;
                                                        field282.method2366(142);
                                                    }
                                                    field310++;
                                                    if (field310 > 500) {
                                                        field310 = 0;
                                                        int var423 = (int) (Math.random() * 8.0D);
                                                        if ((var423 & 0x1) == 1) {
                                                            field304 += field305;
                                                        }
                                                        if ((var423 & 0x2) == 2) {
                                                            field306 += field376;
                                                        }
                                                        if ((var423 & 0x4) == 4) {
                                                            field448 += field263;
                                                        }
                                                    }
                                                    if (field304 < -50) {
                                                        field305 = 2;
                                                    }
                                                    if (field304 > 50) {
                                                        field305 = -2;
                                                    }
                                                    if (field306 < -55) {
                                                        field376 = 2;
                                                    }
                                                    if (field306 > 55) {
                                                        field376 = -2;
                                                    }
                                                    if (field448 < -40) {
                                                        field263 = 1;
                                                    }
                                                    if (field448 > 40) {
                                                        field263 = -1;
                                                    }
                                                    field315++;
                                                    if (field315 > 500) {
                                                        field315 = 0;
                                                        int var424 = (int) (Math.random() * 8.0D);
                                                        if ((var424 & 0x1) == 1) {
                                                            field318 += field312;
                                                        }
                                                        if ((var424 & 0x2) == 2) {
                                                            field313 += field314;
                                                        }
                                                    }
                                                    if (field318 < -60) {
                                                        field312 = 2;
                                                    }
                                                    if (field318 > 60) {
                                                        field312 = -2;
                                                    }
                                                    if (field313 < -20) {
                                                        field314 = 1;
                                                    }
                                                    if (field313 > 10) {
                                                        field314 = -1;
                                                    }
                                                    for (class34 var425 = (class34) field494.method3230(); var425 != null; var425 = (class34) field494.method3231()) {
                                                        if ((long) var425.field780 < class103.method16() / 1000L - 5L) {
                                                            if (var425.field776 > 0) {
                                                                class10.method132(5, "", var425.field778 + class143.field2312);
                                                            }
                                                            if (var425.field776 == 0) {
                                                                class10.method132(5, "", var425.field778 + class143.field2313);
                                                            }
                                                            var425.method3363();
                                                        }
                                                    }
                                                    field288++;
                                                    if (field288 > 50) {
                                                        field282.method2366(0);
                                                    }
                                                    try {
                                                        if (Statics.field1933 != null && field282.field1838 > 0) {
                                                            Statics.field1933.method2571(field282.field1844, 0, field282.field1838);
                                                            field282.field1838 = 0;
                                                            field288 = 0;
                                                        }
                                                    } catch (IOException var427) {
                                                        method85();
                                                    }
                                                    return;
                                                }
                                                var392 = var391.field3;
                                                if (var392.field2656 < 0) {
                                                    break;
                                                }
                                                var393 = class153.method2702(var392.field2554);
                                            } while (var393 == null || var393.field2560 == null || var392.field2656 >= var393.field2560.length || var393.field2560[var392.field2656] != var392);
                                            class32.method1424(var391);
                                        }
                                    }
                                    var389 = var388.field3;
                                    if (var389.field2656 < 0) {
                                        break;
                                    }
                                    var390 = class153.method2702(var389.field2554);
                                } while (var390 == null || var390.field2560 == null || var389.field2656 >= var390.field2560.length || var390.field2560[var389.field2656] != var389);
                                class32.method1424(var388);
                            }
                        }
                        var386 = var385.field3;
                        if (var386.field2656 < 0) {
                            break;
                        }
                        var387 = class153.method2702(var386.field2554);
                    } while (var387 == null || var387.field2560 == null || var386.field2656 >= var387.field2560.length || var387.field2560[var386.field2656] != var386);
                    class32.method1424(var385);
                }
            }
            field282.method2366(48);
            field282.method2124(0);
            int var308 = field282.field1838;
            class190.method664(field282);
            field282.method2135(field282.field1838 - var308);
        }
    }

    @ObfuscatedName("fy.f(I)V")
    public static final void method2977() {
        if (Statics.field783 != null) {
            Statics.field783.method1017();
        }
        if (Statics.field1233 != null) {
            Statics.field1233.method1017();
        }
    }

    @ObfuscatedName("o.ab(Lac;IIII)V")
    public static void method480(class38 arg0, int arg1, int arg2, int arg3) {
        if (field407 >= 50 || field429 == 0 || arg0.field893 == null || arg1 >= arg0.field893.length) {
            return;
        }
        int var4 = arg0.field893[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field496[field407] = var5;
        field481[field407] = var6;
        field482[field407] = 0;
        field344[field407] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field483[field407] = (var8 << 16) + (var9 << 8) + var7;
        field407++;
    }

    @ObfuscatedName("l.an(IS)V")
    public static void method77(int arg0) {
        if (arg0 == -1 && !field276) {
            class162.method464();
        } else if (arg0 != -1 && field475 != arg0 && field290 != 0 && !field276) {
            class148 var1 = Statics.field1550;
            int var2 = field290;
            class162.field2723 = 1;
            Statics.field2725 = var1;
            Statics.field2718 = arg0;
            Statics.field139 = 0;
            Statics.field1807 = var2;
            Statics.field1904 = false;
            Statics.field2724 = 2;
        }
        field475 = arg0;
    }

    @ObfuscatedName("fv.aw(B)V")
    public static final void method3189() {
        int var0 = field304 + Statics.field590.field760;
        int var1 = field306 + Statics.field590.field716;
        if (Statics.field567 - var0 < -500 || Statics.field567 - var0 > 500 || Statics.field1468 - var1 < -500 || Statics.field1468 - var1 > 500) {
            Statics.field567 = var0;
            Statics.field1468 = var1;
        }
        if (Statics.field567 != var0) {
            Statics.field567 += (var0 - Statics.field567) / 16;
        }
        if (Statics.field1468 != var1) {
            Statics.field1468 += (var1 - Statics.field1468) / 16;
        }
        if (class127.field2006 == 4 && Statics.field697) {
            int var2 = class127.field2008 - field329;
            field327 = var2 * 2;
            field329 = var2 == -1 || var2 == 1 ? class127.field2008 : (field329 + class127.field2008) / 2;
            int var3 = field252 - class127.field2007;
            field351 = var3 * 2;
            field252 = var3 == -1 || var3 == 1 ? class127.field2007 : (field252 + class127.field2007) / 2;
        } else {
            if (class124.field1977[96]) {
                field351 += (-24 - field351) / 2;
            } else if (class124.field1977[97]) {
                field351 += (24 - field351) / 2;
            } else {
                field351 /= 2;
            }
            if (class124.field1977[98]) {
                field327 += (12 - field327) / 2;
            } else if (class124.field1977[99]) {
                field327 += (-12 - field327) / 2;
            } else {
                field327 /= 2;
            }
            field329 = class127.field2008;
            field252 = class127.field2007;
        }
        field325 = field351 / 2 + field325 & 0x7FF;
        field464 += field327 / 2;
        if (field464 < 128) {
            field464 = 128;
        }
        if (field464 > 383) {
            field464 = 383;
        }
        int var4 = Statics.field567 >> 7;
        int var5 = Statics.field1468 >> 7;
        int var6 = method2479(Statics.field567, Statics.field1468, Statics.field224);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field224;
                    if (var10 < 3 && (class6.field65[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field73[var10][var8][var9];
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
        if (var12 > field332) {
            field332 += (var12 - field332) / 24;
        } else if (var12 < field332) {
            field332 += (var12 - field332) / 80;
        }
    }

    @ObfuscatedName("l.ar(I)V")
    public static final void method78() {
        for (int var0 = -1; var0 < field294; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field362[var0];
            }
            class3 var2 = field358[var1];
            if (var2 != null) {
                method2708(var2, 1);
            }
        }
    }

    @ObfuscatedName("dy.ai(B)V")
    public static final void method2327() {
        for (int var0 = 0; var0 < field280; var0++) {
            int var1 = field281[var0];
            class30 var2 = field279[var1];
            if (var2 != null) {
                method2708(var2, var2.field689.field790);
            }
        }
    }

    @ObfuscatedName("ey.aj(Laj;II)V")
    public static final void method2708(class33 arg0, int arg1) {
        if (arg0.field772 > field245) {
            int var2 = arg0.field772 - field245;
            int var3 = arg0.field755 * 128 + arg0.field747 * 64;
            int var4 = arg0.field747 * 64 + arg0.field717 * 128;
            arg0.field760 += (var3 - arg0.field760) / var2;
            arg0.field716 += (var4 - arg0.field716) / var2;
            arg0.field771 = 0;
            if (arg0.field761 == 0) {
                arg0.field764 = 1024;
            }
            if (arg0.field761 == 1) {
                arg0.field764 = 1536;
            }
            if (arg0.field761 == 2) {
                arg0.field764 = 0;
            }
            if (arg0.field761 == 3) {
                arg0.field764 = 512;
            }
        } else if (arg0.field770 >= field245) {
            if (field245 == arg0.field770 || arg0.field745 == -1 || arg0.field748 != 0 || arg0.field731 + 1 > class38.method29(arg0.field745).field892[arg0.field746]) {
                int var5 = arg0.field770 - arg0.field772;
                int var6 = field245 - arg0.field772;
                int var7 = arg0.field755 * 128 + arg0.field747 * 64;
                int var8 = arg0.field747 * 64 + arg0.field717 * 128;
                int var9 = arg0.field756 * 128 + arg0.field747 * 64;
                int var10 = arg0.field758 * 128 + arg0.field747 * 64;
                arg0.field760 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field716 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field771 = 0;
            if (arg0.field761 == 0) {
                arg0.field764 = 1024;
            }
            if (arg0.field761 == 1) {
                arg0.field764 = 1536;
            }
            if (arg0.field761 == 2) {
                arg0.field764 = 0;
            }
            if (arg0.field761 == 3) {
                arg0.field764 = 512;
            }
            arg0.field715 = arg0.field764;
        } else {
            arg0.field742 = arg0.field720;
            if (arg0.field741 == 0) {
                arg0.field771 = 0;
            } else {
                label360: {
                    if (arg0.field745 != -1 && arg0.field748 == 0) {
                        class38 var11 = class38.method29(arg0.field745);
                        if (arg0.field733 > 0 && var11.field901 == 0) {
                            arg0.field771++;
                            break label360;
                        }
                        if (arg0.field733 <= 0 && var11.field899 == 0) {
                            arg0.field771++;
                            break label360;
                        }
                    }
                    int var12 = arg0.field760;
                    int var13 = arg0.field716;
                    int var14 = arg0.field765[arg0.field741 - 1] * 128 + arg0.field747 * 64;
                    int var15 = arg0.field769[arg0.field741 - 1] * 128 + arg0.field747 * 64;
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        if (var12 < var14) {
                            if (var13 < var15) {
                                arg0.field764 = 1280;
                            } else if (var13 > var15) {
                                arg0.field764 = 1792;
                            } else {
                                arg0.field764 = 1536;
                            }
                        } else if (var12 > var14) {
                            if (var13 < var15) {
                                arg0.field764 = 768;
                            } else if (var13 > var15) {
                                arg0.field764 = 256;
                            } else {
                                arg0.field764 = 512;
                            }
                        } else if (var13 < var15) {
                            arg0.field764 = 1024;
                        } else if (var13 > var15) {
                            arg0.field764 = 0;
                        }
                        int var16 = arg0.field764 - arg0.field715 & 0x7FF;
                        if (var16 > 1024) {
                            var16 -= 2048;
                        }
                        int var17 = arg0.field724;
                        if (var16 >= -256 && var16 <= 256) {
                            var17 = arg0.field723;
                        } else if (var16 >= 256 && var16 < 768) {
                            var17 = arg0.field726;
                        } else if (var16 >= -768 && var16 <= -256) {
                            var17 = arg0.field725;
                        }
                        if (var17 == -1) {
                            var17 = arg0.field723;
                        }
                        arg0.field742 = var17;
                        int var18 = 4;
                        boolean var19 = true;
                        if (arg0 instanceof class30) {
                            var19 = ((class30) arg0).field689.field818;
                        }
                        if (var19) {
                            if (arg0.field764 != arg0.field715 && arg0.field739 == -1 && arg0.field766 != 0) {
                                var18 = 2;
                            }
                            if (arg0.field741 > 2) {
                                var18 = 6;
                            }
                            if (arg0.field741 > 3) {
                                var18 = 8;
                            }
                            if (arg0.field771 > 0 && arg0.field741 > 1) {
                                var18 = 8;
                                arg0.field771--;
                            }
                        } else {
                            if (arg0.field741 > 1) {
                                var18 = 6;
                            }
                            if (arg0.field741 > 2) {
                                var18 = 8;
                            }
                            if (arg0.field771 > 0 && arg0.field741 > 1) {
                                var18 = 8;
                                arg0.field771--;
                            }
                        }
                        if (arg0.field732[arg0.field741 - 1]) {
                            var18 <<= 0x1;
                        }
                        if (var18 >= 8 && arg0.field742 == arg0.field723 && arg0.field727 != -1) {
                            arg0.field742 = arg0.field727;
                        }
                        if (var12 < var14) {
                            arg0.field760 += var18;
                            if (arg0.field760 > var14) {
                                arg0.field760 = var14;
                            }
                        } else if (var12 > var14) {
                            arg0.field760 -= var18;
                            if (arg0.field760 < var14) {
                                arg0.field760 = var14;
                            }
                        }
                        if (var13 < var15) {
                            arg0.field716 += var18;
                            if (arg0.field716 > var15) {
                                arg0.field716 = var15;
                            }
                        } else if (var13 > var15) {
                            arg0.field716 -= var18;
                            if (arg0.field716 < var15) {
                                arg0.field716 = var15;
                            }
                        }
                        if (arg0.field760 == var14 && arg0.field716 == var15) {
                            arg0.field741--;
                            if (arg0.field733 > 0) {
                                arg0.field733--;
                            }
                        }
                    } else {
                        arg0.field760 = var14;
                        arg0.field716 = var15;
                    }
                }
            }
        }
        if (arg0.field760 < 128 || arg0.field716 < 128 || arg0.field760 >= 13184 || arg0.field716 >= 13184) {
            arg0.field745 = -1;
            arg0.field750 = -1;
            arg0.field772 = 0;
            arg0.field770 = 0;
            arg0.field760 = arg0.field765[0] * 128 + arg0.field747 * 64;
            arg0.field716 = arg0.field769[0] * 128 + arg0.field747 * 64;
            arg0.method551();
        }
        if (Statics.field590 == arg0 && (arg0.field760 < 1536 || arg0.field716 < 1536 || arg0.field760 >= 11776 || arg0.field716 >= 11776)) {
            arg0.field745 = -1;
            arg0.field750 = -1;
            arg0.field772 = 0;
            arg0.field770 = 0;
            arg0.field760 = arg0.field765[0] * 128 + arg0.field747 * 64;
            arg0.field716 = arg0.field769[0] * 128 + arg0.field747 * 64;
            arg0.method551();
        }
        if (arg0.field766 != 0) {
            if (arg0.field739 != -1 && arg0.field739 < 32768) {
                class30 var20 = field279[arg0.field739];
                if (var20 != null) {
                    int var21 = arg0.field760 - var20.field760;
                    int var22 = arg0.field716 - var20.field716;
                    if (var21 != 0 || var22 != 0) {
                        arg0.field764 = (int) (Math.atan2((double) var21, (double) var22) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field739 >= 32768) {
                int var23 = arg0.field739 - 32768;
                if (field366 == var23) {
                    var23 = 2047;
                }
                class3 var24 = field358[var23];
                if (var24 != null) {
                    int var25 = arg0.field760 - var24.field760;
                    int var26 = arg0.field716 - var24.field716;
                    if (var25 != 0 || var26 != 0) {
                        arg0.field764 = (int) (Math.atan2((double) var25, (double) var26) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field740 != 0 || arg0.field754 != 0) && (arg0.field741 == 0 || arg0.field771 > 0)) {
                int var27 = arg0.field760 - (arg0.field740 * 64 - Statics.field1557 * 64 - Statics.field1557 * 64);
                int var28 = arg0.field716 - (arg0.field754 * 64 - Statics.field551 * 64 - Statics.field551 * 64);
                if (var27 != 0 || var28 != 0) {
                    arg0.field764 = (int) (Math.atan2((double) var27, (double) var28) * 325.949D) & 0x7FF;
                }
                arg0.field740 = 0;
                arg0.field754 = 0;
            }
            int var29 = arg0.field764 - arg0.field715 & 0x7FF;
            if (var29 == 0) {
                arg0.field757 = 0;
            } else {
                arg0.field757++;
                if (var29 > 1024) {
                    arg0.field715 -= arg0.field766;
                    boolean var30 = true;
                    if (var29 < arg0.field766 || var29 > 2048 - arg0.field766) {
                        arg0.field715 = arg0.field764;
                        var30 = false;
                    }
                    if (arg0.field742 == arg0.field720 && (arg0.field757 > 25 || var30)) {
                        if (arg0.field721 == -1) {
                            arg0.field742 = arg0.field723;
                        } else {
                            arg0.field742 = arg0.field721;
                        }
                    }
                } else {
                    arg0.field715 += arg0.field766;
                    boolean var31 = true;
                    if (var29 < arg0.field766 || var29 > 2048 - arg0.field766) {
                        arg0.field715 = arg0.field764;
                        var31 = false;
                    }
                    if (arg0.field742 == arg0.field720 && (arg0.field757 > 25 || var31)) {
                        if (arg0.field722 == -1) {
                            arg0.field742 = arg0.field723;
                        } else {
                            arg0.field742 = arg0.field722;
                        }
                    }
                }
                arg0.field715 &= 0x7FF;
            }
        }
        method429(arg0);
    }

    @ObfuscatedName("client.ao(Laj;I)V")
    public static final void method429(class33 arg0) {
        arg0.field718 = false;
        if (arg0.field742 != -1) {
            class38 var1 = class38.method29(arg0.field742);
            if (var1 == null || var1.field890 == null) {
                arg0.field742 = -1;
            } else {
                arg0.field744++;
                if (arg0.field749 < var1.field890.length && arg0.field744 > var1.field892[arg0.field749]) {
                    arg0.field744 = 1;
                    arg0.field749++;
                    method480(var1, arg0.field749, arg0.field760, arg0.field716);
                }
                if (arg0.field749 >= var1.field890.length) {
                    arg0.field744 = 0;
                    arg0.field749 = 0;
                    method480(var1, arg0.field749, arg0.field760, arg0.field716);
                }
            }
        }
        if (arg0.field750 != -1 && field245 >= arg0.field753) {
            if (arg0.field743 < 0) {
                arg0.field743 = 0;
            }
            int var2 = class39.method2666(arg0.field750).field916;
            if (var2 == -1) {
                arg0.field750 = -1;
            } else {
                class38 var3 = class38.method29(var2);
                if (var3 == null || var3.field890 == null) {
                    arg0.field750 = -1;
                } else {
                    arg0.field752++;
                    if (arg0.field743 < var3.field890.length && arg0.field752 > var3.field892[arg0.field743]) {
                        arg0.field752 = 1;
                        arg0.field743++;
                        method480(var3, arg0.field743, arg0.field760, arg0.field716);
                    }
                    if (arg0.field743 >= var3.field890.length && (arg0.field743 < 0 || arg0.field743 >= var3.field890.length)) {
                        arg0.field750 = -1;
                    }
                }
            }
        }
        if (arg0.field745 != -1 && arg0.field748 <= 1) {
            class38 var4 = class38.method29(arg0.field745);
            if (var4.field901 == 1 && arg0.field733 > 0 && arg0.field772 <= field245 && arg0.field770 < field245) {
                arg0.field748 = 1;
                return;
            }
        }
        if (arg0.field745 != -1 && arg0.field748 == 0) {
            class38 var5 = class38.method29(arg0.field745);
            if (var5 == null || var5.field890 == null) {
                arg0.field745 = -1;
            } else {
                arg0.field731++;
                if (arg0.field746 < var5.field890.length && arg0.field731 > var5.field892[arg0.field746]) {
                    arg0.field731 = 1;
                    arg0.field746++;
                    method480(var5, arg0.field746, arg0.field760, arg0.field716);
                }
                if (arg0.field746 >= var5.field890.length) {
                    arg0.field746 -= var5.field894;
                    arg0.field767++;
                    if (arg0.field767 >= var5.field900) {
                        arg0.field745 = -1;
                    } else if (arg0.field746 >= 0 && arg0.field746 < var5.field890.length) {
                        method480(var5, arg0.field746, arg0.field760, arg0.field716);
                    } else {
                        arg0.field745 = -1;
                    }
                }
                arg0.field718 = var5.field896;
            }
        }
        if (arg0.field748 > 0) {
            arg0.field748--;
        }
    }

    @ObfuscatedName("fj.ap(Ls;III)V")
    public static void method3188(class3 arg0, int arg1, int arg2) {
        if (arg0.field745 == arg1 && arg1 != -1) {
            int var3 = class38.method29(arg1).field903;
            if (var3 == 1) {
                arg0.field746 = 0;
                arg0.field731 = 0;
                arg0.field748 = arg2;
                arg0.field767 = 0;
            }
            if (var3 == 2) {
                arg0.field767 = 0;
            }
        } else if (arg1 == -1 || arg0.field745 == -1 || class38.method29(arg1).field897 >= class38.method29(arg0.field745).field897) {
            arg0.field745 = arg1;
            arg0.field746 = 0;
            arg0.field731 = 0;
            arg0.field748 = arg2;
            arg0.field767 = 0;
            arg0.field733 = arg0.field741;
        }
    }

    @ObfuscatedName("av.as(Ljava/lang/String;ZI)V")
    public static final void method738(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1755.method3402(arg0, 250);
        int var6 = Statics.field1755.method3437(arg0, 250) * 13;
        class73.method1518(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class73.method1519(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1755.method3475(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method798(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field208.getGraphics();
                Statics.field2431.method1345(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field208.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field445; var13++) {
            if (field450[var13] + field379[var13] > var9 && field450[var13] < var9 + var11 && field453[var13] + field275[var13] > var10 && field275[var13] < var10 + var12) {
                field479[var13] = true;
            }
        }
    }

    @ObfuscatedName("cj.au(Lan;S)V")
    public static final void method2059(class29 arg0) {
        if (Statics.field590.field760 >> 7 == field471 && Statics.field590.field716 >> 7 == field472) {
            field471 = 0;
        }
        int var1 = field294;
        if (class29.field679 == arg0 || class29.field676 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class29.field679 == arg0) {
                var3 = Statics.field590;
                var4 = 33538048;
            } else if (class29.field676 == arg0) {
                var3 = field358[field374];
                var4 = field374 << 14;
            } else {
                var3 = field358[field362[var2]];
                var4 = field362[var2] << 14;
                if (class29.field678 == arg0 && field374 == field362[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method20() && !var3.field42) {
                var3.field45 = false;
                if ((field246 && field294 > 50 || field294 > 200) && class29.field679 != arg0 && var3.field742 == var3.field720) {
                    var3.field45 = true;
                }
                int var5 = var3.field760 >> 7;
                int var6 = var3.field716 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field40 == null || field245 < var3.field30 || field245 >= var3.field47) {
                        if ((var3.field760 & 0x7F) == 64 && (var3.field716 & 0x7F) == 64) {
                            if (field331 == field343[var5][var6]) {
                                continue;
                            }
                            field343[var5][var6] = field331;
                        }
                        var3.field34 = method2479(var3.field760, var3.field716, Statics.field224);
                        Statics.field1562.method1669(Statics.field224, var3.field760, var3.field716, var3.field34, 60, var3, var3.field715, var4, var3.field718);
                    } else {
                        var3.field45 = false;
                        var3.field34 = method2479(var3.field760, var3.field716, Statics.field224);
                        Statics.field1562.method1619(Statics.field224, var3.field760, var3.field716, var3.field34, 60, var3, var3.field715, var4, var3.field41, var3.field44, var3.field43, var3.field49);
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.ac(ZI)V")
    public static final void method143(boolean arg0) {
        for (int var1 = 0; var1 < field280; var1++) {
            class30 var2 = field279[field281[var1]];
            int var3 = (field281[var1] << 14) + 536870912;
            if (var2 != null && var2.method20() && var2.field689.field809 == arg0 && var2.field689.method580()) {
                int var4 = var2.field760 >> 7;
                int var5 = var2.field716 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field747 == 1 && (var2.field760 & 0x7F) == 64 && (var2.field716 & 0x7F) == 64) {
                        if (field331 == field343[var4][var5]) {
                            continue;
                        }
                        field343[var4][var5] = field331;
                    }
                    if (!var2.field689.field817) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1562.method1669(Statics.field224, var2.field760, var2.field716, method2479(var2.field760 + (var2.field747 * 64 - 64), var2.field716 + (var2.field747 * 64 - 64), Statics.field224), var2.field747 * 64 - 64 + 60, var2, var2.field715, var3, var2.field718);
                }
            }
        }
    }

    @ObfuscatedName("cv.ay(S)V")
    public static final void method1790() {
        for (class7 var0 = (class7) field377.method3301(); var0 != null; var0 = (class7) field377.method3278()) {
            if (Statics.field224 != var0.field101 || field245 > var0.field93) {
                var0.method3365();
            } else if (field245 >= var0.field104) {
                if (var0.field87 > 0) {
                    class30 var1 = field279[var0.field87 - 1];
                    if (var1 != null && var1.field760 >= 0 && var1.field760 < 13312 && var1.field716 >= 0 && var1.field716 < 13312) {
                        var0.method81(var1.field760, var1.field716, method2479(var1.field760, var1.field716, var0.field101) - var0.field91, field245);
                    }
                }
                if (var0.field87 < 0) {
                    int var2 = -var0.field87 - 1;
                    class3 var3;
                    if (field366 == var2) {
                        var3 = Statics.field590;
                    } else {
                        var3 = field358[var2];
                    }
                    if (var3 != null && var3.field760 >= 0 && var3.field760 < 13312 && var3.field716 >= 0 && var3.field716 < 13312) {
                        var0.method81(var3.field760, var3.field716, method2479(var3.field760, var3.field716, var0.field101) - var0.field91, field245);
                    }
                }
                var0.method82(field244);
                Statics.field1562.method1669(Statics.field224, (int) var0.field98, (int) var0.field99, (int) var0.field100, 60, var0, var0.field92, -1, false);
            }
        }
    }

    @ObfuscatedName("e.av(III)V")
    public static final void method87(int arg0, int arg1) {
        if (field259 == 2) {
            method1972((field262 - Statics.field1557 << 7) + field486, (field424 - Statics.field551 << 7) + field266, field264 * 2);
            if (field360 > -1 && field245 % 20 < 10) {
                Statics.field1252[0].method1439(field360 + arg0 - 12, field346 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("i.ak(Laj;IIIIII)V")
    public static final void method430(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method20()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field689;
            if (var6.field805 != null) {
                var6 = var6.method575();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field294) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field42) {
                return;
            }
            if (var8.field28 != -1 || var8.field35 != -1) {
                method5(arg0, arg0.field719 + 15);
                if (field360 > -1) {
                    if (var8.field28 != -1) {
                        Statics.field60[var8.field28].method1439(field360 + arg2 - 12, field346 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field35 != -1) {
                        Statics.field126[var8.field35].method1439(field360 + arg2 - 12, field346 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field259 == 10 && field261 == field362[arg1]) {
                method5(arg0, arg0.field719 + 15);
                if (field360 > -1) {
                    Statics.field1252[1].method1439(field360 + arg2 - 12, field346 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field689;
            if (var9.field805 != null) {
                var9 = var9.method575();
            }
            if (var9.field819 >= 0 && var9.field819 < Statics.field126.length) {
                method5(arg0, arg0.field719 + 15);
                if (field360 > -1) {
                    Statics.field126[var9.field819].method1439(field360 + arg2 - 12, field346 + arg3 - 30);
                }
            }
            if (field259 == 1 && field260 == field281[arg1 - field294] && field245 % 20 < 10) {
                method5(arg0, arg0.field719 + 15);
                if (field360 > -1) {
                    Statics.field1252[0].method1439(field360 + arg2 - 12, field346 + arg3 - 28);
                }
            }
        }
        if (arg0.field728 != null && (arg1 >= field294 || field495 == 4 || !arg0.field759 && (field495 == 0 || field495 == 3 || field495 == 1 && method483(((class3) arg0).field46, false)))) {
            method5(arg0, arg0.field719);
            if (field360 > -1 && field333 < field411) {
                field476[field333] = Statics.field503.method3400(arg0.field728) / 2;
                field337[field333] = Statics.field503.field2915;
                field335[field333] = field360;
                field460[field333] = field346;
                field339[field333] = arg0.field763;
                field345[field333] = arg0.field768;
                field338[field333] = arg0.field730;
                field342[field333] = arg0.field728;
                field333++;
            }
        }
        if (arg0.field736 > field245) {
            method5(arg0, arg0.field719 + 15);
            if (field360 > -1) {
                int var10;
                if (arg1 < field294) {
                    var10 = 30;
                } else {
                    class35 var11 = ((class30) arg0).field689;
                    var10 = var11.field820;
                }
                int var12 = arg0.field737 * var10 / arg0.field738;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field737 > 0) {
                    var12 = 1;
                }
                class73.method1518(field360 + arg2 - var10 / 2, field346 + arg3 - 3, var12, 5, 65280);
                class73.method1518(field360 + arg2 - var10 / 2 + var12, field346 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field735[var13] > field245) {
                method5(arg0, arg0.field719 / 2);
                if (field360 > -1) {
                    if (var13 == 1) {
                        field346 -= 20;
                    }
                    if (var13 == 2) {
                        field360 -= 15;
                        field346 -= 10;
                    }
                    if (var13 == 3) {
                        field360 += 15;
                        field346 -= 10;
                    }
                    Statics.field1329[arg0.field734[var13]].method1439(field360 + arg2 - 12, field346 + arg3 - 12);
                    Statics.field654.method3407(Integer.toString(arg0.field729[var13]), field360 + arg2 - 1, field346 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("k.ae(Laj;IB)V")
    public static final void method5(class33 arg0, int arg1) {
        method1972(arg0.field760, arg0.field716, arg1);
    }

    @ObfuscatedName("cu.at(IIII)V")
    public static final void method1972(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field360 = -1;
            field346 = -1;
            return;
        }
        int var3 = method2479(arg0, arg1, Statics.field224) - arg2;
        int var4 = arg0 - Statics.field323;
        int var5 = var3 - Statics.field1909;
        int var6 = arg1 - Statics.field181;
        int var7 = class84.field1435[Statics.field165];
        int var8 = class84.field1457[Statics.field165];
        int var9 = class84.field1435[Statics.field1912];
        int var10 = class84.field1457[Statics.field1912];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field360 = (var11 << 9) / var15 + 256;
            field346 = (var14 << 9) / var15 + 167;
        } else {
            field360 = -1;
            field346 = -1;
        }
    }

    @ObfuscatedName("do.az(IIII)I")
    public static final int method2479(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field65[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field73[var5][var3][var4] + class6.field73[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field73[var5][var3][var4 + 1] + class6.field73[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("dp.ag(IIIIIII)V")
    public static final void method2448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class84.field1435[var6];
            int var12 = class84.field1457[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class84.field1435[var7];
            int var15 = class84.field1457[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field323 = arg0 - var8;
        Statics.field1909 = arg1 - var9;
        Statics.field181 = arg2 - var10;
        Statics.field165 = arg3;
        Statics.field1912 = arg4;
    }

    @ObfuscatedName("v.af(ZB)V")
    public static final void method130(boolean arg0) {
        field301 = arg0;
        if (!field301) {
            int var1 = field284.method2239();
            int var2 = (field285 - field284.field1838) / 16;
            Statics.field1943 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    Statics.field1943[var3][var4] = field284.method2143();
                }
            }
            int var5 = field284.method2294();
            int var6 = field284.method2140();
            int var7 = field284.method2239();
            int var8 = field284.method2239();
            Statics.field907 = new int[var2];
            Statics.field121 = new int[var2];
            Statics.field902 = new int[var2];
            Statics.field774 = new byte[var2][];
            Statics.field2527 = new byte[var2][];
            boolean var9 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && var8 / 8 == 48) {
                var9 = true;
            }
            if (var7 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field907[var10] = var13;
                        Statics.field121[var10] = Statics.field26.method2743("m" + var11 + "_" + var12);
                        Statics.field902[var10] = Statics.field26.method2743("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method1374(var7, var8, var5, var1, var6);
            return;
        }
        int var14 = field284.method2140();
        int var15 = field284.method2239();
        int var16 = field284.method2294();
        field284.method2368();
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var18 = 0; var18 < 13; var18++) {
                for (int var19 = 0; var19 < 13; var19++) {
                    int var20 = field284.method2369(1);
                    if (var20 == 1) {
                        field302[var17][var18][var19] = field284.method2369(26);
                    } else {
                        field302[var17][var18][var19] = -1;
                    }
                }
            }
        }
        field284.method2370();
        int var21 = (field285 - field284.field1838) / 16;
        Statics.field1943 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var23 = 0; var23 < 4; var23++) {
                Statics.field1943[var22][var23] = field284.method2143();
            }
        }
        int var24 = field284.method2239();
        int var25 = field284.method2140();
        Statics.field907 = new int[var21];
        Statics.field121 = new int[var21];
        Statics.field902 = new int[var21];
        Statics.field774 = new byte[var21][];
        Statics.field2527 = new byte[var21][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field302[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field907[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field907[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field121[var26] = Statics.field26.method2743("m" + var35 + "_" + var36);
                            Statics.field902[var26] = Statics.field26.method2743("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method1374(var15, var25, var16, var14, var24);
    }

    @ObfuscatedName("by.am(IIIIII)V")
    public static final void method1374(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1855 == arg0 && Statics.field1260 == arg1 && field449 == arg2 || !field246) {
            return;
        }
        Statics.field1855 = arg0;
        Statics.field1260 = arg1;
        field449 = arg2;
        if (!field246) {
            field449 = 0;
        }
        method645(25);
        method738(class143.field2174, true);
        int var5 = Statics.field1557;
        int var6 = Statics.field551;
        Statics.field1557 = (arg0 - 6) * 8;
        Statics.field551 = (arg1 - 6) * 8;
        int var7 = Statics.field1557 - var5;
        int var8 = Statics.field551 - var6;
        int var9 = Statics.field1557;
        int var10 = Statics.field551;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = field279[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field765[var13] -= var7;
                    var12.field769[var13] -= var8;
                }
                var12.field760 -= var7 * 128;
                var12.field716 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field358[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field765[var16] -= var7;
                    var15.field769[var16] -= var8;
                }
                var15.field760 -= var7 * 128;
                var15.field716 -= var8 * 128;
            }
        }
        Statics.field224 = arg2;
        Statics.field590.method569(arg3, arg4, false);
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
                        field452[var27][var23][var24] = field452[var27][var25][var26];
                    } else {
                        field452[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) field499.method3301(); var28 != null; var28 = (class15) field499.method3278()) {
            var28.field195 -= var7;
            var28.field193 -= var8;
            if (var28.field195 < 0 || var28.field193 < 0 || var28.field195 >= 104 || var28.field193 >= 104) {
                var28.method3365();
            }
        }
        if (field471 != 0) {
            field471 -= var7;
            field472 -= var8;
        }
        field407 = 0;
        field485 = false;
        field425 = -1;
        field378.method3270();
        field377.method3270();
    }

    @ObfuscatedName("dr.ah(ZB)V")
    public static final void method2459(boolean arg0) {
        method2977();
        field288++;
        if (field288 < 50 && !arg0) {
            return;
        }
        field288 = 0;
        if (field434 || Statics.field1933 == null) {
            return;
        }
        field282.method2366(0);
        try {
            Statics.field1933.method2571(field282.field1844, 0, field282.field1838);
            field282.field1838 = 0;
        } catch (IOException var2) {
            field434 = true;
        }
    }

    @ObfuscatedName("s.aq(IIIIII)V")
    public static final void method28(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1562.method1633(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1562.method1637(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1907.field1288;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class36 var13 = class36.method525(var12);
            if (var13.field855 == -1) {
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
                class74 var14 = Statics.field572[var13.field855];
                if (var14 != null) {
                    int var15 = (var13.field835 * 4 - var14.field1302) / 2;
                    int var16 = (var13.field871 * 4 - var14.field1303) / 2;
                    var14.method1584(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field871) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1562.method1635(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1562.method1637(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class36 var22 = class36.method525(var21);
            if (var22.field855 != -1) {
                class74 var23 = Statics.field572[var22.field855];
                if (var23 != null) {
                    int var24 = (var22.field835 * 4 - var23.field1302) / 2;
                    int var25 = (var22.field871 * 4 - var23.field1303) / 2;
                    var23.method1584(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field871) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1907.field1288;
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
        int var29 = Statics.field1562.method1732(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class36 var31 = class36.method525(var30);
        if (var31.field855 == -1) {
            return;
        }
        class74 var32 = Statics.field572[var31.field855];
        if (var32 != null) {
            int var33 = (var31.field835 * 4 - var32.field1302) / 2;
            int var34 = (var31.field871 * 4 - var32.field1303) / 2;
            var32.method1584(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field871) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("b.ax(B)V")
    public static final void method454() {
        if (field286 == 236) {
            int var0 = field284.method2138();
            int var1 = (var0 >> 4 & 0x7) + Statics.field698;
            int var2 = (var0 & 0x7) + Statics.field146;
            int var3 = field284.method2239();
            int var4 = field284.method2239();
            int var5 = field284.method2239();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class178 var6 = field452[Statics.field224][var1][var2];
                if (var6 != null) {
                    for (class25 var7 = (class25) var6.method3301(); var7 != null; var7 = (class25) var6.method3278()) {
                        if ((var3 & 0x7FFF) == var7.field600 && var7.field605 == var4) {
                            var7.field605 = var5;
                            break;
                        }
                    }
                    method1793(var1, var2);
                }
            }
        } else if (field286 == 211) {
            int var8 = field284.method2171();
            int var9 = field284.method2138();
            int var10 = (var9 >> 4 & 0x7) + Statics.field698;
            int var11 = (var9 & 0x7) + Statics.field146;
            int var12 = field284.method2239();
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                class25 var13 = new class25();
                var13.field600 = var8;
                var13.field605 = var12;
                if (field452[Statics.field224][var10][var11] == null) {
                    field452[Statics.field224][var10][var11] = new class178();
                }
                field452[Statics.field224][var10][var11].method3271(var13);
                method1793(var10, var11);
            }
        } else if (field286 == 191) {
            int var14 = field284.method2138();
            int var15 = (var14 >> 4 & 0x7) + Statics.field698;
            int var16 = (var14 & 0x7) + Statics.field146;
            int var17 = field284.method2239();
            int var18 = field284.method2138();
            int var19 = field284.method2239();
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                int var20 = var15 * 128 + 64;
                int var21 = var16 * 128 + 64;
                class26 var22 = new class26(var17, Statics.field224, var20, var21, method2479(var20, var21, Statics.field224) - var18, var19, field245);
                field378.method3271(var22);
            }
        } else if (field286 == 72) {
            int var23 = field284.method2138();
            int var24 = (var23 >> 4 & 0x7) + Statics.field698;
            int var25 = (var23 & 0x7) + Statics.field146;
            int var26 = var24 + field284.method2139();
            int var27 = var25 + field284.method2139();
            int var28 = field284.method2283();
            int var29 = field284.method2239();
            int var30 = field284.method2138() * 4;
            int var31 = field284.method2138() * 4;
            int var32 = field284.method2239();
            int var33 = field284.method2239();
            int var34 = field284.method2138();
            int var35 = field284.method2138();
            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && var29 != 65535) {
                int var36 = var24 * 128 + 64;
                int var37 = var25 * 128 + 64;
                int var38 = var26 * 128 + 64;
                int var39 = var27 * 128 + 64;
                class7 var40 = new class7(var29, Statics.field224, var36, var37, method2479(var36, var37, Statics.field224) - var30, field245 + var32, field245 + var33, var34, var35, var28, var31);
                var40.method81(var38, var39, method2479(var38, var39, Statics.field224) - var31, field245 + var32);
                field377.method3271(var40);
            }
        } else if (field286 == 126) {
            int var41 = field284.method2138();
            int var42 = var41 >> 2;
            int var43 = var41 & 0x3;
            int var44 = field447[var42];
            int var45 = field284.method2238();
            int var46 = (var45 >> 4 & 0x7) + Statics.field698;
            int var47 = (var45 & 0x7) + Statics.field146;
            int var48 = field284.method2140();
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                method811(Statics.field224, var46, var47, var44, var48, var42, var43, 0, -1);
            }
        } else {
            if (field286 == 121) {
                int var49 = field284.method2138();
                int var50 = (var49 >> 4 & 0x7) + Statics.field698;
                int var51 = (var49 & 0x7) + Statics.field146;
                int var52 = field284.method2239();
                int var53 = field284.method2138();
                int var54 = var53 >> 4 & 0xF;
                int var55 = var53 & 0x7;
                int var56 = field284.method2138();
                if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                    int var57 = var54 + 1;
                    if (Statics.field590.field765[0] >= var50 - var57 && Statics.field590.field765[0] <= var50 + var57 && Statics.field590.field769[0] >= var51 - var57 && Statics.field590.field769[0] <= var51 + var57 && field429 != 0 && var55 > 0 && field407 < 50) {
                        field496[field407] = var52;
                        field481[field407] = var55;
                        field482[field407] = var56;
                        field344[field407] = null;
                        field483[field407] = (var50 << 16) + (var51 << 8) + var54;
                        field407++;
                    }
                }
            }
            if (field286 == 91) {
                int var58 = field284.method2138();
                int var59 = (var58 >> 4 & 0x7) + Statics.field698;
                int var60 = (var58 & 0x7) + Statics.field146;
                int var61 = field284.method2172();
                int var62 = field284.method2294();
                int var63 = var62 >> 2;
                int var64 = var62 & 0x3;
                int var65 = field447[var63];
                if (var59 >= 0 && var60 >= 0 && var59 < 103 && var60 < 103) {
                    if (var65 == 0) {
                        class80 var66 = Statics.field1562.method1748(Statics.field224, var59, var60);
                        if (var66 != null) {
                            int var67 = var66.field1403 >> 14 & 0x7FFF;
                            if (var63 == 2) {
                                var66.field1401 = new class11(var67, 2, var64 + 4, Statics.field224, var59, var60, var61, false, var66.field1401);
                                var66.field1399 = new class11(var67, 2, var64 + 1 & 0x3, Statics.field224, var59, var60, var61, false, var66.field1399);
                            } else {
                                var66.field1401 = new class11(var67, var63, var64, Statics.field224, var59, var60, var61, false, var66.field1401);
                            }
                        }
                    }
                    if (var65 == 1) {
                        class87 var68 = Statics.field1562.method1630(Statics.field224, var59, var60);
                        if (var68 != null) {
                            int var69 = var68.field1482 >> 14 & 0x7FFF;
                            if (var63 == 4 || var63 == 5) {
                                var68.field1477 = new class11(var69, 4, var64, Statics.field224, var59, var60, var61, false, var68.field1477);
                            } else if (var63 == 6) {
                                var68.field1477 = new class11(var69, 4, var64 + 4, Statics.field224, var59, var60, var61, false, var68.field1477);
                            } else if (var63 == 7) {
                                var68.field1477 = new class11(var69, 4, (var64 + 2 & 0x3) + 4, Statics.field224, var59, var60, var61, false, var68.field1477);
                            } else if (var63 == 8) {
                                var68.field1477 = new class11(var69, 4, var64 + 4, Statics.field224, var59, var60, var61, false, var68.field1477);
                                var68.field1478 = new class11(var69, 4, (var64 + 2 & 0x3) + 4, Statics.field224, var59, var60, var61, false, var68.field1478);
                            }
                        }
                    }
                    if (var65 == 2) {
                        class91 var70 = Statics.field1562.method1686(Statics.field224, var59, var60);
                        if (var63 == 11) {
                            var63 = 10;
                        }
                        if (var70 != null) {
                            var70.field1545 = new class11(var70.field1541 >> 14 & 0x7FFF, var63, var64, Statics.field224, var59, var60, var61, false, var70.field1545);
                        }
                    }
                    if (var65 == 3) {
                        class86 var71 = Statics.field1562.method1640(Statics.field224, var59, var60);
                        if (var71 != null) {
                            var71.field1465 = new class11(var71.field1458 >> 14 & 0x7FFF, 22, var64, Statics.field224, var59, var60, var61, false, var71.field1465);
                        }
                    }
                }
            } else {
                if (field286 == 151) {
                    byte var72 = field284.method2243();
                    int var73 = field284.method2138();
                    int var74 = (var73 >> 4 & 0x7) + Statics.field698;
                    int var75 = (var73 & 0x7) + Statics.field146;
                    int var76 = field284.method2172();
                    int var77 = field284.method2239();
                    byte var78 = field284.method2167();
                    int var79 = field284.method2305();
                    int var80 = var79 >> 2;
                    int var81 = var79 & 0x3;
                    int var82 = field447[var80];
                    int var83 = field284.method2171();
                    byte var84 = field284.method2139();
                    int var85 = field284.method2172();
                    byte var86 = field284.method2139();
                    class3 var87;
                    if (field366 == var76) {
                        var87 = Statics.field590;
                    } else {
                        var87 = field358[var76];
                    }
                    if (var87 != null) {
                        class36 var88 = class36.method525(var83);
                        int var89;
                        int var90;
                        if (var81 == 1 || var81 == 3) {
                            var89 = var88.field871;
                            var90 = var88.field835;
                        } else {
                            var89 = var88.field835;
                            var90 = var88.field871;
                        }
                        int var91 = (var89 >> 1) + var74;
                        int var92 = (var89 + 1 >> 1) + var74;
                        int var93 = (var90 >> 1) + var75;
                        int var94 = (var90 + 1 >> 1) + var75;
                        int[][] var95 = class6.field73[Statics.field224];
                        int var96 = var95[var91][var93] + var95[var92][var93] + var95[var91][var94] + var95[var92][var94] >> 2;
                        int var97 = (var74 << 7) + (var89 << 6);
                        int var98 = (var75 << 7) + (var90 << 6);
                        class98 var99 = var88.method611(var80, var81, var95, var97, var96, var98);
                        if (var99 != null) {
                            method811(Statics.field224, var74, var75, var82, -1, 0, 0, var77 + 1, var85 + 1);
                            var87.field30 = field245 + var77;
                            var87.field47 = field245 + var85;
                            var87.field40 = var99;
                            var87.field37 = var74 * 128 + var89 * 64;
                            var87.field39 = var75 * 128 + var90 * 64;
                            var87.field38 = var96;
                            if (var78 > var84) {
                                byte var100 = var78;
                                var78 = var84;
                                var84 = var100;
                            }
                            if (var72 > var86) {
                                byte var101 = var72;
                                var72 = var86;
                                var86 = var101;
                            }
                            var87.field41 = var74 + var78;
                            var87.field43 = var74 + var84;
                            var87.field44 = var72 + var75;
                            var87.field49 = var75 + var86;
                        }
                    }
                }
                if (field286 == 199) {
                    int var102 = field284.method2138();
                    int var103 = (var102 >> 4 & 0x7) + Statics.field698;
                    int var104 = (var102 & 0x7) + Statics.field146;
                    int var105 = field284.method2138();
                    int var106 = var105 >> 2;
                    int var107 = var105 & 0x3;
                    int var108 = field447[var106];
                    if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                        method811(Statics.field224, var103, var104, var108, -1, var106, var107, 0, -1);
                    }
                } else if (field286 == 142) {
                    int var109 = field284.method2239();
                    int var110 = field284.method2138();
                    int var111 = (var110 >> 4 & 0x7) + Statics.field698;
                    int var112 = (var110 & 0x7) + Statics.field146;
                    if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                        class178 var113 = field452[Statics.field224][var111][var112];
                        if (var113 != null) {
                            for (class25 var114 = (class25) var113.method3301(); var114 != null; var114 = (class25) var113.method3278()) {
                                if ((var109 & 0x7FFF) == var114.field600) {
                                    var114.method3365();
                                    break;
                                }
                            }
                            if (var113.method3301() == null) {
                                field452[Statics.field224][var111][var112] = null;
                            }
                            method1793(var111, var112);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.ad(IIIIIIIIIB)V")
    public static final void method811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class15 var9 = null;
        for (class15 var10 = (class15) field499.method3301(); var10 != null; var10 = (class15) field499.method3278()) {
            if (var10.field209 == arg0 && var10.field195 == arg1 && var10.field193 == arg2 && var10.field196 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class15();
            var9.field209 = arg0;
            var9.field196 = arg3;
            var9.field195 = arg1;
            var9.field193 = arg2;
            method1601(var9);
            field499.method3271(var9);
        }
        var9.field207 = arg4;
        var9.field202 = arg5;
        var9.field201 = arg6;
        var9.field203 = arg7;
        var9.field200 = arg8;
    }

    @ObfuscatedName("bw.aa(La;I)V")
    public static final void method1601(class15 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field196 == 0) {
            var1 = Statics.field1562.method1633(arg0.field209, arg0.field195, arg0.field193);
        }
        if (arg0.field196 == 1) {
            var1 = Statics.field1562.method1634(arg0.field209, arg0.field195, arg0.field193);
        }
        if (arg0.field196 == 2) {
            var1 = Statics.field1562.method1635(arg0.field209, arg0.field195, arg0.field193);
        }
        if (arg0.field196 == 3) {
            var1 = Statics.field1562.method1732(arg0.field209, arg0.field195, arg0.field193);
        }
        if (var1 != 0) {
            int var5 = Statics.field1562.method1637(arg0.field209, arg0.field195, arg0.field193, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field197 = var2;
        arg0.field199 = var3;
        arg0.field198 = var4;
    }

    @ObfuscatedName("dc.bm(IIIIIIII)V")
    public static final void method2477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field246 && Statics.field224 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1562.method1633(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1562.method1634(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1562.method1635(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1562.method1732(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1562.method1637(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1562.method1624(arg0, arg2, arg3);
                class36 var15 = class36.method525(var12);
                if (var15.field843 != 0) {
                    field254[arg0].method3545(arg2, arg3, var13, var14, var15.field844);
                }
            }
            if (arg1 == 1) {
                Statics.field1562.method1625(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1562.method1626(arg0, arg2, arg3);
                class36 var16 = class36.method525(var12);
                if (var16.field835 + arg2 > 103 || var16.field835 + arg3 > 103 || var16.field871 + arg2 > 103 || var16.field871 + arg3 > 103) {
                    return;
                }
                if (var16.field843 != 0) {
                    field254[arg0].method3553(arg2, arg3, var16.field835, var16.field871, var14, var16.field844);
                }
            }
            if (arg1 == 3) {
                Statics.field1562.method1627(arg0, arg2, arg3);
                class36 var17 = class36.method525(var12);
                if (var17.field843 == 1) {
                    field254[arg0].method3555(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field65[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method566(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field1562, field254[arg0]);
    }

    @ObfuscatedName("cv.bg(III)V")
    public static final void method1793(int arg0, int arg1) {
        class178 var2 = field452[Statics.field224][arg0][arg1];
        if (var2 == null) {
            Statics.field1562.method1670(Statics.field224, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class25 var5 = null;
        for (class25 var6 = (class25) var2.method3301(); var6 != null; var6 = (class25) var2.method3278()) {
            class45 var7 = class45.method114(var6.field600);
            long var8 = (long) var7.field989;
            if (var7.field991 == 1) {
                var8 = (long) (var6.field605 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1562.method1670(Statics.field224, arg0, arg1);
            return;
        }
        var2.method3294(var5);
        class25 var10 = null;
        class25 var11 = null;
        for (class25 var12 = (class25) var2.method3301(); var12 != null; var12 = (class25) var2.method3278()) {
            if (var5.field600 != var12.field600) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field600 != var12.field600 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1562.method1638(Statics.field224, arg0, arg1, method2479(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field224), var5, var13, var10, var11);
    }

    @ObfuscatedName("al.bf(S)V")
    public static final void method528() {
        field368 = 0;
        field363 = 0;
        method573();
        while (field284.method2371(field285) >= 27) {
            int var0 = field284.method2369(15);
            if (var0 == 32767) {
                break;
            }
            boolean var4 = false;
            if (field279[var0] == null) {
                field279[var0] = new class30();
                var4 = true;
            }
            class30 var5 = field279[var0];
            field281[++field280 - 1] = var0;
            var5.field762 = field245;
            var5.field689 = class35.method2397(field284.method2369(14));
            int var6 = field284.method2369(1);
            int var7 = field284.method2369(5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = field284.method2369(5);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = field284.method2369(1);
            if (var9 == 1) {
                field364[++field363 - 1] = var0;
            }
            int var10 = field373[field284.method2369(3)];
            if (var4) {
                var5.field764 = var5.field715 = var10;
            }
            var5.field747 = var5.field689.field790;
            var5.field766 = var5.field689.field814;
            if (var5.field766 == 0) {
                var5.field715 = 0;
            }
            var5.field723 = var5.field689.field815;
            var5.field724 = var5.field689.field812;
            var5.field725 = var5.field689.field798;
            var5.field726 = var5.field689.field784;
            var5.field720 = var5.field689.field793;
            var5.field721 = var5.field689.field794;
            var5.field722 = var5.field689.field795;
            var5.method569(Statics.field590.field765[0] + var8, Statics.field590.field769[0] + var7, var6 == 1);
        }
        field284.method2370();
        method1887();
        for (int var1 = 0; var1 < field368; var1++) {
            int var2 = field369[var1];
            if (field245 != field279[var2].field762) {
                field279[var2].field689 = null;
                field279[var2] = null;
            }
        }
        if (field285 != field284.field1838) {
            throw new RuntimeException(field284.field1838 + class2.field17 + field285);
        }
        for (int var3 = 0; var3 < field280; var3++) {
            if (field279[field281[var3]] == null) {
                throw new RuntimeException(var3 + class2.field17 + field280);
            }
        }
    }

    @ObfuscatedName("ao.bo(I)V")
    public static final void method573() {
        field284.method2368();
        int var0 = field284.method2369(8);
        if (var0 < field280) {
            for (int var1 = var0; var1 < field280; var1++) {
                field369[++field368 - 1] = field281[var1];
            }
        }
        if (var0 > field280) {
            throw new RuntimeException("");
        }
        field280 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field281[var2];
            class30 var4 = field279[var3];
            int var5 = field284.method2369(1);
            if (var5 == 0) {
                field281[++field280 - 1] = var3;
                var4.field762 = field245;
            } else {
                int var6 = field284.method2369(2);
                if (var6 == 0) {
                    field281[++field280 - 1] = var3;
                    var4.field762 = field245;
                    field364[++field363 - 1] = var3;
                } else if (var6 == 1) {
                    field281[++field280 - 1] = var3;
                    var4.field762 = field245;
                    int var7 = field284.method2369(3);
                    var4.method550(var7, false);
                    int var8 = field284.method2369(1);
                    if (var8 == 1) {
                        field364[++field363 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field281[++field280 - 1] = var3;
                    var4.field762 = field245;
                    int var9 = field284.method2369(3);
                    var4.method550(var9, true);
                    int var10 = field284.method2369(3);
                    var4.method550(var10, true);
                    int var11 = field284.method2369(1);
                    if (var11 == 1) {
                        field364[++field363 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field369[++field368 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ci.bk(I)V")
    public static final void method1887() {
        for (int var0 = 0; var0 < field363; var0++) {
            int var1 = field364[var0];
            class30 var2 = field279[var1];
            int var3 = field284.method2138();
            if ((var3 & 0x20) != 0) {
                int var4 = field284.method2305();
                int var5 = field284.method2305();
                var2.method553(var4, var5, field245);
                var2.field736 = field245 + 300;
                var2.field737 = field284.method2239();
                var2.field738 = field284.method2171();
            }
            if ((var3 & 0x8) != 0) {
                var2.field728 = field284.method2146();
                var2.field730 = 100;
            }
            if ((var3 & 0x1) != 0) {
                var2.field750 = field284.method2171();
                int var6 = field284.method2181();
                var2.field751 = var6 >> 16;
                var2.field753 = (var6 & 0xFFFF) + field245;
                var2.field743 = 0;
                var2.field752 = 0;
                if (var2.field753 > field245) {
                    var2.field743 = -1;
                }
                if (var2.field750 == 65535) {
                    var2.field750 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field739 = field284.method2171();
                if (var2.field739 == 65535) {
                    var2.field739 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field740 = field284.method2171();
                var2.field754 = field284.method2239();
            }
            if ((var3 & 0x40) != 0) {
                var2.field689 = class35.method2397(field284.method2239());
                var2.field747 = var2.field689.field790;
                var2.field766 = var2.field689.field814;
                var2.field723 = var2.field689.field815;
                var2.field724 = var2.field689.field812;
                var2.field725 = var2.field689.field798;
                var2.field726 = var2.field689.field784;
                var2.field720 = var2.field689.field793;
                var2.field721 = var2.field689.field794;
                var2.field722 = var2.field689.field795;
            }
            if ((var3 & 0x4) != 0) {
                int var7 = field284.method2171();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field284.method2294();
                if (var2.field745 == var7 && var7 != -1) {
                    int var9 = class38.method29(var7).field903;
                    if (var9 == 1) {
                        var2.field746 = 0;
                        var2.field731 = 0;
                        var2.field748 = var8;
                        var2.field767 = 0;
                    }
                    if (var9 == 2) {
                        var2.field767 = 0;
                    }
                } else if (var7 == -1 || var2.field745 == -1 || class38.method29(var7).field897 >= class38.method29(var2.field745).field897) {
                    var2.field745 = var7;
                    var2.field746 = 0;
                    var2.field731 = 0;
                    var2.field748 = var8;
                    var2.field767 = 0;
                    var2.field733 = var2.field741;
                }
            }
            if ((var3 & 0x10) != 0) {
                int var10 = field284.method2305();
                int var11 = field284.method2238();
                var2.method553(var10, var11, field245);
                var2.field736 = field245 + 300;
                var2.field737 = field284.method2172();
                var2.field738 = field284.method2172();
            }
        }
    }

    @ObfuscatedName("ay.br(I)V")
    public static final void method724() {
        int var0 = Statics.field2116;
        int var1 = Statics.field1857;
        int var2 = Statics.field1251;
        int var3 = Statics.field1878;
        int var4 = 6116423;
        class73.method1518(var0, var1, var2, var3, var4);
        class73.method1518(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class73.method1519(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field503.method3405(class143.field2394, var0 + 3, var1 + 14, var4, -1);
        int var5 = class127.field2007;
        int var6 = class127.field2008;
        for (int var7 = 0; var7 < field258; var7++) {
            int var8 = (field258 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field503.method3405(method654(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field2116;
        int var11 = Statics.field1857;
        int var12 = Statics.field1251;
        int var13 = Statics.field1878;
        for (int var14 = 0; var14 < field445; var14++) {
            if (field450[var14] + field379[var14] > var10 && field450[var14] < var10 + var12 && field453[var14] + field275[var14] > var11 && field275[var14] < var11 + var13) {
                field479[var14] = true;
            }
        }
    }

    @ObfuscatedName("ae.bd(IIIIB)V")
    public static final void method798(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field445; var4++) {
            if (field450[var4] + field379[var4] > arg0 && field450[var4] < arg0 + arg2 && field453[var4] + field275[var4] > arg1 && field275[var4] < arg1 + arg3) {
                field375[var4] = true;
            }
        }
    }

    @ObfuscatedName("ct.bl(I)V")
    public static final void method1981() {
        method2398();
        if (Statics.field24 != null || field271 != null) {
            return;
        }
        int var12;
        int var13;
        label196: {
            int var0 = class127.field2004;
            if (field383) {
                if (var0 != 1 && (Statics.field697 || var0 != 4)) {
                    int var1 = class127.field2007;
                    int var2 = class127.field2008;
                    if (var1 < Statics.field2116 - 10 || var1 > Statics.field2116 + Statics.field1251 + 10 || var2 < Statics.field1857 - 10 || var2 > Statics.field1878 + Statics.field1857 + 10) {
                        field383 = false;
                        method798(Statics.field2116, Statics.field1857, Statics.field1251, Statics.field1878);
                    }
                }
                if (var0 == 1 || !Statics.field697 && var0 == 4) {
                    int var3 = Statics.field2116;
                    int var4 = Statics.field1857;
                    int var5 = Statics.field1251;
                    int var6 = class127.field2013;
                    int var7 = class127.field2015;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field258; var9++) {
                        int var10 = (field258 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method2424(var8);
                    }
                    field383 = false;
                    method798(Statics.field2116, Statics.field1857, Statics.field1251, Statics.field1878);
                }
            } else {
                if ((var0 == 1 || !Statics.field697 && var0 == 4) && field258 > 0) {
                    int var11 = field387[field258 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field390[field258 - 1];
                        var13 = field330[field258 - 1];
                        class153 var14 = class153.method2702(var13);
                        if (class157.method144(method2591(var14))) {
                            break label196;
                        }
                        int var15 = method2591(var14);
                        boolean var16 = (var15 >> 29 & 0x1) != 0;
                        if (var16) {
                            break label196;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field697 && var0 == 4) && (field293 == 1 && field258 > 2 || method2383(field258 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field697 && var0 == 4) && field258 > 0) {
                    method2424(field258 - 1);
                }
                if (var0 == 2 && field258 > 0) {
                    method2076(class127.field2013, class127.field2015);
                }
            }
            return;
        }
        if (Statics.field24 != null && !field357 && field293 != 1 && !method2383(field258 - 1) && field258 > 0) {
            method2601(field354, field355);
        }
        field357 = false;
        field328 = 0;
        if (Statics.field24 != null) {
            method2520(Statics.field24);
        }
        Statics.field24 = class153.method2702(var13);
        field454 = var12;
        field354 = class127.field2013;
        field355 = class127.field2015;
        if (field258 > 0) {
            method436(field258 - 1);
        }
        method2520(Statics.field24);
    }

    @ObfuscatedName("cb.bj(III)V")
    public static final void method2076(int arg0, int arg1) {
        int var2 = Statics.field503.method3400(class143.field2394);
        for (int var3 = 0; var3 < field258; var3++) {
            int var4 = Statics.field503.method3400(method654(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field258 * 15 + 21;
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
        field383 = true;
        Statics.field2116 = var6;
        Statics.field1857 = var7;
        Statics.field1251 = var2;
        Statics.field1878 = field258 * 15 + 22;
    }

    @ObfuscatedName("dw.bn(II)Z")
    public static final boolean method2383(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field387[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("dl.bs(II)V")
    public static final void method2424(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field390[arg0];
        int var2 = field330[arg0];
        int var3 = field387[arg0];
        int var4 = field388[arg0];
        String var5 = field389[arg0];
        String var6 = field501[arg0];
        method481(var1, var2, var3, var4, var5, var6, class127.field2013, class127.field2015);
    }

    @ObfuscatedName("m.bp(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method481(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 31) {
            field282.method2366(184);
            field282.method2168(Statics.field2506);
            field282.method2169(Statics.field603);
            field282.method2125(arg1);
            field282.method2170(arg0);
            field282.method2132(arg3);
            field282.method2125(Statics.field513);
            field420 = 0;
            Statics.field90 = class153.method2702(arg1);
            field352 = arg0;
        }
        if (arg2 == 12) {
            class30 var8 = field279[arg3];
            if (var8 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(221);
                field282.method2169(arg3);
                field282.method2256(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 37) {
            field282.method2366(138);
            field282.method2127(arg1);
            field282.method2170(arg3);
            field282.method2169(arg0);
            field420 = 0;
            Statics.field90 = class153.method2702(arg1);
            field352 = arg0;
        }
        if (arg2 == 25) {
            class153 var9 = class153.method1(arg1, arg0);
            if (var9 != null) {
                method789();
                int var10 = class157.method2921(method2591(var9));
                int var11 = var9.field2586;
                class153 var12 = class153.method1(arg1, arg0);
                if (var12 != null && var12.field2539 != null) {
                    class1 var13 = new class1();
                    var13.field3 = var12;
                    var13.field7 = var12.field2539;
                    class32.method1424(var13);
                }
                field399 = var11;
                field397 = true;
                Statics.field164 = arg1;
                field398 = arg0;
                Statics.field2104 = var10;
                method2520(var12);
                field395 = 0;
                field308 = method1387(var9);
                if (field308 == null) {
                    field308 = "Null";
                }
                if (var9.field2596) {
                    field298 = var9.field2603 + class2.method49(16777215);
                } else {
                    field298 = class2.method49(65280) + var9.field2623 + class2.method49(16777215);
                }
            }
            return;
        }
        if (arg2 == 41) {
            field282.method2366(31);
            field282.method2170(arg3);
            field282.method2125(arg1);
            field282.method2169(arg0);
            field420 = 0;
            Statics.field90 = class153.method2702(arg1);
            field352 = arg0;
        }
        if (arg2 == 15) {
            class3 var14 = field358[arg3];
            if (var14 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(197);
                field282.method2170(field398);
                field282.method2168(arg3);
                field282.method2160(class124.field1977[82] ? 1 : 0);
                field282.method2180(Statics.field164);
            }
        }
        if (arg2 == 40) {
            field282.method2366(6);
            field282.method2169(arg0);
            field282.method2170(arg3);
            field282.method2127(arg1);
            field420 = 0;
            Statics.field90 = class153.method2702(arg1);
            field352 = arg0;
        }
        if (arg2 == 24) {
            class153 var15 = class153.method2702(arg1);
            boolean var16 = true;
            if (var15.field2628 > 0) {
                var16 = method31(var15);
            }
            if (var16) {
                field282.method2366(99);
                field282.method2127(arg1);
            }
        }
        if (arg2 == 43) {
            field282.method2366(111);
            field282.method2170(arg3);
            field282.method2168(arg0);
            field282.method2180(arg1);
            field420 = 0;
            Statics.field90 = class153.method2702(arg1);
            field352 = arg0;
        }
        if (arg2 == 34) {
            field282.method2366(144);
            field282.method2169(arg3);
            field282.method2169(arg0);
            field282.method2125(arg1);
            field420 = 0;
            Statics.field90 = class153.method2702(arg1);
            field352 = arg0;
        }
        if (arg2 == 22) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field471 = arg0;
            field472 = arg1;
            field282.method2366(124);
            field282.method2270(class124.field1977[82] ? 1 : 0);
            field282.method2170(Statics.field551 + arg1);
            field282.method2170(arg3);
            field282.method2169(Statics.field1557 + arg0);
        }
        if (arg2 == 1001) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field471 = arg0;
            field472 = arg1;
            field282.method2366(214);
            field282.method2132(arg3 >> 14 & 0x7FFF);
            field282.method2170(Statics.field551 + arg1);
            field282.method2169(Statics.field1557 + arg0);
            field282.method2270(class124.field1977[82] ? 1 : 0);
        }
        if (arg2 == 28) {
            field282.method2366(99);
            field282.method2127(arg1);
            class153 var17 = class153.method2702(arg1);
            if (var17.field2639 != null && var17.field2639[0][0] == 5) {
                int var18 = var17.field2639[0][1];
                class155.field2670[var18] = 1 - class155.field2670[var18];
                method2431(var18);
            }
        }
        if (arg2 == 1002) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field282.method2366(53);
            field282.method2132(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 26) {
            method482();
        }
        if (arg2 == 35) {
            field282.method2366(113);
            field282.method2132(arg3);
            field282.method2169(arg0);
            field282.method2222(arg1);
            field420 = 0;
            Statics.field90 = class153.method2702(arg1);
            field352 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class153 var19 = class153.method1(arg1, arg0);
            if (var19 != null) {
                method148(arg3, arg1, arg0, var19.field2586, arg5);
            }
        }
        if (arg2 == 58) {
            class153 var20 = class153.method1(arg1, arg0);
            if (var20 != null) {
                field282.method2366(199);
                field282.method2132(arg0);
                field282.method2168(field398);
                field282.method2132(field399);
                field282.method2222(arg1);
                field282.method2169(var20.field2586);
                field282.method2125(Statics.field164);
            }
        }
        if (arg2 == 1003) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            class30 var21 = field279[arg3];
            if (var21 != null) {
                class35 var22 = var21.field689;
                if (var22.field805 != null) {
                    var22 = var22.method575();
                }
                if (var22 != null) {
                    field282.method2366(87);
                    field282.method2170(var22.field788);
                }
            }
        }
        if (arg2 == 18) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field471 = arg0;
            field472 = arg1;
            field282.method2366(36);
            field282.method2168(arg3);
            field282.method2256(class124.field1977[82] ? 1 : 0);
            field282.method2132(Statics.field551 + arg1);
            field282.method2168(Statics.field1557 + arg0);
        }
        if (arg2 == 42) {
            field282.method2366(91);
            field282.method2127(arg1);
            field282.method2168(arg3);
            field282.method2132(arg0);
            field420 = 0;
            Statics.field90 = class153.method2702(arg1);
            field352 = arg0;
        }
        if (arg2 == 1) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field471 = arg0;
            field472 = arg1;
            field282.method2366(75);
            field282.method2256(class124.field1977[82] ? 1 : 0);
            field282.method2169(Statics.field551 + arg1);
            field282.method2169(arg3 >> 14 & 0x7FFF);
            field282.method2168(Statics.field603);
            field282.method2132(Statics.field2506);
            field282.method2168(Statics.field1557 + arg0);
            field282.method2222(Statics.field513);
        }
        if (arg2 == 23) {
            Statics.field1562.method1644(Statics.field224, arg0, arg1);
        }
        if (arg2 == 6) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field471 = arg0;
            field472 = arg1;
            field282.method2366(190);
            field282.method2169(arg3 >> 14 & 0x7FFF);
            field282.method2170(Statics.field551 + arg1);
            field282.method2270(class124.field1977[82] ? 1 : 0);
            field282.method2170(Statics.field1557 + arg0);
        }
        if (arg2 == 51) {
            class3 var23 = field358[arg3];
            if (var23 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(97);
                field282.method2124(class124.field1977[82] ? 1 : 0);
                field282.method2169(arg3);
            }
        }
        if (arg2 == 44) {
            class3 var24 = field358[arg3];
            if (var24 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(249);
                field282.method2169(arg3);
                field282.method2270(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class30 var25 = field279[arg3];
            if (var25 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(56);
                field282.method2160(class124.field1977[82] ? 1 : 0);
                field282.method2168(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var26 = field358[arg3];
            if (var26 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(83);
                field282.method2168(arg3);
                field282.method2270(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 3) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field471 = arg0;
            field472 = arg1;
            field282.method2366(233);
            field282.method2132(arg3 >> 14 & 0x7FFF);
            field282.method2169(Statics.field1557 + arg0);
            field282.method2256(class124.field1977[82] ? 1 : 0);
            field282.method2168(Statics.field551 + arg1);
        }
        if (arg2 == 11) {
            class30 var27 = field279[arg3];
            if (var27 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(28);
                field282.method2169(arg3);
                field282.method2160(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class30 var28 = field279[arg3];
            if (var28 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(12);
                field282.method2170(arg3);
                field282.method2125(Statics.field164);
                field282.method2168(field398);
                field282.method2160(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 30 && field451 == null) {
            field282.method2366(189);
            field282.method2169(arg0);
            field282.method2180(arg1);
            field451 = class153.method1(arg1, arg0);
            method2520(field451);
        }
        if (arg2 == 36) {
            field282.method2366(70);
            field282.method2168(arg0);
            field282.method2222(arg1);
            field282.method2168(arg3);
            field420 = 0;
            Statics.field90 = class153.method2702(arg1);
            field352 = arg0;
        }
        if (arg2 == 20) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field471 = arg0;
            field472 = arg1;
            field282.method2366(110);
            field282.method2169(Statics.field551 + arg1);
            field282.method2170(Statics.field1557 + arg0);
            field282.method2256(class124.field1977[82] ? 1 : 0);
            field282.method2170(arg3);
        }
        if (arg2 == 38) {
            method789();
            class153 var29 = class153.method2702(arg1);
            field395 = 1;
            Statics.field603 = arg0;
            Statics.field513 = arg1;
            Statics.field2506 = arg3;
            method2520(var29);
            field396 = class2.method49(16748608) + class45.method114(arg3).field998 + class2.method49(16777215);
            if (field396 == null) {
                field396 = "null";
            }
            return;
        }
        if (arg2 == 14) {
            class3 var30 = field358[arg3];
            if (var30 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(103);
                field282.method2256(class124.field1977[82] ? 1 : 0);
                field282.method2169(Statics.field603);
                field282.method2168(arg3);
                field282.method2170(Statics.field2506);
                field282.method2222(Statics.field513);
            }
        }
        if (arg2 == 1005) {
            class153 var31 = class153.method2702(arg1);
            if (var31 == null || var31.field2616[arg0] < 100000) {
                field282.method2366(228);
                field282.method2168(arg3);
            } else {
                class10.method132(27, "", var31.field2616[arg0] + " x " + class45.method114(arg3).field998);
            }
            field420 = 0;
            Statics.field90 = class153.method2702(arg1);
            field352 = arg0;
        }
        if (arg2 == 7) {
            class30 var32 = field279[arg3];
            if (var32 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(102);
                field282.method2170(Statics.field603);
                field282.method2168(Statics.field2506);
                field282.method2132(arg3);
                field282.method2222(Statics.field513);
                field282.method2160(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 4) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field471 = arg0;
            field472 = arg1;
            field282.method2366(239);
            field282.method2132(Statics.field551 + arg1);
            field282.method2124(class124.field1977[82] ? 1 : 0);
            field282.method2169(arg3 >> 14 & 0x7FFF);
            field282.method2170(Statics.field1557 + arg0);
        }
        if (arg2 == 46) {
            class3 var33 = field358[arg3];
            if (var33 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(23);
                field282.method2170(arg3);
                field282.method2270(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field282.method2366(99);
            field282.method2127(arg1);
            class153 var34 = class153.method2702(arg1);
            if (var34.field2639 != null && var34.field2639[0][0] == 5) {
                int var35 = var34.field2639[0][1];
                if (class155.field2670[var35] != var34.field2641[0]) {
                    class155.field2670[var35] = var34.field2641[0];
                    method2431(var35);
                }
            }
        }
        if (arg2 == 5) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field471 = arg0;
            field472 = arg1;
            field282.method2366(100);
            field282.method2160(class124.field1977[82] ? 1 : 0);
            field282.method2168(Statics.field1557 + arg0);
            field282.method2169(arg3 >> 14 & 0x7FFF);
            field282.method2168(Statics.field551 + arg1);
        }
        if (arg2 == 1004) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field282.method2366(228);
            field282.method2168(arg3);
        }
        if (arg2 == 21) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field471 = arg0;
            field472 = arg1;
            field282.method2366(69);
            field282.method2124(class124.field1977[82] ? 1 : 0);
            field282.method2168(Statics.field1557 + arg0);
            field282.method2170(arg3);
            field282.method2170(Statics.field551 + arg1);
        }
        if (arg2 == 17) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field471 = arg0;
            field472 = arg1;
            field282.method2366(153);
            field282.method2160(class124.field1977[82] ? 1 : 0);
            field282.method2168(Statics.field551 + arg1);
            field282.method2132(field398);
            field282.method2170(arg3);
            field282.method2132(Statics.field1557 + arg0);
            field282.method2127(Statics.field164);
        }
        if (arg2 == 48) {
            class3 var36 = field358[arg3];
            if (var36 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(128);
                field282.method2124(class124.field1977[82] ? 1 : 0);
                field282.method2168(arg3);
            }
        }
        if (arg2 == 2) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field471 = arg0;
            field472 = arg1;
            field282.method2366(151);
            field282.method2132(arg3 >> 14 & 0x7FFF);
            field282.method2170(Statics.field551 + arg1);
            field282.method2270(class124.field1977[82] ? 1 : 0);
            field282.method2169(Statics.field1557 + arg0);
            field282.method2222(Statics.field164);
            field282.method2170(field398);
        }
        if (arg2 == 32) {
            field282.method2366(216);
            field282.method2180(arg1);
            field282.method2169(arg3);
            field282.method2132(field398);
            field282.method2127(Statics.field164);
            field282.method2132(arg0);
            field420 = 0;
            Statics.field90 = class153.method2702(arg1);
            field352 = arg0;
        }
        if (arg2 == 39) {
            field282.method2366(68);
            field282.method2132(arg3);
            field282.method2180(arg1);
            field282.method2132(arg0);
            field420 = 0;
            Statics.field90 = class153.method2702(arg1);
            field352 = arg0;
        }
        if (arg2 == 47) {
            class3 var37 = field358[arg3];
            if (var37 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(250);
                field282.method2169(arg3);
                field282.method2270(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 10) {
            class30 var38 = field279[arg3];
            if (var38 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(227);
                field282.method2169(arg3);
                field282.method2160(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 50) {
            class3 var39 = field358[arg3];
            if (var39 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(231);
                field282.method2169(arg3);
                field282.method2256(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 49) {
            class3 var40 = field358[arg3];
            if (var40 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(72);
                field282.method2170(arg3);
                field282.method2270(class124.field1977[82] ? 1 : 0);
            }
        }
        if (arg2 == 33) {
            field282.method2366(81);
            field282.method2180(arg1);
            field282.method2168(arg3);
            field282.method2169(arg0);
            field420 = 0;
            Statics.field90 = class153.method2702(arg1);
            field352 = arg0;
        }
        if (arg2 == 16) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field471 = arg0;
            field472 = arg1;
            field282.method2366(7);
            field282.method2132(Statics.field551 + arg1);
            field282.method2132(Statics.field2506);
            field282.method2168(Statics.field1557 + arg0);
            field282.method2170(Statics.field603);
            field282.method2125(Statics.field513);
            field282.method2124(class124.field1977[82] ? 1 : 0);
            field282.method2169(arg3);
        }
        if (arg2 == 19) {
            field296 = arg6;
            field348 = arg7;
            field350 = 2;
            field349 = 0;
            field471 = arg0;
            field472 = arg1;
            field282.method2366(114);
            field282.method2168(Statics.field551 + arg1);
            field282.method2168(Statics.field1557 + arg0);
            field282.method2256(class124.field1977[82] ? 1 : 0);
            field282.method2132(arg3);
        }
        if (arg2 == 9) {
            class30 var41 = field279[arg3];
            if (var41 != null) {
                field296 = arg6;
                field348 = arg7;
                field350 = 2;
                field349 = 0;
                field471 = arg0;
                field472 = arg1;
                field282.method2366(26);
                field282.method2168(arg3);
                field282.method2124(class124.field1977[82] ? 1 : 0);
            }
        }
        if (field395 != 0) {
            field395 = 0;
            method2520(class153.method2702(Statics.field513));
        }
        if (field397) {
            method789();
        }
        if (Statics.field90 != null && field420 == 0) {
            method2520(Statics.field90);
        }
    }

    @ObfuscatedName("ak.bv(I)V")
    public static void method789() {
        if (!field397) {
            return;
        }
        class153 var0 = class153.method1(Statics.field164, field398);
        if (var0 != null && var0.field2567 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field7 = var0.field2567;
            class32.method1424(var1);
        }
        field397 = false;
        method2520(var0);
    }

    @ObfuscatedName("t.bx(IIIILjava/lang/String;I)V")
    public static void method148(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class153 var5 = class153.method1(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2540 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field2 = arg0;
            var6.field10 = arg4;
            var6.field7 = var5.field2540;
            class32.method1424(var6);
        }
        boolean var7 = true;
        if (var5.field2628 > 0) {
            var7 = method31(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method2591(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field282.method2366(202);
            field282.method2127(arg1);
            field282.method2132(arg2);
            field282.method2132(arg3);
        }
        if (arg0 == 2) {
            field282.method2366(24);
            field282.method2127(arg1);
            field282.method2132(arg2);
            field282.method2132(arg3);
        }
        if (arg0 == 3) {
            field282.method2366(94);
            field282.method2127(arg1);
            field282.method2132(arg2);
            field282.method2132(arg3);
        }
        if (arg0 == 4) {
            field282.method2366(3);
            field282.method2127(arg1);
            field282.method2132(arg2);
            field282.method2132(arg3);
        }
        if (arg0 == 5) {
            field282.method2366(71);
            field282.method2127(arg1);
            field282.method2132(arg2);
            field282.method2132(arg3);
        }
        if (arg0 == 6) {
            field282.method2366(210);
            field282.method2127(arg1);
            field282.method2132(arg2);
            field282.method2132(arg3);
        }
        if (arg0 == 7) {
            field282.method2366(169);
            field282.method2127(arg1);
            field282.method2132(arg2);
            field282.method2132(arg3);
        }
        if (arg0 == 8) {
            field282.method2366(85);
            field282.method2127(arg1);
            field282.method2132(arg2);
            field282.method2132(arg3);
        }
        if (arg0 == 9) {
            field282.method2366(203);
            field282.method2127(arg1);
            field282.method2132(arg2);
            field282.method2132(arg3);
        }
        if (arg0 == 10) {
            field282.method2366(61);
            field282.method2127(arg1);
            field282.method2132(arg2);
            field282.method2132(arg3);
        }
    }

    @ObfuscatedName("db.ba(I)V")
    public static final void method2398() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field258 - 1; var1++) {
                if (field387[var1] < 1000 && field387[var1 + 1] > 1000) {
                    String var2 = field501[var1];
                    field501[var1] = field501[var1 + 1];
                    field501[var1 + 1] = var2;
                    String var3 = field389[var1];
                    field389[var1] = field389[var1 + 1];
                    field389[var1 + 1] = var3;
                    int var4 = field387[var1];
                    field387[var1] = field387[var1 + 1];
                    field387[var1 + 1] = var4;
                    int var5 = field390[var1];
                    field390[var1] = field390[var1 + 1];
                    field390[var1 + 1] = var5;
                    int var6 = field330[var1];
                    field330[var1] = field330[var1 + 1];
                    field330[var1 + 1] = var6;
                    int var7 = field388[var1];
                    field388[var1] = field388[var1 + 1];
                    field388[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("cn.by(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1796(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field383 || field258 >= 500) {
            return;
        }
        field389[field258] = arg0;
        field501[field258] = arg1;
        field387[field258] = arg2;
        field388[field258] = arg3;
        field390[field258] = arg4;
        field330[field258] = arg5;
        field258++;
    }

    @ObfuscatedName("cm.bq(I)V")
    public static void method2071() {
        for (int var0 = 0; var0 < field258; var0++) {
            if (Statics.method1973(field387[var0])) {
                if (var0 < field258 - 1) {
                    for (int var1 = var0; var1 < field258 - 1; var1++) {
                        field389[var1] = field389[var1 + 1];
                        field501[var1] = field501[var1 + 1];
                        field387[var1] = field387[var1 + 1];
                        field388[var1] = field388[var1 + 1];
                        field390[var1] = field390[var1 + 1];
                        field330[var1] = field330[var1 + 1];
                    }
                }
                field258--;
            }
        }
    }

    @ObfuscatedName("as.bb(IB)Ljava/lang/String;")
    public static String method654(int arg0) {
        return field501[arg0].length() > 0 ? field389[arg0] + class143.field2325 + field501[arg0] : field389[arg0];
    }

    @ObfuscatedName("d.bt(IIIIB)V")
    public static final void method122(int arg0, int arg1, int arg2, int arg3) {
        if (field395 == 0 && !field397) {
            method1796(class143.field2320, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class98.field1738; var5++) {
            int var6 = class98.field1739[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field1562.method1637(Statics.field224, var7, var8, var6) >= 0) {
                    class36 var11 = class36.method525(var10);
                    if (var11.field841 != null) {
                        var11 = var11.method614();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field395 == 1) {
                        method1796(class143.field2369, field396 + " " + class2.field16 + " " + class2.method49(65535) + var11.field836, 1, var6, var7, var8);
                    } else if (!field397) {
                        String[] var12 = var11.field875;
                        if (field413) {
                            var12 = method146(var12);
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
                                    method1796(var12[var13], class2.method49(65535) + var11.field836, var14, var6, var7, var8);
                                }
                            }
                        }
                        method1796(class143.field2222, class2.method49(65535) + var11.field836, 1002, var11.field833 << 14, var7, var8);
                    } else if ((Statics.field2104 & 0x4) == 4) {
                        method1796(field308, field298 + " " + class2.field16 + " " + class2.method49(65535) + var11.field836, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class30 var15 = field279[var10];
                    if (var15 == null) {
                        continue;
                    }
                    if (var15.field689.field790 == 1 && (var15.field760 & 0x7F) == 64 && (var15.field716 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field280; var16++) {
                            class30 var17 = field279[field281[var16]];
                            if (var17 != null && var15 != var17 && var17.field689.field790 == 1 && var15.field760 == var17.field760 && var15.field716 == var17.field716) {
                                method1407(var17.field689, field281[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field294; var18++) {
                            class3 var19 = field358[field362[var18]];
                            if (var19 != null && var15.field760 == var19.field760 && var15.field716 == var19.field716) {
                                method2704(var19, field362[var18], var7, var8);
                            }
                        }
                    }
                    method1407(var15.field689, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field358[var10];
                    if (var20 == null) {
                        continue;
                    }
                    if ((var20.field760 & 0x7F) == 64 && (var20.field716 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field280; var21++) {
                            class30 var22 = field279[field281[var21]];
                            if (var22 != null && var22.field689.field790 == 1 && var20.field760 == var22.field760 && var20.field716 == var22.field716) {
                                method1407(var22.field689, field281[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field294; var23++) {
                            class3 var24 = field358[field362[var23]];
                            if (var24 != null && var20 != var24 && var20.field760 == var24.field760 && var20.field716 == var24.field716) {
                                method2704(var24, field362[var23], var7, var8);
                            }
                        }
                    }
                    method2704(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class178 var25 = field452[Statics.field224][var7][var8];
                    if (var25 != null) {
                        for (class25 var26 = (class25) var25.method3299(); var26 != null; var26 = (class25) var25.method3291()) {
                            class45 var27 = class45.method114(var26.field600);
                            if (field395 == 1) {
                                method1796(class143.field2369, field396 + " " + class2.field16 + " " + class2.method49(16748608) + var27.field998, 16, var26.field600, var7, var8);
                            } else if (!field397) {
                                String[] var28 = var27.field1012;
                                if (field413) {
                                    var28 = method146(var28);
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
                                        method1796(var28[var29], class2.method49(16748608) + var27.field998, var30, var26.field600, var7, var8);
                                    } else if (var29 == 2) {
                                        method1796(class143.field2166, class2.method49(16748608) + var27.field998, 20, var26.field600, var7, var8);
                                    }
                                }
                                method1796(class143.field2222, class2.method49(16748608) + var27.field998, 1004, var26.field600, var7, var8);
                            } else if ((Statics.field2104 & 0x1) == 1) {
                                method1796(field308, field298 + " " + class2.field16 + " " + class2.method49(16748608) + var27.field998, 17, var26.field600, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bq.bz(Lap;IIIB)V")
    public static final void method1407(class35 arg0, int arg1, int arg2, int arg3) {
        if (field258 >= 400) {
            return;
        }
        if (arg0.field805 != null) {
            arg0 = arg0.method575();
        }
        if (arg0 == null || !arg0.field817 || arg0.field796 && field410 != arg1) {
            return;
        }
        String var4 = arg0.field789;
        if (arg0.field806 != 0) {
            var4 = var4 + method32(arg0.field806, Statics.field590.field32) + " " + class2.field19 + class143.field2321 + arg0.field806 + class2.field18;
        }
        if (field395 == 1) {
            method1796(class143.field2369, field396 + " " + class2.field16 + " " + class2.method49(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field397) {
            String[] var5 = arg0.field804;
            if (field413) {
                var5 = method146(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class143.field2317)) {
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
                        method1796(var5[var6], class2.method49(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class143.field2317)) {
                        short var9 = 0;
                        if (field268 == class18.field510 || field268 == class18.field515 && arg0.field806 > Statics.field590.field32) {
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
                        method1796(var5[var8], class2.method49(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method1796(class143.field2222, class2.method49(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2104 & 0x2) == 2) {
            method1796(field308, field298 + " " + class2.field16 + " " + class2.method49(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ee.bc(Ls;IIIB)V")
    public static final void method2704(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field590 == arg0 || field258 >= 400) {
            return;
        }
        String var4;
        if (arg0.field33 == 0) {
            var4 = arg0.field46 + method32(arg0.field32, Statics.field590.field32) + " " + class2.field19 + class143.field2321 + arg0.field32 + class2.field18;
        } else {
            var4 = arg0.field46 + " " + class2.field19 + class143.field2322 + arg0.field33 + class2.field18;
        }
        if (field395 == 1) {
            method1796(class143.field2369, field396 + " " + class2.field16 + " " + class2.method49(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field397) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field502[var5] != null) {
                    short var6 = 0;
                    if (field502[var5].equalsIgnoreCase(class143.field2317)) {
                        if (field268 == class18.field510 || field268 == class18.field515 && arg0.field32 > Statics.field590.field32) {
                            var6 = 2000;
                        }
                        if (Statics.field590.field36 != 0 && arg0.field36 != 0) {
                            if (Statics.field590.field36 == arg0.field36) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field372[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field370[var5] + var6;
                    method1796(field502[var5], class2.method49(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2104 & 0x8) == 8) {
            method1796(field308, field298 + " " + class2.field16 + " " + class2.method49(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field258; var9++) {
            if (field387[var9] == 23) {
                field501[var9] = class2.method49(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("g.bh(III)Ljava/lang/String;")
    public static final String method32(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method49(16711680);
        } else if (var2 < -6) {
            return class2.method49(16723968);
        } else if (var2 < -3) {
            return class2.method49(16740352);
        } else if (var2 < 0) {
            return class2.method49(16756736);
        } else if (var2 > 9) {
            return class2.method49(65280);
        } else if (var2 > 6) {
            return class2.method49(4259584);
        } else if (var2 > 3) {
            return class2.method49(8453888);
        } else if (var2 > 0) {
            return class2.method49(12648192);
        } else {
            return class2.method49(16776960);
        }
    }

    @ObfuscatedName("az.bu(IIIIIIIII)V")
    public static final void method829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class153.method2811(arg0)) {
            Statics.field967 = null;
            method1974(Statics.field2535[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field967 != null) {
                method1974(Statics.field967, -1412584499, arg1, arg2, arg3, arg4, Statics.field116, Statics.field127, arg7);
                Statics.field967 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field375[var8] = true;
            }
        } else {
            field375[arg7] = true;
        }
    }

    @ObfuscatedName("cc.bw([Lep;IIIIIIIII)V")
    public static final void method1974(class153[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class73.method1512(arg2, arg3, arg4, arg5);
        class84.method1800();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class153 var10 = arg0[var9];
            if (var10 != null && (var10.field2554 == arg1 || arg1 == -1412584499 && field271 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field450[field445] = var10.field2588 + arg6;
                    field275[field445] = var10.field2549 + arg7;
                    field379[field445] = var10.field2552;
                    field453[field445] = var10.field2649;
                    var11 = ++field445 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2658 = var11;
                var10.field2659 = field245;
                if (!var10.field2596 || !method768(var10)) {
                    if (var10.field2628 > 0) {
                        method110(var10);
                    }
                    int var12 = var10.field2588 + arg6;
                    int var13 = var10.field2549 + arg7;
                    int var14 = var10.field2653;
                    if (field271 == var10) {
                        if (arg1 != -1412584499 && !var10.field2608) {
                            Statics.field967 = arg0;
                            Statics.field116 = arg6;
                            Statics.field127 = arg7;
                            continue;
                        }
                        if (field324 && field419) {
                            int var15 = class127.field2007;
                            int var16 = class127.field2008;
                            int var17 = var15 - field248;
                            int var18 = var16 - field417;
                            if (var17 < field484) {
                                var17 = field484;
                            }
                            if (var10.field2552 + var17 > field484 + field415.field2552) {
                                var17 = field484 + field415.field2552 - var10.field2552;
                            }
                            if (var18 < field421) {
                                var18 = field421;
                            }
                            if (var10.field2649 + var18 > field421 + field415.field2649) {
                                var18 = field421 + field415.field2649 - var10.field2649;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2608) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2545 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2545 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2552 + var12;
                        int var26 = var10.field2649 + var13;
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
                        int var29 = var10.field2552 + var12;
                        int var30 = var10.field2649 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2596 || var19 < var21 && var20 < var22) {
                        if (var10.field2628 != 0) {
                            if (var10.field2628 == 1337) {
                                field391 = var12;
                                field466 = var13;
                                int var31 = var10.field2552;
                                int var32 = var10.field2649;
                                class73.method1512(var12, var13, var12 + var31, var13 + var32);
                                class84.method1800();
                                field331++;
                                method2059(class29.field679);
                                boolean var33 = false;
                                if (field374 >= 0) {
                                    for (int var34 = 0; var34 < field294; var34++) {
                                        if (field374 == field362[var34]) {
                                            var33 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var33) {
                                    method2059(class29.field676);
                                }
                                method143(true);
                                method2059(var33 ? class29.field678 : class29.field683);
                                method143(false);
                                method1790();
                                for (class26 var35 = (class26) field378.method3301(); var35 != null; var35 = (class26) field378.method3278()) {
                                    if (Statics.field224 != var35.field611 || var35.field618) {
                                        var35.method3365();
                                    } else if (field245 >= var35.field610) {
                                        var35.method485(field244);
                                        if (var35.field618) {
                                            var35.method3365();
                                        } else {
                                            Statics.field1562.method1669(var35.field611, var35.field613, var35.field609, var35.field617, 60, var35, 0, -1, false);
                                        }
                                    }
                                }
                                if (!field485) {
                                    int var36 = field464;
                                    if (field332 / 256 > var36) {
                                        var36 = field332 / 256;
                                    }
                                    if (field300[4] && field488[4] + 128 > var36) {
                                        var36 = field488[4] + 128;
                                    }
                                    int var37 = field448 + field325 & 0x7FF;
                                    method2448(Statics.field567, method2479(Statics.field590.field760, Statics.field590.field716, Statics.field224) - 50, Statics.field1468, var36, var37, var36 * 3 + 600);
                                }
                                int var50;
                                if (field485) {
                                    int var51;
                                    if (Statics.field2674.field129) {
                                        var51 = Statics.field224;
                                    } else {
                                        int var52 = method2479(Statics.field323, Statics.field181, Statics.field224);
                                        if (var52 - Statics.field1909 >= 800 || (class6.field65[Statics.field224][Statics.field323 >> 7][Statics.field181 >> 7] & 0x4) == 0) {
                                            var51 = 3;
                                        } else {
                                            var51 = Statics.field224;
                                        }
                                    }
                                    var50 = var51;
                                } else {
                                    int var38;
                                    if (Statics.field2674.field129) {
                                        var38 = Statics.field224;
                                    } else {
                                        int var39 = 3;
                                        if (Statics.field165 < 310) {
                                            int var40 = Statics.field323 >> 7;
                                            int var41 = Statics.field181 >> 7;
                                            int var42 = Statics.field590.field760 >> 7;
                                            int var43 = Statics.field590.field716 >> 7;
                                            if ((class6.field65[Statics.field224][var40][var41] & 0x4) != 0) {
                                                var39 = Statics.field224;
                                            }
                                            int var44;
                                            if (var42 > var40) {
                                                var44 = var42 - var40;
                                            } else {
                                                var44 = var40 - var42;
                                            }
                                            int var45;
                                            if (var43 > var41) {
                                                var45 = var43 - var41;
                                            } else {
                                                var45 = var41 - var43;
                                            }
                                            if (var44 > var45) {
                                                int var46 = var45 * 65536 / var44;
                                                int var47 = 32768;
                                                while (var40 != var42) {
                                                    if (var40 < var42) {
                                                        var40++;
                                                    } else if (var40 > var42) {
                                                        var40--;
                                                    }
                                                    if ((class6.field65[Statics.field224][var40][var41] & 0x4) != 0) {
                                                        var39 = Statics.field224;
                                                    }
                                                    var47 += var46;
                                                    if (var47 >= 65536) {
                                                        var47 -= 65536;
                                                        if (var41 < var43) {
                                                            var41++;
                                                        } else if (var41 > var43) {
                                                            var41--;
                                                        }
                                                        if ((class6.field65[Statics.field224][var40][var41] & 0x4) != 0) {
                                                            var39 = Statics.field224;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var48 = var44 * 65536 / var45;
                                                int var49 = 32768;
                                                while (var41 != var43) {
                                                    if (var41 < var43) {
                                                        var41++;
                                                    } else if (var41 > var43) {
                                                        var41--;
                                                    }
                                                    if ((class6.field65[Statics.field224][var40][var41] & 0x4) != 0) {
                                                        var39 = Statics.field224;
                                                    }
                                                    var49 += var48;
                                                    if (var49 >= 65536) {
                                                        var49 -= 65536;
                                                        if (var40 < var42) {
                                                            var40++;
                                                        } else if (var40 > var42) {
                                                            var40--;
                                                        }
                                                        if ((class6.field65[Statics.field224][var40][var41] & 0x4) != 0) {
                                                            var39 = Statics.field224;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class6.field65[Statics.field224][Statics.field590.field760 >> 7][Statics.field590.field716 >> 7] & 0x4) != 0) {
                                            var39 = Statics.field224;
                                        }
                                        var38 = var39;
                                    }
                                    var50 = var38;
                                }
                                int var53 = Statics.field323;
                                int var54 = Statics.field1909;
                                int var55 = Statics.field181;
                                int var56 = Statics.field165;
                                int var57 = Statics.field1912;
                                for (int var58 = 0; var58 < 5; var58++) {
                                    if (field300[var58]) {
                                        int var59 = (int) (Math.random() * (double) (field487[var58] * 2 + 1) - (double) field487[var58] + Math.sin((double) field489[var58] / 100.0D * (double) field490[var58]) * (double) field488[var58]);
                                        if (var58 == 0) {
                                            Statics.field323 += var59;
                                        }
                                        if (var58 == 1) {
                                            Statics.field1909 += var59;
                                        }
                                        if (var58 == 2) {
                                            Statics.field181 += var59;
                                        }
                                        if (var58 == 3) {
                                            Statics.field1912 = Statics.field1912 + var59 & 0x7FF;
                                        }
                                        if (var58 == 4) {
                                            Statics.field165 += var59;
                                            if (Statics.field165 < 128) {
                                                Statics.field165 = 128;
                                            }
                                            if (Statics.field165 > 383) {
                                                Statics.field165 = 383;
                                            }
                                        }
                                    }
                                }
                                int var60 = class127.field2007;
                                int var61 = class127.field2008;
                                if (class127.field2004 != 0) {
                                    var60 = class127.field2013;
                                    var61 = class127.field2015;
                                }
                                if (var60 >= var12 && var60 < var12 + var31 && var61 >= var13 && var61 < var13 + var32) {
                                    class98.field1716 = true;
                                    class98.field1738 = 0;
                                    class98.field1696 = var60 - var12;
                                    class98.field1737 = var61 - var13;
                                } else {
                                    class98.field1716 = false;
                                    class98.field1738 = 0;
                                }
                                method2977();
                                class73.method1518(var12, var13, var31, var32, 0);
                                method2977();
                                Statics.field1562.method1678(Statics.field323, Statics.field1909, Statics.field181, Statics.field165, Statics.field1912, var50);
                                method2977();
                                Statics.field1562.method1621();
                                field333 = 0;
                                boolean var62 = false;
                                int var63 = -1;
                                for (int var64 = -1; var64 < field294 + field280; var64++) {
                                    class33 var65;
                                    if (var64 == -1) {
                                        var65 = Statics.field590;
                                    } else if (var64 < field294) {
                                        var65 = field358[field362[var64]];
                                        if (field374 == field362[var64]) {
                                            var62 = true;
                                            var63 = var64;
                                            continue;
                                        }
                                    } else {
                                        var65 = field279[field281[var64 - field294]];
                                    }
                                    method430(var65, var64, var12, var13, var31, var32);
                                }
                                if (var62) {
                                    method430(field358[field374], var63, var12, var13, var31, var32);
                                }
                                for (int var66 = 0; var66 < field333; var66++) {
                                    int var67 = field335[var66];
                                    int var68 = field460[var66];
                                    int var69 = field476[var66];
                                    int var70 = field337[var66];
                                    boolean var71 = true;
                                    while (var71) {
                                        var71 = false;
                                        for (int var72 = 0; var72 < var66; var72++) {
                                            if (var68 + 2 > field460[var72] - field337[var72] && var68 - var70 < field460[var72] + 2 && var67 - var69 < field476[var72] + field335[var72] && var67 + var69 > field335[var72] - field476[var72] && field460[var72] - field337[var72] < var68) {
                                                var68 = field460[var72] - field337[var72];
                                                var71 = true;
                                            }
                                        }
                                    }
                                    field360 = field335[var66];
                                    field346 = field460[var66] = var68;
                                    String var73 = field342[var66];
                                    if (field404 == 0) {
                                        int var74 = 16776960;
                                        if (field339[var66] < 6) {
                                            var74 = field455[field339[var66]];
                                        }
                                        if (field339[var66] == 6) {
                                            var74 = field331 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field339[var66] == 7) {
                                            var74 = field331 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field339[var66] == 8) {
                                            var74 = field331 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field339[var66] == 9) {
                                            int var75 = 150 - field338[var66];
                                            if (var75 < 50) {
                                                var74 = var75 * 1280 + 16711680;
                                            } else if (var75 < 100) {
                                                var74 = 16776960 - (var75 - 50) * 327680;
                                            } else if (var75 < 150) {
                                                var74 = (var75 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field339[var66] == 10) {
                                            int var76 = 150 - field338[var66];
                                            if (var76 < 50) {
                                                var74 = var76 * 5 + 16711680;
                                            } else if (var76 < 100) {
                                                var74 = 16711935 - (var76 - 50) * 327680;
                                            } else if (var76 < 150) {
                                                var74 = (var76 - 100) * 327680 + 255 - (var76 - 100) * 5;
                                            }
                                        }
                                        if (field339[var66] == 11) {
                                            int var77 = 150 - field338[var66];
                                            if (var77 < 50) {
                                                var74 = 16777215 - var77 * 327685;
                                            } else if (var77 < 100) {
                                                var74 = (var77 - 50) * 327685 + 65280;
                                            } else if (var77 < 150) {
                                                var74 = 16777215 - (var77 - 100) * 327680;
                                            }
                                        }
                                        if (field345[var66] == 0) {
                                            Statics.field503.method3407(var73, field360 + var12, field346 + var13, var74, 0);
                                        }
                                        if (field345[var66] == 1) {
                                            Statics.field503.method3409(var73, field360 + var12, field346 + var13, var74, 0, field331);
                                        }
                                        if (field345[var66] == 2) {
                                            Statics.field503.method3467(var73, field360 + var12, field346 + var13, var74, 0, field331);
                                        }
                                        if (field345[var66] == 3) {
                                            Statics.field503.method3488(var73, field360 + var12, field346 + var13, var74, 0, field331, 150 - field338[var66]);
                                        }
                                        if (field345[var66] == 4) {
                                            int var78 = (150 - field338[var66]) * (Statics.field503.method3400(var73) + 100) / 150;
                                            class73.method1513(field360 + var12 - 50, var13, field360 + var12 + 50, var13 + var32);
                                            Statics.field503.method3405(var73, field360 + var12 + 50 - var78, field346 + var13, var74, 0);
                                            class73.method1512(var12, var13, var12 + var31, var13 + var32);
                                        }
                                        if (field345[var66] == 5) {
                                            int var79 = 150 - field338[var66];
                                            int var80 = 0;
                                            if (var79 < 25) {
                                                var80 = var79 - 25;
                                            } else if (var79 > 125) {
                                                var80 = var79 - 125;
                                            }
                                            class73.method1513(var12, field346 + var13 - Statics.field503.field2915 - 1, var12 + var31, field346 + var13 + 5);
                                            Statics.field503.method3407(var73, field360 + var12, field346 + var13 + var80, var74, 0);
                                            class73.method1512(var12, var13, var12 + var31, var13 + var32);
                                        }
                                    } else {
                                        Statics.field503.method3407(var73, field360 + var12, field346 + var13, 16776960, 0);
                                    }
                                }
                                method87(var12, var13);
                                ((class88) Statics.field1453).method1877(field244);
                                if (field350 == 1) {
                                    Statics.field192[field349 / 100].method1439(field296 - 8, field348 - 8);
                                }
                                if (field350 == 2) {
                                    Statics.field192[field349 / 100 + 4].method1439(field296 - 8, field348 - 8);
                                }
                                field359 = 0;
                                int var81 = (Statics.field590.field760 >> 7) + Statics.field1557;
                                int var82 = (Statics.field590.field716 >> 7) + Statics.field551;
                                if (var81 >= 3053 && var81 <= 3156 && var82 >= 3056 && var82 <= 3136) {
                                    field359 = 1;
                                }
                                if (var81 >= 3072 && var81 <= 3118 && var82 >= 9492 && var82 <= 9535) {
                                    field359 = 1;
                                }
                                if (field359 == 1 && var81 >= 3139 && var81 <= 3199 && var82 >= 3008 && var82 <= 3062) {
                                    field359 = 0;
                                }
                                if (field257) {
                                    int var83 = var12 + 512 - 5;
                                    int var84 = var13 + 20;
                                    Statics.field1755.method3444("Fps:" + field2057, var83, var84, 16776960, -1);
                                    int var207 = var84 + 15;
                                    Runtime var85 = Runtime.getRuntime();
                                    int var86 = (int) ((var85.totalMemory() - var85.freeMemory()) / 1024L);
                                    int var87 = 16776960;
                                    if (var86 > 32768 && field246) {
                                        var87 = 16711680;
                                    }
                                    if (var86 > 65536 && !field246) {
                                        var87 = 16711680;
                                    }
                                    Statics.field1755.method3444("Mem:" + var86 + "k", var83, var207, var87, -1);
                                    var84 = var207 + 15;
                                }
                                Statics.field323 = var53;
                                Statics.field1909 = var54;
                                Statics.field181 = var55;
                                Statics.field165 = var56;
                                Statics.field1912 = var57;
                                if (field250 && class151.method1874(true, false) == 0) {
                                    field250 = false;
                                }
                                if (field250) {
                                    class73.method1518(var12, var13, var31, var32, 0);
                                    method738(class143.field2174, false);
                                }
                                class73.method1512(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2628 == 1338) {
                                method2977();
                                class73.method1512(var12, var13, Statics.field2769.field1302 + var12, Statics.field2769.field1303 + var13);
                                if (field473 == 2 || field473 == 5) {
                                    class73.method1526(var12 + 25, var13 + 5, 0, Statics.field782, Statics.field48);
                                } else {
                                    int var88 = field325 + field318 & 0x7FF;
                                    int var89 = Statics.field590.field760 / 32 + 48;
                                    int var90 = 464 - Statics.field590.field716 / 32;
                                    Statics.field1907.method1449(var12 + 25, var13 + 5, 146, 151, var89, var90, var88, field313 + 256, Statics.field782, Statics.field48);
                                    for (int var91 = 0; var91 < field467; var91++) {
                                        int var92 = field468[var91] * 4 + 2 - Statics.field590.field760 / 32;
                                        int var93 = field412[var91] * 4 + 2 - Statics.field590.field716 / 32;
                                        method1978(var12, var13, var92, var93, field470[var91]);
                                    }
                                    for (int var94 = 0; var94 < 104; var94++) {
                                        for (int var95 = 0; var95 < 104; var95++) {
                                            class178 var96 = field452[Statics.field224][var94][var95];
                                            if (var96 != null) {
                                                int var97 = var94 * 4 + 2 - Statics.field590.field760 / 32;
                                                int var98 = var95 * 4 + 2 - Statics.field590.field716 / 32;
                                                method1978(var12, var13, var97, var98, Statics.field1559[0]);
                                            }
                                        }
                                    }
                                    for (int var99 = 0; var99 < field280; var99++) {
                                        class30 var100 = field279[field281[var99]];
                                        if (var100 != null && var100.method20()) {
                                            class35 var101 = var100.field689;
                                            if (var101 != null && var101.field805 != null) {
                                                var101 = var101.method575();
                                            }
                                            if (var101 != null && var101.field799 && var101.field817) {
                                                int var102 = var100.field760 / 32 - Statics.field590.field760 / 32;
                                                int var103 = var100.field716 / 32 - Statics.field590.field716 / 32;
                                                method1978(var12, var13, var102, var103, Statics.field1559[1]);
                                            }
                                        }
                                    }
                                    for (int var104 = 0; var104 < field294; var104++) {
                                        class3 var105 = field358[field362[var104]];
                                        if (var105 != null && var105.method20() && !var105.field42) {
                                            int var106 = var105.field760 / 32 - Statics.field590.field760 / 32;
                                            int var107 = var105.field716 / 32 - Statics.field590.field716 / 32;
                                            boolean var108 = false;
                                            if (method483(var105.field46, true)) {
                                                var108 = true;
                                            }
                                            boolean var109 = false;
                                            for (int var110 = 0; var110 < Statics.field1856; var110++) {
                                                if (var105.field46.equals(Statics.field174[var110].field550)) {
                                                    var109 = true;
                                                    break;
                                                }
                                            }
                                            boolean var111 = false;
                                            if (Statics.field590.field36 != 0 && var105.field36 != 0 && Statics.field590.field36 == var105.field36) {
                                                var111 = true;
                                            }
                                            if (var108) {
                                                method1978(var12, var13, var106, var107, Statics.field1559[3]);
                                            } else if (var111) {
                                                method1978(var12, var13, var106, var107, Statics.field1559[4]);
                                            } else if (var109) {
                                                method1978(var12, var13, var106, var107, Statics.field1559[5]);
                                            } else {
                                                method1978(var12, var13, var106, var107, Statics.field1559[2]);
                                            }
                                        }
                                    }
                                    if (field259 != 0 && field245 % 20 < 10) {
                                        if (field259 == 1 && field260 >= 0 && field260 < field279.length) {
                                            class30 var112 = field279[field260];
                                            if (var112 != null) {
                                                int var113 = var112.field760 / 32 - Statics.field590.field760 / 32;
                                                int var114 = var112.field716 / 32 - Statics.field590.field716 / 32;
                                                method1791(var12, var13, var113, var114, Statics.field1813[1]);
                                            }
                                        }
                                        if (field259 == 2) {
                                            int var115 = field262 * 4 - Statics.field1557 * 4 + 2 - Statics.field590.field760 / 32;
                                            int var116 = field424 * 4 - Statics.field551 * 4 + 2 - Statics.field590.field716 / 32;
                                            method1791(var12, var13, var115, var116, Statics.field1813[1]);
                                        }
                                        if (field259 == 10 && field261 >= 0 && field261 < field358.length) {
                                            class3 var117 = field358[field261];
                                            if (var117 != null) {
                                                int var118 = var117.field760 / 32 - Statics.field590.field760 / 32;
                                                int var119 = var117.field716 / 32 - Statics.field590.field716 / 32;
                                                method1791(var12, var13, var118, var119, Statics.field1813[1]);
                                            }
                                        }
                                    }
                                    if (field471 != 0) {
                                        int var120 = field471 * 4 + 2 - Statics.field590.field760 / 32;
                                        int var121 = field472 * 4 + 2 - Statics.field590.field716 / 32;
                                        method1978(var12, var13, var120, var121, Statics.field1813[0]);
                                    }
                                    if (!Statics.field590.field42) {
                                        class73.method1518(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                    }
                                }
                                if (field473 < 3) {
                                    Statics.field1900.method1449(var12, var13, 33, 33, 25, 25, field325, 256, Statics.field1637, Statics.field1989);
                                } else {
                                    class73.method1526(var12, var13, 0, Statics.field1637, Statics.field1989);
                                }
                                if (field408[var11]) {
                                    Statics.field2769.method1584(var12, var13);
                                }
                                field479[var11] = true;
                                class73.method1512(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2545 == 0) {
                            if (!var10.field2596 && method768(var10) && Statics.field500 != var10) {
                                continue;
                            }
                            if (!var10.field2596) {
                                if (var10.field2557 > var10.field2559 - var10.field2649) {
                                    var10.field2557 = var10.field2559 - var10.field2649;
                                }
                                if (var10.field2557 < 0) {
                                    var10.field2557 = 0;
                                }
                            }
                            method1974(arg0, var10.field2543, var19, var20, var21, var22, var12 - var10.field2556, var13 - var10.field2557, var11);
                            if (var10.field2560 != null) {
                                method1974(var10.field2560, var10.field2543, var19, var20, var21, var22, var12 - var10.field2556, var13 - var10.field2557, var11);
                            }
                            class4 var122 = (class4) field403.method3244((long) var10.field2543);
                            if (var122 != null) {
                                method829(var122.field54, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class73.method1512(arg2, arg3, arg4, arg5);
                            class84.method1800();
                        }
                        if (field408[var11] || field446 > 1) {
                            if (var10.field2545 == 0 && !var10.field2596 && var10.field2559 > var10.field2649) {
                                int var123 = var10.field2552 + var12;
                                int var124 = var10.field2557;
                                int var125 = var10.field2649;
                                int var126 = var10.field2559;
                                Statics.field5[0].method1584(var123, var13);
                                Statics.field5[1].method1584(var123, var13 + var125 - 16);
                                class73.method1518(var123, var13 + 16, 16, var125 - 32, field317);
                                int var127 = (var125 - 32) * var125 / var126;
                                if (var127 < 8) {
                                    var127 = 8;
                                }
                                int var128 = (var125 - 32 - var127) * var124 / (var126 - var125);
                                class73.method1518(var123, var13 + 16 + var128, 16, var127, field270);
                                class73.method1523(var123, var13 + 16 + var128, var127, field320);
                                class73.method1523(var123 + 1, var13 + 16 + var128, var127, field320);
                                class73.method1551(var123, var13 + 16 + var128, 16, field320);
                                class73.method1551(var123, var13 + 17 + var128, 16, field320);
                                class73.method1523(var123 + 15, var13 + 16 + var128, var127, field319);
                                class73.method1523(var123 + 14, var13 + 17 + var128, var127 - 1, field319);
                                class73.method1551(var123, var13 + 15 + var128 + var127, 16, field319);
                                class73.method1551(var123 + 1, var13 + 14 + var128 + var127, 15, field319);
                            }
                            if (var10.field2545 != 1) {
                                if (var10.field2545 == 2) {
                                    int var129 = 0;
                                    for (int var130 = 0; var130 < var10.field2649; var130++) {
                                        for (int var131 = 0; var131 < var10.field2552; var131++) {
                                            int var132 = (var10.field2648 + 32) * var131 + var12;
                                            int var133 = (var10.field2548 + 32) * var130 + var13;
                                            if (var129 < 20) {
                                                var132 += var10.field2598[var129];
                                                var133 += var10.field2599[var129];
                                            }
                                            if (var10.field2645[var129] > 0) {
                                                boolean var134 = false;
                                                boolean var135 = false;
                                                int var136 = var10.field2645[var129] - 1;
                                                if (var132 + 32 > arg2 && var132 < arg4 && var133 + 32 > arg3 && var133 < arg5 || Statics.field24 == var10 && field454 == var129) {
                                                    class72 var137;
                                                    if (field395 == 1 && Statics.field603 == var129 && Statics.field513 == var10.field2543) {
                                                        var137 = class45.method593(var136, var10.field2616[var129], 2, 0, false);
                                                    } else {
                                                        var137 = class45.method593(var136, var10.field2616[var129], 1, 3153952, false);
                                                    }
                                                    if (var137 == null) {
                                                        method2520(var10);
                                                    } else if (Statics.field24 == var10 && field454 == var129) {
                                                        int var138 = class127.field2007 - field354;
                                                        int var139 = class127.field2008 - field355;
                                                        if (var138 < 5 && var138 > -5) {
                                                            var138 = 0;
                                                        }
                                                        if (var139 < 5 && var139 > -5) {
                                                            var139 = 0;
                                                        }
                                                        if (field328 < 5) {
                                                            var138 = 0;
                                                            var139 = 0;
                                                        }
                                                        var137.method1505(var132 + var138, var133 + var139, 128);
                                                        if (arg1 != -1) {
                                                            class153 var140 = arg0[arg1 & 0xFFFF];
                                                            if (var133 + var139 < class73.field1296 && var140.field2557 > 0) {
                                                                int var141 = field244 * (class73.field1296 - var133 - var139) / 3;
                                                                if (var141 > field244 * 10) {
                                                                    var141 = field244 * 10;
                                                                }
                                                                if (var141 > var140.field2557) {
                                                                    var141 = var140.field2557;
                                                                }
                                                                var140.field2557 -= var141;
                                                                field355 += var141;
                                                                method2520(var140);
                                                            }
                                                            if (var133 + var139 + 32 > class73.field1297 && var140.field2557 < var140.field2559 - var140.field2649) {
                                                                int var142 = field244 * (var133 + var139 + 32 - class73.field1297) / 3;
                                                                if (var142 > field244 * 10) {
                                                                    var142 = field244 * 10;
                                                                }
                                                                if (var142 > var140.field2559 - var140.field2649 - var140.field2557) {
                                                                    var142 = var140.field2559 - var140.field2649 - var140.field2557;
                                                                }
                                                                var140.field2557 += var142;
                                                                field355 -= var142;
                                                                method2520(var140);
                                                            }
                                                        }
                                                    } else if (Statics.field90 == var10 && field352 == var129) {
                                                        var137.method1505(var132, var133, 128);
                                                    } else {
                                                        var137.method1439(var132, var133);
                                                    }
                                                }
                                            } else if (var10.field2609 != null && var129 < 20) {
                                                class72 var143 = var10.method2884(var129);
                                                if (var143 != null) {
                                                    var143.method1439(var132, var133);
                                                } else if (class153.field2541) {
                                                    method2520(var10);
                                                }
                                            }
                                            var129++;
                                        }
                                    }
                                } else if (var10.field2545 == 3) {
                                    int var144;
                                    if (method121(var10)) {
                                        var144 = var10.field2561;
                                        if (Statics.field500 == var10 && var10.field2646 != 0) {
                                            var144 = var10.field2646;
                                        }
                                    } else {
                                        var144 = var10.field2564;
                                        if (Statics.field500 == var10 && var10.field2562 != 0) {
                                            var144 = var10.field2562;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2547) {
                                            class73.method1518(var12, var13, var10.field2552, var10.field2649, var144);
                                        } else {
                                            class73.method1519(var12, var13, var10.field2552, var10.field2649, var144);
                                        }
                                    } else if (var10.field2547) {
                                        class73.method1517(var12, var13, var10.field2552, var10.field2649, var144, 256 - (var14 & 0xFF));
                                    } else {
                                        class73.method1520(var12, var13, var10.field2552, var10.field2649, var144, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2545 == 4) {
                                    class194 var145 = var10.method2922();
                                    if (var145 != null) {
                                        String var146 = var10.field2590;
                                        int var147;
                                        if (method121(var10)) {
                                            var147 = var10.field2561;
                                            if (Statics.field500 == var10 && var10.field2646 != 0) {
                                                var147 = var10.field2646;
                                            }
                                            if (var10.field2591.length() > 0) {
                                                var146 = var10.field2591;
                                            }
                                        } else {
                                            var147 = var10.field2564;
                                            if (Statics.field500 == var10 && var10.field2562 != 0) {
                                                var147 = var10.field2562;
                                            }
                                        }
                                        if (var10.field2596 && var10.field2586 != -1) {
                                            class45 var148 = class45.method114(var10.field2586);
                                            var146 = var148.field998;
                                            if (var146 == null) {
                                                var146 = "null";
                                            }
                                            if ((var148.field991 == 1 || var10.field2579 != 1) && var10.field2579 != -1) {
                                                var146 = class2.method49(16748608) + var146 + class2.field23 + " " + 'x' + Statics.method797(var10.field2579);
                                            }
                                        }
                                        if (field451 == var10) {
                                            class143 var10000 = (class143) null;
                                            var146 = class143.field2271;
                                            var147 = var10.field2564;
                                        }
                                        if (!var10.field2596) {
                                            var146 = Statics.method1886(var146, var10);
                                        }
                                        var145.method3475(var146, var12, var13, var10.field2552, var10.field2649, var147, var10.field2595 ? 0 : -1, var10.field2637, var10.field2594, var10.field2558);
                                    } else if (class153.field2541) {
                                        method2520(var10);
                                    }
                                } else if (var10.field2545 == 5) {
                                    if (var10.field2596) {
                                        class72 var150;
                                        if (var10.field2586 == -1) {
                                            var150 = var10.method2880(false);
                                        } else {
                                            var150 = class45.method593(var10.field2586, var10.field2579, var10.field2571, var10.field2572, false);
                                        }
                                        if (var150 != null) {
                                            int var151 = var150.field1286;
                                            int var152 = var150.field1287;
                                            if (var10.field2643) {
                                                class73.method1513(var12, var13, var10.field2552 + var12, var10.field2649 + var13);
                                                int var153 = (var10.field2552 + (var151 - 1)) / var151;
                                                int var154 = (var10.field2649 + (var152 - 1)) / var152;
                                                for (int var155 = 0; var155 < var153; var155++) {
                                                    for (int var156 = 0; var156 < var154; var156++) {
                                                        if (var10.field2621 != 0) {
                                                            var150.method1451(var151 / 2 + var151 * var155 + var12, var152 / 2 + var152 * var156 + var13, var10.field2621, 4096);
                                                        } else if (var14 == 0) {
                                                            var150.method1439(var151 * var155 + var12, var152 * var156 + var13);
                                                        } else {
                                                            var150.method1505(var151 * var155 + var12, var152 * var156 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class73.method1512(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var157 = var10.field2552 * 4096 / var151;
                                                if (var10.field2621 != 0) {
                                                    var150.method1451(var10.field2552 / 2 + var12, var10.field2649 / 2 + var13, var10.field2621, var157);
                                                } else if (var14 != 0) {
                                                    var150.method1440(var12, var13, var10.field2552, var10.field2649, 256 - (var14 & 0xFF));
                                                } else if (var10.field2552 == var151 && var10.field2649 == var152) {
                                                    var150.method1439(var12, var13);
                                                } else {
                                                    var150.method1471(var12, var13, var10.field2552, var10.field2649);
                                                }
                                            }
                                        } else if (class153.field2541) {
                                            method2520(var10);
                                        }
                                    } else {
                                        class72 var149 = var10.method2880(method121(var10));
                                        if (var149 != null) {
                                            var149.method1439(var12, var13);
                                        } else if (class153.field2541) {
                                            method2520(var10);
                                        }
                                    }
                                } else if (var10.field2545 == 6) {
                                    boolean var158 = method121(var10);
                                    int var159;
                                    if (var158) {
                                        var159 = var10.field2580;
                                    } else {
                                        var159 = var10.field2622;
                                    }
                                    class98 var160 = null;
                                    int var161 = 0;
                                    if (var10.field2586 != -1) {
                                        class45 var162 = class45.method114(var10.field2586);
                                        if (var162 != null) {
                                            class45 var163 = var162.method848(var10.field2579);
                                            var160 = var163.method840(1);
                                            if (var160 == null) {
                                                method2520(var10);
                                            } else {
                                                var160.method1991();
                                                var161 = var160.field1332 / 2;
                                            }
                                        }
                                    } else if (var10.field2610 == 5) {
                                        if (var10.field2576 == 0) {
                                            var160 = field497.method2954((class38) null, -1, (class38) null, -1);
                                        } else {
                                            var160 = Statics.field590.method19();
                                        }
                                    } else if (var159 == -1) {
                                        var160 = var10.method2885((class38) null, -1, var158, Statics.field590.field29);
                                        if (var160 == null && class153.field2541) {
                                            method2520(var10);
                                        }
                                    } else {
                                        class38 var164 = class38.method29(var159);
                                        var160 = var10.method2885(var164, var10.field2617, var158, Statics.field590.field29);
                                        if (var160 == null && class153.field2541) {
                                            method2520(var10);
                                        }
                                    }
                                    class84.method1849(var10.field2552 / 2 + var12, var10.field2649 / 2 + var13);
                                    int var165 = var10.field2604 * class84.field1435[var10.field2583] >> 16;
                                    int var166 = var10.field2604 * class84.field1457[var10.field2583] >> 16;
                                    if (var160 != null) {
                                        if (var10.field2596) {
                                            var160.method1991();
                                            if (var10.field2614) {
                                                var160.method2048(0, var10.field2584, var10.field2585, var10.field2583, var10.field2581, var10.field2582 + var161 + var165, var10.field2582 + var166, var10.field2604);
                                            } else {
                                                var160.method1994(0, var10.field2584, var10.field2585, var10.field2583, var10.field2581, var10.field2582 + var161 + var165, var10.field2582 + var166);
                                            }
                                        } else {
                                            var160.method1994(0, var10.field2584, 0, var10.field2583, 0, var165, var166);
                                        }
                                    }
                                    class84.method1840();
                                } else {
                                    if (var10.field2545 == 7) {
                                        class194 var167 = var10.method2922();
                                        if (var167 == null) {
                                            if (class153.field2541) {
                                                method2520(var10);
                                            }
                                            continue;
                                        }
                                        int var168 = 0;
                                        for (int var169 = 0; var169 < var10.field2649; var169++) {
                                            for (int var170 = 0; var170 < var10.field2552; var170++) {
                                                if (var10.field2645[var168] > 0) {
                                                    class45 var171 = class45.method114(var10.field2645[var168] - 1);
                                                    String var172;
                                                    if (var171.field991 != 1 && var10.field2616[var168] == 1) {
                                                        var172 = class2.method49(16748608) + var171.field998 + class2.field23;
                                                    } else {
                                                        var172 = class2.method49(16748608) + var171.field998 + class2.field23 + " " + 'x' + Statics.method797(var10.field2616[var168]);
                                                    }
                                                    int var173 = (var10.field2648 + 115) * var170 + var12;
                                                    int var174 = (var10.field2548 + 12) * var169 + var13;
                                                    if (var10.field2637 == 0) {
                                                        var167.method3405(var172, var173, var174, var10.field2564, var10.field2595 ? 0 : -1);
                                                    } else if (var10.field2637 == 1) {
                                                        var167.method3407(var172, var10.field2552 / 2 + var173, var174, var10.field2564, var10.field2595 ? 0 : -1);
                                                    } else {
                                                        var167.method3444(var172, var10.field2552 + var173 - 1, var174, var10.field2564, var10.field2595 ? 0 : -1);
                                                    }
                                                }
                                                var168++;
                                            }
                                        }
                                    }
                                    if (var10.field2545 == 8 && Statics.field1649 == var10 && field394 == field393) {
                                        int var175 = 0;
                                        int var176 = 0;
                                        class194 var177 = Statics.field1755;
                                        String var178 = var10.field2590;
                                        String var179 = Statics.method1886(var178, var10);
                                        while (var179.length() > 0) {
                                            int var180 = var179.indexOf(class2.field22);
                                            String var181;
                                            if (var180 == -1) {
                                                var181 = var179;
                                                var179 = "";
                                            } else {
                                                var181 = var179.substring(0, var180);
                                                var179 = var179.substring(var180 + 4);
                                            }
                                            int var182 = var177.method3400(var181);
                                            if (var182 > var175) {
                                                var175 = var182;
                                            }
                                            var176 += var177.field2915 + 1;
                                        }
                                        var175 += 6;
                                        var176 += 7;
                                        int var183 = var10.field2552 + var12 - 5 - var175;
                                        int var184 = var10.field2649 + var13 + 5;
                                        if (var183 < var12 + 5) {
                                            var183 = var12 + 5;
                                        }
                                        if (var175 + var183 > arg4) {
                                            var183 = arg4 - var175;
                                        }
                                        if (var176 + var184 > arg5) {
                                            var184 = arg5 - var176;
                                        }
                                        class73.method1518(var183, var184, var175, var176, 16777120);
                                        class73.method1519(var183, var184, var175, var176, 0);
                                        String var185 = var10.field2590;
                                        int var186 = var177.field2915 + var184 + 2;
                                        String var187 = Statics.method1886(var185, var10);
                                        while (var187.length() > 0) {
                                            int var188 = var187.indexOf(class2.field22);
                                            String var189;
                                            if (var188 == -1) {
                                                var189 = var187;
                                                var187 = "";
                                            } else {
                                                var189 = var187.substring(0, var188);
                                                var187 = var187.substring(var188 + 4);
                                            }
                                            var177.method3405(var189, var183 + 3, var186, 0, -1);
                                            var186 += var177.field2915 + 1;
                                        }
                                    }
                                    if (var10.field2545 == 9) {
                                        if (var10.field2566 == 1) {
                                            class73.method1525(var12, var13, var10.field2552 + var12, var10.field2649 + var13, var10.field2564);
                                        } else {
                                            int var190 = var10.field2552 >= 0 ? var10.field2552 : -var10.field2552;
                                            int var191 = var10.field2649 >= 0 ? var10.field2649 : -var10.field2649;
                                            int var192 = var190;
                                            if (var190 < var191) {
                                                var192 = var191;
                                            }
                                            if (var192 != 0) {
                                                int var193 = (var10.field2552 << 16) / var192;
                                                int var194 = (var10.field2649 << 16) / var192;
                                                if (var194 <= var193) {
                                                    var193 = -var193;
                                                } else {
                                                    var194 = -var194;
                                                }
                                                int var195 = var10.field2566 * var194 >> 17;
                                                int var196 = var10.field2566 * var194 + 1 >> 17;
                                                int var197 = var10.field2566 * var193 >> 17;
                                                int var198 = var10.field2566 * var193 + 1 >> 17;
                                                int var199 = var12 + var195;
                                                int var200 = var12 - var196;
                                                int var201 = var10.field2552 + var12 - var196;
                                                int var202 = var10.field2552 + var12 + var195;
                                                int var203 = var13 + var197;
                                                int var204 = var13 - var198;
                                                int var205 = var10.field2649 + var13 - var198;
                                                int var206 = var10.field2649 + var13 + var197;
                                                class84.method1807(var199, var200, var201);
                                                class84.method1821(var203, var204, var205, var199, var200, var201, var10.field2564);
                                                class84.method1807(var199, var201, var202);
                                                class84.method1821(var203, var205, var206, var199, var201, var202, var10.field2564);
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

    @ObfuscatedName("d.cn(Lep;I)Z")
    public static final boolean method121(class153 arg0) {
        if (arg0.field2640 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2640.length; var1++) {
            int var2 = method902(arg0, var1);
            int var3 = arg0.field2641[var1];
            if (arg0.field2640[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2640[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2640[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("af.cg(Lep;IB)I")
    public static final int method902(class153 arg0, int arg1) {
        if (arg0.field2639 == null || arg1 >= arg0.field2639.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2639[arg1];
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
                    var7 = field478[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field380[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field381[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class153 var11 = class153.method2702(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class45.method114(var12).field1011 || field361)) {
                        for (int var13 = 0; var13 < var11.field2645.length; var13++) {
                            if (var12 + 1 == var11.field2645[var13]) {
                                var7 += var11.field2616[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class155.field2670[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class141.field2151[field380[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class155.field2670[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field590.field32;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class141.field2154[var14]) {
                            var7 += field380[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class153 var17 = class153.method2702(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class45.method114(var18).field1011 || field361)) {
                        for (int var19 = 0; var19 < var17.field2645.length; var19++) {
                            if (var18 + 1 == var17.field2645[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field309;
                }
                if (var6 == 12) {
                    var7 = field334;
                }
                if (var6 == 13) {
                    int var20 = class155.field2670[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class155.method549(var22);
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
                    var7 = (Statics.field590.field760 >> 7) + Statics.field1557;
                }
                if (var6 == 19) {
                    var7 = (Statics.field590.field716 >> 7) + Statics.field551;
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

    @ObfuscatedName("ez.cd(Lep;III)V")
    public static final void method2924(class153 arg0, int arg1, int arg2) {
        if (arg0.field2565 == 1) {
            method1796(arg0.field2644, "", 24, 0, 0, arg0.field2543);
        }
        if (arg0.field2565 == 2 && !field397) {
            int var3 = method2591(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2627 == null || arg0.field2627.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2627;
            }
            if (var5 != null) {
                method1796(var5, class2.method49(65280) + arg0.field2623, 25, 0, -1, arg0.field2543);
            }
        }
        if (arg0.field2565 == 3) {
            method1796(class143.field2324, "", 26, 0, 0, arg0.field2543);
        }
        if (arg0.field2565 == 4) {
            method1796(arg0.field2644, "", 28, 0, 0, arg0.field2543);
        }
        if (arg0.field2565 == 5) {
            method1796(arg0.field2644, "", 29, 0, 0, arg0.field2543);
        }
        if (arg0.field2565 == 6 && field451 == null) {
            method1796(arg0.field2644, "", 30, 0, -1, arg0.field2543);
        }
        if (arg0.field2545 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2649; var8++) {
                for (int var9 = 0; var9 < arg0.field2552; var9++) {
                    int var10 = (arg0.field2648 + 32) * var9;
                    int var11 = (arg0.field2548 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2598[var7];
                        var11 += arg0.field2599[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field356 = var7;
                        Statics.field986 = arg0;
                        if (arg0.field2645[var7] > 0) {
                            class45 var12 = class45.method114(arg0.field2645[var7] - 1);
                            if (field395 == 1 && class157.method17(method2591(arg0))) {
                                if (Statics.field513 != arg0.field2543 || Statics.field603 != var7) {
                                    method1796(class143.field2369, field396 + " " + class2.field16 + " " + class2.method49(16748608) + var12.field998, 31, var12.field996, var7, arg0.field2543);
                                }
                            } else if (!field397 || !class157.method17(method2591(arg0))) {
                                String[] var13 = var12.field1000;
                                if (field413) {
                                    var13 = method146(var13);
                                }
                                if (class157.method17(method2591(arg0))) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 36;
                                            } else {
                                                var15 = 37;
                                            }
                                            method1796(var13[var14], class2.method49(16748608) + var12.field998, var15, var12.field996, var7, arg0.field2543);
                                        } else if (var14 == 4) {
                                            method1796(class143.field2167, class2.method49(16748608) + var12.field998, 37, var12.field996, var7, arg0.field2543);
                                        }
                                    }
                                }
                                if (class157.method2056(method2591(arg0))) {
                                    method1796(class143.field2369, class2.method49(16748608) + var12.field998, 38, var12.field996, var7, arg0.field2543);
                                }
                                if (class157.method17(method2591(arg0)) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
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
                                            method1796(var13[var16], class2.method49(16748608) + var12.field998, var17, var12.field996, var7, arg0.field2543);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field2601;
                                if (field413) {
                                    var18 = method146(var18);
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
                                            method1796(var18[var19], class2.method49(16748608) + var12.field998, var20, var12.field996, var7, arg0.field2543);
                                        }
                                    }
                                }
                                method1796(class143.field2222, class2.method49(16748608) + var12.field998, 1005, var12.field996, var7, arg0.field2543);
                            } else if ((Statics.field2104 & 0x10) == 16) {
                                method1796(field308, field298 + " " + class2.field16 + " " + class2.method49(16748608) + var12.field998, 32, var12.field996, var7, arg0.field2543);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2596) {
            return;
        }
        if (!field397) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = method2(arg0, var21);
                if (var22 != null) {
                    method1796(var22, arg0.field2603, 1007, var21 + 1, arg0.field2656, arg0.field2543);
                }
            }
            String var23 = method1387(arg0);
            if (var23 != null) {
                method1796(var23, arg0.field2603, 25, 0, arg0.field2656, arg0.field2543);
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                int var25 = method2591(arg0);
                boolean var26 = (var25 >> var24 + 1 & 0x1) != 0;
                String var27;
                if (!var26 && arg0.field2540 == null) {
                    var27 = null;
                } else if (arg0.field2570 == null || arg0.field2570.length <= var24 || arg0.field2570[var24] == null || arg0.field2570[var24].trim().length() == 0) {
                    var27 = null;
                } else {
                    var27 = arg0.field2570[var24];
                }
                if (var27 != null) {
                    method1796(var27, arg0.field2603, 57, var24 + 1, arg0.field2656, arg0.field2543);
                }
            }
            int var29 = method2591(arg0);
            boolean var30 = (var29 & 0x1) != 0;
            if (var30) {
                method1796(class143.field2171, "", 30, 0, arg0.field2656, arg0.field2543);
            }
        } else if (class157.method495(method2591(arg0)) && (Statics.field2104 & 0x20) == 32) {
            method1796(field308, field298 + " " + class2.field16 + " " + arg0.field2603, 58, 0, arg0.field2656, arg0.field2543);
        }
    }

    @ObfuscatedName("s.ce(IIIIIIII)V")
    public static final void method18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class153.method2811(arg0)) {
            method765(Statics.field2535[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("av.cs([Lep;IIIIIIIB)V")
    public static final void method765(class153[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class153 var9 = arg0[var8];
            if (var9 != null && (!var9.field2596 || var9.field2545 == 0 || var9.field2630 || method2591(var9) != 0 || field415 == var9) && var9.field2554 == arg1 && (!var9.field2596 || !method768(var9))) {
                int var10 = var9.field2588 + arg6;
                int var11 = var9.field2549 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2545 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2545 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2552 + var10;
                    int var19 = var9.field2649 + var11;
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
                    int var22 = var9.field2552 + var10;
                    int var23 = var9.field2649 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field271 == var9) {
                    field422 = true;
                    field253 = var10;
                    field474 = var11;
                }
                if (!var9.field2596 || var12 < var14 && var13 < var15) {
                    int var24 = class127.field2007;
                    int var25 = class127.field2008;
                    if (class127.field2004 != 0) {
                        var24 = class127.field2013;
                        var25 = class127.field2015;
                    }
                    if (var9.field2628 == 1337) {
                        method2520(var9);
                        if (!field250 && !field383 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method122(var24, var25, var12, var13);
                        }
                    } else if (var9.field2628 != 1338) {
                        if (!field383 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2924(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2545 == 0) {
                            if (!var9.field2596 && method768(var9) && Statics.field500 != var9) {
                                continue;
                            }
                            method765(arg0, var9.field2543, var12, var13, var14, var15, var10 - var9.field2556, var11 - var9.field2557);
                            if (var9.field2560 != null) {
                                method765(var9.field2560, var9.field2543, var12, var13, var14, var15, var10 - var9.field2556, var11 - var9.field2557);
                            }
                            class4 var37 = (class4) field403.method3244((long) var9.field2543);
                            if (var37 != null) {
                                if (var37.field51 == 0 && class127.field2007 >= var12 && class127.field2008 >= var13 && class127.field2007 < var14 && class127.field2008 < var15 && !field383 && !field491) {
                                    field389[0] = class143.field2401;
                                    field501[0] = "";
                                    field387[0] = 1006;
                                    field258 = 1;
                                }
                                method18(var37.field54, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2596) {
                            if (var9.field2660 && class127.field2007 >= var12 && class127.field2008 >= var13 && class127.field2007 < var14 && class127.field2008 < var15) {
                                for (class1 var38 = (class1) field441.method3301(); var38 != null; var38 = (class1) field441.method3278()) {
                                    if (var38.field13) {
                                        var38.method3365();
                                        var38.field3.field2652 = false;
                                    }
                                }
                                if (Statics.field426 == 0) {
                                    field271 = null;
                                    field415 = null;
                                }
                                if (!field383) {
                                    field389[0] = class143.field2401;
                                    field501[0] = "";
                                    field387[0] = 1006;
                                    field258 = 1;
                                }
                            }
                            boolean var39;
                            if (class127.field2007 >= var12 && class127.field2008 >= var13 && class127.field2007 < var14 && class127.field2008 < var15) {
                                var39 = true;
                            } else {
                                var39 = false;
                            }
                            boolean var40 = false;
                            if ((class127.field2006 == 1 || !Statics.field697 && class127.field2006 == 4) && var39) {
                                var40 = true;
                            }
                            boolean var41 = false;
                            if ((class127.field2004 == 1 || !Statics.field697 && class127.field2004 == 4) && class127.field2013 >= var12 && class127.field2015 >= var13 && class127.field2013 < var14 && class127.field2015 < var15) {
                                var41 = true;
                            }
                            if (var41) {
                                method2072(var9, class127.field2013 - var10, class127.field2015 - var11);
                            }
                            if (field271 != null && field271 != var9 && var39 && class157.method86(method2591(var9))) {
                                field418 = var9;
                            }
                            if (field415 == var9) {
                                field419 = true;
                                field484 = var10;
                                field421 = var11;
                            }
                            if (var9.field2630) {
                                if (var39 && field440 != 0 && var9.field2631 != null) {
                                    class1 var42 = new class1();
                                    var42.field13 = true;
                                    var42.field3 = var9;
                                    var42.field9 = field440;
                                    var42.field7 = var9.field2631;
                                    field441.method3271(var42);
                                }
                                if (field271 != null || Statics.field24 != null || field383) {
                                    var41 = false;
                                    var40 = false;
                                    var39 = false;
                                }
                                if (!var9.field2563 && var41) {
                                    var9.field2563 = true;
                                    if (var9.field2612 != null) {
                                        class1 var43 = new class1();
                                        var43.field13 = true;
                                        var43.field3 = var9;
                                        var43.field4 = class127.field2013 - var10;
                                        var43.field9 = class127.field2015 - var11;
                                        var43.field7 = var9.field2612;
                                        field441.method3271(var43);
                                    }
                                }
                                if (var9.field2563 && var40 && var9.field2613 != null) {
                                    class1 var44 = new class1();
                                    var44.field13 = true;
                                    var44.field3 = var9;
                                    var44.field4 = class127.field2007 - var10;
                                    var44.field9 = class127.field2008 - var11;
                                    var44.field7 = var9.field2613;
                                    field441.method3271(var44);
                                }
                                if (var9.field2563 && !var40) {
                                    var9.field2563 = false;
                                    if (var9.field2592 != null) {
                                        class1 var45 = new class1();
                                        var45.field13 = true;
                                        var45.field3 = var9;
                                        var45.field4 = class127.field2007 - var10;
                                        var45.field9 = class127.field2008 - var11;
                                        var45.field7 = var9.field2592;
                                        field443.method3271(var45);
                                    }
                                }
                                if (var40 && var9.field2615 != null) {
                                    class1 var46 = new class1();
                                    var46.field13 = true;
                                    var46.field3 = var9;
                                    var46.field4 = class127.field2007 - var10;
                                    var46.field9 = class127.field2008 - var11;
                                    var46.field7 = var9.field2615;
                                    field441.method3271(var46);
                                }
                                if (!var9.field2652 && var39) {
                                    var9.field2652 = true;
                                    if (var9.field2575 != null) {
                                        class1 var47 = new class1();
                                        var47.field13 = true;
                                        var47.field3 = var9;
                                        var47.field4 = class127.field2007 - var10;
                                        var47.field9 = class127.field2008 - var11;
                                        var47.field7 = var9.field2575;
                                        field441.method3271(var47);
                                    }
                                }
                                if (var9.field2652 && var39 && var9.field2569 != null) {
                                    class1 var48 = new class1();
                                    var48.field13 = true;
                                    var48.field3 = var9;
                                    var48.field4 = class127.field2007 - var10;
                                    var48.field9 = class127.field2008 - var11;
                                    var48.field7 = var9.field2569;
                                    field441.method3271(var48);
                                }
                                if (var9.field2652 && !var39) {
                                    var9.field2652 = false;
                                    if (var9.field2618 != null) {
                                        class1 var49 = new class1();
                                        var49.field13 = true;
                                        var49.field3 = var9;
                                        var49.field4 = class127.field2007 - var10;
                                        var49.field9 = class127.field2008 - var11;
                                        var49.field7 = var9.field2618;
                                        field443.method3271(var49);
                                    }
                                }
                                if (var9.field2633 != null) {
                                    class1 var50 = new class1();
                                    var50.field3 = var9;
                                    var50.field7 = var9.field2633;
                                    field340.method3271(var50);
                                }
                                if (var9.field2597 != null && field469 > var9.field2655) {
                                    if (var9.field2624 == null || field469 - var9.field2655 > 32) {
                                        class1 var55 = new class1();
                                        var55.field3 = var9;
                                        var55.field7 = var9.field2597;
                                        field441.method3271(var55);
                                    } else {
                                        label513: for (int var51 = var9.field2655; var51 < field469; var51++) {
                                            int var52 = field459[var51 & 0x1F];
                                            for (int var53 = 0; var53 < var9.field2624.length; var53++) {
                                                if (var9.field2624[var53] == var52) {
                                                    class1 var54 = new class1();
                                                    var54.field3 = var9;
                                                    var54.field7 = var9.field2597;
                                                    field441.method3271(var54);
                                                    break label513;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2655 = field469;
                                }
                                if (var9.field2600 != null && field431 > var9.field2553) {
                                    if (var9.field2546 == null || field431 - var9.field2553 > 32) {
                                        class1 var60 = new class1();
                                        var60.field3 = var9;
                                        var60.field7 = var9.field2600;
                                        field441.method3271(var60);
                                    } else {
                                        label489: for (int var56 = var9.field2553; var56 < field431; var56++) {
                                            int var57 = field386[var56 & 0x1F];
                                            for (int var58 = 0; var58 < var9.field2546.length; var58++) {
                                                if (var9.field2546[var58] == var57) {
                                                    class1 var59 = new class1();
                                                    var59.field3 = var9;
                                                    var59.field7 = var9.field2600;
                                                    field441.method3271(var59);
                                                    break label489;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2553 = field431;
                                }
                                if (var9.field2647 != null && field433 > var9.field2657) {
                                    if (var9.field2607 == null || field433 - var9.field2657 > 32) {
                                        class1 var65 = new class1();
                                        var65.field3 = var9;
                                        var65.field7 = var9.field2647;
                                        field441.method3271(var65);
                                    } else {
                                        label465: for (int var61 = var9.field2657; var61 < field433; var61++) {
                                            int var62 = field432[var61 & 0x1F];
                                            for (int var63 = 0; var63 < var9.field2607.length; var63++) {
                                                if (var9.field2607[var63] == var62) {
                                                    class1 var64 = new class1();
                                                    var64.field3 = var9;
                                                    var64.field7 = var9.field2647;
                                                    field441.method3271(var64);
                                                    break label465;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2657 = field433;
                                }
                                if (field311 > var9.field2654 && var9.field2632 != null) {
                                    class1 var66 = new class1();
                                    var66.field3 = var9;
                                    var66.field7 = var9.field2632;
                                    field441.method3271(var66);
                                }
                                if (field435 > var9.field2654 && var9.field2634 != null) {
                                    class1 var67 = new class1();
                                    var67.field3 = var9;
                                    var67.field7 = var9.field2634;
                                    field441.method3271(var67);
                                }
                                if (field436 > var9.field2654 && var9.field2635 != null) {
                                    class1 var68 = new class1();
                                    var68.field3 = var9;
                                    var68.field7 = var9.field2635;
                                    field441.method3271(var68);
                                }
                                if (field437 > var9.field2654 && var9.field2636 != null) {
                                    class1 var69 = new class1();
                                    var69.field3 = var9;
                                    var69.field7 = var9.field2636;
                                    field441.method3271(var69);
                                }
                                var9.field2654 = field303;
                                if (var9.field2537 != null) {
                                    for (int var70 = 0; var70 < field353; var70++) {
                                        class1 var71 = new class1();
                                        var71.field3 = var9;
                                        var71.field8 = field462[var70];
                                        var71.field1 = field461[var70];
                                        var71.field7 = var9.field2537;
                                        field441.method3271(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2596 && field271 == null && Statics.field24 == null && !field383) {
                            if ((var9.field2536 >= 0 || var9.field2562 != 0) && class127.field2007 >= var12 && class127.field2008 >= var13 && class127.field2007 < var14 && class127.field2008 < var15) {
                                if (var9.field2536 >= 0) {
                                    Statics.field500 = arg0[var9.field2536];
                                } else {
                                    Statics.field500 = var9;
                                }
                            }
                            if (var9.field2545 == 8 && class127.field2007 >= var12 && class127.field2008 >= var13 && class127.field2007 < var14 && class127.field2008 < var15) {
                                Statics.field1649 = var9;
                            }
                            if (var9.field2559 > var9.field2649) {
                                Statics.method1597(var9, var9.field2552 + var10, var11, var9.field2649, var9.field2559, class127.field2007, class127.field2008);
                            }
                        }
                    } else if ((field473 == 0 || field473 == 3) && (class127.field2004 == 1 || !Statics.field697 && class127.field2004 == 4)) {
                        int var26 = class127.field2013 - 25 - var10;
                        int var27 = class127.field2015 - 5 - var11;
                        if (var26 >= 0 && var27 >= 0 && var26 < 146 && var27 < 151 && (var26 < 0 || var26 > 23 || var27 < 117 || var27 > 142)) {
                            var26 -= 73;
                            var27 -= 75;
                            int var28 = field325 + field318 & 0x7FF;
                            int var29 = class84.field1435[var28];
                            int var30 = class84.field1457[var28];
                            int var31 = (field313 + 256) * var29 >> 8;
                            int var32 = (field313 + 256) * var30 >> 8;
                            int var33 = var26 * var32 + var27 * var31 >> 11;
                            int var34 = var27 * var32 - var26 * var31 >> 11;
                            int var35 = Statics.field590.field760 + var33 >> 7;
                            int var36 = Statics.field590.field716 - var34 >> 7;
                            field282.method2366(118);
                            field282.method2124(18);
                            field282.method2168(Statics.field551 + var36);
                            field282.method2270(class124.field1977[82] ? (class124.field1977[81] ? 2 : 1) : 0);
                            field282.method2169(Statics.field1557 + var35);
                            field282.method2124(var26);
                            field282.method2124(var27);
                            field282.method2132(field325);
                            field282.method2124(57);
                            field282.method2124(field318);
                            field282.method2124(field313);
                            field282.method2124(89);
                            field282.method2132(Statics.field590.field760);
                            field282.method2132(Statics.field590.field716);
                            field282.method2124(63);
                            field471 = var35;
                            field472 = var36;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("eo.ca(IIB)V")
    public static final void method2709(int arg0, int arg1) {
        if (class153.method2811(arg0)) {
            method2325(Statics.field2535[arg0], arg1);
        }
    }

    @ObfuscatedName("dy.cr([Lep;II)V")
    public static final void method2325(class153[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class153 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2545 == 0) {
                    if (var3.field2560 != null) {
                        method2325(var3.field2560, arg1);
                    }
                    class4 var4 = (class4) field403.method3244((long) var3.field2543);
                    if (var4 != null) {
                        method2709(var4.field54, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2544 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field7 = var3.field2544;
                    class32.method1424(var5);
                }
                if (arg1 == 1 && var3.field2638 != null) {
                    if (var3.field2656 >= 0) {
                        class153 var6 = class153.method2702(var3.field2543);
                        if (var6 == null || var6.field2560 == null || var3.field2656 >= var6.field2560.length || var6.field2560[var3.field2656] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field7 = var3.field2638;
                    class32.method1424(var7);
                }
            }
        }
    }

    @ObfuscatedName("cm.cl(Lep;III)V")
    public static final void method2072(class153 arg0, int arg1, int arg2) {
        if (field271 != null || field383 || arg0 == null) {
            return;
        }
        class153 var3 = method2810(arg0);
        if (var3 == null) {
            var3 = arg0.field2605;
        }
        if (var3 == null) {
            return;
        }
        field271 = arg0;
        class153 var5 = method2810(arg0);
        if (var5 == null) {
            var5 = arg0.field2605;
        }
        field415 = var5;
        field248 = arg1;
        field417 = arg2;
        Statics.field426 = 0;
        field324 = false;
        if (field258 > 0) {
            method436(field258 - 1);
        }
        return;
    }

    @ObfuscatedName("df.cy(B)V")
    public static final void method2551() {
        method2520(field271);
        Statics.field426++;
        if (field422 && field419) {
            int var0 = class127.field2007;
            int var1 = class127.field2008;
            int var2 = var0 - field248;
            int var3 = var1 - field417;
            if (var2 < field484) {
                var2 = field484;
            }
            if (field271.field2552 + var2 > field484 + field415.field2552) {
                var2 = field484 + field415.field2552 - field271.field2552;
            }
            if (var3 < field421) {
                var3 = field421;
            }
            if (field271.field2649 + var3 > field421 + field415.field2649) {
                var3 = field421 + field415.field2649 - field271.field2649;
            }
            int var4 = var2 - field253;
            int var5 = var3 - field474;
            int var6 = field271.field2606;
            if (Statics.field426 > field271.field2629 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field324 = true;
            }
            int var7 = field415.field2556 + (var2 - field484);
            int var8 = field415.field2557 + (var3 - field421);
            if (field271.field2619 != null && field324) {
                class1 var9 = new class1();
                var9.field3 = field271;
                var9.field4 = var7;
                var9.field9 = var8;
                var9.field7 = field271.field2619;
                class32.method1424(var9);
            }
            if (class127.field2006 == 0) {
                if (field324) {
                    if (field271.field2620 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field271;
                        var10.field4 = var7;
                        var10.field9 = var8;
                        var10.field15 = field418;
                        var10.field7 = field271.field2620;
                        class32.method1424(var10);
                    }
                    if (field418 != null && method2810(field271) != null) {
                        field282.method2366(217);
                        field282.method2169(field271.field2656);
                        field282.method2169(field418.field2586);
                        field282.method2125(field418.field2543);
                        field282.method2222(field271.field2543);
                        field282.method2170(field418.field2656);
                        field282.method2168(field271.field2586);
                    }
                } else if ((field293 == 1 || method2383(field258 - 1)) && field258 > 2) {
                    method2076(field253 + field248, field474 + field417);
                } else if (field258 > 0) {
                    method2601(field253 + field248, field474 + field417);
                }
                field271 = null;
            }
        } else if (Statics.field426 > 1) {
            field271 = null;
        }
    }

    @ObfuscatedName("i.ci(IB)V")
    public static void method436(int arg0) {
        Statics.field1100 = new class27();
        Statics.field1100.field629 = field390[arg0];
        Statics.field1100.field623 = field330[arg0];
        Statics.field1100.field631 = field387[arg0];
        Statics.field1100.field624 = field388[arg0];
        Statics.field1100.field626 = field389[arg0];
    }

    @ObfuscatedName("es.co(III)V")
    public static void method2601(int arg0, int arg1) {
        Statics.method890(Statics.field1100, arg0, arg1);
        Statics.field1100 = null;
    }

    @ObfuscatedName("de.cf(Lep;I)V")
    public static void method2520(class153 arg0) {
        if (field238 == arg0.field2659) {
            field375[arg0.field2658] = true;
        }
    }

    @ObfuscatedName("ee.cu(I)V")
    public static void method2705() {
        for (class4 var0 = (class4) field403.method3252(); var0 != null; var0 = (class4) field403.method3248()) {
            int var1 = var0.field54;
            if (class153.method2811(var1)) {
                boolean var2 = true;
                class153[] var3 = Statics.field2535[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2596;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2879;
                    class153 var6 = class153.method2702(var5);
                    if (var6 != null) {
                        method2520(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.cc([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method146(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ai.ct(II)V")
    public static final void method542(int arg0) {
        if (!class153.method2811(arg0)) {
            return;
        }
        class153[] var1 = Statics.field2535[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3 != null) {
                var3.field2617 = 0;
                var3.field2650 = 0;
            }
        }
    }

    @ObfuscatedName("cc.cq([Lep;IB)V")
    public static final void method1975(class153[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class153 var3 = arg0[var2];
            if (var3 != null && var3.field2554 == arg1 && (!var3.field2596 || !method768(var3))) {
                if (var3.field2545 == 0) {
                    if (!var3.field2596 && method768(var3) && Statics.field500 != var3) {
                        continue;
                    }
                    method1975(arg0, var3.field2543);
                    if (var3.field2560 != null) {
                        method1975(var3.field2560, var3.field2543);
                    }
                    class4 var4 = (class4) field403.method3244((long) var3.field2543);
                    if (var4 != null) {
                        int var5 = var4.field54;
                        if (class153.method2811(var5)) {
                            method1975(Statics.field2535[var5], -1);
                        }
                    }
                }
                if (var3.field2545 == 6) {
                    if (var3.field2622 != -1 || var3.field2580 != -1) {
                        boolean var6 = method121(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2580;
                        } else {
                            var7 = var3.field2622;
                        }
                        if (var7 != -1) {
                            class38 var8 = class38.method29(var7);
                            var3.field2650 += field244;
                            while (var3.field2650 > var8.field892[var3.field2617]) {
                                var3.field2650 -= var8.field892[var3.field2617];
                                var3.field2617++;
                                if (var3.field2617 >= var8.field890.length) {
                                    var3.field2617 -= var8.field894;
                                    if (var3.field2617 < 0 || var3.field2617 >= var8.field890.length) {
                                        var3.field2617 = 0;
                                    }
                                }
                                method2520(var3);
                            }
                        }
                    }
                    if (var3.field2587 != 0 && !var3.field2596) {
                        int var9 = var3.field2587 >> 16;
                        int var10 = var3.field2587 << 16 >> 16;
                        int var11 = field244 * var9;
                        int var12 = field244 * var10;
                        var3.field2583 = var3.field2583 + var11 & 0x7FF;
                        var3.field2584 = var3.field2584 + var12 & 0x7FF;
                        method2520(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("da.ck(II)V")
    public static final void method2431(int arg0) {
        method2705();
        class20.method365();
        int var1 = class46.method127(arg0).field1039;
        if (var1 == 0) {
            return;
        }
        int var2 = class155.field2670[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class84.method1804(0.9D);
                ((class88) Statics.field1453).method1883(0.9D);
            }
            if (var2 == 2) {
                class84.method1804(0.8D);
                ((class88) Statics.field1453).method1883(0.8D);
            }
            if (var2 == 3) {
                class84.method1804(0.7D);
                ((class88) Statics.field1453).method1883(0.7D);
            }
            if (var2 == 4) {
                class84.method1804(0.6D);
                ((class88) Statics.field1453).method1883(0.6D);
            }
            class45.method92();
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
            if (field290 != var3) {
                if (field290 == 0 && field475 != -1) {
                    class162.method2875(Statics.field1550, field475, 0, var3, false);
                    field276 = false;
                } else if (var3 == 0) {
                    class162.method464();
                    field276 = false;
                } else if (class162.field2723 == 0) {
                    Statics.field2720.method3170(var3);
                } else {
                    Statics.field1807 = var3;
                }
                field290 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field477 = 127;
            }
            if (var2 == 1) {
                field477 = 96;
            }
            if (var2 == 2) {
                field477 = 64;
            }
            if (var2 == 3) {
                field477 = 32;
            }
            if (var2 == 4) {
                field477 = 0;
            }
        }
        if (var1 == 5) {
            field293 = var2;
        }
        if (var1 == 6) {
            field404 = var2;
        }
        if (var1 == 9) {
            field405 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field429 = 127;
            }
            if (var2 == 1) {
                field429 = 96;
            }
            if (var2 == 2) {
                field429 = 64;
            }
            if (var2 == 3) {
                field429 = 32;
            }
            if (var2 == 4) {
                field429 = 0;
            }
        }
        if (var1 == 17) {
            field410 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class18[] var4 = new class18[] { class18.field510, class18.field507, class18.field515 };
            field268 = (class18) class99.method531(var4, var2);
            if (field268 == null) {
                field268 = class18.field515;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field374 = -1;
        } else {
            field374 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("c.cw(Lep;I)V")
    public static final void method110(class153 arg0) {
        int var1 = arg0.field2628;
        if (var1 == 324) {
            if (field498 == -1) {
                field498 = arg0.field2642;
                field414 = arg0.field2568;
            }
            if (field497.field2688) {
                arg0.field2642 = field498;
            } else {
                arg0.field2642 = field414;
            }
        } else if (var1 == 325) {
            if (field498 == -1) {
                field498 = arg0.field2642;
                field414 = arg0.field2568;
            }
            if (field497.field2688) {
                arg0.field2642 = field414;
            } else {
                arg0.field2642 = field498;
            }
        } else if (var1 == 327) {
            arg0.field2583 = 150;
            arg0.field2584 = (int) (Math.sin((double) field245 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2610 = 5;
            arg0.field2576 = 0;
        } else if (var1 == 328) {
            arg0.field2583 = 150;
            arg0.field2584 = (int) (Math.sin((double) field245 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2610 = 5;
            arg0.field2576 = 1;
        }
    }

    @ObfuscatedName("m.cj(I)V")
    public static final void method482() {
        field282.method2366(45);
        for (class4 var0 = (class4) field403.method3252(); var0 != null; var0 = (class4) field403.method3248()) {
            if (var0.field51 == 0 || var0.field51 == 3) {
                method2404(var0, true);
            }
        }
        if (field451 != null) {
            method2520(field451);
            field451 = null;
        }
    }

    @ObfuscatedName("dj.ch(Lg;ZI)V")
    public static final void method2404(class4 arg0, boolean arg1) {
        int var2 = arg0.field54;
        int var3 = (int) arg0.field2879;
        arg0.method3365();
        if (arg1 && var2 != -1 && Statics.field1993[var2]) {
            Statics.field2593.method2740(var2);
            if (Statics.field2535[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2535[var2].length; var5++) {
                    if (Statics.field2535[var2][var5] != null) {
                        if (Statics.field2535[var2][var5].field2545 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2535[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2535[var2] = null;
                }
                Statics.field1993[var2] = false;
            }
        }
        for (class180 var6 = (class180) field444.method3252(); var6 != null; var6 = (class180) field444.method3248()) {
            if ((var6.field2879 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3365();
            }
        }
        class153 var7 = class153.method2702(var3);
        if (var7 != null) {
            method2520(var7);
        }
        method2071();
        if (field402 != -1) {
            method2709(field402, 1);
        }
    }

    @ObfuscatedName("g.cm(Lep;I)Z")
    public static final boolean method31(class153 arg0) {
        int var1 = arg0.field2628;
        if (var1 == 205) {
            field289 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field497.method2949(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field497.method2950(var4, var5 == 1);
        }
        if (var1 == 324) {
            field497.method2951(false);
        }
        if (var1 == 325) {
            field497.method2951(true);
        }
        if (var1 == 326) {
            field282.method2366(5);
            field497.method2971(field282);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cv.cb(IIIILbb;I)V")
    public static final void method1791(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method1978(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field325 + field318 & 0x7FF;
        int var7 = class84.field1435[var6];
        int var8 = class84.field1457[var6];
        int var9 = var7 * 256 / (field313 + 256);
        int var10 = var8 * 256 / (field313 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field2105.method1450(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("ct.cx(IIIILbb;I)V")
    public static final void method1978(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field325 + field318 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class84.field1435[var5];
        int var8 = class84.field1457[var5];
        int var9 = var7 * 256 / (field313 + 256);
        int var10 = var8 * 256 / (field313 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1445(Statics.field2769, arg0 + 94 + var11 - arg4.field1286 / 2 + 4, arg1 + 83 - var12 - arg4.field1287 / 2 - 4);
        } else {
            arg4.method1439(arg0 + 94 + var11 - arg4.field1286 / 2 + 4, arg1 + 83 - var12 - arg4.field1287 / 2 - 4);
        }
    }

    @ObfuscatedName("m.dx(Ljava/lang/String;ZI)Z")
    public static boolean method483(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class201.method2843(arg0, Statics.field777);
        for (int var3 = 0; var3 < field442; var3++) {
            if (var2.equalsIgnoreCase(class201.method2843(field493[var3].field220, Statics.field777)) && (!arg1 || field493[var3].field212 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class201.method2843(Statics.field590.field46, Statics.field777))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("i.di(Ljava/lang/String;I)Z")
    public static boolean method437(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class201.method2843(arg0, Statics.field777);
        for (int var2 = 0; var2 < field347; var2++) {
            class8 var3 = field273[var2];
            if (var1.equalsIgnoreCase(class201.method2843(var3.field124, Statics.field777))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class201.method2843(var3.field119, Statics.field777))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("y.dy(Ljava/lang/String;I)V")
    public static final void method13(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field442 < 200 || field367 == 1) || field442 >= 400) {
            class10.method132(30, "", class143.field2331);
            return;
        }
        String var1 = class201.method2843(arg0, Statics.field777);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field442; var2++) {
            class16 var3 = field493[var2];
            String var4 = class201.method2843(var3.field220, Statics.field777);
            if (var4 != null && var4.equals(var1)) {
                class10.method132(30, "", arg0 + class143.field2392);
                return;
            }
            if (var3.field211 != null) {
                String var5 = class201.method2843(var3.field211, Statics.field777);
                if (var5 != null && var5.equals(var1)) {
                    class10.method132(30, "", arg0 + class143.field2392);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field347; var6++) {
            class8 var7 = field273[var6];
            String var8 = class201.method2843(var7.field124, Statics.field777);
            if (var8 != null && var8.equals(var1)) {
                class10.method132(30, "", class143.field2192 + arg0 + class143.field2338);
                return;
            }
            if (var7.field119 != null) {
                String var9 = class201.method2843(var7.field119, Statics.field777);
                if (var9 != null && var9.equals(var1)) {
                    class10.method132(30, "", class143.field2192 + arg0 + class143.field2338);
                    return;
                }
            }
        }
        if (class201.method2843(Statics.field590.field46, Statics.field777).equals(var1)) {
            class10.method132(30, "", class143.field2335);
        } else {
            field282.method2366(255);
            field282.method2124(class107.method1605(arg0));
            field282.method2129(arg0);
        }
    }

    @ObfuscatedName("aj.du(B)V")
    public static final void method567() {
        field282.method2366(205);
        field282.method2124(0);
    }

    @ObfuscatedName("dk.ds(Lep;B)I")
    public static int method2591(class153 arg0) {
        class180 var1 = (class180) field444.method3244(((long) arg0.field2543 << 32) + (long) arg0.field2656);
        return var1 == null ? arg0.field2602 : var1.field2864;
    }

    @ObfuscatedName("ei.dw(Lep;I)Lep;")
    public static class153 method2810(class153 arg0) {
        int var1 = class157.method2812(method2591(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class153.method2702(arg0.field2554);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ak.db(Lep;B)Z")
    public static boolean method768(class153 arg0) {
        if (field491) {
            if (method2591(arg0) != 0) {
                return false;
            }
            if (arg0.field2545 == 0) {
                return false;
            }
        }
        return arg0.field2555;
    }

    @ObfuscatedName("k.dj(Lep;II)Ljava/lang/String;")
    public static String method2(class153 arg0, int arg1) {
        int var2 = method2591(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2540 == null) {
            return null;
        } else if (arg0.field2570 == null || arg0.field2570.length <= arg1 || arg0.field2570[arg1] == null || arg0.field2570[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2570[arg1];
        }
    }

    @ObfuscatedName("bq.dl(Lep;I)Ljava/lang/String;")
    public static String method1387(class153 arg0) {
        int var1 = method2591(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2627 == null || arg0.field2627.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2627;
        }
    }

    @ObfuscatedName("t.dm(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method147(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field384 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field384 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field384 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field384 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field384 == 4) {
            arg0 = "local";
        }
        String var3 = "runescape.com";
        return var2 + arg0 + "." + var3 + "/l=" + field247 + "/";
    }
}

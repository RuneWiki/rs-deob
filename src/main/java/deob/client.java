package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class136 {

    @ObfuscatedName("client.z")
    public static boolean field239 = true;

    @ObfuscatedName("client.e")
    public static int field240 = 1;

    @ObfuscatedName("client.g")
    public static int field241 = 0;

    @ObfuscatedName("client.m")
    public static int field242 = 0;

    @ObfuscatedName("client.l")
    public static boolean field244 = false;

    @ObfuscatedName("client.u")
    public static boolean field338 = false;

    @ObfuscatedName("client.q")
    public static int field323 = 0;

    @ObfuscatedName("client.v")
    public static int field453 = 0;

    @ObfuscatedName("client.c")
    public static boolean field301 = true;

    @ObfuscatedName("client.p")
    public static int field249 = 0;

    @ObfuscatedName("client.o")
    public static long field250 = 1L;

    @ObfuscatedName("client.t")
    public static int field252 = -1;

    @ObfuscatedName("client.w")
    public static class220[] field432 = new class220[4];

    @ObfuscatedName("client.i")
    public static int field274 = -1;

    @ObfuscatedName("client.ad")
    public static int field254 = -1;

    @ObfuscatedName("client.ak")
    public static boolean field255 = true;

    @ObfuscatedName("client.ae")
    public static boolean field256 = false;

    @ObfuscatedName("client.ax")
    public static int field257 = 0;

    @ObfuscatedName("client.al")
    public static int field431 = 0;

    @ObfuscatedName("client.ar")
    public static int field259 = 0;

    @ObfuscatedName("client.as")
    public static int field413 = 0;

    @ObfuscatedName("client.ab")
    public static int field326 = 0;

    @ObfuscatedName("client.ao")
    public static int field496 = 0;

    @ObfuscatedName("client.ac")
    public static int field366 = 0;

    @ObfuscatedName("client.az")
    public static int field264 = 0;

    @ObfuscatedName("client.at")
    public static int field265 = 0;

    @ObfuscatedName("client.aa")
    public static class111 field303 = new class111(new byte[5000]);

    @ObfuscatedName("client.ai")
    public static class19 field449 = class19.field525;

    @ObfuscatedName("client.aq")
    public static int field248 = 0;

    @ObfuscatedName("client.aj")
    public static int field428 = 0;

    @ObfuscatedName("client.ag")
    public static int field263 = 0;

    @ObfuscatedName("client.bz")
    public static int field322 = 0;

    @ObfuscatedName("client.by")
    public static int field237 = 0;

    @ObfuscatedName("client.bg")
    public static int field450 = 0;

    @ObfuscatedName("client.bv")
    public static int field275 = 0;

    @ObfuscatedName("client.bh")
    public static int field276 = 0;

    @ObfuscatedName("client.cj")
    public static class32[] field277 = new class32[32768];

    @ObfuscatedName("client.cb")
    public static int field278 = 0;

    @ObfuscatedName("client.ct")
    public static int[] field448 = new int[32768];

    @ObfuscatedName("client.cw")
    public static class114 field488 = new class114(5000);

    @ObfuscatedName("client.co")
    public static class114 field281 = new class114(5000);

    @ObfuscatedName("client.cn")
    public static class114 field484 = new class114(5000);

    @ObfuscatedName("client.cf")
    public static int field283 = 0;

    @ObfuscatedName("client.ce")
    public static int field284 = 0;

    @ObfuscatedName("client.cc")
    public static int field285 = 0;

    @ObfuscatedName("client.ca")
    public static int field280 = 0;

    @ObfuscatedName("client.cv")
    public static int field287 = 0;

    @ObfuscatedName("client.ch")
    public static int field426 = 0;

    @ObfuscatedName("client.cx")
    public static int field289 = 0;

    @ObfuscatedName("client.cy")
    public static int field290 = 0;

    @ObfuscatedName("client.cm")
    public static boolean field291 = false;

    @ObfuscatedName("client.cs")
    public static int field293 = 0;

    @ObfuscatedName("client.dg")
    public static int field294 = 0;

    @ObfuscatedName("client.do")
    public static int field295 = 1;

    @ObfuscatedName("client.dy")
    public static int field296 = 0;

    @ObfuscatedName("client.di")
    public static int field297 = 1;

    @ObfuscatedName("client.dl")
    public static int field298 = 0;

    @ObfuscatedName("client.dw")
    public static boolean field414 = false;

    @ObfuscatedName("client.da")
    public static int[][][] field266 = new int[4][13][13];

    @ObfuscatedName("client.dd")
    public static final int[] field302 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dz")
    public static int field309 = 0;

    @ObfuscatedName("client.dh")
    public static int field304 = 2;

    @ObfuscatedName("client.du")
    public static int field305 = 0;

    @ObfuscatedName("client.de")
    public static int field306 = 2;

    @ObfuscatedName("client.dx")
    public static int field307 = 0;

    @ObfuscatedName("client.dp")
    public static int field308 = 1;

    @ObfuscatedName("client.dv")
    public static int field348 = 0;

    @ObfuscatedName("client.eu")
    public static int field310 = 0;

    @ObfuscatedName("client.ek")
    public static int field311 = 2;

    @ObfuscatedName("client.eq")
    public static int field312 = 0;

    @ObfuscatedName("client.en")
    public static int field345 = 1;

    @ObfuscatedName("client.em")
    public static int field314 = 0;

    @ObfuscatedName("client.ej")
    public static int field315 = 0;

    @ObfuscatedName("client.ez")
    public static int field247 = 2301979;

    @ObfuscatedName("client.ef")
    public static int field318 = 5063219;

    @ObfuscatedName("client.ep")
    public static int field445 = 3353893;

    @ObfuscatedName("client.ei")
    public static int field506 = 7759444;

    @ObfuscatedName("client.et")
    public static boolean field321 = false;

    @ObfuscatedName("client.eg")
    public static int field383 = 0;

    @ObfuscatedName("client.ft")
    public static int field261 = 128;

    @ObfuscatedName("client.fq")
    public static int field324 = 0;

    @ObfuscatedName("client.ff")
    public static int field325 = 0;

    @ObfuscatedName("client.fy")
    public static int field437 = 0;

    @ObfuscatedName("client.fc")
    public static int field327 = 0;

    @ObfuscatedName("client.fp")
    public static int field520 = 0;

    @ObfuscatedName("client.fh")
    public static int field329 = 0;

    @ObfuscatedName("client.fe")
    public static boolean field330 = false;

    @ObfuscatedName("client.fu")
    public static int field331 = 0;

    @ObfuscatedName("client.fb")
    public static int field451 = 0;

    @ObfuscatedName("client.fr")
    public static int field430 = 50;

    @ObfuscatedName("client.fa")
    public static int[] field421 = new int[field430];

    @ObfuscatedName("client.fg")
    public static int[] field335 = new int[field430];

    @ObfuscatedName("client.fo")
    public static int[] field336 = new int[field430];

    @ObfuscatedName("client.fj")
    public static int[] field337 = new int[field430];

    @ObfuscatedName("client.fm")
    public static int[] field272 = new int[field430];

    @ObfuscatedName("client.fw")
    public static int[] field319 = new int[field430];

    @ObfuscatedName("client.fd")
    public static int[] field340 = new int[field430];

    @ObfuscatedName("client.fi")
    public static String[] field341 = new String[field430];

    @ObfuscatedName("client.fz")
    public static int[][] field342 = new int[104][104];

    @ObfuscatedName("client.gl")
    public static int field343 = 0;

    @ObfuscatedName("client.gp")
    public static int field344 = -1;

    @ObfuscatedName("client.gx")
    public static int field258 = -1;

    @ObfuscatedName("client.go")
    public static int field346 = 0;

    @ObfuscatedName("client.gj")
    public static int field347 = 0;

    @ObfuscatedName("client.gi")
    public static int field410 = 0;

    @ObfuscatedName("client.gv")
    public static int field349 = 0;

    @ObfuscatedName("client.gq")
    public static int field350 = 0;

    @ObfuscatedName("client.gn")
    public static int field351 = 0;

    @ObfuscatedName("client.gb")
    public static int field352 = 0;

    @ObfuscatedName("client.gu")
    public static int field353 = 0;

    @ObfuscatedName("client.gm")
    public static int field354 = 0;

    @ObfuscatedName("client.gc")
    public static int field498 = 0;

    @ObfuscatedName("client.ga")
    public static boolean field356 = false;

    @ObfuscatedName("client.gy")
    public static int field357 = 0;

    @ObfuscatedName("client.gk")
    public static int field358 = 0;

    @ObfuscatedName("client.ge")
    public static class3[] field359 = new class3[2048];

    @ObfuscatedName("client.gg")
    public static int field360 = 0;

    @ObfuscatedName("client.gs")
    public static int[] field407 = new int[2048];

    @ObfuscatedName("client.gr")
    public static int field362 = 0;

    @ObfuscatedName("client.gh")
    public static int[] field459 = new int[2048];

    @ObfuscatedName("client.hg")
    public static class111[] field364 = new class111[2048];

    @ObfuscatedName("client.hl")
    public static int field365 = -1;

    @ObfuscatedName("client.hq")
    public static int field427 = 0;

    @ObfuscatedName("client.ht")
    public static int field299 = 0;

    @ObfuscatedName("client.hd")
    public static int[] field368 = new int[1000];

    @ObfuscatedName("client.ho")
    public static final int[] field369 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hh")
    public static String[] field424 = new String[8];

    @ObfuscatedName("client.hf")
    public static boolean[] field260 = new boolean[8];

    @ObfuscatedName("client.hx")
    public static int[] field372 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hm")
    public static int field373 = -1;

    @ObfuscatedName("client.hy")
    public static class190[][][] field394 = new class190[4][104][104];

    @ObfuscatedName("client.hv")
    public static class190 field375 = new class190();

    @ObfuscatedName("client.hb")
    public static class190 field470 = new class190();

    @ObfuscatedName("client.ha")
    public static class190 field377 = new class190();

    @ObfuscatedName("client.hu")
    public static int[] field378 = new int[25];

    @ObfuscatedName("client.hj")
    public static int[] field379 = new int[25];

    @ObfuscatedName("client.hn")
    public static int[] field380 = new int[25];

    @ObfuscatedName("client.hs")
    public static int field409 = 0;

    @ObfuscatedName("client.hz")
    public static boolean field382 = false;

    @ObfuscatedName("client.ih")
    public static int field317 = 0;

    @ObfuscatedName("client.is")
    public static int[] field384 = new int[500];

    @ObfuscatedName("client.io")
    public static int[] field385 = new int[500];

    @ObfuscatedName("client.ik")
    public static int[] field386 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field387 = new int[500];

    @ObfuscatedName("client.ip")
    public static String[] field245 = new String[500];

    @ObfuscatedName("client.iq")
    public static String[] field396 = new String[500];

    @ObfuscatedName("client.id")
    public static int field390 = -1;

    @ObfuscatedName("client.iv")
    public static int field391 = -1;

    @ObfuscatedName("client.ii")
    public static int field392 = 0;

    @ObfuscatedName("client.ia")
    public static int field393 = 50;

    @ObfuscatedName("client.iy")
    public static int field469 = 0;

    @ObfuscatedName("client.it")
    public static String field395 = null;

    @ObfuscatedName("client.ij")
    public static boolean field444 = false;

    @ObfuscatedName("client.if")
    public static int field397 = -1;

    @ObfuscatedName("client.ig")
    public static int field398 = -1;

    @ObfuscatedName("client.in")
    public static String field399 = null;

    @ObfuscatedName("client.jy")
    public static String field400 = null;

    @ObfuscatedName("client.jg")
    public static int field401 = -1;

    @ObfuscatedName("client.jx")
    public static class187 field402 = new class187(8);

    @ObfuscatedName("client.js")
    public static int field403 = 0;

    @ObfuscatedName("client.ju")
    public static int field251 = 0;

    @ObfuscatedName("client.jd")
    public static class164 field316 = null;

    @ObfuscatedName("client.jh")
    public static int field406 = 0;

    @ObfuscatedName("client.jb")
    public static int field376 = 0;

    @ObfuscatedName("client.je")
    public static int field408 = 0;

    @ObfuscatedName("client.jo")
    public static int field508 = -1;

    @ObfuscatedName("client.jq")
    public static boolean field253 = false;

    @ObfuscatedName("client.jk")
    public static boolean field411 = false;

    @ObfuscatedName("client.ja")
    public static boolean field412 = false;

    @ObfuscatedName("client.jm")
    public static class164 field423 = null;

    @ObfuscatedName("client.jt")
    public static class164 field355 = null;

    @ObfuscatedName("client.jj")
    public static class164 field415 = null;

    @ObfuscatedName("client.jr")
    public static int field416 = 0;

    @ObfuscatedName("client.jn")
    public static int field417 = 0;

    @ObfuscatedName("client.jp")
    public static class164 field381 = null;

    @ObfuscatedName("client.ji")
    public static boolean field320 = false;

    @ObfuscatedName("client.jv")
    public static int field492 = -1;

    @ObfuscatedName("client.jw")
    public static int field440 = -1;

    @ObfuscatedName("client.jc")
    public static boolean field422 = false;

    @ObfuscatedName("client.jf")
    public static int field388 = -1;

    @ObfuscatedName("client.jl")
    public static int field288 = -1;

    @ObfuscatedName("client.jz")
    public static boolean field425 = false;

    @ObfuscatedName("client.kj")
    public static int field404 = 1;

    @ObfuscatedName("client.ko")
    public static int[] field262 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field313 = 0;

    @ObfuscatedName("client.km")
    public static int[] field429 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field418 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field419 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field497 = 0;

    @ObfuscatedName("client.kc")
    public static int field433 = 0;

    @ObfuscatedName("client.ka")
    public static int field434 = 0;

    @ObfuscatedName("client.ku")
    public static int field435 = 0;

    @ObfuscatedName("client.kv")
    public static int field436 = 0;

    @ObfuscatedName("client.ki")
    public static int field334 = 0;

    @ObfuscatedName("client.kw")
    public static int field438 = 0;

    @ObfuscatedName("client.kd")
    public static int[] field439 = new int[2000];

    @ObfuscatedName("client.kz")
    public static String[] field333 = new String[1000];

    @ObfuscatedName("client.kg")
    public static int field441 = 0;

    @ObfuscatedName("client.kp")
    public static class190 field442 = new class190();

    @ObfuscatedName("client.kf")
    public static class190 field443 = new class190();

    @ObfuscatedName("client.kr")
    public static class190 field361 = new class190();

    @ObfuscatedName("client.ld")
    public static class187 field270 = new class187(512);

    @ObfuscatedName("client.lx")
    public static int field446 = 0;

    @ObfuscatedName("client.la")
    public static int field447 = -2;

    @ObfuscatedName("client.li")
    public static boolean[] field389 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static boolean[] field273 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static boolean[] field493 = new boolean[100];

    @ObfuscatedName("client.lw")
    public static int[] field514 = new int[100];

    @ObfuscatedName("client.lq")
    public static int[] field452 = new int[100];

    @ObfuscatedName("client.lc")
    public static int[] field495 = new int[100];

    @ObfuscatedName("client.le")
    public static int[] field454 = new int[100];

    @ObfuscatedName("client.lv")
    public static int field455 = 0;

    @ObfuscatedName("client.lk")
    public static long field501 = 0L;

    @ObfuscatedName("client.ll")
    public static boolean field457 = true;

    @ObfuscatedName("client.lm")
    public static int field458 = 765;

    @ObfuscatedName("client.lb")
    public static int field504 = 1;

    @ObfuscatedName("client.lp")
    public static int[] field460 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ly")
    public static int field279 = 0;

    @ObfuscatedName("client.lh")
    public static int field462 = 0;

    @ObfuscatedName("client.ln")
    public static String field463 = "";

    @ObfuscatedName("client.mw")
    public static long[] field464 = new long[100];

    @ObfuscatedName("client.mh")
    public static int field465 = 0;

    @ObfuscatedName("client.mg")
    public static int field466 = 0;

    @ObfuscatedName("client.ma")
    public static int[] field467 = new int[128];

    @ObfuscatedName("client.mc")
    public static int[] field468 = new int[128];

    @ObfuscatedName("client.md")
    public static long field282 = -1L;

    @ObfuscatedName("client.me")
    public static String field286 = null;

    @ObfuscatedName("client.ms")
    public static String field471 = null;

    @ObfuscatedName("client.ml")
    public static int field363 = -1;

    @ObfuscatedName("client.mm")
    public static int field271 = 0;

    @ObfuscatedName("client.mu")
    public static int[] field474 = new int[1000];

    @ObfuscatedName("client.mr")
    public static int[] field475 = new int[1000];

    @ObfuscatedName("client.mi")
    public static class74[] field476 = new class74[1000];

    @ObfuscatedName("client.mk")
    public static int field477 = 0;

    @ObfuscatedName("client.mn")
    public static int field478 = 0;

    @ObfuscatedName("client.nk")
    public static int field479 = 0;

    @ObfuscatedName("client.ne")
    public static int field480 = 255;

    @ObfuscatedName("client.nh")
    public static int field481 = -1;

    @ObfuscatedName("client.np")
    public static boolean field482 = false;

    @ObfuscatedName("client.ng")
    public static int field483 = 127;

    @ObfuscatedName("client.nm")
    public static int field472 = 127;

    @ObfuscatedName("client.nb")
    public static int field485 = 0;

    @ObfuscatedName("client.nq")
    public static int[] field486 = new int[50];

    @ObfuscatedName("client.nx")
    public static int[] field487 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field521 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field489 = new int[50];

    @ObfuscatedName("client.no")
    public static class54[] field490 = new class54[50];

    @ObfuscatedName("client.nf")
    public static boolean field491 = false;

    @ObfuscatedName("client.od")
    public static boolean[] field473 = new boolean[5];

    @ObfuscatedName("client.oe")
    public static int[] field246 = new int[5];

    @ObfuscatedName("client.oi")
    public static int[] field494 = new int[5];

    @ObfuscatedName("client.of")
    public static int[] field456 = new int[5];

    @ObfuscatedName("client.ok")
    public static int[] field461 = new int[5];

    @ObfuscatedName("client.og")
    public static short field420 = 256;

    @ObfuscatedName("client.on")
    public static short field339 = 205;

    @ObfuscatedName("client.oq")
    public static short field499 = 256;

    @ObfuscatedName("client.oc")
    public static short field500 = 320;

    @ObfuscatedName("client.ot")
    public static short field269 = 1;

    @ObfuscatedName("client.os")
    public static short field502 = 32767;

    @ObfuscatedName("client.oy")
    public static short field503 = 1;

    @ObfuscatedName("client.ob")
    public static short field367 = 32767;

    @ObfuscatedName("client.ov")
    public static int field505 = 0;

    @ObfuscatedName("client.op")
    public static int field370 = 0;

    @ObfuscatedName("client.om")
    public static int field507 = 0;

    @ObfuscatedName("client.ou")
    public static int field374 = 0;

    @ObfuscatedName("client.ow")
    public static int field509 = 0;

    @ObfuscatedName("client.oo")
    public static int field510 = 0;

    @ObfuscatedName("client.ol")
    public static int field511 = 0;

    @ObfuscatedName("client.oj")
    public static class17[] field512 = new class17[400];

    @ObfuscatedName("client.pk")
    public static class186 field513 = new class186();

    @ObfuscatedName("client.pa")
    public static int field405 = 0;

    @ObfuscatedName("client.pj")
    public static class8[] field515 = new class8[400];

    @ObfuscatedName("client.py")
    public static class170 field516 = new class170();

    @ObfuscatedName("client.pu")
    public static int field517 = -1;

    @ObfuscatedName("client.ps")
    public static int field518 = -1;

    @ObfuscatedName("client.pb")
    public static class211[] field519 = new class211[8];

    @ObfuscatedName("client.z(B)V")
    public final void method178() {
    }

    public final void init() {
        if (!this.method2744()) {
            return;
        }
        class181[] var1 = class181.method2699();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class181 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2960);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2960)) {
                    case 1:
                        Statics.field1957 = Integer.parseInt(var4);
                        break;
                    case 2:
                        Statics.field1096 = Integer.parseInt(var4);
                        break;
                    case 3:
                        Statics.field188 = var4;
                        break;
                    case 4:
                        field241 = Integer.parseInt(var4);
                        break;
                    case 5:
                        field323 = Integer.parseInt(var4);
                    case 6:
                    case 10:
                    case 11:
                    default:
                        break;
                    case 7:
                        Statics.field2129 = class144.method756(Integer.parseInt(var4));
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class2.field19)) {
                        }
                        break;
                    case 9:
                        Statics.field243 = (class145) class101.method164(class145.method660(), Integer.parseInt(var4));
                        if (Statics.field243 == class145.field2177) {
                            Statics.field2944 = class203.field3026;
                        } else {
                            Statics.field2944 = class203.field3031;
                        }
                        break;
                    case 12:
                        field240 = Integer.parseInt(var4);
                        break;
                    case 13:
                        Statics.field173 = var4;
                        break;
                    case 14:
                        if (var4.equalsIgnoreCase(class2.field19)) {
                            field244 = true;
                        } else {
                            field244 = false;
                        }
                        break;
                    case 15:
                        field242 = Integer.parseInt(var4);
                }
            }
        }
        method478();
        Statics.field3 = this.getCodeBase().getHost();
        String var5 = Statics.field2129.field2175;
        byte var6 = 0;
        try {
            class141.method154("oldschool", var5, var6, 16);
        } catch (Exception var8) {
            class140.method1864((String) null, var8);
        }
        Statics.field238 = this;
        this.method2751(765, 503, 83);
    }

    @ObfuscatedName("client.e(I)V")
    public static final void method478() {
        class81.field1447 = false;
        field338 = false;
    }

    @ObfuscatedName("client.g(I)V")
    public final void method180() {
        Statics.field1546 = field242 == 0 ? 43594 : field240 + 40000;
        Statics.field660 = field242 == 0 ? 443 : field240 + 50000;
        Statics.field221 = Statics.field1546;
        Statics.field1856 = class165.field2788;
        Statics.field2815 = class165.field2783;
        Statics.field232 = class165.field2784;
        Statics.field543 = class165.field2785;
        if (Statics.field2000.toLowerCase().indexOf("microsoft") == -1) {
            class129.field2027[44] = 71;
            class129.field2027[45] = 26;
            class129.field2027[46] = 72;
            class129.field2027[47] = 73;
            class129.field2027[59] = 57;
            class129.field2027[61] = 27;
            class129.field2027[91] = 42;
            class129.field2027[92] = 74;
            class129.field2027[93] = 43;
            class129.field2027[192] = 28;
            class129.field2027[222] = 58;
            class129.field2027[520] = 59;
        } else {
            class129.field2027[186] = 57;
            class129.field2027[187] = 27;
            class129.field2027[188] = 71;
            class129.field2027[189] = 26;
            class129.field2027[190] = 72;
            class129.field2027[191] = 73;
            class129.field2027[192] = 58;
            class129.field2027[219] = 42;
            class129.field2027[220] = 74;
            class129.field2027[221] = 43;
            class129.field2027[222] = 59;
            class129.field2027[223] = 28;
        }
        Canvas var1 = Statics.field910;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class129.field2037);
        var1.addFocusListener(class129.field2037);
        Canvas var2 = Statics.field910;
        var2.addMouseListener(class132.field2068);
        var2.addMouseMotionListener(class132.field2068);
        var2.addFocusListener(class132.field2068);
        Statics.field922 = class123.method2167();
        if (Statics.field922 != null) {
            Statics.field922.method2564(Statics.field910);
        }
        Statics.field1007 = new class126(255, class141.field2137, class141.field2138, 500000);
        class218 var3 = null;
        class9 var4 = new class9();
        try {
            var3 = class141.method654("", Statics.field243.field2182, false);
            byte[] var5 = new byte[(int) var3.method3741()];
            int var7;
            for (int var6 = 0; var6 < var5.length; var6 += var7) {
                var7 = var3.method3755(var5, var6, var5.length - var6);
                if (var7 == -1) {
                    throw new IOException();
                }
            }
            var4 = new class9(new class111(var5));
        } catch (Exception var14) {
        }
        try {
            if (var3 != null) {
                var3.method3740();
            }
        } catch (Exception var13) {
        }
        Statics.field608 = var4;
        Statics.field722 = this.getToolkit().getSystemClipboard();
        String var12 = Statics.field1851;
        class130.field2042 = this;
        class130.field2040 = var12;
        if (field242 != 0) {
            field256 = true;
        }
        method143(Statics.field608.field137);
    }

    @ObfuscatedName("client.f(I)V")
    public final void method368() {
        field249++;
        this.method184();
        while (true) {
            class190 var1 = class161.field2599;
            class160 var2;
            synchronized (class161.field2599) {
                var2 = (class160) class161.field2601.method3480();
            }
            if (var2 == null) {
                Statics.method4();
                method2561();
                class129 var4 = class129.field2037;
                synchronized (class129.field2037) {
                    class129.field2038++;
                    class129.field2035 = class129.field2021;
                    class129.field2032 = 0;
                    if (class129.field2030 >= 0) {
                        while (class129.field2031 != class129.field2030) {
                            int var6 = class129.field2033[class129.field2031];
                            class129.field2031 = class129.field2031 + 1 & 0x7F;
                            if (var6 < 0) {
                                class129.field2020[~var6] = false;
                            } else {
                                if (!class129.field2020[var6] && class129.field2032 < class129.field2039.length - 1) {
                                    class129.field2039[++class129.field2032 - 1] = var6;
                                }
                                class129.field2020[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class129.field2020[var5] = false;
                        }
                        class129.field2030 = class129.field2031;
                    }
                    class129.field2021 = class129.field2024;
                }
                Statics.method79();
                if (Statics.field922 != null) {
                    int var8 = Statics.field922.method2578();
                    field441 = var8;
                }
                if (field453 == 0) {
                    Statics.method3();
                    class136.method1867();
                } else if (field453 == 5) {
                    class30.method1960(this);
                    Statics.method3();
                    Statics.field1730.method2589();
                    for (int var9 = 0; var9 < 32; var9++) {
                        field2094[var9] = 0L;
                    }
                    for (int var10 = 0; var10 < 32; var10++) {
                        field2103[var10] = 0L;
                    }
                    Statics.field1605 = 0;
                } else if (field453 == 10 || field453 == 11) {
                    class30.method1960(this);
                } else if (field453 == 20) {
                    class30.method1960(this);
                    method1856();
                } else if (field453 == 25) {
                    method544();
                }
                if (field453 == 30) {
                    if (field257 > 1) {
                        field257--;
                    }
                    if (field287 > 0) {
                        field287--;
                    }
                    if (field291) {
                        field291 = false;
                        if (field287 > 0) {
                            method2528();
                        } else {
                            method2731(40);
                            Statics.field1694 = Statics.field1617;
                            Statics.field1617 = null;
                        }
                    } else {
                        if (!field382) {
                            field245[0] = class148.field2441;
                            field396[0] = "";
                            field386[0] = 1006;
                            field317 = 1;
                        }
                        for (int var11 = 0; var11 < 100 && method179(); var11++) {
                        }
                        if (field453 == 30) {
                            while (class202.method960()) {
                                field488.method2480(246);
                                field488.method2213(0);
                                int var12 = field488.field1889;
                                class202.method2937(field488);
                                field488.method2225(field488.field1889 - var12);
                            }
                            Object var13 = Statics.field332.field174;
                            synchronized (Statics.field332.field174) {
                                if (!field239) {
                                    Statics.field332.field175 = 0;
                                } else if (class132.field2067 != 0 || Statics.field332.field175 >= 40) {
                                    field488.method2480(118);
                                    field488.method2213(0);
                                    int var14 = field488.field1889;
                                    int var15 = 0;
                                    for (int var16 = 0; var16 < Statics.field332.field175 && field488.field1889 - var14 < 240; var16++) {
                                        var15++;
                                        int var17 = Statics.field332.field177[var16];
                                        if (var17 < 0) {
                                            var17 = 0;
                                        } else if (var17 > 502) {
                                            var17 = 502;
                                        }
                                        int var18 = Statics.field332.field179[var16];
                                        if (var18 < 0) {
                                            var18 = 0;
                                        } else if (var18 > 764) {
                                            var18 = 764;
                                        }
                                        int var19 = var17 * 765 + var18;
                                        if (Statics.field332.field177[var16] == -1 && Statics.field332.field179[var16] == -1) {
                                            var18 = -1;
                                            var17 = -1;
                                            var19 = 524287;
                                        }
                                        if (field252 != var18 || field274 != var17) {
                                            int var20 = var18 - field252;
                                            field252 = var18;
                                            int var21 = var17 - field274;
                                            field274 = var17;
                                            if (field254 < 8 && var20 >= -32 && var20 <= 31 && var21 >= -32 && var21 <= 31) {
                                                var20 += 32;
                                                var21 += 32;
                                                field488.method2214((field254 << 12) + (var20 << 6) + var21);
                                                field254 = 0;
                                            } else if (field254 < 8) {
                                                field488.method2234((field254 << 19) + 8388608 + var19);
                                                field254 = 0;
                                            } else {
                                                field488.method2216((field254 << 19) + -1073741824 + var19);
                                                field254 = 0;
                                            }
                                        } else if (field254 < 2047) {
                                            field254++;
                                        }
                                    }
                                    field488.method2225(field488.field1889 - var14);
                                    if (var15 >= Statics.field332.field175) {
                                        Statics.field332.field175 = 0;
                                    } else {
                                        Statics.field332.field175 -= var15;
                                        for (int var22 = 0; var22 < Statics.field332.field175; var22++) {
                                            Statics.field332.field179[var22] = Statics.field332.field179[var15 + var22];
                                            Statics.field332.field177[var22] = Statics.field332.field177[var15 + var22];
                                        }
                                    }
                                }
                            }
                            if (class132.field2067 == 1 || !Statics.field699 && class132.field2067 == 4 || class132.field2067 == 2) {
                                long var24 = (class132.field2056 - field250 * -1L) / 50L;
                                if (var24 > 4095L) {
                                    var24 = 4095L;
                                }
                                field250 = class132.field2056 * -1L;
                                int var26 = class132.field2063;
                                if (var26 < 0) {
                                    var26 = 0;
                                } else if (var26 > Statics.field118) {
                                    var26 = Statics.field118;
                                }
                                int var27 = class132.field2069;
                                if (var27 < 0) {
                                    var27 = 0;
                                } else if (var27 > Statics.field1461) {
                                    var27 = Statics.field1461;
                                }
                                int var28 = (int) var24;
                                field488.method2480(89);
                                field488.method2214((class132.field2067 == 2 ? 1 : 0) + (var28 << 1));
                                field488.method2214(var27);
                                field488.method2214(var26);
                            }
                            if (class129.field2032 > 0) {
                                field488.method2480(83);
                                field488.method2214(0);
                                int var29 = field488.field1889;
                                long var30 = class107.method1670();
                                for (int var32 = 0; var32 < class129.field2032; var32++) {
                                    long var33 = var30 - field282;
                                    if (var33 > 16777215L) {
                                        var33 = 16777215L;
                                    }
                                    field282 = var30;
                                    field488.method2268((int) var33);
                                    field488.method2213(class129.field2039[var32]);
                                }
                                field488.method2321(field488.field1889 - var29);
                            }
                            if (field329 > 0) {
                                field329--;
                            }
                            if (class129.field2020[96] || class129.field2020[97] || class129.field2020[98] || class129.field2020[99]) {
                                field330 = true;
                            }
                            if (field330 && field329 <= 0) {
                                field329 = 20;
                                field330 = false;
                                field488.method2480(88);
                                field488.method2214(field324);
                                field488.method2262(field261);
                            }
                            if (Statics.field3029 && !field255) {
                                field255 = true;
                                field488.method2480(106);
                                field488.method2213(1);
                            }
                            if (!Statics.field3029 && field255) {
                                field255 = false;
                                field488.method2480(106);
                                field488.method2213(0);
                            }
                            if (field338 && Statics.field2136 != field293) {
                                method614(Statics.field965, Statics.field86, Statics.field2136, Statics.field1710.field751[0], Statics.field1710.field803[0]);
                            } else if (Statics.field2136 != field363) {
                                field363 = Statics.field2136;
                                method127(Statics.field2136);
                            }
                            if (field453 == 30) {
                                for (class16 var35 = (class16) field375.method3497(); var35 != null; var35 = (class16) field375.method3475()) {
                                    if (var35.field208 > 0) {
                                        var35.field208--;
                                    }
                                    if (var35.field208 == 0) {
                                        if (var35.field201 >= 0) {
                                            int var36 = var35.field201;
                                            int var37 = var35.field205;
                                            class38 var38 = class38.method1667(var36);
                                            if (var37 == 11) {
                                                var37 = 10;
                                            }
                                            if (var37 >= 5 && var37 <= 8) {
                                                var37 = 4;
                                            }
                                            boolean var39 = var38.method716(var37);
                                            if (!var39) {
                                                continue;
                                            }
                                        }
                                        method128(var35.field211, var35.field198, var35.field199, var35.field200, var35.field201, var35.field202, var35.field205);
                                        var35.method3562();
                                    } else {
                                        if (var35.field207 > 0) {
                                            var35.field207--;
                                        }
                                        if (var35.field207 == 0 && var35.field199 >= 1 && var35.field200 >= 1 && var35.field199 <= 102 && var35.field200 <= 102) {
                                            if (var35.field204 >= 0) {
                                                int var40 = var35.field204;
                                                int var41 = var35.field197;
                                                class38 var42 = class38.method1667(var40);
                                                if (var41 == 11) {
                                                    var41 = 10;
                                                }
                                                if (var41 >= 5 && var41 <= 8) {
                                                    var41 = 4;
                                                }
                                                boolean var43 = var42.method716(var41);
                                                if (!var43) {
                                                    continue;
                                                }
                                            }
                                            method128(var35.field211, var35.field198, var35.field199, var35.field200, var35.field204, var35.field210, var35.field197);
                                            var35.field207 = -1;
                                            if (var35.field204 == var35.field201 && var35.field201 == -1) {
                                                var35.method3562();
                                            } else if (var35.field204 == var35.field201 && var35.field210 == var35.field202 && var35.field205 == var35.field197) {
                                                var35.method3562();
                                            }
                                        }
                                    }
                                }
                                int var10002;
                                for (int var44 = 0; var44 < field485; var44++) {
                                    var10002 = field521[var44]--;
                                    if (field521[var44] >= -10) {
                                        class54 var46 = field490[var44];
                                        if (var46 == null) {
                                            class54 var10000 = (class54) null;
                                            var46 = class54.method1103(Statics.field1940, field486[var44], 0);
                                            if (var46 == null) {
                                                continue;
                                            }
                                            field521[var44] += var46.method1107();
                                            field490[var44] = var46;
                                        }
                                        if (field521[var44] < 0) {
                                            int var53;
                                            if (field489[var44] == 0) {
                                                var53 = field483;
                                            } else {
                                                int var47 = (field489[var44] & 0xFF) * 128;
                                                int var48 = field489[var44] >> 16 & 0xFF;
                                                int var49 = var48 * 128 + 64 - Statics.field1710.field809;
                                                if (var49 < 0) {
                                                    var49 = -var49;
                                                }
                                                int var50 = field489[var44] >> 8 & 0xFF;
                                                int var51 = var50 * 128 + 64 - Statics.field1710.field749;
                                                if (var51 < 0) {
                                                    var51 = -var51;
                                                }
                                                int var52 = var49 + var51 - 128;
                                                if (var52 > var47) {
                                                    field521[var44] = -100;
                                                    continue;
                                                }
                                                if (var52 < 0) {
                                                    var52 = 0;
                                                }
                                                var53 = field472 * (var47 - var52) / var47;
                                            }
                                            if (var53 > 0) {
                                                class58 var54 = var46.method1104().method1137(Statics.field528);
                                                class60 var55 = class60.method1160(var54, 100, var53);
                                                var55.method1162(field487[var44] - 1);
                                                Statics.field1290.method1021(var55);
                                            }
                                            field521[var44] = -100;
                                        }
                                    } else {
                                        field485--;
                                        for (int var45 = var44; var45 < field485; var45++) {
                                            field486[var45] = field486[var45 + 1];
                                            field490[var45] = field490[var45 + 1];
                                            field487[var45] = field487[var45 + 1];
                                            field521[var45] = field521[var45 + 1];
                                            field489[var45] = field489[var45 + 1];
                                        }
                                        var44--;
                                    }
                                }
                                if (field482) {
                                    boolean var56;
                                    if (class174.field2856 == 0) {
                                        var56 = Statics.field2854.method3303();
                                    } else {
                                        var56 = true;
                                    }
                                    if (!var56) {
                                        if (field480 != 0 && field481 != -1) {
                                            class174.method3063(Statics.field593, field481, 0, field480, false);
                                        }
                                        field482 = false;
                                    }
                                }
                                field285++;
                                if (field285 <= 750) {
                                    for (int var57 = -1; var57 < field360; var57++) {
                                        int var58;
                                        if (var57 == -1) {
                                            var58 = 2047;
                                        } else {
                                            var58 = field407[var57];
                                        }
                                        class3 var59 = field359[var58];
                                        if (var59 != null) {
                                            method2064(var59, 1);
                                        }
                                    }
                                    Statics.method1866();
                                    method2889();
                                    field315++;
                                    if (field349 != 0) {
                                        field410 += 20;
                                        if (field410 >= 400) {
                                            field349 = 0;
                                        }
                                    }
                                    if (Statics.field1803 != null) {
                                        field350++;
                                        if (field350 >= 15) {
                                            method2625(Statics.field1803);
                                            Statics.field1803 = null;
                                        }
                                    }
                                    class164 var60 = Statics.field60;
                                    class164 var61 = Statics.field161;
                                    Statics.field60 = null;
                                    Statics.field161 = null;
                                    field381 = null;
                                    field422 = false;
                                    field320 = false;
                                    field466 = 0;
                                    while (true) {
                                        while (class129.method2556() && field466 < 128) {
                                            if (field408 >= 2 && class129.field2020[82] && Statics.field700 == 66) {
                                                String var62 = class11.method2714();
                                                Statics.field722.setContents(new StringSelection(var62), (ClipboardOwner) null);
                                            } else {
                                                field468[field466] = Statics.field700;
                                                field467[field466] = Statics.field1972;
                                                field466++;
                                            }
                                        }
                                        int var63 = field401;
                                        int var64 = Statics.field1461;
                                        int var65 = Statics.field118;
                                        if (class164.method3404(var63)) {
                                            method166(Statics.field2653[var63], -1, 0, 0, var64, var65, 0, 0);
                                        }
                                        field404++;
                                        while (true) {
                                            class1 var66;
                                            class164 var67;
                                            class164 var68;
                                            do {
                                                var66 = (class1) field443.method3480();
                                                if (var66 == null) {
                                                    while (true) {
                                                        class1 var69;
                                                        class164 var70;
                                                        class164 var71;
                                                        do {
                                                            var69 = (class1) field361.method3480();
                                                            if (var69 == null) {
                                                                while (true) {
                                                                    class1 var72;
                                                                    class164 var73;
                                                                    class164 var74;
                                                                    do {
                                                                        var72 = (class1) field442.method3480();
                                                                        if (var72 == null) {
                                                                            method102();
                                                                            if (field355 != null) {
                                                                                method964();
                                                                            }
                                                                            if (Statics.field139 != null) {
                                                                                method2625(Statics.field139);
                                                                                field357++;
                                                                                if (class132.field2060 == 0) {
                                                                                    if (field356) {
                                                                                        if (Statics.field2805 == Statics.field139 && field498 != field352) {
                                                                                            class164 var75 = Statics.field139;
                                                                                            byte var76 = 0;
                                                                                            if (field251 == 1 && var75.field2654 == 206) {
                                                                                                var76 = 1;
                                                                                            }
                                                                                            if (var75.field2652[field498] <= 0) {
                                                                                                var76 = 0;
                                                                                            }
                                                                                            if (class169.method1668(method2562(var75))) {
                                                                                                int var77 = field352;
                                                                                                int var78 = field498;
                                                                                                var75.field2652[var78] = var75.field2652[var77];
                                                                                                var75.field2767[var78] = var75.field2767[var77];
                                                                                                var75.field2652[var77] = -1;
                                                                                                var75.field2767[var77] = 0;
                                                                                            } else if (var76 == 1) {
                                                                                                int var79 = field352;
                                                                                                int var80 = field498;
                                                                                                while (var79 != var80) {
                                                                                                    if (var79 > var80) {
                                                                                                        var75.method3100(var79 - 1, var79);
                                                                                                        var79--;
                                                                                                    } else if (var79 < var80) {
                                                                                                        var75.method3100(var79 + 1, var79);
                                                                                                        var79++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var75.method3100(field498, field352);
                                                                                            }
                                                                                            field488.method2480(6);
                                                                                            field488.method2261(field352);
                                                                                            field488.method2214(field498);
                                                                                            field488.method2404(var76);
                                                                                            field488.method2270(Statics.field139.field2651);
                                                                                        }
                                                                                    } else if ((field409 == 1 || Statics.method3064(field317 - 1)) && field317 > 2) {
                                                                                        method2836(field353, field354);
                                                                                    } else if (field317 > 0) {
                                                                                        Statics.method2175(field353, field354);
                                                                                    }
                                                                                    field350 = 10;
                                                                                    class132.field2067 = 0;
                                                                                    Statics.field139 = null;
                                                                                } else if (field357 >= 5 && (class132.field2061 > field353 + 5 || class132.field2061 < field353 - 5 || class132.field2062 * 130670055 > field354 + 5 || class132.field2062 * 130670055 < field354 - 5)) {
                                                                                    field356 = true;
                                                                                }
                                                                            }
                                                                            if (class81.field1410 != -1) {
                                                                                int var81 = class81.field1410;
                                                                                int var82 = class81.field1425;
                                                                                field488.method2480(177);
                                                                                field488.method2213(5);
                                                                                field488.method2214(Statics.field3035 + var82);
                                                                                field488.method2262(Statics.field178 + var81);
                                                                                field488.method2404(class129.field2020[82] ? (class129.field2020[81] ? 2 : 1) : 0);
                                                                                class81.field1410 = -1;
                                                                                field346 = class132.field2069;
                                                                                field347 = class132.field2063;
                                                                                field349 = 1;
                                                                                field410 = 0;
                                                                                field477 = var81;
                                                                                field478 = var82;
                                                                            }
                                                                            if (Statics.field60 != var60) {
                                                                                if (var60 != null) {
                                                                                    method2625(var60);
                                                                                }
                                                                                if (Statics.field60 != null) {
                                                                                    method2625(Statics.field60);
                                                                                }
                                                                            }
                                                                            if (Statics.field161 != var61 && field393 == field392) {
                                                                                if (var61 != null) {
                                                                                    method2625(var61);
                                                                                }
                                                                                if (Statics.field161 != null) {
                                                                                    method2625(Statics.field161);
                                                                                }
                                                                            }
                                                                            if (Statics.field161 == null) {
                                                                                if (field392 > 0) {
                                                                                    field392--;
                                                                                }
                                                                            } else if (field392 < field393) {
                                                                                field392++;
                                                                                if (field393 == field392) {
                                                                                    method2625(Statics.field161);
                                                                                }
                                                                            }
                                                                            method591();
                                                                            if (field491) {
                                                                                method873();
                                                                            }
                                                                            for (int var83 = 0; var83 < 5; var83++) {
                                                                                var10002 = field461[var83]++;
                                                                            }
                                                                            int var84 = class132.method2516();
                                                                            int var85 = class129.field2038;
                                                                            if (var84 > 15000 && var85 > 15000) {
                                                                                field287 = 250;
                                                                                class132.field2055 = 14500;
                                                                                field488.method2480(95);
                                                                            }
                                                                            field348++;
                                                                            if (field348 > 500) {
                                                                                field348 = 0;
                                                                                int var87 = (int) (Math.random() * 8.0D);
                                                                                if ((var87 & 0x1) == 1) {
                                                                                    field309 += field304;
                                                                                }
                                                                                if ((var87 & 0x2) == 2) {
                                                                                    field305 += field306;
                                                                                }
                                                                                if ((var87 & 0x4) == 4) {
                                                                                    field307 += field308;
                                                                                }
                                                                            }
                                                                            if (field309 < -50) {
                                                                                field304 = 2;
                                                                            }
                                                                            if (field309 > 50) {
                                                                                field304 = -2;
                                                                            }
                                                                            if (field305 < -55) {
                                                                                field306 = 2;
                                                                            }
                                                                            if (field305 > 55) {
                                                                                field306 = -2;
                                                                            }
                                                                            if (field307 < -40) {
                                                                                field308 = 1;
                                                                            }
                                                                            if (field307 > 40) {
                                                                                field308 = -1;
                                                                            }
                                                                            field314++;
                                                                            if (field314 > 500) {
                                                                                field314 = 0;
                                                                                int var88 = (int) (Math.random() * 8.0D);
                                                                                if ((var88 & 0x1) == 1) {
                                                                                    field310 += field311;
                                                                                }
                                                                                if ((var88 & 0x2) == 2) {
                                                                                    field312 += field345;
                                                                                }
                                                                            }
                                                                            if (field310 < -60) {
                                                                                field311 = 2;
                                                                            }
                                                                            if (field310 > 60) {
                                                                                field311 = -2;
                                                                            }
                                                                            if (field312 < -20) {
                                                                                field345 = 1;
                                                                            }
                                                                            if (field312 > 10) {
                                                                                field345 = -1;
                                                                            }
                                                                            for (class36 var89 = (class36) field513.method3440(); var89 != null; var89 = (class36) field513.method3438()) {
                                                                                if ((long) var89.field814 < class107.method1670() / 1000L - 5L) {
                                                                                    if (var89.field812 > 0) {
                                                                                        class11.method2783(5, "", var89.field811 + class148.field2352);
                                                                                    }
                                                                                    if (var89.field812 == 0) {
                                                                                        class11.method2783(5, "", var89.field811 + class148.field2353);
                                                                                    }
                                                                                    var89.method3559();
                                                                                }
                                                                            }
                                                                            field280++;
                                                                            if (field280 > 50) {
                                                                                field488.method2480(132);
                                                                            }
                                                                            try {
                                                                                if (Statics.field1617 != null && field488.field1889 > 0) {
                                                                                    Statics.field1617.method2725(field488.field1888, 0, field488.field1889);
                                                                                    field488.field1889 = 0;
                                                                                    field280 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var92) {
                                                                                if (field287 > 0) {
                                                                                    method2528();
                                                                                } else {
                                                                                    method2731(40);
                                                                                    Statics.field1694 = Statics.field1617;
                                                                                    Statics.field1617 = null;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        var73 = var72.field1;
                                                                        if (var73.field2650 < 0) {
                                                                            break;
                                                                        }
                                                                        var74 = Statics.method2717(var73.field2669);
                                                                    } while (var74 == null || var74.field2775 == null || var73.field2650 >= var74.field2775.length || var74.field2775[var73.field2650] != var73);
                                                                    class34.method31(var72, 200000);
                                                                }
                                                            }
                                                            var70 = var69.field1;
                                                            if (var70.field2650 < 0) {
                                                                break;
                                                            }
                                                            var71 = Statics.method2717(var70.field2669);
                                                        } while (var71 == null || var71.field2775 == null || var70.field2650 >= var71.field2775.length || var71.field2775[var70.field2650] != var70);
                                                        class34.method31(var69, 200000);
                                                    }
                                                }
                                                var67 = var66.field1;
                                                if (var67.field2650 < 0) {
                                                    break;
                                                }
                                                var68 = Statics.method2717(var67.field2669);
                                            } while (var68 == null || var68.field2775 == null || var67.field2650 >= var68.field2775.length || var68.field2775[var67.field2650] != var67);
                                            class34.method31(var66, 200000);
                                        }
                                    }
                                } else if (field287 > 0) {
                                    method2528();
                                } else {
                                    method2731(40);
                                    Statics.field1694 = Statics.field1617;
                                    Statics.field1617 = null;
                                }
                            }
                        }
                    }
                } else if (field453 == 40 || field453 == 45) {
                    method1856();
                }
                return;
            }
            var2.field2597.method3041(var2.field2594, (int) var2.field3007, var2.field2595, false);
        }
    }

    @ObfuscatedName("client.m(I)V")
    public final void method182() {
        boolean var1;
        label191: {
            try {
                if (class174.field2856 == 2) {
                    if (Statics.field1975 == null) {
                        Statics.field1975 = class171.method3220(Statics.field87, Statics.field2194, Statics.field717);
                        if (Statics.field1975 == null) {
                            var1 = false;
                            break label191;
                        }
                    }
                    if (Statics.field620 == null) {
                        Statics.field620 = new class55(Statics.field2852, Statics.field2853);
                    }
                    if (Statics.field2854.method3298(Statics.field1975, Statics.field2855, Statics.field620, 22050)) {
                        Statics.field2854.method3336();
                        Statics.field2854.method3296(Statics.field2151);
                        Statics.field2854.method3301(Statics.field1975, Statics.field63);
                        class174.field2856 = 0;
                        Statics.field1975 = null;
                        Statics.field620 = null;
                        Statics.field87 = null;
                        var1 = true;
                        break label191;
                    }
                }
            } catch (Exception var28) {
                var28.printStackTrace();
                Statics.field2854.method3302();
                class174.field2856 = 0;
                Statics.field1975 = null;
                Statics.field620 = null;
                Statics.field87 = null;
            }
            var1 = false;
        }
        if (var1 && field482 && Statics.field2617 != null) {
            Statics.field2617.method1050();
        }
        if (field453 == 10 || field453 == 20 || field453 == 30) {
            if (field501 != 0L && class107.method1670() > field501) {
                method143(method2159());
            } else if (field2109) {
                method1964();
            }
        }
        Dimension var4 = this.method2755();
        if (Statics.field1942 != var4.width || Statics.field1385 != var4.height || field2097) {
            method3398();
            field501 = class107.method1670() + 500L;
            field2097 = false;
        }
        boolean var5 = false;
        if (field2106) {
            field2106 = false;
            var5 = true;
            for (int var6 = 0; var6 < 100; var6++) {
                field389[var6] = true;
            }
        }
        if (var5) {
            method2614();
        }
        if (field453 == 0) {
            int var7 = class30.field676;
            String var8 = class30.field677;
            Color var9 = null;
            try {
                Graphics var10 = Statics.field910.getGraphics();
                if (Statics.field149 == null) {
                    Statics.field149 = new Font("Helvetica", 1, 13);
                    Statics.field1604 = Statics.field910.getFontMetrics(Statics.field149);
                }
                if (var5) {
                    var10.setColor(Color.black);
                    var10.fillRect(0, 0, Statics.field1461, Statics.field118);
                }
                if (var9 == null) {
                    var9 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field569 == null) {
                        Statics.field569 = Statics.field910.createImage(304, 34);
                    }
                    Graphics var11 = Statics.field569.getGraphics();
                    var11.setColor(var9);
                    var11.drawRect(0, 0, 303, 33);
                    var11.fillRect(2, 2, var7 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(1, 1, 301, 31);
                    var11.fillRect(var7 * 3 + 2, 2, 300 - var7 * 3, 30);
                    var11.setFont(Statics.field149);
                    var11.setColor(Color.white);
                    var11.drawString(var8, (304 - Statics.field1604.stringWidth(var8)) / 2, 22);
                    var10.drawImage(Statics.field569, Statics.field1461 / 2 - 152, Statics.field118 / 2 - 18, (ImageObserver) null);
                } catch (Exception var24) {
                    int var13 = Statics.field1461 / 2 - 152;
                    int var14 = Statics.field118 / 2 - 18;
                    var10.setColor(var9);
                    var10.drawRect(var13, var14, 303, 33);
                    var10.fillRect(var13 + 2, var14 + 2, var7 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(var13 + 1, var14 + 1, 301, 31);
                    var10.fillRect(var7 * 3 + var13 + 2, var14 + 2, 300 - var7 * 3, 30);
                    var10.setFont(Statics.field149);
                    var10.setColor(Color.white);
                    var10.drawString(var8, var13 + (304 - Statics.field1604.stringWidth(var8)) / 2, var14 + 22);
                }
            } catch (Exception var25) {
                Statics.field910.repaint();
            }
        } else if (field453 == 5) {
            class30.method674(Statics.field989, Statics.field292, Statics.field1026, var5);
        } else if (field453 == 10 || field453 == 11) {
            class30.method674(Statics.field989, Statics.field292, Statics.field1026, var5);
        } else if (field453 == 20) {
            class30.method674(Statics.field989, Statics.field292, Statics.field1026, var5);
        } else if (field453 == 25) {
            if (field298 == 1) {
                if (field294 > field295) {
                    field295 = field294;
                }
                int var16 = (field295 * 50 - field294 * 50) / field295;
                Statics.method129(class148.field2454 + class2.field25 + class2.field22 + var16 + "%" + class2.field20, false);
            } else if (field298 == 2) {
                if (field296 > field297) {
                    field297 = field296;
                }
                int var17 = (field297 * 50 - field296 * 50) / field297 + 50;
                Statics.method129(class148.field2454 + class2.field25 + class2.field22 + var17 + "%" + class2.field20, false);
            } else {
                Statics.method129(class148.field2454, false);
            }
        } else if (field453 == 30) {
            method107();
        } else if (field453 == 40) {
            Statics.method129(class148.field2281 + class2.field25 + class148.field2268, false);
        } else if (field453 == 45) {
            Statics.method129(class148.field2363, false);
        }
        if (field453 == 30 && field455 == 0 && !var5) {
            try {
                Graphics var18 = Statics.field910.getGraphics();
                for (int var19 = 0; var19 < field446; var19++) {
                    if (field273[var19]) {
                        Statics.field233.method1422(var18, field514[var19], field452[var19], field495[var19], field454[var19]);
                        field273[var19] = false;
                    }
                }
            } catch (Exception var27) {
                Statics.field910.repaint();
            }
        } else if (field453 > 0) {
            try {
                Graphics var21 = Statics.field910.getGraphics();
                Statics.field233.method1419(var21, 0, 0);
                for (int var22 = 0; var22 < field446; var22++) {
                    field273[var22] = false;
                }
            } catch (Exception var26) {
                Statics.field910.repaint();
            }
        }
    }

    @ObfuscatedName("client.a(B)V")
    public final void method183() {
        if (Statics.field332 != null) {
            Statics.field332.field181 = false;
        }
        Statics.field332 = null;
        if (Statics.field1617 != null) {
            Statics.field1617.method2720();
            Statics.field1617 = null;
        }
        class129.method14();
        if (class132.field2068 != null) {
            class132 var1 = class132.field2068;
            synchronized (class132.field2068) {
                class132.field2068 = null;
            }
        }
        Statics.field922 = null;
        if (Statics.field2617 != null) {
            Statics.field2617.method1056();
        }
        if (Statics.field1989 != null) {
            Statics.field1989.method1056();
        }
        if (Statics.field2544 != null) {
            Statics.field2544.method2720();
        }
        Object var3 = class161.field2602;
        synchronized (class161.field2602) {
            if (class161.field2600 != 0) {
                class161.field2600 = 1;
                try {
                    class161.field2602.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        Statics.method1968();
    }

    @ObfuscatedName("em.h(II)V")
    public static void method2731(int arg0) {
        if (field453 == arg0) {
            return;
        }
        if (field453 == 0) {
            class136.method521();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field237 = 0;
            field450 = 0;
            field275 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1694 != null) {
            Statics.field1694.method2720();
            Statics.field1694 = null;
        }
        if (field453 == 25) {
            field298 = 0;
            field294 = 0;
            field295 = 1;
            field296 = 0;
            field297 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class30.method77(Statics.field910, Statics.field1805, Statics.field1381, true, 0);
        } else if (arg0 == 20) {
            class30.method77(Statics.field910, Statics.field1805, Statics.field1381, true, field453 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class30.method77(Statics.field910, Statics.field1805, Statics.field1381, false, 4);
        } else {
            class30.method1671();
        }
        field453 = arg0;
    }

    @ObfuscatedName("client.l(I)V")
    public void method184() {
        if (field453 != 1000) {
            boolean var1 = class162.method1497();
            if (!var1) {
                this.method185();
            }
        }
    }

    @ObfuscatedName("client.u(B)V")
    public void method185() {
        if (class162.field2604 >= 4) {
            this.method2753("js5crc");
            field453 = 1000;
            return;
        }
        if (class162.field2624 >= 4) {
            if (field453 <= 5) {
                this.method2753("js5io");
                field453 = 1000;
                return;
            }
            field263 = 3000;
            class162.field2624 = 3;
        }
        if (--field263 + 1 > 0) {
            return;
        }
        try {
            if (field428 == 0) {
                Statics.field59 = Statics.field969.method2623(Statics.field3, Statics.field221);
                field428++;
            }
            if (field428 == 1) {
                if (Statics.field59.field2118 == 2) {
                    this.method281(-1);
                    return;
                }
                if (Statics.field59.field2118 == 1) {
                    field428++;
                }
            }
            if (field428 == 2) {
                Statics.field1130 = new class135((Socket) Statics.field59.field2114, Statics.field969);
                class111 var1 = new class111(5);
                var1.method2213(15);
                var1.method2216(83);
                Statics.field1130.method2725(var1.field1888, 0, 5);
                field428++;
                Statics.field1150 = class107.method1670();
            }
            if (field428 == 3) {
                if (field453 <= 5 || Statics.field1130.method2723() > 0) {
                    int var2 = Statics.field1130.method2722();
                    if (var2 != 0) {
                        this.method281(var2);
                        return;
                    }
                    field428++;
                } else if (class107.method1670() - Statics.field1150 > 30000L) {
                    this.method281(-2);
                    return;
                }
            }
            if (field428 == 4) {
                class135 var3 = Statics.field1130;
                boolean var4 = field453 > 20;
                if (Statics.field2544 != null) {
                    try {
                        Statics.field2544.method2720();
                    } catch (Exception var14) {
                    }
                    Statics.field2544 = null;
                }
                Statics.field2544 = var3;
                Statics.method611(var4);
                class162.field2616.field1889 = 0;
                Statics.field2558 = null;
                Statics.field2607 = null;
                class162.field2612 = 0;
                while (true) {
                    class163 var6 = (class163) class162.field2608.method3448();
                    if (var6 == null) {
                        while (true) {
                            class163 var7 = (class163) class162.field2613.method3448();
                            if (var7 == null) {
                                if (class162.field2622 != 0) {
                                    try {
                                        class111 var8 = new class111(4);
                                        var8.method2213(4);
                                        var8.method2213(class162.field2622);
                                        var8.method2214(0);
                                        Statics.field2544.method2725(var8.field1888, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2544.method2720();
                                        } catch (Exception var12) {
                                        }
                                        class162.field2624++;
                                        Statics.field2544 = null;
                                    }
                                }
                                class162.field2606 = 0;
                                Statics.field2605 = class107.method1670();
                                Statics.field59 = null;
                                Statics.field1130 = null;
                                field428 = 0;
                                field322 = 0;
                                return;
                            }
                            class162.field2610.method3527(var7);
                            class162.field2611.method3446(var7, var7.field3007);
                            class162.field2621++;
                            class162.field2614--;
                        }
                    }
                    class162.field2618.method3446(var6, var6.field3007);
                    class162.field2629++;
                    class162.field2620--;
                }
            }
        } catch (IOException var15) {
            this.method281(-3);
        }
    }

    @ObfuscatedName("client.q(IS)V")
    public void method281(int arg0) {
        Statics.field59 = null;
        Statics.field1130 = null;
        field428 = 0;
        if (Statics.field221 == Statics.field1546) {
            Statics.field221 = Statics.field660;
        } else {
            Statics.field221 = Statics.field1546;
        }
        field322++;
        if (field322 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field453 <= 5) {
                this.method2753("js5connect_full");
                field453 = 1000;
            } else {
                field263 = 3000;
            }
        } else if (field322 >= 2 && arg0 == 6) {
            this.method2753("js5connect_outofdate");
            field453 = 1000;
        } else if (field322 >= 4) {
            if (field453 <= 5) {
                this.method2753("js5connect");
                field453 = 1000;
            } else {
                field263 = 3000;
            }
        }
    }

    @ObfuscatedName("gg.x(IZZZB)Lfx;")
    public static class159 method3589(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class126 var4 = null;
        if (class141.field2137 != null) {
            var4 = new class126(arg0, class141.field2137, Statics.field2139[arg0], 1000000);
        }
        return new class159(var4, Statics.field1007, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cz.r(B)V")
    public static final void method1856() {
        try {
            if (field237 == 0) {
                if (Statics.field1617 != null) {
                    Statics.field1617.method2720();
                    Statics.field1617 = null;
                }
                Statics.field56 = null;
                field291 = false;
                field450 = 0;
                field237 = 1;
            }
            if (field237 == 1) {
                if (Statics.field56 == null) {
                    Statics.field56 = Statics.field969.method2623(Statics.field3, Statics.field221);
                }
                if (Statics.field56.field2118 == 2) {
                    throw new IOException();
                }
                if (Statics.field56.field2118 == 1) {
                    Statics.field1617 = new class135((Socket) Statics.field56.field2114, Statics.field969);
                    Statics.field56 = null;
                    field237 = 2;
                }
            }
            if (field237 == 2) {
                field488.field1889 = 0;
                field488.method2213(14);
                Statics.field1617.method2725(field488.field1888, 0, 1);
                field484.field1889 = 0;
                field237 = 3;
            }
            if (field237 == 3) {
                if (Statics.field2617 != null) {
                    Statics.field2617.method1055();
                }
                if (Statics.field1989 != null) {
                    Statics.field1989.method1055();
                }
                int var0 = Statics.field1617.method2722();
                if (Statics.field2617 != null) {
                    Statics.field2617.method1055();
                }
                if (Statics.field1989 != null) {
                    Statics.field1989.method1055();
                }
                if (var0 != 0) {
                    method157(var0);
                    return;
                }
                field484.field1889 = 0;
                field237 = 5;
            }
            if (field237 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field488.field1889 = 0;
                field488.method2213(1);
                field488.method2213(class30.field684.method512());
                field488.method2216(var1[0]);
                field488.method2216(var1[1]);
                field488.method2216(var1[2]);
                field488.method2216(var1[3]);
                switch(class30.field684.field2489) {
                    case 0:
                    case 2:
                        field488.method2234(Statics.field1038);
                        field488.field1889 += 5;
                        break;
                    case 1:
                        field488.method2216((Integer) Statics.field608.field135.get(class154.method167(class30.field682)));
                        field488.field1889 += 4;
                        break;
                    case 3:
                        field488.field1889 += 8;
                }
                field488.method2219(class30.field683);
                field488.method2248(class5.field62, class5.field64);
                field281.field1889 = 0;
                if (field453 == 40) {
                    field281.method2213(18);
                } else {
                    field281.method2213(16);
                }
                field281.method2214(0);
                int var2 = field281.field1889;
                field281.method2216(83);
                field281.method2294(field488.field1888, 0, field488.field1889);
                int var3 = field281.field1889;
                field281.method2219(class30.field682);
                field281.method2213((field457 ? 1 : 0) << 1 | (field338 ? 1 : 0));
                field281.method2214(Statics.field1461);
                field281.method2214(Statics.field118);
                Statics.method1449(field281);
                field281.method2219(Statics.field173);
                field281.method2216(Statics.field1957);
                class111 var4 = new class111(Statics.field1098.method2860());
                Statics.field1098.method2865(var4);
                field281.method2294(var4.field1888, 0, var4.field1888.length);
                field281.method2213(Statics.field1096);
                field281.method2216(Statics.field236.field2575);
                field281.method2216(Statics.field1935.field2575);
                field281.method2216(Statics.field172.field2575);
                field281.method2216(Statics.field182.field2575);
                field281.method2216(Statics.field1940.field2575);
                field281.method2216(Statics.field191.field2575);
                field281.method2216(Statics.field593.field2575);
                field281.method2216(Statics.field2836.field2575);
                field281.method2216(Statics.field1381.field2575);
                field281.method2216(Statics.field725.field2575);
                field281.method2216(Statics.field1805.field2575);
                field281.method2216(Statics.field3023.field2575);
                field281.method2216(Statics.field3061.field2575);
                field281.method2216(Statics.field114.field2575);
                field281.method2216(Statics.field80.field2575);
                field281.method2216(Statics.field732.field2575);
                field281.method2246(var1, var3, field281.field1889);
                field281.method2321(field281.field1889 - var2);
                Statics.field1617.method2725(field281.field1888, 0, field281.field1889);
                field488.method2481(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field484.method2481(var1);
                field237 = 6;
            }
            if (field237 == 6 && Statics.field1617.method2723() > 0) {
                int var6 = Statics.field1617.method2722();
                if (var6 == 21 && field453 == 20) {
                    field237 = 7;
                } else if (var6 == 2) {
                    field237 = 9;
                } else if (var6 == 15 && field453 == 40) {
                    field488.field1889 = 0;
                    field484.field1889 = 0;
                    field284 = -1;
                    field426 = -1;
                    field289 = -1;
                    field290 = -1;
                    field283 = 0;
                    field285 = 0;
                    field257 = 0;
                    field317 = 0;
                    field382 = false;
                    field479 = 0;
                    field477 = 0;
                    for (int var7 = 0; var7 < field359.length; var7++) {
                        if (field359[var7] != null) {
                            field359[var7].field773 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field277.length; var8++) {
                        if (field277[var8] != null) {
                            field277[var8].field773 = -1;
                        }
                    }
                    class15.method2563();
                    method2731(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field389[var9] = true;
                    }
                    method103();
                    return;
                } else if (var6 == 23 && field275 < 1) {
                    field275++;
                    field237 = 0;
                } else {
                    method157(var6);
                    return;
                }
            }
            if (field237 == 7 && Statics.field1617.method2723() > 0) {
                field276 = (Statics.field1617.method2722() + 3) * 60;
                field237 = 8;
            }
            if (field237 == 8) {
                field450 = 0;
                class30.method2943(class148.field2241, class148.field2242, field276 / 60 + class148.field2243);
                if (--field276 <= 0) {
                    field237 = 0;
                }
            } else {
                if (field237 == 9 && Statics.field1617.method2723() >= 13) {
                    boolean var10 = Statics.field1617.method2722() == 1;
                    Statics.field1617.method2724(field484.field1888, 0, 4);
                    field484.field1889 = 0;
                    boolean var11 = false;
                    if (var10) {
                        int var12 = field484.method2482() << 24;
                        int var13 = var12 | field484.method2482() << 16;
                        int var14 = var13 | field484.method2482() << 8;
                        int var15 = var14 | field484.method2482();
                        int var16 = class154.method167(class30.field682);
                        if (Statics.field608.field135.size() >= 10 && !Statics.field608.field135.containsKey(var16)) {
                            Iterator var17 = Statics.field608.field135.entrySet().iterator();
                            var17.next();
                            var17.remove();
                        }
                        Statics.field608.field135.put(var16, var15);
                        class9.method1415();
                    }
                    field408 = Statics.field1617.method2722();
                    field253 = Statics.field1617.method2722() == 1;
                    field365 = Statics.field1617.method2722();
                    field365 <<= 0x8;
                    field365 += Statics.field1617.method2722();
                    field427 = Statics.field1617.method2722();
                    Statics.field1617.method2724(field484.field1888, 0, 1);
                    field484.field1889 = 0;
                    field284 = field484.method2482();
                    Statics.field1617.method2724(field484.field1888, 0, 2);
                    field484.field1889 = 0;
                    field283 = field484.method2231();
                    if (field427 == 1) {
                        try {
                            client var18 = Statics.field238;
                            JSObject.getWindow(var18).call("zap", (Object[]) null);
                        } catch (Throwable var24) {
                        }
                    } else {
                        try {
                            client var20 = Statics.field238;
                            JSObject.getWindow(var20).call("unzap", (Object[]) null);
                        } catch (Throwable var23) {
                        }
                    }
                    field237 = 10;
                }
                if (field237 != 10) {
                    field450++;
                    if (field450 > 2000) {
                        if (field275 < 1) {
                            if (Statics.field221 == Statics.field1546) {
                                Statics.field221 = Statics.field660;
                            } else {
                                Statics.field221 = Statics.field1546;
                            }
                            field275++;
                            field237 = 0;
                        } else {
                            method157(-3);
                        }
                    }
                } else if (Statics.field1617.method2723() >= field283) {
                    field484.field1889 = 0;
                    Statics.field1617.method2724(field484.field1888, 0, field283);
                    method18();
                    Statics.field965 = -1;
                    method546(false);
                    field284 = -1;
                }
            }
        } catch (IOException var25) {
            if (field275 < 1) {
                if (Statics.field221 == Statics.field1546) {
                    Statics.field221 = Statics.field660;
                } else {
                    Statics.field221 = Statics.field1546;
                }
                field275++;
                field237 = 0;
            } else {
                method157(-2);
            }
        }
    }

    @ObfuscatedName("z.j(I)V")
    public static void method18() {
        field250 = 1L;
        field254 = -1;
        Statics.field332.field175 = 0;
        Statics.field3029 = true;
        field255 = true;
        field282 = -1L;
        class202.method658();
        field488.field1889 = 0;
        field484.field1889 = 0;
        field284 = -1;
        field426 = -1;
        field289 = -1;
        field290 = -1;
        field285 = 0;
        field257 = 0;
        field287 = 0;
        field431 = 0;
        field317 = 0;
        field382 = false;
        class132.field2055 = 0;
        class11.field153.clear();
        class11.field152.method3466();
        class11.field154.method3510();
        class11.field156 = 0;
        field469 = 0;
        field444 = false;
        field485 = 0;
        field309 = (int) (Math.random() * 100.0D) - 50;
        field305 = (int) (Math.random() * 110.0D) - 55;
        field307 = (int) (Math.random() * 80.0D) - 40;
        field310 = (int) (Math.random() * 120.0D) - 60;
        field312 = (int) (Math.random() * 30.0D) - 20;
        field324 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field479 = 0;
        field363 = -1;
        field477 = 0;
        field478 = 0;
        field449 = class19.field525;
        field360 = 0;
        field278 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field359[var0] = null;
            field364[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field277[var1] = null;
        }
        Statics.field1710 = field359[2047] = new class3();
        field373 = -1;
        field470.method3483();
        field377.method3483();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field394[var2][var3][var4] = null;
                }
            }
        }
        field375 = new class190();
        field511 = 0;
        field510 = 0;
        field405 = 0;
        for (int var5 = 0; var5 < Statics.field3057; var5++) {
            class48 var6 = class48.method804(var5);
            if (var6 != null) {
                class167.field2799[var5] = 0;
                class167.field2801[var5] = 0;
            }
        }
        for (int var7 = 0; var7 < field439.length; var7++) {
            field439[var7] = -1;
        }
        field508 = -1;
        if (field401 != -1) {
            class164.method2924(field401);
        }
        for (class4 var8 = (class4) field402.method3448(); var8 != null; var8 = (class4) field402.method3449()) {
            method510(var8, true);
        }
        field401 = -1;
        field402 = new class187(8);
        field316 = null;
        field382 = false;
        field317 = 0;
        field516.method3187((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field424[var9] = null;
            field260[var9] = false;
        }
        class15.method2563();
        field301 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field389[var10] = true;
        }
        method103();
        field286 = null;
        Statics.field1709 = 0;
        Statics.field1954 = null;
        for (int var11 = 0; var11 < 8; var11++) {
            field519[var11] = new class211();
        }
        Statics.field711 = null;
    }

    @ObfuscatedName("j.s(II)V")
    public static void method157(int arg0) {
        if (arg0 == -3) {
            class30.method2943(class148.field2208, class148.field2405, class148.field2246);
        } else if (arg0 == -2) {
            class30.method2943(class148.field2247, class148.field2248, class148.field2249);
        } else if (arg0 == -1) {
            class30.method2943(class148.field2396, class148.field2215, class148.field2252);
        } else if (arg0 == 3) {
            class30.method2943(class148.field2253, class148.field2254, class148.field2398);
        } else if (arg0 == 4) {
            class30.method2943(class148.field2256, class148.field2426, class148.field2258);
        } else if (arg0 == 5) {
            class30.method2943(class148.field2259, class148.field2375, class148.field2261);
        } else if (arg0 == 6) {
            class30.method2943(class148.field2383, class148.field2308, class148.field2264);
        } else if (arg0 == 7) {
            class30.method2943(class148.field2265, class148.field2470, class148.field2373);
        } else if (arg0 == 8) {
            class30.method2943(class148.field2260, class148.field2269, class148.field2270);
        } else if (arg0 == 9) {
            class30.method2943(class148.field2452, class148.field2204, class148.field2273);
        } else if (arg0 == 10) {
            class30.method2943(class148.field2274, class148.field2275, class148.field2276);
        } else if (arg0 == 11) {
            class30.method2943(class148.field2277, class148.field2336, class148.field2279);
        } else if (arg0 == 12) {
            class30.method2943(class148.field2280, class148.field2436, class148.field2282);
        } else if (arg0 == 13) {
            class30.method2943(class148.field2283, class148.field2284, class148.field2214);
        } else if (arg0 == 14) {
            class30.method2943(class148.field2286, class148.field2287, class148.field2457);
        } else if (arg0 == 16) {
            class30.method2943(class148.field2289, class148.field2290, class148.field2291);
        } else if (arg0 == 17) {
            class30.method2943(class148.field2410, class148.field2293, class148.field2294);
        } else if (arg0 == 18) {
            class30.method2943(class148.field2295, class148.field2296, class148.field2416);
        } else if (arg0 == 19) {
            class30.method2943(class148.field2298, class148.field2299, class148.field2300);
        } else if (arg0 == 20) {
            class30.method2943(class148.field2301, class148.field2428, class148.field2303);
        } else if (arg0 == 22) {
            class30.method2943(class148.field2304, class148.field2285, class148.field2306);
        } else if (arg0 == 23) {
            class30.method2943(class148.field2307, class148.field2207, class148.field2422);
        } else if (arg0 == 24) {
            class30.method2943(class148.field2310, class148.field2311, class148.field2312);
        } else if (arg0 == 25) {
            class30.method2943(class148.field2250, class148.field2314, class148.field2315);
        } else if (arg0 == 26) {
            class30.method2943(class148.field2411, class148.field2317, class148.field2318);
        } else if (arg0 == 27) {
            class30.method2943(class148.field2319, class148.field2320, class148.field2251);
        } else if (arg0 == 31) {
            class30.method2943(class148.field2328, class148.field2364, class148.field2216);
        } else if (arg0 == 32) {
            class30.method2943(class148.field2331, class148.field2332, class148.field2266);
        } else if (arg0 == 37) {
            class30.method2943(class148.field2372, class148.field2347, class148.field2292);
        } else if (arg0 == 38) {
            class30.method2943(class148.field2359, class148.field2338, class148.field2339);
        } else if (arg0 == 55) {
            class30.method2943(class148.field2420, class148.field2341, class148.field2222);
        } else if (arg0 == 56) {
            class30.method2943(class148.field2343, class148.field2344, class148.field2345);
            method2731(11);
            return;
        } else if (arg0 == 57) {
            class30.method2943(class148.field2346, class148.field2378, class148.field2348);
            method2731(11);
            return;
        } else {
            class30.method2943(class148.field2349, class148.field2288, class148.field2351);
        }
        method2731(10);
    }

    @ObfuscatedName("dk.v(I)V")
    public static final void method2528() {
        if (Statics.field1617 != null) {
            Statics.field1617.method2720();
            Statics.field1617 = null;
        }
        method138();
        Statics.field656.method1677();
        for (int var0 = 0; var0 < 4; var0++) {
            field432[var0].method3786();
        }
        System.gc();
        class174.field2856 = 1;
        Statics.field87 = null;
        Statics.field2194 = -1;
        Statics.field717 = -1;
        Statics.field2151 = 0;
        Statics.field63 = false;
        Statics.field1994 = 2;
        field481 = -1;
        field482 = false;
        class22.method1389();
        method2731(10);
    }

    @ObfuscatedName("q.c(I)V")
    public static final void method138() {
        class43.method2903();
        class39.field915.method3412();
        class42.field974.method3412();
        class38.field892.method3412();
        class38.field864.method3412();
        class38.field865.method3412();
        class38.field866.method3412();
        class37.field822.method3412();
        class37.field823.method3412();
        class47.method2513();
        class40.field930.method3412();
        class40.field931.method3412();
        class41.field956.method3412();
        class41.field957.method3412();
        class44.field1012.method3412();
        class48.field1095.method3412();
        class170.field2809.method3412();
        class164.method162();
        ((class90) Statics.field1512).method1951();
        class20.field538.method3412();
        Statics.field236.method2961();
        Statics.field1935.method2961();
        Statics.field182.method2961();
        Statics.field1940.method2961();
        Statics.field191.method2961();
        Statics.field593.method2961();
        Statics.field2836.method2961();
        Statics.field1381.method2961();
        Statics.field725.method2961();
        Statics.field1805.method2961();
        Statics.field3023.method2961();
        Statics.field3061.method2961();
    }

    @ObfuscatedName("db.p(I)V")
    public static final void method2561() {
        if (Statics.field1989 != null) {
            Statics.field1989.method1070();
        }
        if (Statics.field2617 != null) {
            Statics.field2617.method1070();
        }
    }

    @ObfuscatedName("x.o(Lan;IIII)V")
    public static void method150(class40 arg0, int arg1, int arg2, int arg3) {
        if (field485 >= 50 || field472 == 0 || arg0.field935 == null || arg1 >= arg0.field935.length) {
            return;
        }
        int var4 = arg0.field935[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field486[field485] = var5;
        field487[field485] = var6;
        field521[field485] = 0;
        field490[field485] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field489[field485] = (var8 << 16) + (var9 << 8) + var7;
        field485++;
    }

    @ObfuscatedName("em.b(II)V")
    public static void method2740(int arg0) {
        if (arg0 == -1 && !field482) {
            class174.method2548();
        } else if (arg0 != -1 && field481 != arg0 && field480 != 0 && !field482) {
            class159 var1 = Statics.field593;
            int var2 = field480;
            class174.field2856 = 1;
            Statics.field87 = var1;
            Statics.field2194 = arg0;
            Statics.field717 = 0;
            Statics.field2151 = var2;
            Statics.field63 = false;
            Statics.field1994 = 2;
        }
        field481 = arg0;
    }

    @ObfuscatedName("df.t(Lfy;IIS)V")
    public static final void method2521(class164 arg0, int arg1, int arg2) {
        if (field479 != 0 && field479 != 3 || class132.field2067 != 1 && Statics.field699 || class132.field2067 != 4) {
            return;
        }
        class166 var3 = arg0.method3105();
        if (var3 == null) {
            return;
        }
        int var4 = class132.field2069 - arg1;
        int var5 = class132.field2063 - arg2;
        if (!var3.method3151(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2794 / 2;
        int var7 = var5 - var3.field2791 / 2;
        int var8 = field324 + field310 & 0x7FF;
        int var9 = class86.field1515[var8];
        int var10 = class86.field1516[var8];
        int var11 = (field312 + 256) * var9 >> 8;
        int var12 = (field312 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field1710.field809 + var13 >> 7;
        int var16 = Statics.field1710.field749 - var14 >> 7;
        field488.method2480(161);
        field488.method2213(18);
        field488.method2214(Statics.field3035 + var16);
        field488.method2262(Statics.field178 + var15);
        field488.method2404(class129.field2020[82] ? (class129.field2020[81] ? 2 : 1) : 0);
        field488.method2213(var6);
        field488.method2213(var7);
        field488.method2214(field324);
        field488.method2213(57);
        field488.method2213(field310);
        field488.method2213(field312);
        field488.method2213(89);
        field488.method2214(Statics.field1710.field809);
        field488.method2214(Statics.field1710.field749);
        field488.method2213(63);
        field477 = var15;
        field478 = var16;
    }

    @ObfuscatedName("ei.w(B)V")
    public static final void method2889() {
        for (int var0 = -1; var0 < field360; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field407[var0];
            }
            class3 var2 = field359[var1];
            if (var2 != null && var2.field764 > 0) {
                var2.field764--;
                if (var2.field764 == 0) {
                    var2.field798 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field278; var3++) {
            int var4 = field448[var3];
            class32 var5 = field277[var4];
            if (var5 != null && var5.field764 > 0) {
                var5.field764--;
                if (var5.field764 == 0) {
                    var5.field798 = null;
                }
            }
        }
    }

    @ObfuscatedName("ds.i(Ljava/lang/String;I)V")
    public static final void method2581(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field608.field127 = !Statics.field608.field127;
            class9.method1415();
            if (Statics.field608.field127) {
                class11.method2783(99, "", "Roofs are now all hidden");
            } else {
                class11.method2783(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field256 = !field256;
        }
        if (field408 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field256 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field256 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field287 > 0) {
                    method2528();
                } else {
                    method2731(40);
                    Statics.field1694 = Statics.field1617;
                    Statics.field1617 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field242 == 2) {
                throw new RuntimeException();
            }
        }
        field488.method2480(235);
        field488.method2213(arg0.length() + 1);
        field488.method2219(arg0);
    }

    @ObfuscatedName("aq.ad(I)V")
    public static final void method873() {
        int var0 = Statics.field1462 * 128 + 64;
        int var1 = Statics.field2200 * 128 + 64;
        int var2 = method141(var0, var1, Statics.field2136) - Statics.field2054;
        if (Statics.field55 < var0) {
            Statics.field55 += Statics.field1156 * (var0 - Statics.field55) / 1000 + Statics.field1100;
            if (Statics.field55 > var0) {
                Statics.field55 = var0;
            }
        }
        if (Statics.field55 > var0) {
            Statics.field55 -= Statics.field1156 * (Statics.field55 - var0) / 1000 + Statics.field1100;
            if (Statics.field55 < var0) {
                Statics.field55 = var0;
            }
        }
        if (Statics.field28 < var2) {
            Statics.field28 += Statics.field1156 * (var2 - Statics.field28) / 1000 + Statics.field1100;
            if (Statics.field28 > var2) {
                Statics.field28 = var2;
            }
        }
        if (Statics.field28 > var2) {
            Statics.field28 -= Statics.field1156 * (Statics.field28 - var2) / 1000 + Statics.field1100;
            if (Statics.field28 < var2) {
                Statics.field28 = var2;
            }
        }
        if (Statics.field727 < var1) {
            Statics.field727 += Statics.field1156 * (var1 - Statics.field727) / 1000 + Statics.field1100;
            if (Statics.field727 > var1) {
                Statics.field727 = var1;
            }
        }
        if (Statics.field727 > var1) {
            Statics.field727 -= Statics.field1156 * (Statics.field727 - var1) / 1000 + Statics.field1100;
            if (Statics.field727 < var1) {
                Statics.field727 = var1;
            }
        }
        int var3 = Statics.field708 * 128 + 64;
        int var4 = Statics.field130 * 128 + 64;
        int var5 = method141(var3, var4, Statics.field2136) - Statics.field1968;
        int var6 = var3 - Statics.field55;
        int var7 = var5 - Statics.field28;
        int var8 = var4 - Statics.field727;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field597 < var10) {
            Statics.field597 += Statics.field986 * (var10 - Statics.field597) / 1000 + Statics.field209;
            if (Statics.field597 > var10) {
                Statics.field597 = var10;
            }
        }
        if (Statics.field597 > var10) {
            Statics.field597 -= Statics.field986 * (Statics.field597 - var10) / 1000 + Statics.field209;
            if (Statics.field597 < var10) {
                Statics.field597 = var10;
            }
        }
        int var12 = var11 - Statics.field923;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field923 += Statics.field986 * var12 / 1000 + Statics.field209;
            Statics.field923 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field923 -= Statics.field986 * -var12 / 1000 + Statics.field209;
            Statics.field923 &= 0x7FF;
        }
        int var13 = var11 - Statics.field923;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field923 = var11;
        }
    }

    @ObfuscatedName("i.ak(I)V")
    public static final void method591() {
        int var0 = field309 + Statics.field1710.field809;
        int var1 = field305 + Statics.field1710.field749;
        if (Statics.field1560 - var0 < -500 || Statics.field1560 - var0 > 500 || Statics.field1386 - var1 < -500 || Statics.field1386 - var1 > 500) {
            Statics.field1560 = var0;
            Statics.field1386 = var1;
        }
        if (Statics.field1560 != var0) {
            Statics.field1560 += (var0 - Statics.field1560) / 16;
        }
        if (Statics.field1386 != var1) {
            Statics.field1386 += (var1 - Statics.field1386) / 16;
        }
        if (class132.field2060 == 4 && Statics.field699) {
            int var2 = class132.field2062 * 130670055 - field520;
            field437 = var2 * 2;
            field520 = var2 == -1 || var2 == 1 ? class132.field2062 * 130670055 : (field520 + class132.field2062 * 130670055) / 2;
            int var3 = field327 - class132.field2061;
            field325 = var3 * 2;
            field327 = var3 == -1 || var3 == 1 ? class132.field2061 : (field327 + class132.field2061) / 2;
        } else {
            if (class129.field2020[96]) {
                field325 += (-24 - field325) / 2;
            } else if (class129.field2020[97]) {
                field325 += (24 - field325) / 2;
            } else {
                field325 /= 2;
            }
            if (class129.field2020[98]) {
                field437 += (12 - field437) / 2;
            } else if (class129.field2020[99]) {
                field437 += (-12 - field437) / 2;
            } else {
                field437 /= 2;
            }
            field520 = class132.field2062 * 130670055;
            field327 = class132.field2061;
        }
        field324 = field325 / 2 + field324 & 0x7FF;
        field261 += field437 / 2;
        if (field261 < 128) {
            field261 = 128;
        }
        if (field261 > 383) {
            field261 = 383;
        }
        int var4 = Statics.field1560 >> 7;
        int var5 = Statics.field1386 >> 7;
        int var6 = method141(Statics.field1560, Statics.field1386, Statics.field2136);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field2136;
                    if (var10 < 3 && (class6.field66[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field75[var10][var8][var9];
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
        if (var12 > field331) {
            field331 += (var12 - field331) / 24;
        } else if (var12 < field331) {
            field331 += (var12 - field331) / 80;
        }
    }

    @ObfuscatedName("cp.ax(Lao;IB)V")
    public static final void method2064(class35 arg0, int arg1) {
        if (arg0.field793 > field249) {
            method2611(arg0);
        } else if (arg0.field794 >= field249) {
            method588(arg0);
        } else {
            method3094(arg0);
        }
        if (arg0.field809 < 128 || arg0.field749 < 128 || arg0.field809 >= 13184 || arg0.field749 >= 13184) {
            arg0.field779 = -1;
            arg0.field784 = -1;
            arg0.field793 = 0;
            arg0.field794 = 0;
            arg0.field809 = arg0.field751[0] * 128 + arg0.field752 * 64;
            arg0.field749 = arg0.field803[0] * 128 + arg0.field752 * 64;
            arg0.method669();
        }
        if (Statics.field1710 == arg0 && (arg0.field809 < 1536 || arg0.field749 < 1536 || arg0.field809 >= 11776 || arg0.field749 >= 11776)) {
            arg0.field779 = -1;
            arg0.field784 = -1;
            arg0.field793 = 0;
            arg0.field794 = 0;
            arg0.field809 = arg0.field751[0] * 128 + arg0.field752 * 64;
            arg0.field749 = arg0.field803[0] * 128 + arg0.field752 * 64;
            arg0.method669();
        }
        method874(arg0);
        arg0.field800 = false;
        if (arg0.field759 != -1) {
            class40 var2 = class40.method3092(arg0.field759);
            if (var2 == null || var2.field939 == null) {
                arg0.field759 = -1;
            } else {
                arg0.field804++;
                if (arg0.field777 < var2.field939.length && arg0.field804 > var2.field934[arg0.field777]) {
                    arg0.field804 = 1;
                    arg0.field777++;
                    method150(var2, arg0.field777, arg0.field809, arg0.field749);
                }
                if (arg0.field777 >= var2.field939.length) {
                    arg0.field804 = 0;
                    arg0.field777 = 0;
                    method150(var2, arg0.field777, arg0.field809, arg0.field749);
                }
            }
        }
        if (arg0.field784 != -1 && field249 >= arg0.field787) {
            if (arg0.field772 < 0) {
                arg0.field772 = 0;
            }
            int var3 = class41.method116(arg0.field784).field955;
            if (var3 == -1) {
                arg0.field784 = -1;
            } else {
                class40 var4 = class40.method3092(var3);
                if (var4 == null || var4.field939 == null) {
                    arg0.field784 = -1;
                } else {
                    arg0.field797++;
                    if (arg0.field772 < var4.field939.length && arg0.field797 > var4.field934[arg0.field772]) {
                        arg0.field797 = 1;
                        arg0.field772++;
                        method150(var4, arg0.field772, arg0.field809, arg0.field749);
                    }
                    if (arg0.field772 >= var4.field939.length && (arg0.field772 < 0 || arg0.field772 >= var4.field939.length)) {
                        arg0.field784 = -1;
                    }
                }
            }
        }
        if (arg0.field779 != -1 && arg0.field785 <= 1) {
            class40 var5 = class40.method3092(arg0.field779);
            if (var5.field936 == 1 && arg0.field806 > 0 && arg0.field793 <= field249 && arg0.field794 < field249) {
                arg0.field785 = 1;
                return;
            }
        }
        if (arg0.field779 != -1 && arg0.field785 == 0) {
            class40 var6 = class40.method3092(arg0.field779);
            if (var6 == null || var6.field939 == null) {
                arg0.field779 = -1;
            } else {
                arg0.field781++;
                if (arg0.field780 < var6.field939.length && arg0.field781 > var6.field934[arg0.field780]) {
                    arg0.field781 = 1;
                    arg0.field780++;
                    method150(var6, arg0.field780, arg0.field809, arg0.field749);
                }
                if (arg0.field780 >= var6.field939.length) {
                    arg0.field780 -= var6.field933;
                    arg0.field783++;
                    if (arg0.field783 >= var6.field943) {
                        arg0.field779 = -1;
                    } else if (arg0.field780 >= 0 && arg0.field780 < var6.field939.length) {
                        method150(var6, arg0.field780, arg0.field809, arg0.field749);
                    } else {
                        arg0.field779 = -1;
                    }
                }
                arg0.field800 = var6.field938;
            }
        }
        if (arg0.field785 > 0) {
            arg0.field785--;
        }
    }

    @ObfuscatedName("du.al(Lao;S)V")
    public static final void method2611(class35 arg0) {
        int var1 = arg0.field793 - field249;
        int var2 = arg0.field789 * 128 + arg0.field752 * 64;
        int var3 = arg0.field791 * 128 + arg0.field752 * 64;
        arg0.field809 += (var2 - arg0.field809) / var1;
        arg0.field749 += (var3 - arg0.field749) / var1;
        arg0.field805 = 0;
        if (arg0.field795 == 0) {
            arg0.field776 = 1024;
        }
        if (arg0.field795 == 1) {
            arg0.field776 = 1536;
        }
        if (arg0.field795 == 2) {
            arg0.field776 = 0;
        }
        if (arg0.field795 == 3) {
            arg0.field776 = 512;
        }
    }

    @ObfuscatedName("w.ar(Lao;B)V")
    public static final void method588(class35 arg0) {
        if (field249 == arg0.field794 || arg0.field779 == -1 || arg0.field785 != 0 || arg0.field781 + 1 > class40.method3092(arg0.field779).field934[arg0.field780]) {
            int var1 = arg0.field794 - arg0.field793;
            int var2 = field249 - arg0.field793;
            int var3 = arg0.field789 * 128 + arg0.field752 * 64;
            int var4 = arg0.field791 * 128 + arg0.field752 * 64;
            int var5 = arg0.field790 * 128 + arg0.field752 * 64;
            int var6 = arg0.field786 * 128 + arg0.field752 * 64;
            arg0.field809 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field749 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field805 = 0;
        if (arg0.field795 == 0) {
            arg0.field776 = 1024;
        }
        if (arg0.field795 == 1) {
            arg0.field776 = 1536;
        }
        if (arg0.field795 == 2) {
            arg0.field776 = 0;
        }
        if (arg0.field795 == 3) {
            arg0.field776 = 512;
        }
        arg0.field750 = arg0.field776;
    }

    @ObfuscatedName("ff.as(Lao;I)V")
    public static final void method3094(class35 arg0) {
        arg0.field759 = arg0.field753;
        if (arg0.field801 == 0) {
            arg0.field805 = 0;
            return;
        }
        if (arg0.field779 != -1 && arg0.field785 == 0) {
            class40 var1 = class40.method3092(arg0.field779);
            if (arg0.field806 > 0 && var1.field936 == 0) {
                arg0.field805++;
                return;
            }
            if (arg0.field806 <= 0 && var1.field944 == 0) {
                arg0.field805++;
                return;
            }
        }
        int var2 = arg0.field809;
        int var3 = arg0.field749;
        int var4 = arg0.field751[arg0.field801 - 1] * 128 + arg0.field752 * 64;
        int var5 = arg0.field803[arg0.field801 - 1] * 128 + arg0.field752 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field809 = var4;
            arg0.field749 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field776 = 1280;
            } else if (var3 > var5) {
                arg0.field776 = 1792;
            } else {
                arg0.field776 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field776 = 768;
            } else if (var3 > var5) {
                arg0.field776 = 256;
            } else {
                arg0.field776 = 512;
            }
        } else if (var3 < var5) {
            arg0.field776 = 1024;
        } else if (var3 > var5) {
            arg0.field776 = 0;
        }
        int var6 = arg0.field776 - arg0.field750 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field757;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field756;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field792;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field774;
        }
        if (var7 == -1) {
            var7 = arg0.field756;
        }
        arg0.field759 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class32) {
            var9 = ((class32) arg0).field713.field854;
        }
        if (var9) {
            if (arg0.field776 != arg0.field750 && arg0.field773 == -1 && arg0.field782 != 0) {
                var8 = 2;
            }
            if (arg0.field801 > 2) {
                var8 = 6;
            }
            if (arg0.field801 > 3) {
                var8 = 8;
            }
            if (arg0.field805 > 0 && arg0.field801 > 1) {
                var8 = 8;
                arg0.field805--;
            }
        } else {
            if (arg0.field801 > 1) {
                var8 = 6;
            }
            if (arg0.field801 > 2) {
                var8 = 8;
            }
            if (arg0.field805 > 0 && arg0.field801 > 1) {
                var8 = 8;
                arg0.field805--;
            }
        }
        if (arg0.field778[arg0.field801 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field759 == arg0.field756 && arg0.field775 != -1) {
            arg0.field759 = arg0.field775;
        }
        if (var2 < var4) {
            arg0.field809 += var8;
            if (arg0.field809 > var4) {
                arg0.field809 = var4;
            }
        } else if (var2 > var4) {
            arg0.field809 -= var8;
            if (arg0.field809 < var4) {
                arg0.field809 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field749 += var8;
            if (arg0.field749 > var5) {
                arg0.field749 = var5;
            }
        } else if (var3 > var5) {
            arg0.field749 -= var8;
            if (arg0.field749 < var5) {
                arg0.field749 = var5;
            }
        }
        if (arg0.field809 == var4 && arg0.field749 == var5) {
            arg0.field801--;
            if (arg0.field806 > 0) {
                arg0.field806--;
            }
        }
    }

    @ObfuscatedName("ay.ab(Lao;I)V")
    public static final void method874(class35 arg0) {
        if (arg0.field782 == 0) {
            return;
        }
        if (arg0.field773 != -1 && arg0.field773 < 32768) {
            class32 var1 = field277[arg0.field773];
            if (var1 != null) {
                int var2 = arg0.field809 - var1.field809;
                int var3 = arg0.field749 - var1.field749;
                if (var2 != 0 || var3 != 0) {
                    arg0.field776 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field773 >= 32768) {
            int var4 = arg0.field773 - 32768;
            if (field365 == var4) {
                var4 = 2047;
            }
            class3 var5 = field359[var4];
            if (var5 != null) {
                int var6 = arg0.field809 - var5.field809;
                int var7 = arg0.field749 - var5.field749;
                if (var6 != 0 || var7 != 0) {
                    arg0.field776 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field760 != 0 || arg0.field761 != 0) && (arg0.field801 == 0 || arg0.field805 > 0)) {
            int var8 = arg0.field809 - (arg0.field760 * 64 - Statics.field178 * 64 - Statics.field178 * 64);
            int var9 = arg0.field749 - (arg0.field761 * 64 - Statics.field3035 * 64 - Statics.field3035 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field776 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field760 = 0;
            arg0.field761 = 0;
        }
        int var10 = arg0.field776 - arg0.field750 & 0x7FF;
        if (var10 == 0) {
            arg0.field799 = 0;
            return;
        }
        arg0.field799++;
        if (var10 > 1024) {
            arg0.field750 -= arg0.field782;
            boolean var11 = true;
            if (var10 < arg0.field782 || var10 > 2048 - arg0.field782) {
                arg0.field750 = arg0.field776;
                var11 = false;
            }
            if (arg0.field759 == arg0.field753 && (arg0.field799 > 25 || var11)) {
                if (arg0.field754 == -1) {
                    arg0.field759 = arg0.field756;
                } else {
                    arg0.field759 = arg0.field754;
                }
            }
        } else {
            arg0.field750 += arg0.field782;
            boolean var12 = true;
            if (var10 < arg0.field782 || var10 > 2048 - arg0.field782) {
                arg0.field750 = arg0.field776;
                var12 = false;
            }
            if (arg0.field759 == arg0.field753 && (arg0.field799 > 25 || var12)) {
                if (arg0.field755 == -1) {
                    arg0.field759 = arg0.field756;
                } else {
                    arg0.field759 = arg0.field755;
                }
            }
        }
        arg0.field750 &= 0x7FF;
    }

    @ObfuscatedName("ca.ao(Lz;IIB)V")
    public static void method1959(class3 arg0, int arg1, int arg2) {
        if (arg0.field779 == arg1 && arg1 != -1) {
            int var3 = class40.method3092(arg1).field942;
            if (var3 == 1) {
                arg0.field780 = 0;
                arg0.field781 = 0;
                arg0.field785 = arg2;
                arg0.field783 = 0;
            }
            if (var3 == 2) {
                arg0.field783 = 0;
            }
        } else if (arg1 == -1 || arg0.field779 == -1 || class40.method3092(arg1).field928 >= class40.method3092(arg0.field779).field928) {
            arg0.field779 = arg1;
            arg0.field780 = 0;
            arg0.field781 = 0;
            arg0.field785 = arg2;
            arg0.field783 = 0;
            arg0.field806 = arg0.field801;
        }
    }

    @ObfuscatedName("dj.ac(B)I")
    public static int method2159() {
        return field457 ? 2 : 1;
    }

    @ObfuscatedName("x.az(II)V")
    public static void method143(int arg0) {
        field501 = 0L;
        if (arg0 >= 2) {
            field457 = true;
        } else {
            field457 = false;
        }
        method3398();
        if (field453 >= 25) {
            method103();
        }
        field2106 = true;
    }

    @ObfuscatedName("ch.at(I)V")
    public static void method1964() {
        class129.method2570(Statics.field910);
        class132.method2504(Statics.field910);
        if (Statics.field922 != null) {
            Statics.field922.method2565(Statics.field910);
        }
        Statics.field238.method2748();
        Statics.field910.setBackground(Color.black);
        Canvas var0 = Statics.field910;
        var0.setFocusTraversalKeysEnabled(false);
        var0.addKeyListener(class129.field2037);
        var0.addFocusListener(class129.field2037);
        Canvas var1 = Statics.field910;
        var1.addMouseListener(class132.field2068);
        var1.addMouseMotionListener(class132.field2068);
        var1.addFocusListener(class132.field2068);
        if (Statics.field922 != null) {
            Statics.field922.method2564(Statics.field910);
        }
        if (field401 != -1) {
            method707(false);
        }
        field2097 = true;
    }

    @ObfuscatedName("a.aa(I)V")
    public static void method103() {
        field488.method2480(129);
        field488.method2213(method2159());
        field488.method2214(Statics.field1461);
        field488.method2214(Statics.field118);
    }

    @ObfuscatedName("fj.an(I)V")
    public static void method3398() {
        client var0 = Statics.field238;
        synchronized (Statics.field238) {
            Container var1 = Statics.field238.method2754();
            if (var1 != null) {
                Statics.field1942 = Math.max(var1.getSize().width, Statics.field1615);
                Statics.field1385 = Math.max(var1.getSize().height, Statics.field1488);
                if (Statics.field1702 == var1) {
                    Insets var2 = Statics.field1702.getInsets();
                    Statics.field1942 -= var2.right + var2.left;
                    Statics.field1385 -= var2.top + var2.bottom;
                }
                if (Statics.field1942 <= 0) {
                    Statics.field1942 = 1;
                }
                if (Statics.field1385 <= 0) {
                    Statics.field1385 = 1;
                }
                if (method2159() == 1) {
                    Statics.field1461 = field458;
                    Statics.field118 = field504 * 503;
                } else {
                    Statics.field1461 = Math.min(Statics.field1942, 7680);
                    Statics.field118 = Math.min(Statics.field1385, 2160);
                }
                field2108 = (Statics.field1942 - Statics.field1461) / 2;
                field2102 = 0;
                Statics.field910.setSize(Statics.field1461, Statics.field118);
                Statics.field233 = class73.method2658(Statics.field1461, Statics.field118, Statics.field910);
                if (Statics.field1702 == var1) {
                    Insets var3 = Statics.field1702.getInsets();
                    Statics.field910.setLocation(field2108 + var3.left, field2102 + var3.top);
                } else {
                    Statics.field910.setLocation(field2108, field2102);
                }
                method159();
                if (field401 != -1) {
                    method707(true);
                }
                method2614();
            }
        }
    }

    @ObfuscatedName("j.aw(I)V")
    public static void method159() {
        int var0 = Statics.field1461;
        int var1 = Statics.field118;
        if (Statics.field1942 < var0) {
            int var2 = Statics.field1942;
        }
        if (Statics.field1385 < var1) {
            int var3 = Statics.field1385;
        }
        if (Statics.field608 != null) {
            try {
                class124.method2584(Statics.field238, "resize", new Object[] { method2159() });
            } catch (Throwable var5) {
            }
        }
    }

    @ObfuscatedName("de.ai(I)V")
    public static void method2614() {
        int var0 = field2108;
        int var1 = field2102;
        int var2 = Statics.field1942 - Statics.field1461 - var0;
        int var3 = Statics.field1385 - Statics.field118 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field238.method2754();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1702 == var4) {
                Insets var7 = Statics.field1702.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1385);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1942, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1942 + var5 - var2, var6, var2, Statics.field1385);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1385 + var6 - var3, Statics.field1942, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("h.ah(I)V")
    public static final void method107() {
        if (field401 != -1) {
            int var0 = field401;
            if (class164.method3404(var0)) {
                method1858(Statics.field2653[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field446; var1++) {
            if (field389[var1]) {
                field273[var1] = true;
            }
            field493[var1] = field389[var1];
            field389[var1] = false;
        }
        field447 = field249;
        field390 = -1;
        field391 = -1;
        Statics.field2805 = null;
        if (field401 != -1) {
            field446 = 0;
            int var2 = field401;
            int var3 = Statics.field1461;
            int var4 = Statics.field118;
            if (class164.method3404(var2)) {
                Statics.field83 = null;
                method541(Statics.field2653[var2], -1, 0, 0, var3, var4, 0, 0, -1);
                if (Statics.field83 != null) {
                    method541(Statics.field83, -1412584499, 0, 0, var3, var4, Statics.field140, Statics.field88, -1);
                    Statics.field83 = null;
                }
            } else {
                for (int var5 = 0; var5 < 100; var5++) {
                    field389[var5] = true;
                }
            }
        }
        class75.method1643();
        if (field382) {
            method2572();
        } else if (field390 != -1) {
            method2144(field390, field391);
        }
        if (field455 == 3) {
            for (int var6 = 0; var6 < field446; var6++) {
                if (field493[var6]) {
                    class75.method1592(field514[var6], field452[var6], field495[var6], field454[var6], 16711935, 128);
                } else if (field273[var6]) {
                    class75.method1592(field514[var6], field452[var6], field495[var6], field454[var6], 16711680, 128);
                }
            }
        }
        int var7 = Statics.field2136;
        int var8 = Statics.field1710.field809;
        int var9 = Statics.field1710.field749;
        int var10 = field315;
        for (class22 var11 = (class22) class22.field564.method3497(); var11 != null; var11 = (class22) class22.field564.method3475()) {
            if (var11.field560 != -1 || var11.field559 != null) {
                int var12 = 0;
                if (var8 > var11.field557) {
                    var12 += var8 - var11.field557;
                } else if (var8 < var11.field555) {
                    var12 += var11.field555 - var8;
                }
                if (var9 > var11.field561) {
                    var12 += var9 - var11.field561;
                } else if (var9 < var11.field556) {
                    var12 += var11.field556 - var9;
                }
                if (var12 - 64 > var11.field563 || field472 == 0 || var11.field558 != var7) {
                    if (var11.field554 != null) {
                        Statics.field1290.method1005(var11.field554);
                        var11.field554 = null;
                    }
                    if (var11.field566 != null) {
                        Statics.field1290.method1005(var11.field566);
                        var11.field566 = null;
                    }
                } else {
                    var12 -= 64;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = field472 * (var11.field563 - var12) / var11.field563;
                    class54 var10000;
                    if (var11.field554 != null) {
                        var11.field554.method1163(var13);
                    } else if (var11.field560 >= 0) {
                        var10000 = (class54) null;
                        class54 var14 = class54.method1103(Statics.field1940, var11.field560, 0);
                        if (var14 != null) {
                            class58 var15 = var14.method1104().method1137(Statics.field528);
                            class60 var16 = class60.method1160(var15, 100, var13);
                            var16.method1162(-1);
                            Statics.field1290.method1021(var16);
                            var11.field554 = var16;
                        }
                    }
                    if (var11.field566 != null) {
                        var11.field566.method1163(var13);
                        if (!var11.field566.method3564()) {
                            var11.field566 = null;
                        }
                    } else if (var11.field559 != null && (var11.field565 -= var10) <= 0) {
                        int var17 = (int) (Math.random() * (double) var11.field559.length);
                        var10000 = (class54) null;
                        class54 var18 = class54.method1103(Statics.field1940, var11.field559[var17], 0);
                        if (var18 != null) {
                            class58 var19 = var18.method1104().method1137(Statics.field528);
                            class60 var20 = class60.method1160(var19, 100, var13);
                            var20.method1162(0);
                            Statics.field1290.method1021(var20);
                            var11.field566 = var20;
                            var11.field565 = var11.field562 + (int) (Math.random() * (double) (var11.field553 - var11.field562));
                        }
                    }
                }
            }
        }
        field315 = 0;
    }

    @ObfuscatedName("at.ay(IIIIZB)V")
    public static final void method749(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        if (var5 < 0) {
            var5 = 0;
        } else if (var5 > 100) {
            var5 = 100;
        }
        int var6 = (field339 - field420) * var5 / 100 + field420;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field503) {
            short var8 = field503;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field502) {
                var6 = field502;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class75.method1643();
                    class75.method1593(arg0, arg1, var10, arg3, -16777216);
                    class75.method1593(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field367) {
            short var11 = field367;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field269) {
                var6 = field269;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class75.method1643();
                    class75.method1593(arg0, arg1, arg2, var13, -16777216);
                    class75.method1593(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field509 = arg3 * var6 / 334 << 1;
        if (field507 != arg2 || field374 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < 9; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var18 = class86.field1515[var16];
                var14[var15] = var17 * var18 >> 16;
            }
            class81.method1751(var14, 500, 800, arg2, arg3);
        }
        field505 = arg0;
        field370 = arg1;
        field507 = arg2;
        field374 = arg3;
    }

    @ObfuscatedName("s.am(Lal;B)V")
    public static final void method173(class31 arg0) {
        if (Statics.field1710.field809 >> 7 == field477 && Statics.field1710.field749 >> 7 == field478) {
            field477 = 0;
        }
        int var1 = field360;
        if (class31.field696 == arg0 || class31.field701 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class31.field696 == arg0) {
                var3 = Statics.field1710;
                var4 = 33538048;
            } else if (class31.field701 == arg0) {
                var3 = field359[field373];
                var4 = field373 << 14;
            } else {
                var3 = field359[field407[var2]];
                var4 = field407[var2] << 14;
                if (class31.field698 == arg0 && field373 == field407[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method19() && !var3.field29) {
                var3.field42 = false;
                if ((field338 && field360 > 50 || field360 > 200) && class31.field696 != arg0 && var3.field759 == var3.field753) {
                    var3.field42 = true;
                }
                int var5 = var3.field809 >> 7;
                int var6 = var3.field749 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field41 == null || field249 < var3.field36 || field249 >= var3.field49) {
                        if ((var3.field809 & 0x7F) == 64 && (var3.field749 & 0x7F) == 64) {
                            if (field343 == field342[var5][var6]) {
                                continue;
                            }
                            field342[var5][var6] = field343;
                        }
                        var3.field35 = method141(var3.field809, var3.field749, Statics.field2136);
                        Statics.field656.method1688(Statics.field2136, var3.field809, var3.field749, var3.field35, 60, var3, var3.field750, var4, var3.field800);
                    } else {
                        var3.field42 = false;
                        var3.field35 = method141(var3.field809, var3.field749, Statics.field2136);
                        Statics.field656.method1689(Statics.field2136, var3.field809, var3.field749, var3.field35, 60, var3, var3.field750, var4, var3.field48, var3.field39, var3.field37, var3.field45);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ch.aj(ZB)V")
    public static final void method1962(boolean arg0) {
        for (int var1 = 0; var1 < field278; var1++) {
            class32 var2 = field277[field448[var1]];
            int var3 = (field448[var1] << 14) + 536870912;
            if (var2 != null && var2.method19() && var2.field713.field852 == arg0 && var2.field713.method692()) {
                int var4 = var2.field809 >> 7;
                int var5 = var2.field749 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field752 == 1 && (var2.field809 & 0x7F) == 64 && (var2.field749 & 0x7F) == 64) {
                        if (field343 == field342[var4][var5]) {
                            continue;
                        }
                        field342[var4][var5] = field343;
                    }
                    if (!var2.field713.field853) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field656.method1688(Statics.field2136, var2.field809, var2.field749, method141(var2.field809 + (var2.field752 * 64 - 64), var2.field749 + (var2.field752 * 64 - 64), Statics.field2136), var2.field752 * 64 - 64 + 60, var2, var2.field750, var3, var2.field800);
                }
            }
        }
    }

    @ObfuscatedName("cw.ag(B)V")
    public static final void method1865() {
        for (class28 var0 = (class28) field377.method3497(); var0 != null; var0 = (class28) field377.method3475()) {
            if (Statics.field2136 != var0.field637 || var0.field635) {
                var0.method3562();
            } else if (field249 >= var0.field636) {
                var0.method606(field315);
                if (var0.field635) {
                    var0.method3562();
                } else {
                    Statics.field656.method1688(var0.field637, var0.field638, var0.field639, var0.field640, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("dt.ap(I)I")
    public static final int method2153() {
        if (Statics.field608.field127) {
            return Statics.field2136;
        }
        int var0 = 3;
        if (Statics.field597 < 310) {
            int var1 = Statics.field55 >> 7;
            int var2 = Statics.field727 >> 7;
            int var3 = Statics.field1710.field809 >> 7;
            int var4 = Statics.field1710.field749 >> 7;
            if ((class6.field66[Statics.field2136][var1][var2] & 0x4) != 0) {
                var0 = Statics.field2136;
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
                    if ((class6.field66[Statics.field2136][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2136;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field66[Statics.field2136][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2136;
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
                    if ((class6.field66[Statics.field2136][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2136;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field66[Statics.field2136][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2136;
                        }
                    }
                }
            }
        }
        if ((class6.field66[Statics.field2136][Statics.field1710.field809 >> 7][Statics.field1710.field749 >> 7] & 0x4) != 0) {
            var0 = Statics.field2136;
        }
        return var0;
    }

    @ObfuscatedName("cd.af(Lao;IIIIIB)V")
    public static final void method2058(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method19()) {
            return;
        }
        if (arg0 instanceof class32) {
            class37 var6 = ((class32) arg0).field713;
            if (var6.field828 != null) {
                var6 = var6.method684();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field360) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field29) {
                return;
            }
            if (var8.field31 != -1 || var8.field43 != -1) {
                method882(arg0, arg0.field748 + 15);
                if (field344 > -1) {
                    if (var8.field31 != -1) {
                        Statics.field1474[var8.field31].method1516(field344 + arg2 - 12, field258 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field43 != -1) {
                        Statics.field27[var8.field43].method1516(field344 + arg2 - 12, field258 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field431 == 10 && field413 == field407[arg1]) {
                method882(arg0, arg0.field748 + 15);
                if (field344 > -1) {
                    Statics.field984[1].method1516(field344 + arg2 - 12, field258 + arg3 - var7);
                }
            }
        } else {
            class37 var9 = ((class32) arg0).field713;
            if (var9.field828 != null) {
                var9 = var9.method684();
            }
            if (var9.field845 >= 0 && var9.field845 < Statics.field27.length) {
                method882(arg0, arg0.field748 + 15);
                if (field344 > -1) {
                    Statics.field27[var9.field845].method1516(field344 + arg2 - 12, field258 + arg3 - 30);
                }
            }
            if (field431 == 1 && field259 == field448[arg1 - field360] && field249 % 20 < 10) {
                method882(arg0, arg0.field748 + 15);
                if (field344 > -1) {
                    Statics.field984[0].method1516(field344 + arg2 - 12, field258 + arg3 - 28);
                }
            }
        }
        if (arg0.field798 != null && (arg1 >= field360 || !arg0.field763 && (field279 == 4 || !arg0.field762 && (field279 == 0 || field279 == 3 || field279 == 1 && method2792(((class3) arg0).field32, false))))) {
            method882(arg0, arg0.field748);
            if (field344 > -1 && field451 < field430) {
                field337[field451] = Statics.field989.method3655(arg0.field798) / 2;
                field336[field451] = Statics.field989.field3085;
                field421[field451] = field344;
                field335[field451] = field258;
                field272[field451] = arg0.field765;
                field319[field451] = arg0.field766;
                field340[field451] = arg0.field764;
                field341[field451] = arg0.field798;
                field451++;
            }
        }
        if (arg0.field770 > field249) {
            method882(arg0, arg0.field748 + 15);
            if (field344 > -1) {
                int var10;
                if (arg1 < field360) {
                    var10 = 30;
                } else {
                    class37 var11 = ((class32) arg0).field713;
                    var10 = var11.field847;
                }
                int var12 = arg0.field771 * var10 / arg0.field758;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field771 > 0) {
                    var12 = 1;
                }
                class75.method1593(field344 + arg2 - var10 / 2, field258 + arg3 - 3, var12, 5, 65280);
                class75.method1593(field344 + arg2 - var10 / 2 + var12, field258 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field769[var13] > field249) {
                method882(arg0, arg0.field748 / 2);
                if (field344 > -1) {
                    if (var13 == 1) {
                        field258 -= 20;
                    }
                    if (var13 == 2) {
                        field344 -= 15;
                        field258 -= 10;
                    }
                    if (var13 == 3) {
                        field344 += 15;
                        field258 -= 10;
                    }
                    Statics.field1734[arg0.field768[var13]].method1516(field344 + arg2 - 12, field258 + arg3 - 12);
                    Statics.field292.method3662(Integer.toString(arg0.field767[var13]), field344 + arg2 - 1, field258 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("cq.au(IIIIB)V")
    public static final void method1860(int arg0, int arg1, int arg2, int arg3) {
        field451 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field360 + field278; var6++) {
            class35 var7;
            if (var6 == -1) {
                var7 = Statics.field1710;
            } else if (var6 < field360) {
                var7 = field359[field407[var6]];
                if (field373 == field407[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field277[field448[var6 - field360]];
            }
            method2058(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method2058(field359[field373], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field451; var8++) {
            int var9 = field421[var8];
            int var10 = field335[var8];
            int var11 = field337[var8];
            int var12 = field336[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field335[var14] - field336[var14] && var10 - var12 < field335[var14] + 2 && var9 - var11 < field421[var14] + field337[var14] && var9 + var11 > field421[var14] - field337[var14] && field335[var14] - field336[var14] < var10) {
                        var10 = field335[var14] - field336[var14];
                        var13 = true;
                    }
                }
            }
            field344 = field421[var8];
            field258 = field335[var8] = var10;
            String var15 = field341[var8];
            if (field403 == 0) {
                int var16 = 16776960;
                if (field272[var8] < 6) {
                    var16 = field460[field272[var8]];
                }
                if (field272[var8] == 6) {
                    var16 = field343 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field272[var8] == 7) {
                    var16 = field343 % 20 < 10 ? 255 : 65535;
                }
                if (field272[var8] == 8) {
                    var16 = field343 % 20 < 10 ? 45056 : 8454016;
                }
                if (field272[var8] == 9) {
                    int var17 = 150 - field340[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field272[var8] == 10) {
                    int var18 = 150 - field340[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field272[var8] == 11) {
                    int var19 = 150 - field340[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field319[var8] == 0) {
                    Statics.field989.method3662(var15, field344 + arg0, field258 + arg1, var16, 0);
                }
                if (field319[var8] == 1) {
                    Statics.field989.method3664(var15, field344 + arg0, field258 + arg1, var16, 0, field343);
                }
                if (field319[var8] == 2) {
                    Statics.field989.method3665(var15, field344 + arg0, field258 + arg1, var16, 0, field343);
                }
                if (field319[var8] == 3) {
                    Statics.field989.method3694(var15, field344 + arg0, field258 + arg1, var16, 0, field343, 150 - field340[var8]);
                }
                if (field319[var8] == 4) {
                    int var20 = (150 - field340[var8]) * (Statics.field989.method3655(var15) + 100) / 150;
                    class75.method1585(field344 + arg0 - 50, arg1, field344 + arg0 + 50, arg1 + arg3);
                    Statics.field989.method3660(var15, field344 + arg0 + 50 - var20, field258 + arg1, var16, 0);
                    class75.method1620(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field319[var8] == 5) {
                    int var21 = 150 - field340[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class75.method1585(arg0, field258 + arg1 - Statics.field989.field3085 - 1, arg0 + arg2, field258 + arg1 + 5);
                    Statics.field989.method3662(var15, field344 + arg0, field258 + arg1 + var22, var16, 0);
                    class75.method1620(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field989.method3662(var15, field344 + arg0, field258 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("e.av(B)V")
    public static final void method32() {
        field358 = 0;
        int var0 = (Statics.field1710.field809 >> 7) + Statics.field178;
        int var1 = (Statics.field1710.field749 >> 7) + Statics.field3035;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field358 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field358 = 1;
        }
        if (field358 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field358 = 0;
        }
    }

    @ObfuscatedName("av.bs(IIIIB)V")
    public static final void method1061(int arg0, int arg1, int arg2, int arg3) {
        if (field349 == 1) {
            Statics.field371[field410 / 100].method1516(field346 - 8, field347 - 8);
        }
        if (field349 == 2) {
            Statics.field371[field410 / 100 + 4].method1516(field346 - 8, field347 - 8);
        }
        method32();
    }

    @ObfuscatedName("ay.bo(Lao;II)V")
    public static final void method882(class35 arg0, int arg1) {
        method3399(arg0.field809, arg0.field749, arg1);
    }

    @ObfuscatedName("fm.bw(IIII)V")
    public static final void method3399(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field344 = -1;
            field258 = -1;
            return;
        }
        int var3 = method141(arg0, arg1, Statics.field2136) - arg2;
        int var4 = arg0 - Statics.field55;
        int var5 = var3 - Statics.field28;
        int var6 = arg1 - Statics.field727;
        int var7 = class86.field1515[Statics.field597];
        int var8 = class86.field1516[Statics.field597];
        int var9 = class86.field1515[Statics.field923];
        int var10 = class86.field1516[Statics.field923];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field344 = field509 * var11 / var15 + field507 / 2;
            field258 = field509 * var14 / var15 + field374 / 2;
        } else {
            field344 = -1;
            field258 = -1;
        }
    }

    @ObfuscatedName("q.bm(IIII)I")
    public static final int method141(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field75[var5][var3][var4] + class6.field75[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field75[var5][var3][var4 + 1] + class6.field75[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("b.bj(ZI)V")
    public static final void method546(boolean arg0) {
        field414 = arg0;
        if (!field414) {
            int var1 = field484.method2265();
            int var2 = (field283 - field484.field1889) / 16;
            Statics.field1959 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    Statics.field1959[var3][var4] = field484.method2233();
                }
            }
            int var5 = field484.method2263();
            int var6 = field484.method2374();
            int var7 = field484.method2221();
            int var8 = field484.method2265();
            Statics.field731 = new int[var2];
            Statics.field115 = new int[var2];
            Statics.field1091 = new int[var2];
            Statics.field13 = new byte[var2][];
            Statics.field611 = new byte[var2][];
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
                        Statics.field731[var10] = var13;
                        Statics.field115[var10] = Statics.field191.method2963("m" + var11 + "_" + var12);
                        Statics.field1091[var10] = Statics.field191.method2963("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method614(var7, var8, var6, var1, var5);
            return;
        }
        field484.method2483();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field484.method2484(1);
                    if (var17 == 1) {
                        field266[var14][var15][var16] = field484.method2484(26);
                    } else {
                        field266[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field484.method2485();
        int var18 = (field283 - field484.field1889) / 16;
        Statics.field1959 = new int[var18][4];
        for (int var19 = 0; var19 < var18; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field1959[var19][var20] = field484.method2273();
            }
        }
        int var21 = field484.method2221();
        int var22 = field484.method2228();
        int var23 = field484.method2221();
        int var24 = field484.method2221();
        int var25 = field484.method2231();
        Statics.field731 = new int[var18];
        Statics.field115 = new int[var18];
        Statics.field1091 = new int[var18];
        Statics.field13 = new byte[var18][];
        Statics.field611 = new byte[var18][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field266[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field731[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field731[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field115[var26] = Statics.field191.method2963("m" + var35 + "_" + var36);
                            Statics.field1091[var26] = Statics.field191.method2963("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method614(var23, var25, var22, var21, var24);
    }

    @ObfuscatedName("ae.ba(IIIIII)V")
    public static final void method614(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field965 == arg0 && Statics.field86 == arg1 && field293 == arg2 || !field338) {
            return;
        }
        Statics.field965 = arg0;
        Statics.field86 = arg1;
        field293 = arg2;
        if (!field338) {
            field293 = 0;
        }
        method2731(25);
        Statics.method129(class148.field2454, true);
        int var5 = Statics.field178;
        int var6 = Statics.field3035;
        Statics.field178 = (arg0 - 6) * 8;
        Statics.field3035 = (arg1 - 6) * 8;
        int var7 = Statics.field178 - var5;
        int var8 = Statics.field3035 - var6;
        int var9 = Statics.field178;
        int var10 = Statics.field3035;
        for (int var11 = 0; var11 < 32768; var11++) {
            class32 var12 = field277[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field751[var13] -= var7;
                    var12.field803[var13] -= var8;
                }
                var12.field809 -= var7 * 128;
                var12.field749 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field359[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field751[var16] -= var7;
                    var15.field803[var16] -= var8;
                }
                var15.field809 -= var7 * 128;
                var15.field749 -= var8 * 128;
            }
        }
        Statics.field2136 = arg2;
        Statics.field1710.method661(arg3, arg4, false);
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
                        field394[var27][var23][var24] = field394[var27][var25][var26];
                    } else {
                        field394[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class16 var28 = (class16) field375.method3497(); var28 != null; var28 = (class16) field375.method3475()) {
            var28.field199 -= var7;
            var28.field200 -= var8;
            if (var28.field199 < 0 || var28.field200 < 0 || var28.field199 >= 104 || var28.field200 >= 104) {
                var28.method3562();
            }
        }
        if (field477 != 0) {
            field477 -= var7;
            field478 -= var8;
        }
        field485 = 0;
        field491 = false;
        field363 = -1;
        field377.method3483();
        field470.method3483();
    }

    @ObfuscatedName("cl.br(ZI)V")
    public static final void method2150(boolean arg0) {
        method2561();
        field280++;
        if (field280 < 50 && !arg0) {
            return;
        }
        field280 = 0;
        if (field291 || Statics.field1617 == null) {
            return;
        }
        field488.method2480(132);
        try {
            Statics.field1617.method2725(field488.field1888, 0, field488.field1889);
            field488.field1889 = 0;
        } catch (IOException var2) {
            field291 = true;
        }
    }

    @ObfuscatedName("o.bd(B)V")
    public static final void method544() {
        method2150(false);
        field294 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field13.length; var1++) {
            if (Statics.field115[var1] != -1 && Statics.field13[var1] == null) {
                Statics.field13[var1] = Statics.field191.method2948(Statics.field115[var1], 0);
                if (Statics.field13[var1] == null) {
                    var0 = false;
                    field294++;
                }
            }
            if (Statics.field1091[var1] != -1 && Statics.field611[var1] == null) {
                Statics.field611[var1] = Statics.field191.method2951(Statics.field1091[var1], 0, Statics.field1959[var1]);
                if (Statics.field611[var1] == null) {
                    var0 = false;
                    field294++;
                }
            }
        }
        if (!var0) {
            field298 = 1;
            return;
        }
        field296 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field13.length; var3++) {
            byte[] var4 = Statics.field611[var3];
            if (var4 != null) {
                int var5 = (Statics.field731[var3] >> 8) * 64 - Statics.field178;
                int var6 = (Statics.field731[var3] & 0xFF) * 64 - Statics.field3035;
                if (field414) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class111 var9 = new class111(var4);
                int var10 = -1;
                label493: while (true) {
                    int var11 = var9.method2241();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2241();
                            if (var16 == 0) {
                                continue label493;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2228() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class38 var22 = class38.method1667(var10);
                                if (var19 != 22 || !field338 || var22.field861 != 0 || var22.field875 == 1 || var22.field899) {
                                    if (!var22.method741()) {
                                        field296++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2241();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2228();
                    }
                }
            }
        }
        if (!var2) {
            field298 = 2;
            return;
        }
        if (field298 != 0) {
            Statics.method129(class148.field2454 + class2.field25 + class2.field22 + 100 + "%" + class2.field20, true);
        }
        method2561();
        method138();
        method2561();
        Statics.field656.method1677();
        method2561();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field432[var23].method3786();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field66[var24][var25][var26] = 0;
                }
            }
        }
        method2561();
        class6.method2055();
        int var27 = Statics.field13.length;
        class22.method1389();
        method2150(true);
        if (!field414) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field731[var28] >> 8) * 64 - Statics.field178;
                int var30 = (Statics.field731[var28] & 0xFF) * 64 - Statics.field3035;
                byte[] var31 = Statics.field13[var28];
                if (var31 != null) {
                    method2561();
                    class6.method1967(var31, var29, var30, Statics.field965 * 8 - 48, Statics.field86 * 8 - 48, field432);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field731[var32] >> 8) * 64 - Statics.field178;
                int var34 = (Statics.field731[var32] & 0xFF) * 64 - Statics.field3035;
                byte[] var35 = Statics.field13[var32];
                if (var35 == null && Statics.field86 < 800) {
                    method2561();
                    class6.method113(var33, var34, 64, 64);
                }
            }
            method2150(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field611[var36];
                if (var37 != null) {
                    int var38 = (Statics.field731[var36] >> 8) * 64 - Statics.field178;
                    int var39 = (Statics.field731[var36] & 0xFF) * 64 - Statics.field3035;
                    method2561();
                    class6.method1487(var37, var38, var39, Statics.field656, field432);
                }
            }
        }
        if (field414) {
            for (int var40 = 0; var40 < 4; var40++) {
                method2561();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        boolean var43 = false;
                        int var44 = field266[var40][var41][var42];
                        if (var44 != -1) {
                            int var45 = var44 >> 24 & 0x3;
                            int var46 = var44 >> 1 & 0x3;
                            int var47 = var44 >> 14 & 0x3FF;
                            int var48 = var44 >> 3 & 0x7FF;
                            int var49 = (var47 / 8 << 8) + var48 / 8;
                            for (int var50 = 0; var50 < Statics.field731.length; var50++) {
                                if (Statics.field731[var50] == var49 && Statics.field13[var50] != null) {
                                    class6.method530(Statics.field13[var50], var40, var41 * 8, var42 * 8, var45, (var47 & 0x7) * 8, (var48 & 0x7) * 8, var46, field432);
                                    var43 = true;
                                    break;
                                }
                            }
                        }
                        if (!var43) {
                            int var51 = var40;
                            int var52 = var41 * 8;
                            int var53 = var42 * 8;
                            for (int var54 = 0; var54 < 8; var54++) {
                                for (int var55 = 0; var55 < 8; var55++) {
                                    class6.field75[var51][var52 + var54][var53 + var55] = 0;
                                }
                            }
                            if (var52 > 0) {
                                for (int var56 = 1; var56 < 8; var56++) {
                                    class6.field75[var51][var52][var53 + var56] = class6.field75[var51][var52 - 1][var53 + var56];
                                }
                            }
                            if (var53 > 0) {
                                for (int var57 = 1; var57 < 8; var57++) {
                                    class6.field75[var51][var52 + var57][var53] = class6.field75[var51][var52 + var57][var53 - 1];
                                }
                            }
                            if (var52 > 0 && class6.field75[var51][var52 - 1][var53] != 0) {
                                class6.field75[var51][var52][var53] = class6.field75[var51][var52 - 1][var53];
                            } else if (var53 > 0 && class6.field75[var51][var52][var53 - 1] != 0) {
                                class6.field75[var51][var52][var53] = class6.field75[var51][var52][var53 - 1];
                            } else if (var52 > 0 && var53 > 0 && class6.field75[var51][var52 - 1][var53 - 1] != 0) {
                                class6.field75[var51][var52][var53] = class6.field75[var51][var52 - 1][var53 - 1];
                            }
                        }
                    }
                }
            }
            for (int var58 = 0; var58 < 13; var58++) {
                for (int var59 = 0; var59 < 13; var59++) {
                    int var60 = field266[0][var58][var59];
                    if (var60 == -1) {
                        class6.method113(var58 * 8, var59 * 8, 8, 8);
                    }
                }
            }
            method2150(true);
            for (int var61 = 0; var61 < 4; var61++) {
                method2561();
                for (int var62 = 0; var62 < 13; var62++) {
                    label334: for (int var63 = 0; var63 < 13; var63++) {
                        int var64 = field266[var61][var62][var63];
                        if (var64 != -1) {
                            int var65 = var64 >> 24 & 0x3;
                            int var66 = var64 >> 1 & 0x3;
                            int var67 = var64 >> 14 & 0x3FF;
                            int var68 = var64 >> 3 & 0x7FF;
                            int var69 = (var67 / 8 << 8) + var68 / 8;
                            for (int var70 = 0; var70 < Statics.field731.length; var70++) {
                                if (Statics.field731[var70] == var69 && Statics.field611[var70] != null) {
                                    byte[] var71 = Statics.field611[var70];
                                    int var72 = var62 * 8;
                                    int var73 = var63 * 8;
                                    int var74 = (var67 & 0x7) * 8;
                                    int var75 = (var68 & 0x7) * 8;
                                    class81 var76 = Statics.field656;
                                    class220[] var77 = field432;
                                    class111 var78 = new class111(var71);
                                    int var79 = -1;
                                    while (true) {
                                        int var80 = var78.method2241();
                                        if (var80 == 0) {
                                            continue label334;
                                        }
                                        var79 += var80;
                                        int var81 = 0;
                                        while (true) {
                                            int var82 = var78.method2241();
                                            if (var82 == 0) {
                                                break;
                                            }
                                            var81 += var82 - 1;
                                            int var83 = var81 & 0x3F;
                                            int var84 = var81 >> 6 & 0x3F;
                                            int var85 = var81 >> 12;
                                            int var86 = var78.method2228();
                                            int var87 = var86 >> 2;
                                            int var88 = var86 & 0x3;
                                            if (var65 == var85 && var84 >= var74 && var84 < var74 + 8 && var83 >= var75 && var83 < var75 + 8) {
                                                class38 var89 = class38.method1667(var79);
                                                int var90 = var72 + Statics.method657(var84 & 0x7, var83 & 0x7, var66, var89.field877, var89.field872, var88);
                                                int var92 = var84 & 0x7;
                                                int var93 = var83 & 0x7;
                                                int var95 = var89.field877;
                                                int var96 = var89.field872;
                                                if ((var88 & 0x1) == 1) {
                                                    int var97 = var95;
                                                    var95 = var96;
                                                    var96 = var97;
                                                }
                                                int var98 = var66 & 0x3;
                                                int var99;
                                                if (var98 == 0) {
                                                    var99 = var93;
                                                } else if (var98 == 1) {
                                                    var99 = 7 - var92 - (var95 - 1);
                                                } else if (var98 == 2) {
                                                    var99 = 7 - var93 - (var96 - 1);
                                                } else {
                                                    var99 = var92;
                                                }
                                                int var100 = var73 + var99;
                                                if (var90 > 0 && var100 > 0 && var90 < 103 && var100 < 103) {
                                                    int var101 = var61;
                                                    if ((class6.field66[1][var90][var100] & 0x2) == 2) {
                                                        var101 = var61 - 1;
                                                    }
                                                    class220 var102 = null;
                                                    if (var101 >= 0) {
                                                        var102 = var77[var101];
                                                    }
                                                    class6.method7(var61, var90, var100, var79, var66 + var88 & 0x3, var87, var76, var102);
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
        method2150(true);
        method138();
        method2561();
        class6.method2441(Statics.field656, field432);
        method2150(true);
        int var103 = class6.field68;
        if (var103 > Statics.field2136) {
            var103 = Statics.field2136;
        }
        if (var103 < Statics.field2136 - 1) {
            int var104 = Statics.field2136 - 1;
        }
        if (field338) {
            Statics.field656.method1678(class6.field68);
        } else {
            Statics.field656.method1678(0);
        }
        for (int var105 = 0; var105 < 104; var105++) {
            for (int var106 = 0; var106 < 104; var106++) {
                method638(var105, var106);
            }
        }
        method2561();
        for (class16 var107 = (class16) field375.method3497(); var107 != null; var107 = (class16) field375.method3475()) {
            if (var107.field208 == -1) {
                var107.field207 = 0;
                method165(var107);
            } else {
                var107.method3562();
            }
        }
        class38.field864.method3412();
        if (Statics.field1702 != null) {
            field488.method2480(31);
            field488.method2216(1057001181);
        }
        if (!field414) {
            int var108 = (Statics.field965 - 6) / 8;
            int var109 = (Statics.field965 + 6) / 8;
            int var110 = (Statics.field86 - 6) / 8;
            int var111 = (Statics.field86 + 6) / 8;
            for (int var112 = var108 - 1; var112 <= var109 + 1; var112++) {
                for (int var113 = var110 - 1; var113 <= var111 + 1; var113++) {
                    if (var112 < var108 || var112 > var109 || var113 < var110 || var113 > var111) {
                        Statics.field191.method2968("m" + var112 + "_" + var113);
                        Statics.field191.method2968("l" + var112 + "_" + var113);
                    }
                }
            }
        }
        method2731(30);
        method2561();
        class6.method2172();
        field488.method2480(117);
        class136.method1867();
    }

    @ObfuscatedName("l.bn(II)V")
    public static final void method127(int arg0) {
        int[] var1 = Statics.field138.field1338;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field66[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field656.method1718(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field66[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field656.method1718(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field138.method1501();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field66[arg0][var10][var9] & 0x18) == 0) {
                    method2559(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field66[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2559(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field271 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field656.method1721(Statics.field2136, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class38.method1667(var14).field889;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field432[Statics.field2136].field3134;
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
                        field476[field271] = Statics.field2132[var15];
                        field474[field271] = var16;
                        field475[field271] = var17;
                        field271++;
                    }
                }
            }
        }
        Statics.field233.method1493();
    }

    @ObfuscatedName("db.bu(IIIIII)V")
    public static final void method2559(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field656.method1703(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field656.method1825(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field138.field1338;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class38 var13 = class38.method1667(var12);
            if (var13.field890 == -1) {
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
                class76 var14 = Statics.field2543[var13.field890];
                if (var14 != null) {
                    int var15 = (var13.field877 * 4 - var14.field1356) / 2;
                    int var16 = (var13.field872 * 4 - var14.field1357) / 2;
                    var14.method1647(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field872) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field656.method1705(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field656.method1825(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class38 var22 = class38.method1667(var21);
            if (var22.field890 != -1) {
                class76 var23 = Statics.field2543[var22.field890];
                if (var23 != null) {
                    int var24 = (var22.field877 * 4 - var23.field1356) / 2;
                    int var25 = (var22.field872 * 4 - var23.field1357) / 2;
                    var23.method1647(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field872) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field138.field1338;
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
        int var29 = Statics.field656.method1721(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class38 var31 = class38.method1667(var30);
        if (var31.field890 == -1) {
            return;
        }
        class76 var32 = Statics.field2543[var31.field890];
        if (var32 != null) {
            int var33 = (var31.field877 * 4 - var32.field1356) / 2;
            int var34 = (var31.field872 * 4 - var32.field1357) / 2;
            var32.method1647(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field872) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.bq(I)Z")
    public static final boolean method179() {
        if (Statics.field1617 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1617.method2723();
            if (var0 == 0) {
                return false;
            }
            if (field284 == -1) {
                Statics.field1617.method2724(field484.field1888, 0, 1);
                field484.field1889 = 0;
                field284 = field484.method2482();
                field283 = class179.field2942[field284];
                var0--;
            }
            if (field283 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1617.method2724(field484.field1888, 0, 1);
                field283 = field484.field1888[0] & 0xFF;
                var0--;
            }
            if (field283 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1617.method2724(field484.field1888, 0, 2);
                field484.field1889 = 0;
                field283 = field484.method2231();
                var0 -= 2;
            }
            if (var0 < field283) {
                return false;
            }
            field484.field1889 = 0;
            Statics.field1617.method2724(field484.field1888, 0, field283);
            field285 = 0;
            field290 = field289;
            field289 = field426;
            field426 = field284;
            if (field284 == 244) {
                field511 = 1;
                field434 = field404;
                field284 = -1;
                return true;
            }
            if (field284 == 66) {
                int var1 = field484.method2231();
                int var2 = field484.method2273();
                int var3 = field484.method2256();
                class4 var4 = (class4) field402.method3445((long) var2);
                if (var4 != null) {
                    method510(var4, var4.field58 != var1);
                }
                method33(var2, var1, var3);
                field284 = -1;
                return true;
            }
            if (field284 == 196) {
                int var5 = field484.method2265();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = field484.method2231();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field484.method2405();
                int var8 = field484.method2273();
                for (int var9 = var5; var9 <= var6; var9++) {
                    long var10 = ((long) var8 << 32) + (long) var9;
                    class199 var12 = field270.method3445(var10);
                    if (var12 != null) {
                        var12.method3562();
                    }
                    field270.method3446(new class192(var7), var10);
                }
                field284 = -1;
                return true;
            }
            if (field284 == 192) {
                int var13 = field484.method2242();
                int var14 = field484.method2233();
                class164 var15 = Statics.method2717(var14);
                if (var15.field2695 != var13 || var13 == -1) {
                    var15.field2695 = var13;
                    var15.field2770 = 0;
                    var15.field2771 = 0;
                    method2625(var15);
                }
                field284 = -1;
                return true;
            }
            if (field284 == 179) {
                for (int var16 = 0; var16 < field359.length; var16++) {
                    if (field359[var16] != null) {
                        field359[var16].field779 = -1;
                    }
                }
                for (int var17 = 0; var17 < field277.length; var17++) {
                    if (field277[var17] != null) {
                        field277[var17].field779 = -1;
                    }
                }
                field284 = -1;
                return true;
            }
            if (field284 == 134) {
                int var18 = field484.method2265();
                int var19 = field484.method2273();
                class164 var20 = Statics.method2717(var19);
                if (var20 != null && var20.field2732 == 0) {
                    if (var18 > var20.field2674 - var20.field2666) {
                        var18 = var20.field2674 - var20.field2666;
                    }
                    if (var18 < 0) {
                        var18 = 0;
                    }
                    if (var20.field2672 != var18) {
                        var20.field2672 = var18;
                        method2625(var20);
                    }
                }
                field284 = -1;
                return true;
            }
            if (field284 == 131) {
                int var21 = field484.method2374();
                String var22 = field484.method2290();
                int var23 = field484.method2256();
                if (var23 >= 1 && var23 <= 8) {
                    if (var22.equalsIgnoreCase("null")) {
                        var22 = null;
                    }
                    field424[var23 - 1] = var22;
                    field260[var23 - 1] = var21 == 0;
                }
                field284 = -1;
                return true;
            }
            if (field284 == 55) {
                int var24 = field484.method2231();
                int var25 = field484.method2233();
                int var26 = field484.method2231();
                int var27 = field484.method2221();
                class164 var28 = Statics.method2717(var25);
                if (var28.field2776 != var27 || var28.field2696 != var24 || var28.field2702 != var26) {
                    var28.field2776 = var27;
                    var28.field2696 = var24;
                    var28.field2702 = var26;
                    method2625(var28);
                }
                field284 = -1;
                return true;
            }
            if (field284 == 139) {
                class24 var29 = new class24();
                var29.field594 = field484.method2290();
                var29.field601 = field484.method2231();
                int var30 = field484.method2233();
                var29.field586 = var30;
                method2731(45);
                Statics.field1617.method2720();
                Statics.field1617 = null;
                if (var29.method560() != field244) {
                    field244 = var29.method560();
                    class47.method587(var29.method560());
                }
                Statics.field3 = var29.field594;
                field240 = var29.field601;
                field241 = var29.field586;
                Statics.field1546 = field242 == 0 ? 43594 : var29.field601 + 40000;
                Statics.field660 = field242 == 0 ? 443 : var29.field601 + 50000;
                Statics.field221 = Statics.field1546;
                field284 = -1;
                return false;
            }
            if (field284 == 14) {
                method172();
                int var31 = field484.method2228();
                int var32 = field484.method2254();
                int var33 = field484.method2413();
                field380[var32] = var33;
                field378[var32] = var31;
                field379[var32] = 1;
                for (int var34 = 0; var34 < 98; var34++) {
                    if (var33 >= class146.field2189[var34]) {
                        field379[var32] = var34 + 2;
                    }
                }
                field419[++field497 - 1 & 0x1F] = var32;
                field284 = -1;
                return true;
            }
            if (field284 == 147) {
                field491 = false;
                for (int var35 = 0; var35 < 5; var35++) {
                    field473[var35] = false;
                }
                field284 = -1;
                return true;
            }
            if (field284 == 113) {
                field491 = true;
                Statics.field1462 = field484.method2228();
                Statics.field2200 = field484.method2228();
                Statics.field2054 = field484.method2231();
                Statics.field1100 = field484.method2228();
                Statics.field1156 = field484.method2228();
                if (Statics.field1156 >= 100) {
                    Statics.field55 = Statics.field1462 * 128 + 64;
                    Statics.field727 = Statics.field2200 * 128 + 64;
                    Statics.field28 = method141(Statics.field55, Statics.field727, Statics.field2136) - Statics.field2054;
                }
                field284 = -1;
                return true;
            }
            if (field284 == 194) {
                int var36 = field484.method2233();
                int var37 = field484.method2231();
                if (var36 < -70000) {
                    var37 += 32768;
                }
                class164 var38;
                if (var36 >= 0) {
                    var38 = Statics.method2717(var36);
                } else {
                    var38 = null;
                }
                while (field484.field1889 < field283) {
                    int var39 = field484.method2241();
                    int var40 = field484.method2231();
                    int var41 = 0;
                    if (var40 != 0) {
                        var41 = field484.method2228();
                        if (var41 == 255) {
                            var41 = field484.method2233();
                        }
                    }
                    if (var38 != null && var39 >= 0 && var39 < var38.field2652.length) {
                        var38.field2652[var39] = var40;
                        var38.field2767[var39] = var41;
                    }
                    class15.method539(var37, var39, var40 - 1, var41);
                }
                if (var38 != null) {
                    method2625(var38);
                }
                method172();
                field429[++field418 - 1 & 0x1F] = var37 & 0x7FFF;
                field284 = -1;
                return true;
            }
            if (field284 == 20) {
                for (int var42 = 0; var42 < Statics.field3057; var42++) {
                    class48 var43 = class48.method804(var42);
                    if (var43 != null) {
                        class167.field2799[var42] = 0;
                        class167.field2801[var42] = 0;
                    }
                }
                method172();
                field313 += 32;
                field284 = -1;
                return true;
            }
            if (field284 == 10) {
                int var44 = field484.method2265();
                int var45 = field484.method2233();
                class164 var46 = Statics.method2717(var45);
                if (var46.field2691 != 2 || var46.field2692 != var44) {
                    var46.field2691 = 2;
                    var46.field2692 = var44;
                    method2625(var46);
                }
                field284 = -1;
                return true;
            }
            if (field284 == 93) {
                String var47 = field484.method2290();
                int var48 = field484.method2231();
                byte var49 = field484.method2409();
                boolean var50 = false;
                if (var49 == -128) {
                    var50 = true;
                }
                if (var50) {
                    if (Statics.field1709 == 0) {
                        field284 = -1;
                        return true;
                    }
                    boolean var51 = false;
                    int var52;
                    for (var52 = 0; var52 < Statics.field1709 && (!Statics.field1954[var52].field575.equals(var47) || Statics.field1954[var52].field572 != var48); var52++) {
                    }
                    if (var52 < Statics.field1709) {
                        while (var52 < Statics.field1709 - 1) {
                            Statics.field1954[var52] = Statics.field1954[var52 + 1];
                            var52++;
                        }
                        Statics.field1709--;
                        Statics.field1954[Statics.field1709] = null;
                    }
                } else {
                    field484.method2290();
                    class23 var53 = new class23();
                    var53.field575 = var47;
                    var53.field573 = class155.method1387(var53.field575, Statics.field2944);
                    var53.field572 = var48;
                    var53.field582 = var49;
                    int var54;
                    for (var54 = Statics.field1709 - 1; var54 >= 0; var54--) {
                        int var55 = Statics.field1954[var54].field573.compareTo(var53.field573);
                        if (var55 == 0) {
                            Statics.field1954[var54].field572 = var48;
                            Statics.field1954[var54].field582 = var49;
                            if (var47.equals(Statics.field1710.field32)) {
                                Statics.field968 = var49;
                            }
                            field435 = field404;
                            field284 = -1;
                            return true;
                        }
                        if (var55 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1709 >= Statics.field1954.length) {
                        field284 = -1;
                        return true;
                    }
                    for (int var56 = Statics.field1709 - 1; var56 > var54; var56--) {
                        Statics.field1954[var56 + 1] = Statics.field1954[var56];
                    }
                    if (Statics.field1709 == 0) {
                        Statics.field1954 = new class23[100];
                    }
                    Statics.field1954[var54 + 1] = var53;
                    Statics.field1709++;
                    if (var47.equals(Statics.field1710.field32)) {
                        Statics.field968 = var49;
                    }
                }
                field435 = field404;
                field284 = -1;
                return true;
            }
            if (field284 == 168) {
                method2528();
                field284 = -1;
                return false;
            }
            if (field284 == 154) {
                Statics.field1331 = field484.method2256();
                Statics.field857 = field484.method2254();
                field284 = -1;
                return true;
            }
            if (field284 == 250) {
                int var57 = field283 + field484.field1889;
                int var58 = field484.method2231();
                int var59 = field484.method2231();
                if (field401 != var58) {
                    field401 = var58;
                    method707(false);
                    int var60 = field401;
                    if (class164.method3404(var60)) {
                        class164[] var61 = Statics.field2653[var60];
                        for (int var62 = 0; var62 < var61.length; var62++) {
                            class164 var63 = var61[var62];
                            if (var63 != null) {
                                var63.field2770 = 0;
                                var63.field2771 = 0;
                            }
                        }
                    }
                    class34.method2916(field401);
                    for (int var64 = 0; var64 < 100; var64++) {
                        field389[var64] = true;
                    }
                }
                while (var59-- > 0) {
                    int var65 = field484.method2233();
                    int var66 = field484.method2231();
                    int var67 = field484.method2228();
                    class4 var68 = (class4) field402.method3445((long) var65);
                    if (var68 != null && var68.field58 != var66) {
                        method510(var68, true);
                        var68 = null;
                    }
                    if (var68 == null) {
                        var68 = method33(var65, var66, var67);
                    }
                    var68.field52 = true;
                }
                for (class4 var69 = (class4) field402.method3448(); var69 != null; var69 = (class4) field402.method3449()) {
                    if (var69.field52) {
                        var69.field52 = false;
                    } else {
                        method510(var69, true);
                    }
                }
                field270 = new class187(512);
                while (field484.field1889 < var57) {
                    int var70 = field484.method2233();
                    int var71 = field484.method2231();
                    int var72 = field484.method2231();
                    int var73 = field484.method2233();
                    for (int var74 = var71; var74 <= var72; var74++) {
                        long var75 = ((long) var70 << 32) + (long) var74;
                        field270.method3446(new class192(var73), var75);
                    }
                }
                field284 = -1;
                return true;
            }
            if (field284 == 129) {
                field299 = 0;
                field362 = 0;
                field484.method2483();
                int var77 = field484.method2484(1);
                if (var77 != 0) {
                    int var78 = field484.method2484(2);
                    if (var78 == 0) {
                        field459[++field362 - 1] = 2047;
                    } else if (var78 == 1) {
                        int var79 = field484.method2484(3);
                        Statics.field1710.method662(var79, false);
                        int var80 = field484.method2484(1);
                        if (var80 == 1) {
                            field459[++field362 - 1] = 2047;
                        }
                    } else if (var78 == 2) {
                        int var81 = field484.method2484(3);
                        Statics.field1710.method662(var81, true);
                        int var82 = field484.method2484(3);
                        Statics.field1710.method662(var82, true);
                        int var83 = field484.method2484(1);
                        if (var83 == 1) {
                            field459[++field362 - 1] = 2047;
                        }
                    } else if (var78 == 3) {
                        int var84 = field484.method2484(1);
                        int var85 = field484.method2484(7);
                        Statics.field2136 = field484.method2484(2);
                        int var86 = field484.method2484(1);
                        if (var86 == 1) {
                            field459[++field362 - 1] = 2047;
                        }
                        int var87 = field484.method2484(7);
                        Statics.field1710.method661(var85, var87, var84 == 1);
                    }
                }
                method708();
                while (field484.method2486(field283) >= 11) {
                    int var88 = field484.method2484(11);
                    if (var88 == 2047) {
                        break;
                    }
                    boolean var89 = false;
                    if (field359[var88] == null) {
                        field359[var88] = new class3();
                        if (field364[var88] != null) {
                            field359[var88].method17(field364[var88]);
                        }
                        var89 = true;
                    }
                    field407[++field360 - 1] = var88;
                    class3 var90 = field359[var88];
                    var90.field796 = field249;
                    int var91 = field484.method2484(1);
                    if (var91 == 1) {
                        field459[++field362 - 1] = var88;
                    }
                    int var92 = field484.method2484(5);
                    if (var92 > 15) {
                        var92 -= 32;
                    }
                    int var93 = field372[field484.method2484(3)];
                    if (var89) {
                        var90.field776 = var90.field750 = var93;
                    }
                    int var94 = field484.method2484(1);
                    int var95 = field484.method2484(5);
                    if (var95 > 15) {
                        var95 -= 32;
                    }
                    var90.method661(Statics.field1710.field751[0] + var92, Statics.field1710.field803[0] + var95, var94 == 1);
                }
                field484.method2485();
                method1946();
                for (int var96 = 0; var96 < field299; var96++) {
                    int var97 = field368[var96];
                    if (field249 != field359[var97].field796) {
                        field359[var97] = null;
                    }
                }
                if (field283 != field484.field1889) {
                    throw new RuntimeException(field484.field1889 + class2.field24 + field283);
                }
                for (int var98 = 0; var98 < field360; var98++) {
                    if (field359[field407[var98]] == null) {
                        throw new RuntimeException(var98 + class2.field24 + field360);
                    }
                }
                field284 = -1;
                return true;
            }
            if (field284 == 206) {
                while (field484.field1889 < field283) {
                    int var99 = field484.method2228();
                    boolean var100 = (var99 & 0x1) == 1;
                    String var101 = field484.method2290();
                    String var102 = field484.method2290();
                    field484.method2290();
                    for (int var103 = 0; var103 < field405; var103++) {
                        class8 var104 = field515[var103];
                        if (var100) {
                            if (var102.equals(var104.field120)) {
                                var104.field120 = var101;
                                var104.field119 = var102;
                                var101 = null;
                                break;
                            }
                        } else if (var101.equals(var104.field120)) {
                            var104.field120 = var101;
                            var104.field119 = var102;
                            var101 = null;
                            break;
                        }
                    }
                    if (var101 != null && field405 < 400) {
                        class8 var105 = new class8();
                        field515[field405] = var105;
                        var105.field120 = var101;
                        var105.field119 = var102;
                        field405++;
                    }
                }
                field434 = field404;
                field284 = -1;
                return true;
            }
            if (field284 == 30) {
                int var106 = field484.method2233();
                int var107 = field484.method2231();
                class164 var108 = Statics.method2717(var106);
                if (var108.field2691 != 1 || var108.field2692 != var107) {
                    var108.field2691 = 1;
                    var108.field2692 = var107;
                    method2625(var108);
                }
                field284 = -1;
                return true;
            }
            if (field284 == 43) {
                boolean var109 = field484.method2228() == 1;
                if (var109) {
                    Statics.field2581 = class107.method1670() - field484.method2412();
                    Statics.field711 = new class212(field484, true);
                } else {
                    Statics.field711 = null;
                }
                field334 = field404;
                field284 = -1;
                return true;
            }
            if (field284 == 56) {
                int var110 = field484.method2263();
                byte var111 = field484.method2409();
                class167.field2799[var110] = var111;
                if (class167.field2801[var110] != var111) {
                    class167.field2801[var110] = var111;
                    method1871(var110);
                }
                field262[++field313 - 1 & 0x1F] = var110;
                field284 = -1;
                return true;
            }
            if (field284 == 29) {
                for (int var112 = 0; var112 < class167.field2801.length; var112++) {
                    if (class167.field2801[var112] != class167.field2799[var112]) {
                        class167.field2801[var112] = class167.field2799[var112];
                        method1871(var112);
                        field262[++field313 - 1 & 0x1F] = var112;
                    }
                }
                field284 = -1;
                return true;
            }
            if (field284 == 116 || field284 == 127 || field284 == 95 || field284 == 239 || field284 == 49 || field284 == 83 || field284 == 205 || field284 == 25 || field284 == 241 || field284 == 215) {
                method815();
                field284 = -1;
                return true;
            }
            if (field284 == 117) {
                method546(true);
                field284 = -1;
                return true;
            }
            if (field284 == 136) {
                int var113 = field484.method2405();
                int var114 = field484.method2413();
                class4 var115 = (class4) field402.method3445((long) var113);
                class4 var116 = (class4) field402.method3445((long) var114);
                if (var116 != null) {
                    method510(var116, var115 == null || var115.field58 != var116.field58);
                }
                if (var115 != null) {
                    var115.method3562();
                    field402.method3446(var115, (long) var114);
                }
                class164 var117 = Statics.method2717(var113);
                if (var117 != null) {
                    method2625(var117);
                }
                class164 var118 = Statics.method2717(var114);
                if (var118 != null) {
                    method2625(var118);
                    method1484(Statics.field2653[var118.field2651 >>> 16], var118, true);
                }
                if (field401 != -1) {
                    int var119 = field401;
                    if (class164.method3404(var119)) {
                        method2165(Statics.field2653[var119], 1);
                    }
                }
                field284 = -1;
                return true;
            }
            if (field284 == 224) {
                int var120 = field484.method2233();
                int var121 = field484.method2265();
                if (var121 == 65535) {
                    var121 = -1;
                }
                int var122 = field484.method2413();
                class164 var123 = Statics.method2717(var120);
                if (var123.field2649) {
                    var123.field2768 = var121;
                    var123.field2769 = var122;
                    class47 var125 = class47.method3569(var121);
                    var123.field2776 = var125.field1056;
                    var123.field2696 = var125.field1057;
                    var123.field2701 = var125.field1058;
                    var123.field2697 = var125.field1059;
                    var123.field2747 = var125.field1050;
                    var123.field2702 = var125.field1055;
                    if (var125.field1084 == 1) {
                        var123.field2706 = 1;
                    } else {
                        var123.field2706 = 2;
                    }
                    if (var123.field2743 > 0) {
                        var123.field2702 = var123.field2702 * 32 / var123.field2743;
                    } else if (var123.field2777 > 0) {
                        var123.field2702 = var123.field2702 * 32 / var123.field2777;
                    }
                    method2625(var123);
                } else if (var121 == -1) {
                    var123.field2691 = 0;
                    field284 = -1;
                    return true;
                } else {
                    class47 var124 = class47.method3569(var121);
                    var123.field2691 = 4;
                    var123.field2692 = var121;
                    var123.field2776 = var124.field1056;
                    var123.field2696 = var124.field1057;
                    var123.field2702 = var124.field1055 * 100 / var122;
                    method2625(var123);
                }
                field284 = -1;
                return true;
            }
            if (field284 == 178) {
                method3734(false);
                field284 = -1;
                return true;
            }
            if (field284 == 16) {
                int var126 = field484.method2231();
                int var127 = field484.method2233();
                int var128 = var126 >> 10 & 0x1F;
                int var129 = var126 >> 5 & 0x1F;
                int var130 = var126 & 0x1F;
                int var131 = (var130 << 3) + (var128 << 19) + (var129 << 11);
                class164 var132 = Statics.method2717(var127);
                if (var132.field2723 != var131) {
                    var132.field2723 = var131;
                    method2625(var132);
                }
                field284 = -1;
                return true;
            }
            if (field284 == 200) {
                Statics.field1331 = field484.method2228();
                Statics.field857 = field484.method2228();
                for (int var133 = Statics.field1331; var133 < Statics.field1331 + 8; var133++) {
                    for (int var134 = Statics.field857; var134 < Statics.field857 + 8; var134++) {
                        if (field394[Statics.field2136][var133][var134] != null) {
                            field394[Statics.field2136][var133][var134] = null;
                            method638(var133, var134);
                        }
                    }
                }
                for (class16 var135 = (class16) field375.method3497(); var135 != null; var135 = (class16) field375.method3475()) {
                    if (var135.field199 >= Statics.field1331 && var135.field199 < Statics.field1331 + 8 && var135.field200 >= Statics.field857 && var135.field200 < Statics.field857 + 8 && Statics.field2136 == var135.field211) {
                        var135.field208 = 0;
                    }
                }
                field284 = -1;
                return true;
            }
            if (field284 == 153) {
                method172();
                field376 = field484.method2242();
                field438 = field404;
                field284 = -1;
                return true;
            }
            if (field284 == 246) {
                boolean var136 = field484.method2254() == 1;
                int var137 = field484.method2405();
                class164 var138 = Statics.method2717(var137);
                if (var138.field2670 != var136) {
                    var138.field2670 = var136;
                    method2625(var138);
                }
                field284 = -1;
                return true;
            }
            if (field284 == 140) {
                method172();
                field406 = field484.method2228();
                field438 = field404;
                field284 = -1;
                return true;
            }
            if (field284 == 202) {
                int var139 = field484.method2233();
                int var140 = field484.method2267();
                int var141 = field484.method2266();
                class164 var142 = Statics.method2717(var139);
                if (var142.field2713 != var140 || var142.field2660 != var141 || var142.field2655 != 0 || var142.field2656 != 0) {
                    var142.field2713 = var140;
                    var142.field2660 = var141;
                    var142.field2655 = 0;
                    var142.field2656 = 0;
                    method2625(var142);
                    method2554(var142);
                    if (var142.field2732 == 0) {
                        method1484(Statics.field2653[var139 >> 16], var142, false);
                    }
                }
                field284 = -1;
                return true;
            }
            if (field284 == 184) {
                int var143 = field484.method2231();
                class15 var144 = (class15) class15.field192.method3445((long) var143);
                if (var144 != null) {
                    var144.method3562();
                }
                field429[++field418 - 1 & 0x1F] = var143 & 0x7FFF;
                field284 = -1;
                return true;
            }
            if (field284 == 230) {
                int var145 = field484.method2228();
                int var146 = field484.method2228();
                int var147 = field484.method2256();
                Statics.field2136 = var146 >> 1;
                Statics.field1710.method661(var147, var145, (var146 & 0x1) == 1);
                field284 = -1;
                return true;
            }
            if (field284 == 7) {
                int var148 = field484.method2233();
                class164 var149 = Statics.method2717(var148);
                for (int var150 = 0; var150 < var149.field2652.length; var150++) {
                    var149.field2652[var150] = -1;
                    var149.field2652[var150] = 0;
                }
                method2625(var149);
                field284 = -1;
                return true;
            }
            if (field284 == 65) {
                int var151 = field484.method2233();
                class4 var152 = (class4) field402.method3445((long) var151);
                if (var152 != null) {
                    method510(var152, true);
                }
                if (field316 != null) {
                    method2625(field316);
                    field316 = null;
                }
                field284 = -1;
                return true;
            }
            if (field284 == 160) {
                int var153 = field484.method2265();
                if (var153 == 65535) {
                    var153 = -1;
                }
                method2740(var153);
                field284 = -1;
                return true;
            }
            if (field284 == 88) {
                int var154 = field484.method2232();
                int var155 = field484.method2263();
                if (var155 == 65535) {
                    var155 = -1;
                }
                if (field480 != 0 && var155 != -1) {
                    class174.method3063(Statics.field3023, var155, 0, field480, false);
                    field482 = true;
                }
                field284 = -1;
                return true;
            }
            if (field284 == 31) {
                int var156 = field484.method2273();
                class164 var157 = Statics.method2717(var156);
                var157.field2691 = 3;
                var157.field2692 = Statics.field1710.field30.method3195();
                method2625(var157);
                field284 = -1;
                return true;
            }
            if (field284 == 175) {
                int var158 = field484.method2265();
                int var159 = field484.method2231();
                int var160 = field484.method2413();
                class164 var161 = Statics.method2717(var160);
                var161.field2704 = (var158 << 16) + var159;
                field284 = -1;
                return true;
            }
            if (field284 == 137) {
                field431 = field484.method2228();
                if (field431 == 1) {
                    field259 = field484.method2231();
                }
                if (field431 >= 2 && field431 <= 6) {
                    if (field431 == 2) {
                        field264 = 64;
                        field265 = 64;
                    }
                    if (field431 == 3) {
                        field264 = 0;
                        field265 = 64;
                    }
                    if (field431 == 4) {
                        field264 = 128;
                        field265 = 64;
                    }
                    if (field431 == 5) {
                        field264 = 64;
                        field265 = 0;
                    }
                    if (field431 == 6) {
                        field264 = 64;
                        field265 = 128;
                    }
                    field431 = 2;
                    field326 = field484.method2231();
                    field496 = field484.method2231();
                    field366 = field484.method2228();
                }
                if (field431 == 10) {
                    field413 = field484.method2231();
                }
                field284 = -1;
                return true;
            }
            if (field284 == 162) {
                int var162 = field484.method2228();
                if (field484.method2228() == 0) {
                    field519[var162] = new class211();
                    field484.field1889 += 18;
                } else {
                    field484.field1889--;
                    field519[var162] = new class211(field484, false);
                }
                field436 = field404;
                field284 = -1;
                return true;
            }
            if (field284 == 138) {
                if (field401 != -1) {
                    int var163 = field401;
                    if (class164.method3404(var163)) {
                        method2165(Statics.field2653[var163], 0);
                    }
                }
                field284 = -1;
                return true;
            }
            if (field284 == 167) {
                String var164 = field484.method2290();
                Object[] var165 = new Object[var164.length() + 1];
                for (int var166 = var164.length() - 1; var166 >= 0; var166--) {
                    if (var164.charAt(var166) == 's') {
                        var165[var166 + 1] = field484.method2290();
                    } else {
                        var165[var166 + 1] = Integer.valueOf(field484.method2233());
                    }
                }
                var165[0] = Integer.valueOf(field484.method2233());
                class1 var167 = new class1();
                var167.field2 = var165;
                class34.method31(var167, 200000);
                field284 = -1;
                return true;
            }
            if (field284 == 204) {
                String var168 = field484.method2290();
                long var169 = field484.method2412();
                long var171 = (long) field484.method2231();
                long var173 = (long) field484.method2232();
                class143 var175 = (class143) class101.method164(Statics.method134(), field484.method2228());
                long var176 = (var171 << 32) + var173;
                boolean var178 = false;
                for (int var179 = 0; var179 < 100; var179++) {
                    if (field464[var179] == var176) {
                        var178 = true;
                        break;
                    }
                }
                if (var175.field2158 && method152(var168)) {
                    var178 = true;
                }
                if (!var178 && field358 == 0) {
                    field464[field465] = var176;
                    field465 = (field465 + 1) % 100;
                    String var180 = class214.method3659(class154.method131(class213.method1966(field484)));
                    if (var175.field2162 == -1) {
                        Statics.method838(9, var168, var180, class153.method2158(var169));
                    } else {
                        int var181 = var175.field2162;
                        String var182 = "<img=" + var181 + ">";
                        Statics.method838(9, var182 + var168, var180, class153.method2158(var169));
                    }
                }
                field284 = -1;
                return true;
            }
            if (field284 == 9) {
                int var183 = field484.method2228();
                int var184 = field484.method2228();
                int var185 = field484.method2228();
                int var186 = field484.method2228();
                field473[var183] = true;
                field246[var183] = var184;
                field494[var183] = var185;
                field456[var183] = var186;
                field461[var183] = 0;
                field284 = -1;
                return true;
            }
            if (field284 == 5) {
                field484.field1889 += 28;
                if (field484.method2250()) {
                    class141.method523(field484, field484.field1889 - 28);
                }
                field284 = -1;
                return true;
            }
            if (field284 == 53) {
                field477 = field484.method2228();
                if (field477 == 255) {
                    field477 = 0;
                }
                field478 = field484.method2228();
                if (field478 == 255) {
                    field478 = 0;
                }
                field284 = -1;
                return true;
            }
            if (field284 == 216) {
                int var187 = field484.method2233();
                Statics.field267 = Statics.field969.method2620(var187);
                field284 = -1;
                return true;
            }
            if (field284 == 59) {
                String var188 = field484.method2290();
                long var189 = (long) field484.method2231();
                long var191 = (long) field484.method2232();
                class143 var193 = (class143) class101.method164(Statics.method134(), field484.method2228());
                long var194 = (var189 << 32) + var191;
                boolean var196 = false;
                for (int var197 = 0; var197 < 100; var197++) {
                    if (field464[var197] == var194) {
                        var196 = true;
                        break;
                    }
                }
                if (method152(var188)) {
                    var196 = true;
                }
                if (!var196 && field358 == 0) {
                    field464[field465] = var194;
                    field465 = (field465 + 1) % 100;
                    String var198 = class214.method3659(class154.method131(class213.method1966(field484)));
                    byte var199;
                    if (var193.field2164) {
                        var199 = 7;
                    } else {
                        var199 = 3;
                    }
                    if (var193.field2162 == -1) {
                        class11.method2783(var199, var188, var198);
                    } else {
                        int var201 = var193.field2162;
                        String var202 = "<img=" + var201 + ">";
                        class11.method2783(var199, var202 + var188, var198);
                    }
                }
                field284 = -1;
                return true;
            }
            if (field284 == 186) {
                field491 = true;
                Statics.field708 = field484.method2228();
                Statics.field130 = field484.method2228();
                Statics.field1968 = field484.method2231();
                Statics.field209 = field484.method2228();
                Statics.field986 = field484.method2228();
                if (Statics.field986 >= 100) {
                    int var203 = Statics.field708 * 128 + 64;
                    int var204 = Statics.field130 * 128 + 64;
                    int var205 = method141(var203, var204, Statics.field2136) - Statics.field1968;
                    int var206 = var203 - Statics.field55;
                    int var207 = var205 - Statics.field28;
                    int var208 = var204 - Statics.field727;
                    int var209 = (int) Math.sqrt((double) (var206 * var206 + var208 * var208));
                    Statics.field597 = (int) (Math.atan2((double) var207, (double) var209) * 325.949D) & 0x7FF;
                    Statics.field923 = (int) (Math.atan2((double) var206, (double) var208) * -325.949D) & 0x7FF;
                    if (Statics.field597 < 128) {
                        Statics.field597 = 128;
                    }
                    if (Statics.field597 > 383) {
                        Statics.field597 = 383;
                    }
                }
                field284 = -1;
                return true;
            }
            if (field284 == 249) {
                int var210 = field484.method2273();
                int var211 = field484.method2221();
                class167.field2799[var211] = var210;
                if (class167.field2801[var211] != var210) {
                    class167.field2801[var211] = var210;
                    method1871(var211);
                }
                field262[++field313 - 1 & 0x1F] = var211;
                field284 = -1;
                return true;
            }
            if (field284 == 108) {
                int var212 = field484.method2265();
                field401 = var212;
                method707(false);
                if (class164.method3404(var212)) {
                    class164[] var213 = Statics.field2653[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class164 var215 = var213[var214];
                        if (var215 != null) {
                            var215.field2770 = 0;
                            var215.field2771 = 0;
                        }
                    }
                }
                class34.method2916(field401);
                for (int var216 = 0; var216 < 100; var216++) {
                    field389[var216] = true;
                }
                field284 = -1;
                return true;
            }
            if (field284 == 39) {
                String var217 = field484.method2290();
                Statics.field173 = var217;
                try {
                    String var218 = Statics.field238.getParameter(class181.field2950.field2960);
                    String var219 = Statics.field238.getParameter(class181.field2957.field2960);
                    String var220 = var218 + "settings=" + var217 + "; version=1; path=/; domain=" + var219;
                    String var221;
                    if (var217.length() == 0) {
                        var221 = var220 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var221 = var220 + "; Expires=" + class103.method160(class107.method1670() + 94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    class124.method2583(Statics.field238, "document.cookie=\"" + var221 + "\"");
                } catch (Throwable var282) {
                }
                field284 = -1;
                return true;
            }
            if (field284 == 64) {
                class202.method3077(field484, field283);
                field284 = -1;
                return true;
            }
            if (field284 == 114) {
                field279 = field484.method2228();
                field462 = field484.method2228();
                field284 = -1;
                return true;
            }
            if (field284 == 208) {
                field435 = field404;
                if (field283 == 0) {
                    field286 = null;
                    field471 = null;
                    Statics.field1709 = 0;
                    Statics.field1954 = null;
                    field284 = -1;
                    return true;
                }
                field471 = field484.method2290();
                long var223 = field484.method2412();
                field286 = class153.method2149(var223);
                Statics.field193 = field484.method2409();
                int var225 = field484.method2228();
                if (var225 == 255) {
                    field284 = -1;
                    return true;
                }
                Statics.field1709 = var225;
                class23[] var226 = new class23[100];
                for (int var227 = 0; var227 < Statics.field1709; var227++) {
                    var226[var227] = new class23();
                    var226[var227].field575 = field484.method2290();
                    var226[var227].field573 = class155.method1387(var226[var227].field575, Statics.field2944);
                    var226[var227].field572 = field484.method2231();
                    var226[var227].field582 = field484.method2409();
                    field484.method2290();
                    if (var226[var227].field575.equals(Statics.field1710.field32)) {
                        Statics.field968 = var226[var227].field582;
                    }
                }
                boolean var228 = false;
                int var229 = Statics.field1709;
                while (var229 > 0) {
                    boolean var230 = true;
                    var229--;
                    for (int var231 = 0; var231 < var229; var231++) {
                        if (var226[var231].field573.compareTo(var226[var231 + 1].field573) > 0) {
                            class23 var232 = var226[var231];
                            var226[var231] = var226[var231 + 1];
                            var226[var231 + 1] = var232;
                            var230 = false;
                        }
                    }
                    if (var230) {
                        break;
                    }
                }
                Statics.field1954 = var226;
                field284 = -1;
                return true;
            }
            if (field284 == 201) {
                field257 = field484.method2265() * 30;
                field438 = field404;
                field284 = -1;
                return true;
            }
            if (field284 == 6) {
                while (field484.field1889 < field283) {
                    boolean var233 = field484.method2228() == 1;
                    String var234 = field484.method2290();
                    String var235 = field484.method2290();
                    int var236 = field484.method2231();
                    int var237 = field484.method2228();
                    int var238 = field484.method2228();
                    boolean var239 = (var238 & 0x2) != 0;
                    boolean var240 = (var238 & 0x1) != 0;
                    if (var236 > 0) {
                        field484.method2290();
                        field484.method2228();
                        field484.method2233();
                    }
                    field484.method2290();
                    for (int var241 = 0; var241 < field510; var241++) {
                        class17 var242 = field512[var241];
                        if (var233) {
                            if (var235.equals(var242.field214)) {
                                var242.field214 = var234;
                                var242.field215 = var235;
                                var234 = null;
                                break;
                            }
                        } else if (var234.equals(var242.field214)) {
                            if (var242.field216 != var236) {
                                boolean var243 = true;
                                for (class36 var244 = (class36) field513.method3440(); var244 != null; var244 = (class36) field513.method3438()) {
                                    if (var244.field811.equals(var234)) {
                                        if (var236 != 0 && var244.field812 == 0) {
                                            var244.method3559();
                                            var243 = false;
                                        } else if (var236 == 0 && var244.field812 != 0) {
                                            var244.method3559();
                                            var243 = false;
                                        }
                                    }
                                }
                                if (var243) {
                                    field513.method3439(new class36(var234, var236));
                                }
                                var242.field216 = var236;
                            }
                            var242.field215 = var235;
                            var242.field217 = var237;
                            var242.field218 = var239;
                            var242.field223 = var240;
                            var234 = null;
                            break;
                        }
                    }
                    if (var234 != null && field510 < 400) {
                        class17 var245 = new class17();
                        field512[field510] = var245;
                        var245.field214 = var234;
                        var245.field215 = var235;
                        var245.field216 = var236;
                        var245.field217 = var237;
                        var245.field218 = var239;
                        var245.field223 = var240;
                        field510++;
                    }
                }
                field511 = 2;
                field434 = field404;
                boolean var246 = false;
                int var247 = field510;
                while (var247 > 0) {
                    boolean var248 = true;
                    var247--;
                    for (int var249 = 0; var249 < var247; var249++) {
                        boolean var250 = false;
                        class17 var251 = field512[var249];
                        class17 var252 = field512[var249 + 1];
                        if (field240 != var251.field216 && field240 == var252.field216) {
                            var250 = true;
                        }
                        if (!var250 && var251.field216 == 0 && var252.field216 != 0) {
                            var250 = true;
                        }
                        if (!var250 && !var251.field218 && var252.field218) {
                            var250 = true;
                        }
                        if (!var250 && !var251.field223 && var252.field223) {
                            var250 = true;
                        }
                        if (var250) {
                            class17 var253 = field512[var249];
                            field512[var249] = field512[var249 + 1];
                            field512[var249 + 1] = var253;
                            var248 = false;
                        }
                    }
                    if (var248) {
                        break;
                    }
                }
                field284 = -1;
                return true;
            }
            if (field284 == 79) {
                int var254 = field484.method2241();
                boolean var255 = field484.method2228() == 1;
                String var256 = "";
                boolean var257 = false;
                if (var255) {
                    var256 = field484.method2290();
                    if (method152(var256)) {
                        var257 = true;
                    }
                }
                String var258 = field484.method2290();
                if (!var257) {
                    class11.method2783(var254, var256, var258);
                }
                field284 = -1;
                return true;
            }
            if (field284 == 38) {
                int var259 = field484.method2231();
                int var260 = field484.method2228();
                int var261 = field484.method2231();
                if (field483 != 0 && var260 != 0 && field485 < 50) {
                    field486[field485] = var259;
                    field487[field485] = var260;
                    field521[field485] = var261;
                    field490[field485] = null;
                    field489[field485] = 0;
                    field485++;
                }
                field284 = -1;
                return true;
            }
            if (field284 == 155) {
                field479 = field484.method2228();
                field284 = -1;
                return true;
            }
            if (field284 == 35) {
                String var265 = field484.method2290();
                String var266 = class214.method3659(class154.method131(class213.method1966(field484)));
                class11.method2783(6, var265, var266);
                field284 = -1;
                return true;
            }
            if (field284 == 229) {
                Statics.field1331 = field484.method2228();
                Statics.field857 = field484.method2256();
                while (field484.field1889 < field283) {
                    field284 = field484.method2228();
                    method815();
                }
                field284 = -1;
                return true;
            }
            if (field284 == 133) {
                method546(false);
                field284 = -1;
                return true;
            }
            if (field284 == 170) {
                Statics.field1612 = Statics.method612(field484.method2228());
                field284 = -1;
                return true;
            }
            if (field284 == 47) {
                method3734(true);
                field284 = -1;
                return true;
            }
            if (field284 == 157) {
                int var267 = field484.method2233();
                String var268 = field484.method2290();
                class164 var269 = Statics.method2717(var267);
                if (!var268.equals(var269.field2708)) {
                    var269.field2708 = var268;
                    method2625(var269);
                }
                field284 = -1;
                return true;
            }
            if (field284 == 33) {
                int var270 = field484.method2233();
                int var271 = field484.method2231();
                if (var270 < -70000) {
                    var271 += 32768;
                }
                class164 var272;
                if (var270 >= 0) {
                    var272 = Statics.method2717(var270);
                } else {
                    var272 = null;
                }
                if (var272 != null) {
                    for (int var273 = 0; var273 < var272.field2652.length; var273++) {
                        var272.field2652[var273] = 0;
                        var272.field2767[var273] = 0;
                    }
                }
                class15.method2065(var271);
                int var274 = field484.method2231();
                for (int var275 = 0; var275 < var274; var275++) {
                    int var276 = field484.method2265();
                    int var277 = field484.method2254();
                    if (var277 == 255) {
                        var277 = field484.method2233();
                    }
                    if (var272 != null && var275 < var272.field2652.length) {
                        var272.field2652[var275] = var276;
                        var272.field2767[var275] = var277;
                    }
                    class15.method539(var271, var275, var276 - 1, var277);
                }
                if (var272 != null) {
                    method2625(var272);
                }
                method172();
                field429[++field418 - 1 & 0x1F] = var271 & 0x7FFF;
                field284 = -1;
                return true;
            }
            class140.method1864("" + field284 + class2.field24 + field289 + class2.field24 + field290 + class2.field24 + field283, (Throwable) null);
            method2528();
        } catch (IOException var283) {
            if (field287 > 0) {
                method2528();
            } else {
                method2731(40);
                Statics.field1694 = Statics.field1617;
                Statics.field1617 = null;
            }
        } catch (Exception var284) {
            String var280 = "" + field284 + class2.field24 + field289 + class2.field24 + field290 + class2.field24 + field283 + class2.field24 + (Statics.field178 + Statics.field1710.field751[0]) + class2.field24 + (Statics.field3035 + Statics.field1710.field803[0]) + class2.field24;
            for (int var281 = 0; var281 < field283 && var281 < 50; var281++) {
                var280 = var280 + field484.field1888[var281] + class2.field24;
            }
            class140.method1864(var280, var284);
            method2528();
        }
        return true;
    }

    @ObfuscatedName("aw.bp(I)V")
    public static final void method815() {
        if (field284 == 127) {
            int var0 = field484.method2228();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1331;
            int var2 = (var0 & 0x7) + Statics.field857;
            int var3 = field484.method2231();
            int var4 = field484.method2231();
            int var5 = field484.method2231();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class190 var6 = field394[Statics.field2136][var1][var2];
                if (var6 != null) {
                    for (class27 var7 = (class27) var6.method3497(); var7 != null; var7 = (class27) var6.method3475()) {
                        if ((var3 & 0x7FFF) == var7.field630 && var7.field629 == var4) {
                            var7.field629 = var5;
                            break;
                        }
                    }
                    method638(var1, var2);
                }
            }
        } else if (field284 == 25) {
            int var8 = field484.method2374();
            int var9 = (var8 >> 4 & 0x7) + Statics.field1331;
            int var10 = (var8 & 0x7) + Statics.field857;
            int var11 = field484.method2231();
            int var12 = field484.method2256();
            int var13 = var12 >> 2;
            int var14 = var12 & 0x3;
            int var15 = field302[var13];
            if (var9 >= 0 && var10 >= 0 && var9 < 103 && var10 < 103) {
                if (var15 == 0) {
                    class82 var16 = Statics.field656.method1699(Statics.field2136, var9, var10);
                    if (var16 != null) {
                        int var17 = var16.field1453 >> 14 & 0x7FFF;
                        if (var13 == 2) {
                            var16.field1456 = new class12(var17, 2, var14 + 4, Statics.field2136, var9, var10, var11, false, var16.field1456);
                            var16.field1460 = new class12(var17, 2, var14 + 1 & 0x3, Statics.field2136, var9, var10, var11, false, var16.field1460);
                        } else {
                            var16.field1456 = new class12(var17, var13, var14, Statics.field2136, var9, var10, var11, false, var16.field1456);
                        }
                    }
                }
                if (var15 == 1) {
                    class89 var18 = Statics.field656.method1700(Statics.field2136, var9, var10);
                    if (var18 != null) {
                        int var19 = var18.field1535 >> 14 & 0x7FFF;
                        if (var13 == 4 || var13 == 5) {
                            var18.field1536 = new class12(var19, 4, var14, Statics.field2136, var9, var10, var11, false, var18.field1536);
                        } else if (var13 == 6) {
                            var18.field1536 = new class12(var19, 4, var14 + 4, Statics.field2136, var9, var10, var11, false, var18.field1536);
                        } else if (var13 == 7) {
                            var18.field1536 = new class12(var19, 4, (var14 + 2 & 0x3) + 4, Statics.field2136, var9, var10, var11, false, var18.field1536);
                        } else if (var13 == 8) {
                            var18.field1536 = new class12(var19, 4, var14 + 4, Statics.field2136, var9, var10, var11, false, var18.field1536);
                            var18.field1530 = new class12(var19, 4, (var14 + 2 & 0x3) + 4, Statics.field2136, var9, var10, var11, false, var18.field1530);
                        }
                    }
                }
                if (var15 == 2) {
                    class93 var20 = Statics.field656.method1701(Statics.field2136, var9, var10);
                    if (var13 == 11) {
                        var13 = 10;
                    }
                    if (var20 != null) {
                        var20.field1594 = new class12(var20.field1602 >> 14 & 0x7FFF, var13, var14, Statics.field2136, var9, var10, var11, false, var20.field1594);
                    }
                }
                if (var15 == 3) {
                    class88 var21 = Statics.field656.method1702(Statics.field2136, var9, var10);
                    if (var21 != null) {
                        var21.field1520 = new class12(var21.field1521 >> 14 & 0x7FFF, 22, var14, Statics.field2136, var9, var10, var11, false, var21.field1520);
                    }
                }
            }
        } else if (field284 == 239) {
            int var22 = field484.method2228();
            int var23 = (var22 >> 4 & 0x7) + Statics.field1331;
            int var24 = (var22 & 0x7) + Statics.field857;
            int var25 = field484.method2231();
            int var26 = field484.method2228();
            int var27 = field484.method2231();
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                int var28 = var23 * 128 + 64;
                int var29 = var24 * 128 + 64;
                class28 var30 = new class28(var25, Statics.field2136, var28, var29, method141(var28, var29, Statics.field2136) - var26, var27, field249);
                field377.method3477(var30);
            }
        } else {
            if (field284 == 95) {
                byte var31 = field484.method2259();
                byte var32 = field484.method2307();
                int var33 = field484.method2263();
                int var34 = field484.method2374();
                int var35 = var34 >> 2;
                int var36 = var34 & 0x3;
                int var37 = field302[var35];
                int var38 = field484.method2263();
                byte var39 = field484.method2259();
                byte var40 = field484.method2437();
                int var41 = field484.method2263();
                int var42 = field484.method2374();
                int var43 = (var42 >> 4 & 0x7) + Statics.field1331;
                int var44 = (var42 & 0x7) + Statics.field857;
                int var45 = field484.method2231();
                class3 var46;
                if (field365 == var41) {
                    var46 = Statics.field1710;
                } else {
                    var46 = field359[var41];
                }
                if (var46 != null) {
                    class38 var47 = class38.method1667(var33);
                    int var48;
                    int var49;
                    if (var36 == 1 || var36 == 3) {
                        var48 = var47.field872;
                        var49 = var47.field877;
                    } else {
                        var48 = var47.field877;
                        var49 = var47.field872;
                    }
                    int var50 = (var48 >> 1) + var43;
                    int var51 = (var48 + 1 >> 1) + var43;
                    int var52 = (var49 >> 1) + var44;
                    int var53 = (var49 + 1 >> 1) + var44;
                    int[][] var54 = class6.field75[Statics.field2136];
                    int var55 = var54[var50][var52] + var54[var51][var52] + var54[var50][var53] + var54[var51][var53] >> 2;
                    int var56 = (var43 << 7) + (var48 << 6);
                    int var57 = (var44 << 7) + (var49 << 6);
                    class100 var58 = var47.method739(var35, var36, var54, var56, var55, var57);
                    if (var58 != null) {
                        method3153(Statics.field2136, var43, var44, var37, -1, 0, 0, var38 + 1, var45 + 1);
                        var46.field36 = field249 + var38;
                        var46.field49 = field249 + var45;
                        var46.field41 = var58;
                        var46.field38 = var43 * 128 + var48 * 64;
                        var46.field40 = var44 * 128 + var49 * 64;
                        var46.field47 = var55;
                        if (var31 > var32) {
                            byte var59 = var31;
                            var31 = var32;
                            var32 = var59;
                        }
                        if (var40 > var39) {
                            byte var60 = var40;
                            var40 = var39;
                            var39 = var60;
                        }
                        var46.field48 = var31 + var43;
                        var46.field37 = var32 + var43;
                        var46.field39 = var40 + var44;
                        var46.field45 = var39 + var44;
                    }
                }
            }
            if (field284 == 49) {
                int var61 = field484.method2228();
                int var62 = (var61 >> 4 & 0x7) + Statics.field1331;
                int var63 = (var61 & 0x7) + Statics.field857;
                int var64 = var62 + field484.method2409();
                int var65 = var63 + field484.method2409();
                int var66 = field484.method2242();
                int var67 = field484.method2231();
                int var68 = field484.method2228() * 4;
                int var69 = field484.method2228() * 4;
                int var70 = field484.method2231();
                int var71 = field484.method2231();
                int var72 = field484.method2228();
                int var73 = field484.method2228();
                if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104 && var67 != 65535) {
                    int var74 = var62 * 128 + 64;
                    int var75 = var63 * 128 + 64;
                    int var76 = var64 * 128 + 64;
                    int var77 = var65 * 128 + 64;
                    class7 var78 = new class7(var67, Statics.field2136, var74, var75, method141(var74, var75, Statics.field2136) - var68, field249 + var70, field249 + var71, var72, var73, var66, var69);
                    var78.method88(var76, var77, method141(var76, var77, Statics.field2136) - var69, field249 + var70);
                    field470.method3477(var78);
                }
            } else if (field284 == 241) {
                int var79 = field484.method2228();
                int var80 = (var79 >> 4 & 0x7) + Statics.field1331;
                int var81 = (var79 & 0x7) + Statics.field857;
                int var82 = field484.method2228();
                int var83 = var82 >> 2;
                int var84 = var82 & 0x3;
                int var85 = field302[var83];
                if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                    method3153(Statics.field2136, var80, var81, var85, -1, var83, var84, 0, -1);
                }
            } else if (field284 == 215) {
                int var86 = field484.method2231();
                int var87 = field484.method2256();
                int var88 = (var87 >> 4 & 0x7) + Statics.field1331;
                int var89 = (var87 & 0x7) + Statics.field857;
                int var90 = field484.method2254();
                int var91 = var90 >> 2;
                int var92 = var90 & 0x3;
                int var93 = field302[var91];
                if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                    method3153(Statics.field2136, var88, var89, var93, var86, var91, var92, 0, -1);
                }
            } else if (field284 == 205) {
                int var94 = field484.method2228();
                int var95 = (var94 >> 4 & 0x7) + Statics.field1331;
                int var96 = (var94 & 0x7) + Statics.field857;
                int var97 = field484.method2231();
                int var98 = field484.method2265();
                if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                    class27 var99 = new class27();
                    var99.field630 = var98;
                    var99.field629 = var97;
                    if (field394[Statics.field2136][var95][var96] == null) {
                        field394[Statics.field2136][var95][var96] = new class190();
                    }
                    field394[Statics.field2136][var95][var96].method3477(var99);
                    method638(var95, var96);
                }
            } else {
                if (field284 == 116) {
                    int var100 = field484.method2228();
                    int var101 = (var100 >> 4 & 0x7) + Statics.field1331;
                    int var102 = (var100 & 0x7) + Statics.field857;
                    int var103 = field484.method2231();
                    int var104 = field484.method2228();
                    int var105 = var104 >> 4 & 0xF;
                    int var106 = var104 & 0x7;
                    int var107 = field484.method2228();
                    if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                        int var108 = var105 + 1;
                        if (Statics.field1710.field751[0] >= var101 - var108 && Statics.field1710.field751[0] <= var101 + var108 && Statics.field1710.field803[0] >= var102 - var108 && Statics.field1710.field803[0] <= var102 + var108 && field472 != 0 && var106 > 0 && field485 < 50) {
                            field486[field485] = var103;
                            field487[field485] = var106;
                            field521[field485] = var107;
                            field490[field485] = null;
                            field489[field485] = (var101 << 16) + (var102 << 8) + var105;
                            field485++;
                        }
                    }
                }
                if (field284 == 83) {
                    int var109 = field484.method2374();
                    int var110 = (var109 >> 4 & 0x7) + Statics.field1331;
                    int var111 = (var109 & 0x7) + Statics.field857;
                    int var112 = field484.method2263();
                    if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                        class190 var113 = field394[Statics.field2136][var110][var111];
                        if (var113 != null) {
                            for (class27 var114 = (class27) var113.method3497(); var114 != null; var114 = (class27) var113.method3475()) {
                                if ((var112 & 0x7FFF) == var114.field630) {
                                    var114.method3562();
                                    break;
                                }
                            }
                            if (var113.method3497() == null) {
                                field394[Statics.field2136][var110][var111] = null;
                            }
                            method638(var110, var111);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fp.bt(IIIIIIIIIB)V")
    public static final void method3153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class16 var9 = null;
        for (class16 var10 = (class16) field375.method3497(); var10 != null; var10 = (class16) field375.method3475()) {
            if (var10.field211 == arg0 && var10.field199 == arg1 && var10.field200 == arg2 && var10.field198 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class16();
            var9.field211 = arg0;
            var9.field198 = arg3;
            var9.field199 = arg1;
            var9.field200 = arg2;
            method165(var9);
            field375.method3477(var9);
        }
        var9.field204 = arg4;
        var9.field197 = arg5;
        var9.field210 = arg6;
        var9.field207 = arg7;
        var9.field208 = arg8;
    }

    @ObfuscatedName("j.bz(Lr;I)V")
    public static final void method165(class16 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field198 == 0) {
            var1 = Statics.field656.method1703(arg0.field211, arg0.field199, arg0.field200);
        }
        if (arg0.field198 == 1) {
            var1 = Statics.field656.method1704(arg0.field211, arg0.field199, arg0.field200);
        }
        if (arg0.field198 == 2) {
            var1 = Statics.field656.method1705(arg0.field211, arg0.field199, arg0.field200);
        }
        if (arg0.field198 == 3) {
            var1 = Statics.field656.method1721(arg0.field211, arg0.field199, arg0.field200);
        }
        if (var1 != 0) {
            int var5 = Statics.field656.method1825(arg0.field211, arg0.field199, arg0.field200, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field201 = var2;
        arg0.field205 = var3;
        arg0.field202 = var4;
    }

    @ObfuscatedName("l.by(IIIIIIIB)V")
    public static final void method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field338 && Statics.field2136 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field656.method1703(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field656.method1704(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field656.method1705(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field656.method1721(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field656.method1825(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field656.method1694(arg0, arg2, arg3);
                class38 var15 = class38.method1667(var12);
                if (var15.field875 != 0) {
                    field432[arg0].method3813(arg2, arg3, var13, var14, var15.field888);
                }
            }
            if (arg1 == 1) {
                Statics.field656.method1812(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field656.method1696(arg0, arg2, arg3);
                class38 var16 = class38.method1667(var12);
                if (var16.field877 + arg2 > 103 || var16.field877 + arg3 > 103 || var16.field872 + arg2 > 103 || var16.field872 + arg3 > 103) {
                    return;
                }
                if (var16.field875 != 0) {
                    field432[arg0].method3804(arg2, arg3, var16.field877, var16.field872, var14, var16.field888);
                }
            }
            if (arg1 == 3) {
                Statics.field656.method1697(arg0, arg2, arg3);
                class38 var17 = class38.method1667(var12);
                if (var17.field875 == 1) {
                    field432[arg0].method3795(arg2, arg3);
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
        class81 var19 = Statics.field656;
        class220 var20 = field432[arg0];
        class38 var21 = class38.method1667(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field872;
            var23 = var21.field877;
        } else {
            var22 = var21.field877;
            var23 = var21.field872;
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
        int[][] var28 = class6.field75[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field861 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field901 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class80 var34;
            if (var21.field884 == -1 && var21.field902 == null) {
                var34 = var21.method739(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class12(arg4, 22, arg5, var18, arg2, arg3, var21.field884, true, (class80) null);
            }
            var19.method1683(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field875 == 1) {
                var20.method3790(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class80 var57;
            if (var21.field884 == -1 && var21.field902 == null) {
                var57 = var21.method739(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class12(arg4, 10, arg5, var18, arg2, arg3, var21.field884, true, (class80) null);
            }
            if (var57 != null) {
                var19.method1687(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field875 != 0) {
                var20.method3788(arg2, arg3, var22, var23, var21.field888);
            }
        } else if (arg6 >= 12) {
            class80 var35;
            if (var21.field884 == -1 && var21.field902 == null) {
                var35 = var21.method739(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class12(arg4, arg6, arg5, var18, arg2, arg3, var21.field884, true, (class80) null);
            }
            var19.method1687(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field875 != 0) {
                var20.method3788(arg2, arg3, var22, var23, var21.field888);
            }
        } else if (arg6 == 0) {
            class80 var36;
            if (var21.field884 == -1 && var21.field902 == null) {
                var36 = var21.method739(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class12(arg4, 0, arg5, var18, arg2, arg3, var21.field884, true, (class80) null);
            }
            var19.method1685(arg0, arg2, arg3, var29, var36, (class80) null, class6.field72[arg5], 0, var32, var33);
            if (var21.field875 != 0) {
                var20.method3787(arg2, arg3, arg6, arg5, var21.field888);
            }
        } else if (arg6 == 1) {
            class80 var37;
            if (var21.field884 == -1 && var21.field902 == null) {
                var37 = var21.method739(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class12(arg4, 1, arg5, var18, arg2, arg3, var21.field884, true, (class80) null);
            }
            var19.method1685(arg0, arg2, arg3, var29, var37, (class80) null, class6.field73[arg5], 0, var32, var33);
            if (var21.field875 != 0) {
                var20.method3787(arg2, arg3, arg6, arg5, var21.field888);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class80 var39;
            class80 var40;
            if (var21.field884 == -1 && var21.field902 == null) {
                var39 = var21.method739(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method739(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class12(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field884, true, (class80) null);
                var40 = new class12(arg4, 2, var38, var18, arg2, arg3, var21.field884, true, (class80) null);
            }
            var19.method1685(arg0, arg2, arg3, var29, var39, var40, class6.field72[arg5], class6.field72[var38], var32, var33);
            if (var21.field875 != 0) {
                var20.method3787(arg2, arg3, arg6, arg5, var21.field888);
            }
        } else if (arg6 == 3) {
            class80 var41;
            if (var21.field884 == -1 && var21.field902 == null) {
                var41 = var21.method739(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class12(arg4, 3, arg5, var18, arg2, arg3, var21.field884, true, (class80) null);
            }
            var19.method1685(arg0, arg2, arg3, var29, var41, (class80) null, class6.field73[arg5], 0, var32, var33);
            if (var21.field875 != 0) {
                var20.method3787(arg2, arg3, arg6, arg5, var21.field888);
            }
        } else if (arg6 == 9) {
            class80 var42;
            if (var21.field884 == -1 && var21.field902 == null) {
                var42 = var21.method739(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class12(arg4, arg6, arg5, var18, arg2, arg3, var21.field884, true, (class80) null);
            }
            var19.method1687(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field875 != 0) {
                var20.method3788(arg2, arg3, var22, var23, var21.field888);
            }
        } else if (arg6 == 4) {
            class80 var43;
            if (var21.field884 == -1 && var21.field902 == null) {
                var43 = var21.method739(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class12(arg4, 4, arg5, var18, arg2, arg3, var21.field884, true, (class80) null);
            }
            var19.method1686(arg0, arg2, arg3, var29, var43, (class80) null, class6.field72[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1703(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class38.method1667(var45 >> 14 & 0x7FFF).field886;
            }
            class80 var46;
            if (var21.field884 == -1 && var21.field902 == null) {
                var46 = var21.method739(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class12(arg4, 4, arg5, var18, arg2, arg3, var21.field884, true, (class80) null);
            }
            var19.method1686(arg0, arg2, arg3, var29, var46, (class80) null, class6.field72[arg5], 0, class6.field74[arg5] * var44, class6.field71[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1703(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class38.method1667(var48 >> 14 & 0x7FFF).field886 / 2;
            }
            class80 var49;
            if (var21.field884 == -1 && var21.field902 == null) {
                var49 = var21.method739(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class12(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field884, true, (class80) null);
            }
            var19.method1686(arg0, arg2, arg3, var29, var49, (class80) null, 256, arg5, class6.field76[arg5] * var47, class6.field77[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class80 var51;
            if (var21.field884 == -1 && var21.field902 == null) {
                var51 = var21.method739(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class12(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field884, true, (class80) null);
            }
            var19.method1686(arg0, arg2, arg3, var29, var51, (class80) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1703(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class38.method1667(var53 >> 14 & 0x7FFF).field886 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class80 var55;
            class80 var56;
            if (var21.field884 == -1 && var21.field902 == null) {
                var55 = var21.method739(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method739(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class12(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field884, true, (class80) null);
                var56 = new class12(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field884, true, (class80) null);
            }
            var19.method1686(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field76[arg5] * var52, class6.field77[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ar.bg(III)V")
    public static final void method638(int arg0, int arg1) {
        class190 var2 = field394[Statics.field2136][arg0][arg1];
        if (var2 == null) {
            Statics.field656.method1801(Statics.field2136, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class27 var5 = null;
        for (class27 var6 = (class27) var2.method3497(); var6 != null; var6 = (class27) var2.method3475()) {
            class47 var7 = class47.method3569(var6.field630);
            long var8 = (long) var7.field1062;
            if (var7.field1084 == 1) {
                var8 = (long) (var6.field629 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field656.method1801(Statics.field2136, arg0, arg1);
            return;
        }
        var2.method3478(var5);
        class27 var10 = null;
        class27 var11 = null;
        for (class27 var12 = (class27) var2.method3497(); var12 != null; var12 = (class27) var2.method3475()) {
            if (var5.field630 != var12.field630) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field630 != var12.field630 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field656.method1679(Statics.field2136, arg0, arg1, method141(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2136), var5, var13, var10, var11);
    }

    @ObfuscatedName("az.bv(I)V")
    public static final void method708() {
        int var0 = field484.method2484(8);
        if (var0 < field360) {
            for (int var1 = var0; var1 < field360; var1++) {
                field368[++field299 - 1] = field407[var1];
            }
        }
        if (var0 > field360) {
            throw new RuntimeException("");
        }
        field360 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field407[var2];
            class3 var4 = field359[var3];
            int var5 = field484.method2484(1);
            if (var5 == 0) {
                field407[++field360 - 1] = var3;
                var4.field796 = field249;
            } else {
                int var6 = field484.method2484(2);
                if (var6 == 0) {
                    field407[++field360 - 1] = var3;
                    var4.field796 = field249;
                    field459[++field362 - 1] = var3;
                } else if (var6 == 1) {
                    field407[++field360 - 1] = var3;
                    var4.field796 = field249;
                    int var7 = field484.method2484(3);
                    var4.method662(var7, false);
                    int var8 = field484.method2484(1);
                    if (var8 == 1) {
                        field459[++field362 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field407[++field360 - 1] = var3;
                    var4.field796 = field249;
                    int var9 = field484.method2484(3);
                    var4.method662(var9, true);
                    int var10 = field484.method2484(3);
                    var4.method662(var10, true);
                    int var11 = field484.method2484(1);
                    if (var11 == 1) {
                        field459[++field362 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field368[++field299 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("cf.bh(I)V")
    public static final void method1946() {
        for (int var0 = 0; var0 < field362; var0++) {
            int var1 = field459[var0];
            class3 var2 = field359[var1];
            int var3 = field484.method2228();
            if ((var3 & 0x80) != 0) {
                var3 += field484.method2228() << 8;
            }
            if ((var3 & 0x200) != 0) {
                int var4 = field484.method2263();
                int var5 = field484.method2228();
                var2.method664(var4, var5, field249);
                var2.field770 = field249 + 300;
                var2.field771 = field484.method2374();
                var2.field758 = field484.method2374();
            }
            if ((var3 & 0x10) != 0) {
                int var6 = field484.method2263();
                class143 var7 = (class143) class101.method164(Statics.method134(), field484.method2374());
                boolean var8 = field484.method2254() == 1;
                int var9 = field484.method2374();
                int var10 = field484.field1889;
                if (var2.field32 != null && var2.field30 != null) {
                    boolean var11 = false;
                    if (var7.field2158 && method152(var2.field32)) {
                        var11 = true;
                    }
                    if (!var11 && field358 == 0 && !var2.field29) {
                        field303.field1889 = 0;
                        field484.method2215(field303.field1888, 0, var9);
                        field303.field1889 = 0;
                        String var12 = class214.method3659(class154.method131(class213.method1966(field303)));
                        var2.field798 = var12.trim();
                        var2.field765 = var6 >> 8;
                        var2.field766 = var6 & 0xFF;
                        var2.field764 = 150;
                        var2.field762 = var8;
                        var2.field763 = Statics.field1710 != var2 && var7.field2158 && field463 != "" && var12.toLowerCase().indexOf(field463) == -1;
                        int var13;
                        if (var7.field2164) {
                            var13 = var8 ? 91 : 1;
                        } else {
                            var13 = var8 ? 90 : 2;
                        }
                        if (var7.field2162 == -1) {
                            class11.method2783(var13, var2.field32, var12);
                        } else {
                            int var15 = var7.field2162;
                            String var16 = "<img=" + var15 + ">";
                            class11.method2783(var13, var16 + var2.field32, var12);
                        }
                    }
                }
                field484.field1889 = var9 + var10;
            }
            if ((var3 & 0x8) != 0) {
                int var17 = field484.method2263();
                int var18 = field484.method2228();
                var2.method664(var17, var18, field249);
                var2.field770 = field249 + 300;
                var2.field771 = field484.method2256();
                var2.field758 = field484.method2228();
            }
            if ((var3 & 0x4) != 0) {
                int var19 = field484.method2231();
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = field484.method2256();
                method1959(var2, var19, var20);
            }
            if ((var3 & 0x40) != 0) {
                var2.field798 = field484.method2290();
                if (var2.field798.charAt(0) == '~') {
                    var2.field798 = var2.field798.substring(1);
                    class11.method2783(2, var2.field32, var2.field798);
                } else if (Statics.field1710 == var2) {
                    class11.method2783(2, var2.field32, var2.field798);
                }
                var2.field762 = false;
                var2.field765 = 0;
                var2.field766 = 0;
                var2.field764 = 150;
            }
            if ((var3 & 0x400) != 0) {
                var2.field784 = field484.method2231();
                int var21 = field484.method2233();
                var2.field788 = var21 >> 16;
                var2.field787 = (var21 & 0xFFFF) + field249;
                var2.field772 = 0;
                var2.field797 = 0;
                if (var2.field787 > field249) {
                    var2.field772 = -1;
                }
                if (var2.field784 == 65535) {
                    var2.field784 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var22 = field484.method2374();
                byte[] var23 = new byte[var22];
                class111 var24 = new class111(var23);
                field484.method2275(var23, 0, var22);
                field364[var1] = var24;
                var2.method17(var24);
            }
            if ((var3 & 0x2) != 0) {
                var2.field773 = field484.method2221();
                if (var2.field773 == 65535) {
                    var2.field773 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field760 = field484.method2221();
                var2.field761 = field484.method2221();
            }
            if ((var3 & 0x100) != 0) {
                var2.field789 = field484.method2374();
                var2.field791 = field484.method2374();
                var2.field790 = field484.method2374();
                var2.field786 = field484.method2374();
                var2.field793 = field484.method2265() + field249;
                var2.field794 = field484.method2221() + field249;
                var2.field795 = field484.method2254();
                var2.field801 = 1;
                var2.field806 = 0;
            }
        }
    }

    @ObfuscatedName("hw.bf(ZB)V")
    public static final void method3734(boolean arg0) {
        field299 = 0;
        field362 = 0;
        method2063();
        method2713(arg0);
        method11();
        for (int var1 = 0; var1 < field299; var1++) {
            int var2 = field368[var1];
            if (field249 != field277[var2].field796) {
                field277[var2].field713 = null;
                field277[var2] = null;
            }
        }
        if (field283 != field484.field1889) {
            throw new RuntimeException(field484.field1889 + class2.field24 + field283);
        }
        for (int var3 = 0; var3 < field278; var3++) {
            if (field277[field448[var3]] == null) {
                throw new RuntimeException(var3 + class2.field24 + field278);
            }
        }
    }

    @ObfuscatedName("ci.bk(I)V")
    public static final void method2063() {
        field484.method2483();
        int var0 = field484.method2484(8);
        if (var0 < field278) {
            for (int var1 = var0; var1 < field278; var1++) {
                field368[++field299 - 1] = field448[var1];
            }
        }
        if (var0 > field278) {
            throw new RuntimeException("");
        }
        field278 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field448[var2];
            class32 var4 = field277[var3];
            int var5 = field484.method2484(1);
            if (var5 == 0) {
                field448[++field278 - 1] = var3;
                var4.field796 = field249;
            } else {
                int var6 = field484.method2484(2);
                if (var6 == 0) {
                    field448[++field278 - 1] = var3;
                    var4.field796 = field249;
                    field459[++field362 - 1] = var3;
                } else if (var6 == 1) {
                    field448[++field278 - 1] = var3;
                    var4.field796 = field249;
                    int var7 = field484.method2484(3);
                    var4.method662(var7, false);
                    int var8 = field484.method2484(1);
                    if (var8 == 1) {
                        field459[++field362 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field448[++field278 - 1] = var3;
                    var4.field796 = field249;
                    int var9 = field484.method2484(3);
                    var4.method662(var9, true);
                    int var10 = field484.method2484(3);
                    var4.method662(var10, true);
                    int var11 = field484.method2484(1);
                    if (var11 == 1) {
                        field459[++field362 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field368[++field299 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("eq.bi(ZI)V")
    public static final void method2713(boolean arg0) {
        while (true) {
            if (field484.method2486(field283) >= 27) {
                int var1 = field484.method2484(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field277[var1] == null) {
                        field277[var1] = new class32();
                        var2 = true;
                    }
                    class32 var3 = field277[var1];
                    field448[++field278 - 1] = var1;
                    var3.field796 = field249;
                    int var4;
                    if (arg0) {
                        var4 = field484.method2484(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field484.method2484(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    int var5;
                    if (arg0) {
                        var5 = field484.method2484(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field484.method2484(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field484.method2484(1);
                    if (var6 == 1) {
                        field459[++field362 - 1] = var1;
                    }
                    int var7 = field484.method2484(1);
                    var3.field713 = class37.method3596(field484.method2484(14));
                    int var8 = field372[field484.method2484(3)];
                    if (var2) {
                        var3.field776 = var3.field750 = var8;
                    }
                    var3.field752 = var3.field713.field826;
                    var3.field782 = var3.field713.field849;
                    if (var3.field782 == 0) {
                        var3.field750 = 0;
                    }
                    var3.field756 = var3.field713.field832;
                    var3.field757 = var3.field713.field833;
                    var3.field774 = var3.field713.field834;
                    var3.field792 = var3.field713.field856;
                    var3.field753 = var3.field713.field829;
                    var3.field754 = var3.field713.field841;
                    var3.field755 = var3.field713.field831;
                    var3.method661(Statics.field1710.field751[0] + var5, Statics.field1710.field803[0] + var4, var7 == 1);
                    continue;
                }
            }
            field484.method2485();
            return;
        }
    }

    @ObfuscatedName("d.bx(I)V")
    public static final void method11() {
        for (int var0 = 0; var0 < field362; var0++) {
            int var1 = field459[var0];
            class32 var2 = field277[var1];
            int var3 = field484.method2228();
            if ((var3 & 0x10) != 0) {
                int var4 = field484.method2374();
                int var5 = field484.method2228();
                var2.method664(var4, var5, field249);
                var2.field770 = field249 + 300;
                var2.field771 = field484.method2263();
                var2.field758 = field484.method2231();
            }
            if ((var3 & 0x2) != 0) {
                var2.field784 = field484.method2231();
                int var6 = field484.method2413();
                var2.field788 = var6 >> 16;
                var2.field787 = (var6 & 0xFFFF) + field249;
                var2.field772 = 0;
                var2.field797 = 0;
                if (var2.field787 > field249) {
                    var2.field772 = -1;
                }
                if (var2.field784 == 65535) {
                    var2.field784 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field713 = class37.method3596(field484.method2263());
                var2.field752 = var2.field713.field826;
                var2.field782 = var2.field713.field849;
                var2.field756 = var2.field713.field832;
                var2.field757 = var2.field713.field833;
                var2.field774 = var2.field713.field834;
                var2.field792 = var2.field713.field856;
                var2.field753 = var2.field713.field829;
                var2.field754 = var2.field713.field841;
                var2.field755 = var2.field713.field831;
            }
            if ((var3 & 0x40) != 0) {
                int var7 = field484.method2374();
                int var8 = field484.method2254();
                var2.method664(var7, var8, field249);
                var2.field770 = field249 + 300;
                var2.field771 = field484.method2263();
                var2.field758 = field484.method2265();
            }
            if ((var3 & 0x20) != 0) {
                int var9 = field484.method2265();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = field484.method2228();
                if (var2.field779 == var9 && var9 != -1) {
                    int var11 = class40.method3092(var9).field942;
                    if (var11 == 1) {
                        var2.field780 = 0;
                        var2.field781 = 0;
                        var2.field785 = var10;
                        var2.field783 = 0;
                    }
                    if (var11 == 2) {
                        var2.field783 = 0;
                    }
                } else if (var9 == -1 || var2.field779 == -1 || class40.method3092(var9).field928 >= class40.method3092(var2.field779).field928) {
                    var2.field779 = var9;
                    var2.field780 = 0;
                    var2.field781 = 0;
                    var2.field785 = var10;
                    var2.field783 = 0;
                    var2.field806 = var2.field801;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field760 = field484.method2221();
                var2.field761 = field484.method2265();
            }
            if ((var3 & 0x8) != 0) {
                var2.field773 = field484.method2221();
                if (var2.field773 == 65535) {
                    var2.field773 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                var2.field798 = field484.method2290();
                var2.field764 = 100;
            }
        }
    }

    @ObfuscatedName("ck.bc(III)V")
    public static final void method2144(int arg0, int arg1) {
        if (field317 < 2 && field469 == 0 && !field444) {
            return;
        }
        String var2;
        if (field469 == 1 && field317 < 2) {
            var2 = class148.field2355 + class148.field2365 + field395 + " " + class2.field23;
        } else if (field444 && field317 < 2) {
            var2 = field399 + class148.field2365 + field400 + " " + class2.field23;
        } else {
            int var3 = field317 - 1;
            String var4;
            if (field396[var3].length() > 0) {
                var4 = field245[var3] + class148.field2365 + field396[var3];
            } else {
                var4 = field245[var3];
            }
            var2 = var4;
        }
        if (field317 > 2) {
            var2 = var2 + class2.method155(16777215) + " " + '/' + " " + (field317 - 2) + class148.field2333;
        }
        Statics.field989.method3667(var2, arg0 + 4, arg1 + 15, 16777215, 0, field249 / 1000);
    }

    @ObfuscatedName("ds.be(I)V")
    public static final void method2572() {
        int var0 = Statics.field2926;
        int var1 = Statics.field1947;
        int var2 = Statics.field2155;
        int var3 = Statics.field2557;
        int var4 = 6116423;
        class75.method1593(var0, var1, var2, var3, var4);
        class75.method1593(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class75.method1595(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field989.method3660(class148.field2358, var0 + 3, var1 + 14, var4, -1);
        int var5 = class132.field2061;
        int var6 = class132.field2062 * 130670055;
        for (int var7 = 0; var7 < field317; var7++) {
            int var8 = (field317 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class215 var10 = Statics.field989;
            String var11;
            if (field396[var7].length() > 0) {
                var11 = field245[var7] + class148.field2365 + field396[var7];
            } else {
                var11 = field245[var7];
            }
            var10.method3660(var11, var0 + 3, var8, var9, 0);
        }
        method1958(Statics.field2926, Statics.field1947, Statics.field2155, Statics.field2557);
    }

    @ObfuscatedName("s.bb(IIIII)V")
    public static final void method176(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field446; var4++) {
            if (field514[var4] + field495[var4] > arg0 && field514[var4] < arg0 + arg2 && field454[var4] + field452[var4] > arg1 && field452[var4] < arg1 + arg3) {
                field389[var4] = true;
            }
        }
    }

    @ObfuscatedName("cc.bl(IIIII)V")
    public static final void method1958(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field446; var4++) {
            if (field514[var4] + field495[var4] > arg0 && field514[var4] < arg0 + arg2 && field454[var4] + field452[var4] > arg1 && field452[var4] < arg1 + arg3) {
                field273[var4] = true;
            }
        }
    }

    @ObfuscatedName("a.cj(B)V")
    public static final void method102() {
        method855();
        if (Statics.field139 != null || field355 != null) {
            return;
        }
        int var0 = class132.field2067;
        if (field382) {
            if (var0 != 1 && (Statics.field699 || var0 != 4)) {
                int var1 = class132.field2061;
                int var2 = class132.field2062 * 130670055;
                if (var1 < Statics.field2926 - 10 || var1 > Statics.field2926 + Statics.field2155 + 10 || var2 < Statics.field1947 - 10 || var2 > Statics.field2557 + Statics.field1947 + 10) {
                    field382 = false;
                    method176(Statics.field2926, Statics.field1947, Statics.field2155, Statics.field2557);
                }
            }
            if (var0 == 1 || !Statics.field699 && var0 == 4) {
                int var3 = Statics.field2926;
                int var4 = Statics.field1947;
                int var5 = Statics.field2155;
                int var6 = class132.field2069;
                int var7 = class132.field2063;
                int var8 = -1;
                for (int var9 = 0; var9 < field317; var9++) {
                    int var10 = (field317 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1) {
                    method2817(var8);
                }
                field382 = false;
                method176(Statics.field2926, Statics.field1947, Statics.field2155, Statics.field2557);
            }
            return;
        }
        if ((var0 == 1 || !Statics.field699 && var0 == 4) && field317 > 0) {
            int var11 = field386[field317 - 1];
            if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                int var12 = field384[field317 - 1];
                int var13 = field385[field317 - 1];
                class164 var14 = Statics.method2717(var13);
                if (class169.method10(method2562(var14)) || class169.method1668(method2562(var14))) {
                    if (Statics.field139 != null && !field356 && field409 != 1 && !Statics.method3064(field317 - 1) && field317 > 0) {
                        Statics.method2175(field353, field354);
                    }
                    field356 = false;
                    field357 = 0;
                    if (Statics.field139 != null) {
                        method2625(Statics.field139);
                    }
                    Statics.field139 = Statics.method2717(var13);
                    field352 = var12;
                    field353 = class132.field2069;
                    field354 = class132.field2063;
                    if (field317 > 0) {
                        method1862(field317 - 1);
                    }
                    method2625(Statics.field139);
                    return;
                }
            }
        }
        if ((var0 == 1 || !Statics.field699 && var0 == 4) && (field409 == 1 && field317 > 2 || Statics.method3064(field317 - 1))) {
            var0 = 2;
        }
        if ((var0 == 1 || !Statics.field699 && var0 == 4) && field317 > 0) {
            method2817(field317 - 1);
        }
        if (var0 == 2 && field317 > 0) {
            method2836(class132.field2069, class132.field2063);
        }
    }

    @ObfuscatedName("ed.cb(IIB)V")
    public static final void method2836(int arg0, int arg1) {
        int var2 = Statics.field989.method3655(class148.field2358);
        for (int var3 = 0; var3 < field317; var3++) {
            class215 var4 = Statics.field989;
            String var5;
            if (field396[var3].length() > 0) {
                var5 = field245[var3] + class148.field2365 + field396[var3];
            } else {
                var5 = field245[var3];
            }
            int var6 = var4.method3655(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field317 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1461) {
            var8 = Statics.field1461 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field118) {
            var9 = Statics.field118 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field382 = true;
        Statics.field2926 = var8;
        Statics.field1947 = var9;
        Statics.field2155 = var2;
        Statics.field2557 = field317 * 15 + 22;
    }

    @ObfuscatedName("ej.cz(IB)V")
    public static final void method2817(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field384[arg0];
        int var2 = field385[arg0];
        int var3 = field386[arg0];
        int var4 = field387[arg0];
        String var5 = field245[arg0];
        String var6 = field396[arg0];
        method2853(var1, var2, var3, var4, var5, var6, class132.field2069, class132.field2063);
    }

    @ObfuscatedName("m.cu(Lae;III)V")
    public static final void method91(class29 arg0, int arg1, int arg2) {
        method2853(arg0.field655, arg0.field651, arg0.field652, arg0.field653, arg0.field654, arg0.field654, arg1, arg2);
    }

    @ObfuscatedName("ey.cq(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2853(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 31) {
            field488.method2480(176);
            field488.method2216(arg1);
            field488.method2214(arg3);
            field488.method2270(Statics.field2146);
            field488.method2262(Statics.field1312);
            field488.method2261(Statics.field718);
            field488.method2261(arg0);
            field350 = 0;
            Statics.field1803 = Statics.method2717(arg1);
            field351 = arg0;
        }
        if (arg2 == 17) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field477 = arg0;
            field478 = arg1;
            field488.method2480(74);
            field488.method2252(class129.field2020[82] ? 1 : 0);
            field488.method2216(Statics.field1554);
            field488.method2280(field397);
            field488.method2280(Statics.field178 + arg0);
            field488.method2214(Statics.field3035 + arg1);
            field488.method2261(arg3);
        }
        if (arg2 == 28) {
            field488.method2480(78);
            field488.method2216(arg1);
            class164 var8 = Statics.method2717(arg1);
            if (var8.field2727 != null && var8.field2727[0][0] == 5) {
                int var9 = var8.field2727[0][1];
                class167.field2801[var9] = 1 - class167.field2801[var9];
                method1871(var9);
            }
        }
        if (arg2 == 8) {
            class32 var10 = field277[arg3];
            if (var10 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(121);
                field488.method2404(class129.field2020[82] ? 1 : 0);
                field488.method2260(Statics.field1554);
                field488.method2280(arg3);
                field488.method2214(field397);
            }
        }
        if (arg2 == 51) {
            class3 var11 = field359[arg3];
            if (var11 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(144);
                field488.method2261(arg3);
                field488.method2213(class129.field2020[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field488.method2480(44);
            field488.method2271(arg1);
            field488.method2214(field397);
            field488.method2280(arg0);
            field488.method2214(arg3);
            field488.method2271(Statics.field1554);
            field350 = 0;
            Statics.field1803 = Statics.method2717(arg1);
            field351 = arg0;
        }
        if (arg2 == 1004) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field488.method2480(116);
            field488.method2280(arg3);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class164 var12 = class164.method3587(arg1, arg0);
            if (var12 != null) {
                int var13 = var12.field2768;
                class164 var14 = class164.method3587(arg1, arg0);
                if (var14 != null) {
                    if (var14.field2748 != null) {
                        class1 var15 = new class1();
                        var15.field1 = var14;
                        var15.field6 = arg3;
                        var15.field10 = arg5;
                        var15.field2 = var14.field2748;
                        class34.method31(var15, 200000);
                    }
                    boolean var16 = true;
                    if (var14.field2654 > 0) {
                        var16 = method2439(var14);
                    }
                    if (var16 && class169.method34(method2562(var14), arg3 - 1)) {
                        if (arg3 == 1) {
                            field488.method2480(255);
                            field488.method2216(arg1);
                            field488.method2214(arg0);
                            field488.method2214(var13);
                        }
                        if (arg3 == 2) {
                            field488.method2480(149);
                            field488.method2216(arg1);
                            field488.method2214(arg0);
                            field488.method2214(var13);
                        }
                        if (arg3 == 3) {
                            field488.method2480(194);
                            field488.method2216(arg1);
                            field488.method2214(arg0);
                            field488.method2214(var13);
                        }
                        if (arg3 == 4) {
                            field488.method2480(159);
                            field488.method2216(arg1);
                            field488.method2214(arg0);
                            field488.method2214(var13);
                        }
                        if (arg3 == 5) {
                            field488.method2480(148);
                            field488.method2216(arg1);
                            field488.method2214(arg0);
                            field488.method2214(var13);
                        }
                        if (arg3 == 6) {
                            field488.method2480(0);
                            field488.method2216(arg1);
                            field488.method2214(arg0);
                            field488.method2214(var13);
                        }
                        if (arg3 == 7) {
                            field488.method2480(245);
                            field488.method2216(arg1);
                            field488.method2214(arg0);
                            field488.method2214(var13);
                        }
                        if (arg3 == 8) {
                            field488.method2480(77);
                            field488.method2216(arg1);
                            field488.method2214(arg0);
                            field488.method2214(var13);
                        }
                        if (arg3 == 9) {
                            field488.method2480(153);
                            field488.method2216(arg1);
                            field488.method2214(arg0);
                            field488.method2214(var13);
                        }
                        if (arg3 == 10) {
                            field488.method2480(46);
                            field488.method2216(arg1);
                            field488.method2214(arg0);
                            field488.method2214(var13);
                        }
                    }
                }
            }
        }
        if (arg2 == 45) {
            class3 var17 = field359[arg3];
            if (var17 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(39);
                field488.method2214(arg3);
                field488.method2213(class129.field2020[82] ? 1 : 0);
            }
        }
        if (arg2 == 38) {
            method322();
            class164 var18 = Statics.method2717(arg1);
            field469 = 1;
            Statics.field1312 = arg0;
            Statics.field2146 = arg1;
            Statics.field718 = arg3;
            method2625(var18);
            field395 = class2.method155(16748608) + class47.method3569(arg3).field1077 + class2.method155(16777215);
            if (field395 == null) {
                field395 = "null";
            }
            return;
        }
        if (arg2 == 1) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field477 = arg0;
            field478 = arg1;
            field488.method2480(238);
            field488.method2261(Statics.field3035 + arg1);
            field488.method2214(Statics.field718);
            field488.method2253(class129.field2020[82] ? 1 : 0);
            field488.method2261(Statics.field178 + arg0);
            field488.method2262(arg3 >> 14 & 0x7FFF);
            field488.method2214(Statics.field1312);
            field488.method2216(Statics.field2146);
        }
        if (arg2 == 21) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field477 = arg0;
            field478 = arg1;
            field488.method2480(7);
            field488.method2280(Statics.field178 + arg0);
            field488.method2213(class129.field2020[82] ? 1 : 0);
            field488.method2280(Statics.field3035 + arg1);
            field488.method2214(arg3);
        }
        if (arg2 == 4) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field477 = arg0;
            field478 = arg1;
            field488.method2480(188);
            field488.method2252(class129.field2020[82] ? 1 : 0);
            field488.method2280(Statics.field178 + arg0);
            field488.method2261(Statics.field3035 + arg1);
            field488.method2214(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 34) {
            field488.method2480(32);
            field488.method2216(arg1);
            field488.method2262(arg3);
            field488.method2280(arg0);
            field350 = 0;
            Statics.field1803 = Statics.method2717(arg1);
            field351 = arg0;
        }
        if (arg2 == 14) {
            class3 var19 = field359[arg3];
            if (var19 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(170);
                field488.method2261(Statics.field1312);
                field488.method2271(Statics.field2146);
                field488.method2262(Statics.field718);
                field488.method2261(arg3);
                field488.method2404(class129.field2020[82] ? 1 : 0);
            }
        }
        if (arg2 == 22) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field477 = arg0;
            field478 = arg1;
            field488.method2480(1);
            field488.method2262(Statics.field178 + arg0);
            field488.method2214(Statics.field3035 + arg1);
            field488.method2261(arg3);
            field488.method2404(class129.field2020[82] ? 1 : 0);
        }
        if (arg2 == 42) {
            field488.method2480(215);
            field488.method2262(arg0);
            field488.method2260(arg1);
            field488.method2214(arg3);
            field350 = 0;
            Statics.field1803 = Statics.method2717(arg1);
            field351 = arg0;
        }
        if (arg2 == 13) {
            class32 var20 = field277[arg3];
            if (var20 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(208);
                field488.method2214(arg3);
                field488.method2213(class129.field2020[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field488.method2480(101);
            field488.method2280(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1005) {
            class164 var21 = Statics.method2717(arg1);
            if (var21 == null || var21.field2767[arg0] < 100000) {
                field488.method2480(116);
                field488.method2280(arg3);
            } else {
                class11.method2783(27, "", var21.field2767[arg0] + " x " + class47.method3569(arg3).field1077);
            }
            field350 = 0;
            Statics.field1803 = Statics.method2717(arg1);
            field351 = arg0;
        }
        if (arg2 == 46) {
            class3 var22 = field359[arg3];
            if (var22 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(239);
                field488.method2280(arg3);
                field488.method2252(class129.field2020[82] ? 1 : 0);
            }
        }
        if (arg2 == 24) {
            class164 var23 = Statics.method2717(arg1);
            boolean var24 = true;
            if (var23.field2654 > 0) {
                var24 = method2439(var23);
            }
            if (var24) {
                field488.method2480(78);
                field488.method2216(arg1);
            }
        }
        if (arg2 == 18) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field477 = arg0;
            field478 = arg1;
            field488.method2480(249);
            field488.method2261(Statics.field178 + arg0);
            field488.method2213(class129.field2020[82] ? 1 : 0);
            field488.method2214(Statics.field3035 + arg1);
            field488.method2262(arg3);
        }
        if (arg2 == 11) {
            class32 var25 = field277[arg3];
            if (var25 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(52);
                field488.method2280(arg3);
                field488.method2252(class129.field2020[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field488.method2480(114);
            field488.method2270(arg1);
            field488.method2261(arg3);
            field488.method2262(arg0);
            field350 = 0;
            Statics.field1803 = Statics.method2717(arg1);
            field351 = arg0;
        }
        if (arg2 == 29) {
            field488.method2480(78);
            field488.method2216(arg1);
            class164 var26 = Statics.method2717(arg1);
            if (var26.field2727 != null && var26.field2727[0][0] == 5) {
                int var27 = var26.field2727[0][1];
                if (class167.field2801[var27] != var26.field2762[0]) {
                    class167.field2801[var27] = var26.field2762[0];
                    method1871(var27);
                }
            }
        }
        if (arg2 == 36) {
            field488.method2480(73);
            field488.method2260(arg1);
            field488.method2280(arg0);
            field488.method2262(arg3);
            field350 = 0;
            Statics.field1803 = Statics.method2717(arg1);
            field351 = arg0;
        }
        if (arg2 == 10) {
            class32 var28 = field277[arg3];
            if (var28 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(45);
                field488.method2253(class129.field2020[82] ? 1 : 0);
                field488.method2261(arg3);
            }
        }
        if (arg2 == 40) {
            field488.method2480(158);
            field488.method2261(arg3);
            field488.method2261(arg0);
            field488.method2216(arg1);
            field350 = 0;
            Statics.field1803 = Statics.method2717(arg1);
            field351 = arg0;
        }
        if (arg2 == 35) {
            field488.method2480(72);
            field488.method2216(arg1);
            field488.method2214(arg0);
            field488.method2214(arg3);
            field350 = 0;
            Statics.field1803 = Statics.method2717(arg1);
            field351 = arg0;
        }
        if (arg2 == 19) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field477 = arg0;
            field478 = arg1;
            field488.method2480(165);
            field488.method2214(Statics.field178 + arg0);
            field488.method2404(class129.field2020[82] ? 1 : 0);
            field488.method2261(Statics.field3035 + arg1);
            field488.method2280(arg3);
        }
        if (arg2 == 47) {
            class3 var29 = field359[arg3];
            if (var29 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(111);
                field488.method2261(arg3);
                field488.method2252(class129.field2020[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class32 var30 = field277[arg3];
            if (var30 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(136);
                field488.method2252(class129.field2020[82] ? 1 : 0);
                field488.method2214(arg3);
            }
        }
        if (arg2 == 12) {
            class32 var31 = field277[arg3];
            if (var31 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(212);
                field488.method2261(arg3);
                field488.method2253(class129.field2020[82] ? 1 : 0);
            }
        }
        if (arg2 == 7) {
            class32 var32 = field277[arg3];
            if (var32 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(232);
                field488.method2216(Statics.field2146);
                field488.method2262(Statics.field718);
                field488.method2252(class129.field2020[82] ? 1 : 0);
                field488.method2280(arg3);
                field488.method2262(Statics.field1312);
            }
        }
        if (arg2 == 1003) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            class32 var33 = field277[arg3];
            if (var33 != null) {
                class37 var34 = var33.field713;
                if (var34.field828 != null) {
                    var34 = var34.method684();
                }
                if (var34 != null) {
                    field488.method2480(202);
                    field488.method2280(var34.field824);
                }
            }
        }
        if (arg2 == 37) {
            field488.method2480(183);
            field488.method2280(arg3);
            field488.method2280(arg0);
            field488.method2216(arg1);
            field350 = 0;
            Statics.field1803 = Statics.method2717(arg1);
            field351 = arg0;
        }
        if (arg2 == 26) {
            field488.method2480(199);
            for (class4 var35 = (class4) field402.method3448(); var35 != null; var35 = (class4) field402.method3449()) {
                if (var35.field51 == 0 || var35.field51 == 3) {
                    method510(var35, true);
                }
            }
            if (field316 != null) {
                method2625(field316);
                field316 = null;
            }
        }
        if (arg2 == 43) {
            field488.method2480(48);
            field488.method2262(arg3);
            field488.method2270(arg1);
            field488.method2262(arg0);
            field350 = 0;
            Statics.field1803 = Statics.method2717(arg1);
            field351 = arg0;
        }
        if (arg2 == 2) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field477 = arg0;
            field478 = arg1;
            field488.method2480(156);
            field488.method2270(Statics.field1554);
            field488.method2214(arg3 >> 14 & 0x7FFF);
            field488.method2253(class129.field2020[82] ? 1 : 0);
            field488.method2261(Statics.field178 + arg0);
            field488.method2280(Statics.field3035 + arg1);
            field488.method2280(field397);
        }
        if (arg2 == 1001) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field477 = arg0;
            field478 = arg1;
            field488.method2480(66);
            field488.method2404(class129.field2020[82] ? 1 : 0);
            field488.method2214(Statics.field3035 + arg1);
            field488.method2261(arg3 >> 14 & 0x7FFF);
            field488.method2280(Statics.field178 + arg0);
        }
        if (arg2 == 15) {
            class3 var36 = field359[arg3];
            if (var36 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(150);
                field488.method2214(field397);
                field488.method2213(class129.field2020[82] ? 1 : 0);
                field488.method2260(Statics.field1554);
                field488.method2261(arg3);
            }
        }
        if (arg2 == 50) {
            class3 var37 = field359[arg3];
            if (var37 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(137);
                field488.method2214(arg3);
                field488.method2253(class129.field2020[82] ? 1 : 0);
            }
        }
        if (arg2 == 41) {
            field488.method2480(122);
            field488.method2214(arg0);
            field488.method2271(arg1);
            field488.method2262(arg3);
            field350 = 0;
            Statics.field1803 = Statics.method2717(arg1);
            field351 = arg0;
        }
        if (arg2 == 44) {
            class3 var38 = field359[arg3];
            if (var38 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(250);
                field488.method2253(class129.field2020[82] ? 1 : 0);
                field488.method2262(arg3);
            }
        }
        if (arg2 == 23) {
            Statics.field656.method1714(Statics.field2136, arg0, arg1);
        }
        if (arg2 == 6) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field477 = arg0;
            field478 = arg1;
            field488.method2480(184);
            field488.method2261(Statics.field3035 + arg1);
            field488.method2404(class129.field2020[82] ? 1 : 0);
            field488.method2261(arg3 >> 14 & 0x7FFF);
            field488.method2261(Statics.field178 + arg0);
        }
        if (arg2 == 3) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field477 = arg0;
            field478 = arg1;
            field488.method2480(166);
            field488.method2214(Statics.field178 + arg0);
            field488.method2214(Statics.field3035 + arg1);
            field488.method2253(class129.field2020[82] ? 1 : 0);
            field488.method2280(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 49) {
            class3 var39 = field359[arg3];
            if (var39 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(28);
                field488.method2253(class129.field2020[82] ? 1 : 0);
                field488.method2261(arg3);
            }
        }
        if (arg2 == 48) {
            class3 var40 = field359[arg3];
            if (var40 != null) {
                field346 = arg6;
                field347 = arg7;
                field349 = 2;
                field410 = 0;
                field477 = arg0;
                field478 = arg1;
                field488.method2480(65);
                field488.method2280(arg3);
                field488.method2252(class129.field2020[82] ? 1 : 0);
            }
        }
        if (arg2 == 16) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field477 = arg0;
            field478 = arg1;
            field488.method2480(62);
            field488.method2271(Statics.field2146);
            field488.method2262(Statics.field178 + arg0);
            field488.method2214(arg3);
            field488.method2262(Statics.field1312);
            field488.method2214(Statics.field3035 + arg1);
            field488.method2262(Statics.field718);
            field488.method2252(class129.field2020[82] ? 1 : 0);
        }
        if (arg2 == 30 && field316 == null) {
            method3586(arg1, arg0);
            field316 = class164.method3587(arg1, arg0);
            method2625(field316);
        }
        if (arg2 == 25) {
            class164 var41 = class164.method3587(arg1, arg0);
            if (var41 != null) {
                method322();
                int var42 = class169.method2056(method2562(var41));
                int var43 = var41.field2768;
                class164 var44 = class164.method3587(arg1, arg0);
                if (var44 != null && var44.field2739 != null) {
                    class1 var45 = new class1();
                    var45.field1 = var44;
                    var45.field2 = var44.field2739;
                    class34.method31(var45, 200000);
                }
                field398 = var43;
                field444 = true;
                Statics.field1554 = arg1;
                field397 = arg0;
                Statics.field2052 = var42;
                method2625(var44);
                field469 = 0;
                field399 = method1384(var41);
                if (field399 == null) {
                    field399 = "Null";
                }
                if (var41.field2649) {
                    field400 = var41.field2721 + class2.method155(16777215);
                } else {
                    field400 = class2.method155(65280) + var41.field2764 + class2.method155(16777215);
                }
            }
            return;
        }
        if (arg2 == 33) {
            field488.method2480(198);
            field488.method2261(arg3);
            field488.method2270(arg1);
            field488.method2214(arg0);
            field350 = 0;
            Statics.field1803 = Statics.method2717(arg1);
            field351 = arg0;
        }
        if (arg2 == 58) {
            class164 var46 = class164.method3587(arg1, arg0);
            if (var46 != null) {
                field488.method2480(224);
                field488.method2214(var46.field2768);
                field488.method2262(arg0);
                field488.method2270(Statics.field1554);
                field488.method2262(field397);
                field488.method2280(field398);
                field488.method2216(arg1);
            }
        }
        if (arg2 == 5) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field477 = arg0;
            field478 = arg1;
            field488.method2480(218);
            field488.method2262(arg3 >> 14 & 0x7FFF);
            field488.method2261(Statics.field178 + arg0);
            field488.method2213(class129.field2020[82] ? 1 : 0);
            field488.method2262(Statics.field3035 + arg1);
        }
        if (arg2 == 20) {
            field346 = arg6;
            field347 = arg7;
            field349 = 2;
            field410 = 0;
            field477 = arg0;
            field478 = arg1;
            field488.method2480(5);
            field488.method2261(arg3);
            field488.method2262(Statics.field178 + arg0);
            field488.method2213(class129.field2020[82] ? 1 : 0);
            field488.method2214(Statics.field3035 + arg1);
        }
        if (field469 != 0) {
            field469 = 0;
            method2625(Statics.method2717(Statics.field2146));
        }
        if (field444) {
            method322();
        }
        if (Statics.field1803 != null && field350 == 0) {
            method2625(Statics.field1803);
        }
    }

    @ObfuscatedName("cb.cw(ILjava/lang/String;B)V")
    public static void method1674(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field360; var3++) {
            class3 var4 = field359[field407[var3]];
            if (var4 != null && var4.field32 != null && var4.field32.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field488.method2480(250);
                    field488.method2253(0);
                    field488.method2262(field407[var3]);
                } else if (arg0 == 4) {
                    field488.method2480(111);
                    field488.method2261(field407[var3]);
                    field488.method2252(0);
                } else if (arg0 == 6) {
                    field488.method2480(28);
                    field488.method2253(0);
                    field488.method2261(field407[var3]);
                } else if (arg0 == 7) {
                    field488.method2480(137);
                    field488.method2214(field407[var3]);
                    field488.method2253(0);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class11.method2783(4, "", class148.field2354 + arg1);
        }
    }

    @ObfuscatedName("client.co(I)V")
    public static void method322() {
        if (!field444) {
            return;
        }
        class164 var0 = class164.method3587(Statics.field1554, field397);
        if (var0 != null && var0.field2740 != null) {
            class1 var1 = new class1();
            var1.field1 = var0;
            var1.field2 = var0.field2740;
            class34.method31(var1, 200000);
        }
        field444 = false;
        method2625(var0);
    }

    @ObfuscatedName("ge.cn(III)V")
    public static void method3586(int arg0, int arg1) {
        field488.method2480(3);
        field488.method2280(arg1);
        field488.method2270(arg0);
    }

    @ObfuscatedName("ah.cf(I)V")
    public static final void method855() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field317 - 1; var1++) {
                if (field386[var1] < 1000 && field386[var1 + 1] > 1000) {
                    String var2 = field396[var1];
                    field396[var1] = field396[var1 + 1];
                    field396[var1 + 1] = var2;
                    String var3 = field245[var1];
                    field245[var1] = field245[var1 + 1];
                    field245[var1 + 1] = var3;
                    int var4 = field386[var1];
                    field386[var1] = field386[var1 + 1];
                    field386[var1 + 1] = var4;
                    int var5 = field384[var1];
                    field384[var1] = field384[var1 + 1];
                    field384[var1 + 1] = var5;
                    int var6 = field385[var1];
                    field385[var1] = field385[var1 + 1];
                    field385[var1 + 1] = var6;
                    int var7 = field387[var1];
                    field387[var1] = field387[var1 + 1];
                    field387[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("dr.ce(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2537(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field382 || field317 >= 500) {
            return;
        }
        field245[field317] = arg0;
        field396[field317] = arg1;
        field386[field317] = arg2;
        field387[field317] = arg3;
        field384[field317] = arg4;
        field385[field317] = arg5;
        field317++;
    }

    @ObfuscatedName("ao.cc(B)V")
    public static void method673() {
        for (int var0 = 0; var0 < field317; var0++) {
            if (method1948(field386[var0])) {
                if (var0 < field317 - 1) {
                    for (int var1 = var0; var1 < field317 - 1; var1++) {
                        field245[var1] = field245[var1 + 1];
                        field396[var1] = field396[var1 + 1];
                        field386[var1] = field386[var1 + 1];
                        field387[var1] = field387[var1 + 1];
                        field384[var1] = field384[var1 + 1];
                        field385[var1] = field385[var1 + 1];
                    }
                }
                field317--;
            }
        }
    }

    @ObfuscatedName("cc.ca(IB)Z")
    public static boolean method1948(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ec.cv(Laz;IIII)V")
    public static final void method2855(class37 arg0, int arg1, int arg2, int arg3) {
        if (field317 >= 400) {
            return;
        }
        if (arg0.field828 != null) {
            arg0 = arg0.method684();
        }
        if (arg0 == null || !arg0.field853 || arg0.field825 && field508 != arg1) {
            return;
        }
        String var4 = arg0.field840;
        if (arg0.field842 != 0) {
            var4 = var4 + method2145(arg0.field842, Statics.field1710.field33) + " " + class2.field22 + class148.field2361 + arg0.field842 + class2.field20;
        }
        if (field469 == 1) {
            method2537(class148.field2355, field395 + " " + class2.field23 + " " + class2.method155(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field444) {
            String[] var5 = arg0.field858;
            if (field412) {
                var5 = method2887(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class148.field2357)) {
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
                        method2537(var5[var6], class2.method155(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class148.field2357)) {
                        short var9 = 0;
                        if (field449 == class19.field524 || field449 == class19.field525 && arg0.field842 > Statics.field1710.field33) {
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
                        method2537(var5[var8], class2.method155(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method2537(class148.field2356, class2.method155(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2052 & 0x2) == 2) {
            method2537(field399, field400 + " " + class2.field23 + " " + class2.method155(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("eu.ch(Lz;IIIB)V")
    public static final void method2684(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1710 == arg0 || field317 >= 400) {
            return;
        }
        String var4;
        if (arg0.field34 == 0) {
            var4 = arg0.field32 + method2145(arg0.field33, Statics.field1710.field33) + " " + class2.field22 + class148.field2361 + arg0.field33 + class2.field20;
        } else {
            var4 = arg0.field32 + " " + class2.field22 + class148.field2362 + arg0.field34 + class2.field20;
        }
        if (field469 == 1) {
            method2537(class148.field2355, field395 + " " + class2.field23 + " " + class2.method155(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field444) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field424[var5] != null) {
                    short var6 = 0;
                    if (field424[var5].equalsIgnoreCase(class148.field2357)) {
                        if (field449 == class19.field524 || field449 == class19.field525 && arg0.field33 > Statics.field1710.field33) {
                            var6 = 2000;
                        }
                        if (Statics.field1710.field46 != 0 && arg0.field46 != 0) {
                            if (Statics.field1710.field46 == arg0.field46) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field260[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field369[var5] + var6;
                    method2537(field424[var5], class2.method155(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2052 & 0x8) == 8) {
            method2537(field399, field400 + " " + class2.field23 + " " + class2.method155(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field317; var9++) {
            if (field386[var9] == 23) {
                field396[var9] = class2.method155(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ck.cx(IIB)Ljava/lang/String;")
    public static final String method2145(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method155(16711680);
        } else if (var2 < -6) {
            return class2.method155(16723968);
        } else if (var2 < -3) {
            return class2.method155(16740352);
        } else if (var2 < 0) {
            return class2.method155(16756736);
        } else if (var2 > 9) {
            return class2.method155(65280);
        } else if (var2 > 6) {
            return class2.method155(4259584);
        } else if (var2 > 3) {
            return class2.method155(8453888);
        } else if (var2 > 0) {
            return class2.method155(12648192);
        } else {
            return class2.method155(16776960);
        }
    }

    @ObfuscatedName("o.cy([Lfy;IIIIIIIII)V")
    public static final void method541(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75.method1620(arg2, arg3, arg4, arg5);
        class86.method1896();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class164 var10 = arg0[var9];
            if (var10 != null && (var10.field2669 == arg1 || arg1 == -1412584499 && field355 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field514[field446] = var10.field2663 + arg6;
                    field452[field446] = var10.field2664 + arg7;
                    field495[field446] = var10.field2665;
                    field454[field446] = var10.field2666;
                    var11 = ++field446 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2675 = var11;
                var10.field2749 = field249;
                if (!var10.field2649 || !method3036(var10)) {
                    if (var10.field2654 > 0) {
                        int var12 = var10.field2654;
                        if (var12 == 324) {
                            if (field517 == -1) {
                                field517 = var10.field2667;
                                field518 = var10.field2684;
                            }
                            if (field516.field2817) {
                                var10.field2667 = field517;
                            } else {
                                var10.field2667 = field518;
                            }
                        } else if (var12 == 325) {
                            if (field517 == -1) {
                                field517 = var10.field2667;
                                field518 = var10.field2684;
                            }
                            if (field516.field2817) {
                                var10.field2667 = field518;
                            } else {
                                var10.field2667 = field517;
                            }
                        } else if (var12 == 327) {
                            var10.field2776 = 150;
                            var10.field2696 = (int) (Math.sin((double) field249 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2691 = 5;
                            var10.field2692 = 0;
                        } else if (var12 == 328) {
                            var10.field2776 = 150;
                            var10.field2696 = (int) (Math.sin((double) field249 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2691 = 5;
                            var10.field2692 = 1;
                        }
                    }
                    int var13 = var10.field2663 + arg6;
                    int var14 = var10.field2664 + arg7;
                    int var15 = var10.field2680;
                    if (field355 == var10) {
                        if (arg1 != -1412584499 && !var10.field2778) {
                            Statics.field83 = arg0;
                            Statics.field140 = arg6;
                            Statics.field88 = arg7;
                            continue;
                        }
                        if (field425 && field320) {
                            int var16 = class132.field2061;
                            int var17 = class132.field2062 * 130670055;
                            int var18 = var16 - field416;
                            int var19 = var17 - field417;
                            if (var18 < field492) {
                                var18 = field492;
                            }
                            if (var10.field2665 + var18 > field492 + field415.field2665) {
                                var18 = field492 + field415.field2665 - var10.field2665;
                            }
                            if (var19 < field440) {
                                var19 = field440;
                            }
                            if (var10.field2666 + var19 > field440 + field415.field2666) {
                                var19 = field440 + field415.field2666 - var10.field2666;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2778) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2732 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2732 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2665 + var13;
                        int var27 = var10.field2666 + var14;
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
                        int var30 = var10.field2665 + var13;
                        int var31 = var10.field2666 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2649 || var20 < var22 && var21 < var23) {
                        if (var10.field2654 != 0) {
                            if (var10.field2654 == 1336) {
                                if (field256) {
                                    var14 += 15;
                                    Statics.field1026.method3661("Fps:" + field2101, var10.field2665 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field338) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field338) {
                                        var34 = 16711680;
                                    }
                                    Statics.field1026.method3661("Mem:" + var33 + "k", var10.field2665 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2654 == 1337) {
                                field390 = var13;
                                field391 = var14;
                                int var37 = var10.field2665;
                                int var38 = var10.field2666;
                                field343++;
                                method173(class31.field696);
                                boolean var39 = false;
                                if (field373 >= 0) {
                                    for (int var40 = 0; var40 < field360; var40++) {
                                        if (field373 == field407[var40]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method173(class31.field701);
                                }
                                method1962(true);
                                method173(var39 ? class31.field698 : class31.field697);
                                method1962(false);
                                for (class7 var41 = (class7) field470.method3497(); var41 != null; var41 = (class7) field470.method3475()) {
                                    if (Statics.field2136 != var41.field108 || field249 > var41.field96) {
                                        var41.method3562();
                                    } else if (field249 >= var41.field116) {
                                        if (var41.field99 > 0) {
                                            class32 var42 = field277[var41.field99 - 1];
                                            if (var42 != null && var42.field809 >= 0 && var42.field809 < 13312 && var42.field749 >= 0 && var42.field749 < 13312) {
                                                var41.method88(var42.field809, var42.field749, method141(var42.field809, var42.field749, var41.field108) - var41.field89, field249);
                                            }
                                        }
                                        if (var41.field99 < 0) {
                                            int var43 = -var41.field99 - 1;
                                            class3 var44;
                                            if (field365 == var43) {
                                                var44 = Statics.field1710;
                                            } else {
                                                var44 = field359[var43];
                                            }
                                            if (var44 != null && var44.field809 >= 0 && var44.field809 < 13312 && var44.field749 >= 0 && var44.field749 < 13312) {
                                                var41.method88(var44.field809, var44.field749, method141(var44.field809, var44.field749, var41.field108) - var41.field89, field249);
                                            }
                                        }
                                        var41.method85(field315);
                                        Statics.field656.method1688(Statics.field2136, (int) var41.field94, (int) var41.field102, (int) var41.field103, 60, var41, var41.field109, -1, false);
                                    }
                                }
                                method1865();
                                method749(var13, var14, var37, var38, true);
                                int var45 = field505;
                                int var46 = field370;
                                int var47 = field507;
                                int var48 = field374;
                                class75.method1620(var45, var46, var45 + var47, var46 + var48);
                                class86.method1896();
                                if (!field491) {
                                    int var49 = field261;
                                    if (field331 / 256 > var49) {
                                        var49 = field331 / 256;
                                    }
                                    if (field473[4] && field494[4] + 128 > var49) {
                                        var49 = field494[4] + 128;
                                    }
                                    int var50 = field324 + field307 & 0x7FF;
                                    int var51 = Statics.field1560;
                                    int var52 = method141(Statics.field1710.field809, Statics.field1710.field749, Statics.field2136) - 50;
                                    int var53 = Statics.field1386;
                                    int var54 = var49 * 3 + 600;
                                    int var55 = 2048 - var49 & 0x7FF;
                                    int var56 = 2048 - var50 & 0x7FF;
                                    int var57 = 0;
                                    int var58 = 0;
                                    int var59 = var54;
                                    if (var55 != 0) {
                                        int var60 = class86.field1515[var55];
                                        int var61 = class86.field1516[var55];
                                        int var62 = var58 * var61 - var54 * var60 >> 16;
                                        var59 = var58 * var60 + var54 * var61 >> 16;
                                        var58 = var62;
                                    }
                                    if (var56 != 0) {
                                        int var63 = class86.field1515[var56];
                                        int var64 = class86.field1516[var56];
                                        int var65 = var57 * var64 + var59 * var63 >> 16;
                                        var59 = var59 * var64 - var57 * var63 >> 16;
                                        var57 = var65;
                                    }
                                    Statics.field55 = var51 - var57;
                                    Statics.field28 = var52 - var58;
                                    Statics.field727 = var53 - var59;
                                    Statics.field597 = var49;
                                    Statics.field923 = var50;
                                }
                                int var66;
                                if (field491) {
                                    int var67;
                                    if (Statics.field608.field127) {
                                        var67 = Statics.field2136;
                                    } else {
                                        int var68 = method141(Statics.field55, Statics.field727, Statics.field2136);
                                        if (var68 - Statics.field28 >= 800 || (class6.field66[Statics.field2136][Statics.field55 >> 7][Statics.field727 >> 7] & 0x4) == 0) {
                                            var67 = 3;
                                        } else {
                                            var67 = Statics.field2136;
                                        }
                                    }
                                    var66 = var67;
                                } else {
                                    var66 = method2153();
                                }
                                int var69 = Statics.field55;
                                int var70 = Statics.field28;
                                int var71 = Statics.field727;
                                int var72 = Statics.field597;
                                int var73 = Statics.field923;
                                for (int var74 = 0; var74 < 5; var74++) {
                                    if (field473[var74]) {
                                        int var75 = (int) (Math.random() * (double) (field246[var74] * 2 + 1) - (double) field246[var74] + Math.sin((double) field456[var74] / 100.0D * (double) field461[var74]) * (double) field494[var74]);
                                        if (var74 == 0) {
                                            Statics.field55 += var75;
                                        }
                                        if (var74 == 1) {
                                            Statics.field28 += var75;
                                        }
                                        if (var74 == 2) {
                                            Statics.field727 += var75;
                                        }
                                        if (var74 == 3) {
                                            Statics.field923 = Statics.field923 + var75 & 0x7FF;
                                        }
                                        if (var74 == 4) {
                                            Statics.field597 += var75;
                                            if (Statics.field597 < 128) {
                                                Statics.field597 = 128;
                                            }
                                            if (Statics.field597 > 383) {
                                                Statics.field597 = 383;
                                            }
                                        }
                                    }
                                }
                                int var76 = class132.field2061;
                                int var77 = class132.field2062 * 130670055;
                                if (class132.field2067 != 0) {
                                    var76 = class132.field2069;
                                    var77 = class132.field2063;
                                }
                                if (var76 >= var45 && var76 < var45 + var47 && var77 >= var46 && var77 < var46 + var48) {
                                    class100.field1755 = true;
                                    class100.field1793 = 0;
                                    class100.field1774 = var76 - var45;
                                    class100.field1792 = var77 - var46;
                                } else {
                                    class100.field1755 = false;
                                    class100.field1793 = 0;
                                }
                                method2561();
                                class75.method1593(var45, var46, var47, var48, 0);
                                method2561();
                                int var78 = class86.field1501;
                                class86.field1501 = field509;
                                Statics.field656.method1715(Statics.field55, Statics.field28, Statics.field727, Statics.field597, Statics.field923, var66);
                                class86.field1501 = var78;
                                method2561();
                                Statics.field656.method1722();
                                method1860(var45, var46, var47, var48);
                                if (field431 == 2) {
                                    method3399((field326 - Statics.field178 << 7) + field264, (field496 - Statics.field3035 << 7) + field265, field366 * 2);
                                    if (field344 > -1 && field249 % 20 < 10) {
                                        Statics.field984[0].method1516(field344 + var45 - 12, field258 + var46 - 28);
                                    }
                                }
                                ((class90) Statics.field1512).method1950(field315);
                                method1061(var45, var46, var47, var48);
                                Statics.field55 = var69;
                                Statics.field28 = var70;
                                Statics.field727 = var71;
                                Statics.field597 = var72;
                                Statics.field923 = var73;
                                if (field301 && class162.method93(true, false) == 0) {
                                    field301 = false;
                                }
                                if (field301) {
                                    class75.method1593(var45, var46, var47, var48, 0);
                                    Statics.method129(class148.field2454, false);
                                }
                                field389[var10.field2675] = true;
                                class75.method1620(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2654 == 1338) {
                                method1870(var10, var13, var14, var11);
                                class75.method1620(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2654 == 1339) {
                                method158(var10, var13, var14, var11);
                                class75.method1620(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2732 == 0) {
                            if (!var10.field2649 && method3036(var10) && Statics.field60 != var10) {
                                continue;
                            }
                            if (!var10.field2649) {
                                if (var10.field2672 > var10.field2674 - var10.field2666) {
                                    var10.field2672 = var10.field2674 - var10.field2666;
                                }
                                if (var10.field2672 < 0) {
                                    var10.field2672 = 0;
                                }
                            }
                            method541(arg0, var10.field2651, var20, var21, var22, var23, var13 - var10.field2671, var14 - var10.field2672, var11);
                            if (var10.field2775 != null) {
                                method541(var10.field2775, var10.field2651, var20, var21, var22, var23, var13 - var10.field2671, var14 - var10.field2672, var11);
                            }
                            class4 var79 = (class4) field402.method3445((long) var10.field2651);
                            if (var79 != null) {
                                int var80 = var79.field58;
                                if (class164.method3404(var80)) {
                                    Statics.field83 = null;
                                    method541(Statics.field2653[var80], -1, var20, var21, var22, var23, var13, var14, var11);
                                    if (Statics.field83 != null) {
                                        method541(Statics.field83, -1412584499, var20, var21, var22, var23, Statics.field140, Statics.field88, var11);
                                        Statics.field83 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var81 = 0; var81 < 100; var81++) {
                                        field389[var81] = true;
                                    }
                                } else {
                                    field389[var11] = true;
                                }
                            }
                            class75.method1620(arg2, arg3, arg4, arg5);
                            class86.method1896();
                        }
                        if (field457 || field493[var11] || field455 > 1) {
                            if (var10.field2732 == 0 && !var10.field2649 && var10.field2674 > var10.field2666) {
                                int var82 = var10.field2665 + var13;
                                int var83 = var10.field2672;
                                int var84 = var10.field2666;
                                int var85 = var10.field2674;
                                Statics.field531[0].method1647(var82, var14);
                                Statics.field531[1].method1647(var82, var14 + var84 - 16);
                                class75.method1593(var82, var14 + 16, 16, var84 - 32, field247);
                                int var86 = (var84 - 32) * var84 / var85;
                                if (var86 < 8) {
                                    var86 = 8;
                                }
                                int var87 = (var84 - 32 - var86) * var83 / (var85 - var84);
                                class75.method1593(var82, var14 + 16 + var87, 16, var86, field318);
                                class75.method1606(var82, var14 + 16 + var87, var86, field506);
                                class75.method1606(var82 + 1, var14 + 16 + var87, var86, field506);
                                class75.method1617(var82, var14 + 16 + var87, 16, field506);
                                class75.method1617(var82, var14 + 17 + var87, 16, field506);
                                class75.method1606(var82 + 15, var14 + 16 + var87, var86, field445);
                                class75.method1606(var82 + 14, var14 + 17 + var87, var86 - 1, field445);
                                class75.method1617(var82, var14 + 15 + var87 + var86, 16, field445);
                                class75.method1617(var82 + 1, var14 + 14 + var87 + var86, 15, field445);
                            }
                            if (var10.field2732 != 1) {
                                if (var10.field2732 == 2) {
                                    int var88 = 0;
                                    for (int var89 = 0; var89 < var10.field2744; var89++) {
                                        for (int var90 = 0; var90 < var10.field2777; var90++) {
                                            int var91 = (var10.field2737 + 32) * var90 + var13;
                                            int var92 = (var10.field2715 + 32) * var89 + var14;
                                            if (var88 < 20) {
                                                var91 += var10.field2716[var88];
                                                var92 += var10.field2717[var88];
                                            }
                                            if (var10.field2652[var88] > 0) {
                                                boolean var93 = false;
                                                boolean var94 = false;
                                                int var95 = var10.field2652[var88] - 1;
                                                if (var91 + 32 > arg2 && var91 < arg4 && var92 + 32 > arg3 && var92 < arg5 || Statics.field139 == var10 && field352 == var88) {
                                                    class74 var96;
                                                    if (field469 == 1 && Statics.field1312 == var88 && Statics.field2146 == var10.field2651) {
                                                        var96 = class47.method136(var95, var10.field2767[var88], 2, 0, 2, false);
                                                    } else {
                                                        var96 = class47.method136(var95, var10.field2767[var88], 1, 3153952, 2, false);
                                                    }
                                                    if (var96 == null) {
                                                        method2625(var10);
                                                    } else if (Statics.field139 == var10 && field352 == var88) {
                                                        int var97 = class132.field2061 - field353;
                                                        int var98 = class132.field2062 * 130670055 - field354;
                                                        if (var97 < 5 && var97 > -5) {
                                                            var97 = 0;
                                                        }
                                                        if (var98 < 5 && var98 > -5) {
                                                            var98 = 0;
                                                        }
                                                        if (field357 < 5) {
                                                            var97 = 0;
                                                            var98 = 0;
                                                        }
                                                        var96.method1581(var91 + var97, var92 + var98, 128);
                                                        if (arg1 != -1) {
                                                            class164 var99 = arg0[arg1 & 0xFFFF];
                                                            if (var92 + var98 < class75.field1350 && var99.field2672 > 0) {
                                                                int var100 = field315 * (class75.field1350 - var92 - var98) / 3;
                                                                if (var100 > field315 * 10) {
                                                                    var100 = field315 * 10;
                                                                }
                                                                if (var100 > var99.field2672) {
                                                                    var100 = var99.field2672;
                                                                }
                                                                var99.field2672 -= var100;
                                                                field354 += var100;
                                                                method2625(var99);
                                                            }
                                                            if (var92 + var98 + 32 > class75.field1351 && var99.field2672 < var99.field2674 - var99.field2666) {
                                                                int var101 = field315 * (var92 + var98 + 32 - class75.field1351) / 3;
                                                                if (var101 > field315 * 10) {
                                                                    var101 = field315 * 10;
                                                                }
                                                                if (var101 > var99.field2674 - var99.field2666 - var99.field2672) {
                                                                    var101 = var99.field2674 - var99.field2666 - var99.field2672;
                                                                }
                                                                var99.field2672 += var101;
                                                                field354 -= var101;
                                                                method2625(var99);
                                                            }
                                                        }
                                                    } else if (Statics.field1803 == var10 && field351 == var88) {
                                                        var96.method1581(var91, var92, 128);
                                                    } else {
                                                        var96.method1516(var91, var92);
                                                    }
                                                }
                                            } else if (var10.field2718 != null && var88 < 20) {
                                                class74 var102 = var10.method3103(var88);
                                                if (var102 != null) {
                                                    var102.method1516(var91, var92);
                                                } else if (class164.field2648) {
                                                    method2625(var10);
                                                }
                                            }
                                            var88++;
                                        }
                                    }
                                } else if (var10.field2732 == 3) {
                                    int var103;
                                    if (method656(var10)) {
                                        var103 = var10.field2683;
                                        if (Statics.field60 == var10 && var10.field2678 != 0) {
                                            var103 = var10.field2678;
                                        }
                                    } else {
                                        var103 = var10.field2723;
                                        if (Statics.field60 == var10 && var10.field2677 != 0) {
                                            var103 = var10.field2677;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2679) {
                                            class75.method1593(var13, var14, var10.field2665, var10.field2666, var103);
                                        } else {
                                            class75.method1595(var13, var14, var10.field2665, var10.field2666, var103);
                                        }
                                    } else if (var10.field2679) {
                                        class75.method1592(var13, var14, var10.field2665, var10.field2666, var103, 256 - (var15 & 0xFF));
                                    } else {
                                        class75.method1596(var13, var14, var10.field2665, var10.field2666, var103, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2732 == 4) {
                                    class215 var104 = var10.method3102();
                                    if (var104 != null) {
                                        String var105 = var10.field2708;
                                        int var106;
                                        if (method656(var10)) {
                                            var106 = var10.field2683;
                                            if (Statics.field60 == var10 && var10.field2678 != 0) {
                                                var106 = var10.field2678;
                                            }
                                            if (var10.field2709.length() > 0) {
                                                var105 = var10.field2709;
                                            }
                                        } else {
                                            var106 = var10.field2723;
                                            if (Statics.field60 == var10 && var10.field2677 != 0) {
                                                var106 = var10.field2677;
                                            }
                                        }
                                        if (var10.field2649 && var10.field2768 != -1) {
                                            class47 var107 = class47.method3569(var10.field2768);
                                            var105 = var107.field1077;
                                            if (var105 == null) {
                                                var105 = "null";
                                            }
                                            if ((var107.field1084 == 1 || var10.field2769 != 1) && var10.field2769 != -1) {
                                                var105 = class2.method155(16748608) + var105 + class2.field26 + " " + 'x' + method84(var10.field2769);
                                            }
                                        }
                                        if (field316 == var10) {
                                            class148 var10000 = (class148) null;
                                            var105 = class148.field2363;
                                            var106 = var10.field2723;
                                        }
                                        if (!var10.field2649) {
                                            var105 = method29(var105, var10);
                                        }
                                        var104.method3663(var105, var13, var14, var10.field2665, var10.field2666, var106, var10.field2753 ? 0 : -1, var10.field2711, var10.field2712, var10.field2710);
                                    } else if (class164.field2648) {
                                        method2625(var10);
                                    }
                                } else if (var10.field2732 == 5) {
                                    if (var10.field2649) {
                                        class74 var109;
                                        if (var10.field2768 == -1) {
                                            var109 = var10.method3101(false);
                                        } else {
                                            var109 = class47.method136(var10.field2768, var10.field2769, var10.field2687, var10.field2688, var10.field2706, false);
                                        }
                                        if (var109 != null) {
                                            int var110 = var109.field1340;
                                            int var111 = var109.field1335;
                                            if (var10.field2686) {
                                                class75.method1585(var13, var14, var10.field2665 + var13, var10.field2666 + var14);
                                                int var112 = (var10.field2665 + (var110 - 1)) / var110;
                                                int var113 = (var10.field2666 + (var111 - 1)) / var111;
                                                for (int var114 = 0; var114 < var112; var114++) {
                                                    for (int var115 = 0; var115 < var113; var115++) {
                                                        if (var10.field2685 != 0) {
                                                            var109.method1570(var110 / 2 + var110 * var114 + var13, var111 / 2 + var111 * var115 + var14, var10.field2685, 4096);
                                                        } else if (var15 == 0) {
                                                            var109.method1516(var110 * var114 + var13, var111 * var115 + var14);
                                                        } else {
                                                            var109.method1581(var110 * var114 + var13, var111 * var115 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class75.method1620(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var116 = var10.field2665 * 4096 / var110;
                                                if (var10.field2685 != 0) {
                                                    var109.method1570(var10.field2665 / 2 + var13, var10.field2666 / 2 + var14, var10.field2685, var116);
                                                } else if (var15 != 0) {
                                                    var109.method1518(var13, var14, var10.field2665, var10.field2666, 256 - (var15 & 0xFF));
                                                } else if (var10.field2665 == var110 && var10.field2666 == var111) {
                                                    var109.method1516(var13, var14);
                                                } else {
                                                    var109.method1545(var13, var14, var10.field2665, var10.field2666);
                                                }
                                            }
                                        } else if (class164.field2648) {
                                            method2625(var10);
                                        }
                                    } else {
                                        class74 var108 = var10.method3101(method656(var10));
                                        if (var108 != null) {
                                            var108.method1516(var13, var14);
                                        } else if (class164.field2648) {
                                            method2625(var10);
                                        }
                                    }
                                } else if (var10.field2732 == 6) {
                                    boolean var117 = method656(var10);
                                    int var118;
                                    if (var117) {
                                        var118 = var10.field2661;
                                    } else {
                                        var118 = var10.field2695;
                                    }
                                    class100 var119 = null;
                                    int var120 = 0;
                                    if (var10.field2768 != -1) {
                                        class47 var121 = class47.method3569(var10.field2768);
                                        if (var121 != null) {
                                            class47 var122 = var121.method902(var10.field2769);
                                            var119 = var122.method901(1);
                                            if (var119 == null) {
                                                method2625(var10);
                                            } else {
                                                var119.method2072();
                                                var120 = var119.field1388 / 2;
                                            }
                                        }
                                    } else if (var10.field2691 == 5) {
                                        if (var10.field2692 == 0) {
                                            var119 = field516.method3215((class40) null, -1, (class40) null, -1);
                                        } else {
                                            var119 = Statics.field1710.method25();
                                        }
                                    } else if (var118 == -1) {
                                        var119 = var10.method3129((class40) null, -1, var117, Statics.field1710.field30);
                                        if (var119 == null && class164.field2648) {
                                            method2625(var10);
                                        }
                                    } else {
                                        class40 var123 = class40.method3092(var118);
                                        var119 = var10.method3129(var123, var10.field2770, var117, Statics.field1710.field30);
                                        if (var119 == null && class164.field2648) {
                                            method2625(var10);
                                        }
                                    }
                                    class86.method1876(var10.field2665 / 2 + var13, var10.field2666 / 2 + var14);
                                    int var124 = var10.field2702 * class86.field1515[var10.field2776] >> 16;
                                    int var125 = var10.field2702 * class86.field1516[var10.field2776] >> 16;
                                    if (var119 != null) {
                                        if (var10.field2649) {
                                            var119.method2072();
                                            if (var10.field2774) {
                                                var119.method2085(0, var10.field2696, var10.field2701, var10.field2776, var10.field2697, var10.field2747 + var120 + var124, var10.field2747 + var125, var10.field2702);
                                            } else {
                                                var119.method2084(0, var10.field2696, var10.field2701, var10.field2776, var10.field2697, var10.field2747 + var120 + var124, var10.field2747 + var125);
                                            }
                                        } else {
                                            var119.method2084(0, var10.field2696, 0, var10.field2776, 0, var124, var125);
                                        }
                                    }
                                    class86.method1875();
                                } else {
                                    if (var10.field2732 == 7) {
                                        class215 var126 = var10.method3102();
                                        if (var126 == null) {
                                            if (class164.field2648) {
                                                method2625(var10);
                                            }
                                            continue;
                                        }
                                        int var127 = 0;
                                        for (int var128 = 0; var128 < var10.field2744; var128++) {
                                            for (int var129 = 0; var129 < var10.field2777; var129++) {
                                                if (var10.field2652[var127] > 0) {
                                                    class47 var130 = class47.method3569(var10.field2652[var127] - 1);
                                                    String var131;
                                                    if (var130.field1084 != 1 && var10.field2767[var127] == 1) {
                                                        var131 = class2.method155(16748608) + var130.field1077 + class2.field26;
                                                    } else {
                                                        var131 = class2.method155(16748608) + var130.field1077 + class2.field26 + " " + 'x' + method84(var10.field2767[var127]);
                                                    }
                                                    int var132 = (var10.field2737 + 115) * var129 + var13;
                                                    int var133 = (var10.field2715 + 12) * var128 + var14;
                                                    if (var10.field2711 == 0) {
                                                        var126.method3660(var131, var132, var133, var10.field2723, var10.field2753 ? 0 : -1);
                                                    } else if (var10.field2711 == 1) {
                                                        var126.method3662(var131, var10.field2665 / 2 + var132, var133, var10.field2723, var10.field2753 ? 0 : -1);
                                                    } else {
                                                        var126.method3661(var131, var10.field2665 + var132 - 1, var133, var10.field2723, var10.field2753 ? 0 : -1);
                                                    }
                                                }
                                                var127++;
                                            }
                                        }
                                    }
                                    if (var10.field2732 == 8 && Statics.field161 == var10 && field393 == field392) {
                                        int var134 = 0;
                                        int var135 = 0;
                                        class215 var136 = Statics.field1026;
                                        String var137 = var10.field2708;
                                        String var138 = method29(var137, var10);
                                        while (var138.length() > 0) {
                                            int var139 = var138.indexOf(class2.field25);
                                            String var140;
                                            if (var139 == -1) {
                                                var140 = var138;
                                                var138 = "";
                                            } else {
                                                var140 = var138.substring(0, var139);
                                                var138 = var138.substring(var139 + 4);
                                            }
                                            int var141 = var136.method3655(var140);
                                            if (var141 > var134) {
                                                var134 = var141;
                                            }
                                            var135 += var136.field3085 + 1;
                                        }
                                        var134 += 6;
                                        var135 += 7;
                                        int var142 = var10.field2665 + var13 - 5 - var134;
                                        int var143 = var10.field2666 + var14 + 5;
                                        if (var142 < var13 + 5) {
                                            var142 = var13 + 5;
                                        }
                                        if (var134 + var142 > arg4) {
                                            var142 = arg4 - var134;
                                        }
                                        if (var135 + var143 > arg5) {
                                            var143 = arg5 - var135;
                                        }
                                        class75.method1593(var142, var143, var134, var135, 16777120);
                                        class75.method1595(var142, var143, var134, var135, 0);
                                        String var144 = var10.field2708;
                                        int var145 = var136.field3085 + var143 + 2;
                                        String var146 = method29(var144, var10);
                                        while (var146.length() > 0) {
                                            int var147 = var146.indexOf(class2.field25);
                                            String var148;
                                            if (var147 == -1) {
                                                var148 = var146;
                                                var146 = "";
                                            } else {
                                                var148 = var146.substring(0, var147);
                                                var146 = var146.substring(var147 + 4);
                                            }
                                            var136.method3660(var148, var142 + 3, var145, 0, -1);
                                            var145 += var136.field3085 + 1;
                                        }
                                    }
                                    if (var10.field2732 == 9) {
                                        if (var10.field2760 == 1) {
                                            int var149;
                                            int var150;
                                            int var151;
                                            int var152;
                                            if (var10.field2682) {
                                                var149 = var13;
                                                var150 = var10.field2666 + var14;
                                                var151 = var10.field2665 + var13;
                                                var152 = var14;
                                            } else {
                                                var149 = var13;
                                                var150 = var14;
                                                var151 = var10.field2665 + var13;
                                                var152 = var10.field2666 + var14;
                                            }
                                            class75.method1601(var149, var150, var151, var152, var10.field2723);
                                        } else {
                                            int var153 = var10.field2665 >= 0 ? var10.field2665 : -var10.field2665;
                                            int var154 = var10.field2666 >= 0 ? var10.field2666 : -var10.field2666;
                                            int var155 = var153;
                                            if (var153 < var154) {
                                                var155 = var154;
                                            }
                                            if (var155 != 0) {
                                                int var156 = (var10.field2665 << 16) / var155;
                                                int var157 = (var10.field2666 << 16) / var155;
                                                if (var157 <= var156) {
                                                    var156 = -var156;
                                                } else {
                                                    var157 = -var157;
                                                }
                                                int var158 = var10.field2760 * var157 >> 17;
                                                int var159 = var10.field2760 * var157 + 1 >> 17;
                                                int var160 = var10.field2760 * var156 >> 17;
                                                int var161 = var10.field2760 * var156 + 1 >> 17;
                                                int var162 = var13 + var158;
                                                int var163 = var13 - var159;
                                                int var164 = var10.field2665 + var13 - var159;
                                                int var165 = var10.field2665 + var13 + var158;
                                                int var166 = var14 + var160;
                                                int var167 = var14 - var161;
                                                int var168 = var10.field2666 + var14 - var161;
                                                int var169 = var10.field2666 + var14 + var160;
                                                class86.method1881(var162, var163, var164);
                                                class86.method1884(var166, var167, var168, var162, var163, var164, var10.field2723);
                                                class86.method1881(var162, var164, var165);
                                                class86.method1884(var166, var168, var169, var162, var164, var165, var10.field2723);
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

    @ObfuscatedName("y.cm(Ljava/lang/String;Lfy;B)Ljava/lang/String;")
    public static String method29(String arg0, class164 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method156(arg1, var2 - 1);
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
                if (Statics.field267 != null) {
                    var8 = class154.method641(Statics.field267.field2120);
                    if (Statics.field267.field2114 != null) {
                        var8 = (String) Statics.field267.field2114;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("f.cd(II)Ljava/lang/String;")
    public static final String method84(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field24 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method155(65408) + var1.substring(0, var1.length() - 8) + class148.field2366 + " " + class2.field22 + var1 + class2.field20 + class2.field26;
        } else if (var1.length() > 6) {
            return " " + class2.method155(16777215) + var1.substring(0, var1.length() - 4) + class148.field2368 + " " + class2.field22 + var1 + class2.field20 + class2.field26;
        } else {
            return " " + class2.method155(16776960) + var1 + class2.field26;
        }
    }

    @ObfuscatedName("az.ci(ZI)V")
    public static final void method707(boolean arg0) {
        int var1 = field401;
        int var2 = Statics.field1461;
        int var3 = Statics.field118;
        if (class164.method3404(var1)) {
            method524(Statics.field2653[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("dd.cp(Lfy;I)V")
    public static void method2554(class164 arg0) {
        class164 var1 = arg0.field2669 == -1 ? null : Statics.method2717(arg0.field2669);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1461;
            var3 = Statics.field118;
        } else {
            var2 = var1.field2665;
            var3 = var1.field2666;
        }
        method677(arg0, var2, var3, false);
        method2875(arg0, var2, var3);
    }

    @ObfuscatedName("bk.cg([Lfy;Lfy;ZI)V")
    public static void method1484(class164[] arg0, class164 arg1, boolean arg2) {
        int var3 = arg1.field2673 == 0 ? arg1.field2665 : arg1.field2673;
        int var4 = arg1.field2674 == 0 ? arg1.field2666 : arg1.field2674;
        method524(arg0, arg1.field2651, var3, var4, arg2);
        if (arg1.field2775 != null) {
            method524(arg1.field2775, arg1.field2651, var3, var4, arg2);
        }
        class4 var5 = (class4) field402.method3445((long) arg1.field2651);
        if (var5 != null) {
            int var6 = var5.field58;
            if (class164.method3404(var6)) {
                method524(Statics.field2653[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2654 == 1337) {
        }
    }

    @ObfuscatedName("c.cr([Lfy;IIIZB)V")
    public static void method524(class164[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class164 var6 = arg0[var5];
            if (var6 != null && var6.field2669 == arg1) {
                method677(var6, arg2, arg3, arg4);
                method2875(var6, arg2, arg3);
                if (var6.field2671 > var6.field2673 - var6.field2665) {
                    var6.field2671 = var6.field2673 - var6.field2665;
                }
                if (var6.field2671 < 0) {
                    var6.field2671 = 0;
                }
                if (var6.field2672 > var6.field2674 - var6.field2666) {
                    var6.field2672 = var6.field2674 - var6.field2666;
                }
                if (var6.field2672 < 0) {
                    var6.field2672 = 0;
                }
                if (var6.field2732 == 0) {
                    method1484(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ac.ck(Lfy;IIZI)V")
    public static void method677(class164 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2665;
        int var5 = arg0.field2666;
        if (arg0.field2657 == 0) {
            arg0.field2665 = arg0.field2777;
        } else if (arg0.field2657 == 1) {
            arg0.field2665 = arg1 - arg0.field2777;
        } else if (arg0.field2657 == 2) {
            arg0.field2665 = arg0.field2777 * arg1 >> 14;
        }
        if (arg0.field2728 == 0) {
            arg0.field2666 = arg0.field2744;
        } else if (arg0.field2728 == 1) {
            arg0.field2666 = arg2 - arg0.field2744;
        } else if (arg0.field2728 == 2) {
            arg0.field2666 = arg0.field2744 * arg2 >> 14;
        }
        if (arg0.field2657 == 4) {
            arg0.field2665 = arg0.field2666 * arg0.field2662 / arg0.field2751;
        }
        if (arg0.field2728 == 4) {
            arg0.field2666 = arg0.field2751 * arg0.field2665 / arg0.field2662;
        }
        if (field411 && arg0.field2732 == 0) {
            if (arg0.field2666 < 5 && arg0.field2665 < 5) {
                arg0.field2666 = 5;
                arg0.field2665 = 5;
            } else {
                if (arg0.field2666 <= 0) {
                    arg0.field2666 = 5;
                }
                if (arg0.field2665 <= 0) {
                    arg0.field2665 = 5;
                }
            }
        }
        if (arg0.field2654 == 1337) {
            field423 = arg0;
        }
        if (arg3 && arg0.field2757 != null && (arg0.field2665 != var4 || arg0.field2666 != var5)) {
            class1 var6 = new class1();
            var6.field1 = arg0;
            var6.field2 = arg0.field2757;
            field442.method3477(var6);
        }
    }

    @ObfuscatedName("ep.cl(Lfy;III)V")
    public static void method2875(class164 arg0, int arg1, int arg2) {
        if (arg0.field2655 == 0) {
            arg0.field2663 = arg0.field2713;
        } else if (arg0.field2655 == 1) {
            arg0.field2663 = (arg1 - arg0.field2665) / 2 + arg0.field2713;
        } else if (arg0.field2655 == 2) {
            arg0.field2663 = arg1 - arg0.field2665 - arg0.field2713;
        } else if (arg0.field2655 == 3) {
            arg0.field2663 = arg0.field2713 * arg1 >> 14;
        } else if (arg0.field2655 == 4) {
            arg0.field2663 = (arg0.field2713 * arg1 >> 14) + (arg1 - arg0.field2665) / 2;
        } else {
            arg0.field2663 = arg1 - arg0.field2665 - (arg0.field2713 * arg1 >> 14);
        }
        if (arg0.field2656 == 0) {
            arg0.field2664 = arg0.field2660;
        } else if (arg0.field2656 == 1) {
            arg0.field2664 = (arg2 - arg0.field2666) / 2 + arg0.field2660;
        } else if (arg0.field2656 == 2) {
            arg0.field2664 = arg2 - arg0.field2666 - arg0.field2660;
        } else if (arg0.field2656 == 3) {
            arg0.field2664 = arg0.field2660 * arg2 >> 14;
        } else if (arg0.field2656 == 4) {
            arg0.field2664 = (arg0.field2660 * arg2 >> 14) + (arg2 - arg0.field2666) / 2;
        } else {
            arg0.field2664 = arg2 - arg0.field2666 - (arg0.field2660 * arg2 >> 14);
        }
        if (!field411 || arg0.field2732 != 0) {
            return;
        }
        if (arg0.field2663 < 0) {
            arg0.field2663 = 0;
        } else if (arg0.field2665 + arg0.field2663 > arg1) {
            arg0.field2663 = arg1 - arg0.field2665;
        }
        if (arg0.field2664 < 0) {
            arg0.field2664 = 0;
        } else if (arg0.field2666 + arg0.field2664 > arg2) {
            arg0.field2664 = arg2 - arg0.field2666;
        }
    }

    @ObfuscatedName("aq.cs(Lfy;IIIIIIB)V")
    public static final void method869(class164 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field321) {
            field383 = 32;
        } else {
            field383 = 0;
        }
        field321 = false;
        if (class132.field2060 == 1 || !Statics.field699 && class132.field2060 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2672 -= 4;
                method2625(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2672 += 4;
                method2625(arg0);
            } else if (arg5 >= arg1 - field383 && arg5 < field383 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2672 = (arg4 - arg3) * var8 / var9;
                method2625(arg0);
                field321 = true;
            }
        }
        if (field441 == 0) {
            return;
        }
        int var10 = arg0.field2665;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2672 += field441 * 45;
            method2625(arg0);
        }
    }

    @ObfuscatedName("ab.dt(Lfy;I)Z")
    public static final boolean method656(class164 arg0) {
        if (arg0.field2761 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2761.length; var1++) {
            int var2 = method156(arg0, var1);
            int var3 = arg0.field2762[var1];
            if (arg0.field2761[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2761[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2761[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("j.dj(Lfy;II)I")
    public static final int method156(class164 arg0, int arg1) {
        if (arg0.field2727 == null || arg1 >= arg0.field2727.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2727[arg1];
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
                    var7 = field378[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field379[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field380[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class164 var11 = Statics.method2717(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class47.method3569(var12).field1072 || field244)) {
                        for (int var13 = 0; var13 < var11.field2652.length; var13++) {
                            if (var12 + 1 == var11.field2652[var13]) {
                                var7 += var11.field2767[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class167.field2801[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class146.field2189[field379[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class167.field2801[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1710.field33;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class146.field2188[var14]) {
                            var7 += field379[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class164 var17 = Statics.method2717(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class47.method3569(var18).field1072 || field244)) {
                        for (int var19 = 0; var19 < var17.field2652.length; var19++) {
                            if (var18 + 1 == var17.field2652[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field406;
                }
                if (var6 == 12) {
                    var7 = field376;
                }
                if (var6 == 13) {
                    int var20 = class167.field2801[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class167.method175(var22);
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
                    var7 = (Statics.field1710.field809 >> 7) + Statics.field178;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1710.field749 >> 7) + Statics.field3035;
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

    @ObfuscatedName("dd.dg(Lfy;IIB)V")
    public static final void method2557(class164 arg0, int arg1, int arg2) {
        if (arg0.field2766 == 1) {
            method2537(arg0.field2765, "", 24, 0, 0, arg0.field2651);
        }
        if (arg0.field2766 == 2 && !field444) {
            String var3 = method1384(arg0);
            if (var3 != null) {
                method2537(var3, class2.method155(65280) + arg0.field2764, 25, 0, -1, arg0.field2651);
            }
        }
        if (arg0.field2766 == 3) {
            method2537(class148.field2321, "", 26, 0, 0, arg0.field2651);
        }
        if (arg0.field2766 == 4) {
            method2537(arg0.field2765, "", 28, 0, 0, arg0.field2651);
        }
        if (arg0.field2766 == 5) {
            method2537(arg0.field2765, "", 29, 0, 0, arg0.field2651);
        }
        if (arg0.field2766 == 6 && field316 == null) {
            method2537(arg0.field2765, "", 30, 0, -1, arg0.field2651);
        }
        if (arg0.field2732 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2666; var5++) {
                for (int var6 = 0; var6 < arg0.field2665; var6++) {
                    int var7 = (arg0.field2737 + 32) * var6;
                    int var8 = (arg0.field2715 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2716[var4];
                        var8 += arg0.field2717[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field498 = var4;
                        Statics.field2805 = arg0;
                        if (arg0.field2652[var4] > 0) {
                            class47 var9 = class47.method3569(arg0.field2652[var4] - 1);
                            if (field469 == 1 && class169.method1486(method2562(arg0))) {
                                if (Statics.field2146 != arg0.field2651 || Statics.field1312 != var4) {
                                    method2537(class148.field2355, field395 + " " + class2.field23 + " " + class2.method155(16748608) + var9.field1077, 31, var9.field1048, var4, arg0.field2651);
                                }
                            } else if (!field444 || !class169.method1486(method2562(arg0))) {
                                String[] var10 = var9.field1065;
                                if (field412) {
                                    var10 = method2887(var10);
                                }
                                if (class169.method1486(method2562(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            method2537(var10[var11], class2.method155(16748608) + var9.field1077, var12, var9.field1048, var4, arg0.field2651);
                                        } else if (var11 == 4) {
                                            method2537(class148.field2206, class2.method155(16748608) + var9.field1077, 37, var9.field1048, var4, arg0.field2651);
                                        }
                                    }
                                }
                                if (class169.method2518(method2562(arg0))) {
                                    method2537(class148.field2355, class2.method155(16748608) + var9.field1077, 38, var9.field1048, var4, arg0.field2651);
                                }
                                if (class169.method1486(method2562(arg0)) && var10 != null) {
                                    for (int var13 = 2; var13 >= 0; var13--) {
                                        if (var10[var13] != null) {
                                            byte var14 = 0;
                                            if (var13 == 0) {
                                                var14 = 33;
                                            }
                                            if (var13 == 1) {
                                                var14 = 34;
                                            }
                                            if (var13 == 2) {
                                                var14 = 35;
                                            }
                                            method2537(var10[var13], class2.method155(16748608) + var9.field1077, var14, var9.field1048, var4, arg0.field2651);
                                        }
                                    }
                                }
                                String[] var15 = arg0.field2658;
                                if (field412) {
                                    var15 = method2887(var15);
                                }
                                if (var15 != null) {
                                    for (int var16 = 4; var16 >= 0; var16--) {
                                        if (var15[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 39;
                                            }
                                            if (var16 == 1) {
                                                var17 = 40;
                                            }
                                            if (var16 == 2) {
                                                var17 = 41;
                                            }
                                            if (var16 == 3) {
                                                var17 = 42;
                                            }
                                            if (var16 == 4) {
                                                var17 = 43;
                                            }
                                            method2537(var15[var16], class2.method155(16748608) + var9.field1077, var17, var9.field1048, var4, arg0.field2651);
                                        }
                                    }
                                }
                                method2537(class148.field2356, class2.method155(16748608) + var9.field1077, 1005, var9.field1048, var4, arg0.field2651);
                            } else if ((Statics.field2052 & 0x10) == 16) {
                                method2537(field399, field400 + " " + class2.field23 + " " + class2.method155(16748608) + var9.field1077, 32, var9.field1048, var4, arg0.field2651);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2649) {
            return;
        }
        if (field444) {
            int var18 = method2562(arg0);
            boolean var19 = (var18 >> 21 & 0x1) != 0;
            if (var19 && (Statics.field2052 & 0x20) == 32) {
                method2537(field399, field400 + " " + class2.field23 + " " + arg0.field2721, 58, 0, arg0.field2650, arg0.field2651);
            }
            return;
        }
        for (int var20 = 9; var20 >= 5; var20--) {
            String var21 = method153(arg0, var20);
            if (var21 != null) {
                method2537(var21, arg0.field2721, 1007, var20 + 1, arg0.field2650, arg0.field2651);
            }
        }
        String var22 = method1384(arg0);
        if (var22 != null) {
            method2537(var22, arg0.field2721, 25, 0, arg0.field2650, arg0.field2651);
        }
        for (int var23 = 4; var23 >= 0; var23--) {
            String var24 = method153(arg0, var23);
            if (var24 != null) {
                method2537(var24, arg0.field2721, 57, var23 + 1, arg0.field2650, arg0.field2651);
            }
        }
        if (class169.method3093(method2562(arg0))) {
            method2537(class148.field2401, "", 30, 0, arg0.field2650, arg0.field2651);
        }
    }

    @ObfuscatedName("cc.do(IIIIIIII)V")
    public static final void method1957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class164.method3404(arg0)) {
            method166(Statics.field2653[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("j.dy([Lfy;IIIIIIII)V")
    public static final void method166(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class164 var9 = arg0[var8];
            if (var9 != null && (!var9.field2649 || var9.field2732 == 0 || var9.field2758 || method2562(var9) != 0 || field415 == var9 || var9.field2654 == 1338) && var9.field2669 == arg1 && (!var9.field2649 || !method3036(var9))) {
                int var10 = var9.field2663 + arg6;
                int var11 = var9.field2664 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2732 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2732 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2665 + var10;
                    int var19 = var9.field2666 + var11;
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
                    int var22 = var9.field2665 + var10;
                    int var23 = var9.field2666 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field355 == var9) {
                    field422 = true;
                    field388 = var10;
                    field288 = var11;
                }
                if (!var9.field2649 || var12 < var14 && var13 < var15) {
                    int var24 = class132.field2061;
                    int var25 = class132.field2062 * 130670055;
                    if (class132.field2067 != 0) {
                        var24 = class132.field2069;
                        var25 = class132.field2063;
                    }
                    if (var9.field2654 == 1337) {
                        if (!field301 && !field382 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field469 == 0 && !field444) {
                                method2537(class148.field2360, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class100.field1793; var28++) {
                                int var29 = class100.field1783[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field656.method1825(Statics.field2136, var30, var31, var29) >= 0) {
                                        class38 var34 = class38.method1667(var33);
                                        if (var34.field902 != null) {
                                            var34 = var34.method731();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field469 == 1) {
                                            method2537(class148.field2355, field395 + " " + class2.field23 + " " + class2.method155(65535) + var34.field871, 1, var29, var30, var31);
                                        } else if (!field444) {
                                            String[] var35 = var34.field863;
                                            if (field412) {
                                                var35 = method2887(var35);
                                            }
                                            if (var35 != null) {
                                                for (int var36 = 4; var36 >= 0; var36--) {
                                                    if (var35[var36] != null) {
                                                        short var37 = 0;
                                                        if (var36 == 0) {
                                                            var37 = 3;
                                                        }
                                                        if (var36 == 1) {
                                                            var37 = 4;
                                                        }
                                                        if (var36 == 2) {
                                                            var37 = 5;
                                                        }
                                                        if (var36 == 3) {
                                                            var37 = 6;
                                                        }
                                                        if (var36 == 4) {
                                                            var37 = 1001;
                                                        }
                                                        method2537(var35[var36], class2.method155(65535) + var34.field871, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method2537(class148.field2356, class2.method155(65535) + var34.field871, 1002, var34.field868 << 14, var30, var31);
                                        } else if ((Statics.field2052 & 0x4) == 4) {
                                            method2537(field399, field400 + " " + class2.field23 + " " + class2.method155(65535) + var34.field871, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class32 var38 = field277[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field713.field826 == 1 && (var38.field809 & 0x7F) == 64 && (var38.field749 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field278; var39++) {
                                                class32 var40 = field277[field448[var39]];
                                                if (var40 != null && var38 != var40 && var40.field713.field826 == 1 && var38.field809 == var40.field809 && var38.field749 == var40.field749) {
                                                    method2855(var40.field713, field448[var39], var30, var31);
                                                }
                                            }
                                            for (int var41 = 0; var41 < field360; var41++) {
                                                class3 var42 = field359[field407[var41]];
                                                if (var42 != null && var38.field809 == var42.field809 && var38.field749 == var42.field749) {
                                                    method2684(var42, field407[var41], var30, var31);
                                                }
                                            }
                                        }
                                        method2855(var38.field713, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var43 = field359[var33];
                                        if (var43 == null) {
                                            continue;
                                        }
                                        if ((var43.field809 & 0x7F) == 64 && (var43.field749 & 0x7F) == 64) {
                                            for (int var44 = 0; var44 < field278; var44++) {
                                                class32 var45 = field277[field448[var44]];
                                                if (var45 != null && var45.field713.field826 == 1 && var43.field809 == var45.field809 && var43.field749 == var45.field749) {
                                                    method2855(var45.field713, field448[var44], var30, var31);
                                                }
                                            }
                                            for (int var46 = 0; var46 < field360; var46++) {
                                                class3 var47 = field359[field407[var46]];
                                                if (var47 != null && var43 != var47 && var43.field809 == var47.field809 && var43.field749 == var47.field749) {
                                                    method2684(var47, field407[var46], var30, var31);
                                                }
                                            }
                                        }
                                        if (field373 == var33) {
                                            var26 = var29;
                                        } else {
                                            method2684(var43, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class190 var48 = field394[Statics.field2136][var30][var31];
                                        if (var48 != null) {
                                            for (class27 var49 = (class27) var48.method3482(); var49 != null; var49 = (class27) var48.method3484()) {
                                                class47 var50 = class47.method3569(var49.field630);
                                                if (field469 == 1) {
                                                    method2537(class148.field2355, field395 + " " + class2.field23 + " " + class2.method155(16748608) + var50.field1077, 16, var49.field630, var30, var31);
                                                } else if (!field444) {
                                                    String[] var51 = var50.field1043;
                                                    if (field412) {
                                                        var51 = method2887(var51);
                                                    }
                                                    for (int var52 = 4; var52 >= 0; var52--) {
                                                        if (var51 != null && var51[var52] != null) {
                                                            byte var53 = 0;
                                                            if (var52 == 0) {
                                                                var53 = 18;
                                                            }
                                                            if (var52 == 1) {
                                                                var53 = 19;
                                                            }
                                                            if (var52 == 2) {
                                                                var53 = 20;
                                                            }
                                                            if (var52 == 3) {
                                                                var53 = 21;
                                                            }
                                                            if (var52 == 4) {
                                                                var53 = 22;
                                                            }
                                                            method2537(var51[var52], class2.method155(16748608) + var50.field1077, var53, var49.field630, var30, var31);
                                                        } else if (var52 == 2) {
                                                            method2537(class148.field2453, class2.method155(16748608) + var50.field1077, 20, var49.field630, var30, var31);
                                                        }
                                                    }
                                                    method2537(class148.field2356, class2.method155(16748608) + var50.field1077, 1004, var49.field630, var30, var31);
                                                } else if ((Statics.field2052 & 0x1) == 1) {
                                                    method2537(field399, field400 + " " + class2.field23 + " " + class2.method155(16748608) + var50.field1077, 17, var49.field630, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var54 = var26 & 0x7F;
                                int var55 = var26 >> 7 & 0x7F;
                                class3 var56 = field359[field373];
                                method2684(var56, field373, var54, var55);
                            }
                        }
                    } else if (var9.field2654 == 1338) {
                        method2521(var9, var10, var11);
                    } else {
                        if (!field382 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2557(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2732 == 0) {
                            if (!var9.field2649 && method3036(var9) && Statics.field60 != var9) {
                                continue;
                            }
                            method166(arg0, var9.field2651, var12, var13, var14, var15, var10 - var9.field2671, var11 - var9.field2672);
                            if (var9.field2775 != null) {
                                method166(var9.field2775, var9.field2651, var12, var13, var14, var15, var10 - var9.field2671, var11 - var9.field2672);
                            }
                            class4 var57 = (class4) field402.method3445((long) var9.field2651);
                            if (var57 != null) {
                                if (var57.field51 == 0 && class132.field2061 >= var12 && class132.field2062 * 130670055 >= var13 && class132.field2061 < var14 && class132.field2062 * 130670055 < var15 && !field382 && !field411) {
                                    field245[0] = class148.field2441;
                                    field396[0] = "";
                                    field386[0] = 1006;
                                    field317 = 1;
                                }
                                method1957(var57.field58, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2649) {
                            if (var9.field2726 && class132.field2061 >= var12 && class132.field2062 * 130670055 >= var13 && class132.field2061 < var14 && class132.field2062 * 130670055 < var15) {
                                for (class1 var58 = (class1) field442.method3497(); var58 != null; var58 = (class1) field442.method3475()) {
                                    if (var58.field18) {
                                        var58.method3562();
                                        var58.field1.field2659 = false;
                                    }
                                }
                                if (Statics.field1590 == 0) {
                                    field355 = null;
                                    field415 = null;
                                }
                                if (!field382) {
                                    field245[0] = class148.field2441;
                                    field396[0] = "";
                                    field386[0] = 1006;
                                    field317 = 1;
                                }
                            }
                            boolean var59;
                            if (class132.field2061 >= var12 && class132.field2062 * 130670055 >= var13 && class132.field2061 < var14 && class132.field2062 * 130670055 < var15) {
                                var59 = true;
                            } else {
                                var59 = false;
                            }
                            boolean var60 = false;
                            if ((class132.field2060 == 1 || !Statics.field699 && class132.field2060 == 4) && var59) {
                                var60 = true;
                            }
                            boolean var61 = false;
                            if ((class132.field2067 == 1 || !Statics.field699 && class132.field2067 == 4) && class132.field2069 >= var12 && class132.field2063 >= var13 && class132.field2069 < var14 && class132.field2063 < var15) {
                                var61 = true;
                            }
                            if (var61) {
                                method2942(var9, class132.field2069 - var10, class132.field2063 - var11);
                            }
                            if (field355 != null && field355 != var9 && var59 && class169.method1868(method2562(var9))) {
                                field381 = var9;
                            }
                            if (field415 == var9) {
                                field320 = true;
                                field492 = var10;
                                field440 = var11;
                            }
                            if (var9.field2758) {
                                if (var59 && field441 != 0 && var9.field2719 != null) {
                                    class1 var62 = new class1();
                                    var62.field18 = true;
                                    var62.field1 = var9;
                                    var62.field5 = field441;
                                    var62.field2 = var9.field2719;
                                    field442.method3477(var62);
                                }
                                if (field355 != null || Statics.field139 != null || field382) {
                                    var61 = false;
                                    var60 = false;
                                    var59 = false;
                                }
                                if (!var9.field2703 && var61) {
                                    var9.field2703 = true;
                                    if (var9.field2730 != null) {
                                        class1 var63 = new class1();
                                        var63.field18 = true;
                                        var63.field1 = var9;
                                        var63.field7 = class132.field2069 - var10;
                                        var63.field5 = class132.field2063 - var11;
                                        var63.field2 = var9.field2730;
                                        field442.method3477(var63);
                                    }
                                }
                                if (var9.field2703 && var60 && var9.field2731 != null) {
                                    class1 var64 = new class1();
                                    var64.field18 = true;
                                    var64.field1 = var9;
                                    var64.field7 = class132.field2061 - var10;
                                    var64.field5 = class132.field2062 * 130670055 - var11;
                                    var64.field2 = var9.field2731;
                                    field442.method3477(var64);
                                }
                                if (var9.field2703 && !var60) {
                                    var9.field2703 = false;
                                    if (var9.field2698 != null) {
                                        class1 var65 = new class1();
                                        var65.field18 = true;
                                        var65.field1 = var9;
                                        var65.field7 = class132.field2061 - var10;
                                        var65.field5 = class132.field2062 * 130670055 - var11;
                                        var65.field2 = var9.field2698;
                                        field361.method3477(var65);
                                    }
                                }
                                if (var60 && var9.field2733 != null) {
                                    class1 var66 = new class1();
                                    var66.field18 = true;
                                    var66.field1 = var9;
                                    var66.field7 = class132.field2061 - var10;
                                    var66.field5 = class132.field2062 * 130670055 - var11;
                                    var66.field2 = var9.field2733;
                                    field442.method3477(var66);
                                }
                                if (!var9.field2659 && var59) {
                                    var9.field2659 = true;
                                    if (var9.field2780 != null) {
                                        class1 var67 = new class1();
                                        var67.field18 = true;
                                        var67.field1 = var9;
                                        var67.field7 = class132.field2061 - var10;
                                        var67.field5 = class132.field2062 * 130670055 - var11;
                                        var67.field2 = var9.field2780;
                                        field442.method3477(var67);
                                    }
                                }
                                if (var9.field2659 && var59 && var9.field2735 != null) {
                                    class1 var68 = new class1();
                                    var68.field18 = true;
                                    var68.field1 = var9;
                                    var68.field7 = class132.field2061 - var10;
                                    var68.field5 = class132.field2062 * 130670055 - var11;
                                    var68.field2 = var9.field2735;
                                    field442.method3477(var68);
                                }
                                if (var9.field2659 && !var59) {
                                    var9.field2659 = false;
                                    if (var9.field2736 != null) {
                                        class1 var69 = new class1();
                                        var69.field18 = true;
                                        var69.field1 = var9;
                                        var69.field7 = class132.field2061 - var10;
                                        var69.field5 = class132.field2062 * 130670055 - var11;
                                        var69.field2 = var9.field2736;
                                        field361.method3477(var69);
                                    }
                                }
                                if (var9.field2641 != null) {
                                    class1 var70 = new class1();
                                    var70.field1 = var9;
                                    var70.field2 = var9.field2641;
                                    field443.method3477(var70);
                                }
                                if (var9.field2741 != null && field313 > var9.field2742) {
                                    if (var9.field2734 == null || field313 - var9.field2742 > 32) {
                                        class1 var75 = new class1();
                                        var75.field1 = var9;
                                        var75.field2 = var9.field2741;
                                        field442.method3477(var75);
                                    } else {
                                        label750: for (int var71 = var9.field2742; var71 < field313; var71++) {
                                            int var72 = field262[var71 & 0x1F];
                                            for (int var73 = 0; var73 < var9.field2734.length; var73++) {
                                                if (var9.field2734[var73] == var72) {
                                                    class1 var74 = new class1();
                                                    var74.field1 = var9;
                                                    var74.field2 = var9.field2741;
                                                    field442.method3477(var74);
                                                    break label750;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2742 = field313;
                                }
                                if (var9.field2699 != null && field418 > var9.field2781) {
                                    if (var9.field2714 == null || field418 - var9.field2781 > 32) {
                                        class1 var80 = new class1();
                                        var80.field1 = var9;
                                        var80.field2 = var9.field2699;
                                        field442.method3477(var80);
                                    } else {
                                        label726: for (int var76 = var9.field2781; var76 < field418; var76++) {
                                            int var77 = field429[var76 & 0x1F];
                                            for (int var78 = 0; var78 < var9.field2714.length; var78++) {
                                                if (var9.field2714[var78] == var77) {
                                                    class1 var79 = new class1();
                                                    var79.field1 = var9;
                                                    var79.field2 = var9.field2699;
                                                    field442.method3477(var79);
                                                    break label726;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2781 = field418;
                                }
                                if (var9.field2745 != null && field497 > var9.field2668) {
                                    if (var9.field2746 == null || field497 - var9.field2668 > 32) {
                                        class1 var85 = new class1();
                                        var85.field1 = var9;
                                        var85.field2 = var9.field2745;
                                        field442.method3477(var85);
                                    } else {
                                        label702: for (int var81 = var9.field2668; var81 < field497; var81++) {
                                            int var82 = field419[var81 & 0x1F];
                                            for (int var83 = 0; var83 < var9.field2746.length; var83++) {
                                                if (var9.field2746[var83] == var82) {
                                                    class1 var84 = new class1();
                                                    var84.field1 = var9;
                                                    var84.field2 = var9.field2745;
                                                    field442.method3477(var84);
                                                    break label702;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2668 = field497;
                                }
                                if (field433 > var9.field2720 && var9.field2750 != null) {
                                    class1 var86 = new class1();
                                    var86.field1 = var9;
                                    var86.field2 = var9.field2750;
                                    field442.method3477(var86);
                                }
                                if (field434 > var9.field2720 && var9.field2752 != null) {
                                    class1 var87 = new class1();
                                    var87.field1 = var9;
                                    var87.field2 = var9.field2752;
                                    field442.method3477(var87);
                                }
                                if (field435 > var9.field2720 && var9.field2676 != null) {
                                    class1 var88 = new class1();
                                    var88.field1 = var9;
                                    var88.field2 = var9.field2676;
                                    field442.method3477(var88);
                                }
                                if (field436 > var9.field2720 && var9.field2773 != null) {
                                    class1 var89 = new class1();
                                    var89.field1 = var9;
                                    var89.field2 = var9.field2773;
                                    field442.method3477(var89);
                                }
                                if (field334 > var9.field2720 && var9.field2759 != null) {
                                    class1 var90 = new class1();
                                    var90.field1 = var9;
                                    var90.field2 = var9.field2759;
                                    field442.method3477(var90);
                                }
                                if (field438 > var9.field2720 && var9.field2754 != null) {
                                    class1 var91 = new class1();
                                    var91.field1 = var9;
                                    var91.field2 = var9.field2754;
                                    field442.method3477(var91);
                                }
                                var9.field2720 = field404;
                                if (var9.field2700 != null) {
                                    for (int var92 = 0; var92 < field466; var92++) {
                                        class1 var93 = new class1();
                                        var93.field1 = var9;
                                        var93.field8 = field468[var92];
                                        var93.field9 = field467[var92];
                                        var93.field2 = var9.field2700;
                                        field442.method3477(var93);
                                    }
                                }
                            }
                        }
                        if (!var9.field2649 && field355 == null && Statics.field139 == null && !field382) {
                            if ((var9.field2763 >= 0 || var9.field2677 != 0) && class132.field2061 >= var12 && class132.field2062 * 130670055 >= var13 && class132.field2061 < var14 && class132.field2062 * 130670055 < var15) {
                                if (var9.field2763 >= 0) {
                                    Statics.field60 = arg0[var9.field2763];
                                } else {
                                    Statics.field60 = var9;
                                }
                            }
                            if (var9.field2732 == 8 && class132.field2061 >= var12 && class132.field2062 * 130670055 >= var13 && class132.field2061 < var14 && class132.field2062 * 130670055 < var15) {
                                Statics.field161 = var9;
                            }
                            if (var9.field2674 > var9.field2666) {
                                method869(var9, var9.field2665 + var10, var11, var9.field2666, var9.field2674, class132.field2061, class132.field2062 * 130670055);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dg.di([Lfy;II)V")
    public static final void method2165(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2732 == 0) {
                    if (var3.field2775 != null) {
                        method2165(var3.field2775, arg1);
                    }
                    class4 var4 = (class4) field402.method3445((long) var3.field2651);
                    if (var4 != null) {
                        int var5 = var4.field58;
                        if (class164.method3404(var5)) {
                            method2165(Statics.field2653[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2755 != null) {
                    class1 var6 = new class1();
                    var6.field1 = var3;
                    var6.field2 = var3.field2755;
                    class34.method31(var6, 200000);
                }
                if (arg1 == 1 && var3.field2681 != null) {
                    if (var3.field2650 >= 0) {
                        class164 var7 = Statics.method2717(var3.field2651);
                        if (var7 == null || var7.field2775 == null || var3.field2650 >= var7.field2775.length || var7.field2775[var3.field2650] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field1 = var3;
                    var8.field2 = var3.field2681;
                    class34.method31(var8, 200000);
                }
            }
        }
    }

    @ObfuscatedName("fl.dl(Lfy;III)V")
    public static final void method2942(class164 arg0, int arg1, int arg2) {
        if (field355 != null || field382 || arg0 == null || method2874(arg0) == null) {
            return;
        }
        field355 = arg0;
        field415 = method2874(arg0);
        field416 = arg1;
        field417 = arg2;
        Statics.field1590 = 0;
        field425 = false;
        if (field317 > 0) {
            method1862(field317 - 1);
        }
    }

    @ObfuscatedName("ag.dq(B)V")
    public static final void method964() {
        method2625(field355);
        Statics.field1590++;
        if (field422 && field320) {
            int var0 = class132.field2061;
            int var1 = class132.field2062 * 130670055;
            int var2 = var0 - field416;
            int var3 = var1 - field417;
            if (var2 < field492) {
                var2 = field492;
            }
            if (field355.field2665 + var2 > field492 + field415.field2665) {
                var2 = field492 + field415.field2665 - field355.field2665;
            }
            if (var3 < field440) {
                var3 = field440;
            }
            if (field355.field2666 + var3 > field440 + field415.field2666) {
                var3 = field440 + field415.field2666 - field355.field2666;
            }
            int var4 = var2 - field388;
            int var5 = var3 - field288;
            int var6 = field355.field2724;
            if (Statics.field1590 > field355.field2725 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field425 = true;
            }
            int var7 = field415.field2671 + (var2 - field492);
            int var8 = field415.field2672 + (var3 - field440);
            if (field355.field2705 != null && field425) {
                class1 var9 = new class1();
                var9.field1 = field355;
                var9.field7 = var7;
                var9.field5 = var8;
                var9.field2 = field355.field2705;
                class34.method31(var9, 200000);
            }
            if (class132.field2060 == 0) {
                if (field425) {
                    if (field355.field2738 != null) {
                        class1 var10 = new class1();
                        var10.field1 = field355;
                        var10.field7 = var7;
                        var10.field5 = var8;
                        var10.field4 = field381;
                        var10.field2 = field355.field2738;
                        class34.method31(var10, 200000);
                    }
                    if (field381 != null) {
                        class164 var11 = field355;
                        int var12 = method2562(var11);
                        int var13 = var12 >> 17 & 0x7;
                        int var14 = var13;
                        class164 var15;
                        if (var13 == 0) {
                            var15 = null;
                        } else {
                            int var16 = 0;
                            while (true) {
                                if (var16 >= var14) {
                                    var15 = var11;
                                    break;
                                }
                                var11 = Statics.method2717(var11.field2669);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field488.method2480(59);
                            field488.method2262(field381.field2650);
                            field488.method2280(field355.field2650);
                            field488.method2280(field355.field2768);
                            field488.method2260(field355.field2651);
                            field488.method2261(field381.field2768);
                            field488.method2270(field381.field2651);
                        }
                    }
                } else if ((field409 == 1 || Statics.method3064(field317 - 1)) && field317 > 2) {
                    method2836(field416 + field388, field417 + field288);
                } else if (field317 > 0) {
                    Statics.method2175(field416 + field388, field417 + field288);
                }
                field355 = null;
            }
        } else if (Statics.field1590 > 1) {
            field355 = null;
        }
    }

    @ObfuscatedName("cq.dm(IB)V")
    public static void method1862(int arg0) {
        Statics.field155 = new class29();
        Statics.field155.field655 = field384[arg0];
        Statics.field155.field651 = field385[arg0];
        Statics.field155.field652 = field386[arg0];
        Statics.field155.field653 = field387[arg0];
        Statics.field155.field654 = field245[arg0];
    }

    @ObfuscatedName("dx.dn(Lfy;B)V")
    public static void method2625(class164 arg0) {
        if (field447 == arg0.field2749) {
            field389[arg0.field2675] = true;
        }
    }

    @ObfuscatedName("s.df(I)V")
    public static void method172() {
        for (class4 var0 = (class4) field402.method3448(); var0 != null; var0 = (class4) field402.method3449()) {
            int var1 = var0.field58;
            if (class164.method3404(var1)) {
                boolean var2 = true;
                class164[] var3 = Statics.field2653[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2649;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3007;
                    class164 var6 = Statics.method2717(var5);
                    if (var6 != null) {
                        method2625(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ep.dk(Lfy;B)Lfy;")
    public static class164 method2874(class164 arg0) {
        class164 var1 = arg0;
        int var2 = method2562(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class164 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = Statics.method2717(var1.field2669);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class164 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2642;
        }
        return var7;
    }

    @ObfuscatedName("ei.dr([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2887(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("cq.dw([Lfy;II)V")
    public static final void method1858(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null && var3.field2669 == arg1 && (!var3.field2649 || !method3036(var3))) {
                if (var3.field2732 == 0) {
                    if (!var3.field2649 && method3036(var3) && Statics.field60 != var3) {
                        continue;
                    }
                    method1858(arg0, var3.field2651);
                    if (var3.field2775 != null) {
                        method1858(var3.field2775, var3.field2651);
                    }
                    class4 var4 = (class4) field402.method3445((long) var3.field2651);
                    if (var4 != null) {
                        int var5 = var4.field58;
                        if (class164.method3404(var5)) {
                            method1858(Statics.field2653[var5], -1);
                        }
                    }
                }
                if (var3.field2732 == 6) {
                    if (var3.field2695 != -1 || var3.field2661 != -1) {
                        boolean var6 = method656(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2661;
                        } else {
                            var7 = var3.field2695;
                        }
                        if (var7 != -1) {
                            class40 var8 = class40.method3092(var7);
                            var3.field2771 += field315;
                            while (var3.field2771 > var8.field934[var3.field2770]) {
                                var3.field2771 -= var8.field934[var3.field2770];
                                var3.field2770++;
                                if (var3.field2770 >= var8.field939.length) {
                                    var3.field2770 -= var8.field933;
                                    if (var3.field2770 < 0 || var3.field2770 >= var8.field939.length) {
                                        var3.field2770 = 0;
                                    }
                                }
                                method2625(var3);
                            }
                        }
                    }
                    if (var3.field2704 != 0 && !var3.field2649) {
                        int var9 = var3.field2704 >> 16;
                        int var10 = var3.field2704 << 16 >> 16;
                        int var11 = field315 * var9;
                        int var12 = field315 * var10;
                        var3.field2776 = var3.field2776 + var11 & 0x7FF;
                        var3.field2696 = var3.field2696 + var12 & 0x7FF;
                        method2625(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cw.da(II)V")
    public static final void method1871(int arg0) {
        method172();
        for (class22 var1 = (class22) class22.field564.method3497(); var1 != null; var1 = (class22) class22.field564.method3475()) {
            if (var1.field567 != null) {
                var1.method531();
            }
        }
        int var2 = class48.method804(arg0).field1094;
        if (var2 == 0) {
            return;
        }
        int var3 = class167.field2801[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class86.method1882(0.9D);
                ((class90) Statics.field1512).method1949(0.9D);
            }
            if (var3 == 2) {
                class86.method1882(0.8D);
                ((class90) Statics.field1512).method1949(0.8D);
            }
            if (var3 == 3) {
                class86.method1882(0.7D);
                ((class90) Statics.field1512).method1949(0.7D);
            }
            if (var3 == 4) {
                class86.method1882(0.6D);
                ((class90) Statics.field1512).method1949(0.6D);
            }
            Statics.method639();
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
            if (field480 != var4) {
                if (field480 == 0 && field481 != -1) {
                    class174.method3063(Statics.field593, field481, 0, var4, false);
                    field482 = false;
                } else if (var4 == 0) {
                    class174.method2548();
                    field482 = false;
                } else if (class174.field2856 == 0) {
                    Statics.field2854.method3296(var4);
                } else {
                    Statics.field2151 = var4;
                }
                field480 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field483 = 127;
            }
            if (var3 == 1) {
                field483 = 96;
            }
            if (var3 == 2) {
                field483 = 64;
            }
            if (var3 == 3) {
                field483 = 32;
            }
            if (var3 == 4) {
                field483 = 0;
            }
        }
        if (var2 == 5) {
            field409 = var3;
        }
        if (var2 == 6) {
            field403 = var3;
        }
        if (var2 == 9) {
            field251 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field472 = 127;
            }
            if (var3 == 1) {
                field472 = 96;
            }
            if (var3 == 2) {
                field472 = 64;
            }
            if (var3 == 3) {
                field472 = 32;
            }
            if (var3 == 4) {
                field472 = 0;
            }
        }
        if (var2 == 17) {
            field508 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field449 = (class19) class101.method164(class19.method1675(), var3);
            if (field449 == null) {
                field449 = class19.field525;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field373 = -1;
        } else {
            field373 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("e.dd(IIII)Ly;")
    public static final class4 method33(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field58 = arg1;
        var3.field51 = arg2;
        field402.method3446(var3, (long) arg0);
        if (class164.method3404(arg1)) {
            class164[] var4 = Statics.field2653[arg1];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class164 var6 = var4[var5];
                if (var6 != null) {
                    var6.field2770 = 0;
                    var6.field2771 = 0;
                }
            }
        }
        class164 var7 = Statics.method2717(arg0);
        method2625(var7);
        if (field316 != null) {
            method2625(field316);
            field316 = null;
        }
        method673();
        method1484(Statics.field2653[arg0 >> 16], var7, false);
        class34.method2916(arg1);
        if (field401 != -1) {
            int var8 = field401;
            if (class164.method3404(var8)) {
                method2165(Statics.field2653[var8], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("client.db(Ly;ZI)V")
    public static final void method510(class4 arg0, boolean arg1) {
        int var2 = arg0.field58;
        int var3 = (int) arg0.field3007;
        arg0.method3562();
        if (arg1) {
            class164.method2924(var2);
        }
        for (class192 var4 = (class192) field270.method3448(); var4 != null; var4 = (class192) field270.method3449()) {
            if ((var4.field3007 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3562();
            }
        }
        class164 var5 = Statics.method2717(var3);
        if (var5 != null) {
            method2625(var5);
        }
        for (int var6 = 0; var6 < field317; var6++) {
            if (method1948(field386[var6])) {
                if (var6 < field317 - 1) {
                    for (int var7 = var6; var7 < field317 - 1; var7++) {
                        field245[var7] = field245[var7 + 1];
                        field396[var7] = field396[var7 + 1];
                        field386[var7] = field386[var7 + 1];
                        field387[var7] = field387[var7 + 1];
                        field384[var7] = field384[var7 + 1];
                        field385[var7] = field385[var7 + 1];
                    }
                }
                field317--;
            }
        }
        if (field401 != -1) {
            int var8 = field401;
            if (class164.method3404(var8)) {
                method2165(Statics.field2653[var8], 1);
            }
        }
    }

    @ObfuscatedName("dl.ds(Lfy;I)Z")
    public static final boolean method2439(class164 arg0) {
        int var1 = arg0.field2654;
        if (var1 == 205) {
            field287 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field516.method3188(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field516.method3189(var4, var5 == 1);
        }
        if (var1 == 324) {
            field516.method3190(false);
        }
        if (var1 == 325) {
            field516.method3190(true);
        }
        if (var1 == 326) {
            field488.method2480(233);
            field516.method3191(field488);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cw.dz(Lfy;IIII)V")
    public static final void method1870(class164 arg0, int arg1, int arg2, int arg3) {
        method2561();
        class166 var4 = arg0.method3105();
        if (var4 == null) {
            return;
        }
        class75.method1620(arg1, arg2, var4.field2794 + arg1, var4.field2791 + arg2);
        if (field479 == 2 || field479 == 5) {
            class75.method1602(arg1, arg2, 0, var4.field2797, var4.field2793);
        } else {
            int var5 = field324 + field310 & 0x7FF;
            int var6 = Statics.field1710.field809 / 32 + 48;
            int var7 = 464 - Statics.field1710.field749 / 32;
            Statics.field138.method1552(arg1, arg2, var4.field2794, var4.field2791, var6, var7, var5, field312 + 256, var4.field2797, var4.field2793);
            for (int var8 = 0; var8 < field271; var8++) {
                int var9 = field474[var8] * 4 + 2 - Statics.field1710.field809 / 32;
                int var10 = field475[var8] * 4 + 2 - Statics.field1710.field749 / 32;
                method3568(arg1, arg2, var9, var10, field476[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class190 var13 = field394[Statics.field2136][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1710.field809 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1710.field749 / 32;
                        method3568(arg1, arg2, var14, var15, Statics.field2481[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field278; var16++) {
                class32 var17 = field277[field448[var16]];
                if (var17 != null && var17.method19()) {
                    class37 var18 = var17.field713;
                    if (var18 != null && var18.field828 != null) {
                        var18 = var18.method684();
                    }
                    if (var18 != null && var18.field851 && var18.field853) {
                        int var19 = var17.field809 / 32 - Statics.field1710.field809 / 32;
                        int var20 = var17.field749 / 32 - Statics.field1710.field749 / 32;
                        method3568(arg1, arg2, var19, var20, Statics.field2481[1], var4);
                    }
                }
            }
            for (int var21 = 0; var21 < field360; var21++) {
                class3 var22 = field359[field407[var21]];
                if (var22 != null && var22.method19() && !var22.field29) {
                    int var23 = var22.field809 / 32 - Statics.field1710.field809 / 32;
                    int var24 = var22.field749 / 32 - Statics.field1710.field749 / 32;
                    boolean var25 = false;
                    if (method2792(var22.field32, true)) {
                        var25 = true;
                    }
                    boolean var26 = false;
                    for (int var27 = 0; var27 < Statics.field1709; var27++) {
                        if (var22.field32.equals(Statics.field1954[var27].field575)) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (Statics.field1710.field46 != 0 && var22.field46 != 0 && Statics.field1710.field46 == var22.field46) {
                        var28 = true;
                    }
                    if (var25) {
                        method3568(arg1, arg2, var23, var24, Statics.field2481[3], var4);
                    } else if (var28) {
                        method3568(arg1, arg2, var23, var24, Statics.field2481[4], var4);
                    } else if (var26) {
                        method3568(arg1, arg2, var23, var24, Statics.field2481[5], var4);
                    } else {
                        method3568(arg1, arg2, var23, var24, Statics.field2481[2], var4);
                    }
                }
            }
            if (field431 != 0 && field249 % 20 < 10) {
                if (field431 == 1 && field259 >= 0 && field259 < field277.length) {
                    class32 var29 = field277[field259];
                    if (var29 != null) {
                        int var30 = var29.field809 / 32 - Statics.field1710.field809 / 32;
                        int var31 = var29.field749 / 32 - Statics.field1710.field749 / 32;
                        method2816(arg1, arg2, var30, var31, Statics.field2191[1], var4);
                    }
                }
                if (field431 == 2) {
                    int var32 = field326 * 4 - Statics.field178 * 4 + 2 - Statics.field1710.field809 / 32;
                    int var33 = field496 * 4 - Statics.field3035 * 4 + 2 - Statics.field1710.field749 / 32;
                    method2816(arg1, arg2, var32, var33, Statics.field2191[1], var4);
                }
                if (field431 == 10 && field413 >= 0 && field413 < field359.length) {
                    class3 var34 = field359[field413];
                    if (var34 != null) {
                        int var35 = var34.field809 / 32 - Statics.field1710.field809 / 32;
                        int var36 = var34.field749 / 32 - Statics.field1710.field749 / 32;
                        method2816(arg1, arg2, var35, var36, Statics.field2191[1], var4);
                    }
                }
            }
            if (field477 != 0) {
                int var37 = field477 * 4 + 2 - Statics.field1710.field809 / 32;
                int var38 = field478 * 4 + 2 - Statics.field1710.field749 / 32;
                method3568(arg1, arg2, var37, var38, Statics.field2191[0], var4);
            }
            if (!Statics.field1710.field29) {
                class75.method1593(var4.field2794 / 2 + arg1 - 1, var4.field2791 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field273[arg3] = true;
    }

    @ObfuscatedName("j.dh(Lfy;IIII)V")
    public static final void method158(class164 arg0, int arg1, int arg2, int arg3) {
        class166 var4 = arg0.method3105();
        if (var4 == null) {
            return;
        }
        if (field479 < 3) {
            Statics.field948.method1552(arg1, arg2, var4.field2794, var4.field2791, 25, 25, field324, 256, var4.field2797, var4.field2793);
        } else {
            class75.method1602(arg1, arg2, 0, var4.field2797, var4.field2793);
        }
    }

    @ObfuscatedName("ej.du(IIIILbx;Lfp;S)V")
    public static final void method2816(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method3568(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field324 + field310 & 0x7FF;
        int var8 = class86.field1515[var7];
        int var9 = class86.field1516[var7];
        int var10 = var8 * 256 / (field312 + 256);
        int var11 = var9 * 256 / (field312 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1998.method1522(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("gk.de(IIIILbx;Lfp;I)V")
    public static final void method3568(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field324 + field310 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class86.field1515[var6];
        int var9 = class86.field1516[var6];
        int var10 = var8 * 256 / (field312 + 256);
        int var11 = var9 * 256 / (field312 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1520(arg5.field2794 / 2 + var12 - arg4.field1340 / 2, arg5.field2791 / 2 - var13 - arg4.field1335 / 2, arg0, arg1, arg5.field2794, arg5.field2791, arg5.field2797, arg5.field2793);
        } else {
            arg4.method1516(arg5.field2794 / 2 + arg0 + var12 - arg4.field1340 / 2, arg5.field2791 / 2 + arg1 - var13 - arg4.field1335 / 2);
        }
    }

    @ObfuscatedName("ej.dx(Ljava/lang/String;ZI)Z")
    public static boolean method2792(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class155.method1387(arg0, Statics.field2944);
        for (int var3 = 0; var3 < field510; var3++) {
            if (var2.equalsIgnoreCase(class155.method1387(field512[var3].field214, Statics.field2944)) && (!arg1 || field512[var3].field216 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class155.method1387(Statics.field1710.field32, Statics.field2944))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("r.dp(Ljava/lang/String;I)Z")
    public static boolean method152(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class155.method1387(arg0, Statics.field2944);
        for (int var2 = 0; var2 < field405; var2++) {
            class8 var3 = field515[var2];
            if (var1.equalsIgnoreCase(class155.method1387(var3.field120, Statics.field2944))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class155.method1387(var3.field119, Statics.field2944))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("u.dv(Ljava/lang/String;B)V")
    public static final void method132(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field510 < 200 || field427 == 1) || field510 >= 400) {
            class11.method2783(30, "", class148.field2371);
            return;
        }
        String var1 = class155.method1387(arg0, Statics.field2944);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field510; var2++) {
            class17 var3 = field512[var2];
            String var4 = class155.method1387(var3.field214, Statics.field2944);
            if (var4 != null && var4.equals(var1)) {
                class11.method2783(30, "", arg0 + class148.field2239);
                return;
            }
            if (var3.field215 != null) {
                String var5 = class155.method1387(var3.field215, Statics.field2944);
                if (var5 != null && var5.equals(var1)) {
                    class11.method2783(30, "", arg0 + class148.field2239);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field405; var6++) {
            class8 var7 = field515[var6];
            String var8 = class155.method1387(var7.field120, Statics.field2944);
            if (var8 != null && var8.equals(var1)) {
                class11.method2783(30, "", class148.field2377 + arg0 + class148.field2474);
                return;
            }
            if (var7.field119 != null) {
                String var9 = class155.method1387(var7.field119, Statics.field2944);
                if (var9 != null && var9.equals(var1)) {
                    class11.method2783(30, "", class148.field2377 + arg0 + class148.field2474);
                    return;
                }
            }
        }
        if (class155.method1387(Statics.field1710.field32, Statics.field2944).equals(var1)) {
            class11.method2783(30, "", class148.field2473);
            return;
        }
        field488.method2480(128);
        class114 var10 = field488;
        int var11 = arg0.length() + 1;
        var10.method2213(var11);
        field488.method2219(arg0);
    }

    @ObfuscatedName("n.eu(Ljava/lang/String;B)V")
    public static final void method2(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class155.method1387(arg0, Statics.field2944);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field510; var2++) {
            class17 var3 = field512[var2];
            String var4 = var3.field214;
            String var5 = class155.method1387(var4, Statics.field2944);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field510--;
                for (int var7 = var2; var7 < field510; var7++) {
                    field512[var7] = field512[var7 + 1];
                }
                field434 = field404;
                field488.method2480(49);
                field488.method2213(class111.method2148(arg0));
                field488.method2219(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("f.ek(Ljava/lang/String;IB)V")
    public static final void method90(String arg0, int arg1) {
        field488.method2480(29);
        class114 var2 = field488;
        int var3 = arg0.length() + 1;
        var2.method2213(var3 + 1);
        field488.method2219(arg0);
        field488.method2253(arg1);
    }

    @ObfuscatedName("fq.eq(Ljava/lang/String;I)V")
    public static final void method3082(String arg0) {
        if (Statics.field1954 != null) {
            field488.method2480(204);
            field488.method2213(class111.method2148(arg0));
            field488.method2219(arg0);
        }
    }

    @ObfuscatedName("db.en(Lfy;I)I")
    public static int method2562(class164 arg0) {
        class192 var1 = (class192) field270.method3445(((long) arg0.field2651 << 32) + (long) arg0.field2650);
        return var1 == null ? arg0.field2756 : var1.field2994;
    }

    @ObfuscatedName("fs.em(Lfy;I)Z")
    public static boolean method3036(class164 arg0) {
        if (field411) {
            if (method2562(arg0) != 0) {
                return false;
            }
            if (arg0.field2732 == 0) {
                return false;
            }
        }
        return arg0.field2670;
    }

    @ObfuscatedName("r.ej(Lfy;IB)Ljava/lang/String;")
    public static String method153(class164 arg0, int arg1) {
        if (!class169.method34(method2562(arg0), arg1) && arg0.field2748 == null) {
            return null;
        } else if (arg0.field2722 == null || arg0.field2722.length <= arg1 || arg0.field2722[arg1] == null || arg0.field2722[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2722[arg1];
        }
    }

    @ObfuscatedName("bg.el(Lfy;B)Ljava/lang/String;")
    public static String method1384(class164 arg0) {
        if (class169.method2056(method2562(arg0)) == 0) {
            return null;
        } else if (arg0.field2779 == null || arg0.field2779.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2779;
        }
    }

    @ObfuscatedName("ad.es(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method604(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field242 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field242 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field242 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field242 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field242 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field173 != null) {
            var3 = "/p=" + Statics.field173;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field323 + "/a=" + Statics.field1957 + var3 + "/";
    }
}

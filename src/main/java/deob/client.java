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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;

public final class client extends class136 {

    @ObfuscatedName("client.p")
    public static boolean field248 = true;

    @ObfuscatedName("client.e")
    public static int field247 = 1;

    @ObfuscatedName("client.i")
    public static int field364 = 0;

    @ObfuscatedName("client.f")
    public static int field249 = 0;

    @ObfuscatedName("client.v")
    public static boolean field250 = false;

    @ObfuscatedName("client.a")
    public static boolean field251 = false;

    @ObfuscatedName("client.l")
    public static int field252 = 0;

    @ObfuscatedName("client.k")
    public static int field371 = 0;

    @ObfuscatedName("client.w")
    public static class220[] field400 = new class220[4];

    @ObfuscatedName("client.q")
    public static boolean field427 = true;

    @ObfuscatedName("client.g")
    public static int field256 = 0;

    @ObfuscatedName("client.z")
    public static long field257 = 1L;

    @ObfuscatedName("client.n")
    public static int field428 = -1;

    @ObfuscatedName("client.s")
    public static int field259 = -1;

    @ObfuscatedName("client.ac")
    public static int field260 = -1;

    @ObfuscatedName("client.au")
    public static boolean field261 = true;

    @ObfuscatedName("client.ap")
    public static boolean field262 = false;

    @ObfuscatedName("client.ah")
    public static int field263 = 0;

    @ObfuscatedName("client.ae")
    public static int field264 = 0;

    @ObfuscatedName("client.ag")
    public static int field265 = 0;

    @ObfuscatedName("client.as")
    public static int field266 = 0;

    @ObfuscatedName("client.at")
    public static int field267 = 0;

    @ObfuscatedName("client.aw")
    public static int field508 = 0;

    @ObfuscatedName("client.ay")
    public static int field376 = 0;

    @ObfuscatedName("client.ao")
    public static int field270 = 0;

    @ObfuscatedName("client.al")
    public static int field271 = 0;

    @ObfuscatedName("client.ab")
    public static class111 field268 = new class111(new byte[5000]);

    @ObfuscatedName("client.ar")
    public static class19 field278 = class19.field531;

    @ObfuscatedName("client.ax")
    public static int field276 = 0;

    @ObfuscatedName("client.ad")
    public static int field474 = 0;

    @ObfuscatedName("client.af")
    public static int field462 = 0;

    @ObfuscatedName("client.bz")
    public static int field280 = 0;

    @ObfuscatedName("client.bh")
    public static int field366 = 0;

    @ObfuscatedName("client.bp")
    public static int field493 = 0;

    @ObfuscatedName("client.bo")
    public static int field283 = 0;

    @ObfuscatedName("client.bj")
    public static int field284 = 0;

    @ObfuscatedName("client.cq")
    public static class32[] field285 = new class32[32768];

    @ObfuscatedName("client.cp")
    public static int field286 = 0;

    @ObfuscatedName("client.cj")
    public static int[] field287 = new int[32768];

    @ObfuscatedName("client.ch")
    public static class114 field288 = new class114(5000);

    @ObfuscatedName("client.cz")
    public static class114 field279 = new class114(5000);

    @ObfuscatedName("client.cl")
    public static class114 field450 = new class114(5000);

    @ObfuscatedName("client.cf")
    public static int field291 = 0;

    @ObfuscatedName("client.cm")
    public static int field419 = 0;

    @ObfuscatedName("client.cx")
    public static int field293 = 0;

    @ObfuscatedName("client.ct")
    public static int field282 = 0;

    @ObfuscatedName("client.ci")
    public static int field295 = 0;

    @ObfuscatedName("client.cc")
    public static int field296 = 0;

    @ObfuscatedName("client.cg")
    public static int field517 = 0;

    @ObfuscatedName("client.ca")
    public static int field298 = 0;

    @ObfuscatedName("client.cn")
    public static boolean field294 = false;

    @ObfuscatedName("client.df")
    public static int field301 = 0;

    @ObfuscatedName("client.dk")
    public static int field342 = 0;

    @ObfuscatedName("client.db")
    public static int field511 = 1;

    @ObfuscatedName("client.dl")
    public static int field281 = 0;

    @ObfuscatedName("client.dc")
    public static int field305 = 1;

    @ObfuscatedName("client.da")
    public static int field437 = 0;

    @ObfuscatedName("client.ds")
    public static boolean field399 = false;

    @ObfuscatedName("client.dd")
    public static int[][][] field309 = new int[4][13][13];

    @ObfuscatedName("client.dm")
    public static final int[] field310 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dz")
    public static int field311 = 0;

    @ObfuscatedName("client.dg")
    public static int field421 = 2;

    @ObfuscatedName("client.dh")
    public static int field313 = 0;

    @ObfuscatedName("client.dp")
    public static int field314 = 2;

    @ObfuscatedName("client.dt")
    public static int field315 = 0;

    @ObfuscatedName("client.dw")
    public static int field316 = 1;

    @ObfuscatedName("client.eh")
    public static int field317 = 0;

    @ObfuscatedName("client.em")
    public static int field318 = 0;

    @ObfuscatedName("client.et")
    public static int field319 = 2;

    @ObfuscatedName("client.ea")
    public static int field320 = 0;

    @ObfuscatedName("client.er")
    public static int field321 = 1;

    @ObfuscatedName("client.ez")
    public static int field322 = 0;

    @ObfuscatedName("client.eq")
    public static int field312 = 0;

    @ObfuscatedName("client.ef")
    public static int field325 = 2301979;

    @ObfuscatedName("client.ee")
    public static int field326 = 5063219;

    @ObfuscatedName("client.ej")
    public static int field327 = 3353893;

    @ObfuscatedName("client.ei")
    public static int field328 = 7759444;

    @ObfuscatedName("client.eg")
    public static boolean field329 = false;

    @ObfuscatedName("client.eo")
    public static int field445 = 0;

    @ObfuscatedName("client.fc")
    public static int field331 = 128;

    @ObfuscatedName("client.fs")
    public static int field332 = 0;

    @ObfuscatedName("client.fi")
    public static int field333 = 0;

    @ObfuscatedName("client.fb")
    public static int field334 = 0;

    @ObfuscatedName("client.fg")
    public static int field335 = 0;

    @ObfuscatedName("client.fo")
    public static int field336 = 0;

    @ObfuscatedName("client.fx")
    public static int field358 = 0;

    @ObfuscatedName("client.fe")
    public static boolean field338 = false;

    @ObfuscatedName("client.fk")
    public static int field398 = 0;

    @ObfuscatedName("client.fa")
    public static int field340 = 0;

    @ObfuscatedName("client.fy")
    public static int field514 = 50;

    @ObfuscatedName("client.fp")
    public static int[] field269 = new int[field514];

    @ObfuscatedName("client.ff")
    public static int[] field253 = new int[field514];

    @ObfuscatedName("client.fw")
    public static int[] field344 = new int[field514];

    @ObfuscatedName("client.fd")
    public static int[] field368 = new int[field514];

    @ObfuscatedName("client.fr")
    public static int[] field292 = new int[field514];

    @ObfuscatedName("client.fn")
    public static int[] field351 = new int[field514];

    @ObfuscatedName("client.fm")
    public static int[] field348 = new int[field514];

    @ObfuscatedName("client.fu")
    public static String[] field349 = new String[field514];

    @ObfuscatedName("client.gw")
    public static int[][] field297 = new int[104][104];

    @ObfuscatedName("client.gr")
    public static int field491 = 0;

    @ObfuscatedName("client.gd")
    public static int field520 = -1;

    @ObfuscatedName("client.gu")
    public static int field353 = -1;

    @ObfuscatedName("client.gb")
    public static int field354 = 0;

    @ObfuscatedName("client.gx")
    public static int field403 = 0;

    @ObfuscatedName("client.gi")
    public static int field356 = 0;

    @ObfuscatedName("client.gq")
    public static int field357 = 0;

    @ObfuscatedName("client.gz")
    public static int field304 = 0;

    @ObfuscatedName("client.ga")
    public static int field359 = 0;

    @ObfuscatedName("client.gg")
    public static int field361 = 0;

    @ObfuscatedName("client.gk")
    public static int field362 = 0;

    @ObfuscatedName("client.gh")
    public static int field363 = 0;

    @ObfuscatedName("client.gt")
    public static int field522 = 0;

    @ObfuscatedName("client.ge")
    public static boolean field365 = false;

    @ObfuscatedName("client.gf")
    public static int field393 = 0;

    @ObfuscatedName("client.gj")
    public static int field367 = 0;

    @ObfuscatedName("client.gn")
    public static class3[] field258 = new class3[2048];

    @ObfuscatedName("client.gv")
    public static int field519 = 0;

    @ObfuscatedName("client.go")
    public static int[] field370 = new int[2048];

    @ObfuscatedName("client.gs")
    public static int field379 = 0;

    @ObfuscatedName("client.hk")
    public static int[] field369 = new int[2048];

    @ObfuscatedName("client.hw")
    public static class111[] field373 = new class111[2048];

    @ObfuscatedName("client.hm")
    public static int field374 = -1;

    @ObfuscatedName("client.hf")
    public static int field375 = 0;

    @ObfuscatedName("client.hq")
    public static int field299 = 0;

    @ObfuscatedName("client.ha")
    public static int[] field377 = new int[1000];

    @ObfuscatedName("client.hd")
    public static final int[] field289 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hy")
    public static String[] field339 = new String[8];

    @ObfuscatedName("client.hg")
    public static boolean[] field469 = new boolean[8];

    @ObfuscatedName("client.ho")
    public static int[] field381 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hn")
    public static int field382 = -1;

    @ObfuscatedName("client.hx")
    public static class190[][][] field383 = new class190[4][104][104];

    @ObfuscatedName("client.hr")
    public static class190 field384 = new class190();

    @ObfuscatedName("client.hl")
    public static class190 field385 = new class190();

    @ObfuscatedName("client.hz")
    public static class190 field490 = new class190();

    @ObfuscatedName("client.hs")
    public static int[] field387 = new int[25];

    @ObfuscatedName("client.hi")
    public static int[] field307 = new int[25];

    @ObfuscatedName("client.hc")
    public static int[] field389 = new int[25];

    @ObfuscatedName("client.hp")
    public static int field390 = 0;

    @ObfuscatedName("client.hh")
    public static boolean field352 = false;

    @ObfuscatedName("client.ib")
    public static int field392 = 0;

    @ObfuscatedName("client.iu")
    public static int[] field254 = new int[500];

    @ObfuscatedName("client.ik")
    public static int[] field277 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field395 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field396 = new int[500];

    @ObfuscatedName("client.ia")
    public static String[] field397 = new String[500];

    @ObfuscatedName("client.iq")
    public static String[] field468 = new String[500];

    @ObfuscatedName("client.ij")
    public static int field412 = -1;

    @ObfuscatedName("client.iv")
    public static int field518 = -1;

    @ObfuscatedName("client.ip")
    public static int field401 = 0;

    @ObfuscatedName("client.ic")
    public static int field402 = 50;

    @ObfuscatedName("client.ig")
    public static int field273 = 0;

    @ObfuscatedName("client.ie")
    public static String field425 = null;

    @ObfuscatedName("client.id")
    public static boolean field405 = false;

    @ObfuscatedName("client.ii")
    public static int field406 = -1;

    @ObfuscatedName("client.it")
    public static int field407 = -1;

    @ObfuscatedName("client.je")
    public static String field408 = null;

    @ObfuscatedName("client.jb")
    public static String field409 = null;

    @ObfuscatedName("client.jx")
    public static int field410 = -1;

    @ObfuscatedName("client.jf")
    public static class187 field411 = new class187(8);

    @ObfuscatedName("client.ja")
    public static int field341 = 0;

    @ObfuscatedName("client.jr")
    public static int field413 = 0;

    @ObfuscatedName("client.jl")
    public static class164 field414 = null;

    @ObfuscatedName("client.ju")
    public static int field415 = 0;

    @ObfuscatedName("client.js")
    public static int field343 = 0;

    @ObfuscatedName("client.jo")
    public static int field417 = 0;

    @ObfuscatedName("client.jw")
    public static int field394 = -1;

    @ObfuscatedName("client.jc")
    public static boolean field347 = false;

    @ObfuscatedName("client.jh")
    public static boolean field529 = false;

    @ObfuscatedName("client.jd")
    public static boolean field495 = false;

    @ObfuscatedName("client.ji")
    public static class164 field422 = null;

    @ObfuscatedName("client.jz")
    public static class164 field436 = null;

    @ObfuscatedName("client.jn")
    public static class164 field306 = null;

    @ObfuscatedName("client.jt")
    public static int field346 = 0;

    @ObfuscatedName("client.jg")
    public static int field300 = 0;

    @ObfuscatedName("client.jm")
    public static class164 field461 = null;

    @ObfuscatedName("client.jv")
    public static boolean field472 = false;

    @ObfuscatedName("client.jj")
    public static int field423 = -1;

    @ObfuscatedName("client.jk")
    public static int field430 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field431 = false;

    @ObfuscatedName("client.jp")
    public static int field432 = -1;

    @ObfuscatedName("client.jq")
    public static int field433 = -1;

    @ObfuscatedName("client.ka")
    public static boolean field434 = false;

    @ObfuscatedName("client.kp")
    public static int field435 = 1;

    @ObfuscatedName("client.kr")
    public static int[] field323 = new int[32];

    @ObfuscatedName("client.ko")
    public static int field521 = 0;

    @ObfuscatedName("client.km")
    public static int[] field438 = new int[32];

    @ObfuscatedName("client.kt")
    public static int field439 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field440 = new int[32];

    @ObfuscatedName("client.kl")
    public static int field441 = 0;

    @ObfuscatedName("client.kj")
    public static int field442 = 0;

    @ObfuscatedName("client.ki")
    public static int field443 = 0;

    @ObfuscatedName("client.ke")
    public static int field444 = 0;

    @ObfuscatedName("client.kg")
    public static int field404 = 0;

    @ObfuscatedName("client.kh")
    public static int field330 = 0;

    @ObfuscatedName("client.kf")
    public static int field447 = 0;

    @ObfuscatedName("client.kb")
    public static int[] field448 = new int[2000];

    @ObfuscatedName("client.ky")
    public static String[] field449 = new String[1000];

    @ObfuscatedName("client.ks")
    public static int field487 = 0;

    @ObfuscatedName("client.kd")
    public static class190 field451 = new class190();

    @ObfuscatedName("client.kk")
    public static class190 field452 = new class190();

    @ObfuscatedName("client.ld")
    public static class190 field480 = new class190();

    @ObfuscatedName("client.ll")
    public static class187 field454 = new class187(512);

    @ObfuscatedName("client.lu")
    public static int field455 = 0;

    @ObfuscatedName("client.ln")
    public static int field456 = -2;

    @ObfuscatedName("client.lh")
    public static boolean[] field457 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static boolean[] field458 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static boolean[] field459 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static int[] field460 = new int[100];

    @ObfuscatedName("client.le")
    public static int[] field488 = new int[100];

    @ObfuscatedName("client.ls")
    public static int[] field372 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field463 = new int[100];

    @ObfuscatedName("client.lr")
    public static int field464 = 0;

    @ObfuscatedName("client.lk")
    public static long field465 = 0L;

    @ObfuscatedName("client.li")
    public static boolean field466 = true;

    @ObfuscatedName("client.lx")
    public static int field467 = 765;

    @ObfuscatedName("client.la")
    public static int field388 = 503;

    @ObfuscatedName("client.lq")
    public static int[] field272 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lz")
    public static int field470 = 0;

    @ObfuscatedName("client.lv")
    public static int field471 = 0;

    @ObfuscatedName("client.lo")
    public static String field429 = "";

    @ObfuscatedName("client.mk")
    public static long[] field473 = new long[100];

    @ObfuscatedName("client.me")
    public static int field505 = 0;

    @ObfuscatedName("client.mn")
    public static int field475 = 0;

    @ObfuscatedName("client.mm")
    public static int[] field476 = new int[128];

    @ObfuscatedName("client.md")
    public static int[] field477 = new int[128];

    @ObfuscatedName("client.mc")
    public static long field478 = -1L;

    @ObfuscatedName("client.mp")
    public static String field479 = null;

    @ObfuscatedName("client.mb")
    public static String field337 = null;

    @ObfuscatedName("client.mw")
    public static int field481 = -1;

    @ObfuscatedName("client.mu")
    public static int field482 = 0;

    @ObfuscatedName("client.mh")
    public static int[] field483 = new int[1000];

    @ObfuscatedName("client.mj")
    public static int[] field484 = new int[1000];

    @ObfuscatedName("client.my")
    public static class74[] field485 = new class74[1000];

    @ObfuscatedName("client.mz")
    public static int field486 = 0;

    @ObfuscatedName("client.mo")
    public static int field516 = 0;

    @ObfuscatedName("client.nh")
    public static int field386 = 0;

    @ObfuscatedName("client.np")
    public static int field489 = 255;

    @ObfuscatedName("client.nl")
    public static int field244 = -1;

    @ObfuscatedName("client.nf")
    public static boolean field345 = false;

    @ObfuscatedName("client.nd")
    public static int field492 = 127;

    @ObfuscatedName("client.na")
    public static int field290 = 127;

    @ObfuscatedName("client.no")
    public static int field494 = 0;

    @ObfuscatedName("client.nq")
    public static int[] field416 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field496 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field497 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field498 = new int[50];

    @ObfuscatedName("client.ns")
    public static class54[] field499 = new class54[50];

    @ObfuscatedName("client.nw")
    public static boolean field500 = false;

    @ObfuscatedName("client.oo")
    public static boolean[] field502 = new boolean[5];

    @ObfuscatedName("client.oa")
    public static int[] field503 = new int[5];

    @ObfuscatedName("client.on")
    public static int[] field504 = new int[5];

    @ObfuscatedName("client.ov")
    public static int[] field246 = new int[5];

    @ObfuscatedName("client.oq")
    public static int[] field506 = new int[5];

    @ObfuscatedName("client.or")
    public static short field507 = 256;

    @ObfuscatedName("client.om")
    public static short field274 = 205;

    @ObfuscatedName("client.og")
    public static short field509 = 256;

    @ObfuscatedName("client.oe")
    public static short field510 = 320;

    @ObfuscatedName("client.op")
    public static short field302 = 1;

    @ObfuscatedName("client.oy")
    public static short field512 = 32767;

    @ObfuscatedName("client.oc")
    public static short field513 = 1;

    @ObfuscatedName("client.ou")
    public static short field420 = 32767;

    @ObfuscatedName("client.oh")
    public static int field515 = 0;

    @ObfuscatedName("client.oi")
    public static int field391 = 0;

    @ObfuscatedName("client.ox")
    public static int field418 = 0;

    @ObfuscatedName("client.ot")
    public static int field453 = 0;

    @ObfuscatedName("client.od")
    public static int field426 = 0;

    @ObfuscatedName("client.oj")
    public static int field255 = 0;

    @ObfuscatedName("client.ol")
    public static int field424 = 0;

    @ObfuscatedName("client.pk")
    public static class17[] field355 = new class17[400];

    @ObfuscatedName("client.pa")
    public static class186 field523 = new class186();

    @ObfuscatedName("client.pm")
    public static int field524 = 0;

    @ObfuscatedName("client.pq")
    public static class8[] field525 = new class8[400];

    @ObfuscatedName("client.pb")
    public static class170 field526 = new class170();

    @ObfuscatedName("client.po")
    public static int field527 = -1;

    @ObfuscatedName("client.pr")
    public static int field528 = -1;

    @ObfuscatedName("client.pg")
    public static class211[] field380 = new class211[8];

    @ObfuscatedName("client.b(B)V")
    public final void method183() {
    }

    public final void init() {
        if (!this.method2686()) {
            return;
        }
        class181[] var1 = new class181[] { class181.field2957, class181.field2950, class181.field2960, class181.field2965, class181.field2956, class181.field2961, class181.field2951, class181.field2954, class181.field2964, class181.field2959, class181.field2963, class181.field2955, class181.field2953, class181.field2962, class181.field2952 };
        class181[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class181 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2958);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2958)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class2.field17)) {
                            field250 = true;
                        } else {
                            field250 = false;
                        }
                        break;
                    case 2:
                        Statics.field446 = Integer.parseInt(var5);
                        break;
                    case 3:
                        class145[] var6 = new class145[] { class145.field2158, class145.field2160, class145.field2157, class145.field2159, class145.field2156, class145.field2155 };
                        Statics.field230 = (class145) class101.method553(var6, Integer.parseInt(var5));
                        if (Statics.field230 == class145.field2160) {
                            Statics.field1831 = class203.field3044;
                        } else {
                            Statics.field1831 = class203.field3042;
                        }
                        break;
                    case 4:
                        field252 = Integer.parseInt(var5);
                        break;
                    case 5:
                        field364 = Integer.parseInt(var5);
                    case 6:
                    case 13:
                    case 14:
                    default:
                        break;
                    case 7:
                        if (var5.equalsIgnoreCase(class2.field17)) {
                        }
                        break;
                    case 8:
                        Statics.field146 = var5;
                        break;
                    case 9:
                        Statics.field199 = Integer.parseInt(var5);
                        break;
                    case 10:
                        Statics.field1834 = var5;
                        break;
                    case 11:
                        Statics.field1360 = class144.method519(Integer.parseInt(var5));
                        break;
                    case 12:
                        field249 = Integer.parseInt(var5);
                        break;
                    case 15:
                        field247 = Integer.parseInt(var5);
                }
            }
        }
        class81.field1371 = false;
        field251 = false;
        Statics.field2093 = this.getCodeBase().getHost();
        String var7 = Statics.field1360.field2150;
        byte var8 = 0;
        try {
            class141.method31("oldschool", var7, var8, 16);
        } catch (Exception var10) {
            class140.method2756((String) null, var10);
        }
        Statics.field245 = this;
        this.method2749(765, 503, 87);
    }

    @ObfuscatedName("client.e(I)V")
    public final void method185() {
        Statics.field2949 = field249 == 0 ? 43594 : field247 + 40000;
        Statics.field2173 = field249 == 0 ? 443 : field247 + 50000;
        Statics.field585 = Statics.field2949;
        Statics.field2772 = class165.field2767;
        Statics.field2587 = class165.field2766;
        Statics.field2808 = class165.field2770;
        Statics.field2803 = class165.field2768;
        if (Statics.field3060.toLowerCase().indexOf("microsoft") == -1) {
            class129.field2001[44] = 71;
            class129.field2001[45] = 26;
            class129.field2001[46] = 72;
            class129.field2001[47] = 73;
            class129.field2001[59] = 57;
            class129.field2001[61] = 27;
            class129.field2001[91] = 42;
            class129.field2001[92] = 74;
            class129.field2001[93] = 43;
            class129.field2001[192] = 28;
            class129.field2001[222] = 58;
            class129.field2001[520] = 59;
        } else {
            class129.field2001[186] = 57;
            class129.field2001[187] = 27;
            class129.field2001[188] = 71;
            class129.field2001[189] = 26;
            class129.field2001[190] = 72;
            class129.field2001[191] = 73;
            class129.field2001[192] = 58;
            class129.field2001[219] = 42;
            class129.field2001[220] = 74;
            class129.field2001[221] = 43;
            class129.field2001[222] = 59;
            class129.field2001[223] = 28;
        }
        class129.method40(Statics.field1309);
        Statics.method655(Statics.field1309);
        Statics.field1544 = class123.method2461();
        if (Statics.field1544 != null) {
            Statics.field1544.method2508(Statics.field1309);
        }
        Statics.field1941 = new class126(255, class141.field2119, class141.field2120, 500000);
        Statics.field2092 = class9.method820();
        Statics.field909 = this.getToolkit().getSystemClipboard();
        String var2 = Statics.field1090;
        class130.field2009 = this;
        class130.field2008 = var2;
        if (field249 != 0) {
            field262 = true;
        }
        method797(Statics.field2092.field134);
    }

    @ObfuscatedName("client.i(I)V")
    public final void method459() {
        field256++;
        this.method189();
        class161.method2101();
        class174.method2794();
        method1907();
        class129 var1 = class129.field1988;
        synchronized (class129.field1988) {
            class129.field2000++;
            class129.field1997 = class129.field1983;
            class129.field1993 = 0;
            if (class129.field1975 >= 0) {
                while (class129.field1991 != class129.field1975) {
                    int var3 = class129.field1990[class129.field1991];
                    class129.field1991 = class129.field1991 + 1 & 0x7F;
                    if (var3 < 0) {
                        class129.field1985[~var3] = false;
                    } else {
                        if (!class129.field1985[var3] && class129.field1993 < class129.field1996.length - 1) {
                            class129.field1996[++class129.field1993 - 1] = var3;
                        }
                        class129.field1985[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class129.field1985[var2] = false;
                }
                class129.field1975 = class129.field1991;
            }
            class129.field1983 = class129.field1998;
        }
        class132.method2195();
        if (Statics.field1544 != null) {
            int var5 = Statics.field1544.method2496();
            field487 = var5;
        }
        int var10002;
        if (field371 == 0) {
            method2099();
            class136.method2013();
        } else if (field371 == 5) {
            class30.method712(this);
            method2099();
            class136.method2013();
        } else if (field371 == 10 || field371 == 11) {
            class30.method712(this);
        } else if (field371 == 20) {
            class30.method712(this);
            method173();
        } else if (field371 == 25) {
            method161(false);
            field342 = 0;
            boolean var6 = true;
            for (int var7 = 0; var7 < Statics.field62.length; var7++) {
                if (Statics.field658[var7] != -1 && Statics.field62[var7] == null) {
                    Statics.field62[var7] = Statics.field1286.method2881(Statics.field658[var7], 0);
                    if (Statics.field62[var7] == null) {
                        var6 = false;
                        field342++;
                    }
                }
                if (Statics.field2536[var7] != -1 && Statics.field1823[var7] == null) {
                    Statics.field1823[var7] = Statics.field1286.method2882(Statics.field2536[var7], 0, Statics.field2588[var7]);
                    if (Statics.field1823[var7] == null) {
                        var6 = false;
                        field342++;
                    }
                }
            }
            if (var6) {
                field281 = 0;
                boolean var8 = true;
                for (int var9 = 0; var9 < Statics.field62.length; var9++) {
                    byte[] var10 = Statics.field1823[var9];
                    if (var10 != null) {
                        int var11 = (Statics.field1689[var9] >> 8) * 64 - Statics.field550;
                        int var12 = (Statics.field1689[var9] & 0xFF) * 64 - Statics.field925;
                        if (field399) {
                            var11 = 10;
                            var12 = 10;
                        }
                        var8 &= class6.method2477(var10, var11, var12);
                    }
                }
                if (var8) {
                    if (field437 != 0) {
                        method10(class148.field2219 + class2.field21 + class2.field18 + 100 + "%" + class2.field26, true);
                    }
                    method1907();
                    method780();
                    method1907();
                    Statics.field147.method1722();
                    method1907();
                    System.gc();
                    for (int var13 = 0; var13 < 4; var13++) {
                        field400[var13].method3743();
                    }
                    for (int var14 = 0; var14 < 4; var14++) {
                        for (int var15 = 0; var15 < 104; var15++) {
                            for (int var16 = 0; var16 < 104; var16++) {
                                class6.field68[var14][var15][var16] = 0;
                            }
                        }
                    }
                    method1907();
                    class6.field69 = 99;
                    Statics.field74 = new byte[4][104][104];
                    Statics.field71 = new byte[4][104][104];
                    Statics.field72 = new byte[4][104][104];
                    Statics.field1535 = new byte[4][104][104];
                    Statics.field1428 = new int[4][105][105];
                    Statics.field73 = new byte[4][105][105];
                    Statics.field2769 = new int[105][105];
                    Statics.field75 = new int[104];
                    Statics.field76 = new int[104];
                    Statics.field80 = new int[104];
                    Statics.field77 = new int[104];
                    Statics.field1592 = new int[104];
                    int var17 = Statics.field62.length;
                    class22.method1414();
                    method161(true);
                    if (!field399) {
                        int var18 = 0;
                        label2276: while (true) {
                            if (var18 >= var17) {
                                for (int var32 = 0; var32 < var17; var32++) {
                                    int var33 = (Statics.field1689[var32] >> 8) * 64 - Statics.field550;
                                    int var34 = (Statics.field1689[var32] & 0xFF) * 64 - Statics.field925;
                                    byte[] var35 = Statics.field62[var32];
                                    if (var35 == null && Statics.field907 < 800) {
                                        method1907();
                                        class6.method533(var33, var34, 64, 64);
                                    }
                                }
                                method161(true);
                                int var36 = 0;
                                while (true) {
                                    if (var36 >= var17) {
                                        break label2276;
                                    }
                                    byte[] var37 = Statics.field1823[var36];
                                    if (var37 != null) {
                                        int var38 = (Statics.field1689[var36] >> 8) * 64 - Statics.field550;
                                        int var39 = (Statics.field1689[var36] & 0xFF) * 64 - Statics.field925;
                                        method1907();
                                        class81 var40 = Statics.field147;
                                        class220[] var41 = field400;
                                        class111 var42 = new class111(var37);
                                        int var43 = -1;
                                        while (true) {
                                            int var44 = var42.method2185();
                                            if (var44 == 0) {
                                                break;
                                            }
                                            var43 += var44;
                                            int var45 = 0;
                                            while (true) {
                                                int var46 = var42.method2185();
                                                if (var46 == 0) {
                                                    break;
                                                }
                                                var45 += var46 - 1;
                                                int var47 = var45 & 0x3F;
                                                int var48 = var45 >> 6 & 0x3F;
                                                int var49 = var45 >> 12;
                                                int var50 = var42.method2172();
                                                int var51 = var50 >> 2;
                                                int var52 = var50 & 0x3;
                                                int var53 = var38 + var48;
                                                int var54 = var39 + var47;
                                                if (var53 > 0 && var54 > 0 && var53 < 103 && var54 < 103) {
                                                    int var55 = var49;
                                                    if ((class6.field68[1][var53][var54] & 0x2) == 2) {
                                                        var55 = var49 - 1;
                                                    }
                                                    class220 var56 = null;
                                                    if (var55 >= 0) {
                                                        var56 = var41[var55];
                                                    }
                                                    class6.method2789(var49, var53, var54, var43, var52, var51, var40, var56);
                                                }
                                            }
                                        }
                                    }
                                    var36++;
                                }
                            }
                            int var19 = (Statics.field1689[var18] >> 8) * 64 - Statics.field550;
                            int var20 = (Statics.field1689[var18] & 0xFF) * 64 - Statics.field925;
                            byte[] var21 = Statics.field62[var18];
                            if (var21 != null) {
                                method1907();
                                int var22 = Statics.field2516 * 8 - 48;
                                int var23 = Statics.field907 * 8 - 48;
                                class220[] var24 = field400;
                                int var25 = 0;
                                label2273: while (true) {
                                    if (var25 >= 4) {
                                        class111 var28 = new class111(var21);
                                        int var29 = 0;
                                        while (true) {
                                            if (var29 >= 4) {
                                                break label2273;
                                            }
                                            for (int var30 = 0; var30 < 64; var30++) {
                                                for (int var31 = 0; var31 < 64; var31++) {
                                                    class6.method3018(var28, var29, var19 + var30, var20 + var31, var22, var23, 0);
                                                }
                                            }
                                            var29++;
                                        }
                                    }
                                    for (int var26 = 0; var26 < 64; var26++) {
                                        for (int var27 = 0; var27 < 64; var27++) {
                                            if (var19 + var26 > 0 && var19 + var26 < 103 && var20 + var27 > 0 && var20 + var27 < 103) {
                                                var24[var25].field3140[var19 + var26][var20 + var27] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var25++;
                                }
                            }
                            var18++;
                        }
                    }
                    if (field399) {
                        int var57 = 0;
                        label2209: while (true) {
                            if (var57 >= 4) {
                                for (int var68 = 0; var68 < 13; var68++) {
                                    for (int var69 = 0; var69 < 13; var69++) {
                                        int var70 = field309[0][var68][var69];
                                        if (var70 == -1) {
                                            class6.method533(var68 * 8, var69 * 8, 8, 8);
                                        }
                                    }
                                }
                                method161(true);
                                int var71 = 0;
                                while (true) {
                                    if (var71 >= 4) {
                                        break label2209;
                                    }
                                    method1907();
                                    for (int var72 = 0; var72 < 13; var72++) {
                                        label2166: for (int var73 = 0; var73 < 13; var73++) {
                                            int var74 = field309[var71][var72][var73];
                                            if (var74 != -1) {
                                                int var75 = var74 >> 24 & 0x3;
                                                int var76 = var74 >> 1 & 0x3;
                                                int var77 = var74 >> 14 & 0x3FF;
                                                int var78 = var74 >> 3 & 0x7FF;
                                                int var79 = (var77 / 8 << 8) + var78 / 8;
                                                for (int var80 = 0; var80 < Statics.field1689.length; var80++) {
                                                    if (Statics.field1689[var80] == var79 && Statics.field1823[var80] != null) {
                                                        byte[] var81 = Statics.field1823[var80];
                                                        int var82 = var72 * 8;
                                                        int var83 = var73 * 8;
                                                        int var84 = (var77 & 0x7) * 8;
                                                        int var85 = (var78 & 0x7) * 8;
                                                        class81 var86 = Statics.field147;
                                                        class220[] var87 = field400;
                                                        class111 var88 = new class111(var81);
                                                        int var89 = -1;
                                                        while (true) {
                                                            int var90 = var88.method2185();
                                                            if (var90 == 0) {
                                                                continue label2166;
                                                            }
                                                            var89 += var90;
                                                            int var91 = 0;
                                                            while (true) {
                                                                int var92 = var88.method2185();
                                                                if (var92 == 0) {
                                                                    break;
                                                                }
                                                                var91 += var92 - 1;
                                                                int var93 = var91 & 0x3F;
                                                                int var94 = var91 >> 6 & 0x3F;
                                                                int var95 = var91 >> 12;
                                                                int var96 = var88.method2172();
                                                                int var97 = var96 >> 2;
                                                                int var98 = var96 & 0x3;
                                                                if (var75 == var95 && var94 >= var84 && var94 < var84 + 8 && var93 >= var85 && var93 < var85 + 8) {
                                                                    class38 var99 = class38.method1473(var89);
                                                                    int var100 = var82 + class168.method643(var94 & 0x7, var93 & 0x7, var76, var99.field860, var99.field859, var98);
                                                                    int var102 = var94 & 0x7;
                                                                    int var103 = var93 & 0x7;
                                                                    int var105 = var99.field860;
                                                                    int var106 = var99.field859;
                                                                    if ((var98 & 0x1) == 1) {
                                                                        int var107 = var105;
                                                                        var105 = var106;
                                                                        var106 = var107;
                                                                    }
                                                                    int var108 = var76 & 0x3;
                                                                    int var109;
                                                                    if (var108 == 0) {
                                                                        var109 = var103;
                                                                    } else if (var108 == 1) {
                                                                        var109 = 7 - var102 - (var105 - 1);
                                                                    } else if (var108 == 2) {
                                                                        var109 = 7 - var103 - (var106 - 1);
                                                                    } else {
                                                                        var109 = var102;
                                                                    }
                                                                    int var110 = var83 + var109;
                                                                    if (var100 > 0 && var110 > 0 && var100 < 103 && var110 < 103) {
                                                                        int var111 = var71;
                                                                        if ((class6.field68[1][var100][var110] & 0x2) == 2) {
                                                                            var111 = var71 - 1;
                                                                        }
                                                                        class220 var112 = null;
                                                                        if (var111 >= 0) {
                                                                            var112 = var87[var111];
                                                                        }
                                                                        class6.method2789(var71, var100, var110, var89, var76 + var98 & 0x3, var97, var86, var112);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var71++;
                                }
                            }
                            method1907();
                            for (int var58 = 0; var58 < 13; var58++) {
                                for (int var59 = 0; var59 < 13; var59++) {
                                    boolean var60 = false;
                                    int var61 = field309[var57][var58][var59];
                                    if (var61 != -1) {
                                        int var62 = var61 >> 24 & 0x3;
                                        int var63 = var61 >> 1 & 0x3;
                                        int var64 = var61 >> 14 & 0x3FF;
                                        int var65 = var61 >> 3 & 0x7FF;
                                        int var66 = (var64 / 8 << 8) + var65 / 8;
                                        for (int var67 = 0; var67 < Statics.field1689.length; var67++) {
                                            if (Statics.field1689[var67] == var66 && Statics.field62[var67] != null) {
                                                class6.method1465(Statics.field62[var67], var57, var58 * 8, var59 * 8, var62, (var64 & 0x7) * 8, (var65 & 0x7) * 8, var63, field400);
                                                var60 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var60) {
                                        class6.method657(var57, var58 * 8, var59 * 8);
                                    }
                                }
                            }
                            var57++;
                        }
                    }
                    method161(true);
                    method780();
                    method1907();
                    class81 var113 = Statics.field147;
                    class220[] var114 = field400;
                    for (int var115 = 0; var115 < 4; var115++) {
                        for (int var116 = 0; var116 < 104; var116++) {
                            for (int var117 = 0; var117 < 104; var117++) {
                                if ((class6.field68[var115][var116][var117] & 0x1) == 1) {
                                    int var118 = var115;
                                    if ((class6.field68[1][var116][var117] & 0x2) == 2) {
                                        var118 = var115 - 1;
                                    }
                                    if (var118 >= 0) {
                                        var114[var118].method3744(var116, var117);
                                    }
                                }
                            }
                        }
                    }
                    class6.field85 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field85 < -8) {
                        class6.field85 = -8;
                    }
                    if (class6.field85 > 8) {
                        class6.field85 = 8;
                    }
                    class6.field86 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field86 < -16) {
                        class6.field86 = -16;
                    }
                    if (class6.field86 > 16) {
                        class6.field86 = 16;
                    }
                    for (int var119 = 0; var119 < 4; var119++) {
                        byte[][] var120 = Statics.field73[var119];
                        int var121 = (int) Math.sqrt(5100.0D);
                        int var122 = var121 * 768 >> 8;
                        for (int var123 = 1; var123 < 103; var123++) {
                            for (int var124 = 1; var124 < 103; var124++) {
                                int var125 = class6.field67[var119][var124 + 1][var123] - class6.field67[var119][var124 - 1][var123];
                                int var126 = class6.field67[var119][var124][var123 + 1] - class6.field67[var119][var124][var123 - 1];
                                int var127 = (int) Math.sqrt((double) (var126 * var126 + var125 * var125 + 65536));
                                int var128 = (var125 << 8) / var127;
                                int var129 = 65536 / var127;
                                int var130 = (var126 << 8) / var127;
                                int var131 = (var130 * -50 + var128 * -50 + var129 * -10) / var122 + 96;
                                int var132 = (var120[var124][var123] >> 1) + (var120[var124][var123 + 1] >> 3) + (var120[var124][var123 - 1] >> 2) + (var120[var124 - 1][var123] >> 2) + (var120[var124 + 1][var123] >> 3);
                                Statics.field2769[var124][var123] = var131 - var132;
                            }
                        }
                        for (int var133 = 0; var133 < 104; var133++) {
                            Statics.field75[var133] = 0;
                            Statics.field76[var133] = 0;
                            Statics.field80[var133] = 0;
                            Statics.field77[var133] = 0;
                            Statics.field1592[var133] = 0;
                        }
                        for (int var134 = -5; var134 < 109; var134++) {
                            for (int var135 = 0; var135 < 104; var135++) {
                                int var136 = var134 + 5;
                                if (var136 >= 0 && var136 < 104) {
                                    int var137 = Statics.field74[var119][var136][var135] & 0xFF;
                                    if (var137 > 0) {
                                        class39 var138 = class39.method644(var137 - 1);
                                        Statics.field75[var135] += var138.field899;
                                        Statics.field76[var135] += var138.field900;
                                        Statics.field80[var135] += var138.field901;
                                        Statics.field77[var135] += var138.field902;
                                        var10002 = Statics.field1592[var135]++;
                                    }
                                }
                                int var139 = var134 - 5;
                                if (var139 >= 0 && var139 < 104) {
                                    int var140 = Statics.field74[var119][var139][var135] & 0xFF;
                                    if (var140 > 0) {
                                        class39 var141 = class39.method644(var140 - 1);
                                        Statics.field75[var135] -= var141.field899;
                                        Statics.field76[var135] -= var141.field900;
                                        Statics.field80[var135] -= var141.field901;
                                        Statics.field77[var135] -= var141.field902;
                                        var10002 = Statics.field1592[var135]--;
                                    }
                                }
                            }
                            if (var134 >= 1 && var134 < 103) {
                                int var142 = 0;
                                int var143 = 0;
                                int var144 = 0;
                                int var145 = 0;
                                int var146 = 0;
                                for (int var147 = -5; var147 < 109; var147++) {
                                    int var148 = var147 + 5;
                                    if (var148 >= 0 && var148 < 104) {
                                        var142 += Statics.field75[var148];
                                        var143 += Statics.field76[var148];
                                        var144 += Statics.field80[var148];
                                        var145 += Statics.field77[var148];
                                        var146 += Statics.field1592[var148];
                                    }
                                    int var149 = var147 - 5;
                                    if (var149 >= 0 && var149 < 104) {
                                        var142 -= Statics.field75[var149];
                                        var143 -= Statics.field76[var149];
                                        var144 -= Statics.field80[var149];
                                        var145 -= Statics.field77[var149];
                                        var146 -= Statics.field1592[var149];
                                    }
                                    if (var147 >= 1 && var147 < 103 && (!field251 || (class6.field68[0][var134][var147] & 0x2) != 0 || (class6.field68[var119][var134][var147] & 0x10) == 0 && class6.method1906(var119, var134, var147) == field301)) {
                                        if (var119 < class6.field69) {
                                            class6.field69 = var119;
                                        }
                                        int var150 = Statics.field74[var119][var134][var147] & 0xFF;
                                        int var151 = Statics.field71[var119][var134][var147] & 0xFF;
                                        if (var150 > 0 || var151 > 0) {
                                            int var152 = class6.field67[var119][var134][var147];
                                            int var153 = class6.field67[var119][var134 + 1][var147];
                                            int var154 = class6.field67[var119][var134 + 1][var147 + 1];
                                            int var155 = class6.field67[var119][var134][var147 + 1];
                                            int var156 = Statics.field2769[var134][var147];
                                            int var157 = Statics.field2769[var134 + 1][var147];
                                            int var158 = Statics.field2769[var134 + 1][var147 + 1];
                                            int var159 = Statics.field2769[var134][var147 + 1];
                                            int var160 = -1;
                                            int var161 = -1;
                                            if (var150 > 0) {
                                                int var162 = var142 * 256 / var145;
                                                int var163 = var143 / var146;
                                                int var164 = var144 / var146;
                                                var160 = class6.method875(var162, var163, var164);
                                                int var165 = class6.field85 + var162 & 0xFF;
                                                int var166 = class6.field86 + var164;
                                                if (var166 < 0) {
                                                    var166 = 0;
                                                } else if (var166 > 255) {
                                                    var166 = 255;
                                                }
                                                var161 = class6.method875(var165, var163, var166);
                                            }
                                            if (var119 > 0) {
                                                boolean var167 = true;
                                                if (var150 == 0 && Statics.field72[var119][var134][var147] != 0) {
                                                    var167 = false;
                                                }
                                                if (var151 > 0) {
                                                    int var168 = var151 - 1;
                                                    class43 var169 = (class43) class43.field983.method3339((long) var168);
                                                    class43 var170;
                                                    if (var169 == null) {
                                                        byte[] var171 = Statics.field980.method2881(4, var168);
                                                        class43 var172 = new class43();
                                                        if (var171 != null) {
                                                            var172.method878(new class111(var171), var168);
                                                        }
                                                        var172.method877();
                                                        class43.field983.method3341(var172, (long) var168);
                                                        var170 = var172;
                                                    } else {
                                                        var170 = var169;
                                                    }
                                                    if (!var170.field976) {
                                                        var167 = false;
                                                    }
                                                }
                                                if (var167 && var152 == var153 && var152 == var154 && var152 == var155) {
                                                    Statics.field1428[var119][var134][var147] |= 0x924;
                                                }
                                            }
                                            int var173 = 0;
                                            if (var161 != -1) {
                                                var173 = class86.field1487[class6.method1472(var161, 96)];
                                            }
                                            if (var151 == 0) {
                                                var113.method1695(var119, var134, var147, 0, 0, -1, var152, var153, var154, var155, class6.method1472(var160, var156), class6.method1472(var160, var157), class6.method1472(var160, var158), class6.method1472(var160, var159), 0, 0, 0, 0, var173, 0);
                                            } else {
                                                int var174 = Statics.field72[var119][var134][var147] + 1;
                                                byte var175 = Statics.field1535[var119][var134][var147];
                                                int var176 = var151 - 1;
                                                class43 var177 = (class43) class43.field983.method3339((long) var176);
                                                class43 var178;
                                                if (var177 == null) {
                                                    byte[] var179 = Statics.field980.method2881(4, var176);
                                                    class43 var180 = new class43();
                                                    if (var179 != null) {
                                                        var180.method878(new class111(var179), var176);
                                                    }
                                                    var180.method877();
                                                    class43.field983.method3341(var180, (long) var176);
                                                    var178 = var180;
                                                } else {
                                                    var178 = var177;
                                                }
                                                int var182 = var178.field979;
                                                int var183;
                                                int var184;
                                                if (var182 >= 0) {
                                                    var183 = Statics.field1485.method1894(var182);
                                                    var184 = -1;
                                                } else if (var178.field986 == 16711935) {
                                                    var184 = -2;
                                                    var182 = -1;
                                                    var183 = -2;
                                                } else {
                                                    var184 = class6.method875(var178.field977, var178.field978, var178.field984);
                                                    int var185 = class6.field85 + var178.field977 & 0xFF;
                                                    int var186 = class6.field86 + var178.field984;
                                                    if (var186 < 0) {
                                                        var186 = 0;
                                                    } else if (var186 > 255) {
                                                        var186 = 255;
                                                    }
                                                    var183 = class6.method875(var185, var178.field978, var186);
                                                }
                                                int var187 = 0;
                                                if (var183 != -2) {
                                                    var187 = class86.field1487[class6.method661(var183, 96)];
                                                }
                                                if (var178.field981 != -1) {
                                                    int var188 = class6.field85 + var178.field985 & 0xFF;
                                                    int var189 = class6.field86 + var178.field987;
                                                    if (var189 < 0) {
                                                        var189 = 0;
                                                    } else if (var189 > 255) {
                                                        var189 = 255;
                                                    }
                                                    int var190 = class6.method875(var188, var178.field982, var189);
                                                    var187 = class86.field1487[class6.method661(var190, 96)];
                                                }
                                                var113.method1695(var119, var134, var147, var174, var175, var182, var152, var153, var154, var155, class6.method1472(var160, var156), class6.method1472(var160, var157), class6.method1472(var160, var158), class6.method1472(var160, var159), class6.method661(var184, var156), class6.method661(var184, var157), class6.method661(var184, var158), class6.method661(var184, var159), var173, var187);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var191 = 1; var191 < 103; var191++) {
                            for (int var192 = 1; var192 < 103; var192++) {
                                var113.method1652(var119, var192, var191, class6.method1906(var119, var192, var191));
                            }
                        }
                        Statics.field74[var119] = (byte[][]) null;
                        Statics.field71[var119] = (byte[][]) null;
                        Statics.field72[var119] = (byte[][]) null;
                        Statics.field1535[var119] = (byte[][]) null;
                        Statics.field73[var119] = (byte[][]) null;
                    }
                    var113.method1647(-50, -10, -50);
                    for (int var193 = 0; var193 < 104; var193++) {
                        for (int var194 = 0; var194 < 104; var194++) {
                            if ((class6.field68[1][var193][var194] & 0x2) == 2) {
                                var113.method1807(var193, var194);
                            }
                        }
                    }
                    int var195 = 1;
                    int var196 = 2;
                    int var197 = 4;
                    for (int var198 = 0; var198 < 4; var198++) {
                        if (var198 > 0) {
                            var195 <<= 0x3;
                            var196 <<= 0x3;
                            var197 <<= 0x3;
                        }
                        for (int var199 = 0; var199 <= var198; var199++) {
                            for (int var200 = 0; var200 <= 104; var200++) {
                                for (int var201 = 0; var201 <= 104; var201++) {
                                    if ((Statics.field1428[var199][var201][var200] & var195) != 0) {
                                        int var202 = var200;
                                        int var203 = var200;
                                        int var204 = var199;
                                        int var205 = var199;
                                        while (var202 > 0 && (Statics.field1428[var199][var201][var202 - 1] & var195) != 0) {
                                            var202--;
                                        }
                                        while (var203 < 104 && (Statics.field1428[var199][var201][var203 + 1] & var195) != 0) {
                                            var203++;
                                        }
                                        label1890: while (var204 > 0) {
                                            for (int var206 = var202; var206 <= var203; var206++) {
                                                if ((Statics.field1428[var204 - 1][var201][var206] & var195) == 0) {
                                                    break label1890;
                                                }
                                            }
                                            var204--;
                                        }
                                        label1879: while (var205 < var198) {
                                            for (int var207 = var202; var207 <= var203; var207++) {
                                                if ((Statics.field1428[var205 + 1][var201][var207] & var195) == 0) {
                                                    break label1879;
                                                }
                                            }
                                            var205++;
                                        }
                                        int var208 = (var205 + 1 - var204) * (var203 - var202 + 1);
                                        if (var208 >= 8) {
                                            short var209 = 240;
                                            int var210 = class6.field67[var205][var201][var202] - var209;
                                            int var211 = class6.field67[var204][var201][var202];
                                            class81.method1696(var198, 1, var201 * 128, var201 * 128, var202 * 128, var203 * 128 + 128, var210, var211);
                                            for (int var212 = var204; var212 <= var205; var212++) {
                                                for (int var213 = var202; var213 <= var203; var213++) {
                                                    Statics.field1428[var212][var201][var213] &= ~var195;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field1428[var199][var201][var200] & var196) != 0) {
                                        int var214 = var201;
                                        int var215 = var201;
                                        int var216 = var199;
                                        int var217 = var199;
                                        while (var214 > 0 && (Statics.field1428[var199][var214 - 1][var200] & var196) != 0) {
                                            var214--;
                                        }
                                        while (var215 < 104 && (Statics.field1428[var199][var215 + 1][var200] & var196) != 0) {
                                            var215++;
                                        }
                                        label1943: while (var216 > 0) {
                                            for (int var218 = var214; var218 <= var215; var218++) {
                                                if ((Statics.field1428[var216 - 1][var218][var200] & var196) == 0) {
                                                    break label1943;
                                                }
                                            }
                                            var216--;
                                        }
                                        label1932: while (var217 < var198) {
                                            for (int var219 = var214; var219 <= var215; var219++) {
                                                if ((Statics.field1428[var217 + 1][var219][var200] & var196) == 0) {
                                                    break label1932;
                                                }
                                            }
                                            var217++;
                                        }
                                        int var220 = (var217 + 1 - var216) * (var215 - var214 + 1);
                                        if (var220 >= 8) {
                                            short var221 = 240;
                                            int var222 = class6.field67[var217][var214][var200] - var221;
                                            int var223 = class6.field67[var216][var214][var200];
                                            class81.method1696(var198, 2, var214 * 128, var215 * 128 + 128, var200 * 128, var200 * 128, var222, var223);
                                            for (int var224 = var216; var224 <= var217; var224++) {
                                                for (int var225 = var214; var225 <= var215; var225++) {
                                                    Statics.field1428[var224][var225][var200] &= ~var196;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field1428[var199][var201][var200] & var197) != 0) {
                                        int var226 = var201;
                                        int var227 = var201;
                                        int var228 = var200;
                                        int var229 = var200;
                                        while (var228 > 0 && (Statics.field1428[var199][var201][var228 - 1] & var197) != 0) {
                                            var228--;
                                        }
                                        while (var229 < 104 && (Statics.field1428[var199][var201][var229 + 1] & var197) != 0) {
                                            var229++;
                                        }
                                        label1996: while (var226 > 0) {
                                            for (int var230 = var228; var230 <= var229; var230++) {
                                                if ((Statics.field1428[var199][var226 - 1][var230] & var197) == 0) {
                                                    break label1996;
                                                }
                                            }
                                            var226--;
                                        }
                                        label1985: while (var227 < 104) {
                                            for (int var231 = var228; var231 <= var229; var231++) {
                                                if ((Statics.field1428[var199][var227 + 1][var231] & var197) == 0) {
                                                    break label1985;
                                                }
                                            }
                                            var227++;
                                        }
                                        if ((var227 - var226 + 1) * (var229 - var228 + 1) >= 4) {
                                            int var232 = class6.field67[var199][var226][var228];
                                            class81.method1696(var198, 4, var226 * 128, var227 * 128 + 128, var228 * 128, var229 * 128 + 128, var232, var232);
                                            for (int var233 = var226; var233 <= var227; var233++) {
                                                for (int var234 = var228; var234 <= var229; var234++) {
                                                    Statics.field1428[var199][var233][var234] &= ~var197;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method161(true);
                    int var235 = class6.field69;
                    if (var235 > Statics.field1019) {
                        var235 = Statics.field1019;
                    }
                    if (var235 < Statics.field1019 - 1) {
                        int var236 = Statics.field1019 - 1;
                    }
                    if (field251) {
                        Statics.field147.method1649(class6.field69);
                    } else {
                        Statics.field147.method1649(0);
                    }
                    for (int var237 = 0; var237 < 104; var237++) {
                        for (int var238 = 0; var238 < 104; var238++) {
                            method149(var237, var238);
                        }
                    }
                    method1907();
                    method4();
                    class38.field848.method3342();
                    if (Statics.field2132 != null) {
                        field288.method2444(228);
                        field288.method2174(1057001181);
                    }
                    if (!field399) {
                        int var239 = (Statics.field2516 - 6) / 8;
                        int var240 = (Statics.field2516 + 6) / 8;
                        int var241 = (Statics.field907 - 6) / 8;
                        int var242 = (Statics.field907 + 6) / 8;
                        for (int var243 = var239 - 1; var243 <= var240 + 1; var243++) {
                            for (int var244 = var241 - 1; var244 <= var242 + 1; var244++) {
                                if (var243 < var239 || var243 > var240 || var244 < var241 || var244 > var242) {
                                    Statics.field1286.method2901("m" + var243 + "_" + var244);
                                    Statics.field1286.method2901("l" + var243 + "_" + var244);
                                }
                            }
                        }
                    }
                    method125(30);
                    method1907();
                    class6.method2115();
                    field288.method2444(153);
                    class136.method2013();
                } else {
                    field437 = 2;
                }
            } else {
                field437 = 1;
            }
        }
        if (field371 == 30) {
            if (field263 > 1) {
                field263--;
            }
            if (field298 > 0) {
                field298--;
            }
            if (field294) {
                field294 = false;
                method170();
            } else {
                if (!field352) {
                    field397[0] = class148.field2331;
                    field468[0] = "";
                    field395[0] = 1006;
                    field392 = 1;
                }
                for (int var245 = 0; var245 < 100 && method99(); var245++) {
                }
                if (field371 == 30) {
                    while (true) {
                        class201 var246 = (class201) class202.field3033.method3459();
                        boolean var247;
                        if (var246 == null) {
                            var247 = false;
                        } else {
                            var247 = true;
                        }
                        if (!var247) {
                            Object var249 = Statics.field1013.field181;
                            synchronized (Statics.field1013.field181) {
                                if (!field248) {
                                    Statics.field1013.field180 = 0;
                                } else if (class132.field2033 != 0 || Statics.field1013.field180 >= 40) {
                                    field288.method2444(126);
                                    field288.method2158(0);
                                    int var250 = field288.field1867;
                                    int var251 = 0;
                                    for (int var252 = 0; var252 < Statics.field1013.field180 && field288.field1867 - var250 < 240; var252++) {
                                        var251++;
                                        int var253 = Statics.field1013.field182[var252];
                                        if (var253 < 0) {
                                            var253 = 0;
                                        } else if (var253 > 502) {
                                            var253 = 502;
                                        }
                                        int var254 = Statics.field1013.field179[var252];
                                        if (var254 < 0) {
                                            var254 = 0;
                                        } else if (var254 > 764) {
                                            var254 = 764;
                                        }
                                        int var255 = var253 * 765 + var254;
                                        if (Statics.field1013.field182[var252] == -1 && Statics.field1013.field179[var252] == -1) {
                                            var254 = -1;
                                            var253 = -1;
                                            var255 = 524287;
                                        }
                                        if (field428 != var254 || field259 != var253) {
                                            int var256 = var254 - field428;
                                            field428 = var254;
                                            int var257 = var253 - field259;
                                            field259 = var253;
                                            if (field260 < 8 && var256 >= -32 && var256 <= 31 && var257 >= -32 && var257 <= 31) {
                                                var256 += 32;
                                                var257 += 32;
                                                field288.method2159((field260 << 12) + (var256 << 6) + var257);
                                                field260 = 0;
                                            } else if (field260 < 8) {
                                                field288.method2160((field260 << 19) + 8388608 + var255);
                                                field260 = 0;
                                            } else {
                                                field288.method2174((field260 << 19) + -1073741824 + var255);
                                                field260 = 0;
                                            }
                                        } else if (field260 < 2047) {
                                            field260++;
                                        }
                                    }
                                    field288.method2169(field288.field1867 - var250);
                                    if (var251 >= Statics.field1013.field180) {
                                        Statics.field1013.field180 = 0;
                                    } else {
                                        Statics.field1013.field180 -= var251;
                                        for (int var258 = 0; var258 < Statics.field1013.field180; var258++) {
                                            Statics.field1013.field179[var258] = Statics.field1013.field179[var251 + var258];
                                            Statics.field1013.field182[var258] = Statics.field1013.field182[var251 + var258];
                                        }
                                    }
                                }
                            }
                            if (class132.field2033 == 1 || !Statics.field87 && class132.field2033 == 4 || class132.field2033 == 2) {
                                long var260 = (class132.field2036 - field257 * -1L) / 50L;
                                if (var260 > 4095L) {
                                    var260 = 4095L;
                                }
                                field257 = class132.field2036 * -1L;
                                int var262 = class132.field2035;
                                if (var262 < 0) {
                                    var262 = 0;
                                } else if (var262 > Statics.field1957) {
                                    var262 = Statics.field1957;
                                }
                                int var263 = class132.field2034;
                                if (var263 < 0) {
                                    var263 = 0;
                                } else if (var263 > Statics.field1015) {
                                    var263 = Statics.field1015;
                                }
                                int var264 = (int) var260;
                                field288.method2444(21);
                                field288.method2159((var264 << 1) + (class132.field2033 == 2 ? 1 : 0));
                                field288.method2159(var263);
                                field288.method2159(var262);
                            }
                            if (class129.field1993 > 0) {
                                field288.method2444(85);
                                field288.method2159(0);
                                int var265 = field288.field1867;
                                long var266 = class107.method591();
                                for (int var268 = 0; var268 < class129.field1993; var268++) {
                                    long var269 = var266 - field478;
                                    if (var269 > 16777215L) {
                                        var269 = 16777215L;
                                    }
                                    field478 = var266;
                                    field288.method2158(class129.field1996[var268]);
                                    field288.method2241((int) var269);
                                }
                                field288.method2240(field288.field1867 - var265);
                            }
                            if (field358 > 0) {
                                field358--;
                            }
                            if (class129.field1985[96] || class129.field1985[97] || class129.field1985[98] || class129.field1985[99]) {
                                field338 = true;
                            }
                            if (field338 && field358 <= 0) {
                                field358 = 20;
                                field338 = false;
                                field288.method2444(238);
                                field288.method2238(field332);
                                field288.method2203(field331);
                            }
                            if (Statics.field2461 && !field261) {
                                field261 = true;
                                field288.method2444(130);
                                field288.method2158(1);
                            }
                            if (!Statics.field2461 && field261) {
                                field261 = false;
                                field288.method2444(130);
                                field288.method2158(0);
                            }
                            if (field251 && Statics.field1019 != field301) {
                                method3133(Statics.field2516, Statics.field907, Statics.field1019, Statics.field1548.field792[0], Statics.field1548.field793[0]);
                            } else if (Statics.field1019 != field481) {
                                field481 = Statics.field1019;
                                int var271 = Statics.field1019;
                                int[] var272 = Statics.field118.field1317;
                                int var273 = var272.length;
                                for (int var274 = 0; var274 < var273; var274++) {
                                    var272[var274] = 0;
                                }
                                int var275 = 1;
                                while (true) {
                                    if (var275 >= 103) {
                                        int var278 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                        int var279 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                        Statics.field118.method1478();
                                        for (int var280 = 1; var280 < 103; var280++) {
                                            for (int var281 = 1; var281 < 103; var281++) {
                                                if ((class6.field68[var271][var281][var280] & 0x18) == 0) {
                                                    method169(var271, var281, var280, var278, var279);
                                                }
                                                if (var271 < 3 && (class6.field68[var271 + 1][var281][var280] & 0x8) != 0) {
                                                    method169(var271 + 1, var281, var280, var278, var279);
                                                }
                                            }
                                        }
                                        field482 = 0;
                                        for (int var282 = 0; var282 < 104; var282++) {
                                            for (int var283 = 0; var283 < 104; var283++) {
                                                int var284 = Statics.field147.method1677(Statics.field1019, var282, var283);
                                                if (var284 != 0) {
                                                    int var285 = var284 >> 14 & 0x7FFF;
                                                    int var286 = class38.method1473(var285).field873;
                                                    if (var286 >= 0) {
                                                        int var287 = var282;
                                                        int var288 = var283;
                                                        if (var286 != 22 && var286 != 29 && var286 != 34 && var286 != 36 && var286 != 46 && var286 != 47 && var286 != 48) {
                                                            int[][] var289 = field400[Statics.field1019].field3140;
                                                            for (int var290 = 0; var290 < 10; var290++) {
                                                                int var291 = (int) (Math.random() * 4.0D);
                                                                if (var291 == 0 && var287 > 0 && var287 > var282 - 3 && (var289[var287 - 1][var288] & 0x1240108) == 0) {
                                                                    var287--;
                                                                }
                                                                if (var291 == 1 && var287 < 103 && var287 < var282 + 3 && (var289[var287 + 1][var288] & 0x1240180) == 0) {
                                                                    var287++;
                                                                }
                                                                if (var291 == 2 && var288 > 0 && var288 > var283 - 3 && (var289[var287][var288 - 1] & 0x1240102) == 0) {
                                                                    var288--;
                                                                }
                                                                if (var291 == 3 && var288 < 103 && var288 < var283 + 3 && (var289[var287][var288 + 1] & 0x1240120) == 0) {
                                                                    var288++;
                                                                }
                                                            }
                                                        }
                                                        field485[field482] = Statics.field2166[var286];
                                                        field483[field482] = var287;
                                                        field484[field482] = var288;
                                                        field482++;
                                                    }
                                                }
                                            }
                                        }
                                        Statics.field2888.method1468();
                                        break;
                                    }
                                    int var276 = (103 - var275) * 2048 + 24628;
                                    for (int var277 = 1; var277 < 103; var277++) {
                                        if ((class6.field68[var271][var277][var275] & 0x18) == 0) {
                                            Statics.field147.method1682(var272, var276, 512, var271, var277, var275);
                                        }
                                        if (var271 < 3 && (class6.field68[var271 + 1][var277][var275] & 0x8) != 0) {
                                            Statics.field147.method1682(var272, var276, 512, var271 + 1, var277, var275);
                                        }
                                        var276 += 4;
                                    }
                                    var275++;
                                }
                            }
                            if (field371 == 30) {
                                method2442();
                                for (int var292 = 0; var292 < field494; var292++) {
                                    var10002 = field497[var292]--;
                                    if (field497[var292] >= -10) {
                                        class54 var294 = field499[var292];
                                        if (var294 == null) {
                                            class54 var10000 = (class54) null;
                                            var294 = class54.method1131(Statics.field843, field416[var292], 0);
                                            if (var294 == null) {
                                                continue;
                                            }
                                            field497[var292] += var294.method1130();
                                            field499[var292] = var294;
                                        }
                                        if (field497[var292] < 0) {
                                            int var301;
                                            if (field498[var292] == 0) {
                                                var301 = field492;
                                            } else {
                                                int var295 = (field498[var292] & 0xFF) * 128;
                                                int var296 = field498[var292] >> 16 & 0xFF;
                                                int var297 = var296 * 128 + 64 - Statics.field1548.field765;
                                                if (var297 < 0) {
                                                    var297 = -var297;
                                                }
                                                int var298 = field498[var292] >> 8 & 0xFF;
                                                int var299 = var298 * 128 + 64 - Statics.field1548.field741;
                                                if (var299 < 0) {
                                                    var299 = -var299;
                                                }
                                                int var300 = var297 + var299 - 128;
                                                if (var300 > var295) {
                                                    field497[var292] = -100;
                                                    continue;
                                                }
                                                if (var300 < 0) {
                                                    var300 = 0;
                                                }
                                                var301 = field290 * (var295 - var300) / var295;
                                            }
                                            if (var301 > 0) {
                                                class58 var302 = var294.method1129().method1163(Statics.field1011);
                                                class60 var303 = class60.method1186(var302, 100, var301);
                                                var303.method1189(field496[var292] - 1);
                                                Statics.field992.method1078(var303);
                                            }
                                            field497[var292] = -100;
                                        }
                                    } else {
                                        field494--;
                                        for (int var293 = var292; var293 < field494; var293++) {
                                            field416[var293] = field416[var293 + 1];
                                            field499[var293] = field499[var293 + 1];
                                            field496[var293] = field496[var293 + 1];
                                            field497[var293] = field497[var293 + 1];
                                            field498[var293] = field498[var293 + 1];
                                        }
                                        var292--;
                                    }
                                }
                                if (field345 && !class174.method108()) {
                                    if (field489 != 0 && field244 != -1) {
                                        class174.method2991(Statics.field535, field244, 0, field489, false);
                                    }
                                    field345 = false;
                                }
                                field293++;
                                if (field293 > 750) {
                                    method170();
                                } else {
                                    for (int var304 = -1; var304 < field519; var304++) {
                                        int var305;
                                        if (var304 == -1) {
                                            var305 = 2047;
                                        } else {
                                            var305 = field370[var304];
                                        }
                                        class3 var306 = field258[var305];
                                        if (var306 != null) {
                                            method1(var306, 1);
                                        }
                                    }
                                    for (int var307 = 0; var307 < field286; var307++) {
                                        int var308 = field287[var307];
                                        class32 var309 = field285[var308];
                                        if (var309 != null) {
                                            method1(var309, var309.field708.field812);
                                        }
                                    }
                                    for (int var310 = -1; var310 < field519; var310++) {
                                        int var311;
                                        if (var310 == -1) {
                                            var311 = 2047;
                                        } else {
                                            var311 = field370[var310];
                                        }
                                        class3 var312 = field258[var311];
                                        if (var312 != null && var312.field789 > 0) {
                                            var312.field789--;
                                            if (var312.field789 == 0) {
                                                var312.field751 = null;
                                            }
                                        }
                                    }
                                    for (int var313 = 0; var313 < field286; var313++) {
                                        int var314 = field287[var313];
                                        class32 var315 = field285[var314];
                                        if (var315 != null && var315.field789 > 0) {
                                            var315.field789--;
                                            if (var315.field789 == 0) {
                                                var315.field751 = null;
                                            }
                                        }
                                    }
                                    field312++;
                                    if (field357 != 0) {
                                        field356 += 20;
                                        if (field356 >= 400) {
                                            field357 = 0;
                                        }
                                    }
                                    if (Statics.field2014 != null) {
                                        field304++;
                                        if (field304 >= 15) {
                                            method1416(Statics.field2014);
                                            Statics.field2014 = null;
                                        }
                                    }
                                    class164 var316 = Statics.field2050;
                                    class164 var317 = Statics.field2881;
                                    Statics.field2050 = null;
                                    Statics.field2881 = null;
                                    field461 = null;
                                    field431 = false;
                                    field472 = false;
                                    field475 = 0;
                                    while (true) {
                                        while (class129.method1464() && field475 < 128) {
                                            if (field417 >= 2 && class129.field1985[82] && Statics.field2005 == 66) {
                                                String var318 = class11.method102();
                                                Statics.field909.setContents(new StringSelection(var318), (ClipboardOwner) null);
                                            } else {
                                                field477[field475] = Statics.field2005;
                                                field476[field475] = Statics.field1445;
                                                field475++;
                                            }
                                        }
                                        Statics.method1463(field410, 0, 0, Statics.field1015, Statics.field1957, 0, 0);
                                        field435++;
                                        while (true) {
                                            class1 var319;
                                            class164 var320;
                                            class164 var321;
                                            do {
                                                var319 = (class1) field452.method3421();
                                                if (var319 == null) {
                                                    while (true) {
                                                        class1 var322;
                                                        class164 var323;
                                                        class164 var324;
                                                        do {
                                                            var322 = (class1) field480.method3421();
                                                            if (var322 == null) {
                                                                while (true) {
                                                                    class1 var325;
                                                                    class164 var326;
                                                                    class164 var327;
                                                                    do {
                                                                        var325 = (class1) field451.method3421();
                                                                        if (var325 == null) {
                                                                            method909();
                                                                            if (Statics.field1688 == null && field436 == null) {
                                                                                int var328 = class132.field2033;
                                                                                if (field352) {
                                                                                    if (var328 != 1 && (Statics.field87 || var328 != 4)) {
                                                                                        int var329 = class132.field2027;
                                                                                        int var330 = class132.field2038;
                                                                                        if (var329 < Statics.field691 - 10 || var329 > Statics.field691 + Statics.field572 + 10 || var330 < Statics.field1539 - 10 || var330 > Statics.field805 + Statics.field1539 + 10) {
                                                                                            field352 = false;
                                                                                            method1643(Statics.field691, Statics.field1539, Statics.field572, Statics.field805);
                                                                                        }
                                                                                    }
                                                                                    if (var328 == 1 || !Statics.field87 && var328 == 4) {
                                                                                        int var331 = Statics.field691;
                                                                                        int var332 = Statics.field1539;
                                                                                        int var333 = Statics.field572;
                                                                                        int var334 = class132.field2034;
                                                                                        int var335 = class132.field2035;
                                                                                        int var336 = -1;
                                                                                        for (int var337 = 0; var337 < field392; var337++) {
                                                                                            int var338 = (field392 - 1 - var337) * 15 + var332 + 31;
                                                                                            if (var334 > var331 && var334 < var331 + var333 && var335 > var338 - 13 && var335 < var338 + 3) {
                                                                                                var336 = var337;
                                                                                            }
                                                                                        }
                                                                                        if (var336 != -1 && var336 >= 0) {
                                                                                            int var339 = field254[var336];
                                                                                            int var340 = field277[var336];
                                                                                            int var341 = field395[var336];
                                                                                            int var342 = field396[var336];
                                                                                            String var343 = field397[var336];
                                                                                            String var344 = field468[var336];
                                                                                            method613(var339, var340, var341, var342, var343, var344, class132.field2034, class132.field2035);
                                                                                        }
                                                                                        field352 = false;
                                                                                        method1643(Statics.field691, Statics.field1539, Statics.field572, Statics.field805);
                                                                                    }
                                                                                } else {
                                                                                    label2594: {
                                                                                        if ((var328 == 1 || !Statics.field87 && var328 == 4) && field392 > 0) {
                                                                                            int var345 = field395[field392 - 1];
                                                                                            if (var345 == 39 || var345 == 40 || var345 == 41 || var345 == 42 || var345 == 43 || var345 == 33 || var345 == 34 || var345 == 35 || var345 == 36 || var345 == 37 || var345 == 38 || var345 == 1005) {
                                                                                                int var346 = field254[field392 - 1];
                                                                                                int var347 = field277[field392 - 1];
                                                                                                class164 var348 = class164.method733(var347);
                                                                                                if (class169.method2658(method761(var348)) || class169.method2463(method761(var348))) {
                                                                                                    if (Statics.field1688 != null && !field365 && field390 != 1 && !method659(field392 - 1) && field392 > 0) {
                                                                                                        method1833(field362, field363);
                                                                                                    }
                                                                                                    field365 = false;
                                                                                                    field393 = 0;
                                                                                                    if (Statics.field1688 != null) {
                                                                                                        method1416(Statics.field1688);
                                                                                                    }
                                                                                                    Statics.field1688 = class164.method733(var347);
                                                                                                    field361 = var346;
                                                                                                    field362 = class132.field2034;
                                                                                                    field363 = class132.field2035;
                                                                                                    if (field392 > 0) {
                                                                                                        method623(field392 - 1);
                                                                                                    }
                                                                                                    method1416(Statics.field1688);
                                                                                                    break label2594;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if ((var328 == 1 || !Statics.field87 && var328 == 4) && (field390 == 1 && field392 > 2 || method659(field392 - 1))) {
                                                                                            var328 = 2;
                                                                                        }
                                                                                        if ((var328 == 1 || !Statics.field87 && var328 == 4) && field392 > 0) {
                                                                                            int var349 = field392 - 1;
                                                                                            if (var349 >= 0) {
                                                                                                int var350 = field254[var349];
                                                                                                int var351 = field277[var349];
                                                                                                int var352 = field395[var349];
                                                                                                int var353 = field396[var349];
                                                                                                String var354 = field397[var349];
                                                                                                String var355 = field468[var349];
                                                                                                method613(var350, var351, var352, var353, var354, var355, class132.field2034, class132.field2035);
                                                                                            }
                                                                                        }
                                                                                        if (var328 == 2 && field392 > 0) {
                                                                                            method3048(class132.field2034, class132.field2035);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field436 != null) {
                                                                                method604();
                                                                            }
                                                                            if (Statics.field1688 != null) {
                                                                                method1416(Statics.field1688);
                                                                                field393++;
                                                                                if (class132.field2026 == 0) {
                                                                                    if (field365) {
                                                                                        if (Statics.field360 == Statics.field1688 && field522 != field361) {
                                                                                            class164 var356 = Statics.field1688;
                                                                                            byte var357 = 0;
                                                                                            if (field413 == 1 && var356.field2637 == 206) {
                                                                                                var357 = 1;
                                                                                            }
                                                                                            if (var356.field2676[field522] <= 0) {
                                                                                                var357 = 0;
                                                                                            }
                                                                                            if (class169.method2463(method761(var356))) {
                                                                                                int var358 = field361;
                                                                                                int var359 = field522;
                                                                                                var356.field2676[var359] = var356.field2676[var358];
                                                                                                var356.field2636[var359] = var356.field2636[var358];
                                                                                                var356.field2676[var358] = -1;
                                                                                                var356.field2636[var358] = 0;
                                                                                            } else if (var357 == 1) {
                                                                                                int var360 = field361;
                                                                                                int var361 = field522;
                                                                                                while (var360 != var361) {
                                                                                                    if (var360 > var361) {
                                                                                                        var356.method3003(var360 - 1, var360);
                                                                                                        var360--;
                                                                                                    } else if (var360 < var361) {
                                                                                                        var356.method3003(var360 + 1, var360);
                                                                                                        var360++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var356.method3003(field522, field361);
                                                                                            }
                                                                                            field288.method2444(218);
                                                                                            field288.method2197(var357);
                                                                                            field288.method2238(field361);
                                                                                            field288.method2174(Statics.field1688.field2633);
                                                                                            field288.method2203(field522);
                                                                                        }
                                                                                    } else if ((field390 == 1 || method659(field392 - 1)) && field392 > 2) {
                                                                                        method3048(field362, field363);
                                                                                    } else if (field392 > 0) {
                                                                                        method1833(field362, field363);
                                                                                    }
                                                                                    field304 = 10;
                                                                                    class132.field2033 = 0;
                                                                                    Statics.field1688 = null;
                                                                                } else if (field393 >= 5 && (class132.field2027 > field362 + 5 || class132.field2027 < field362 - 5 || class132.field2038 > field363 + 5 || class132.field2038 < field363 - 5)) {
                                                                                    field365 = true;
                                                                                }
                                                                            }
                                                                            if (class81.field1400 != -1) {
                                                                                int var362 = class81.field1400;
                                                                                int var363 = class81.field1417;
                                                                                field288.method2444(178);
                                                                                field288.method2158(5);
                                                                                field288.method2319(class129.field1985[82] ? (class129.field1985[81] ? 2 : 1) : 0);
                                                                                field288.method2159(Statics.field550 + var362);
                                                                                field288.method2203(Statics.field925 + var363);
                                                                                class81.field1400 = -1;
                                                                                field354 = class132.field2034;
                                                                                field403 = class132.field2035;
                                                                                field357 = 1;
                                                                                field356 = 0;
                                                                                field486 = var362;
                                                                                field516 = var363;
                                                                            }
                                                                            if (Statics.field2050 != var316) {
                                                                                if (var316 != null) {
                                                                                    method1416(var316);
                                                                                }
                                                                                if (Statics.field2050 != null) {
                                                                                    method1416(Statics.field2050);
                                                                                }
                                                                            }
                                                                            if (Statics.field2881 != var317 && field402 == field401) {
                                                                                if (var317 != null) {
                                                                                    method1416(var317);
                                                                                }
                                                                                if (Statics.field2881 != null) {
                                                                                    method1416(Statics.field2881);
                                                                                }
                                                                            }
                                                                            if (Statics.field2881 == null) {
                                                                                if (field401 > 0) {
                                                                                    field401--;
                                                                                }
                                                                            } else if (field401 < field402) {
                                                                                field401++;
                                                                                if (field402 == field401) {
                                                                                    method1416(Statics.field2881);
                                                                                }
                                                                            }
                                                                            int var364 = field311 + Statics.field1548.field765;
                                                                            int var365 = field313 + Statics.field1548.field741;
                                                                            if (Statics.field2615 - var364 < -500 || Statics.field2615 - var364 > 500 || Statics.field908 - var365 < -500 || Statics.field908 - var365 > 500) {
                                                                                Statics.field2615 = var364;
                                                                                Statics.field908 = var365;
                                                                            }
                                                                            if (Statics.field2615 != var364) {
                                                                                Statics.field2615 += (var364 - Statics.field2615) / 16;
                                                                            }
                                                                            if (Statics.field908 != var365) {
                                                                                Statics.field908 += (var365 - Statics.field908) / 16;
                                                                            }
                                                                            if (class132.field2026 == 4 && Statics.field87) {
                                                                                int var366 = class132.field2038 - field336;
                                                                                field334 = var366 * 2;
                                                                                field336 = var366 == -1 || var366 == 1 ? class132.field2038 : (field336 + class132.field2038) / 2;
                                                                                int var367 = field335 - class132.field2027;
                                                                                field333 = var367 * 2;
                                                                                field335 = var367 == -1 || var367 == 1 ? class132.field2027 : (field335 + class132.field2027) / 2;
                                                                            } else {
                                                                                if (class129.field1985[96]) {
                                                                                    field333 += (-24 - field333) / 2;
                                                                                } else if (class129.field1985[97]) {
                                                                                    field333 += (24 - field333) / 2;
                                                                                } else {
                                                                                    field333 /= 2;
                                                                                }
                                                                                if (class129.field1985[98]) {
                                                                                    field334 += (12 - field334) / 2;
                                                                                } else if (class129.field1985[99]) {
                                                                                    field334 += (-12 - field334) / 2;
                                                                                } else {
                                                                                    field334 /= 2;
                                                                                }
                                                                                field336 = class132.field2038;
                                                                                field335 = class132.field2027;
                                                                            }
                                                                            field332 = field333 / 2 + field332 & 0x7FF;
                                                                            field331 += field334 / 2;
                                                                            if (field331 < 128) {
                                                                                field331 = 128;
                                                                            }
                                                                            if (field331 > 383) {
                                                                                field331 = 383;
                                                                            }
                                                                            int var368 = Statics.field2615 >> 7;
                                                                            int var369 = Statics.field908 >> 7;
                                                                            int var370 = method2112(Statics.field2615, Statics.field908, Statics.field1019);
                                                                            int var371 = 0;
                                                                            if (var368 > 3 && var369 > 3 && var368 < 100 && var369 < 100) {
                                                                                for (int var372 = var368 - 4; var372 <= var368 + 4; var372++) {
                                                                                    for (int var373 = var369 - 4; var373 <= var369 + 4; var373++) {
                                                                                        int var374 = Statics.field1019;
                                                                                        if (var374 < 3 && (class6.field68[1][var372][var373] & 0x2) == 2) {
                                                                                            var374++;
                                                                                        }
                                                                                        int var375 = var370 - class6.field67[var374][var372][var373];
                                                                                        if (var375 > var371) {
                                                                                            var371 = var375;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var376 = var371 * 192;
                                                                            if (var376 > 98048) {
                                                                                var376 = 98048;
                                                                            }
                                                                            if (var376 < 32768) {
                                                                                var376 = 32768;
                                                                            }
                                                                            if (var376 > field398) {
                                                                                field398 += (var376 - field398) / 24;
                                                                            } else if (var376 < field398) {
                                                                                field398 += (var376 - field398) / 80;
                                                                            }
                                                                            if (field500) {
                                                                                method819();
                                                                            }
                                                                            for (int var377 = 0; var377 < 5; var377++) {
                                                                                var10002 = field506[var377]++;
                                                                            }
                                                                            int var378 = class132.method1403();
                                                                            int var379 = class129.method525();
                                                                            if (var378 > 15000 && var379 > 15000) {
                                                                                field298 = 250;
                                                                                class132.field2021 = 14500;
                                                                                field288.method2444(2);
                                                                            }
                                                                            field317++;
                                                                            if (field317 > 500) {
                                                                                field317 = 0;
                                                                                int var380 = (int) (Math.random() * 8.0D);
                                                                                if ((var380 & 0x1) == 1) {
                                                                                    field311 += field421;
                                                                                }
                                                                                if ((var380 & 0x2) == 2) {
                                                                                    field313 += field314;
                                                                                }
                                                                                if ((var380 & 0x4) == 4) {
                                                                                    field315 += field316;
                                                                                }
                                                                            }
                                                                            if (field311 < -50) {
                                                                                field421 = 2;
                                                                            }
                                                                            if (field311 > 50) {
                                                                                field421 = -2;
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
                                                                                int var381 = (int) (Math.random() * 8.0D);
                                                                                if ((var381 & 0x1) == 1) {
                                                                                    field318 += field319;
                                                                                }
                                                                                if ((var381 & 0x2) == 2) {
                                                                                    field320 += field321;
                                                                                }
                                                                            }
                                                                            if (field318 < -60) {
                                                                                field319 = 2;
                                                                            }
                                                                            if (field318 > 60) {
                                                                                field319 = -2;
                                                                            }
                                                                            if (field320 < -20) {
                                                                                field321 = 1;
                                                                            }
                                                                            if (field320 > 10) {
                                                                                field321 = -1;
                                                                            }
                                                                            for (class36 var382 = (class36) field523.method3367(); var382 != null; var382 = (class36) field523.method3376()) {
                                                                                if ((long) var382.field799 < class107.method591() / 1000L - 5L) {
                                                                                    if (var382.field801 > 0) {
                                                                                        class11.method1835(5, "", var382.field800 + class148.field2334);
                                                                                    }
                                                                                    if (var382.field801 == 0) {
                                                                                        class11.method1835(5, "", var382.field800 + class148.field2335);
                                                                                    }
                                                                                    var382.method3502();
                                                                                }
                                                                            }
                                                                            field282++;
                                                                            if (field282 > 50) {
                                                                                field288.method2444(201);
                                                                            }
                                                                            try {
                                                                                if (Statics.field2544 != null && field288.field1867 > 0) {
                                                                                    Statics.field2544.method2661(field288.field1869, 0, field288.field1867);
                                                                                    field288.field1867 = 0;
                                                                                    field282 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var384) {
                                                                                method170();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var326 = var325.field3;
                                                                        if (var326.field2642 < 0) {
                                                                            break;
                                                                        }
                                                                        var327 = class164.method733(var326.field2624);
                                                                    } while (var327 == null || var327.field2755 == null || var326.field2642 >= var327.field2755.length || var327.field2755[var326.field2642] != var326);
                                                                    class34.method554(var325, 200000);
                                                                }
                                                            }
                                                            var323 = var322.field3;
                                                            if (var323.field2642 < 0) {
                                                                break;
                                                            }
                                                            var324 = class164.method733(var323.field2624);
                                                        } while (var324 == null || var324.field2755 == null || var323.field2642 >= var324.field2755.length || var324.field2755[var323.field2642] != var323);
                                                        class34.method554(var322, 200000);
                                                    }
                                                }
                                                var320 = var319.field3;
                                                if (var320.field2642 < 0) {
                                                    break;
                                                }
                                                var321 = class164.method733(var320.field2624);
                                            } while (var321 == null || var321.field2755 == null || var320.field2642 >= var321.field2755.length || var321.field2755[var320.field2642] != var320);
                                            class34.method554(var319, 200000);
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        field288.method2444(78);
                        field288.method2158(0);
                        int var248 = field288.field1867;
                        class202.method2587(field288);
                        field288.method2169(field288.field1867 - var248);
                    }
                }
            }
        } else if (field371 == 40 || field371 == 45) {
            method173();
        }
    }

    @ObfuscatedName("client.o(I)V")
    public final void method187() {
        boolean var1 = class174.method2792();
        if (var1 && field345 && Statics.field635 != null) {
            Statics.field635.method1092();
        }
        if (field371 == 10 || field371 == 20 || field371 == 30) {
            if (field465 != 0L && class107.method591() > field465) {
                int var2 = field466 ? 2 : 1;
                method797(var2);
            } else if (field2089) {
                method684();
            }
        }
        Dimension var3 = this.method2690();
        if (Statics.field1847 != var3.width || Statics.field1080 != var3.height || field2080) {
            method555();
            field465 = class107.method591() + 500L;
            field2080 = false;
        }
        boolean var4 = false;
        if (field2086) {
            field2086 = false;
            var4 = true;
            for (int var5 = 0; var5 < 100; var5++) {
                field457[var5] = true;
            }
        }
        if (var4) {
            method120();
        }
        if (field371 == 0) {
            int var6 = class30.field677;
            String var7 = class30.field678;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field1309.getGraphics();
                if (Statics.field2011 == null) {
                    Statics.field2011 = new Font("Helvetica", 1, 13);
                    Statics.field2059 = Statics.field1309.getFontMetrics(Statics.field2011);
                }
                if (var4) {
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field1015, Statics.field1957);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field736 == null) {
                        Statics.field736 = Statics.field1309.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field736.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field2011);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field2059.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field736, Statics.field1015 / 2 - 152, Statics.field1957 / 2 - 18, (ImageObserver) null);
                } catch (Exception var44) {
                    int var12 = Statics.field1015 / 2 - 152;
                    int var13 = Statics.field1957 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field2011);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field2059.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var45) {
                Statics.field1309.repaint();
            }
        } else if (field371 == 5) {
            class30.method139(Statics.field1854, Statics.field2796, Statics.field350, var4);
        } else if (field371 == 10 || field371 == 11) {
            class30.method139(Statics.field1854, Statics.field2796, Statics.field350, var4);
        } else if (field371 == 20) {
            class30.method139(Statics.field1854, Statics.field2796, Statics.field350, var4);
        } else if (field371 == 25) {
            if (field437 == 1) {
                if (field342 > field511) {
                    field511 = field342;
                }
                int var15 = (field511 * 50 - field342 * 50) / field511;
                method10(class148.field2219 + class2.field21 + class2.field18 + var15 + "%" + class2.field26, false);
            } else if (field437 == 2) {
                if (field281 > field305) {
                    field305 = field281;
                }
                int var16 = (field305 * 50 - field281 * 50) / field305 + 50;
                method10(class148.field2219 + class2.field21 + class2.field18 + var16 + "%" + class2.field26, false);
            } else {
                method10(class148.field2219, false);
            }
        } else if (field371 == 30) {
            if (field410 != -1) {
                method179(field410);
            }
            for (int var17 = 0; var17 < field455; var17++) {
                if (field457[var17]) {
                    field458[var17] = true;
                }
                field459[var17] = field457[var17];
                field457[var17] = false;
            }
            field456 = field256;
            field412 = -1;
            field518 = -1;
            Statics.field360 = null;
            if (field410 != -1) {
                field455 = 0;
                method2505(field410, 0, 0, Statics.field1015, Statics.field1957, 0, 0, -1);
            }
            class75.method1573();
            if (field352) {
                method645();
            } else if (field412 != -1) {
                int var18 = field412;
                int var19 = field518;
                if (field392 >= 2 || field273 != 0 || field405) {
                    String var20;
                    if (field273 == 1 && field392 < 2) {
                        var20 = class148.field2337 + class148.field2303 + field425 + " " + class2.field20;
                    } else if (field405 && field392 < 2) {
                        var20 = field408 + class148.field2303 + field409 + " " + class2.field20;
                    } else {
                        int var21 = field392 - 1;
                        String var22;
                        if (field468[var21].length() > 0) {
                            var22 = field397[var21] + class148.field2303 + field468[var21];
                        } else {
                            var22 = field397[var21];
                        }
                        var20 = var22;
                    }
                    if (field392 > 2) {
                        var20 = var20 + class2.method281(16777215) + " " + '/' + " " + (field392 - 2) + class148.field2251;
                    }
                    Statics.field1854.method3649(var20, var18 + 4, var19 + 15, 16777215, 0, field256 / 1000);
                }
            }
            if (field464 == 3) {
                for (int var23 = 0; var23 < field455; var23++) {
                    if (field459[var23]) {
                        class75.method1579(field460[var23], field488[var23], field372[var23], field463[var23], 16711935, 128);
                    } else if (field458[var23]) {
                        class75.method1579(field460[var23], field488[var23], field372[var23], field463[var23], 16711680, 128);
                    }
                }
            }
            int var24 = Statics.field1019;
            int var25 = Statics.field1548.field765;
            int var26 = Statics.field1548.field741;
            int var27 = field312;
            for (class22 var28 = (class22) class22.field560.method3415(); var28 != null; var28 = (class22) class22.field560.method3419()) {
                if (var28.field561 != -1 || var28.field567 != null) {
                    int var29 = 0;
                    if (var25 > var28.field557) {
                        var29 += var25 - var28.field557;
                    } else if (var25 < var28.field573) {
                        var29 += var28.field573 - var25;
                    }
                    if (var26 > var28.field570) {
                        var29 += var26 - var28.field570;
                    } else if (var26 < var28.field559) {
                        var29 += var28.field559 - var26;
                    }
                    if (var29 - 64 > var28.field562 || field290 == 0 || var28.field563 != var24) {
                        if (var28.field564 != null) {
                            Statics.field992.method1034(var28.field564);
                            var28.field564 = null;
                        }
                        if (var28.field569 != null) {
                            Statics.field992.method1034(var28.field569);
                            var28.field569 = null;
                        }
                    } else {
                        var29 -= 64;
                        if (var29 < 0) {
                            var29 = 0;
                        }
                        int var30 = field290 * (var28.field562 - var29) / var28.field562;
                        class54 var10000;
                        if (var28.field564 != null) {
                            var28.field564.method1195(var30);
                        } else if (var28.field561 >= 0) {
                            var10000 = (class54) null;
                            class54 var31 = class54.method1131(Statics.field843, var28.field561, 0);
                            if (var31 != null) {
                                class58 var32 = var31.method1129().method1163(Statics.field1011);
                                class60 var33 = class60.method1186(var32, 100, var30);
                                var33.method1189(-1);
                                Statics.field992.method1078(var33);
                                var28.field564 = var33;
                            }
                        }
                        if (var28.field569 != null) {
                            var28.field569.method1195(var30);
                            if (!var28.field569.method3505()) {
                                var28.field569 = null;
                            }
                        } else if (var28.field567 != null && (var28.field568 -= var27) <= 0) {
                            int var34 = (int) (Math.random() * (double) var28.field567.length);
                            var10000 = (class54) null;
                            class54 var35 = class54.method1131(Statics.field843, var28.field567[var34], 0);
                            if (var35 != null) {
                                class58 var36 = var35.method1129().method1163(Statics.field1011);
                                class60 var37 = class60.method1186(var36, 100, var30);
                                var37.method1189(0);
                                Statics.field992.method1078(var37);
                                var28.field569 = var37;
                                var28.field568 = var28.field558 + (int) (Math.random() * (double) (var28.field566 - var28.field558));
                            }
                        }
                    }
                }
            }
            field312 = 0;
        } else if (field371 == 40) {
            method10(class148.field2429 + class2.field21 + class148.field2435, false);
        } else if (field371 == 45) {
            method10(class148.field2352, false);
        }
        if (field371 == 30 && field464 == 0 && !var4) {
            try {
                Graphics var38 = Statics.field1309.getGraphics();
                for (int var39 = 0; var39 < field455; var39++) {
                    if (field458[var39]) {
                        Statics.field2888.method1420(var38, field460[var39], field488[var39], field372[var39], field463[var39]);
                        field458[var39] = false;
                    }
                }
            } catch (Exception var47) {
                Statics.field1309.repaint();
            }
        } else if (field371 > 0) {
            try {
                Graphics var41 = Statics.field1309.getGraphics();
                Statics.field2888.method1419(var41, 0, 0);
                for (int var42 = 0; var42 < field455; var42++) {
                    field458[var42] = false;
                }
            } catch (Exception var46) {
                Statics.field1309.repaint();
            }
        }
    }

    @ObfuscatedName("client.f(I)V")
    public final void method188() {
        if (Statics.field1013 != null) {
            Statics.field1013.field189 = false;
        }
        Statics.field1013 = null;
        if (Statics.field2544 != null) {
            Statics.field2544.method2670();
            Statics.field2544 = null;
        }
        class129.method928();
        class132.method1925();
        Statics.field1544 = null;
        if (Statics.field635 != null) {
            Statics.field635.method1107();
        }
        if (Statics.field1873 != null) {
            Statics.field1873.method1107();
        }
        if (Statics.field1902 != null) {
            Statics.field1902.method2670();
        }
        Object var1 = class161.field2592;
        synchronized (class161.field2592) {
            if (class161.field2594 != 0) {
                class161.field2594 = 1;
                try {
                    class161.field2592.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        try {
            class141.field2119.method3729();
            for (int var4 = 0; var4 < Statics.field184; var4++) {
                Statics.field1266[var4].method3729();
            }
            class141.field2120.method3729();
            class141.field2118.method3729();
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("v.d(II)V")
    public static void method125(int arg0) {
        if (field371 == arg0) {
            return;
        }
        if (field371 == 0) {
            class136.method1924();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field366 = 0;
            field493 = 0;
            field283 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field200 != null) {
            Statics.field200.method2670();
            Statics.field200 = null;
        }
        if (field371 == 25) {
            field437 = 0;
            field342 = 0;
            field511 = 1;
            field281 = 0;
            field305 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            Statics.method607(Statics.field1309, Statics.field185, Statics.field1441, true, 0);
        } else if (arg0 == 20) {
            Statics.method607(Statics.field1309, Statics.field185, Statics.field1441, true, field371 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            Statics.method607(Statics.field1309, Statics.field185, Statics.field1441, false, 4);
        } else if (Statics.field2535) {
            Statics.field3108 = null;
            Statics.field690 = null;
            Statics.field666 = null;
            Statics.field667 = null;
            Statics.field668 = null;
            Statics.field1690 = null;
            Statics.field183 = null;
            Statics.field2827 = null;
            Statics.field1682 = null;
            Statics.field190 = null;
            Statics.field205 = null;
            Statics.field159 = null;
            Statics.field676 = null;
            Statics.field2825 = null;
            Statics.field694 = null;
            Statics.field1481 = null;
            Statics.field581 = null;
            Statics.field3102 = null;
            Statics.field1835 = null;
            Statics.field2966 = null;
            Statics.field2797 = null;
            Statics.field1893 = null;
            class174.method2509(2);
            Statics.method2695(true);
            Statics.field2535 = false;
        }
        field371 = arg0;
    }

    @ObfuscatedName("client.j(I)V")
    public void method189() {
        if (field371 != 1000) {
            boolean var1 = class162.method2913();
            if (!var1) {
                this.method251();
            }
        }
    }

    @ObfuscatedName("client.x(I)V")
    public void method251() {
        if (class162.field2599 >= 4) {
            this.method2688("js5crc");
            field371 = 1000;
            return;
        }
        if (class162.field2614 >= 4) {
            if (field371 <= 5) {
                this.method2688("js5io");
                field371 = 1000;
                return;
            }
            field462 = 3000;
            class162.field2614 = 3;
        }
        if (--field462 + 1 > 0) {
            return;
        }
        try {
            if (field474 == 0) {
                Statics.field19 = Statics.field957.method2550(Statics.field2093, Statics.field585);
                field474++;
            }
            if (field474 == 1) {
                if (Statics.field19.field2106 == 2) {
                    this.method191(-1);
                    return;
                }
                if (Statics.field19.field2106 == 1) {
                    field474++;
                }
            }
            if (field474 == 2) {
                Statics.field59 = new class135((Socket) Statics.field19.field2099, Statics.field957);
                class111 var1 = new class111(5);
                var1.method2158(15);
                var1.method2174(87);
                Statics.field59.method2661(var1.field1869, 0, 5);
                field474++;
                Statics.field2790 = class107.method591();
            }
            if (field474 == 3) {
                if (field371 <= 5 || Statics.field59.method2663() > 0) {
                    int var2 = Statics.field59.method2662();
                    if (var2 != 0) {
                        this.method191(var2);
                        return;
                    }
                    field474++;
                } else if (class107.method591() - Statics.field2790 > 30000L) {
                    this.method191(-2);
                    return;
                }
            }
            if (field474 == 4) {
                class135 var3 = Statics.field59;
                boolean var4 = field371 > 20;
                if (Statics.field1902 != null) {
                    try {
                        Statics.field1902.method2670();
                    } catch (Exception var14) {
                    }
                    Statics.field1902 = null;
                }
                Statics.field1902 = var3;
                Statics.method2695(var4);
                class162.field2607.field1867 = 0;
                Statics.field2606 = null;
                Statics.field3141 = null;
                class162.field2609 = 0;
                while (true) {
                    class163 var6 = (class163) class162.field2611.method3384();
                    if (var6 == null) {
                        while (true) {
                            class163 var7 = (class163) class162.field2604.method3384();
                            if (var7 == null) {
                                if (class162.field2612 != 0) {
                                    try {
                                        class111 var8 = new class111(4);
                                        var8.method2158(4);
                                        var8.method2158(class162.field2612);
                                        var8.method2159(0);
                                        Statics.field1902.method2661(var8.field1869, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field1902.method2670();
                                        } catch (Exception var12) {
                                        }
                                        class162.field2614++;
                                        Statics.field1902 = null;
                                    }
                                }
                                class162.field2596 = 0;
                                Statics.field2608 = class107.method591();
                                Statics.field19 = null;
                                Statics.field59 = null;
                                field474 = 0;
                                field280 = 0;
                                return;
                            }
                            class162.field2595.method3470(var7);
                            class162.field2602.method3391(var7, var7.field3015);
                            class162.field2603++;
                            class162.field2605--;
                        }
                    }
                    class162.field2601.method3391(var6, var6.field3015);
                    class162.field2598++;
                    class162.field2600--;
                }
            }
        } catch (IOException var15) {
            this.method191(-3);
        }
    }

    @ObfuscatedName("client.v(IB)V")
    public void method191(int arg0) {
        Statics.field19 = null;
        Statics.field59 = null;
        field474 = 0;
        if (Statics.field585 == Statics.field2949) {
            Statics.field585 = Statics.field2173;
        } else {
            Statics.field585 = Statics.field2949;
        }
        field280++;
        if (field280 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field371 <= 5) {
                this.method2688("js5connect_full");
                field371 = 1000;
            } else {
                field462 = 3000;
            }
        } else if (field280 >= 2 && arg0 == 6) {
            this.method2688("js5connect_outofdate");
            field371 = 1000;
        } else if (field280 >= 4) {
            if (field371 <= 5) {
                this.method2688("js5connect");
                field371 = 1000;
            } else {
                field462 = 3000;
            }
        }
    }

    @ObfuscatedName("cy.a(B)V")
    public static void method2099() {
        if (field276 == 0) {
            Statics.field147 = new class81(4, 104, 104, class6.field67);
            for (int var0 = 0; var0 < 4; var0++) {
                field400[var0] = new class220(104, 104);
            }
            Statics.field118 = new class74(512, 512);
            class30.field678 = class148.field2199;
            class30.field677 = 5;
            field276 = 20;
        } else if (field276 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class86.field1504[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class81.method1683(var1, 500, 800, 512, 334);
            class30.field678 = class148.field2200;
            class30.field677 = 10;
            field276 = 30;
        } else if (field276 == 30) {
            Statics.field1446 = method818(0, false, true, true);
            Statics.field660 = method818(1, false, true, true);
            Statics.field1439 = method818(2, true, false, true);
            Statics.field1357 = method818(3, false, true, true);
            Statics.field843 = method818(4, false, true, true);
            Statics.field1286 = method818(5, true, true, true);
            Statics.field535 = method818(6, true, true, false);
            Statics.field239 = method818(7, false, true, true);
            Statics.field1441 = method818(8, false, true, true);
            Statics.field844 = method818(9, false, true, true);
            Statics.field185 = method818(10, false, true, true);
            Statics.field303 = method818(11, false, true, true);
            Statics.field2129 = method818(12, false, true, true);
            Statics.field1872 = method818(13, true, false, true);
            Statics.field1545 = method818(14, false, true, false);
            Statics.field129 = method818(15, false, true, true);
            class30.field678 = class148.field2201;
            class30.field677 = 20;
            field276 = 40;
        } else if (field276 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1446.method2958() * 4 / 100;
            int var8 = var7 + Statics.field660.method2958() * 4 / 100;
            int var9 = var8 + Statics.field1439.method2958() * 2 / 100;
            int var10 = var9 + Statics.field1357.method2958() * 2 / 100;
            int var11 = var10 + Statics.field843.method2958() * 6 / 100;
            int var12 = var11 + Statics.field1286.method2958() * 4 / 100;
            int var13 = var12 + Statics.field535.method2958() * 2 / 100;
            int var14 = var13 + Statics.field239.method2958() * 60 / 100;
            int var15 = var14 + Statics.field1441.method2958() * 2 / 100;
            int var16 = var15 + Statics.field844.method2958() * 2 / 100;
            int var17 = var16 + Statics.field185.method2958() * 2 / 100;
            int var18 = var17 + Statics.field303.method2958() * 2 / 100;
            int var19 = var18 + Statics.field2129.method2958() * 2 / 100;
            int var20 = var19 + Statics.field1872.method2958() * 2 / 100;
            int var21 = var20 + Statics.field1545.method2958() * 2 / 100;
            int var22 = var21 + Statics.field129.method2958() * 2 / 100;
            if (var22 == 100) {
                class30.field678 = class148.field2203;
                class30.field677 = 30;
                field276 = 45;
            } else {
                if (var22 != 0) {
                    class30.field678 = class148.field2202 + var22 + "%";
                }
                class30.field677 = 30;
            }
        } else if (field276 == 45) {
            class52.method2616(22050, !field251, 2);
            class175 var23 = new class175();
            var23.method3219(9, 128);
            Statics.field635 = class52.method927(Statics.field957, Statics.field1309, 0, 22050);
            Statics.field635.method1081(var23);
            class159 var24 = Statics.field129;
            class159 var25 = Statics.field1545;
            class159 var26 = Statics.field843;
            Statics.field620 = var24;
            Statics.field2848 = var25;
            Statics.field2846 = var26;
            Statics.field2525 = var23;
            Statics.field1873 = class52.method927(Statics.field957, Statics.field1309, 1, 2048);
            Statics.field992 = new class51();
            Statics.field1873.method1081(Statics.field992);
            Statics.field1011 = new class70(22050, Statics.field1106);
            class30.field678 = class148.field2204;
            class30.field677 = 35;
            field276 = 50;
        } else if (field276 == 50) {
            int var27 = 0;
            if (Statics.field2796 == null) {
                class159 var28 = Statics.field1441;
                class159 var29 = Statics.field1872;
                int var30 = var28.method2892("p11_full");
                int var31 = var28.method2897(var30, "");
                class215 var32;
                if (Statics.method147(var28, var30, var31)) {
                    byte[] var33 = var29.method2881(var30, var31);
                    class215 var34;
                    if (var33 == null) {
                        var34 = null;
                    } else {
                        class215 var35 = new class215(var33, Statics.field2795, Statics.field1293, Statics.field1951, Statics.field135, Statics.field1920, Statics.field1852);
                        class72.method39();
                        var34 = var35;
                    }
                    var32 = var34;
                } else {
                    var32 = null;
                }
                Statics.field2796 = var32;
            } else {
                var27++;
            }
            if (Statics.field350 == null) {
                class159 var37 = Statics.field1441;
                class159 var38 = Statics.field1872;
                int var39 = var37.method2892("p12_full");
                int var40 = var37.method2897(var39, "");
                class215 var41;
                if (Statics.method147(var37, var39, var40)) {
                    byte[] var42 = var38.method2881(var39, var40);
                    class215 var43;
                    if (var42 == null) {
                        var43 = null;
                    } else {
                        class215 var44 = new class215(var42, Statics.field2795, Statics.field1293, Statics.field1951, Statics.field135, Statics.field1920, Statics.field1852);
                        class72.method39();
                        var43 = var44;
                    }
                    var41 = var43;
                } else {
                    var41 = null;
                }
                Statics.field350 = var41;
            } else {
                var27++;
            }
            if (Statics.field1854 == null) {
                class159 var46 = Statics.field1441;
                class159 var47 = Statics.field1872;
                int var48 = var46.method2892("b12_full");
                int var49 = var46.method2897(var48, "");
                class215 var50;
                if (Statics.method147(var46, var48, var49)) {
                    byte[] var51 = var47.method2881(var48, var49);
                    class215 var52;
                    if (var51 == null) {
                        var52 = null;
                    } else {
                        class215 var53 = new class215(var51, Statics.field2795, Statics.field1293, Statics.field1951, Statics.field135, Statics.field1920, Statics.field1852);
                        class72.method39();
                        var52 = var53;
                    }
                    var50 = var52;
                } else {
                    var50 = null;
                }
                Statics.field1854 = var50;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class30.field678 = class148.field2205 + var27 * 100 / 3 + "%";
                class30.field677 = 40;
            } else {
                Statics.field1848 = new class151(true);
                class30.field678 = class148.field2423;
                class30.field677 = 40;
                field276 = 60;
            }
        } else if (field276 == 60) {
            class159 var55 = Statics.field185;
            class159 var56 = Statics.field1441;
            int var57 = 0;
            if (var55.method2880("title.jpg", "")) {
                var57++;
            }
            if (var56.method2880("logo", "")) {
                var57++;
            }
            if (var56.method2880("titlebox", "")) {
                var57++;
            }
            if (var56.method2880("titlebutton", "")) {
                var57++;
            }
            if (var56.method2880("runes", "")) {
                var57++;
            }
            if (var56.method2880("title_mute", "")) {
                var57++;
            }
            if (var56.method2900("options_radio_buttons,0")) {
                var57++;
            }
            if (var56.method2900("options_radio_buttons,2")) {
                var57++;
            }
            var56.method2880("sl_back", "");
            var56.method2880("sl_flags", "");
            var56.method2880("sl_arrows", "");
            var56.method2880("sl_stars", "");
            var56.method2880("sl_button", "");
            int var60 = class30.method779();
            if (var57 < var60) {
                class30.field678 = class148.field2207 + var57 * 100 / var60 + "%";
                class30.field677 = 50;
            } else {
                class30.field678 = class148.field2274;
                class30.field677 = 50;
                method125(5);
                field276 = 70;
            }
        } else if (field276 == 70) {
            if (Statics.field1439.method2885()) {
                class159 var61 = Statics.field1439;
                Statics.field980 = var61;
                class159 var62 = Statics.field1439;
                Statics.field910 = var62;
                class159 var63 = Statics.field1439;
                class159 var64 = Statics.field239;
                Statics.field964 = var63;
                Statics.field958 = var64;
                Statics.field961 = Statics.field964.method2891(3);
                class159 var65 = Statics.field1439;
                class159 var66 = Statics.field239;
                boolean var67 = field251;
                Statics.field845 = var65;
                Statics.field846 = var66;
                class38.field847 = var67;
                class159 var68 = Statics.field1439;
                class159 var69 = Statics.field239;
                Statics.field838 = var68;
                Statics.field811 = var69;
                class47.method640(Statics.field1439, Statics.field239, field250, Statics.field2796);
                class40.method660(Statics.field1439, Statics.field1446, Statics.field660);
                class159 var70 = Statics.field1439;
                class159 var71 = Statics.field239;
                Statics.field944 = var70;
                Statics.field3017 = var71;
                class44.method524(Statics.field1439);
                class159 var72 = Statics.field1439;
                Statics.field1075 = var72;
                Statics.field1074 = Statics.field1075.method2891(16);
                class164.method2786(Statics.field1357, Statics.field239, Statics.field1441, Statics.field1872);
                class46.method737(Statics.field1439);
                class159 var73 = Statics.field1439;
                Statics.field999 = var73;
                class30.field678 = class148.field2210;
                class30.field677 = 60;
                field276 = 80;
            } else {
                class30.field678 = class148.field2209 + Statics.field1439.method2965() + "%";
                class30.field677 = 60;
            }
        } else if (field276 == 80) {
            int var74 = 0;
            if (Statics.field1845 == null) {
                class159 var75 = Statics.field1441;
                int var76 = var75.method2892("compass");
                int var77 = var75.method2897(var76, "");
                class74 var78;
                if (Statics.method147(var75, var76, var77)) {
                    var78 = class72.method144();
                } else {
                    var78 = null;
                }
                Statics.field1845 = var78;
            } else {
                var74++;
            }
            if (Statics.field126 == null) {
                class159 var80 = Statics.field1441;
                int var81 = var80.method2892("mapedge");
                int var82 = var80.method2897(var81, "");
                class74 var83;
                if (Statics.method147(var80, var81, var82)) {
                    var83 = class72.method144();
                } else {
                    var83 = null;
                }
                Statics.field126 = var83;
            } else {
                var74++;
            }
            if (Statics.field580 == null) {
                Statics.field580 = class72.method989(Statics.field1441, "mapscene", "");
            } else {
                var74++;
            }
            if (Statics.field2166 == null) {
                Statics.field2166 = class72.method2445(Statics.field1441, "mapfunction", "");
            } else {
                var74++;
            }
            if (Statics.field1308 == null) {
                Statics.field1308 = class72.method2445(Statics.field1441, "hitmarks", "");
            } else {
                var74++;
            }
            if (Statics.field1574 == null) {
                Statics.field1574 = class72.method2445(Statics.field1441, "headicons_pk", "");
            } else {
                var74++;
            }
            if (Statics.field2072 == null) {
                Statics.field2072 = class72.method2445(Statics.field1441, "headicons_prayer", "");
            } else {
                var74++;
            }
            if (Statics.field2052 == null) {
                Statics.field2052 = class72.method2445(Statics.field1441, "headicons_hint", "");
            } else {
                var74++;
            }
            if (Statics.field324 == null) {
                Statics.field324 = class72.method2445(Statics.field1441, "mapmarker", "");
            } else {
                var74++;
            }
            if (Statics.field1901 == null) {
                Statics.field1901 = class72.method2445(Statics.field1441, "cross", "");
            } else {
                var74++;
            }
            if (Statics.field2154 == null) {
                Statics.field2154 = class72.method2445(Statics.field1441, "mapdots", "");
            } else {
                var74++;
            }
            if (Statics.field1684 == null) {
                Statics.field1684 = class72.method989(Statics.field1441, "scrollbar", "");
            } else {
                var74++;
            }
            if (Statics.field225 == null) {
                Statics.field225 = class72.method989(Statics.field1441, "mod_icons", "");
            } else {
                var74++;
            }
            if (var74 < 13) {
                class30.field678 = class148.field2211 + var74 * 100 / 13 + "%";
                class30.field677 = 70;
            } else {
                Statics.field3088 = Statics.field225;
                Statics.field126.method1517();
                int var85 = (int) (Math.random() * 21.0D) - 10;
                int var86 = (int) (Math.random() * 21.0D) - 10;
                int var87 = (int) (Math.random() * 21.0D) - 10;
                int var88 = (int) (Math.random() * 41.0D) - 20;
                for (int var89 = 0; var89 < Statics.field2166.length; var89++) {
                    Statics.field2166[var89].method1479(var85 + var88, var86 + var88, var87 + var88);
                }
                Statics.field580[0].method1626(var85 + var88, var86 + var88, var87 + var88);
                class30.field678 = class148.field2212;
                class30.field677 = 70;
                field276 = 90;
            }
        } else if (field276 == 90) {
            if (Statics.field844.method2885()) {
                class90 var90 = new class90(Statics.field844, Statics.field1441, 20, 0.8D, field251 ? 64 : 128);
                class86.method1842(var90);
                class86.method1843(0.8D);
                class30.field678 = class148.field2214;
                class30.field677 = 90;
                field276 = 110;
            } else {
                class30.field678 = class148.field2213 + Statics.field844.method2965() + "%";
                class30.field677 = 90;
            }
        } else if (field276 == 110) {
            Statics.field1013 = new class13();
            Statics.field957.method2551(Statics.field1013, 10);
            class30.field678 = class148.field2247;
            class30.field677 = 94;
            field276 = 120;
        } else if (field276 == 120) {
            if (Statics.field185.method2880("huffman", "")) {
                class105 var91 = new class105(Statics.field185.method2898("huffman", ""));
                Statics.field619 = var91;
                class30.field678 = class148.field2443;
                class30.field677 = 96;
                field276 = 130;
            } else {
                class30.field678 = class148.field2216 + "%";
                class30.field677 = 96;
            }
        } else if (field276 == 130) {
            if (!Statics.field1357.method2885()) {
                class30.field678 = class148.field2218 + Statics.field1357.method2965() * 4 / 5 + "%";
                class30.field677 = 100;
            } else if (!Statics.field2129.method2885()) {
                class30.field678 = class148.field2218 + (80 + Statics.field2129.method2965() / 6) + "%";
                class30.field677 = 100;
            } else if (Statics.field1872.method2885()) {
                class30.field678 = class148.field2269;
                class30.field677 = 100;
                field276 = 140;
            } else {
                class30.field678 = class148.field2218 + (96 + Statics.field1872.method2965() / 20) + "%";
                class30.field677 = 100;
            }
        } else if (field276 == 140) {
            method125(10);
        }
    }

    @ObfuscatedName("aj.l(IZZZI)Lfv;")
    public static class159 method818(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class126 var4 = null;
        if (class141.field2119 != null) {
            var4 = new class126(arg0, class141.field2119, Statics.field1266[arg0], 1000000);
        }
        return new class159(var4, Statics.field1941, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("r.h(I)V")
    public static final void method173() {
        try {
            if (field366 == 0) {
                if (Statics.field2544 != null) {
                    Statics.field2544.method2670();
                    Statics.field2544 = null;
                }
                Statics.field1525 = null;
                field294 = false;
                field493 = 0;
                field366 = 1;
            }
            if (field366 == 1) {
                if (Statics.field1525 == null) {
                    Statics.field1525 = Statics.field957.method2550(Statics.field2093, Statics.field585);
                }
                if (Statics.field1525.field2106 == 2) {
                    throw new IOException();
                }
                if (Statics.field1525.field2106 == 1) {
                    Statics.field2544 = new class135((Socket) Statics.field1525.field2099, Statics.field957);
                    Statics.field1525 = null;
                    field366 = 2;
                }
            }
            if (field366 == 2) {
                field288.field1867 = 0;
                field288.method2158(14);
                Statics.field2544.method2661(field288.field1869, 0, 1);
                field450.field1867 = 0;
                field366 = 3;
            }
            if (field366 == 3) {
                if (Statics.field635 != null) {
                    Statics.field635.method1083();
                }
                if (Statics.field1873 != null) {
                    Statics.field1873.method1083();
                }
                int var0 = Statics.field2544.method2662();
                if (Statics.field635 != null) {
                    Statics.field635.method1083();
                }
                if (Statics.field1873 != null) {
                    Statics.field1873.method1083();
                }
                if (var0 != 0) {
                    method778(var0);
                    return;
                }
                field450.field1867 = 0;
                field366 = 5;
            }
            if (field366 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field288.field1867 = 0;
                field288.method2158(1);
                field288.method2158(class30.field685.method517());
                field288.method2174(var1[0]);
                field288.method2174(var1[1]);
                field288.method2174(var1[2]);
                field288.method2174(var1[3]);
                switch(class30.field685.field2476) {
                    case 0:
                        field288.method2174((Integer) Statics.field2092.field127.get(class154.method2418(class30.field664)));
                        field288.field1867 += 4;
                        break;
                    case 1:
                        field288.field1867 += 8;
                        break;
                    case 2:
                    case 3:
                        field288.method2160(Statics.field1295);
                        field288.field1867 += 5;
                }
                field288.method2163(class30.field684);
                field288.method2365(class5.field63, class5.field61);
                field279.field1867 = 0;
                if (field371 == 40) {
                    field279.method2158(18);
                } else {
                    field279.method2158(16);
                }
                field279.method2159(0);
                int var2 = field279.field1867;
                field279.method2174(87);
                field279.method2166(field288.field1869, 0, field288.field1867);
                int var3 = field279.field1867;
                field279.method2163(class30.field664);
                field279.method2158((field466 ? 1 : 0) << 1 | (field251 ? 1 : 0));
                field279.method2159(Statics.field1015);
                field279.method2159(Statics.field1957);
                class114 var4 = field279;
                byte[] var5 = new byte[24];
                try {
                    class141.field2118.method3735(0L);
                    class141.field2118.method3736(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var43) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2166(var5, 0, 24);
                field279.method2163(Statics.field146);
                field279.method2174(Statics.field446);
                class111 var9 = new class111(Statics.field1848.method2801());
                Statics.field1848.method2804(var9);
                field279.method2166(var9.field1869, 0, var9.field1869.length);
                field279.method2158(Statics.field199);
                field279.method2174(Statics.field1446.field2553);
                field279.method2174(Statics.field660.field2553);
                field279.method2174(Statics.field1439.field2553);
                field279.method2174(Statics.field1357.field2553);
                field279.method2174(Statics.field843.field2553);
                field279.method2174(Statics.field1286.field2553);
                field279.method2174(Statics.field535.field2553);
                field279.method2174(Statics.field239.field2553);
                field279.method2174(Statics.field1441.field2553);
                field279.method2174(Statics.field844.field2553);
                field279.method2174(Statics.field185.field2553);
                field279.method2174(Statics.field303.field2553);
                field279.method2174(Statics.field2129.field2553);
                field279.method2174(Statics.field1872.field2553);
                field279.method2174(Statics.field1545.field2553);
                field279.method2174(Statics.field129.field2553);
                field279.method2190(var1, var3, field279.field1867);
                field279.method2240(field279.field1867 - var2);
                Statics.field2544.method2661(field279.field1869, 0, field279.field1867);
                field288.method2420(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field450.method2420(var1);
                field366 = 6;
            }
            if (field366 == 6 && Statics.field2544.method2663() > 0) {
                int var11 = Statics.field2544.method2662();
                if (var11 == 21 && field371 == 20) {
                    field366 = 7;
                } else if (var11 == 2) {
                    field366 = 9;
                } else if (var11 == 15 && field371 == 40) {
                    field288.field1867 = 0;
                    field450.field1867 = 0;
                    field419 = -1;
                    field295 = -1;
                    field296 = -1;
                    field517 = -1;
                    field291 = 0;
                    field293 = 0;
                    field263 = 0;
                    field392 = 0;
                    field352 = false;
                    field386 = 0;
                    field486 = 0;
                    for (int var12 = 0; var12 < field258.length; var12++) {
                        if (field258[var12] != null) {
                            field258[var12].field763 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field285.length; var13++) {
                        if (field285[var13] != null) {
                            field285[var13].field763 = -1;
                        }
                    }
                    class15.field197 = new class187(32);
                    method125(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field457[var14] = true;
                    }
                    method1923();
                    return;
                } else if (var11 == 23 && field283 < 1) {
                    field283++;
                    field366 = 0;
                } else if (var11 == 29) {
                    field366 = 11;
                } else {
                    method778(var11);
                    return;
                }
            }
            if (field366 == 7 && Statics.field2544.method2663() > 0) {
                field284 = (Statics.field2544.method2662() + 3) * 60;
                field366 = 8;
            }
            if (field366 == 8) {
                field493 = 0;
                class30.method755(class148.field2223, class148.field2224, field284 / 60 + class148.field2225);
                if (--field284 <= 0) {
                    field366 = 0;
                }
            } else {
                if (field366 == 9 && Statics.field2544.method2663() >= 13) {
                    boolean var15 = Statics.field2544.method2662() == 1;
                    Statics.field2544.method2673(field450.field1869, 0, 4);
                    field450.field1867 = 0;
                    boolean var16 = false;
                    if (var15) {
                        int var17 = field450.method2422() << 24;
                        int var18 = var17 | field450.method2422() << 16;
                        int var19 = var18 | field450.method2422() << 8;
                        int var20 = var19 | field450.method2422();
                        int var21 = class154.method2418(class30.field664);
                        if (Statics.field2092.field127.size() >= 10 && !Statics.field2092.field127.containsKey(var21)) {
                            Iterator var22 = Statics.field2092.field127.entrySet().iterator();
                            var22.next();
                            var22.remove();
                        }
                        Statics.field2092.field127.put(var21, var20);
                        class9.method2116();
                    }
                    field417 = Statics.field2544.method2662();
                    field347 = Statics.field2544.method2662() == 1;
                    field374 = Statics.field2544.method2662();
                    field374 <<= 0x8;
                    field374 += Statics.field2544.method2662();
                    field375 = Statics.field2544.method2662();
                    Statics.field2544.method2673(field450.field1869, 0, 1);
                    field450.field1867 = 0;
                    field419 = field450.method2422();
                    Statics.field2544.method2673(field450.field1869, 0, 2);
                    field450.field1867 = 0;
                    field291 = field450.method2255();
                    if (field375 == 1) {
                        try {
                            class124.method2513(Statics.field245, "zap");
                        } catch (Throwable var42) {
                        }
                    } else {
                        try {
                            class124.method2513(Statics.field245, "unzap");
                        } catch (Throwable var41) {
                        }
                    }
                    field366 = 10;
                }
                if (field366 != 10) {
                    if (field366 == 11 && Statics.field2544.method2663() >= 2) {
                        field450.field1867 = 0;
                        Statics.field2544.method2673(field450.field1869, 0, 2);
                        field450.field1867 = 0;
                        Statics.field1842 = field450.method2255();
                        field366 = 12;
                    }
                    if (field366 == 12 && Statics.field2544.method2663() >= Statics.field1842) {
                        field450.field1867 = 0;
                        Statics.field2544.method2673(field450.field1869, 0, Statics.field1842);
                        field450.field1867 = 0;
                        String var37 = field450.method2180();
                        String var38 = field450.method2180();
                        String var39 = field450.method2180();
                        class30.method755(var37, var38, var39);
                        method125(10);
                    }
                    field493++;
                    if (field493 > 2000) {
                        if (field283 < 1) {
                            if (Statics.field585 == Statics.field2949) {
                                Statics.field585 = Statics.field2173;
                            } else {
                                Statics.field585 = Statics.field2949;
                            }
                            field283++;
                            field366 = 0;
                        } else {
                            method778(-3);
                        }
                    }
                } else if (Statics.field2544.method2663() >= field291) {
                    field450.field1867 = 0;
                    Statics.field2544.method2673(field450.field1869, 0, field291);
                    field257 = 1L;
                    field260 = -1;
                    Statics.field1013.field180 = 0;
                    Statics.field2461 = true;
                    field261 = true;
                    field478 = -1L;
                    class202.method2788();
                    field288.field1867 = 0;
                    field450.field1867 = 0;
                    field419 = -1;
                    field295 = -1;
                    field296 = -1;
                    field517 = -1;
                    field293 = 0;
                    field263 = 0;
                    field298 = 0;
                    field264 = 0;
                    field392 = 0;
                    field352 = false;
                    class132.field2021 = 0;
                    class11.method1836();
                    field273 = 0;
                    field405 = false;
                    field494 = 0;
                    field311 = (int) (Math.random() * 100.0D) - 50;
                    field313 = (int) (Math.random() * 110.0D) - 55;
                    field315 = (int) (Math.random() * 80.0D) - 40;
                    field318 = (int) (Math.random() * 120.0D) - 60;
                    field320 = (int) (Math.random() * 30.0D) - 20;
                    field332 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field386 = 0;
                    field481 = -1;
                    field486 = 0;
                    field516 = 0;
                    field278 = class19.field531;
                    field519 = 0;
                    field286 = 0;
                    for (int var25 = 0; var25 < 2048; var25++) {
                        field258[var25] = null;
                        field373[var25] = null;
                    }
                    for (int var26 = 0; var26 < 32768; var26++) {
                        field285[var26] = null;
                    }
                    Statics.field1548 = field258[2047] = new class3();
                    field382 = -1;
                    field385.method3420();
                    field490.method3420();
                    for (int var27 = 0; var27 < 4; var27++) {
                        for (int var28 = 0; var28 < 104; var28++) {
                            for (int var29 = 0; var29 < 104; var29++) {
                                field383[var27][var28][var29] = null;
                            }
                        }
                    }
                    field384 = new class190();
                    field424 = 0;
                    field255 = 0;
                    field524 = 0;
                    for (int var30 = 0; var30 < Statics.field1074; var30++) {
                        class48 var31 = class48.method683(var30);
                        if (var31 != null) {
                            class167.field2786[var30] = 0;
                            class167.field2787[var30] = 0;
                        }
                    }
                    for (int var32 = 0; var32 < field448.length; var32++) {
                        field448[var32] = -1;
                    }
                    field394 = -1;
                    if (field410 != -1) {
                        class164.method2852(field410);
                    }
                    for (class4 var33 = (class4) field411.method3384(); var33 != null; var33 = (class4) field411.method3377()) {
                        method2596(var33, true);
                    }
                    field410 = -1;
                    field411 = new class187(8);
                    field414 = null;
                    field352 = false;
                    field392 = 0;
                    field526.method3086((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var34 = 0; var34 < 8; var34++) {
                        field339[var34] = null;
                        field469[var34] = false;
                    }
                    class15.field197 = new class187(32);
                    field427 = true;
                    for (int var35 = 0; var35 < 100; var35++) {
                        field457[var35] = true;
                    }
                    method1923();
                    field479 = null;
                    Statics.field3045 = 0;
                    Statics.field1542 = null;
                    for (int var36 = 0; var36 < 8; var36++) {
                        field380[var36] = new class211();
                    }
                    Statics.field229 = null;
                    Statics.field2516 = -1;
                    method107(false);
                    field419 = -1;
                }
            }
        } catch (IOException var44) {
            if (field283 < 1) {
                if (Statics.field585 == Statics.field2949) {
                    Statics.field585 = Statics.field2173;
                } else {
                    Statics.field585 = Statics.field2949;
                }
                field283++;
                field366 = 0;
            } else {
                method778(-2);
            }
        }
    }

    @ObfuscatedName("ab.c(II)V")
    public static void method778(int arg0) {
        if (arg0 == -3) {
            class30.method755(class148.field2282, class148.field2418, class148.field2228);
        } else if (arg0 == -2) {
            class30.method755(class148.field2229, class148.field2230, class148.field2231);
        } else if (arg0 == -1) {
            class30.method755(class148.field2341, class148.field2396, class148.field2311);
        } else if (arg0 == 3) {
            class30.method755(class148.field2235, class148.field2236, class148.field2237);
        } else if (arg0 == 4) {
            class30.method755(class148.field2238, class148.field2239, class148.field2240);
        } else if (arg0 == 5) {
            class30.method755(class148.field2241, class148.field2242, class148.field2351);
        } else if (arg0 == 6) {
            class30.method755(class148.field2244, class148.field2245, class148.field2246);
        } else if (arg0 == 7) {
            class30.method755(class148.field2187, class148.field2248, class148.field2234);
        } else if (arg0 == 8) {
            class30.method755(class148.field2250, class148.field2365, class148.field2299);
        } else if (arg0 == 9) {
            class30.method755(class148.field2433, class148.field2249, class148.field2198);
        } else if (arg0 == 10) {
            class30.method755(class148.field2256, class148.field2294, class148.field2258);
        } else if (arg0 == 11) {
            class30.method755(class148.field2259, class148.field2370, class148.field2261);
        } else if (arg0 == 12) {
            class30.method755(class148.field2262, class148.field2349, class148.field2264);
        } else if (arg0 == 13) {
            class30.method755(class148.field2305, class148.field2196, class148.field2267);
        } else if (arg0 == 14) {
            class30.method755(class148.field2268, class148.field2300, class148.field2270);
        } else if (arg0 == 16) {
            class30.method755(class148.field2271, class148.field2272, class148.field2345);
        } else if (arg0 == 17) {
            class30.method755(class148.field2347, class148.field2197, class148.field2358);
        } else if (arg0 == 18) {
            class30.method755(class148.field2348, class148.field2278, class148.field2279);
        } else if (arg0 == 19) {
            class30.method755(class148.field2254, class148.field2281, class148.field2404);
        } else if (arg0 == 20) {
            class30.method755(class148.field2283, class148.field2284, class148.field2285);
        } else if (arg0 == 22) {
            class30.method755(class148.field2445, class148.field2287, class148.field2288);
        } else if (arg0 == 23) {
            class30.method755(class148.field2289, class148.field2290, class148.field2291);
        } else if (arg0 == 24) {
            class30.method755(class148.field2336, class148.field2233, class148.field2342);
        } else if (arg0 == 25) {
            class30.method755(class148.field2295, class148.field2186, class148.field2297);
        } else if (arg0 == 26) {
            class30.method755(class148.field2217, class148.field2376, class148.field2266);
        } else if (arg0 == 27) {
            class30.method755(class148.field2301, class148.field2415, class148.field2257);
        } else if (arg0 == 31) {
            class30.method755(class148.field2275, class148.field2277, class148.field2312);
        } else if (arg0 == 32) {
            class30.method755(class148.field2263, class148.field2385, class148.field2359);
        } else if (arg0 == 37) {
            class30.method755(class148.field2316, class148.field2317, class148.field2318);
        } else if (arg0 == 38) {
            class30.method755(class148.field2319, class148.field2320, class148.field2321);
        } else if (arg0 == 55) {
            class30.method755(class148.field2322, class148.field2323, class148.field2327);
        } else if (arg0 == 56) {
            class30.method755(class148.field2416, class148.field2326, class148.field2293);
            method125(11);
            return;
        } else if (arg0 == 57) {
            class30.method755(class148.field2328, class148.field2372, class148.field2276);
            method125(11);
            return;
        } else {
            class30.method755(class148.field2329, class148.field2332, class148.field2333);
        }
        method125(10);
    }

    @ObfuscatedName("o.u(S)V")
    public static final void method73() {
        if (Statics.field2544 != null) {
            Statics.field2544.method2670();
            Statics.field2544 = null;
        }
        method780();
        Statics.field147.method1722();
        for (int var0 = 0; var0 < 4; var0++) {
            field400[var0].method3743();
        }
        System.gc();
        class174.method2509(2);
        field244 = -1;
        field345 = false;
        class22.method1414();
        method125(10);
    }

    @ObfuscatedName("ab.r(I)V")
    public static final void method780() {
        class43.method3();
        class39.method2510();
        class42.method3332();
        class38.method2113();
        class37.method1927();
        class47.method1921();
        class40.method1113();
        class41.field937.method3342();
        class41.field951.method3342();
        class44.method1409();
        class48.method29();
        class170.field2811.method3342();
        class164.field2627.method3342();
        class164.field2682.method3342();
        class164.field2737.method3342();
        class164.field2630.method3342();
        ((class90) Statics.field1485).method1910();
        class20.field545.method3342();
        Statics.field1446.method2894();
        Statics.field660.method2894();
        Statics.field1357.method2894();
        Statics.field843.method2894();
        Statics.field1286.method2894();
        Statics.field535.method2894();
        Statics.field239.method2894();
        Statics.field1441.method2894();
        Statics.field844.method2894();
        Statics.field185.method2894();
        Statics.field303.method2894();
        Statics.field2129.method2894();
    }

    @ObfuscatedName("u.k(I)V")
    public static final void method170() {
        if (field298 > 0) {
            method73();
        } else {
            method125(40);
            Statics.field200 = Statics.field2544;
            Statics.field2544 = null;
        }
    }

    @ObfuscatedName("cl.w(I)V")
    public static final void method1907() {
        if (Statics.field1873 != null) {
            Statics.field1873.method1082();
        }
        if (Statics.field635 != null) {
            Statics.field635.method1082();
        }
    }

    @ObfuscatedName("p.q(Laj;IIII)V")
    public static void method24(class40 arg0, int arg1, int arg2, int arg3) {
        if (field494 >= 50 || field290 == 0 || arg0.field921 == null || arg1 >= arg0.field921.length) {
            return;
        }
        int var4 = arg0.field921[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field416[field494] = var5;
        field496[field494] = var6;
        field497[field494] = 0;
        field499[field494] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field498[field494] = (var8 << 16) + (var9 << 8) + var7;
        field494++;
    }

    @ObfuscatedName("ey.g(IIII)V")
    public static void method2796(int arg0, int arg1, int arg2) {
        if (field492 == 0 || arg1 == 0 || field494 >= 50) {
            return;
        }
        field416[field494] = arg0;
        field496[field494] = arg1;
        field497[field494] = arg2;
        field499[field494] = null;
        field498[field494] = 0;
        field494++;
    }

    @ObfuscatedName("d.z(II)V")
    public static void method98(int arg0) {
        if (arg0 == -1 && !field345) {
            Statics.field2525.method3217();
            class174.field2850 = 1;
            Statics.field2852 = null;
        } else if (arg0 != -1 && field244 != arg0 && field489 != 0 && !field345) {
            class174.method2597(2, Statics.field535, arg0, 0, field489, false);
        }
        field244 = arg0;
    }

    @ObfuscatedName("w.m(Lfi;III)V")
    public static final void method529(class164 arg0, int arg1, int arg2) {
        if (field386 != 0 && field386 != 3 || class132.field2033 != 1 && Statics.field87 || class132.field2033 != 4) {
            return;
        }
        class166 var3 = arg0.method3012(true);
        if (var3 == null) {
            return;
        }
        int var4 = class132.field2034 - arg1;
        int var5 = class132.field2035 - arg2;
        if (!var3.method3050(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2784 / 2;
        int var7 = var5 - var3.field2780 / 2;
        int var8 = field332 + field318 & 0x7FF;
        int var9 = class86.field1504[var8];
        int var10 = class86.field1491[var8];
        int var11 = (field320 + 256) * var9 >> 8;
        int var12 = (field320 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field1548.field765 + var13 >> 7;
        int var16 = Statics.field1548.field741 - var14 >> 7;
        field288.method2444(117);
        field288.method2158(18);
        field288.method2319(class129.field1985[82] ? (class129.field1985[81] ? 2 : 1) : 0);
        field288.method2159(Statics.field550 + var15);
        field288.method2203(Statics.field925 + var16);
        field288.method2158(var6);
        field288.method2158(var7);
        field288.method2159(field332);
        field288.method2158(57);
        field288.method2158(field318);
        field288.method2158(field320);
        field288.method2158(89);
        field288.method2159(Statics.field1548.field765);
        field288.method2159(Statics.field1548.field741);
        field288.method2158(63);
        field486 = var15;
        field516 = var16;
    }

    @ObfuscatedName("fz.y(Ljava/lang/String;I)V")
    public static final void method3066(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2092.field124 = !Statics.field2092.field124;
            class9.method2116();
            if (Statics.field2092.field124) {
                class11.method1835(99, "", "Roofs are now all hidden");
            } else {
                class11.method1835(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field262 = !field262;
        }
        if (field417 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field262 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field262 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method170();
            }
            if (arg0.equalsIgnoreCase("errortest") && field249 == 2) {
                throw new RuntimeException();
            }
        }
        field288.method2444(210);
        field288.method2158(arg0.length() + 1);
        field288.method2163(arg0);
    }

    @ObfuscatedName("aj.n(B)V")
    public static final void method819() {
        int var0 = Statics.field47 * 128 + 64;
        int var1 = Statics.field1785 * 128 + 64;
        int var2 = method2112(var0, var1, Statics.field1019) - Statics.field605;
        if (Statics.field582 < var0) {
            Statics.field582 += Statics.field2910 * (var0 - Statics.field582) / 1000 + Statics.field25;
            if (Statics.field582 > var0) {
                Statics.field582 = var0;
            }
        }
        if (Statics.field582 > var0) {
            Statics.field582 -= Statics.field2910 * (Statics.field582 - var0) / 1000 + Statics.field25;
            if (Statics.field582 < var0) {
                Statics.field582 = var0;
            }
        }
        if (Statics.field2073 < var2) {
            Statics.field2073 += Statics.field2910 * (var2 - Statics.field2073) / 1000 + Statics.field25;
            if (Statics.field2073 > var2) {
                Statics.field2073 = var2;
            }
        }
        if (Statics.field2073 > var2) {
            Statics.field2073 -= Statics.field2910 * (Statics.field2073 - var2) / 1000 + Statics.field25;
            if (Statics.field2073 < var2) {
                Statics.field2073 = var2;
            }
        }
        if (Statics.field1588 < var1) {
            Statics.field1588 += Statics.field2910 * (var1 - Statics.field1588) / 1000 + Statics.field25;
            if (Statics.field1588 > var1) {
                Statics.field1588 = var1;
            }
        }
        if (Statics.field1588 > var1) {
            Statics.field1588 -= Statics.field2910 * (Statics.field1588 - var1) / 1000 + Statics.field25;
            if (Statics.field1588 < var1) {
                Statics.field1588 = var1;
            }
        }
        int var3 = Statics.field1436 * 128 + 64;
        int var4 = Statics.field1007 * 128 + 64;
        int var5 = method2112(var3, var4, Statics.field1019) - Statics.field2003;
        int var6 = var3 - Statics.field582;
        int var7 = var5 - Statics.field2073;
        int var8 = var4 - Statics.field1588;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1097 < var10) {
            Statics.field1097 += Statics.field1673 * (var10 - Statics.field1097) / 1000 + Statics.field501;
            if (Statics.field1097 > var10) {
                Statics.field1097 = var10;
            }
        }
        if (Statics.field1097 > var10) {
            Statics.field1097 -= Statics.field1673 * (Statics.field1097 - var10) / 1000 + Statics.field501;
            if (Statics.field1097 < var10) {
                Statics.field1097 = var10;
            }
        }
        int var12 = var11 - Statics.field974;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field974 += Statics.field1673 * var12 / 1000 + Statics.field501;
            Statics.field974 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field974 -= Statics.field1673 * -var12 / 1000 + Statics.field501;
            Statics.field974 &= 0x7FF;
        }
        int var13 = var11 - Statics.field974;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field974 = var11;
        }
    }

    @ObfuscatedName("t.s(Law;IB)V")
    public static final void method1(class35 arg0, int arg1) {
        if (arg0.field783 > field256) {
            method641(arg0);
        } else if (arg0.field769 >= field256) {
            if (field256 == arg0.field769 || arg0.field748 == -1 || arg0.field772 != 0 || arg0.field771 + 1 > class40.method168(arg0.field748).field920[arg0.field782]) {
                int var2 = arg0.field769 - arg0.field783;
                int var3 = field256 - arg0.field783;
                int var4 = arg0.field779 * 128 + arg0.field742 * 64;
                int var5 = arg0.field781 * 128 + arg0.field742 * 64;
                int var6 = arg0.field780 * 128 + arg0.field742 * 64;
                int var7 = arg0.field777 * 128 + arg0.field742 * 64;
                arg0.field765 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field741 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field750 = 0;
            if (arg0.field785 == 0) {
                arg0.field788 = 1024;
            }
            if (arg0.field785 == 1) {
                arg0.field788 = 1536;
            }
            if (arg0.field785 == 2) {
                arg0.field788 = 0;
            }
            if (arg0.field785 == 3) {
                arg0.field788 = 512;
            }
            arg0.field740 = arg0.field788;
        } else {
            method825(arg0);
        }
        if (arg0.field765 < 128 || arg0.field741 < 128 || arg0.field765 >= 13184 || arg0.field741 >= 13184) {
            arg0.field748 = -1;
            arg0.field743 = -1;
            arg0.field783 = 0;
            arg0.field769 = 0;
            arg0.field765 = arg0.field792[0] * 128 + arg0.field742 * 64;
            arg0.field741 = arg0.field793[0] * 128 + arg0.field742 * 64;
            arg0.method673();
        }
        if (Statics.field1548 == arg0 && (arg0.field765 < 1536 || arg0.field741 < 1536 || arg0.field765 >= 11776 || arg0.field741 >= 11776)) {
            arg0.field748 = -1;
            arg0.field743 = -1;
            arg0.field783 = 0;
            arg0.field769 = 0;
            arg0.field765 = arg0.field792[0] * 128 + arg0.field742 * 64;
            arg0.field741 = arg0.field793[0] * 128 + arg0.field742 * 64;
            arg0.method673();
        }
        method166(arg0);
        method6(arg0);
    }

    @ObfuscatedName("ae.ac(Law;I)V")
    public static final void method641(class35 arg0) {
        int var1 = arg0.field783 - field256;
        int var2 = arg0.field779 * 128 + arg0.field742 * 64;
        int var3 = arg0.field781 * 128 + arg0.field742 * 64;
        arg0.field765 += (var2 - arg0.field765) / var1;
        arg0.field741 += (var3 - arg0.field741) / var1;
        arg0.field750 = 0;
        if (arg0.field785 == 0) {
            arg0.field788 = 1024;
        }
        if (arg0.field785 == 1) {
            arg0.field788 = 1536;
        }
        if (arg0.field785 == 2) {
            arg0.field788 = 0;
        }
        if (arg0.field785 == 3) {
            arg0.field788 = 512;
        }
    }

    @ObfuscatedName("ak.au(Law;I)V")
    public static final void method825(class35 arg0) {
        arg0.field766 = arg0.field796;
        if (arg0.field791 == 0) {
            arg0.field750 = 0;
            return;
        }
        if (arg0.field748 != -1 && arg0.field772 == 0) {
            class40 var1 = class40.method168(arg0.field748);
            if (arg0.field795 > 0 && var1.field929 == 0) {
                arg0.field750++;
                return;
            }
            if (arg0.field795 <= 0 && var1.field930 == 0) {
                arg0.field750++;
                return;
            }
        }
        int var2 = arg0.field765;
        int var3 = arg0.field741;
        int var4 = arg0.field792[arg0.field791 - 1] * 128 + arg0.field742 * 64;
        int var5 = arg0.field793[arg0.field791 - 1] * 128 + arg0.field742 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field765 = var4;
            arg0.field741 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field788 = 1280;
            } else if (var3 > var5) {
                arg0.field788 = 1792;
            } else {
                arg0.field788 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field788 = 768;
            } else if (var3 > var5) {
                arg0.field788 = 256;
            } else {
                arg0.field788 = 512;
            }
        } else if (var3 < var5) {
            arg0.field788 = 1024;
        } else if (var3 > var5) {
            arg0.field788 = 0;
        }
        int var6 = arg0.field788 - arg0.field740 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field747;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field746;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field749;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field797;
        }
        if (var7 == -1) {
            var7 = arg0.field746;
        }
        arg0.field766 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class32) {
            var9 = ((class32) arg0).field708.field840;
        }
        if (var9) {
            if (arg0.field788 != arg0.field740 && arg0.field763 == -1 && arg0.field790 != 0) {
                var8 = 2;
            }
            if (arg0.field791 > 2) {
                var8 = 6;
            }
            if (arg0.field791 > 3) {
                var8 = 8;
            }
            if (arg0.field750 > 0 && arg0.field791 > 1) {
                var8 = 8;
                arg0.field750--;
            }
        } else {
            if (arg0.field791 > 1) {
                var8 = 6;
            }
            if (arg0.field791 > 2) {
                var8 = 8;
            }
            if (arg0.field750 > 0 && arg0.field791 > 1) {
                var8 = 8;
                arg0.field750--;
            }
        }
        if (arg0.field764[arg0.field791 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field766 == arg0.field746 && arg0.field739 != -1) {
            arg0.field766 = arg0.field739;
        }
        if (var2 < var4) {
            arg0.field765 += var8;
            if (arg0.field765 > var4) {
                arg0.field765 = var4;
            }
        } else if (var2 > var4) {
            arg0.field765 -= var8;
            if (arg0.field765 < var4) {
                arg0.field765 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field741 += var8;
            if (arg0.field741 > var5) {
                arg0.field741 = var5;
            }
        } else if (var3 > var5) {
            arg0.field741 -= var8;
            if (arg0.field741 < var5) {
                arg0.field741 = var5;
            }
        }
        if (arg0.field765 == var4 && arg0.field741 == var5) {
            arg0.field791--;
            if (arg0.field795 > 0) {
                arg0.field795--;
            }
        }
    }

    @ObfuscatedName("c.ap(Law;I)V")
    public static final void method166(class35 arg0) {
        if (arg0.field790 == 0) {
            return;
        }
        if (arg0.field763 != -1 && arg0.field763 < 32768) {
            class32 var1 = field285[arg0.field763];
            if (var1 != null) {
                int var2 = arg0.field765 - var1.field765;
                int var3 = arg0.field741 - var1.field741;
                if (var2 != 0 || var3 != 0) {
                    arg0.field788 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field763 >= 32768) {
            int var4 = arg0.field763 - 32768;
            if (field374 == var4) {
                var4 = 2047;
            }
            class3 var5 = field258[var4];
            if (var5 != null) {
                int var6 = arg0.field765 - var5.field765;
                int var7 = arg0.field741 - var5.field741;
                if (var6 != 0 || var7 != 0) {
                    arg0.field788 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field768 != 0 || arg0.field760 != 0) && (arg0.field791 == 0 || arg0.field750 > 0)) {
            int var8 = arg0.field765 - (arg0.field768 * 64 - Statics.field550 * 64 - Statics.field550 * 64);
            int var9 = arg0.field741 - (arg0.field760 * 64 - Statics.field925 * 64 - Statics.field925 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field788 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field768 = 0;
            arg0.field760 = 0;
        }
        int var10 = arg0.field788 - arg0.field740 & 0x7FF;
        if (var10 == 0) {
            arg0.field784 = 0;
            return;
        }
        arg0.field784++;
        if (var10 > 1024) {
            arg0.field740 -= arg0.field790;
            boolean var11 = true;
            if (var10 < arg0.field790 || var10 > 2048 - arg0.field790) {
                arg0.field740 = arg0.field788;
                var11 = false;
            }
            if (arg0.field796 == arg0.field766 && (arg0.field784 > 25 || var11)) {
                if (arg0.field744 == -1) {
                    arg0.field766 = arg0.field746;
                } else {
                    arg0.field766 = arg0.field744;
                }
            }
        } else {
            arg0.field740 += arg0.field790;
            boolean var12 = true;
            if (var10 < arg0.field790 || var10 > 2048 - arg0.field790) {
                arg0.field740 = arg0.field788;
                var12 = false;
            }
            if (arg0.field796 == arg0.field766 && (arg0.field784 > 25 || var12)) {
                if (arg0.field745 == -1) {
                    arg0.field766 = arg0.field746;
                } else {
                    arg0.field766 = arg0.field745;
                }
            }
        }
        arg0.field740 &= 0x7FF;
    }

    @ObfuscatedName("b.ah(Law;I)V")
    public static final void method6(class35 arg0) {
        arg0.field774 = false;
        if (arg0.field766 != -1) {
            class40 var1 = class40.method168(arg0.field766);
            if (var1 == null || var1.field918 == null) {
                arg0.field766 = -1;
            } else {
                arg0.field762++;
                if (arg0.field767 < var1.field918.length && arg0.field762 > var1.field920[arg0.field767]) {
                    arg0.field762 = 1;
                    arg0.field767++;
                    method24(var1, arg0.field767, arg0.field765, arg0.field741);
                }
                if (arg0.field767 >= var1.field918.length) {
                    arg0.field762 = 0;
                    arg0.field767 = 0;
                    method24(var1, arg0.field767, arg0.field765, arg0.field741);
                }
            }
        }
        if (arg0.field743 != -1 && field256 >= arg0.field757) {
            if (arg0.field775 < 0) {
                arg0.field775 = 0;
            }
            int var2 = class41.method113(arg0.field743).field941;
            if (var2 == -1) {
                arg0.field743 = -1;
            } else {
                class40 var3 = class40.method168(var2);
                if (var3 == null || var3.field918 == null) {
                    arg0.field743 = -1;
                } else {
                    arg0.field776++;
                    if (arg0.field775 < var3.field918.length && arg0.field776 > var3.field920[arg0.field775]) {
                        arg0.field776 = 1;
                        arg0.field775++;
                        method24(var3, arg0.field775, arg0.field765, arg0.field741);
                    }
                    if (arg0.field775 >= var3.field918.length && (arg0.field775 < 0 || arg0.field775 >= var3.field918.length)) {
                        arg0.field743 = -1;
                    }
                }
            }
        }
        if (arg0.field748 != -1 && arg0.field772 <= 1) {
            class40 var4 = class40.method168(arg0.field748);
            if (var4.field929 == 1 && arg0.field795 > 0 && arg0.field783 <= field256 && arg0.field769 < field256) {
                arg0.field772 = 1;
                return;
            }
        }
        if (arg0.field748 != -1 && arg0.field772 == 0) {
            class40 var5 = class40.method168(arg0.field748);
            if (var5 == null || var5.field918 == null) {
                arg0.field748 = -1;
            } else {
                arg0.field771++;
                if (arg0.field782 < var5.field918.length && arg0.field771 > var5.field920[arg0.field782]) {
                    arg0.field771 = 1;
                    arg0.field782++;
                    method24(var5, arg0.field782, arg0.field765, arg0.field741);
                }
                if (arg0.field782 >= var5.field918.length) {
                    arg0.field782 -= var5.field916;
                    arg0.field773++;
                    if (arg0.field773 >= var5.field928) {
                        arg0.field748 = -1;
                    } else if (arg0.field782 >= 0 && arg0.field782 < var5.field918.length) {
                        method24(var5, arg0.field782, arg0.field765, arg0.field741);
                    } else {
                        arg0.field748 = -1;
                    }
                }
                arg0.field774 = var5.field924;
            }
        }
        if (arg0.field772 > 0) {
            arg0.field772--;
        }
    }

    @ObfuscatedName("hk.ae(Lp;IIB)V")
    public static void method3571(class3 arg0, int arg1, int arg2) {
        if (arg0.field748 == arg1 && arg1 != -1) {
            int var3 = class40.method168(arg1).field933;
            if (var3 == 1) {
                arg0.field782 = 0;
                arg0.field771 = 0;
                arg0.field772 = arg2;
                arg0.field773 = 0;
            }
            if (var3 == 2) {
                arg0.field773 = 0;
            }
        } else if (arg1 == -1 || arg0.field748 == -1 || class40.method168(arg1).field932 >= class40.method168(arg0.field748).field932) {
            arg0.field748 = arg1;
            arg0.field782 = 0;
            arg0.field771 = 0;
            arg0.field772 = arg2;
            arg0.field773 = 0;
            arg0.field795 = arg0.field791;
        }
    }

    @ObfuscatedName("aj.ag(II)V")
    public static void method797(int arg0) {
        field465 = 0L;
        if (arg0 >= 2) {
            field466 = true;
        } else {
            field466 = false;
        }
        method555();
        if (field371 >= 25) {
            method1923();
        }
        field2086 = true;
    }

    @ObfuscatedName("ay.as(I)V")
    public static void method684() {
        Canvas var0 = Statics.field1309;
        var0.removeKeyListener(class129.field1988);
        var0.removeFocusListener(class129.field1988);
        class129.field1975 = -1;
        Canvas var1 = Statics.field1309;
        var1.removeMouseListener(class132.field2024);
        var1.removeMouseMotionListener(class132.field2024);
        var1.removeFocusListener(class132.field2024);
        class132.field2023 = 0;
        if (Statics.field1544 != null) {
            Statics.field1544.method2498(Statics.field1309);
        }
        Statics.field245.method2716();
        Statics.field1309.setBackground(Color.black);
        class129.method40(Statics.field1309);
        Statics.method655(Statics.field1309);
        if (Statics.field1544 != null) {
            Statics.field1544.method2508(Statics.field1309);
        }
        if (field410 != -1) {
            method1110(field410, Statics.field1015, Statics.field1957, false);
        }
        field2080 = true;
    }

    @ObfuscatedName("ci.at(I)V")
    public static void method1923() {
        field288.method2444(246);
        class114 var0 = field288;
        int var1 = field466 ? 2 : 1;
        var0.method2158(var1);
        field288.method2159(Statics.field1015);
        field288.method2159(Statics.field1957);
    }

    @ObfuscatedName("m.aw(B)V")
    public static void method555() {
        client var0 = Statics.field245;
        synchronized (Statics.field245) {
            Container var1 = Statics.field245.method2744();
            if (var1 != null) {
                Statics.field1847 = Math.max(var1.getSize().width, Statics.field711);
                Statics.field1080 = Math.max(var1.getSize().height, Statics.field2524);
                if (Statics.field2132 == var1) {
                    Insets var2 = Statics.field2132.getInsets();
                    Statics.field1847 -= var2.right + var2.left;
                    Statics.field1080 -= var2.top + var2.bottom;
                }
                if (Statics.field1847 <= 0) {
                    Statics.field1847 = 1;
                }
                if (Statics.field1080 <= 0) {
                    Statics.field1080 = 1;
                }
                int var3 = field466 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field1015 = field467;
                    Statics.field1957 = field388;
                } else {
                    Statics.field1015 = Math.min(Statics.field1847, 7680);
                    Statics.field1957 = Math.min(Statics.field1080, 2160);
                }
                field2084 = (Statics.field1847 - Statics.field1015) / 2;
                field2085 = 0;
                Statics.field1309.setSize(Statics.field1015, Statics.field1957);
                Statics.field2888 = class73.method93(Statics.field1015, Statics.field1957, Statics.field1309);
                if (Statics.field2132 == var1) {
                    Insets var4 = Statics.field2132.getInsets();
                    Statics.field1309.setLocation(field2084 + var4.left, field2085 + var4.top);
                } else {
                    Statics.field1309.setLocation(field2084, field2085);
                }
                method27();
                if (field410 != -1) {
                    method1110(field410, Statics.field1015, Statics.field1957, true);
                }
                method120();
            }
        }
    }

    @ObfuscatedName("p.ay(I)V")
    public static void method27() {
        int var0 = Statics.field1015;
        int var1 = Statics.field1957;
        if (Statics.field1847 < var0) {
            int var2 = Statics.field1847;
        }
        if (Statics.field1080 < var1) {
            int var3 = Statics.field1080;
        }
        if (Statics.field2092 == null) {
            return;
        }
        try {
            client var4 = Statics.field245;
            int var5 = field466 ? 2 : 1;
            class124.method2514(var4, "resize", new Object[] { var5 });
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("x.ao(I)V")
    public static void method120() {
        int var0 = field2084;
        int var1 = field2085;
        int var2 = Statics.field1847 - Statics.field1015 - var0;
        int var3 = Statics.field1080 - Statics.field1957 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field245.method2744();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field2132 == var4) {
                Insets var7 = Statics.field2132.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1080);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1847, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1847 + var5 - var2, var6, var2, Statics.field1080);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1080 + var6 - var3, Statics.field1847, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("b.al(Ljava/lang/String;ZB)V")
    public static final void method10(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field350.method3609(arg0, 250);
        int var6 = Statics.field350.method3613(arg0, 250) * 13;
        class75.method1578(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class75.method1582(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field350.method3669(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1643(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1309.getGraphics();
                Statics.field2888.method1419(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1309.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field455; var13++) {
            if (field460[var13] + field372[var13] > var9 && field460[var13] < var9 + var11 && field488[var13] + field463[var13] > var10 && field488[var13] < var10 + var12) {
                field458[var13] = true;
            }
        }
    }

    @ObfuscatedName("ac.ab(IIIIZI)V")
    public static final void method611(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field274 - field507) * var5 / 100 + field507;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field513) {
            short var8 = field513;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field512) {
                var6 = field512;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class75.method1573();
                    class75.method1578(arg0, arg1, var10, arg3, -16777216);
                    class75.method1578(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field420) {
            short var11 = field420;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field302) {
                var6 = field302;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class75.method1573();
                    class75.method1578(arg0, arg1, arg2, var13, -16777216);
                    class75.method1578(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field426 = arg3 * var6 / 334 << 1;
        if (field418 != arg2 || field453 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < 9; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var18 = class86.field1504[var16];
                var14[var15] = var17 * var18 >> 16;
            }
            class81.method1683(var14, 500, 800, arg2, arg3);
        }
        field515 = arg0;
        field391 = arg1;
        field418 = arg2;
        field453 = arg3;
    }

    @ObfuscatedName("gc.aj(Lae;I)V")
    public static final void method3535(class31 arg0) {
        if (Statics.field1548.field765 >> 7 == field486 && Statics.field1548.field741 >> 7 == field516) {
            field486 = 0;
        }
        int var1 = field519;
        if (class31.field700 == arg0 || class31.field699 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class31.field700 == arg0) {
                var3 = Statics.field1548;
                var4 = 33538048;
            } else if (class31.field699 == arg0) {
                var3 = field258[field382];
                var4 = field382 << 14;
            } else {
                var3 = field258[field370[var2]];
                var4 = field370[var2] << 14;
                if (class31.field701 == arg0 && field382 == field370[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method15() && !var3.field27) {
                var3.field44 = false;
                if ((field251 && field519 > 50 || field519 > 200) && class31.field700 != arg0 && var3.field796 == var3.field766) {
                    var3.field44 = true;
                }
                int var5 = var3.field765 >> 7;
                int var6 = var3.field741 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field39 == null || field256 < var3.field33 || field256 >= var3.field35) {
                        if ((var3.field765 & 0x7F) == 64 && (var3.field741 & 0x7F) == 64) {
                            if (field491 == field297[var5][var6]) {
                                continue;
                            }
                            field297[var5][var6] = field491;
                        }
                        var3.field38 = method2112(var3.field765, var3.field741, Statics.field1019);
                        Statics.field147.method1780(Statics.field1019, var3.field765, var3.field741, var3.field38, 60, var3, var3.field740, var4, var3.field774);
                    } else {
                        var3.field44 = false;
                        var3.field38 = method2112(var3.field765, var3.field741, Statics.field1019);
                        Statics.field147.method1660(Statics.field1019, var3.field765, var3.field741, var3.field38, 60, var3, var3.field740, var4, var3.field40, var3.field41, var3.field29, var3.field43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dh.ak(ZI)V")
    public static final void method2545(boolean arg0) {
        for (int var1 = 0; var1 < field286; var1++) {
            class32 var2 = field285[field287[var1]];
            int var3 = (field287[var1] << 14) + 536870912;
            if (var2 != null && var2.method15() && var2.field708.field831 == arg0 && var2.field708.method687()) {
                int var4 = var2.field765 >> 7;
                int var5 = var2.field741 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field742 == 1 && (var2.field765 & 0x7F) == 64 && (var2.field741 & 0x7F) == 64) {
                        if (field491 == field297[var4][var5]) {
                            continue;
                        }
                        field297[var4][var5] = field491;
                    }
                    if (!var2.field708.field839) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field147.method1780(Statics.field1019, var2.field765, var2.field741, method2112(var2.field765 + (var2.field742 * 64 - 64), var2.field741 + (var2.field742 * 64 - 64), Statics.field1019), var2.field742 * 64 - 64 + 60, var2, var2.field740, var3, var2.field774);
                }
            }
        }
    }

    @ObfuscatedName("fv.ar(B)V")
    public static final void method2979() {
        for (class7 var0 = (class7) field385.method3415(); var0 != null; var0 = (class7) field385.method3419()) {
            if (Statics.field1019 != var0.field90 || field256 > var0.field96) {
                var0.method3506();
            } else if (field256 >= var0.field95) {
                if (var0.field99 > 0) {
                    class32 var1 = field285[var0.field99 - 1];
                    if (var1 != null && var1.field765 >= 0 && var1.field765 < 13312 && var1.field741 >= 0 && var1.field741 < 13312) {
                        var0.method92(var1.field765, var1.field741, method2112(var1.field765, var1.field741, var0.field90) - var0.field91, field256);
                    }
                }
                if (var0.field99 < 0) {
                    int var2 = -var0.field99 - 1;
                    class3 var3;
                    if (field374 == var2) {
                        var3 = Statics.field1548;
                    } else {
                        var3 = field258[var2];
                    }
                    if (var3 != null && var3.field765 >= 0 && var3.field765 < 13312 && var3.field741 >= 0 && var3.field741 < 13312) {
                        var0.method92(var3.field765, var3.field741, method2112(var3.field765, var3.field741, var0.field90) - var0.field91, field256);
                    }
                }
                var0.method97(field312);
                Statics.field147.method1780(Statics.field1019, (int) var0.field105, (int) var0.field107, (int) var0.field101, 60, var0, var0.field109, -1, false);
            }
        }
    }

    @ObfuscatedName("bj.ai(B)I")
    public static final int method1439() {
        if (Statics.field2092.field124) {
            return Statics.field1019;
        }
        int var0 = 3;
        if (Statics.field1097 < 310) {
            int var1 = Statics.field582 >> 7;
            int var2 = Statics.field1588 >> 7;
            int var3 = Statics.field1548.field765 >> 7;
            int var4 = Statics.field1548.field741 >> 7;
            if ((class6.field68[Statics.field1019][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1019;
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
                    if ((class6.field68[Statics.field1019][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1019;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field68[Statics.field1019][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1019;
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
                    if ((class6.field68[Statics.field1019][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1019;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field68[Statics.field1019][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1019;
                        }
                    }
                }
            }
        }
        if ((class6.field68[Statics.field1019][Statics.field1548.field765 >> 7][Statics.field1548.field741 >> 7] & 0x4) != 0) {
            var0 = Statics.field1019;
        }
        return var0;
    }

    @ObfuscatedName("cd.ax(I)I")
    public static final int method2014() {
        if (Statics.field2092.field124) {
            return Statics.field1019;
        } else {
            int var0 = method2112(Statics.field582, Statics.field1588, Statics.field1019);
            return var0 - Statics.field2073 >= 800 || (class6.field68[Statics.field1019][Statics.field582 >> 7][Statics.field1588 >> 7] & 0x4) == 0 ? 3 : Statics.field1019;
        }
    }

    @ObfuscatedName("cf.az(III)V")
    public static final void method1908(int arg0, int arg1) {
        if (field264 == 2) {
            method2480((field267 - Statics.field550 << 7) + field270, (field508 - Statics.field925 << 7) + field271, field376 * 2);
            if (field520 > -1 && field256 % 20 < 10) {
                Statics.field2052[0].method1528(field520 + arg0 - 12, field353 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("hw.aq(Law;IIIIII)V")
    public static final void method3572(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method15()) {
            return;
        }
        if (arg0 instanceof class32) {
            class37 var6 = ((class32) arg0).field708;
            if (var6.field808 != null) {
                var6 = var6.method691();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field519) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field27) {
                return;
            }
            if (var8.field32 != -1 || var8.field30 != -1) {
                method2980(arg0, arg0.field738 + 15);
                if (field520 > -1) {
                    if (var8.field32 != -1) {
                        Statics.field1574[var8.field32].method1528(field520 + arg2 - 12, field353 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field30 != -1) {
                        Statics.field2072[var8.field30].method1528(field520 + arg2 - 12, field353 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field264 == 10 && field266 == field370[arg1]) {
                method2980(arg0, arg0.field738 + 15);
                if (field520 > -1) {
                    Statics.field2052[1].method1528(field520 + arg2 - 12, field353 + arg3 - var7);
                }
            }
        } else {
            class37 var9 = ((class32) arg0).field708;
            if (var9.field808 != null) {
                var9 = var9.method691();
            }
            if (var9.field834 >= 0 && var9.field834 < Statics.field2072.length) {
                method2980(arg0, arg0.field738 + 15);
                if (field520 > -1) {
                    Statics.field2072[var9.field834].method1528(field520 + arg2 - 12, field353 + arg3 - 30);
                }
            }
            if (field264 == 1 && field265 == field287[arg1 - field519] && field256 % 20 < 10) {
                method2980(arg0, arg0.field738 + 15);
                if (field520 > -1) {
                    Statics.field2052[0].method1528(field520 + arg2 - 12, field353 + arg3 - 28);
                }
            }
        }
        if (arg0.field751 != null && (arg1 >= field519 || !arg0.field753 && (field470 == 4 || !arg0.field752 && (field470 == 0 || field470 == 3 || field470 == 1 && method1922(((class3) arg0).field42, false))))) {
            method2980(arg0, arg0.field738);
            if (field520 > -1 && field340 < field514) {
                field368[field340] = Statics.field1854.method3607(arg0.field751) / 2;
                field344[field340] = Statics.field1854.field3087;
                field269[field340] = field520;
                field253[field340] = field353;
                field292[field340] = arg0.field755;
                field351[field340] = arg0.field756;
                field348[field340] = arg0.field789;
                field349[field340] = arg0.field751;
                field340++;
            }
        }
        if (arg0.field794 > field256) {
            method2980(arg0, arg0.field738 + 15);
            if (field520 > -1) {
                int var10;
                if (arg1 < field519) {
                    var10 = 30;
                } else {
                    class37 var11 = ((class32) arg0).field708;
                    var10 = var11.field842;
                }
                int var12 = arg0.field761 * var10 / arg0.field787;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field761 > 0) {
                    var12 = 1;
                }
                class75.method1578(field520 + arg2 - var10 / 2, field353 + arg3 - 3, var12, 5, 65280);
                class75.method1578(field520 + arg2 - var10 / 2 + var12, field353 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field759[var13] > field256) {
                method2980(arg0, arg0.field738 / 2);
                if (field520 > -1) {
                    if (var13 == 1) {
                        field353 -= 20;
                    }
                    if (var13 == 2) {
                        field520 -= 15;
                        field353 -= 10;
                    }
                    if (var13 == 3) {
                        field520 += 15;
                        field353 -= 10;
                    }
                    Statics.field1308[arg0.field758[var13]].method1528(field520 + arg2 - 12, field353 + arg3 - 12);
                    Statics.field2796.method3645(Integer.toString(arg0.field754[var13]), field520 + arg2 - 1, field353 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("c.ad(IIIII)V")
    public static final void method160(int arg0, int arg1, int arg2, int arg3) {
        field340 = 0;
        boolean var4 = false;
        int var5 = -1;
        for (int var6 = -1; var6 < field519 + field286; var6++) {
            class35 var7;
            if (var6 == -1) {
                var7 = Statics.field1548;
            } else if (var6 < field519) {
                var7 = field258[field370[var6]];
                if (field382 == field370[var6]) {
                    var4 = true;
                    var5 = var6;
                    continue;
                }
            } else {
                var7 = field285[field287[var6 - field519]];
            }
            method3572(var7, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method3572(field258[field382], var5, arg0, arg1, arg2, arg3);
        }
        for (int var8 = 0; var8 < field340; var8++) {
            int var9 = field269[var8];
            int var10 = field253[var8];
            int var11 = field368[var8];
            int var12 = field344[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var14 = 0; var14 < var8; var14++) {
                    if (var10 + 2 > field253[var14] - field344[var14] && var10 - var12 < field253[var14] + 2 && var9 - var11 < field368[var14] + field269[var14] && var9 + var11 > field269[var14] - field368[var14] && field253[var14] - field344[var14] < var10) {
                        var10 = field253[var14] - field344[var14];
                        var13 = true;
                    }
                }
            }
            field520 = field269[var8];
            field353 = field253[var8] = var10;
            String var15 = field349[var8];
            if (field341 == 0) {
                int var16 = 16776960;
                if (field292[var8] < 6) {
                    var16 = field272[field292[var8]];
                }
                if (field292[var8] == 6) {
                    var16 = field491 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field292[var8] == 7) {
                    var16 = field491 % 20 < 10 ? 255 : 65535;
                }
                if (field292[var8] == 8) {
                    var16 = field491 % 20 < 10 ? 45056 : 8454016;
                }
                if (field292[var8] == 9) {
                    int var17 = 150 - field348[var8];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (field292[var8] == 10) {
                    int var18 = 150 - field348[var8];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                    }
                }
                if (field292[var8] == 11) {
                    int var19 = 150 - field348[var8];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - (var19 - 100) * 327680;
                    }
                }
                if (field351[var8] == 0) {
                    Statics.field1854.method3645(var15, field520 + arg0, field353 + arg1, var16, 0);
                }
                if (field351[var8] == 1) {
                    Statics.field1854.method3631(var15, field520 + arg0, field353 + arg1, var16, 0, field491);
                }
                if (field351[var8] == 2) {
                    Statics.field1854.method3606(var15, field520 + arg0, field353 + arg1, var16, 0, field491);
                }
                if (field351[var8] == 3) {
                    Statics.field1854.method3618(var15, field520 + arg0, field353 + arg1, var16, 0, field491, 150 - field348[var8]);
                }
                if (field351[var8] == 4) {
                    int var20 = (150 - field348[var8]) * (Statics.field1854.method3607(var15) + 100) / 150;
                    class75.method1575(field520 + arg0 - 50, arg1, field520 + arg0 + 50, arg1 + arg3);
                    Statics.field1854.method3612(var15, field520 + arg0 + 50 - var20, field353 + arg1, var16, 0);
                    class75.method1572(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field351[var8] == 5) {
                    int var21 = 150 - field348[var8];
                    int var22 = 0;
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class75.method1575(arg0, field353 + arg1 - Statics.field1854.field3087 - 1, arg0 + arg2, field353 + arg1 + 5);
                    Statics.field1854.method3645(var15, field520 + arg0, field353 + arg1 + var22, var16, 0);
                    class75.method1572(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1854.method3645(var15, field520 + arg0, field353 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("gv.aa(IIIII)V")
    public static final void method3549(int arg0, int arg1, int arg2, int arg3) {
        if (field357 == 1) {
            Statics.field1901[field356 / 100].method1528(field354 - 8, field403 - 8);
        }
        if (field357 == 2) {
            Statics.field1901[field356 / 100 + 4].method1528(field354 - 8, field403 - 8);
        }
        Statics.method2797();
    }

    @ObfuscatedName("ft.av(Law;II)V")
    public static final void method2980(class35 arg0, int arg1) {
        method2480(arg0.field765, arg0.field741, arg1);
    }

    @ObfuscatedName("dq.an(IIII)V")
    public static final void method2480(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field520 = -1;
            field353 = -1;
            return;
        }
        int var3 = method2112(arg0, arg1, Statics.field1019) - arg2;
        int var4 = arg0 - Statics.field582;
        int var5 = var3 - Statics.field2073;
        int var6 = arg1 - Statics.field1588;
        int var7 = class86.field1504[Statics.field1097];
        int var8 = class86.field1491[Statics.field1097];
        int var9 = class86.field1504[Statics.field974];
        int var10 = class86.field1491[Statics.field974];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field520 = field426 * var11 / var15 + field418 / 2;
            field353 = field426 * var14 / var15 + field453 / 2;
        } else {
            field520 = -1;
            field353 = -1;
        }
    }

    @ObfuscatedName("dj.am(IIII)I")
    public static final int method2112(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field68[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field67[var5][var3][var4] + class6.field67[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field67[var5][var3][var4 + 1] + class6.field67[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("j.bt(ZI)V")
    public static final void method107(boolean arg0) {
        field399 = arg0;
        if (!field399) {
            int var1 = field450.method2173();
            int var2 = field450.method2200();
            int var3 = field450.method2204();
            int var4 = field450.method2204();
            int var5 = (field291 - field450.field1867) / 16;
            Statics.field2588 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var7 = 0; var7 < 4; var7++) {
                    Statics.field2588[var6][var7] = field450.method2177();
                }
            }
            int var8 = field450.method2204();
            Statics.field1689 = new int[var5];
            Statics.field658 = new int[var5];
            Statics.field2536 = new int[var5];
            Statics.field62 = new byte[var5][];
            Statics.field1823 = new byte[var5][];
            boolean var9 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var4 / 8 == 48) {
                var9 = true;
            }
            if (var3 / 8 == 48 && var4 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var3 - 6) / 8; var11 <= (var3 + 6) / 8; var11++) {
                for (int var12 = (var4 - 6) / 8; var12 <= (var4 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1689[var10] = var13;
                        Statics.field658[var10] = Statics.field1286.method2892("m" + var11 + "_" + var12);
                        Statics.field2536[var10] = Statics.field1286.method2892("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method3133(var3, var4, var2, var8, var1);
            return;
        }
        int var14 = field450.method2236();
        int var15 = field450.method2211();
        int var16 = field450.method2211();
        field450.method2423();
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var18 = 0; var18 < 13; var18++) {
                for (int var19 = 0; var19 < 13; var19++) {
                    int var20 = field450.method2439(1);
                    if (var20 == 1) {
                        field309[var17][var18][var19] = field450.method2439(26);
                    } else {
                        field309[var17][var18][var19] = -1;
                    }
                }
            }
        }
        field450.method2425();
        int var21 = (field291 - field450.field1867) / 16;
        Statics.field2588 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var23 = 0; var23 < 4; var23++) {
                Statics.field2588[var22][var23] = field450.method2177();
            }
        }
        int var24 = field450.method2211();
        int var25 = field450.method2211();
        Statics.field1689 = new int[var21];
        Statics.field658 = new int[var21];
        Statics.field2536 = new int[var21];
        Statics.field62 = new byte[var21][];
        Statics.field1823 = new byte[var21][];
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
                            if (Statics.field1689[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1689[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field658[var26] = Statics.field1286.method2892("m" + var35 + "_" + var36);
                            Statics.field2536[var26] = Statics.field1286.method2892("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method3133(var25, var24, var14, var15, var16);
    }

    @ObfuscatedName("fk.br(IIIIIB)V")
    public static final void method3133(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field2516 == arg0 && Statics.field907 == arg1 && field301 == arg2 || !field251) {
            return;
        }
        Statics.field2516 = arg0;
        Statics.field907 = arg1;
        field301 = arg2;
        if (!field251) {
            field301 = 0;
        }
        method125(25);
        method10(class148.field2219, true);
        int var5 = Statics.field550;
        int var6 = Statics.field925;
        Statics.field550 = (arg0 - 6) * 8;
        Statics.field925 = (arg1 - 6) * 8;
        int var7 = Statics.field550 - var5;
        int var8 = Statics.field925 - var6;
        int var9 = Statics.field550;
        int var10 = Statics.field925;
        for (int var11 = 0; var11 < 32768; var11++) {
            class32 var12 = field285[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field792[var13] -= var7;
                    var12.field793[var13] -= var8;
                }
                var12.field765 -= var7 * 128;
                var12.field741 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field258[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field792[var16] -= var7;
                    var15.field793[var16] -= var8;
                }
                var15.field765 -= var7 * 128;
                var15.field741 -= var8 * 128;
            }
        }
        Statics.field1019 = arg2;
        Statics.field1548.method674(arg3, arg4, false);
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
                        field383[var27][var23][var24] = field383[var27][var25][var26];
                    } else {
                        field383[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class16 var28 = (class16) field384.method3415(); var28 != null; var28 = (class16) field384.method3419()) {
            var28.field207 -= var7;
            var28.field217 -= var8;
            if (var28.field207 < 0 || var28.field217 < 0 || var28.field207 >= 104 || var28.field217 >= 104) {
                var28.method3506();
            }
        }
        if (field486 != 0) {
            field486 -= var7;
            field516 -= var8;
        }
        field494 = 0;
        field500 = false;
        field481 = -1;
        field490.method3420();
        field385.method3420();
    }

    @ObfuscatedName("c.bs(ZI)V")
    public static final void method161(boolean arg0) {
        method1907();
        field282++;
        if (field282 < 50 && !arg0) {
            return;
        }
        field282 = 0;
        if (field294 || Statics.field2544 == null) {
            return;
        }
        field288.method2444(201);
        try {
            Statics.field2544.method2661(field288.field1869, 0, field288.field1867);
            field288.field1867 = 0;
        } catch (IOException var2) {
            field294 = true;
        }
    }

    @ObfuscatedName("u.bn(IIIIII)V")
    public static final void method169(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field147.method1674(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field147.method1697(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field118.field1317;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class38 var13 = class38.method1473(var12);
            if (var13.field874 == -1) {
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
                class76 var14 = Statics.field580[var13.field874];
                if (var14 != null) {
                    int var15 = (var13.field860 * 4 - var14.field1335) / 2;
                    int var16 = (var13.field859 * 4 - var14.field1336) / 2;
                    var14.method1623(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field859) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field147.method1824(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field147.method1697(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class38 var22 = class38.method1473(var21);
            if (var22.field874 != -1) {
                class76 var23 = Statics.field580[var22.field874];
                if (var23 != null) {
                    int var24 = (var22.field860 * 4 - var23.field1335) / 2;
                    int var25 = (var22.field859 * 4 - var23.field1336) / 2;
                    var23.method1623(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field859) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field118.field1317;
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
        int var29 = Statics.field147.method1677(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class38 var31 = class38.method1473(var30);
        if (var31.field874 == -1) {
            return;
        }
        class76 var32 = Statics.field580[var31.field874];
        if (var32 != null) {
            int var33 = (var31.field860 * 4 - var32.field1335) / 2;
            int var34 = (var31.field859 * 4 - var32.field1336) / 2;
            var32.method1623(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field859) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("d.bu(B)Z")
    public static final boolean method99() {
        if (Statics.field2544 == null) {
            return false;
        }
        try {
            int var0 = Statics.field2544.method2663();
            if (var0 == 0) {
                return false;
            }
            if (field419 == -1) {
                Statics.field2544.method2673(field450.field1869, 0, 1);
                field450.field1867 = 0;
                field419 = field450.method2422();
                field291 = class179.field2941[field419];
                var0--;
            }
            if (field291 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field2544.method2673(field450.field1869, 0, 1);
                field291 = field450.field1869[0] & 0xFF;
                var0--;
            }
            if (field291 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field2544.method2673(field450.field1869, 0, 2);
                field450.field1867 = 0;
                field291 = field450.method2255();
                var0 -= 2;
            }
            if (var0 < field291) {
                return false;
            }
            field450.field1867 = 0;
            Statics.field2544.method2673(field450.field1869, 0, field291);
            field293 = 0;
            field517 = field296;
            field296 = field295;
            field295 = field419;
            if (field419 == 254) {
                method107(true);
                field419 = -1;
                return true;
            }
            if (field419 == 200) {
                String var1 = field450.method2180();
                Object[] var2 = new Object[var1.length() + 1];
                for (int var3 = var1.length() - 1; var3 >= 0; var3--) {
                    if (var1.charAt(var3) == 's') {
                        var2[var3 + 1] = field450.method2180();
                    } else {
                        var2[var3 + 1] = Integer.valueOf(field450.method2177());
                    }
                }
                var2[0] = Integer.valueOf(field450.method2177());
                class1 var4 = new class1();
                var4.field2 = var2;
                class34.method554(var4, 200000);
                field419 = -1;
                return true;
            }
            if (field419 == 220) {
                int var5 = field450.method2217();
                boolean var6 = field450.method2236() == 1;
                class164 var7 = class164.method733(var5);
                if (var7.field2653 != var6) {
                    var7.field2653 = var6;
                    method1416(var7);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 176) {
                field444 = field435;
                if (field291 == 0) {
                    field479 = null;
                    field337 = null;
                    Statics.field3045 = 0;
                    Statics.field1542 = null;
                    field419 = -1;
                    return true;
                }
                field337 = field450.method2180();
                long var8 = field450.method2248();
                long var10 = var8;
                String var12;
                if (var8 <= 0L || var8 >= 6582952005840035281L) {
                    var12 = null;
                } else if (var8 % 37L == 0L) {
                    var12 = null;
                } else {
                    int var13 = 0;
                    for (long var14 = var8; var14 != 0L; var14 /= 37L) {
                        var13++;
                    }
                    StringBuilder var16 = new StringBuilder(var13);
                    while (var10 != 0L) {
                        long var17 = var10;
                        var10 /= 37L;
                        var16.append(class153.field2523[(int) (var17 - var10 * 37L)]);
                    }
                    var12 = var16.reverse().toString();
                }
                field479 = var12;
                Statics.field2542 = field450.method2358();
                int var19 = field450.method2172();
                if (var19 == 255) {
                    field419 = -1;
                    return true;
                }
                Statics.field3045 = var19;
                class23[] var20 = new class23[100];
                for (int var21 = 0; var21 < Statics.field3045; var21++) {
                    var20[var21] = new class23();
                    var20[var21].field576 = field450.method2180();
                    var20[var21].field586 = class155.method2793(var20[var21].field576, Statics.field1831);
                    var20[var21].field577 = field450.method2255();
                    var20[var21].field578 = field450.method2358();
                    field450.method2180();
                    if (var20[var21].field576.equals(Statics.field1548.field42)) {
                        Statics.field903 = var20[var21].field578;
                    }
                }
                boolean var22 = false;
                int var23 = Statics.field3045;
                while (var23 > 0) {
                    boolean var24 = true;
                    var23--;
                    for (int var25 = 0; var25 < var23; var25++) {
                        if (var20[var25].field586.compareTo(var20[var25 + 1].field586) > 0) {
                            class23 var26 = var20[var25];
                            var20[var25] = var20[var25 + 1];
                            var20[var25 + 1] = var26;
                            var24 = false;
                        }
                    }
                    if (var24) {
                        break;
                    }
                }
                Statics.field1542 = var20;
                field419 = -1;
                return true;
            }
            if (field419 == 82) {
                for (int var27 = 0; var27 < field258.length; var27++) {
                    if (field258[var27] != null) {
                        field258[var27].field748 = -1;
                    }
                }
                for (int var28 = 0; var28 < field285.length; var28++) {
                    if (field285[var28] != null) {
                        field285[var28].field748 = -1;
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 35) {
                int var29 = field450.method2217();
                Statics.field308 = Statics.field957.method2565(var29);
                field419 = -1;
                return true;
            }
            if (field419 == 107) {
                int var30 = field450.method2172();
                int var31 = field450.method2198();
                String var32 = field450.method2180();
                if (var31 >= 1 && var31 <= 8) {
                    if (var32.equalsIgnoreCase("null")) {
                        var32 = null;
                    }
                    field339[var31 - 1] = var32;
                    field469[var31 - 1] = var30 == 0;
                }
                field419 = -1;
                return true;
            }
            if (field419 == 2) {
                int var33 = field450.method2255();
                int var34 = field450.method2172();
                int var35 = field450.method2255();
                method2796(var33, var34, var35);
                field419 = -1;
                return true;
            }
            if (field419 == 105) {
                int var36 = field450.method2177();
                class4 var37 = (class4) field411.method3382((long) var36);
                if (var37 != null) {
                    method2596(var37, true);
                }
                if (field414 != null) {
                    method1416(field414);
                    field414 = null;
                }
                field419 = -1;
                return true;
            }
            if (field419 == 91) {
                int var38 = field450.method2218();
                int var39 = field450.method2177();
                int var40 = field450.method2204();
                if (var40 == 65535) {
                    var40 = -1;
                }
                class164 var41 = class164.method733(var39);
                if (var41.field2710) {
                    var41.field2751 = var40;
                    var41.field2752 = var38;
                    class47 var43 = class47.method2(var40);
                    var41.field2748 = var43.field1020;
                    var41.field2683 = var43.field1050;
                    var41.field2750 = var43.field1039;
                    var41.field2680 = var43.field1040;
                    var41.field2681 = var43.field1024;
                    var41.field2685 = var43.field1038;
                    if (var43.field1042 == 1) {
                        var41.field2702 = 1;
                    } else {
                        var41.field2702 = 2;
                    }
                    if (var41.field2725 > 0) {
                        var41.field2685 = var41.field2685 * 32 / var41.field2725;
                    } else if (var41.field2644 > 0) {
                        var41.field2685 = var41.field2685 * 32 / var41.field2644;
                    }
                    method1416(var41);
                } else if (var40 == -1) {
                    var41.field2638 = 0;
                    field419 = -1;
                    return true;
                } else {
                    class47 var42 = class47.method2(var40);
                    var41.field2638 = 4;
                    var41.field2675 = var40;
                    var41.field2748 = var42.field1020;
                    var41.field2683 = var42.field1050;
                    var41.field2685 = var42.field1038 * 100 / var38;
                    method1416(var41);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 144) {
                Statics.field167 = class122.method3328(field450.method2172());
                field419 = -1;
                return true;
            }
            if (field419 == 160) {
                field486 = field450.method2172();
                if (field486 == 255) {
                    field486 = 0;
                }
                field516 = field450.method2172();
                if (field516 == 255) {
                    field516 = 0;
                }
                field419 = -1;
                return true;
            }
            if (field419 == 20) {
                int var44 = field450.method2211();
                field410 = var44;
                method1110(field410, Statics.field1015, Statics.field1957, false);
                method2791(var44);
                class34.method19(field410);
                for (int var45 = 0; var45 < 100; var45++) {
                    field457[var45] = true;
                }
                field419 = -1;
                return true;
            }
            if (field419 == 18) {
                class114 var46 = field450;
                int var47 = field291;
                class201 var48 = new class201();
                var48.field3022 = var46.method2172();
                var48.field3026 = var46.method2177();
                var48.field3024 = new int[var48.field3022];
                var48.field3025 = new int[var48.field3022];
                var48.field3029 = new Field[var48.field3022];
                var48.field3027 = new int[var48.field3022];
                var48.field3028 = new Method[var48.field3022];
                var48.field3023 = new byte[var48.field3022][][];
                for (int var49 = 0; var49 < var48.field3022; var49++) {
                    try {
                        int var50 = var46.method2172();
                        if (var50 == 0 || var50 == 1 || var50 == 2) {
                            String var51 = var46.method2180();
                            String var52 = var46.method2180();
                            int var53 = 0;
                            if (var50 == 1) {
                                var53 = var46.method2177();
                            }
                            var48.field3024[var49] = var50;
                            var48.field3027[var49] = var53;
                            if (class202.method2487(var51).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var48.field3029[var49] = class202.method2487(var51).getDeclaredField(var52);
                        } else if (var50 == 3 || var50 == 4) {
                            String var54 = var46.method2180();
                            String var55 = var46.method2180();
                            int var56 = var46.method2172();
                            String[] var57 = new String[var56];
                            for (int var58 = 0; var58 < var56; var58++) {
                                var57[var58] = var46.method2180();
                            }
                            String var59 = var46.method2180();
                            byte[][] var60 = new byte[var56][];
                            if (var50 == 3) {
                                for (int var61 = 0; var61 < var56; var61++) {
                                    int var62 = var46.method2177();
                                    var60[var61] = new byte[var62];
                                    var46.method2281(var60[var61], 0, var62);
                                }
                            }
                            var48.field3024[var49] = var50;
                            Class[] var63 = new Class[var56];
                            for (int var64 = 0; var64 < var56; var64++) {
                                var63[var64] = class202.method2487(var57[var64]);
                            }
                            Class var65 = class202.method2487(var59);
                            if (class202.method2487(var54).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var66 = class202.method2487(var54).getDeclaredMethods();
                            Method[] var67 = var66;
                            for (int var68 = 0; var68 < var67.length; var68++) {
                                Method var69 = var67[var68];
                                if (var69.getName().equals(var55)) {
                                    Class[] var70 = var69.getParameterTypes();
                                    if (var63.length == var70.length) {
                                        boolean var71 = true;
                                        for (int var72 = 0; var72 < var63.length; var72++) {
                                            if (var63[var72] != var70[var72]) {
                                                var71 = false;
                                                break;
                                            }
                                        }
                                        if (var71 && var65 == var69.getReturnType()) {
                                            var48.field3028[var49] = var69;
                                        }
                                    }
                                }
                            }
                            var48.field3023[var49] = var60;
                        }
                    } catch (ClassNotFoundException var294) {
                        var48.field3025[var49] = -1;
                    } catch (SecurityException var295) {
                        var48.field3025[var49] = -2;
                    } catch (NullPointerException var296) {
                        var48.field3025[var49] = -3;
                    } catch (Exception var297) {
                        var48.field3025[var49] = -4;
                    } catch (Throwable var298) {
                        var48.field3025[var49] = -5;
                    }
                }
                class202.field3033.method3456(var48);
                field419 = -1;
                return true;
            }
            if (field419 == 86) {
                while (field450.field1867 < field291) {
                    int var78 = field450.method2172();
                    boolean var79 = (var78 & 0x1) == 1;
                    String var80 = field450.method2180();
                    String var81 = field450.method2180();
                    field450.method2180();
                    for (int var82 = 0; var82 < field524; var82++) {
                        class8 var83 = field525[var82];
                        if (var79) {
                            if (var81.equals(var83.field122)) {
                                var83.field122 = var80;
                                var83.field116 = var81;
                                var80 = null;
                                break;
                            }
                        } else if (var80.equals(var83.field122)) {
                            var83.field122 = var80;
                            var83.field116 = var81;
                            var80 = null;
                            break;
                        }
                    }
                    if (var80 != null && field524 < 400) {
                        class8 var84 = new class8();
                        field525[field524] = var84;
                        var84.field122 = var80;
                        var84.field116 = var81;
                        field524++;
                    }
                }
                field443 = field435;
                field419 = -1;
                return true;
            }
            if (field419 == 229) {
                int var85 = field450.method2211();
                int var86 = field450.method2177();
                class164 var87 = class164.method733(var86);
                if (var87.field2638 != 2 || var87.field2675 != var85) {
                    var87.field2638 = 2;
                    var87.field2675 = var85;
                    method1416(var87);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 157) {
                field500 = true;
                Statics.field47 = field450.method2172();
                Statics.field1785 = field450.method2172();
                Statics.field605 = field450.method2255();
                Statics.field25 = field450.method2172();
                Statics.field2910 = field450.method2172();
                if (Statics.field2910 >= 100) {
                    Statics.field582 = Statics.field47 * 128 + 64;
                    Statics.field1588 = Statics.field1785 * 128 + 64;
                    Statics.field2073 = method2112(Statics.field582, Statics.field1588, Statics.field1019) - Statics.field605;
                }
                field419 = -1;
                return true;
            }
            if (field419 == 199) {
                int var88 = field450.method2255();
                int var89 = field450.method2217();
                class164 var90 = class164.method733(var89);
                if (var90.field2638 != 1 || var90.field2675 != var88) {
                    var90.field2638 = 1;
                    var90.field2675 = var88;
                    method1416(var90);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 72) {
                int var91 = field450.method2218();
                class164 var92 = class164.method733(var91);
                for (int var93 = 0; var93 < var92.field2676.length; var93++) {
                    var92.field2676[var93] = -1;
                    var92.field2676[var93] = 0;
                }
                method1416(var92);
                field419 = -1;
                return true;
            }
            if (field419 == 38) {
                int var94 = field450.method2172();
                int var95 = field450.method2172();
                int var96 = field450.method2172();
                int var97 = field450.method2172();
                field502[var94] = true;
                field503[var94] = var95;
                field504[var94] = var96;
                field246[var94] = var97;
                field506[var94] = 0;
                field419 = -1;
                return true;
            }
            if (field419 == 29) {
                field264 = field450.method2172();
                if (field264 == 1) {
                    field265 = field450.method2255();
                }
                if (field264 >= 2 && field264 <= 6) {
                    if (field264 == 2) {
                        field270 = 64;
                        field271 = 64;
                    }
                    if (field264 == 3) {
                        field270 = 0;
                        field271 = 64;
                    }
                    if (field264 == 4) {
                        field270 = 128;
                        field271 = 64;
                    }
                    if (field264 == 5) {
                        field270 = 64;
                        field271 = 0;
                    }
                    if (field264 == 6) {
                        field270 = 64;
                        field271 = 128;
                    }
                    field264 = 2;
                    field267 = field450.method2255();
                    field508 = field450.method2255();
                    field376 = field450.method2172();
                }
                if (field264 == 10) {
                    field266 = field450.method2255();
                }
                field419 = -1;
                return true;
            }
            if (field419 == 228) {
                int var98 = field450.method2177();
                String var99 = field450.method2180();
                class164 var100 = class164.method733(var98);
                if (!var99.equals(var100.field2691)) {
                    var100.field2691 = var99;
                    method1416(var100);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 19) {
                method73();
                field419 = -1;
                return false;
            }
            if (field419 == 32) {
                method618();
                field415 = field450.method2172();
                field447 = field435;
                field419 = -1;
                return true;
            }
            if (field419 == 77) {
                field500 = true;
                Statics.field1436 = field450.method2172();
                Statics.field1007 = field450.method2172();
                Statics.field2003 = field450.method2255();
                Statics.field501 = field450.method2172();
                Statics.field1673 = field450.method2172();
                if (Statics.field1673 >= 100) {
                    int var101 = Statics.field1436 * 128 + 64;
                    int var102 = Statics.field1007 * 128 + 64;
                    int var103 = method2112(var101, var102, Statics.field1019) - Statics.field2003;
                    int var104 = var101 - Statics.field582;
                    int var105 = var103 - Statics.field2073;
                    int var106 = var102 - Statics.field1588;
                    int var107 = (int) Math.sqrt((double) (var104 * var104 + var106 * var106));
                    Statics.field1097 = (int) (Math.atan2((double) var105, (double) var107) * 325.949D) & 0x7FF;
                    Statics.field974 = (int) (Math.atan2((double) var104, (double) var106) * -325.949D) & 0x7FF;
                    if (Statics.field1097 < 128) {
                        Statics.field1097 = 128;
                    }
                    if (Statics.field1097 > 383) {
                        Statics.field1097 = 383;
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 68) {
                Statics.field1297 = field450.method2236();
                Statics.field93 = field450.method2236();
                for (int var108 = Statics.field1297; var108 < Statics.field1297 + 8; var108++) {
                    for (int var109 = Statics.field93; var109 < Statics.field93 + 8; var109++) {
                        if (field383[Statics.field1019][var108][var109] != null) {
                            field383[Statics.field1019][var108][var109] = null;
                            method149(var108, var109);
                        }
                    }
                }
                for (class16 var110 = (class16) field384.method3415(); var110 != null; var110 = (class16) field384.method3419()) {
                    if (var110.field207 >= Statics.field1297 && var110.field207 < Statics.field1297 + 8 && var110.field217 >= Statics.field93 && var110.field217 < Statics.field93 + 8 && Statics.field1019 == var110.field213) {
                        var110.field216 = 0;
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 252) {
                int var111 = field450.method2218();
                int var112 = field450.method2270();
                class164 var113 = class164.method733(var111);
                if (var113.field2622 != var112 || var112 == -1) {
                    var113.field2622 = var112;
                    var113.field2753 = 0;
                    var113.field2712 = 0;
                    method1416(var113);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 27) {
                int var114 = field450.method2204();
                int var115 = field450.method2204();
                int var116 = field450.method2218();
                class164 var117 = class164.method733(var116);
                var117.field2687 = (var114 << 16) + var115;
                field419 = -1;
                return true;
            }
            if (field419 == 54) {
                String var118 = field450.method2180();
                long var119 = (long) field450.method2255();
                long var121 = (long) field450.method2307();
                class143[] var123 = new class143[] { class143.field2138, class143.field2140, class143.field2144, class143.field2139, class143.field2137 };
                class143 var124 = (class143) class101.method553(var123, field450.method2172());
                long var125 = (var119 << 32) + var121;
                boolean var127 = false;
                for (int var128 = 0; var128 < 100; var128++) {
                    if (field473[var128] == var125) {
                        var127 = true;
                        break;
                    }
                }
                if (method156(var118)) {
                    var127 = true;
                }
                if (!var127 && field367 == 0) {
                    field473[field505] = var125;
                    field505 = (field505 + 1) % 100;
                    String var129 = class214.method3611(class154.method619(class213.method142(field450)));
                    byte var130;
                    if (var124.field2135) {
                        var130 = 7;
                    } else {
                        var130 = 3;
                    }
                    if (var124.field2141 == -1) {
                        class11.method1835(var130, var118, var129);
                    } else {
                        int var132 = var124.field2141;
                        String var133 = "<img=" + var132 + ">";
                        class11.method1835(var130, var133 + var118, var129);
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 110) {
                Statics.field93 = field450.method2236();
                Statics.field1297 = field450.method2200();
                while (field450.field1867 < field291) {
                    field419 = field450.method2172();
                    method855();
                }
                field419 = -1;
                return true;
            }
            if (field419 == 51) {
                field500 = false;
                for (int var134 = 0; var134 < 5; var134++) {
                    field502[var134] = false;
                }
                field419 = -1;
                return true;
            }
            if (field419 == 95) {
                for (int var135 = 0; var135 < Statics.field1074; var135++) {
                    class48 var136 = class48.method683(var135);
                    if (var136 != null) {
                        class167.field2786[var135] = 0;
                        class167.field2787[var135] = 0;
                    }
                }
                method618();
                field521 += 32;
                field419 = -1;
                return true;
            }
            if (field419 == 139) {
                byte var137 = field450.method2358();
                int var138 = field450.method2255();
                class167.field2786[var138] = var137;
                if (class167.field2787[var138] != var137) {
                    class167.field2787[var138] = var137;
                    method3002(var138);
                }
                field323[++field521 - 1 & 0x1F] = var138;
                field419 = -1;
                return true;
            }
            if (field419 == 164) {
                int var139 = field291 + field450.field1867;
                int var140 = field450.method2255();
                int var141 = field450.method2255();
                if (field410 != var140) {
                    field410 = var140;
                    method1110(field410, Statics.field1015, Statics.field1957, false);
                    method2791(field410);
                    class34.method19(field410);
                    for (int var142 = 0; var142 < 100; var142++) {
                        field457[var142] = true;
                    }
                }
                while (var141-- > 0) {
                    int var143 = field450.method2177();
                    int var144 = field450.method2255();
                    int var145 = field450.method2172();
                    class4 var146 = (class4) field411.method3382((long) var143);
                    if (var146 != null && var146.field50 != var144) {
                        method2596(var146, true);
                        var146 = null;
                    }
                    if (var146 == null) {
                        var146 = method544(var143, var144, var145);
                    }
                    var146.field49 = true;
                }
                for (class4 var147 = (class4) field411.method3384(); var147 != null; var147 = (class4) field411.method3377()) {
                    if (var147.field49) {
                        var147.field49 = false;
                    } else {
                        method2596(var147, true);
                    }
                }
                field454 = new class187(512);
                while (field450.field1867 < var139) {
                    int var148 = field450.method2177();
                    int var149 = field450.method2255();
                    int var150 = field450.method2255();
                    int var151 = field450.method2177();
                    for (int var152 = var149; var152 <= var150; var152++) {
                        long var153 = ((long) var148 << 32) + (long) var152;
                        field454.method3391(new class192(var151), var153);
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 215) {
                int var155 = field450.method2185();
                boolean var156 = field450.method2172() == 1;
                String var157 = "";
                boolean var158 = false;
                if (var156) {
                    var157 = field450.method2180();
                    if (method156(var157)) {
                        var158 = true;
                    }
                }
                String var159 = field450.method2180();
                if (!var158) {
                    class11.method1835(var155, var157, var159);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 6) {
                int var160 = field450.method2209();
                int var161 = field450.method2177();
                int var162 = field450.method2209();
                class164 var163 = class164.method733(var161);
                if (var163.field2721 != var160 || var163.field2643 != var162 || var163.field2696 != 0 || var163.field2639 != 0) {
                    var163.field2721 = var160;
                    var163.field2643 = var162;
                    var163.field2696 = 0;
                    var163.field2639 = 0;
                    method1416(var163);
                    method151(var163);
                    if (var163.field2635 == 0) {
                        method2622(Statics.field2709[var161 >> 16], var163, false);
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 205) {
                field386 = field450.method2172();
                field419 = -1;
                return true;
            }
            if (field419 == 135) {
                int var164 = field450.method2255();
                if (var164 == 65535) {
                    var164 = -1;
                }
                int var165 = field450.method2204();
                if (var165 == 65535) {
                    var165 = -1;
                }
                int var166 = field450.method2315();
                int var167 = field450.method2315();
                for (int var168 = var165; var168 <= var164; var168++) {
                    long var169 = ((long) var167 << 32) + (long) var168;
                    class199 var171 = field454.method3382(var169);
                    if (var171 != null) {
                        var171.method3506();
                    }
                    field454.method3391(new class192(var166), var169);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 218) {
                int var172 = field450.method2217();
                int var173 = field450.method2255();
                class167.field2786[var173] = var172;
                if (class167.field2787[var173] != var172) {
                    class167.field2787[var173] = var172;
                    method3002(var173);
                }
                field323[++field521 - 1 & 0x1F] = var173;
                field419 = -1;
                return true;
            }
            if (field419 == 172) {
                for (int var174 = 0; var174 < class167.field2787.length; var174++) {
                    if (class167.field2787[var174] != class167.field2786[var174]) {
                        class167.field2787[var174] = class167.field2786[var174];
                        method3002(var174);
                        field323[++field521 - 1 & 0x1F] = var174;
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 224) {
                int var175 = field450.method2211();
                class15.method1391(var175);
                field438[++field439 - 1 & 0x1F] = var175 & 0x7FFF;
                field419 = -1;
                return true;
            }
            if (field419 == 128) {
                int var176 = field450.method2218();
                int var177 = field450.method2217();
                class4 var178 = (class4) field411.method3382((long) var176);
                class4 var179 = (class4) field411.method3382((long) var177);
                if (var179 != null) {
                    method2596(var179, var178 == null || var178.field50 != var179.field50);
                }
                if (var178 != null) {
                    var178.method3506();
                    field411.method3391(var178, (long) var177);
                }
                class164 var180 = class164.method733(var176);
                if (var180 != null) {
                    method1416(var180);
                }
                class164 var181 = class164.method733(var177);
                if (var181 != null) {
                    method1416(var181);
                    method2622(Statics.field2709[var181.field2633 >>> 16], var181, true);
                }
                if (field410 != -1) {
                    int var182 = field410;
                    if (class164.method1834(var182)) {
                        method153(Statics.field2709[var182], 1);
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 30) {
                field470 = field450.method2172();
                field471 = field450.method2172();
                field419 = -1;
                return true;
            }
            if (field419 == 188) {
                method2007(true);
                field419 = -1;
                return true;
            }
            if (field419 == 67) {
                String var183 = field450.method2180();
                String var184 = class214.method3611(class154.method619(class213.method142(field450)));
                class11.method1835(6, var183, var184);
                field419 = -1;
                return true;
            }
            if (field419 == 169) {
                while (field450.field1867 < field291) {
                    boolean var185 = field450.method2172() == 1;
                    String var186 = field450.method2180();
                    String var187 = field450.method2180();
                    int var188 = field450.method2255();
                    int var189 = field450.method2172();
                    int var190 = field450.method2172();
                    boolean var191 = (var190 & 0x2) != 0;
                    boolean var192 = (var190 & 0x1) != 0;
                    if (var188 > 0) {
                        field450.method2180();
                        field450.method2172();
                        field450.method2177();
                    }
                    field450.method2180();
                    for (int var193 = 0; var193 < field255; var193++) {
                        class17 var194 = field355[var193];
                        if (var185) {
                            if (var187.equals(var194.field227)) {
                                var194.field227 = var186;
                                var194.field220 = var187;
                                var186 = null;
                                break;
                            }
                        } else if (var186.equals(var194.field227)) {
                            if (var194.field219 != var188) {
                                boolean var195 = true;
                                for (class36 var196 = (class36) field523.method3367(); var196 != null; var196 = (class36) field523.method3376()) {
                                    if (var196.field800.equals(var186)) {
                                        if (var188 != 0 && var196.field801 == 0) {
                                            var196.method3502();
                                            var195 = false;
                                        } else if (var188 == 0 && var196.field801 != 0) {
                                            var196.method3502();
                                            var195 = false;
                                        }
                                    }
                                }
                                if (var195) {
                                    field523.method3366(new class36(var186, var188));
                                }
                                var194.field219 = var188;
                            }
                            var194.field220 = var187;
                            var194.field221 = var189;
                            var194.field223 = var191;
                            var194.field224 = var192;
                            var186 = null;
                            break;
                        }
                    }
                    if (var186 != null && field255 < 400) {
                        class17 var197 = new class17();
                        field355[field255] = var197;
                        var197.field227 = var186;
                        var197.field220 = var187;
                        var197.field219 = var188;
                        var197.field221 = var189;
                        var197.field223 = var191;
                        var197.field224 = var192;
                        field255++;
                    }
                }
                field424 = 2;
                field443 = field435;
                boolean var198 = false;
                int var199 = field255;
                while (var199 > 0) {
                    boolean var200 = true;
                    var199--;
                    for (int var201 = 0; var201 < var199; var201++) {
                        boolean var202 = false;
                        class17 var203 = field355[var201];
                        class17 var204 = field355[var201 + 1];
                        if (field247 != var203.field219 && field247 == var204.field219) {
                            var202 = true;
                        }
                        if (!var202 && var203.field219 == 0 && var204.field219 != 0) {
                            var202 = true;
                        }
                        if (!var202 && !var203.field223 && var204.field223) {
                            var202 = true;
                        }
                        if (!var202 && !var203.field224 && var204.field224) {
                            var202 = true;
                        }
                        if (var202) {
                            class17 var205 = field355[var201];
                            field355[var201] = field355[var201 + 1];
                            field355[var201 + 1] = var205;
                            var200 = false;
                        }
                    }
                    if (var200) {
                        break;
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 41) {
                int var206 = field450.method2315();
                int var207 = field450.method2255();
                int var208 = var207 >> 10 & 0x1F;
                int var209 = var207 >> 5 & 0x1F;
                int var210 = var207 & 0x1F;
                int var211 = (var210 << 3) + (var208 << 19) + (var209 << 11);
                class164 var212 = class164.method733(var206);
                if (var212.field2658 != var211) {
                    var212.field2658 = var211;
                    method1416(var212);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 53) {
                boolean var213 = field450.method2172() == 1;
                if (var213) {
                    Statics.field3031 = class107.method591() - field450.method2248();
                    Statics.field229 = new class212(field450, true);
                } else {
                    Statics.field229 = null;
                }
                field330 = field435;
                field419 = -1;
                return true;
            }
            if (field419 == 238) {
                int var214 = field450.method2177();
                int var215 = field450.method2255();
                if (var214 < -70000) {
                    var215 += 32768;
                }
                class164 var216;
                if (var214 >= 0) {
                    var216 = class164.method733(var214);
                } else {
                    var216 = null;
                }
                while (field450.field1867 < field291) {
                    int var217 = field450.method2185();
                    int var218 = field450.method2255();
                    int var219 = 0;
                    if (var218 != 0) {
                        var219 = field450.method2172();
                        if (var219 == 255) {
                            var219 = field450.method2177();
                        }
                    }
                    if (var216 != null && var217 >= 0 && var217 < var216.field2676.length) {
                        var216.field2676[var217] = var218;
                        var216.field2636[var217] = var219;
                    }
                    class15.method2465(var215, var217, var218 - 1, var219);
                }
                if (var216 != null) {
                    method1416(var216);
                }
                method618();
                field438[++field439 - 1 & 0x1F] = var215 & 0x7FFF;
                field419 = -1;
                return true;
            }
            if (field419 == 34) {
                int var220 = field450.method2211();
                if (var220 == 65535) {
                    var220 = -1;
                }
                method98(var220);
                field419 = -1;
                return true;
            }
            if (field419 == 223) {
                int var221 = field450.method2211();
                if (var221 == 65535) {
                    var221 = -1;
                }
                int var222 = field450.method2212();
                if (field489 != 0 && var221 != -1) {
                    class174.method2991(Statics.field303, var221, 0, field489, false);
                    field345 = true;
                }
                field419 = -1;
                return true;
            }
            if (field419 == 253) {
                method2007(false);
                field419 = -1;
                return true;
            }
            if (field419 == 240) {
                if (field410 != -1) {
                    int var223 = field410;
                    if (class164.method1834(var223)) {
                        method153(Statics.field2709[var223], 0);
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 184) {
                field424 = 1;
                field443 = field435;
                field419 = -1;
                return true;
            }
            if (field419 == 9) {
                method618();
                int var224 = field450.method2236();
                int var225 = field450.method2218();
                int var226 = field450.method2200();
                field389[var226] = var225;
                field387[var226] = var224;
                field307[var226] = 1;
                for (int var227 = 0; var227 < 98; var227++) {
                    if (var225 >= class146.field2168[var227]) {
                        field307[var226] = var227 + 2;
                    }
                }
                field440[++field441 - 1 & 0x1F] = var226;
                field419 = -1;
                return true;
            }
            if (field419 == 5) {
                method164(field450.method2180());
                field419 = -1;
                return true;
            }
            if (field419 == 249 || field419 == 126 || field419 == 79 || field419 == 78 || field419 == 190 || field419 == 234 || field419 == 152 || field419 == 132 || field419 == 97 || field419 == 255) {
                method855();
                field419 = -1;
                return true;
            }
            if (field419 == 127) {
                String var228 = field450.method2180();
                long var229 = field450.method2248();
                long var231 = (long) field450.method2255();
                long var233 = (long) field450.method2307();
                class143[] var235 = new class143[] { class143.field2138, class143.field2140, class143.field2144, class143.field2139, class143.field2137 };
                class143 var236 = (class143) class101.method553(var235, field450.method2172());
                long var237 = (var231 << 32) + var233;
                boolean var239 = false;
                for (int var240 = 0; var240 < 100; var240++) {
                    if (field473[var240] == var237) {
                        var239 = true;
                        break;
                    }
                }
                if (var236.field2136 && method156(var228)) {
                    var239 = true;
                }
                if (!var239 && field367 == 0) {
                    field473[field505] = var237;
                    field505 = (field505 + 1) % 100;
                    class114 var241 = field450;
                    String var242 = class213.method119(var241, 32767);
                    String var243 = class214.method3611(class154.method619(var242));
                    if (var236.field2141 == -1) {
                        class11.method2757(9, var228, var243, class153.method36(var229));
                    } else {
                        int var244 = var236.field2141;
                        String var245 = "<img=" + var244 + ">";
                        class11.method2757(9, var245 + var228, var243, class153.method36(var229));
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 52) {
                field450.field1867 += 28;
                if (field450.method2194()) {
                    class114 var246 = field450;
                    int var247 = field450.field1867 - 28;
                    if (class141.field2118 != null) {
                        try {
                            class141.field2118.method3735(0L);
                            class141.field2118.method3714(var246.field1869, var247, 24);
                        } catch (Exception var293) {
                        }
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 69) {
                field263 = field450.method2173() * 30;
                field447 = field435;
                field419 = -1;
                return true;
            }
            if (field419 == 109) {
                int var249 = field450.method2172();
                if (field450.method2172() == 0) {
                    field380[var249] = new class211();
                    field450.field1867 += 18;
                } else {
                    field450.field1867--;
                    field380[var249] = new class211(field450, false);
                }
                field404 = field435;
                field419 = -1;
                return true;
            }
            if (field419 == 70) {
                int var250 = field450.method2204();
                int var251 = field450.method2218();
                class164 var252 = class164.method733(var251);
                if (var252 != null && var252.field2635 == 0) {
                    if (var250 > var252.field2657 - var252.field2754) {
                        var250 = var252.field2657 - var252.field2754;
                    }
                    if (var250 < 0) {
                        var250 = 0;
                    }
                    if (var252.field2655 != var250) {
                        var252.field2655 = var250;
                        method1416(var252);
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 201) {
                int var253 = field450.method2255();
                int var254 = field450.method2218();
                int var255 = field450.method2255();
                int var256 = field450.method2173();
                class164 var257 = class164.method733(var254);
                if (var257.field2748 != var253 || var257.field2683 != var256 || var257.field2685 != var255) {
                    var257.field2748 = var253;
                    var257.field2683 = var256;
                    var257.field2685 = var255;
                    method1416(var257);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 175) {
                int var258 = field450.method2198();
                int var259 = field450.method2200();
                int var260 = field450.method2198();
                Statics.field1019 = var258 >> 1;
                Statics.field1548.method674(var260, var259, (var258 & 0x1) == 1);
                field419 = -1;
                return true;
            }
            if (field419 == 179) {
                int var261 = field450.method2177();
                int var262 = field450.method2255();
                if (var261 < -70000) {
                    var262 += 32768;
                }
                class164 var263;
                if (var261 >= 0) {
                    var263 = class164.method733(var261);
                } else {
                    var263 = null;
                }
                if (var263 != null) {
                    for (int var264 = 0; var264 < var263.field2676.length; var264++) {
                        var263.field2676[var264] = 0;
                        var263.field2636[var264] = 0;
                    }
                }
                class15 var265 = (class15) class15.field197.method3382((long) var262);
                if (var265 != null) {
                    for (int var266 = 0; var266 < var265.field202.length; var266++) {
                        var265.field202[var266] = -1;
                        var265.field203[var266] = 0;
                    }
                }
                int var267 = field450.method2255();
                for (int var268 = 0; var268 < var267; var268++) {
                    int var269 = field450.method2172();
                    if (var269 == 255) {
                        var269 = field450.method2217();
                    }
                    int var270 = field450.method2255();
                    if (var263 != null && var268 < var263.field2676.length) {
                        var263.field2676[var268] = var270;
                        var263.field2636[var268] = var269;
                    }
                    class15.method2465(var262, var268, var270 - 1, var269);
                }
                if (var263 != null) {
                    method1416(var263);
                }
                method618();
                field438[++field439 - 1 & 0x1F] = var262 & 0x7FFF;
                field419 = -1;
                return true;
            }
            if (field419 == 14) {
                class24 var271 = new class24();
                var271.field599 = field450.method2180();
                var271.field604 = field450.method2255();
                int var272 = field450.method2177();
                var271.field597 = var272;
                method125(45);
                Statics.field2544.method2670();
                Statics.field2544 = null;
                class30.method822(var271);
                field419 = -1;
                return false;
            }
            if (field419 == 89) {
                method107(false);
                field419 = -1;
                return true;
            }
            if (field419 == 111) {
                int var273 = field450.method2173();
                int var274 = field450.method2200();
                int var275 = field450.method2177();
                class4 var276 = (class4) field411.method3382((long) var275);
                if (var276 != null) {
                    method2596(var276, var276.field50 != var273);
                }
                method544(var275, var273, var274);
                field419 = -1;
                return true;
            }
            if (field419 == 202) {
                method141();
                field419 = -1;
                return true;
            }
            if (field419 == 140) {
                String var277 = field450.method2180();
                int var278 = field450.method2255();
                byte var279 = field450.method2358();
                boolean var280 = false;
                if (var279 == -128) {
                    var280 = true;
                }
                if (var280) {
                    if (Statics.field3045 == 0) {
                        field419 = -1;
                        return true;
                    }
                    boolean var281 = false;
                    int var282;
                    for (var282 = 0; var282 < Statics.field3045 && (!Statics.field1542[var282].field576.equals(var277) || Statics.field1542[var282].field577 != var278); var282++) {
                    }
                    if (var282 < Statics.field3045) {
                        while (var282 < Statics.field3045 - 1) {
                            Statics.field1542[var282] = Statics.field1542[var282 + 1];
                            var282++;
                        }
                        Statics.field3045--;
                        Statics.field1542[Statics.field3045] = null;
                    }
                } else {
                    field450.method2180();
                    class23 var283 = new class23();
                    var283.field576 = var277;
                    var283.field586 = class155.method2793(var283.field576, Statics.field1831);
                    var283.field577 = var278;
                    var283.field578 = var279;
                    int var284;
                    for (var284 = Statics.field3045 - 1; var284 >= 0; var284--) {
                        int var285 = Statics.field1542[var284].field586.compareTo(var283.field586);
                        if (var285 == 0) {
                            Statics.field1542[var284].field577 = var278;
                            Statics.field1542[var284].field578 = var279;
                            if (var277.equals(Statics.field1548.field42)) {
                                Statics.field903 = var279;
                            }
                            field444 = field435;
                            field419 = -1;
                            return true;
                        }
                        if (var285 < 0) {
                            break;
                        }
                    }
                    if (Statics.field3045 >= Statics.field1542.length) {
                        field419 = -1;
                        return true;
                    }
                    for (int var286 = Statics.field3045 - 1; var286 > var284; var286--) {
                        Statics.field1542[var286 + 1] = Statics.field1542[var286];
                    }
                    if (Statics.field3045 == 0) {
                        Statics.field1542 = new class23[100];
                    }
                    Statics.field1542[var284 + 1] = var283;
                    Statics.field3045++;
                    if (var277.equals(Statics.field1548.field42)) {
                        Statics.field903 = var279;
                    }
                }
                field444 = field435;
                field419 = -1;
                return true;
            }
            if (field419 == 62) {
                int var287 = field450.method2177();
                class164 var288 = class164.method733(var287);
                var288.field2638 = 3;
                var288.field2675 = Statics.field1548.field28.method3094();
                method1416(var288);
                field419 = -1;
                return true;
            }
            if (field419 == 13) {
                Statics.field1297 = field450.method2200();
                Statics.field93 = field450.method2172();
                field419 = -1;
                return true;
            }
            if (field419 == 245) {
                method618();
                field343 = field450.method2304();
                field447 = field435;
                field419 = -1;
                return true;
            }
            class140.method2756("" + field419 + class2.field23 + field296 + class2.field23 + field517 + class2.field23 + field291, (Throwable) null);
            method73();
        } catch (IOException var299) {
            method170();
        } catch (Exception var300) {
            String var291 = "" + field419 + class2.field23 + field296 + class2.field23 + field517 + class2.field23 + field291 + class2.field23 + (Statics.field550 + Statics.field1548.field792[0]) + class2.field23 + (Statics.field925 + Statics.field1548.field793[0]) + class2.field23;
            for (int var292 = 0; var292 < field291 && var292 < 50; var292++) {
                var291 = var291 + field450.field1869[var292] + class2.field23;
            }
            class140.method2756(var291, var300);
            method73();
        }
        return true;
    }

    @ObfuscatedName("ar.bl(B)V")
    public static final void method855() {
        if (field419 == 249) {
            int var0 = field450.method2172();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1297;
            int var2 = (var0 & 0x7) + Statics.field93;
            int var3 = field450.method2255();
            int var4 = field450.method2172();
            int var5 = var4 >> 4 & 0xF;
            int var6 = var4 & 0x7;
            int var7 = field450.method2172();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var8 = var5 + 1;
                if (Statics.field1548.field792[0] >= var1 - var8 && Statics.field1548.field792[0] <= var1 + var8 && Statics.field1548.field793[0] >= var2 - var8 && Statics.field1548.field793[0] <= var2 + var8 && field290 != 0 && var6 > 0 && field494 < 50) {
                    field416[field494] = var3;
                    field496[field494] = var6;
                    field497[field494] = var7;
                    field499[field494] = null;
                    field498[field494] = (var1 << 16) + (var2 << 8) + var5;
                    field494++;
                }
            }
        }
        if (field419 == 132) {
            int var9 = field450.method2172();
            int var10 = (var9 >> 4 & 0x7) + Statics.field1297;
            int var11 = (var9 & 0x7) + Statics.field93;
            int var12 = field450.method2173();
            int var13 = field450.method2198();
            int var14 = var13 >> 2;
            int var15 = var13 & 0x3;
            int var16 = field310[var14];
            if (var10 >= 0 && var11 >= 0 && var10 < 103 && var11 < 103) {
                if (var16 == 0) {
                    class82 var17 = Statics.field147.method1670(Statics.field1019, var10, var11);
                    if (var17 != null) {
                        int var18 = var17.field1444 >> 14 & 0x7FFF;
                        if (var14 == 2) {
                            var17.field1432 = new class12(var18, 2, var15 + 4, Statics.field1019, var10, var11, var12, false, var17.field1432);
                            var17.field1433 = new class12(var18, 2, var15 + 1 & 0x3, Statics.field1019, var10, var11, var12, false, var17.field1433);
                        } else {
                            var17.field1432 = new class12(var18, var14, var15, Statics.field1019, var10, var11, var12, false, var17.field1432);
                        }
                    }
                }
                if (var16 == 1) {
                    class89 var19 = Statics.field147.method1665(Statics.field1019, var10, var11);
                    if (var19 != null) {
                        int var20 = var19.field1523 >> 14 & 0x7FFF;
                        if (var14 == 4 || var14 == 5) {
                            var19.field1521 = new class12(var20, 4, var15, Statics.field1019, var10, var11, var12, false, var19.field1521);
                        } else if (var14 == 6) {
                            var19.field1521 = new class12(var20, 4, var15 + 4, Statics.field1019, var10, var11, var12, false, var19.field1521);
                        } else if (var14 == 7) {
                            var19.field1521 = new class12(var20, 4, (var15 + 2 & 0x3) + 4, Statics.field1019, var10, var11, var12, false, var19.field1521);
                        } else if (var14 == 8) {
                            var19.field1521 = new class12(var20, 4, var15 + 4, Statics.field1019, var10, var11, var12, false, var19.field1521);
                            var19.field1522 = new class12(var20, 4, (var15 + 2 & 0x3) + 4, Statics.field1019, var10, var11, var12, false, var19.field1522);
                        }
                    }
                }
                if (var16 == 2) {
                    class93 var21 = Statics.field147.method1729(Statics.field1019, var10, var11);
                    if (var14 == 11) {
                        var14 = 10;
                    }
                    if (var21 != null) {
                        var21.field1575 = new class12(var21.field1583 >> 14 & 0x7FFF, var14, var15, Statics.field1019, var10, var11, var12, false, var21.field1575);
                    }
                }
                if (var16 == 3) {
                    class88 var22 = Statics.field147.method1673(Statics.field1019, var10, var11);
                    if (var22 != null) {
                        var22.field1511 = new class12(var22.field1507 >> 14 & 0x7FFF, 22, var15, Statics.field1019, var10, var11, var12, false, var22.field1511);
                    }
                }
            }
            return;
        }
        if (field419 == 79) {
            byte var23 = field450.method2260();
            byte var24 = field450.method2201();
            int var25 = field450.method2173();
            byte var26 = field450.method2260();
            int var27 = field450.method2236();
            int var28 = var27 >> 2;
            int var29 = var27 & 0x3;
            int var30 = field310[var28];
            int var31 = field450.method2255();
            int var32 = field450.method2200();
            int var33 = (var32 >> 4 & 0x7) + Statics.field1297;
            int var34 = (var32 & 0x7) + Statics.field93;
            int var35 = field450.method2211();
            int var36 = field450.method2255();
            byte var37 = field450.method2358();
            class3 var38;
            if (field374 == var35) {
                var38 = Statics.field1548;
            } else {
                var38 = field258[var35];
            }
            if (var38 != null) {
                class38 var39 = class38.method1473(var31);
                int var40;
                int var41;
                if (var29 == 1 || var29 == 3) {
                    var40 = var39.field859;
                    var41 = var39.field860;
                } else {
                    var40 = var39.field860;
                    var41 = var39.field859;
                }
                int var42 = (var40 >> 1) + var33;
                int var43 = (var40 + 1 >> 1) + var33;
                int var44 = (var41 >> 1) + var34;
                int var45 = (var41 + 1 >> 1) + var34;
                int[][] var46 = class6.field67[Statics.field1019];
                int var47 = var46[var42][var44] + var46[var43][var44] + var46[var42][var45] + var46[var43][var45] >> 2;
                int var48 = (var33 << 7) + (var40 << 6);
                int var49 = (var34 << 7) + (var41 << 6);
                class100 var50 = var39.method721(var28, var29, var46, var48, var47, var49);
                if (var50 != null) {
                    method1928(Statics.field1019, var33, var34, var30, -1, 0, 0, var25 + 1, var36 + 1);
                    var38.field33 = field256 + var25;
                    var38.field35 = field256 + var36;
                    var38.field39 = var50;
                    var38.field36 = var33 * 128 + var40 * 64;
                    var38.field46 = var34 * 128 + var41 * 64;
                    var38.field37 = var47;
                    if (var23 > var26) {
                        byte var51 = var23;
                        var23 = var26;
                        var26 = var51;
                    }
                    if (var37 > var24) {
                        byte var52 = var37;
                        var37 = var24;
                        var24 = var52;
                    }
                    var38.field40 = var23 + var33;
                    var38.field29 = var26 + var33;
                    var38.field41 = var34 + var37;
                    var38.field43 = var24 + var34;
                }
            }
        }
        if (field419 == 234) {
            int var53 = field450.method2211();
            int var54 = field450.method2200();
            int var55 = (var54 >> 4 & 0x7) + Statics.field1297;
            int var56 = (var54 & 0x7) + Statics.field93;
            if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                class190 var57 = field383[Statics.field1019][var55][var56];
                if (var57 != null) {
                    for (class27 var58 = (class27) var57.method3415(); var58 != null; var58 = (class27) var57.method3419()) {
                        if ((var53 & 0x7FFF) == var58.field634) {
                            var58.method3506();
                            break;
                        }
                    }
                    if (var57.method3415() == null) {
                        field383[Statics.field1019][var55][var56] = null;
                    }
                    method149(var55, var56);
                }
            }
        } else if (field419 == 78) {
            int var59 = field450.method2172();
            int var60 = (var59 >> 4 & 0x7) + Statics.field1297;
            int var61 = (var59 & 0x7) + Statics.field93;
            int var62 = field450.method2255();
            int var63 = field450.method2172();
            int var64 = field450.method2255();
            if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                int var65 = var60 * 128 + 64;
                int var66 = var61 * 128 + 64;
                class28 var67 = new class28(var62, Statics.field1019, var65, var66, method2112(var65, var66, Statics.field1019) - var63, var64, field256);
                field490.method3442(var67);
            }
        } else if (field419 == 126) {
            int var68 = field450.method2172();
            int var69 = (var68 >> 4 & 0x7) + Statics.field1297;
            int var70 = (var68 & 0x7) + Statics.field93;
            int var71 = field450.method2255();
            int var72 = field450.method2255();
            int var73 = field450.method2255();
            if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                class190 var74 = field383[Statics.field1019][var69][var70];
                if (var74 != null) {
                    for (class27 var75 = (class27) var74.method3415(); var75 != null; var75 = (class27) var74.method3419()) {
                        if ((var71 & 0x7FFF) == var75.field634 && var75.field638 == var72) {
                            var75.field638 = var73;
                            break;
                        }
                    }
                    method149(var69, var70);
                }
            }
        } else if (field419 == 255) {
            int var76 = field450.method2255();
            int var77 = field450.method2198();
            int var78 = var77 >> 2;
            int var79 = var77 & 0x3;
            int var80 = field310[var78];
            int var81 = field450.method2236();
            int var82 = (var81 >> 4 & 0x7) + Statics.field1297;
            int var83 = (var81 & 0x7) + Statics.field93;
            if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                method1928(Statics.field1019, var82, var83, var80, var76, var78, var79, 0, -1);
            }
        } else if (field419 == 152) {
            int var84 = field450.method2236();
            int var85 = (var84 >> 4 & 0x7) + Statics.field1297;
            int var86 = (var84 & 0x7) + Statics.field93;
            int var87 = field450.method2173();
            int var88 = field450.method2173();
            if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                class27 var89 = new class27();
                var89.field634 = var88;
                var89.field638 = var87;
                if (field383[Statics.field1019][var85][var86] == null) {
                    field383[Statics.field1019][var85][var86] = new class190();
                }
                field383[Statics.field1019][var85][var86].method3442(var89);
                method149(var85, var86);
            }
        } else if (field419 == 97) {
            int var90 = field450.method2200();
            int var91 = (var90 >> 4 & 0x7) + Statics.field1297;
            int var92 = (var90 & 0x7) + Statics.field93;
            int var93 = field450.method2236();
            int var94 = var93 >> 2;
            int var95 = var93 & 0x3;
            int var96 = field310[var94];
            if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                method1928(Statics.field1019, var91, var92, var96, -1, var94, var95, 0, -1);
            }
        } else if (field419 == 190) {
            int var97 = field450.method2172();
            int var98 = (var97 >> 4 & 0x7) + Statics.field1297;
            int var99 = (var97 & 0x7) + Statics.field93;
            int var100 = var98 + field450.method2358();
            int var101 = var99 + field450.method2358();
            int var102 = field450.method2304();
            int var103 = field450.method2255();
            int var104 = field450.method2172() * 4;
            int var105 = field450.method2172() * 4;
            int var106 = field450.method2255();
            int var107 = field450.method2255();
            int var108 = field450.method2172();
            int var109 = field450.method2172();
            if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                int var110 = var98 * 128 + 64;
                int var111 = var99 * 128 + 64;
                int var112 = var100 * 128 + 64;
                int var113 = var101 * 128 + 64;
                class7 var114 = new class7(var103, Statics.field1019, var110, var111, method2112(var110, var111, Statics.field1019) - var104, field256 + var106, field256 + var107, var108, var109, var102, var105);
                var114.method92(var112, var113, method2112(var112, var113, Statics.field1019) - var105, field256 + var106);
                field385.method3442(var114);
            }
        }
    }

    @ObfuscatedName("cc.by(IIIIIIIIII)V")
    public static final void method1928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class16 var9 = null;
        for (class16 var10 = (class16) field384.method3415(); var10 != null; var10 = (class16) field384.method3419()) {
            if (var10.field213 == arg0 && var10.field207 == arg1 && var10.field217 == arg2 && var10.field206 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class16();
            var9.field213 = arg0;
            var9.field206 = arg3;
            var9.field207 = arg1;
            var9.field217 = arg2;
            method2459(var9);
            field384.method3442(var9);
        }
        var9.field212 = arg4;
        var9.field214 = arg5;
        var9.field218 = arg6;
        var9.field215 = arg7;
        var9.field216 = arg8;
    }

    @ObfuscatedName("b.bi(I)V")
    public static final void method4() {
        for (class16 var0 = (class16) field384.method3415(); var0 != null; var0 = (class16) field384.method3419()) {
            if (var0.field216 == -1) {
                var0.field215 = 0;
                method2459(var0);
            } else {
                var0.method3506();
            }
        }
    }

    @ObfuscatedName("dn.bg(Lu;I)V")
    public static final void method2459(class16 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field206 == 0) {
            var1 = Statics.field147.method1674(arg0.field213, arg0.field207, arg0.field217);
        }
        if (arg0.field206 == 1) {
            var1 = Statics.field147.method1675(arg0.field213, arg0.field207, arg0.field217);
        }
        if (arg0.field206 == 2) {
            var1 = Statics.field147.method1824(arg0.field213, arg0.field207, arg0.field217);
        }
        if (arg0.field206 == 3) {
            var1 = Statics.field147.method1677(arg0.field213, arg0.field207, arg0.field217);
        }
        if (var1 != 0) {
            int var5 = Statics.field147.method1697(arg0.field213, arg0.field207, arg0.field217, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field211 = var2;
        arg0.field209 = var3;
        arg0.field210 = var4;
    }

    @ObfuscatedName("do.bw(I)V")
    public static final void method2442() {
        for (class16 var0 = (class16) field384.method3415(); var0 != null; var0 = (class16) field384.method3419()) {
            if (var0.field216 > 0) {
                var0.field216--;
            }
            if (var0.field216 != 0) {
                if (var0.field215 > 0) {
                    var0.field215--;
                }
                if (var0.field215 == 0 && var0.field207 >= 1 && var0.field217 >= 1 && var0.field207 <= 102 && var0.field217 <= 102 && (var0.field212 < 0 || class6.method23(var0.field212, var0.field214))) {
                    method143(var0.field213, var0.field206, var0.field207, var0.field217, var0.field212, var0.field218, var0.field214);
                    var0.field215 = -1;
                    if (var0.field212 == var0.field211 && var0.field211 == -1) {
                        var0.method3506();
                    } else if (var0.field212 == var0.field211 && var0.field218 == var0.field210 && var0.field214 == var0.field209) {
                        var0.method3506();
                    }
                }
            } else if (var0.field211 < 0 || class6.method23(var0.field211, var0.field209)) {
                method143(var0.field213, var0.field206, var0.field207, var0.field217, var0.field211, var0.field210, var0.field209);
                var0.method3506();
            }
        }
    }

    @ObfuscatedName("a.bf(IIIIIIII)V")
    public static final void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field251 && Statics.field1019 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field147.method1674(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field147.method1675(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field147.method1824(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field147.method1677(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field147.method1697(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field147.method1655(arg0, arg2, arg3);
                class38 var15 = class38.method1473(var12);
                if (var15.field862 != 0) {
                    field400[arg0].method3747(arg2, arg3, var13, var14, var15.field863);
                }
            }
            if (arg1 == 1) {
                Statics.field147.method1666(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field147.method1667(arg0, arg2, arg3);
                class38 var16 = class38.method1473(var12);
                if (var16.field860 + arg2 > 103 || var16.field860 + arg3 > 103 || var16.field859 + arg2 > 103 || var16.field859 + arg3 > 103) {
                    return;
                }
                if (var16.field862 != 0) {
                    field400[arg0].method3769(arg2, arg3, var16.field860, var16.field859, var14, var16.field863);
                }
            }
            if (arg1 == 3) {
                Statics.field147.method1668(arg0, arg2, arg3);
                class38 var17 = class38.method1473(var12);
                if (var17.field862 == 1) {
                    field400[arg0].method3750(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field68[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class81 var19 = Statics.field147;
        class220 var20 = field400[arg0];
        class38 var21 = class38.method1473(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field859;
            var23 = var21.field860;
        } else {
            var22 = var21.field860;
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
        int[][] var28 = class6.field67[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field857 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field851 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class80 var34;
            if (var21.field868 == -1 && var21.field886 == null) {
                var34 = var21.method721(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class12(arg4, 22, arg5, var18, arg2, arg3, var21.field868, true, (class80) null);
            }
            var19.method1654(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field862 == 1) {
                var20.method3745(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class80 var57;
            if (var21.field868 == -1 && var21.field886 == null) {
                var57 = var21.method721(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class12(arg4, 10, arg5, var18, arg2, arg3, var21.field868, true, (class80) null);
            }
            if (var57 != null) {
                var19.method1658(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field862 != 0) {
                var20.method3774(arg2, arg3, var22, var23, var21.field863);
            }
        } else if (arg6 >= 12) {
            class80 var35;
            if (var21.field868 == -1 && var21.field886 == null) {
                var35 = var21.method721(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class12(arg4, arg6, arg5, var18, arg2, arg3, var21.field868, true, (class80) null);
            }
            var19.method1658(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field862 != 0) {
                var20.method3774(arg2, arg3, var22, var23, var21.field863);
            }
        } else if (arg6 == 0) {
            class80 var36;
            if (var21.field868 == -1 && var21.field886 == null) {
                var36 = var21.method721(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class12(arg4, 0, arg5, var18, arg2, arg3, var21.field868, true, (class80) null);
            }
            var19.method1656(arg0, arg2, arg3, var29, var36, (class80) null, class6.field83[arg5], 0, var32, var33);
            if (var21.field862 != 0) {
                var20.method3742(arg2, arg3, arg6, arg5, var21.field863);
            }
        } else if (arg6 == 1) {
            class80 var37;
            if (var21.field868 == -1 && var21.field886 == null) {
                var37 = var21.method721(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class12(arg4, 1, arg5, var18, arg2, arg3, var21.field868, true, (class80) null);
            }
            var19.method1656(arg0, arg2, arg3, var29, var37, (class80) null, class6.field81[arg5], 0, var32, var33);
            if (var21.field862 != 0) {
                var20.method3742(arg2, arg3, arg6, arg5, var21.field863);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class80 var39;
            class80 var40;
            if (var21.field868 == -1 && var21.field886 == null) {
                var39 = var21.method721(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method721(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class12(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field868, true, (class80) null);
                var40 = new class12(arg4, 2, var38, var18, arg2, arg3, var21.field868, true, (class80) null);
            }
            var19.method1656(arg0, arg2, arg3, var29, var39, var40, class6.field83[arg5], class6.field83[var38], var32, var33);
            if (var21.field862 != 0) {
                var20.method3742(arg2, arg3, arg6, arg5, var21.field863);
            }
        } else if (arg6 == 3) {
            class80 var41;
            if (var21.field868 == -1 && var21.field886 == null) {
                var41 = var21.method721(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class12(arg4, 3, arg5, var18, arg2, arg3, var21.field868, true, (class80) null);
            }
            var19.method1656(arg0, arg2, arg3, var29, var41, (class80) null, class6.field81[arg5], 0, var32, var33);
            if (var21.field862 != 0) {
                var20.method3742(arg2, arg3, arg6, arg5, var21.field863);
            }
        } else if (arg6 == 9) {
            class80 var42;
            if (var21.field868 == -1 && var21.field886 == null) {
                var42 = var21.method721(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class12(arg4, arg6, arg5, var18, arg2, arg3, var21.field868, true, (class80) null);
            }
            var19.method1658(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field862 != 0) {
                var20.method3774(arg2, arg3, var22, var23, var21.field863);
            }
        } else if (arg6 == 4) {
            class80 var43;
            if (var21.field868 == -1 && var21.field886 == null) {
                var43 = var21.method721(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class12(arg4, 4, arg5, var18, arg2, arg3, var21.field868, true, (class80) null);
            }
            var19.method1657(arg0, arg2, arg3, var29, var43, (class80) null, class6.field83[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1674(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class38.method1473(var45 >> 14 & 0x7FFF).field869;
            }
            class80 var46;
            if (var21.field868 == -1 && var21.field886 == null) {
                var46 = var21.method721(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class12(arg4, 4, arg5, var18, arg2, arg3, var21.field868, true, (class80) null);
            }
            var19.method1657(arg0, arg2, arg3, var29, var46, (class80) null, class6.field83[arg5], 0, class6.field70[arg5] * var44, class6.field82[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1674(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class38.method1473(var48 >> 14 & 0x7FFF).field869 / 2;
            }
            class80 var49;
            if (var21.field868 == -1 && var21.field886 == null) {
                var49 = var21.method721(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class12(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field868, true, (class80) null);
            }
            var19.method1657(arg0, arg2, arg3, var29, var49, (class80) null, 256, arg5, class6.field84[arg5] * var47, class6.field88[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class80 var51;
            if (var21.field868 == -1 && var21.field886 == null) {
                var51 = var21.method721(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class12(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field868, true, (class80) null);
            }
            var19.method1657(arg0, arg2, arg3, var29, var51, (class80) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1674(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class38.method1473(var53 >> 14 & 0x7FFF).field869 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class80 var55;
            class80 var56;
            if (var21.field868 == -1 && var21.field886 == null) {
                var55 = var21.method721(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method721(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class12(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field868, true, (class80) null);
                var56 = new class12(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field868, true, (class80) null);
            }
            var19.method1657(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field84[arg5] * var52, class6.field88[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("l.bk(IIB)V")
    public static final void method149(int arg0, int arg1) {
        class190 var2 = field383[Statics.field1019][arg0][arg1];
        if (var2 == null) {
            Statics.field147.method1669(Statics.field1019, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class27 var5 = null;
        for (class27 var6 = (class27) var2.method3415(); var6 != null; var6 = (class27) var2.method3419()) {
            class47 var7 = class47.method2(var6.field634);
            long var8 = (long) var7.field1043;
            if (var7.field1042 == 1) {
                var8 = (long) (var6.field638 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field147.method1669(Statics.field1019, arg0, arg1);
            return;
        }
        var2.method3444(var5);
        class27 var10 = null;
        class27 var11 = null;
        for (class27 var12 = (class27) var2.method3415(); var12 != null; var12 = (class27) var2.method3419()) {
            if (var5.field634 != var12.field634) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field634 != var12.field634 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field147.method1772(Statics.field1019, arg0, arg1, method2112(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1019), var5, var13, var10, var11);
    }

    @ObfuscatedName("v.ba(I)V")
    public static final void method141() {
        field299 = 0;
        field379 = 0;
        method2659();
        method117();
        method37();
        method2598();
        for (int var0 = 0; var0 < field299; var0++) {
            int var1 = field377[var0];
            if (field256 != field258[var1].field786) {
                field258[var1] = null;
            }
        }
        if (field291 != field450.field1867) {
            throw new RuntimeException(field450.field1867 + class2.field23 + field291);
        }
        for (int var2 = 0; var2 < field519; var2++) {
            if (field258[field370[var2]] == null) {
                throw new RuntimeException(var2 + class2.field23 + field519);
            }
        }
    }

    @ObfuscatedName("ea.be(I)V")
    public static final void method2659() {
        field450.method2423();
        int var0 = field450.method2439(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field450.method2439(2);
        if (var1 == 0) {
            field369[++field379 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field450.method2439(3);
            Statics.field1548.method665(var2, false);
            int var3 = field450.method2439(1);
            if (var3 == 1) {
                field369[++field379 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field450.method2439(3);
            Statics.field1548.method665(var4, true);
            int var5 = field450.method2439(3);
            Statics.field1548.method665(var5, true);
            int var6 = field450.method2439(1);
            if (var6 == 1) {
                field369[++field379 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field450.method2439(7);
            int var8 = field450.method2439(1);
            Statics.field1019 = field450.method2439(2);
            int var9 = field450.method2439(7);
            int var10 = field450.method2439(1);
            if (var10 == 1) {
                field369[++field379 - 1] = 2047;
            }
            Statics.field1548.method674(var7, var9, var8 == 1);
        }
    }

    @ObfuscatedName("x.bz(B)V")
    public static final void method117() {
        int var0 = field450.method2439(8);
        if (var0 < field519) {
            for (int var1 = var0; var1 < field519; var1++) {
                field377[++field299 - 1] = field370[var1];
            }
        }
        if (var0 > field519) {
            throw new RuntimeException("");
        }
        field519 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field370[var2];
            class3 var4 = field258[var3];
            int var5 = field450.method2439(1);
            if (var5 == 0) {
                field370[++field519 - 1] = var3;
                var4.field786 = field256;
            } else {
                int var6 = field450.method2439(2);
                if (var6 == 0) {
                    field370[++field519 - 1] = var3;
                    var4.field786 = field256;
                    field369[++field379 - 1] = var3;
                } else if (var6 == 1) {
                    field370[++field519 - 1] = var3;
                    var4.field786 = field256;
                    int var7 = field450.method2439(3);
                    var4.method665(var7, false);
                    int var8 = field450.method2439(1);
                    if (var8 == 1) {
                        field369[++field379 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field370[++field519 - 1] = var3;
                    var4.field786 = field256;
                    int var9 = field450.method2439(3);
                    var4.method665(var9, true);
                    int var10 = field450.method2439(3);
                    var4.method665(var10, true);
                    int var11 = field450.method2439(1);
                    if (var11 == 1) {
                        field369[++field379 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field377[++field299 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("i.bh(I)V")
    public static final void method37() {
        while (true) {
            if (field450.method2426(field291) >= 11) {
                int var0 = field450.method2439(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field258[var0] == null) {
                        field258[var0] = new class3();
                        if (field373[var0] != null) {
                            field258[var0].method13(field373[var0]);
                        }
                        var1 = true;
                    }
                    field370[++field519 - 1] = var0;
                    class3 var2 = field258[var0];
                    var2.field786 = field256;
                    int var3 = field381[field450.method2439(3)];
                    if (var1) {
                        var2.field788 = var2.field740 = var3;
                    }
                    int var4 = field450.method2439(1);
                    if (var4 == 1) {
                        field369[++field379 - 1] = var0;
                    }
                    int var5 = field450.method2439(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field450.method2439(1);
                    int var7 = field450.method2439(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.method674(Statics.field1548.field792[0] + var7, Statics.field1548.field793[0] + var5, var6 == 1);
                    continue;
                }
            }
            field450.method2425();
            return;
        }
    }

    @ObfuscatedName("dt.bp(I)V")
    public static final void method2598() {
        for (int var0 = 0; var0 < field379; var0++) {
            int var1 = field369[var0];
            class3 var2 = field258[var1];
            int var3 = field450.method2172();
            if ((var3 & 0x20) != 0) {
                var3 += field450.method2172() << 8;
            }
            if ((var3 & 0x400) != 0) {
                var2.field743 = field450.method2255();
                int var4 = field450.method2217();
                var2.field778 = var4 >> 16;
                var2.field757 = (var4 & 0xFFFF) + field256;
                var2.field775 = 0;
                var2.field776 = 0;
                if (var2.field757 > field256) {
                    var2.field775 = -1;
                }
                if (var2.field743 == 65535) {
                    var2.field743 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field768 = field450.method2204();
                var2.field760 = field450.method2173();
            }
            if ((var3 & 0x1) != 0) {
                int var5 = field450.method2173();
                class143[] var6 = new class143[] { class143.field2138, class143.field2140, class143.field2144, class143.field2139, class143.field2137 };
                class143 var7 = (class143) class101.method553(var6, field450.method2172());
                boolean var8 = field450.method2200() == 1;
                int var9 = field450.method2172();
                int var10 = field450.field1867;
                if (var2.field42 != null && var2.field28 != null) {
                    boolean var11 = false;
                    if (var7.field2136 && method156(var2.field42)) {
                        var11 = true;
                    }
                    if (!var11 && field367 == 0 && !var2.field27) {
                        field268.field1867 = 0;
                        field450.method2281(field268.field1869, 0, var9);
                        field268.field1867 = 0;
                        class111 var12 = field268;
                        String var13 = class213.method119(var12, 32767);
                        String var14 = class214.method3611(class154.method619(var13));
                        var2.field751 = var14.trim();
                        var2.field755 = var5 >> 8;
                        var2.field756 = var5 & 0xFF;
                        var2.field789 = 150;
                        var2.field752 = var8;
                        var2.field753 = Statics.field1548 != var2 && var7.field2136 && field429 != "" && var14.toLowerCase().indexOf(field429) == -1;
                        int var15;
                        if (var7.field2135) {
                            var15 = var8 ? 91 : 1;
                        } else {
                            var15 = var8 ? 90 : 2;
                        }
                        if (var7.field2141 == -1) {
                            class11.method1835(var15, var2.field42, var14);
                        } else {
                            int var17 = var7.field2141;
                            String var18 = "<img=" + var17 + ">";
                            class11.method1835(var15, var18 + var2.field42, var14);
                        }
                    }
                }
                field450.field1867 = var9 + var10;
            }
            if ((var3 & 0x40) != 0) {
                var2.field751 = field450.method2180();
                if (var2.field751.charAt(0) == '~') {
                    var2.field751 = var2.field751.substring(1);
                    class11.method1835(2, var2.field42, var2.field751);
                } else if (Statics.field1548 == var2) {
                    class11.method1835(2, var2.field42, var2.field751);
                }
                var2.field752 = false;
                var2.field755 = 0;
                var2.field756 = 0;
                var2.field789 = 150;
            }
            if ((var3 & 0x200) != 0) {
                int var19 = field450.method2204();
                int var20 = field450.method2236();
                var2.method667(var19, var20, field256);
                var2.field794 = field256 + 300;
                var2.field761 = field450.method2200();
                var2.field787 = field450.method2236();
            }
            if ((var3 & 0x8) != 0) {
                int var21 = field450.method2255();
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var22 = field450.method2198();
                method3571(var2, var21, var22);
            }
            if ((var3 & 0x4) != 0) {
                int var23 = field450.method2204();
                int var24 = field450.method2236();
                var2.method667(var23, var24, field256);
                var2.field794 = field256 + 300;
                var2.field761 = field450.method2172();
                var2.field787 = field450.method2200();
            }
            if ((var3 & 0x80) != 0) {
                var2.field763 = field450.method2255();
                if (var2.field763 == 65535) {
                    var2.field763 = -1;
                }
            }
            if ((var3 & 0x100) != 0) {
                var2.field779 = field450.method2200();
                var2.field781 = field450.method2198();
                var2.field780 = field450.method2172();
                var2.field777 = field450.method2172();
                var2.field783 = field450.method2255() + field256;
                var2.field769 = field450.method2204() + field256;
                var2.field785 = field450.method2198();
                var2.field791 = 1;
                var2.field795 = 0;
            }
            if ((var3 & 0x10) != 0) {
                int var25 = field450.method2172();
                byte[] var26 = new byte[var25];
                class111 var27 = new class111(var26);
                field450.method2219(var26, 0, var25);
                field373[var1] = var27;
                var2.method13(var27);
            }
        }
    }

    @ObfuscatedName("cw.bo(ZB)V")
    public static final void method2007(boolean arg0) {
        field299 = 0;
        field379 = 0;
        method3530();
        method532(arg0);
        for (int var1 = 0; var1 < field379; var1++) {
            int var2 = field369[var1];
            class32 var3 = field285[var2];
            int var4 = field450.method2172();
            if ((var4 & 0x10) != 0) {
                var3.field708 = class37.method2676(field450.method2173());
                var3.field742 = var3.field708.field812;
                var3.field790 = var3.field708.field835;
                var3.field746 = var3.field708.field818;
                var3.field747 = var3.field708.field819;
                var3.field797 = var3.field708.field820;
                var3.field749 = var3.field708.field821;
                var3.field796 = var3.field708.field815;
                var3.field744 = var3.field708.field807;
                var3.field745 = var3.field708.field817;
            }
            if ((var4 & 0x1) != 0) {
                var3.field763 = field450.method2255();
                if (var3.field763 == 65535) {
                    var3.field763 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var5 = field450.method2200();
                int var6 = field450.method2236();
                var3.method667(var5, var6, field256);
                var3.field794 = field256 + 300;
                var3.field761 = field450.method2211();
                var3.field787 = field450.method2173();
            }
            if ((var4 & 0x8) != 0) {
                var3.field743 = field450.method2173();
                int var7 = field450.method2217();
                var3.field778 = var7 >> 16;
                var3.field757 = (var7 & 0xFFFF) + field256;
                var3.field775 = 0;
                var3.field776 = 0;
                if (var3.field757 > field256) {
                    var3.field775 = -1;
                }
                if (var3.field743 == 65535) {
                    var3.field743 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var8 = field450.method2211();
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = field450.method2198();
                if (var3.field748 == var8 && var8 != -1) {
                    int var10 = class40.method168(var8).field933;
                    if (var10 == 1) {
                        var3.field782 = 0;
                        var3.field771 = 0;
                        var3.field772 = var9;
                        var3.field773 = 0;
                    }
                    if (var10 == 2) {
                        var3.field773 = 0;
                    }
                } else if (var8 == -1 || var3.field748 == -1 || class40.method168(var8).field932 >= class40.method168(var3.field748).field932) {
                    var3.field748 = var8;
                    var3.field782 = 0;
                    var3.field771 = 0;
                    var3.field772 = var9;
                    var3.field773 = 0;
                    var3.field795 = var3.field791;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field768 = field450.method2255();
                var3.field760 = field450.method2255();
            }
            if ((var4 & 0x80) != 0) {
                int var11 = field450.method2236();
                int var12 = field450.method2172();
                var3.method667(var11, var12, field256);
                var3.field794 = field256 + 300;
                var3.field761 = field450.method2255();
                var3.field787 = field450.method2173();
            }
            if ((var4 & 0x4) != 0) {
                var3.field751 = field450.method2180();
                var3.field789 = 100;
            }
        }
        for (int var13 = 0; var13 < field299; var13++) {
            int var14 = field377[var13];
            if (field256 != field285[var14].field786) {
                field285[var14].field708 = null;
                field285[var14] = null;
            }
        }
        if (field291 != field450.field1867) {
            throw new RuntimeException(field450.field1867 + class2.field23 + field291);
        }
        for (int var15 = 0; var15 < field286; var15++) {
            if (field285[field287[var15]] == null) {
                throw new RuntimeException(var15 + class2.field23 + field286);
            }
        }
    }

    @ObfuscatedName("gj.bj(I)V")
    public static final void method3530() {
        field450.method2423();
        int var0 = field450.method2439(8);
        if (var0 < field286) {
            for (int var1 = var0; var1 < field286; var1++) {
                field377[++field299 - 1] = field287[var1];
            }
        }
        if (var0 > field286) {
            throw new RuntimeException("");
        }
        field286 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field287[var2];
            class32 var4 = field285[var3];
            int var5 = field450.method2439(1);
            if (var5 == 0) {
                field287[++field286 - 1] = var3;
                var4.field786 = field256;
            } else {
                int var6 = field450.method2439(2);
                if (var6 == 0) {
                    field287[++field286 - 1] = var3;
                    var4.field786 = field256;
                    field369[++field379 - 1] = var3;
                } else if (var6 == 1) {
                    field287[++field286 - 1] = var3;
                    var4.field786 = field256;
                    int var7 = field450.method2439(3);
                    var4.method665(var7, false);
                    int var8 = field450.method2439(1);
                    if (var8 == 1) {
                        field369[++field379 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field287[++field286 - 1] = var3;
                    var4.field786 = field256;
                    int var9 = field450.method2439(3);
                    var4.method665(var9, true);
                    int var10 = field450.method2439(3);
                    var4.method665(var10, true);
                    int var11 = field450.method2439(1);
                    if (var11 == 1) {
                        field369[++field379 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field377[++field299 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("q.bx(ZI)V")
    public static final void method532(boolean arg0) {
        while (true) {
            if (field450.method2426(field291) >= 27) {
                int var1 = field450.method2439(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field285[var1] == null) {
                        field285[var1] = new class32();
                        var2 = true;
                    }
                    class32 var3 = field285[var1];
                    field287[++field286 - 1] = var1;
                    var3.field786 = field256;
                    int var4 = field381[field450.method2439(3)];
                    if (var2) {
                        var3.field788 = var3.field740 = var4;
                    }
                    int var5;
                    if (arg0) {
                        var5 = field450.method2439(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field450.method2439(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field450.method2439(1);
                    if (var6 == 1) {
                        field369[++field379 - 1] = var1;
                    }
                    var3.field708 = class37.method2676(field450.method2439(14));
                    int var7 = field450.method2439(1);
                    int var8;
                    if (arg0) {
                        var8 = field450.method2439(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field450.method2439(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field742 = var3.field708.field812;
                    var3.field790 = var3.field708.field835;
                    if (var3.field790 == 0) {
                        var3.field740 = 0;
                    }
                    var3.field746 = var3.field708.field818;
                    var3.field747 = var3.field708.field819;
                    var3.field797 = var3.field708.field820;
                    var3.field749 = var3.field708.field821;
                    var3.field796 = var3.field708.field815;
                    var3.field744 = var3.field708.field807;
                    var3.field745 = var3.field708.field817;
                    var3.method674(Statics.field1548.field792[0] + var8, Statics.field1548.field793[0] + var5, var7 == 1);
                    continue;
                }
            }
            field450.method2425();
            return;
        }
    }

    @ObfuscatedName("ag.bm(I)V")
    public static final void method645() {
        int var0 = Statics.field691;
        int var1 = Statics.field1539;
        int var2 = Statics.field572;
        int var3 = Statics.field805;
        int var4 = 6116423;
        class75.method1578(var0, var1, var2, var3, var4);
        class75.method1578(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class75.method1582(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1854.method3612(class148.field2252, var0 + 3, var1 + 14, var4, -1);
        int var5 = class132.field2027;
        int var6 = class132.field2038;
        for (int var7 = 0; var7 < field392; var7++) {
            int var8 = (field392 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class215 var10 = Statics.field1854;
            String var11;
            if (field468[var7].length() > 0) {
                var11 = field397[var7] + class148.field2303 + field468[var7];
            } else {
                var11 = field397[var7];
            }
            var10.method3612(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field691;
        int var13 = Statics.field1539;
        int var14 = Statics.field572;
        int var15 = Statics.field805;
        for (int var16 = 0; var16 < field455; var16++) {
            if (field460[var16] + field372[var16] > var12 && field460[var16] < var12 + var14 && field488[var16] + field463[var16] > var13 && field488[var16] < var13 + var15) {
                field458[var16] = true;
            }
        }
    }

    @ObfuscatedName("ce.bb(IIIIB)V")
    public static final void method1643(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field455; var4++) {
            if (field460[var4] + field372[var4] > arg0 && field460[var4] < arg0 + arg2 && field488[var4] + field463[var4] > arg1 && field488[var4] < arg1 + arg3) {
                field457[var4] = true;
            }
        }
    }

    @ObfuscatedName("fb.bq(III)V")
    public static final void method3048(int arg0, int arg1) {
        int var2 = Statics.field1854.method3607(class148.field2252);
        for (int var3 = 0; var3 < field392; var3++) {
            class215 var4 = Statics.field1854;
            String var5;
            if (field468[var3].length() > 0) {
                var5 = field397[var3] + class148.field2303 + field468[var3];
            } else {
                var5 = field397[var3];
            }
            int var6 = var4.method3607(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field392 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1015) {
            var8 = Statics.field1015 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field1957) {
            var9 = Statics.field1957 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field352 = true;
        Statics.field691 = var8;
        Statics.field1539 = var9;
        Statics.field572 = var2;
        Statics.field805 = field392 * 15 + 22;
    }

    @ObfuscatedName("at.bd(II)Z")
    public static final boolean method659(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field395[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ac.bv(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method613(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 24) {
            class164 var8 = class164.method733(arg1);
            boolean var9 = true;
            if (var8.field2637 > 0) {
                var9 = method2613(var8);
            }
            if (var9) {
                field288.method2444(165);
                field288.method2174(arg1);
            }
        }
        if (arg2 == 15) {
            class3 var10 = field258[arg3];
            if (var10 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(124);
                field288.method2214(Statics.field1598);
                field288.method2238(field406);
                field288.method2197(class129.field1985[82] ? 1 : 0);
                field288.method2203(arg3);
            }
        }
        if (arg2 == 28) {
            field288.method2444(165);
            field288.method2174(arg1);
            class164 var11 = class164.method733(arg1);
            if (var11.field2651 != null && var11.field2651[0][0] == 5) {
                int var12 = var11.field2651[0][1];
                class167.field2787[var12] = 1 - class167.field2787[var12];
                method3002(var12);
            }
        }
        if (arg2 == 16) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field486 = arg0;
            field516 = arg1;
            field288.method2444(197);
            field288.method2205(Statics.field238);
            field288.method2215(Statics.field2548);
            field288.method2205(arg3);
            field288.method2238(Statics.field925 + arg1);
            field288.method2203(Statics.field550 + arg0);
            field288.method2205(Statics.field737);
            field288.method2333(class129.field1985[82] ? 1 : 0);
        }
        if (arg2 == 58) {
            class164 var13 = class164.method556(arg1, arg0);
            if (var13 != null) {
                field288.method2444(63);
                field288.method2214(arg1);
                field288.method2159(field406);
                field288.method2203(var13.field2751);
                field288.method2215(Statics.field1598);
                field288.method2203(field407);
                field288.method2203(arg0);
            }
        }
        if (arg2 == 14) {
            class3 var14 = field258[arg3];
            if (var14 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(138);
                field288.method2238(arg3);
                field288.method2158(class129.field1985[82] ? 1 : 0);
                field288.method2238(Statics.field737);
                field288.method2174(Statics.field2548);
                field288.method2203(Statics.field238);
            }
        }
        if (arg2 == 9) {
            class32 var15 = field285[arg3];
            if (var15 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(106);
                field288.method2159(arg3);
                field288.method2333(class129.field1985[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            Statics.field147.method1716(Statics.field1019, arg0, arg1);
        }
        if (arg2 == 38) {
            method1440();
            class164 var16 = class164.method733(arg1);
            field273 = 1;
            Statics.field737 = arg0;
            Statics.field2548 = arg1;
            Statics.field238 = arg3;
            method1416(var16);
            field425 = class2.method281(16748608) + class47.method2(arg3).field1034 + class2.method281(16777215);
            if (field425 == null) {
                field425 = "null";
            }
            return;
        }
        if (arg2 == 1001) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field486 = arg0;
            field516 = arg1;
            field288.method2444(177);
            field288.method2319(class129.field1985[82] ? 1 : 0);
            field288.method2238(Statics.field550 + arg0);
            field288.method2203(Statics.field925 + arg1);
            field288.method2205(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 30 && field414 == null) {
            method2879(arg1, arg0);
            field414 = class164.method556(arg1, arg0);
            method1416(field414);
        }
        if (arg2 == 31) {
            field288.method2444(69);
            field288.method2159(arg0);
            field288.method2159(Statics.field238);
            field288.method2205(Statics.field737);
            field288.method2174(arg1);
            field288.method2238(arg3);
            field288.method2174(Statics.field2548);
            field304 = 0;
            Statics.field2014 = class164.method733(arg1);
            field359 = arg0;
        }
        if (arg2 == 1) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field486 = arg0;
            field516 = arg1;
            field288.method2444(41);
            field288.method2159(Statics.field550 + arg0);
            field288.method2203(Statics.field925 + arg1);
            field288.method2238(arg3 >> 14 & 0x7FFF);
            field288.method2214(Statics.field2548);
            field288.method2205(Statics.field737);
            field288.method2159(Statics.field238);
            field288.method2158(class129.field1985[82] ? 1 : 0);
        }
        if (arg2 == 20) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field486 = arg0;
            field516 = arg1;
            field288.method2444(7);
            field288.method2333(class129.field1985[82] ? 1 : 0);
            field288.method2238(Statics.field550 + arg0);
            field288.method2238(Statics.field925 + arg1);
            field288.method2159(arg3);
        }
        if (arg2 == 29) {
            field288.method2444(165);
            field288.method2174(arg1);
            class164 var17 = class164.method733(arg1);
            if (var17.field2651 != null && var17.field2651[0][0] == 5) {
                int var18 = var17.field2651[0][1];
                if (class167.field2787[var18] != var17.field2745[0]) {
                    class167.field2787[var18] = var17.field2745[0];
                    method3002(var18);
                }
            }
        }
        if (arg2 == 33) {
            field288.method2444(243);
            field288.method2238(arg3);
            field288.method2215(arg1);
            field288.method2238(arg0);
            field304 = 0;
            Statics.field2014 = class164.method733(arg1);
            field359 = arg0;
        }
        if (arg2 == 19) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field486 = arg0;
            field516 = arg1;
            field288.method2444(192);
            field288.method2203(Statics.field925 + arg1);
            field288.method2333(class129.field1985[82] ? 1 : 0);
            field288.method2238(Statics.field550 + arg0);
            field288.method2203(arg3);
        }
        if (arg2 == 2) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field486 = arg0;
            field516 = arg1;
            field288.method2444(134);
            field288.method2205(field406);
            field288.method2159(Statics.field550 + arg0);
            field288.method2238(arg3 >> 14 & 0x7FFF);
            field288.method2174(Statics.field1598);
            field288.method2159(Statics.field925 + arg1);
            field288.method2319(class129.field1985[82] ? 1 : 0);
        }
        if (arg2 == 35) {
            field288.method2444(35);
            field288.method2205(arg3);
            field288.method2238(arg0);
            field288.method2215(arg1);
            field304 = 0;
            Statics.field2014 = class164.method733(arg1);
            field359 = arg0;
        }
        if (arg2 == 25) {
            class164 var19 = class164.method556(arg1, arg0);
            if (var19 != null) {
                method1440();
                int var20 = class169.method122(method761(var19));
                int var21 = var19.field2751;
                class164 var22 = class164.method556(arg1, arg0);
                if (var22 != null && var22.field2677 != null) {
                    class1 var23 = new class1();
                    var23.field3 = var22;
                    var23.field2 = var22.field2677;
                    class34.method554(var23, 200000);
                }
                field407 = var21;
                field405 = true;
                Statics.field1598 = arg1;
                field406 = arg0;
                Statics.field2791 = var20;
                method1416(var22);
                field273 = 0;
                String var24;
                if (class169.method122(method761(var19)) == 0) {
                    var24 = null;
                } else if (var19.field2671 == null || var19.field2671.trim().length() == 0) {
                    var24 = null;
                } else {
                    var24 = var19.field2671;
                }
                field408 = var24;
                if (field408 == null) {
                    field408 = "Null";
                }
                if (var19.field2710) {
                    field409 = var19.field2704 + class2.method281(16777215);
                } else {
                    field409 = class2.method281(65280) + var19.field2747 + class2.method281(16777215);
                }
            }
            return;
        }
        if (arg2 == 1004) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field288.method2444(180);
            field288.method2205(arg3);
        }
        if (arg2 == 11) {
            class32 var25 = field285[arg3];
            if (var25 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(120);
                field288.method2203(arg3);
                field288.method2197(class129.field1985[82] ? 1 : 0);
            }
        }
        if (arg2 == 43) {
            field288.method2444(5);
            field288.method2159(arg3);
            field288.method2214(arg1);
            field288.method2238(arg0);
            field304 = 0;
            Statics.field2014 = class164.method733(arg1);
            field359 = arg0;
        }
        if (arg2 == 21) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field486 = arg0;
            field516 = arg1;
            field288.method2444(23);
            field288.method2203(Statics.field925 + arg1);
            field288.method2197(class129.field1985[82] ? 1 : 0);
            field288.method2238(arg3);
            field288.method2159(Statics.field550 + arg0);
        }
        if (arg2 == 49) {
            class3 var26 = field258[arg3];
            if (var26 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(28);
                field288.method2159(arg3);
                field288.method2319(class129.field1985[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field288.method2444(0);
            field288.method2205(arg3);
            field288.method2205(arg0);
            field288.method2215(arg1);
            field304 = 0;
            Statics.field2014 = class164.method733(arg1);
            field359 = arg0;
        }
        if (arg2 == 46) {
            class3 var27 = field258[arg3];
            if (var27 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(10);
                field288.method2158(class129.field1985[82] ? 1 : 0);
                field288.method2205(arg3);
            }
        }
        if (arg2 == 18) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field486 = arg0;
            field516 = arg1;
            field288.method2444(186);
            field288.method2319(class129.field1985[82] ? 1 : 0);
            field288.method2203(arg3);
            field288.method2238(Statics.field550 + arg0);
            field288.method2159(Statics.field925 + arg1);
        }
        if (arg2 == 3) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field486 = arg0;
            field516 = arg1;
            field288.method2444(150);
            field288.method2159(Statics.field925 + arg1);
            field288.method2203(arg3 >> 14 & 0x7FFF);
            field288.method2238(Statics.field550 + arg0);
            field288.method2319(class129.field1985[82] ? 1 : 0);
        }
        if (arg2 == 22) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field486 = arg0;
            field516 = arg1;
            field288.method2444(29);
            field288.method2205(Statics.field925 + arg1);
            field288.method2319(class129.field1985[82] ? 1 : 0);
            field288.method2159(Statics.field550 + arg0);
            field288.method2238(arg3);
        }
        if (arg2 == 7) {
            class32 var28 = field285[arg3];
            if (var28 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(61);
                field288.method2205(Statics.field737);
                field288.method2205(arg3);
                field288.method2197(class129.field1985[82] ? 1 : 0);
                field288.method2213(Statics.field2548);
                field288.method2203(Statics.field238);
            }
        }
        if (arg2 == 42) {
            field288.method2444(73);
            field288.method2159(arg0);
            field288.method2205(arg3);
            field288.method2214(arg1);
            field304 = 0;
            Statics.field2014 = class164.method733(arg1);
            field359 = arg0;
        }
        if (arg2 == 40) {
            field288.method2444(187);
            field288.method2205(arg3);
            field288.method2159(arg0);
            field288.method2174(arg1);
            field304 = 0;
            Statics.field2014 = class164.method733(arg1);
            field359 = arg0;
        }
        if (arg2 == 32) {
            field288.method2444(52);
            field288.method2215(arg1);
            field288.method2203(arg3);
            field288.method2174(Statics.field1598);
            field288.method2159(arg0);
            field288.method2205(field406);
            field304 = 0;
            Statics.field2014 = class164.method733(arg1);
            field359 = arg0;
        }
        if (arg2 == 4) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field486 = arg0;
            field516 = arg1;
            field288.method2444(217);
            field288.method2197(class129.field1985[82] ? 1 : 0);
            field288.method2159(Statics.field925 + arg1);
            field288.method2159(Statics.field550 + arg0);
            field288.method2238(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 47) {
            class3 var29 = field258[arg3];
            if (var29 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(139);
                field288.method2205(arg3);
                field288.method2158(class129.field1985[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field288.method2444(93);
            field288.method2159(arg0);
            field288.method2159(arg3);
            field288.method2213(arg1);
            field304 = 0;
            Statics.field2014 = class164.method733(arg1);
            field359 = arg0;
        }
        if (arg2 == 41) {
            field288.method2444(98);
            field288.method2238(arg3);
            field288.method2213(arg1);
            field288.method2159(arg0);
            field304 = 0;
            Statics.field2014 = class164.method733(arg1);
            field359 = arg0;
        }
        if (arg2 == 44) {
            class3 var30 = field258[arg3];
            if (var30 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(220);
                field288.method2158(class129.field1985[82] ? 1 : 0);
                field288.method2238(arg3);
            }
        }
        if (arg2 == 37) {
            field288.method2444(162);
            field288.method2205(arg3);
            field288.method2203(arg0);
            field288.method2174(arg1);
            field304 = 0;
            Statics.field2014 = class164.method733(arg1);
            field359 = arg0;
        }
        if (arg2 == 10) {
            class32 var31 = field285[arg3];
            if (var31 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(169);
                field288.method2238(arg3);
                field288.method2319(class129.field1985[82] ? 1 : 0);
            }
        }
        if (arg2 == 5) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field486 = arg0;
            field516 = arg1;
            field288.method2444(195);
            field288.method2205(Statics.field550 + arg0);
            field288.method2319(class129.field1985[82] ? 1 : 0);
            field288.method2205(arg3 >> 14 & 0x7FFF);
            field288.method2205(Statics.field925 + arg1);
        }
        if (arg2 == 1005) {
            class164 var32 = class164.method733(arg1);
            if (var32 == null || var32.field2636[arg0] < 100000) {
                field288.method2444(180);
                field288.method2205(arg3);
            } else {
                class11.method1835(27, "", var32.field2636[arg0] + " x " + class47.method2(arg3).field1034);
            }
            field304 = 0;
            Statics.field2014 = class164.method733(arg1);
            field359 = arg0;
        }
        if (arg2 == 34) {
            field288.method2444(140);
            field288.method2213(arg1);
            field288.method2205(arg0);
            field288.method2238(arg3);
            field304 = 0;
            Statics.field2014 = class164.method733(arg1);
            field359 = arg0;
        }
        if (arg2 == 45) {
            class3 var33 = field258[arg3];
            if (var33 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(31);
                field288.method2197(class129.field1985[82] ? 1 : 0);
                field288.method2238(arg3);
            }
        }
        if (arg2 == 12) {
            class32 var34 = field285[arg3];
            if (var34 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(4);
                field288.method2158(class129.field1985[82] ? 1 : 0);
                field288.method2203(arg3);
            }
        }
        if (arg2 == 6) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field486 = arg0;
            field516 = arg1;
            field288.method2444(48);
            field288.method2238(Statics.field925 + arg1);
            field288.method2159(Statics.field550 + arg0);
            field288.method2197(class129.field1985[82] ? 1 : 0);
            field288.method2205(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1002) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field288.method2444(143);
            field288.method2205(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 51) {
            class3 var35 = field258[arg3];
            if (var35 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(213);
                field288.method2238(arg3);
                field288.method2197(class129.field1985[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class32 var36 = field285[arg3];
            if (var36 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(55);
                field288.method2238(arg3);
                field288.method2319(class129.field1985[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class32 var37 = field285[arg3];
            if (var37 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(114);
                field288.method2158(class129.field1985[82] ? 1 : 0);
                field288.method2213(Statics.field1598);
                field288.method2159(field406);
                field288.method2203(arg3);
            }
        }
        if (arg2 == 17) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            field486 = arg0;
            field516 = arg1;
            field288.method2444(104);
            field288.method2213(Statics.field1598);
            field288.method2238(field406);
            field288.method2238(Statics.field925 + arg1);
            field288.method2238(arg3);
            field288.method2203(Statics.field550 + arg0);
            field288.method2333(class129.field1985[82] ? 1 : 0);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class164 var38 = class164.method556(arg1, arg0);
            if (var38 != null) {
                method12(arg3, arg1, arg0, var38.field2751, arg5);
            }
        }
        if (arg2 == 50) {
            class3 var39 = field258[arg3];
            if (var39 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(188);
                field288.method2205(arg3);
                field288.method2158(class129.field1985[82] ? 1 : 0);
            }
        }
        if (arg2 == 48) {
            class3 var40 = field258[arg3];
            if (var40 != null) {
                field354 = arg6;
                field403 = arg7;
                field357 = 2;
                field356 = 0;
                field486 = arg0;
                field516 = arg1;
                field288.method2444(161);
                field288.method2319(class129.field1985[82] ? 1 : 0);
                field288.method2238(arg3);
            }
        }
        if (arg2 == 1003) {
            field354 = arg6;
            field403 = arg7;
            field357 = 2;
            field356 = 0;
            class32 var41 = field285[arg3];
            if (var41 != null) {
                class37 var42 = var41.field708;
                if (var42.field808 != null) {
                    var42 = var42.method691();
                }
                if (var42 != null) {
                    field288.method2444(122);
                    field288.method2203(var42.field810);
                }
            }
        }
        if (arg2 == 26) {
            field288.method2444(110);
            for (class4 var43 = (class4) field411.method3384(); var43 != null; var43 = (class4) field411.method3377()) {
                if (var43.field51 == 0 || var43.field51 == 3) {
                    method2596(var43, true);
                }
            }
            if (field414 != null) {
                method1416(field414);
                field414 = null;
            }
        }
        if (field273 != 0) {
            field273 = 0;
            method1416(class164.method733(Statics.field2548));
        }
        if (field405) {
            method1440();
        }
        if (Statics.field2014 != null && field304 == 0) {
            method1416(Statics.field2014);
        }
    }

    @ObfuscatedName("bj.bc(I)V")
    public static void method1440() {
        if (!field405) {
            return;
        }
        class164 var0 = class164.method556(Statics.field1598, field406);
        if (var0 != null && var0.field2723 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field2 = var0.field2723;
            class34.method554(var1, 200000);
        }
        field405 = false;
        method1416(var0);
    }

    @ObfuscatedName("fj.ce(III)V")
    public static void method2879(int arg0, int arg1) {
        field288.method2444(37);
        field288.method2238(arg1);
        field288.method2174(arg0);
    }

    @ObfuscatedName("p.cq(IIIILjava/lang/String;I)V")
    public static void method12(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class164 var5 = class164.method556(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2707 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field9 = arg0;
            var6.field10 = arg4;
            var6.field2 = var5.field2707;
            class34.method554(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field2637 > 0) {
            var7 = method2613(var5);
        }
        if (!var7 || !class169.method1441(method761(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field288.method2444(173);
            field288.method2174(arg1);
            field288.method2159(arg2);
            field288.method2159(arg3);
        }
        if (arg0 == 2) {
            field288.method2444(76);
            field288.method2174(arg1);
            field288.method2159(arg2);
            field288.method2159(arg3);
        }
        if (arg0 == 3) {
            field288.method2444(212);
            field288.method2174(arg1);
            field288.method2159(arg2);
            field288.method2159(arg3);
        }
        if (arg0 == 4) {
            field288.method2444(13);
            field288.method2174(arg1);
            field288.method2159(arg2);
            field288.method2159(arg3);
        }
        if (arg0 == 5) {
            field288.method2444(9);
            field288.method2174(arg1);
            field288.method2159(arg2);
            field288.method2159(arg3);
        }
        if (arg0 == 6) {
            field288.method2444(40);
            field288.method2174(arg1);
            field288.method2159(arg2);
            field288.method2159(arg3);
        }
        if (arg0 == 7) {
            field288.method2444(38);
            field288.method2174(arg1);
            field288.method2159(arg2);
            field288.method2159(arg3);
        }
        if (arg0 == 8) {
            field288.method2444(19);
            field288.method2174(arg1);
            field288.method2159(arg2);
            field288.method2159(arg3);
        }
        if (arg0 == 9) {
            field288.method2444(147);
            field288.method2174(arg1);
            field288.method2159(arg2);
            field288.method2159(arg3);
        }
        if (arg0 == 10) {
            field288.method2444(190);
            field288.method2174(arg1);
            field288.method2159(arg2);
            field288.method2159(arg3);
        }
    }

    @ObfuscatedName("ax.cp(I)V")
    public static final void method909() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field392 - 1; var1++) {
                if (field395[var1] < 1000 && field395[var1 + 1] > 1000) {
                    String var2 = field468[var1];
                    field468[var1] = field468[var1 + 1];
                    field468[var1 + 1] = var2;
                    String var3 = field397[var1];
                    field397[var1] = field397[var1 + 1];
                    field397[var1 + 1] = var3;
                    int var4 = field395[var1];
                    field395[var1] = field395[var1 + 1];
                    field395[var1 + 1] = var4;
                    int var5 = field254[var1];
                    field254[var1] = field254[var1 + 1];
                    field254[var1 + 1] = var5;
                    int var6 = field277[var1];
                    field277[var1] = field277[var1 + 1];
                    field277[var1 + 1] = var6;
                    int var7 = field396[var1];
                    field396[var1] = field396[var1 + 1];
                    field396[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("s.cj(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method605(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field352 || field392 >= 500) {
            return;
        }
        field397[field392] = arg0;
        field468[field392] = arg1;
        field395[field392] = arg2;
        field396[field392] = arg3;
        field254[field392] = arg4;
        field277[field392] = arg5;
        field392++;
    }

    @ObfuscatedName("cd.cb(I)V")
    public static void method2011() {
        for (int var0 = 0; var0 < field392; var0++) {
            int var1 = field395[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field392 - 1) {
                    for (int var3 = var0; var3 < field392 - 1; var3++) {
                        field397[var3] = field397[var3 + 1];
                        field468[var3] = field468[var3 + 1];
                        field395[var3] = field395[var3 + 1];
                        field396[var3] = field396[var3 + 1];
                        field254[var3] = field254[var3 + 1];
                        field277[var3] = field277[var3 + 1];
                    }
                }
                field392--;
            }
        }
    }

    @ObfuscatedName("az.ck(IIIIB)V")
    public static final void method918(int arg0, int arg1, int arg2, int arg3) {
        if (field273 == 0 && !field405) {
            method605(class148.field2454, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class100.field1774; var6++) {
            int var7 = class100.field1776[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field147.method1697(Statics.field1019, var8, var9, var7) >= 0) {
                    class38 var12 = class38.method1473(var11);
                    if (var12.field886 != null) {
                        var12 = var12.method724();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field273 == 1) {
                        method605(class148.field2337, field425 + " " + class2.field20 + " " + class2.method281(65535) + var12.field876, 1, var7, var8, var9);
                    } else if (!field405) {
                        String[] var13 = var12.field849;
                        if (field495) {
                            var13 = method522(var13);
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
                                    method605(var13[var14], class2.method281(65535) + var12.field876, var15, var7, var8, var9);
                                }
                            }
                        }
                        method605(class148.field2338, class2.method281(65535) + var12.field876, 1002, var12.field852 << 14, var8, var9);
                    } else if ((Statics.field2791 & 0x4) == 4) {
                        method605(field408, field409 + " " + class2.field20 + " " + class2.method281(65535) + var12.field876, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class32 var16 = field285[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field708.field812 == 1 && (var16.field765 & 0x7F) == 64 && (var16.field741 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field286; var17++) {
                            class32 var18 = field285[field287[var17]];
                            if (var18 != null && var16 != var18 && var18.field708.field812 == 1 && var16.field765 == var18.field765 && var16.field741 == var18.field741) {
                                method782(var18.field708, field287[var17], var8, var9);
                            }
                        }
                        for (int var19 = 0; var19 < field519; var19++) {
                            class3 var20 = field258[field370[var19]];
                            if (var20 != null && var16.field765 == var20.field765 && var16.field741 == var20.field741) {
                                method612(var20, field370[var19], var8, var9);
                            }
                        }
                    }
                    method782(var16.field708, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var21 = field258[var11];
                    if (var21 == null) {
                        continue;
                    }
                    if ((var21.field765 & 0x7F) == 64 && (var21.field741 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < field286; var22++) {
                            class32 var23 = field285[field287[var22]];
                            if (var23 != null && var23.field708.field812 == 1 && var21.field765 == var23.field765 && var21.field741 == var23.field741) {
                                method782(var23.field708, field287[var22], var8, var9);
                            }
                        }
                        for (int var24 = 0; var24 < field519; var24++) {
                            class3 var25 = field258[field370[var24]];
                            if (var25 != null && var21 != var25 && var21.field765 == var25.field765 && var21.field741 == var25.field741) {
                                method612(var25, field370[var24], var8, var9);
                            }
                        }
                    }
                    if (field382 == var11) {
                        var4 = var7;
                    } else {
                        method612(var21, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class190 var26 = field383[Statics.field1019][var8][var9];
                    if (var26 != null) {
                        for (class27 var27 = (class27) var26.method3438(); var27 != null; var27 = (class27) var26.method3414()) {
                            class47 var28 = class47.method2(var27.field634);
                            if (field273 == 1) {
                                method605(class148.field2337, field425 + " " + class2.field20 + " " + class2.method281(16748608) + var28.field1034, 16, var27.field634, var8, var9);
                            } else if (!field405) {
                                String[] var29 = var28.field1045;
                                if (field495) {
                                    var29 = method522(var29);
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
                                        method605(var29[var30], class2.method281(16748608) + var28.field1034, var31, var27.field634, var8, var9);
                                    } else if (var30 == 2) {
                                        method605(class148.field2330, class2.method281(16748608) + var28.field1034, 20, var27.field634, var8, var9);
                                    }
                                }
                                method605(class148.field2338, class2.method281(16748608) + var28.field1034, 1004, var27.field634, var8, var9);
                            } else if ((Statics.field2791 & 0x1) == 1) {
                                method605(field408, field409 + " " + class2.field20 + " " + class2.method281(16748608) + var28.field1034, 17, var27.field634, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var32 = var4 & 0x7F;
            int var33 = var4 >> 7 & 0x7F;
            class3 var34 = field258[field382];
            method612(var34, field382, var32, var33);
        }
    }

    @ObfuscatedName("ab.cv(Lao;IIII)V")
    public static final void method782(class37 arg0, int arg1, int arg2, int arg3) {
        if (field392 >= 400) {
            return;
        }
        if (arg0.field808 != null) {
            arg0 = arg0.method691();
        }
        if (arg0 == null || !arg0.field839 || arg0.field832 && field394 != arg1) {
            return;
        }
        String var4 = arg0.field816;
        if (arg0.field828 != 0) {
            var4 = var4 + method1920(arg0.field828, Statics.field1548.field31) + " " + class2.field18 + class148.field2343 + arg0.field828 + class2.field26;
        }
        if (field273 == 1) {
            method605(class148.field2337, field425 + " " + class2.field20 + " " + class2.method281(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field405) {
            String[] var5 = arg0.field826;
            if (field495) {
                var5 = method522(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class148.field2339)) {
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
                        method605(var5[var6], class2.method281(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class148.field2339)) {
                        short var9 = 0;
                        if (field278 == class19.field534 || field278 == class19.field531 && arg0.field828 > Statics.field1548.field31) {
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
                        method605(var5[var8], class2.method281(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method605(class148.field2338, class2.method281(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2791 & 0x2) == 2) {
            method605(field408, field409 + " " + class2.field20 + " " + class2.method281(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ac.ch(Lp;IIII)V")
    public static final void method612(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1548 == arg0 || field392 >= 400) {
            return;
        }
        String var4;
        if (arg0.field34 == 0) {
            var4 = arg0.field42 + method1920(arg0.field31, Statics.field1548.field31) + " " + class2.field18 + class148.field2343 + arg0.field31 + class2.field26;
        } else {
            var4 = arg0.field42 + " " + class2.field18 + class148.field2344 + arg0.field34 + class2.field26;
        }
        if (field273 == 1) {
            method605(class148.field2337, field425 + " " + class2.field20 + " " + class2.method281(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field405) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field339[var5] != null) {
                    short var6 = 0;
                    if (field339[var5].equalsIgnoreCase(class148.field2339)) {
                        if (field278 == class19.field534 || field278 == class19.field531 && arg0.field31 > Statics.field1548.field31) {
                            var6 = 2000;
                        }
                        if (Statics.field1548.field45 != 0 && arg0.field45 != 0) {
                            if (Statics.field1548.field45 == arg0.field45) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field469[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field289[var5] + var6;
                    method605(field339[var5], class2.method281(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2791 & 0x8) == 8) {
            method605(field408, field409 + " " + class2.field20 + " " + class2.method281(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field392; var9++) {
            if (field395[var9] == 23) {
                field468[var9] = class2.method281(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("cm.cz(III)Ljava/lang/String;")
    public static final String method1920(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method281(16711680);
        } else if (var2 < -6) {
            return class2.method281(16723968);
        } else if (var2 < -3) {
            return class2.method281(16740352);
        } else if (var2 < 0) {
            return class2.method281(16756736);
        } else if (var2 > 9) {
            return class2.method281(65280);
        } else if (var2 > 6) {
            return class2.method281(4259584);
        } else if (var2 > 3) {
            return class2.method281(8453888);
        } else if (var2 > 0) {
            return class2.method281(12648192);
        } else {
            return class2.method281(16776960);
        }
    }

    @ObfuscatedName("dx.cl(IIIIIIIII)V")
    public static final void method2505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class164.method1834(arg0)) {
            Statics.field1277 = null;
            method2614(Statics.field2709[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1277 != null) {
                method2614(Statics.field1277, -1412584499, arg1, arg2, arg3, arg4, Statics.field79, Statics.field241, arg7);
                Statics.field1277 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field457[var8] = true;
            }
        } else {
            field457[arg7] = true;
        }
    }

    @ObfuscatedName("dw.cf([Lfi;IIIIIIIIB)V")
    public static final void method2614(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75.method1572(arg2, arg3, arg4, arg5);
        class86.method1838();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class164 var10 = arg0[var9];
            if (var10 != null && (var10.field2624 == arg1 || arg1 == -1412584499 && field436 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field460[field455] = var10.field2646 + arg6;
                    field488[field455] = var10.field2647 + arg7;
                    field372[field455] = var10.field2648;
                    field463[field455] = var10.field2754;
                    var11 = ++field455 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2762 = var11;
                var10.field2763 = field256;
                if (!var10.field2710 || !method84(var10)) {
                    if (var10.field2637 > 0) {
                        int var12 = var10.field2637;
                        if (var12 == 324) {
                            if (field527 == -1) {
                                field527 = var10.field2666;
                                field528 = var10.field2667;
                            }
                            if (field526.field2814) {
                                var10.field2666 = field527;
                            } else {
                                var10.field2666 = field528;
                            }
                        } else if (var12 == 325) {
                            if (field527 == -1) {
                                field527 = var10.field2666;
                                field528 = var10.field2667;
                            }
                            if (field526.field2814) {
                                var10.field2666 = field528;
                            } else {
                                var10.field2666 = field527;
                            }
                        } else if (var12 == 327) {
                            var10.field2748 = 150;
                            var10.field2683 = (int) (Math.sin((double) field256 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2638 = 5;
                            var10.field2675 = 0;
                        } else if (var12 == 328) {
                            var10.field2748 = 150;
                            var10.field2683 = (int) (Math.sin((double) field256 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2638 = 5;
                            var10.field2675 = 1;
                        }
                    }
                    int var13 = var10.field2646 + arg6;
                    int var14 = var10.field2647 + arg7;
                    int var15 = var10.field2686;
                    if (field436 == var10) {
                        if (arg1 != -1412584499 && !var10.field2665) {
                            Statics.field1277 = arg0;
                            Statics.field79 = arg6;
                            Statics.field241 = arg7;
                            continue;
                        }
                        if (field434 && field472) {
                            int var16 = class132.field2027;
                            int var17 = class132.field2038;
                            int var18 = var16 - field346;
                            int var19 = var17 - field300;
                            if (var18 < field423) {
                                var18 = field423;
                            }
                            if (var10.field2648 + var18 > field423 + field306.field2648) {
                                var18 = field423 + field306.field2648 - var10.field2648;
                            }
                            if (var19 < field430) {
                                var19 = field430;
                            }
                            if (var10.field2754 + var19 > field430 + field306.field2754) {
                                var19 = field430 + field306.field2754 - var10.field2754;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2665) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2635 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2635 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2648 + var13;
                        int var27 = var10.field2754 + var14;
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
                        int var30 = var10.field2648 + var13;
                        int var31 = var10.field2754 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2710 || var20 < var22 && var21 < var23) {
                        if (var10.field2637 != 0) {
                            if (var10.field2637 == 1336) {
                                if (field262) {
                                    var14 += 15;
                                    Statics.field350.method3623("Fps:" + field2081, var10.field2648 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field251) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field251) {
                                        var34 = 16711680;
                                    }
                                    Statics.field350.method3623("Mem:" + var33 + "k", var10.field2648 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2637 == 1337) {
                                field412 = var13;
                                field518 = var14;
                                int var37 = var10.field2648;
                                int var38 = var10.field2754;
                                field491++;
                                method3535(class31.field700);
                                boolean var39 = false;
                                if (field382 >= 0) {
                                    for (int var40 = 0; var40 < field519; var40++) {
                                        if (field382 == field370[var40]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method3535(class31.field699);
                                }
                                method2545(true);
                                method3535(var39 ? class31.field701 : class31.field702);
                                method2545(false);
                                method2979();
                                for (class28 var41 = (class28) field490.method3415(); var41 != null; var41 = (class28) field490.method3419()) {
                                    if (Statics.field1019 != var41.field652 || var41.field649) {
                                        var41.method3506();
                                    } else if (field256 >= var41.field641) {
                                        var41.method615(field312);
                                        if (var41.field649) {
                                            var41.method3506();
                                        } else {
                                            Statics.field147.method1780(var41.field652, var41.field642, var41.field644, var41.field645, 60, var41, 0, -1, false);
                                        }
                                    }
                                }
                                method611(var13, var14, var37, var38, true);
                                int var42 = field515;
                                int var43 = field391;
                                int var44 = field418;
                                int var45 = field453;
                                class75.method1572(var42, var43, var42 + var44, var43 + var45);
                                class86.method1838();
                                if (!field500) {
                                    int var46 = field331;
                                    if (field398 / 256 > var46) {
                                        var46 = field398 / 256;
                                    }
                                    if (field502[4] && field504[4] + 128 > var46) {
                                        var46 = field504[4] + 128;
                                    }
                                    int var47 = field332 + field315 & 0x7FF;
                                    int var48 = Statics.field2615;
                                    int var49 = method2112(Statics.field1548.field765, Statics.field1548.field741, Statics.field1019) - 50;
                                    int var50 = Statics.field908;
                                    int var51 = var46 * 3 + 600;
                                    int var52 = 2048 - var46 & 0x7FF;
                                    int var53 = 2048 - var47 & 0x7FF;
                                    int var54 = 0;
                                    int var55 = 0;
                                    int var56 = var51;
                                    if (var52 != 0) {
                                        int var57 = class86.field1504[var52];
                                        int var58 = class86.field1491[var52];
                                        int var59 = var55 * var58 - var51 * var57 >> 16;
                                        var56 = var55 * var57 + var51 * var58 >> 16;
                                        var55 = var59;
                                    }
                                    if (var53 != 0) {
                                        int var60 = class86.field1504[var53];
                                        int var61 = class86.field1491[var53];
                                        int var62 = var54 * var61 + var56 * var60 >> 16;
                                        var56 = var56 * var61 - var54 * var60 >> 16;
                                        var54 = var62;
                                    }
                                    Statics.field582 = var48 - var54;
                                    Statics.field2073 = var49 - var55;
                                    Statics.field1588 = var50 - var56;
                                    Statics.field1097 = var46;
                                    Statics.field974 = var47;
                                }
                                int var63;
                                if (field500) {
                                    var63 = method2014();
                                } else {
                                    var63 = method1439();
                                }
                                int var64 = Statics.field582;
                                int var65 = Statics.field2073;
                                int var66 = Statics.field1588;
                                int var67 = Statics.field1097;
                                int var68 = Statics.field974;
                                for (int var69 = 0; var69 < 5; var69++) {
                                    if (field502[var69]) {
                                        int var70 = (int) (Math.random() * (double) (field503[var69] * 2 + 1) - (double) field503[var69] + Math.sin((double) field246[var69] / 100.0D * (double) field506[var69]) * (double) field504[var69]);
                                        if (var69 == 0) {
                                            Statics.field582 += var70;
                                        }
                                        if (var69 == 1) {
                                            Statics.field2073 += var70;
                                        }
                                        if (var69 == 2) {
                                            Statics.field1588 += var70;
                                        }
                                        if (var69 == 3) {
                                            Statics.field974 = Statics.field974 + var70 & 0x7FF;
                                        }
                                        if (var69 == 4) {
                                            Statics.field1097 += var70;
                                            if (Statics.field1097 < 128) {
                                                Statics.field1097 = 128;
                                            }
                                            if (Statics.field1097 > 383) {
                                                Statics.field1097 = 383;
                                            }
                                        }
                                    }
                                }
                                int var71 = class132.field2027;
                                int var72 = class132.field2038;
                                if (class132.field2033 != 0) {
                                    var71 = class132.field2034;
                                    var72 = class132.field2035;
                                }
                                if (var71 >= var42 && var71 < var42 + var44 && var72 >= var43 && var72 < var43 + var45) {
                                    class100.field1750 = true;
                                    class100.field1774 = 0;
                                    class100.field1780 = var71 - var42;
                                    class100.field1767 = var72 - var43;
                                } else {
                                    class100.field1750 = false;
                                    class100.field1774 = 0;
                                }
                                method1907();
                                class75.method1578(var42, var43, var44, var45, 0);
                                method1907();
                                int var73 = class86.field1502;
                                class86.field1502 = field426;
                                Statics.field147.method1686(Statics.field582, Statics.field2073, Statics.field1588, Statics.field1097, Statics.field974, var63);
                                class86.field1502 = var73;
                                method1907();
                                Statics.field147.method1702();
                                method160(var42, var43, var44, var45);
                                method1908(var42, var43);
                                ((class90) Statics.field1485).method1913(field312);
                                method3549(var42, var43, var44, var45);
                                Statics.field582 = var64;
                                Statics.field2073 = var65;
                                Statics.field1588 = var66;
                                Statics.field1097 = var67;
                                Statics.field974 = var68;
                                if (field427 && class162.method654(true, false) == 0) {
                                    field427 = false;
                                }
                                if (field427) {
                                    class75.method1578(var42, var43, var44, var45, 0);
                                    method10(class148.field2219, false);
                                }
                                field457[var10.field2762] = true;
                                class75.method1572(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2637 == 1338) {
                                Statics.method621(var10, var13, var14, var11);
                                class75.method1572(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2637 == 1339) {
                                method85(var10, var13, var14, var11);
                                class75.method1572(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2635 == 0) {
                            if (!var10.field2710 && method84(var10) && Statics.field2050 != var10) {
                                continue;
                            }
                            if (!var10.field2710) {
                                if (var10.field2655 > var10.field2657 - var10.field2754) {
                                    var10.field2655 = var10.field2657 - var10.field2754;
                                }
                                if (var10.field2655 < 0) {
                                    var10.field2655 = 0;
                                }
                            }
                            method2614(arg0, var10.field2633, var20, var21, var22, var23, var13 - var10.field2628, var14 - var10.field2655, var11);
                            if (var10.field2755 != null) {
                                method2614(var10.field2755, var10.field2633, var20, var21, var22, var23, var13 - var10.field2628, var14 - var10.field2655, var11);
                            }
                            class4 var74 = (class4) field411.method3382((long) var10.field2633);
                            if (var74 != null) {
                                method2505(var74.field50, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class75.method1572(arg2, arg3, arg4, arg5);
                            class86.method1838();
                        }
                        if (field466 || field459[var11] || field464 > 1) {
                            if (var10.field2635 == 0 && !var10.field2710 && var10.field2657 > var10.field2754) {
                                method111(var10.field2648 + var13, var14, var10.field2655, var10.field2754, var10.field2657);
                            }
                            if (var10.field2635 != 1) {
                                if (var10.field2635 == 2) {
                                    int var75 = 0;
                                    for (int var76 = 0; var76 < var10.field2645; var76++) {
                                        for (int var77 = 0; var77 < var10.field2644; var77++) {
                                            int var78 = (var10.field2697 + 32) * var77 + var13;
                                            int var79 = (var10.field2698 + 32) * var76 + var14;
                                            if (var75 < 20) {
                                                var78 += var10.field2699[var75];
                                                var79 += var10.field2700[var75];
                                            }
                                            if (var10.field2676[var75] > 0) {
                                                boolean var80 = false;
                                                boolean var81 = false;
                                                int var82 = var10.field2676[var75] - 1;
                                                if (var78 + 32 > arg2 && var78 < arg4 && var79 + 32 > arg3 && var79 < arg5 || Statics.field1688 == var10 && field361 == var75) {
                                                    class74 var83;
                                                    if (field273 == 1 && Statics.field737 == var75 && Statics.field2548 == var10.field2633) {
                                                        var83 = class47.method2657(var82, var10.field2636[var75], 2, 0, 2, false);
                                                    } else {
                                                        var83 = class47.method2657(var82, var10.field2636[var75], 1, 3153952, 2, false);
                                                    }
                                                    if (var83 == null) {
                                                        method1416(var10);
                                                    } else if (Statics.field1688 == var10 && field361 == var75) {
                                                        int var84 = class132.field2027 - field362;
                                                        int var85 = class132.field2038 - field363;
                                                        if (var84 < 5 && var84 > -5) {
                                                            var84 = 0;
                                                        }
                                                        if (var85 < 5 && var85 > -5) {
                                                            var85 = 0;
                                                        }
                                                        if (field393 < 5) {
                                                            var84 = 0;
                                                            var85 = 0;
                                                        }
                                                        var83.method1492(var78 + var84, var79 + var85, 128);
                                                        if (arg1 != -1) {
                                                            class164 var86 = arg0[arg1 & 0xFFFF];
                                                            if (var79 + var85 < class75.field1332 && var86.field2655 > 0) {
                                                                int var87 = field312 * (class75.field1332 - var79 - var85) / 3;
                                                                if (var87 > field312 * 10) {
                                                                    var87 = field312 * 10;
                                                                }
                                                                if (var87 > var86.field2655) {
                                                                    var87 = var86.field2655;
                                                                }
                                                                var86.field2655 -= var87;
                                                                field363 += var87;
                                                                method1416(var86);
                                                            }
                                                            if (var79 + var85 + 32 > class75.field1330 && var86.field2655 < var86.field2657 - var86.field2754) {
                                                                int var88 = field312 * (var79 + var85 + 32 - class75.field1330) / 3;
                                                                if (var88 > field312 * 10) {
                                                                    var88 = field312 * 10;
                                                                }
                                                                if (var88 > var86.field2657 - var86.field2754 - var86.field2655) {
                                                                    var88 = var86.field2657 - var86.field2754 - var86.field2655;
                                                                }
                                                                var86.field2655 += var88;
                                                                field363 -= var88;
                                                                method1416(var86);
                                                            }
                                                        }
                                                    } else if (Statics.field2014 == var10 && field359 == var75) {
                                                        var83.method1492(var78, var79, 128);
                                                    } else {
                                                        var83.method1528(var78, var79);
                                                    }
                                                }
                                            } else if (var10.field2701 != null && var75 < 20) {
                                                class74 var89 = var10.method3020(var75);
                                                if (var89 != null) {
                                                    var89.method1528(var78, var79);
                                                } else if (class164.field2631) {
                                                    method1416(var10);
                                                }
                                            }
                                            var75++;
                                        }
                                    }
                                } else if (var10.field2635 == 3) {
                                    int var90;
                                    if (method817(var10)) {
                                        var90 = var10.field2659;
                                        if (Statics.field2050 == var10 && var10.field2661 != 0) {
                                            var90 = var10.field2661;
                                        }
                                    } else {
                                        var90 = var10.field2658;
                                        if (Statics.field2050 == var10 && var10.field2660 != 0) {
                                            var90 = var10.field2660;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2662) {
                                            class75.method1578(var13, var14, var10.field2648, var10.field2754, var90);
                                        } else {
                                            class75.method1582(var13, var14, var10.field2648, var10.field2754, var90);
                                        }
                                    } else if (var10.field2662) {
                                        class75.method1579(var13, var14, var10.field2648, var10.field2754, var90, 256 - (var15 & 0xFF));
                                    } else {
                                        class75.method1593(var13, var14, var10.field2648, var10.field2754, var90, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2635 == 4) {
                                    class215 var91 = var10.method3022();
                                    if (var91 != null) {
                                        String var92 = var10.field2691;
                                        int var93;
                                        if (method817(var10)) {
                                            var93 = var10.field2659;
                                            if (Statics.field2050 == var10 && var10.field2661 != 0) {
                                                var93 = var10.field2661;
                                            }
                                            if (var10.field2692.length() > 0) {
                                                var92 = var10.field2692;
                                            }
                                        } else {
                                            var93 = var10.field2658;
                                            if (Statics.field2050 == var10 && var10.field2660 != 0) {
                                                var93 = var10.field2660;
                                            }
                                        }
                                        if (var10.field2710 && var10.field2751 != -1) {
                                            class47 var94 = class47.method2(var10.field2751);
                                            var92 = var94.field1034;
                                            if (var92 == null) {
                                                var92 = "null";
                                            }
                                            if ((var94.field1042 == 1 || var10.field2752 != 1) && var10.field2752 != -1) {
                                                var92 = class2.method281(16748608) + var92 + class2.field22 + " " + 'x' + method609(var10.field2752);
                                            }
                                        }
                                        if (field414 == var10) {
                                            class148 var10000 = (class148) null;
                                            var92 = class148.field2352;
                                            var93 = var10.field2658;
                                        }
                                        if (!var10.field2710) {
                                            var92 = method33(var92, var10);
                                        }
                                        var91.method3669(var92, var13, var14, var10.field2648, var10.field2754, var93, var10.field2735 ? 0 : -1, var10.field2694, var10.field2695, var10.field2693);
                                    } else if (class164.field2631) {
                                        method1416(var10);
                                    }
                                } else if (var10.field2635 == 5) {
                                    if (var10.field2710) {
                                        class74 var96;
                                        if (var10.field2751 == -1) {
                                            var96 = var10.method3039(false);
                                        } else {
                                            var96 = class47.method2657(var10.field2751, var10.field2752, var10.field2670, var10.field2663, var10.field2702, false);
                                        }
                                        if (var96 != null) {
                                            int var97 = var96.field1319;
                                            int var98 = var96.field1323;
                                            if (var10.field2669) {
                                                class75.method1575(var13, var14, var10.field2648 + var13, var10.field2754 + var14);
                                                int var99 = (var10.field2648 + (var97 - 1)) / var97;
                                                int var100 = (var10.field2754 + (var98 - 1)) / var98;
                                                for (int var101 = 0; var101 < var99; var101++) {
                                                    for (int var102 = 0; var102 < var100; var102++) {
                                                        if (var10.field2764 != 0) {
                                                            var96.method1499(var97 / 2 + var97 * var101 + var13, var98 / 2 + var98 * var102 + var14, var10.field2764, 4096);
                                                        } else if (var15 == 0) {
                                                            var96.method1528(var97 * var101 + var13, var98 * var102 + var14);
                                                        } else {
                                                            var96.method1492(var97 * var101 + var13, var98 * var102 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class75.method1572(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var103 = var10.field2648 * 4096 / var97;
                                                if (var10.field2764 != 0) {
                                                    var96.method1499(var10.field2648 / 2 + var13, var10.field2754 / 2 + var14, var10.field2764, var103);
                                                } else if (var15 != 0) {
                                                    var96.method1547(var13, var14, var10.field2648, var10.field2754, 256 - (var15 & 0xFF));
                                                } else if (var10.field2648 == var97 && var10.field2754 == var98) {
                                                    var96.method1528(var13, var14);
                                                } else {
                                                    var96.method1496(var13, var14, var10.field2648, var10.field2754);
                                                }
                                            }
                                        } else if (class164.field2631) {
                                            method1416(var10);
                                        }
                                    } else {
                                        class74 var95 = var10.method3039(method817(var10));
                                        if (var95 != null) {
                                            var95.method1528(var13, var14);
                                        } else if (class164.field2631) {
                                            method1416(var10);
                                        }
                                    }
                                } else if (var10.field2635 == 6) {
                                    boolean var104 = method817(var10);
                                    int var105;
                                    if (var104) {
                                        var105 = var10.field2679;
                                    } else {
                                        var105 = var10.field2622;
                                    }
                                    class100 var106 = null;
                                    int var107 = 0;
                                    if (var10.field2751 != -1) {
                                        class47 var108 = class47.method2(var10.field2751);
                                        if (var108 != null) {
                                            class47 var109 = var108.method950(var10.field2752);
                                            var106 = var109.method935(1);
                                            if (var106 == null) {
                                                method1416(var10);
                                            } else {
                                                var106.method2020();
                                                var107 = var106.field1364 / 2;
                                            }
                                        }
                                    } else if (var10.field2638 == 5) {
                                        if (var10.field2675 == 0) {
                                            var106 = field526.method3092((class40) null, -1, (class40) null, -1);
                                        } else {
                                            var106 = Statics.field1548.method14();
                                        }
                                    } else if (var105 == -1) {
                                        var106 = var10.method3011((class40) null, -1, var104, Statics.field1548.field28);
                                        if (var106 == null && class164.field2631) {
                                            method1416(var10);
                                        }
                                    } else {
                                        class40 var110 = class40.method168(var105);
                                        var106 = var10.method3011(var110, var10.field2753, var104, Statics.field1548.field28);
                                        if (var106 == null && class164.field2631) {
                                            method1416(var10);
                                        }
                                    }
                                    class86.method1865(var10.field2648 / 2 + var13, var10.field2754 / 2 + var14);
                                    int var111 = var10.field2685 * class86.field1504[var10.field2748] >> 16;
                                    int var112 = var10.field2685 * class86.field1491[var10.field2748] >> 16;
                                    if (var106 != null) {
                                        if (var10.field2710) {
                                            var106.method2020();
                                            if (var10.field2688) {
                                                var106.method2071(0, var10.field2683, var10.field2750, var10.field2748, var10.field2680, var10.field2681 + var107 + var111, var10.field2681 + var112, var10.field2685);
                                            } else {
                                                var106.method2015(0, var10.field2683, var10.field2750, var10.field2748, var10.field2680, var10.field2681 + var107 + var111, var10.field2681 + var112);
                                            }
                                        } else {
                                            var106.method2015(0, var10.field2683, 0, var10.field2748, 0, var111, var112);
                                        }
                                    }
                                    class86.method1892();
                                } else {
                                    if (var10.field2635 == 7) {
                                        class215 var113 = var10.method3022();
                                        if (var113 == null) {
                                            if (class164.field2631) {
                                                method1416(var10);
                                            }
                                            continue;
                                        }
                                        int var114 = 0;
                                        for (int var115 = 0; var115 < var10.field2645; var115++) {
                                            for (int var116 = 0; var116 < var10.field2644; var116++) {
                                                if (var10.field2676[var114] > 0) {
                                                    class47 var117 = class47.method2(var10.field2676[var114] - 1);
                                                    String var118;
                                                    if (var117.field1042 != 1 && var10.field2636[var114] == 1) {
                                                        var118 = class2.method281(16748608) + var117.field1034 + class2.field22;
                                                    } else {
                                                        var118 = class2.method281(16748608) + var117.field1034 + class2.field22 + " " + 'x' + method609(var10.field2636[var114]);
                                                    }
                                                    int var119 = (var10.field2697 + 115) * var116 + var13;
                                                    int var120 = (var10.field2698 + 12) * var115 + var14;
                                                    if (var10.field2694 == 0) {
                                                        var113.method3612(var118, var119, var120, var10.field2658, var10.field2735 ? 0 : -1);
                                                    } else if (var10.field2694 == 1) {
                                                        var113.method3645(var118, var10.field2648 / 2 + var119, var120, var10.field2658, var10.field2735 ? 0 : -1);
                                                    } else {
                                                        var113.method3623(var118, var10.field2648 + var119 - 1, var120, var10.field2658, var10.field2735 ? 0 : -1);
                                                    }
                                                }
                                                var114++;
                                            }
                                        }
                                    }
                                    if (var10.field2635 == 8 && Statics.field2881 == var10 && field402 == field401) {
                                        int var121 = 0;
                                        int var122 = 0;
                                        class215 var123 = Statics.field350;
                                        String var124 = var10.field2691;
                                        String var125 = method33(var124, var10);
                                        while (var125.length() > 0) {
                                            int var126 = var125.indexOf(class2.field21);
                                            String var127;
                                            if (var126 == -1) {
                                                var127 = var125;
                                                var125 = "";
                                            } else {
                                                var127 = var125.substring(0, var126);
                                                var125 = var125.substring(var126 + 4);
                                            }
                                            int var128 = var123.method3607(var127);
                                            if (var128 > var121) {
                                                var121 = var128;
                                            }
                                            var122 += var123.field3087 + 1;
                                        }
                                        var121 += 6;
                                        var122 += 7;
                                        int var129 = var10.field2648 + var13 - 5 - var121;
                                        int var130 = var10.field2754 + var14 + 5;
                                        if (var129 < var13 + 5) {
                                            var129 = var13 + 5;
                                        }
                                        if (var121 + var129 > arg4) {
                                            var129 = arg4 - var121;
                                        }
                                        if (var122 + var130 > arg5) {
                                            var130 = arg5 - var122;
                                        }
                                        class75.method1578(var129, var130, var121, var122, 16777120);
                                        class75.method1582(var129, var130, var121, var122, 0);
                                        String var131 = var10.field2691;
                                        int var132 = var123.field3087 + var130 + 2;
                                        String var133 = method33(var131, var10);
                                        while (var133.length() > 0) {
                                            int var134 = var133.indexOf(class2.field21);
                                            String var135;
                                            if (var134 == -1) {
                                                var135 = var133;
                                                var133 = "";
                                            } else {
                                                var135 = var133.substring(0, var134);
                                                var133 = var133.substring(var134 + 4);
                                            }
                                            var123.method3612(var135, var129 + 3, var132, 0, -1);
                                            var132 += var123.field3087 + 1;
                                        }
                                    }
                                    if (var10.field2635 == 9) {
                                        if (var10.field2731 == 1) {
                                            int var136;
                                            int var137;
                                            int var138;
                                            int var139;
                                            if (var10.field2689) {
                                                var136 = var13;
                                                var137 = var10.field2754 + var14;
                                                var138 = var10.field2648 + var13;
                                                var139 = var14;
                                            } else {
                                                var136 = var13;
                                                var137 = var14;
                                                var138 = var10.field2648 + var13;
                                                var139 = var10.field2754 + var14;
                                            }
                                            class75.method1588(var136, var137, var138, var139, var10.field2658);
                                        } else {
                                            int var140 = var10.field2648 >= 0 ? var10.field2648 : -var10.field2648;
                                            int var141 = var10.field2754 >= 0 ? var10.field2754 : -var10.field2754;
                                            int var142 = var140;
                                            if (var140 < var141) {
                                                var142 = var141;
                                            }
                                            if (var142 != 0) {
                                                int var143 = (var10.field2648 << 16) / var142;
                                                int var144 = (var10.field2754 << 16) / var142;
                                                if (var144 <= var143) {
                                                    var143 = -var143;
                                                } else {
                                                    var144 = -var144;
                                                }
                                                int var145 = var10.field2731 * var144 >> 17;
                                                int var146 = var10.field2731 * var144 + 1 >> 17;
                                                int var147 = var10.field2731 * var143 >> 17;
                                                int var148 = var10.field2731 * var143 + 1 >> 17;
                                                int var149 = var13 + var145;
                                                int var150 = var13 - var146;
                                                int var151 = var10.field2648 + var13 - var146;
                                                int var152 = var10.field2648 + var13 + var145;
                                                int var153 = var14 + var147;
                                                int var154 = var14 - var148;
                                                int var155 = var10.field2754 + var14 - var148;
                                                int var156 = var10.field2754 + var14 + var147;
                                                class86.method1839(var149, var150, var151);
                                                class86.method1849(var153, var154, var155, var149, var150, var151, var10.field2658);
                                                class86.method1839(var149, var151, var152);
                                                class86.method1849(var153, var155, var156, var149, var151, var152, var10.field2658);
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

    @ObfuscatedName("e.cm(Ljava/lang/String;Lfi;I)Ljava/lang/String;")
    public static String method33(String arg0, class164 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method34(method2457(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field308 != null) {
                    var5 = class154.method593(Statics.field308.field2104);
                    if (Statics.field308.field2099 != null) {
                        var5 = (String) Statics.field308.field2099;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ac.cx(II)Ljava/lang/String;")
    public static final String method609(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field23 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method281(65408) + var1.substring(0, var1.length() - 8) + class148.field2302 + " " + class2.field18 + var1 + class2.field26 + class2.field22;
        } else if (var1.length() > 6) {
            return " " + class2.method281(16777215) + var1.substring(0, var1.length() - 4) + class148.field2350 + " " + class2.field18 + var1 + class2.field26 + class2.field22;
        } else {
            return " " + class2.method281(16776960) + var1 + class2.field22;
        }
    }

    @ObfuscatedName("h.ct(Lfi;I)V")
    public static void method151(class164 arg0) {
        class164 var1 = arg0.field2624 == -1 ? null : class164.method733(arg0.field2624);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1015;
            var3 = Statics.field1957;
        } else {
            var2 = var1.field2648;
            var3 = var1.field2754;
        }
        method96(arg0, var2, var3, false);
        method167(arg0, var2, var3);
    }

    @ObfuscatedName("eh.ci([Lfi;Lfi;ZI)V")
    public static void method2622(class164[] arg0, class164 arg1, boolean arg2) {
        int var3 = arg1.field2656 == 0 ? arg1.field2648 : arg1.field2656;
        int var4 = arg1.field2657 == 0 ? arg1.field2754 : arg1.field2657;
        method41(arg0, arg1.field2633, var3, var4, arg2);
        if (arg1.field2755 != null) {
            method41(arg1.field2755, arg1.field2633, var3, var4, arg2);
        }
        class4 var5 = (class4) field411.method3382((long) arg1.field2633);
        if (var5 != null) {
            method1110(var5.field50, var3, var4, arg2);
        }
        if (arg1.field2637 == 1337) {
        }
    }

    @ObfuscatedName("am.cc(IIIZI)V")
    public static final void method1110(int arg0, int arg1, int arg2, boolean arg3) {
        if (class164.method1834(arg0)) {
            method41(Statics.field2709[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("i.cg([Lfi;IIIZB)V")
    public static void method41(class164[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class164 var6 = arg0[var5];
            if (var6 != null && var6.field2624 == arg1) {
                method96(var6, arg2, arg3, arg4);
                method167(var6, arg2, arg3);
                if (var6.field2628 > var6.field2656 - var6.field2648) {
                    var6.field2628 = var6.field2656 - var6.field2648;
                }
                if (var6.field2628 < 0) {
                    var6.field2628 = 0;
                }
                if (var6.field2655 > var6.field2657 - var6.field2754) {
                    var6.field2655 = var6.field2657 - var6.field2754;
                }
                if (var6.field2655 < 0) {
                    var6.field2655 = 0;
                }
                if (var6.field2635 == 0) {
                    method2622(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("f.ca(Lfi;IIZI)V")
    public static void method96(class164 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2648;
        int var5 = arg0.field2754;
        if (arg0.field2640 == 0) {
            arg0.field2648 = arg0.field2644;
        } else if (arg0.field2640 == 1) {
            arg0.field2648 = arg1 - arg0.field2644;
        } else if (arg0.field2640 == 2) {
            arg0.field2648 = arg0.field2644 * arg1 >> 14;
        }
        if (arg0.field2641 == 0) {
            arg0.field2754 = arg0.field2645;
        } else if (arg0.field2641 == 1) {
            arg0.field2754 = arg2 - arg0.field2645;
        } else if (arg0.field2641 == 2) {
            arg0.field2754 = arg0.field2645 * arg2 >> 14;
        }
        if (arg0.field2640 == 4) {
            arg0.field2648 = arg0.field2754 * arg0.field2650 / arg0.field2733;
        }
        if (arg0.field2641 == 4) {
            arg0.field2754 = arg0.field2733 * arg0.field2648 / arg0.field2650;
        }
        if (field529 && arg0.field2635 == 0) {
            if (arg0.field2754 < 5 && arg0.field2648 < 5) {
                arg0.field2754 = 5;
                arg0.field2648 = 5;
            } else {
                if (arg0.field2754 <= 0) {
                    arg0.field2754 = 5;
                }
                if (arg0.field2648 <= 0) {
                    arg0.field2648 = 5;
                }
            }
        }
        if (arg0.field2637 == 1337) {
            field422 = arg0;
        }
        if (arg3 && arg0.field2740 != null && (arg0.field2648 != var4 || arg0.field2754 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field2 = arg0.field2740;
            field451.method3442(var6);
        }
    }

    @ObfuscatedName("u.cn(Lfi;III)V")
    public static void method167(class164 arg0, int arg1, int arg2) {
        if (arg0.field2696 == 0) {
            arg0.field2646 = arg0.field2721;
        } else if (arg0.field2696 == 1) {
            arg0.field2646 = (arg1 - arg0.field2648) / 2 + arg0.field2721;
        } else if (arg0.field2696 == 2) {
            arg0.field2646 = arg1 - arg0.field2648 - arg0.field2721;
        } else if (arg0.field2696 == 3) {
            arg0.field2646 = arg0.field2721 * arg1 >> 14;
        } else if (arg0.field2696 == 4) {
            arg0.field2646 = (arg0.field2721 * arg1 >> 14) + (arg1 - arg0.field2648) / 2;
        } else {
            arg0.field2646 = arg1 - arg0.field2648 - (arg0.field2721 * arg1 >> 14);
        }
        if (arg0.field2639 == 0) {
            arg0.field2647 = arg0.field2643;
        } else if (arg0.field2639 == 1) {
            arg0.field2647 = (arg2 - arg0.field2754) / 2 + arg0.field2643;
        } else if (arg0.field2639 == 2) {
            arg0.field2647 = arg2 - arg0.field2754 - arg0.field2643;
        } else if (arg0.field2639 == 3) {
            arg0.field2647 = arg0.field2643 * arg2 >> 14;
        } else if (arg0.field2639 == 4) {
            arg0.field2647 = (arg0.field2643 * arg2 >> 14) + (arg2 - arg0.field2754) / 2;
        } else {
            arg0.field2647 = arg2 - arg0.field2754 - (arg0.field2643 * arg2 >> 14);
        }
        if (!field529 || arg0.field2635 != 0) {
            return;
        }
        if (arg0.field2646 < 0) {
            arg0.field2646 = 0;
        } else if (arg0.field2648 + arg0.field2646 > arg1) {
            arg0.field2646 = arg1 - arg0.field2648;
        }
        if (arg0.field2647 < 0) {
            arg0.field2647 = 0;
        } else if (arg0.field2754 + arg0.field2647 > arg2) {
            arg0.field2647 = arg2 - arg0.field2754;
        }
    }

    @ObfuscatedName("j.cd(IIIIII)V")
    public static final void method111(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1684[0].method1623(arg0, arg1);
        Statics.field1684[1].method1623(arg0, arg1 + arg3 - 16);
        class75.method1578(arg0, arg1 + 16, 16, arg3 - 32, field325);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class75.method1578(arg0, arg1 + 16 + var6, 16, var5, field326);
        class75.method1589(arg0, arg1 + 16 + var6, var5, field328);
        class75.method1589(arg0 + 1, arg1 + 16 + var6, var5, field328);
        class75.method1584(arg0, arg1 + 16 + var6, 16, field328);
        class75.method1584(arg0, arg1 + 17 + var6, 16, field328);
        class75.method1589(arg0 + 15, arg1 + 16 + var6, var5, field327);
        class75.method1589(arg0 + 14, arg1 + 17 + var6, var5 - 1, field327);
        class75.method1584(arg0, arg1 + 15 + var6 + var5, 16, field327);
        class75.method1584(arg0 + 1, arg1 + 14 + var6 + var5, 15, field327);
    }

    @ObfuscatedName("e.cs(IB)Ljava/lang/String;")
    public static final String method34(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("aj.cy(Lfi;I)Z")
    public static final boolean method817(class164 arg0) {
        if (arg0.field2744 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2744.length; var1++) {
            int var2 = method2457(arg0, var1);
            int var3 = arg0.field2745[var1];
            if (arg0.field2744[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2744[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2744[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("dn.cu(Lfi;II)I")
    public static final int method2457(class164 arg0, int arg1) {
        if (arg0.field2651 == null || arg1 >= arg0.field2651.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2651[arg1];
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
                    var7 = field387[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field307[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field389[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class164 var11 = class164.method733(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class47.method2(var12).field1044 || field250)) {
                        for (int var13 = 0; var13 < var11.field2676.length; var13++) {
                            if (var12 + 1 == var11.field2676[var13]) {
                                var7 += var11.field2636[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class167.field2787[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class146.field2168[field307[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class167.field2787[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1548.field31;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class146.field2169[var14]) {
                            var7 += field307[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class164 var17 = class164.method733(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class47.method2(var18).field1044 || field250)) {
                        for (int var19 = 0; var19 < var17.field2676.length; var19++) {
                            if (var18 + 1 == var17.field2676[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field415;
                }
                if (var6 == 12) {
                    var7 = field343;
                }
                if (var6 == 13) {
                    int var20 = class167.field2787[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class167.method2416(var22);
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
                    var7 = (Statics.field1548.field765 >> 7) + Statics.field550;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1548.field741 >> 7) + Statics.field925;
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

    @ObfuscatedName("ei.co(Lfi;III)V")
    public static final void method2853(class164 arg0, int arg1, int arg2) {
        if (arg0.field2629 == 1) {
            method605(arg0.field2668, "", 24, 0, 0, arg0.field2633);
        }
        if (arg0.field2629 == 2 && !field405) {
            String var3;
            if (class169.method122(method761(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2671 == null || arg0.field2671.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2671;
            }
            if (var3 != null) {
                method605(var3, class2.method281(65280) + arg0.field2747, 25, 0, -1, arg0.field2633);
            }
        }
        if (arg0.field2629 == 3) {
            method605(class148.field2346, "", 26, 0, 0, arg0.field2633);
        }
        if (arg0.field2629 == 4) {
            method605(arg0.field2668, "", 28, 0, 0, arg0.field2633);
        }
        if (arg0.field2629 == 5) {
            method605(arg0.field2668, "", 29, 0, 0, arg0.field2633);
        }
        if (arg0.field2629 == 6 && field414 == null) {
            method605(arg0.field2668, "", 30, 0, -1, arg0.field2633);
        }
        if (arg0.field2635 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2754; var6++) {
                for (int var7 = 0; var7 < arg0.field2648; var7++) {
                    int var8 = (arg0.field2697 + 32) * var7;
                    int var9 = (arg0.field2698 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2699[var5];
                        var9 += arg0.field2700[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field522 = var5;
                        Statics.field360 = arg0;
                        if (arg0.field2676[var5] > 0) {
                            label355: {
                                class47 var10 = class47.method2(arg0.field2676[var5] - 1);
                                if (field273 == 1) {
                                    int var11 = method761(arg0);
                                    boolean var12 = (var11 >> 30 & 0x1) != 0;
                                    if (var12) {
                                        if (Statics.field2548 != arg0.field2633 || Statics.field737 != var5) {
                                            method605(class148.field2337, field425 + " " + class2.field20 + " " + class2.method281(16748608) + var10.field1034, 31, var10.field1029, var5, arg0.field2633);
                                        }
                                        break label355;
                                    }
                                }
                                if (field405) {
                                    int var13 = method761(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if ((Statics.field2791 & 0x10) == 16) {
                                            method605(field408, field409 + " " + class2.field20 + " " + class2.method281(16748608) + var10.field1034, 32, var10.field1029, var5, arg0.field2633);
                                        }
                                        break label355;
                                    }
                                }
                                String[] var15 = var10.field1060;
                                if (field495) {
                                    var15 = method522(var15);
                                }
                                int var16 = method761(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17) {
                                    for (int var18 = 4; var18 >= 3; var18--) {
                                        if (var15 != null && var15[var18] != null) {
                                            byte var19;
                                            if (var18 == 3) {
                                                var19 = 36;
                                            } else {
                                                var19 = 37;
                                            }
                                            method605(var15[var18], class2.method281(16748608) + var10.field1034, var19, var10.field1029, var5, arg0.field2633);
                                        } else if (var18 == 4) {
                                            method605(class148.field2188, class2.method281(16748608) + var10.field1034, 37, var10.field1029, var5, arg0.field2633);
                                        }
                                    }
                                }
                                int var20 = method761(arg0);
                                boolean var21 = (var20 >> 31 & 0x1) != 0;
                                if (var21) {
                                    method605(class148.field2337, class2.method281(16748608) + var10.field1034, 38, var10.field1029, var5, arg0.field2633);
                                }
                                int var22 = method761(arg0);
                                boolean var23 = (var22 >> 30 & 0x1) != 0;
                                if (var23 && var15 != null) {
                                    for (int var24 = 2; var24 >= 0; var24--) {
                                        if (var15[var24] != null) {
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
                                            method605(var15[var24], class2.method281(16748608) + var10.field1034, var25, var10.field1029, var5, arg0.field2633);
                                        }
                                    }
                                }
                                String[] var26 = arg0.field2672;
                                if (field495) {
                                    var26 = method522(var26);
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
                                            method605(var26[var27], class2.method281(16748608) + var10.field1034, var28, var10.field1029, var5, arg0.field2633);
                                        }
                                    }
                                }
                                method605(class148.field2338, class2.method281(16748608) + var10.field1034, 1005, var10.field1029, var5, arg0.field2633);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2710) {
            return;
        }
        if (!field405) {
            for (int var29 = 9; var29 >= 5; var29--) {
                String var30;
                if (!class169.method1441(method761(arg0), var29) && arg0.field2707 == null) {
                    var30 = null;
                } else if (arg0.field2705 == null || arg0.field2705.length <= var29 || arg0.field2705[var29] == null || arg0.field2705[var29].trim().length() == 0) {
                    var30 = null;
                } else {
                    var30 = arg0.field2705[var29];
                }
                if (var30 != null) {
                    method605(var30, arg0.field2704, 1007, var29 + 1, arg0.field2642, arg0.field2633);
                }
            }
            String var32;
            if (class169.method122(method761(arg0)) == 0) {
                var32 = null;
            } else if (arg0.field2671 == null || arg0.field2671.trim().length() == 0) {
                var32 = null;
            } else {
                var32 = arg0.field2671;
            }
            if (var32 != null) {
                method605(var32, arg0.field2704, 25, 0, arg0.field2642, arg0.field2633);
            }
            for (int var34 = 4; var34 >= 0; var34--) {
                String var35;
                if (!class169.method1441(method761(arg0), var34) && arg0.field2707 == null) {
                    var35 = null;
                } else if (arg0.field2705 == null || arg0.field2705.length <= var34 || arg0.field2705[var34] == null || arg0.field2705[var34].trim().length() == 0) {
                    var35 = null;
                } else {
                    var35 = arg0.field2705[var34];
                }
                if (var35 != null) {
                    method605(var35, arg0.field2704, 57, var34 + 1, arg0.field2642, arg0.field2633);
                }
            }
            if (class169.method150(method761(arg0))) {
                method605(class148.field2192, "", 30, 0, arg0.field2642, arg0.field2633);
            }
        } else if (class169.method146(method761(arg0)) && (Statics.field2791 & 0x20) == 32) {
            method605(field408, field409 + " " + class2.field20 + " " + arg0.field2704, 58, 0, arg0.field2642, arg0.field2633);
        }
    }

    @ObfuscatedName("fh.df([Lfi;IIIIIIII)V")
    public static final void method2873(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class164 var9 = arg0[var8];
            if (var9 != null && (!var9.field2710 || var9.field2635 == 0 || var9.field2711 || method761(var9) != 0 || field306 == var9 || var9.field2637 == 1338) && var9.field2624 == arg1 && (!var9.field2710 || !method84(var9))) {
                int var10 = var9.field2646 + arg6;
                int var11 = var9.field2647 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2635 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2635 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2648 + var10;
                    int var19 = var9.field2754 + var11;
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
                    int var22 = var9.field2648 + var10;
                    int var23 = var9.field2754 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field436 == var9) {
                    field431 = true;
                    field432 = var10;
                    field433 = var11;
                }
                if (!var9.field2710 || var12 < var14 && var13 < var15) {
                    int var24 = class132.field2027;
                    int var25 = class132.field2038;
                    if (class132.field2033 != 0) {
                        var24 = class132.field2034;
                        var25 = class132.field2035;
                    }
                    if (var9.field2637 == 1337) {
                        if (!field427 && !field352 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method918(var24, var25, var12, var13);
                        }
                    } else if (var9.field2637 == 1338) {
                        method529(var9, var10, var11);
                    } else {
                        if (!field352 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2853(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2635 == 0) {
                            if (!var9.field2710 && method84(var9) && Statics.field2050 != var9) {
                                continue;
                            }
                            method2873(arg0, var9.field2633, var12, var13, var14, var15, var10 - var9.field2628, var11 - var9.field2655);
                            if (var9.field2755 != null) {
                                method2873(var9.field2755, var9.field2633, var12, var13, var14, var15, var10 - var9.field2628, var11 - var9.field2655);
                            }
                            class4 var26 = (class4) field411.method3382((long) var9.field2633);
                            if (var26 != null) {
                                if (var26.field51 == 0 && class132.field2027 >= var12 && class132.field2038 >= var13 && class132.field2027 < var14 && class132.field2038 < var15 && !field352 && !field529) {
                                    field397[0] = class148.field2331;
                                    field468[0] = "";
                                    field395[0] = 1006;
                                    field392 = 1;
                                }
                                Statics.method1463(var26.field50, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2710) {
                            if (var9.field2718 && class132.field2027 >= var12 && class132.field2038 >= var13 && class132.field2027 < var14 && class132.field2038 < var15) {
                                for (class1 var27 = (class1) field451.method3415(); var27 != null; var27 = (class1) field451.method3419()) {
                                    if (var27.field1) {
                                        var27.method3506();
                                        var27.field3.field2756 = false;
                                    }
                                }
                                if (Statics.field1953 == 0) {
                                    field436 = null;
                                    field306 = null;
                                }
                                if (!field352) {
                                    field397[0] = class148.field2331;
                                    field468[0] = "";
                                    field395[0] = 1006;
                                    field392 = 1;
                                }
                            }
                            boolean var28;
                            if (class132.field2027 >= var12 && class132.field2038 >= var13 && class132.field2027 < var14 && class132.field2038 < var15) {
                                var28 = true;
                            } else {
                                var28 = false;
                            }
                            boolean var29 = false;
                            if ((class132.field2026 == 1 || !Statics.field87 && class132.field2026 == 4) && var28) {
                                var29 = true;
                            }
                            boolean var30 = false;
                            if ((class132.field2033 == 1 || !Statics.field87 && class132.field2033 == 4) && class132.field2034 >= var12 && class132.field2035 >= var13 && class132.field2034 < var14 && class132.field2035 < var15) {
                                var30 = true;
                            }
                            if (var30) {
                                method100(var9, class132.field2034 - var10, class132.field2035 - var11);
                            }
                            if (field436 != null && field436 != var9 && var28 && class169.method653(method761(var9))) {
                                field461 = var9;
                            }
                            if (field306 == var9) {
                                field472 = true;
                                field423 = var10;
                                field430 = var11;
                            }
                            if (var9.field2711) {
                                if (var28 && field487 != 0 && var9.field2732 != null) {
                                    class1 var31 = new class1();
                                    var31.field1 = true;
                                    var31.field3 = var9;
                                    var31.field5 = field487;
                                    var31.field2 = var9.field2732;
                                    field451.method3442(var31);
                                }
                                if (field436 != null || Statics.field1688 != null || field352) {
                                    var30 = false;
                                    var29 = false;
                                    var28 = false;
                                }
                                if (!var9.field2757 && var30) {
                                    var9.field2757 = true;
                                    if (var9.field2739 != null) {
                                        class1 var32 = new class1();
                                        var32.field1 = true;
                                        var32.field3 = var9;
                                        var32.field4 = class132.field2034 - var10;
                                        var32.field5 = class132.field2035 - var11;
                                        var32.field2 = var9.field2739;
                                        field451.method3442(var32);
                                    }
                                }
                                if (var9.field2757 && var29 && var9.field2714 != null) {
                                    class1 var33 = new class1();
                                    var33.field1 = true;
                                    var33.field3 = var9;
                                    var33.field4 = class132.field2027 - var10;
                                    var33.field5 = class132.field2038 - var11;
                                    var33.field2 = var9.field2714;
                                    field451.method3442(var33);
                                }
                                if (var9.field2757 && !var29) {
                                    var9.field2757 = false;
                                    if (var9.field2715 != null) {
                                        class1 var34 = new class1();
                                        var34.field1 = true;
                                        var34.field3 = var9;
                                        var34.field4 = class132.field2027 - var10;
                                        var34.field5 = class132.field2038 - var11;
                                        var34.field2 = var9.field2715;
                                        field480.method3442(var34);
                                    }
                                }
                                if (var29 && var9.field2760 != null) {
                                    class1 var35 = new class1();
                                    var35.field1 = true;
                                    var35.field3 = var9;
                                    var35.field4 = class132.field2027 - var10;
                                    var35.field5 = class132.field2038 - var11;
                                    var35.field2 = var9.field2760;
                                    field451.method3442(var35);
                                }
                                if (!var9.field2756 && var28) {
                                    var9.field2756 = true;
                                    if (var9.field2674 != null) {
                                        class1 var36 = new class1();
                                        var36.field1 = true;
                                        var36.field3 = var9;
                                        var36.field4 = class132.field2027 - var10;
                                        var36.field5 = class132.field2038 - var11;
                                        var36.field2 = var9.field2674;
                                        field451.method3442(var36);
                                    }
                                }
                                if (var9.field2756 && var28 && var9.field2749 != null) {
                                    class1 var37 = new class1();
                                    var37.field1 = true;
                                    var37.field3 = var9;
                                    var37.field4 = class132.field2027 - var10;
                                    var37.field5 = class132.field2038 - var11;
                                    var37.field2 = var9.field2749;
                                    field451.method3442(var37);
                                }
                                if (var9.field2756 && !var28) {
                                    var9.field2756 = false;
                                    if (var9.field2719 != null) {
                                        class1 var38 = new class1();
                                        var38.field1 = true;
                                        var38.field3 = var9;
                                        var38.field4 = class132.field2027 - var10;
                                        var38.field5 = class132.field2038 - var11;
                                        var38.field2 = var9.field2719;
                                        field480.method3442(var38);
                                    }
                                }
                                if (var9.field2730 != null) {
                                    class1 var39 = new class1();
                                    var39.field3 = var9;
                                    var39.field2 = var9.field2730;
                                    field452.method3442(var39);
                                }
                                if (var9.field2724 != null && field521 > var9.field2759) {
                                    if (var9.field2634 == null || field521 - var9.field2759 > 32) {
                                        class1 var44 = new class1();
                                        var44.field3 = var9;
                                        var44.field2 = var9.field2724;
                                        field451.method3442(var44);
                                    } else {
                                        label482: for (int var40 = var9.field2759; var40 < field521; var40++) {
                                            int var41 = field323[var40 & 0x1F];
                                            for (int var42 = 0; var42 < var9.field2634.length; var42++) {
                                                if (var9.field2634[var42] == var41) {
                                                    class1 var43 = new class1();
                                                    var43.field3 = var9;
                                                    var43.field2 = var9.field2724;
                                                    field451.method3442(var43);
                                                    break label482;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2759 = field521;
                                }
                                if (var9.field2726 != null && field439 > var9.field2708) {
                                    if (var9.field2743 == null || field439 - var9.field2708 > 32) {
                                        class1 var49 = new class1();
                                        var49.field3 = var9;
                                        var49.field2 = var9.field2726;
                                        field451.method3442(var49);
                                    } else {
                                        label458: for (int var45 = var9.field2708; var45 < field439; var45++) {
                                            int var46 = field438[var45 & 0x1F];
                                            for (int var47 = 0; var47 < var9.field2743.length; var47++) {
                                                if (var9.field2743[var47] == var46) {
                                                    class1 var48 = new class1();
                                                    var48.field3 = var9;
                                                    var48.field2 = var9.field2726;
                                                    field451.method3442(var48);
                                                    break label458;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2708 = field439;
                                }
                                if (var9.field2728 != null && field441 > var9.field2761) {
                                    if (var9.field2729 == null || field441 - var9.field2761 > 32) {
                                        class1 var54 = new class1();
                                        var54.field3 = var9;
                                        var54.field2 = var9.field2728;
                                        field451.method3442(var54);
                                    } else {
                                        label434: for (int var50 = var9.field2761; var50 < field441; var50++) {
                                            int var51 = field440[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field2729.length; var52++) {
                                                if (var9.field2729[var52] == var51) {
                                                    class1 var53 = new class1();
                                                    var53.field3 = var9;
                                                    var53.field2 = var9.field2728;
                                                    field451.method3442(var53);
                                                    break label434;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2761 = field441;
                                }
                                if (field442 > var9.field2758 && var9.field2652 != null) {
                                    class1 var55 = new class1();
                                    var55.field3 = var9;
                                    var55.field2 = var9.field2652;
                                    field451.method3442(var55);
                                }
                                if (field443 > var9.field2758 && var9.field2678 != null) {
                                    class1 var56 = new class1();
                                    var56.field3 = var9;
                                    var56.field2 = var9.field2678;
                                    field451.method3442(var56);
                                }
                                if (field444 > var9.field2758 && var9.field2736 != null) {
                                    class1 var57 = new class1();
                                    var57.field3 = var9;
                                    var57.field2 = var9.field2736;
                                    field451.method3442(var57);
                                }
                                if (field404 > var9.field2758 && var9.field2741 != null) {
                                    class1 var58 = new class1();
                                    var58.field3 = var9;
                                    var58.field2 = var9.field2741;
                                    field451.method3442(var58);
                                }
                                if (field330 > var9.field2758 && var9.field2742 != null) {
                                    class1 var59 = new class1();
                                    var59.field3 = var9;
                                    var59.field2 = var9.field2742;
                                    field451.method3442(var59);
                                }
                                if (field447 > var9.field2758 && var9.field2654 != null) {
                                    class1 var60 = new class1();
                                    var60.field3 = var9;
                                    var60.field2 = var9.field2654;
                                    field451.method3442(var60);
                                }
                                var9.field2758 = field435;
                                if (var9.field2734 != null) {
                                    for (int var61 = 0; var61 < field475; var61++) {
                                        class1 var62 = new class1();
                                        var62.field3 = var9;
                                        var62.field8 = field477[var61];
                                        var62.field11 = field476[var61];
                                        var62.field2 = var9.field2734;
                                        field451.method3442(var62);
                                    }
                                }
                            }
                        }
                        if (!var9.field2710 && field436 == null && Statics.field1688 == null && !field352) {
                            if ((var9.field2717 >= 0 || var9.field2660 != 0) && class132.field2027 >= var12 && class132.field2038 >= var13 && class132.field2027 < var14 && class132.field2038 < var15) {
                                if (var9.field2717 >= 0) {
                                    Statics.field2050 = arg0[var9.field2717];
                                } else {
                                    Statics.field2050 = var9;
                                }
                            }
                            if (var9.field2635 == 8 && class132.field2027 >= var12 && class132.field2038 >= var13 && class132.field2027 < var14 && class132.field2038 < var15) {
                                Statics.field2881 = var9;
                            }
                            if (var9.field2657 > var9.field2754) {
                                Statics.method2787(var9, var9.field2648 + var10, var11, var9.field2754, var9.field2657, class132.field2027, class132.field2038);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.dj([Lfi;IS)V")
    public static final void method153(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2635 == 0) {
                    if (var3.field2755 != null) {
                        method153(var3.field2755, arg1);
                    }
                    class4 var4 = (class4) field411.method3382((long) var3.field2633);
                    if (var4 != null) {
                        int var5 = var4.field50;
                        if (class164.method1834(var5)) {
                            method153(Statics.field2709[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2738 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field2 = var3.field2738;
                    class34.method554(var6, 200000);
                }
                if (arg1 == 1 && var3.field2716 != null) {
                    if (var3.field2642 >= 0) {
                        class164 var7 = class164.method733(var3.field2633);
                        if (var7 == null || var7.field2755 == null || var3.field2642 >= var7.field2755.length || var7.field2755[var3.field2642] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field2 = var3.field2716;
                    class34.method554(var8, 200000);
                }
            }
        }
    }

    @ObfuscatedName("d.dv(Lfi;III)V")
    public static final void method100(class164 arg0, int arg1, int arg2) {
        if (field436 != null || field352 || arg0 == null) {
            return;
        }
        class164 var3 = method178(arg0);
        if (var3 == null) {
            var3 = arg0.field2706;
        }
        if (var3 == null) {
            return;
        }
        field436 = arg0;
        class164 var5 = method178(arg0);
        if (var5 == null) {
            var5 = arg0.field2706;
        }
        field306 = var5;
        field346 = arg1;
        field300 = arg2;
        Statics.field1953 = 0;
        field434 = false;
        if (field392 > 0) {
            method623(field392 - 1);
        }
        return;
    }

    @ObfuscatedName("s.dk(I)V")
    public static final void method604() {
        method1416(field436);
        Statics.field1953++;
        if (field431 && field472) {
            int var0 = class132.field2027;
            int var1 = class132.field2038;
            int var2 = var0 - field346;
            int var3 = var1 - field300;
            if (var2 < field423) {
                var2 = field423;
            }
            if (field436.field2648 + var2 > field423 + field306.field2648) {
                var2 = field423 + field306.field2648 - field436.field2648;
            }
            if (var3 < field430) {
                var3 = field430;
            }
            if (field436.field2754 + var3 > field430 + field306.field2754) {
                var3 = field430 + field306.field2754 - field436.field2754;
            }
            int var4 = var2 - field432;
            int var5 = var3 - field433;
            int var6 = field436.field2684;
            if (Statics.field1953 > field436.field2746 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field434 = true;
            }
            int var7 = field306.field2628 + (var2 - field423);
            int var8 = field306.field2655 + (var3 - field430);
            if (field436.field2720 != null && field434) {
                class1 var9 = new class1();
                var9.field3 = field436;
                var9.field4 = var7;
                var9.field5 = var8;
                var9.field2 = field436.field2720;
                class34.method554(var9, 200000);
            }
            if (class132.field2026 == 0) {
                if (field434) {
                    if (field436.field2727 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field436;
                        var10.field4 = var7;
                        var10.field5 = var8;
                        var10.field7 = field461;
                        var10.field2 = field436.field2727;
                        class34.method554(var10, 200000);
                    }
                    if (field461 != null && method178(field436) != null) {
                        field288.method2444(36);
                        field288.method2205(field436.field2642);
                        field288.method2203(field461.field2751);
                        field288.method2203(field461.field2642);
                        field288.method2203(field436.field2751);
                        field288.method2215(field436.field2633);
                        field288.method2215(field461.field2633);
                    }
                } else if ((field390 == 1 || method659(field392 - 1)) && field392 > 2) {
                    method3048(field432 + field346, field433 + field300);
                } else if (field392 > 0) {
                    method1833(field432 + field346, field433 + field300);
                }
                field436 = null;
            }
        } else if (Statics.field1953 > 1) {
            field436 = null;
        }
    }

    @ObfuscatedName("ah.db(II)V")
    public static void method623(int arg0) {
        Statics.field52 = new class29();
        Statics.field52.field662 = field254[arg0];
        Statics.field52.field654 = field277[arg0];
        Statics.field52.field655 = field395[arg0];
        Statics.field52.field657 = field396[arg0];
        Statics.field52.field656 = field397[arg0];
    }

    @ObfuscatedName("cj.dl(III)V")
    public static void method1833(int arg0, int arg1) {
        class29 var2 = Statics.field52;
        method613(var2.field662, var2.field654, var2.field655, var2.field657, var2.field656, var2.field656, arg0, arg1);
        Statics.field52 = null;
    }

    @ObfuscatedName("bo.dc(Lfi;B)V")
    public static void method1416(class164 arg0) {
        if (field456 == arg0.field2763) {
            field457[arg0.field2762] = true;
        }
    }

    @ObfuscatedName("au.da(I)V")
    public static void method618() {
        for (class4 var0 = (class4) field411.method3384(); var0 != null; var0 = (class4) field411.method3377()) {
            int var1 = var0.field50;
            if (class164.method1834(var1)) {
                boolean var2 = true;
                class164[] var3 = Statics.field2709[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2710;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3015;
                    class164 var6 = class164.method733(var5);
                    if (var6 != null) {
                        method1416(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.du([Ljava/lang/String;S)[Ljava/lang/String;")
    public static final String[] method522(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("es.do(II)V")
    public static final void method2791(int arg0) {
        if (!class164.method1834(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2709[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3 != null) {
                var3.field2753 = 0;
                var3.field2712 = 0;
            }
        }
    }

    @ObfuscatedName("k.dn(IB)V")
    public static final void method179(int arg0) {
        if (class164.method1834(arg0)) {
            method30(Statics.field2709[arg0], -1);
        }
    }

    @ObfuscatedName("e.dy([Lfi;II)V")
    public static final void method30(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null && var3.field2624 == arg1 && (!var3.field2710 || !method84(var3))) {
                if (var3.field2635 == 0) {
                    if (!var3.field2710 && method84(var3) && Statics.field2050 != var3) {
                        continue;
                    }
                    method30(arg0, var3.field2633);
                    if (var3.field2755 != null) {
                        method30(var3.field2755, var3.field2633);
                    }
                    class4 var4 = (class4) field411.method3382((long) var3.field2633);
                    if (var4 != null) {
                        method179(var4.field50);
                    }
                }
                if (var3.field2635 == 6) {
                    if (var3.field2622 != -1 || var3.field2679 != -1) {
                        boolean var5 = method817(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2679;
                        } else {
                            var6 = var3.field2622;
                        }
                        if (var6 != -1) {
                            class40 var7 = class40.method168(var6);
                            var3.field2712 += field312;
                            while (var3.field2712 > var7.field920[var3.field2753]) {
                                var3.field2712 -= var7.field920[var3.field2753];
                                var3.field2753++;
                                if (var3.field2753 >= var7.field918.length) {
                                    var3.field2753 -= var7.field916;
                                    if (var3.field2753 < 0 || var3.field2753 >= var7.field918.length) {
                                        var3.field2753 = 0;
                                    }
                                }
                                method1416(var3);
                            }
                        }
                    }
                    if (var3.field2687 != 0 && !var3.field2710) {
                        int var8 = var3.field2687 >> 16;
                        int var9 = var3.field2687 << 16 >> 16;
                        int var10 = field312 * var8;
                        int var11 = field312 * var9;
                        var3.field2748 = var3.field2748 + var10 & 0x7FF;
                        var3.field2683 = var3.field2683 + var11 & 0x7FF;
                        method1416(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fc.di(IS)V")
    public static final void method3002(int arg0) {
        method618();
        for (class22 var1 = (class22) class22.field560.method3415(); var1 != null; var1 = (class22) class22.field560.method3419()) {
            if (var1.field565 != null) {
                var1.method547();
            }
        }
        int var2 = class48.method683(arg0).field1077;
        if (var2 == 0) {
            return;
        }
        int var3 = class167.field2787[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class86.method1843(0.9D);
                ((class90) Statics.field1485).method1909(0.9D);
            }
            if (var3 == 2) {
                class86.method1843(0.8D);
                ((class90) Statics.field1485).method1909(0.8D);
            }
            if (var3 == 3) {
                class86.method1843(0.7D);
                ((class90) Statics.field1485).method1909(0.7D);
            }
            if (var3 == 4) {
                class86.method1843(0.6D);
                ((class90) Statics.field1485).method1909(0.6D);
            }
            class47.field1031.method3342();
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
            if (field489 != var4) {
                if (field489 == 0 && field244 != -1) {
                    class174.method2991(Statics.field535, field244, 0, var4, false);
                    field345 = false;
                } else if (var4 == 0) {
                    Statics.field2525.method3217();
                    class174.field2850 = 1;
                    Statics.field2852 = null;
                    field345 = false;
                } else {
                    class174.method608(var4);
                }
                field489 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field492 = 127;
            }
            if (var3 == 1) {
                field492 = 96;
            }
            if (var3 == 2) {
                field492 = 64;
            }
            if (var3 == 3) {
                field492 = 32;
            }
            if (var3 == 4) {
                field492 = 0;
            }
        }
        if (var2 == 5) {
            field390 = var3;
        }
        if (var2 == 6) {
            field341 = var3;
        }
        if (var2 == 9) {
            field413 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field290 = 127;
            }
            if (var3 == 1) {
                field290 = 96;
            }
            if (var3 == 2) {
                field290 = 64;
            }
            if (var3 == 3) {
                field290 = 32;
            }
            if (var3 == 4) {
                field290 = 0;
            }
        }
        if (var2 == 17) {
            field394 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class19[] var5 = new class19[] { class19.field531, class19.field532, class19.field534 };
            field278 = (class19) class101.method553(var5, var3);
            if (field278 == null) {
                field278 = class19.field531;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field382 = -1;
        } else {
            field382 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("g.de(IIII)Le;")
    public static final class4 method544(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field50 = arg1;
        var3.field51 = arg2;
        field411.method3391(var3, (long) arg0);
        method2791(arg1);
        class164 var4 = class164.method733(arg0);
        method1416(var4);
        if (field414 != null) {
            method1416(field414);
            field414 = null;
        }
        method2011();
        method2622(Statics.field2709[arg0 >> 16], var4, false);
        class34.method19(arg1);
        if (field410 != -1) {
            int var5 = field410;
            if (class164.method1834(var5)) {
                method153(Statics.field2709[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("dt.dq(Le;ZI)V")
    public static final void method2596(class4 arg0, boolean arg1) {
        int var2 = arg0.field50;
        int var3 = (int) arg0.field3015;
        arg0.method3506();
        if (arg1) {
            class164.method2852(var2);
        }
        for (class192 var4 = (class192) field454.method3384(); var4 != null; var4 = (class192) field454.method3377()) {
            if ((long) var2 == (var4.field3015 >> 48 & 0xFFFFL)) {
                var4.method3506();
            }
        }
        class164 var5 = class164.method733(var3);
        if (var5 != null) {
            method1416(var5);
        }
        method2011();
        if (field410 != -1) {
            int var6 = field410;
            if (class164.method1834(var6)) {
                method153(Statics.field2709[var6], 1);
            }
        }
    }

    @ObfuscatedName("dw.ds(Lfi;B)Z")
    public static final boolean method2613(class164 arg0) {
        int var1 = arg0.field2637;
        if (var1 == 205) {
            field298 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field526.method3112(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field526.method3088(var4, var5 == 1);
        }
        if (var1 == 324) {
            field526.method3085(false);
        }
        if (var1 == 325) {
            field526.method3085(true);
        }
        if (var1 == 326) {
            field288.method2444(221);
            field526.method3090(field288);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("o.dm(Lfi;IIIB)V")
    public static final void method85(class164 arg0, int arg1, int arg2, int arg3) {
        class166 var4 = arg0.method3012(false);
        if (var4 == null) {
            return;
        }
        if (field386 < 3) {
            Statics.field1845.method1542(arg1, arg2, var4.field2784, var4.field2780, 25, 25, field332, 256, var4.field2779, var4.field2783);
        } else {
            class75.method1574(arg1, arg2, 0, var4.field2779, var4.field2783);
        }
    }

    @ObfuscatedName("am.dx(IIIILbb;Lfg;I)V")
    public static final void method1111(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2795(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field332 + field318 & 0x7FF;
        int var8 = class86.field1504[var7];
        int var9 = class86.field1491[var7];
        int var10 = var8 * 256 / (field320 + 256);
        int var11 = var9 * 256 / (field320 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field126.method1498(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("ev.dr(IIIILbb;Lfg;B)V")
    public static final void method2795(int arg0, int arg1, int arg2, int arg3, class74 arg4, class166 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field332 + field318 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class86.field1504[var6];
        int var9 = class86.field1491[var6];
        int var10 = var8 * 256 / (field320 + 256);
        int var11 = var9 * 256 / (field320 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1513(arg5.field2784 / 2 + var12 - arg4.field1319 / 2, arg5.field2780 / 2 - var13 - arg4.field1323 / 2, arg0, arg1, arg5.field2784, arg5.field2780, arg5.field2779, arg5.field2783);
        } else {
            arg4.method1528(arg5.field2784 / 2 + arg0 + var12 - arg4.field1319 / 2, arg5.field2780 / 2 + arg1 - var13 - arg4.field1323 / 2);
        }
    }

    @ObfuscatedName("cx.dz(Ljava/lang/String;ZI)Z")
    public static boolean method1922(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class155.method2793(arg0, Statics.field1831);
        for (int var3 = 0; var3 < field255; var3++) {
            if (var2.equalsIgnoreCase(class155.method2793(field355[var3].field227, Statics.field1831)) && (!arg1 || field355[var3].field219 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class155.method2793(Statics.field1548.field42, Statics.field1831))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("c.dg(Ljava/lang/String;I)Z")
    public static boolean method156(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class155.method2793(arg0, Statics.field1831);
        for (int var2 = 0; var2 < field524; var2++) {
            class8 var3 = field525[var2];
            if (var1.equalsIgnoreCase(class155.method2793(var3.field122, Statics.field1831))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class155.method2793(var3.field116, Statics.field1831))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("fy.dh(Ljava/lang/String;I)V")
    public static final void method3209(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field255 < 200 || field375 == 1) || field255 >= 400) {
            class11.method1835(30, "", class148.field2353);
            return;
        }
        String var1 = class155.method2793(arg0, Statics.field1831);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field255; var2++) {
            class17 var3 = field355[var2];
            String var4 = class155.method2793(var3.field227, Statics.field1831);
            if (var4 != null && var4.equals(var1)) {
                class11.method1835(30, "", arg0 + class148.field2390);
                return;
            }
            if (var3.field220 != null) {
                String var5 = class155.method2793(var3.field220, Statics.field1831);
                if (var5 != null && var5.equals(var1)) {
                    class11.method1835(30, "", arg0 + class148.field2390);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field524; var6++) {
            class8 var7 = field525[var6];
            String var8 = class155.method2793(var7.field122, Statics.field1831);
            if (var8 != null && var8.equals(var1)) {
                class11.method1835(30, "", class148.field2412 + arg0 + class148.field2360);
                return;
            }
            if (var7.field116 != null) {
                String var9 = class155.method2793(var7.field116, Statics.field1831);
                if (var9 != null && var9.equals(var1)) {
                    class11.method1835(30, "", class148.field2412 + arg0 + class148.field2360);
                    return;
                }
            }
        }
        if (class155.method2793(Statics.field1548.field42, Statics.field1831).equals(var1)) {
            class11.method1835(30, "", class148.field2357);
        } else {
            field288.method2444(84);
            field288.method2158(class111.method1926(arg0));
            field288.method2163(arg0);
        }
    }

    @ObfuscatedName("p.dp(Ljava/lang/String;ZI)V")
    public static final void method17(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field524 < 100 || field375 == 1) || field524 >= 400) {
            class11.method1835(31, "", class148.field2355);
            return;
        }
        String var2 = class155.method2793(arg0, Statics.field1831);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field524; var3++) {
            class8 var4 = field525[var3];
            String var5 = class155.method2793(var4.field122, Statics.field1831);
            if (var5 != null && var5.equals(var2)) {
                class11.method1835(31, "", arg0 + class148.field2356);
                return;
            }
            if (var4.field116 != null) {
                String var6 = class155.method2793(var4.field116, Statics.field1831);
                if (var6 != null && var6.equals(var2)) {
                    class11.method1835(31, "", arg0 + class148.field2356);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field255; var7++) {
            class17 var8 = field355[var7];
            String var9 = class155.method2793(var8.field227, Statics.field1831);
            if (var9 != null && var9.equals(var2)) {
                class11.method1835(31, "", class148.field2361 + arg0 + class148.field2315);
                return;
            }
            if (var8.field220 != null) {
                String var10 = class155.method2793(var8.field220, Statics.field1831);
                if (var10 != null && var10.equals(var2)) {
                    class11.method1835(31, "", class148.field2361 + arg0 + class148.field2315);
                    return;
                }
            }
        }
        if (class155.method2793(Statics.field1548.field42, Statics.field1831).equals(var2)) {
            class11.method1835(31, "", class148.field2296);
        } else {
            field288.method2444(237);
            field288.method2158(class111.method1926(arg0));
            field288.method2163(arg0);
        }
    }

    @ObfuscatedName("fh.dt(Ljava/lang/String;I)V")
    public static final void method2877(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class155.method2793(arg0, Statics.field1831);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field255; var2++) {
            class17 var3 = field355[var2];
            String var4 = var3.field227;
            String var5 = class155.method2793(var4, Statics.field1831);
            if (class121.method35(arg0, var1, var4, var5)) {
                field255--;
                for (int var6 = var2; var6 < field255; var6++) {
                    field355[var6] = field355[var6 + 1];
                }
                field443 = field435;
                field288.method2444(129);
                field288.method2158(class111.method1926(arg0));
                field288.method2163(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("fx.dw(Ljava/lang/String;II)V")
    public static final void method3093(String arg0, int arg1) {
        field288.method2444(74);
        field288.method2158(class111.method1926(arg0) + 1);
        field288.method2163(arg0);
        field288.method2197(arg1);
    }

    @ObfuscatedName("hy.eh(Ljava/lang/String;I)V")
    public static final void method3707(String arg0) {
        if (Statics.field1542 != null) {
            field288.method2444(75);
            field288.method2158(class111.method1926(arg0));
            field288.method2163(arg0);
        }
    }

    @ObfuscatedName("ab.em(Lfi;I)I")
    public static int method761(class164 arg0) {
        class192 var1 = (class192) field454.method3382(((long) arg0.field2633 << 32) + (long) arg0.field2642);
        return var1 == null ? arg0.field2703 : var1.field3001;
    }

    @ObfuscatedName("k.et(Lfi;I)Lfi;")
    public static class164 method178(class164 arg0) {
        int var1 = class169.method2012(method761(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class164.method733(arg0.field2624);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("o.ea(Lfi;I)Z")
    public static boolean method84(class164 arg0) {
        if (field529) {
            if (method761(arg0) != 0) {
                return false;
            }
            if (arg0.field2635 == 0) {
                return false;
            }
        }
        return arg0.field2653;
    }

    @ObfuscatedName("j.er(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method112(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field249 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field249 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field249 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field249 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field249 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field146 != null) {
            var3 = "/p=" + Statics.field146;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field252 + "/a=" + Statics.field446 + var3 + "/";
    }

    @ObfuscatedName("c.ez(Ljava/lang/String;I)V")
    public static void method164(String arg0) {
        Statics.field146 = arg0;
        try {
            String var1 = Statics.field245.getParameter(class181.field2962.field2958);
            String var2 = Statics.field245.getParameter(class181.field2963.field2958);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class107.method591() + 94608000000L;
                class103.field1827.setTime(new Date(var6));
                int var8 = class103.field1827.get(7);
                int var9 = class103.field1827.get(5);
                int var10 = class103.field1827.get(2);
                int var11 = class103.field1827.get(1);
                int var12 = class103.field1827.get(11);
                int var13 = class103.field1827.get(12);
                int var14 = class103.field1827.get(13);
                String var15 = class103.field1828[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class103.field1830[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class124.method2512(Statics.field245, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("ax.eq(Ljava/lang/String;ZI)V")
    public static void method906(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2586; var5++) {
            class47 var6 = class47.method2(var5);
            if ((!arg1 || var6.field1069) && var6.field1062 == -1 && var6.field1034.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1108 = -1;
                    Statics.field1288 = null;
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
        Statics.field1288 = var3;
        Statics.field2124 = 0;
        Statics.field1108 = var4;
        String[] var9 = new String[Statics.field1108];
        for (int var10 = 0; var10 < Statics.field1108; var10++) {
            var9[var10] = class47.method2(var3[var10]).field1034;
        }
        short[] var11 = Statics.field1288;
        class116.method95(var9, var11, 0, var9.length - 1);
    }
}

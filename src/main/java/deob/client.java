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
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class136 {

    @ObfuscatedName("client.h")
    public static boolean field265 = true;

    @ObfuscatedName("client.e")
    public static int field493 = 1;

    @ObfuscatedName("client.n")
    public static int field267 = 0;

    @ObfuscatedName("client.l")
    public static int field382 = 0;

    @ObfuscatedName("client.k")
    public static boolean field270 = false;

    @ObfuscatedName("client.p")
    public static boolean field271 = false;

    @ObfuscatedName("client.u")
    public static int field272 = 0;

    @ObfuscatedName("client.j")
    public static int field461 = 0;

    @ObfuscatedName("client.f")
    public static boolean field274 = true;

    @ObfuscatedName("client.w")
    public static class219[] field325 = new class219[4];

    @ObfuscatedName("client.z")
    public static int field275 = 0;

    @ObfuscatedName("client.v")
    public static long field276 = 1L;

    @ObfuscatedName("client.c")
    public static int field403 = -1;

    @ObfuscatedName("client.r")
    public static int field278 = -1;

    @ObfuscatedName("client.an")
    public static int field279 = -1;

    @ObfuscatedName("client.ad")
    public static boolean field266 = true;

    @ObfuscatedName("client.ai")
    public static boolean field281 = false;

    @ObfuscatedName("client.ae")
    public static int field488 = 0;

    @ObfuscatedName("client.aq")
    public static int field283 = 0;

    @ObfuscatedName("client.av")
    public static int field305 = 0;

    @ObfuscatedName("client.am")
    public static int field285 = 0;

    @ObfuscatedName("client.ac")
    public static int field286 = 0;

    @ObfuscatedName("client.ak")
    public static int field287 = 0;

    @ObfuscatedName("client.aa")
    public static int field288 = 0;

    @ObfuscatedName("client.al")
    public static int field289 = 0;

    @ObfuscatedName("client.ao")
    public static int field448 = 0;

    @ObfuscatedName("client.af")
    public static class111 field291 = new class111(new byte[5000]);

    @ObfuscatedName("client.ay")
    public static class19 field280 = class19.field541;

    @ObfuscatedName("client.au")
    public static int field530 = 0;

    @ObfuscatedName("client.ar")
    public static int field361 = 0;

    @ObfuscatedName("client.at")
    public static int field295 = 0;

    @ObfuscatedName("client.bw")
    public static int field308 = 0;

    @ObfuscatedName("client.bl")
    public static int field299 = 0;

    @ObfuscatedName("client.bg")
    public static int field512 = 0;

    @ObfuscatedName("client.bj")
    public static int field321 = 0;

    @ObfuscatedName("client.bd")
    public static int field302 = 0;

    @ObfuscatedName("client.ck")
    public static class32[] field304 = new class32[32768];

    @ObfuscatedName("client.cq")
    public static int field378 = 0;

    @ObfuscatedName("client.ct")
    public static int[] field306 = new int[32768];

    @ObfuscatedName("client.co")
    public static class114 field521 = new class114(5000);

    @ObfuscatedName("client.cy")
    public static class114 field449 = new class114(5000);

    @ObfuscatedName("client.cv")
    public static class114 field309 = new class114(5000);

    @ObfuscatedName("client.cg")
    public static int field310 = 0;

    @ObfuscatedName("client.cu")
    public static int field311 = 0;

    @ObfuscatedName("client.cm")
    public static int field312 = 0;

    @ObfuscatedName("client.cn")
    public static int field313 = 0;

    @ObfuscatedName("client.ci")
    public static int field520 = 0;

    @ObfuscatedName("client.cz")
    public static int field315 = 0;

    @ObfuscatedName("client.ca")
    public static int field375 = 0;

    @ObfuscatedName("client.cl")
    public static int field317 = 0;

    @ObfuscatedName("client.cr")
    public static boolean field318 = false;

    @ObfuscatedName("client.ce")
    public static int field425 = 0;

    @ObfuscatedName("client.dq")
    public static int field467 = 0;

    @ObfuscatedName("client.dl")
    public static int field400 = 1;

    @ObfuscatedName("client.de")
    public static int field322 = 0;

    @ObfuscatedName("client.dr")
    public static int field323 = 1;

    @ObfuscatedName("client.dx")
    public static int field324 = 0;

    @ObfuscatedName("client.dt")
    public static boolean field326 = false;

    @ObfuscatedName("client.dv")
    public static int[][][] field327 = new int[4][13][13];

    @ObfuscatedName("client.dk")
    public static final int[] field328 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.du")
    public static int field515 = 0;

    @ObfuscatedName("client.dp")
    public static int field495 = 2;

    @ObfuscatedName("client.dd")
    public static int field331 = 0;

    @ObfuscatedName("client.dw")
    public static int field343 = 2;

    @ObfuscatedName("client.df")
    public static int field333 = 0;

    @ObfuscatedName("client.di")
    public static int field334 = 1;

    @ObfuscatedName("client.dh")
    public static int field444 = 0;

    @ObfuscatedName("client.eb")
    public static int field336 = 0;

    @ObfuscatedName("client.ea")
    public static int field457 = 2;

    @ObfuscatedName("client.ei")
    public static int field402 = 0;

    @ObfuscatedName("client.ed")
    public static int field339 = 1;

    @ObfuscatedName("client.en")
    public static int field340 = 0;

    @ObfuscatedName("client.ep")
    public static int field341 = 0;

    @ObfuscatedName("client.ef")
    public static int field342 = 2301979;

    @ObfuscatedName("client.eg")
    public static int field392 = 5063219;

    @ObfuscatedName("client.fx")
    public static int field344 = 3353893;

    @ObfuscatedName("client.ff")
    public static int field345 = 7759444;

    @ObfuscatedName("client.fg")
    public static boolean field346 = false;

    @ObfuscatedName("client.fj")
    public static int field347 = 0;

    @ObfuscatedName("client.fy")
    public static int field501 = 128;

    @ObfuscatedName("client.fi")
    public static int field350 = 0;

    @ObfuscatedName("client.ft")
    public static int field458 = 0;

    @ObfuscatedName("client.fd")
    public static int field442 = 0;

    @ObfuscatedName("client.fm")
    public static int field353 = 0;

    @ObfuscatedName("client.fz")
    public static int field354 = 0;

    @ObfuscatedName("client.fb")
    public static int field355 = 0;

    @ObfuscatedName("client.fc")
    public static boolean field292 = false;

    @ObfuscatedName("client.fp")
    public static int field357 = 0;

    @ObfuscatedName("client.fr")
    public static int field358 = 0;

    @ObfuscatedName("client.fq")
    public static int field359 = 50;

    @ObfuscatedName("client.fa")
    public static int[] field360 = new int[field359];

    @ObfuscatedName("client.fh")
    public static int[] field408 = new int[field359];

    @ObfuscatedName("client.fv")
    public static int[] field362 = new int[field359];

    @ObfuscatedName("client.fe")
    public static int[] field363 = new int[field359];

    @ObfuscatedName("client.gl")
    public static int[] field364 = new int[field359];

    @ObfuscatedName("client.go")
    public static int[] field441 = new int[field359];

    @ObfuscatedName("client.ga")
    public static int[] field366 = new int[field359];

    @ObfuscatedName("client.gj")
    public static String[] field423 = new String[field359];

    @ObfuscatedName("client.gh")
    public static int[][] field518 = new int[104][104];

    @ObfuscatedName("client.gu")
    public static int field369 = 0;

    @ObfuscatedName("client.gq")
    public static int field445 = -1;

    @ObfuscatedName("client.gx")
    public static int field406 = -1;

    @ObfuscatedName("client.gr")
    public static int field527 = 0;

    @ObfuscatedName("client.gm")
    public static int field373 = 0;

    @ObfuscatedName("client.gs")
    public static int field374 = 0;

    @ObfuscatedName("client.gb")
    public static int field456 = 0;

    @ObfuscatedName("client.gp")
    public static int field376 = 0;

    @ObfuscatedName("client.gt")
    public static int field377 = 0;

    @ObfuscatedName("client.gg")
    public static int field284 = 0;

    @ObfuscatedName("client.gi")
    public static int field379 = 0;

    @ObfuscatedName("client.ge")
    public static int field380 = 0;

    @ObfuscatedName("client.gz")
    public static int field381 = 0;

    @ObfuscatedName("client.gd")
    public static boolean field372 = false;

    @ObfuscatedName("client.gk")
    public static int field330 = 0;

    @ObfuscatedName("client.gc")
    public static int field477 = 0;

    @ObfuscatedName("client.hn")
    public static class3[] field385 = new class3[2048];

    @ObfuscatedName("client.hm")
    public static int field386 = 0;

    @ObfuscatedName("client.hf")
    public static int[] field387 = new int[2048];

    @ObfuscatedName("client.hd")
    public static int field388 = 0;

    @ObfuscatedName("client.hh")
    public static int[] field389 = new int[2048];

    @ObfuscatedName("client.hz")
    public static class111[] field390 = new class111[2048];

    @ObfuscatedName("client.hk")
    public static int field391 = -1;

    @ObfuscatedName("client.hu")
    public static int field370 = 0;

    @ObfuscatedName("client.hy")
    public static int field394 = 0;

    @ObfuscatedName("client.hp")
    public static int[] field395 = new int[1000];

    @ObfuscatedName("client.ho")
    public static final int[] field396 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hw")
    public static String[] field397 = new String[8];

    @ObfuscatedName("client.hv")
    public static boolean[] field307 = new boolean[8];

    @ObfuscatedName("client.hx")
    public static int[] field399 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hr")
    public static int field263 = -1;

    @ObfuscatedName("client.hi")
    public static class189[][][] field273 = new class189[4][104][104];

    @ObfuscatedName("client.hq")
    public static class189 field282 = new class189();

    @ObfuscatedName("client.ha")
    public static class189 field486 = new class189();

    @ObfuscatedName("client.hs")
    public static class189 field404 = new class189();

    @ObfuscatedName("client.hc")
    public static int[] field419 = new int[25];

    @ObfuscatedName("client.hl")
    public static int[] field528 = new int[25];

    @ObfuscatedName("client.ht")
    public static int[] field320 = new int[25];

    @ObfuscatedName("client.he")
    public static int field290 = 0;

    @ObfuscatedName("client.ie")
    public static boolean field409 = false;

    @ObfuscatedName("client.iq")
    public static int field410 = 0;

    @ObfuscatedName("client.im")
    public static int[] field411 = new int[500];

    @ObfuscatedName("client.iw")
    public static int[] field412 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field296 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field414 = new int[500];

    @ObfuscatedName("client.iv")
    public static String[] field415 = new String[500];

    @ObfuscatedName("client.ik")
    public static String[] field416 = new String[500];

    @ObfuscatedName("client.iy")
    public static int field417 = -1;

    @ObfuscatedName("client.id")
    public static int field329 = -1;

    @ObfuscatedName("client.ih")
    public static int field489 = 0;

    @ObfuscatedName("client.ij")
    public static int field420 = 50;

    @ObfuscatedName("client.ia")
    public static int field316 = 0;

    @ObfuscatedName("client.it")
    public static String field422 = null;

    @ObfuscatedName("client.io")
    public static boolean field300 = false;

    @ObfuscatedName("client.ji")
    public static int field424 = -1;

    @ObfuscatedName("client.jt")
    public static int field517 = -1;

    @ObfuscatedName("client.jk")
    public static String field277 = null;

    @ObfuscatedName("client.je")
    public static String field446 = null;

    @ObfuscatedName("client.jb")
    public static int field428 = -1;

    @ObfuscatedName("client.js")
    public static class186 field514 = new class186(8);

    @ObfuscatedName("client.jg")
    public static int field430 = 0;

    @ObfuscatedName("client.jc")
    public static int field431 = 0;

    @ObfuscatedName("client.jd")
    public static class164 field349 = null;

    @ObfuscatedName("client.jf")
    public static int field433 = 0;

    @ObfuscatedName("client.jr")
    public static int field434 = 0;

    @ObfuscatedName("client.jp")
    public static int field435 = 0;

    @ObfuscatedName("client.jm")
    public static int field460 = -1;

    @ObfuscatedName("client.jl")
    public static boolean field437 = false;

    @ObfuscatedName("client.jv")
    public static boolean field438 = false;

    @ObfuscatedName("client.jh")
    public static boolean field439 = false;

    @ObfuscatedName("client.jn")
    public static class164 field440 = null;

    @ObfuscatedName("client.jq")
    public static class164 field303 = null;

    @ObfuscatedName("client.ja")
    public static int field293 = 0;

    @ObfuscatedName("client.jz")
    public static int field443 = 0;

    @ObfuscatedName("client.ju")
    public static class164 field531 = null;

    @ObfuscatedName("client.jy")
    public static boolean field479 = false;

    @ObfuscatedName("client.jx")
    public static int field398 = -1;

    @ObfuscatedName("client.jo")
    public static int field447 = -1;

    @ObfuscatedName("client.kj")
    public static boolean field427 = false;

    @ObfuscatedName("client.ky")
    public static int field405 = -1;

    @ObfuscatedName("client.ko")
    public static int field450 = -1;

    @ObfuscatedName("client.kg")
    public static boolean field451 = false;

    @ObfuscatedName("client.kn")
    public static int field452 = 1;

    @ObfuscatedName("client.kh")
    public static int[] field453 = new int[32];

    @ObfuscatedName("client.kl")
    public static int field454 = 0;

    @ObfuscatedName("client.kd")
    public static int[] field455 = new int[32];

    @ObfuscatedName("client.kx")
    public static int field297 = 0;

    @ObfuscatedName("client.kw")
    public static int[] field429 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field371 = 0;

    @ObfuscatedName("client.ki")
    public static int field459 = 0;

    @ObfuscatedName("client.kc")
    public static int field264 = 0;

    @ObfuscatedName("client.kb")
    public static int field436 = 0;

    @ObfuscatedName("client.kv")
    public static int field462 = 0;

    @ObfuscatedName("client.kk")
    public static int field463 = 0;

    @ObfuscatedName("client.ke")
    public static int field464 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field465 = new int[2000];

    @ObfuscatedName("client.ku")
    public static String[] field466 = new String[1000];

    @ObfuscatedName("client.lb")
    public static int field426 = 0;

    @ObfuscatedName("client.ll")
    public static class189 field468 = new class189();

    @ObfuscatedName("client.ld")
    public static class189 field469 = new class189();

    @ObfuscatedName("client.lt")
    public static class189 field470 = new class189();

    @ObfuscatedName("client.lx")
    public static class186 field319 = new class186(512);

    @ObfuscatedName("client.lh")
    public static int field472 = 0;

    @ObfuscatedName("client.la")
    public static int field473 = -2;

    @ObfuscatedName("client.li")
    public static boolean[] field474 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static boolean[] field475 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field476 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static int[] field421 = new int[100];

    @ObfuscatedName("client.lr")
    public static int[] field407 = new int[100];

    @ObfuscatedName("client.lw")
    public static int[] field418 = new int[100];

    @ObfuscatedName("client.lj")
    public static int[] field480 = new int[100];

    @ObfuscatedName("client.ls")
    public static int field268 = 0;

    @ObfuscatedName("client.lm")
    public static int[] field482 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ly")
    public static int field483 = 0;

    @ObfuscatedName("client.le")
    public static int field484 = 0;

    @ObfuscatedName("client.ln")
    public static String field485 = "";

    @ObfuscatedName("client.lg")
    public static long[] field337 = new long[100];

    @ObfuscatedName("client.lp")
    public static int field487 = 0;

    @ObfuscatedName("client.lc")
    public static int field338 = 0;

    @ObfuscatedName("client.mh")
    public static int[] field432 = new int[128];

    @ObfuscatedName("client.mb")
    public static int[] field478 = new int[128];

    @ObfuscatedName("client.me")
    public static long field491 = -1L;

    @ObfuscatedName("client.mr")
    public static String field492 = null;

    @ObfuscatedName("client.mk")
    public static String field506 = null;

    @ObfuscatedName("client.ml")
    public static int field413 = -1;

    @ObfuscatedName("client.mu")
    public static int field365 = 0;

    @ObfuscatedName("client.mz")
    public static int[] field496 = new int[1000];

    @ObfuscatedName("client.mw")
    public static int[] field368 = new int[1000];

    @ObfuscatedName("client.md")
    public static class74[] field498 = new class74[1000];

    @ObfuscatedName("client.mg")
    public static int field499 = 0;

    @ObfuscatedName("client.mt")
    public static int field500 = 0;

    @ObfuscatedName("client.mc")
    public static int field298 = 0;

    @ObfuscatedName("client.ms")
    public static int field502 = 255;

    @ObfuscatedName("client.my")
    public static int field503 = -1;

    @ObfuscatedName("client.mq")
    public static boolean field504 = false;

    @ObfuscatedName("client.ng")
    public static int field505 = 127;

    @ObfuscatedName("client.no")
    public static int field352 = 127;

    @ObfuscatedName("client.ne")
    public static int field507 = 0;

    @ObfuscatedName("client.nv")
    public static int[] field508 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field509 = new int[50];

    @ObfuscatedName("client.nk")
    public static int[] field510 = new int[50];

    @ObfuscatedName("client.nt")
    public static int[] field511 = new int[50];

    @ObfuscatedName("client.nb")
    public static class54[] field356 = new class54[50];

    @ObfuscatedName("client.ns")
    public static boolean field497 = false;

    @ObfuscatedName("client.od")
    public static boolean[] field481 = new boolean[5];

    @ObfuscatedName("client.oc")
    public static int[] field516 = new int[5];

    @ObfuscatedName("client.ol")
    public static int[] field383 = new int[5];

    @ObfuscatedName("client.oa")
    public static int[] field519 = new int[5];

    @ObfuscatedName("client.on")
    public static int[] field332 = new int[5];

    @ObfuscatedName("client.ot")
    public static int field471 = 0;

    @ObfuscatedName("client.oe")
    public static int field384 = 0;

    @ObfuscatedName("client.oz")
    public static class17[] field522 = new class17[400];

    @ObfuscatedName("client.oq")
    public static class185 field301 = new class185();

    @ObfuscatedName("client.ow")
    public static int field524 = 0;

    @ObfuscatedName("client.oo")
    public static class8[] field526 = new class8[400];

    @ObfuscatedName("client.op")
    public static class169 field314 = new class169();

    @ObfuscatedName("client.oh")
    public static int field523 = -1;

    @ObfuscatedName("client.oi")
    public static int field529 = -1;

    @ObfuscatedName("client.ob")
    public static class210[] field494 = new class210[6];

    @ObfuscatedName("client.n(I)V")
    public final void method173() {
    }

    public final void init() {
        if (!this.method2634()) {
            return;
        }
        class180[] var1 = new class180[] { class180.field2895, class180.field2894, class180.field2904, class180.field2897, class180.field2898, class180.field2900, class180.field2902, class180.field2903, class180.field2907, class180.field2906, class180.field2899, class180.field2893, class180.field2909, class180.field2905, class180.field2901 };
        class180[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class180 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2908);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2908)) {
                    case 1:
                        class145[] var12 = new class145[] { class145.field2126, class145.field2128, class145.field2124, class145.field2125, class145.field2129, class145.field2127 };
                        Statics.field1821 = (class145) class101.method3237(var12, Integer.parseInt(var5));
                        if (Statics.field1821 == class145.field2128) {
                            Statics.field1866 = class202.field2986;
                        } else {
                            Statics.field1866 = class202.field2987;
                        }
                        break;
                    case 2:
                        Statics.field153 = Integer.parseInt(var5);
                        break;
                    case 3:
                        if (var5.equalsIgnoreCase(class2.field24)) {
                        }
                    case 4:
                    case 9:
                    case 11:
                    default:
                        break;
                    case 5:
                        Statics.field2026 = var5;
                        break;
                    case 6:
                        Statics.field623 = var5;
                        break;
                    case 7:
                        Statics.field1248 = Integer.parseInt(var5);
                        break;
                    case 8:
                        field382 = Integer.parseInt(var5);
                        break;
                    case 10:
                        field267 = Integer.parseInt(var5);
                        break;
                    case 12:
                        field272 = Integer.parseInt(var5);
                        break;
                    case 13:
                        if (var5.equalsIgnoreCase(class2.field24)) {
                            field270 = true;
                        } else {
                            field270 = false;
                        }
                        break;
                    case 14:
                        int var6 = Integer.parseInt(var5);
                        class144[] var7 = new class144[] { class144.field2117, class144.field2118, class144.field2115, class144.field2116 };
                        class144[] var8 = var7;
                        int var9 = 0;
                        class144 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class144 var10 = var8[var9];
                            if (var10.field2120 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field367 = var11;
                        break;
                    case 15:
                        field493 = Integer.parseInt(var5);
                }
            }
        }
        method802();
        Statics.field1861 = this.getCodeBase().getHost();
        String var13 = Statics.field367.field2121;
        byte var14 = 0;
        try {
            Statics.field2084 = 16;
            Statics.field539 = var14;
            try {
                Statics.field1808 = System.getProperty("os.name");
            } catch (Exception var27) {
                Statics.field1808 = "Unknown";
            }
            Statics.field723 = Statics.field1808.toLowerCase();
            try {
                Statics.field983 = System.getProperty("user.home");
                if (Statics.field983 != null) {
                    Statics.field983 = Statics.field983 + "/";
                }
            } catch (Exception var26) {
            }
            try {
                if (Statics.field723.startsWith("win")) {
                    if (Statics.field983 == null) {
                        Statics.field983 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field983 == null) {
                    Statics.field983 = System.getenv("HOME");
                }
                if (Statics.field983 != null) {
                    Statics.field983 = Statics.field983 + "/";
                }
            } catch (Exception var25) {
            }
            if (Statics.field983 == null) {
                Statics.field983 = "~/";
            }
            Statics.field2089 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field983, "/tmp/", "" };
            Statics.field1653 = new String[] { ".jagex_cache_" + Statics.field539, ".file_store_" + Statics.field539 };
            label119: for (int var18 = 0; var18 < 4; var18++) {
                Statics.field1917 = class141.method2421("oldschool", var13, var18);
                if (!Statics.field1917.exists()) {
                    Statics.field1917.mkdirs();
                }
                File[] var19 = Statics.field1917.listFiles();
                if (var19 == null) {
                    break;
                }
                File[] var20 = var19;
                int var21 = 0;
                while (true) {
                    if (var21 >= var20.length) {
                        break label119;
                    }
                    File var22 = var20[var21];
                    if (!class141.method833(var22, false)) {
                        break;
                    }
                    var21++;
                }
            }
            class127.method2721(Statics.field1917);
            class141.method2071();
            class141.field2086 = new class218(new class217(class127.method544("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class141.field2078 = new class218(new class217(class127.method544("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2088 = new class218[Statics.field2084];
            for (int var23 = 0; var23 < Statics.field2084; var23++) {
                Statics.field2088[var23] = new class218(new class217(class127.method544("main_file_cache.idx" + var23), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var28) {
            class140.method1379((String) null, var28);
        }
        Statics.field335 = this;
        this.method2612(765, 503, 77);
    }

    @ObfuscatedName("ax.l(B)V")
    public static final void method802() {
        class81.field1358 = false;
        field271 = false;
    }

    @ObfuscatedName("client.m(I)V")
    public final void method175() {
        Statics.field696 = field382 == 0 ? 43594 : field493 + 40000;
        Statics.field1672 = field382 == 0 ? 443 : field493 + 50000;
        Statics.field2100 = Statics.field696;
        Statics.field2756 = class165.field2736;
        Statics.field2758 = class165.field2733;
        Statics.field2760 = class165.field2734;
        Statics.field807 = class165.field2739;
        class129.method2418();
        class129.method473(Statics.field1563);
        class132.method1896(Statics.field1563);
        class137 var1;
        try {
            var1 = new class137();
        } catch (Throwable var14) {
            var1 = null;
        }
        Statics.field2152 = var1;
        if (Statics.field2152 != null) {
            Statics.field2152.method2460(Statics.field1563);
        }
        Statics.field1252 = new class126(255, class141.field2086, class141.field2078, 500000);
        class217 var3 = null;
        class9 var4 = new class9();
        try {
            var3 = class141.method546("", Statics.field1821.field2123, false);
            byte[] var5 = new byte[(int) var3.method3585()];
            int var7;
            for (int var6 = 0; var6 < var5.length; var6 += var7) {
                var7 = var3.method3597(var5, var6, var5.length - var6);
                if (var7 == -1) {
                    throw new IOException();
                }
            }
            var4 = new class9(new class111(var5));
        } catch (Exception var15) {
        }
        try {
            if (var3 != null) {
                var3.method3584();
            }
        } catch (Exception var13) {
        }
        Statics.field93 = var4;
        Statics.field22 = this.getToolkit().getSystemClipboard();
        String var12 = Statics.field1836;
        class130.field1989 = this;
        class130.field1992 = var12;
        if (field382 != 0) {
            field281 = true;
        }
    }

    @ObfuscatedName("client.o(I)V")
    public final void method176() {
        field275++;
        this.method179();
        while (true) {
            class189 var1 = class161.field2562;
            class160 var2;
            synchronized (class161.field2562) {
                var2 = (class160) class161.field2560.method3307();
            }
            if (var2 == null) {
                class173.method2087();
                Statics.method124();
                class129.method1606();
                class132 var4 = class132.field2004;
                synchronized (class132.field2004) {
                    class132.field2003 = class132.field1998;
                    class132.field2011 = class132.field2008;
                    class132.field2005 = class132.field2002 * -930289747;
                    class132.field2000 = class132.field2006;
                    class132.field2009 = class132.field2007;
                    class132.field2010 = class132.field2012;
                    class132.field2013 = class132.field2001;
                    class132.field2006 = 0;
                }
                if (Statics.field2152 != null) {
                    int var6 = Statics.field2152.method2449();
                    field426 = var6;
                }
                if (field461 == 0) {
                    method1347();
                    Statics.field1347.method2471();
                    for (int var7 = 0; var7 < 32; var7++) {
                        field2042[var7] = 0L;
                    }
                    for (int var8 = 0; var8 < 32; var8++) {
                        field2049[var8] = 0L;
                    }
                    Statics.field1684 = 0;
                } else if (field461 == 5) {
                    class30.method2544(this);
                    method1347();
                    class136.method631();
                } else if (field461 == 10 || field461 == 11) {
                    class30.method2544(this);
                } else if (field461 == 20) {
                    class30.method2544(this);
                    method2793();
                } else if (field461 == 25) {
                    method842();
                }
                if (field461 == 30) {
                    method88();
                } else if (field461 == 40 || field461 == 45) {
                    method2793();
                }
                return;
            }
            var2.field2552.method2892(var2.field2551, (int) var2.field2958, var2.field2557, false);
        }
    }

    @ObfuscatedName("client.k(I)V")
    public final void method177() {
        boolean var1;
        label157: {
            try {
                if (class173.field2796 == 2) {
                    if (Statics.field1282 == null) {
                        Statics.field1282 = class170.method3040(Statics.field2565, Statics.field2798, Statics.field2485);
                        if (Statics.field1282 == null) {
                            var1 = false;
                            break label157;
                        }
                    }
                    if (Statics.field1967 == null) {
                        Statics.field1967 = new class55(Statics.field2793, Statics.field2797);
                    }
                    if (Statics.field2795.method3156(Statics.field1282, Statics.field2794, Statics.field1967, 22050)) {
                        Statics.field2795.method3128();
                        Statics.field2795.method3126(Statics.field1285);
                        Statics.field2795.method3130(Statics.field1282, Statics.field2792);
                        class173.field2796 = 0;
                        Statics.field1282 = null;
                        Statics.field1967 = null;
                        Statics.field2565 = null;
                        var1 = true;
                        break label157;
                    }
                }
            } catch (Exception var26) {
                var26.printStackTrace();
                Statics.field2795.method3131();
                class173.field2796 = 0;
                Statics.field1282 = null;
                Statics.field1967 = null;
                Statics.field2565 = null;
            }
            var1 = false;
        }
        if (var1 && field504 && Statics.field63 != null) {
            Statics.field63.method1005();
        }
        if (field2053) {
            class129.method2444(Statics.field1563);
            class132.method2462(Statics.field1563);
            if (Statics.field2152 != null) {
                Statics.field2152.method2448(Statics.field1563);
            }
            this.method2613();
            class129.method473(Statics.field1563);
            Canvas var4 = Statics.field1563;
            var4.addMouseListener(class132.field2004);
            var4.addMouseMotionListener(class132.field2004);
            var4.addFocusListener(class132.field2004);
            if (Statics.field2152 != null) {
                Statics.field2152.method2460(Statics.field1563);
            }
        }
        if (field461 == 0) {
            int var5 = class30.field688;
            String var6 = class30.field667;
            Color var7 = null;
            try {
                Graphics var8 = Statics.field1563.getGraphics();
                if (Statics.field1867 == null) {
                    Statics.field1867 = new Font("Helvetica", 1, 13);
                    Statics.field1996 = Statics.field1563.getFontMetrics(Statics.field1867);
                }
                if (field2055) {
                    field2055 = false;
                    var8.setColor(Color.black);
                    var8.fillRect(0, 0, Statics.field558, Statics.field1800);
                }
                if (var7 == null) {
                    var7 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field949 == null) {
                        Statics.field949 = Statics.field1563.createImage(304, 34);
                    }
                    Graphics var9 = Statics.field949.getGraphics();
                    var9.setColor(var7);
                    var9.drawRect(0, 0, 303, 33);
                    var9.fillRect(2, 2, var5 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(1, 1, 301, 31);
                    var9.fillRect(var5 * 3 + 2, 2, 300 - var5 * 3, 30);
                    var9.setFont(Statics.field1867);
                    var9.setColor(Color.white);
                    var9.drawString(var6, (304 - Statics.field1996.stringWidth(var6)) / 2, 22);
                    var8.drawImage(Statics.field949, Statics.field558 / 2 - 152, Statics.field1800 / 2 - 18, (ImageObserver) null);
                } catch (Exception var22) {
                    int var11 = Statics.field558 / 2 - 152;
                    int var12 = Statics.field1800 / 2 - 18;
                    var8.setColor(var7);
                    var8.drawRect(var11, var12, 303, 33);
                    var8.fillRect(var11 + 2, var12 + 2, var5 * 3, 30);
                    var8.setColor(Color.black);
                    var8.drawRect(var11 + 1, var12 + 1, 301, 31);
                    var8.fillRect(var5 * 3 + var11 + 2, var12 + 2, 300 - var5 * 3, 30);
                    var8.setFont(Statics.field1867);
                    var8.setColor(Color.white);
                    var8.drawString(var6, var11 + (304 - Statics.field1996.stringWidth(var6)) / 2, var12 + 22);
                }
            } catch (Exception var23) {
                Statics.field1563.repaint();
            }
        } else if (field461 == 5) {
            class30.method2722(Statics.field546, Statics.field1253, Statics.field649);
        } else if (field461 == 10 || field461 == 11) {
            class30.method2722(Statics.field546, Statics.field1253, Statics.field649);
        } else if (field461 == 20) {
            class30.method2722(Statics.field546, Statics.field1253, Statics.field649);
        } else if (field461 == 25) {
            if (field324 == 1) {
                if (field467 > field400) {
                    field400 = field467;
                }
                int var14 = (field400 * 50 - field467 * 50) / field400;
                method2584(class148.field2243 + class2.field20 + class2.field17 + var14 + "%" + class2.field18, false);
            } else if (field324 == 2) {
                if (field322 > field323) {
                    field323 = field322;
                }
                int var15 = (field323 * 50 - field322 * 50) / field323 + 50;
                method2584(class148.field2243 + class2.field20 + class2.field17 + var15 + "%" + class2.field18, false);
            } else {
                method2584(class148.field2243, false);
            }
        } else if (field461 == 30) {
            method9();
        } else if (field461 == 40) {
            method2584(class148.field2164 + class2.field20 + class148.field2165, false);
        } else if (field461 == 45) {
            method2584(class148.field2312, false);
        }
        if (field461 == 30 && field268 == 0 && !field2055) {
            try {
                Graphics var16 = Statics.field1563.getGraphics();
                for (int var17 = 0; var17 < field472; var17++) {
                    if (field475[var17]) {
                        Statics.field2050.method1358(var16, field421[var17], field407[var17], field418[var17], field480[var17]);
                        field475[var17] = false;
                    }
                }
            } catch (Exception var25) {
                Statics.field1563.repaint();
            }
        } else if (field461 > 0) {
            try {
                Graphics var19 = Statics.field1563.getGraphics();
                Statics.field2050.method1357(var19, 0, 0);
                field2055 = false;
                for (int var20 = 0; var20 < field472; var20++) {
                    field475[var20] = false;
                }
            } catch (Exception var24) {
                Statics.field1563.repaint();
            }
        }
    }

    @ObfuscatedName("client.p(S)V")
    public final void method178() {
        if (Statics.field1258 != null) {
            Statics.field1258.field189 = false;
        }
        Statics.field1258 = null;
        if (Statics.field1915 != null) {
            Statics.field1915.method2606();
            Statics.field1915 = null;
        }
        if (class129.field1960 != null) {
            class129 var1 = class129.field1960;
            synchronized (class129.field1960) {
                class129.field1960 = null;
            }
        }
        class132.method384();
        Statics.field2152 = null;
        if (Statics.field63 != null) {
            Statics.field63.method1006();
        }
        if (Statics.field1064 != null) {
            Statics.field1064.method1006();
        }
        class162.method2442();
        Object var3 = class161.field2563;
        synchronized (class161.field2563) {
            if (class161.field2561 != 0) {
                class161.field2561 = 1;
                try {
                    class161.field2563.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        try {
            class141.field2086.method3620();
            for (int var6 = 0; var6 < Statics.field2084; var6++) {
                Statics.field2088[var6].method3620();
            }
            class141.field2078.method3620();
            class141.field2090.method3620();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("y.u(II)V")
    public static void method154(int arg0) {
        if (field461 == arg0) {
            return;
        }
        if (field461 == 0) {
            Statics.field949 = null;
            Statics.field1867 = null;
            Statics.field1996 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field299 = 0;
            field512 = 0;
            field321 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field957 != null) {
            Statics.field957.method2606();
            Statics.field957 = null;
        }
        if (field461 == 25) {
            field324 = 0;
            field467 = 0;
            field400 = 1;
            field322 = 0;
            field323 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class30.method496(Statics.field1563, Statics.field532, Statics.field739, true, 0);
        } else if (arg0 == 20) {
            class30.method496(Statics.field1563, Statics.field532, Statics.field739, true, field461 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class30.method496(Statics.field1563, Statics.field532, Statics.field739, false, 4);
        } else {
            class30.method2884();
        }
        field461 = arg0;
    }

    @ObfuscatedName("client.g(I)V")
    public void method179() {
        if (field461 != 1000) {
            boolean var1 = class162.method1872();
            if (!var1) {
                this.method180();
            }
        }
    }

    @ObfuscatedName("client.a(I)V")
    public void method180() {
        if (class162.field2587 >= 4) {
            this.method2620("js5crc");
            field461 = 1000;
            return;
        }
        if (class162.field2588 >= 4) {
            if (field461 <= 5) {
                this.method2620("js5io");
                field461 = 1000;
                return;
            }
            field295 = 3000;
            class162.field2588 = 3;
        }
        if (--field295 + 1 > 0) {
            return;
        }
        try {
            if (field361 == 0) {
                Statics.field706 = Statics.field925.method2505(Statics.field1861, Statics.field2100);
                field361++;
            }
            if (field361 == 1) {
                if (Statics.field706.field2063 == 2) {
                    this.method181(-1);
                    return;
                }
                if (Statics.field706.field2063 == 1) {
                    field361++;
                }
            }
            if (field361 == 2) {
                Statics.field216 = new class135((Socket) Statics.field706.field2067, Statics.field925);
                class111 var1 = new class111(5);
                var1.method2133(15);
                var1.method2136(77);
                Statics.field216.method2593(var1.field1859, 0, 5);
                field361++;
                Statics.field351 = class107.method2434();
            }
            if (field361 == 3) {
                if (field461 <= 5 || Statics.field216.method2587() > 0) {
                    int var2 = Statics.field216.method2589();
                    if (var2 != 0) {
                        this.method181(var2);
                        return;
                    }
                    field361++;
                } else if (class107.method2434() - Statics.field351 > 30000L) {
                    this.method181(-2);
                    return;
                }
            }
            if (field361 == 4) {
                class135 var3 = Statics.field216;
                boolean var4 = field461 > 20;
                if (Statics.field543 != null) {
                    try {
                        Statics.field543.method2606();
                    } catch (Exception var14) {
                    }
                    Statics.field543 = null;
                }
                Statics.field543 = var3;
                class162.method2794(var4);
                class162.field2581.field1852 = 0;
                Statics.field1756 = null;
                Statics.field2576 = null;
                class162.field2583 = 0;
                while (true) {
                    class163 var6 = (class163) class162.field2584.method3276();
                    if (var6 == null) {
                        while (true) {
                            class163 var7 = (class163) class162.field2579.method3276();
                            if (var7 == null) {
                                if (class162.field2572 != 0) {
                                    try {
                                        class111 var8 = new class111(4);
                                        var8.method2133(4);
                                        var8.method2133(class162.field2572);
                                        var8.method2134(0);
                                        Statics.field543.method2593(var8.field1859, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field543.method2606();
                                        } catch (Exception var12) {
                                        }
                                        class162.field2588++;
                                        Statics.field543 = null;
                                    }
                                }
                                class162.field2570 = 0;
                                Statics.field2574 = class107.method2434();
                                Statics.field706 = null;
                                Statics.field216 = null;
                                field361 = 0;
                                field308 = 0;
                                return;
                            }
                            class162.field2590.method3367(var7);
                            class162.field2577.method3274(var7, var7.field2958);
                            class162.field2578++;
                            class162.field2585--;
                        }
                    }
                    class162.field2580.method3274(var6, var6.field2958);
                    class162.field2573++;
                    class162.field2575--;
                }
            }
        } catch (IOException var15) {
            this.method181(-3);
        }
    }

    @ObfuscatedName("client.y(IB)V")
    public void method181(int arg0) {
        Statics.field706 = null;
        Statics.field216 = null;
        field361 = 0;
        if (Statics.field696 == Statics.field2100) {
            Statics.field2100 = Statics.field1672;
        } else {
            Statics.field2100 = Statics.field696;
        }
        field308++;
        if (field308 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field461 <= 5) {
                this.method2620("js5connect_full");
                field461 = 1000;
            } else {
                field295 = 3000;
            }
        } else if (field308 >= 2 && arg0 == 6) {
            this.method2620("js5connect_outofdate");
            field461 = 1000;
        } else if (field308 >= 4) {
            if (field461 <= 5) {
                this.method2620("js5connect");
                field461 = 1000;
            } else {
                field295 = 3000;
            }
        }
    }

    @ObfuscatedName("bj.d(B)V")
    public static void method1347() {
        if (field530 == 0) {
            Statics.field191 = new class81(4, 104, 104, class6.field77);
            for (int var0 = 0; var0 < 4; var0++) {
                field325[var0] = new class219(104, 104);
            }
            Statics.field1561 = new class74(512, 512);
            class30.field667 = class148.field2166;
            class30.field688 = 5;
            field530 = 20;
        } else if (field530 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class86.field1480[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class81.method1729(var1, 500, 800, 512, 334);
            class30.field667 = class148.field2167;
            class30.field688 = 10;
            field530 = 30;
        } else if (field530 == 30) {
            Statics.field215 = method142(0, false, true, true);
            Statics.field247 = method142(1, false, true, true);
            Statics.field1665 = method142(2, true, false, true);
            Statics.field958 = method142(3, false, true, true);
            Statics.field236 = method142(4, false, true, true);
            Statics.field2973 = method142(5, true, true, true);
            Statics.field549 = method142(6, true, true, false);
            Statics.field193 = method142(7, false, true, true);
            Statics.field739 = method142(8, false, true, true);
            Statics.field2764 = method142(9, false, true, true);
            Statics.field532 = method142(10, false, true, true);
            Statics.field2558 = method142(11, false, true, true);
            Statics.field1875 = method142(12, false, true, true);
            Statics.field200 = method142(13, true, false, true);
            Statics.field490 = method142(14, false, true, false);
            Statics.field909 = method142(15, false, true, true);
            class30.field667 = class148.field2168;
            class30.field688 = 20;
            field530 = 40;
        } else if (field530 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field215.method2896() * 4 / 100;
            int var8 = var7 + Statics.field247.method2896() * 4 / 100;
            int var9 = var8 + Statics.field1665.method2896() * 2 / 100;
            int var10 = var9 + Statics.field958.method2896() * 2 / 100;
            int var11 = var10 + Statics.field236.method2896() * 6 / 100;
            int var12 = var11 + Statics.field2973.method2896() * 4 / 100;
            int var13 = var12 + Statics.field549.method2896() * 2 / 100;
            int var14 = var13 + Statics.field193.method2896() * 60 / 100;
            int var15 = var14 + Statics.field739.method2896() * 2 / 100;
            int var16 = var15 + Statics.field2764.method2896() * 2 / 100;
            int var17 = var16 + Statics.field532.method2896() * 2 / 100;
            int var18 = var17 + Statics.field2558.method2896() * 2 / 100;
            int var19 = var18 + Statics.field1875.method2896() * 2 / 100;
            int var20 = var19 + Statics.field200.method2896() * 2 / 100;
            int var21 = var20 + Statics.field490.method2896() * 2 / 100;
            int var22 = var21 + Statics.field909.method2896() * 2 / 100;
            if (var22 == 100) {
                class30.field667 = class148.field2170;
                class30.field688 = 30;
                field530 = 45;
            } else {
                if (var22 != 0) {
                    class30.field667 = class148.field2331 + var22 + "%";
                }
                class30.field688 = 30;
            }
        } else if (field530 == 45) {
            class52.method916(22050, !field271, 2);
            class174 var23 = new class174();
            var23.method3133(9, 128);
            Statics.field63 = class52.method509(Statics.field925, Statics.field1563, 0, 22050);
            Statics.field63.method1002(var23);
            class173.method2489(Statics.field909, Statics.field490, Statics.field236, var23);
            Statics.field1064 = class52.method509(Statics.field925, Statics.field1563, 1, 2048);
            Statics.field1812 = new class51();
            Statics.field1064.method1002(Statics.field1812);
            Statics.field1100 = new class70(22050, Statics.field3011);
            class30.field667 = class148.field2171;
            class30.field688 = 35;
            field530 = 50;
        } else if (field530 == 50) {
            int var24 = 0;
            if (Statics.field1253 == null) {
                class159 var25 = Statics.field739;
                class159 var26 = Statics.field200;
                int var27 = var25.method2813("p11_full");
                int var28 = var25.method2814(var27, "");
                class214 var29;
                if (class72.method3222(var25, var27, var28)) {
                    var29 = class72.method2908(var26.method2811(var27, var28));
                } else {
                    var29 = null;
                }
                Statics.field1253 = var29;
            } else {
                var24++;
            }
            if (Statics.field649 == null) {
                class159 var31 = Statics.field739;
                class159 var32 = Statics.field200;
                int var33 = var31.method2813("p12_full");
                int var34 = var31.method2814(var33, "");
                class214 var35;
                if (class72.method3222(var31, var33, var34)) {
                    var35 = class72.method2908(var32.method2811(var33, var34));
                } else {
                    var35 = null;
                }
                Statics.field649 = var35;
            } else {
                var24++;
            }
            if (Statics.field546 == null) {
                Statics.field546 = Statics.method128(Statics.field739, Statics.field200, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class30.field667 = class148.field2163 + var24 * 100 / 3 + "%";
                class30.field688 = 40;
            } else {
                Statics.field2507 = new class151(true);
                class30.field667 = class148.field2173;
                class30.field688 = 40;
                field530 = 60;
            }
        } else if (field530 == 60) {
            class159 var37 = Statics.field532;
            class159 var38 = Statics.field739;
            int var39 = 0;
            if (var37.method2862("title.jpg", "")) {
                var39++;
            }
            if (var38.method2862("logo", "")) {
                var39++;
            }
            if (var38.method2862("titlebox", "")) {
                var39++;
            }
            if (var38.method2862("titlebutton", "")) {
                var39++;
            }
            if (var38.method2862("runes", "")) {
                var39++;
            }
            if (var38.method2862("title_mute", "")) {
                var39++;
            }
            if (var38.method2817("options_radio_buttons,0")) {
                var39++;
            }
            if (var38.method2817("options_radio_buttons,2")) {
                var39++;
            }
            var38.method2862("sl_back", "");
            var38.method2862("sl_flags", "");
            var38.method2862("sl_arrows", "");
            var38.method2862("sl_stars", "");
            var38.method2862("sl_button", "");
            byte var42 = 8;
            if (var39 < var42) {
                class30.field667 = class148.field2256 + var39 * 100 / var42 + "%";
                class30.field688 = 50;
            } else {
                class30.field667 = class148.field2175;
                class30.field688 = 50;
                method154(5);
                field530 = 70;
            }
        } else if (field530 == 70) {
            if (Statics.field1665.method2855()) {
                class159 var44 = Statics.field1665;
                Statics.field976 = var44;
                class159 var45 = Statics.field1665;
                Statics.field906 = var45;
                class42.method2461(Statics.field1665, Statics.field193);
                class159 var46 = Statics.field1665;
                class159 var47 = Statics.field193;
                boolean var48 = field271;
                Statics.field879 = var46;
                Statics.field882 = var47;
                class38.field886 = var48;
                class37.method600(Statics.field1665, Statics.field193);
                class159 var49 = Statics.field1665;
                class159 var50 = Statics.field193;
                boolean var51 = field270;
                class214 var52 = Statics.field1253;
                Statics.field1015 = var49;
                Statics.field700 = var50;
                Statics.field1896 = var51;
                Statics.field2890 = Statics.field1015.method2808(10);
                Statics.field599 = var52;
                class159 var53 = Statics.field1665;
                class159 var54 = Statics.field215;
                class159 var55 = Statics.field247;
                Statics.field924 = var53;
                Statics.field921 = var54;
                Statics.field912 = var55;
                class159 var56 = Statics.field1665;
                class159 var57 = Statics.field193;
                Statics.field946 = var56;
                Statics.field934 = var57;
                class44.method579(Statics.field1665);
                class48.method2679(Statics.field1665);
                class159 var58 = Statics.field958;
                class159 var59 = Statics.field193;
                class159 var60 = Statics.field739;
                class159 var61 = Statics.field200;
                Statics.field2603 = var58;
                Statics.field2604 = var59;
                Statics.field3007 = var60;
                Statics.field2610 = var61;
                Statics.field2686 = new class164[Statics.field2603.method2828()][];
                Statics.field2602 = new boolean[Statics.field2603.method2828()];
                class159 var62 = Statics.field1665;
                Statics.field1010 = var62;
                class159 var63 = Statics.field1665;
                Statics.field995 = var63;
                class30.field667 = class148.field2422;
                class30.field688 = 60;
                field530 = 80;
            } else {
                class30.field667 = class148.field2303 + Statics.field1665.method2891() + "%";
                class30.field688 = 60;
            }
        } else if (field530 == 80) {
            int var64 = 0;
            if (Statics.field1828 == null) {
                Statics.field1828 = class72.method163(Statics.field739, "compass", "");
            } else {
                var64++;
            }
            if (Statics.field1062 == null) {
                Statics.field1062 = class72.method163(Statics.field739, "mapedge", "");
            } else {
                var64++;
            }
            if (Statics.field2022 == null) {
                Statics.field2022 = class72.method12(Statics.field739, "mapscene", "");
            } else {
                var64++;
            }
            if (Statics.field2038 == null) {
                Statics.field2038 = class72.method602(Statics.field739, "mapfunction", "");
            } else {
                var64++;
            }
            if (Statics.field2495 == null) {
                Statics.field2495 = class72.method602(Statics.field739, "hitmarks", "");
            } else {
                var64++;
            }
            if (Statics.field1758 == null) {
                Statics.field1758 = class72.method602(Statics.field739, "headicons_pk", "");
            } else {
                var64++;
            }
            if (Statics.field2131 == null) {
                Statics.field2131 = class72.method602(Statics.field739, "headicons_prayer", "");
            } else {
                var64++;
            }
            if (Statics.field701 == null) {
                Statics.field701 = class72.method602(Statics.field739, "headicons_hint", "");
            } else {
                var64++;
            }
            if (Statics.field1835 == null) {
                Statics.field1835 = class72.method602(Statics.field739, "mapmarker", "");
            } else {
                var64++;
            }
            if (Statics.field2493 == null) {
                Statics.field2493 = class72.method602(Statics.field739, "cross", "");
            } else {
                var64++;
            }
            if (Statics.field2508 == null) {
                Statics.field2508 = class72.method602(Statics.field739, "mapdots", "");
            } else {
                var64++;
            }
            if (Statics.field1353 == null) {
                Statics.field1353 = class72.method12(Statics.field739, "scrollbar", "");
            } else {
                var64++;
            }
            if (Statics.field560 == null) {
                Statics.field560 = class72.method12(Statics.field739, "mod_icons", "");
            } else {
                var64++;
            }
            if (Statics.field1864 == null) {
                Statics.field1864 = class72.method135(Statics.field739, "mapback", "");
            } else {
                var64++;
            }
            if (var64 < 14) {
                class30.field667 = class148.field2362 + var64 * 100 / 14 + "%";
                class30.field688 = 70;
            } else {
                Statics.field3042 = Statics.field560;
                Statics.field1062.method1433();
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 21.0D) - 10;
                int var68 = (int) (Math.random() * 41.0D) - 20;
                for (int var69 = 0; var69 < Statics.field2038.length; var69++) {
                    Statics.field2038[var69].method1429(var65 + var68, var66 + var68, var67 + var68);
                }
                Statics.field2022[0].method1584(var65 + var68, var66 + var68, var67 + var68);
                method2943();
                class30.field667 = class148.field2178;
                class30.field688 = 70;
                field530 = 90;
            }
        } else if (field530 == 90) {
            if (Statics.field2764.method2855()) {
                class90 var70 = new class90(Statics.field2764, Statics.field739, 20, 0.8D, field271 ? 64 : 128);
                class86.method1793(var70);
                class86.method1794(0.8D);
                class30.field667 = class148.field2181;
                class30.field688 = 90;
                field530 = 110;
            } else {
                class30.field667 = class148.field2180 + Statics.field2764.method2891() + "%";
                class30.field688 = 90;
            }
        } else if (field530 == 110) {
            Statics.field1258 = new class13();
            Statics.field925.method2501(Statics.field1258, 10);
            class30.field667 = class148.field2182;
            class30.field688 = 94;
            field530 = 120;
        } else if (field530 == 120) {
            if (Statics.field532.method2862("huffman", "")) {
                class105 var71 = new class105(Statics.field532.method2815("huffman", ""));
                Statics.field3032 = var71;
                class30.field667 = class148.field2332;
                class30.field688 = 96;
                field530 = 130;
            } else {
                class30.field667 = class148.field2183 + "%";
                class30.field688 = 96;
            }
        } else if (field530 == 130) {
            if (!Statics.field958.method2855()) {
                class30.field667 = class148.field2187 + Statics.field958.method2891() * 4 / 5 + "%";
                class30.field688 = 100;
            } else if (!Statics.field1875.method2855()) {
                class30.field667 = class148.field2187 + (80 + Statics.field1875.method2891() / 6) + "%";
                class30.field688 = 100;
            } else if (Statics.field200.method2855()) {
                class30.field667 = class148.field2246;
                class30.field688 = 100;
                field530 = 140;
            } else {
                class30.field667 = class148.field2187 + (96 + Statics.field200.method2891() / 20) + "%";
                class30.field688 = 100;
            }
        } else if (field530 == 140) {
            method154(10);
        }
    }

    @ObfuscatedName("g.b(IZZZB)Lfg;")
    public static class159 method142(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class126 var4 = null;
        if (class141.field2086 != null) {
            var4 = new class126(arg0, class141.field2086, Statics.field2088[arg0], 1000000);
        }
        return new class159(var4, Statics.field1252, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("fn.j(I)V")
    public static void method2943() {
        Statics.field1919 = new int[33];
        Statics.field74 = new int[33];
        Statics.field57 = new int[151];
        Statics.field930 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field1864.field1328[Statics.field1864.field1323 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field1919[var0] = var1;
            Statics.field74[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field1864.field1328[Statics.field1864.field1323 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field57[var4 - 5] = var5 - 25;
            Statics.field930[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("fx.f(I)V")
    public static final void method2793() {
        try {
            if (field299 == 0) {
                if (Statics.field1915 != null) {
                    Statics.field1915.method2606();
                    Statics.field1915 = null;
                }
                Statics.field662 = null;
                field318 = false;
                field512 = 0;
                field299 = 1;
            }
            if (field299 == 1) {
                if (Statics.field662 == null) {
                    Statics.field662 = Statics.field925.method2505(Statics.field1861, Statics.field2100);
                }
                if (Statics.field662.field2063 == 2) {
                    throw new IOException();
                }
                if (Statics.field662.field2063 == 1) {
                    Statics.field1915 = new class135((Socket) Statics.field662.field2067, Statics.field925);
                    Statics.field662 = null;
                    field299 = 2;
                }
            }
            if (field299 == 2) {
                field521.field1852 = 0;
                field521.method2133(14);
                Statics.field1915.method2593(field521.field1859, 0, 1);
                field309.field1852 = 0;
                field299 = 3;
            }
            if (field299 == 3) {
                if (Statics.field63 != null) {
                    Statics.field63.method1004();
                }
                if (Statics.field1064 != null) {
                    Statics.field1064.method1004();
                }
                int var0 = Statics.field1915.method2589();
                if (Statics.field63 != null) {
                    Statics.field63.method1004();
                }
                if (Statics.field1064 != null) {
                    Statics.field1064.method1004();
                }
                if (var0 != 0) {
                    method801(var0);
                    return;
                }
                field309.field1852 = 0;
                field299 = 5;
            }
            if (field299 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field521.field1852 = 0;
                field521.method2133(1);
                field521.method2133(class30.field683.method476());
                field521.method2136(var1[0]);
                field521.method2136(var1[1]);
                field521.method2136(var1[2]);
                field521.method2136(var1[3]);
                switch(class30.field683.field2443) {
                    case 0:
                    case 2:
                        field521.method2135(Statics.field675);
                        field521.field1852 += 5;
                        break;
                    case 1:
                        field521.field1852 += 8;
                        break;
                    case 3:
                        field521.method2136((Integer) Statics.field93.field132.get(class154.method520(class30.field656)));
                        field521.field1852 += 4;
                }
                field521.method2139(class30.field687);
                field521.method2272(class5.field65, class5.field62);
                field449.field1852 = 0;
                if (field461 == 40) {
                    field449.method2133(18);
                } else {
                    field449.method2133(16);
                }
                field449.method2134(0);
                int var2 = field449.field1852;
                field449.method2136(77);
                field449.method2142(field521.field1859, 0, field521.field1852);
                int var3 = field449.field1852;
                field449.method2139(class30.field656);
                field449.method2133(field271 ? 1 : 0);
                class141.method2093(field449);
                field449.method2139(Statics.field623);
                field449.method2136(Statics.field1248);
                class111 var4 = new class111(Statics.field2507.method2713());
                Statics.field2507.method2710(var4);
                field449.method2142(var4.field1859, 0, var4.field1859.length);
                field449.method2133(Statics.field153);
                field449.method2136(Statics.field215.field2531);
                field449.method2136(Statics.field247.field2531);
                field449.method2136(Statics.field1665.field2531);
                field449.method2136(Statics.field958.field2531);
                field449.method2136(Statics.field236.field2531);
                field449.method2136(Statics.field2973.field2531);
                field449.method2136(Statics.field549.field2531);
                field449.method2136(Statics.field193.field2531);
                field449.method2136(Statics.field739.field2531);
                field449.method2136(Statics.field2764.field2531);
                field449.method2136(Statics.field532.field2531);
                field449.method2136(Statics.field2558.field2531);
                field449.method2136(Statics.field1875.field2531);
                field449.method2136(Statics.field200.field2531);
                field449.method2136(Statics.field490.field2531);
                field449.method2136(Statics.field909.field2531);
                field449.method2166(var1, var3, field449.field1852);
                field449.method2144(field449.field1852 - var2);
                Statics.field1915.method2593(field449.field1859, 0, field449.field1852);
                field521.method2375(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field309.method2375(var1);
                field299 = 6;
            }
            if (field299 == 6 && Statics.field1915.method2587() > 0) {
                int var6 = Statics.field1915.method2589();
                if (var6 == 21 && field461 == 20) {
                    field299 = 7;
                } else if (var6 == 2) {
                    field299 = 9;
                } else if (var6 == 15 && field461 == 40) {
                    field521.field1852 = 0;
                    field309.field1852 = 0;
                    field311 = -1;
                    field315 = -1;
                    field375 = -1;
                    field317 = -1;
                    field310 = 0;
                    field312 = 0;
                    field488 = 0;
                    field410 = 0;
                    field409 = false;
                    field298 = 0;
                    field499 = 0;
                    for (int var7 = 0; var7 < field385.length; var7++) {
                        if (field385[var7] != null) {
                            field385[var7].field797 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field304.length; var8++) {
                        if (field304[var8] != null) {
                            field304[var8].field797 = -1;
                        }
                    }
                    class15.field213 = new class186(32);
                    method154(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field474[var9] = true;
                    }
                    return;
                } else if (var6 == 23 && field321 < 1) {
                    field321++;
                    field299 = 0;
                } else {
                    method801(var6);
                    return;
                }
            }
            if (field299 == 7 && Statics.field1915.method2587() > 0) {
                field302 = (Statics.field1915.method2589() + 3) * 60;
                field299 = 8;
            }
            if (field299 == 8) {
                field512 = 0;
                class30.method144(class148.field2190, class148.field2191, field302 / 60 + class148.field2421);
                if (--field302 <= 0) {
                    field299 = 0;
                }
            } else {
                if (field299 == 9 && Statics.field1915.method2587() >= 13) {
                    boolean var10 = Statics.field1915.method2589() == 1;
                    Statics.field1915.method2590(field309.field1859, 0, 4);
                    field309.field1852 = 0;
                    boolean var11 = false;
                    if (var10) {
                        int var12 = field309.method2383() << 24;
                        int var13 = var12 | field309.method2383() << 16;
                        int var14 = var13 | field309.method2383() << 8;
                        int var15 = var14 | field309.method2383();
                        int var16 = class154.method520(class30.field656);
                        if (Statics.field93.field132.size() >= 10 && !Statics.field93.field132.containsKey(var16)) {
                            Iterator var17 = Statics.field93.field132.entrySet().iterator();
                            var17.next();
                            var17.remove();
                        }
                        Statics.field93.field132.put(var16, var15);
                        class9.method91();
                    }
                    field435 = Statics.field1915.method2589();
                    field437 = Statics.field1915.method2589() == 1;
                    field391 = Statics.field1915.method2589();
                    field391 <<= 0x8;
                    field391 += Statics.field1915.method2589();
                    field370 = Statics.field1915.method2589();
                    Statics.field1915.method2590(field309.field1859, 0, 1);
                    field309.field1852 = 0;
                    field311 = field309.method2383();
                    Statics.field1915.method2590(field309.field1859, 0, 2);
                    field309.field1852 = 0;
                    field310 = field309.method2307();
                    if (field370 == 1) {
                        try {
                            client var18 = Statics.field335;
                            JSObject.getWindow(var18).call("zap", (Object[]) null);
                        } catch (Throwable var39) {
                        }
                    } else {
                        try {
                            client var20 = Statics.field335;
                            JSObject.getWindow(var20).call("unzap", (Object[]) null);
                        } catch (Throwable var38) {
                        }
                    }
                    field299 = 10;
                }
                if (field299 != 10) {
                    field512++;
                    if (field512 > 2000) {
                        if (field321 < 1) {
                            if (Statics.field696 == Statics.field2100) {
                                Statics.field2100 = Statics.field1672;
                            } else {
                                Statics.field2100 = Statics.field696;
                            }
                            field321++;
                            field299 = 0;
                        } else {
                            method801(-3);
                        }
                    }
                } else if (Statics.field1915.method2587() >= field310) {
                    field309.field1852 = 0;
                    Statics.field1915.method2590(field309.field1859, 0, field310);
                    field276 = 1L;
                    field279 = -1;
                    Statics.field1258.field187 = 0;
                    Statics.field2554 = true;
                    field266 = true;
                    field491 = -1L;
                    class201.field2975 = new class192();
                    field521.field1852 = 0;
                    field309.field1852 = 0;
                    field311 = -1;
                    field315 = -1;
                    field375 = -1;
                    field317 = -1;
                    field312 = 0;
                    field488 = 0;
                    field520 = 0;
                    field283 = 0;
                    field410 = 0;
                    field409 = false;
                    class132.method2550(0);
                    class11.field160.clear();
                    class11.field157.method3295();
                    class11.field156.method3343();
                    class11.field159 = 0;
                    field316 = 0;
                    field300 = false;
                    field507 = 0;
                    field515 = (int) (Math.random() * 100.0D) - 50;
                    field331 = (int) (Math.random() * 110.0D) - 55;
                    field333 = (int) (Math.random() * 80.0D) - 40;
                    field336 = (int) (Math.random() * 120.0D) - 60;
                    field402 = (int) (Math.random() * 30.0D) - 20;
                    field350 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field298 = 0;
                    field413 = -1;
                    field499 = 0;
                    field500 = 0;
                    field280 = class19.field541;
                    field386 = 0;
                    field378 = 0;
                    for (int var22 = 0; var22 < 2048; var22++) {
                        field385[var22] = null;
                        field390[var22] = null;
                    }
                    for (int var23 = 0; var23 < 32768; var23++) {
                        field304[var23] = null;
                    }
                    Statics.field393 = field385[2047] = new class3();
                    field263 = -1;
                    field486.method3303();
                    field404.method3303();
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 104; var25++) {
                            for (int var26 = 0; var26 < 104; var26++) {
                                field273[var24][var25][var26] = null;
                            }
                        }
                    }
                    field282 = new class189();
                    field384 = 0;
                    field471 = 0;
                    field524 = 0;
                    for (int var27 = 0; var27 < Statics.field1066; var27++) {
                        class48 var28 = Statics.method580(var27);
                        if (var28 != null) {
                            class166.field2741[var27] = 0;
                            class166.field2742[var27] = 0;
                        }
                    }
                    for (int var29 = 0; var29 < field465.length; var29++) {
                        field465[var29] = -1;
                    }
                    field460 = -1;
                    if (field428 != -1) {
                        int var30 = field428;
                        if (var30 != -1 && Statics.field2602[var30]) {
                            Statics.field2603.method2825(var30);
                            if (Statics.field2686[var30] != null) {
                                boolean var31 = true;
                                for (int var32 = 0; var32 < Statics.field2686[var30].length; var32++) {
                                    if (Statics.field2686[var30][var32] != null) {
                                        if (Statics.field2686[var30][var32].field2613 == 2) {
                                            var31 = false;
                                        } else {
                                            Statics.field2686[var30][var32] = null;
                                        }
                                    }
                                }
                                if (var31) {
                                    Statics.field2686[var30] = null;
                                }
                                Statics.field2602[var30] = false;
                            }
                        }
                    }
                    for (class4 var33 = (class4) field514.method3276(); var33 != null; var33 = (class4) field514.method3277()) {
                        method2549(var33, true);
                    }
                    field428 = -1;
                    field514 = new class186(8);
                    field349 = null;
                    field409 = false;
                    field410 = 0;
                    field314.method3032((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var34 = 0; var34 < 8; var34++) {
                        field397[var34] = null;
                        field307[var34] = false;
                    }
                    class15.field213 = new class186(32);
                    field274 = true;
                    for (int var35 = 0; var35 < 100; var35++) {
                        field474[var35] = true;
                    }
                    field492 = null;
                    Statics.field1664 = 0;
                    Statics.field89 = null;
                    for (int var36 = 0; var36 < 6; var36++) {
                        field494[var36] = new class210();
                    }
                    Statics.field951 = null;
                    Statics.field2143 = -1;
                    method2704(false);
                    field311 = -1;
                }
            }
        } catch (IOException var40) {
            if (field321 < 1) {
                if (Statics.field696 == Statics.field2100) {
                    Statics.field2100 = Statics.field1672;
                } else {
                    Statics.field2100 = Statics.field696;
                }
                field321++;
                field299 = 0;
            } else {
                method801(-2);
            }
        }
    }

    @ObfuscatedName("ay.w(IB)V")
    public static void method801(int arg0) {
        if (arg0 == -3) {
            class30.method144(class148.field2193, class148.field2194, class148.field2195);
        } else if (arg0 == -2) {
            class30.method144(class148.field2196, class148.field2388, class148.field2400);
        } else if (arg0 == -1) {
            class30.method144(class148.field2199, class148.field2200, class148.field2201);
        } else if (arg0 == 3) {
            class30.method144(class148.field2224, class148.field2315, class148.field2204);
        } else if (arg0 == 4) {
            class30.method144(class148.field2185, class148.field2206, class148.field2359);
        } else if (arg0 == 5) {
            class30.method144(class148.field2208, class148.field2209, class148.field2210);
        } else if (arg0 == 6) {
            class30.method144(class148.field2211, class148.field2176, class148.field2213);
        } else if (arg0 == 7) {
            class30.method144(class148.field2342, class148.field2215, class148.field2216);
        } else if (arg0 == 8) {
            class30.method144(class148.field2217, class148.field2218, class148.field2219);
        } else if (arg0 == 9) {
            class30.method144(class148.field2220, class148.field2221, class148.field2425);
        } else if (arg0 == 10) {
            class30.method144(class148.field2313, class148.field2236, class148.field2225);
        } else if (arg0 == 11) {
            class30.method144(class148.field2226, class148.field2227, class148.field2228);
        } else if (arg0 == 12) {
            class30.method144(class148.field2229, class148.field2230, class148.field2161);
        } else if (arg0 == 13) {
            class30.method144(class148.field2232, class148.field2233, class148.field2234);
        } else if (arg0 == 14) {
            class30.method144(class148.field2304, class148.field2184, class148.field2298);
        } else if (arg0 == 16) {
            class30.method144(class148.field2238, class148.field2239, class148.field2240);
        } else if (arg0 == 17) {
            class30.method144(class148.field2241, class148.field2268, class148.field2205);
        } else if (arg0 == 18) {
            class30.method144(class148.field2244, class148.field2245, class148.field2186);
        } else if (arg0 == 19) {
            class30.method144(class148.field2247, class148.field2248, class148.field2317);
        } else if (arg0 == 20) {
            class30.method144(class148.field2250, class148.field2251, class148.field2403);
        } else if (arg0 == 22) {
            class30.method144(class148.field2172, class148.field2254, class148.field2293);
        } else if (arg0 == 23) {
            class30.method144(class148.field2281, class148.field2292, class148.field2258);
        } else if (arg0 == 24) {
            class30.method144(class148.field2408, class148.field2402, class148.field2177);
        } else if (arg0 == 25) {
            class30.method144(class148.field2261, class148.field2263, class148.field2389);
        } else if (arg0 == 26) {
            class30.method144(class148.field2265, class148.field2222, class148.field2267);
        } else if (arg0 == 27) {
            class30.method144(class148.field2358, class148.field2269, class148.field2270);
        } else if (arg0 == 31) {
            class30.method144(class148.field2284, class148.field2278, class148.field2260);
        } else if (arg0 == 32) {
            class30.method144(class148.field2308, class148.field2392, class148.field2282);
        } else if (arg0 == 37) {
            class30.method144(class148.field2283, class148.field2296, class148.field2285);
        } else if (arg0 == 38) {
            class30.method144(class148.field2286, class148.field2287, class148.field2277);
        } else if (arg0 == 55) {
            class30.method144(class148.field2289, class148.field2290, class148.field2397);
        } else if (arg0 == 56) {
            class30.method144(class148.field2271, class148.field2417, class148.field2294);
            method154(11);
            return;
        } else if (arg0 == 57) {
            class30.method144(class148.field2162, class148.field2291, class148.field2297);
            method154(11);
            return;
        } else {
            class30.method144(class148.field2330, class148.field2299, class148.field2192);
        }
        method154(10);
    }

    @ObfuscatedName("fl.z(I)V")
    public static final void method2985() {
        if (Statics.field1915 != null) {
            Statics.field1915.method2606();
            Statics.field1915 = null;
        }
        method90();
        Statics.field191.method1616();
        for (int var0 = 0; var0 < 4; var0++) {
            field325[var0].method3641();
        }
        System.gc();
        class173.method581(2);
        field503 = -1;
        field504 = false;
        for (class22 var1 = (class22) class22.field577.method3309(); var1 != null; var1 = (class22) class22.field577.method3311()) {
            if (var1.field573 != null) {
                Statics.field1812.method983(var1.field573);
                var1.field573 = null;
            }
            if (var1.field578 != null) {
                Statics.field1812.method983(var1.field578);
                var1.field578 = null;
            }
        }
        class22.field577.method3303();
        method154(10);
    }

    @ObfuscatedName("m.x(I)V")
    public static final void method90() {
        class43.method543();
        class39.method48();
        class42.method508();
        class38.method130();
        class37.field811.method3246();
        class37.field812.method3246();
        class47.field1026.method3246();
        class47.field1017.method3246();
        class47.field1025.method3246();
        class40.field913.method3246();
        class40.field914.method3246();
        class41.method2458();
        class44.method3052();
        class48.method532();
        class169.field2762.method3246();
        class164.field2606.method3246();
        class164.field2728.method3246();
        class164.field2608.method3246();
        ((class90) Statics.field1481).method1876();
        class21.field551.method3246();
        Statics.field215.method2857();
        Statics.field247.method2857();
        Statics.field958.method2857();
        Statics.field236.method2857();
        Statics.field2973.method2857();
        Statics.field549.method2857();
        Statics.field193.method2857();
        Statics.field739.method2857();
        Statics.field2764.method2857();
        Statics.field532.method2857();
        Statics.field2558.method2857();
        Statics.field1875.method2857();
    }

    @ObfuscatedName("z.v(I)V")
    public static final void method489() {
        if (field520 > 0) {
            method2985();
        } else {
            method154(40);
            Statics.field957 = Statics.field1915;
            Statics.field1915 = null;
        }
    }

    @ObfuscatedName("m.i(I)V")
    public static final void method88() {
        if (field488 > 1) {
            field488--;
        }
        if (field520 > 0) {
            field520--;
        }
        if (field318) {
            field318 = false;
            method489();
            return;
        }
        if (!field409) {
            field415[0] = class148.field2390;
            field416[0] = "";
            field296[0] = 1006;
            field410 = 1;
        }
        for (int var0 = 0; var0 < 100 && method751(); var0++) {
        }
        if (field461 != 30) {
            return;
        }
        while (true) {
            class200 var1 = (class200) class201.field2975.method3355();
            boolean var2;
            if (var1 == null) {
                var2 = false;
            } else {
                var2 = true;
            }
            if (!var2) {
                Object var4 = Statics.field1258.field186;
                synchronized (Statics.field1258.field186) {
                    if (!field265) {
                        Statics.field1258.field187 = 0;
                    } else if (class132.field2000 != 0 || Statics.field1258.field187 >= 40) {
                        field521.method2396(43);
                        field521.method2133(0);
                        int var5 = field521.field1852;
                        int var6 = 0;
                        for (int var7 = 0; var7 < Statics.field1258.field187 && field521.field1852 - var5 < 240; var7++) {
                            var6++;
                            int var8 = Statics.field1258.field196[var7];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 502) {
                                var8 = 502;
                            }
                            int var9 = Statics.field1258.field188[var7];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 764) {
                                var9 = 764;
                            }
                            int var10 = var8 * 765 + var9;
                            if (Statics.field1258.field196[var7] == -1 && Statics.field1258.field188[var7] == -1) {
                                var9 = -1;
                                var8 = -1;
                                var10 = 524287;
                            }
                            if (field403 != var9 || field278 != var8) {
                                int var11 = var9 - field403;
                                field403 = var9;
                                int var12 = var8 - field278;
                                field278 = var8;
                                if (field279 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    field521.method2134((field279 << 12) + (var11 << 6) + var12);
                                    field279 = 0;
                                } else if (field279 < 8) {
                                    field521.method2135((field279 << 19) + 8388608 + var10);
                                    field279 = 0;
                                } else {
                                    field521.method2136((field279 << 19) + -1073741824 + var10);
                                    field279 = 0;
                                }
                            } else if (field279 < 2047) {
                                field279++;
                            }
                        }
                        field521.method2270(field521.field1852 - var5);
                        if (var6 >= Statics.field1258.field187) {
                            Statics.field1258.field187 = 0;
                        } else {
                            Statics.field1258.field187 -= var6;
                            for (int var13 = 0; var13 < Statics.field1258.field187; var13++) {
                                Statics.field1258.field188[var13] = Statics.field1258.field188[var6 + var13];
                                Statics.field1258.field196[var13] = Statics.field1258.field196[var6 + var13];
                            }
                        }
                    }
                }
                if (class132.field2000 == 1 || !Statics.field2976 && class132.field2000 == 4 || class132.field2000 == 2) {
                    long var15 = (class132.field2013 - field276 * -1L) / 50L;
                    if (var15 > 4095L) {
                        var15 = 4095L;
                    }
                    field276 = class132.field2013 * -1L;
                    int var17 = class132.field2010;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > 502) {
                        var17 = 502;
                    }
                    int var18 = class132.field2009;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > 764) {
                        var18 = 764;
                    }
                    int var19 = var17 * 765 + var18;
                    byte var20 = 0;
                    if (class132.field2000 == 2) {
                        var20 = 1;
                    }
                    int var21 = (int) var15;
                    field521.method2396(40);
                    field521.method2136((var20 << 19) + (var21 << 20) + var19);
                }
                if (class129.field1979 > 0) {
                    field521.method2396(93);
                    field521.method2134(0);
                    int var22 = field521.field1852;
                    long var23 = class107.method2434();
                    for (int var25 = 0; var25 < class129.field1979; var25++) {
                        long var26 = var23 - field491;
                        if (var26 > 16777215L) {
                            var26 = 16777215L;
                        }
                        field491 = var23;
                        field521.method2133(class129.field1978[var25]);
                        field521.method2135((int) var26);
                    }
                    field521.method2144(field521.field1852 - var22);
                }
                if (field355 > 0) {
                    field355--;
                }
                if (class129.field1956[96] || class129.field1956[97] || class129.field1956[98] || class129.field1956[99]) {
                    field292 = true;
                }
                if (field292 && field355 <= 0) {
                    field355 = 20;
                    field292 = false;
                    field521.method2396(81);
                    field521.method2206(field501);
                    field521.method2206(field350);
                }
                if (Statics.field2554 && !field266) {
                    field266 = true;
                    field521.method2396(109);
                    field521.method2133(1);
                }
                if (!Statics.field2554 && field266) {
                    field266 = false;
                    field521.method2396(109);
                    field521.method2133(0);
                }
                method96();
                if (field461 != 30) {
                    return;
                }
                method902();
                method157();
                field312++;
                if (field312 > 750) {
                    method489();
                    return;
                }
                method2487();
                for (int var28 = 0; var28 < field378; var28++) {
                    int var29 = field306[var28];
                    class32 var30 = field304[var29];
                    if (var30 != null) {
                        method138(var30, var30.field714.field815);
                    }
                }
                method494();
                field341++;
                if (field456 != 0) {
                    field374 += 20;
                    if (field374 >= 400) {
                        field456 = 0;
                    }
                }
                if (Statics.field119 != null) {
                    field376++;
                    if (field376 >= 15) {
                        method93(Statics.field119);
                        Statics.field119 = null;
                    }
                }
                class164 var31 = Statics.field537;
                class164 var32 = Statics.field138;
                Statics.field537 = null;
                Statics.field138 = null;
                field531 = null;
                field427 = false;
                field479 = false;
                field338 = 0;
                while (class129.method161() && field338 < 128) {
                    if (field435 >= 2 && class129.field1956[82] && Statics.field2751 == 66) {
                        String var33 = "";
                        Iterator var34 = class11.field157.iterator();
                        while (var34.hasNext()) {
                            class33 var35 = (class33) var34.next();
                            var33 = var33 + var35.field718 + ':' + var35.field720 + '\n';
                        }
                        Statics.field22.setContents(new StringSelection(var33), (ClipboardOwner) null);
                    } else {
                        field478[field338] = Statics.field2751;
                        field432[field338] = Statics.field666;
                        field338++;
                    }
                }
                int var38 = field428;
                if (class164.method29(var38)) {
                    Statics.method3013(Statics.field2686[var38], -1, 0, 0, 765, 503, 0, 0);
                }
                field452++;
                while (true) {
                    class1 var39;
                    class164 var40;
                    class164 var41;
                    do {
                        var39 = (class1) field469.method3307();
                        if (var39 == null) {
                            while (true) {
                                class1 var42;
                                class164 var43;
                                class164 var44;
                                do {
                                    var42 = (class1) field470.method3307();
                                    if (var42 == null) {
                                        while (true) {
                                            class1 var45;
                                            class164 var46;
                                            class164 var47;
                                            do {
                                                var45 = (class1) field468.method3307();
                                                if (var45 == null) {
                                                    method1979();
                                                    if (field440 != null) {
                                                        method3();
                                                    }
                                                    if (Statics.field2489 != null) {
                                                        method93(Statics.field2489);
                                                        field330++;
                                                        if (class132.field2003 == 0) {
                                                            if (field372) {
                                                                if (Statics.field54 == Statics.field2489 && field381 != field284) {
                                                                    class164 var48 = Statics.field2489;
                                                                    byte var49 = 0;
                                                                    if (field431 == 1 && var48.field2615 == 206) {
                                                                        var49 = 1;
                                                                    }
                                                                    if (var48.field2716[field381] <= 0) {
                                                                        var49 = 0;
                                                                    }
                                                                    int var50 = method1613(var48);
                                                                    boolean var51 = (var50 >> 29 & 0x1) != 0;
                                                                    if (var51) {
                                                                        int var52 = field284;
                                                                        int var53 = field381;
                                                                        var48.field2716[var53] = var48.field2716[var52];
                                                                        var48.field2717[var53] = var48.field2717[var52];
                                                                        var48.field2716[var52] = -1;
                                                                        var48.field2717[var52] = 0;
                                                                    } else if (var49 == 1) {
                                                                        int var54 = field284;
                                                                        int var55 = field381;
                                                                        while (var54 != var55) {
                                                                            if (var54 > var55) {
                                                                                var48.method2949(var54 - 1, var54);
                                                                                var54--;
                                                                            } else if (var54 < var55) {
                                                                                var48.method2949(var54 + 1, var54);
                                                                                var54++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var48.method2949(field381, field284);
                                                                    }
                                                                    field521.method2396(9);
                                                                    field521.method2173(var49);
                                                                    field521.method2180(field284);
                                                                    field521.method2136(Statics.field2489.field2697);
                                                                    field521.method2134(field381);
                                                                }
                                                            } else if ((field290 == 1 || method112(field410 - 1)) && field410 > 2) {
                                                                method95(field379, field380);
                                                            } else if (field410 > 0) {
                                                                method2777(field379, field380);
                                                            }
                                                            field376 = 10;
                                                            class132.field2000 = 0;
                                                            Statics.field2489 = null;
                                                        } else if (field330 >= 5 && (class132.field2011 > field379 + 5 || class132.field2011 < field379 - 5 || class132.field2005 * -322104283 > field380 + 5 || class132.field2005 * -322104283 < field380 - 5)) {
                                                            field372 = true;
                                                        }
                                                    }
                                                    if (class81.field1392 != -1) {
                                                        int var56 = class81.field1392;
                                                        int var57 = class81.field1393;
                                                        field521.method2396(214);
                                                        field521.method2133(5);
                                                        field521.method2180(Statics.field1280 + var56);
                                                        field521.method2163(class129.field1956[82] ? (class129.field1956[81] ? 2 : 1) : 0);
                                                        field521.method2134(Statics.field1910 + var57);
                                                        class81.field1392 = -1;
                                                        field527 = class132.field2009;
                                                        field373 = class132.field2010;
                                                        field456 = 1;
                                                        field374 = 0;
                                                        field499 = var56;
                                                        field500 = var57;
                                                    }
                                                    if (Statics.field537 != var31) {
                                                        if (var31 != null) {
                                                            method93(var31);
                                                        }
                                                        if (Statics.field537 != null) {
                                                            method93(Statics.field537);
                                                        }
                                                    }
                                                    if (Statics.field138 != var32 && field489 == field420) {
                                                        if (var32 != null) {
                                                            method93(var32);
                                                        }
                                                        if (Statics.field138 != null) {
                                                            method93(Statics.field138);
                                                        }
                                                    }
                                                    if (Statics.field138 == null) {
                                                        if (field489 > 0) {
                                                            field489--;
                                                        }
                                                    } else if (field489 < field420) {
                                                        field489++;
                                                        if (field489 == field420) {
                                                            method93(Statics.field138);
                                                        }
                                                    }
                                                    int var58 = field515 + Statics.field393.field754;
                                                    int var59 = field331 + Statics.field393.field787;
                                                    if (Statics.field1809 - var58 < -500 || Statics.field1809 - var58 > 500 || Statics.field192 - var59 < -500 || Statics.field192 - var59 > 500) {
                                                        Statics.field1809 = var58;
                                                        Statics.field192 = var59;
                                                    }
                                                    if (Statics.field1809 != var58) {
                                                        Statics.field1809 += (var58 - Statics.field1809) / 16;
                                                    }
                                                    if (Statics.field192 != var59) {
                                                        Statics.field192 += (var59 - Statics.field192) / 16;
                                                    }
                                                    if (class132.field2003 == 4 && Statics.field2976) {
                                                        int var60 = class132.field2005 * -322104283 - field354 * -322104283;
                                                        field442 = var60 * 2;
                                                        field354 = (var60 == -1 || var60 == 1 ? class132.field2005 * -322104283 : (field354 * -322104283 + class132.field2005 * -322104283) / 2) * -930289747;
                                                        int var61 = field353 - class132.field2011;
                                                        field458 = var61 * 2;
                                                        field353 = var61 == -1 || var61 == 1 ? class132.field2011 : (field353 + class132.field2011) / 2;
                                                    } else {
                                                        if (class129.field1956[96]) {
                                                            field458 += (-24 - field458) / 2;
                                                        } else if (class129.field1956[97]) {
                                                            field458 += (24 - field458) / 2;
                                                        } else {
                                                            field458 /= 2;
                                                        }
                                                        if (class129.field1956[98]) {
                                                            field442 += (12 - field442) / 2;
                                                        } else if (class129.field1956[99]) {
                                                            field442 += (-12 - field442) / 2;
                                                        } else {
                                                            field442 /= 2;
                                                        }
                                                        field354 = class132.field2005;
                                                        field353 = class132.field2011;
                                                    }
                                                    field350 = field458 / 2 + field350 & 0x7FF;
                                                    field501 += field442 / 2;
                                                    if (field501 < 128) {
                                                        field501 = 128;
                                                    }
                                                    if (field501 > 383) {
                                                        field501 = 383;
                                                    }
                                                    int var62 = Statics.field1809 >> 7;
                                                    int var63 = Statics.field192 >> 7;
                                                    int var64 = method836(Statics.field1809, Statics.field192, Statics.field2988);
                                                    int var65 = 0;
                                                    if (var62 > 3 && var63 > 3 && var62 < 100 && var63 < 100) {
                                                        for (int var66 = var62 - 4; var66 <= var62 + 4; var66++) {
                                                            for (int var67 = var63 - 4; var67 <= var63 + 4; var67++) {
                                                                int var68 = Statics.field2988;
                                                                if (var68 < 3 && (class6.field73[1][var66][var67] & 0x2) == 2) {
                                                                    var68++;
                                                                }
                                                                int var69 = var64 - class6.field77[var68][var66][var67];
                                                                if (var69 > var65) {
                                                                    var65 = var69;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var70 = var65 * 192;
                                                    if (var70 > 98048) {
                                                        var70 = 98048;
                                                    }
                                                    if (var70 < 32768) {
                                                        var70 = 32768;
                                                    }
                                                    if (var70 > field357) {
                                                        field357 += (var70 - field357) / 24;
                                                    } else if (var70 < field357) {
                                                        field357 += (var70 - field357) / 80;
                                                    }
                                                    if (field497) {
                                                        method3578();
                                                    }
                                                    for (int var71 = 0; var71 < 5; var71++) {
                                                        int var10002 = field332[var71]++;
                                                    }
                                                    int var72 = ++class132.field1999 - 1;
                                                    int var74 = class129.field1983;
                                                    if (var72 > 15000 && var74 > 15000) {
                                                        field520 = 250;
                                                        class132.method2550(14500);
                                                        field521.method2396(252);
                                                    }
                                                    field444++;
                                                    if (field444 > 500) {
                                                        field444 = 0;
                                                        int var76 = (int) (Math.random() * 8.0D);
                                                        if ((var76 & 0x1) == 1) {
                                                            field515 += field495;
                                                        }
                                                        if ((var76 & 0x2) == 2) {
                                                            field331 += field343;
                                                        }
                                                        if ((var76 & 0x4) == 4) {
                                                            field333 += field334;
                                                        }
                                                    }
                                                    if (field515 < -50) {
                                                        field495 = 2;
                                                    }
                                                    if (field515 > 50) {
                                                        field495 = -2;
                                                    }
                                                    if (field331 < -55) {
                                                        field343 = 2;
                                                    }
                                                    if (field331 > 55) {
                                                        field343 = -2;
                                                    }
                                                    if (field333 < -40) {
                                                        field334 = 1;
                                                    }
                                                    if (field333 > 40) {
                                                        field334 = -1;
                                                    }
                                                    field340++;
                                                    if (field340 > 500) {
                                                        field340 = 0;
                                                        int var77 = (int) (Math.random() * 8.0D);
                                                        if ((var77 & 0x1) == 1) {
                                                            field336 += field457;
                                                        }
                                                        if ((var77 & 0x2) == 2) {
                                                            field402 += field339;
                                                        }
                                                    }
                                                    if (field336 < -60) {
                                                        field457 = 2;
                                                    }
                                                    if (field336 > 60) {
                                                        field457 = -2;
                                                    }
                                                    if (field402 < -20) {
                                                        field339 = 1;
                                                    }
                                                    if (field402 > 10) {
                                                        field339 = -1;
                                                    }
                                                    for (class36 var78 = (class36) field301.method3263(); var78 != null; var78 = (class36) field301.method3272()) {
                                                        if ((long) var78.field809 < class107.method2434() / 1000L - 5L) {
                                                            if (var78.field804 > 0) {
                                                                class11.method3012(5, "", var78.field803 + class148.field2301);
                                                            }
                                                            if (var78.field804 == 0) {
                                                                class11.method3012(5, "", var78.field803 + class148.field2302);
                                                            }
                                                            var78.method3396();
                                                        }
                                                    }
                                                    field313++;
                                                    if (field313 > 50) {
                                                        field521.method2396(223);
                                                    }
                                                    try {
                                                        if (Statics.field1915 != null && field521.field1852 > 0) {
                                                            Statics.field1915.method2593(field521.field1859, 0, field521.field1852);
                                                            field521.field1852 = 0;
                                                            field313 = 0;
                                                        }
                                                    } catch (IOException var80) {
                                                        method489();
                                                    }
                                                    return;
                                                }
                                                var46 = var45.field7;
                                                if (var46.field2612 < 0) {
                                                    break;
                                                }
                                                var47 = class164.method619(var46.field2651);
                                            } while (var47 == null || var47.field2722 == null || var46.field2612 >= var47.field2722.length || var47.field2722[var46.field2612] != var46);
                                            class34.method2699(var45);
                                        }
                                    }
                                    var43 = var42.field7;
                                    if (var43.field2612 < 0) {
                                        break;
                                    }
                                    var44 = class164.method619(var43.field2651);
                                } while (var44 == null || var44.field2722 == null || var43.field2612 >= var44.field2722.length || var44.field2722[var43.field2612] != var43);
                                class34.method2699(var42);
                            }
                        }
                        var40 = var39.field7;
                        if (var40.field2612 < 0) {
                            break;
                        }
                        var41 = class164.method619(var40.field2651);
                    } while (var41 == null || var41.field2722 == null || var40.field2612 >= var41.field2722.length || var41.field2722[var40.field2612] != var40);
                    class34.method2699(var39);
                }
            }
            field521.method2396(91);
            field521.method2133(0);
            int var3 = field521.field1852;
            class201.method1422(field521);
            field521.method2270(field521.field1852 - var3);
        }
    }

    @ObfuscatedName("y.r(B)V")
    public static final void method157() {
        for (int var0 = 0; var0 < field507; var0++) {
            int var10002 = field510[var0]--;
            if (field510[var0] >= -10) {
                class54 var2 = field356[var0];
                if (var2 == null) {
                    class54 var10000 = (class54) null;
                    var2 = class54.method1050(Statics.field236, field508[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field510[var0] += var2.method1044();
                    field356[var0] = var2;
                }
                if (field510[var0] < 0) {
                    int var9;
                    if (field511[var0] == 0) {
                        var9 = field505;
                    } else {
                        int var3 = (field511[var0] & 0xFF) * 128;
                        int var4 = field511[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field393.field754;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field511[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field393.field787;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field510[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field352 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class58 var10 = var2.method1043().method1079(Statics.field1100);
                        class60 var11 = class60.method1106(var10, 100, var9);
                        var11.method1192(field509[var0] - 1);
                        Statics.field1812.method990(var11);
                    }
                    field510[var0] = -100;
                }
            } else {
                field507--;
                for (int var1 = var0; var1 < field507; var1++) {
                    field508[var1] = field508[var1 + 1];
                    field356[var1] = field356[var1 + 1];
                    field509[var1] = field509[var1 + 1];
                    field510[var1] = field510[var1 + 1];
                    field511[var1] = field511[var1 + 1];
                }
                var0--;
            }
        }
        if (field504 && !class173.method2077()) {
            if (field502 != 0 && field503 != -1) {
                class173.method35(Statics.field549, field503, 0, field502, false);
            }
            field504 = false;
        }
    }

    @ObfuscatedName("db.an(Las;IIII)V")
    public static void method2090(class40 arg0, int arg1, int arg2, int arg3) {
        if (field507 >= 50 || field352 == 0 || arg0.field918 == null || arg1 >= arg0.field918.length) {
            return;
        }
        int var4 = arg0.field918[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field508[field507] = var5;
        field509[field507] = var6;
        field510[field507] = 0;
        field356[field507] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field511[field507] = (var8 << 16) + (var9 << 8) + var7;
        field507++;
    }

    @ObfuscatedName("ev.ad(IIIB)V")
    public static void method2709(int arg0, int arg1, int arg2) {
        if (field505 == 0 || arg1 == 0 || field507 >= 50) {
            return;
        }
        field508[field507] = arg0;
        field509[field507] = arg1;
        field510[field507] = arg2;
        field356[field507] = null;
        field511[field507] = 0;
        field507++;
    }

    @ObfuscatedName("m.ai(I)V")
    public static final void method96() {
        if (field271 && Statics.field2988 != field425) {
            method2088(Statics.field2143, Statics.field1659, Statics.field2988, Statics.field393.field795[0], Statics.field393.field796[0]);
        } else if (Statics.field2988 != field413) {
            field413 = Statics.field2988;
            method493(Statics.field2988);
        }
    }

    @ObfuscatedName("u.ae(IIB)V")
    public static final void method133(int arg0, int arg1) {
        if (field298 != 0 && field298 != 3 || class132.field2000 != 1 && Statics.field2976 || class132.field2000 != 4) {
            return;
        }
        int var2 = class132.field2009 - 25 - arg0;
        int var3 = class132.field2010 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        if (var2 >= 0 && var2 <= 23 && var3 >= 117 && var3 <= 142) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field350 + field336 & 0x7FF;
        int var5 = class86.field1480[var4];
        int var6 = class86.field1464[var4];
        int var7 = (field402 + 256) * var5 >> 8;
        int var8 = (field402 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field393.field754 + var9 >> 7;
        int var12 = Statics.field393.field787 - var10 >> 7;
        field521.method2396(205);
        field521.method2133(18);
        field521.method2180(Statics.field1280 + var11);
        field521.method2163(class129.field1956[82] ? (class129.field1956[81] ? 2 : 1) : 0);
        field521.method2134(Statics.field1910 + var12);
        field521.method2133(var2);
        field521.method2133(var3);
        field521.method2134(field350);
        field521.method2133(57);
        field521.method2133(field336);
        field521.method2133(field402);
        field521.method2133(89);
        field521.method2134(Statics.field393.field754);
        field521.method2134(Statics.field393.field787);
        field521.method2133(63);
        field499 = var11;
        field500 = var12;
    }

    @ObfuscatedName("z.aq(I)V")
    public static final void method494() {
        for (int var0 = -1; var0 < field386; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field387[var0];
            }
            class3 var2 = field385[var1];
            if (var2 != null && var2.field756 > 0) {
                var2.field756--;
                if (var2.field756 == 0) {
                    var2.field753 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field378; var3++) {
            int var4 = field306[var3];
            class32 var5 = field304[var4];
            if (var5 != null && var5.field756 > 0) {
                var5.field756--;
                if (var5.field756 == 0) {
                    var5.field753 = null;
                }
            }
        }
    }

    @ObfuscatedName("hb.av(I)V")
    public static final void method3578() {
        int var0 = Statics.field1273 * 128 + 64;
        int var1 = Statics.field294 * 128 + 64;
        int var2 = method836(var0, var1, Statics.field2988) - Statics.field1942;
        if (Statics.field2550 < var0) {
            Statics.field2550 += Statics.field1278 * (var0 - Statics.field2550) / 1000 + Statics.field1259;
            if (Statics.field2550 > var0) {
                Statics.field2550 = var0;
            }
        }
        if (Statics.field2550 > var0) {
            Statics.field2550 -= Statics.field1278 * (Statics.field2550 - var0) / 1000 + Statics.field1259;
            if (Statics.field2550 < var0) {
                Statics.field2550 = var0;
            }
        }
        if (Statics.field165 < var2) {
            Statics.field165 += Statics.field1278 * (var2 - Statics.field165) / 1000 + Statics.field1259;
            if (Statics.field165 > var2) {
                Statics.field165 = var2;
            }
        }
        if (Statics.field165 > var2) {
            Statics.field165 -= Statics.field1278 * (Statics.field165 - var2) / 1000 + Statics.field1259;
            if (Statics.field165 < var2) {
                Statics.field165 = var2;
            }
        }
        if (Statics.field1904 < var1) {
            Statics.field1904 += Statics.field1278 * (var1 - Statics.field1904) / 1000 + Statics.field1259;
            if (Statics.field1904 > var1) {
                Statics.field1904 = var1;
            }
        }
        if (Statics.field1904 > var1) {
            Statics.field1904 -= Statics.field1278 * (Statics.field1904 - var1) / 1000 + Statics.field1259;
            if (Statics.field1904 < var1) {
                Statics.field1904 = var1;
            }
        }
        int var3 = Statics.field3005 * 128 + 64;
        int var4 = Statics.field143 * 128 + 64;
        int var5 = method836(var3, var4, Statics.field2988) - Statics.field806;
        int var6 = var3 - Statics.field2550;
        int var7 = var5 - Statics.field165;
        int var8 = var4 - Statics.field1904;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1260 < var10) {
            Statics.field1260 += Statics.field2896 * (var10 - Statics.field1260) / 1000 + Statics.field1805;
            if (Statics.field1260 > var10) {
                Statics.field1260 = var10;
            }
        }
        if (Statics.field1260 > var10) {
            Statics.field1260 -= Statics.field2896 * (Statics.field1260 - var10) / 1000 + Statics.field1805;
            if (Statics.field1260 < var10) {
                Statics.field1260 = var10;
            }
        }
        int var12 = var11 - Statics.field348;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field348 += Statics.field2896 * var12 / 1000 + Statics.field1805;
            Statics.field348 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field348 -= Statics.field2896 * -var12 / 1000 + Statics.field1805;
            Statics.field348 &= 0x7FF;
        }
        int var13 = var11 - Statics.field348;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field348 = var11;
        }
    }

    @ObfuscatedName("dd.am(B)V")
    public static final void method2487() {
        for (int var0 = -1; var0 < field386; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field387[var0];
            }
            class3 var2 = field385[var1];
            if (var2 != null) {
                method138(var2, 1);
            }
        }
    }

    @ObfuscatedName("g.ac(Lak;II)V")
    public static final void method138(class35 arg0, int arg1) {
        if (arg0.field786 > field275) {
            method2706(arg0);
        } else if (arg0.field752 >= field275) {
            if (field275 == arg0.field752 || arg0.field783 == -1 || arg0.field789 != 0 || arg0.field780 + 1 > class40.method575(arg0.field783).field917[arg0.field773]) {
                int var2 = arg0.field752 - arg0.field786;
                int var3 = field275 - arg0.field786;
                int var4 = arg0.field782 * 128 + arg0.field744 * 64;
                int var5 = arg0.field784 * 128 + arg0.field744 * 64;
                int var6 = arg0.field791 * 128 + arg0.field744 * 64;
                int var7 = arg0.field785 * 128 + arg0.field744 * 64;
                arg0.field754 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field787 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field798 = 0;
            if (arg0.field788 == 0) {
                arg0.field740 = 1024;
            }
            if (arg0.field788 == 1) {
                arg0.field740 = 1536;
            }
            if (arg0.field788 == 2) {
                arg0.field740 = 0;
            }
            if (arg0.field788 == 3) {
                arg0.field740 = 512;
            }
            arg0.field769 = arg0.field740;
        } else {
            arg0.field774 = arg0.field745;
            if (arg0.field794 == 0) {
                arg0.field798 = 0;
            } else {
                label343: {
                    if (arg0.field783 != -1 && arg0.field789 == 0) {
                        class40 var8 = class40.method575(arg0.field783);
                        if (arg0.field799 > 0 && var8.field916 == 0) {
                            arg0.field798++;
                            break label343;
                        }
                        if (arg0.field799 <= 0 && var8.field932 == 0) {
                            arg0.field798++;
                            break label343;
                        }
                    }
                    int var9 = arg0.field754;
                    int var10 = arg0.field787;
                    int var11 = arg0.field795[arg0.field794 - 1] * 128 + arg0.field744 * 64;
                    int var12 = arg0.field796[arg0.field794 - 1] * 128 + arg0.field744 * 64;
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        if (var9 < var11) {
                            if (var10 < var12) {
                                arg0.field740 = 1280;
                            } else if (var10 > var12) {
                                arg0.field740 = 1792;
                            } else {
                                arg0.field740 = 1536;
                            }
                        } else if (var9 > var11) {
                            if (var10 < var12) {
                                arg0.field740 = 768;
                            } else if (var10 > var12) {
                                arg0.field740 = 256;
                            } else {
                                arg0.field740 = 512;
                            }
                        } else if (var10 < var12) {
                            arg0.field740 = 1024;
                        } else if (var10 > var12) {
                            arg0.field740 = 0;
                        }
                        int var13 = arg0.field740 - arg0.field769 & 0x7FF;
                        if (var13 > 1024) {
                            var13 -= 2048;
                        }
                        int var14 = arg0.field749;
                        if (var13 >= -256 && var13 <= 256) {
                            var14 = arg0.field748;
                        } else if (var13 >= 256 && var13 < 768) {
                            var14 = arg0.field800;
                        } else if (var13 >= -768 && var13 <= -256) {
                            var14 = arg0.field750;
                        }
                        if (var14 == -1) {
                            var14 = arg0.field748;
                        }
                        arg0.field774 = var14;
                        int var15 = 4;
                        boolean var16 = true;
                        if (arg0 instanceof class32) {
                            var16 = ((class32) arg0).field714.field843;
                        }
                        if (var16) {
                            if (arg0.field769 != arg0.field740 && arg0.field797 == -1 && arg0.field793 != 0) {
                                var15 = 2;
                            }
                            if (arg0.field794 > 2) {
                                var15 = 6;
                            }
                            if (arg0.field794 > 3) {
                                var15 = 8;
                            }
                            if (arg0.field798 > 0 && arg0.field794 > 1) {
                                var15 = 8;
                                arg0.field798--;
                            }
                        } else {
                            if (arg0.field794 > 1) {
                                var15 = 6;
                            }
                            if (arg0.field794 > 2) {
                                var15 = 8;
                            }
                            if (arg0.field798 > 0 && arg0.field794 > 1) {
                                var15 = 8;
                                arg0.field798--;
                            }
                        }
                        if (arg0.field766[arg0.field794 - 1]) {
                            var15 <<= 0x1;
                        }
                        if (var15 >= 8 && arg0.field774 == arg0.field748 && arg0.field742 != -1) {
                            arg0.field774 = arg0.field742;
                        }
                        if (var9 < var11) {
                            arg0.field754 += var15;
                            if (arg0.field754 > var11) {
                                arg0.field754 = var11;
                            }
                        } else if (var9 > var11) {
                            arg0.field754 -= var15;
                            if (arg0.field754 < var11) {
                                arg0.field754 = var11;
                            }
                        }
                        if (var10 < var12) {
                            arg0.field787 += var15;
                            if (arg0.field787 > var12) {
                                arg0.field787 = var12;
                            }
                        } else if (var10 > var12) {
                            arg0.field787 -= var15;
                            if (arg0.field787 < var12) {
                                arg0.field787 = var12;
                            }
                        }
                        if (arg0.field754 == var11 && arg0.field787 == var12) {
                            arg0.field794--;
                            if (arg0.field799 > 0) {
                                arg0.field799--;
                            }
                        }
                    } else {
                        arg0.field754 = var11;
                        arg0.field787 = var12;
                    }
                }
            }
        }
        if (arg0.field754 < 128 || arg0.field787 < 128 || arg0.field754 >= 13184 || arg0.field787 >= 13184) {
            arg0.field783 = -1;
            arg0.field777 = -1;
            arg0.field786 = 0;
            arg0.field752 = 0;
            arg0.field754 = arg0.field795[0] * 128 + arg0.field744 * 64;
            arg0.field787 = arg0.field796[0] * 128 + arg0.field744 * 64;
            arg0.method605();
        }
        if (Statics.field393 == arg0 && (arg0.field754 < 1536 || arg0.field787 < 1536 || arg0.field754 >= 11776 || arg0.field787 >= 11776)) {
            arg0.field783 = -1;
            arg0.field777 = -1;
            arg0.field786 = 0;
            arg0.field752 = 0;
            arg0.field754 = arg0.field795[0] * 128 + arg0.field744 * 64;
            arg0.field787 = arg0.field796[0] * 128 + arg0.field744 * 64;
            arg0.method605();
        }
        method159(arg0);
        arg0.field743 = false;
        if (arg0.field774 != -1) {
            class40 var17 = class40.method575(arg0.field774);
            if (var17 == null || var17.field915 == null) {
                arg0.field774 = -1;
            } else {
                arg0.field771++;
                if (arg0.field770 < var17.field915.length && arg0.field771 > var17.field917[arg0.field770]) {
                    arg0.field771 = 1;
                    arg0.field770++;
                    method2090(var17, arg0.field770, arg0.field754, arg0.field787);
                }
                if (arg0.field770 >= var17.field915.length) {
                    arg0.field771 = 0;
                    arg0.field770 = 0;
                    method2090(var17, arg0.field770, arg0.field754, arg0.field787);
                }
            }
        }
        if (arg0.field777 != -1 && field275 >= arg0.field760) {
            if (arg0.field778 < 0) {
                arg0.field778 = 0;
            }
            int var18 = class41.method535(arg0.field777).field950;
            if (var18 == -1) {
                arg0.field777 = -1;
            } else {
                class40 var19 = class40.method575(var18);
                if (var19 == null || var19.field915 == null) {
                    arg0.field777 = -1;
                } else {
                    arg0.field779++;
                    if (arg0.field778 < var19.field915.length && arg0.field779 > var19.field917[arg0.field778]) {
                        arg0.field779 = 1;
                        arg0.field778++;
                        method2090(var19, arg0.field778, arg0.field754, arg0.field787);
                    }
                    if (arg0.field778 >= var19.field915.length && (arg0.field778 < 0 || arg0.field778 >= var19.field915.length)) {
                        arg0.field777 = -1;
                    }
                }
            }
        }
        if (arg0.field783 != -1 && arg0.field789 <= 1) {
            class40 var20 = class40.method575(arg0.field783);
            if (var20.field916 == 1 && arg0.field799 > 0 && arg0.field786 <= field275 && arg0.field752 < field275) {
                arg0.field789 = 1;
                return;
            }
        }
        if (arg0.field783 != -1 && arg0.field789 == 0) {
            class40 var21 = class40.method575(arg0.field783);
            if (var21 == null || var21.field915 == null) {
                arg0.field783 = -1;
            } else {
                arg0.field780++;
                if (arg0.field773 < var21.field915.length && arg0.field780 > var21.field917[arg0.field773]) {
                    arg0.field780 = 1;
                    arg0.field773++;
                    method2090(var21, arg0.field773, arg0.field754, arg0.field787);
                }
                if (arg0.field773 >= var21.field915.length) {
                    arg0.field773 -= var21.field919;
                    arg0.field776++;
                    if (arg0.field776 >= var21.field926) {
                        arg0.field783 = -1;
                    } else if (arg0.field773 >= 0 && arg0.field773 < var21.field915.length) {
                        method2090(var21, arg0.field773, arg0.field754, arg0.field787);
                    } else {
                        arg0.field783 = -1;
                    }
                }
                arg0.field743 = var21.field911;
            }
        }
        if (arg0.field789 > 0) {
            arg0.field789--;
        }
    }

    @ObfuscatedName("eu.ak(Lak;I)V")
    public static final void method2706(class35 arg0) {
        int var1 = arg0.field786 - field275;
        int var2 = arg0.field782 * 128 + arg0.field744 * 64;
        int var3 = arg0.field784 * 128 + arg0.field744 * 64;
        arg0.field754 += (var2 - arg0.field754) / var1;
        arg0.field787 += (var3 - arg0.field787) / var1;
        arg0.field798 = 0;
        if (arg0.field788 == 0) {
            arg0.field740 = 1024;
        }
        if (arg0.field788 == 1) {
            arg0.field740 = 1536;
        }
        if (arg0.field788 == 2) {
            arg0.field740 = 0;
        }
        if (arg0.field788 == 3) {
            arg0.field740 = 512;
        }
    }

    @ObfuscatedName("d.aa(Lak;I)V")
    public static final void method159(class35 arg0) {
        if (arg0.field793 == 0) {
            return;
        }
        if (arg0.field797 != -1 && arg0.field797 < 32768) {
            class32 var1 = field304[arg0.field797];
            if (var1 != null) {
                int var2 = arg0.field754 - var1.field754;
                int var3 = arg0.field787 - var1.field787;
                if (var2 != 0 || var3 != 0) {
                    arg0.field740 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field797 >= 32768) {
            int var4 = arg0.field797 - 32768;
            if (field391 == var4) {
                var4 = 2047;
            }
            class3 var5 = field385[var4];
            if (var5 != null) {
                int var6 = arg0.field754 - var5.field754;
                int var7 = arg0.field787 - var5.field787;
                if (var6 != 0 || var7 != 0) {
                    arg0.field740 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field767 != 0 || arg0.field768 != 0) && (arg0.field794 == 0 || arg0.field798 > 0)) {
            int var8 = arg0.field754 - (arg0.field767 * 64 - Statics.field1280 * 64 - Statics.field1280 * 64);
            int var9 = arg0.field787 - (arg0.field768 * 64 - Statics.field1910 * 64 - Statics.field1910 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field740 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field767 = 0;
            arg0.field768 = 0;
        }
        int var10 = arg0.field740 - arg0.field769 & 0x7FF;
        if (var10 == 0) {
            arg0.field792 = 0;
            return;
        }
        arg0.field792++;
        if (var10 > 1024) {
            arg0.field769 -= arg0.field793;
            boolean var11 = true;
            if (var10 < arg0.field793 || var10 > 2048 - arg0.field793) {
                arg0.field769 = arg0.field740;
                var11 = false;
            }
            if (arg0.field774 == arg0.field745 && (arg0.field792 > 25 || var11)) {
                if (arg0.field746 == -1) {
                    arg0.field774 = arg0.field748;
                } else {
                    arg0.field774 = arg0.field746;
                }
            }
        } else {
            arg0.field769 += arg0.field793;
            boolean var12 = true;
            if (var10 < arg0.field793 || var10 > 2048 - arg0.field793) {
                arg0.field769 = arg0.field740;
                var12 = false;
            }
            if (arg0.field774 == arg0.field745 && (arg0.field792 > 25 || var12)) {
                if (arg0.field747 == -1) {
                    arg0.field774 = arg0.field748;
                } else {
                    arg0.field774 = arg0.field747;
                }
            }
        }
        arg0.field769 &= 0x7FF;
    }

    @ObfuscatedName("cq.al(Lh;III)V")
    public static void method1614(class3 arg0, int arg1, int arg2) {
        if (arg0.field783 == arg1 && arg1 != -1) {
            int var3 = class40.method575(arg1).field928;
            if (var3 == 1) {
                arg0.field773 = 0;
                arg0.field780 = 0;
                arg0.field789 = arg2;
                arg0.field776 = 0;
            }
            if (var3 == 2) {
                arg0.field776 = 0;
            }
        } else if (arg1 == -1 || arg0.field783 == -1 || class40.method575(arg1).field922 >= class40.method575(arg0.field783).field922) {
            arg0.field783 = arg1;
            arg0.field773 = 0;
            arg0.field780 = 0;
            arg0.field789 = arg2;
            arg0.field776 = 0;
            arg0.field799 = arg0.field794;
        }
    }

    @ObfuscatedName("s.ao(I)V")
    public static final void method9() {
        if (field428 != -1) {
            int var0 = field428;
            if (class164.method29(var0)) {
                method89(Statics.field2686[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field472; var1++) {
            if (field474[var1]) {
                field475[var1] = true;
            }
            field476[var1] = field474[var1];
            field474[var1] = false;
        }
        field473 = field275;
        field417 = -1;
        field329 = -1;
        Statics.field54 = null;
        if (field428 != -1) {
            field472 = 0;
            method3236(field428, 0, 0, 765, 503, 0, 0, -1);
        }
        class75.method1529();
        if (field409) {
            method472();
        } else if (field417 != -1) {
            int var2 = field417;
            int var3 = field329;
            if (field410 >= 2 || field316 != 0 || field300) {
                String var4;
                if (field316 == 1 && field410 < 2) {
                    var4 = class148.field2346 + class148.field2314 + field422 + " " + class2.field14;
                } else if (field300 && field410 < 2) {
                    var4 = field277 + class148.field2314 + field446 + " " + class2.field14;
                } else {
                    int var5 = field410 - 1;
                    String var6;
                    if (field416[var5].length() > 0) {
                        var6 = field415[var5] + class148.field2314 + field416[var5];
                    } else {
                        var6 = field415[var5];
                    }
                    var4 = var6;
                }
                if (field410 > 2) {
                    var4 = var4 + class2.method773(16777215) + " " + '/' + " " + (field410 - 2) + class148.field2411;
                }
                Statics.field546.method3507(var4, var2 + 4, var3 + 15, 16777215, 0, field275 / 1000);
            }
        }
        if (field268 == 3) {
            for (int var7 = 0; var7 < field472; var7++) {
                if (field476[var7]) {
                    class75.method1535(field421[var7], field407[var7], field418[var7], field480[var7], 16711935, 128);
                } else if (field475[var7]) {
                    class75.method1535(field421[var7], field407[var7], field418[var7], field480[var7], 16711680, 128);
                }
            }
        }
        class22.method1062(Statics.field2988, Statics.field393.field754, Statics.field393.field787, field341);
        field341 = 0;
    }

    @ObfuscatedName("ei.af(Ljava/lang/String;ZB)V")
    public static final void method2584(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field649.method3497(arg0, 250);
        int var6 = Statics.field649.method3498(arg0, 250) * 13;
        class75.method1567(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class75.method1538(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field649.method3503(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2091(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1563.getGraphics();
                Statics.field2050.method1357(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1563.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field472; var13++) {
            if (field421[var13] + field418[var13] > var9 && field421[var13] < var9 + var11 && field480[var13] + field407[var13] > var10 && field407[var13] < var10 + var12) {
                field475[var13] = true;
            }
        }
    }

    @ObfuscatedName("cg.as(Laq;I)V")
    public static final void method1868(class31 arg0) {
        if (Statics.field393.field754 >> 7 == field499 && Statics.field393.field787 >> 7 == field500) {
            field499 = 0;
        }
        int var1 = field386;
        if (class31.field704 == arg0 || class31.field697 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class31.field704 == arg0) {
                var3 = Statics.field393;
                var4 = 33538048;
            } else if (class31.field697 == arg0) {
                var3 = field385[field263];
                var4 = field263 << 14;
            } else {
                var3 = field385[field387[var2]];
                var4 = field387[var2] << 14;
                if (class31.field699 == arg0 && field263 == field387[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method15() && !var3.field47) {
                var3.field45 = false;
                if ((field271 && field386 > 50 || field386 > 200) && class31.field704 != arg0 && var3.field774 == var3.field745) {
                    var3.field45 = true;
                }
                int var5 = var3.field754 >> 7;
                int var6 = var3.field787 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field40 == null || field275 < var3.field35 || field275 >= var3.field36) {
                        if ((var3.field754 & 0x7F) == 64 && (var3.field787 & 0x7F) == 64) {
                            if (field369 == field518[var5][var6]) {
                                continue;
                            }
                            field518[var5][var6] = field369;
                        }
                        var3.field34 = method836(var3.field754, var3.field787, Statics.field2988);
                        Statics.field191.method1627(Statics.field2988, var3.field754, var3.field787, var3.field34, 60, var3, var3.field769, var4, var3.field743);
                    } else {
                        var3.field45 = false;
                        var3.field34 = method836(var3.field754, var3.field787, Statics.field2988);
                        Statics.field191.method1628(Statics.field2988, var3.field754, var3.field787, var3.field34, 60, var3, var3.field769, var4, var3.field48, var3.field42, var3.field43, var3.field44);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ar.ab(ZI)V")
    public static final void method901(boolean arg0) {
        for (int var1 = 0; var1 < field378; var1++) {
            class32 var2 = field304[field306[var1]];
            int var3 = (field306[var1] << 14) + 536870912;
            if (var2 != null && var2.method15() && var2.field714.field834 == arg0 && var2.field714.method638()) {
                int var4 = var2.field754 >> 7;
                int var5 = var2.field787 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field744 == 1 && (var2.field754 & 0x7F) == 64 && (var2.field787 & 0x7F) == 64) {
                        if (field369 == field518[var4][var5]) {
                            continue;
                        }
                        field518[var4][var5] = field369;
                    }
                    if (!var2.field714.field842) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field191.method1627(Statics.field2988, var2.field754, var2.field787, method836(var2.field754 + (var2.field744 * 64 - 64), var2.field787 + (var2.field744 * 64 - 64), Statics.field2988), var2.field744 * 64 - 64 + 60, var2, var2.field769, var3, var2.field743);
                }
            }
        }
    }

    @ObfuscatedName("dc.ay(I)V")
    public static final void method2446() {
        for (class7 var0 = (class7) field486.method3309(); var0 != null; var0 = (class7) field486.method3311()) {
            if (Statics.field2988 != var0.field124 || field275 > var0.field98) {
                var0.method3404();
            } else if (field275 >= var0.field104) {
                if (var0.field101 > 0) {
                    class32 var1 = field304[var0.field101 - 1];
                    if (var1 != null && var1.field754 >= 0 && var1.field754 < 13312 && var1.field787 >= 0 && var1.field787 < 13312) {
                        var0.method84(var1.field754, var1.field787, method836(var1.field754, var1.field787, var0.field124) - var0.field121, field275);
                    }
                }
                if (var0.field101 < 0) {
                    int var2 = -var0.field101 - 1;
                    class3 var3;
                    if (field391 == var2) {
                        var3 = Statics.field393;
                    } else {
                        var3 = field385[var2];
                    }
                    if (var3 != null && var3.field754 >= 0 && var3.field754 < 13312 && var3.field787 >= 0 && var3.field787 < 13312) {
                        var0.method84(var3.field754, var3.field787, method836(var3.field754, var3.field787, var0.field124) - var0.field121, field275);
                    }
                }
                var0.method81(field341);
                Statics.field191.method1627(Statics.field2988, (int) var0.field106, (int) var0.field107, (int) var0.field97, 60, var0, var0.field116, -1, false);
            }
        }
    }

    @ObfuscatedName("e.ax(III)V")
    public static final void method31(int arg0, int arg1) {
        if (field283 == 2) {
            method577((field286 - Statics.field1280 << 7) + field289, (field287 - Statics.field1910 << 7) + field448, field288 * 2);
            if (field445 > -1 && field275 % 20 < 10) {
                Statics.field701[0].method1445(field445 + arg0 - 12, field406 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("g.ap(I)V")
    public static final void method147() {
        field477 = 0;
        int var0 = (Statics.field393.field754 >> 7) + Statics.field1280;
        int var1 = (Statics.field393.field787 >> 7) + Statics.field1910;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field477 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field477 = 1;
        }
        if (field477 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field477 = 0;
        }
    }

    @ObfuscatedName("bh.aw(Lak;IB)V")
    public static final void method1421(class35 arg0, int arg1) {
        method577(arg0.field754, arg0.field787, arg1);
    }

    @ObfuscatedName("aq.ar(IIII)V")
    public static final void method577(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field445 = -1;
            field406 = -1;
            return;
        }
        int var3 = method836(arg0, arg1, Statics.field2988) - arg2;
        int var4 = arg0 - Statics.field2550;
        int var5 = var3 - Statics.field165;
        int var6 = arg1 - Statics.field1904;
        int var7 = class86.field1480[Statics.field1260];
        int var8 = class86.field1464[Statics.field1260];
        int var9 = class86.field1480[Statics.field348];
        int var10 = class86.field1464[Statics.field348];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field445 = (var11 << 9) / var15 + 256;
            field406 = (var14 << 9) / var15 + 167;
        } else {
            field445 = -1;
            field406 = -1;
        }
    }

    @ObfuscatedName("au.at(IIIB)I")
    public static final int method836(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field73[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field77[var5][var3][var4] + class6.field77[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field77[var5][var3][var4 + 1] + class6.field77[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("em.ah(ZI)V")
    public static final void method2704(boolean arg0) {
        field326 = arg0;
        if (!field326) {
            int var1 = field309.method2307();
            int var2 = field309.method2175();
            int var3 = field309.method2230();
            int var4 = field309.method2184();
            int var5 = (field310 - field309.field1852) / 16;
            Statics.field1924 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var7 = 0; var7 < 4; var7++) {
                    Statics.field1924[var6][var7] = field309.method2193();
                }
            }
            int var8 = field309.method2184();
            Statics.field128 = new int[var5];
            Statics.field1350 = new int[var5];
            Statics.field2132 = new int[var5];
            Statics.field190 = new byte[var5][];
            Statics.field1853 = new byte[var5][];
            boolean var9 = false;
            if ((var4 / 8 == 48 || var4 / 8 == 49) && var8 / 8 == 48) {
                var9 = true;
            }
            if (var4 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var4 - 6) / 8; var11 <= (var4 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field128[var10] = var13;
                        Statics.field1350[var10] = Statics.field2973.method2813("m" + var11 + "_" + var12);
                        Statics.field2132[var10] = Statics.field2973.method2813("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method2088(var4, var8, var2, var1, var3);
            return;
        }
        int var14 = field309.method2230();
        int var15 = field309.method2289();
        int var16 = field309.method2230();
        int var17 = field309.method2140();
        field309.method2376();
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = field309.method2378(1);
                    if (var21 == 1) {
                        field327[var18][var19][var20] = field309.method2378(26);
                    } else {
                        field327[var18][var19][var20] = -1;
                    }
                }
            }
        }
        field309.method2379();
        int var22 = (field310 - field309.field1852) / 16;
        Statics.field1924 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.field1924[var23][var24] = field309.method2153();
            }
        }
        int var25 = field309.method2230();
        Statics.field128 = new int[var22];
        Statics.field1350 = new int[var22];
        Statics.field2132 = new int[var22];
        Statics.field190 = new byte[var22][];
        Statics.field1853 = new byte[var22][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field327[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field128[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field128[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1350[var26] = Statics.field2973.method2813("m" + var35 + "_" + var36);
                            Statics.field2132[var26] = Statics.field2973.method2813("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method2088(var16, var14, var17, var25, var15);
    }

    @ObfuscatedName("db.ag(IIIIII)V")
    public static final void method2088(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field2143 == arg0 && Statics.field1659 == arg1 && field425 == arg2 || !field271) {
            return;
        }
        Statics.field2143 = arg0;
        Statics.field1659 = arg1;
        field425 = arg2;
        if (!field271) {
            field425 = 0;
        }
        method154(25);
        method2584(class148.field2243, true);
        int var5 = Statics.field1280;
        int var6 = Statics.field1910;
        Statics.field1280 = (arg0 - 6) * 8;
        Statics.field1910 = (arg1 - 6) * 8;
        int var7 = Statics.field1280 - var5;
        int var8 = Statics.field1910 - var6;
        int var9 = Statics.field1280;
        int var10 = Statics.field1910;
        for (int var11 = 0; var11 < 32768; var11++) {
            class32 var12 = field304[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field795[var13] -= var7;
                    var12.field796[var13] -= var8;
                }
                var12.field754 -= var7 * 128;
                var12.field787 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field385[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field795[var16] -= var7;
                    var15.field796[var16] -= var8;
                }
                var15.field754 -= var7 * 128;
                var15.field787 -= var8 * 128;
            }
        }
        Statics.field2988 = arg2;
        Statics.field393.method604(arg3, arg4, false);
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
                        field273[var27][var23][var24] = field273[var27][var25][var26];
                    } else {
                        field273[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class16 var28 = (class16) field282.method3309(); var28 != null; var28 = (class16) field282.method3311()) {
            var28.field220 -= var7;
            var28.field227 -= var8;
            if (var28.field220 < 0 || var28.field227 < 0 || var28.field220 >= 104 || var28.field227 >= 104) {
                var28.method3404();
            }
        }
        if (field499 != 0) {
            field499 -= var7;
            field500 -= var8;
        }
        field507 = 0;
        field497 = false;
        field413 = -1;
        field404.method3303();
        field486.method3303();
    }

    @ObfuscatedName("o.aj(ZI)V")
    public static final void method107(boolean arg0) {
        Statics.method124();
        field313++;
        if (field313 < 50 && !arg0) {
            return;
        }
        field313 = 0;
        if (field318 || Statics.field1915 == null) {
            return;
        }
        field521.method2396(223);
        try {
            Statics.field1915.method2593(field521.field1859, 0, field521.field1852);
            field521.field1852 = 0;
        } catch (IOException var2) {
            field318 = true;
        }
    }

    @ObfuscatedName("ap.az(I)V")
    public static final void method842() {
        method107(false);
        field467 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field190.length; var1++) {
            if (Statics.field1350[var1] != -1 && Statics.field190[var1] == null) {
                Statics.field190[var1] = Statics.field2973.method2811(Statics.field1350[var1], 0);
                if (Statics.field190[var1] == null) {
                    var0 = false;
                    field467++;
                }
            }
            if (Statics.field2132[var1] != -1 && Statics.field1853[var1] == null) {
                Statics.field1853[var1] = Statics.field2973.method2799(Statics.field2132[var1], 0, Statics.field1924[var1]);
                if (Statics.field1853[var1] == null) {
                    var0 = false;
                    field467++;
                }
            }
        }
        if (!var0) {
            field324 = 1;
            return;
        }
        field322 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field190.length; var3++) {
            byte[] var4 = Statics.field1853[var3];
            if (var4 != null) {
                int var5 = (Statics.field128[var3] >> 8) * 64 - Statics.field1280;
                int var6 = (Statics.field128[var3] & 0xFF) * 64 - Statics.field1910;
                if (field326) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method162(var4, var5, var6);
            }
        }
        if (!var2) {
            field324 = 2;
            return;
        }
        if (field324 != 0) {
            method2584(class148.field2243 + class2.field20 + class2.field17 + 100 + "%" + class2.field18, true);
        }
        Statics.method124();
        method90();
        Statics.method124();
        Statics.field191.method1616();
        Statics.method124();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field325[var7].method3641();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field73[var8][var9][var10] = 0;
                }
            }
        }
        Statics.method124();
        class6.field84 = 99;
        Statics.field1927 = new byte[4][104][104];
        Statics.field88 = new byte[4][104][104];
        Statics.field79 = new byte[4][104][104];
        Statics.field76 = new byte[4][104][104];
        Statics.field1296 = new int[4][105][105];
        Statics.field1299 = new byte[4][105][105];
        Statics.field78 = new int[105][105];
        Statics.field1964 = new int[104];
        Statics.field2488 = new int[104];
        Statics.field91 = new int[104];
        Statics.field2074 = new int[104];
        Statics.field2566 = new int[104];
        int var11 = Statics.field190.length;
        for (class22 var12 = (class22) class22.field577.method3309(); var12 != null; var12 = (class22) class22.field577.method3311()) {
            if (var12.field573 != null) {
                Statics.field1812.method983(var12.field573);
                var12.field573 = null;
            }
            if (var12.field578 != null) {
                Statics.field1812.method983(var12.field578);
                var12.field578 = null;
            }
        }
        class22.field577.method3303();
        method107(true);
        if (!field326) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field128[var13] >> 8) * 64 - Statics.field1280;
                int var15 = (Statics.field128[var13] & 0xFF) * 64 - Statics.field1910;
                byte[] var16 = Statics.field190[var13];
                if (var16 != null) {
                    Statics.method124();
                    class6.method2992(var16, var14, var15, Statics.field2143 * 8 - 48, Statics.field1659 * 8 - 48, field325);
                }
            }
            for (int var17 = 0; var17 < var11; var17++) {
                int var18 = (Statics.field128[var17] >> 8) * 64 - Statics.field1280;
                int var19 = (Statics.field128[var17] & 0xFF) * 64 - Statics.field1910;
                byte[] var20 = Statics.field190[var17];
                if (var20 == null && Statics.field1659 < 800) {
                    Statics.method124();
                    class6.method1362(var18, var19, 64, 64);
                }
            }
            method107(true);
            for (int var21 = 0; var21 < var11; var21++) {
                byte[] var22 = Statics.field1853[var21];
                if (var22 != null) {
                    int var23 = (Statics.field128[var21] >> 8) * 64 - Statics.field1280;
                    int var24 = (Statics.field128[var21] & 0xFF) * 64 - Statics.field1910;
                    Statics.method124();
                    class6.method3410(var22, var23, var24, Statics.field191, field325);
                }
            }
        }
        if (field326) {
            for (int var25 = 0; var25 < 4; var25++) {
                Statics.method124();
                for (int var26 = 0; var26 < 13; var26++) {
                    for (int var27 = 0; var27 < 13; var27++) {
                        boolean var28 = false;
                        int var29 = field327[var25][var26][var27];
                        if (var29 != -1) {
                            int var30 = var29 >> 24 & 0x3;
                            int var31 = var29 >> 1 & 0x3;
                            int var32 = var29 >> 14 & 0x3FF;
                            int var33 = var29 >> 3 & 0x7FF;
                            int var34 = (var32 / 8 << 8) + var33 / 8;
                            for (int var35 = 0; var35 < Statics.field128.length; var35++) {
                                if (Statics.field128[var35] == var34 && Statics.field190[var35] != null) {
                                    byte[] var36 = Statics.field190[var35];
                                    int var37 = var26 * 8;
                                    int var38 = var27 * 8;
                                    int var39 = (var32 & 0x7) * 8;
                                    int var40 = (var33 & 0x7) * 8;
                                    class219[] var41 = field325;
                                    for (int var42 = 0; var42 < 8; var42++) {
                                        for (int var43 = 0; var43 < 8; var43++) {
                                            if (var37 + var42 > 0 && var37 + var42 < 103 && var38 + var43 > 0 && var38 + var43 < 103) {
                                                var41[var25].field3088[var37 + var42][var38 + var43] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class111 var44 = new class111(var36);
                                    for (int var45 = 0; var45 < 4; var45++) {
                                        for (int var46 = 0; var46 < 64; var46++) {
                                            for (int var47 = 0; var47 < 64; var47++) {
                                                if (var30 == var45 && var46 >= var39 && var46 < var39 + 8 && var47 >= var40 && var47 < var40 + 8) {
                                                    class6.method2441(var44, var25, var37 + class167.method2428(var46 & 0x7, var47 & 0x7, var31), var38 + class167.method574(var46 & 0x7, var47 & 0x7, var31), 0, 0, var31);
                                                } else {
                                                    class6.method2441(var44, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var28 = true;
                                    break;
                                }
                            }
                        }
                        if (!var28) {
                            int var48 = var25;
                            int var49 = var26 * 8;
                            int var50 = var27 * 8;
                            for (int var51 = 0; var51 < 8; var51++) {
                                for (int var52 = 0; var52 < 8; var52++) {
                                    class6.field77[var48][var49 + var51][var50 + var52] = 0;
                                }
                            }
                            if (var49 > 0) {
                                for (int var53 = 1; var53 < 8; var53++) {
                                    class6.field77[var48][var49][var50 + var53] = class6.field77[var48][var49 - 1][var50 + var53];
                                }
                            }
                            if (var50 > 0) {
                                for (int var54 = 1; var54 < 8; var54++) {
                                    class6.field77[var48][var49 + var54][var50] = class6.field77[var48][var49 + var54][var50 - 1];
                                }
                            }
                            if (var49 > 0 && class6.field77[var48][var49 - 1][var50] != 0) {
                                class6.field77[var48][var49][var50] = class6.field77[var48][var49 - 1][var50];
                            } else if (var50 > 0 && class6.field77[var48][var49][var50 - 1] != 0) {
                                class6.field77[var48][var49][var50] = class6.field77[var48][var49][var50 - 1];
                            } else if (var49 > 0 && var50 > 0 && class6.field77[var48][var49 - 1][var50 - 1] != 0) {
                                class6.field77[var48][var49][var50] = class6.field77[var48][var49 - 1][var50 - 1];
                            }
                        }
                    }
                }
            }
            for (int var55 = 0; var55 < 13; var55++) {
                for (int var56 = 0; var56 < 13; var56++) {
                    int var57 = field327[0][var55][var56];
                    if (var57 == -1) {
                        class6.method1362(var55 * 8, var56 * 8, 8, 8);
                    }
                }
            }
            method107(true);
            for (int var58 = 0; var58 < 4; var58++) {
                Statics.method124();
                for (int var59 = 0; var59 < 13; var59++) {
                    label354: for (int var60 = 0; var60 < 13; var60++) {
                        int var61 = field327[var58][var59][var60];
                        if (var61 != -1) {
                            int var62 = var61 >> 24 & 0x3;
                            int var63 = var61 >> 1 & 0x3;
                            int var64 = var61 >> 14 & 0x3FF;
                            int var65 = var61 >> 3 & 0x7FF;
                            int var66 = (var64 / 8 << 8) + var65 / 8;
                            for (int var67 = 0; var67 < Statics.field128.length; var67++) {
                                if (Statics.field128[var67] == var66 && Statics.field1853[var67] != null) {
                                    byte[] var68 = Statics.field1853[var67];
                                    int var69 = var59 * 8;
                                    int var70 = var60 * 8;
                                    int var71 = (var64 & 0x7) * 8;
                                    int var72 = (var65 & 0x7) * 8;
                                    class81 var73 = Statics.field191;
                                    class219[] var74 = field325;
                                    class111 var75 = new class111(var68);
                                    int var76 = -1;
                                    while (true) {
                                        int var77 = var75.method2279();
                                        if (var77 == 0) {
                                            continue label354;
                                        }
                                        var76 += var77;
                                        int var78 = 0;
                                        while (true) {
                                            int var79 = var75.method2279();
                                            if (var79 == 0) {
                                                break;
                                            }
                                            var78 += var79 - 1;
                                            int var80 = var78 & 0x3F;
                                            int var81 = var78 >> 6 & 0x3F;
                                            int var82 = var78 >> 12;
                                            int var83 = var75.method2231();
                                            int var84 = var83 >> 2;
                                            int var85 = var83 & 0x3;
                                            if (var62 == var82 && var81 >= var71 && var81 < var71 + 8 && var80 >= var72 && var80 < var72 + 8) {
                                                class38 var86 = class38.method2727(var76);
                                                int var88 = var81 & 0x7;
                                                int var89 = var80 & 0x7;
                                                int var91 = var86.field863;
                                                int var92 = var86.field865;
                                                if ((var85 & 0x1) == 1) {
                                                    int var93 = var91;
                                                    var91 = var92;
                                                    var92 = var93;
                                                }
                                                int var94 = var63 & 0x3;
                                                int var95;
                                                if (var94 == 0) {
                                                    var95 = var88;
                                                } else if (var94 == 1) {
                                                    var95 = var89;
                                                } else if (var94 == 2) {
                                                    var95 = 7 - var88 - (var91 - 1);
                                                } else {
                                                    var95 = 7 - var89 - (var92 - 1);
                                                }
                                                int var96 = var69 + var95;
                                                int var97 = var70 + class167.method1895(var81 & 0x7, var80 & 0x7, var63, var86.field863, var86.field865, var85);
                                                if (var96 > 0 && var97 > 0 && var96 < 103 && var97 < 103) {
                                                    int var98 = var58;
                                                    if ((class6.field73[1][var96][var97] & 0x2) == 2) {
                                                        var98 = var58 - 1;
                                                    }
                                                    class219 var99 = null;
                                                    if (var98 >= 0) {
                                                        var99 = var74[var98];
                                                    }
                                                    class6.method132(var58, var96, var97, var76, var63 + var85 & 0x3, var84, var73, var99);
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
        method107(true);
        method90();
        Statics.method124();
        class6.method583(Statics.field191, field325);
        method107(true);
        int var100 = class6.field84;
        if (var100 > Statics.field2988) {
            var100 = Statics.field2988;
        }
        if (var100 < Statics.field2988 - 1) {
            int var101 = Statics.field2988 - 1;
        }
        if (field271) {
            Statics.field191.method1623(class6.field84);
        } else {
            Statics.field191.method1623(0);
        }
        for (int var102 = 0; var102 < 104; var102++) {
            for (int var103 = 0; var103 < 104; var103++) {
                method835(var102, var103);
            }
        }
        Statics.method124();
        for (class16 var104 = (class16) field282.method3309(); var104 != null; var104 = (class16) field282.method3311()) {
            if (var104.field229 == -1) {
                var104.field228 = 0;
                method169(var104);
            } else {
                var104.method3404();
            }
        }
        class38.field852.method3246();
        if (Statics.field68 != null) {
            field521.method2396(44);
            field521.method2136(1057001181);
        }
        if (!field326) {
            int var105 = (Statics.field2143 - 6) / 8;
            int var106 = (Statics.field2143 + 6) / 8;
            int var107 = (Statics.field1659 - 6) / 8;
            int var108 = (Statics.field1659 + 6) / 8;
            for (int var109 = var105 - 1; var109 <= var106 + 1; var109++) {
                for (int var110 = var107 - 1; var110 <= var108 + 1; var110++) {
                    if (var109 < var105 || var109 > var106 || var110 < var107 || var110 > var108) {
                        Statics.field2973.method2818("m" + var109 + "_" + var110);
                        Statics.field2973.method2818("l" + var109 + "_" + var110);
                    }
                }
            }
        }
        method154(30);
        Statics.method124();
        class6.method2883();
        field521.method2396(130);
        class136.method631();
    }

    @ObfuscatedName("z.bu(II)V")
    public static final void method493(int arg0) {
        int[] var1 = Statics.field1561.field1313;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field73[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field191.method1769(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field73[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field191.method1769(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1561.method1478();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field73[arg0][var10][var9] & 0x18) == 0) {
                    method578(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field73[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method578(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field365 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field191.method1645(Statics.field2988, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class38.method2727(var14).field893;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field325[Statics.field2988].field3088;
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
                        field498[field365] = Statics.field2038[var15];
                        field496[field365] = var16;
                        field368[field365] = var17;
                        field365++;
                    }
                }
            }
        }
        Statics.field2050.method1418();
    }

    @ObfuscatedName("aq.bi(IIIIIB)V")
    public static final void method578(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field191.method1636(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field191.method1646(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1561.field1313;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class38 var13 = class38.method2727(var12);
            if (var13.field878 == -1) {
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
                class76 var14 = Statics.field2022[var13.field878];
                if (var14 != null) {
                    int var15 = (var13.field863 * 4 - var14.field1323) / 2;
                    int var16 = (var13.field865 * 4 - var14.field1321) / 2;
                    var14.method1585(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field865) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field191.method1644(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field191.method1646(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class38 var22 = class38.method2727(var21);
            if (var22.field878 != -1) {
                class76 var23 = Statics.field2022[var22.field878];
                if (var23 != null) {
                    int var24 = (var22.field863 * 4 - var23.field1323) / 2;
                    int var25 = (var22.field865 * 4 - var23.field1321) / 2;
                    var23.method1585(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field865) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1561.field1313;
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
        int var29 = Statics.field191.method1645(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class38 var31 = class38.method2727(var30);
        if (var31.field878 == -1) {
            return;
        }
        class76 var32 = Statics.field2022[var31.field878];
        if (var32 != null) {
            int var33 = (var31.field863 * 4 - var32.field1323) / 2;
            int var34 = (var31.field865 * 4 - var32.field1321) / 2;
            var32.method1585(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field865) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("as.bb(B)Z")
    public static final boolean method751() {
        if (Statics.field1915 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1915.method2587();
            if (var0 == 0) {
                return false;
            }
            if (field311 == -1) {
                Statics.field1915.method2590(field309.field1859, 0, 1);
                field309.field1852 = 0;
                field311 = field309.method2383();
                field310 = class178.field2888[field311];
                var0--;
            }
            if (field310 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1915.method2590(field309.field1859, 0, 1);
                field310 = field309.field1859[0] & 0xFF;
                var0--;
            }
            if (field310 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1915.method2590(field309.field1859, 0, 2);
                field309.field1852 = 0;
                field310 = field309.method2307();
                var0 -= 2;
            }
            if (var0 < field310) {
                return false;
            }
            field309.field1852 = 0;
            Statics.field1915.method2590(field309.field1859, 0, field310);
            field312 = 0;
            field317 = field375;
            field375 = field315;
            field315 = field311;
            if (field311 == 8) {
                method2416();
                field311 = -1;
                return true;
            }
            if (field311 == 168) {
                int var1 = field309.method2231();
                class122[] var2 = class122.method1894();
                int var3 = 0;
                class122 var5;
                while (true) {
                    if (var3 >= var2.length) {
                        var5 = null;
                        break;
                    }
                    class122 var4 = var2[var3];
                    if (var4.field1922 == var1) {
                        var5 = var4;
                        break;
                    }
                    var3++;
                }
                Statics.field626 = var5;
                field311 = -1;
                return true;
            }
            if (field311 == 241) {
                if (field428 != -1) {
                    method479(field428, 0);
                }
                field311 = -1;
                return true;
            }
            if (field311 == 237) {
                String var6 = field309.method2156();
                long var7 = (long) field309.method2307();
                long var9 = (long) field309.method2150();
                class143[] var11 = new class143[] { class143.field2104, class143.field2106, class143.field2103, class143.field2105, class143.field2112 };
                class143 var12 = (class143) class101.method3237(var11, field309.method2231());
                long var13 = (var7 << 32) + var9;
                boolean var15 = false;
                for (int var16 = 0; var16 < 100; var16++) {
                    if (field337[var16] == var13) {
                        var15 = true;
                        break;
                    }
                }
                if (method2373(var6)) {
                    var15 = true;
                }
                if (!var15 && field477 == 0) {
                    field337[field487] = var13;
                    field487 = (field487 + 1) % 100;
                    class114 var17 = field309;
                    String var21;
                    try {
                        int var18 = var17.method2279();
                        if (var18 > 32767) {
                            var18 = 32767;
                        }
                        byte[] var19 = new byte[var18];
                        var17.field1852 += Statics.field3032.method2078(var17.field1859, var17.field1852, var19, 0, var18);
                        String var20 = Statics.method166(var19, 0, var18);
                        var21 = var20;
                    } catch (Exception var265) {
                        var21 = "Cabbage";
                    }
                    String var24 = class213.method3499(class154.method660(var21));
                    byte var25;
                    if (var12.field2114) {
                        var25 = 7;
                    } else {
                        var25 = 3;
                    }
                    if (var12.field2109 == -1) {
                        class11.method3012(var25, var6, var24);
                    } else {
                        class11.method3012(var25, class2.method30(var12.field2109) + var6, var24);
                    }
                }
                field311 = -1;
                return true;
            }
            if (field311 == 76) {
                field436 = field452;
                if (field310 == 0) {
                    field492 = null;
                    field506 = null;
                    Statics.field1664 = 0;
                    Statics.field89 = null;
                    field311 = -1;
                    return true;
                }
                field506 = field309.method2156();
                long var26 = field309.method2195();
                field492 = class153.method1892(var26);
                Statics.field2144 = field309.method2149();
                int var28 = field309.method2231();
                if (var28 == 255) {
                    field311 = -1;
                    return true;
                }
                Statics.field1664 = var28;
                class23[] var29 = new class23[100];
                for (int var30 = 0; var30 < Statics.field1664; var30++) {
                    var29[var30] = new class23();
                    var29[var30].field586 = field309.method2156();
                    var29[var30].field584 = class155.method1(var29[var30].field586, Statics.field1866);
                    var29[var30].field585 = field309.method2307();
                    var29[var30].field590 = field309.method2149();
                    field309.method2156();
                    if (var29[var30].field586.equals(Statics.field393.field37)) {
                        Statics.field2119 = var29[var30].field590;
                    }
                }
                boolean var31 = false;
                int var32 = Statics.field1664;
                while (var32 > 0) {
                    boolean var33 = true;
                    var32--;
                    for (int var34 = 0; var34 < var32; var34++) {
                        if (var29[var34].field584.compareTo(var29[var34 + 1].field584) > 0) {
                            class23 var35 = var29[var34];
                            var29[var34] = var29[var34 + 1];
                            var29[var34 + 1] = var35;
                            var33 = false;
                        }
                    }
                    if (var33) {
                        break;
                    }
                }
                Statics.field89 = var29;
                field311 = -1;
                return true;
            }
            if (field311 == 38) {
                int var36 = field309.method2279();
                boolean var37 = field309.method2231() == 1;
                String var38 = "";
                boolean var39 = false;
                if (var37) {
                    var38 = field309.method2156();
                    if (method2373(var38)) {
                        var39 = true;
                    }
                }
                String var40 = field309.method2156();
                if (!var39) {
                    class11.method3012(var36, var38, var40);
                }
                field311 = -1;
                return true;
            }
            if (field311 == 24) {
                field483 = field309.method2231();
                field484 = field309.method2231();
                field311 = -1;
                return true;
            }
            if (field311 == 149) {
                method149(field309.method2156());
                field311 = -1;
                return true;
            }
            if (field311 == 252) {
                for (int var41 = 0; var41 < field385.length; var41++) {
                    if (field385[var41] != null) {
                        field385[var41].field783 = -1;
                    }
                }
                for (int var42 = 0; var42 < field304.length; var42++) {
                    if (field304[var42] != null) {
                        field304[var42].field783 = -1;
                    }
                }
                field311 = -1;
                return true;
            }
            if (field311 == 140) {
                int var43 = field309.method2193();
                boolean var44 = field309.method2140() == 1;
                class164 var45 = class164.method619(var43);
                if (var45.field2623 != var44) {
                    var45.field2623 = var44;
                    method93(var45);
                }
                field311 = -1;
                return true;
            }
            if (field311 == 91) {
                field488 = field309.method2184() * 30;
                field464 = field452;
                field311 = -1;
                return true;
            }
            if (field311 == 0) {
                Statics.method720();
                field434 = field309.method2151();
                field464 = field452;
                field311 = -1;
                return true;
            }
            if (field311 == 22) {
                int var46 = field309.method2184();
                int var47 = field309.method2289();
                int var48 = field309.method2153();
                class164 var49 = class164.method619(var48);
                var49.field2694 = (var47 << 16) + var46;
                field311 = -1;
                return true;
            }
            if (field311 == 9) {
                int var50 = field309.method2172();
                int var51 = field309.method2230();
                int var52 = var51 >> 10 & 0x1F;
                int var53 = var51 >> 5 & 0x1F;
                int var54 = var51 & 0x1F;
                int var55 = (var54 << 3) + (var52 << 19) + (var53 << 11);
                class164 var56 = class164.method619(var50);
                if (var56.field2628 != var55) {
                    var56.field2628 = var55;
                    method93(var56);
                }
                field311 = -1;
                return true;
            }
            if (field311 == 192) {
                field497 = true;
                Statics.field1273 = field309.method2231();
                Statics.field294 = field309.method2231();
                Statics.field1942 = field309.method2307();
                Statics.field1259 = field309.method2231();
                Statics.field1278 = field309.method2231();
                if (Statics.field1278 >= 100) {
                    Statics.field2550 = Statics.field1273 * 128 + 64;
                    Statics.field1904 = Statics.field294 * 128 + 64;
                    Statics.field165 = method836(Statics.field2550, Statics.field1904, Statics.field2988) - Statics.field1942;
                }
                field311 = -1;
                return true;
            }
            if (field311 == 28) {
                method1607(false);
                field311 = -1;
                return true;
            }
            if (field311 == 111) {
                int var57 = field309.method2230();
                int var58 = field309.method2193();
                class166.field2741[var57] = var58;
                if (class166.field2742[var57] != var58) {
                    class166.field2742[var57] = var58;
                    method519(var57);
                }
                field453[++field454 - 1 & 0x1F] = var57;
                field311 = -1;
                return true;
            }
            if (field311 == 221) {
                int var59 = field309.method2153();
                class164 var60 = class164.method619(var59);
                for (int var61 = 0; var61 < var60.field2716.length; var61++) {
                    var60.field2716[var61] = -1;
                    var60.field2716[var61] = 0;
                }
                method93(var60);
                field311 = -1;
                return true;
            }
            if (field311 == 12) {
                Statics.field1354 = field309.method2174();
                Statics.field208 = field309.method2174();
                field311 = -1;
                return true;
            }
            if (field311 == 127) {
                class201.method590(field309, field310);
                field311 = -1;
                return true;
            }
            if (field311 == 36) {
                class24 var62 = new class24();
                var62.field594 = field309.method2156();
                var62.field601 = field309.method2307();
                int var63 = field309.method2153();
                var62.field597 = var63;
                method154(45);
                Statics.field1915.method2606();
                Statics.field1915 = null;
                Statics.method2732(var62);
                field311 = -1;
                return false;
            }
            if (field311 == 47) {
                String var64 = field309.method2156();
                Object[] var65 = new Object[var64.length() + 1];
                for (int var66 = var64.length() - 1; var66 >= 0; var66--) {
                    if (var64.charAt(var66) == 's') {
                        var65[var66 + 1] = field309.method2156();
                    } else {
                        var65[var66 + 1] = Integer.valueOf(field309.method2153());
                    }
                }
                var65[0] = Integer.valueOf(field309.method2153());
                class1 var67 = new class1();
                var67.field8 = var65;
                class34.method2699(var67);
                field311 = -1;
                return true;
            }
            if (field311 == 170) {
                int var68 = field309.method2131();
                int var69 = field309.method2153();
                int var70 = field309.method2185();
                class164 var71 = class164.method619(var69);
                int var72 = var71.field2618 + var68;
                int var73 = var71.field2662 + var70;
                if (var71.field2616 != var72 || var71.field2681 != var73) {
                    var71.field2616 = var72;
                    var71.field2681 = var73;
                    method93(var71);
                }
                field311 = -1;
                return true;
            }
            if (field311 == 89) {
                int var74 = field309.method2153();
                int var75 = field309.method2307();
                if (var74 < -70000) {
                    var75 += 32768;
                }
                class164 var76;
                if (var74 >= 0) {
                    var76 = class164.method619(var74);
                } else {
                    var76 = null;
                }
                if (var76 != null) {
                    for (int var77 = 0; var77 < var76.field2716.length; var77++) {
                        var76.field2716[var77] = 0;
                        var76.field2717[var77] = 0;
                    }
                }
                class15 var78 = (class15) class15.field213.method3273((long) var75);
                if (var78 != null) {
                    for (int var79 = 0; var79 < var78.field214.length; var79++) {
                        var78.field214[var79] = -1;
                        var78.field210[var79] = 0;
                    }
                }
                int var80 = field309.method2307();
                for (int var81 = 0; var81 < var80; var81++) {
                    int var82 = field309.method2289();
                    int var83 = field309.method2174();
                    if (var83 == 255) {
                        var83 = field309.method2192();
                    }
                    if (var76 != null && var81 < var76.field2716.length) {
                        var76.field2716[var81] = var82;
                        var76.field2717[var81] = var83;
                    }
                    class15.method140(var75, var81, var82 - 1, var83);
                }
                if (var76 != null) {
                    method93(var76);
                }
                Statics.method720();
                field455[++field297 - 1 & 0x1F] = var75 & 0x7FFF;
                field311 = -1;
                return true;
            }
            if (field311 == 136) {
                int var84 = field309.method2231();
                int var85 = field309.method2231();
                int var86 = field309.method2231();
                int var87 = field309.method2231();
                field481[var84] = true;
                field516[var84] = var85;
                field383[var84] = var86;
                field519[var84] = var87;
                field332[var84] = 0;
                field311 = -1;
                return true;
            }
            if (field311 == 222 || field311 == 253 || field311 == 234 || field311 == 2 || field311 == 240 || field311 == 70 || field311 == 82 || field311 == 249 || field311 == 238 || field311 == 167) {
                method2488();
                field311 = -1;
                return true;
            }
            if (field311 == 94) {
                field384 = 1;
                field264 = field452;
                field311 = -1;
                return true;
            }
            if (field311 == 213) {
                method2985();
                field311 = -1;
                return false;
            }
            if (field311 == 26) {
                method2704(true);
                field311 = -1;
                return true;
            }
            if (field311 == 66) {
                int var88 = field309.method2175();
                int var89 = field309.method2175();
                int var90 = field309.method2140();
                Statics.field2988 = var90 >> 1;
                Statics.field393.method604(var89, var88, (var90 & 0x1) == 1);
                field311 = -1;
                return true;
            }
            if (field311 == 122) {
                int var91 = field309.method2192();
                int var92 = field309.method2307();
                if (var92 == 65535) {
                    var92 = -1;
                }
                int var93 = field309.method2192();
                class164 var94 = class164.method619(var91);
                if (var94.field2601) {
                    var94.field2718 = var92;
                    var94.field2719 = var93;
                    class47 var96 = class47.method832(var92);
                    var94.field2629 = var96.field1027;
                    var94.field2660 = var96.field1028;
                    var94.field2653 = var96.field1049;
                    var94.field2649 = var96.field1037;
                    var94.field2650 = var96.field1058;
                    var94.field2683 = var96.field1054;
                    if (var96.field1032 == 1) {
                        var94.field2657 = 1;
                    } else {
                        var94.field2657 = 2;
                    }
                    if (var94.field2620 > 0) {
                        var94.field2683 = var94.field2683 * 32 / var94.field2620;
                    }
                    method93(var94);
                } else if (var92 == -1) {
                    var94.field2647 = 0;
                    field311 = -1;
                    return true;
                } else {
                    class47 var95 = class47.method832(var92);
                    var94.field2647 = 4;
                    var94.field2614 = var92;
                    var94.field2629 = var95.field1027;
                    var94.field2660 = var95.field1028;
                    var94.field2683 = var95.field1054 * 100 / var93;
                    method93(var94);
                }
                field311 = -1;
                return true;
            }
            if (field311 == 254) {
                field497 = true;
                Statics.field3005 = field309.method2231();
                Statics.field143 = field309.method2231();
                Statics.field806 = field309.method2307();
                Statics.field1805 = field309.method2231();
                Statics.field2896 = field309.method2231();
                if (Statics.field2896 >= 100) {
                    int var97 = Statics.field3005 * 128 + 64;
                    int var98 = Statics.field143 * 128 + 64;
                    int var99 = method836(var97, var98, Statics.field2988) - Statics.field806;
                    int var100 = var97 - Statics.field2550;
                    int var101 = var99 - Statics.field165;
                    int var102 = var98 - Statics.field1904;
                    int var103 = (int) Math.sqrt((double) (var100 * var100 + var102 * var102));
                    Statics.field1260 = (int) (Math.atan2((double) var101, (double) var103) * 325.949D) & 0x7FF;
                    Statics.field348 = (int) (Math.atan2((double) var100, (double) var102) * -325.949D) & 0x7FF;
                    if (Statics.field1260 < 128) {
                        Statics.field1260 = 128;
                    }
                    if (Statics.field1260 > 383) {
                        Statics.field1260 = 383;
                    }
                }
                field311 = -1;
                return true;
            }
            if (field311 == 186) {
                method1607(true);
                field311 = -1;
                return true;
            }
            if (field311 == 189) {
                int var104 = field309.method2172();
                Statics.field2747 = Statics.field925.method2511(var104);
                field311 = -1;
                return true;
            }
            if (field311 == 232) {
                Statics.field208 = field309.method2140();
                Statics.field1354 = field309.method2175();
                for (int var105 = Statics.field1354; var105 < Statics.field1354 + 8; var105++) {
                    for (int var106 = Statics.field208; var106 < Statics.field208 + 8; var106++) {
                        if (field273[Statics.field2988][var105][var106] != null) {
                            field273[Statics.field2988][var105][var106] = null;
                            method835(var105, var106);
                        }
                    }
                }
                for (class16 var107 = (class16) field282.method3309(); var107 != null; var107 = (class16) field282.method3311()) {
                    if (var107.field220 >= Statics.field1354 && var107.field220 < Statics.field1354 + 8 && var107.field227 >= Statics.field208 && var107.field227 < Statics.field208 + 8 && Statics.field2988 == var107.field221) {
                        var107.field229 = 0;
                    }
                }
                field311 = -1;
                return true;
            }
            if (field311 == 158) {
                String var108 = field309.method2156();
                int var109 = field309.method2307();
                byte var110 = field309.method2149();
                boolean var111 = false;
                if (var110 == -128) {
                    var111 = true;
                }
                if (var111) {
                    if (Statics.field1664 == 0) {
                        field311 = -1;
                        return true;
                    }
                    boolean var112 = false;
                    int var113;
                    for (var113 = 0; var113 < Statics.field1664 && (!Statics.field89[var113].field586.equals(var108) || Statics.field89[var113].field585 != var109); var113++) {
                    }
                    if (var113 < Statics.field1664) {
                        while (var113 < Statics.field1664 - 1) {
                            Statics.field89[var113] = Statics.field89[var113 + 1];
                            var113++;
                        }
                        Statics.field1664--;
                        Statics.field89[Statics.field1664] = null;
                    }
                } else {
                    field309.method2156();
                    class23 var114 = new class23();
                    var114.field586 = var108;
                    var114.field584 = class155.method1(var114.field586, Statics.field1866);
                    var114.field585 = var109;
                    var114.field590 = var110;
                    int var115;
                    for (var115 = Statics.field1664 - 1; var115 >= 0; var115--) {
                        int var116 = Statics.field89[var115].field584.compareTo(var114.field584);
                        if (var116 == 0) {
                            Statics.field89[var115].field585 = var109;
                            Statics.field89[var115].field590 = var110;
                            if (var108.equals(Statics.field393.field37)) {
                                Statics.field2119 = var110;
                            }
                            field436 = field452;
                            field311 = -1;
                            return true;
                        }
                        if (var116 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1664 >= Statics.field89.length) {
                        field311 = -1;
                        return true;
                    }
                    for (int var117 = Statics.field1664 - 1; var117 > var115; var117--) {
                        Statics.field89[var117 + 1] = Statics.field89[var117];
                    }
                    if (Statics.field1664 == 0) {
                        Statics.field89 = new class23[100];
                    }
                    Statics.field89[var115 + 1] = var114;
                    Statics.field1664++;
                    if (var108.equals(Statics.field393.field37)) {
                        Statics.field2119 = var110;
                    }
                }
                field436 = field452;
                field311 = -1;
                return true;
            }
            if (field311 == 138) {
                int var118 = field309.method2192();
                String var119 = field309.method2156();
                class164 var120 = class164.method619(var118);
                if (!var119.equals(var120.field2622)) {
                    var120.field2622 = var119;
                    method93(var120);
                }
                field311 = -1;
                return true;
            }
            if (field311 == 175) {
                int var121 = field309.method2307();
                if (var121 == 65535) {
                    var121 = -1;
                }
                if (var121 == -1 && !field504) {
                    Statics.field2795.method3131();
                    class173.field2796 = 1;
                    Statics.field2565 = null;
                } else if (var121 != -1 && field503 != var121 && field502 != 0 && !field504) {
                    class173.method1980(2, Statics.field549, var121, 0, field502, false);
                }
                field503 = var121;
                field311 = -1;
                return true;
            }
            if (field311 == 190) {
                int var122 = field309.method2230();
                if (var122 == 65535) {
                    var122 = -1;
                }
                int var123 = field309.method2255();
                if (field502 != 0 && var122 != -1) {
                    class173.method35(Statics.field2558, var122, 0, field502, false);
                    field504 = true;
                }
                field311 = -1;
                return true;
            }
            if (field311 == 98) {
                int var124 = field309.method2230();
                int var125 = field309.method2192();
                class164 var126 = class164.method619(var125);
                if (var126.field2647 != 1 || var126.field2614 != var124) {
                    var126.field2647 = 1;
                    var126.field2614 = var124;
                    method93(var126);
                }
                field311 = -1;
                return true;
            }
            if (field311 == 7) {
                int var127 = field309.method2230();
                field428 = var127;
                method20(var127);
                class34.method2068(field428);
                for (int var128 = 0; var128 < 100; var128++) {
                    field474[var128] = true;
                }
                field311 = -1;
                return true;
            }
            if (field311 == 78) {
                int var129 = field309.method2151();
                int var130 = field309.method2153();
                class164 var131 = class164.method619(var130);
                if (var131.field2634 != var129 || var129 == -1) {
                    var131.field2634 = var129;
                    var131.field2607 = 0;
                    var131.field2721 = 0;
                    method93(var131);
                }
                field311 = -1;
                return true;
            }
            if (field311 == 187) {
                field298 = field309.method2231();
                field311 = -1;
                return true;
            }
            if (field311 == 52) {
                int var132 = field309.method2153();
                class4 var133 = (class4) field514.method3273((long) var132);
                if (var133 != null) {
                    method2549(var133, true);
                }
                if (field349 != null) {
                    method93(field349);
                    field349 = null;
                }
                field311 = -1;
                return true;
            }
            if (field311 == 233) {
                int var134 = field309.method2172();
                int var135 = field309.method2289();
                int var136 = field309.method2140();
                class4 var137 = (class4) field514.method3273((long) var134);
                if (var137 != null) {
                    method2549(var137, var137.field53 != var135);
                }
                method2(var134, var135, var136);
                field311 = -1;
                return true;
            }
            if (field311 == 115) {
                field309.field1852 += 28;
                if (field309.method2170()) {
                    class141.method480(field309, field309.field1852 - 28);
                }
                field311 = -1;
                return true;
            }
            if (field311 == 165) {
                int var138 = field309.method2230();
                class15 var139 = (class15) class15.field213.method3273((long) var138);
                if (var139 != null) {
                    var139.method3404();
                }
                field455[++field297 - 1 & 0x1F] = var138 & 0x7FFF;
                field311 = -1;
                return true;
            }
            if (field311 == 64) {
                boolean var140 = field309.method2231() == 1;
                if (var140) {
                    Statics.field1935 = class107.method2434() - field309.method2195();
                    Statics.field951 = new class211(field309, true);
                } else {
                    Statics.field951 = null;
                }
                field463 = field452;
                field311 = -1;
                return true;
            }
            if (field311 == 27) {
                int var141 = field309.method2231();
                if (field309.method2231() == 0) {
                    field494[var141] = new class210();
                    field309.field1852 += 18;
                } else {
                    field309.field1852--;
                    field494[var141] = new class210(field309, false);
                }
                field462 = field452;
                field311 = -1;
                return true;
            }
            if (field311 == 15) {
                for (int var142 = 0; var142 < Statics.field1066; var142++) {
                    class48 var143 = Statics.method580(var142);
                    if (var143 != null) {
                        class166.field2741[var142] = 0;
                        class166.field2742[var142] = 0;
                    }
                }
                Statics.method720();
                field454 += 32;
                field311 = -1;
                return true;
            }
            if (field311 == 84) {
                field497 = false;
                for (int var144 = 0; var144 < 5; var144++) {
                    field481[var144] = false;
                }
                field311 = -1;
                return true;
            }
            if (field311 == 154) {
                Statics.method720();
                field433 = field309.method2231();
                field464 = field452;
                field311 = -1;
                return true;
            }
            if (field311 == 194) {
                int var145 = field310 + field309.field1852;
                int var146 = field309.method2307();
                int var147 = field309.method2307();
                if (field428 != var146) {
                    field428 = var146;
                    method20(field428);
                    class34.method2068(field428);
                    for (int var148 = 0; var148 < 100; var148++) {
                        field474[var148] = true;
                    }
                }
                while (var147-- > 0) {
                    int var149 = field309.method2153();
                    int var150 = field309.method2307();
                    int var151 = field309.method2231();
                    class4 var152 = (class4) field514.method3273((long) var149);
                    if (var152 != null && var152.field53 != var150) {
                        method2549(var152, true);
                        var152 = null;
                    }
                    if (var152 == null) {
                        var152 = method2(var149, var150, var151);
                    }
                    var152.field51 = true;
                }
                for (class4 var153 = (class4) field514.method3276(); var153 != null; var153 = (class4) field514.method3277()) {
                    if (var153.field51) {
                        var153.field51 = false;
                    } else {
                        method2549(var153, true);
                    }
                }
                field319 = new class186(512);
                while (field309.field1852 < var145) {
                    int var154 = field309.method2153();
                    int var155 = field309.method2307();
                    int var156 = field309.method2307();
                    int var157 = field309.method2153();
                    for (int var158 = var155; var158 <= var156; var158++) {
                        long var159 = ((long) var154 << 32) + (long) var158;
                        field319.method3274(new class191(var157), var159);
                    }
                }
                field311 = -1;
                return true;
            }
            if (field311 == 147) {
                byte var161 = field309.method2178();
                int var162 = field309.method2230();
                class166.field2741[var162] = var161;
                if (class166.field2742[var162] != var161) {
                    class166.field2742[var162] = var161;
                    method519(var162);
                }
                field453[++field454 - 1 & 0x1F] = var162;
                field311 = -1;
                return true;
            }
            if (field311 == 41) {
                int var163 = field309.method2289();
                if (var163 == 65535) {
                    var163 = -1;
                }
                int var164 = field309.method2172();
                int var165 = field309.method2153();
                int var166 = field309.method2307();
                if (var166 == 65535) {
                    var166 = -1;
                }
                for (int var167 = var163; var167 <= var166; var167++) {
                    long var168 = ((long) var165 << 32) + (long) var167;
                    class198 var170 = field319.method3273(var168);
                    if (var170 != null) {
                        var170.method3404();
                    }
                    field319.method3274(new class191(var164), var168);
                }
                field311 = -1;
                return true;
            }
            if (field311 == 32) {
                String var171 = field309.method2156();
                long var172 = field309.method2195();
                long var174 = (long) field309.method2307();
                long var176 = (long) field309.method2150();
                class143[] var178 = new class143[] { class143.field2104, class143.field2106, class143.field2103, class143.field2105, class143.field2112 };
                class143 var179 = (class143) class101.method3237(var178, field309.method2231());
                long var180 = (var174 << 32) + var176;
                boolean var182 = false;
                for (int var183 = 0; var183 < 100; var183++) {
                    if (field337[var183] == var180) {
                        var182 = true;
                        break;
                    }
                }
                if (var179.field2110 && method2373(var171)) {
                    var182 = true;
                }
                if (!var182 && field477 == 0) {
                    field337[field487] = var180;
                    field487 = (field487 + 1) % 100;
                    class114 var184 = field309;
                    String var188;
                    try {
                        int var185 = var184.method2279();
                        if (var185 > 32767) {
                            var185 = 32767;
                        }
                        byte[] var186 = new byte[var185];
                        var184.field1852 += Statics.field3032.method2078(var184.field1859, var184.field1852, var186, 0, var185);
                        String var187 = Statics.method166(var186, 0, var185);
                        var188 = var187;
                    } catch (Exception var264) {
                        var188 = "Cabbage";
                    }
                    String var191 = class213.method3499(class154.method660(var188));
                    if (var179.field2109 == -1) {
                        class11.method2445(9, var171, var191, class153.method1060(var172));
                    } else {
                        class11.method2445(9, class2.method30(var179.field2109) + var171, var191, class153.method1060(var172));
                    }
                }
                field311 = -1;
                return true;
            }
            if (field311 == 110) {
                Statics.method720();
                int var192 = field309.method2174();
                int var193 = field309.method2172();
                int var194 = field309.method2175();
                field320[var192] = var193;
                field419[var192] = var194;
                field528[var192] = 1;
                for (int var195 = 0; var195 < 98; var195++) {
                    if (var193 >= class146.field2134[var195]) {
                        field528[var192] = var195 + 2;
                    }
                }
                field429[++field371 - 1 & 0x1F] = var192;
                field311 = -1;
                return true;
            }
            if (field311 == 6) {
                while (field309.field1852 < field310) {
                    int var196 = field309.method2231();
                    boolean var197 = (var196 & 0x1) == 1;
                    String var198 = field309.method2156();
                    String var199 = field309.method2156();
                    field309.method2156();
                    for (int var200 = 0; var200 < field524; var200++) {
                        class8 var201 = field526[var200];
                        if (var197) {
                            if (var199.equals(var201.field127)) {
                                var201.field127 = var198;
                                var201.field130 = var199;
                                var198 = null;
                                break;
                            }
                        } else if (var198.equals(var201.field127)) {
                            var201.field127 = var198;
                            var201.field130 = var199;
                            var198 = null;
                            break;
                        }
                    }
                    if (var198 != null && field524 < 400) {
                        class8 var202 = new class8();
                        field526[field524] = var202;
                        var202.field127 = var198;
                        var202.field130 = var199;
                        field524++;
                    }
                }
                field264 = field452;
                field311 = -1;
                return true;
            }
            if (field311 == 225) {
                field283 = field309.method2231();
                if (field283 == 1) {
                    field305 = field309.method2307();
                }
                if (field283 >= 2 && field283 <= 6) {
                    if (field283 == 2) {
                        field289 = 64;
                        field448 = 64;
                    }
                    if (field283 == 3) {
                        field289 = 0;
                        field448 = 64;
                    }
                    if (field283 == 4) {
                        field289 = 128;
                        field448 = 64;
                    }
                    if (field283 == 5) {
                        field289 = 64;
                        field448 = 0;
                    }
                    if (field283 == 6) {
                        field289 = 64;
                        field448 = 128;
                    }
                    field283 = 2;
                    field286 = field309.method2307();
                    field287 = field309.method2307();
                    field288 = field309.method2231();
                }
                if (field283 == 10) {
                    field285 = field309.method2307();
                }
                field311 = -1;
                return true;
            }
            if (field311 == 67) {
                Statics.field208 = field309.method2231();
                Statics.field1354 = field309.method2140();
                while (field309.field1852 < field310) {
                    field311 = field309.method2231();
                    method2488();
                }
                field311 = -1;
                return true;
            }
            if (field311 == 198) {
                int var203 = field309.method2153();
                int var204 = field309.method2307();
                if (var203 < -70000) {
                    var204 += 32768;
                }
                class164 var205;
                if (var203 >= 0) {
                    var205 = class164.method619(var203);
                } else {
                    var205 = null;
                }
                while (field309.field1852 < field310) {
                    int var206 = field309.method2279();
                    int var207 = field309.method2307();
                    int var208 = 0;
                    if (var207 != 0) {
                        var208 = field309.method2231();
                        if (var208 == 255) {
                            var208 = field309.method2153();
                        }
                    }
                    if (var205 != null && var206 >= 0 && var206 < var205.field2716.length) {
                        var205.field2716[var206] = var207;
                        var205.field2717[var206] = var208;
                    }
                    class15.method140(var204, var206, var207 - 1, var208);
                }
                if (var205 != null) {
                    method93(var205);
                }
                Statics.method720();
                field455[++field297 - 1 & 0x1F] = var204 & 0x7FFF;
                field311 = -1;
                return true;
            }
            if (field311 == 99) {
                int var209 = field309.method2184();
                int var210 = field309.method2172();
                class164 var211 = class164.method619(var210);
                if (var211 != null && var211.field2613 == 0) {
                    if (var209 > var211.field2627 - var211.field2621) {
                        var209 = var211.field2627 - var211.field2621;
                    }
                    if (var209 < 0) {
                        var209 = 0;
                    }
                    if (var211.field2625 != var209) {
                        var211.field2625 = var209;
                        method93(var211);
                    }
                }
                field311 = -1;
                return true;
            }
            if (field311 == 171) {
                for (int var212 = 0; var212 < class166.field2742.length; var212++) {
                    if (class166.field2742[var212] != class166.field2741[var212]) {
                        class166.field2742[var212] = class166.field2741[var212];
                        method519(var212);
                        field453[++field454 - 1 & 0x1F] = var212;
                    }
                }
                field311 = -1;
                return true;
            }
            if (field311 == 176) {
                String var213 = field309.method2156();
                int var214 = field309.method2174();
                int var215 = field309.method2140();
                if (var215 >= 1 && var215 <= 8) {
                    if (var213.equalsIgnoreCase("null")) {
                        var213 = null;
                    }
                    field397[var215 - 1] = var213;
                    field307[var215 - 1] = var214 == 0;
                }
                field311 = -1;
                return true;
            }
            if (field311 == 34) {
                while (field309.field1852 < field310) {
                    boolean var216 = field309.method2231() == 1;
                    String var217 = field309.method2156();
                    String var218 = field309.method2156();
                    int var219 = field309.method2307();
                    int var220 = field309.method2231();
                    int var221 = field309.method2231();
                    boolean var222 = (var221 & 0x2) != 0;
                    boolean var223 = (var221 & 0x1) != 0;
                    if (var219 > 0) {
                        field309.method2156();
                        field309.method2231();
                        field309.method2153();
                    }
                    field309.method2156();
                    for (int var224 = 0; var224 < field471; var224++) {
                        class17 var225 = field522[var224];
                        if (var216) {
                            if (var218.equals(var225.field238)) {
                                var225.field238 = var217;
                                var225.field235 = var218;
                                var217 = null;
                                break;
                            }
                        } else if (var217.equals(var225.field238)) {
                            if (var225.field245 != var219) {
                                boolean var226 = true;
                                for (class36 var227 = (class36) field301.method3263(); var227 != null; var227 = (class36) field301.method3272()) {
                                    if (var227.field803.equals(var217)) {
                                        if (var219 != 0 && var227.field804 == 0) {
                                            var227.method3396();
                                            var226 = false;
                                        } else if (var219 == 0 && var227.field804 != 0) {
                                            var227.method3396();
                                            var226 = false;
                                        }
                                    }
                                }
                                if (var226) {
                                    field301.method3262(new class36(var217, var219));
                                }
                                var225.field245 = var219;
                            }
                            var225.field235 = var218;
                            var225.field237 = var220;
                            var225.field240 = var222;
                            var225.field239 = var223;
                            var217 = null;
                            break;
                        }
                    }
                    if (var217 != null && field471 < 400) {
                        class17 var228 = new class17();
                        field522[field471] = var228;
                        var228.field238 = var217;
                        var228.field235 = var218;
                        var228.field245 = var219;
                        var228.field237 = var220;
                        var228.field240 = var222;
                        var228.field239 = var223;
                        field471++;
                    }
                }
                field384 = 2;
                field264 = field452;
                boolean var229 = false;
                int var230 = field471;
                while (var230 > 0) {
                    boolean var231 = true;
                    var230--;
                    for (int var232 = 0; var232 < var230; var232++) {
                        boolean var233 = false;
                        class17 var234 = field522[var232];
                        class17 var235 = field522[var232 + 1];
                        if (field493 != var234.field245 && field493 == var235.field245) {
                            var233 = true;
                        }
                        if (!var233 && var234.field245 == 0 && var235.field245 != 0) {
                            var233 = true;
                        }
                        if (!var233 && !var234.field240 && var235.field240) {
                            var233 = true;
                        }
                        if (!var233 && !var234.field239 && var235.field239) {
                            var233 = true;
                        }
                        if (var233) {
                            class17 var236 = field522[var232];
                            field522[var232] = field522[var232 + 1];
                            field522[var232 + 1] = var236;
                            var231 = false;
                        }
                    }
                    if (var231) {
                        break;
                    }
                }
                field311 = -1;
                return true;
            }
            if (field311 == 81) {
                int var237 = field309.method2153();
                class164 var238 = class164.method619(var237);
                var238.field2647 = 3;
                var238.field2614 = Statics.field393.field29.method3029();
                method93(var238);
                field311 = -1;
                return true;
            }
            if (field311 == 173) {
                method2704(false);
                field311 = -1;
                return true;
            }
            if (field311 == 120) {
                int var239 = field309.method2184();
                int var240 = field309.method2230();
                int var241 = field309.method2184();
                int var242 = field309.method2172();
                class164 var243 = class164.method619(var242);
                if (var243.field2629 != var241 || var243.field2660 != var239 || var243.field2683 != var240) {
                    var243.field2629 = var241;
                    var243.field2660 = var239;
                    var243.field2683 = var240;
                    method93(var243);
                }
                field311 = -1;
                return true;
            }
            if (field311 == 46) {
                int var244 = field309.method2289();
                int var245 = field309.method2193();
                class164 var246 = class164.method619(var245);
                if (var246.field2647 != 2 || var246.field2614 != var244) {
                    var246.field2647 = 2;
                    var246.field2614 = var244;
                    method93(var246);
                }
                field311 = -1;
                return true;
            }
            if (field311 == 205) {
                String var247 = field309.method2156();
                class114 var248 = field309;
                String var252;
                try {
                    int var249 = var248.method2279();
                    if (var249 > 32767) {
                        var249 = 32767;
                    }
                    byte[] var250 = new byte[var249];
                    var248.field1852 += Statics.field3032.method2078(var248.field1859, var248.field1852, var250, 0, var249);
                    String var251 = Statics.method166(var250, 0, var249);
                    var252 = var251;
                } catch (Exception var263) {
                    var252 = "Cabbage";
                }
                String var255 = class213.method3499(class154.method660(var252));
                class11.method3012(6, var247, var255);
                field311 = -1;
                return true;
            }
            if (field311 == 59) {
                int var256 = field309.method2307();
                int var257 = field309.method2231();
                int var258 = field309.method2307();
                method2709(var256, var257, var258);
                field311 = -1;
                return true;
            }
            if (field311 == 83) {
                field499 = field309.method2231();
                if (field499 == 255) {
                    field499 = 0;
                }
                field500 = field309.method2231();
                if (field500 == 255) {
                    field500 = 0;
                }
                field311 = -1;
                return true;
            }
            class140.method1379("" + field311 + class2.field15 + field375 + class2.field15 + field317 + class2.field15 + field310, (Throwable) null);
            method2985();
        } catch (IOException var266) {
            method489();
        } catch (Exception var267) {
            String var261 = "" + field311 + class2.field15 + field375 + class2.field15 + field317 + class2.field15 + field310 + class2.field15 + (Statics.field1280 + Statics.field393.field795[0]) + class2.field15 + (Statics.field1910 + Statics.field393.field796[0]) + class2.field15;
            for (int var262 = 0; var262 < field310 && var262 < 50; var262++) {
                var261 = var261 + field309.field1859[var262] + class2.field15;
            }
            class140.method1379(var261, var267);
            method2985();
        }
        return true;
    }

    @ObfuscatedName("dw.bn(B)V")
    public static final void method2488() {
        if (field311 == 2) {
            int var0 = field309.method2231();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1354;
            int var2 = (var0 & 0x7) + Statics.field208;
            int var3 = field309.method2307();
            int var4 = field309.method2231();
            int var5 = field309.method2307();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var6 = var1 * 128 + 64;
                int var7 = var2 * 128 + 64;
                class28 var8 = new class28(var3, Statics.field2988, var6, var7, method836(var6, var7, Statics.field2988) - var4, var5, field275);
                field404.method3327(var8);
            }
        } else if (field311 == 253) {
            int var9 = field309.method2231();
            int var10 = (var9 >> 4 & 0x7) + Statics.field1354;
            int var11 = (var9 & 0x7) + Statics.field208;
            int var12 = field309.method2307();
            int var13 = field309.method2307();
            int var14 = field309.method2307();
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                class189 var15 = field273[Statics.field2988][var10][var11];
                if (var15 != null) {
                    for (class27 var16 = (class27) var15.method3309(); var16 != null; var16 = (class27) var15.method3311()) {
                        if ((var12 & 0x7FFF) == var16.field627 && var16.field625 == var13) {
                            var16.field625 = var14;
                            break;
                        }
                    }
                    method835(var10, var11);
                }
            }
        } else if (field311 == 82) {
            int var17 = field309.method2175();
            int var18 = (var17 >> 4 & 0x7) + Statics.field1354;
            int var19 = (var17 & 0x7) + Statics.field208;
            int var20 = field309.method2230();
            int var21 = field309.method2289();
            if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                class27 var22 = new class27();
                var22.field627 = var21;
                var22.field625 = var20;
                if (field273[Statics.field2988][var18][var19] == null) {
                    field273[Statics.field2988][var18][var19] = new class189();
                }
                field273[Statics.field2988][var18][var19].method3327(var22);
                method835(var18, var19);
            }
        } else if (field311 == 70) {
            int var23 = field309.method2174();
            int var24 = (var23 >> 4 & 0x7) + Statics.field1354;
            int var25 = (var23 & 0x7) + Statics.field208;
            int var26 = field309.method2230();
            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                class189 var27 = field273[Statics.field2988][var24][var25];
                if (var27 != null) {
                    for (class27 var28 = (class27) var27.method3309(); var28 != null; var28 = (class27) var27.method3311()) {
                        if ((var26 & 0x7FFF) == var28.field627) {
                            var28.method3404();
                            break;
                        }
                    }
                    if (var27.method3309() == null) {
                        field273[Statics.field2988][var24][var25] = null;
                    }
                    method835(var24, var25);
                }
            }
        } else if (field311 == 249) {
            int var29 = field309.method2140();
            int var30 = (var29 >> 4 & 0x7) + Statics.field1354;
            int var31 = (var29 & 0x7) + Statics.field208;
            int var32 = field309.method2174();
            int var33 = var32 >> 2;
            int var34 = var32 & 0x3;
            int var35 = field328[var33];
            int var36 = field309.method2307();
            if (var30 >= 0 && var31 >= 0 && var30 < 103 && var31 < 103) {
                if (var35 == 0) {
                    class82 var37 = Statics.field191.method1671(Statics.field2988, var30, var31);
                    if (var37 != null) {
                        int var38 = var37.field1419 >> 14 & 0x7FFF;
                        if (var33 == 2) {
                            var37.field1422 = new class12(var38, 2, var34 + 4, Statics.field2988, var30, var31, var36, false, var37.field1422);
                            var37.field1425 = new class12(var38, 2, var34 + 1 & 0x3, Statics.field2988, var30, var31, var36, false, var37.field1425);
                        } else {
                            var37.field1422 = new class12(var38, var33, var34, Statics.field2988, var30, var31, var36, false, var37.field1422);
                        }
                    }
                }
                if (var35 == 1) {
                    class89 var39 = Statics.field191.method1697(Statics.field2988, var30, var31);
                    if (var39 != null) {
                        int var40 = var39.field1496 >> 14 & 0x7FFF;
                        if (var33 == 4 || var33 == 5) {
                            var39.field1498 = new class12(var40, 4, var34, Statics.field2988, var30, var31, var36, false, var39.field1498);
                        } else if (var33 == 6) {
                            var39.field1498 = new class12(var40, 4, var34 + 4, Statics.field2988, var30, var31, var36, false, var39.field1498);
                        } else if (var33 == 7) {
                            var39.field1498 = new class12(var40, 4, (var34 + 2 & 0x3) + 4, Statics.field2988, var30, var31, var36, false, var39.field1498);
                        } else if (var33 == 8) {
                            var39.field1498 = new class12(var40, 4, var34 + 4, Statics.field2988, var30, var31, var36, false, var39.field1498);
                            var39.field1499 = new class12(var40, 4, (var34 + 2 & 0x3) + 4, Statics.field2988, var30, var31, var36, false, var39.field1499);
                        }
                    }
                }
                if (var35 == 2) {
                    class93 var41 = Statics.field191.method1640(Statics.field2988, var30, var31);
                    if (var33 == 11) {
                        var33 = 10;
                    }
                    if (var41 != null) {
                        var41.field1550 = new class12(var41.field1558 >> 14 & 0x7FFF, var33, var34, Statics.field2988, var30, var31, var36, false, var41.field1550);
                    }
                }
                if (var35 == 3) {
                    class88 var42 = Statics.field191.method1641(Statics.field2988, var30, var31);
                    if (var42 != null) {
                        var42.field1488 = new class12(var42.field1486 >> 14 & 0x7FFF, 22, var34, Statics.field2988, var30, var31, var36, false, var42.field1488);
                    }
                }
            }
        } else {
            if (field311 == 222) {
                int var43 = field309.method2231();
                int var44 = (var43 >> 4 & 0x7) + Statics.field1354;
                int var45 = (var43 & 0x7) + Statics.field208;
                int var46 = field309.method2307();
                int var47 = field309.method2231();
                int var48 = var47 >> 4 & 0xF;
                int var49 = var47 & 0x7;
                int var50 = field309.method2231();
                if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                    int var51 = var48 + 1;
                    if (Statics.field393.field795[0] >= var44 - var51 && Statics.field393.field795[0] <= var44 + var51 && Statics.field393.field796[0] >= var45 - var51 && Statics.field393.field796[0] <= var45 + var51 && field352 != 0 && var49 > 0 && field507 < 50) {
                        field508[field507] = var46;
                        field509[field507] = var49;
                        field510[field507] = var50;
                        field356[field507] = null;
                        field511[field507] = (var44 << 16) + (var45 << 8) + var48;
                        field507++;
                    }
                }
            }
            if (field311 == 238) {
                int var52 = field309.method2175();
                int var53 = (var52 >> 4 & 0x7) + Statics.field1354;
                int var54 = (var52 & 0x7) + Statics.field208;
                int var55 = field309.method2140();
                int var56 = var55 >> 2;
                int var57 = var55 & 0x3;
                int var58 = field328[var56];
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                    method538(Statics.field2988, var53, var54, var58, -1, var56, var57, 0, -1);
                }
            } else if (field311 == 167) {
                int var59 = field309.method2175();
                int var60 = var59 >> 2;
                int var61 = var59 & 0x3;
                int var62 = field328[var60];
                int var63 = field309.method2307();
                int var64 = field309.method2140();
                int var65 = (var64 >> 4 & 0x7) + Statics.field1354;
                int var66 = (var64 & 0x7) + Statics.field208;
                if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                    method538(Statics.field2988, var65, var66, var62, var63, var60, var61, 0, -1);
                }
            } else {
                if (field311 == 234) {
                    int var67 = field309.method2289();
                    byte var68 = field309.method2178();
                    int var69 = field309.method2231();
                    int var70 = (var69 >> 4 & 0x7) + Statics.field1354;
                    int var71 = (var69 & 0x7) + Statics.field208;
                    int var72 = field309.method2307();
                    int var73 = field309.method2175();
                    int var74 = var73 >> 2;
                    int var75 = var73 & 0x3;
                    int var76 = field328[var74];
                    int var77 = field309.method2230();
                    byte var78 = field309.method2243();
                    byte var79 = field309.method2243();
                    int var80 = field309.method2184();
                    byte var81 = field309.method2243();
                    class3 var82;
                    if (field391 == var80) {
                        var82 = Statics.field393;
                    } else {
                        var82 = field385[var80];
                    }
                    if (var82 != null) {
                        class38 var83 = class38.method2727(var67);
                        int var84;
                        int var85;
                        if (var75 == 1 || var75 == 3) {
                            var84 = var83.field865;
                            var85 = var83.field863;
                        } else {
                            var84 = var83.field863;
                            var85 = var83.field865;
                        }
                        int var86 = (var84 >> 1) + var70;
                        int var87 = (var84 + 1 >> 1) + var70;
                        int var88 = (var85 >> 1) + var71;
                        int var89 = (var85 + 1 >> 1) + var71;
                        int[][] var90 = class6.field77[Statics.field2988];
                        int var91 = var90[var86][var88] + var90[var87][var88] + var90[var86][var89] + var90[var87][var89] >> 2;
                        int var92 = (var70 << 7) + (var84 << 6);
                        int var93 = (var71 << 7) + (var85 << 6);
                        class100 var94 = var83.method692(var74, var75, var90, var92, var91, var93);
                        if (var94 != null) {
                            method538(Statics.field2988, var70, var71, var76, -1, 0, 0, var72 + 1, var77 + 1);
                            var82.field35 = field275 + var72;
                            var82.field36 = field275 + var77;
                            var82.field40 = var94;
                            var82.field46 = var70 * 128 + var84 * 64;
                            var82.field39 = var71 * 128 + var85 * 64;
                            var82.field28 = var91;
                            if (var79 > var68) {
                                byte var95 = var79;
                                var79 = var68;
                                var68 = var95;
                            }
                            if (var78 > var81) {
                                byte var96 = var78;
                                var78 = var81;
                                var81 = var96;
                            }
                            var82.field48 = var70 + var79;
                            var82.field43 = var68 + var70;
                            var82.field42 = var71 + var78;
                            var82.field44 = var71 + var81;
                        }
                    }
                }
                if (field311 == 240) {
                    int var97 = field309.method2231();
                    int var98 = (var97 >> 4 & 0x7) + Statics.field1354;
                    int var99 = (var97 & 0x7) + Statics.field208;
                    int var100 = var98 + field309.method2149();
                    int var101 = var99 + field309.method2149();
                    int var102 = field309.method2151();
                    int var103 = field309.method2307();
                    int var104 = field309.method2231() * 4;
                    int var105 = field309.method2231() * 4;
                    int var106 = field309.method2307();
                    int var107 = field309.method2307();
                    int var108 = field309.method2231();
                    int var109 = field309.method2231();
                    if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                        int var110 = var98 * 128 + 64;
                        int var111 = var99 * 128 + 64;
                        int var112 = var100 * 128 + 64;
                        int var113 = var101 * 128 + 64;
                        class7 var114 = new class7(var103, Statics.field2988, var110, var111, method836(var110, var111, Statics.field2988) - var104, field275 + var106, field275 + var107, var108, var109, var102, var105);
                        var114.method84(var112, var113, method836(var112, var113, Statics.field2988) - var105, field275 + var106);
                        field486.method3327(var114);
                    }
                }
            }
        }
    }

    @ObfuscatedName("an.bz(IIIIIIIIII)V")
    public static final void method538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class16 var9 = null;
        for (class16 var10 = (class16) field282.method3309(); var10 != null; var10 = (class16) field282.method3311()) {
            if (var10.field221 == arg0 && var10.field220 == arg1 && var10.field227 == arg2 && var10.field219 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class16();
            var9.field221 = arg0;
            var9.field219 = arg3;
            var9.field220 = arg1;
            var9.field227 = arg2;
            method169(var9);
            field282.method3327(var9);
        }
        var9.field225 = arg4;
        var9.field222 = arg5;
        var9.field233 = arg6;
        var9.field228 = arg7;
        var9.field229 = arg8;
    }

    @ObfuscatedName("j.bx(Ld;B)V")
    public static final void method169(class16 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field219 == 0) {
            var1 = Statics.field191.method1636(arg0.field221, arg0.field220, arg0.field227);
        }
        if (arg0.field219 == 1) {
            var1 = Statics.field191.method1643(arg0.field221, arg0.field220, arg0.field227);
        }
        if (arg0.field219 == 2) {
            var1 = Statics.field191.method1644(arg0.field221, arg0.field220, arg0.field227);
        }
        if (arg0.field219 == 3) {
            var1 = Statics.field191.method1645(arg0.field221, arg0.field220, arg0.field227);
        }
        if (var1 != 0) {
            int var5 = Statics.field191.method1646(arg0.field221, arg0.field220, arg0.field227, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field226 = var2;
        arg0.field224 = var3;
        arg0.field223 = var4;
    }

    @ObfuscatedName("ar.bs(I)V")
    public static final void method902() {
        for (class16 var0 = (class16) field282.method3309(); var0 != null; var0 = (class16) field282.method3311()) {
            if (var0.field229 > 0) {
                var0.field229--;
            }
            if (var0.field229 == 0) {
                if (var0.field226 >= 0) {
                    int var1 = var0.field226;
                    int var2 = var0.field224;
                    class38 var3 = class38.method2727(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method665(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method150(var0.field221, var0.field219, var0.field220, var0.field227, var0.field226, var0.field223, var0.field224);
                var0.method3404();
            } else {
                if (var0.field228 > 0) {
                    var0.field228--;
                }
                if (var0.field228 == 0 && var0.field220 >= 1 && var0.field227 >= 1 && var0.field220 <= 102 && var0.field227 <= 102) {
                    if (var0.field225 >= 0) {
                        int var5 = var0.field225;
                        int var6 = var0.field222;
                        class38 var7 = class38.method2727(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method665(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method150(var0.field221, var0.field219, var0.field220, var0.field227, var0.field225, var0.field233, var0.field222);
                    var0.field228 = -1;
                    if (var0.field226 == var0.field225 && var0.field226 == -1) {
                        var0.method3404();
                    } else if (var0.field226 == var0.field225 && var0.field233 == var0.field223 && var0.field224 == var0.field222) {
                        var0.method3404();
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.bt(IIIIIIIB)V")
    public static final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field271 && Statics.field2988 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field191.method1636(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field191.method1643(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field191.method1644(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field191.method1645(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field191.method1646(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field191.method1633(arg0, arg2, arg3);
                class38 var15 = class38.method2727(var12);
                if (var15.field849 != 0) {
                    field325[arg0].method3635(arg2, arg3, var13, var14, var15.field867);
                }
            }
            if (arg1 == 1) {
                Statics.field191.method1634(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field191.method1635(arg0, arg2, arg3);
                class38 var16 = class38.method2727(var12);
                if (var16.field863 + arg2 > 103 || var16.field863 + arg3 > 103 || var16.field865 + arg2 > 103 || var16.field865 + arg3 > 103) {
                    return;
                }
                if (var16.field849 != 0) {
                    field325[arg0].method3636(arg2, arg3, var16.field863, var16.field865, var14, var16.field867);
                }
            }
            if (arg1 == 3) {
                Statics.field191.method1727(arg0, arg2, arg3);
                class38 var17 = class38.method2727(var12);
                if (var17.field849 == 1) {
                    field325[arg0].method3651(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field73[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method148(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field191, field325[arg0]);
    }

    @ObfuscatedName("au.by(IIB)V")
    public static final void method835(int arg0, int arg1) {
        class189 var2 = field273[Statics.field2988][arg0][arg1];
        if (var2 == null) {
            Statics.field191.method1637(Statics.field2988, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class27 var5 = null;
        for (class27 var6 = (class27) var2.method3309(); var6 != null; var6 = (class27) var2.method3311()) {
            class47 var7 = class47.method832(var6.field627);
            long var8 = (long) var7.field1033;
            if (var7.field1032 == 1) {
                var8 = (long) (var6.field625 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field191.method1637(Statics.field2988, arg0, arg1);
            return;
        }
        var2.method3305(var5);
        class27 var10 = null;
        class27 var11 = null;
        for (class27 var12 = (class27) var2.method3309(); var12 != null; var12 = (class27) var2.method3311()) {
            if (var5.field627 != var12.field627) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field627 != var12.field627 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field191.method1681(Statics.field2988, arg0, arg1, method836(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2988), var5, var13, var10, var11);
    }

    @ObfuscatedName("dm.ba(I)V")
    public static final void method2416() {
        field394 = 0;
        field388 = 0;
        field309.method2376();
        int var0 = field309.method2378(1);
        if (var0 != 0) {
            int var1 = field309.method2378(2);
            if (var1 == 0) {
                field389[++field388 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field309.method2378(3);
                Statics.field393.method610(var2, false);
                int var3 = field309.method2378(1);
                if (var3 == 1) {
                    field389[++field388 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field309.method2378(3);
                Statics.field393.method610(var4, true);
                int var5 = field309.method2378(3);
                Statics.field393.method610(var5, true);
                int var6 = field309.method2378(1);
                if (var6 == 1) {
                    field389[++field388 - 1] = 2047;
                }
            } else if (var1 == 3) {
                Statics.field2988 = field309.method2378(2);
                int var7 = field309.method2378(7);
                int var8 = field309.method2378(1);
                int var9 = field309.method2378(7);
                int var10 = field309.method2378(1);
                if (var10 == 1) {
                    field389[++field388 - 1] = 2047;
                }
                Statics.field393.method604(var7, var9, var8 == 1);
            }
        }
        method36();
        method2941();
        for (int var11 = 0; var11 < field388; var11++) {
            int var12 = field389[var11];
            class3 var13 = field385[var12];
            int var14 = field309.method2231();
            if ((var14 & 0x10) != 0) {
                var14 += field309.method2231() << 8;
            }
            method2707(var12, var13, var14);
        }
        for (int var15 = 0; var15 < field394; var15++) {
            int var16 = field395[var15];
            if (field275 != field385[var16].field775) {
                field385[var16] = null;
            }
        }
        if (field310 != field309.field1852) {
            throw new RuntimeException(field309.field1852 + class2.field15 + field310);
        }
        for (int var17 = 0; var17 < field386; var17++) {
            if (field385[field387[var17]] == null) {
                throw new RuntimeException(var17 + class2.field15 + field386);
            }
        }
    }

    @ObfuscatedName("n.bv(B)V")
    public static final void method36() {
        int var0 = field309.method2378(8);
        if (var0 < field386) {
            for (int var1 = var0; var1 < field386; var1++) {
                field395[++field394 - 1] = field387[var1];
            }
        }
        if (var0 > field386) {
            throw new RuntimeException("");
        }
        field386 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field387[var2];
            class3 var4 = field385[var3];
            int var5 = field309.method2378(1);
            if (var5 == 0) {
                field387[++field386 - 1] = var3;
                var4.field775 = field275;
            } else {
                int var6 = field309.method2378(2);
                if (var6 == 0) {
                    field387[++field386 - 1] = var3;
                    var4.field775 = field275;
                    field389[++field388 - 1] = var3;
                } else if (var6 == 1) {
                    field387[++field386 - 1] = var3;
                    var4.field775 = field275;
                    int var7 = field309.method2378(3);
                    var4.method610(var7, false);
                    int var8 = field309.method2378(1);
                    if (var8 == 1) {
                        field389[++field388 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field387[++field386 - 1] = var3;
                    var4.field775 = field275;
                    int var9 = field309.method2378(3);
                    var4.method610(var9, true);
                    int var10 = field309.method2378(3);
                    var4.method610(var10, true);
                    int var11 = field309.method2378(1);
                    if (var11 == 1) {
                        field389[++field388 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field395[++field394 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("fn.bc(I)V")
    public static final void method2941() {
        while (true) {
            if (field309.method2389(field310) >= 11) {
                int var0 = field309.method2378(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field385[var0] == null) {
                        field385[var0] = new class3();
                        if (field390[var0] != null) {
                            field385[var0].method13(field390[var0]);
                        }
                        var1 = true;
                    }
                    field387[++field386 - 1] = var0;
                    class3 var2 = field385[var0];
                    var2.field775 = field275;
                    int var3 = field309.method2378(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field309.method2378(1);
                    int var5 = field309.method2378(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field399[field309.method2378(3)];
                    if (var1) {
                        var2.field740 = var2.field769 = var6;
                    }
                    int var7 = field309.method2378(1);
                    if (var7 == 1) {
                        field389[++field388 - 1] = var0;
                    }
                    var2.method604(Statics.field393.field795[0] + var5, Statics.field393.field796[0] + var3, var4 == 1);
                    continue;
                }
            }
            field309.method2379();
            return;
        }
    }

    @ObfuscatedName("ev.bq(ILh;IB)V")
    public static final void method2707(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x8) != 0) {
            int var3 = field309.method2289();
            class143[] var4 = new class143[] { class143.field2104, class143.field2106, class143.field2103, class143.field2105, class143.field2112 };
            class143 var5 = (class143) class101.method3237(var4, field309.method2231());
            boolean var6 = field309.method2175() == 1;
            int var7 = field309.method2140();
            int var8 = field309.field1852;
            if (arg1.field37 != null && arg1.field29 != null) {
                boolean var9 = false;
                if (var5.field2110 && method2373(arg1.field37)) {
                    var9 = true;
                }
                if (!var9 && field477 == 0 && !arg1.field47) {
                    field291.field1852 = 0;
                    field309.method2194(field291.field1859, 0, var7);
                    field291.field1852 = 0;
                    class111 var10 = field291;
                    String var14;
                    try {
                        int var11 = var10.method2279();
                        if (var11 > 32767) {
                            var11 = 32767;
                        }
                        byte[] var12 = new byte[var11];
                        var10.field1852 += Statics.field3032.method2078(var10.field1859, var10.field1852, var12, 0, var11);
                        String var13 = Statics.method166(var12, 0, var11);
                        var14 = var13;
                    } catch (Exception var29) {
                        var14 = "Cabbage";
                    }
                    String var17 = class213.method3499(class154.method660(var14));
                    arg1.field753 = var17.trim();
                    arg1.field757 = var3 >> 8;
                    arg1.field751 = var3 & 0xFF;
                    arg1.field756 = 150;
                    arg1.field781 = var6;
                    arg1.field755 = Statics.field393 != arg1 && var5.field2110 && field485 != "" && var17.toLowerCase().indexOf(field485) == -1;
                    int var18;
                    if (var5.field2114) {
                        var18 = var6 ? 91 : 1;
                    } else {
                        var18 = var6 ? 90 : 2;
                    }
                    if (var5.field2109 == -1) {
                        class11.method3012(var18, arg1.field37, var17);
                    } else {
                        class11.method3012(var18, class2.method30(var5.field2109) + arg1.field37, var17);
                    }
                }
            }
            field309.field1852 = var7 + var8;
        }
        if ((arg2 & 0x2) != 0) {
            int var19 = field309.method2231();
            byte[] var20 = new byte[var19];
            class111 var21 = new class111(var20);
            field309.method2194(var20, 0, var19);
            field390[arg0] = var21;
            arg1.method13(var21);
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field753 = field309.method2156();
            if (arg1.field753.charAt(0) == '~') {
                arg1.field753 = arg1.field753.substring(1);
                class11.method3012(2, arg1.field37, arg1.field753);
            } else if (Statics.field393 == arg1) {
                class11.method3012(2, arg1.field37, arg1.field753);
            }
            arg1.field781 = false;
            arg1.field757 = 0;
            arg1.field751 = 0;
            arg1.field756 = 150;
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field797 = field309.method2307();
            if (arg1.field797 == 65535) {
                arg1.field797 = -1;
            }
        }
        if ((arg2 & 0x4) != 0) {
            int var22 = field309.method2307();
            int var23 = field309.method2231();
            arg1.method606(var22, var23, field275);
            arg1.field763 = field275 + 300;
            arg1.field741 = field309.method2140();
            arg1.field765 = field309.method2174();
        }
        if ((arg2 & 0x1) != 0) {
            int var24 = field309.method2184();
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = field309.method2175();
            method1614(arg1, var24, var25);
        }
        if ((arg2 & 0x200) != 0) {
            int var26 = field309.method2184();
            int var27 = field309.method2175();
            arg1.method606(var26, var27, field275);
            arg1.field763 = field275 + 300;
            arg1.field741 = field309.method2175();
            arg1.field765 = field309.method2140();
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field767 = field309.method2184();
            arg1.field768 = field309.method2230();
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field782 = field309.method2174();
            arg1.field784 = field309.method2174();
            arg1.field791 = field309.method2231();
            arg1.field785 = field309.method2175();
            arg1.field786 = field309.method2230() + field275;
            arg1.field752 = field309.method2230() + field275;
            arg1.field788 = field309.method2231();
            arg1.field794 = 1;
            arg1.field799 = 0;
        }
        if ((arg2 & 0x100) == 0) {
            return;
        }
        arg1.field777 = field309.method2307();
        int var28 = field309.method2192();
        arg1.field772 = var28 >> 16;
        arg1.field760 = (var28 & 0xFFFF) + field275;
        arg1.field778 = 0;
        arg1.field779 = 0;
        if (arg1.field760 > field275) {
            arg1.field778 = -1;
        }
        if (arg1.field777 == 65535) {
            arg1.field777 = -1;
        }
    }

    @ObfuscatedName("ck.bw(ZI)V")
    public static final void method1607(boolean arg0) {
        field394 = 0;
        field388 = 0;
        method113();
        method167(arg0);
        for (int var1 = 0; var1 < field388; var1++) {
            int var2 = field389[var1];
            class32 var3 = field304[var2];
            int var4 = field309.method2231();
            if ((var4 & 0x4) != 0) {
                var3.field777 = field309.method2184();
                int var5 = field309.method2193();
                var3.field772 = var5 >> 16;
                var3.field760 = (var5 & 0xFFFF) + field275;
                var3.field778 = 0;
                var3.field779 = 0;
                if (var3.field760 > field275) {
                    var3.field778 = -1;
                }
                if (var3.field777 == 65535) {
                    var3.field777 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field767 = field309.method2307();
                var3.field768 = field309.method2289();
            }
            if ((var4 & 0x20) != 0) {
                int var6 = field309.method2175();
                int var7 = field309.method2174();
                var3.method606(var6, var7, field275);
                var3.field763 = field275 + 300;
                var3.field741 = field309.method2289();
                var3.field765 = field309.method2230();
            }
            if ((var4 & 0x10) != 0) {
                int var8 = field309.method2184();
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = field309.method2175();
                if (var3.field783 == var8 && var8 != -1) {
                    int var10 = class40.method575(var8).field928;
                    if (var10 == 1) {
                        var3.field773 = 0;
                        var3.field780 = 0;
                        var3.field789 = var9;
                        var3.field776 = 0;
                    }
                    if (var10 == 2) {
                        var3.field776 = 0;
                    }
                } else if (var8 == -1 || var3.field783 == -1 || class40.method575(var8).field922 >= class40.method575(var3.field783).field922) {
                    var3.field783 = var8;
                    var3.field773 = 0;
                    var3.field780 = 0;
                    var3.field789 = var9;
                    var3.field776 = 0;
                    var3.field799 = var3.field794;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field753 = field309.method2156();
                var3.field756 = 100;
            }
            if ((var4 & 0x80) != 0) {
                int var11 = field309.method2140();
                int var12 = field309.method2231();
                var3.method606(var11, var12, field275);
                var3.field763 = field275 + 300;
                var3.field741 = field309.method2230();
                var3.field765 = field309.method2230();
            }
            if ((var4 & 0x40) != 0) {
                var3.field797 = field309.method2289();
                if (var3.field797 == 65535) {
                    var3.field797 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field714 = class37.method1870(field309.method2289());
                var3.field744 = var3.field714.field815;
                var3.field793 = var3.field714.field838;
                var3.field748 = var3.field714.field821;
                var3.field749 = var3.field714.field822;
                var3.field750 = var3.field714.field827;
                var3.field800 = var3.field714.field830;
                var3.field745 = var3.field714.field835;
                var3.field746 = var3.field714.field819;
                var3.field747 = var3.field714.field820;
            }
        }
        for (int var13 = 0; var13 < field394; var13++) {
            int var14 = field395[var13];
            if (field275 != field304[var14].field775) {
                field304[var14].field714 = null;
                field304[var14] = null;
            }
        }
        if (field310 != field309.field1852) {
            throw new RuntimeException(field309.field1852 + class2.field15 + field310);
        }
        for (int var15 = 0; var15 < field378; var15++) {
            if (field304[field306[var15]] == null) {
                throw new RuntimeException(var15 + class2.field15 + field378);
            }
        }
    }

    @ObfuscatedName("k.bl(B)V")
    public static final void method113() {
        field309.method2376();
        int var0 = field309.method2378(8);
        if (var0 < field378) {
            for (int var1 = var0; var1 < field378; var1++) {
                field395[++field394 - 1] = field306[var1];
            }
        }
        if (var0 > field378) {
            throw new RuntimeException("");
        }
        field378 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field306[var2];
            class32 var4 = field304[var3];
            int var5 = field309.method2378(1);
            if (var5 == 0) {
                field306[++field378 - 1] = var3;
                var4.field775 = field275;
            } else {
                int var6 = field309.method2378(2);
                if (var6 == 0) {
                    field306[++field378 - 1] = var3;
                    var4.field775 = field275;
                    field389[++field388 - 1] = var3;
                } else if (var6 == 1) {
                    field306[++field378 - 1] = var3;
                    var4.field775 = field275;
                    int var7 = field309.method2378(3);
                    var4.method610(var7, false);
                    int var8 = field309.method2378(1);
                    if (var8 == 1) {
                        field389[++field388 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field306[++field378 - 1] = var3;
                    var4.field775 = field275;
                    int var9 = field309.method2378(3);
                    var4.method610(var9, true);
                    int var10 = field309.method2378(3);
                    var4.method610(var10, true);
                    int var11 = field309.method2378(1);
                    if (var11 == 1) {
                        field389[++field388 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field395[++field394 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("j.bg(ZI)V")
    public static final void method167(boolean arg0) {
        while (true) {
            if (field309.method2389(field310) >= 27) {
                int var1 = field309.method2378(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field304[var1] == null) {
                        field304[var1] = new class32();
                        var2 = true;
                    }
                    class32 var3 = field304[var1];
                    field306[++field378 - 1] = var1;
                    var3.field775 = field275;
                    int var4;
                    if (arg0) {
                        var4 = field309.method2378(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field309.method2378(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    int var5 = field399[field309.method2378(3)];
                    if (var2) {
                        var3.field740 = var3.field769 = var5;
                    }
                    int var6 = field309.method2378(1);
                    int var7;
                    if (arg0) {
                        var7 = field309.method2378(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = field309.method2378(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    var3.field714 = class37.method1870(field309.method2378(14));
                    int var8 = field309.method2378(1);
                    if (var8 == 1) {
                        field389[++field388 - 1] = var1;
                    }
                    var3.field744 = var3.field714.field815;
                    var3.field793 = var3.field714.field838;
                    if (var3.field793 == 0) {
                        var3.field769 = 0;
                    }
                    var3.field748 = var3.field714.field821;
                    var3.field749 = var3.field714.field822;
                    var3.field750 = var3.field714.field827;
                    var3.field800 = var3.field714.field830;
                    var3.field745 = var3.field714.field835;
                    var3.field746 = var3.field714.field819;
                    var3.field747 = var3.field714.field820;
                    var3.method604(Statics.field393.field795[0] + var4, Statics.field393.field796[0] + var7, var6 == 1);
                    continue;
                }
            }
            field309.method2379();
            return;
        }
    }

    @ObfuscatedName("client.bf(I)V")
    public static final void method472() {
        int var0 = Statics.field218;
        int var1 = Statics.field1345;
        int var2 = Statics.field204;
        int var3 = Statics.field194;
        int var4 = 6116423;
        class75.method1567(var0, var1, var2, var3, var4);
        class75.method1567(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class75.method1538(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field546.method3500(class148.field2307, var0 + 3, var1 + 14, var4, -1);
        int var5 = class132.field2011;
        int var6 = class132.field2005 * -322104283;
        for (int var7 = 0; var7 < field410; var7++) {
            int var8 = (field410 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class214 var10 = Statics.field546;
            String var11;
            if (field416[var7].length() > 0) {
                var11 = field415[var7] + class148.field2314 + field416[var7];
            } else {
                var11 = field415[var7];
            }
            var10.method3500(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field218;
        int var13 = Statics.field1345;
        int var14 = Statics.field204;
        int var15 = Statics.field194;
        for (int var16 = 0; var16 < field472; var16++) {
            if (field421[var16] + field418[var16] > var12 && field421[var16] < var12 + var14 && field480[var16] + field407[var16] > var13 && field407[var16] < var13 + var15) {
                field475[var16] = true;
            }
        }
    }

    @ObfuscatedName("dq.bj(IIIIS)V")
    public static final void method2091(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field472; var4++) {
            if (field421[var4] + field418[var4] > arg0 && field421[var4] < arg0 + arg2 && field480[var4] + field407[var4] > arg1 && field407[var4] < arg1 + arg3) {
                field474[var4] = true;
            }
        }
    }

    @ObfuscatedName("cr.bd(I)V")
    public static final void method1979() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field410 - 1; var1++) {
                if (field296[var1] < 1000 && field296[var1 + 1] > 1000) {
                    String var2 = field416[var1];
                    field416[var1] = field416[var1 + 1];
                    field416[var1 + 1] = var2;
                    String var3 = field415[var1];
                    field415[var1] = field415[var1 + 1];
                    field415[var1 + 1] = var3;
                    int var4 = field296[var1];
                    field296[var1] = field296[var1 + 1];
                    field296[var1 + 1] = var4;
                    int var5 = field411[var1];
                    field411[var1] = field411[var1 + 1];
                    field411[var1 + 1] = var5;
                    int var6 = field412[var1];
                    field412[var1] = field412[var1 + 1];
                    field412[var1 + 1] = var6;
                    int var7 = field414[var1];
                    field414[var1] = field414[var1 + 1];
                    field414[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field2489 != null || field440 != null) {
            return;
        }
        int var20;
        int var21;
        label217: {
            int var8 = class132.field2000;
            if (field409) {
                if (var8 != 1 && (Statics.field2976 || var8 != 4)) {
                    int var9 = class132.field2011;
                    int var10 = class132.field2005 * -322104283;
                    if (var9 < Statics.field218 - 10 || var9 > Statics.field218 + Statics.field204 + 10 || var10 < Statics.field1345 - 10 || var10 > Statics.field194 + Statics.field1345 + 10) {
                        field409 = false;
                        method2091(Statics.field218, Statics.field1345, Statics.field204, Statics.field194);
                    }
                }
                if (var8 == 1 || !Statics.field2976 && var8 == 4) {
                    int var11 = Statics.field218;
                    int var12 = Statics.field1345;
                    int var13 = Statics.field204;
                    int var14 = class132.field2009;
                    int var15 = class132.field2010;
                    int var16 = -1;
                    for (int var17 = 0; var17 < field410; var17++) {
                        int var18 = (field410 - 1 - var17) * 15 + var12 + 31;
                        if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                            var16 = var17;
                        }
                    }
                    if (var16 != -1) {
                        method1890(var16);
                    }
                    field409 = false;
                    method2091(Statics.field218, Statics.field1345, Statics.field204, Statics.field194);
                }
            } else {
                if ((var8 == 1 || !Statics.field2976 && var8 == 4) && field410 > 0) {
                    int var19 = field296[field410 - 1];
                    if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                        var20 = field411[field410 - 1];
                        var21 = field412[field410 - 1];
                        class164 var22 = class164.method619(var21);
                        if (class168.method1897(method1613(var22))) {
                            break label217;
                        }
                        int var23 = method1613(var22);
                        boolean var24 = (var23 >> 29 & 0x1) != 0;
                        if (var24) {
                            break label217;
                        }
                    }
                }
                if ((var8 == 1 || !Statics.field2976 && var8 == 4) && (field290 == 1 && field410 > 2 || method112(field410 - 1))) {
                    var8 = 2;
                }
                if ((var8 == 1 || !Statics.field2976 && var8 == 4) && field410 > 0) {
                    method1890(field410 - 1);
                }
                if (var8 == 2 && field410 > 0) {
                    method95(class132.field2009, class132.field2010);
                }
            }
            return;
        }
        if (Statics.field2489 != null && !field372 && field290 != 1 && !method112(field410 - 1) && field410 > 0) {
            method2777(field379, field380);
        }
        field372 = false;
        field330 = 0;
        if (Statics.field2489 != null) {
            method93(Statics.field2489);
        }
        Statics.field2489 = class164.method619(var21);
        field284 = var20;
        field379 = class132.field2009;
        field380 = class132.field2010;
        if (field410 > 0) {
            method1981(field410 - 1);
        }
        method93(Statics.field2489);
    }

    @ObfuscatedName("m.bo(IIB)V")
    public static final void method95(int arg0, int arg1) {
        int var2 = Statics.field546.method3495(class148.field2307);
        for (int var3 = 0; var3 < field410; var3++) {
            class214 var4 = Statics.field546;
            String var5;
            if (field416[var3].length() > 0) {
                var5 = field415[var3] + class148.field2314 + field416[var3];
            } else {
                var5 = field415[var3];
            }
            int var6 = var4.method3495(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field410 * 15 + 21;
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
        field409 = true;
        Statics.field218 = var8;
        Statics.field1345 = var9;
        Statics.field204 = var2;
        Statics.field194 = field410 * 15 + 22;
    }

    @ObfuscatedName("k.bh(II)Z")
    public static final boolean method112(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field296[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("cz.br(IB)V")
    public static final void method1890(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field411[arg0];
        int var2 = field412[arg0];
        int var3 = field296[arg0];
        int var4 = field414[arg0];
        String var5 = field415[arg0];
        String var6 = field416[arg0];
        method576(var1, var2, var3, var4, var5, var6, class132.field2009, class132.field2010);
    }

    @ObfuscatedName("aq.bp(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method576(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 43) {
            field521.method2396(124);
            field521.method2180(arg3);
            field521.method2136(arg1);
            field521.method2179(arg0);
            field376 = 0;
            Statics.field119 = class164.method619(arg1);
            field377 = arg0;
        }
        if (arg2 == 4) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field499 = arg0;
            field500 = arg1;
            field521.method2396(200);
            field521.method2206(Statics.field1910 + arg1);
            field521.method2134(arg3 >> 14 & 0x7FFF);
            field521.method2171(class129.field1956[82] ? 1 : 0);
            field521.method2206(Statics.field1280 + arg0);
        }
        if (arg2 == 6) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field499 = arg0;
            field500 = arg1;
            field521.method2396(194);
            field521.method2180(Statics.field1910 + arg1);
            field521.method2206(Statics.field1280 + arg0);
            field521.method2180(arg3 >> 14 & 0x7FFF);
            field521.method2173(class129.field1956[82] ? 1 : 0);
        }
        if (arg2 == 1005) {
            class164 var8 = class164.method619(arg1);
            if (var8 == null || var8.field2717[arg0] < 100000) {
                field521.method2396(131);
                field521.method2134(arg3);
            } else {
                class11.method3012(27, "", var8.field2717[arg0] + " x " + class47.method832(arg3).field1021);
            }
            field376 = 0;
            Statics.field119 = class164.method619(arg1);
            field377 = arg0;
        }
        if (arg2 == 12) {
            class32 var9 = field304[arg3];
            if (var9 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(173);
                field521.method2173(class129.field1956[82] ? 1 : 0);
                field521.method2180(arg3);
            }
        }
        if (arg2 == 24) {
            class164 var10 = class164.method619(arg1);
            boolean var11 = true;
            if (var10.field2615 > 0) {
                var11 = method505(var10);
            }
            if (var11) {
                field521.method2396(89);
                field521.method2136(arg1);
            }
        }
        if (arg2 == 30 && field349 == null) {
            method3446(arg1, arg0);
            field349 = class164.method2701(arg1, arg0);
            method93(field349);
        }
        if (arg2 == 21) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field499 = arg0;
            field500 = arg1;
            field521.method2396(64);
            field521.method2179(Statics.field1910 + arg1);
            field521.method2180(Statics.field1280 + arg0);
            field521.method2180(arg3);
            field521.method2171(class129.field1956[82] ? 1 : 0);
        }
        if (arg2 == 15) {
            class3 var12 = field385[arg3];
            if (var12 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(45);
                field521.method2180(arg3);
                field521.method2134(field424);
                field521.method2171(class129.field1956[82] ? 1 : 0);
                field521.method2136(Statics.field2830);
            }
        }
        if (arg2 == 51) {
            class3 var13 = field385[arg3];
            if (var13 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(203);
                field521.method2179(arg3);
                field521.method2133(class129.field1956[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field521.method2396(160);
            field521.method2136(arg1);
            field521.method2206(arg0);
            field521.method2206(arg3);
            field376 = 0;
            Statics.field119 = class164.method619(arg1);
            field377 = arg0;
        }
        if (arg2 == 17) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field499 = arg0;
            field500 = arg1;
            field521.method2396(7);
            field521.method2134(Statics.field1280 + arg0);
            field521.method2180(Statics.field1910 + arg1);
            field521.method2163(class129.field1956[82] ? 1 : 0);
            field521.method2206(field424);
            field521.method2180(arg3);
            field521.method2189(Statics.field2830);
        }
        if (arg2 == 40) {
            field521.method2396(73);
            field521.method2190(arg1);
            field521.method2206(arg0);
            field521.method2179(arg3);
            field376 = 0;
            Statics.field119 = class164.method619(arg1);
            field377 = arg0;
        }
        if (arg2 == 16) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field499 = arg0;
            field500 = arg1;
            field521.method2396(248);
            field521.method2163(class129.field1956[82] ? 1 : 0);
            field521.method2179(arg3);
            field521.method2180(Statics.field2098);
            field521.method2134(Statics.field1280 + arg0);
            field521.method2134(Statics.field989);
            field521.method2206(Statics.field1910 + arg1);
            field521.method2136(Statics.field589);
        }
        if (arg2 == 32) {
            field521.method2396(129);
            field521.method2180(arg3);
            field521.method2134(arg0);
            field521.method2190(arg1);
            field521.method2206(field424);
            field521.method2190(Statics.field2830);
            field376 = 0;
            Statics.field119 = class164.method619(arg1);
            field377 = arg0;
        }
        if (arg2 == 38) {
            method141();
            class164 var14 = class164.method619(arg1);
            field316 = 1;
            Statics.field989 = arg0;
            Statics.field589 = arg1;
            Statics.field2098 = arg3;
            method93(var14);
            field422 = class2.method773(16748608) + class47.method832(arg3).field1021 + class2.method773(16777215);
            if (field422 == null) {
                field422 = "null";
            }
            return;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class164 var15 = class164.method2701(arg1, arg0);
            if (var15 != null) {
                method33(arg3, arg1, arg0, var15.field2718, arg5);
            }
        }
        if (arg2 == 2) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field499 = arg0;
            field500 = arg1;
            field521.method2396(240);
            field521.method2134(Statics.field1910 + arg1);
            field521.method2134(Statics.field1280 + arg0);
            field521.method2189(Statics.field2830);
            field521.method2180(field424);
            field521.method2173(class129.field1956[82] ? 1 : 0);
            field521.method2180(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1001) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field499 = arg0;
            field500 = arg1;
            field521.method2396(212);
            field521.method2134(Statics.field1280 + arg0);
            field521.method2163(class129.field1956[82] ? 1 : 0);
            field521.method2179(arg3 >> 14 & 0x7FFF);
            field521.method2134(Statics.field1910 + arg1);
        }
        if (arg2 == 41) {
            field521.method2396(243);
            field521.method2179(arg3);
            field521.method2180(arg0);
            field521.method2188(arg1);
            field376 = 0;
            Statics.field119 = class164.method619(arg1);
            field377 = arg0;
        }
        if (arg2 == 31) {
            field521.method2396(106);
            field521.method2190(arg1);
            field521.method2206(arg0);
            field521.method2206(Statics.field2098);
            field521.method2188(Statics.field589);
            field521.method2179(Statics.field989);
            field521.method2179(arg3);
            field376 = 0;
            Statics.field119 = class164.method619(arg1);
            field377 = arg0;
        }
        if (arg2 == 19) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field499 = arg0;
            field500 = arg1;
            field521.method2396(114);
            field521.method2134(arg3);
            field521.method2180(Statics.field1910 + arg1);
            field521.method2163(class129.field1956[82] ? 1 : 0);
            field521.method2134(Statics.field1280 + arg0);
        }
        if (arg2 == 3) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field499 = arg0;
            field500 = arg1;
            field521.method2396(42);
            field521.method2134(Statics.field1910 + arg1);
            field521.method2173(class129.field1956[82] ? 1 : 0);
            field521.method2206(Statics.field1280 + arg0);
            field521.method2134(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 42) {
            field521.method2396(193);
            field521.method2180(arg3);
            field521.method2206(arg0);
            field521.method2188(arg1);
            field376 = 0;
            Statics.field119 = class164.method619(arg1);
            field377 = arg0;
        }
        if (arg2 == 44) {
            class3 var16 = field385[arg3];
            if (var16 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(184);
                field521.method2134(arg3);
                field521.method2173(class129.field1956[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field521.method2396(12);
            field521.method2179(arg0);
            field521.method2188(arg1);
            field521.method2206(arg3);
            field376 = 0;
            Statics.field119 = class164.method619(arg1);
            field377 = arg0;
        }
        if (arg2 == 29) {
            field521.method2396(89);
            field521.method2136(arg1);
            class164 var17 = class164.method619(arg1);
            if (var17.field2710 != null && var17.field2710[0][0] == 5) {
                int var18 = var17.field2710[0][1];
                if (class166.field2742[var18] != var17.field2712[0]) {
                    class166.field2742[var18] = var17.field2712[0];
                    method519(var18);
                }
            }
        }
        if (arg2 == 33) {
            field521.method2396(68);
            field521.method2188(arg1);
            field521.method2179(arg3);
            field521.method2206(arg0);
            field376 = 0;
            Statics.field119 = class164.method619(arg1);
            field377 = arg0;
        }
        if (arg2 == 1) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field499 = arg0;
            field500 = arg1;
            field521.method2396(127);
            field521.method2188(Statics.field589);
            field521.method2179(Statics.field1910 + arg1);
            field521.method2180(Statics.field2098);
            field521.method2179(arg3 >> 14 & 0x7FFF);
            field521.method2206(Statics.field1280 + arg0);
            field521.method2206(Statics.field989);
            field521.method2171(class129.field1956[82] ? 1 : 0);
        }
        if (arg2 == 23) {
            Statics.field191.method1666(Statics.field2988, arg0, arg1);
        }
        if (arg2 == 58) {
            class164 var19 = class164.method2701(arg1, arg0);
            if (var19 != null) {
                field521.method2396(135);
                field521.method2180(arg0);
                field521.method2180(var19.field2718);
                field521.method2188(Statics.field2830);
                field521.method2179(field424);
                field521.method2134(field517);
                field521.method2190(arg1);
            }
        }
        if (arg2 == 7) {
            class32 var20 = field304[arg3];
            if (var20 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(250);
                field521.method2179(Statics.field989);
                field521.method2206(arg3);
                field521.method2136(Statics.field589);
                field521.method2163(class129.field1956[82] ? 1 : 0);
                field521.method2206(Statics.field2098);
            }
        }
        if (arg2 == 35) {
            field521.method2396(105);
            field521.method2190(arg1);
            field521.method2134(arg0);
            field521.method2206(arg3);
            field376 = 0;
            Statics.field119 = class164.method619(arg1);
            field377 = arg0;
        }
        if (arg2 == 20) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field499 = arg0;
            field500 = arg1;
            field521.method2396(118);
            field521.method2134(Statics.field1910 + arg1);
            field521.method2179(Statics.field1280 + arg0);
            field521.method2206(arg3);
            field521.method2173(class129.field1956[82] ? 1 : 0);
        }
        if (arg2 == 18) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field499 = arg0;
            field500 = arg1;
            field521.method2396(152);
            field521.method2179(arg3);
            field521.method2179(Statics.field1910 + arg1);
            field521.method2134(Statics.field1280 + arg0);
            field521.method2133(class129.field1956[82] ? 1 : 0);
        }
        if (arg2 == 50) {
            class3 var21 = field385[arg3];
            if (var21 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(215);
                field521.method2173(class129.field1956[82] ? 1 : 0);
                field521.method2206(arg3);
            }
        }
        if (arg2 == 1004) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field521.method2396(131);
            field521.method2134(arg3);
        }
        if (arg2 == 45) {
            class3 var22 = field385[arg3];
            if (var22 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(171);
                field521.method2179(arg3);
                field521.method2163(class129.field1956[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            method2069();
        }
        if (arg2 == 34) {
            field521.method2396(165);
            field521.method2189(arg1);
            field521.method2180(arg3);
            field521.method2206(arg0);
            field376 = 0;
            Statics.field119 = class164.method619(arg1);
            field377 = arg0;
        }
        if (arg2 == 5) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field499 = arg0;
            field500 = arg1;
            field521.method2396(141);
            field521.method2171(class129.field1956[82] ? 1 : 0);
            field521.method2179(Statics.field1280 + arg0);
            field521.method2134(arg3 >> 14 & 0x7FFF);
            field521.method2134(Statics.field1910 + arg1);
        }
        if (arg2 == 47) {
            class3 var23 = field385[arg3];
            if (var23 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(96);
                field521.method2179(arg3);
                field521.method2171(class129.field1956[82] ? 1 : 0);
            }
        }
        if (arg2 == 22) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field499 = arg0;
            field500 = arg1;
            field521.method2396(13);
            field521.method2179(arg3);
            field521.method2134(Statics.field1910 + arg1);
            field521.method2133(class129.field1956[82] ? 1 : 0);
            field521.method2179(Statics.field1280 + arg0);
        }
        if (arg2 == 1002) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            field521.method2396(31);
            field521.method2134(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 9) {
            class32 var24 = field304[arg3];
            if (var24 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(121);
                field521.method2173(class129.field1956[82] ? 1 : 0);
                field521.method2206(arg3);
            }
        }
        if (arg2 == 13) {
            class32 var25 = field304[arg3];
            if (var25 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(155);
                field521.method2206(arg3);
                field521.method2171(class129.field1956[82] ? 1 : 0);
            }
        }
        if (arg2 == 49) {
            class3 var26 = field385[arg3];
            if (var26 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(26);
                field521.method2163(class129.field1956[82] ? 1 : 0);
                field521.method2179(arg3);
            }
        }
        if (arg2 == 11) {
            class32 var27 = field304[arg3];
            if (var27 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(242);
                field521.method2179(arg3);
                field521.method2173(class129.field1956[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class3 var28 = field385[arg3];
            if (var28 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(145);
                field521.method2206(arg3);
                field521.method2206(Statics.field989);
                field521.method2189(Statics.field589);
                field521.method2173(class129.field1956[82] ? 1 : 0);
                field521.method2179(Statics.field2098);
            }
        }
        if (arg2 == 48) {
            class3 var29 = field385[arg3];
            if (var29 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(30);
                field521.method2163(class129.field1956[82] ? 1 : 0);
                field521.method2206(arg3);
            }
        }
        if (arg2 == 37) {
            field521.method2396(79);
            field521.method2134(arg0);
            field521.method2206(arg3);
            field521.method2188(arg1);
            field376 = 0;
            Statics.field119 = class164.method619(arg1);
            field377 = arg0;
        }
        if (arg2 == 10) {
            class32 var30 = field304[arg3];
            if (var30 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(225);
                field521.method2171(class129.field1956[82] ? 1 : 0);
                field521.method2206(arg3);
            }
        }
        if (arg2 == 25) {
            class164 var31 = class164.method2701(arg1, arg0);
            if (var31 != null) {
                method141();
                method2478(arg1, arg0, class168.method146(method1613(var31)), var31.field2718);
                field316 = 0;
                field277 = method1067(var31);
                if (field277 == null) {
                    field277 = "Null";
                }
                if (var31.field2601) {
                    field446 = var31.field2672 + class2.method773(16777215);
                } else {
                    field446 = class2.method773(65280) + var31.field2714 + class2.method773(16777215);
                }
            }
            return;
        }
        if (arg2 == 46) {
            class3 var32 = field385[arg3];
            if (var32 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(139);
                field521.method2133(class129.field1956[82] ? 1 : 0);
                field521.method2206(arg3);
            }
        }
        if (arg2 == 1003) {
            field527 = arg6;
            field373 = arg7;
            field456 = 2;
            field374 = 0;
            class32 var33 = field304[arg3];
            if (var33 != null) {
                class37 var34 = var33.field714;
                if (var34.field839 != null) {
                    var34 = var34.method625();
                }
                if (var34 != null) {
                    field521.method2396(87);
                    field521.method2134(var34.field813);
                }
            }
        }
        if (arg2 == 8) {
            class32 var35 = field304[arg3];
            if (var35 != null) {
                field527 = arg6;
                field373 = arg7;
                field456 = 2;
                field374 = 0;
                field499 = arg0;
                field500 = arg1;
                field521.method2396(113);
                field521.method2179(arg3);
                field521.method2190(Statics.field2830);
                field521.method2134(field424);
                field521.method2163(class129.field1956[82] ? 1 : 0);
            }
        }
        if (arg2 == 28) {
            field521.method2396(89);
            field521.method2136(arg1);
            class164 var36 = class164.method619(arg1);
            if (var36.field2710 != null && var36.field2710[0][0] == 5) {
                int var37 = var36.field2710[0][1];
                class166.field2742[var37] = 1 - class166.field2742[var37];
                method519(var37);
            }
        }
        if (field316 != 0) {
            field316 = 0;
            method93(class164.method619(Statics.field589));
        }
        if (field300) {
            method141();
        }
        if (Statics.field119 != null && field376 == 0) {
            method93(Statics.field119);
        }
    }

    @ObfuscatedName("f.bm(ILjava/lang/String;I)V")
    public static void method481(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field386; var3++) {
            class3 var4 = field385[field387[var3]];
            if (var4 != null && var4.field37 != null && var4.field37.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field521.method2396(184);
                    field521.method2134(field387[var3]);
                    field521.method2173(0);
                } else if (arg0 == 4) {
                    field521.method2396(96);
                    field521.method2179(field387[var3]);
                    field521.method2171(0);
                } else if (arg0 == 6) {
                    field521.method2396(26);
                    field521.method2163(0);
                    field521.method2179(field387[var3]);
                } else if (arg0 == 7) {
                    field521.method2396(215);
                    field521.method2173(0);
                    field521.method2206(field387[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class11.method3012(4, "", class148.field2257 + arg1);
        }
    }

    @ObfuscatedName("dp.bk(IIIII)V")
    public static void method2478(int arg0, int arg1, int arg2, int arg3) {
        class164 var4 = class164.method2701(arg0, arg1);
        if (var4 != null && var4.field2690 != null) {
            class1 var5 = new class1();
            var5.field7 = var4;
            var5.field8 = var4.field2690;
            class34.method2699(var5);
        }
        field517 = arg3;
        field300 = true;
        Statics.field2830 = arg0;
        field424 = arg1;
        Statics.field2962 = arg2;
        method93(var4);
    }

    @ObfuscatedName("g.be(B)V")
    public static void method141() {
        if (!field300) {
            return;
        }
        class164 var0 = class164.method2701(Statics.field2830, field424);
        if (var0 != null && var0.field2691 != null) {
            class1 var1 = new class1();
            var1.field7 = var0;
            var1.field8 = var0.field2691;
            class34.method2699(var1);
        }
        field300 = false;
        method93(var0);
    }

    @ObfuscatedName("gv.ck(IIB)V")
    public static void method3446(int arg0, int arg1) {
        field521.method2396(57);
        field521.method2134(arg1);
        field521.method2136(arg0);
    }

    @ObfuscatedName("e.cq(IIIILjava/lang/String;I)V")
    public static void method33(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class164 var5 = class164.method2701(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2699 != null) {
            class1 var6 = new class1();
            var6.field7 = var5;
            var6.field1 = arg0;
            var6.field10 = arg4;
            var6.field8 = var5.field2699;
            class34.method2699(var6);
        }
        boolean var7 = true;
        if (var5.field2615 > 0) {
            var7 = method505(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method1613(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field521.method2396(195);
            field521.method2136(arg1);
            field521.method2134(arg2);
            field521.method2134(arg3);
        }
        if (arg0 == 2) {
            field521.method2396(232);
            field521.method2136(arg1);
            field521.method2134(arg2);
            field521.method2134(arg3);
        }
        if (arg0 == 3) {
            field521.method2396(92);
            field521.method2136(arg1);
            field521.method2134(arg2);
            field521.method2134(arg3);
        }
        if (arg0 == 4) {
            field521.method2396(253);
            field521.method2136(arg1);
            field521.method2134(arg2);
            field521.method2134(arg3);
        }
        if (arg0 == 5) {
            field521.method2396(23);
            field521.method2136(arg1);
            field521.method2134(arg2);
            field521.method2134(arg3);
        }
        if (arg0 == 6) {
            field521.method2396(180);
            field521.method2136(arg1);
            field521.method2134(arg2);
            field521.method2134(arg3);
        }
        if (arg0 == 7) {
            field521.method2396(83);
            field521.method2136(arg1);
            field521.method2134(arg2);
            field521.method2134(arg3);
        }
        if (arg0 == 8) {
            field521.method2396(123);
            field521.method2136(arg1);
            field521.method2134(arg2);
            field521.method2134(arg3);
        }
        if (arg0 == 9) {
            field521.method2396(249);
            field521.method2136(arg1);
            field521.method2134(arg2);
            field521.method2134(arg3);
        }
        if (arg0 == 10) {
            field521.method2396(216);
            field521.method2136(arg1);
            field521.method2134(arg2);
            field521.method2134(arg3);
        }
    }

    @ObfuscatedName("u.ct(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method134(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field409 || field410 >= 500) {
            return;
        }
        field415[field410] = arg0;
        field416[field410] = arg1;
        field296[field410] = arg2;
        field414[field410] = arg3;
        field411[field410] = arg4;
        field412[field410] = arg5;
        field410++;
    }

    @ObfuscatedName("cp.cx(I)V")
    public static void method1785() {
        for (int var0 = 0; var0 < field410; var0++) {
            int var1 = field296[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field410 - 1) {
                    for (int var3 = var0; var3 < field410 - 1; var3++) {
                        field415[var3] = field415[var3 + 1];
                        field416[var3] = field416[var3 + 1];
                        field296[var3] = field296[var3 + 1];
                        field414[var3] = field414[var3 + 1];
                        field411[var3] = field411[var3 + 1];
                        field412[var3] = field412[var3 + 1];
                    }
                }
                field410--;
            }
        }
    }

    @ObfuscatedName("ay.cs(Lal;IIII)V")
    public static final void method776(class37 arg0, int arg1, int arg2, int arg3) {
        if (field410 >= 400) {
            return;
        }
        if (arg0.field839 != null) {
            arg0 = arg0.method625();
        }
        if (arg0 == null || !arg0.field842 || arg0.field844 && field460 != arg1) {
            return;
        }
        String var4 = arg0.field814;
        if (arg0.field823 != 0) {
            int var6 = arg0.field823;
            int var7 = Statics.field393.field32;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method773(16711680);
            } else if (var8 < -6) {
                var9 = class2.method773(16723968);
            } else if (var8 < -3) {
                var9 = class2.method773(16740352);
            } else if (var8 < 0) {
                var9 = class2.method773(16756736);
            } else if (var8 > 9) {
                var9 = class2.method773(65280);
            } else if (var8 > 6) {
                var9 = class2.method773(4259584);
            } else if (var8 > 3) {
                var9 = class2.method773(8453888);
            } else if (var8 > 0) {
                var9 = class2.method773(12648192);
            } else {
                var9 = class2.method773(16776960);
            }
            var4 = var4 + var9 + " " + class2.field17 + class148.field2310 + arg0.field823 + class2.field18;
        }
        if (field316 == 1) {
            method134(class148.field2346, field422 + " " + class2.field14 + " " + class2.method773(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field300) {
            String[] var10 = arg0.field845;
            if (field439) {
                var10 = method32(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class148.field2306)) {
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
                        method134(var10[var11], class2.method773(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class148.field2306)) {
                        short var14 = 0;
                        if (field280 == class19.field542 || field280 == class19.field541 && arg0.field823 > Statics.field393.field32) {
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
                        method134(var10[var13], class2.method773(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method134(class148.field2305, class2.method773(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2962 & 0x2) == 2) {
            method134(field277, field446 + " " + class2.field14 + " " + class2.method773(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cn.cp(Lh;IIIB)V")
    public static final void method1888(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field393 == arg0 || field410 >= 400) {
            return;
        }
        String var9;
        if (arg0.field33 == 0) {
            String var4 = arg0.field37;
            int var5 = arg0.field32;
            int var6 = Statics.field393.field32;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method773(16711680);
            } else if (var7 < -6) {
                var8 = class2.method773(16723968);
            } else if (var7 < -3) {
                var8 = class2.method773(16740352);
            } else if (var7 < 0) {
                var8 = class2.method773(16756736);
            } else if (var7 > 9) {
                var8 = class2.method773(65280);
            } else if (var7 > 6) {
                var8 = class2.method773(4259584);
            } else if (var7 > 3) {
                var8 = class2.method773(8453888);
            } else if (var7 > 0) {
                var8 = class2.method773(12648192);
            } else {
                var8 = class2.method773(16776960);
            }
            var9 = var4 + var8 + " " + class2.field17 + class148.field2310 + arg0.field32 + class2.field18;
        } else {
            var9 = arg0.field37 + " " + class2.field17 + class148.field2237 + arg0.field33 + class2.field18;
        }
        if (field316 == 1) {
            method134(class148.field2346, field422 + " " + class2.field14 + " " + class2.method773(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field300) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field397[var10] != null) {
                    short var11 = 0;
                    if (field397[var10].equalsIgnoreCase(class148.field2306)) {
                        if (field280 == class19.field542 || field280 == class19.field541 && arg0.field32 > Statics.field393.field32) {
                            var11 = 2000;
                        }
                        if (Statics.field393.field41 != 0 && arg0.field41 != 0) {
                            if (Statics.field393.field41 == arg0.field41) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field307[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field396[var10] + var11;
                    method134(field397[var10], class2.method773(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2962 & 0x8) == 8) {
            method134(field277, field446 + " " + class2.field14 + " " + class2.method773(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field410; var14++) {
            if (field296[var14] == 23) {
                field416[var14] = class2.method773(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("fq.co(IIIIIIIIB)V")
    public static final void method3236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class164.method29(arg0)) {
            Statics.field185 = null;
            method592(Statics.field2686[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field185 != null) {
                method592(Statics.field185, -1412584499, arg1, arg2, arg3, arg4, Statics.field1906, Statics.field1490, arg7);
                Statics.field185 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field474[var8] = true;
            }
        } else {
            field474[arg7] = true;
        }
    }

    @ObfuscatedName("ac.cy([Lfl;IIIIIIIII)V")
    public static final void method592(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75.method1547(arg2, arg3, arg4, arg5);
        class86.method1846();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class164 var10 = arg0[var9];
            if (var10 != null && (var10.field2651 == arg1 || arg1 == -1412584499 && field440 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field421[field472] = var10.field2616 + arg6;
                    field407[field472] = var10.field2681 + arg7;
                    field418[field472] = var10.field2620;
                    field480[field472] = var10.field2621;
                    var11 = ++field472 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2729 = var11;
                var10.field2730 = field275;
                if (!var10.field2601 || !method507(var10)) {
                    if (var10.field2615 > 0) {
                        int var12 = var10.field2615;
                        if (var12 == 324) {
                            if (field523 == -1) {
                                field523 = var10.field2705;
                                field529 = var10.field2636;
                            }
                            if (field314.field2754) {
                                var10.field2705 = field523;
                            } else {
                                var10.field2705 = field529;
                            }
                        } else if (var12 == 325) {
                            if (field523 == -1) {
                                field523 = var10.field2705;
                                field529 = var10.field2636;
                            }
                            if (field314.field2754) {
                                var10.field2705 = field529;
                            } else {
                                var10.field2705 = field523;
                            }
                        } else if (var12 == 327) {
                            var10.field2629 = 150;
                            var10.field2660 = (int) (Math.sin((double) field275 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2647 = 5;
                            var10.field2614 = 0;
                        } else if (var12 == 328) {
                            var10.field2629 = 150;
                            var10.field2660 = (int) (Math.sin((double) field275 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2647 = 5;
                            var10.field2614 = 1;
                        }
                    }
                    int var13 = var10.field2616 + arg6;
                    int var14 = var10.field2681 + arg7;
                    int var15 = var10.field2633;
                    if (field440 == var10) {
                        if (arg1 != -1412584499 && !var10.field2677) {
                            Statics.field185 = arg0;
                            Statics.field1906 = arg6;
                            Statics.field1490 = arg7;
                            continue;
                        }
                        if (field451 && field479) {
                            int var16 = class132.field2011;
                            int var17 = class132.field2005 * -322104283;
                            int var18 = var16 - field293;
                            int var19 = var17 - field443;
                            if (var18 < field398) {
                                var18 = field398;
                            }
                            if (var10.field2620 + var18 > field398 + field303.field2620) {
                                var18 = field398 + field303.field2620 - var10.field2620;
                            }
                            if (var19 < field447) {
                                var19 = field447;
                            }
                            if (var10.field2621 + var19 > field447 + field303.field2621) {
                                var19 = field447 + field303.field2621 - var10.field2621;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2677) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2613 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2613 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2620 + var13;
                        int var27 = var10.field2621 + var14;
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
                        int var30 = var10.field2620 + var13;
                        int var31 = var10.field2621 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2601 || var20 < var22 && var21 < var23) {
                        if (var10.field2615 != 0) {
                            if (var10.field2615 == 1337) {
                                field417 = var13;
                                field329 = var14;
                                int var32 = var10.field2620;
                                int var33 = var10.field2621;
                                class75.method1547(var13, var14, var13 + var32, var14 + var33);
                                class86.method1846();
                                field369++;
                                method1868(class31.field704);
                                boolean var34 = false;
                                if (field263 >= 0) {
                                    for (int var35 = 0; var35 < field386; var35++) {
                                        if (field263 == field387[var35]) {
                                            var34 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var34) {
                                    method1868(class31.field697);
                                }
                                method901(true);
                                method1868(var34 ? class31.field699 : class31.field698);
                                method901(false);
                                method2446();
                                for (class28 var36 = (class28) field404.method3309(); var36 != null; var36 = (class28) field404.method3311()) {
                                    if (Statics.field2988 != var36.field629 || var36.field638) {
                                        var36.method3404();
                                    } else if (field275 >= var36.field630) {
                                        var36.method540(field341);
                                        if (var36.field638) {
                                            var36.method3404();
                                        } else {
                                            Statics.field191.method1627(var36.field629, var36.field632, var36.field633, var36.field634, 60, var36, 0, -1, false);
                                        }
                                    }
                                }
                                if (!field497) {
                                    int var37 = field501;
                                    if (field357 / 256 > var37) {
                                        var37 = field357 / 256;
                                    }
                                    if (field481[4] && field383[4] + 128 > var37) {
                                        var37 = field383[4] + 128;
                                    }
                                    int var38 = field350 + field333 & 0x7FF;
                                    int var39 = Statics.field1809;
                                    int var40 = method836(Statics.field393.field754, Statics.field393.field787, Statics.field2988) - 50;
                                    int var41 = Statics.field192;
                                    int var42 = var37 * 3 + 600;
                                    int var43 = 2048 - var37 & 0x7FF;
                                    int var44 = 2048 - var38 & 0x7FF;
                                    int var45 = 0;
                                    int var46 = 0;
                                    int var47 = var42;
                                    if (var43 != 0) {
                                        int var48 = class86.field1480[var43];
                                        int var49 = class86.field1464[var43];
                                        int var50 = var46 * var49 - var42 * var48 >> 16;
                                        var47 = var46 * var48 + var42 * var49 >> 16;
                                        var46 = var50;
                                    }
                                    if (var44 != 0) {
                                        int var51 = class86.field1480[var44];
                                        int var52 = class86.field1464[var44];
                                        int var53 = var45 * var52 + var47 * var51 >> 16;
                                        var47 = var47 * var52 - var45 * var51 >> 16;
                                        var45 = var53;
                                    }
                                    Statics.field2550 = var39 - var45;
                                    Statics.field165 = var40 - var46;
                                    Statics.field1904 = var41 - var47;
                                    Statics.field1260 = var37;
                                    Statics.field348 = var38;
                                }
                                int var66;
                                if (field497) {
                                    int var67;
                                    if (Statics.field93.field140) {
                                        var67 = Statics.field2988;
                                    } else {
                                        int var68 = method836(Statics.field2550, Statics.field1904, Statics.field2988);
                                        if (var68 - Statics.field165 >= 800 || (class6.field73[Statics.field2988][Statics.field2550 >> 7][Statics.field1904 >> 7] & 0x4) == 0) {
                                            var67 = 3;
                                        } else {
                                            var67 = Statics.field2988;
                                        }
                                    }
                                    var66 = var67;
                                } else {
                                    int var54;
                                    if (Statics.field93.field140) {
                                        var54 = Statics.field2988;
                                    } else {
                                        int var55 = 3;
                                        if (Statics.field1260 < 310) {
                                            int var56 = Statics.field2550 >> 7;
                                            int var57 = Statics.field1904 >> 7;
                                            int var58 = Statics.field393.field754 >> 7;
                                            int var59 = Statics.field393.field787 >> 7;
                                            if ((class6.field73[Statics.field2988][var56][var57] & 0x4) != 0) {
                                                var55 = Statics.field2988;
                                            }
                                            int var60;
                                            if (var58 > var56) {
                                                var60 = var58 - var56;
                                            } else {
                                                var60 = var56 - var58;
                                            }
                                            int var61;
                                            if (var59 > var57) {
                                                var61 = var59 - var57;
                                            } else {
                                                var61 = var57 - var59;
                                            }
                                            if (var60 > var61) {
                                                int var62 = var61 * 65536 / var60;
                                                int var63 = 32768;
                                                while (var56 != var58) {
                                                    if (var56 < var58) {
                                                        var56++;
                                                    } else if (var56 > var58) {
                                                        var56--;
                                                    }
                                                    if ((class6.field73[Statics.field2988][var56][var57] & 0x4) != 0) {
                                                        var55 = Statics.field2988;
                                                    }
                                                    var63 += var62;
                                                    if (var63 >= 65536) {
                                                        var63 -= 65536;
                                                        if (var57 < var59) {
                                                            var57++;
                                                        } else if (var57 > var59) {
                                                            var57--;
                                                        }
                                                        if ((class6.field73[Statics.field2988][var56][var57] & 0x4) != 0) {
                                                            var55 = Statics.field2988;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var64 = var60 * 65536 / var61;
                                                int var65 = 32768;
                                                while (var57 != var59) {
                                                    if (var57 < var59) {
                                                        var57++;
                                                    } else if (var57 > var59) {
                                                        var57--;
                                                    }
                                                    if ((class6.field73[Statics.field2988][var56][var57] & 0x4) != 0) {
                                                        var55 = Statics.field2988;
                                                    }
                                                    var65 += var64;
                                                    if (var65 >= 65536) {
                                                        var65 -= 65536;
                                                        if (var56 < var58) {
                                                            var56++;
                                                        } else if (var56 > var58) {
                                                            var56--;
                                                        }
                                                        if ((class6.field73[Statics.field2988][var56][var57] & 0x4) != 0) {
                                                            var55 = Statics.field2988;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class6.field73[Statics.field2988][Statics.field393.field754 >> 7][Statics.field393.field787 >> 7] & 0x4) != 0) {
                                            var55 = Statics.field2988;
                                        }
                                        var54 = var55;
                                    }
                                    var66 = var54;
                                }
                                int var69 = Statics.field2550;
                                int var70 = Statics.field165;
                                int var71 = Statics.field1904;
                                int var72 = Statics.field1260;
                                int var73 = Statics.field348;
                                for (int var74 = 0; var74 < 5; var74++) {
                                    if (field481[var74]) {
                                        int var75 = (int) (Math.random() * (double) (field516[var74] * 2 + 1) - (double) field516[var74] + Math.sin((double) field519[var74] / 100.0D * (double) field332[var74]) * (double) field383[var74]);
                                        if (var74 == 0) {
                                            Statics.field2550 += var75;
                                        }
                                        if (var74 == 1) {
                                            Statics.field165 += var75;
                                        }
                                        if (var74 == 2) {
                                            Statics.field1904 += var75;
                                        }
                                        if (var74 == 3) {
                                            Statics.field348 = Statics.field348 + var75 & 0x7FF;
                                        }
                                        if (var74 == 4) {
                                            Statics.field1260 += var75;
                                            if (Statics.field1260 < 128) {
                                                Statics.field1260 = 128;
                                            }
                                            if (Statics.field1260 > 383) {
                                                Statics.field1260 = 383;
                                            }
                                        }
                                    }
                                }
                                int var76 = class132.field2011;
                                int var77 = class132.field2005 * -322104283;
                                if (class132.field2000 != 0) {
                                    var76 = class132.field2009;
                                    var77 = class132.field2010;
                                }
                                if (var76 >= var13 && var76 < var13 + var32 && var77 >= var14 && var77 < var14 + var33) {
                                    class100.field1698 = true;
                                    class100.field1692 = 0;
                                    class100.field1742 = var76 - var13;
                                    class100.field1743 = var77 - var14;
                                } else {
                                    class100.field1698 = false;
                                    class100.field1692 = 0;
                                }
                                Statics.method124();
                                class75.method1567(var13, var14, var32, var33, 0);
                                Statics.method124();
                                Statics.field191.method1654(Statics.field2550, Statics.field165, Statics.field1904, Statics.field1260, Statics.field348, var66);
                                Statics.method124();
                                Statics.field191.method1630();
                                field358 = 0;
                                boolean var78 = false;
                                int var79 = -1;
                                for (int var80 = -1; var80 < field386 + field378; var80++) {
                                    class35 var81;
                                    if (var80 == -1) {
                                        var81 = Statics.field393;
                                    } else if (var80 < field386) {
                                        var81 = field385[field387[var80]];
                                        if (field263 == field387[var80]) {
                                            var78 = true;
                                            var79 = var80;
                                            continue;
                                        }
                                    } else {
                                        var81 = field304[field306[var80 - field386]];
                                    }
                                    Statics.method536(var81, var80, var13, var14, var32, var33);
                                }
                                if (var78) {
                                    Statics.method536(field385[field263], var79, var13, var14, var32, var33);
                                }
                                for (int var82 = 0; var82 < field358; var82++) {
                                    int var83 = field360[var82];
                                    int var84 = field408[var82];
                                    int var85 = field363[var82];
                                    int var86 = field362[var82];
                                    boolean var87 = true;
                                    while (var87) {
                                        var87 = false;
                                        for (int var88 = 0; var88 < var82; var88++) {
                                            if (var84 + 2 > field408[var88] - field362[var88] && var84 - var86 < field408[var88] + 2 && var83 - var85 < field363[var88] + field360[var88] && var83 + var85 > field360[var88] - field363[var88] && field408[var88] - field362[var88] < var84) {
                                                var84 = field408[var88] - field362[var88];
                                                var87 = true;
                                            }
                                        }
                                    }
                                    field445 = field360[var82];
                                    field406 = field408[var82] = var84;
                                    String var89 = field423[var82];
                                    if (field430 == 0) {
                                        int var90 = 16776960;
                                        if (field364[var82] < 6) {
                                            var90 = field482[field364[var82]];
                                        }
                                        if (field364[var82] == 6) {
                                            var90 = field369 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field364[var82] == 7) {
                                            var90 = field369 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field364[var82] == 8) {
                                            var90 = field369 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field364[var82] == 9) {
                                            int var91 = 150 - field366[var82];
                                            if (var91 < 50) {
                                                var90 = var91 * 1280 + 16711680;
                                            } else if (var91 < 100) {
                                                var90 = 16776960 - (var91 - 50) * 327680;
                                            } else if (var91 < 150) {
                                                var90 = (var91 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field364[var82] == 10) {
                                            int var92 = 150 - field366[var82];
                                            if (var92 < 50) {
                                                var90 = var92 * 5 + 16711680;
                                            } else if (var92 < 100) {
                                                var90 = 16711935 - (var92 - 50) * 327680;
                                            } else if (var92 < 150) {
                                                var90 = (var92 - 100) * 327680 + 255 - (var92 - 100) * 5;
                                            }
                                        }
                                        if (field364[var82] == 11) {
                                            int var93 = 150 - field366[var82];
                                            if (var93 < 50) {
                                                var90 = 16777215 - var93 * 327685;
                                            } else if (var93 < 100) {
                                                var90 = (var93 - 50) * 327685 + 65280;
                                            } else if (var93 < 150) {
                                                var90 = 16777215 - (var93 - 100) * 327680;
                                            }
                                        }
                                        if (field441[var82] == 0) {
                                            Statics.field546.method3538(var89, field445 + var13, field406 + var14, var90, 0);
                                        }
                                        if (field441[var82] == 1) {
                                            Statics.field546.method3518(var89, field445 + var13, field406 + var14, var90, 0, field369);
                                        }
                                        if (field441[var82] == 2) {
                                            Statics.field546.method3505(var89, field445 + var13, field406 + var14, var90, 0, field369);
                                        }
                                        if (field441[var82] == 3) {
                                            Statics.field546.method3537(var89, field445 + var13, field406 + var14, var90, 0, field369, 150 - field366[var82]);
                                        }
                                        if (field441[var82] == 4) {
                                            int var94 = (150 - field366[var82]) * (Statics.field546.method3495(var89) + 100) / 150;
                                            class75.method1531(field445 + var13 - 50, var14, field445 + var13 + 50, var14 + var33);
                                            Statics.field546.method3500(var89, field445 + var13 + 50 - var94, field406 + var14, var90, 0);
                                            class75.method1547(var13, var14, var13 + var32, var14 + var33);
                                        }
                                        if (field441[var82] == 5) {
                                            int var95 = 150 - field366[var82];
                                            int var96 = 0;
                                            if (var95 < 25) {
                                                var96 = var95 - 25;
                                            } else if (var95 > 125) {
                                                var96 = var95 - 125;
                                            }
                                            class75.method1531(var13, field406 + var14 - Statics.field546.field3039 - 1, var13 + var32, field406 + var14 + 5);
                                            Statics.field546.method3538(var89, field445 + var13, field406 + var14 + var96, var90, 0);
                                            class75.method1547(var13, var14, var13 + var32, var14 + var33);
                                        }
                                    } else {
                                        Statics.field546.method3538(var89, field445 + var13, field406 + var14, 16776960, 0);
                                    }
                                }
                                method31(var13, var14);
                                ((class90) Statics.field1481).method1879(field341);
                                if (field456 == 1) {
                                    Statics.field2493[field374 / 100].method1445(field527 - 8, field373 - 8);
                                }
                                if (field456 == 2) {
                                    Statics.field2493[field374 / 100 + 4].method1445(field527 - 8, field373 - 8);
                                }
                                method147();
                                if (field281) {
                                    int var97 = var13 + 512 - 5;
                                    int var98 = var14 + 20;
                                    Statics.field649.method3546("Fps:" + field2047, var97, var98, 16776960, -1);
                                    int var218 = var98 + 15;
                                    Runtime var99 = Runtime.getRuntime();
                                    int var100 = (int) ((var99.totalMemory() - var99.freeMemory()) / 1024L);
                                    int var101 = 16776960;
                                    if (var100 > 32768 && field271) {
                                        var101 = 16711680;
                                    }
                                    if (var100 > 65536 && !field271) {
                                        var101 = 16711680;
                                    }
                                    Statics.field649.method3546("Mem:" + var100 + "k", var97, var218, var101, -1);
                                    var98 = var218 + 15;
                                }
                                Statics.field2550 = var69;
                                Statics.field165 = var70;
                                Statics.field1904 = var71;
                                Statics.field1260 = var72;
                                Statics.field348 = var73;
                                if (field274) {
                                    byte var102 = 0;
                                    int var103 = class162.field2575 + class162.field2573 + var102;
                                    if (var103 == 0) {
                                        field274 = false;
                                    }
                                }
                                if (field274) {
                                    class75.method1567(var13, var14, var32, var33, 0);
                                    method2584(class148.field2243, false);
                                }
                                class75.method1547(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2615 == 1338) {
                                Statics.method124();
                                class75.method1547(var13, var14, Statics.field1864.field1323 + var13, Statics.field1864.field1321 + var14);
                                if (field298 == 2 || field298 == 5) {
                                    class75.method1545(var13 + 25, var14 + 5, 0, Statics.field57, Statics.field930);
                                } else {
                                    int var105 = field350 + field336 & 0x7FF;
                                    int var106 = Statics.field393.field754 / 32 + 48;
                                    int var107 = 464 - Statics.field393.field787 / 32;
                                    Statics.field1561.method1447(var13 + 25, var14 + 5, 146, 151, var106, var107, var105, field402 + 256, Statics.field57, Statics.field930);
                                    for (int var108 = 0; var108 < field365; var108++) {
                                        int var109 = field496[var108] * 4 + 2 - Statics.field393.field754 / 32;
                                        int var110 = field368[var108] * 4 + 2 - Statics.field393.field787 / 32;
                                        method1891(var13, var14, var109, var110, field498[var108]);
                                    }
                                    for (int var111 = 0; var111 < 104; var111++) {
                                        for (int var112 = 0; var112 < 104; var112++) {
                                            class189 var113 = field273[Statics.field2988][var111][var112];
                                            if (var113 != null) {
                                                int var114 = var111 * 4 + 2 - Statics.field393.field754 / 32;
                                                int var115 = var112 * 4 + 2 - Statics.field393.field787 / 32;
                                                method1891(var13, var14, var114, var115, Statics.field2508[0]);
                                            }
                                        }
                                    }
                                    for (int var116 = 0; var116 < field378; var116++) {
                                        class32 var117 = field304[field306[var116]];
                                        if (var117 != null && var117.method15()) {
                                            class37 var118 = var117.field714;
                                            if (var118 != null && var118.field839 != null) {
                                                var118 = var118.method625();
                                            }
                                            if (var118 != null && var118.field833 && var118.field842) {
                                                int var119 = var117.field754 / 32 - Statics.field393.field754 / 32;
                                                int var120 = var117.field787 / 32 - Statics.field393.field787 / 32;
                                                method1891(var13, var14, var119, var120, Statics.field2508[1]);
                                            }
                                        }
                                    }
                                    for (int var121 = 0; var121 < field386; var121++) {
                                        class3 var122 = field385[field387[var121]];
                                        if (var122 != null && var122.method15() && !var122.field47) {
                                            int var123 = var122.field754 / 32 - Statics.field393.field754 / 32;
                                            int var124 = var122.field787 / 32 - Statics.field393.field787 / 32;
                                            boolean var125 = false;
                                            if (method3579(var122.field37, true)) {
                                                var125 = true;
                                            }
                                            boolean var126 = false;
                                            for (int var127 = 0; var127 < Statics.field1664; var127++) {
                                                if (var122.field37.equals(Statics.field89[var127].field586)) {
                                                    var126 = true;
                                                    break;
                                                }
                                            }
                                            boolean var128 = false;
                                            if (Statics.field393.field41 != 0 && var122.field41 != 0 && Statics.field393.field41 == var122.field41) {
                                                var128 = true;
                                            }
                                            if (var125) {
                                                method1891(var13, var14, var123, var124, Statics.field2508[3]);
                                            } else if (var128) {
                                                method1891(var13, var14, var123, var124, Statics.field2508[4]);
                                            } else if (var126) {
                                                method1891(var13, var14, var123, var124, Statics.field2508[5]);
                                            } else {
                                                method1891(var13, var14, var123, var124, Statics.field2508[2]);
                                            }
                                        }
                                    }
                                    if (field283 != 0 && field275 % 20 < 10) {
                                        if (field283 == 1 && field305 >= 0 && field305 < field304.length) {
                                            class32 var129 = field304[field305];
                                            if (var129 != null) {
                                                int var130 = var129.field754 / 32 - Statics.field393.field754 / 32;
                                                int var131 = var129.field787 / 32 - Statics.field393.field787 / 32;
                                                Statics.method71(var13, var14, var130, var131, Statics.field1835[1]);
                                            }
                                        }
                                        if (field283 == 2) {
                                            int var132 = field286 * 4 - Statics.field1280 * 4 + 2 - Statics.field393.field754 / 32;
                                            int var133 = field287 * 4 - Statics.field1910 * 4 + 2 - Statics.field393.field787 / 32;
                                            Statics.method71(var13, var14, var132, var133, Statics.field1835[1]);
                                        }
                                        if (field283 == 10 && field285 >= 0 && field285 < field385.length) {
                                            class3 var134 = field385[field285];
                                            if (var134 != null) {
                                                int var135 = var134.field754 / 32 - Statics.field393.field754 / 32;
                                                int var136 = var134.field787 / 32 - Statics.field393.field787 / 32;
                                                Statics.method71(var13, var14, var135, var136, Statics.field1835[1]);
                                            }
                                        }
                                    }
                                    if (field499 != 0) {
                                        int var137 = field499 * 4 + 2 - Statics.field393.field754 / 32;
                                        int var138 = field500 * 4 + 2 - Statics.field393.field787 / 32;
                                        method1891(var13, var14, var137, var138, Statics.field1835[0]);
                                    }
                                    if (!Statics.field393.field47) {
                                        class75.method1567(var13 + 93 + 4, var14 + 82 - 4, 3, 3, 16777215);
                                    }
                                }
                                if (field298 < 3) {
                                    Statics.field1828.method1447(var13, var14, 33, 33, 25, 25, field350, 256, Statics.field1919, Statics.field74);
                                } else {
                                    class75.method1545(var13, var14, 0, Statics.field1919, Statics.field74);
                                }
                                if (field476[var11]) {
                                    Statics.field1864.method1585(var13, var14);
                                }
                                field475[var11] = true;
                                class75.method1547(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2613 == 0) {
                            if (!var10.field2601 && method507(var10) && Statics.field537 != var10) {
                                continue;
                            }
                            if (!var10.field2601) {
                                if (var10.field2625 > var10.field2627 - var10.field2621) {
                                    var10.field2625 = var10.field2627 - var10.field2621;
                                }
                                if (var10.field2625 < 0) {
                                    var10.field2625 = 0;
                                }
                            }
                            method592(arg0, var10.field2697, var20, var21, var22, var23, var13 - var10.field2687, var14 - var10.field2625, var11);
                            if (var10.field2722 != null) {
                                method592(var10.field2722, var10.field2697, var20, var21, var22, var23, var13 - var10.field2687, var14 - var10.field2625, var11);
                            }
                            class4 var139 = (class4) field514.method3273((long) var10.field2697);
                            if (var139 != null) {
                                method3236(var139.field53, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class75.method1547(arg2, arg3, arg4, arg5);
                            class86.method1846();
                        }
                        if (field476[var11] || field268 > 1) {
                            if (var10.field2613 == 0 && !var10.field2601 && var10.field2627 > var10.field2621) {
                                method504(var10.field2620 + var13, var14, var10.field2625, var10.field2621, var10.field2627);
                            }
                            if (var10.field2613 != 1) {
                                if (var10.field2613 == 2) {
                                    int var140 = 0;
                                    for (int var141 = 0; var141 < var10.field2621; var141++) {
                                        for (int var142 = 0; var142 < var10.field2620; var142++) {
                                            int var143 = (var10.field2624 + 32) * var142 + var13;
                                            int var144 = (var10.field2666 + 32) * var141 + var14;
                                            if (var140 < 20) {
                                                var143 += var10.field2725[var140];
                                                var144 += var10.field2668[var140];
                                            }
                                            if (var10.field2716[var140] > 0) {
                                                boolean var145 = false;
                                                boolean var146 = false;
                                                int var147 = var10.field2716[var140] - 1;
                                                if (var143 + 32 > arg2 && var143 < arg4 && var144 + 32 > arg3 && var144 < arg5 || Statics.field2489 == var10 && field284 == var140) {
                                                    class74 var148;
                                                    if (field316 == 1 && Statics.field989 == var140 && Statics.field589 == var10.field2697) {
                                                        var148 = class47.method94(var147, var10.field2717[var140], 2, 0, 2, false);
                                                    } else {
                                                        var148 = class47.method94(var147, var10.field2717[var140], 1, 3153952, 2, false);
                                                    }
                                                    if (var148 == null) {
                                                        method93(var10);
                                                    } else if (Statics.field2489 == var10 && field284 == var140) {
                                                        int var149 = class132.field2011 - field379;
                                                        int var150 = class132.field2005 * -322104283 - field380;
                                                        if (var149 < 5 && var149 > -5) {
                                                            var149 = 0;
                                                        }
                                                        if (var150 < 5 && var150 > -5) {
                                                            var150 = 0;
                                                        }
                                                        if (field330 < 5) {
                                                            var149 = 0;
                                                            var150 = 0;
                                                        }
                                                        var148.method1504(var143 + var149, var144 + var150, 128);
                                                        if (arg1 != -1) {
                                                            class164 var151 = arg0[arg1 & 0xFFFF];
                                                            if (var144 + var150 < class75.field1317 && var151.field2625 > 0) {
                                                                int var152 = field341 * (class75.field1317 - var144 - var150) / 3;
                                                                if (var152 > field341 * 10) {
                                                                    var152 = field341 * 10;
                                                                }
                                                                if (var152 > var151.field2625) {
                                                                    var152 = var151.field2625;
                                                                }
                                                                var151.field2625 -= var152;
                                                                field380 += var152;
                                                                method93(var151);
                                                            }
                                                            if (var144 + var150 + 32 > class75.field1318 && var151.field2625 < var151.field2627 - var151.field2621) {
                                                                int var153 = field341 * (var144 + var150 + 32 - class75.field1318) / 3;
                                                                if (var153 > field341 * 10) {
                                                                    var153 = field341 * 10;
                                                                }
                                                                if (var153 > var151.field2627 - var151.field2621 - var151.field2625) {
                                                                    var153 = var151.field2627 - var151.field2621 - var151.field2625;
                                                                }
                                                                var151.field2625 += var153;
                                                                field380 -= var153;
                                                                method93(var151);
                                                            }
                                                        }
                                                    } else if (Statics.field119 == var10 && field377 == var140) {
                                                        var148.method1504(var143, var144, 128);
                                                    } else {
                                                        var148.method1445(var143, var144);
                                                    }
                                                }
                                            } else if (var10.field2669 != null && var140 < 20) {
                                                class74 var154 = var10.method2951(var140);
                                                if (var154 != null) {
                                                    var154.method1445(var143, var144);
                                                } else if (class164.field2609) {
                                                    method93(var10);
                                                }
                                            }
                                            var140++;
                                        }
                                    }
                                } else if (var10.field2613 == 3) {
                                    int var155;
                                    if (method490(var10)) {
                                        var155 = var10.field2682;
                                        if (Statics.field537 == var10 && var10.field2631 != 0) {
                                            var155 = var10.field2631;
                                        }
                                    } else {
                                        var155 = var10.field2628;
                                        if (Statics.field537 == var10 && var10.field2630 != 0) {
                                            var155 = var10.field2630;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2632) {
                                            class75.method1567(var13, var14, var10.field2620, var10.field2621, var155);
                                        } else {
                                            class75.method1538(var13, var14, var10.field2620, var10.field2621, var155);
                                        }
                                    } else if (var10.field2632) {
                                        class75.method1535(var13, var14, var10.field2620, var10.field2621, var155, 256 - (var15 & 0xFF));
                                    } else {
                                        class75.method1568(var13, var14, var10.field2620, var10.field2621, var155, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2613 == 4) {
                                    class214 var156 = var10.method2947();
                                    if (var156 != null) {
                                        String var157 = var10.field2622;
                                        int var158;
                                        if (method490(var10)) {
                                            var158 = var10.field2682;
                                            if (Statics.field537 == var10 && var10.field2631 != 0) {
                                                var158 = var10.field2631;
                                            }
                                            if (var10.field2708.length() > 0) {
                                                var157 = var10.field2708;
                                            }
                                        } else {
                                            var158 = var10.field2628;
                                            if (Statics.field537 == var10 && var10.field2630 != 0) {
                                                var158 = var10.field2630;
                                            }
                                        }
                                        if (var10.field2601 && var10.field2718 != -1) {
                                            class47 var159 = class47.method832(var10.field2718);
                                            var157 = var159.field1021;
                                            if (var157 == null) {
                                                var157 = "null";
                                            }
                                            if ((var159.field1032 == 1 || var10.field2719 != 1) && var10.field2719 != -1) {
                                                var157 = class2.method773(16748608) + var157 + class2.field21 + " " + 'x' + method2075(var10.field2719);
                                            }
                                        }
                                        if (field349 == var10) {
                                            class148 var10000 = (class148) null;
                                            var157 = class148.field2312;
                                            var158 = var10.field2628;
                                        }
                                        if (!var10.field2601) {
                                            var157 = method78(var157, var10);
                                        }
                                        var156.method3503(var157, var13, var14, var10.field2620, var10.field2621, var158, var10.field2700 ? 0 : -1, var10.field2643, var10.field2663, var10.field2674);
                                    } else if (class164.field2609) {
                                        method93(var10);
                                    }
                                } else if (var10.field2613 == 5) {
                                    if (var10.field2601) {
                                        class74 var161;
                                        if (var10.field2718 == -1) {
                                            var161 = var10.method2957(false);
                                        } else {
                                            var161 = class47.method94(var10.field2718, var10.field2719, var10.field2695, var10.field2640, var10.field2657, false);
                                        }
                                        if (var161 != null) {
                                            int var162 = var161.field1308;
                                            int var163 = var161.field1302;
                                            if (var10.field2638) {
                                                class75.method1531(var13, var14, var10.field2620 + var13, var10.field2621 + var14);
                                                int var164 = (var10.field2620 + (var162 - 1)) / var162;
                                                int var165 = (var10.field2621 + (var163 - 1)) / var163;
                                                for (int var166 = 0; var166 < var164; var166++) {
                                                    for (int var167 = 0; var167 < var165; var167++) {
                                                        if (var10.field2644 != 0) {
                                                            var161.method1449(var162 / 2 + var162 * var166 + var13, var163 / 2 + var163 * var167 + var14, var10.field2644, 4096);
                                                        } else if (var15 == 0) {
                                                            var161.method1445(var162 * var166 + var13, var163 * var167 + var14);
                                                        } else {
                                                            var161.method1504(var162 * var166 + var13, var163 * var167 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class75.method1547(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var168 = var10.field2620 * 4096 / var162;
                                                if (var10.field2644 != 0) {
                                                    var161.method1449(var10.field2620 / 2 + var13, var10.field2621 / 2 + var14, var10.field2644, var168);
                                                } else if (var15 != 0) {
                                                    var161.method1506(var13, var14, var10.field2620, var10.field2621, 256 - (var15 & 0xFF));
                                                } else if (var10.field2620 == var162 && var10.field2621 == var163) {
                                                    var161.method1445(var13, var14);
                                                } else {
                                                    var161.method1457(var13, var14, var10.field2620, var10.field2621);
                                                }
                                            }
                                        } else if (class164.field2609) {
                                            method93(var10);
                                        }
                                    } else {
                                        class74 var160 = var10.method2957(method490(var10));
                                        if (var160 != null) {
                                            var160.method1445(var13, var14);
                                        } else if (class164.field2609) {
                                            method93(var10);
                                        }
                                    }
                                } else if (var10.field2613 == 6) {
                                    boolean var169 = method490(var10);
                                    int var170;
                                    if (var169) {
                                        var170 = var10.field2619;
                                    } else {
                                        var170 = var10.field2634;
                                    }
                                    class100 var171 = null;
                                    int var172 = 0;
                                    if (var10.field2718 != -1) {
                                        class47 var173 = class47.method832(var10.field2718);
                                        if (var173 != null) {
                                            class47 var174 = var173.method857(var10.field2719);
                                            var171 = var174.method875(1);
                                            if (var171 == null) {
                                                method93(var10);
                                            } else {
                                                var171.method1995();
                                                var172 = var171.field1355 / 2;
                                            }
                                        }
                                    } else if (var10.field2647 == 5) {
                                        if (var10.field2614 == 0) {
                                            var171 = field314.method3020((class40) null, -1, (class40) null, -1);
                                        } else {
                                            var171 = Statics.field393.method14();
                                        }
                                    } else if (var170 == -1) {
                                        var171 = var10.method2953((class40) null, -1, var169, Statics.field393.field29);
                                        if (var171 == null && class164.field2609) {
                                            method93(var10);
                                        }
                                    } else {
                                        class40 var175 = class40.method575(var170);
                                        var171 = var10.method2953(var175, var10.field2607, var169, Statics.field393.field29);
                                        if (var171 == null && class164.field2609) {
                                            method93(var10);
                                        }
                                    }
                                    class86.method1792(var10.field2620 / 2 + var13, var10.field2621 / 2 + var14);
                                    int var176 = var10.field2683 * class86.field1480[var10.field2629] >> 16;
                                    int var177 = var10.field2683 * class86.field1464[var10.field2629] >> 16;
                                    if (var171 != null) {
                                        if (var10.field2601) {
                                            var171.method1995();
                                            if (var10.field2656) {
                                                var171.method2008(0, var10.field2660, var10.field2653, var10.field2629, var10.field2649, var10.field2650 + var172 + var176, var10.field2650 + var177, var10.field2683);
                                            } else {
                                                var171.method2012(0, var10.field2660, var10.field2653, var10.field2629, var10.field2649, var10.field2650 + var172 + var176, var10.field2650 + var177);
                                            }
                                        } else {
                                            var171.method2012(0, var10.field2660, 0, var10.field2629, 0, var176, var177);
                                        }
                                    }
                                    class86.method1791();
                                } else {
                                    if (var10.field2613 == 7) {
                                        class214 var178 = var10.method2947();
                                        if (var178 == null) {
                                            if (class164.field2609) {
                                                method93(var10);
                                            }
                                            continue;
                                        }
                                        int var179 = 0;
                                        for (int var180 = 0; var180 < var10.field2621; var180++) {
                                            for (int var181 = 0; var181 < var10.field2620; var181++) {
                                                if (var10.field2716[var179] > 0) {
                                                    class47 var182 = class47.method832(var10.field2716[var179] - 1);
                                                    String var183;
                                                    if (var182.field1032 != 1 && var10.field2717[var179] == 1) {
                                                        var183 = class2.method773(16748608) + var182.field1021 + class2.field21;
                                                    } else {
                                                        var183 = class2.method773(16748608) + var182.field1021 + class2.field21 + " " + 'x' + method2075(var10.field2717[var179]);
                                                    }
                                                    int var184 = (var10.field2624 + 115) * var181 + var13;
                                                    int var185 = (var10.field2666 + 12) * var180 + var14;
                                                    if (var10.field2643 == 0) {
                                                        var178.method3500(var183, var184, var185, var10.field2628, var10.field2700 ? 0 : -1);
                                                    } else if (var10.field2643 == 1) {
                                                        var178.method3538(var183, var10.field2620 / 2 + var184, var185, var10.field2628, var10.field2700 ? 0 : -1);
                                                    } else {
                                                        var178.method3546(var183, var10.field2620 + var184 - 1, var185, var10.field2628, var10.field2700 ? 0 : -1);
                                                    }
                                                }
                                                var179++;
                                            }
                                        }
                                    }
                                    if (var10.field2613 == 8 && Statics.field138 == var10 && field489 == field420) {
                                        int var186 = 0;
                                        int var187 = 0;
                                        class214 var188 = Statics.field649;
                                        String var189 = var10.field2622;
                                        String var190 = method78(var189, var10);
                                        while (var190.length() > 0) {
                                            int var191 = var190.indexOf(class2.field20);
                                            String var192;
                                            if (var191 == -1) {
                                                var192 = var190;
                                                var190 = "";
                                            } else {
                                                var192 = var190.substring(0, var191);
                                                var190 = var190.substring(var191 + 4);
                                            }
                                            int var193 = var188.method3495(var192);
                                            if (var193 > var186) {
                                                var186 = var193;
                                            }
                                            var187 += var188.field3039 + 1;
                                        }
                                        var186 += 6;
                                        var187 += 7;
                                        int var194 = var10.field2620 + var13 - 5 - var186;
                                        int var195 = var10.field2621 + var14 + 5;
                                        if (var194 < var13 + 5) {
                                            var194 = var13 + 5;
                                        }
                                        if (var186 + var194 > arg4) {
                                            var194 = arg4 - var186;
                                        }
                                        if (var187 + var195 > arg5) {
                                            var195 = arg5 - var187;
                                        }
                                        class75.method1567(var194, var195, var186, var187, 16777120);
                                        class75.method1538(var194, var195, var186, var187, 0);
                                        String var196 = var10.field2622;
                                        int var197 = var188.field3039 + var195 + 2;
                                        String var198 = method78(var196, var10);
                                        while (var198.length() > 0) {
                                            int var199 = var198.indexOf(class2.field20);
                                            String var200;
                                            if (var199 == -1) {
                                                var200 = var198;
                                                var198 = "";
                                            } else {
                                                var200 = var198.substring(0, var199);
                                                var198 = var198.substring(var199 + 4);
                                            }
                                            var188.method3500(var200, var194 + 3, var197, 0, -1);
                                            var197 += var188.field3039 + 1;
                                        }
                                    }
                                    if (var10.field2613 == 9) {
                                        if (var10.field2670 == 1) {
                                            class75.method1544(var13, var14, var10.field2620 + var13, var10.field2621 + var14, var10.field2628);
                                        } else {
                                            int var201 = var10.field2620 >= 0 ? var10.field2620 : -var10.field2620;
                                            int var202 = var10.field2621 >= 0 ? var10.field2621 : -var10.field2621;
                                            int var203 = var201;
                                            if (var201 < var202) {
                                                var203 = var202;
                                            }
                                            if (var203 != 0) {
                                                int var204 = (var10.field2620 << 16) / var203;
                                                int var205 = (var10.field2621 << 16) / var203;
                                                if (var205 <= var204) {
                                                    var204 = -var204;
                                                } else {
                                                    var205 = -var205;
                                                }
                                                int var206 = var10.field2670 * var205 >> 17;
                                                int var207 = var10.field2670 * var205 + 1 >> 17;
                                                int var208 = var10.field2670 * var204 >> 17;
                                                int var209 = var10.field2670 * var204 + 1 >> 17;
                                                int var210 = var13 + var206;
                                                int var211 = var13 - var207;
                                                int var212 = var10.field2620 + var13 - var207;
                                                int var213 = var10.field2620 + var13 + var206;
                                                int var214 = var14 + var208;
                                                int var215 = var14 - var209;
                                                int var216 = var10.field2621 + var14 - var209;
                                                int var217 = var10.field2621 + var14 + var208;
                                                class86.method1796(var210, var211, var212);
                                                class86.method1799(var214, var215, var216, var210, var211, var212, var10.field2628);
                                                class86.method1796(var210, var212, var213);
                                                class86.method1799(var214, var216, var217, var210, var212, var213, var10.field2628);
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

    @ObfuscatedName("t.cv(Ljava/lang/String;Lfl;B)Ljava/lang/String;")
    public static String method78(String arg0, class164 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method17(method878(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field2747 != null) {
                    var5 = class154.method2451(Statics.field2747.field2061);
                    if (Statics.field2747.field2067 != null) {
                        var5 = (String) Statics.field2747.field2067;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cw.cg(II)Ljava/lang/String;")
    public static final String method2075(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field15 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method773(65408) + var1.substring(0, var1.length() - 8) + class148.field2242 + " " + class2.field17 + var1 + class2.field18 + class2.field21;
        } else if (var1.length() > 6) {
            return " " + class2.method773(16777215) + var1.substring(0, var1.length() - 4) + class148.field2231 + " " + class2.field17 + var1 + class2.field18 + class2.field21;
        } else {
            return " " + class2.method773(16776960) + var1 + class2.field21;
        }
    }

    @ObfuscatedName("x.cu(IIIIII)V")
    public static final void method504(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1353[0].method1585(arg0, arg1);
        Statics.field1353[1].method1585(arg0, arg1 + arg3 - 16);
        class75.method1567(arg0, arg1 + 16, 16, arg3 - 32, field342);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class75.method1567(arg0, arg1 + 16 + var6, 16, var5, field392);
        class75.method1551(arg0, arg1 + 16 + var6, var5, field345);
        class75.method1551(arg0 + 1, arg1 + 16 + var6, var5, field345);
        class75.method1539(arg0, arg1 + 16 + var6, 16, field345);
        class75.method1539(arg0, arg1 + 17 + var6, 16, field345);
        class75.method1551(arg0 + 15, arg1 + 16 + var6, var5, field344);
        class75.method1551(arg0 + 14, arg1 + 17 + var6, var5 - 1, field344);
        class75.method1539(arg0, arg1 + 15 + var6 + var5, 16, field344);
        class75.method1539(arg0 + 1, arg1 + 14 + var6 + var5, 15, field344);
    }

    @ObfuscatedName("h.cm(II)Ljava/lang/String;")
    public static final String method17(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("z.cn(Lfl;I)Z")
    public static final boolean method490(class164 arg0) {
        if (arg0.field2661 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2661.length; var1++) {
            int var2 = method878(arg0, var1);
            int var3 = arg0.field2712[var1];
            if (arg0.field2661[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2661[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2661[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ar.ci(Lfl;II)I")
    public static final int method878(class164 arg0, int arg1) {
        if (arg0.field2710 == null || arg1 >= arg0.field2710.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2710[arg1];
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
                    var7 = field419[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field528[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field320[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class164 var11 = class164.method619(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class47.method832(var12).field1034 || field270)) {
                        for (int var13 = 0; var13 < var11.field2716.length; var13++) {
                            if (var12 + 1 == var11.field2716[var13]) {
                                var7 += var11.field2717[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class166.field2742[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class146.field2134[field528[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class166.field2742[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field393.field32;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class146.field2133[var14]) {
                            var7 += field528[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class164 var17 = class164.method619(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class47.method832(var18).field1034 || field270)) {
                        for (int var19 = 0; var19 < var17.field2716.length; var19++) {
                            if (var18 + 1 == var17.field2716[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field433;
                }
                if (var6 == 12) {
                    var7 = field434;
                }
                if (var6 == 13) {
                    int var20 = class166.field2742[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class166.method531(var22);
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
                    var7 = (Statics.field393.field754 >> 7) + Statics.field1280;
                }
                if (var6 == 19) {
                    var7 = (Statics.field393.field787 >> 7) + Statics.field1910;
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

    @ObfuscatedName("x.cz(Lfl;III)V")
    public static final void method506(class164 arg0, int arg1, int arg2) {
        if (arg0.field2676 == 1) {
            method134(arg0.field2713, "", 24, 0, 0, arg0.field2697);
        }
        if (arg0.field2676 == 2 && !field300) {
            String var3 = method1067(arg0);
            if (var3 != null) {
                method134(var3, class2.method773(65280) + arg0.field2714, 25, 0, -1, arg0.field2697);
            }
        }
        if (arg0.field2676 == 3) {
            method134(class148.field2376, "", 26, 0, 0, arg0.field2697);
        }
        if (arg0.field2676 == 4) {
            method134(arg0.field2713, "", 28, 0, 0, arg0.field2697);
        }
        if (arg0.field2676 == 5) {
            method134(arg0.field2713, "", 29, 0, 0, arg0.field2697);
        }
        if (arg0.field2676 == 6 && field349 == null) {
            method134(arg0.field2713, "", 30, 0, -1, arg0.field2697);
        }
        if (arg0.field2613 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2621; var5++) {
                for (int var6 = 0; var6 < arg0.field2620; var6++) {
                    int var7 = (arg0.field2624 + 32) * var6;
                    int var8 = (arg0.field2666 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2725[var4];
                        var8 += arg0.field2668[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field381 = var4;
                        Statics.field54 = arg0;
                        if (arg0.field2716[var4] > 0) {
                            class47 var9 = class47.method832(arg0.field2716[var4] - 1);
                            if (field316 == 1 && class168.method2610(method1613(arg0))) {
                                if (Statics.field589 != arg0.field2697 || Statics.field989 != var4) {
                                    method134(class148.field2346, field422 + " " + class2.field14 + " " + class2.method773(16748608) + var9.field1021, 31, var9.field1019, var4, arg0.field2697);
                                }
                            } else if (!field300 || !class168.method2610(method1613(arg0))) {
                                String[] var10 = var9.field1036;
                                if (field439) {
                                    var10 = method32(var10);
                                }
                                if (class168.method2610(method1613(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            method134(var10[var11], class2.method773(16748608) + var9.field1021, var12, var9.field1019, var4, arg0.field2697);
                                        } else if (var11 == 4) {
                                            method134(class148.field2155, class2.method773(16748608) + var9.field1021, 37, var9.field1019, var4, arg0.field2697);
                                        }
                                    }
                                }
                                if (class168.method2705(method1613(arg0))) {
                                    method134(class148.field2346, class2.method773(16748608) + var9.field1021, 38, var9.field1019, var4, arg0.field2697);
                                }
                                if (class168.method2610(method1613(arg0)) && var10 != null) {
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
                                            method134(var10[var13], class2.method773(16748608) + var9.field1021, var14, var9.field1019, var4, arg0.field2697);
                                        }
                                    }
                                }
                                String[] var15 = arg0.field2711;
                                if (field439) {
                                    var15 = method32(var15);
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
                                            method134(var15[var16], class2.method773(16748608) + var9.field1021, var17, var9.field1019, var4, arg0.field2697);
                                        }
                                    }
                                }
                                method134(class148.field2305, class2.method773(16748608) + var9.field1021, 1005, var9.field1019, var4, arg0.field2697);
                            } else if ((Statics.field2962 & 0x10) == 16) {
                                method134(field277, field446 + " " + class2.field14 + " " + class2.method773(16748608) + var9.field1021, 32, var9.field1019, var4, arg0.field2697);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2601) {
            return;
        }
        if (field300) {
            int var18 = method1613(arg0);
            boolean var19 = (var18 >> 21 & 0x1) != 0;
            if (var19 && (Statics.field2962 & 0x20) == 32) {
                method134(field277, field446 + " " + class2.field14 + " " + arg0.field2672, 58, 0, arg0.field2612, arg0.field2697);
            }
            return;
        }
        for (int var20 = 9; var20 >= 5; var20--) {
            String var21 = method2700(arg0, var20);
            if (var21 != null) {
                method134(var21, arg0.field2672, 1007, var20 + 1, arg0.field2612, arg0.field2697);
            }
        }
        String var22 = method1067(arg0);
        if (var22 != null) {
            method134(var22, arg0.field2672, 25, 0, arg0.field2612, arg0.field2697);
        }
        for (int var23 = 4; var23 >= 0; var23--) {
            String var24 = method2700(arg0, var23);
            if (var24 != null) {
                method134(var24, arg0.field2672, 57, var23 + 1, arg0.field2612, arg0.field2697);
            }
        }
        if (class168.method1885(method1613(arg0))) {
            method134(class148.field2159, "", 30, 0, arg0.field2612, arg0.field2697);
        }
    }

    @ObfuscatedName("f.cl(III)V")
    public static final void method479(int arg0, int arg1) {
        if (class164.method29(arg0)) {
            method1978(Statics.field2686[arg0], arg1);
        }
    }

    @ObfuscatedName("cr.cr([Lfl;II)V")
    public static final void method1978(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2613 == 0) {
                    if (var3.field2722 != null) {
                        method1978(var3.field2722, arg1);
                    }
                    class4 var4 = (class4) field514.method3273((long) var3.field2697);
                    if (var4 != null) {
                        method479(var4.field53, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2706 != null) {
                    class1 var5 = new class1();
                    var5.field7 = var3;
                    var5.field8 = var3.field2706;
                    class34.method2699(var5);
                }
                if (arg1 == 1 && var3.field2707 != null) {
                    if (var3.field2612 >= 0) {
                        class164 var6 = class164.method619(var3.field2697);
                        if (var6 == null || var6.field2722 == null || var3.field2612 >= var6.field2722.length || var6.field2722[var3.field2612] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field7 = var3;
                    var7.field8 = var3.field2707;
                    class34.method2699(var7);
                }
            }
        }
    }

    @ObfuscatedName("z.cj(Lfl;III)V")
    public static final void method495(class164 arg0, int arg1, int arg2) {
        if (field440 != null || field409 || arg0 == null || method1989(arg0) == null) {
            return;
        }
        field440 = arg0;
        field303 = method1989(arg0);
        field293 = arg1;
        field443 = arg2;
        Statics.field183 = 0;
        field451 = false;
        if (field410 > 0) {
            method1981(field410 - 1);
        }
    }

    @ObfuscatedName("q.cc(I)V")
    public static final void method3() {
        method93(field440);
        Statics.field183++;
        if (field427 && field479) {
            int var0 = class132.field2011;
            int var1 = class132.field2005 * -322104283;
            int var2 = var0 - field293;
            int var3 = var1 - field443;
            if (var2 < field398) {
                var2 = field398;
            }
            if (field440.field2620 + var2 > field398 + field303.field2620) {
                var2 = field398 + field303.field2620 - field440.field2620;
            }
            if (var3 < field447) {
                var3 = field447;
            }
            if (field440.field2621 + var3 > field447 + field303.field2621) {
                var3 = field447 + field303.field2621 - field440.field2621;
            }
            int var4 = var2 - field405;
            int var5 = var3 - field450;
            int var6 = field440.field2675;
            if (Statics.field183 > field440.field2715 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field451 = true;
            }
            int var7 = field303.field2687 + (var2 - field398);
            int var8 = field303.field2625 + (var3 - field447);
            if (field440.field2688 != null && field451) {
                class1 var9 = new class1();
                var9.field7 = field440;
                var9.field2 = var7;
                var9.field5 = var8;
                var9.field8 = field440.field2688;
                class34.method2699(var9);
            }
            if (class132.field2003 == 0) {
                if (field451) {
                    if (field440.field2639 != null) {
                        class1 var10 = new class1();
                        var10.field7 = field440;
                        var10.field2 = var7;
                        var10.field5 = var8;
                        var10.field4 = field531;
                        var10.field8 = field440.field2639;
                        class34.method2699(var10);
                    }
                    if (field531 != null) {
                        class164 var11 = field440;
                        int var12 = class168.method491(method1613(var11));
                        class164 var13;
                        if (var12 == 0) {
                            var13 = null;
                        } else {
                            int var14 = 0;
                            while (true) {
                                if (var14 >= var12) {
                                    var13 = var11;
                                    break;
                                }
                                var11 = class164.method619(var11.field2651);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field521.method2396(149);
                            field521.method2180(field440.field2718);
                            field521.method2180(field531.field2612);
                            field521.method2134(field531.field2718);
                            field521.method2190(field440.field2697);
                            field521.method2188(field531.field2697);
                            field521.method2180(field440.field2612);
                        }
                    }
                } else if ((field290 == 1 || method112(field410 - 1)) && field410 > 2) {
                    method95(field405 + field293, field450 + field443);
                } else if (field410 > 0) {
                    method2777(field405 + field293, field450 + field443);
                }
                field440 = null;
            }
        } else if (Statics.field183 > 1) {
            field440 = null;
        }
    }

    @ObfuscatedName("cj.cf(IB)V")
    public static void method1981(int arg0) {
        Statics.field261 = new class29();
        Statics.field261.field652 = field411[arg0];
        Statics.field261.field644 = field412[arg0];
        Statics.field261.field645 = field296[arg0];
        Statics.field261.field646 = field414[arg0];
        Statics.field261.field647 = field415[arg0];
    }

    @ObfuscatedName("ef.ch(III)V")
    public static void method2777(int arg0, int arg1) {
        class29 var2 = Statics.field261;
        method576(var2.field652, var2.field644, var2.field645, var2.field646, var2.field647, var2.field647, arg0, arg1);
        Statics.field261 = null;
    }

    @ObfuscatedName("m.cd(Lfl;B)V")
    public static void method93(class164 arg0) {
        if (field473 == arg0.field2730) {
            field474[arg0.field2729] = true;
        }
    }

    @ObfuscatedName("cc.cw(Lfl;I)Lfl;")
    public static class164 method1989(class164 arg0) {
        class164 var1 = arg0;
        int var2 = class168.method491(method1613(arg0));
        class164 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class164.method619(var1.field2651);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class164 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2658;
        }
        return var5;
    }

    @ObfuscatedName("e.ce([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method32(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("h.dn(II)V")
    public static final void method20(int arg0) {
        if (!class164.method29(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2686[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3 != null) {
                var3.field2607 = 0;
                var3.field2721 = 0;
            }
        }
    }

    @ObfuscatedName("m.db([Lfl;IS)V")
    public static final void method89(class164[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class164 var3 = arg0[var2];
            if (var3 != null && var3.field2651 == arg1 && (!var3.field2601 || !method507(var3))) {
                if (var3.field2613 == 0) {
                    if (!var3.field2601 && method507(var3) && Statics.field537 != var3) {
                        continue;
                    }
                    method89(arg0, var3.field2697);
                    if (var3.field2722 != null) {
                        method89(var3.field2722, var3.field2697);
                    }
                    class4 var4 = (class4) field514.method3273((long) var3.field2697);
                    if (var4 != null) {
                        int var5 = var4.field53;
                        if (class164.method29(var5)) {
                            method89(Statics.field2686[var5], -1);
                        }
                    }
                }
                if (var3.field2613 == 6) {
                    if (var3.field2634 != -1 || var3.field2619 != -1) {
                        boolean var6 = method490(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2619;
                        } else {
                            var7 = var3.field2634;
                        }
                        if (var7 != -1) {
                            class40 var8 = class40.method575(var7);
                            var3.field2721 += field341;
                            while (var3.field2721 > var8.field917[var3.field2607]) {
                                var3.field2721 -= var8.field917[var3.field2607];
                                var3.field2607++;
                                if (var3.field2607 >= var8.field915.length) {
                                    var3.field2607 -= var8.field919;
                                    if (var3.field2607 < 0 || var3.field2607 >= var8.field915.length) {
                                        var3.field2607 = 0;
                                    }
                                }
                                method93(var3);
                            }
                        }
                    }
                    if (var3.field2694 != 0 && !var3.field2601) {
                        int var9 = var3.field2694 >> 16;
                        int var10 = var3.field2694 << 16 >> 16;
                        int var11 = field341 * var9;
                        int var12 = field341 * var10;
                        var3.field2629 = var3.field2629 + var11 & 0x7FF;
                        var3.field2660 = var3.field2660 + var12 & 0x7FF;
                        method93(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.dq(IB)V")
    public static final void method519(int arg0) {
        Statics.method720();
        for (class22 var1 = (class22) class22.field577.method3309(); var1 != null; var1 = (class22) class22.field577.method3311()) {
            if (var1.field574 != null) {
                var1.method498();
            }
        }
        int var2 = Statics.method580(arg0).field1065;
        if (var2 == 0) {
            return;
        }
        int var3 = class166.field2742[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class86.method1794(0.9D);
                ((class90) Statics.field1481).method1874(0.9D);
            }
            if (var3 == 2) {
                class86.method1794(0.8D);
                ((class90) Statics.field1481).method1874(0.8D);
            }
            if (var3 == 3) {
                class86.method1794(0.7D);
                ((class90) Statics.field1481).method1874(0.7D);
            }
            if (var3 == 4) {
                class86.method1794(0.6D);
                ((class90) Statics.field1481).method1874(0.6D);
            }
            class47.method2436();
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
            if (field502 != var4) {
                if (field502 == 0 && field503 != -1) {
                    class173.method35(Statics.field549, field503, 0, var4, false);
                    field504 = false;
                } else if (var4 == 0) {
                    Statics.field2795.method3131();
                    class173.field2796 = 1;
                    Statics.field2565 = null;
                    field504 = false;
                } else if (class173.field2796 == 0) {
                    Statics.field2795.method3126(var4);
                } else {
                    Statics.field1285 = var4;
                }
                field502 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field505 = 127;
            }
            if (var3 == 1) {
                field505 = 96;
            }
            if (var3 == 2) {
                field505 = 64;
            }
            if (var3 == 3) {
                field505 = 32;
            }
            if (var3 == 4) {
                field505 = 0;
            }
        }
        if (var2 == 5) {
            field290 = var3;
        }
        if (var2 == 6) {
            field430 = var3;
        }
        if (var2 == 9) {
            field431 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field352 = 127;
            }
            if (var3 == 1) {
                field352 = 96;
            }
            if (var3 == 2) {
                field352 = 64;
            }
            if (var3 == 3) {
                field352 = 32;
            }
            if (var3 == 4) {
                field352 = 0;
            }
        }
        if (var2 == 17) {
            field460 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field280 = (class19) class101.method3237(class19.method1354(), var3);
            if (field280 == null) {
                field280 = class19.field541;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field263 = -1;
        } else {
            field263 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("cb.dl(I)V")
    public static final void method2069() {
        field521.method2396(122);
        for (class4 var0 = (class4) field514.method3276(); var0 != null; var0 = (class4) field514.method3277()) {
            if (var0.field56 == 0 || var0.field56 == 3) {
                method2549(var0, true);
            }
        }
        if (field349 != null) {
            method93(field349);
            field349 = null;
        }
    }

    @ObfuscatedName("q.de(IIII)Le;")
    public static final class4 method2(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field53 = arg1;
        var3.field56 = arg2;
        field514.method3274(var3, (long) arg0);
        method20(arg1);
        class34.method2068(arg1);
        class164 var4 = class164.method619(arg0);
        if (var4 != null) {
            method93(var4);
        }
        if (field349 != null) {
            method93(field349);
            field349 = null;
        }
        method1785();
        if (field428 != -1) {
            method479(field428, 1);
        }
        return var3;
    }

    @ObfuscatedName("dh.dr(Le;ZI)V")
    public static final void method2549(class4 arg0, boolean arg1) {
        int var2 = arg0.field53;
        int var3 = (int) arg0.field2958;
        arg0.method3404();
        if (arg1 && var2 != -1 && Statics.field2602[var2]) {
            Statics.field2603.method2825(var2);
            if (Statics.field2686[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2686[var2].length; var5++) {
                    if (Statics.field2686[var2][var5] != null) {
                        if (Statics.field2686[var2][var5].field2613 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2686[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2686[var2] = null;
                }
                Statics.field2602[var2] = false;
            }
        }
        method1977(var2);
        class164 var6 = class164.method619(var3);
        if (var6 != null) {
            method93(var6);
        }
        method1785();
        if (field428 != -1) {
            method479(field428, 1);
        }
    }

    @ObfuscatedName("x.dx(Lfl;I)Z")
    public static final boolean method505(class164 arg0) {
        int var1 = arg0.field2615;
        if (var1 == 205) {
            field520 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field314.method3015(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field314.method3016(var4, var5 == 1);
        }
        if (var1 == 324) {
            field314.method3017(false);
        }
        if (var1 == 325) {
            field314.method3017(true);
        }
        if (var1 == 326) {
            field521.method2396(146);
            field314.method3018(field521);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cz.ds(IIIILbr;B)V")
    public static final void method1891(int arg0, int arg1, int arg2, int arg3, class74 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field350 + field336 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class86.field1480[var5];
        int var8 = class86.field1464[var5];
        int var9 = var7 * 256 / (field402 + 256);
        int var10 = var8 * 256 / (field402 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1461(Statics.field1864, arg0 + 94 + var11 - arg4.field1308 / 2 + 4, arg1 + 83 - var12 - arg4.field1302 / 2 - 4);
        } else {
            arg4.method1445(arg0 + 94 + var11 - arg4.field1308 / 2 + 4, arg1 + 83 - var12 - arg4.field1302 / 2 - 4);
        }
    }

    @ObfuscatedName("hb.dj(Ljava/lang/String;ZI)Z")
    public static boolean method3579(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class155.method1(arg0, Statics.field1866);
        for (int var3 = 0; var3 < field471; var3++) {
            if (var2.equalsIgnoreCase(class155.method1(field522[var3].field238, Statics.field1866)) && (!arg1 || field522[var3].field245 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class155.method1(Statics.field393.field37, Statics.field1866))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ds.dg(Ljava/lang/String;I)Z")
    public static boolean method2373(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class155.method1(arg0, Statics.field1866);
        for (int var2 = 0; var2 < field524; var2++) {
            class8 var3 = field526[var2];
            if (var1.equalsIgnoreCase(class155.method1(var3.field127, Statics.field1866))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class155.method1(var3.field130, Statics.field1866))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bb.dm(Ljava/lang/String;S)V")
    public static final void method1064(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class155.method1(arg0, Statics.field1866);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field524; var2++) {
            class8 var3 = field526[var2];
            String var4 = var3.field127;
            String var5 = class155.method1(var4, Statics.field1866);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field524--;
                for (int var7 = var2; var7 < field524; var7++) {
                    field526[var7] = field526[var7 + 1];
                }
                field264 = field452;
                field521.method2396(210);
                field521.method2133(class111.method2719(arg0));
                field521.method2139(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cr.da(IB)V")
    public static void method1977(int arg0) {
        for (class191 var1 = (class191) field319.method3276(); var1 != null; var1 = (class191) field319.method3277()) {
            if ((var1.field2958 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3404();
            }
        }
    }

    @ObfuscatedName("cq.dt(Lfl;I)I")
    public static int method1613(class164 arg0) {
        class191 var1 = (class191) field319.method3273(((long) arg0.field2697 << 32) + (long) arg0.field2612);
        return var1 == null ? arg0.field2667 : var1.field2944;
    }

    @ObfuscatedName("v.dv(Lfl;I)Z")
    public static boolean method507(class164 arg0) {
        if (field438) {
            if (method1613(arg0) != 0) {
                return false;
            }
            if (arg0.field2613 == 0) {
                return false;
            }
        }
        return arg0.field2623;
    }

    @ObfuscatedName("ex.dk(Lfl;IB)Ljava/lang/String;")
    public static String method2700(class164 arg0, int arg1) {
        int var2 = method1613(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2699 == null) {
            return null;
        } else if (arg0.field2673 == null || arg0.field2673.length <= arg1 || arg0.field2673[arg1] == null || arg0.field2673[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2673[arg1];
        }
    }

    @ObfuscatedName("bb.dc(Lfl;I)Ljava/lang/String;")
    public static String method1067(class164 arg0) {
        if (class168.method146(method1613(arg0)) == 0) {
            return null;
        } else if (arg0.field2678 == null || arg0.field2678.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2678;
        }
    }

    @ObfuscatedName("p.dz(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method129(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field382 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field382 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field382 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field382 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field382 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field623 != null) {
            var3 = "/p=" + Statics.field623;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field272 + "/a=" + Statics.field1248 + var3 + "/";
    }

    @ObfuscatedName("a.du(Ljava/lang/String;I)V")
    public static void method149(String arg0) {
        Statics.field623 = arg0;
        try {
            String var1 = Statics.field335.getParameter(class180.field2905.field2908);
            String var2 = Statics.field335.getParameter(class180.field2893.field2908);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class103.method1988(class107.method2434() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class124.method2464(Statics.field335, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("fr.dp(Ljava/lang/String;ZI)V")
    public static void method3235(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2890; var5++) {
            class47 var6 = class47.method832(var5);
            if ((!arg1 || var6.field1059) && var6.field1052 == -1 && var6.field1021.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field801 = -1;
                    Statics.field1829 = null;
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
        Statics.field1829 = var3;
        Statics.field1070 = 0;
        Statics.field801 = var4;
        String[] var9 = new String[Statics.field801];
        for (int var10 = 0; var10 < Statics.field801; var10++) {
            var9[var10] = class47.method832(var3[var10]).field1021;
        }
        class116.method752(var9, Statics.field1829);
    }
}

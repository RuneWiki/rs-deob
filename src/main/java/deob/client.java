package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class148 {

    @ObfuscatedName("client.w")
    public static class112[] field332 = new class112[4];

    @ObfuscatedName("client.o")
    public static boolean field272 = true;

    @ObfuscatedName("client.g")
    public static int field273 = 1;

    @ObfuscatedName("client.l")
    public static int field481 = 0;

    @ObfuscatedName("client.r")
    public static int field276 = 0;

    @ObfuscatedName("client.h")
    public static boolean field277 = false;

    @ObfuscatedName("client.u")
    public static boolean field278 = false;

    @ObfuscatedName("client.p")
    public static int field534 = 0;

    @ObfuscatedName("client.t")
    public static int field281 = 0;

    @ObfuscatedName("client.c")
    public static boolean field282 = true;

    @ObfuscatedName("client.z")
    public static int field283 = 0;

    @ObfuscatedName("client.n")
    public static long field540 = 1L;

    @ObfuscatedName("client.a")
    public static int field372 = -1;

    @ObfuscatedName("client.b")
    public static int field530 = -1;

    @ObfuscatedName("client.aj")
    public static int field287 = -1;

    @ObfuscatedName("client.an")
    public static boolean field288 = true;

    @ObfuscatedName("client.ap")
    public static boolean field339 = false;

    @ObfuscatedName("client.ar")
    public static int field290 = 0;

    @ObfuscatedName("client.ab")
    public static int field419 = 0;

    @ObfuscatedName("client.ai")
    public static int field292 = 0;

    @ObfuscatedName("client.aa")
    public static int field337 = 0;

    @ObfuscatedName("client.ax")
    public static int field294 = 0;

    @ObfuscatedName("client.ad")
    public static int field310 = 0;

    @ObfuscatedName("client.av")
    public static int field296 = 0;

    @ObfuscatedName("client.aq")
    public static int field297 = 0;

    @ObfuscatedName("client.af")
    public static int field298 = 0;

    @ObfuscatedName("client.ay")
    public static class22 field299 = class22.field582;

    @ObfuscatedName("client.ah")
    public static class22 field356 = class22.field582;

    @ObfuscatedName("client.as")
    public static int field510 = 0;

    @ObfuscatedName("client.au")
    public static int field302 = 0;

    @ObfuscatedName("client.am")
    public static int field303 = 0;

    @ObfuscatedName("client.bn")
    public static int field304 = 0;

    @ObfuscatedName("client.bz")
    public static int field305 = 0;

    @ObfuscatedName("client.bg")
    public static int field306 = 0;

    @ObfuscatedName("client.bp")
    public static int field421 = 0;

    @ObfuscatedName("client.bu")
    public static int field308 = 0;

    @ObfuscatedName("client.cx")
    public static class37[] field309 = new class37[32768];

    @ObfuscatedName("client.ct")
    public static int field395 = 0;

    @ObfuscatedName("client.cz")
    public static int[] field311 = new int[32768];

    @ObfuscatedName("client.cg")
    public static int field312 = 0;

    @ObfuscatedName("client.cf")
    public static int[] field313 = new int[250];

    @ObfuscatedName("client.cl")
    public static class126 field314 = new class126(5000);

    @ObfuscatedName("client.ce")
    public static class126 field315 = new class126(5000);

    @ObfuscatedName("client.cu")
    public static class126 field316 = new class126(15000);

    @ObfuscatedName("client.cd")
    public static int field284 = 0;

    @ObfuscatedName("client.cv")
    public static int field318 = 0;

    @ObfuscatedName("client.cn")
    public static int field319 = 0;

    @ObfuscatedName("client.ca")
    public static int field363 = 0;

    @ObfuscatedName("client.cy")
    public static int field321 = 0;

    @ObfuscatedName("client.co")
    public static int field322 = 0;

    @ObfuscatedName("client.ci")
    public static int field291 = 0;

    @ObfuscatedName("client.cs")
    public static int field324 = 0;

    @ObfuscatedName("client.cq")
    public static boolean field325 = false;

    @ObfuscatedName("client.dg")
    public static int field326 = 0;

    @ObfuscatedName("client.de")
    public static int field327 = 1;

    @ObfuscatedName("client.du")
    public static int field460 = 0;

    @ObfuscatedName("client.ds")
    public static int field522 = 1;

    @ObfuscatedName("client.df")
    public static int field417 = 0;

    @ObfuscatedName("client.dd")
    public static boolean field333 = false;

    @ObfuscatedName("client.dn")
    public static int[][][] field334 = new int[4][13][13];

    @ObfuscatedName("client.dj")
    public static final int[] field335 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dx")
    public static int field342 = 0;

    @ObfuscatedName("client.dt")
    public static int field546 = 2;

    @ObfuscatedName("client.dy")
    public static int field338 = 0;

    @ObfuscatedName("client.db")
    public static int field286 = 2;

    @ObfuscatedName("client.dq")
    public static int field340 = 0;

    @ObfuscatedName("client.ec")
    public static int field369 = 1;

    @ObfuscatedName("client.ee")
    public static int field382 = 0;

    @ObfuscatedName("client.eb")
    public static int field343 = 0;

    @ObfuscatedName("client.ea")
    public static int field422 = 2;

    @ObfuscatedName("client.et")
    public static int field485 = 0;

    @ObfuscatedName("client.eq")
    public static int field346 = 1;

    @ObfuscatedName("client.eh")
    public static int field500 = 0;

    @ObfuscatedName("client.ei")
    public static int field330 = 0;

    @ObfuscatedName("client.en")
    public static int field351 = 2301979;

    @ObfuscatedName("client.eg")
    public static int field482 = 5063219;

    @ObfuscatedName("client.ex")
    public static int field350 = 3353893;

    @ObfuscatedName("client.el")
    public static int field354 = 7759444;

    @ObfuscatedName("client.ef")
    public static boolean field355 = false;

    @ObfuscatedName("client.ek")
    public static int field506 = 0;

    @ObfuscatedName("client.fl")
    public static int field357 = 128;

    @ObfuscatedName("client.fk")
    public static int field358 = 0;

    @ObfuscatedName("client.fo")
    public static int field359 = 0;

    @ObfuscatedName("client.fe")
    public static int field476 = 0;

    @ObfuscatedName("client.fx")
    public static int field472 = 0;

    @ObfuscatedName("client.fp")
    public static int field362 = 0;

    @ObfuscatedName("client.fv")
    public static int field438 = 50;

    @ObfuscatedName("client.fa")
    public static int field364 = 0;

    @ObfuscatedName("client.fi")
    public static boolean field433 = false;

    @ObfuscatedName("client.fz")
    public static int field366 = 0;

    @ObfuscatedName("client.fr")
    public static int field367 = 0;

    @ObfuscatedName("client.fq")
    public static int field301 = 50;

    @ObfuscatedName("client.ff")
    public static int[] field344 = new int[field301];

    @ObfuscatedName("client.fn")
    public static int[] field280 = new int[field301];

    @ObfuscatedName("client.fb")
    public static int[] field371 = new int[field301];

    @ObfuscatedName("client.fh")
    public static int[] field513 = new int[field301];

    @ObfuscatedName("client.fw")
    public static int[] field373 = new int[field301];

    @ObfuscatedName("client.fg")
    public static int[] field374 = new int[field301];

    @ObfuscatedName("client.fm")
    public static int[] field375 = new int[field301];

    @ObfuscatedName("client.gp")
    public static String[] field376 = new String[field301];

    @ObfuscatedName("client.gl")
    public static int[][] field377 = new int[104][104];

    @ObfuscatedName("client.gx")
    public static int field378 = 0;

    @ObfuscatedName("client.gz")
    public static int field379 = -1;

    @ObfuscatedName("client.gt")
    public static int field398 = -1;

    @ObfuscatedName("client.gj")
    public static int field381 = 0;

    @ObfuscatedName("client.gc")
    public static int field352 = 0;

    @ObfuscatedName("client.gb")
    public static int field424 = 0;

    @ObfuscatedName("client.go")
    public static int field384 = 0;

    @ObfuscatedName("client.ge")
    public static int field489 = 0;

    @ObfuscatedName("client.gf")
    public static int field386 = 0;

    @ObfuscatedName("client.gi")
    public static int field387 = 0;

    @ObfuscatedName("client.gr")
    public static int field388 = 0;

    @ObfuscatedName("client.gk")
    public static int field389 = 0;

    @ObfuscatedName("client.gg")
    public static int field390 = 0;

    @ObfuscatedName("client.gy")
    public static boolean field341 = false;

    @ObfuscatedName("client.gu")
    public static int field392 = 0;

    @ObfuscatedName("client.gh")
    public static int field393 = 0;

    @ObfuscatedName("client.gv")
    public static class3[] field394 = new class3[2048];

    @ObfuscatedName("client.gd")
    public static int field552 = -1;

    @ObfuscatedName("client.gs")
    public static int field550 = 0;

    @ObfuscatedName("client.hq")
    public static int field397 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field432 = new int[1000];

    @ObfuscatedName("client.hy")
    public static final int[] field399 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hj")
    public static String[] field400 = new String[8];

    @ObfuscatedName("client.hp")
    public static boolean[] field401 = new boolean[8];

    @ObfuscatedName("client.hu")
    public static int[] field307 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hk")
    public static int field345 = -1;

    @ObfuscatedName("client.ht")
    public static class203[][][] field404 = new class203[4][104][104];

    @ObfuscatedName("client.hd")
    public static class203 field370 = new class203();

    @ObfuscatedName("client.hs")
    public static class203 field406 = new class203();

    @ObfuscatedName("client.hx")
    public static class203 field407 = new class203();

    @ObfuscatedName("client.hh")
    public static int[] field408 = new int[25];

    @ObfuscatedName("client.hn")
    public static int[] field409 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field470 = new int[25];

    @ObfuscatedName("client.he")
    public static int field529 = 0;

    @ObfuscatedName("client.hb")
    public static boolean field518 = false;

    @ObfuscatedName("client.ho")
    public static int field413 = 0;

    @ObfuscatedName("client.ha")
    public static int[] field295 = new int[500];

    @ObfuscatedName("client.hl")
    public static int[] field415 = new int[500];

    @ObfuscatedName("client.iv")
    public static int[] field416 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field323 = new int[500];

    @ObfuscatedName("client.is")
    public static String[] field418 = new String[500];

    @ObfuscatedName("client.ig")
    public static String[] field329 = new String[500];

    @ObfuscatedName("client.ie")
    public static int field420 = -1;

    @ObfuscatedName("client.ib")
    public static int field528 = -1;

    @ObfuscatedName("client.io")
    public static int field391 = 0;

    @ObfuscatedName("client.ik")
    public static int field423 = 50;

    @ObfuscatedName("client.ij")
    public static int field532 = 0;

    @ObfuscatedName("client.ix")
    public static String field425 = null;

    @ObfuscatedName("client.iy")
    public static boolean field445 = false;

    @ObfuscatedName("client.iw")
    public static int field427 = -1;

    @ObfuscatedName("client.ir")
    public static int field428 = -1;

    @ObfuscatedName("client.ii")
    public static String field429 = null;

    @ObfuscatedName("client.if")
    public static String field439 = null;

    @ObfuscatedName("client.it")
    public static int field431 = -1;

    @ObfuscatedName("client.ia")
    public static class200 field536 = new class200(8);

    @ObfuscatedName("client.ih")
    public static int field430 = 0;

    @ObfuscatedName("client.jr")
    public static int field434 = 0;

    @ObfuscatedName("client.jb")
    public static class177 field403 = null;

    @ObfuscatedName("client.jg")
    public static int field436 = 0;

    @ObfuscatedName("client.jn")
    public static int field437 = 0;

    @ObfuscatedName("client.jp")
    public static int field410 = 0;

    @ObfuscatedName("client.jf")
    public static int field464 = -1;

    @ObfuscatedName("client.jc")
    public static boolean field440 = false;

    @ObfuscatedName("client.jm")
    public static boolean field441 = false;

    @ObfuscatedName("client.jq")
    public static boolean field442 = false;

    @ObfuscatedName("client.jj")
    public static class177 field293 = null;

    @ObfuscatedName("client.jl")
    public static class177 field541 = null;

    @ObfuscatedName("client.jz")
    public static class177 field353 = null;

    @ObfuscatedName("client.jy")
    public static int field446 = 0;

    @ObfuscatedName("client.ja")
    public static int field447 = 0;

    @ObfuscatedName("client.jh")
    public static class177 field448 = null;

    @ObfuscatedName("client.ji")
    public static boolean field449 = false;

    @ObfuscatedName("client.jk")
    public static int field450 = -1;

    @ObfuscatedName("client.jd")
    public static int field516 = -1;

    @ObfuscatedName("client.ju")
    public static boolean field452 = false;

    @ObfuscatedName("client.je")
    public static int field453 = -1;

    @ObfuscatedName("client.jo")
    public static int field454 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field455 = false;

    @ObfuscatedName("client.ky")
    public static int field456 = 1;

    @ObfuscatedName("client.ke")
    public static int[] field457 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field285 = 0;

    @ObfuscatedName("client.kd")
    public static int[] field459 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field458 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field542 = new int[32];

    @ObfuscatedName("client.km")
    public static int field462 = 0;

    @ObfuscatedName("client.ko")
    public static int field463 = 0;

    @ObfuscatedName("client.kf")
    public static int field549 = 0;

    @ObfuscatedName("client.kj")
    public static int field405 = 0;

    @ObfuscatedName("client.kl")
    public static int field466 = 0;

    @ObfuscatedName("client.kc")
    public static int field467 = 0;

    @ObfuscatedName("client.kz")
    public static int field468 = 0;

    @ObfuscatedName("client.kn")
    public static int field469 = 0;

    @ObfuscatedName("client.ku")
    public static class203 field328 = new class203();

    @ObfuscatedName("client.kg")
    public static class203 field471 = new class203();

    @ObfuscatedName("client.ka")
    public static class203 field383 = new class203();

    @ObfuscatedName("client.kw")
    public static class200 field473 = new class200(512);

    @ObfuscatedName("client.kr")
    public static int field414 = 0;

    @ObfuscatedName("client.kt")
    public static int field475 = -2;

    @ObfuscatedName("client.kh")
    public static boolean[] field461 = new boolean[100];

    @ObfuscatedName("client.li")
    public static boolean[] field477 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static boolean[] field478 = new boolean[100];

    @ObfuscatedName("client.ly")
    public static int[] field479 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field480 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field360 = new int[100];

    @ObfuscatedName("client.le")
    public static int[] field496 = new int[100];

    @ObfuscatedName("client.ln")
    public static int field483 = 0;

    @ObfuscatedName("client.lj")
    public static long field484 = 0L;

    @ObfuscatedName("client.ll")
    public static boolean field361 = true;

    @ObfuscatedName("client.lg")
    public static int field486 = 765;

    @ObfuscatedName("client.lv")
    public static int field487 = 1;

    @ObfuscatedName("client.lo")
    public static int[] field488 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lq")
    public static int field396 = 0;

    @ObfuscatedName("client.lk")
    public static int field553 = 0;

    @ObfuscatedName("client.lh")
    public static String field491 = "";

    @ObfuscatedName("client.lx")
    public static long[] field527 = new long[100];

    @ObfuscatedName("client.lf")
    public static int field493 = 0;

    @ObfuscatedName("client.lu")
    public static int field494 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field320 = new int[128];

    @ObfuscatedName("client.mm")
    public static int[] field279 = new int[128];

    @ObfuscatedName("client.mu")
    public static long field497 = -1L;

    @ObfuscatedName("client.mz")
    public static String field498 = null;

    @ObfuscatedName("client.mg")
    public static String field499 = null;

    @ObfuscatedName("client.mo")
    public static int field411 = -1;

    @ObfuscatedName("client.mb")
    public static int field501 = 0;

    @ObfuscatedName("client.mq")
    public static int[] field502 = new int[1000];

    @ObfuscatedName("client.mw")
    public static int[] field503 = new int[1000];

    @ObfuscatedName("client.mt")
    public static class82[] field504 = new class82[1000];

    @ObfuscatedName("client.ma")
    public static int field505 = 0;

    @ObfuscatedName("client.mp")
    public static int field465 = 0;

    @ObfuscatedName("client.mr")
    public static int field507 = 0;

    @ObfuscatedName("client.me")
    public static int field508 = 255;

    @ObfuscatedName("client.mc")
    public static int field444 = -1;

    @ObfuscatedName("client.my")
    public static boolean field533 = false;

    @ObfuscatedName("client.nh")
    public static int field511 = 127;

    @ObfuscatedName("client.ne")
    public static int field512 = 127;

    @ObfuscatedName("client.nb")
    public static int field275 = 0;

    @ObfuscatedName("client.nx")
    public static int[] field514 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field347 = new int[50];

    @ObfuscatedName("client.ns")
    public static int[] field435 = new int[50];

    @ObfuscatedName("client.nf")
    public static int[] field289 = new int[50];

    @ObfuscatedName("client.nl")
    public static class62[] field451 = new class62[50];

    @ObfuscatedName("client.np")
    public static boolean field519 = false;

    @ObfuscatedName("client.nw")
    public static boolean[] field520 = new boolean[5];

    @ObfuscatedName("client.on")
    public static int[] field521 = new int[5];

    @ObfuscatedName("client.oz")
    public static int[] field492 = new int[5];

    @ObfuscatedName("client.oo")
    public static int[] field523 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field524 = new int[5];

    @ObfuscatedName("client.ou")
    public static short field525 = 256;

    @ObfuscatedName("client.og")
    public static short field526 = 205;

    @ObfuscatedName("client.oq")
    public static short field348 = 256;

    @ObfuscatedName("client.ow")
    public static short field368 = 320;

    @ObfuscatedName("client.of")
    public static short field509 = 1;

    @ObfuscatedName("client.om")
    public static short field426 = 32767;

    @ObfuscatedName("client.ot")
    public static short field531 = 1;

    @ObfuscatedName("client.ol")
    public static short field543 = 32767;

    @ObfuscatedName("client.oc")
    public static int field515 = 0;

    @ObfuscatedName("client.op")
    public static int field317 = 0;

    @ObfuscatedName("client.oh")
    public static int field535 = 0;

    @ObfuscatedName("client.oi")
    public static int field365 = 0;

    @ObfuscatedName("client.oa")
    public static int field537 = 0;

    @ObfuscatedName("client.or")
    public static int field538 = 0;

    @ObfuscatedName("client.ox")
    public static int field539 = 0;

    @ObfuscatedName("client.ov")
    public static class18[] field274 = new class18[400];

    @ObfuscatedName("client.oy")
    public static class199 field402 = new class199();

    @ObfuscatedName("client.oe")
    public static int field544 = 0;

    @ObfuscatedName("client.ok")
    public static class8[] field385 = new class8[400];

    @ObfuscatedName("client.os")
    public static class183 field517 = new class183();

    @ObfuscatedName("client.pq")
    public static int field545 = -1;

    @ObfuscatedName("client.pu")
    public static int field490 = -1;

    @ObfuscatedName("client.ph")
    public static class224[] field547 = new class224[8];

    @ObfuscatedName("client.ps")
    public static long field336 = -1L;

    @ObfuscatedName("client.po")
    public static long field270 = -1L;

    @ObfuscatedName("client.pe")
    public static final class11 field551 = new class11();

    @ObfuscatedName("client.pw")
    public static int[] field443 = new int[50];

    @ObfuscatedName("client.px")
    public static int[] field300 = new int[50];

    @ObfuscatedName("client.o(B)V")
    public final void method422() {
    }

    public final void init() {
        if (!this.method2896()) {
            return;
        }
        class194[] var1 = class194.method2360();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class194 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3112);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3112)) {
                    case 1:
                        Statics.field1840 = var4;
                    case 2:
                    case 12:
                    case 14:
                    default:
                        break;
                    case 3:
                        field276 = Integer.parseInt(var4);
                        break;
                    case 4:
                        field534 = Integer.parseInt(var4);
                        break;
                    case 5:
                        Statics.field474 = var4;
                        break;
                    case 6:
                        Statics.field1241 = (class158) class113.method78(class158.method3002(), Integer.parseInt(var4));
                        if (Statics.field1241 == class158.field2343) {
                            Statics.field2118 = class216.field3192;
                        } else {
                            Statics.field2118 = class216.field3188;
                        }
                        break;
                    case 7:
                        Statics.field412 = class157.method2137(Integer.parseInt(var4));
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class2.field27)) {
                            field277 = true;
                        } else {
                            field277 = false;
                        }
                        break;
                    case 9:
                        field273 = Integer.parseInt(var4);
                        break;
                    case 10:
                        if (var4.equalsIgnoreCase(class2.field27)) {
                        }
                        break;
                    case 11:
                        Statics.field797 = Integer.parseInt(var4);
                        break;
                    case 13:
                        field481 = Integer.parseInt(var4);
                        break;
                    case 15:
                        Statics.field2238 = Integer.parseInt(var4);
                }
            }
        }
        Statics.method7();
        Statics.field2061 = this.getCodeBase().getHost();
        String var5 = Statics.field412.field2335;
        byte var6 = 0;
        try {
            Statics.field2295 = 16;
            Statics.field575 = var6;
            try {
                Statics.field2722 = System.getProperty("os.name");
            } catch (Exception var26) {
                Statics.field2722 = "Unknown";
            }
            Statics.field1694 = Statics.field2722.toLowerCase();
            try {
                Statics.field1156 = System.getProperty("user.home");
                if (Statics.field1156 != null) {
                    Statics.field1156 = Statics.field1156 + "/";
                }
            } catch (Exception var25) {
            }
            try {
                if (Statics.field1694.startsWith("win")) {
                    if (Statics.field1156 == null) {
                        Statics.field1156 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1156 == null) {
                    Statics.field1156 = System.getenv("HOME");
                }
                if (Statics.field1156 != null) {
                    Statics.field1156 = Statics.field1156 + "/";
                }
            } catch (Exception var24) {
            }
            if (Statics.field1156 == null) {
                Statics.field1156 = "~/";
            }
            Statics.field1160 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1156, "/tmp/", "" };
            Statics.field1155 = new String[] { ".jagex_cache_" + Statics.field575, ".file_store_" + Statics.field575 };
            label154: for (int var10 = 0; var10 < 4; var10++) {
                Statics.field2292 = class153.method114("oldschool", var5, var10);
                if (!Statics.field2292.exists()) {
                    Statics.field2292.mkdirs();
                }
                File[] var11 = Statics.field2292.listFiles();
                if (var11 == null) {
                    break;
                }
                File[] var12 = var11;
                int var13 = 0;
                while (true) {
                    if (var13 >= var12.length) {
                        break label154;
                    }
                    File var14 = var12[var13];
                    if (!class153.method2336(var14, false)) {
                        break;
                    }
                    var13++;
                }
            }
            class139.method2135(Statics.field2292);
            try {
                File var15 = new File(Statics.field1156, "random.dat");
                if (var15.exists()) {
                    class153.field2296 = new class232(new class231(var15, "rw", 25L), 24, 0);
                } else {
                    label134: for (int var16 = 0; var16 < Statics.field1155.length; var16++) {
                        for (int var17 = 0; var17 < Statics.field1160.length; var17++) {
                            File var18 = new File(Statics.field1160[var17] + Statics.field1155[var16] + File.separatorChar + "random.dat");
                            if (var18.exists()) {
                                class153.field2296 = new class232(new class231(var18, "rw", 25L), 24, 0);
                                break label134;
                            }
                        }
                    }
                }
                if (class153.field2296 == null) {
                    RandomAccessFile var19 = new RandomAccessFile(var15, "rw");
                    int var20 = var19.read();
                    var19.seek(0L);
                    var19.write(var20);
                    var19.seek(0L);
                    var19.close();
                    class153.field2296 = new class232(new class231(var15, "rw", 25L), 24, 0);
                }
            } catch (IOException var27) {
            }
            class153.field2291 = new class232(new class231(class139.method164("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class153.field2290 = new class232(new class231(class139.method164("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1703 = new class232[Statics.field2295];
            for (int var22 = 0; var22 < Statics.field2295; var22++) {
                Statics.field1703[var22] = new class232(new class231(class139.method164("main_file_cache.idx" + var22), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var28) {
            class152.method1096((String) null, var28);
        }
        Statics.field271 = this;
        this.method2943(765, 503, 119);
    }

    @ObfuscatedName("client.j(I)V")
    public final void method224() {
        Statics.field2020 = field276 == 0 ? 43594 : field273 + 40000;
        Statics.field7 = field276 == 0 ? 443 : field273 + 50000;
        Statics.field992 = Statics.field2020;
        Statics.field2969 = class178.field2934;
        Statics.field2970 = class178.field2937;
        Statics.field1112 = class178.field2933;
        Statics.field226 = class178.field2932;
        if (Statics.field2148.toLowerCase().indexOf("microsoft") == -1) {
            class141.field2166[44] = 71;
            class141.field2166[45] = 26;
            class141.field2166[46] = 72;
            class141.field2166[47] = 73;
            class141.field2166[59] = 57;
            class141.field2166[61] = 27;
            class141.field2166[91] = 42;
            class141.field2166[92] = 74;
            class141.field2166[93] = 43;
            class141.field2166[192] = 28;
            class141.field2166[222] = 58;
            class141.field2166[520] = 59;
        } else {
            class141.field2166[186] = 57;
            class141.field2166[187] = 27;
            class141.field2166[188] = 71;
            class141.field2166[189] = 26;
            class141.field2166[190] = 72;
            class141.field2166[191] = 73;
            class141.field2166[192] = 58;
            class141.field2166[219] = 42;
            class141.field2166[220] = 74;
            class141.field2166[221] = 43;
            class141.field2166[222] = 59;
            class141.field2166[223] = 28;
        }
        class141.method2029(Statics.field1966);
        class144.method5(Statics.field1966);
        Statics.field3172 = class135.method3();
        if (Statics.field3172 != null) {
            Statics.field3172.method2730(Statics.field1966);
        }
        Statics.field3197 = new class138(255, class153.field2291, class153.field2290, 500000);
        class231 var1 = null;
        class9 var2 = new class9();
        try {
            var1 = class153.method92("", Statics.field1241.field2344, false);
            byte[] var3 = new byte[(int) var1.method3945()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method3941(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class9(new class123(var3));
        } catch (Exception var11) {
        }
        try {
            if (var1 != null) {
                var1.method3954();
            }
        } catch (Exception var10) {
        }
        Statics.field163 = var2;
        Statics.field74 = this.getToolkit().getSystemClipboard();
        class142.method569(this, Statics.field2012);
        if (field276 != 0) {
            field339 = true;
        }
        int var9 = Statics.field163.field137;
        field484 = 0L;
        if (var9 >= 2) {
            field361 = true;
        } else {
            field361 = false;
        }
        method172();
        if (field281 >= 25) {
            method3270();
        }
        field2266 = true;
    }

    @ObfuscatedName("client.r(B)V")
    public final void method445() {
        field283++;
        this.method353();
        while (true) {
            class203 var1 = class174.field2760;
            class173 var2;
            synchronized (class174.field2760) {
                var2 = (class173) class174.field2758.method3619();
            }
            if (var2 == null) {
                class187.method585();
                method544();
                class141 var4 = class141.field2190;
                synchronized (class141.field2190) {
                    class141.field2186++;
                    class141.field2181 = class141.field2185;
                    class141.field2182 = 0;
                    if (class141.field2178 >= 0) {
                        while (class141.field2178 != class141.field2177) {
                            int var6 = class141.field2159[class141.field2177];
                            class141.field2177 = class141.field2177 + 1 & 0x7F;
                            if (var6 < 0) {
                                class141.field2187[~var6] = false;
                            } else {
                                if (!class141.field2187[var6] && class141.field2182 < class141.field2179.length - 1) {
                                    class141.field2179[++class141.field2182 - 1] = var6;
                                }
                                class141.field2187[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class141.field2187[var5] = false;
                        }
                        class141.field2178 = class141.field2177;
                    }
                    class141.field2185 = class141.field2184;
                }
                class144 var8 = class144.field2213;
                synchronized (class144.field2213) {
                    class144.field2217 = class144.field2210;
                    class144.field2214 = class144.field2211;
                    class144.field2215 = class144.field2212 * -2050446839;
                    class144.field2225 = class144.field2216;
                    class144.field2221 = class144.field2219;
                    class144.field2223 = class144.field2218;
                    class144.field2209 = class144.field2224;
                    class144.field2216 = 0;
                }
                if (Statics.field3172 != null) {
                    int var10 = Statics.field3172.method2726();
                    field469 = var10;
                }
                if (field281 == 0) {
                    method175();
                    Statics.field1004.method2741();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field2261[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field2262[var12] = 0L;
                    }
                    Statics.field119 = 0;
                } else if (field281 == 5) {
                    class34.method1077(this);
                    method175();
                    Statics.field1004.method2741();
                    for (int var13 = 0; var13 < 32; var13++) {
                        field2261[var13] = 0L;
                    }
                    for (int var14 = 0; var14 < 32; var14++) {
                        field2262[var14] = 0L;
                    }
                    Statics.field119 = 0;
                } else if (field281 == 10 || field281 == 11) {
                    class34.method1077(this);
                } else if (field281 == 20) {
                    class34.method1077(this);
                    method19();
                } else if (field281 == 25) {
                    method2033(false);
                    field326 = 0;
                    boolean var15 = true;
                    for (int var16 = 0; var16 < Statics.field1467.length; var16++) {
                        if (Statics.field1296[var16] != -1 && Statics.field1467[var16] == null) {
                            Statics.field1467[var16] = Statics.field2098.method3086(Statics.field1296[var16], 0);
                            if (Statics.field1467[var16] == null) {
                                var15 = false;
                                field326++;
                            }
                        }
                        if (Statics.field2252[var16] != -1 && Statics.field633[var16] == null) {
                            Statics.field633[var16] = Statics.field2098.method3087(Statics.field2252[var16], 0, Statics.field331[var16]);
                            if (Statics.field633[var16] == null) {
                                var15 = false;
                                field326++;
                            }
                        }
                    }
                    if (var15) {
                        field460 = 0;
                        boolean var17 = true;
                        for (int var18 = 0; var18 < Statics.field1467.length; var18++) {
                            byte[] var19 = Statics.field633[var18];
                            if (var19 != null) {
                                int var20 = (Statics.field2055[var18] >> 8) * 64 - Statics.field839;
                                int var21 = (Statics.field2055[var18] & 0xFF) * 64 - Statics.field185;
                                if (field333) {
                                    var20 = 10;
                                    var21 = 10;
                                }
                                boolean var23 = true;
                                class123 var24 = new class123(var19);
                                int var25 = -1;
                                label684: while (true) {
                                    int var26 = var24.method2427();
                                    if (var26 == 0) {
                                        var17 &= var23;
                                        break;
                                    }
                                    var25 += var26;
                                    int var27 = 0;
                                    boolean var28 = false;
                                    while (true) {
                                        while (!var28) {
                                            int var30 = var24.method2427();
                                            if (var30 == 0) {
                                                continue label684;
                                            }
                                            var27 += var30 - 1;
                                            int var31 = var27 & 0x3F;
                                            int var32 = var27 >> 6 & 0x3F;
                                            int var33 = var24.method2398() >> 2;
                                            int var34 = var20 + var32;
                                            int var35 = var21 + var31;
                                            if (var34 > 0 && var35 > 0 && var34 < 103 && var35 < 103) {
                                                class43 var36 = class43.method96(var25);
                                                if (var33 != 22 || !field278 || var36.field975 != 0 || var36.field960 == 1 || var36.field972) {
                                                    if (!var36.method800()) {
                                                        field460++;
                                                        var23 = false;
                                                    }
                                                    var28 = true;
                                                }
                                            }
                                        }
                                        int var29 = var24.method2427();
                                        if (var29 == 0) {
                                            break;
                                        }
                                        var24.method2398();
                                    }
                                }
                            }
                        }
                        if (var17) {
                            if (field417 != 0) {
                                method166(class161.field2376 + class2.field21 + class2.field24 + 100 + "%" + class2.field23, true);
                            }
                            method544();
                            method2119();
                            method544();
                            Statics.field92.method1869();
                            method544();
                            System.gc();
                            for (int var38 = 0; var38 < 4; var38++) {
                                field332[var38].method2325();
                            }
                            for (int var39 = 0; var39 < 4; var39++) {
                                for (int var40 = 0; var40 < 104; var40++) {
                                    for (int var41 = 0; var41 < 104; var41++) {
                                        class6.field79[var39][var40][var41] = 0;
                                    }
                                }
                            }
                            method544();
                            class6.field88 = 99;
                            Statics.field81 = new byte[4][104][104];
                            Statics.field82 = new byte[4][104][104];
                            Statics.field2354 = new byte[4][104][104];
                            Statics.field2142 = new byte[4][104][104];
                            Statics.field763 = new int[4][105][105];
                            Statics.field1456 = new byte[4][105][105];
                            Statics.field2651 = new int[105][105];
                            Statics.field3054 = new int[104];
                            Statics.field261 = new int[104];
                            Statics.field2053 = new int[104];
                            Statics.field68 = new int[104];
                            Statics.field2965 = new int[104];
                            int var42 = Statics.field1467.length;
                            class25.method602();
                            method2033(true);
                            if (!field333) {
                                for (int var43 = 0; var43 < var42; var43++) {
                                    int var44 = (Statics.field2055[var43] >> 8) * 64 - Statics.field839;
                                    int var45 = (Statics.field2055[var43] & 0xFF) * 64 - Statics.field185;
                                    byte[] var46 = Statics.field1467[var43];
                                    if (var46 != null) {
                                        method544();
                                        class6.method587(var46, var44, var45, Statics.field150 * 8 - 48, Statics.field804 * 8 - 48, field332);
                                    }
                                }
                                for (int var47 = 0; var47 < var42; var47++) {
                                    int var48 = (Statics.field2055[var47] >> 8) * 64 - Statics.field839;
                                    int var49 = (Statics.field2055[var47] & 0xFF) * 64 - Statics.field185;
                                    byte[] var50 = Statics.field1467[var47];
                                    if (var50 == null && Statics.field804 < 800) {
                                        method544();
                                        class6.method140(var48, var49, 64, 64);
                                    }
                                }
                                method2033(true);
                                for (int var51 = 0; var51 < var42; var51++) {
                                    byte[] var52 = Statics.field633[var51];
                                    if (var52 != null) {
                                        int var53 = (Statics.field2055[var51] >> 8) * 64 - Statics.field839;
                                        int var54 = (Statics.field2055[var51] & 0xFF) * 64 - Statics.field185;
                                        method544();
                                        class90 var55 = Statics.field92;
                                        class112[] var56 = field332;
                                        class123 var57 = new class123(var52);
                                        int var58 = -1;
                                        while (true) {
                                            int var59 = var57.method2427();
                                            if (var59 == 0) {
                                                break;
                                            }
                                            var58 += var59;
                                            int var60 = 0;
                                            while (true) {
                                                int var61 = var57.method2427();
                                                if (var61 == 0) {
                                                    break;
                                                }
                                                var60 += var61 - 1;
                                                int var62 = var60 & 0x3F;
                                                int var63 = var60 >> 6 & 0x3F;
                                                int var64 = var60 >> 12;
                                                int var65 = var57.method2398();
                                                int var66 = var65 >> 2;
                                                int var67 = var65 & 0x3;
                                                int var68 = var53 + var63;
                                                int var69 = var54 + var62;
                                                if (var68 > 0 && var69 > 0 && var68 < 103 && var69 < 103) {
                                                    int var70 = var64;
                                                    if ((class6.field79[1][var68][var69] & 0x2) == 2) {
                                                        var70 = var64 - 1;
                                                    }
                                                    class112 var71 = null;
                                                    if (var70 >= 0) {
                                                        var71 = var56[var70];
                                                    }
                                                    class6.method2766(var64, var68, var69, var58, var67, var66, var55, var71);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (field333) {
                                int var72 = 0;
                                label589: while (true) {
                                    if (var72 >= 4) {
                                        for (int var102 = 0; var102 < 13; var102++) {
                                            for (int var103 = 0; var103 < 13; var103++) {
                                                int var104 = field334[0][var102][var103];
                                                if (var104 == -1) {
                                                    class6.method140(var102 * 8, var103 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method2033(true);
                                        int var105 = 0;
                                        while (true) {
                                            if (var105 >= 4) {
                                                break label589;
                                            }
                                            method544();
                                            for (int var106 = 0; var106 < 13; var106++) {
                                                label478: for (int var107 = 0; var107 < 13; var107++) {
                                                    int var108 = field334[var105][var106][var107];
                                                    if (var108 != -1) {
                                                        int var109 = var108 >> 24 & 0x3;
                                                        int var110 = var108 >> 1 & 0x3;
                                                        int var111 = var108 >> 14 & 0x3FF;
                                                        int var112 = var108 >> 3 & 0x7FF;
                                                        int var113 = (var111 / 8 << 8) + var112 / 8;
                                                        for (int var114 = 0; var114 < Statics.field2055.length; var114++) {
                                                            if (Statics.field2055[var114] == var113 && Statics.field633[var114] != null) {
                                                                byte[] var115 = Statics.field633[var114];
                                                                int var116 = var106 * 8;
                                                                int var117 = var107 * 8;
                                                                int var118 = (var111 & 0x7) * 8;
                                                                int var119 = (var112 & 0x7) * 8;
                                                                class90 var120 = Statics.field92;
                                                                class112[] var121 = field332;
                                                                class123 var122 = new class123(var115);
                                                                int var123 = -1;
                                                                while (true) {
                                                                    int var124 = var122.method2427();
                                                                    if (var124 == 0) {
                                                                        continue label478;
                                                                    }
                                                                    var123 += var124;
                                                                    int var125 = 0;
                                                                    while (true) {
                                                                        int var126 = var122.method2427();
                                                                        if (var126 == 0) {
                                                                            break;
                                                                        }
                                                                        var125 += var126 - 1;
                                                                        int var127 = var125 & 0x3F;
                                                                        int var128 = var125 >> 6 & 0x3F;
                                                                        int var129 = var125 >> 12;
                                                                        int var130 = var122.method2398();
                                                                        int var131 = var130 >> 2;
                                                                        int var132 = var130 & 0x3;
                                                                        if (var109 == var129 && var128 >= var118 && var128 < var118 + 8 && var127 >= var119 && var127 < var119 + 8) {
                                                                            class43 var133 = class43.method96(var123);
                                                                            int var134 = var116 + class181.method2348(var128 & 0x7, var127 & 0x7, var110, var133.field977, var133.field981, var132);
                                                                            int var135 = var117 + class181.method3074(var128 & 0x7, var127 & 0x7, var110, var133.field977, var133.field981, var132);
                                                                            if (var134 > 0 && var135 > 0 && var134 < 103 && var135 < 103) {
                                                                                int var136 = var105;
                                                                                if ((class6.field79[1][var134][var135] & 0x2) == 2) {
                                                                                    var136 = var105 - 1;
                                                                                }
                                                                                class112 var137 = null;
                                                                                if (var136 >= 0) {
                                                                                    var137 = var121[var136];
                                                                                }
                                                                                class6.method2766(var105, var134, var135, var123, var110 + var132 & 0x3, var131, var120, var137);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var105++;
                                        }
                                    }
                                    method544();
                                    for (int var73 = 0; var73 < 13; var73++) {
                                        for (int var74 = 0; var74 < 13; var74++) {
                                            boolean var75 = false;
                                            int var76 = field334[var72][var73][var74];
                                            if (var76 != -1) {
                                                int var77 = var76 >> 24 & 0x3;
                                                int var78 = var76 >> 1 & 0x3;
                                                int var79 = var76 >> 14 & 0x3FF;
                                                int var80 = var76 >> 3 & 0x7FF;
                                                int var81 = (var79 / 8 << 8) + var80 / 8;
                                                for (int var82 = 0; var82 < Statics.field2055.length; var82++) {
                                                    if (Statics.field2055[var82] == var81 && Statics.field1467[var82] != null) {
                                                        byte[] var83 = Statics.field1467[var82];
                                                        int var84 = var73 * 8;
                                                        int var85 = var74 * 8;
                                                        int var86 = (var79 & 0x7) * 8;
                                                        int var87 = (var80 & 0x7) * 8;
                                                        class112[] var88 = field332;
                                                        for (int var89 = 0; var89 < 8; var89++) {
                                                            for (int var90 = 0; var90 < 8; var90++) {
                                                                if (var84 + var89 > 0 && var84 + var89 < 103 && var85 + var90 > 0 && var85 + var90 < 103) {
                                                                    var88[var72].field1955[var84 + var89][var85 + var90] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class123 var91 = new class123(var83);
                                                        for (int var92 = 0; var92 < 4; var92++) {
                                                            for (int var93 = 0; var93 < 64; var93++) {
                                                                for (int var94 = 0; var94 < 64; var94++) {
                                                                    if (var77 == var92 && var93 >= var86 && var93 < var86 + 8 && var94 >= var87 && var94 < var87 + 8) {
                                                                        class6.method3311(var91, var72, var84 + class181.method654(var93 & 0x7, var94 & 0x7, var78), var85 + class181.method3001(var93 & 0x7, var94 & 0x7, var78), 0, 0, var78);
                                                                    } else {
                                                                        class6.method3311(var91, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var75 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var75) {
                                                int var95 = var72;
                                                int var96 = var73 * 8;
                                                int var97 = var74 * 8;
                                                for (int var98 = 0; var98 < 8; var98++) {
                                                    for (int var99 = 0; var99 < 8; var99++) {
                                                        class6.field78[var95][var96 + var98][var97 + var99] = 0;
                                                    }
                                                }
                                                if (var96 > 0) {
                                                    for (int var100 = 1; var100 < 8; var100++) {
                                                        class6.field78[var95][var96][var97 + var100] = class6.field78[var95][var96 - 1][var97 + var100];
                                                    }
                                                }
                                                if (var97 > 0) {
                                                    for (int var101 = 1; var101 < 8; var101++) {
                                                        class6.field78[var95][var96 + var101][var97] = class6.field78[var95][var96 + var101][var97 - 1];
                                                    }
                                                }
                                                if (var96 > 0 && class6.field78[var95][var96 - 1][var97] != 0) {
                                                    class6.field78[var95][var96][var97] = class6.field78[var95][var96 - 1][var97];
                                                } else if (var97 > 0 && class6.field78[var95][var96][var97 - 1] != 0) {
                                                    class6.field78[var95][var96][var97] = class6.field78[var95][var96][var97 - 1];
                                                } else if (var96 > 0 && var97 > 0 && class6.field78[var95][var96 - 1][var97 - 1] != 0) {
                                                    class6.field78[var95][var96][var97] = class6.field78[var95][var96 - 1][var97 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var72++;
                                }
                            }
                            method2033(true);
                            method2119();
                            method544();
                            class6.method91(Statics.field92, field332);
                            method2033(true);
                            int var138 = class6.field88;
                            if (var138 > Statics.field1120) {
                                var138 = Statics.field1120;
                            }
                            if (var138 < Statics.field1120 - 1) {
                                int var139 = Statics.field1120 - 1;
                            }
                            if (field278) {
                                Statics.field92.method1870(class6.field88);
                            } else {
                                Statics.field92.method1870(0);
                            }
                            for (int var140 = 0; var140 < 104; var140++) {
                                for (int var141 = 0; var141 < 104; var141++) {
                                    method2836(var140, var141);
                                }
                            }
                            method544();
                            for (class17 var142 = (class17) field370.method3621(); var142 != null; var142 = (class17) field370.method3630()) {
                                if (var142.field222 == -1) {
                                    var142.field218 = 0;
                                    method888(var142);
                                } else {
                                    var142.method3729();
                                }
                            }
                            class43.field946.method3553();
                            if (Statics.field836 != null) {
                                field314.method2639(76);
                                field314.method2402(1057001181);
                            }
                            if (!field333) {
                                int var143 = (Statics.field150 - 6) / 8;
                                int var144 = (Statics.field150 + 6) / 8;
                                int var145 = (Statics.field804 - 6) / 8;
                                int var146 = (Statics.field804 + 6) / 8;
                                for (int var147 = var143 - 1; var147 <= var144 + 1; var147++) {
                                    for (int var148 = var145 - 1; var148 <= var146 + 1; var148++) {
                                        if (var147 < var143 || var147 > var144 || var148 < var145 || var148 > var146) {
                                            Statics.field2098.method3106("m" + var147 + "_" + var148);
                                            Statics.field2098.method3106("l" + var147 + "_" + var148);
                                        }
                                    }
                                }
                            }
                            method3191(30);
                            method544();
                            Statics.field81 = (byte[][][]) null;
                            Statics.field82 = (byte[][][]) null;
                            Statics.field2354 = (byte[][][]) null;
                            Statics.field2142 = (byte[][][]) null;
                            Statics.field763 = (int[][][]) null;
                            Statics.field1456 = (byte[][][]) null;
                            Statics.field2651 = (int[][]) null;
                            Statics.field3054 = null;
                            Statics.field261 = null;
                            Statics.field2053 = null;
                            Statics.field68 = null;
                            Statics.field2965 = null;
                            field314.method2639(120);
                            Statics.field1004.method2741();
                            for (int var149 = 0; var149 < 32; var149++) {
                                field2261[var149] = 0L;
                            }
                            for (int var150 = 0; var150 < 32; var150++) {
                                field2262[var150] = 0L;
                            }
                            Statics.field119 = 0;
                        } else {
                            field417 = 2;
                        }
                    } else {
                        field417 = 1;
                    }
                }
                if (field281 == 30) {
                    method95();
                } else if (field281 == 40 || field281 == 45) {
                    method19();
                }
                return;
            }
            var2.field2753.method3175(var2.field2755, (int) var2.field3168, var2.field2756, false);
        }
    }

    @ObfuscatedName("client.x(S)V")
    public final void method226() {
        boolean var1;
        label193: {
            try {
                if (class187.field3005 == 2) {
                    if (Statics.field153 == null) {
                        Statics.field153 = class184.method3345(Statics.field2090, Statics.field1835, Statics.field3010);
                        if (Statics.field153 == null) {
                            var1 = false;
                            break label193;
                        }
                    }
                    if (Statics.field2138 == null) {
                        Statics.field2138 = new class63(Statics.field3007, Statics.field3006);
                    }
                    if (Statics.field3008.method3457(Statics.field153, Statics.field3012, Statics.field2138, 22050)) {
                        Statics.field3008.method3433();
                        Statics.field3008.method3430(Statics.field904);
                        Statics.field3008.method3481(Statics.field153, Statics.field2112);
                        class187.field3005 = 0;
                        Statics.field153 = null;
                        Statics.field2138 = null;
                        Statics.field2090 = null;
                        var1 = true;
                        break label193;
                    }
                }
            } catch (Exception var22) {
                var22.printStackTrace();
                Statics.field3008.method3509();
                class187.field3005 = 0;
                Statics.field153 = null;
                Statics.field2138 = null;
                Statics.field2090 = null;
            }
            var1 = false;
        }
        if (var1 && field533 && Statics.field800 != null) {
            Statics.field800.method1265();
        }
        if (field281 == 10 || field281 == 20 || field281 == 30) {
            if (field484 != 0L && class119.method3544() > field484) {
                int var4 = field361 ? 2 : 1;
                field484 = 0L;
                if (var4 >= 2) {
                    field361 = true;
                } else {
                    field361 = false;
                }
                method172();
                if (field281 >= 25) {
                    method3270();
                }
                field2266 = true;
            } else if (field2259) {
                class141.method2030(Statics.field1966);
                Canvas var5 = Statics.field1966;
                var5.removeMouseListener(class144.field2213);
                var5.removeMouseMotionListener(class144.field2213);
                var5.removeFocusListener(class144.field2213);
                class144.field2210 = 0;
                if (Statics.field3172 != null) {
                    Statics.field3172.method2725(Statics.field1966);
                }
                Statics.field271.method2937();
                Statics.field1966.setBackground(Color.black);
                class141.method2029(Statics.field1966);
                class144.method5(Statics.field1966);
                if (Statics.field3172 != null) {
                    Statics.field3172.method2730(Statics.field1966);
                }
                if (field431 != -1) {
                    int var6 = field431;
                    int var7 = Statics.field175;
                    int var8 = Statics.field265;
                    if (class177.method2581(var6)) {
                        method89(Statics.field2815[var6], -1, var7, var8, false);
                    }
                }
                field2258 = true;
            }
        }
        Dimension var9 = this.method2904();
        if (Statics.field2093 != var9.width || Statics.field1963 != var9.height || field2258) {
            method172();
            field484 = class119.method3544() + 500L;
            field2258 = false;
        }
        boolean var10 = false;
        if (field2266) {
            field2266 = false;
            var10 = true;
            for (int var11 = 0; var11 < 100; var11++) {
                field461[var11] = true;
            }
        }
        if (var10) {
            method98();
        }
        if (field281 == 0) {
            class148.method2817(class34.field748, class34.field747, (Color) null, var10);
        } else if (field281 == 5) {
            class34.method2863(Statics.field26, Statics.field172, Statics.field202, var10);
        } else if (field281 == 10 || field281 == 11) {
            class34.method2863(Statics.field26, Statics.field172, Statics.field202, var10);
        } else if (field281 == 20) {
            class34.method2863(Statics.field26, Statics.field172, Statics.field202, var10);
        } else if (field281 == 25) {
            if (field417 == 1) {
                if (field326 > field327) {
                    field327 = field326;
                }
                int var12 = (field327 * 50 - field326 * 50) / field327;
                method166(class161.field2376 + class2.field21 + class2.field24 + var12 + "%" + class2.field23, false);
            } else if (field417 == 2) {
                if (field460 > field522) {
                    field522 = field460;
                }
                int var13 = (field522 * 50 - field460 * 50) / field522 + 50;
                method166(class161.field2376 + class2.field21 + class2.field24 + var13 + "%" + class2.field23, false);
            } else {
                method166(class161.field2376, false);
            }
        } else if (field281 == 30) {
            Statics.method1156();
        } else if (field281 == 40) {
            method166(class161.field2380 + class2.field21 + class161.field2610, false);
        } else if (field281 == 45) {
            method166(class161.field2496, false);
        }
        if (field281 == 30 && field483 == 0 && !var10) {
            try {
                Graphics var14 = Statics.field1966.getGraphics();
                for (int var15 = 0; var15 < field414; var15++) {
                    if (field477[var15]) {
                        Statics.field1455.method1599(var14, field479[var15], field480[var15], field360[var15], field496[var15]);
                        field477[var15] = false;
                    }
                }
            } catch (Exception var21) {
                Statics.field1966.repaint();
            }
        } else if (field281 > 0) {
            try {
                Graphics var17 = Statics.field1966.getGraphics();
                Statics.field1455.method1597(var17, 0, 0);
                for (int var18 = 0; var18 < field414; var18++) {
                    field477[var18] = false;
                }
            } catch (Exception var20) {
                Statics.field1966.repaint();
            }
        }
    }

    @ObfuscatedName("client.k(I)V")
    public final void method389() {
        if (Statics.field765.method196()) {
            Statics.field765.method193();
        }
        if (Statics.field1290 != null) {
            Statics.field1290.field187 = false;
        }
        Statics.field1290 = null;
        if (Statics.field830 != null) {
            Statics.field830.method2879();
            Statics.field830 = null;
        }
        if (class141.field2190 != null) {
            class141 var1 = class141.field2190;
            synchronized (class141.field2190) {
                class141.field2190 = null;
            }
        }
        if (class144.field2213 != null) {
            class144 var3 = class144.field2213;
            synchronized (class144.field2213) {
                class144.field2213 = null;
            }
        }
        Statics.field3172 = null;
        if (Statics.field800 != null) {
            Statics.field800.method1219();
        }
        if (Statics.field2355 != null) {
            Statics.field2355.method1219();
        }
        class175.method2213();
        Object var5 = class174.field2757;
        synchronized (class174.field2757) {
            if (class174.field2759 != 0) {
                class174.field2759 = 1;
                try {
                    class174.field2757.wait();
                } catch (InterruptedException var10) {
                }
            }
        }
        try {
            class153.field2291.method3957();
            for (int var8 = 0; var8 < Statics.field2295; var8++) {
                Statics.field1703[var8].method3957();
            }
            class153.field2290.method3957();
            class153.field2296.method3957();
        } catch (Exception var13) {
        }
    }

    @ObfuscatedName("fi.v(II)V")
    public static void method3191(int arg0) {
        if (field281 == arg0) {
            return;
        }
        if (field281 == 0) {
            Statics.field234 = null;
            Statics.field2265 = null;
            Statics.field125 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field305 = 0;
            field306 = 0;
            field421 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2938 != null) {
            Statics.field2938.method2879();
            Statics.field2938 = null;
        }
        if (field281 == 25) {
            field417 = 0;
            field326 = 0;
            field327 = 1;
            field460 = 0;
            field522 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class34.method352(Statics.field1966, Statics.field896, Statics.field994, true, 0);
        } else if (arg0 == 20) {
            class34.method352(Statics.field1966, Statics.field896, Statics.field994, true, field281 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class34.method352(Statics.field1966, Statics.field896, Statics.field994, false, 4);
        } else {
            class34.method547();
        }
        field281 = arg0;
    }

    @ObfuscatedName("client.h(I)V")
    public void method353() {
        if (field281 == 1000) {
            return;
        }
        long var1 = class119.method3544();
        int var3 = (int) (var1 - Statics.field3214);
        Statics.field3214 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class175.field2762 += var3;
        boolean var4;
        if (class175.field2771 == 0 && class175.field2766 == 0 && class175.field2769 == 0 && class175.field2764 == 0) {
            var4 = true;
        } else if (Statics.field2767 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class175.field2762 > 30000) {
                        throw new IOException();
                    }
                    while (class175.field2766 < 20 && class175.field2764 > 0) {
                        class176 var5 = (class176) class175.field2763.method3586();
                        class123 var6 = new class123(4);
                        var6.method2399(1);
                        var6.method2401((int) var5.field3168);
                        Statics.field2767.method2874(var6.field2048, 0, 4);
                        class175.field2779.method3588(var5, var5.field3168);
                        class175.field2764--;
                        class175.field2766++;
                    }
                    while (class175.field2771 < 20 && class175.field2769 > 0) {
                        class176 var7 = (class176) class175.field2765.method3683();
                        class123 var8 = new class123(4);
                        var8.method2399(0);
                        var8.method2401((int) var7.field3168);
                        Statics.field2767.method2874(var8.field2048, 0, 4);
                        var7.method3699();
                        class175.field2761.method3588(var7, var7.field3168);
                        class175.field2769--;
                        class175.field2771++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2767.method2873();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class175.field2762 = 0;
                        byte var11 = 0;
                        if (Statics.field2772 == null) {
                            var11 = 8;
                        } else if (class175.field2776 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class175.field2773.field2046;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2767.method2890(class175.field2773.field2048, class175.field2773.field2046, var12);
                            if (class175.field2777 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class175.field2773.field2048[class175.field2773.field2046 + var13] ^= class175.field2777;
                                }
                            }
                            class175.field2773.field2046 += var12;
                            if (class175.field2773.field2046 < var11) {
                                break;
                            }
                            if (Statics.field2772 == null) {
                                class175.field2773.field2046 = 0;
                                int var14 = class175.field2773.method2398();
                                int var15 = class175.field2773.method2548();
                                int var16 = class175.field2773.method2398();
                                int var17 = class175.field2773.method2419();
                                long var18 = (long) ((var14 << 16) + var15);
                                class176 var20 = (class176) class175.field2779.method3595(var18);
                                Statics.field1428 = true;
                                if (var20 == null) {
                                    var20 = (class176) class175.field2761.method3595(var18);
                                    Statics.field1428 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2772 = var20;
                                Statics.field2021 = new class123(var17 + var21 + Statics.field2772.field2782);
                                Statics.field2021.method2399(var16);
                                Statics.field2021.method2402(var17);
                                class175.field2776 = 8;
                                class175.field2773.field2046 = 0;
                            } else if (class175.field2776 == 0) {
                                if (class175.field2773.field2048[0] == -1) {
                                    class175.field2776 = 1;
                                    class175.field2773.field2046 = 0;
                                } else {
                                    Statics.field2772 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2021.field2048.length - Statics.field2772.field2782;
                            int var23 = 512 - class175.field2776;
                            if (var23 > var22 - Statics.field2021.field2046) {
                                var23 = var22 - Statics.field2021.field2046;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2767.method2890(Statics.field2021.field2048, Statics.field2021.field2046, var23);
                            if (class175.field2777 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2021.field2048[Statics.field2021.field2046 + var24] ^= class175.field2777;
                                }
                            }
                            Statics.field2021.field2046 += var23;
                            class175.field2776 += var23;
                            if (Statics.field2021.field2046 == var22) {
                                if (Statics.field2772.field3168 == 16711935L) {
                                    Statics.field2717 = Statics.field2021;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class172 var26 = class175.field2770[var25];
                                        if (var26 != null) {
                                            Statics.field2717.field2046 = var25 * 8 + 5;
                                            int var27 = Statics.field2717.method2419();
                                            int var28 = Statics.field2717.method2419();
                                            var26.method3173(var27, var28);
                                        }
                                    }
                                } else {
                                    class175.field2775.reset();
                                    class175.field2775.update(Statics.field2021.field2048, 0, var22);
                                    int var29 = (int) class175.field2775.getValue();
                                    if (Statics.field2772.field2783 != var29) {
                                        try {
                                            Statics.field2767.method2879();
                                        } catch (Exception var35) {
                                        }
                                        class175.field2778++;
                                        Statics.field2767 = null;
                                        class175.field2777 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class175.field2778 = 0;
                                    class175.field2768 = 0;
                                    Statics.field2772.field2785.method3168((int) (Statics.field2772.field3168 & 0xFFFFL), Statics.field2021.field2048, (Statics.field2772.field3168 & 0xFF0000L) == 16711680L, Statics.field1428);
                                }
                                Statics.field2772.method3729();
                                if (Statics.field1428) {
                                    class175.field2766--;
                                } else {
                                    class175.field2771--;
                                }
                                class175.field2776 = 0;
                                Statics.field2772 = null;
                                Statics.field2021 = null;
                            } else {
                                if (class175.field2776 != 512) {
                                    break;
                                }
                                class175.field2776 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2767.method2879();
                } catch (Exception var34) {
                }
                class175.field2768++;
                Statics.field2767 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method229();
        }
    }

    @ObfuscatedName("client.u(B)V")
    public void method229() {
        if (class175.field2778 >= 4) {
            this.method2902("js5crc");
            field281 = 1000;
            return;
        }
        if (class175.field2768 >= 4) {
            if (field281 <= 5) {
                this.method2902("js5io");
                field281 = 1000;
                return;
            }
            field303 = 3000;
            class175.field2768 = 3;
        }
        if (--field303 + 1 > 0) {
            return;
        }
        try {
            if (field302 == 0) {
                Statics.field1068 = Statics.field901.method2771(Statics.field2061, Statics.field992);
                field302++;
            }
            if (field302 == 1) {
                if (Statics.field1068.field2279 == 2) {
                    this.method429(-1);
                    return;
                }
                if (Statics.field1068.field2279 == 1) {
                    field302++;
                }
            }
            if (field302 == 2) {
                Statics.field1022 = new class147((Socket) Statics.field1068.field2283, Statics.field901);
                class123 var1 = new class123(5);
                var1.method2399(15);
                var1.method2402(119);
                Statics.field1022.method2874(var1.field2048, 0, 5);
                field302++;
                Statics.field3171 = class119.method3544();
            }
            if (field302 == 3) {
                if (field281 <= 5 || Statics.field1022.method2873() > 0) {
                    int var2 = Statics.field1022.method2871();
                    if (var2 != 0) {
                        this.method429(var2);
                        return;
                    }
                    field302++;
                } else if (class119.method3544() - Statics.field3171 > 30000L) {
                    this.method429(-2);
                    return;
                }
            }
            if (field302 == 4) {
                class175.method3004(Statics.field1022, field281 > 20);
                Statics.field1068 = null;
                Statics.field1022 = null;
                field302 = 0;
                field304 = 0;
            }
        } catch (IOException var4) {
            this.method429(-3);
        }
    }

    @ObfuscatedName("client.y(IS)V")
    public void method429(int arg0) {
        Statics.field1068 = null;
        Statics.field1022 = null;
        field302 = 0;
        if (Statics.field992 == Statics.field2020) {
            Statics.field992 = Statics.field7;
        } else {
            Statics.field992 = Statics.field2020;
        }
        field304++;
        if (field304 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field281 <= 5) {
                this.method2902("js5connect_full");
                field281 = 1000;
            } else {
                field303 = 3000;
            }
        } else if (field304 >= 2 && arg0 == 6) {
            this.method2902("js5connect_outofdate");
            field281 = 1000;
        } else if (field304 >= 4) {
            if (field281 <= 5) {
                this.method2902("js5connect");
                field281 = 1000;
            } else {
                field303 = 3000;
            }
        }
    }

    @ObfuscatedName("i.p(I)V")
    public static void method175() {
        if (field510 == 0) {
            Statics.field92 = new class90(4, 104, 104, class6.field78);
            for (int var0 = 0; var0 < 4; var0++) {
                field332[var0] = new class112(104, 104);
            }
            Statics.field562 = new class82(512, 512);
            class34.field747 = class161.field2382;
            class34.field748 = 5;
            field510 = 20;
        } else if (field510 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class95.field1661[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class90.method1903(var1, 500, 800, 512, 334);
            class34.field747 = class161.field2383;
            class34.field748 = 10;
            field510 = 30;
        } else if (field510 == 30) {
            Statics.field585 = method168(0, false, true, true);
            Statics.field3200 = method168(1, false, true, true);
            Statics.field1232 = method168(2, true, false, true);
            Statics.field1116 = method168(3, false, true, true);
            Statics.field2084 = method168(4, false, true, true);
            Statics.field2098 = method168(5, true, true, true);
            Statics.field815 = method168(6, true, true, false);
            Statics.field2986 = method168(7, false, true, true);
            Statics.field994 = method168(8, false, true, true);
            Statics.field2346 = method168(9, false, true, true);
            Statics.field896 = method168(10, false, true, true);
            Statics.field2156 = method168(11, false, true, true);
            Statics.field2968 = method168(12, false, true, true);
            Statics.field1532 = method168(13, true, false, true);
            Statics.field900 = method168(14, false, true, false);
            Statics.field560 = method168(15, false, true, true);
            class34.field747 = class161.field2384;
            class34.field748 = 20;
            field510 = 40;
        } else if (field510 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field585.method3165() * 4 / 100;
            int var8 = var7 + Statics.field3200.method3165() * 4 / 100;
            int var9 = var8 + Statics.field1232.method3165() * 2 / 100;
            int var10 = var9 + Statics.field1116.method3165() * 2 / 100;
            int var11 = var10 + Statics.field2084.method3165() * 6 / 100;
            int var12 = var11 + Statics.field2098.method3165() * 4 / 100;
            int var13 = var12 + Statics.field815.method3165() * 2 / 100;
            int var14 = var13 + Statics.field2986.method3165() * 60 / 100;
            int var15 = var14 + Statics.field994.method3165() * 2 / 100;
            int var16 = var15 + Statics.field2346.method3165() * 2 / 100;
            int var17 = var16 + Statics.field896.method3165() * 2 / 100;
            int var18 = var17 + Statics.field2156.method3165() * 2 / 100;
            int var19 = var18 + Statics.field2968.method3165() * 2 / 100;
            int var20 = var19 + Statics.field1532.method3165() * 2 / 100;
            int var21 = var20 + Statics.field900.method3165() * 2 / 100;
            int var22 = var21 + Statics.field560.method3165() * 2 / 100;
            if (var22 == 100) {
                class34.field747 = class161.field2386;
                class34.field748 = 30;
                field510 = 45;
            } else {
                if (var22 != 0) {
                    class34.field747 = class161.field2448 + var22 + "%";
                }
                class34.field748 = 30;
            }
        } else if (field510 == 45) {
            boolean var23 = !field278;
            Statics.field1269 = 22050;
            Statics.field1248 = var23;
            Statics.field1263 = 2;
            class188 var24 = new class188();
            var24.method3524(9, 128);
            Statics.field800 = class60.method589(Statics.field901, Statics.field1966, 0, 22050);
            Statics.field800.method1215(var24);
            class172 var25 = Statics.field560;
            class172 var26 = Statics.field900;
            class172 var27 = Statics.field2084;
            Statics.field3012 = var25;
            Statics.field3006 = var26;
            Statics.field3007 = var27;
            Statics.field3008 = var24;
            Statics.field2355 = class60.method589(Statics.field901, Statics.field1966, 1, 2048);
            Statics.field255 = new class59();
            Statics.field2355.method1215(Statics.field255);
            Statics.field719 = new class78(22050, Statics.field1269);
            class34.field747 = class161.field2421;
            class34.field748 = 35;
            field510 = 50;
        } else if (field510 == 50) {
            int var28 = 0;
            if (Statics.field172 == null) {
                Statics.field172 = class80.method111(Statics.field994, Statics.field1532, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field202 == null) {
                Statics.field202 = class80.method111(Statics.field994, Statics.field1532, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field26 == null) {
                Statics.field26 = class80.method111(Statics.field994, Statics.field1532, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class34.field747 = class161.field2595 + var28 * 100 / 3 + "%";
                class34.field748 = 40;
            } else {
                Statics.field578 = new class164(true);
                class34.field747 = class161.field2389;
                class34.field748 = 40;
                field510 = 60;
            }
        } else if (field510 == 60) {
            class172 var29 = Statics.field896;
            class172 var30 = Statics.field994;
            int var31 = 0;
            if (var29.method3104("title.jpg", "")) {
                var31++;
            }
            if (var30.method3104("logo", "")) {
                var31++;
            }
            if (var30.method3104("logo_deadman_mode", "")) {
                var31++;
            }
            if (var30.method3104("titlebox", "")) {
                var31++;
            }
            if (var30.method3104("titlebutton", "")) {
                var31++;
            }
            if (var30.method3104("runes", "")) {
                var31++;
            }
            if (var30.method3104("title_mute", "")) {
                var31++;
            }
            if (var30.method3127("options_radio_buttons,0")) {
                var31++;
            }
            if (var30.method3127("options_radio_buttons,2")) {
                var31++;
            }
            var30.method3104("sl_back", "");
            var30.method3104("sl_flags", "");
            var30.method3104("sl_arrows", "");
            var30.method3104("sl_stars", "");
            var30.method3104("sl_button", "");
            int var34 = class34.method739();
            if (var31 < var34) {
                class34.field747 = class161.field2584 + var31 * 100 / var34 + "%";
                class34.field748 = 50;
            } else {
                class34.field747 = class161.field2391;
                class34.field748 = 50;
                method3191(5);
                field510 = 70;
            }
        } else if (field510 == 70) {
            if (Statics.field1232.method3090()) {
                class49.method753(Statics.field1232);
                class44.method983(Statics.field1232);
                class172 var35 = Statics.field1232;
                class172 var36 = Statics.field2986;
                Statics.field1050 = var35;
                Statics.field2723 = var36;
                Statics.field1059 = Statics.field1050.method3099(3);
                class43.method1867(Statics.field1232, Statics.field2986, field278);
                class172 var37 = Statics.field1232;
                class172 var38 = Statics.field2986;
                Statics.field929 = var37;
                Statics.field905 = var38;
                class172 var39 = Statics.field1232;
                class172 var40 = Statics.field2986;
                boolean var41 = field277;
                class228 var42 = Statics.field172;
                Statics.field1231 = var39;
                Statics.field2119 = var40;
                Statics.field1176 = var41;
                Statics.field3262 = Statics.field1231.method3099(10);
                Statics.field1474 = var42;
                class45.method1157(Statics.field1232, Statics.field585, Statics.field3200);
                class46.method2768(Statics.field1232, Statics.field2986);
                class172 var43 = Statics.field1232;
                Statics.field1109 = var43;
                class57.method733(Statics.field1232);
                class172 var44 = Statics.field1116;
                class172 var45 = Statics.field2986;
                class172 var46 = Statics.field994;
                class172 var47 = Statics.field1532;
                Statics.field2890 = var44;
                Statics.field2789 = var45;
                Statics.field2368 = var46;
                Statics.field629 = var47;
                Statics.field2815 = new class177[Statics.field2890.method3088()][];
                Statics.field3210 = new boolean[Statics.field2890.method3088()];
                class172 var48 = Statics.field1232;
                Statics.field1171 = var48;
                class53.method690(Statics.field1232);
                class172 var49 = Statics.field1232;
                Statics.field1069 = var49;
                class54.method1057(Statics.field1232);
                Statics.field765 = new class20();
                class172 var50 = Statics.field1232;
                class172 var51 = Statics.field994;
                class172 var52 = Statics.field1532;
                Statics.field1138 = var50;
                Statics.field1126 = var51;
                Statics.field1121 = var52;
                class50.method148(Statics.field1232, Statics.field994);
                class34.field747 = class161.field2393;
                class34.field748 = 60;
                field510 = 80;
            } else {
                class34.field747 = class161.field2392 + Statics.field1232.method3171() + "%";
                class34.field748 = 60;
            }
        } else if (field510 == 80) {
            int var53 = 0;
            if (Statics.field3216 == null) {
                Statics.field3216 = class80.method638(Statics.field994, "compass", "");
            } else {
                var53++;
            }
            if (Statics.field1429 == null) {
                Statics.field1429 = class80.method638(Statics.field994, "mapedge", "");
            } else {
                var53++;
            }
            if (Statics.field2311 == null) {
                Statics.field2311 = class80.method117(Statics.field994, "mapscene", "");
            } else {
                var53++;
            }
            if (Statics.field609 == null) {
                Statics.field609 = class80.method1302(Statics.field994, "mapfunction", "");
            } else {
                var53++;
            }
            if (Statics.field188 == null) {
                Statics.field188 = class80.method1302(Statics.field994, "headicons_pk", "");
            } else {
                var53++;
            }
            if (Statics.field349 == null) {
                Statics.field349 = class80.method1302(Statics.field994, "headicons_prayer", "");
            } else {
                var53++;
            }
            if (Statics.field1166 == null) {
                Statics.field1166 = class80.method1302(Statics.field994, "headicons_hint", "");
            } else {
                var53++;
            }
            if (Statics.field132 == null) {
                Statics.field132 = class80.method1302(Statics.field994, "mapmarker", "");
            } else {
                var53++;
            }
            if (Statics.field162 == null) {
                Statics.field162 = class80.method1302(Statics.field994, "cross", "");
            } else {
                var53++;
            }
            if (Statics.field590 == null) {
                Statics.field590 = class80.method1302(Statics.field994, "mapdots", "");
            } else {
                var53++;
            }
            if (Statics.field2935 == null) {
                Statics.field2935 = class80.method117(Statics.field994, "scrollbar", "");
            } else {
                var53++;
            }
            if (Statics.field380 == null) {
                Statics.field380 = class80.method117(Statics.field994, "mod_icons", "");
            } else {
                var53++;
            }
            if (var53 < 12) {
                class34.field747 = class161.field2394 + var53 * 100 / 12 + "%";
                class34.field748 = 70;
            } else {
                Statics.field3237 = Statics.field380;
                Statics.field1429.method1684();
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 41.0D) - 20;
                for (int var58 = 0; var58 < Statics.field609.length; var58++) {
                    Statics.field609[var58].method1754(var54 + var57, var55 + var57, var56 + var57);
                }
                Statics.field2311[0].method1837(var54 + var57, var55 + var57, var56 + var57);
                class34.field747 = class161.field2395;
                class34.field748 = 70;
                field510 = 90;
            }
        } else if (field510 == 90) {
            if (Statics.field2346.method3090()) {
                class99 var59 = new class99(Statics.field2346, Statics.field994, 20, 0.8D, field278 ? 64 : 128);
                class95.method2072(var59);
                class95.method2037(0.8D);
                class34.field747 = class161.field2397;
                class34.field748 = 90;
                field510 = 110;
            } else {
                class34.field747 = class161.field2513 + Statics.field2346.method3171() + "%";
                class34.field748 = 90;
            }
        } else if (field510 == 110) {
            Statics.field1290 = new class14();
            Statics.field901.method2772(Statics.field1290, 10);
            class34.field747 = class161.field2398;
            class34.field748 = 94;
            field510 = 120;
        } else if (field510 == 120) {
            if (Statics.field896.method3104("huffman", "")) {
                class117 var60 = new class117(Statics.field896.method3116("huffman", ""));
                class226.method2987(var60);
                class34.field747 = class161.field2437;
                class34.field748 = 96;
                field510 = 130;
            } else {
                class34.field747 = class161.field2614 + "%";
                class34.field748 = 96;
            }
        } else if (field510 == 130) {
            if (!Statics.field1116.method3090()) {
                class34.field747 = class161.field2631 + Statics.field1116.method3171() * 4 / 5 + "%";
                class34.field748 = 100;
            } else if (!Statics.field2968.method3090()) {
                class34.field747 = class161.field2631 + (80 + Statics.field2968.method3171() / 6) + "%";
                class34.field748 = 100;
            } else if (Statics.field1532.method3090()) {
                class34.field747 = class161.field2402;
                class34.field748 = 100;
                field510 = 140;
            } else {
                class34.field747 = class161.field2631 + (96 + Statics.field1532.method3171() / 20) + "%";
                class34.field748 = 100;
            }
        } else if (field510 == 140) {
            method3191(10);
        }
    }

    @ObfuscatedName("s.s(IZZZB)Lfi;")
    public static class172 method168(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class138 var4 = null;
        if (class153.field2291 != null) {
            var4 = new class138(arg0, class153.field2291, Statics.field1703[arg0], 1000000);
        }
        return new class172(var4, Statics.field3197, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("e.f(I)V")
    public static final void method19() {
        try {
            if (field305 == 0) {
                if (Statics.field830 != null) {
                    Statics.field830.method2879();
                    Statics.field830 = null;
                }
                Statics.field2051 = null;
                field325 = false;
                field306 = 0;
                field305 = 1;
            }
            if (field305 == 1) {
                if (Statics.field2051 == null) {
                    Statics.field2051 = Statics.field901.method2771(Statics.field2061, Statics.field992);
                }
                if (Statics.field2051.field2279 == 2) {
                    throw new IOException();
                }
                if (Statics.field2051.field2279 == 1) {
                    Statics.field830 = new class147((Socket) Statics.field2051.field2283, Statics.field901);
                    Statics.field2051 = null;
                    field305 = 2;
                }
            }
            if (field305 == 2) {
                field314.field2046 = 0;
                field314.method2399(14);
                Statics.field830.method2874(field314.field2048, 0, 1);
                field316.field2046 = 0;
                field305 = 3;
            }
            if (field305 == 3) {
                if (Statics.field800 != null) {
                    Statics.field800.method1227();
                }
                if (Statics.field2355 != null) {
                    Statics.field2355.method1227();
                }
                int var0 = Statics.field830.method2871();
                if (Statics.field800 != null) {
                    Statics.field800.method1227();
                }
                if (Statics.field2355 != null) {
                    Statics.field2355.method1227();
                }
                if (var0 != 0) {
                    method650(var0);
                    return;
                }
                field316.field2046 = 0;
                field305 = 5;
            }
            if (field305 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field314.field2046 = 0;
                field314.method2399(1);
                field314.method2399(class34.field754.method549());
                field314.method2402(var1[0]);
                field314.method2402(var1[1]);
                field314.method2402(var1[2]);
                field314.method2402(var1[3]);
                switch(class34.field754.field2661) {
                    case 0:
                        field314.method2402((Integer) Statics.field163.field127.get(class167.method2711(class34.field759)));
                        field314.field2046 += 4;
                        break;
                    case 1:
                    case 3:
                        field314.method2401(Statics.field233);
                        field314.field2046 += 5;
                        break;
                    case 2:
                        field314.field2046 += 8;
                }
                field314.method2405(class34.field736);
                field314.method2515(class5.field77, class5.field76);
                field315.field2046 = 0;
                if (field281 == 40) {
                    field315.method2399(18);
                } else {
                    field315.method2399(16);
                }
                field315.method2400(0);
                int var2 = field315.field2046;
                field315.method2402(119);
                field315.method2584(field314.field2048, 0, field314.field2046);
                int var3 = field315.field2046;
                field315.method2405(class34.field759);
                field315.method2399((field361 ? 1 : 0) << 1 | (field278 ? 1 : 0));
                field315.method2400(Statics.field175);
                field315.method2400(Statics.field265);
                class153.method2704(field315);
                field315.method2405(Statics.field1840);
                field315.method2402(Statics.field797);
                class123 var4 = new class123(Statics.field578.method3007());
                Statics.field578.method3008(var4);
                field315.method2584(var4.field2048, 0, var4.field2048.length);
                field315.method2399(Statics.field2238);
                field315.method2402(Statics.field585.field2737);
                field315.method2402(Statics.field3200.field2737);
                field315.method2402(Statics.field1232.field2737);
                field315.method2402(Statics.field1116.field2737);
                field315.method2402(Statics.field2084.field2737);
                field315.method2402(Statics.field2098.field2737);
                field315.method2402(Statics.field815.field2737);
                field315.method2402(Statics.field2986.field2737);
                field315.method2402(Statics.field994.field2737);
                field315.method2402(Statics.field2346.field2737);
                field315.method2402(Statics.field896.field2737);
                field315.method2402(Statics.field2156.field2737);
                field315.method2402(Statics.field2968.field2737);
                field315.method2402(Statics.field1532.field2737);
                field315.method2402(Statics.field900.field2737);
                field315.method2402(Statics.field560.field2737);
                field315.method2432(var1, var3, field315.field2046);
                field315.method2410(field315.field2046 - var2);
                Statics.field830.method2874(field315.field2048, 0, field315.field2046);
                field314.method2638(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field316.method2638(var1);
                field305 = 6;
            }
            if (field305 == 6 && Statics.field830.method2873() > 0) {
                int var6 = Statics.field830.method2871();
                if (var6 == 21 && field281 == 20) {
                    field305 = 7;
                } else if (var6 == 2) {
                    field305 = 9;
                } else if (var6 == 15 && field281 == 40) {
                    field284 = -1;
                    field305 = 13;
                } else if (var6 == 23 && field421 < 1) {
                    field421++;
                    field305 = 0;
                } else if (var6 == 29) {
                    field305 = 11;
                } else {
                    method650(var6);
                    return;
                }
            }
            if (field305 == 7 && Statics.field830.method2873() > 0) {
                field308 = (Statics.field830.method2871() + 3) * 60;
                field305 = 8;
            }
            if (field305 == 8) {
                field306 = 0;
                class34.method2678(class161.field2406, class161.field2473, field308 / 60 + class161.field2408);
                if (--field308 <= 0) {
                    field305 = 0;
                }
            } else {
                if (field305 == 9 && Statics.field830.method2873() >= 13) {
                    boolean var7 = Statics.field830.method2871() == 1;
                    Statics.field830.method2890(field316.field2048, 0, 4);
                    field316.field2046 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field316.method2647() << 24;
                        int var10 = var9 | field316.method2647() << 16;
                        int var11 = var10 | field316.method2647() << 8;
                        int var12 = var11 | field316.method2647();
                        int var13 = class167.method2711(class34.field759);
                        if (Statics.field163.field127.size() >= 10 && !Statics.field163.field127.containsKey(var13)) {
                            Iterator var14 = Statics.field163.field127.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field163.field127.put(var13, var12);
                        class9.method660();
                    }
                    field410 = Statics.field830.method2871();
                    field440 = Statics.field830.method2871() == 1;
                    field552 = Statics.field830.method2871();
                    field552 <<= 0x8;
                    field552 += Statics.field830.method2871();
                    field550 = Statics.field830.method2871();
                    Statics.field830.method2890(field316.field2048, 0, 1);
                    field316.field2046 = 0;
                    field318 = field316.method2647();
                    Statics.field830.method2890(field316.field2048, 0, 2);
                    field316.field2046 = 0;
                    field284 = field316.method2548();
                    try {
                        client var15 = Statics.field271;
                        JSObject.getWindow(var15).call("zap", (Object[]) null);
                    } catch (Throwable var22) {
                    }
                    field305 = 10;
                }
                if (field305 != 10) {
                    if (field305 == 11 && Statics.field830.method2873() >= 2) {
                        field316.field2046 = 0;
                        Statics.field830.method2890(field316.field2048, 0, 2);
                        field316.field2046 = 0;
                        Statics.field554 = field316.method2548();
                        field305 = 12;
                    }
                    if (field305 == 12 && Statics.field830.method2873() >= Statics.field554) {
                        field316.field2046 = 0;
                        Statics.field830.method2890(field316.field2048, 0, Statics.field554);
                        field316.field2046 = 0;
                        String var17 = field316.method2422();
                        String var18 = field316.method2422();
                        String var19 = field316.method2422();
                        class34.method2678(var17, var18, var19);
                        method3191(10);
                    }
                    if (field305 == 13) {
                        if (field284 == -1) {
                            if (Statics.field830.method2873() < 2) {
                                return;
                            }
                            Statics.field830.method2890(field316.field2048, 0, 2);
                            field316.field2046 = 0;
                            field284 = field316.method2548();
                        }
                        if (Statics.field830.method2873() >= field284) {
                            Statics.field830.method2890(field316.field2048, 0, field284);
                            field316.field2046 = 0;
                            int var20 = field284;
                            method981();
                            class35.method2332(field316);
                            if (field316.field2046 != var20) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field306++;
                        if (field306 > 2000) {
                            if (field421 < 1) {
                                if (Statics.field992 == Statics.field2020) {
                                    Statics.field992 = Statics.field7;
                                } else {
                                    Statics.field992 = Statics.field2020;
                                }
                                field421++;
                                field305 = 0;
                            } else {
                                method650(-3);
                            }
                        }
                    }
                } else if (Statics.field830.method2873() >= field284) {
                    field316.field2046 = 0;
                    Statics.field830.method2890(field316.field2048, 0, field284);
                    method2295();
                    class35.method2332(field316);
                    Statics.field150 = -1;
                    method979(false);
                    field318 = -1;
                }
            }
        } catch (IOException var23) {
            if (field421 < 1) {
                if (Statics.field992 == Statics.field2020) {
                    Statics.field992 = Statics.field7;
                } else {
                    Statics.field992 = Statics.field2020;
                }
                field421++;
                field305 = 0;
            } else {
                method650(-2);
            }
        }
    }

    @ObfuscatedName("de.i(I)V")
    public static void method2295() {
        field540 = 1L;
        field287 = -1;
        Statics.field1290.field186 = 0;
        Statics.field2071 = true;
        field288 = true;
        field497 = -1L;
        class215.method793();
        field314.field2046 = 0;
        field316.field2046 = 0;
        field318 = -1;
        field321 = -1;
        field322 = -1;
        field291 = -1;
        field319 = 0;
        field290 = 0;
        field324 = 0;
        field419 = 0;
        field413 = 0;
        field518 = false;
        class144.field2222 = 0;
        class12.method87();
        field532 = 0;
        field445 = false;
        field275 = 0;
        field342 = (int) (Math.random() * 100.0D) - 50;
        field338 = (int) (Math.random() * 110.0D) - 55;
        field340 = (int) (Math.random() * 80.0D) - 40;
        field343 = (int) (Math.random() * 120.0D) - 60;
        field485 = (int) (Math.random() * 30.0D) - 20;
        field358 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field507 = 0;
        field411 = -1;
        field505 = 0;
        field465 = 0;
        field299 = class22.field582;
        field356 = class22.field582;
        field395 = 0;
        class35.field778 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class35.field776[var0] = null;
            class35.field774[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field394[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field309[var2] = null;
        }
        field345 = -1;
        field406.method3632();
        field407.method3632();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field404[var3][var4][var5] = null;
                }
            }
        }
        field370 = new class203();
        field539 = 0;
        field538 = 0;
        field544 = 0;
        for (int var6 = 0; var6 < Statics.field1240; var6++) {
            class57 var7 = class57.method42(var6);
            if (var7 != null) {
                class180.field2951[var6] = 0;
                class180.field2950[var6] = 0;
            }
        }
        Statics.field765.method191();
        field464 = -1;
        if (field431 != -1) {
            int var8 = field431;
            if (var8 != -1 && Statics.field3210[var8]) {
                Statics.field2890.method3083(var8);
                if (Statics.field2815[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field2815[var8].length; var10++) {
                        if (Statics.field2815[var8][var10] != null) {
                            if (Statics.field2815[var8][var10].field2930 == 2) {
                                var9 = false;
                            } else {
                                Statics.field2815[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field2815[var8] = null;
                    }
                    Statics.field3210[var8] = false;
                }
            }
        }
        for (class4 var11 = (class4) field536.method3586(); var11 != null; var11 = (class4) field536.method3591()) {
            method2837(var11, true);
        }
        field431 = -1;
        field536 = new class200(8);
        field403 = null;
        field518 = false;
        field413 = 0;
        field517.method3313((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field400[var12] = null;
            field401[var12] = false;
        }
        class16.method41();
        field282 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field461[var13] = true;
        }
        method3270();
        field498 = null;
        Statics.field2301 = 0;
        Statics.field237 = null;
        for (int var14 = 0; var14 < 8; var14++) {
            field547[var14] = new class224();
        }
        Statics.field2126 = null;
    }

    @ObfuscatedName("ag.d(S)V")
    public static void method981() {
        field314.field2046 = 0;
        field316.field2046 = 0;
        field318 = -1;
        field321 = -1;
        field322 = -1;
        field291 = -1;
        field284 = 0;
        field319 = 0;
        field290 = 0;
        field413 = 0;
        field518 = false;
        field507 = 0;
        field505 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field394[var0] = null;
        }
        Statics.field2011 = null;
        for (int var1 = 0; var1 < field309.length; var1++) {
            class37 var2 = field309[var1];
            if (var2 != null) {
                var2.field857 = -1;
                var2.field858 = false;
            }
        }
        class16.method41();
        method3191(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field461[var3] = true;
        }
        method3270();
    }

    @ObfuscatedName("ab.t(II)V")
    public static void method650(int arg0) {
        if (arg0 == -3) {
            class34.method2678(class161.field2409, class161.field2515, class161.field2411);
        } else if (arg0 == -2) {
            class34.method2678(class161.field2412, class161.field2413, class161.field2414);
        } else if (arg0 == -1) {
            class34.method2678(class161.field2579, class161.field2616, class161.field2559);
        } else if (arg0 == 3) {
            class34.field760 = 3;
        } else if (arg0 == 4) {
            class34.method2678(class161.field2418, class161.field2419, class161.field2420);
        } else if (arg0 == 5) {
            class34.method2678(class161.field2585, class161.field2519, class161.field2451);
        } else if (arg0 == 6) {
            class34.method2678(class161.field2423, class161.field2425, class161.field2516);
        } else if (arg0 == 7) {
            class34.method2678(class161.field2427, class161.field2603, class161.field2429);
        } else if (arg0 == 8) {
            class34.method2678(class161.field2430, class161.field2431, class161.field2432);
        } else if (arg0 == 9) {
            class34.method2678(class161.field2433, class161.field2381, class161.field2435);
        } else if (arg0 == 10) {
            class34.method2678(class161.field2436, class161.field2434, class161.field2375);
        } else if (arg0 == 11) {
            class34.method2678(class161.field2481, class161.field2422, class161.field2441);
        } else if (arg0 == 12) {
            class34.method2678(class161.field2589, class161.field2407, class161.field2554);
        } else if (arg0 == 13) {
            class34.method2678(class161.field2593, class161.field2446, class161.field2447);
        } else if (arg0 == 14) {
            class34.method2678(class161.field2442, class161.field2449, class161.field2450);
        } else if (arg0 == 16) {
            class34.method2678(class161.field2571, class161.field2452, class161.field2525);
        } else if (arg0 == 17) {
            class34.method2678(class161.field2454, class161.field2455, class161.field2641);
        } else if (arg0 == 18) {
            class34.method2678(class161.field2457, class161.field2458, class161.field2459);
        } else if (arg0 == 19) {
            class34.method2678(class161.field2460, class161.field2628, class161.field2462);
        } else if (arg0 == 20) {
            class34.method2678(class161.field2463, class161.field2464, class161.field2465);
        } else if (arg0 == 22) {
            class34.method2678(class161.field2466, class161.field2467, class161.field2470);
        } else if (arg0 == 23) {
            class34.method2678(class161.field2469, class161.field2648, class161.field2471);
        } else if (arg0 == 24) {
            class34.method2678(class161.field2472, class161.field2415, class161.field2474);
        } else if (arg0 == 25) {
            class34.method2678(class161.field2410, class161.field2388, class161.field2477);
        } else if (arg0 == 26) {
            class34.method2678(class161.field2461, class161.field2379, class161.field2480);
        } else if (arg0 == 27) {
            class34.method2678(class161.field2574, class161.field2482, class161.field2483);
        } else if (arg0 == 31) {
            class34.method2678(class161.field2369, class161.field2491, class161.field2492);
        } else if (arg0 == 32) {
            class34.method2678(class161.field2493, class161.field2494, class161.field2495);
        } else if (arg0 == 37) {
            class34.method2678(class161.field2623, class161.field2596, class161.field2498);
        } else if (arg0 == 38) {
            class34.method2678(class161.field2499, class161.field2500, class161.field2501);
        } else if (arg0 == 55) {
            class34.method2678(class161.field2502, class161.field2522, class161.field2504);
        } else if (arg0 == 56) {
            class34.method2678(class161.field2505, class161.field2506, class161.field2507);
            method3191(11);
            return;
        } else if (arg0 == 57) {
            class34.method2678(class161.field2468, class161.field2509, class161.field2476);
            method3191(11);
            return;
        } else {
            class34.method2678(class161.field2511, class161.field2512, class161.field2606);
        }
        method3191(10);
    }

    @ObfuscatedName("s.c(I)V")
    public static final void method169() {
        if (Statics.field830 != null) {
            Statics.field830.method2879();
            Statics.field830 = null;
        }
        method2119();
        Statics.field92.method1869();
        for (int var0 = 0; var0 < 4; var0++) {
            field332[var0].method2325();
        }
        System.gc();
        class187.field3005 = 1;
        Statics.field2090 = null;
        Statics.field1835 = -1;
        Statics.field3010 = -1;
        Statics.field904 = 0;
        Statics.field2112 = false;
        Statics.field3011 = 2;
        field444 = -1;
        field533 = false;
        class25.method602();
        method3191(10);
    }

    @ObfuscatedName("cs.z(I)V")
    public static final void method2119() {
        class49.method741();
        class44.field996.method3553();
        class47.method724();
        class43.field945.method3553();
        class43.field946.method3553();
        class43.field947.method3553();
        class43.field948.method3553();
        class42.method709();
        class56.method142();
        class45.method546();
        class46.field1028.method3553();
        class46.field1033.method3553();
        class51.method2866();
        class57.field1234.method3553();
        class52.method188();
        class50.method730();
        class183.field2972.method3553();
        class177.method178();
        ((class99) Statics.field1658).method2121();
        class24.field600.method3553();
        Statics.field585.method3102();
        Statics.field3200.method3102();
        Statics.field1116.method3102();
        Statics.field2084.method3102();
        Statics.field2098.method3102();
        Statics.field815.method3102();
        Statics.field2986.method3102();
        Statics.field994.method3102();
        Statics.field2346.method3102();
        Statics.field896.method3102();
        Statics.field2156.method3102();
        Statics.field2968.method3102();
    }

    @ObfuscatedName("r.n(I)V")
    public static final void method95() {
        if (field290 > 1) {
            field290--;
        }
        if (field324 > 0) {
            field324--;
        }
        if (field325) {
            field325 = false;
            if (field324 > 0) {
                method169();
            } else {
                method3191(40);
                Statics.field2938 = Statics.field830;
                Statics.field830 = null;
            }
            return;
        }
        if (!field518) {
            field418[0] = class161.field2443;
            field329[0] = "";
            field416[0] = 1006;
            field413 = 1;
        }
        for (int var0 = 0; var0 < 100 && method185(); var0++) {
        }
        if (field281 != 30) {
            return;
        }
        while (class215.method880()) {
            field314.method2639(209);
            field314.method2399(0);
            int var1 = field314.field2046;
            class215.method2328(field314);
            field314.method2543(field314.field2046 - var1);
        }
        Object var2 = Statics.field1290.field181;
        synchronized (Statics.field1290.field181) {
            if (!field272) {
                Statics.field1290.field186 = 0;
            } else if (class144.field2225 != 0 || Statics.field1290.field186 >= 40) {
                field314.method2639(90);
                field314.method2399(0);
                int var3 = field314.field2046;
                int var4 = 0;
                for (int var5 = 0; var5 < Statics.field1290.field186 && field314.field2046 - var3 < 240; var5++) {
                    var4++;
                    int var6 = Statics.field1290.field179[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = Statics.field1290.field180[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (Statics.field1290.field179[var5] == -1 && Statics.field1290.field180[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = 524287;
                    }
                    if (field372 != var7 || field530 != var6) {
                        int var9 = var7 - field372;
                        field372 = var7;
                        int var10 = var6 - field530;
                        field530 = var6;
                        if (field287 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            field314.method2400((field287 << 12) + (var9 << 6) + var10);
                            field287 = 0;
                        } else if (field287 < 8) {
                            field314.method2401((field287 << 19) + 8388608 + var8);
                            field287 = 0;
                        } else {
                            field314.method2402((field287 << 19) + -1073741824 + var8);
                            field287 = 0;
                        }
                    } else if (field287 < 2047) {
                        field287++;
                    }
                }
                field314.method2543(field314.field2046 - var3);
                if (var4 >= Statics.field1290.field186) {
                    Statics.field1290.field186 = 0;
                } else {
                    Statics.field1290.field186 -= var4;
                    for (int var11 = 0; var11 < Statics.field1290.field186; var11++) {
                        Statics.field1290.field180[var11] = Statics.field1290.field180[var4 + var11];
                        Statics.field1290.field179[var11] = Statics.field1290.field179[var4 + var11];
                    }
                }
            }
        }
        if (class144.field2225 == 1 || !Statics.field236 && class144.field2225 == 4 || class144.field2225 == 2) {
            long var13 = (class144.field2209 - field540 * -1L) / 50L;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            field540 = class144.field2209 * -1L;
            int var15 = class144.field2223;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > Statics.field265) {
                var15 = Statics.field265;
            }
            int var16 = class144.field2221;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > Statics.field175) {
                var16 = Statics.field175;
            }
            int var17 = (int) var13;
            field314.method2639(21);
            field314.method2400((var17 << 1) + (class144.field2225 == 2 ? 1 : 0));
            field314.method2400(var16);
            field314.method2400(var15);
        }
        if (class141.field2182 > 0) {
            field314.method2639(141);
            field314.method2400(0);
            int var18 = field314.field2046;
            long var19 = class119.method3544();
            for (int var21 = 0; var21 < class141.field2182; var21++) {
                long var22 = var19 - field497;
                if (var22 > 16777215L) {
                    var22 = 16777215L;
                }
                field497 = var19;
                field314.method2399(class141.field2179[var21]);
                field314.method2429((int) var22);
            }
            field314.method2410(field314.field2046 - var18);
        }
        if (field364 > 0) {
            field364--;
        }
        if (class141.field2187[96] || class141.field2187[97] || class141.field2187[98] || class141.field2187[99]) {
            field433 = true;
        }
        if (field433 && field364 <= 0) {
            field364 = 20;
            field433 = false;
            field314.method2639(233);
            field314.method2447(field358);
            field314.method2409(field357);
        }
        if (Statics.field2071 && !field288) {
            field288 = true;
            field314.method2639(2);
            field314.method2399(1);
        }
        if (!Statics.field2071 && field288) {
            field288 = false;
            field314.method2639(2);
            field314.method2399(0);
        }
        method635();
        if (field281 != 30) {
            return;
        }
        method141();
        int var10002;
        for (int var24 = 0; var24 < field275; var24++) {
            var10002 = field435[var24]--;
            if (field435[var24] >= -10) {
                class62 var26 = field451[var24];
                if (var26 == null) {
                    class62 var10000 = (class62) null;
                    var26 = class62.method1290(Statics.field2084, field514[var24], 0);
                    if (var26 == null) {
                        continue;
                    }
                    field435[var24] += var26.method1286();
                    field451[var24] = var26;
                }
                if (field435[var24] < 0) {
                    int var33;
                    if (field289[var24] == 0) {
                        var33 = field511;
                    } else {
                        int var27 = (field289[var24] & 0xFF) * 128;
                        int var28 = field289[var24] >> 16 & 0xFF;
                        int var29 = var28 * 128 + 64 - Statics.field2011.field865;
                        if (var29 < 0) {
                            var29 = -var29;
                        }
                        int var30 = field289[var24] >> 8 & 0xFF;
                        int var31 = var30 * 128 + 64 - Statics.field2011.field832;
                        if (var31 < 0) {
                            var31 = -var31;
                        }
                        int var32 = var29 + var31 - 128;
                        if (var32 > var27) {
                            field435[var24] = -100;
                            continue;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        }
                        var33 = field512 * (var27 - var32) / var27;
                    }
                    if (var33 > 0) {
                        class66 var34 = var26.method1285().method1331(Statics.field719);
                        class68 var35 = class68.method1381(var34, 100, var33);
                        var35.method1358(field347[var24] - 1);
                        Statics.field255.method1170(var35);
                    }
                    field435[var24] = -100;
                }
            } else {
                field275--;
                for (int var25 = var24; var25 < field275; var25++) {
                    field514[var25] = field514[var25 + 1];
                    field451[var25] = field451[var25 + 1];
                    field347[var25] = field347[var25 + 1];
                    field435[var25] = field435[var25 + 1];
                    field289[var25] = field289[var25 + 1];
                }
                var24--;
            }
        }
        if (field533 && !class187.method2982()) {
            if (field508 != 0 && field444 != -1) {
                Statics.method2984(Statics.field815, field444, 0, field508, false);
            }
            field533 = false;
        }
        field319++;
        if (field319 <= 750) {
            int var36 = class35.field778;
            int[] var37 = class35.field781;
            for (int var38 = 0; var38 < var36; var38++) {
                class3 var39 = field394[var37[var38]];
                if (var39 != null) {
                    method2735(var39, 1);
                }
            }
            for (int var40 = 0; var40 < field395; var40++) {
                int var41 = field311[var40];
                class37 var42 = field309[var41];
                if (var42 != null) {
                    method2735(var42, var42.field803.field907);
                }
            }
            int[] var43 = class35.field781;
            for (int var44 = 0; var44 < class35.field778; var44++) {
                class3 var45 = field394[var43[var44]];
                if (var45 != null && var45.field891 > 0) {
                    var45.field891--;
                    if (var45.field891 == 0) {
                        var45.field844 = null;
                    }
                }
            }
            for (int var46 = 0; var46 < field395; var46++) {
                int var47 = field311[var46];
                class37 var48 = field309[var47];
                if (var48 != null && var48.field891 > 0) {
                    var48.field891--;
                    if (var48.field891 == 0) {
                        var48.field844 = null;
                    }
                }
            }
            field330++;
            if (field384 != 0) {
                field424 += 20;
                if (field424 >= 400) {
                    field384 = 0;
                }
            }
            if (Statics.field1674 != null) {
                field489++;
                if (field489 >= 15) {
                    method2034(Statics.field1674);
                    Statics.field1674 = null;
                }
            }
            class177 var49 = Statics.field198;
            class177 var50 = Statics.field643;
            Statics.field198 = null;
            Statics.field643 = null;
            field448 = null;
            field452 = false;
            field449 = false;
            field494 = 0;
            while (class141.method1() && field494 < 128) {
                if (field410 >= 2 && class141.field2187[82] && Statics.field2153 == 66) {
                    String var51 = class12.method1063();
                    Statics.field74.setContents(new StringSelection(var51), (ClipboardOwner) null);
                } else {
                    field279[field494] = Statics.field2153;
                    field320[field494] = Statics.field1080;
                    field494++;
                }
            }
            if (field431 != -1) {
                method2865(field431, 0, 0, Statics.field175, Statics.field265, 0, 0);
            }
            field456++;
            while (true) {
                class1 var52;
                class177 var53;
                class177 var54;
                do {
                    var52 = (class1) field471.method3619();
                    if (var52 == null) {
                        while (true) {
                            class1 var55;
                            class177 var56;
                            class177 var57;
                            do {
                                var55 = (class1) field383.method3619();
                                if (var55 == null) {
                                    while (true) {
                                        class1 var58;
                                        class177 var59;
                                        class177 var60;
                                        do {
                                            var58 = (class1) field328.method3619();
                                            if (var58 == null) {
                                                boolean var61 = false;
                                                while (!var61) {
                                                    var61 = true;
                                                    for (int var62 = 0; var62 < field413 - 1; var62++) {
                                                        if (field416[var62] < 1000 && field416[var62 + 1] > 1000) {
                                                            String var63 = field329[var62];
                                                            field329[var62] = field329[var62 + 1];
                                                            field329[var62 + 1] = var63;
                                                            String var64 = field418[var62];
                                                            field418[var62] = field418[var62 + 1];
                                                            field418[var62 + 1] = var64;
                                                            int var65 = field416[var62];
                                                            field416[var62] = field416[var62 + 1];
                                                            field416[var62 + 1] = var65;
                                                            int var66 = field295[var62];
                                                            field295[var62] = field295[var62 + 1];
                                                            field295[var62 + 1] = var66;
                                                            int var67 = field415[var62];
                                                            field415[var62] = field415[var62 + 1];
                                                            field415[var62 + 1] = var67;
                                                            int var68 = field323[var62];
                                                            field323[var62] = field323[var62 + 1];
                                                            field323[var62 + 1] = var68;
                                                            var61 = false;
                                                        }
                                                    }
                                                }
                                                if (Statics.field702 == null && field541 == null) {
                                                    int var69 = class144.field2225;
                                                    if (field518) {
                                                        if (var69 != 1 && (Statics.field236 || var69 != 4)) {
                                                            int var70 = class144.field2214;
                                                            int var71 = class144.field2215 * 148505657;
                                                            if (var70 < Statics.field2700 - 10 || var70 > Statics.field601 + Statics.field2700 + 10 || var71 < Statics.field2100 - 10 || var71 > Statics.field789 + Statics.field2100 + 10) {
                                                                field518 = false;
                                                                method97(Statics.field2700, Statics.field2100, Statics.field601, Statics.field789);
                                                            }
                                                        }
                                                        if (var69 == 1 || !Statics.field236 && var69 == 4) {
                                                            int var72 = Statics.field2700;
                                                            int var73 = Statics.field2100;
                                                            int var74 = Statics.field601;
                                                            int var75 = class144.field2221;
                                                            int var76 = class144.field2223;
                                                            int var77 = -1;
                                                            for (int var78 = 0; var78 < field413; var78++) {
                                                                int var79 = (field413 - 1 - var78) * 15 + var73 + 31;
                                                                if (var75 > var72 && var75 < var72 + var74 && var76 > var79 - 13 && var76 < var79 + 3) {
                                                                    var77 = var78;
                                                                }
                                                            }
                                                            if (var77 != -1) {
                                                                method2031(var77);
                                                            }
                                                            field518 = false;
                                                            method97(Statics.field2700, Statics.field2100, Statics.field601, Statics.field789);
                                                        }
                                                    } else {
                                                        label1234: {
                                                            if ((var69 == 1 || !Statics.field236 && var69 == 4) && field413 > 0) {
                                                                int var80 = field416[field413 - 1];
                                                                if (var80 == 39 || var80 == 40 || var80 == 41 || var80 == 42 || var80 == 43 || var80 == 33 || var80 == 34 || var80 == 35 || var80 == 36 || var80 == 37 || var80 == 38 || var80 == 1005) {
                                                                    label1214: {
                                                                        int var81 = field295[field413 - 1];
                                                                        int var82 = field415[field413 - 1];
                                                                        class177 var83 = class177.method701(var82);
                                                                        int var84 = method143(var83);
                                                                        boolean var85 = (var84 >> 28 & 0x1) != 0;
                                                                        if (!var85) {
                                                                            int var86 = method143(var83);
                                                                            boolean var87 = (var86 >> 29 & 0x1) != 0;
                                                                            if (!var87) {
                                                                                break label1214;
                                                                            }
                                                                        }
                                                                        if (Statics.field702 != null && !field341 && field529 != 1 && !method848(field413 - 1) && field413 > 0) {
                                                                            method2132(field388, field389);
                                                                        }
                                                                        field341 = false;
                                                                        field392 = 0;
                                                                        if (Statics.field702 != null) {
                                                                            method2034(Statics.field702);
                                                                        }
                                                                        Statics.field702 = class177.method701(var82);
                                                                        field387 = var81;
                                                                        field388 = class144.field2221;
                                                                        field389 = class144.field2223;
                                                                        if (field413 > 0) {
                                                                            int var88 = field413 - 1;
                                                                            Statics.field3215 = new class33();
                                                                            Statics.field3215.field726 = field295[var88];
                                                                            Statics.field3215.field721 = field415[var88];
                                                                            Statics.field3215.field723 = field416[var88];
                                                                            Statics.field3215.field725 = field323[var88];
                                                                            Statics.field3215.field724 = field418[var88];
                                                                        }
                                                                        method2034(Statics.field702);
                                                                        break label1234;
                                                                    }
                                                                }
                                                            }
                                                            if ((var69 == 1 || !Statics.field236 && var69 == 4) && (field529 == 1 && field413 > 2 || method848(field413 - 1))) {
                                                                var69 = 2;
                                                            }
                                                            if ((var69 == 1 || !Statics.field236 && var69 == 4) && field413 > 0) {
                                                                int var89 = field413 - 1;
                                                                if (var89 >= 0) {
                                                                    int var90 = field295[var89];
                                                                    int var91 = field415[var89];
                                                                    int var92 = field416[var89];
                                                                    int var93 = field323[var89];
                                                                    String var94 = field418[var89];
                                                                    String var95 = field329[var89];
                                                                    method710(var90, var91, var92, var93, var94, var95, class144.field2221, class144.field2223);
                                                                }
                                                            }
                                                            if (var69 == 2 && field413 > 0) {
                                                                method583(class144.field2221, class144.field2223);
                                                            }
                                                        }
                                                    }
                                                }
                                                if (field541 != null) {
                                                    method2034(field541);
                                                    Statics.field1445++;
                                                    if (field452 && field449) {
                                                        int var96 = class144.field2214;
                                                        int var97 = class144.field2215 * 148505657;
                                                        int var98 = var96 - field446;
                                                        int var99 = var97 - field447;
                                                        if (var98 < field450) {
                                                            var98 = field450;
                                                        }
                                                        if (field541.field2927 + var98 > field450 + field353.field2927) {
                                                            var98 = field450 + field353.field2927 - field541.field2927;
                                                        }
                                                        if (var99 < field516) {
                                                            var99 = field516;
                                                        }
                                                        if (field541.field2878 + var99 > field516 + field353.field2878) {
                                                            var99 = field516 + field353.field2878 - field541.field2878;
                                                        }
                                                        int var100 = var98 - field453;
                                                        int var101 = var99 - field454;
                                                        int var102 = field541.field2826;
                                                        if (Statics.field1445 > field541.field2798 && (var100 > var102 || var100 < -var102 || var101 > var102 || var101 < -var102)) {
                                                            field455 = true;
                                                        }
                                                        int var103 = field353.field2895 + (var98 - field450);
                                                        int var104 = field353.field2818 + (var99 - field516);
                                                        if (field541.field2843 != null && field455) {
                                                            class1 var105 = new class1();
                                                            var105.field4 = field541;
                                                            var105.field1 = var103;
                                                            var105.field5 = var104;
                                                            var105.field2 = field541.field2843;
                                                            class39.method850(var105, 200000);
                                                        }
                                                        if (class144.field2217 == 0) {
                                                            if (field455) {
                                                                if (field541.field2886 != null) {
                                                                    class1 var106 = new class1();
                                                                    var106.field4 = field541;
                                                                    var106.field1 = var103;
                                                                    var106.field5 = var104;
                                                                    var106.field3 = field448;
                                                                    var106.field2 = field541.field2886;
                                                                    class39.method850(var106, 200000);
                                                                }
                                                                if (field448 != null && method2999(field541) != null) {
                                                                    field314.method2639(72);
                                                                    field314.method2445(field541.field2835);
                                                                    field314.method2400(field541.field2797);
                                                                    field314.method2447(field448.field2797);
                                                                    field314.method2402(field448.field2796);
                                                                    field314.method2402(field541.field2796);
                                                                    field314.method2400(field448.field2835);
                                                                }
                                                            } else if ((field529 == 1 || method848(field413 - 1)) && field413 > 2) {
                                                                method583(field453 + field446, field454 + field447);
                                                            } else if (field413 > 0) {
                                                                method2132(field453 + field446, field454 + field447);
                                                            }
                                                            field541 = null;
                                                        }
                                                    } else if (Statics.field1445 > 1) {
                                                        field541 = null;
                                                    }
                                                }
                                                if (Statics.field702 != null) {
                                                    method2034(Statics.field702);
                                                    field392++;
                                                    if (class144.field2217 == 0) {
                                                        if (field341) {
                                                            if (Statics.field802 == Statics.field702 && field390 != field387) {
                                                                class177 var107 = Statics.field702;
                                                                byte var108 = 0;
                                                                if (field434 == 1 && var107.field2800 == 206) {
                                                                    var108 = 1;
                                                                }
                                                                if (var107.field2870[field390] <= 0) {
                                                                    var108 = 0;
                                                                }
                                                                int var109 = method143(var107);
                                                                boolean var110 = (var109 >> 29 & 0x1) != 0;
                                                                if (var110) {
                                                                    int var111 = field387;
                                                                    int var112 = field390;
                                                                    var107.field2870[var112] = var107.field2870[var111];
                                                                    var107.field2831[var112] = var107.field2831[var111];
                                                                    var107.field2870[var111] = -1;
                                                                    var107.field2831[var111] = 0;
                                                                } else if (var108 == 1) {
                                                                    int var113 = field387;
                                                                    int var114 = field390;
                                                                    while (var113 != var114) {
                                                                        if (var113 > var114) {
                                                                            var107.method3225(var113 - 1, var113);
                                                                            var113--;
                                                                        } else if (var113 < var114) {
                                                                            var107.method3225(var113 + 1, var113);
                                                                            var113++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var107.method3225(field390, field387);
                                                                }
                                                                field314.method2639(54);
                                                                field314.method2409(field390);
                                                                field314.method2437(var108);
                                                                field314.method2447(field387);
                                                                field314.method2402(Statics.field702.field2796);
                                                            }
                                                        } else if ((field529 == 1 || method848(field413 - 1)) && field413 > 2) {
                                                            method583(field388, field389);
                                                        } else if (field413 > 0) {
                                                            method2132(field388, field389);
                                                        }
                                                        field489 = 10;
                                                        class144.field2225 = 0;
                                                        Statics.field702 = null;
                                                    } else if (field392 >= 5 && (class144.field2214 > field388 + 5 || class144.field2214 < field388 - 5 || class144.field2215 * 148505657 > field389 + 5 || class144.field2215 * 148505657 < field389 - 5)) {
                                                        field341 = true;
                                                    }
                                                }
                                                if (class90.field1573 != -1) {
                                                    int var115 = class90.field1573;
                                                    int var116 = class90.field1574;
                                                    field314.method2639(139);
                                                    field314.method2399(5);
                                                    field314.method2447(Statics.field185 + var116);
                                                    field314.method2438(class141.field2187[82] ? (class141.field2187[81] ? 2 : 1) : 0);
                                                    field314.method2447(Statics.field839 + var115);
                                                    class90.field1573 = -1;
                                                    field381 = class144.field2221;
                                                    field352 = class144.field2223;
                                                    field384 = 1;
                                                    field424 = 0;
                                                    field505 = var115;
                                                    field465 = var116;
                                                }
                                                if (Statics.field198 != var49) {
                                                    if (var49 != null) {
                                                        method2034(var49);
                                                    }
                                                    if (Statics.field198 != null) {
                                                        method2034(Statics.field198);
                                                    }
                                                }
                                                if (Statics.field643 != var50 && field423 == field391) {
                                                    if (var50 != null) {
                                                        method2034(var50);
                                                    }
                                                    if (Statics.field643 != null) {
                                                        method2034(Statics.field643);
                                                    }
                                                }
                                                if (Statics.field643 == null) {
                                                    if (field391 > 0) {
                                                        field391--;
                                                    }
                                                } else if (field391 < field423) {
                                                    field391++;
                                                    if (field423 == field391) {
                                                        method2034(Statics.field643);
                                                    }
                                                }
                                                int var117 = field342 + Statics.field2011.field865;
                                                int var118 = field338 + Statics.field2011.field832;
                                                if (Statics.field1506 - var117 < -500 || Statics.field1506 - var117 > 500 || Statics.field2711 - var118 < -500 || Statics.field2711 - var118 > 500) {
                                                    Statics.field1506 = var117;
                                                    Statics.field2711 = var118;
                                                }
                                                if (Statics.field1506 != var117) {
                                                    Statics.field1506 += (var117 - Statics.field1506) / 16;
                                                }
                                                if (Statics.field2711 != var118) {
                                                    Statics.field2711 += (var118 - Statics.field2711) / 16;
                                                }
                                                if (class144.field2217 == 4 && Statics.field236) {
                                                    int var119 = class144.field2215 * 148505657 - field362;
                                                    field476 = var119 * 2;
                                                    field362 = var119 == -1 || var119 == 1 ? class144.field2215 * 148505657 : (field362 + class144.field2215 * 148505657) / 2;
                                                    int var120 = field472 - class144.field2214;
                                                    field359 = var120 * 2;
                                                    field472 = var120 == -1 || var120 == 1 ? class144.field2214 : (field472 + class144.field2214) / 2;
                                                } else {
                                                    if (class141.field2187[96]) {
                                                        field359 += (-24 - field359) / 2;
                                                    } else if (class141.field2187[97]) {
                                                        field359 += (24 - field359) / 2;
                                                    } else {
                                                        field359 /= 2;
                                                    }
                                                    if (class141.field2187[98]) {
                                                        field476 += (12 - field476) / 2;
                                                    } else if (class141.field2187[99]) {
                                                        field476 += (-12 - field476) / 2;
                                                    } else {
                                                        field476 /= 2;
                                                    }
                                                    field362 = class144.field2215 * 148505657;
                                                    field472 = class144.field2214;
                                                }
                                                field358 = field359 / 2 + field358 & 0x7FF;
                                                field357 += field476 / 2;
                                                if (field357 < 128) {
                                                    field357 = 128;
                                                }
                                                if (field357 > 383) {
                                                    field357 = 383;
                                                }
                                                int var121 = Statics.field1506 >> 7;
                                                int var122 = Statics.field2711 >> 7;
                                                int var123 = method154(Statics.field1506, Statics.field2711, Statics.field1120);
                                                int var124 = 0;
                                                if (var121 > 3 && var122 > 3 && var121 < 100 && var122 < 100) {
                                                    for (int var125 = var121 - 4; var125 <= var121 + 4; var125++) {
                                                        for (int var126 = var122 - 4; var126 <= var122 + 4; var126++) {
                                                            int var127 = Statics.field1120;
                                                            if (var127 < 3 && (class6.field79[1][var125][var126] & 0x2) == 2) {
                                                                var127++;
                                                            }
                                                            int var128 = var123 - class6.field78[var127][var125][var126];
                                                            if (var128 > var124) {
                                                                var124 = var128;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var129 = var124 * 192;
                                                if (var129 > 98048) {
                                                    var129 = 98048;
                                                }
                                                if (var129 < 32768) {
                                                    var129 = 32768;
                                                }
                                                if (var129 > field366) {
                                                    field366 += (var129 - field366) / 24;
                                                } else if (var129 < field366) {
                                                    field366 += (var129 - field366) / 80;
                                                }
                                                if (field519) {
                                                    method2763();
                                                }
                                                for (int var130 = 0; var130 < 5; var130++) {
                                                    var10002 = field524[var130]++;
                                                }
                                                Statics.field765.method195();
                                                int var131 = class144.method2129();
                                                int var132 = class141.method1012();
                                                if (var131 > 15000 && var132 > 15000) {
                                                    field324 = 250;
                                                    class144.field2222 = 14500;
                                                    field314.method2639(227);
                                                }
                                                field382++;
                                                if (field382 > 500) {
                                                    field382 = 0;
                                                    int var133 = (int) (Math.random() * 8.0D);
                                                    if ((var133 & 0x1) == 1) {
                                                        field342 += field546;
                                                    }
                                                    if ((var133 & 0x2) == 2) {
                                                        field338 += field286;
                                                    }
                                                    if ((var133 & 0x4) == 4) {
                                                        field340 += field369;
                                                    }
                                                }
                                                if (field342 < -50) {
                                                    field546 = 2;
                                                }
                                                if (field342 > 50) {
                                                    field546 = -2;
                                                }
                                                if (field338 < -55) {
                                                    field286 = 2;
                                                }
                                                if (field338 > 55) {
                                                    field286 = -2;
                                                }
                                                if (field340 < -40) {
                                                    field369 = 1;
                                                }
                                                if (field340 > 40) {
                                                    field369 = -1;
                                                }
                                                field500++;
                                                if (field500 > 500) {
                                                    field500 = 0;
                                                    int var134 = (int) (Math.random() * 8.0D);
                                                    if ((var134 & 0x1) == 1) {
                                                        field343 += field422;
                                                    }
                                                    if ((var134 & 0x2) == 2) {
                                                        field485 += field346;
                                                    }
                                                }
                                                if (field343 < -60) {
                                                    field422 = 2;
                                                }
                                                if (field343 > 60) {
                                                    field422 = -2;
                                                }
                                                if (field485 < -20) {
                                                    field346 = 1;
                                                }
                                                if (field485 > 10) {
                                                    field346 = -1;
                                                }
                                                for (class41 var135 = (class41) field402.method3580(); var135 != null; var135 = (class41) field402.method3581()) {
                                                    if ((long) var135.field894 < class119.method3544() / 1000L - 5L) {
                                                        if (var135.field899 > 0) {
                                                            class12.method1270(5, "", var135.field895 + class161.field2514);
                                                        }
                                                        if (var135.field899 == 0) {
                                                            class12.method1270(5, "", var135.field895 + class161.field2385);
                                                        }
                                                        var135.method3723();
                                                    }
                                                }
                                                field363++;
                                                if (field363 > 50) {
                                                    field314.method2639(132);
                                                }
                                                try {
                                                    if (Statics.field830 != null && field314.field2046 > 0) {
                                                        Statics.field830.method2874(field314.field2048, 0, field314.field2046);
                                                        field314.field2046 = 0;
                                                        field363 = 0;
                                                    }
                                                } catch (IOException var137) {
                                                    if (field324 > 0) {
                                                        method169();
                                                    } else {
                                                        method3191(40);
                                                        Statics.field2938 = Statics.field830;
                                                        Statics.field830 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var59 = var58.field4;
                                            if (var59.field2797 < 0) {
                                                break;
                                            }
                                            var60 = class177.method701(var59.field2837);
                                        } while (var60 == null || var60.field2920 == null || var59.field2797 >= var60.field2920.length || var60.field2920[var59.field2797] != var59);
                                        class39.method850(var58, 200000);
                                    }
                                }
                                var56 = var55.field4;
                                if (var56.field2797 < 0) {
                                    break;
                                }
                                var57 = class177.method701(var56.field2837);
                            } while (var57 == null || var57.field2920 == null || var56.field2797 >= var57.field2920.length || var57.field2920[var56.field2797] != var56);
                            class39.method850(var55, 200000);
                        }
                    }
                    var53 = var52.field4;
                    if (var53.field2797 < 0) {
                        break;
                    }
                    var54 = class177.method701(var53.field2837);
                } while (var54 == null || var54.field2920 == null || var53.field2797 >= var54.field2920.length || var54.field2920[var53.field2797] != var53);
                class39.method850(var52, 200000);
            }
        } else if (field324 > 0) {
            method169();
        } else {
            method3191(40);
            Statics.field2938 = Statics.field830;
            Statics.field830 = null;
        }
    }

    @ObfuscatedName("c.q(I)V")
    public static final void method544() {
        if (Statics.field2355 != null) {
            Statics.field2355.method1216();
        }
        if (Statics.field800 != null) {
            Statics.field800.method1216();
        }
    }

    @ObfuscatedName("f.a(Lac;IIII)V")
    public static void method171(class45 arg0, int arg1, int arg2, int arg3) {
        if (field275 >= 50 || field512 == 0 || arg0.field1011 == null || arg1 >= arg0.field1011.length) {
            return;
        }
        int var4 = arg0.field1011[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field514[field275] = var5;
        field347[field275] = var6;
        field435[field275] = 0;
        field451[field275] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field289[field275] = (var8 << 16) + (var9 << 8) + var7;
        field275++;
    }

    @ObfuscatedName("n.b(IIII)V")
    public static void method563(int arg0, int arg1, int arg2) {
        if (field511 == 0 || arg1 == 0 || field275 >= 50) {
            return;
        }
        field514[field275] = arg0;
        field347[field275] = arg1;
        field435[field275] = arg2;
        field451[field275] = null;
        field289[field275] = 0;
        field275++;
    }

    @ObfuscatedName("ap.aj(II)V")
    public static void method639(int arg0) {
        if (arg0 == -1 && !field533) {
            class187.method935();
        } else if (arg0 != -1 && field444 != arg0 && field508 != 0 && !field533) {
            class172 var1 = Statics.field815;
            int var2 = field508;
            class187.field3005 = 1;
            Statics.field2090 = var1;
            Statics.field1835 = arg0;
            Statics.field3010 = 0;
            Statics.field904 = var2;
            Statics.field2112 = false;
            Statics.field3011 = 2;
        }
        field444 = arg0;
    }

    @ObfuscatedName("ci.an(IIB)V")
    public static void method2118(int arg0, int arg1) {
        if (field508 != 0 && arg0 != -1) {
            Statics.method2984(Statics.field2156, arg0, 0, field508, false);
            field533 = true;
        }
    }

    @ObfuscatedName("an.ap(B)V")
    public static final void method635() {
        if (Statics.field1120 == field411) {
            return;
        }
        field411 = Statics.field1120;
        int var0 = Statics.field1120;
        int[] var1 = Statics.field562.field1487;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field79[var0][var6][var4] & 0x18) == 0) {
                    Statics.field92.method1902(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class6.field79[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field92.method1902(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field562.method1682();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field79[var0][var10][var9] & 0x18) == 0) {
                    method2983(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class6.field79[var0 + 1][var10][var9] & 0x8) != 0) {
                    method2983(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field501 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field92.method1897(Statics.field1120, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class43.method96(var14).field959;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field332[Statics.field1120].field1955;
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
                        field504[field501] = Statics.field609[var15];
                        field502[field501] = var16;
                        field503[field501] = var17;
                        field501++;
                    }
                }
            }
        }
        Statics.field1455.method1676();
    }

    @ObfuscatedName("fg.ar(Lfn;IIB)V")
    public static final void method3298(class177 arg0, int arg1, int arg2) {
        if (field507 != 0 && field507 != 3 || class144.field2225 != 1 && Statics.field236 || class144.field2225 != 4) {
            return;
        }
        class179 var3 = arg0.method3230(true);
        if (var3 == null) {
            return;
        }
        int var4 = class144.field2221 - arg1;
        int var5 = class144.field2223 - arg2;
        if (!var3.method3276(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2949 / 2;
        int var7 = var5 - var3.field2939 / 2;
        int var8 = field358 + field343 & 0x7FF;
        int var9 = class95.field1661[var8];
        int var10 = class95.field1662[var8];
        int var11 = (field485 + 256) * var9 >> 8;
        int var12 = (field485 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field2011.field865 + var13 >> 7;
        int var16 = Statics.field2011.field832 - var14 >> 7;
        field314.method2639(33);
        field314.method2399(18);
        field314.method2447(Statics.field185 + var16);
        field314.method2438(class141.field2187[82] ? (class141.field2187[81] ? 2 : 1) : 0);
        field314.method2447(Statics.field839 + var15);
        field314.method2399(var6);
        field314.method2399(var7);
        field314.method2400(field358);
        field314.method2399(57);
        field314.method2399(field343);
        field314.method2399(field485);
        field314.method2399(89);
        field314.method2400(Statics.field2011.field865);
        field314.method2400(Statics.field2011.field832);
        field314.method2399(63);
        field505 = var15;
        field465 = var16;
    }

    @ObfuscatedName("e.ab(Ljava/lang/String;S)V")
    public static final void method35(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field163.field128 = !Statics.field163.field128;
            class9.method660();
            if (Statics.field163.field128) {
                class12.method1270(99, "", "Roofs are now all hidden");
            } else {
                class12.method1270(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field339 = !field339;
        }
        if (field410 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field339 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field339 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field324 > 0) {
                    method169();
                } else {
                    method3191(40);
                    Statics.field2938 = Statics.field830;
                    Statics.field830 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field276 == 2) {
                throw new RuntimeException();
            }
        }
        field314.method2639(231);
        field314.method2399(arg0.length() + 1);
        field314.method2405(arg0);
    }

    @ObfuscatedName("eo.ai(I)V")
    public static final void method2763() {
        int var0 = Statics.field1114 * 128 + 64;
        int var1 = Statics.field124 * 128 + 64;
        int var2 = method154(var0, var1, Statics.field1120) - Statics.field2087;
        if (Statics.field145 < var0) {
            Statics.field145 += Statics.field561 * (var0 - Statics.field145) / 1000 + Statics.field264;
            if (Statics.field145 > var0) {
                Statics.field145 = var0;
            }
        }
        if (Statics.field145 > var0) {
            Statics.field145 -= Statics.field561 * (Statics.field145 - var0) / 1000 + Statics.field264;
            if (Statics.field145 < var0) {
                Statics.field145 = var0;
            }
        }
        if (Statics.field623 < var2) {
            Statics.field623 += Statics.field561 * (var2 - Statics.field623) / 1000 + Statics.field264;
            if (Statics.field623 > var2) {
                Statics.field623 = var2;
            }
        }
        if (Statics.field623 > var2) {
            Statics.field623 -= Statics.field561 * (Statics.field623 - var2) / 1000 + Statics.field264;
            if (Statics.field623 < var2) {
                Statics.field623 = var2;
            }
        }
        if (Statics.field1257 < var1) {
            Statics.field1257 += Statics.field561 * (var1 - Statics.field1257) / 1000 + Statics.field264;
            if (Statics.field1257 > var1) {
                Statics.field1257 = var1;
            }
        }
        if (Statics.field1257 > var1) {
            Statics.field1257 -= Statics.field561 * (Statics.field1257 - var1) / 1000 + Statics.field264;
            if (Statics.field1257 < var1) {
                Statics.field1257 = var1;
            }
        }
        int var3 = Statics.field1088 * 128 + 64;
        int var4 = Statics.field220 * 128 + 64;
        int var5 = method154(var3, var4, Statics.field1120) - Statics.field586;
        int var6 = var3 - Statics.field145;
        int var7 = var5 - Statics.field623;
        int var8 = var4 - Statics.field1257;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field718 < var10) {
            Statics.field718 += Statics.field1009 * (var10 - Statics.field718) / 1000 + Statics.field2007;
            if (Statics.field718 > var10) {
                Statics.field718 = var10;
            }
        }
        if (Statics.field718 > var10) {
            Statics.field718 -= Statics.field1009 * (Statics.field718 - var10) / 1000 + Statics.field2007;
            if (Statics.field718 < var10) {
                Statics.field718 = var10;
            }
        }
        int var12 = var11 - Statics.field156;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field156 += Statics.field1009 * var12 / 1000 + Statics.field2007;
            Statics.field156 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field156 -= Statics.field1009 * -var12 / 1000 + Statics.field2007;
            Statics.field156 &= 0x7FF;
        }
        int var13 = var11 - Statics.field156;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field156 = var11;
        }
    }

    @ObfuscatedName("et.aa(Law;II)V")
    public static final void method2735(class40 arg0, int arg1) {
        if (arg0.field853 > field283) {
            method1060(arg0);
        } else if (arg0.field878 >= field283) {
            method219(arg0);
        } else {
            arg0.field860 = arg0.field848;
            if (arg0.field876 == 0) {
                arg0.field889 = 0;
            } else {
                label322: {
                    if (arg0.field885 != -1 && arg0.field866 == 0) {
                        class45 var2 = class45.method637(arg0.field885);
                        if (arg0.field852 > 0 && var2.field1020 == 0) {
                            arg0.field889++;
                            break label322;
                        }
                        if (arg0.field852 <= 0 && var2.field1021 == 0) {
                            arg0.field889++;
                            break label322;
                        }
                    }
                    int var3 = arg0.field865;
                    int var4 = arg0.field832;
                    int var5 = arg0.field886[arg0.field876 - 1] * 128 + arg0.field859 * 64;
                    int var6 = arg0.field887[arg0.field876 - 1] * 128 + arg0.field859 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field882 = 1280;
                        } else if (var4 > var6) {
                            arg0.field882 = 1792;
                        } else {
                            arg0.field882 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field882 = 768;
                        } else if (var4 > var6) {
                            arg0.field882 = 256;
                        } else {
                            arg0.field882 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field882 = 1024;
                    } else if (var4 > var6) {
                        arg0.field882 = 0;
                    }
                    byte var7 = arg0.field888[arg0.field876 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field882 - arg0.field833 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field879;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field840;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field842;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field841;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field840;
                        }
                        arg0.field860 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class37) {
                            var11 = ((class37) arg0).field803.field939;
                        }
                        if (var11) {
                            if (arg0.field882 != arg0.field833 && arg0.field857 == -1 && arg0.field884 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field876 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field876 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field889 > 0 && arg0.field876 > 1) {
                                var10 = 8;
                                arg0.field889--;
                            }
                        } else {
                            if (arg0.field876 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field876 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field889 > 0 && arg0.field876 > 1) {
                                var10 = 8;
                                arg0.field889--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field860 == arg0.field840 && arg0.field843 != -1) {
                            arg0.field860 = arg0.field843;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field865 += var10;
                                if (arg0.field865 > var5) {
                                    arg0.field865 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field865 -= var10;
                                if (arg0.field865 < var5) {
                                    arg0.field865 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field832 += var10;
                                if (arg0.field832 > var6) {
                                    arg0.field832 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field832 -= var10;
                                if (arg0.field832 < var6) {
                                    arg0.field832 = var6;
                                }
                            }
                        }
                        if (arg0.field865 == var5 && arg0.field832 == var6) {
                            arg0.field876--;
                            if (arg0.field852 > 0) {
                                arg0.field852--;
                            }
                        }
                    } else {
                        arg0.field865 = var5;
                        arg0.field832 = var6;
                        arg0.field876--;
                        if (arg0.field852 > 0) {
                            arg0.field852--;
                        }
                    }
                }
            }
        }
        if (arg0.field865 < 128 || arg0.field832 < 128 || arg0.field865 >= 13184 || arg0.field832 >= 13184) {
            arg0.field885 = -1;
            arg0.field835 = -1;
            arg0.field853 = 0;
            arg0.field878 = 0;
            arg0.field865 = arg0.field886[0] * 128 + arg0.field859 * 64;
            arg0.field832 = arg0.field887[0] * 128 + arg0.field859 * 64;
            arg0.method740();
        }
        if (Statics.field2011 == arg0 && (arg0.field865 < 1536 || arg0.field832 < 1536 || arg0.field865 >= 11776 || arg0.field832 >= 11776)) {
            arg0.field885 = -1;
            arg0.field835 = -1;
            arg0.field853 = 0;
            arg0.field878 = 0;
            arg0.field865 = arg0.field886[0] * 128 + arg0.field859 * 64;
            arg0.field832 = arg0.field887[0] * 128 + arg0.field859 * 64;
            arg0.method740();
        }
        method105(arg0);
        arg0.field892 = false;
        if (arg0.field860 != -1) {
            class45 var12 = class45.method637(arg0.field860);
            if (var12 == null || var12.field1010 == null) {
                arg0.field860 = -1;
            } else {
                arg0.field862++;
                if (arg0.field861 < var12.field1010.length && arg0.field862 > var12.field1012[arg0.field861]) {
                    arg0.field862 = 1;
                    arg0.field861++;
                    method171(var12, arg0.field861, arg0.field865, arg0.field832);
                }
                if (arg0.field861 >= var12.field1010.length) {
                    arg0.field862 = 0;
                    arg0.field861 = 0;
                    method171(var12, arg0.field861, arg0.field865, arg0.field832);
                }
            }
        }
        if (arg0.field835 != -1 && field283 >= arg0.field871) {
            if (arg0.field869 < 0) {
                arg0.field869 = 0;
            }
            int var13 = class46.method3219(arg0.field835).field1029;
            if (var13 == -1) {
                arg0.field835 = -1;
            } else {
                class45 var14 = class45.method637(var13);
                if (var14 == null || var14.field1010 == null) {
                    arg0.field835 = -1;
                } else {
                    arg0.field870++;
                    if (arg0.field869 < var14.field1010.length && arg0.field870 > var14.field1012[arg0.field869]) {
                        arg0.field870 = 1;
                        arg0.field869++;
                        method171(var14, arg0.field869, arg0.field865, arg0.field832);
                    }
                    if (arg0.field869 >= var14.field1010.length && (arg0.field869 < 0 || arg0.field869 >= var14.field1010.length)) {
                        arg0.field835 = -1;
                    }
                }
            }
        }
        if (arg0.field885 != -1 && arg0.field866 <= 1) {
            class45 var15 = class45.method637(arg0.field885);
            if (var15.field1020 == 1 && arg0.field852 > 0 && arg0.field853 <= field283 && arg0.field878 < field283) {
                arg0.field866 = 1;
                return;
            }
        }
        if (arg0.field885 != -1 && arg0.field866 == 0) {
            class45 var16 = class45.method637(arg0.field885);
            if (var16 == null || var16.field1010 == null) {
                arg0.field885 = -1;
            } else {
                arg0.field863++;
                if (arg0.field864 < var16.field1010.length && arg0.field863 > var16.field1012[arg0.field864]) {
                    arg0.field863 = 1;
                    arg0.field864++;
                    method171(var16, arg0.field864, arg0.field865, arg0.field832);
                }
                if (arg0.field864 >= var16.field1010.length) {
                    arg0.field864 -= var16.field1014;
                    arg0.field867++;
                    if (arg0.field867 >= var16.field1008) {
                        arg0.field885 = -1;
                    } else if (arg0.field864 >= 0 && arg0.field864 < var16.field1010.length) {
                        method171(var16, arg0.field864, arg0.field865, arg0.field832);
                    } else {
                        arg0.field885 = -1;
                    }
                }
                arg0.field892 = var16.field1016;
            }
        }
        if (arg0.field866 > 0) {
            arg0.field866--;
        }
    }

    @ObfuscatedName("ae.ax(Law;B)V")
    public static final void method1060(class40 arg0) {
        int var1 = arg0.field853 - field283;
        int var2 = arg0.field873 * 128 + arg0.field859 * 64;
        int var3 = arg0.field875 * 128 + arg0.field859 * 64;
        arg0.field865 += (var2 - arg0.field865) / var1;
        arg0.field832 += (var3 - arg0.field832) / var1;
        arg0.field889 = 0;
        arg0.field882 = arg0.field847;
    }

    @ObfuscatedName("t.ad(Law;I)V")
    public static final void method219(class40 arg0) {
        if (field283 == arg0.field878 || arg0.field885 == -1 || arg0.field866 != 0 || arg0.field863 + 1 > class45.method637(arg0.field885).field1012[arg0.field864]) {
            int var1 = arg0.field878 - arg0.field853;
            int var2 = field283 - arg0.field853;
            int var3 = arg0.field873 * 128 + arg0.field859 * 64;
            int var4 = arg0.field875 * 128 + arg0.field859 * 64;
            int var5 = arg0.field874 * 128 + arg0.field859 * 64;
            int var6 = arg0.field859 * 64 + arg0.field837 * 128;
            arg0.field865 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field832 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field889 = 0;
        arg0.field882 = arg0.field847;
        arg0.field833 = arg0.field882;
    }

    @ObfuscatedName("x.av(Law;B)V")
    public static final void method105(class40 arg0) {
        if (arg0.field884 == 0) {
            return;
        }
        if (arg0.field857 != -1) {
            class40 var1 = null;
            if (arg0.field857 < 32768) {
                var1 = field309[arg0.field857];
            } else if (arg0.field857 >= 32768) {
                var1 = field394[arg0.field857 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field865 - var1.field865;
                int var3 = arg0.field832 - var1.field832;
                if (var2 != 0 || var3 != 0) {
                    arg0.field882 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field858) {
                arg0.field857 = -1;
                arg0.field858 = false;
            }
        }
        if (arg0.field868 != -1 && (arg0.field876 == 0 || arg0.field889 > 0)) {
            arg0.field882 = arg0.field868;
            arg0.field868 = -1;
        }
        int var4 = arg0.field882 - arg0.field833 & 0x7FF;
        if (var4 == 0 && arg0.field858) {
            arg0.field857 = -1;
            arg0.field858 = false;
        }
        if (var4 == 0) {
            arg0.field883 = 0;
            return;
        }
        arg0.field883++;
        if (var4 > 1024) {
            arg0.field833 -= arg0.field884;
            boolean var5 = true;
            if (var4 < arg0.field884 || var4 > 2048 - arg0.field884) {
                arg0.field833 = arg0.field882;
                var5 = false;
            }
            if (arg0.field860 == arg0.field848 && (arg0.field883 > 25 || var5)) {
                if (arg0.field877 == -1) {
                    arg0.field860 = arg0.field840;
                } else {
                    arg0.field860 = arg0.field877;
                }
            }
        } else {
            arg0.field833 += arg0.field884;
            boolean var6 = true;
            if (var4 < arg0.field884 || var4 > 2048 - arg0.field884) {
                arg0.field833 = arg0.field882;
                var6 = false;
            }
            if (arg0.field860 == arg0.field848 && (arg0.field883 > 25 || var6)) {
                if (arg0.field838 == -1) {
                    arg0.field860 = arg0.field840;
                } else {
                    arg0.field860 = arg0.field838;
                }
            }
        }
        arg0.field833 &= 0x7FF;
    }

    @ObfuscatedName("f.aq(Le;III)V")
    public static void method170(class3 arg0, int arg1, int arg2) {
        if (arg0.field885 == arg1 && arg1 != -1) {
            int var3 = class45.method637(arg1).field1023;
            if (var3 == 1) {
                arg0.field864 = 0;
                arg0.field863 = 0;
                arg0.field866 = arg2;
                arg0.field867 = 0;
            }
            if (var3 == 2) {
                arg0.field867 = 0;
            }
        } else if (arg1 == -1 || arg0.field885 == -1 || class45.method637(arg1).field1006 >= class45.method637(arg0.field885).field1006) {
            arg0.field885 = arg1;
            arg0.field864 = 0;
            arg0.field863 = 0;
            arg0.field866 = arg2;
            arg0.field867 = 0;
            arg0.field852 = arg0.field876;
        }
    }

    @ObfuscatedName("fb.af(I)V")
    public static void method3270() {
        field314.method2639(84);
        class126 var0 = field314;
        int var1 = field361 ? 2 : 1;
        var0.method2399(var1);
        field314.method2400(Statics.field175);
        field314.method2400(Statics.field265);
    }

    @ObfuscatedName("f.at(I)V")
    public static void method172() {
        client var0 = Statics.field271;
        synchronized (Statics.field271) {
            Container var1 = Statics.field271.method2916();
            if (var1 != null) {
                Statics.field2093 = Math.max(var1.getSize().width, Statics.field177);
                Statics.field1963 = Math.max(var1.getSize().height, Statics.field663);
                if (Statics.field836 == var1) {
                    Insets var2 = Statics.field836.getInsets();
                    Statics.field2093 -= var2.right + var2.left;
                    Statics.field1963 -= var2.top + var2.bottom;
                }
                if (Statics.field2093 <= 0) {
                    Statics.field2093 = 1;
                }
                if (Statics.field1963 <= 0) {
                    Statics.field1963 = 1;
                }
                int var3 = field361 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field175 = field486;
                    Statics.field265 = field487 * 503;
                } else {
                    Statics.field175 = Math.min(Statics.field2093, 7680);
                    Statics.field265 = Math.min(Statics.field1963, 2160);
                }
                field2263 = (Statics.field2093 - Statics.field175) / 2;
                field2264 = 0;
                Statics.field1966.setSize(Statics.field175, Statics.field265);
                Statics.field1455 = class81.method1009(Statics.field175, Statics.field265, Statics.field1966);
                if (Statics.field836 == var1) {
                    Insets var4 = Statics.field836.getInsets();
                    Statics.field1966.setLocation(field2263 + var4.left, field2264 + var4.top);
                } else {
                    Statics.field1966.setLocation(field2263, field2264);
                }
                int var5 = Statics.field175;
                int var6 = Statics.field265;
                if (Statics.field2093 < var5) {
                    int var7 = Statics.field2093;
                }
                if (Statics.field1963 < var6) {
                    int var8 = Statics.field1963;
                }
                if (Statics.field163 != null) {
                    try {
                        client var9 = Statics.field271;
                        int var10 = field361 ? 2 : 1;
                        Object[] var11 = new Object[] { var10 };
                        JSObject.getWindow(var9).call("resize", var11);
                    } catch (Throwable var17) {
                    }
                }
                if (field431 != -1) {
                    int var13 = field431;
                    int var14 = Statics.field175;
                    int var15 = Statics.field265;
                    if (class177.method2581(var13)) {
                        method89(Statics.field2815[var13], -1, var14, var15, true);
                    }
                }
                method98();
            }
        }
    }

    @ObfuscatedName("r.aw(I)V")
    public static void method98() {
        int var0 = field2263;
        int var1 = field2264;
        int var2 = Statics.field2093 - Statics.field175 - var0;
        int var3 = Statics.field1963 - Statics.field265 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field271.method2916();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field836 == var4) {
                Insets var7 = Statics.field836.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1963);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field2093, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field2093 + var5 - var2, var6, var2, Statics.field1963);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1963 + var6 - var3, Statics.field2093, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("s.ah(Ljava/lang/String;ZI)V")
    public static final void method166(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field202.method3835(arg0, 250);
        int var6 = Statics.field202.method3919(arg0, 250) * 13;
        class83.method1772(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class83.method1770(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field202.method3845(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method97(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            Statics.method738(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1966.getGraphics();
            Statics.field1455.method1597(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1966.repaint();
        }
    }

    @ObfuscatedName("ax.al(IIIII)V")
    public static final void method687(int arg0, int arg1, int arg2, int arg3) {
        field378++;
        method847(class36.field794);
        boolean var4 = false;
        if (field345 >= 0) {
            int var5 = class35.field778;
            int[] var6 = class35.field781;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field345 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method847(class36.field790);
        }
        method2358(true);
        method847(var4 ? class36.field793 : class36.field792);
        method2358(false);
        method2767();
        for (class32 var8 = (class32) field407.method3621(); var8 != null; var8 = (class32) field407.method3630()) {
            if (Statics.field1120 != var8.field713 || var8.field716) {
                var8.method3729();
            } else if (field283 >= var8.field708) {
                var8.method653(field330);
                if (var8.field716) {
                    var8.method3729();
                } else {
                    Statics.field92.method1880(var8.field713, var8.field709, var8.field711, var8.field712, 60, var8, 0, -1, false);
                }
            }
        }
        method871(arg0, arg1, arg2, arg3, true);
        int var9 = field515;
        int var10 = field317;
        int var11 = field535;
        int var12 = field365;
        class83.method1767(var9, var10, var9 + var11, var10 + var12);
        class95.method2036();
        if (!field519) {
            int var13 = field357;
            if (field366 / 256 > var13) {
                var13 = field366 / 256;
            }
            if (field520[4] && field492[4] + 128 > var13) {
                var13 = field492[4] + 128;
            }
            int var14 = field358 + field340 & 0x7FF;
            int var15 = Statics.field1506;
            int var16 = method154(Statics.field2011.field865, Statics.field2011.field832, Statics.field1120) - field438;
            int var17 = Statics.field2711;
            int var18 = var13 * 3 + 600;
            int var19 = 2048 - var13 & 0x7FF;
            int var20 = 2048 - var14 & 0x7FF;
            int var21 = 0;
            int var22 = 0;
            int var23 = var18;
            if (var19 != 0) {
                int var24 = class95.field1661[var19];
                int var25 = class95.field1662[var19];
                int var26 = var22 * var25 - var18 * var24 >> 16;
                var23 = var22 * var24 + var18 * var25 >> 16;
                var22 = var26;
            }
            if (var20 != 0) {
                int var27 = class95.field1661[var20];
                int var28 = class95.field1662[var20];
                int var29 = var21 * var28 + var23 * var27 >> 16;
                var23 = var23 * var28 - var21 * var27 >> 16;
                var21 = var29;
            }
            Statics.field145 = var15 - var21;
            Statics.field623 = var16 - var22;
            Statics.field1257 = var17 - var23;
            Statics.field718 = var13;
            Statics.field156 = var14;
        }
        int var30;
        if (field519) {
            var30 = method1653();
        } else {
            var30 = method174();
        }
        int var31 = Statics.field145;
        int var32 = Statics.field623;
        int var33 = Statics.field1257;
        int var34 = Statics.field718;
        int var35 = Statics.field156;
        for (int var36 = 0; var36 < 5; var36++) {
            if (field520[var36]) {
                int var37 = (int) (Math.random() * (double) (field521[var36] * 2 + 1) - (double) field521[var36] + Math.sin((double) field523[var36] / 100.0D * (double) field524[var36]) * (double) field492[var36]);
                if (var36 == 0) {
                    Statics.field145 += var37;
                }
                if (var36 == 1) {
                    Statics.field623 += var37;
                }
                if (var36 == 2) {
                    Statics.field1257 += var37;
                }
                if (var36 == 3) {
                    Statics.field156 = Statics.field156 + var37 & 0x7FF;
                }
                if (var36 == 4) {
                    Statics.field718 += var37;
                    if (Statics.field718 < 128) {
                        Statics.field718 = 128;
                    }
                    if (Statics.field718 > 383) {
                        Statics.field718 = 383;
                    }
                }
            }
        }
        int var38 = class144.field2214;
        int var39 = class144.field2215 * 148505657;
        if (class144.field2225 != 0) {
            var38 = class144.field2221;
            var39 = class144.field2223;
        }
        if (var38 >= var9 && var38 < var9 + var11 && var39 >= var10 && var39 < var10 + var12) {
            class109.field1864 = true;
            class109.field1920 = 0;
            class109.field1918 = var38 - var9;
            class109.field1919 = var39 - var10;
        } else {
            class109.field1864 = false;
            class109.field1920 = 0;
        }
        method544();
        class83.method1772(var9, var10, var11, var12, 0);
        method544();
        int var40 = class95.field1647;
        class95.field1647 = field537;
        Statics.field92.method1906(Statics.field145, Statics.field623, Statics.field1257, Statics.field718, Statics.field156, var30);
        class95.field1647 = var40;
        method544();
        Statics.field92.method1883();
        field367 = 0;
        boolean var41 = false;
        int var42 = -1;
        int var43 = class35.field778;
        int[] var44 = class35.field781;
        for (int var45 = 0; var45 < field395 + var43; var45++) {
            class40 var46;
            if (var45 < var43) {
                var46 = field394[var44[var45]];
                if (field345 == var44[var45]) {
                    var41 = true;
                    var42 = var45;
                    continue;
                }
            } else {
                var46 = field309[field311[var45 - var43]];
            }
            method2327(var46, var45, var9, var10, var11, var12);
        }
        if (var41) {
            method2327(field394[field345], var42, var9, var10, var11, var12);
        }
        for (int var47 = 0; var47 < field367; var47++) {
            int var48 = field344[var47];
            int var49 = field280[var47];
            int var50 = field513[var47];
            int var51 = field371[var47];
            boolean var52 = true;
            while (var52) {
                var52 = false;
                for (int var53 = 0; var53 < var47; var53++) {
                    if (var49 + 2 > field280[var53] - field371[var53] && var49 - var51 < field280[var53] + 2 && var48 - var50 < field513[var53] + field344[var53] && var48 + var50 > field344[var53] - field513[var53] && field280[var53] - field371[var53] < var49) {
                        var49 = field280[var53] - field371[var53];
                        var52 = true;
                    }
                }
            }
            field379 = field344[var47];
            field398 = field280[var47] = var49;
            String var54 = field376[var47];
            if (field430 == 0) {
                int var55 = 16776960;
                if (field373[var47] < 6) {
                    var55 = field488[field373[var47]];
                }
                if (field373[var47] == 6) {
                    var55 = field378 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field373[var47] == 7) {
                    var55 = field378 % 20 < 10 ? 255 : 65535;
                }
                if (field373[var47] == 8) {
                    var55 = field378 % 20 < 10 ? 45056 : 8454016;
                }
                if (field373[var47] == 9) {
                    int var56 = 150 - field375[var47];
                    if (var56 < 50) {
                        var55 = var56 * 1280 + 16711680;
                    } else if (var56 < 100) {
                        var55 = 16776960 - (var56 - 50) * 327680;
                    } else if (var56 < 150) {
                        var55 = (var56 - 100) * 5 + 65280;
                    }
                }
                if (field373[var47] == 10) {
                    int var57 = 150 - field375[var47];
                    if (var57 < 50) {
                        var55 = var57 * 5 + 16711680;
                    } else if (var57 < 100) {
                        var55 = 16711935 - (var57 - 50) * 327680;
                    } else if (var57 < 150) {
                        var55 = (var57 - 100) * 327680 + 255 - (var57 - 100) * 5;
                    }
                }
                if (field373[var47] == 11) {
                    int var58 = 150 - field375[var47];
                    if (var58 < 50) {
                        var55 = 16777215 - var58 * 327685;
                    } else if (var58 < 100) {
                        var55 = (var58 - 50) * 327685 + 65280;
                    } else if (var58 < 150) {
                        var55 = 16777215 - (var58 - 100) * 327680;
                    }
                }
                if (field374[var47] == 0) {
                    Statics.field26.method3855(var54, field379 + var9, field398 + var10, var55, 0);
                }
                if (field374[var47] == 1) {
                    Statics.field26.method3842(var54, field379 + var9, field398 + var10, var55, 0, field378);
                }
                if (field374[var47] == 2) {
                    Statics.field26.method3843(var54, field379 + var9, field398 + var10, var55, 0, field378);
                }
                if (field374[var47] == 3) {
                    Statics.field26.method3913(var54, field379 + var9, field398 + var10, var55, 0, field378, 150 - field375[var47]);
                }
                if (field374[var47] == 4) {
                    int var59 = (150 - field375[var47]) * (Statics.field26.method3833(var54) + 100) / 150;
                    class83.method1768(field379 + var9 - 50, var10, field379 + var9 + 50, var10 + var12);
                    Statics.field26.method3838(var54, field379 + var9 + 50 - var59, field398 + var10, var55, 0);
                    class83.method1767(var9, var10, var9 + var11, var10 + var12);
                }
                if (field374[var47] == 5) {
                    int var60 = 150 - field375[var47];
                    int var61 = 0;
                    if (var60 < 25) {
                        var61 = var60 - 25;
                    } else if (var60 > 125) {
                        var61 = var60 - 125;
                    }
                    class83.method1768(var9, field398 + var10 - Statics.field26.field3238 - 1, var9 + var11, field398 + var10 + 5);
                    Statics.field26.method3855(var54, field379 + var9, field398 + var10 + var61, var55, 0);
                    class83.method1767(var9, var10, var9 + var11, var10 + var12);
                }
            } else {
                Statics.field26.method3855(var54, field379 + var9, field398 + var10, 16776960, 0);
            }
        }
        if (field419 == 2) {
            method786((field294 - Statics.field839 << 7) + field297, (field310 - Statics.field185 << 7) + field298, field296 * 2);
            if (field379 > -1 && field283 % 20 < 10) {
                Statics.field1166[0].method1692(field379 + var9 - 12, field398 + var10 - 28);
            }
        }
        ((class99) Statics.field1658).method2122(field330);
        method2134(var9, var10, var11, var12);
        Statics.field145 = var31;
        Statics.field623 = var32;
        Statics.field1257 = var33;
        Statics.field718 = var34;
        Statics.field156 = var35;
        if (field282) {
            byte var62 = 0;
            int var63 = class175.field2766 + class175.field2764 + var62;
            if (var63 == 0) {
                field282 = false;
            }
        }
        if (field282) {
            class83.method1772(var9, var10, var11, var12, 0);
            method166(class161.field2376, false);
        }
    }

    @ObfuscatedName("as.as(IIIIZB)V")
    public static final void method871(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field526 - field525) * var5 / 100 + field525;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field531) {
            short var8 = field531;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field426) {
                var6 = field426;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class83.method1766();
                    class83.method1772(arg0, arg1, var10, arg3, -16777216);
                    class83.method1772(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field543) {
            short var11 = field543;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field509) {
                var6 = field509;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class83.method1766();
                    class83.method1772(arg0, arg1, arg2, var13, -16777216);
                    class83.method1772(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field368 - field348) * var5 / 100 + field348;
        field537 = arg3 * var6 * var14 / 85504 << 1;
        if (field535 != arg2 || field365 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class95.field1661[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class90.method1903(var15, 500, 800, arg2, arg3);
        }
        field515 = arg0;
        field317 = arg1;
        field535 = arg2;
        field365 = arg3;
    }

    @ObfuscatedName("al.ac(Lav;I)V")
    public static final void method847(class36 arg0) {
        if (Statics.field2011.field865 >> 7 == field505 && Statics.field2011.field832 >> 7 == field465) {
            field505 = 0;
        }
        int var1 = class35.field778;
        int[] var2 = class35.field781;
        int var3 = var1;
        if (class36.field794 == arg0 || class36.field790 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class36.field794 == arg0) {
                var5 = Statics.field2011;
                var6 = Statics.field2011.field47 << 14;
            } else if (class36.field790 == arg0) {
                var5 = field394[field345];
                var6 = field345 << 14;
            } else {
                var5 = field394[var2[var4]];
                var6 = var2[var4] << 14;
                if (class36.field793 == arg0 && field345 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method20() && !var5.field57) {
                var5.field55 = false;
                if ((field278 && var1 > 50 || var1 > 200) && class36.field794 != arg0 && var5.field860 == var5.field848) {
                    var5.field55 = true;
                }
                int var7 = var5.field865 >> 7;
                int var8 = var5.field832 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field50 == null || field283 < var5.field45 || field283 >= var5.field37) {
                        if ((var5.field865 & 0x7F) == 64 && (var5.field832 & 0x7F) == 64) {
                            if (field378 == field377[var7][var8]) {
                                continue;
                            }
                            field377[var7][var8] = field378;
                        }
                        var5.field46 = method154(var5.field865, var5.field832, Statics.field1120);
                        Statics.field92.method1880(Statics.field1120, var5.field865, var5.field832, var5.field46, 60, var5, var5.field833, var6, var5.field892);
                    } else {
                        var5.field55 = false;
                        var5.field46 = method154(var5.field865, var5.field832, Statics.field1120);
                        Statics.field92.method1881(Statics.field1120, var5.field865, var5.field832, var5.field46, 60, var5, var5.field833, var6, var5.field38, var5.field52, var5.field53, var5.field54);
                    }
                }
            }
        }
    }

    @ObfuscatedName("da.ao(ZI)V")
    public static final void method2358(boolean arg0) {
        for (int var1 = 0; var1 < field395; var1++) {
            class37 var2 = field309[field311[var1]];
            int var3 = (field311[var1] << 14) + 536870912;
            if (var2 != null && var2.method20() && var2.field803.field910 == arg0 && var2.field803.method764()) {
                int var4 = var2.field865 >> 7;
                int var5 = var2.field832 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field859 == 1 && (var2.field865 & 0x7F) == 64 && (var2.field832 & 0x7F) == 64) {
                        if (field378 == field377[var4][var5]) {
                            continue;
                        }
                        field377[var4][var5] = field378;
                    }
                    if (!var2.field803.field936) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field92.method1880(Statics.field1120, var2.field865, var2.field832, method154(var2.field865 + (var2.field859 * 64 - 64), var2.field832 + (var2.field859 * 64 - 64), Statics.field1120), var2.field859 * 64 - 64 + 60, var2, var2.field833, var3, var2.field892);
                }
            }
        }
    }

    @ObfuscatedName("eo.au(I)V")
    public static final void method2767() {
        for (class7 var0 = (class7) field406.method3621(); var0 != null; var0 = (class7) field406.method3630()) {
            if (Statics.field1120 != var0.field94 || field283 > var0.field100) {
                var0.method3729();
            } else if (field283 >= var0.field99) {
                if (var0.field103 > 0) {
                    class37 var1 = field309[var0.field103 - 1];
                    if (var1 != null && var1.field865 >= 0 && var1.field865 < 13312 && var1.field832 >= 0 && var1.field832 < 13312) {
                        var0.method81(var1.field865, var1.field832, method154(var1.field865, var1.field832, var0.field94) - var0.field98, field283);
                    }
                }
                if (var0.field103 < 0) {
                    int var2 = -var0.field103 - 1;
                    class3 var3;
                    if (field552 == var2) {
                        var3 = Statics.field2011;
                    } else {
                        var3 = field394[var2];
                    }
                    if (var3 != null && var3.field865 >= 0 && var3.field865 < 13312 && var3.field832 >= 0 && var3.field832 < 13312) {
                        var0.method81(var3.field865, var3.field832, method154(var3.field865, var3.field832, var0.field94) - var0.field98, field283);
                    }
                }
                var0.method82(field330);
                Statics.field92.method1880(Statics.field1120, (int) var0.field105, (int) var0.field106, (int) var0.field118, 60, var0, var0.field95, -1, false);
            }
        }
    }

    @ObfuscatedName("f.am(S)I")
    public static final int method174() {
        if (Statics.field163.field128) {
            return Statics.field1120;
        }
        int var0 = 3;
        if (Statics.field718 < 310) {
            int var1 = Statics.field145 >> 7;
            int var2 = Statics.field1257 >> 7;
            int var3 = Statics.field2011.field865 >> 7;
            int var4 = Statics.field2011.field832 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1120;
            }
            if ((class6.field79[Statics.field1120][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1120;
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
                    if ((class6.field79[Statics.field1120][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1120;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field79[Statics.field1120][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1120;
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
                    if ((class6.field79[Statics.field1120][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1120;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field79[Statics.field1120][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1120;
                        }
                    }
                }
            }
        }
        if (Statics.field2011.field865 >= 0 && Statics.field2011.field832 >= 0 && Statics.field2011.field865 < 13312 && Statics.field2011.field832 < 13312) {
            if ((class6.field79[Statics.field1120][Statics.field2011.field865 >> 7][Statics.field2011.field832 >> 7] & 0x4) != 0) {
                var0 = Statics.field1120;
            }
            return var0;
        } else {
            return Statics.field1120;
        }
    }

    @ObfuscatedName("cx.ag(I)I")
    public static final int method1653() {
        if (Statics.field163.field128) {
            return Statics.field1120;
        } else {
            int var0 = method154(Statics.field145, Statics.field1257, Statics.field1120);
            return var0 - Statics.field623 >= 800 || (class6.field79[Statics.field1120][Statics.field145 >> 7][Statics.field1257 >> 7] & 0x4) == 0 ? 3 : Statics.field1120;
        }
    }

    @ObfuscatedName("ds.az(Law;IIIIII)V")
    public static final void method2327(class40 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method20()) {
            return;
        }
        if (arg0 instanceof class37) {
            class42 var6 = ((class37) arg0).field803;
            if (var6.field935 != null) {
                var6 = var6.method763();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class35.field778;
        int[] var8 = class35.field781;
        int var9 = 3;
        if (!arg0.field856.method3663()) {
            method38(arg0, arg0.field881 + 15);
            for (class27 var10 = (class27) arg0.field856.method3660(); var10 != null; var10 = (class27) arg0.field856.method3675()) {
                class21 var11 = var10.method592(field283);
                if (var11 != null) {
                    class50 var12 = var10.field636;
                    class82 var13 = var12.method989();
                    class82 var14 = var12.method998();
                    int var15;
                    if (var13 == null || var14 == null) {
                        var15 = var12.field1103;
                    } else {
                        var15 = var14.field1477;
                    }
                    int var16 = 255;
                    boolean var17 = true;
                    int var18 = field283 - var11.field566;
                    int var19 = var11.field557 * var15 / var12.field1103;
                    int var22;
                    if (var11.field559 > var18) {
                        int var20 = var12.field1102 == 0 ? 0 : var18 / var12.field1102 * var12.field1102;
                        int var21 = var11.field558 * var15 / var12.field1103;
                        var22 = (var19 - var21) * var20 / var11.field559 + var21;
                    } else {
                        var22 = var19;
                        int var23 = var11.field559 + var12.field1096 - var18;
                        if (var12.field1101 >= 0) {
                            var16 = (var23 << 8) / (var12.field1096 - var12.field1101);
                        }
                    }
                    if (var11.field557 > 0 && var22 < 2) {
                        var22 = 2;
                    }
                    int var24 = field379 + arg2 - (var15 >> 1);
                    int var25 = field398 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field379 > -1) {
                            class83.method1772(var24, var25, var22, 5, 65280);
                            class83.method1772(var22 + var24, var25, var15 - var22, 5, 16711680);
                        }
                        var9 += 7;
                    } else {
                        int var26 = var13.field1481;
                        var9 += var26;
                        if (var16 >= 0 && var16 < 255) {
                            var13.method1689(var24, var25, var16);
                            class83.method1768(var24, var25, var22 + var24, var25 + var26);
                            var14.method1689(var24, var25, var16);
                        } else {
                            var13.method1692(var24, var25);
                            class83.method1768(var24, var25, var22 + var24, var25 + var26);
                            var14.method1692(var24, var25);
                        }
                        class83.method1767(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method593()) {
                    var10.method3729();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class3 var27 = (class3) arg0;
            if (var27.field57) {
                return;
            }
            if (var27.field39 != -1 || var27.field63 != -1) {
                method38(arg0, arg0.field881 + 15);
                if (field379 > -1) {
                    if (var27.field39 != -1) {
                        Statics.field188[var27.field39].method1692(field379 + arg2 - 12, field398 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var27.field63 != -1) {
                        Statics.field349[var27.field63].method1692(field379 + arg2 - 12, field398 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field419 == 10 && field337 == var8[arg1]) {
                method38(arg0, arg0.field881 + 15);
                if (field379 > -1) {
                    Statics.field1166[1].method1692(field379 + arg2 - 12, field398 + arg3 - var9);
                }
            }
        } else {
            class42 var28 = ((class37) arg0).field803;
            if (var28.field935 != null) {
                var28 = var28.method763();
            }
            if (var28.field933 >= 0 && var28.field933 < Statics.field349.length) {
                method38(arg0, arg0.field881 + 15);
                if (field379 > -1) {
                    Statics.field349[var28.field933].method1692(field379 + arg2 - 12, field398 + arg3 - 30);
                }
            }
            if (field419 == 1 && field292 == field311[arg1 - var7] && field283 % 20 < 10) {
                method38(arg0, arg0.field881 + 15);
                if (field379 > -1) {
                    Statics.field1166[0].method1692(field379 + arg2 - 12, field398 + arg3 - 28);
                }
            }
        }
        if (arg0.field844 != null && (arg1 >= var7 || !arg0.field831 && (field396 == 4 || !arg0.field845 && (field396 == 0 || field396 == 3 || field396 == 1 && method3016(((class3) arg0).field44, false))))) {
            method38(arg0, arg0.field881);
            if (field379 > -1 && field367 < field301) {
                field513[field367] = Statics.field26.method3833(arg0.field844) / 2;
                field371[field367] = Statics.field26.field3238;
                field344[field367] = field379;
                field280[field367] = field398;
                field373[field367] = arg0.field834;
                field374[field367] = arg0.field890;
                field375[field367] = arg0.field891;
                field376[field367] = arg0.field844;
                field367++;
            }
        }
        for (int var29 = 0; var29 < 4; var29++) {
            int var30 = arg0.field846[var29];
            int var31 = arg0.field851[var29];
            class52 var32 = null;
            int var33 = 0;
            if (var31 >= 0) {
                if (var30 <= field283) {
                    continue;
                }
                var32 = class52.method176(arg0.field851[var29]);
                var33 = var32.field1128;
            } else if (var30 < 0) {
                continue;
            }
            int var34 = arg0.field854[var29];
            class52 var35 = null;
            if (var34 >= 0) {
                var35 = class52.method176(var34);
            }
            if (var30 - var33 <= field283) {
                if (var32 == null) {
                    arg0.field846[var29] = -1;
                } else {
                    method38(arg0, arg0.field881 / 2);
                    if (field379 > -1) {
                        if (var29 == 1) {
                            field398 -= 20;
                        }
                        if (var29 == 2) {
                            field379 -= 15;
                            field398 -= 10;
                        }
                        if (var29 == 3) {
                            field379 += 15;
                            field398 -= 10;
                        }
                        Object var36 = null;
                        Object var37 = null;
                        Object var38 = null;
                        Object var39 = null;
                        int var40 = 0;
                        int var41 = 0;
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        class82 var48 = null;
                        class82 var49 = null;
                        class82 var50 = null;
                        class82 var51 = null;
                        int var52 = 0;
                        int var53 = 0;
                        int var54 = 0;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        class82 var61 = var32.method1029();
                        if (var61 != null) {
                            var40 = var61.field1477;
                            int var62 = var61.field1481;
                            if (var62 > var60) {
                                var60 = var62;
                            }
                            var44 = var61.field1479;
                        }
                        class82 var63 = var32.method1025();
                        if (var63 != null) {
                            var41 = var63.field1477;
                            int var64 = var63.field1481;
                            if (var64 > var60) {
                                var60 = var64;
                            }
                            var45 = var63.field1479;
                        }
                        class82 var65 = var32.method1030();
                        if (var65 != null) {
                            var42 = var65.field1477;
                            int var66 = var65.field1481;
                            if (var66 > var60) {
                                var60 = var66;
                            }
                            var46 = var65.field1479;
                        }
                        class82 var67 = var32.method1031();
                        if (var67 != null) {
                            var43 = var67.field1477;
                            int var68 = var67.field1481;
                            if (var68 > var60) {
                                var60 = var68;
                            }
                            var47 = var67.field1479;
                        }
                        if (var35 != null) {
                            var48 = var35.method1029();
                            if (var48 != null) {
                                var52 = var48.field1477;
                                int var69 = var48.field1481;
                                if (var69 > var60) {
                                    var60 = var69;
                                }
                                var56 = var48.field1479;
                            }
                            var49 = var35.method1025();
                            if (var49 != null) {
                                var53 = var49.field1477;
                                int var70 = var49.field1481;
                                if (var70 > var60) {
                                    var60 = var70;
                                }
                                var57 = var49.field1479;
                            }
                            var50 = var35.method1030();
                            if (var50 != null) {
                                var54 = var50.field1477;
                                int var71 = var50.field1481;
                                if (var71 > var60) {
                                    var60 = var71;
                                }
                                var58 = var50.field1479;
                            }
                            var51 = var35.method1031();
                            if (var51 != null) {
                                var55 = var51.field1477;
                                int var72 = var51.field1481;
                                if (var72 > var60) {
                                    var60 = var72;
                                }
                                var59 = var51.field1479;
                            }
                        }
                        class228 var73 = var32.method1056();
                        if (var73 == null) {
                            var73 = Statics.field172;
                        }
                        class228 var74;
                        if (var35 == null) {
                            var74 = Statics.field172;
                        } else {
                            var74 = var35.method1056();
                            if (var74 == null) {
                                var74 = Statics.field172;
                            }
                        }
                        Object var75 = null;
                        String var76 = null;
                        boolean var77 = false;
                        int var78 = 0;
                        String var79 = var32.method1027(arg0.field849[var29]);
                        int var80 = var73.method3833(var79);
                        if (var35 != null) {
                            var76 = var35.method1027(arg0.field855[var29]);
                            var78 = var74.method3833(var76);
                        }
                        int var81 = 0;
                        int var82 = 0;
                        if (var41 > 0) {
                            if (var65 == null && var67 == null) {
                                var81 = 1;
                            } else {
                                var81 = var80 / var41 + 1;
                            }
                        }
                        if (var35 != null && var53 > 0) {
                            if (var50 == null && var51 == null) {
                                var82 = 1;
                            } else {
                                var82 = var78 / var53 + 1;
                            }
                        }
                        int var83 = 0;
                        int var84 = var83;
                        if (var40 > 0) {
                            var83 += var40;
                        }
                        var83 += 2;
                        int var85 = var83;
                        if (var42 > 0) {
                            var83 += var42;
                        }
                        int var86 = var83;
                        int var87 = var83;
                        int var89;
                        if (var41 > 0) {
                            int var88 = var41 * var81;
                            var89 = var83 + var88;
                            var87 = (var88 - var80) / 2 + var83;
                        } else {
                            var89 = var80 + var83;
                        }
                        int var90 = var89;
                        if (var43 > 0) {
                            var89 += var43;
                        }
                        int var91 = 0;
                        int var92 = 0;
                        int var93 = 0;
                        int var94 = 0;
                        int var95 = 0;
                        if (var35 != null) {
                            var89 += 2;
                            var91 = var89;
                            if (var52 > 0) {
                                var89 += var52;
                            }
                            var89 += 2;
                            var92 = var89;
                            if (var54 > 0) {
                                var89 += var54;
                            }
                            var93 = var89;
                            var95 = var89;
                            if (var53 > 0) {
                                int var96 = var53 * var82;
                                var89 += var96;
                                var95 += (var96 - var78) / 2;
                            } else {
                                var89 += var78;
                            }
                            var94 = var89;
                            if (var55 > 0) {
                                var89 += var55;
                            }
                        }
                        int var97 = arg0.field846[var29] - field283;
                        int var98 = var32.field1134 - var32.field1134 * var97 / var32.field1128;
                        int var99 = var32.field1122 * var97 / var32.field1128 + -var32.field1122;
                        int var100 = field379 + arg2 - (var89 >> 1) + var98;
                        int var101 = field398 + arg3 - 12 + var99;
                        int var102 = var101;
                        int var103 = var60 + var101;
                        int var104 = var32.field1131 + var101 + 15;
                        int var105 = var104 - var73.field3235;
                        int var106 = var73.field3241 + var104;
                        if (var105 < var101) {
                            var102 = var105;
                        }
                        if (var106 > var103) {
                            var103 = var106;
                        }
                        int var107 = 0;
                        if (var35 != null) {
                            var107 = var35.field1131 + var101 + 15;
                            int var108 = var107 - var74.field3235;
                            int var109 = var74.field3241 + var107;
                            if (var108 < var102) {
                                ;
                            }
                            if (var109 > var103) {
                                ;
                            }
                        }
                        int var112 = 255;
                        if (var32.field1135 >= 0) {
                            var112 = (var97 << 8) / (var32.field1128 - var32.field1135);
                        }
                        if (var112 >= 0 && var112 < 255) {
                            if (var61 != null) {
                                var61.method1689(var84 + var100 - var44, var101, var112);
                            }
                            if (var65 != null) {
                                var65.method1689(var85 + var100 - var46, var101, var112);
                            }
                            if (var63 != null) {
                                for (int var113 = 0; var113 < var81; var113++) {
                                    var63.method1689(var41 * var113 + (var86 + var100 - var45), var101, var112);
                                }
                            }
                            if (var67 != null) {
                                var67.method1689(var90 + var100 - var47, var101, var112);
                            }
                            var73.method3839(var79, var87 + var100, var104, var32.field1127, 0, var112);
                            if (var35 != null) {
                                if (var48 != null) {
                                    var48.method1689(var91 + var100 - var56, var101, var112);
                                }
                                if (var50 != null) {
                                    var50.method1689(var92 + var100 - var58, var101, var112);
                                }
                                if (var49 != null) {
                                    for (int var114 = 0; var114 < var82; var114++) {
                                        var49.method1689(var53 * var114 + (var93 + var100 - var57), var101, var112);
                                    }
                                }
                                if (var51 != null) {
                                    var51.method1689(var94 + var100 - var59, var101, var112);
                                }
                                var74.method3839(var76, var95 + var100, var107, var35.field1127, 0, var112);
                            }
                        } else {
                            if (var61 != null) {
                                var61.method1692(var84 + var100 - var44, var101);
                            }
                            if (var65 != null) {
                                var65.method1692(var85 + var100 - var46, var101);
                            }
                            if (var63 != null) {
                                for (int var115 = 0; var115 < var81; var115++) {
                                    var63.method1692(var41 * var115 + (var86 + var100 - var45), var101);
                                }
                            }
                            if (var67 != null) {
                                var67.method1692(var90 + var100 - var47, var101);
                            }
                            var73.method3838(var79, var87 + var100, var104, var32.field1127 | 0xFF000000, 0);
                            if (var35 != null) {
                                if (var48 != null) {
                                    var48.method1692(var91 + var100 - var56, var101);
                                }
                                if (var50 != null) {
                                    var50.method1692(var92 + var100 - var58, var101);
                                }
                                if (var49 != null) {
                                    for (int var116 = 0; var116 < var82; var116++) {
                                        var49.method1692(var53 * var116 + (var93 + var100 - var57), var101);
                                    }
                                }
                                if (var51 != null) {
                                    var51.method1692(var94 + var100 - var59, var101);
                                }
                                var74.method3838(var76, var95 + var100, var107, var35.field1127 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.ak(I)V")
    public static final void method11() {
        field393 = 0;
        int var0 = (Statics.field2011.field865 >> 7) + Statics.field839;
        int var1 = (Statics.field2011.field832 >> 7) + Statics.field185;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field393 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field393 = 1;
        }
        if (field393 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field393 = 0;
        }
    }

    @ObfuscatedName("cp.ae(IIIII)V")
    public static final void method2134(int arg0, int arg1, int arg2, int arg3) {
        if (field384 == 1) {
            Statics.field162[field424 / 100].method1692(field381 - 8, field352 - 8);
        }
        if (field384 == 2) {
            Statics.field162[field424 / 100 + 4].method1692(field381 - 8, field352 - 8);
        }
        method11();
    }

    @ObfuscatedName("o.br(Law;IB)V")
    public static final void method38(class40 arg0, int arg1) {
        method786(arg0.field865, arg0.field832, arg1);
    }

    @ObfuscatedName("ah.bi(IIII)V")
    public static final void method786(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field379 = -1;
            field398 = -1;
            return;
        }
        int var3 = method154(arg0, arg1, Statics.field1120) - arg2;
        int var4 = arg0 - Statics.field145;
        int var5 = var3 - Statics.field623;
        int var6 = arg1 - Statics.field1257;
        int var7 = class95.field1661[Statics.field718];
        int var8 = class95.field1662[Statics.field718];
        int var9 = class95.field1661[Statics.field156];
        int var10 = class95.field1662[Statics.field156];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field379 = field537 * var11 / var15 + field535 / 2;
            field398 = field537 * var14 / var15 + field365 / 2;
        } else {
            field379 = -1;
            field398 = -1;
        }
    }

    @ObfuscatedName("s.bx(IIIB)I")
    public static final int method154(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field79[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field78[var5][var3][var4] + class6.field78[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field78[var5][var3][var4 + 1] + class6.field78[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ag.bs(ZI)V")
    public static final void method979(boolean arg0) {
        field333 = arg0;
        if (!field333) {
            int var1 = field316.method2450();
            int var2 = field316.method2450();
            int var3 = field316.method2548();
            Statics.field331 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field331[var4][var5] = field316.method2419();
                }
            }
            Statics.field2055 = new int[var3];
            Statics.field1296 = new int[var3];
            Statics.field2252 = new int[var3];
            Statics.field1467 = new byte[var3][];
            Statics.field633 = new byte[var3][];
            boolean var6 = false;
            if ((var1 / 8 == 48 || var1 / 8 == 49) && var2 / 8 == 48) {
                var6 = true;
            }
            if (var1 / 8 == 48 && var2 / 8 == 148) {
                var6 = true;
            }
            int var7 = 0;
            for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    if (!var6 || var9 != 49 && var9 != 149 && var9 != 147 && var8 != 50 && (var8 != 49 || var9 != 47)) {
                        Statics.field2055[var7] = var10;
                        Statics.field1296[var7] = Statics.field2098.method3101("m" + var8 + "_" + var9);
                        Statics.field2252[var7] = Statics.field2098.method3101("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method1076(var1, var2);
            return;
        }
        int var11 = field316.method2497();
        int var12 = field316.method2497();
        int var13 = field316.method2548();
        field316.method2641();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field316.method2655(1);
                    if (var17 == 1) {
                        field334[var14][var15][var16] = field316.method2655(26);
                    } else {
                        field334[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field316.method2642();
        Statics.field331 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field331[var18][var19] = field316.method2419();
            }
        }
        Statics.field2055 = new int[var13];
        Statics.field1296 = new int[var13];
        Statics.field2252 = new int[var13];
        Statics.field1467 = new byte[var13][];
        Statics.field633 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field334[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field2055[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field2055[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field1296[var20] = Statics.field2098.method3101("m" + var29 + "_" + var30);
                            Statics.field2252[var20] = Statics.field2098.method3101("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method1076(var11, var12);
    }

    @ObfuscatedName("br.bt(III)V")
    public static final void method1076(int arg0, int arg1) {
        if (Statics.field150 == arg0 && Statics.field804 == arg1) {
            return;
        }
        Statics.field150 = arg0;
        Statics.field804 = arg1;
        method3191(25);
        method166(class161.field2376, true);
        int var2 = Statics.field839;
        int var3 = Statics.field185;
        Statics.field839 = (arg0 - 6) * 8;
        Statics.field185 = (arg1 - 6) * 8;
        int var4 = Statics.field839 - var2;
        int var5 = Statics.field185 - var3;
        int var6 = Statics.field839;
        int var7 = Statics.field185;
        for (int var8 = 0; var8 < 32768; var8++) {
            class37 var9 = field309[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field886[var10] -= var4;
                    var9.field887[var10] -= var5;
                }
                var9.field865 -= var4 * 128;
                var9.field832 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field394[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field886[var13] -= var4;
                    var12.field887[var13] -= var5;
                }
                var12.field865 -= var4 * 128;
                var12.field832 -= var5 * 128;
            }
        }
        byte var14 = 0;
        byte var15 = 104;
        byte var16 = 1;
        if (var4 < 0) {
            var14 = 103;
            var15 = -1;
            var16 = -1;
        }
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var5 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var21 = var17; var21 != var18; var21 += var19) {
                int var22 = var4 + var20;
                int var23 = var5 + var21;
                for (int var24 = 0; var24 < 4; var24++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                        field404[var24][var20][var21] = field404[var24][var22][var23];
                    } else {
                        field404[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field370.method3621(); var25 != null; var25 = (class17) field370.method3630()) {
            var25.field210 -= var4;
            var25.field211 -= var5;
            if (var25.field210 < 0 || var25.field211 < 0 || var25.field210 >= 104 || var25.field211 >= 104) {
                var25.method3729();
            }
        }
        if (field505 != 0) {
            field505 -= var4;
            field465 -= var5;
        }
        field275 = 0;
        field519 = false;
        field411 = -1;
        field407.method3632();
        field406.method3632();
        for (int var26 = 0; var26 < 4; var26++) {
            field332[var26].method2325();
        }
    }

    @ObfuscatedName("cn.bh(ZI)V")
    public static final void method2033(boolean arg0) {
        method544();
        field363++;
        if (field363 < 50 && !arg0) {
            return;
        }
        field363 = 0;
        if (field325 || Statics.field830 == null) {
            return;
        }
        field314.method2639(132);
        try {
            Statics.field830.method2874(field314.field2048, 0, field314.field2046);
            field314.field2046 = 0;
        } catch (IOException var2) {
            field325 = true;
        }
    }

    @ObfuscatedName("el.be(IIIIIS)V")
    public static final void method2983(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field92.method1895(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field92.method1898(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field562.field1487;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class43 var13 = class43.method96(var12);
            if (var13.field962 == -1) {
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
                class84 var14 = Statics.field2311[var13.field962];
                if (var14 != null) {
                    int var15 = (var13.field977 * 4 - var14.field1501) / 2;
                    int var16 = (var13.field981 * 4 - var14.field1498) / 2;
                    var14.method1838(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field981) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field92.method2007(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field92.method1898(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class43 var22 = class43.method96(var21);
            if (var22.field962 != -1) {
                class84 var23 = Statics.field2311[var22.field962];
                if (var23 != null) {
                    int var24 = (var22.field977 * 4 - var23.field1501) / 2;
                    int var25 = (var22.field981 * 4 - var23.field1498) / 2;
                    var23.method1838(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field981) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field562.field1487;
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
        int var29 = Statics.field92.method1897(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class43 var31 = class43.method96(var30);
        if (var31.field962 == -1) {
            return;
        }
        class84 var32 = Statics.field2311[var31.field962];
        if (var32 != null) {
            int var33 = (var31.field977 * 4 - var32.field1501) / 2;
            int var34 = (var31.field981 * 4 - var32.field1498) / 2;
            var32.method1838(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field981) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("d.bq(I)Z")
    public static final boolean method185() {
        if (Statics.field830 == null) {
            return false;
        }
        try {
            int var0 = Statics.field830.method2873();
            if (var0 == 0) {
                return false;
            }
            if (field318 == -1) {
                Statics.field830.method2890(field316.field2048, 0, 1);
                field316.field2046 = 0;
                field318 = field316.method2647();
                field284 = class192.field3083[field318];
                var0--;
            }
            if (field284 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field830.method2890(field316.field2048, 0, 1);
                field284 = field316.field2048[0] & 0xFF;
                var0--;
            }
            if (field284 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field830.method2890(field316.field2048, 0, 2);
                field316.field2046 = 0;
                field284 = field316.method2548();
                var0 -= 2;
            }
            if (var0 < field284) {
                return false;
            }
            field316.field2046 = 0;
            Statics.field830.method2890(field316.field2048, 0, field284);
            field319 = 0;
            field291 = field322;
            field322 = field321;
            field321 = field318;
            if (field318 == 212) {
                class35.method150(field316, field284);
                field318 = -1;
                return true;
            }
            if (field318 == 52) {
                method45();
                int var1 = field316.method2440();
                int var2 = field316.method2398();
                int var3 = field316.method2544();
                field470[var2] = var3;
                field408[var2] = var1;
                field409[var2] = 1;
                for (int var4 = 0; var4 < 98; var4++) {
                    if (var3 >= class159.field2352[var4]) {
                        field409[var2] = var4 + 2;
                    }
                }
                field542[++field462 - 1 & 0x1F] = var2;
                field318 = -1;
                return true;
            }
            if (field318 == 199) {
                int var5 = field316.method2450();
                if (var5 == 65535) {
                    var5 = -1;
                }
                method639(var5);
                field318 = -1;
                return true;
            }
            if (field318 == 86) {
                int var6 = field316.method2497();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field316.method2452();
                method2118(var6, var7);
                field318 = -1;
                return true;
            }
            if (field318 == 117) {
                int var8 = field316.method2544();
                int var9 = field316.method2450();
                class177 var10 = class177.method701(var8);
                if (var10.field2787 != 2 || var10.field2840 != var9) {
                    var10.field2787 = 2;
                    var10.field2840 = var9;
                    method2034(var10);
                }
                field318 = -1;
                return true;
            }
            if (field318 == 133) {
                method979(true);
                field316.method2647();
                int var11 = field316.method2548();
                class35.method150(field316, var11);
                field318 = -1;
                return true;
            }
            if (field318 == 239) {
                class28 var12 = new class28();
                var12.field655 = field316.method2422();
                var12.field651 = field316.method2548();
                int var13 = field316.method2419();
                var12.field652 = var13;
                method3191(45);
                Statics.field830.method2879();
                Statics.field830 = null;
                class34.method2869(var12);
                field318 = -1;
                return false;
            }
            if (field318 == 69) {
                int var14 = field316.method2419();
                class4 var15 = (class4) field536.method3595((long) var14);
                if (var15 != null) {
                    method2837(var15, true);
                }
                if (field403 != null) {
                    method2034(field403);
                    field403 = null;
                }
                field318 = -1;
                return true;
            }
            if (field318 == 3) {
                int var16 = field316.method2419();
                class177 var17 = class177.method701(var16);
                var17.field2787 = 3;
                var17.field2840 = Statics.field2011.field51.method3321();
                method2034(var17);
                field318 = -1;
                return true;
            }
            if (field318 == 148) {
                int var18 = field316.method2488();
                int var19 = field316.method2458();
                class4 var20 = (class4) field536.method3595((long) var19);
                class4 var21 = (class4) field536.method3595((long) var18);
                if (var21 != null) {
                    method2837(var21, var20 == null || var20.field67 != var21.field67);
                }
                if (var20 != null) {
                    var20.method3729();
                    field536.method3588(var20, (long) var18);
                }
                class177 var22 = class177.method701(var19);
                if (var22 != null) {
                    method2034(var22);
                }
                class177 var23 = class177.method701(var18);
                if (var23 != null) {
                    method2034(var23);
                    method542(Statics.field2815[var23.field2796 >>> 16], var23, true);
                }
                if (field431 != -1) {
                    method3278(field431, 1);
                }
                field318 = -1;
                return true;
            }
            if (field318 == 87) {
                int var24 = field316.method2488();
                int var25 = field316.method2448();
                int var26 = field316.method2398();
                class4 var27 = (class4) field536.method3595((long) var24);
                if (var27 != null) {
                    method2837(var27, var27.field67 != var25);
                }
                method567(var24, var25, var26);
                field318 = -1;
                return true;
            }
            if (field318 == 33) {
                field405 = field456;
                if (field284 == 0) {
                    field498 = null;
                    field499 = null;
                    Statics.field2301 = 0;
                    Statics.field237 = null;
                    field318 = -1;
                    return true;
                }
                field499 = field316.method2422();
                long var28 = field316.method2420();
                long var30 = var28;
                String var32;
                if (var28 <= 0L || var28 >= 6582952005840035281L) {
                    var32 = null;
                } else if (var28 % 37L == 0L) {
                    var32 = null;
                } else {
                    int var33 = 0;
                    for (long var34 = var28; var34 != 0L; var34 /= 37L) {
                        var33++;
                    }
                    StringBuilder var36 = new StringBuilder(var33);
                    while (var30 != 0L) {
                        long var37 = var30;
                        var30 /= 37L;
                        var36.append(class166.field2708[(int) (var37 - var30 * 37L)]);
                    }
                    var32 = var36.reverse().toString();
                }
                field498 = var32;
                Statics.field2063 = field316.method2415();
                int var39 = field316.method2398();
                if (var39 == 255) {
                    field318 = -1;
                    return true;
                }
                Statics.field2301 = var39;
                class26[] var40 = new class26[100];
                for (int var41 = 0; var41 < Statics.field2301; var41++) {
                    var40[var41] = new class26();
                    var40[var41].field632 = field316.method2422();
                    var40[var41].field630 = class168.method570(var40[var41].field632, Statics.field2118);
                    var40[var41].field631 = field316.method2548();
                    var40[var41].field635 = field316.method2415();
                    field316.method2422();
                    if (var40[var41].field632.equals(Statics.field2011.field44)) {
                        Statics.field182 = var40[var41].field635;
                    }
                }
                boolean var42 = false;
                int var43 = Statics.field2301;
                while (var43 > 0) {
                    boolean var44 = true;
                    var43--;
                    for (int var45 = 0; var45 < var43; var45++) {
                        if (var40[var45].field630.compareTo(var40[var45 + 1].field630) > 0) {
                            class26 var46 = var40[var45];
                            var40[var45] = var40[var45 + 1];
                            var40[var45 + 1] = var46;
                            var44 = false;
                        }
                    }
                    if (var44) {
                        break;
                    }
                }
                Statics.field237 = var40;
                field318 = -1;
                return true;
            }
            if (field318 == 244) {
                Statics.field32 = field316.method2596();
                Statics.field688 = field316.method2596();
                while (field316.field2046 < field284) {
                    field318 = field316.method2398();
                    method708();
                }
                field318 = -1;
                return true;
            }
            if (field318 == 217) {
                int var47 = field316.method2450();
                int var48 = field316.method2448();
                int var49 = field316.method2544();
                class177 var50 = class177.method701(var49);
                var50.field2846 = (var47 << 16) + var48;
                field318 = -1;
                return true;
            }
            if (field318 == 229) {
                field316.field2046 += 28;
                if (field316.method2436()) {
                    class126 var51 = field316;
                    int var52 = field316.field2046 - 28;
                    if (class153.field2296 != null) {
                        try {
                            class153.field2296.method3958(0L);
                            class153.field2296.method3972(var51.field2048, var52, 24);
                        } catch (Exception var295) {
                        }
                    }
                }
                field318 = -1;
                return true;
            }
            if (field318 == 48) {
                Statics.field1536 = class134.method1861(field316.method2398());
                field318 = -1;
                return true;
            }
            if (field318 == 55) {
                field519 = true;
                Statics.field1114 = field316.method2398();
                Statics.field124 = field316.method2398();
                Statics.field2087 = field316.method2548();
                Statics.field264 = field316.method2398();
                Statics.field561 = field316.method2398();
                if (Statics.field561 >= 100) {
                    Statics.field145 = Statics.field1114 * 128 + 64;
                    Statics.field1257 = Statics.field124 * 128 + 64;
                    Statics.field623 = method154(Statics.field145, Statics.field1257, Statics.field1120) - Statics.field2087;
                }
                field318 = -1;
                return true;
            }
            if (field318 == 204) {
                for (int var54 = 0; var54 < field394.length; var54++) {
                    if (field394[var54] != null) {
                        field394[var54].field885 = -1;
                    }
                }
                for (int var55 = 0; var55 < field309.length; var55++) {
                    if (field309[var55] != null) {
                        field309[var55].field885 = -1;
                    }
                }
                field318 = -1;
                return true;
            }
            if (field318 == 198) {
                field505 = field316.method2398();
                if (field505 == 255) {
                    field505 = 0;
                }
                field465 = field316.method2398();
                if (field465 == 255) {
                    field465 = 0;
                }
                field318 = -1;
                return true;
            }
            if (field318 == 159) {
                int var56 = field316.method2417();
                int var57 = field316.method2544();
                int var58 = field316.method2417();
                class177 var59 = class177.method701(var57);
                if (var59.field2817 != var58 || var59.field2806 != var56 || var59.field2801 != 0 || var59.field2910 != 0) {
                    var59.field2817 = var58;
                    var59.field2806 = var56;
                    var59.field2801 = 0;
                    var59.field2910 = 0;
                    method2034(var59);
                    method152(var59);
                    if (var59.field2930 == 0) {
                        method542(Statics.field2815[var57 >> 16], var59, false);
                    }
                }
                field318 = -1;
                return true;
            }
            if (field318 == 90) {
                int var60 = field316.method2419();
                int var61 = field316.method2548();
                if (var60 < -70000) {
                    var61 += 32768;
                }
                class177 var62;
                if (var60 >= 0) {
                    var62 = class177.method701(var60);
                } else {
                    var62 = null;
                }
                while (field316.field2046 < field284) {
                    int var63 = field316.method2427();
                    int var64 = field316.method2548();
                    int var65 = 0;
                    if (var64 != 0) {
                        var65 = field316.method2398();
                        if (var65 == 255) {
                            var65 = field316.method2419();
                        }
                    }
                    if (var62 != null && var63 >= 0 && var63 < var62.field2870.length) {
                        var62.field2870[var63] = var64;
                        var62.field2831[var63] = var65;
                    }
                    class16.method153(var61, var63, var64 - 1, var65);
                }
                if (var62 != null) {
                    method2034(var62);
                }
                method45();
                field459[++field458 - 1 & 0x1F] = var61 & 0x7FFF;
                field318 = -1;
                return true;
            }
            if (field318 == 220) {
                class35.field778 = 0;
                for (int var66 = 0; var66 < 2048; var66++) {
                    class35.field776[var66] = null;
                    class35.field774[var66] = 1;
                }
                for (int var67 = 0; var67 < 2048; var67++) {
                    field394[var67] = null;
                }
                class35.method2332(field316);
                field318 = -1;
                return true;
            }
            if (field318 == 221) {
                int var68 = field316.method2419();
                int var69 = field316.method2419();
                if (Statics.field548 == null || !Statics.field548.isValid()) {
                    try {
                        Iterator var70 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var70.hasNext()) {
                            GarbageCollectorMXBean var71 = (GarbageCollectorMXBean) var70.next();
                            if (var71.isValid()) {
                                Statics.field548 = var71;
                                field270 = -1L;
                                field336 = -1L;
                            }
                        }
                    } catch (Throwable var296) {
                    }
                }
                long var73 = class119.method3544();
                int var75 = -1;
                if (Statics.field548 != null) {
                    long var76 = Statics.field548.getCollectionTime();
                    if (field336 != -1L) {
                        long var78 = var76 - field336;
                        long var80 = var73 - field270;
                        if (var80 != 0L) {
                            var75 = (int) (var78 * 100L / var80);
                        }
                    }
                    field336 = var76;
                    field270 = var73;
                }
                field314.method2639(86);
                field314.method2571(var68);
                field314.method2565(var69);
                field314.method2437(var75);
                field314.method2437(field2260);
                field318 = -1;
                return true;
            }
            if (field318 == 30) {
                while (field316.field2046 < field284) {
                    boolean var82 = field316.method2398() == 1;
                    String var83 = field316.method2422();
                    String var84 = field316.method2422();
                    int var85 = field316.method2548();
                    int var86 = field316.method2398();
                    int var87 = field316.method2398();
                    boolean var88 = (var87 & 0x2) != 0;
                    boolean var89 = (var87 & 0x1) != 0;
                    if (var85 > 0) {
                        field316.method2422();
                        field316.method2398();
                        field316.method2419();
                    }
                    field316.method2422();
                    for (int var90 = 0; var90 < field538; var90++) {
                        class18 var91 = field274[var90];
                        if (var82) {
                            if (var84.equals(var91.field230)) {
                                var91.field230 = var83;
                                var91.field225 = var84;
                                var83 = null;
                                break;
                            }
                        } else if (var83.equals(var91.field230)) {
                            if (var91.field224 != var85) {
                                boolean var92 = true;
                                for (class41 var93 = (class41) field402.method3580(); var93 != null; var93 = (class41) field402.method3581()) {
                                    if (var93.field895.equals(var83)) {
                                        if (var85 != 0 && var93.field899 == 0) {
                                            var93.method3723();
                                            var92 = false;
                                        } else if (var85 == 0 && var93.field899 != 0) {
                                            var93.method3723();
                                            var92 = false;
                                        }
                                    }
                                }
                                if (var92) {
                                    field402.method3584(new class41(var83, var85));
                                }
                                var91.field224 = var85;
                            }
                            var91.field225 = var84;
                            var91.field227 = var86;
                            var91.field228 = var88;
                            var91.field229 = var89;
                            var83 = null;
                            break;
                        }
                    }
                    if (var83 != null && field538 < 400) {
                        class18 var94 = new class18();
                        field274[field538] = var94;
                        var94.field230 = var83;
                        var94.field225 = var84;
                        var94.field224 = var85;
                        var94.field227 = var86;
                        var94.field228 = var88;
                        var94.field229 = var89;
                        field538++;
                    }
                }
                field539 = 2;
                field549 = field456;
                boolean var95 = false;
                int var96 = field538;
                while (var96 > 0) {
                    boolean var97 = true;
                    var96--;
                    for (int var98 = 0; var98 < var96; var98++) {
                        boolean var99 = false;
                        class18 var100 = field274[var98];
                        class18 var101 = field274[var98 + 1];
                        if (field273 != var100.field224 && field273 == var101.field224) {
                            var99 = true;
                        }
                        if (!var99 && var100.field224 == 0 && var101.field224 != 0) {
                            var99 = true;
                        }
                        if (!var99 && !var100.field228 && var101.field228) {
                            var99 = true;
                        }
                        if (!var99 && !var100.field229 && var101.field229) {
                            var99 = true;
                        }
                        if (var99) {
                            class18 var102 = field274[var98];
                            field274[var98] = field274[var98 + 1];
                            field274[var98 + 1] = var102;
                            var97 = false;
                        }
                    }
                    if (var97) {
                        break;
                    }
                }
                field318 = -1;
                return true;
            }
            if (field318 == 89) {
                method45();
                field436 = field316.method2398();
                field468 = field456;
                field318 = -1;
                return true;
            }
            if (field318 == 155) {
                for (int var103 = 0; var103 < class180.field2950.length; var103++) {
                    if (class180.field2951[var103] != class180.field2950[var103]) {
                        class180.field2950[var103] = class180.field2951[var103];
                        method37(var103);
                        field457[++field285 - 1 & 0x1F] = var103;
                    }
                }
                field318 = -1;
                return true;
            }
            if (field318 == 246) {
                Statics.field32 = field316.method2596();
                Statics.field688 = field316.method2440();
                field318 = -1;
                return true;
            }
            if (field318 == 20) {
                String var104 = field316.method2422();
                Statics.field1840 = var104;
                try {
                    String var105 = Statics.field271.getParameter(class194.field3113.field3112);
                    String var106 = Statics.field271.getParameter(class194.field3114.field3112);
                    String var107 = var105 + "settings=" + var104 + "; version=1; path=/; domain=" + var106;
                    String var108;
                    if (var104.length() == 0) {
                        var108 = var107 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var109 = var107 + "; Expires=";
                        long var110 = class119.method3544() + 94608000000L;
                        class115.field2009.setTime(new Date(var110));
                        int var112 = class115.field2009.get(7);
                        int var113 = class115.field2009.get(5);
                        int var114 = class115.field2009.get(2);
                        int var115 = class115.field2009.get(1);
                        int var116 = class115.field2009.get(11);
                        int var117 = class115.field2009.get(12);
                        int var118 = class115.field2009.get(13);
                        String var119 = class115.field2008[var112 - 1] + ", " + var113 / 10 + var113 % 10 + "-" + class115.field2010[0][var114] + "-" + var115 + " " + var116 / 10 + var116 % 10 + ":" + var117 / 10 + var117 % 10 + ":" + var118 / 10 + var118 % 10 + " GMT";
                        var108 = var109 + var119 + "; Max-Age=" + 94608000L;
                    }
                    Statics.method2739(Statics.field271, "document.cookie=\"" + var108 + "\"");
                } catch (Throwable var294) {
                }
                field318 = -1;
                return true;
            }
            if (field318 == 151) {
                int var121 = field316.method2450();
                byte var122 = field316.method2415();
                class180.field2951[var121] = var122;
                if (class180.field2950[var121] != var122) {
                    class180.field2950[var121] = var122;
                }
                method37(var121);
                field457[++field285 - 1 & 0x1F] = var121;
                field318 = -1;
                return true;
            }
            if (field318 == 49) {
                int var123 = field316.method2419();
                int var124 = field316.method2417();
                class177 var125 = class177.method701(var123);
                if (var125.field2832 != var124 || var124 == -1) {
                    var125.field2832 = var124;
                    var125.field2918 = 0;
                    var125.field2865 = 0;
                    method2034(var125);
                }
                field318 = -1;
                return true;
            }
            if (field318 == 234) {
                int var126 = field316.method2548();
                int var127 = field316.method2398();
                int var128 = field316.method2548();
                if (field511 != 0 && var127 != 0 && field275 < 50) {
                    field514[field275] = var126;
                    field347[field275] = var127;
                    field435[field275] = var128;
                    field451[field275] = null;
                    field289[field275] = 0;
                    field275++;
                }
                field318 = -1;
                return true;
            }
            if (field318 == 134) {
                String var132 = field316.method2422();
                String var133 = class227.method3837(class167.method1059(class226.method3820(field316)));
                class12.method1270(6, var132, var133);
                field318 = -1;
                return true;
            }
            if (field318 == 196) {
                int var134 = field316.method2448();
                int var135 = field316.method2544();
                int var136 = field316.method2448();
                int var137 = field316.method2448();
                class177 var138 = class177.method701(var135);
                if (var138.field2854 != var137 || var138.field2848 != var136 || var138.field2821 != var134) {
                    var138.field2854 = var137;
                    var138.field2848 = var136;
                    var138.field2821 = var134;
                    method2034(var138);
                }
                field318 = -1;
                return true;
            }
            if (field318 == 137) {
                class215.method3216(field316, field284);
                field318 = -1;
                return true;
            }
            if (field318 == 162) {
                field290 = field316.method2450() * 30;
                field468 = field456;
                field318 = -1;
                return true;
            }
            if (field318 == 152) {
                String var139 = field316.method2422();
                long var140 = field316.method2420();
                long var142 = (long) field316.method2548();
                long var144 = (long) field316.method2418();
                class156 var146 = (class156) class113.method78(class156.method2835(), field316.method2398());
                long var147 = (var142 << 32) + var144;
                boolean var149 = false;
                for (int var150 = 0; var150 < 100; var150++) {
                    if (field527[var150] == var147) {
                        var149 = true;
                        break;
                    }
                }
                if (var146.field2320 && method1084(var139)) {
                    var149 = true;
                }
                if (!var149 && field393 == 0) {
                    field527[field493] = var147;
                    field493 = (field493 + 1) % 100;
                    String var151 = class227.method3837(class167.method1059(class226.method3820(field316)));
                    if (var146.field2324 == -1) {
                        class12.method571(9, var139, var151, class166.method1217(var140));
                    } else {
                        int var152 = var146.field2324;
                        String var153 = "<img=" + var152 + ">";
                        class12.method571(9, var153 + var139, var151, class166.method1217(var140));
                    }
                }
                field318 = -1;
                return true;
            }
            if (field318 == 58) {
                method979(false);
                field316.method2647();
                int var154 = field316.method2548();
                class35.method150(field316, var154);
                field318 = -1;
                return true;
            }
            if (field318 == 79) {
                int var155 = field316.method2488();
                class177 var156 = class177.method701(var155);
                for (int var157 = 0; var157 < var156.field2870.length; var157++) {
                    var156.field2870[var157] = -1;
                    var156.field2870[var157] = 0;
                }
                method2034(var156);
                field318 = -1;
                return true;
            }
            if (field318 == 238) {
                int var158 = field316.method2398();
                int var159 = field316.method2398();
                int var160 = field316.method2398();
                int var161 = field316.method2398();
                field520[var158] = true;
                field521[var158] = var159;
                field492[var158] = var160;
                field523[var158] = var161;
                field524[var158] = 0;
                field318 = -1;
                return true;
            }
            if (field318 == 112) {
                int var162 = field316.method2458();
                String var163 = field316.method2422();
                class177 var164 = class177.method701(var162);
                if (!var163.equals(var164.field2856)) {
                    var164.field2856 = var163;
                    method2034(var164);
                }
                field318 = -1;
                return true;
            }
            if (field318 == 23) {
                int var165 = field316.method2497();
                class16.method2687(var165);
                field459[++field458 - 1 & 0x1F] = var165 & 0x7FFF;
                field318 = -1;
                return true;
            }
            if (field318 == 181) {
                while (field316.field2046 < field284) {
                    int var166 = field316.method2398();
                    boolean var167 = (var166 & 0x1) == 1;
                    String var168 = field316.method2422();
                    String var169 = field316.method2422();
                    field316.method2422();
                    for (int var170 = 0; var170 < field544; var170++) {
                        class8 var171 = field385[var170];
                        if (var167) {
                            if (var169.equals(var171.field121)) {
                                var171.field121 = var168;
                                var171.field123 = var169;
                                var168 = null;
                                break;
                            }
                        } else if (var168.equals(var171.field121)) {
                            var171.field121 = var168;
                            var171.field123 = var169;
                            var168 = null;
                            break;
                        }
                    }
                    if (var168 != null && field544 < 400) {
                        class8 var172 = new class8();
                        field385[field544] = var172;
                        var172.field121 = var168;
                        var172.field123 = var169;
                        field544++;
                    }
                }
                field549 = field456;
                field318 = -1;
                return true;
            }
            if (field318 == 228) {
                int var173 = field316.method2548();
                int var174 = field316.method2488();
                class180.field2951[var173] = var174;
                if (class180.field2950[var173] != var174) {
                    class180.field2950[var173] = var174;
                }
                method37(var173);
                field457[++field285 - 1 & 0x1F] = var173;
                field318 = -1;
                return true;
            }
            if (field318 == 211) {
                boolean var175 = field316.method2398() == 1;
                int var176 = field316.method2419();
                class177 var177 = class177.method701(var176);
                if (var177.field2816 != var175) {
                    var177.field2816 = var175;
                    method2034(var177);
                }
                field318 = -1;
                return true;
            }
            if (field318 == 200) {
                String var178 = field316.method2422();
                int var179 = field316.method2548();
                byte var180 = field316.method2415();
                boolean var181 = false;
                if (var180 == -128) {
                    var181 = true;
                }
                if (var181) {
                    if (Statics.field2301 == 0) {
                        field318 = -1;
                        return true;
                    }
                    boolean var182 = false;
                    int var183;
                    for (var183 = 0; var183 < Statics.field2301 && (!Statics.field237[var183].field632.equals(var178) || Statics.field237[var183].field631 != var179); var183++) {
                    }
                    if (var183 < Statics.field2301) {
                        while (var183 < Statics.field2301 - 1) {
                            Statics.field237[var183] = Statics.field237[var183 + 1];
                            var183++;
                        }
                        Statics.field2301--;
                        Statics.field237[Statics.field2301] = null;
                    }
                } else {
                    field316.method2422();
                    class26 var184 = new class26();
                    var184.field632 = var178;
                    var184.field630 = class168.method570(var184.field632, Statics.field2118);
                    var184.field631 = var179;
                    var184.field635 = var180;
                    int var185;
                    for (var185 = Statics.field2301 - 1; var185 >= 0; var185--) {
                        int var186 = Statics.field237[var185].field630.compareTo(var184.field630);
                        if (var186 == 0) {
                            Statics.field237[var185].field631 = var179;
                            Statics.field237[var185].field635 = var180;
                            if (var178.equals(Statics.field2011.field44)) {
                                Statics.field182 = var180;
                            }
                            field405 = field456;
                            field318 = -1;
                            return true;
                        }
                        if (var186 < 0) {
                            break;
                        }
                    }
                    if (Statics.field2301 >= Statics.field237.length) {
                        field318 = -1;
                        return true;
                    }
                    for (int var187 = Statics.field2301 - 1; var187 > var185; var187--) {
                        Statics.field237[var187 + 1] = Statics.field237[var187];
                    }
                    if (Statics.field2301 == 0) {
                        Statics.field237 = new class26[100];
                    }
                    Statics.field237[var185 + 1] = var184;
                    Statics.field2301++;
                    if (var178.equals(Statics.field2011.field44)) {
                        Statics.field182 = var180;
                    }
                }
                field405 = field456;
                field318 = -1;
                return true;
            }
            if (field318 == 123) {
                String var188 = field316.method2422();
                long var189 = (long) field316.method2548();
                long var191 = (long) field316.method2418();
                class156 var193 = (class156) class113.method78(class156.method2835(), field316.method2398());
                long var194 = (var189 << 32) + var191;
                boolean var196 = false;
                for (int var197 = 0; var197 < 100; var197++) {
                    if (field527[var197] == var194) {
                        var196 = true;
                        break;
                    }
                }
                if (method1084(var188)) {
                    var196 = true;
                }
                if (!var196 && field393 == 0) {
                    field527[field493] = var194;
                    field493 = (field493 + 1) % 100;
                    String var198 = class227.method3837(class167.method1059(class226.method3820(field316)));
                    byte var199;
                    if (var193.field2327) {
                        var199 = 7;
                    } else {
                        var199 = 3;
                    }
                    if (var193.field2324 == -1) {
                        class12.method1270(var199, var188, var198);
                    } else {
                        int var201 = var193.field2324;
                        String var202 = "<img=" + var201 + ">";
                        class12.method1270(var199, var202 + var188, var198);
                    }
                }
                field318 = -1;
                return true;
            }
            if (field318 == 60) {
                boolean var203 = field316.method2398() == 1;
                if (var203) {
                    Statics.field2226 = class119.method3544() - field316.method2420();
                    Statics.field2126 = new class225(field316, true);
                } else {
                    Statics.field2126 = null;
                }
                field467 = field456;
                field318 = -1;
                return true;
            }
            if (field318 == 185) {
                Statics.method963(false);
                field318 = -1;
                return true;
            }
            if (field318 == 163) {
                int var204 = field284 + field316.field2046;
                int var205 = field316.method2548();
                int var206 = field316.method2548();
                if (field431 != var205) {
                    field431 = var205;
                    int var207 = field431;
                    int var208 = Statics.field175;
                    int var209 = Statics.field265;
                    if (class177.method2581(var207)) {
                        method89(Statics.field2815[var207], -1, var208, var209, false);
                    }
                    method2350(field431);
                    class39.method2212(field431);
                    for (int var210 = 0; var210 < 100; var210++) {
                        field461[var210] = true;
                    }
                }
                while (var206-- > 0) {
                    int var211 = field316.method2419();
                    int var212 = field316.method2548();
                    int var213 = field316.method2398();
                    class4 var214 = (class4) field536.method3595((long) var211);
                    if (var214 != null && var214.field67 != var212) {
                        method2837(var214, true);
                        var214 = null;
                    }
                    if (var214 == null) {
                        var214 = method567(var211, var212, var213);
                    }
                    var214.field66 = true;
                }
                for (class4 var215 = (class4) field536.method3586(); var215 != null; var215 = (class4) field536.method3591()) {
                    if (var215.field66) {
                        var215.field66 = false;
                    } else {
                        method2837(var215, true);
                    }
                }
                field473 = new class200(512);
                while (field316.field2046 < var204) {
                    int var216 = field316.method2419();
                    int var217 = field316.method2548();
                    int var218 = field316.method2548();
                    int var219 = field316.method2419();
                    for (int var220 = var217; var220 <= var218; var220++) {
                        long var221 = ((long) var216 << 32) + (long) var220;
                        field473.method3588(new class205(var219), var221);
                    }
                }
                field318 = -1;
                return true;
            }
            if (field318 == 105) {
                field396 = field316.method2398();
                field553 = field316.method2398();
                field318 = -1;
                return true;
            }
            if (field318 == 158) {
                for (int var223 = 0; var223 < Statics.field1240; var223++) {
                    class57 var224 = class57.method42(var223);
                    if (var224 != null) {
                        class180.field2951[var223] = 0;
                        class180.field2950[var223] = 0;
                    }
                }
                method45();
                field285 += 32;
                field318 = -1;
                return true;
            }
            if (field318 == 26) {
                int var225 = field316.method2458();
                int var226 = field316.method2548();
                class177 var227 = class177.method701(var225);
                if (var227.field2787 != 1 || var227.field2840 != var226) {
                    var227.field2787 = 1;
                    var227.field2840 = var226;
                    method2034(var227);
                }
                field318 = -1;
                return true;
            }
            if (field318 == 225) {
                int var228 = field316.method2488();
                int var229 = field316.method2448();
                int var230 = var229 >> 10 & 0x1F;
                int var231 = var229 >> 5 & 0x1F;
                int var232 = var229 & 0x1F;
                int var233 = (var232 << 3) + (var230 << 19) + (var231 << 11);
                class177 var234 = class177.method701(var228);
                if (var234.field2892 != var233) {
                    var234.field2892 = var233;
                    method2034(var234);
                }
                field318 = -1;
                return true;
            }
            if (field318 == 171) {
                if (field431 != -1) {
                    method3278(field431, 0);
                }
                field318 = -1;
                return true;
            }
            if (field318 == 168) {
                field519 = true;
                Statics.field1088 = field316.method2398();
                Statics.field220 = field316.method2398();
                Statics.field586 = field316.method2548();
                Statics.field2007 = field316.method2398();
                Statics.field1009 = field316.method2398();
                if (Statics.field1009 >= 100) {
                    int var235 = Statics.field1088 * 128 + 64;
                    int var236 = Statics.field220 * 128 + 64;
                    int var237 = method154(var235, var236, Statics.field1120) - Statics.field586;
                    int var238 = var235 - Statics.field145;
                    int var239 = var237 - Statics.field623;
                    int var240 = var236 - Statics.field1257;
                    int var241 = (int) Math.sqrt((double) (var238 * var238 + var240 * var240));
                    Statics.field718 = (int) (Math.atan2((double) var239, (double) var241) * 325.949D) & 0x7FF;
                    Statics.field156 = (int) (Math.atan2((double) var238, (double) var240) * -325.949D) & 0x7FF;
                    if (Statics.field718 < 128) {
                        Statics.field718 = 128;
                    }
                    if (Statics.field718 > 383) {
                        Statics.field718 = 383;
                    }
                }
                field318 = -1;
                return true;
            }
            if (field318 == 149) {
                int var242 = field316.method2497();
                if (var242 == 65535) {
                    var242 = -1;
                }
                int var243 = field316.method2548();
                if (var243 == 65535) {
                    var243 = -1;
                }
                int var244 = field316.method2419();
                int var245 = field316.method2458();
                for (int var246 = var242; var246 <= var243; var246++) {
                    long var247 = ((long) var245 << 32) + (long) var246;
                    class212 var249 = field473.method3595(var247);
                    if (var249 != null) {
                        var249.method3729();
                    }
                    field473.method3588(new class205(var244), var247);
                }
                field318 = -1;
                return true;
            }
            if (field318 == 103) {
                String var250 = field316.method2422();
                Object[] var251 = new Object[var250.length() + 1];
                for (int var252 = var250.length() - 1; var252 >= 0; var252--) {
                    if (var250.charAt(var252) == 's') {
                        var251[var252 + 1] = field316.method2422();
                    } else {
                        var251[var252 + 1] = Integer.valueOf(field316.method2419());
                    }
                }
                var251[0] = Integer.valueOf(field316.method2419());
                class1 var253 = new class1();
                var253.field2 = var251;
                class39.method850(var253, 200000);
                field318 = -1;
                return true;
            }
            if (field318 == 121) {
                method169();
                field318 = -1;
                return false;
            }
            if (field318 == 75) {
                int var254 = field316.method2419();
                int var255 = field316.method2548();
                if (var254 < -70000) {
                    var255 += 32768;
                }
                class177 var256;
                if (var254 >= 0) {
                    var256 = class177.method701(var254);
                } else {
                    var256 = null;
                }
                if (var256 != null) {
                    for (int var257 = 0; var257 < var256.field2870.length; var257++) {
                        var256.field2870[var257] = 0;
                        var256.field2831[var257] = 0;
                    }
                }
                class16.method652(var255);
                int var258 = field316.method2548();
                for (int var259 = 0; var259 < var258; var259++) {
                    int var260 = field316.method2548();
                    int var261 = field316.method2440();
                    if (var261 == 255) {
                        var261 = field316.method2488();
                    }
                    if (var256 != null && var259 < var256.field2870.length) {
                        var256.field2870[var259] = var260;
                        var256.field2831[var259] = var261;
                    }
                    class16.method153(var255, var259, var260 - 1, var261);
                }
                if (var256 != null) {
                    method2034(var256);
                }
                method45();
                field459[++field458 - 1 & 0x1F] = var255 & 0x7FFF;
                field318 = -1;
                return true;
            }
            if (field318 == 68) {
                field539 = 1;
                field549 = field456;
                field318 = -1;
                return true;
            }
            if (field318 == 214) {
                Statics.method963(true);
                field318 = -1;
                return true;
            }
            if (field318 == 80) {
                method45();
                field437 = field316.method2417();
                field468 = field456;
                field318 = -1;
                return true;
            }
            if (field318 == 15) {
                int var262 = field316.method2398();
                if (field316.method2398() == 0) {
                    field547[var262] = new class224();
                    field316.field2046 += 18;
                } else {
                    field316.field2046--;
                    field547[var262] = new class224(field316, false);
                }
                field466 = field456;
                field318 = -1;
                return true;
            }
            if (field318 == 240) {
                int var263 = field316.method2450();
                field431 = var263;
                int var264 = field431;
                int var265 = Statics.field175;
                int var266 = Statics.field265;
                if (class177.method2581(var264)) {
                    method89(Statics.field2815[var264], -1, var265, var266, false);
                }
                method2350(var263);
                class39.method2212(field431);
                for (int var267 = 0; var267 < 100; var267++) {
                    field461[var267] = true;
                }
                field318 = -1;
                return true;
            }
            if (field318 == 206) {
                Statics.field32 = field316.method2440();
                Statics.field688 = field316.method2440();
                for (int var268 = Statics.field32; var268 < Statics.field32 + 8; var268++) {
                    for (int var269 = Statics.field688; var269 < Statics.field688 + 8; var269++) {
                        if (field404[Statics.field1120][var268][var269] != null) {
                            field404[Statics.field1120][var268][var269] = null;
                            method2836(var268, var269);
                        }
                    }
                }
                for (class17 var270 = (class17) field370.method3621(); var270 != null; var270 = (class17) field370.method3630()) {
                    if (var270.field210 >= Statics.field32 && var270.field210 < Statics.field32 + 8 && var270.field211 >= Statics.field688 && var270.field211 < Statics.field688 + 8 && Statics.field1120 == var270.field214) {
                        var270.field222 = 0;
                    }
                }
                field318 = -1;
                return true;
            }
            if (field318 == 144) {
                field419 = field316.method2398();
                if (field419 == 1) {
                    field292 = field316.method2548();
                }
                if (field419 >= 2 && field419 <= 6) {
                    if (field419 == 2) {
                        field297 = 64;
                        field298 = 64;
                    }
                    if (field419 == 3) {
                        field297 = 0;
                        field298 = 64;
                    }
                    if (field419 == 4) {
                        field297 = 128;
                        field298 = 64;
                    }
                    if (field419 == 5) {
                        field297 = 64;
                        field298 = 0;
                    }
                    if (field419 == 6) {
                        field297 = 64;
                        field298 = 128;
                    }
                    field419 = 2;
                    field294 = field316.method2548();
                    field310 = field316.method2548();
                    field296 = field316.method2398();
                }
                if (field419 == 10) {
                    field337 = field316.method2548();
                }
                field318 = -1;
                return true;
            }
            if (field318 == 81) {
                String var271 = field316.method2422();
                int var272 = field316.method2440();
                int var273 = field316.method2440();
                if (var272 >= 1 && var272 <= 8) {
                    if (var271.equalsIgnoreCase("null")) {
                        var271 = null;
                    }
                    field400[var272 - 1] = var271;
                    field401[var272 - 1] = var273 == 0;
                }
                field318 = -1;
                return true;
            }
            if (field318 == 232) {
                int var274 = field316.method2448();
                if (var274 == 65535) {
                    var274 = -1;
                }
                int var275 = field316.method2544();
                int var276 = field316.method2488();
                class177 var277 = class177.method701(var276);
                if (var277.field2795) {
                    var277.field2835 = var274;
                    var277.field2917 = var275;
                    class56 var279 = class56.method43(var274);
                    var277.field2854 = var279.field1217;
                    var277.field2848 = var279.field1191;
                    var277.field2849 = var279.field1190;
                    var277.field2864 = var279.field1193;
                    var277.field2852 = var279.field1194;
                    var277.field2821 = var279.field1189;
                    if (var279.field1195 == 1) {
                        var277.field2914 = 1;
                    } else {
                        var277.field2914 = 2;
                    }
                    if (var277.field2898 > 0) {
                        var277.field2821 = var277.field2821 * 32 / var277.field2898;
                    } else if (var277.field2807 > 0) {
                        var277.field2821 = var277.field2821 * 32 / var277.field2807;
                    }
                    method2034(var277);
                } else if (var274 == -1) {
                    var277.field2787 = 0;
                    field318 = -1;
                    return true;
                } else {
                    class56 var278 = class56.method43(var274);
                    var277.field2787 = 4;
                    var277.field2840 = var274;
                    var277.field2854 = var278.field1217;
                    var277.field2848 = var278.field1191;
                    var277.field2821 = var278.field1189 * 100 / var275;
                    method2034(var277);
                }
                field318 = -1;
                return true;
            }
            if (field318 == 173) {
                field519 = false;
                for (int var280 = 0; var280 < 5; var280++) {
                    field520[var280] = false;
                }
                field318 = -1;
                return true;
            }
            if (field318 == 208) {
                field507 = field316.method2398();
                field318 = -1;
                return true;
            }
            if (field318 == 27) {
                int var281 = field316.method2427();
                boolean var282 = field316.method2398() == 1;
                String var283 = "";
                boolean var284 = false;
                if (var282) {
                    var283 = field316.method2422();
                    if (method1084(var283)) {
                        var284 = true;
                    }
                }
                String var285 = field316.method2422();
                if (!var284) {
                    class12.method1270(var281, var283, var285);
                }
                field318 = -1;
                return true;
            }
            if (field318 == 91) {
                int var286 = field316.method2488();
                Statics.field20 = Statics.field901.method2782(var286);
                field318 = -1;
                return true;
            }
            if (field318 == 72) {
                int var287 = field316.method2448();
                int var288 = field316.method2544();
                class177 var289 = class177.method701(var288);
                if (var289 != null && var289.field2930 == 0) {
                    if (var287 > var289.field2820 - var289.field2878) {
                        var287 = var289.field2820 - var289.field2878;
                    }
                    if (var287 < 0) {
                        var287 = 0;
                    }
                    if (var289.field2818 != var287) {
                        var289.field2818 = var287;
                        method2034(var289);
                    }
                }
                field318 = -1;
                return true;
            }
            if (field318 == 10 || field318 == 176 || field318 == 172 || field318 == 157 || field318 == 39 || field318 == 130 || field318 == 47 || field318 == 98 || field318 == 202 || field318 == 114) {
                method708();
                field318 = -1;
                return true;
            }
            class152.method1096("" + field318 + class2.field25 + field322 + class2.field25 + field291 + class2.field25 + field284, (Throwable) null);
            method169();
        } catch (IOException var297) {
            if (field324 > 0) {
                method169();
            } else {
                method3191(40);
                Statics.field2938 = Statics.field830;
                Statics.field830 = null;
            }
        } catch (Exception var298) {
            String var292 = "" + field318 + class2.field25 + field322 + class2.field25 + field291 + class2.field25 + field284 + class2.field25 + (Statics.field839 + Statics.field2011.field886[0]) + class2.field25 + (Statics.field185 + Statics.field2011.field887[0]) + class2.field25;
            for (int var293 = 0; var293 < field284 && var293 < 50; var293++) {
                var292 = var292 + field316.field2048[var293] + class2.field25;
            }
            class152.method1096(var292, var298);
            method169();
        }
        return true;
    }

    @ObfuscatedName("ad.bo(B)V")
    public static final void method708() {
        if (field318 == 47) {
            int var0 = field316.method2448();
            int var1 = field316.method2560();
            int var2 = (var1 >> 4 & 0x7) + Statics.field32;
            int var3 = (var1 & 0x7) + Statics.field688;
            int var4 = field316.method2548();
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class31 var5 = new class31();
                var5.field700 = var0;
                var5.field695 = var4;
                if (field404[Statics.field1120][var2][var3] == null) {
                    field404[Statics.field1120][var2][var3] = new class203();
                }
                field404[Statics.field1120][var2][var3].method3616(var5);
                method2836(var2, var3);
            }
        } else if (field318 == 114) {
            int var6 = field316.method2596();
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = field335[var7];
            int var10 = field316.method2548();
            int var11 = field316.method2440();
            int var12 = (var11 >> 4 & 0x7) + Statics.field32;
            int var13 = (var11 & 0x7) + Statics.field688;
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                method2893(Statics.field1120, var12, var13, var9, var10, var7, var8, 0, -1);
            }
        } else if (field318 == 130) {
            int var14 = field316.method2548();
            int var15 = field316.method2398();
            int var16 = (var15 >> 4 & 0x7) + Statics.field32;
            int var17 = (var15 & 0x7) + Statics.field688;
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                class203 var18 = field404[Statics.field1120][var16][var17];
                if (var18 != null) {
                    for (class31 var19 = (class31) var18.method3621(); var19 != null; var19 = (class31) var18.method3630()) {
                        if ((var14 & 0x7FFF) == var19.field700) {
                            var19.method3729();
                            break;
                        }
                    }
                    if (var18.method3621() == null) {
                        field404[Statics.field1120][var16][var17] = null;
                    }
                    method2836(var16, var17);
                }
            }
        } else if (field318 == 98) {
            int var20 = field316.method2440();
            int var21 = (var20 >> 4 & 0x7) + Statics.field32;
            int var22 = (var20 & 0x7) + Statics.field688;
            int var23 = field316.method2596();
            int var24 = var23 >> 2;
            int var25 = var23 & 0x3;
            int var26 = field335[var24];
            int var27 = field316.method2497();
            if (var21 >= 0 && var22 >= 0 && var21 < 103 && var22 < 103) {
                if (var26 == 0) {
                    class91 var28 = Statics.field92.method1891(Statics.field1120, var21, var22);
                    if (var28 != null) {
                        int var29 = var28.field1607 >> 14 & 0x7FFF;
                        if (var24 == 2) {
                            var28.field1605 = new class13(var29, 2, var25 + 4, Statics.field1120, var21, var22, var27, false, var28.field1605);
                            var28.field1606 = new class13(var29, 2, var25 + 1 & 0x3, Statics.field1120, var21, var22, var27, false, var28.field1606);
                        } else {
                            var28.field1605 = new class13(var29, var24, var25, Statics.field1120, var21, var22, var27, false, var28.field1605);
                        }
                    }
                }
                if (var26 == 1) {
                    class98 var30 = Statics.field92.method1892(Statics.field1120, var21, var22);
                    if (var30 != null) {
                        int var31 = var30.field1684 >> 14 & 0x7FFF;
                        if (var24 == 4 || var24 == 5) {
                            var30.field1681 = new class13(var31, 4, var25, Statics.field1120, var21, var22, var27, false, var30.field1681);
                        } else if (var24 == 6) {
                            var30.field1681 = new class13(var31, 4, var25 + 4, Statics.field1120, var21, var22, var27, false, var30.field1681);
                        } else if (var24 == 7) {
                            var30.field1681 = new class13(var31, 4, (var25 + 2 & 0x3) + 4, Statics.field1120, var21, var22, var27, false, var30.field1681);
                        } else if (var24 == 8) {
                            var30.field1681 = new class13(var31, 4, var25 + 4, Statics.field1120, var21, var22, var27, false, var30.field1681);
                            var30.field1682 = new class13(var31, 4, (var25 + 2 & 0x3) + 4, Statics.field1120, var21, var22, var27, false, var30.field1682);
                        }
                    }
                }
                if (var26 == 2) {
                    class102 var32 = Statics.field92.method1985(Statics.field1120, var21, var22);
                    if (var24 == 11) {
                        var24 = 10;
                    }
                    if (var32 != null) {
                        var32.field1741 = new class13(var32.field1740 >> 14 & 0x7FFF, var24, var25, Statics.field1120, var21, var22, var27, false, var32.field1741);
                    }
                }
                if (var26 == 3) {
                    class97 var33 = Statics.field92.method1894(Statics.field1120, var21, var22);
                    if (var33 != null) {
                        var33.field1663 = new class13(var33.field1667 >> 14 & 0x7FFF, 22, var25, Statics.field1120, var21, var22, var27, false, var33.field1663);
                    }
                }
            }
        } else if (field318 == 157) {
            int var34 = field316.method2398();
            int var35 = (var34 >> 4 & 0x7) + Statics.field32;
            int var36 = (var34 & 0x7) + Statics.field688;
            int var37 = field316.method2548();
            int var38 = field316.method2398();
            int var39 = field316.method2548();
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                int var40 = var35 * 128 + 64;
                int var41 = var36 * 128 + 64;
                class32 var42 = new class32(var37, Statics.field1120, var40, var41, method154(var40, var41, Statics.field1120) - var38, var39, field283);
                field407.method3616(var42);
            }
        } else if (field318 == 202) {
            int var43 = field316.method2560();
            int var44 = (var43 >> 4 & 0x7) + Statics.field32;
            int var45 = (var43 & 0x7) + Statics.field688;
            int var46 = field316.method2440();
            int var47 = var46 >> 2;
            int var48 = var46 & 0x3;
            int var49 = field335[var47];
            if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                method2893(Statics.field1120, var44, var45, var49, -1, var47, var48, 0, -1);
            }
        } else if (field318 == 39) {
            int var50 = field316.method2398();
            int var51 = (var50 >> 4 & 0x7) + Statics.field32;
            int var52 = (var50 & 0x7) + Statics.field688;
            int var53 = var51 + field316.method2415();
            int var54 = var52 + field316.method2415();
            int var55 = field316.method2417();
            int var56 = field316.method2548();
            int var57 = field316.method2398() * 4;
            int var58 = field316.method2398() * 4;
            int var59 = field316.method2548();
            int var60 = field316.method2548();
            int var61 = field316.method2398();
            int var62 = field316.method2398();
            if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104 && var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && var56 != 65535) {
                int var63 = var51 * 128 + 64;
                int var64 = var52 * 128 + 64;
                int var65 = var53 * 128 + 64;
                int var66 = var54 * 128 + 64;
                class7 var67 = new class7(var56, Statics.field1120, var63, var64, method154(var63, var64, Statics.field1120) - var57, field283 + var59, field283 + var60, var61, var62, var55, var58);
                var67.method81(var65, var66, method154(var65, var66, Statics.field1120) - var58, field283 + var59);
                field406.method3616(var67);
            }
        } else if (field318 == 176) {
            int var68 = field316.method2398();
            int var69 = (var68 >> 4 & 0x7) + Statics.field32;
            int var70 = (var68 & 0x7) + Statics.field688;
            int var71 = field316.method2548();
            int var72 = field316.method2548();
            int var73 = field316.method2548();
            if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                class203 var74 = field404[Statics.field1120][var69][var70];
                if (var74 != null) {
                    for (class31 var75 = (class31) var74.method3621(); var75 != null; var75 = (class31) var74.method3630()) {
                        if ((var71 & 0x7FFF) == var75.field700 && var75.field695 == var72) {
                            var75.field695 = var73;
                            break;
                        }
                    }
                    method2836(var69, var70);
                }
            }
        } else {
            if (field318 == 10) {
                int var76 = field316.method2398();
                int var77 = (var76 >> 4 & 0x7) + Statics.field32;
                int var78 = (var76 & 0x7) + Statics.field688;
                int var79 = field316.method2548();
                int var80 = field316.method2398();
                int var81 = var80 >> 4 & 0xF;
                int var82 = var80 & 0x7;
                int var83 = field316.method2398();
                if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
                    int var84 = var81 + 1;
                    if (Statics.field2011.field886[0] >= var77 - var84 && Statics.field2011.field886[0] <= var77 + var84 && Statics.field2011.field887[0] >= var78 - var84 && Statics.field2011.field887[0] <= var78 + var84 && field512 != 0 && var82 > 0 && field275 < 50) {
                        field514[field275] = var79;
                        field347[field275] = var82;
                        field435[field275] = var83;
                        field451[field275] = null;
                        field289[field275] = (var77 << 16) + (var78 << 8) + var81;
                        field275++;
                    }
                }
            }
            if (field318 == 172) {
                byte var85 = field316.method2415();
                int var86 = field316.method2596();
                int var87 = (var86 >> 4 & 0x7) + Statics.field32;
                int var88 = (var86 & 0x7) + Statics.field688;
                int var89 = field316.method2450();
                int var90 = field316.method2450();
                int var91 = field316.method2448();
                int var92 = field316.method2448();
                byte var93 = field316.method2443();
                byte var94 = field316.method2444();
                byte var95 = field316.method2443();
                int var96 = field316.method2596();
                int var97 = var96 >> 2;
                int var98 = var96 & 0x3;
                int var99 = field335[var97];
                class3 var100;
                if (field552 == var91) {
                    var100 = Statics.field2011;
                } else {
                    var100 = field394[var91];
                }
                if (var100 != null) {
                    class43 var101 = class43.method96(var89);
                    int var102;
                    int var103;
                    if (var98 == 1 || var98 == 3) {
                        var102 = var101.field981;
                        var103 = var101.field977;
                    } else {
                        var102 = var101.field977;
                        var103 = var101.field981;
                    }
                    int var104 = (var102 >> 1) + var87;
                    int var105 = (var102 + 1 >> 1) + var87;
                    int var106 = (var103 >> 1) + var88;
                    int var107 = (var103 + 1 >> 1) + var88;
                    int[][] var108 = class6.field78[Statics.field1120];
                    int var109 = var108[var104][var106] + var108[var105][var106] + var108[var104][var107] + var108[var105][var107] >> 2;
                    int var110 = (var87 << 7) + (var102 << 6);
                    int var111 = (var88 << 7) + (var103 << 6);
                    class109 var112 = var101.method830(var97, var98, var108, var110, var109, var111);
                    if (var112 != null) {
                        method2893(Statics.field1120, var87, var88, var99, -1, 0, 0, var90 + 1, var92 + 1);
                        var100.field45 = field283 + var90;
                        var100.field37 = field283 + var92;
                        var100.field50 = var112;
                        var100.field41 = var87 * 128 + var102 * 64;
                        var100.field49 = var88 * 128 + var103 * 64;
                        var100.field48 = var109;
                        if (var85 > var95) {
                            byte var113 = var85;
                            var85 = var95;
                            var95 = var113;
                        }
                        if (var94 > var93) {
                            byte var114 = var94;
                            var94 = var93;
                            var93 = var114;
                        }
                        var100.field38 = var85 + var87;
                        var100.field53 = var87 + var95;
                        var100.field52 = var88 + var94;
                        var100.field54 = var88 + var93;
                    }
                }
            }
        }
    }

    @ObfuscatedName("er.bm(IIIIIIIIIB)V")
    public static final void method2893(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field370.method3621(); var10 != null; var10 = (class17) field370.method3630()) {
            if (var10.field214 == arg0 && var10.field210 == arg1 && var10.field211 == arg2 && var10.field209 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field214 = arg0;
            var9.field209 = arg3;
            var9.field210 = arg1;
            var9.field211 = arg2;
            method888(var9);
            field370.method3616(var9);
        }
        var9.field219 = arg4;
        var9.field208 = arg5;
        var9.field216 = arg6;
        var9.field218 = arg7;
        var9.field222 = arg8;
    }

    @ObfuscatedName("ac.by(Lf;I)V")
    public static final void method888(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field209 == 0) {
            var1 = Statics.field92.method1895(arg0.field214, arg0.field210, arg0.field211);
        }
        if (arg0.field209 == 1) {
            var1 = Statics.field92.method1877(arg0.field214, arg0.field210, arg0.field211);
        }
        if (arg0.field209 == 2) {
            var1 = Statics.field92.method2007(arg0.field214, arg0.field210, arg0.field211);
        }
        if (arg0.field209 == 3) {
            var1 = Statics.field92.method1897(arg0.field214, arg0.field210, arg0.field211);
        }
        if (var1 != 0) {
            int var5 = Statics.field92.method1898(arg0.field214, arg0.field210, arg0.field211, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field215 = var2;
        arg0.field212 = var3;
        arg0.field213 = var4;
    }

    @ObfuscatedName("u.ba(S)V")
    public static final void method141() {
        for (class17 var0 = (class17) field370.method3621(); var0 != null; var0 = (class17) field370.method3630()) {
            if (var0.field222 > 0) {
                var0.field222--;
            }
            if (var0.field222 != 0) {
                if (var0.field218 > 0) {
                    var0.field218--;
                }
                if (var0.field218 == 0 && var0.field210 >= 1 && var0.field211 >= 1 && var0.field210 <= 102 && var0.field211 <= 102 && (var0.field219 < 0 || class6.method2765(var0.field219, var0.field208))) {
                    method754(var0.field214, var0.field209, var0.field210, var0.field211, var0.field219, var0.field216, var0.field208);
                    var0.field218 = -1;
                    if (var0.field219 == var0.field215 && var0.field215 == -1) {
                        var0.method3729();
                    } else if (var0.field219 == var0.field215 && var0.field216 == var0.field213 && var0.field212 == var0.field208) {
                        var0.method3729();
                    }
                }
            } else if (var0.field215 < 0 || class6.method2765(var0.field215, var0.field212)) {
                method754(var0.field214, var0.field209, var0.field210, var0.field211, var0.field215, var0.field213, var0.field212);
                var0.method3729();
            }
        }
    }

    @ObfuscatedName("ay.bc(IIIIIIII)V")
    public static final void method754(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field278 && Statics.field1120 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field92.method1895(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field92.method1877(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field92.method2007(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field92.method1897(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field92.method1898(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field92.method1886(arg0, arg2, arg3);
                class43 var15 = class43.method96(var12);
                if (var15.field960 != 0) {
                    field332[arg0].method2303(arg2, arg3, var13, var14, var15.field961);
                }
            }
            if (arg1 == 1) {
                Statics.field92.method1887(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field92.method1876(arg0, arg2, arg3);
                class43 var16 = class43.method96(var12);
                if (var16.field977 + arg2 > 103 || var16.field977 + arg3 > 103 || var16.field981 + arg2 > 103 || var16.field981 + arg3 > 103) {
                    return;
                }
                if (var16.field960 != 0) {
                    field332[arg0].method2304(arg2, arg3, var16.field977, var16.field981, var14, var16.field961);
                }
            }
            if (arg1 == 3) {
                Statics.field92.method1964(arg0, arg2, arg3);
                class43 var17 = class43.method96(var12);
                if (var17.field960 == 1) {
                    field332[arg0].method2320(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field79[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method12(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field92, field332[arg0]);
    }

    @ObfuscatedName("ep.bn(IIB)V")
    public static final void method2836(int arg0, int arg1) {
        class203 var2 = field404[Statics.field1120][arg0][arg1];
        if (var2 == null) {
            Statics.field92.method1890(Statics.field1120, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class31 var5 = null;
        for (class31 var6 = (class31) var2.method3621(); var6 != null; var6 = (class31) var2.method3630()) {
            class56 var7 = class56.method43(var6.field700);
            long var8 = (long) var7.field1186;
            if (var7.field1195 == 1) {
                var8 = (long) (var6.field695 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field92.method1890(Statics.field1120, arg0, arg1);
            return;
        }
        var2.method3617(var5);
        class31 var10 = null;
        class31 var11 = null;
        for (class31 var12 = (class31) var2.method3621(); var12 != null; var12 = (class31) var2.method3630()) {
            if (var5.field700 != var12.field700) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field700 != var12.field700 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field92.method1991(Statics.field1120, arg0, arg1, method154(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1120), var5, var13, var10, var11);
    }

    @ObfuscatedName("aw.bg(I)V")
    public static final void method752() {
        field316.method2641();
        int var0 = field316.method2655(8);
        if (var0 < field395) {
            for (int var1 = var0; var1 < field395; var1++) {
                field432[++field397 - 1] = field311[var1];
            }
        }
        if (var0 > field395) {
            throw new RuntimeException("");
        }
        field395 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field311[var2];
            class37 var4 = field309[var3];
            int var5 = field316.method2655(1);
            if (var5 == 0) {
                field311[++field395 - 1] = var3;
                var4.field880 = field283;
            } else {
                int var6 = field316.method2655(2);
                if (var6 == 0) {
                    field311[++field395 - 1] = var3;
                    var4.field880 = field283;
                    field313[++field312 - 1] = var3;
                } else if (var6 == 1) {
                    field311[++field395 - 1] = var3;
                    var4.field880 = field283;
                    int var7 = field316.method2655(3);
                    var4.method715(var7, (byte) 1);
                    int var8 = field316.method2655(1);
                    if (var8 == 1) {
                        field313[++field312 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field311[++field395 - 1] = var3;
                    var4.field880 = field283;
                    int var9 = field316.method2655(3);
                    var4.method715(var9, (byte) 2);
                    int var10 = field316.method2655(3);
                    var4.method715(var10, (byte) 2);
                    int var11 = field316.method2655(1);
                    if (var11 == 1) {
                        field313[++field312 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field432[++field397 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("d.bf(Le;IIBI)V")
    public static final void method184(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field886[0];
        int var5 = arg0.field887[0];
        int var6 = arg0.method15();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = class110.method2032(var4, var5, arg0.method15(), method2663(arg1, arg2), field332[arg0.field58], true, field443, field300);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method34(field443[var8], field300[var8], arg3);
            }
        }
    }

    @ObfuscatedName("dx.bp(III)Ldu;")
    public static class111 method2663(int arg0, int arg1) {
        field551.field1941 = arg0;
        field551.field1939 = arg1;
        field551.field1940 = 1;
        field551.field1942 = 1;
        return field551;
    }

    @ObfuscatedName("j.bu(III)V")
    public static final void method84(int arg0, int arg1) {
        if (field413 < 2 && field532 == 0 && !field445) {
            return;
        }
        String var2;
        if (field532 == 1 && field413 < 2) {
            var2 = class161.field2517 + class161.field2527 + field425 + " " + class2.field22;
        } else if (field445 && field413 < 2) {
            var2 = field429 + class161.field2527 + field439 + " " + class2.field22;
        } else {
            int var3 = field413 - 1;
            String var4;
            if (field329[var3].length() > 0) {
                var4 = field418[var3] + class161.field2527 + field329[var3];
            } else {
                var4 = field418[var3];
            }
            var2 = var4;
        }
        if (field413 > 2) {
            var2 = var2 + class2.method1062(16777215) + " " + '/' + " " + (field413 - 2) + class161.field2521;
        }
        Statics.field26.method3879(var2, arg0 + 4, arg1 + 15, 16777215, 0, field283 / 1000);
    }

    @ObfuscatedName("aa.bl(B)V")
    public static final void method657() {
        int var0 = Statics.field2700;
        int var1 = Statics.field2100;
        int var2 = Statics.field601;
        int var3 = Statics.field789;
        int var4 = 6116423;
        class83.method1772(var0, var1, var2, var3, var4);
        class83.method1772(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class83.method1770(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field26.method3838(class161.field2520, var0 + 3, var1 + 14, var4, -1);
        int var5 = class144.field2214;
        int var6 = class144.field2215 * 148505657;
        for (int var7 = 0; var7 < field413; var7++) {
            int var8 = (field413 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class228 var10 = Statics.field26;
            String var11;
            if (field329[var7].length() > 0) {
                var11 = field418[var7] + class161.field2527 + field329[var7];
            } else {
                var11 = field418[var7];
            }
            var10.method3838(var11, var0 + 3, var8, var9, 0);
        }
        Statics.method738(Statics.field2700, Statics.field2100, Statics.field601, Statics.field789);
    }

    @ObfuscatedName("r.bv(IIIIB)V")
    public static final void method97(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field414; var4++) {
            if (field479[var4] + field360[var4] > arg0 && field479[var4] < arg0 + arg2 && field496[var4] + field480[var4] > arg1 && field480[var4] < arg1 + arg3) {
                field461[var4] = true;
            }
        }
    }

    @ObfuscatedName("a.bk(III)V")
    public static final void method583(int arg0, int arg1) {
        int var2 = Statics.field26.method3833(class161.field2520);
        for (int var3 = 0; var3 < field413; var3++) {
            class228 var4 = Statics.field26;
            String var5;
            if (field329[var3].length() > 0) {
                var5 = field418[var3] + class161.field2527 + field329[var3];
            } else {
                var5 = field418[var3];
            }
            int var6 = var4.method3833(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field413 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field175) {
            var8 = Statics.field175 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field265) {
            var9 = Statics.field265 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field518 = true;
        Statics.field2700 = var8;
        Statics.field2100 = var9;
        Statics.field601 = var2;
        Statics.field789 = field413 * 15 + 22;
    }

    @ObfuscatedName("al.bb(IB)Z")
    public static final boolean method848(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field416[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("cn.bj(IB)V")
    public static final void method2031(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field295[arg0];
        int var2 = field415[arg0];
        int var3 = field416[arg0];
        int var4 = field323[arg0];
        String var5 = field418[arg0];
        String var6 = field329[arg0];
        method710(var1, var2, var3, var4, var5, var6, class144.field2221, class144.field2223);
    }

    @ObfuscatedName("bt.bw(Laa;III)V")
    public static final void method1164(class33 arg0, int arg1, int arg2) {
        method710(arg0.field726, arg0.field721, arg0.field723, arg0.field725, arg0.field724, arg0.field724, arg1, arg2);
    }

    @ObfuscatedName("av.cc(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method710(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 29) {
            field314.method2639(20);
            field314.method2402(arg1);
            class177 var8 = class177.method701(arg1);
            if (var8.field2908 != null && var8.field2908[0][0] == 5) {
                int var9 = var8.field2908[0][1];
                if (class180.field2950[var9] != var8.field2862[0]) {
                    class180.field2950[var9] = var8.field2862[0];
                    method37(var9);
                }
            }
        }
        if (arg2 == 10) {
            class37 var10 = field309[arg3];
            if (var10 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(41);
                field314.method2437(class141.field2187[82] ? 1 : 0);
                field314.method2400(arg3);
            }
        }
        if (arg2 == 42) {
            field314.method2639(250);
            field314.method2402(arg1);
            field314.method2400(arg0);
            field314.method2400(arg3);
            field489 = 0;
            Statics.field1674 = class177.method701(arg1);
            field386 = arg0;
        }
        if (arg2 == 46) {
            class3 var11 = field394[arg3];
            if (var11 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(153);
                field314.method2445(arg3);
                field314.method2437(class141.field2187[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class37 var12 = field309[arg3];
            if (var12 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(93);
                field314.method2447(arg3);
                field314.method2399(class141.field2187[82] ? 1 : 0);
            }
        }
        if (arg2 == 20) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field505 = arg0;
            field465 = arg1;
            field314.method2639(35);
            field314.method2445(arg3);
            field314.method2447(Statics.field839 + arg0);
            field314.method2437(class141.field2187[82] ? 1 : 0);
            field314.method2445(Statics.field185 + arg1);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class177 var13 = class177.method2998(arg1, arg0);
            if (var13 != null) {
                int var14 = var13.field2835;
                class177 var15 = class177.method2998(arg1, arg0);
                if (var15 != null) {
                    if (var15.field2896 != null) {
                        class1 var16 = new class1();
                        var16.field4 = var15;
                        var16.field10 = arg3;
                        var16.field14 = arg5;
                        var16.field2 = var15.field2896;
                        class39.method850(var16, 200000);
                    }
                    boolean var17 = true;
                    if (var15.field2800 > 0) {
                        var17 = method2211(var15);
                    }
                    if (var17 && class182.method2964(method143(var15), arg3 - 1)) {
                        if (arg3 == 1) {
                            field314.method2639(194);
                            field314.method2402(arg1);
                            field314.method2400(arg0);
                            field314.method2400(var14);
                        }
                        if (arg3 == 2) {
                            field314.method2639(4);
                            field314.method2402(arg1);
                            field314.method2400(arg0);
                            field314.method2400(var14);
                        }
                        if (arg3 == 3) {
                            field314.method2639(240);
                            field314.method2402(arg1);
                            field314.method2400(arg0);
                            field314.method2400(var14);
                        }
                        if (arg3 == 4) {
                            field314.method2639(150);
                            field314.method2402(arg1);
                            field314.method2400(arg0);
                            field314.method2400(var14);
                        }
                        if (arg3 == 5) {
                            field314.method2639(22);
                            field314.method2402(arg1);
                            field314.method2400(arg0);
                            field314.method2400(var14);
                        }
                        if (arg3 == 6) {
                            field314.method2639(25);
                            field314.method2402(arg1);
                            field314.method2400(arg0);
                            field314.method2400(var14);
                        }
                        if (arg3 == 7) {
                            field314.method2639(13);
                            field314.method2402(arg1);
                            field314.method2400(arg0);
                            field314.method2400(var14);
                        }
                        if (arg3 == 8) {
                            field314.method2639(3);
                            field314.method2402(arg1);
                            field314.method2400(arg0);
                            field314.method2400(var14);
                        }
                        if (arg3 == 9) {
                            field314.method2639(91);
                            field314.method2402(arg1);
                            field314.method2400(arg0);
                            field314.method2400(var14);
                        }
                        if (arg3 == 10) {
                            field314.method2639(176);
                            field314.method2402(arg1);
                            field314.method2400(arg0);
                            field314.method2400(var14);
                        }
                    }
                }
            }
        }
        if (arg2 == 36) {
            field314.method2639(109);
            field314.method2447(arg3);
            field314.method2447(arg0);
            field314.method2402(arg1);
            field489 = 0;
            Statics.field1674 = class177.method701(arg1);
            field386 = arg0;
        }
        if (arg2 == 21) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field505 = arg0;
            field465 = arg1;
            field314.method2639(140);
            field314.method2409(Statics.field839 + arg0);
            field314.method2400(arg3);
            field314.method2400(Statics.field185 + arg1);
            field314.method2437(class141.field2187[82] ? 1 : 0);
        }
        if (arg2 == 40) {
            field314.method2639(149);
            field314.method2400(arg0);
            field314.method2409(arg3);
            field314.method2402(arg1);
            field489 = 0;
            Statics.field1674 = class177.method701(arg1);
            field386 = arg0;
        }
        if (arg2 == 38) {
            method2354();
            class177 var18 = class177.method701(arg1);
            field532 = 1;
            Statics.field621 = arg0;
            Statics.field2665 = arg1;
            Statics.field2961 = arg3;
            method2034(var18);
            field425 = class2.method1062(16748608) + class56.method43(arg3).field1184 + class2.method1062(16777215);
            if (field425 == null) {
                field425 = "null";
            }
            return;
        }
        if (arg2 == 50) {
            class3 var19 = field394[arg3];
            if (var19 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(95);
                field314.method2409(arg3);
                field314.method2437(class141.field2187[82] ? 1 : 0);
            }
        }
        if (arg2 == 4) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field505 = arg0;
            field465 = arg1;
            field314.method2639(24);
            field314.method2445(Statics.field185 + arg1);
            field314.method2445(arg3 >> 14 & 0x7FFF);
            field314.method2437(class141.field2187[82] ? 1 : 0);
            field314.method2409(Statics.field839 + arg0);
        }
        if (arg2 == 1001) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field505 = arg0;
            field465 = arg1;
            field314.method2639(216);
            field314.method2445(Statics.field839 + arg0);
            field314.method2400(Statics.field185 + arg1);
            field314.method2400(arg3 >> 14 & 0x7FFF);
            field314.method2438(class141.field2187[82] ? 1 : 0);
        }
        if (arg2 == 41) {
            field314.method2639(77);
            field314.method2447(arg0);
            field314.method2402(arg1);
            field314.method2447(arg3);
            field489 = 0;
            Statics.field1674 = class177.method701(arg1);
            field386 = arg0;
        }
        if (arg2 == 22) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field505 = arg0;
            field465 = arg1;
            field314.method2639(10);
            field314.method2399(class141.field2187[82] ? 1 : 0);
            field314.method2400(Statics.field185 + arg1);
            field314.method2409(Statics.field839 + arg0);
            field314.method2400(arg3);
        }
        if (arg2 == 51) {
            class3 var20 = field394[arg3];
            if (var20 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(198);
                field314.method2400(arg3);
                field314.method2439(class141.field2187[82] ? 1 : 0);
            }
        }
        if (arg2 == 30 && field403 == null) {
            field314.method2639(65);
            field314.method2447(arg0);
            field314.method2571(arg1);
            field403 = class177.method2998(arg1, arg0);
            method2034(field403);
        }
        if (arg2 == 15) {
            class3 var21 = field394[arg3];
            if (var21 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(94);
                field314.method2400(arg3);
                field314.method2409(field427);
                field314.method2571(Statics.field1670);
                field314.method2438(class141.field2187[82] ? 1 : 0);
            }
        }
        if (arg2 == 43) {
            field314.method2639(78);
            field314.method2461(arg1);
            field314.method2400(arg3);
            field314.method2447(arg0);
            field489 = 0;
            Statics.field1674 = class177.method701(arg1);
            field386 = arg0;
        }
        if (arg2 == 26) {
            method94();
        }
        if (arg2 == 34) {
            field314.method2639(241);
            field314.method2402(arg1);
            field314.method2400(arg3);
            field314.method2400(arg0);
            field489 = 0;
            Statics.field1674 = class177.method701(arg1);
            field386 = arg0;
        }
        if (arg2 == 1005) {
            class177 var22 = class177.method701(arg1);
            if (var22 == null || var22.field2831[arg0] < 100000) {
                field314.method2639(244);
                field314.method2400(arg3);
            } else {
                class12.method1270(27, "", var22.field2831[arg0] + " x " + class56.method43(arg3).field1184);
            }
            field489 = 0;
            Statics.field1674 = class177.method701(arg1);
            field386 = arg0;
        }
        if (arg2 == 1003) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            class37 var23 = field309[arg3];
            if (var23 != null) {
                class42 var24 = var23.field803;
                if (var24.field935 != null) {
                    var24 = var24.method763();
                }
                if (var24 != null) {
                    field314.method2639(100);
                    field314.method2447(var24.field909);
                }
            }
        }
        if (arg2 == 5) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field505 = arg0;
            field465 = arg1;
            field314.method2639(66);
            field314.method2447(Statics.field185 + arg1);
            field314.method2445(arg3 >> 14 & 0x7FFF);
            field314.method2409(Statics.field839 + arg0);
            field314.method2438(class141.field2187[82] ? 1 : 0);
        }
        if (arg2 == 23) {
            Statics.field92.method1916(Statics.field1120, arg0, arg1);
        }
        if (arg2 == 1002) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field314.method2639(38);
            field314.method2445(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1004) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field314.method2639(244);
            field314.method2400(arg3);
        }
        if (arg2 == 28) {
            field314.method2639(20);
            field314.method2402(arg1);
            class177 var25 = class177.method701(arg1);
            if (var25.field2908 != null && var25.field2908[0][0] == 5) {
                int var26 = var25.field2908[0][1];
                class180.field2950[var26] = 1 - class180.field2950[var26];
                method37(var26);
            }
        }
        if (arg2 == 18) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field505 = arg0;
            field465 = arg1;
            field314.method2639(28);
            field314.method2438(class141.field2187[82] ? 1 : 0);
            field314.method2445(arg3);
            field314.method2409(Statics.field839 + arg0);
            field314.method2447(Statics.field185 + arg1);
        }
        if (arg2 == 7) {
            class37 var27 = field309[arg3];
            if (var27 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(60);
                field314.method2447(Statics.field2961);
                field314.method2439(class141.field2187[82] ? 1 : 0);
                field314.method2409(arg3);
                field314.method2400(Statics.field621);
                field314.method2402(Statics.field2665);
            }
        }
        if (arg2 == 35) {
            field314.method2639(171);
            field314.method2409(arg3);
            field314.method2400(arg0);
            field314.method2565(arg1);
            field489 = 0;
            Statics.field1674 = class177.method701(arg1);
            field386 = arg0;
        }
        if (arg2 == 19) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field505 = arg0;
            field465 = arg1;
            field314.method2639(224);
            field314.method2437(class141.field2187[82] ? 1 : 0);
            field314.method2447(arg3);
            field314.method2400(Statics.field185 + arg1);
            field314.method2445(Statics.field839 + arg0);
        }
        if (arg2 == 31) {
            field314.method2639(48);
            field314.method2400(Statics.field2961);
            field314.method2447(arg3);
            field314.method2445(Statics.field621);
            field314.method2461(arg1);
            field314.method2402(Statics.field2665);
            field314.method2445(arg0);
            field489 = 0;
            Statics.field1674 = class177.method701(arg1);
            field386 = arg0;
        }
        if (arg2 == 47) {
            class3 var28 = field394[arg3];
            if (var28 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(220);
                field314.method2409(arg3);
                field314.method2437(class141.field2187[82] ? 1 : 0);
            }
        }
        if (arg2 == 6) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field505 = arg0;
            field465 = arg1;
            field314.method2639(243);
            field314.method2400(arg3 >> 14 & 0x7FFF);
            field314.method2445(Statics.field839 + arg0);
            field314.method2439(class141.field2187[82] ? 1 : 0);
            field314.method2409(Statics.field185 + arg1);
        }
        if (arg2 == 39) {
            field314.method2639(67);
            field314.method2402(arg1);
            field314.method2409(arg0);
            field314.method2409(arg3);
            field489 = 0;
            Statics.field1674 = class177.method701(arg1);
            field386 = arg0;
        }
        if (arg2 == 3) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field505 = arg0;
            field465 = arg1;
            field314.method2639(197);
            field314.method2445(Statics.field185 + arg1);
            field314.method2438(class141.field2187[82] ? 1 : 0);
            field314.method2400(arg3 >> 14 & 0x7FFF);
            field314.method2409(Statics.field839 + arg0);
        }
        if (arg2 == 37) {
            field314.method2639(157);
            field314.method2565(arg1);
            field314.method2445(arg3);
            field314.method2445(arg0);
            field489 = 0;
            Statics.field1674 = class177.method701(arg1);
            field386 = arg0;
        }
        if (arg2 == 49) {
            class3 var29 = field394[arg3];
            if (var29 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(11);
                field314.method2439(class141.field2187[82] ? 1 : 0);
                field314.method2409(arg3);
            }
        }
        if (arg2 == 11) {
            class37 var30 = field309[arg3];
            if (var30 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(142);
                field314.method2438(class141.field2187[82] ? 1 : 0);
                field314.method2409(arg3);
            }
        }
        if (arg2 == 1) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field505 = arg0;
            field465 = arg1;
            field314.method2639(175);
            field314.method2447(Statics.field621);
            field314.method2409(Statics.field2961);
            field314.method2571(Statics.field2665);
            field314.method2438(class141.field2187[82] ? 1 : 0);
            field314.method2445(Statics.field185 + arg1);
            field314.method2447(arg3 >> 14 & 0x7FFF);
            field314.method2447(Statics.field839 + arg0);
        }
        if (arg2 == 48) {
            class3 var31 = field394[arg3];
            if (var31 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(29);
                field314.method2409(arg3);
                field314.method2437(class141.field2187[82] ? 1 : 0);
            }
        }
        if (arg2 == 16) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field505 = arg0;
            field465 = arg1;
            field314.method2639(69);
            field314.method2445(Statics.field185 + arg1);
            field314.method2447(Statics.field621);
            field314.method2409(Statics.field839 + arg0);
            field314.method2447(arg3);
            field314.method2447(Statics.field2961);
            field314.method2571(Statics.field2665);
            field314.method2439(class141.field2187[82] ? 1 : 0);
        }
        if (arg2 == 24) {
            class177 var32 = class177.method701(arg1);
            boolean var33 = true;
            if (var32.field2800 > 0) {
                var33 = method2211(var32);
            }
            if (var33) {
                field314.method2639(20);
                field314.method2402(arg1);
            }
        }
        if (arg2 == 33) {
            field314.method2639(121);
            field314.method2400(arg0);
            field314.method2461(arg1);
            field314.method2409(arg3);
            field489 = 0;
            Statics.field1674 = class177.method701(arg1);
            field386 = arg0;
        }
        if (arg2 == 12) {
            class37 var34 = field309[arg3];
            if (var34 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(217);
                field314.method2409(arg3);
                field314.method2437(class141.field2187[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class37 var35 = field309[arg3];
            if (var35 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(168);
                field314.method2400(arg3);
                field314.method2399(class141.field2187[82] ? 1 : 0);
                field314.method2409(field427);
                field314.method2461(Statics.field1670);
            }
        }
        if (arg2 == 13) {
            class37 var36 = field309[arg3];
            if (var36 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(105);
                field314.method2445(arg3);
                field314.method2438(class141.field2187[82] ? 1 : 0);
            }
        }
        if (arg2 == 58) {
            class177 var37 = class177.method2998(arg1, arg0);
            if (var37 != null) {
                field314.method2639(177);
                field314.method2409(field428);
                field314.method2571(Statics.field1670);
                field314.method2445(field427);
                field314.method2400(var37.field2835);
                field314.method2571(arg1);
                field314.method2445(arg0);
            }
        }
        if (arg2 == 32) {
            field314.method2639(47);
            field314.method2409(field427);
            field314.method2400(arg0);
            field314.method2461(arg1);
            field314.method2400(arg3);
            field314.method2461(Statics.field1670);
            field489 = 0;
            Statics.field1674 = class177.method701(arg1);
            field386 = arg0;
        }
        if (arg2 == 25) {
            class177 var38 = class177.method2998(arg1, arg0);
            if (var38 != null) {
                method2354();
                int var39 = class182.method590(method143(var38));
                int var40 = var38.field2835;
                class177 var41 = class177.method2998(arg1, arg0);
                if (var41 != null && var41.field2906 != null) {
                    class1 var42 = new class1();
                    var42.field4 = var41;
                    var42.field2 = var41.field2906;
                    class39.method850(var42, 200000);
                }
                field428 = var40;
                field445 = true;
                Statics.field1670 = arg1;
                field427 = arg0;
                Statics.field2017 = var39;
                method2034(var41);
                field532 = 0;
                field429 = method3163(var38);
                if (field429 == null) {
                    field429 = "Null";
                }
                if (var38.field2795) {
                    field439 = var38.field2869 + class2.method1062(16777215);
                } else {
                    field439 = class2.method1062(65280) + var38.field2793 + class2.method1062(16777215);
                }
            }
            return;
        }
        if (arg2 == 44) {
            class3 var43 = field394[arg3];
            if (var43 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(242);
                field314.method2438(class141.field2187[82] ? 1 : 0);
                field314.method2409(arg3);
            }
        }
        if (arg2 == 17) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field505 = arg0;
            field465 = arg1;
            field314.method2639(70);
            field314.method2409(Statics.field839 + arg0);
            field314.method2445(Statics.field185 + arg1);
            field314.method2402(Statics.field1670);
            field314.method2399(class141.field2187[82] ? 1 : 0);
            field314.method2445(field427);
            field314.method2400(arg3);
        }
        if (arg2 == 45) {
            class3 var44 = field394[arg3];
            if (var44 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(123);
                field314.method2445(arg3);
                field314.method2437(class141.field2187[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class3 var45 = field394[arg3];
            if (var45 != null) {
                field381 = arg6;
                field352 = arg7;
                field384 = 2;
                field424 = 0;
                field505 = arg0;
                field465 = arg1;
                field314.method2639(118);
                field314.method2461(Statics.field2665);
                field314.method2445(arg3);
                field314.method2400(Statics.field2961);
                field314.method2409(Statics.field621);
                field314.method2399(class141.field2187[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field381 = arg6;
            field352 = arg7;
            field384 = 2;
            field424 = 0;
            field505 = arg0;
            field465 = arg1;
            field314.method2639(161);
            field314.method2447(field427);
            field314.method2445(Statics.field185 + arg1);
            field314.method2445(Statics.field839 + arg0);
            field314.method2445(arg3 >> 14 & 0x7FFF);
            field314.method2402(Statics.field1670);
            field314.method2439(class141.field2187[82] ? 1 : 0);
        }
        if (field532 != 0) {
            field532 = 0;
            method2034(class177.method701(Statics.field2665));
        }
        if (field445) {
            method2354();
        }
        if (Statics.field1674 != null && field489 == 0) {
            method2034(Statics.field1674);
        }
    }

    @ObfuscatedName("dk.cx(I)V")
    public static void method2354() {
        if (!field445) {
            return;
        }
        class177 var0 = class177.method2998(Statics.field1670, field427);
        if (var0 != null && var0.field2888 != null) {
            class1 var1 = new class1();
            var1.field4 = var0;
            var1.field2 = var0.field2888;
            class39.method850(var1, 200000);
        }
        field445 = false;
        method2034(var0);
    }

    @ObfuscatedName("cq.ct(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method2130(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field518 || field413 >= 500) {
            return;
        }
        field418[field413] = arg0;
        field329[field413] = arg1;
        field416[field413] = arg2;
        field323[field413] = arg3;
        field295[field413] = arg4;
        field415[field413] = arg5;
        field413++;
    }

    @ObfuscatedName("ev.cz(I)V")
    public static void method2868() {
        for (int var0 = 0; var0 < field413; var0++) {
            int var1 = field416[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field413 - 1) {
                    for (int var3 = var0; var3 < field413 - 1; var3++) {
                        field418[var3] = field418[var3 + 1];
                        field329[var3] = field329[var3 + 1];
                        field416[var3] = field416[var3 + 1];
                        field323[var3] = field323[var3 + 1];
                        field295[var3] = field295[var3 + 1];
                        field415[var3] = field415[var3 + 1];
                    }
                }
                field413--;
            }
        }
    }

    @ObfuscatedName("r.cg(IIIIB)V")
    public static final void method101(int arg0, int arg1, int arg2, int arg3) {
        if (field532 == 0 && !field445) {
            method2130(class161.field2428, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class109.field1920; var6++) {
            int var7 = class109.field1911[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field92.method1898(Statics.field1120, var8, var9, var7) >= 0) {
                    class43 var12 = class43.method96(var11);
                    if (var12.field984 != null) {
                        var12 = var12.method817();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field532 == 1) {
                        method2130(class161.field2517, field425 + " " + class2.field22 + " " + class2.method1062(65535) + var12.field953, 1, var7, var8, var9);
                    } else if (!field445) {
                        String[] var13 = var12.field974;
                        if (field442) {
                            var13 = method1858(var13);
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
                                    method2130(var13[var14], class2.method1062(65535) + var12.field953, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2130(class161.field2399, class2.method1062(65535) + var12.field953, 1002, var12.field950 << 14, var8, var9);
                    } else if ((Statics.field2017 & 0x4) == 4) {
                        method2130(field429, field439 + " " + class2.field22 + " " + class2.method1062(65535) + var12.field953, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class37 var16 = field309[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field803.field907 == 1 && (var16.field865 & 0x7F) == 64 && (var16.field832 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field395; var17++) {
                            class37 var18 = field309[field311[var17]];
                            if (var18 != null && var16 != var18 && var18.field803.field907 == 1 && var16.field865 == var18.field865 && var16.field832 == var18.field832) {
                                method3742(var18.field803, field311[var17], var8, var9);
                            }
                        }
                        int var19 = class35.field778;
                        int[] var20 = class35.field781;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class3 var22 = field394[var20[var21]];
                            if (var22 != null && var16.field865 == var22.field865 && var16.field832 == var22.field832) {
                                method179(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method3742(var16.field803, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var23 = field394[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field865 & 0x7F) == 64 && (var23.field832 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field395; var24++) {
                            class37 var25 = field309[field311[var24]];
                            if (var25 != null && var25.field803.field907 == 1 && var23.field865 == var25.field865 && var23.field832 == var25.field832) {
                                method3742(var25.field803, field311[var24], var8, var9);
                            }
                        }
                        int var26 = class35.field778;
                        int[] var27 = class35.field781;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class3 var29 = field394[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field865 == var29.field865 && var23.field832 == var29.field832) {
                                method179(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field345 == var11) {
                        var4 = var7;
                    } else {
                        method179(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class203 var30 = field404[Statics.field1120][var8][var9];
                    if (var30 != null) {
                        for (class31 var31 = (class31) var30.method3622(); var31 != null; var31 = (class31) var30.method3637()) {
                            class56 var32 = class56.method43(var31.field700);
                            if (field532 == 1) {
                                method2130(class161.field2517, field425 + " " + class2.field22 + " " + class2.method1062(16748608) + var32.field1184, 16, var31.field700, var8, var9);
                            } else if (!field445) {
                                String[] var33 = var32.field1198;
                                if (field442) {
                                    var33 = method1858(var33);
                                }
                                for (int var34 = 4; var34 >= 0; var34--) {
                                    if (var33 != null && var33[var34] != null) {
                                        byte var35 = 0;
                                        if (var34 == 0) {
                                            var35 = 18;
                                        }
                                        if (var34 == 1) {
                                            var35 = 19;
                                        }
                                        if (var34 == 2) {
                                            var35 = 20;
                                        }
                                        if (var34 == 3) {
                                            var35 = 21;
                                        }
                                        if (var34 == 4) {
                                            var35 = 22;
                                        }
                                        method2130(var33[var34], class2.method1062(16748608) + var32.field1184, var35, var31.field700, var8, var9);
                                    } else if (var34 == 2) {
                                        method2130(class161.field2619, class2.method1062(16748608) + var32.field1184, 20, var31.field700, var8, var9);
                                    }
                                }
                                method2130(class161.field2399, class2.method1062(16748608) + var32.field1184, 1004, var31.field700, var8, var9);
                            } else if ((Statics.field2017 & 0x1) == 1) {
                                method2130(field429, field439 + " " + class2.field22 + " " + class2.method1062(16748608) + var32.field1184, 17, var31.field700, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class3 var38 = field394[field345];
            method179(var38, field345, var36, var37);
        }
    }

    @ObfuscatedName("hj.cf(Lah;IIII)V")
    public static final void method3742(class42 arg0, int arg1, int arg2, int arg3) {
        if (field413 >= 400) {
            return;
        }
        if (arg0.field935 != null) {
            arg0 = arg0.method763();
        }
        if (arg0 == null || !arg0.field936 || arg0.field940 && field464 != arg1) {
            return;
        }
        String var4 = arg0.field921;
        if (arg0.field913 != 0) {
            var4 = var4 + method1089(arg0.field913, Statics.field2011.field42) + " " + class2.field24 + class161.field2523 + arg0.field913 + class2.field23;
        }
        if (field532 == 1) {
            method2130(class161.field2517, field425 + " " + class2.field22 + " " + class2.method1062(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field445) {
            String[] var5 = arg0.field911;
            if (field442) {
                var5 = method1858(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class161.field2490)) {
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
                        method2130(var5[var6], class2.method1062(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class161.field2490)) {
                        short var9 = 0;
                        if (field356 != class22.field582) {
                            if (field356 == class22.field569 || field356 == class22.field571 && arg0.field913 > Statics.field2011.field42) {
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
                            method2130(var5[var8], class2.method1062(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method2130(class161.field2399, class2.method1062(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2017 & 0x2) == 2) {
            method2130(field429, field439 + " " + class2.field22 + " " + class2.method1062(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("d.cr(Le;IIIB)V")
    public static final void method179(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2011 == arg0 || field413 >= 400) {
            return;
        }
        String var4;
        if (arg0.field40 == 0) {
            var4 = arg0.field59[0] + arg0.field44 + arg0.field59[1] + method1089(arg0.field42, Statics.field2011.field42) + " " + class2.field24 + class161.field2523 + arg0.field42 + class2.field23 + arg0.field59[2];
        } else {
            var4 = arg0.field59[0] + arg0.field44 + arg0.field59[1] + " " + class2.field24 + class161.field2524 + arg0.field40 + class2.field23 + arg0.field59[2];
        }
        if (field532 == 1) {
            method2130(class161.field2517, field425 + " " + class2.field22 + " " + class2.method1062(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field445) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field400[var5] != null) {
                    short var6 = 0;
                    if (field400[var5].equalsIgnoreCase(class161.field2490)) {
                        if (field299 == class22.field582) {
                            continue;
                        }
                        if (field299 == class22.field569 || field299 == class22.field571 && arg0.field42 > Statics.field2011.field42) {
                            var6 = 2000;
                        }
                        if (Statics.field2011.field56 != 0 && arg0.field56 != 0) {
                            if (Statics.field2011.field56 == arg0.field56) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field401[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field399[var5] + var6;
                    method2130(field400[var5], class2.method1062(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2017 & 0x8) == 8) {
            method2130(field429, field439 + " " + class2.field22 + " " + class2.method1062(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field413; var9++) {
            if (field416[var9] == 23) {
                field329[var9] = class2.method1062(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("bi.cb(III)Ljava/lang/String;")
    public static final String method1089(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method1062(16711680);
        } else if (var2 < -6) {
            return class2.method1062(16723968);
        } else if (var2 < -3) {
            return class2.method1062(16740352);
        } else if (var2 < 0) {
            return class2.method1062(16756736);
        } else if (var2 > 9) {
            return class2.method1062(65280);
        } else if (var2 > 6) {
            return class2.method1062(4259584);
        } else if (var2 > 3) {
            return class2.method1062(8453888);
        } else if (var2 > 0) {
            return class2.method1062(12648192);
        } else {
            return class2.method1062(16776960);
        }
    }

    @ObfuscatedName("fc.ch(IIIIIIIIB)V")
    public static final void method3075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class177.method2581(arg0)) {
            Statics.field564 = null;
            method1011(Statics.field2815[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field564 != null) {
                method1011(Statics.field564, -1412584499, arg1, arg2, arg3, arg4, Statics.field69, Statics.field555, arg7);
                Statics.field564 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field461[var8] = true;
            }
        } else {
            field461[arg7] = true;
        }
    }

    @ObfuscatedName("az.cl([Lfn;IIIIIIIIB)V")
    public static final void method1011(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class83.method1767(arg2, arg3, arg4, arg5);
        class95.method2036();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class177 var10 = arg0[var9];
            if (var10 != null && (var10.field2837 == arg1 || arg1 == -1412584499 && field541 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field479[field414] = var10.field2805 + arg6;
                    field480[field414] = var10.field2810 + arg7;
                    field360[field414] = var10.field2927;
                    field496[field414] = var10.field2878;
                    var11 = ++field414 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2814 = var11;
                var10.field2928 = field283;
                if (!var10.field2795 || !method658(var10)) {
                    if (var10.field2800 > 0) {
                        method1859(var10);
                    }
                    int var12 = var10.field2805 + arg6;
                    int var13 = var10.field2810 + arg7;
                    int var14 = var10.field2827;
                    if (field541 == var10) {
                        if (arg1 != -1412584499 && !var10.field2874) {
                            Statics.field564 = arg0;
                            Statics.field69 = arg6;
                            Statics.field555 = arg7;
                            continue;
                        }
                        if (field455 && field449) {
                            int var15 = class144.field2214;
                            int var16 = class144.field2215 * 148505657;
                            int var17 = var15 - field446;
                            int var18 = var16 - field447;
                            if (var17 < field450) {
                                var17 = field450;
                            }
                            if (var10.field2927 + var17 > field450 + field353.field2927) {
                                var17 = field450 + field353.field2927 - var10.field2927;
                            }
                            if (var18 < field516) {
                                var18 = field516;
                            }
                            if (var10.field2878 + var18 > field516 + field353.field2878) {
                                var18 = field516 + field353.field2878 - var10.field2878;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2874) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2930 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2930 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2927 + var12;
                        int var26 = var10.field2878 + var13;
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
                        int var29 = var10.field2927 + var12;
                        int var30 = var10.field2878 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2795 || var19 < var21 && var20 < var22) {
                        if (var10.field2800 != 0) {
                            if (var10.field2800 == 1336) {
                                if (field339) {
                                    var13 += 15;
                                    Statics.field202.method3840("Fps:" + field2260, var10.field2927 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field278) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field278) {
                                        var33 = 16711680;
                                    }
                                    Statics.field202.method3840("Mem:" + var32 + "k", var10.field2927 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2800 == 1337) {
                                field420 = var12;
                                field528 = var13;
                                method687(var12, var13, var10.field2927, var10.field2878);
                                field461[var10.field2814] = true;
                                class83.method1767(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2800 == 1338) {
                                method544();
                                class179 var34 = var10.method3230(false);
                                if (var34 != null) {
                                    class83.method1767(var12, var13, var34.field2949 + var12, var34.field2939 + var13);
                                    if (field507 == 2 || field507 == 5) {
                                        class83.method1784(var12, var13, 0, var34.field2942, var34.field2941);
                                    } else {
                                        int var35 = field358 + field343 & 0x7FF;
                                        int var36 = Statics.field2011.field865 / 32 + 48;
                                        int var37 = 464 - Statics.field2011.field832 / 32;
                                        Statics.field562.method1703(var12, var13, var34.field2949, var34.field2939, var36, var37, var35, field485 + 256, var34.field2942, var34.field2941);
                                        for (int var38 = 0; var38 < field501; var38++) {
                                            int var39 = field502[var38] * 4 + 2 - Statics.field2011.field865 / 32;
                                            int var40 = field503[var38] * 4 + 2 - Statics.field2011.field832 / 32;
                                            method1143(var12, var13, var39, var40, field504[var38], var34);
                                        }
                                        int var41 = 0;
                                        while (true) {
                                            if (var41 >= 104) {
                                                for (int var46 = 0; var46 < field395; var46++) {
                                                    class37 var47 = field309[field311[var46]];
                                                    if (var47 != null && var47.method20()) {
                                                        class42 var48 = var47.field803;
                                                        if (var48 != null && var48.field935 != null) {
                                                            var48 = var48.method763();
                                                        }
                                                        if (var48 != null && var48.field915 && var48.field936) {
                                                            int var49 = var47.field865 / 32 - Statics.field2011.field865 / 32;
                                                            int var50 = var47.field832 / 32 - Statics.field2011.field832 / 32;
                                                            method1143(var12, var13, var49, var50, Statics.field590[1], var34);
                                                        }
                                                    }
                                                }
                                                int var51 = class35.field778;
                                                int[] var52 = class35.field781;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    class3 var54 = field394[var52[var53]];
                                                    if (var54 != null && var54.method20() && !var54.field57 && Statics.field2011 != var54) {
                                                        int var55 = var54.field865 / 32 - Statics.field2011.field865 / 32;
                                                        int var56 = var54.field832 / 32 - Statics.field2011.field832 / 32;
                                                        boolean var57 = false;
                                                        if (method3016(var54.field44, true)) {
                                                            var57 = true;
                                                        }
                                                        boolean var58 = false;
                                                        for (int var59 = 0; var59 < Statics.field2301; var59++) {
                                                            if (var54.field44.equals(Statics.field237[var59].field632)) {
                                                                var58 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var60 = false;
                                                        if (Statics.field2011.field56 != 0 && var54.field56 != 0 && Statics.field2011.field56 == var54.field56) {
                                                            var60 = true;
                                                        }
                                                        if (var57) {
                                                            method1143(var12, var13, var55, var56, Statics.field590[3], var34);
                                                        } else if (var60) {
                                                            method1143(var12, var13, var55, var56, Statics.field590[4], var34);
                                                        } else if (var58) {
                                                            method1143(var12, var13, var55, var56, Statics.field590[5], var34);
                                                        } else {
                                                            method1143(var12, var13, var55, var56, Statics.field590[2], var34);
                                                        }
                                                    }
                                                }
                                                if (field419 != 0 && field283 % 20 < 10) {
                                                    if (field419 == 1 && field292 >= 0 && field292 < field309.length) {
                                                        class37 var61 = field309[field292];
                                                        if (var61 != null) {
                                                            int var62 = var61.field865 / 32 - Statics.field2011.field865 / 32;
                                                            int var63 = var61.field832 / 32 - Statics.field2011.field832 / 32;
                                                            method2294(var12, var13, var62, var63, Statics.field132[1], var34);
                                                        }
                                                    }
                                                    if (field419 == 2) {
                                                        int var64 = field294 * 4 - Statics.field839 * 4 + 2 - Statics.field2011.field865 / 32;
                                                        int var65 = field310 * 4 - Statics.field185 * 4 + 2 - Statics.field2011.field832 / 32;
                                                        method2294(var12, var13, var64, var65, Statics.field132[1], var34);
                                                    }
                                                    if (field419 == 10 && field337 >= 0 && field337 < field394.length) {
                                                        class3 var66 = field394[field337];
                                                        if (var66 != null) {
                                                            int var67 = var66.field865 / 32 - Statics.field2011.field865 / 32;
                                                            int var68 = var66.field832 / 32 - Statics.field2011.field832 / 32;
                                                            method2294(var12, var13, var67, var68, Statics.field132[1], var34);
                                                        }
                                                    }
                                                }
                                                if (field505 != 0) {
                                                    int var69 = field505 * 4 + 2 - Statics.field2011.field865 / 32;
                                                    int var70 = field465 * 4 + 2 - Statics.field2011.field832 / 32;
                                                    method1143(var12, var13, var69, var70, Statics.field132[0], var34);
                                                }
                                                if (!Statics.field2011.field57) {
                                                    class83.method1772(var34.field2949 / 2 + var12 - 1, var34.field2939 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var42 = 0; var42 < 104; var42++) {
                                                class203 var43 = field404[Statics.field1120][var41][var42];
                                                if (var43 != null) {
                                                    int var44 = var41 * 4 + 2 - Statics.field2011.field865 / 32;
                                                    int var45 = var42 * 4 + 2 - Statics.field2011.field832 / 32;
                                                    method1143(var12, var13, var44, var45, Statics.field590[0], var34);
                                                }
                                            }
                                            var41++;
                                        }
                                    }
                                    field477[var11] = true;
                                }
                                class83.method1767(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2800 == 1339) {
                                method3218(var10, var12, var13, var11);
                                class83.method1767(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2930 == 0) {
                            if (!var10.field2795 && method658(var10) && Statics.field198 != var10) {
                                continue;
                            }
                            if (!var10.field2795) {
                                if (var10.field2818 > var10.field2820 - var10.field2878) {
                                    var10.field2818 = var10.field2820 - var10.field2878;
                                }
                                if (var10.field2818 < 0) {
                                    var10.field2818 = 0;
                                }
                            }
                            method1011(arg0, var10.field2796, var19, var20, var21, var22, var12 - var10.field2895, var13 - var10.field2818, var11);
                            if (var10.field2920 != null) {
                                method1011(var10.field2920, var10.field2796, var19, var20, var21, var22, var12 - var10.field2895, var13 - var10.field2818, var11);
                            }
                            class4 var71 = (class4) field536.method3595((long) var10.field2796);
                            if (var71 != null) {
                                method3075(var71.field67, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class83.method1767(arg2, arg3, arg4, arg5);
                            class95.method2036();
                        }
                        if (field361 || field478[var11] || field483 > 1) {
                            if (var10.field2930 == 0 && !var10.field2795 && var10.field2820 > var10.field2878) {
                                int var72 = var10.field2927 + var12;
                                int var73 = var10.field2818;
                                int var74 = var10.field2878;
                                int var75 = var10.field2820;
                                Statics.field2935[0].method1838(var72, var13);
                                Statics.field2935[1].method1838(var72, var13 + var74 - 16);
                                class83.method1772(var72, var13 + 16, 16, var74 - 32, field351);
                                int var76 = (var74 - 32) * var74 / var75;
                                if (var76 < 8) {
                                    var76 = 8;
                                }
                                int var77 = (var74 - 32 - var76) * var73 / (var75 - var74);
                                class83.method1772(var72, var13 + 16 + var77, 16, var76, field482);
                                class83.method1813(var72, var13 + 16 + var77, var76, field354);
                                class83.method1813(var72 + 1, var13 + 16 + var77, var76, field354);
                                class83.method1780(var72, var13 + 16 + var77, 16, field354);
                                class83.method1780(var72, var13 + 17 + var77, 16, field354);
                                class83.method1813(var72 + 15, var13 + 16 + var77, var76, field350);
                                class83.method1813(var72 + 14, var13 + 17 + var77, var76 - 1, field350);
                                class83.method1780(var72, var13 + 15 + var77 + var76, 16, field350);
                                class83.method1780(var72 + 1, var13 + 14 + var77 + var76, 15, field350);
                            }
                            if (var10.field2930 != 1) {
                                if (var10.field2930 == 2) {
                                    int var78 = 0;
                                    for (int var79 = 0; var79 < var10.field2916; var79++) {
                                        for (int var80 = 0; var80 < var10.field2807; var80++) {
                                            int var81 = (var10.field2876 + 32) * var80 + var12;
                                            int var82 = (var10.field2863 + 32) * var79 + var13;
                                            if (var78 < 20) {
                                                var81 += var10.field2811[var78];
                                                var82 += var10.field2858[var78];
                                            }
                                            if (var10.field2870[var78] > 0) {
                                                boolean var83 = false;
                                                boolean var84 = false;
                                                int var85 = var10.field2870[var78] - 1;
                                                if (var81 + 32 > arg2 && var81 < arg4 && var82 + 32 > arg3 && var82 < arg5 || Statics.field702 == var10 && field387 == var78) {
                                                    class82 var86;
                                                    if (field532 == 1 && Statics.field621 == var78 && Statics.field2665 == var10.field2796) {
                                                        var86 = class56.method39(var85, var10.field2831[var78], 2, 0, 2, false);
                                                    } else {
                                                        var86 = class56.method39(var85, var10.field2831[var78], 1, 3153952, 2, false);
                                                    }
                                                    if (var86 == null) {
                                                        method2034(var10);
                                                    } else if (Statics.field702 == var10 && field387 == var78) {
                                                        int var87 = class144.field2214 - field388;
                                                        int var88 = class144.field2215 * 148505657 - field389;
                                                        if (var87 < 5 && var87 > -5) {
                                                            var87 = 0;
                                                        }
                                                        if (var88 < 5 && var88 > -5) {
                                                            var88 = 0;
                                                        }
                                                        if (field392 < 5) {
                                                            var87 = 0;
                                                            var88 = 0;
                                                        }
                                                        var86.method1689(var81 + var87, var82 + var88, 128);
                                                        if (arg1 != -1) {
                                                            class177 var89 = arg0[arg1 & 0xFFFF];
                                                            if (var82 + var88 < class83.field1491 && var89.field2818 > 0) {
                                                                int var90 = field330 * (class83.field1491 - var82 - var88) / 3;
                                                                if (var90 > field330 * 10) {
                                                                    var90 = field330 * 10;
                                                                }
                                                                if (var90 > var89.field2818) {
                                                                    var90 = var89.field2818;
                                                                }
                                                                var89.field2818 -= var90;
                                                                field389 += var90;
                                                                method2034(var89);
                                                            }
                                                            if (var82 + var88 + 32 > class83.field1492 && var89.field2818 < var89.field2820 - var89.field2878) {
                                                                int var91 = field330 * (var82 + var88 + 32 - class83.field1492) / 3;
                                                                if (var91 > field330 * 10) {
                                                                    var91 = field330 * 10;
                                                                }
                                                                if (var91 > var89.field2820 - var89.field2878 - var89.field2818) {
                                                                    var91 = var89.field2820 - var89.field2878 - var89.field2818;
                                                                }
                                                                var89.field2818 += var91;
                                                                field389 -= var91;
                                                                method2034(var89);
                                                            }
                                                        }
                                                    } else if (Statics.field1674 == var10 && field386 == var78) {
                                                        var86.method1689(var81, var82, 128);
                                                    } else {
                                                        var86.method1692(var81, var82);
                                                    }
                                                }
                                            } else if (var10.field2866 != null && var78 < 20) {
                                                class82 var92 = var10.method3228(var78);
                                                if (var92 != null) {
                                                    var92.method1692(var81, var82);
                                                } else if (class177.field2794) {
                                                    method2034(var10);
                                                }
                                            }
                                            var78++;
                                        }
                                    }
                                } else if (var10.field2930 == 3) {
                                    int var93;
                                    if (method1237(var10)) {
                                        var93 = var10.field2822;
                                        if (Statics.field198 == var10 && var10.field2873 != 0) {
                                            var93 = var10.field2873;
                                        }
                                    } else {
                                        var93 = var10.field2892;
                                        if (Statics.field198 == var10 && var10.field2823 != 0) {
                                            var93 = var10.field2823;
                                        }
                                    }
                                    if (var10.field2825) {
                                        switch(var10.field2812.field1511) {
                                            case 1:
                                                class83.method1773(var12, var13, var10.field2927, var10.field2878, var10.field2892, var10.field2822, 256 - (var10.field2827 & 0xFF), 256 - (var10.field2887 & 0xFF));
                                                break;
                                            case 2:
                                                class83.method1774(var12, var13, var10.field2927, var10.field2878, var10.field2892, var10.field2822, 256 - (var10.field2827 & 0xFF), 256 - (var10.field2887 & 0xFF));
                                                break;
                                            case 3:
                                                class83.method1800(var12, var13, var10.field2927, var10.field2878, var10.field2892, var10.field2822, 256 - (var10.field2827 & 0xFF), 256 - (var10.field2887 & 0xFF));
                                                break;
                                            case 4:
                                                class83.method1802(var12, var13, var10.field2927, var10.field2878, var10.field2892, var10.field2822, 256 - (var10.field2827 & 0xFF), 256 - (var10.field2887 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class83.method1772(var12, var13, var10.field2927, var10.field2878, var93);
                                                } else {
                                                    class83.method1771(var12, var13, var10.field2927, var10.field2878, var93, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class83.method1770(var12, var13, var10.field2927, var10.field2878, var93);
                                    } else {
                                        class83.method1779(var12, var13, var10.field2927, var10.field2878, var93, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2930 == 4) {
                                    class228 var94 = var10.method3227();
                                    if (var94 != null) {
                                        String var95 = var10.field2856;
                                        int var96;
                                        if (method1237(var10)) {
                                            var96 = var10.field2822;
                                            if (Statics.field198 == var10 && var10.field2873 != 0) {
                                                var96 = var10.field2873;
                                            }
                                            if (var10.field2857.length() > 0) {
                                                var95 = var10.field2857;
                                            }
                                        } else {
                                            var96 = var10.field2892;
                                            if (Statics.field198 == var10 && var10.field2823 != 0) {
                                                var96 = var10.field2823;
                                            }
                                        }
                                        if (var10.field2795 && var10.field2835 != -1) {
                                            class56 var97 = class56.method43(var10.field2835);
                                            var95 = var97.field1184;
                                            if (var95 == null) {
                                                var95 = "null";
                                            }
                                            if ((var97.field1195 == 1 || var10.field2917 != 1) && var10.field2917 != -1) {
                                                var95 = class2.method1062(16748608) + var95 + class2.field28 + " " + 'x' + method1568(var10.field2917);
                                            }
                                        }
                                        if (field403 == var10) {
                                            class161 var10000 = (class161) null;
                                            var95 = class161.field2496;
                                            var96 = var10.field2892;
                                        }
                                        if (!var10.field2795) {
                                            var95 = method3269(var95, var10);
                                        }
                                        var94.method3845(var95, var12, var13, var10.field2927, var10.field2878, var96, var10.field2861 ? 0 : -1, var10.field2859, var10.field2860, var10.field2885);
                                    } else if (class177.field2794) {
                                        method2034(var10);
                                    }
                                } else if (var10.field2930 == 5) {
                                    if (var10.field2795) {
                                        class82 var99;
                                        if (var10.field2835 == -1) {
                                            var99 = var10.method3226(false);
                                        } else {
                                            var99 = class56.method39(var10.field2835, var10.field2917, var10.field2845, var10.field2836, var10.field2914, false);
                                        }
                                        if (var99 != null) {
                                            int var100 = var99.field1476;
                                            int var101 = var99.field1482;
                                            if (var10.field2834) {
                                                class83.method1768(var12, var13, var10.field2927 + var12, var10.field2878 + var13);
                                                int var102 = (var10.field2927 + (var100 - 1)) / var100;
                                                int var103 = (var10.field2878 + (var101 - 1)) / var101;
                                                for (int var104 = 0; var104 < var102; var104++) {
                                                    for (int var105 = 0; var105 < var103; var105++) {
                                                        if (var10.field2833 != 0) {
                                                            var99.method1705(var100 / 2 + var100 * var104 + var12, var101 / 2 + var101 * var105 + var13, var10.field2833, 4096);
                                                        } else if (var14 == 0) {
                                                            var99.method1692(var100 * var104 + var12, var101 * var105 + var13);
                                                        } else {
                                                            var99.method1689(var100 * var104 + var12, var101 * var105 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class83.method1767(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var106 = var10.field2927 * 4096 / var100;
                                                if (var10.field2833 != 0) {
                                                    var99.method1705(var10.field2927 / 2 + var12, var10.field2878 / 2 + var13, var10.field2833, var106);
                                                } else if (var14 != 0) {
                                                    var99.method1700(var12, var13, var10.field2927, var10.field2878, 256 - (var14 & 0xFF));
                                                } else if (var10.field2927 == var100 && var10.field2878 == var101) {
                                                    var99.method1692(var12, var13);
                                                } else {
                                                    var99.method1694(var12, var13, var10.field2927, var10.field2878);
                                                }
                                            }
                                        } else if (class177.field2794) {
                                            method2034(var10);
                                        }
                                    } else {
                                        class82 var98 = var10.method3226(method1237(var10));
                                        if (var98 != null) {
                                            var98.method1692(var12, var13);
                                        } else if (class177.field2794) {
                                            method2034(var10);
                                        }
                                    }
                                } else if (var10.field2930 == 6) {
                                    boolean var107 = method1237(var10);
                                    int var108;
                                    if (var107) {
                                        var108 = var10.field2844;
                                    } else {
                                        var108 = var10.field2832;
                                    }
                                    class109 var109 = null;
                                    int var110 = 0;
                                    if (var10.field2835 != -1) {
                                        class56 var111 = class56.method43(var10.field2835);
                                        if (var111 != null) {
                                            class56 var112 = var111.method1108(var10.field2917);
                                            var109 = var112.method1117(1);
                                            if (var109 == null) {
                                                method2034(var10);
                                            } else {
                                                var109.method2237();
                                                var110 = var109.field1537 / 2;
                                            }
                                        }
                                    } else if (var10.field2787 == 5) {
                                        if (var10.field2840 == 0) {
                                            var109 = field517.method3319((class45) null, -1, (class45) null, -1);
                                        } else {
                                            var109 = Statics.field2011.method22();
                                        }
                                    } else if (var108 == -1) {
                                        var109 = var10.method3253((class45) null, -1, var107, Statics.field2011.field51);
                                        if (var109 == null && class177.field2794) {
                                            method2034(var10);
                                        }
                                    } else {
                                        class45 var113 = class45.method637(var108);
                                        var109 = var10.method3253(var113, var10.field2918, var107, Statics.field2011.field51);
                                        if (var109 == null && class177.field2794) {
                                            method2034(var10);
                                        }
                                    }
                                    class95.method2039(var10.field2927 / 2 + var12, var10.field2878 / 2 + var13);
                                    int var114 = var10.field2821 * class95.field1661[var10.field2854] >> 16;
                                    int var115 = var10.field2821 * class95.field1662[var10.field2854] >> 16;
                                    if (var109 != null) {
                                        if (var10.field2795) {
                                            var109.method2237();
                                            if (var10.field2853) {
                                                var109.method2236(0, var10.field2848, var10.field2849, var10.field2854, var10.field2864, var10.field2852 + var110 + var114, var10.field2852 + var115, var10.field2821);
                                            } else {
                                                var109.method2270(0, var10.field2848, var10.field2849, var10.field2854, var10.field2864, var10.field2852 + var110 + var114, var10.field2852 + var115);
                                            }
                                        } else {
                                            var109.method2270(0, var10.field2848, 0, var10.field2854, 0, var114, var115);
                                        }
                                    }
                                    class95.method2038();
                                } else {
                                    if (var10.field2930 == 7) {
                                        class228 var116 = var10.method3227();
                                        if (var116 == null) {
                                            if (class177.field2794) {
                                                method2034(var10);
                                            }
                                            continue;
                                        }
                                        int var117 = 0;
                                        for (int var118 = 0; var118 < var10.field2916; var118++) {
                                            for (int var119 = 0; var119 < var10.field2807; var119++) {
                                                if (var10.field2870[var117] > 0) {
                                                    class56 var120 = class56.method43(var10.field2870[var117] - 1);
                                                    String var121;
                                                    if (var120.field1195 != 1 && var10.field2831[var117] == 1) {
                                                        var121 = class2.method1062(16748608) + var120.field1184 + class2.field28;
                                                    } else {
                                                        var121 = class2.method1062(16748608) + var120.field1184 + class2.field28 + " " + 'x' + method1568(var10.field2831[var117]);
                                                    }
                                                    int var122 = (var10.field2876 + 115) * var119 + var12;
                                                    int var123 = (var10.field2863 + 12) * var118 + var13;
                                                    if (var10.field2859 == 0) {
                                                        var116.method3838(var121, var122, var123, var10.field2892, var10.field2861 ? 0 : -1);
                                                    } else if (var10.field2859 == 1) {
                                                        var116.method3855(var121, var10.field2927 / 2 + var122, var123, var10.field2892, var10.field2861 ? 0 : -1);
                                                    } else {
                                                        var116.method3840(var121, var10.field2927 + var122 - 1, var123, var10.field2892, var10.field2861 ? 0 : -1);
                                                    }
                                                }
                                                var117++;
                                            }
                                        }
                                    }
                                    if (var10.field2930 == 8 && Statics.field643 == var10 && field423 == field391) {
                                        int var124 = 0;
                                        int var125 = 0;
                                        class228 var126 = Statics.field202;
                                        String var127 = var10.field2856;
                                        String var128 = method3269(var127, var10);
                                        while (var128.length() > 0) {
                                            int var129 = var128.indexOf(class2.field21);
                                            String var130;
                                            if (var129 == -1) {
                                                var130 = var128;
                                                var128 = "";
                                            } else {
                                                var130 = var128.substring(0, var129);
                                                var128 = var128.substring(var129 + 4);
                                            }
                                            int var131 = var126.method3833(var130);
                                            if (var131 > var124) {
                                                var124 = var131;
                                            }
                                            var125 += var126.field3238 + 1;
                                        }
                                        var124 += 6;
                                        var125 += 7;
                                        int var132 = var10.field2927 + var12 - 5 - var124;
                                        int var133 = var10.field2878 + var13 + 5;
                                        if (var132 < var12 + 5) {
                                            var132 = var12 + 5;
                                        }
                                        if (var124 + var132 > arg4) {
                                            var132 = arg4 - var124;
                                        }
                                        if (var125 + var133 > arg5) {
                                            var133 = arg5 - var125;
                                        }
                                        class83.method1772(var132, var133, var124, var125, 16777120);
                                        class83.method1770(var132, var133, var124, var125, 0);
                                        String var134 = var10.field2856;
                                        int var135 = var126.field3238 + var133 + 2;
                                        String var136 = method3269(var134, var10);
                                        while (var136.length() > 0) {
                                            int var137 = var136.indexOf(class2.field21);
                                            String var138;
                                            if (var137 == -1) {
                                                var138 = var136;
                                                var136 = "";
                                            } else {
                                                var138 = var136.substring(0, var137);
                                                var136 = var136.substring(var137 + 4);
                                            }
                                            var126.method3838(var138, var132 + 3, var135, 0, -1);
                                            var135 += var126.field3238 + 1;
                                        }
                                    }
                                    if (var10.field2930 == 9) {
                                        if (var10.field2829 == 1) {
                                            int var139;
                                            int var140;
                                            int var141;
                                            int var142;
                                            if (var10.field2830) {
                                                var139 = var12;
                                                var140 = var10.field2878 + var13;
                                                var141 = var10.field2927 + var12;
                                                var142 = var13;
                                            } else {
                                                var139 = var12;
                                                var140 = var13;
                                                var141 = var10.field2927 + var12;
                                                var142 = var10.field2878 + var13;
                                            }
                                            class83.method1764(var139, var140, var141, var142, var10.field2892);
                                        } else {
                                            int var143 = var10.field2927 >= 0 ? var10.field2927 : -var10.field2927;
                                            int var144 = var10.field2878 >= 0 ? var10.field2878 : -var10.field2878;
                                            int var145 = var143;
                                            if (var143 < var144) {
                                                var145 = var144;
                                            }
                                            if (var145 != 0) {
                                                int var146 = (var10.field2927 << 16) / var145;
                                                int var147 = (var10.field2878 << 16) / var145;
                                                if (var147 <= var146) {
                                                    var146 = -var146;
                                                } else {
                                                    var147 = -var147;
                                                }
                                                int var148 = var10.field2829 * var147 >> 17;
                                                int var149 = var10.field2829 * var147 + 1 >> 17;
                                                int var150 = var10.field2829 * var146 >> 17;
                                                int var151 = var10.field2829 * var146 + 1 >> 17;
                                                int var152 = var12 + var148;
                                                int var153 = var12 - var149;
                                                int var154 = var10.field2927 + var12 - var149;
                                                int var155 = var10.field2927 + var12 + var148;
                                                int var156 = var13 + var150;
                                                int var157 = var13 - var151;
                                                int var158 = var10.field2878 + var13 - var151;
                                                int var159 = var10.field2878 + var13 + var150;
                                                class95.method2044(var152, var153, var154);
                                                class95.method2041(var156, var157, var158, var152, var153, var154, var10.field2892);
                                                class95.method2044(var152, var154, var155);
                                                class95.method2041(var156, var158, var159, var152, var154, var155, var10.field2892);
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

    @ObfuscatedName("fn.ce(Ljava/lang/String;Lfn;I)Ljava/lang/String;")
    public static String method3269(String arg0, class177 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = Statics.method10(arg1, var2 - 1);
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
                if (Statics.field20 != null) {
                    var8 = class167.method3741(Statics.field20.field2276);
                    if (Statics.field20.field2283 != null) {
                        var8 = (String) Statics.field20.field2283;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bb.cu(IB)Ljava/lang/String;")
    public static final String method1568(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field25 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1062(65408) + var1.substring(0, var1.length() - 8) + class161.field2528 + " " + class2.field24 + var1 + class2.field23 + class2.field28;
        } else if (var1.length() > 6) {
            return " " + class2.method1062(16777215) + var1.substring(0, var1.length() - 4) + class161.field2530 + " " + class2.field24 + var1 + class2.field23 + class2.field28;
        } else {
            return " " + class2.method1062(16776960) + var1 + class2.field28;
        }
    }

    @ObfuscatedName("p.cd(Lfn;B)V")
    public static void method152(class177 arg0) {
        class177 var1 = arg0.field2837 == -1 ? null : class177.method701(arg0.field2837);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field175;
            var3 = Statics.field265;
        } else {
            var2 = var1.field2927;
            var3 = var1.field2878;
        }
        method1594(arg0, var2, var3, false);
        method1633(arg0, var2, var3);
    }

    @ObfuscatedName("client.cv([Lfn;Lfn;ZB)V")
    public static void method542(class177[] arg0, class177 arg1, boolean arg2) {
        int var3 = arg1.field2819 == 0 ? arg1.field2927 : arg1.field2819;
        int var4 = arg1.field2820 == 0 ? arg1.field2878 : arg1.field2820;
        method89(arg0, arg1.field2796, var3, var4, arg2);
        if (arg1.field2920 != null) {
            method89(arg1.field2920, arg1.field2796, var3, var4, arg2);
        }
        class4 var5 = (class4) field536.method3595((long) arg1.field2796);
        if (var5 != null) {
            int var6 = var5.field67;
            if (class177.method2581(var6)) {
                method89(Statics.field2815[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2800 == 1337) {
        }
    }

    @ObfuscatedName("j.cn([Lfn;IIIZB)V")
    public static void method89(class177[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class177 var6 = arg0[var5];
            if (var6 != null && var6.field2837 == arg1) {
                method1594(var6, arg2, arg3, arg4);
                method1633(var6, arg2, arg3);
                if (var6.field2895 > var6.field2819 - var6.field2927) {
                    var6.field2895 = var6.field2819 - var6.field2927;
                }
                if (var6.field2895 < 0) {
                    var6.field2895 = 0;
                }
                if (var6.field2818 > var6.field2820 - var6.field2878) {
                    var6.field2818 = var6.field2820 - var6.field2878;
                }
                if (var6.field2818 < 0) {
                    var6.field2818 = 0;
                }
                if (var6.field2930 == 0) {
                    method542(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("bw.ca(Lfn;IIZB)V")
    public static void method1594(class177 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2927;
        int var5 = arg0.field2878;
        if (arg0.field2803 == 0) {
            arg0.field2927 = arg0.field2807;
        } else if (arg0.field2803 == 1) {
            arg0.field2927 = arg1 - arg0.field2807;
        } else if (arg0.field2803 == 2) {
            arg0.field2927 = arg0.field2807 * arg1 >> 14;
        }
        if (arg0.field2804 == 0) {
            arg0.field2878 = arg0.field2916;
        } else if (arg0.field2804 == 1) {
            arg0.field2878 = arg2 - arg0.field2916;
        } else if (arg0.field2804 == 2) {
            arg0.field2878 = arg0.field2916 * arg2 >> 14;
        }
        if (arg0.field2803 == 4) {
            arg0.field2927 = arg0.field2915 * arg0.field2878 / arg0.field2919;
        }
        if (arg0.field2804 == 4) {
            arg0.field2878 = arg0.field2927 * arg0.field2919 / arg0.field2915;
        }
        if (field441 && arg0.field2930 == 0) {
            if (arg0.field2878 < 5 && arg0.field2927 < 5) {
                arg0.field2878 = 5;
                arg0.field2927 = 5;
            } else {
                if (arg0.field2878 <= 0) {
                    arg0.field2878 = 5;
                }
                if (arg0.field2927 <= 0) {
                    arg0.field2927 = 5;
                }
            }
        }
        if (arg0.field2800 == 1337) {
            field293 = arg0;
        }
        if (arg3 && arg0.field2905 != null && (arg0.field2927 != var4 || arg0.field2878 != var5)) {
            class1 var6 = new class1();
            var6.field4 = arg0;
            var6.field2 = arg0.field2905;
            field328.method3616(var6);
        }
    }

    @ObfuscatedName("cc.cy(Lfn;IIB)V")
    public static void method1633(class177 arg0, int arg1, int arg2) {
        if (arg0.field2801 == 0) {
            arg0.field2805 = arg0.field2817;
        } else if (arg0.field2801 == 1) {
            arg0.field2805 = (arg1 - arg0.field2927) / 2 + arg0.field2817;
        } else if (arg0.field2801 == 2) {
            arg0.field2805 = arg1 - arg0.field2927 - arg0.field2817;
        } else if (arg0.field2801 == 3) {
            arg0.field2805 = arg0.field2817 * arg1 >> 14;
        } else if (arg0.field2801 == 4) {
            arg0.field2805 = (arg0.field2817 * arg1 >> 14) + (arg1 - arg0.field2927) / 2;
        } else {
            arg0.field2805 = arg1 - arg0.field2927 - (arg0.field2817 * arg1 >> 14);
        }
        if (arg0.field2910 == 0) {
            arg0.field2810 = arg0.field2806;
        } else if (arg0.field2910 == 1) {
            arg0.field2810 = (arg2 - arg0.field2878) / 2 + arg0.field2806;
        } else if (arg0.field2910 == 2) {
            arg0.field2810 = arg2 - arg0.field2878 - arg0.field2806;
        } else if (arg0.field2910 == 3) {
            arg0.field2810 = arg0.field2806 * arg2 >> 14;
        } else if (arg0.field2910 == 4) {
            arg0.field2810 = (arg0.field2806 * arg2 >> 14) + (arg2 - arg0.field2878) / 2;
        } else {
            arg0.field2810 = arg2 - arg0.field2878 - (arg0.field2806 * arg2 >> 14);
        }
        if (!field441 || arg0.field2930 != 0) {
            return;
        }
        if (arg0.field2805 < 0) {
            arg0.field2805 = 0;
        } else if (arg0.field2927 + arg0.field2805 > arg1) {
            arg0.field2805 = arg1 - arg0.field2927;
        }
        if (arg0.field2810 < 0) {
            arg0.field2810 = 0;
        } else if (arg0.field2878 + arg0.field2810 > arg2) {
            arg0.field2810 = arg2 - arg0.field2878;
        }
    }

    @ObfuscatedName("o.co(Lfn;IIIIIII)V")
    public static final void method36(class177 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field355) {
            field506 = 32;
        } else {
            field506 = 0;
        }
        field355 = false;
        if (class144.field2217 == 1 || !Statics.field236 && class144.field2217 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2818 -= 4;
                method2034(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2818 += 4;
                method2034(arg0);
            } else if (arg5 >= arg1 - field506 && arg5 < field506 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2818 = (arg4 - arg3) * var8 / var9;
                method2034(arg0);
                field355 = true;
            }
        }
        if (field469 == 0) {
            return;
        }
        int var10 = arg0.field2927;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2818 += field469 * 45;
            method2034(arg0);
        }
    }

    @ObfuscatedName("bq.ci(Lfn;I)Z")
    public static final boolean method1237(class177 arg0) {
        if (arg0.field2909 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2909.length; var1++) {
            int var2 = Statics.method10(arg0, var1);
            int var3 = arg0.field2862[var1];
            if (arg0.field2909[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2909[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2909[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("cm.cq(Lfn;III)V")
    public static final void method2131(class177 arg0, int arg1, int arg2) {
        if (arg0.field2799 == 1) {
            method2130(arg0.field2913, "", 24, 0, 0, arg0.field2796);
        }
        if (arg0.field2799 == 2 && !field445) {
            String var3 = method3163(arg0);
            if (var3 != null) {
                method2130(var3, class2.method1062(65280) + arg0.field2793, 25, 0, -1, arg0.field2796);
            }
        }
        if (arg0.field2799 == 3) {
            method2130(class161.field2526, "", 26, 0, 0, arg0.field2796);
        }
        if (arg0.field2799 == 4) {
            method2130(arg0.field2913, "", 28, 0, 0, arg0.field2796);
        }
        if (arg0.field2799 == 5) {
            method2130(arg0.field2913, "", 29, 0, 0, arg0.field2796);
        }
        if (arg0.field2799 == 6 && field403 == null) {
            method2130(arg0.field2913, "", 30, 0, -1, arg0.field2796);
        }
        if (arg0.field2930 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2878; var5++) {
                for (int var6 = 0; var6 < arg0.field2927; var6++) {
                    int var7 = (arg0.field2876 + 32) * var6;
                    int var8 = (arg0.field2863 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2811[var4];
                        var8 += arg0.field2858[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field390 = var4;
                        Statics.field802 = arg0;
                        if (arg0.field2870[var4] > 0) {
                            class56 var9 = class56.method43(arg0.field2870[var4] - 1);
                            if (field532 == 1 && class182.method588(method143(arg0))) {
                                if (Statics.field2665 != arg0.field2796 || Statics.field621 != var4) {
                                    method2130(class161.field2517, field425 + " " + class2.field22 + " " + class2.method1062(16748608) + var9.field1184, 31, var9.field1182, var4, arg0.field2796);
                                }
                            } else if (!field445 || !class182.method588(method143(arg0))) {
                                String[] var10 = var9.field1199;
                                if (field442) {
                                    var10 = method1858(var10);
                                }
                                if (class182.method588(method143(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            method2130(var10[var11], class2.method1062(16748608) + var9.field1184, var12, var9.field1182, var4, arg0.field2796);
                                        } else if (var11 == 4) {
                                            method2130(class161.field2371, class2.method1062(16748608) + var9.field1184, 37, var9.field1182, var4, arg0.field2796);
                                        }
                                    }
                                }
                                int var13 = method143(arg0);
                                boolean var14 = (var13 >> 31 & 0x1) != 0;
                                if (var14) {
                                    method2130(class161.field2517, class2.method1062(16748608) + var9.field1184, 38, var9.field1182, var4, arg0.field2796);
                                }
                                class182 var10000 = (class182) null;
                                if (class182.method588(method143(arg0)) && var10 != null) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var10[var15] != null) {
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 33;
                                            }
                                            if (var15 == 1) {
                                                var16 = 34;
                                            }
                                            if (var15 == 2) {
                                                var16 = 35;
                                            }
                                            method2130(var10[var15], class2.method1062(16748608) + var9.field1184, var16, var9.field1182, var4, arg0.field2796);
                                        }
                                    }
                                }
                                String[] var17 = arg0.field2912;
                                if (field442) {
                                    var17 = method1858(var17);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 39;
                                            }
                                            if (var18 == 1) {
                                                var19 = 40;
                                            }
                                            if (var18 == 2) {
                                                var19 = 41;
                                            }
                                            if (var18 == 3) {
                                                var19 = 42;
                                            }
                                            if (var18 == 4) {
                                                var19 = 43;
                                            }
                                            method2130(var17[var18], class2.method1062(16748608) + var9.field1184, var19, var9.field1182, var4, arg0.field2796);
                                        }
                                    }
                                }
                                method2130(class161.field2399, class2.method1062(16748608) + var9.field1184, 1005, var9.field1182, var4, arg0.field2796);
                            } else if ((Statics.field2017 & 0x10) == 16) {
                                method2130(field429, field439 + " " + class2.field22 + " " + class2.method1062(16748608) + var9.field1184, 32, var9.field1182, var4, arg0.field2796);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2795) {
            return;
        }
        if (!field445) {
            for (int var20 = 9; var20 >= 5; var20--) {
                String var21;
                if (!class182.method2964(method143(arg0), var20) && arg0.field2896 == null) {
                    var21 = null;
                } else if (arg0.field2813 == null || arg0.field2813.length <= var20 || arg0.field2813[var20] == null || arg0.field2813[var20].trim().length() == 0) {
                    var21 = null;
                } else {
                    var21 = arg0.field2813[var20];
                }
                if (var21 != null) {
                    method2130(var21, arg0.field2869, 1007, var20 + 1, arg0.field2797, arg0.field2796);
                }
            }
            String var23 = method3163(arg0);
            if (var23 != null) {
                method2130(var23, arg0.field2869, 25, 0, arg0.field2797, arg0.field2796);
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = method123(arg0, var24);
                if (var25 != null) {
                    method2130(var25, arg0.field2869, 57, var24 + 1, arg0.field2797, arg0.field2796);
                }
            }
            int var26 = method143(arg0);
            boolean var27 = (var26 & 0x1) != 0;
            if (var27) {
                method2130(class161.field2564, "", 30, 0, arg0.field2797, arg0.field2796);
            }
        } else if (class182.method1862(method143(arg0)) && (Statics.field2017 & 0x20) == 32) {
            method2130(field429, field439 + " " + class2.field22 + " " + arg0.field2869, 58, 0, arg0.field2797, arg0.field2796);
        }
    }

    @ObfuscatedName("ew.cm(IIIIIIII)V")
    public static final void method2865(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class177.method2581(arg0)) {
            method1061(Statics.field2815[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ae.ck([Lfn;IIIIIIIB)V")
    public static final void method1061(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class177 var9 = arg0[var8];
            if (var9 != null && (!var9.field2795 || var9.field2930 == 0 || var9.field2808 || method143(var9) != 0 || field353 == var9 || var9.field2800 == 1338) && var9.field2837 == arg1 && (!var9.field2795 || !method658(var9))) {
                int var10 = var9.field2805 + arg6;
                int var11 = var9.field2810 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2930 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2930 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2927 + var10;
                    int var19 = var9.field2878 + var11;
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
                    int var22 = var9.field2927 + var10;
                    int var23 = var9.field2878 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field541 == var9) {
                    field452 = true;
                    field453 = var10;
                    field454 = var11;
                }
                if (!var9.field2795 || var12 < var14 && var13 < var15) {
                    int var24 = class144.field2214;
                    int var25 = class144.field2215 * 148505657;
                    if (class144.field2225 != 0) {
                        var24 = class144.field2221;
                        var25 = class144.field2223;
                    }
                    if (var9.field2800 == 1337) {
                        if (!field282 && !field518 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method101(var24, var25, var12, var13);
                        }
                    } else if (var9.field2800 == 1338) {
                        method3298(var9, var10, var11);
                    } else {
                        if (!field518 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2131(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2930 == 0) {
                            if (!var9.field2795 && method658(var9) && Statics.field198 != var9) {
                                continue;
                            }
                            method1061(arg0, var9.field2796, var12, var13, var14, var15, var10 - var9.field2895, var11 - var9.field2818);
                            if (var9.field2920 != null) {
                                method1061(var9.field2920, var9.field2796, var12, var13, var14, var15, var10 - var9.field2895, var11 - var9.field2818);
                            }
                            class4 var26 = (class4) field536.method3595((long) var9.field2796);
                            if (var26 != null) {
                                if (var26.field65 == 0 && class144.field2214 >= var12 && class144.field2215 * 148505657 >= var13 && class144.field2214 < var14 && class144.field2215 * 148505657 < var15 && !field518 && !field441) {
                                    for (class1 var27 = (class1) field328.method3621(); var27 != null; var27 = (class1) field328.method3630()) {
                                        if (var27.field9) {
                                            var27.method3729();
                                            var27.field4.field2921 = false;
                                        }
                                    }
                                    if (Statics.field1445 == 0) {
                                        field541 = null;
                                        field353 = null;
                                    }
                                    if (!field518) {
                                        field418[0] = class161.field2443;
                                        field329[0] = "";
                                        field416[0] = 1006;
                                        field413 = 1;
                                    }
                                }
                                method2865(var26.field67, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2795) {
                            if (var9.field2929) {
                                if (class144.field2214 >= var12 && class144.field2215 * 148505657 >= var13 && class144.field2214 < var14 && class144.field2215 * 148505657 < var15) {
                                    for (class1 var28 = (class1) field328.method3621(); var28 != null; var28 = (class1) field328.method3630()) {
                                        if (var28.field9) {
                                            var28.method3729();
                                            var28.field4.field2921 = false;
                                        }
                                    }
                                    if (Statics.field1445 == 0) {
                                        field541 = null;
                                        field353 = null;
                                    }
                                    if (!field518) {
                                        field418[0] = class161.field2443;
                                        field329[0] = "";
                                        field416[0] = 1006;
                                        field413 = 1;
                                    }
                                }
                            } else if (var9.field2889 && class144.field2214 >= var12 && class144.field2215 * 148505657 >= var13 && class144.field2214 < var14 && class144.field2215 * 148505657 < var15) {
                                for (class1 var29 = (class1) field328.method3621(); var29 != null; var29 = (class1) field328.method3630()) {
                                    if (var29.field9 && var29.field4.field2897 == var29.field2) {
                                        var29.method3729();
                                    }
                                }
                            }
                            boolean var30;
                            if (class144.field2214 >= var12 && class144.field2215 * 148505657 >= var13 && class144.field2214 < var14 && class144.field2215 * 148505657 < var15) {
                                var30 = true;
                            } else {
                                var30 = false;
                            }
                            boolean var31 = false;
                            if ((class144.field2217 == 1 || !Statics.field236 && class144.field2217 == 4) && var30) {
                                var31 = true;
                            }
                            boolean var32 = false;
                            if ((class144.field2225 == 1 || !Statics.field236 && class144.field2225 == 4) && class144.field2221 >= var12 && class144.field2223 >= var13 && class144.field2221 < var14 && class144.field2223 < var15) {
                                var32 = true;
                            }
                            if (var32) {
                                method3819(var9, class144.field2221 - var10, class144.field2223 - var11);
                            }
                            if (field541 != null && field541 != var9 && var30) {
                                int var33 = method143(var9);
                                boolean var34 = (var33 >> 20 & 0x1) != 0;
                                if (var34) {
                                    field448 = var9;
                                }
                            }
                            if (field353 == var9) {
                                field449 = true;
                                field450 = var10;
                                field516 = var11;
                            }
                            if (var9.field2808) {
                                if (var30 && field469 != 0 && var9.field2897 != null) {
                                    class1 var35 = new class1();
                                    var35.field9 = true;
                                    var35.field4 = var9;
                                    var35.field5 = field469;
                                    var35.field2 = var9.field2897;
                                    field328.method3616(var35);
                                }
                                if (field541 != null || Statics.field702 != null || field518) {
                                    var32 = false;
                                    var31 = false;
                                    var30 = false;
                                }
                                if (!var9.field2922 && var32) {
                                    var9.field2922 = true;
                                    if (var9.field2839 != null) {
                                        class1 var36 = new class1();
                                        var36.field9 = true;
                                        var36.field4 = var9;
                                        var36.field1 = class144.field2221 - var10;
                                        var36.field5 = class144.field2223 - var11;
                                        var36.field2 = var9.field2839;
                                        field328.method3616(var36);
                                    }
                                }
                                if (var9.field2922 && var31 && var9.field2879 != null) {
                                    class1 var37 = new class1();
                                    var37.field9 = true;
                                    var37.field4 = var9;
                                    var37.field1 = class144.field2214 - var10;
                                    var37.field5 = class144.field2215 * 148505657 - var11;
                                    var37.field2 = var9.field2879;
                                    field328.method3616(var37);
                                }
                                if (var9.field2922 && !var31) {
                                    var9.field2922 = false;
                                    if (var9.field2880 != null) {
                                        class1 var38 = new class1();
                                        var38.field9 = true;
                                        var38.field4 = var9;
                                        var38.field1 = class144.field2214 - var10;
                                        var38.field5 = class144.field2215 * 148505657 - var11;
                                        var38.field2 = var9.field2880;
                                        field383.method3616(var38);
                                    }
                                }
                                if (var31 && var9.field2881 != null) {
                                    class1 var39 = new class1();
                                    var39.field9 = true;
                                    var39.field4 = var9;
                                    var39.field1 = class144.field2214 - var10;
                                    var39.field5 = class144.field2215 * 148505657 - var11;
                                    var39.field2 = var9.field2881;
                                    field328.method3616(var39);
                                }
                                if (!var9.field2921 && var30) {
                                    var9.field2921 = true;
                                    if (var9.field2882 != null) {
                                        class1 var40 = new class1();
                                        var40.field9 = true;
                                        var40.field4 = var9;
                                        var40.field1 = class144.field2214 - var10;
                                        var40.field5 = class144.field2215 * 148505657 - var11;
                                        var40.field2 = var9.field2882;
                                        field328.method3616(var40);
                                    }
                                }
                                if (var9.field2921 && var30 && var9.field2883 != null) {
                                    class1 var41 = new class1();
                                    var41.field9 = true;
                                    var41.field4 = var9;
                                    var41.field1 = class144.field2214 - var10;
                                    var41.field5 = class144.field2215 * 148505657 - var11;
                                    var41.field2 = var9.field2883;
                                    field328.method3616(var41);
                                }
                                if (var9.field2921 && !var30) {
                                    var9.field2921 = false;
                                    if (var9.field2884 != null) {
                                        class1 var42 = new class1();
                                        var42.field9 = true;
                                        var42.field4 = var9;
                                        var42.field1 = class144.field2214 - var10;
                                        var42.field5 = class144.field2215 * 148505657 - var11;
                                        var42.field2 = var9.field2884;
                                        field383.method3616(var42);
                                    }
                                }
                                if (var9.field2872 != null) {
                                    class1 var43 = new class1();
                                    var43.field4 = var9;
                                    var43.field2 = var9.field2872;
                                    field471.method3616(var43);
                                }
                                if (var9.field2809 != null && field285 > var9.field2924) {
                                    if (var9.field2900 == null || field285 - var9.field2924 > 32) {
                                        class1 var48 = new class1();
                                        var48.field4 = var9;
                                        var48.field2 = var9.field2809;
                                        field328.method3616(var48);
                                    } else {
                                        label500: for (int var44 = var9.field2924; var44 < field285; var44++) {
                                            int var45 = field457[var44 & 0x1F];
                                            for (int var46 = 0; var46 < var9.field2900.length; var46++) {
                                                if (var9.field2900[var46] == var45) {
                                                    class1 var47 = new class1();
                                                    var47.field4 = var9;
                                                    var47.field2 = var9.field2809;
                                                    field328.method3616(var47);
                                                    break label500;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2924 = field285;
                                }
                                if (var9.field2891 != null && field458 > var9.field2925) {
                                    if (var9.field2828 == null || field458 - var9.field2925 > 32) {
                                        class1 var53 = new class1();
                                        var53.field4 = var9;
                                        var53.field2 = var9.field2891;
                                        field328.method3616(var53);
                                    } else {
                                        label476: for (int var49 = var9.field2925; var49 < field458; var49++) {
                                            int var50 = field459[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2828.length; var51++) {
                                                if (var9.field2828[var51] == var50) {
                                                    class1 var52 = new class1();
                                                    var52.field4 = var9;
                                                    var52.field2 = var9.field2891;
                                                    field328.method3616(var52);
                                                    break label476;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2925 = field458;
                                }
                                if (var9.field2893 != null && field462 > var9.field2788) {
                                    if (var9.field2894 == null || field462 - var9.field2788 > 32) {
                                        class1 var58 = new class1();
                                        var58.field4 = var9;
                                        var58.field2 = var9.field2893;
                                        field328.method3616(var58);
                                    } else {
                                        label452: for (int var54 = var9.field2788; var54 < field462; var54++) {
                                            int var55 = field542[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2894.length; var56++) {
                                                if (var9.field2894[var56] == var55) {
                                                    class1 var57 = new class1();
                                                    var57.field4 = var9;
                                                    var57.field2 = var9.field2893;
                                                    field328.method3616(var57);
                                                    break label452;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2788 = field462;
                                }
                                if (field463 > var9.field2923 && var9.field2926 != null) {
                                    class1 var59 = new class1();
                                    var59.field4 = var9;
                                    var59.field2 = var9.field2926;
                                    field328.method3616(var59);
                                }
                                if (field549 > var9.field2923 && var9.field2790 != null) {
                                    class1 var60 = new class1();
                                    var60.field4 = var9;
                                    var60.field2 = var9.field2790;
                                    field328.method3616(var60);
                                }
                                if (field405 > var9.field2923 && var9.field2901 != null) {
                                    class1 var61 = new class1();
                                    var61.field4 = var9;
                                    var61.field2 = var9.field2901;
                                    field328.method3616(var61);
                                }
                                if (field466 > var9.field2923 && var9.field2802 != null) {
                                    class1 var62 = new class1();
                                    var62.field4 = var9;
                                    var62.field2 = var9.field2802;
                                    field328.method3616(var62);
                                }
                                if (field467 > var9.field2923 && var9.field2907 != null) {
                                    class1 var63 = new class1();
                                    var63.field4 = var9;
                                    var63.field2 = var9.field2907;
                                    field328.method3616(var63);
                                }
                                if (field468 > var9.field2923 && var9.field2902 != null) {
                                    class1 var64 = new class1();
                                    var64.field4 = var9;
                                    var64.field2 = var9.field2902;
                                    field328.method3616(var64);
                                }
                                var9.field2923 = field456;
                                if (var9.field2899 != null) {
                                    for (int var65 = 0; var65 < field494; var65++) {
                                        class1 var66 = new class1();
                                        var66.field4 = var9;
                                        var66.field8 = field279[var65];
                                        var66.field12 = field320[var65];
                                        var66.field2 = var9.field2899;
                                        field328.method3616(var66);
                                    }
                                }
                            }
                        }
                        if (!var9.field2795 && field541 == null && Statics.field702 == null && !field518) {
                            if ((var9.field2911 >= 0 || var9.field2823 != 0) && class144.field2214 >= var12 && class144.field2215 * 148505657 >= var13 && class144.field2214 < var14 && class144.field2215 * 148505657 < var15) {
                                if (var9.field2911 >= 0) {
                                    Statics.field198 = arg0[var9.field2911];
                                } else {
                                    Statics.field198 = var9;
                                }
                            }
                            if (var9.field2930 == 8 && class144.field2214 >= var12 && class144.field2215 * 148505657 >= var13 && class144.field2214 < var14 && class144.field2215 * 148505657 < var15) {
                                Statics.field643 = var9;
                            }
                            if (var9.field2820 > var9.field2878) {
                                method36(var9, var9.field2927 + var10, var11, var9.field2878, var9.field2820, class144.field2214, class144.field2215 * 148505657);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fh.cp(IIB)V")
    public static final void method3278(int arg0, int arg1) {
        if (class177.method2581(arg0)) {
            method112(Statics.field2815[arg0], arg1);
        }
    }

    @ObfuscatedName("x.cw([Lfn;II)V")
    public static final void method112(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2930 == 0) {
                    if (var3.field2920 != null) {
                        method112(var3.field2920, arg1);
                    }
                    class4 var4 = (class4) field536.method3595((long) var3.field2796);
                    if (var4 != null) {
                        method3278(var4.field67, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2903 != null) {
                    class1 var5 = new class1();
                    var5.field4 = var3;
                    var5.field2 = var3.field2903;
                    class39.method850(var5, 200000);
                }
                if (arg1 == 1 && var3.field2904 != null) {
                    if (var3.field2797 >= 0) {
                        class177 var6 = class177.method701(var3.field2796);
                        if (var6 == null || var6.field2920 == null || var3.field2797 >= var6.field2920.length || var6.field2920[var3.field2797] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field4 = var3;
                    var7.field2 = var3.field2904;
                    class39.method850(var7, 200000);
                }
            }
        }
    }

    @ObfuscatedName("hv.cj(Lfn;III)V")
    public static final void method3819(class177 arg0, int arg1, int arg2) {
        if (field541 != null || field518 || arg0 == null || method124(arg0) == null) {
            return;
        }
        field541 = arg0;
        field353 = method124(arg0);
        field446 = arg1;
        field447 = arg2;
        Statics.field1445 = 0;
        field455 = false;
        if (field413 <= 0) {
            return;
        }
        int var3 = field413 - 1;
        Statics.field3215 = new class33();
        Statics.field3215.field726 = field295[var3];
        Statics.field3215.field721 = field415[var3];
        Statics.field3215.field723 = field416[var3];
        Statics.field3215.field725 = field323[var3];
        Statics.field3215.field724 = field418[var3];
    }

    @ObfuscatedName("cm.dm(III)V")
    public static void method2132(int arg0, int arg1) {
        method1164(Statics.field3215, arg0, arg1);
        Statics.field3215 = null;
    }

    @ObfuscatedName("cn.di(Lfn;I)V")
    public static void method2034(class177 arg0) {
        if (field475 == arg0.field2928) {
            field461[arg0.field2814] = true;
        }
    }

    @ObfuscatedName("g.dz(B)V")
    public static void method45() {
        for (class4 var0 = (class4) field536.method3586(); var0 != null; var0 = (class4) field536.method3591()) {
            int var1 = var0.field67;
            if (class177.method2581(var1)) {
                boolean var2 = true;
                class177[] var3 = Statics.field2815[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2795;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3168;
                    class177 var6 = class177.method701(var5);
                    if (var6 != null) {
                        method2034(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.do(Lfn;I)Lfn;")
    public static class177 method124(class177 arg0) {
        class177 var1 = method2999(arg0);
        if (var1 == null) {
            var1 = arg0.field2871;
        }
        return var1;
    }

    @ObfuscatedName("cl.dg([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1858(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("dh.de(II)V")
    public static final void method2350(int arg0) {
        if (!class177.method2581(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2815[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3 != null) {
                var3.field2918 = 0;
                var3.field2865 = 0;
            }
        }
    }

    @ObfuscatedName("ge.du([Lfn;II)V")
    public static final void method3539(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null && var3.field2837 == arg1 && (!var3.field2795 || !method658(var3))) {
                if (var3.field2930 == 0) {
                    if (!var3.field2795 && method658(var3) && Statics.field198 != var3) {
                        continue;
                    }
                    method3539(arg0, var3.field2796);
                    if (var3.field2920 != null) {
                        method3539(var3.field2920, var3.field2796);
                    }
                    class4 var4 = (class4) field536.method3595((long) var3.field2796);
                    if (var4 != null) {
                        int var5 = var4.field67;
                        if (class177.method2581(var5)) {
                            method3539(Statics.field2815[var5], -1);
                        }
                    }
                }
                if (var3.field2930 == 6) {
                    if (var3.field2832 != -1 || var3.field2844 != -1) {
                        boolean var6 = method1237(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2844;
                        } else {
                            var7 = var3.field2832;
                        }
                        if (var7 != -1) {
                            class45 var8 = class45.method637(var7);
                            var3.field2865 += field330;
                            while (var3.field2865 > var8.field1012[var3.field2918]) {
                                var3.field2865 -= var8.field1012[var3.field2918];
                                var3.field2918++;
                                if (var3.field2918 >= var8.field1010.length) {
                                    var3.field2918 -= var8.field1014;
                                    if (var3.field2918 < 0 || var3.field2918 >= var8.field1010.length) {
                                        var3.field2918 = 0;
                                    }
                                }
                                method2034(var3);
                            }
                        }
                    }
                    if (var3.field2846 != 0 && !var3.field2795) {
                        int var9 = var3.field2846 >> 16;
                        int var10 = var3.field2846 << 16 >> 16;
                        int var11 = field330 * var9;
                        int var12 = field330 * var10;
                        var3.field2854 = var3.field2854 + var11 & 0x7FF;
                        var3.field2848 = var3.field2848 + var12 & 0x7FF;
                        method2034(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.ds(IB)V")
    public static final void method37(int arg0) {
        method45();
        class25.method2219();
        int var1 = class57.method42(arg0).field1235;
        if (var1 == 0) {
            return;
        }
        int var2 = class180.field2950[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class95.method2037(0.9D);
                ((class99) Statics.field1658).method2120(0.9D);
            }
            if (var2 == 2) {
                class95.method2037(0.8D);
                ((class99) Statics.field1658).method2120(0.8D);
            }
            if (var2 == 3) {
                class95.method2037(0.7D);
                ((class99) Statics.field1658).method2120(0.7D);
            }
            if (var2 == 4) {
                class95.method2037(0.6D);
                ((class99) Statics.field1658).method2120(0.6D);
            }
            class56.field1181.method3553();
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
            if (field508 != var3) {
                if (field508 == 0 && field444 != -1) {
                    Statics.method2984(Statics.field815, field444, 0, var3, false);
                    field533 = false;
                } else if (var3 == 0) {
                    class187.method935();
                    field533 = false;
                } else {
                    class187.method1672(var3);
                }
                field508 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field511 = 127;
            }
            if (var2 == 1) {
                field511 = 96;
            }
            if (var2 == 2) {
                field511 = 64;
            }
            if (var2 == 3) {
                field511 = 32;
            }
            if (var2 == 4) {
                field511 = 0;
            }
        }
        if (var1 == 5) {
            field529 = var2;
        }
        if (var1 == 6) {
            field430 = var2;
        }
        if (var1 == 9) {
            field434 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field512 = 127;
            }
            if (var2 == 1) {
                field512 = 96;
            }
            if (var2 == 2) {
                field512 = 64;
            }
            if (var2 == 3) {
                field512 = 32;
            }
            if (var2 == 4) {
                field512 = 0;
            }
        }
        if (var1 == 17) {
            field464 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field299 = (class22) class113.method78(class22.method113(), var2);
            if (field299 == null) {
                field299 = class22.field571;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field345 = -1;
            } else {
                field345 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field356 = (class22) class113.method78(class22.method113(), var2);
            if (field356 == null) {
                field356 = class22.field571;
            }
        }
    }

    @ObfuscatedName("cl.df(Lfn;I)V")
    public static final void method1859(class177 arg0) {
        int var1 = arg0.field2800;
        if (var1 == 324) {
            if (field545 == -1) {
                field545 = arg0.field2850;
                field490 = arg0.field2867;
            }
            if (field517.field2975) {
                arg0.field2850 = field545;
            } else {
                arg0.field2850 = field490;
            }
        } else if (var1 == 325) {
            if (field545 == -1) {
                field545 = arg0.field2850;
                field490 = arg0.field2867;
            }
            if (field517.field2975) {
                arg0.field2850 = field490;
            } else {
                arg0.field2850 = field545;
            }
        } else if (var1 == 327) {
            arg0.field2854 = 150;
            arg0.field2848 = (int) (Math.sin((double) field283 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2787 = 5;
            arg0.field2840 = 0;
        } else if (var1 == 328) {
            arg0.field2854 = 150;
            arg0.field2848 = (int) (Math.sin((double) field283 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2787 = 5;
            arg0.field2840 = 1;
        }
    }

    @ObfuscatedName("r.dr(I)V")
    public static final void method94() {
        field314.method2639(164);
        for (class4 var0 = (class4) field536.method3586(); var0 != null; var0 = (class4) field536.method3591()) {
            if (var0.field65 == 0 || var0.field65 == 3) {
                method2837(var0, true);
            }
        }
        if (field403 != null) {
            method2034(field403);
            field403 = null;
        }
    }

    @ObfuscatedName("n.dw(IIIB)Lo;")
    public static final class4 method567(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field67 = arg1;
        var3.field65 = arg2;
        field536.method3588(var3, (long) arg0);
        method2350(arg1);
        class177 var4 = class177.method701(arg0);
        method2034(var4);
        if (field403 != null) {
            method2034(field403);
            field403 = null;
        }
        method2868();
        method542(Statics.field2815[arg0 >> 16], var4, false);
        class39.method2212(arg1);
        if (field431 != -1) {
            method3278(field431, 1);
        }
        return var3;
    }

    @ObfuscatedName("ep.dp(Lo;ZB)V")
    public static final void method2837(class4 arg0, boolean arg1) {
        int var2 = arg0.field67;
        int var3 = (int) arg0.field3168;
        arg0.method3729();
        if (arg1 && var2 != -1 && Statics.field3210[var2]) {
            Statics.field2890.method3083(var2);
            if (Statics.field2815[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2815[var2].length; var5++) {
                    if (Statics.field2815[var2][var5] != null) {
                        if (Statics.field2815[var2][var5].field2930 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2815[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2815[var2] = null;
                }
                Statics.field3210[var2] = false;
            }
        }
        method33(var2);
        class177 var6 = class177.method701(var3);
        if (var6 != null) {
            method2034(var6);
        }
        method2868();
        if (field431 != -1) {
            method3278(field431, 1);
        }
    }

    @ObfuscatedName("dm.dl(Lfn;I)Z")
    public static final boolean method2211(class177 arg0) {
        int var1 = arg0.field2800;
        if (var1 == 205) {
            field324 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field517.method3312(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field517.method3333(var4, var5 == 1);
        }
        if (var1 == 324) {
            field517.method3315(false);
        }
        if (var1 == 325) {
            field517.method3315(true);
        }
        if (var1 == 326) {
            field314.method2639(151);
            field517.method3341(field314);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ff.dh(Lfn;IIII)V")
    public static final void method3218(class177 arg0, int arg1, int arg2, int arg3) {
        class179 var4 = arg0.method3230(false);
        if (var4 == null) {
            return;
        }
        if (field507 < 3) {
            Statics.field3216.method1703(arg1, arg2, var4.field2949, var4.field2939, 25, 25, field358, 256, var4.field2942, var4.field2941);
        } else {
            class83.method1784(arg1, arg2, 0, var4.field2942, var4.field2941);
        }
    }

    @ObfuscatedName("de.dk(IIIILcz;Lfh;S)V")
    public static final void method2294(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1143(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field358 + field343 & 0x7FF;
        int var8 = class95.field1661[var7];
        int var9 = class95.field1662[var7];
        int var10 = var8 * 256 / (field485 + 256);
        int var11 = var9 * 256 / (field485 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1429.method1704(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("bs.da(IIIILcz;Lfh;I)V")
    public static final void method1143(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field358 + field343 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class95.field1661[var6];
        int var9 = class95.field1662[var6];
        int var10 = var8 * 256 / (field485 + 256);
        int var11 = var9 * 256 / (field485 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1702(arg5.field2949 / 2 + var12 - arg4.field1476 / 2, arg5.field2939 / 2 - var13 - arg4.field1482 / 2, arg0, arg1, arg5.field2949, arg5.field2939, arg5.field2942, arg5.field2941);
        } else {
            arg4.method1692(arg5.field2949 / 2 + arg0 + var12 - arg4.field1476 / 2, arg5.field2939 / 2 + arg1 - var13 - arg4.field1482 / 2);
        }
    }

    @ObfuscatedName("fp.dd(Ljava/lang/String;ZB)Z")
    public static boolean method3016(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class168.method570(arg0, Statics.field2118);
        for (int var3 = 0; var3 < field538; var3++) {
            if (var2.equalsIgnoreCase(class168.method570(field274[var3].field230, Statics.field2118)) && (!arg1 || field274[var3].field224 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class168.method570(Statics.field2011.field44, Statics.field2118))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bi.dn(Ljava/lang/String;I)Z")
    public static boolean method1084(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class168.method570(arg0, Statics.field2118);
        for (int var2 = 0; var2 < field544; var2++) {
            class8 var3 = field385[var2];
            if (var1.equalsIgnoreCase(class168.method570(var3.field121, Statics.field2118))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class168.method570(var3.field123, Statics.field2118))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("r.dj(Ljava/lang/String;I)V")
    public static final void method93(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field538 < 200 || field550 == 1) || field538 >= 400) {
            class12.method1270(30, "", class161.field2533);
            return;
        }
        String var1 = class168.method570(arg0, Statics.field2118);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field538; var2++) {
            class18 var3 = field274[var2];
            String var4 = class168.method570(var3.field230, Statics.field2118);
            if (var4 != null && var4.equals(var1)) {
                class12.method1270(30, "", arg0 + class161.field2534);
                return;
            }
            if (var3.field225 != null) {
                String var5 = class168.method570(var3.field225, Statics.field2118);
                if (var5 != null && var5.equals(var1)) {
                    class12.method1270(30, "", arg0 + class161.field2534);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field544; var6++) {
            class8 var7 = field385[var6];
            String var8 = class168.method570(var7.field121, Statics.field2118);
            if (var8 != null && var8.equals(var1)) {
                class12.method1270(30, "", class161.field2539 + arg0 + class161.field2594);
                return;
            }
            if (var7.field123 != null) {
                String var9 = class168.method570(var7.field123, Statics.field2118);
                if (var9 != null && var9.equals(var1)) {
                    class12.method1270(30, "", class161.field2539 + arg0 + class161.field2594);
                    return;
                }
            }
        }
        if (class168.method570(Statics.field2011.field44, Statics.field2118).equals(var1)) {
            class12.method1270(30, "", class161.field2537);
        } else {
            field314.method2639(73);
            field314.method2399(class123.method1584(arg0));
            field314.method2405(arg0);
        }
    }

    @ObfuscatedName("w.dc(Ljava/lang/String;B)V")
    public static final void method9(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class168.method570(arg0, Statics.field2118);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field538; var2++) {
            class18 var3 = field274[var2];
            String var4 = var3.field230;
            String var5 = class168.method570(var4, Statics.field2118);
            if (class133.method2693(arg0, var1, var4, var5)) {
                field538--;
                for (int var6 = var2; var6 < field538; var6++) {
                    field274[var6] = field274[var6 + 1];
                }
                field549 = field456;
                field314.method2639(234);
                field314.method2399(class123.method1584(arg0));
                field314.method2405(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("br.dv(Ljava/lang/String;I)V")
    public static final void method1075(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class168.method570(arg0, Statics.field2118);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field544; var2++) {
            class8 var3 = field385[var2];
            String var4 = var3.field121;
            String var5 = class168.method570(var4, Statics.field2118);
            if (class133.method2693(arg0, var1, var4, var5)) {
                field544--;
                for (int var6 = var2; var6 < field544; var6++) {
                    field385[var6] = field385[var6 + 1];
                }
                field549 = field456;
                field314.method2639(81);
                field314.method2399(class123.method1584(arg0));
                field314.method2405(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("m.dx(I)V")
    public static final void method2() {
        field314.method2639(214);
        field314.method2399(0);
    }

    @ObfuscatedName("e.dt(II)V")
    public static void method33(int arg0) {
        for (class205 var1 = (class205) field473.method3586(); var1 != null; var1 = (class205) field473.method3591()) {
            if ((long) arg0 == (var1.field3168 >> 48 & 0xFFFFL)) {
                var1.method3729();
            }
        }
    }

    @ObfuscatedName("u.dy(Lfn;I)I")
    public static int method143(class177 arg0) {
        class205 var1 = (class205) field473.method3595(((long) arg0.field2796 << 32) + (long) arg0.field2797);
        return var1 == null ? arg0.field2868 : var1.field3153;
    }

    @ObfuscatedName("fj.db(Lfn;I)Lfn;")
    public static class177 method2999(class177 arg0) {
        int var1 = method143(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class177.method701(arg0.field2837);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("aa.dq(Lfn;B)Z")
    public static boolean method658(class177 arg0) {
        if (field441) {
            if (method143(arg0) != 0) {
                return false;
            }
            if (arg0.field2930 == 0) {
                return false;
            }
        }
        return arg0.field2816;
    }

    @ObfuscatedName("v.ec(Lfn;II)Ljava/lang/String;")
    public static String method123(class177 arg0, int arg1) {
        if (!class182.method2964(method143(arg0), arg1) && arg0.field2896 == null) {
            return null;
        } else if (arg0.field2813 == null || arg0.field2813.length <= arg1 || arg0.field2813[arg1] == null || arg0.field2813[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2813[arg1];
        }
    }

    @ObfuscatedName("fa.ee(Lfn;I)Ljava/lang/String;")
    public static String method3163(class177 arg0) {
        if (class182.method590(method143(arg0)) == 0) {
            return null;
        } else if (arg0.field2875 == null || arg0.field2875.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2875;
        }
    }

    @ObfuscatedName("fb.eb(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method3271(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field276 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field276 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field276 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field276 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field276 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1840 != null) {
            var3 = "/p=" + Statics.field1840;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field534 + "/a=" + Statics.field797 + var3 + "/";
    }
}
